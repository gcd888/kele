<template>
  <view class="section">
    <view class="toolbar">
      <text class="toolbar__hint">与 Cloudflare Cron 配置一致（wrangler.toml）；慢任务后台执行，触发后可到概览核对数据变化</text>
    </view>
    <view class="card table">
      <view class="table__row table__row--head cron-grid">
        <text>任务</text><text>说明</text><text>执行周期</text><text>执行说明</text><text>操作</text>
      </view>
      <view v-if="!tasks.length" class="table__empty"><text>加载中...</text></view>
      <view v-for="t in tasks" :key="t.key" class="table__row cron-grid">
        <text class="cell-strong">{{ t.name }}</text>
        <text class="cell-wrap">{{ t.description }}</text>
        <text class="cron-expr">{{ t.cron }}</text>
        <text class="cron-desc">{{ describeCron(t.cron) }}</text>
        <view class="cell-actions">
          <text
            class="cell-link"
            :class="{ 'cell-link--disabled': running === t.key }"
            @tap="runTask(t)"
          >{{ running === t.key ? '执行中...' : '立即执行' }}</text>
        </view>
      </view>
    </view>
    <text v-if="runMsg" class="inline-msg" :class="{ 'cell-bad': runFail }">{{ runMsg }}</text>
  </view>
</template>

<script setup lang="ts">
import { onMounted, ref } from 'vue';
import { request } from '../../../api/client';
import type { CronTask } from '../../../types';

const emit = defineEmits<{ (e: 'loaded'): void; (e: 'changed'): void }>();

const tasks = ref<CronTask[]>([]);
const running = ref('');
const runMsg = ref('');
const runFail = ref(false);

/* ---------- cron 动态中文解释器 ---------- */

const WEEK_CN = ['周日', '周一', '周二', '周三', '周四', '周五', '周六'];
const pad = (n: number) => String(n).padStart(2, '0');

/** 字段 → 数值集合；含通配无法枚举时返回 null，格式非法返回 null */
function parseField(field: string, min: number, max: number): number[] | null {
  const out = new Set<number>();
  for (const part of field.split(',')) {
    const [range, stepStr] = part.split('/');
    const step = stepStr ? parseInt(stepStr, 10) : 1;
    let start: number, end: number;
    if (range === '*') { start = min; end = max; }
    else if (range.includes('-')) {
      const seg = range.split('-');
      start = parseInt(seg[0], 10); end = parseInt(seg[1], 10);
    } else {
      start = end = parseInt(range, 10);
    }
    if (Number.isNaN(start) || Number.isNaN(end) || !step || start < min || end > max || start > end) return null;
    for (let v = start; v <= end; v += step) out.add(v);
  }
  return [...out].sort((a, b) => a - b);
}

/**
 * 解析 5 段 cron（分 时 日 月 周）为中文描述，超出可解释范围回退原文。
 * '0 0 * * *' → 每天 00:00；'30 0,12 * * *' → 每天 00:30、12:30
 * '15 * * * *' → 每小时第 15 分；'0 9 * * 1-5' → 工作日 09:00
 */
function describeCron(expr: string): string {
  const parts = expr.trim().split(/\s+/);
  if (parts.length !== 5) return expr;
  const [minF, hourF, domF, monF, dowF] = parts;
  const mins = minF === '*' ? null : parseField(minF, 0, 59);
  const hours = hourF === '*' ? null : parseField(hourF, 0, 23);
  if (minF !== '*' && mins === null) return expr;

  // 频率前缀（日/月/周维度）
  let prefix = '';
  if (monF === '*' && domF === '*' && dowF === '*') prefix = '每天';
  else if (monF === '*' && domF === '*') {
    const dows = parseField(dowF, 0, 7);
    if (!dows) return expr;
    prefix = dows.length === 7 ? '每天'
      : dows.join() === '1,2,3,4,5' ? '工作日'
      : dows.length === 1 ? '每' + WEEK_CN[dows[0] % 7]
      : '每' + dows.map((d) => WEEK_CN[d % 7]).join('、');
  } else if (monF === '*' && /^\d+$/.test(domF)) {
    prefix = `每月 ${parseInt(domF, 10)} 日`;
  } else return expr;

  // 时刻描述
  let time: string;
  if (hours === null) {
    if (minF === '*') time = '每分钟';
    else if (minF.startsWith('*/')) time = `每隔 ${minF.slice(2)} 分钟`;
    else if (mins && mins.length === 1) time = `每小时第 ${pad(mins[0])} 分`;
    else time = `每小时第 ${minF} 分`;
  } else if (minF === '*') {
    time = hours.length === 1 ? `${pad(hours[0])}:00 - ${pad(hours[0])}:59 每分钟` : '每小时整点时段';
  } else if (mins) {
    const combos: string[] = [];
    for (const h of hours) for (const m of mins) combos.push(`${pad(h)}:${pad(m)}`);
    const shown = combos.slice(0, 5);
    time = shown.join('、') + (combos.length > shown.length ? ` 等 ${combos.length} 个时刻` : '');
  } else {
    time = `${hourF} 点第 ${minF} 分`;
  }
  // 每小时/每分钟级别本身已含频率，不再叠加「每天」
  if (hours === null && prefix === '每天') return time;
  return prefix ? `${prefix} ${time}` : time;
}

async function loadTasks() {
  try {
    tasks.value = (await request<CronTask[]>('/admin/cron-tasks')) || [];
  } finally {
    emit('loaded');
  }
}

async function runTask(t: CronTask) {
  if (running.value) return;
  running.value = t.key;
  runMsg.value = '任务「' + t.name + '」触发中...';
  runFail.value = false;
  try {
    const r = await request<{ mode: string }>('/admin/cron-tasks/' + t.key + '/run', { method: 'POST' });
    if (r.mode === 'background') {
      runMsg.value = '「' + t.name + '」已后台启动，耗时较长，稍后可刷新概览核对数据';
    } else {
      runMsg.value = '「' + t.name + '」执行完成';
      emit('changed');
    }
  } catch (e) {
    runFail.value = true;
    runMsg.value = '触发失败：' + (e as Error).message;
  } finally {
    running.value = '';
  }
}

onMounted(loadTasks);
</script>

<style scoped>
.cron-grid {
  grid-template-columns: 0.9fr 1.7fr 0.85fr 1.05fr 0.7fr;
}

.cron-expr {
  font-family: monospace;
  font-size: 12px;
  color: var(--muted);
}

.cron-desc {
  font-size: 12px;
  color: var(--muted);
}
</style>

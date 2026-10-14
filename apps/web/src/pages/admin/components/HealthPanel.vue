<template>
  <view class="section">
    <view class="card table">
      <view class="table__row table__row--head health-grid">
        <text>名称</text><text>状态</text><text>连续失败</text><text>最近成功</text><text>延迟</text><text>熔断截止</text><text>操作</text>
      </view>
      <view v-if="!sources.length" class="table__empty"><text>暂无数据</text></view>
      <view v-for="s in sources" :key="s.id" class="table__row health-grid">
        <text class="cell-strong">{{ s.name }}</text>
        <text class="cell-badge" :class="healthCls(s)">{{ healthLabel(s) }}</text>
        <text :class="{ 'cell-bad': s.fail_count > 0 }">{{ s.fail_count }}</text>
        <text>{{ timeAgo(s.last_ok_at) }}</text>
        <text>{{ s.last_latency_ms != null ? s.last_latency_ms + ' ms' : '-' }}</text>
        <text>{{ s.disabled_until ? s.disabled_until.slice(5, 16) : '-' }}</text>
        <view class="cell-actions">
          <text v-if="s.enabled === 0" class="cell-link" @tap="recoverSource(s)">恢复</text>
          <text class="cell-link" @tap="testHealthRow(s)">单源测试</text>
        </view>
      </view>
    </view>
    <text v-if="healthTestMsg" class="inline-msg" :class="{ 'cell-bad': healthTestFail }">{{ healthTestMsg }}</text>
  </view>
</template>

<script setup lang="ts">
import { onMounted, ref } from 'vue';
import { request } from '../../../api/client';
import type { ApiConfigEntity, SourceTestResult } from '../../../types';
import { timeAgo } from '../../../utils/cloud';

const emit = defineEmits<{ (e: 'loaded'): void; (e: 'changed'): void }>();

const sources = ref<ApiConfigEntity[]>([]);
const healthTestMsg = ref('');
const healthTestFail = ref(false);

function toast(t: string) {
  uni.showToast({ title: t, icon: 'none', duration: 2200 });
}

async function loadSources() {
  try {
    sources.value = (await request<ApiConfigEntity[]>('/admin/sources')) || [];
  } catch (e) {
    toast((e as Error)?.message || '健康度加载失败');
  } finally {
    emit('loaded');
  }
}

function healthLabel(s: ApiConfigEntity): string {
  if (s.status === 0) return '停用';
  if (s.enabled === 0) return '熔断';
  return '正常';
}

function healthCls(s: ApiConfigEntity): string {
  if (s.status === 0) return 'cell-badge--off';
  if (s.enabled === 0) return 'cell-badge--bad';
  return 'cell-badge--ok';
}

async function recoverSource(s: ApiConfigEntity) {
  try {
    await request('/admin/sources/' + s.id + '/recover', { method: 'POST' });
    toast('已恢复：' + s.name);
    loadSources();
    emit('changed');
  } catch (e) {
    toast((e as Error)?.message || '恢复失败');
  }
}

/** 单源测试：真实请求并展示条数/延迟/错误 */
async function testHealthRow(s: ApiConfigEntity) {
  healthTestMsg.value = '正在测试源「' + s.name + '」...';
  healthTestFail.value = false;
  try {
    const r = await request<SourceTestResult>('/admin/sources/' + s.id + '/test', { method: 'POST' });
    if (r.ok) {
      const sample = r.sample?.length ? '，样例：' + r.sample[0] : '';
      healthTestMsg.value = `「${s.name}」连通成功：${r.count} 条结果，耗时 ${r.latencyMs}ms${sample}`;
    } else {
      healthTestFail.value = true;
      healthTestMsg.value = `「${s.name}」源可达但异常：${r.error || '未知错误'}（${r.latencyMs}ms）`;
    }
  } catch (e) {
    healthTestFail.value = true;
    healthTestMsg.value = '「' + s.name + '」测试失败：' + (e as Error).message;
  }
  loadSources();
}

onMounted(loadSources);

defineExpose({ reload: loadSources });
</script>

<style scoped>
.health-grid {
  grid-template-columns: 1.2fr 0.8fr 0.8fr 1fr 0.8fr 1.1fr 1.2fr;
}
</style>

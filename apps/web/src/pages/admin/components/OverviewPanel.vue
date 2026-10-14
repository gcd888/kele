<template>
  <view class="section">
    <view class="stat-grid">
      <view class="card stat">
        <text class="stat__num">{{ s ? s.resources.total : '-' }}</text>
        <text class="stat__label">资源总数</text>
      </view>
      <view class="card stat">
        <text class="stat__num stat__num--ok">{{ s ? s.validity.valid : '-' }}</text>
        <text class="stat__label">有效资源</text>
      </view>
      <view class="card stat">
        <text class="stat__num stat__num--bad">{{ s ? s.validity.invalid : '-' }}</text>
        <text class="stat__label">失效资源</text>
      </view>
      <view class="card stat">
        <text class="stat__num stat__num--warn">{{ s ? s.validity.pending : '-' }}</text>
        <text class="stat__label">待校验</text>
      </view>
      <view class="card stat">
        <text class="stat__num">{{ s ? s.todaySearches : '-' }}</text>
        <text class="stat__label">今日搜索</text>
      </view>
      <view class="card stat">
        <text class="stat__num">{{ s ? s.doubanItems : '-' }}</text>
        <text class="stat__label">热播条目</text>
      </view>
      <view class="card stat">
        <text class="stat__num">{{ s ? s.sources.total : '-' }}</text>
        <text class="stat__label">源总数</text>
      </view>
      <view class="card stat">
        <text class="stat__num stat__num--ok">{{ s ? s.sources.active : '-' }}</text>
        <text class="stat__label">活跃源</text>
      </view>
      <view class="card stat">
        <text class="stat__num stat__num--bad">{{ s ? s.sources.circuitBroken : '-' }}</text>
        <text class="stat__label">熔断源</text>
      </view>
      <view class="card stat">
        <text class="stat__num stat__num--muted">{{ s ? s.sources.manualDisabled : '-' }}</text>
        <text class="stat__label">手动停用</text>
      </view>
    </view>

    <!-- 待校验资源按网盘类型分布 -->
    <view class="card pending-card">
      <text class="pending-card__title">待校验分布（按网盘类型）</text>
      <template v-if="pendingEntries.length">
        <view v-for="[type, n] in pendingEntries" :key="type" class="pending-row">
          <text class="pending-row__type">{{ typeLabel(type) }}</text>
          <view class="pending-row__bar">
            <view class="pending-row__fill" :style="{ width: barWidth(n) }"></view>
          </view>
          <text class="pending-row__num">{{ n }}</text>
        </view>
        <text class="pending-card__hint">由每小时兜底任务与用户搜索补检逐步消化</text>
      </template>
      <text v-else class="pending-card__hint">暂无待校验资源</text>
    </view>
  </view>
</template>

<script setup lang="ts">
import { computed, onMounted, ref } from 'vue';
import { request } from '../../../api/client';
import type { AdminStats } from '../../../types';

const emit = defineEmits<{ (e: 'loaded'): void }>();

const s = ref<AdminStats | null>(null);

const pendingEntries = computed(() => Object.entries(s.value?.pendingByType || {}).sort((a, b) => b[1] - a[1]));
const maxPending = computed(() => Math.max(1, ...pendingEntries.value.map(([, n]) => n)));

const CLOUD_LABELS: Record<string, string> = {
  quark: '夸克', baidu: '百度', aliyun: '阿里', uc: 'UC', xunlei: '迅雷',
  tianyi: '天翼', other: '其他',
};

function typeLabel(t: string): string {
  return CLOUD_LABELS[t] || t;
}

function barWidth(n: number): string {
  return Math.max(4, Math.round((n / maxPending.value) * 100)) + '%';
}

onMounted(async () => {
  try {
    s.value = await request<AdminStats>('/admin/stats');
  } finally {
    emit('loaded');
  }
});

defineExpose({ reload: async () => { s.value = await request<AdminStats>('/admin/stats'); } });
</script>

<style scoped>
.pending-card {
  margin-top: 14px;
  padding: 14px 16px;
}

.pending-card__title {
  display: block;
  font-size: 14px;
  font-weight: 600;
  color: var(--text);
  margin-bottom: 10px;
}

.pending-card__hint {
  display: block;
  margin-top: 8px;
  font-size: 12px;
  color: var(--muted);
}

.pending-row {
  display: grid;
  grid-template-columns: 56px 1fr 48px;
  align-items: center;
  gap: 10px;
  padding: 4px 0;
}

.pending-row__type {
  font-size: 13px;
  color: var(--text);
}

.pending-row__bar {
  height: 8px;
  border-radius: 999px;
  background: var(--input-bg);
  overflow: hidden;
}

.pending-row__fill {
  height: 100%;
  border-radius: 999px;
  background: var(--primary);
  transition: width 0.4s ease;
}

.pending-row__num {
  font-size: 12px;
  color: var(--muted);
  text-align: right;
}
</style>

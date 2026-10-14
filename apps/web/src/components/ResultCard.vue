<template>
  <view class="rc card">
    <view class="rc__head" @tap="goDetail">
      <view class="rc__badge" :style="{ color: badgeColor, backgroundColor: badgeBg }">
        {{ badgeLabel }}
      </view>
      <text class="rc__title">{{ item.title || '未命名资源' }}</text>
      <view class="rc__status" :class="validityCls(item.validity)">{{ validityLabel(item.validity) }}</view>
    </view>

    <view v-if="item.tags && item.tags.length" class="rc__tags" @tap="goDetail">
      <text v-for="t in item.tags" :key="t" class="rc__tag">{{ t }}</text>
    </view>

    <text v-if="item.note" class="rc__note" @tap="goDetail">{{ item.note }}</text>

    <view class="rc__foot">
      <text class="rc__source">来源：{{ item.source_id || '未知' }}</text>
      <text v-if="item.passcode" class="rc__passcode">提取码：{{ item.passcode }}</text>
    </view>

    <view class="rc__actions">
      <view class="btn btn--primary btn--sm" @tap="copyLink">复制链接</view>
      <view v-if="item.passcode" class="btn btn--sm" @tap="copyCode">复制提取码</view>
      <view v-if="canReport && !item.reported" class="btn btn--danger btn--sm" @tap="report">报失效</view>
    </view>
  </view>
</template>

<script setup lang="ts">
import { computed } from 'vue';
import type { SearchItemView } from '../utils/cloud';
import { cloudColor, cloudLabel, validityCls, validityLabel } from '../utils/cloud';
import { copyText } from '../utils/clipboard';
import { request } from '../api/client';

const props = defineProps<{ item: SearchItemView }>();

const badgeLabel = computed(() => cloudLabel(props.item.cloud_type));
const badgeColor = computed(() => cloudColor(props.item.cloud_type));
const badgeBg = computed(() => cloudColor(props.item.cloud_type) + '1f');

/** 报失效需 resource_id，仅缓存命中条目可用 */
const canReport = computed(() => !!props.item.id);

function toast(title: string) {
  uni.showToast({ title, icon: 'none', duration: 2200 });
}

async function copyLink() {
  const ok = await copyText(props.item.url || '');
  if (!ok) {
    toast('复制失败，请长按链接手动复制');
    return;
  }
  toast(props.item.passcode ? '链接已复制，请再点"复制提取码"' : '链接已复制');
}

async function copyCode() {
  const ok = await copyText(props.item.passcode || '');
  toast(ok ? '提取码已复制' : '复制失败');
}

async function report() {
  if (!props.item.id) return;
  try {
    await request('/resource/report', {
      method: 'POST',
      data: { resource_id: props.item.id, url: props.item.url },
    });
    props.item.reported = true;
    toast('已提交失效反馈，感谢');
  } catch (e) {
    toast((e as Error).message || '提交失败');
  }
}

function goDetail() {
  const p = props.item;
  const q: string[] = [
    'title=' + encodeURIComponent(p.title || ''),
    'url=' + encodeURIComponent(p.url || ''),
    'cloud_type=' + encodeURIComponent(p.cloud_type || 'other'),
    'source=' + encodeURIComponent(p.source_id || ''),
    'validity=' + encodeURIComponent(p.validity || 'unknown'),
  ];
  if (p.passcode) q.push('passcode=' + encodeURIComponent(p.passcode));
  if (p.note) q.push('note=' + encodeURIComponent(p.note));
  if (p.tags && p.tags.length) q.push('tags=' + encodeURIComponent(p.tags.join(',')));
  if (p.id) q.push('id=' + p.id);
  uni.navigateTo({ url: '/pages/detail/index?' + q.join('&') });
}
</script>

<style scoped>
.rc {
  padding: 13px 15px;
  margin-bottom: 0;
  animation: rc-in 0.28s cubic-bezier(0.22, 0.61, 0.36, 1) both;
  transition: transform 0.2s ease-out, box-shadow 0.2s ease-out, border-color 0.2s ease-out;
}

@keyframes rc-in {
  from {
    opacity: 0;
    transform: translateY(8px);
  }
  to {
    opacity: 1;
    transform: none;
  }
}

@media (prefers-reduced-motion: reduce) {
  .rc {
    animation: none;
  }
}

.rc__head {
  display: flex;
  align-items: flex-start;
  gap: 8px;
}

.rc__badge {
  flex-shrink: 0;
  padding: 2px 9px;
  border-radius: 8px;
  font-size: 12px;
  line-height: 18px;
  font-weight: 700;
  margin-top: 1px;
}

.rc__title {
  flex: 1;
  font-size: 15px;
  font-weight: 700;
  line-height: 1.4;
  color: var(--text);
  word-break: break-all;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.rc__status {
  flex-shrink: 0;
  margin-top: 1px;
}

.rc__tags {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
  margin-top: 8px;
}

.rc__tag {
  font-size: 11px;
  font-weight: 500;
  color: var(--primary-text);
  background: var(--primary-weak);
  border-radius: 6px;
  padding: 1px 7px;
}

.rc__note {
  display: -webkit-box;
  margin-top: 8px;
  font-size: 13px;
  color: var(--muted);
  word-break: break-all;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.rc__foot {
  display: flex;
  align-items: center;
  gap: 14px;
  margin-top: 10px;
  font-size: 12px;
  color: var(--muted);
}

.rc__passcode {
  font-weight: 600;
  color: var(--text);
  font-variant-numeric: tabular-nums;
}

.rc__actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  margin-top: 12px;
  padding-top: 11px;
  border-top: 1px dashed var(--border);
}

@media (hover: hover) {
  .rc:hover {
    transform: translateY(-2px);
    box-shadow: var(--shadow-lift);
    border-color: rgba(240, 74, 46, 0.3);
  }
}
</style>

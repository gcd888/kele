<template>
  <view class="page">
    <view class="page-wrap">
      <!-- 顶栏 -->
      <view class="topbar">
        <view class="back" @tap="goBack"><view class="back__arrow"></view></view>
        <text class="topbar__title">资源详情</text>
        <view class="topbar__spacer"></view>
      </view>

      <view class="card detail">
        <view class="detail__head">
          <view class="detail__badge" :style="{ color: badgeColor, backgroundColor: badgeColor + '1f' }">
            {{ badgeLabel }}
          </view>
          <view class="detail__status" :class="validityCls(validity)">{{ validityLabel(validity) }}</view>
        </view>

        <text class="detail__title">{{ title || '未命名资源' }}</text>

        <view class="detail__rows">
          <view class="detail__row">
            <text class="detail__label">分享链接</text>
            <text class="detail__value detail__value--url" @tap="copyLink">{{ url || '-' }}</text>
          </view>
          <view class="detail__row" v-if="passcode">
            <text class="detail__label">提取码</text>
            <text class="detail__value detail__value--code">{{ passcode }}</text>
          </view>
          <view class="detail__row" v-if="source">
            <text class="detail__label">来源</text>
            <text class="detail__value">{{ source }}</text>
          </view>
          <view class="detail__row" v-if="tags.length">
            <text class="detail__label">标签</text>
            <view class="detail__tags">
              <text v-for="t in tags" :key="t" class="detail__tag">{{ t }}</text>
            </view>
          </view>
          <view class="detail__row" v-if="note">
            <text class="detail__label">备注</text>
            <text class="detail__value">{{ note }}</text>
          </view>
        </view>

        <view class="detail__actions">
          <view class="btn btn--primary detail__main-btn" @tap="copyLink">复制链接</view>
          <view v-if="passcode" class="btn" @tap="copyCode">复制提取码</view>
          <view class="btn" @tap="openLink">打开网盘链接</view>
          <view
            class="btn detail__fav"
            :class="{ 'detail__fav--on': faved, 'btn--disabled': favLoading }"
            @tap="toggleFav"
          >
            {{ faved ? '★ 已收藏' : '☆ 收藏' }}
          </view>
        </view>

        <view class="detail__tip">
          <text>若链接失效可返回搜索页点"报失效"；资源仅供学习交流，请于 24 小时内删除。</text>
        </view>
      </view>
    </view>
  </view>
</template>

<script setup lang="ts">
import { onLoad } from '@dcloudio/uni-app';
import { computed, ref } from 'vue';
import { cloudColor, cloudLabel, validityCls, validityLabel } from '../../utils/cloud';
import { copyText } from '../../utils/clipboard';
import { addFavorite, isFavorite, removeFavorite } from '../../utils/storage';

const title = ref('');
const url = ref('');
const passcode = ref('');
const cloudType = ref('other');
const source = ref('');
const validity = ref('unknown');
const note = ref('');
const tags = ref<string[]>([]);

const faved = ref(false);
const favLoading = ref(false);

const badgeLabel = computed(() => cloudLabel(cloudType.value));
const badgeColor = computed(() => cloudColor(cloudType.value));

function toast(t: string) {
  uni.showToast({ title: t, icon: 'none', duration: 2200 });
}

async function copyLink() {
  const ok = await copyText(url.value);
  if (!ok) {
    toast('复制失败，请长按链接手动复制');
    return;
  }
  toast(passcode.value ? '链接已复制，请再点"复制提取码"' : '链接已复制');
}

async function copyCode() {
  const ok = await copyText(passcode.value);
  toast(ok ? '提取码已复制' : '复制失败');
}

function openLink() {
  if (!url.value) return;
  // #ifdef MP-WEIXIN
  copyText(url.value).then((ok) => {
    toast(ok ? '链接已复制，请在浏览器打开' : '复制失败');
  });
  // #endif
  // #ifndef MP-WEIXIN
  window.open(url.value, '_blank');
  // #endif
}

function toggleFav() {
  if (favLoading.value || !url.value) return;
  favLoading.value = true;
  if (faved.value) {
    removeFavorite(url.value);
    faved.value = false;
  } else {
    addFavorite({
      title: title.value,
      url: url.value,
      cloud_type: cloudType.value as never,
      passcode: passcode.value || undefined,
      note: note.value || undefined,
      tags: tags.value,
      source_id: source.value,
      validity: validity.value as never,
    });
    faved.value = true;
  }
  favLoading.value = false;
  toast(faved.value ? '已加入收藏' : '已取消收藏');
}

function goBack() {
  const pages = getCurrentPages();
  if (pages.length > 1) uni.navigateBack();
  else uni.reLaunch({ url: '/pages/home/index' });
}

onLoad((options) => {
  const o = (options || {}) as Record<string, string>;
  title.value = decodeURIComponent(o.title || '');
  url.value = decodeURIComponent(o.url || '');
  passcode.value = decodeURIComponent(o.passcode || '');
  cloudType.value = decodeURIComponent(o.cloud_type || 'other');
  source.value = decodeURIComponent(o.source || '');
  validity.value = decodeURIComponent(o.validity || 'unknown');
  note.value = decodeURIComponent(o.note || '');
  const rawTags = decodeURIComponent(o.tags || '');
  tags.value = rawTags ? rawTags.split(',').filter(Boolean) : [];
  faved.value = !!url.value && isFavorite(url.value);
});
</script>

<style scoped>
.page {
  min-height: 100vh;
}

.detail {
  padding: 20px;
  animation: kele-fade-up 0.4s cubic-bezier(0.22, 0.61, 0.36, 1) both;
}

.detail__head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-bottom: 12px;
}

.detail__badge {
  padding: 3px 11px;
  border-radius: 8px;
  font-size: 13px;
  font-weight: 700;
}

.detail__title {
  display: block;
  font-size: 20px;
  font-weight: 800;
  line-height: 1.4;
  color: var(--text);
  word-break: break-all;
  margin-bottom: 16px;
}

.detail__rows {
  display: flex;
  flex-direction: column;
  gap: 13px;
  padding: 15px 0;
  border-top: 1px dashed var(--border);
  border-bottom: 1px dashed var(--border);
}

.detail__row {
  display: flex;
  align-items: flex-start;
  gap: 12px;
}

.detail__label {
  flex-shrink: 0;
  width: 60px;
  font-size: 13px;
  color: var(--muted);
  line-height: 20px;
}

.detail__value {
  flex: 1;
  font-size: 14px;
  color: var(--text);
  word-break: break-all;
  line-height: 20px;
}

.detail__value--url {
  color: var(--primary-text);
  cursor: pointer;
  font-weight: 500;
}

.detail__value--code {
  font-weight: 700;
  letter-spacing: 2px;
  font-variant-numeric: tabular-nums;
}

.detail__tags {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.detail__tag {
  font-size: 12px;
  font-weight: 500;
  color: var(--primary-text);
  background: var(--primary-weak);
  border-radius: 6px;
  padding: 1px 9px;
}

.detail__actions {
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
  margin-top: 18px;
}

.detail__main-btn {
  flex: 1;
  min-width: 120px;
}

.detail__fav--on {
  color: #f59e0b;
  border-color: rgba(245, 158, 11, 0.45);
  background: rgba(245, 158, 11, 0.08);
}

.detail__tip {
  margin-top: 16px;
  font-size: 12px;
  color: var(--muted);
  line-height: 1.6;
}
</style>

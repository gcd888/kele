<template>
  <view class="page">
    <view class="page-wrap">
      <!-- 顶栏 -->
      <view class="topbar">
        <view class="back" @tap="goBack"><view class="back__arrow"></view></view>
        <text class="topbar__title">我的</text>
        <view class="topbar__placeholder"></view>
      </view>

      <!-- 收藏 -->
      <view class="card section">
        <view class="section__head">
          <text class="section__title">收藏（{{ favorites.length }}）</text>
          <text v-if="favorites.length" class="section__action" @tap="clearAllFavs">清空</text>
        </view>
        <view v-if="favorites.length === 0" class="empty">
          <text class="empty__text">暂无收藏，搜索后可在详情页收藏资源</text>
        </view>
        <view v-for="f in favorites" :key="f.url" class="fav">
          <view class="fav__main" @tap="openFav(f)">
            <view class="fav__badge" :style="{ color: cloudColor(f.cloud_type), backgroundColor: cloudColor(f.cloud_type) + '1f' }">
              {{ cloudLabel(f.cloud_type) }}
            </view>
            <view class="fav__body">
              <text class="fav__title">{{ f.title || f.url }}</text>
              <view class="fav__meta">
                <text class="fav__valid" :class="validityCls(f.validity)">{{ validityLabel(f.validity) }}</text>
                <text v-if="f.passcode" class="fav__code">提取码 {{ f.passcode }}</text>
              </view>
            </view>
          </view>
          <text class="fav__del" @tap.stop="delFav(f.url)">删除</text>
        </view>
      </view>

      <!-- 搜索历史 -->
      <view class="card section">
        <view class="section__head">
          <text class="section__title">搜索历史（{{ history.length }}）</text>
          <text v-if="history.length" class="section__action" @tap="clearHis">清空</text>
        </view>
        <view v-if="history.length === 0" class="empty">
          <text class="empty__text">暂无搜索历史</text>
        </view>
        <view v-else class="tags">
          <view v-for="h in history" :key="h" class="tag" @tap="searchKw(h)">
            <text class="tag__text">{{ h }}</text>
            <text class="tag__x" @tap.stop="delHis(h)">×</text>
          </view>
        </view>
      </view>
    </view>
  </view>
</template>

<script setup lang="ts">
import { onShow } from '@dcloudio/uni-app';
import { ref } from 'vue';
import type { Resource } from '../../types';
import { cloudColor, cloudLabel, validityCls, validityLabel } from '../../utils/cloud';
import { clearHistory, getFavorites, getHistory, removeFavorite, removeHistory } from '../../utils/storage';

const favorites = ref<Resource[]>([]);
const history = ref<string[]>([]);

function refresh() {
  favorites.value = getFavorites();
  history.value = getHistory();
}
onShow(refresh);

function toast(t: string) {
  uni.showToast({ title: t, icon: 'none', duration: 2000 });
}

function openFav(f: Resource) {
  const q = (v?: string) => encodeURIComponent(v || '');
  const query = [
    'title=' + q(f.title),
    'url=' + q(f.url),
    'passcode=' + q(f.passcode),
    'cloud_type=' + q(f.cloud_type),
    'source=' + q(f.source_id),
    'validity=' + q(f.validity),
    'note=' + q(f.note),
    'tags=' + q((f.tags || []).join(',')),
  ].join('&');
  uni.navigateTo({ url: '/pages/detail/index?' + query });
}

function delFav(url: string) {
  removeFavorite(url);
  refresh();
  toast('已删除收藏');
}

function clearAllFavs() {
  uni.showModal({
    title: '清空收藏',
    content: '确定清空全部收藏吗？',
    success: (res) => {
      if (!res.confirm) return;
      for (const f of favorites.value) removeFavorite(f.url);
      refresh();
      toast('收藏已清空');
    },
  });
}

function searchKw(kw: string) {
  uni.reLaunch({ url: '/pages/search/index?kw=' + encodeURIComponent(kw) });
}

function delHis(kw: string) {
  removeHistory(kw);
  refresh();
}

function clearHis() {
  uni.showModal({
    title: '清空历史',
    content: '确定清空全部搜索历史吗？',
    success: (res) => {
      if (!res.confirm) return;
      clearHistory();
      refresh();
    },
  });
}

function goBack() {
  const pages = getCurrentPages();
  if (pages.length > 1) uni.navigateBack();
  else uni.reLaunch({ url: '/pages/index/index' });
}
</script>

<style scoped>
.page {
  min-height: 100vh;
}

.topbar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: calc(14px + var(--safe-top)) 0 14px;
}

.back {
  width: 34px;
  height: 34px;
  border-radius: 10px;
  border: 1px solid var(--border);
  background: var(--card);
  display: flex;
  align-items: center;
  justify-content: center;
}

.back__arrow {
  width: 9px;
  height: 9px;
  border-left: 2px solid var(--text);
  border-bottom: 2px solid var(--text);
  transform: rotate(45deg);
  margin-left: 3px;
}

.topbar__title {
  font-size: 16px;
  font-weight: 600;
  color: var(--text);
}

.topbar__placeholder {
  width: 34px;
}

.section {
  padding: 16px 18px;
  margin-bottom: 14px;
}

.section__head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-bottom: 12px;
}

.section__title {
  font-size: 15px;
  font-weight: 700;
  color: var(--text);
}

.section__action {
  font-size: 13px;
  color: var(--muted);
}

.empty {
  padding: 22px 0;
  text-align: center;
}

.empty__text {
  font-size: 13px;
  color: var(--muted);
}

.fav {
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 10px 0;
  border-top: 1px solid var(--border);
}

.fav__main {
  flex: 1;
  display: flex;
  align-items: flex-start;
  gap: 10px;
  min-width: 0;
}

.fav__badge {
  flex-shrink: 0;
  padding: 2px 8px;
  border-radius: 6px;
  font-size: 12px;
  font-weight: 600;
}

.fav__body {
  flex: 1;
  min-width: 0;
}

.fav__title {
  display: block;
  font-size: 14px;
  color: var(--text);
  word-break: break-all;
  line-height: 1.45;
}

.fav__meta {
  display: flex;
  align-items: center;
  gap: 10px;
  margin-top: 4px;
}

.fav__valid {
  font-size: 12px;
}

.fav__code {
  font-size: 12px;
  color: var(--muted);
}

.fav__del {
  flex-shrink: 0;
  font-size: 12px;
  color: var(--muted);
  padding: 4px 2px;
}

.tags {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.tag {
  display: flex;
  align-items: center;
  gap: 6px;
  padding: 5px 10px;
  border-radius: 8px;
  background: var(--primary-weak);
  max-width: 100%;
}

.tag__text {
  font-size: 13px;
  color: var(--text);
}

.tag__x {
  font-size: 14px;
  color: var(--muted);
}
</style>

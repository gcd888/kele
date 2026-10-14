<template>
  <view class="page">
    <view class="page-wrap">
      <!-- 顶栏 -->
      <view class="topbar">
        <view class="brand">
          <view class="brand__logo"><view class="brand__logo-dot"></view></view>
          <view class="brand__text">
            <text class="brand__name">可乐</text>
            <text class="brand__slogan">网盘资源聚合搜索</text>
          </view>
        </view>
        <view class="topbar__actions">
          <view class="theme-btn" @tap="onToggleTheme">
            <view class="theme-btn__icon" :class="dark ? 'theme-btn__icon--moon' : 'theme-btn__icon--sun'"></view>
            <text class="theme-btn__text">{{ dark ? '夜间' : '日间' }}</text>
          </view>
        </view>
      </view>

      <!-- 公告 -->
      <view v-if="notices.length" class="notice card">
        <text class="notice__pill">公告</text>
        <text class="notice__text">{{ notices[noticeIdx].content }}</text>
      </view>

      <!-- 搜索框 -->
      <view class="search-area card">
        <view class="search-box">
          <view class="search-box__icon"></view>
          <input
            v-model="inputKw"
            class="search-box__input"
            type="text"
            confirm-type="search"
            placeholder="搜索影视剧 / 综艺 / 资源关键词..."
            placeholder-class="search-box__ph"
            @confirm="goSearch"
          />
        </view>
        <view class="btn btn--primary search-area__btn" @tap="goSearch">搜索</view>
      </view>

      <!-- 热播推荐 -->
      <view class="section">
        <view class="section__head">
          <text class="section__title">热播推荐</text>
          <view class="section__tabs">
            <text
              v-for="t in trendTabs"
              :key="t.key"
              class="section__tab"
              :class="{ 'section__tab--active': activeTab === t.key }"
              @tap="switchTab(t.key)"
            >{{ t.label }}</text>
          </view>
        </view>

        <view v-if="trendLoading && !trendList.length" class="state-block">
          <view class="spinner"></view>
          <text class="state-block__hint">加载中...</text>
        </view>
        <view v-else-if="!trendList.length" class="state-block">
          <text class="state-block__hint">暂无热播数据</text>
        </view>
        <scroll-view v-else scroll-x class="trend-scroll" show-scrollbar="false">
          <view class="trend-row">
            <view
              v-for="it in trendList"
              :key="it.id"
              class="trend-card card"
              @tap="goSearch(it.title)"
            >
              <view class="trend-card__cover">
                <CoverImage :src="it.cover_url" :name="it.title" />
                <view v-if="it.rating_value > 0" class="trend-card__rating">{{ it.rating_value.toFixed(1) }}</view>
              </view>
              <text class="trend-card__title">{{ it.title }}</text>
              <text class="trend-card__sub">{{ it.year || '' }} {{ it.card_subtitle ? '· ' + it.card_subtitle : '' }}</text>
            </view>
          </view>
        </scroll-view>
      </view>

      <!-- 在线影视入口 -->
      <view class="tv-entry card" @tap="goTv">
        <view class="tv-entry__icon"><view class="tv-entry__play"></view></view>
        <view class="tv-entry__text">
          <text class="tv-entry__title">在线影视</text>
          <text class="tv-entry__sub">精选免费影视站点导航，免下载在线看</text>
        </view>
        <view class="tv-entry__arrow"></view>
      </view>

      <!-- #ifndef MP-WEIXIN -->
      <!-- 我的入口（小程序走 tabBar） -->
      <view class="tv-entry mine-entry card" @tap="goMine">
        <view class="tv-entry__icon"><text class="mine-entry__icon">★</text></view>
        <view class="tv-entry__text">
          <text class="tv-entry__title">我的</text>
          <text class="tv-entry__sub">本地收藏与搜索历史</text>
        </view>
        <view class="tv-entry__arrow"></view>
      </view>
      <!-- #endif -->

      <!-- 底部 -->
      <view class="footer">
        <text class="footer__link" @tap="goAbout">免责声明</text>
        <text class="footer__copy">本站不存储任何资源，结果来自第三方公开渠道</text>
      </view>
    </view>
  </view>
</template>

<script setup lang="ts">
import { computed, onMounted, onUnmounted, ref } from 'vue';
import CoverImage from '../../components/CoverImage.vue';
import { request } from '../../api/client';
import type { DoubanItemEntity, NoticeEntity } from '../../types';
import { isDark, toggleTheme } from '../../utils/theme';

const inputKw = ref('');
const dark = ref(isDark());

// ===== 公告 =====
const notices = ref<NoticeEntity[]>([]);
const noticeIdx = ref(0);
let noticeTimer: ReturnType<typeof setInterval> | null = null;

// ===== 热播推荐 =====
const trendTabs = [
  { key: 'tv', label: '剧集' },
  { key: 'movie', label: '电影' },
  { key: 'show', label: '综艺' },
];
const activeTab = ref('tv');
const trendMap = ref<Record<string, DoubanItemEntity[]>>({ tv: [], movie: [], show: [] });
const trendLoading = ref(false);
const trendList = computed(() => trendMap.value[activeTab.value] || []);

function switchTab(key: string) {
  activeTab.value = key;
  loadTrending(key);
}

async function loadTrending(category: string) {
  if ((trendMap.value[category] || []).length || trendLoading.value) return;
  trendLoading.value = true;
  try {
    const data = await request<DoubanItemEntity[]>('/trending?category=' + category + '&limit=30');
    trendMap.value = { ...trendMap.value, [category]: data || [] };
  } catch {
    trendMap.value = { ...trendMap.value, [category]: [] };
  } finally {
    trendLoading.value = false;
  }
}

async function loadNotices() {
  try {
    const data = await request<NoticeEntity[]>('/notices');
    notices.value = (data || []).filter((n) => n.status === 1);
    if (notices.value.length > 1) {
      noticeTimer = setInterval(() => {
        noticeIdx.value = (noticeIdx.value + 1) % notices.value.length;
      }, 4000);
    }
  } catch {
    notices.value = [];
  }
}

function onToggleTheme() {
  toggleTheme();
  dark.value = isDark();
}

function goSearch(kw?: string) {
  const q = (kw ?? inputKw.value).trim();
  if (!q) {
    uni.showToast({ title: '请输入搜索关键词', icon: 'none' });
    return;
  }
  inputKw.value = q;
  uni.navigateTo({ url: '/pages/search/index?kw=' + encodeURIComponent(q) });
}

function goTv() {
  // #ifdef MP-WEIXIN
  uni.switchTab({ url: '/pages/tv/index' });
  // #endif
  // #ifndef MP-WEIXIN
  uni.navigateTo({ url: '/pages/tv/index' });
  // #endif
}

function goMine() {
  uni.navigateTo({ url: '/pages/mine/index' });
}

function goAbout() {
  uni.navigateTo({ url: '/pages/about/index' });
}

onMounted(() => {
  loadNotices();
  loadTrending('tv');
});

onUnmounted(() => {
  if (noticeTimer) clearInterval(noticeTimer);
});
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

.brand {
  display: flex;
  align-items: center;
  gap: 10px;
}

.brand__logo {
  width: 38px;
  height: 38px;
  border-radius: 12px;
  background: linear-gradient(135deg, var(--primary), #7c3aed);
  display: flex;
  align-items: center;
  justify-content: center;
}

.brand__logo-dot {
  width: 12px;
  height: 12px;
  border-radius: 50%;
  background: #fff;
}

.brand__text {
  display: flex;
  flex-direction: column;
}

.brand__name {
  font-size: 20px;
  font-weight: 700;
  color: var(--text);
  line-height: 1.2;
}

.brand__slogan {
  font-size: 11px;
  color: var(--muted);
}

.theme-btn {
  display: flex;
  align-items: center;
  gap: 6px;
  padding: 6px 12px;
  border-radius: 999px;
  border: 1px solid var(--border);
  background: var(--card);
  cursor: pointer;
}

.theme-btn__icon {
  width: 12px;
  height: 12px;
  border-radius: 50%;
}

.theme-btn__icon--sun {
  background: #f59e0b;
}

.theme-btn__icon--moon {
  background: transparent;
  box-shadow: inset -3px 0 0 0 var(--text);
  transform: rotate(-45deg);
}

.theme-btn__text {
  font-size: 12px;
  color: var(--muted);
}

/* 公告 */
.notice {
  display: flex;
  align-items: center;
  gap: 8px;
  padding: 8px 12px;
  margin-bottom: 14px;
}

.notice__pill {
  flex-shrink: 0;
  font-size: 11px;
  color: var(--primary);
  background: var(--primary-weak);
  border-radius: 4px;
  padding: 1px 6px;
}

.notice__text {
  font-size: 13px;
  color: var(--muted);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

/* 搜索区 */
.search-area {
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 12px;
  margin-bottom: 22px;
}

.search-box {
  flex: 1;
  display: flex;
  align-items: center;
  gap: 8px;
  background: var(--input-bg);
  border: 1px solid var(--border);
  border-radius: 10px;
  padding: 9px 12px;
}

/* CSS 放大镜图标 */
.search-box__icon {
  position: relative;
  flex-shrink: 0;
  width: 13px;
  height: 13px;
  border: 2px solid var(--muted);
  border-radius: 50%;
}

.search-box__icon::after {
  content: '';
  position: absolute;
  width: 6px;
  height: 2px;
  background: var(--muted);
  border-radius: 1px;
  transform: rotate(45deg);
  right: -5px;
  bottom: -2px;
}

.search-box__input {
  flex: 1;
  font-size: 14px;
  color: var(--text);
  background: transparent;
}

.search-area__btn {
  padding: 9px 20px;
}

/* 热播推荐 */
.section {
  margin-bottom: 22px;
}

.section__head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-bottom: 12px;
}

.section__title {
  font-size: 17px;
  font-weight: 700;
  color: var(--text);
}

.section__tabs {
  display: flex;
  gap: 6px;
}

.section__tab {
  font-size: 13px;
  color: var(--muted);
  padding: 4px 12px;
  border-radius: 999px;
  cursor: pointer;
  background: var(--card);
  border: 1px solid var(--border);
}

.section__tab--active {
  color: #fff;
  background: var(--primary);
  border-color: var(--primary);
}

.trend-scroll {
  width: 100%;
  white-space: nowrap;
}

.trend-row {
  display: inline-flex;
  gap: 12px;
  padding-bottom: 6px;
}

.trend-card {
  display: inline-flex;
  flex-direction: column;
  width: 120px;
  overflow: hidden;
  cursor: pointer;
}

.trend-card__cover {
  position: relative;
  width: 120px;
  height: 168px;
  border-radius: 12px 12px 0 0;
  overflow: hidden;
}

.trend-card__rating {
  position: absolute;
  top: 6px;
  right: 6px;
  background: rgba(0, 0, 0, 0.6);
  color: #fbbf24;
  font-size: 12px;
  font-weight: 600;
  padding: 1px 6px;
  border-radius: 6px;
}

.trend-card__title {
  font-size: 13px;
  font-weight: 600;
  color: var(--text);
  padding: 8px 10px 2px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.trend-card__sub {
  font-size: 11px;
  color: var(--muted);
  padding: 0 10px 10px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

/* 在线影视入口 */
.tv-entry {
  display: flex;
  align-items: center;
  gap: 12px;
  padding: 14px;
  margin-bottom: 28px;
  cursor: pointer;
}

.tv-entry__icon {
  width: 42px;
  height: 42px;
  border-radius: 12px;
  background: var(--primary-weak);
  display: flex;
  align-items: center;
  justify-content: center;
  flex-shrink: 0;
}

/* CSS 播放三角 */
.tv-entry__play {
  width: 0;
  height: 0;
  border-top: 7px solid transparent;
  border-bottom: 7px solid transparent;
  border-left: 11px solid var(--primary);
  margin-left: 3px;
}

.tv-entry__text {
  flex: 1;
  display: flex;
  flex-direction: column;
  gap: 2px;
}

.tv-entry__title {
  font-size: 15px;
  font-weight: 600;
  color: var(--text);
}

.tv-entry__sub {
  font-size: 12px;
  color: var(--muted);
}

/* CSS 右箭头 */
.tv-entry__arrow {
  width: 8px;
  height: 8px;
  border-top: 2px solid var(--muted);
  border-right: 2px solid var(--muted);
  transform: rotate(45deg);
  flex-shrink: 0;
}

.mine-entry {
  margin-top: -16px;
}

.mine-entry__icon {
  font-size: 18px;
  color: var(--primary);
  line-height: 1;
}

/* 底部 */
.footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 6px;
  padding-bottom: 12px;
}

.footer__link {
  font-size: 13px;
  color: var(--primary);
  cursor: pointer;
}

.footer__copy {
  font-size: 11px;
  color: var(--muted);
}
</style>

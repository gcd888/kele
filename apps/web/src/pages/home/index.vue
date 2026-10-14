<template>
  <view class="page">
    <view class="page-wrap">
      <!-- 顶栏 -->
      <view class="topbar">
        <view class="brand fade-up">
          <view class="brand__logo">
            <view class="brand__bubble brand__bubble--big"></view>
            <view class="brand__bubble brand__bubble--small"></view>
          </view>
          <view class="brand__text">
            <text class="brand__name">可乐</text>
            <text class="brand__slogan">网盘资源聚合搜索</text>
          </view>
        </view>
        <view class="topbar-actions">
          <view class="theme-btn" @tap="onToggleTheme">
            <view class="theme-btn__icon" :class="dark ? 'theme-btn__icon--moon' : 'theme-btn__icon--sun'"></view>
            <text class="theme-btn__text">{{ dark ? '夜间' : '日间' }}</text>
          </view>
          <view class="theme-btn setting-btn" @tap="goAdmin">
            <view class="setting-btn__icon"></view>
            <text class="theme-btn__text">设置</text>
          </view>
        </view>
      </view>

      <!-- 公告（长文本跑马灯滚动） -->
      <view v-if="notices.length" class="notice card fade-up" style="animation-delay: 40ms">
        <text class="notice__pill">公告</text>
        <view class="notice__mask">
          <view v-if="(notices[0].content || '').length > 18" class="notice__track" :style="{ animationDuration: marqueeDuration }">
            <text class="notice__text">{{ notices[0].content }}</text>
            <text class="notice__text">{{ notices[0].content }}</text>
          </view>
          <text v-else class="notice__text">{{ notices[0].content }}</text>
        </view>
      </view>

      <!-- 搜索区（hero） -->
      <view class="hero fade-up" style="animation-delay: 80ms">
        <view class="hero__bubble hero__bubble--a"></view>
        <view class="hero__bubble hero__bubble--b"></view>
        <view class="hero__bubble hero__bubble--c"></view>
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
        <view class="hero__tips">
          <text class="hero__tip">支持夸克 / 百度 / 阿里 / UC / 迅雷</text>
          <text class="hero__dot">·</text>
          <text class="hero__tip">多源聚合 · 实时检测有效性</text>
        </view>
      </view>

      <!-- 热播推荐 -->
      <view class="section fade-up" style="animation-delay: 120ms">
        <view class="section__head">
          <text class="section__title">热播推荐</text>
          <view class="section__tabs">
            <text
              v-for="t in trendTabs"
              :key="t.key"
              class="chip"
              :class="{ 'chip--active': activeTab === t.key }"
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
        <view v-else class="trend-grid">
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
      </view>

      <!-- 底部 -->
      <view class="footer">
        <text class="footer__link" @tap="goAbout">免责声明</text>
        <text class="footer__copy">本站不存储任何资源，结果来自第三方公开渠道</text>
      </view>
    </view>
  </view>
</template>

<script setup lang="ts">
import { computed, onMounted, ref } from 'vue';
import CoverImage from '../../components/CoverImage.vue';
import { request } from '../../api/client';
import type { DoubanItemEntity, NoticeEntity } from '../../types';
import { isDark, toggleTheme } from '../../utils/theme';

const inputKw = ref('');
const dark = ref(isDark());

// ===== 公告 =====
const notices = ref<NoticeEntity[]>([]);
/** 跑马灯时长：按文本长度线性估算，8s ~ 30s */
const marqueeDuration = computed(() => {
  const len = notices.value[0]?.content?.length || 10;
  return Math.min(30, Math.max(8, len * 0.4)).toFixed(1) + 's';
});

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
  } catch {
    notices.value = [];
  }
}

function onToggleTheme() {
  toggleTheme();
  dark.value = isDark();
}

/** 跳转管理后台登录页 */
function goAdmin() {
  uni.navigateTo({ url: '/pages/admin/login' });
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

function goAbout() {
  uni.navigateTo({ url: '/pages/about/index' });
}

onMounted(() => {
  loadNotices();
  loadTrending('tv');
});
</script>

<style scoped>
.page {
  min-height: 100vh;
}

/* 顶栏 */
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

/* 品牌 logo：可乐红橙渐变 + 气泡 */
.brand__logo {
  position: relative;
  width: 40px;
  height: 40px;
  border-radius: 14px;
  background: var(--grad-primary);
  box-shadow: 0 4px 12px rgba(230, 59, 33, 0.32);
  display: flex;
  align-items: center;
  justify-content: center;
}

.brand__bubble {
  position: absolute;
  border-radius: 50%;
  background: rgba(255, 255, 255, 0.92);
}

.brand__bubble--big {
  width: 13px;
  height: 13px;
  top: 9px;
  left: 13px;
}

.brand__bubble--small {
  width: 6px;
  height: 6px;
  bottom: 9px;
  right: 11px;
  opacity: 0.75;
}

.brand__text {
  display: flex;
  flex-direction: column;
}

.brand__name {
  font-size: 21px;
  font-weight: 800;
  color: var(--text);
  line-height: 1.2;
  letter-spacing: 1px;
}

.brand__slogan {
  font-size: 11px;
  color: var(--muted);
  letter-spacing: 0.5px;
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
  transition: border-color 0.15s ease-out;
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

/* 顶栏右侧操作组：主题切换 + 管理入口 */
.topbar-actions {
  display: flex;
  align-items: center;
  gap: 8px;
}

.setting-btn__icon {
  width: 12px;
  height: 12px;
  border: 2px solid var(--muted);
  border-radius: 50%;
  position: relative;
}

.setting-btn__icon::before {
  content: '';
  position: absolute;
  top: -5px;
  left: 50%;
  width: 2px;
  height: 4px;
  margin-left: -1px;
  background: var(--muted);
  border-radius: 1px;
  box-shadow: 0 13px 0 0 var(--muted);
}

.setting-btn__icon::after {
  content: '';
  position: absolute;
  inset: 2px;
  border-radius: 50%;
  border: 1.5px solid var(--muted);
  opacity: 0.45;
}

/* 公告（长文本跑马灯） */
.notice {
  display: flex;
  align-items: center;
  gap: 8px;
  padding: 9px 13px;
  margin-bottom: 16px;
}

.notice__pill {
  flex-shrink: 0;
  font-size: 11px;
  font-weight: 700;
  color: var(--primary-text);
  background: var(--primary-weak);
  border-radius: 6px;
  padding: 2px 8px;
}

.notice__mask {
  flex: 1;
  overflow: hidden;
}

.notice__track {
  display: inline-flex;
  white-space: nowrap;
  animation: notice-marquee 16s linear infinite;
  will-change: transform;
}

.notice__text {
  font-size: 13px;
  color: var(--muted);
  white-space: nowrap;
}

/* 跑马灯两份拷贝各自带相同尾部间距，保证 translateX(-50%) 无缝循环 */
.notice__track .notice__text {
  padding-right: 48px;
}

@keyframes notice-marquee {
  from { transform: translateX(0); }
  to { transform: translateX(-50%); }
}

/* 搜索 hero 区：气泡点缀 */
.hero {
  position: relative;
  margin-bottom: 28px;
}

.hero__bubble {
  position: absolute;
  border-radius: 50%;
  pointer-events: none;
  z-index: 0;
}

.hero__bubble--a {
  width: 90px;
  height: 90px;
  top: -34px;
  right: -22px;
  background: radial-gradient(circle at 35% 35%, rgba(240, 74, 46, 0.1), rgba(240, 74, 46, 0.02));
}

.hero__bubble--b {
  width: 46px;
  height: 46px;
  bottom: -8px;
  left: 4%;
  background: radial-gradient(circle at 35% 35%, rgba(20, 184, 166, 0.14), rgba(20, 184, 166, 0.02));
}

.hero__bubble--c {
  width: 26px;
  height: 26px;
  top: 4px;
  left: 30%;
  background: radial-gradient(circle at 35% 35%, rgba(245, 158, 11, 0.16), rgba(245, 158, 11, 0.02));
}

.search-area {
  position: relative;
  z-index: 1;
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 12px;
  border-radius: 20px;
  box-shadow: var(--shadow-lift);
}

.search-box {
  flex: 1;
  display: flex;
  align-items: center;
  gap: 8px;
  background: var(--input-bg);
  border: 1.5px solid transparent;
  border-radius: 14px;
  padding: 10px 13px;
  transition: border-color 0.15s ease-out, background-color 0.15s ease-out;
}

.search-box:focus-within {
  border-color: var(--primary);
  background: var(--card);
}

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
  padding: 10px 22px;
  border-radius: 14px;
}

.hero__tips {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: center;
  gap: 2px 6px;
  margin-top: 10px;
}

.hero__tip {
  font-size: 12px;
  color: var(--muted);
  white-space: nowrap;
}

.hero__dot {
  font-size: 12px;
  color: var(--primary);
}

/* 热播推荐 */
.section {
  margin-bottom: 26px;
}

.section__head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-bottom: 12px;
}

.section__title {
  font-size: 18px;
  font-weight: 800;
  color: var(--text);
  letter-spacing: 0.5px;
}

.section__tabs {
  display: flex;
  gap: 6px;
}

/* 热播推荐：竖向网格（手机 3 列，桌面 6 列） */
.trend-grid {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 12px;
}

@media (min-width: 768px) {
  .trend-grid {
    grid-template-columns: repeat(6, 1fr);
  }
}

.trend-card {
  display: flex;
  flex-direction: column;
  width: 100%;
  overflow: hidden;
  cursor: pointer;
  transition: transform 0.2s ease-out, box-shadow 0.2s ease-out;
}

.trend-card__cover {
  position: relative;
  width: 100%;
  aspect-ratio: 5 / 7;
  border-radius: var(--radius) var(--radius) 0 0;
  overflow: hidden;
}

.trend-card__rating {
  position: absolute;
  top: 6px;
  right: 6px;
  background: rgba(20, 10, 5, 0.68);
  color: #fbbf24;
  font-size: 12px;
  font-weight: 700;
  padding: 1px 7px;
  border-radius: 8px;
  font-variant-numeric: tabular-nums;
}

.trend-card__title {
  font-size: 13px;
  font-weight: 700;
  color: var(--text);
  padding: 9px 10px 2px;
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

@media (hover: hover) {
  .trend-card:hover {
    transform: translateY(-4px);
    box-shadow: var(--shadow-lift);
  }
}

/* 底部 */
.footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 6px;
  padding-top: 18px;
  padding-bottom: 12px;
}

.footer__link {
  font-size: 13px;
  font-weight: 600;
  color: var(--primary-text);
  cursor: pointer;
}

.footer__copy {
  font-size: 11px;
  color: var(--muted);
}
</style>

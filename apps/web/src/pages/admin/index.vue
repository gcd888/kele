<template>
  <view class="page">
    <view class="page-wrap">
      <!-- 顶栏 -->
      <view class="topbar">
        <text class="topbar__title">可乐 · 管理后台</text>
        <view class="btn btn--sm" @tap="logout">退出登录</view>
      </view>

      <!-- 移动端提示 -->
      <view class="ad-mobile-tip card">
        <text>管理后台仅支持桌面浏览器（窗口宽度 ≥ 768px）访问</text>
      </view>

      <view class="ad-desktop">
        <!-- Tabs -->
        <view class="tabs">
          <text
            v-for="t in tabs"
            :key="t.key"
            class="tabs__item"
            :class="{ 'tabs__item--active': tab === t.key }"
            @tap="tab = t.key"
          >{{ t.label }}</text>
        </view>

        <!-- 面板（v-if 懒挂载，切换 Tab 即重新加载数据） -->
        <OverviewPanel v-if="tab === 'stats'" />
        <SourcesPanel v-else-if="tab === 'sources'" />
        <HealthPanel v-else-if="tab === 'health'" />
        <NoticesPanel v-else-if="tab === 'content'" />
        <CronPanel v-else-if="tab === 'cron'" />
        <HotPanel v-else-if="tab === 'hot'" />
      </view>
    </view>
  </view>
</template>

<script setup lang="ts">
import { onShow } from '@dcloudio/uni-app';
import { ref } from 'vue';
import { clearAdminToken, getAdminToken } from '../../api/client';
import OverviewPanel from './components/OverviewPanel.vue';
import SourcesPanel from './components/SourcesPanel.vue';
import HealthPanel from './components/HealthPanel.vue';
import NoticesPanel from './components/NoticesPanel.vue';
import CronPanel from './components/CronPanel.vue';
import HotPanel from './components/HotPanel.vue';
import './admin-shared.css';

const tabs = [
  { key: 'stats', label: '概览' },
  { key: 'sources', label: '源管理' },
  { key: 'health', label: '健康度' },
  { key: 'content', label: '公告/导航' },
  { key: 'cron', label: '定时任务' },
  { key: 'hot', label: '热门搜索' },
];
const tab = ref('stats');

function logout() {
  clearAdminToken();
  uni.reLaunch({ url: '/pages/admin/login' });
}

onShow(() => {
  if (!getAdminToken()) {
    uni.reLaunch({ url: '/pages/admin/login' });
  }
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

.topbar__title {
  font-size: 18px;
  font-weight: 700;
  color: var(--text);
}

/* 移动端提示：<768 显示 */
.ad-mobile-tip {
  display: block;
  padding: 24px;
  text-align: center;
  color: var(--muted);
  font-size: 14px;
}

/* 桌面内容：<768 隐藏 */
.ad-desktop {
  display: none;
}

@media (min-width: 768px) {
  .ad-mobile-tip {
    display: none;
  }
  .ad-desktop {
    display: block;
  }
}
</style>

<template>
  <view class="page">
    <view class="page-wrap">
      <!-- 顶栏 -->
      <view class="topbar">
        <view class="back" @tap="goBack"><view class="back__arrow"></view></view>
        <text class="topbar__title">在线影视</text>
        <view class="topbar__spacer"></view>
      </view>

      <view v-if="loading" class="state-block">
        <view class="spinner"></view>
        <text class="state-block__hint">加载中...</text>
      </view>

      <view v-else-if="!sites.length" class="state-block">
        <text class="state-block__title">暂无影视站点</text>
        <text class="state-block__hint">去首页搜索资源试试</text>
      </view>

      <view v-else class="grid">
        <view
          v-for="s in sites"
          :key="s.id"
          class="site card"
          @tap="openSite(s)"
        >
          <view class="site__head">
            <view class="site__logo"><CoverImage :src="s.img" :name="s.name" /></view>
            <view class="site__info">
              <text class="site__name">{{ s.name }}</text>
              <text class="site__desc">{{ s.description || '免费在线观看' }}</text>
            </view>
          </view>
          <view class="site__foot">
            <!-- #ifdef MP-WEIXIN -->
            <text class="site__action">点击复制网址，到浏览器打开</text>
            <!-- #endif -->
            <!-- #ifndef MP-WEIXIN -->
            <text class="site__action">点击新窗口打开</text>
            <!-- #endif -->
          </view>
        </view>
      </view>
    </view>
  </view>
</template>

<script setup lang="ts">
import { onMounted, ref } from 'vue';
import CoverImage from '../../components/CoverImage.vue';
import { request } from '../../api/client';
import type { OnlineTvEntity } from '../../types';
import { copyText } from '../../utils/clipboard';

const sites = ref<OnlineTvEntity[]>([]);
const loading = ref(true);

async function load() {
  loading.value = true;
  try {
    const data = await request<OnlineTvEntity[]>('/online-tv');
    sites.value = (data || []).filter((s) => s.status === 1);
  } catch {
    sites.value = [];
  } finally {
    loading.value = false;
  }
}

function openSite(site: OnlineTvEntity) {
  // #ifdef MP-WEIXIN
  copyText(site.url).then((ok) => {
    uni.showToast({ title: ok ? '网址已复制，请在浏览器打开' : '复制失败', icon: 'none' });
  });
  // #endif
  // #ifndef MP-WEIXIN
  window.open(site.url, '_blank');
  // #endif
}

function goBack() {
  const pages = getCurrentPages();
  if (pages.length > 1) uni.navigateBack();
  else uni.reLaunch({ url: '/pages/home/index' });
}

onMounted(load);
</script>

<style scoped>
.page {
  min-height: 100vh;
}

.grid {
  display: grid;
  grid-template-columns: 1fr;
  gap: 12px;
  animation: kele-fade-up 0.4s cubic-bezier(0.22, 0.61, 0.36, 1) both;
}

@media (min-width: 768px) {
  .grid {
    grid-template-columns: 1fr 1fr;
  }
}

.site {
  padding: 14px;
  cursor: pointer;
  transition: transform 0.2s ease-out, box-shadow 0.2s ease-out, border-color 0.2s ease-out;
}

.site__head {
  display: flex;
  align-items: center;
  gap: 12px;
}

.site__logo {
  width: 48px;
  height: 48px;
  border-radius: 12px;
  overflow: hidden;
  flex-shrink: 0;
  background: var(--primary-weak);
}

.site__info {
  flex: 1;
  min-width: 0;
  display: flex;
  flex-direction: column;
  gap: 3px;
}

.site__name {
  font-size: 15px;
  font-weight: 600;
  color: var(--text);
}

.site__desc {
  font-size: 12px;
  color: var(--muted);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.site__foot {
  margin-top: 12px;
  padding-top: 10px;
  border-top: 1px solid var(--border);
}

.site__action {
  font-size: 12px;
  font-weight: 600;
  color: var(--primary-text);
}

@media (hover: hover) {
  .site:hover {
    transform: translateY(-2px);
    box-shadow: var(--shadow-lift);
    border-color: rgba(240, 74, 46, 0.3);
  }
}
</style>

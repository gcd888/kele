<template>
  <view class="section">
    <view class="toolbar">
      <text class="toolbar__hint">按聚合搜索次数排序的 Top {{ limit }} 热搜词</text>
      <view class="btn btn--sm" @tap="loadKeywords">刷新</view>
    </view>
    <view class="card table">
      <view class="table__row table__row--head hot-grid">
        <text>排名</text><text>关键词</text><text>搜索次数</text>
      </view>
      <view v-if="!keywords.length" class="table__empty"><text>暂无搜索记录</text></view>
      <view v-for="(k, i) in keywords" :key="k.keyword" class="table__row hot-grid">
        <text class="hot-rank" :class="'hot-rank--' + (i + 1)">{{ i + 1 }}</text>
        <text class="cell-strong">{{ k.keyword }}</text>
        <text>{{ k.search_count }}</text>
      </view>
    </view>
  </view>
</template>

<script setup lang="ts">
import { onMounted, ref } from 'vue';
import { request } from '../../../api/client';

interface HotKeyword {
  keyword: string;
  search_count: number;
}

const limit = 20;
const keywords = ref<HotKeyword[]>([]);

const emit = defineEmits<{ (e: 'loaded'): void }>();

async function loadKeywords() {
  try {
    keywords.value = (await request<HotKeyword[]>('/admin/hot-keywords?limit=' + limit)) || [];
  } finally {
    emit('loaded');
  }
}

onMounted(loadKeywords);
</script>

<style scoped>
.hot-grid {
  grid-template-columns: 0.5fr 2.5fr 1fr;
}

.hot-rank {
  display: inline-block;
  width: 22px;
  height: 22px;
  line-height: 22px;
  text-align: center;
  border-radius: 6px;
  font-size: 12px;
  color: var(--muted);
  background: var(--input-bg);
}

.hot-rank--1 {
  color: #fff;
  background: #f59e0b;
}

.hot-rank--2 {
  color: #fff;
  background: #94a3b8;
}

.hot-rank--3 {
  color: #fff;
  background: #b45309;
}
</style>

<template>
  <view class="page">
    <view class="page-wrap">
      <!-- 顶栏：返回 + 搜索框 -->
      <view class="topbar">
        <view class="back" @tap="goBack"><view class="back__arrow"></view></view>
        <view class="search-box">
          <view class="search-box__icon"></view>
          <input
            v-model="inputKw"
            class="search-box__input"
            type="text"
            confirm-type="search"
            placeholder="搜索网盘资源..."
            placeholder-class="search-box__ph"
            @confirm="reSearch"
          />
          <view v-if="inputKw" class="search-box__clear" @tap="inputKw = ''">
            <view class="search-box__clear-line search-box__clear-line--a"></view>
            <view class="search-box__clear-line search-box__clear-line--b"></view>
          </view>
        </view>
        <view class="btn btn--primary search-btn" @tap="reSearch">搜索</view>
      </view>

      <!-- 搜索历史（非流式期间可点） -->
      <view v-if="history.length && status !== 'loading'" class="history">
        <text class="history__label">最近：</text>
        <scroll-view scroll-x class="history__scroll" show-scrollbar="false">
          <view class="history__row">
            <text
              v-for="h in history"
              :key="h"
              class="history__chip"
              @tap="reSearch(h)"
            >{{ h }}</text>
          </view>
        </scroll-view>
        <text class="history__clear" @tap="onClearHistory">清空</text>
      </view>

      <!-- 网盘类型筛选 -->
      <view class="filters">
        <text
          v-for="f in filters"
          :key="f.value"
          class="filter-chip"
          :class="{ 'filter-chip--active': filter === f.value }"
          @tap="filter = f.value"
        >{{ f.label }}</text>
      </view>

      <!-- 进度 / 汇总行 -->
      <view class="meta-line" v-if="status === 'loading' || status === 'done'">
        <text class="meta-line__text">
          {{ status === 'loading'
            ? '正在聚合搜索' + (sourceTotal ? '，已完成 ' + sourceDoneCount + '/' + sourceTotal + ' 个源' : '...')
            : (cached ? '缓存结果' : '聚合完成') + '，耗时 ' + tookSec + 's' }}
        </text>
        <text v-if="cached && stale" class="meta-line__stale">（陈旧缓存）</text>
      </view>

      <!-- 加载中空态 -->
      <view v-if="status === 'loading' && !validList.length && !invalidList.length" class="state-block">
        <view class="spinner"></view>
        <text class="state-block__hint">正在多源聚合，结果将实时流入...</text>
      </view>

      <!-- 网络异常 -->
      <view v-else-if="status === 'error'" class="state-block">
        <text class="state-block__title">网络异常，请重试</text>
        <text class="state-block__hint">{{ errMsg || '连接已断开' }}</text>
        <view class="btn btn--primary state-block__btn" @tap="reSearch">重新搜索</view>
      </view>

      <!-- 空结果 -->
      <view v-else-if="status === 'done' && !validList.length && !invalidList.length" class="state-block">
        <text class="state-block__title">未找到相关资源</text>
        <text class="state-block__hint">换个关键词试试</text>
      </view>

      <!-- ===== 双桶结果区 ===== -->
      <template v-else>
        <!-- 有效区（前） -->
        <view v-if="filteredValid.length" class="bucket">
          <view class="bucket__head">
            <view class="bucket__dot bucket__dot--valid"></view>
            <text class="bucket__title">有效结果</text>
            <text class="bucket__count">{{ filteredValid.length }}</text>
          </view>
          <ResultCard v-for="it in filteredValid" :key="it.url" :item="it" />
        </view>

        <!-- 失效区（沉底） -->
        <view v-if="filteredInvalid.length" class="bucket">
          <view class="bucket__head">
            <view class="bucket__dot bucket__dot--invalid"></view>
            <text class="bucket__title">失效结果</text>
            <text class="bucket__count">{{ filteredInvalid.length }}</text>
          </view>
          <ResultCard v-for="it in filteredInvalid" :key="it.url" :item="it" />
        </view>
      </template>
    </view>
  </view>
</template>

<script setup lang="ts">
import { onLoad, onUnload } from '@dcloudio/uni-app';
import { computed, ref } from 'vue';
import { searchStream, type SearchStreamHandle } from '../../api/search';
import ResultCard from '../../components/ResultCard.vue';
import type { DonePayload, StreamMeta, ValidityResult } from '../../types';
import type { SearchItemView } from '../../utils/cloud';
import { addHistory, clearHistory, getHistory, removeHistory } from '../../utils/storage';

type Status = 'idle' | 'loading' | 'done' | 'error';

const inputKw = ref('');
const kw = ref('');
const status = ref<Status>('idle');
const errMsg = ref('');
const meta = ref<StreamMeta | null>(null);
const cached = ref(false);
const stale = ref(false);
const tookMs = ref(0);
const sourceTotal = ref(0);
const sourceDoneCount = ref(0);
const filter = ref('all');
const history = ref<string[]>([]);

/** 有效区（前）/ 失效区（沉底） */
const validList = ref<SearchItemView[]>([]);
const invalidList = ref<SearchItemView[]>([]);

let handle: SearchStreamHandle | null = null;

const filters = [
  { label: '全部', value: 'all' },
  { label: '夸克', value: 'quark' },
  { label: '百度', value: 'baidu' },
  { label: '阿里', value: 'aliyun' },
  { label: 'UC', value: 'uc' },
  { label: '迅雷', value: 'xunlei' },
];

const tookSec = computed(() => (tookMs.value / 1000).toFixed(1));

/** 前端网盘类型过滤 */
const filteredValid = computed(() => applyFilter(validList.value));
const filteredInvalid = computed(() => applyFilter(invalidList.value));

function applyFilter(list: SearchItemView[]): SearchItemView[] {
  if (filter.value === 'all') return list;
  return list.filter((i) => i.cloud_type === filter.value);
}

/** 启动一次流式搜索（SSE 双桶：source_result → 有效区尾部；validity=invalid → 移入失效区尾部） */
function startSearch(q: string) {
  kw.value = q;
  inputKw.value = q;
  addHistory(q);
  history.value = getHistory();

  handle?.abort();
  handle = null;
  validList.value = [];
  invalidList.value = [];
  meta.value = null;
  cached.value = false;
  stale.value = false;
  tookMs.value = 0;
  sourceTotal.value = 0;
  sourceDoneCount.value = 0;
  errMsg.value = '';
  status.value = 'loading';

  handle = searchStream(
    q,
    {
      onMeta(m) {
        meta.value = m;
        sourceTotal.value = m.cached ? 0 : m.sources.length;
      },
      onSourceResult(_sourceId, items) {
        for (const raw of items) {
          const item: SearchItemView = {
            id: raw.id,
            title: raw.title || '',
            url: raw.url || '',
            cloud_type: raw.cloud_type || 'other',
            passcode: raw.passcode,
            note: raw.note,
            tags: raw.tags,
            source_id: raw.source_id || '',
            validity: raw.validity === 'invalid' ? 'invalid' : raw.validity === 'valid' ? 'valid' : 'unknown',
          };
          if (!item.url) continue;
          // 缓存命中路径：条目可能直接带最终 validity
          if (item.validity === 'invalid') invalidList.value.push(item);
          else validList.value.push(item);
        }
      },
      onValidity(_sourceId, results: ValidityResult[]) {
        for (const r of results) {
          const idx = validList.value.findIndex((v) => v.url === r.url);
          if (idx < 0) continue;
          if (r.validity === 'invalid') {
            // 仅移动一次：从有效区摘除并追加到失效区尾部
            const [item] = validList.value.splice(idx, 1);
            item.validity = 'invalid';
            invalidList.value.push(item);
          } else {
            validList.value[idx].validity = 'valid';
          }
        }
      },
      onSourceDone() {
        sourceDoneCount.value += 1;
      },
      onDone(p: DonePayload) {
        status.value = 'done';
        tookMs.value = p.tookMs || tookMs.value;
        cached.value = p.cached;
        stale.value = p.stale;
      },
      onError(message: string) {
        uni.showToast({ title: message || '部分来源异常', icon: 'none', duration: 2000 });
      },
      onInterrupt(message: string) {
        if (status.value === 'loading') {
          status.value = 'error';
          errMsg.value = message || '网络异常，请重试';
        }
      },
    }
  );
}

/** 顶栏按钮 / 回车 / 重新搜索 */
function reSearch(kwArg?: string) {
  const q = (typeof kwArg === 'string' ? kwArg : inputKw.value).trim();
  if (!q) {
    uni.showToast({ title: '请输入搜索关键词', icon: 'none' });
    return;
  }
  startSearch(q);
}

function onClearHistory() {
  clearHistory();
  history.value = [];
  uni.showToast({ title: '已清空搜索历史', icon: 'none' });
}

function removeOneHistory(kw: string) {
  removeHistory(kw);
  history.value = getHistory();
}

function goBack() {
  const pages = getCurrentPages();
  if (pages.length > 1) uni.navigateBack();
  else uni.reLaunch({ url: '/pages/index/index' });
}

onLoad((options) => {
  const o = (options || {}) as Record<string, string>;
  const q = decodeURIComponent(o.kw || o.q || '').trim();
  history.value = getHistory();
  if (q) startSearch(q);
});

onUnload(() => {
  handle?.abort();
  handle = null;
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
  gap: 10px;
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
  cursor: pointer;
  flex-shrink: 0;
}

.back__arrow {
  width: 9px;
  height: 9px;
  border-left: 2px solid var(--text);
  border-bottom: 2px solid var(--text);
  transform: rotate(45deg);
  margin-left: 3px;
}

.search-box {
  flex: 1;
  display: flex;
  align-items: center;
  gap: 8px;
  background: var(--card);
  border: 1px solid var(--border);
  border-radius: 10px;
  padding: 9px 12px;
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

/* CSS 关闭叉 */
.search-box__clear {
  position: relative;
  flex-shrink: 0;
  width: 16px;
  height: 16px;
  border-radius: 50%;
  background: var(--muted);
  cursor: pointer;
}

.search-box__clear-line {
  position: absolute;
  top: 7px;
  left: 3px;
  width: 10px;
  height: 1.5px;
  background: var(--card);
  border-radius: 1px;
}

.search-box__clear-line--a {
  transform: rotate(45deg);
}

.search-box__clear-line--b {
  transform: rotate(-45deg);
}

.search-btn {
  flex-shrink: 0;
}

/* 历史 */
.history {
  display: flex;
  align-items: center;
  gap: 8px;
  margin-bottom: 10px;
}

.history__label {
  flex-shrink: 0;
  font-size: 12px;
  color: var(--muted);
}

.history__scroll {
  flex: 1;
  white-space: nowrap;
}

.history__row {
  display: inline-flex;
  gap: 6px;
}

.history__chip {
  font-size: 12px;
  color: var(--text);
  background: var(--card);
  border: 1px solid var(--border);
  border-radius: 999px;
  padding: 3px 12px;
  cursor: pointer;
}

.history__clear {
  flex-shrink: 0;
  font-size: 12px;
  color: var(--muted);
  cursor: pointer;
}

/* 筛选 */
.filters {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  margin-bottom: 14px;
}

.filter-chip {
  font-size: 13px;
  color: var(--muted);
  background: var(--card);
  border: 1px solid var(--border);
  border-radius: 999px;
  padding: 5px 16px;
  cursor: pointer;
}

.filter-chip--active {
  color: #fff;
  background: var(--primary);
  border-color: var(--primary);
}

/* 进度行 */
.meta-line {
  display: flex;
  align-items: center;
  margin-bottom: 12px;
}

.meta-line__text {
  font-size: 13px;
  color: var(--muted);
}

.meta-line__stale {
  font-size: 12px;
  color: var(--invalid);
}

/* 双桶分组 */
.bucket {
  margin-bottom: 22px;
}

.bucket__head {
  display: flex;
  align-items: center;
  gap: 8px;
  margin-bottom: 10px;
}

.bucket__dot {
  width: 8px;
  height: 8px;
  border-radius: 50%;
}

.bucket__dot--valid {
  background: var(--valid);
}

.bucket__dot--invalid {
  background: var(--invalid);
}

.bucket__title {
  font-size: 15px;
  font-weight: 600;
  color: var(--text);
}

.bucket__count {
  font-size: 12px;
  color: var(--muted);
  background: var(--card);
  border: 1px solid var(--border);
  border-radius: 999px;
  padding: 0 8px;
}

.state-block__btn {
  margin-top: 14px;
}
</style>

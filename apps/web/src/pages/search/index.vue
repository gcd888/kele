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
              class="chip history__chip"
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
          class="chip"
          :class="{ 'chip--active': filter === f.value }"
          @tap="filter = f.value"
        >{{ f.label }}<text v-if="filterCounts[f.value]" class="chip__num">{{ filterCounts[f.value] }}</text></text>
      </view>

      <!-- 聚合进度：源状态 chips + 进度条 -->
      <view v-if="status === 'loading' && sourceList.length" class="agg fade-up">
        <view class="agg__bar">
          <view class="agg__bar-fill" :style="{ width: progressPct + '%' }"></view>
        </view>
        <view class="agg__sources">
          <view
            v-for="s in sourceList"
            :key="s.id"
            class="agg__source"
            :class="'agg__source--' + s.status"
          >
            <view class="agg__dot"></view>
            <text class="agg__name">{{ s.name }}</text>
            <text v-if="s.status === 'ok'" class="agg__count">{{ s.count }}</text>
          </view>
        </view>
      </view>

      <!-- 汇总行 -->
      <view class="meta-line" v-if="status === 'done'">
        <text class="meta-line__text">
          {{ (cached ? '缓存结果' : '聚合完成') + ' · ' + totalCount + ' 条结果 · 耗时 ' + tookSec + 's' }}
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
        <!-- 结果区（未检测条目与有效条目同桶，标题与计数如实标注） -->
        <view v-if="filteredValid.length" class="bucket">
          <view class="bucket__head">
            <view class="bucket__dot bucket__dot--valid"></view>
            <text class="bucket__title">搜索结果</text>
            <text class="bucket__count">{{ filteredValid.length }}</text>
            <text v-if="validUnknownCount" class="bucket__split">有效 {{ validCheckedCount }} · 未检测 {{ validUnknownCount }}</text>
          </view>
          <view class="results-grid">
            <ResultCard v-for="it in filteredValid" :key="it.url" :item="it" />
          </view>
        </view>

        <!-- 失效区（沉底） -->
        <view v-if="filteredInvalid.length" class="bucket">
          <view class="bucket__head">
            <view class="bucket__dot bucket__dot--invalid"></view>
            <text class="bucket__title">失效结果</text>
            <text class="bucket__count">{{ filteredInvalid.length }}</text>
          </view>
          <view class="results-grid results-grid--dim">
            <ResultCard v-for="it in filteredInvalid" :key="it.url" :item="it" />
          </view>
        </view>
      </template>
    </view>
  </view>
</template>

<script setup lang="ts">
import { onLoad, onUnload } from '@dcloudio/uni-app';
import { computed, ref } from 'vue';
import { checkBatch, searchStream, type SearchStreamHandle } from '../../api/search';
import ResultCard from '../../components/ResultCard.vue';
import type { DonePayload, StreamMeta, ValidityResult } from '../../types';
import type { SearchItemView } from '../../utils/cloud';
import { addHistory, clearHistory, getHistory, removeHistory } from '../../utils/storage';

type Status = 'idle' | 'loading' | 'done' | 'error';

interface SourceState {
  id: number;
  name: string;
  status: 'loading' | 'ok' | 'error';
  count?: number;
}

const inputKw = ref('');
const kw = ref('');
const status = ref<Status>('idle');
const errMsg = ref('');
const meta = ref<StreamMeta | null>(null);
const cached = ref(false);
const stale = ref(false);
const tookMs = ref(0);
const sourceList = ref<SourceState[]>([]);
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
const totalCount = computed(() => validList.value.length + invalidList.value.length);

const progressPct = computed(() => {
  if (!sourceList.value.length) return 0;
  const done = sourceList.value.filter((s) => s.status !== 'loading').length;
  return Math.round((done / sourceList.value.length) * 100);
});

/** 各网盘类型计数（含全部） */
const filterCounts = computed(() => {
  const m: Record<string, number> = {};
  for (const it of [...validList.value, ...invalidList.value]) {
    m[it.cloud_type] = (m[it.cloud_type] || 0) + 1;
  }
  m.all = validList.value.length + invalidList.value.length;
  return m;
});

/** 前端网盘类型过滤 */
const filteredValid = computed(() => applyFilter(validList.value));
const filteredInvalid = computed(() => applyFilter(invalidList.value));

/** 结果桶内已检测有效 / 未检测计数（未检测 = 流式搜索未覆盖校验或该网盘类型无检测器） */
const validCheckedCount = computed(() => filteredValid.value.filter((i) => i.validity === 'valid').length);
const validUnknownCount = computed(() => filteredValid.value.length - validCheckedCount.value);

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
  backfillAborted = true; // 中止上一轮补检循环
  validList.value = [];
  invalidList.value = [];
  meta.value = null;
  cached.value = false;
  stale.value = false;
  tookMs.value = 0;
  sourceList.value = [];
  errMsg.value = '';
  status.value = 'loading';

  handle = searchStream(
    q,
    {
      onMeta(m) {
        meta.value = m;
        sourceList.value = m.cached
          ? []
          : m.sources.map((s) => ({ id: s.id, name: s.name, status: 'loading' as const }));
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
      onSourceDone(payload) {
        const s = sourceList.value.find((x) => x.id === payload.sourceId);
        if (s) {
          s.status = payload.ok ? 'ok' : 'error';
          s.count = payload.count;
        }
      },
      onDone(p: DonePayload) {
        status.value = 'done';
        tookMs.value = p.tookMs || tookMs.value;
        cached.value = p.cached;
        stale.value = p.stale;
        // 搜寻/校验拆分：流结束后前端分批补检未检测条目（卡片实时未检测→有效/失效）
        backfillValidity();
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

// ===== 批量补检（搜寻/校验拆分：done 后前端分批调用 /api/resource/check-batch）=====
const CHECKABLE_CLOUDS = new Set(['quark', 'baidu', 'aliyun', 'uc', 'xunlei']);
const CHECK_BATCH_SIZE = 20;
let backfillAborted = false;
/** 本轮已尝试补检的 URL：unknown 结论（上游歧义/超时）不重试，防止无限循环 */
let attemptedUrls = new Set<string>();

/** 流式校验结论应用：invalid 移入失效区 / valid 转绿 / unknown 还原未检测 */
function applyValidity(results: Array<{ url: string; validity: string }>) {
  for (const r of results) {
    const idx = validList.value.findIndex((v) => v.url === r.url);
    if (idx < 0) continue;
    if (r.validity === 'invalid') {
      const [item] = validList.value.splice(idx, 1);
      item.validity = 'invalid';
      invalidList.value.push(item);
    } else {
      validList.value[idx].validity = r.validity === 'valid' ? 'valid' : 'unknown';
    }
  }
}

async function backfillValidity() {
  backfillAborted = false;
  attemptedUrls = new Set();
  while (!backfillAborted) {
    const batch = validList.value
      .filter((i) => i.validity === 'unknown' && CHECKABLE_CLOUDS.has(i.cloud_type) && !attemptedUrls.has(i.url))
      .slice(0, CHECK_BATCH_SIZE);
    if (batch.length === 0) break;
    // 标记「检测中」（此刻真实在检测），结论回来后由 applyValidity 更新或还原
    for (const it of batch) {
      it.validity = 'checking';
      attemptedUrls.add(it.url);
    }
    try {
      const results = await checkBatch(batch.map((i) => ({ url: i.url, cloud_type: i.cloud_type })));
      if (backfillAborted) return;
      applyValidity(results);
      // 结论缺失（上游异常被服务端丢弃）的条目还原为未检测，且不再重试
      for (const it of batch) if (it.validity === 'checking') it.validity = 'unknown';
    } catch {
      // 批量检测失败：还原本批为未检测并终止本轮
      for (const it of batch) if (it.validity === 'checking') it.validity = 'unknown';
      break;
    }
  }
}

function onClearHistory() {
  clearHistory();
  history.value = [];
  uni.showToast({ title: '已清空搜索历史', icon: 'none' });
}

function goBack() {
  const pages = getCurrentPages();
  if (pages.length > 1) uni.navigateBack();
  else uni.reLaunch({ url: '/pages/home/index' });
}

onLoad((options) => {
  const o = (options || {}) as Record<string, string>;
  const q = decodeURIComponent(o.kw || o.q || '').trim();
  history.value = getHistory();
  if (q) startSearch(q);
});

onUnload(() => {
  backfillAborted = true;
  handle?.abort();
  handle = null;
});
</script>

<style scoped>
.page {
  min-height: 100vh;
}

/* 顶栏搜索框 */
.search-box {
  flex: 1;
  display: flex;
  align-items: center;
  gap: 8px;
  background: var(--card);
  border: 1.5px solid var(--border);
  border-radius: 14px;
  padding: 9px 12px;
  transition: border-color 0.15s ease-out;
}

.search-box:focus-within {
  border-color: var(--primary);
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
  border-radius: 14px;
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
  padding: 3px 12px;
  font-size: 12px;
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

/* 聚合进度 */
.agg {
  margin-bottom: 14px;
}

.agg__bar {
  height: 4px;
  border-radius: 999px;
  background: var(--input-bg);
  overflow: hidden;
}

.agg__bar-fill {
  height: 100%;
  border-radius: 999px;
  background: var(--grad-primary);
  transition: width 0.4s cubic-bezier(0.22, 0.61, 0.36, 1);
}

.agg__sources {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
  margin-top: 10px;
}

.agg__source {
  display: inline-flex;
  align-items: center;
  gap: 5px;
  font-size: 12px;
  color: var(--muted);
  background: var(--card);
  border: 1px solid var(--border);
  border-radius: 999px;
  padding: 3px 10px;
}

.agg__dot {
  width: 6px;
  height: 6px;
  border-radius: 50%;
  background: var(--checking);
}

.agg__source--loading .agg__dot {
  background: var(--primary);
  animation: kele-pulse 1.2s ease-in-out infinite;
}

.agg__source--ok {
  color: var(--text);
  border-color: rgba(20, 181, 103, 0.4);
}

.agg__source--ok .agg__dot {
  background: var(--valid);
}

.agg__source--error {
  color: var(--invalid);
  border-color: rgba(217, 45, 32, 0.4);
}

.agg__source--error .agg__dot {
  background: var(--invalid);
}

.agg__count {
  font-variant-numeric: tabular-nums;
  font-weight: 700;
  color: var(--valid);
}

/* 汇总行 */
.meta-line {
  display: flex;
  align-items: center;
  margin-bottom: 12px;
}

.meta-line__text {
  font-size: 13px;
  color: var(--muted);
  font-variant-numeric: tabular-nums;
}

.meta-line__stale {
  font-size: 12px;
  color: var(--invalid);
}

/* 双桶分组 */
.bucket {
  margin-bottom: 24px;
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
  font-weight: 800;
  color: var(--text);
}

.bucket__count {
  font-size: 12px;
  font-weight: 700;
  color: var(--muted);
  background: var(--card);
  border: 1px solid var(--border);
  border-radius: 999px;
  padding: 0 9px;
  font-variant-numeric: tabular-nums;
}

.bucket__split {
  font-size: 11px;
  color: var(--muted);
  font-variant-numeric: tabular-nums;
}

/* 结果网格：移动单列 / 桌面双列 */
.results-grid {
  display: grid;
  grid-template-columns: 1fr;
  gap: 10px;
  align-items: start;
}

.results-grid--dim {
  opacity: 0.72;
}

@media (min-width: 768px) {
  .results-grid {
    grid-template-columns: 1fr 1fr;
    gap: 12px;
  }
}

.state-block__btn {
  margin-top: 14px;
}
</style>

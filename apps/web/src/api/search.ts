/**
 * SSE 流式搜索客户端
 *
 * 协议见 docs/03 §3.5：
 *   meta           {searchId, kw, sources, cached}
 *   source_result  {sourceId, items: Resource[]}          —— 追加进"有效区"尾部（检测中）
 *   validity       {sourceId, results:[{url, validity}]}  —— invalid 移入失效区尾部 / valid 转绿不移动
 *   source_done    {sourceId, ok, count, tookMs, error?}
 *   done           {total, cached, stale, tookMs}
 *   error          {sourceId?, message}                    —— 流级错误（toast，流继续）
 *
 * H5 用 EventSource（GET 无需鉴权）；小程序降级 REST /api/search（后续阶段接 enableChunked）。
 * 15s 无任何事件视为连接异常 → onInterrupt。
 */
import type { DonePayload, Resource, SourceDonePayload, StreamMeta, ValidityResult } from '../types';
import { request, API_BASE } from './client';

/** 批量校验单条结论（含 unknown，用于还原「未检测」态） */
export interface BatchValidityResult {
  url: string;
  validity: 'valid' | 'invalid' | 'unknown';
}

/**
 * 批量校验未检测条目（搜寻/校验拆分方案 A）：
 * 独立请求独享子请求预算，每批 ≤20 条；结论同时落库，缓存路径自动受益
 */
export async function checkBatch(items: Array<{ url: string; cloud_type: string }>): Promise<BatchValidityResult[]> {
  const data = await request<{ results: BatchValidityResult[] }>('/resource/check-batch', {
    method: 'POST',
    data: { items },
  });
  return (data && data.results) || [];
}

export interface SearchHandlers {
  onMeta?: (meta: StreamMeta) => void;
  onSourceResult?: (sourceId: number, items: Resource[]) => void;
  onValidity?: (sourceId: number, results: ValidityResult[]) => void;
  onSourceDone?: (payload: SourceDonePayload) => void;
  onDone?: (payload: DonePayload) => void;
  /** 流级 error 事件（之后通常仍有 done），仅提示 */
  onError?: (message: string) => void;
  /** 连接中断 / 超时（不可恢复，需重新搜索） */
  onInterrupt?: (message: string) => void;
}

export interface SearchStreamHandle {
  abort: () => void;
}

const EVENT_TIMEOUT_MS = 15000;

interface StreamEvent {
  type: string;
  [key: string]: unknown;
}

function dispatchEvent(raw: string, handlers: SearchHandlers): void {
  let evt: StreamEvent | null = null;
  try {
    evt = JSON.parse(raw) as StreamEvent;
  } catch {
    return;
  }
  if (!evt || typeof evt.type !== 'string') return;
  switch (evt.type) {
    case 'meta':
      handlers.onMeta?.(evt as unknown as StreamMeta);
      break;
    case 'source_result':
      handlers.onSourceResult?.(
        Number(evt.sourceId ?? 0),
        (evt.items as Resource[]) || []
      );
      break;
    case 'validity':
      handlers.onValidity?.(Number(evt.sourceId ?? 0), (evt.results as ValidityResult[]) || []);
      break;
    case 'source_done':
      handlers.onSourceDone?.(evt as unknown as SourceDonePayload);
      break;
    case 'done':
      handlers.onDone?.(evt as unknown as DonePayload);
      break;
    case 'error':
      handlers.onError?.(String(evt.message || '部分来源异常'));
      break;
  }
}

// #ifdef H5
export function searchStream(kw: string, handlers: SearchHandlers, signal?: AbortSignal): SearchStreamHandle {
  let finished = false;
  let closed = false;
  const es = new EventSource('/api/search/stream?kw=' + encodeURIComponent(kw));

  const close = () => {
    if (!closed) {
      closed = true;
      clearTimeout(timer);
      es.close();
    }
  };

  const onTimeout = () => {
    if (finished || closed) return;
    close();
    handlers.onInterrupt?.('网络异常，请重试');
  };

  let timer = setTimeout(onTimeout, EVENT_TIMEOUT_MS);
  const resetTimer = () => {
    clearTimeout(timer);
    timer = setTimeout(onTimeout, EVENT_TIMEOUT_MS);
  };

  es.onmessage = (ev: MessageEvent<string>) => {
    if (closed) return;
    resetTimer();
    try {
      const evt = JSON.parse(ev.data) as StreamEvent;
      if (evt && evt.type === 'done') finished = true;
      dispatchEvent(ev.data, handlers);
      if (evt && evt.type === 'done') close();
    } catch {
      /* 忽略坏帧 */
    }
  };

  es.onerror = () => {
    if (closed) return;
    if (finished) {
      // 服务端正常关闭流（可能未收到 done 帧），按完成处理
      close();
      return;
    }
    close();
    handlers.onInterrupt?.('网络异常，请重试');
  };

  if (signal) {
    if (signal.aborted) close();
    else signal.addEventListener('abort', close);
  }

  return {
    abort: close,
  };
}
// #endif

// #ifndef H5
/** 小程序端降级：REST 一次性搜索（完整 SSE enableChunked 适配后续阶段实现） */
export function searchStream(kw: string, handlers: SearchHandlers, _signal?: unknown): SearchStreamHandle {
  let aborted = false;
  uni.request({
    url: API_BASE + '/api/search?kw=' + encodeURIComponent(kw),
    method: 'GET',
    timeout: 20000,
    success: (res) => {
      if (aborted) return;
      const body = res.data as { code?: number; msg?: string; data?: { items?: Resource[] } | Resource[] } | null;
      if (body && body.code === 0) {
        const items = (Array.isArray(body.data) ? body.data : body.data?.items) || [];
        handlers.onMeta?.({ searchId: '', kw, sources: [], cached: true });
        if (items.length) handlers.onSourceResult?.(0, items);
        handlers.onDone?.({ total: items.length, cached: true, stale: false, tookMs: 0 });
      } else {
        handlers.onError?.((body && body.msg) || '搜索失败');
        handlers.onDone?.({ total: 0, cached: false, stale: false, tookMs: 0 });
      }
    },
    fail: () => {
      if (!aborted) handlers.onInterrupt?.('网络异常，请重试');
    },
  });
  return {
    abort() {
      aborted = true;
    },
  };
}
// #endif

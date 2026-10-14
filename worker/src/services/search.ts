import { streamSSE } from 'hono/streaming';
import type { Context } from 'hono';
import type { D1Database } from '@cloudflare/workers-types';
import type {
  CrawlerResult,
  CloudType,
  Env,
  Resource,
  ResourceEntity,
  SearchStreamEvent,
} from '../types';
import { ValidStatus as VS } from '../types';
import { detectCloudType, extractPasscode, sanitizeKeyword, success, error } from '../utils';
import { matchPasscodeText } from '../sources/adapter';
import { buildAdapters, fetchSourceWithTimeout, type AdapterBundle } from '../sources';
import {
  findAllResourcesByKeyword,
  findResourceById,
  findResourcesByKeyword,
  findStaleResourcesByKeyword,
  insertResource,
  updateResourceValidity,
  updateResourceValidityByUrl,
} from '../db/resources';
import { insertSearchLog } from '../db/search-logs';
import { recordSourceResult } from '../db/api-configs';
import { checkValidity, validityToStatus } from './validity';

/**
 * 搜索核心（docs/03 §3.5 流式搜索编排）
 * SSE 主路径：先推后校验 —— source_result 立即追加，validity 随后修正
 * REST 兜底：缓存优先 → 扇出 → 校验前 20 条
 */

const RESOURCE_TTL_MS = 5 * 24 * 60 * 60 * 1000;
const VALIDATE_PER_SOURCE = 3;   // 每源校验上限
const VALIDATE_REST = 20;        // REST 全量校验上限

// ========== 公共工具 ==========

function newSearchId(): string {
  return crypto.randomUUID();
}

function clientKey(c: Context<{ Bindings: Env }>): string {
  return c.req.header('cf-connecting-ip') || 'anon';
}

/** waitUntil 安全封装（非 Worker 环境静默跳过） */
function safeWaitUntil(c: Context<{ Bindings: Env }>, p: Promise<unknown>): void {
  try {
    c.executionCtx.waitUntil(p.then(() => undefined, () => undefined));
  } catch { /* ignore */ }
}

/** DB 实体 → 前端 Resource（缓存命中条目带 id，可报失效） */
function entityToResource(r: ResourceEntity): Resource {
  return {
    id: r.id,
    title: r.title,
    url: r.url,
    cloud_type: r.cloud_type,
    note: r.description || '',
    cover: r.cover || '',
    source_id: r.source,
    validity: r.is_valid === VS.VALID ? 'valid' : r.is_valid === VS.INVALID ? 'invalid' : 'unknown',
  };
}

/** 爬取结果归一化：全局 url 去重 → cloud_type 兜底 → 提取码 */
function normalizeResults(
  results: CrawlerResult[],
  sourceId: number,
  cloudFilter: string,
  seen: Set<string>,
): Resource[] {
  const items: Resource[] = [];
  for (const r of results) {
    const url = r.url;
    if (!url || !/^https?:\/\//i.test(url)) continue;
    // URL 域名优先（防源侧类型误报），未识别再信源声明
    const byUrl = detectCloudType(url);
    const cloudType: CloudType = byUrl !== 'other' ? byUrl : r.cloudType;
    if (cloudFilter !== 'all' && cloudType !== cloudFilter) continue;
    if (seen.has(url)) continue;
    seen.add(url);
    items.push({
      title: r.title || url,
      url,
      cloud_type: cloudType,
      passcode: r.passcode || matchPasscodeText(r.description || '') || extractPasscode(url),
      note: r.description || '',
      tags: r.tags.length > 0 ? r.tags : undefined,
      cover: r.cover || undefined,
      source_id: String(sourceId),
      validity: 'unknown',
    });
  }
  return items;
}

/** 搜索结果异步落库（waitUntil 调用）：insertResource + 校验修正 + 搜索日志 */
async function persistSearchResults(
  db: D1Database,
  kw: string,
  items: Resource[],
  ipHash: string,
  total: number,
  tookMs: number,
): Promise<void> {
  const expireAt = new Date(Date.now() + RESOURCE_TTL_MS).toISOString();
  for (const item of items) {
    await insertResource(db, {
      title: item.title,
      url: item.url,
      cloud_type: item.cloud_type,
      is_valid: validityToStatus(item.validity),
      source: item.source_id,
      keyword: kw,
      is_preheated: 0,
      description: item.note || '',
      heat: 0,
      expire_at: expireAt,
      cover: item.cover || '',
    }).catch(() => undefined);
  }
  // ON CONFLICT 不覆盖旧有效性 → 已校验条目再按 url 修正一次
  for (const item of items) {
    if (item.validity === 'unknown') continue;
    await updateResourceValidityByUrl(
      db,
      item.url,
      item.validity === 'valid' ? VS.VALID : VS.INVALID,
    ).catch(() => undefined);
  }
  await insertSearchLog(db, kw, ipHash, total > 0, total, tookMs).catch(() => undefined);
}

// ========== SSE 流式搜索（主路径） ==========

export async function handleSearchStream(c: Context<{ Bindings: Env }>): Promise<Response> {
  const db = c.env.DB;
  const kw = sanitizeKeyword(c.req.query('kw') || '');
  const cloudFilter = c.req.query('cloud_type') || 'all';
  const startedAt = Date.now();
  const tookMs = () => Date.now() - startedAt;

  return streamSSE(c, async (stream) => {
    let aborted = false;
    const controllers: AbortController[] = [];

    const abortAll = () => {
      aborted = true;
      for (const ac of controllers) {
        try { ac.abort(); } catch { /* ignore */ }
      }
    };
    stream.onAbort(abortAll);
    if (c.req.raw.signal.aborted) abortAll();
    else c.req.raw.signal.addEventListener('abort', abortAll, { once: true });

    /** 发送事件（流已断则静默丢弃） */
    const emit = async (evt: SearchStreamEvent): Promise<void> => {
      if (aborted || stream.aborted) return;
      try {
        await stream.writeSSE({ data: JSON.stringify(evt) });
      } catch {
        aborted = true;
      }
    };

    // 关键词不合法
    if (!kw) {
      await emit({ type: 'error', message: '关键词不合法' });
      await emit({ type: 'done', total: 0, cached: false, stale: false, tookMs: tookMs() });
      return;
    }

    // ---- 1. 新鲜缓存快路径：0 扇出 ----
    let cached: ResourceEntity[] = [];
    try {
      cached = await findAllResourcesByKeyword(db, kw);
    } catch { cached = []; }
    if (cloudFilter !== 'all') cached = cached.filter((r) => r.cloud_type === cloudFilter);

    if (cached.length > 0) {
      const items = cached.map(entityToResource);
      await emit({ type: 'meta', searchId: newSearchId(), kw, sources: [], cached: true });
      await emit({ type: 'source_result', sourceId: 0, items });
      await emit({ type: 'done', total: items.length, cached: true, stale: false, tookMs: tookMs() });
      safeWaitUntil(c, insertSearchLog(db, kw, clientKey(c), true, items.length, tookMs()));
      return;
    }

    // ---- 2. 缓存未命中：多源扇出，每源独立超时与中断 ----
    let bundles: AdapterBundle[] = [];
    try {
      bundles = await buildAdapters(db);
    } catch (e) {
      console.error('构建适配器失败:', e);
    }

    await emit({
      type: 'meta',
      searchId: newSearchId(),
      kw,
      sources: bundles.map((b) => ({ id: b.config.id, name: b.config.name })),
      cached: false,
    });

    const seen = new Set<string>();
    const allItems: Resource[] = [];

    const runSource = async (bundle: AdapterBundle): Promise<void> => {
      const { adapter, config } = bundle;
      const ac = new AbortController();
      controllers.push(ac);
      const timer = setTimeout(() => ac.abort(new Error('timeout')), config.timeout_ms || 8000);
      const t0 = Date.now();

      let items: Resource[] = [];
      let ok = true;
      let errorText: string | undefined;
      try {
        const results = await adapter.fetch(kw, 1, ac.signal);
        items = normalizeResults(results, config.id, cloudFilter, seen);
      } catch (e) {
        ok = false;
        errorText = e instanceof Error ? e.message : String(e);
      } finally {
        clearTimeout(timer);
      }
      const sourceTook = Date.now() - t0;

      if (items.length > 0) {
        allItems.push(...items);
        await emit({ type: 'source_result', sourceId: config.id, items });

        // 前 N 条并行校验，批次回推（'unknown' 不下发）
        const checked = await Promise.allSettled(
          items.slice(0, VALIDATE_PER_SOURCE).map(async (it) => ({
            url: it.url,
            validity: await checkValidity(it.url, it.cloud_type),
          })),
        );
        const batch = checked.flatMap((r) =>
          r.status === 'fulfilled' && (r.value.validity === 'valid' || r.value.validity === 'invalid')
            ? [{ url: r.value.url, validity: r.value.validity }]
            : [],
        );
        if (batch.length > 0) {
          for (const b of batch) {
            allItems.find((it) => it.url === b.url)!.validity = b.validity;
          }
          await emit({ type: 'validity', sourceId: config.id, results: batch });
        }
      }

      await emit({ type: 'source_done', sourceId: config.id, ok, count: items.length, tookMs: sourceTook, error: errorText });
      safeWaitUntil(c, recordSourceResult(db, config.id, ok, sourceTook));
    };

    await Promise.allSettled(bundles.map(runSource));

    // ---- 3. 全源 0 条 → 旧缓存降级 ----
    let total = allItems.length;
    let stale = false;
    if (total === 0) {
      let staleRows: ResourceEntity[] = [];
      try {
        staleRows = await findStaleResourcesByKeyword(db, kw);
      } catch { staleRows = []; }
      if (cloudFilter !== 'all') staleRows = staleRows.filter((r) => r.cloud_type === cloudFilter);
      if (staleRows.length > 0) {
        stale = true;
        total = staleRows.length;
        await emit({ type: 'source_result', sourceId: 0, items: staleRows.map(entityToResource) });
      }
    }

    await emit({ type: 'done', total, cached: false, stale, tookMs: tookMs() });

    // ---- 4. 异步落库（不阻塞流关闭） ----
    safeWaitUntil(c, persistSearchResults(db, kw, allItems, clientKey(c), total, tookMs()));
  });
}

// ========== REST 聚合搜索（兜底 / 小程序 / SEO） ==========

export interface SearchData {
  source: 'cache' | 'api';
  total: number;
  page: number;
  pageSize: number;
  results: Resource[];
  /** mp 兼容别名（前端非 H5 降级读取 items） */
  items?: Resource[];
}

export async function searchKeywordService(
  db: D1Database,
  kw: string,
  cloudFilter = 'all',
  page = 1,
  pageSize = 20,
): Promise<SearchData> {
  // 1. 缓存优先
  try {
    const cached = await findResourcesByKeyword(db, kw, cloudFilter, page, pageSize);
    if (cached.total > 0) {
      const results = cached.results.map(entityToResource);
      return { source: 'cache', total: cached.total, page, pageSize, results, items: results };
    }
  } catch (e) {
    console.error('缓存查询失败:', e);
  }

  // 2. 扇出（带超时 + 健康度记账）
  let bundles: AdapterBundle[] = [];
  try {
    bundles = await buildAdapters(db);
  } catch { bundles = []; }

  const seen = new Set<string>();
  const settled = await Promise.allSettled(
    bundles.map(async (bundle): Promise<Resource[]> => {
      const t0 = Date.now();
      try {
        const results = await fetchSourceWithTimeout(bundle, kw, 1);
        await recordSourceResult(db, bundle.config.id, true, Date.now() - t0).catch(() => undefined);
        return normalizeResults(results, bundle.config.id, cloudFilter, seen);
      } catch {
        await recordSourceResult(db, bundle.config.id, false, Date.now() - t0).catch(() => undefined);
        return [];
      }
    }),
  );
  const items = settled.flatMap((r) => (r.status === 'fulfilled' ? r.value : []));

  // 3. 校验前 20 条并修正
  await Promise.allSettled(
    items.slice(0, VALIDATE_REST).map(async (it) => {
      const v = await checkValidity(it.url, it.cloud_type);
      it.validity = v;
      if (v !== 'unknown') {
        await updateResourceValidityByUrl(db, it.url, v === 'valid' ? VS.VALID : VS.INVALID).catch(() => undefined);
      }
    }),
  );

  // 4. 落库 + 日志
  const expireAt = new Date(Date.now() + RESOURCE_TTL_MS).toISOString();
  for (const item of items) {
    await insertResource(db, {
      title: item.title,
      url: item.url,
      cloud_type: item.cloud_type,
      is_valid: validityToStatus(item.validity),
      source: item.source_id,
      keyword: kw,
      is_preheated: 0,
      description: item.note || '',
      heat: 0,
      expire_at: expireAt,
      cover: item.cover || '',
    }).catch(() => undefined);
  }

  return { source: 'api', total: items.length, page, pageSize, results: items, items };
}

export async function handleSearchRest(c: Context<{ Bindings: Env }>): Promise<Response> {
  const kw = sanitizeKeyword(c.req.query('kw') || '');
  if (!kw) return c.json(error(1, '关键词不合法', 'INVALID_KEYWORD'), 400);
  const cloudFilter = c.req.query('cloud_type') || 'all';
  const page = Math.max(1, parseInt(c.req.query('page') || '1', 10) || 1);
  const pageSize = Math.min(50, Math.max(1, parseInt(c.req.query('page_size') || '20', 10) || 20));
  try {
    const data = await searchKeywordService(c.env.DB, kw, cloudFilter, page, pageSize);
    safeWaitUntil(c, insertSearchLog(c.env.DB, kw, clientKey(c), data.total > 0, data.total, 0));
    return c.json(success(data));
  } catch (e) {
    console.error('REST搜索失败:', e);
    return c.json(error(1, '搜索失败', 'SEARCH_FAILED'), 500);
  }
}

// ========== 资源即时检测 / 用户报失效 ==========

/** GET /api/resource/check?resource_id= ：即时检测并更新 DB */
export async function handleResourceCheck(c: Context<{ Bindings: Env }>): Promise<Response> {
  const id = parseInt(c.req.query('resource_id') || '', 10);
  if (!id) return c.json(error(1, '缺少 resource_id', 'INVALID_PARAM'), 400);
  try {
    const resource = await findResourceById(c.env.DB, id);
    if (!resource) return c.json(error(1, '资源不存在', 'NOT_FOUND'), 404);
    const validity = await checkValidity(resource.url, resource.cloud_type);
    if (validity !== 'unknown') {
      await updateResourceValidity(c.env.DB, id, validity === 'valid' ? VS.VALID : VS.INVALID);
    }
    return c.json(success({ resource_id: id, validity }));
  } catch (e) {
    console.error('资源检测失败:', e);
    return c.json(error(1, '检测失败', 'CHECK_FAILED'), 500);
  }
}

/** POST /api/resource/report {resource_id} ：同日 ≥3 次举报直接置失效 */
export async function handleResourceReport(c: Context<{ Bindings: Env }>): Promise<Response> {
  const body = await c.req.json<{ resource_id?: number }>().catch(() => null);
  const id = Number(body?.resource_id);
  if (!id) return c.json(error(1, '缺少 resource_id', 'INVALID_PARAM'), 400);
  try {
    const day = new Date().toISOString().slice(0, 10);
    const row = await c.env.DB.prepare(
      `INSERT INTO resource_reports (resource_id, day, count) VALUES (?, ?, 1)
       ON CONFLICT(resource_id, day) DO UPDATE SET count = count + 1
       RETURNING count`,
    ).bind(id, day).first<{ count: number }>();
    const count = row?.count ?? 1;
    let invalidated = false;
    if (count >= 3) {
      await updateResourceValidity(c.env.DB, id, VS.INVALID);
      invalidated = true;
    }
    return c.json(success({ resource_id: id, count, invalidated }));
  } catch (e) {
    console.error('举报处理失败:', e);
    return c.json(error(1, '举报失败', 'REPORT_FAILED'), 500);
  }
}

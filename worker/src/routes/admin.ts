import { Hono } from 'hono';
import type { Env, ApiConfigEntity } from '../types';
import { success } from '../utils';
import { requireAdmin } from '../utils/auth';
import { findAllSources, insertSource, updateSource, deleteSource, findSourceById, recordSourceResult } from '../db/api-configs';
import { findAllNotices, insertNotice, updateNotice, deleteNotice } from '../db/notices';
import { findAllOnlineTv, insertOnlineTv, updateOnlineTv, deleteOnlineTv } from '../db/online-tv';
import { countResources } from '../db/resources';
import { findHotKeywords } from '../db/search-logs';
import { buildAdapterFor, fetchSourceWithTimeout } from '../sources';
import { runDoubanCrawler, runAggregate, runCleanup } from '../schedules';
import { runPrefetch } from '../schedules/prefetch';
import { runProbe } from '../schedules/probe';
import { runValidityBackfill } from '../schedules/validity-backfill';

/** 管理端路由（全部要求 Bearer JWT） */
const adminRoutes = new Hono<{ Bindings: Env }>();
adminRoutes.use('*', requireAdmin);

// ====== 源管理 ======

/** GET /api/admin/sources — 全部源配置（含熔断状态） */
adminRoutes.get('/sources', async (c) => {
  return c.json(success(await findAllSources(c.env.DB)));
});

/** POST /api/admin/sources — 新增源 */
adminRoutes.post('/sources', async (c) => {
  const body = await c.req.json<Partial<ApiConfigEntity>>();
  if (!body.name || !body.url) {
    return c.json({ code: 400, msg: 'name 和 url 必填', error: 'BAD_REQUEST' }, 400);
  }
  try {
    const created = await insertSource(c.env.DB, body);
    return c.json(success(created));
  } catch (err: any) {
    return c.json({ code: 500, msg: err.message ?? '创建失败', error: 'DB_WRITE_ERROR' }, 500);
  }
});

/** PUT /api/admin/sources/:id — 更新源 */
adminRoutes.put('/sources/:id', async (c) => {
  const id = parseInt(c.req.param('id'));
  const body = await c.req.json<Partial<ApiConfigEntity>>();
  const existing = await findSourceById(c.env.DB, id);
  if (!existing) return c.json({ code: 404, msg: '源不存在', error: 'NOT_FOUND' }, 404);
  await updateSource(c.env.DB, id, body);
  return c.json(success(await findSourceById(c.env.DB, id)));
});

/** DELETE /api/admin/sources/:id — 删除源 */
adminRoutes.delete('/sources/:id', async (c) => {
  const id = parseInt(c.req.param('id'));
  const ok = await deleteSource(c.env.DB, id);
  return ok ? c.json(success({ deleted: true })) : c.json({ code: 404, msg: '源不存在', error: 'NOT_FOUND' }, 404);
});

/** POST /api/admin/sources/:id/recover — 手动恢复熔断 */
adminRoutes.post('/sources/:id/recover', async (c) => {
  const id = parseInt(c.req.param('id'));
  await updateSource(c.env.DB, id, { enabled: 1, fail_count: 0, disabled_until: null });
  return c.json(success(await findSourceById(c.env.DB, id)));
});

/** POST /api/admin/sources/:id/test — 真实调用源配置测试连通（kw 可指定，默认「庆余年」） */
adminRoutes.post('/sources/:id/test', async (c) => {
  const id = parseInt(c.req.param('id'));
  const config = await findSourceById(c.env.DB, id);
  if (!config) return c.json({ code: 404, msg: '源不存在', error: 'NOT_FOUND' }, 404);

  const bundle = buildAdapterFor(config);
  if (!bundle) {
    return c.json(success({ ok: false, count: 0, latencyMs: 0, error: `无法构建适配器（request_type: ${config.request_type} 不支持）` }));
  }

  const body = await c.req.json<{ kw?: string }>().catch(() => ({}) as { kw?: string });
  const kw = body?.kw || '庆余年';
  const t0 = Date.now();
  try {
    const results = await fetchSourceWithTimeout(bundle, kw, 1);
    const latencyMs = Date.now() - t0;
    // 与熔断探测一致：能拿到响应（哪怕 0 条）即视为源可达，成功会自动清零 fail_count
    await recordSourceResult(c.env.DB, id, true, latencyMs).catch(() => undefined);
    return c.json(success({
      ok: true,
      count: results.length,
      latencyMs,
      sample: results.slice(0, 3).map((r) => r.title),
    }));
  } catch (err: any) {
    const latencyMs = Date.now() - t0;
    await recordSourceResult(c.env.DB, id, false, latencyMs).catch(() => undefined);
    return c.json(success({ ok: false, count: 0, latencyMs, error: err?.message ?? '请求失败' }));
  }
});

// ====== 公告管理 ======

adminRoutes.get('/notices', async (c) => c.json(success(await findAllNotices(c.env.DB))));

adminRoutes.post('/notices', async (c) => {
  const body = await c.req.json<{ content?: string; status?: number }>();
  if (!body.content) return c.json({ code: 400, msg: 'content 必填', error: 'BAD_REQUEST' }, 400);
  const created = await insertNotice(c.env.DB, body.content);
  if (body.status !== undefined && created) await updateNotice(c.env.DB, created.id, { status: body.status });
  return c.json(success(created));
});

adminRoutes.put('/notices/:id', async (c) => {
  const id = parseInt(c.req.param('id'));
  const body = await c.req.json<{ content?: string; status?: number }>();
  await updateNotice(c.env.DB, id, body);
  return c.json(success({ updated: true }));
});

adminRoutes.delete('/notices/:id', async (c) => {
  const ok = await deleteNotice(c.env.DB, parseInt(c.req.param('id')));
  return ok ? c.json(success({ deleted: true })) : c.json({ code: 404, msg: '不存在', error: 'NOT_FOUND' }, 404);
});

// ====== 影视站导航管理 ======

adminRoutes.get('/online-tv', async (c) => c.json(success(await findAllOnlineTv(c.env.DB))));

adminRoutes.post('/online-tv', async (c) => {
  const body = await c.req.json<{ name?: string; url?: string; img?: string; description?: string; sort?: number }>();
  if (!body.name || !body.url) return c.json({ code: 400, msg: 'name 和 url 必填', error: 'BAD_REQUEST' }, 400);
  return c.json(success(await insertOnlineTv(c.env.DB, body as any)));
});

adminRoutes.put('/online-tv/:id', async (c) => {
  const id = parseInt(c.req.param('id'));
  const body = await c.req.json<Record<string, unknown>>();
  await updateOnlineTv(c.env.DB, id, body as any);
  return c.json(success({ updated: true }));
});

adminRoutes.delete('/online-tv/:id', async (c) => {
  const ok = await deleteOnlineTv(c.env.DB, parseInt(c.req.param('id')));
  return ok ? c.json(success({ deleted: true })) : c.json({ code: 404, msg: '不存在', error: 'NOT_FOUND' }, 404);
});

// ====== 概览统计 ======

adminRoutes.get('/stats', async (c) => {
  const db = c.env.DB;
  const resources = await countResources(db);
  const sources = await findAllSources(db);

  const [validRows, pendingRows, todaySearch, doubanCount] = await Promise.all([
    db.prepare(`SELECT is_valid, COUNT(*) AS cnt FROM resources GROUP BY is_valid`).all<{ is_valid: number; cnt: number }>(),
    db.prepare(`SELECT cloud_type, COUNT(*) AS cnt FROM resources WHERE is_valid = 2 GROUP BY cloud_type`).all<{ cloud_type: string; cnt: number }>(),
    db.prepare(`SELECT COUNT(*) AS cnt FROM search_logs WHERE created_at >= DATETIME('now', 'start of day')`).first<{ cnt: number }>(),
    db.prepare(`SELECT COUNT(*) AS cnt FROM douban_items`).first<{ cnt: number }>(),
  ]);

  const validity = { valid: 0, invalid: 0, pending: 0 };
  for (const r of validRows.results) {
    if (r.is_valid === 1) validity.valid = r.cnt;
    else if (r.is_valid === 0) validity.invalid = r.cnt;
    else validity.pending += r.cnt;
  }

  return c.json(success({
    resources,
    sources: {
      total: sources.length,
      active: sources.filter(s => s.status === 1 && s.enabled === 1).length,
      circuitBroken: sources.filter(s => s.enabled === 0).length,
      manualDisabled: sources.filter(s => s.status === 0).length,
    },
    validity,
    pendingByType: Object.fromEntries(pendingRows.results.map((r) => [r.cloud_type, r.cnt])),
    todaySearches: todaySearch?.cnt ?? 0,
    doubanItems: doubanCount?.cnt ?? 0,
  }));
});

// ====== 定时任务管理（静态清单，与 wrangler.toml crons / index.ts scheduled 分发保持一致） ======

const CRON_TASKS = [
  { key: 'douban', name: '豆瓣热播爬取', description: '抓取电视剧/电影/综艺近期热度榜并入库', cron: '0 0 * * *' },
  { key: 'prefetch', name: '热搜词预热', description: '按热搜词预搜索并缓存结果，加速用户搜索', cron: '30 0,12 * * *' },
  { key: 'cleanup', name: '过期缓存清理', description: '删除过期资源缓存与 30 天前搜索日志（UTC 3 点，与聚合合并调度）', cron: '0 3,5 * * *' },
  { key: 'aggregate', name: '热搜聚合', description: '聚合搜索日志生成热搜词（UTC 5 点，与清理合并调度）', cron: '0 3,5 * * *' },
  { key: 'probe', name: '熔断源探测', description: '探测熔断到期源，成功自动恢复（每小时 15 分，与补检合并调度）', cron: '15,40 * * * *' },
  { key: 'validity-backfill', name: '有效性兜底补检', description: '按类型配额补检待校验资源（每小时 40 分，与探测合并调度）', cron: '15,40 * * * *' },
] as const;

adminRoutes.get('/cron-tasks', (c) => c.json(success(CRON_TASKS)));

/** POST /api/admin/cron-tasks/:key/run — 手动触发定时任务（key 白名单，不落库） */
adminRoutes.post('/cron-tasks/:key/run', async (c) => {
  const key = c.req.param('key');
  const db = c.env.DB;
  const runners: Record<string, { slow: boolean; run: () => Promise<unknown> }> = {
    douban: { slow: true, run: () => runDoubanCrawler(db) },
    prefetch: { slow: true, run: () => runPrefetch(db) },
    cleanup: { slow: false, run: () => runCleanup(db) },
    aggregate: { slow: false, run: () => runAggregate(db) },
    probe: { slow: false, run: () => runProbe(db) },
    'validity-backfill': { slow: true, run: () => runValidityBackfill(db) },
  };
  const task = runners[key];
  if (!task) return c.json({ code: 404, msg: '未知任务', error: 'NOT_FOUND' }, 404);

  if (task.slow) {
    // 慢任务（豆瓣爬虫/预热/补检）后台执行，立即返回，前端稍后刷新概览核对
    c.executionCtx.waitUntil(task.run().catch((e) => console.error('手动触发任务失败:', key, e)));
    return c.json(success({ started: true, key, mode: 'background' }));
  }
  const result = await task.run();
  return c.json(success({ started: true, key, mode: 'sync', result: result ?? null }));
});

// ====== 热门搜索词 ======

adminRoutes.get('/hot-keywords', async (c) => {
  const limit = Math.min(100, Math.max(1, parseInt(c.req.query('limit') || '20') || 20));
  return c.json(success(await findHotKeywords(c.env.DB, limit)));
});

export default adminRoutes;

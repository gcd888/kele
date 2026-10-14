import { Hono } from 'hono';
import type { Env, ApiConfigEntity } from '../types';
import { success } from '../utils';
import { requireAdmin } from '../utils/auth';
import { findAllSources, insertSource, updateSource, deleteSource, findSourceById } from '../db/api-configs';
import { findAllNotices, insertNotice, updateNotice, deleteNotice } from '../db/notices';
import { findAllOnlineTv, insertOnlineTv, updateOnlineTv, deleteOnlineTv } from '../db/online-tv';
import { countResources } from '../db/resources';

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
  const resources = await countResources(c.env.DB);
  const sources = await findAllSources(c.env.DB);
  return c.json(success({
    resources,
    sources: {
      total: sources.length,
      active: sources.filter(s => s.status === 1 && s.enabled === 1).length,
      circuitBroken: sources.filter(s => s.enabled === 0).length,
      manualDisabled: sources.filter(s => s.status === 0).length,
    },
  }));
});

export default adminRoutes;

import { Hono } from 'hono';
import type { Env } from '../types';
import { success } from '../utils';
import { findEnabledCloudTypes } from '../db/cloud-types';
import { findEnabledNotices } from '../db/notices';
import { findEnabledOnlineTv } from '../db/online-tv';
import { findDoubanItems } from '../db/douban';
import { findHotKeywords } from '../db/search-logs';

/** 公开接口路由（无需认证） */
const publicRoutes = new Hono<{ Bindings: Env }>();

/** 健康检查 */
publicRoutes.get('/health', (c) => {
  return c.json({ code: 0, msg: 'kele worker is running', data: { timestamp: Date.now() } });
});

/** 图片代理（豆瓣防盗链） */
publicRoutes.get('/img-proxy', async (c) => {
  const url = c.req.query('url');
  if (!url) return c.body('Missing url', 400);
  try {
    const decoded = decodeURIComponent(url);
    const ext = decoded.split('.').pop()?.toLowerCase() || '';
    const mimeMap: Record<string, string> = { svg: 'image/svg+xml', png: 'image/png', jpg: 'image/jpeg', jpeg: 'image/jpeg', webp: 'image/webp' };
    const forcedContentType = mimeMap[ext] || 'image/jpeg';
    const resp = await fetch(decoded, { headers: { 'User-Agent': 'Mozilla/5.0' } });
    return new Response(resp.body, { headers: { 'Content-Type': forcedContentType, 'Cache-Control': 'public, max-age=86400' } });
  } catch {
    return c.body('Proxy failed', 502);
  }
});

/** 网盘类型 */
publicRoutes.get('/cloud-types', async (c) => {
  try {
    return c.json(success(await findEnabledCloudTypes(c.env.DB)));
  } catch (err: any) {
    return c.json({ code: 500, msg: err.message, error: 'INTERNAL_ERROR' }, 500);
  }
});

/** 公告 */
publicRoutes.get('/notices', async (c) => {
  try {
    return c.json(success(await findEnabledNotices(c.env.DB)));
  } catch (err: any) {
    return c.json({ code: 500, msg: err.message, error: 'INTERNAL_ERROR' }, 500);
  }
});

/** 影视站导航 */
publicRoutes.get('/online-tv', async (c) => {
  try {
    return c.json(success(await findEnabledOnlineTv(c.env.DB)));
  } catch (err: any) {
    return c.json({ code: 500, msg: err.message, error: 'INTERNAL_ERROR' }, 500);
  }
});

/** 热搜词 */
publicRoutes.get('/hot-keywords', async (c) => {
  try {
    const limit = parseInt(c.req.query('limit') || '20');
    return c.json(success(await findHotKeywords(c.env.DB, limit)));
  } catch (err: any) {
    return c.json({ code: 500, msg: err.message, error: 'INTERNAL_ERROR' }, 500);
  }
});

/** 热播推荐 */
publicRoutes.get('/trending', async (c) => {
  const rawType = c.req.query('category') || c.req.query('type') || 'tv';
  const sub = c.req.query('sub') || '';
  const limit = parseInt(c.req.query('limit') || '50');
  const typeMap: Record<string, 'tv' | 'movie' | 'variety'> = { tv: 'tv', movie: 'movie', show: 'variety', variety: 'variety' };
  const mediaType = typeMap[rawType] || 'tv';
  try {
    const items = await findDoubanItems(c.env.DB, mediaType, sub, limit);
    return c.json(success(items));
  } catch (err: any) {
    return c.json({ code: 500, msg: err.message, error: 'INTERNAL_ERROR' }, 500);
  }
});

export default publicRoutes;

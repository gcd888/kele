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
    // 豆瓣图床对极简 UA 返回 418 空 body，必须携带完整浏览器头 + Referer
    const resp = await fetch(decoded, {
      headers: {
        'User-Agent':
          'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36',
        Referer: 'https://movie.douban.com/',
        Accept: 'image/avif,image/webp,image/apng,image/*,*/*;q=0.8',
      },
    });
    // 上游异常（418/403 等）时返回 502，前端 <image> onerror 自动落占位符
    if (!resp.ok || !resp.body) {
      return c.body('Upstream ' + resp.status, 502);
    }
    const upstreamType = resp.headers.get('content-type') || '';
    const contentType = upstreamType.startsWith('image/') ? upstreamType : forcedContentType;
    return new Response(resp.body, { headers: { 'Content-Type': contentType, 'Cache-Control': 'public, max-age=86400' } });
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

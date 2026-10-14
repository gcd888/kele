/**
 * kele Worker 主入口
 *
 * 路由：
 *   /api/*        → 公开接口 / 管理接口 / 搜索（S2 提供 SSE）
 *   /*            → uni-app H5 静态资源（ASSETS）
 *
 * Cron：
 *   0 0 * * *    豆瓣爬虫
 *   30 0/12 * * * 热搜词预热（prefetch）
 *   0 3 * * *    清理
 *   0 5 * * *    热搜聚合
 *   15 * * * *   熔断探测恢复（probe）
 */
import { Hono } from 'hono';
import { cors } from 'hono/cors';
import { logger } from 'hono/logger';
import type { Env } from './types';
import { rateLimitMiddleware } from './utils';
import publicRoutes from './routes/public';
import authRoutes from './routes/auth';
import adminRoutes from './routes/admin';
import searchRoutes, { resourceRoutes } from './routes/search';
import { runDoubanCrawler, runAggregate, runCleanup } from './schedules';
import { runPrefetch } from './schedules/prefetch';
import { runProbe } from './schedules/probe';

const app = new Hono<{ Bindings: Env }>();

// ====== 全局中间件 ======
app.use('*', logger());
app.use('*', cors({
  origin: (origin, c) => {
    const allowed = String(c.env.CORS_ALLOWED_ORIGINS || '').split(',').map((s: string) => s.trim()).filter(Boolean);
    allowed.push('http://localhost:5173', 'http://localhost:9000');
    return allowed.includes(origin) ? origin : '';
  },
  allowMethods: ['GET', 'POST', 'PUT', 'DELETE', 'OPTIONS'],
  allowHeaders: ['Content-Type', 'Authorization'],
  maxAge: 86400,
}));

// 搜索类接口限流（含 /api/search/stream）
app.use('/api/*', rateLimitMiddleware);

// ====== 业务路由 ======
app.route('/api', publicRoutes);
app.route('/api/auth', authRoutes);
app.route('/api/admin', adminRoutes);
app.route('/api/search', searchRoutes);
app.route('/api/resource', resourceRoutes);

// ====== 异常处理 ======

/** 404：API 返回 JSON，其余回退 index.html（SPA 路由） */
app.notFound(async (c) => {
  const url = new URL(c.req.url);
  if (url.pathname.startsWith('/api/')) {
    return c.json({ code: 1, msg: '接口不存在', error: 'NOT_FOUND' }, 404);
  }
  const index = await c.env.ASSETS.fetch(new Request(new URL('/index.html', url.origin)));
  const body = await index.text();
  return c.body(body, 200, { 'content-type': 'text/html;charset=utf-8' });
});

app.onError((err, c) => {
  console.error('Worker全局错误:', err.message, err.stack);
  return c.json({ code: 1, msg: '服务器内部错误', error: 'INTERNAL_ERROR' }, 500);
});

// ====== Cloudflare Workers 入口 ======

export default {
  fetch: app.fetch,

  async scheduled(event: ScheduledEvent, env: Env, ctx: ExecutionContext) {
    const cron = event.cron || '';
    console.log('Cron触发:', cron, new Date().toISOString());

    if (cron === '0 0 * * *') {
      ctx.waitUntil(runDoubanCrawler(env.DB));
    } else if (cron === '0 3 * * *') {
      ctx.waitUntil(runCleanup(env.DB));
    } else if (cron === '0 5 * * *') {
      ctx.waitUntil(runAggregate(env.DB));
    } else if (cron === '30 0 * * *' || cron === '30 12 * * *') {
      ctx.waitUntil(runPrefetch(env.DB));
    } else if (cron === '15 * * * *') {
      ctx.waitUntil(runProbe(env.DB));
    } else {
      ctx.waitUntil(Promise.all([
        runDoubanCrawler(env.DB).catch(e => console.error(e)),
        runCleanup(env.DB).catch(e => console.error(e)),
        runAggregate(env.DB).catch(e => console.error(e)),
        runPrefetch(env.DB).catch(e => console.error(e)),
        runProbe(env.DB).catch(e => console.error(e)),
      ]));
    }
  },
};

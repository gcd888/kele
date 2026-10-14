import type { Context, Next } from 'hono';
import type { Env } from '../types';

/** 频率限制存储（Worker 内存，冷启动重置；免费版单实例足够） */
const rateLimitMap = new Map<string, { count: number; resetAt: number }>();

/** IP 频率限制中间件 */
export async function rateLimitMiddleware(c: Context<{ Bindings: Env }>, next: Next) {
  const path = new URL(c.req.url).pathname;
  // 图片代理豁免：首页单次加载即并发 ~30 张封面请求，计入配额会被一次访问打满
  // 批量校验豁免：搜寻/校验拆分后，一次搜索的前端补检会连发 ~3-5 批（每批 20 条）
  if (path === '/api/img-proxy' || path === '/api/resource/check-batch') {
    await next();
    return;
  }
  const limit = parseInt(c.env.RATE_LIMIT_PER_MINUTE || '20');
  const ip = c.req.header('CF-Connecting-IP') || c.req.header('X-Real-IP') || 'unknown';
  const now = Date.now();
  const windowMs = 60 * 1000;

  const record = rateLimitMap.get(ip);
  if (!record || now > record.resetAt) {
    rateLimitMap.set(ip, { count: 1, resetAt: now + windowMs });
    await next();
    return;
  }

  if (record.count >= limit) {
    return c.json({ code: 429, msg: '请求频率超限，请稍后再试', error: 'RATE_LIMIT_EXCEEDED' }, 429);
  }

  record.count++;
  await next();
}

import type { Context, Next } from 'hono';
import type { Env } from '../types';

/** 频率限制存储（Worker 内存，冷启动重置；免费版单实例足够） */
const rateLimitMap = new Map<string, { count: number; resetAt: number }>();

/** IP 频率限制中间件 */
export async function rateLimitMiddleware(c: Context<{ Bindings: Env }>, next: Next) {
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

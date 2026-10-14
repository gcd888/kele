import type { Context, Next } from 'hono';
import type { Env } from '../types';
import { verifyAdminToken } from './jwt';

/** 管理员鉴权中间件：/api/admin/* 全量要求 Bearer JWT */
export async function requireAdmin(c: Context<{ Bindings: Env }>, next: Next) {
  const authHeader = c.req.header('Authorization');
  if (!authHeader || !authHeader.startsWith('Bearer ')) {
    return c.json({ code: 401, msg: '未登录或token无效', error: 'AUTH_INVALID_TOKEN' }, 401);
  }
  const payload = await verifyAdminToken(authHeader.slice(7), c.env);
  if (!payload) {
    return c.json({ code: 401, msg: 'token无效或已过期', error: 'AUTH_INVALID_TOKEN' }, 401);
  }
  await next();
}

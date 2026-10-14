import { Hono } from 'hono';
import type { Env } from '../types';
import { generateAdminToken, success, error } from '../utils';

/** 管理端登录路由 */
const authRoutes = new Hono<{ Bindings: Env }>();

/** POST /api/auth/login — 单管理员登录（密码来自 wrangler secret ADMIN_PASSWORD） */
authRoutes.post('/login', async (c) => {
  const body = await c.req.json<{ username?: string; password?: string }>().catch(() => null);
  if (!body?.password) {
    return c.json(error(400, '缺少密码', 'BAD_REQUEST'), 400);
  }
  // 用户名可选，仅支持 admin
  if (body.username && body.username !== 'admin') {
    return c.json(error(401, '用户名或密码错误', 'AUTH_WRONG_PASSWORD'), 401);
  }
  if (body.password !== c.env.ADMIN_PASSWORD) {
    return c.json(error(401, '用户名或密码错误', 'AUTH_WRONG_PASSWORD'), 401);
  }
  const token = await generateAdminToken(c.env);
  return c.json(success({ token, username: 'admin' }));
});

export default authRoutes;

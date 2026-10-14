import { Hono } from 'hono';
import type { Env } from '../types';
import { generateAdminToken, success, error } from '../utils';
import { findAdminByUsername, verifyPassword } from '../db/admin-users';
import { issueCaptcha, consumeCaptcha } from '../services/captcha';

/**
 * 管理端登录路由（无需 Bearer）
 * - GET  /api/auth/captcha — 签发图形验证码（SVG + token，5 分钟有效一次性）
 * - POST /api/auth/login   — 验证码 + 用户名 + PBKDF2 密码 → JWT
 */

/** 登录失败限流（isolate 内存级，多实例各自计数，仍显著抬高爆破成本） */
const FAIL_WINDOW_MS = 5 * 60 * 1000; // 统计窗口 5 分钟
const FAIL_MAX = 8;                   // 窗口内最多失败次数
const LOCK_MS = 10 * 60 * 1000;       // 触发后锁定 10 分钟
const failMap = new Map<string, { count: number; windowStart: number; lockedUntil: number }>();

function clientIp(c: { req: { header: (k: string) => string | undefined } }): string {
  return c.req.header('CF-Connecting-IP') || c.req.header('X-Forwarded-For')?.split(',')[0]?.trim() || 'unknown';
}

function isLocked(ip: string): number {
  const rec = failMap.get(ip);
  if (!rec) return 0;
  const now = Date.now();
  if (rec.lockedUntil > now) return Math.ceil((rec.lockedUntil - now) / 1000);
  if (now - rec.windowStart > FAIL_WINDOW_MS) failMap.delete(ip); // 窗口过期重置
  return 0;
}

function recordFail(ip: string): void {
  const now = Date.now();
  const rec = failMap.get(ip);
  if (!rec || now - rec.windowStart > FAIL_WINDOW_MS) {
    failMap.set(ip, { count: 1, windowStart: now, lockedUntil: 0 });
    return;
  }
  rec.count += 1;
  if (rec.count >= FAIL_MAX) rec.lockedUntil = now + LOCK_MS;
}

function clearFails(ip: string): void {
  failMap.delete(ip);
}

/** GET /api/auth/captcha — 图形验证码 */
const authRoutes = new Hono<{ Bindings: Env }>();

authRoutes.get('/captcha', async (c) => {
  try {
    const { token, svg, expiresIn } = await issueCaptcha(c.env.DB);
    return c.json(success({ token, svg, expiresIn }));
  } catch (err: any) {
    return c.json(error(500, '验证码生成失败：' + (err?.message ?? ''), 'CAPTCHA_ERROR'), 500);
  }
});

/** POST /api/auth/login */
authRoutes.post('/login', async (c) => {
  const ip = clientIp(c);
  const lockLeft = isLocked(ip);
  if (lockLeft > 0) {
    return c.json(error(429, `失败次数过多，请 ${Math.ceil(lockLeft / 60)} 分钟后再试`, 'AUTH_LOCKED'), 429);
  }

  const body = await c.req.json<{ username?: string; password?: string; captchaToken?: string; captchaCode?: string }>()
    .catch(() => null);
  if (!body?.username || !body?.password || !body?.captchaToken || !body?.captchaCode) {
    return c.json(error(400, '用户名、密码、验证码均必填', 'BAD_REQUEST'), 400);
  }

  // 1. 一次性消费验证码（无效/过期/已用/码错均拒绝）
  let captchaOk: boolean | null;
  try {
    captchaOk = await consumeCaptcha(c.env.DB, body.captchaToken, body.captchaCode);
  } catch {
    captchaOk = null;
  }
  if (captchaOk === null) {
    recordFail(ip);
    return c.json(error(401, '验证码已失效，请刷新后重试', 'AUTH_CAPTCHA_INVALID'), 401);
  }
  if (!captchaOk) {
    recordFail(ip);
    return c.json(error(401, '验证码错误', 'AUTH_CAPTCHA_WRONG'), 401);
  }

  // 2. 查库校验账号（PBKDF2 恒定时间比对，用户名/密码任一错误提示一致防枚举）
  const user = await findAdminByUsername(c.env.DB, body.username.trim()).catch(() => null);
  const ok = user ? await verifyPassword(body.password, user.password_hash) : false;
  if (!user || !ok) {
    recordFail(ip);
    return c.json(error(401, '用户名或密码错误', 'AUTH_WRONG_PASSWORD'), 401);
  }

  clearFails(ip);
  const token = await generateAdminToken(c.env, user.username);
  return c.json(success({ token, username: user.username }));
});

export default authRoutes;

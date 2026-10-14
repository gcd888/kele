import { SignJWT, jwtVerify } from 'jose';
import type { Env } from '../types';

/**
 * 管理端 JWT（单账号，无用户体系）
 */

export interface AdminJwtPayload {
  role: 'admin';
  sub: string;
  exp: number;
  iat: number;
}

/** JWT 有效期：12 小时 */
const ADMIN_EXPIRY_SECONDS = 12 * 60 * 60;

export async function generateAdminToken(env: Env, username: string): Promise<string> {
  const secret = new TextEncoder().encode(env.JWT_SECRET);
  return new SignJWT({ role: 'admin', sub: username })
    .setProtectedHeader({ alg: 'HS256' })
    .setIssuedAt()
    .setExpirationTime(Math.floor(Date.now() / 1000) + ADMIN_EXPIRY_SECONDS)
    .sign(secret);
}

export async function verifyAdminToken(token: string, env: Env): Promise<AdminJwtPayload | null> {
  try {
    const secret = new TextEncoder().encode(env.JWT_SECRET);
    const { payload } = await jwtVerify(token, secret);
    if (payload.role !== 'admin' || typeof payload.sub !== 'string' || !payload.sub) return null;
    return payload as unknown as AdminJwtPayload;
  } catch {
    return null;
  }
}

import type { D1Database } from '@cloudflare/workers-types';

/**
 * 管理员账号（D1 存储，PBKDF2-SHA256 哈希）
 * password_hash 格式：pbkdf2$iterations$salt_b64$hash_b64
 */

export interface AdminUserEntity {
  id: number;
  username: string;
  password_hash: string;
}

/** b64 → Uint8Array */
function b64ToBytes(s: string): Uint8Array {
  const raw = atob(s);
  const out = new Uint8Array(raw.length);
  for (let i = 0; i < raw.length; i++) out[i] = raw.charCodeAt(i);
  return out;
}

/** bytes → b64 */
export function bytesToB64(bytes: Uint8Array): string {
  let s = '';
  for (const b of bytes) s += String.fromCharCode(b);
  return btoa(s);
}

/** PBKDF2-SHA256 派生（Workers 原生 WebCrypto，10k 迭代 ≈ 数毫秒 CPU） */
export async function pbkdf2(password: string, salt: Uint8Array, iterations: number): Promise<Uint8Array> {
  const key = await crypto.subtle.importKey('raw', new TextEncoder().encode(password), 'PBKDF2', false, ['deriveBits']);
  const bits = await crypto.subtle.deriveBits(
    { name: 'PBKDF2', hash: 'SHA-256', salt: salt as BufferSource, iterations },
    key,
    256,
  );
  return new Uint8Array(bits);
}

/** 生成哈希存储串（供改密/初始化脚本复用） */
export async function hashPassword(password: string, iterations = 10000): Promise<string> {
  const salt = crypto.getRandomValues(new Uint8Array(16));
  const hash = await pbkdf2(password, salt, iterations);
  return `pbkdf2$${iterations}$${bytesToB64(salt)}$${bytesToB64(hash)}`;
}

/** 恒定时间比较，防时序侧信道 */
function timingSafeEqual(a: Uint8Array, b: Uint8Array): boolean {
  if (a.length !== b.length) return false;
  let diff = 0;
  for (let i = 0; i < a.length; i++) diff |= a[i] ^ b[i];
  return diff === 0;
}

/** 校验密码是否匹配存储哈希 */
export async function verifyPassword(password: string, stored: string): Promise<boolean> {
  const parts = stored.split('$');
  if (parts.length !== 4 || parts[0] !== 'pbkdf2') return false;
  const iterations = parseInt(parts[1], 10);
  if (!iterations || iterations < 1 || iterations > 500000) return false;
  try {
    const salt = b64ToBytes(parts[2]);
    const expected = b64ToBytes(parts[3]);
    const actual = await pbkdf2(password, salt, iterations);
    return timingSafeEqual(actual, expected);
  } catch {
    return false;
  }
}

/** 按用户名查管理员 */
export async function findAdminByUsername(db: D1Database, username: string): Promise<AdminUserEntity | null> {
  return db.prepare('SELECT id, username, password_hash FROM admin_users WHERE username = ?')
    .bind(username)
    .first<AdminUserEntity>();
}

/** 修改管理员密码（哈希后落库） */
export async function updateAdminPassword(db: D1Database, username: string, password: string): Promise<void> {
  const hash = await hashPassword(password);
  await db.prepare('UPDATE admin_users SET password_hash = ?, updated_at = DATETIME(\'now\') WHERE username = ?')
    .bind(hash, username)
    .run();
}

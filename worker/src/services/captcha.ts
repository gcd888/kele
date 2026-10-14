import type { D1Database } from '@cloudflare/workers-types';
import { bytesToB64 } from '../db/admin-users';

/**
 * 图形验证码（SVG）：
 * - 4 位字符（去除易混淆 0O1lI），随机旋转/颜色/基线抖动 + 干扰线噪点
 * - 答案存 D1 captchas 表，5 分钟有效，登录时一次性消费（防重放）
 */

/** 验证码有效期（秒） */
const CAPTCHA_TTL = 300;

/** 去除易混淆字符的字母表 */
const ALPHABET = 'ABCDEFGHJKMNPQRSTUVWXYZ23456789';

/** 生成随机验证码文本 */
function randomCode(len = 4): string {
  const buf = crypto.getRandomValues(new Uint32Array(len));
  let s = '';
  for (let i = 0; i < len; i++) s += ALPHABET[buf[i] % ALPHABET.length];
  return s;
}

/** 随机数便捷函数 */
function rnd(max: number): number {
  return crypto.getRandomValues(new Uint8Array(1))[0] % max;
}

/** 单个字符 SVG（随机旋转/颜色/纵向抖动 + 描边） */
function charSvg(ch: string, x: number): string {
  const rotate = rnd(50) - 25;
  const dy = rnd(12) - 6;
  const colors = ['#4f46e5', '#0d9488', '#d97706', '#dc2626', '#7c3aed', '#0f766e'];
  const color = colors[rnd(colors.length)];
  const fontSize = 34 + rnd(6);
  return `<text x="${x}" y="42" font-family="Georgia,serif" font-size="${fontSize}" font-weight="bold" `
    + `fill="${color}" stroke="${color}" stroke-width="0.8" `
    + `transform="rotate(${rotate} ${x + 14} 36)" dy="${dy}">${ch}</text>`;
}

/** 生成 SVG 图形验证码（高强度干扰：贝塞尔曲线网 + 穿字线 + 密集噪点） */
function renderSvg(code: string): string {
  const width = 150;
  const height = 56;
  const lineColors = ['#94a3b8', '#64748b', '#a8a29e', '#78716c'];
  let inner = '';

  // 背景：8 条贯穿画布的贝塞尔曲线（前 4 条浅色打底）
  for (let i = 0; i < 8; i++) {
    const p = () => `${rnd(width)},${rnd(height)}`;
    const ctrl = () => `${rnd(width)},${rnd(height)}`;
    const color = lineColors[rnd(lineColors.length)];
    const sw = i < 4 ? 1 : 1.6;
    inner += `<path d="M ${p()} Q ${ctrl()} ${p()} T ${p()}" fill="none" `
      + `stroke="${color}" stroke-width="${sw}" opacity="${i < 4 ? 0.4 : 0.75}"/>`;
  }
  // 两条斜穿整幅的直线（浅色，视觉分割）
  inner += `<line x1="0" y1="${rnd(height)}" x2="${width}" y2="${rnd(height)}" stroke="#94a3b8" stroke-width="1.2" opacity="0.5"/>`;
  inner += `<line x1="${rnd(width)}" y1="0" x2="${rnd(width)}" y2="${height}" stroke="#a8a29e" stroke-width="1" opacity="0.5"/>`;

  // 噪点（60 个，两档大小）
  for (let i = 0; i < 60; i++) {
    inner += `<circle cx="${rnd(width)}" cy="${rnd(height)}" r="${rnd(2) * 0.8 + 0.6}" fill="#64748b" opacity="0.5"/>`;
  }

  // 字符
  code.split('').forEach((ch, i) => {
    inner += charSvg(ch, 12 + i * 32);
  });

  // 字符之上再压 3 条深色曲线（穿字干扰，OCR 分割更难）
  for (let i = 0; i < 3; i++) {
    const p = () => `${rnd(width)},${10 + rnd(36)}`;
    const ctrl = () => `${rnd(width)},${10 + rnd(36)}`;
    inner += `<path d="M ${p()} Q ${ctrl()} ${p()}" fill="none" `
      + `stroke="#475569" stroke-width="1.4" opacity="0.65"/>`;
  }

  return `<svg xmlns="http://www.w3.org/2000/svg" width="${width}" height="${height}" viewBox="0 0 ${width} ${height}">`
    + `<rect width="100%" height="100%" fill="#f8fafc"/>${inner}</svg>`;
}

/** 签发验证码：落库并返回 { token, svg } */
export async function issueCaptcha(db: D1Database): Promise<{ token: string; svg: string; expiresIn: number }> {
  // 顺带清理过期行
  await db.prepare('DELETE FROM captchas WHERE expires_at < ?').bind(Math.floor(Date.now() / 1000)).run();
  const code = randomCode();
  const token = bytesToB64(crypto.getRandomValues(new Uint8Array(24))).replace(/[+/=]/g, '');
  await db.prepare('INSERT INTO captchas (token, code, expires_at) VALUES (?, ?, ?)')
    .bind(token, code, Math.floor(Date.now() / 1000) + CAPTCHA_TTL)
    .run();
  return { token, svg: renderSvg(code), expiresIn: CAPTCHA_TTL };
}

/**
 * 一次性消费验证码：删除成功才校验比对（原子防重放）。
 * 返回 null 表示 token 无效/过期/已被用；返回 false 表示码错；true 表示通过。
 */
export async function consumeCaptcha(db: D1Database, token: string, input: string): Promise<boolean | null> {
  const row = await db.prepare('DELETE FROM captchas WHERE token = ? AND expires_at >= ? RETURNING code')
    .bind(token, Math.floor(Date.now() / 1000))
    .first<{ code: string }>();
  if (!row) return null;
  return row.code.toUpperCase() === String(input || '').trim().toUpperCase();
}

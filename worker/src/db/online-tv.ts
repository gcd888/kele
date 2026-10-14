import type { D1Database } from '@cloudflare/workers-types';
import type { OnlineTvEntity } from '../types';

/** 查询启用的影视站导航 */
export async function findEnabledOnlineTv(db: D1Database): Promise<OnlineTvEntity[]> {
  const results = await db.prepare('SELECT * FROM online_tv WHERE status = 1 ORDER BY sort ASC, id ASC').all<OnlineTvEntity>();
  return results.results;
}

/** 管理端：全部 */
export async function findAllOnlineTv(db: D1Database): Promise<OnlineTvEntity[]> {
  const results = await db.prepare('SELECT * FROM online_tv ORDER BY sort ASC, id ASC').all<OnlineTvEntity>();
  return results.results;
}

export async function insertOnlineTv(db: D1Database, s: { name: string; url: string; img?: string; description?: string; sort?: number }): Promise<OnlineTvEntity | null> {
  return db.prepare('INSERT INTO online_tv (name, url, img, description, sort, status) VALUES (?, ?, ?, ?, ?, 1) RETURNING *')
    .bind(s.name, s.url, s.img || '', s.description || '', s.sort ?? 0).first<OnlineTvEntity>();
}

export async function updateOnlineTv(db: D1Database, id: number, s: Partial<OnlineTvEntity>): Promise<void> {
  const skip = new Set(['id']);
  const fields: string[] = [];
  const values: unknown[] = [];
  for (const [key, value] of Object.entries(s)) {
    if (!skip.has(key) && value !== undefined) {
      fields.push(`${key} = ?`);
      values.push(value);
    }
  }
  if (fields.length === 0) return;
  values.push(id);
  await db.prepare(`UPDATE online_tv SET ${fields.join(', ')} WHERE id = ?`).bind(...values).run();
}

export async function deleteOnlineTv(db: D1Database, id: number): Promise<boolean> {
  const result = await db.prepare('DELETE FROM online_tv WHERE id = ?').bind(id).run();
  return result.meta.changes > 0;
}

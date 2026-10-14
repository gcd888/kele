import type { D1Database } from '@cloudflare/workers-types';
import type { NoticeEntity } from '../types';

/** 查询启用的公告 */
export async function findEnabledNotices(db: D1Database): Promise<NoticeEntity[]> {
  const results = await db.prepare('SELECT * FROM notices WHERE status = 1 ORDER BY id DESC LIMIT 10').all<NoticeEntity>();
  return results.results;
}

/** 管理端：全部公告 */
export async function findAllNotices(db: D1Database): Promise<NoticeEntity[]> {
  const results = await db.prepare('SELECT * FROM notices ORDER BY id DESC').all<NoticeEntity>();
  return results.results;
}

export async function insertNotice(db: D1Database, content: string): Promise<NoticeEntity | null> {
  return db.prepare('INSERT INTO notices (content, status) VALUES (?, 1) RETURNING *').bind(content).first<NoticeEntity>();
}

export async function updateNotice(db: D1Database, id: number, data: { content?: string; status?: number }): Promise<void> {
  if (data.content !== undefined && data.status !== undefined) {
    await db.prepare(`UPDATE notices SET content = ?, status = ?, updated_at = DATETIME('now') WHERE id = ?`).bind(data.content, data.status, id).run();
  } else if (data.content !== undefined) {
    await db.prepare(`UPDATE notices SET content = ?, updated_at = DATETIME('now') WHERE id = ?`).bind(data.content, id).run();
  } else if (data.status !== undefined) {
    await db.prepare(`UPDATE notices SET status = ?, updated_at = DATETIME('now') WHERE id = ?`).bind(data.status, id).run();
  }
}

export async function deleteNotice(db: D1Database, id: number): Promise<boolean> {
  const result = await db.prepare('DELETE FROM notices WHERE id = ?').bind(id).run();
  return result.meta.changes > 0;
}

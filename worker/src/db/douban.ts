import type { D1Database } from '@cloudflare/workers-types';
import type { DoubanItemEntity, DoubanItemInput } from '../types';

/** 查询热播榜单 */
export async function findDoubanItems(
  db: D1Database,
  mediaType: 'tv' | 'movie' | 'variety',
  category = '',
  limit = 50,
): Promise<DoubanItemEntity[]> {
  const rows = category
    ? await db.prepare(
        `SELECT * FROM douban_items WHERE media_type = ? AND category = ? ORDER BY rating_value DESC LIMIT ?`
      ).bind(mediaType, category, limit).all<DoubanItemEntity>()
    : await db.prepare(
        `SELECT * FROM douban_items WHERE media_type = ? ORDER BY rating_value DESC LIMIT ?`
      ).bind(mediaType, limit).all<DoubanItemEntity>();
  return rows.results;
}

/** 清空某类型（全量更新前调用） */
export async function clearDoubanByType(db: D1Database, mediaType: string): Promise<void> {
  await db.prepare('DELETE FROM douban_items WHERE media_type = ?').bind(mediaType).run();
}

/** 批量 upsert 豆瓣条目 */
export async function batchUpsertDoubanItems(db: D1Database, items: DoubanItemInput[]): Promise<void> {
  if (items.length === 0) return;
  const stmt = db.prepare(
    `INSERT INTO douban_items (douban_id, title, media_type, category, rating_value, rating_count, year, area, genres, cover_url, url, card_subtitle, raw_json)
     VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
     ON CONFLICT(douban_id, media_type, category) DO UPDATE SET
       title = excluded.title, rating_value = excluded.rating_value, rating_count = excluded.rating_count,
       year = excluded.year, area = excluded.area, genres = excluded.genres, cover_url = excluded.cover_url,
       url = excluded.url, card_subtitle = excluded.card_subtitle, raw_json = excluded.raw_json,
       updated_at = DATETIME('now')`
  );
  const BATCH = 20;
  for (let i = 0; i < items.length; i += BATCH) {
    const batch = items.slice(i, i + BATCH).map(item =>
      stmt.bind(item.douban_id, item.title, item.media_type, item.category, item.rating_value,
        item.rating_count, item.year, item.area, item.genres, item.cover_url, item.url, item.card_subtitle, item.raw_json));
    await db.batch(batch);
  }
}

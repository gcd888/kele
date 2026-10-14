import type { D1Database } from '@cloudflare/workers-types';
import type { DoubanItemEntity, DoubanItemInput } from '../types';

/** 查询热播榜单（按豆瓣近期热度原始序号排序，rank 相同再按评分兜底） */
export async function findDoubanItems(
  db: D1Database,
  mediaType: 'tv' | 'movie' | 'variety',
  category = '',
  limit = 50,
): Promise<DoubanItemEntity[]> {
  const rows = category
    ? await db.prepare(
        `SELECT * FROM douban_items WHERE media_type = ? AND category = ? ORDER BY rank ASC, rating_value DESC LIMIT ?`
      ).bind(mediaType, category, limit).all<DoubanItemEntity>()
    : await db.prepare(
        `SELECT * FROM douban_items WHERE media_type = ? ORDER BY rank ASC, rating_value DESC LIMIT ?`
      ).bind(mediaType, limit).all<DoubanItemEntity>();
  return rows.results;
}

/** 清空某类型（全量更新前调用） */
export async function clearDoubanByType(db: D1Database, mediaType: string): Promise<void> {
  await db.prepare('DELETE FROM douban_items WHERE media_type = ?').bind(mediaType).run();
}

/** 批量插入豆瓣条目（写入前调用方已 clearDoubanByType，先删再插） */
export async function batchInsertDoubanItems(db: D1Database, items: DoubanItemInput[]): Promise<void> {
  if (items.length === 0) return;
  const stmt = db.prepare(
    `INSERT INTO douban_items (douban_id, title, media_type, category, rating_value, rating_count, year, area, genres, cover_url, url, card_subtitle, raw_json, rank)
     VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)`
  );
  const BATCH = 20;
  for (let i = 0; i < items.length; i += BATCH) {
    const batch = items.slice(i, i + BATCH).map(item =>
      stmt.bind(item.douban_id, item.title, item.media_type, item.category, item.rating_value,
        item.rating_count, item.year, item.area, item.genres, item.cover_url, item.url, item.card_subtitle, item.raw_json, item.rank));
    await db.batch(batch);
  }
}

import type { D1Database } from '@cloudflare/workers-types';
import type { ResourceEntity, CloudType, ValidStatus } from '../types';

/**
 * 资源表数据库操作
 */

/** 缓存查询：按关键词（新鲜结果，is_valid 排序：有效>待检>无效） */
export async function findResourcesByKeyword(
  db: D1Database,
  keyword: string,
  cloudType: string = 'all',
  page: number = 1,
  pageSize: number = 20,
): Promise<{ results: ResourceEntity[]; total: number }> {
  const where = cloudType !== 'all' ? 'keyword = ? AND cloud_type = ?' : 'keyword = ?';
  const countParams = cloudType !== 'all' ? [keyword, cloudType] : [keyword];

  const countResult = await db.prepare(
    `SELECT COUNT(*) as total FROM resources WHERE ${where}`
  ).bind(...countParams).first<{ total: number }>();
  const total = countResult?.total ?? 0;

  const offset = (page - 1) * pageSize;
  const queryStr = `SELECT * FROM resources WHERE ${where} ORDER BY is_valid DESC, heat DESC, created_at DESC LIMIT ? OFFSET ?`;
  const queryParams = [...countParams, pageSize, offset];
  const results = await db.prepare(queryStr).bind(...queryParams).all<ResourceEntity>();
  return { results: results.results, total };
}

/** 缓存查询：返回全部（SSE 快路径用，含最终 validity） */
export async function findAllResourcesByKeyword(
  db: D1Database,
  keyword: string,
  freshMinutes = 120,
): Promise<ResourceEntity[]> {
  const results = await db.prepare(
    `SELECT * FROM resources WHERE keyword = ? AND updated_at > DATETIME('now', '-${freshMinutes} minutes')
     ORDER BY is_valid DESC, heat DESC, created_at DESC LIMIT 200`
  ).bind(keyword).all<ResourceEntity>();
  return results.results;
}

/** 降级查询：忽略新鲜度的旧缓存（stale） */
export async function findStaleResourcesByKeyword(db: D1Database, keyword: string): Promise<ResourceEntity[]> {
  const results = await db.prepare(
    `SELECT * FROM resources WHERE keyword = ? ORDER BY is_valid DESC, heat DESC, created_at DESC LIMIT 200`
  ).bind(keyword).all<ResourceEntity>();
  return results.results;
}

/** 查询预热资源（Cron 预热写入） */
export async function findPreheatedResources(db: D1Database, limit = 40): Promise<ResourceEntity[]> {
  const results = await db.prepare(
    `SELECT * FROM resources WHERE is_preheated > 0 AND is_valid = 1 ORDER BY heat DESC, created_at DESC LIMIT ?`
  ).bind(limit).all<ResourceEntity>();
  return results.results;
}

/** 按 ID 查询 */
export async function findResourceById(db: D1Database, id: number): Promise<ResourceEntity | null> {
  return db.prepare('SELECT * FROM resources WHERE id = ?').bind(id).first<ResourceEntity>();
}

/** 按 URL 查询 */
export async function findResourceByUrl(db: D1Database, url: string): Promise<ResourceEntity | null> {
  return db.prepare('SELECT * FROM resources WHERE url = ?').bind(url).first<ResourceEntity>();
}

/** 插入资源（url UNIQUE 自动去重；已存在时刷新 updated_at） */
export async function insertResource(
  db: D1Database,
  r: {
    title: string; url: string; cloud_type: CloudType; is_valid: ValidStatus;
    source: string; keyword: string; is_preheated: number; description: string;
    heat: number; expire_at: string | null; cover?: string;
  },
): Promise<ResourceEntity | null> {
  const saved = await db.prepare(
    `INSERT INTO resources (title, url, cloud_type, is_valid, source, keyword, is_preheated, description, cover, heat, expire_at)
     VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
     ON CONFLICT(url) DO UPDATE SET updated_at = DATETIME('now'), expire_at = excluded.expire_at
     RETURNING *`
  ).bind(r.title, r.url, r.cloud_type, r.is_valid, r.source, r.keyword, r.is_preheated, r.description, r.cover || '', r.heat, r.expire_at)
    .first<ResourceEntity>();
  return saved ?? null;
}

/** 更新有效性 */
export async function updateResourceValidity(db: D1Database, id: number, isValid: ValidStatus): Promise<void> {
  await db.prepare(`UPDATE resources SET is_valid = ?, updated_at = DATETIME('now') WHERE id = ?`).bind(isValid, id).run();
}

/** 按 URL 更新有效性 */
export async function updateResourceValidityByUrl(db: D1Database, url: string, isValid: ValidStatus): Promise<void> {
  await db.prepare(`UPDATE resources SET is_valid = ?, updated_at = DATETIME('now') WHERE url = ?`).bind(isValid, url).run();
}

/** 删除关键词对应预热缓存 */
export async function deletePreheatedByKeyword(db: D1Database, keyword: string): Promise<number> {
  const result = await db.prepare('DELETE FROM resources WHERE keyword = ? AND is_preheated >= 1').bind(keyword).run();
  return result.meta.changes;
}

/** 批量插入资源标签 */
export async function insertResourceTags(db: D1Database, resourceId: number, tags: string[]): Promise<void> {
  if (tags.length === 0) return;
  const stmt = db.prepare('INSERT OR IGNORE INTO resource_tags (resource_id, tag) VALUES (?, ?)');
  await db.batch(tags.map(tag => stmt.bind(resourceId, tag)));
}

/** 查询资源标签 */
export async function findResourceTags(db: D1Database, resourceId: number): Promise<string[]> {
  const results = await db.prepare('SELECT tag FROM resource_tags WHERE resource_id = ?').bind(resourceId).all<{ tag: string }>();
  return results.results.map(r => r.tag);
}

/** 清理过期缓存 */
export async function cleanupExpiredResources(db: D1Database, days = 5): Promise<number> {
  const result = await db.prepare(
    `DELETE FROM resources WHERE is_preheated <= 1 AND expire_at < DATETIME('now', '-${days} days')`
  ).run();
  return result.meta.changes;
}

/** 统计 */
export async function countResources(db: D1Database): Promise<{ total: number; valid: number; preheated: number }> {
  const total = await db.prepare('SELECT COUNT(*) as count FROM resources').first<{ count: number }>();
  const valid = await db.prepare('SELECT COUNT(*) as count FROM resources WHERE is_valid = 1').first<{ count: number }>();
  const preheated = await db.prepare('SELECT COUNT(*) as count FROM resources WHERE is_preheated > 0').first<{ count: number }>();
  return { total: total?.count ?? 0, valid: valid?.count ?? 0, preheated: preheated?.count ?? 0 };
}

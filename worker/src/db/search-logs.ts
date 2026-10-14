import type { D1Database } from '@cloudflare/workers-types';

/** 写搜索日志（走 ctx.waitUntil 异步调用） */
export async function insertSearchLog(
  db: D1Database,
  keyword: string,
  ipHash: string,
  hasResult: boolean,
  resultCount: number,
  tookMs: number,
): Promise<void> {
  await db.prepare(
    'INSERT INTO search_logs (keyword, ip_hash, has_result, result_count, took_ms) VALUES (?, ?, ?, ?, ?)'
  ).bind(keyword, ipHash, hasResult ? 1 : 0, resultCount, tookMs).run();
}

/** 聚合前一天日志 → 热搜词 */
export async function aggregateHotKeywords(db: D1Database): Promise<number> {
  const rows = await db.prepare(
    `SELECT keyword, COUNT(*) as cnt FROM search_logs
     WHERE created_at > DATETIME('now', '-1 day') GROUP BY keyword ORDER BY cnt DESC LIMIT 50`
  ).all<{ keyword: string; cnt: number }>();
  for (const row of rows.results) {
    await db.prepare(
      `INSERT INTO hot_keywords (keyword, search_count, period) VALUES (?, ?, 'daily')
       ON CONFLICT(keyword) DO UPDATE SET search_count = ?, updated_at = DATETIME('now')`
    ).bind(row.keyword, row.cnt, row.cnt).run();
  }
  return rows.results.length;
}

/** 查询热搜词 */
export async function findHotKeywords(db: D1Database, limit = 20): Promise<Array<{ keyword: string; search_count: number }>> {
  const results = await db.prepare(
    `SELECT keyword, search_count FROM hot_keywords WHERE period = 'daily' ORDER BY search_count DESC LIMIT ?`
  ).bind(limit).all<{ keyword: string; search_count: number }>();
  return results.results;
}

/** 取热门词（预热 Cron 用） */
export async function findTopKeywordsForPrefetch(db: D1Database, limit = 10): Promise<string[]> {
  const results = await db.prepare(
    `SELECT keyword FROM hot_keywords WHERE period = 'daily' ORDER BY search_count DESC LIMIT ?`
  ).bind(limit).all<{ keyword: string }>();
  return results.results.map(r => r.keyword);
}

/** 清理 30 天前日志（days 仅允许正整数，参数化绑定防拼接注入） */
export async function cleanupOldSearchLogs(db: D1Database, days = 30): Promise<number> {
  const d = Math.max(1, Math.floor(days) || 30);
  const result = await db.prepare(`DELETE FROM search_logs WHERE created_at < DATETIME('now', ?)`)
    .bind(`-${d} days`)
    .run();
  return result.meta.changes;
}

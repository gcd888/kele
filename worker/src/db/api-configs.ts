import type { D1Database } from '@cloudflare/workers-types';
import type { ApiConfigEntity } from '../types';

/** 查询所有参与扇出的源（手动启用且未熔断），按优先级降序 */
export async function findActiveSources(db: D1Database): Promise<ApiConfigEntity[]> {
  const now = new Date().toISOString();
  const results = await db.prepare(
    `SELECT * FROM api_configs WHERE status = 1 AND enabled = 1 AND (disabled_until IS NULL OR disabled_until < ?) ORDER BY priority DESC`
  ).bind(now).all<ApiConfigEntity>();
  return results.results;
}

/** 查询所有配置（管理端） */
export async function findAllSources(db: D1Database): Promise<ApiConfigEntity[]> {
  const results = await db.prepare('SELECT * FROM api_configs ORDER BY priority DESC, id ASC').all<ApiConfigEntity>();
  return results.results;
}

/** 按 ID 查询 */
export async function findSourceById(db: D1Database, id: number): Promise<ApiConfigEntity | null> {
  return db.prepare('SELECT * FROM api_configs WHERE id = ?').bind(id).first<ApiConfigEntity>();
}

/** 新增源 */
export async function insertSource(db: D1Database, s: Partial<ApiConfigEntity>): Promise<ApiConfigEntity | null> {
  return db.prepare(
    `INSERT INTO api_configs (name, url, method, request_type, headers, body_template, result_paths, field_map, source_type, timeout_ms, status, priority)
     VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING *`
  ).bind(
    s.name!, s.url!, s.method || 'GET', s.request_type || 'declarative',
    s.headers || '{}', s.body_template || '', s.result_paths || '[]', s.field_map || '{}',
    s.source_type || 'api', s.timeout_ms ?? 3000, s.status ?? 1, s.priority ?? 0,
  ).first<ApiConfigEntity>();
}

/** 更新源（允许部分字段；列名走白名单，防 PUT body 任意键注入 SQL） */
const SOURCE_UPDATABLE = new Set(['name', 'url', 'method', 'request_type', 'headers', 'body_template', 'result_paths', 'field_map', 'source_type', 'timeout_ms', 'status', 'priority', 'enabled', 'disabled_until']);

export async function updateSource(db: D1Database, id: number, s: Partial<ApiConfigEntity>): Promise<void> {
  const fields: string[] = [];
  const values: unknown[] = [];
  for (const [key, value] of Object.entries(s)) {
    if (SOURCE_UPDATABLE.has(key) && value !== undefined) {
      fields.push(`${key} = ?`);
      values.push(value);
    }
  }
  if (fields.length === 0) return;
  values.push(id);
  await db.prepare(`UPDATE api_configs SET ${fields.join(', ')} WHERE id = ?`).bind(...values).run();
}

/** 删除源 */
export async function deleteSource(db: D1Database, id: number): Promise<boolean> {
  const result = await db.prepare('DELETE FROM api_configs WHERE id = ?').bind(id).run();
  return result.meta.changes > 0;
}

/**
 * 源调用结果记账（健康度 + 熔断）
 * - 成功：fail_count=0，记录延迟与时间
 * - 失败：fail_count+1，≥3 次熔断（enabled=0, disabled_until=now+30min）
 */
export async function recordSourceResult(db: D1Database, id: number, ok: boolean, latencyMs: number): Promise<void> {
  if (ok) {
    await db.prepare(
      `UPDATE api_configs SET fail_count = 0, last_ok_at = DATETIME('now'), last_latency_ms = ?,
       enabled = 1, disabled_until = NULL WHERE id = ?`
    ).bind(latencyMs, id).run();
    return;
  }
  const config = await findSourceById(db, id);
  if (!config) return;
  const failCount = config.fail_count + 1;
  if (failCount >= 3) {
    const until = new Date(Date.now() + 30 * 60 * 1000).toISOString();
    await db.prepare(`UPDATE api_configs SET fail_count = ?, enabled = 0, disabled_until = ? WHERE id = ?`)
      .bind(failCount, until, id).run();
  } else {
    await db.prepare(`UPDATE api_configs SET fail_count = ? WHERE id = ?`).bind(failCount, id).run();
  }
}

/** 查询所有熔断中的源（探测 Cron 用） */
export async function findCircuitBrokenSources(db: D1Database): Promise<ApiConfigEntity[]> {
  const results = await db.prepare(
    `SELECT * FROM api_configs WHERE enabled = 0 AND disabled_until IS NOT NULL`
  ).all<ApiConfigEntity>();
  return results.results;
}

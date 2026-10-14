import type { D1Database } from '@cloudflare/workers-types';
import type { CloudTypeEntity } from '../types';

/** 查询启用的网盘类型 */
export async function findEnabledCloudTypes(db: D1Database): Promise<CloudTypeEntity[]> {
  const results = await db.prepare('SELECT * FROM cloud_types WHERE status = 1 ORDER BY sort_order ASC').all<CloudTypeEntity>();
  return results.results;
}

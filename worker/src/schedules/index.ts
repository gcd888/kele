import type { D1Database } from '@cloudflare/workers-types';
import { crawlDoubanAndSave } from '../crawlers/douban';
import { aggregateHotKeywords, cleanupOldSearchLogs } from '../db/search-logs';
import { cleanupExpiredResources } from '../db/resources';

/** 豆瓣榜单全量更新（每天 0 点） */
export async function runDoubanCrawler(db: D1Database) {
  const stats = await crawlDoubanAndSave(db);
  console.log('豆瓣爬虫完成:', JSON.stringify(stats));
}

/** 聚合热搜（每天 5 点） */
export async function runAggregate(db: D1Database) {
  const n = await aggregateHotKeywords(db);
  console.log(`热搜聚合完成: ${n} 词`);
}

/** 清理过期缓存与旧日志（每天 3 点） */
export async function runCleanup(db: D1Database) {
  const r1 = await cleanupExpiredResources(db, 5);
  const r2 = await cleanupOldSearchLogs(db, 30);
  console.log(`缓存清理完成: resources=${r1}, logs=${r2}`);
}

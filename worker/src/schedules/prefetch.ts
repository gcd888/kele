import type { D1Database } from '@cloudflare/workers-types';
import type { CrawlerResult } from '../types';
import { ValidStatus as VS } from '../types';
import { findTopKeywordsForPrefetch } from '../db/search-logs';
import { insertResource, updateResourceValidityByUrl } from '../db/resources';
import { buildAdapters, fetchSourceWithTimeout } from '../sources';
import { checkValidity } from '../services/validity';

/**
 * 热搜词预热（每天 0:30 / 12:30）
 * 取热搜 TOP10 词 → 多源扇出 → 落库 is_preheated=1 → 每词校验 5 条
 */
export async function runPrefetch(db: D1Database): Promise<void> {
  const keywords = await findTopKeywordsForPrefetch(db, 10);
  console.log(`预热开始: ${keywords.length} 词`);

  for (const kw of keywords) {
    try {
      const bundles = await buildAdapters(db);
      const settled = await Promise.allSettled(
        bundles.map((b) => fetchSourceWithTimeout(b, kw, 1).catch(() => [] as CrawlerResult[])),
      );

      const seen = new Set<string>();
      const items: CrawlerResult[] = [];
      for (const r of settled) {
        if (r.status !== 'fulfilled') continue;
        for (const cr of r.value) {
          if (!cr.url || seen.has(cr.url)) continue;
          seen.add(cr.url);
          items.push(cr);
        }
      }

      const expireAt = new Date(Date.now() + 5 * 24 * 60 * 60 * 1000).toISOString();
      for (const cr of items) {
        await insertResource(db, {
          title: cr.title,
          url: cr.url,
          cloud_type: cr.cloudType,
          is_valid: VS.PENDING,
          source: cr.source,
          keyword: kw,
          is_preheated: 1,
          description: cr.description,
          heat: 0,
          expire_at: expireAt,
          cover: cr.cover || '',
        }).catch(() => undefined);
      }

      // 每词校验 5 条
      await Promise.allSettled(
        items.slice(0, 5).map(async (cr) => {
          const v = await checkValidity(cr.url, cr.cloudType);
          if (v !== 'unknown') {
            await updateResourceValidityByUrl(db, cr.url, v === 'valid' ? VS.VALID : VS.INVALID).catch(() => undefined);
          }
        }),
      );

      console.log(`预热完成: ${kw} → ${items.length} 条`);
    } catch (e) {
      console.error(`预热失败: ${kw}`, e);
    }
  }
}

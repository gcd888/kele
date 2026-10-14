import type { D1Database } from '@cloudflare/workers-types';
import { findCircuitBrokenSources, recordSourceResult } from '../db/api-configs';
import { buildAdapterFor, fetchSourceWithTimeout } from '../sources';

/**
 * 熔断源探测恢复（每小时 15 分）
 * 找 disabled_until 已过期的熔断源 → kw='测试' 真实请求 →
 * 成功 recordSourceResult(true) 自动恢复（fail_count=0, enabled=1），
 * 失败则续期熔断 30 分钟
 */
export async function runProbe(db: D1Database): Promise<void> {
  const now = new Date().toISOString();
  const broken = (await findCircuitBrokenSources(db)).filter(
    (s) => s.disabled_until && s.disabled_until < now,
  );
  if (broken.length === 0) return;

  console.log(`熔断探测: ${broken.length} 个源到期`);
  for (const source of broken) {
    const bundle = buildAdapterFor(source);
    if (!bundle) continue;
    const t0 = Date.now();
    let ok = false;
    try {
      const results = await fetchSourceWithTimeout(bundle, '测试', 1);
      ok = Array.isArray(results); // 能拿到响应（哪怕 0 条）即视为源可达
    } catch {
      ok = false;
    }
    const tookMs = Date.now() - t0;
    await recordSourceResult(db, source.id, ok, tookMs).catch(() => undefined);
    console.log(`探测 ${source.name}: ${ok ? '恢复' : '仍失败'} (${tookMs}ms)`);
  }
}

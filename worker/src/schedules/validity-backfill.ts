import type { D1Database } from '@cloudflare/workers-types';
import type { CloudType } from '../types';
import { ValidStatus as VS } from '../types';
import { findPendingCheckResources, updateResourceValidityByUrl, touchResourceUpdatedAtByUrl } from '../db/resources';
import { checkValidity } from '../services/validity';

/**
 * 未检测资源兜底校验（每小时 40 分，搜寻/校验拆分方案 B）
 * 扫最新 30 条 is_valid=PENDING 且可检测类型（quark/baidu/aliyun/uc）的未过期资源，
 * 校验结论写回 is_valid —— 让缓存路径的有效性覆盖越来越全。
 * 独立 Cron 调用独享 50 子请求预算，30 条检测安全裕量充足。
 */
export async function runValidityBackfill(db: D1Database): Promise<void> {
  let targets: Array<{ url: string; cloud_type: string }> = [];
  try {
    targets = await findPendingCheckResources(db, 30);
  } catch (e) {
    console.error('兜底校验查询失败:', e);
    return;
  }
  if (targets.length === 0) return;
  console.log(`兜底校验: ${targets.length} 条待检`);

  const checked = await Promise.allSettled(
    targets.map(async (t) => ({
      url: t.url,
      validity: await checkValidity(t.url, t.cloud_type as CloudType),
    })),
  );

  let valid = 0;
  let invalid = 0;
  for (const r of checked) {
    if (r.status !== 'fulfilled' || r.value.validity === 'unknown') {
      // 无结论：仅刷新时间戳做冷却，下轮兜底不再优先重试
      if (r.status === 'fulfilled') await touchResourceUpdatedAtByUrl(db, r.value.url).catch(() => undefined);
      continue;
    }
    await updateResourceValidityByUrl(
      db,
      r.value.url,
      r.value.validity === 'valid' ? VS.VALID : VS.INVALID,
    ).catch(() => undefined);
    if (r.value.validity === 'valid') valid++;
    else invalid++;
  }
  console.log(`兜底校验完成: 有效 ${valid} / 失效 ${invalid} / 无结论 ${targets.length - valid - invalid}`);
}

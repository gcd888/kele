/**
 * 前端类型定义（与 worker/src/types 保持一致）
 */

export type CloudType = 'quark' | 'aliyun' | 'baidu' | 'uc' | 'xunlei' | 'tianyi' | 'other';

export type Validity = 'unknown' | 'valid' | 'invalid';

/** API 响应信封 */
export interface Envelope<T = unknown> {
  code: number;
  msg: string;
  data?: T;
  error?: string;
}

/** 统一资源模型（SSE source_result 条目；缓存命中条目带 id，可报失效） */
export interface Resource {
  id?: number;
  title: string;
  url: string;
  cloud_type: CloudType;
  passcode?: string;
  note?: string;
  tags?: string[];
  cover?: string;
  published_at?: string;
  source_id: string;
  validity: Validity;
}

/** 公告 */
export interface NoticeEntity {
  id: number;
  content: string;
  status: number;
  created_at: string;
  updated_at?: string;
}

/** 影视站导航 */
export interface OnlineTvEntity {
  id: number;
  name: string;
  url: string;
  img: string;
  description: string;
  status: number;
  sort: number;
}

/** 豆瓣热播条目（trending 接口返回） */
export interface DoubanItemEntity {
  id: number;
  title: string;
  media_type: string;
  category?: string;
  rating_value: number;
  rating_count?: number;
  year: string;
  cover_url: string;
  card_subtitle: string;
}

/** 源配置实体（管理端） */
export interface ApiConfigEntity {
  id: number;
  name: string;
  url: string;
  method: 'GET' | 'POST';
  request_type: string;
  headers: string;
  body_template: string;
  result_paths: string;
  field_map: string;
  source_type: string;
  timeout_ms: number;
  status: number;
  enabled: number;
  priority: number;
  fail_count: number;
  disabled_until: string | null;
  last_ok_at: string | null;
  last_latency_ms: number | null;
  created_at: string;
}

/** 管理端概览统计 */
export interface AdminStats {
  resources: { total: number; valid: number; preheated: number };
  sources: {
    total: number;
    active: number;
    circuitBroken: number;
    manualDisabled: number;
  };
  validity: { valid: number; invalid: number; pending: number };
  pendingByType: Record<string, number>;
  todaySearches: number;
  doubanItems: number;
}

/** 定时任务静态清单项 */
export interface CronTask {
  key: string;
  name: string;
  description: string;
  cron: string;
}

/** 源测试连通结果 */
export interface SourceTestResult {
  ok: boolean;
  count: number;
  latencyMs: number;
  error?: string;
  sample?: string[];
}

/** SSE 事件载荷 */
export interface StreamMeta {
  searchId: string;
  kw: string;
  sources: Array<{ id: number; name: string }>;
  cached: boolean;
}

export interface ValidityResult {
  url: string;
  validity: 'valid' | 'invalid';
}

export interface SourceDonePayload {
  sourceId: number;
  ok: boolean;
  count: number;
  tookMs: number;
  error?: string;
}

export interface DonePayload {
  total: number;
  cached: boolean;
  stale: boolean;
  tookMs: number;
}

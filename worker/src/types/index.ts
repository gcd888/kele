/**
 * 公共类型定义（网盘聚合搜索 · kele v2）
 */
export type { Env } from './env';

/** 网盘类型 */
export type CloudType = 'quark' | 'aliyun' | 'baidu' | 'uc' | 'xunlei' | 'tianyi' | 'other';

/** 链接有效性：0=无效 1=有效 2=待检测 */
export enum ValidStatus {
  INVALID = 0,
  VALID = 1,
  PENDING = 2,
}

/** 统一资源模型（源归一化输出 / 前端渲染模型） */
export interface Resource {
  /** 缓存命中条目带 DB id（报失效用）；扇出条目无 */
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
  validity: 'unknown' | 'valid' | 'invalid';
}

/** API 响应信封 */
export interface ApiResponse<T = unknown> {
  code: number;
  msg: string;
  data?: T;
  error?: string;
}

/** 资源实体（D1 resources 表映射） */
export interface ResourceEntity {
  id: number;
  title: string;
  url: string;
  cloud_type: CloudType;
  is_valid: ValidStatus;
  source: string;
  keyword: string;
  is_preheated: number;
  description: string;
  cover: string;
  heat: number;
  created_at: string;
  updated_at: string;
  expire_at: string | null;
}

/** 源配置实体（D1 api_configs 表映射，含 L0 声明式扩展列） */
export interface ApiConfigEntity {
  id: number;
  name: string;
  url: string;
  method: 'GET' | 'POST';
  request_type: string;      // 解析器标识（L1/L2 注册表 key）
  headers: string;           // JSON
  body_template: string;     // POST 体模板，{kw}/{page} 占位
  result_paths: string;      // L0: JSON 数组，结果数组所在路径
  field_map: string;         // L0: JSON，字段映射
  source_type: 'api' | 'html';
  timeout_ms: number;
  status: number;            // 1=启用 0=停用
  enabled: number;           // 1=启用 0=熔断禁用（与 status 区分：手动 vs 自动）
  priority: number;
  fail_count: number;
  disabled_until: string | null;
  last_ok_at: string | null;
  last_latency_ms: number | null;
  created_at: string;
}

/** 网盘类型实体 */
export interface CloudTypeEntity {
  id: number;
  name: string;
  cloud_type: CloudType;
  url_pattern: string;
  sort_order: number;
  status: number;
}

/** 公告实体 */
export interface NoticeEntity {
  id: number;
  content: string;
  status: number;
  created_at: string;
  updated_at: string;
}

/** 影视站导航实体 */
export interface OnlineTvEntity {
  id: number;
  name: string;
  url: string;
  img: string;
  description: string;
  status: number;
  sort: number;
}

/** 豆瓣条目实体 */
export interface DoubanItemEntity {
  id: number;
  douban_id: string;
  title: string;
  media_type: 'tv' | 'movie' | 'variety';
  category: string;
  rating_value: number;
  rating_count: number;
  year: string;
  area: string;
  genres: string;
  cover_url: string;
  url: string;
  card_subtitle: string;
  raw_json: string;
  created_at: string;
  updated_at: string;
}

/** 豆瓣条目写入模型 */
export interface DoubanItemInput {
  douban_id: string;
  title: string;
  media_type: 'tv' | 'movie' | 'variety';
  category: string;
  rating_value: number;
  rating_count: number;
  year: string;
  area: string;
  genres: string;
  cover_url: string;
  url: string;
  card_subtitle: string;
  raw_json: string;
}

/** 源适配器归一化爬取结果 */
export interface CrawlerResult {
  title: string;
  url: string;
  cloudType: CloudType;
  description: string;
  tags: string[];
  source: string;
  cover?: string;
  passcode?: string;
}

/** SSE 搜索事件 */
export type SearchStreamEvent =
  | { type: 'meta'; searchId: string; kw: string; sources: Array<{ id: number; name: string }>; cached: boolean }
  | { type: 'source_result'; sourceId: number; items: Resource[] }
  | { type: 'validity'; sourceId: number; results: Array<{ url: string; validity: 'valid' | 'invalid' }> }
  | { type: 'source_done'; sourceId: number; ok: boolean; count: number; tookMs: number; error?: string }
  | { type: 'done'; total: number; cached: boolean; stale: boolean; tookMs: number }
  | { type: 'error'; sourceId?: number; message: string };

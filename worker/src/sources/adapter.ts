import type { ApiConfigEntity, CrawlerResult, CloudType } from '../types';
import { detectCloudType } from '../utils';

/**
 * 源适配器接口（三级接入体系，docs/03 §3.3）
 * L0 声明式（DeclarativeAdapter）/ L1 解析器（ApiAdapter）/ L2 定向爬虫（ScraperAdapter）
 */
export interface SourceAdapter {
  readonly id: number;
  readonly name: string;
  readonly priority: number;
  readonly timeoutMs: number;
  fetch(kw: string, page: number, signal?: AbortSignal): Promise<CrawlerResult[]>;
}

/** 超时兜底 signal（调用方未传时使用） */
export function ensureSignal(signal: AbortSignal | undefined, timeoutMs = 15000): AbortSignal {
  if (signal) return signal;
  const ac = new AbortController();
  setTimeout(() => ac.abort(), timeoutMs);
  return ac.signal;
}

// ========== JSON 路径求值（L0 声明式核心） ==========

type PathStep = { key: string } | { index: number } | { each: true };

/** 解析 a.b[*].c / images[0] 形式的路径 */
function parsePath(path: string): PathStep[] {
  const steps: PathStep[] = [];
  for (const seg of path.split('.')) {
    const m = seg.match(/^([^[\]]*)(\[(\d+|\*)\])?$/);
    if (!m) continue;
    if (m[1]) steps.push({ key: m[1] });
    if (m[2]) {
      if (m[3] === '*') steps.push({ each: true });
      else steps.push({ index: parseInt(m[3], 10) });
    }
  }
  return steps;
}

function resolvePath(cur: unknown, steps: PathStep[]): unknown {
  if (steps.length === 0) return cur;
  const [head, ...rest] = steps;
  if ('each' in head) {
    if (!Array.isArray(cur)) return undefined;
    return cur.map((item) => resolvePath(item, rest)).filter((v) => v !== undefined);
  }
  if ('index' in head) {
    if (!Array.isArray(cur)) return undefined;
    return resolvePath(cur[head.index], rest);
  }
  if (cur === null || typeof cur !== 'object') return undefined;
  return resolvePath((cur as Record<string, unknown>)[head.key], rest);
}

/** JSON 路径取值（. 分隔，支持 [n] 索引与 [*] 展开） */
export function getPath(obj: unknown, path: string): unknown {
  if (!path) return undefined;
  return resolvePath(obj, parsePath(path));
}

/**
 * field_map 值求值：
 *   `'quark'` 单引号包裹 → 字面量常量
 *   其他 → JSON 路径取值
 */
export function evalField(item: unknown, spec: string): unknown {
  const s = spec.trim();
  if (s.length >= 2 && s.startsWith("'") && s.endsWith("'")) return s.slice(1, -1);
  return getPath(item, s);
}

const KNOWN_CLOUD_TYPES: ReadonlySet<string> = new Set(['quark', 'aliyun', 'baidu', 'uc', 'xunlei', 'tianyi']);

/** 网盘类型归一：优先声明的常量，其次 URL 域名兜底 */
function normalizeCloudType(value: unknown, url: string): CloudType {
  const s = String(value ?? '');
  if (KNOWN_CLOUD_TYPES.has(s)) return s as CloudType;
  return detectCloudType(url);
}

/** 提取码后处理：note 文本正则（docs/03 §3.4）→ 失败再试 URL query */
export function matchPasscodeText(text: string): string | undefined {
  return text.match(/(?:提取码|密码|pwd)[:：\s]*([a-zA-Z0-9]{4})/)?.[1];
}

/** 解析 headers 配置 JSON + 默认 UA */
export function parseHeaders(raw: string): Record<string, string> {
  const headers: Record<string, string> = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36',
  };
  try {
    const parsed = JSON.parse(raw || '{}') as Record<string, unknown>;
    for (const [k, v] of Object.entries(parsed)) {
      if (typeof v === 'string') headers[k] = v;
    }
  } catch { /* 非法配置忽略 */ }
  return headers;
}

/** URL / body 模板替换：{kw} 关键词（URL 编码）、{page} 页码 */
export function buildRequestTemplate(tpl: string, kw: string, page: number): string {
  return tpl.replace(/\{kw\}/g, encodeURIComponent(kw)).replace(/\{page\}/g, String(page));
}

// ========== L0 声明式适配器 ==========

/** result_paths 数组项：字符串（共享 field_map）或对象（field_map 覆盖） */
type ResultPathEntry = string | { path: string; field_map?: Record<string, string> };

function safeParse<T>(raw: string, fallback: T): T {
  try {
    return JSON.parse(raw) as T;
  } catch {
    return fallback;
  }
}

/**
 * 按 field_map 把一条结果映射为 CrawlerResult
 * 未配置的字段走默认路径（title/url/note/cloud_type/cover/tags）
 */
function mapItem(item: unknown, fieldMap: Record<string, string>, sourceName: string): CrawlerResult | null {
  if (item === null || typeof item !== 'object') return null;
  const get = (key: string, fallback: string): unknown => evalField(item, fieldMap[key] ?? fallback);

  const url = String(get('url', 'url') ?? '');
  if (!/^https?:\/\//i.test(url)) return null;

  const title = String(get('title', 'title') ?? '').trim();
  const description = String(get('note', 'note') ?? '').trim();
  const cover = String(get('cover', 'cover') ?? '').trim();
  const passcode = String(get('passcode', 'passcode') ?? '').trim();
  const tagsRaw = get('tags', 'tags');
  const tags = Array.isArray(tagsRaw) ? tagsRaw.map(String) : [];

  return {
    title: title || description || url,
    url,
    cloudType: normalizeCloudType(get('cloud_type', 'cloud_type'), url),
    description,
    tags,
    source: sourceName,
    cover: cover || undefined,
    passcode: passcode || undefined,
  };
}

/** 解析 L0 声明式响应（result_paths 多路径 + field_map 求值） */
export function parseDeclarativeResponse(body: string, config: ApiConfigEntity): CrawlerResult[] {
  let data: unknown;
  try {
    data = JSON.parse(body);
  } catch {
    return [];
  }
  const paths = safeParse<ResultPathEntry[]>(config.result_paths || '[]', []);
  const sharedMap = safeParse<Record<string, string>>(config.field_map || '{}', {});
  if (!Array.isArray(paths) || paths.length === 0) return [];

  const out: CrawlerResult[] = [];
  for (const entry of paths) {
    const isObj = typeof entry === 'object' && entry !== null;
    const path = isObj ? entry.path : entry;
    const fieldMap = isObj && entry.field_map ? { ...sharedMap, ...entry.field_map } : sharedMap;
    if (!path) continue;
    const resolved = getPath(data, path);
    const items = Array.isArray(resolved) ? resolved : [];
    for (const item of items) {
      const mapped = mapItem(item, fieldMap, config.name);
      if (mapped) out.push(mapped);
    }
  }
  return out;
}

/** L0 声明式适配器：纯配置驱动，无需写代码 */
export class DeclarativeAdapter implements SourceAdapter {
  constructor(private readonly config: ApiConfigEntity) {}

  get id(): number { return this.config.id; }
  get name(): string { return this.config.name; }
  get priority(): number { return this.config.priority; }
  get timeoutMs(): number { return this.config.timeout_ms || 8000; }

  async fetch(kw: string, page: number, signal?: AbortSignal): Promise<CrawlerResult[]> {
    const url = buildRequestTemplate(this.config.url, kw, page);
    const headers = parseHeaders(this.config.headers);
    const init: RequestInit = { method: this.config.method, headers, signal };

    if (this.config.method === 'POST') {
      if (!headers['Content-Type']) headers['Content-Type'] = 'application/x-www-form-urlencoded';
      if (this.config.body_template) init.body = buildRequestTemplate(this.config.body_template, kw, page);
    }

    const resp = await fetch(url, init);
    if (!resp.ok) throw new Error(`HTTP ${resp.status}`);
    return parseDeclarativeResponse(await resp.text(), this.config);
  }
}

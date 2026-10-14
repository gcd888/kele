import type { CrawlerResult, CloudType } from '../types';
import { detectCloudType } from '../utils';

/**
 * L1 内置解析器注册表（docs/03 §3.2）
 * request_type 命中 PARSERS → 用对应解析器；未命中回退 generic_html
 * 契约见 docs/02 §B.1 与 kelePro Docs/示例项目/kele/src/api.js
 */
export type Parser = (body: string, sourceName: string) => CrawlerResult[];

const CLOUD_TYPE_KEYS: ReadonlySet<string> = new Set(['quark', 'aliyun', 'baidu', 'uc', 'xunlei', 'tianyi']);

/** URL 域名优先，其次分组 key（merged_by_type） */
function cloudTypeFor(url: string, typeKey: string): CloudType {
  const detected = detectCloudType(url);
  if (detected !== 'other') return detected;
  return (CLOUD_TYPE_KEYS.has(typeKey) ? typeKey : 'other') as CloudType;
}

/** 从文本行抽取 链接/提取码（searchApi2/3/4 纯文本契约） */
const LINK_LINE_RE = /链接[:：]\s*(https?:\/\/\S+)/;

function parseAnswerLines(text: string): Array<{ url: string }> {
  const out: Array<{ url: string }> = [];
  for (const line of text.split('\n')) {
    const m = line.match(LINK_LINE_RE);
    if (m) out.push({ url: m[1] });
  }
  return out;
}

/** 从纯文本 content 提取首个非空且非链接的行作为标题（上游 title 常为空字符串，?? 不会触发回退） */
function pickTitleFromContent(content: string): string {
  for (const line of content.split('\n')) {
    const t = line.trim();
    if (t && !/^https?:\/\//i.test(t)) return t;
  }
  return '';
}

// ---------- 通用解析器 ----------

/** 从链接前面的 HTML 片段中提取最有意义的标题（kelePro parsers.ts 迁移） */
function extractTitleFromContext(html: string, urlIndex: number, url: string): string {
  const beforeUrl = html.slice(Math.max(0, urlIndex - 300), urlIndex);

  const anchorMatch = beforeUrl.match(/<a[^>]*>([^<]{2,})<\/a>/);
  if (anchorMatch) {
    const text = anchorMatch[1].trim();
    if (text.length > 2 && !/^\d+$/.test(text)) return text;
  }
  const titleTagMatch = beforeUrl.match(/<(?:h[1-6]|dt|strong|b)[^>]*>([^<]{2,})<\/(?:h[1-6]|dt|strong|b)>/);
  if (titleTagMatch && titleTagMatch[1].trim().length > 2) return titleTagMatch[1].trim();
  const valueMatch = beforeUrl.match(/value=["']([^"']{3,})["']/);
  if (valueMatch) return valueMatch[1].trim();
  const dataTitleMatch = beforeUrl.match(/data-title=["']([^"']{2,})["']/);
  if (dataTitleMatch) return dataTitleMatch[1].trim();
  const textBlockMatch = beforeUrl.match(/>([^<]{8,100})<\/[a-z]+>$/);
  if (textBlockMatch && textBlockMatch[1].trim().length > 4) return textBlockMatch[1].trim();

  // URL 末段降级：无意义长串返回空
  const lastSegment = url.split('/').pop() || '';
  if (/^[a-zA-Z0-9]{10,}$/.test(lastSegment)) return '';
  return decodeURIComponent(lastSegment) || '';
}

const LINK_PATTERNS: Array<{ pattern: RegExp; type: CloudType }> = [
  { pattern: /https?:\/\/pan\.quark\.cn\/s\/[\w]+/g, type: 'quark' },
  { pattern: /https?:\/\/pan\.baidu\.com\/s\/[\w-]+/g, type: 'baidu' },
  { pattern: /https?:\/\/(?:aliyundrive|alipan)\.com\/s\/[\w]+/g, type: 'aliyun' },
  { pattern: /https?:\/\/drive\.uc\.cn\/s\/[\w]+/g, type: 'uc' },
  { pattern: /https?:\/\/pan\.xunlei\.com\/s\/[\w]+/g, type: 'xunlei' },
];

/** 通用 HTML 解析器：正则抽网盘链接 + 上下文标题 */
function genericHtmlParser(body: string, sourceName: string): CrawlerResult[] {
  const results: CrawlerResult[] = [];
  const seen = new Set<string>();
  for (const { pattern, type } of LINK_PATTERNS) {
    for (const match of body.matchAll(pattern)) {
      const url = match[0];
      if (seen.has(url)) continue;
      seen.add(url);
      const title = extractTitleFromContext(body, match.index ?? 0, url);
      if (!title) continue;
      results.push({ title, url, cloudType: type, description: '', tags: [], source: sourceName });
    }
  }
  return results;
}

/** 通用 JSON 解析器：data/list/result/results 容器 + 常见字段名 */
function genericJsonParser(body: string, sourceName: string): CrawlerResult[] {
  try {
    const data = JSON.parse(body) as Record<string, unknown>;
    const rawItems = (data.data ?? data.list ?? data.result ?? data.results ?? []) as Array<Record<string, unknown>>;
    if (!Array.isArray(rawItems)) return [];
    return rawItems
      .map((item) => {
        const url = String(item.url ?? item.shareLink ?? item.share_url ?? '');
        const title = String(item.title ?? item.name ?? item.fileName ?? '');
        if (!url || !title) return null;
        const tagsRaw = item.tags;
        return {
          title,
          url,
          cloudType: detectCloudType(url),
          description: String(item.description ?? item.fileSize ?? ''),
          tags: Array.isArray(tagsRaw) ? tagsRaw.map(String) : typeof tagsRaw === 'string' ? tagsRaw.split(',') : [],
          source: sourceName,
        } satisfies CrawlerResult;
      })
      .filter((r): r is CrawlerResult => r !== null);
  } catch {
    return [];
  }
}

// ---------- 示例项目契约解析器（docs/02 §B.1） ----------

/** searchApi1：iyuns，data.merged_by_type.{type} 按网盘分组 */
function searchApi1Parser(body: string, sourceName: string): CrawlerResult[] {
  try {
    const data = JSON.parse(body) as { data?: { merged_by_type?: Record<string, unknown> } };
    const merged = data?.data?.merged_by_type;
    if (!merged) return [];
    const out: CrawlerResult[] = [];
    for (const [type, raw] of Object.entries(merged)) {
      if (!Array.isArray(raw)) continue;
      for (const item of raw as Array<Record<string, unknown>>) {
        const url = String(item?.url ?? '');
        if (!/^https?:\/\//i.test(url)) continue;
        const description = String(item?.note ?? item?.title ?? '').trim();
        const images = item?.images;
        out.push({
          title: description || url,
          url,
          cloudType: cloudTypeFor(url, type),
          description,
          tags: [],
          source: sourceName,
          cover: Array.isArray(images) && typeof images[0] === 'string' ? images[0] : undefined,
        });
      }
    }
    return out;
  } catch {
    return [];
  }
}

/** searchApi2：eeeob/dbpan 系列，data.list[].answer 纯文本"链接：xxx 提取码：xxxx" */
function searchApi2Parser(body: string, sourceName: string): CrawlerResult[] {
  try {
    const data = JSON.parse(body) as { list?: Array<Record<string, unknown>> };
    const list = Array.isArray(data?.list) ? data.list : [];
    const out: CrawlerResult[] = [];
    for (const item of list) {
      const answer = String(item?.answer ?? '');
      if (!answer) continue;
      const title = String(item?.question ?? '').trim();
      const pic = item?.bd_pic;
      const cover = typeof pic === 'string' && pic ? pic : undefined;
      for (const { url } of parseAnswerLines(answer)) {
        out.push({
          title: title || url,
          url,
          cloudType: detectCloudType(url),
          description: answer,
          tags: [],
          source: sourceName,
          cover,
        });
      }
    }
    return out;
  } catch {
    return [];
  }
}

/** searchApi3：duoduopuzi movies，data.data[].content 纯文本 */
function searchApi3Parser(body: string, sourceName: string): CrawlerResult[] {
  try {
    const data = JSON.parse(body) as { data?: Array<Record<string, unknown>> };
    const arr = Array.isArray(data?.data) ? data.data : [];
    const out: CrawlerResult[] = [];
    for (const item of arr) {
      const content = String(item?.content ?? '');
      if (!content) continue;
      const title = (String(item?.title ?? '').trim() || pickTitleFromContent(content)).trim();
      const coverUrl = item?.coverUrl;
      const cover = typeof coverUrl === 'string' && coverUrl ? coverUrl : undefined;
      for (const { url } of parseAnswerLines(content)) {
        out.push({ title: title || url, url, cloudType: detectCloudType(url), description: content, tags: [], source: sourceName, cover });
      }
    }
    return out;
  } catch {
    return [];
  }
}

/** searchApi4：duoduopuzi crawler，数组聚合，各源 data[].content 纯文本 */
function searchApi4Parser(body: string, sourceName: string): CrawlerResult[] {
  try {
    const data = JSON.parse(body) as unknown;
    const groups = Array.isArray(data) ? data : [];
    const out: CrawlerResult[] = [];
    for (const group of groups as Array<Record<string, unknown>>) {
      const items = Array.isArray(group?.data) ? group.data : [];
      for (const item of items as Array<Record<string, unknown>>) {
        const content = String(item?.content ?? '');
        if (!content) continue;
        const title = (String(item?.title ?? '').trim() || pickTitleFromContent(content)).trim();
        for (const { url } of parseAnswerLines(content)) {
          out.push({ title: title || url, url, cloudType: detectCloudType(url), description: content, tags: [], source: sourceName });
        }
      }
    }
    return out;
  } catch {
    return [];
  }
}

// ---------- 注册表 ----------

export const PARSERS: Record<string, Parser> = {
  generic_html: genericHtmlParser,
  generic_json: genericJsonParser,
  searchApi1: searchApi1Parser,
  searchApi2: searchApi2Parser,
  searchApi3: searchApi3Parser,
  searchApi4: searchApi4Parser,
};

/** 按 request_type 取解析器；未知返回 null（由调用方决定回退） */
export function getParser(requestType: string): Parser | null {
  return PARSERS[requestType] ?? null;
}

/** searchApi3/4 契约：x-api-key = base64(encodeURIComponent("kw:ts")) */
export function generateSearchToken(kw: string): string {
  return btoa(encodeURIComponent(`${kw}:${Date.now()}`));
}

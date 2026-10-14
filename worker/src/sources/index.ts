import type { D1Database } from '@cloudflare/workers-types';
import type { ApiConfigEntity, CrawlerResult } from '../types';
import { findActiveSources } from '../db/api-configs';
import { DeclarativeAdapter, buildRequestTemplate, parseHeaders, type SourceAdapter } from './adapter';
import { getParser, generateSearchToken } from './registry';
import { searchXiaozi } from './scrapers/xiaozi';
import { searchZhuiju } from './scrapers/zhuiju';
import { searchWoog } from './scrapers/woog';
import { searchKkv } from './scrapers/kkv';

/**
 * 源适配器工厂（docs/03 §3.2 三级接入体系）
 * - request_type=declarative            → L0 声明式
 * - request_type 命中 PARSERS           → L1 内置解析器
 * - request_type=xiaozi/zhuiju/woog/kkv  → L2 定向爬虫
 */

/** L1 适配器：URL/请求按配置构建，响应用注册表解析器解析 */
class ApiAdapter implements SourceAdapter {
  constructor(private readonly config: ApiConfigEntity) {}

  get id(): number { return this.config.id; }
  get name(): string { return this.config.name; }
  get priority(): number { return this.config.priority; }
  get timeoutMs(): number { return this.config.timeout_ms || 8000; }

  async fetch(kw: string, page: number, signal?: AbortSignal): Promise<CrawlerResult[]> {
    const parser = getParser(this.config.request_type);
    if (!parser) throw new Error(`未知解析器: ${this.config.request_type}`);

    const url = buildRequestTemplate(this.config.url, kw, page);
    const headers = parseHeaders(this.config.headers);
    if (this.config.request_type === 'searchApi3' || this.config.request_type === 'searchApi4') {
      headers['x-api-key'] = generateSearchToken(kw);
    }

    const init: RequestInit = { method: this.config.method, headers, signal };
    if (this.config.method === 'POST') {
      if (!headers['Content-Type']) headers['Content-Type'] = 'application/x-www-form-urlencoded';
      if (this.config.body_template) init.body = buildRequestTemplate(this.config.body_template, kw, page);
    }

    const resp = await fetch(url, init);
    if (!resp.ok) throw new Error(`HTTP ${resp.status}`);
    return parser(await resp.text(), this.config.name);
  }
}

/** L2 适配器：定向爬虫函数（忽略配置 URL，request_type 命中即用） */
class ScraperAdapter implements SourceAdapter {
  constructor(
    private readonly config: ApiConfigEntity,
    private readonly fn: (kw: string, signal?: AbortSignal) => Promise<CrawlerResult[]>,
  ) {}

  get id(): number { return this.config.id; }
  get name(): string { return this.config.name; }
  get priority(): number { return this.config.priority; }
  get timeoutMs(): number { return this.config.timeout_ms || 15000; }

  async fetch(kw: string, _page: number, signal?: AbortSignal): Promise<CrawlerResult[]> {
    return this.fn(kw, signal);
  }
}

export interface AdapterBundle {
  adapter: SourceAdapter;
  config: ApiConfigEntity;
}

/** 单配置 → 适配器（probe 等场景绕过 buildAdapters 直接构建） */
export function buildAdapterFor(config: ApiConfigEntity): AdapterBundle | null {
  switch (config.request_type) {
    case 'xiaozi':
      return { adapter: new ScraperAdapter(config, searchXiaozi), config };
    case 'zhuiju':
      return { adapter: new ScraperAdapter(config, searchZhuiju), config };
    case 'woog':
      return { adapter: new ScraperAdapter(config, searchWoog), config };
    case 'kkv':
      return { adapter: new ScraperAdapter(config, searchKkv), config };
    case 'declarative':
      return { adapter: new DeclarativeAdapter(config), config };
    default:
      return getParser(config.request_type) ? { adapter: new ApiAdapter(config), config } : null;
  }
}

/** 参与扇出的全部适配器：手动启用且未熔断，按优先级降序截前 10 */
export async function buildAdapters(db: D1Database): Promise<AdapterBundle[]> {
  const configs = await findActiveSources(db);
  return configs
    .map(buildAdapterFor)
    .filter((b): b is AdapterBundle => b !== null)
    .sort((a, b) => b.config.priority - a.config.priority)
    .slice(0, 10);
}

/** 带超时的单源请求（REST/预热/探测共用；SSE 在编排层自带 controller） */
export async function fetchSourceWithTimeout(bundle: AdapterBundle, kw: string, page = 1): Promise<CrawlerResult[]> {
  const ac = new AbortController();
  const timer = setTimeout(() => ac.abort(new Error('timeout')), bundle.config.timeout_ms || 8000);
  try {
    return await bundle.adapter.fetch(kw, page, ac.signal);
  } finally {
    clearTimeout(timer);
  }
}

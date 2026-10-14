import type { CrawlerResult, CloudType } from '../../types';
import { detectCloudType } from '../../utils';

/**
 * 追剧吧 zhuiju.us 定向爬虫（L2，kelePro crawlers/zhuiju.ts 迁移）
 *
 * 搜索页 https://www.zhuiju.us/s/{kw}.html 为 SSR + Vue SPA，
 * 结果 JSON 嵌在 linkBtn 函数的 jsonData 变量中：
 * [{ id, title, url, is_type, code, name, times, category }]
 * is_type: 0=夸克 1=阿里 2=百度 3=UC 4=迅雷
 */

const ZHUIJU_BASE_URL = 'https://www.zhuiju.us';
const TIMEOUT_MS = 15000;

const IS_TYPE_MAP: Record<number, CloudType> = {
  0: 'quark',
  1: 'aliyun',
  2: 'baidu',
  3: 'uc',
  4: 'xunlei',
};

/** 提取 linkBtn 函数内嵌 JSON（多级降级：jsonData → copyText → HTML 列表） */
function extractJsonData(html: string): Array<{ title: string; url: string; is_type: number }> | null {
  // 方式1: var jsonData = '[...]'
  const linkBtnMatch = html.match(/var\s+jsonData\s*=\s*'([\s\S]*?)';/);
  if (linkBtnMatch) {
    try {
      const data = JSON.parse(linkBtnMatch[1]) as Array<Record<string, unknown>>;
      if (Array.isArray(data) && data.length > 0) {
        return data
          .map((item) => ({
            title: String(item.title ?? item.name ?? ''),
            url: String(item.url ?? ''),
            is_type: typeof item.is_type === 'number' ? item.is_type : 0,
          }))
          .filter((r) => r.title && r.url);
      }
    } catch (e) {
      console.error('zhuiju.us JSON解析失败:', e);
    }
  }

  // 方式2: @click.stop="copyText($event,'标题','链接','提取码')"
  const copyTextRegex = /copyText\(\s*\$event\s*,\s*'([^']+)'\s*,\s*'([^']+)'\s*,\s*'[^']*'\s*\)/g;
  const items: Array<{ title: string; url: string; is_type: number }> = [];
  let match: RegExpExecArray | null;
  while ((match = copyTextRegex.exec(html)) !== null) {
    const title = match[1].trim();
    const url = match[2].trim();
    if (title && url && /(pan\.(quark|baidu|xunlei)|aliyundrive|alipan|drive\.uc)/i.test(url)) {
      items.push({ title, url, is_type: 0 });
    }
  }
  if (items.length > 0) return items;

  // 方式3: 标题标签 + 链接正则配对
  const titleRegex = /<a\s+href="javascript:;"[^>]*class="title"[^>]*>([\s\S]{1,100}?)<\/a>/g;
  const titles: string[] = [];
  let tMatch: RegExpExecArray | null;
  while ((tMatch = titleRegex.exec(html)) !== null) {
    const t = tMatch[1].replace(/<[^>]*>/g, '').trim();
    if (t && t.length > 1) titles.push(t);
  }

  const found: Array<{ title: string; url: string; is_type: number }> = [];
  const seen = new Set<string>();
  for (const pattern of LINK_PATTERNS) {
    let idx = 0;
    for (const m of html.matchAll(pattern)) {
      const url = m[0];
      if (seen.has(url)) continue;
      seen.add(url);
      found.push({ title: titles[idx] || url, url, is_type: 0 });
      idx++;
    }
  }
  return found.length > 0 ? found : null;
}

const LINK_PATTERNS: RegExp[] = [
  /https?:\/\/pan\.quark\.cn\/s\/[\w]+/g,
  /https?:\/\/pan\.baidu\.com\/s\/[\w-]+/g,
  /https?:\/\/(?:aliyundrive|alipan)\.com\/s\/[\w]+/g,
  /https?:\/\/drive\.uc\.cn\/s\/[\w]+/g,
  /https?:\/\/pan\.xunlei\.com\/s\/[\w]+/g,
];

export async function searchZhuiju(kw: string, signal?: AbortSignal): Promise<CrawlerResult[]> {
  const timeoutController = new AbortController();
  const timer = setTimeout(() => timeoutController.abort(), TIMEOUT_MS);
  if (signal) signal.addEventListener('abort', () => timeoutController.abort(), { once: true });

  try {
    const searchUrl = `${ZHUIJU_BASE_URL}/s/${encodeURIComponent(kw)}.html`;
    console.log(`zhuiju.us 搜索: ${searchUrl}`);

    const response = await fetch(searchUrl, {
      headers: {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36',
        Referer: ZHUIJU_BASE_URL,
        Accept: 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8',
        'Accept-Language': 'zh-CN,zh;q=0.9,en;q=0.8',
      },
      signal: timeoutController.signal,
    });

    if (!response.ok) {
      console.error(`zhuiju.us HTTP ${response.status}`);
      return [];
    }

    const html = await response.text();
    const items = extractJsonData(html);
    if (!items || items.length === 0) {
      console.error('zhuiju.us 未提取到数据');
      return [];
    }

    console.log(`zhuiju.us 提取到 ${items.length} 条资源`);
    return items.map((item) => ({
      title: item.title,
      url: item.url,
      // URL 域名优先（copyText 降级路径拿不到 is_type），其次 is_type 映射
      cloudType: detectCloudType(item.url) !== 'other'
        ? detectCloudType(item.url)
        : IS_TYPE_MAP[item.is_type] || 'other',
      description: '',
      tags: [],
      source: 'zhuiju',
    }));
  } catch (e) {
    console.error('zhuiju.us搜索失败:', e);
    return [];
  } finally {
    clearTimeout(timer);
  }
}

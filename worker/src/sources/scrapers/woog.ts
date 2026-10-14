import type { CrawlerResult, CloudType } from '../../types';
import { detectCloudType } from '../../utils';

/**
 * 欧哥站 woog.nxog.eu.org 定向爬虫（L2，源出自影视仓 diy 接口 PanWebShare 系）
 *
 * MacCMS（苹果CMS）网盘资源站，两跳：
 * 1. 搜索列表 GET /index.php/vod/search/wd/{kw}.html → /index.php/vod/detail/id/{id}.html
 * 2. 详情页 → data-clipboard-text 属性直接放网盘直链（夸克/百度等），h4 为条目标题
 *
 * 备份域名：woog.nxog.fun、woog.430520.xyz
 */

const WOOG_BASE_URL = 'https://woog.nxog.eu.org';
const SEARCH_TIMEOUT_MS = 12000;
const DETAIL_TIMEOUT_MS = 15000;
/** 最多并行抓取的详情页数（控制总延迟） */
const MAX_DETAIL_PAGES = 4;

const LINK_PATTERNS: RegExp[] = [
  /https?:\/\/pan\.quark\.cn\/s\/[\w]+/g,
  /https?:\/\/pan\.baidu\.com\/s\/[\w-]+(?:\?pwd=\w+)?/g,
  /https?:\/\/(?:aliyundrive|alipan)\.com\/s\/[\w]+/g,
  /https?:\/\/drive\.uc\.cn\/s\/[\w]+/g,
  /https?:\/\/pan\.xunlei\.com\/s\/[\w]+/g,
];

const BROWSER_HEADERS: Record<string, string> = {
  'User-Agent':
    'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36',
  Referer: `${WOOG_BASE_URL}/`,
  Accept: 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8',
  'Accept-Language': 'zh-CN,zh;q=0.9,en;q=0.8',
};

interface SearchItem {
  detailPath: string;
  title: string;
}

/** 搜索列表页 → 详情页路径 + 标题（title 属性优先，缺失时空串由详情页 h4 兜底） */
function extractDetailItems(html: string): SearchItem[] {
  const items: SearchItem[] = [];
  const seen = new Set<string>();
  const regex = /href="((?:https?:\/\/[^"]*?)?\/index\.php\/vod\/detail\/id\/\d+\.html)"[^>]*?(?:title="([^"]*)")?/g;
  let m: RegExpExecArray | null;
  while ((m = regex.exec(html)) !== null) {
    let path = m[1];
    if (path.startsWith('http')) {
      try {
        path = new URL(path).pathname;
      } catch {
        /* 保持原样 */
      }
    }
    if (seen.has(path)) continue;
    seen.add(path);
    items.push({ detailPath: path, title: (m[2] || '').trim() });
  }
  return items;
}

/** 详情页 → (url, passcode) 列表：data-clipboard-text 主模式 + 链接正则兜底 */
function extractPanLinks(html: string): Array<{ url: string; passcode: string }> {
  const results: Array<{ url: string; passcode: string }> = [];
  const seen = new Set<string>();

  const push = (url: string) => {
    const clean = url.trim().replace(/&amp;/g, '&');
    if (!clean || seen.has(clean)) return;
    // 仅收网盘域名（detectCloudType 域名白名单判定）
    if (detectCloudType(clean) === 'other') return;
    seen.add(clean);
    const pwdMatch = clean.match(/[?&](?:pwd|passcode)=([\w]{4})/i);
    results.push({ url: clean, passcode: pwdMatch ? pwdMatch[1] : '' });
  };

  // 主模式：data-clipboard-text="网盘直链"
  for (const m of html.matchAll(/data-clipboard-text="(https?:\/\/[^"]+)"/g)) push(m[1]);

  // 兜底：全文链接正则
  if (results.length === 0) {
    for (const pattern of LINK_PATTERNS) {
      for (const m of html.matchAll(pattern)) push(m[0]);
    }
  }
  return results;
}

function fetchPage(url: string, timeoutMs: number, outerSignal?: AbortSignal): Promise<string> {
  const controller = new AbortController();
  const timer = setTimeout(() => controller.abort(), timeoutMs);
  if (outerSignal) outerSignal.addEventListener('abort', () => controller.abort(), { once: true });
  return fetch(url, { headers: BROWSER_HEADERS, signal: controller.signal })
    .then(async (resp) => {
      if (!resp.ok) throw new Error(`HTTP ${resp.status}`);
      return resp.text();
    })
    .finally(() => clearTimeout(timer));
}

export async function searchWoog(kw: string, signal?: AbortSignal): Promise<CrawlerResult[]> {
  try {
    const searchUrl = `${WOOG_BASE_URL}/index.php/vod/search/wd/${encodeURIComponent(kw)}.html`;
    console.log(`欧哥站搜索: ${searchUrl}`);
    const listHtml = await fetchPage(searchUrl, SEARCH_TIMEOUT_MS, signal);

    const items = extractDetailItems(listHtml);
    if (items.length === 0) {
      console.error('欧哥站搜索列表无详情条目');
      return [];
    }
    console.log(`欧哥站列表 ${items.length} 条，抓取前 ${Math.min(MAX_DETAIL_PAGES, items.length)} 个详情页`);

    const targets = items.slice(0, MAX_DETAIL_PAGES);
    const settled = await Promise.allSettled(
      targets.map(async (item) => {
        const detailHtml = await fetchPage(`${WOOG_BASE_URL}${item.detailPath}`, DETAIL_TIMEOUT_MS, signal);
        const links = extractPanLinks(detailHtml);
        // 标题优先搜索页 title，兜底详情页 h4（module-row-title）
        let title = item.title;
        if (!title) {
          const h4 = detailHtml.match(/<h4>([^<]{1,80})<\/h4>/);
          title = h4 ? h4[1].trim() : '';
        }
        return links.map((l) => ({ title: title || l.url, ...l }));
      }),
    );

    const results: CrawlerResult[] = [];
    const seenUrl = new Set<string>();
    for (const s of settled) {
      if (s.status !== 'fulfilled') continue;
      for (const r of s.value) {
        if (seenUrl.has(r.url)) continue;
        seenUrl.add(r.url);
        results.push({
          title: r.title,
          url: r.url,
          // 详情页直链，URL 域名判定即可
          cloudType: detectCloudType(r.url) as CloudType,
          description: '',
          tags: [],
          passcode: r.passcode || undefined,
          source: 'woog',
        });
      }
    }
    console.log(`欧哥站提取到 ${results.length} 条资源`);
    return results;
  } catch (e) {
    console.error('欧哥站搜索失败:', e);
    return [];
  }
}

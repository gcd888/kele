import type { CrawlerResult, CloudType } from '../../types';
import { detectCloudType } from '../../utils';

/**
 * 小悠家 kkv.q-23.cn 定向爬虫（L2，入口页 souyixia.q-23.cn 仅做搜索转发）
 *
 * WordPress 6.7.2 网盘资源站，两级路径：
 * 1. 主路径（豁免限流）：REST API GET /index.php?rest_route=/wp/v2/posts&search={kw}&per_page=10
 *    —— content.rendered 直出网盘链接，一跳完成（/wp-json/ 路径被 nginx 封，?rest_route= 查询参数入口未封）
 * 2. 回退路径（受限流约束）：HTML 两跳 /?s={kw} 列表 → 前 4 个 /?p={id} 详情页提链
 *
 * 限流：站点对 ?s= 搜索按 IP 计数（wp_die，HTTP 500 +「已达搜索次数上限 请3分钟后重试！」，
 * 实测伪造 X-Forwarded-For 无效、首页/详情页/REST 豁免）。触发后进入模块级冷却（COOLDOWN_MS），
 * 冷却期内直接返回空结果（不请求、不累积熔断失败），限流当次抛错计入失败统计。
 */

const KKV_BASE_URL = 'http://kkv.q-23.cn';
const REST_TIMEOUT_MS = 12000;
const SEARCH_TIMEOUT_MS = 12000;
const DETAIL_TIMEOUT_MS = 15000;
/** 最多并行抓取的详情页数（仅回退路径，控制总延迟与请求量） */
const MAX_DETAIL_PAGES = 4;
/** 限流冷却窗口（站点约 3 分钟限流，冷却期对齐略加缓冲） */
const COOLDOWN_MS = 3 * 60_000 + 5_000;

/** 模块级冷却截止时间（isolate 存活期内生效；重启后最多多发一次请求再触发冷却） */
let cooldownUntil = 0;

/** 限流特征：429/503，或站点 wp_die 页（500 +「搜索太快/已达搜索次数上限」），或提示文案且无正常文章结构 */
const RATE_LIMIT_HINTS = /搜索太快|已达搜索次数上限|请求过于频繁|访问过于频繁|限流|操作频繁|稍后再试|稍后重试|频繁访问/i;

function isRateLimited(status: number, body: string): boolean {
  if (status === 429 || status === 503) return true;
  if (status === 500 && RATE_LIMIT_HINTS.test(body)) return true;
  return RATE_LIMIT_HINTS.test(body) && !body.includes('entry-title');
}

const BROWSER_HEADERS: Record<string, string> = {
  'User-Agent':
    'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36',
  Referer: `${KKV_BASE_URL}/`,
  Accept: 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8',
  'Accept-Language': 'zh-CN,zh;q=0.9,en;q=0.8',
};

interface SearchItem {
  postId: string;
  title: string;
  cover: string;
}

function decodeEntities(s: string): string {
  return s
    .replace(/&amp;/g, '&')
    .replace(/&lt;/g, '<')
    .replace(/&gt;/g, '>')
    .replace(/&quot;/g, '"')
    .replace(/&#0?39;|&apos;|&rsquo;/g, "'")
    .replace(/&nbsp;/g, ' ')
    .trim();
}

/** 文本 → (url, passcode) 列表；提取码优先 URL ?pwd=，兜底链接后「提取码：xxxx」 */
function extractLinksFromText(text: string): Array<{ url: string; passcode: string }> {
  const results: Array<{ url: string; passcode: string }> = [];
  const seen = new Set<string>();

  const urlRe = /https?:\/\/(?:pan\.quark\.cn|pan\.baidu\.com|(?:aliyundrive|alipan)\.com|drive\.uc\.cn|pan\.xunlei\.com)\/[^\s"'<>&]+(?:&amp;|&)?(?:pwd=[\w]+)?/g;
  let m: RegExpExecArray | null;
  while ((m = urlRe.exec(text)) !== null) {
    const url = m[0].replace(/&amp;/g, '&').replace(/[),.;:'"#]+$/, '');
    if (seen.has(url)) continue;
    seen.add(url);
    const pwdMatch = url.match(/[?&](?:pwd|passcode)=([\w]{4})/i);
    let passcode = pwdMatch ? pwdMatch[1] : '';
    if (!passcode) {
      const after = text.slice(m.index + m[0].length, m.index + m[0].length + 200);
      const code = after.match(/提取码\s*[:：]?\s*([a-zA-Z0-9]{4})/);
      if (code) passcode = code[1];
    }
    results.push({ url, passcode });
  }
  return results;
}

// ---------- 主路径：REST API（豁免限流，一跳） ----------

interface WpPost {
  id: number;
  title: { rendered: string };
  content: { rendered: string };
}

async function searchViaRest(kw: string, signal?: AbortSignal): Promise<CrawlerResult[]> {
  const restUrl = `${KKV_BASE_URL}/index.php?rest_route=${encodeURIComponent('/wp/v2/posts')}&search=${encodeURIComponent(kw)}&per_page=10`;
  console.log(`小悠家REST搜索: ${restUrl}`);
  const resp = await fetchPage(restUrl, REST_TIMEOUT_MS, signal);

  if (isRateLimited(resp.status, resp.body)) {
    cooldownUntil = Date.now() + COOLDOWN_MS;
    throw new Error(`小悠家限流，冷却 ${Math.round(COOLDOWN_MS / 1000)}s 后自动恢复`);
  }
  if (resp.status !== 200) throw new Error(`REST HTTP ${resp.status}`);

  let posts: WpPost[];
  try {
    posts = JSON.parse(resp.body) as WpPost[];
  } catch {
    throw new Error('REST 响应非 JSON（可能被封，回退 HTML）');
  }
  if (!Array.isArray(posts)) throw new Error('REST 响应结构异常');

  const results: CrawlerResult[] = [];
  const seenUrl = new Set<string>();
  for (const post of posts) {
    const title = decodeEntities(post.title?.rendered?.replace(/<[^>]+>/g, '') ?? '');
    const content = post.content?.rendered ?? '';
    for (const l of extractLinksFromText(content)) {
      if (seenUrl.has(l.url)) continue;
      if (detectCloudType(l.url) === 'other') continue;
      seenUrl.add(l.url);
      results.push({
        title: title || l.url,
        url: l.url,
        cloudType: detectCloudType(l.url) as CloudType,
        description: '',
        tags: [],
        passcode: l.passcode || undefined,
        source: 'kkv',
      });
    }
  }
  console.log(`小悠家REST提取到 ${results.length} 条资源（${posts.length} 篇文章）`);
  return results;
}

// ---------- 回退路径：HTML 两跳（受限流约束） ----------

/** 搜索列表页 → 文章条目（postId + 标题 + 封面） */
function extractSearchItems(html: string): SearchItem[] {
  const items: SearchItem[] = [];
  const seen = new Set<string>();
  const articleRe = /<article id="post-(\d+)"[^>]*>([\s\S]*?)(?=<article id="post-|<\/section>|$)/g;
  let m: RegExpExecArray | null;
  while ((m = articleRe.exec(html)) !== null) {
    const postId = m[1];
    if (seen.has(postId)) continue;
    const block = m[2];
    const titleMatch = block.match(/entry-title[^>]*>\s*<a[^>]*>([\s\S]*?)<\/a>/);
    if (!titleMatch) continue;
    const title = decodeEntities(titleMatch[1].replace(/<[^>]+>/g, ''));
    if (!title) continue;
    seen.add(postId);
    const coverMatch = block.match(/entry-thumb[^>]*>\s*<img[^>]*src="([^"]+)"/);
    items.push({ postId, title, cover: coverMatch ? coverMatch[1] : '' });
  }
  return items;
}

function fetchPage(url: string, timeoutMs: number, outerSignal?: AbortSignal): Promise<{ status: number; body: string }> {
  const controller = new AbortController();
  const timer = setTimeout(() => controller.abort(), timeoutMs);
  if (outerSignal) outerSignal.addEventListener('abort', () => controller.abort(), { once: true });
  return fetch(url, { headers: BROWSER_HEADERS, signal: controller.signal, redirect: 'follow' })
    .then(async (resp) => ({ status: resp.status, body: await resp.text() }))
    .finally(() => clearTimeout(timer));
}

async function searchViaHtml(kw: string, signal?: AbortSignal): Promise<CrawlerResult[]> {
  const searchUrl = `${KKV_BASE_URL}/?s=${encodeURIComponent(kw)}`;
  console.log(`小悠家HTML回退: ${searchUrl}`);
  const list = await fetchPage(searchUrl, SEARCH_TIMEOUT_MS, signal);
  if (isRateLimited(list.status, list.body)) {
    cooldownUntil = Date.now() + COOLDOWN_MS;
    throw new Error(`小悠家限流，冷却 ${Math.round(COOLDOWN_MS / 1000)}s 后自动恢复`);
  }

  const items = extractSearchItems(list.body);
  if (items.length === 0) return []; // 正常无结果，非故障

  console.log(`小悠家HTML列表 ${items.length} 条，抓取前 ${Math.min(MAX_DETAIL_PAGES, items.length)} 个详情页`);
  const targets = items.slice(0, MAX_DETAIL_PAGES);
  const settled = await Promise.allSettled(
    targets.map(async (item) => {
      const detail = await fetchPage(`${KKV_BASE_URL}/?p=${item.postId}`, DETAIL_TIMEOUT_MS, signal);
      if (isRateLimited(detail.status, detail.body)) {
        cooldownUntil = Date.now() + COOLDOWN_MS;
        throw new Error('小悠家限流（详情页）');
      }
      return { item, links: extractLinksFromText(detail.body) };
    }),
  );

  const results: CrawlerResult[] = [];
  const seenUrl = new Set<string>();
  for (const s of settled) {
    if (s.status !== 'fulfilled') continue;
    const { item, links } = s.value;
    for (const l of links) {
      if (seenUrl.has(l.url)) continue;
      if (detectCloudType(l.url) === 'other') continue;
      seenUrl.add(l.url);
      results.push({
        title: item.title,
        url: l.url,
        cloudType: detectCloudType(l.url) as CloudType,
        description: '',
        tags: [],
        cover: item.cover || undefined,
        passcode: l.passcode || undefined,
        source: 'kkv',
      });
    }
  }
  console.log(`小悠家HTML提取到 ${results.length} 条资源`);
  return results;
}

export async function searchKkv(kw: string, signal?: AbortSignal): Promise<CrawlerResult[]> {
  // 冷却期内：不请求、返回空（ok=true，不累积熔断失败，也不拖慢扇出）
  if (Date.now() < cooldownUntil) {
    console.log(`小悠家冷却中（剩余 ${Math.ceil((cooldownUntil - Date.now()) / 1000)}s），跳过本次搜索`);
    return [];
  }

  try {
    return await searchViaRest(kw, signal);
  } catch (e) {
    console.error('小悠家REST失败，回退HTML:', e instanceof Error ? e.message : e);
    return searchViaHtml(kw, signal);
  }
}

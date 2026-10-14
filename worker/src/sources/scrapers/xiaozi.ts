import type { CrawlerResult, CloudType } from '../../types';

/** 盘小子 pan.xiaozi.cc 定向爬虫（L2，kelePro crawlers/xiaozi.ts 迁移，限 2 页） */

const XIAOZI_BASE_URL = 'https://pan.xiaozi.cc';
const TIMEOUT_MS = 15000;

const DISK_TYPE_MAP: Array<{ key: string; type: CloudType }> = [
  { key: '夸克', type: 'quark' },
  { key: '百度', type: 'baidu' },
  { key: '阿里', type: 'aliyun' },
  { key: 'UC', type: 'uc' },
  { key: '迅雷', type: 'xunlei' },
];

function mapDiskType(diskType: string): CloudType {
  for (const { key, type } of DISK_TYPE_MAP) {
    if (diskType.includes(key)) return type;
  }
  return 'other';
}

/** 从搜索页 SSR 数据块提取资源列表（栈匹配 resources:[...]） */
function extractResources(html: string): Array<{ title: string; url: string; cover: string; diskType: string }> {
  const results: Array<{ title: string; url: string; cover: string; diskType: string }> = [];

  const ssrStart = html.indexOf('resources:$R[');
  if (ssrStart === -1) return results;
  const eqPos = html.indexOf('=', ssrStart);
  if (eqPos === -1) return results;
  const bracketStart = html.indexOf('[', eqPos);
  if (bracketStart === -1) return results;

  let depth = 0;
  let bracketEnd = -1;
  for (let i = bracketStart; i < html.length && i < bracketStart + 80000; i++) {
    if (html[i] === '[') depth++;
    else if (html[i] === ']') {
      depth--;
      if (depth === 0) { bracketEnd = i; break; }
    }
  }
  if (bracketEnd === -1) return results;

  const arrContent = html.slice(bracketStart + 1, bracketEnd);

  let i = 0;
  while (i < arrContent.length) {
    const objStart = arrContent.indexOf('{', i);
    if (objStart === -1) break;
    let d = 0;
    let objEnd = -1;
    for (let j = objStart; j < arrContent.length; j++) {
      if (arrContent[j] === '{') d++;
      else if (arrContent[j] === '}') {
        d--;
        if (d === 0) { objEnd = j; break; }
      }
    }
    if (objEnd === -1) break;

    const objStr = arrContent.slice(objStart + 1, objEnd);
    i = objEnd + 1;

    const title = objStr.match(/title\s*:\s*"((?:[^"\\]|\\.)*)"/)?.[1] || '';
    const url = objStr.match(/url\s*:\s*"(https?:\/\/[^"]+)"/)?.[1] || '';
    if (!title || !url) continue;
    if (!/(pan\.(quark|baidu|xunlei)|aliyundrive|alipan|drive\.uc)/i.test(url)) continue;

    const cover = objStr.match(/cover\s*:\s*"(https?:\/\/[^"]+)"/)?.[1] || '';
    const diskType = objStr.match(/diskType\s*:\s*"([^"]+)"/)?.[1] || '';

    results.push({ title, url, cover, diskType });
  }

  return results;
}

/** 搜索盘小子（第 1、2 页合并返回，page 参数仅用于外层接口对齐） */
export async function searchXiaozi(kw: string, signal?: AbortSignal): Promise<CrawlerResult[]> {
  const allResults: CrawlerResult[] = [];
  const seenUrls = new Set<string>();
  const timeoutController = new AbortController();
  const timer = setTimeout(() => timeoutController.abort(), TIMEOUT_MS);
  if (signal) signal.addEventListener('abort', () => timeoutController.abort(), { once: true });

  try {
    for (const page of [1, 2]) {
      if (timeoutController.signal.aborted) break;
      try {
        const response = await fetch(
          `${XIAOZI_BASE_URL}/resource?q=${encodeURIComponent(kw)}&page=${page}`,
          {
            headers: {
              'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36',
              Accept: 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8',
            },
            signal: timeoutController.signal,
          },
        );
        if (!response.ok) continue;
        const items = extractResources(await response.text());
        for (const item of items) {
          if (!seenUrls.has(item.url)) {
            seenUrls.add(item.url);
            allResults.push({
              title: item.title,
              url: item.url,
              cloudType: mapDiskType(item.diskType),
              description: '',
              tags: [],
              source: 'xiaozi',
              cover: item.cover || undefined,
            });
          }
        }
      } catch { /* 单页失败静默 */ }
    }
  } finally {
    clearTimeout(timer);
  }

  console.log(`盘小子: 2页 → ${allResults.length}条`);
  return allResults;
}

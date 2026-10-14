import type { D1Database } from '@cloudflare/workers-types';
import type { DoubanItemInput } from '../types';
import { batchInsertDoubanItems, clearDoubanByType } from '../db/douban';

const UA = 'Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36';
const MAX_ITEMS = 50;

interface DoubanApiItem {
  id: string;
  title: string;
  pic: { large: string; normal: string };
  rating: { count: number; max: number; star_count: number; value: number };
  uri: string;
  card_subtitle: string;
  year?: string;
}

/** 剧集/综艺 recommend 接口（近期热度 sort=U，参数与豆瓣页面严格一致：selected_categories 仅 类型/形式，tags=华语,形式） */
function buildTvRecommendUrl(form: string): string {
  const cats = encodeURIComponent(JSON.stringify({ '类型': '', '形式': form }));
  return `https://m.douban.com/rexxar/api/v2/tv/recommend?refresh=0&start=0&count=${MAX_ITEMS}&selected_categories=${cats}&uncollect=false&score_range=0,10&tags=${encodeURIComponent('华语,' + form)}&sort=U`;
}

/** 电影 recent_hot 接口 */
function buildMovieRecentHotUrl(category: string, type: string): string {
  return `https://m.douban.com/rexxar/api/v2/subject/recent_hot/movie?start=0&limit=${MAX_ITEMS}&category=${encodeURIComponent(category)}&type=${encodeURIComponent(type)}`;
}

/** 三类均取「近期热度」榜单：剧集=形式电视剧、综艺=形式综艺（recommend sort=U），电影=recent_hot 热门 */
const CRAWL_CONFIGS = [
  { mediaType: 'tv' as const, category: '近期热度', url: buildTvRecommendUrl('电视剧') },
  { mediaType: 'variety' as const, category: '近期热度', url: buildTvRecommendUrl('综艺') },
  { mediaType: 'movie' as const, category: '近期热度', url: buildMovieRecentHotUrl('热门', '华语') },
];

function parseSubtitle(subtitle: string): { year: string; area: string; genres: string } {
  const parts = subtitle.split('/').map(s => s.trim());
  const year = parts[0] || '';
  const area = parts[1] || '';
  const genres = parts.slice(2).filter(Boolean).join('/').replace(/\s+/g, '') || '';
  return { year, area, genres };
}

async function crawlOne(url: string, label: string): Promise<DoubanApiItem[]> {
  try {
    const resp = await fetch(url, {
      headers: { 'User-Agent': UA, Referer: 'https://m.douban.com/', Accept: 'application/json, text/plain, */*' },
      signal: AbortSignal.timeout(30000),
    });
    if (!resp.ok) { console.error(`豆瓣爬虫 ${label} HTTP ${resp.status}`); return []; }
    const data = await resp.json() as any;
    return (data.items || []).slice(0, MAX_ITEMS);
  } catch (e) { console.error(`豆瓣爬虫 ${label} 失败:`, e); return []; }
}

/** 全量拉取豆瓣热播并落库（Cron 专用）：按类型先抓全+内存去重，再先删后插；某类型全部抓取失败时保留旧数据不清空 */
export async function crawlDoubanAndSave(db: D1Database): Promise<{ tv: number; movie: number; variety: number }> {
  const stats = { tv: 0, movie: 0, variety: 0 };

  for (const mediaType of ['tv', 'variety', 'movie'] as const) {
    const configs = CRAWL_CONFIGS.filter(c => c.mediaType === mediaType);
    const seen = new Set<string>();
    const items: DoubanItemInput[] = [];

    for (const config of configs) {
      const raw = await crawlOne(config.url, `${config.mediaType}/${config.category}`);
      raw.forEach((item, idx) => {
        // 同一条目重复出现时只保留首次（保留其在榜单中的原始序号）
        if (seen.has(item.id)) return;
        seen.add(item.id);

        const { year, area, genres } = parseSubtitle(item.card_subtitle || '');
        items.push({
          douban_id: item.id,
          title: item.title,
          media_type: config.mediaType,
          category: config.category,
          rating_value: item.rating?.value ?? 0,
          rating_count: item.rating?.count ?? 0,
          year: item.year || year,
          area,
          genres,
          cover_url: (item.pic?.normal || item.pic?.large || '').replace(/\.webp$/, '.jpg'),
          url: `https://movie.douban.com/subject/${item.id}/`,
          card_subtitle: item.card_subtitle || '',
          raw_json: JSON.stringify(item),
          rank: idx + 1,
        });
      });
    }

    if (items.length === 0) continue;
    await clearDoubanByType(db, mediaType);
    await batchInsertDoubanItems(db, items);
    stats[mediaType] = items.length;
  }

  return stats;
}

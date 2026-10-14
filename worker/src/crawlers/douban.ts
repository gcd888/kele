import type { D1Database } from '@cloudflare/workers-types';
import type { DoubanItemInput } from '../types';
import { batchUpsertDoubanItems, clearDoubanByType } from '../db/douban';

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

/** 剧集/综艺 recommend 接口 */
function buildTvRecommendUrl(sort: string, tags: string, form: string, area = '华语'): string {
  const cats: Record<string, string> = { '类型': '' };
  if (form) cats['形式'] = form;
  if (area) cats['地区'] = area;
  const selectedCats = encodeURIComponent(JSON.stringify(cats));
  let url = `https://m.douban.com/rexxar/api/v2/tv/recommend?refresh=0&start=0&count=${MAX_ITEMS}&selected_categories=${selectedCats}&uncollect=false&score_range=0,10&tags=${encodeURIComponent(tags)}`;
  if (sort && sort !== 'T') url += `&sort=${sort}`;
  return url;
}

/** 电影 recommend 接口 */
function buildMovieRecommendUrl(sort: string, tags: string): string {
  const cats: Record<string, string> = { '地区': '华语', '类型': '' };
  const selectedCats = encodeURIComponent(JSON.stringify(cats));
  let url = `https://m.douban.com/rexxar/api/v2/movie/recommend?refresh=0&start=0&count=${MAX_ITEMS}&selected_categories=${selectedCats}&uncollect=false&score_range=0,10&tags=${encodeURIComponent(tags)}`;
  if (sort && sort !== 'T') url += `&sort=${sort}`;
  return url;
}

/** 电影 recent_hot 接口 */
function buildMovieRecentHotUrl(category: string, type: string): string {
  return `https://m.douban.com/rexxar/api/v2/subject/recent_hot/movie?start=0&limit=${MAX_ITEMS}&category=${encodeURIComponent(category)}&type=${encodeURIComponent(type)}`;
}

const CRAWL_CONFIGS = [
  { mediaType: 'tv' as const, category: '综合', url: buildTvRecommendUrl('T', '电视剧,华语,2020年代', '电视剧') + '&playable=true' },
  { mediaType: 'tv' as const, category: '近期热度', url: buildTvRecommendUrl('U', '电视剧,华语,2020年代', '电视剧') + '&playable=true' },
  { mediaType: 'tv' as const, category: '高分优先', url: buildTvRecommendUrl('S', '电视剧,华语,2020年代', '电视剧') + '&playable=true' },
  { mediaType: 'tv' as const, category: '首播时间', url: buildTvRecommendUrl('R', '电视剧,华语,2020年代', '电视剧') + '&playable=true' },
  { mediaType: 'variety' as const, category: '综合', url: buildTvRecommendUrl('T', '综艺,华语', '综艺') + '&playable=true' },
  { mediaType: 'variety' as const, category: '近期热度', url: buildTvRecommendUrl('U', '综艺,华语', '综艺') + '&playable=true' },
  { mediaType: 'variety' as const, category: '高分优先', url: buildTvRecommendUrl('S', '综艺,华语', '综艺') + '&playable=true' },
  { mediaType: 'variety' as const, category: '首播时间', url: buildTvRecommendUrl('R', '综艺,华语', '综艺') + '&playable=true' },
  { mediaType: 'movie' as const, category: '综合', url: buildMovieRecommendUrl('T', '华语,2010年代') + '&playable=true' },
  { mediaType: 'movie' as const, category: '近期热度', url: buildMovieRecentHotUrl('热门', '华语') },
  { mediaType: 'movie' as const, category: '高分优先', url: buildMovieRecentHotUrl('豆瓣高分', '华语') },
  { mediaType: 'movie' as const, category: '首播时间', url: buildMovieRecentHotUrl('最新', '华语') },
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

/** 全量拉取豆瓣热播并落库（Cron 专用） */
export async function crawlDoubanAndSave(db: D1Database): Promise<{ tv: number; movie: number; variety: number }> {
  await clearDoubanByType(db, 'tv');
  await clearDoubanByType(db, 'movie');
  await clearDoubanByType(db, 'variety');

  const stats = { tv: 0, movie: 0, variety: 0 };

  for (const config of CRAWL_CONFIGS) {
    const raw = await crawlOne(config.url, `${config.mediaType}/${config.category}`);
    if (raw.length === 0) continue;

    const batchItems: DoubanItemInput[] = raw.map(item => {
      const { year, area, genres } = parseSubtitle(item.card_subtitle || '');
      return {
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
      };
    });

    await batchUpsertDoubanItems(db, batchItems);
    stats[config.mediaType] += batchItems.length;
  }

  return stats;
}

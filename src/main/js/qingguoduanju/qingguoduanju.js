/**
 * qingguoduanju.js — 青果短剧（JS 版，catvod JsSpider 协议）
 *
 * 移植自：kele/src/main/java/qingguoduanju/src/com/github/catvod/spider/Qingguoduanju.java
 * （3429 行，1:1 精确移植；算法蓝本 hongguoTV kotlin-tv core + hongguo.cjs，金标
 *   qingguoduanju/test/golden.json 经 lib/qg_sign.js 复现）
 *
 * 数据面：
 *  - 分类/榜单：红果官网 SSR（hongguoduanju.com，无需签名）；详情：H5 album-share SSR 主路
 *    （novelquickapp.com，免签）+ 官网 SSR 兜底（superguoguo 融合，2026-10-29）；
 *  - 搜索：优先番茄 App 端接口（bookapi/search/tab/v，全套字节签名 + 匿名注册设备，全量索引），
 *    失败/空结果回退官网 JSON 接口 /api/search/result（无需签名，索引残缺仅作兜底）；
 *  - 取流：video_tab（现行主通道，2026-11-05 PR#71 signPlayback 全套设备级签名）+ v1 POST 兜底；
 *  - 解密：spade_a 密钥派生 + spade 解密（SHA512 + AES-128-CBC）+ CENC 逐样本 AES-CTR；
 *  - 播放：经壳本地代理 proxy() 回吐解密后的分段字节（206）；
 *  - 弹幕：番茄评论接口窗口循环 → B 站 XML，经壳代理 do=danmu 回吐（签名复用 lib/xhs_sign.js dm*）。
 *
 * 与 Java 版的差异（壳协议约束，算法不变）：
 *  - 持久化：mContext/SharedPreferences → local（key 前缀 qg_）；
 *  - PRIMER 预热线程池删除（QuickJS 无线程，同步预热会阻塞播放页打开）；
 *  - Thread.sleep → sleepBusy（重试窗口短占用）；
 *  - org.json → safeParse（19 位 vod_id/vid 大整数精度保护）；
 *  - 弹幕窗间 Thread.sleep(300+rand*200) 节流删除（与已完成移植 xihongshiduanju.js 同口径：
 *    同步 busy-wait 会阻塞壳线程，上游 HTTP 延迟天然形成窗间隔）。
 *
 * 宿主依赖：req/local/getProxy/console；lib/crypto-js.js、lib/pako.js、lib/binutil.js、
 *           lib/sm3.js、lib/xhs_sign.js、lib/qg_sign.js、lib/qg_account.js。
 */

// 副作用 import：pako（gzip）挂 globalThis；crypto-js 由 xhs_sign 传递挂载
import '../lib/pako.js';
import {
    safeParse,
    bytesToHex, bytesToB64, b64ToBytes,
    utf8ToBytes, u32read, be64read, be32,
} from '../lib/binutil.js';
import {
    md5Bytes, deriveKey,
    dmGorgonSeed, dmGorgon, dmLadon, dmArgus,
    aesCtrDecrypt, bytesToBigIntBE,
} from '../lib/xhs_sign.js';
import qg from './qg_sign.js';
import { handle as accountHandle } from './qg_account.js';

const log = (...a) => { try { console.log('[qg-js]', ...a); } catch (e) {} };

// ============================ 端点 ============================

const SITE = 'https://hongguoduanju.com';
// 2026-10-23 风控升级后取流链路（对齐 tsukiyo/hongguoTV）：旧 preload/v1 已软拒；
// 新链路 multi_video_model/v1 必须携带「已注册」匿名设备（未注册随机设备号被软拒 200 空体，
// tsukiyo 2026-10-27 PR#30 同因修复）。播放与搜索共享 appDevice() 注册身份并持久化。
// 2026-11-05 蓝图 PR#71（a5b2587）：上游再次收紧，v1 端点免签名口径失效（空响应），
// 播放请求需全套设备级签名（signPlayback 口径，绑定 query+body，每次重试重新签名）。
const V1_URL = 'https://api5-normal-sinfonlineb.fqnovel.com/novel/player/multi_video_model/v1/';
/** 现行播放模型接口（蓝图 tabVideoModel 口径）：2026-11-02 起 /novel/player 族全域名废弃
 * （对所有请求 200+0 字节，蓝图 2026-11-02 实测），官方 App 主通道已切 video_tab GET。 */
const VIDEO_TAB_URL = 'https://api5-normal-sinfonlineb.fqnovel.com/reading/bookapi/video_tab/multi_video_model/v1/';
// superguoguo 融合（2026-10-29）：详情换 H5 album-share SSR 主路（官网 SSR 兜底）。
// 首页/分类实测维持官网主路：bookmall/tab 只回 tab 布局+找剧精选 6 卡（无分页，真人剧/漫剧
// tab 为空壳、卡片走未知的 bookstore feed），bottom_video_feed recommend 对匿名设备软拒 42B。
const H5_ALBUM_URL = 'https://novelquickapp.com/hongguo/ug/pages/video-album-share';
const H5_UA = 'Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) '
    + 'Chrome/124.0.0.0 Mobile Safari/537.36';
const VIDEO_UA = 'com.phoenix.read/73532 (Linux; U; Android 16; zh_CN; 25053RT47C; '
    + 'Build/BP2A.250605.031.A3; Cronet/TTNetVersion:04657795 2026-01-23 '
    + 'QuicVersion:c67e9834 2025-09-08)';
/** 播放接口 UA（蓝图 Signer.signPlayback 固定厂商 UA，签名不参与 UA 计算，照抄保兼容） */
const PLAYER_UA = 'com.phoenix.read/71532 (Linux; U; Android 9; SM-N9860; Build/PQ3A.190705.10241111;tt-ok/3.12.13.20)';
const SEG_SIZE = 1048576;       // 1MB 分段
const HEADER_HINT = 8388608;    // moov 头部兜底抓取 8MB

const SITE_KEY = 'qingguoduanju';
const LKEY_DEVICE = 'qg_device';

// ============================ HTTP ============================

/** 二进制 body → base64（壳 bodyB64 通道：Req.bodyB64 → Connect Base64.decode 原字节发出） */
function bytesBodyB64(bytes) {
    return bytesToB64(bytes);
}

function text(url, method, body, headers) {
    const t0 = Date.now();
    const opts = {
        method: String(method || 'get').toLowerCase(),
        headers: Object.assign({ 'User-Agent': VIDEO_UA, 'Accept-Language': 'zh-CN,zh;q=0.9' }, headers || {}),
        timeout: 30000,
    };
    if (body && body.length > 0) opts.bodyB64 = bytesBodyB64(body);
    const res = req(url, opts);
    const result = res.content || '';
    log('http ' + method + ' ' + url.slice(0, 150) + ' len=' + result.length + ' cost=' + (Date.now() - t0) + 'ms');
    return result;
}

function textGet(url) {
    return text(url, 'GET', null, null);
}

/** 取 CDN 分段字节，返回 {bytes, total}（total 来自 Content-Range 回填）。 */
function range(url, start, end) {
    const res = req(url, {
        method: 'get',
        headers: {
            'User-Agent': VIDEO_UA,
            'Accept': '*/*',
            'Range': 'bytes=' + start + '-' + end,
        },
        buffer: 1,
        timeout: 30000,
    });
    const content = res.content;
    if (!content || !content.length) throw new Error('range http >=400 or empty');
    const bytes = content instanceof Uint8Array ? content : Uint8Array.from(content);
    const cr = res.headers && (res.headers['content-range'] || res.headers['Content-Range']);
    let total = -1;
    if (cr) {
        const slash = String(cr).lastIndexOf('/');
        if (slash >= 0 && slash < String(cr).length - 1) {
            const t = parseInt(String(cr).substring(slash + 1).trim(), 10);
            if (!isNaN(t)) total = t;
        }
    }
    return { bytes: bytes, total: total };
}

// ============================ 网页 SSR 解析 ============================

/** 从 SSR 页面里取出内嵌 _ROUTER_DATA JSON（大括号/方括号配对扫描）。 */
function extractRouter(html) {
    const index = html.indexOf('_ROUTER_DATA');
    if (index < 0) {
        // 2026-10 官网搜索页改 CSR 后搜索路径不再输出 _ROUTER_DATA；详情/分类页若也出现此错=官网又改版
        log('extractRouter FAIL _ROUTER_DATA 不存在 htmlLen=' + (html == null ? -1 : html.length)
            + ' head=[' + (html == null ? '' : html.substring(0, Math.min(200, html.length))).replace(/\n/g, ' ') + ']');
        throw new Error('router data missing');
    }
    const at = html.indexOf('{', index);
    if (at < 0) throw new Error('router data missing');
    let inString = false;
    let escaped = false;
    let depth = 0;
    for (let i = at; i < html.length; i++) {
        const c = html.charAt(i);
        if (inString) {
            if (escaped) escaped = false;
            else if (c === '\\') escaped = true;
            else if (c === '"') inString = false;
        } else if (c === '"') {
            inString = true;
        } else if (c === '{' || c === '[') {
            depth++;
        } else if (c === '}' || c === ']') {
            depth--;
            if (depth === 0) {
                try {
                    return safeParse(html.substring(at, i + 1));
                } catch (e) {
                    throw new Error('router data json: ' + (e && e.message || e));
                }
            }
        }
    }
    throw new Error('router data unbalanced');
}

function router(url) {
    return extractRouter(textGet(url)).loaderData;
}

// ============================ superguoguo 免签面（bookmall/tab 首页 + H5 详情） ============================

/** H5/JSON 内嵌实体转义还原（&quot; 等在配对扫描前必须还原，否则字符串边界判断失效）。 */
function unescapeHtml(s) {
    if (s == null) return '';
    return String(s).replace(/&quot;/g, '"').replace(/&#34;/g, '"').replace(/&#x22;/g, '"')
        .replace(/&#39;/g, "'").replace(/&lt;/g, '<').replace(/&gt;/g, '>')
        .replace(/&amp;/g, '&');
}

/** 从 s 的 at 位置（'{' 或 '['）做括号配对扫描，返回平衡的 JSON 文本；失败抛错。 */
function scanBalanced(s, at) {
    const open = s.charAt(at);
    const close = open === '{' ? '}' : ']';
    let inString = false;
    let escaped = false;
    let depth = 0;
    for (let i = at; i < s.length; i++) {
        const c = s.charAt(i);
        if (inString) {
            if (escaped) escaped = false;
            else if (c === '\\') escaped = true;
            else if (c === '"') inString = false;
        } else if (c === '"') {
            inString = true;
        } else if (c === open) {
            depth++;
        } else if (c === close) {
            depth--;
            if (depth === 0) return s.substring(at, i + 1);
        }
    }
    throw new Error('unbalanced json at ' + at);
}

/**
 * H5 album-share SSR 详情（superguoguo 主路）：一次拿 series_data 元数据 + chapter_ids 全集 vid。
 * 返回 {sd: series_data 对象, vids: chapter_ids 数组}。
 */
function h5Album(seriesId) {
    const html = text(H5_ALBUM_URL + '?video_id=' + seriesId, 'GET', null, { 'User-Agent': H5_UA });
    if (!html) throw new Error('H5 空响应');
    const s = unescapeHtml(html);
    const at = s.indexOf('"series_data"');
    if (at < 0) throw new Error('series_data missing htmlLen=' + s.length);
    const sd = safeParse(scanBalanced(s, s.indexOf('{', at)));
    const at2 = s.indexOf('"chapter_ids"');
    if (at2 < 0) throw new Error('chapter_ids missing');
    const vids = safeParse(scanBalanced(s, s.indexOf('[', at2)));
    if (!vids || !vids.length) throw new Error('chapter_ids 空');
    log('h5Album done id=' + seriesId + ' title=' + (sd.title || '') + ' vids=' + vids.length);
    return { sd: sd, vids: vids };
}

// ============================ 卡片/分页 ============================

/** series_id 必须是纯数字（蓝本 valid()），防止把广告位解析成条目。 */
function valid(id, title) {
    return /^[0-9]{1,30}$/.test(String(id || '')) && String(title || '').trim().length > 0;
}

function tagsText(tags) {
    if (tags == null) return '';
    let sb = '';
    for (let t = 0; t < Math.min(tags.length, 5); t++) {
        const s = String(tags[t] == null ? '' : tags[t]).trim();
        if (s) {
            if (sb) sb += ' · ';
            sb += s;
        }
    }
    return sb;
}

function cards(rows) {
    const out = [];
    if (rows == null) {
        log('cards 输入 rows=null（接口/页面无列表数据）');
        return out;
    }
    for (let i = 0; i < rows.length; i++) {
        const item = rows[i];
        if (!item || typeof item !== 'object') continue;
        let o = item.video_data && typeof item.video_data === 'object' ? item.video_data : item;
        const se = o.series_episode_info && typeof o.series_episode_info === 'object' ? o.series_episode_info : null;
        const count = o.episode_cnt != null ? (o.episode_cnt | 0) : (se ? (se.episode_cnt | 0) : 0);
        const id = String(o.series_id == null ? '' : o.series_id);
        let name = String(o.series_name == null ? '' : o.series_name);
        if (!name) name = String(o.series_title == null ? '' : o.series_title);
        if (!valid(id, name)) continue;
        let badge = String(o.episode_right_text == null ? '' : o.episode_right_text);
        if (!badge && count > 0) badge = '全 ' + count + ' 集';
        const tags = o.tags != null ? o.tags : (o.category_list != null ? o.category_list : null);
        out.push({
            id: id,
            name: name.trim(),
            cover: String(o.series_cover == null ? '' : o.series_cover),
            intro: String(o.series_intro == null ? '' : o.series_intro),
            badge: badge,
            tags: tagsText(tags),
        });
    }
    // 按 id 去重（蓝本 distinctBy id）
    const seen = {};
    const distinct = [];
    for (let i = 0; i < out.length; i++) {
        if (seen[out[i].id]) continue;
        seen[out[i].id] = 1;
        distinct.push(out[i]);
    }
    if (out.length !== distinct.length || distinct.length === 0) {
        log('cards rows=' + rows.length + ' valid=' + out.length + ' distinct=' + distinct.length
            + (distinct.length === 0 ? '（全部条目无效：series_id/名称缺失或字段结构变化）' : '（含去重丢弃）'));
    }
    return distinct;
}

/** 官网分类页（热播）。 */
function home(page) {
    const url = SITE + '/category?tab=1&sort_type=1' + (page > 1 ? '&page=' + page : '');
    return parseCategoryPage(router(url), page);
}

/** 影视类型分类页（真人剧/漫剧/AI剧）：/category/{type}[/{slug}]?page=N，slug=路径式筛选（官网实测路由）。 */
function typeCategoryPage(type, slug, page) {
    let url = SITE + '/category/' + type;
    if (slug) url += '/' + slug;
    if (page > 1) url += '?page=' + page;
    return parseCategoryPage(router(url), page);
}

/** 分类页 loaderData 公共解析：key 兼容 category_page / category_$，列表取 recommendList。 */
function parseCategoryPage(section, page) {
    let s = section.category_page;
    if (s == null) s = section.category_$;
    if (s == null) throw new Error('category page missing (loaderData keys: ' + keysOf(section) + ')');
    let rows = s.recommendList;
    if (rows == null) {
        const cd = s.categoryData;
        rows = cd == null ? null : cd.recommendList;
    }
    const items = cards(rows);
    let last = 100;
    const pag = s.pagination;
    if (pag != null) last = Math.max(1, Math.min(100, pag.totalPages != null ? (pag.totalPages | 0) : 100));
    return { items: items, page: page, lastPage: last, hasMore: items.length > 0 && page < Math.min(last, 100) };
}

function keysOf(o) {
    if (o == null) return '(null)';
    return Object.keys(o).join(',');
}

/** 官网搜索（2026-10 官网改版：搜索页改为纯 CSR，SSR _ROUTER_DATA 不再输出，旧 SSR 解析必失效）。
 *  改走官网前端同款 JSON 接口：GET /api/search/result?aid=8662&query=<kw>&pageNum=<page>
 *  实测无需 msToken/a_bogus 签名（普通 UA 即可）；返回 searchList[].video_data 与分类页卡片同构，复用 cards()。
 *  接口有频控（连续请求返回 {"code":"upstream_unavailable"}），无数据时退避重试一次。 */
function searchPage(keyword, page) {
    const url = SITE + '/api/search/result?aid=8662&query=' + enc(keyword)
        + (page > 1 ? '&pageNum=' + page : '');
    let json = null;
    for (let attempt = 0; attempt < 2; attempt++) {
        if (attempt > 0) sleepBusy(600);
        try {
            const cand = safeParse(textGet(url));
            if (cand.searchList) {
                json = cand;
                break;
            }
            log('searchPage attempt#' + attempt + ' 无 searchList 字段 code=' + (cand.code == null ? '?' : cand.code)
                + ' message=' + (cand.message || '')
                + ' bodyHead=[' + JSON.stringify(cand).substring(0, 200) + ']');
        } catch (e) {
            log('searchPage attempt#' + attempt + ' FAIL : ' + (e && e.message || e) + ' url=' + url);
        }
    }
    if (json == null) {
        log('searchPage FAIL 2 次尝试均失败 url=' + url + '（官网接口不可用/频控，返回空结果）');
        throw new Error('search api unavailable (2 attempts)');
    }
    const items = cards(json.searchList);
    const last = Math.max(1, Math.min(100, json.totalPages != null ? (json.totalPages | 0) : 1));
    log('searchPage ok kw=[' + keyword + '] page=' + page + ' items=' + items.length
        + ' totalPages=' + last + ' totalCount=' + (json.totalCount != null ? json.totalCount : -1)
        + ' hasMore=' + !!json.hasMore);
    return { items: items, page: page, lastPage: last, hasMore: items.length > 0 && page < Math.min(last, 100) };
}

/** 漫剧榜：数据在 <script data-fn-name="r|mergeLoaderData" data-fn-args="..."> 属性里（蓝本 ComicRank.parse）。
 *  注意：r 标签里 name 与 args 之间可能隔着 data-script-src 等属性，必须按整标签分别提取两个属性。 */
function rankPage(page) {
    const html = textGet(SITE + '/rank/hot-comic-drama?page=' + page);
    const tagRe = /<script[^>]*>/g;
    const nameRe = /data-fn-name=(["'])([^"']*)\1/;
    const argsRe = /data-fn-args=(["'])([\s\S]*?)\1(?=[\s>])/;
    let tm;
    while ((tm = tagRe.exec(html)) !== null) {
        const tag = tm[0];
        if (tag.indexOf('data-fn-name') < 0 || tag.indexOf('data-fn-args') < 0) continue;
        const nm = nameRe.exec(tag);
        const am = argsRe.exec(tag);
        if (!nm || !am) continue;
        const name = nm[2];
        if (name !== 'r' && name !== 'mergeLoaderData') continue;
        const argsRaw = htmlDecode(am[2]).trim();
        let args;
        try {
            args = JSON.parse(argsRaw);
        } catch (ignore) {
            continue;
        }
        if (!Array.isArray(args)) continue;
        if (args[0] !== 'rank_hot-comic-drama/page') continue;
        let raw = null;
        if (name === 'r' && args[1] === 'content') {
            raw = args[2];
        } else if (name === 'mergeLoaderData') {
            const arr = args[1];
            if (Array.isArray(arr)) {
                for (let i = 0; i < arr.length; i++) {
                    const e = arr[i];
                    if (e && typeof e === 'object' && e.key === 'content') {
                        // routerDataFnName "p" 时 payload 内联在 routerDataFnArgs[0]；"s" 时是引用，落空后走 _ROUTER_DATA 兜底
                        if (e.routerDataFnName === 'p' && Array.isArray(e.routerDataFnArgs)) {
                            raw = e.routerDataFnArgs[0];
                        }
                        break;
                    }
                }
            }
        }
        let payload;
        if (raw && typeof raw === 'object' && !Array.isArray(raw)) payload = raw;
        else if (typeof raw === 'string') {
            try {
                payload = JSON.parse(raw);
            } catch (ignore) {
                continue;
            }
        } else continue;
        if (!payload.isSuccess) throw new Error('漫剧榜单暂不可用');
        const rl = payload.rankList;
        if (rl == null) throw new Error('漫剧榜单格式已变化');
        const pag = payload.pagination;
        let totalPages = pag == null ? 100 : (pag.totalPages != null ? (pag.totalPages | 0) : 100);
        if (totalPages < 1) totalPages = 100;

        const items = [];
        for (let i = 0; i < rl.length; i++) {
            const row = rl[i];
            if (!row || typeof row !== 'object') continue;
            const count = row.episodeCount != null ? (row.episodeCount | 0)
                : (row.episodeVids != null ? row.episodeVids.length : 0);
            let id = String(row.seriesId == null ? '' : row.seriesId);
            if (!id) id = String(row.id == null ? '' : row.id);
            const title = String(row.title == null ? '' : row.title);
            if (!valid(id, title)) continue;
            const badge = count > 0 ? '全 ' + count + ' 集' : String(row.heatText == null ? '' : row.heatText);
            const s = {
                id: id,
                name: title.trim(),
                cover: String(row.cover == null ? '' : row.cover),
                intro: String(row.description == null ? '' : row.description),
                badge: badge,
                tags: tagsText(row.tags),
            };
            let dup = false;
            for (let k = 0; k < items.length; k++) if (items[k].id === s.id) { dup = true; break; }
            if (!dup) items.push(s);
        }
        return { items: items, page: page, lastPage: Math.min(totalPages, 100), hasMore: items.length > 0 && page < Math.min(totalPages, 100) };
    }
    throw new Error('页面没有漫剧榜单数据');
}

function htmlDecode(s) {
    return String(s).replace(/&quot;/g, '"').replace(/&#39;/g, "'")
        .replace(/&lt;/g, '<').replace(/&gt;/g, '>')
        .replace(/&amp;/g, '&');
}

function enc(v) {
    return qg.encodeValue(v);
}

/** 详情页 → 分集 vid 列表（单次抓取；detail_page key 缺失时扫描 loaderData 兜底）。 */
function seriesDetailOf(data) {
    const dp = data.detail_page;
    if (dp != null && dp.seriesDetail != null) return dp.seriesDetail;
    for (const k of Object.keys(data)) {
        const cand = data[k];
        if (cand == null || typeof cand !== 'object') continue;
        if (cand.seriesDetail != null) return cand.seriesDetail;
    }
    return null;
}

function vidsOf(seriesDetail) {
    const out = [];
    const vids = seriesDetail.vid_list;
    if (vids != null) {
        for (let i = 0; i < vids.length; i++) {
            const v = String(vids[i] == null ? '' : vids[i]);
            if (v) out.push(v);
        }
    }
    return out;
}

// ============================ 取流（video_tab 主路 + v1 兜底 + spade 解密） ============================

function cleanUrl(v) {
    return String(v).replace(/\\\//g, '/').replace(/\\u002f/gi, '/').replace(/\\u0026/g, '&').replace(/&amp;/g, '&');
}

/** 蓝本 qualityNumber：档位描述 → 数值。 */
function qualityNumber(v) {
    if (v == null) return 0;
    let m = /2160|1440|1080|720|576|540|480|360/.exec(String(v));
    if (m) return parseInt(m[0], 10);
    const h = /(1920|1280|1024|854|640)/.exec(String(v));
    if (h) {
        const k = h[1];
        if (k === '1920') return 1080;
        if (k === '1280') return 720;
        if (k === '1024') return 576;
        if (k === '854') return 480;
        return 360;
    }
    const n = parseInt(String(v).trim(), 10);
    return isNaN(n) ? 0 : n;
}

function qualityText(q) {
    let v = String(q.quality_desc == null ? '' : q.quality_desc);
    if (!v || v === '0') v = String(q.height != null ? (q.height | 0) : 0);
    if (!v || v === '0') v = String(q.vheight != null ? (q.vheight | 0) : 0);
    if (!v || v === '0') v = String(q.quality != null ? (q.quality | 0) : 0);
    if (!v || v === '0') v = String(q.key == null ? '' : q.key);
    return v;
}

/** 播放 cdid：进程内随机 UUID，与注册设备解耦（实测 cdid 不参与设备放行判定）。 */
let playerCdid = uuidLocal();

function uuidLocal() {
    // binutil uuid4 未引入（避免与 qg_account 循环依赖无关，仅为就近），就地生成 v4
    const h = '0123456789abcdef';
    const b = new Uint8Array(16);
    for (let i = 0; i < 16; i++) b[i] = Math.floor(Math.random() * 256);
    b[6] = (b[6] & 0x0f) | 0x40;
    b[8] = (b[8] & 0x3f) | 0x80;
    let s = '';
    for (let i = 0; i < 16; i++) {
        if (i === 4 || i === 6 || i === 8 || i === 10) s += '-';
        s += h[b[i] >> 4] + h[b[i] & 15];
    }
    return s;
}

/** 持续空响应（设备软拒特征）时强制重新注册匿名设备（tsukiyo PR#30 思路：
 *  未注册设备是空响应根因，随机轮换治标不治本；重注册走 device_register 并持久化覆盖旧文件）。 */
function rotatePlayerDevice() {
    try {
        appDevice(true);
    } catch (t) {
        log('rotatePlayerDevice 重注册失败: ' + t);
    }
    playerCdid = uuidLocal();
    const dev = appDevice(false);
    log('rotatePlayerDevice 已重注册播放设备 ' + dev.device_id);
}

/** 播放查询参数集（蓝图 playbackRequest 口径：注册身份 + 版本覆盖 7.3.9.32(73932)）。 */
function playbackValues(dev, cdid) {
    const values = {};
    values.iid = dev.install_id;
    values.device_id = dev.device_id;
    values.ac = 'wifi';
    values.channel = 'update_64';
    values.aid = '8662';
    values.app_name = 'novelread';
    values.version_code = '73932';
    values.version_name = '7.3.9.32';
    values.device_platform = 'android';
    values.os = 'android';
    values.ssmix = 'a';
    values.device_type = '25053RT47C';
    values.device_brand = 'Redmi';
    values.language = 'zh';
    values.os_api = '36';
    values.os_version = '16';
    values.manifest_version_code = '73932';
    values.resolution = '1280*2772';
    values.dpi = '520';
    values.update_version_code = '73932';
    values.host_abi = 'arm64-v8a';
    values.dragon_device_type = 'phone';
    values.pv_player = '73932';
    values.compliance_status = '0';
    values.need_personal_recommend = '1';
    values.player_so_load = '1';
    values.is_android_pad_screen = '0';
    values.cdid = cdid;
    return values;
}

/** 签名播放请求头（蓝图 Signer.signPlayback 口径，body=null 为 GET 口径）。 */
function playbackHeaders(query, body, ts, ticket, url, deviceId) {
    const random = Math.floor(qg.hooks.rand() * 65536);
    const headers = {};
    headers['User-Agent'] = PLAYER_UA;
    headers['Accept'] = 'application/json; charset=utf-8,application/x-protobuf';
    headers['x-ss-req-ticket'] = String(ticket);
    headers['sdk-version'] = '2';
    headers['x-xs-from-web'] = '0';
    headers['x-khronos'] = String(ts);
    headers['x-ladon'] = bytesToB64(be32(ts));
    headers['x-argus'] = bytesToB64(qg.le32(ts));
    headers['x-gorgon'] = qg.xGorgon(query, body, ts, random);
    headers['x-helios'] = qg.helios(ts);
    headers['x-medusa'] = qg.buildMedusa(url, body, ts, deviceId);
    if (body != null) {
        headers['Content-Type'] = 'application/json; charset=utf-8';
        headers['x-ss-stub'] = qg.md5HexUpper(body);
    }
    return headers;
}

/**
 * video_tab 播放模型（官方 App 现行主通道，蓝图 ContentRepository.tabVideoModel 口径）。
 * /novel/player 族自 2026-11-02 起在全部域名对所有请求返回 200+0 字节（服务端废弃），
 * 本接口为 GET + 全套签名，video_id 等参数参与签名。响应 rows[vid].video_model 与
 * 旧接口 entry 同构，返回含 video_model 的 entry JSON；失败返回 null。
 */
function videoTabModel(vid, dev, cdid) {
    const values = playbackValues(dev, cdid);
    values.video_id = vid;
    values.video_id_type = '0';
    values.device_level = '1';
    values.need_all_video_definition = '1';
    values.need_mp4_align = '0';
    values.use_os_player = '0';
    values.video_platform = '1024';
    values.source = '0';
    values.from_video_id = '';
    const now = qg.hooks.now();
    const ts = Math.floor(now / 1000);
    let query = null;
    let ticket = now;
    for (let offset = 0; offset <= 127; offset++) {
        ticket = now + offset;
        const vals = Object.assign({}, values);
        vals._rticket = String(ticket);
        const q = qg.encodeQuery(vals);
        if (qg.branchOf(q, ts) === 0) { query = q; break; }
    }
    if (query == null) throw new Error('video_tab 签名分支抖动失败（128 次）');
    const url = VIDEO_TAB_URL + '?' + query;
    const headers = playbackHeaders(query, null, ts, ticket, url, dev.device_id);
    if (dev.cookie) headers['Cookie'] = dev.cookie;
    const respText = text(url, 'GET', null, headers).trim();
    log('video_tab respLen=' + respText.length + ' head=' + respText.substring(0, Math.min(120, respText.length)).replace(/\s+/g, ' '));
    if (!respText) return null;
    const root = safeParse(respText);
    const code0 = root.code != null ? String(root.code) : (root.Code != null ? String(root.Code) : '-1');
    if (code0 !== '0') return null;
    const data = root.data;
    if (data == null) return null;
    let rows = data.video_model_data;
    if (rows == null) rows = data;
    let row = rows[vid];
    if (row == null) {
        for (const k of Object.keys(rows)) {
            const cand = rows[k];
            if (cand != null && typeof cand === 'object') { row = cand; break; }
        }
    }
    if (row == null) return null;
    const raw = row.video_model;
    let model = null;
    if (raw != null && typeof raw === 'object') {
        model = raw;
    } else if (typeof raw === 'string') {
        try { model = safeParse(raw); } catch (e) { return null; }
    }
    if (model == null || model.video_list == null || model.video_list.length === 0) return null;
    return { video_model: model };
}

const STREAM_TTL = 30 * 60 * 1000;

/** 取流缓存（vid → {si, at}，容量 8，蓝本 LRU 口径）。 */
const streamCache = {};
const streamCacheOrder = [];

function streamCacheGet(vid) {
    const e = streamCache[vid];
    if (e && Date.now() - e.at < STREAM_TTL) return e.si;
    return null;
}

function streamCachePut(vid, si) {
    streamCache[vid] = { si: si, at: Date.now() };
    streamCacheOrder.push(vid);
    while (streamCacheOrder.length > 8) {
        const old = streamCacheOrder.shift();
        delete streamCache[old];
    }
}

/** 取流（主路 video_tab，3 次重试；兜底 /novel/player POST，5 次重试）。 */
function stream(vidRaw) {
    // 兼容旧配置里 proxy://do=play&...&vid=xxx 形式的分集 id：服务端只认纯数字 vid
    let vid = vidRaw;
    if (vid != null && vid.indexOf('vid=') >= 0) {
        vid = vid.substring(vid.indexOf('vid=') + 4);
        const amp = vid.indexOf('&');
        if (amp >= 0) vid = vid.substring(0, amp);
    }
    if (vid == null || !/^[0-9]{1,30}$/.test(vid)) {
        log('stream reject vid 格式异常: ' + vid);
        throw new Error('vid 格式异常: ' + vid);
    }
    const hit = streamCacheGet(vid);
    if (hit) return hit;
    log('stream begin vid=' + vid + ' (缓存未命中，开始取流)');

    // 蓝本 preload payload（精简 biz_param + mixed_video_id_map）
    const biz = {
        detail_page_version: 0,
        device_level: 3,
        disable_digg_stat: false,
        need_all_video_definition: true,
        need_mp4_align: false,
        use_os_player: false,
        use_server_dns: false,
        video_platform: 1024,
    };
    const payload = {
        biz_param: biz,
        mixed_video_id_map: { '1004': [vid] },
    };
    const body = utf8ToBytes(JSON.stringify(payload));

    // v1 端点参数集（蓝图 PR#71 playbackRequest 口径）：版本 7.3.9.32(73932)、
    // 设备号取 appDevice() 注册身份（与搜索共享、持久化）、cdid 随机 UUID、全套签名头。
    // 主通道 video_tab（现行接口）；/novel/player POST 为遗留兜底（该族 2026-11-02 起
    // 全域名 200+0 字节废弃，仅 video_tab 失败时兜底重试）。
    let resp = null;
    let tabEntry = null;
    let entry = null;
    for (let attempt = 1; attempt <= 3 && tabEntry == null; attempt++) {
        if (attempt > 1) sleepBusy(600);
        try {
            tabEntry = videoTabModel(vid, appDevice(false), playerCdid);
        } catch (t) {
            log('video_tab attempt#' + attempt + ' FAIL : ' + t);
            if (attempt === 2) rotatePlayerDevice();
        }
    }
    if (tabEntry != null) {
        log('video_tab OK vid=' + vid);
        entry = tabEntry;
    } else {
        let lastErr = null;
        for (let attempt = 1; attempt <= 5 && resp == null; attempt++) {
            if (attempt > 1) sleepBusy(attempt === 2 ? 600 : attempt === 3 ? 900 : attempt === 4 ? 900 : 1200);
            const dev = appDevice(false);
            const values = playbackValues(dev, playerCdid);
            // 蓝图 PR#71 signPlayback：每次尝试重抖 _rticket 凑 branch 0（POST 分支带 body MD5），
            // 全量签名头绑定最终 query+body+设备身份；重试即重新签名。
            const now = qg.hooks.now();
            const ts = Math.floor(now / 1000);
            let query = null;
            let ticket = now;
            for (let offset = 0; offset <= 127; offset++) {
                ticket = now + offset;
                const vals = Object.assign({}, values);
                vals._rticket = String(ticket);
                const q = qg.encodeQuery(vals);
                if (qg.branchOfBody(q, body, ts) === 0) { query = q; break; }
            }
            if (query == null) throw new Error('播放签名分支抖动失败（128 次）');
            const url = V1_URL + '?' + query;
            const headers = playbackHeaders(query, body, ts, ticket, url, dev.device_id);
            if (dev.cookie) headers['Cookie'] = dev.cookie;
            const respText = text(url, 'POST', body, headers).trim();
            log('v1 http attempt#' + attempt + ' respLen=' + respText.length
                + ' head=' + respText.substring(0, Math.min(120, respText.length)).replace(/\s+/g, ' '));
            if (!respText) {
                lastErr = '播放接口返回空响应';
                // 对齐 tsukiyo PR#30：首次空响应保持同一身份重试；再次空响应才重注册一次（设备软拒特征）
                if (attempt === 2) rotatePlayerDevice();
                continue;
            }
            try {
                resp = safeParse(respText);
            } catch (e) {
                throw new Error('播放接口非 JSON 响应: ' + respText.substring(0, Math.min(120, respText.length)));
            }
        }
        if (resp == null) {
            throw new Error(lastErr == null ? '播放接口无响应' : lastErr + '（已重试）');
        }
        const code = resp.Code != null ? String(resp.Code) : String(resp.code == null ? '' : resp.code);
        if (code !== '0') throw new Error('播放接口 code=' + code);
        const data = resp.data;
        if (data == null) throw new Error('播放信息 data missing');
        entry = data[vid];
        if (entry == null) throw new Error('播放信息 entry missing: ' + vid);
    }

    let videoModel;
    const vm = entry.video_model;
    if (vm != null && typeof vm === 'object') {
        videoModel = vm;
    } else if (typeof vm === 'string') {
        try {
            videoModel = safeParse(vm);
        } catch (e) {
            throw new Error('video_model 非 JSON');
        }
    } else {
        throw new Error('video_model missing');
    }

    // fallback_api 在 video_model 内部（蓝本 ContentRepository：model.opt("fallback_api")），
    // 真实分片数据在 fallback 返回的 video_info.data.video_list 里
    let fallbackUrl = null;
    const fb = videoModel.fallback_api;
    if (fb != null && typeof fb === 'object' && !Array.isArray(fb)) fallbackUrl = String(fb.fallback_api == null ? '' : fb.fallback_api);
    else if (Array.isArray(fb)) fallbackUrl = String(fb.length > 0 && fb[0] != null ? fb[0] : '');
    else if (typeof fb === 'string') {
        const raw = fb.trim();
        if (raw.charAt(0) === '{') {
            try {
                fallbackUrl = String(safeParse(raw).fallback_api == null ? '' : safeParse(raw).fallback_api);
            } catch (ignore) {}
        }
        if (!fallbackUrl) fallbackUrl = raw;
    }
    if (fallbackUrl == null || fallbackUrl.indexOf('https://') !== 0) {
        throw new Error('fallback_api 缺失或非 https: ' + (fallbackUrl == null ? '(null)' : fallbackUrl.substring(0, Math.min(80, fallbackUrl.length))));
    }
    const fbResp = safeParse(textGet(fallbackUrl));
    const info = fbResp.video_info && typeof fbResp.video_info === 'object' ? fbResp.video_info.data : null;
    if (info == null) throw new Error('fallback video_info.data missing');
    const videoList = info.video_list;
    if (videoList == null || Object.keys(videoList).length === 0) throw new Error('fallback video_list missing');
    log('fallback done qualities=' + Object.keys(videoList).length
        + ' key_seed=' + (info.key_seed ? '有' : '无'));

    // 选清晰度：排除 bytevc2/bvc2，按数值降序取第一个 <=1080，否则取最低档
    let candidates = [];
    for (const k of Object.keys(videoList)) {
        const q = videoList[k];
        if (q == null || typeof q !== 'object') continue;
        const codec = String(q.codec_type == null ? '' : q.codec_type);
        if (codec.indexOf('bytevc2') >= 0 || codec.indexOf('bvc2') >= 0) continue;
        if (!String(q.main_url == null ? '' : q.main_url)) continue;
        candidates.push(q);
    }
    if (candidates.length === 0) {
        for (const k of Object.keys(videoList)) {
            const q = videoList[k];
            if (q != null && typeof q === 'object' && String(q.main_url == null ? '' : q.main_url)) candidates.push(q);
        }
    }
    if (candidates.length === 0) throw new Error('无可播放清晰度');
    candidates.sort(function (a, b) {
        return qualityNumber(qualityText(b)) - qualityNumber(qualityText(a));
    });
    let picked = candidates[candidates.length - 1];
    for (let i = 0; i < candidates.length; i++) {
        const qn = qualityNumber(qualityText(candidates[i]));
        if (qn <= 1080 && qn > 0) {
            picked = candidates[i];
            break;
        }
    }
    const qn = qualityNumber(qualityText(picked));
    const quality = qn > 1080 ? qn + 'P（兼容资源）' : (qn > 0 ? qn + 'P' : '自动');

    const encUrl = cleanUrl(picked.main_url);
    // key_seed 在 data(info) 层级
    const seed = String(info.key_seed == null ? '' : info.key_seed);
    let url;
    if (seed) {
        url = qg.decryptUrl(encUrl, b64ToBytes(seed));
    } else {
        url = encUrl;
    }
    if (url.indexOf('http') !== 0) throw new Error('解密后地址异常: ' + url.substring(0, Math.min(60, url.length)));
    // spade_a 在清晰度条目层级
    const spade = String(picked.spade_a == null ? '' : picked.spade_a);
    const streamKey = spade ? deriveKey(spade) : null;
    log('stream ok vid=' + vid + ' quality=' + quality + ' encrypted=' + (streamKey != null));

    const si = { url: url, key: streamKey, quality: quality };
    streamCachePut(vid, si);
    return si;
}

/** 同步短眠（壳单线程执行器内仅限重试窗口的短时占用；QuickJS 无 sleep，忙等换算） */
function sleepBusy(ms) {
    const end = Date.now() + ms;
    while (Date.now() < end) { /* busy */ }
}

// ============================ spade 解密（密钥派生复用 xhs_sign.deriveKey） ============================

// Java 版 Qingguoduanju.deriveKey 与 xhs_sign.deriveKey 逐字节同构（a=85,b=246，
// -21 - bitCount(i) + previous^old），直接 import 复用，不再重复实现。
// decryptUrl（SHA512(seed)+SPADE_CONST → AES-128-CBC）见 lib/qg_sign.js。

// ============================ MP4/CENC（蓝本 MediaCrypto.prepare/decrypt 同构，与 xihongshiduanju.js 同源） ============================

function boxOf(d, at, limit) {
    if (at < 0 || at + 8 > limit) return null;
    let size = u32read(d, at);
    let header = 8;
    if (size === 1) {
        if (at + 16 > limit) return null;
        size = Number(be64read(d, at + 8));
        header = 16;
    }
    if (size === 0) size = limit - at;
    if (size < header || size > limit - at) return null;
    return { start: at, end: at + size, body: at + header, type: ascii4(d, at + 4) };
}

function boxFind(d, type, start, limit) {
    for (let at = start; at <= limit - 8; at++) {
        if (d[at + 4] === type.charCodeAt(0)) {
            const b = boxOf(d, at, limit);
            if (b && type === b.type) return b;
        }
    }
    return null;
}

function ascii4(d, at) {
    return String.fromCharCode(d[at], d[at + 1], d[at + 2], d[at + 3]);
}

function countOf(d, at, limit) {
    if (at + 4 > limit) throw new Error('索引越界');
    const n = u32read(d, at);
    if (n > 200000) throw new Error('索引数量过大');
    return n;
}

const preparedCache = {};
const preparedOrder = [];

function prepareFor(vid, si, total, firstBody) {
    if (preparedCache[vid]) return preparedCache[vid];
    let headerBody = firstBody;
    if (!headerBody || !headerBody.length) {
        const r = range(si.url, 0, Math.max(HEADER_HINT, total) - 1);
        headerBody = r.bytes;
    }
    const p = prepare(headerBody, si.key);
    preparedCache[vid] = p;
    preparedOrder.push(vid);
    while (preparedOrder.length > 8) {
        const old = preparedOrder.shift();
        delete preparedCache[old];
    }
    return p;
}

/** MP4 加密索引解析 + moov 改写 → {header:Uint8Array, samples:[{start,end,encryptedOffset,iv}]} */
function prepare(data, key) {
    if (!key) return { header: new Uint8Array(0), samples: [] };
    // ftyp 之后紧跟 moov（蓝本 box(data, data.u32(0))）
    const moov = boxOf(data, u32read(data, 0), data.length);
    if (!moov || moov.type !== 'moov') throw new Error('视频索引不完整');

    const samples = [];
    const header = data.slice();
    const moovEnd = moov.end;
    let cursor = moov.body;
    while (cursor < moov.end) {
        const track = boxOf(data, cursor, moov.end);
        if (!track) throw new Error('视频轨道格式异常');
        cursor = track.end;
        if (track.type !== 'trak') continue;
        const stbl = boxFind(data, 'stbl', track.body, track.end);
        if (!stbl) continue;
        const saiz = boxFind(data, 'saiz', stbl.body, stbl.end);
        const saio = boxFind(data, 'saio', stbl.body, stbl.end);
        const stsz = boxFind(data, 'stsz', stbl.body, stbl.end);
        const stsc = boxFind(data, 'stsc', stbl.body, stbl.end);
        let chunks = boxFind(data, 'stco', stbl.body, stbl.end);
        if (!chunks) chunks = boxFind(data, 'co64', stbl.body, stbl.end);
        if (!saiz) continue;
        if (!saio) throw new Error('视频加密索引缺失');
        if (!stsz) throw new Error('样本索引缺失');
        if (!stsc) throw new Error('块索引缺失');
        if (!chunks) throw new Error('块偏移缺失');

        const n = countOf(data, stsz.body + 8, stsz.end);
        const defaultSize = u32read(data, stsz.body + 4) | 0;
        if (defaultSize === 0 && stsz.body + 12 + n * 4 > stsz.end) throw new Error('样本索引截断');
        const sizes = new Float64Array(n);
        for (let i = 0; i < n; i++) sizes[i] = defaultSize > 0 ? defaultSize : u32read(data, stsz.body + 12 + i * 4);

        const chunkCount = countOf(data, chunks.body + 4, chunks.end);
        const width = chunks.type === 'co64' ? 8 : 4;
        if (chunks.body + 8 + chunkCount * width > chunks.end) throw new Error('块偏移截断');
        const offsets = new Float64Array(chunkCount);
        for (let i = 0; i < chunkCount; i++) {
            offsets[i] = width === 8 ? Number(be64read(data, chunks.body + 8 + i * 8)) : u32read(data, chunks.body + 8 + i * 4);
        }

        const entryCount = countOf(data, stsc.body + 4, stsc.end);
        if (entryCount === 0 || stsc.body + 8 + entryCount * 12 > stsc.end) throw new Error('块索引截断');
        const firstChunk = new Float64Array(entryCount);
        const samplesPerChunk = new Float64Array(entryCount);
        for (let i = 0; i < entryCount; i++) {
            firstChunk[i] = u32read(data, stsc.body + 8 + i * 12);
            samplesPerChunk[i] = u32read(data, stsc.body + 12 + i * 12);
        }

        // saiz：body+4=default_size(1B)，body+5=count(4B)，body+9=sizes[]
        const sizeBase = saiz.body + 4 + ((be32read(data, saiz.body) & 1) ? 8 : 0);
        if (sizeBase + 5 > saiz.end) throw new Error('辅助索引截断');
        const auxDefault = data[sizeBase] & 255;
        const auxCount = countOf(data, sizeBase + 1, saiz.end);
        if (auxCount !== n || (auxDefault === 0 && sizeBase + 5 + n > saiz.end)) throw new Error('辅助索引数量不一致');
        const auxSizes = new Int32Array(n);
        for (let i = 0; i < n; i++) auxSizes[i] = auxDefault > 0 ? auxDefault : data[sizeBase + 5 + i] & 255;

        // saio：body+4=count(4B)，body+8=offset（宽 4/8）
        const offsetBase = saio.body + 4 + ((be32read(data, saio.body) & 1) ? 8 : 0);
        const offsetWidth = (data[saio.body] & 255) === 1 ? 8 : 4;
        if (countOf(data, offsetBase, saio.end) !== 1 || offsetBase + 4 + offsetWidth > saio.end) {
            throw new Error('不支持的辅助索引布局');
        }
        const aux0 = offsetWidth === 8 ? Number(be64read(data, offsetBase + 4)) : u32read(data, offsetBase + 4);
        let auxTotal = 0;
        for (let i = 0; i < n; i++) auxTotal += auxSizes[i];
        if (aux0 < 0 || aux0 + auxTotal > data.length) throw new Error('辅助数据超出索引范围');

        let sampleIndex = 0;
        let entry = 0;
        let aux = aux0;
        for (let chunk = 0; chunk < chunkCount; chunk++) {
            while (entry + 1 < entryCount && firstChunk[entry + 1] <= chunk + 1) entry++;
            if (firstChunk[entry] > chunk + 1) throw new Error('样本与块数量不一致');
            const c = samplesPerChunk[entry] | 0;
            if (c > n - sampleIndex) throw new Error('样本与块数量不一致');
            let position = offsets[chunk];
            for (let i = 0; i < c; i++, sampleIndex++) {
                const length = sizes[sampleIndex];
                const auxSize = auxSizes[sampleIndex];
                if (length <= 0 || auxSize < 8) throw new Error('样本索引异常');
                const iv16 = new Uint8Array(16);
                iv16.set(data.subarray(aux, aux + 8), 0);
                if (auxSize === 8) {
                    samples.push({ start: position, end: position + length, encryptedOffset: 0, iv: iv16 });
                } else {
                    if (auxSize < 10) throw new Error('不支持的加密样本格式');
                    const subs = ((data[aux + 8] & 255) << 8) | (data[aux + 9] & 255);
                    if (auxSize !== 10 + subs * 6) throw new Error('加密子样本索引异常');
                    let offset = position;
                    let encrypted = 0;
                    for (let s = 0; s < subs; s++) {
                        const at = aux + 10 + s * 6;
                        const clear = ((data[at] & 255) << 8) | (data[at + 1] & 255);
                        const encSize = u32read(data, at + 2) | 0;
                        offset += clear;
                        if (offset + encSize > position + length) throw new Error('加密子样本越界');
                        if (encSize > 0) samples.push({ start: offset, end: offset + encSize, encryptedOffset: encrypted, iv: iv16 });
                        encrypted += encSize;
                        offset += encSize;
                    }
                    if (offset !== position + length) throw new Error('加密子样本长度异常');
                }
                position += length;
                aux += auxSize;
            }
        }
        if (sampleIndex !== n) throw new Error('视频样本不完整');

        // moov 改写：encv/enca → frma 原始编码，sinf → free 清零体（保留 stbl 内逐个处理）
        let at = stbl.body;
        while (at + 8 <= stbl.end) {
            const sinf = boxFind(data, 'sinf', at, stbl.end);
            if (!sinf) break;
            const frma = boxFind(data, 'frma', sinf.body, sinf.end);
            if (!frma || frma.body + 4 > frma.end) throw new Error('原始编码格式缺失');
            const original = data.slice(frma.body, frma.body + 4);
            let entryAt = sinf.start - 1;
            while (entryAt >= stbl.body && 'encv' !== ascii4(data, entryAt) && 'enca' !== ascii4(data, entryAt)) {
                entryAt--;
            }
            if (entryAt < stbl.body) throw new Error('encv 缺失');
            header.set(original, entryAt);
            header.set(utf8ToBytes('free'), sinf.start + 4);
            for (let i = sinf.body; i < sinf.end; i++) header[i] = 0;
            at = sinf.end;
        }
    }
    if (!samples.length) throw new Error('视频加密索引不可用');

    samples.sort(function (a, b) { return a.start - b.start; });
    for (let i = 1; i < samples.length; i++) {
        if (samples[i].start < samples[i - 1].end) throw new Error('视频样本重叠');
    }
    // 头部截到 moov 结束：mdat 区间的密文字节绝不能进 header（否则 decrypt 会覆盖已解密数据）
    return { header: header.slice(0, moovEnd), samples: samples };
}

/** 分段解密（Java decrypt 1:1：header 拼回 + 逐样本 CTR，counter 128 位回绕）。 */
function decryptBytes(data, start, key, prepared) {
    const result = data.slice();
    const end = start + data.length;
    if (start < prepared.header.length) {
        const from = start;
        const to = Math.min(end, prepared.header.length);
        result.set(prepared.header.subarray(from, to), 0);
    }
    if (!key) return result;
    // 二分定位首个相关样本
    let low = 0, high = prepared.samples.length;
    while (low < high) {
        const mid = (low + high) >>> 1;
        if (prepared.samples[mid].end <= start) low = mid + 1;
        else high = mid;
    }
    for (let i = low; i < prepared.samples.length; i++) {
        const s = prepared.samples[i];
        if (s.start >= end) break;
        const begin = Math.max(start, s.start);
        const stop = Math.min(end, s.end);
        if (begin >= stop) continue;
        const relative = begin - s.start + s.encryptedOffset;
        const skip = relative % 16;
        // counter = BE(iv) + floor(relative/16)，128 位回绕（BigInteger.add.and(2^128-1) 同构）
        const counter = (bytesToBigIntBE(s.iv) + BigInt(Math.floor(relative / 16))) & ((1n << 128n) - 1n);
        const seg = data.subarray(begin - start, stop - start);
        const input = new Uint8Array(skip + seg.length);
        input.set(seg, skip);
        const decrypted = aesCtrDecrypt(key, counter, skip, input);
        result.set(decrypted.subarray(skip), begin - start);
    }
    return result;
}

// ============================ App 端搜索（bookapi/search/tab，蓝本 tsukiyo hongguo.cjs/Signer.kt 1:1） ============================
// 官网 Web 搜索索引残缺（部分剧不召回、pageNum 翻页无效），App 端接口为全量索引但需字节系全套签名 + 已注册设备。
// 实证链路（2026-10-26 Node golden.mjs）：匿名注册设备 → 签名搜索 code=0 → 搜到官网搜不到的新剧。

/** App 搜索接口（蓝本 hongguo.cjs APP_SEARCH_API）。 */
const APP_SEARCH_API = 'https://api5-normal-sinfonlinea.fqnovel.com/reading/bookapi/search/tab/v';
/** App 搜索专用 UA（蓝本 VendorConstants.APP_UA），与播放/网页 UA 区分。 */
const APP_UA = 'com.phoenix.read/72232 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3)';
/** 设备注册接口（蓝本 DeviceRegister.kt）：匿名、刻意不带任何签名头。 */
const REG_URL = 'https://log5-applog-lf.fqnovel.com/service/2/device_register/'
    + '?tt_data=a&cronet_version=8d40f833_2026-03-03&ttnet_version=4.2.243.31-douyin&use_store_region_cookie=1';

/** 组参 → 抖动 ticket 凑 branch 0 → 全套签名 → GET；返回响应 JSON。 */
function appSearchRequest(values, deviceId) {
    const now = qg.hooks.now();
    const ts = Math.floor(now / 1000);
    let ticket = now;
    let query = null;
    for (let offset = 0; offset <= 127; offset++) {
        ticket = now + offset;
        const vals = Object.assign({}, values);
        vals.ts = String(ts);
        vals._rticket = String(ticket);
        query = qg.pythonUrlEncode(vals);
        if (qg.branchOf(query, ts) === 0) break;
        query = null;
    }
    if (query == null) throw new Error('签名分支抖动失败（128 次）');
    const url = APP_SEARCH_API + '?' + query;
    const random = Math.floor(qg.hooks.rand() * 65536);
    const headers = {};
    headers['User-Agent'] = APP_UA;
    headers['Accept'] = 'application/json; charset=utf-8,application/x-protobuf';
    headers['x-ss-req-ticket'] = String(ticket);
    headers['x-tt-request-tag'] = 't=0;n=0';
    headers['sdk-version'] = '2';
    headers['passport-sdk-version'] = '50561';
    headers['x-xs-from-web'] = '0';
    headers['x-khronos'] = String(ts);
    headers['x-ladon'] = bytesToB64(be32(ts));
    headers['x-argus'] = bytesToB64(qg.le32(ts));
    headers['x-gorgon'] = qg.xGorgon(query, null, ts, random);
    headers['x-helios'] = qg.helios(ts);
    headers['x-medusa'] = qg.buildMedusa(url, null, ts, deviceId);
    headers['x-tt-dt'] = '';
    const resp = text(url, 'GET', null, headers).trim();
    if (!resp) throw new Error('空响应（设备失效特征）');
    let json;
    try {
        json = safeParse(resp);
    } catch (e) {
        throw new Error('非 JSON 响应: ' + resp.substring(0, Math.min(120, resp.length)));
    }
    if (String(json.code == null ? '-1' : json.code) !== '0') {
        throw new Error('code=' + (json.code == null ? '?' : json.code)
            + (json.message != null ? ' ' + json.message : ''));
    }
    return json;
}

/** 搜索响应 → Series（cells + lynx_data.cell_data 展开映射）。 */
function appSearchVod(cell) {
    const va = cell.video_data;
    let video = null;
    for (let i = 0; va != null && i < va.length; i++) {
        const v = va[i];
        if (v != null && typeof v === 'object') {
            video = v;
            break;
        }
    }
    if (video == null) return null;
    let title = '';
    const hl = cell.search_high_light;
    const hlTitle = hl == null ? null : hl.title;
    if (hlTitle != null) title = String(hlTitle.text == null ? '' : hlTitle.text);
    if (!title) title = String(video.title == null ? '' : video.title);
    if (!title) title = String(cell.cell_name == null ? '' : cell.cell_name);
    let id = String(video.series_id == null ? '' : video.series_id);
    if (!id) id = String(cell.book_id != null ? cell.book_id : (cell.search_result_id != null ? cell.search_result_id : ''));
    // 只收真剧集条目（19 位 series_id），过滤「系列剧」「其他版本」等聚合位（id 短、进详情必失败）
    if (!/^[0-9]{15,30}$/.test(id) || !title.trim()) return null;
    const cnt = video.episode_cnt != null ? (video.episode_cnt | 0) : 0;
    const badge = cnt > 0 ? '全' + cnt + '集'
        : String(video.rec_text != null ? video.rec_text : (video.sub_title != null ? video.sub_title : ''));
    return {
        id: id.trim(),
        name: title.trim(),
        cover: cleanUrl(video.cover != null ? video.cover : (video.cover_url != null ? video.cover_url : '')),
        intro: String(video.video_desc == null ? '' : video.video_desc),
        badge: badge == null ? '' : badge,
        tags: '',
    };
}

/** 分页 cursor 缓存：key=keyword|page → {result, cursor, at}，5 分钟 TTL（蓝本 searchCursors 同口径）。 */
const appSearchCache = {};
const APP_SEARCH_TTL = 5 * 60 * 1000;

/** App 端搜索整页：顺序回放 1..page 取 cursor（缓存命中跳过），设备失效空响应时重注册重试一次。 */
function appSearchPage(keyword, page) {
    let result = null;
    let searchId = null;
    let passback = null;
    for (let p = 1; p <= page; p++) {
        const key = keyword + '|' + p;
        const cached = appSearchCache[key];
        if (cached != null && qg.hooks.now() - cached.at < APP_SEARCH_TTL) {
            searchId = cached.cursor.search_id;
            passback = cached.cursor.passback;
            result = cached.result;
            continue;
        }
        try {
            result = appSearchOnce(keyword, p, searchId, passback);
        } catch (e) {
            if (e && e.message && String(e.message).indexOf('空响应') >= 0) {
                log('app search 设备失效，重新注册后重试 page=' + p);
                const dev = appDevice(true);
                result = appSearchOnce(keyword, p, searchId, passback, dev);
            } else {
                throw e;
            }
        }
        const cur = result.cursor;
        appSearchCache[key] = { result: result, cursor: cur, at: qg.hooks.now() };
        searchId = cur.search_id;
        passback = cur.passback;
    }
    return result;
}

function appSearchOnce(keyword, page, searchId, passback, devArg) {
    const dev = devArg || appDevice(false);
    log('app search begin kw=[' + keyword + '] page=' + page);
    const values = qg.appDeviceParams(dev.install_id, dev.device_id);
    values.query = keyword;
    values.count = '20';
    values.offset = String(Math.max(0, (page - 1) * 20));
    values.tab_type = '11';
    values.bookshelf_search_plan = '4';
    values.use_correct = 'true';
    values.user_is_login = '0';
    if (searchId != null && searchId) values.search_id = searchId;
    if (passback != null && passback) values.passback = passback;
    const resp = appSearchRequest(values, dev.device_id);
    const data = resp.data;
    let tabs = resp.search_tabs;
    if (tabs == null && data != null) tabs = data.search_tabs;
    let tab = null;
    for (let i = 0; tabs != null && i < tabs.length; i++) {
        const t = tabs[i];
        if (t != null && (t.tab_type | 0) === 11) {
            tab = t;
            break;
        }
    }
    const items = [];
    if (tab != null) {
        const rows = tab.data;
        for (let i = 0; rows != null && i < rows.length; i++) {
            const cell = rows[i];
            if (cell == null || typeof cell !== 'object') continue;
            const cells = [cell];
            const lynx = String(cell.lynx_data == null ? '' : cell.lynx_data);
            if (lynx) {
                try {
                    const cd = safeParse(lynx).cell_data;
                    for (let k = 0; cd != null && k < cd.length; k++) {
                        const c2 = cd[k];
                        if (c2 != null && typeof c2 === 'object') cells.push(c2);
                    }
                } catch (ignore) {}
            }
            for (let c = 0; c < cells.length; c++) {
                const s = appSearchVod(cells[c]);
                if (s == null) continue;
                let dup = false;
                for (let d = 0; d < items.length; d++) {
                    if (items[d].id === s.id) { dup = true; break; }
                }
                if (!dup) items.push(s);
            }
        }
    }
    const hasMore = !!(tab != null && tab.has_more);
    const cur = {
        search_id: tab == null ? '' : String(tab.search_id == null ? '' : tab.search_id),
        passback: tab == null ? '' : String(tab.passback == null ? '' : tab.passback),
    };
    const p = {
        items: items,
        page: page,
        lastPage: hasMore ? page + 1 : page,
        hasMore: items.length > 0 && page < (hasMore ? page + 1 : page),
        cursor: cur,
    };
    log('app search done kw=[' + keyword + '] page=' + page + ' items=' + items.length + ' hasMore=' + hasMore);
    return p;
}

// ============================ 设备注册与持久化 ============================

let appDeviceIds = null;

/** 注册请求体：ttEncrypt(gzip(JSON))，字段顺序/类型严格照抄 Node 实证成功样例（7.3.9.32 口径）。 */
function registerPayload(now) {
    // 手拼 JSON：对象 key 乱序会被服务端拒（device_id=0），顺序必须与抓包/实证一致
    const uuid = uuidLocal();
    const openudid = uuidLocal().replace(/-/g, '').substring(0, 16);
    const header = '{"display_name":"红果免费短剧",'
        + '"update_version_code":73932,'
        + '"manifest_version_code":73932,'
        + '"app_version_minor":"7.3.9.32",'
        + '"aid":8662,'
        + '"channel":"69310258a",'
        + '"package":"com.phoenix.read",'
        + '"app_version":"7.3.9.32",'
        + '"version_code":73932,'
        + '"sdk_version":"3.7.0-rc.34-fanqie-xiaoshuo",'
        + '"sdk_target_version":29,'
        + '"git_hash":"3a88f4e",'
        + '"os":"Android",'
        + '"os_version":"12",'
        + '"os_api":32,'
        + '"device_model":"25053RT47C",'
        + '"device_brand":"Redmi",'
        + '"device_manufacturer":"Redmi",'
        + '"cpu_abi":"arm64-v8a",'
        + '"release_build":"b5e187f",'
        + '"density_dpi":520,'
        + '"display_density":"mdpi",'
        + '"resolution":"1280x2772",'
        + '"language":"zh",'
        + '"timezone":8,'
        + '"access":"wifi",'
        + '"not_request_sender":0,'
        + '"carrier":"CHINA MOBILE",'
        + '"mcc_mnc":"46000",'
        + '"rom":"eng.root.20231116.160340",'
        + '"rom_version":"W528JS release-keys",'
        + '"cdid":"' + uuid + '",'
        + '"sig_hash":"56a962410c494bbaf0b58dba20cae56f",'
        + '"openudid":"' + openudid + '",'
        + '"clientudid":"' + uuidLocal() + '",'
        + '"ipv6_list":[],'
        + '"region":"CN",'
        + '"tz_name":"Asia/Shanghai",'
        + '"tz_offset":28800,'
        + '"sim_region":"cn",'
        + '"sim_serial_number":[],'
        + '"oaid_may_support":false,'
        + '"req_id":"' + uuidLocal() + '",'
        + '"device_platform":"android",'
        + '"custom":{"account_region_src":"fallback","host_bit":64,'
        + '"account_region":"cn","dragon_device_type":"phone"},'
        + '"pre_installed_channel":"",'
        + '"apk_first_install_time":' + now + ','
        + '"is_system_app":0,'
        + '"sdk_flavor":"china",'
        + '"guest_mode":0'
        + '}';
    const json = '{"magic_tag":"ss_app_log","header":' + header
        + ',"_gen_time":' + now + '}';
    const raw = utf8ToBytes(json);
    const gz = globalThis.pako.gzip(raw);
    return qg.ttEncrypt(gz);
}

/** 解析 Set-Cookie 捕获注册下发 Cookie（蓝图 PlaybackDeviceSession.toProfile 口径）。
 *  node 桩多值 header 以 '\n' 连接；壳桥待对齐（代码注释标注）。 */
function captureRegisterCookie(headers) {
    const out = [];
    try {
        let raw = '';
        for (const k of Object.keys(headers || {})) {
            if (String(k).toLowerCase() === 'set-cookie') raw = String(headers[k]);
        }
        for (const line of raw.split('\n')) {
            const v = String(line);
            const eq = v.indexOf('=');
            const sc = v.indexOf(';');
            if (eq <= 0) continue;
            const name = v.substring(0, eq).trim();
            const value = v.substring(eq + 1, sc > eq ? sc : v.length).trim();
            if (name === 'install_id' || name === 'ttreq'
                || name === 'store-region' || name === 'store-region-src') {
                out.push(name + '=' + value);
            }
        }
    } catch (ignore) {}
    return out.join('; ');
}

/** 匿名注册设备，返回 {device_id, install_id, cookie}；全 0/缺失表示被拒。 */
function registerDevice() {
    const now = qg.hooks.now();
    const body = registerPayload(now);
    const res = req(REG_URL, {
        method: 'post',
        headers: {
            'User-Agent': APP_UA,
            'Content-Type': 'application/octet-stream;tt-data=a',
            'log-encode-type': 'gzip',
            'x-ss-dp': '8662',
            'x-ss-req-ticket': String(now),
            'x-vc-bdturing-sdk-version': '4.0.3.cn',
            'lc': '101',
            'sdk-version': '2',
            'passport-sdk-version': '5051452',
            'x-neptune': '-8|50:51:59:30:40:47:49:39',
            'x-ss-stub': bytesToHex(md5Bytes(body)).toUpperCase(),
            'Accept-Encoding': 'identity', // 防 brotli，拿明文 JSON
        },
        bodyB64: bytesBodyB64(body),
        timeout: 20000,
    });
    const resp = res.content || '';
    log('device_register http len=' + resp.length);
    const json = safeParse(resp);
    const deviceId = String(json.device_id_str != null ? json.device_id_str : (json.device_id != null ? json.device_id : ''));
    const installId = String(json.install_id_str != null ? json.install_id_str : (json.install_id != null ? json.install_id : ''));
    if (!deviceId || !installId || deviceId === '0' || installId === '0') {
        throw new Error('注册被拒 device_id=' + deviceId + ' resp=' + resp);
    }
    const cookie = captureRegisterCookie(res.headers);
    // 捕获注册下发 Cookie（install_id/ttreq/store-region/store-region-src），
    // 播放请求随 Cookie 头回传，缺失会导致播放接口 110001。
    return { device_id: deviceId, install_id: installId, cookie: cookie };
}

/** App 搜索/播放设备身份：模块缓存 + local 持久化（qg_device），force 时强制重新注册。 */
function appDevice(force) {
    if (!force && appDeviceIds != null) return appDeviceIds;
    if (!force) {
        try {
            const raw = local.get(LKEY_DEVICE, '');
            if (raw) {
                const json = safeParse(raw);
                const d = String(json.device_id == null ? '' : json.device_id);
                const i = String(json.install_id == null ? '' : json.install_id);
                if (d && i) {
                    appDeviceIds = { device_id: d, install_id: i, cookie: String(json.cookie == null ? '' : json.cookie) };
                    return appDeviceIds;
                }
            }
        } catch (ignore) {}
    }
    const reg = registerDevice();
    appDeviceIds = reg;
    try {
        local.set(LKEY_DEVICE, JSON.stringify({
            device_id: reg.device_id,
            install_id: reg.install_id,
            cookie: reg.cookie || '',
        }));
    } catch (ignore) {}
    return reg;
}

// ============================ 短剧弹幕（tsukiyo hongguoTV TimedComments 蓝本，金标对齐 danmu_api hongguo） ============================
// 链路：壳播放页取 playerContent.danmaku（本地代理 URL）→ 壳弹幕 Parser GET 该 URL →
// 壳 RemoteServer do=danmu 分发回 proxy() → 本节窗口循环拉番茄小说评论弹幕接口 → B 站 XML 回吐。
// 签名四件套（X-Gorgon/X-Argus/X-Ladon/X-Khronos）复用 lib/xhs_sign.js dm* 系列（青果与西红柿
// 共用同一弹幕签名栈，dm* 与两 Java 类逐字节一致，金标已验证）。

const DM_COMMENT_HOST = 'https://api5-normal-sinfonlineb.fqnovel.com';
const DM_UA = 'com.phoenix.read/73532 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3; '
    + 'Cronet/TTNetVersion:04657795 2026-01-23 QuicVersion:c67e9834 2025-09-08)';
const DM_WINDOW_MS = 30000;
const DM_COUNT = 90;
const DM_MAX_WINDOWS = 40;   // 兜底上限：40 窗 ≈ 20 分钟，短剧单集远小于此

/** vid → series_id（detailContent 时填充，弹幕 business_param.book_id 需要）。 */
const DM_VID_SERIES = {};

/** 弹幕经壳本地代理回吐：getProxy(true) 已带 ?do=js，剥掉后拼弹幕分支。 */
function dmProxyUrl(vid) {
    const base = String(getProxy(true)).replace('?do=js', '');
    return base + '?do=danmu&siteKey=' + SITE_KEY + '&vid=' + vid;
}

/** 弹幕评论列表单窗请求（POST /novel/commentapi/comment/list/{vid}/v1/，全套签名头）。
 *  query 参数 TreeMap 字典序（Java TreeMap 口径，签名绑定 query 字节序）。 */
function dmCommentWindow(vid, bookId, startMs, durationMs, cursor) {
    const business = {
        book_id: bookId,
        start_offset_time: startMs,
        playlet_item_duration: durationMs,
        need_danmaku_guide_type: [1, 3, 4, 2],
    };
    const payload = {
        comment_source: 601,
        server_channel: 1000,
        group_id: String(vid),
        group_type: 30,
        comment_type: 20,
        sort: 1,
        count: DM_COUNT,
        cursor: cursor,
        aid: 8662,
        compliance_status: 0,
        business_param: business,
    };
    const now = Date.now();
    const params = [
        ['_rticket', String(now)],
        ['ac', 'wifi'],
        ['aid', '8662'],
        ['app_name', 'novelread'],
        ['channel', 'update_64'],
        ['device_brand', 'Redmi'],
        ['device_id', '7397450988462912345'],
        ['device_platform', 'android'],
        ['device_type', '25053RT47C'],
        ['dpi', '520'],
        ['iid', '7397450988462912346'],
        ['language', 'zh'],
        ['manifest_version_code', '73532'],
        ['os', 'android'],
        ['os_api', '36'],
        ['os_version', '16'],
        ['resolution', '1280*2772'],
        ['ssmix', 'a'],
        ['update_version_code', '73532'],
        ['version_code', '73532'],
        ['version_name', '7.3.5.32'],
    ];
    const encoded = params.map(function (p) { return p[0] + '=' + encodeURIComponent(p[1]); }).join('&');

    const nonce = [];
    for (let i = 0; i < 11; i++) nonce.push(Math.floor(Math.random() * 256));
    const first = (((nonce[0] & 255) % 7) + 1) << 5;
    const second = 0xe0 | (nonce[1] & 15);
    const argusRandom = (nonce[6] | (nonce[7] << 8) | (nonce[8] << 16) | (nonce[9] << 24)) >>> 0;
    const signCount = 2 + ((nonce[10] & 255) % 49) * 2;

    const headers = {
        'User-Agent': DM_UA,
        'Accept': 'application/json',
        'X-XS-From-Web': '0',
        'Sdk-Version': '2',
        'Comment-Source': '601',
        'Server-Channel': '1000',
        'Content-Type': 'application/json; charset=utf-8',
        'X-Gorgon': dmGorgon(dmGorgonSeed(encoded, '', '', Math.floor(now / 1000)), first, second, 0),
        'X-Khronos': String(Math.floor(now / 1000)),
        'X-SS-Req-Ticket': String(now),
        'X-SS-STUB': '',
        'X-Argus': dmArgus(encoded, '', Math.floor(now / 1000), argusRandom, signCount),
        'X-Ladon': dmLadon(Math.floor(now / 1000), new Uint8Array(nonce.slice(2, 6))),
    };
    const res = req(DM_COMMENT_HOST + '/novel/commentapi/comment/list/' + vid + '/v1/?' + encoded, {
        method: 'post',
        headers: headers,
        data: payload,
        postType: 'json',
        timeout: 15000,
    });
    return safeParse(res.content || '{}');
}

function dmEscape(t) {
    return String(t).replace(/&/g, '&amp;').replace(/</g, '&lt;').replace(/>/g, '&gt;')
        .replace(/"/g, '&quot;').replace(/'/g, '&apos;');
}

/** 窗口循环拉全集弹幕 → B 站 XML（tsukiyo TimedComments.parse 同构 + danmu_api has_more 推进）。
 *  Java 版窗间 Thread.sleep(300+rand*200) 节流在同步壳里以 busy-wait 代价过高，删除
 *  （与已完成移植 xihongshiduanju.js 同口径：上游 HTTP 延迟天然形成窗间隔）。 */
function dmFetchXml(vid, bookId) {
    const xml = ['<?xml version="1.0" encoding="UTF-8"?>\n<i>'];
    const markers = [];
    const seenIds = {};
    let startMs = 0;
    let cursor = '';
    let total = 0;
    try {
        for (let i = 0; i < DM_MAX_WINDOWS; i++) {
            const marker = startMs + ':' + cursor;
            if (markers.indexOf(marker) >= 0) break;
            markers.push(marker);
            const resp = dmCommentWindow(vid, bookId, startMs, 0, cursor);
            if ((resp.code != null ? resp.code : -1) !== 0) {
                log('danmu window code=' + (resp.code != null ? resp.code : -1)
                    + ' msg=' + (resp.message || resp.msg || ''));
                break;
            }
            const data = resp.data;
            if (!data) break;
            const extra = data.extra;
            let next = extra ? (extra.next_query_danmaku_list_time != null ? extra.next_query_danmaku_list_time : startMs + DM_WINDOW_MS) : startMs + DM_WINDOW_MS;
            if (next <= startMs) next = startMs + DM_WINDOW_MS;
            const listInfo = data.common_list_info;
            const nextCursor = listInfo ? String(listInfo.cursor == null ? '' : listInfo.cursor) : '';
            const hasMore = !!(listInfo && listInfo.has_more);
            const rows = data.data_list;
            let win = 0;
            if (rows != null) {
                for (let r = 0; r < rows.length; r++) {
                    const row = rows[r];
                    const comment = row ? row.comment : null;
                    if (!comment) continue;
                    const common = comment.common;
                    const expand = comment.expand;
                    if (!common || !expand) continue;
                    // 只收本集在播弹幕（group_id 匹配 + status=1 正常态）
                    if (String(common.group_id || '') !== String(vid) || ((common.status != null ? common.status : -1) | 0) !== 1) continue;
                    const time = expand.offset_time != null ? expand.offset_time : -1;
                    let id = String(comment.comment_id == null ? '' : comment.comment_id);
                    if (id.length > 120) id = id.substring(0, 120);
                    let t = common.content ? String(common.content.text || '') : '';
                    t = t.replace(/[\u0000-\u0008\u000b\u000c\u000e-\u001f\u2028\u2029]/g, ' ').trim();
                    if (t.length > 180) t = t.substring(0, 180);
                    if (!id || !t || seenIds[id]) continue;
                    seenIds[id] = 1;
                    xml.push('<d p="' + (time / 1000.0).toFixed(2) + ',1,25,16777215">' + dmEscape(t) + '</d>');
                    total++;
                    win++;
                }
            }
            if (!hasMore) break;
            startMs = next;
            cursor = nextCursor;
        }
    } catch (e) {
        log('danmu fetch FAIL vid=' + vid + ' : ' + e);
    }
    xml.push('</i>');
    log('danmu fetch done vid=' + vid + ' series=' + bookId + ' windows=' + markers.length
        + ' count=' + total + ' bytes=' + xml.join('').length);
    return xml.join('');
}

/** 壳代理 do=danmu 分支：拉弹幕回吐 B 站 XML（失败 500 → 壳侧自动降级内置弹幕库搜索）。 */
function proxyDanmu(params) {
    const vid = params.vid;
    if (!vid || !/^\d+$/.test(String(vid))) {
        log('proxy danmu invalid vid=' + vid);
        return null;
    }
    try {
        const series = DM_VID_SERIES[String(vid)] || '';
        const xml = dmFetchXml(String(vid), series);
        return [200, 'text/xml;charset=utf-8', xml, {}];
    } catch (e) {
        log('proxy danmu FAIL vid=' + vid + ' : ' + e);
        // 用 500 不用 502：壳侧 NanoHTTPD Status 枚举缺 502（Java 版注释口径）
        return [500, 'text/plain', '', { 'Content-Length': '0' }];
    }
}

/** 壳代理 do=play 分支：__range 分段 → CENC 解密 → 206 回吐。 */
function proxyPlay(params) {
    const vid = params.vid;
    if (!vid || !/^\d+$/.test(String(vid))) {
        log('proxy invalid vid=' + vid);
        return null;
    }
    let rangeHeader = params['__range'];
    if (!rangeHeader) rangeHeader = params['range'];
    if (!rangeHeader) rangeHeader = 'bytes=0-';
    const m = /bytes=(\d+)-(\d*)/.exec(String(rangeHeader));
    if (!m) {
        log('proxy bad range=' + rangeHeader);
        return null;
    }
    const start = parseInt(m[1], 10);

    const si = stream(String(vid));
    const r = range(si.url, start, start + SEG_SIZE - 1);
    let total = r.total;
    if (total <= 0) total = start + r.bytes.length;
    log('proxy vid=' + vid + ' start=' + start + ' got=' + r.bytes.length + ' total=' + total);

    const prepared = si.key ? prepareFor(vid, si, total, start === 0 ? r.bytes : null)
        : { header: new Uint8Array(0), samples: [] };
    const decrypted = decryptBytes(r.bytes, start, si.key, prepared);

    if (!decrypted.length) {
        return [404, 'text/plain', '', { 'Content-Length': '0' }];
    }
    const realEnd = start + decrypted.length - 1;
    return [206, 'video/mp4', bytesToB64(decrypted),
        { 'Content-Range': 'bytes ' + start + '-' + realEnd + '/' + total, 'Accept-Ranges': 'bytes' }, 1];
}

// ============================ 输出工具 ============================

function pageData(items, page, lastPage, hasMore) {
    const list = [];
    for (let i = 0; i < items.length; i++) {
        list.push({
            vod_id: items[i].id,
            vod_name: items[i].name,
            vod_pic: items[i].cover,
            vod_remarks: items[i].badge,
            vod_actor: items[i].tags,
            vod_content: items[i].intro,
        });
    }
    return JSON.stringify({
        list: list,
        page: page,
        pagecount: hasMore ? Math.max(page, lastPage) : page,
        limit: 20,
        total: 0,
    });
}

function emptyPage(page) {
    return pageData([], page, page, false);
}

// ============================ 影视类型分类（官网 /category/{type}） ============================

/** type_id + 类型名 + 类型内筛选（名称|slug，官网 selectorList 实测固化）。 */
const TYPE_FILTERS = [
    ['real-drama', '真人剧热播榜',
        '爱情|romance', '年代|period', '逆袭|comeback', '传奇|legend', '成长|growth', '家庭|family',
        '家族|clan', '萌宝|cute-kids', '悬疑|suspense', '惊悚|thriller', '恐怖|horror', '志怪|supernatural',
        '古装|costume', '玄幻|fantasy', '奇幻|wonder', '都市|urban', '青春|youth', '喜剧|comedy',
        '科幻|sci-fi', '灾难|disaster', '动作冒险|action-adventure', '战争|war', '综艺|variety', '剧情|drama'],
    ['comic-drama', '漫剧热播榜',
        '脑洞|creative', '玄幻|fantasy', '剧情|drama', '末世|apocalypse', '豪门|wealthy-family',
        '奇幻|wonder', '科幻|sci-fi', '冒险|adventure'],
    ['ai-drama', 'AI剧热播榜',
        '脑洞|creative', '玄幻|fantasy', '剧情|drama', '末世|apocalypse', '豪门|wealthy-family',
        '奇幻|wonder', '科幻|sci-fi', '冒险|adventure'],
];

/** 是否为影视类型分类（真人剧/漫剧/AI剧）。 */
function isTypeCategory(tid) {
    for (let i = 0; i < TYPE_FILTERS.length; i++) if (TYPE_FILTERS[i][0] === tid) return true;
    return false;
}

// ============================ Spider 协议 ============================

export default {
    init(cfg) {
        log('init');
    },

    home(filter) {
        try {
            const classes = [
                { type_id: 'hot', type_name: '热播榜' },
                { type_id: 'real-drama', type_name: '真人剧热播榜' },
                { type_id: 'comic-drama', type_name: '漫剧热播榜' },
                { type_id: 'ai-drama', type_name: 'AI剧热播榜' },
            ];
            // 类型内筛选组（key=cate）：值=官网筛选 slug，category 拼 /category/{type}/{slug} 路径式筛选
            const filters = {};
            for (let d = 0; d < TYPE_FILTERS.length; d++) {
                const def = TYPE_FILTERS[d];
                const values = [{ n: '全部', v: '' }];
                for (let i = 2; i < def.length; i++) {
                    const bar = def[i].indexOf('|');
                    values.push({ n: def[i].substring(0, bar), v: def[i].substring(bar + 1) });
                }
                filters[def[0]] = [{ key: 'cate', name: '分类', value: values }];
            }
            log('home done cats=' + classes.length);
            return JSON.stringify({ class: classes, filters: filters });
        } catch (e) {
            log('home FAIL ' + e);
            return '';
        }
    },

    homeVod() {
        // 站点推荐模式「推荐」货架数据源（与点播源同构）：官网热播分类页第一页
        try {
            const p = home(1);
            log('homeVod done items=' + p.items.length);
            return pageData(p.items, 1, 1, false);
        } catch (e) {
            log('homeVod FAIL ' + e);
            return '';
        }
    },

    category(tid, pg, filter, extend) {
        let page = 1;
        try { page = Math.max(1, parseInt(String(pg == null ? '1' : pg).trim(), 10) || 1); } catch (e) {}
        try {
            let p;
            log('category enter tid=' + tid + ' pg=' + pg + ' extend=' + JSON.stringify(extend || {}));
            if (tid === 'rank') {
                p = rankPage(page);
            } else if (isTypeCategory(String(tid || ''))) {
                const slug = extend == null ? '' : String(extend.cate == null ? '' : extend.cate).trim();
                p = typeCategoryPage(String(tid), slug, page);
            } else {
                p = home(page);
            }
            log('category done tid=' + tid + ' page=' + page + ' items=' + p.items.length + ' more=' + p.hasMore);
            return pageData(p.items, page, p.lastPage, p.hasMore);
        } catch (e) {
            log('category FAIL tid=' + tid + ' page=' + page + ' : ' + e);
            return emptyPage(page);
        }
    },

    search(wd, quick, pg) {
        const t0 = Date.now();
        let page = 1;
        try { page = Math.max(1, parseInt(String(pg == null ? '1' : pg).trim(), 10) || 1); } catch (e) {}
        const keyword = String(wd == null ? '' : wd).trim();
        log('search enter kw=[' + keyword + '] page=' + page + ' quick=' + quick);
        if (!keyword || keyword.length > 80) {
            log('search skip empty/long keyword');
            return emptyPage(page);
        }
        // ① App 端搜索（bookapi/search/tab，全量索引；官网索引残缺、部分剧不召回）
        try {
            const p = appSearchPage(keyword, page);
            if (p.items.length) {
                const out = pageData(p.items, page, p.lastPage, p.hasMore);
                log('search done(app) kw=[' + keyword + '] page=' + page
                    + ' items=' + p.items.length + ' cost=' + (Date.now() - t0) + 'ms');
                return out;
            }
            log('app search 空结果 kw=[' + keyword + '] page=' + page + ' → 官网 Web 兜底');
        } catch (t) {
            log('app search FAIL kw=[' + keyword + '] page=' + page
                + ' → 官网 Web 兜底 : ' + t);
        }
        // ② 官网 JSON 接口兜底（/api/search/result；有频控、索引残缺，作降级通道）
        try {
            const p = searchPage(keyword, page);
            const out = pageData(p.items, page, p.lastPage, p.hasMore);
            log('search done(web) kw=[' + keyword + '] page=' + page
                + ' items=' + p.items.length + ' lastPage=' + p.lastPage + ' more=' + p.hasMore
                + ' outLen=' + out.length + ' cost=' + (Date.now() - t0) + 'ms');
            return out;
        } catch (e) {
            log('search FAIL kw=[' + keyword + '] page=' + page + ' : ' + e + ' (返回空列表，壳侧将显示该源无结果)');
            return emptyPage(page);
        }
    },

    detail(id) {
        const t0 = Date.now();
        try {
            const sid = String(id);
            log('detail enter id=' + sid);
            // superguoguo 免签主路：H5 album-share SSR 单次拿 series_data + chapter_ids 全集（失败回落官网 SSR）
            let sd = null;
            let vids = [];
            try {
                const h5 = h5Album(sid);
                sd = h5.sd;
                vids = (h5.vids || []).filter(function (v) { return v != null && String(v) !== ''; }).map(String);
            } catch (t) {
                log('h5Album FAIL id=' + sid + ' → 官网兜底 : ' + t);
            }
            // 官网 SSR 兜底：详情元数据与分集 vid 同源（此前抓两次，弱网下易触发壳 30s 超时）
            if (sd == null || !vids.length) {
                const data = router(SITE + '/detail?series_id=' + sid);
                sd = seriesDetailOf(data);
                if (sd == null) throw new Error('seriesDetail missing (loaderData keys: ' + keysOf(data) + ')');
                vids = vidsOf(sd);
                if (!vids.length && sd.episodeVids != null) {
                    for (let i = 0; i < sd.episodeVids.length; i++) {
                        const v = String(sd.episodeVids[i] == null ? '' : sd.episodeVids[i]);
                        if (v) vids.push(v);
                    }
                }
            }
            if (!vids.length) throw new Error('vid_list missing');

            // 字段兼容：H5 用 title/serial_count，官网用 series_title/episode_cnt
            let count = sd.episode_cnt != null ? (sd.episode_cnt | 0) : (sd.series_episode_cnt != null ? (sd.series_episode_cnt | 0) : 0);
            if (!count) count = sd.serial_count != null ? (sd.serial_count | 0) : 0;
            if (!count) {
                const info = sd.series_episode_info;
                if (info != null) count = info.episode_cnt != null ? (info.episode_cnt | 0) : 0;
            }
            let badge = String(sd.episode_right_text == null ? '' : sd.episode_right_text);
            if (!badge && count > 0) badge = '全 ' + count + ' 集';
            const name = String(sd.series_title != null ? sd.series_title
                : (sd.series_name != null ? sd.series_name : (sd.title != null ? sd.title : '')));
            const cover = String(sd.series_cover == null ? '' : sd.series_cover);
            const intro = String(sd.series_intro == null ? '' : sd.series_intro);

            const play = [];
            for (let i = 0; i < vids.length; i++) {
                // 分集 id 必须是纯数字 vid：壳会把 vod_play_url 里的 id 原样传给 playerContent，
                // proxy:// 形式会让 stream() 拿完整 URL 去请求 preload 被风控软拒（200 空体）
                play.push('第' + ('0' + (i + 1)).slice(-2) + '集$' + vids[i]);
                // 弹幕 business_param.book_id 需要 series_id：detail 时建立 vid→series 映射
                DM_VID_SERIES[String(vids[i])] = sid;
            }

            const v = {
                vod_id: sid,
                vod_name: name,
                vod_pic: cover,
                vod_content: intro,
                vod_remarks: badge,
                type_id: 'hot',
                type_name: '短剧',
                vod_play_from: '青果短剧',
                vod_play_url: play.join('#'),
            };
            // 壳侧 AbsJson.toAbsXml() 只解析 MacCMS 格式 {"list":[...]}，顶层裸 vod 对象会 NPE
            log('detail done id=' + sid + ' name=' + name + ' vids=' + vids.length
                + ' cost=' + (Date.now() - t0) + 'ms');
            // Java 版详情页打开即后台预热前 3 集（PRIMER 线程池）：QuickJS 无线程，删除
            return JSON.stringify({ code: 1, list: [v] });
        } catch (e) {
            log('detail FAIL ids=' + id + ' : ' + e);
            return '';
        }
    },

    play(flag, id, vipFlags) {
        const t0 = Date.now();
        try {
            const si = stream(String(id));
            // flag 必须回显入参（= detail 的 vod_play_from）：壳的 stale 校验比较 result.flag 与当前播放片源名，
            // 填清晰度会被当作过期结果静默丢弃 → 永远转圈
            log('play id=' + id + ' cost=' + (Date.now() - t0) + 'ms quality=' + si.quality);
            return JSON.stringify({
                parse: 0,
                playUrl: '',
                header: {},
                flag: !flag ? '青果短剧' : flag,
                url: 'proxy://do=play&siteKey=' + SITE_KEY + '&vid=' + id,
                // 弹幕：壳 DanmuLoadController 拉取该 URL（本地代理 do=danmu 分支回吐 B 站 XML）
                danmaku: dmProxyUrl(String(id)),
            });
        } catch (e) {
            log('play FAIL id=' + id + ' cost=' + (Date.now() - t0) + 'ms : ' + e);
            // 失败必须显式回传 msg（壳侧 handleResolvePlayUrlFailed 会显示），返回空串会被当无结果处理
            const reason = e && e.message ? String(e.message) : String(e);
            return JSON.stringify({
                msg: '获取播放数据失败：' + reason,
                flag: !flag ? '青果短剧' : flag,
                url: '',
                parse: 0,
            });
        }
    },

    /** 云端账号能力（红果登录 + 云端观看历史）：协议见 lib/qg_account.js handle 注释。 */
    action(json) {
        return accountHandle({
            appDevice: appDevice,
            httpText: text,
            log: log,
        }, json);
    },

    /** 本地代理：__range 分段 → CENC 解密 → 206 回吐（与壳 getProxy 契约一致）。 */
    proxy(params) {
        try {
            if (params.do === 'danmu') return proxyDanmu(params);
            if (params.do !== 'play') return null;
            return proxyPlay(params);
        } catch (e) {
            log('proxy FAIL vid=' + params.vid + ' : ' + e);
            return [500, 'text/plain', '', { 'Content-Length': '0' }];
        }
    },
};

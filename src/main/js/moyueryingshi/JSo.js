/**
 * JSo.js — 🐾┆珈珈┆搜索（JS 版，catvod JsSpider 协议）
 *
 * 移植自：kele/src/ysc/diy/摸鱼儿/readable_sources/com/github/catvod/spider/JSo.java
 * （extends Cloud，j-so.com 盘搜聚合）+ 依赖 merge 类：AbstractC0260h/C0257g（站点选择器）、
 * AbstractC0302v0（b1/s0/c1/j/d1：盘链识别/展示名/图标）、AbstractC0309x1（Base64 NO_WRAP）、
 * p001b.{g,k}、X1（okhttp）。
 *
 * 移植差异（逻辑 1:1，以下为 JS 壳约束下的必要映射）：
 *  - jsoup → cheerio；h0.d 语义同 FishCloud.js 头注；
 *  - Cloud 基类网盘后端（Quark/UC/Ali/… 十类 SDK）不随本文件移植：jso_search@@/jso@@@ 详情
 *    收集到的盘链 → vod_play_from=盘类型短名 / vod_play_url=原始分享链接（$$$ 并行数组，
 *    与 Cloud.e(list,z) 输出结构一致），play 阶段直通（Java 对未识别播放 id 本就 `return str`）；
 *    对裸盘链 id 的 detail：Cloud.detailContent 降级为直通 vod（空/未知类型 → x(id) 提示 vod）；
 *  - FishCrypto.beginHostEntry/endHostEntry 丢弃；FishCrypto.b(str)（detail JSON 透传）→ 恒等；
 *    N1.d/AbstractC0280n1.p/q → no-op；
 *  - AbstractC0302v0.d1()/j()（N1.u 内置图标）→ 空串；JSo.l 热搜 pill 的站点 logo
 *    （site + "/ing/logo100.png"）为真实 URL，保留；
 *  - JSo.k 标题清洗正则：Java 原表解码后第二段字面为 "\\b(4K|8K|1080P|2160P|HDR|H265|WEB|SDR|???)
 *    \\b"（字面 ???，Java 正则非法、replaceAll 必抛），JS 取其意图实现（去 ???，保留有效词元）；
 *  - 分类分页 q()/cat:hot 的 Integer.MAX_VALUE/未知语义按壳约定输出。
 *
 * 宿主依赖：req/httpGet、console、local（KV）、joinUrl；lib/cheerio.min.js、lib/binutil.js。
 */

import cheerio from '../lib/cheerio.min.js';
import { httpGet, bodyOf, vod, pageData, playData, javaUrlEncode, tryParse, log } from './muCore.js';
import { bytesToB64, b64ToBytes, utf8ToBytes, bytesToUtf8 } from '../lib/binutil.js';

// ============================ 基础工具（merge.* 映射） ============================

function str(s) { return (s === undefined || s === null) ? '' : String(s); }

function opt(o, k, d) {
    if (!o || o[k] === undefined || o[k] === null) return d === undefined ? '' : d;
    return String(o[k]);
}

function kvGet(k, d) {
    try {
        const v = globalThis.local.get(k);
        return (v === undefined || v === null || v === '') ? (d || '') : v;
    } catch (e) { return d || ''; }
}
function kvSet(k, v) { try { globalThis.local.set(k, v); } catch (e) { } }

function b64Enc(s) { try { return bytesToB64(utf8ToBytes(String(s))); } catch (e) { return ''; } }
function b64Dec(s) { try { return bytesToUtf8(b64ToBytes(String(s))); } catch (e) { return ''; } }

/** ownText 近似。 */
function ownText($el) {
    try {
        return $el.contents().filter(function (i, n) { return n.type === 'text'; }).text().trim();
    } catch (e) {
        return str($el.text()).trim();
    }
}

// ---- 网盘类型识别/命名（AbstractC0302v0.b1/c1 + V0 表）----

const PAN_HOSTS = [
    ['pan.quark.cn', 'quark'], ['drive.uc.cn', 'uc'], ['aliyundrive.com', 'ali'], ['alipan.com', 'ali'],
    ['cloud.189.cn', 'tianyi'], ['cloud.189.com', 'tianyi'], ['yun.139', 'yidong'], ['caiyun.139.com', 'yidong'],
    ['pan.baidu.com', 'baidu'], ['pan.xunlei.com', 'xunlei'],
    ['guangyapan.com/s/', 'guangya'],
];

function panType(link) {
    const s = str(link);
    if (!s) return '';
    const lower = s.trim().toLowerCase();
    for (const [host, key] of PAN_HOSTS) if (lower.includes(host)) return key;
    if (lower.includes('115.com/s/') || lower.includes('115cdn.com/s/')) return '115';
    if ((lower.includes('/s/') || lower.includes('/123pan/')) &&
        (lower.includes('123pan.com') || lower.includes('123pan.cn') || lower.includes('share.123pan.cn') ||
            lower.includes('123684.com') || lower.includes('123865.com') || lower.includes('123912.com') ||
            lower.includes('123592.com') || /123\w{3}\.com\/(?:s|123pan)\//.test(lower))) return 'pan123';
    return '';
}

/** AbstractC0302v0.s0。 */
function isPanLink(s) { return panType(s) !== ''; }

const PAN_SHORT = { quark: '夸克', uc: '优视', ali: '阿里', tianyi: '天翼', yidong: '移动', baidu: '百度', xunlei: '迅雷', '115': '115', pan123: '123', guangya: '光鸭' };
function panShort(key) { return PAN_SHORT[key] || str(key); }

/** JSo.r：盘类型（other 兜底）。 */
function panKeyOrOther(link) {
    const t = panType(link);
    return t || 'other';
}

/** Cloud.a(list)/b(list) 等价。 */
function cloudFromUrls(links) {
    const flags = [], ids = [];
    for (const raw of links || []) {
        const u = str(raw).replace(/&amp;/g, '&').trim();
        if (!u) continue;
        const type = panType(u);
        flags.push(type ? panShort(type) : '网盘');
        ids.push(u);
    }
    return { from: flags.join('$$$'), url: ids.join('$$$'), n: ids.length };
}

/** Cloud.detailContent 单盘链直通（未知类型 → 空 list，调用方走 x(id) 提示）。 */
function cloudPassDetail(rawUrl) {
    const url = str(rawUrl).replace(/&amp;/g, '&').trim();
    if (!url) return JSON.stringify({ list: [], msg: '不支持的网盘类型' });
    const type = panType(url);
    if (!type) return JSON.stringify({ list: [], msg: '不支持的网盘类型' });
    const v = vod(url, panShort(type) + '分享', '', '', {
        vod_tag: 'folder',
        vod_play_from: panShort(type),
        vod_play_url: url,
        vod_content: '网盘分享链接：\n' + url + '\n\n请复制链接到对应网盘 APP 打开（JS 版直通分享链接，未内置网盘转直链后端）。',
    });
    return JSON.stringify({ list: [v] });
}

// ============================ 站点选择器（AbstractC0260h/C0257g） ============================

const SITE_KV = 'jso_site_url';
let siteBase = '';

/** JSo.w：trim + 去尾 /。 */
function trimSlash(s) {
    let t = str(s).trim();
    while (t.endsWith('/')) t = t.substring(0, t.length - 1);
    return t;
}

function siteInit(list) {
    if (list.length) siteBase = trimSlash(list[0]);
    // Java AbstractC0260h.b：仅当站点列表非空且 KV 记忆在列表内时回带
    const saved = kvGet(SITE_KV, '');
    if (saved && list.indexOf(saved) >= 0) siteBase = saved;
    if (!siteBase) siteBase = 'https://j-so.com';
    kvSet(SITE_KV, siteBase);
}

/** JSo.i：规范化站点基址。 */
function site() { return trimSlash(siteBase); }

/** JSo.o：请求头。 */
function siteHeaders() {
    const s = site();
    return {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36',
        'Referer': s + '/',
        'Origin': s,
    };
}

function httpGetSite(url) {
    try { return bodyOf(httpGet(url, siteHeaders())); } catch (e) { return ''; }
}

// ============================ JSo 主逻辑 ============================

/** JSo.k：标题清洗（去括号段/规格词/多余空白；原表第二段含字面 ???，Java 端必抛，取意图）。 */
function cleanTitle(s) {
    if (s === null || s === undefined) return '';
    let t = str(s)
        .replace(/\[[（(【]?[^\]]*[】)）\]]?/g, ' ')
        .replace(/（[^）]*）/g, ' ')
        .replace(/\([^)]*\)/g, ' ')
        .replace(/\b(4K|8K|1080P|2160P|HDR|H265|WEB|SDR)\b/gi, ' ')
        .replace(/\s+/g, ' ')
        .trim();
    return t || str(s);
}

/** JSo.p：页码 → offset。 */
function pageOffset(page) {
    return Math.max(0, (Math.max(1, page) - 1) * 20);
}

/** JSo.q：分页结果（pagecount/total 估算 1:1）。 */
function pagedResult(list, page) {
    const p = Math.max(1, page);
    const hasMore = list.length >= 20;
    const pagecount = hasMore ? p + 1 : p;
    const total = list.length + pageOffset(p) + (hasMore ? 20 : 0);
    return pageData(list, p, pagecount, 20, total);
}

/** JSo.x：不支持的网盘类型 vod。 */
function unsupportedVod(id) {
    const v = vod(str(id), '不支持的网盘类型', '', '', { vod_content: '链接: ' + str(id) });
    return JSON.stringify({ list: [v] });
}

// ---- 热搜 ----

function hotPills() {
    const out = [];
    try {
        const html = httpGetSite(site() + '/');
        const $ = cheerio.load(str(html));
        $('a.hot-pill[href^="/s/"], a.pill[href^="/s/"]').each(function (i, n) {
            const el = $(this);
            const t = ownText(el).trim();
            if (t) {
                let dup = false;
                for (const o of out) if (o.a === t) { dup = true; break; }
                if (!dup) out.push({ a: t, b: '热门搜索' });
            }
        });
    } catch (e) { }
    return out;
}

/** JSo.v：热搜 → vod（cap=i）。 */
function pillsToVods(pills, cap) {
    const out = [];
    for (const pill of pills || []) {
        const kw = pill.a ? pill.a : '';
        if (!kw) continue;
        out.push(vod('jso_search@@' + b64Enc(kw), kw, site() + '/ing/logo100.png', pill.b || ''));
        if (out.length >= cap) break;
    }
    return out;
}

// ---- 搜索 API（backup + HTML 双通道）----

/** JSo.m：/api/search/backup 原始响应。 */
function apiBackup(kw, limit, offset) {
    return httpGetSite(site() + '/api/search/backup?keyword=' + javaUrlEncode(str(kw)) +
        '&limit=' + limit + '&offset=' + Math.max(0, offset));
}

/** JSo.n：/s/{kw} HTML 解析 → {data:[...]} JSON 串。 */
function apiHtml(kw) {
    const html = httpGetSite(site() + '/s/' + javaUrlEncode(str(kw)));
    const arr = [];
    const $ = cheerio.load(str(html));
    $('#resultsList article.result-item, article.result-item').each(function (i, n) {
        const el = $(this);
        const $a = el.find('.result-title a[data-real-link], h2 a[data-real-link], a[data-real-link]').first();
        if ($a.length) {
            const title = ownText($a).trim();
            const link = str($a.attr('data-real-link') || '').trim();
            if (title && link) {
                const item = { name: title, link: link };
                const $meta = el.find('.meta-item').first();
                item.time = $meta.length ? ownText($meta).trim() : '';
                const $icon = el.find('.pan-result-icon[alt]').first();
                item.source = $icon.length ? str($icon.attr('alt') || '').trim() : '';
                arr.push(item);
            }
        }
    });
    return JSON.stringify({ data: arr });
}

/** JSo.j：check_cloud.php 有效性（异常 → true）。 */
function checkCloud(link) {
    const u = str(link);
    if (!u) return false;
    try {
        const body = httpGetSite(site() + '/api/check_cloud.php?url=' + javaUrlEncode(u) +
            '&t=' + Math.floor(Date.now() / 1000));
        const o = tryParse(body);
        if (!o) return true;
        const status = opt(o, 'status');
        const message = opt(o, 'message');
        return status.toLowerCase() === 'success' || message.includes('有效') || message.includes('正常');
    } catch (e) {
        return true;
    }
}

/** JSo.s：convert_share.php 归一（补 pwd；失败回原链）。 */
function convertShare(name, link) {
    const u = str(link);
    if (!u) return '';
    try {
        const body = httpGetSite(site() + '/api/convert_share.php?url=' + javaUrlEncode(u) +
            '&title=' + javaUrlEncode(name === null || name === undefined ? '' : str(name)) +
            '&t=' + Date.now());
        const o = tryParse(body);
        if (!o || opt(o, 'status').toLowerCase() !== 'success' || !(o.data && typeof o.data === 'object')) {
            return u;
        }
        const shareUrl = opt(o.data, 'share_url').trim();
        const pwd = opt(o.data, 'pwd').trim();
        if (!shareUrl) return u;
        if (!pwd || shareUrl.includes('pwd=')) return shareUrl;
        return shareUrl + (shareUrl.includes('?') ? '&' : '?') + 'pwd=' + pwd;
    } catch (e) {
        return u;
    }
}

/** JSo.h：单通道结果并入（limit 上限 + 有效性过滤 + 去重）。 */
function collectFrom(limit, body, list) {
    try {
        const o = tryParse(body);
        const arr = o && Array.isArray(o.data) ? o.data : null;
        if (!arr) return;
        const seen = {};
        for (const it of list) seen[it.b] = true;
        for (let i = 0; i < arr.length && list.length < limit; i++) {
            const item = arr[i];
            if (!item || typeof item !== 'object') continue;
            const name = opt(item, 'name', opt(item, 'title')).trim();
            const link = opt(item, 'link', opt(item, 'pan_url')).trim();
            if (name && link && !seen[link] && isPanLink(link) && checkCloud(link)) {
                const converted = convertShare(name, link);
                if (converted && isPanLink(converted) && !seen[converted]) {
                    seen[converted] = true;
                    const time = opt(item, 'time', opt(item, 'created_at'));
                    list.push({ a: name, b: converted, c: time });
                }
            }
        }
    } catch (e) { }
}

/** JSo.u：聚合搜索（backup API，offset≤0 且不足时补 HTML 通道）。 */
function searchItems(kw, limit, offset) {
    const list = [];
    let max = limit;
    if (offset <= 0) max = Math.max(limit, 200);
    collectFrom(limit, apiBackup(kw, max, Math.max(0, offset)), list);
    if (offset <= 0 && list.length < limit) {
        try { collectFrom(limit, apiHtml(kw), list); } catch (e) { }
    }
    return list;
}

/** JSo.t：SearchItems → vod（flag 图标省略、remarks="名 ? 时间"）。 */
function searchToVods(offset, kw) {
    const out = [];
    try {
        const items = searchItems(str(kw), 20, offset);
        const seen = {};
        const typeCount = {};
        for (const item of items) {
            const type = panKeyOrOther(item.b);
            const link = item.b;
            if (seen[link]) continue;
            seen[link] = true;
            typeCount[type] = (typeCount[type] || 0) + 1;
            let remark = panShort(type);
            if (!remark) remark = '网盘';
            let time = item.c ? str(item.c) : '';
            if (time.length > 16) time = time.substring(0, 16);
            if (time) remark = remark + ' ? ' + time;
            out.push(vod(link, item.a, '', remark));
            if (out.length >= 20) break;
        }
    } catch (e) { }
    return out;
}

// ============================ detail（jso_search@@ / 裸盘链 / jso@@@） ============================

function detailContent(list) {
    const id = str(list[0]);
    if (id.startsWith('jso_search@@')) {
        let kw = '';
        try { kw = b64Dec(id.substring(12)); } catch (e) { kw = ''; }
        const links = [];
        if (!kw) return JSON.stringify({ list: [unsupportedVodObj(id)] });
        const typeCount = {};
        for (const item of searchItems(kw, 80, 0)) {
            const type = panKeyOrOther(item.b);
            const cnt = typeCount[type] || 0;
            if (cnt >= 3) continue;
            const link = item.b;
            if (isPanLink(link) && links.indexOf(link) < 0) {
                links.push(link);
                typeCount[type] = cnt + 1;
                if (links.length >= 20) break;
            }
        }
        return buildPanVod(id, kw, links, '个网盘资源', '\n\n网盘链接:\n');
    }
    if (isPanLink(id)) {
        const detailJson = cloudPassDetail(id);
        const o = tryParse(detailJson);
        if (o && Array.isArray(o.list) && o.list.length) return detailJson;
        return JSON.stringify({ list: [unsupportedVodObj(id)] });
    }
    if (!id.startsWith('jso@@@')) {
        return JSON.stringify({ list: [unsupportedVodObj(id)] });
    }
    // jso@@@：Base64(标题\n标题\n盘链) — 前行标题为空/jso_home 时取当前行
    let payload = '';
    try { payload = b64Dec(id.replace('jso@@@', '')); } catch (e) { payload = ''; }
    let parts = payload.split('\n');
    if (parts.length !== 3) parts = ['', id, ''];
    let prevTitle = parts[0];
    const curTitle = parts[1];
    const prevLink = parts[2];
    if (!prevTitle || prevTitle === 'jso_home') prevTitle = curTitle;
    const links = [];
    const typeCount = {};
    if (prevLink && isPanLink(prevLink)) {
        links.push(prevLink);
        typeCount[panKeyOrOther(prevLink)] = 1;
    }
    if (!links.length) {
        for (const item of searchItems(prevTitle, 50, 0)) {
            const type = panKeyOrOther(item.b);
            const cnt = typeCount[type] || 0;
            if (cnt >= 3) continue;
            const kCur = cleanTitle(curTitle);
            const kItem = cleanTitle(item.a);
            if (kCur && kItem) {
                const a12 = kCur.length > 12 ? kCur.substring(0, 12) : kCur;
                const b12 = kItem.length > 12 ? kItem.substring(0, 12) : kItem;
                // jadx 残损块重建：标题双向首 12 字包含匹配 → 收集该盘链
                if (kItem.includes(a12) || kCur.includes(b12)) {
                    const link = item.b;
                    if (isPanLink(link) && links.indexOf(link) < 0) {
                        links.push(link);
                        typeCount[type] = cnt + 1;
                    }
                }
            }
            if (links.length >= 20) break;
        }
    }
    return buildPanVod(id, curTitle, links, '个网盘', '\n\n网盘链接：');
}

function unsupportedVodObj(id) {
    return vod(str(id), '不支持的网盘类型', '', '', { vod_content: '链接: ' + str(id) });
}

/** 盘链集合 → 详情 vod（play_from/play_url = Cloud.a/b 降级映射）。 */
function buildPanVod(id, title, links, remarkSuffix, sep) {
    const from = cloudFromUrls(links);
    const v = vod(id, str(title), '', links.length + remarkSuffix, {
        vod_play_from: from.from,
        vod_play_url: from.url,
        vod_content: (links.length ? (sep + links.join('\n')).trim() : ''),
    });
    return JSON.stringify({ list: [v] });
}

// ============================ 协议实现 ============================

let initExt = '';

export default {
    init(ext) {
        initExt = ext === undefined || ext === null ? '' : ext;
        const list = [];
        try {
            const o = typeof initExt === 'object' ? initExt : tryParse(String(initExt));
            if (o && typeof o === 'object') {
                if (Array.isArray(o.site)) {
                    for (const s of o.site) {
                        const w = trimSlash(s);
                        if (w) list.push(w);
                    }
                } else if (o.site) {
                    const w = trimSlash(o.site);
                    if (w) list.push(w);
                }
            }
        } catch (e) { }
        siteInit(list);
        log('[JSo] init site=' + site());
        return '';
    },

    home(filter) {
        // $host$1b26b551389a5dab：class=[cat:hot] + list=热搜 pill
        const pills = hotPills();
        return JSON.stringify({
            class: [{ type_id: 'cat:hot', type_name: '热门搜索' }],
            list: pillsToVods(pills, 30),
        });
    },

    homeVod() {
        return '';
    },

    category(tid, pg, filter, extend) {
        // $host$f9d7235748f992e0
        const t = str(tid);
        const map = extend && typeof extend === 'object' ? extend : {};
        if (t.startsWith('cat:')) {
            const page = parseInt(str(pg), 10) || 1;
            const all = pillsToVods(hotPills(), 2147483647);
            const p = Math.max(1, page);
            const off = pageOffset(p);
            const slice = all.slice(off, Math.min(all.length, off + 20));
            const pagecount = Math.max(1, Math.ceil(all.length / 20));
            return pageData(slice, p, pagecount, 20, all.length);
        }
        let kw = t;
        if (map['wd']) kw = str(map['wd']);
        if (!kw || kw === 'all') kw = '4K';
        const page = parseInt(str(pg), 10) || 1;
        return pagedResult(searchToVods(pageOffset(page), kw), page);
    },

    detail(id) {
        return detailContent([String(id)]);
    },

    search(key, quick, pg) {
        // $host$5abcbf7c29fbb7fe：去重 cap 20 → q(list, page)
        const page = parseInt(str(pg), 10) || 1;
        const off = pageOffset(page);
        const list = [];
        const seen = {};
        for (const v of searchToVods(off, str(key))) {
            if (v && v.vod_id && !seen[v.vod_id]) {
                seen[v.vod_id] = true;
                list.push(v);
                if (list.length >= 20) break;
            }
        }
        return pagedResult(list, page);
    },

    play(flag, id, vipFlags) {
        // Cloud.playerContent：未识别播放 id 原样 return str（Java 同路径）
        return JSON.stringify(playData(flag, id, {}));
    },
};

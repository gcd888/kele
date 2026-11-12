/**
 * Tiu6.js — 🍭┆Tiu6┆搜索（JS 版，catvod JsSpider 协议）
 *
 * 移植自：kele/src/ysc/diy/摸鱼儿/readable_sources/com/github\catvod\spider\Tiu6.java
 * （extends Cloud，tiu6.cn 盘搜 + 豆瓣热榜推荐）+ 依赖 merge 类：AbstractC0260h/C0257g
 * （站点选择器）、AbstractC0302v0（b1/s0/c1/d1/j）、AbstractC0309x1（Base64 NO_WRAP）、
 * p001b.{g,k}、X1（okhttp GET/M）。
 *
 * 移植差异（逻辑 1:1，以下为 JS 壳约束下的必要映射）：
 *  - Cloud 基类网盘后端（Quark/UC/Ali/… 十类 SDK）不随本文件移植：tiu6_search@@ 详情收集的
 *    盘链与裸盘链 id → vod_play_from=盘类型短名 / vod_play_url=原始分享链接（$$$ 并行数组，
 *    与 Cloud.e(list,z) 输出结构一致），play 阶段直通（Java 对未识别播放 id 本就 `return str`）；
 *  - FishCrypto.beginHostEntry/endHostEntry 丢弃；FishCrypto.b(str) → 恒等；
 *    N1.d/AbstractC0280n1.p/q → no-op；
 *  - 资源校验并发（Executors.newFixedThreadPool(4)）→ 顺序请求；校验缓存 Tiu6.u
 *    （static synchronizedMap，进程级）→ 模块级 Map；
 *  - Thread.sleep(500) 轮询间隔 → Date.now() 忙等（QuickJS 同步宿主无 sleep）；
 *  - AbstractC0302v0.d1()/j()（N1.u 内置图标）→ 空串；
 *  - 日期时间戳：1:1 复刻 Java 行为（含"绝对时间解析结果被 time = now - 0 覆盖"的原样语义）；
 *  - Collections.shuffle → Fisher-Yates（Math.random）。
 *
 * 宿主依赖：req/httpGet/httpPost、console、local（KV）、joinUrl；lib/binutil.js。
 */

import cheerio from '../lib/cheerio.min.js';
import { httpGet, httpPost, bodyOf, homeData, vod, pageData, playData, javaUrlEncode, tryParse, log } from './muCore.js';
import { bytesToB64, b64ToBytes, utf8ToBytes, bytesToUtf8 } from '../lib/binutil.js';

// ============================ 基础工具（merge.* 映射） ============================

function str(s) { return (s === undefined || s === null) ? '' : String(s); }

function opt(o, k, d) {
    if (!o || o[k] === undefined || o[k] === null) return d === undefined ? '' : d;
    return String(o[k]);
}

function optInt(o, k, d) {
    const v = o ? o[k] : undefined;
    if (typeof v === 'number') return v;
    const s = parseInt(str(v), 10);
    return isNaN(s) ? d : s;
}

function optBool(o, k, d) {
    const v = o ? o[k] : undefined;
    if (typeof v === 'boolean') return v;
    if (v === 'true' || v === '1') return true;
    if (v === 'false' || v === '0') return false;
    return d;
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

/** QuickJS 同步宿主忙等。 */
function busySleep(ms) {
    const end = Date.now() + (ms || 0);
    while (Date.now() < end) { }
}

// ---- 网盘类型识别/命名（AbstractC0302v0.b1/c1/V0 表）----

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

function isPanLink(s) { return panType(s) !== ''; }

const PAN_SHORT = { quark: '夸克', uc: '优视', ali: '阿里', tianyi: '天翼', yidong: '移动', baidu: '百度', xunlei: '迅雷', '115': '115', pan123: '123', guangya: '光鸭' };
function panShort(key) { return PAN_SHORT[key] || str(key); }

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

/** Cloud.detailContent 单盘链直通。 */
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

// ============================ 站点选择器 ============================

const SITE_KV = 'tiu6_site_url';
let siteBase = '';

/** Tiu6.o：trim + 去尾 /。 */
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
    if (!siteBase) siteBase = 'https://www.tiu6.cn';
    kvSet(SITE_KV, siteBase);
}

function site() { return trimSlash(siteBase); }

/** Tiu6.n：请求头。 */
function siteHeaders() {
    const s = site();
    return {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36',
        'Accept': 'application/json',
        'Referer': s + '/',
        'Origin': s,
    };
}

function httpGetSite(url) {
    try { return bodyOf(httpGet(url, siteHeaders())); } catch (e) { return ''; }
}

// ============================ SearchItem（Tiu6.SearchItem） ============================

/** SearchItem.a：布尔多键选取。 */
function boolPick(o, keys) {
    for (const key of keys) {
        if (o && o[key] !== undefined && o[key] !== null) {
            const v = o[key];
            if (typeof v === 'boolean') return v;
            const lower = str(v).trim().toLowerCase();
            if (lower === '1' || lower === 'true' || lower === 'yes' || lower === 'ok') return true;
            if (lower === '0' || lower === 'false' || lower === 'no') return false;
        }
    }
    return null;
}

/** SearchItem.b：字符串多键选取。 */
function strPick(o, keys) {
    for (const key of keys) {
        const t = str(opt(o, key)).trim();
        if (t) return t;
    }
    return '';
}

/** SearchItem.c：综合有效性判定。 */
function validFromJson(o) {
    const first = boolPick(o, ['valid', 'is_valid', 'available', 'ok']);
    if (first !== null) return first;
    const deleted = boolPick(o, ['deleted']);
    if (deleted === true) return false;
    const lower = (strPick(o, ['status', 'check_status', 'checkStatus', 'state']) + ' ' +
        strPick(o, ['validity_text', 'validityText', 'status_text', 'statusText', 'message', 'msg'])).toLowerCase();
    const BAD = ['invalid', 'unavailable', 'expired', 'deleted', 'fail', 'error', '失效', '无效', '删除'];
    for (const w of BAD) if (lower.includes(w)) return false;
    const GOOD = ['valid', 'available', 'normal', 'success', '有效', '可用', '正常', '需要密码'];
    for (const w of GOOD) if (lower.includes(w)) return true;
    return null;
}

/** 日期 → 时间戳（1:1 复刻 Java 语义：绝对时间解析结果被 time = now - 0 覆盖）。 */
function timeValue(d) {
    let time = 0;
    const s = str(d);
    if (!s) return 0;
    const trimmed = s.trim();
    const now = Date.now();
    let j = 0;
    let j2 = 0;
    try {
        if (trimmed.includes('年前')) { j = parseInt(trimmed.replace(/\D+/g, ''), 10) || 0; j2 = 31536000000; }
        else if (trimmed.includes('个月前')) { j = parseInt(trimmed.replace(/\D+/g, ''), 10) || 0; j2 = 2592000000; }
        else if (trimmed.includes('天前')) { j = parseInt(trimmed.replace(/\D+/g, ''), 10) || 0; j2 = 86400000; }
        else if (trimmed.includes('小时前')) { j = parseInt(trimmed.replace(/\D+/g, ''), 10) || 0; j2 = 3600000; }
        else if (trimmed.includes('分钟前')) { j = parseInt(trimmed.replace(/\D+/g, ''), 10) || 0; j2 = 60000; }
        else {
            // 绝对时间：逐格式尝试（Locale.CHINA 语义），结果随后被覆盖 — 原样保留
            for (const parsed of [parseChina(trimmed)]) {
                if (parsed !== null) { time = parsed; break; }
            }
        }
        time = now - (j * j2);
    } catch (e) { }
    return time;
}

/** SimpleDateFormat(["yyyy-MM-dd HH:mm:ss","yyyy-MM-dd HH:mm","yyyy-MM-dd","MM-dd HH:mm","MM-dd"]) 近似。 */
function parseChina(s) {
    const m = /^(\d{4})-(\d{2})-(\d{2})(?: (\d{2}):(\d{2})(?::(\d{2}))?)?$/.exec(s);
    if (m) {
        const t = new Date(parseInt(m[1], 10), parseInt(m[2], 10) - 1, parseInt(m[3], 10),
            m[4] ? parseInt(m[4], 10) : 0, m[5] ? parseInt(m[5], 10) : 0, m[6] ? parseInt(m[6], 10) : 0);
        return isNaN(t.getTime()) ? null : t.getTime();
    }
    const m2 = /^(\d{2})-(\d{2})(?: (\d{2}):(\d{2}))?$/.exec(s);
    if (m2) {
        const now = new Date();
        const t = new Date(now.getFullYear(), parseInt(m2[1], 10) - 1, parseInt(m2[2], 10),
            m2[3] ? parseInt(m2[3], 10) : 0, m2[4] ? parseInt(m2[4], 10) : 0, 0);
        return isNaN(t.getTime()) ? null : t.getTime();
    }
    throw new Error('unparsed');
}

/** Tiu6.i：JSON 数组 → SearchItem 列表（去重 + 盘链校验）。 */
function parseItems(list, set, jsonArr) {
    if (!Array.isArray(jsonArr)) return;
    for (const o of jsonArr) {
        if (!o || typeof o !== 'object') continue;
        const link = strPick(o, ['link', 'share_link', 'shareLink', 'url', 'href']);
        const title = strPick(o, ['title', 'name', 'note']);
        let item = null;
        if (link && title) {
            item = {
                a: title,          // 标题
                b: link,           // 链接
                c: strPick(o, ['poster', 'image', 'cover', 'thumb', 'thumbnail', 'icon_url', 'image_url', 'cover_url']),
                d: strPick(o, ['share_time', 'datetime', 'time', 'update_time', 'created_at', 'date']),
                f: strPick(o, ['id', 'resource_id']),
                g: strPick(o, ['resource_id', 'id']),
                h: strPick(o, ['source', 'source_type', 'source_label']),
                i: strPick(o, ['status', 'check_status', 'checkStatus', 'state']),
                j: strPick(o, ['validity_text', 'validityText', 'status_text', 'statusText', 'message', 'msg']),
                k: validFromJson(o),
                e: '',             // 盘类型
                l: false,          // 校验结果
                m: 0,              // 时间戳
            };
        }
        if (item && isPanLink(item.b) && !set[item.b]) {
            set[item.b] = true;
            item.e = panType(item.b);
            item.m = timeValue(item.d);
            list.push(item);
        }
    }
}

// ============================ 资源校验（Tiu6.k + Tiu6.u 缓存） ============================

const checkCache = new Map(); // Java: Tiu6.u static synchronizedMap

function cachedValid(link) {
    const v = checkCache.get(str(link));
    return v === undefined ? null : v;
}

function cacheValid(link, b) { checkCache.set(str(link), !!b); }

/** Tiu6.k：校验 + 每类型 cap 3。 */
function verifyItems(items) {
    // 每类型 cap 12 预筛
    const kept = [];
    const preCount = {};
    const capPre = Math.max(12, 3);
    for (const item of items || []) {
        const cnt = preCount[item.e] || 0;
        if (cnt < capPre) {
            preCount[item.e] = cnt + 1;
            kept.push(item);
        }
    }
    for (const item of kept) {
        let b = cachedValid(item.b);
        if (b !== null) {
            item.l = b;
            continue;
        }
        let bool2 = item.k;
        if (bool2 === null) {
            const lower = (str(item.i) + ' ' + str(item.j)).toLowerCase();
            const BAD = ['invalid', 'unavailable', 'expired', 'deleted', 'fail', 'error', '失效', '无效', '删除'];
            const GOOD = ['valid', 'available', 'normal', 'success', '有效', '可用', '正常'];
            bool2 = null;
            for (const w of BAD) if (lower.includes(w)) { bool2 = false; break; }
            if (bool2 === null) {
                for (const w of GOOD) if (lower.includes(w)) { bool2 = true; break; }
            }
        }
        if (bool2 !== null) {
            cacheValid(item.b, bool2);
            item.l = bool2;
            continue;
        }
        // resource-check POST
        let ok = false;
        try {
            const body = JSON.stringify({
                id: item.f ? item.f : item.a,
                resource_id: item.g ? item.g : item.f,
                source: item.h,
                drive_type: item.e,
                disk_type: item.e,
                share_link: item.b,
                shareLink: item.b,
                link: item.b,
            });
            const res = httpPost(site() + '/api/frontend/resource-check', body, siteHeaders());
            const o = tryParse(bodyOf(res));
            const data = o && o.code === 0 && o.data && typeof o.data === 'object' ? o.data : null;
            ok = data !== null && validFromJson(data) === true;
        } catch (e) {
            ok = false;
        }
        cacheValid(item.b, ok);
        item.l = ok;
    }
    const out = [];
    const capCount = {};
    for (const item of kept) {
        const cnt = capCount[item.e] || 0;
        if (cnt < 3 && item.l) {
            capCount[item.e] = cnt + 1;
            out.push(item);
        }
    }
    return out;
}

// ============================ 搜索（Tiu6.j/m） ============================

/** Tiu6.j：/api/frontend/search → data 对象。 */
function searchApi(kw) {
    let url = site() + '/api/frontend/search?q=' + javaUrlEncode(str(kw));
    const drive = ''; // Java：drive 过滤为空串时不拼接
    if (drive) url += '&drive=' + javaUrlEncode(drive);
    const o = tryParse(httpGetSite(url));
    const data = o && o.data && typeof o.data === 'object' ? o.data : {};
    return data;
}

/** Tiu6.m：搜索 + 轮询 + 时间倒序。 */
function searchAll(kw, limit, pollTimes) {
    const list = [];
    const set = {};
    if (!str(kw)) return list;
    try {
        const data = searchApi(kw);
        parseItems(list, set, data.items);
        parseItems(list, set, data.list);
        const searchId = opt(data, 'search_id', opt(data, 'searchId'));
        let complete = optBool(data, 'complete', false);
        let round = 0;
        while (!complete && searchId && round < pollTimes && list.length < limit) {
            busySleep(500);
            let d2 = tryParse(httpGetSite(site() + '/api/frontend/search/poll?id=' + javaUrlEncode(searchId)));
            d2 = d2 && d2.data && typeof d2.data === 'object' ? d2.data : {};
            complete = optBool(d2, 'complete', false);
            parseItems(list, set, d2.items);
            parseItems(list, set, d2.list);
            round++;
        }
    } catch (e) { }
    list.sort(function (a, b) { return b.m - a.m; });
    return list;
}

// ============================ 豆瓣热榜（Tiu6.l/h/s/t 表） ============================

const DOUBAN_BOARDS = ['subject_real_time_hotest', 'movie_real_time_hotest', 'tv_real_time_hotest', 'tv_hot', 'show_hot'];
const DOUBAN_FALLBACK = ['三体', '狂飙', '庆余年', '长安的荔枝', '繁花', '漫长的季节', '我的阿勒泰', '边水往事', '哪吒之魔童闹海', '流浪地球', '封神', '热辣滚烫', '抓娃娃', '九龙城寨之围城', '志愿军', '孤注一掷', '鬼灭之刃', '咒术回战', '海贼王', '凡人修仙传', '斗破苍穹', '吞噬星空', '仙逆', '完美世界', '庆余年第二季', '玫瑰的故事', '歌手', '奔跑吧', '乘风', '喜人奇妙夜', '脱口秀和TA的朋友们', '种地吧', '沙丘', '奥本海默', '疾速追杀', '哥斯拉大战金刚', '死侍', '异形', '权力的游戏', '龙之家族'];

const PIC_SUFFIX = '@Referer=https://api.douban.com/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36';

function doubanHeaders() {
    return {
        'Host': 'frodo.douban.com',
        'Connection': 'Keep-Alive',
        'Referer': 'https://servicewechat.com/wx2f9b06c1de1ccfca/84/page-frame.html',
        'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat',
    };
}

/** Tiu6.h：单个热榜解析（board → 展示名 + 评分）。 */
function parseDouban(list, set, items, board) {
    if (!Array.isArray(items)) return;
    for (const o of items) {
        if (!o || typeof o !== 'object') continue;
        const title = str(opt(o, 'title')).trim();
        if (!title || set[title]) continue;
        set[title] = true;
        let score = 0;
        try { score = parseFloat(opt(o.rating && typeof o.rating === 'object' ? o.rating : {}, 'value', '0')) || 0; } catch (e) { score = 0; }
        let pic = '';
        try {
            const p = o.pic && typeof o.pic === 'object' ? str(opt(o.pic, 'normal')) : '';
            pic = p ? p + PIC_SUFFIX : '';
        } catch (e) { pic = ''; }
        let remark;
        if (board === 'movie_real_time_hotest') remark = '电影热榜';
        else if (board === 'tv_real_time_hotest') remark = '剧集热榜';
        else if (board === 'tv_hot') remark = '热播剧集';
        else if (board === 'show_hot') remark = '热播综艺';
        else remark = '实时热门';
        if (score > 0) remark = remark + ' 评分:' + score;
        list.push({ a: title, b: pic, c: remark, d: score });
    }
}

function shuffle(arr) {
    const a = arr.slice();
    for (let i = a.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        const t = a[i]; a[i] = a[j]; a[j] = t;
    }
    return a;
}

/** Tiu6.l：豆瓣热榜 vods（空 → 随机备用推荐）。 */
function doubanVods(count) {
    const cap = count * 3;
    const list = [];
    const set = {};
    for (const board of DOUBAN_BOARDS) {
        try {
            const url = 'https://frodo.douban.com/api/v2/subject_collection/' + board + '/items' +
                '?apikey=0ac44ae016490db2204ce0a042db2916&start=0&count=20';
            const o = tryParse(bodyOf(httpGet(url, doubanHeaders())));
            if (!o) continue;
            let items = Array.isArray(o.subject_collection_items) ? o.subject_collection_items : null;
            if (!items) items = Array.isArray(o.items) ? o.items : null;
            parseDouban(list, set, items, board);
            if (list.length >= cap) break;
        } catch (e) { }
    }
    if (!list.length) {
        const out = [];
        const shuffled = shuffle(DOUBAN_FALLBACK);
        const n = Math.min(count, shuffled.length);
        for (let i = 0; i < n; i++) {
            out.push(vod('tiu6_search@@' + b64Enc(shuffled[i]), shuffled[i], '', '备用推荐'));
        }
        return out;
    }
    list.sort(function (a, b) { return b.d - a.d; });
    const out = [];
    const n = Math.min(count, list.length);
    for (let i = 0; i < n; i++) {
        out.push(vod('tiu6_search@@' + b64Enc(list[i].a), list[i].a, list[i].b, list[i].c));
    }
    return out;
}

// ============================ detail / 协议实现 ============================

function detailContent(list) {
    const id = str(list[0]);
    if (!id.startsWith('tiu6_search@@')) {
        const detailJson = cloudPassDetail(id);
        const o = tryParse(detailJson);
        if (o && Array.isArray(o.list) && o.list.length) return detailJson;
        const v = vod(id, '不支持的网盘类型', '', '', { vod_content: '链接: ' + id });
        return JSON.stringify({ list: [v] });
    }
    let kw = '';
    try { kw = b64Dec(id.substring(13)); } catch (e) { kw = ''; }
    const items = verifyItems(searchAll(kw, 500, 30));
    const links = [];
    let firstPic = '';
    let sb = '';
    for (const item of items) {
        if (!firstPic && item.c) firstPic = item.c;
        links.push(item.b);
        let typeName = panShort(item.e);
        if (!typeName || typeName === item.e) typeName = '网盘';
        sb += typeName + ' · ' + item.a;
        if (item.d) sb += ' · ' + item.d;
        sb += '\n' + item.b + '\n\n';
    }
    const from = cloudFromUrls(links);
    const v = vod(id, kw, firstPic, links.length + '个网盘资源', {
        vod_play_from: from.from,
        vod_play_url: from.url,
        vod_content: sb.trim(),
    });
    return JSON.stringify({ list: [v] });
}

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
        log('[Tiu6] init site=' + site());
        return '';
    },

    home(filter) {
        // $host$1b26b551389a5dab：class=[random 豆瓣随机] + list=豆瓣热榜 30
        return JSON.stringify({
            class: [{ type_id: 'random', type_name: '豆瓣随机' }],
            list: doubanVods(30),
        });
    },

    homeVod() {
        return '';
    },

    category(tid, pg, filter, extend) {
        // $host$f9d7235748f992e0：固定豆瓣热榜 20 条
        const page = parseInt(str(pg), 10) || 1;
        const list = doubanVods(20);
        return pageData(list, page, page + 1, 20, 9999);
    },

    detail(id) {
        return detailContent([String(id)]);
    },

    search(key, quick, pg) {
        // $host$5abcbf7c29fbb7fe：校验后分页切片
        const page = parseInt(str(pg), 10) || 1;
        const items = verifyItems(searchAll(str(key), Math.max((page * 20) + 20, 80), 10));
        const out = [];
        const off = Math.max(0, (page - 1) * 20);
        const end = Math.min(items.length, off + 20);
        for (let i = off; i < end; i++) {
            const item = items[i];
            const pic = item.c ? item.c : '';
            let remark = panShort(item.e);
            if (!remark || remark === item.e) remark = '网盘';
            let text = remark;
            if (item.d) text = remark + ' ' + item.d;
            out.push(vod(item.b, item.a, pic, text));
        }
        return JSON.stringify({ list: out });
    },

    play(flag, id, vipFlags) {
        // Cloud.playerContent：未识别播放 id 原样 return str（Java 同路径）
        return JSON.stringify(playData(flag, id, {}));
    },
};

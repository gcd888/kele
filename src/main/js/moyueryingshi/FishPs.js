/**
 * FishPs.js — 🐟┆鱼鱼┆盘搜（JS 版，catvod JsSpider 协议）
 *
 * 移植自：kele/src/ysc/diy/摸鱼儿/readable_sources/com/github/catvod/spider/FishPs.java
 * （extends Cloud）+ 依赖 merge 类：p020x.{b,c,f,h,d}（盘搜配置/内建站点/磁力工具/搜索核心/
 * 检测项）、C0261h0(8)、AbstractC0244b1（合并归组/画质评分）、C0241a1、l0.l（fishps_detail@@
 * 载荷）、m0.a（设置卡片）、AbstractC0309x1（Base64 NO_WRAP）、p001b.{g,k}（Result/Vod）。
 *
 * 移植差异（逻辑 1:1，以下为 JS 壳约束下的必要映射）：
 *  - FishCrypto.beginHostEntry/endHostEntry 包装直接丢弃；N1.d(vod)/AbstractC0280n1.p/q
 *    （App 侧播放历史/磁力云下载登记）→ no-op；
 *  - Cloud 基类网盘后端（Quark/UC/Ali/天翼/移动/百度/迅雷/115/123/光鸭 十类 SDK，依赖 App
 *    登录态与 ext cookie）不随本文件移植：Cloud.detailContent/playerContent 对盘链降级为
 *    「直通分享链接」（play 阶段 Java 对未识别 id 本就 `return str` 原样返回）；磁力详情
 *    （C1()=未配置云下载）走 Java 原路径 play_from=磁力/play_url=磁力链，1:1；
 *  - 链接可用性检测 p020x.f.B（异步线程池 + 配额）→ no-op（Java 为后台异步，不影响本次
 *    返回；缓存为空时 f() 过滤与 U.a(2) 排序在 Java 侧同样保持原序）；
 *  - 多站点并发搜索（ExecutorService + CountDownLatch）→ 顺序请求（QuickJS 同步 req），
 *    合并去重逻辑 1:1；
 *  - 设置卡片点击的 App 原生弹窗（C0261h0.i → InitOrigin.run）在 JS 壳不可达 → 仅记录日志
 *    并按 Java 返回 ""；配置仍持久化于 local KV（C0297t1 → local）；
 *  - N1.u 图标基路径（App 内置 jpg）→ 空串（vod_pic 占位为空）；
 *  - g.s(detail) → {"list":[vod]}（Gson null 省略语义），分类分页 o() → pageData，
 *    Integer.MAX_VALUE 语义「未知」按壳约定输出 9999。
 *
 * 宿主依赖：req/httpGet、console、local（KV）、joinUrl；lib/binutil.js。
 */

import { httpGet, httpPost, bodyOf, homeData, vod, pageData, playData, javaUrlEncode, tryParse, log } from './muCore.js';
import { bytesToB64, b64ToBytes, utf8ToBytes, bytesToUtf8 } from '../lib/binutil.js';

// ============================ 基础工具（merge.* 映射） ============================

/** AbstractC0309x1.c：Base64 NO_WRAP 编码（UTF-8）。 */
function b64Enc(s) {
    try { return bytesToB64(utf8ToBytes(String(s))); } catch (e) { return ''; }
}

/** AbstractC0309x1.b：Base64 NO_WRAP 解码（默认字符集=UTF-8）。 */
function b64Dec(s) {
    try { return bytesToUtf8(b64ToBytes(String(s))); } catch (e) { return ''; }
}

function str(s) { return (s === undefined || s === null) ? '' : String(s); }

/** org.json optString(k) → (o[k]||'')，兼容非字符串值。 */
function opt(o, k, d) {
    if (!o || o[k] === undefined || o[k] === null) return d === undefined ? '' : d;
    return String(o[k]);
}

/** p020x.b.p：站点 URL 归一（trim + 去尾 /）。 */
function normSite(s) {
    let t = str(s).trim();
    while (t.endsWith('/') && t.length > 8) t = t.substring(0, t.length - 1);
    return t;
}

/** C0297t1 文件 KV → 壳 local。 */
function kvGet(k, d) {
    try {
        const v = globalThis.local.get(k);
        return (v === undefined || v === null || v === '') ? (d || '') : v;
    } catch (e) { return d || ''; }
}
function kvSet(k, v) { try { globalThis.local.set(k, v); } catch (e) { } }

/** N1.u 图标（App 内置 jpg 基路径）→ JS 壳无此资源，返回空串占位。 */
function img() { return ''; }

/** p001b.g.s(k)：detail 结果（Gson 序列化，null 字段省略）。 */
function resultDetail(v) { return JSON.stringify({ list: [v] }); }

/** p001b.g.y(list)。 */
function resultList(list) { return JSON.stringify({ list: list || [] }); }

/** p001b.g.d(msg)：空 list + msg。 */
function resultMsg(msg) { return JSON.stringify({ list: [], msg: str(msg) }); }

// ---- 网盘类型识别/命名（AbstractC0302v0.b1 + C0247c1 表 + p020x.b.l/p020x.c.c）----

const PAN_HOSTS = [
    ['pan.quark.cn', 'quark'], ['drive.uc.cn', 'uc'], ['aliyundrive.com', 'ali'], ['alipan.com', 'ali'],
    ['cloud.189.cn', 'tianyi'], ['cloud.189.com', 'tianyi'], ['yun.139', 'yidong'], ['caiyun.139.com', 'yidong'],
    ['pan.baidu.com', 'baidu'], ['pan.xunlei.com', 'xunlei'],
    ['guangyapan.com/s/', 'guangya'],
];

/** AbstractC0302v0.b1：分享链接 → 网盘类型 key（123 域名族单独判）。 */
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

/** AbstractC0302v0.s0：是否可识别网盘链接。 */
function isPanLink(s) { return panType(s) !== ''; }

/** C0247c1 表：类型 key → 短名（c1() 展示名）。 */
const PAN_SHORT = { quark: '夸克', uc: '优视', ali: '阿里', tianyi: '天翼', yidong: '移动', baidu: '百度', xunlei: '迅雷', '115': '115', pan123: '123', guangya: '光鸭' };

/** AbstractC0302v0.c1：展示名（V0 未命中回退原串）。 */
function panShort(key) { return PAN_SHORT[key] || str(key); }

/** p020x.b.l：类型 key → 展示名（c.c 表 + 个别别名）。 */
function panTypeName(key) {
    const s = str(key);
    const table = { quark: '夸克', uc: 'UC', ali: '阿里', '115': '115', '123': '123', baidu: '百度', tianyi: '天翼', yidong: '移动', xunlei: '迅雷', guangya: '光鸭', magnet: '磁力' };
    for (const [k, v] of Object.entries(table)) if (k.toLowerCase() === s.toLowerCase()) return v;
    const lower = s.toLowerCase();
    if (lower === '139') return '移动';
    if (lower === '189') return '天翼';
    if (lower === 'aliyundrive') return '阿里';
    return s;
}

/** AbstractC0302v0.M0 可核实语义：从文本提取 magnet 链接（N1.* 加密常量不可静态解码，
 *  以 "magnet:?xt=urn:btih:" 起链的提取为准）。 */
function magnetExtract(s) {
    let t = str(s).trim().replace(/&amp;/g, '&');
    if (!t) return '';
    if (t.includes('%3A') || t.includes('%3F') || t.includes('%26')) {
        try { t = decodeURIComponent(t); } catch (e) { }
    }
    t = t.replace(/\s+/g, '');
    const m = /magnet:\?xt=urn:btih:[^\s"'<>]+/i.exec(t);
    return m ? m[0] : '';
}

/** AbstractC0302v0.r0：是否磁力。 */
function isMagnet(s) { return magnetExtract(s) !== ''; }

// ---- Cloud 基类降级映射（详见文件头差异说明）----

/** Cloud.a(list)/b(list) 等价：盘链列表 → { from, url, n }。 */
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

/** Cloud.detailContent 单盘链直通（JS 无网盘驱动后端）。 */
function cloudPassDetail(rawUrl) {
    const url = str(rawUrl).replace(/&amp;/g, '&').trim();
    if (!url) return resultMsg('不支持的网盘类型');
    const type = panType(url);
    if (!type) return resultMsg('不支持的网盘类型');
    const v = vod(url, panShort(type) + '分享', '', '', {
        vod_tag: 'folder',
        vod_play_from: panShort(type),
        vod_play_url: url,
        vod_content: '网盘分享链接：\n' + url + '\n\n请复制链接到对应网盘 APP 打开（JS 版直通分享链接，未内置网盘转直链后端）。',
    });
    return resultDetail(v);
}

// ============================ p020x.b 盘搜配置 ============================

const CFG_KEY = '.fishps_config';
const BUILTIN_SITES = ['http://luosz.top:2000', 'https://so.252035.xyz', 'https://so.northpark.cn', 'https://s.panhunt.com', 'https://dflm.top'];
const PAN_TYPE_TABLE = [['quark', '夸克'], ['uc', 'UC'], ['ali', '阿里'], ['115', '115'], ['123', '123'], ['baidu', '百度'], ['tianyi', '天翼'], ['yidong', '移动'], ['xunlei', '迅雷'], ['guangya', '光鸭'], ['magnet', '磁力']];

const cfg = {
    customUrls: [],      // b
    disabledUrls: [],    // c
    removedBuiltinUrls: [], // d
    apiNames: {},        // e
    enabledTypes: [],    // f
    includeKeywords: [], // g
    excludeKeywords: [], // h
    channels: [],        // i
    plugins: [],         // j
    customChannels: [],  // k
    customPlugins: [],   // l
    channelApiUrl: '',   // m
    maxPerType: 0,       // n
    folderMode: true,    // o
    linkCheckMode: 1,    // p
    channelMode: 0,      // q
    linkCheckConcurrency: 3, // r
    linkCheckTimeoutSeconds: 5, // s
    linkCheckBatchSize: 80,  // t
};

function arrAdd(list, v) { if (!list.includes(v)) list.push(v); }

function qFrom(arr, jsonArr, dedupe) {
    if (!Array.isArray(jsonArr)) return;
    for (const item of jsonArr) {
        const s = str(item);
        if (s && (!dedupe || !arr.includes(s))) arr.push(s);
    }
}

function rFrom(arr, jsonArr) {
    if (!Array.isArray(jsonArr)) return;
    for (const item of jsonArr) {
        const s = normSite(item);
        if (s && !arr.includes(s)) arr.push(s);
    }
}

function isBuiltin(url) {
    const p = normSite(url);
    for (const b of BUILTIN_SITES) if (normSite(b) === p) return true;
    return false;
}

/** p020x.b.m：全部已知站点（内建 - 移除 + 自定义，保序去重）。 */
function allSites() {
    const set = [];
    for (const s of BUILTIN_SITES) {
        const p = normSite(s);
        if (p && !cfg.removedBuiltinUrls.includes(p)) arrAdd(set, p);
    }
    for (const s of cfg.customUrls) {
        const p = normSite(s);
        if (p) arrAdd(set, p);
    }
    return set;
}

/** p020x.b.f：启用站点。 */
function enabledSites() {
    const set = [];
    for (const s of allSites()) if (!cfg.disabledUrls.includes(s)) arrAdd(set, s);
    return set;
}

function enabledCount() { return enabledSites().length; }

/** p020x.b.g："N/M个启用"。 */
function siteSummary() { return enabledCount() + '/' + allSites().length + '个启用'; }

/** p020x.b.o：从 KV 加载配置并做与 Java 相同的清洗。 */
function cfgLoad() {
    for (const k of ['customUrls', 'disabledUrls', 'removedBuiltinUrls', 'enabledTypes', 'includeKeywords', 'excludeKeywords', 'channels', 'plugins', 'customChannels', 'customPlugins']) cfg[k] = [];
    cfg.apiNames = {};
    cfg.channelApiUrl = '';
    cfg.maxPerType = 0;
    cfg.folderMode = true;
    cfg.linkCheckMode = 1;
    cfg.channelMode = 0;
    cfg.linkCheckConcurrency = 3;
    cfg.linkCheckTimeoutSeconds = 5;
    cfg.linkCheckBatchSize = 80;
    const raw = kvGet(CFG_KEY, '');
    if (raw) {
        const o = tryParse(raw);
        if (o) {
            cfg.maxPerType = parseInt(opt(o, 'maxPerType', '0'), 10) || 0;
            const custom = str(opt(o, 'customUrl', '')).trim();
            if (custom) {
                const p = normSite(custom);
                if (p && !cfg.customUrls.includes(p)) cfg.customUrls.push(p);
            }
            rFrom(cfg.customUrls, o.customUrls);
            const names = o.apiNames;
            if (names && typeof names === 'object') {
                for (const k of Object.keys(names)) {
                    const p = normSite(k);
                    const name = str(names[k]).trim();
                    if (p && name) cfg.apiNames[p] = name;
                }
            }
            rFrom(cfg.disabledUrls, o.disabledUrls);
            rFrom(cfg.removedBuiltinUrls, o.removedBuiltinUrls);
            qFrom(cfg.enabledTypes, o.enabledTypes, false);
            qFrom(cfg.includeKeywords, o.includeKeywords, false);
            qFrom(cfg.excludeKeywords, o.excludeKeywords, false);
            qFrom(cfg.channels, o.channels, true);
            qFrom(cfg.plugins, o.plugins, true);
            qFrom(cfg.customChannels, o.customChannels, true);
            qFrom(cfg.customPlugins, o.customPlugins, true);
            cfg.channelApiUrl = normSite(opt(o, 'channelApiUrl', ''));
            cfg.folderMode = o.folderMode !== false;
            let mode = parseInt(opt(o, 'linkCheckMode', '1'), 10);
            if (mode !== 0 && mode !== 1 && mode !== 2) mode = 1;
            cfg.linkCheckMode = mode;
            let ch = parseInt(opt(o, 'channelMode', '0'), 10);
            if (ch !== 0 && ch !== 1 && ch !== 2 && ch !== 3) ch = 0;
            cfg.channelMode = ch;
            cfg.linkCheckConcurrency = Math.max(1, Math.min(5, parseInt(opt(o, 'linkCheckConcurrency', '3'), 10) || 3));
            cfg.linkCheckTimeoutSeconds = Math.max(2, Math.min(10, parseInt(opt(o, 'linkCheckTimeoutSeconds', '5'), 10) || 5));
            cfg.linkCheckBatchSize = Math.max(80, Math.min(200, parseInt(opt(o, 'linkCheckBatchSize', '80'), 10) || 80));
        }
    }
    // 清洗：removed 仅保留内建；disabled 仅保留现有站点；全空则清空两组
    for (let i = cfg.removedBuiltinUrls.length - 1; i >= 0; i--) {
        if (!isBuiltin(cfg.removedBuiltinUrls[i])) cfg.removedBuiltinUrls.splice(i, 1);
    }
    const known = allSites();
    for (let i = cfg.disabledUrls.length - 1; i >= 0; i--) {
        if (!known.includes(cfg.disabledUrls[i])) cfg.disabledUrls.splice(i, 1);
    }
    if (enabledCount() === 0) {
        cfg.disabledUrls = [];
        cfg.removedBuiltinUrls = [];
    }
    for (const k of Object.keys(cfg.apiNames)) {
        if (isBuiltin(k) || cfg.customUrls.includes(k)) continue;
        delete cfg.apiNames[k];
    }
    if (cfg.enabledTypes.length === 0) {
        for (const t of PAN_TYPE_TABLE) cfg.enabledTypes.push(t[0]);
    } else {
        if (!cfg.enabledTypes.includes('guangya') && cfg.enabledTypes.length >= PAN_TYPE_TABLE.length - 2) cfg.enabledTypes.push('guangya');
        if (!cfg.enabledTypes.includes('magnet') && cfg.enabledTypes.length >= PAN_TYPE_TABLE.length - 1) cfg.enabledTypes.push('magnet');
    }
}

/** p020x.b.t：配置写回 KV。 */
function cfgSave() {
    const o = {
        customUrls: cfg.customUrls,
        apiNames: cfg.apiNames,
        disabledUrls: cfg.disabledUrls,
        removedBuiltinUrls: cfg.removedBuiltinUrls,
        maxPerType: cfg.maxPerType,
        enabledTypes: cfg.enabledTypes,
        includeKeywords: cfg.includeKeywords,
        excludeKeywords: cfg.excludeKeywords,
        channels: cfg.channels,
        plugins: cfg.plugins,
        customChannels: cfg.customChannels,
        customPlugins: cfg.customPlugins,
        channelApiUrl: cfg.channelApiUrl,
        folderMode: cfg.folderMode,
        linkCheckMode: cfg.linkCheckMode,
        channelMode: cfg.channelMode,
        linkCheckConcurrency: cfg.linkCheckConcurrency,
        linkCheckTimeoutSeconds: cfg.linkCheckTimeoutSeconds,
        linkCheckBatchSize: cfg.linkCheckBatchSize,
    };
    kvSet(CFG_KEY, JSON.stringify(o));
}

/** p020x.b.b：频道/插件 → &src= 查询段。 */
function srcQuery() {
    try {
        if (cfg.channelMode === 1) {
            return cfg.channels.length ? '&src=tg&channels=' + encJoin(cfg.channels) : '&src=all';
        }
        if (cfg.channelMode === 2) {
            return cfg.plugins.length ? '&src=plugin&plugins=' + encJoin(cfg.plugins) : '&src=all';
        }
        if (cfg.channelMode === 3) {
            if (!cfg.channels.length && !cfg.plugins.length) return '&src=all';
            if (!cfg.plugins.length) return '&src=tg&channels=' + encJoin(cfg.channels);
            if (!cfg.channels.length) return '&src=plugin&plugins=' + encJoin(cfg.plugins);
            let s = '&src=all';
            if (cfg.channels.length) s += '&channels=' + encJoin(cfg.channels);
            if (cfg.plugins.length) s += '&plugins=' + encJoin(cfg.plugins);
            return s;
        }
        return '&src=all';
    } catch (e) {
        return '&src=all';
    }
}

/** p020x.b.c：include/exclude → &filter= 查询段。 */
function filterQuery() {
    try {
        if (!cfg.includeKeywords.length && !cfg.excludeKeywords.length) return '';
        const o = {};
        if (cfg.includeKeywords.length) o.include = cfg.includeKeywords;
        if (cfg.excludeKeywords.length) o.exclude = cfg.excludeKeywords;
        return '&filter=' + javaUrlEncode(JSON.stringify(o));
    } catch (e) {
        return '';
    }
}

function encJoin(list) { return javaUrlEncode(list.join(',')); }

/** p020x.b.i：站点请求头。 */
function siteHeaders(site) {
    return {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36',
        'Referer': site + '/',
    };
}

// ============================ AbstractC0244b1（归组/评分） ============================

const RE_SIZE = /(\d+(?:\.\d+)?)\s*(TB|GB|MB|KB|T|G|M)\b/i;
const RE_DATE = /((?:19|20)\d{2})[-/.年](\d{1,2})[-/.月](\d{1,2})/;
const RE_DV = /(^|[\s._\-\[\]()【】])dv($|[\s._\-\[\]()【】])/i;
const RE_HDR = /(^|[\s._\-\[\]()【】])hdr($|[\s._\-\[\]()【】])/i;
const RE_CAM = /(^|[\s._\-\[\]()【】])(tc|ts|cam|trailer)($|[\s._\-\[\]()【】])/i;
const RE_YEAR_TITLE = /(?:^|[^0-9])((?:19|20)\d{2})(?![0-9])/;

function pick(...arr) {
    for (const s of arr) { const t = str(s); if (t) return t.trim(); }
    return '';
}

/** AbstractC0244b1.m：note+name+title+url+source 拼接（画质判定/大小解析用）。 */
function noteBlob(o) {
    if (!o) return '';
    return opt(o, 'note') + ' ' + opt(o, 'name') + ' ' + opt(o, 'title') + ' ' + opt(o, 'url') + ' ' + opt(o, 'source');
}

/** AbstractC0244b1.n：标题（≤limit，去空白，默认"网盘资源"）。 */
function itemTitle(o, limit) {
    if (!o) return '网盘资源';
    let s = pick(o.note, o.name, o.title, o.url).replace(/\n/g, ' ').replace(/\r/g, ' ').trim().replace(/\s+/g, ' ');
    if (!s) s = '网盘资源';
    if (s.length > limit) s = s.substring(0, Math.max(0, limit - 3)) + '...';
    return s;
}

/** AbstractC0244b1.g：images 数组首个非空项。 */
function itemPic(o) {
    const arr = o && Array.isArray(o.images) ? o.images : null;
    if (!arr) return '';
    for (const s of arr) { const t = str(s).trim(); if (t) return t; }
    return '';
}

/** AbstractC0244b1.f："type|url"（清洗后），去重键。 */
function urlKey(type, o) {
    if (!o) return '';
    const u = str(opt(o, 'url')).replace(/ /g, '').replace(/&amp;/g, '&');
    if (!u) return '';
    return str(type) + '|' + u;
}

/** AbstractC0244b1.h：日期字段首个非空。 */
function datePick(o) {
    return pick(o.datetime, o.date, o.time);
}

function dateEmpty(s) { return s === null || s === undefined || s.length === 0; }

/** AbstractC0244b1.b：日期 → 排序键（yyyy*10000+mm*100+dd；仅年份 ×10000）。 */
function dateSortKey(o) {
    if (!o) return 0;
    const d = datePick(o);
    if (dateEmpty(d) || d.startsWith('0001-')) return 0;
    const m = RE_DATE.exec(d);
    if (!m && /^(?:19|20)\d{2}$/.test(d)) return parseInt(d, 10) * 10000;
    if (!m) {
        const ts = o._timestamp;
        return typeof ts === 'number' ? ts : 0;
    }
    return parseInt(m[3], 10) + parseInt(m[2], 10) * 100 + parseInt(m[1], 10) * 10000;
}

/** AbstractC0244b1.c：大小文本 → GB 浮点。 */
function sizeGb(s) {
    const m = RE_SIZE.exec(str(s));
    if (!m) return 0;
    try {
        const n = parseFloat(m[1]);
        const unit = m[2].toUpperCase();
        if (unit.startsWith('T')) return n * 1024;
        if (unit.startsWith('G')) return n;
        if (unit.startsWith('M')) return n / 1024;
        if (unit.startsWith('K')) return n / 1024 / 1024;
        return 0;
    } catch (e) { return 0; }
}

/** AbstractC0244b1.a：画质评分（枪版/预告等负一百万）。 */
function qualityScore(o) {
    const m = noteBlob(o);
    const lower = m.toLowerCase();
    let score = 0;
    if (m.includes('杜比') || lower.includes('dolby') || lower.includes('dovi')) score += 120000;
    if (RE_DV.test(lower)) score += 100000;
    if (m.includes('高码') || lower.includes('high bitrate') || lower.includes('hbr') || lower.includes('hq')) score += 90000;
    if (lower.includes('hdr10+')) score += 85000;
    else if (lower.includes('hdr10')) score += 80000;
    else if (RE_HDR.test(lower)) score += 75000;
    if (lower.includes('4k') || lower.includes('2160p') || lower.includes('2160') || lower.includes('uhd')) score += 65000;
    if (m.includes('原盘') || lower.includes('remux') || lower.includes('bluray') || lower.includes('blu-ray') || lower.includes('bdmv')) score += 55000;
    if (lower.includes('60fps') || m.includes('60帧')) score += 35000;
    if (lower.includes('1080p') || lower.includes('1080')) score += 15000;
    if (lower.includes('web-dl') || lower.includes('webdl')) score += 3000;
    let penalty = RE_CAM.test(lower);
    if (!penalty && m) {
        for (const w of ['枪版', '抢先', '预告', '花絮', '解说']) if (m.includes(w)) { penalty = true; break; }
    }
    return penalty ? score - 1000000 : score;
}

/** Z0：组内排序（画质↓/日期↓/大小↓/标题↑）。 */
function z0Compare(a, b) {
    const qa = qualityScore(a), qb = qualityScore(b);
    if (qb - qa !== 0) return qb - qa;
    const da = dateSortKey(a), db = dateSortKey(b);
    if (db - da !== 0) return db - da;
    const sa = sizeGb(noteBlob(a)), sb = sizeGb(noteBlob(b));
    if (sb - sa !== 0) return sb - sa;
    return itemTitle(a, 160) < itemTitle(b, 160) ? -1 : (itemTitle(a, 160) > itemTitle(b, 160) ? 1 : 0);
}

/** AbstractC0244b1.l：类型 key 归一。 */
function normTypeKey(s) {
    const lower = str(s).trim().toLowerCase();
    if (lower === 'aliyundrive' || lower === 'aliyun' || lower === 'alipan') return 'ali';
    if (lower === '189' || lower === 'cloud189' || lower === 'tianyiyun') return 'tianyi';
    if (lower === '139' || lower === 'mobile' || lower === 'yidongcloud' || lower === 'caiyun') return 'yidong';
    if (lower === 'baiduyun' || lower === 'baidupan') return 'baidu';
    if (lower === '115pan' || lower === 'a115') return '115';
    if (lower === '123pan' || lower === '123yun' || lower === 'a123') return '123';
    if (lower === 'guangya_pan' || lower === 'guangyapan') return 'guangya';
    if (lower === 'thunder' || lower === 'xunleipan') return 'xunlei';
    if (lower === 'bt' || lower === 'cili' || lower === 'magnetlink') return 'magnet';
    return lower;
}

/** AbstractC0244b1.i + C0241a1：merged_by_type → 按启用类型归组（include/exclude 过滤、
 *  组内 Z0 排序、maxPerType 截断）。C0241a1 构造 = (enabledTypes, include, exclude, maxPerType)。 */
function groupMerged(merged, enabledTypes, includeKw, excludeKw, maxPerType) {
    const groups = {};
    for (const t of (enabledTypes || [])) {
        const key = normTypeKey(t);
        if (key && !groups[key]) groups[key] = [];
    }
    for (const rawKey of Object.keys(merged || {})) {
        const key = normTypeKey(rawKey);
        const list = groups[key];
        const items = merged[rawKey];
        if (!list || !Array.isArray(items)) continue;
        const seen = {};
        for (const old of list) { const k = urlKey(key, old); if (k) seen[k] = true; }
        const includes = (includeKw || []).map(function (s) { return str(s).toLowerCase(); });
        const excludes = (excludeKw || []).map(function (s) { return str(s).toLowerCase(); });
        for (const item of items) {
            if (!item || typeof item !== 'object') continue;
            const lower = noteBlob(item).toLowerCase();
            let bad = false;
            for (const ex of excludes) if (lower.includes(ex)) { bad = true; break; }
            if (bad) continue;
            let ok = includes.length === 0;
            for (const inc of includes) if (lower.includes(inc)) { ok = true; break; }
            if (!ok) continue;
            const k = urlKey(key, item);
            if (!k || seen[k]) continue;
            seen[k] = true;
            list.push(item);
        }
    }
    for (const key of Object.keys(groups)) {
        const list = groups[key];
        if (list.length >= 2) list.sort(z0Compare);
        const cap = maxPerType > 0 ? maxPerType : Number.MAX_SAFE_INTEGER;
        while (list.length > cap) list.pop();
    }
    return groups;
}

// ============================ l0.l（fishps_detail@@ 载荷） ============================

/** l.k：id → [url,title,typeKey,typeName,password,datetime,source,pic,year]。 */
function parseDetailId(id) {
    const s = str(id);
    if (!s || !s.startsWith('fishps_detail@@')) return [s, '', '', '', '', '', '', '', ''];
    const o = tryParse(b64Dec(s.substring(15)));
    if (!o) return [s, '', '', '', '', '', '', '', ''];
    const url = str(opt(o, 'url', s));
    return [
        url || s, opt(o, 'title'), opt(o, 'typeKey'), opt(o, 'typeName'), opt(o, 'password'),
        opt(o, 'datetime'), opt(o, 'source'), opt(o, 'pic'), opt(o, 'year'),
    ];
}

function lget(arr, i) { return (arr && arr.length > i && arr[i] !== undefined && arr[i] !== null) ? str(arr[i]) : ''; }

/** l0.l.e：remarks = typeName[@source][ 日期]。 */
function remarkOf(typeName, source, datetime) {
    let out = str(typeName);
    const src = str(source).trim();
    if (src) out += (out ? '@' : '') + src;
    let dt = str(datetime);
    if (dt && !dt.startsWith('0001-')) {
        const ti = dt.indexOf('T');
        if (ti > 0) dt = dt.substring(0, ti);
        else if (dt.length >= 10) dt = dt.substring(0, 10);
        if (dt) out += (out ? ' ' : '') + dt;
    }
    return out;
}

/** l0.l.d：详情正文（标题/网盘/来源/时间/年份/提取码/链接 + 原内容）。 */
function detailText(prev, arr) {
    const lines = [];
    const push = function (label, val) {
        const v = str(val).trim();
        if (!v) return;
        lines.push(label + ': ' + v);
    };
    push('标题', lget(arr, 1));
    push('网盘', lget(arr, 3));
    push('来源', lget(arr, 6));
    let dt = lget(arr, 5);
    push('时间', (dt && dt.startsWith('0001-')) ? '' : dt.replace('T', ' ').replace('Z', '').trim());
    push('年份', lget(arr, 8));
    push('提取码', lget(arr, 4));
    push('链接', lget(arr, 0));
    let out = lines.join('\n');
    const pv = str(prev).trim();
    if (pv) {
        if (out) out += '\n\n';
        out += '详情:\n' + pv;
    }
    return out;
}

/** l.h：提取码（password 字段或 url 的 pwd=/password=/passcode= 参数）。 */
function pwdOf(o) {
    const p = str(opt(o, 'password')).trim();
    if (p) return p;
    const url = str(opt(o, 'url'));
    if (!url) return '';
    const lower = url.toLowerCase();
    let mark = '';
    let at = -1;
    for (const k of ['pwd=', 'password=', 'passcode=']) {
        const i = lower.indexOf(k);
        if (i >= 0) { mark = k; at = i; break; }
    }
    if (at < 0) return '';
    let seg = url.substring(mark.length + at);
    let len = seg.length;
    const amp = seg.indexOf('&');
    const hash = seg.indexOf('#');
    if (amp >= 0) len = Math.min(len, amp);
    if (hash >= 0) len = Math.min(len, hash);
    return seg.substring(0, len).trim();
}

/** l0.l.f：结果条目 → vod（id=fishps_detail@@载荷 / 裸 url）。 */
function buildResultVod(typeKey, typeName, fallbackSource, o) {
    const title = itemTitle(o, 150);
    let pic = itemPic(o);
    if (!pic) pic = '';
    let id = str(opt(o, 'url')).trim();
    if (id && title) {
        try {
            const payload = {
                url: id,
                title: title,
                typeKey: typeKey,
                typeName: typeName,
                password: pwdOf(o),
                datetime: opt(o, 'datetime'),
                source: opt(o, 'source'),
                pic: itemPic(o),
                year: '',
                _yearRaw: title,
            };
            const ym = RE_YEAR_TITLE.exec(title);
            payload.year = ym ? ym[1] : '';
            id = 'fishps_detail@@' + b64Enc(JSON.stringify(payload));
        } catch (e) { }
    }
    const parts = [];
    const add = function (s) { const t = str(s); if (!t) return; if (parts.indexOf(t) < 0) parts.push(t); };
    add(typeName);
    let dt = pick(o.datetime, o.date, o.time);
    if (dateEmpty(dt) || dt.startsWith('0001-')) dt = '';
    else {
        const m = RE_DATE.exec(dt);
        if (m) dt = m[1] + '-' + (m[2].length === 1 ? '0' + m[2] : m[2]) + '-' + (m[3].length === 1 ? '0' + m[3] : m[3]);
        else if (dt.length > 10) dt = dt.substring(0, 10);
        else dt = '';
    }
    add(dt);
    // 大小（AbstractC0244b1.a 正则 + 单位归一 TB/GB/MB/KB）
    const szm = RE_SIZE.exec(noteBlob(o));
    if (szm) {
        let unit = szm[2].toUpperCase();
        if (unit === 'T') unit = 'TB';
        else if (unit === 'G') unit = 'GB';
        else if (unit === 'M') unit = 'MB';
        else if (unit === 'K') unit = 'KB';
        add(szm[1] + unit);
    }
    const blob = noteBlob(o);
    const lower = blob.toLowerCase();
    const tags = [];
    if (blob.includes('杜比') || lower.includes('dolby') || lower.includes('dovi')) tags.push('杜比');
    if (RE_DV.test(lower)) tags.push('DV');
    if (blob.includes('高码') || lower.includes('high bitrate') || lower.includes('hbr') || lower.includes('hq')) tags.push('高码');
    if (lower.includes('4k') || lower.includes('2160p') || lower.includes('2160') || lower.includes('uhd')) tags.push('4K');
    if (lower.includes('hdr10+')) tags.push('HDR10+');
    else if (lower.includes('hdr10')) tags.push('HDR10');
    else if (RE_HDR.test(lower)) tags.push('HDR');
    if (blob.includes('原盘')) tags.push('原盘');
    if (lower.includes('remux')) tags.push('REMUX');
    if (lower.includes('60fps') || blob.includes('60帧')) tags.push('60FPS');
    if (lower.includes('1080p') || lower.includes('1080')) tags.push('1080P');
    if (lower.includes('web-dl') || lower.includes('webdl')) tags.push('WEB-DL');
    add(tags.length ? tags.join('/') : '');
    let source = str(opt(o, 'source'));
    if (!source) source = str(fallbackSource);
    if (source) {
        source = source.replace('plugin:', '').replace('tg:', '').replace('channel:', '');
        add(source);
    }
    const ym = RE_YEAR_TITLE.exec(title);
    const v = vod(id, title, pic, parts.join(' · '), { vod_type: typeName });
    if (ym) v.vod_year = ym[1];
    return v;
}

/** l0.l.i：不支持类型/空结果 → 提示 vod。 */
function unsupportedVod(id, arr) {
    let name = lget(arr, 1);
    if (!name) name = '不支持的网盘类型';
    const typeKey = lget(arr, 2);
    const url = lget(arr, 0);
    let hint;
    if (typeKey === 'guangya') hint = '当前仅支持复制链接到光鸭云盘APP打开，暂不支持在线播放';
    else if (url && url.toLowerCase().includes('guangyapan.com/')) hint = '当前仅支持复制链接到光鸭云盘APP打开，暂不支持在线播放';
    else hint = '请复制链接到对应APP打开';
    const v = vod(id, name, '', remarkOf(lget(arr, 3), lget(arr, 6), lget(arr, 5)), {
        vod_type: lget(arr, 3),
        vod_year: lget(arr, 8),
        vod_content: detailText(hint, arr),
    });
    const pic = lget(arr, 7);
    if (pic) v.vod_pic = pic;
    return resultDetail(v);
}

/** l0.l.c：Cloud 结果合并载荷字段（FishCrypto.b 恒等）。 */
function mergeDetailPayload(resultJson, arr) {
    const o = tryParse(resultJson);
    if (!o) return resultJson;
    const list = o.list;
    if (!Array.isArray(list) || !list.length || typeof list[0] !== 'object') return resultJson;
    const first = list[0];
    const title = lget(arr, 1);
    const pic = lget(arr, 7);
    const typeName = lget(arr, 3);
    const year = lget(arr, 8);
    if (title) first.vod_name = title;
    if (pic) first.vod_pic = pic;
    if (typeName) first.vod_type = typeName;
    if (year) first.vod_year = year;
    const rm = remarkOf(typeName, lget(arr, 6), lget(arr, 5));
    if (rm) first.vod_remarks = rm;
    first.vod_content = detailText(str(first.vod_content || ''), arr);
    return JSON.stringify(o);
}

// ============================ p020x.h 搜索核心 ============================

/** f.A 简化（无后台检测线程 → 缓存为空恒 2，与 Java 检测未完成时一致）。 */
function checkStatus(o) { return 2; }

/** h.f：linkCheckMode==2 时剔除缓存失效项（无缓存 → 全保留，Java 检测未完成时同）。 */
function filterCheck(list) { return (list || []).slice(); }

/** h.d：序号前缀（"01. "）。 */
function withIndex(v, i, total) {
    if (i <= 0) return v;
    const width = Math.max(2, String(Math.max(i, total)).length);
    let pad = String(i);
    while (pad.length < width) pad = '0' + pad;
    v.vod_name = pad + '. ' + str(v.vod_name);
    return v;
}

function validCount(list) {
    let n = 0;
    for (const o of list) if (str(opt(o, 'url'))) n++;
    return n;
}

/** h.a：folder 模式 — 每类型一个 fishps@@ 文件夹（结果存模块级 map）。 */
const folderStore = new Map(); // Java p020x.h.b 静态 HashMap（进程内瞬态）

function buildFolders(kw, grouped, srcSummary, out) {
    const now = Date.now();
    for (const typeKey of cfg.enabledTypes) {
        const list = grouped[typeKey];
        if (!list || !list.length) continue;
        const filtered = filterCheck(list);
        if (!filtered.length) continue;
        let name = panTypeName(typeKey);
        const id = 'fishps@@' + javaUrlEncode(kw) + '@@' + typeKey + '@@' + now;
        const v = vod(id, name + ' (' + filtered.length + '个)', '', srcSummary ? name + '@' + srcSummary : name, {
            vod_tag: 'folder',
        });
        out.push(v);
        folderStore.set(id, filtered);
    }
}

/** h.b：flat 模式 — 全类型平铺（checkStatus 排序 + 序号；fallback source = 源合并摘要 strG）。 */
function buildFlat(grouped, srcSummary, out) {
    let i = 0;
    let total = 0;
    const per = [];
    for (const typeKey of cfg.enabledTypes) {
        const list = grouped[typeKey];
        if (!list || !list.length) continue;
        const filtered = filterCheck(list);
        if (filtered.length >= 2) filtered.sort(function (a, b) { return checkStatus(a) - checkStatus(b); });
        for (const o of filtered) {
            const url = str(opt(o, 'url'));
            if (!url) continue;
            per.push(buildResultVod(typeKey, panTypeName(typeKey), srcSummary, o));
        }
        total += validCount(filtered);
    }
    if (cfg.maxPerType > 0) total = Math.min(total, cfg.maxPerType);
    for (const v of per) {
        i++;
        withIndex(v, i, total);
        out.push(v);
    }
}

/** 单站点 /api/search 拉取 + merged_by_type 提取（单站点路径要求非空）。 */
function fetchSiteMerged(site, kw) {
    const url = site + '/api/search?kw=' + javaUrlEncode(kw) + '&res=merge' + srcQuery() + filterQuery();
    let body;
    try { body = bodyOf(httpGet(url, siteHeaders(site))); } catch (e) { return null; }
    const o = tryParse(body);
    if (!o) return null;
    const data = o.data && typeof o.data === 'object' ? o.data : null;
    const merged = data && data.merged_by_type && typeof data.merged_by_type === 'object' ? data.merged_by_type : null;
    return merged;
}

/** 多站点合并去重（Java 221-257 行：按 url 去重合并各 merged_by_type）。 */
function mergeMergedMaps(maps) {
    if (maps.length === 1) return maps[0];
    try {
        const out = {};
        const seen = {};
        for (const m of maps) {
            for (const key of Object.keys(m)) {
                const arr = m[key];
                if (!Array.isArray(arr)) continue;
                if (!out[key]) out[key] = [];
                for (const item of arr) {
                    if (!item || typeof item !== 'object') continue;
                    const u = str(opt(item, 'url'));
                    if (!u || seen[u]) continue;
                    seen[u] = true;
                    out[key].push(item);
                }
            }
        }
        return out;
    } catch (e) {
        return maps[0];
    }
}

/** C0261h0.g：响应站点摘要（单站=主域名倒数第二段；多站=N源合并）。 */
function srcSummaryOf(responding) {
    if (!responding.length) return '';
    if (responding.length === 1) {
        try {
            const m = /^[a-z][a-z0-9+.-]*:\/\/([^\/?#]+)/i.exec(responding[0]);
            const host = m ? m[1] : responding[0];
            const segs = host.split('.');
            return segs.length >= 2 ? segs[segs.length - 2] : host;
        } catch (e) {
            return '';
        }
    }
    return responding.length + '源合并';
}

/** $host$5abcbf7c29fbb7fe：searchContent(kw, quick, page)。 */
function searchContent(kw, quick, page) {
    const out = [];
    if (str(page) !== '1') return resultList(out);
    const sites = enabledSites();
    let merged = null;
    if (!sites.length) return resultList(out);
    const responding = [];
    try {
        if (sites.length === 1) {
            const m = fetchSiteMerged(sites[0], kw);
            if (m && Object.keys(m).length > 0) {
                responding.push(sites[0]);
                merged = m;
            }
        } else {
            const maps = [];
            for (const site of sites) {
                try {
                    const m = fetchSiteMerged(site, kw);
                    if (m && Object.keys(m).length > 0) {
                        responding.push(site);
                        maps.push(m);
                    }
                } catch (e) { }
            }
            if (maps.length) merged = mergeMergedMaps(maps);
        }
    } catch (e) { }
    if (!merged) return resultList(out);
    try {
        const grouped = groupMerged(merged, cfg.enabledTypes, cfg.includeKeywords, cfg.excludeKeywords, cfg.maxPerType);
        if (cfg.folderMode) buildFolders(kw, grouped, srcSummaryOf(responding), out);
        else buildFlat(grouped, srcSummaryOf(responding), out);
    } catch (e) { }
    return resultList(out);
}

// ============================ m0.a 设置卡片 ============================

/** p020x.b.k：已选类型摘要。 */
function typeSummary() {
    const f = cfg.enabledTypes;
    if (!f.length) return '未选择';
    let out = '';
    for (let i = 0; i < Math.min(f.length, 5); i++) {
        if (i > 0) out += '>';
        out += panTypeName(f[i]);
    }
    if (f.length > 5) out += '...';
    return out;
}

/** p020x.b.j：关键词摘要。 */
function kwSummary(list) {
    if (!list.length) return '未设置';
    if (list.length <= 3) return list.join(',');
    return list[0] + ',' + list[1] + '等' + list.length + '个';
}

/** m0.a：设置卡片列表（图标占位为空）。 */
function settingsCards() {
    const out = [];
    out.push(vod('site', 'API管理', '', siteSummary(), { action: 'site' }));
    let strategy = cfg.folderMode ? '文件夹' : '列表';
    strategy += ' / ';
    if (cfg.linkCheckMode === 0) strategy += '关闭';
    else if (cfg.linkCheckMode === 2) strategy += '隐藏失效';
    else strategy += '本地检测/可靠性极强';
    out.push(vod('strategy', '搜索策略', '', strategy, { action: 'strategy' }));
    let channel;
    if (!cfg.customChannels.length && !cfg.customPlugins.length) channel = '无自定义';
    else channel = '自定义 TG ' + cfg.customChannels.length + ' / 插件 ' + cfg.customPlugins.length;
    out.push(vod('channels', '频道范围', '', channel, { action: 'channels' }));
    out.push(vod('filter', '网盘过滤', '', cfg.enabledTypes.length + '/' + PAN_TYPE_TABLE.length + '个', { action: 'filter' }));
    out.push(vod('order', '网盘排序', '', typeSummary(), { action: 'order' }));
    out.push(vod('max', '显示数量', '', cfg.maxPerType > 0 ? '每类' + cfg.maxPerType + '条' : '每类不限制', { action: 'max' }));
    out.push(vod('keywords', '关键词设置', '', '包含:' + kwSummary(cfg.includeKeywords) + ' / 屏蔽:' + kwSummary(cfg.excludeKeywords), { action: 'keywords' }));
    out.push(vod('help', '使用帮助', '', '功能说明与教程', { action: 'help' }));
    out.push(vod('reset', '恢复默认', '', '', { action: 'reset' }));
    return out;
}

// ============================ 协议实现 ============================

let initExt = '';

/** Cloud $host$6c1ebb3cb60973b4 等价（FishPs detail）。 */
function detailContent(list) {
    const id = str(list[0]);
    // 1) 设置类 action id（Java g0 打开弹窗后返回 ""）
    const actions = ['filter', 'order', 'max', 'site', 'strategy', 'channels', 'reset', 'include', 'exclude', 'display', 'check', 'keywords', 'help'];
    if (actions.indexOf(id) >= 0) {
        log('[FishPs] action-detail（App 弹窗在 JS 壳不可达）: ' + id);
        return '';
    }
    const arr = parseDetailId(id);
    const url = lget(arr, 0);
    if (!isMagnet(url)) {
        // 网盘链接 → Cloud 解析（JS：直通）→ 空结果给提示 vod，否则合并载荷字段
        const detailJson = cloudPassDetail(url);
        const empty = (function () { const o = tryParse(detailJson); return !o || !Array.isArray(o.list) || o.list.length === 0; })();
        return empty ? unsupportedVod(id, arr) : mergeDetailPayload(detailJson, arr);
    }
    // 2) 磁力：j0()=false（壳无磁力云下载子系统）→ C1()=true → Java 原路径：磁力直链
    const title = lget(arr, 1) || '盘搜磁力';
    const magnet = magnetExtract(url);
    const v = vod(id, title, '', '磁力', { vod_play_from: '磁力', vod_play_url: magnet });
    const hint = '未配置云下载时保持原磁力链路。';
    v.vod_pic = lget(arr, 7);
    if (!v.vod_pic) v.vod_pic = '';
    v.vod_type = lget(arr, 3);
    v.vod_year = lget(arr, 8);
    v.vod_remarks = remarkOf(lget(arr, 3), lget(arr, 6), lget(arr, 5));
    v.vod_content = detailText(hint, arr);
    return resultDetail(v);
}

export default {
    init(ext) {
        initExt = ext === undefined || ext === null ? '' : ext;
        cfgLoad();
        // FishPs.init：bVar.o() 后 a("", ext) — ext 为自定义盘搜站点（内建站则视为重新启用）
        try {
            const site = normSite(initExt);
            if (site) {
                if (isBuiltin(site)) {
                    const pi = cfg.removedBuiltinUrls.indexOf(site);
                    if (pi >= 0) cfg.removedBuiltinUrls.splice(pi, 1);
                    const di = cfg.disabledUrls.indexOf(site);
                    if (di >= 0) cfg.disabledUrls.splice(di, 1);
                } else {
                    if (!cfg.customUrls.includes(site)) cfg.customUrls.push(site);
                    const di = cfg.disabledUrls.indexOf(site);
                    if (di >= 0) cfg.disabledUrls.splice(di, 1);
                }
            }
        } catch (e) { }
        log('[FishPs] init ext=' + initExt + ' sites=' + enabledCount() + '/' + allSites().length);
        return '';
    },

    home(filter) {
        // $host$1b26b551389a5dab：class=[setting] + list=设置卡片
        cfgLoad();
        return JSON.stringify({
            class: [{ type_id: 'setting', type_name: '⚙ 摸鱼盘搜设置（本源是纯搜索）' }],
            list: settingsCards(),
        });
    },

    homeVod() {
        return '';
    },

    category(tid, pg, filter, extend) {
        // $host$f9d7235748f992e0
        cfgLoad();
        const t = str(tid);
        const p = str(pg);
        if (t === 'setting' && p === '1') return resultList(settingsCards());
        // fishps@@kw@@type@@ts 文件夹展开
        if (t.startsWith('fishps@@')) {
            const parts = t.split('@@');
            const typeKey = parts.length > 2 ? parts[2] : '';
            let stored = folderStore.get(t);
            if (!stored) stored = [];
            const filtered = filterCheck(stored.slice());
            if (filtered.length >= 2) filtered.sort(function (a, b) { return checkStatus(a) - checkStatus(b); });
            let cap = cfg.maxPerType;
            let total = validCount(filtered);
            if (cap > 0) total = Math.min(total, cap);
            const out = [];
            let i = 0;
            for (const o of filtered) {
                if (cap > 0 && i >= cap) break;
                const url = str(opt(o, 'url'));
                if (!url) continue;
                const v = buildResultVod(typeKey, panTypeName(typeKey), typeKey === undefined ? '' : '', o);
                i++;
                withIndex(v, i, total);
                out.push(v);
            }
            return resultList(out);
        }
        return resultList([]);
    },

    detail(id) {
        return detailContent([String(id)]);
    },

    search(key, quick, pg) {
        return searchContent(str(key), !!quick, str(pg || '1'));
    },

    play(flag, id, vipFlags) {
        // $host$62d5eed2b06b9d14 → AbstractC0302v0.X（云下载播放在壳不可达 → null）→
        // Cloud.playerContent：未识别播放 id 原样 return str（Java 同路径）
        return JSON.stringify(playData(flag, id, {}));
    },

    action(action) {
        // $host$b5d914d976e0069f：设置弹窗分发（JS 壳无原生弹窗 → 记录后按 Java 返回 ""）
        log('[FishPs] action: ' + str(action));
        return '';
    },
};

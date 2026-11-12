/**
 * FishCloud.js — 🪵┆木偶┆4K（JS 版，catvod JsSpider 协议）
 *
 * 移植自：kele/src/ysc/diy/摸鱼儿/readable_sources/com/github/catvod/spider/FishCloud.java
 * （extends Cloud，MacCMS 模板站点抓取）+ 依赖 merge 类：C0257g/AbstractC0260h（站点选择器 +
 * 失活切换）、f0/h0（jsoup 包装：Q/R/P/T/g/c/a/b 语义）、p001b.{g,k,b}、X1（okhttp GET）。
 *
 * 移植差异（逻辑 1:1，以下为 JS 壳约束下的必要映射）：
 *  - jsoup → cheerio（'../lib/cheerio.min.js'）：Q/R=select（R 取首个）、P=parent、
 *    T=ownText 近似（contents().filter(type==='text')）、g=整段 text().trim()、
 *    c=各元素 ownText 列表、a(attr)=首个含该属性的元素取值、b()=data-clipboard-text 属性列表；
 *  - Cloud 基类网盘后端（Quark/UC/Ali/… 十类 SDK）不随本文件移植：详情页 data-clipboard-text
 *    收集到的盘链 → vod_play_from=盘类型短名 / vod_play_url=原始分享链接（$$$ 并行数组，
 *    与 Cloud.e(list,z) 输出结构一致），play 阶段直通（Java 对未识别播放 id 本就 `return str`）；
 *  - FishCrypto.beginHostEntry/endHostEntry 丢弃；N1.d/AbstractC0280n1.p/q → no-op；
 *  - AbstractC0260h 站点探活（HEAD 5s 线程池）→ 简化为「请求空响应时顺延下一站点」（对齐
 *    C0257g.a 的 fallback 语义），选中站点持久化 local KV；
 *  - 分类分页 o(pg, Integer.MAX_VALUE, 36, Integer.MAX_VALUE)：Integer.MAX_VALUE 语义
 *    「未知」按壳约定输出 9999。
 *
 * 宿主依赖：req/httpGet、console、local（KV）、joinUrl；lib/cheerio.min.js。
 */

import cheerio from '../lib/cheerio.min.js';
import { httpGet, bodyOf, homeData, vod, pageData, playData, javaUrlEncode, tryParse, log } from './muCore.js';

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

/** 站点列表 → 稳定 key（Java: key + "_" + list.hashCode()）。 */
function sitesKey(key, sites) {
    let h = 0;
    const joined = sites.join('\u0001');
    for (let i = 0; i < joined.length; i++) {
        h = (h * 31 + joined.charCodeAt(i)) | 0;
    }
    return key + '_' + h;
}

// ---- 网盘类型识别/命名（AbstractC0302v0.b1 + C0247c1）----

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

const PAN_SHORT = { quark: '夸克', uc: '优视', ali: '阿里', tianyi: '天翼', yidong: '移动', baidu: '百度', xunlei: '迅雷', '115': '115', pan123: '123', guangya: '光鸭' };
function panShort(key) { return PAN_SHORT[key] || str(key); }

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

// ---- cheerio 包装（f0/h0 语义） ----

/** ownText 近似：仅直接文本节点。 */
function ownText($el) {
    try {
        return $el.contents().filter(function (i, n) { return n.type === 'text'; }).text().trim();
    } catch (e) {
        return str($el.text()).trim();
    }
}

/** h0.d.g：多元素 ownText 以空格拼接后 trim。 */
function ownTextJoin($el) {
    const parts = [];
    $el.each(function (i, n) {
        const t = ownText($el.eq(i));
        if (t) parts.push(t);
    });
    return parts.join(' ');
}

/** h0.d.c：各元素 ownText 列表。 */
function ownTextList($el) {
    const out = [];
    $el.each(function (i, n) {
        out.push(ownText($el.eq(i)));
    });
    return out;
}

/** h0.d.a(attr)：首个含该属性的元素取值，无 → ""。 */
function attrOf($el, name) {
    let found = null;
    $el.each(function (i, n) {
        if (found === null && $el.eq(i).attr(name) !== undefined) found = $el.eq(i).attr(name);
    });
    return found === null ? '' : str(found);
}

/** h0.d.b()：data-clipboard-text 属性列表。 */
function clipList($el) {
    const out = [];
    $el.each(function (i, n) {
        const v = $el.eq(i).attr('data-clipboard-text');
        if (v !== undefined) out.push(str(v));
    });
    return out;
}

// ============================ 站点选择器（C0257g/AbstractC0260h） ============================

const SITE_KV_PREFIX = 'fishcloud_site_url';
let sites = [];       // C0257g.a
let siteCurrent = ''; // C0257g.d

function trimSite(s) {
    let t = str(s).trim();
    while (t.endsWith('/')) t = t.substring(0, t.length - 1);
    return t;
}

/** AbstractC0260h.b：站点列表 + KV 记忆（探活简化为请求期顺延）。 */
function siteInit(list) {
    sites = [];
    for (const s of list || []) {
        const t = trimSite(s);
        if (t && sites.indexOf(t) < 0) sites.push(t);
    }
    const kvKey = sitesKey(SITE_KV_PREFIX, sites);
    siteCurrent = kvGet(kvKey, '');
    if (siteCurrent && sites.indexOf(siteCurrent) < 0) siteCurrent = '';
    if (!siteCurrent && sites.length) siteCurrent = sites[0];
    if (siteCurrent) kvSet(kvKey, siteCurrent);
}

function siteBase() { return siteCurrent; }

/** C0257g.a：相对路径补全 + 空响应顺延下一站点。 */
function siteGet(path, headers) {
    const p = str(path);
    if (p.startsWith('http')) {
        try { return bodyOf(httpGet(p, headers || {})); } catch (e) { return ''; }
    }
    let base = siteCurrent;
    if (!base && sites.length) { base = sites[0]; siteCurrent = base; }
    let body = '';
    try { body = bodyOf(httpGet(base + p, headers || {})); } catch (e) { body = ''; }
    if (!body && sites.length > 1) {
        for (const s of sites) {
            if (s === siteCurrent) continue;
            try {
                const b2 = bodyOf(httpGet(s + p, headers || {}));
                if (b2) {
                    siteCurrent = s;
                    kvSet(sitesKey(SITE_KV_PREFIX, sites), s);
                    return b2;
                }
            } catch (e) { }
        }
    }
    return body;
}

// ============================ FishCloud 主逻辑 ============================

/** h()：请求头。 */
function headers() {
    const map = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36',
    };
    if (siteCurrent) map['Referer'] = siteCurrent + '/';
    return map;
}

/** i()：特殊模板站点（filters 按 class 裁剪）。 */
function isSpecialHost() {
    try {
        const u = String(siteCurrent || '');
        const m = /^[a-z][a-z0-9+.-]*:\/\/([^\/?#]+)/i.exec(u);
        const host = m ? m[1].toLowerCase() : '';
        return host === 'www.hjzhencai.top' || host === 'hjzhencai.top' || host === 'www.huanjuanwp.shop' || host === 'huanjuanwp.shop';
    } catch (e) {
        return false;
    }
}

/** j(element)：封面（data-src → data-original → src；根相对补站点基址）。 */
function picOf($el) {
    const img = $el.find('.module-item-pic img').first();
    let src = '';
    if (img.length) {
        src = str(img.attr('data-src') || '');
        if (!src) src = str(img.attr('data-original') || '');
        if (!src) src = str(img.attr('src') || '');
    }
    if (src && src.startsWith('/') && siteCurrent) {
        let base = siteCurrent;
        if (base.endsWith('/')) base = base.substring(0, base.length - 1);
        return base + src;
    }
    return src;
}

/** k(elements)：列表解析（module-item / a.module-poster-item / module-card-item）。 */
function parseList($, $items) {
    const out = [];
    $items.each(function (i, n) {
        const el = $items.eq(i);
        let $title = el.find('.module-item-titlebox > a').first();
        if (!$title.length && el.is('a.module-poster-item')) $title = el;
        if (!$title.length) $title = el.find('.module-card-item-title a').first();
        if ($title.length) {
            const href = str($title.attr('href') || '');
            let title = str($title.attr('title') || '');
            if (!title) title = ownText($title);
            const pic = picOf(el);
            let remark = str(el.find('.module-item-text').text()).trim();
            if (!remark) remark = str(el.find('.module-item-note').text()).trim();
            if (href) out.push(vod(href, title, pic, remark));
        }
    });
    return out;
}

/** 静态 filters（Java 内联 JSON 原文）。 */
const STATIC_FILTERS = JSON.parse('{"1":[{"key":"cateId","name":"类型","value":[{"n":"全部","v":"1"},{"n":"科幻片","v":"6"},{"n":"爱情片","v":"7"},{"n":"战争片","v":"8"},{"n":"恐怖片","v":"9"},{"n":"高码片","v":"10"},{"n":"动画片","v":"11"},{"n":"动作片","v":"12"}]},{"key":"class","name":"剧情","value":[{"n":"全部","v":""},{"n":"喜剧","v":"喜剧"},{"n":"爱情","v":"爱情"},{"n":"恐怖","v":"恐怖"},{"n":"动作","v":"动作"},{"n":"科幻","v":"科幻"},{"n":"剧情","v":"剧情"},{"n":"战争","v":"战争"},{"n":"警匪","v":"警匪"},{"n":"犯罪","v":"犯罪"},{"n":"动画","v":"动画"},{"n":"奇幻","v":"奇幻"},{"n":"武侠","v":"武侠"},{"n":"冒险","v":"冒险"},{"n":"枪战","v":"枪战"},{"n":"悬疑","v":"悬疑"},{"n":"惊悚","v":"惊悚"},{"n":"经典","v":"经典"}]},{"key":"area","name":"地区","value":[{"n":"全部","v":""},{"n":"大陆","v":"大陆"},{"n":"香港","v":"香港"},{"n":"台湾","v":"台湾"},{"n":"美国","v":"美国"},{"n":"法国","v":"法国"},{"n":"英国","v":"英国"},{"n":"日本","v":"日本"},{"n":"韩国","v":"韩国"},{"n":"德国","v":"德国"},{"n":"泰国","v":"泰国"},{"n":"印度","v":"印度"},{"n":"意大利","v":"意大利"},{"n":"西班牙","v":"西班牙"},{"n":"加拿大","v":"加拿大"},{"n":"其他","v":"其他"}]},{"key":"year","name":"年份","value":[{"n":"全部","v":""},{"n":"2025","v":"2025"},{"n":"2024","v":"2024"},{"n":"2023","v":"2023"},{"n":"2022","v":"2022"},{"n":"2021","v":"2021"},{"n":"2020","v":"2020"},{"n":"2019","v":"2019"},{"n":"2018","v":"2018"},{"n":"2017","v":"2017"},{"n":"2016","v":"2016"},{"n":"2015","v":"2015"},{"n":"2014","v":"2014"},{"n":"2013","v":"2013"},{"n":"2012","v":"2012"},{"n":"2011","v":"2011"},{"n":"2010","v":"2010"}]},{"key":"by","name":"排序","value":[{"n":"时间","v":"time"},{"n":"人气","v":"hits"},{"n":"评分","v":"score"}]}],"2":[{"key":"cateId","name":"类型","value":[{"n":"全部","v":"2"},{"n":"国产剧","v":"13"},{"n":"日韩剧","v":"14"},{"n":"欧美剧","v":"15"},{"n":"港台剧","v":"16"}]},{"key":"class","name":"剧情","value":[{"n":"全部","v":""},{"n":"古装","v":"古装"},{"n":"战争","v":"战争"},{"n":"青春偶像","v":"青春偶像"},{"n":"喜剧","v":"喜剧"},{"n":"家庭","v":"家庭"},{"n":"犯罪","v":"犯罪"},{"n":"动作","v":"动作"},{"n":"奇幻","v":"奇幻"},{"n":"剧情","v":"剧情"},{"n":"历史","v":"历史"},{"n":"经典","v":"经典"},{"n":"乡村","v":"乡村"},{"n":"情景","v":"情景"},{"n":"商战","v":"商战"},{"n":"网剧","v":"网剧"},{"n":"其他","v":"其他"}]},{"key":"area","name":"地区","value":[{"n":"全部","v":""},{"n":"大陆","v":"大陆"},{"n":"香港","v":"香港"},{"n":"台湾","v":"台湾"},{"n":"美国","v":"美国"},{"n":"日本","v":"日本"},{"n":"韩国","v":"韩国"},{"n":"泰国","v":"泰国"},{"n":"英国","v":"英国"},{"n":"新加坡","v":"新加坡"},{"n":"其他","v":"其他"}]},{"key":"year","name":"年份","value":[{"n":"全部","v":""},{"n":"2025","v":"2025"},{"n":"2024","v":"2024"},{"n":"2023","v":"2023"},{"n":"2022","v":"2022"},{"n":"2021","v":"2021"},{"n":"2020","v":"2020"},{"n":"2019","v":"2019"},{"n":"2018","v":"2018"},{"n":"2017","v":"2017"},{"n":"2016","v":"2016"},{"n":"2015","v":"2015"},{"n":"2014","v":"2014"},{"n":"2013","v":"2013"},{"n":"2012","v":"2012"},{"n":"2011","v":"2011"},{"n":"2010","v":"2010"}]},{"key":"by","name":"排序","value":[{"n":"时间","v":"time"},{"n":"人气","v":"hits"},{"n":"评分","v":"score"}]}],"3":[{"key":"cateId","name":"类型","value":[{"n":"全部","v":"3"},{"n":"日韩","v":"22"},{"n":"国产","v":"20"},{"n":"欧美","v":"21"}]},{"key":"year","name":"年份","value":[{"n":"全部","v":""},{"n":"2025","v":"2025"},{"n":"2024","v":"2024"},{"n":"2023","v":"2023"},{"n":"2022","v":"2022"},{"n":"2021","v":"2021"},{"n":"2020","v":"2020"},{"n":"2019","v":"2019"},{"n":"2018","v":"2018"},{"n":"2017","v":"2017"},{"n":"2016","v":"2016"},{"n":"2015","v":"2015"},{"n":"2014","v":"2014"},{"n":"2013","v":"2013"},{"n":"2012","v":"2012"},{"n":"2011","v":"2011"},{"n":"2010","v":"2010"}]},{"key":"by","name":"排序","value":[{"n":"时间","v":"time"},{"n":"人气","v":"hits"},{"n":"评分","v":"score"}]}],"4":[{"key":"area","name":"地区","value":[{"n":"全部","v":""},{"n":"大陆","v":"大陆"},{"n":"日本","v":"日本"},{"n":"欧美","v":"欧美"},{"n":"其他","v":"其他"}]},{"key":"year","name":"年份","value":[{"n":"全部","v":""},{"n":"2025","v":"2025"},{"n":"2024","v":"2024"},{"n":"2023","v":"2023"},{"n":"2022","v":"2022"},{"n":"2021","v":"2021"},{"n":"2020","v":"2020"},{"n":"2019","v":"2019"},{"n":"2018","v":"2018"},{"n":"2017","v":"2017"},{"n":"2016","v":"2016"},{"n":"2015","v":"2015"},{"n":"2014","v":"2014"},{"n":"2013","v":"2013"},{"n":"2012","v":"2012"},{"n":"2011","v":"2011"},{"n":"2010","v":"2010"}]},{"key":"by","name":"排序","value":[{"n":"时间","v":"time"},{"n":"人气","v":"hits"},{"n":"评分","v":"score"}]}],"5":[{"key":"year","name":"年份","value":[{"n":"全部","v":""},{"n":"2025","v":"2025"},{"n":"2024","v":"2024"},{"n":"2023","v":"2023"},{"n":"2022","v":"2022"},{"n":"2021","v":"2021"},{"n":"2020","v":"2020"},{"n":"2019","v":"2019"},{"n":"2018","v":"2018"},{"n":"2017","v":"2017"},{"n":"2016","v":"2016"},{"n":"2015","v":"2015"},{"n":"2014","v":"2014"},{"n":"2013","v":"2013"},{"n":"2012","v":"2012"},{"n":"2011","v":"2011"},{"n":"2010","v":"2010"}]},{"key":"by","name":"排序","value":[{"n":"时间","v":"time"},{"n":"人气","v":"hits"},{"n":"评分","v":"score"}]}],"26":[{"key":"cateId","name":"类型","value":[{"n":"全部","v":"26"},{"n":"高分电影","v":"29"},{"n":"高分剧集","v":"27"},{"n":"高分外剧","v":"30"},{"n":"国漫之光","v":"28"}]},{"key":"year","name":"年份","value":[{"n":"全部","v":""},{"n":"2025","v":"2025"},{"n":"2024","v":"2024"},{"n":"2023","v":"2023"},{"n":"2022","v":"2022"},{"n":"2021","v":"2021"},{"n":"2020","v":"2020"},{"n":"2019","v":"2019"},{"n":"2018","v":"2018"},{"n":"2017","v":"2017"},{"n":"2016","v":"2016"},{"n":"2015","v":"2015"},{"n":"2014","v":"2014"},{"n":"2013","v":"2013"},{"n":"2012","v":"2012"},{"n":"2011","v":"2011"},{"n":"2010","v":"2010"}]},{"key":"by","name":"排序","value":[{"n":"时间","v":"time"},{"n":"人气","v":"hits"},{"n":"评分","v":"score"}]}]}');

/** $host$1b26b551389a5dab：homeContent。 */
function homeContent() {
    const classes = [];
    let vods = [];
    const html = siteGet('/', headers());
    try {
        const $ = cheerio.load(str(html));
        const $nav = $('ul.grid-items > li > a');
        const $fallback = $nav.length ? null : $('.navbar-items > li > a[href^="/index.php/vod/type/id/"]');
        const $links = $nav.length ? $nav : $fallback;
        if ($links) {
            $links.each(function (i, n) {
                const a = $links.eq(i);
                const href = str(a.attr('href') || '');
                if (!href.startsWith('/index.php/vod')) return;
                const id = href.replace(/\D+/g, '');
                const title = str(a.attr('title') || '');
                if (!id) return;
                classes.push({ type_id: id, type_name: title });
                if (classes.length >= 7) return false;
            });
        }
        vods = parseList($, $('.module-item'));
    } catch (e) {
        log('[FishCloud] home parse: ' + e);
    }
    let filters = STATIC_FILTERS;
    if (isSpecialHost()) {
        try {
            const rebuilt = {};
            for (const cls of classes) {
                const key = cls.type_id === '21' ? '4' : cls.type_id;
                const group = STATIC_FILTERS[key] || STATIC_FILTERS['5'];
                const arr = [];
                for (const g of group) {
                    if (g.key !== 'cateId') arr.push(g);
                }
                rebuilt[cls.type_id] = arr;
            }
            filters = rebuilt;
        } catch (e) { }
    }
    return JSON.stringify({ class: classes, list: vods, filters: filters });
}

/** $host$f9d7235748f992e0：categoryContent。
 *  URL = /index.php/vod/show/id/{cateId||tid}/page/{pg}{/class/x}{/area/x}{/lang/x}{/year/x}{/by/x}.html */
function categoryContent(tid, pg, extend) {
    let t = str(tid);
    const p = parseInt(str(pg), 10) || 1;
    let cls = '', area = '', by = '', year = '', lang = '';
    if (extend && typeof extend === 'object') {
        if (extend['cateId']) t = str(extend['cateId']);
        if (extend['area']) area = '/area/' + str(extend['area']);
        if (extend['by']) by = '/by/' + str(extend['by']);
        if (extend['year']) year = '/year/' + str(extend['year']);
        if (extend['class']) cls = '/class/' + str(extend['class']);
        if (extend['lang']) lang = '/lang/' + str(extend['lang']);
    }
    const path = '/index.php/vod/show/id/' + t + '/page/' + p + cls + area + lang + year + by + '.html';
    let vods = [];
    try {
        const html = siteGet(path, headers());
        const $ = cheerio.load(str(html));
        vods = parseList($, $('.module-item'));
    } catch (e) {
        log('[FishCloud] category parse: ' + e);
    }
    // gVarC.o(page, Integer.MAX_VALUE, 36, Integer.MAX_VALUE)
    return pageData(vods, p, 9999, 36, 9999);
}

/** l(kw, page)：搜索。 */
function searchContent(kw, page) {
    const p = parseInt(str(page), 10) || 1;
    try {
        const path = '/index.php/vod/search/' + (isSpecialHost() ? 'page/' + p + '/' : '') +
            'wd/' + javaUrlEncode(str(kw)) + '.html';
        const html = siteGet(path, headers());
        const $ = cheerio.load(str(html));
        const $items = $('.module-search-item');
        if (!$items.length) {
            return JSON.stringify({ list: parseList($, $('.module-card-item')) });
        }
        const out = [];
        $items.each(function (i, n) {
            const el = $items.eq(i);
            const $a = el.find('.video-info-header a');
            const href = attrOf($a, 'href');
            const title = attrOf($a, 'title');
            const pic = picOf(el);
            const remark = ownTextJoin(el.find('.video-info-header a.video-serial'));
            if (href) out.push(vod(href, title, pic, remark));
        });
        return JSON.stringify({ list: out });
    } catch (e) {
        log('[FishCloud] search: ' + e);
        return JSON.stringify({ list: [] });
    }
}

/** $host$6c1ebb3cb60973b4：detailContent。 */
function detailContent(list) {
    const id = str(list[0]);
    const html = siteGet(id, headers());
    const v = vod(id, '', '', '');
    try {
        const $ = cheerio.load(str(html));
        // 新模板
        v.vod_name = ownTextJoin($('.video-info-header > .page-title'));
        v.vod_pic = picOf($.root());
        const $tagLink = $('.video-info-header a.tag-link');
        if ($tagLink.length) v.vod_area = ownText($tagLink.last());
        v.vod_type = ownTextList($('.video-info-header div.tag-link a')).join(',');
        const nameEmpty = !v.vod_name;
        if (nameEmpty) {
            // 旧模板兜底
            v.vod_name = ownTextJoin($('.module-info-heading h1'));
            v.vod_year = ownTextJoin($('.module-info-tag a[href*="/year/"]'));
            v.vod_area = ownTextJoin($('.module-info-tag a[href*="/area/"]'));
            v.vod_type = ownTextList($('.module-info-tag a[href*="/class/"]')).join(',');
            v.vod_content = ownTextJoin($('.module-info-introduction-content'));
            $('.module-info-item').each(function (i, n) {
                const el = $('.module-info-item').eq(i);
                const title = ownTextJoin(el.find('.module-info-item-title'));
                const $content = el.find('.module-info-item-content');
                if (title.includes('导演')) v.vod_director = ownTextList($content.find('a')).join(',');
                else if (title.includes('主演')) v.vod_actor = ownTextList($content.find('a')).join(',');
                else if (title.includes('备注')) v.vod_remarks = ownTextJoin($content);
            });
        }
        // 盘链（data-clipboard-text）
        let links = clipList($('.module-row-text'));
        if (!links.length) links = clipList($('.down-card-copy[data-clipboard-text]'));
        for (let i = 0; i < links.length; i++) links[i] = str(links[i]).trim();
        const from = cloudFromUrls(links);
        v.vod_play_from = from.from;
        v.vod_play_url = from.url;
        // .video-info-item 二次填充（旧模板字段）
        $('.video-info-item').each(function (i, n) {
            const el = $('.video-info-item').eq(i);
            const $parent = el.parent();
            if (!$parent.length) return;
            const t = ownText($parent);
            if (t.includes('导演')) v.vod_director = ownTextList(el.find('a')).join(',');
            else if (t.includes('主演')) v.vod_actor = ownTextList(el.find('a')).join(',');
            else if (t.includes('年代')) {
                const $a = el.find('a').first();
                if ($a.length) v.vod_year = ownText($a).trim();
            } else if (t.includes('备注')) {
                v.vod_remarks = ownText(el).trim();
            } else if (t.includes('剧情')) {
                const $sq = el.find('.sqjj_a').first();
                if ($sq.length) v.vod_content = ownText($sq).replace('[收起部分]', '').trim();
            }
        });
    } catch (e) {
        log('[FishCloud] detail parse: ' + e);
        return JSON.stringify({ list: [] });
    }
    return JSON.stringify({ list: [v] });
}

export default {
    init(ext) {
        const raw = ext === undefined || ext === null ? '' : ext;
        const list = [];
        try {
            const o = typeof raw === 'object' ? raw : tryParse(String(raw));
            const arr = o && o.site;
            if (Array.isArray(arr)) {
                for (const s of arr) {
                    const t = trimSite(s);
                    if (t) list.push(t);
                }
            } else if (o && typeof o === 'object') {
                const t = trimSite(o.site);
                if (t) list.push(t);
            }
        } catch (e) {
            log('[FishCloud] init ext parse: ' + e);
        }
        siteInit(list);
        log('[FishCloud] init sites=' + sites.length + ' current=' + siteCurrent);
        return '';
    },

    home(filter) {
        return homeContent();
    },

    homeVod() {
        return '';
    },

    category(tid, pg, filter, extend) {
        return categoryContent(tid, pg, extend || {});
    },

    detail(id) {
        return detailContent([String(id)]);
    },

    search(key, quick, pg) {
        return searchContent(key, pg || '1');
    },

    play(flag, id, vipFlags) {
        // Cloud.playerContent：未识别播放 id 原样 return str（Java 同路径）
        return JSON.stringify(playData(flag, id, {}));
    },
};

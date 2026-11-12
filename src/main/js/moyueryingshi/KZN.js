/**
 * KZN.js — 4KZN 网盘书源站（JS 版，catvod JsSpider 协议）
 *
 * 移植自：kele/src/ysc/diy/摸鱼儿/readable_sources/com/github/catvod/spider/KZN.java
 * （extends Cloud；字符串已全部内联解码；private synthetic $host$* 方法 = 真实逻辑）。
 *
 * 站点：4kzn.cc（默认，ext 以 http 开头可覆盖域名，4kzn.com 一律规整到 4kzn.cc）。
 *  - home：4 分类（top250/dianying/juji/zuixin）+ /books/zuixin 首屏 list（g.z → {class,list}）；
 *  - category：/books/{tid}（翻页 /page/{n}），列表页含 "加载更多" 文本链接 → pagecount+1，
 *    g.o(page, pagecount, list.size, 0) → total/limit≤0 归整为 2147483647；
 *  - search：/page/{n}/?post_type=book&s={key}（URLEncoder UTF-8）；
 *  - detail：h1.site-name 名称 / .book-cover img（data-src‖src）封面 / .mt-n2 p 备注 /
 *    .content-wrap p 简介 / .site-go a[href] 收集全部非空链接（Java 中段域名校验为空体死分支，
 *    效果=全部收集）→ Cloud.a/b 网盘取流清单。
 *
 * 与 Java 版的差异（壳协议约束，逻辑不变）：
 *  - FishCrypto.beginHostEntry/endHostEntry、N1.d(vod)（混淆反射后处理）、
 *    AbstractC0280n1.p/q（行为埋点）直接丢弃；
 *  - Cloud 网盘取流 provider 层（Quark/Ali/UC/TianYi/YiDongYun/BaiDuPan/Pan123/
 *    XunleiPan/Pan115/GuangYa + 授权管理）不在本次 4 类移植范围：a(list)/b(list)
 *    等价于 Java 未配置网盘授权时 c(list) 空解析 → vod_play_from/url = ""；
 *  - jsoup → cheerio：R()/Q() → first()/each()；T()（ownText）→ 直接文本节点近似；
 *    "a:containsOwn(加载更多)" cheerio 不支持 → 手工遍历 a 的 own 文本判断；
 *  - 继承的 Cloud.playerContent（网盘取流播放）未移植 → 不导出 play。
 *
 * 宿主依赖：req/console；lib/cheerio.min.js。
 */

import cheerio from '../lib/cheerio.min.js';
import { httpGet, bodyOf, javaUrlEncode, vod, log } from './muCore.js';

// 模块级状态（Java 实例字段 r：站点根，init 可被 ext 覆盖）
let host = 'https://4kzn.cc';

const UA_122 = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36';

/** Java KZN.h()：请求头（仅 UA）。 */
function h() {
    return { 'User-Agent': UA_122 };
}

function get(url) {
    const res = httpGet(url, h());
    return bodyOf(res);
}

/** Element.ownText() 近似：直接文本节点合并 + 空白归并 trim。 */
function ownText(el) {
    if (!el || !el.length) return '';
    return el.contents().filter((i, n) => n && n.type === 'text').text().replace(/\s+/g, ' ').trim();
}

/** Java KZN.i(str)：trim + 去尾斜杠 + 4kzn.com → 4kzn.cc 域名规整。 */
function normalizeUrl(s) {
    if (!s) return '';
    let t = String(s).trim();
    while (t.endsWith('/')) t = t.substring(0, t.length - 1);
    return t.replace('https://4kzn.com', 'https://4kzn.cc').replace('http://4kzn.com', 'https://4kzn.cc');
}

/** jsoup "a:containsOwn(加载更多)"：存在 own 文本含关键字的 a 元素。 */
function hasContainsOwn($, text) {
    let found = false;
    $('a').each((i, el) => {
        if (found) return;
        if (ownText($(el)).indexOf(text) !== -1) found = true;
    });
    return found;
}

// —— Cloud.a(list)/b(list)：网盘取流清单（Java：a=e(c(list),true) / b=e(c(list),false)）——
// c(list) 逐链接按域名识别 quark/uc/ali/tianyi/yidong/baidu/pan123/guangya/xunlei/115
// 类型后交对应 provider 解析文件清单（PlayGroup.from=分组名 / PlayGroup.url=清单）。
// JS 未移植 provider 层 → 等价于 Java 未配置网盘授权时的空解析：分组恒空 → join 为 ""。
function cloudGroups(links) {
    return [];
}

function playFromOf(links) {
    try { return cloudGroups(links).map(g => g.from).join('$$$'); } catch (e) { return ''; }
}

function playUrlOf(links) {
    try { return cloudGroups(links).map(g => g.url).join('$$$'); } catch (e) { return ''; }
}

/** Java KZN.j(doc)：article → {id(href 规整去根), name(h3 a‖h3 ownText), pic(data-src‖src), remarks(h3+div‖.book-badge ownText)}。 */
function parseArticles($) {
    const out = [];
    $('article').each((i, article) => {
        try {
            const a = $(article).find("a[href*='/book/']").first();
            if (!a.length) return;
            let id = normalizeUrl(a.attr('href') || '');
            if (id.startsWith(host)) id = id.substring(host.length);
            const img = $(article).find('img').first();
            let pic = '';
            if (img.length) {
                pic = img.attr('data-src') || '';
                if (!pic) pic = img.attr('src') || '';
            }
            let nameEl = $(article).find('h3 a').first();
            if (!nameEl.length) nameEl = $(article).find('h3').first();
            const name = nameEl.length ? ownText(nameEl) : '';
            const badge = $(article).find('h3 + div, .book-badge').first();
            const remarks = badge.length ? ownText(badge) : '';
            if (id && name) out.push(vod(id, name, pic, remarks));
        } catch (e) { }
    });
    return out;
}

/** Java $host$1b26b551389a5dab：g.z(classes, j(/books/zuixin)) → {class, list}。 */
function homeContent() {
    const classes = [
        { type_id: 'top250', type_name: 'TOP250' },
        { type_id: 'dianying', type_name: '电影' },
        { type_id: 'juji', type_name: '剧集' },
        { type_id: 'zuixin', type_name: '影视' },
    ];
    const $ = cheerio.load(get(host + '/books/zuixin'));
    return JSON.stringify({ class: classes, list: parseArticles($) });
}

/** Java $host$f9d7235748f992e0：分类列表（加载更多 → pagecount+1；o(page,pagecount,size,0)）。 */
function categoryContent(tid, pg) {
    const page = parseInt(pg);
    if (isNaN(page)) throw new Error('page: ' + pg); // Java Integer.parseInt 抛错上抛壳
    let url = host + '/books/' + tid;
    if (page > 1) url = url + '/page/' + page;
    const $ = cheerio.load(get(url));
    const items = parseArticles($);
    const pagecount = hasContainsOwn($, '加载更多') ? page + 1 : page;
    return JSON.stringify({
        list: items,
        page: page > 0 ? page : 2147483647,
        pagecount: pagecount > 0 ? pagecount : 2147483647,
        limit: items.length > 0 ? items.length : 2147483647,
        total: 2147483647,
    });
}

/** Java k(str, str2)：搜索（a.next/加载更多查询为无消费死代码，省略）。 */
function searchContent(key, quick, pg) {
    const page = pg === undefined || pg === null || Number(pg) <= 1 ? '1' : String(pg);
    const url = host + '/page/' + page + '/?post_type=book&s=' + javaUrlEncode(key);
    const $ = cheerio.load(get(url));
    return JSON.stringify({ list: parseArticles($) });
}

/** Java $host$6c1ebb3cb60973b4：详情（.site-go a[href] 全部非空 href → 网盘清单）。 */
function detailContent(id) {
    const url = normalizeUrl(id.startsWith('http') ? id : host + id);
    const $ = cheerio.load(get(url));
    const v = { vod_id: String(id) };
    const nameEl = $('h1.site-name').first();
    if (nameEl.length) v.vod_name = ownText(nameEl);
    const cover = $('.book-cover img').first();
    if (cover.length) {
        let pic = cover.attr('data-src') || '';
        if (!pic) pic = cover.attr('src') || '';
        v.vod_pic = pic;
    }
    const rem = $('.mt-n2 p').first();
    if (rem.length) v.vod_remarks = ownText(rem);
    const desc = $('.content-wrap p').first();
    if (desc.length) v.vod_content = ownText(desc);
    const links = [];
    $('.site-go a[href]').each((i, el) => {
        const href = String($(el).attr('href') || '').trim();
        if (href) links.push(href); // Java 中段域名校验为空体死分支 → 全部非空 href 都收集
    });
    if (links.length > 0) {
        v.vod_play_url = playUrlOf(links);
        v.vod_play_from = playFromOf(links);
    }
    return JSON.stringify({ list: [v] });
}

export default {
    init(ext) {
        // Java super.init(context, str)（网盘授权装配，未移植）+ ext 域名覆盖
        const s = ext === null || ext === undefined ? '' : (typeof ext === 'string' ? ext : String(ext));
        if (s && s.startsWith('http')) {
            host = normalizeUrl(s);
        }
        log('init host=' + host);
        return '';
    },

    home(filter) {
        return homeContent();
    },

    category(tid, pg, filter, extend) {
        return categoryContent(String(tid), String(pg === undefined || pg === null ? 1 : pg));
    },

    detail(id) {
        return detailContent(String(id));
    },

    search(key, quick, pg) {
        // 2 参 → k(key, "1")；3 参 → k(key, pg)
        return searchContent(key, quick, pg);
    },
};

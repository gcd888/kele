/**
 * DianYingYunJi.js — 电影云集（JS 版，catvod JsSpider 协议）
 *
 * 移植自：kele/src/ysc/diy/摸鱼儿/readable_sources/com/github/catvod/spider/DianYingYunJi.java
 * （extends Cloud；字符串已全部内联解码；private synthetic $host$* 方法 = 真实逻辑）。
 *
 * 站点：dyyjv.com（WordPress 结构，jsoup 解析）。
 *  - home：8 分类（category/dianying、剧集、短剧、dongman、zongyi、读物、音频、xuexi 的
 *    URL-encoded 绝对地址）+ 首页 article list（g.z → {class,list}）；
 *  - category：tid 为分类 URL；pg≠"1" 追加 /page/{pg}；g.o(pg, pg+1, 20, (pg+1)*20)；
 *  - search：/?s={key}（翻页 /page/{n}/?s=）→ g.y(list)，异常 → {list:[]}；
 *  - detail：h1 标题（ownText）/ article img src‖data-src 封面 / article ownText 正则抽取
 *    导演/主演/地区/年份/剧情简介（截 500）/首个 a[href*='/category/'] 类型；
 *    article a[href] 按域分类收集（quark → aliyun/alipan → uc → baidu → 123pan 系 → 115 系
 *    → xunlei，去重）→ Cloud.a/b 网盘取流清单。
 *
 * 与 Java 版的差异（壳协议约束，逻辑不变）：
 *  - FishCrypto.beginHostEntry/endHostEntry、N1.d(vod)（混淆反射后处理）、
 *    AbstractC0280n1.p/q（行为埋点）直接丢弃；
 *  - Cloud 网盘取流 provider 层（Quark/Ali/UC/TianYi/YiDongYun/BaiDuPan/Pan123/
 *    XunleiPan/Pan115/GuangYa + 授权管理）不在本次 4 类移植范围：a(list)/b(list)
 *    等价于 Java 未配置网盘授权时 c(list) 空解析 → vod_play_from/url = ""；
 *  - jsoup → cheerio：R()/Q() → first()/each()；T()（ownText）→ 直接文本节点近似；
 *    Java Pattern（无 DOTALL/MULTILINE）→ JS 同语义正则（$ 为串尾、. 不跨行）；
 *  - 继承的 Cloud.playerContent（网盘取流播放）未移植 → 不导出 play。
 *
 * 宿主依赖：req/console；lib/cheerio.min.js。
 */

import cheerio from '../lib/cheerio.min.js';
import { httpGet, bodyOf, javaUrlEncode, vod, log } from './muCore.js';

const BASE = 'https://dyyjv.com';

const UA_122 = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36';

/** Java DianYingYunJi.h()：请求头（UA Chrome/122 + Referer）。 */
function h() {
    return {
        'User-Agent': UA_122,
        'Referer': BASE,
    };
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

/** Java i(str, Pattern)：首个匹配 group(1).trim()，超 200 截断；不匹配 → ""。 */
function extractInfo(text, re) {
    const m = re.exec(text);
    if (!m) return '';
    const g1 = String(m[1] || '').trim();
    return g1.length > 200 ? g1.substring(0, 200) : g1;
}

/** Java DianYingYunJi.j(doc)：article → vod(href, h2 a ownText, data-bg‖img src‖data-src, category‖time ownText)。 */
function parseArticles($) {
    const out = [];
    $('article').each((i, article) => {
        try {
            const h2a = $(article).find('h2 a').first();
            if (!h2a.length) return;
            const href = h2a.attr('href') || '';
            const title = ownText(h2a);
            if (!href || !title) return;
            let pic = '';
            const bg = $(article).find('a[data-bg]').first();
            if (bg.length) pic = bg.attr('data-bg') || '';
            if (!pic) {
                const img = $(article).find('img').first();
                if (img.length) {
                    pic = img.attr('src') || '';
                    if (!pic) pic = img.attr('data-src') || '';
                }
            }
            if (pic && !pic.startsWith('http')) pic = BASE + pic;
            let remarks = '';
            const cat = $(article).find("a[href*='/category/']").first();
            if (cat.length) remarks = ownText(cat);
            const time = $(article).find('time').first();
            if (time.length && !remarks) remarks = ownText(time);
            out.push(vod(href, title, pic, remarks));
        } catch (e) { }
    });
    return out;
}

/** Java $host$1b26b551389a5dab：g.z(classes, j(首页)) → {class, list}。 */
function homeContent() {
    const classes = [
        { type_id: 'https://dyyjv.com/category/dianying', type_name: '电影' },
        { type_id: 'https://dyyjv.com/category/%e5%89%a7%e9%9b%86', type_name: '剧集' },
        { type_id: 'https://dyyjv.com/category/%e7%9f%ad%e5%89%a7', type_name: '短剧' },
        { type_id: 'https://dyyjv.com/category/dongman', type_name: '动漫' },
        { type_id: 'https://dyyjv.com/category/zongyi', type_name: '综艺' },
        { type_id: 'https://dyyjv.com/category/%e8%af%bb%e7%89%a9', type_name: '读物' },
        { type_id: 'https://dyyjv.com/category/%e9%9f%b3%e9%a2%91', type_name: '音频' },
        { type_id: 'https://dyyjv.com/category/xuexi', type_name: '学习' },
    ];
    const $ = cheerio.load(get(BASE));
    return JSON.stringify({ class: classes, list: parseArticles($) });
}

/** Java $host$f9d7235748f992e0：pg≠"1" 追加 /page/{pg}；g.o(pg, pg+1, 20, (pg+1)*20)。 */
function categoryContent(tid, pg) {
    const pgStr = String(pg === undefined || pg === null ? 1 : pg);
    let url = String(tid);
    if (pgStr !== '1') url = url + '/page/' + pgStr;
    const $ = cheerio.load(get(url));
    const items = parseArticles($);
    const page = parseInt(pgStr);
    return JSON.stringify({
        list: items,
        page: page,
        pagecount: page + 1,
        limit: 20,
        total: (page + 1) * 20,
    });
}

/** Java k(str, str2)：/?s={enc}（翻页 /page/{n}/?s=）→ g.y(list)；异常 → {list:[]}。 */
function searchContent(key, quick, pg) {
    try {
        const pgStr = pg === undefined || pg === null || Number(pg) <= 1 ? '1' : String(pg);
        let url = BASE + '/?s=' + javaUrlEncode(key);
        if (pgStr !== '1') url = BASE + '/page/' + pgStr + '/?s=' + javaUrlEncode(key);
        const $ = cheerio.load(get(url));
        return JSON.stringify({ list: parseArticles($) });
    } catch (e) {
        log('[DianYingYunJi] search FAIL: ' + (e && e.message ? e.message : e));
        return JSON.stringify({ list: [] });
    }
}

/** Java $host$6c1ebb3cb60973b4：详情（ownText + 正则抽取 + 网盘链接收集）。 */
function detailContent(id) {
    const $ = cheerio.load(get(String(id)));
    const h1 = $('h1').first();
    const name = h1.length ? ownText(h1) : '';
    const img = $('article img').first();
    let pic = '';
    if (img.length) {
        pic = img.attr('src') || '';
        if (!pic) pic = img.attr('data-src') || '';
    }
    const article = $('article').first();
    const info = article.length ? ownText(article) : '';
    const director = extractInfo(info, /导演[：:\s]+(.*?)(?:\s+编剧|\s+主演|\s+类型|$)/);
    const actor = extractInfo(info, /主演[：:\s]+(.*?)(?:\s+类型|\s+制片|$)/);
    const area = extractInfo(info, /(?:制片国家\/地区|地区)[：:\s]+(.*?)(?:\s+语言|$)/);
    const year = extractInfo(info, /(?:首播|上映日期)[：:\s]+(.*?)(?:\s+片长|\(|$)/);
    let brief = extractInfo(info, /剧情简介(.*)/);
    if (brief.length > 500) brief = brief.substring(0, 500);
    const catEl = $("a[href*='/category/']").first();
    const typeName = catEl.length ? ownText(catEl) : '';
    // article a[href] 按域分类收集（顺序/去重与 Java else-if 链一致）
    const links = [];
    $('article a[href]').each((i, el) => {
        const href = $(el).attr('href') || '';
        if (!href) return; // Java：空 href 不落入任何分支，等价跳过
        if (href.indexOf('pan.quark.cn') !== -1 || /^https:\/\/pan\.quark\.cn\/s\/[^"]+$/.test(href)) {
            if (links.indexOf(href) === -1) links.push(href);
        } else if (href.indexOf('aliyundrive.com') !== -1 || href.indexOf('alipan.com') !== -1) {
            if (links.indexOf(href) === -1) links.push(href);
        } else if (href.indexOf('drive.uc.cn') !== -1) {
            if (links.indexOf(href) === -1) links.push(href);
        } else if (href.indexOf('pan.baidu.com') !== -1) {
            if (links.indexOf(href) === -1) links.push(href);
        } else if (href.indexOf('pan.xunlei.com') !== -1) {
            if (links.indexOf(href) === -1) links.push(href);
        } else {
            const lower = href.toLowerCase();
            if (lower.indexOf('123pan.com') !== -1 || lower.indexOf('123pan.cn') !== -1 || lower.indexOf('share.123pan.cn') !== -1
                || lower.indexOf('123684.com') !== -1 || lower.indexOf('123865.com') !== -1
                || lower.indexOf('123912.com') !== -1 || lower.indexOf('123592.com') !== -1) {
                if (links.indexOf(href) === -1) links.push(href);
            } else if (href.indexOf('115.com/s/') !== -1 || href.indexOf('115cdn.com/s/') !== -1) {
                if (links.indexOf(href) === -1) links.push(href);
            }
        }
    });
    // 组装（字段按 p001b.k 声明序输出；vod_pic 仅在命中 img 时出现，同 Java）
    const v = {};
    v.type_name = typeName;
    v.vod_id = String(id);
    v.vod_name = name;
    if (img.length) v.vod_pic = pic;
    v.vod_year = year;
    v.vod_area = area;
    v.vod_actor = actor;
    v.vod_director = director;
    v.vod_content = brief;
    v.vod_play_from = playFromOf(links);
    v.vod_play_url = playUrlOf(links);
    return JSON.stringify({ list: [v] });
}

export default {
    init(ext) {
        // Java super.init(context, str)（网盘授权装配，未移植）
        log('init');
        return '';
    },

    home(filter) {
        return homeContent();
    },

    category(tid, pg, filter, extend) {
        return categoryContent(tid, pg);
    },

    detail(id) {
        return detailContent(String(id));
    },

    search(key, quick, pg) {
        // 2 参 → k(key, "1")；3 参 → k(key, pg)
        return searchContent(key, quick, pg);
    },
};

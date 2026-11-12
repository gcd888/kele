/**
 * ShuangXing.js — 双星网盘站（JS 版，catvod JsSpider 协议）
 *
 * 移植自：kele/src/ysc/diy/摸鱼儿/readable_sources/com/github/catvod/spider/ShuangXing.java
 * （extends Cloud；字符串已全部内联解码；private synthetic $host$* 方法 = 真实逻辑）。
 *
 * 站点：1.star2.cn（HTML 字符串切片解析，不用 DOM 库——与 Java 逐行对齐）。
 *  - init：fetchCookie()（Java 用 followRedirects(false) 取首跳 Set-Cookie 并去 "secure"，
 *    拼接为会话 Cookie；JS 宿主 req 不支持 redirect 开关 → 取最终响应 Set-Cookie 尽力对齐）；
 *  - home：8 分类（ju/zy/mv/dm/rh/ym/wj/dj）+ 空 list（g.z → {class,list:[]}）；
 *  - category：/{tid}_{pg} → erx-list 字符串切片 → g.o(pg, 100, 20, size)（pagecount 固定 100）；
 *  - search：/search/?keyword={URLEncoder UTF-8} → erx-list 切片（忽略翻页）；
 *  - detail：/{id} 首个 <h1 …>…</h1> 切片标题（含 ">" 再截）；h() 收集 8 大网盘域 +
 *    123pan 系域名的 href="http 链接（去重）→ 进 vod_content（"资源id:{id}>>\n" 逐行）并交
 *    Cloud.a/b 网盘取流清单；异常/空页 → g.s(new k()) = {list:[{}]}。
 *
 * 与 Java 版的差异（壳协议约束，逻辑不变）：
 *  - FishCrypto.beginHostEntry/endHostEntry、N1.d(vod)（混淆反射后处理）、
 *    AbstractC0280n1.p/q（行为埋点）直接丢弃；
 *  - Cloud 网盘取流 provider 层（Quark/Ali/UC/TianYi/YiDongYun/BaiDuPan/Pan123/
 *    XunleiPan/Pan115/GuangYa + 授权管理）不在本次 4 类移植范围：a(list)/b(list)
 *    等价于 Java 未配置网盘授权时 c(list) 空解析 → vod_play_from/url = ""；
 *  - fetchCookie：followRedirects(false) 首跳取 Cookie → JS 宿主 req 恒跟随重定向，
 *    取最终响应的 set-cookie 头去 "secure" 后拼接（尽力对齐）；
 *  - 继承的 Cloud.playerContent（网盘取流播放）未移植 → 不导出 play。
 *
 * 宿主依赖：req/console。
 */

import { httpGet, bodyOf, javaUrlEncode, vod, log } from './muCore.js';

const BASE = 'https://1.star2.cn';

// 模块级状态（Java 实例字段 r：会话 Cookie）
let cookie = '';

/** Java ShuangXing.j()：请求头（UA Chrome/143 + Referer + Cookie）。 */
function j() {
    return {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/143.0.0.0 Safari/537.36',
        'Referer': BASE,
        'Cookie': cookie,
    };
}

function get(url) {
    const res = httpGet(url, j());
    return bodyOf(res);
}

/** Java ShuangXing.i() fetchCookie：GET 首页收 Set-Cookie，逐条去 "secure" 后拼接。 */
function fetchCookie() {
    try {
        const res = httpGet(BASE, j());
        const raw = (res && res.headers && (res.headers['set-cookie'] || res.headers['Set-Cookie'])) || '';
        const parts = String(raw).split('\n');
        let out = '';
        for (let i = 0; i < parts.length; i++) {
            if (!parts[i]) continue;
            out += parts[i].replace(/secure/g, '');
        }
        return out;
    } catch (e) {
        log('[ShuangXing] fetchCookie FAIL: ' + e);
        return '';
    }
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

/** Java ShuangXing.h(str)：href="http 切片，收集 8 大网盘域或 123pan 系域名的链接（去重保序）。 */
function collectPanLinks(html) {
    const PAN_DOMAINS = ['pan.quark.cn', 'pan.baidu.com', 'alipan.com', 'aliyundrive.com', 'drive.uc.cn', 'cloud.189.cn', '115.com', '115cdn.com'];
    const out = [];
    let pos = 0;
    for (;;) {
        const idx = html.indexOf('href="http', pos);
        if (idx === -1) break;
        const vStart = idx + 6;
        const vEnd = html.indexOf('"', vStart);
        if (vEnd === -1) break;
        const url = html.substring(vStart, vEnd);
        let hit = false;
        for (let d = 0; d < PAN_DOMAINS.length; d++) {
            if (url.indexOf(PAN_DOMAINS[d]) !== -1) { hit = true; break; }
        }
        if (!hit) {
            const lower = url.toLowerCase();
            hit = lower.indexOf('123pan.com') !== -1 || lower.indexOf('123pan.cn') !== -1
                || lower.indexOf('share.123pan.cn') !== -1 || lower.indexOf('123684.com') !== -1
                || lower.indexOf('123865.com') !== -1 || lower.indexOf('123912.com') !== -1
                || lower.indexOf('123592.com') !== -1;
        }
        if (hit && out.indexOf(url) === -1) out.push(url);
        pos = vEnd + 1;
    }
    return out;
}

/** Java ShuangXing.k(str)：erx-list 字符串切片 → vod(id=href, name=a 文本去【】, pic="", remarks=erx-num-font time)。 */
function parseErxList(html) {
    const out = [];
    const start = html.indexOf('<ul class="erx-list">');
    if (start === -1) return out;
    const end = html.indexOf('</ul>', start);
    if (end === -1) return out;
    const parts = html.substring(start, end).split('<li class="item');
    for (let i = 1; i < parts.length; i++) {
        const seg = parts[i];
        const aIdx = seg.indexOf('<a href="');
        if (aIdx === -1) continue;
        const hrefStart = aIdx + 9;
        const hrefEnd = seg.indexOf('"', hrefStart);
        if (hrefEnd === -1) continue;
        const href = seg.substring(hrefStart, hrefEnd);
        if (href.startsWith('http') || href.startsWith('javascript')) continue;
        const gt = seg.indexOf('>', hrefEnd);
        if (gt === -1) continue;
        const textStart = gt + 1;
        const aEnd = seg.indexOf('</a>', textStart);
        if (aEnd === -1) continue;
        let text = seg.substring(textStart, aEnd);
        for (;;) {
            const b1 = text.indexOf('【');
            if (b1 < 0) break;
            const b2 = text.indexOf('】', b1);
            if (b2 > b1) text = text.substring(0, b1) + text.substring(b2 + 1);
            else text = text.substring(0, b1);
        }
        text = text.trim();
        const tIdx = seg.indexOf('<span class="erx-num-font time">');
        let time = '';
        if (tIdx !== -1) {
            const gt2 = seg.indexOf('>', tIdx + 31);
            if (gt2 !== -1) {
                const spStart = gt2 + 1;
                const spEnd = seg.indexOf('</span>', spStart);
                if (spEnd !== -1) time = seg.substring(spStart, spEnd);
            }
        }
        if (text && href) out.push(vod(href, text, '', time));
    }
    return out;
}

/** Java $host$1b26b551389a5dab：g.z(classes, 空 list) → {class, list:[]}。 */
function homeContent() {
    const classes = [
        { type_id: 'ju', type_name: '双星国剧' },
        { type_id: 'zy', type_name: '双星综艺' },
        { type_id: 'mv', type_name: '双星电影' },
        { type_id: 'dm', type_name: '双星动漫' },
        { type_id: 'rh', type_name: '双星韩日' },
        { type_id: 'ym', type_name: '双星英美' },
        { type_id: 'wj', type_name: '双星外剧' },
        { type_id: 'dj', type_name: '双星短剧' },
    ];
    return JSON.stringify({ class: classes, list: [] });
}

/** Java $host$f9d7235748f992e0：/{tid}_{pg} → g.o(pg, 100, 20, size)；空页/异常 → g.y(空)。 */
function categoryContent(tid, pg) {
    try {
        const html = get(BASE + '/' + tid + '_' + pg);
        if (!html) return JSON.stringify({ list: [] });
        const items = parseErxList(html);
        return JSON.stringify({
            list: items,
            page: parseInt(pg),
            pagecount: 100,
            limit: 20,
            total: items.length,
        });
    } catch (e) {
        log('[ShuangXing] categoryContent FAIL: ' + (e && e.message ? e.message : e));
        return JSON.stringify({ list: [] });
    }
}

/** Java l(str)（两参/三参 searchContent 共用）：/search/?keyword= → g.y(切片)；忽略翻页。 */
function searchContent(key) {
    try {
        const html = get(BASE + '/search/?keyword=' + javaUrlEncode(key));
        if (!html) return JSON.stringify({ list: [] });
        return JSON.stringify({ list: parseErxList(html) });
    } catch (e) {
        log('[ShuangXing] search FAIL: ' + (e && e.message ? e.message : e));
        return JSON.stringify({ list: [] });
    }
}

/** Java $host$6c1ebb3cb60973b4：/{id} → h1 切片标题 + 网盘链接收集；空/异常 → {list:[{}]}。 */
function detailContent(id) {
    try {
        if (!id) return JSON.stringify({ list: [{}] }); // AbstractC0449a.b()
        const html = get(BASE + id);
        if (!html) return JSON.stringify({ list: [{}] });
        // 首个 <h1 …>…</h1> 切片（含 ">" 时截到其后）
        let title = '';
        const i1 = html.indexOf('<h1');
        if (i1 !== -1) {
            const i2 = html.indexOf('</h1>', i1);
            if (i2 !== -1) {
                title = html.substring(i1 + 3, i2);
                if (title.indexOf('>') !== -1) title = title.substring(title.indexOf('>') + 1);
            }
        }
        const links = collectPanLinks(html);
        const v = {};
        v.vod_id = String(id);
        v.vod_name = title;
        v.vod_pic = '';
        let content = '资源id:' + id + '>>\n';
        for (let i = 0; i < links.length; i++) content += links[i] + '\n';
        v.vod_content = content;
        if (links.length > 0) {
            v.vod_play_from = playFromOf(links);
            v.vod_play_url = playUrlOf(links);
        }
        return JSON.stringify({ list: [v] });
    } catch (e) {
        log('[ShuangXing] detailContent FAIL: ' + (e && e.message ? e.message : e));
        return JSON.stringify({ list: [{}] });
    }
}

export default {
    init(ext) {
        // Java super.init(context, str)（网盘授权装配，未移植）+ fetchCookie
        try {
            cookie = fetchCookie();
        } catch (e) {
            log('[ShuangXing] init FAIL: ' + e);
        }
        log('init cookieLen=' + cookie.length);
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
        // 两参/三参 searchContent 均走 l(key)，忽略 quick/pg
        return searchContent(key);
    },
};

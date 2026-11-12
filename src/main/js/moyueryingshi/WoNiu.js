/**
 * WoNiu.js — 蜗牛 I 4K（wn4k.com 社区站，catvod JsSpider 协议 JS 版）
 *
 * 移植自（1:1）：E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\readable_sources\com\github\catvod\spider\WoNiu.java
 *（extends Cloud，复用其 a/b 网盘线路组装；FishCrypto.beginHostEntry/endHostEntry 包装、Init.init(context) 丢弃）
 *
 * 移植差异（壳协议约束，逻辑不变）：
 *  - FishCrypto.b(str)/g(ext) 加解密包装 → 恒等透传（JS ext 直接按明文/JSON 解析）；
 *  - C0297t1 KV（woniu_cookie/woniu_username/woniu_password/woniu_auto_checkin/woniu_search_folder/
 *    woniu_extract_count）→ 壳 global local（缺省回退模块内存）；
 *  - android AlertDialog/InitOrigin 交互（账号登录弹窗、账号信息、签到开关等 action）→ 无法弹窗，
 *    action() 仍按 Java 返回 ""（设置分类列表照常输出，登录凭据可经 local KV 预置）；
 *  - Cloud.i() 自动签到（InitOrigin.execute 后台任务，runnable 已混淆不可读）→ no-op；
 *  - Cloud.a/b/c 网盘线路组装：分类/命名/开关判定保留，网盘驱动解析引擎（Quark/Ali/Pan123/…
 *    detailContentVodPlayFrom + CallableC0363l 转存链路）不在本文件移植范围 → 与 Java「网盘未授权」
 *    分支一致（PlayGroup 为空 → 线路为空），已知网盘类型 detail 报"请先完成网盘授权"；
 *  - X1.X/W 异常吞掉返回空串 → JS tryBody 同口径；okhttp 状态码 JS 宿主 req 不可得 → 按 0 处理；
 *  - N1.d(vod)/AbstractC0280n1.p/q 观看历史/片单记录 → 丢弃（壳侧无对应存储）；
 *  - jsoup → cheerio；org.json → JSON.parse + optStr/optInt 辅助；AbstractC0309x1 Base64(NO_WRAP)
 *    → lib/binutil.js；HashMap/LinkedHashMap → Map（保插入序）。
 *
 * 宿主依赖：req/joinUrl/local/console；lib/cheerio.min.js、lib/binutil.js、./muCore.js。
 */

import { httpGet, httpPost, bodyOf, headersOf, javaUrlEncode, vod, pageData, detailData, playData } from './muCore.js';
import { bytesToB64, b64ToBytes, utf8ToBytes } from '../lib/binutil.js';
import cheerio from '../lib/cheerio.min.js';

function log(...a) { try { console.log('[WoNiu]', ...a); } catch (e) { } }

// ============================ KV（C0297t1 → local） ============================

const __mem = {};
function kvGet(k) {
    try {
        if (typeof local !== 'undefined' && local && typeof local.get === 'function') {
            const v = local.get(k);
            return (v === undefined || v === null) ? '' : String(v);
        }
    } catch (e) { }
    return Object.prototype.hasOwnProperty.call(__mem, k) ? __mem[k] : '';
}
function kvSet(k, v) {
    const s = (v === undefined || v === null) ? '' : String(v);
    try {
        if (typeof local !== 'undefined' && local && typeof local.set === 'function') { local.set(k, s); return; }
    } catch (e) { }
    __mem[k] = s;
}
function kvDel(k) {
    try {
        if (typeof local !== 'undefined' && local && typeof local.delete === 'function') { local.delete(k); return; }
    } catch (e) { }
    delete __mem[k];
}

// ============================ org.json 辅助 ============================

function optStr(o, k, d) { const v = o ? o[k] : undefined; return (v === undefined || v === null || typeof v === 'object') ? (d === undefined ? '' : d) : String(v); }
function optInt(o, k, d) { const v = o ? o[k] : undefined; if (v === undefined || v === null) return d; const n = parseInt(v, 10); return isNaN(n) ? d : n; }
function tryParse(s) { try { return JSON.parse(s); } catch (e) { return null; } }

// ============================ HTTP（X1.X/W/N 语义：失败=空串/状态0） ============================

const UA_PC = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36';

function tryBody(url, headers, timeoutMs) {
    try { return bodyOf(httpGet(url, headers, timeoutMs)); } catch (e) { log('http fail:', String(url).substring(0, 100), e && e.message); return ''; }
}
/** POST 表单（X1.N FormBody），返回 {status, body, headers}（status JS 宿主不可得=0）。 */
function tryPost(url, body, headers) {
    const h = Object.assign({ 'Content-Type': 'application/x-www-form-urlencoded' }, headers || {});
    try { const res = httpPost(url, body, h); return { status: 0, body: bodyOf(res), headers: headersOf(res) }; }
    catch (e) { log('post fail:', String(url).substring(0, 100), e && e.message); return { status: 0, body: '', headers: {} }; }
}
/** 响应 set-cookie 采集（Java j(Map)：okhttp headers.toMultimap）。 */
function harvestSetCookies(headers) {
    const out = [];
    if (!headers) return out;
    for (const key of Object.keys(headers)) {
        if (String(key).toLowerCase() === 'set-cookie') {
            const v = headers[key];
            if (Array.isArray(v)) { for (const x of v) if (x) out.push(String(x)); }
            else if (v) out.push(...String(v).split('\n'));
        }
    }
    return out;
}
/** WoNiu.j(Map)：set-cookie → "k=v; k2=v2"（LinkedHashMap 保序）。 */
function cookieFromResponse(headers) {
    const map = new Map();
    for (const sc of harvestSetCookies(headers)) {
        const pair = String(sc).split(';', 2)[0].trim();
        const eq = pair.indexOf('=');
        if (eq > 0) map.set(pair.substring(0, eq).trim(), pair.substring(eq + 1).trim());
    }
    let out = '';
    for (const [k, v] of map) { if (out) out += '; '; out += k + '=' + v; }
    return out;
}

// ============================ merge 框架等价层（WoNiu/Gying/PanWebShare123 共用语义） ============================

// AbstractC0302v0.b1：网盘链接 → 类型键（10 类，判定顺序即 AbstractC0302v0.k 文件夹遍历序）
const PAN_ORDER = ['quark', 'uc', 'ali', 'tianyi', 'yidong', 'baidu', 'xunlei', '115', 'pan123', 'guangya'];
const PAN_DISPLAY = { quark: '夸克', uc: 'UC', ali: '阿里', tianyi: '天翼', yidong: '移动', baidu: '百度', xunlei: '迅雷', '115': '115', pan123: '123', guangya: '光鸭', magnet: '磁力', '123': '123' };

function panType(url) {
    if (!url) return '';
    const s = String(url).trim().toLowerCase();
    if (s.indexOf('pan.quark.cn') >= 0) return 'quark';
    if (s.indexOf('drive.uc.cn') >= 0) return 'uc';
    if (s.indexOf('aliyundrive.com') >= 0 || s.indexOf('alipan.com') >= 0) return 'ali';
    if (s.indexOf('cloud.189.cn') >= 0 || s.indexOf('cloud.189.com') >= 0) return 'tianyi';
    if (s.indexOf('yun.139') >= 0 || s.indexOf('caiyun.139.com') >= 0) return 'yidong';
    if (s.indexOf('pan.baidu.com') >= 0) return 'baidu';
    if (s.indexOf('pan.xunlei.com') >= 0) return 'xunlei';
    if (s.indexOf('115.com/s/') >= 0 || s.indexOf('115cdn.com/s/') >= 0) return '115';
    if ((s.indexOf('/s/') >= 0 || s.indexOf('/123pan/') >= 0) && (s.indexOf('123pan.com') >= 0 || s.indexOf('123pan.cn') >= 0 || s.indexOf('share.123pan.cn') >= 0 || s.indexOf('123684.com') >= 0 || s.indexOf('123865.com') >= 0 || s.indexOf('123912.com') >= 0 || s.indexOf('123592.com') >= 0 || /.*123\w{3}\.com\/(?:s|123pan)\/.*/.test(s))) return 'pan123';
    return s.indexOf('guangyapan.com/s/') >= 0 ? 'guangya' : '';
}
function panSupported(url) { return !!panType(url); }                                  // AbstractC0302v0.s0
function panDisplay(key) { return PAN_DISPLAY[key] || key || ''; }                      // Y0/c1（显示名重建自 p020x.c 表）
function panSwitchEnabled(key) { return true; }                                        // C0299u0.e0：存储键混淆不可读，按默认开启
/** AbstractC0244b1.l：类型键别名归一。 */
function panKeyNorm(key) {
    if (key === null || key === undefined) return '';
    const s = String(key).trim().toLowerCase();
    if (s === 'aliyundrive' || s === 'aliyun' || s === 'alipan') return 'ali';
    if (s === '189' || s === 'cloud189' || s === 'tianyiyun') return 'tianyi';
    if (s === '139' || s === 'mobile' || s === 'yidongcloud' || s === 'caiyun') return 'yidong';
    if (s === 'baiduyun' || s === 'baidupan') return 'baidu';
    if (s === '115pan' || s === 'a115') return '115';
    if (s === '123pan' || s === '123yun' || s === 'a123') return '123';
    if (s === 'guangya_pan' || s === 'guangyapan') return 'guangya';
    if (s === 'thunder' || s === 'xunleipan') return 'xunlei';
    if (s === 'bt' || s === 'cili' || s === 'magnetlink') return 'magnet';
    return s;
}
/** AbstractC0302v0.r0/M0（FishCrypto 常量不可读，按 Gying.J 可读等价实现）：磁力链判定。 */
function isMagnetUrl(url) {
    if (!url) return false;
    const s = String(url).trim().replace(/&amp;/g, '&').replace(/\s+/g, '');
    const lc = s.toLowerCase();
    return lc.indexOf('magnet:') === 0 && lc.indexOf('btih:') >= 0;
}
/** Gying.J：magnet → btih 40hex（小写），否则 ''。 */
function magnetHash(url) {
    if (!url) return '';
    let s = String(url).trim();
    if (s.toLowerCase().indexOf('magnet:') === 0) {
        const i = s.indexOf('btih:');
        if (i >= 0) {
            const from = i + 5;
            const amp = s.indexOf('&', i);
            s = amp >= 0 ? s.substring(from, amp) : s.substring(from);
        }
    }
    return /^[0-9a-f]{40}$/i.test(s) ? s.toLowerCase() : '';
}

// ---- Base64（AbstractC0309x1.c/b，NO_WRAP） ----
function b64EncUtf8(s) { return bytesToB64(utf8ToBytes(String(s))); }
function b64DecUtf8(s) { try { return bytesToUtf8(b64ToBytes(String(s))); } catch (e) { return ''; } }

// ---- AbstractC0244b1（网盘资源条目元信息/分组） ----
const RE_SIZE = /(\d+(?:\.\d+)?)\s*(TB|GB|MB|KB|T|G|M)\b/i;
const RE_DATE = /((?:19|20)\d{2})[-/.年](\d{1,2})[-/.月](\d{1,2})/;
const RE_DV = /(^|[\s._\-\[\]()【】])dv($|[\s._\-\[\]()【】])/i;
const RE_HDR = /(^|[\s._\-\[\]()【】])hdr($|[\s._\-\[\]()【】])/i;
const RE_CAM = /(^|[\s._\-\[\]()【】])(tc|ts|cam|trailer)($|[\s._\-\[\]()【】])/i;

function biEmpty(s) { return s === null || s === undefined || s.length === 0; }
function biPick(...arr) { for (const s of arr) { if (!biEmpty(s)) return String(s).trim(); } return ''; }
function biJoin(sep, arr) { let out = ''; for (let i = 0; i < arr.length; i++) { if (i > 0) out += sep; out += arr[i]; } return out; }
function biAdd(list, s) { if (biEmpty(s) || list.indexOf(s) >= 0) return; list.push(s); }
function biMeta(json) {
    if (!json) return '';
    return optStr(json, 'note') + ' ' + optStr(json, 'name') + ' ' + optStr(json, 'title') + ' ' + optStr(json, 'url') + ' ' + optStr(json, 'source');
}
function biTitle(limit, json) {
    if (!json) return '网盘资源';
    const t = biPick(optStr(json, 'note'), optStr(json, 'name'), optStr(json, 'title'), optStr(json, 'url')).replace(/\n/g, ' ').replace(/\r/g, ' ').trim().replace(/\s+/g, ' ');
    const s = biEmpty(t) ? '网盘资源' : t;
    return s.length > limit ? s.substring(0, Math.max(0, limit - 3)) + '...' : s;
}
function biPic(json) {
    if (!json) return '';
    const imgs = Array.isArray(json.images) ? json.images : null;
    if (!imgs) return '';
    for (const img of imgs) { const s = optStr({ v: img }, 'v').trim(); if (!biEmpty(s)) return s; }
    return '';
}
function biDate(json) {
    if (!json) return 0;
    const s = biPick(optStr(json, 'datetime'), optStr(json, 'date'), optStr(json, 'time'));
    if (biEmpty(s) || s.indexOf('0001-') === 0) return 0;
    const m = RE_DATE.exec(s);
    if (!m && /^(?:19|20)\d{2}$/.test(s)) return parseInt(s, 10) * 10000;
    if (!m) return optInt(json, '_timestamp', 0);
    return parseInt(m[3], 10) + parseInt(m[2], 10) * 100 + parseInt(m[1], 10) * 10000;
}
function biSizeScore(str) {
    const m = RE_SIZE.exec(str || '');
    if (!m) return 0;
    try {
        let d = parseFloat(m[1]);
        const u = m[2].toUpperCase();
        if (u.charAt(0) === 'T') return d * 1024;
        if (u.charAt(0) === 'G') return d;
        if (u.charAt(0) === 'M') return d / 1024;
        if (u.charAt(0) === 'K') return d / 1024 / 1024;
        return 0;
    } catch (e) { return 0; }
}
/** p020x.c.a（无 lookbehind 版）：标题内独立年份。 */
function findYear(s) {
    const re = /(?:19|20)\d{2}/g; const str = s || ''; let m;
    while ((m = re.exec(str)) !== null) {
        const st = m.index, en = st + m[0].length;
        if (st > 0 && /\d/.test(str.charAt(st - 1))) continue;
        if (en < str.length && /\d/.test(str.charAt(en))) continue;
        return m[0];
    }
    return '';
}
/** AbstractC0244b1.a：画质评分。 */
function biQuality(json) {
    let score = 0;
    const m = biMeta(json);
    const lc = m.toLowerCase();
    if (m.indexOf('杜比') >= 0 || lc.indexOf('dolby') >= 0 || lc.indexOf('dovi') >= 0) score += 120000;
    if (RE_DV.test(lc)) score += 100000;
    if (m.indexOf('高码') >= 0 || lc.indexOf('high bitrate') >= 0 || lc.indexOf('hbr') >= 0 || lc.indexOf('hq') >= 0) score += 90000;
    if (lc.indexOf('hdr10+') >= 0) score += 85000;
    else if (lc.indexOf('hdr10') >= 0) score += 80000;
    else if (RE_HDR.test(lc)) score += 75000;
    if (lc.indexOf('4k') >= 0 || lc.indexOf('2160p') >= 0 || lc.indexOf('2160') >= 0 || lc.indexOf('uhd') >= 0) score += 65000;
    if (m.indexOf('原盘') >= 0 || lc.indexOf('remux') >= 0 || lc.indexOf('bluray') >= 0 || lc.indexOf('blu-ray') >= 0 || lc.indexOf('bdmv') >= 0) score += 55000;
    if (lc.indexOf('60fps') >= 0 || m.indexOf('60帧') >= 0) score += 35000;
    if (lc.indexOf('1080p') >= 0 || lc.indexOf('1080') >= 0) score += 15000;
    if (lc.indexOf('web-dl') >= 0 || lc.indexOf('webdl') >= 0) score += 3000;
    const bad = ['枪版', '抢先', '预告', '花絮', '解说'];
    let penal = RE_CAM.test(lc);
    if (!penal) { for (const b of bad) { if (m.indexOf(b) >= 0) { penal = true; break; } } }
    return penal ? score - 1000000 : score;
}
/** Z0 比较器（质量/日期/体积/标题）。 */
function biCompare(a, b) {
    const qa = biQuality(b) - biQuality(a);
    if (qa !== 0) return qa;
    const da = biDate(b) - biDate(a);
    if (da !== 0) return da;
    const sa = biSizeScore(biMeta(b)) - biSizeScore(biMeta(a));
    if (sa !== 0) return sa;
    const ta = biTitle(160, a), tb = biTitle(160, b);
    return ta < tb ? -1 : (ta > tb ? 1 : 0);
}
function biSig(key, item) {
    if (!item) return '';
    const url = optStr(item, 'url').replace(/ /g, '').replace(/&amp;/g, '&');
    return biEmpty(url) ? '' : key + '|' + url;
}
/** AbstractC0244b1.i + C0241a1：按启用类型分组（exclude/include 过滤 + 去重 + 质量排序 + 截断）。 */
function biGrouping(json, cfg) {
    const groups = new Map();
    for (const key of cfg.keys) groups.set(key, []);
    const src = json || {};
    for (const rawKey of Object.keys(src)) {
        const key = panKeyNorm(rawKey);
        const list = groups.get(key);
        const items = src[rawKey];
        if (!list || !Array.isArray(items)) continue;
        const seenUrls = new Set();
        for (const item of items) {
            if (!item || typeof item !== 'object') continue;
            const lc = biMeta(item).toLowerCase();
            let blocked = false;
            for (const ex of cfg.exclude) { if (lc.indexOf(ex.toLowerCase()) >= 0) { blocked = true; break; } }
            if (blocked) continue;
            const sig = biSig(key, item);
            if (cfg.include.length) {
                let hit = false;
                for (const inc of cfg.include) { if (lc.indexOf(inc.toLowerCase()) >= 0) { hit = true; break; } }
                if (!hit || biEmpty(sig) || seenUrls.has(sig)) continue;
                seenUrls.add(sig);
                list.push(item);
            } else {
                if (biEmpty(sig)) continue;
                list.push(item);
            }
        }
    }
    const out = new Map();
    for (const [key, list] of groups) {
        if (list.length >= 2) list.sort(biCompare);
        while (cfg.max >= 0 && list.length > cfg.max) list.pop();
        out.set(key, list);
    }
    return out;
}

// ---- l0.l（fishps_detail@@ 包装协议） ----
const RE_LF_SIZE = /(?:(\d+(?:\.\d+)?)\s*(TB|GB|MB|KB|T|G|M))|(\d+(?:\.\d+)?)\s*(TB|GB|MB|KB|T|G|M)/i;
/** l.h：提取码优先级 password > url 参数 pwd/password/passcode。 */
function lfPassword(json) {
    const direct = optStr(json, 'password').trim();
    if (direct) return direct;
    const url = optStr(json, 'url');
    if (!url) return '';
    const lc = url.toLowerCase();
    const keys = ['pwd=', 'password=', 'passcode='];
    let hit = -1, key = '';
    for (const k of keys) { const i = lc.indexOf(k); if (i >= 0) { key = k; hit = i; break; } }
    if (hit < 0) return '';
    const rest = url.substring(key.length + hit);
    let len = rest.length;
    const amp = rest.indexOf('&');
    const hash = rest.indexOf('#');
    if (amp >= 0) len = Math.min(len, amp);
    if (hash >= 0) len = Math.min(len, hash);
    return rest.substring(0, len).trim();
}
/** l.d：详情文本拼装。 */
function lfDetailText(base, arr) {
    const sb = [];
    const line = (k, v) => { if (!biEmpty(v)) { sb.push(k + ': ' + String(v).trim()); } };
    line('标题', arr[1]);
    line('网盘', arr[3]);
    line('来源', arr[6]);
    const dt = arr[5];
    line('时间', (biEmpty(dt) || dt.indexOf('0001-') === 0) ? '' : String(dt).replace('T', ' ').replace('Z', '').trim());
    line('年份', arr[8]);
    line('提取码', arr[4]);
    line('链接', arr[0]);
    const trim = base === null || base === undefined ? '' : String(base).trim();
    if (!biEmpty(trim)) {
        if (sb.length > 0) sb.push('');
        sb.push('详情:\n' + trim);
    }
    return sb.join('\n');
}
/** l.e：备注 = 网盘名@来源 时间。 */
function lfRemark(typeName, src, datetime) {
    let sb = '';
    if (!biEmpty(typeName)) sb += typeName;
    const s2 = biEmpty(src) ? '' : src.trim();
    if (!biEmpty(s2)) { if (sb.length > 0) sb += '@'; sb += s2; }
    let date = '';
    if (!biEmpty(datetime) && datetime.indexOf('0001-') !== 0) {
        const ti = datetime.indexOf('T');
        if (ti > 0) date = datetime.substring(0, ti);
        else date = datetime.length >= 10 ? datetime.substring(0, 10) : datetime;
    }
    if (!biEmpty(date)) { if (sb.length > 0) sb += ' '; sb += date; }
    return sb;
}
/** l.f：网盘 JSON 条目 → fishps_detail@@vod。 */
function fishpsItem(typeKey, typeName, defSource, json) {
    const title = biTitle(150, json);
    let pic = biPic(json);
    if (biEmpty(pic)) pic = '';   // AbstractC0302v0.j(typeKey) 图标资源 JS 侧不可得
    let fid = '';
    const url = optStr(json, 'url').trim();
    const title2 = biTitle(150, json);
    if (!biEmpty(url) && !biEmpty(title2)) {
        try {
            const wrap = {
                url: url,
                title: title2,
                typeKey: typeKey,
                typeName: typeName,
                password: lfPassword(json),
                datetime: optStr(json, 'datetime'),
                source: optStr(json, 'source'),
                pic: biPic(json),
                year: findYear(title2),
            };
            fid = 'fishps_detail@@' + b64EncUtf8(JSON.stringify(wrap));
        } catch (e) { fid = ''; }
    }
    const metas = [];
    biAdd(metas, typeName);
    let dt = biPick(optStr(json, 'datetime'), optStr(json, 'date'), optStr(json, 'time'));
    if (biEmpty(dt) || dt.indexOf('0001-') === 0) dt = '';
    else {
        const m = RE_DATE.exec(dt);
        if (m) {
            let g2 = m[2], g3 = m[3];
            if (g2.length === 1) g2 = '0' + g2;
            if (g3.length === 1) g3 = '0' + g3;
            dt = m[1] + '-' + g2 + '-' + g3;
        } else if (dt.length > 10) dt = dt.substring(0, 10);
    }
    biAdd(metas, dt);
    const sizeStr = optStr(json, 'size') || biMeta(json);
    let sizeTxt = '';
    const sm = /(\d+(?:\.\d+)?)\s*(TB|GB|MB|KB|T|G|M)\b/i.exec(sizeStr);
    if (sm) {
        let u = sm[2].toUpperCase();
        if (u === 'T') u = 'TB';
        if (u === 'G') u = 'GB';
        if (u === 'M') u = 'MB';
        if (u === 'K') u = 'KB';
        sizeTxt = sm[1] + u;
    }
    biAdd(metas, sizeTxt);
    const lc = sizeStr.toLowerCase();
    const tags = [];
    if (sizeStr.indexOf('杜比') >= 0 || lc.indexOf('dolby') >= 0 || lc.indexOf('dovi') >= 0) tags.push('杜比');
    if (RE_DV.test(lc)) tags.push('DV');
    if (sizeStr.indexOf('高码') >= 0 || lc.indexOf('high bitrate') >= 0 || lc.indexOf('hbr') >= 0 || lc.indexOf('hq') >= 0) tags.push('高码');
    if (lc.indexOf('4k') >= 0 || lc.indexOf('2160p') >= 0 || lc.indexOf('2160') >= 0 || lc.indexOf('uhd') >= 0) tags.push('4K');
    if (lc.indexOf('hdr10+') >= 0) tags.push('HDR10+');
    else if (lc.indexOf('hdr10') >= 0) tags.push('HDR10');
    else if (RE_HDR.test(lc)) tags.push('HDR');
    if (sizeStr.indexOf('原盘') >= 0) tags.push('原盘');
    if (lc.indexOf('remux') >= 0) tags.push('REMUX');
    if (lc.indexOf('60fps') >= 0 || sizeStr.indexOf('60帧') >= 0) tags.push('60FPS');
    if (lc.indexOf('1080p') >= 0 || lc.indexOf('1080') >= 0) tags.push('1080P');
    if (lc.indexOf('web-dl') >= 0 || lc.indexOf('webdl') >= 0) tags.push('WEB-DL');
    biAdd(metas, tags.length ? biJoin('/', tags) : '');
    let source = optStr(json, 'source');
    if (biEmpty(source)) source = defSource;
    biAdd(metas, biEmpty(source) ? '' : source.replace('plugin:', '').replace('tg:', '').replace('channel:', ''));
    const remarks = biJoin(' · ', metas);
    const v = vod(biEmpty(fid) ? (json && json.url) || '' : fid, title, pic, remarks, { type_name: typeName });
    const y = findYear(title);
    if (!biEmpty(y)) v.vod_year = y;
    return v;
}
/** l.k：fishps_detail@@ → [url,title,typeKey,typeName,password,datetime,source,pic,year]。 */
function fishpsSplit(id) {
    if (biEmpty(id) || String(id).indexOf('fishps_detail@@') !== 0) return [String(id || ''), '', '', '', '', '', '', '', ''];
    try {
        const j = tryParse(b64DecUtf8(String(id).substring(15)));
        if (!j) return [String(id), '', '', '', '', '', '', '', ''];
        const url = optStr(j, 'url', String(id));
        return [biEmpty(url) ? String(id) : url, optStr(j, 'title'), optStr(j, 'typeKey'), optStr(j, 'typeName'), optStr(j, 'password'), optStr(j, 'datetime'), optStr(j, 'source'), optStr(j, 'pic'), optStr(j, 'year')];
    } catch (e) { return [String(id), '', '', '', '', '', '', '', '']; }
}
function lfArr(arr, i) { return (arr && arr.length > i && arr[i] !== null && arr[i] !== undefined) ? arr[i] : ''; }
/** l.b：把 fishps 元信息写入 vod。 */
function fishpsDecorate(v, arr, base) {
    const pic = lfArr(arr, 7);
    const type = lfArr(arr, 3);
    const year = lfArr(arr, 8);
    if (!biEmpty(pic)) v.vod_pic = pic;
    if (!biEmpty(type)) v.type_name = type;
    if (!biEmpty(year)) v.vod_year = year;
    const remark = lfRemark(type, lfArr(arr, 6), lfArr(arr, 5));
    if (!biEmpty(remark)) v.vod_remarks = remark;
    v.vod_content = lfDetailText(base, arr);
}
/** l.i：解析失败兜底 vod。 */
function fishpsFail(id, arr) {
    const v = { vod_id: String(id) };
    let name = lfArr(arr, 1);
    if (biEmpty(name)) name = '不支持的网盘类型';
    v.vod_name = name;
    if (biEmpty(lfArr(arr, 7))) v.vod_pic = '';
    const key = lfArr(arr, 2);
    const url = lfArr(arr, 0);
    let tip;
    if (key === 'guangya') tip = '当前仅支持复制链接到光鸭云盘APP打开，暂不支持在线播放';
    else if (biEmpty(url) || url.toLowerCase().indexOf('guangyapan.com/') < 0) tip = '请复制链接到对应APP打开';
    else tip = '当前仅支持复制链接到光鸭云盘APP打开，暂不支持在线播放';
    fishpsDecorate(v, arr, tip);
    return JSON.stringify({ code: 1, list: [v] });
}
/** l.j：detail 结果是否空列表。 */
function fishpsEmptyRes(res) {
    if (biEmpty(res)) return true;
    try {
        const arr = (tryParse(res) || {}).list;
        return !arr || arr.length === 0;
    } catch (e) { return false; }
}
/** l.c：用 fishps 元信息补丁原 detail 结果（FishCrypto.b 恒等透传）。 */
function fishpsPatch(res, arr) {
    if (biEmpty(lfArr(arr, 1)) && biEmpty(lfArr(arr, 3)) && biEmpty(lfArr(arr, 4)) && biEmpty(lfArr(arr, 5)) && biEmpty(lfArr(arr, 6)) && biEmpty(lfArr(arr, 7)) && biEmpty(lfArr(arr, 8))) return res;
    try {
        const j = tryParse(res);
        const list = j && j.list;
        const first = (list && list.length > 0) ? list[0] : null;
        if (first) {
            if (!biEmpty(lfArr(arr, 1))) first.vod_name = lfArr(arr, 1);
            if (!biEmpty(lfArr(arr, 7))) first.vod_pic = lfArr(arr, 7);
            if (!biEmpty(lfArr(arr, 3))) first.type_name = lfArr(arr, 3);
            if (!biEmpty(lfArr(arr, 8))) first.vod_year = lfArr(arr, 8);
            const remark = lfRemark(lfArr(arr, 3), lfArr(arr, 6), lfArr(arr, 5));
            if (!biEmpty(remark)) first.vod_remarks = remark;
            first.vod_content = lfDetailText(first.vod_content || '', arr);
            return JSON.stringify(j);
        }
    } catch (e) { }
    return res;
}

// ============================ Cloud 等价层（网盘线路组装/播放路由） ============================

/** Cloud.c(list)：分类+开关+命名保留；网盘驱动解析 JS 未移植 → 与未授权分支一致返回空线路。 */
function cloudPlayGroups(links) { return []; }
function cloudPlayFrom(links) { try { return cloudJoinGroups(cloudPlayGroups(links), true); } catch (e) { return ''; } }
function cloudPlayUrls(links) { try { return cloudJoinGroups(cloudPlayGroups(links), false); } catch (e) { return ''; } }
function cloudJoinGroups(groups, names) {
    const arr = [];
    for (const g of groups) arr.push(names ? g.name : g.url);
    return biJoin('$$$', arr);
}
function cloudFlagDriveType(flag) {
    // AbstractC0302v0.Z0(flag)：旗标前缀 → 网盘类型（C0253e1 表混淆，按 10 类型名/别名等价匹配）
    if (flag === null || flag === undefined) return '';
    let s = String(flag).trim();
    const i = s.indexOf('#');
    if (i >= 0) s = s.substring(0, i);
    if (!s) return '';
    const lc = s.toLowerCase();
    const table = { quark: 'quark', 夸克: 'quark', uc: 'uc', ali: 'ali', 阿里: 'ali', 阿里云盘: 'ali', tianyi: 'tianyi', 天翼: 'tianyi', '189': 'tianyi', yidong: 'yidong', 移动: 'yidong', '139': 'yidong', baidu: 'baidu', 百度: 'baidu', xunlei: 'xunlei', 迅雷: 'xunlei', '115': '115', pan123: 'pan123', '123': 'pan123', guangya: 'guangya', 光鸭: 'guangya' };
    for (const k of Object.keys(table)) {
        if (lc === String(k).toLowerCase()) return table[k];
        if (String(k).search(/[a-z0-9]/i) !== 0 && s.indexOf(String(k)) === 0) return table[k];
    }
    return '';
}
/** Cloud.$host$6c1ebb3cb60973b4：网盘直链 detail（JS 无驱动 → 已知类型按未授权分支报错）。 */
function cloudDetail(list) {
    const links = (list || []).slice();
    if (links.length > 1) {
        const groups = cloudPlayGroups(links);
        if (!groups.length) return JSON.stringify({ list: [], msg: 'No available cloud source' });
        const v = vod('', '', '', '');
        v.vod_play_from = cloudJoinGroups(groups, true);
        v.vod_play_url = cloudJoinGroups(groups, false);
        return JSON.stringify({ code: 1, list: [v] });
    }
    if (!links.length || biEmpty(links[0])) return JSON.stringify({ list: [], msg: '不支持的网盘类型' });
    const key = panType(links[0]);
    if (!key) return JSON.stringify({ list: [], msg: '不支持的网盘类型' });
    return JSON.stringify({ list: [], msg: '请先完成网盘授权' });
}
/** Cloud.playerContent：JS 无驱动 → 已知网盘旗标按未授权报错；其余按直链兜底（Java 反编译
 *  return str 疑为 jadx 变量混淆，直链语义应为返回播放 id，按 str2 实现）。 */
function cloudPlayerContent(flag, id) {
    const drive = cloudFlagDriveType(flag);
    if (drive) return JSON.stringify({ list: [], msg: '请先完成网盘授权' });
    return JSON.stringify(playData(flag, id, {}));
}

// ============================ WoNiu 站点逻辑 ============================

const SITE_DEFAULT = 'https://wn4k.com';
const RE_DETAIL_ID = /\/voddetail\/(\d+)\//;
let siteUrl = SITE_DEFAULT;
let checkinTried = false;   // this.s
let loginTried = false;     // this.t
let reloginTried = false;   // this.u
const folderMap = new Map();   // static w：搜索文件夹 LRU 40

function getSavedCookie() { return kvGet('woniu_cookie').trim(); }
function saveCookie(str) {
    const s = String(str === null || str === undefined ? '' : str).trim();
    if (biEmpty(s)) kvDel('woniu_cookie');
    else kvSet('woniu_cookie', s);
}
function clearCookie() { kvDel('woniu_cookie'); }

/** r()：站点请求头（UA/Referer/Cookie）。 */
function siteHeaders() {
    const h = { 'User-Agent': UA_PC, 'Referer': siteUrl + '/' };
    const ck = getSavedCookie();
    if (!biEmpty(ck)) h['Cookie'] = ck;
    return h;
}
/** m(str)：GET + jsoup 解析。 */
function fetchDoc(path) {
    const html = tryBody(siteUrl + path, siteHeaders());
    return cheerio.load(html || '');
}
/** l()/s()：自动登录（凭据来自 local KV：woniu_username/woniu_password）。 */
function autoLogin() {
    if (!biEmpty(getSavedCookie())) return true;
    const user = kvGet('woniu_username');
    const pwd = kvGet('woniu_password');
    if (biEmpty(user) || biEmpty(pwd)) return false;
    if (loginTried) return false;
    loginTried = true;
    return doLogin(user, pwd, false);
}
function doLogin(user, pwd, toast) {
    try {
        const body = 'user_name=' + javaUrlEncode(user) + '&user_pwd=' + javaUrlEncode(pwd);
        const res = tryPost(siteUrl + '/user/login.html', body, {
            'User-Agent': UA_PC,
            'Referer': siteUrl + '/user/login/',
            'Origin': siteUrl,
            'X-Requested-With': 'XMLHttpRequest',
            'Accept': 'application/json, text/javascript, */*; q=0.01',
        });
        const j = tryParse(res.body) || {};
        if (optInt(j, 'code', -1) !== 1) throw new Error(optStr(j, 'msg', '账号或密码错误'));
        const cookie = cookieFromResponse(res.headers);
        if (biEmpty(cookie)) throw new Error('登录成功但没有获得会话');
        saveCookie(cookie);
        kvSet('woniu_username', user);
        kvSet('woniu_password', pwd);
        checkinTried = false;
        loginTried = false;
        return true;
    } catch (e) {
        if (toast) log('蜗牛登录失败：' + (e && e.message ? e.message : e));
        return false;
    }
}
/** x()：锁盒重登录。 */
function reLogin() {
    if (biEmpty(kvGet('woniu_username')) || biEmpty(kvGet('woniu_password'))) return false;
    if (reloginTried) return false;
    reloginTried = true;
    loginTried = false;
    clearCookie();
    return autoLogin();
}
/** k(str)：登录感知 GET（/user/ 页保持 Java 重取条件）。 */
function fetchDocLoginAware(path) {
    autoLogin();
    const doc = fetchDoc(path);
    if (path.indexOf('/user/') === 0) {
        const needLogin = doc("form[action*='/user/login'], input[name=user_name] + input[name=user_pwd]").length > 0 || doc('title').first().text().indexOf('用户登录') >= 0;
        if (needLogin && reLogin()) return fetchDoc(path);
    }
    return doc;
}
/** u(doc, scope, base)：列表页视频卡片 → vod[]（去重保序）。scope=jsoup 根或 .video-section 元素。 */
function extractCards(doc, scope, base) {
    const out = [];
    const seen = new Set();
    const cards = scope && scope.length ? scope.find('a.video-card[href]') : doc('a.video-card[href]');
    cards.each(function () {
        const $el = doc(this);
        const href = ($el.attr('href') || '') + '';
        const m = RE_DETAIL_ID.exec(href);
        if (!m) return;
        const id = m[1];
        let title = ($el.attr('title') || '') + '';
        if (biEmpty(title)) title = $el.find('.video-title').first().text().trim();
        if (!biEmpty(title) && !seen.has(id)) {
            seen.add(id);
            const pic = absUrl(base, $el.find('img').first().attr('src') || '');
            out.push(vod(id, title, pic, $el.find('.video-episode').first().text().trim()));
        }
    });
    return out;
}
/** q(doc)：分页按钮含"下一页"。 */
function hasNextPage(doc) {
    let has = false;
    doc('a.page-btn[href]').each(function () {
        if (doc(this).text().indexOf('下一页') >= 0) has = true;
    });
    return has;
}
/** t(doc, label)：meta 项取值。 */
function metaValue(doc, label) {
    let out = '';
    doc('.meta-item').each(function () {
        const $el = doc(this);
        if ($el.find('.m-label').first().text().trim() === label) out = $el.find('.m-val').first().text().trim();
    });
    return out;
}
/** n(base, src)：图片绝对地址。 */
function absUrl(base, src) {
    if (biEmpty(src)) return src || '';
    if (String(src).indexOf('http') === 0) return src;
    if (String(src).indexOf('//') === 0) return 'https:' + src;
    return String(src).indexOf('/') === 0 ? base + src : base + '/' + src;
}
/** w(doc)：详情页网盘链接（去重保序）。 */
function extractPanLinks(doc) {
    const seen = new Set();
    const out = [];
    doc('a.pan-link-btn[href]').each(function () {
        const href = ((doc(this).attr('href') || '') + '').trim().replace(/&amp;/g, '&');
        if (panSupported(href) && !seen.has(href)) { seen.add(href); out.push(href); }
    });
    return out;
}
/** WoNiu.h：网盘链接 → 类型分组 JSON 条目。 */
function groupPanLink(groups, seen, url, note, pic) {
    const key = panType(url);
    if (biEmpty(key) || seen.has(url)) return;
    seen.add(url);
    try {
        const item = { url: url, note: note, source: '蜗牛 I 4K' };
        if (!biEmpty(pic)) item.images = [pic];
        let arr = groups.get(key);
        if (!arr) { arr = []; groups.set(key, arr); }
        arr.push(item);
    } catch (e) { }
}
/** WoNiu.p：搜索提取条数。 */
function extractCount() {
    try {
        const i = parseInt(kvGet('woniu_extract_count'), 10);
        if (isNaN(i) || i < 1 || i > 5) return 3;
        return i;
    } catch (e) { return 3; }
}
/** i()：进入首页自动签到（InitOrigin 后台任务 JS 侧不可复现）→ no-op。 */
function autoCheckin() { }

function parseIntSafe(s, dflt) {
    try { const n = parseInt(s, 10); return isNaN(n) ? dflt : n; } catch (e) { return dflt; }
}

// ---- home ----
function homeContent(filter) {
    try {
        autoCheckin();
        const classes = [];
        classes.push({ type_id: '1', type_name: '电影' });
        classes.push({ type_id: '2', type_name: '连续剧' });
        classes.push({ type_id: '3', type_name: '综艺' });
        classes.push({ type_id: '4', type_name: '动漫' });
        classes.push({ type_id: 'woniu_settings', type_name: '设置' });
        const doc = fetchDocLoginAware('/');
        const $sec = doc('.video-section').first();
        const list = extractCards(doc, $sec, siteUrl);
        return JSON.stringify({ class: classes, list: list });
    } catch (e) {
        log('home FAIL', e && e.message);
        return JSON.stringify({ class: [], list: [] });
    }
}

// ---- search ----
function searchContentP(key, quick, pageStr) {
    let page = parseIntSafe(pageStr, 1);
    if (page < 1) page = 1;
    try {
        const enc = javaUrlEncode(key);
        let path;
        if (page <= 1) path = '/vodsearch/-------------/?wd=' + enc;
        else path = '/vodsearch/' + enc.replace('+', '%20') + '----------' + page + '---/';
        const doc = fetchDocLoginAware(path);
        let list = extractCards(doc, null, siteUrl);
        const hasMore = hasNextPage(doc);
        const total = hasMore ? page * 24 + 1 : (page - 1) * 24 + list.length;
        if (!quick && kvGet('woniu_search_folder') !== '0') {
            const groups = new Map();
            const seen = new Set();
            const n = Math.min(list.length, extractCount());
            for (let i = 0; i < n; i++) {
                try {
                    const it = list[i];
                    const ddoc = fetchDocLoginAware('/voddetail/' + it.vod_id + '/');
                    let title = '';
                    const tEl = ddoc('.premium-title, .mobile-detail-title').first();
                    if (tEl.length) title = tEl.text().trim();
                    if (biEmpty(title)) title = it.vod_name;
                    const pic = absUrl(siteUrl, ddoc('.premium-poster img').first().attr('src') || '');
                    for (const link of extractPanLinks(ddoc)) groupPanLink(groups, seen, link, title, pic);
                } catch (e) { }
            }
            const folderVods = [];
            const ts = Date.now();
            for (const key of PAN_ORDER) {
                const arr = groups.get(key);
                if (arr && arr.length) {
                    const fid = 'woniu_folder@@' + key + '@@' + ts;
                    if (folderMap.size >= 40) folderMap.delete(folderMap.keys().next().value);
                    folderMap.set(fid, arr.slice());
                    const disp = panDisplay(key);
                    folderVods.push(vod(fid, disp + ' (' + arr.length + '个)', '', disp, { vod_tag: 'folder' }));
                }
            }
            if (folderVods.length) list = folderVods;
        }
        return pageData(list, page, hasMore ? page + 1 : page, 24, total);
    } catch (e) {
        log('search FAIL', e && e.message);
        return pageData([], page, page, 24, 0);
    }
}

// ---- category ----
function categoryContent(tid, pg, filter, extend) {
    let page = parseIntSafe(pg, 1);
    if (page < 1) page = 1;
    try {
        if (tid === 'woniu_settings') {
            const user = kvGet('woniu_username');
            const hasCookie = !biEmpty(getSavedCookie());
            const status = hasCookie ? ('已保存会话' + (biEmpty(user) ? '' : ' · ' + user)) : '未登录';
            const items = [
                vod('woniu_login', '账号登录', '', status + ' · ' + siteUrl, { action: 'woniu_login' }),
                vod('woniu_account', '账号信息', '', '资料、积分与签到状态', { action: 'woniu_account' }),
                vod('woniu_auto_checkin', '自动签到', '', (kvGet('woniu_auto_checkin') !== '0' ? '进入首页自动签到 · 已开启' : '进入首页自动签到 · 已关闭'), { action: 'woniu_auto_checkin' }),
                vod('woniu_search_display', '搜索展示', '', (kvGet('woniu_search_folder') !== '0' ? '网盘类型文件夹 · 完整搜索生效' : '原站列表'), { action: 'woniu_search_display' }),
                vod('woniu_extract_count', '提取数量', '', '解析前 ' + extractCount() + ' 条搜索结果 · 仅文件夹模式生效', { action: 'woniu_extract_count' }),
            ];
            return pageData(items, page, page, items.length, items.length);
        }
        if (tid.indexOf('woniu_folder@@') !== 0) {
            if (!/^[1-4]$/.test(tid)) return JSON.stringify({ list: [] });
            const path = page <= 1 ? '/vodtype/' + tid + '/' : '/vodtype/' + tid + '-' + page + '/';
            const doc = fetchDocLoginAware(path);
            const list = extractCards(doc, null, siteUrl);
            const hasMore = hasNextPage(doc);
            return pageData(list, page, hasMore ? page + 1 : page, 36, hasMore ? page * 36 + 1 : (page - 1) * 36 + list.length);
        }
        if (page !== 1) return JSON.stringify({ list: [] });
        let stored = folderMap.get(tid);
        stored = stored ? stored.slice() : null;
        const out = [];
        if (stored) {
            const sub = tid.substring(14);
            const at = sub.indexOf('@@');
            if (at > 0) {
                const key = sub.substring(0, at);
                const disp = panDisplay(key);
                for (const json of stored) out.push(fishpsItem(key, disp, '', json));
            }
        }
        return JSON.stringify({ list: out });
    } catch (e) {
        log('category FAIL', tid, e && e.message);
        return JSON.stringify({ list: [] });
    }
}

// ---- detail ----
function detailContent(list) {
    try {
        const id = (list && list.length) ? String(list[0]) : '';
        if (biEmpty(id)) return JSON.stringify({ code: 1, list: [{}] });
        if (id === 'woniu_login' || id === 'woniu_account' || id === 'woniu_auto_checkin' || id === 'woniu_search_display' || id === 'woniu_extract_count') {
            return '';   // Java 弹出交互窗，JS 返回 ""
        }
        if (id.indexOf('fishps_detail@@') === 0) {
            const arr = fishpsSplit(id);
            const url = lfArr(arr, 0);
            if (biEmpty(url)) return JSON.stringify({ list: [], msg: '资源无效' });
            const res = cloudDetail([url]);
            return fishpsEmptyRes(res) ? fishpsFail(id, arr) : fishpsPatch(res, arr);
        }
        if (!/^\d+$/.test(id)) return JSON.stringify({ code: 1, list: [{}] });
        let doc = fetchDocLoginAware('/voddetail/' + id + '/');
        const v = vod(id, '', '', '');
        const tEl = doc('.premium-title, .mobile-detail-title').first();
        v.vod_name = tEl.length ? tEl.text().trim() : '';
        v.vod_pic = absUrl(siteUrl, doc('.premium-poster img').first().attr('src') || '');
        v.vod_director = metaValue(doc, '导演');
        v.vod_actor = metaValue(doc, '主演');
        v.vod_remarks = metaValue(doc, '备注');
        const desc = doc('#detailDescText').first();
        v.vod_content = desc.length ? desc.text().trim() : '';
        const tags = doc('.premium-tags-top .p-tag:not(.score)');
        if (tags.length > 0) v.vod_year = doc(tags.get(0)).text().trim();
        if (tags.length > 1) v.vod_area = doc(tags.get(1)).text().trim();
        if (tags.length > 2) v.type_name = doc(tags.get(2)).text().trim();
        let links = extractPanLinks(doc);
        if (!links.length && doc('.pan-lock-box').length > 0 && reLogin()) {
            doc = fetchDocLoginAware('/voddetail/' + id + '/');
            links = extractPanLinks(doc);
        }
        if (links.length) {
            v.vod_play_url = cloudPlayUrls(links);
            v.vod_play_from = cloudPlayFrom(links);
        } else if (doc('.pan-lock-box').length > 0) {
            v.vod_remarks = '请在设置分类登录站点账号';
            v.vod_content = (v.vod_content || '') + '\n进入设置分类使用账号密码登录后即可读取网盘资源。';
        }
        return detailData(v);
    } catch (e) {
        log('detail FAIL', e && e.message);
        return JSON.stringify({ code: 1, list: [{}] });
    }
}

// ---- play ----
function playerContent(flag, id, vipFlags) {
    try {
        return cloudPlayerContent(flag, id);
    } catch (e) {
        log('play FAIL', e && e.message);
        return JSON.stringify({ list: [], msg: '播放失败：' + (e && e.message ? e.message : '') });
    }
}

// ---- action ----
function actionContent(action) {
    // Java：5 个 action 均弹 Android 交互窗（登录/账号/签到开关/搜索展示/提取数量），JS 无法弹窗 → ""
    try {
        if (action === 'woniu_login' || action === 'woniu_account' || action === 'woniu_auto_checkin' || action === 'woniu_search_display' || action === 'woniu_extract_count') return '';
        return '';
    } catch (e) { return ''; }
}

// ============================ 导出 ============================

export default {
    init(ext) {
        try {
            let str = ext === undefined || ext === null ? '' : (typeof ext === 'object' ? JSON.stringify(ext) : String(ext));
            siteUrl = SITE_DEFAULT;
            checkinTried = false;
            loginTried = false;
            reloginTried = false;
            let site = '';
            let trim = (str === null ? '' : str.trim());
            if (trim.indexOf('{') === 0) {
                const j = tryParse(trim);
                if (j && typeof j === 'object') {
                    const s = optStr(j, 'site').trim();
                    if (s.indexOf('https://') === 0 || s.indexOf('http://') === 0) {
                        site = s;
                        while (site.charAt(site.length - 1) === '/') site = site.substring(0, site.length - 1);
                    }
                }
            }
            if (!biEmpty(site)) siteUrl = site;
            log('init site=' + siteUrl);
        } catch (e) { log('init FAIL', e && e.message); }
        return '';
    },

    home(filter) { return homeContent(filter); },

    homeVod() { return ''; },

    category(tid, pg, filter, extend) { return categoryContent(tid, String(pg === undefined ? '1' : pg), filter, extend || {}); },

    detail(id) { return detailContent([String(id)]); },

    search(key, quick, pg) { return searchContentP(key, !!quick, String(pg === undefined ? '1' : pg)); },

    play(flag, id, vipFlags) { return playerContent(flag, id, vipFlags); },

    action(action) { return actionContent(action); },
};

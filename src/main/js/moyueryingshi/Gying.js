/**
 * Gying.js — 高 Ying 4K 资源聚合站（tutu.pm 生态，catvod JsSpider 协议 JS 版）
 *
 * 移植自（1:1）：E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\readable_sources\com\github\catvod\spider\Gying.java
 *（extends Cloud；FishCrypto.beginHostEntry/endHostEntry 包装、Init.init(context) 丢弃）
 *
 * 移植差异（壳协议约束，逻辑不变）：
 *  - FishCrypto.v("N1.*") 运行时解密常量不可读：磁力判定按可读的 Gying.J 字面量等价实现；
 *  - 站点探测/请求：okhttp CookieJar(Q) → 模块级 Map<origin/, cookie>；set-cookie 采集（h(N)）、
 *    browser_verified 剔除（P）照搬；okhttp 状态码 JS 宿主 req 不可得 → 不参与判定；
 *  - POW 验证（S）：BigInteger 平方取模 → JS BigInt 等价；X1.O POST 表单 {y=hex}；
 *  - init 双线程并行探测/详情（ExecutorService 2 线程）→ JS 同步环境串行执行（结果等价，仅时序）；
 *  - Cloud.a/b/c 网盘线路组装：分类/命名/开关保留；网盘驱动解析引擎（Quark/Ali/UC/… 转存链路）
 *    不在本文件移植范围 → 与 Java「网盘未授权」分支一致（PlayGroup 空 → panlist 线路为空），
 *    已知网盘类型 play/detail 报"请先完成网盘授权"；在线播放(playlist) 与磁力(playlist 内 magnet:)
 *    链路完整可用；downlist 磁力行经 G(name,list)：磁力云(i0/k0/l0=115/光鸭/迅雷)JS 未移植 →
 *    j0()=false → 按 Java 无磁力云分支返回空线路（C1()=纯磁力模式在无配置时为 true，
 *    该分支不依赖磁力云 → 保留：flag="磁力"、url="名$magnet:…"）；
 *  - AbstractC0302v0.X(flag,id) 特殊 scheme（xunlei-magnet-file:/光鸭私有 scheme）→ JS 不会产生该
 *    类 id，恒走后续分支；Gying.playerContent magnet/BT → {url,parse:0,jx:0}（D.b.f）；
 *  - C0261h0 设置交互（display/filter/order/reset/gying_set_cookie/gying_help）→ JS 无法弹窗，
 *    action() 按 Java 返回 ""（settings 分类列表照常输出）；.gying_config 只移植 Gying 用到的
 *    enabledTypes/include/exclude/maxPerType/folderMode 字段（URL 源管理字段属 FishPs 服务配置）；
 *  - N1.d(vod)/AbstractC0280n1.u/p/q 历史记录 → 丢弃；jsoup → cheerio；org.json → JSON.parse 辅助；
 *    IDN.toASCII：候选域名本就是 xn-- punycode → no-op；URLEncoder → javaUrlEncode。
 *
 * 宿主依赖：req/joinUrl/local/console；lib/cheerio.min.js、lib/binutil.js、./muCore.js。
 */

import { httpGet, httpPost, bodyOf, headersOf, javaUrlEncode, vod, pageData, detailData, playData } from './muCore.js';
import { bytesToB64, b64ToBytes, utf8ToBytes, bytesToUtf8 } from '../lib/binutil.js';
import cheerio from '../lib/cheerio.min.js';

function log(...a) { try { console.log('[Gying]', ...a); } catch (e) { } }

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
function optBool(o, k, d) { const v = o ? o[k] : undefined; if (v === undefined || v === null) return d; if (typeof v === 'boolean') return v; if (typeof v === 'number') return v !== 0; const s = String(v).toLowerCase(); if (s === 'true') return true; if (s === 'false') return false; return d; }
function tryParse(s) { try { return JSON.parse(s); } catch (e) { return null; } }

// ============================ HTTP（X1.W/y：失败=空串） ============================

const UA_MOBILE = 'Mozilla/5.0 (iPhone; CPU iPhone OS 18_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.5 Mobile/15E148 Safari/604.1';
const IMG_BASE = 'https://s.tutu.pm/img/';

function tryBody(url, headers, timeoutMs) {
    try { return bodyOf(httpGet(url, headers, timeoutMs)); } catch (e) { log('http fail:', String(url).substring(0, 100), e && e.message); return ''; }
}
function tryPost(url, body, headers) {
    const h = Object.assign({ 'Content-Type': 'application/x-www-form-urlencoded' }, headers || {});
    try { const res = httpPost(url, body, h); return { status: 0, body: bodyOf(res), headers: headersOf(res) }; }
    catch (e) { log('post fail:', String(url).substring(0, 100), e && e.message); return { status: 0, body: '', headers: {} }; }
}
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
function urlHost(url) {
    try {
        const m = /^[a-zA-Z][a-zA-Z0-9+.-]*:\/\/([^\/?#]+)/.exec(String(url));
        return m ? m[1] : '';
    } catch (e) { return ''; }
}
function urlOrigin(url) {
    const h = urlHost(url);
    if (!h) return '';
    const m = /^([a-zA-Z][a-zA-Z0-9+.-]*):\/\//.exec(String(url));
    return (m ? m[1].toLowerCase() : 'https') + '://' + h;
}

// ============================ CookieJar（Q B）+ 会话 Cookie ============================

const cookieJar = new Map();     // origin + '/' → "k=v; k2=v2"
const verifyCache = new Map();   // host → 上次验证通过时间戳（Gying.D）
let sessionCookie = '';          // this.s：本次会话 Cookie
let builtinCookie = '';          // this.t：ext 内置 Cookie
const gyingConfig = { keys: [], include: [], exclude: [], max: 0, folderMode: true, fRaw: [] };

function getSavedCookie() { return kvGet('gying_cookie').trim(); }
function jarClear() { cookieJar.clear(); verifyCache.clear(); }
function jarGet(url) { return cookieJar.get(urlOrigin(url) + '/') || ''; }
/** L(str, map)：cookie 串解析（剔除 path/domain/expires/... 属性，空值删除）。 */
function cookieParseInto(str, map) {
    if (biEmpty(str)) return;
    for (const part of String(str).split(';')) {
        const seg = part.trim();
        if (!seg) continue;
        const eq = seg.indexOf('=');
        if (eq <= 0) continue;
        const k = seg.substring(0, eq).trim();
        const v = seg.substring(eq + 1).trim();
        if (!k) continue;
        const lk = k.toLowerCase();
        if (lk === 'path' || lk === 'domain' || lk === 'expires' || lk === 'max-age' || lk === 'samesite' || lk === 'secure' || lk === 'httponly' || lk === 'priority') continue;
        if (!v) map.delete(k); else map.set(k, v);
    }
}
function cookieParse(str) { const map = new Map(); cookieParseInto(str, map); return map; }
function cookieJoin(map) {
    let out = '';
    for (const [k, v] of map) { if (biEmpty(k) || v === null || v === undefined) continue; if (out) out += '; '; out += k + '=' + v; }
    return out;
}
/** P(str, z2)：origin 预置 Cookie（z2=false 时剔除 browser_verified）。 */
function seedJar(origin, keepVerified) {
    let cookie = getSavedCookie();
    if (biEmpty(cookie)) cookie = sessionCookie;
    if (!biEmpty(cookie) && !keepVerified) {
        const lc = 'browser_verified';
        const parts = [];
        for (const seg of cookie.split(';')) {
            const s = seg.trim();
            if (!s) continue;
            const eq = s.indexOf('=');
            if (eq > 0 && s.substring(0, eq).trim().toLowerCase() !== lc) parts.push(s);
        }
        cookie = parts.join('; ');
    }
    if (!biEmpty(cookie)) cookieJar.set(origin + '/', cookie);
}
/** h(N)：响应 set-cookie 合并进会话/存储。 */
function harvestJar(resHeaders) {
    const setCookies = harvestSetCookies(resHeaders);
    if (!setCookies.length) return;
    let saved = getSavedCookie();
    if (biEmpty(saved)) saved = sessionCookie;
    const map = cookieParse(saved);
    for (const sc of setCookies) {
        if (biEmpty(sc)) continue;
        const first = String(sc).split(';')[0];
        cookieParseInto(first, map);
    }
    const merged = cookieJoin(map);
    if (biEmpty(merged)) return;
    if (!biEmpty(saved)) sessionCookie = merged;
    if (!biEmpty(getSavedCookie())) kvSet('gying_cookie', merged);
}
function withJar(url, headers) {
    const h = Object.assign({}, headers || {});
    if (!h['Cookie']) {
        const ck = jarGet(url);
        if (ck) h['Cookie'] = ck;
    }
    return h;
}

// ============================ merge 框架等价层（与 WoNiu.js 同源语义） ============================

const PAN_ORDER = ['quark', 'uc', 'ali', 'tianyi', 'yidong', 'baidu', 'xunlei', '115', 'pan123', 'guangya'];
const PAN_DISPLAY = { quark: '夸克', uc: 'UC', ali: '阿里', tianyi: '天翼', yidong: '移动', baidu: '百度', xunlei: '迅雷', '115': '115', pan123: '123', guangya: '光鸭', magnet: '磁力', '123': '123' };

function biEmpty(s) { return s === null || s === undefined || s.length === 0; }
function biPick(...arr) { for (const s of arr) { if (!biEmpty(s)) return String(s).trim(); } return ''; }
function biJoin(sep, arr) { let out = ''; for (let i = 0; i < arr.length; i++) { if (i > 0) out += sep; out += arr[i]; } return out; }
function biAdd(list, s) { if (biEmpty(s) || list.indexOf(s) >= 0) return; list.push(s); }
function biMeta(json) { if (!json) return ''; return optStr(json, 'note') + ' ' + optStr(json, 'name') + ' ' + optStr(json, 'title') + ' ' + optStr(json, 'url') + ' ' + optStr(json, 'source'); }
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
    for (const img of imgs) { const s = (img === undefined || img === null || typeof img === 'object') ? '' : String(img).trim(); if (!biEmpty(s)) return s; }
    return '';
}
const RE_DATE = /((?:19|20)\d{2})[-/.年](\d{1,2})[-/.月](\d{1,2})/;
const RE_DV = /(^|[\s._\-\[\]()【】])dv($|[\s._\-\[\]()【】])/i;
const RE_HDR = /(^|[\s._\-\[\]()【】])hdr($|[\s._\-\[\]()【】])/i;
const RE_CAM = /(^|[\s._\-\[\]()【】])(tc|ts|cam|trailer)($|[\s._\-\[\]()【】])/i;
const RE_SIZE_Q = /(\d+(?:\.\d+)?)\s*(TB|GB|MB|KB|T|G|M)\b/i;
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
    const m = RE_SIZE_Q.exec(str || '');
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
function isMagnetUrl(url) {
    if (!url) return false;
    const s = String(url).trim().replace(/&amp;/g, '&').replace(/\s+/g, '');
    const lc = s.toLowerCase();
    return lc.indexOf('magnet:') === 0 && lc.indexOf('btih:') >= 0;
}
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
function b64EncUtf8(s) { return bytesToB64(utf8ToBytes(String(s))); }
function b64DecUtf8(s) { try { return bytesToUtf8(b64ToBytes(String(s))); } catch (e) { return ''; } }

// ---- l0.l（fishps_detail@@ 包装协议） ----
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
function lfDetailText(base, arr) {
    const sb = [];
    const line = (k, v) => { if (!biEmpty(v)) sb.push(k + ': ' + String(v).trim()); };
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
function fishpsItem(typeKey, typeName, defSource, json) {
    const title = biTitle(150, json);
    let pic = biPic(json);
    if (biEmpty(pic)) pic = '';
    let fid = '';
    const url = optStr(json, 'url').trim();
    const title2 = biTitle(150, json);
    if (!biEmpty(url) && !biEmpty(title2)) {
        try {
            const wrap = {
                url: url, title: title2, typeKey: typeKey, typeName: typeName,
                password: lfPassword(json), datetime: optStr(json, 'datetime'),
                source: optStr(json, 'source'), pic: biPic(json), year: findYear(title2),
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
function fishpsFail(id, arr) {
    const v = { vod_id: String(id) };
    let name = lfArr(arr, 1);
    if (biEmpty(name)) name = '不支持的网盘类型';
    v.vod_name = name;
    const key = lfArr(arr, 2);
    const url = lfArr(arr, 0);
    let tip;
    if (key === 'guangya') tip = '当前仅支持复制链接到光鸭云盘APP打开，暂不支持在线播放';
    else if (biEmpty(url) || url.toLowerCase().indexOf('guangyapan.com/') < 0) tip = '请复制链接到对应APP打开';
    else tip = '当前仅支持复制链接到光鸭云盘APP打开，暂不支持在线播放';
    fishpsDecorate(v, arr, tip);
    return JSON.stringify({ code: 1, list: [v] });
}
function fishpsEmptyRes(res) {
    if (biEmpty(res)) return true;
    try {
        const arr = (tryParse(res) || {}).list;
        return !arr || arr.length === 0;
    } catch (e) { return false; }
}
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

// ---- Cloud 等价层 ----
function cloudPlayGroups(links) { return []; }
function cloudJoinGroups(groups, names) {
    const arr = [];
    for (const g of groups) arr.push(names ? g.name : g.url);
    return biJoin('$$$', arr);
}
function cloudFlagDriveType(flag) {
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
    if (!panType(links[0])) return JSON.stringify({ list: [], msg: '不支持的网盘类型' });
    return JSON.stringify({ list: [], msg: '请先完成网盘授权' });
}
function cloudPlayerContent(flag, id) {
    if (cloudFlagDriveType(flag)) return JSON.stringify({ list: [], msg: '请先完成网盘授权' });
    return JSON.stringify(playData(flag, id, {}));
}

// ============================ Gying 站点逻辑 ============================

const SITES = ['https://www.xn--kivn76b41nnhi.com', 'https://www.xn--10vr61a3xc5x3b.com', 'https://www.xn--74qz10cqsltibh40akss.com', 'https://www.xn--vcsx1ip8b8w4i.com', 'https://www.xn--wcv59z.com', 'https://www.xn--rhqp87dfoiv9a830g.com', 'https://www.xn--74qy8dk4drvg29x.com', 'https://www.xn--dpqv20e8ug6r8a.com'];
const HOT_MV = ['4K', '2026', '2025', '电影', '动作', '科幻', '喜剧', '热门', '最新'];
const HOT_TV = ['剧集', '美剧', '韩剧', '纪录片', '2026', '2025', '热门'];
const HOT_AC = ['动漫', '动画', '番剧', '2026', '2025'];
const PAN_TYPE_COUNT = 11;   // p020x.c.c.length

let siteUrl = '';            // this.r
let currentSite = SITES[0];  // static E
const metaCache = new Map(); // this.u：vod_id → [name, pic, remarks, year, content]
const folderGroups = new Map();   // static F：fishps@@id → JSON 条目数组

/** C()：移动端基础头。 */
function baseHeaders() {
    return {
        'User-Agent': UA_MOBILE,
        'Accept': 'text/html,application/xhtml+xml,application/json,text/plain,*/*',
        'accept-language': 'zh-CN,zh;q=0.9',
    };
}
/** B(url)：C() + Referer（IDN no-op，域名本为 punycode）。 */
function refHeaders(url) {
    const h = baseHeaders();
    h['Referer'] = url;
    return h;
}
/** D/E/G/H：站点安全/登录拦截判定。 */
function isSecBlocked(body) { return isSecFile(body) || isSecExpired(body) || isNoLogin(body); }   // D
function isNoLogin(body) { return !biEmpty(body) && (body.indexOf('nologin') >= 0 || body.indexOf('未登录') >= 0); }   // E
function isSecFile(body) {   // G
    if (biEmpty(body) || body.indexOf('_obj.') >= 0) return false;
    return body.indexOf('filejin') >= 0 || body.indexOf('pow.worker') >= 0 || body.indexOf('浏览器安全验证') >= 0;
}
function isSecExpired(body) {   // H
    if (biEmpty(body)) return false;
    const s = body.trim();
    if (s.indexOf('{') === 0) {
        const j = tryParse(s);
        if (j) {
            if (optInt(j, 'code', 0) === 419) return true;
            if (optInt(j, 'refresh', 0) === 1 && optStr(j, 'msg').indexOf('验证') >= 0) return true;
        }
    }
    return s.indexOf('浏览器验证已过期') >= 0 || s.indexOf('"code":419') >= 0;
}
function getCurrentSiteUrl() { return biEmpty(currentSite) ? SITES[0] : currentSite; }
function saveCookie(str) {
    const s = String(str === null || str === undefined ? '' : str).trim();
    if (biEmpty(s)) { kvDel('gying_cookie'); jarClear(); return; }
    kvSet('gying_cookie', s);
    jarClear();
}
function clearCookie() { kvDel('gying_cookie'); jarClear(); }

// ---- 磁力云开关（i0/k0/l0 依赖 115/光鸭/迅雷驱动，JS 未移植 → 无磁力云） ----
function magnetCloudEnabled() { return false; }   // j0()
function magnetOnlyMode() { return true; }        // C1()：无任何磁力云配置时为纯磁力模式

/** S(str)：/res/pow 工作量证明（BigInt 平方取模）。 */
function solvePow(str) {
    try {
        const challenge = tryParse(tryBody(str + '/res/pow', withJar(str + '/', refHeaders(str + '/')))) || {};
        const ns = optStr(challenge, 'N');
        const xs = optStr(challenge, 'x');
        const t = optInt(challenge, 't', 0);
        let answer = '';
        if (!biEmpty(ns) && !biEmpty(xs) && t >= 0 && t <= 2000000) {
            try {
                const N = BigInt('0x' + ns);
                let m = BigInt('0x' + xs);
                for (let i = 0; i < t; i++) m = (m * m) % N;
                answer = m.toString(16);
            } catch (e) { }
        }
        if (biEmpty(answer)) return false;
        const headers = refHeaders(str + '/');
        headers['Origin'] = str;
        const res = tryPost(str + '/res/pow', 'y=' + answer, withJar(str + '/', headers));
        const ok = optBool(tryParse(res.body) || {}, 'success', false);
        if (ok) harvestJar(res.headers);
        return ok;
    } catch (e) { return false; }
}
/** v(str)：站点预访问 + 验证缓存（3h）。 */
function previsit(str) {
    const origin = urlOrigin(str);
    if (biEmpty(origin)) return;
    seedJar(origin, true);
    const host = urlHost(origin);
    const now = Date.now();
    const prev = verifyCache.get(host);
    if (prev !== undefined && now - prev < 3000000) return;
    try {
        const res = httpGet(origin + '/', withJar(origin + '/', refHeaders(origin + '/')));
        harvestJar(headersOf(res));
        const body = bodyOf(res);
        if (biEmpty(body)) return;
        if (isSecFile(body) && !solvePow(origin)) { /* 不缓存 */ }
        else verifyCache.set(host, Date.now());
    } catch (e) { }
}
/** M(str)：验证失败重访（可触发 POW）。 */
function previsitRetry(str) {
    const origin = urlOrigin(str);
    if (biEmpty(origin)) return;
    seedJar(origin, false);
    const host = urlHost(origin);
    try {
        const res = httpGet(origin + '/', withJar(origin + '/', refHeaders(origin + '/')));
        harvestJar(headersOf(res));
        const body = bodyOf(res);
        if (biEmpty(body)) return;
        if (!isSecFile(body) || solvePow(origin)) verifyCache.set(host, Date.now());
    } catch (e) { }
}
/** y(url, headers)：GET（验证失败自动重访一次）。 */
function gFetch(url, headers) {
    if (url.indexOf('http') !== 0) return '';
    try {
        previsit(url);
        const body = tryBody(url, withJar(url, headers));
        if (!isSecFile(body) && !isSecExpired(body)) return body;
        verifyCache.delete(urlHost(urlOrigin(url)));
        previsitRetry(url);
        return tryBody(url, withJar(url, headers));
    } catch (e) { return ''; }
}

// ---- 站点元数据缓存（this.u / s(...)） ----
function metaPut(id, name, pic, remarks, year, content) {
    if (biEmpty(id)) return;
    metaCache.set(id, [name || '', pic || '', remarks || '', year || '', content || '']);
}
/** T(type, json)：suggest 条目 → vod（类型过滤）。 */
function suggestItem(type, json) {
    if (!json || typeof json !== 'object') return null;
    const id = optStr(json, 'id');
    const title = optStr(json, 'title');
    const dir = optStr(json, 'dir', 'mv');
    const year = optStr(json, 'year');
    if (!biEmpty(type) && type !== dir) return null;
    if ((dir !== 'mv' && dir !== 'tv' && dir !== 'ac') || biEmpty(id) || biEmpty(title)) return null;
    const pic = IMG_BASE + dir + '/' + id + '/256.webp';
    metaPut(dir + '/' + id, title, pic, year, year, '');
    return vod(dir + '/' + id, title, pic, year, { vod_year: year });
}
/** n(q, type, out)：/res/search_suggest。返回 {b: 拦截响应体或'', a: 是否成功}。 */
function suggestFetch(q, type, out) {
    try {
        const body = gFetch(siteUrl + '/res/search_suggest?q=' + q, refHeaders(siteUrl + '/'));
        if (isSecBlocked(body)) return { b: body, a: false };
        if (biEmpty(body) || body.trim().indexOf('[') !== 0) return { b: '', a: false };
        const arr = tryParse(body) || [];
        for (const item of arr) {
            const v = suggestItem(type, item);
            if (v) out.push(v);
        }
        return { b: '', a: true };
    } catch (e) { return { b: '', a: false }; }
}
/** w(html, key)：HTML 内嵌 _obj.<key>=<JSON> 提取（括号配平）。 */
function extractEmbedded(html, key) {
    const token = '_obj.' + key + '=';
    const start = html.indexOf(token);
    if (start < 0 || token.length + start >= html.length) return '{}';
    const c0 = html.charAt(token.length + start);
    let inStr = false, escaped = false, depth = 0;
    for (let i = token.length + start; i < html.length; i++) {
        const c = html.charAt(i);
        if (escaped) { escaped = false; }
        else if (c === '\\' && inStr) { escaped = true; }
        else if (c === '"') { inStr = !inStr; }
        else if (inStr) { continue; }
        else if (c === '{' || c === '[') { depth++; }
        else if ((c === '}' || c === ']') && (--depth === 0)) {
            return html.substring(token.length + start, i + 1);
        }
    }
    return c0 === '[' ? '[]' : '{}';
}
/** A(...)：首个非空串。 */
function firstNonEmpty(...arr) { return biPick(...arr); }
/** K(vod, body)：downurl 响应校验（code==200）。 */
function downurlValidate(v, body) {
    const fail = (msg) => { v.vod_remarks = msg; return null; };
    if (biEmpty(body) || isSecFile(body)) return fail('获取播放源失败：资源接口被安全验证拦截');
    if (isNoLogin(body)) return fail('获取播放源失败：未登录');
    try {
        const j = tryParse(body);
        if (j && optInt(j, 'code', 200) === 200) return j;
        return fail('获取播放源失败：' + optStr(j, 'msg', '接口返回异常'));
    } catch (e) { return fail('获取播放源失败：响应解析错误'); }
}
/** I(arr)：字符串数组 → 逗号串。 */
function joinStr(arr) {
    if (!Array.isArray(arr) || !arr.length) return '';
    let out = '';
    for (let i = 0; i < arr.length; i++) { if (i > 0) out += ','; out += optStr({ v: arr[i] }, 'v'); }
    return out;
}
/** O(name)：播放名清理（$→空格、#→空格、trim）。 */
function cleanPlayName(str) {
    if (biEmpty(str)) return '播放';
    return String(str).replace(/\$/g, ' ').replace(/#/g, ' ').trim();
}
/** p(hash, name)：magnet 直链构造。 */
function magnetUrl(hash, name) {
    let out = 'magnet:?xt=urn:btih:' + hash;
    if (biEmpty(name)) return out;
    try { out += '&dn=' + javaUrlEncode(name); } catch (e) { }
    return out;
}
/** z(obj)：panlist 平铺（同 host ≤3 条）。 */
function flattenPanList(obj) {
    const raw = [];
    const pushArr = (arr) => {
        if (!Array.isArray(arr)) return;
        for (const o of arr) {
            if (o && typeof o === 'object') {
                const u = firstNonEmpty(optStr(o, 'url'), optStr(o, 'u'), optStr(o, 'link'));
                if (!biEmpty(u)) raw.push(u);
            } else {
                const u = (o === undefined || o === null || typeof o === 'object') ? '' : String(o);
                if (!biEmpty(u)) raw.push(u);
            }
        }
    };
    if (Array.isArray(obj)) pushArr(obj);
    else if (obj && typeof obj === 'object') { pushArr(obj.url); pushArr(obj.list); pushArr(obj.urls); }
    const counts = {};
    const out = [];
    for (const u of raw) {
        let host = '';
        const i = u.indexOf('://');
        if (i >= 0) {
            const from = i + 3;
            let end = u.indexOf('/', from);
            if (end < 0) end = u.length;
            host = u.substring(from, end).toLowerCase();
        }
        if (biEmpty(host)) continue;
        const c = counts[host] || 0;
        if (c < 3) { counts[host] = c + 1; out.push(u); }
    }
    return out;
}
/** G(name, t0list)：downlist 磁力组（JS 无磁力云 → C1 纯磁力分支）。 */
function magnetGroup(name, t0list) {
    const seen = [];
    const items = [];
    for (const t0 of t0list || []) {
        if (t0 && !biEmpty(t0.b) && seen.indexOf(t0.b) < 0) { seen.push(t0.b); items.push(t0); }
    }
    if (!items.length) return { b: '', c: '' };
    if (magnetOnlyMode()) {
        const t1 = items[0];
        return { b: '磁力', c: t1.a + '$' + t1.b };
    }
    return { b: '', c: '' };   // 磁力云分支：j0()=false → 空线路
}
function addLine(flags, urls, name, url) {
    if (biEmpty(name) || biEmpty(url)) return;
    flags.push(name);
    urls.push(url);
}
/** k(list, ty, ids, titles, g)：inlist 条目 → vod[]。 */
function inlistToVods(list, ty, ids, titles, gs) {
    for (let i = 0; i < ids.length; i++) {
        const id = optStr({ v: ids[i] }, 'v');
        const title = optStr({ v: titles[i] }, 'v');
        if (biEmpty(id) || biEmpty(title)) continue;
        const gid = gs ? optStr({ v: gs[i] }, 'v') : '';
        const vid = ty + '/' + id;
        const pic = IMG_BASE + ty + '/' + id + '/256.webp';
        metaPut(vid, title, pic, gid, '', '');
        list.push(vod(vid, title, pic, gid));
    }
}
/** m(html, out)：搜索结果解析（_obj.search.l）。 */
function parseSearch(html, out) {
    if (biEmpty(html) || isSecFile(html) || isNoLogin(html)) return;
    try {
        const l = (tryParse(extractEmbedded(html, 'search')) || {}).l;
        if (!l || typeof l !== 'object') return;
        const ids = Array.isArray(l.i) ? l.i : null;
        const dirs = Array.isArray(l.d) ? l.d : null;
        const titles = Array.isArray(l.title) ? l.title : null;
        if (!ids || !dirs || !titles) return;
        const names = Array.isArray(l.name) ? l.name : null;
        const enames = Array.isArray(l.ename) ? l.ename : null;
        const years = Array.isArray(l.year) ? l.year : null;
        const infos = Array.isArray(l.info) ? l.info : null;
        for (let i = 0; i < ids.length; i++) {
            const id = optStr({ v: ids[i] }, 'v');
            const dir = optStr({ v: dirs[i] }, 'v');
            const name = firstNonEmpty(optStr({ v: titles[i] }, 'v'), names ? optStr({ v: names[i] }, 'v') : '');
            if (biEmpty(id) || biEmpty(name) || !(dir === 'mv' || dir === 'tv' || dir === 'ac')) continue;
            const year = years ? optStr({ v: years[i] }, 'v') : '';
            let info = infos ? optStr({ v: infos[i] }, 'v') : '';
            let remarks;
            if (biEmpty(year)) { if (info === null || info === undefined) info = ''; remarks = info; }
            else if (biEmpty(info)) remarks = year;
            else remarks = year + ' / ' + info;
            const vid = dir + '/' + id;
            const pic = IMG_BASE + dir + '/' + id + '/256.webp';
            const content = [names ? optStr({ v: names[i] }, 'v') : '', enames ? optStr({ v: enames[i] }, 'v') : '', infos ? optStr({ v: infos[i] }, 'v') : ''].filter(s => !biEmpty(s)).join('\n');
            metaPut(vid, name, pic, remarks, year, content);
            out.push(vod(vid, name, pic, remarks, { vod_year: year, vod_content: content }));
        }
    } catch (e) { }
}
/** x(tid, page)：热门关键词 suggest 兜底。 */
function hotFallback(tid, pageStr) {
    const out = [];
    const seen = new Set();
    const words = tid === 'tv' ? HOT_TV : (tid === 'ac' ? HOT_AC : HOT_MV);
    for (const w of words) {
        try {
            const arr = [];
            suggestFetch(javaUrlEncode(w), tid, arr);
            for (const v of arr) {
                if (v && !seen.has(v.vod_id)) { seen.add(v.vod_id); out.push(v); }
            }
        } catch (e) { }
    }
    let page = 1;
    try { page = Math.max(1, parseInt(pageStr, 10)); } catch (e) { }
    if (isNaN(page)) page = 1;
    const start = (page - 1) * 60;
    if (start >= out.length) return [];
    return out.slice(start, Math.min(start + 60, out.length));
}
/** q(key, items)：搜索结果前 12 条 → 网盘文件夹（.gying_config 分组）。 */
function searchFolders(key, items) {
    const json = {};
    const seen = new Set();
    const n = Math.min(items.length, 12);
    for (let i = 0; i < n; i++) {
        const it = items[i];
        if (!it || biEmpty(it.vod_id)) continue;
        const parts = String(it.vod_id).split('/');
        if (parts.length < 2) continue;
        const ty = parts[0], vid = parts[1];
        try {
            const down = downurlValidate({}, gFetch(siteUrl + '/res/downurl/' + ty + '/' + vid, refHeaders(siteUrl + '/' + ty + '/' + vid)));
            if (!down) continue;
            const meta = metaCache.get(it.vod_id);
            const pic = (!meta || biEmpty(meta[1])) ? IMG_BASE + ty + '/' + vid + '/256.webp' : meta[1];
            const note = it.vod_name || '';
            const dt = meta ? meta[2] : '';
            for (const link of flattenPanList(down.panlist)) {
                let key2 = panKeyNorm(panType(link));
                if (biEmpty(key2)) key2 = isMagnetUrl(link) ? 'magnet' : '';
                if (!biEmpty(key2)) groupAdd(json, seen, key2, link, note, pic, dt, note);
            }
            collectMagnets(json, seen, down.downlist, note, pic, dt);
        } catch (e) { }
    }
    const grouped = biGrouping(json, { keys: gyingConfig.keys, include: gyingConfig.include, exclude: gyingConfig.exclude, max: gyingConfig.max });
    const out = [];
    const ts = Date.now();
    for (const key8 of gyingConfig.fRaw) {
        const arr = grouped.get(key8);
        if (arr && arr.length) {
            const disp = PAN_DISPLAY[key8] || key8;
            const fid = 'fishps@@' + javaUrlEncode(key) + '@@' + key8 + '@@' + ts;
            folderGroups.set(fid, arr.slice());
            out.push(vod(fid, disp + ' (' + arr.length + '个)', '', disp, { vod_tag: 'folder' }));
        }
    }
    return out;
}
/** Gying.i(json, set, key, url, note, images, datetime, source)。 */
function groupAdd(json, seen, key, url, note, images, datetime, source) {
    if (biEmpty(key) || biEmpty(url)) return;
    const sig = key + '|' + url;
    if (!seen.add(sig)) return;
    if (!json[key]) json[key] = [];
    const item = { url: url, note: note, datetime: datetime, source: source };
    if (!biEmpty(images)) item.images = [images];
    json[key].push(item);
}
/** Gying.t：downlist → 磁力条目分组。 */
function collectMagnets(json, seen, downlist, note, images, source) {
    if (!downlist || typeof downlist !== 'object') return;
    const list = downlist.list;
    if (!list || typeof list !== 'object') return;
    const ms = Array.isArray(list.m) ? list.m : null;
    if (!ms) return;
    const ts = Array.isArray(list.t) ? list.t : null;
    const ss = Array.isArray(list.s) ? list.s : null;
    const ps = Array.isArray(list.p) ? list.p : null;
    for (let i = 0; i < ms.length && i < 80; i++) {
        const hash = magnetHash(optStr({ v: ms[i] }, 'v'));
        if (biEmpty(hash)) continue;
        const title = ts ? optStr({ v: ts[i] }, 'v') : '';
        const size = ss ? optStr({ v: ss[i] }, 'v') : '';
        const pub = ps ? optStr({ v: ps[i] }, 'v') : '';
        let sb = title;
        if (!biEmpty(size)) sb += ' [' + size + ']';
        if (!biEmpty(pub)) sb += ' ' + pub;
        const url = magnetUrl(hash, title);
        groupAdd(json, seen, 'magnet', url, cleanPlayName(sb), images, source, note);
    }
}
/** r(id, html, down)：详情 vod 组装。 */
function buildDetail(id, html, down) {
    const parts = String(id).split('/');
    const ty = parts.length > 0 ? parts[0] : 'mv';
    const vid = parts.length > 1 ? parts[1] : id;
    const v = vod(id, '', '', '');
    v.vod_pic = IMG_BASE + ty + '/' + vid + '/256.webp';
    const meta = metaCache.get(id);
    if (meta) {
        if (!biEmpty(meta[0])) v.vod_name = meta[0];
        if (!biEmpty(meta[1])) v.vod_pic = meta[1];
        if (!biEmpty(meta[2])) v.vod_remarks = meta[2];
        if (!biEmpty(meta[3])) v.vod_year = meta[3];
        if (!biEmpty(meta[4])) v.vod_content = meta[4];
    }
    let j = null;
    if (!biEmpty(html) && !isSecFile(html) && !isNoLogin(html)) {
        try {
            const j2 = tryParse(extractEmbedded(html, 'd'));
            if (j2 && Object.keys(j2).length !== 0) j = j2;
        } catch (e) { }
    }
    if (j) {
        v.vod_name = optStr(j, 'title');
        v.vod_pic = IMG_BASE + ty + '/' + vid + '/256.webp';
        v.vod_content = optStr(j, 'summary');
        v.vod_year = optStr(j, 'year');
        v.vod_area = joinStr(j.diqu);
        v.vod_actor = joinStr(j.zhuyan);
        v.vod_director = joinStr(j.daoyan);
    } else if (isSecFile(html) || isNoLogin(html)) {
        v.vod_content = '详情页被安全验证拦截，已改用资源接口加载播放项。';
    }
    if (biEmpty(v.vod_name)) v.vod_name = vid;
    const downJson = downurlValidate(v, down);
    if (!downJson) return v;
    const flags = [];
    const urls = [];
    try {
        const panlist = flattenPanList(downJson.panlist);
        if (panlist.length) addLine(flags, urls, cloudJoinGroups(cloudPlayGroups(panlist), true), cloudJoinGroups(cloudPlayGroups(panlist), false));
    } catch (e) { }
    const playlist = downJson.playlist;
    if (Array.isArray(playlist)) {
        const lines = [];
        for (let i = 0; i < playlist.length; i++) {
            const item = playlist[i];
            let name, url;
            if (item && typeof item === 'object') {
                name = firstNonEmpty(optStr(item, 'name'), optStr(item, 'title'), optStr(item, 't'), '播放' + (i + 1));
                url = firstNonEmpty(optStr(item, 'url'), optStr(item, 'u'), optStr(item, 'play'));
            } else {
                url = (item === undefined || item === null || typeof item === 'object') ? '' : String(item);
                name = '播放' + (i + 1);
            }
            if (!biEmpty(url) && (url.indexOf('http://') === 0 || url.indexOf('https://') === 0 || url.indexOf('magnet:') === 0)) {
                lines.push(cleanPlayName(name) + '$' + url);
            }
        }
        if (lines.length) addLine(flags, urls, '在线播放', biJoin('#', lines));
    }
    const downlist = downJson.downlist;
    if (downlist && typeof downlist === 'object' && downlist.list && typeof downlist.list === 'object') {
        const ms = Array.isArray(downlist.list.m) ? downlist.list.m : null;
        if (ms && ms.length !== 0) {
            const ts = Array.isArray(downlist.list.t) ? downlist.list.t : null;
            const ss = Array.isArray(downlist.list.s) ? downlist.list.s : null;
            const ps = Array.isArray(downlist.list.p) ? downlist.list.p : null;
            const t0s = [];
            for (let i = 0; i < ms.length && i < 80; i++) {
                const hash = magnetHash(optStr({ v: ms[i] }, 'v'));
                if (biEmpty(hash)) continue;
                let title = ts ? optStr({ v: ts[i] }, 'v') : '';
                if (biEmpty(title)) title = 'BT ' + (i + 1);
                const size = ss ? optStr({ v: ss[i] }, 'v') : '';
                const pub = ps ? optStr({ v: ps[i] }, 'v') : '';
                let sb = title;
                if (!biEmpty(size)) sb += ' [' + size + ']';
                if (!biEmpty(pub)) sb += ' ' + pub;
                t0s.push({ a: cleanPlayName(sb), b: magnetUrl(hash, title) });
            }
            const s0 = magnetGroup(v.vod_name, t0s);
            addLine(flags, urls, s0.b, s0.c);
        }
    }
    if (!flags.length) v.vod_remarks = '暂无可用播放源';
    else {
        v.vod_play_from = biJoin('$$$', flags);
        v.vod_play_url = biJoin('$$$', urls);
    }
    return v;
}
/** .gying_config 读取（p020x.b.o 子集）。 */
function loadConfig() {
    gyingConfig.fRaw = [];
    gyingConfig.keys = [];
    gyingConfig.include = [];
    gyingConfig.exclude = [];
    gyingConfig.max = 0;
    gyingConfig.folderMode = true;
    try {
        const raw = kvGet('.gying_config');
        if (!biEmpty(raw)) {
            const j = tryParse(raw);
            if (j) {
                gyingConfig.max = optInt(j, 'maxPerType', 0);
                gyingConfig.folderMode = optBool(j, 'folderMode', true);
                const fill = (key, target) => {
                    const arr = j[key];
                    if (Array.isArray(arr)) for (const s of arr) { const v = (s === undefined || s === null || typeof s === 'object') ? '' : String(s); if (!biEmpty(v)) target.push(v); }
                };
                fill('enabledTypes', gyingConfig.fRaw);
                fill('includeKeywords', gyingConfig.include);
                fill('excludeKeywords', gyingConfig.exclude);
            }
        }
    } catch (e) { }
    if (!gyingConfig.fRaw.length) {
        for (const pair of [['quark', '夸克'], ['uc', 'UC'], ['ali', '阿里'], ['115', '115'], ['123', '123'], ['baidu', '百度'], ['tianyi', '天翼'], ['yidong', '移动'], ['xunlei', '迅雷'], ['guangya', '光鸭'], ['magnet', '磁力']]) {
            gyingConfig.fRaw.push(pair[0]);
        }
    }
    if (gyingConfig.fRaw.indexOf('guangya') < 0 && gyingConfig.fRaw.length >= PAN_TYPE_COUNT - 2) gyingConfig.fRaw.push('guangya');
    if (gyingConfig.fRaw.indexOf('magnet') < 0 && gyingConfig.fRaw.length >= PAN_TYPE_COUNT - 1) gyingConfig.fRaw.push('magnet');
    gyingConfig.keys = [];
    for (const s of gyingConfig.fRaw) { const n = panKeyNorm(s); if (!biEmpty(n) && gyingConfig.keys.indexOf(n) < 0) gyingConfig.keys.push(n); }
    gyingConfig.include = gyingConfig.include.map(s => String(s).trim()).filter(s => !biEmpty(s));
    gyingConfig.exclude = gyingConfig.exclude.map(s => String(s).trim()).filter(s => !biEmpty(s));
    gyingConfig.max = gyingConfig.max <= 0 ? 2147483647 : gyingConfig.max;
}
/** order 显示（p020x.b.k）。 */
function orderDisplay() {
    const f = gyingConfig.fRaw;
    if (!f.length) return '未选择';
    let out = '';
    for (let i = 0; i < Math.min(f.length, 5); i++) {
        if (i > 0) out += '>';
        out += PAN_DISPLAY[f[i]] || f[i];
    }
    if (f.length > 5) out += '...';
    return out;
}
function isSettingAction(str) { return str === 'display' || str === 'filter' || str === 'order' || str === 'reset'; }

// ---- home ----
function homeContent(filter) {
    try {
        const classes = [
            { type_id: 'mv', type_name: '电影4K' },
            { type_id: 'tv', type_name: '剧集4K' },
            { type_id: 'ac', type_name: '动漫4K' },
            { type_id: 'settings', type_name: '设置' },
        ];
        const list = [];
        try {
            const html = gFetch(siteUrl + '/', baseHeaders());
            if (isSecBlocked(html)) {
                list.push(...noticeItems(isNoLogin(html) ? '网站需要登录' : '网站安全验证'));
            } else {
                const inlist = tryParse(extractEmbedded(html, 'inlist'));
                if (Array.isArray(inlist)) {
                    for (const obj of inlist) {
                        try {
                            if (!obj || typeof obj !== 'object') continue;
                            const ty = optStr(obj, 'ty');
                            const ids = Array.isArray(obj.i) ? obj.i : null;
                            const titles = Array.isArray(obj.t) ? obj.t : null;
                            const gs = Array.isArray(obj.g) ? obj.g : null;
                            if (ids && titles) inlistToVods(list, ty, ids, titles, gs);
                        } catch (e) { }
                    }
                }
            }
        } catch (e) { }
        if (!list.length) list.push(...hotFallback('mv', '1'));
        return JSON.stringify({ class: classes, list: list });
    } catch (e) {
        log('home FAIL', e && e.message);
        return JSON.stringify({ class: [], list: [] });
    }
}
/** o(msg)：拦截提示条目。 */
function noticeItems(msg) {
    const out = [];
    out.push(vod('gying_set_cookie', '登录配置', '', msg + ' · ' + getCurrentSiteUrl(), { action: 'gying_set_cookie' }));
    return out;
}

// ---- category ----
function categoryContent(tid, pg, filter, extend) {
    let page = NaN;
    try { page = Math.max(1, parseInt(pg, 10)); } catch (e) { }
    if (isNaN(page)) return '';   // Java Integer.parseInt 异常 → 外层 catch → null
    try {
        if (tid === 'settings') {
            let cookieDesc = biEmpty(sessionCookie) ? '未设置' : '已设置（点击重新输入）';
            if (!biEmpty(sessionCookie) && sessionCookie === builtinCookie) cookieDesc = '使用内置Cookie（点击覆盖）';
            const items = [
                vod('gying_set_cookie', '登录配置', '', cookieDesc + ' · ' + getCurrentSiteUrl(), { action: 'gying_set_cookie' }),
                vod('gying_help', '使用帮助', '', '如何获取Cookie', { action: 'gying_help' }),
                vod('display', '搜索展示', '', gyingConfig.folderMode ? '网盘类型文件夹' : '原站列表', { action: 'display' }),
                vod('filter', '网盘过滤', '', gyingConfig.keys.length + '/' + PAN_TYPE_COUNT + '个', { action: 'filter' }),
                vod('order', '网盘排序', '', orderDisplay(), { action: 'order' }),
                vod('reset', '恢复默认', '', '', { action: 'reset' }),
            ];
            return pageData(items, 1, 1, items.length, items.length);
        }
        if (tid.indexOf('fishps@@') === 0) {
            if (String(pg) !== '1') return JSON.stringify({ list: [] });
            const out = [];
            const arr = folderGroups.get(tid);
            if (arr) {
                const parts = tid.split('@@');
                const typeKey = parts.length > 2 ? parts[2] : '';
                const disp = PAN_DISPLAY[typeKey] || typeKey;
                for (const json of arr) out.push(fishpsItem(typeKey, disp, '', json));
            }
            return JSON.stringify({ list: out });
        }
        const list = [];
        const html = gFetch(siteUrl + '/res/' + tid + '?page=' + pg, refHeaders(siteUrl + '/'));
        if (isSecBlocked(html)) {
            list.push(...noticeItems(isNoLogin(html) ? '网站需要登录' : '网站安全验证'));
            return pageData(list, page, 1, 60, 60);
        }
        let pagecount;
        if (html.indexOf('{') === 0) {
            const j = tryParse(html);
            if (j) {
                pagecount = j.page && typeof j.page === 'object' ? optInt(j.page, 'pages', 0) : 0;
                if (!pagecount) pagecount = 0;
                const inlist = j.inlist;
                if (inlist && typeof inlist === 'object') {
                    const ids = Array.isArray(inlist.i) ? inlist.i : null;
                    const titles = Array.isArray(inlist.t) ? inlist.t : null;
                    const gs = Array.isArray(inlist.g) ? inlist.g : null;
                    if (ids && titles) inlistToVods(list, tid, ids, titles, gs);
                }
            } else {
                pagecount = 0;
            }
        } else {
            pagecount = 0;
        }
        if (!list.length) {
            list.push(...hotFallback(tid, String(pg)));
            pagecount = list.length >= 60 ? page + 1 : page;
        } else if (!pagecount) {
            // JSON 解析失败/缺 page.pages：Java catch → pagecount=1
            return pageData(list, page, 1, 60, 60);
        }
        return pageData(list, page, pagecount, 60, pagecount * 60);
    } catch (e) {
        log('category FAIL', tid, e && e.message);
        return '';
    }
}

// ---- search ----
function searchContentP(key, quick) {
    const list = [];
    if (biEmpty(key)) return JSON.stringify({ list: list });
    try {
        const enc = javaUrlEncode(key);
        let pending = '';
        if (!quick) {
            const body = gFetch(siteUrl + '/search?q=' + enc + '&type=&mode=1', refHeaders(siteUrl + '/'));
            if (isSecBlocked(body)) pending = body;
            else parseSearch(body, list);
        }
        if (!list.length) {
            const sug = suggestFetch(enc, null, list);
            if (!list.length && !biEmpty(sug.b)) {
                return JSON.stringify({ list: noticeItems(isNoLogin(sug.b) ? '网站需要登录' : '网站安全验证') });
            }
            if (!list.length && !sug.a && !biEmpty(pending)) {
                return JSON.stringify({ list: noticeItems(isNoLogin(pending) ? '网站需要登录' : '网站安全验证') });
            }
        }
        if (!quick && gyingConfig.folderMode && list.length) {
            const folders = searchFolders(key, list);
            if (folders.length) return JSON.stringify({ list: folders });
        }
    } catch (e) { }
    return JSON.stringify({ list: list });
}

// ---- detail ----
function detailContent(list) {
    try {
        const id = (list && list.length) ? String(list[0]) : '';
        if (biEmpty(id)) return JSON.stringify({ code: 1, list: [{}] });
        if (id.indexOf('gying_') === 0) return '';   // 设置弹窗
        if (isSettingAction(id)) return '';          // display/filter/order/reset 弹窗
        if (id.indexOf('fishps_detail@@') === 0) {
            const arr = fishpsSplit(id);
            const url = lfArr(arr, 0);
            if (biEmpty(url)) return JSON.stringify({ list: [], msg: '资源无效' });
            const res = cloudDetail([url]);
            return fishpsEmptyRes(res) ? fishpsFail(id, arr) : fishpsPatch(res, arr);
        }
        const parts = String(id).split('/');
        if (parts.length < 2) return JSON.stringify({ code: 1, list: [{}] });
        const ty = parts[0], vid = parts[1];
        try {
            const detailUrl = siteUrl + '/' + ty + '/' + vid;
            const downUrl = siteUrl + '/res/downurl/' + ty + '/' + vid;
            // Java 双线程并行；JS 同步环境串行（时序差异，结果等价）
            const html = gFetch(detailUrl, baseHeaders());
            const down = gFetch(downUrl, refHeaders(detailUrl));
            const v = buildDetail(id, html, down);
            return detailData(v);
        } catch (e) {
            return detailData(vod(id, vid, IMG_BASE + ty + '/' + vid + '/256.webp', '获取详情失败'));
        }
    } catch (e) {
        log('detail FAIL', e && e.message);
        return JSON.stringify({ code: 1, list: [{}] });
    }
}

// ---- play ----
function playerContent(flag, id, vipFlags) {
    try {
        if (!biEmpty(id) && (id.indexOf('magnet:') === 0 || (!biEmpty(flag) && flag.indexOf('BT') >= 0))) {
            return JSON.stringify({ url: id, parse: 0, jx: 0 });   // D.b.f(str2)
        }
        return cloudPlayerContent(flag, id);
    } catch (e) {
        log('play FAIL', e && e.message);
        return JSON.stringify({ list: [], msg: '播放失败：' + (e && e.message ? e.message : '') });
    }
}

// ---- action ----
function actionContent(action) {
    try {
        if (isSettingAction(action)) return '';       // C0261h0 弹窗
        if (action === 'gying_set_cookie' || action === 'gying_help') return '';
        return '';
    } catch (e) { return ''; }
}

// ============================ 导出 ============================

export default {
    init(ext) {
        try {
            let str = ext === undefined || ext === null ? '' : (typeof ext === 'object' ? JSON.stringify(ext) : String(ext));
            loadConfig();
            if (!biEmpty(str)) {
                try {
                    const ck = optStr(tryParse(str) || {}, 'cookie');
                    if (!biEmpty(ck)) builtinCookie = ck.trim();
                } catch (e) { builtinCookie = str.trim(); }
            }
            sessionCookie = builtinCookie;
            const saved = getSavedCookie();
            if (!biEmpty(saved)) sessionCookie = saved;
            jarClear();
            let candidates = [];
            if (biEmpty(str)) {
                candidates = SITES.slice(0, 8);
            } else {
                try {
                    const j = tryParse(str);
                    let arr = null;
                    if (j && typeof j === 'object') {
                        arr = Array.isArray(j.site) ? j.site : (Array.isArray(j.sites) ? j.sites : null);
                        if (!arr) {
                            const one = optStr(j, 'site', optStr(j, 'url', ''));
                            if (!biEmpty(one)) arr = [one];
                        }
                    }
                    if (arr && arr.length) candidates = arr.map(s => String(s));
                    else candidates = SITES.slice(0, 8);
                } catch (e) { candidates = SITES.slice(0, 8); }
            }
            let first = '';
            for (let i = 0; i < candidates.length; i++) {
                let cand = (candidates[i] === undefined || candidates[i] === null) ? '' : String(candidates[i]).trim();
                if (biEmpty(cand)) continue;
                while (cand.charAt(cand.length - 1) === '/') cand = cand.substring(0, cand.length - 1);
                if (first === '') first = cand;
                try {
                    const body = gFetch(cand + '/', refHeaders(cand + '/'));
                    if (!biEmpty(body) && !isSecFile(body) && body.indexOf('<title>404 Not Found</title>') < 0) {
                        siteUrl = cand;
                        break;
                    }
                } catch (e) { continue; }
            }
            if (biEmpty(siteUrl)) siteUrl = first;
            while (siteUrl.charAt(siteUrl.length - 1) === '/') siteUrl = siteUrl.substring(0, siteUrl.length - 1);
            if (!biEmpty(siteUrl)) currentSite = siteUrl;
            log('init site=' + siteUrl + ' cookie=' + (biEmpty(sessionCookie) ? 'no' : 'yes'));
        } catch (e) { log('init FAIL', e && e.message); }
        return '';
    },

    home(filter) { return homeContent(filter); },

    homeVod() { return ''; },

    category(tid, pg, filter, extend) { return categoryContent(tid, String(pg === undefined ? '1' : pg), filter, extend || {}); },

    detail(id) { return detailContent([String(id)]); },

    search(key, quick, pg) { return searchContentP(key, !!quick); },

    play(flag, id, vipFlags) { return playerContent(flag, id, vipFlags); },

    action(action) { return actionContent(action); },
};

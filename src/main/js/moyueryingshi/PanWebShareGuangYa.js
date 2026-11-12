/**
 * PanWebShareGuangYa.js — 光鸭社区（guangya.net）网盘分享聚合（JS 版，catvod JsSpider 协议）
 *
 * 移植自：E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\readable_sources\com\github\catvod\spider\PanWebShareGuangYa.java
 * （2082 行，XOR 混淆字符串已全部内联解码），1:1 移植主类逻辑：
 *   init 站点探测 + Cookie 优先级链（ext.cookie > ext.guangya_qsxy_cookie > KV(.diy_cookie) > KV(diy_cookie)，
 *   会话 Cookie 持久化 KV(panwebshareguangya_cookie)）；home 8 分类；category /category/{tid}[/page/N]；
 *   search /?s={key}[&paged=N]；btwaf_aes 解密挑战（AES/GCM 128 → CTR/OFB/CFB/CBC 回退）；登录墙检测；
 *   详情页 guangyapan.com 链接提取（含提取码附加）；评论解锁（表单收集 + zibll 滑块伪造 + admin-ajax 提交
 *   + 21 秒节流 + 最多 3 次 _gy_refresh 重试）；Cookie 合并（set-cookie / 过期 / max-age<=0 / 空值剔除）。
 *
 * 移植差异（壳协议/宿主约束，算法与流程不变）：
 *  - okhttp CookieJar（Q 类）→ 模块级 cookie Map 合并（V/c0 语义逐行对齐），无 host 隔离；
 *  - Thread.sleep(21000-x) 评论节流 → JS 宿主无阻塞休眠，节流改为显式提示"请等待 N 秒后重试"
 *    （Java 语义为等待后自动重试，JS 侧无法同步阻塞）；
 *  - W() 中 jsoup 隐藏容器重解析（处理转义 HTML）→ cheerio 二次 load outerHtml；
 *  - 详情 play 组装（Cloud.a/b → GuangYa SDK detailContentVodPlayFrom/Url）：GuangYa 网盘 SDK
 *    （C0342a0，96KB 深度反射混淆 + FishCrypto.v 加密端点）无法静态还原，按 PlayGroup 语义
 *    （每链接一线路）降级为 "光鸭" 单旗标 + "名$链接" 播放串；播放直链获取（C0342a0.W→D，
 *    OAuth device_code / 文件列表 / 直链 API）同样不可还原，play 显式返回失败说明；
 *  - AbstractC0302v0.W()/a0()（提示图标）→ data: 占位图；AbstractC0302v0.Y0("guangya") → "光鸭"。
 *
 * 宿主依赖：req/local/console；lib/cheerio.min.js、lib/crypto-js.js、lib/binutil.js。
 */

import '../lib/crypto-js.js';
import cheerio from '../lib/cheerio.min.js';
import { b64ToBytes, utf8ToBytes, bytesToUtf8 } from '../lib/binutil.js';
import { httpGet, httpPost, bodyOf, headersOf, javaUrlEncode, urlEncode, homeData, vod, pageData, detailData, playFail, log } from './muCore.js';

// ============================ 常量（Java static 块逐行对齐） ============================

const C = ['https://www.guangya.net/'];
const D = ['感谢分享，资源很棒！', '收藏了，谢谢分享！', '这个资源很需要，感谢！', '辛苦整理，支持一下！', '感谢楼主分享！', '资源不错，谢谢！'];
const E_PAT = /网页正在解密中|正在解密|btwaf_aes/i; // Pattern.compile(..., 2) = CASE_INSENSITIVE
const G_PAT = /(https?:\/\/[^\s"'<>]+)/gi;
const H_PAT = /((?:www\.)?guangyapan\.com\/s\/[^\s"'<>]+)/gi;
const I_PAT = /(?:提取码|访问码|密码|code)\s*[:：]?\s*([A-Za-z0-9]{4,8})/i;
const J_PAT = /\/(\d+)\.html(?:[?#].*)?$/i;
const REPLY_SELS = '[reply-show], .reply-show, .hide-post, .content-hide, .zib-hide, .hide-content, #hidden-box-comment, .tinymce-hide .hidden-box';
const UA = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36';
const PIC_HINT = 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAADUlEQVR42mNkYPhfDwAChwGA60e6kgAAAABJRU5ErkJggg==';

// ============================ 模块级状态（Java 实例字段） ============================

let extCfg = {};           // init 存档（ext 对象）
let site = C[0];           // this.w / F（volatile 当前站点，无尾斜杠）
let curCookie = '';        // this.x（volatile 当前 Cookie 串）
let cfgCookie = '';        // this.y（配置 Cookie）
let persistCookie = false; // this.A（会话 Cookie 是否落 KV）
let hasCfgCookie = false;  // this.B（配置是否带 Cookie）
let lastCommentAt = 0;     // this.z（上次自动评论时间戳）
let cookieJarInit = true;  // this.s
const cookieMap = {};      // CookieJar（Q 类）等价：name -> "name=value"

// ============================ 壳 KV（C0297t1 等价；壳 local 为对象 {get,set,delete}） ============================

function kvGet(key) {
    try { return local.get(String(key)) || ''; } catch (e) { return ''; }
}
function kvSet(key, val) {
    try { local.set(String(key), String(val)); } catch (e) { }
}
function kvDel(key) {
    try { local.delete(String(key)); } catch (e) { }
}

// ============================ 通用工具（Java 静态方法 1:1） ============================

/** Java TextUtils.isEmpty */
function isEmpty(s) {
    return s === undefined || s === null || String(s).length === 0;
}

/** D.b.g(str,1,0)：去尾 1 字符 */
function chop(s) {
    return String(s).substring(0, String(s).length - 1);
}

/** h0：去前导 '/' */
function h0(str) {
    let s = str === undefined || str === null ? '' : String(str);
    while (s.startsWith('/')) s = s.substring(1);
    return s;
}

/** D.b.k(strTrim, '\r', ' ', '\n', ' ')：多分隔符归一为单分隔符 */
function normalizeSep(s, s1, r1, s2, r2) {
    let out = String(s);
    let i;
    while ((i = out.indexOf(s1)) >= 0) out = out.substring(0, i) + r1 + out.substring(i + s1.length);
    while ((i = out.indexOf(s2)) >= 0) out = out.substring(0, i) + r2 + out.substring(i + s2.length);
    return out;
}

/** Y：Cookie 串规范化（{json} / cookie: 前缀 / \r\n 归一 "; "） */
function Y(str) {
    if (str === undefined || str === null) return '';
    let s = String(str).trim();
    if (isEmpty(s)) return '';
    if (s.startsWith('{')) {
        const zRes = z(s);
        if (!isEmpty(zRes)) return zRes;
    }
    if (s.toLowerCase().startsWith('cookie:')) s = s.substring(7).trim();
    return normalizeSep(s, '\r', ' ', '\n', ' ');
}

/** z：JSON 形式 Cookie 提取（guangya_qsxy_cookie / cookie 字段） */
function z(str) {
    try {
        if (isEmpty(str)) return '';
        const o = JSON.parse(str);
        let c = o['guangya_qsxy_cookie'] || '';
        if (isEmpty(c)) c = o['cookie'] || '';
        return Y(c);
    } catch (e) {
        return '';
    }
}

/** c0：Cookie 串解析进 map（剔除属性项；空值 = 删除） */
function c0(str, map) {
    if (isEmpty(str)) return;
    const parts = Y(str).split(';');
    for (const raw of parts) {
        const item = raw.trim();
        const idx = item.indexOf('=');
        if (idx > 0) {
            const name = item.substring(0, idx).trim();
            const value = item.substring(idx + 1).trim();
            if (!isEmpty(name)) {
                const lower = name.toLowerCase();
                if (lower !== 'path' && lower !== 'domain' && lower !== 'expires' && lower !== 'max-age' &&
                    lower !== 'samesite' && lower !== 'secure' && lower !== 'httponly' && lower !== 'priority') {
                    if (isEmpty(value)) {
                        delete map[name];
                    } else {
                        map[name] = name + '=' + value;
                    }
                }
            }
        }
    }
}

/** V：合并 Set-Cookie 列表（过期/max-age<=0/空值 → 删除）并序列化 */
function V(str, setCookies, baseUrl) {
    const map = {};
    c0(str, map);
    for (const sc of setCookies) {
        if (isEmpty(sc)) continue;
        const arr = String(sc).split(';');
        if (arr.length === 0) continue;
        const first = arr[0].trim();
        const eq = first.indexOf('=');
        if (eq <= 0) continue;
        const name = first.substring(0, eq).trim();
        let expired = false;
        // Cookie.parse 过期判断（expires 属性）+ max-age<=0
        for (let i = 1; i < arr.length; i++) {
            const attr = arr[i].trim();
            const aIdx = attr.indexOf('=');
            if (aIdx > 0) {
                const attrName = attr.substring(0, aIdx).trim().toLowerCase();
                if (attrName === 'max-age') {
                    try { expired = parseInt(attr.substring(aIdx + 1).trim(), 10) <= 0; } catch (e) { }
                } else if (attrName === 'expires') {
                    try {
                        const t = Date.parse(attr.substring(aIdx + 1).trim());
                        if (!isNaN(t)) expired = t <= Date.now();
                    } catch (e) { }
                }
            }
        }
        const value = first.substring(eq + 1).trim();
        if (expired || isEmpty(value)) {
            delete map[name];
        } else {
            map[name] = first;
        }
    }
    let out = '';
    for (const k of Object.keys(map)) {
        if (!isEmpty(k) && !isEmpty(map[k])) {
            if (out.length > 0) out += '; ';
            out += map[k];
        }
    }
    return out;
}

/** getSavedCookie / hasSavedCookie / saveCookie / clearCookie（KV 持久化） */
function getSavedCookie() {
    const y1 = Y(kvGet('panwebshareguangya_cookie'));
    return isEmpty(y1) ? Y(kvGet('.panwebshareguangya_cookie')) : y1;
}
function hasSavedCookie() {
    return !isEmpty(getSavedCookie());
}
function saveCookie(str) {
    const y1 = Y(str);
    if (isEmpty(y1)) {
        clearCookie();
    } else {
        kvSet('panwebshareguangya_cookie', y1);
    }
}
function clearCookie() {
    kvDel('panwebshareguangya_cookie');
    kvDel('.panwebshareguangya_cookie');
}

/** getCurrentSiteUrl */
function getCurrentSiteUrl() {
    return isEmpty(site) ? C[0] : site;
}

// ============================ HTTP（E() 统一入口 + Cookie 会话） ============================

/** j()：当前 Cookie（含 KV 持久化对账，Java 1:1） */
function j() {
    if (!hasCfgCookie) {
        const saved = getSavedCookie();
        if (!isEmpty(saved) && saved !== curCookie) {
            curCookie = saved;
            persistCookie = true;
            cookieJarInit = true;
        } else if (persistCookie && isEmpty(saved)) {
            curCookie = cfgCookie;
            persistCookie = false;
            cookieJarInit = true;
        }
    }
    return curCookie === undefined || curCookie === null ? '' : curCookie;
}

/** g0：CookieJar 初始化（把会话 Cookie 灌入 jar，Java 1:1） */
function g0(url, cookieStr) {
    if (!cookieJarInit) return;
    try {
        for (const k of Object.keys(cookieMap)) delete cookieMap[k];
        if (isEmpty(cookieStr)) {
            cookieJarInit = false;
            return;
        }
        c0(cookieStr, cookieMap);
        // Java 对 site 与 {w}/ 两个 host 各灌一份；JS 合并 map 即可
        cookieJarInit = false;
    } catch (e) { }
}

/** i()：响应 set-cookie 处理（合并 + 按需持久化；宿主 req 的 set-cookie 为 \n 拼接字符串） */
function handleSetCookies(res, url) {
    const hs = headersOf(res);
    let setCookies = [];
    for (const k of Object.keys(hs)) {
        if ('set-cookie' === String(k).toLowerCase()) {
            const v = hs[k];
            if (Array.isArray(v)) setCookies = setCookies.concat(v);
            else if (v !== undefined && v !== null) setCookies = setCookies.concat(String(v).split('\n'));
        }
    }
    setCookies = setCookies.filter(function (s) { return !isEmpty(s); });
    if (setCookies.length === 0) return;
    curCookie = V(curCookie, setCookies, url);
    if (persistCookie) {
        kvSet('panwebshareguangya_cookie', curCookie);
    }
}

/** N()：默认请求头（Java 1:1） */
function defaultHeaders() {
    const map = { 'User-Agent': UA };
    map['Referer'] = site;
    map['Accept'] = 'text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8';
    map['Accept-Language'] = 'zh-CN,zh;q=0.9,en;q=0.8';
    map['Cache-Control'] = 'no-cache';
    map['Pragma'] = 'no-cache';
    map['Upgrade-Insecure-Requests'] = '1';
    const ck = j();
    if (!isEmpty(ck)) map['Cookie'] = ck;
    return map;
}

/** L(map)：头 map 大小写不敏感取 Cookie */
function headerCookie(hs) {
    const key = 'Cookie';
    for (const k of Object.keys(hs)) {
        if (k !== null && key.toLowerCase() === String(k).toLowerCase()) return hs[k];
    }
    return '';
}

/** e0(map)：头 map 大小写不敏感删 Cookie */
function removeCookieHeader(hs) {
    for (const k of Object.keys(hs)) {
        if (k !== null && 'Cookie'.toLowerCase() === String(k).toLowerCase()) { delete hs[k]; return; }
    }
}

/** E(method, url, body, headers)：统一请求（Cookie 会话 1:1） */
function E(method, url, body, headers) {
    const result = { code: 0, body: '', headers: {} };
    if (isEmpty(url)) return result;
    try {
        const hs = {};
        if (headers) for (const k of Object.keys(headers)) hs[k] = headers[k];
        const strCookie = headerCookie(hs);
        removeCookieHeader(hs);
        let jarCookie = j();
        if (isEmpty(jarCookie)) jarCookie = Y(strCookie);
        g0(url, jarCookie);
        // Java：jar 内已含会话 Cookie 且比用户 Cookie 多 → 信任 jar；否则头带 Cookie + NO_COOKIES
        const jarCount = Object.keys(cookieMap).length;
        let userCount = 0;
        if (!isEmpty(jarCookie)) {
            const tmp = {};
            c0(jarCookie, tmp);
            userCount = Object.keys(tmp).length;
        }
        if (!isEmpty(jarCookie)) {
            if (jarCount < userCount) {
                hs['Cookie'] = jarCookie;
                for (const k of Object.keys(cookieMap)) delete cookieMap[k]; // NO_COOKIES
            } else {
                // jar 自动携带：jar Cookie 与用户 Cookie 合并（jar 优先级低，用户头值覆盖）
                const merged = {};
                c0(jarCookie, merged);
                const userMap = {};
                c0(strCookie, userMap);
                for (const k of Object.keys(userMap)) merged[k] = userMap[k];
                let out = '';
                for (const k of Object.keys(merged)) {
                    if (out.length > 0) out += '; ';
                    out += merged[k];
                }
                if (!isEmpty(out)) hs['Cookie'] = out;
            }
        }
        let res;
        if ('POST'.toUpperCase() === method.toUpperCase()) {
            res = httpPost(url, body === undefined || body === null ? '' : body, hs, 30000);
        } else {
            res = httpGet(url, hs, 30000);
        }
        result.body = bodyOf(res);
        result.headers = headersOf(res);
        result.code = res && res.status ? res.status : 0;
        handleSetCookies(res, url);
    } catch (e) {
        log('E FAIL: ' + e);
        return { code: 0, body: '', headers: {} };
    }
    return result;
}

// ============================ btwaf_aes 解密挑战（J/B/P/M/K/a0/U） ============================

/** M：是否解密挑战页 */
function isChallenge(html) {
    return !isEmpty(html) && E_PAT.test(html);
}

/** K：JS 变量值提取（var/let/const NAME = '...' | [...]，括号/引号配平，Java 1:1） */
function extractVar(str, name) {
    let out = '';
    if (isEmpty(str) || isEmpty(name)) return out;
    const re = new RegExp('(?:\\b(?:var|let|const)\\s+)?\\b' + name.replace(/[.*+?^${}()|[\]\\]/g, '\\$&') + '\\b\\s*=\\s*', 'gi');
    let m;
    while ((m = re.exec(str)) !== null) {
        let i = m.index + m[0].length;
        if (i < 0 || i >= str.length) { out = ''; break; }
        while (i < str.length && /\s/.test(str.charAt(i))) i++;
        if (i >= str.length) { out = ''; break; }
        const c = str.charAt(i);
        if (c !== '[' && c !== '"' && c !== '\'') { out = ''; break; }
        if (c !== '[') {
            let k = i + 1;
            let found = false;
            while (k < str.length) {
                const ch = str.charAt(k);
                if (ch === '\\') { k++; }
                else if (ch === c) { out = str.substring(i, k + 1).trim(); found = true; break; }
                k++;
            }
            if (!found) out = '';
        } else {
            let k = i, inStr = false, sc = '\0', depth = 0, found = false;
            while (k < str.length) {
                const ch = str.charAt(k);
                if (!inStr) {
                    if (ch !== '"' && ch !== '\'') {
                        if (ch !== '[') {
                            if (ch === ']') { depth--; if (depth === 0) { out = str.substring(i, k + 1).trim(); found = true; break; } }
                        } else { depth++; }
                    } else { sc = ch; inStr = true; }
                } else {
                    if (ch === '\\') { k++; }
                    else if (ch === sc) { inStr = false; }
                }
                k++;
            }
            if (!found) out = '';
        }
        if (!isEmpty(out)) return out;
    }
    return out;
}

/** a0：字节数组解析（[json] / hex / base64 / 引号包裹，Java 1:1） */
function a0(str) {
    if (isEmpty(str)) return new Uint8Array(0);
    let s = String(str).trim();
    if (!s.startsWith('[') || !s.endsWith(']')) {
        if (s.length >= 2 && (s.charAt(0) === '"' || s.charAt(0) === '\'')) {
            s = s.substring(1, s.length - 1).replace(/\\"/g, '"').replace(/\\'/g, "'");
        }
        const nospace = s.replace(/\s+/g, '');
        if ((nospace.length & 1) !== 0 || !/^[0-9a-fA-F]+$/.test(nospace)) {
            try { return b64ToBytes(nospace); } catch (e) { return new Uint8Array(0); }
        }
        const len = nospace.length / 2;
        const out = new Uint8Array(len);
        for (let i = 0; i < len; i++) out[i] = parseInt(nospace.substr(i * 2, 2), 16) & 0xFF;
        return out;
    }
    const inner = s.substring(1, s.length - 1).trim();
    if (isEmpty(inner)) return new Uint8Array(0);
    const parts = inner.split(',');
    const out = new Uint8Array(parts.length);
    for (let i = 0; i < parts.length; i++) {
        let p = parts[i].trim();
        let base = 10;
        if (p.startsWith('0x') || p.startsWith('0X')) { p = p.substring(2); base = 16; }
        const v = parseInt(p, base);
        if (v < -128 || v > 255) return new Uint8Array(0);
        out[i] = v & 0xFF;
    }
    return out;
}

/** U：完整 HTML 结构检查 */
function isFullHtml(str) {
    if (isEmpty(str)) return false;
    const lower = String(str).toLowerCase();
    const iHtml = lower.indexOf('<html');
    const iBody = lower.indexOf('<body', iHtml < 0 ? 0 : iHtml);
    const iBodyEnd = lower.indexOf('</body>', iBody < 0 ? 0 : iBody);
    if (!(iHtml >= 0 && iBody > iHtml && iBodyEnd > iBody)) return false;
    return lower.indexOf('</html>', iBodyEnd < 0 ? 0 : iBodyEnd) > iBodyEnd;
}

/** GCM 标准算法辅助（CryptoJS 无 GCM：ECB 做分组加密 + GHASH/CTR 手写） */
function xorWords(a, b) {
    const n = Math.max(a.words.length, b.words.length);
    const out = [];
    for (let i = 0; i < n; i++) out.push(((a.words[i] || 0) ^ (b.words[i] || 0)) >>> 0);
    return CryptoJS.lib.WordArray.create(out, Math.max(a.sigBytes || 0, b.sigBytes || 0) || n * 4);
}
function u8ToWords(u8, sigLen) {
    const len = sigLen === undefined ? u8.length : sigLen;
    const words = [];
    for (let i = 0; i < len; i += 4) {
        words.push((((u8[i] & 0xFF) << 24) | ((u8[i + 1] || 0) << 16) | ((u8[i + 2] || 0) << 8) | (u8[i + 3] || 0)) >>> 0);
    }
    return CryptoJS.lib.WordArray.create(words, len);
}
function wordsToU8(wa) {
    const out = new Uint8Array(wa.sigBytes);
    for (let i = 0; i < out.length; i++) {
        out[i] = (wa.words[i >> 2] >>> ((3 - (i & 3)) * 8)) & 0xFF;
    }
    return out;
}
function blockAt(wa, off) {
    const bytes = wordsToU8(wa);
    const b = new Array(16);
    for (let i = 0; i < 16; i++) b[i] = off + i < bytes.length ? bytes[off + i] : 0;
    return u8ToWords(b, 16);
}
function inc32(wa) {
    const words = wa.words.slice();
    words[3] = (words[3] + 1) >>> 0;
    return CryptoJS.lib.WordArray.create(words, 16);
}
function ecbBlock(key, wa) {
    const enc = CryptoJS.AES.encrypt(wa, key, { mode: CryptoJS.mode.ECB, padding: CryptoJS.pad.NoPadding });
    return enc.ciphertext;
}
function gmul(x, y) {
    // GF(2^128) 乘法（标准 GCM 域，R = E1^128）
    let Z = CryptoJS.enc.Hex.parse('00000000000000000000000000000000');
    let V = CryptoJS.lib.WordArray.create(y.words.slice(), 16);
    for (let i = 0; i < 128; i++) {
        const bit = (x.words[i >> 5] >>> (31 - (i & 31))) & 1;
        if (bit) Z = xorWords(Z, V);
        const lsb = V.words[3] & 1;
        for (let w = 3; w > 0; w--) {
            V.words[w] = ((V.words[w] >>> 1) | ((V.words[w - 1] & 1) << 31)) >>> 0;
        }
        V.words[0] = V.words[0] >>> 1;
        if (lsb) V.words[0] = (V.words[0] ^ 0xe1000000) >>> 0;
    }
    return Z;
}
/** GHASH：块序列（每块 (Y⊕X)·H） */
function ghashBlocks(H, blocks) {
    let y = CryptoJS.enc.Hex.parse('00000000000000000000000000000000');
    for (const blk of blocks) y = gmul(xorWords(y, blk), H);
    return y;
}
function bytesToHex(u8) {
    let s = '';
    for (let i = 0; i < u8.length; i++) s += ('0' + u8[i].toString(16)).slice(-2);
    return s;
}
function hexToU8(hex) {
    const out = new Uint8Array(hex.length >> 1);
    for (let i = 0; i < out.length; i++) out[i] = parseInt(hex.substr(i * 2, 2), 16);
    return out;
}

/** AES/GCM/NoPadding 解密（tag 16 字节，AAD 空 — 对齐 Java B() 参数形态） */
function gcmDecrypt(keyBytes, ivBytes, cipherBytes, tagBytes) {
    if (keyBytes === null) return '';
    if ((ivBytes.length !== 12 && ivBytes.length !== 16) || tagBytes === null || tagBytes.length !== 16) return '';
    const key = CryptoJS.lib.WordArray.create(keyBytes);
    const H = ecbBlock(key, CryptoJS.enc.Hex.parse('00000000000000000000000000000000'));
    // J0
    let j0;
    if (ivBytes.length === 12) {
        const words = [];
        for (let i = 0; i < 3; i++) {
            words.push(((ivBytes[i * 4] << 24) | (ivBytes[i * 4 + 1] << 16) | (ivBytes[i * 4 + 2] << 8) | ivBytes[i * 4 + 3]) >>> 0);
        }
        words.push(0x00000001);
        j0 = CryptoJS.lib.WordArray.create(words, 16);
    } else {
        const ivWa = u8ToWords(ivBytes);
        const lenBlk = CryptoJS.lib.WordArray.create([0, 0, 0, ivBytes.length * 8], 16);
        j0 = ghashBlocks(H, [blockAt(ivWa, 0), lenBlk]);
    }
    // 明文 = C XOR CTR(J0+1..)
    const ctLen = cipherBytes.length;
    const cipherWa = u8ToWords(cipherBytes);
    const stream = new Uint8Array(ctLen);
    for (let off = 0, cnt = 1; off < ctLen; off += 16, cnt++) {
        let ctr = inc32(j0);
        for (let b = 1; b < cnt; b++) ctr = inc32(ctr);
        const ks = wordsToU8(ecbBlock(key, ctr));
        for (let i = 0; i < 16 && off + i < ctLen; i++) stream[off + i] = ks[i];
    }
    const plain = new Uint8Array(ctLen);
    for (let i = 0; i < ctLen; i++) plain[i] = cipherBytes[i] ^ stream[i];
    // tag 校验：S = GHASH(C 全块 + len 块)，tag = E_K(J0) ⊕ S
    const blocks = [];
    for (let off = 0; off < ctLen; off += 16) blocks.push(blockAt(cipherWa, off));
    blocks.push(CryptoJS.lib.WordArray.create([0, 0, 0, ctLen * 8], 16));
    const S = ghashBlocks(H, blocks);
    const tag = xorWords(ecbBlock(key, j0), S);
    if (bytesToHex(wordsToU8(tag)) !== bytesToHex(tagBytes)) return '';
    return bytesToUtf8(plain);
}

/** B：Java B()（参数校验 + GCM） */
function B(keyBytes, ivBytes, cipherBytes, tagBytes) {
    if (ivBytes === null) return '';
    if ((ivBytes.length !== 12 && ivBytes.length !== 16) || tagBytes === null || tagBytes.length !== 16) return '';
    try {
        const merged = new Uint8Array(cipherBytes.length + tagBytes.length);
        merged.set(cipherBytes, 0);
        merged.set(tagBytes, cipherBytes.length);
        const out = gcmDecrypt(keyBytes, ivBytes, cipherBytes, tagBytes);
        return out === null ? '' : out;
    } catch (e) {
        return '';
    }
}

/** P：挑战页且 raw_key/encrypted/iv 参数齐全 */
function isDecryptable(html) {
    return isChallenge(html) && !isEmpty(extractVar(html, 'raw_key')) &&
        !isEmpty(extractVar(html, 'encrypted')) && !isEmpty(extractVar(html, 'iv'));
}

/** J：抓取 + 解密挑战处理（Java 1:1，含 CTR/OFB/CFB/CBC 回退） */
function J(url) {
    const html0 = E('GET', url, null, defaultHeaders()).body;
    let body = '';
    let errMsg = '';
    if (!isDecryptable(html0)) {
        body = html0 === undefined || html0 === null ? '' : html0;
    } else {
        try {
            const key = a0(extractVar(html0, 'raw_key'));
            const enc = a0(extractVar(html0, 'encrypted'));
            const iv = a0(extractVar(html0, 'iv'));
            const tag = a0(extractVar(html0, 'tag'));
            if (key !== null && (key.length === 16 || key.length === 24 || key.length === 32)) {
                if (enc.length !== 0) {
                    const dec = B(key, iv, enc, tag);
                    if (isFullHtml(dec)) {
                        body = dec;
                    } else if (iv.length === 16) {
                        const modes = ['CTR', 'OFB', 'CFB', 'CBC'];
                        for (let i = 0; i < modes.length; i++) {
                            let out2 = '';
                            try {
                                const keyWa = CryptoJS.lib.WordArray.create(key);
                                const ivWa = CryptoJS.lib.WordArray.create(iv);
                                const dataWa = CryptoJS.lib.WordArray.create(enc);
                                const decrypted = CryptoJS.AES.decrypt(
                                    { ciphertext: dataWa },
                                    keyWa,
                                    {
                                        mode: CryptoJS.mode[modes[i]],
                                        iv: ivWa,
                                        padding: i === 3 ? CryptoJS.pad.Pkcs7 : CryptoJS.pad.NoPadding,
                                    });
                                out2 = bytesToUtf8(hexToU8(CryptoJS.enc.Hex.stringify(decrypted)));
                            } catch (e) { out2 = ''; }
                            if (isFullHtml(out2)) { body = out2; break; }
                        }
                    }
                }
            }
        } catch (e) { }
        if (isChallenge(html0) && body === html0) {
            errMsg = isDecryptable(html0) ? '站点网页解密失败，挑战算法或参数已变化' : '站点返回了未知网页解密挑战，缺少必要参数';
        }
    }
    return { body: body, error: errMsg };
}

// ============================ cheerio 解析（f0.g / f0.k 等价） ============================

/** X1.L(html, baseUri) → $ 实例 */
function load(html) {
    return cheerio.load(html === undefined || html === null ? '' : String(html));
}

/** k.T()：文本（jsoup text 语义：去标签、空白归一） */
function textOf($, $el) {
    if (!$el || $el.length === 0) return '';
    return $.text($el).trim();
}

/** k.K()：innerHTML */
function htmlInner($, $el) {
    if (!$el || $el.length === 0) return '';
    return $.html($el) === undefined ? '' : String($.html($el)).trim() === '' ? '' : innerOf($, $el);
}
function innerOf($, $el) {
    try {
        return $el.html() || '';
    } catch (e) {
        return '';
    }
}

/** outer HTML（k.q()） */
function outerOf($, $el) {
    try {
        return $.html($el) || '';
    } catch (e) {
        return '';
    }
}

/** 全文文本（g.T()；jsoup text() 排除 script/style/noscript — cheerio 需先剔除） */
function docText($) {
    try {
        const $copy = cheerio.load(docHtml($));
        $copy('script, style, noscript').remove();
        return $copy.root().text().replace(/\s+/g, ' ').trim();
    } catch (e) {
        try { return $.root().text().replace(/\s+/g, ' ').trim(); } catch (e2) { return ''; }
    }
}
/** 全文 HTML（g.K()） */
function docHtml($) {
    try { return $.root().html() || ''; } catch (e) { }
    return '';
}
/** 标题（g.Y()） */
function docTitle($) {
    try { return $('title').first().text().trim(); } catch (e) { return ''; }
}

/** C0342a0.S 等价的 URL 解码（HTML 实体 + URL decode） */
function unescapeUrl(str) {
    let s = String(str === undefined || str === null ? '' : str).trim()
        .replace(/&amp;/g, '&').replace(/\\\//g, '/').replace(/\.html/g, '');
    s = s.replace(/&quot;/g, '"').replace(/&#39;/g, "'").replace(/&lt;/g, '<').replace(/&gt;/g, '>').replace(/&#(\d+);/g, function (m, d) {
        try { return String.fromCharCode(parseInt(d, 10)); } catch (e) { return m; }
    });
    try { s = decodeURIComponent(s); } catch (e) { }
    return s;
}

/** v：去标签 + 实体清理 + trim（Java 1:1，走 cheerio 语义） */
function v(str) {
    if (str === undefined || str === null) return '';
    const cleaned = String(str).replace(/<[^>]+>/g, '').replace(/&(?:#\d+;|#x[\da-fA-F]+;|[a-z]+);/g, '');
    try {
        const $ = load(cleaned);
        return docText($).replace(/\s+/g, ' ').trim();
    } catch (e) {
        return cleaned.replace(/\s+/g, ' ').trim();
    }
}

// ============================ 链接提取（w/X/i0/F/m/k/Z/R/H） ============================

/** i0：链接尾部杂质清理（Java 1:1） */
function i0(str) {
    if (isEmpty(str)) return '';
    let s = String(str).replace(/&amp;/g, '&').replace(/\.html/g, '');
    const stops = ['提取码', '访问码', '密码', '复制', '保存后', '链接：', '链接:'];
    for (let i = 0; i < 7; i++) {
        const idx = s.indexOf(stops[i]);
        if (idx > 0) s = s.substring(0, idx);
    }
    for (; ;) {
        if (!(s.endsWith('。') || s.endsWith('，') || s.endsWith(',') || s.endsWith(';') || s.endsWith('；') || s.endsWith('#') || s.endsWith('<'))) {
            return s.trim();
        }
        s = chop(s);
    }
}

/** X：链接清洗 + 实体/协议归一（Java 1:1） */
function X(str) {
    if (str === undefined || str === null) return '';
    let s = unescapeUrl(String(str).trim());
    if (s.startsWith('//')) s = 'https:' + s;
    if (!s.toLowerCase().startsWith('http') && s.indexOf('guangyapan.com') >= 0) s = 'https://' + s;
    return i0(s);
}

/** R：是否光鸭分享链接 */
function R(str) {
    if (isEmpty(str)) return false;
    return unescapeUrl(String(str).trim()).toLowerCase().indexOf('guangyapan.com/s/') >= 0;
}

/** F：提取码提取 */
function F(str) {
    if (isEmpty(str)) return '';
    const m = I_PAT.exec(String(str));
    I_PAT.lastIndex = 0;
    return m ? m[1] : '';
}

/** m：附加 ?code=/&code=（Java 1:1） */
function m(str, code) {
    if (isEmpty(str) || isEmpty(code)) return str;
    if (String(str).indexOf('code=') >= 0) return str;
    let sep = '?';
    if (String(str).indexOf('?') >= 0) sep = '&';
    return str + sep + 'code=' + code;
}

/** k：提取码链接入列表（Java 1:1） */
function addWithCode(str, list) {
    const x = X(str);
    if (R(x) && list.indexOf(x) < 0) list.push(m(x, F(str)));
}

/** w：文本提取光鸭链接（H 正则 + G 正则回退，Java 1:1） */
function extractFromText(str, list) {
    if (isEmpty(str)) return;
    const s = String(str);
    let mm;
    H_PAT.lastIndex = 0;
    while ((mm = H_PAT.exec(s)) !== null) {
        const tail = s.substring(Math.min(s.length, mm.index + mm[0].length));
        addWithCode(m('https://' + i0(mm[1]), F(tail)), list);
    }
    G_PAT.lastIndex = 0;
    while ((mm = G_PAT.exec(s)) !== null) {
        const tail = s.substring(Math.min(s.length, mm.index + mm[0].length));
        const cleaned = i0(mm[1]);
        if (R(cleaned)) {
            addWithCode(m(cleaned, F(tail)), list);
        }
    }
}

/** x：元素文本 + innerHTML + a[href] 提取（Java 1:1） */
function extractFromEl($, $el, list) {
    if (!$el || $el.length === 0) return;
    extractFromText(textOf($, $el), list);
    extractFromText(innerOf($, $el), list);
    $el.find('a[href]').each(function () {
        const href = X($(this).attr('href') || '');
        if (R(href)) {
            addWithCode(m(href, F(textOf($, $(this)))), list);
        }
    });
}

/** H：详情页主体提取（多选择器 + body 回退，Java 1:1） */
function extractLinks($) {
    const list = [];
    let $main = $('.article-content, .entry-content, .post-content, .wp-posts-content, article, main').first();
    if (!$main || $main.length === 0) $main = $('body');
    extractFromEl($, $main, list);
    if (list.length === 0) {
        const $body = $('body');
        if ($body.length > 0 && ($main.length === 0 || outerOf($, $main) !== outerOf($, $body))) {
            extractFromEl($, $body, list);
        }
    }
    return list;
}

/** Z：去重（LinkedHashSet 保序） */
function dedupe(list) {
    const seen = {};
    const out = [];
    for (const raw of list) {
        const x = X(raw);
        if (R(x) && !seen[x]) {
            seen[x] = true;
            out.push(x);
        }
    }
    return out;
}

// ============================ 页面判定（Q/W/y） ============================

/** Q：登录墙（Java 1:1） */
function isLoginWall($) {
    if (!$) return false;
    const t = docText($);
    return t.indexOf('内容已隐藏，请登录后查看') >= 0 || t.indexOf('暂无查看此内容的权限') >= 0 ||
        t.indexOf('登录后继续查看') >= 0 || t.indexOf('未登录游客仅可浏览基础内容') >= 0 || t.indexOf('登录后可查看') >= 0;
}

/** y：评论解锁关键词（Java 1:1） */
function y(str) {
    if (isEmpty(str)) return false;
    return str.indexOf('评论后刷新页面查看') >= 0 || str.indexOf('评论后查看') >= 0 || str.indexOf('评论后可见') >= 0 ||
        str.indexOf('回复后查看') >= 0 || str.indexOf('回复可见') >= 0 || str.indexOf('留言后查看') >= 0;
}

/** W：评论解锁检测 + 隐藏容器重解析提取（Java 1:1） */
function W($) {
    if (!$) return false;
    const hiddenEls = [];
    $(REPLY_SELS).each(function () { hiddenEls.push($(this)); });
    for (const $el of hiddenEls) {
        if ($el.hasClass('show')) continue;
        // 重解析隐藏容器（Java 用 jsoup 重解析 q()，处理转义 HTML 内的链接）
        try {
            const frag = outerOf($, $el);
            if (!isEmpty(frag)) {
                const $$ = load(frag);
                const links = extractLinks($$);
                if (links.length > 0) {
                    // Java：重解析提取成功 → continue 处理下一个容器（不返回 true）
                    continue;
                }
            }
        } catch (e) { }
        const hasReplyShowAttr = $el.attr('reply-show') !== undefined;
        const hasReplyShowClass = $el.hasClass('reply-show');
        if (!hasReplyShowAttr && !hasReplyShowClass) {
            const strT = textOf($, $el);
            if (!y(strT)) {
                // Java 控制流：文本非评论提示时仍穿透到 return true
            }
        }
        return true;
    }
    return y(docText($));
}

// ============================ 列表解析（b0/S/O/h） ============================

/** h：相对地址 → 绝对（Java 1:1） */
function h(str) {
    if (isEmpty(str)) return '';
    const s = String(str).trim();
    if (s.startsWith('//')) return 'https:' + s;
    if (s.startsWith('/')) return site + s;
    if (s.toLowerCase().startsWith('http') || s.startsWith('data:')) return s;
    return site + '/' + h0(s);
}

/** S：文章地址判定（Java 1:1） */
function S(str) {
    if (isEmpty(str)) return false;
    const lower = String(str).toLowerCase();
    if (!lower.startsWith(site.toLowerCase()) || lower.indexOf('/forum/') >= 0 || lower.indexOf('/forums') >= 0 ||
        lower.indexOf('/category/') >= 0 || lower.indexOf('/author/') >= 0 || lower.indexOf('/user/') >= 0 || lower.indexOf('/wp-') >= 0) {
        return false;
    }
    return lower.indexOf('/archives/') >= 0 || /.*\/\?p=\d+.*/.test(lower) || /.*\/\d+\.html(?:[?#].*)?$/.test(lower);
}

/** O：封面提取（img data-src/src/data-original，Java 1:1） */
function O($, $el) {
    if (!$el || $el.length === 0) return '';
    let $img = $el.find('img[data-src], img[src]').first();
    if (!$img || $img.length === 0) return '';
    let attr = 'data-src';
    if ($img.attr('data-src') === undefined) attr = 'src';
    let src = $img.attr(attr) || '';
    if (isEmpty(src) || src.startsWith('data:')) src = $img.attr('data-original') || '';
    return h(src);
}

/** b0：列表页条目解析（主选择器 + a[href] 回退，Java 1:1） */
function b0($) {
    const list = [];
    const seen = {};
    const metaSel = '.item-meta, .meta, .item-tag, .badge, .muted-2-color';
    const cards = '.posts-item, article, .post-list-item, .post-item, .ajax-item .card, .zib-widget .posts-mini-lists';
    $(cards).each(function () {
        const $card = $(this);
        const $a = $card.find('.item-heading a[href], .post-title a[href], h1 a[href], h2 a[href], h3 a[href], a[href*=/archives/], a[href*=?p=]').first();
        if ($a && $a.length > 0) {
            const url = h($a.attr('href') || '');
            if (S(url) && !seen[url]) {
                seen[url] = true;
                let name = v(textOf($, $a));
                if (isEmpty(name)) name = v($a.attr('title') || '');
                if (!isEmpty(name)) {
                    list.push(vod(url, name, O($, $card), v($card.find(metaSel).text() || '')));
                }
            }
        }
    });
    if (list.length === 0) {
        const cardSel2 = '.posts-item, article, .post-list-item, .post-item, .card, .zib-widget';
        $('a[href]').each(function () {
            const $a = $(this);
            const url = h($a.attr('href') || '');
            if (S(url) && !seen[url]) {
                seen[url] = true;
                let name = v(textOf($, $a));
                if (isEmpty(name) || name.length < 2) name = v($a.attr('title') || '');
                if (!isEmpty(name)) {
                    let $card = null;
                    let $cur = $a;
                    while ($cur && $cur.length > 0) {
                        if ($cur.is(cardSel2)) { $card = $cur; break; }
                        $cur = $cur.parent();
                    }
                    list.push(vod(url, name, $card && $card.length > 0 ? O($, $card) : '',
                        $card && $card.length > 0 ? v($card.find(metaSel).text() || '') : ''));
                }
            }
        });
    }
    return list;
}

// ============================ 设置页条目（r/s/q/f0） ============================

/** f0：单页列表输出（Java 1:1） */
function f0(list) {
    const size = list.length;
    return pageData(list, 1, 1, Math.max(1, size), size);
}

/** r：Cookie 配置条目 */
function r(msg) {
    const el = vod('guangya_community_cookie', '配置光鸭社区Cookie', PIC_HINT, '',
        { action: 'guangya_community_cookie', vod_content: (isEmpty(msg) ? '请在站点扩展或DIY配置Cookie' : msg) + ' · ' + getCurrentSiteUrl() });
    return el;
}

/** s：Cookie 教程条目 */
function s() {
    return vod('guangya_cookie_help', 'Cookie获取教程', PIC_HINT, '',
        { action: 'guangya_cookie_help', vod_content: '推荐使用Via浏览器 · ' + getCurrentSiteUrl() });
}

/** q：错误页输出（提示条目 + 教程条目） */
function q(msg) {
    return f0([r(msg), s()]);
}

// ============================ 自动评论（C/G/A/o/T/u + 滑块伪造） ============================

/** d0：随机小写字母串 */
function d0(n, rand) {
    let sb = '';
    for (let i = 0; i < n; i++) {
        sb += String.fromCharCode(Math.floor(rand() * 26) + 97);
    }
    return sb;
}

/** forgeRandstr：Java 静态 D(int, Random)（滑块 randstr 伪造） */
function forgeRandstr(i, rand) {
    const a = Math.floor(rand() * 30) + 11;
    const b = Math.floor(rand() * 30) + 11;
    return a + d0(a, rand) + i + d0(b, rand) + b;
}

/** G：文章 ID 提取（comment_post_ID / 全文正则 / URL J 正则，Java 1:1） */
function G($, id, url) {
    if (!$) return '';
    const $post = $('#comment_post_ID, input[name=comment_post_ID]').first();
    if ($post && $post.length > 0 && !isEmpty($post.val ? $post.val() : $post.attr('value'))) {
        return $post.val ? String($post.val()) : String($post.attr('value'));
    }
    const full = docHtml($);
    const m = /views['"]?\s*:\s*['"]?([^,'"}\s]+)/i.exec(full);
    if (!isEmpty(m ? m[1] : '')) return m[1];
    const m2 = /comment_post_ID['"]?\s*[:=]\s*['"]?(\d+)/.exec(full);
    if (m2) return m2[1];
    let url3 = url === undefined || url === null ? '' : url;
    const mm = J_PAT.exec(url3);
    if (mm) return mm[1];
    const mm2 = J_PAT.exec(id === undefined || id === null ? '' : id);
    return mm2 ? mm2[1] : '';
}

/** A：评论表单字段收集（input/textarea/select，Java 1:1） */
function collectForm($, $$) {
    const map = {};
    const $form = $('#commentform, form.comment-form, form[action*=comment]').first();
    if (!$form || $form.length === 0) return map;
    $form.find('input[name], textarea[name], select[name]').each(function () {
        const $f = $(this);
        const name = $f.attr('name') || '';
        if (isEmpty(name) || 'submit'.toLowerCase() === name.toLowerCase()) return;
        let val = $f.attr('value') || ($f.val !== undefined ? String($f.val() || '') : '');
        const tag = ($f[0] && $f[0].tagName ? String($f[0].tagName) : '').toLowerCase();
        if (tag === 'select') {
            const $sel = $f.find('option[selected], option').first();
            if (!$sel || $sel.length === 0) {
                val = '';
            } else {
                val = $sel.attr('value') || '';
                const txt = textOf($, $sel);
                if (isEmpty(val)) val = txt === undefined || txt === null ? '' : txt;
            }
        }
        map[name] = val === undefined || val === null ? '' : val;
    });
    return map;
}

/** I(gVar, key)：全文 JS 配置值提取（Java 1:1） */
function extractConfig($, key) {
    if (!$ || isEmpty(key)) return '';
    const full = docHtml($);
    const m = new RegExp(key + '[\'"]?\\s*:\\s*[\'"]?([^,\'"}\\s]+)').exec(full);
    return m ? m[1] : '';
}

/** T：评论响应成功判定（Java 1:1） */
function isCommentOk(res) {
    if (res.code >= 400) return false;
    const body = res.body === undefined || res.body === null ? '' : res.body;
    const trimmed = body.trim();
    if (isEmpty(trimmed) || trimmed === '0' || trimmed === '-1' ||
        body.indexOf('请先登录') >= 0 || body.indexOf('请登录') >= 0 || body.indexOf('登录后') >= 0) return false;
    if (body.indexOf('失败') >= 0) return false;
    if (body.indexOf('错误') >= 0 || body.indexOf('无权') >= 0 || body.indexOf('权限') >= 0 ||
        body.indexOf('太快') >= 0 || body.indexOf('频繁') >= 0 || body.indexOf('灌水') >= 0 || body.indexOf('验证码') >= 0) return false;
    try {
        const json = JSON.parse(body);
        let data = json['data'] && typeof json['data'] === 'object' ? json['data'] : json;
        const err = json['error'];
        if ((typeof err === 'boolean' && err) || String(err) === '1' || String(err).toLowerCase() === 'true') return false;
        const code = json['code'];
        if (json['code'] !== undefined && parseInt(code, 10) !== 0 && parseInt(code, 10) !== 1) return false;
        const msg = (json['message'] || '') + (json['msg'] || '');
        if (msg.indexOf('失败') >= 0 || msg.indexOf('错误') >= 0 || msg.indexOf('登录') >= 0 || msg.indexOf('审核') >= 0) return false;
        const comment = data['comment'] && typeof data['comment'] === 'object' ? data['comment'] : null;
        if (comment !== null) {
            const approved = parseInt(comment['comment_approved'] || '0', 10);
            if (isNaN(approved)) {
                if (parseInt(comment['comment_approved'] === undefined ? '0' : String(comment['comment_approved']), 10) <= 0) return false;
            } else if (approved <= 0) {
                return false;
            }
        }
        if (!isEmpty(data['html'] || '') || comment !== null) return true;
        if (msg.indexOf('成功') >= 0 && msg.indexOf('等待') < 0) return true;
    } catch (e) { }
    return false;
}

/** u：评论失败原因（Java 1:1） */
function commentFailReason(res) {
    const body = res.body;
    if (res.code >= 400) return '自动评论失败：HTTP ' + res.code;
    try {
        const json = JSON.parse(body);
        let data = json['data'] && typeof json['data'] === 'object' ? json['data'] : json;
        const comment = data['comment'] && typeof data['comment'] === 'object' ? data['comment'] : null;
        if (comment !== null) {
            const raw = comment['comment_approved'];
            let approved = 0;
            try { approved = parseInt(String(raw === undefined ? '0' : raw), 10); } catch (e) { approved = 0; }
            if (isNaN(approved)) approved = 0;
            if (approved <= 0) return '自动评论失败：评论等待审核，暂不能解锁';
        }
        let msg = json['message'] || '';
        if (isEmpty(msg)) msg = json['msg'] || '';
        if (!isEmpty(msg)) return '自动评论失败：' + msg;
        if (json['success'] === true && !data['html'] && !data['comment']) {
            return '自动评论失败：收到非评论接口响应';
        }
        let compact = '';
        if (body !== undefined && body !== null) {
            compact = normalizeSep(body, '\r', ' ', '\n', ' ');
            if (compact.length > 160) compact = compact.substring(0, 160);
        }
        return isEmpty(compact) ? '自动评论失败：空响应' : '自动评论失败：' + compact;
    } catch (e) {
        return '';
    }
}

/** o：zibll 滑块验证参数伪造（Java 1:1） */
function forgeCaptcha(map, headers, rand) {
    const capHeaders = { 'type': 'slider' };
    const iNextInt = Math.floor(rand() * 135) + 73;
    capHeaders['randstr'] = D(iNextInt, rand);
    const res = E('GET', site + '/wp-content/themes/zibll/action/captcha.php', null, headers);
    if (res.code >= 400) throw new Error('滑块验证初始化失败');
    const json = JSON.parse(res.body);
    const token = json['token'] || '';
    const randStr = json['rand_str'] || '';
    const check = json['check'] || '';
    if (isEmpty(token) || randStr.length < 25 || isEmpty(check)) throw new Error('滑块验证数据无效');
    const a = Math.floor(rand() * 9) + 1;
    const b = Math.floor(rand() * 11) + 15;
    map['captcha_mode'] = 'slider';
    map['captcha[ticket]'] = D(iNextInt, rand);
    map['captcha[randstr]'] = a + randStr.substring(a, b) + b;
    map['captcha[spliced]'] = 'true';
    map['captcha[check]'] = check;
    const trail = [];
    const n = Math.floor(rand() * 9) + 18;
    let mx = 0;
    for (let i = 0; i < n; i++) {
        if (i === 1) mx = 1;
        else if (i > 1) mx = Math.max(0, Math.min(5, (Math.floor(rand() * 3) + mx) - 1));
        trail.push(mx);
    }
    map['captcha[trail]'] = JSON.stringify(trail);
}

/**
 * C：自动评论（Java 1:1）
 * JS 差异：Thread.sleep(21000 - elapsed) → 返回等待提示（壳无法同步阻塞）。
 */
function autoComment($, id, url) {
    const KEY_NONCE = '_wpnonce';
    const KEY_PARENT = 'comment_parent';
    const KEY_POST = 'comment_post_ID';
    if (isEmpty(j())) {
        return { ok: false, msg: '当前内容需要评论后查看，请先配置光鸭社区Cookie' };
    }
    try {
        const elapsed = Date.now() - lastCommentAt;
        if (lastCommentAt > 0 && elapsed < 21000) {
            return { ok: false, msg: '评论间隔限制：请等待 ' + Math.ceil((21000 - elapsed) / 1000) + ' 秒后重试' };
        }
        let postId = G($, id, url);
        if (isEmpty(postId)) {
            return { ok: false, msg: '自动评论失败：文章ID无效' };
        }
        const headers = defaultHeaders();
        if (!isEmpty(url)) headers['Referer'] = url;
        headers['Origin'] = site;
        headers['X-Requested-With'] = 'XMLHttpRequest';
        headers['Accept'] = 'application/json, text/javascript, */*; q=0.01';
        headers['Content-Type'] = 'application/x-www-form-urlencoded; charset=UTF-8';
        delete headers['Upgrade-Insecure-Requests'];
        const map = collectForm($, $);
        map['action'] = 'submit_comment';
        const postField = map[KEY_POST];
        if (!isEmpty(postField)) {
            postId = postField;
        } else if (postId === undefined || postId === null) {
            postId = '';
        }
        map[KEY_POST] = postId;
        const parentField = map[KEY_PARENT];
        if (isEmpty(parentField)) map[KEY_PARENT] = '0';
        const randSeed = (Date.now() % 2147483647) >>> 0;
        let randState = randSeed || 1;
        const rand = function () {
            randState = (randState * 48271) % 2147483647;
            return randState / 2147483647;
        };
        map['comment'] = D[Math.floor(rand() * 6)];
        const nonce = extractConfig($, 'post_action_nonce');
        if (!isEmpty(nonce) && map[KEY_NONCE] === undefined) {
            map[KEY_NONCE] = nonce;
        }
        forgeCaptcha(map, headers, rand);
        // 表单序列化（application/x-www-form-urlencoded）
        const parts = [];
        for (const k of Object.keys(map)) {
            parts.push(urlEncode(k) + '=' + urlEncode(map[k] === undefined || map[k] === null ? '' : map[k]));
        }
        const res = E('POST', site + '/wp-admin/admin-ajax.php', parts.join('&'), headers);
        lastCommentAt = Date.now();
        const ok = isCommentOk(res);
        let msg = '';
        if (!ok) msg = commentFailReason(res) || '';
        return { ok: ok, msg: msg };
    } catch (e) {
        return { ok: false, msg: '自动评论失败：' + e.message };
    }
}

// ============================ 详情（$host$6c1ebb3cb60973b4 等价） ============================

/** t：线路备注 */
function t(list) {
    if (list.length === 0) return '未提取到光鸭链接';
    return '光鸭 ' + list.length + '条';
}

/** a/b 等价：播放 From/Url 构建（GuangYa SDK 降级：单旗标 + 名$链接） */
function buildFrom(list) {
    return list.length > 0 ? '光鸭' : '';
}
function buildUrl(list) {
    const items = [];
    for (const link of list) {
        const name = v(i0(link)).replace(/[$#]/g, ' ').trim() || '光鸭分享';
        items.push(name + '$' + link);
    }
    return items.join('#');
}

/** p：详情描述（Java 1:1） */
function p(url, list, unlocked) {
    let sb = '';
    const n = function (label, val) {
        if (isEmpty(val)) return;
        if (sb.length > 0) sb += '\n';
        sb += label + ': ' + val;
    };
    n('来源', site);
    n('页面', url);
    if (unlocked) n('解锁', '已自动评论并刷新页面');
    if (list.length === 0) {
        n('状态', '未提取到可用光鸭链接');
        n('提示', '请检查社区Cookie、光鸭网盘开关或文章是否仍需登录解锁');
        return sb;
    }
    n('网盘', '光鸭');
    n('数量', list.length + '条');
    n('提示', '已提取播放列表，直接选择线路播放');
    const min = Math.min(5, list.length);
    sb += '\n\n链接:';
    for (let i = 0; i < min; i++) {
        sb += '\n' + list[i];
    }
    if (list.length > min) {
        sb += '\n...已省略' + (list.length - min) + '条原始链接';
    }
    return sb;
}

function detail(list) {
    if (list === undefined || list === null || list.length === 0) {
        return JSON.stringify({ list: [], msg: '' });
    }
    const id = list[0];
    if ('guangya_community_cookie' === id || 'guangya_cookie_help' === id) {
        return actionContent(id);
    }
    let url;
    if (id.startsWith('http')) {
        url = id;
    } else {
        url = site + '/' + h0(id);
    }
    try {
        let first = J(url);
        if (isChallenge(first.body)) {
            return q(first.error);
        }
        if (isRedirectShell(first.body)) {
            first = J(url);
            if (isChallenge(first.body)) return q(first.error);
        }
        let $ = load(first.body);
        if (isLoginWall($)) {
            return q('当前内容需要登录后查看');
        }
        let links = dedupe(extractLinks($));
        let reply = { ok: false, msg: '' };
        let unlocked = false;
        if (links.length === 0 && W($)) {
            const replyRes = autoComment($, id, url);
            let retry = 0;
            while (retry < 3) {
                // Java Thread.sleep(1200/1800) → JS 无阻塞休眠，立即重试（服务端节流由 21s 限制兜底）
                const sep = url.indexOf('?') >= 0 ? '&' : '?';
                const second = J(url + sep + '_gy_refresh=' + Date.now());
                if (!isChallenge(second.body)) {
                    $ = load(second.body);
                    if (!isLoginWall($)) {
                        links = dedupe(extractLinks($));
                        if (links.length > 0 || !W($)) break;
                        retry++;
                    } else {
                        return q('自动评论后仍需登录，请检查光鸭社区Cookie');
                    }
                } else {
                    return q(second.error);
                }
            }
            if (links.length === 0 && W($)) {
                if (replyRes.ok) {
                    return q('自动评论后仍未解锁，请检查Cookie或等待评论审核');
                }
                const msg = isEmpty(replyRes.msg) ? '自动评论失败，请检查光鸭社区Cookie' : replyRes.msg;
                return q(msg);
            }
            unlocked = links.length > 0 ? true : replyRes.ok;
            reply = replyRes;
        }
        let name = v(textOf($, $('h1, .article-title, .post-title, .item-heading, .title-h-left').first()));
        if (isEmpty(name)) name = v(docTitle($));
        let pic = O($, $('.article-content, .entry-content, .post-content, main').first());
        if (isEmpty(pic)) pic = O($, $('body'));
        const content = p(url, links, unlocked);
        const el = vod(id, name, pic, '', { type_name: '光鸭社区', vod_content: content });
        if (!unlocked || links.length === 0) {
            el.vod_remarks = t(links);
        } else {
            el.vod_remarks = '已自动评论解锁 · ' + t(links);
        }
        if (links.length === 0) {
            el.vod_play_from = '提示';
            el.vod_play_url = (isEmpty(reply.msg) ? '未提取到光鸭链接' : reply.msg) + '$' + id;
        } else {
            el.vod_play_from = buildFrom(links);
            const playUrl = buildUrl(links);
            el.vod_play_url = playUrl;
        }
        return detailData(el);
    } catch (e) {
        log('detail FAIL: ' + e);
        return JSON.stringify({ list: [], msg: '' });
    }
}

// ============================ 分类/搜索（$host$f9d7235748f992e0 / $host$5abcbf7c29fbb7fe） ============================

function parsePage(pg) {
    try {
        const n = parseInt(pg, 10);
        return isNaN(n) ? 1 : Math.max(1, n);
    } catch (e) {
        return 1;
    }
}

function browsePage(htmlBody, pageNo, type) {
    const $ = load(htmlBody);
    if (isLoginWall($)) {
        return type === 'search' ? q('搜索结果需要登录后查看') : q('当前分类需要登录后查看');
    }
    const items = b0($);
    const pagecount = items.length === 0 ? pageNo : pageNo + 1;
    return pageData(items, pageNo, pagecount, 20, pageNo * 20 + items.length);
}

/** 重定向壳判定：解密输出为 JS location 跳转壳（btwaf 会话时序，需会话重放） */
function isRedirectShell(html) {
    return !isEmpty(html) && html.length < 800 && html.indexOf('window.location.href') >= 0;
}

function category(tid, pg) {
    const pageNo = parsePage(pg);
    if ('guangya_settings' === tid) {
        if (pageNo > 1) return f0([]);
        const arr = [];
        arr.push(r(hasSavedCookie() ? '已配置' : '未配置，请在站点扩展或DIY配置Cookie'));
        arr.push(s());
        return f0(arr);
    }
    try {
        const url = site + '/category/' + h0(tid) + (pageNo > 1 ? '/page/' + pageNo : '');
        const first = J(url);
        if (isChallenge(first.body)) return q(first.error);
        // 解密输出为重定向壳 → 会话重放 1 次（CookieJar 语义：btwaf 解密写 cookie 后 reload）
        let htmlBody = first.body;
        if (isRedirectShell(htmlBody)) {
            const second = J(url);
            if (isChallenge(second.body)) return q(second.error);
            if (!isRedirectShell(second.body)) htmlBody = second.body;
        }
        return browsePage(htmlBody, pageNo, 'category');
    } catch (e) {
        log('category FAIL: ' + e);
        return JSON.stringify({ list: [], msg: '' });
    }
}

function searchContent(key, quick, pg) {
    const pageNo = parsePage(pg);
    try {
        const url = site + '/?s=' + javaUrlEncode(key) + (pageNo > 1 ? '&paged=' + pageNo : '');
        const first = J(url);
        if (isChallenge(first.body)) return q(first.error);
        let htmlBody = first.body;
        if (isRedirectShell(htmlBody)) {
            const second = J(url);
            if (isChallenge(second.body)) return q(second.error);
            if (!isRedirectShell(second.body)) htmlBody = second.body;
        }
        return browsePage(htmlBody, pageNo, 'search');
    } catch (e) {
        log('search FAIL: ' + e);
        return JSON.stringify({ list: [], msg: '' });
    }
}

// ============================ home / init / action / play ============================

function home() {
    const classes = [
        { type_id: 'film', type_name: '电影' },
        { type_id: 'show', type_name: '剧集' },
        { type_id: 'animation', type_name: '动漫' },
        { type_id: 'reality', type_name: '综艺' },
        { type_id: 'documentary', type_name: '纪录片' },
        { type_id: 'music', type_name: '音乐' },
        { type_id: 'toolware', type_name: '工具' },
        { type_id: 'guangya_settings', type_name: '设置' },
    ];
    return homeData(classes, {});
}

function actionContent(str) {
    // Java：InitOrigin.run(UI 弹窗) 后返回 ""；JS 壳无 UI，Cookie 由 ext/local 配置，回执提示
    if ('guangya_community_cookie' === str) {
        return JSON.stringify({ msg: '请在站点扩展或DIY配置中设置 Cookie（ext.cookie 或 ext.guangya_qsxy_cookie），也可写入 local 的 panwebshareguangya_cookie', list: [] });
    }
    if ('guangya_cookie_help' === str) {
        return JSON.stringify({ msg: '推荐使用 Via 浏览器访问 ' + getCurrentSiteUrl() + ' 登录后从请求头复制 Cookie', list: [] });
    }
    return '';
}

function playerContent(flag, id) {
    // Java Cloud.playerContent：guangya_* 旗标 → C0342a0.x.W(flag, id)（光鸭 SDK 取直链）。
    // GuangYa 网盘 SDK（C0342a0，96KB 深度反射混淆）无法静态还原 → 显式失败说明。
    return playFail('光鸭', '光鸭网盘取直链依赖的 C0342a0 SDK（OAuth 登录/文件列表/直链 API）在混淆层无法静态还原，JS 版未实现播放');
}

/** init：站点探测 + Cookie 优先级链（Java 1:1） */
function init(ext) {
    let json = {};
    try {
        json = typeof ext === 'string' ? (isEmpty(ext) ? {} : JSON.parse(ext)) : (ext || {});
    } catch (e) {
        json = {};
    }
    extCfg = json;
    // 站点列表（site 数组 / 单值 / ext 原文 http 前缀 / 默认）
    const sites = [];
    const addSite = function (s) {
        if (isEmpty(s)) return;
        let t = String(s).trim();
        while (t.endsWith('/')) t = chop(t);
        if (isEmpty(t) || sites.indexOf(t) >= 0) return;
        sites.push(t);
    };
    if (Object.prototype.hasOwnProperty.call(json, 'site') && json.site !== undefined && json.site !== null) {
        if (Array.isArray(json.site)) {
            for (const s of json.site) addSite(s);
        } else {
            addSite(json.site);
        }
    } else {
        addSite(json.site);
    }
    if (sites.length === 0 && typeof ext === 'string' && !isEmpty(ext) && ext.trim().startsWith('http')) {
        addSite(ext);
    }
    if (sites.length === 0) addSite(C[0]);
    // 探测可用站点（200-500 或解密挑战页 → 取第一个可达站点；否则默认）
    let picked = C[0];
    for (const s of sites) {
        try {
            const headers = { 'User-Agent': UA };
            headers['Referer'] = s + '/';
            headers['Accept'] = 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8';
            const res = E('GET', s + '/', null, headers);
            const code = res.code;
            if ((code >= 200 && code < 500 && !isEmpty(res.body)) || isDecryptable(res.body)) {
                picked = s;
                break;
            }
        } catch (e) { }
    }
    // Cookie 优先级链：ext.cookie → ext.guangya_qsxy_cookie → KV(.diy_cookie) → KV(diy_cookie)
    let opt = json['cookie'] || '';
    if (isEmpty(opt)) opt = json['guangya_qsxy_cookie'] || '';
    if (isEmpty(opt)) opt = z(kvGet('.diy_cookie'));
    if (isEmpty(opt)) opt = z(kvGet('diy_cookie'));
    cfgCookie = Y(opt);
    let strY = Y(json['cookie'] || '');
    if (isEmpty(strY)) strY = Y(json['guangya_qsxy_cookie'] || '');
    const saved = getSavedCookie();
    hasCfgCookie = !isEmpty(strY);
    if (hasCfgCookie) {
        persistCookie = false;
    } else if (isEmpty(saved)) {
        persistCookie = false;
        strY = cfgCookie;
    } else {
        persistCookie = true;
        strY = saved;
    }
    curCookie = strY;
    site = picked;
    cookieJarInit = true;
    g0(site + '/', j());
}

// ============================ 导出（catvod JsSpider 协议） ============================

export default {
    init: function (ext) {
        init(ext);
        log('[PanWebShareGuangYa] init site=' + site + ' cookie=' + (hasSavedCookie() ? 'saved' : (hasCfgCookie ? 'ext' : 'none')));
        return '';
    },
    home: function (filter) {
        return home();
    },
    homeVod: function () {
        return '';
    },
    category: function (tid, pg, filter, extend) {
        return category(tid, pg);
    },
    detail: function (id) {
        return detail([String(id)]);
    },
    search: function (key, quick, pg) {
        return searchContent(key, quick, pg);
    },
    play: function (flag, id, vipFlags) {
        return playerContent(flag, id);
    },
    action: function (act) {
        return actionContent(act);
    },
    proxy: function (params) {
        return [404, 'text/plain', 'not implemented', {}];
    },
};

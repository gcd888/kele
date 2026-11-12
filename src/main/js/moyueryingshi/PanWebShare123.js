/**
 * PanWebShare123.js — 123网盘社区聚合（123panfx.com / pan1.me 论坛，catvod JsSpider 协议 JS 版）
 *
 * 移植自（1:1）：E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\readable_sources\com\github\catvod\spider\PanWebShare123.java
 *（extends Cloud；FishCrypto.beginHostEntry/endHostEntry 包装、Init.init(context) 丢弃）
 *
 * 移植差异（壳协议约束，逻辑不变）：
 *  - FishCrypto.b(str) 恒等透传；C0297t1 KV（panwebshare123_cookie/.panwebshare123_cookie/
 *    .diy_cookie/diy_cookie）→ 壳 global local（缺省回退模块内存）；
 *  - init 站点探测：Java HttpURLConnection HEAD(跟随重定向,200-399) → JS 宿主 req 无状态码，
 *    改用 GET 非空正文判定（10s 超时）；全失败取首个候选（与 Java 一致）；
 *  - Cloud.a/b/c 网盘线路组装：分类/命名/开关保留；网盘驱动解析引擎（Pan123/Quark/… 转存链路）
 *    不在本文件移植范围 → 与 Java「网盘未授权」分支一致（PlayGroup 空 → 线路为空），已知网盘类型
 *    detail/play 报"请先完成网盘授权"；帖子内网盘链接的提取/提取码配对/去重逻辑完整保留；
 *  - 自动回复 w()：完整移植（表单 doctype=1、随机回复语、D(N) 成功判定、r(N) 错误文案）；
 *    Thread.sleep(1200 重试间隔 / 21000 防灌水间隔) → JS 同步环境无 sleep，跳过等待（仅时序差异）；
 *    okhttp 状态码不可得 → 按 0 处理（>=400 分支不可达，由响应体关键词兜底）；
 *  - action（配置Cookie/Cookie教程弹窗）→ JS 无法弹窗，按 Java 返回 ""（settings 分类照常输出，
 *    Cookie 可经 ext {cookie|123panfx_cookie} 或 local KV 预置）；
 *  - jsoup → cheerio（T()=ownText 用 clone().children().remove() 近似）；org.json → JSON.parse 辅助；
 *    正则 Pattern.CASE_INSENSITIVE(flag=2) → JS /i；URLEncoder → javaUrlEncode；
 *    N1.d(vod)/AbstractC0280n1.p/q 历史记录 → 丢弃。
 *
 * 宿主依赖：req/joinUrl/local/console；lib/cheerio.min.js、lib/binutil.js、./muCore.js。
 */

import { httpGet, httpPost, bodyOf, headersOf, javaUrlEncode, vod, pageData, detailData, playData } from './muCore.js';
import { bytesToB64, b64ToBytes, utf8ToBytes, bytesToUtf8 } from '../lib/binutil.js';
import cheerio from '../lib/cheerio.min.js';

function log(...a) { try { console.log('[Pan123社区]', ...a); } catch (e) { } }

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

// ============================ merge 框架等价层（与 WoNiu.js/Gying.js 同源语义） ============================

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
function biDate(json) {
    if (!json) return 0;
    const s = biPick(optStr(json, 'datetime'), optStr(json, 'date'), optStr(json, 'time'));
    if (biEmpty(s) || s.indexOf('0001-') === 0) return 0;
    const m = RE_DATE.exec(s);
    if (!m && /^(?:19|20)\d{2}$/.test(s)) return parseInt(s, 10) * 10000;
    if (!m) return optInt(json, '_timestamp', 0);
    return parseInt(m[3], 10) + parseInt(m[2], 10) * 100 + parseInt(m[1], 10) * 10000;
}
const RE_SIZE_Q = /(\d+(?:\.\d+)?)\s*(TB|GB|MB|KB|T|G|M)\b/i;
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
function panSupported(url) { return !!panType(url); }
function panDisplay(key) { return PAN_DISPLAY[key] || key || ''; }
function panSwitchEnabled(key) { return true; }   // C0299u0.e0：默认开启
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

// ============================ PanWebShare123 站点逻辑 ============================

const SITES = ['https://123panfx.com', 'https://pan1.me'];
const REPLIES = ['感谢楼主分享！', '这个资源太棒了！', '已收藏，谢谢！', '不错的资源，支持一下', '楼主辛苦了！', '内容很有用，感谢分享'];
const UA_PC_77 = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36';
const UA_IPHONE16 = 'Mozilla/5.0 (iPhone; CPU iPhone OS 16_6 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.6 Mobile/15E148 Safari/604.1';
// Pattern(flag=2)=CASE_INSENSITIVE
const RE_LINK_123 = /((?:www\.)?(?:123\w{3}\.com|123pan\.(?:com|cn)|share\.123pan\.cn)\/(?:s|123pan)\/[^\s"'<>]+)/gi;
const RE_LINK_HTTP = /(https?:\/\/[^\s"'<>]+(?:\.html)?)/gi;
const RE_CODE = /(?:提取码|访问码|密码|码)\s*[:：=]?\s*([A-Za-z0-9]{4,8})/i;
const RE_THREAD = /thread-(\d+)/;

let siteUrl = SITES[0];
let globalSite = SITES[0];     // static w
let sessionCookie = '';        // this.s
let replyMsg = '';             // this.t
let lastReplyAt = 0;           // this.u

// ---- HTTP（X1.X/N：失败=空串/状态0） ----
function tryBody(url, headers, timeoutMs) {
    try { return bodyOf(httpGet(url, headers, timeoutMs)); } catch (e) { log('http fail:', String(url).substring(0, 100), e && e.message); return ''; }
}
function tryPost(url, body, headers) {
    const h = Object.assign({}, headers || {});
    if (!h['Content-Type']) h['Content-Type'] = 'application/x-www-form-urlencoded; charset=UTF-8';
    try { const res = httpPost(url, body, h); return { status: 0, body: bodyOf(res), headers: headersOf(res) }; }
    catch (e) { log('post fail:', String(url).substring(0, 100), e && e.message); return { status: 0, body: '', headers: {} }; }
}
function fetchDoc(path) { return cheerio.load(tryBody(path, siteHeaders()) || ''); }

// ---- Cookie（F/v/getSavedCookie/saveCookie/clearCookie/h） ----
function getSavedCookie() {
    const a = normalizeCookie(kvGet('panwebshare123_cookie'));
    return biEmpty(a) ? normalizeCookie(kvGet('.panwebshare123_cookie')) : a;
}
function hasSavedCookie() { return !biEmpty(getSavedCookie()); }
function saveCookie(str) {
    const s = normalizeCookie(str);
    if (biEmpty(s)) clearCookie();
    else kvSet('panwebshare123_cookie', s);
}
function clearCookie() { kvDel('panwebshare123_cookie'); kvDel('.panwebshare123_cookie'); }
function getCurrentSiteUrl() { return biEmpty(globalSite) ? SITES[0] : globalSite; }
/** v(str)：JSON 内 123panfx_cookie/cookie 提取。 */
function cookieFromJson(str) {
    try {
        if (biEmpty(str)) return '';
        const j = tryParse(str);
        if (!j) return '';
        let ck = optStr(j, '123panfx_cookie');
        if (biEmpty(ck)) ck = optStr(j, 'cookie');
        return normalizeCookie(ck);
    } catch (e) { return ''; }
}
/** F(str)：Cookie 输入归一（JSON/cookie:前缀/换行）。 */
function normalizeCookie(str) {
    if (str === null || str === undefined) return '';
    let s = String(str).trim();
    if (biEmpty(s)) return '';
    if (s.indexOf('{') === 0) {
        const v = cookieFromJson(s);
        if (!biEmpty(v)) return v;
    }
    if (s.toLowerCase().indexOf('cookie:') === 0) s = s.substring(7).trim();
    return s.split('\r').join('\n').split('\n').join('; ').trim();
}
/** h()：生效 Cookie。 */
function activeCookie() {
    let ck = getSavedCookie();
    if (biEmpty(ck)) ck = sessionCookie;
    return ck === null || ck === undefined ? '' : ck;
}
/** B()：论坛请求头。 */
function siteHeaders() {
    const h = {
        'User-Agent': UA_PC_77,
        'Referer': siteUrl,
        'Accept-Language': 'zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6',
    };
    const ck = activeCookie();
    if (!biEmpty(ck)) h['Cookie'] = ck;
    return h;
}
/** K()：搜索请求头。 */
function searchHeaders() {
    const h = {
        'User-Agent': UA_IPHONE16,
        'Referer': siteUrl,
        'X-Requested-With': 'XMLHttpRequest',
    };
    const ck = activeCookie();
    if (!biEmpty(ck)) h['Cookie'] = ck;
    return h;
}

// ---- jsoup 等价（T()=ownText 近似） ----
function ownText($el) {
    const c = $el.clone();
    c.children().remove();
    return c.text().trim();
}
function docText(doc) { return doc.root().text().replace(/\s+/g, ' ').trim(); }
/** M(str)：去前导斜杠。 */
function stripSlashes(str) {
    let s = str;
    while (s && s.indexOf('/') === 0) s = s.substring(1);
    return s;
}
/** E(str)：链接归一。 */
function absLink(str) {
    if (str === null) return '';
    let s = String(str).trim().split('&amp;').join('&').split('.html').join('');
    if (s.indexOf('//') === 0) s = 'https:' + s;
    if (s.toLowerCase().indexOf('http') === 0) return s;
    return (s.indexOf('.com') >= 0 || s.indexOf('.cn') >= 0) ? 'https://' + s : s;
}
/** N(str)：链接/标题净化（截断提取码等尾巴、去尾标点）。 */
function cleanTitle(str) {
    if (str === null) return '';
    let s = String(str).trim().split('&amp;').join('&').split('.html').join('');
    const keys = ['提取码', '访问码', '密码', '复制', '保存后', '链接：', '链接:'];
    for (let i = 0; i < 7; i++) {
        const idx = s.indexOf(keys[i]);
        if (idx > 0) s = s.substring(0, idx);
    }
    for (; ; ) {
        const last = s.charAt(s.length - 1);
        if (last !== '。' && last !== '，' && last !== ',' && last !== ';' && last !== '；' && last !== '#') return s.trim();
        s = s.substring(0, s.length - 1);
    }
}
/** s(str)：帖子正文清理。 */
function cleanMessageText(str) {
    if (biEmpty(str)) return '';
    return String(str)
        .split('请您务必转存保存后再进行下载，以免消耗分享者的免登流量').join('')
        .split('&amp;').join('&')
        .split('&nbsp;').join('')
        .split('\\/').join('/')
        .split('.html').join('')
        .replace(/\s+/g, '');
}
/** t(str)：HTML 标签/实体剥离 → 纯文本。 */
function stripTags(str) {
    if (str === null) return '';
    return String(str).replace(/<[^>]+>|&(?:#\d+;|#x[\da-fA-F]+;|[a-z]+);/g, '').trim();
}
/** x(str)：上下文提取码。 */
function extractionCode(str) {
    if (str === null) return '';
    const m = RE_CODE.exec(String(str));
    return m ? m[1] : '';
}
/** processExtractionCode：?pwd 去重/提取码内联化。 */
function processExtractionCode(obj) {
    if (typeof obj !== 'string') return obj;
    let s = obj.split('链接：').join('');
    s = s.replace(/(\?pwd=[a-zA-Z0-9]+)(.*?)\?pwd=[a-zA-Z0-9]+/g, '$1$2');
    const hasPwd = /\?pwd=[a-zA-Z0-9]{4,8}/i.test(s);
    if (hasPwd) {
        s = s.replace(/(提取码[\s:：]*[a-zA-Z0-9]{4,8}|访问码[\s:：]*[a-zA-Z0-9]{4,8}|密码[\s:：]*[a-zA-Z0-9]{4,8}|码[\s:：]*[a-zA-Z0-9]{4,8})/g, '').trim();
    } else {
        s = s.replace(/(https?:\/\/[^\s]+)(提取码[\s:：]*|访问码[\s:：]*|密码[\s:：]*|码[\s:：]*)([a-zA-Z0-9]{4,8})/gi, '$1?pwd=$3');
    }
    s = s.replace(/\?\?pwd=/g, '?pwd=');
    s = s.replace(/#$/, '');
    return s;
}
/** J(str)：processExtractionCode + E。 */
function processJ(str) {
    if (str === null) return '';
    const obj = processExtractionCode(String(str).split('.html').join(''));
    return typeof obj === 'string' ? absLink(obj) : '';
}
/** m(url, code)：追加 pwd 参数（完整 URL）。 */
function appendPwd(url, code) {
    if (biEmpty(url) || biEmpty(code)) return url;
    if (url.indexOf('pwd=') >= 0) return url;
    const sep = url.indexOf('?') >= 0 ? '&' : '?';
    return url + sep + 'pwd=' + code;
}
/** k(str, code)：pwd 后缀（仅 query 部分，供外层拼接）。 */
function pwdSuffix(str, code) {
    let codeX = extractionCode(code);
    if (biEmpty(codeX) && code !== null && /^[A-Za-z0-9]{4,8}$/.test(code)) codeX = code;
    if (biEmpty(codeX)) return code === null ? '' : code;
    const lower = String(str).toLowerCase();
    const isPan = (lower.indexOf('/s/') >= 0 || lower.indexOf('/123pan/') >= 0)
        && (lower.indexOf('123pan.com') >= 0 || lower.indexOf('123pan.cn') >= 0 || lower.indexOf('share.123pan.cn') >= 0 || lower.indexOf('123684.com') >= 0 || lower.indexOf('123865.com') >= 0 || lower.indexOf('123912.com') >= 0 || lower.indexOf('123592.com') >= 0 || /.*123\w{3}\.com\/(?:s|123pan)\/.*/.test(lower));
    if (!isPan) {
        return (String(str).indexOf('cloud.') < 0 || String(code).indexOf('码') >= 0) ? code : '访问码：' + code;
    }
    const sep = (!biEmpty(str) && String(str).indexOf('?') >= 0) ? '&' : '?';
    return sep + 'pwd=' + codeX;
}
/** A(str)：合格网盘链接（E+b1+开关）。 */
function panQualifiedLink(str) {
    if (biEmpty(str)) return '';
    const s = absLink(str).trim();
    const key = panType(s);
    return (biEmpty(key) || !panSwitchEnabled(key)) ? '' : s;
}
/** i(str, list)：合格链接去重收集。 */
function addPanLink(str, list) {
    const s = absLink(str).trim();
    if (biEmpty(s) || !panSupported(s)) return;
    const a = panQualifiedLink(s);
    if (biEmpty(a) || list.indexOf(a) >= 0) return;
    list.push(a);
}
/** u(str, list)：文本内网盘链接/提取码抽取。 */
function extractPanFromText(str, list) {
    if (biEmpty(str)) return;
    const size0 = list.length;
    let m;
    RE_LINK_123.lastIndex = 0;
    while ((m = RE_LINK_123.exec(str)) !== null) {
        const replaced = m[1].split('.html').join('');
        const url = 'https://' + cleanTitle(replaced);
        const ctx = replaced + str.substring(Math.min(str.length, m.index + m[0].length));
        addPanLink(processJ(appendPwd(url, extractionCode(ctx))), list);
    }
    RE_LINK_HTTP.lastIndex = 0;
    while ((m = RE_LINK_HTTP.exec(str)) !== null) {
        const replaced = m[1].split('.html').join('');
        const cleaned = cleanTitle(replaced);
        const ctx = replaced + str.substring(Math.min(str.length, m.index + m[0].length));
        addPanLink(processJ(appendPwd(cleaned, extractionCode(ctx))), list);
    }
    if (list.length === size0) {
        let code = extractionCode(str);
        if (biEmpty(code) && /^[A-Za-z0-9]{4,8}$/.test(str)) code = str;
        if (biEmpty(code)) {
            addPanLink(processJ(str), list);
        } else {
            if (list.indexOf(code) >= 0) return;
            list.push(code);
        }
    }
}
/** y(doc)：帖子 div.message 内网盘链接提取（含提取码配对）。 */
function extractLinks(doc) {
    const list = [];
    const $msg = doc('div.message').first();
    const boxes = [];
    if ($msg.length) {
        $msg.find('> div > div.alert').each(function () { boxes.push(doc(this)); });
        $msg.find('> div.alert').each(function () { boxes.push(doc(this)); });
        $msg.find('> section > div.alert').each(function () { boxes.push(doc(this)); });
        if (!boxes.length) boxes.push($msg);
    }
    for (const box of boxes) {
        const text = cleanMessageText(ownText(box));
        extractPanFromText(text, list);
        const html = cleanMessageText(box.html() || '');
        if (text !== html) extractPanFromText(html, list);
    }
    const anchors = [];
    if ($msg.length) $msg.find('a[href]').each(function () { anchors.push(doc(this)); });
    if (list.length === 1) {
        const first = list[0];
        if (first.indexOf('http') < 0 && list.length === 1 && first.indexOf('http') < 0) {
            for (const a of anchors) {
                const href = absLink(a.attr('href') || '');
                if (panSupported(href) && (href.indexOf('/s/') >= 0 || href.indexOf('/t/') >= 0 || href.indexOf('/123pan/') >= 0)) {
                    list[0] = href + pwdSuffix(href, first);
                    break;
                }
            }
        }
    }
    for (const a of anchors) {
        const href = absLink(a.attr('href') || '');
        if (panSupported(href)) {
            const link = processJ(href);
            const $parent = a.parent();
            const ctx = $parent.length ? ownText($parent) : ownText(a);
            addPanLink(appendPwd(link, extractionCode(ctx)), list);
        }
    }
    let code = '', panUrl = '', panIdx = -1;
    for (let i = 0; i < list.length; i++) {
        const s = list[i];
        if (biEmpty(s)) continue;
        if (panSupported(s)) {
            if (!biEmpty(panUrl)) return list;
            panUrl = s;
            panIdx = i;
        } else if (/^[A-Za-z0-9]{4,8}$/.test(s)) {
            if (!biEmpty(code)) return list;
            code = s;
        }
    }
    if (panIdx >= 0 && !biEmpty(code) && panUrl.indexOf('?pwd=') < 0) {
        list[panIdx] = panUrl + pwdSuffix(panUrl, code);
        const ci = list.indexOf(code);
        if (ci >= 0) list.splice(ci, 1);
    }
    return list;
}
/** G(list)：合格链接去重（恰 2 条时优先带 pwd= 的）。 */
function dedupePanLinks(list) {
    const seen = new Set();
    const out = [];
    for (const s of list) {
        const a = panQualifiedLink(s);
        if (!biEmpty(a) && !seen.has(a)) { seen.add(a); out.push(a); }
    }
    if (out.length === 2) {
        const withPwd = [];
        for (const s of out) if (s.indexOf('pwd=') >= 0) withPwd.push(s);
        if (withPwd.length) return withPwd;
    }
    return out;
}
/** H(list)：网盘显示名（" / " 连接）。 */
function panNamesOf(list) {
    const seen = new Set();
    for (const s of list) {
        const key = panType(s);
        const name = biEmpty(key) ? '' : panDisplay(key);
        if (!biEmpty(name)) seen.add(name);
    }
    if (!seen.size) return '网盘';
    return Array.from(seen).join(' / ');
}
/** z(str)：帖子 ID。 */
function threadId(str) {
    const m = RE_THREAD.exec(str || '');
    if (m) return m[1];
    const i = (str || '').indexOf('thread-');
    if (i >= 0) {
        const from = i + 7;
        const dot = str.indexOf('.', from);
        if (dot > from) return str.substring(from, dot);
    }
    return '';
}
/** C(doc)：论坛权限拦截判定。 */
function isLoginDenied(doc) {
    const t = docText(doc);
    return t.indexOf('用户组无权访问') >= 0 || t.indexOf('无权访问该板块') >= 0 || t.indexOf('需要登录才能访问') >= 0 || t.indexOf('您没有权限访问') >= 0;
}
/** L(list)：设置条目分页包装。 */
function settingsPage(list) {
    const size = list.length;
    return pageData(list, 1, 1, Math.max(1, size), size);
}
/** p(str)：Cookie 配置条目。 */
function cookieEntry(msg) {
    return vod('pan123_community_cookie', '配置123社区Cookie', '', (biEmpty(msg) ? '点击管理Cookie' : msg) + ' · ' + getCurrentSiteUrl(), { action: 'pan123_community_cookie' });
}
/** q()：Cookie 教程条目。 */
function helpEntry() {
    return vod('pan123_cookie_help', 'Cookie获取教程', '', '推荐使用Via浏览器 · ' + getCurrentSiteUrl(), { action: 'pan123_cookie_help' });
}
/** o(str)：提示页。 */
function noticePage(msg) {
    return settingsPage([cookieEntry(msg), helpEntry()]);
}

// ---- I(doc)：板块帖子列表解析 ----
function parseForum(doc) {
    const out = [];
    doc('ul.threadlist > li').each(function () {
        const $li = doc(this);
        if ((($li.find('i').first().attr('data-placement') || '') + '').indexOf('top') >= 0) return;
        const $a = $li.find('div > div.subject > a, div > div.style3_subject > a').first();
        if (!$a.length) return;
        const href = ($a.attr('href') || '') + '';
        const title = ownText($a);
        let img = ($li.find('a > img').first().attr('src') || '') + '';
        if (!biEmpty(img) && img.indexOf('http') !== 0) img = siteUrl + '/' + stripSlashes(img);
        const badge = $li.find('div > div.subject > a.badge, div > div.style3_subject > a.badge').first().text().trim();
        if (!biEmpty(href) && !biEmpty(title)) out.push(vod(href, title, img, badge));
    });
    if (!out.length) {
        const seen = new Set();
        doc('a[href*=thread-]').each(function () {
            const $a = doc(this);
            const href = ($a.attr('href') || '') + '';
            if (biEmpty(href) || href.indexOf('thread-create') >= 0 || href.indexOf('.htm') < 0 || seen.has(href)) return;
            seen.add(href);
            let title = stripTags(ownText($a));
            if (biEmpty(title)) title = stripTags(($a.attr('title') || '') + '');
            const $box = $a.closest('li, .card, .media, .thread, .list-group-item');
            let img = '', badge = '';
            if ($box.length) {
                img = ($box.find('img').first().attr('src') || '') + '';
                badge = $box.find('.badge, .tag, .text-muted').first().text().trim();
            }
            if (!biEmpty(img) && img.indexOf('http') !== 0) img = siteUrl + '/' + stripSlashes(img);
            if (!biEmpty(title)) out.push(vod(href, title, img, badge));
        });
    }
    return out;
}

// ---- w(str, url)：自动回复解锁 ----
function replySuccess(res) {
    const body = res.body || '';
    if (res.status >= 400) return false;   // JS 状态不可得（=0），由响应体关键词兜底
    const b = body || '';
    if (b.indexOf('请先登录') >= 0 || b.indexOf('请登录') >= 0 || b.indexOf('登录后') >= 0) return false;
    if (b.indexOf('失败') >= 0) return false;
    if (b.indexOf('错误') >= 0 || b.indexOf('无权') >= 0 || b.indexOf('权限') >= 0 || b.indexOf('太快') >= 0 || b.indexOf('频繁') >= 0 || b.indexOf('灌水') >= 0 || b.indexOf('验证码') >= 0 || b.indexOf('审核') >= 0) return false;
    try {
        const j = tryParse(b);
        if (j && typeof j === 'object' && !Array.isArray(j)) {
            if ('code' in j) return optInt(j, 'code', -1) === 0;
            const msg = optStr(j, 'message') + optStr(j, 'msg');
            if (msg.indexOf('成功') >= 0) return true;
            return !(msg.indexOf('失败') >= 0 || msg.indexOf('错误') >= 0);
        }
    } catch (e) { }
    return false;
}
function replyError(res) {
    let out = '';
    const body = res.body || '';
    if (res.status >= 400) return '自动回复失败：HTTP ' + res.status;
    try {
        const j = tryParse(body);
        if (j && typeof j === 'object' && !Array.isArray(j)) {
            let msg = optStr(j, 'message');
            if (biEmpty(msg)) msg = optStr(j, 'msg');
            if (!biEmpty(msg)) return '自动回复失败：' + msg;
        }
    } catch (e) { }
    if (body) {
        let s = body.split('\r').join(' ').split('\n').join(' ');
        if (s.length > 160) s = s.substring(0, 160);
        out = s;
    }
    return biEmpty(out) ? '自动回复失败：空响应' : '自动回复失败：' + out;
}
function autoReply(id, url) {
    replyMsg = '';
    if (biEmpty(activeCookie())) {
        replyMsg = '当前帖子需要回复后查看，请先配置社区Cookie';
        return false;
    }
    try {
        // Java：距上次回复 <21000ms 时 Thread.sleep(21000-gap)——JS 同步环境无 sleep，跳过等待
        const tid = threadId(id);
        if (biEmpty(tid)) {
            replyMsg = '自动回复失败：帖子ID无效';
            return false;
        }
        const headers = siteHeaders();
        if (!biEmpty(url)) headers['Referer'] = url;
        headers['Origin'] = siteUrl;
        headers['X-Requested-With'] = 'XMLHttpRequest';
        headers['Content-Type'] = 'application/x-www-form-urlencoded; charset=UTF-8';
        const msg = REPLIES[Math.floor(Math.random() * REPLIES.length)];
        const body = 'doctype=1&return_html=0&quotepid=&message=' + javaUrlEncode(msg) + '&quick_reply_message=4';
        const res = tryPost(siteUrl + '/post-create-' + tid + '-1.htm', body, headers);
        lastReplyAt = Date.now();
        const ok = replySuccess(res);
        replyMsg = ok ? '' : replyError(res);
        return ok;
    } catch (e) {
        replyMsg = '自动回复失败：' + (e && e.message ? e.message : e);
        return false;
    }
}

// ---- n(url, links)：详情内容拼装 ----
function buildContent(url, links) {
    const sb = [];
    const line = (k, v) => { if (!biEmpty(v)) sb.push(k + ': ' + v); };
    line('来源', siteUrl);
    line('帖子', url);
    if (!links.length) {
        line('状态', '未提取到可用网盘链接');
        line('提示', '请检查123网盘播放开关、社区Cookie或帖子是否仍需回复');
        return sb.join('\n');
    }
    line('网盘', panNamesOf(links));
    line('数量', links.length + '条');
    line('提示', '已提取播放列表，直接选择线路播放');
    const n = Math.min(3, links.length);
    if (n > 0) {
        sb.push('');
        sb.push('链接:');
        for (let i = 0; i < n; i++) sb.push(links[i]);
        if (links.length > n) sb.push('...已省略' + (links.length - n) + '条原始链接');
    }
    return sb.join('\n');
}

// ============================ 协议方法 ============================

function homeContent(filter) {
    try {
        const classes = [];
        classes.push({ type_id: '2', type_name: '电影' });
        classes.push({ type_id: '48', type_name: '剧集' });
        classes.push({ type_id: '56', type_name: '4K原盘' });
        classes.push({ type_id: '52', type_name: '综艺' });
        classes.push({ type_id: '37', type_name: '动漫' });
        classes.push({ type_id: 'pan123_settings', type_name: '设置' });
        return JSON.stringify({ class: classes, list: [] });
    } catch (e) {
        log('home FAIL', e && e.message);
        return JSON.stringify({ class: [], list: [] });
    }
}

function categoryContent(tid, pg, filter, extend) {
    let page = 1;
    try { page = Math.max(1, parseInt(pg, 10)); } catch (e) { }
    if (isNaN(page)) page = 1;
    try {
        if (tid === 'pan123_settings') {
            if (page > 1) return settingsPage([]);
            const list = [];
            list.push(cookieEntry(hasSavedCookie() ? '已配置，点击可更新或清除' : '未配置，点击粘贴登录Cookie'));
            list.push(helpEntry());
            return settingsPage(list);
        }
        const doc = fetchDoc(siteUrl + '/forum-' + tid + '-' + page + '.htm');
        if (isLoginDenied(doc)) return noticePage('当前站点需要登录');
        const list = parseForum(doc);
        return pageData(list, page, list.length ? page + 1 : page, 20, page * 20 + list.length);
    } catch (e) {
        log('category FAIL', tid, e && e.message);
        return JSON.stringify({ list: [] });
    }
}

function detailContent(list) {
    try {
        const id = (list && list.length) ? String(list[0]) : '';
        if (biEmpty(id)) return JSON.stringify({ code: 1, list: [{}] });
        if (id === 'pan123_community_cookie' || id === 'pan123_cookie_help') return '';
        const url = id.indexOf('http') === 0 ? id : siteUrl + '/' + stripSlashes(id);
        try {
            let rawLinks = [];
            let needReply = false;
            let replied = false;
            let doc = null;
            for (let i = 0; i < 3; i++) {
                doc = fetchDoc(url);
                if (isLoginDenied(doc)) return noticePage('当前帖子需要登录');
                rawLinks = extractLinks(doc);
                const $msg = doc('div.message').first();
                const msgText = $msg.length ? ownText($msg) : doc('div.message').text().trim();
                needReply = msgText.indexOf('请回复后再查看') >= 0;
                if (rawLinks.length || !needReply) break;
                if (!replied) {
                    replied = autoReply(id, url);
                    if (!replied) return noticePage(biEmpty(replyMsg) ? '自动回复失败，请检查社区账号' : replyMsg);
                }
                // Java Thread.sleep(1200) —— JS 同步环境无 sleep，跳过
            }
            const links = dedupePanLinks(rawLinks);
            if (!links.length && needReply) {
                return noticePage(replied ? '自动回复后仍未解锁，请检查Cookie' : '当前帖子需要回复后查看');
            }
            let title = '';
            const $t = doc('h4, h1, .thread-title, .thread_subject, .card-title').first();
            if ($t.length) title = stripTags(ownText($t));
            if (biEmpty(title)) title = doc('title').first().text().trim();
            const v = vod(id, title, '', '');
            v.type_name = '123社区';
            v.vod_remarks = links.length ? panNamesOf(links) + ' ' + links.length + '条' : '未提取到链接';
            v.vod_content = buildContent(url, links);
            if (links.length) {
                v.vod_play_url = cloudPlayUrls(links);
                v.vod_play_from = cloudPlayFrom(links);
            }
            return detailData(v);
        } catch (e2) {
            return JSON.stringify({ code: 1, list: [{}] });
        }
    } catch (e) {
        log('detail FAIL', e && e.message);
        return JSON.stringify({ code: 1, list: [{}] });
    }
}
function cloudPlayUrls(links) { try { return cloudJoinGroups(cloudPlayGroups(links), false); } catch (e) { return ''; } }
function cloudPlayFrom(links) { try { return cloudJoinGroups(cloudPlayGroups(links), true); } catch (e) { return ''; } }

function searchContentP(key, quick, pageStr) {
    if (String(pageStr) !== '1') return JSON.stringify({ list: [] });
    try {
        const body = tryBody(siteUrl + '/search.htm?keyword=' + javaUrlEncode(key), searchHeaders());
        const arr = (tryParse(body) || {}).message;
        const out = [];
        if (!Array.isArray(arr)) return JSON.stringify({ list: out });
        for (const item of arr) {
            if (!item || typeof item !== 'object') continue;
            let url = optStr(item, 'url');
            if (biEmpty(url) && !biEmpty(optStr(item, 'tid'))) url = 'thread-' + optStr(item, 'tid') + '.htm';
            const title = stripTags(optStr(item, 'subject'));
            let pic = optStr(item, 'user_avatar_url');
            if (!biEmpty(pic) && pic.indexOf('http') !== 0) pic = siteUrl + '/' + stripSlashes(pic);
            if (!biEmpty(url) && !biEmpty(title)) out.push(vod(url, title, pic, ''));
        }
        return JSON.stringify({ list: out });
    } catch (e) {
        log('search FAIL', e && e.message);
        return JSON.stringify({ list: [] });
    }
}

function playerContent(flag, id, vipFlags) {
    try {
        return cloudPlayerContent(flag, id);
    } catch (e) {
        log('play FAIL', e && e.message);
        return JSON.stringify({ list: [], msg: '播放失败：' + (e && e.message ? e.message : '') });
    }
}

function actionContent(action) {
    try {
        if (action === 'pan123_community_cookie' || action === 'pan123_cookie_help') return '';   // Java 弹窗，JS 返回 ""
        return '';
    } catch (e) { return ''; }
}

// ============================ 导出 ============================

export default {
    init(ext) {
        try {
            let str = ext === undefined || ext === null ? '' : (typeof ext === 'object' ? JSON.stringify(ext) : String(ext));
            const extObj = tryParse(str) || {};
            const candidates = [];
            const jAdd = (s) => {
                let t = (s === null || s === undefined) ? '' : String(s).trim();
                while (t && t.charAt(t.length - 1) === '/') t = t.substring(0, t.length - 1);
                if (biEmpty(t) || candidates.indexOf(t) >= 0) return;
                candidates.push(t);
            };
            if (Array.isArray(extObj.site)) {
                for (const s of extObj.site) jAdd(s);
            } else {
                jAdd(optStr(extObj, 'site'));
            }
            if (!candidates.length && !biEmpty(str) && str.trim().indexOf('http') === 0) jAdd(str);
            if (!candidates.length) {
                jAdd(SITES[0]);
                jAdd(SITES[1]);
            }
            // 站点探测：Java HEAD(200-399) → JS GET 非空正文（状态码宿主不可得）
            let site = candidates.length ? candidates[0] : SITES[0];
            for (const cand of candidates) {
                try {
                    const body = tryBody(cand, {}, 10000);
                    if (!biEmpty(body)) { site = cand; break; }
                } catch (e) { continue; }
            }
            siteUrl = site;
            globalSite = site;
            let ck = optStr(extObj, 'cookie');
            if (biEmpty(ck)) ck = optStr(extObj, '123panfx_cookie');
            if (biEmpty(ck)) ck = cookieFromJson(kvGet('.diy_cookie'));
            if (biEmpty(ck)) ck = cookieFromJson(kvGet('diy_cookie'));
            sessionCookie = normalizeCookie(ck);
            log('init site=' + siteUrl + ' cookie=' + (biEmpty(activeCookie()) ? 'no' : 'yes'));
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

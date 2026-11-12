/**
 * music_core_mv.js — 果果音乐四个 MV 站点源共享核心（JS 版，catvod JsSpider 协议）。
 *
 * 移植自：kele/src/main/java/luoxueyinyue/src/com/github/catvod/spider/music/MusicCore.java
 * 的 MV 相关分支（1:1 精确移植）：
 *  - 网易（芸映 csp_NeteaseMv）：mvHomeContent/mvCategoryContent/mvSearchContent/mvDetailContent
 *    + neMvUrl（weapi song/enhance/play/mv/url，1080→720→480 降级）；
 *  - 腾讯（秋映 csp_QqMv）：qqMv*（GetAllocTag 动态筛选 / GetAllocMvInfo MV 库 /
 *    client_search_cp t=12 搜索 / get_video_info_batch 详情）
 *    + qqMvUrl（gosrf.Stream.MvUrlProxy.GetMvUrls，mp4 多档取末档 https）；
 *  - 酷狗（枸映 csp_KugouMv）：kgMv*（mobilecdn v3/search/mv 热词分类即搜索）
 *    + kgMvUrl（gateway + x-router=trackermv.kugou.com，signature=salt+sorted(k=v)+salt）；
 *  - 咪咕（蜜映 csp_MiguMv）：mgMv*（recommend-mv 推荐 / bmw/search/video 搜索 /
 *    resourceinfo.do resourceType=D 详情与取流，HQ 优先拼 freevod.nf.migu.cn）；
 *  - playerContent MV 分支（mv/mvq/mvk/mvm 四前缀 uid → mp4 直链，flag='果剧音乐'/'MV' 同一直链）。
 *
 * 加密基建（与 MusicCore 逐行对齐）：
 *  - weapi：随机 16 字符 secKey → AES-CBC-128(固定 nonce key) → base64 → 再 AES-CBC-128(secKey)
 *    → base64 = params；secKey 反转后 RSA(NoPadding) modPow → 左补零 256 位 hex = encSecKey
 *    （真实 modPow，BigInt 实现；secKey 可注入固定值做 golden 对拍）；
 *  - linuxEparams：AES-128-ECB(LINUX_KEY hex 字节) + PKCS5 → 大写 HEX；
 *  - enc()：java.net.URLEncoder(UTF-8) 净效果（+→%20，保留 .-*_，!~'() 额外转义）；
 *  - withRandomIp：伪造 X-Real-IP/X-Forwarded-For（kuwo/migu/kugou 防频控同语义，MV 链路 QQ 搜索用）。
 *
 * 与 Java 版的差异（壳协议约束，算法不变）：
 *  - org.json → safeParse（咪咕 contentId 18 位大整数精度保护，禁用裸 JSON.parse）；
 *  - HttpURLConnection → 宿主全局 req()（gzip 由宿主透明处理）；
 *  - 静态缓存（KG_MV_CACHE / kgMid）为模块级单例，跨四个壳实例共享（Java static 同语义）；
 *  - 日志：fileLog → console.log，前缀由 createMvCore(tag) 注入（各壳自带 '[xx-js]'）。
 *
 * 依赖：lib/crypto-js.js（globalThis.CryptoJS，AES）、lib/xhs_sign.js（md5/wa/AES-CBC-PKCS5）、
 *       lib/binutil.js（hex/b64/utf8/safeParse/randomBytes）。
 */

// 副作用 import：crypto-js 挂 globalThis.CryptoJS（UMD 已补丁为 globalThis root）
import '../lib/crypto-js.js';
import { md5Hex, wa, waToBytes, aesCbcEncPad, bytesToBigIntBE } from '../lib/xhs_sign.js';
import { bytesToHex, bytesToB64, utf8ToBytes, safeParse, randomBytes } from '../lib/binutil.js';

const CryptoJS = globalThis.CryptoJS;

// ============================ 常量（与 MusicCore 逐字对齐） ============================

export const PLAY_FLAG = '果剧音乐';

const WEB_UA = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36';
const NE_REFERER = 'http://music.163.com';
const QQ_REFERER = 'https://y.qq.com/';
const KG_UA = 'Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1';
const KG_REFERER = 'http://m.kugou.com';
/** 酷狗 android 签名族盐值（kgMvUrl 签名用） */
const KG_SALT = 'OIlwieks28dk2k092lksi2UIkp';

const WE_NONCE = '0CoJUm6Qyw8W8jud';
const WE_IV = '0102030405060708';
const WE_PUB_MODULUS_HEX =
    '00e0b509f6259df8642dbc35662901477df22677ec152b5ff68ace615bb7b725152b3ab17a876aea8a5aa76d2e417629ec4ee341f56135fccf695280104e0312ecbda92557c93870114af6c9d05c4f7f0c3685b7a46bee255932575cce10b424d813cfe4875d3e82047b97ddef52741d546b8e289dc6935b3ece0462db0a22b8e7';
const WE_PUB_EXP = 0x10001n;
const RANDOM_CHARS = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789';
/** 网易云 linux/forward 通道密钥（hex 字面量 → 原始字节，非 ASCII） */
const LINUX_KEY = hexToBytesLocal('7246674226682325323F5E6544673A51');

// ============================ 基础工具 ============================

function hexToBytesLocal(hex) {
    const out = new Uint8Array(hex.length >> 1);
    for (let i = 0; i < out.length; i++) out[i] = parseInt(hex.substring(i * 2, i * 2 + 2), 16);
    return out;
}

/** org.json optString 净效果：缺失/null → def（def 缺省 ''），其余 String(value) */
function optS(o, k, def) {
    const v = o == null ? undefined : o[k];
    if (v === undefined || v === null) return def === undefined ? '' : def;
    return String(v);
}

/** org.json optInt/optLong 净效果：数字截断、数字字符串解析，失败回 def */
function optInt(o, k, def) {
    const v = o == null ? undefined : o[k];
    if (typeof v === 'number' && isFinite(v)) return Math.trunc(v);
    if (typeof v === 'string' && /^[+-]?\d+$/.test(v.trim())) return parseInt(v.trim(), 10);
    return def;
}

/** org.json optBoolean 净效果：boolean 原样；字符串 "true"/"false" 强转；否则回 def */
function optBool(o, k, def) {
    const v = o == null ? undefined : o[k];
    if (typeof v === 'boolean') return v;
    if (v === 'true') return true;
    if (v === 'false') return false;
    return def;
}

/** MusicCore.enc（java.net.URLEncoder + "+"/"%20"）：保留 A-Za-z0-9.-*_，!~'() 额外转义 */
export function enc(v) {
    return encodeURIComponent(String(v))
        .replace(/!/g, '%21')
        .replace(/'/g, '%27')
        .replace(/\(/g, '%28')
        .replace(/\)/g, '%29')
        .replace(/~/g, '%7E');
}

/** MusicCore.headers：kv 对 → 对象 */
function headers(...kv) {
    const m = {};
    for (let i = 0; i + 1 < kv.length; i += 2) m[kv[i]] = kv[i + 1];
    return m;
}

/** MusicCore.firstNonEmpty：取首个 trim 后非空值（返回 trim 结果） */
function firstNonEmpty(...values) {
    for (const v of values) {
        if (v != null && String(v).trim() !== '') return String(v).trim();
    }
    return '';
}

/** MusicCore.withRandomIp：随机国内 IP 头（防频控；已有 X-Forwarded-For 则跳过） */
function withRandomIp(base) {
    const h = base || {};
    if (h['X-Forwarded-For']) return h;
    const prefixes = [[116, 255], [116, 228], [218, 192], [124, 0], [14, 132],
        [183, 14], [58, 14], [113, 116], [120, 230]];
    const seg = prefixes[Math.floor(Math.random() * prefixes.length)];
    const ip = seg[0] + '.' + seg[1] + '.' + (1 + Math.floor(Math.random() * 254)) + '.' + (1 + Math.floor(Math.random() * 254));
    h['X-Forwarded-For'] = ip;
    h['X-Real-IP'] = ip;
    return h;
}

/** MusicCore.randomString（RANDOM_CHARS 表随机取样；rand 钩子可注入做 golden） */
function randomString(size) {
    let sb = '';
    for (let i = 0; i < size; i++) sb += RANDOM_CHARS.charAt(Math.floor(Math.random() * RANDOM_CHARS.length));
    return sb;
}

/** MusicCore.md5（UTF-8 → hex 小写） */
function md5(text) {
    return md5Hex(text);
}

/** String.format("%02d") */
function pad2(n) {
    return (n < 10 ? '0' : '') + n;
}

// ============================ HTTP（宿主 req 桥，Java http* 同语义） ============================

function httpGet(url, headersMap) {
    const h = Object.assign({}, headersMap || {});
    if (!h['User-Agent']) h['User-Agent'] = WEB_UA; // Java http() 默认 UA
    const res = req(url, { method: 'get', headers: h, timeout: 20000 });
    const content = res && res.content || '';
    if (!content) throw new Error('HTTP empty: ' + url); // Java: code>=400 抛异常
    return content;
}

function httpPost(url, headersMap, body) {
    const h = Object.assign({}, headersMap || {});
    if (!h['User-Agent']) h['User-Agent'] = WEB_UA;
    if (!h['Content-Type'] && !h['content-type']) h['Content-Type'] = 'application/x-www-form-urlencoded';
    const res = req(url, { method: 'post', headers: h, body: body == null ? '' : String(body), timeout: 20000 });
    const content = res && res.content || '';
    if (!content) throw new Error('HTTP empty: ' + url);
    return content;
}

function getJson(url, headersMap) {
    // 大整数安全解析（咪咕 contentId 18 位 / 网易长 id）
    return safeParse(httpGet(url, headersMap));
}

function postJson(url, headersMap, body) {
    return safeParse(httpPost(url, headersMap, body));
}

/** JSONObject optJSONObject 净效果：存在且非数组才视为对象 */
function optObj(o, k) {
    const v = o == null ? undefined : o[k];
    return v != null && typeof v === 'object' && !Array.isArray(v) ? v : null;
}

/** JSONArray optJSONArray 净效果：存在且为数组 */
function optArr(o, k) {
    const v = o == null ? undefined : o[k];
    return Array.isArray(v) ? v : null;
}

// ============================ 加密基建（weapi / linux） ============================

/** AES-CBC-128 PKCS5 加密（crypto-js，字节 key/iv） */
function aesCbc(text, key, iv) {
    return aesCbcEncPad(utf8ToBytes(text), key, iv);
}

/** AES-ECB PKCS5 加密（crypto-js，字节 key；MusicCore.aesEcb 同语义） */
function aesEcb(text, key) {
    return waToBytes(
        CryptoJS.AES.encrypt(wa(utf8ToBytes(text)), wa(key), { mode: CryptoJS.mode.ECB, padding: CryptoJS.pad.Pkcs7 }).ciphertext
    );
}

/** BigInt 模幂（RSA(NoPadding)：m^e mod n，方乘法） */
function modPow(base, exp, mod) {
    let result = 1n;
    let b = base % mod;
    let e = exp;
    while (e > 0n) {
        if (e & 1n) result = (result * b) % mod;
        b = (b * b) % mod;
        e >>= 1n;
    }
    return result;
}

/**
 * MusicCore.weapi：网易云 weapi 双重 AES-CBC + RSA(NoPadding)，返回 [params, encSecKey]。
 * 流程：随机 16 字符 secKey → AES-CBC-128(WE_NONCE, WE_IV) → base64（pass1）→
 *       AES-CBC-128(secKey, WE_IV) → base64（params）；secKey 字节反转 →
 *       BigInteger(1, bytes).modPow(65537, N).toString(16) 左补零至 256 位（encSecKey）。
 * 固定 secKey 输入时输出完全确定（golden 对拍入口）。
 */
export function weapi(json, fixedSecKey) {
    const secKey = fixedSecKey || randomString(16);
    const iv = utf8ToBytes(WE_IV);
    const pass1 = bytesToB64(aesCbc(json, utf8ToBytes(WE_NONCE), iv));
    const params = bytesToB64(aesCbc(pass1, utf8ToBytes(secKey), iv));
    const reversed = utf8ToBytes(secKey).slice().reverse(); // BigInteger(1, reversed)：BE 无符号
    let hex = modPow(bytesToBigIntBE(reversed), WE_PUB_EXP, BigInt('0x' + WE_PUB_MODULUS_HEX)).toString(16);
    while (hex.length < 256) hex = '0' + hex; // Java StringBuilder 左补零至 256
    return [params, hex];
}

/** MusicCore.linuxEparams：AES-128-ECB(LINUX_KEY) + PKCS5 → 大写 HEX */
export function linuxEparams(json) {
    return bytesToHex(aesEcb(json, LINUX_KEY)).toUpperCase();
}

// ============================ 通用输出（MusicCore 同构） ============================

/** MusicCore.splitUid：首下划线切分 {platform}_{id} */
export function splitUid(uid) {
    const s = String(uid);
    const bar = s.indexOf('_');
    if (bar <= 0) return null;
    return [s.substring(0, bar), s.substring(bar + 1)];
}

/** MusicCore.pageSafe：≥1 页码（Java parseInt 严格口径，非纯数字回 1） */
export function pageSafe(pg) {
    const s = String(pg == null ? '1' : pg).trim();
    if (!/^[+-]?\d+$/.test(s)) return 1;
    const n = parseInt(s, 10);
    return isNaN(n) ? 1 : Math.max(1, n);
}

/** MusicCore.filterValues：[{n,v}] */
function filterValues(...vals) {
    return vals.map(v => ({ n: v, v: v }));
}

/** MusicCore.pageDataEmpty：空分页页（limit 固定 20） */
export function pageDataEmpty(page) {
    return JSON.stringify({ list: [], page: page, pagecount: page, limit: 20, total: 0 });
}

/**
 * MV 列表 → 分页 JSON（MusicCore mvPageData/qqMvPage/kgMvPage/mgMvPage 四份同构实现收敛：
 * hasMore 时 pagecount=pg+1 支撑壳继续翻页；limit=max(源数组长度,1)；total=过滤后条数）。
 */
function mvPage(arr, pg, hasMore, itemFn) {
    const src = arr || [];
    const list = [];
    for (const item of src) {
        if (item == null) continue;
        const v = itemFn(item);
        if (v) list.push(v);
    }
    return JSON.stringify({
        list: list,
        page: pg,
        pagecount: hasMore ? pg + 1 : pg,
        limit: Math.max(src.length, 1),
        total: list.length,
    });
}

// ============================ 网易云 MV 源（csp_NeteaseMv，芸映） ============================

/** MusicCore.neHeaders */
function neHeaders() {
    return headers('Referer', NE_REFERER, 'Cookie', 'os=pc; appver=2.10.13');
}

/** MusicCore.mvItem：MV 条目 → vod JSON（uid=mv_{mvid}；cover/picUrl 双兼容，http 升 https） */
function mvItem(m) {
    const id = m.id == null ? '0' : String(m.id); // Java String.valueOf(optLong("id",0))：safeParse 大 id 保持字符串
    const name = optS(m, 'name').trim();
    if (!id || id === '0' || !name) return null;
    let cover = m.cover == null ? optS(m, 'picUrl') : String(m.cover);
    if (cover.indexOf('http://') === 0) cover = 'https://' + cover.substring(7);
    const artist = optS(m, 'artistName').trim();
    return {
        vod_id: 'mv_' + id,
        vod_name: name,
        vod_pic: cover,
        vod_remarks: artist,
        vod_actor: artist,
        vod_content: optS(m, 'briefDesc', optS(m, 'desc')).trim(),
    };
}

/** MusicCore.mvHomeContent：推荐/排行榜/最新/全部 四分类（排行榜/最新带地区筛选，全部带地区/类型/排序筛选） */
function mvHomeContent(filter) {
    try {
        const result = {};
        const classes = [
            { type_id: 'mv_rcmd', type_name: '推荐MV' },
            { type_id: 'mv_top', type_name: 'MV排行榜' },
            { type_id: 'mv_first', type_name: '最新MV' },
            { type_id: 'mv_all', type_name: '全部MV' },
        ];
        if (filter) {
            const areas = filterValues('全部', '内地', '港台', '欧美', '韩国', '日本');
            const types = filterValues('全部', '官方版', '原生', '现场版', '网易出品');
            const orders = filterValues('上升最快', '最热', '最新');
            result.filters = {
                mv_top: [{ key: 'area', name: '地区', value: areas }],
                mv_first: [{ key: 'area', name: '地区', value: areas }],
                mv_all: [
                    { key: 'area', name: '地区', value: areas },
                    { key: 'type', name: '类型', value: types },
                    { key: 'order', name: '排序', value: orders },
                ],
            };
        }
        result.class = classes;
        return JSON.stringify(result);
    } catch (e) {
        console.log('[nemv-js] mvHomeContent FAIL : ' + e);
        return '';
    }
}

/** MusicCore.mvCategoryContent：mv_rcmd(推荐，单页) / mv_top(排行榜，offset 翻页) / mv_first(最新，单页 60) / mv_all(全部，tags 筛选 + offset 翻页) */
function mvCategoryContent(log, tid, pg, extend) {
    const page = pageSafe(pg);
    const ext = extend || {};
    const area = ext.area == null ? '' : String(ext.area).trim();
    const type = ext.type == null ? '' : String(ext.type).trim();
    const order = ext.order == null ? '' : String(ext.order).trim();
    try {
        if (tid === 'mv_rcmd') {
            const resp = getJson('https://music.163.com/api/personalized/mv', neHeaders());
            const arr = optArr(resp, 'result');
            return arr == null ? pageDataEmpty(page) : mvPage(arr, page, false, mvItem);
        }
        if (tid === 'mv_top') {
            const limit = 30;
            const resp = getJson('https://music.163.com/api/mv/toplist?area=' + enc(area)
                + '&limit=' + limit + '&offset=' + (page - 1) * limit + '&total=true', neHeaders());
            const arr = optArr(resp, 'data');
            return arr == null ? pageDataEmpty(page) : mvPage(arr, page, arr.length >= limit, mvItem);
        }
        if (tid === 'mv_first') {
            const resp = getJson('https://music.163.com/api/mv/first?area=' + enc(area)
                + '&limit=60&total=true', neHeaders());
            const arr = optArr(resp, 'data');
            return arr == null ? pageDataEmpty(page) : mvPage(arr, page, false, mvItem);
        }
        if (tid === 'mv_all') {
            const limit = 30;
            const tags = JSON.stringify({
                '地区': area === '' ? '全部' : area,
                '类型': type === '' ? '全部' : type,
                '排序': order === '' ? '上升最快' : order,
            });
            const resp = getJson('https://music.163.com/api/mv/all?tags=' + enc(tags)
                + '&limit=' + limit + '&offset=' + (page - 1) * limit + '&total=true', neHeaders());
            const arr = optArr(resp, 'data');
            return arr == null ? pageDataEmpty(page)
                : mvPage(arr, page, optBool(resp, 'hasMore', false), mvItem);
        }
        return pageDataEmpty(page);
    } catch (e) {
        log('mvCategoryContent FAIL tid=' + tid + ' pg=' + pg + ' : ' + e);
        return pageDataEmpty(page);
    }
}

/** MusicCore.mvSearchContent：weapi search/get type=1004（linux/forward 与老公网搜索均拒 1004） */
function mvSearchContent(log, kw, pg) {
    const keyword = kw == null ? '' : String(kw).trim();
    const page = pageSafe(pg);
    if (!keyword || keyword.length > 60) return pageDataEmpty(page);
    try {
        const encArr = weapi(JSON.stringify({
            s: keyword,
            type: 1004,
            limit: 30,
            offset: (page - 1) * 30,
            csrf_token: '',
        }));
        const resp = postJson('https://music.163.com/weapi/search/get', neHeaders(),
            'params=' + enc(encArr[0]) + '&encSecKey=' + enc(encArr[1]));
        const result = optObj(resp, 'result');
        const arr = result == null ? null : optArr(result, 'mvs');
        if (arr == null) {
            log('mvSearchContent empty kw=' + keyword);
            return pageDataEmpty(page);
        }
        return mvPage(arr, page, arr.length >= 30, mvItem);
    } catch (e) {
        log('mvSearchContent FAIL kw=' + keyword + ' : ' + e);
        return pageDataEmpty(page);
    }
}

/** MusicCore.mvDetailContent：mv/detail 补全（壳音乐链路按 2 段 uid 直播，此处兜底） */
function mvDetailContent(log, ids) {
    const first = Array.isArray(ids) ? ids[0] : ids;
    if (first == null || first === '') return '';
    const parts = splitUid(first);
    if (parts == null || parts[0] !== 'mv') return '';
    try {
        const resp = getJson('https://music.163.com/api/mv/detail?id=' + enc(parts[1]), neHeaders());
        const data = optObj(resp, 'data');
        if (data == null) return '';
        const v = mvItem(data);
        if (v == null) return '';
        return JSON.stringify({ list: [v] });
    } catch (e) {
        log('mvDetailContent FAIL id=' + first + ' : ' + e);
        return '';
    }
}

/**
 * MusicCore.neMvUrl：网易云 MV 地址（weapi song/enhance/play/mv/url；1080 无档降级 720/480）。
 * 坑：请求档位不存在时响应 url 为 JSON null，org.json optString 会得到字面量 "null"，
 * 必须判掉防下发坏地址（JS 侧 JSON null → optS 回 ''，字面量 "null" 仍显式判）。
 */
function neMvUrl(mvid) {
    for (const r of [1080, 720, 480]) {
        const encArr = weapi(JSON.stringify({ id: mvid, r: r, csrf_token: '' }));
        const resp = postJson('https://music.163.com/weapi/song/enhance/play/mv/url', neHeaders(),
            'params=' + enc(encArr[0]) + '&encSecKey=' + enc(encArr[1]));
        const data = optObj(resp, 'data');
        const url = data == null ? '' : optS(data, 'url');
        if (url !== '' && url !== 'null') return url;
    }
    return '';
}

// ============================ QQ 音乐基建（qqMv* 复用，MusicCore 同款） ============================

function qqJsonHeaders() {
    return headers('Referer', QQ_REFERER, 'Content-Type', 'application/json');
}

function qqFcgPost(payload) {
    return postJson('https://u.y.qq.com/cgi-bin/musicu.fcg', qqJsonHeaders(), JSON.stringify(payload));
}

function qqComm() {
    return {
        cv: 4747474, ct: 24, format: 'json',
        inCharset: 'utf-8', outCharset: 'utf-8',
        notice: 0, platform: 'yqq.json',
        needNewCode: 1, uin: '0',
        g_tk_new_20200303: 5381, g_tk: 5381,
    };
}

// ============================ QQ MV 站源（csp_QqMv，秋映） ============================

/** MusicCore.qqMvItem：QQ MV 条目 → vod JSON（uid=mvq_{vid}；列表 title/picurl、搜索 mv_name/mv_pic_url/v_id、
 *  详情 name/cover_pic/singers 三种结构双兼容，http 封面升 https） */
function qqMvItem(m) {
    const vid = firstNonEmpty(optS(m, 'vid').trim(), optS(m, 'v_id').trim());
    const name = firstNonEmpty(optS(m, 'title').trim(), optS(m, 'name').trim(), optS(m, 'mv_name').trim());
    let cover = firstNonEmpty(optS(m, 'picurl'), optS(m, 'cover_pic'), optS(m, 'mv_pic_url'));
    if (!vid || !name) return null;
    if (cover.indexOf('http://') === 0) cover = 'https://' + cover.substring(7);
    const singers = optArr(m, 'singers') || optArr(m, 'singer_list');
    let artist = optS(m, 'singer_name').trim();
    if (singers != null) {
        let sb = '';
        for (let i = 0; i < singers.length && i < 5; i++) {
            const a = singers[i];
            if (a == null) continue;
            const n = optS(a, 'name').trim();
            if (!n) continue;
            if (sb.length > 0) sb += '、';
            sb += n;
        }
        if (sb.length > 0) artist = sb;
    }
    return {
        vod_id: 'mvq_' + vid,
        vod_name: name,
        vod_pic: cover,
        vod_remarks: artist,
        vod_actor: artist,
        vod_content: optS(m, 'desc').trim(),
    };
}

/** MusicCore.qqMvHomeContent：MV 库单分类 + 地区/版本筛选（GetAllocTag 动态拉取，失败落内置默认） */
function qqMvHomeContent(log, filter) {
    try {
        const result = {};
        const classes = [{ type_id: 'mvq_all', type_name: 'MV库' }];
        if (filter) {
            let areas = filterValues('全部', '内地', '港台', '欧美', '韩国', '日本');
            let versions = filterValues('全部', 'MV', '现场', '翻唱', '舞蹈', '影视', '综艺', '儿歌');
            try {
                const payload = {
                    comm: { ct: 24 },
                    mv_tag: { module: 'MvService.MvInfoProServer', method: 'GetAllocTag', param: {} },
                };
                const tagResp = qqFcgPost(payload);
                const tag = optObj(tagResp, 'mv_tag');
                const data = tag == null ? null : optObj(tag, 'data');
                const areaArr = data == null ? null : optArr(data, 'area');
                const verArr = data == null ? null : optArr(data, 'version');
                const mapTags = (arr) => {
                    const out = [];
                    for (const t of arr) {
                        if (t == null || optS(t, 'name').trim() === '') continue;
                        const idv = t.id == null ? 0 : (typeof t.id === 'number' ? t.id : (parseInt(String(t.id), 10) || 0));
                        out.push({ n: optS(t, 'name').trim(), v: String(idv) });
                    }
                    return out;
                };
                if (areaArr != null && areaArr.length > 0) {
                    const mapped = mapTags(areaArr);
                    if (mapped.length > 0) areas = mapped;
                }
                if (verArr != null && verArr.length > 0) {
                    const mapped = mapTags(verArr);
                    if (mapped.length > 0) versions = mapped;
                }
            } catch (ignore) {
            }
            result.filters = {
                mvq_all: [
                    { key: 'area', name: '地区', value: areas },
                    { key: 'version', name: '版本', value: versions },
                ],
            };
        }
        result.class = classes;
        return JSON.stringify(result);
    } catch (e) {
        log('qqMvHomeContent FAIL : ' + e);
        return '';
    }
}

/** MusicCore.qqMvCategoryContent：GetAllocMvInfo offset 翻页（area_id=15/version_id=7 即官方「全部」；
 *  order 参数实测无效固定 1；id 不存在时接口 code=0 + 空列表，无需特判） */
function qqMvCategoryContent(log, tid, pg, extend) {
    const page = pageSafe(pg);
    if (tid !== 'mvq_all') return pageDataEmpty(page);
    const ext = extend || {};
    const area = ext.area == null ? '' : String(ext.area).trim();
    const version = ext.version == null ? '' : String(ext.version).trim();
    const limit = 30;
    try {
        const areaId = area === '' ? 15 : parseInt(area, 10);
        const verId = version === '' ? 7 : parseInt(version, 10);
        if (isNaN(areaId) || isNaN(verId)) return pageDataEmpty(page); // Java NumberFormatException → 空页
        const payload = {
            comm: { ct: 24 },
            mv_list: {
                module: 'MvService.MvInfoProServer',
                method: 'GetAllocMvInfo',
                param: {
                    start: (page - 1) * limit, size: limit,
                    version_id: verId, area_id: areaId,
                    order: 1,
                },
            },
        };
        const resp = qqFcgPost(payload);
        const mvList = optObj(resp, 'mv_list');
        const data = mvList == null ? null : optObj(mvList, 'data');
        const arr = data == null ? null : optArr(data, 'list');
        return arr == null ? pageDataEmpty(page) : mvPage(arr, page, arr.length >= limit, qqMvItem);
    } catch (e) {
        log('qqMvCategoryContent FAIL tid=' + tid + ' pg=' + pg + ' : ' + e);
        return pageDataEmpty(page);
    }
}

/** MusicCore.qqMvSearchContent：client_search_cp t=12（data.mv.list，totalnum 判断翻页） */
function qqMvSearchContent(log, kw, pg) {
    const keyword = kw == null ? '' : String(kw).trim();
    const page = pageSafe(pg);
    if (!keyword || keyword.length > 60) return pageDataEmpty(page);
    const limit = 30;
    try {
        const resp = getJson('https://c.y.qq.com/soso/fcgi-bin/client_search_cp?format=json&cr=1&g_tk=5381'
            + '&t=12&w=' + enc(keyword) + '&p=' + page + '&n=' + limit,
        withRandomIp(headers('Referer', QQ_REFERER, 'User-Agent', KG_UA)));
        const data = optObj(resp, 'data');
        const mv = data == null ? null : optObj(data, 'mv');
        const arr = mv == null ? null : optArr(mv, 'list');
        if (arr == null) {
            log('qqMvSearchContent empty kw=' + keyword);
            return pageDataEmpty(page);
        }
        const total = optInt(mv, 'totalnum', 0);
        const hasMore = (page - 1) * limit + arr.length < total;
        return mvPage(arr, page, hasMore, qqMvItem);
    } catch (e) {
        log('qqMvSearchContent FAIL kw=' + keyword + ' : ' + e);
        return pageDataEmpty(page);
    }
}

/** MusicCore.qqMvDetailContent：get_video_info_batch 补全 desc（列表/搜索条目无简介，进详情后补） */
function qqMvDetailContent(log, ids) {
    const first = Array.isArray(ids) ? ids[0] : ids;
    if (first == null || first === '') return '';
    const parts = splitUid(first);
    if (parts == null || parts[0] !== 'mvq') return '';
    try {
        const payload = {
            comm: { ct: 24, cv: 4747474 },
            mvinfo: {
                module: 'video.VideoDataServer',
                method: 'get_video_info_batch',
                param: {
                    vidlist: [parts[1]],
                    required: ['vid', 'cover_pic', 'duration', 'singers', 'name',
                        'desc', 'playcnt', 'pubdate'],
                },
            },
        };
        const resp = qqFcgPost(payload);
        const mvinfo = optObj(resp, 'mvinfo');
        const data = mvinfo == null ? null : optObj(mvinfo, 'data');
        const info = data == null ? null : data[parts[1]];
        if (info == null) {
            log('qqMvDetailContent empty id=' + first);
            return '';
        }
        const v = qqMvItem(info);
        if (v == null) return '';
        return JSON.stringify({ list: [v] });
    } catch (e) {
        log('qqMvDetailContent FAIL id=' + first + ' : ' + e);
        return '';
    }
}

/**
 * MusicCore.qqMvUrl：QQ MV 地址（gosrf.Stream.MvUrlProxy.GetMvUrls；旧 mv.GetMvUrl module 已下线实测 500003）。
 * 坑：mp4 数组多档（filetype 10/20/30 清晰度递增），code!=0 的档 url 为空数组，取最后一个有效档；
 * freeflow_url 为 [http, https] 两项，取末项 https。
 */
function qqMvUrl(vid) {
    const payload = {
        comm: qqComm(),
        req: {
            module: 'gosrf.Stream.MvUrlProxy',
            method: 'GetMvUrls',
            param: { vids: [vid], request_typet: 10001 },
        },
    };
    const resp = qqFcgPost(payload);
    const req1 = optObj(resp, 'req');
    const data = req1 == null ? null : optObj(req1, 'data');
    const perVid = data == null ? null : data[vid];
    if (perVid == null) return '';
    const mp4 = optArr(perVid, 'mp4');
    let url = '';
    if (mp4 != null) {
        for (const item of mp4) {
            if (item == null || optInt(item, 'code', -1) !== 0) continue;
            const urls = optArr(item, 'freeflow_url');
            if (urls == null || urls.length === 0) continue;
            const u = urls[urls.length - 1] == null ? '' : String(urls[urls.length - 1]);
            if (u !== '') url = u;
        }
    }
    return url;
}

// ============================ 酷狗 MV 站源（csp_KugouMv，枸映） ============================

/** MusicCore.KG_MV_CATS：v3/search/mv 为关键词驱动，固定热词做分类（tid=kgmv_*） */
const KG_MV_CATS = [
    ['kgmv_hot', '热门MV', '热门'],
    ['kgmv_huayu', '华语MV', '华语'],
    ['kgmv_oumei', '欧美MV', '欧美'],
    ['kgmv_hanri', '日韩MV', '日韩'],
];

/** MusicCore.KG_MV_CACHE：MV hash → 详情缓存（列表/搜索时填充；v3 无按 hash 查详情端点）。
 *  模块级单例 = Java static ConcurrentHashMap（跨四个壳实例共享）。 */
const KG_MV_CACHE = new Map();

/** MusicCore.kgHeaders */
function kgHeaders() {
    return headers('User-Agent', KG_UA, 'Referer', KG_REFERER);
}

/** MusicCore.kgMid：设备 MID（随机 GUID 的 MD5 视为 hex 大整数转十进制串；模块级缓存 = Java volatile 静态） */
let kgMidCache = '';

function kgMid() {
    if (kgMidCache === '') {
        const b = randomBytes(16);
        let hex = '';
        for (const x of b) hex += (x >> 4).toString(16) + (x & 15).toString(16);
        kgMidCache = BigInt('0x' + hex).toString(10);
    }
    return kgMidCache;
}

function kgMvHomeContent() {
    try {
        const classes = KG_MV_CATS.map(c => ({ type_id: c[0], type_name: c[1] }));
        return JSON.stringify({ class: classes });
    } catch (e) {
        console.log('[kgmv-js] kgMvHomeContent FAIL : ' + e);
        return '';
    }
}

/** MusicCore.kgMvCategoryContent：tid 解码热词 → kgMvSearchContent */
function kgMvCategoryContent(log, tid, pg, extend) {
    const page = pageSafe(pg);
    for (const c of KG_MV_CATS) {
        if (c[0] === tid) return kgMvSearchContent(log, c[2], pg);
    }
    return pageDataEmpty(page);
}

/** MusicCore.kgMvSearchContent：mobilecdn v3/search/mv（data.info[]，hash 即 MV 播放 hash） */
function kgMvSearchContent(log, kw, pg) {
    const keyword = kw == null ? '' : String(kw).trim();
    const page = pageSafe(pg);
    if (!keyword || keyword.length > 60) return pageDataEmpty(page);
    const limit = 30;
    try {
        const resp = getJson('http://mobilecdn.kugou.com/api/v3/search/mv?format=json&keyword=' + enc(keyword)
            + '&page=' + page + '&pagesize=' + limit, kgHeaders());
        const data = optObj(resp, 'data');
        const arr = data == null ? null : optArr(data, 'info');
        if (arr == null) {
            log('kgMvSearchContent empty kw=' + keyword);
            return pageDataEmpty(page);
        }
        const total = optInt(data, 'total', 0);
        const hasMore = (page - 1) * limit + arr.length < total;
        return mvPage(arr, page, hasMore, kgMvItem);
    } catch (e) {
        log('kgMvSearchContent FAIL kw=' + keyword + ' : ' + e);
        return pageDataEmpty(page);
    }
}

/** MusicCore.kgMvItem：酷狗 MV 条目 → vod JSON（uid=mvk_{hash}；封面 {size}→240 并升 https） */
function kgMvItem(m) {
    const hash = optS(m, 'hash').trim();
    const name = optS(m, 'filename').trim();
    if (!hash || !name) return null;
    let cover = optS(m, 'imgurl').replace('{size}', '240');
    if (cover.indexOf('http://') === 0) cover = 'https://' + cover.substring(7);
    const singer = optS(m, 'singername').trim();
    const duration = optInt(m, 'duration', 0);
    const remarks = singer + (duration > 0 ? ' · ' + Math.floor(duration / 60) + ':' + pad2(duration % 60) : '');
    KG_MV_CACHE.set(hash, { name: name, singer: singer });
    return {
        vod_id: 'mvk_' + hash,
        vod_name: name,
        vod_pic: cover,
        vod_remarks: remarks,
        vod_actor: singer,
        vod_content: name + ' - ' + singer + '（酷狗 MV）',
    };
}

/** MusicCore.kgMvDetailContent：hash → 列表缓存（冷直链未命中返回空，壳显示已缓存详情） */
function kgMvDetailContent(log, ids) {
    const first = Array.isArray(ids) ? ids[0] : ids;
    if (first == null || first === '') return '';
    const parts = splitUid(first);
    if (parts == null || parts[0] !== 'mvk') return '';
    const info = KG_MV_CACHE.get(parts[1]);
    if (info == null) {
        log('kgMvDetailContent cache miss hash=' + parts[1]);
        return '';
    }
    try {
        const singer = optS(info, 'singer');
        const v = {
            vod_id: first,
            vod_name: optS(info, 'name'),
            vod_actor: singer,
            vod_content: optS(info, 'name') + ' - ' + singer + '（酷狗 MV）',
        };
        return JSON.stringify({ list: [v] });
    } catch (e) {
        log('kgMvDetailContent FAIL id=' + first + ' : ' + e);
        return '';
    }
}

/**
 * MusicCore.kgMvUrl：酷狗 MV 取流（gateway + x-router=trackermv.kugou.com，KuGouMusicApi video_url.js 蓝本）：
 * signature=salt+sorted(k=v)+salt（android 族）+ key=MD5(hash+KEYSALT+appid+mid+userid)，
 * 实测 key 必须参与签名排序；返回 mkv 容器（H.264+AAC）。
 * 参数列表按 ASCII 序写死（key 排 ismp3 与 mid 之间），kv 供签名、qs 供请求。
 */
function kgMvUrl(hash) {
    const mid = kgMid();
    const clienttime = String(Math.floor(Date.now() / 1000));
    const p = [
        ['appid', '1005'],
        ['backupdomain', '1'],
        ['clienttime', clienttime],
        ['clientver', '11430'],
        ['cmd', '123'],
        ['ext', 'mp4'],
        ['hash', hash],
        ['ismp3', '0'],
        ['key', md5(hash + '57ae12eb6890223e355ccfcb74edf70d' + '1005' + mid + '0')],
        ['mid', mid],
        ['pid', '1'],
        ['type', '1'],
        ['uuid', '-'],
    ];
    let kv = '';
    let qs = '';
    for (const e of p) {
        // 签名 kv 串无分隔符直连（kugou android 族 signature=md5(salt+kv+salt)），qs 仍按 &拼接
        kv += e[0] + '=' + e[1];
        if (qs.length > 0) qs += '&';
        qs += enc(e[0]) + '=' + enc(e[1]);
    }
    const signature = md5(KG_SALT + kv + KG_SALT);
    const resp = getJson('https://gateway.kugou.com/v2/interface/index?' + qs + '&signature=' + signature,
        headers('User-Agent', 'Android15-1070-11083-46-0-DiscoveryDRADProtocol-wifi',
            'x-router', 'trackermv.kugou.com',
            'clienttime', clienttime, 'mid', mid, 'dfid', '-',
            'kg-rc', '1', 'kg-thash', '5d816a0', 'kg-rec', '1',
            'kg-rf', 'B9EDA08A64250DEFFBCADDEE00F8F25F'));
    if (optInt(resp, 'status', -1) !== 1) {
        console.log('[kgmv-js] kgMvUrl status=' + resp.status + ' err=' + resp.error + ' hash=' + hash);
        return '';
    }
    const data = optObj(resp, 'data');
    const entry = data == null ? null : data[hash];
    if (entry == null) return '';
    let url = optS(entry, 'downurl');
    if (url === '') {
        const ba = optArr(entry, 'backupdownurl');
        if (ba != null && ba.length > 0) url = ba[0] == null ? '' : String(ba[0]);
    }
    return url.trim();
}

// ============================ 咪咕 MV 站源（csp_MiguMv，蜜映） ============================

/** MusicCore.MG_MV_HOST：咪咕 MV mp4 相对路径的宿主（miguMusic-api-enhanced mv.md） */
const MG_MV_HOST = 'https://freevod.nf.migu.cn';
/** MusicCore.MG_MV_SEED：推荐页种子 MV（recommend-mv 需要一个 resourceId 驱动翻页；长期有效热门 MV） */
const MG_MV_SEED = '600906000000423829';

/** MusicCore.MG_MV_CATS：推荐（recommend-mv 翻页）+ 热词（bmw/search/video） */
const MG_MV_CATS = [
    ['mvmv_rcmd', '推荐MV', ''],
    ['mvmv_huayu', '华语MV', '华语'],
    ['mvmv_oumei', '欧美MV', '欧美'],
    ['mvmv_hanri', '日韩MV', '日韩'],
];

function mgMvHeaders() {
    return headers('User-Agent', 'Mozilla/5.0 (Linux; Android 15) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0 Mobile Safari/537.36');
}

function mgMvHomeContent() {
    try {
        const classes = MG_MV_CATS.map(c => ({ type_id: c[0], type_name: c[1] }));
        return JSON.stringify({ class: classes });
    } catch (e) {
        console.log('[mgmv-js] mgMvHomeContent FAIL : ' + e);
        return '';
    }
}

/** MusicCore.mgMvCategoryContent：推荐走 recommend-mv（pageNumber 翻页），热词走 bmw 搜索 */
function mgMvCategoryContent(log, tid, pg, extend) {
    const page = pageSafe(pg);
    for (const c of MG_MV_CATS) {
        if (c[0] !== tid) continue;
        try {
            if (c[2] === '') {
                const resp = getJson('https://c.musicapp.migu.cn/MIGUM3.0/v3.0/content/recommend-mv?resourceId='
                    + MG_MV_SEED + '&pageNumber=' + page + '&resourceType=D', mgMvHeaders());
                const arr = optArr(resp, 'data');
                return arr == null ? pageDataEmpty(page) : mvPage(arr, page, arr.length >= 10, mgMvItem);
            }
            return mgMvSearchContent(log, c[2], pg);
        } catch (e) {
            log('mgMvCategoryContent FAIL tid=' + tid + ' : ' + e);
            return pageDataEmpty(page);
        }
    }
    return pageDataEmpty(page);
}

/** MusicCore.mgMvSearchContent：bmw/search/video v1.0（data.items[].video，直连可用；独立分页构建，pagecount 按 list.length>=20） */
function mgMvSearchContent(log, kw, pg) {
    const keyword = kw == null ? '' : String(kw).trim();
    const page = pageSafe(pg);
    if (!keyword || keyword.length > 60) return pageDataEmpty(page);
    try {
        const resp = getJson('https://app.c.nf.migu.cn/bmw/search/video/v1.0?pageNo=' + page
            + '&text=' + enc(keyword) + '&typeOrder=0', mgMvHeaders());
        const data = optObj(resp, 'data');
        const items = data == null ? null : optArr(data, 'items');
        const list = [];
        if (items != null) {
            for (const wrapper of items) {
                const video = wrapper == null ? null : optObj(wrapper, 'video');
                if (video == null) continue;
                const v = mgMvItem(video);
                if (v != null) list.push(v);
            }
        }
        return JSON.stringify({
            list: list,
            page: page,
            pagecount: list.length >= 20 ? page + 1 : page,
            limit: Math.max(list.length, 1),
            total: list.length,
        });
    } catch (e) {
        log('mgMvSearchContent FAIL kw=' + keyword + ' : ' + e);
        return pageDataEmpty(page);
    }
}

/** MusicCore.mgMvItem：咪咕 MV 条目 → vod JSON（uid=mvm_{contentId}；歌手在 user[].nickName） */
function mgMvItem(m) {
    const id = optS(m, 'contentId').trim();
    const name = optS(m, 'title').trim();
    if (!id || !name) return null;
    let singer = '';
    const users = optArr(m, 'user');
    if (users != null && users.length > 0 && users[0] != null) {
        singer = optS(users[0], 'nickName').trim();
    }
    const dur = optInt(m, 'duration', 0);
    const remarks = singer + (dur >= 60000 ? ' · ' + Math.floor(dur / 60000) + ':' + pad2(Math.floor(dur / 1000) % 60) : '');
    return {
        vod_id: 'mvm_' + id,
        vod_name: name,
        vod_pic: optS(m, 'showImg'),
        vod_remarks: remarks,
        vod_actor: singer,
        vod_content: name + ' - ' + singer + '（咪咕 MV）',
    };
}

/** MusicCore.mgMvDetailContent：resourceinfo.do resourceType=D 现查（songName/singer/imgs） */
function mgMvDetailContent(log, ids) {
    const first = Array.isArray(ids) ? ids[0] : ids;
    if (first == null || first === '') return '';
    const parts = splitUid(first);
    if (parts == null || parts[0] !== 'mvm') return '';
    try {
        const resp = getJson('https://c.musicapp.migu.cn/MIGUM2.0/v1.0/content/resourceinfo.do?resourceId='
            + enc(parts[1]) + '&resourceType=D&needSimple=01', mgMvHeaders());
        const resource = optArr(resp, 'resource');
        const r = resource == null ? null : resource[0];
        if (r == null) return '';
        const name = optS(r, 'songName').trim();
        if (name === '') return '';
        const singer = optS(r, 'singer').trim();
        const v = {
            vod_id: first,
            vod_name: name,
            vod_actor: singer,
            vod_content: name + ' - ' + singer + '（咪咕 MV）',
        };
        return JSON.stringify({ list: [v] });
    } catch (e) {
        log('mgMvDetailContent FAIL id=' + first + ' : ' + e);
        return '';
    }
}

/**
 * MusicCore.mgMvUrl：咪咕 MV 取流（miguMusic-api-enhanced mv_info 蓝本）：resourceinfo.do resourceType=D →
 * resource[].rateFormats[].url（相对路径）拼 freevod.nf.migu.cn；画质 HQ(050012) 优先，无则逐级兜底。
 */
function mgMvUrl(contentId) {
    try {
        const resp = getJson('https://c.musicapp.migu.cn/MIGUM2.0/v1.0/content/resourceinfo.do?resourceId='
            + enc(contentId) + '&resourceType=D&needSimple=01', mgMvHeaders());
        const resource = optArr(resp, 'resource');
        const r = resource == null ? null : resource[0];
        const formats = r == null ? null : optArr(r, 'rateFormats');
        if (formats == null) {
            console.log('[mgmv-js] mgMvUrl no rateFormats id=' + contentId);
            return '';
        }
        let hq = '';
        let fallback = '';
        for (const f of formats) {
            if (f == null) continue;
            const url = optS(f, 'url').trim();
            if (url === '') continue;
            if (fallback === '') fallback = url;
            if (optS(f, 'formatType') === 'HQ') hq = url;
        }
        const url = hq === '' ? fallback : hq;
        if (url === '') return '';
        return url.indexOf('http') === 0 ? url : MG_MV_HOST + url;
    } catch (e) {
        console.log('[mgmv-js] mgMvUrl FAIL id=' + contentId + ' : ' + e);
        return '';
    }
}

// ============================ playerContent MV 分支（MusicCore 同构） ============================

/**
 * MusicCore.playerContent 的 MV 站点源分支（芸映/秋映/枸映/蜜映）：
 * mp4 直链即内容本身——音频态出声、MV 态铺视频（同一直链，切态零二次取流）。
 * flag='MV' → flag 原样，否则回落 PLAY_FLAG（'果剧音乐'）。
 * 非 MV 前缀 uid 不会出现在 MV 站源壳（Java 侧音乐流分支不在本移植范围）→ 返回 ''。
 */
function mvPlay(log, flag, id) {
    const t0 = Date.now();
    const parts = splitUid(id);
    if (parts == null) return '';
    const platform = parts[0];
    const songId = parts[1];
    if (platform !== 'mv' && platform !== 'mvq' && platform !== 'mvk' && platform !== 'mvm') return '';
    let url;
    try {
        if (platform === 'mvq') url = qqMvUrl(songId);
        else if (platform === 'mvk') url = kgMvUrl(songId);
        else if (platform === 'mvm') url = mgMvUrl(songId);
        else url = neMvUrl(songId);
    } catch (e) {
        url = '';
    }
    if (url === '') {
        log('playerContent mv unavailable id=' + id + ' cost=' + (Date.now() - t0) + 'ms');
        return '';
    }
    try {
        return JSON.stringify({
            parse: 0,
            playUrl: '',
            header: {},
            flag: flag === 'MV' ? 'MV' : PLAY_FLAG,
            url: url,
            mv: url,
        });
    } catch (e) {
        log('playerContent mv FAIL id=' + id + ' : ' + e);
        return '';
    }
}

// ============================ 壳装配（createMvCore：各壳注入独立日志前缀） ============================

/**
 * 创建一个 MV 站源核心实例（Java 侧 MusicCore 静态方法的闭包绑定版）。
 * @param {string} tag 日志前缀（'[nemv-js]' / '[qqmv-js]' / '[kgmv-js]' / '[mgmv-js]'）
 */
export function createMvCore(tag) {
    const log = (...a) => { try { console.log(tag, ...a); } catch (e) { } };
    return {
        // 网易（芸映）
        mvHomeContent: (filter) => mvHomeContent(filter),
        mvCategoryContent: (tid, pg, extend) => mvCategoryContent(log, tid, pg, extend),
        mvSearchContent: (kw, pg) => mvSearchContent(log, kw, pg),
        mvDetailContent: (ids) => mvDetailContent(log, ids),
        // 腾讯（秋映）
        qqMvHomeContent: (filter) => qqMvHomeContent(log, filter),
        qqMvCategoryContent: (tid, pg, extend) => qqMvCategoryContent(log, tid, pg, extend),
        qqMvSearchContent: (kw, pg) => qqMvSearchContent(log, kw, pg),
        qqMvDetailContent: (ids) => qqMvDetailContent(log, ids),
        // 酷狗（枸映）
        kgMvHomeContent: () => kgMvHomeContent(),
        kgMvCategoryContent: (tid, pg, extend) => kgMvCategoryContent(log, tid, pg, extend),
        kgMvSearchContent: (kw, pg) => kgMvSearchContent(log, kw, pg),
        kgMvDetailContent: (ids) => kgMvDetailContent(log, ids),
        // 咪咕（蜜映）
        mgMvHomeContent: () => mgMvHomeContent(),
        mgMvCategoryContent: (tid, pg, extend) => mgMvCategoryContent(log, tid, pg, extend),
        mgMvSearchContent: (kw, pg) => mgMvSearchContent(log, kw, pg),
        mgMvDetailContent: (ids) => mgMvDetailContent(log, ids),
        // playerContent MV 分支（全四源共用）
        mvPlay: (flag, id) => mvPlay(log, flag, id),
    };
}

/**
 * xihongshiduanju.js — 西红短剧（JS 版，catvod JsSpider 协议）
 *
 * 移植自：kele/src/main/java/xihongshiduanju/src/com/github/catvod/spider/Xihongshiduanju.java
 * （番茄小说 APP 内短剧板块，novelapp aid=1967）
 *
 * 数据面（全部走已实测打通的签名接口）：
 *  - 设备：log.snssdk.com 匿名注册（ttEncrypt=gzip 注册体 SHA512 前缀+AES-CBC 封装），
 *    device_id/install_id/cdid/openudid 经 local 持久化（优于 jar 版 SharedPreferences）；
 *  - 搜索/分类：reading/bookapi/search/tab/v（aid=1967，x-argus 551 签名 GET）；
 *  - 详情：novel/player/video_detail/v1（aid=8662，签名 POST，全量剧集）；
 *  - 取流：novel/player/video_model/v1（aid=1967，签名 POST）——
 *    2026-10-29 起免签请求返回空 body，必须 551 签名；spade_a 加密档（CENC）
 *    经壳本地代理逐段解密（proxy://do=play），明文档 proxy 内透传；
 *  - 弹幕：番茄评论接口（aid=8662）窗口循环 → B 站 XML，经壳代理 do=danmu 回吐。
 *
 * 宿主依赖：req/local/getProxy/console；lib/crypto-js.js、lib/pako.js、lib/sm3.js、
 * lib/binutil.js、lib/xhs_sign.js。
 */

// 副作用 import：pako（gzip）挂 globalThis；crypto-js 由 xhs_sign 传递挂载
import '../lib/pako.js';
import {
    safeParse,
    bytesToHex, hexToBytes, bytesToB64, b64ToBytes,
    utf8ToBytes, bytesToUtf8, concatBytes, le64, putLe64, u32read, be64read,
    uuid4, pkcs7Pad, randomBytes, be32,
} from '../lib/binutil.js';
import {
    md5Hex, md5Bytes, sha512Bytes, sm3,
    aesCbcEnc, aesCtrDecrypt, bytesToBigIntBE,
    argusSign, ladon, playerHeaders, deriveKey, qp,
    simonKeyExpansion, simonEncryptBytes,
    dmProto, dmGorgonSeed, dmGorgon, dmLadon, dmArgus,
} from '../lib/xhs_sign.js';
import { aes128EncryptBlock } from '../lib/xhs_sign.js';

const pako = globalThis.pako;
const CryptoJS = globalThis.CryptoJS;

const log = (...a) => { try { console.log('[xhs-js]', ...a); } catch (e) {} };

// ============================ 端点 ============================

const SEARCH_API = 'https://api5-normal-lf.fqnovel.com/reading/bookapi/search/tab/v/';
const DETAIL_API = 'https://api5-normal-sinfonlineb.fqnovel.com/novel/player/video_detail/v1/';
const STREAM_API = 'https://api3-normal-sinfonlinea.fqnovel.com/novel/player/video_model/v1/';
const REG_API = 'https://log.snssdk.com/service/2/device_register/';

const SEARCH_UA = 'com.dragon.read/65132 (Linux; U; Android 10; zh_CN; MI 12; Build/MMB29M; Cronet/TTNetVersion:9ac8d95c 2024-11-25 QuicVersion:3f326df4 2024-11-14)';
const DETAIL_UA = 'com.xs.fm/632 (Linux; U; Android 15; zh_CN; 23049RAD8C; Build/AQ3A.250226.002;tt-ok/3.12.13.20)';
const STREAM_UA = 'com.xs.fm/632 (Linux; U; Android 15; zh_CN; 23049RAD8C; Build/AQ3A.250226.002; tt-ok/3.12.13.20)';
const REG_UA = SEARCH_UA;

const LICENSE_ID = 1611921764;

/** ttEncrypt 派生常量（reg-fq-test.py SPADE） */
const SPADE_B64 = 'TdTC5rgxYgkOUrPHpnM7pByyRiuCmrWKGWs521cXdST0m69/COjWjSanLjfBqVovHwWlGJKu8pSXMrYqOKrdWA==';
const TT_MAGIC = new Uint8Array([0x74, 0x63, 0x05, 0x10, 0x00, 0x00]);

/** 伪分类关键词（type_id 即搜索词） */
const CATS = ['热播', '逆袭', '战神', '甜宠', '虐恋', '重生', '穿越', '赘婿', '神豪', '萌宝', '都市', '古装', '玄幻', '悬疑', '复仇'];
const PAGE_SIZE = 20;

const SITE_KEY = 'xihongshiduanju';

// ============================ 设备注册与持久化 ============================

const LKEY_DEVICE = 'xhs_duanju_device';

function devLoad() {
    try { return local.get(LKEY_DEVICE, ''); } catch (e) { return ''; }
}

function devSave(json) {
    try { local.set(LKEY_DEVICE, json); } catch (e) {}
}

function devRemove() {
    try { local.delete(LKEY_DEVICE); } catch (e) {}
}

/** 设备缓存（进程级 + local 持久化双份） */
let devCache = null;

function device() {
    if (devCache) return devCache;
    const raw = devLoad();
    if (raw) {
        try {
            const saved = safeParse(raw);
            if (/^[1-9]\d*$/.test(String(saved.device_id || '')) && saved.cdid) {
                devCache = saved;
                return saved;
            }
        } catch (e) {
            log('device read FAIL ' + e);
        }
    }
    devCache = registerDevice();
    try { devSave(JSON.stringify(devCache)); } catch (e) {}
    return devCache;
}

/** 设备软拒自愈：清存档重注册（tsukiyo PR#30 思路） */
function rotateDevice() {
    try {
        devRemove();
        devCache = null;
        const dev = device();
        log('rotateDevice 已重注册 device_id=' + dev.device_id);
    } catch (e) {
        log('rotateDevice FAIL ' + e);
    }
}

/** 匿名设备注册（reg-fq-test.py 1:1：ttEncrypt(gzip(注册JSON))，x-ss-stub=md5(body)大写） */
function registerDevice() {
    try {
        const cdid = uuid4();
        const openudidHex = bytesToHex(randomBytes(8));
        const clientudid = uuid4();
        const now = Date.now();

        const header = {
            display_name: '番茄小说',
            update_version_code: '65132',
            manifest_version_code: '65132',
            aid: 1967,
            channel: 'xiaomi_1967_64',
            package: 'com.dragon.read',
            app_version: '6.5.1.32',
            version_code: '65132',
            sdk_version: 'v04.04.05-ov-android',
            sdk_target_version: 29,
            os: 'Android',
            os_version: '10',
            os_api: '29',
            device_model: 'MI 12',
            device_brand: 'Xiaomi',
            device_manufacturer: 'Google',
            device_category: 'phone',
            cpu_abi: 'arm64-v8a',
            release_build: uuid4(),
            density_dpi: '560',
            display_density: 'mdpi',
            resolution: '1440x2392',
            language: 'zh',
            mac: (function () {
                const p = [];
                for (let i = 0; i < 6; i++) p.push(bytesToHex(randomBytes(1)).toUpperCase());
                return p.join(':');
            })(),
            timezone: 8,
            access: 'wifi',
            not_request_sender: 0,
            carrier: 'CHINA MOBILE',
            mcc_mnc: '46007',
            rom: 'EMUI-' + uuid4().replace(/-/g, '').substring(0, 13),
            rom_version: uuid4().replace(/-/g, '').substring(0, 2),
            sig_hash: md5Hex(uuid4()),
            openudid: openudidHex,
            clientudid: clientudid,
            sim_serial_number: [],
            region: 'CN',
            tz_name: 'Asia/Shanghai',
            tz_offset: 28800,
            sim_region: 'cn',
        };
        const payload = { magic_tag: 'ss_app_log', header: header, _gen_time: now };
        const jsonBytes = utf8ToBytes(JSON.stringify(payload));
        const compressed = pako.gzip(jsonBytes);

        const rnd32 = randomBytes(32);
        const spade = b64ToBytes(SPADE_B64);
        // SHA512(SHA512(rnd32) || spade)
        const d = sha512Bytes(concatBytes(sha512Bytes(rnd32), spade));
        const key = d.slice(0, 16);
        const iv = d.slice(16, 32);
        const inner = concatBytes(sha512Bytes(compressed), compressed);
        const padded = pkcs7Pad(inner);
        const body = concatBytes(TT_MAGIC, rnd32, aesCbcEnc(padded, key, iv));

        const q = 'tt_data=a&os_api=29&device_type=MI%2012&ssmix=a&manifest_version_code=65132&dpi=560'
            + '&version_name=6.5.1.32&ts=' + Math.floor(now / 1000) + '&cpu_support64=true&app_type=normal&appTheme=light&ac=wifi'
            + '&host_abi=arm64-v8a&update_version_code=65132&channel=xiaomi_1967_64&_rticket=' + now
            + '&device_platform=android&version_code=65132&cdid=' + cdid + '&os=android&is_android_pad=0'
            + '&openudid=' + openudidHex + '&package=com.dragon.read&resolution=1440*2392&os_version=10&language=zh'
            + '&device_brand=Xiaomi&need_personal_recommend=1&aid=1967&minor_status=0&app_name=novel'
            + '&mcc_mnc=46007';
        const resp = req(REG_API + '?' + q, {
            method: 'post',
            headers: {
                'Content-Type': 'application/octet-stream;tt-data=a',
                'User-Agent': REG_UA,
                'Connection': 'Keep-Alive',
                'x-tt-request-tag': 't=0;n=1',
                'log-encode-type': 'gzip',
                'x-ss-req-ticket': String(now),
                'sdk-version': '2',
                'passport-sdk-version': '65132',
                'x-vc-bdturing-sdk-version': '3.7.4.cn',
                'x-ss-stub': md5Hex(body).toUpperCase(),
                'Accept-Encoding': 'identity',
            },
            bodyB64: bytesBodyB64(body),
            timeout: 30000,
        }).content || '';
        if (resp.length < 300) log('registerDevice resp body: ' + resp.slice(0, 300));
        const j = safeParse(resp);
        const dev = {
            device_id: String(j.device_id || 0),
            install_id: String(j.install_id || 0),
            cdid: cdid,
            openudid: openudidHex,
        };
        log('registerDevice done device_id=' + dev.device_id + ' install_id=' + dev.install_id);
        return dev;
    } catch (e) {
        log('registerDevice FAIL ' + (e && e.message || e));
        throw new Error('设备注册失败: ' + (e && e.message || e));
    }
}

/** 二进制 body → base64（壳 bodyB64 通道：Req.bodyB64 → Connect Base64.decode 原字节发出） */
function bytesBodyB64(bytes) {
    return bytesToB64(bytes);
}

// ============================ HTTP ============================

function text(url, method, body, headers) {
    const t0 = Date.now();
    const opts = {
        method: method.toLowerCase(),
        headers: headers || {},
        timeout: 30000,
    };
    if (body) opts.bodyB64 = bytesBodyB64(body);
    const res = req(url, opts);
    const result = res.content || '';
    log('http ' + method + ' ' + url.slice(0, 120) + ' len=' + result.length + ' cost=' + (Date.now() - t0) + 'ms');
    return result;
}

function enc(v) {
    return encodeURIComponent(v);
}

// ============================ 搜索（签名 GET） ============================

/** 搜索 query（probe common_q 顺序 1:1，签名绑定 query 字节序，勿调整顺序） */
function searchQuery(keyword, page, dev) {
    return 'iid=' + (dev.install_id || '')
        + '&device_id=' + (dev.device_id || '')
        + '&ac=wifi&channel=xiaomi_1967_64&aid=1967&app_name=novelapp'
        + '&version_code=65132&version_name=6.5.1.32&device_platform=android&os=android&ssmix=a'
        + '&device_type=FRD-AL10&device_brand=honor&language=zh&os_api=28&os_version=9'
        + '&manifest_version_code=65132&resolution=1080*1920&dpi=480&update_version_code=65132'
        + '&cdid=' + (dev.cdid || '')
        + '&query=' + enc(keyword)
        + '&offset=' + ((page - 1) * PAGE_SIZE)
        + '&count=' + PAGE_SIZE
        + '&search_source=0';
}

function validId(id, title) {
    return /^\d{1,30}$/.test(String(id || '')) && String(title || '').trim().length > 0;
}

/** video_data 条目 → 卡片 */
function cardOf(vd) {
    let d = vd && vd.video_detail && typeof vd.video_detail === 'object' ? vd.video_detail : vd;
    const id = String(d.series_id != null ? d.series_id : (vd && vd.series_id) || '');
    const name = String(d.series_title != null ? d.series_title : (d.title || (vd && vd.title) || ''));
    const count = (d.episode_cnt != null ? d.episode_cnt : (vd && vd.episode_cnt) || 0) | 0;
    let badge = String(d.episode_right_text || '');
    if (!badge && count > 0) badge = '全' + count + '集';
    const play = (d.series_play_cnt != null ? d.series_play_cnt : (vd && vd.play_cnt) || 0) | 0;
    if (play > 0 && !badge) badge = play > 100000000 ? '播放过亿' : Math.floor(play / 10000) + '万播放';
    const cover = String(d.series_cover != null ? d.series_cover : (vd && vd.cover) || '');
    const intro = String(d.series_intro != null ? d.series_intro : (d.video_desc || (vd && vd.video_desc) || ''));
    if (!validId(id, name)) return null;
    return { id: id, name: name.trim(), cover: cover, intro: intro, badge: badge };
}

/** 搜索响应 → 卡片列表（search_tabs[].data[].video_data[] + novel_aggregation_card_items） */
function parseSearch(resp) {
    const out = [];
    try {
        const j = safeParse(resp);
        const tabs = j.search_tabs;
        if (!tabs) {
            log('parseSearch: search_tabs missing, topKeys=' + Object.keys(j).join(','));
            return out;
        }
        for (let t = 0; t < tabs.length; t++) {
            const tab = tabs[t];
            if (!tab) continue;
            const cells = tab.data;
            if (!cells) continue;
            for (let c = 0; c < cells.length; c++) {
                const cell = cells[c];
                if (!cell) continue;
                const vds = cell.video_data;
                if (vds) {
                    for (let v = 0; v < vds.length; v++) {
                        if (!vds[v]) continue;
                        const s = cardOf(vds[v]);
                        if (s) out.push(s);
                    }
                }
                const aggs = cell.novel_aggregation_card_items;
                if (aggs) {
                    for (let a = 0; a < aggs.length; a++) {
                        const item = aggs[a];
                        if (!item || !item.video_data) continue;
                        const s = cardOf(item.video_data);
                        if (s) out.push(s);
                    }
                }
            }
        }
    } catch (e) {
        log('parseSearch FAIL ' + e);
    }
    const seen = {};
    const uniq = [];
    for (let i = 0; i < out.length; i++) {
        if (seen[out[i].id]) continue;
        seen[out[i].id] = 1;
        uniq.push(out[i]);
    }
    return uniq;
}

/** App 端搜索一页（签名 GET，失败上抛由调用方兜底） */
function appSearchPage(keyword, page) {
    const dev = device();
    const query = searchQuery(keyword, page, dev);
    const headers = {
        'User-Agent': SEARCH_UA,
        'Accept-Language': 'zh-CN,zh;q=0.9',
    };
    const sig = playerHeaders(query, null, Math.floor(Date.now() / 1000));
    for (const k in sig) headers[k] = sig[k];
    const resp = text(SEARCH_API + '?' + query, 'GET', null, headers);
    const items = parseSearch(resp);
    log('appSearchPage kw=[' + keyword + '] page=' + page + ' items=' + items.length);
    return items;
}

// ============================ 详情（签名 POST，全量剧集） ============================

function detailQuery(dev) {
    return 'iid=' + (dev.install_id || '')
        + '&device_id=' + (dev.device_id || '')
        + '&ac=wifi&channel=update_64&aid=8662&app_name=novelread'
        + '&version_code=71332&version_name=7.1.3.32&device_platform=android&os=android&ssmix=a'
        + '&device_type=25053RT47C&device_brand=Redmi&language=zh&os_api=36&os_version=16'
        + '&manifest_version_code=71332&resolution=1280*2772&dpi=520&update_version_code=71332'
        + '&host_abi=arm64-v8a&dragon_device_type=phone&pv_player=71332&compliance_status=0'
        + '&need_personal_recommend=1&player_so_load=1&is_android_pad_screen=0';
}

/** video_detail → {eps:[{vid,vid_index,title}...], vd:video_data}，eps 按 vid_index 升序 */
function detailAll(seriesId) {
    const dev = device();
    const query = detailQuery(dev);
    const bodyObj = {
        series_id: String(seriesId),
        biz_param: {
            device_level: 3,
            need_all_video_definition: true,
            need_mp4_align: false,
            source: 5,
            use_os_player: false,
            video_id_type: 1,
        },
    };
    const body = utf8ToBytes(JSON.stringify(bodyObj));
    const headers = {
        'User-Agent': DETAIL_UA,
        'Accept': 'application/json; charset=utf-8,application/x-protobuf',
        'Content-Type': 'application/json',
        'x-xs-from-web': '0',
        'sdk-version': '2',
        'Accept-Language': 'zh-CN,zh;q=0.9',
    };
    const sig = playerHeaders(query, body, Math.floor(Date.now() / 1000));
    for (const k in sig) headers[k] = sig[k];
    const resp = text(DETAIL_API + '?' + query, 'POST', body, headers);
    const j = safeParse(resp);
    if ((j.code | 0) !== 0) throw new Error('detail code=' + j.code + ' ' + (j.message || ''));
    const data = j.data || {};
    const vd = data.video_data || null;
    const list = vd ? vd.video_list : null;
    const eps = [];
    if (list) {
        for (let i = 0; i < list.length; i++) {
            const ep = list[i];
            if (ep && /^\d+$/.test(String(ep.vid || ''))) eps.push(ep);
        }
    }
    eps.sort(function (a, b) { return (a.vid_index | 0) - (b.vid_index | 0); });
    log('detailAll sid=' + seriesId + ' eps=' + eps.length + ' title=' + (vd ? (vd.series_title || '') : '?'));
    return { eps: eps, vd: vd || {} };
}

// ============================ 取流（签名 POST + spade CENC） ============================

const SEG_SIZE = 1048576;
const HEADER_HINT = 8388608;
const STREAM_TTL = 30 * 60 * 1000;

const streamCache = {};   // vid → {si, at}
const streamCacheOrder = [];

function streamCacheGet(vid) {
    const e = streamCache[vid];
    if (e && Date.now() - e.at < STREAM_TTL) return e.si;
    return null;
}

function streamCachePut(vid, si) {
    streamCache[vid] = { si: si, at: Date.now() };
    streamCacheOrder.push(vid);
    while (streamCacheOrder.length > 8) {
        const old = streamCacheOrder.shift();
        delete streamCache[old];
    }
}

function cleanUrl(v) {
    return String(v).replace(/\\\//g, '/').replace(/\\u002f/gi, '/').replace(/\\u0026/g, '&').replace(/&amp;/g, '&');
}

function qualityText(q) {
    let v = String(q.quality_desc || '');
    if (!v || v === '0') v = String(q.height | 0);
    if (!v || v === '0') v = String(q.vheight | 0);
    if (!v || v === '0') v = String(q.quality | 0);
    if (!v || v === '0') v = String(q.vwidth | 0);
    return v;
}

/** video_model 响应 → 选定档（spade_a 空优先=免解密；bytevc2 排除；vwidth 高分优先） */
function pickStream(resp) {
    const j = safeParse(resp);
    const code = j.code != null ? (j.code | 0) : (j.Code != null ? (j.Code | 0) : -1);
    if (code !== 0) throw new Error('stream code=' + code + ' ' + (j.message || ''));
    const data = j.data;
    if (!data) throw new Error('stream data missing');
    let vmRaw = null;
    for (const mk in data) {
        const ent = data[mk];
        if (ent && typeof ent === 'object' && 'video_model' in ent) { vmRaw = ent.video_model; break; }
    }
    if (vmRaw == null) vmRaw = data.video_model;
    if (vmRaw == null) throw new Error('video_model 缺失');
    const vm = typeof vmRaw === 'string' ? safeParse(vmRaw) : vmRaw;
    const vl = vm.video_list;
    let best = null;
    let bestScore = -1;
    const evalQ = function (q) {
        if (!q) return;
        const codec = String(q.codec_type || '');
        if (codec.indexOf('bytevc2') >= 0 || codec.indexOf('bvc2') >= 0) return;
        if (!q.main_url) return;
        const score = (q.vwidth | 0) * 100 + Math.floor((q.bitrate | 0) / 1000);
        if (score > bestScore) { bestScore = score; best = q; }
    };
    if (vl && typeof vl === 'object' && !vl.length) {
        for (const kk in vl) evalQ(vl[kk]);
    } else if (vl && vl.length) {
        for (let i = 0; i < vl.length; i++) evalQ(vl[i]);
    }
    if (!best) throw new Error('video_model 无可播放档位');
    let url = cleanUrl(bytesToUtf8(b64ToBytes(best.main_url)).trim());
    if (url.indexOf('http') !== 0) {
        url = cleanUrl(bytesToUtf8(b64ToBytes(url)).trim());
    }
    if (url.indexOf('http') !== 0) throw new Error('main_url 解码异常');
    const def = qualityText(best);
    log('pickStream 选=' + def + ' vwidth=' + (best.vwidth | 0) + ' spade=' + (best.spade_a ? '有' : '无'));
    let key = null;
    if (best.spade_a) key = deriveKey(best.spade_a);
    return { url: url, key: key, quality: def };
}

/** 取流（5 次重试窗口 ~4s < 壳 15s 播放超时；空响应=设备软拒 → 重注册自愈） */
function stream(vid) {
    const cached = streamCacheGet(vid);
    if (cached) return cached;
    const bodyObj = {
        video_id: String(vid),
        content_type: 1004,
        biz_param: {
            detail_page_version: 0,
            device_level: 3,
            disable_digg_stat: false,
            disable_video_relate_book: false,
            from_video_id: '',
            need_all_video_definition: true,
            need_mp4_align: false,
            source: 4,
            use_os_player: false,
            use_server_dns: false,
            video_platform: 3,
        },
    };
    const body = utf8ToBytes(JSON.stringify(bodyObj));
    let resp = null;
    let lastErr = null;
    for (let attempt = 1; attempt <= 5 && resp == null; attempt++) {
        if (attempt > 1) sleepBusy(attempt === 2 ? 600 : attempt === 3 ? 900 : attempt === 4 ? 900 : 1200);
        const dev = device();
        const query = 'iid=' + (dev.install_id || '')
            + '&device_id=' + (dev.device_id || '')
            + '&aid=1967&app_name=novelapp&version_code=72132'
            + '&version_name=7.2.1.32&device_platform=android&device_brand=Xiaomi'
            + '&os_version=13&cdid=' + (dev.cdid || '')
            + '&_rticket=' + Date.now();
        const headers = {
            'User-Agent': STREAM_UA,
            'Content-Type': 'application/json; charset=utf-8',
            'Accept': 'application/json; charset=utf-8,application/x-protobuf',
            'Accept-Encoding': 'identity',
        };
        const sig = playerHeaders(query, body, Math.floor(Date.now() / 1000));
        for (const k in sig) headers[k] = sig[k];
        const r = text(STREAM_API + '?' + query, 'POST', body, headers).trim();
        log('v1 attempt#' + attempt + ' respLen=' + r.length);
        if (!r) {
            lastErr = '播放接口返回空响应';
            if (attempt === 2) rotateDevice();
            continue;
        }
        resp = r;
    }
    if (resp == null) throw new Error(lastErr == null ? '播放接口无响应' : lastErr + '（已重试）');
    const si = pickStream(resp);
    streamCachePut(vid, si);
    log('stream done vid=' + vid + ' quality=' + si.quality + ' key=' + (si.key ? 'spade' : 'none'));
    return si;
}

/** 同步短眠（壳单线程执行器内仅限重试窗口的短时占用；QuickJS 无 sleep，忙等换算） */
function sleepBusy(ms) {
    const end = Date.now() + ms;
    while (Date.now() < end) { /* busy */ }
}

// ============================ CDN 分段 ============================

/** 取 CDN 分段字节（Range GET），返回 {bytes, total} */
function range(url, start, end) {
    const res = req(url, {
        method: 'get',
        headers: {
            'User-Agent': STREAM_UA,
            'Accept': '*/*',
            'Range': 'bytes=' + start + '-' + end,
        },
        buffer: 1,
        timeout: 30000,
    });
    const content = res.content;
    if (!content || !content.length) throw new Error('range empty');
    const bytes = content instanceof Uint8Array ? content : Uint8Array.from(content);
    const cr = res.headers && (res.headers['content-range'] || res.headers['Content-Range']);
    let total = -1;
    if (cr) {
        const slash = String(cr).lastIndexOf('/');
        if (slash >= 0 && slash < String(cr).length - 1) {
            const t = parseInt(String(cr).substring(slash + 1).trim(), 10);
            if (!isNaN(t)) total = t;
        }
    }
    return { bytes: bytes, total: total };
}

// ============================ MP4/CENC（蓝本 MediaCrypto.prepare/decrypt 同构） ============================

function boxOf(d, at, limit) {
    if (at < 0 || at + 8 > limit) return null;
    let size = u32read(d, at);
    let header = 8;
    if (size === 1) {
        if (at + 16 > limit) return null;
        size = Number(be64read(d, at + 8));
        header = 16;
    }
    if (size === 0) size = limit - at;
    if (size < header || size > limit - at) return null;
    return { start: at, end: at + size, body: at + header, type: ascii4(d, at + 4) };
}

function boxFind(d, type, start, limit) {
    for (let at = start; at <= limit - 8; at++) {
        if (d[at + 4] === type.charCodeAt(0)) {
            const b = boxOf(d, at, limit);
            if (b && type === b.type) return b;
        }
    }
    return null;
}

function ascii4(d, at) {
    return String.fromCharCode(d[at], d[at + 1], d[at + 2], d[at + 3]);
}

function countOf(d, at, limit) {
    if (at + 4 > limit) throw new Error('索引越界');
    const n = u32read(d, at);
    if (n > 200000) throw new Error('索引数量过大');
    return n;
}

const preparedCache = {};
const preparedOrder = [];

function prepareFor(vid, si, total, firstBody) {
    if (preparedCache[vid]) return preparedCache[vid];
    let headerBody = firstBody;
    if (!headerBody || !headerBody.length) {
        const r = range(si.url, 0, Math.max(HEADER_HINT, total) - 1);
        headerBody = r.bytes;
    }
    const p = prepare(headerBody, si.key);
    preparedCache[vid] = p;
    preparedOrder.push(vid);
    while (preparedOrder.length > 8) {
        const old = preparedOrder.shift();
        delete preparedCache[old];
    }
    return p;
}

/** MP4 加密索引解析 + moov 改写 → {header:Uint8Array, samples:[{start,end,encryptedOffset,iv}]} */
function prepare(data, key) {
    if (!key) return { header: new Uint8Array(0), samples: [] };
    const moov = boxOf(data, u32read(data, 0), data.length);
    if (!moov || moov.type !== 'moov') throw new Error('视频索引不完整');

    const samples = [];
    const header = data.slice();
    const moovEnd = moov.end;
    let cursor = moov.body;
    while (cursor < moov.end) {
        const track = boxOf(data, cursor, moov.end);
        if (!track) throw new Error('视频轨道格式异常');
        cursor = track.end;
        if (track.type !== 'trak') continue;
        const stbl = boxFind(data, 'stbl', track.body, track.end);
        if (!stbl) continue;
        const saiz = boxFind(data, 'saiz', stbl.body, stbl.end);
        const saio = boxFind(data, 'saio', stbl.body, stbl.end);
        const stsz = boxFind(data, 'stsz', stbl.body, stbl.end);
        const stsc = boxFind(data, 'stsc', stbl.body, stbl.end);
        let chunks = boxFind(data, 'stco', stbl.body, stbl.end);
        if (!chunks) chunks = boxFind(data, 'co64', stbl.body, stbl.end);
        if (!saiz) continue;
        if (!saio) throw new Error('视频加密索引缺失');
        if (!stsz) throw new Error('样本索引缺失');
        if (!stsc) throw new Error('块索引缺失');
        if (!chunks) throw new Error('块偏移缺失');

        const n = countOf(data, stsz.body + 8, stsz.end);
        const defaultSize = u32read(data, stsz.body + 4) | 0;
        if (defaultSize === 0 && stsz.body + 12 + n * 4 > stsz.end) throw new Error('样本索引截断');
        const sizes = new Float64Array(n);
        for (let i = 0; i < n; i++) sizes[i] = defaultSize > 0 ? defaultSize : u32read(data, stsz.body + 12 + i * 4);

        const chunkCount = countOf(data, chunks.body + 4, chunks.end);
        const width = chunks.type === 'co64' ? 8 : 4;
        if (chunks.body + 8 + chunkCount * width > chunks.end) throw new Error('块偏移截断');
        const offsets = new Float64Array(chunkCount);
        for (let i = 0; i < chunkCount; i++) {
            offsets[i] = width === 8 ? Number(be64read(data, chunks.body + 8 + i * 8)) : u32read(data, chunks.body + 8 + i * 4);
        }

        const entryCount = countOf(data, stsc.body + 4, stsc.end);
        if (entryCount === 0 || stsc.body + 8 + entryCount * 12 > stsc.end) throw new Error('块索引截断');
        const firstChunk = new Float64Array(entryCount);
        const samplesPerChunk = new Float64Array(entryCount);
        for (let i = 0; i < entryCount; i++) {
            firstChunk[i] = u32read(data, stsc.body + 8 + i * 12);
            samplesPerChunk[i] = u32read(data, stsc.body + 12 + i * 12);
        }

        // saiz：body+4=default_size(1B)，body+5=count(4B)，body+9=sizes[]
        const sizeBase = saiz.body + 4 + (((data[saiz.body] << 24) | (data[saiz.body + 1] << 16) | (data[saiz.body + 2] << 8) | data[saiz.body + 3]) & 1 ? 8 : 0);
        if (sizeBase + 5 > saiz.end) throw new Error('辅助索引截断');
        const auxDefault = data[sizeBase] & 255;
        const auxCount = countOf(data, sizeBase + 1, saiz.end);
        if (auxCount !== n || (auxDefault === 0 && sizeBase + 5 + n > saiz.end)) throw new Error('辅助索引数量不一致');
        const auxSizes = new Int32Array(n);
        for (let i = 0; i < n; i++) auxSizes[i] = auxDefault > 0 ? auxDefault : data[sizeBase + 5 + i] & 255;

        // saio：body+4=count(4B)，body+8=offset（宽 4/8）
        const offsetBase = saio.body + 4 + (((data[saio.body] << 24) | (data[saio.body + 1] << 16) | (data[saio.body + 2] << 8) | data[saio.body + 3]) & 1 ? 8 : 0);
        const offsetWidth = (data[saio.body] & 255) === 1 ? 8 : 4;
        if (countOf(data, offsetBase, saio.end) !== 1 || offsetBase + 4 + offsetWidth > saio.end) {
            throw new Error('不支持的辅助索引布局');
        }
        let aux = offsetWidth === 8 ? Number(be64read(data, offsetBase + 4)) : u32read(data, offsetBase + 4);
        let auxTotal = 0;
        for (let i = 0; i < n; i++) auxTotal += auxSizes[i];
        if (aux < 0 || aux + auxTotal > data.length) throw new Error('辅助数据超出索引范围');

        let sampleIndex = 0;
        let entry = 0;
        for (let chunk = 0; chunk < chunkCount; chunk++) {
            while (entry + 1 < entryCount && firstChunk[entry + 1] <= chunk + 1) entry++;
            if (firstChunk[entry] > chunk + 1) throw new Error('样本与块数量不一致');
            const c = samplesPerChunk[entry] | 0;
            if (c > n - sampleIndex) throw new Error('样本与块数量不一致');
            let position = offsets[chunk];
            for (let i = 0; i < c; i++, sampleIndex++) {
                const length = sizes[sampleIndex];
                const auxSize = auxSizes[sampleIndex];
                if (length <= 0 || auxSize < 8) throw new Error('样本索引异常');
                const iv = data.slice(aux, aux + 8);
                const iv16 = new Uint8Array(16);
                iv16.set(iv, 0);
                if (auxSize === 8) {
                    samples.push({ start: position, end: position + length, encryptedOffset: 0, iv: iv16 });
                } else {
                    if (auxSize < 10) throw new Error('不支持的加密样本格式');
                    const subs = ((data[aux + 8] & 255) << 8) | (data[aux + 9] & 255);
                    if (auxSize !== 10 + subs * 6) throw new Error('加密子样本索引异常');
                    let offset = position;
                    let encrypted = 0;
                    for (let s = 0; s < subs; s++) {
                        const at = aux + 10 + s * 6;
                        const clear = ((data[at] & 255) << 8) | (data[at + 1] & 255);
                        const encSize = u32read(data, at + 2) | 0;
                        offset += clear;
                        if (offset + encSize > position + length) throw new Error('加密子样本越界');
                        if (encSize > 0) samples.push({ start: offset, end: offset + encSize, encryptedOffset: encrypted, iv: iv16 });
                        encrypted += encSize;
                        offset += encSize;
                    }
                    if (offset !== position + length) throw new Error('加密子样本长度异常');
                }
                position += length;
                aux += auxSize;
            }
        }
        if (sampleIndex !== n) throw new Error('视频样本不完整');

        // moov 改写：encv/enca → frma 原始编码，sinf → free 清零体
        let at = stbl.body;
        while (at + 8 <= stbl.end) {
            const sinf = boxFind(data, 'sinf', at, stbl.end);
            if (!sinf) break;
            const frma = boxFind(data, 'frma', sinf.body, sinf.end);
            if (!frma || frma.body + 4 > frma.end) throw new Error('原始编码格式缺失');
            const original = data.slice(frma.body, frma.body + 4);
            let entryAt = sinf.start - 1;
            while (entryAt >= stbl.body && 'encv' !== ascii4(data, entryAt) && 'enca' !== ascii4(data, entryAt)) {
                entryAt--;
            }
            if (entryAt < stbl.body) throw new Error('encv 缺失');
            header.set(original, entryAt);
            header.set(utf8ToBytes('free'), sinf.start + 4);
            for (let i = sinf.body; i < sinf.end; i++) header[i] = 0;
            at = sinf.end;
        }
    }
    if (!samples.length) throw new Error('视频加密索引不可用');

    samples.sort(function (a, b) { return a.start - b.start; });
    for (let i = 1; i < samples.length; i++) {
        if (samples[i].start < samples[i - 1].end) throw new Error('视频样本重叠');
    }
    return { header: header.slice(0, moovEnd), samples: samples };
}

/** 分段解密（Java decryptBytes 1:1：header 拼回 + 逐样本 CTR） */
function decryptBytes(data, start, key, prepared) {
    const result = data.slice();
    const end = start + data.length;
    if (start < prepared.header.length) {
        const from = start;
        const to = Math.min(end, prepared.header.length);
        result.set(prepared.header.subarray(from, to), 0);
    }
    if (!key) return result;
    // 二分定位首个相关样本
    let low = 0, high = prepared.samples.length;
    while (low < high) {
        const mid = (low + high) >>> 1;
        if (prepared.samples[mid].end <= start) low = mid + 1;
        else high = mid;
    }
    for (let i = low; i < prepared.samples.length; i++) {
        const s = prepared.samples[i];
        if (s.start >= end) break;
        const begin = Math.max(start, s.start);
        const stop = Math.min(end, s.end);
        if (begin >= stop) continue;
        const relative = begin - s.start + s.encryptedOffset;
        const skip = relative % 16;
        // counter = BE(iv) + floor(relative/16)，128 位回绕
        const counter = (bytesToBigIntBE(s.iv) + BigInt(Math.floor(relative / 16))) & ((1n << 128n) - 1n);
        const seg = data.subarray(begin - start, stop - start);
        const input = new Uint8Array(skip + seg.length);
        input.set(seg, skip);
        const decrypted = aesCtrDecrypt(key, counter, skip, input);
        result.set(decrypted.subarray(skip), begin - start);
    }
    return result;
}

// ============================ 弹幕（tsukiyo hongguoTV TimedComments 蓝本） ============================

const DM_COMMENT_HOST = 'https://api5-normal-sinfonlineb.fqnovel.com';
const DM_UA = 'com.phoenix.read/73532 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3; Cronet/TTNetVersion:04657795 2026-01-23 QuicVersion:c67e9834 2025-09-08)';
const DM_WINDOW_MS = 30000;
const DM_COUNT = 90;
const DM_MAX_WINDOWS = 40;

const dmVidSeries = {};  // vid → series_id（detail 时填充）

function dmProxyUrl(vid) {
    // Global.getProxy 已带 ?do=js，剥掉后拼弹幕分支
    const base = String(getProxy(true)).replace('?do=js', '');
    return base + '?do=danmu&siteKey=' + SITE_KEY + '&vid=' + vid;
}

/** 弹幕评论列表单窗请求（全套签名头） */
function dmCommentWindow(vid, bookId, startMs, durationMs, cursor) {
    const business = {
        book_id: bookId,
        start_offset_time: startMs,
        playlet_item_duration: durationMs,
        need_danmaku_guide_type: [1, 3, 4, 2],
    };
    const payload = {
        comment_source: 601,
        server_channel: 1000,
        group_id: String(vid),
        group_type: 30,
        comment_type: 20,
        sort: 1,
        count: DM_COUNT,
        cursor: cursor,
        aid: 8662,
        compliance_status: 0,
        business_param: business,
    };
    const now = Date.now();
    const params = [
        ['aid', '8662'], ['app_name', 'novelread'], ['version_code', '73532'],
        ['version_name', '7.3.5.32'], ['manifest_version_code', '73532'], ['update_version_code', '73532'],
        ['channel', 'update_64'], ['device_platform', 'android'], ['os', 'android'], ['ssmix', 'a'],
        ['device_type', '25053RT47C'], ['device_brand', 'Redmi'], ['language', 'zh'], ['os_api', '36'],
        ['os_version', '16'], ['resolution', '1280*2772'], ['dpi', '520'], ['ac', 'wifi'],
        ['device_id', '7397450988462912345'], ['iid', '7397450988462912346'], ['_rticket', String(now)],
    ];
    const encoded = params.map(function (p) { return p[0] + '=' + encodeURIComponent(p[1]); }).join('&');

    const nonce = randomBytes(11);
    const first = (((nonce[0] & 255) % 7) + 1) << 5;
    const second = 0xe0 | (nonce[1] & 15);
    const argusRandom = (nonce[6] | (nonce[7] << 8) | (nonce[8] << 16) | (nonce[9] << 24)) >>> 0;
    const signCount = 2 + ((nonce[10] & 255) % 49) * 2;

    const headers = {
        'User-Agent': DM_UA,
        'Accept': 'application/json',
        'X-XS-From-Web': '0',
        'Sdk-Version': '2',
        'Comment-Source': '601',
        'Server-Channel': '1000',
        'Content-Type': 'application/json; charset=utf-8',
        'X-Gorgon': dmGorgon(dmGorgonSeed(encoded, '', '', Math.floor(now / 1000)), first, second, 0),
        'X-Khronos': String(Math.floor(now / 1000)),
        'X-SS-Req-Ticket': String(now),
        'X-SS-STUB': '',
        'X-Argus': dmArgus(encoded, '', Math.floor(now / 1000), argusRandom, signCount),
        'X-Ladon': dmLadon(Math.floor(now / 1000), nonce.slice(2, 6)),
    };
    const resp = req(DM_COMMENT_HOST + '/novel/commentapi/comment/list/' + vid + '/v1/?' + encoded, {
        method: 'post',
        headers: headers,
        data: payload,
        postType: 'json',
        timeout: 15000,
    });
    return safeParse(resp.content || '{}');
}

function dmEscape(text) {
    return String(text).replace(/&/g, '&amp;').replace(/</g, '&lt;').replace(/>/g, '&gt;')
        .replace(/"/g, '&quot;').replace(/'/g, '&apos;');
}

/** 窗口循环拉全集弹幕 → B 站 XML（JS 版无同步 sleep，窗间不做节流；上游延迟天然形成间隔） */
function dmFetchXml(vid, bookId) {
    const xml = ['<?xml version="1.0" encoding="UTF-8"?>\n<i>'];
    const markers = [];
    const seenIds = {};
    let startMs = 0;
    let cursor = '';
    let total = 0;
    try {
        for (let i = 0; i < DM_MAX_WINDOWS; i++) {
            const marker = startMs + ':' + cursor;
            if (markers.indexOf(marker) >= 0) break;
            markers.push(marker);
            const resp = dmCommentWindow(vid, bookId, startMs, 0, cursor);
            if ((resp.code | 0) !== 0) {
                log('danmu window code=' + (resp.code | 0) + ' msg=' + (resp.message || resp.msg || ''));
                break;
            }
            const data = resp.data;
            if (!data) break;
            const extra = data.extra;
            let next = extra ? (extra.next_query_danmaku_list_time | 0) : startMs + DM_WINDOW_MS;
            if (!next || next <= startMs) next = startMs + DM_WINDOW_MS;
            const listInfo = data.common_list_info;
            const nextCursor = listInfo ? String(listInfo.cursor || '') : '';
            const hasMore = !!(listInfo && listInfo.has_more);
            const rows = data.data_list;
            if (rows) {
                for (let r = 0; r < rows.length; r++) {
                    const row = rows[r];
                    const comment = row && row.comment;
                    if (!comment) continue;
                    const common = comment.common;
                    const expand = comment.expand;
                    if (!common || !expand) continue;
                    if (String(common.group_id || '') !== String(vid) || (common.status | 0) !== 1) continue;
                    const time = expand.offset_time != null ? expand.offset_time : -1;
                    let id = String(comment.comment_id || '');
                    if (id.length > 120) id = id.substring(0, 120);
                    let text = common.content ? String(common.content.text || '') : '';
                    text = text.replace(/[\u0000-\u0008\u000b\u000c\u000e-\u001f\u2028\u2029]/g, ' ').trim();
                    if (text.length > 180) text = text.substring(0, 180);
                    if (!id || !text || seenIds[id]) continue;
                    seenIds[id] = 1;
                    xml.push('<d p="' + (time / 1000.0).toFixed(2) + ',1,25,16777215">' + dmEscape(text) + '</d>');
                    total++;
                }
            }
            if (!hasMore) break;
            startMs = next;
            cursor = nextCursor;
        }
    } catch (e) {
        log('danmu fetch FAIL vid=' + vid + ' : ' + e);
    }
    xml.push('</i>');
    log('danmu fetch done vid=' + vid + ' series=' + bookId + ' windows=' + markers.length + ' count=' + total);
    return xml.join('');
}

// ============================ Spider 代理 ============================

function proxyPlay(params) {
    const vid = params.vid;
    if (!vid || !/^\d+$/.test(String(vid))) {
        log('proxy invalid vid=' + vid);
        return null;
    }
    let rangeHeader = params['__range'];
    if (!rangeHeader) rangeHeader = params['range'];
    if (!rangeHeader) rangeHeader = 'bytes=0-';
    const m = /bytes=(\d+)-(\d*)/.exec(String(rangeHeader));
    if (!m) {
        log('proxy bad range=' + rangeHeader);
        return null;
    }
    const start = parseInt(m[1], 10);
    const si = stream(vid);
    const r = range(si.url, start, start + SEG_SIZE - 1);
    let total = r.total;
    if (total <= 0) total = start + r.bytes.length;
    const prepared = si.key ? prepareFor(vid, si, total, start === 0 ? r.bytes : null)
        : { header: new Uint8Array(0), samples: [] };
    const decrypted = decryptBytes(r.bytes, start, si.key, prepared);
    if (!decrypted.length) return [404, 'text/plain', '', { 'Content-Length': '0' }];
    const realEnd = start + decrypted.length - 1;
    log('proxy vid=' + vid + ' start=' + start + ' got=' + r.bytes.length + ' total=' + total);
    return [206, 'video/mp4', bytesToB64(decrypted), { 'Content-Range': 'bytes ' + start + '-' + realEnd + '/' + total, 'Accept-Ranges': 'bytes' }, 1];
}

function proxyDanmu(params) {
    const vid = params.vid;
    if (!vid || !/^\d+$/.test(String(vid))) {
        log('proxy danmu invalid vid=' + vid);
        return null;
    }
    try {
        const series = dmVidSeries[String(vid)] || '';
        const xml = dmFetchXml(String(vid), series);
        return [200, 'text/xml;charset=utf-8', xml, {}];
    } catch (e) {
        log('proxy danmu FAIL vid=' + vid + ' : ' + e);
        return [500, 'text/plain', '', { 'Content-Length': '0' }];
    }
}

// ============================ 输出工具 ============================

function pageData(items, page, lastPage, hasMore) {
    const list = [];
    for (let i = 0; i < items.length; i++) {
        list.push({
            vod_id: items[i].id,
            vod_name: items[i].name,
            vod_pic: items[i].cover,
            vod_remarks: items[i].badge,
            vod_actor: '',
            vod_content: items[i].intro,
        });
    }
    return JSON.stringify({
        list: list,
        page: page,
        pagecount: hasMore ? Math.max(page, lastPage) : page,
        limit: PAGE_SIZE,
        total: 0,
    });
}

// ============================ Spider 协议 ============================

export default {
    init(cfg) {
        log('init');
    },

    home(filter) {
        try {
            const classes = [];
            for (let i = 0; i < CATS.length; i++) {
                classes.push({ type_id: CATS[i], type_name: CATS[i] });
            }
            log('home done cats=' + classes.length);
            return JSON.stringify({ class: classes });
        } catch (e) {
            log('home FAIL ' + e);
            return '';
        }
    },

    homeVod() {
        try {
            const items = appSearchPage('短剧', 1);
            return pageData(items, 1, 1, false);
        } catch (e) {
            log('homeVod FAIL ' + e);
            return '';
        }
    },

    category(tid, pg, filter, extend) {
        let page = 1;
        try { page = Math.max(1, parseInt(String(pg == null ? '1' : pg).trim(), 10) || 1); } catch (e) {}
        let kw = String(tid == null ? '' : tid).trim();
        if (!kw) kw = '短剧';
        try {
            const items = appSearchPage(kw, page);
            log('category done kw=' + kw + ' page=' + page + ' items=' + items.length);
            return pageData(items, page, items.length >= PAGE_SIZE ? page + 1 : page, items.length >= PAGE_SIZE);
        } catch (e) {
            log('category FAIL kw=' + kw + ' : ' + e);
            return pageData([], page, page, false);
        }
    },

    search(wd, quick, pg) {
        let page = 1;
        try { page = Math.max(1, parseInt(String(pg == null ? '1' : pg).trim(), 10) || 1); } catch (e) {}
        const keyword = String(wd == null ? '' : wd).trim();
        log('search enter kw=[' + keyword + '] page=' + page);
        if (!keyword || keyword.length > 80) return pageData([], page, page, false);
        try {
            const items = appSearchPage(keyword, page);
            log('search done kw=[' + keyword + '] items=' + items.length);
            return pageData(items, page, items.length >= PAGE_SIZE ? page + 1 : page, items.length >= PAGE_SIZE);
        } catch (e) {
            log('search FAIL kw=[' + keyword + '] : ' + e);
            return pageData([], page, page, false);
        }
    },

    detail(id) {
        const t0 = Date.now();
        try {
            const sid = String(id);
            log('detail enter id=' + sid);
            const all = detailAll(sid);
            const eps = all.eps;
            const vd = all.vd;
            if (!eps.length) throw new Error('video_list 空');
            let name = String(vd.series_title || '');
            const cover = String(vd.series_cover || '');
            const intro = String(vd.series_intro || '');
            let badge = String(vd.episode_right_text || '');
            if (!name) name = '西红短剧 ' + sid;
            if (!badge) badge = '全' + eps.length + '集';
            const play = [];
            for (let i = 0; i < eps.length; i++) {
                play.push('第' + ('0' + (i + 1)).slice(-2) + '集$' + eps[i].vid);
                dmVidSeries[String(eps[i].vid)] = sid;
            }
            const v = {
                vod_id: sid,
                vod_name: name,
                vod_pic: cover,
                vod_content: intro,
                vod_remarks: badge,
                type_id: '热播',
                type_name: '西红短剧',
                vod_play_from: '西红短剧',
                vod_play_url: play.join('#'),
            };
            log('detail done id=' + sid + ' name=' + name + ' eps=' + eps.length + ' cost=' + (Date.now() - t0) + 'ms');
            return JSON.stringify({ code: 1, list: [v] });
        } catch (e) {
            log('detail FAIL ' + (e && e.message || e));
            return '';
        }
    },

    play(flag, id, vipFlags) {
        const t0 = Date.now();
        try {
            log('play id=' + id + ' cost=' + (Date.now() - t0) + 'ms');
            return JSON.stringify({
                parse: 0,
                playUrl: '',
                header: {},
                flag: flag || '西红短剧',
                url: 'proxy://do=play&siteKey=' + SITE_KEY + '&vid=' + id,
                danmaku: dmProxyUrl(String(id)),
            });
        } catch (e) {
            log('play FAIL id=' + id + ' : ' + e);
            return JSON.stringify({ msg: '获取播放数据失败：' + (e && e.message || e), flag: flag || '西红短剧', url: '', parse: 0 });
        }
    },

    proxy(params) {
        try {
            if (params.do === 'danmu') return proxyDanmu(params);
            if (params.do !== 'play') return null;
            return proxyPlay(params);
        } catch (e) {
            log('proxy FAIL vid=' + params.vid + ' : ' + e);
            return [500, 'text/plain', '', { 'Content-Length': '0' }];
        }
    },
};

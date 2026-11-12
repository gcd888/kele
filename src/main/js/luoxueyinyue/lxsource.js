/**
 * lxsource.js — lx 音源 JS 宿主适配层（catvod JsSpider 协议，16 个 lx_* 源共用）
 *
 * 行为规格来源（kele/src/main/java/luoxueyinyue/src/com/github/catvod/spider/）：
 *  - LxSource.java（52 行薄壳）：init 建 LxScript 实例，lxStream → lx.musicUrl
 *    → 失败回退 LuoxueApi.stream；
 *  - LxScript.java（433 行）：脚本实例生命周期（拉取/头部解析/inited/sources 解析/
 *    musicUrl 质量循环/musicInfoJson/extractUrl/streamReachable 探活）；
 *  - LxHost.java（303 行）：globalThis.lx 注入面（EVENT_NAMES/on/send/request/
 *    utils{buffer,crypto,zlib}/version/env/console/timer/btoa/atob/currentScriptInfo）；
 *  - LxHttp.java（144 行）：lx.request 的 HTTP 语义（默认 UA/Accept、POST 默认
 *    application/json、form 转 urlencoded、body 尝试 JSON.parse）；
 *  - LxCrypto.java（122 行）：md5(encodeURIComponent)、aes(mode,key,iv)、
 *    rsa NoPadding 公钥加密、randomBytes、zlib inflate/deflate；
 *  - MusicCore.java（目录链路 home/category/search/detail 消费面，结构对齐子集）；
 *  - LuoxueApi.java（204 行，聚合取流兜底，1:1 完整移植）。
 *
 * 站点 key：lx_*（16 个源共用本文件），ext 由壳传入（lx 脚本路径）。
 *
 * ============ lx 同步桥设计（核心难点） ============
 *
 * lx js 是异步回调式（request(url, options, callback)、on(request, handler)），
 * spider 协议是同步请求-响应。JS 侧方案分两层：
 *
 * 1) HTTP 层同步桥：lx.request → 宿主 req（壳内 okhttp / node 桩 Worker+Atomics，
 *    均为同步语义）→ 回调在 request 调用返回前同步完成。lx 脚本对回调时序无要求
 *    （lx_xinghai.js 的 request 用法均包在 Promise executor / 回调一次即 resolve，
 *    已通读全部 request 调用点确认），同步回调形态兼容。
 *
 * 2) handler 层 Promise 桥：lx_xinghai 的 handler 是 async 函数，同步调用返回
 *    Promise（async 包装把返回值推迟到微任务）。壳内 QuickJS（whl wrapper）在每次
 *    Java→JS 函数调用结束后执行 executePendingJobLoop（native call/evaluate 后
 *    必跑，已核实 wrapper 2.1.0 native 源码），且壳 JsSpider 的 Async.run 对 spider
 *    方法返回的 Promise 走 then/catch 等待 —— 因此 play() 在 handler 返回 Promise
 *    时直接返回该 Promise 的链（.then 组装结果），壳侧 await 微任务后拿到 JSON
 *    字符串；handler 同步返回值（非 Promise）时保持同步返回。node 桩 run.mjs 侧
 *    await 兼容两种形态。
 *
 * env/timer：LxHost.java 里 env 是字符串 "lx-music-mobile"（lx.env 与 globalThis.env
 * 同值，1:1 对齐）；setTimeout/setInterval 用宿主桥 + 自管 id（壳 Global.setTimeout
 * 为一次性无句柄，重复定时器由包装函数重排实现，clearTimeout 在壳无宿主实现时按
 * 取消标记短路）。
 *
 * 与 Java 版的差异（记录为疑点/平台约束）：
 *  - 目录链路 MusicCore 为 4615 行六平台聚合实现，本文件移植结构与「可安全直译」
 *    的数据面子集：search 全六平台（ne/qq/kg/kw/mg/soda）、hot 榜（ne/qq/kw/soda，
 *    kg/mg 榜单端点未移植）、榜单目录（静态榜单表，kg/mg 动态榜单未移植）、
 *    歌单页/歌单 songs（仅 netease）、官方平台直链 stream/lyric（weapi/QRC/KRC
 *    未移植）——取流主链路 lx 脚本 + LuoxueApi 聚合兜底完整，官方链路仅作注释位；
 *  - homeContent filters（catsParallel 五平台并行分类聚合）未移植；
 *  - 壳 req 无状态码：node 桩带 code 字段；壳内 statusCode 启发式
 *   （content 非空→200，空→0）；
 *  - ext 本地路径：node 走 fs 读源码 → (0,eval) 全局脚本求值（与 LxScript.eval
 *    同为 script 语义）；壳内无 fs，走动态 import（ESM 严格模式求值，脚本头部
 *    @name 等元信息缺失时回退 label，currentScriptInfo.rawScript 为空）；
 *  - LxCrypto.rsa 为 RSA/ECB/NoPadding 公钥加密（宿主 rsaEncrypt 是 PKCS1），
 *    本文件自实现 BigInt modpow + X509/PKCS1 SPKI DER 解析取模数。
 *
 * 宿主依赖：req/local/getProxy/console/setTimeout；lib/crypto-js.js、lib/pako.js、
 *           lib/binutil.js。
 */

// 副作用 import：pako（gzip）挂 globalThis；crypto-js 挂 globalThis.CryptoJS
import '../lib/pako.js';
import '../lib/crypto-js.js';
import {
    bytesToHex, hexToBytes, bytesToB64, b64ToBytes,
    utf8ToBytes, bytesToUtf8, concatBytes, randomBytes,
} from '../lib/binutil.js';

const log = (...a) => { try { baseLog('[lx-js]', ...a); } catch (e) {} };

// 模块加载期捕获宿主原生 console（lxInstallHost 会按 LxHost 语义覆盖 globalThis.console，
// 日志基线需避开递归：覆盖后的 console.log → lxLog → baseLog 直达原生 console）
const baseLog = (typeof globalThis.console !== 'undefined' && globalThis.console && globalThis.console.log)
    ? globalThis.console.log.bind(globalThis.console)
    : function () {};

// ============================ 通用工具（MusicCore.java） ============================

const WEB_UA = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36';
const KG_UA = 'Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1';
const KG_REFERER = 'http://m.kugou.com';
const SODA_APP_UA = 'com.luna.music/100198030 (Linux; U; Android 15; zh_CN_#Hans; ABR-AL80; Build/V417IR;tt-ok/3.12.13.19)';
const SODA_WEB_UA = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36';
const KW_UA = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36';
const MG_UA = 'Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1';
const MG_REFERER = 'http://music.migu.cn/';
const MG_ANDROID_UA = 'Android_migu/7.41.13 okhttp/3.12.13';

/** headers(String... kv) → 对象。 */
function headers(kv) {
    const map = {};
    for (let i = 0; i + 1 < kv.length; i += 2) map[kv[i]] = kv[i + 1];
    return map;
}

/** 随机国内 IP 头（kuwo/migu/kugou 防频控，music-lib WithRandomIPHeader 同语义）。 */
function withRandomIp(base) {
    const map = base || {};
    if (map['X-Forwarded-For']) return map;
    const prefixes = [[116, 255], [116, 228], [218, 192], [124, 0], [14, 132],
        [183, 14], [58, 14], [113, 116], [120, 230]];
    const seg = prefixes[Math.floor(Math.random() * prefixes.length)];
    const ip = seg[0] + '.' + seg[1] + '.' + (1 + Math.floor(Math.random() * 254)) + '.' + (1 + Math.floor(Math.random() * 254));
    map['X-Forwarded-For'] = ip;
    map['X-Real-IP'] = ip;
    return map;
}

/** URLEncoder.encode(v, "UTF-8").replace("+", "%20") 语义。 */
function enc(v) {
    const out = [];
    const bytes = utf8ToBytes(String(v));
    for (let i = 0; i < bytes.length; i++) {
        const b = bytes[i];
        const c = String.fromCharCode(b);
        if ((b >= 0x41 && b <= 0x5a) || (b >= 0x61 && b <= 0x7a) || (b >= 0x30 && b <= 0x39)
            || b === 0x2e || b === 0x2d || b === 0x2a || b === 0x5f) out.push(c);
        else if (b === 0x20) out.push('%20');
        else out.push('%' + b.toString(16).toUpperCase().padStart(2, '0'));
    }
    return out.join('');
}

function firstNonEmpty() {
    for (let i = 0; i < arguments.length; i++) {
        const v = arguments[i];
        if (v != null && String(v).trim() !== '') return String(v).trim();
    }
    return '';
}

function httpText(url, hv, timeout) {
    const res = req(url, { method: 'get', headers: hv || {}, timeout: timeout || 15000 });
    return res.content || '';
}

function httpPost(url, hv, body, timeout) {
    const res = req(url, { method: 'post', headers: hv || {}, body: body, timeout: timeout || 15000 });
    return res.content || '';
}

function getJson(url, hv, timeout) {
    const text = httpText(url, hv, timeout);
    if (text === '') throw new Error('http empty ' + url);
    return JSON.parse(text);
}

function getText(url, hv, timeout) {
    return httpText(url, hv, timeout);
}

function postJson(url, hv, body, timeout) {
    const h = Object.assign({}, hv || {});
    if (!h['Content-Type'] && !h['content-type']) h['Content-Type'] = 'application/json';
    return JSON.parse(httpPost(url, h, body, timeout));
}

// ============================ 数据模型（MusicCore.java） ============================

const PLAY_FLAG = '果剧音乐';
const PLATFORMS = ['netease', 'qq', 'kugou', 'soda', 'kuwo', 'migu'];

function Song(platform, id, name, artist, album, cover, duration) {
    return {
        platform: platform,
        id: id,        // 平台内原始 id（netease 数字 / qq songmid / kugou hash_albumAudioId / soda trackid / kuwo rid / migu contentId）
        name: name,
        artist: artist,
        album: album,
        cover: cover,
        duration: duration, // 秒
        mvid: '',       // netease mvid / qq vid（MV 可选展示）
        songNumId: '',  // qq 数字 songid（PlayLyricInfo 必须，与 mvid 独立保存）
        hasK: true,     // 可K歌（有逐词歌词且可播）
    };
}

/** 壳侧统一歌曲 id：{platform}_{songid} */
function songUid(s) {
    return s.platform + '_' + s.id;
}

/** 解析壳侧统一 id（{platform}_{songid}），kugou/soda/kuwo 内部 id 含下划线时按首段切分。 */
function splitUid(uid) {
    const bar = uid.indexOf('_');
    if (bar <= 0) return null;
    return [uid.substring(0, bar), uid.substring(bar + 1)];
}

/** kugou 内部 id 切分：hash_albumAudioId → [hash, albumAudioId]（旧格式纯 hash 兼容）。 */
function kgSplitId(songId) {
    if (songId == null) return ['', '0'];
    const i = songId.indexOf('_');
    if (i <= 0) return [songId, '0'];
    return [songId.substring(0, i), songId.substring(i + 1)];
}

function platformName(platform) {
    switch (platform) {
        case 'netease': return '芸朵';
        case 'qq': return '秋秋';
        case 'kugou': return '小枸';
        case 'soda': return '七七';
        case 'kuwo': return '蜗牛';
        case 'migu': return '小蜜';
        default: return platform;
    }
}

/** 歌曲缓存（uid→Song）：playerContent 阶段反查歌名，LRU 512。 */
const SONG_CACHE = new Map();

function songByUid(uid) {
    return uid == null ? null : SONG_CACHE.get(uid) || null;
}

function songJson(s) {
    return {
        id: songUid(s),
        name: s.name,
        artist: s.artist,
        album: s.album,
        cover: s.cover,
        duration: s.duration,
        platform: s.platform,
        hasK: s.hasK,
    };
}

// ============================ 输出格式（MusicCore.java） ============================

function songsToPageData(songs) {
    for (const s of songs) SONG_CACHE.set(songUid(s), s);
    const list = songs.map((s) => ({
        vod_id: songUid(s),
        vod_name: s.name,
        vod_pic: s.cover,
        vod_remarks: s.artist,
        vod_actor: s.album,
        vod_content: s.artist + (s.album === '' ? '' : ' · ' + s.album),
    }));
    return JSON.stringify({
        list: list,
        page: 1,
        pagecount: 1,
        limit: 100,
        total: songs.length,
    });
}

function pageDataEmpty(page) {
    return JSON.stringify({
        list: [],
        page: page,
        pagecount: page,
        limit: 20,
        total: 0,
    });
}

// ============================ 网易云（netease，MusicCore.java） ============================

const NE_REFERER = 'http://music.163.com';

function neHeaders() {
    return headers(['Referer', NE_REFERER, 'Cookie', 'os=pc; appver=2.10.13']);
}

/** 网易云搜索（linux/forward 通道 + cloudsearch/pc，music-lib 同端点）。 */
function neSearch(kw) {
    const payload = JSON.stringify({
        method: 'POST',
        url: 'http://music.163.com/api/cloudsearch/pc',
        params: { s: kw, type: 1, offset: 0, limit: 30 },
    });
    const resp = postJson('http://music.163.com/api/linux/forward',
        withRandomIp(headers(['Referer', NE_REFERER,
            'User-Agent', 'Mozilla/5.0 (X11; Linux x86_64; rv:81.0) Gecko/20100101 Firefox/81.0',
            'Content-Type', 'application/x-www-form-urlencoded'])),
        'eparams=' + linuxEparams(payload));
    const songs = resp.result ? resp.result.songs : null;
    if (!songs) log('neSearch empty kw=' + kw);
    return neParseSongs(songs);
}

const NE_LINUX_KEY = hexToBytes('7246674226682325323F5E6544673A51');

/** 网易云 linux/forward 通道：AES-128-ECB(PKCS5) 后转大写 HEX。 */
function linuxEparams(json) {
    const key = CryptoJS.lib.WordArray.create(bytesToWords(NE_LINUX_KEY), 16);
    const encd = CryptoJS.AES.encrypt(
        CryptoJS.lib.WordArray.create(bytesToWords(utf8ToBytes(json)), utf8ToBytes(json).length),
        key, { mode: CryptoJS.mode.ECB, padding: CryptoJS.pad.Pkcs7 });
    const raw = wordsToBytes(encd.ciphertext.words, encd.ciphertext.sigBytes);
    let s = '';
    for (let i = 0; i < raw.length; i++) s += raw[i].toString(16).toUpperCase().padStart(2, '0');
    return s;
}

function bytesToWords(b) {
    const w = [];
    for (let i = 0; i < b.length; i += 4) {
        w.push((((b[i] || 0) << 24) | ((b[i + 1] || 0) << 16) | ((b[i + 2] || 0) << 8) | (b[i + 3] || 0)) | 0);
    }
    return w;
}

function wordsToBytes(w, len) {
    const out = new Uint8Array(len);
    for (let i = 0; i < len; i++) out[i] = (w[i >>> 2] >>> (24 - (i % 4) * 8)) & 255;
    return out;
}

/** 网易云歌曲列表解析（榜单/歌单/搜索统一，artists|ar 兼容、album|al 兼容）。 */
function neParseSongs(songs) {
    const out = [];
    if (!songs) return out;
    for (const s of songs) {
        if (!s) continue;
        const id = String(s.id != null ? s.id : 0);
        const name = (s.name || '').trim();
        if (id === '' || id === '0' || name === '') continue;
        let artists = s.artists;
        if (!artists) artists = s.ar;
        const artistParts = [];
        if (artists) {
            for (let j = 0; j < artists.length && j < 5; j++) {
                const a = artists[j];
                if (!a) continue;
                const n = (a.name || '').trim();
                if (n === '') continue;
                artistParts.push(n);
            }
        }
        let album = s.album;
        if (!album) album = s.al;
        const cover = album ? (album.picUrl || '') : '';
        const duration = Math.floor((s.duration != null ? s.duration : (s.dt != null ? s.dt : 0)) / 1000);
        const song = Song('netease', id, name, artistParts.join('、'),
            album ? (album.name || '') : '', cover, duration);
        song.mvid = String(s.mvid != null ? s.mvid : (s.mv != null ? s.mv : 0));
        const priv = s.privilege;
        if (priv && (priv.st === -200 || priv.fee === 1)) {
            song.hasK = false;
        }
        out.push(song);
    }
    return out;
}

/** 网易云榜单/歌单歌曲（公开 api/playlist/detail，榜单即特殊歌单）。 */
function nePlaylistSongs(playlistId) {
    const resp = getJson('https://music.163.com/api/playlist/detail?id=' + enc(playlistId), neHeaders());
    const result = resp.result;
    if (!result) return [];
    return neParseSongs(result.tracks);
}

/** 网易云歌单元数据（[name, coverImgUrl]）。 */
function nePlaylistMeta(playlistId) {
    try {
        const resp = getJson('https://music.163.com/api/playlist/detail?id=' + enc(playlistId), neHeaders());
        const result = resp.result;
        if (!result) return ['', ''];
        return [result.name || '', result.coverImgUrl || ''];
    } catch (e) {
        log('nePlaylistMeta FAIL id=' + playlistId + ' : ' + e);
        return ['', ''];
    }
}

// ============================ QQ 音乐（qq，MusicCore.java） ============================

const QQ_REFERER = 'https://y.qq.com/';

/** QQ 搜索（search_for_qq_cp 老接口，music-lib 同端点；old 命名结构）。 */
function qqSearch(kw) {
    const url = 'http://c.y.qq.com/soso/fcgi-bin/search_for_qq_cp?' +
        'w=' + enc(kw) + '&format=json&p=1&n=30';
    const resp = getJson(url, withRandomIp(headers(['Referer', QQ_REFERER, 'User-Agent', KG_UA])));
    const data = resp.data;
    const song = data ? data.song : null;
    if (!song) {
        log('qqSearch empty kw=' + kw + ' code=' + resp.code);
        return [];
    }
    const list = song.list;
    const out = [];
    if (!list) return out;
    for (const item of list) {
        const s = qqParseSong(item);
        if (s) out.push(s);
    }
    return out;
}

function qqParseSong(s) {
    if (!s) return null;
    const mid = s.songmid || s.mid || '';
    const name = (s.songname || s.name || '').trim();
    if (mid === '' || name === '') return null;
    let albumName = s.albumname || '';
    let albumMid = s.albummid || '';
    if (albumName === '') {
        const album = s.album;
        if (album) {
            albumName = album.name || album.title || '';
            if (albumMid === '') albumMid = album.mid || album.pmid || '';
        }
    }
    const singers = s.singer;
    const artistParts = [];
    if (singers) {
        for (let j = 0; j < singers.length && j < 5; j++) {
            const a = singers[j];
            if (!a) continue;
            const n = (a.name || '').trim();
            if (n === '') continue;
            artistParts.push(n);
        }
    }
    const interval = s.interval || 0;
    const song = Song('qq', mid, name, artistParts.join('、'), albumName,
        albumMid === '' ? '' : 'https://y.gtimg.cn/music/photo_new/T002R300x300M000' + albumMid + '.jpg',
        interval);
    const songId = String(s.songid != null ? s.songid : (s.id != null ? s.id : 0));
    song.songNumId = songId;
    song.mvid = 'qqmeta:' + songId + ':' + albumMid;
    const mv = s.mv;
    if (mv && mv.vid && mv.vid !== '') {
        song.mvid = mv.vid;
    } else {
        const mvStr = s.mv;
        if (typeof mvStr === 'string' && mvStr !== '' && !mv) song.mvid = mvStr;
    }
    return song;
}

/** QQ 榜单歌曲（fcg_v8_toplist_cp）。 */
function qqToplistSongs(topId) {
    const url = 'https://c.y.qq.com/v8/fcg-bin/fcg_v8_toplist_cp.fcg?' +
        'topid=' + enc(topId) + '&song_begin=0&song_num=100&format=json' +
        '&inCharset=utf8&outCharset=utf-8&notice=0&platform=h5&needNewCode=1&tpl=3&page=detail&type=top';
    const resp = getJson(url, headers(['Referer', QQ_REFERER, 'User-Agent', WEB_UA]));
    if (resp.code !== 0) return [];
    return qqParseSongList(resp.songlist);
}

function qqParseSongList(songList) {
    const out = [];
    if (!songList) return out;
    for (const item of songList) {
        let d = item && item.data ? item.data : item;
        const s = qqParseSong(d);
        if (s) out.push(s);
    }
    return out;
}

// ============================ 酷狗（kugou，MusicCore.java） ============================

function kgHeaders() {
    return headers(['User-Agent', KG_UA, 'Referer', KG_REFERER]);
}

/** 酷狗歌曲条目解析（rank/song、special/song、search 三种结构统一）。 */
function kgParseSong(s) {
    if (!s) return null;
    const hash = firstNonEmpty(s.hash || '', s.FileHash || '', s.SQFileHash || '', s.HQFileHash || '');
    if (hash === '' || hash === '00000000000000000000000000000000') return null;
    let name = (s.songname || s.SongName || '').trim();
    let singer = (s.singername || s.SingerName || '').trim();
    const filename = s.filename || s.FileName || '';
    if (name === '' || singer === '') {
        const parts = String(filename).split(' - ');
        if (parts.length === 2) {
            if (singer === '') singer = parts[0].trim();
            if (name === '') name = parts[1].trim();
        } else if (name === '') {
            name = String(filename).trim();
        }
    }
    if (name === '') return null;
    const album = (s.album_name || s.AlbumName || '').trim();
    // rank/song 条目无 ori_img_url，封面在 album_sizable_cover / trans_param.union_cover（嵌套，optString 点号路径取不到）
    let img = firstNonEmpty(s.ori_img_url || '', s.Image || '', s.album_sizable_cover || '', s.imgurl || '');
    if (img === '') {
        const tp = s.trans_param;
        if (tp) img = tp.union_cover || '';
    }
    img = img.replace('{size}', '240');
    let duration = s.duration != null ? s.duration : (s.Duration != null ? s.Duration : 0);
    if (duration > 10000) duration = Math.floor(duration / 1000);
    // v5/url 取流需要 album_audio_id（KuGouMusicApi song_url.js 蓝本），编码进 id：hash_albumAudioId
    const aaId = s.album_audio_id != null ? s.album_audio_id : (s.AlbumAudioID != null ? s.AlbumAudioID : 0);
    const id = aaId > 0 ? hash + '_' + aaId : hash;
    return Song('kugou', id, name, singer, album, img, duration);
}

function kgParseInfoList(info) {
    const out = [];
    if (!info) return out;
    for (const item of info) {
        const s = kgParseSong(item);
        if (s) out.push(s);
    }
    return out;
}

/** 酷狗搜索（mobilecdn search/song，与榜单同域名避开 songsearch 风控；大写命名兼容）。 */
function kgSearch(kw) {
    const url = 'http://mobilecdn.kugou.com/api/v3/search/song?format=json&keyword=' + enc(kw) +
        '&page=1&pagesize=30&showtype=1';
    let resp;
    try {
        resp = getJson(url, kgHeaders());
    } catch (e) {
        resp = getJson(url.replace('http://', 'https://'), kgHeaders());
    }
    if (resp.status !== 1) {
        log('kgSearch FAIL status=' + resp.status + ' kw=' + kw);
        return [];
    }
    const data = resp.data;
    if (!data) return [];
    const out = kgParseInfoList(data.info);
    for (const s of out) {
        s.name = s.name.replace(/<[^>]*>/g, '').trim();
        s.artist = s.artist.replace(/<[^>]*>/g, '').trim();
    }
    return out;
}

// ============================ 汽水（soda，MusicCore.java） ============================

const SODA_BUILTIN_RANKS = [
    ['7036274230471712007', '热歌榜'],
    ['7060812597884869927', '新歌榜'],
    ['7061475546400005410', '欧美榜'],
    ['7415959718721494311', '音乐人歌曲榜'],
];

/** 汽水歌曲条目解析（track 结构统一）。 */
function sodaParseTrack(track) {
    if (!track) return null;
    const id = (track.id || '').trim();
    const name = (track.name || '').trim();
    if (id === '' || name === '') return null;
    const artists = track.artists;
    const artistParts = [];
    if (artists) {
        for (let j = 0; j < artists.length && j < 5; j++) {
            const a = artists[j];
            if (!a) continue;
            const n = (a.name || '').trim();
            if (n === '') continue;
            artistParts.push(n);
        }
    }
    const album = track.album;
    let albumName = '', cover = '';
    if (album) {
        albumName = (album.name || '').trim();
        const urlCover = album.url_cover;
        if (urlCover) {
            const urls = urlCover.url_list;
            if (urls && urls.length > 0) cover = urls[0] || '';
            if (cover === '') {
                const uri = urlCover.uri || '';
                if (uri !== '') cover = 'https://p3-luna.douyinpic.com/img/' + uri + '~c5_375x375.jpg';
            }
        }
    }
    let duration = track.duration || 0;
    if (duration > 10000) duration = Math.floor(duration / 1000);
    return Song('soda', id, name, artistParts.join('、'), albumName, cover, duration);
}

/** 汽水搜索（luna/search/track，Android 端参数，免签名）。 */
function sodaSearch(kw) {
    const params = [
        ['device_platform', 'android'], ['os', 'android'], ['ssmix', 'a'],
        ['cdid', '46556f98-1720-4248-83da-62b74b60b46a'], ['channel', 'xiaomi_8478_64'],
        ['aid', '386088'], ['app_name', 'luna'], ['version_code', '100198030'],
        ['version_name', '19.8.0'], ['manifest_version_code', '100198030'],
        ['update_version_code', '100198030'], ['resolution', '1080*1920'], ['dpi', '480'],
        ['device_type', 'ABR-AL80'], ['device_brand', 'HUAWEI'], ['language', 'zh'],
        ['os_api', '35'], ['os_version', '15'], ['ac', 'wifi'], ['device_model', 'ABR-AL80'],
        ['save_power', '0'], ['font_size', '1.00'], ['luna_first_launch_apk_type', 'normal_apk'],
        ['is_car_play', '0'], ['battery', '0.99'], ['network_speed', '10156'],
        ['hybrid_version_code', '100198030'], ['tz_name', 'Asia/Shanghai'], ['tz_offset', '28800'],
        ['package', 'com.luna.music'], ['charge', '0'], ['luna_apk_type', 'normal_apk'],
        ['output_device_type', 'Phone'], ['volume', '1.00'], ['brightness', '0.08'],
        ['need_personal_recommend', '1'], ['is_teen_mode', '0'], ['sim_region', 'cn'],
        ['android_device_type', 'default'],
        ['iid', '2204957404569386'], ['device_id', '2204957404565290'],
        ['_rticket', String(Date.now())],
    ];
    let p = '';
    for (const kv of params) {
        if (p.length > 0) p += '&';
        p += kv[0] + '=' + enc(kv[1]);
    }
    p += '&q=' + enc(kw) + '&cursor=0&count=20';
    const resp = getJson('https://api.qishui.com/luna/search/track?' + p,
        headers(['User-Agent', SODA_APP_UA, 'Content-Type', 'application/json; charset=UTF-8']));
    const groups = resp.result_groups;
    const out = [];
    if (!groups) return out;
    for (const group of groups) {
        const data = group ? group.data : null;
        if (!data) continue;
        for (const item of data) {
            const entity = item ? item.entity : null;
            const track = entity ? entity.track : null;
            const s = track ? sodaParseTrack(track) : null;
            if (s && !out.some((e) => e.id === s.id)) out.push(s);
        }
    }
    return out;
}

// ============================ 酷我（kuwo，MusicCore.java） ============================

const KW_BUILTIN_RANKS = [
    ['16', '酷我热歌榜'],
    ['42', '酷我新歌榜'],
    ['158', '酷我飙升榜'],
];

/** 酷我搜索：searchMusicBykeyWord（www 域名）失败回退 search.kuwo.cn r.s legacy（单引号 JSON）。 */
function kwSearch(kw) {
    try {
        // www.kuwo.cn http 会 301 到 https，直接走 https
        const url = 'https://www.kuwo.cn/search/searchMusicBykeyWord?' +
            'vipver=1&client=kt&ft=music&cluster=0&strategy=2012&encoding=utf8&rformat=json' +
            '&mobi=1&issubtitle=1&show_copyright_off=1&pn=0&rn=30&all=' + enc(kw);
        const resp = JSON.parse(getText(url, withRandomIp(headers(['User-Agent', KW_UA]))));
        const out = kwParseAbslist(resp.abslist);
        if (out.length > 0) return out;
    } catch (e) {
        log('kwSearch www FAIL kw=' + kw + ' : ' + e);
    }
    // legacy r.s（search.kuwo.cn，单引号 JSON 需替换）
    try {
        const url = 'http://search.kuwo.cn/r.s?all=' + enc(kw) +
            '&ft=music&itemset=web_2013&client=kt&pcmp4=1&geo=c&vipver=1&pn=0&rn=30&rformat=json&encoding=utf8';
        const body = getText(url, withRandomIp(headers(['User-Agent', KW_UA])));
        const resp = JSON.parse(body.replace(/'/g, '"'));
        const out = kwParseAbslist(resp.abslist);
        if (out.length > 0) return out;
    } catch (e) {
        log('kwSearch r.s FAIL kw=' + kw + ' : ' + e);
    }
    return [];
}

/** 酷我 abslist 条目解析（大写字段 + bitSwitch=0 不可播过滤）。 */
function kwParseAbslist(abslist) {
    const out = [];
    if (!abslist) return out;
    for (const item of abslist) {
        if (!item) continue;
        if ('bitSwitch' in item && (item.bitSwitch || 0) === 0) continue;
        const rid = (item.MUSICRID || '').replace(/^MUSIC_/, '').trim();
        const name = firstNonEmpty(item.SONGNAME || '', item.songname || '').trim();
        if (rid === '' || name === '') continue;
        let duration = 0;
        try {
            duration = parseInt(String(item.DURATION != null ? item.DURATION : (item.duration != null ? item.duration : '0')).trim(), 10) || 0;
        } catch (e) { /* ignore */ }
        const cover = firstNonEmpty(item.hts_MVPIC || '', item.albumpic || '', item.web_albumpic_short || '');
        out.push(Song('kuwo', rid, name,
            firstNonEmpty(item.ARTIST || '', item.artist || '').trim(),
            firstNonEmpty(item.ALBUM || '', item.album || '').trim(),
            kwImgUrl(cover), duration));
    }
    return out;
}

function kwImgUrl(raw) {
    if (raw == null || raw === '') return '';
    if (raw.startsWith('//')) raw = 'http:' + raw;
    else if (!raw.startsWith('http')) raw = 'http://img1.kuwo.cn/star/albumcover/' + raw.replace(/^\//, '');
    const reps = [['/120/', '/500/'], ['/150/', '/500/'], ['/240/', '/500/']];
    for (const rep of reps) {
        if (raw.indexOf(rep[0]) >= 0) {
            raw = raw.replace(rep[0], rep[1]);
            break;
        }
    }
    return raw;
}

/** 酷我榜单歌曲（kbangserver ksong.s，旧接口免登录）。 */
function kwToplistSongs(bangId) {
    const url = 'http://kbangserver.kuwo.cn/ksong.s?from=pc&fmt=json&pn=0&rn=100&type=bang' +
        '&data=content&id=' + enc(bangId) + '&show_copyright_off=1&pcmp4=1';
    const resp = getJson(url, withRandomIp(headers(['User-Agent', KW_UA])));
    const musiclist = resp.musiclist;
    const out = [];
    if (!musiclist) return out;
    for (const item of musiclist) {
        if (!item) continue;
        const rid = String(item.id != null ? item.id : 0);
        const name = (item.name || '').trim();
        if (rid === '' || rid === '0' || name === '') continue;
        const duration = item.song_duration != null ? item.song_duration : (item.duration != null ? item.duration : 0);
        // ksong.s 无封面字段，用 albumid 拼官方专辑封面
        const albumid = (item.albumid || '').trim();
        const cover = albumid === '' ? '' : 'http://img4.kuwo.cn/star/albumcover/500/' + albumid + '.jpg';
        out.push(Song('kuwo', rid, name, (item.artist || '').trim(),
            (item.album || '').trim(), cover, duration));
    }
    return out;
}

// ============================ 咪咕（migu，MusicCore.java） ============================

function mgHeaders() {
    return headers(['User-Agent', MG_UA, 'Referer', MG_REFERER]);
}

/** 咪咕搜索（bmw search/song v1.0，items[].song 含 lrcUrl/copyrightId；miguMusic-api-enhanced 蓝本，失败回退 search_all.do）。 */
function mgSearch(kw) {
    try {
        const resp = getJson('https://app.c.nf.migu.cn/bmw/search/song/v1.0?pageNo=1&text=' + enc(kw), mgHeaders());
        if (resp.code === '000000') {
            const data = resp.data;
            const items = data ? data.items : null;
            const out = [];
            if (items) {
                for (const it of items) {
                    const s = it ? mgConvertItem(it.song) : null;
                    if (s) out.push(s);
                }
            }
            if (out.length > 0) return out;
        }
        log('mgSearch bmw status=' + resp.code + ' kw=' + kw);
    } catch (e) {
        log('mgSearch bmw FAIL kw=' + kw + ' : ' + e);
    }
    const url = 'http://pd.musicapp.migu.cn/MIGUM2.0/v1.0/content/search_all.do?' +
        'ua=Android_migu&version=5.0.1&text=' + enc(kw) + '&pageNo=1&pageSize=20' +
        '&searchSwitch=' + enc('{"song":1,"album":0,"singer":0,"tagSong":0,"mvSong":0,"songlist":0,"bestShow":1}');
    const resp = getJson(url, mgHeaders());
    const songData = resp.songResultData;
    const result = songData ? songData.result : null;
    const out = [];
    if (!result) return out;
    for (const item of result) {
        const s = mgConvertItem(item);
        if (s) out.push(s);
    }
    return out;
}

/** 咪咕歌曲条目转换（contentId 为主键，PQ/HQ 格式优先）。 */
function mgConvertItem(item) {
    if (!item) return null;
    const contentId = firstNonEmpty(item.contentId || '', item.copyrightId || '', item.id || '');
    const name = firstNonEmpty(item.name || '', item.songName || '');
    if (contentId === '' || name === '') return null;
    const artistParts = [];
    for (const key of ['singers', 'artists', 'singerList']) {
        const arr = item[key];
        if (!arr) continue;
        for (let j = 0; j < arr.length && j < 5; j++) {
            const a = arr[j];
            if (!a) continue;
            const n = (a.name || '').trim();
            if (n === '' || artistParts.indexOf(n) >= 0) continue;
            artistParts.push(n);
        }
        if (artistParts.length > 0) break;
    }
    let artist = artistParts.join('、');
    if (artist === '') artist = (item.singer || '').replace(/\|/g, '、');
    let albumName = (item.album || '').trim();
    const albums = item.albums;
    if (albums && albums.length > 0) {
        const al = albums[0];
        if (al && (al.name || '') !== '') albumName = al.name;
    }
    let cover = mgPickImg(item.imgItems);
    if (cover === '') cover = firstNonEmpty(item.img1 || '', item.img2 || '');
    cover = mgImgUrl(cover);
    let duration = item.duration || 0;
    if (duration > 10000) duration = Math.floor(duration / 1000);
    return Song('migu', contentId, name, artist, albumName, cover, duration);
}

function mgPickImg(imgItems) {
    if (!imgItems) return '';
    for (const prefer of ['02', '01', '03']) {
        for (const im of imgItems) {
            if (im && im.imgSizeType === prefer && (im.img || '') !== '') return im.img;
        }
    }
    for (const im of imgItems) {
        if (im && (im.img || '') !== '') return im.img;
    }
    return '';
}

function mgImgUrl(image) {
    if (image == null || image === '') return '';
    if (image.startsWith('//')) return 'https:' + image;
    if (image.startsWith('/')) return 'https://d.musicapp.migu.cn' + image;
    return image;
}

// ============================ 搜索 / 榜单统一入口（MusicCore.java） ============================

function hotRankId(platform) {
    switch (platform) {
        case 'netease': return '3778678';
        case 'qq': return '26';
        case 'soda': return '7036274230471712007';
        case 'kuwo': return '16';
        case 'migu': return '83048887';
        default: return '8888';
    }
}

/** 各平台榜单目录：[id, name, cover]。 */
function rankList(platform) {
    if (platform === 'netease') {
        return [
            ['3778678', '云音乐热歌榜', ''],
            ['3779629', '云音乐新歌榜', ''],
            ['19723756', '云音乐飙升榜', ''],
        ];
    }
    if (platform === 'qq') {
        return [
            ['26', 'QQ热歌榜', ''],
            ['27', 'QQ新歌榜', ''],
            ['4', '流行指数榜', ''],
        ];
    }
    if (platform === 'soda') {
        return SODA_BUILTIN_RANKS.map((r) => [r[0], r[1], '']);
    }
    if (platform === 'kuwo') {
        return KW_BUILTIN_RANKS.map((r) => [r[0], r[1], '']);
    }
    if (platform === 'kugou') {
        // kgRankList（mobilecdn rank/list 动态榜单）未移植
        return [['8888', '酷狗TOP榜', '']];
    }
    if (platform === 'migu') {
        // mgRankList（bmw 榜单动态目录）未移植
        return [];
    }
    return [];
}

/** 平台榜单歌曲统一入口（detailContent 与 hot tab 共用）。 */
function rankSongs(platform, rankId) {
    if (rankId == null || rankId === '') return [];
    switch (platform) {
        case 'netease':
            return nePlaylistSongs(rankId);
        case 'qq':
            return qqToplistSongs(rankId);
        case 'kugou':
            // kgToplistSongs 未移植
            return [];
        case 'soda':
            return sodaChartSongs(rankId);
        case 'kuwo':
            return kwToplistSongs(rankId);
        case 'migu':
            // mgToplistSongs 未移植
            return [];
        default:
            return [];
    }
}

/** 平台歌单歌曲统一入口（仅 netease 移植，其余歌单端点未移植）。 */
function playlistSongs(platform, playlistId) {
    switch (platform) {
        case 'netease':
            return nePlaylistSongs(playlistId);
        default:
            log('playlistSongs 未移植 platform=' + platform);
            return [];
    }
}

/** 单平台搜索入口。 */
function searchOne(platform, kw) {
    switch (platform) {
        case 'netease': return neSearch(kw);
        case 'qq': return qqSearch(kw);
        case 'kugou': return kgSearch(kw);
        case 'soda': return sodaSearch(kw);
        case 'kuwo': return kwSearch(kw);
        case 'migu': return mgSearch(kw);
        default: return parallelSearch(kw);
    }
}

/** 多平台并行搜索（每家前 10 条，按平台交错排列）。
 *  QuickJS 无线程：Java 线程池并发 → 顺序执行（结果结构不变）。 */
function parallelSearch(kw) {
    const buckets = [];
    for (const p of PLATFORMS) {
        try {
            buckets.push(searchOne(p, kw));
        } catch (e) {
            log('search ' + p + ' FAIL: ' + e);
        }
    }
    const out = [];
    let max = 0;
    for (const b of buckets) max = Math.max(max, b.length);
    for (let i = 0; i < max; i++) {
        for (const b of buckets) {
            if (i < b.length) out.push(b[i]);
        }
    }
    return out;
}

/** 聚合热歌榜：六平台热歌抓取（每家前 40），按 歌名+歌手 去重，轮询交错合并。 */
function hotMerge() {
    const perPlatform = 40;
    const buckets = [];
    for (const p of PLATFORMS) {
        try {
            const songs = rankSongs(p, hotRankId(p));
            buckets.push(songs.length > perPlatform ? songs.slice(0, perPlatform) : songs);
        } catch (e) {
            log('hotMerge ' + p + ' FAIL: ' + e);
        }
    }
    const out = [];
    const seen = new Set();
    let added = true;
    for (let i = 0; added && out.length < 150; i++) {
        added = false;
        for (const bucket of buckets) {
            if (i >= bucket.length) continue;
            const s = bucket[i];
            const key = dedupeKey(s);
            if (key === '' || seen.has(key)) continue;
            seen.add(key);
            out.push(s);
            added = true;
        }
    }
    log('hotMerge done total=' + out.length);
    return out;
}

/** 热歌合并去重键：歌名+歌手（忽略大小写与首尾空白）。 */
function dedupeKey(s) {
    if (!s || s.name == null) return '';
    return s.name.trim().toLowerCase() + '|' + (s.artist == null ? '' : s.artist.trim().toLowerCase());
}

// ============================ LuoxueApi（聚合取流兜底，1:1） ============================
//
// 落雪聚合取流客户端（洛雪音源9「聚合API接口」协议直译，Java 化免 JS 引擎）：
//  - POST {base}/{source}，body={"musicInfo":{...},"type":"128k"}
//  - code=200 → data.url 直链
//  - code=303 → 服务器下发二次请求模板（data.request.url+options.headers），
//               客户端执行后按 data.response.check 校验、data.response.url 路径提取直链
// 平台映射（MusicCore 平台码 → 洛雪 source）：netease→wy / kugou→kg / qq→tx / kuwo→kw / migu→mg

const LUOXUE_BASE = 'https://api.music.lerd.dpdns.org';
const LUOXUE_UA = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36';

/** MusicCore 平台码 → 洛雪 source；不支持返回 null。 */
function luoxueMapSource(platform) {
    if (platform == null) return null;
    switch (platform) {
        case 'netease': return 'wy';
        case 'kugou': return 'kg';
        case 'qq': return 'tx';
        case 'kuwo': return 'kw';
        case 'migu': return 'mg';
        default: return null;
    }
}

/** 各平台 musicInfo 字段（洛雪源数据结构映射）。 */
function luoxueMusicInfo(source, songId) {
    const mi = { source: source };
    switch (source) {
        case 'wy':
        case 'tx':
            mi.songmid = songId;
            break;
        case 'kg':
            mi.hash = songId;
            break;
        case 'kw':
            mi.hash = songId;
            mi.songmid = songId;
            break;
        case 'mg':
            mi.copyrightId = songId;
            mi.songId = songId;
            break;
        default:
            return null;
    }
    return mi;
}

/** 取播放直链；失败返回 ""（调用方回退官方链路）。 */
function luoxueStream(platform, songId) {
    const source = luoxueMapSource(platform);
    if (source == null || songId == null || songId === '') return '';
    try {
        const body = JSON.stringify({
            musicInfo: luoxueMusicInfo(source, songId),
            type: '128k',
        });
        const j = JSON.parse(luoxueHttpRaw(LUOXUE_BASE + '/' + source, 'POST', body, {
            'Content-Type': 'application/json',
            'User-Agent': LUOXUE_UA,
            'Accept': 'application/json',
            'Referer': LUOXUE_BASE + '/',
        }));
        const code = j.code;
        if (code === 200) {
            const url = j.data ? (j.data.url || '') : '';
            return url.startsWith('http') ? url : '';
        }
        if (code === 303) {
            return luoxueFollow303(j.data);
        }
        log('luoxue stream code=' + code + ' msg=' + (j.msg || '') + ' p=' + platform);
    } catch (e) {
        log('luoxue stream FAIL p=' + platform + ' : ' + e);
    }
    return '';
}

/** 303：执行服务器下发的二次请求模板，按 check 校验、按 url 路径提取直链（各平台模板字段不齐，全路径判空）。 */
function luoxueFollow303(data) {
    const rq = data ? data.request : null;
    if (!rq || (rq.url || '') === '') return '';
    const respSpec = data ? data.response : null;
    const opts = rq.options || null;
    const reqHeaders = {};
    if (opts && opts.headers) {
        for (const k of Object.keys(opts.headers)) reqHeaders[k] = String(opts.headers[k]);
    }
    const method = opts ? (opts.method || 'GET') : 'GET';
    let raw;
    try {
        raw = luoxueHttpRaw(rq.url, String(method).toUpperCase() === 'POST' ? 'POST' : 'GET',
            method.toUpperCase() === 'POST' ? (opts ? (opts.body || '') : '') : '', reqHeaders);
    } catch (e) {
        log('luoxue 303 follow FAIL: ' + e);
        return '';
    }
    if (!raw.startsWith('{') && !raw.startsWith('[')) {
        // 二次响应可能直接就是文本/重定向链接
        return raw.startsWith('http') ? raw.trim() : '';
    }
    let rj;
    try {
        rj = JSON.parse(raw);
    } catch (e) {
        return '';
    }
    // check：key 路径逐层取值与 value 比对（部分平台无 check）
    const check = respSpec ? respSpec.check : null;
    if (check && check.key) {
        const got = luoxueDig(rj, check.key);
        const want = luoxueDig(rj, Array.isArray(check.value) ? check.value : [check.value]);
        if (got == null || want == null || String(want) !== String(got)) {
            log('luoxue 303 check mismatch got=' + got + ' expect=' + want);
            return '';
        }
    }
    const urlPath = respSpec ? respSpec.url : null;
    if (!urlPath) return '';
    const u = luoxueDig(rj, urlPath);
    const url = String(u);
    return url.startsWith('http') ? url.trim() : '';
}

/** 按路径数组逐层取值（字符串键取对象属性，数字键取数组下标）。 */
function luoxueDig(cur, path) {
    if (!path) return cur;
    for (const k of path) {
        if (cur && typeof cur === 'object' && !Array.isArray(cur)) {
            cur = cur[String(k)];
        } else if (Array.isArray(cur)) {
            cur = cur[parseInt(String(k), 10)];
        } else {
            return null;
        }
        if (cur == null) return null;
    }
    return cur;
}

function luoxueHttpRaw(url, method, body, reqHeaders) {
    const res = req(url, {
        method: String(method || 'get').toLowerCase(),
        headers: reqHeaders || {},
        body: body && body !== '' && String(method).toUpperCase() === 'POST' ? body : undefined,
        timeout: 15000,
    });
    return res.content || '';
}

// ============================ lx 宿主（LxHost.java / LxHttp.java / LxCrypto.java） ============================

const LX_DEFAULT_UA = 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36';
const LX_ENV = 'lx-music-mobile';

// lx 脚本实例状态（LxScript.java 字段对应）
let lxReady = false;
let lxHandler = null;                    // on(EVENT_NAMES.request) 注册的处理器
let lxSources = {};                      // source → {name, qualitys:[...]}
let lxInfoName = '';
let lxLabel = 'lxsource';
let lxInitPromise = null;
let lxExt = '';

// 宿主原生 timer 桥（先捕获再覆盖 globalThis）
const hostSetTimeoutFn = globalThis.setTimeout;
const hostClearTimeoutFn = typeof globalThis.clearTimeout === 'function' ? globalThis.clearTimeout : null;

// ---------------- lx.request 的 HTTP 实现（LxHttp.java 1:1） ----------------

/** 返回响应 JSON：{statusCode, statusMessage, headers, body}。 */
function lxHttp(url, optionsJson) {
    let o = {};
    if (optionsJson != null && optionsJson !== '') {
        try { o = JSON.parse(optionsJson); } catch (e) { o = {}; }
    }
    let method = String(o.method || 'GET').trim();
    if (method === '') method = 'GET';
    method = method.toUpperCase();
    const outHeaders = Object.assign({}, o.headers || {});
    let timeout = typeof o.timeout === 'number' ? o.timeout : 13000;
    if (timeout < 1000) timeout = 1000;
    if (timeout > 60000) timeout = 60000;

    let body = null;
    if ('body' in o && o.body != null) body = o.body;
    const form = o.form || null;
    const formData = o.formData || null;

    if (!('User-Agent' in outHeaders)) outHeaders['User-Agent'] = LX_DEFAULT_UA;
    if (!('Accept' in outHeaders)) outHeaders['Accept'] = 'application/json';

    if (method === 'POST' || method === 'PUT' || method === 'PATCH') {
        if (form || formData) {
            if (!outHeaders['Content-Type']) outHeaders['Content-Type'] = 'application/x-www-form-urlencoded';
            body = urlEncodeForm(form || formData);
        } else if (!outHeaders['Content-Type']) {
            outHeaders['Content-Type'] = 'application/json';
            if (typeof body !== 'string') body = body == null ? '' : JSON.stringify(body);
        }
    }

    const reqOpts = {
        method: method.toLowerCase(),
        headers: outHeaders,
        timeout: timeout,
    };
    if (body != null && body !== '' && method !== 'GET') {
        // 壳 req 的 body 通道按 post 语义走（host.mjs/Global.java 一致）；GET 带体不成立，忽略
        reqOpts.body = typeof body === 'string' ? body : JSON.stringify(body);
    }

    const res = req(url, reqOpts);
    const text = res.content || '';
    // 壳 req 无状态码：node 桩带 code；壳内启发式（content 非空→200，空→0）
    let statusCode = (res && typeof res.code === 'number' && res.code > 0) ? res.code
        : (text !== '' ? 200 : 0);
    const respHeaders = {};
    for (const k of Object.keys(res.headers || {})) respHeaders[String(k).toLowerCase()] = String(res.headers[k]);

    return {
        statusCode: statusCode,
        statusMessage: '',
        headers: respHeaders,
        body: lxParseBody(text),
    };
}

/** 对齐 lx-music 行为：能解析成 JSON 则返回对象，否则保留字符串。 */
function lxParseBody(text) {
    if (text == null) return '';
    const t = text.trim();
    if (t === '') return text;
    if (t.startsWith('{') || t.startsWith('[')) {
        try { return JSON.parse(t); } catch (e) { /* 保持字符串 */ }
    }
    return text;
}

function urlEncodeForm(form) {
    const parts = [];
    for (const k of Object.keys(form || {})) {
        parts.push(javaNetUrlEncode(k) + '=' + javaNetUrlEncode(String(form[k])));
    }
    return parts.join('&');
}

/** java.net.URLEncoder.encode(s, "UTF-8")（空格→'+'，与 MusicCore.enc 的 %20 变体区分）。 */
function javaNetUrlEncode(s) {
    const out = [];
    const bytes = utf8ToBytes(String(s));
    for (let i = 0; i < bytes.length; i++) {
        const b = bytes[i];
        const c = String.fromCharCode(b);
        if ((b >= 0x41 && b <= 0x5a) || (b >= 0x61 && b <= 0x7a) || (b >= 0x30 && b <= 0x39)
            || b === 0x2e || b === 0x2d || b === 0x2a || b === 0x5f) out.push(c);
        else if (b === 0x20) out.push('+');
        else out.push('%' + b.toString(16).toUpperCase().padStart(2, '0'));
    }
    return out.join('');
}

// ---------------- lx crypto（LxCrypto.java 1:1） ----------------

/** 对齐 lx-music-mobile preload：md5(encodeURIComponent(str))。 */
function lxCryptoMd5(raw) {
    const s = raw == null ? '' : encodeURIComponent(String(raw));
    const w = CryptoJS.MD5(CryptoJS.lib.WordArray.create(bytesToWords(utf8ToBytes(s)), utf8ToBytes(s).length));
    return w.toString();
}

/** args: (data, mode, key, iv) → Uint8Array。mode 如 aes-128-cbc / aes-256-ecb。 */
function lxCryptoAes(args, encrypt) {
    const data = args.length > 0 ? args[0] : null;
    const mode = (args.length > 1 && args[1] != null) ? String(args[1]) : 'aes-128-cbc';
    const key = (args.length > 2 && args[2] != null) ? String(args[2]) : '';
    const iv = (args.length > 3 && args[3] != null) ? String(args[3]) : '';

    const parts = mode.toLowerCase().split('-');
    let bits = 128;
    let cbc = true;
    let pad = true;
    for (const p of parts) {
        if (p === '128' || p === '192' || p === '256') bits = parseInt(p, 10);
        else if (p === 'cbc') cbc = true;
        else if (p === 'ecb') cbc = false;
        else if (p.startsWith('pkcs')) pad = true;
        else if (p.indexOf('nopadding') >= 0) pad = false;
    }
    const keyLen = bits / 8;
    const kb = fitBytes(utf8ToBytes(key), keyLen);
    let input;
    if (data instanceof Uint8Array) input = data;
    else if (data instanceof ArrayBuffer) input = new Uint8Array(data);
    else input = data == null ? new Uint8Array(0) : utf8ToBytes(String(data));

    const keyWa = CryptoJS.lib.WordArray.create(bytesToWords(kb), kb.length);
    const cfg = {};
    if (!pad) cfg.padding = CryptoJS.pad.NoPadding;
    if (cbc) {
        const ib = fitBytes(utf8ToBytes(iv), 16);
        cfg.iv = CryptoJS.lib.WordArray.create(bytesToWords(ib), 16);
        cfg.mode = CryptoJS.mode.CBC;
    } else {
        cfg.mode = CryptoJS.mode.ECB;
    }
    if (encrypt) {
        const out = CryptoJS.AES.encrypt(CryptoJS.lib.WordArray.create(bytesToWords(input), input.length), keyWa, cfg).ciphertext;
        return wordsToBytes(out.words, out.sigBytes);
    }
    const ct = input;
    const dec = CryptoJS.AES.decrypt({ ciphertext: CryptoJS.lib.WordArray.create(bytesToWords(ct), ct.length) }, keyWa, cfg);
    return wordsToBytes(dec.words, dec.sigBytes);
}

function fitBytes(src, len) {
    const out = new Uint8Array(len);
    out.set(src.subarray(0, Math.min(src.length, len)), 0);
    return out;
}

/** args: (data, key) → Uint8Array。官方为 NoPadding 公钥加密（RSA/ECB/NoPadding）。 */
function lxCryptoRsa(args) {
    const data = args.length > 0 ? args[0] : null;
    let key = (args.length > 1 && args[1] != null) ? String(args[1]) : '';
    key = key.replace('-----BEGIN PUBLIC KEY-----', '').replace('-----END PUBLIC KEY-----', '')
        .replace('-----BEGIN RSA PUBLIC KEY-----', '').replace('-----END RSA PUBLIC KEY-----', '')
        .replace(/[\s\r\n]/g, '');
    const dk = b64ToBytes(key);
    const modExp = rsaPublicDerParse(dk); // [n BigInt, e BigInt]
    let input;
    if (data instanceof Uint8Array) input = data;
    else if (data instanceof ArrayBuffer) input = new Uint8Array(data);
    else input = data == null ? new Uint8Array(0) : utf8ToBytes(String(data));
    const n = modExp[0], e = modExp[1];
    // NoPadding：消息左侧补零至模长，m < n
    let m = 0n;
    for (const b of input) m = (m << 8n) | BigInt(b);
    if (m >= n) throw new Error('rsa message longer than modulus');
    const c = modPow(m, e, n);
    const size = (n.toString(16).length + 1) >> 1;
    let hex = c.toString(16).padStart(size * 2, '0');
    return hexToBytes(hex);
}

function modPow(base, exp, mod) {
    let result = 1n;
    let b = base % mod;
    if (b < 0n) b += mod;
    let e = exp;
    while (e > 0n) {
        if (e & 1n) result = (result * b) % mod;
        b = (b * b) % mod;
        e >>= 1n;
    }
    return result;
}

/** X509 SPKI / PKCS#1 RSAPublicKey DER 解析 → [n, e]（递归收集 INTEGER，n=最大值，e=其后小整数）。 */
function rsaPublicDerParse(der) {
    const ints = [];
    function walk(start, end) {
        let at = start;
        while (at < end) {
            const tag = der[at++];
            let len = der[at++];
            if (len & 0x80) {
                const nb = len & 0x7f;
                len = 0;
                for (let i = 0; i < nb; i++) len = (len << 8) | der[at++];
            }
            const bodyStart = at;
            const bodyEnd = at + len;
            if (tag === 0x02) {
                let v = 0n;
                for (let i = 0; i < len; i++) v = (v << 8n) | BigInt(der[bodyStart + i]);
                ints.push(v);
            } else if (tag === 0x30 || tag === 0x31 || tag === 0xA0 || tag === 0xA1) {
                walk(bodyStart, bodyEnd);
            } else if (tag === 0x03) {
                walk(bodyStart + 1, bodyEnd); // BITSTRING：首字节为未用位数
            }
            at = bodyEnd;
        }
    }
    walk(0, der.length);
    let nIdx = -1, maxBits = 0;
    for (let i = 0; i < ints.length; i++) {
        const bits = ints[i].toString(2).length;
        if (bits >= 512 && bits > maxBits) { maxBits = bits; nIdx = i; }
    }
    if (nIdx < 0 || nIdx + 1 >= ints.length) throw new Error('rsa public der parse fail');
    return [ints[nIdx], ints[nIdx + 1]];
}

// ---------------- lx zlib（globalThis.pako，utils.zlib 内直接调用） ----------------

// ---------------- lx 宿主安装（LxHost.install 1:1） ----------------

function lxLog(msg) {
    log(msg);
}

const lxTimers = new Map();
let lxTimerSeq = 0;

/** LxHost.setTimeout：id 自管（double 返回），repeat 由包装函数重排（壳 Global.setTimeout 一次性）。 */
function lxSetTimeout(fn, delay, repeat) {
    let d = (args1IsNumber(delay) ? delay : 0);
    if (d < 0) d = 0;
    const id = ++lxTimerSeq;
    const rec = { cancelled: false, handle: null };
    lxTimers.set(id, rec);
    if (typeof fn === 'function') {
        const run = () => {
            if (rec.cancelled) { lxTimers.delete(id); return; }
            if (!repeat) lxTimers.delete(id);
            try {
                fn();
            } catch (e) {
                lxLog('timer FAIL: ' + e);
            }
            if (repeat && !rec.cancelled) rec.handle = hostSetTimeoutFn(run, Math.max(d, 1));
        };
        rec.handle = hostSetTimeoutFn(run, d);
    }
    return id;
}

function args1IsNumber(v) {
    return typeof v === 'number' && !isNaN(v);
}

function lxClear(id) {
    if (typeof id !== 'number') return;
    const rec = lxTimers.get(id);
    if (!rec) return;
    rec.cancelled = true;
    lxTimers.delete(id);
    if (hostClearTimeoutFn && rec.handle != null) {
        try { hostClearTimeoutFn(rec.handle); } catch (e) { /* 壳无句柄语义，忽略 */ }
    }
}

function lxAbbreviate(s) {
    if (s == null) return '';
    return s.length > 200 ? s.substring(0, 200) + '...' : s;
}

/** 构造 globalThis.lx 宿主对象（LxHost.install 1:1 注入面）。 */
function lxInstallHost() {
    const lx = {};

    const names = {
        request: 'request',
        inited: 'inited',
        updateAlert: 'updateAlert',
    };
    lx.EVENT_NAMES = names;

    lx.version = '2.1.7';
    lx.env = LX_ENV;

    lx.on = function (name, handler) {
        const n = name == null ? '' : String(name);
        if (n === 'request') {
            if (typeof handler === 'function') lxHandler = handler;
            else lxLog('on(request) 非函数参数');
        } else if (n !== 'updateAlert') {
            lxLog('on(' + n + ') 不支持');
        }
        return null;
    };

    lx.send = function (name, data) {
        const n = name == null ? '' : String(name);
        try {
            const json = data == null ? '' : JSON.stringify(data);
            if (n === 'inited') lxHandleInited(json);
            else lxLog('send(' + n + ') ' + lxAbbreviate(json));
        } catch (e) {
            lxLog('send(' + n + ') 解析失败: ' + e);
        }
        return null;
    };

    // lx.request：同步桥 —— 宿主 req 同步完成后回调在 request 调用返回前执行
    lx.request = function () {
        const args = arguments;
        const cb = args.length > 2 ? args[2]
            : (args.length > 1 && typeof args[1] === 'function' ? args[1] : null);
        const url = args.length > 0 && args[0] != null ? String(args[0]) : '';
        if (cb == null) {
            lxLog('request 缺少回调 url=' + url);
            return null;
        }
        const options = (args.length > 1 && typeof args[1] !== 'function') ? args[1] : null;
        let optJson = '{}';
        if (options != null) {
            try { optJson = JSON.stringify(options); } catch (e) { optJson = '{}'; }
        }
        try {
            const resp = lxHttp(url, optJson);
            cb(null, resp, resp.body);
        } catch (e) {
            const msg = e && e.message ? String(e.message) : String(e);
            lxLog('request FAIL ' + lxAbbreviate(url) + ' : ' + msg);
            try {
                cb({ message: msg }, null, null);
            } catch (e2) {
                lxLog('request err-callback 失败: ' + e2);
            }
        }
        return null;
    };

    lx.utils = {
        buffer: {
            from(data, encoding) {
                const enc2 = (encoding == null ? 'utf-8' : String(encoding)).toLowerCase();
                if (data instanceof Uint8Array) return data;
                if (data instanceof ArrayBuffer) return new Uint8Array(data);
                if (Array.isArray(data)) {
                    const out = new Uint8Array(data.length);
                    for (let i = 0; i < data.length; i++) out[i] = typeof data[i] === 'number' ? (data[i] & 255) : 0;
                    return out;
                }
                const s = data == null ? '' : String(data);
                switch (enc2) {
                    case 'base64': return b64ToBytes(s);
                    case 'hex': return hexToBytes(s);
                    case 'binary':
                    case 'latin1': {
                        const out = new Uint8Array(s.length);
                        for (let i = 0; i < s.length; i++) out[i] = s.charCodeAt(i) & 255;
                        return out;
                    }
                    default: return utf8ToBytes(s);
                }
            },
            bufToString(b, encoding) {
                const enc2 = (encoding == null ? 'utf-8' : String(encoding)).toLowerCase();
                let bytes;
                if (b instanceof Uint8Array) bytes = b;
                else if (b instanceof ArrayBuffer) bytes = new Uint8Array(b);
                else if (b == null) return '';
                else return String(b);
                switch (enc2) {
                    case 'base64': return bytesToB64(bytes);
                    case 'hex': return bytesToHex(bytes);
                    case 'binary':
                    case 'latin1': {
                        let s = '';
                        for (let i = 0; i < bytes.length; i++) s += String.fromCharCode(bytes[i] & 255);
                        return s;
                    }
                    default: return bytesToUtf8(bytes);
                }
            },
        },
        crypto: {
            md5(raw) { return lxCryptoMd5(raw); },
            aesEncrypt() { return lxCryptoAes(Array.prototype.slice.call(arguments), true); },
            aesDecrypt() { return lxCryptoAes(Array.prototype.slice.call(arguments), false); },
            rsaEncrypt() { return lxCryptoRsa(Array.prototype.slice.call(arguments)); },
            randomBytes(n) {
                let c = typeof n === 'number' ? n : 16;
                if (c <= 0) c = 16;
                return randomBytes(c);
            },
        },
        zlib: {
            inflate(data) {
                const bytes = data instanceof Uint8Array ? data : new Uint8Array(data || []);
                return pako.inflate(bytes);
            },
            deflate(data) {
                const bytes = data instanceof Uint8Array ? data : new Uint8Array(data || []);
                return pako.deflate(bytes);
            },
        },
    };

    globalThis.lx = lx;

    // currentScriptInfo（buildScriptInfoJson；LxHost.install 在脚本求值前 setGlobal）
    try {
        globalThis.currentScriptInfo = {
            name: lxInfoName,
            description: matchHeader(lxScriptCodeRef.code, 'description'),
            version: matchHeader(lxScriptCodeRef.code, 'version'),
            author: matchHeader(lxScriptCodeRef.code, 'author'),
            homepage: matchHeader(lxScriptCodeRef.code, 'homepage'),
            env: 'lx-music-mobile',
            rawScript: lxScriptCodeRef.code || '',
        };
    } catch (e) { /* ignore */ }

    globalThis.env = LX_ENV;

    // console（LxHost.console：log/info/warn/error/debug → onLog）
    const consoleLog = function () {
        const sb = [];
        for (let i = 0; i < arguments.length; i++) {
            const a = arguments[i];
            if (a == null) sb.push('null');
            else if (typeof a === 'string') sb.push(a);
            else {
                try { sb.push(JSON.stringify(a)); } catch (e) { sb.push(String(a)); }
            }
        }
        lxLog('console: ' + sb.join(' '));
        return null;
    };
    globalThis.console = {
        log: consoleLog, info: consoleLog, warn: consoleLog, error: consoleLog, debug: consoleLog,
    };

    globalThis.setTimeout = function (fn, delay) { return lxSetTimeout(fn, delay, false); };
    globalThis.setInterval = function (fn, delay) { return lxSetTimeout(fn, delay, true); };
    globalThis.clearTimeout = function (id) { lxClear(id); return null; };
    globalThis.clearInterval = function (id) { lxClear(id); return null; };

    globalThis.btoa = function (data) {
        const bytes = data instanceof Uint8Array ? data
            : (data instanceof ArrayBuffer ? new Uint8Array(data) : utf8ToBytes(data == null ? '' : String(data)));
        return bytesToB64(bytes);
    };
    globalThis.atob = function (s) {
        return bytesToUtf8(b64ToBytes(s == null ? '' : String(s)));
    };
}

// 脚本源码引用（壳内动态 import 无源码文本 → 空串，头部元信息回退 label）
const lxScriptCodeRef = { code: '' };

function matchHeader(code, key) {
    const m = new RegExp('@\\s*' + key + '\\s+([^\\r\\n]*)').exec(code || '');
    return m ? m[1].trim() : '';
}

/** handleInited（LxScript.handleInited 1:1）：sources 过滤 type=music，qualitys/types 兼容。 */
function lxHandleInited(dataJson) {
    try {
        if (dataJson == null || dataJson === '') return;
        const data = JSON.parse(dataJson);
        const all = data.sources;
        if (!all) return;
        const accepted = {};
        for (const s of Object.keys(all)) {
            const meta = all[s];
            if (!meta || typeof meta !== 'object') continue;
            const type = meta.type || 'music';
            if (type !== 'music') continue;
            let q = meta.qualitys;
            if (!q) q = meta.types;
            const list = [];
            if (q) for (const item of q) list.push(String(item));
            accepted[s] = { name: meta.name || '', qualitys: list };
        }
        lxSources = accepted;
    } catch (e) {
        lxLog('inited 解析失败: ' + e);
    }
}

// ---------------- 脚本加载（LxScript.loadScript 语义 + 壳内动态 import） ----------------

function spiderModuleDir() {
    try {
        // ESM import.meta.url → 去掉 file:// 前缀
        const u = import.meta.url || '';
        return u.replace(/^file:\/\//, '').replace(/\/[^/]*$/, '');
    } catch (e) {
        return '';
    }
}

/** 解析 ext → {code}（源码文本，走 (0,eval) script 求值）或 {imports:[...]}（壳内动态 import）。
 *  顺序约束：宿主 globalThis.lx 必须在脚本求值前安装（lxEnsure 保证）。 */
async function resolveScript(ext) {
    if (ext == null || String(ext).trim() === '') throw new Error('ext 为空');
    let e = String(ext).trim();
    if (e.startsWith('http://') || e.startsWith('https://')) {
        // 网络脚本：req 下载（Java 版另有原始 UTF-8 路径 RawPathFetcher 回退，宿主 req 直通即可）
        const res = req(e, {
            method: 'get',
            headers: { 'User-Agent': 'Mozilla/5.0' },
            timeout: 15000,
        });
        const code = res.content || '';
        if (code === '') throw new Error('下载脚本失败: ' + e);
        return { code: code };
    }
    if (e.startsWith('file://')) e = e.substring(7);

    // node 桌面自测：fs 读源码 → (0,eval) 全局脚本求值（与 LxScript.eval script 语义一致）
    const nodeCode = await nodeReadExt(e);
    if (nodeCode != null) return { code: nodeCode };

    // 壳内：动态 import（模块加载器按 ext 相对路径解析）；源码文本不可得
    return { imports: extImportCandidates(e) };
}

/** node 环境 fs 候选路径读取（as-is / cwd / spider 目录及其上级）。 */
async function nodeReadExt(e) {
    if (typeof process === 'undefined' || !process || !process.versions || !process.versions.node) return null;
    try {
        const fsm = await import('node:fs');
        const pathm = await import('node:path');
        if (typeof fsm.readFileSync !== 'function') return null;
        const dir = spiderModuleDir();
        const candidates = [
            e,
            dir ? pathm.join(dir, e) : null,
            dir ? pathm.join(dir, '..', e) : null,
            dir ? pathm.join(dir, '..', '..', e) : null,
            pathm.resolve(e),
        ].filter((x) => x != null);
        for (const c of candidates) {
            try {
                if (!fsm.existsSync(c)) continue;
                const buf = fsm.readFileSync(c);
                return buf.toString('utf-8');
            } catch (err) { /* 候选失败继续 */ }
        }
    } catch (err) {
        // 壳内 import('node:fs') → 空模块 / 异常：忽略
    }
    return null;
}

function extImportCandidates(e) {
    const out = [];
    const push = (s) => { if (s && out.indexOf(s) < 0) out.push(s); };
    push(e);
    if (!e.startsWith('.')) {
        push('./' + e);
        push('../' + e);
        push('../../' + e);
    } else if (e.startsWith('./')) {
        push('../' + e.substring(2));
        push('../../' + e.substring(2));
    }
    return out;
}

// ---------------- lx 脚本实例生命周期（LxScript.start 1:1） ----------------

function lxEnsure() {
    if (lxReady || lxInitPromise != null) return lxInitPromise || Promise.resolve();
    lxInitPromise = (async () => {
        try {
            const resolved = await resolveScript(lxExt);
            // parseHeader（动态 import 形态无源码文本 → 回退 label）
            if (resolved.code) {
                lxScriptCodeRef.code = resolved.code;
                const n = matchHeader(resolved.code, 'name');
                lxInfoName = (n == null || n === '') ? lxLabel : n;
            } else {
                lxInfoName = lxLabel;
            }
            // 宿主安装必须先于脚本求值（脚本顶层 const {...} = globalThis.lx）
            lxInstallHost();
            if (resolved.imports) {
                let ok = false;
                for (const spec of resolved.imports) {
                    try {
                        await import(spec);
                        ok = true;
                        break;
                    } catch (err) {
                        log('import ' + spec + ' FAIL: ' + (err && err.message ? err.message : err));
                    }
                }
                if (!ok) throw new Error('加载脚本失败: ' + lxExt);
            } else {
                (0, eval)(resolved.code);
            }
            lxReady = true;
            log('init done name=' + lxInfoName + ' sources=' + JSON.stringify(lxSources));
        } catch (e) {
            log('init FAIL: ' + (e && e.stack ? e.stack : e));
            lxReady = false;
            lxHandler = null;
            lxInitPromise = null; // 允许下次调用重试（对齐 LxScript.ensure 失败可重入）
            return;
        }
    })();
    return lxInitPromise;
}

// ---------------- musicUrl（LxScript.musicUrl 1:1，质量循环 + 同步/异步 handler 兼容） ----------------

const PREFER_QUALITY = ['flac24bit', 'flac', '320k', '128k'];

function lxQualityList(source) {
    const available = [];
    const meta = lxSources[source];
    if (meta && meta.qualitys) {
        for (const q of meta.qualitys) {
            if (q !== '') available.push(String(q));
        }
    }
    if (available.length === 0) return ['320k', '128k'];
    const ordered = [];
    for (const p of PREFER_QUALITY) if (available.indexOf(p) >= 0) ordered.push(p);
    for (const a of available) if (ordered.indexOf(a) < 0) ordered.push(a);
    return ordered;
}

/** 平台原生 musicInfo：LX 脚本按字段取值，尽量铺满常用别名（LxScript.musicInfoJson 1:1）。 */
function lxMusicInfoJson(source, songId) {
    const mi = {};
    switch (source) {
        case 'kw':
            mi.songId = songId; mi.rid = songId; mi.hash = songId; mi.id = songId;
            break;
        case 'kg':
            mi.hash = songId; mi.ehash = songId; mi.albumId = '0'; mi.id = songId;
            break;
        case 'tx':
            mi.songmid = songId; mi.mediaMid = songId; mi.strMediaMid = songId; mi.albumMid = songId; mi.copyrightId = songId;
            break;
        case 'wy':
            mi.songId = songId; mi.hash = songId; mi.id = songId;
            break;
        case 'mg':
            mi.copyrightId = songId; mi.songId = songId; mi.hash = songId; mi.id = songId; mi.lrcUrl = '';
            break;
        default:
            mi.songId = songId; mi.hash = songId; mi.id = songId;
    }
    return mi;
}

function lxExtractUrl(r) {
    if (r == null) return '';
    if (typeof r === 'string') return r;
    if (typeof r === 'number' || typeof r === 'boolean') return '';
    try {
        const s = typeof r === 'object' ? JSON.stringify(r) : String(r);
        if (s.startsWith('http')) return s;
        const j = JSON.parse(s);
        return j && j.url != null ? String(j.url) : '';
    } catch (e) {
        return '';
    }
}

function lxExtractDebug(r) {
    if (r == null) return 'null';
    if (r instanceof Error) return 'Error:' + (r.message || '');
    const s = typeof r === 'object' ? JSON.stringify(r) : String(r);
    return s.length > 300 ? s.substring(0, 300) + '...' : s;
}

/** 流探活：Range GET 1KB，200/206 视为可用（脚本返回的第三方直链时效短，403 常见）。 */
function lxStreamReachable(url) {
    try {
        const res = req(url, {
            method: 'get',
            headers: { 'Range': 'bytes=0-1023', 'User-Agent': 'Mozilla/5.0' },
            timeout: 4000,
        });
        const code = (res && typeof res.code === 'number' && res.code > 0)
            ? res.code
            : ((res.content || '') !== '' ? 200 : 0);
        return code === 200 || code === 206;
    } catch (e) {
        return false;
    }
}

function isPromise(v) {
    return v != null && typeof v.then === 'function';
}

/** source: wy/tx/kg/kw/mg；songId: 平台歌曲 id/hash/songmid。
 *  handler 可能返回 Promise（async 处理器）：返回 Promise<string>（同步 handler
 *  走 Promise.resolve 快路径，语义一致）。 */
function lxMusicUrl(source, songId) {
    if (!source || !songId) return Promise.resolve('');
    return lxEnsure().then(() => {
        if (!lxReady || lxHandler == null) return '';
        const list = lxQualityList(source);
        let i = 0;
        function step() {
            while (true) {
                if (i >= list.length) return '';
                const q = list[i++];
                // 官方约定：handler 收到单个对象 {action, source, info:{musicInfo, type}}
                const ev = {
                    action: 'musicUrl',
                    source: source,
                    info: {
                        musicInfo: lxMusicInfoJson(source, songId),
                        type: q,
                    },
                };
                let r;
                try {
                    r = lxHandler(ev);
                } catch (e) {
                    log('musicUrl FAIL src=' + source + ' q=' + q + ' id=' + songId + ' : ' + lxExtractDebug(e));
                    continue;
                }
                if (isPromise(r)) {
                    return r.then((v) => finishQ(v, q)).catch((e) => {
                        log('musicUrl FAIL src=' + source + ' q=' + q + ' id=' + songId + ' : ' + lxExtractDebug(e));
                        return step();
                    });
                }
                return finishQ(r, q);
            }
        }
        function finishQ(r, q) {
            const url = lxExtractUrl(r);
            if (url && url.startsWith('http')) {
                // 脚本可能返回已失效直链（403/404），探活失败视为该音质不可用，
                // 继续下一音质；全部失败返回 "" 走 LuoxueApi/官方流兜底
                if (!lxStreamReachable(url)) {
                    log('musicUrl 拒绝(非200) src=' + source + ' q=' + q + ' id=' + songId);
                    return step();
                }
                log('musicUrl ok src=' + source + ' q=' + q + ' id=' + songId
                    + ' url=' + url.substring(0, Math.min(url.length, 150)));
                return url;
            }
            log('musicUrl 空 src=' + source + ' q=' + q + ' id=' + songId + ' r=' + lxExtractDebug(r));
            return step();
        }
        return step();
    });
}

// ============================ LxSource 链路（LxSource.java + LuoxueSpiderBase.java） ============================
//
// 目录层全量复用 MusicCore 聚合链路（分类与之前一致）；
// 取流优先跑 LX 脚本 musicUrl，失败回退洛雪聚合 API，再回退官方 stream。

// ============================ homeContent（MusicCore.homeContent("all") 结构对齐） ============================

function musicHomeContent(filter) {
    try {
        const classes = [
            { type_id: 'hot', type_name: '热歌榜' },
            { type_id: 'netease', type_name: platformName('netease') + '歌单' },
            { type_id: 'kugou', type_name: platformName('kugou') + '歌单' },
            { type_id: 'qq', type_name: platformName('qq') + '歌单' },
            { type_id: 'kuwo', type_name: platformName('kuwo') + '歌单' },
            { type_id: 'migu', type_name: platformName('migu') + '歌单' },
        ];
        // filters（catsParallel 五平台并行分类聚合）未移植：filters 字段按壳协议省略
        return JSON.stringify({ class: classes });
    } catch (e) {
        log('homeContent FAIL p=all : ' + e);
        return '';
    }
}

// ============================ categoryContent（MusicCore.categoryContent("all") 结构对齐） ============================

function musicCategoryContent(tid, pg, filter, extend) {
    const platformOfTid = tid == null ? '' : String(tid).trim();
    try {
        if (platformOfTid === 'hot') {
            return songsToPageData(hotMerge());
        }
        if (platformOfTid.endsWith('_rank')) {
            const p = platformOfTid.substring(0, platformOfTid.length - 5);
            return rankPage(p);
        }
        if (platformOfTid === 'netease' || platformOfTid === 'kugou' || platformOfTid === 'qq'
            || platformOfTid === 'kuwo' || platformOfTid === 'migu') {
            // 歌单列表页（ne/kg/qq/kw/mg playlistPage）未移植
            log('categoryContent 歌单页未移植 tid=' + platformOfTid);
            return pageDataEmpty(pageSafe(pg));
        }
        return pageDataEmpty(pageSafe(pg));
    } catch (e) {
        log('categoryContent FAIL tid=' + tid + ' : ' + e);
        return pageDataEmpty(pageSafe(pg));
    }
}

function pageSafe(pg) {
    try {
        const p = parseInt(pg, 10);
        return isNaN(p) || p < 1 ? 1 : p;
    } catch (e) {
        return 1;
    }
}

/** 榜单卡片目录页（MusicCore.rankPage 1:1）。 */
function rankPage(p) {
    try {
        const ranks = rankList(p);
        const list = [];
        for (const r of ranks) {
            list.push({
                vod_id: p + '_toplist_' + r[0],
                vod_name: r[1],
                vod_pic: r[2] == null ? '' : r[2],
                vod_remarks: platformName(p),
                vod_actor: platformName(p),
                vod_content: platformName(p) + ' · ' + r[1],
            });
        }
        return JSON.stringify({ list: list, page: 1, pagecount: 1, limit: 50, total: list.length });
    } catch (e) {
        log('rankPage FAIL p=' + p + ' : ' + e);
        return pageDataEmpty(1);
    }
}

// ============================ 搜索（MusicSpiderBase.searchContent("all") 结构对齐） ============================

function musicSearchContent(key, quick) {
    const t0 = Date.now();
    const keyword = key == null ? '' : String(key).trim();
    if (keyword === '' || keyword.length > 60) return pageDataEmpty(1);
    log('searchContent enter p=all kw=[' + keyword + '] quick=' + quick);
    try {
        const songs = parallelSearch(keyword);
        log('searchContent done p=all kw=[' + keyword + '] items=' + songs.length
            + ' cost=' + (Date.now() - t0) + 'ms');
        return songsToPageData(songs);
    } catch (e) {
        log('searchContent FAIL p=all kw=[' + keyword + '] : ' + e);
        return pageDataEmpty(1);
    }
}

// ============================ 详情（MusicCore.detailContent 结构对齐） ============================

function musicDetailContent(ids) {
    const t0 = Date.now();
    const id = String(ids[0]);
    const parts = id.split('_', 3);
    if (parts.length === 2) {
        return singleDetail(id, t0);
    }
    if (parts.length !== 3) {
        log('detailContent invalid id=' + id);
        return '';
    }
    const platform = parts[0], kind = parts[1], realId = parts[2];
    const listCoverFallback = '';
    try {
        log('detailContent enter id=' + id);
        let songs;
        let title;
        if (kind === 'toplist') {
            songs = rankSongs(platform, realId);
            title = platformName(platform) + ' · 榜单';
        } else if (kind === 'playlist') {
            let listName = '', listCover = '';
            if (platform === 'netease') {
                const meta = nePlaylistMeta(realId);
                listName = meta[0];
                listCover = meta[1];
            }
            songs = playlistSongs(platform, realId);
            title = listName === '' ? platformName(platform) + ' · 歌单' : listName;
        } else {
            log('detailContent unknown kind=' + kind);
            return '';
        }
        if (songs.length === 0) {
            log('detailContent empty id=' + id);
            return '';
        }
        let play = '';
        for (let i = 0; i < songs.length; i++) {
            const s = songs[i];
            if (i > 0) play += '#';
            play += String(i + 1).padStart(2, '0') + '.' + s.name
                + '$' + songUid(s);
            play += '$' + (s.hasK ? '1' : '0');
            play += '$' + (s.artist == null ? '' : s.artist); // 歌手/封面随行下发（壳歌单页+播放队列展示）
            play += '$' + (s.cover == null ? '' : s.cover);
        }
        const cover = listCoverFallback === '' ? songs[0].cover : listCoverFallback;
        const v = {
            vod_id: id,
            vod_name: title,
            vod_pic: cover,
            vod_content: '共 ' + songs.length + ' 首 · ' + platformName(platform),
            vod_remarks: songs.length + '首',
            type_id: platform,
            type_name: platformName(platform),
            vod_play_from: PLAY_FLAG,
            vod_play_url: play,
        };
        log('detailContent done id=' + id + ' songs=' + songs.length + ' cost=' + (Date.now() - t0) + 'ms');
        return JSON.stringify({ code: 1, list: [v] });
    } catch (e) {
        log('detailContent FAIL id=' + id + ' : ' + e);
        return '';
    }
}

/** 单曲详情（2 段 uid）。 */
function singleDetail(uid, t0) {
    try {
        const s = songInfo(uid);
        const name = s == null ? uid : s.name;
        const artist = s == null ? '' : s.artist;
        const v = {
            vod_id: uid,
            vod_name: name,
            vod_pic: s == null ? '' : s.cover,
            vod_remarks: artist,
            vod_content: artist + (s == null || s.album === '' ? '' : ' · ' + s.album),
            type_id: uid.indexOf('_') > 0 ? uid.substring(0, uid.indexOf('_')) : '',
            vod_play_from: PLAY_FLAG,
            vod_play_url: '01.' + name + '$' + uid,
        };
        log('singleDetail done id=' + uid + ' cost=' + (Date.now() - t0) + 'ms');
        return JSON.stringify({ code: 1, list: [v] });
    } catch (e) {
        log('singleDetail FAIL id=' + uid + ' : ' + e);
        return '';
    }
}

/** 单曲信息（action song 用；MusicCore.songInfo 子集：qqSongDetail 未移植走搜索回退）。 */
function songInfo(uid) {
    const parts = splitUid(uid);
    if (parts == null) return null;
    const platform = parts[0], songId = parts[1];
    try {
        if (platform === 'kugou') return Song('kugou', songId, songId, '', '', '', 0);
        const cached = songByUid(uid);
        if (cached) return cached;
        const songs = searchOne(platform, songId);
        for (const s of songs) {
            if (s.id === songId) return s;
        }
    } catch (e) { /* ignore */ }
    return null;
}

// ============================ action（MusicCore.action 子集） ============================

function musicAction(action) {
    if (action == null || action === '') return null;
    const t0 = Date.now();
    try {
        log('action enter ' + action);
        if (action.startsWith('song:')) {
            const uid = action.substring(5);
            const s = songInfo(uid);
            if (s == null) return '{"error":"song not found"}';
            return JSON.stringify({ song: songJson(s) });
        }
        if (action.startsWith('search:')) {
            const parts = action.split(':', 3);
            if (parts.length < 3) return '{"error":"invalid search action"}';
            const platform = parts[1], kw = parts[2];
            let songs = platform === 'all' ? parallelSearch(kw) : searchOne(platform, kw);
            if (songs.length > 30) songs = songs.slice(0, 30);
            const arr = songs.map(songJson);
            log('action search done kw=' + kw + ' items=' + songs.length + ' cost=' + (Date.now() - t0) + 'ms');
            return JSON.stringify({ songs: arr });
        }
        if (action.startsWith('playlistUrl:') || action.startsWith('playlist:')) {
            // 歌单推送 action（playlistSongs 六平台链路）未移植
            return '{"error":"playlist action not ported"}';
        }
        return null;
    } catch (e) {
        log('action FAIL ' + action + ' : ' + e);
        return '{"error":"Exception"}';
    }
}

// ============================ playerContent（LxSource.playerContent 1:1） ============================

function lxPlayerContent(flag, id, vipFlags) {
    const t0 = Date.now();
    if (flag !== 'MV') {
        const uid = splitUid(String(id));
        if (uid != null) {
            const lxP = lxMusicUrl(luoxueMapSource(uid[0]) || '', uid[1]);
            const finish = (url) => {
                if (url == null) url = '';
                if (url === '') url = luoxueStream(uid[0], uid[1]);
                if (url != null && url !== '') {
                    try {
                        const r = {
                            parse: 0,
                            playUrl: '',
                            header: {},
                            flag: !flag ? '洛雪音乐' : flag,
                            url: url,
                            lyric: '',   // MusicCore.lyric（weapi/QRC/KRC 歌词链路）未移植
                            klyric: '',
                            accompany: '',
                            trackMode: 'single',
                            mv: '',      // MusicCore.mvMeta/mvUrl 未移植
                        };
                        log('playerContent lx done id=' + id + ' cost=' + (Date.now() - t0) + 'ms');
                        return JSON.stringify(r);
                    } catch (e) {
                        log('playerContent lx FAIL id=' + id + ' : ' + e);
                    }
                }
                // 聚合失败/MV 请求：官方链路兜底（MusicCore.streamDirect 未移植）→ 空串
                log('playerContent no url id=' + id + ' platform=' + uid[0]
                    + ' cost=' + (Date.now() - t0) + 'ms (VIP或版权受限/官方链路未移植)');
                return '';
            };
            if (isPromise(lxP)) {
                return lxP.then(finish).catch((e) => {
                    log('playerContent lx FAIL id=' + id + ' : ' + lxExtractDebug(e));
                    return '';
                });
            }
            return finish(lxP);
        }
    }
    // MV flag：MusicCore.mvUrl 官方 MV 链路未移植
    log('playerContent MV flag 未移植 id=' + id + ' cost=' + (Date.now() - t0) + 'ms');
    return '';
}

// ============================ JsSpider 协议出口 ============================

export default {
    /** ext = lx 脚本路径（壳传入 './lib/lx/lx_xinghai.js' 形态；node 测试可传绝对路径）。
     *  对齐 LxSource.java：每次 init 用新 ext 重建脚本实例（旧实例状态丢弃）。 */
    init(ext) {
        const e = ext || '';
        if (e !== lxExt) {
            lxExt = e;
            lxReady = false;
            lxHandler = null;
            lxSources = {};
            lxInfoName = '';
            lxInitPromise = null;
        }
        lxLabel = (function () {
            const m = /[^/\\]+\.js$/.exec(lxExt);
            return m ? m[0].replace(/\.js$/, '') : 'lxsource';
        })();
        const p = lxEnsure();
        // 壳 Async.run 支持 Promise 返回（init 完成即 inited/脚本就绪）
        return p.then(() => '');
    },

    home(filter) {
        return musicHomeContent(filter);
    },

    homeVod() {
        // homeVideoContent("all") = 网易云精品歌单（neHighquality）未移植
        return '';
    },

    category(tid, pg, filter, extend) {
        return musicCategoryContent(tid, pg, filter, extend || {});
    },

    detail(id) {
        return musicDetailContent([String(id)]);
    },

    search(key, quick) {
        return musicSearchContent(key, quick);
    },

    /** 取流：lx 脚本 musicUrl → LuoxueApi 聚合兜底。handler 为 async 时返回 Promise
     *  （壳 Async.run 支持；node run.mjs await 兼容）。 */
    play(flag, id, vipFlags) {
        return lxPlayerContent(flag, id, vipFlags);
    },

    action(action) {
        return musicAction(action);
    },
};

// 供 golden 对拍使用（不进壳协议）
export const __lx = {
    lxHttp, lxParseBody, lxCryptoMd5, lxCryptoAes, lxCryptoRsa,
    lxHandleInited, lxExtractUrl, lxQualityList, lxMusicInfoJson,
    lxEnsure, lxState: () => ({ ready: lxReady, handler: !!lxHandler, sources: lxSources, name: lxInfoName }),
    neSearch, parallelSearch, songsToPageData, splitUid, luoxueStream, luoxueMapSource,
    linuxEparams,
};

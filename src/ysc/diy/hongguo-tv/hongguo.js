// 红果短剧 TVBox JS 源（QuickJS 原生运行时，无外部依赖）
// 移植自 demo/hongguo Go 核心：X-Gorgon 纯算法签名 + spade_a 内容密钥解出
// play() 返回 decryption_key 字段，由 App 侧 IjkMediaPlayer 以 OPT_CATEGORY_FORMAT 传给 FFmpeg 解 CENC

var APP_UA = 'com.phoenix.read/73532 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3; Cronet/TTNetVersion:04657795 2026-01-23 QuicVersion:c67e9834 2025-09-08)';
var APP_BASE = 'https://api5-normal-sinfonlineb.fqnovel.com';
var WEB_BASE = 'https://hongguoduanju.com';
var MEDIA_REFERER = 'https://novel.snssdk.com/';

var GENRES = [
    { key: 'short_play', scene: 'default', name: '真人剧' },
    { key: 'comic_series', scene: 'comic_series', name: '漫剧' },
    { key: 'ai_series', scene: 'ai_series', name: 'AI剧' }
];

var NUMERIC = /^[0-9]{1,32}$/;

var DEV_ID = storeGet('hongguo_device_id') || storeSet('hongguo_device_id', newDeviceID());
var INSTALL_ID = storeGet('hongguo_install_id') || storeSet('hongguo_install_id', newDeviceID());

function storeGet(key) {
    try { return local.get(key) || null; } catch (e) { return null; }
}

function storeSet(key, value) {
    try { local.set(key, value); } catch (e) { }
    return value;
}

function randDigitStr(count) {
    var out = '';
    for (var i = 0; i < count; i++) out += Math.floor(Math.random() * 10);
    return out;
}

function newDeviceID() {
    return randDigitStr(19);
}

// ---------------- 基础编码工具 ----------------

function utf8Encode(str) {
    var out = [];
    for (var i = 0; i < str.length; i++) {
        var code = str.charCodeAt(i);
        if (code >= 0xD800 && code <= 0xDBFF && i + 1 < str.length) {
            var next = str.charCodeAt(i + 1);
            if (next >= 0xDC00 && next <= 0xDFFF) {
                code = 0x10000 + ((code - 0xD800) << 10) + (next - 0xDC00);
                i++;
            }
        }
        if (code < 0x80) out.push(code);
        else if (code < 0x800) out.push(0xC0 | (code >> 6), 0x80 | (code & 0x3F));
        else if (code < 0x10000) out.push(0xE0 | (code >> 12), 0x80 | ((code >> 6) & 0x3F), 0x80 | (code & 0x3F));
        else out.push(0xF0 | (code >> 18), 0x80 | ((code >> 12) & 0x3F), 0x80 | ((code >> 6) & 0x3F), 0x80 | (code & 0x3F));
    }
    return out;
}

function utf8Decode(bytes) {
    var out = '', i = 0;
    while (i < bytes.length) {
        var c = bytes[i];
        if (c < 0x80) { out += String.fromCharCode(c); i++; }
        else if (c < 0xE0) { out += String.fromCharCode(((c & 0x1F) << 6) | (bytes[i + 1] & 0x3F)); i += 2; }
        else if (c < 0xF0) { out += String.fromCharCode(((c & 0x0F) << 12) | ((bytes[i + 1] & 0x3F) << 6) | (bytes[i + 2] & 0x3F)); i += 3; }
        else {
            var cp = ((c & 0x07) << 18) | ((bytes[i + 1] & 0x3F) << 12) | ((bytes[i + 2] & 0x3F) << 6) | (bytes[i + 3] & 0x3F);
            cp -= 0x10000;
            out += String.fromCharCode(0xD800 + (cp >> 10), 0xDC00 + (cp & 0x3FF));
            i += 4;
        }
    }
    return out;
}

var B64C = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';

function b64decode(str) {
    str = String(str || '').replace(/\s/g, '').replace(/-/g, '+').replace(/_/g, '/').replace(/=+$/, '');
    var out = [], buf = 0, bits = 0;
    for (var i = 0; i < str.length; i++) {
        var v = B64C.indexOf(str.charAt(i));
        if (v < 0) return null;
        buf = (buf << 6) | v;
        bits += 6;
        if (bits >= 8) { bits -= 8; out.push((buf >> bits) & 0xff); }
    }
    return out;
}

function popcount(x) {
    x = x - ((x >> 1) & 0x55555555);
    x = (x & 0x33333333) + ((x >> 2) & 0x33333333);
    x = (x + (x >> 4)) & 0x0f0f0f0f;
    return (x * 0x01010101) >> 24;
}

// ---------------- MD5（纯 JS，K 表运行时计算避免硬编码出错） ----------------

function md5Bytes(input) {
    var bytes = typeof input === 'string' ? utf8Encode(input) : input;
    var bitLen = bytes.length * 8;
    var padded = bytes.slice();
    padded.push(0x80);
    while (padded.length % 64 !== 56) padded.push(0);
    padded.push(bitLen & 0xff, (bitLen >>> 8) & 0xff, (bitLen >>> 16) & 0xff, (bitLen >>> 24) & 0xff, 0, 0, 0, 0);

    var a0 = 0x67452301, b0 = 0xefcdab89, c0 = 0x98badcfe, d0 = 0x10325476;
    var K = [];
    for (var i = 0; i < 64; i++) K[i] = Math.floor(Math.abs(Math.sin(i + 1)) * 4294967296);
    var S = [7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 16, 23, 6, 10, 15, 21];

    for (var off = 0; off < padded.length; off += 64) {
        var M = [];
        for (var j = 0; j < 16; j++) {
            M[j] = (padded[off + j * 4]) | (padded[off + j * 4 + 1] << 8) | (padded[off + j * 4 + 2] << 16) | (padded[off + j * 4 + 3] << 24);
        }
        var A = a0, B = b0, C = c0, D = d0;
        for (var k = 0; k < 64; k++) {
            var F, g;
            if (k < 16) { F = (B & C) | (~B & D); g = k; }
            else if (k < 32) { F = (D & B) | (~D & C); g = (5 * k + 1) % 16; }
            else if (k < 48) { F = B ^ C ^ D; g = (3 * k + 5) % 16; }
            else { F = C ^ (B | ~D); g = (7 * k) % 16; }
            F = (F + A + K[k] + M[g]) | 0;
            A = D; D = C; C = B;
            var s = S[k % 4 + (k >> 4) * 4];
            B = (B + ((F << s) | (F >>> (32 - s)))) | 0;
        }
        a0 = (a0 + A) | 0; b0 = (b0 + B) | 0; c0 = (c0 + C) | 0; d0 = (d0 + D) | 0;
    }
    var out = [];
    [a0, b0, c0, d0].forEach(function (w) {
        out.push(w & 0xff, (w >>> 8) & 0xff, (w >>> 16) & 0xff, (w >>> 24) & 0xff);
    });
    return out;
}

function bytesHex(bytes, upper) {
    var hex = '';
    for (var i = 0; i < bytes.length; i++) {
        var h = (bytes[i] & 0xff).toString(16);
        hex += h.length < 2 ? '0' + h : h;
    }
    return upper ? hex.toUpperCase() : hex;
}

function md5Hex(input) { return bytesHex(md5Bytes(input), false); }

// 雪花ID（19位）超过 JS Number 安全整数（2^53），解析前把长数值字面量保护为字符串
function parseJSON(text) {
    return JSON.parse(String(text).replace(/([:\[,]\s*)(\d{16,})(\s*[,}\]])/g, '$1"$2"$3'));
}

// ---------------- X-Gorgon 签名（纯算法） ----------------

function rotl8(b, n) { return ((b << n) | (b >>> (8 - n))) & 0xff; }

function reverse8(b) {
    b = ((b & 0xF0) >> 4) | ((b & 0x0F) << 4);
    b = ((b & 0xCC) >> 2) | ((b & 0x33) << 2);
    b = ((b & 0xAA) >> 1) | ((b & 0x55) << 1);
    return b & 0xff;
}

function signHeaders(rawQuery, bodyStr) {
    var ts = Math.floor(Date.now() / 1000);
    var qh = md5Bytes(rawQuery);
    var payload = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 11, 28, 0, 0, 0, 0];
    for (var i = 0; i < 4; i++) payload[i] = qh[i];
    if (bodyStr != null) {
        var bh = md5Bytes(bodyStr);
        for (var j = 0; j < 4; j++) payload[4 + j] = bh[j];
    }
    payload[16] = (ts >>> 24) & 0xff;
    payload[17] = (ts >>> 16) & 0xff;
    payload[18] = (ts >>> 8) & 0xff;
    payload[19] = ts & 0xff;
    var KEY = [0x44, 0xb9, 0xb9, 0xd9, 0xa4, 0xae, 0xf9, 0xfc, 0xa4, 0x93, 0xaa, 0x75, 0x7c, 0xa3, 0xc2, 0xc4, 0xa4, 0x96, 0x93, 0x8f];
    for (var k = 0; k < 20; k++) payload[k] ^= KEY[k];
    for (var m = 0; m < 20; m++) {
        var mixed = rotl8(payload[m], 4) ^ payload[(m + 1) % 20];
        payload[m] = (reverse8(mixed) ^ 0xff ^ 20) & 0xff;
    }
    var sig = [0x84, 0x04, 0x40, 0x1c, 0, 0].concat(payload);
    var headers = {
        'X-Khronos': String(ts),
        'X-Gorgon': bytesHex(sig, false),
        'X-SS-Req-Ticket': String(Date.now())
    };
    if (bodyStr != null) headers['X-SS-STUB'] = bytesHex(md5Bytes(bodyStr), true);
    return headers;
}

// ---------------- App 接口请求 ----------------

// Go url.Values.Encode() 语义：键排序 + 值仅保留 A-Za-z0-9-_.~，其余大写百分号编码
function goEscapeValue(v) {
    return encodeURIComponent(String(v)).replace(/[!'()*]/g, function (c) {
        return '%' + c.charCodeAt(0).toString(16).toUpperCase();
    });
}

function buildAppQuery() {
    var q = {
        aid: '8662', app_name: 'novelread', version_code: '73532', version_name: '7.3.5.32',
        manifest_version_code: '73532', update_version_code: '73532', channel: 'update_64',
        device_platform: 'android', os: 'android', ssmix: 'a', device_type: '25053RT47C',
        device_brand: 'Redmi', language: 'zh', os_api: '36', os_version: '16',
        resolution: '1280*2772', dpi: '520', ac: 'wifi', device_id: DEV_ID, iid: INSTALL_ID,
        _rticket: String(Date.now())
    };
    var keys = Object.keys(q).sort();
    var pairs = [];
    for (var i = 0; i < keys.length; i++) pairs.push(keys[i] + '=' + goEscapeValue(q[keys[i]]));
    return pairs.join('&');
}

function appRequest(path, payload) {
    var body = payload == null ? null : JSON.stringify(payload);
    for (var attempt = 0; attempt < 2; attempt++) {
        var rawQuery = buildAppQuery();
        var url = APP_BASE + path + '?' + rawQuery;
        var headers = {
            'User-Agent': APP_UA,
            'Accept': 'application/json',
            'X-XS-From-Web': '0',
            'Sdk-Version': '2'
        };
        if (body != null) headers['Content-Type'] = 'application/json; charset=utf-8';
        var sign = signHeaders(rawQuery, body);
        Object.keys(sign).forEach(function (k) { headers[k] = sign[k]; });
        var res = req(url, { method: 'post', headers: headers, body: body || '', timeout: 15000 });
        var content = res && res.content ? res.content : '';
        if (!content) { if (attempt === 0) { continue; } throw new Error('红果App接口无响应'); }
        var result;
        try { result = parseJSON(content); } catch (e) { throw new Error('红果App接口返回格式异常'); }
        var code = result && (result.code !== undefined ? result.code : (result.status_code !== undefined ? result.status_code : (result.BaseResp && result.BaseResp.StatusCode)));
        if (code !== undefined && code !== null && String(code) !== '0') {
            if (attempt === 0) { continue; }
            throw new Error('红果App接口暂不可用(' + code + ')');
        }
        return result;
    }
    throw new Error('红果App接口请求失败');
}

// ---------------- spade_a 内容密钥（16 字节 AES-128，hex 返回） ----------------

function hongguoContentKey(spadeA) {
    var raw = b64decode(spadeA);
    if (!raw || raw.length < 3 || raw.length > 1024) throw new Error('红果媒体密钥编码无效');
    var tagLength = (raw[0] ^ raw[1] ^ raw[2]) - 48;
    var contentLength = raw.length - tagLength - 1;
    if (tagLength < 1 || contentLength < 33 || contentLength >= raw.length) throw new Error('红果媒体密钥结构无效');
    var seed = raw[raw.length - tagLength - 2] ^ raw[raw.length - tagLength - 1];
    var tag = '';
    for (var i = 0; i < tagLength; i++) tag += String.fromCharCode(raw[raw.length - tagLength + i] ^ seed);
    if (tag === 'app_v2' || tag === 'web_v2') throw new Error('红果媒体密钥版本暂不支持');
    var prevEven = 250, prevOdd = 85, decoded = [];
    for (var k = 0; k < contentLength; k++) {
        var cur = raw[1 + k], prev;
        if (k % 2 === 0) { prev = prevEven; prevEven = cur; }
        else { prev = prevOdd; prevOdd = cur; }
        decoded[k] = ((prev ^ cur) - 21 - popcount(k)) & 0xff;
    }
    var text = utf8Decode(decoded);
    var padding = parseInt(text.charAt(0), 36);
    if (isNaN(padding) || contentLength - padding - 1 !== 32) throw new Error('红果媒体密钥内容无效');
    var keyHex = text.substring(1, 33);
    if (!/^[0-9a-fA-F]{32}$/.test(keyHex)) throw new Error('红果媒体密钥不是有效的AES-128密钥');
    return keyHex;
}

// ---------------- 数据结构映射 ----------------

function firstNonEmpty() {
    for (var i = 0; i < arguments.length; i++) {
        var v = arguments[i];
        if (v !== undefined && v !== null && String(v).trim() !== '') return String(v);
    }
    return '';
}

function dramaFrom(row, categoryName) {
    if (!row || typeof row !== 'object') return null;
    var vd = row.video_data && typeof row.video_data === 'object' ? row.video_data : row;
    var sourceID = firstNonEmpty(vd.series_id_str, vd.series_id, row.series_id_str, row.series_id, vd.keyword, row.keyword);
    if (!NUMERIC.test(sourceID)) return null;
    var title = firstNonEmpty(vd.series_title, vd.series_name, vd.title, row.series_name, row.name, sourceID);
    var cover = firstNonEmpty(vd.series_cover, vd.cover, row.series_cover);
    var intro = firstNonEmpty(vd.series_intro, vd.video_desc, row.series_intro);
    var count = firstNonEmpty(vd.episode_cnt, row.episode_cnt);
    var remark = firstNonEmpty(vd.episode_right_text, row.episode_right_text);
    if (!remark && count) remark = '共' + count + '集';
    if (vd.series_status === '1') remark = '已完结';
    else if (vd.series_status === '0' && !remark && count) remark = '连载中·共' + count + '集';
    var tags = [];
    function pushTag(name) { if (name && tags.indexOf(name) < 0) tags.push(name); }
    if (Array.isArray(vd.tags)) vd.tags.forEach(pushTag);
    if (Array.isArray(vd.category_list)) vd.category_list.forEach(function (item) { if (item && item.name) pushTag(item.name); });
    if (typeof vd.category_schema === 'string' && vd.category_schema) {
        try {
            var schema = JSON.parse(vd.category_schema);
            if (Array.isArray(schema)) schema.forEach(function (item) { if (item && item.name) pushTag(item.name); });
        } catch (e) { }
    }
    var typeName = firstNonEmpty(vd.category_name, vd.categoryName, vd.category, categoryName) || (tags[0] || '');
    return {
        vod_id: sourceID,
        vod_name: title,
        vod_pic: cover,
        vod_remarks: remark,
        vod_content: intro,
        type_name: typeName,
        vod_tag: tags.join(',')
    };
}

function dramaList(rows, categoryName) {
    var out = [], seen = {};
    (rows || []).forEach(function (row) {
        var d = dramaFrom(row, categoryName);
        if (d && !seen[d.vod_id]) { seen[d.vod_id] = 1; out.push(d); }
    });
    return out;
}

// ---------------- 分类（App 源 feed） ----------------

function catalogPage(genre, offset) {
    var payload = {
        req_scene: genre.scene, offset: offset, limit: 18,
        req_type: 'only_content', need_selector_panel: false, client_req_type: offset > 0 ? 2 : 3,
        session_id: '', filter_ids: '',
        select_items: {
            genre: [genre.key], sort: ['online_time'], gender: [],
            category_dim_theme: [], category_dim_role: [], category_dim_epoch: [],
            online_time: [], creation_status: []
        }
    };
    var result = appRequest('/reading/distribution/category/landpage/v/', payload);
    var data = (result && result.data) || {};
    var rows = Array.isArray(data.video_data) ? data.video_data : [];
    var items = dramaList(rows, genre.name);
    var hasMore = data.has_more === true;
    return { items: items, hasMore: hasMore };
}

// ---------------- 播放地址选择 ----------------

function isHttpUrl(s) { return /^https?:\/\//i.test(s); }

function mediaAddresses(info) {
    var out = [], seen = {};
    function add(value) {
        if (typeof value === 'string') {
            var s = value.trim();
            if (s.length > 8192) return;
            if (!isHttpUrl(s)) {
                var dec = b64decode(s);
                if (!dec) return;
                s = utf8Decode(dec).trim();
            }
            if (isHttpUrl(s) && !seen[s]) { seen[s] = 1; out.push(s); }
        } else if (Array.isArray(value)) {
            value.forEach(add);
        }
    }
    ['main_url', 'backup_url', 'backup_url_1', 'backup_url_2', 'backup_urls', 'url_list'].forEach(function (key) {
        if (info) add(info[key]);
    });
    return out;
}

function selectAppMedia(model) {
    var variants = model && Array.isArray(model.video_list) ? model.video_list : null;
    if (!variants && model && model.video_list && typeof model.video_list === 'object') {
        variants = Object.keys(model.video_list).sort().map(function (k) { return model.video_list[k]; });
    }
    if (!variants) throw new Error('红果App未返回媒体列表');
    var duration = parseFloat(firstNonEmpty(model.video_duration, model.duration)) || 0;
    var best = null, bestScore = -1, keyErr = null;
    variants.forEach(function (row) {
        if (!row || typeof row !== 'object') return;
        var meta = row.video_meta && typeof row.video_meta === 'object' ? row.video_meta : {};
        var codec = String(meta.codec_type || '').toLowerCase();
        if (codec === 'bytevc2' || String(row.gear_des_key || '').toLowerCase().indexOf('bytevc2') >= 0) return;
        var addresses = mediaAddresses(row);
        if (!addresses.length) return;
        var keyHex = '';
        var encryption = row.encrypt_info && typeof row.encrypt_info === 'object' ? row.encrypt_info : {};
        var spade = String(encryption.spade_a || '');
        if (spade || encryption.encrypt === true || String(encryption.encryption_method || '') === 'cenc-aes-ctr') {
            try { keyHex = hongguoContentKey(spade); }
            catch (e) { keyErr = e; return; }
        }
        var height = parseInt(meta.vheight) || 0;
        var defMatch = String(meta.definition || '').match(/[0-9]+/);
        if (defMatch && parseInt(defMatch[0]) > 0) height = parseInt(defMatch[0]);
        else {
            var width = parseInt(meta.vwidth) || 0;
            if (width > 0 && (height === 0 || width < height)) height = width;
        }
        var score = height * 10;
        if (codec === 'h264' || codec === 'avc1') score += 1;
        addresses.forEach(function (addr) {
            if (score > bestScore) {
                bestScore = score;
                best = { url: addr, key: keyHex, quality: height, duration: duration, variants: [] };
            }
        });
    });
    if (best) return best;
    if (keyErr) throw keyErr;
    throw new Error('红果App未返回兼容的媒体，已跳过不支持的编码');
}

// ---------------- catvod 接口 ----------------

function init(cfg) {
    return '';
}

function home(filter) {
    var classes = GENRES.map(function (g) { return { type_id: g.key, type_name: g.name }; });
    return JSON.stringify({ class: classes, filters: {} });
}

function homeVod() {
    var page = catalogPage(GENRES[0], 0);
    return JSON.stringify({ list: page.items });
}

function category(tid, pg, filter, extend) {
    pg = parseInt(pg) || 1;
    var genre = null;
    GENRES.forEach(function (g) { if (g.key === tid) genre = g; });
    if (!genre) genre = GENRES[0];
    var page = catalogPage(genre, (pg - 1) * 18);
    return JSON.stringify({
        list: page.items,
        page: pg,
        pagecount: page.hasMore ? pg + 1 : pg,
        limit: 18,
        total: page.items.length
    });
}

function detail(ids) {
    var seriesID = String(ids || '').trim();
    if (!NUMERIC.test(seriesID)) throw new Error('红果剧集ID无效');
    var result = appRequest('/novel/player/video_detail/v1/', { series_id: seriesID });
    var detailData = (result && result.data && result.data.video_data) || {};
    var returnedID = firstNonEmpty(detailData.series_id_str, detailData.series_id);
    if (returnedID !== seriesID) throw new Error('红果App未返回所请求的剧集');
    var drama = dramaFrom(detailData, '短剧');
    var vids = [];
    (Array.isArray(detailData.video_list) ? detailData.video_list : []).forEach(function (video) {
        if (!video || typeof video !== 'object') return;
        var vid = String(video.vid || '').trim();
        var index = parseInt(video.vid_index);
        if (!NUMERIC.test(vid) || !(index >= 1)) return;
        vids.push({ vid: vid, index: index });
    });
    vids.sort(function (a, b) { return a.index - b.index; });
    var playUrl = vids.map(function (v) { return '第' + v.index + '集$' + seriesID + '-' + v.vid; }).join('#');
    return JSON.stringify({
        vod_id: seriesID,
        vod_name: drama ? drama.vod_name : seriesID,
        vod_pic: drama ? drama.vod_pic : '',
        type_name: drama ? drama.type_name : '短剧',
        vod_remarks: drama ? drama.vod_remarks : '',
        vod_content: drama ? drama.vod_content : '',
        vod_play_from: '红果',
        vod_play_url: playUrl
    });
}

function search(wd, quick) {
    var keyword = String(wd || '').trim();
    if (!keyword) return JSON.stringify({ list: [] });
    var url = WEB_BASE + '/incent_resource/suggestion?app_id=8662&query=' + encodeURIComponent(keyword) + '&count=50';
    var res = req(url, {
        method: 'get',
        headers: {
            'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36',
            'Referer': WEB_BASE + '/',
            'Accept': 'application/json',
            'Accept-Language': 'zh-CN,zh;q=0.9'
        },
        timeout: 8000
    });
    var content = res && res.content ? res.content : '';
    if (!content) return JSON.stringify({ list: [] });
    var result;
    try { result = parseJSON(content); } catch (e) { return JSON.stringify({ list: [] }); }
    var records = (result && Array.isArray(result.suggest_list)) ? result.suggest_list
        : (result && result.data && Array.isArray(result.data.suggest_list)) ? result.data.suggest_list : [];
    var rows = [];
    records.forEach(function (record) {
        if (!record || record.word_type !== 'short_play_name') return;
        rows.push({ video_data: record.video_data, name: record.name, keyword: record.keyword });
    });
    var list = dramaList(rows, '短剧').filter(function (d) { return d.vod_name !== d.vod_id; });
    return JSON.stringify({ list: list });
}

function play(flag, id, vipFlags) {
    var parts = String(id || '').split('-');
    if (parts.length < 2) throw new Error('红果播放ID无效');
    var seriesID = parts[0], videoID = parts.slice(1).join('-');
    if (!NUMERIC.test(seriesID) || !NUMERIC.test(videoID)) throw new Error('红果播放ID无效');
    var result = appRequest('/novel/player/video_model/v1/', {
        video_id: videoID, content_type: 1,
        biz_param: { need_all_video_definition: true, video_platform: 3 }
    });
    var data = (result && result.data) || {};
    var model = data.video_model;
    if (typeof model === 'string') model = parseJSON(model);
    var media = selectAppMedia(model);
    if (!media.key) throw new Error('该集未返回CENC解密密钥，无法播放');
    return JSON.stringify({
        parse: 0,
        jx: 0,
        url: media.url,
        decryption_key: media.key,
        header: { 'Referer': MEDIA_REFERER },
        flag: flag || '红果'
    });
}

function __jsEvalReturn() {
    return {
        init: init,
        home: home,
        homeVod: homeVod,
        category: category,
        detail: detail,
        search: search,
        play: play
    };
}

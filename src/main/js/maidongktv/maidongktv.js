/**
 * maidongktv.js — 麦动K歌（JS 版，catvod JsSpider 协议）
 *
 * 移植自：kele/src/main/java/maidongktv/src/com/github/catvod/spider/Maidongktv.java
 *（456 行主类）+ maidongktv/{MuseApi, MuseCrypto, SongGateway, CleanHttp,
 * ThunderDecrypt, LyricFetcher}.java，1:1 精确移植，算法与协议逐行对齐。
 *
 * 站点 key：guoguomaidong（guoju-api/java/果果音乐/果果音乐.json 一致，
 * 挂配置顶层 karaokes 段（style:"karaoke"），壳侧 K歌独立模块按此渲染）。
 *
 * 取流链路（与欢唱K歌官方曲库同生态，但走免激活第三方网关）：
 *   曲库：MuseApi（mconn.cherryonline.cn/mad-api：conf/get → device-id/get → login
 *         → box-info/create → song/get-page / singer/get-page），Song.id 即 musicno；
 *   取流：SongGateway（w.w345.my 等第三方网关：i.php 取 token → do.php 取
 *         MPEG-TS 直链，两次 MD5 签名，裸 Socket 干净请求过风控）；
 *   播放：直链为 Thunder 加密 TS（512 头 + AES/ECB 分段加密），走本地代理
 *         proxy() 下载 → ThunderDecrypt 解密 → Range 回吐明文 TS（与欢唱K歌同模式）。
 *
 * 伴唱：源文件为双音轨 TS（视频 + 原唱 mp2 音轨 + 伴奏 mp2 音轨），壳侧 trackMode=multi
 *       selectTrack 切音轨（原唱=第 1 条、伴奏=最后 1 条），默认播第 1 条=原唱。
 *
 * 与 Java 版的差异（壳协议约束，算法不变）：
 *  - CleanHttp 裸 Socket 不可复现：JS 宿主 req（okhttp/fetch）必然附加
 *    User-Agent/Connection/Accept-Encoding 等栈默认头，无法只发 Host+Accept。
 *    cleanGet 以「无 UA 头 + Accept: \*\/\*」尽力对齐（宿主栈仍可能带 UA），
 *    网关 403 风控风险由 cleanGet 信封 status 启发式兜底（content 空 → status 0）。
 *  - 静态 LinkedHashMap LRU 缓存（SONG/SINGER/URL/TS/LYRIC）→ 模块级 Map + 手工淘汰；
 *  - org.json → JSON.parse（响应 id 均为字符串/短数字，无 2^53 精度风险）；
 *  - MuseCrypto RSA/ECB/PKCS1 → 宿主 rsaEncrypt/rsaDecrypt（X509/PKCS8 PEM）；
 *    MuseCrypto AES-GCM → 本文件纯 JS GCM（CTR + GHASH，CryptoJS ECB 做分组加密，
 *    壳 aesX 不支持 GCM 模式）。
 *
 * 宿主依赖：req/local/getProxy/console；lib/crypto-js.js、lib/binutil.js、lib/xhs_sign.js。
 */

// 副作用 import：挂载 globalThis.CryptoJS（UMD 已补丁为 globalThis root）
import '../lib/crypto-js.js';
import {
    bytesToB64, b64ToBytes, utf8ToBytes, bytesToUtf8, hexToBytes,
    concatBytes, randomBytes,
} from '../lib/binutil.js';
import { md5Hex } from '../lib/xhs_sign.js';

const log = (...a) => { try { console.log('[ktv-js]', ...a); } catch (e) {} };

// ============================ 常量（MuseApi.java） ============================

const MCONN = 'https://mconn.cherryonline.cn/mad-api';
const PROXY = 'http://hc.ac16.vip/cherry_proxy.php';
const UA = 'okhttp/3.12.13';

// 登录固定字段（逆向 ug1/fn/mr0 确认）
const VC = 22036;
const VN = '2.20.36.2607171808';
const CHANNEL = 'tv';
const MODE = 'ott';
const MODEL = 'MBox';
const S8 = 'com.origjoy.stream.tv';
const SA = 'com.origjoy.stream.ktv.MuseApp';

// 证书签名（从 APK META-INF 提取，固定值）
const SIGNATURE = '1d985754b5eadad98126a68beaf8fb4e';
const S7 = 'e443a54d1a5424c3';

// ============================ 纯 JS AES-GCM（MuseCrypto.java） ============================
//
// 壳宿主 aesX 不支持 GCM 模式、CryptoJS 亦无 GCM：按 NIST SP 800-38D 自实现。
// 分组加密复用 CryptoJS AES-ECB（单块 NoPadding），GHASH 用 BigInt 做 GF(2^128) 乘法。

function aesEcbBlock(keyBytes, blockBytes) {
    const c = CryptoJS.AES.encrypt(
        CryptoJS.lib.WordArray.create(bytesToWords(blockBytes), 16),
        CryptoJS.lib.WordArray.create(bytesToWords(keyBytes), keyBytes.length),
        { mode: CryptoJS.mode.ECB, padding: CryptoJS.pad.NoPadding }
    );
    return wordsToBytes(c.ciphertext.words, 16);
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

// GF(2^128) 乘法（NIST SP 800-38D Algorithm 1：Z=0, V=X，逐位扫 Y）
function gfMult(x, y) {
    let vh = (BigInt(asUint32(x, 0)) << 32n) | BigInt(asUint32(x, 4));
    let vl = (BigInt(asUint32(x, 8)) << 32n) | BigInt(asUint32(x, 12));
    let zh = 0n, zl = 0n;
    for (let i = 0; i < 128; i++) {
        if ((y[i >> 3] >> (7 - (i & 7))) & 1) { zh ^= vh; zl ^= vl; }
        const lsb = vl & 1n;
        vl = (vl >> 1n) | ((vh & 1n) << 63n);
        vh >>= 1n;
        if (lsb) vh ^= 0xe100000000000000n;
    }
    const out = new Uint8Array(16);
    writeU64(out, 0, zh); writeU64(out, 8, zl);
    return out;
}

function asUint32(b, at) {
    return (((b[at] << 24) | (b[at + 1] << 16) | (b[at + 2] << 8) | b[at + 3]) >>> 0);
}

function writeU64(out, at, v) {
    let x = BigInt.asUintN(64, v);
    for (let i = 7; i >= 0; i--) { out[at + i] = Number(x & 0xffn); x >>= 8n; }
}

function xor16(a, b) {
    const out = new Uint8Array(16);
    for (let i = 0; i < 16; i++) out[i] = a[i] ^ b[i];
    return out;
}

function inc32(counter) {
    const out = new Uint8Array(counter);
    let v = (((out[12] << 24) | (out[13] << 16) | (out[14] << 8) | out[15]) >>> 0) + 1;
    out[12] = (v >>> 24) & 255; out[13] = (v >>> 16) & 255; out[14] = (v >>> 8) & 255; out[15] = v & 255;
    return out;
}

/** 64 位大端写入（不用 >>>：JS 位运算是 32 位，>32 位位移会回绕） */
function writeBe64(out, at, v) {
    for (let i = 0; i < 8; i++) out[at + i] = Math.floor(v / Math.pow(2, 56 - i * 8)) % 256;
}

/** AES-GCM 加密（对齐 Java "AES/GCM/NoPadding" + GCMParameterSpec(128, iv)）：返回 ct+tag(16)。 */
function aesGcmEncrypt(keyBytes, ivBytes, plainBytes) {
    // J0：iv 为 12 字节 → IV || 0^31 || 1
    let j0;
    if (ivBytes.length === 12) {
        j0 = concatBytes(ivBytes, new Uint8Array([0, 0, 0, 1]));
    } else {
        // 其他长度：GHASH(iv) 计算 J0（麦动恒为 12 字节，此分支为完备性保留）
        const h = aesEcbBlock(keyBytes, new Uint8Array(16));
        const padIvLen = Math.ceil((ivBytes.length + 8) / 16) * 16;
        const buf = new Uint8Array(padIvLen);
        buf.set(ivBytes, 0);
        writeBe64(buf, padIvLen - 8, ivBytes.length * 8);
        j0 = new Uint8Array(16);
        for (let i = 0; i < padIvLen; i += 16) j0.set(gfMult(h, xor16(j0, buf.subarray(i, i + 16))), 0);
    }
    const h = aesEcbBlock(keyBytes, new Uint8Array(16));

    // CTR 加密：CB1 = J0，CBn = inc32(CBn)；密文 = plain ⊕ E(CBn)，n 从 2 起
    const ct = new Uint8Array(plainBytes.length);
    let cb = inc32(j0);
    for (let off = 0; off < plainBytes.length; off += 16, cb = inc32(cb)) {
        const ks = aesEcbBlock(keyBytes, cb);
        const n = Math.min(16, plainBytes.length - off);
        for (let i = 0; i < n; i++) ct[off + i] = plainBytes[off + i] ^ ks[i];
    }

    // GHASH：A（麦动无 AAD）|| C || len 块
    const cBlocks = Math.ceil(ct.length / 16) * 16;
    const totalLen = cBlocks + 16;
    const gbuf = new Uint8Array(totalLen);
    gbuf.set(ct, 0);
    writeBe64(gbuf, totalLen - 8, ct.length * 8);
    let s = new Uint8Array(16);
    for (let i = 0; i < totalLen; i += 16) s = gfMult(h, xor16(s, gbuf.subarray(i, i + 16)));

    // tag = E(J0) ⊕ S
    const tag = xor16(aesEcbBlock(keyBytes, j0), s);
    return concatBytes(ct, tag);
}

// ============================ MuseCrypto（RSA 桥） ============================

/** RSA 公钥（X509EncodedKeySpec），来自 ug1.java:166。 */
const PUB_KEY_B64 =
    'MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAucL0oFErd7REM6TSNa3EZdN1YaOs4J1eCybLPyoQ9ru3q1HU67agC9FzhrCG/RvAQUya5iPmQ8Caed05vqcCVcyJChmkSOGQ7DVShe2rGuTMNlpoRV6UzfcraaVS++7m2K/+kSZJ8OAhhhVuqPruMjsFYpdtstAwvyZT28b+eENwzpp9UHqsooZc7FZ0H8kTbs6XMkw4nIWo+4HoPAhNLEY+xdHvwY6drF/3WDTvsaoMrs73TVQCEEHzZNIz2H/is9VLMnIyOfnfcJi9br78Fj2xHzxu3sAySBOTVLmUMxqYh/g1ox5OXGcW93HJkQLkBi42tFAEkWYlYyl93+jbbQIDAQAB';

/** RSA 私钥（PKCS8EncodedKeySpec），来自 ug1.java，用于解 encrypted_key。 */
const PRIV_KEY_B64 =
    'MIIEowIBAAKCAQEAv9MSfzJzk56tWGfp+Ir1I41uMA0TN/kulaPgLpXLnHGVr59r+4nDD2kpCj2eMvLl9J3m+RiFSURzPcBJTUMjhIIo0ZxGrk73THxqejFU4APEFLKC2b7yfA2BferkiAcHG1qv2qpePNP9EV/8Mw6fuHcmbkPNneJtdlVSsYakjtSjti6pIIPBNabV7GFLVy7CKsTmEgYxlSdgxJ2e3HuV+RdeiCbyqXiCvXVfzq4eMc9q4HzcvvCf2ivlHqjed9ILljUgxKN+dhw912rx+quQIFL8uyrHdWR0tKBUvrXMH6KZRkKRyxTdTttCMDYU9SwMluke1Zk8zZP5LZGTIyIPVQIDAQABAoIBAAa5JifRI93jrN2xXrD4ZdkmJtuGScsnb6uM/9mCJI3KKV3rb4R0cqLCo86ZFEdi3g5xzluisWE9BfD/IVKU7NTDHx0hphSL7fz/S1gXDIuBdkjnbNCm8abJbmV0aygdXvFlf05htEXbhD4sqBE+DPkRLAanV7iV7BI+sVRJjND4sVHavGdj7U20x2W8cltLGbpVtIRfr897gRX1WK98TdwS9rPMelvE4+62YI4Cho4PMgAajoDUch7J42+43KW+VsXZq9p2DkexPEORbrypZk4YV0HGoUz1uQJ6CBDAjT+wjJvO7IUdU0wdo0OFN6iXc4ixd1yHU0c5e1wcET4kDq0CgYEA+mElcnHylEC1wrz2VnJUChNsy6+jb83eYiDWC5EQobsTVt8XcLmQJDtLPj5kekLPjb2h1OkLv1BPDPZPm7gZ6FT7ns23/opUt42pCF1phO1LOsAEp98FVa7COliJMuYtck8GedJCRW+CdiU2J3qCyQ/rdWA+kt9iWE6b1TSVkKcCgYEAxCFttmOi0ZviWh8NVBnafmxU/70xz1tBWk+yxiJny4Vc/eEZhUDK3kYrjNi4lNKbjWqRLulKv2luCcvP6dsjLu+YDNDs+jWc9KUuGKK0LAWZKQ8cazIs+OKIj46PyeasSV0m4bEQ9Y1wRUha2cYZs9o+aHvaaB0kE+68+YjDA6MCgYB6mfU3PBq3g5Q9HkBVhjgmkup0NrYF+j3JuSB2m3sUZsGKiUU2Gnc9dpdajDyxLWPqmQ/UbKUm8hEzXK0QqC5veKWZVkyhZGUlWEWL5gnUYEm1I+9jsC4xjZhn75CHDvT0A0Q9hLqUu4ybg48n97Jw982pNQ6O5rmGWj+uP8h5AwKBgAtM4cVgeEEbei83Gs19r9kY5MzXWcdYuqs5bFN+J/zR8kmubon+8bFc2aWD1x68A7piKXtKdcQRjwWBeLlApwZNR7V1VDIWZLSzz7Qbq8XdjLWQ6VJD0dOFOdkLnb1ETSjs9RCL4y5Ct/VF9fYWM+To7i+W8z6Mb0e2uaym9JWBAoGBAJFGwm699KrWTIMCCR6ZNHjEQBA0HJfsGVW9RW7VsocmoXazN/+raZ9q9IoDrg8kPpMrH9cyxDWtUTO8r5bEUiusHl3VeZp+LILARXcfOHxGGopc7KhzgdS3bG7ApBb39cdBuhiEMgPcWavCWbsmGOlU5UefUXtY5BhzW1yZv58r';

const PEM_PUB = '-----BEGIN PUBLIC KEY-----\n' + PUB_KEY_B64 + '\n-----END PUBLIC KEY-----';
const PEM_PRIV = '-----BEGIN PRIVATE KEY-----\n' + PRIV_KEY_B64 + '\n-----END PRIVATE KEY-----';

/** RSA 公钥加密，返回 Base64 字符串（宿主 rsaEncrypt：RSA/ECB/PKCS1）。 */
function rsaEncryptB64(plain) {
    const r = rsaEncrypt(plain, PEM_PUB, { config: 'RSA/ECB/PKCS1Padding', type: 1, long: 1 });
    if (!r) throw new Error('rsaEncrypt 失败');
    return r;
}

/** RSA 私钥解密 Base64 密文 → 字节。 */
function rsaDecryptB64(b64) {
    const r = rsaDecrypt(b64, PEM_PRIV, { config: 'RSA/ECB/PKCS1Padding', type: 1, long: 1 });
    if (!r) throw new Error('rsaDecrypt 失败');
    return b64ToBytes(r);
}

// ============================ 工具 ============================

/** java.net.URLEncoder.encode(s, "UTF-8") 语义：空格→'+'，[a-zA-Z0-9._*-] 保留。 */
function javaUrlEncode(s) {
    const out = [];
    const bytes = utf8ToBytes(String(s));
    for (let i = 0; i < bytes.length; i++) {
        const b = bytes[i];
        const c = String.fromCharCode(b);
        if ((b >= 0x41 && b <= 0x5a) || (b >= 0x61 && b <= 0x7a) || (b >= 0x30 && b <= 0x39)
            || b === 0x2e || b === 0x2d || b === 0x2a || b === 0x5f) out.push(c);
        else if (b === 0x20) out.push('+');
        else out.push('%' + c.charCodeAt(0).toString(16).toUpperCase().padStart(2, '0'));
    }
    return out.join('');
}

function randBytesJ(len) {
    return randomBytes(len);
}

function concat(a, b) {
    return concatBytes(a, b);
}

// ============================ MuseApi 会话管理 ============================

/** 会话对象必须跨调用持久：登录链 post() 收集的 Set-Cookie 与 deviceId 都落在
 *  同一对象上。过期重登交给 ensureLogin 判定（expireAt!=0 且已到期才清空重建）。 */
const session = { deviceId: null, cookies: {}, expireAt: 0 };

function post(urlStr, body, withCookie) {
    const headers = {
        'Content-Type': 'application/json; charset=UTF-8',
        'User-Agent': UA,
    };
    if (withCookie) {
        const parts = [];
        for (const k of Object.keys(session.cookies)) parts.push(k + '=' + session.cookies[k]);
        if (parts.length > 0) headers['Cookie'] = parts.join('; ');
    }
    const res = req(urlStr, { method: 'post', headers: headers, body: body, timeout: 30000 });
    // 收集 Set-Cookie（okhttp 头键原样大小写，兼容小写）
    const hs = res.headers || {};
    for (const key of Object.keys(hs)) {
        if (String(key).toLowerCase() === 'set-cookie') {
            const vals = String(hs[key]).split('\n');
            for (const v of vals) {
                const kv = v.split(';')[0];
                const eq = kv.indexOf('=');
                if (eq > 0) session.cookies[kv.substring(0, eq).trim()] = kv.substring(eq + 1).trim();
            }
        }
    }
    const result = res.content || '';
    if (!result) {
        // 壳 req 无状态码：连接失败/非 2xx 空体统一按 http 500 处理（信封缺 status 的口径）
        throw new Error('http 500: ' + result.substring(0, Math.min(200, result.length)));
    }
    return result;
}

/** 确保已登录（conf/get → device-id/get → login → box-info/create）。 */
function ensureLogin() {
    if (session.deviceId && Object.keys(session.cookies).length > 0 && Date.now() < session.expireAt) {
        return;
    }
    session.cookies = {};

    // 1. conf/get
    post(MCONN + '/v2/muse/conf/get', JSON.stringify({ device_id: '' }), false);

    // 2. device-id/get
    const devPayload = JSON.stringify({ channel: CHANNEL, mode: MODE });
    const devReq = JSON.stringify({ data: MuseCryptoRsaEncB64(devPayload) });
    const devResp = JSON.parse(post(MCONN + '/v3/device-id/get', devReq, false));
    session.deviceId = devResp.device_id;

    // 3. login（AES-GCM + RSA）
    const iv = randBytesJ(12);
    const loginInfo = {
        device_id: session.deviceId,
        device_ids: [session.deviceId],
        signature: SIGNATURE,
        channel: CHANNEL,
        model: MODEL,
        vc: VC,
        vn: VN,
        mode: MODE,
        s1: MODEL,
        s2: 'generic',
        s3: 'amlogic',
        s4: 'mbox',
        s5: 'mbox',
        s6: 'Generic',
        s7: S7,
        s8: S8,
        s9: md5Hex(session.deviceId),
        sa: SA,
        nonce: bytesToB64(iv),
        sb: '0',
    };
    const aesKey = randBytesJ(16);
    const plain = utf8ToBytes(JSON.stringify(loginInfo));
    const encData = aesGcmEncrypt(aesKey, iv, plain);
    const loginReq = {
        encrypted_data: bytesToB64(concat(iv, encData)),
        encrypted_key: rsaEncryptB64(bytesToB64(aesKey)),
    };
    post(MCONN + '/v3/login', JSON.stringify(loginReq), true);

    // 4. box-info/create（取流前必须调用）
    const box = {
        abi: 'armeabi-v7a',
        android_id: session.deviceId,
        battery: 100,
        board: 'mbox',
        brand: 'generic',
        cpu: 'armv7',
        device: 'mbox',
        device_id: session.deviceId,
        mac: '',
        manufacturer: 'Generic',
        model: MODEL,
        network: 'ethernet',
        os_version: '7.1.2',
        product: 'mbox',
        ram: '1GB',
        resolution: '1280x720',
        rom: '8GB',
        screen: 'tv',
        serial: session.deviceId,
    };
    post(MCONN + '/v3/box-info/create', JSON.stringify(box), true);

    session.expireAt = Date.now() + 6 * 60 * 60 * 1000; // 6 小时
}

/** device-id/get 请求体（data = RSA 公钥加密载荷）。 */
function MuseCryptoRsaEncB64(plain) {
    return rsaEncryptB64(plain);
}

// ============================ 业务接口（MuseApi.java） ============================

/** 分页获取歌曲列表，keyword 非空时为搜索。
 *  服务端只匹配歌名与拼音首字母（name_cap）的子串，不匹配歌手名
 * （实测「歌名 歌手」合体词恒 0 命中，纯歌名才命中；传歌手名时改走 getSingers）。 */
function getSongs(keyword, pageIndex, pageCount) {
    ensureLogin();
    const r = {};
    if (keyword != null && keyword !== '') r.keyword = keyword;
    r.page_index = pageIndex;
    r.page_count = pageCount;
    const resp = JSON.parse(post(MCONN + '/v3/song/get-page', JSON.stringify(r), true));
    return parseSongs(resp);
}

/** 按歌手查歌曲列表。 */
function getSongsBySinger(singerId, pageIndex, pageCount) {
    ensureLogin();
    const r = { singer_id: singerId, page_index: pageIndex, page_count: pageCount };
    const resp = JSON.parse(post(MCONN + '/v3/song/get-page', JSON.stringify(r), true));
    return parseSongs(resp);
}

/** 分页获取歌手列表，keyword 非空时为歌手搜索。 */
function getSingers(keyword, pageIndex, pageCount) {
    ensureLogin();
    const r = {};
    if (keyword != null && keyword !== '') r.keyword = keyword;
    r.page_index = pageIndex;
    r.page_count = pageCount;
    const resp = JSON.parse(post(MCONN + '/v3/singer/get-page', JSON.stringify(r), true));
    const list = resp.list;
    if (!list) return [];
    return list.map((s) => ({
        id: s.id || '',
        name: s.name || '',
        image: s.image_url || '',
        type: s.type || '',
    }));
}

function parseSongs(resp) {
    const list = resp.list;
    if (!list) return [];
    return list.map((s) => {
        let singer = '';
        let singerImg = '';
        const singers = s.singers;
        if (singers && singers.length > 0) {
            const sg = singers[0];
            singer = sg.name || '';
            singerImg = sg.image_url || '';
        }
        return {
            id: s.id || '',
            tid: s.tid || '',
            name: s.name || '',
            singer: singer,
            singerImage: singerImg,
        };
    });
}

/** 获取歌曲播放直链 + 解密密钥（MuseApi.getStream，Java 主链路未走，保留对齐）。 */
function getStream(tid) {
    ensureLogin();
    const nonce = bytesToB64(randBytesJ(12));
    const payload = {
        tid: tid,
        fid: '',
        dyn_val: '',
        nonce: nonce,
        timestamp: Date.now(),
        algorithm_version: 1,
    };
    const reqJson = JSON.stringify({ encrypted_data: rsaEncryptB64(JSON.stringify(payload)) });
    const resp = JSON.parse(post(PROXY, reqJson, true));
    let key16 = '';
    const ek = resp.encrypted_key || '';
    if (ek) {
        key16 = bytesToUtf8(rsaDecryptB64(ek));
    }
    return { url: resp.url || '', fid: resp.fid || '', key16: key16 };
}

/** 下载完整文件（用于代理解密）。 */
function downloadFull(urlStr) {
    const res = req(urlStr, {
        method: 'get',
        headers: { 'User-Agent': UA, 'Accept': '*/*' },
        buffer: 2,
        timeout: 60000,
    });
    const content = res.content || '';
    if (!content) throw new Error('download http error');
    return b64ToBytes(content);
}

// ============================ CleanHttp（裸 Socket 的 JS 替代） ============================
//
// Java 版手写 HTTP/1.1 裸 Socket（仅 Host+Accept 两头过麦动网关风控）。JS 宿主
// req 无法抑制栈默认头（okhttp/fetch 必带 UA/Connection 等），本实现以「不显式
// 带 UA + Accept: \*\/\*」尽力对齐；返回信封口径不变 {"status","body","error"}：
// status=0 表示连接层失败；壳 req 无状态码，content 空按 0、非空按 200 启发式。

function cleanGet(url, timeoutMs) {
    try {
        const res = req(url, {
            method: 'get',
            headers: { 'Accept': '*/*' },
            timeout: clampTimeout(timeoutMs),
        });
        const body = res.content || '';
        return { status: body ? 200 : 0, body: body };
    } catch (e) {
        return { status: 0, body: '', error: e && e.message ? String(e.message) : String(e) };
    }
}

function clampTimeout(timeoutMs) {
    if (timeoutMs < 1000) return 1000;
    return Math.min(timeoutMs, 30000);
}

// ============================ SongGateway（第三方取流网关） ============================
//
// 协议两步握手：
//   1) GET {host}/i.php?appid&mac&sn&time&ver&vn&sign=md5(params+APP_KEY)  → token
//   2) GET {host}/music/do.php?appid&device&ish265&ls&musicno&resolution&sn&time&token&sign=md5(params+SDK_KEY)
//      → {"code":200,"data":"http://download.origjoy.com/E/ts/.../{musicno}.ts?sign=..."}
//
// 风控三铁律（源站行为，必须遵守）：
//   a) 必须走干净请求（仅 Host+Accept），带 UA 即 403 —— JS 宿主尽力对齐（见 cleanGet 注释）；
//   b) 陌生出口 IP 有约 10 分钟试用窗，403「检测到异常行为」= 换公网 IP，与 token 无关；
//   c) token 恒定不变：失败时同 token 短退避重试，不清 token 重取 i.php（不放大请求量）。
//
// 多源动态排序：解析成功的源置顶、失败的沉底（与 maidong 原版 hostOrder 行为一致）。

// 与 maidong-ktv assets/mobile/ktv_api.js CONFIG 一致的公开凭证。
const GW_APP_ID = 'd4eeacc6cec3434fbc8c41608a3056a0';
const GW_APP_KEY = '024210cba40d4385a93e6c2d3249bfb5';
const GW_SDK_KEY = '19042303a8374f67ae3fe1e25c97936f';
const GW_VER = '2.0';
const GW_VN = '4.1.3.03281430';
const GW_TIMEOUT_MS = 8000;

/** 歌曲源列表（ maidong SongUrlResolver.DEFAULT_HOSTS + ktv_api.js 在用的 zk.ktv1.top:6677）。 */
const GW_DEFAULT_HOSTS = [
    'http://w.w345.my',
    'http://zk.ktv1.top:6677',
    'http://desktok.top',
    'http://mm.kk456.top',
    'http://w.w345.my:66',
    'http://z.w345.my',
    'http://b.sktv.top',
    'http://w345.my',
];

/** maidong 官方固定 SN（KtvJsBridge.DEVICE_SN）。 */
const GW_SN = '2d7bb4a7d7f8';
/** maidong DeviceMac.FALLBACK_MAC —— spider 无设备上下文，用历史抓包身份。 */
const GW_MAC = 'ae60e9547958';

/** 运行时源优先级：成功置顶、失败沉底。 */
let GW_HOST_ORDER = GW_DEFAULT_HOSTS.slice();
/** host → token 缓存（token 恒定，进程生命周期内复用）。 */
const GW_TOKENS = {};
/** 最近一次取流命中的源 host（诊断用）。 */
let GW_lastHost = '';

/**
 * 取播放直链（MPEG-TS 明文 CDN URL）。
 *
 * @param musicno    歌曲编号（曲库 songs.id）
 * @param resolution 分辨率（"720"/"1080"）
 * @param h265       是否请求 H.265
 * @return 播放直链；全部源失败返回 null
 */
function gatewayResolve(musicno, resolution, h265) {
    if (musicno == null || String(musicno).trim() === '') return null;
    const no = String(musicno).trim();
    const startedAt = Date.now();

    const hosts = GW_HOST_ORDER.slice();
    let lastDetail = 'no-source';

    for (let i = 0; i < hosts.length; i++) {
        const host = hosts[i];
        const token = fetchToken(host);
        if (token == null || token === '') {
            lastDetail = 'token-fail';
            demote(host);
            continue;
        }
        const url = fetchSongUrl(host, no, token, resolution, h265);
        if (url != null && url !== '') {
            promote(host);
            GW_lastHost = host;
            log('取址成功 编号=' + no + ' 源=' + host + ' 第' + (i + 1) + '个源 用时=' + (Date.now() - startedAt) + 'ms');
            return url;
        }
        lastDetail = 'no-url';
        demote(host);
    }
    log('全部源失败 编号=' + no + ' 详情=' + lastDetail + ' 用时=' + (Date.now() - startedAt) + 'ms');
    return null;
}

/** 第 1 步：i.php 取 token（code==200 → token 字段）。 */
function fetchToken(host) {
    const cached = GW_TOKENS[host];
    if (cached != null) return cached;
    try {
        const ts = Math.floor(Date.now() / 1000);
        const params = 'appid=' + GW_APP_ID + '&mac=' + GW_MAC + '_' + GW_SN + '&sn=' + GW_SN
            + '&time=' + ts + '&ver=' + GW_VER + '&vn=' + GW_VN;
        const url = host + '/i.php?' + params + '&sign=' + md5Hex(params + GW_APP_KEY);
        const json = gatewayGetJson(url);
        if (json == null || json.code !== 200) {
            log('token 失败 源=' + host + ' code=' + (json == null ? -1 : json.code)
                + ' msg=' + (json == null ? 'no-json' : (json.msg || '')));
            return null;
        }
        const token = json.token || '';
        if (token !== '') GW_TOKENS[host] = token;
        return token === '' ? null : token;
    } catch (e) {
        log('token 异常 源=' + host + ': ' + e);
        return null;
    }
}

/** 第 2 步：do.php 取播放地址（code==200 → data 字段 = TS 直链）。 */
function fetchSongUrl(host, musicno, token, resolution, h265) {
    try {
        const ts = Math.floor(Date.now() / 1000);
        // 参数顺序与原始 token 中的 "=" 必须与原版一致（ maidong 注释：与原 APK 对齐）。
        const params = 'appid=' + GW_APP_ID
            + '&device=' + GW_MAC + '_' + GW_SN
            + '&ish265=' + (h265 ? '1' : '0')
            + '&ls=1'
            + '&musicno=' + musicno
            + '&resolution=' + resolution
            + '&sn=' + GW_SN
            + '&time=' + ts
            + '&token=' + token;
        const url = host + '/music/do.php?' + params + '&sign=' + md5Hex(params + GW_SDK_KEY);
        const json = gatewayGetJson(url);
        if (json == null) return null;
        const code = json.code;
        if (code !== 200) {
            log('do.php 源=' + host + ' code=' + code + ' msg=' + (json.msg || ''));
            return null;
        }
        const data = json.data || '';
        return data === '' ? null : data;
    } catch (e) {
        log('do.php 异常 源=' + host + ': ' + e);
        return null;
    }
}

/** 解析 cleanGet → JSON body；非 2xx/非 JSON 返回 null。
 *  双形态兼容：Java CleanHttp 裸 Socket 信封 {"status","body","error"}，宿主 req 直连
 *  响应体即业务 JSON（无 status/body 包装字段）。 */
function gatewayGetJson(url) {
    const raw = cleanGet(url, GW_TIMEOUT_MS);
    let envelope = null;
    try {
        envelope = JSON.parse(raw.body);
    } catch (e) {
        envelope = null;
    }
    if (envelope && typeof envelope.status === 'number' && typeof envelope.body === 'string') {
        // CleanHttp 信封形态（Java 裸 Socket 口径）
        const status = envelope.status;
        if (status < 200 || status > 299) {
            log('HTTP ' + status + ' ' + hostOf(url) + ' err=' + (envelope.error || ''));
            return null;
        }
        const body = envelope.body;
        if (String(body).trim() === '') return null;
        try {
            return JSON.parse(body);
        } catch (e) {
            log('响应非 JSON: ' + String(body).substring(0, Math.min(body.length, 120)));
            return null;
        }
    }
    // req 直连形态：响应体即业务 JSON
    if (raw.status < 200 || raw.status > 299) return null;
    return envelope;
}

function hostOf(url) {
    const m = /^https?:\/\/([^/:?#]+)/.exec(String(url));
    return m ? m[1] : '';
}

function demote(host) {
    const idx = GW_HOST_ORDER.indexOf(host);
    if (idx >= 0 && idx < GW_HOST_ORDER.length - 1) {
        GW_HOST_ORDER.splice(idx, 1);
        GW_HOST_ORDER.push(host);
    }
}

function promote(host) {
    const idx = GW_HOST_ORDER.indexOf(host);
    if (idx > 0) {
        GW_HOST_ORDER.splice(idx, 1);
        GW_HOST_ORDER.unshift(host);
    }
}

// ============================ ThunderDecrypt（加密 TS 解密） ============================
//
// 文件格式：512 字节明文头 + 加密/明文交错的 TS 数据流。
//   header[0]     != 0x47 表示加密文件
//   header[53]&0x0f  密钥序号（0-15）
//   header[452]      段大小（KB，×1024 = 字节）
//   header[453]      模式（必须 0 = AES/ECB/NoPadding）
//   header[454]      加密间隔（0 = 全加密；否则段 firstEncryptedSegment 及之后每 interval 段中第 1 段加密）
//   header[457]      首个加密段序号
//   header[500..512] 签名：THUNDERCRYP3 / HHCMUSECRYP1 / HHCMUSECRYP2 → 对应密钥表

const TH_HEADER_SIZE = 512;
const TH_SIGS = ['THUNDERCRYP3', 'HHCMUSECRYP1', 'HHCMUSECRYP2'];

const TH_KEY_TABLES = [
    [ // THUNDERCRYP3
        'c6d3cdd0f1ebf5ded4d7d3cebbd3dad2cecdd0b8deaccbead2c5cac3c2dba6ac',
        'f5deebd8d3ced7b9dad2d3d8d0bcd9f6cbd7c9c2cab1d0f0a6f8d0afd0d3b9d4',
        'c3d4d7b2c2d5aaeecbd3b7dcbcc6b4f4b7d4b2b2fed5e0cbd3d5b2d7c6b7cef3',
        'b6bdaea7ced2d2b4aac1bbd3cbc8b7d6aacbbdaecbd4cbb5f9daddc0cecbe4d7',
        'd7d3d4dde8cedaf3c7b4cbddd2d3aee7f5d6d6b2d2aed0c9cbcddbb2ddf0e6c9',
        'b4d3d3b0d9d6cbe2e2aeaea2d6b8c7b2c3c9e5bbd6d9c7bcaee2d2dababac1b2',
        'd9d6cbe2e2aeaea2d6b2c7b2c3e0e5bbd6d9c7bcaee2d2dababad6b2d3d3b1bb',
        'e2aeaea2d69dc7b2c35fe5bbd6d9c7bcaee2d2dababac2b2d3d3d9bbd6cbe2f0',
        '97bbecd2fab782f0c1d0f6b3bab2c8a9dec7d0ec62fdf8b1d3d2cebccef5c4dd',
        'eadcd4eecad6d3bec7ae81fde6badcd7eecf98d3c1f6d1cefac8d4c2b6d2c4c6',
        'e7bed4c1b5fdd8bcbfd7d0c867d3cbcbd1d4d1d6d4d8e1c8c4c7d1d6eedee1c8',
        'f2b1c8bdbbd4cfeff1b0d0f0d3cbddd4cec492d8d3c2b3e1daedb5fdb1bcf0d0',
        'd3cdd2d6d2f5d1dc81c1b3ba90eec2ee81cecece90c5fdc4ceb2d4cdc4bbd5f5',
        'f5cbaee0b9c9e8cafafae5bfcdcebccef5acc3c4b9d6bccdfadcc3f5bfd6b6d2',
        'd6d3c3b7dcdad2f4b7d6b3c3fedca3f4baccd2c2eeecf3e3b7c3cabdfefcbfab',
        'e0b4e4f8b8c9c9d3a3a5cfdad2cab5d2f3a6dbf3d6bfd2bfaecbcba5cec5bcc3',
    ],
    [ // HHCMUSECRYP1
        'd7cad2d3d3b1e0d0d4cfcbc5bbb0b5f3d1d6d4d7a7aec3d4b6b2bad4f8bbf5b6',
        'd3cfd2d0b2b6d5d2bbf8dfb2babacebec3c3b4fdb7d7d6d7b8f7aed3c9c2d3ce',
        'cec4babde1b1f5bbc9b6d3b6edf8ebf8ceb2c5b2aabbf3bbc8d6d3d0cbd2d1c5',
        'f6f8dad0d4d0b6d3f2c5f8d0b5b7c7d3dcbad7e0bdb0c8c1f7aecaa6b6d6d0d4',
        'd4b1d2d7bbd8d3d3ceced7b2b4bdd3bbd1d6d4d6a7aebbd8ced1bed4e1a7fdf2',
        'd3d3d3eec7b9d6d2ddb1c1b2ced4d3b1cabbdad8d3b7cacedaf2c7c5d7d7b0c6',
        'd6d7b9c3aed3dbbbc7d4c6b9f3bbe4dbd6b8d6c6aeb8bee4d3d4b8d0ebdab8d0',
        'd0aabbaecbbad2d2f9cdd4e0b2b6c0b2bbf8f1bbd0babdbfd0cddac9d6b2d6d0',
        'd7b1b0b6d3a5b2f8cabec3c9b3d3f4f7ceced3d3dededadac7c7cad1f3f3c2d4',
        'f8c3d3c6c0c0b9c8d6f1b1e7b8d5d4c7bbdfbbd0b6d2cac8f8b2abe7bad7d4b4',
        'd6bbd2d5aebcb2feb2b2d7d2bbbbd3d4bcd6d4b5baaabbc2d6c8cec6aacbaaa9',
        'aee2c0ebd2b6d6d6d4f8aeaed0ced2d2ccded4d4c3b3b5c0f1dcc2f1c3b5c6d3',
        'cbb4b2dcb3d3bbb2c6d0d3d7dfc4e2d3cacbbeceaef9d8cab6d3c3d0f8fbcfa2',
        'aee1c0cfd2d6d6ced4aeaee4c0d2d2b2f1d4d4aecbc0c0cec0f1f1cad4bcc3d0',
        'bebad0c4b4f5a2d1bad7d7d3ced3d3d0d2cfd4cad4c4bbc2b1cec9b5f0caabdc',
        'bda2dee4d2bbd7cbe0d8d3f9d7d2d4d2e3b2bbd4d2b2cab9d4bbd3dbb7d3c6c6',
    ],
    [ // HHCMUSECRYP2
        'b1b4d6d6f8f3aeaed5cab5b5dfc2d8c0b9cbb4b2fac0e6bbd6c9cdbfaefaf6c9',
        'c0dac9c9d5c9d3d3dfcfebebc1cdd6d6eeacaeaec3d2cbc9f1e2c0fad3bfbfb6',
        'd5b5b7bddfc0b2abc7d6b4c4faf7cbaad6d3ceb2c6c3e5bbb9d2d5ced9b2dfc5',
        'a8f8bfcdc1d6d7b7eedae4a3cacacacaebebebebd0c7c1c3d0bfb7f7b1cac9ce',
        'ced7d5d6aaf4dfc6d6c6d2c8aee4f2a8cacdc0d2c6e2fbb2d2cab6b1d4c6f8f8',
        'f8f8f8f8c8b1b1c4a1b8dcd3d6d6d6d6aeaeaeaecac7c5b1b5bfadb0b6b6b6b6',
        'c3b5cecbedc3b4e3cbcbd5b2e3e3bdbbcab6b6caa4e0f8a4d5d2c3d5dfb2eddf',
        'e1cbf2b8b8b4c7d4eff8a7f2b3bcc0c4b5d7efdac7cac0cda7aea1e2b3cdc1d6',
        'b6b9c7d4dba5fcf2b1b3beb9f8c7c3fab4d4b1d3ecf2a9c3c8c1cab2f1a6a6bb',
        'd9aef8fbcebebed5b4c3c3dfb6d2b6cec3b2f8b4c7b7b9d6c9f2faaed6b1c0d3',
        'c8d2b9d7a1f2cae3d3c1bed2c3b8fcb2d3d3cab9dadab3fab9b5bfd6fad0c9ae',
        'a6dad9aec7d0d0c8fce9d5a5d6d3d6c6d0daaee4d4bcb7c6add2d1dfc4b0cab9',
        'd2b6b8cebbfed1e1d6cad2b6d3aebbfeb5d6cacab1d3afaecebdb5cae1d9b1af',
        'd3e4aed0b6c9cab6f8c6c7f8b3b6ced2cbf8bde6d6d1cac7aef8a4bfd7d6b5b9',
        'b9bebec2fafcfcc3b4ceb4ceceaaceaad6c9d6c9aecfaecfc8c6c8c6abc6abc6',
        'f8f8dff8c7c9d2b7fcc6b2a5c8d6b9c4cbaecab1d6c9c9c6aec6cfe4b1d5b1b4',
    ],
];

/** 是否为 Thunder 加密文件（前 512 头判定；null/过小/明文 0x47 → false）。 */
function thunderIsEncrypted(file) {
    if (file == null || file.length < TH_HEADER_SIZE) return false;
    if ((file[0] & 0xff) === 0x47) {
        // 明文 TS 也可能带"头"（isEncrypted 语义与原版对齐：0x47 开头但 500 处有签名也算加密）
        const sig = thunderAscii(file, 500, 12);
        for (const s of TH_SIGS) if (s === sig) return true;
        return false;
    }
    return true;
}

/** 解密完整文件（含 512 头）→ 明文 TS；未加密原样去头返回。 */
function thunderDecryptAll(file) {
    if (file == null || file.length <= TH_HEADER_SIZE) throw new Error('file too small');
    if (!thunderIsEncrypted(file)) {
        return file.subarray(TH_HEADER_SIZE, file.length);
    }

    const sig = thunderAscii(file, 500, 12);
    let tableIdx = -1;
    for (let i = 0; i < TH_SIGS.length; i++) {
        if (TH_SIGS[i] === sig) { tableIdx = i; break; }
    }
    if (tableIdx < 0) throw new Error('Unknown Thunder signature: ' + sig);

    const keyIdx = file[53] & 0x0f;
    const segmentSize = (file[452] & 0xff) * 1024;
    const mode = file[453] & 0xff;
    const interval = file[454] & 0xff;
    const firstEnc = file[457] & 0xff;
    if (segmentSize <= 0) throw new Error('Invalid segment size ' + segmentSize);
    if (mode !== 0) throw new Error('Unsupported Thunder mode ' + mode);
    if (keyIdx < 0 || keyIdx > 15) throw new Error('Invalid key index ' + keyIdx);

    const keyBytes = hexToBytes(TH_KEY_TABLES[tableIdx][keyIdx]);

    const body = file.subarray(TH_HEADER_SIZE, file.length);
    const segs = Math.ceil(body.length / segmentSize);
    for (let seg = 0; seg < segs; seg++) {
        const off = seg * segmentSize;
        const len = Math.min(segmentSize, body.length - off);
        const enc = interval === 0 || seg === firstEnc || (seg > firstEnc && seg % interval === 1);
        if (!enc || len < 16) continue;
        const el = len - (len % 16);
        const dec = thunderAesEcbDecrypt(body.subarray(off, off + el), keyBytes);
        body.set(dec, off);
    }

    if ((body[0] & 0xff) !== 0x47) {
        log('Thunder 解密校验失败 sig=' + sig + ' keyIdx=' + keyIdx);
        throw new Error('Decrypted TS validation failed');
    }
    return body;
}

/** AES/ECB/NoPadding 解密（CryptoJS，块对齐入参）。 */
function thunderAesEcbDecrypt(data, keyBytes) {
    const ct = CryptoJS.lib.WordArray.create(bytesToWords(data), data.length);
    const key = CryptoJS.lib.WordArray.create(bytesToWords(keyBytes), keyBytes.length);
    const dec = CryptoJS.AES.decrypt({ ciphertext: ct }, key, { mode: CryptoJS.mode.ECB, padding: CryptoJS.pad.NoPadding });
    return wordsToBytes(dec.words, data.length);
}

function thunderAscii(b, off, len) {
    if (b.length < off + len) return '';
    let s = '';
    for (let i = 0; i < len; i++) s += String.fromCharCode(b[off + i] & 0xff);
    return s.trim();
}

// ============================ LyricFetcher（歌词获取） ============================
//
// 歌词获取（网易云公开接口，按歌名+歌手匹配）。
//
// mad-api 曲库不下发歌词（maidong 原版在线播放同样无歌词，仅下载场景带 lrc sidecar）。
// 这里用 music.163.com 旧公开接口按「清洗后歌名 + 歌手」搜索匹配，取 LRC 文本；
// 接口无需加密（Cookie appver + Referer 即可），失败/未命中返回空串不影响播放。
//
// 匹配规则（K歌曲库歌名带修饰后缀，需清洗）：
//   歌名清洗：去 (...)【…】块、去尾部 HD/高清 修饰、trim；
//   命中：歌名归一化相等（优先）或互相包含，且歌手包含命中（歌手为空时仅歌名）。

const LYRIC_UA = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36';
const LYRIC_TIMEOUT_MS = 5000;
/** songKey → LRC 缓存（含空结果防重复打接口）。 */
const LYRIC_CACHE = new Map();

/** 取 LRC（同步，网络 2 趟请求；失败/未命中返回 ""）。 */
function lyricFetch(songName, singer) {
    const clean = lyricCleanName(songName);
    if (clean === '') return '';
    const key = clean + '|' + (singer == null ? '' : singer);
    if (LYRIC_CACHE.has(key)) return LYRIC_CACHE.get(key);

    const lrc = lyricDoFetch(clean, singer == null ? '' : String(singer).trim());
    lyricCachePut(key, lrc);
    return lrc;
}

function lyricDoFetch(name, singer) {
    try {
        const query = singer === '' ? name : name + ' ' + singer;
        const searchResp = lyricHttpGet('https://music.163.com/api/search/get/web?s='
            + javaUrlEncode(query) + '&type=1&offset=0&limit=10');
        if (searchResp === '') return '';
        const root = JSON.parse(searchResp);
        const songs = root.result ? root.result.songs : null;
        if (!songs) return '';

        let matched = 0;
        for (const s of songs) {
            if (!s) continue;
            const n = s.name || '';
            const artist = lyricJoinArtists(s);
            const nameOk = lyricNorm(n) === lyricNorm(name)
                || lyricNorm(n).indexOf(lyricNorm(name)) >= 0
                || lyricNorm(name).indexOf(lyricNorm(n)) >= 0;
            const artistOk = singer === '' || artist.indexOf(singer) >= 0;
            if (nameOk && artistOk) {
                matched = s.id || 0;
                break;
            }
        }
        if (matched <= 0) return '';

        const lyricResp = lyricHttpGet('https://music.163.com/api/song/lyric?os=pc&id='
            + matched + '&lv=-1&kv=-1&tv=-1');
        if (lyricResp === '') return '';
        const lrcRoot = JSON.parse(lyricResp);
        let lrc = lrcRoot.lrc ? (lrcRoot.lrc.lyric || '') : '';
        if (lrc.indexOf('暂无歌词') >= 0 || lrc.trim().length < 10) return '';
        return lrc;
    } catch (e) {
        return '';
    }
}

function lyricJoinArtists(song) {
    const sb = [];
    const arr = song.artists;
    if (arr) {
        for (const a of arr) {
            if (a) {
                sb.push(a.name || '');
            }
        }
    }
    return sb.filter((x) => x !== '').join(',');
}

/** 歌名清洗：去 (...)【…】[] 块、去尾部 HD/BD/高清/蓝光/现场 修饰词、trim。 */
function lyricCleanName(raw) {
    if (raw == null) return '';
    let s = String(raw).replace(/[（(\[【].*?[)）\]】]/g, ' ').trim();
    s = s.replace(/[\s\-_.]*(hd|bd|高清|蓝光|修复版|完整版|现场版|live)$/i, '').trim();
    return s;
}

/** 归一化：去空白 + 小写。 */
function lyricNorm(s) {
    return s == null ? '' : String(s).replace(/\s+/g, '').toLowerCase();
}

function lyricHttpGet(urlStr) {
    try {
        const res = req(urlStr, {
            method: 'get',
            headers: {
                'User-Agent': LYRIC_UA,
                'Referer': 'https://music.163.com/',
                'Cookie': 'appver=2.9.7',
            },
            timeout: LYRIC_TIMEOUT_MS,
        });
        return res.content || '';
    } catch (e) {
        return '';
    }
}

/** LRU 容量 256（对齐 Java LinkedHashMap removeEldestEntry）。 */
function lyricCachePut(key, val) {
    if (LYRIC_CACHE.size >= 256) {
        const first = LYRIC_CACHE.keys().next().value;
        if (first !== undefined) LYRIC_CACHE.delete(first);
    }
    LYRIC_CACHE.set(key, val);
}

// ============================ 主 Spider（Maidongktv.java） ============================

const PAGE_COUNT = 30;
const FLAG = '麦动K歌';

/** tid → Song 缓存（detailContent/playerContent 显示与取编号用），LRU 2048。 */
const SONG_CACHE = new Map();
/** singerId → Singer 缓存，LRU 2048。 */
const SINGER_CACHE = new Map();
/** tid → 网关取到的加密 TS 直链（proxy 下载用），LRU 64。 */
const URL_CACHE = new Map();
/** tid → 解密后的 TS 数据缓存（避免重复下载解密，最多 4 首）。 */
const TS_CACHE = new Map();

function lruPut(map, key, val, max) {
    if (map.has(key)) map.delete(key);
    map.set(key, val);
    while (map.size > max) {
        const first = map.keys().next().value;
        if (first === undefined) break;
        map.delete(first);
    }
}

function sk() {
    return typeof siteKey !== 'undefined' && siteKey ? siteKey : 'maidongktv';
}

/** 歌手 id 是 UUID（含 '-'），歌曲 id 是纯数字。 */
function isSingerId(id) {
    return id != null && id.length === 36 && id.indexOf('-') > 0;
}

function cacheSongs(songs) {
    for (const s of songs) lruPut(SONG_CACHE, s.id, s, 2048);
}

function songItem(s) {
    return {
        vod_id: s.id,
        vod_name: s.name,
        vod_pic: s.singerImage,
        vod_remarks: s.singer,
    };
}

// ============================ 首页 / 分类 ============================

function homeContent(filter) {
    try {
        const classes = [
            { type_id: 'hot', type_name: '热门歌曲' },
            { type_id: 'new', type_name: '新歌推荐' },
            { type_id: 'singer', type_name: '歌手' },
        ];
        return JSON.stringify({ class: classes });
    } catch (e) {
        log('homeContent FAIL: ' + e);
        return '';
    }
}

function categoryContent(tid, pg, filter, extend) {
    try {
        let page = parseInt(pg, 10);
        if (isNaN(page) || page < 1) page = 1;

        const list = [];
        let returned;
        if (tid === 'singer') {
            const singers = getSingers('', page, PAGE_COUNT);
            returned = singers.length;
            for (const s of singers) {
                lruPut(SINGER_CACHE, s.id, s, 2048);
                list.push({
                    vod_id: s.id,
                    vod_name: s.name,
                    vod_pic: s.image,
                    vod_remarks: s.type,
                });
            }
        } else {
            const songs = getSongs('', page, PAGE_COUNT);
            returned = songs.length;
            for (const s of songs) {
                lruPut(SONG_CACHE, s.id, s, 2048);
                list.push(songItem(s));
            }
        }
        return JSON.stringify({
            page: page,
            pagecount: returned < PAGE_COUNT ? page : page + 1,
            limit: PAGE_COUNT,
            total: list.length,
            list: list,
        });
    } catch (e) {
        log('categoryContent FAIL: ' + e);
        return '{"list":[]}';
    }
}

// ============================ 搜索 ============================

function searchContent(key, quick, pg) {
    try {
        const keyword = key == null ? '' : String(key).trim();
        if (keyword === '') return '{"list":[]}';
        let page = parseInt(pg || '1', 10);
        if (isNaN(page) || page < 1) page = 1;

        const songs = getSongs(keyword, page, PAGE_COUNT);
        const list = [];
        for (const s of songs) {
            lruPut(SONG_CACHE, s.id, s, 2048);
            list.push(songItem(s));
        }
        return JSON.stringify({
            page: page,
            pagecount: songs.length < PAGE_COUNT ? page : page + 1,
            limit: PAGE_COUNT,
            total: list.length,
            list: list,
        });
    } catch (e) {
        log('searchContent FAIL kw=' + key + ': ' + e);
        return '{"list":[]}';
    }
}

// ============================ 跨源比选（action） ============================

/**
 * 壳 MusicSession 跨源比选：其它源的歌在本源取流失败时，用
 * action(search:all:「歌名 歌手」) 在本源曲库找同曲替代。
 * 返回格式与 MusicCore.action 对齐：{"songs":[{id,name,artist,duration}]}。
 */
function actionContent(action) {
    if (action == null || action.indexOf('search:all:') !== 0) return null;
    const keyword = action.substring('search:all:'.length).trim();
    try {
        const arr = [];
        if (keyword !== '') {
            // K歌服务端只匹配歌名/拼音首字母，不含歌手名：原词搜空时按空格逐级去尾重搜，最多去 2 次
            let songs = getSongs(keyword, 1, PAGE_COUNT);
            let kw = keyword;
            for (let i = 0; i < 2 && songs.length === 0; i++) {
                const sp = kw.lastIndexOf(' ');
                if (sp <= 0) break;
                kw = kw.substring(0, sp).trim();
                if (kw === '') break;
                songs = getSongs(kw, 1, PAGE_COUNT);
            }
            log('action search kw=' + keyword + ' -> ' + songs.length + ' songs');
            cacheSongs(songs);
            for (const s of songs) {
                arr.push({
                    id: s.id,
                    name: s.name,
                    artist: s.singer,
                    duration: 0, // K歌接口无时长字段：交由壳实测探测判定
                });
            }
        }
        return JSON.stringify({ songs: arr });
    } catch (e) {
        log('action FAIL ' + action + ': ' + e);
        return '{"songs":[]}';
    }
}

// ============================ 详情 ============================

function detailContent(ids) {
    if (ids == null || ids.length === 0) return '';
    const id = String(ids[0]);
    try {
        const v = isSingerId(id) ? singerDetail(id) : songDetail(id);
        return JSON.stringify({ list: [v] });
    } catch (e) {
        log('detailContent FAIL id=' + id + ': ' + e);
        return '';
    }
}

/** 歌手详情：翻页拉全量歌曲，集数=歌曲。 */
function singerDetail(singerId) {
    const cached = SINGER_CACHE.get(singerId);
    let singerName = cached ? cached.name : '';
    const pic = cached ? cached.image : '';

    let play = '';
    let page = 1;
    const PAGE = 50, MAX_PAGES = 10; // 上限 500 首
    while (page <= MAX_PAGES) {
        const songs = getSongsBySinger(singerId, page, PAGE);
        for (const s of songs) {
            lruPut(SONG_CACHE, s.id, s, 2048);
            if (play.length > 0) play += '#';
            // 歌名里的 # / $ 会破坏 vod_play_url 分隔符，替换为全角
            const epName = String(s.name).replace(/#/g, '＃').replace(/\$/g, '＄');
            play += epName + '$' + s.id;
        }
        if (songs.length < PAGE) break;
        page++;
    }
    if (singerName === '') {
        for (const s of SONG_CACHE.values()) {
            if (s.singer !== '') { singerName = s.singer; break; }
        }
    }

    return {
        vod_id: singerId,
        vod_name: singerName === '' ? singerId : singerName,
        vod_pic: pic,
        vod_remarks: cached ? cached.type : '',
        vod_play_from: FLAG,
        vod_play_url: play,
    };
}

/** 单曲详情。 */
function songDetail(id) {
    const cached = SONG_CACHE.get(id);
    return {
        vod_id: id,
        vod_name: cached ? cached.name : id,
        vod_pic: cached ? cached.singerImage : '',
        vod_remarks: cached ? cached.singer : '',
        vod_play_from: FLAG,
        vod_play_url: '播放$' + id,
    };
}

// ============================ 播放 ============================

function playerContent(flag, id, vipFlags) {
    try {
        // 麦动 musicno 为纯数字；异源 uid（netease_xxx 等）串入时直接报错返回，
        // 避免拿异源 id 白打一趟登录+取流接口
        if (id == null || (!/^\d+$/.test(String(id)) && !isSingerId(id))) {
            log('playerContent skip foreign id=' + id);
            return errorResult(flag, '非麦动K歌曲目');
        }
        // 预取直链（触发网关 i.php/do.php），确保 proxy 时缓存命中。
        // 直链是 Thunder 加密 TS（512 头 + AES/ECB 分段），不能直接交给播放器，
        // 必须经 proxy() 本地解密后回吐明文 TS（与欢唱K歌同模式）。
        // id 允许 UUID（曲库 id，K歌页/详情页vod_id）与纯数字（网关编号）两种，resolveUrl 统一映射。
        const url = resolveUrl(String(id));
        if (url == null) {
            return errorResult(flag, '取流失败：全部源不可用（源站风控 403 需更换公网 IP）');
        }
        const song = SONG_CACHE.get(String(id));
        return JSON.stringify({
            parse: 0,
            playUrl: '',
            header: {},
            flag: !flag ? FLAG : flag,
            url: 'proxy://do=play&siteKey=' + sk() + '&tid=' + id,
            // 歌词：mad-api 不下发，按歌名+歌手从网易云匹配 LRC（失败空串不影响播放）
            lyric: song == null ? '' : lyricFetch(song.name, song.singer),
            klyric: '',
            accompany: '',
            // multi：TS 为双音轨结构（ffprobe 实测 1 视频 + 2 条 mp2 stereo，第 1 条=原唱、
            // 第 2 条=伴奏，能量曲线 20-50s 人声段 track1 显著高于 track2），壳 multi 模式
            // selectTrack 切音轨（原唱=第 1 条、伴奏=最后 1 条），默认播第 1 条=原唱 ✓
            trackMode: 'multi',
            // TS 自带 MV 画面：MV 态播同一流露出视频面（不走跨源 MV 搜索）
            mv: 'proxy://do=play&siteKey=' + sk() + '&tid=' + id,
        });
    } catch (e) {
        log('playerContent FAIL id=' + id + ': ' + e);
        return errorResult(flag, '获取播放数据失败：' + (e && e.message ? e.message : String(e)));
    }
}

/** 网关取直链并落缓存：页面 id（UUID 曲库 id 或纯数字编号）统一映射到网关编号 musicno。 */
function resolveUrl(pageId) {
    if (pageId == null || pageId === '') return null;
    const cached = URL_CACHE.get(pageId);
    if (cached != null) return cached;
    const song = SONG_CACHE.get(pageId);
    let no = pageId;
    if (song != null && /^\d+$/.test(song.tid)) no = song.tid;
    if (!/^\d+$/.test(no)) return null;
    let url = gatewayResolve(no, '720', false);
    if (url == null && song != null && song.tid !== no && /^\d+$/.test(song.tid)) {
        // 容错：mad-api 的 id 与第三方网关编号不同源时，用 tid 再试一次
        url = gatewayResolve(song.tid, '720', false);
    }
    if (url != null && url !== '') lruPut(URL_CACHE, pageId, url, 64);
    return url;
}

// ============================ 本地代理 ============================

function proxyPlay(params) {
    try {
        if (params.do !== 'play') return null;
        const tid = params.tid;
        if (tid == null || tid === '') {
            log('proxy missing tid');
            return null;
        }

        // 解析 Range
        let range = params['__range'];
        if (!range) range = params['range'];
        if (!range) range = 'bytes=0-';
        const m = /bytes=(\d+)-(\d*)/.exec(String(range));
        if (!m) {
            log('proxy bad range=' + range);
            return null;
        }
        const start = parseInt(m[1], 10);
        const end = m[2] === '' ? Number.MAX_SAFE_INTEGER : parseInt(m[2], 10);

        const ts = getDecryptedTs(String(tid));
        const total = ts.length;
        let realEnd = Math.min(end, total - 1);
        if (start >= total) {
            return [416, 'text/plain', '', { 'Content-Length': '0' }];
        }
        if (realEnd < start) realEnd = start;

        const len = realEnd - start + 1;
        const body = ts.subarray(start, start + len);

        log('proxy 服务 tid=' + tid + ' range=' + start + '-' + realEnd + '/' + total);
        return [206, 'video/mp2t', bytesToB64(body), {
            'Content-Range': 'bytes ' + start + '-' + realEnd + '/' + total,
            'Accept-Ranges': 'bytes',
        }, 1];
    } catch (e) {
        log('proxy FAIL tid=' + params.tid + ': ' + e);
        // 用 500 不用 502：NanoHTTPD 2.3.1 Status 枚举缺 502
        return [500, 'text/plain', '', { 'Content-Length': '0' }];
    }
}

/** 下载加密文件 → Thunder 解密 → 缓存明文 TS。 */
function getDecryptedTs(tid) {
    const cached = TS_CACHE.get(tid);
    if (cached != null) return cached;

    let url = URL_CACHE.get(tid);
    if (url == null || url === '') {
        url = resolveUrl(tid);
        if (url == null) throw new Error('取流失败：全部源不可用 tid=' + tid);
    }
    log('下载加密媒体 tid=' + tid + ' url=' + url);
    const fileData = downloadFull(url);
    log('已下载 ' + fileData.length + ' bytes，解密中...');

    const ts = thunderDecryptAll(fileData);
    log('解密完成 ts size=' + ts.length);
    URL_CACHE.delete(tid); // 直链一次性（token 时效），下载完即弃
    lruPut(TS_CACHE, tid, ts, 4);
    return ts;
}

function errorResult(flag, msg) {
    return JSON.stringify({
        msg: msg,
        flag: !flag ? FLAG : flag,
        url: '',
        parse: 0,
    });
}

// ============================ JsSpider 协议出口 ============================

let initExt = '';

export default {
    init(ext) {
        initExt = ext || '';
        log('init ext=' + initExt);
        return '';
    },

    home(filter) {
        return homeContent(filter);
    },

    homeVod() {
        return '';
    },

    category(tid, pg, filter, extend) {
        return categoryContent(tid, pg, filter, extend || {});
    },

    detail(id) {
        return detailContent([String(id)]);
    },

    search(key, quick, pg) {
        return searchContent(key, quick, pg);
    },

    play(flag, id, vipFlags) {
        return playerContent(flag, id, vipFlags);
    },

    action(action) {
        return actionContent(action);
    },

    /** 本地代理：proxy://do=play → 下载加密 TS → Thunder 解密 → Range 回吐明文。 */
    proxy(params) {
        try {
            return proxyPlay(params || {});
        } catch (e) {
            log('proxy FAIL: ' + e);
            return [500, 'text/plain', '', { 'Content-Length': '0' }];
        }
    },
};

// 供 golden 对拍使用（不进壳协议）
export const __ktv = {
    aesGcmEncrypt, thunderDecryptAll, thunderIsEncrypted, lyricCleanName,
    javaUrlEncode, md5Hex: md5Hex, gatewayResolve, rsaEncryptB64, rsaDecryptB64,
    PEM_PUB, PEM_PRIV,
};

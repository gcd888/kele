/**
 * xhs_sign.js — 番茄系（novelapp/番茄小说/番茄短剧）签名栈，纯 JS 移植。
 *
 * 移植自：kele/src/main/java/xihongshiduanju/src/com/github/catvod/spider/Xihongshiduanju.java
 * 算法蓝本：fq-Argus.kt（BearQu PR#23，GPL-3.0）+ Python 黄金验证栈（golden vectors 全绿）。
 * dm* 系列弹幕签名蓝本：tsukiyo hongguoTV TimedComments + danmu_api（金标逐字节校验过）。
 *
 * 依赖：globalThis.CryptoJS（lib/crypto-js.js）、lib/sm3.js、lib/binutil.js。
 * 64 位运算全部 BigInt + little-endian（与 fqapp rust 蓝本口径一致）。
 */

// 副作用 import：先于本模块求值，挂载 globalThis.CryptoJS（UMD 已补丁为 globalThis root）
import './crypto-js.js';
import { sm3 } from './sm3.js';
import {
    bytesToHex, hexToBytes, bytesToB64, b64ToBytes,
    utf8ToBytes, bytesToUtf8, concatBytes, le64, putLe64, be32, pkcs7Pad, randomBytes,
} from './binutil.js';

const CryptoJS = globalThis.CryptoJS;

// ---------------- WordArray 转换 ----------------

export function wa(bytes) {
    if (bytes instanceof Uint8Array) {
        // 每 4 字节一个 word（大端），尾部不足补 0（sigBytes 限定有效长度）
        const words = [];
        for (let i = 0; i < bytes.length; i += 4) {
            words.push(
                (((bytes[i] || 0) << 24) | ((bytes[i + 1] || 0) << 16) | ((bytes[i + 2] || 0) << 8) | (bytes[i + 3] || 0)) | 0
            );
        }
        return CryptoJS.lib.WordArray.create(words, bytes.length);
    }
    return bytes; // 已是 WordArray
}

export function waToBytes(w) {
    const words = w.words;
    const sig = w.sigBytes;
    const out = new Uint8Array(sig);
    for (let i = 0; i < sig; i++) {
        out[i] = (words[i >>> 2] >>> (24 - (i % 4) * 8)) & 255;
    }
    return out;
}

// ---------------- 哈希（crypto-js） ----------------

export function md5Hex(data) {
    return CryptoJS.MD5(wa(typeof data === 'string' ? utf8ToBytes(data) : data)).toString();
}

export function md5Bytes(data) {
    return waToBytes(CryptoJS.MD5(wa(typeof data === 'string' ? utf8ToBytes(data) : data)));
}

export function sha512Bytes(data) {
    return waToBytes(CryptoJS.SHA512(wa(typeof data === 'string' ? utf8ToBytes(data) : data)));
}

export { sm3 };

// ---------------- AES（crypto-js，二进制 key/iv） ----------------

/** AES-CBC NoPadding 加密（调用方保证块对齐） */
export function aesCbcEnc(data, key, iv) {
    return waToBytes(
        CryptoJS.AES.encrypt(wa(data), wa(key), { iv: wa(iv), mode: CryptoJS.mode.CBC, padding: CryptoJS.pad.NoPadding }).ciphertext
    );
}

/** AES-CBC PKCS5/7 加密 */
export function aesCbcEncPad(data, key, iv) {
    return waToBytes(
        CryptoJS.AES.encrypt(wa(data), wa(key), { iv: wa(iv), mode: CryptoJS.mode.CBC, padding: CryptoJS.pad.Pkcs7 }).ciphertext
    );
}

/** AES-CBC PKCS5/7 解密（输入为密文字节） */
export function aesCbcDecPad(data, key, iv) {
    const opts = { iv: wa(iv), mode: CryptoJS.mode.CBC, padding: CryptoJS.pad.Pkcs7 };
    return waToBytes(CryptoJS.AES.decrypt({ ciphertext: wa(data) }, wa(key), opts));
}

// ---------------- 64 位旋转（BigInt，截断 64 位） ----------------

const U64MASK = (1n << 64n) - 1n;

export function rotl64(x, n) {
    const b = BigInt.asUintN(64, x);
    return BigInt.asUintN(64, (b << BigInt(n)) | (b >> BigInt(64 - n)));
}

export function rotr64(x, n) {
    const b = BigInt.asUintN(64, x);
    return BigInt.asUintN(64, (b >> BigInt(n)) | (b << BigInt(64 - n)));
}

// ---------------- Simon 128/256（72 轮，全 LE；Z 常量 0x3DC94C3A046D678B） ----------------

const Z64 = 0x3DC94C3A046D678Bn;

/** k4: [BigInt ×4] → 72 轮密钥（danmu_api 口径：第二混合同步为右旋） */
export function simonKeyExpansion(k4) {
    const key = new Array(72);
    for (let i = 0; i < 4; i++) key[i] = BigInt.asUintN(64, k4[i]);
    for (let i = 4; i < 72; i++) {
        let tmp = rotr64(key[i - 1], 3) ^ key[i - 3];
        tmp = tmp ^ rotr64(tmp, 1);
        const bit = (Z64 >> BigInt((i - 4) % 62)) & 1n;
        key[i] = BigInt.asUintN(64, key[i - 4] ^ (U64MASK ^ tmp) ^ bit ^ 3n);
    }
    return key;
}

/** 单块加密：x/x1 为两个 64 位 LE 字，ke = simonKeyExpansion 结果 */
export function simonEncryptBlock(x, x1, ke) {
    let a = BigInt.asUintN(64, x), b = BigInt.asUintN(64, x1);
    for (let i = 0; i < ke.length; i++) {
        const f = rotl64(b, 1) & rotl64(b, 8);
        const nx1 = a ^ f ^ rotl64(b, 2) ^ ke[i];
        a = b;
        b = nx1;
    }
    return [a, b];
}

/** 批量加密（16 字节块序列，len 为 16 的倍数；pkcs7 已由调用方完成） */
export function simonEncryptBytes(data, ke) {
    const out = new Uint8Array(data.length);
    for (let i = 0; i < data.length; i += 16) {
        const c = simonEncryptBlock(le64(data, i), le64(data, i + 8), ke);
        putLe64(out, i, c[0]);
        putLe64(out, i + 8, c[1]);
    }
    return out;
}

// ---------------- protobuf writer（encode-only，varint 32 位掩码） ----------------

export class PB {
    constructor() {
        this.fields = []; // {tag, wire, val}  wire=0 varint / 2 blob
        this.blobs = [];
    }
    varint(tag, v) {
        this.fields.push({ tag, wire: 0, val: BigInt.asUintN(32, BigInt(v)) });
        return this;
    }
    utf8(tag, s) { return this.blob(tag, utf8ToBytes(String(s))); }
    bytes(tag, b) { return this.blob(tag, b instanceof Uint8Array ? b : new Uint8Array(b)); }
    sub(tag, nested) { return this.blob(tag, nested.buf()); }
    blob(tag, data) {
        this.blobs.push(data);
        this.fields.push({ tag, wire: 2, val: this.blobs.length - 1 });
        return this;
    }
    buf() {
        const out = [];
        const pushVarint = (v) => {
            v = BigInt.asUintN(64, BigInt(v));
            while (v >= 128n) {
                out.push(Number(v & 127n) | 128);
                v >>= 7n;
            }
            out.push(Number(v));
        };
        for (const f of this.fields) {
            pushVarint((BigInt(f.tag) << 3n) | BigInt(f.wire));
            if (f.wire === 0) pushVarint(f.val);
            else {
                const b = this.blobs[f.val];
                pushVarint(b.length);
                for (let i = 0; i < b.length; i++) out.push(b[i]);
            }
        }
        return new Uint8Array(out);
    }
}

// ---------------- Argus 551 签名（搜索/详情/取流） ----------------

const SIGN_KEY = hexToBytes('fc78e0a9657a0c748ce51559903ccf03510e51d3cff232d71343e88a321c5304');
const ARGUS_AES_KEY = hexToBytes('d31e3718288a1027baab59f146a09a9c');
const ARGUS_AES_IV = hexToBytes('ea180a0336ed352fcd24e4d50018ae54');
const MAGIC8 = new Uint8Array([0xf2, 0xf7, 0xfc, 0xff, 0xf2, 0xf7, 0xfc, 0xff]);
const TAIL9 = new Uint8Array([0xea, 0xfb, 0x2c, 0xfe, 0x85, 0x68, 0x51, 0x91, 0x54]);
const LICENSE_ID = 1611921764;

export function qp(query, name) {
    if (query == null) return null;
    for (const part of String(query).split('&')) {
        const eq = part.indexOf('=');
        if (eq < 0) continue;
        try {
            if (decodeURIComponent(part.substring(0, eq)) === name) return decodeURIComponent(part.substring(eq + 1));
        } catch (e) {}
    }
    return null;
}

/** x-argus 551：bean → pkcs7 → Simon(LE) → framing(+ao) → pkcs7 → AES-CBC → F2 81 前缀 → base64 */
export function argusSign(query, stubHex, ts, aid, deviceId, installId, randField) {
    const bean = new PB();
    bean.varint(1, 1077940818);
    bean.varint(2, 2);
    bean.varint(3, randField & 0xffffffff);
    bean.utf8(4, String(aid || 1967));
    bean.utf8(5, deviceId == null ? '' : deviceId);
    bean.utf8(6, String(LICENSE_ID));
    const vn = qp(query, 'version_name');
    bean.utf8(7, vn == null ? '' : vn);
    bean.utf8(8, 'v04.04.05-ov-android');
    bean.varint(9, 134744640);
    bean.bytes(10, new Uint8Array(8));
    bean.varint(11, 0);
    bean.varint(12, (BigInt(ts) << 1n) & 0xffffffffn);
    const stubBytes = stubHex ? hexToBytes(stubHex) : new Uint8Array(0);
    const bodyHash = stubBytes.length === 0 ? sm3(new Uint8Array(16)).subarray(0, 6) : sm3(stubBytes).subarray(0, 6);
    bean.bytes(13, bodyHash);
    bean.bytes(14, sm3(utf8ToBytes(query == null ? '' : query)).subarray(0, 6));
    const s15 = new PB();
    s15.varint(1, 1);
    s15.varint(2, 1);
    s15.varint(3, 1);
    s15.varint(7, 0xC792ECCC);
    bean.sub(15, s15);
    bean.utf8(16, installId == null ? '' : installId);
    bean.utf8(20, 'none');
    bean.varint(21, 738);
    const s23 = new PB();
    s23.utf8(1, 'NX551J');
    s23.varint(2, 8196);
    s23.varint(4, 0x80E0D800);
    bean.sub(23, s23);
    bean.varint(25, 2);

    const pb = pkcs7Pad(bean.buf());
    const ke = simonKeyExpansion([le64(SIGN_KEY, 0), le64(SIGN_KEY, 8), le64(SIGN_KEY, 16), le64(SIGN_KEY, 24)]);
    const enc = simonEncryptBytes(pb, ke);

    const un = concatBytes(MAGIC8, enc, TAIL9);
    const buf = new Uint8Array(un.length);
    buf.set(MAGIC8, 0);
    for (let i = 8; i < un.length; i++) buf[i] = un[i] ^ MAGIC8[i % 8];
    for (let i = 0, j = buf.length - 1; i < j; i++, j--) {
        const t = buf[i]; buf[i] = buf[j]; buf[j] = t;
    }
    const padded = pkcs7Pad(concatBytes(buf, new Uint8Array([0x61, 0x6f]))); // 'a''o'
    const encrypted = aesCbcEnc(padded, ARGUS_AES_KEY, ARGUS_AES_IV);
    const out = new Uint8Array(2 + encrypted.length);
    out[0] = 0xf2;
    out[1] = 0x81;
    out.set(encrypted, 2);
    return bytesToB64(out);
}

// ---------------- x-ladon（fqapp-ladon.rs 1:1，全 LE） ----------------

function ladonExpandTable(md5hex) {
    const ht = new Uint8Array(288);
    const prefix = utf8ToBytes(md5hex);
    ht.set(prefix.subarray(0, Math.min(32, prefix.length)), 0);
    let b0 = le64(ht, 0), b8 = le64(ht, 8);
    const q = new Array(36);
    let qh = 0, qt = 0;
    q[qt++] = le64(ht, 16);
    q[qt++] = le64(ht, 24);
    for (let i = 0; i < 34; i++) {
        let x8 = rotr64(b8, 8) + b0;
        x8 = BigInt.asUintN(64, x8 ^ BigInt(i));
        q[qt++] = x8;
        x8 = BigInt.asUintN(64, x8 ^ rotl64(b0, 3));
        putLe64(ht, (i + 1) * 8, x8);
        b0 = x8;
        b8 = q[qh++];
    }
    const table = new Array(36);
    for (let k = 0; k < 36; k++) table[k] = le64(ht, k * 8);
    return table;
}

function ladonEncryptBlock(ht, block) {
    let d0 = le64(block, 0), d1 = le64(block, 8);
    for (let i = 0; i < 34; i++) {
        d1 = BigInt.asUintN(64, ht[i] ^ (BigInt.asUintN(64, d0 + rotr64(d1, 8))));
        d0 = BigInt.asUintN(64, d1 ^ rotl64(d0, 3));
    }
    const out = new Uint8Array(16);
    putLe64(out, 0, d0);
    putLe64(out, 8, d1);
    return out;
}

export function ladon(ts, lcId, aid, rnd4) {
    const data = utf8ToBytes(ts + '-' + lcId + '-' + aid);
    const md5hex = md5Hex(concatBytes(rnd4, utf8ToBytes(String(aid))));
    const ht = ladonExpandTable(md5hex);
    const size = data.length;
    const newSize = size + (16 - (size % 16));
    const padVal = newSize - size;
    const inp = new Uint8Array(newSize).fill(padVal);
    inp.set(data, 0);
    const out = [rnd4];
    for (let i = 0; i < newSize / 16; i++) {
        out.push(ladonEncryptBlock(ht, inp.subarray(i * 16, i * 16 + 16)));
    }
    return bytesToB64(concatBytes.apply(null, out));
}

/** 签名头组装（PlayerSigner.headers 1:1） */
export function playerHeaders(query, body, ts) {
    let aid = 1967;
    const aidStr = qp(query, 'aid');
    if (aidStr && /^\d+$/.test(aidStr)) aid = parseInt(aidStr, 10);
    const stub = body && body.length ? md5Hex(body) : '';
    let deviceId = qp(query, 'device_id');
    if (deviceId == null) deviceId = '';
    const h = {
        'x-ss-req-ticket': String(ts * 1000),
        'x-khronos': String(ts),
    };
    const rnd4 = randomBytes(4);
    h['x-ladon'] = ladon(ts, LICENSE_ID, aid, rnd4);
    h['x-argus'] = argusSign(query, stub, ts, aid, deviceId, '', Math.floor(Math.random() * 0x7fffffff));
    if (stub) h['x-ss-stub'] = stub;
    return h;
}

// ---------------- spade 密钥派生（蓝本 MediaCrypto.deriveKey） ----------------

export function deriveKey(value) {
    const raw = b64ToBytes(value);
    if (raw.length < 3) throw new Error('key too short');
    const u = (b) => b & 255;
    const length = Math.min(raw.length - (u(raw[0]) ^ u(raw[1]) ^ u(raw[2])) + 47, raw.length - 1);
    if (length < 33) throw new Error('key length ' + length);
    const work = raw.slice(1, 1 + length);
    let a = 85, b = 246;
    for (let i = 0; i < work.length; i++) {
        const old = u(work[i]);
        const previous = (i & 1) !== 0 ? a : b;
        if ((i & 1) !== 0) a = old;
        else b = old;
        work[i] = (-21 - bitCount32(i) + (previous ^ old)) & 255;
    }
    // work[1..33] 为 hex 字符串（ISO_8859_1 == 逐字节）
    const key = hexToBytes(bytesToUtf8(work.subarray(1, 33)));
    if (key.length !== 16) throw new Error('derived key size ' + key.length);
    return key;
}

function bitCount32(n) {
    n = n | 0;
    let c = 0;
    while (n !== 0) { c += n & 1; n >>>= 1; }
    return c;
}

// ---------------- AES-128 加密核（CENC 逐样本 CTR 用，查表法） ----------------

const SBOX = new Uint8Array([
    0x63,0x7c,0x77,0x7b,0xf2,0x6b,0x6f,0xc5,0x30,0x01,0x67,0x2b,0xfe,0xd7,0xab,0x76,
    0xca,0x82,0xc9,0x7d,0xfa,0x59,0x47,0xf0,0xad,0xd4,0xa2,0xaf,0x9c,0xa4,0x72,0xc0,
    0xb7,0xfd,0x93,0x26,0x36,0x3f,0xf7,0xcc,0x34,0xa5,0xe5,0xf1,0x71,0xd8,0x31,0x15,
    0x04,0xc7,0x23,0xc3,0x18,0x96,0x05,0x9a,0x07,0x12,0x80,0xe2,0xeb,0x27,0xb2,0x75,
    0x09,0x83,0x2c,0x1a,0x1b,0x6e,0x5a,0xa0,0x52,0x3b,0xd6,0xb3,0x29,0xe3,0x2f,0x84,
    0x53,0xd1,0x00,0xed,0x20,0xfc,0xb1,0x5b,0x6a,0xcb,0xbe,0x39,0x4a,0x4c,0x58,0xcf,
    0xd0,0xef,0xaa,0xfb,0x43,0x4d,0x33,0x85,0x45,0xf9,0x02,0x7f,0x50,0x3c,0x9f,0xa8,
    0x51,0xa3,0x40,0x8f,0x92,0x9d,0x38,0xf5,0xbc,0xb6,0xda,0x21,0x10,0xff,0xf3,0xd2,
    0xcd,0x0c,0x13,0xec,0x5f,0x97,0x44,0x17,0xc4,0xa7,0x7e,0x3d,0x64,0x5d,0x19,0x73,
    0x60,0x81,0x4f,0xdc,0x22,0x2a,0x90,0x88,0x46,0xee,0xb8,0x14,0xde,0x5e,0x0b,0xdb,
    0xe0,0x32,0x3a,0x0a,0x49,0x06,0x24,0x5c,0xc2,0xd3,0xac,0x62,0x91,0x95,0xe4,0x79,
    0xe7,0xc8,0x37,0x6d,0x8d,0xd5,0x4e,0xa9,0x6c,0x56,0xf4,0xea,0x65,0x7a,0xae,0x08,
    0xba,0x78,0x25,0x2e,0x1c,0xa6,0xb4,0xc6,0xe8,0xdd,0x74,0x1f,0x4b,0xbd,0x8b,0x8a,
    0x70,0x3e,0xb5,0x66,0x48,0x03,0xf6,0x0e,0x61,0x35,0x57,0xb9,0x86,0xc1,0x1d,0x9e,
    0xe1,0xf8,0x98,0x11,0x69,0xd9,0x8e,0x94,0x9b,0x1e,0x87,0xe9,0xce,0x55,0x28,0xdf,
    0x8c,0xa1,0x89,0x0d,0xbf,0xe6,0x42,0x68,0x41,0x99,0x2d,0x0f,0xb0,0x54,0xbb,0x16,
]);
const RCON = new Uint8Array([0x01,0x02,0x04,0x08,0x10,0x20,0x40,0x80,0x1b,0x36]);

/** AES-128 key expansion（16 字节 key → 44 words Uint32） */
function aes128KeySchedule(key) {
    const w = new Uint32Array(44);
    for (let i = 0; i < 4; i++) {
        w[i] = ((key[i * 4] << 24) | (key[i * 4 + 1] << 16) | (key[i * 4 + 2] << 8) | key[i * 4 + 3]) >>> 0;
    }
    for (let i = 4; i < 44; i++) {
        let t = w[i - 1];
        if (i % 4 === 0) {
            t = ((t << 8) | (t >>> 24)) >>> 0; // rotword
            t = ((SBOX[(t >>> 24) & 255] << 24) | (SBOX[(t >>> 16) & 255] << 16) |
                 (SBOX[(t >>> 8) & 255] << 8) | SBOX[t & 255]) >>> 0;
            t = (t ^ ((RCON[i / 4 - 1] << 24) >>> 0)) >>> 0;
        }
        w[i] = (w[i - 4] ^ t) >>> 0;
    }
    return w;
}

function xt(v) { return ((v << 1) ^ ((v & 0x80) ? 0x1b : 0)) & 255; }
function mul(v, m) {
    let r = 0;
    let x = v, k = m;
    while (k) {
        if (k & 1) r ^= x;
        x = xt(x);
        k >>= 1;
    }
    return r & 255;
}

/** AES-128 单块加密（counter 16 字节 → 16 字节 keystream）；FIPS-197 对拍验证 */
export function aes128EncryptBlock(w, block) {
    const s = new Uint8Array(16);
    // AddRoundKey(0)
    for (let i = 0; i < 16; i++) s[i] = block[i] ^ ((w[i >> 2] >>> (24 - (i % 4) * 8)) & 255);
    for (let round = 1; round <= 10; round++) {
        const t = new Uint8Array(16);
        for (let c = 0; c < 4; c++) {
            // SubBytes + ShiftRows（列主序：行 r 左移 r，取数时环形完成）
            const b0 = SBOX[s[4 * c + 0]];
            const b1 = SBOX[s[4 * ((c + 1) % 4) + 1]];
            const b2 = SBOX[s[4 * ((c + 2) % 4) + 2]];
            const b3 = SBOX[s[4 * ((c + 3) % 4) + 3]];
            if (round < 10) {
                // MixColumns
                t[c * 4 + 0] = (mul(b0, 2) ^ mul(b1, 3) ^ b2 ^ b3) & 255;
                t[c * 4 + 1] = (b0 ^ mul(b1, 2) ^ mul(b2, 3) ^ b3) & 255;
                t[c * 4 + 2] = (b0 ^ b1 ^ mul(b2, 2) ^ mul(b3, 3)) & 255;
                t[c * 4 + 3] = (mul(b0, 3) ^ b1 ^ b2 ^ mul(b3, 2)) & 255;
            } else {
                // 末轮无 MixColumns
                t[c * 4 + 0] = b0;
                t[c * 4 + 1] = b1;
                t[c * 4 + 2] = b2;
                t[c * 4 + 3] = b3;
            }
        }
        // AddRoundKey(round)
        for (let i = 0; i < 16; i++) s[i] = t[i] ^ ((w[round * 4 + (i >> 2)] >>> (24 - (i % 4) * 8)) & 255);
    }
    return s;
}

/**
 * CENC 样本 AES-CTR 解密（Java decryptBytes 内核同构）：
 * key 16B；ivCounter 为 128 位 BigInt 计数器初值（BE）；data 为待解密字节流，
 * skip 为 counter 块内起始偏移。返回解密后字节（与输入等长）。
 */
export function aesCtrDecrypt(key, counter128, skip, data) {
    const w = aes128KeySchedule(key);
    const out = new Uint8Array(data.length);
    let counter = BigInt.asUintN(128, counter128);
    let pos = 0;
    // 首 counter 块：跳过 skip 字节
    let first = true;
    while (pos < data.length) {
        const cb = new Uint8Array(16);
        let c = counter;
        for (let i = 15; i >= 0; i--) { cb[i] = Number(c & 0xffn); c >>= 8n; }
        const ks = aes128EncryptBlock(w, cb);
        const start = first ? skip : 0;
        first = false;
        for (let i = start; i < 16 && pos < data.length; i++, pos++) {
            out[pos] = data[pos] ^ ks[i];
        }
        counter = (counter + 1n) & ((1n << 128n) - 1n);
    }
    return out;
}

/** 128 位 BigInt ← 16 字节 BE */
export function bytesToBigIntBE(bytes) {
    let v = 0n;
    for (let i = 0; i < bytes.length; i++) v = (v << 8n) | BigInt(bytes[i] & 255);
    return v;
}

// ---------------- 弹幕签名（dm* 系列，tsukiyo/danmu_api 蓝本） ----------------

const DM_ARGUS_SECRET = 'ac1adaae95a7af94a5114ab3b3a97dd80050aa0a39314c40528caec95256c28c';

function dmVarint(out, n) {
    while ((n >>> 7) !== 0) {
        out.push((n & 127) | 128);
        n >>>= 7;
    }
    out.push(n & 255);
}

/** proto 编码：Number → varint，其余 → length-delimited utf8（tsukiyo 1:1） */
export function dmProto(fields) {
    const out = [];
    for (const tag of Object.keys(fields)) {
        const t = parseInt(tag, 10);
        const value = fields[tag];
        if (typeof value === 'number' || typeof value === 'bigint') {
            dmVarint(out, t << 3);
            dmVarint(out, Number(value));
        } else {
            const bytes = value instanceof Uint8Array ? value : utf8ToBytes(String(value));
            dmVarint(out, (t << 3) | 2);
            dmVarint(out, bytes.length);
            for (let i = 0; i < bytes.length; i++) out.push(bytes[i]);
        }
    }
    return new Uint8Array(out);
}

/** gorgon 种子 20 字节：md5(query)[0:4]+stub[0:4]+cookieMd5[0:4]+00010704+BE32(ts) */
export function dmGorgonSeed(query, stub, cookie, ts) {
    const body = /^[0-9a-f]{32}$/i.test(stub) ? hexToBytes(stub.substring(0, 8)) : new Uint8Array(4);
    const ck = cookie ? md5Bytes(cookie).subarray(0, 4) : new Uint8Array(4);
    return concatBytes(md5Bytes(query).subarray(0, 4), body, ck, hexToBytes('00010704'), be32(ts | 0));
}

/** X-Gorgon（0x8404 RC4 变体，金标对齐） */
export function dmGorgon(seed, first, second, parameter) {
    const input = seed.slice();
    const key = [0x4a, parameter & 255, 0x16, second, 0x47, 0x6c, (parameter >>> 8) & 255, first & 255];
    const box = new Int32Array(256);
    for (let i = 0; i < 256; i++) box[i] = i;
    let j = 0;
    for (let i = 0; i < 256; i++) {
        j = (j + box[i] + key[i % 8]) & 255;
        box[i] = box[j];
    }
    j = 0;
    for (let n = 0; n < input.length; n++) {
        const i = (n + 1) & 255;
        j = (j + box[i]) & 255;
        box[i] = box[j];
        input[n] = (input[n] ^ box[(box[i] + box[j]) & 255]) & 255;
    }
    const lengthMask = (~input.length) & 255;
    for (let i = 0; i < input.length; i++) {
        const v = input[i] & 255;
        const swapped = ((v << 4) | (v >>> 4)) & 255;
        const next = input[(i + 1) % input.length] & 255;
        // Integer.reverse(int)>>>24 == 低字节位反转
        const reversed = reverseByte((swapped ^ next) & 255);
        input[i] = (reversed ^ lengthMask) & 255;
    }
    const head = new Uint8Array([0x84, 4, first & 255, second & 255, parameter & 255, (parameter >>> 8) & 255]);
    return bytesToHex(concatBytes(head, input));
}

function reverseByte(b) {
    b &= 255;
    return (((b & 1) << 7) | ((b & 2) << 5) | ((b & 4) << 3) | ((b & 8) << 1) |
            ((b & 16) >>> 1) | ((b & 32) >>> 3) | ((b & 64) >>> 5) | ((b & 128) >>> 7)) & 255;
}

/** X-Ladon（simon 34 轮 + md5(salt|aid) 密钥） */
export function dmLadon(ts, salt) {
    const ascii = utf8ToBytes(bytesToHex(md5Bytes(concatBytes(salt, utf8ToBytes('8662')))));
    const queue = [le64(ascii, 16), le64(ascii, 24)];
    let left = le64(ascii, 0);
    let right = le64(ascii, 8);
    const keys = new Array(34);
    for (let i = 0; i < 34; i++) {
        keys[i] = left;
        let next = BigInt.asUintN(64, (rotr64(right, 8) + left) ^ BigInt(i));
        queue.push(next);
        left = BigInt.asUintN(64, next ^ rotl64(left, 3));
        right = queue.shift();
    }
    const data = pkcs7Pad(utf8ToBytes(ts + '-1611921764-3019'));
    const parts = [salt];
    for (let at = 0; at < data.length; at += 16) {
        let a = le64(data, at);
        let b = le64(data, at + 8);
        for (let i = 0; i < keys.length; i++) {
            b = BigInt.asUintN(64, keys[i] ^ BigInt.asUintN(64, a + rotr64(b, 8)));
            a = BigInt.asUintN(64, b ^ rotl64(a, 3));
        }
        const o = new Uint8Array(16);
        putLe64(o, 0, a);
        putLe64(o, 8, b);
        parts.push(o);
    }
    return bytesToB64(concatBytes.apply(null, parts));
}

/** X-Argus（sm3 派生 + simon 128/256 72 轮 + AES-CBC；密钥编排第二混合为右旋） */
export function dmArgus(query, stub, ts, argusRandom, signCount) {
    const bodyInput = /^[0-9a-f]{32}$/i.test(stub) ? hexToBytes(stub) : new Uint8Array(16);
    const nested = dmProto({ 1: signCount, 2: 1388734, 3: 1388734, 4: 1388734 });
    const message = dmProto({
        1: 0x40401252,
        2: 2,
        3: argusRandom,
        4: '3019',
        6: '1611921764',
        7: '6.8.1.32',
        8: 'v04.07.01-ml-android',
        9: 135135744,
        10: new Uint8Array(8),
        12: BigInt(ts) * 2n,
        13: sm3(bodyInput).subarray(0, 6),
        14: sm3(utf8ToBytes(query)).subarray(0, 6),
        15: nested,
        20: 'none',
        21: 738,
    });
    const secret = hexToBytes(DM_ARGUS_SECRET);
    const derived = sm3(concatBytes(secret, hexToBytes('3ccc567b'), secret));
    const k4 = [le64(derived, 0), le64(derived, 8), le64(derived, 16), le64(derived, 24)];
    const keys = simonKeyExpansion(k4);
    const blocks = pkcs7Pad(message);
    const enc = simonEncryptBytes(blocks, keys);
    const mask = hexToBytes('d04ffdffd04ffdff');
    const scrambled = new Uint8Array(enc.length);
    for (let i = 0; i < enc.length; i++) scrambled[i] = enc[i] ^ mask[i % 8];
    const maskScrambled = concatBytes(mask, scrambled);
    const reversed = new Uint8Array(maskScrambled.length);
    for (let i = 0; i < maskScrambled.length; i++) reversed[i] = maskScrambled[maskScrambled.length - 1 - i];
    const container = concatBytes(hexToBytes('a6e783ee7001100918'), reversed, hexToBytes('567b'));
    // AES-CBC-PKCS5：key=md5(secret[0:16]) iv=md5(secret[16:32])
    const key = md5Bytes(secret.subarray(0, 16));
    const iv = md5Bytes(secret.subarray(16, 32));
    // Java: Base64.getEncoder().encodeToString(dmConcat(dmHex("3ccc"), cipher.doFinal(container)))
    return bytesToB64(concatBytes(hexToBytes('3ccc'), aesCbcEncPad(container, key, iv)));
}

export default {
    argusSign, ladon, playerHeaders, deriveKey, qp,
    simonKeyExpansion, simonEncryptBlock, simonEncryptBytes,
    md5Hex, md5Bytes, sha512Bytes, sm3,
    aesCbcEnc, aesCbcEncPad, aesCbcDecPad, aesCtrDecrypt, bytesToBigIntBE,
    dmProto, dmGorgonSeed, dmGorgon, dmLadon, dmArgus,
};

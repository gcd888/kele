/**
 * qg_sign.js — 青果短剧（红果 hongguoTV）签名栈，纯 JS 移植。
 *
 * 移植自：kele/src/main/java/qingguoduanju/src/com/github/catvod/spider/Qingguoduanju.java
 * 算法蓝本：case/hongguoTV-tsukiyo kotlin-tv/core Signer.kt（signPlayback 口径，2026-11-05 PR#71）
 *   + hongguo.cjs（Node 金标）。金标：qingguoduanju/test/golden.json（TestMain.java 逐字节比对口径）。
 *
 * 内容：
 *  - hashF13 branch0（IVV1_LIST/CHOSEN/HASH_TABLE/getIv/sumMd5）+ branchOf（签名分支，0/1/2）；
 *  - x-gorgon（0x8404 RC4 变体）/ x-helios（simon 34 轮）/ x-medusa（deviceProto/xmxor/keyHash/
 *    SBOX/AesV3 自研 AES 变体）——播放/搜索/账号域全套设备级签名共用；
 *  - pythonUrlEncode（cjs 口径，签名与 URL 同一份字节）/ encodeQuery（URLEncoder 口径）；
 *  - ttEncrypt（设备注册体封装：MAGIC + rnd32 + AES-128-CBC(SHA512²+KDF)）+ spade decryptUrl；
 *  - RAND/CLOCK 钩子：桌面金标注入固定序列复现 golden.json（TestMain 同口径）。
 *
 * 依赖：lib/sm3.js（GB/T 32905-2016）、lib/xhs_sign.js（md5/sha512/AES-CBC/wa 转换）、
 *       lib/binutil.js（hex/b64/bytes）。
 */

import { sm3 } from '../lib/sm3.js';
import {
    md5Bytes, sha512Bytes, aesCbcEnc, wa, waToBytes,
} from '../lib/xhs_sign.js';
import {
    bytesToHex, hexToBytes, bytesToB64, b64ToBytes,
    utf8ToBytes, bytesToUtf8, concatBytes, be32,
} from '../lib/binutil.js';

// ---------------- 随机源/时钟钩子（默认系统实现；桌面金标注入固定序列复现 golden.json） ----------------

export const hooks = {
    rand: () => Math.random(),
    now: () => Date.now(),
};

/** 金标注入：mulberry32 种子序列（golden.mjs golden 模式同款 PRNG） */
export function seedGolden(randoms, fixedMs) {
    let idx = 0;
    hooks.rand = () => {
        if (idx >= randoms.length) throw new Error('randoms 序列耗尽');
        return randoms[idx++];
    };
    hooks.now = () => fixedMs;
}

/** 32 位无符号随机器（Java (long)(rand*4294967296.0) 口径） */
function randUint32() {
    return Math.floor(hooks.rand() * 4294967296) >>> 0;
}

// ---------------- 基础位运算（勿改位序，蓝本实测黑盒） ----------------

function rol32(v, n) { n &= 31; return ((v << n) | (v >>> (32 - n))) | 0; }
function ror32(v, n) { n &= 31; return ((v >>> n) | (v << (32 - n))) | 0; }

/** le32：Java (byte)v/(byte)(v>>>8)... 位序；入参 int32 位型（JS 负数位型一致） */
export function le32(v) {
    return new Uint8Array([v & 255, (v >>> 8) & 255, (v >>> 16) & 255, (v >>> 24) & 255]);
}

function reverseByte(b) {
    b &= 255;
    return (((b & 1) << 7) | ((b & 2) << 5) | ((b & 4) << 3) | ((b & 8) << 1) |
            ((b & 16) >>> 1) | ((b & 32) >>> 3) | ((b & 64) >>> 5) | ((b & 128) >>> 7)) & 255;
}

// ---------------- 64 位 LE 读写（BigInt，helios/helios 表用） ----------------

function i64leBytes(d, at) {
    let v = 0n;
    for (let i = 7; i >= 0; i--) v = (v << 8n) | BigInt(d[at + i] & 255);
    return BigInt.asUintN(64, v);
}

function le64Bytes(v) {
    let x = BigInt.asUintN(64, v);
    const out = new Uint8Array(8);
    for (let i = 0; i < 8; i++) { out[i] = Number(x & 0xffn); x >>= 8n; }
    return out;
}

const U64MASK = (1n << 64n) - 1n;
function rotl64(x, n) { const b = BigInt.asUintN(64, x); return BigInt.asUintN(64, (b << BigInt(n)) | (b >> BigInt(64 - n))); }
function rotr64(x, n) { const b = BigInt.asUintN(64, x); return BigInt.asUintN(64, (b >> BigInt(n)) | (b << BigInt(64 - n))); }

// ---------------- protobuf 编码（cjs varint/zigzag/protoField 同构，long 全量 BigInt） ----------------

/** varint（Java varint(long)：入参视为无符号 64 位，n >>>= 7 语义） */
function varintBytes(n) {
    let v = BigInt.asUintN(64, BigInt(n));
    const out = [];
    while (v > 127n) {
        out.push(Number(v & 127n) | 128);
        v >>= 7n;
    }
    out.push(Number(v));
    return new Uint8Array(out);
}

/** sint64 字段（标准 zigzag，等价 cjs zigzag()） */
function protoFieldSint(tag, value) {
    const v = BigInt(value);
    const z = (v << 1n) ^ (v >> 63n); // BigInt 负数按二进制补码无限符号扩展，与 Java long 位语义一致
    return concatBytes(varintBytes(BigInt(tag) << 3n), varintBytes(z));
}

/** float 字段（Java Float.floatToIntBits：fround 后取 IEEE754 位型） */
function f32bits(x) {
    const buf = new ArrayBuffer(4);
    new Float32Array(buf)[0] = Math.fround(x);
    return new Uint32Array(buf)[0] >>> 0;
}

function protoFieldFloat(tag, value) {
    return concatBytes(varintBytes((BigInt(tag) << 3n) | 5n), le32(f32bits(value)));
}

function protoFieldStr(tag, value) {
    if (value == null || value === '') return new Uint8Array(0);
    return protoFieldBytes(tag, utf8ToBytes(String(value)));
}

function protoFieldBytes(tag, body) {
    if (body == null) return new Uint8Array(0);
    return concatBytes(varintBytes((BigInt(tag) << 3n) | 2n), varintBytes(body.length), body);
}

function proto() {
    const parts = [];
    for (let i = 0; i < arguments.length; i++) parts.push(arguments[i]);
    return concatBytes.apply(null, parts);
}

// ---------------- hashF13 branch 0（蓝本 Signer.kt hashF13：只实现 branch 0，调用前抖动 ticket 凑分支） ----------------

const IVV1_LIST = [0xc4a78580 | 0, 0xb3c0fd39 | 0, 0xc58c5686 | 0, 0xc9aa3ba7 | 0, 0xf5a7adf2 | 0, 0x963c2ed1 | 0];
const CHOSEN = [
    [101, 5, 7, 6, 3, 2, 1, 0, 5, 4, 3],
    [96, 0, 6, 7, 5, 3, 2, 1, 5, 4, 4],
    [96, 7, 6, 2, 1, 4, 0, 5, 4, 3, 5],
    [99, 3, 6, 2, 4, 5, 1, 0, 0, 7, 6],
    [96, 0, 5, 6, 7, 3, 1, 2, 5, 4, 4],
    [100, 2, 0, 3, 5, 4, 6, 7, 2, 1, 5],
];
const HASH_TABLE = [
    0xebb64faf, 0x07aadcc2, 0xcf3187bf, 0xe01138ff, 0x6d0bfcff, 0x5a30a3be,
    0xb41ad638, 0x34180eb8, 0xf233eb6f, 0xb1a584cc, 0xccc30dc7, 0x47d1db51,
    0xd55653de, 0x70a84fa1, 0x57473c12, 0xf76f0288, 0x2c077f0a, 0xda0dcad0,
    0xfbb86f6c, 0xfdc4cf00, 0x688a020d, 0xe676c6a6, 0x8cd6338b, 0x1a3c8d0e,
    0xcce8b06b, 0x6ad0ed0b, 0xa0522717, 0xdc71ac83, 0x2285db71, 0xd5b4dda6,
    0x736f8650, 0x6560306c, 0x617ce2a6, 0xe423417e, 0x0a40e143, 0x544e4032,
    0x88dffb2a, 0x716c1ae0, 0x4c467a88, 0x05b23bb3, 0xe1d0b866, 0xbaa3dcb8,
    0xae3374d3, 0xc3381a50, 0x1702f75b, 0xfe6da368, 0xf0b4cf48, 0x4e0ffbb8,
    0x72aad10d, 0x26c53a3d, 0xf2bce0f6, 0xb4557581, 0x4a257fdd, 0x8c3182a2,
    0xab0b3b86, 0x3d5dfb14, 0x4f103634, 0xd37b52d7, 0x444eff16, 0xeb0a33d1,
    0x6ca86f6e, 0x00284ba7, 0x08387cfa, 0x5fb37586,
];

function getIv(iv, data) {
    let value = iv | 0;
    for (let i = 0; i < data.length; i++) {
        if ((i & 1) === 0) value = ((value >>> 4) ^ value ^ (value << 6) ^ (data[i] & 255)) | 0;
        else value = (~((value >>> 7) ^ value ^ ((data[i] & 255) | (value << 12)))) | 0;
    }
    return value;
}

export function ivOf(querySm3, bodyMd5, ts) {
    return getIv(getIv(getIv(0x20230928, querySm3), bodyMd5), le32(ts));
}

const ZEROS16 = new Uint8Array(16);

/** 签名分支（0/1/2）；本实现只支持 branch 0，由 sign() 抖动 _rticket 凑中（GET 口径）。 */
export function branchOf(query, ts) {
    return (ivOf(sm3(utf8ToBytes(query)), ZEROS16, ts) & 15) % 3;
}

/** x-ss-stub 口径：body MD5 十六进制大写（passport POST 签名头用）。 */
export function md5HexUpper(body) {
    return bytesToHex(md5Bytes(body)).toUpperCase();
}

/**
 * 签名分支（带 body 口径，蓝本 Signer.branch）：POST 时 body 的 MD5 参与 iv 计算，
 * 与 GET（body=null → 16 字节占位）分支结果不同，passport POST 请求必须用本重载抖动。
 */
export function branchOfBody(query, body, ts) {
    const bodyMd5 = body == null || body.length === 0 ? ZEROS16 : md5Bytes(body);
    return (ivOf(sm3(utf8ToBytes(query)), bodyMd5, ts) & 15) % 3;
}

function sumMd5(d) {
    let check = 0x20220420 | 0;
    for (let i = 0; i < 12; i++) {
        const temp = ((check >>> ((i & 1) === 0 ? 3 : 5)) ^ check) | 0;
        check = ((i & 1) === 0
            ? ((d[i] & 255) ^ (check << 7))
            : (~((d[i] & 255) | (check << 11)))) | 0;
        check = (check ^ temp) | 0;
    }
    return ((check | 4) ^ 0x1000000) | 0;
}

export function hashF13branch0(querySm3, bodyMd5, ts) {
    const iv = ivOf(querySm3, bodyMd5, ts);
    const index = (iv & 15) / 3;
    const count = (IVV1_LIST[index] + ts) | 0; // int 溢出回绕 = JS ToUint32 低 32 位
    const tt = new Array(64);
    for (let i = 0; i < 64; i++) tt[i] = ror32(HASH_TABLE[i] | 0, count + 1);
    const shift = (count + 2) & 7;
    const seed = [0xfa, 0x45, 0x61, 0xd7];
    const pad = new Uint8Array(4);
    for (let i = 0; i < 4; i++) pad[i] = ((seed[i] | (seed[i] << 8)) >> shift) & 255;
    const data = concatBytes(concatBytes(querySm3, bodyMd5), concatBytes(concatBytes(le32(ts), pad), hexToBytes('00000000000001a0')));
    const di = new Int32Array(128);
    for (let i = 0; i < 16; i++) di[i] = ((data[i * 4] & 255) << 24) | ((data[i * 4 + 1] & 255) << 16) | ((data[i * 4 + 2] & 255) << 8) | (data[i * 4 + 3] & 255);
    for (let i = 0; i < 112; i++) {
        const x = di[i + 1];
        const y = di[i + 14];
        const r1 = (rol32(x, 14) ^ rol32(x, 25) ^ (x >>> 3)) | 0;
        const r2 = (rol32(y, 13) ^ rol32(y, 15) ^ (y >>> 10)) | 0;
        di[16 + i] = (di[i] + di[i + 9] + r1 + r2) | 0;
    }
    const init = [0x7aba4fc8 | 0, 0x67166507 | 0, 0x6403fa00 | 0, 0x340f512f | 0,
        984304912 | 0, 3005047866 | 0, 2874125293 | 0, 2152413264 | 0];
    // cjs：init 即旋转后的数组，末尾 ret 与旋转后的 init 相加
    for (let i = 0; i < 8; i++) init[i] = ror32(init[i], count);
    const d = init.slice();
    const chosen = CHOSEN[index];
    for (let i = 0; i < chosen[0]; i++) {
        const base = (IVV1_LIST[index] + i) | 0;
        const n1 = (((d[chosen[3]] ^ d[chosen[4]]) & d[chosen[1]]) ^ d[chosen[3]]) | 0;
        const n2 = (rol32(d[chosen[1]], 26) ^ rol32(d[chosen[1]], 21) ^ rol32(d[chosen[1]], 7)) | 0;
        const n4 = (di[base & 127] + n1 + n2 + tt[base & 63] + d[chosen[5]]) | 0;
        const n5 = (rol32(d[chosen[2]], 30) ^ rol32(d[chosen[2]], 19) ^ rol32(d[chosen[2]], 10)) | 0;
        const n6 = ((d[chosen[2]] & d[chosen[6]]) | ((d[chosen[2]] | d[chosen[6]]) & d[chosen[7]])) | 0;
        const old = d[chosen[9]];
        const last = d[7]; // d.unshift(d.pop())
        for (let k = 7; k > 0; k--) d[k] = d[k - 1];
        d[0] = last;
        d[chosen[10]] = (n5 + n6 + n4) | 0;
        d[chosen[8]] = (old + n4) | 0;
    }
    const ret = new Uint8Array(32);
    for (let i = 0; i < 8; i++) ret.set(be32((d[i] + init[i]) | 0), i * 4);
    const folded = new Uint8Array(16);
    for (let i = 0; i < 16; i++) folded[i] = ret[i] ^ ret[i + 16];
    return concatBytes(folded, le32(sumMd5(folded)));
}

// ---------------- x-gorgon（RC4 变体，蓝本 cjs xGorgon/rc4Gorgon 逐位对照） ----------------

export function xGorgon(query, body, ts, random) {
    const input = concatBytes(
        md5Bytes(utf8ToBytes(query)).subarray(0, 4),
        concatBytes(body != null ? md5Bytes(body).subarray(0, 4) : new Uint8Array(4),
            concatBytes(new Uint8Array(4), concatBytes(le32(67503104), be32(ts)))));
    const key = [0x4a, 0x40, 0x16, (random >> 8) & 255, 0x47, 0x6c, 0x01, random & 255];
    const s = new Int32Array(256);
    for (let i = 0; i < 256; i++) s[i] = i;
    let j = 0;
    for (let i = 0; i < 256; i++) {
        j = (j + s[i] + key[i % 8]) & 255;
        s[i] = s[j]; // 非标准 KSA（无交换），蓝本原样
    }
    let i2 = 0;
    j = 0;
    const out = new Uint8Array(input.length);
    for (let n = 0; n < input.length; n++) {
        i2 += 1;
        const x = s[i2];
        j += x;
        const y = s[j & 255];
        s[i2] = y;
        out[n] = (input[n] & 255) ^ s[(y + y) & 255];
    }
    for (let k = 0; k < out.length; k++) {
        const value = (((out[k] & 255) >> 4) | ((out[k] & 255) << 4)) & 255;
        const next = out[k + 1 < out.length ? k + 1 : 0] & 255;
        const reversed = reverseByte((next ^ value) & 255);
        out[k] = (~(reversed ^ 20)) & 255;
    }
    const head = new Uint8Array([0x84, 0x04, random & 255, (random >> 8) & 255, 0x40, 0x01]);
    return bytesToHex(concatBytes(head, out));
}

// ---------------- x-helios（蓝本 cjs helios 1:1，long 数学） ----------------

export function helios(ts) {
    const random = randUint32(); // int 位型（JS 直接无符号数，位型一致）
    const md5hex = bytesToHex(md5Bytes(concatBytes(le32(random), utf8ToBytes('8662'))));
    const ascii = utf8ToBytes(md5hex);
    const w0 = i64leBytes(ascii, 0);
    const w1 = i64leBytes(ascii, 8);
    const queue = [i64leBytes(ascii, 16), i64leBytes(ascii, 24)];
    const table = [w0];
    let b0 = w0;
    let b8 = w1;
    for (let i = 0; i < 34; i++) {
        let x8 = BigInt.asUintN(64, BigInt.asUintN(64, rotr64(b8, 8)) + b0);
        x8 = BigInt.asUintN(64, x8 ^ BigInt(i));
        queue.push(x8);
        x8 = BigInt.asUintN(64, x8 ^ rotr64(b0, 61));
        table.push(x8);
        b0 = x8;
        b8 = queue.shift();
    }
    const text = utf8ToBytes(ts + '-1588093228-8662');
    const padding = 16 - (text.length % 16);
    const padded = new Uint8Array(text.length + padding).fill(padding);
    padded.set(text, 0);
    const out = [le32(random)];
    for (let at = 0; at < padded.length; at += 16) {
        let a = i64leBytes(padded, at);
        let b = i64leBytes(padded, at + 8);
        for (let i = 0; i < 34; i++) {
            b = BigInt.asUintN(64, table[i] ^ BigInt.asUintN(64, a + rotr64(b, 8)));
            a = BigInt.asUintN(64, b ^ rotr64(a, 61));
        }
        out.push(le64Bytes(a), le64Bytes(b));
    }
    return bytesToB64(concatBytes.apply(null, out));
}

// ---------------- x-medusa（deviceProto/xmxor/keyHash/AesV3/buildMedusa，蓝本 cjs 1:1） ----------------

function deviceProto(deviceId) {
    return proto(
        protoFieldSint(1, 1), protoFieldSint(2, 2), protoFieldStr(3, '8662'),
        protoFieldStr(4, deviceId), protoFieldStr(5, 'Ai6svO3PyrwDOUSmO6ZcResxu'),
        protoFieldStr(6, '!noperm!'), protoFieldSint(7, -888888), protoFieldSint(8, -888888),
        protoFieldSint(9, 3), protoFieldSint(10, -888888), protoFieldStr(11, '!notset!'),
        protoFieldStr(12, 'Asia/Shanghai,8'), protoFieldStr(13, 'zh_CN'), protoFieldSint(14, 4),
        protoFieldFloat(16, 255.24993896484375), protoFieldFloat(17, 35.58599090576172),
        protoFieldFloat(18, 3.467449188232422), protoFieldFloat(19, 3.467449188232422),
        protoFieldFloat(20, 255.1754913330078), protoFieldFloat(21, 42.17544174194336),
        protoFieldStr(22, '16'), protoFieldSint(23, 41), protoFieldSint(24, 36),
        protoFieldSint(25, 1728388016635), protoFieldSint(26, 1728388016635),
        protoFieldSint(27, 1728388016635), protoFieldSint(28, 1728388016637),
        protoFieldSint(29, -1), protoFieldStr(30, '25053RT47C'), protoFieldStr(31, 'Redmi'),
        protoFieldStr(32, '25053RT47C'), protoFieldStr(33, '25053RT47C'), protoFieldStr(34, 'Xiaomi'),
        protoFieldStr(35, 'Redmi'), protoFieldStr(36, 'Redmi'), protoFieldSint(38, 31));
}

function xmxor(data, key) {
    const encoded = new Int32Array(data.length);
    for (let i = 0; i < data.length; i++) {
        const at = (i * 4) & 28;
        const d0 = key[at] & 255;
        const d1 = key[at + 1] & 255;
        const v = data[i] & 255;
        let d2 = ((((v << 4) | (v >>> 4)) & 255) + d0) | 0;
        d2 = (~d2) ^ d1;
        d2 = (((d2 & 255) << 3) | ((d2 & 255) >>> 5)) & 255;
        d2 = (d2 + d1) & 255;
        d2 = (d2 ^ d0) & 255;
        encoded[data.length - i - 1] = (~d2) & 255;
    }
    const last = (encoded[encoded.length - 1] ^ encoded[encoded.length - 2]) & 255;
    const first = encoded[0];
    encoded[0] = ((~last) + first) & 255;
    encoded[1] = ((encoded[0] ^ encoded[encoded.length - 1] ^ 254) + encoded[1]) & 255;
    encoded[2] = (encoded[2] + ((last - first)
        ^ (((encoded[1] << 3) | (encoded[1] >>> 5)) & 255) ^ 2)) & 255;
    for (let i = 0; i < encoded.length - 4; i++) {
        const temp = ((((encoded[i + 2] << 3) | (encoded[i + 2] >>> 5)) & 255)
            ^ encoded[i + 1] ^ (i + 3)) | 0;
        encoded[i + 3] = ((~temp) + encoded[i + 3]) & 255;
    }
    encoded[encoded.length - 1] ^= encoded[encoded.length - 2];
    let sum = 0;
    for (let i = 0; i < encoded.length - 1; i++) sum += encoded[i + 1];
    encoded[0] = ((encoded[0] ^ encoded[1]) + sum) & 255;
    const out = new Uint8Array(encoded.length);
    for (let i = 0; i < out.length; i++) out[i] = encoded[i] & 255;
    return out;
}

/** medusa 签名内嵌的 signKey（蓝本 buildMedusa 固定值）。 */
const APP_SIGN_KEY = hexToBytes('8ebdfa3806ecc5cee79423e6029ed82540bc2218bb7eaef71cb691f7aa8aa2f5');

function keyHash(random) {
    const input = concatBytes(concatBytes(APP_SIGN_KEY, le32(random)), APP_SIGN_KEY);
    const hash = sm3(input);
    const d1 = (random >> 16) & 255;
    const d2 = (((d1 << 11) | (random >>> 24)) ^ (d1 >> 5) ^ d1) | 0;
    return [hash, le32(~d2)];
}

/** SBOX：4×256 字节自研 AES 变体置换表（Java b64 常量 1:1）。 */
const SBOX = b64ToBytes('+n0Ia5xZs0sEXznQOEqRmQBnpiCf9U2Ccybu3xhmgzOAAxn72f6uqqmwUsYL83klTni0NqxdGieeiNu9PGPsSRXBMB/cuFbUbM3KCUPINaPvHvSW0vwOcnuUhNHqRVpiAj/TEoE0K91+5ijypUYTATsh9mE3KSoN7Yyvv51cuyR2D3XkU4nhmI2xmmVwT1RMWKtub4sjxAcRDLrPoKSO2AU9FLLadMPX577Wf95IFj6FkKFVt3dCIsmGUC4X+WQxLJvxbRxEaOPpqJOXyzJX6+Vxaq3AzMfF/WAdoi1Hp+JRaV56zgpBtpWP97mH4DoGEIq1+FvV8LyS/3wvwugbQOwb2r26mJEMsiuDQTRn+wrYdrVGBVlhI3WQhyrjUBVMrLF5667llUcEaPCGPVGLD8qO5LlO8hKCvA7V9+8oJc9bXelqVQLhM76T5/WtnT45JKji+hdX0HoNCDDWuKON/QeaxB5uImSX0h2wv0VmP2zd2yeApxHcpsVS+MC2yFwAc2B7oBkTqsk1SEvTpM2fmfMQREBUfin0Bh+iq6EvPPavhWI2IX9e3yAas7Tm/3KEj2UmlFp36kN4x0rMLBRrxuh0U/zUHM4xcAMYjJY4MonxOl/X+alpt2M3WMI7w3HLnpIBigtNiJu7T21v4P6lSd5WFgntnMEt7oF92XzRLkJbTcGmXepE/UVOG6E/0YnhfS+q26utWcuxzpooyeD2cDlK1/8w9d28VzsRjbLuALbmGlp8+d7EzS6Au7lMpZ+ECMZvQmzwJ+eLOpxR+2chdUExp8ogQyq3v9l68rX4jCwjg0+PYKAEEzcU4wHFY2ZcdIHfWL1okD3SszT0GZMyKdZJrg1L2AeerB4tC0C4crp2EHGo5FYdSP7lwkeR2ocmnR+Ia8CYviUJlzOjhRZef9xuVOn3qcjow3fQgivsAmKKkg4+sA8F8/GWeDiGNhg8JM8KtFPMYWWkx5TVFX5t73kiNRJqjlIGVXtGZFCV4gzt0xcDopuZ6xz8r9Rzafpf9ywev8jh8592gHFIqpStZPuJxmDDMrNN0uBE3V+oscdoIzTJbRJ/t+sVvqnReJOgDJKk10fjisJwqyZBmnmn2BSFj8BvVtCMEbkuPOKdzw7eA11GPs04Qw8zWtkaZWwiO/wwpojqN6K0jY5RnNZA7vn4hPSul+nKCkVnVwQvg1zVxcSCtqORmB9KrJaBbssbCQivGJVJfVTt+hYxOtq4ZvWl8f4QAQZ0zGPffCgl9s6yT4vlvIdpu4YhBwA25wtQWZsc6GJYGWHyvSdeuh3mmUI9DSq13Fsp8C1MU3tqc04/df9LoTUXVXI5INOw/e8C7Hd+5CvbkMEFnnrUUmskEw==');

function xt(x) {
    return ((x << 1) ^ ((x & 128) !== 0 ? 0x1b : 0)) & 255;
}

function aesMix(rows) {
    for (let i = 0; i < 4; i++) {
        const t = (rows[0][i] ^ rows[1][i] ^ rows[2][i] ^ rows[3][i]) | 0;
        const u0 = rows[0][i];
        rows[0][i] = (rows[0][i] ^ t ^ xt(rows[0][i] ^ rows[1][i])) & 255;
        rows[1][i] = (rows[1][i] ^ t ^ xt(rows[1][i] ^ rows[2][i])) & 255;
        rows[2][i] = (rows[2][i] ^ t ^ xt(rows[2][i] ^ rows[3][i])) & 255;
        rows[3][i] = (rows[3][i] ^ t ^ xt(rows[3][i] ^ u0)) & 255;
    }
}

/** 自研 AES 变体（蓝本 cjs AesV3 逐位对照，勿改轮常量/置换顺序）。 */
export class AesV3 {
    constructor(key, khronos) {
        this.wordSize = khronos & 3;
        this.box = SBOX.subarray(this.wordSize * 256, (this.wordSize + 1) * 256);
        const cons2 = [[1, 0, 2, 3], [2, 0, 3, 1], [0, 1, 3, 2], [1, 0, 2, 3]];
        const orders = [
            [0, 9, 14, 11, 4, 13, 2, 7, 8, 1, 6, 15, 12, 5, 10, 3],
            [0, 9, 14, 15, 4, 13, 2, 7, 8, 1, 6, 3, 12, 5, 10, 11],
            [0, 9, 14, 7, 4, 13, 2, 11, 8, 1, 6, 3, 12, 5, 10, 15],
            [0, 9, 14, 11, 4, 13, 2, 7, 8, 1, 6, 15, 12, 5, 10, 3],
        ];
        this.con2 = cons2[this.wordSize];
        this.order = orders[this.wordSize];
        const inits = [0xca025ddc, 0x823dc546, 0xc9420583, 0xc298225f];
        const init = inits[this.wordSize];
        const initial = new Uint8Array(16);
        for (let i = 0; i < 4; i++) initial.set(le32(init), i * 4);
        const expanded = new Int32Array(48);
        for (let i = 0; i < 16; i++) expanded[i] = (initial[i] ^ key[i]) & 255;
        let rounds = 8;
        for (let i = 4; i < 12; i++) {
            const at = 4 * (i - 1);
            let a = expanded[at] & 255;
            let b = expanded[at + 1] & 255;
            let c = expanded[at + 2] & 255;
            let d = expanded[at + 3] & 255;
            if ((i & 3) === 0) {
                const t = ((init >>> (rounds & 24)) ^ this.box[b]) & 255;
                b = this.box[c];
                c = this.box[d];
                d = this.box[a];
                a = t;
            }
            rounds += 2;
            expanded[at + 4] = (a ^ expanded[at - 12]) & 255;
            expanded[at + 5] = (b ^ expanded[at - 11]) & 255;
            expanded[at + 6] = (c ^ expanded[at - 10]) & 255;
            expanded[at + 7] = (d ^ expanded[at - 9]) & 255;
        }
        this.keys = [];
        for (let i = 0; i < 12; i++) {
            const row = [];
            for (let k = 0; k < 4; k++) row.push(expanded[i * 4 + k] & 255);
            this.keys.push(row);
        }
    }

    addCon(rows, base) {
        for (let i = 0; i < 4; i++) {
            for (let j = 0; j < 4; j++) rows[i][j] = (rows[i][j] ^ this.keys[base + i][this.con2[j]]) & 255;
        }
    }

    add(rows, base) {
        for (let i = 0; i < 4; i++) {
            for (let j = 0; j < 4; j++) rows[i][j] = (rows[i][j] ^ this.keys[base + i][j]) & 255;
        }
    }

    sub(rows) {
        for (let i = 0; i < 4; i++) {
            for (let j = 0; j < 4; j++) rows[i][j] = this.box[rows[i][j]] & 255; // box 为字节表，&255 防符号差异
        }
        const old = rows.map((r) => r.slice());
        for (let i = 0; i < 4; i++) rows[i] = old[this.con2[i]];
    }

    shift(rows) {
        const b = new Int32Array(16);
        for (let i = 0; i < 16; i++) b[i] = rows[(i / 4) | 0][i % 4];
        for (let i = 0; i < 16; i++) rows[(i / 4) | 0][i % 4] = b[this.order[i]];
    }

    shiftCon(rows) {
        const old = rows.map((r) => r.slice());
        for (let i = 0; i < 4; i++) {
            for (let j = 0; j < 4; j++) rows[i][j] = old[i][this.con2[j]];
        }
    }

    block(value) {
        const rows = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]];
        for (let i = 0; i < 4; i++) {
            for (let j = 0; j < 4; j++) rows[i][j] = value[i * 4 + j] & 255;
        }
        this.addCon(rows, 0);
        for (let i = 1; i < 3; i++) {
            this.sub(rows);
            this.shift(rows);
            if (i === 1) {
                this.shiftCon(rows);
                aesMix(rows);
            }
            this.addCon(rows, i * 4);
        }
        this.add(rows, 4);
        const out = new Uint8Array(16);
        for (let i = 0; i < 4; i++) {
            for (let j = 0; j < 4; j++) out[i * 4 + j] = rows[i][j] & 255;
        }
        return out;
    }

    encrypt(source, iv) {
        const plaintext = new Uint8Array(32);
        for (let i = 0; i < 31; i++) {
            const at = i * 8;
            const n0 = ((source[at] & 255) >> 4) & 2;
            const n1 = n0 | (source[at + 1] & 64);
            const n2 = n1 | (((source[at + 2] & 255) >> 2) & 1);
            const n3 = n2 | (((source[at + 3] & 255) << 3) & 128);
            const n4 = n3 | (((source[at + 4] & 255) >> 1) & 4);
            const n5 = n4 | (((source[at + 5] & 255) << 3) & 16);
            const n6 = n5 | (((source[at + 6] & 255) << 5) & 32);
            plaintext[i] = n6 | (((source[at + 7] & 255) >> 4) & 8);
        }
        plaintext[31] = 1;
        const key = new Uint8Array(32);
        let previous = iv.slice();
        for (let i = 0; i < 32; i += 16) {
            const x = new Uint8Array(16);
            for (let k = 0; k < 16; k++) x[k] = (plaintext[i + k] ^ previous[k]) & 255;
            const value = this.block(x);
            key.set(value, i);
            previous = value;
        }
        const out = source.slice();
        for (let i = 0; i < 31; i++) {
            const at = i * 8;
            const k = key[i] & 255;
            out[at] = (out[at] & 0xdf) | ((k << 4) & 32);
            out[at + 1] = (out[at + 1] & 0xbf) | (k & 64);
            out[at + 2] = (out[at + 2] & 0xfb) | ((k << 2) & 4);
            out[at + 3] = (out[at + 3] & 0xef) | ((k >> 3) & 16);
            out[at + 4] = (out[at + 4] & 0xf7) | ((k + k) & 8);
            out[at + 5] = (out[at + 5] & 0xfd) | ((k >> 3) & 2);
            out[at + 6] = (out[at + 6] & 0xfe) | ((k >> 5) & 1);
            out[at + 7] = (out[at + 7] & 0x7f) | ((k << 4) & 128);
        }
        return concatBytes(new Uint8Array([key[31]]), out);
    }
}

export function buildMedusa(url, body, khronos, deviceId) {
    const bodyMd5 = body != null ? md5Bytes(body) : ZEROS16;
    const query = url.substring(url.indexOf('?') + 1);
    const querySm3 = sm3(utf8ToBytes(query));
    const queryBodyTs = hashF13branch0(querySm3, bodyMd5, khronos);
    const nested = proto(protoFieldSint(1, 111), protoFieldSint(2, 10),
        protoFieldSint(3, 694367), protoFieldSint(5, 586952199));
    const messageRand = randUint32();
    const envLaunch = Math.floor(hooks.rand() * 21) + 100;
    const envPid = Math.floor(hooks.rand() * 2000) + 10001;
    const env = proto(
        protoFieldSint(1, envLaunch), protoFieldSint(2, 146331399), protoFieldSint(3, 146331396),
        protoFieldSint(5, 7), protoFieldStr(6, 'v04.06.04.03-bugfix'), protoFieldSint(7, envPid),
        protoFieldBytes(12, deviceProto(deviceId)),
        protoFieldBytes(13, proto(protoFieldSint(1, Math.floor(hooks.now() / 1000)),
            protoFieldSint(2, -2), protoFieldSint(4, 200))),
        protoFieldStr(14, '7.1.3.32'));
    const queryHash = sm3(concatBytes(utf8ToBytes(query),
        concatBytes(bodyMd5, utf8ToBytes('none'))));
    const message = proto(
        protoFieldBytes(1, hexToBytes('f7e85ffad7d7dc3bd62ac87057cf6118')),
        protoFieldSint(2, 3),
        protoFieldSint(3, messageRand >>> 0),
        protoFieldStr(4, '8662'),
        protoFieldStr(5, deviceId),
        protoFieldStr(6, '1588093228'),
        protoFieldStr(7, '7.1.3.32'),
        protoFieldStr(8, 'v04.06.04-ml-android'),
        protoFieldSint(9, 67503104),
        protoFieldBytes(10, hexToBytes('4001000000000000')),
        protoFieldSint(12, khronos >>> 0),
        protoFieldBytes(13, queryBodyTs),
        protoFieldBytes(14, querySm3.subarray(0, 6)),
        protoFieldBytes(15, nested),
        protoFieldStr(16, 'AXYQOS6n2m60x1fVZHIrH3iol'),
        protoFieldSint(17, khronos >>> 0),
        protoFieldBytes(19, queryHash),
        protoFieldStr(20, 'none'),
        protoFieldSint(21, 312),
        protoFieldBytes(23, env),
        protoFieldStr(24, '{"cmr":16777216,"cmr2":16777216,"un_h":1879194040,"vpn":0,'
            + '"kd":0,"fkd":3672518972,"pd":-1872573247,"dyn":"","do":0,"tk":true}'));
    const random = randUint32();
    const kh = keyHash(random);
    const transformed = concatBytes(hexToBytes('4001000000000000'), xmxor(message, kh[0]));
    for (let i = 0, j2 = transformed.length - 1; i < j2; i++, j2--) {
        const t2 = transformed[i];
        transformed[i] = transformed[j2];
        transformed[j2] = t2;
    }
    for (let i = 0; i < transformed.length; i++) transformed[i] ^= kh[1][(~i) & 3];
    const check = (((querySm3[0] & 255) & 63) << 14) | 0x18000001 | (((queryBodyTs[0] & 255) & 63) << 8);
    const xmRand = randUint32();
    const packed = concatBytes(new Uint8Array([0x35]),
        concatBytes(le32(xmRand), concatBytes(le32(check), concatBytes(transformed,
            new Uint8Array([(random >>> 16) & 255, (random >>> 24) & 255])))));
    const encrypted = new AesV3(hexToBytes('f1593376766ea98d34f31b057a9d5be4'), khronos)
        .encrypt(packed, hexToBytes('1fe109a4125283f418de9e051a969e12'));
    const versionB = hexToBytes('03000000f7e85ffad7d7dc3bd62ac87057cf6118');
    const prefix = new Uint8Array(20);
    for (let i = 0; i < 20; i += 4) {
        const w = (versionB[i] | (versionB[i + 1] << 8) | (versionB[i + 2] << 16) | (versionB[i + 3] << 24)) >>> 0;
        prefix.set(le32((w ^ khronos) >>> 0), i); // cjs readUInt32LE 小端
    }
    const tail = new Uint8Array([random & 255, (random >>> 8) & 255, 0, 1]);
    return bytesToB64(concatBytes(prefix, concatBytes(tail, encrypted)));
}

// ---------------- 编码（签名与 URL 必须同一份字节） ----------------

/**
 * cjs pythonUrlEncode 1:1：保留 A-Za-z0-9-_.~*，其余按 UTF-8 百分号大写编码。
 * values：JS 对象（插入序 = Java LinkedHashMap 语义）。
 */
export function pythonUrlEncode(values) {
    const sb = [];
    for (const k of Object.keys(values)) {
        sb.push(pythonEncodeValue(k) + '=' + pythonEncodeValue(values[k]));
    }
    return sb.join('&');
}

function pythonEncodeValue(v) {
    const bytes = utf8ToBytes(String(v));
    let sb = '';
    for (let i = 0; i < bytes.length; i++) {
        const c = bytes[i] & 255;
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57)
            || c === 45 || c === 95 || c === 46 || c === 126 || c === 42) {
            sb += String.fromCharCode(c);
        } else {
            sb += '%' + (c < 16 ? '0' : '') + c.toString(16).toUpperCase();
        }
    }
    return sb;
}

/** encodeValue：Java URLEncoder.encode(v,"UTF-8") + '+'→%20 + '%7E'→~ 的净效果。 */
export function encodeValue(v) {
    const bytes = utf8ToBytes(String(v));
    let sb = '';
    for (let i = 0; i < bytes.length; i++) {
        const c = bytes[i] & 255;
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57)
            || c === 46 || c === 45 || c === 95 || c === 42 || c === 126) {
            sb += String.fromCharCode(c);
        } else if (c === 32) {
            sb += '%20'; // URLEncoder 的 '+' 已被 replace("+","%20")
        } else {
            sb += '%' + (c < 16 ? '0' : '') + c.toString(16).toUpperCase();
        }
    }
    return sb;
}

/** encodeQuery（播放/详情 query 组装口径）：Map 插入序 + encodeValue。 */
export function encodeQuery(values) {
    const sb = [];
    for (const k of Object.keys(values)) sb.push(encodeValue(k) + '=' + encodeValue(values[k]));
    return sb.join('&');
}

// ---------------- App 搜索设备参数（蓝本 APP_DEVICE：DEVICE 顺序 + 版本覆盖 72232） ----------------

export function appDeviceParams(iid, deviceId) {
    const v = {};
    v.iid = iid;
    v.device_id = deviceId;
    v.ac = 'wifi';
    v.channel = 'update_64';
    v.aid = '8662';
    v.app_name = 'novelread';
    v.version_code = '72232';
    v.version_name = '7.2.2.32';
    v.device_platform = 'android';
    v.os = 'android';
    v.ssmix = 'a';
    v.device_type = '25053RT47C';
    v.device_brand = 'Redmi';
    v.language = 'zh';
    v.os_api = '36';
    v.os_version = '16';
    v.manifest_version_code = '72232';
    v.resolution = '1280*2772';
    v.dpi = '520';
    v.update_version_code = '72232';
    v.host_abi = 'arm64-v8a';
    v.dragon_device_type = 'phone';
    v.pv_player = '72232';
    v.compliance_status = '0';
    v.need_personal_recommend = '1';
    v.player_so_load = '1';
    v.is_android_pad_screen = '0';
    return v;
}

// ---------------- 设备注册（蓝本 DeviceRegister.kt：匿名、免签名、body 为原始二进制） ----------------

/** ttEncrypt KDF 常量（spade 解密共用，蓝本 SPADE_CONST）。 */
export const SPADE_CONST =
    '4dd4c2e6b83162090e52b3c7a6733ba41cb2462b829ab58a196b39db57177524f49baf7f08e8d68d26a72e37c1a95a2f1f05a51892aef2949732b62a38aadd58';

export const REG_MAGIC = new Uint8Array([0x74, 0x63, 0x05, 0x10, 0x00, 0x00]);

/**
 * ttEncrypt：MAGIC || rnd[32] || AES-128-CBC(SHA512(SHA512(rnd)+KDF_SALT), PKCS7(SHA512(data)||data))。
 * rnd 源：Java new Random().nextBytes（伪随机，JS randomBytes 口径一致）。
 */
export function ttEncrypt(data) {
    const rnd = random32();
    const derived = sha512Bytes(concatBytes(sha512Bytes(rnd), hexToBytes(SPADE_CONST)));
    const body = concatBytes(sha512Bytes(data), data);
    const padding = 16 - (body.length % 16);
    const padded = new Uint8Array(body.length + padding);
    padded.set(body, 0);
    for (let i = body.length; i < padded.length; i++) padded[i] = padding;
    return concatBytes(REG_MAGIC, concatBytes(rnd,
        aesCbcEnc(padded, derived.slice(0, 16), derived.slice(16, 32))));
}

/** 随机 32 字节（binutil randomBytes 依赖 Math.random，避免循环依赖就地实现） */
function random32() {
    const out = new Uint8Array(32);
    for (let i = 0; i < 32; i++) out[i] = Math.floor(hooks.rand() * 256);
    return out;
}

// ---------------- spade 解密：SHA512(seed)+常量 → AES-128-CBC（蓝本 MediaCrypto.decryptUrl） ----------------

/** AES-128-CBC NoPadding 解密（crypto-js 直调，key/iv 为二进制字节） */
function aesCbcDec(data, key, iv) {
    const CJ = globalThis.CryptoJS;
    return waToBytes(CJ.AES.decrypt(
        { ciphertext: wa(data) }, wa(key),
        { iv: wa(iv), mode: CJ.mode.CBC, padding: CJ.pad.NoPadding }));
}

export function decryptUrl(value, seed) {
    const raw = b64ToBytes(value);
    if (raw.length < 20 || (raw[0] & 255) !== 0xa8 || (raw[2] & 255) !== 1 || (raw[3] & 255) !== 0) {
        throw new Error('unsupported url envelope');
    }
    const h = sha512Bytes(concatBytes(sha512Bytes(seed), hexToBytes(SPADE_CONST)));
    const ctLen = Math.floor((raw.length - 4) / 16) * 16;
    const plain = aesCbcDec(raw.subarray(4, 4 + ctLen), h.slice(0, 16), h.slice(16, 32));
    let end = plain.length;
    const padding = plain[end - 1] & 255;
    if (padding >= 1 && padding <= 16 && padding <= end) end -= padding;
    while (end > 0 && (plain[end - 1] & 255) === 0) end--;
    return bytesToUtf8(plain.subarray(0, end));
}

export default {
    hooks, seedGolden, randUint32,
    rol32, ror32, le32, reverseByte,
    sm3, md5Bytes, ivOf, branchOf, branchOfBody, md5HexUpper, hashF13branch0, sumMd5,
    xGorgon, helios, buildMedusa, AesV3,
    pythonUrlEncode, encodeValue, encodeQuery, appDeviceParams,
    ttEncrypt, SPADE_CONST, REG_MAGIC, decryptUrl,
};

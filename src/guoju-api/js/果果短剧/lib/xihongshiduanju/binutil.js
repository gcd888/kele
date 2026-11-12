/**
 * binutil.js — 二进制/编码工具集（各 spider 共用，QuickJS 兼容，无平台依赖）。
 * 提供 hex / base64 / utf8 / 字节拼装 / 64 位 little-endian 读写 / 随机字节。
 */

const B64_TAB = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';
const B64_INV = (function () {
    const t = new Int16Array(128).fill(-1);
    for (let i = 0; i < 64; i++) t[B64_TAB.charCodeAt(i)] = i;
    t['-'.charCodeAt(0)] = 62;
    t['_'.charCodeAt(0)] = 63;
    return t;
})();

export function bytesToHex(bytes) {
    const out = [];
    for (let i = 0; i < bytes.length; i++) out.push((bytes[i] >> 4).toString(16) + (bytes[i] & 15).toString(16));
    return out.join('');
}

export function hexToBytes(hex) {
    const out = new Uint8Array(hex.length >> 1);
    for (let i = 0; i < out.length; i++) out[i] = parseInt(hex.substr(i * 2, 2), 16);
    return out;
}

/** bytes → base64（标准字母表，无换行，等价 Java NO_WRAP） */
export function bytesToB64(bytes) {
    let out = '';
    const len = bytes.length;
    let i = 0;
    for (; i + 2 < len; i += 3) {
        const n = (bytes[i] << 16) | (bytes[i + 1] << 8) | bytes[i + 2];
        out += B64_TAB[(n >> 18) & 63] + B64_TAB[(n >> 12) & 63] + B64_TAB[(n >> 6) & 63] + B64_TAB[n & 63];
    }
    if (i + 1 === len) {
        const n = bytes[i] << 16;
        out += B64_TAB[(n >> 18) & 63] + B64_TAB[(n >> 12) & 63] + '==';
    } else if (i + 2 === len) {
        const n = (bytes[i] << 16) | (bytes[i + 1] << 8);
        out += B64_TAB[(n >> 18) & 63] + B64_TAB[(n >> 12) & 63] + B64_TAB[(n >> 6) & 63] + '=';
    }
    return out;
}

/** base64 → bytes（容错 URL-safe _- 字符与 padding 缺省） */
export function b64ToBytes(str) {
    let s = String(str).replace(/[\r\n\s]/g, '').replace(/-/g, '+').replace(/_/g, '/');
    const pad = s.length % 4;
    if (pad === 2) s += '==';
    else if (pad === 3) s += '=';
    else if (pad === 1) return new Uint8Array(0);
    const out = new Uint8Array(s.length / 4 * 3);
    let o = 0, acc = 0, bits = 0;
    for (let i = 0; i < s.length; i++) {
        const c = s.charCodeAt(i);
        if (c === 61) break; // '='
        const v = c < 128 ? B64_INV[c] : -1;
        if (v < 0) continue;
        acc = (acc << 6) | v;
        bits += 6;
        if (bits >= 8) {
            bits -= 8;
            out[o++] = (acc >> bits) & 255;
        }
    }
    return out.subarray(0, o);
}

/** utf8 编码（支持增补平面） */
export function utf8ToBytes(str) {
    const out = [];
    for (let i = 0; i < str.length; i++) {
        let c = str.codePointAt(i);
        if (c > 0xffff) i++;
        if (c < 0x80) out.push(c);
        else if (c < 0x800) out.push(0xc0 | (c >> 6), 0x80 | (c & 63));
        else if (c < 0x10000) out.push(0xe0 | (c >> 12), 0x80 | ((c >> 6) & 63), 0x80 | (c & 63));
        else out.push(0xf0 | (c >> 18), 0x80 | ((c >> 12) & 63), 0x80 | ((c >> 6) & 63), 0x80 | (c & 63));
    }
    return new Uint8Array(out);
}

export function bytesToUtf8(bytes) {
    let out = '';
    let i = 0;
    while (i < bytes.length) {
        const b = bytes[i];
        let cp;
        if (b < 0x80) { cp = b; i += 1; }
        else if ((b & 0xe0) === 0xc0 && i + 1 < bytes.length) { cp = ((b & 31) << 6) | (bytes[i + 1] & 63); i += 2; }
        else if ((b & 0xf0) === 0xe0 && i + 2 < bytes.length) { cp = ((b & 15) << 12) | ((bytes[i + 1] & 63) << 6) | (bytes[i + 2] & 63); i += 3; }
        else if ((b & 0xf8) === 0xf0 && i + 3 < bytes.length) { cp = ((b & 7) << 18) | ((bytes[i + 1] & 63) << 12) | ((bytes[i + 2] & 63) << 6) | (bytes[i + 3] & 63); i += 4; }
        else { cp = b & 63; i += 1; } // 坏字节兜底
        out += String.fromCodePoint(cp);
    }
    return out;
}

export function concatBytes() {
    let len = 0;
    for (let i = 0; i < arguments.length; i++) len += arguments[i].length;
    const out = new Uint8Array(len);
    let at = 0;
    for (let i = 0; i < arguments.length; i++) {
        out.set(arguments[i], at);
        at += arguments[i].length;
    }
    return out;
}

/** 64 位 little-endian 读（返回 BigInt） */
export function le64(bytes, at) {
    let v = 0n;
    for (let i = 7; i >= 0; i--) v = (v << 8n) | BigInt(bytes[at + i] & 255);
    return v;
}

/** 64 位 little-endian 写（入参 BigInt，截断 64 位） */
export function putLe64(out, at, v) {
    let x = BigInt.asUintN(64, v);
    for (let i = 0; i < 8; i++) {
        out[at + i] = Number(x & 0xffn);
        x >>= 8n;
    }
}

/** 32 位大端写 */
export function be32(v) {
    return new Uint8Array([(v >>> 24) & 255, (v >>> 16) & 255, (v >>> 8) & 255, v & 255]);
}

/** 32 位大端读 */
export function be32read(bytes, at) {
    return ((bytes[at] << 24) | (bytes[at + 1] << 16) | (bytes[at + 2] << 8) | bytes[at + 3]) | 0;
}

/** 32 位大端读（无符号） */
export function u32read(bytes, at) {
    return (((bytes[at] << 24) | (bytes[at + 1] << 16) | (bytes[at + 2] << 8) | bytes[at + 3]) >>> 0);
}

/** 64 位大端读（返回 BigInt） */
export function be64read(bytes, at) {
    let v = 0n;
    for (let i = 0; i < 8; i++) v = (v << 8n) | BigInt(bytes[at + i] & 255);
    return v;
}

/** 随机字节（Math.random，非加密级——生态口径一致） */
export function randomBytes(n) {
    const out = new Uint8Array(n);
    for (let i = 0; i < n; i++) out[i] = Math.floor(Math.random() * 256);
    return out;
}

/** uuid v4 */
export function uuid4() {
    const h = '0123456789abcdef';
    const b = randomBytes(16);
    b[6] = (b[6] & 0x0f) | 0x40;
    b[8] = (b[8] & 0x3f) | 0x80;
    let s = '';
    for (let i = 0; i < 16; i++) {
        if (i === 4 || i === 6 || i === 8 || i === 10) s += '-';
        s += h[b[i] >> 4] + h[b[i] & 15];
    }
    return s;
}

/** pkcs7 填充（16 字节块） */
export function pkcs7Pad(data) {
    const pad = 16 - (data.length % 16);
    const out = new Uint8Array(data.length + pad);
    out.set(data, 0);
    for (let i = data.length; i < out.length; i++) out[i] = pad;
    return out;
}

/**
 * 大整数安全 JSON 解析：字符串外部 ≥16 位的裸数字字面量加引号再 parse
 * （vod_id/vid 等长 id 超出 Number 2^53 精度，尾数会丢失；Java org.json 走 BigInteger 无损，
 * JS 侧统一以此保护。状态机跳过字符串内部（含 \" 转义），避免破坏内嵌 JSON 字符串值；
 * 浮点数（数字后跟 .）不做加引号处理。）
 */
export function safeParse(text) {
    const s = String(text);
    let out = '';
    let inStr = false;
    let i = 0;
    while (i < s.length) {
        const c = s[i];
        if (inStr) {
            out += c;
            if (c === '\\') { out += s[i + 1] || ''; i += 2; continue; }
            if (c === '"') inStr = false;
            i++;
            continue;
        }
        if (c === '"') { inStr = true; out += c; i++; continue; }
        if (c >= '0' && c <= '9') {
            let j = i;
            while (j < s.length && s[j] >= '0' && s[j] <= '9') j++;
            const num = s.slice(i, j);
            if (num.length >= 16 && s[j] !== '.') {
                out += '"' + num + '"';
            } else {
                out += num;
            }
            i = j;
            continue;
        }
        out += c;
        i++;
    }
    return JSON.parse(out);
}

export default {
    bytesToHex, hexToBytes, bytesToB64, b64ToBytes,
    utf8ToBytes, bytesToUtf8, concatBytes,
    le64, putLe64, be32, be32read, u32read, be64read,
    randomBytes, uuid4, pkcs7Pad,
};

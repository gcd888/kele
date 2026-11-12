/**
 * host.mjs — node 桌面自测宿主桩
 *
 * 模拟壳内 JsSpider（E:\HelloWorld\project\guoju\app\src\main\java\com\github\catvod\crawler\js\）
 * 注入的宿主环境，语义逐条对齐：
 *   - req/_http(url, options)  → Connect.java/Req.java：{method, headers, data, postType,
 *     body, buffer(0文本/1字节数组/2base64), redirect(0/1), timeout} → {headers, content}
 *     同步语义经 Worker + Atomics.wait 实现（壳内为 Java 侧阻塞）。
 *   - aesX(mode, encrypt, input, inBase64, key, iv, outBase64) → Crypto.java
 *     （key/iv 不足 16 字节补 0；mode 拼 "Padding"；base64 输入做 _- → /+ 修正）
 *   - rsaX(pub, encrypt, ...) → Crypto.java（RSA/ECB/PKCS1，加密块 = modulus/8-11 分段）
 *   - rsaEncrypt/rsaDecrypt(data, key, options) → Global.java + RSAEncrypt
 *   - local.get/set/delete → local.java（Hawk 持久化；node 桩为内存 Map）
 *   - setTimeout(func, delay) → Global.java
 *   - joinUrl → HtmlParser.joinUrl（桩实现 = 标准 URL 合并）
 *   - getProxy/js2Proxy → 桩返回假代理地址
 *
 * 被测源写法 = 发布形态：QuickJS ESM `export default {init/home/homeVod/category/
 * detail/search/play/action/proxy}`，全局只用宿主注入 + ECMAScript 标准 +
 * crypto-js（壳对 crypto-js.js 有专门模块缓存，生态标准依赖）。
 */

import { Worker } from 'node:worker_threads';
import nodeCrypto from 'node:crypto';
import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import { fileURLToPath, pathToFileURL } from 'node:url';

// ---------------- 同步 HTTP（Worker + Atomics） ----------------

const WORKER_SRC = `
// 兼容 CJS/ESM 双模式 eval（Node 22 worker eval 可能按 ESM 求值，require 不可用）
(async () => {
  const wt = await import('node:worker_threads');
  const fsmod = await import('node:fs');
  const fs = fsmod.default || fsmod;
  const { workerData } = wt;
  const { sab, url, options } = workerData;
  const out = { headers: {}, content: '', err: '', code: 0 };
  try {
    const res = await fetch(url, {
      method: (options.method || 'get').toUpperCase(),
      headers: options.headers || {},
      body: options.body !== undefined ? options.body : undefined,
      redirect: options.redirect === 0 ? 'manual' : 'follow',
      signal: AbortSignal.timeout(Math.min(options.timeout || 20000, 60000)),
    });
    out.code = res.status;
    res.headers.forEach((v, k) => {
      out.headers[k] = out.headers[k] ? out.headers[k] + '\\n' + v : v;
    });
    const buf = Buffer.from(await res.arrayBuffer());
    if (options.buffer === 1) out.content = Array.from(buf);
    else if (options.buffer === 2) out.content = buf.toString('base64');
    else {
      let cs = options.charset || 'utf-8';
      try { out.content = new TextDecoder(cs.trim()).decode(buf); }
      catch (e) { out.content = buf.toString('utf-8'); }
    }
  } catch (e) { out.err = String(e && e.message || e); }
  try { fs.writeFileSync(workerData.tmpFile, JSON.stringify(out)); } catch (e) {}
  Atomics.store(new Int32Array(workerData.sab), 0, 1);
  Atomics.notify(new Int32Array(workerData.sab), 0);
})();
`;

let tmpSeq = 0;

function buildHttpBody(options) {
    const method = (options.method || 'get').toLowerCase();
    if (method !== 'post') return { method: 'get', body: undefined };
    const postType = options.postType || 'json';
    if (options.data !== undefined && options.data !== null) {
        if (postType === 'json') {
            return { body: typeof options.data === 'string' ? options.data : JSON.stringify(options.data), ctype: 'application/json' };
        }
        if (postType === 'form') {
            const params = new URLSearchParams();
            for (const [k, v] of Object.entries(options.data || {})) params.append(k, String(v));
            return { body: params.toString(), ctype: 'application/x-www-form-urlencoded' };
        }
        if (postType === 'form-data') {
            const boundary = '----dio-boundary-' + Math.floor(Math.random() * 42949) + Math.floor(Math.random() * 67296);
            let body = '';
            for (const [k, v] of Object.entries(options.data || {})) {
                body += `--${boundary}\r\nContent-Disposition: form-data; name="${k}"\r\n\r\n${v}\r\n`;
            }
            body += `--${boundary}--\r\n`;
            return { body, ctype: `multipart/form-data; boundary=${boundary}` };
        }
    }
    if (options.bodyB64) {
        // 壳 bodyB64 通道对齐：base64 → 原字节（Req.bodyB64 → Connect Base64.decode）
        const ctype = options.headers && (options.headers['Content-Type'] || options.headers['content-type']);
        return { body: Buffer.from(options.bodyB64, 'base64'), ctype };
    }
    if (options.body !== undefined && options.body !== null) {
        const ctype = options.headers && (options.headers['Content-Type'] || options.headers['content-type']);
        // 字节数组 body（二进制协议，如 ttEncrypt 注册体）：node fetch 原生支持 Uint8Array
        const raw = typeof options.body === 'string' ? String(options.body)
            : (Array.isArray(options.body) ? Buffer.from(options.body) : Buffer.from(options.body));
        return { body: raw, ctype };
    }
    return { body: '', ctype: undefined };
}

/** 同步 HTTP，对齐 Connect.success 返回 {headers, content}；失败 content='' */
export function syncReq(url, options = {}) {
    const { body, ctype } = buildHttpBody(options);
    const headers = Object.assign({}, options.headers || {});
    if (ctype && !headers['Content-Type'] && !headers['content-type']) headers['Content-Type'] = ctype;
    const method = (options.method || 'get').toLowerCase() === 'post' ? 'post' : 'get';
    const sab = new SharedArrayBuffer(8);
    const tmpFile = path.join(os.tmpdir(), `guojujs-req-${process.pid}-${tmpSeq++}.json`);
    const worker = new Worker(WORKER_SRC, {
        eval: true,
        workerData: { sab, url, tmpFile, options: Object.assign({}, options, { method, headers, body: method === 'post' ? body : undefined }) },
    });
    try {
        const res = Atomics.wait(new Int32Array(sab), 0, 0, Math.min(options.timeout || 20000, 65000) + 5000);
        if (res !== 'ok') return { headers: {}, content: '', code: 0 };
        const raw = fs.readFileSync(tmpFile, 'utf-8');
        const out = JSON.parse(raw);
        // 对齐 Java：headers 键取多值时首值（多值罕见）；content 原样；code = HTTP 状态码
        //（壳侧 Connect.success 不下发状态码，此字段为 lx 协议 statusCode 语义补齐，壳内不存在）
        const h = {};
        for (const [k, v] of Object.entries(out.headers || {})) h[k] = String(v).split('\n')[0];
        return { headers: h, content: out.content || '', code: out.code || 0 };
    } catch (e) {
        return { headers: {}, content: '', code: 0 };
    } finally {
        try { fs.unlinkSync(tmpFile); } catch (e) {}
        worker.terminate().catch(() => {});
    }
}

// ---------------- AES（对齐 Crypto.java） ----------------

function aesAlgo(modeFull, keyLen) {
    // Java "AES/CBC/PKCS5Padding" → node "aes-128-cbc"
    const m = /^AES\/(CBC|ECB|CTR|CFB|OFB)\/(No|PKCS5|PKCS7)Padding$/.exec(modeFull);
    if (!m) return null;
    const bits = { 16: 128, 24: 192, 32: 256 }[keyLen];
    if (!bits) return null;
    let trans = m[1].toLowerCase();
    if (m[1] === 'CFB' || m[1] === 'OFB' || m[1] === 'CTR') trans = 'aes-' + bits + '-' + m[1].toLowerCase();
    else trans = 'aes-' + bits + '-' + trans;
    return { alg: trans, noPad: m[2] === 'No', ecb: m[1] === 'ECB' };
}

function pkcs7Pad(buf, blockSize) {
    const pad = blockSize - (buf.length % blockSize);
    return Buffer.concat([buf, Buffer.alloc(pad, pad)]);
}

function pkcs7Unpad(buf, blockSize) {
    if (!buf.length) return buf;
    const pad = buf[buf.length - 1];
    if (pad < 1 || pad > blockSize) return buf;
    return buf.subarray(0, buf.length - pad);
}

export function aesX(mode, encrypt, input, inBase64, key, iv, outBase64) {
    try {
        let keyBuf = Buffer.from(key, 'utf-8');
        if (keyBuf.length < 16) keyBuf = Buffer.concat([keyBuf, Buffer.alloc(16 - keyBuf.length)]);
        let ivBuf = iv == null ? Buffer.alloc(0) : Buffer.from(iv, 'utf-8');
        if (ivBuf.length < 16) ivBuf = Buffer.concat([ivBuf, Buffer.alloc(16 - ivBuf.length)]);
        const full = mode.endsWith('Padding') ? mode : mode + 'Padding';
        const algo = aesAlgo(full, keyBuf.length);
        if (!algo) return '';
        let inBuf = inBase64
            ? Buffer.from(String(input).replaceAll('_', '/').replaceAll('-', '+'), 'base64')
            : Buffer.from(input, 'utf-8');
        const opts = algo.ecb ? undefined : Buffer.alloc(16, 0);
        const ivArg = algo.ecb ? null : (iv == null ? Buffer.alloc(16, 0) : ivBuf);
        const cipherOpts = { };
        if (!algo.ecb) cipherOpts.iv = ivArg;
        if (algo.noPad) cipherOpts.padding = false;
        let out;
        if (encrypt) {
            const c = nodeCrypto.createCipheriv(algo.alg, keyBuf, ivArg, cipherOpts);
            c.setAutoPadding(!algo.noPad);
            if (algo.noPad) inBuf = pkcs7Pad(inBuf, 16); // Java NoPadding 要求块对齐，异常则整体失败
            out = Buffer.concat([c.update(inBuf), c.final()]);
        } else {
            const d = nodeCrypto.createDecipheriv(algo.alg, keyBuf, ivArg, cipherOpts);
            d.setAutoPadding(!algo.noPad);
            out = d.update(inBuf);
            try { out = Buffer.concat([out, d.final()]); } catch (e) { out = pkcs7Unpad(out, 16); }
        }
        return outBase64 ? out.toString('base64') : out.toString('utf-8');
    } catch (e) {
        return '';
    }
}

// ---------------- RSA（对齐 Crypto.rsa 分段语义） ----------------

function loadRsaKey(pub, key) {
    let body = key;
    if (pub) body = body.replaceAll('\r\n', '').replaceAll('\n', '')
        .replace('-----BEGIN PUBLIC KEY-----', '').replace('-----END PUBLIC KEY-----', '');
    else body = body.replaceAll('\r\n', '').replaceAll('\n', '')
        .replace('-----BEGIN PRIVATE KEY-----', '').replace('-----END PRIVATE KEY-----', '');
    const der = Buffer.from(body, 'base64');
    if (pub) {
        const pem = '-----BEGIN PUBLIC KEY-----\n' + der.toString('base64') + '\n-----END PUBLIC KEY-----';
        return nodeCrypto.createPublicKey({ key: pem, format: 'pem' });
    }
    // PKCS8 私钥（Global.java rsaDecrypt 对齐：私钥解密必须拿到 PrivateKey 对象）。
    // 部分 APK 内置「私钥」实为 PKCS#1 RSAPrivateKey（如麦动 MuseCrypto），OpenSSL 3
    // 拒收 → 检测后重包装成标准 PKCS#8（SEQUENCE{INTEGER 0, AlgId rsaEncryption, OCTETSTRING}）。
    let pem;
    try {
        nodeCrypto.createPrivateKey({ key: pemP(der), format: 'pem' });
        pem = pemP(der);
    } catch (e) {
        pem = pemP(wrapPkcs1ToPkcs8(der));
    }
    return nodeCrypto.createPrivateKey({ key: pem, format: 'pem' });
}

function pemP(der) {
    return '-----BEGIN PRIVATE KEY-----\n' + der.toString('base64') + '\n-----END PRIVATE KEY-----';
}

function wrapPkcs1ToPkcs8(pkcs1) {
    const oid = Buffer.from([0x30, 0x0d, 0x06, 0x09, 0x2a, 0x86, 0x48, 0x86, 0xf7, 0x0d, 0x01, 0x01, 0x01, 0x05, 0x00]);
    const inner = Buffer.concat([Buffer.from([0x02, 0x01, 0x00]), oid, octetString(pkcs1)]);
    return derSeq(inner);
}

function octetString(body) {
    const head = derLen(body.length);
    return Buffer.concat([Buffer.concat([Buffer.from([0x04]), head]), body]);
}

function derSeq(body) {
    return Buffer.concat([Buffer.from([0x30]), derLen(body.length), body]);
}

function derLen(len) {
    if (len < 0x80) return Buffer.from([len]);
    const bytes = [];
    let v = len;
    while (v > 0) { bytes.unshift(v & 255); v >>= 8; }
    return Buffer.concat([Buffer.from([0x80 | bytes.length]), Buffer.from(bytes)]);
}

function rsaModulusBits(keyObj) {
    const jwk = keyObj.export({ format: 'jwk' });
    return Buffer.from(jwk.n, 'base64url').length * 8;
}

export function rsaX(pub, encrypt, input, inBase64, key, outBase64) {
    try {
        const keyObj = loadRsaKey(pub, key);
        const bits = rsaModulusBits(keyObj);
        let inBuf = inBase64
            ? Buffer.from(String(input).replaceAll('_', '/').replaceAll('-', '+'), 'base64')
            : Buffer.from(input, 'utf-8');
        const blockLen = encrypt ? bits / 8 - 11 : bits / 8;
        let out = Buffer.alloc(0);
        for (let i = 0; i < inBuf.length || (i === 0 && inBuf.length === 0); i += blockLen) {
            if (i >= inBuf.length && inBuf.length > 0) break;
            const chunk = inBuf.subarray(i, Math.min(i + blockLen, inBuf.length));
            const enc = {
                key: keyObj,
                padding: nodeCrypto.constants.RSA_PKCS1_PADDING,
            };
            const piece = encrypt
                ? nodeCrypto.publicEncrypt(enc, chunk)
                : nodeCrypto.privateDecrypt(enc, chunk);
            out = Buffer.concat([out, piece]);
            if (inBuf.length === 0) break;
        }
        return outBase64 ? out.toString('base64') : out.toString('utf-8');
    } catch (e) {
        return '';
    }
}

// ---------------- rsaEncrypt/rsaDecrypt（Global.java + RSAEncrypt 主路径） ----------------

export function rsaEncrypt(data, key, options) {
    try {
        const op = options || {};
        const type = op.type || 1;           // 1 公钥加密，2 私钥加密
        const mLong = op.long || 1;          // 1 普通，2 分段
        const pub = type === 1;
        const keyObj = loadRsaKey(pub, key);
        const bits = rsaModulusBits(keyObj);
        const inBuf = Buffer.from(data, 'utf-8');
        const blockLen = mLong === 2 ? bits / 8 - 11 : (op.block === false ? 117 : (inBuf.length <= bits / 8 - 11 ? inBuf.length : bits / 8 - 11));
        let out = Buffer.alloc(0);
        for (let i = 0; i < inBuf.length; i += blockLen) {
            const chunk = inBuf.subarray(i, Math.min(i + blockLen, inBuf.length));
            const enc = { key: keyObj, padding: nodeCrypto.constants.RSA_PKCS1_PADDING };
            const piece = pub ? nodeCrypto.publicEncrypt(enc, chunk) : nodeCrypto.privateEncrypt(enc, chunk);
            out = Buffer.concat([out, piece]);
        }
        return out.toString('base64');
    } catch (e) {
        return '';
    }
}

export function rsaDecrypt(encData, key, options) {
    try {
        const op = options || {};
        const type = op.type || 1;           // 1 私钥解密，2 公钥解密
        const priv = type === 1;
        const keyObj = loadRsaKey(!priv, key);
        const bits = rsaModulusBits(keyObj);
        const inBuf = Buffer.from(encData, 'base64');
        const blockLen = bits / 8;
        let out = Buffer.alloc(0);
        for (let i = 0; i < inBuf.length; i += blockLen) {
            const chunk = inBuf.subarray(i, Math.min(i + blockLen, inBuf.length));
            const enc = { key: keyObj, padding: nodeCrypto.constants.RSA_PKCS1_PADDING };
            const piece = priv ? nodeCrypto.privateDecrypt(enc, chunk) : nodeCrypto.publicDecrypt(enc, chunk);
            out = Buffer.concat([out, piece]);
        }
        return out.toString('utf-8');
    } catch (e) {
        return '';
    }
}

// ---------------- local / 定时器 / 杂项桩 ----------------

// local 持久化（对齐壳 Hawk：跨进程存活；node 桩落 tmp 文件，避免测试反复注册设备触发风控）
const LOCAL_FILE = path.join(os.tmpdir(), 'guojujs-local.json');
let localStore = {};
try { localStore = JSON.parse(fs.readFileSync(LOCAL_FILE, 'utf-8')); } catch (e) { localStore = {}; }
let localDirty = false;
process.on('exit', () => {
    if (!localDirty) return;
    try { fs.writeFileSync(LOCAL_FILE, JSON.stringify(localStore)); } catch (e) {}
});

export function resetLocal() { localStore = {}; localDirty = true; }

export function joinUrl(parent, child) {
    try {
        if (!child) return parent || '';
        if (/^https?:\/\//i.test(child)) return child;
        return new URL(child, parent).toString();
    } catch (e) {
        return (parent || '') + (child || '');
    }
}

// ---------------- 环境装配（对齐 JsSpider 全局注入） ----------------

/**
 * 注入壳宿主全局。必须在 import 被测源之前调用。
 * 全局清单与 Global.java @Function 一一对应。
 */
export function installHostGlobals() {
    const g = globalThis;
    // JsSpider.initializeJS: globalThis.req = http
    g.http = (url, options) => syncReq(url, options || {});
    g.req = g.http;
    g._http = (url, options) => {
        if (options && typeof options.complete === 'function') {
            // 异步形态：桩直接同步回调（自测场景足够）
            const r = syncReq(url, options);
            options.complete(r);
            return null;
        }
        return syncReq(url, options || {});
    };
    g.aesX = aesX;
    g.rsaX = rsaX;
    g.rsaEncrypt = rsaEncrypt;
    g.rsaDecrypt = rsaDecrypt;
    g.local = {
        get: (k, def) => (Object.prototype.hasOwnProperty.call(localStore, k) ? localStore[k] : (def === undefined ? '' : def)),
        set: (k, v) => { localStore[k] = v; localDirty = true; },
        delete: (k) => { delete localStore[k]; localDirty = true; },
    };
    g.setTimeout = (fn, delay) => globalThis.__nativeSetTimeout(fn, delay || 0);
    if (!g.__nativeSetTimeout) g.__nativeSetTimeout = g.setTimeout.bind(g);
    g.joinUrl = joinUrl;
    g.getProxy = (local) => 'http://127.0.0.1:9978/proxy?do=js';
    g.js2Proxy = (dynamic, siteType, siteKey, url, headers) =>
        'http://127.0.0.1:9978/proxy?do=js&from=catvod&siteType=' + siteType +
        '&siteKey=' + encodeURIComponent(siteKey || '') +
        '&header=' + encodeURIComponent(typeof headers === 'object' ? JSON.stringify(headers) : (headers || '{}')) +
        '&url=' + encodeURIComponent(url || '');
    g.pd = (html, rule, addUrl) => '';
    g.pdfh = (html, rule) => '';
    g.pdfa = (html, rule) => [];
    g.pdfla = () => [];
    g.s2t = (t) => t;
    g.t2s = (t) => t;
}

/**
 * 加载被测源（发布形态 ESM，export default 为 spider 对象）。
 * 相对 import 与壳 module loader（UriUtil.resolve + loadModule）语义一致：按文件相对路径解析。
 *
 * 预求值 crypto-js/pako：node 对无 package.json 的发布目录按 CJS 检测 UMD（走 exports 分支
 * 不挂 globalThis），壳 QuickJS evaluateModule 强制 ESM 无此差异——这里先用源码目录的
 * type:module ESM 实例求值挂载 globalThis（进程级单例），被测源模块内 const 捕获即可取到。
 */
export async function loadSpider(relPath) {
    installHostGlobals();
    await import('../lib/crypto-js.js');
    await import('../lib/pako.js');
    const abs = pathToFileURL(path.resolve(path.dirname(fileURLToPath(import.meta.url)), relPath)).href;
    const mod = await import(abs + '?t=' + Date.now());
    return mod.default;
}

/** catvod 协议断言：输出必须为字符串且可 JSON.parse */
export function mustJson(ret, label) {
    if (typeof ret !== 'string') throw new Error(label + ' 返回非字符串: ' + typeof ret);
    return JSON.parse(ret);
}

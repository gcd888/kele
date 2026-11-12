/**
 * golden_ktv.mjs — 麦动K歌 / lx 音源适配层金标验证
 *
 *  1) maidongktv（maidongktv.js）：
 *     - AES-GCM 标准向量 TC1（12B IV）+ node 原生 GCM 对照 TC2（16B IV / GHASH J0 路径）
 *     - MD5 标准向量（网关签名核心）
 *     - URLEncoder 语义（MuseApi/SongGateway 参数签名）
 *     - ThunderDecrypt 合成密文全链路（THUNDERCRYP3 密钥表 + interval 分段 + 明文去头）
 *     - RSA/ECB/PKCS1：APK 内置公钥加密结构校验（2048 位块）+ 自生成密钥对加解密回路
 *       （APK 公钥/私钥为不同密钥对——公钥加密上行、私钥解服务器响应，回路不适用）
 *     - LyricFetcher.cleanName 歌名清洗向量
 *  2) lxsource（lxsource.js）：
 *     - 装载 + init 冒烟（真实拉取 lx_xinghai.js，验 sources/handler 注册）
 *     - on(request) 同步桥：同步 handler → play 同步返回
 *     - 异步 handler（async + lx.request 同步桥 await）→ play 返回 Promise → 结果一致
 *     - 音质循环 + 探活失败链（不可达直链逐音质降级 → 空 → 兜底）
 *     - lxHttp statusCode 语义（node 桩 code 字段）
 *
 * 本地桩服务跑在 Worker 里：syncReq 的 Atomics.wait 会阻塞主线程事件循环，
 * 主线程 http 服务会与 worker fetch 死锁（worker 内自持服务无此问题）。
 *
 * 用法：node golden_ktv.mjs
 */

import { Worker } from 'node:worker_threads';
import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import nodeCrypto from 'node:crypto';
import { installHostGlobals, mustJson } from './host.mjs';

installHostGlobals();

// 原生 console 基线（lxsource init 会按 LxHost 语义覆盖 globalThis.console）
const out = globalThis.console.log.bind(globalThis.console);

let pass = 0, fail = 0;
const failures = [];

function check(name, ok, detail) {
    if (ok) { pass++; out('  PASS ' + name); }
    else { fail++; failures.push(name + (detail ? ' : ' + detail : '')); out('  FAIL ' + name + (detail ? ' : ' + detail : '')); }
}

function hex(b) {
    return Array.from(b).map((x) => x.toString(16).padStart(2, '0')).join('');
}

// 本地桩服务（Worker 内自持，端口经 message 回传）
const SERVER_SRC = `
(async () => {
  const http = await import('node:http');
  const wt = await import('node:worker_threads');
  const server = http.createServer((rq, rs) => {
    rs.writeHead(200, { 'Content-Type': 'application/octet-stream' });
    rs.end('x'.repeat(2048));
  });
  server.listen(0, '127.0.0.1', () => wt.parentPort.postMessage(server.address().port));
})();
`;
const serverWorker = new Worker(SERVER_SRC, { eval: true });
const port = await new Promise((r) => serverWorker.once('message', r));
out('  本地桩服务 http://127.0.0.1:' + port);

// ============================ 1) maidongktv 金标 ============================

out('===== maidongktv 金标 =====');

const ktv = await import('../maidongktv/maidongktv.js');
const K = ktv.__ktv;

// --- GCM NIST TC1：K=0(16B), IV=0(12B), P=空 → T=58e2fccefa7e3061367f1d57a4e7455a
{
    const o = K.aesGcmEncrypt(new Uint8Array(16), new Uint8Array(12), new Uint8Array(0));
    check('GCM TC1 tag (12B IV)', hex(o) === '58e2fccefa7e3061367f1d57a4e7455a', hex(o));
}
// --- GCM TC2（node 原生 GCM 对照）：K=0, IV=0(16B, 走 GHASH J0 路径), P=16 零字节
{
    const o = K.aesGcmEncrypt(new Uint8Array(16), new Uint8Array(16), new Uint8Array(16));
    check('GCM TC2 ct+tag (16B IV)',
        hex(o) === 'a3b22b8449afafbcd6c09f2cfa9de2bed8b820bab954bd1647d8a9c3d534e7a3', hex(o));
}
// --- GCM 12B IV 单块：P=16 零字节 → ct = E(CB2)，node 原生 AES-ECB 对照
{
    const o = K.aesGcmEncrypt(new Uint8Array(16), new Uint8Array(12), new Uint8Array(16));
    check('GCM 单块 ct (12B IV)', hex(o).startsWith('0388dace60b6a392f328c2b971b2fe78'), hex(o));
}
// --- GCM 多块 + 确定性 + node 原生对照
{
    const key = new Uint8Array(16).fill(0xfe);
    const iv = new Uint8Array(12).fill(0xca);
    const plain = new Uint8Array(100);
    for (let i = 0; i < plain.length; i++) plain[i] = i & 255;
    const o1 = K.aesGcmEncrypt(key, iv, plain);
    const o2 = K.aesGcmEncrypt(key, iv, plain);
    check('GCM 多块长度', o1.length === 100 + 16, String(o1.length));
    check('GCM 确定性', hex(o1) === hex(o2));
    const ci = nodeCrypto.createCipheriv('aes-128-gcm', Buffer.from(key), Buffer.from(iv));
    const ct = Buffer.concat([ci.update(Buffer.from(plain)), ci.final()]);
    const tag = ci.getAuthTag();
    check('GCM 多块 node 对照', hex(o1) === hex(Buffer.concat([ct, tag])), hex(o1));
}

// --- MD5 标准向量
check('MD5 abc', K.md5Hex('abc') === '900150983cd24fb0d6963f7d28e17f72', K.md5Hex('abc'));
check('MD5 空', K.md5Hex('') === 'd41d8cd98f00b204e9800998ecf8427e', K.md5Hex(''));

// --- URLEncoder 语义（MuseApi/SongGateway 签名参数；URLEncoder 不保留 ~，空格→'+'）
check('URLEncoder 中文+空格', K.javaUrlEncode('周 杰伦') === '%E5%91%A8+%E6%9D%B0%E4%BC%A6', K.javaUrlEncode('周 杰伦'));
check('URLEncoder 保留字符', K.javaUrlEncode('a.b-c*d_e') === 'a.b-c*d_e', K.javaUrlEncode('a.b-c*d_e'));
check('URLEncoder 特殊', K.javaUrlEncode('a!b~c') === 'a%21b%7Ec', K.javaUrlEncode('a!b~c'));

// --- ThunderDecrypt：THUNDERCRYP3 表 keyIdx0 / 4KB 段合成密文
{
    const segSize = 4096;
    const bodyLen = segSize * 3;
    const ts = new Uint8Array(bodyLen);
    ts[0] = 0x47;
    for (let i = 1; i < bodyLen; i++) ts[i] = (i * 31 + 7) & 255;

    function buildHeader(interval, firstEnc) {
        const head = new Uint8Array(512);
        head[0] = 0x41;
        head[53] = 0;                        // keyIdx = 0
        head[452] = segSize / 1024;          // 段大小（KB）
        head[453] = 0;                       // mode = 0 (AES/ECB/NoPadding)
        head[454] = interval;
        head[457] = firstEnc;
        const sig = 'THUNDERCRYP3';
        for (let i = 0; i < sig.length; i++) head[500 + i] = sig.charCodeAt(i);
        return head;
    }

    const keyHex = 'c6d3cdd0f1ebf5ded4d7d3cebbd3dad2cecdd0b8deaccbead2c5cac3c2dba6ac';
    const keyBytes = new Uint8Array(32);
    for (let i = 0; i < 32; i++) keyBytes[i] = parseInt(keyHex.substr(i * 2, 2), 16);
    const keyWa = CryptoJS.lib.WordArray.create(
        Array.from({ length: 8 }, (_, i) => (((keyBytes[i * 4] << 24) | (keyBytes[i * 4 + 1] << 16) | (keyBytes[i * 4 + 2] << 8) | keyBytes[i * 4 + 3]) | 0)), 32);

    function ecbEncBlock(block) {
        const c = CryptoJS.AES.encrypt(
            CryptoJS.lib.WordArray.create(Array.from({ length: 4 }, (_, i) => (((block[i * 4] << 24) | (block[i * 4 + 1] << 16) | (block[i * 4 + 2] << 8) | block[i * 4 + 3]) | 0)), 16),
            keyWa, { mode: CryptoJS.mode.ECB, padding: CryptoJS.pad.NoPadding });
        const o = new Uint8Array(16);
        for (let i = 0; i < 16; i++) o[i] = (c.ciphertext.words[i >>> 2] >>> (24 - (i % 4) * 8)) & 255;
        return o;
    }

    // case1：interval=0 全加密
    {
        const enc = new Uint8Array(ts);
        for (let off = 0; off < bodyLen; off += 16) {
            enc.set(ecbEncBlock(enc.subarray(off, off + 16)), off);
        }
        const file = new Uint8Array(512 + bodyLen);
        file.set(buildHeader(0, 0), 0);
        file.set(enc, 512);
        const dec = K.thunderDecryptAll(file);
        check('Thunder 全加密解密', hex(dec) === hex(ts), 'len=' + dec.length);
    }
    // case2：interval=2, firstEnc=0 → 加密段 {0,1,3,5,...}（seg==firstEnc 或 seg>firstEnc && seg%interval==1）
    {
        const enc = new Uint8Array(ts);
        const segs = bodyLen / segSize;
        for (let seg = 0; seg < segs; seg++) {
            const encSeg = seg === 0 || (seg > 0 && seg % 2 === 1);
            if (!encSeg) continue;
            const off = seg * segSize;
            for (let o = off; o < off + segSize; o += 16) {
                enc.set(ecbEncBlock(enc.subarray(o, o + 16)), o);
            }
        }
        const file = new Uint8Array(512 + bodyLen);
        file.set(buildHeader(2, 0), 0);
        file.set(enc, 512);
        const dec = K.thunderDecryptAll(file);
        check('Thunder interval 分段解密', hex(dec) === hex(ts), 'len=' + dec.length);
    }
    // case3：明文 TS（0x47 开头且 500 处无签名）→ 原样去头
    {
        const file = new Uint8Array(512 + bodyLen);
        file.set(buildHeader(0, 0), 0);
        file[0] = 0x47;
        for (let i = 500; i < 512; i++) file[i] = 0;
        file.set(ts, 512);
        const dec = K.thunderDecryptAll(file);
        check('Thunder 明文去头', hex(dec) === hex(ts));
    }
}

// --- RSA/ECB/PKCS1（宿主 rsaEncrypt/rsaDecrypt 桥）
{
    // APK 内置公钥：加密产出必须为 2048 位块（base64 344 字符）——公钥/私钥非同对
    //（公钥加密上行、私钥解服务器响应），回路不适用（MuseCrypto.java 结构如此）
    const enc = K.rsaEncryptB64('麦动K歌 device-id/get 载荷测试 1234567890abcdef');
    check('RSA APK 公钥加密块长', enc.length === 344, String(enc.length));
    const block = new Uint8Array(Buffer.from(enc, 'base64'));
    check('RSA APK 公钥密文块 256B', block.length === 256, String(block.length));
    // PKCS1 随机填充：同输入两次产出不同密文（EM^e mod n 首字节随机，00 02 在编码消息侧）
    const encB = K.rsaEncryptB64('麦动K歌 device-id/get 载荷测试 1234567890abcdef');
    check('RSA PKCS1 随机填充', enc !== encB);

    // 自生成密钥对回路：验证宿主 rsaDecrypt 桥（PKCS8 私钥）机制正确
    const { publicKey, privateKey } = nodeCrypto.generateKeyPairSync('rsa', { modulusLength: 2048 });
    const pubPem = publicKey.export({ type: 'spki', format: 'pem' }).toString();
    const privPem = privateKey.export({ type: 'pkcs8', format: 'pem' }).toString();
    const msg = '自生成密钥对回路 1234567890abcdef';
    const enc2 = globalThis.rsaEncrypt(msg, pubPem, { config: 'RSA/ECB/PKCS1Padding', type: 1, long: 1 });
    const dec2 = globalThis.rsaDecrypt(enc2, privPem, { config: 'RSA/ECB/PKCS1Padding', type: 1, long: 1 });
    check('RSA 自生成密钥对回路', dec2 === msg, dec2);
}

// --- LyricFetcher.cleanName 向量
{
    const cn = ktv.__ktv;
    check('cleanName 修饰后缀', cn.lyricCleanName('晴天 (Live)') === '晴天');
    check('cleanName 高清块', cn.lyricCleanName('晴天【高清】') === '晴天');
    check('cleanName HD 尾', cn.lyricCleanName('晴天 HD') === '晴天');
    check('cleanName 保留主体', cn.lyricCleanName('晴天') === '晴天');
}

// ============================ 2) lxsource 适配层验证 ============================

out('===== lxsource 适配层 =====');

// --- lxHttp statusCode 语义（node 桩 code 字段透传）
{
    const lx = await import('../luoxueyinyue/lxsource.js');
    const resp = lx.__lx.lxHttp('http://127.0.0.1:' + port + '/ping', '{}');
    check('lxHttp statusCode=200', resp.statusCode === 200, String(resp.statusCode));
    check('lxHttp body 内容', typeof resp.body === 'string' && resp.body.length === 2048, String(resp.body).length);
}

// --- 同步桥（同步 handler）
{
    const fake = path.join(os.tmpdir(), 'lx_fake_sync_' + process.pid + '.js');
    fs.writeFileSync(fake, `
const { EVENT_NAMES, on, send, env } = globalThis.lx;
if (env !== 'lx-music-mobile') throw new Error('env 桥缺失');
on(EVENT_NAMES.request, ({ action, source, info }) => {
    if (action === 'musicUrl') return 'http://127.0.0.1:${port}/fake/' + source + '_' + info.type + '_' + info.musicInfo.id;
    return null;
});
send(EVENT_NAMES.inited, { status: true, sources: { wy: { name: 'FakeSync', type: 'music', qualitys: ['320k', '128k'] } } });
`);
    const lx = await import('../luoxueyinyue/lxsource.js');
    await lx.default.init(fake);
    const st = lx.__lx.lxState();
    check('同步桥 init ready', st.ready === true);
    check('同步桥 handler 注册', st.handler === true);
    check('同步桥 sources 解析', st.sources.wy && st.sources.wy.name === 'FakeSync'
        && st.sources.wy.qualitys.length === 2, JSON.stringify(st.sources));
    const ret = await lx.default.play('果剧音乐', 'netease_12345', []);
    const j = mustJson(ret, 'play');
    check('同步桥 play 取得直链', j.url === 'http://127.0.0.1:' + port + '/fake/wy_320k_12345', String(j.url));

    // 音质循环：探活失败直链 → 逐音质降级 → 空 → 兜底（屏蔽聚合 API 域名保持离线）
    const fake2 = path.join(os.tmpdir(), 'lx_fake_fail_' + process.pid + '.js');
    fs.writeFileSync(fake2, `
const { EVENT_NAMES, on, send } = globalThis.lx;
on(EVENT_NAMES.request, ({ action }) => {
    if (action === 'musicUrl') return 'http://127.0.0.1:1/unreachable';
    return null;
});
send(EVENT_NAMES.inited, { status: true, sources: { wy: { name: 'FakeFail', type: 'music', qualitys: ['320k', '128k'] } } });
`);
    const realReq = globalThis.req;
    globalThis.req = (url, opts) => {
        if (String(url).includes('api.music.lerd.dpdns.org')) return { headers: {}, content: '', code: 0 };
        return realReq(url, opts);
    };
    try {
        await lx.default.init(fake2);
        const ret2 = await lx.default.play('果剧音乐', 'netease_999', []);
        check('探活失败全降级 → 空', ret2 === '', String(ret2).slice(0, 80));
    } finally {
        globalThis.req = realReq;
    }
}

// --- 异步桥（async handler + lx.request 同步桥 await）
{
    const fake = path.join(os.tmpdir(), 'lx_fake_async_' + process.pid + '.js');
    fs.writeFileSync(fake, `
const { EVENT_NAMES, request, on, send } = globalThis.lx;
on(EVENT_NAMES.request, async ({ action, source, info }) => {
    if (action === 'musicUrl') {
        let resp;
        await new Promise((resolve) => {
            request('http://127.0.0.1:${port}/ping', {}, (err, r) => { resp = r; resolve(); });
        });
        if (!resp || resp.statusCode !== 200) throw new Error('request 桥失败');
        return 'http://127.0.0.1:${port}/fake/async_' + info.type;
    }
    return null;
});
send(EVENT_NAMES.inited, { status: true, sources: { wy: { name: 'FakeAsync', type: 'music', qualitys: ['320k'] } } });
`);
    const lx = await import('../luoxueyinyue/lxsource.js');
    await lx.default.init(fake);
    const ret = await lx.default.play('果剧音乐', 'netease_abc', []);
    const j = mustJson(ret, 'play-async');
    check('异步桥 play 取得直链', j.url === 'http://127.0.0.1:' + port + '/fake/async_320k', String(j.url));
}

// --- 真实脚本 init 冒烟（lx_xinghai.js）
{
    const xinghai = 'E:/HelloWorld/project/kele/src/guoju-api/java/果果音乐/lib/lx/lx_xinghai.js';
    if (fs.existsSync(xinghai)) {
        const lx = await import('../luoxueyinyue/lxsource.js');
        await lx.default.init(xinghai);
        const st = lx.__lx.lxState();
        check('xinghai init ready', st.ready === true);
        check('xinghai handler 注册', st.handler === true);
        check('xinghai sources 解析（wy/tx/kg/kw/mg/qs）',
            ['wy', 'tx', 'kg', 'kw', 'mg', 'qs'].every((s) => st.sources[s] && st.sources[s].qualitys.length > 0),
            JSON.stringify(Object.keys(st.sources)));
        check('xinghai 头部元信息', st.name === '星海音乐源', st.name);
        const home = await lx.default.home(true);
        const hj = mustJson(home, 'home');
        check('xinghai home 类目', Array.isArray(hj.class) && hj.class.length === 6
            && hj.class[0].type_id === 'hot', JSON.stringify(hj.class && hj.class.map((c) => c.type_id)));
    } else {
        out('  SKIP xinghai 冒烟（脚本不存在）');
    }
}

serverWorker.terminate();

out('===== golden_ktv 结果：PASS ' + pass + ' / FAIL ' + fail + ' =====');
if (fail > 0) {
    for (const f of failures) out('  FAILED: ' + f);
    process.exit(1);
}
process.exit(0);

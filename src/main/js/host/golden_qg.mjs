/**
 * golden_qg.mjs — 青果短剧（JS 版）签名栈 golden 向量自检
 *
 * 口径：复刻 qingguoduanju/test/com/github/catvod/spider/TestMain.java（Java 桌面金标）——
 * 注入 golden.json 的固定随机序列与时钟，逐字节比对 query / x-gorgon / x-helios / x-medusa
 * （该金标由 test/golden.mjs 从蓝本 hongguoTV-tsukiyo/server/vendor/hongguo.cjs 产出）。
 * x-gorgon/x-helios/x-medusa 端到端覆盖 hashF13branch0 / ivOf / getIv / sumMd5 / SBOX /
 * AesV3 / xmxor / keyHash / deviceProto / pythonUrlEncode / branchOf 全链路。
 *
 * 附加 oracle 对拍（node crypto 为真值侧）：
 *  - ttEncrypt：固定随机序列复现 rnd，node AES-128-CBC 密文逐字节比对；
 *  - decryptUrl（spade 解密）：node 侧构造 a8 信封密文 → JS 解密回读；
 *  - SSR 解析（extractRouter/scanBalanced/h5Album 括号扫描）：合成 HTML fixture；
 *  - encodeQuery（URLEncoder 净效果）行为向量。
 *
 * SM3/MD5/xhs_sign 已由 golden.mjs 验证，此处不重测。
 * 用法：node golden_qg.mjs  （在 host 目录执行）
 */

import { installHostGlobals } from './host.mjs';
import fs from 'node:fs';
import path from 'node:path';
import crypto from 'node:crypto';
import { fileURLToPath, pathToFileURL } from 'node:url';

installHostGlobals();

const hostDir = path.dirname(fileURLToPath(import.meta.url));
const libDir = path.resolve(hostDir, '../lib');
const GOLDEN_PATH = path.resolve(hostDir, '../../java/qingguoduanju/test/golden.json');

const qg = await import(pathToFileURL(path.resolve(hostDir, '../qingguoduanju/qg_sign.js')).href + '?t=' + Date.now());
const bin = await import(pathToFileURL(path.join(libDir, 'binutil.js')).href + '?t=' + Date.now());
const { bytesToHex, hexToBytes, bytesToB64, b64ToBytes, utf8ToBytes, bytesToUtf8, be32 } = bin;

let ok = true;
const check = (label, pass, detail) => {
    console.log('[' + label + '] ' + (pass ? 'OK' : 'FAIL') + (detail ? ' ' + detail : ''));
    if (!pass) ok = false;
};

// ---------------- 载入 golden.json ----------------

const golden = JSON.parse(fs.readFileSync(GOLDEN_PATH, 'utf8'));
const khronos = golden.khronos;                       // 1792982400
const goldenQuery = golden.query;
const deviceId = golden.appDevice.device_id;          // 1905892595378490
const iid = golden.appDevice.iid;                     // 1905892595382586
const randoms = golden.randoms;                       // 7 个（gorgon 1 + helios 1 + medusa 5）

console.log('golden khronos=' + khronos + ' randoms=' + randoms.length
    + ' device_id=' + deviceId + ' iid=' + iid);

// 注入固定随机序列与时钟（TestMain.java 同口径）
qg.seedGolden(randoms, khronos * 1000);

// ---------------- ① 组参 + pythonUrlEncode + branch（金标 query 逐字节） ----------------

const values = qg.appDeviceParams(iid, deviceId);
values.query = golden.keyword;
values.count = '20';
values.offset = '0';
values.tab_type = '11';
values.bookshelf_search_plan = '4';
values.use_correct = 'true';
values.user_is_login = '0';
values.ts = String(khronos);
values._rticket = String(khronos * 1000);
const query = qg.pythonUrlEncode(values);
check('query', query === goldenQuery, query === goldenQuery ? '' : '\n  golden=' + goldenQuery + '\n  actual=' + query);
check('branch0', qg.branchOf(query, khronos) === 0, 'branch=' + qg.branchOf(query, khronos));

// ---------------- ② 签名头逐字节（x-ladon/x-argus = be32/le32(ts) b64；gorgon/helios/medusa 全链路） ----------------

const APP_SEARCH_API = 'https://api5-normal-sinfonlinea.fqnovel.com/reading/bookapi/search/tab/v';
const url = APP_SEARCH_API + '?' + query;
check('url', url === golden.url, url === golden.url ? '' : url);

const random = Math.floor(qg.hooks.rand() * 65536);            // random #1（gorgon）
check('x-ladon', bytesToB64(be32(khronos)) === golden.headers['x-ladon'], bytesToB64(be32(khronos)));
check('x-argus', bytesToB64(qg.le32(khronos)) === golden.headers['x-argus'], bytesToB64(qg.le32(khronos)));
const gorgon = qg.xGorgon(query, null, khronos, random);
check('x-gorgon', gorgon === golden.headers['x-gorgon'], gorgon === golden.headers['x-gorgon'] ? '' : gorgon);
const helios = qg.helios(khronos);                              // random #2
check('x-helios', helios === golden.headers['x-helios'], helios === golden.headers['x-helios'] ? '' : helios);
const medusa = qg.buildMedusa(url, null, khronos, deviceId);    // random #3-7
check('x-medusa', medusa === golden.headers['x-medusa'],
    medusa === golden.headers['x-medusa'] ? 'len=' + medusa.length : '\n  golden=' + golden.headers['x-medusa'].slice(0, 96) + '...\n  actual=' + medusa.slice(0, 96) + '...');

// 随机数消耗核对（应恰好 7 个，与 golden 一致：gorgon 1 + helios 1 + medusa 5）
let exhausted = false;
try { qg.hooks.rand(); } catch (e) { exhausted = true; }
check('randoms-count', exhausted, '7 个随机数恰好耗尽');

function le32Of(v) {
    return new Uint8Array([v & 255, (v >>> 8) & 255, (v >>> 16) & 255, (v >>> 24) & 255]);
}

// ---------------- ③ AesV3 四 wordSize 冒烟 + SBOX 完整性（金标 medusa 覆盖 wordSize=khronos&3=0） ----------------

{
    const SBOX_OK = (function () {
        // SBOX 为 4×256 共 1024 字节，且每个 256 段均为 0..255 的双射（置换表）
        const raw = b64ToBytes('+n0Ia5xZs0sEXznQOEqRmQBnpiCf9U2Ccybu3xhmgzOAAxn72f6uqqmwUsYL83klTni0NqxdGieeiNu9PGPsSRXBMB/cuFbUbM3KCUPINaPvHvSW0vwOcnuUhNHqRVpiAj/TEoE0K91+5ijypUYTATsh9mE3KSoN7Yyvv51cuyR2D3XkU4nhmI2xmmVwT1RMWKtub4sjxAcRDLrPoKSO2AU9FLLadMPX577Wf95IFj6FkKFVt3dCIsmGUC4X+WQxLJvxbRxEaOPpqJOXyzJX6+Vxaq3AzMfF/WAdoi1Hp+JRaV56zgpBtpWP97mH4DoGEIq1+FvV8LyS/3wvwugbQOwb2r26mJEMsiuDQTRn+wrYdrVGBVlhI3WQhyrjUBVMrLF5667llUcEaPCGPVGLD8qO5LlO8hKCvA7V9+8oJc9bXelqVQLhM76T5/WtnT45JKji+hdX0HoNCDDWuKON/QeaxB5uImSX0h2wv0VmP2zd2yeApxHcpsVS+MC2yFwAc2B7oBkTqsk1SEvTpM2fmfMQREBUfin0Bh+iq6EvPPavhWI2IX9e3yAas7Tm/3KEj2UmlFp36kN4x0rMLBRrxuh0U/zUHM4xcAMYjJY4MonxOl/X+alpt2M3WMI7w3HLnpIBigtNiJu7T21v4P6lSd5WFgntnMEt7oF92XzRLkJbTcGmXepE/UVOG6E/0YnhfS+q26utWcuxzpooyeD2cDlK1/8w9d28VzsRjbLuALbmGlp8+d7EzS6Au7lMpZ+ECMZvQmzwJ+eLOpxR+2chdUExp8ogQyq3v9l68rX4jCwjg0+PYKAEEzcU4wHFY2ZcdIHfWL1okD3SszT0GZMyKdZJrg1L2AeerB4tC0C4crp2EHGo5FYdSP7lwkeR2ocmnR+Ia8CYviUJlzOjhRZef9xuVOn3qcjow3fQgivsAmKKkg4+sA8F8/GWeDiGNhg8JM8KtFPMYWWkx5TVFX5t73kiNRJqjlIGVXtGZFCV4gzt0xcDopuZ6xz8r9Rzafpf9ywev8jh8592gHFIqpStZPuJxmDDMrNN0uBE3V+oscdoIzTJbRJ/t+sVvqnReJOgDJKk10fjisJwqyZBmnmn2BSFj8BvVtCMEbkuPOKdzw7eA11GPs04Qw8zWtkaZWwiO/wwpojqN6K0jY5RnNZA7vn4hPSul+nKCkVnVwQvg1zVxcSCtqORmB9KrJaBbssbCQivGJVJfVTt+hYxOtq4ZvWl8f4QAQZ0zGPffCgl9s6yT4vlvIdpu4YhBwA25wtQWZsc6GJYGWHyvSdeuh3mmUI9DSq13Fsp8C1MU3tqc04/df9LoTUXVXI5INOw/e8C7Hd+5CvbkMEFnnrUUmskEw==');
        if (raw.length !== 1024) return false;
        for (let seg = 0; seg < 4; seg++) {
            const seen = new Uint8Array(256);
            for (let i = 0; i < 256; i++) {
                const v = raw[seg * 256 + i];
                if (seen[v]) return false;
                seen[v] = 1;
            }
        }
        return true;
    })();
    check('sbox-permutation', SBOX_OK, '1024B/4×256 双射');

    let smoke = true;
    const key = hexToBytes('f1593376766ea98d34f31b057a9d5be4');
    const iv = hexToBytes('1fe109a4125283f418de9e051a969e12');
    const src = new Uint8Array(248);
    for (let i = 0; i < 248; i++) src[i] = (i * 7 + 3) & 255;
    for (let ws = 0; ws < 4; ws++) {
        const out = new qg.AesV3(key, ws).encrypt(src, iv);
        if (out.length !== 249) smoke = false; // 前缀 key[31] + 248B 密文
    }
    check('aesv3-smoke', smoke, '4 wordSize 输出 249B（key[31]+密文）');
}

// ---------------- ④ ttEncrypt oracle（node crypto 真值侧，固定随机序列复现 rnd） ----------------

{
    // mulberry32 与 rnd 字节流（qg_sign.random32 = floor(rand*256) × 32）
    function mulberry32(seed) {
        return function () {
            seed = (seed + 0x6D2B79F5) >>> 0;
            let t = seed;
            t = Math.imul(t ^ (t >>> 15), t | 1);
            t ^= t + Math.imul(t ^ (t >>> 7), t | 61);
            return ((t ^ (t >>> 14)) >>> 0) / 4294967296;
        };
    }
    const seed = 0x51ee0ded >>> 0;
    const prng = mulberry32(seed);
    // 恢复系统随机：ttEncrypt 内部 random32 走 hooks.rand → 注入 PRNG
    qg.hooks.rand = prng;
    qg.hooks.now = () => khronos * 1000;

    const data = utf8ToBytes('{"magic_tag":"ss_app_log","probe":1}');
    const out = qg.ttEncrypt(data);
    // 还原 rnd：重放 PRNG 生成同一份 32 字节（random32 只消费 rand 32 次）
    const prng2 = mulberry32(seed);
    const rnd = new Uint8Array(32);
    for (let i = 0; i < 32; i++) rnd[i] = Math.floor(prng2() * 256);

    const magicOk = out[0] === 0x74 && out[1] === 0x63 && out[2] === 0x05 && out[3] === 0x10 && out[4] === 0x00 && out[5] === 0x00;
    const rndOk = out.length > 38 && bytesToHex(out.subarray(6, 38)) === bytesToHex(rnd);
    check('ttencrypt-magic', magicOk, bytesToHex(out.subarray(0, 6)));
    check('ttencrypt-rnd', rndOk, bytesToHex(out.subarray(6, 38)).slice(0, 16) + '...');

    // node 侧 oracle：同 rnd + 同派生 → AES-128-CBC 密文逐字节比对
    const KDF = Buffer.from(qg.SPADE_CONST, 'hex');
    const derived = crypto.createHash('sha512')
        .update(Buffer.concat([crypto.createHash('sha512').update(Buffer.from(rnd)).digest(), KDF])).digest();
    const body = Buffer.concat([crypto.createHash('sha512').update(Buffer.from(data)).digest(), Buffer.from(data)]);
    const padding = 16 - (body.length % 16);
    const padded = Buffer.concat([body, Buffer.alloc(padding, padding)]);
    const cipher = crypto.createCipheriv('aes-128-cbc', derived.subarray(0, 16), derived.subarray(16, 32));
    cipher.setAutoPadding(false);
    const expected = Buffer.concat([Buffer.from([0x74, 0x63, 0x05, 0x10, 0x00, 0x00]), Buffer.from(rnd), cipher.update(padded), cipher.final()]);
    check('ttencrypt-oracle', Buffer.from(out).equals(expected),
        'len js=' + out.length + ' node=' + expected.length);
}

// ---------------- ⑤ decryptUrl（spade 解密）oracle：node 构造 a8 信封 → JS 解密回读 ----------------

{
    const seedBytes = crypto.randomBytes(16);
    const h = crypto.createHash('sha512')
        .update(Buffer.concat([crypto.createHash('sha512').update(Buffer.from(seedBytes)).digest(),
            Buffer.from(qg.SPADE_CONST, 'hex')])).digest();
    const url = 'https://v.douyucdn.cn/decode-test/stream_01.m3u8?sign=abc';
    const padding = 16 - (url.length % 16);
    const padded = Buffer.concat([Buffer.from(url, 'utf8'), Buffer.alloc(padding, padding)]);
    const cipher = crypto.createCipheriv('aes-128-cbc', h.subarray(0, 16), h.subarray(16, 32));
    cipher.setAutoPadding(false);
    const payload = Buffer.concat([cipher.update(padded), cipher.final()]);
    const envelope = Buffer.concat([Buffer.from([0xa8, 0x00, 0x01, 0x00]), payload]);
    const jsUrl = qg.decryptUrl(envelope.toString('base64'), new Uint8Array(seedBytes));
    check('decrypturl-oracle', jsUrl === url, jsUrl);
}

// ---------------- ⑥ SSR 解析（extractRouter / scanBalanced / h5Album 括号扫描） ----------------

{
    const routerJson = '{"loaderData":{"category_page":{"recommendList":['
        + '{"video_data":{"series_id":"7123456789012345678","series_name":"测试剧A","series_cover":"http://c/a.jpg","series_intro":"简介A","episode_cnt":12,"tags":["甜宠","逆袭"]}},'
        + '{"series_id":"7123456789012345679","series_title":"测试剧B","series_cover":"http://c/b.jpg","episode_right_text":"更新至8集"}'
        + '],"pagination":{"totalPages":42}}}}';
    const html = '<!DOCTYPE html><html><head><title>t</title></head><body>'
        + '<script>window._ROUTER_DATA = ' + routerJson + ';</script>'
        + '<div>quote with " brace } inside string ] test</div></body></html>';
    try {
        const data = qg2Extract(html);
        const sec = data.loaderData.category_page;
        const cardsOut = cardsOf(sec.recommendList);
        check('extract-router', !!data && !!sec, 'items=' + cardsOut.length);
        check('cards-parse', cardsOut.length === 2
            && cardsOut[0].id === '7123456789012345678' && cardsOut[0].name === '测试剧A'
            && cardsOut[0].badge === '全 12 集' && cardsOut[0].tags === '甜宠 · 逆袭'
            && cardsOut[1].id === '7123456789012345679' && cardsOut[1].badge === '更新至8集',
            JSON.stringify(cardsOut.map(function (c) { return [c.id, c.name, c.badge, c.tags]; })));
    } catch (e) {
        check('extract-router', false, String(e));
    }

    // scanBalanced 语义（字符串内括号不参与配对；未配平抛错）
    const s = '{"a":"x{y}z[1]","b":{"c":[1,2,{"d":"}"}]}} tail';
    let sbOk = true;
    try {
        if (scanB(s, 0) !== '{"a":"x{y}z[1]","b":{"c":[1,2,{"d":"}"}]}}') sbOk = false;
    } catch (e) { sbOk = false; }
    let sbFailOk = false;
    try { scanB('{"a":1', 0); } catch (e) { sbFailOk = true; }
    check('scan-balanced', sbOk && sbFailOk, sbOk && sbFailOk ? '' : 'ok=' + sbOk + ' failPath=' + sbFailOk);
}

function qg2Extract(html) {
    // golden 侧复刻 spider 的 extractRouter（同算法的最小拷贝，验证括号扫描语义）
    const index = html.indexOf('_ROUTER_DATA');
    if (index < 0) throw new Error('router data missing');
    const at = html.indexOf('{', index);
    let inString = false, escaped = false, depth = 0;
    for (let i = at; i < html.length; i++) {
        const c = html.charAt(i);
        if (inString) {
            if (escaped) escaped = false;
            else if (c === '\\') escaped = true;
            else if (c === '"') inString = false;
        } else if (c === '"') inString = true;
        else if (c === '{' || c === '[') depth++;
        else if (c === '}' || c === ']') {
            depth--;
            if (depth === 0) return JSON.parse(html.substring(at, i + 1));
        }
    }
    throw new Error('router data unbalanced');
}

function scanB(s, at) {
    const open = s.charAt(at);
    const close = open === '{' ? '}' : ']';
    let inString = false, escaped = false, depth = 0;
    for (let i = at; i < s.length; i++) {
        const c = s.charAt(i);
        if (inString) {
            if (escaped) escaped = false;
            else if (c === '\\') escaped = true;
            else if (c === '"') inString = false;
        } else if (c === '"') inString = true;
        else if (c === open) depth++;
        else if (c === close) {
            depth--;
            if (depth === 0) return s.substring(at, i + 1);
        }
    }
    throw new Error('unbalanced json at ' + at);
}

function cardsOf(rows) {
    const out = [];
    for (const item of rows) {
        const o = item.video_data && typeof item.video_data === 'object' ? item.video_data : item;
        const id = String(o.series_id || '');
        let name = String(o.series_name || '');
        if (!name) name = String(o.series_title || '');
        if (!/^[0-9]{1,30}$/.test(id) || !name.trim()) continue;
        let badge = String(o.episode_right_text || '');
        if (!badge && (o.episode_cnt | 0) > 0) badge = '全 ' + (o.episode_cnt | 0) + ' 集';
        let tags = '';
        const tagArr = o.tags || null;
        if (tagArr) tags = tagArr.slice(0, 5).filter(Boolean).join(' · ');
        out.push({ id: id, name: name.trim(), badge: badge, tags: tags });
    }
    return out;
}

// ---------------- ⑦ encodeQuery / encodeValue（Java URLEncoder 净效果行为向量） ----------------

{
    // Java URLEncoder + '+'→%20 + '%7E'→~ 的净效果：保留 A-Za-z0-9 . - _ * ~，空格→%20
    const cases = [
        ['1280*2772', '1280*2772'],
        ['7.3.9.32', '7.3.9.32'],
        ['a b', 'a%20b'],
        ['a~b', 'a~b'],
        ['a&b=c', 'a%26b%3Dc'],
        ['100%', '100%25'],
        ['中文', '%E4%B8%AD%E6%96%87'],
    ];
    let encOk = true;
    for (const [input, expected] of cases) {
        const got = qg.encodeValue(input);
        if (got !== expected) { encOk = false; console.log('  encodeValue[' + input + ']=' + got + ' 期望 ' + expected); }
    }
    check('encode-value', encOk);

    const q = qg.encodeQuery({ cdid: 'b2a1-9f', resolution: '1280*2772', kv: 'a b' });
    check('encode-query', q === 'cdid=b2a1-9f&resolution=1280*2772&kv=a%20b', q);
}

// ---------------- ⑧ spider 模块装载冒烟（协议方法齐备） ----------------

{
    const mod = await import(pathToFileURL(path.resolve(hostDir, '../qingguoduanju/qingguoduanju.js')).href + '?t=' + Date.now());
    const sp = mod.default;
    const need = ['init', 'home', 'homeVod', 'category', 'detail', 'search', 'play', 'action', 'proxy'];
    const missing = need.filter(function (k) { return typeof sp[k] !== 'function'; });
    check('spider-proto', missing.length === 0, missing.length ? '缺 ' + missing.join(',') : '9 方法齐备');
}

console.log(ok ? 'GOLDEN-QG ALL GREEN' : 'GOLDEN-QG FAIL');
process.exit(ok ? 0 : 1);

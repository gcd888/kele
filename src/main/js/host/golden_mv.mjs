/**
 * golden_mv.mjs — 果果音乐四个 MV 站点源（JS 版）golden 自检
 *
 * 口径：GoldenGen.java（一次性 Java 真值程序，算法体逐行复刻 MusicCore.weapi / linuxEparams /
 * enc，固定 secKey='abcdefghijklmnop' 输入）产出 golden_mv.json，JS 侧逐字节比对。
 * 覆盖：
 *  ① weapi 双重 AES-CBC-128 + RSA(NoPadding modPow 左补零 256)——params/encSecKey 两字段全对拍
 *     （mv 取流载荷 {"id","r","csrf_token"} 与 mv 搜索载荷 {"s","type","limit","offset","csrf_token"}
 *      两种形态，含中文多字节 UTF-8）；
 *  ② linuxEparams AES-128-ECB(LINUX_KEY hex 字节) + 大写 HEX；
 *  ③ enc()（java.net.URLEncoder 净效果：+→%20、!~'() 额外转义、中文多字节）；
 *  ④ 四源 spider 8 方法装载冒烟（init/home/homeVod/category/detail/search/play/action 齐备、
 *     home(false) 离线可解析出 class 结构、uid 前缀约定）。
 *
 * 线上冒烟（search/detail/play 真实取流）由 run.mjs 单独执行，见任务报告。
 * 用法：node golden_mv.mjs  （在 host 目录执行）
 */

import { installHostGlobals, loadSpider } from './host.mjs';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath, pathToFileURL } from 'node:url';

installHostGlobals();

const hostDir = path.dirname(fileURLToPath(import.meta.url));
const libDir = path.resolve(hostDir, '../lib');
const spiderDir = path.resolve(hostDir, '../spider');
const GOLDEN_PATH = path.resolve(hostDir, 'golden_mv.json');

const core = await import(pathToFileURL(path.resolve(hostDir, '../luoxueyinyue/music_core_mv.js')).href + '?t=' + Date.now());

let ok = true;
const check = (label, pass, detail) => {
    console.log('[' + label + '] ' + (pass ? 'OK' : 'FAIL') + (detail ? ' ' + detail : ''));
    if (!pass) ok = false;
};

// ---------------- 载入 golden_mv.json（Java 真值侧产出） ----------------

const golden = JSON.parse(fs.readFileSync(GOLDEN_PATH, 'utf8'));
const secKey = golden.secKey;
console.log('golden secKey=' + secKey + ' encVectors=' + golden.enc.length);

// ---------------- ① weapi 对拍（params + encSecKey，固定 secKey 全确定性） ----------------

const w1 = core.weapi(golden.weapiMvUrl.json, secKey);
check('weapi.mvUrl.params', w1[0] === golden.weapiMvUrl.params,
    w1[0] === golden.weapiMvUrl.params ? '' : '\n  golden=' + golden.weapiMvUrl.params + '\n  actual=' + w1[0]);
check('weapi.mvUrl.encSecKey', w1[1] === golden.weapiMvUrl.encSecKey,
    w1[1] === golden.weapiMvUrl.encSecKey ? '' : '\n  golden=' + golden.weapiMvUrl.encSecKey + '\n  actual=' + w1[1]);

const w2 = core.weapi(golden.weapiSearch.json, secKey);
check('weapi.search.params', w2[0] === golden.weapiSearch.params,
    w2[0] === golden.weapiSearch.params ? '' : '\n  golden=' + golden.weapiSearch.params + '\n  actual=' + w2[0]);
check('weapi.search.encSecKey', w2[1] === golden.weapiSearch.encSecKey,
    w2[1] === golden.weapiSearch.encSecKey ? '' : '\n  golden=' + golden.weapiSearch.encSecKey + '\n  actual=' + w2[1]);

// RSA(NoPadding) 确定性附加校验：同一 secKey 不同 payload，encSecKey 必须一致（Java 侧两向量同值）
check('weapi.rsaSameKey', w1[1] === w2[1], '');

// 随机 secKey 路径冒烟：输出形状（base64 params / 256 位 hex encSecKey）
const wr = core.weapi('{"csrf_token":""}');
check('weapi.randomShape',
    /^[A-Za-z0-9+/=]+$/.test(wr[0]) && /^[0-9a-f]{256}$/.test(wr[1]) && wr[1] !== golden.weapiMvUrl.encSecKey,
    'params.len=' + wr[0].length + ' hex.len=' + wr[1].length);

// ---------------- ② linuxEparams 对拍 ----------------

const ep = core.linuxEparams(golden.linux.json);
check('linuxEparams', ep === golden.linux.eparams,
    ep === golden.linux.eparams ? '' : '\n  golden=' + golden.linux.eparams + '\n  actual=' + ep);

// ---------------- ③ enc()（java.net.URLEncoder 净效果）对拍 ----------------

for (const [input, expect] of golden.enc) {
    const actual = core.enc(input);
    check('enc(' + JSON.stringify(input) + ')', actual === expect,
        actual === expect ? '' : 'expect=' + expect + ' actual=' + actual);
}

// ---------------- ④ 四源 spider 8 方法装载冒烟（离线：home(false) 不触发网络） ----------------

const SITES = [
    ['neteasemv.js', 'mv_rcmd', 'mv', 4],
    ['qqmv.js', 'mvq_all', 'mvq', 1],
    ['kugoumv.js', 'kgmv_hot', 'mvk', 4],
    ['migumv.js', 'mvmv_rcmd', 'mvm', 4],
];
const METHODS = ['init', 'home', 'homeVod', 'category', 'detail', 'search', 'play', 'action'];

for (const [file, firstTid, uidPrefix, classCount] of SITES) {
    const sp = await loadSpider('../luoxueyinyue/' + file);
    const missing = METHODS.filter(m => typeof sp[m] !== 'function');
    check(file + '.methods', missing.length === 0, missing.length ? 'missing=' + missing.join(',') : '8/8');

    const initRet = await sp.init('');
    check(file + '.init', initRet === '', JSON.stringify(initRet).slice(0, 40));

    const homeRet = await sp.home(false);
    let homeJson = null;
    try { homeJson = JSON.parse(homeRet); } catch (e) { }
    check(file + '.home(false)',
        homeJson && Array.isArray(homeJson.class) && homeJson.class.length === classCount
        && homeJson.class[0].type_id === firstTid,
        homeJson ? 'class=' + homeJson.class.map(c => c.type_id).join(',') : String(homeRet).slice(0, 80));

    const homeVodRet = await sp.homeVod();
    check(file + '.homeVod', homeVodRet === '', String(homeVodRet).slice(0, 40));

    const actRet = await sp.action('song:netease_123');
    check(file + '.action', actRet === '', String(actRet).slice(0, 40));

    // uid 前缀约定冒烟（离线：splitUid 纯函数，uid={前缀}_{id} 两段式）
    const parts = core.splitUid(uidPrefix + '_someid123');
    check(file + '.splitUid', parts && parts[0] === uidPrefix && parts[1] === 'someid123',
        parts ? parts.join('|') : 'null');
}

// 离线防御分支冒烟：非法 uid play/detail 返回空
const spNe = await loadSpider('../luoxueyinyue/neteasemv.js');
check('play.badUid', (await spNe.play('果剧音乐', 'xxx_nounderscore')) === '', '');
check('detail.badUid', (await spNe.detail('song_netease_123')) === '', '');

console.log(ok ? '\n=== golden_mv ALL OK ===' : '\n=== golden_mv FAILED ===');
process.exit(ok ? 0 : 1);

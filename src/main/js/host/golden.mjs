/**
 * golden.mjs — 西红柿签名栈 golden 向量自检（对齐 Xihongshiduanju.java main()）
 * 用法：node golden.mjs  （在 host 目录执行）
 */

import { loadSpider, installHostGlobals } from './host.mjs';
import path from 'node:path';
import { fileURLToPath, pathToFileURL } from 'node:url';

installHostGlobals();

const libDir = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '../lib');
const sig = await import(pathToFileURL(path.join(libDir, 'xhs_sign.js')).href + '?t=' + Date.now());
const bin = await import(pathToFileURL(path.join(libDir, 'binutil.js')).href + '?t=' + Date.now());
const { utf8ToBytes, hexToBytes, bytesToHex, b64ToBytes, le64 } = bin;

let ok = true;
const check = (label, pass, detail) => {
    console.log('[' + label + '] ' + (pass ? 'OK' : 'FAIL') + ' ' + (detail || ''));
    if (!pass) ok = false;
};

// SM3 标准向量
const s1 = bytesToHex(sig.sm3(utf8ToBytes('abc')));
check('sm3-abc', '66c7f0f462eeedd9d1f2d46bdc10e4e24167c4875cf2f7a2297da02b8f4ba8e0' === s1, s1);
const s0 = bytesToHex(sig.sm3(new Uint8Array(0)));
check('sm3-empty', '1ab21d8355cfa17f8e61194831e81a8f22bec8c728fefb747ed035eb5082aa2b' === s0, s0);

// x-ladon golden（probe 实测向量）
const lad = sig.ladon(1700000000, 1611921764, 1967, new Uint8Array([1, 2, 3, 4]));
check('ladon', 'AQIDBKM7Y7bWnOIUXmTybD6/MpGbuge4sBwUJsyHVivhtMsH' === lad, lad);

// simon key expansion 自洽
const ke = sig.simonKeyExpansion([
    le64(hexToBytes('fc78e0a9657a0c748ce51559903ccf03510e51d3cff232d71343e88a321c5304'), 0),
    le64(hexToBytes('fc78e0a9657a0c748ce51559903ccf03510e51d3cff232d71343e88a321c5304'), 8),
    le64(hexToBytes('fc78e0a9657a0c748ce51559903ccf03510e51d3cff232d71343e88a321c5304'), 16),
    le64(hexToBytes('fc78e0a9657a0c748ce51559903ccf03510e51d3cff232d71343e88a321c5304'), 24),
]);
check('simon-keyexp', ke.length === 72 && ke[71] !== 0n, 'len=' + ke.length);

// argus 551 输出格式自检（前缀 F2 81 + base64 可解）
const argus = sig.argusSign('aid=1967&device_id=123&version_name=6.5.1.32', '', 1700000000, 1967, '123', '', 42);
const dec = b64ToBytes(argus);
check('argus-fmt', argus.length > 32 && dec.length > 18 && dec[0] === 0xf2 && dec[1] === 0x81,
    'len=' + argus.length + ' head=' + dec[0] + ',' + dec[1]);

// AES-128 加密核对拍：keystream(counter) == crypto-js ECB(counter)，FIPS-197 C.1 向量键
const fipsKey = hexToBytes('000102030405060708090a0b0c0d0e0f');
const fipsPlain = hexToBytes('00112233445566778899aabbccddeeff');
const CJ = globalThis.CryptoJS;
const mkWords = (b) => CJ.lib.WordArray.create(Array.from({ length: 4 }, (_, i) =>
    ((b[i * 4] << 24) | (b[i * 4 + 1] << 16) | (b[i * 4 + 2] << 8) | b[i * 4 + 3]) | 0), 16);
// oracle: ECB 加密 fipsPlain → 69c4e0d86a7b0430d8cdb78070b4c55a（FIPS-197 标准输出）
const oracleEnc = CJ.AES.encrypt(mkWords(fipsPlain), mkWords(fipsKey), { mode: CJ.mode.ECB, padding: CJ.pad.NoPadding }).ciphertext.toString();
check('aes128-oracle-enc', oracleEnc === '69c4e0d86a7b0430d8cdb78070b4c55a', oracleEnc);
// 我的核 keystream(counter=1) == ECB(0...01)；与 oracle ECB(fipsPlain) 不同明文，改用同明文对拍：
// 以 counter = fipsPlain（16 字节 BE 整数）为输入块，keystream 应等于 ECB(fipsPlain)
const mineKs = sig.aesCtrDecrypt(fipsKey, sig.bytesToBigIntBE(fipsPlain), 0, new Uint8Array(16));
check('aes128-fips197', bytesToHex(mineKs) === oracleEnc, bytesToHex(mineKs).slice(0, 32));

console.log(ok ? 'GOLDEN ALL GREEN' : 'GOLDEN FAIL');
process.exit(ok ? 0 : 1);

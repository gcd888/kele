/**
 * obf.mjs — JS 源混淆入口（javascript-obfuscator node API）
 *
 * 用法：node obf.mjs <in.js> <out.js>
 *
 * 中度混淆（与 QuickJS 兼容性/性能平衡，构建脚本 build.py 逐文件调用）：
 *  - 标识符十六进制重命名（不碰全局，renameGlobals=false 保宿主 req/local/aesX）
 *  - 字符串数组 + base64 编码 + 轮转/洗牌
 *  - 控制流平坦化（threshold 0.5）+ 字符串拆分 + 数字表达式化 + simplify
 *  - 禁用：transformObjectKeys（会重排对象键 → 破坏 dmProto/proto 编码字段顺序）、
 *    selfDefending / debugProtection（QuickJS 兼容风险）、deadCodeInjection（体积膨胀）
 *  - 保留 ESM import/export（壳 JsSpider evaluateModule 按模块求值）
 */

import JavaScriptObfuscator from 'javascript-obfuscator';
import fs from 'node:fs';

const [, , inFile, outFile] = process.argv;
if (!inFile || !outFile) {
    console.error('用法: node obf.mjs <in.js> <out.js>');
    process.exit(1);
}

const code = fs.readFileSync(inFile, 'utf-8');

const result = JavaScriptObfuscator.obfuscate(code, {
    compact: true,
    controlFlowFlattening: true,
    controlFlowFlatteningThreshold: 0.5,
    deadCodeInjection: false,
    debugProtection: false,
    disableConsoleOutput: false,
    identifierNamesGenerator: 'hexadecimal',
    numbersToExpressions: true,
    renameGlobals: false,
    selfDefending: false,
    simplify: true,
    splitStrings: true,
    splitStringsChunkLength: 10,
    stringArray: true,
    stringArrayCallsTransform: false,
    stringArrayEncoding: ['base64'],
    stringArrayIndexShift: true,
    stringArrayRotate: true,
    stringArrayShuffle: true,
    stringArrayThreshold: 1,
    stringArrayWrappersCount: 2,
    stringArrayWrappersType: 'function',
    transformObjectKeys: false,
    unicodeEscapeSequence: false,
});

fs.writeFileSync(outFile, result.getObfuscatedCode(), 'utf-8');
console.log('[obf] ' + inFile + ' -> ' + outFile + ' (' + code.length + ' -> ' + result.getObfuscatedCode().length + ' chars)');

// hashF13 branch0 中间值对照（cjs 真值侧）：与 DebugBranch0 输出逐项配对
import fs from 'node:fs';
import crypto from 'node:crypto';

const src = fs.readFileSync('E:/HelloWorld/project/guoju/case/hongguoTV-tsukiyo/server/vendor/hongguo.cjs', 'utf8');
function slice(a, b) { const i = src.indexOf(a); const j = src.indexOf(b, i); return src.slice(i, j); }
const partA = slice('const SITE =', '// ---------- 官网 SSR 数据');
const partB = slice('function appSearchParams', 'function videoModelUrl');
const lib = new Function('axios', 'crypto', partA + '\n' + partB +
  'return {hashF13, sm3, getIv, rol32, ror32, le32, u32};')(async () => {}, crypto);

const query = process.argv[2];
const khronos = Number(process.argv[3]);
const qSm3 = lib.sm3(Buffer.from(query, 'utf8'));
console.log('querySm3=' + qSm3.toString('hex'));
const iv = lib.getIv(lib.getIv(lib.getIv(0x20230928, qSm3), Buffer.alloc(16)), lib.le32(khronos));
console.log('iv=' + (iv >>> 0).toString(16));
const low = iv & 15;
const ivV0 = (low * 171) >> 9;
console.log('low=' + low + ' index=' + (low / 3) + ' cjsIvV0=' + ivV0);
const IVV1 = [0xc4a78580, 0xb3c0fd39, 0xc58c5686, 0xc9aa3ba7, 0xf5a7adf2, 0x963c2ed1];
const ivV1 = IVV1[ivV0];
const countV2 = lib.u32(ivV1 + khronos);
console.log('count=' + (countV2 >>> 0));
// tt：cjs hashF13 内部 countV1 = (ivV1 + khronos + 1) & 255
const tt02 = [0xebb64faf,0x7aadcc2,0xcf3187bf,0xe01138ff,0x6d0bfcff,0x5a30a3be,0xb41ad638,0x34180eb8,0xf233eb6f,0xb1a584cc,0xccc30dc7,0x47d1db51,0xd55653de,0x70a84fa1,0x57473c12,0xf76f0288,0x2c077f0a,0xda0dcad0,0xfbb86f6c,0xfdc4cf00,0x688a020d,0xe676c6a6,0x8cd6338b,0x1a3c8d0e,0xcce8b06b,0x6ad0ed0b,0xa0522717,0xdc71ac83,0x2285db71,0xd5b4dda6,0x736f8650,0x6560306c,0x617ce2a6,0xe423417e,0xa40e143,0x544e4032,0x88dffb2a,0x716c1ae0,0x4c467a88,0x5b23bb3,0xe1d0b866,0xbaa3dcb8,0xae3374d3,0xc3381a50,0x1702f75b,0xfe6da368,0xf0b4cf48,0x4e0ffbb8,0x72aad10d,0x26c53a3d,0xf2bce0f6,0xb4557581,0x4a257fdd,0x8c3182a2,0xab0b3b86,0x3d5dfb14,0x4f103634,0xd37b52d7,0x444eff16,0xeb0a33d1,0x6ca86f6e,0x284ba7,0x8387cfa,0x5fb37586];
const countV1 = (ivV1 + khronos + 1) & 255;
const tt = tt02.map((v) => lib.ror32(v, countV1));
console.log('tt[0..3]=' + [tt[0], tt[1], tt[2], tt[3]].map((v) => (v >>> 0).toString(16)).join(','));
const n0 = (countV2 + 2) & 7;
const seed = [0xfa, 0x45, 0x61, 0xd7];
const pad = Buffer.from(seed.map((v) => ((v | (v << 8)) >> n0) & 255));
console.log('pad=' + pad.toString('hex'));
const tsBytes = Buffer.alloc(4);
tsBytes.writeUInt32LE(khronos >>> 0);
const data = Buffer.concat([qSm3, Buffer.alloc(16), tsBytes, pad, Buffer.from('00000000000001a0', 'hex')]);
console.log('data=' + data.toString('hex'));
const di = [];
for (let i = 0; i < data.length; i += 4) di.push(data.readUInt32BE(i));
let di0 = di[0];
for (let i = 0; i < 112; i++) {
  const di1 = di[i + 1];
  const di14 = di[i + 14];
  const r1 = lib.rol32(di1, 14) ^ lib.rol32(di1, 25) ^ (di1 >>> 3);
  const r2 = lib.rol32(di14, 13) ^ lib.rol32(di14, 15) ^ (di14 >>> 10);
  di.push(lib.u32(di0 + di[i + 9] + r1 + r2));
  di0 = di1;
}
console.log('di[16..23]=' + di.slice(16, 24).map((v) => (v >>> 0).toString(16)).join(','));
const init = [0x7aba4fc8, 0x67166507, 0x6403fa00, 0x340f512f, 984304912, 3005047866, 2874125293, 2152413264].map((v) => lib.ror32(v, countV2 & 31));
console.log('initRot=' + init.map((v) => (v >>> 0).toString(16)).join(','));
const chosen = [[101,5,7,6,3,2,1,0,5,4,3],[96,0,6,7,5,3,2,1,5,4,4],[96,7,6,2,1,4,0,5,4,3,5],[99,3,6,2,4,5,1,0,0,7,6],[96,0,5,6,7,3,1,2,5,4,4],[100,2,0,3,5,4,6,7,2,1,5]][ivV0];
console.log('chosen=' + chosen.join(','));
// 最终输出（cjs hashF13 原函数）
const qbt = lib.hashF13(qSm3, Buffer.alloc(16), tsBytes, khronos);
console.log('queryBodyTs=' + qbt.toString('hex'));

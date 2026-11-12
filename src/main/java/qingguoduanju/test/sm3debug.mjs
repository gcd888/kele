// SM3 调试对照：implA = Qingguoduanju.java sm3 的 1:1 JS 转写；implB = 独立按 GB/T 32905 重写。
// truth = node:crypto SM3。定位 Java 移植分歧点用。
import crypto from 'node:crypto';

const rotl = (x, n) => ((x << n) | (x >>> (32 - n))) >>> 0;

function pad(msg) {
  const bitLen = msg.length * 8;
  const newLen = (((msg.length + 8) >> 6) + 1) << 6;
  const out = Buffer.alloc(newLen);
  msg.copy(out);
  out[msg.length] = 0x80;
  out.writeUInt32BE(Math.floor(bitLen / 2 ** 32), newLen - 8);
  out.writeUInt32BE(bitLen >>> 0, newLen - 4);
  return out;
}

// implA：Qingguoduanju.java 1:1（含可疑点原样保留）
function implA(input) {
  const msg = pad(Buffer.from(input));
  const iv = [0x7380166f, 0x4914b2b9, 0x172442d7, 0xda8a0600, 0xa96f30bc, 0x163138aa, 0xe38dee4d, 0xb0fb0e4e];
  const w = new Array(68).fill(0);
  const w1 = new Array(64).fill(0);
  for (let off = 0; off < msg.length; off += 64) {
    for (let i = 0; i < 16; i++) w[i] = msg.readUInt32BE(off + i * 4);
    for (let i = 16; i < 68; i++) {
      const p1in = (w[i - 16] ^ w[i - 9]) >>> 0;
      const p1 = (p1in ^ rotl(p1in, 15) ^ rotl(p1in, 23)) >>> 0;
      w[i] = (p1 ^ rotl(w[i - 3], 15)) >>> 0;
    }
    for (let i = 0; i < 64; i++) w1[i] = (w[i] ^ w[i + 4]) >>> 0;
    let a = iv[0], b = iv[1], c = iv[2], d = iv[3], e = iv[4], f = iv[5], g = iv[6], h = iv[7];
    for (let j = 0; j < 64; j++) {
      const j16 = j < 16;
      const tj = j16 ? 0x79cc4519 : 0x7a879d8a;
      const ff = j16 ? ((a ^ b ^ c) >>> 0) : (((a & b) | (a & c) | (b & c)) >>> 0);
      const gg = j16 ? ((e ^ f ^ g) >>> 0) : (((e & f) | ((~e) & g)) >>> 0);
      const ss1 = rotl((rotl(a, 12) + e + rotl(tj, j % 32)) >>> 0, 7);
      const ss2 = (ss1 ^ rotl(a, 12)) >>> 0;
      const tt = (ff + d + ss2 + w1[j]) >>> 0;
      const dd = (gg + h + ss1 + w[j]) >>> 0;
      d = c; c = rotl(b, 9); b = a; a = tt;
      h = g; g = rotl(f, 19); f = e;
      e = (dd ^ rotl(dd, 9) ^ rotl(dd, 17)) >>> 0;
    }
    iv[0] = (iv[0] ^ a) >>> 0; iv[1] = (iv[1] ^ b) >>> 0; iv[2] = (iv[2] ^ c) >>> 0; iv[3] = (iv[3] ^ d) >>> 0;
    iv[4] = (iv[4] ^ e) >>> 0; iv[5] = (iv[5] ^ f) >>> 0; iv[6] = (iv[6] ^ g) >>> 0; iv[7] = (iv[7] ^ h) >>> 0;
  }
  return Buffer.from(iv.flatMap((v) => [(v >>> 24) & 255, (v >>> 16) & 255, (v >>> 8) & 255, v & 255]));
}

// implB：独立重写（逐条对照 GB/T 32905-2016 文字）
function implB(data) {
  const T = (j) => (j < 16 ? 0x79cc4519 : 0x7a879d8a);
  const ff = (j, x, y, z) => (j < 16 ? x ^ y ^ z : (x & y) | (x & z) | (y & z));
  const gg = (j, x, y, z) => (j < 16 ? x ^ y ^ z : (x & y) | (~x & z));
  const p0 = (x) => x ^ rotl(x, 9) ^ rotl(x, 17);
  const p1 = (x) => x ^ rotl(x, 15) ^ rotl(x, 23);
  const V = [0x7380166f, 0x4914b2b9, 0x172442d7, 0xda8a0600, 0xa96f30bc, 0x163138aa, 0xe38dee4d, 0xb0fb0e4e];
  const msg = pad(Buffer.from(data));
  for (let off = 0; off < msg.length; off += 64) {
    const W = new Array(68), Wp = new Array(64);
    for (let i = 0; i < 16; i++) W[i] = msg.readUInt32BE(off + i * 4);
    for (let i = 16; i < 68; i++) W[i] = p1(W[i - 16] ^ W[i - 9]) ^ rotl(W[i - 3], 15);
    for (let i = 0; i < 64; i++) Wp[i] = W[i] ^ W[i + 4];
    let [A, B, C, D, E, F, G, H] = V;
    for (let j = 0; j < 64; j++) {
      const SS1 = rotl(rotl(A, 12) + E + rotl(T(j), j), 7);
      const SS2 = SS1 ^ rotl(A, 12);
      const TT1 = (ff(j, A, B, C) + D + SS2 + Wp[j]) >>> 0;
      const TT2 = (gg(j, E, F, G) + H + SS1 + W[j]) >>> 0;
      D = C; C = rotl(B, 9); B = A; A = TT1;
      H = G; G = rotl(F, 19); F = E; E = p0(TT2);
    }
    const next = [A, B, C, D, E, F, G, H];
    for (let i = 0; i < 8; i++) V[i] = (V[i] ^ next[i]) >>> 0;
  }
  return Buffer.from(V.flatMap((v) => [(v >>> 24) & 255, (v >>> 16) & 255, (v >>> 8) & 255, v & 255]));
}

const truth = (b) => crypto.createHash('sm3').update(b).digest('hex');
const hex = (buf) => buf.toString('hex');
for (const [name, input] of [['abc', 'abc'], ['empty', ''], ['64B', 'a'.repeat(64)]]) {
  const t = truth(input);
  console.log(name, 'truth=', t.slice(0, 16), 'A=', hex(implA(input)).slice(0, 16), 'B=', hex(implB(input)).slice(0, 16),
    'A_OK=', hex(implA(input)) === t, 'B_OK=', hex(implB(input)) === t);
}

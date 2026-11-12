/**
 * sm3.js — SM3 密码杂凑（GB/T 32905-2016），纯 JS 实现。
 * 移植自 Xihongshiduanju.java（该实现已与 gmssl/cryptography oracle 对拍确认）。
 *
 * 接口：sm3(Uint8Array) → Uint8Array（32 字节）
 * QuickJS 兼容：仅使用 Int32 算术 + |0，无平台依赖。
 */

function rotl32(v, n) {
    n %= 32;
    return ((v << n) | (v >>> (32 - n))) | 0;
}

export function sm3(msg) {
    const len = msg.length;
    // Java: ((len + 8) / 64 + 1) * 64（整数除法）；JS 必须显式 floor
    const total = (Math.floor((len + 8) / 64) + 1) * 64;
    const m = new Uint8Array(total);
    m.set(msg, 0);
    m[len] = 0x80;
    const bits = len * 8;
    for (let i = 0; i < 8; i++) m[total - 1 - i] = Math.floor(bits / Math.pow(2, 8 * i)) & 255;

    const V = [0x7380166f, 0x4914b2b9, 0x172442d7, 0xda8a0600, 0xa96f30bc, 0x163138aa, 0xe38dee4d, 0xb0fb0e4e];
    const W = new Int32Array(68);
    const W1 = new Int32Array(64);

    for (let off = 0; off < total; off += 64) {
        for (let j = 0; j < 16; j++) {
            W[j] = ((m[off + j * 4] << 24) | (m[off + j * 4 + 1] << 16) | (m[off + j * 4 + 2] << 8) | m[off + j * 4 + 3]) | 0;
        }
        for (let j = 16; j < 68; j++) {
            let w = W[j - 16] ^ W[j - 9] ^ rotl32(W[j - 3], 15);
            w = (w ^ rotl32(w, 15) ^ rotl32(w, 23)) | 0;
            w = (w ^ rotl32(W[j - 13], 7) ^ W[j - 6]) | 0;
            W[j] = w;
        }
        for (let j = 0; j < 64; j++) {
            W1[j] = (W[j] ^ W[j + 4]) | 0;
        }
        let A = V[0], B = V[1], C = V[2], D = V[3], E = V[4], F = V[5], G = V[6], H = V[7];
        for (let j = 0; j < 64; j++) {
            const T = j < 16 ? 0x79cc4519 : 0x7a879d8a;
            const SS1 = rotl32((rotl32(A, 12) + E + rotl32(T, j % 32)) | 0, 7);
            const SS2 = (SS1 ^ rotl32(A, 12)) | 0;
            let FF, GG;
            if (j < 16) { FF = (A ^ B ^ C) | 0; GG = (E ^ F ^ G) | 0; }
            else { FF = ((A & B) | (A & C) | (B & C)) | 0; GG = ((E & F) | (~E & G)) | 0; }
            const TT1 = (FF + D + SS2 + W1[j]) | 0;
            const TT2 = (GG + H + SS1 + W[j]) | 0;
            D = C;
            C = rotl32(B, 9);
            B = A;
            A = TT1;
            H = G;
            G = rotl32(F, 19);
            F = E;
            E = (TT2 ^ rotl32(TT2, 9) ^ rotl32(TT2, 17)) | 0;
        }
        V[0] = (V[0] ^ A) | 0; V[1] = (V[1] ^ B) | 0; V[2] = (V[2] ^ C) | 0; V[3] = (V[3] ^ D) | 0;
        V[4] = (V[4] ^ E) | 0; V[5] = (V[5] ^ F) | 0; V[6] = (V[6] ^ G) | 0; V[7] = (V[7] ^ H) | 0;
    }

    const out = new Uint8Array(32);
    for (let i = 0; i < 8; i++) {
        out[i * 4] = (V[i] >>> 24) & 255;
        out[i * 4 + 1] = (V[i] >>> 16) & 255;
        out[i * 4 + 2] = (V[i] >>> 8) & 255;
        out[i * 4 + 3] = V[i] & 255;
    }
    return out;
}

export default { sm3 };

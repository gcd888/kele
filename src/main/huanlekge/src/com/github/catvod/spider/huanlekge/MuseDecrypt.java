package com.github.catvod.spider.huanlekge;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * 欢唱K歌媒体解密：
 * 1. 解析 xaf8mjrs 容器头（41 字节），取出 key8（offset 12-20）与文件名
 * 2. TS 数据从 offset 41 开始，按 0x4000 字节分块
 * 3. 加密块模式：第 3 块，之后每 16 块加密一次（block 3, 17, 33, 49, ...）
 * 4. 加密块用 splitmix64 keystream XOR 解密：
 *    keystream = splitmix64_iter( SHA256( KEY16.ljust(32,0) || BE32(blkno) || key8 )[0:8] )
 *    每 8 字节一次 finalizer(state+PHI)，state += PHI（累加，非 state=z），输出小端 8 字节
 */
public final class MuseDecrypt {

    public static final int BLOCK_SIZE = 0x4000;       // 16 KiB
    public static final int HEADER_SIZE = 41;          // 容器头长度
    public static final int MAGIC_LEN = 8;             // "xaf8mjrs"
    private static final byte[] MAGIC = {'x', 'a', 'f', '8', 'm', 'j', 'r', 's'};

    private static final long PHI = 0x9e3779b97f4a7c15L;
    private static final long M1 = 0xbf58476d1ce4e5b9L;
    private static final long M2 = 0x94d049bb133111ebL;

    private MuseDecrypt() {
    }

    /** 容器解析结果。 */
    public static final class Container {
        public final byte[] key8;
        public final String fileName;
        public final int headerSize;

        Container(byte[] key8, String fileName, int headerSize) {
            this.key8 = key8;
            this.fileName = fileName;
            this.headerSize = headerSize;
        }
    }

    /** 解析容器头，校验魔数。 */
    public static Container parseHeader(byte[] data) {
        if (data == null || data.length < HEADER_SIZE) {
            throw new IllegalArgumentException("data too short for muse header");
        }
        for (int i = 0; i < MAGIC_LEN; i++) {
            if (data[i] != MAGIC[i]) {
                throw new IllegalArgumentException("bad muse magic at " + i);
            }
        }
        int headerLen = ((data[8] & 0xff) << 8) | (data[9] & 0xff); // u16 BE
        byte[] key8 = new byte[8];
        System.arraycopy(data, 12, key8, 0, 8);
        int fnLen = ((data[20] & 0xff) << 8) | (data[21] & 0xff); // u16 BE
        String fileName = "";
        if (fnLen > 0 && 24 + fnLen <= data.length) {
            fileName = new String(data, 24, fnLen, StandardCharsets.UTF_8);
        }
        return new Container(key8, fileName, headerLen);
    }

    /**
     * 判断某 TS 块是否为加密块。
     * 模式：block 3 加密，之后每 16 块加密一次（17, 33, 49, 65, ...）。
     * 即 block == 3 或 (block >= 17 且 (block - 1) % 16 == 0)。
     */
    public static boolean isEncryptedBlock(int block) {
        if (block == 3) return true;
        return block >= 17 && ((block - 1) % 16) == 0;
    }

    /** splitmix64 finalizer（与 libijkplayer.so 一致）。 */
    static long finalizer(long x) {
        long z = x;
        z = (z ^ (z >>> 30)) * M1;
        z = (z ^ (z >>> 27)) * M2;
        return z ^ (z >>> 31);
    }

    /**
     * 生成指定块的 keystream。
     *
     * @param key16  16 字节媒体密钥（RSA 解密 encrypted_key 所得）
     * @param key8   容器头 offset 12-20 的 8 字节
     * @param blkno  TS 块号（从 0 开始，offset 41 对齐）
     * @param length 需要的字节数
     */
    public static byte[] genKeystream(byte[] key16, byte[] key8, int blkno, int length) throws Exception {
        byte[] seed32 = new byte[32];
        int keyLen = Math.min(key16.length, 32);
        System.arraycopy(key16, 0, seed32, 0, keyLen);

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(seed32);
        md.update(new byte[]{(byte) (blkno >>> 24), (byte) (blkno >>> 16), (byte) (blkno >>> 8), (byte) blkno});
        md.update(key8);
        byte[] digest = md.digest();

        long state = ((long) (digest[0] & 0xff) << 56)
                | ((long) (digest[1] & 0xff) << 48)
                | ((long) (digest[2] & 0xff) << 40)
                | ((long) (digest[3] & 0xff) << 32)
                | ((long) (digest[4] & 0xff) << 24)
                | ((long) (digest[5] & 0xff) << 16)
                | ((long) (digest[6] & 0xff) << 8)
                | (digest[7] & 0xff);

        byte[] ks = new byte[length];
        int pos = 0;
        while (pos < length) {
            long z = finalizer(state + PHI);
            for (int i = 0; i < 8 && pos < length; i++) {
                ks[pos++] = (byte) (z >>> (i * 8)); // 小端输出
            }
            state += PHI; // ★ 累加，不是 state = z
        }
        return ks;
    }

    /**
     * 解密整个媒体文件的 TS 部分（offset headerSize 之后）。
     * 非加密块原样保留，加密块用 keystream XOR。
     *
     * @param fileData 完整文件（含容器头）
     * @param key16    媒体解密密钥
     * @return 解密后的 TS 数据（不含容器头）
     */
    public static byte[] decryptAll(byte[] fileData, byte[] key16) throws Exception {
        Container c = parseHeader(fileData);
        int tsLen = fileData.length - c.headerSize;
        if (tsLen <= 0) return new byte[0];

        byte[] out = new byte[tsLen];
        System.arraycopy(fileData, c.headerSize, out, 0, tsLen);

        int nblocks = (tsLen + BLOCK_SIZE - 1) / BLOCK_SIZE;
        for (int b = 0; b < nblocks; b++) {
            if (!isEncryptedBlock(b)) continue;
            int off = b * BLOCK_SIZE;
            int len = Math.min(BLOCK_SIZE, tsLen - off);
            byte[] ks = genKeystream(key16, c.key8, b, len);
            for (int i = 0; i < len; i++) {
                out[off + i] ^= ks[i];
            }
        }
        return out;
    }
}

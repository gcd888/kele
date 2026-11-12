package com.github.catvod.spider;

import java.lang.reflect.Field;

/** 调试：dump hashF13branch0 中间值（反射读私有常量表），与 branch0ref.mjs 输出逐项配对。 */
public class DebugBranch0 {
    static String hex(byte[] b) {
        StringBuilder sb = new StringBuilder();
        for (byte x : b) sb.append(String.format("%02x", x & 255));
        return sb.toString();
    }

    static int rol(int v, int n) {
        n &= 31;
        return (v << n) | (v >>> (32 - n));
    }

    static int ror(int v, int n) {
        n &= 31;
        return (v >>> n) | (v << (32 - n));
    }

    static byte[] le32(int v) {
        return new byte[]{(byte) v, (byte) (v >>> 8), (byte) (v >>> 16), (byte) (v >>> 24)};
    }

    static int[] ints(String field) throws Exception {
        Field f = Qingguoduanju.class.getDeclaredField(field);
        f.setAccessible(true);
        return (int[]) f.get(null);
    }

    public static void main(String[] args) throws Exception {
        String query = args[0];
        int khronos = Integer.parseInt(args[1]);
        byte[] querySm3 = Qingguoduanju.sm3(query.getBytes("UTF-8"));
        byte[] bodyMd5 = new byte[16];
        int iv = Qingguoduanju.ivOf(querySm3, bodyMd5, khronos);
        System.out.println("iv=" + (iv & 0xFFFFFFFFL));
        int low = iv & 15;
        System.out.println("low=" + low + " index=" + (low / 3) + " cjsIvV0=" + ((low * 171) >> 9));
        int index = low / 3;
        int count = ints("IVV1_LIST")[index] + khronos;
        System.out.println("count=" + count);
        int[] hashTable = ints("HASH_TABLE");
        int[] tt = new int[64];
        for (int i = 0; i < 64; i++) tt[i] = ror(hashTable[i], count + 1);
        System.out.println("tt[0..3]=" + Integer.toHexString(tt[0]) + "," + Integer.toHexString(tt[1]) + ","
                + Integer.toHexString(tt[2]) + "," + Integer.toHexString(tt[3]));
        int shift = (count + 2) & 7;
        int[] seed = {0xfa, 0x45, 0x61, 0xd7};
        byte[] pad = new byte[4];
        for (int i = 0; i < 4; i++) pad[i] = (byte) (((seed[i] | (seed[i] << 8)) >> shift) & 255);
        System.out.println("pad=" + hex(pad));
        byte[] data = new byte[64];
        System.arraycopy(querySm3, 0, data, 0, 32);
        System.arraycopy(le32(khronos), 0, data, 48, 4);
        System.arraycopy(pad, 0, data, 52, 4);
        System.arraycopy(new byte[]{0, 0, 0, 0, 0, 0, 1, (byte) 0xa0}, 0, data, 56, 8);
        System.out.println("data=" + hex(data));
        int[] di = new int[128];
        for (int i = 0; i < 16; i++) {
            di[i] = ((data[i * 4] & 255) << 24) | ((data[i * 4 + 1] & 255) << 16)
                    | ((data[i * 4 + 2] & 255) << 8) | (data[i * 4 + 3] & 255);
        }
        for (int i = 0; i < 112; i++) {
            int x = di[i + 1];
            int y = di[i + 14];
            int r1 = rol(x, 14) ^ rol(x, 25) ^ (x >>> 3);
            int r2 = rol(y, 13) ^ rol(y, 15) ^ (y >>> 10);
            di[16 + i] = di[i] + di[i + 9] + r1 + r2;
        }
        StringBuilder dsb = new StringBuilder();
        for (int i = 16; i < 24; i++) dsb.append(Integer.toHexString(di[i])).append(",");
        System.out.println("di[16..23]=" + dsb);
        int[] init = {0x7aba4fc8, 0x67166507, 0x6403fa00, 0x340f512f,
                984304912, (int) 3005047866L, (int) 2874125293L, (int) 2152413264L};
        StringBuilder isb = new StringBuilder();
        for (int i = 0; i < 8; i++) isb.append(Integer.toHexString(ror(init[i], count))).append(",");
        System.out.println("initRot=" + isb);
        int[][] chosenAll = (int[][]) (Object) ints("CHOSEN");
        int[] chosen = chosenAll[index];
        StringBuilder csb = new StringBuilder();
        for (int v : chosen) csb.append(v).append(",");
        System.out.println("chosen=" + csb);
        System.out.println("queryBodyTs=" + hex(Qingguoduanju.hashF13branch0(querySm3, bodyMd5, khronos)));
    }
}

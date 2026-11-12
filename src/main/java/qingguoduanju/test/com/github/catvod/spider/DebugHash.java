package com.github.catvod.spider;

/** 调试：打印固定输入下 hashF13branch0 / check 相关中间值，对照 cjs 侧输出。 */
public class DebugHash {
    static String hex(byte[] b) {
        StringBuilder sb = new StringBuilder();
        for (byte x : b) sb.append(String.format("%02x", x & 255));
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String query = args[0];
        int khronos = Integer.parseInt(args[1]);
        byte[] querySm3 = Qingguoduanju.sm3(query.getBytes("UTF-8"));
        byte[] bodyMd5 = new byte[16];
        byte[] qbt = Qingguoduanju.hashF13branch0(querySm3, bodyMd5, khronos);
        System.out.println("querySm3=" + hex(querySm3));
        System.out.println("queryBodyTs=" + hex(qbt));
        int check = ((querySm3[0] & 63) << 14) | 0x18000001 | ((qbt[0] & 63) << 8);
        byte[] le = new byte[]{(byte) check, (byte) (check >> 8), (byte) (check >> 16), (byte) (check >> 24)};
        System.out.println("check=" + check + " le32=" + hex(le));
    }
}

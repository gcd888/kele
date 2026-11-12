package android.util;

/** 桌面测试桩：仅实现 Qingguoduanju 用到的 Base64 语义（NO_WRAP=标准无换行）。 */
public class Base64 {
    public static final int DEFAULT = 0;
    public static final int NO_WRAP = 2;

    public static byte[] decode(String str, int flags) {
        return java.util.Base64.getMimeDecoder().decode(str.replace('-', '+').replace('_', '/'));
    }

    public static String encodeToString(byte[] input, int flags) {
        return java.util.Base64.getEncoder().encodeToString(input);
    }
}

package android.util;

/** 桌面测试桩：qingguoduanju 版本 + URL_SAFE 支持（xihongshiduanju 用到）。 */
public class Base64 {
    public static final int DEFAULT = 0;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    public static byte[] decode(String str, int flags) {
        if ((flags & URL_SAFE) != 0) return java.util.Base64.getUrlDecoder().decode(str);
        return java.util.Base64.getMimeDecoder().decode(str.replace('-', '+').replace('_', '/'));
    }

    public static String encodeToString(byte[] input, int flags) {
        return java.util.Base64.getEncoder().encodeToString(input);
    }
}

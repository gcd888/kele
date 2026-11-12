package android.util;

/** PC 预检用最小 Base64 桩（对齐 android.util.Base64 常用 flag）。 */
public class Base64 {
    public static final int DEFAULT = 0;
    public static final int NO_WRAP = 2;
    public static final int NO_PADDING = 1;
    public static final int URL_SAFE = 8;

    public static byte[] decode(String str, int flags) { return java.util.Base64.getDecoder().decode(str); }
    public static byte[] decode(byte[] input, int flags) { return java.util.Base64.getDecoder().decode(input); }
    public static String encodeToString(byte[] input, int flags) { return java.util.Base64.getEncoder().encodeToString(input); }
}

package android.util;

/**
 * JVM 测试桩：android.util.Base64（与 Android 语义一致的 DEFAULT/NO_WRAP）。
 */
public class Base64 {

    public static final int DEFAULT = 0;
    public static final int NO_WRAP = 2;

    public static byte[] decode(String str, int flags) {
        // MimeDecoder 容忍换行/空白（QRC/KRC 载体可能带换行）
        return java.util.Base64.getMimeDecoder().decode(str);
    }

    public static String encodeToString(byte[] input, int flags) {
        return java.util.Base64.getEncoder().encodeToString(input);
    }
}

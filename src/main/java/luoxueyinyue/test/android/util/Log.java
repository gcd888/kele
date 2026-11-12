package android.util;

/**
 * JVM 测试桩：android.util.Log（stderr 输出）。
 */
public class Log {

    public static int e(String tag, String msg) {
        System.err.println("[" + tag + "] " + msg);
        return 0;
    }
}

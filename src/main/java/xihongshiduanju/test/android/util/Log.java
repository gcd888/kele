package android.util;

/** 桌面测试桩：Log.e 打到 stderr。 */
public class Log {
    public static int e(String tag, String msg) {
        System.err.println("E/" + tag + ": " + msg);
        return 0;
    }
}

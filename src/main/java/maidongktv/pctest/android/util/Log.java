package android.util;

/** PC 预检用最小 Log 桩。 */
public class Log {
    public static int i(String tag, String msg) { System.out.println("[I/" + tag + "] " + msg); return 0; }
    public static int w(String tag, String msg) { System.out.println("[W/" + tag + "] " + msg); return 0; }
    public static int e(String tag, String msg) { System.err.println("[E/" + tag + "] " + msg); return 0; }
    public static int d(String tag, String msg) { return 0; }
    public static int v(String tag, String msg) { return 0; }
}

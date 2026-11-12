package android.os;

/** PC 预检用 SystemClock 桩。 */
public class SystemClock {
    public static long uptimeMillis() { return System.nanoTime() / 1_000_000L; }
}

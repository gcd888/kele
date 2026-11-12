package android.os;

/**
 * 桌面调试桩：JVM 冒烟环境无真实 Android 版本概念。
 * SDK_INT=999 使 Qingguoduanju.tuneTLS 的 API<21 分支不触发，走系统默认 TLS（等同现代设备口径）。
 */
public final class Build {
    /** 对齐真实 android.os.Build.VERSION 结构（tuneTLS 引用 Build.VERSION.SDK_INT）。 */
    public static final class VERSION {
        public static final int SDK_INT = 999;
        public static final String RELEASE = "999-desktop-debug";
        private VERSION() {
        }
    }

    public static final int SDK_INT = VERSION.SDK_INT;
    public static final String MODEL = "DesktopDebug";
    public static final String MANUFACTURER = "DesktopDebug";
    private Build() {
    }
}

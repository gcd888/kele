package android.content;

import java.io.File;

/**
 * JVM 测试桩：android.content.Context（Spider.init 签名 + 日志落盘路径）。
 */
public class Context {

    public File getExternalFilesDir(String type) {
        return null;
    }

    public File getFilesDir() {
        return new File(System.getProperty("java.io.tmpdir"), "guoju-lx");
    }
}

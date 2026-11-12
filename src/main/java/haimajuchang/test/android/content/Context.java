package android.content;

import java.io.File;

/** 桌面测试桩：Spider.mContext 类型占位。 */
public class Context {
    public File getExternalFilesDir(String type) {
        return new File(".");
    }
}

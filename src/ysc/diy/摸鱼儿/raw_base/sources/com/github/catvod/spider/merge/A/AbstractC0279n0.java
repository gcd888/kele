package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.M.C0034;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.CopyOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import moyu.fucking.C0173;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract /* synthetic */ class AbstractC0279n0 {
    public static /* bridge */ /* synthetic */ long a(Duration duration) throws Throwable {
        long jLongValue = 0;
        String str = "۠ۥۤ";
        Object objN = null;
        Long l = null;
        while (true) {
            switch (C0034.m132(str)) {
                case 1746880:
                    str = "ۦ۟ۥ";
                    l = (Long) objN;
                    break;
                case 1749663:
                    return jLongValue;
                case 1753420:
                    jLongValue = l.longValue();
                    str = "ۢۢ۟";
                    break;
                default:
                    objN = C0173.n(93092, duration, new Object[0]);
                    str = "۟ۥۦ";
                    break;
            }
        }
    }

    public static /* bridge */ /* synthetic */ InputStream b(Path path, OpenOption[] openOptionArr) throws Throwable {
        String str = "ۢۧۤ";
        Object objN = null;
        InputStream inputStream = null;
        while (true) {
            switch (C0034.m132(str)) {
                case 1749757:
                    return inputStream;
                case 1753665:
                    inputStream = (InputStream) objN;
                    str = "ۢۥ۠";
                    break;
                default:
                    objN = C0173.n(62196, null, new Object[]{path, openOptionArr});
                    str = "ۦۧۢ";
                    break;
            }
        }
    }

    public static /* bridge */ /* synthetic */ OutputStream c(Path path, OpenOption[] openOptionArr) throws Throwable {
        String str = "ۣۤ۟";
        OutputStream outputStream = null;
        Object objN = null;
        while (true) {
            switch (C0034.m132(str)) {
                case 1751616:
                    objN = C0173.n(51911, null, new Object[]{path, openOptionArr});
                    str = "۟ۤۢ";
                    break;
                case 1753699:
                    return outputStream;
                default:
                    outputStream = (OutputStream) objN;
                    str = "ۦۨۥ";
                    break;
            }
        }
    }

    public static /* bridge */ /* synthetic */ Path d(File file) {
        return (Path) C0173.n(77964, file, new Object[0]);
    }

    public static /* bridge */ /* synthetic */ StandardCopyOption e() {
        return (StandardCopyOption) C0173.n(20004);
    }

    public static /* bridge */ /* synthetic */ void f(Process process) {
    }

    public static /* bridge */ /* synthetic */ void g(Path path, Path path2, CopyOption[] copyOptionArr) throws Throwable {
        String str = "۠ۦ۠";
        Object objN = null;
        while (true) {
            switch (C0034.m132(str)) {
                case 1746783:
                    return;
                case 1752612:
                    str = "۟ۢۢ";
                    break;
                default:
                    objN = C0173.n(80897, null, new Object[]{path, path2, copyOptionArr});
                    str = "ۥۣۤ";
                    break;
            }
        }
    }

    public static /* bridge */ /* synthetic */ StandardCopyOption h() {
        return (StandardCopyOption) C0173.n(30731);
    }
}

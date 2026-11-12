package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Init {
    public static volatile String a;

    public static void checkPermission() throws Throwable {
        InitOrigin.checkPermission();
    }

    public static ClassLoader classLoader() {
        return InitOrigin.classLoader();
    }

    public static Application context() {
        return InitOrigin.context();
    }

    public static void deleteFilesWithFeature(String str, String str2) {
        InitOrigin.deleteFilesWithFeature(str, str2);
    }

    public static void execute(Runnable runnable) {
        InitOrigin.execute(runnable);
    }

    public static InitOrigin get() {
        return InitOrigin.get();
    }

    public static Activity getActivity() {
        return InitOrigin.getActivity();
    }

    public static boolean hasStoragePermission() {
        return InitOrigin.hasStoragePermission();
    }

    public static void init(Context context) {
        initSafe(context, null);
    }

    public static void initSafe(Context context) {
        initSafe(context, null);
    }

    public static void initSafe(Context context, String str) {
        String str2 = str;
        if (str2 == null || str2.isEmpty()) {
            str2 = a;
        }
        InitOrigin.initSafe(context, str2);
        if (InitOrigin.a(context) != null) {
            a = InitOrigin.e;
        }
    }

    public static String randomKey(int i) {
        return InitOrigin.randomKey(i);
    }

    public static void run(Runnable runnable) {
        InitOrigin.run(runnable);
    }

    public static void run(Runnable runnable, int i) {
        InitOrigin.run(runnable, i);
    }
}

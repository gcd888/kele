package com.github.catvod.spider.merge.l0;

import java.util.Locale;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class i {
    public static String a(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String b(String str) {
        return a(str).trim();
    }
}

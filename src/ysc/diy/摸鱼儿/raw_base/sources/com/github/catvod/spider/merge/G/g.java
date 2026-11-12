package com.github.catvod.spider.merge.G;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class g {
    public static void a(boolean z) {
        if (!z) {
            throw new com.github.catvod.spider.merge.d0.b("Must be true");
        }
    }

    public static List b(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        com.github.catvod.spider.merge.L.a.c(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static void c(String str) {
        if (str == null || str.length() == 0) {
            throw new com.github.catvod.spider.merge.d0.b("String must not be empty");
        }
    }

    public static void d(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new com.github.catvod.spider.merge.d0.b(str2);
        }
    }

    public static void e(Object obj) {
        if (obj == null) {
            throw new com.github.catvod.spider.merge.d0.b("Object must not be null");
        }
    }
}

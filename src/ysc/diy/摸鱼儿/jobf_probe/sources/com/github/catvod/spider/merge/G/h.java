package com.github.catvod.spider.merge.G;

import java.util.Collection;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class h extends g {
    public static int f(Iterable iterable) {
        com.github.catvod.spider.merge.L.a.d(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}

package com.github.catvod.spider.merge.G;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class q {
    public static final int a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map b(com.github.catvod.spider.merge.F.a... aVarArr) {
        if (aVarArr.length <= 0) {
            return o.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(aVarArr.length));
        d(linkedHashMap, aVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap c(com.github.catvod.spider.merge.F.a... aVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(aVarArr.length));
        d(linkedHashMap, aVarArr);
        return linkedHashMap;
    }

    public static final void d(LinkedHashMap linkedHashMap, com.github.catvod.spider.merge.F.a[] aVarArr) {
        for (com.github.catvod.spider.merge.F.a aVar : aVarArr) {
            linkedHashMap.put(aVar.a, aVar.b);
        }
    }

    public static LinkedHashMap e(Map map) {
        com.github.catvod.spider.merge.L.a.d(map, "<this>");
        return new LinkedHashMap(map);
    }
}

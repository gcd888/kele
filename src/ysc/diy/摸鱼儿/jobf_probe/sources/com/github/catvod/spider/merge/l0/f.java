package com.github.catvod.spider.merge.l0;

import java.util.Iterator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class f {
    public static String a(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}

package com.github.catvod.spider.merge.O;

import java.util.Iterator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class c {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final k d;

    public c(CharSequence charSequence, int i, int i2, k kVar) {
        com.github.catvod.spider.merge.L.a.d(charSequence, "input");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = kVar;
    }

    public final Iterator a() {
        return new b(this);
    }
}

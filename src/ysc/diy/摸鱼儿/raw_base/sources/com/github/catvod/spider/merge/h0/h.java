package com.github.catvod.spider.merge.h0;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class h extends n {
    public final String a;
    public final Pattern b;

    public h(String str, Pattern pattern) {
        this.a = com.github.catvod.spider.merge.l0.i.b(str);
        this.b = pattern;
    }

    @Override // com.github.catvod.spider.merge.h0.n
    public final boolean a(com.github.catvod.spider.merge.f0.k kVar, com.github.catvod.spider.merge.f0.k kVar2) {
        String str = this.a;
        return kVar2.l(str) && this.b.matcher(kVar2.c(str)).find();
    }

    public final String toString() {
        return "[" + this.a + "~=" + this.b.toString() + "]";
    }
}

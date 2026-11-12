package com.github.catvod.spider.merge.T;

import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0323h {
    public static final com.github.catvod.spider.merge.U.d c;
    public final C0316a a;
    public final Q b;

    static {
        UUID uuid = C0322g.a;
        com.github.catvod.spider.merge.U.d dVar = new com.github.catvod.spider.merge.U.d(new C0320e(true));
        c = dVar;
        dVar.a = Integer.MAX_VALUE;
    }

    public AbstractC0323h(C0316a c0316a, Q q) {
        this.a = c0316a;
        this.b = q;
    }

    public abstract void a();
}

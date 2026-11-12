package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0400b0 extends g1 {
    public C0400b0() {
        super("Data", 0);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cL = c0397a.l();
        if (cL == 0) {
            p.m(this);
            p.e(c0397a.e());
            return;
        }
        if (cL == '&') {
            p.o(g1.b);
            p.a.a();
        } else if (cL == '<') {
            p.o(g1.h);
            p.a.a();
        } else if (cL != 65535) {
            p.g(c0397a.g());
        } else {
            p.f(new J());
        }
    }
}

package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0443x0 extends g1 {
    public C0443x0() {
        super("Rcdata", 2);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cL = c0397a.l();
        if (cL == 0) {
            p.m(this);
            c0397a.a();
            p.e((char) 65533);
        } else if (cL == '&') {
            p.o(g1.d);
            p.a.a();
        } else if (cL == '<') {
            p.o(g1.k);
            p.a.a();
        } else if (cL != 65535) {
            p.g(c0397a.g());
        } else {
            p.f(new J());
        }
    }
}

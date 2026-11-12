package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum f1 extends g1 {
    public f1() {
        super("EndTagOpen", 8);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        boolean zN = c0397a.n();
        C0400b0 c0400b0 = g1.a;
        if (zN) {
            p.l(this);
            p.g("</");
            p.o(c0400b0);
        } else if (c0397a.t()) {
            p.c(false);
            p.o(g1.j);
        } else if (c0397a.r('>')) {
            p.m(this);
            p.o(c0400b0);
            p.a.a();
        } else {
            p.m(this);
            p.n.f();
            p.n.h('/');
            p.o(g1.Q);
        }
    }
}

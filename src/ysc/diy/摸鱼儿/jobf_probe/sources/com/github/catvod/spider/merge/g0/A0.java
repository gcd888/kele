package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum A0 extends g1 {
    public A0() {
        super("SelfClosingStartTag", 41);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        C0400b0 c0400b0 = g1.a;
        if (cE == '>') {
            p.k.k = true;
            p.k();
            p.o(c0400b0);
        } else if (cE == 65535) {
            p.l(this);
            p.o(c0400b0);
        } else {
            c0397a.z();
            p.m(this);
            p.o(g1.H);
        }
    }
}

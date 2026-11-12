package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum G0 extends g1 {
    public G0() {
        super("CommentEndDash", 47);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        F0 f0 = g1.U;
        if (cE == 0) {
            p.m(this);
            H h = p.n;
            h.h('-');
            h.h((char) 65533);
            p.o(f0);
            return;
        }
        if (cE == '-') {
            p.o(g1.W);
            return;
        }
        if (cE == 65535) {
            p.l(this);
            p.i();
            p.o(g1.a);
        } else {
            H h2 = p.n;
            h2.h('-');
            h2.h(cE);
            p.o(f0);
        }
    }
}

package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum J0 extends g1 {
    public J0() {
        super("CommentEndBang", 49);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        F0 f0 = g1.U;
        if (cE == 0) {
            p.m(this);
            H h = p.n;
            h.i("--!");
            h.h((char) 65533);
            p.o(f0);
            return;
        }
        if (cE == '-') {
            p.n.i("--!");
            p.o(g1.V);
            return;
        }
        C0400b0 c0400b0 = g1.a;
        if (cE == '>') {
            p.i();
            p.o(c0400b0);
        } else if (cE == 65535) {
            p.l(this);
            p.i();
            p.o(c0400b0);
        } else {
            H h2 = p.n;
            h2.i("--!");
            h2.h(cE);
            p.o(f0);
        }
    }
}

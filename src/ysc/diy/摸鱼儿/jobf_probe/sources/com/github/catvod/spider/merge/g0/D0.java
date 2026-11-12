package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum D0 extends g1 {
    public D0() {
        super("CommentStart", 44);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        F0 f0 = g1.U;
        if (cE == 0) {
            p.m(this);
            p.n.h((char) 65533);
            p.o(f0);
            return;
        }
        if (cE == '-') {
            p.o(g1.T);
            return;
        }
        C0400b0 c0400b0 = g1.a;
        if (cE == '>') {
            p.m(this);
            p.i();
            p.o(c0400b0);
        } else if (cE != 65535) {
            c0397a.z();
            p.o(f0);
        } else {
            p.l(this);
            p.i();
            p.o(c0400b0);
        }
    }
}

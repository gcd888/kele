package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum F0 extends g1 {
    public F0() {
        super("Comment", 46);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cL = c0397a.l();
        if (cL == 0) {
            p.m(this);
            c0397a.a();
            p.n.h((char) 65533);
        } else if (cL == '-') {
            p.o(g1.V);
            p.a.a();
        } else {
            if (cL != 65535) {
                p.n.i(c0397a.j('-', 0));
                return;
            }
            p.l(this);
            p.i();
            p.o(g1.a);
        }
    }
}

package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum e1 extends g1 {
    public e1() {
        super("TagOpen", 7);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cL = c0397a.l();
        if (cL == '!') {
            p.o(g1.R);
            p.a.a();
            return;
        }
        if (cL == '/') {
            p.o(g1.i);
            p.a.a();
            return;
        }
        if (cL == '?') {
            p.n.f();
            p.o(g1.Q);
        } else if (c0397a.t()) {
            p.c(true);
            p.o(g1.j);
        } else {
            p.m(this);
            p.e('<');
            p.o(g1.a);
        }
    }
}

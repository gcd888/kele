package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0 extends g1 {
    public C0() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        if (c0397a.p("--")) {
            p.n.f();
            p.o(g1.S);
        } else {
            if (c0397a.q("DOCTYPE")) {
                p.o(g1.Y);
                return;
            }
            if (c0397a.p("[CDATA[")) {
                p.d();
                p.o(g1.o0);
            } else {
                p.m(this);
                p.n.f();
                p.o(g1.Q);
            }
        }
    }
}

package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum W extends g1 {
    public W() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        X x = g1.p;
        T0 t0 = g1.e;
        if (c0397a.t()) {
            p.c(false);
            p.o(x);
        } else {
            p.g("</");
            p.o(t0);
        }
    }
}

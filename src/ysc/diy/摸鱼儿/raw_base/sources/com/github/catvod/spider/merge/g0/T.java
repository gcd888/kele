package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum T extends g1 {
    public T() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        if (!c0397a.t()) {
            p.g("</");
            p.o(g1.c);
            return;
        }
        p.c(false);
        M m = p.k;
        char cL = c0397a.l();
        m.getClass();
        m.k(String.valueOf(cL));
        p.h.append(c0397a.l());
        p.o(g1.m);
        p.a.a();
    }
}

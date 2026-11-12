package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0414i0 extends g1 {
    public C0414i0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        if (!c0397a.t()) {
            p.g("</");
            p.o(g1.v);
            return;
        }
        p.c(false);
        M m = p.k;
        char cL = c0397a.l();
        m.getClass();
        m.k(String.valueOf(cL));
        p.h.append(c0397a.l());
        p.o(g1.A);
        p.a.a();
    }
}

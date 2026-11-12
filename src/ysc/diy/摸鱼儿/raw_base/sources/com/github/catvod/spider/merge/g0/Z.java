package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum Z extends g1 {
    public Z() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        C0398a0 c0398a0 = g1.s;
        c1 c1Var = g1.f;
        if (c0397a.t()) {
            p.c(false);
            p.o(c0398a0);
        } else {
            p.g("</");
            p.o(c1Var);
        }
    }
}

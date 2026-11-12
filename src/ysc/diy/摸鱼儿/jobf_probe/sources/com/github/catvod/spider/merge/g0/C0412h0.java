package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0412h0 extends g1 {
    public C0412h0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        if (c0397a.t()) {
            p.d();
            p.h.append(c0397a.l());
            p.g("<");
            p.e(c0397a.l());
            p.o(g1.B);
            p.a.a();
            return;
        }
        if (!c0397a.r('/')) {
            p.e('<');
            p.o(g1.v);
        } else {
            p.d();
            p.o(g1.z);
            p.a.a();
        }
    }
}

package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0406e0 extends g1 {
    public C0406e0() {
        super("ScriptDataEscaped", 21);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        if (c0397a.n()) {
            p.l(this);
            p.o(g1.a);
            return;
        }
        char cL = c0397a.l();
        if (cL == 0) {
            p.m(this);
            c0397a.a();
            p.e((char) 65533);
        } else if (cL == '-') {
            p.e('-');
            p.o(g1.w);
            p.a.a();
        } else if (cL != '<') {
            p.g(c0397a.j('-', '<', 0));
        } else {
            p.o(g1.y);
            p.a.a();
        }
    }
}

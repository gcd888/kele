package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0420l0 extends g1 {
    public C0420l0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cL = c0397a.l();
        if (cL == 0) {
            p.m(this);
            c0397a.a();
            p.e((char) 65533);
            return;
        }
        if (cL == '-') {
            p.e(cL);
            p.o(g1.D);
            p.a.a();
        } else if (cL == '<') {
            p.e(cL);
            p.o(g1.F);
            p.a.a();
        } else if (cL != 65535) {
            p.g(c0397a.j('-', '<', 0));
        } else {
            p.l(this);
            p.o(g1.a);
        }
    }
}

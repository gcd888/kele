package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0424n0 extends g1 {
    public C0424n0() {
        super("ScriptDataDoubleEscapedDash", 29);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        C0420l0 c0420l0 = g1.C;
        if (cE == 0) {
            p.m(this);
            p.e((char) 65533);
            p.o(c0420l0);
        } else if (cE == '-') {
            p.e(cE);
            p.o(g1.E);
        } else if (cE == '<') {
            p.e(cE);
            p.o(g1.F);
        } else if (cE != 65535) {
            p.e(cE);
            p.o(c0420l0);
        } else {
            p.l(this);
            p.o(g1.a);
        }
    }
}

package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0426o0 extends g1 {
    public C0426o0() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        C0420l0 c0420l0 = g1.C;
        if (cE == 0) {
            p.m(this);
            p.e((char) 65533);
            p.o(c0420l0);
            return;
        }
        if (cE == '-') {
            p.e(cE);
            return;
        }
        if (cE == '<') {
            p.e(cE);
            p.o(g1.F);
        } else if (cE == '>') {
            p.e(cE);
            p.o(g1.f);
        } else if (cE != 65535) {
            p.e(cE);
            p.o(c0420l0);
        } else {
            p.l(this);
            p.o(g1.a);
        }
    }
}

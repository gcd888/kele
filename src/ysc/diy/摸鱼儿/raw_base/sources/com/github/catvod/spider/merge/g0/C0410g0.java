package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0410g0 extends g1 {
    public C0410g0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        if (c0397a.n()) {
            p.l(this);
            p.o(g1.a);
            return;
        }
        char cE = c0397a.e();
        C0406e0 c0406e0 = g1.v;
        if (cE == 0) {
            p.m(this);
            p.e((char) 65533);
            p.o(c0406e0);
        } else {
            if (cE == '-') {
                p.e(cE);
                return;
            }
            if (cE == '<') {
                p.o(g1.y);
            } else if (cE != '>') {
                p.e(cE);
                p.o(c0406e0);
            } else {
                p.e(cE);
                p.o(g1.f);
            }
        }
    }
}

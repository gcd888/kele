package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum N0 extends g1 {
    public N0() {
        super("AfterDoctypeName", 53);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        boolean zN = c0397a.n();
        C0400b0 c0400b0 = g1.a;
        if (zN) {
            p.l(this);
            p.m.f = true;
            p.j();
            p.o(c0400b0);
            return;
        }
        if (c0397a.s('\t', '\n', '\r', '\f', ' ')) {
            c0397a.a();
            return;
        }
        if (c0397a.r('>')) {
            p.j();
            p.o(c0400b0);
            p.a.a();
        } else if (c0397a.q("PUBLIC")) {
            p.m.c = "PUBLIC";
            p.o(g1.c0);
        } else if (c0397a.q("SYSTEM")) {
            p.m.c = "SYSTEM";
            p.o(g1.i0);
        } else {
            p.m(this);
            p.m.f = true;
            p.o(g1.n0);
            p.a.a();
        }
    }
}

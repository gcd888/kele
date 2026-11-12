package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum V0 extends g1 {
    public V0() {
        super("AfterDoctypeSystemKeyword", 60);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            p.o(g1.j0);
            return;
        }
        if (cE == '\"') {
            p.m(this);
            p.o(g1.k0);
            return;
        }
        if (cE == '\'') {
            p.m(this);
            p.o(g1.l0);
            return;
        }
        C0400b0 c0400b0 = g1.a;
        if (cE == '>') {
            p.m(this);
            p.m.f = true;
            p.j();
            p.o(c0400b0);
            return;
        }
        if (cE != 65535) {
            p.m(this);
            p.m.f = true;
            p.j();
        } else {
            p.l(this);
            p.m.f = true;
            p.j();
            p.o(c0400b0);
        }
    }
}

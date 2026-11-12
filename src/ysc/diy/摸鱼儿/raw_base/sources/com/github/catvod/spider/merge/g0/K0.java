package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum K0 extends g1 {
    public K0() {
        super("Doctype", 50);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        L0 l0 = g1.Z;
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            p.o(l0);
            return;
        }
        if (cE != '>') {
            if (cE != 65535) {
                p.m(this);
                p.o(l0);
                return;
            }
            p.l(this);
        }
        p.m(this);
        p.m.f();
        p.m.f = true;
        p.j();
        p.o(g1.a);
    }
}

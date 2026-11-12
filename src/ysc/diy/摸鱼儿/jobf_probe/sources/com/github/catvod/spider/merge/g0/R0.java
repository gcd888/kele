package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum R0 extends g1 {
    public R0() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        if (cE == 0) {
            p.m(this);
            p.m.d.append((char) 65533);
            return;
        }
        if (cE == '\'') {
            p.o(g1.g0);
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
            p.m.d.append(cE);
            return;
        }
        p.l(this);
        p.m.f = true;
        p.j();
        p.o(c0400b0);
    }
}

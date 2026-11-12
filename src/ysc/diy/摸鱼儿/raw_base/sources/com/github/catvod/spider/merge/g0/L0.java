package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum L0 extends g1 {
    public L0() {
        super("BeforeDoctypeName", 51);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        boolean zT = c0397a.t();
        M0 m0 = g1.a0;
        if (zT) {
            p.m.f();
            p.o(m0);
            return;
        }
        char cE = c0397a.e();
        if (cE == 0) {
            p.m(this);
            p.m.f();
            p.m.b.append((char) 65533);
            p.o(m0);
            return;
        }
        if (cE != ' ') {
            if (cE == 65535) {
                p.l(this);
                p.m.f();
                p.m.f = true;
                p.j();
                p.o(g1.a);
                return;
            }
            if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                return;
            }
            p.m.f();
            p.m.b.append(cE);
            p.o(m0);
        }
    }
}

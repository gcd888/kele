package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum M0 extends g1 {
    public M0() {
        super("DoctypeName", 52);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        if (c0397a.u()) {
            p.m.b.append(c0397a.h());
            return;
        }
        char cE = c0397a.e();
        if (cE == 0) {
            p.m(this);
            p.m.b.append((char) 65533);
            return;
        }
        if (cE != ' ') {
            C0400b0 c0400b0 = g1.a;
            if (cE == '>') {
                p.j();
                p.o(c0400b0);
                return;
            }
            if (cE == 65535) {
                p.l(this);
                p.m.f = true;
                p.j();
                p.o(c0400b0);
                return;
            }
            if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                p.m.b.append(cE);
                return;
            }
        }
        p.o(g1.b0);
    }
}

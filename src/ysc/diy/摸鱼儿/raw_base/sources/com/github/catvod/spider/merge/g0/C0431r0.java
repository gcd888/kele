package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0431r0 extends g1 {
    public C0431r0() {
        super("BeforeAttributeName", 33);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        C0433s0 c0433s0 = g1.I;
        if (cE == 0) {
            c0397a.z();
            p.m(this);
            p.k.o();
            p.o(c0433s0);
            return;
        }
        if (cE != ' ') {
            if (cE != '\"' && cE != '\'') {
                if (cE == '/') {
                    p.o(g1.P);
                    return;
                }
                C0400b0 c0400b0 = g1.a;
                if (cE == 65535) {
                    p.l(this);
                    p.o(c0400b0);
                    return;
                }
                if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                    return;
                }
                switch (cE) {
                    case '<':
                        c0397a.z();
                        p.m(this);
                        break;
                    case '=':
                        break;
                    case '>':
                        break;
                    default:
                        p.k.o();
                        c0397a.z();
                        p.o(c0433s0);
                        return;
                }
                p.k();
                p.o(c0400b0);
                return;
            }
            p.m(this);
            p.k.o();
            M m = p.k;
            m.f = true;
            String str = m.e;
            StringBuilder sb = m.d;
            if (str != null) {
                sb.append(str);
                m.e = null;
            }
            sb.append(cE);
            p.o(c0433s0);
        }
    }
}

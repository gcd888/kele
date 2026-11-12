package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0435t0 extends g1 {
    public C0435t0() {
        super("AfterAttributeName", 35);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        C0433s0 c0433s0 = g1.I;
        if (cE == 0) {
            p.m(this);
            M m = p.k;
            m.f = true;
            String str = m.e;
            StringBuilder sb = m.d;
            if (str != null) {
                sb.append(str);
                m.e = null;
            }
            sb.append((char) 65533);
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
                        break;
                    case '=':
                        p.o(g1.K);
                        break;
                    case '>':
                        p.k();
                        p.o(c0400b0);
                        break;
                    default:
                        p.k.o();
                        c0397a.z();
                        p.o(c0433s0);
                        break;
                }
                return;
            }
            p.m(this);
            p.k.o();
            M m2 = p.k;
            m2.f = true;
            String str2 = m2.e;
            StringBuilder sb2 = m2.d;
            if (str2 != null) {
                sb2.append(str2);
                m2.e = null;
            }
            sb2.append(cE);
            p.o(c0433s0);
        }
    }
}

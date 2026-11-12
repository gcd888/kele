package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0437u0 extends g1 {
    public C0437u0() {
        super("BeforeAttributeValue", 36);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        C0445y0 c0445y0 = g1.N;
        if (cE == 0) {
            p.m(this);
            p.k.h((char) 65533);
            p.o(c0445y0);
            return;
        }
        if (cE != ' ') {
            if (cE == '\"') {
                p.o(g1.L);
                return;
            }
            if (cE != '`') {
                C0400b0 c0400b0 = g1.a;
                if (cE == 65535) {
                    p.l(this);
                    p.k();
                    p.o(c0400b0);
                    return;
                }
                if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                    return;
                }
                if (cE == '&') {
                    c0397a.z();
                    p.o(c0445y0);
                    return;
                }
                if (cE == '\'') {
                    p.o(g1.M);
                    return;
                }
                switch (cE) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        p.m(this);
                        p.k();
                        p.o(c0400b0);
                        break;
                    default:
                        c0397a.z();
                        p.o(c0445y0);
                        break;
                }
                return;
            }
            p.m(this);
            p.k.h(cE);
            p.o(c0445y0);
        }
    }
}

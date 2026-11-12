package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0445y0 extends g1 {
    public C0445y0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        String strK = c0397a.k(g1.q0);
        if (strK.length() > 0) {
            p.k.i(strK);
        }
        char cE = c0397a.e();
        if (cE == 0) {
            p.m(this);
            p.k.h((char) 65533);
            return;
        }
        if (cE != ' ') {
            if (cE != '\"' && cE != '`') {
                C0400b0 c0400b0 = g1.a;
                if (cE == 65535) {
                    p.l(this);
                    p.o(c0400b0);
                    return;
                }
                if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                    if (cE == '&') {
                        int[] iArrB = p.b('>', true);
                        if (iArrB != null) {
                            p.k.j(iArrB);
                            return;
                        } else {
                            p.k.h('&');
                            return;
                        }
                    }
                    if (cE != '\'') {
                        switch (cE) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                p.k();
                                p.o(c0400b0);
                                break;
                            default:
                                p.k.h(cE);
                                break;
                        }
                        return;
                    }
                }
            }
            p.m(this);
            p.k.h(cE);
            return;
        }
        p.o(g1.H);
    }
}

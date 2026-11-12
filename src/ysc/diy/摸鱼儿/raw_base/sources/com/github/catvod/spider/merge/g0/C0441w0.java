package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0441w0 extends g1 {
    public C0441w0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        String strF = c0397a.f(true);
        if (strF.length() > 0) {
            p.k.i(strF);
        } else {
            p.k.j = true;
        }
        char cE = c0397a.e();
        if (cE == 0) {
            p.m(this);
            p.k.h((char) 65533);
            return;
        }
        if (cE == 65535) {
            p.l(this);
            p.o(g1.a);
            return;
        }
        if (cE != '&') {
            if (cE != '\'') {
                p.k.h(cE);
                return;
            } else {
                p.o(g1.O);
                return;
            }
        }
        int[] iArrB = p.b('\'', true);
        if (iArrB != null) {
            p.k.j(iArrB);
        } else {
            p.k.h('&');
        }
    }
}

package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0447z0 extends g1 {
    public C0447z0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        C0431r0 c0431r0 = g1.H;
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            p.o(c0431r0);
            return;
        }
        if (cE == '/') {
            p.o(g1.P);
            return;
        }
        C0400b0 c0400b0 = g1.a;
        if (cE == '>') {
            p.k();
            p.o(c0400b0);
        } else if (cE == 65535) {
            p.l(this);
            p.o(c0400b0);
        } else {
            c0397a.z();
            p.m(this);
            p.o(c0431r0);
        }
    }
}

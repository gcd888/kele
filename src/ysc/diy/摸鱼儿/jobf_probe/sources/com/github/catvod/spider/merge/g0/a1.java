package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum a1 extends g1 {
    public a1() {
        super("BogusDoctype", 65);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        C0400b0 c0400b0 = g1.a;
        if (cE == '>') {
            p.j();
            p.o(c0400b0);
        } else {
            if (cE != 65535) {
                return;
            }
            p.j();
            p.o(c0400b0);
        }
    }
}

package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum Y extends g1 {
    public Y() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cE = c0397a.e();
        if (cE == '!') {
            p.g("<!");
            p.o(g1.t);
            return;
        }
        if (cE == '/') {
            p.d();
            p.o(g1.r);
        } else if (cE != 65535) {
            p.g("<");
            c0397a.z();
            p.o(g1.f);
        } else {
            p.g("<");
            p.l(this);
            p.o(g1.a);
        }
    }
}

package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum d1 extends g1 {
    public d1() {
        super("PLAINTEXT", 6);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char cL = c0397a.l();
        if (cL == 0) {
            p.m(this);
            c0397a.a();
            p.e((char) 65533);
        } else if (cL != 65535) {
            p.g(c0397a.i((char) 0));
        } else {
            p.f(new J());
        }
    }
}

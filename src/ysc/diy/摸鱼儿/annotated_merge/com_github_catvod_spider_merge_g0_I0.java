package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum I0 extends g1 {
    public I0() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        C0443x0 c0443x0 = g1.c;
        int[] iArrB = p.b(null, false);
        if (iArrB == null) {
            p.e('&');
        } else {
            p.g(new String(iArrB, 0, iArrB.length));
        }
        p.o(c0443x0);
    }
}

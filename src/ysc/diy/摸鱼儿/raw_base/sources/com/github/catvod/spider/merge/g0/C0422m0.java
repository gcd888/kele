package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0422m0 extends g1 {
    public C0422m0() {
        super("CharacterReferenceInData", 1);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        C0400b0 c0400b0 = g1.a;
        int[] iArrB = p.b(null, false);
        if (iArrB == null) {
            p.e('&');
        } else {
            p.g(new String(iArrB, 0, iArrB.length));
        }
        p.o(c0400b0);
    }
}

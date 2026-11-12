package com.github.catvod.spider.merge.T;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0328m extends k0 {
    public final int b;

    public C0328m(AbstractC0324i abstractC0324i, int i) {
        super(abstractC0324i);
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.T.k0
    public final int a() {
        return 5;
    }

    @Override // com.github.catvod.spider.merge.T.k0
    public final com.github.catvod.spider.merge.V.f c() {
        com.github.catvod.spider.merge.V.f fVar = new com.github.catvod.spider.merge.V.f(new int[0]);
        fVar.a(this.b);
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.T.k0
    public final boolean d(int i, int i2) {
        return this.b == i;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}

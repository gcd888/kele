package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class I extends d0 {
    public I(AbstractC0324i abstractC0324i, com.github.catvod.spider.merge.V.f fVar) {
        super(abstractC0324i, fVar);
    }

    @Override // com.github.catvod.spider.merge.T.d0, com.github.catvod.spider.merge.T.k0
    public final int a() {
        return 8;
    }

    @Override // com.github.catvod.spider.merge.T.d0, com.github.catvod.spider.merge.T.k0
    public final boolean d(int i, int i2) {
        return i >= 0 && i <= i2 && !this.b.d(i);
    }

    @Override // com.github.catvod.spider.merge.T.d0
    public final String toString() {
        return "~" + this.b.toString();
    }
}

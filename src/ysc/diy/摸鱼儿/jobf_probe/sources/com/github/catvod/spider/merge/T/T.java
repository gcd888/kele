package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class T extends k0 {
    public final int b;
    public final int c;

    public T(AbstractC0324i abstractC0324i, int i, int i2) {
        super(abstractC0324i);
        this.b = i;
        this.c = i2;
    }

    @Override // com.github.catvod.spider.merge.T.k0
    public final int a() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.T.k0
    public final com.github.catvod.spider.merge.V.f c() {
        com.github.catvod.spider.merge.V.f fVar = new com.github.catvod.spider.merge.V.f(new int[0]);
        fVar.b(this.b, this.c);
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.T.k0
    public final boolean d(int i, int i2) {
        return i >= this.b && i <= this.c;
    }

    public final String toString() {
        StringBuilder sbAppendCodePoint = new StringBuilder("'").appendCodePoint(this.b);
        sbAppendCodePoint.append("'..'");
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.c);
        sbAppendCodePoint2.append("'");
        return sbAppendCodePoint2.toString();
    }
}

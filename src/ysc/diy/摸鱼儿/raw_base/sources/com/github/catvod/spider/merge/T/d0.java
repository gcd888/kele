package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class d0 extends k0 {
    public final com.github.catvod.spider.merge.V.f b;

    public d0(AbstractC0324i abstractC0324i, com.github.catvod.spider.merge.V.f fVar) {
        super(abstractC0324i);
        if (fVar == null) {
            fVar = new com.github.catvod.spider.merge.V.f(new int[0]);
            fVar.a(0);
        }
        this.b = fVar;
    }

    @Override // com.github.catvod.spider.merge.T.k0
    public int a() {
        return 7;
    }

    @Override // com.github.catvod.spider.merge.T.k0
    public final com.github.catvod.spider.merge.V.f c() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.T.k0
    public boolean d(int i, int i2) {
        return this.b.d(i);
    }

    public String toString() {
        return this.b.toString();
    }
}

package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class O extends AbstractC0325j {
    public final int b;
    public final int c;
    public final boolean d;

    public O(AbstractC0324i abstractC0324i, int i, int i2, boolean z) {
        super(abstractC0324i);
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // com.github.catvod.spider.merge.T.k0
    public final int a() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.T.k0
    public final boolean b() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.T.k0
    public final boolean d(int i, int i2) {
        return false;
    }

    public final String toString() {
        return "pred_" + this.b + ":" + this.c;
    }
}

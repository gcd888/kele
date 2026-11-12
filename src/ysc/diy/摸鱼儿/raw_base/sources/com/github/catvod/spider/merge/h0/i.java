package com.github.catvod.spider.merge.h0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class i extends n {
    public final int a;
    public final /* synthetic */ int b;

    public i(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.h0.n
    public final boolean a(com.github.catvod.spider.merge.f0.k kVar, com.github.catvod.spider.merge.f0.k kVar2) {
        switch (this.b) {
            case 0:
                return kVar2.H() == this.a;
            case 1:
                return kVar2.H() > this.a;
            default:
                return kVar != kVar2 && kVar2.H() < this.a;
        }
    }

    public final String toString() {
        int i = this.a;
        switch (this.b) {
            case 0:
                return String.format(":eq(%d)", Integer.valueOf(i));
            case 1:
                return String.format(":gt(%d)", Integer.valueOf(i));
            default:
                return String.format(":lt(%d)", Integer.valueOf(i));
        }
    }
}

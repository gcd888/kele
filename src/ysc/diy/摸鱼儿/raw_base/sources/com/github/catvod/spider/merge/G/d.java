package com.github.catvod.spider.merge.G;

import java.util.RandomAccess;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class d extends e implements RandomAccess {
    public final e a;
    public final int b;
    public final int c;

    public d(e eVar, int i, int i2) {
        com.github.catvod.spider.merge.L.a.d(eVar, "list");
        this.a = eVar;
        this.b = i;
        int iA = eVar.a();
        if (i < 0 || i2 > iA) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + iA);
        }
        if (i <= i2) {
            this.c = i2 - i;
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    @Override // com.github.catvod.spider.merge.G.e
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.a.get(this.b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}

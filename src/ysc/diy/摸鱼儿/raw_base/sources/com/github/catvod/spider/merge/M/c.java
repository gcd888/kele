package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class c extends a {
    public static final c d = new c(1, 0);

    public c(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // com.github.catvod.spider.merge.M.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.a == cVar.a) {
                    if (this.b == cVar.b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.M.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // com.github.catvod.spider.merge.M.a
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // com.github.catvod.spider.merge.M.a
    public final String toString() {
        return this.a + ".." + this.b;
    }
}

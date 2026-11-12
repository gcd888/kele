package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a0 extends c0 implements Comparable {
    public final int b;

    public a0(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.T.c0
    public final boolean c(com.github.catvod.spider.merge.S.r rVar, com.github.catvod.spider.merge.S.o oVar) {
        return rVar.b(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((a0) obj).b;
    }

    @Override // com.github.catvod.spider.merge.T.c0
    public final c0 d(com.github.catvod.spider.merge.S.r rVar, com.github.catvod.spider.merge.S.o oVar) {
        if (rVar.b(this.b)) {
            return c0.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            return this == obj || this.b == ((a0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return 31 + this.b;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.D.b.l(new StringBuilder("{"), this.b, ">=prec}?");
    }
}

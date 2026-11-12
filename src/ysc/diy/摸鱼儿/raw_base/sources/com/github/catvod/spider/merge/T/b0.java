package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class b0 extends c0 {
    public final int b;
    public final int c;
    public final boolean d;

    public b0() {
        this.b = -1;
        this.c = -1;
        this.d = false;
    }

    @Override // com.github.catvod.spider.merge.T.c0
    public final boolean c(com.github.catvod.spider.merge.S.r rVar, com.github.catvod.spider.merge.S.o oVar) {
        rVar.getClass();
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        b0 b0Var = (b0) obj;
        return this.b == b0Var.b && this.c == b0Var.c && this.d == b0Var.d;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.b(com.github.catvod.spider.merge.l0.e.b(com.github.catvod.spider.merge.l0.e.b(0, this.b), this.c), this.d ? 1 : 0), 3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.b);
        sb.append(":");
        return com.github.catvod.spider.merge.D.b.l(sb, this.c, "}?");
    }

    public b0(int i, int i2, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}

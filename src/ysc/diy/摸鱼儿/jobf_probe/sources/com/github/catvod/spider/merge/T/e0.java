package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class e0 extends P {
    public final P c;
    public final int d;

    public e0(P p, int i) {
        super(p != null ? com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.b(com.github.catvod.spider.merge.l0.e.c(1, p), i), 2) : com.github.catvod.spider.merge.l0.e.a(1, 0));
        this.c = p;
        this.d = i;
    }

    public static e0 i(P p, int i) {
        return (i == Integer.MAX_VALUE && p == null) ? P.b : new e0(p, i);
    }

    @Override // com.github.catvod.spider.merge.T.P
    public P c(int i) {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.T.P
    public int d(int i) {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.T.P
    public boolean equals(Object obj) {
        P p;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        if (this.a != ((P) obj).a) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.d == e0Var.d && (p = this.c) != null && p.equals(e0Var.c);
    }

    @Override // com.github.catvod.spider.merge.T.P
    public int h() {
        return 1;
    }

    public String toString() {
        P p = this.c;
        String string = p != null ? p.toString() : "";
        int length = string.length();
        int i = this.d;
        if (length == 0) {
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(i) + " " + string;
    }
}

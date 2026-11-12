package com.github.catvod.spider.merge.T;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0327l extends P {
    public final P[] c;
    public final int[] d;

    public C0327l(e0 e0Var) {
        this(new P[]{e0Var.c}, new int[]{e0Var.d});
    }

    @Override // com.github.catvod.spider.merge.T.P
    public final P c(int i) {
        return this.c[i];
    }

    @Override // com.github.catvod.spider.merge.T.P
    public final int d(int i) {
        return this.d[i];
    }

    @Override // com.github.catvod.spider.merge.T.P
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0327l)) {
            return false;
        }
        if (this.a != ((P) obj).a) {
            return false;
        }
        C0327l c0327l = (C0327l) obj;
        return Arrays.equals(this.d, c0327l.d) && Arrays.equals(this.c, c0327l.c);
    }

    @Override // com.github.catvod.spider.merge.T.P
    public final boolean f() {
        return this.d[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.T.P
    public final int h() {
        return this.d.length;
    }

    public final String toString() {
        if (f()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            int[] iArr = this.d;
            if (i >= iArr.length) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = iArr[i];
            if (i2 == Integer.MAX_VALUE) {
                sb.append("$");
            } else {
                sb.append(i2);
                P[] pArr = this.c;
                if (pArr[i] != null) {
                    sb.append(' ');
                    sb.append(pArr[i].toString());
                } else {
                    sb.append("null");
                }
            }
            i++;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0327l(P[] pArr, int[] iArr) {
        int iB = 1;
        for (P p : pArr) {
            iB = com.github.catvod.spider.merge.l0.e.c(iB, p);
        }
        for (int i : iArr) {
            iB = com.github.catvod.spider.merge.l0.e.b(iB, i);
        }
        super(com.github.catvod.spider.merge.l0.e.a(iB, pArr.length * 2));
        this.c = pArr;
        this.d = iArr;
    }
}

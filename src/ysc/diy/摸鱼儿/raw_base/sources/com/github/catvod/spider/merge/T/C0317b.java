package com.github.catvod.spider.merge.T;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class C0317b {
    public final AbstractC0324i a;
    public final int b;
    public P c;
    public int d;
    public final c0 e;

    public C0317b(AbstractC0324i abstractC0324i, int i, P p) {
        this(abstractC0324i, i, p, c0.a);
    }

    public boolean a(C0317b c0317b) {
        P p;
        P p2;
        if (this == c0317b) {
            return true;
        }
        return c0317b != null && this.a.b == c0317b.a.b && this.b == c0317b.b && ((p = this.c) == (p2 = c0317b.c) || (p != null && p.equals(p2))) && this.e.equals(c0317b.e) && b() == c0317b.b();
    }

    public final boolean b() {
        return (this.d & 1073741824) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0317b) {
            return a((C0317b) obj);
        }
        return false;
    }

    public int hashCode() {
        return com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.c(com.github.catvod.spider.merge.l0.e.c(com.github.catvod.spider.merge.l0.e.b(com.github.catvod.spider.merge.l0.e.b(7, this.a.b), this.b), this.c), this.e), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(",");
        sb.append(this.b);
        if (this.c != null) {
            sb.append(",[");
            sb.append(this.c.toString());
            sb.append("]");
        }
        c0 c0Var = this.e;
        if (c0Var != null && c0Var != c0.a) {
            sb.append(",");
            sb.append(c0Var);
        }
        if ((this.d & (-1073741825)) > 0) {
            sb.append(",up=");
            sb.append(this.d & (-1073741825));
        }
        sb.append(')');
        return sb.toString();
    }

    public C0317b(AbstractC0324i abstractC0324i, int i, P p, c0 c0Var) {
        this.a = abstractC0324i;
        this.b = i;
        this.c = p;
        this.e = c0Var;
    }

    public C0317b(C0317b c0317b, AbstractC0324i abstractC0324i, P p, c0 c0Var) {
        this.a = abstractC0324i;
        this.b = c0317b.b;
        this.c = p;
        this.e = c0Var;
        this.d = c0317b.d;
    }
}

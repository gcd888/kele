package com.github.catvod.spider.merge.T;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0335u extends C0317b {
    public final C0339y f;
    public final boolean g;

    public C0335u(AbstractC0324i abstractC0324i, int i, P p) {
        super(abstractC0324i, i, p, c0.a);
        this.g = false;
        this.f = null;
    }

    public static boolean c(C0335u c0335u, AbstractC0324i abstractC0324i) {
        return c0335u.g || ((abstractC0324i instanceof r) && ((r) abstractC0324i).h);
    }

    @Override // com.github.catvod.spider.merge.T.C0317b
    public final boolean a(C0317b c0317b) {
        boolean zEquals = true;
        if (this == c0317b) {
            return true;
        }
        if (!(c0317b instanceof C0335u)) {
            return false;
        }
        C0335u c0335u = (C0335u) c0317b;
        if (this.g != c0335u.g) {
            return false;
        }
        C0339y c0339y = this.f;
        C0339y c0339y2 = c0335u.f;
        if (c0339y != null) {
            zEquals = c0339y.equals(c0339y2);
        } else if (c0339y2 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.a(c0317b);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.T.C0317b
    public final int hashCode() {
        return com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.c(com.github.catvod.spider.merge.l0.e.b(com.github.catvod.spider.merge.l0.e.c(com.github.catvod.spider.merge.l0.e.c(com.github.catvod.spider.merge.l0.e.b(com.github.catvod.spider.merge.l0.e.b(7, this.a.b), this.b), this.c), this.e), this.g ? 1 : 0), this.f), 6);
    }

    public C0335u(C0335u c0335u, AbstractC0324i abstractC0324i) {
        super(c0335u, abstractC0324i, c0335u.c, c0335u.e);
        this.f = c0335u.f;
        this.g = c(c0335u, abstractC0324i);
    }

    public C0335u(C0335u c0335u, AbstractC0324i abstractC0324i, C0339y c0339y) {
        super(c0335u, abstractC0324i, c0335u.c, c0335u.e);
        this.f = c0339y;
        this.g = c(c0335u, abstractC0324i);
    }

    public C0335u(C0335u c0335u, AbstractC0324i abstractC0324i, P p) {
        super(c0335u, abstractC0324i, p, c0335u.e);
        this.f = c0335u.f;
        this.g = c(c0335u, abstractC0324i);
    }
}

package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0434t extends B {
    public C0434t() {
        super("BeforeHead", 2);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (B.a(n)) {
            c0399b.t((G) n);
            return true;
        }
        if (n.a()) {
            c0399b.u((H) n);
            return true;
        }
        if (n.b()) {
            c0399b.h(this);
            return false;
        }
        if (n.e() && ((L) n).c.equals("html")) {
            return B.g.c(n, c0399b);
        }
        if (n.e()) {
            L l = (L) n;
            if (l.c.equals("head")) {
                c0399b.o = c0399b.s(l);
                c0399b.l = B.d;
                return true;
            }
        }
        if (n.d() && com.github.catvod.spider.merge.e0.b.c(((K) n).c, A.e)) {
            c0399b.H("head");
            return c0399b.E(n);
        }
        if (n.d()) {
            c0399b.h(this);
            return false;
        }
        c0399b.H("head");
        return c0399b.E(n);
    }
}

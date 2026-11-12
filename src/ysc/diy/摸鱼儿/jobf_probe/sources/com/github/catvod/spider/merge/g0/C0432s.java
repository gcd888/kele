package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0432s extends B {
    public C0432s() {
        super("BeforeHtml", 1);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (n.b()) {
            c0399b.h(this);
            return false;
        }
        if (n.a()) {
            c0399b.u((H) n);
            return true;
        }
        if (B.a(n)) {
            c0399b.t((G) n);
            return true;
        }
        boolean zE = n.e();
        C0434t c0434t = B.c;
        if (zE) {
            L l = (L) n;
            if (l.c.equals("html")) {
                c0399b.s(l);
                c0399b.l = c0434t;
                return true;
            }
        }
        if (n.d() && com.github.catvod.spider.merge.e0.b.c(((K) n).c, A.e)) {
            c0399b.getClass();
            com.github.catvod.spider.merge.f0.k kVar = new com.github.catvod.spider.merge.f0.k(c0399b.O("html", c0399b.h), null, null);
            c0399b.y(kVar);
            c0399b.e.add(kVar);
            c0399b.l = c0434t;
            return c0399b.E(n);
        }
        if (n.d()) {
            c0399b.h(this);
            return false;
        }
        c0399b.getClass();
        com.github.catvod.spider.merge.f0.k kVar2 = new com.github.catvod.spider.merge.f0.k(c0399b.O("html", c0399b.h), null, null);
        c0399b.y(kVar2);
        c0399b.e.add(kVar2);
        c0399b.l = c0434t;
        return c0399b.E(n);
    }
}

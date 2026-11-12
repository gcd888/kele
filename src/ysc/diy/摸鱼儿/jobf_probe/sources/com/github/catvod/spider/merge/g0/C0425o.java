package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0425o extends B {
    public C0425o() {
        super("AfterFrameset", 20);
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
            C0442x c0442x = B.g;
            c0399b.g = n;
            return c0442x.c(n, c0399b);
        }
        if (n.d() && ((K) n).c.equals("html")) {
            c0399b.l = B.w;
            return true;
        }
        if (n.e() && ((L) n).c.equals("noframes")) {
            C0436u c0436u = B.d;
            c0399b.g = n;
            return c0436u.c(n, c0399b);
        }
        if (n.c()) {
            return true;
        }
        c0399b.h(this);
        return false;
    }
}

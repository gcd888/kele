package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0440w extends B {
    public C0440w() {
        super("AfterHead", 5);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (B.a(n)) {
            c0399b.t((G) n);
        } else if (n.a()) {
            c0399b.u((H) n);
        } else if (n.b()) {
            c0399b.h(this);
        } else {
            boolean zE = n.e();
            C0436u c0436u = B.d;
            if (zE) {
                L l = (L) n;
                String str = l.c;
                boolean zEquals = str.equals("html");
                C0442x c0442x = B.g;
                if (zEquals) {
                    c0399b.g = n;
                    return c0442x.c(n, c0399b);
                }
                if (str.equals("body")) {
                    c0399b.s(l);
                    c0399b.v = false;
                    c0399b.l = c0442x;
                } else if (str.equals("frameset")) {
                    c0399b.s(l);
                    c0399b.l = B.t;
                } else if (com.github.catvod.spider.merge.e0.b.c(str, A.g)) {
                    c0399b.h(this);
                    com.github.catvod.spider.merge.f0.k kVar = c0399b.o;
                    c0399b.e.add(kVar);
                    c0399b.F(n, c0436u);
                    c0399b.L(kVar);
                } else {
                    if (str.equals("head")) {
                        c0399b.h(this);
                        return false;
                    }
                    c0399b.H("body");
                    c0399b.v = true;
                    c0399b.E(n);
                }
            } else if (n.d()) {
                String str2 = ((K) n).c;
                if (com.github.catvod.spider.merge.e0.b.c(str2, A.d)) {
                    c0399b.H("body");
                    c0399b.v = true;
                    c0399b.E(n);
                } else {
                    if (!str2.equals("template")) {
                        c0399b.h(this);
                        return false;
                    }
                    c0399b.F(n, c0436u);
                }
            } else {
                c0399b.H("body");
                c0399b.v = true;
                c0399b.E(n);
            }
        }
        return true;
    }
}

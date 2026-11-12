package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.p022z.X3;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0436u extends B {
    public C0436u() {
        super("InHead", 3);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (B.a(n)) {
            c0399b.t((G) n);
            return true;
        }
        int iA = X3.a(n.a);
        if (iA == 0) {
            c0399b.h(this);
            return false;
        }
        if (iA == 1) {
            L l = (L) n;
            String str = l.c;
            if (str.equals("html")) {
                return B.g.c(n, c0399b);
            }
            if (com.github.catvod.spider.merge.e0.b.c(str, A.a)) {
                com.github.catvod.spider.merge.f0.k kVarV = c0399b.v(l);
                if (str.equals("base") && kVarV.l("href") && !c0399b.n) {
                    String strA = kVarV.a("href");
                    if (strA.length() != 0) {
                        c0399b.f = strA;
                        c0399b.n = true;
                        com.github.catvod.spider.merge.f0.g gVar = c0399b.d;
                        gVar.getClass();
                        gVar.G(strA);
                    }
                }
            } else if (str.equals("meta")) {
                c0399b.v(l);
            } else {
                boolean zEquals = str.equals("title");
                C0444y c0444y = B.h;
                if (zEquals) {
                    c0399b.c.o(g1.c);
                    c0399b.m = c0399b.l;
                    c0399b.l = c0444y;
                    c0399b.s(l);
                } else if (com.github.catvod.spider.merge.e0.b.c(str, A.b)) {
                    B.b(l, c0399b);
                } else if (str.equals("noscript")) {
                    c0399b.s(l);
                    c0399b.l = B.e;
                } else if (str.equals("script")) {
                    c0399b.c.o(g1.f);
                    c0399b.m = c0399b.l;
                    c0399b.l = c0444y;
                    c0399b.s(l);
                } else {
                    if (str.equals("head")) {
                        c0399b.h(this);
                        return false;
                    }
                    if (!str.equals("template")) {
                        c0399b.G("head");
                        return c0399b.E(n);
                    }
                    c0399b.s(l);
                    c0399b.r.add(null);
                    c0399b.v = false;
                    C0417k c0417k = B.r;
                    c0399b.l = c0417k;
                    c0399b.I(c0417k);
                }
            }
        } else if (iA == 2) {
            String str2 = ((K) n).c;
            if (str2.equals("head")) {
                c0399b.B();
                c0399b.l = B.f;
            } else {
                if (com.github.catvod.spider.merge.e0.b.c(str2, A.c)) {
                    c0399b.G("head");
                    return c0399b.E(n);
                }
                if (!str2.equals("template")) {
                    c0399b.h(this);
                    return false;
                }
                if (c0399b.z(str2)) {
                    c0399b.j(true);
                    if (!str2.equals(c0399b.f().d.b)) {
                        c0399b.h(this);
                    }
                    c0399b.C(str2);
                    c0399b.c();
                    c0399b.D();
                    c0399b.M();
                } else {
                    c0399b.h(this);
                }
            }
        } else {
            if (iA != 3) {
                c0399b.G("head");
                return c0399b.E(n);
            }
            c0399b.u((H) n);
        }
        return true;
    }
}

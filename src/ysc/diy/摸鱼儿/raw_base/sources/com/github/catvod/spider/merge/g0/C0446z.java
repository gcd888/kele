package com.github.catvod.spider.merge.g0;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0446z extends B {
    public C0446z() {
        super("InTable", 8);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (n.a == 5 && com.github.catvod.spider.merge.e0.b.c(c0399b.f().d.b, A.A)) {
            c0399b.t = new ArrayList();
            c0399b.m = c0399b.l;
            c0399b.l = B.j;
            return c0399b.E(n);
        }
        if (n.a()) {
            c0399b.u((H) n);
            return true;
        }
        if (n.b()) {
            c0399b.h(this);
            return false;
        }
        boolean zE = n.e();
        C0436u c0436u = B.d;
        if (!zE) {
            if (!n.d()) {
                if (!n.c()) {
                    d(n, c0399b);
                    return true;
                }
                if (c0399b.g("html")) {
                    c0399b.h(this);
                }
                return true;
            }
            String str = ((K) n).c;
            if (str.equals("table")) {
                if (!c0399b.q(str)) {
                    c0399b.h(this);
                    return false;
                }
                c0399b.C("table");
                c0399b.M();
            } else {
                if (com.github.catvod.spider.merge.e0.b.c(str, A.z)) {
                    c0399b.h(this);
                    return false;
                }
                if (!str.equals("template")) {
                    d(n, c0399b);
                    return true;
                }
                c0399b.F(n, c0436u);
            }
            return true;
        }
        L l = (L) n;
        String str2 = l.c;
        if (str2.equals("caption")) {
            c0399b.e();
            c0399b.r.add(null);
            c0399b.s(l);
            c0399b.l = B.k;
        } else if (str2.equals("colgroup")) {
            c0399b.e();
            c0399b.s(l);
            c0399b.l = B.l;
        } else {
            if (str2.equals("col")) {
                c0399b.e();
                c0399b.H("colgroup");
                return c0399b.E(n);
            }
            if (com.github.catvod.spider.merge.e0.b.c(str2, A.s)) {
                c0399b.e();
                c0399b.s(l);
                c0399b.l = B.m;
            } else {
                if (com.github.catvod.spider.merge.e0.b.c(str2, A.t)) {
                    c0399b.e();
                    c0399b.H("tbody");
                    return c0399b.E(n);
                }
                if (str2.equals("table")) {
                    c0399b.h(this);
                    if (!c0399b.q(str2)) {
                        return false;
                    }
                    c0399b.C(str2);
                    if (c0399b.M()) {
                        return c0399b.E(n);
                    }
                    c0399b.s(l);
                    return true;
                }
                if (com.github.catvod.spider.merge.e0.b.c(str2, A.u)) {
                    c0399b.g = n;
                    return c0436u.c(n, c0399b);
                }
                if (str2.equals("input")) {
                    if (!l.l() || !l.l.d("type").equalsIgnoreCase("hidden")) {
                        d(n, c0399b);
                        return true;
                    }
                    c0399b.v(l);
                } else {
                    if (!str2.equals("form")) {
                        d(n, c0399b);
                        return true;
                    }
                    c0399b.h(this);
                    if (c0399b.p != null || c0399b.z("template")) {
                        return false;
                    }
                    c0399b.w(l, false, false);
                }
            }
        }
        return true;
    }

    public final void d(N n, C0399b c0399b) {
        c0399b.h(this);
        c0399b.w = true;
        c0399b.F(n, B.g);
        c0399b.w = false;
    }
}

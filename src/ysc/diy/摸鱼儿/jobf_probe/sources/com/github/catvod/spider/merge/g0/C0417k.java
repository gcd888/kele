package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.p022z.X3;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0417k extends B {
    public C0417k() {
        super("InTemplate", 17);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        int iA = X3.a(n.a);
        C0442x c0442x = B.g;
        if (iA != 0) {
            C0436u c0436u = B.d;
            if (iA == 1) {
                String str = ((L) n).c;
                if (!com.github.catvod.spider.merge.e0.b.c(str, A.K)) {
                    if (com.github.catvod.spider.merge.e0.b.c(str, A.L)) {
                        c0399b.D();
                        C0446z c0446z = B.i;
                        c0399b.I(c0446z);
                        c0399b.l = c0446z;
                        return c0399b.E(n);
                    }
                    if (str.equals("col")) {
                        c0399b.D();
                        C0405e c0405e = B.l;
                        c0399b.I(c0405e);
                        c0399b.l = c0405e;
                        return c0399b.E(n);
                    }
                    if (str.equals("tr")) {
                        c0399b.D();
                        C0407f c0407f = B.m;
                        c0399b.I(c0407f);
                        c0399b.l = c0407f;
                        return c0399b.E(n);
                    }
                    if (!str.equals("td") && !str.equals("th")) {
                        c0399b.D();
                        c0399b.I(c0442x);
                        c0399b.l = c0442x;
                        return c0399b.E(n);
                    }
                    c0399b.D();
                    C0409g c0409g = B.n;
                    c0399b.I(c0409g);
                    c0399b.l = c0409g;
                    return c0399b.E(n);
                }
                c0399b.F(n, c0436u);
            } else if (iA != 2) {
                if (iA != 3 && iA != 4) {
                    if (iA != 5 || !c0399b.z("template")) {
                        return true;
                    }
                    c0399b.h(this);
                    c0399b.C("template");
                    c0399b.c();
                    c0399b.D();
                    c0399b.M();
                    if (c0399b.l == B.r || c0399b.s.size() >= 12) {
                        return true;
                    }
                    return c0399b.E(n);
                }
                c0399b.F(n, c0442x);
            } else {
                if (!((K) n).c.equals("template")) {
                    c0399b.h(this);
                    return false;
                }
                c0399b.F(n, c0436u);
            }
        } else {
            c0399b.F(n, c0442x);
        }
        return true;
    }
}

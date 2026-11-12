package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.p022z.X3;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0407f extends B {
    public C0407f() {
        super("InTableBody", 12);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        int iA = X3.a(n.a);
        C0446z c0446z = B.i;
        if (iA == 1) {
            L l = (L) n;
            String str = l.c;
            if (!str.equals("tr")) {
                if (com.github.catvod.spider.merge.e0.b.c(str, A.v)) {
                    c0399b.h(this);
                    c0399b.H("tr");
                    return c0399b.E(l);
                }
                if (com.github.catvod.spider.merge.e0.b.c(str, A.B)) {
                    return d(n, c0399b);
                }
                c0399b.g = n;
                return c0446z.c(n, c0399b);
            }
            c0399b.d("tbody", "tfoot", "thead", "template");
            c0399b.s(l);
            c0399b.l = B.n;
        } else {
            if (iA != 2) {
                c0399b.g = n;
                return c0446z.c(n, c0399b);
            }
            String str2 = ((K) n).c;
            if (!com.github.catvod.spider.merge.e0.b.c(str2, A.H)) {
                if (str2.equals("table")) {
                    return d(n, c0399b);
                }
                if (com.github.catvod.spider.merge.e0.b.c(str2, A.C)) {
                    c0399b.h(this);
                    return false;
                }
                c0399b.g = n;
                return c0446z.c(n, c0399b);
            }
            if (!c0399b.q(str2)) {
                c0399b.h(this);
                return false;
            }
            c0399b.d("tbody", "tfoot", "thead", "template");
            c0399b.B();
            c0399b.l = c0446z;
        }
        return true;
    }

    public final boolean d(N n, C0399b c0399b) {
        if (!c0399b.q("tbody") && !c0399b.q("thead") && !c0399b.n("tfoot")) {
            c0399b.h(this);
            return false;
        }
        c0399b.d("tbody", "tfoot", "thead", "template");
        c0399b.G(c0399b.f().d.b);
        return c0399b.E(n);
    }
}

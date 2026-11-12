package com.github.catvod.spider.merge.g0;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0401c extends B {
    public C0401c() {
        super("InTableText", 9);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (n.a == 5) {
            G g = (G) n;
            if (g.b.equals(B.x)) {
                c0399b.h(this);
                return false;
            }
            c0399b.t.add(g.b);
            return true;
        }
        if (c0399b.t.size() > 0) {
            for (String str : c0399b.t) {
                if (com.github.catvod.spider.merge.e0.b.d(str)) {
                    G g2 = new G();
                    g2.b = str;
                    c0399b.t(g2);
                } else {
                    c0399b.h(this);
                    boolean zC = com.github.catvod.spider.merge.e0.b.c(c0399b.f().d.b, A.A);
                    B b = B.g;
                    if (zC) {
                        c0399b.w = true;
                        G g3 = new G();
                        g3.b = str;
                        c0399b.F(g3, b);
                        c0399b.w = false;
                    } else {
                        G g4 = new G();
                        g4.b = str;
                        c0399b.F(g4, b);
                    }
                }
            }
            c0399b.t = new ArrayList();
        }
        c0399b.l = c0399b.m;
        return c0399b.E(n);
    }
}

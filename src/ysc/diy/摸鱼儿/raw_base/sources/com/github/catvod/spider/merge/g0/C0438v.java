package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0438v extends B {
    public C0438v() {
        super("InHeadNoscript", 4);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (n.b()) {
            c0399b.h(this);
        } else {
            if (n.e() && ((L) n).c.equals("html")) {
                C0442x c0442x = B.g;
                c0399b.g = n;
                return c0442x.c(n, c0399b);
            }
            boolean zD = n.d();
            C0436u c0436u = B.d;
            if (!zD || !((K) n).c.equals("noscript")) {
                if (B.a(n) || n.a() || (n.e() && com.github.catvod.spider.merge.e0.b.c(((L) n).c, A.f))) {
                    c0399b.g = n;
                    return c0436u.c(n, c0399b);
                }
                if (n.d() && ((K) n).c.equals("br")) {
                    c0399b.h(this);
                    G g = new G();
                    g.b = n.toString();
                    c0399b.t(g);
                    return true;
                }
                if ((n.e() && com.github.catvod.spider.merge.e0.b.c(((L) n).c, A.I)) || n.d()) {
                    c0399b.h(this);
                    return false;
                }
                c0399b.h(this);
                G g2 = new G();
                g2.b = n.toString();
                c0399b.t(g2);
                return true;
            }
            c0399b.B();
            c0399b.l = c0436u;
        }
        return true;
    }
}

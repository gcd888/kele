package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0409g extends B {
    public C0409g() {
        super("InRow", 13);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        boolean zE = n.e();
        C0446z c0446z = B.i;
        if (zE) {
            L l = (L) n;
            String str = l.c;
            if (com.github.catvod.spider.merge.e0.b.c(str, A.v)) {
                c0399b.d("tr", "template");
                c0399b.s(l);
                c0399b.l = B.o;
                c0399b.r.add(null);
                return true;
            }
            if (!com.github.catvod.spider.merge.e0.b.c(str, A.D)) {
                c0399b.g = n;
                return c0446z.c(n, c0399b);
            }
            if (c0399b.G("tr")) {
                return c0399b.E(n);
            }
            return false;
        }
        if (!n.d()) {
            c0399b.g = n;
            return c0446z.c(n, c0399b);
        }
        String str2 = ((K) n).c;
        boolean zEquals = str2.equals("tr");
        C0407f c0407f = B.m;
        if (zEquals) {
            if (!c0399b.q(str2)) {
                c0399b.h(this);
                return false;
            }
            c0399b.d("tr", "template");
            c0399b.B();
            c0399b.l = c0407f;
            return true;
        }
        if (str2.equals("table")) {
            if (c0399b.G("tr")) {
                return c0399b.E(n);
            }
            return false;
        }
        if (!com.github.catvod.spider.merge.e0.b.c(str2, A.s)) {
            if (com.github.catvod.spider.merge.e0.b.c(str2, A.E)) {
                c0399b.h(this);
                return false;
            }
            c0399b.g = n;
            return c0446z.c(n, c0399b);
        }
        if (!c0399b.q(str2) || !c0399b.q("tr")) {
            c0399b.h(this);
            return false;
        }
        c0399b.d("tr", "template");
        c0399b.B();
        c0399b.l = c0407f;
        return true;
    }
}

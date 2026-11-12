package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0415j extends B {
    public C0415j() {
        super("InSelectInTable", 16);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        boolean zE = n.e();
        String[] strArr = A.G;
        if (zE && com.github.catvod.spider.merge.e0.b.c(((L) n).c, strArr)) {
            c0399b.h(this);
            c0399b.C("select");
            c0399b.M();
            return c0399b.E(n);
        }
        if (n.d()) {
            K k = (K) n;
            if (com.github.catvod.spider.merge.e0.b.c(k.c, strArr)) {
                c0399b.h(this);
                if (!c0399b.q(k.c)) {
                    return false;
                }
                c0399b.C("select");
                c0399b.M();
                return c0399b.E(n);
            }
        }
        C0413i c0413i = B.p;
        c0399b.g = n;
        return c0413i.c(n, c0399b);
    }
}

package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0403d extends B {
    public C0403d() {
        super("InCaption", 10);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (n.d()) {
            K k = (K) n;
            if (k.c.equals("caption")) {
                if (!c0399b.q(k.c)) {
                    c0399b.h(this);
                    return false;
                }
                c0399b.j(false);
                if (!c0399b.g("caption")) {
                    c0399b.h(this);
                }
                c0399b.C("caption");
                c0399b.c();
                c0399b.l = B.i;
                return true;
            }
        }
        if ((n.e() && com.github.catvod.spider.merge.e0.b.c(((L) n).c, A.y)) || (n.d() && ((K) n).c.equals("table"))) {
            c0399b.h(this);
            if (c0399b.G("caption")) {
                return c0399b.E(n);
            }
            return true;
        }
        if (n.d() && com.github.catvod.spider.merge.e0.b.c(((K) n).c, A.J)) {
            c0399b.h(this);
            return false;
        }
        C0442x c0442x = B.g;
        c0399b.g = n;
        return c0442x.c(n, c0399b);
    }
}

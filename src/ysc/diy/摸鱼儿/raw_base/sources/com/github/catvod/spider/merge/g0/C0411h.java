package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0411h extends B {
    public C0411h() {
        super("InCell", 14);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        boolean zD = n.d();
        C0442x c0442x = B.g;
        if (!zD) {
            if (!n.e() || !com.github.catvod.spider.merge.e0.b.c(((L) n).c, A.y)) {
                c0399b.g = n;
                return c0442x.c(n, c0399b);
            }
            if (!c0399b.q("td") && !c0399b.q("th")) {
                c0399b.h(this);
                return false;
            }
            if (c0399b.q("td")) {
                c0399b.G("td");
            } else {
                c0399b.G("th");
            }
            return c0399b.E(n);
        }
        String str = ((K) n).c;
        if (com.github.catvod.spider.merge.e0.b.c(str, A.v)) {
            boolean zQ = c0399b.q(str);
            C0409g c0409g = B.n;
            if (!zQ) {
                c0399b.h(this);
                c0399b.l = c0409g;
                return false;
            }
            c0399b.j(false);
            if (!c0399b.g(str)) {
                c0399b.h(this);
            }
            c0399b.C(str);
            c0399b.c();
            c0399b.l = c0409g;
            return true;
        }
        if (com.github.catvod.spider.merge.e0.b.c(str, A.w)) {
            c0399b.h(this);
            return false;
        }
        if (!com.github.catvod.spider.merge.e0.b.c(str, A.x)) {
            c0399b.g = n;
            return c0442x.c(n, c0399b);
        }
        if (!c0399b.q(str)) {
            c0399b.h(this);
            return false;
        }
        if (c0399b.q("td")) {
            c0399b.G("td");
        } else {
            c0399b.G("th");
        }
        return c0399b.E(n);
    }
}

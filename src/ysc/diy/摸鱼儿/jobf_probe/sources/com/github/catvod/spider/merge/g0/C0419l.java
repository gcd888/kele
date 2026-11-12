package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0419l extends B {
    public C0419l() {
        super("AfterBody", 18);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (B.a(n)) {
            c0399b.t((G) n);
            return true;
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
        C0442x c0442x = B.g;
        if (zE && ((L) n).c.equals("html")) {
            c0399b.g = n;
            return c0442x.c(n, c0399b);
        }
        if (n.d() && ((K) n).c.equals("html")) {
            if (c0399b.x) {
                c0399b.h(this);
                return false;
            }
            if (c0399b.z("html")) {
                c0399b.C("html");
            }
            c0399b.l = B.v;
            return true;
        }
        if (n.c()) {
            return true;
        }
        c0399b.h(this);
        if (!c0399b.z("body")) {
            c0399b.e.add(c0399b.d.W());
        }
        c0399b.l = c0442x;
        return c0399b.E(n);
    }
}

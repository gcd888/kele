package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0427p extends B {
    public C0427p() {
        super("AfterAfterBody", 21);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (n.a()) {
            c0399b.u((H) n);
            return true;
        }
        boolean zB = n.b();
        C0442x c0442x = B.g;
        if (zB || (n.e() && ((L) n).c.equals("html"))) {
            c0399b.g = n;
            return c0442x.c(n, c0399b);
        }
        if (B.a(n)) {
            c0399b.t((G) n);
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

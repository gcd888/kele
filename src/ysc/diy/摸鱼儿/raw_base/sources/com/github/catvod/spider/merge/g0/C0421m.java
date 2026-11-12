package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0421m extends B {
    public C0421m() {
        super("Initial", 0);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (B.a(n)) {
            return true;
        }
        if (n.a()) {
            c0399b.u((H) n);
        } else {
            boolean zB = n.b();
            C0432s c0432s = B.b;
            if (!zB) {
                c0399b.l = c0432s;
                return c0399b.E(n);
            }
            I i = (I) n;
            D d = c0399b.h;
            String string = i.b.toString();
            d.getClass();
            String strTrim = string.trim();
            if (!d.a) {
                strTrim = com.github.catvod.spider.merge.l0.i.a(strTrim);
            }
            com.github.catvod.spider.merge.f0.h hVar = new com.github.catvod.spider.merge.f0.h(strTrim, i.d.toString(), i.e.toString());
            String str = i.c;
            if (str != null) {
                hVar.z("pubSysKey", str);
            }
            c0399b.d.z(hVar);
            if (i.f) {
                c0399b.d.l = 2;
            }
            c0399b.l = c0432s;
        }
        return true;
    }
}

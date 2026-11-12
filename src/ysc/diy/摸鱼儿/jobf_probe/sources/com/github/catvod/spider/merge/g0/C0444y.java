package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0444y extends B {
    public C0444y() {
        super("Text", 7);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (n.a == 5) {
            c0399b.t((G) n);
            return true;
        }
        if (n.c()) {
            c0399b.h(this);
            c0399b.B();
            c0399b.l = c0399b.m;
            return c0399b.E(n);
        }
        if (!n.d()) {
            return true;
        }
        c0399b.B();
        c0399b.l = c0399b.m;
        return true;
    }
}

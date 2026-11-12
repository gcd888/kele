package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C implements InterfaceC0338x {
    public final int a;
    public final InterfaceC0338x b;

    public C(int i, InterfaceC0338x interfaceC0338x) {
        this.a = i;
        this.b = interfaceC0338x;
    }

    @Override // com.github.catvod.spider.merge.T.InterfaceC0338x
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.T.InterfaceC0338x
    public final void b(com.github.catvod.spider.merge.S.j jVar) {
        this.b.b(jVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c = (C) obj;
        return this.a == c.a && this.b.equals(c.b);
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.c(com.github.catvod.spider.merge.l0.e.b(0, this.a), this.b), 2);
    }
}

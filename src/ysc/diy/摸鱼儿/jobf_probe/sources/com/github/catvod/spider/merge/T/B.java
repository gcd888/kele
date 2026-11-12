package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class B implements InterfaceC0338x {
    public final int a;
    public final int b;

    public B(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.T.InterfaceC0338x
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.T.InterfaceC0338x
    public final void b(com.github.catvod.spider.merge.S.j jVar) {
        jVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b = (B) obj;
        return this.a == b.a && this.b == b.b;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.b(com.github.catvod.spider.merge.l0.e.b(com.github.catvod.spider.merge.l0.e.b(0, 1), this.a), this.b), 3);
    }
}

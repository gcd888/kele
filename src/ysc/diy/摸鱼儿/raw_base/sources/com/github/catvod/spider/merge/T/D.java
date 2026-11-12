package com.github.catvod.spider.merge.T;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class D implements InterfaceC0338x {
    public final int a;

    public D(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.T.InterfaceC0338x
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.T.InterfaceC0338x
    public final void b(com.github.catvod.spider.merge.S.j jVar) {
        jVar.o = this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D) {
            return this.a == ((D) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.b(com.github.catvod.spider.merge.l0.e.b(0, 2), this.a), 2);
    }

    public final String toString() {
        return String.format("mode(%d)", Integer.valueOf(this.a));
    }
}

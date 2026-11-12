package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class D {
    public static final D c = new D(false, false);
    public static final D d = new D(true, true);
    public final boolean a;
    public final boolean b;

    public D(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final void a(com.github.catvod.spider.merge.f0.b bVar) {
        if (bVar == null || this.b) {
            return;
        }
        for (int i = 0; i < bVar.a; i++) {
            String[] strArr = bVar.b;
            strArr[i] = com.github.catvod.spider.merge.l0.i.a(strArr[i]);
        }
    }
}

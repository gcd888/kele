package com.github.catvod.spider.merge.A;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0274l1 {
    public final String a = AbstractC0280n1.a;
    public final int b = AbstractC0280n1.d;
    public final int c = AbstractC0280n1.e;
    public final long d = AbstractC0280n1.h;
    public final long e = AbstractC0280n1.i;
    public final boolean f;
    public final long g;

    public C0274l1(boolean z) {
        this.f = z;
        com.github.catvod.spider.merge.p006g.a.a().getClass();
        this.g = com.github.catvod.spider.merge.p006g.a.o.get();
    }

    public final boolean a() {
        boolean z;
        synchronized (AbstractC0280n1.class) {
            try {
                z = this.a.equals(AbstractC0280n1.a) && this.b == AbstractC0280n1.d && this.c == AbstractC0280n1.e && this.d == AbstractC0280n1.h && this.e == AbstractC0280n1.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean b() {
        com.github.catvod.spider.merge.p006g.a aVarA = com.github.catvod.spider.merge.p006g.a.a();
        return a() && aVarA.k() && (!this.f || (aVarA.j() && this.g == com.github.catvod.spider.merge.p006g.a.o.get() && !C0299u0.x().k));
    }
}

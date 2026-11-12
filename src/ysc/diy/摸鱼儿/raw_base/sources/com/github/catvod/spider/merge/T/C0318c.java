package com.github.catvod.spider.merge.T;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0318c extends com.github.catvod.spider.merge.l0.d {
    public static final C0318c a = new C0318c();

    @Override // com.github.catvod.spider.merge.l0.d
    public final boolean a(Object obj, Object obj2) {
        C0317b c0317b = (C0317b) obj;
        C0317b c0317b2 = (C0317b) obj2;
        if (c0317b == c0317b2) {
            return true;
        }
        return c0317b != null && c0317b2 != null && c0317b.a.b == c0317b2.a.b && c0317b.b == c0317b2.b && c0317b.e.equals(c0317b2.e);
    }

    @Override // com.github.catvod.spider.merge.l0.d
    public final int b(Object obj) {
        C0317b c0317b = (C0317b) obj;
        return c0317b.e.hashCode() + ((((217 + c0317b.a.b) * 31) + c0317b.b) * 31);
    }
}

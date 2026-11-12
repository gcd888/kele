package com.github.catvod.spider.merge.p022z;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class RunnableC0510h1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C0515i1 c;

    public RunnableC0510h1(C0515i1 c0515i1, String str, String str2) {
        this.c = c0515i1;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.a;
        boolean zEquals = "name".equals(str);
        String str2 = this.b;
        C0515i1 c0515i1 = this.c;
        if (zEquals) {
            c0515i1.a.setText(str2);
            return;
        }
        if ("server".equals(str)) {
            c0515i1.b.setText(str2);
        } else if ("user".equals(str)) {
            c0515i1.c.setText(str2);
        } else if ("pass".equals(str)) {
            c0515i1.d.setText(str2);
        }
    }
}

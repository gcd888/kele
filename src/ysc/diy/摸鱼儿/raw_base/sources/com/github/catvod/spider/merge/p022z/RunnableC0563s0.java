package com.github.catvod.spider.merge.p022z;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class RunnableC0563s0 implements Runnable {
    public final /* synthetic */ int a = 92;
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ String c = "传输中...";
    public final /* synthetic */ long d = 120;
    public final /* synthetic */ C0568t0 e;

    public RunnableC0563s0(C0568t0 c0568t0) {
        this.e = c0568t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e.h) {
            return;
        }
        this.e.a(Math.min(this.a, Math.max(1, this.b) + this.e.i), this.c);
        C0568t0 c0568t0 = this.e;
        if (c0568t0.i < this.a) {
            c0568t0.b.postDelayed(this, Math.max(16L, this.d));
        }
    }
}

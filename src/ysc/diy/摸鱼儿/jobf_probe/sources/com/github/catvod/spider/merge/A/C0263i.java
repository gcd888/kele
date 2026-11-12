package com.github.catvod.spider.merge.A;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0263i {
    public final long[] a;
    public int b;
    public boolean c;

    public C0263i(long[] jArr) {
        if (jArr.length == 0) {
            throw new IllegalArgumentException("failureDelaysMillis");
        }
        this.a = (long[]) jArr.clone();
    }

    public final synchronized boolean a() {
        return this.c;
    }

    public final synchronized long b() {
        int iMin;
        try {
            iMin = Math.min(this.b, this.a.length - 1);
            int i = this.b;
            if (i < Integer.MAX_VALUE) {
                this.b = i + 1;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a[iMin];
    }

    public final synchronized void c() {
        this.b = 0;
    }

    public final synchronized boolean d() {
        if (this.c) {
            return false;
        }
        this.c = true;
        return true;
    }
}

package com.github.catvod.spider.merge.A;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class CallableC0255f0 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ RunnableC0258g0 c;

    public CallableC0255f0(RunnableC0258g0 runnableC0258g0, long j, long j2) {
        this.c = runnableC0258g0;
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[Catch: Exception -> 0x0046, TRY_LEAVE, TryCatch #1 {Exception -> 0x0046, blocks: (B:3:0x0001, B:4:0x0011, B:6:0x0015, B:11:0x0020, B:13:0x0024, B:14:0x002b, B:17:0x0034), top: B:23:0x0001, inners: #0 }] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            C0267j0 c0267j0 = this.c.i;
            long j = this.a;
            long j2 = ((long) c0267j0.c) * ((long) (c0267j0.b + 32));
            while (c0267j0.j && j - c0267j0.i >= j2) {
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    if (this.c.i.j) {
                        return (byte[]) this.c.i.b(this.a, this.b, 3).b;
                    }
                    return null;
                }
            }
            if (this.c.i.j) {
                return null;
            }
            return (byte[]) this.c.i.b(this.a, this.b, 3).b;
        } catch (Exception unused2) {
            return null;
        }
    }
}

package com.github.catvod.spider.merge.A;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class RunnableC0258g0 implements Runnable {
    public final /* synthetic */ PipedOutputStream a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;
    public final /* synthetic */ ExecutorService h;
    public final /* synthetic */ C0267j0 i;

    public RunnableC0258g0(C0267j0 c0267j0, PipedOutputStream pipedOutputStream, byte[] bArr, long j, long j2, int i, int i2, ArrayList arrayList, ExecutorService executorService) {
        this.i = c0267j0;
        this.a = pipedOutputStream;
        this.b = bArr;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = i2;
        this.g = arrayList;
        this.h = executorService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.write(this.b);
            this.a.flush();
            long j = this.c;
            while (j < this.d) {
                this.g.clear();
                for (int i = 0; i < this.f; i++) {
                    int i2 = this.e;
                    long j2 = (((long) i) * ((long) i2)) + j;
                    long j3 = ((long) i2) + j2;
                    long j4 = this.d;
                    if (j2 >= j4) {
                        break;
                    }
                    this.g.add(this.h.submit(new CallableC0255f0(this, j2, j3 > j4 ? j4 : j3)));
                }
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    byte[] bArr = (byte[]) ((Future) it.next()).get();
                    if (bArr != null && bArr.length > 0) {
                        this.a.write(bArr);
                        this.a.flush();
                    }
                }
                j += ((long) this.e) * ((long) this.f);
            }
            this.i.j = false;
            try {
                this.a.close();
            } catch (IOException e) {
                e = e;
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this.i.j = false;
            try {
                this.a.close();
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
            }
        } finally {
            this.i.j = false;
            try {
                this.a.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            this.h.shutdownNow();
        }
    }
}

package com.github.catvod.spider.merge.A;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0 {
    public final C0239a a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final ScheduledExecutorService h;
    public final AtomicBoolean i;
    public final AtomicInteger j;
    public final AtomicBoolean k;
    public volatile long l;
    public long m;
    public long n;
    public boolean o;

    public C0(long j, String str, String str2, String str3, String str4, String str5) {
        C0239a c0239a = AbstractC0302v0.j;
        this.i = new AtomicBoolean(false);
        this.j = new AtomicInteger(0);
        this.k = new AtomicBoolean(false);
        this.m = -1L;
        this.n = -1L;
        this.a = c0239a;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = Math.max(0L, j);
        this.f = str4;
        this.g = str5;
        this.h = Executors.newSingleThreadScheduledExecutor(new B0());
    }

    public final boolean a(C0308x0 c0308x0) {
        return c() && this.j.get() == c0308x0.a && !c0308x0.c.get();
    }

    public final void b() {
        if (this.i.compareAndSet(false, true)) {
            this.j.incrementAndGet();
            this.h.shutdownNow();
            AbstractC0302v0.u(this.a, this.f, this.e);
        }
    }

    public final boolean c() {
        return !this.i.get() && AbstractC0302v0.i == this;
    }

    public final void d(C0308x0 c0308x0, String str, Throwable th, long j) {
        if (a(c0308x0) && c0308x0.c.compareAndSet(false, true)) {
            if (this.o) {
                f(c0308x0.a, str, th, j, 0);
            } else {
                AbstractC0302v0.H(str, th, j, this.e, true, true);
            }
        }
    }

    public final boolean e(boolean z) {
        if (!c()) {
            return false;
        }
        try {
            if (!z) {
                com.github.catvod.spider.merge.p000a.I iP = com.github.catvod.spider.merge.p000a.I.p();
                String str = this.g;
                iP.getClass();
                if (str != null && !str.isEmpty()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - iP.p < 1500) {
                        return false;
                    }
                    boolean zD = str.isEmpty() ? false : com.github.catvod.spider.merge.p000a.I.D(AbstractC0280n1.a, str, AbstractC0280n1.d(), true, false, str);
                    if (zD) {
                        iP.p = jCurrentTimeMillis;
                    }
                    return zD;
                }
                return false;
            }
            C0304w c0304wX = C0304w.x();
            String str2 = AbstractC0280n1.a;
            String str3 = this.g;
            c0304wX.getClass();
            Boolean boolH = c0304wX.H(str2, str3, true, AbstractC0280n1.d(), false);
            if (boolH != null) {
                return boolH.booleanValue();
            }
            com.github.catvod.spider.merge.p000a.I iP2 = com.github.catvod.spider.merge.p000a.I.p();
            String str4 = this.g;
            iP2.getClass();
            if (str4 != null && !str4.isEmpty()) {
                com.github.catvod.spider.merge.p000a.I.D(AbstractC0280n1.a, str4, AbstractC0280n1.d(), true, false, str4);
            }
            return false;
        } catch (Throwable th) {
            AbstractC0302v0.H("push_failed", th, 0L, this.e, true, true);
            return false;
        }
    }

    public final void f(final int i, final String str, final Throwable th, final long j, final int i2) {
        Throwable th2;
        boolean z;
        if (c()) {
            AtomicInteger atomicInteger = this.j;
            if (atomicInteger.get() == i) {
                boolean z2 = false;
                try {
                    boolean zE = e(true);
                    if (zE) {
                        try {
                            if (c() && atomicInteger.get() == i) {
                                this.o = false;
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            z2 = zE;
                            AbstractC0302v0.H("tail_refresh_failed", th2, j, this.e, true, true);
                            z = z2;
                        }
                    }
                    z = zE;
                } catch (Throwable th4) {
                    th2 = th4;
                }
                if (!z && i2 < 4) {
                    try {
                        this.h.schedule(new Runnable() { // from class: com.github.catvod.spider.merge.A.A0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.f(i, str, th, j, i2 + 1);
                            }
                        }, (((long) i2) + 1) * 500, TimeUnit.MILLISECONDS);
                        return;
                    } catch (Throwable th5) {
                        AbstractC0302v0.H("tail_refresh_schedule_failed", th5, j, this.e, true, true);
                    }
                }
                AbstractC0302v0.H(str.concat(z ? "_refresh_accepted" : "_refresh_unconfirmed"), th, j, this.e, true, true);
            }
        }
    }

    public final void g(final C0308x0 c0308x0, final long j, final int i, final String str, final int i2, final boolean z, long j2) {
        if (a(c0308x0)) {
            try {
                this.h.schedule(new Runnable() { // from class: com.github.catvod.spider.merge.A.z0
                    /* JADX WARN: Code duplicated, block: B:17:0x0064 A[Catch: all -> 0x0106, TryCatch #2 {all -> 0x0106, blocks: (B:6:0x0017, B:9:0x0045, B:15:0x005c, B:17:0x0064, B:18:0x0069, B:20:0x0071, B:21:0x0076, B:26:0x0086, B:27:0x0091, B:24:0x0080), top: B:74:0x0017 }] */
                    /* JADX WARN: Code duplicated, block: B:18:0x0069 A[Catch: all -> 0x0106, TryCatch #2 {all -> 0x0106, blocks: (B:6:0x0017, B:9:0x0045, B:15:0x005c, B:17:0x0064, B:18:0x0069, B:20:0x0071, B:21:0x0076, B:26:0x0086, B:27:0x0091, B:24:0x0080), top: B:74:0x0017 }] */
                    /* JADX WARN: Code duplicated, block: B:20:0x0071 A[Catch: all -> 0x0106, TryCatch #2 {all -> 0x0106, blocks: (B:6:0x0017, B:9:0x0045, B:15:0x005c, B:17:0x0064, B:18:0x0069, B:20:0x0071, B:21:0x0076, B:26:0x0086, B:27:0x0091, B:24:0x0080), top: B:74:0x0017 }] */
                    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[Catch: all -> 0x0106, TryCatch #2 {all -> 0x0106, blocks: (B:6:0x0017, B:9:0x0045, B:15:0x005c, B:17:0x0064, B:18:0x0069, B:20:0x0071, B:21:0x0076, B:26:0x0086, B:27:0x0091, B:24:0x0080), top: B:74:0x0017 }] */
                    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
                    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[Catch: all -> 0x0106, TryCatch #2 {all -> 0x0106, blocks: (B:6:0x0017, B:9:0x0045, B:15:0x005c, B:17:0x0064, B:18:0x0069, B:20:0x0071, B:21:0x0076, B:26:0x0086, B:27:0x0091, B:24:0x0080), top: B:74:0x0017 }] */
                    /* JADX WARN: Code duplicated, block: B:26:0x0086 A[Catch: all -> 0x0106, TryCatch #2 {all -> 0x0106, blocks: (B:6:0x0017, B:9:0x0045, B:15:0x005c, B:17:0x0064, B:18:0x0069, B:20:0x0071, B:21:0x0076, B:26:0x0086, B:27:0x0091, B:24:0x0080), top: B:74:0x0017 }] */
                    /* JADX WARN: Code duplicated, block: B:27:0x0091 A[Catch: all -> 0x0106, TRY_LEAVE, TryCatch #2 {all -> 0x0106, blocks: (B:6:0x0017, B:9:0x0045, B:15:0x005c, B:17:0x0064, B:18:0x0069, B:20:0x0071, B:21:0x0076, B:26:0x0086, B:27:0x0091, B:24:0x0080), top: B:74:0x0017 }] */
                    /* JADX WARN: Code duplicated, block: B:38:0x00c8 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #4 {all -> 0x00ed, blocks: (B:36:0x00bb, B:38:0x00c8), top: B:78:0x00bb }] */
                    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:43:0x00d1 A[Catch: all -> 0x00ea, TryCatch #3 {all -> 0x00ea, blocks: (B:40:0x00cc, B:49:0x00f3, B:54:0x00fe, B:43:0x00d1), top: B:76:0x00cc }] */
                    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
                    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
                    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
                    /* JADX WARN: Code duplicated, block: B:61:0x0113  */
                    /* JADX WARN: Code duplicated, block: B:63:0x011a A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:64:0x011c  */
                    /* JADX WARN: Code duplicated, block: B:66:0x0121  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
                    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z2;
                        C0 c0;
                        C0308x0 c0308x1;
                        Throwable th;
                        int i3;
                        long j3;
                        JSONArray jSONArrayOptJSONArray;
                        JSONArray jSONArrayOptJSONArray2;
                        JSONObject jSONObjectOptJSONObject;
                        JSONArray jSONArrayOptJSONArray3;
                        int length;
                        C0311y0 c0311y0I0;
                        String str2;
                        int i4;
                        long j4 = j;
                        int i5 = i;
                        String str3 = str;
                        boolean z3 = z;
                        C0 c1 = this.a;
                        C0308x0 c0308x2 = c0308x0;
                        if (!c1.a(c0308x2)) {
                            return;
                        }
                        try {
                            JSONObject jSONObjectI = AbstractC0302v0.i(c1.c, c1.d, c1.e, j4, str3);
                            C0239a c0239a = c1.a;
                            String str4 = c1.b;
                            String str5 = c1.f;
                            c0239a.getClass();
                            JSONObject jSONObjectP = C0299u0.x().P(str4, 8, jSONObjectI, str5, 0L);
                            if (c1.a(c0308x2)) {
                                if (!jSONObjectP.optBoolean("local_changed", false)) {
                                    jSONArrayOptJSONArray = jSONObjectP.optJSONArray("comments");
                                    if (jSONArrayOptJSONArray != null) {
                                        length = jSONArrayOptJSONArray.length();
                                    } else {
                                        jSONArrayOptJSONArray2 = jSONObjectP.optJSONArray("data_list");
                                        if (jSONArrayOptJSONArray2 != null) {
                                            length = jSONArrayOptJSONArray2.length();
                                        } else {
                                            jSONObjectOptJSONObject = jSONObjectP.optJSONObject("data");
                                            if (jSONObjectOptJSONObject == null) {
                                                jSONArrayOptJSONArray3 = null;
                                            } else {
                                                jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("data_list");
                                            }
                                            if (jSONArrayOptJSONArray3 == null) {
                                                length = Math.max(0, jSONObjectP.optInt("comment_count", 0));
                                            } else {
                                                length = jSONArrayOptJSONArray3.length();
                                            }
                                        }
                                    }
                                    if (length == 0) {
                                    }
                                    z2 = z3;
                                    c0 = c1;
                                    c0311y0I0 = AbstractC0302v0.I0(j4, c0.e, i5, str3, jSONObjectP);
                                    if (!c0311y0I0.a) {
                                        i4 = c0311y0I0.c;
                                        c0308x1 = c0308x2;
                                        if (i4 > c0308x1.b) {
                                            c0.g(c0308x1, c0311y0I0.b, i4, c0311y0I0.d, 0, false, 150L);
                                        }
                                        return;
                                    }
                                    c0308x1 = c0308x2;
                                    if (c0.o) {
                                        str2 = "chain_complete";
                                    } else {
                                        str2 = "chain_empty";
                                    }
                                    c0.d(c0308x1, str2, null, j4);
                                    return;
                                }
                                try {
                                    c1.o = true;
                                    c1.e(false);
                                    jSONArrayOptJSONArray = jSONObjectP.optJSONArray("comments");
                                    if (jSONArrayOptJSONArray != null) {
                                        length = jSONArrayOptJSONArray.length();
                                    } else {
                                        jSONArrayOptJSONArray2 = jSONObjectP.optJSONArray("data_list");
                                        if (jSONArrayOptJSONArray2 != null) {
                                            length = jSONArrayOptJSONArray2.length();
                                        } else {
                                            jSONObjectOptJSONObject = jSONObjectP.optJSONObject("data");
                                            if (jSONObjectOptJSONObject == null) {
                                                jSONArrayOptJSONArray3 = null;
                                            } else {
                                                jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("data_list");
                                            }
                                            if (jSONArrayOptJSONArray3 == null) {
                                                length = Math.max(0, jSONObjectP.optInt("comment_count", 0));
                                            } else {
                                                length = jSONArrayOptJSONArray3.length();
                                            }
                                        }
                                    }
                                    if (length == 0 || z3) {
                                        z2 = z3;
                                        c0 = c1;
                                        try {
                                            c0311y0I0 = AbstractC0302v0.I0(j4, c0.e, i5, str3, jSONObjectP);
                                            if (!c0311y0I0.a) {
                                                i4 = c0311y0I0.c;
                                                c0308x1 = c0308x2;
                                                try {
                                                    if (i4 > c0308x1.b) {
                                                        c0.g(c0308x1, c0311y0I0.b, i4, c0311y0I0.d, 0, false, 150L);
                                                    }
                                                    return;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    th = th;
                                                    if (c0.a(c0308x1)) {
                                                        i3 = i2;
                                                        if (i3 < 2) {
                                                            c0.d(c0308x1, "page_failed", th, j4);
                                                            return;
                                                        }
                                                        if (i3 == 0) {
                                                            j3 = 250;
                                                        } else {
                                                            j3 = 750;
                                                        }
                                                        long j5 = j3;
                                                        AbstractC0302v0.H("page_retry", th, j4, c0.e, true, true);
                                                        c0.g(c0308x1, j4, i5, str3, i3 + 1, z2, j5);
                                                    }
                                                    return;
                                                }
                                            }
                                            c0308x1 = c0308x2;
                                            if (c0.o) {
                                                str2 = "chain_complete";
                                            } else {
                                                str2 = "chain_empty";
                                            }
                                            c0.d(c0308x1, str2, null, j4);
                                            return;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            c0308x1 = c0308x2;
                                        }
                                    } else {
                                        z2 = z3;
                                        c0 = c1;
                                        try {
                                            c1.g(c0308x2, j4, i5, str3, 0, true, 350L);
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            c0308x1 = c0308x2;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    z2 = z3;
                                    c0 = c1;
                                    c0308x1 = c0308x2;
                                }
                                if (c0.a(c0308x1)) {
                                    return;
                                }
                                i3 = i2;
                                if (i3 < 2) {
                                    c0.d(c0308x1, "page_failed", th, j4);
                                    return;
                                }
                                if (i3 == 0) {
                                    j3 = 250;
                                } else {
                                    j3 = 750;
                                }
                                long j6 = j3;
                                AbstractC0302v0.H("page_retry", th, j4, c0.e, true, true);
                                c0.g(c0308x1, j4, i5, str3, i3 + 1, z2, j6);
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            z2 = z3;
                            c0 = c1;
                            c0308x1 = c0308x2;
                        }
                    }
                }, Math.max(0L, j2), TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                d(c0308x0, "schedule_failed", th, j);
            }
        }
    }

    public final void h() {
        if (c()) {
            try {
                this.h.schedule(new D1(3, this), 2000L, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
    }

    public final void i(long j) {
        if (c()) {
            long jMin = ((this.e > 0 ? Math.min(Math.max(0L, j), this.e - 1) : Math.max(0L, j)) / 30000) * 30000;
            this.l = jMin;
            int iIncrementAndGet = this.j.incrementAndGet();
            long j2 = this.e;
            g(new C0308x0(iIncrementAndGet, j2 <= 0 ? 6 : (int) Math.max(1L, Math.min(120L, (Math.max(1L, j2 - Math.max(0L, jMin)) + 29999) / 30000))), jMin, 1, "", 0, false, 0L);
        }
    }
}

package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.A.C0261h0;
import com.github.catvod.spider.merge.S.u;
import com.github.catvod.spider.merge.T.C0320e;
import com.github.catvod.spider.merge.T.g0;
import com.github.catvod.spider.merge.T.r;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class b {
    public final HashMap a = new HashMap();
    public volatile d b;
    public final int c;
    public final r d;
    public final boolean e;

    public b(r rVar, int i) {
        this.d = rVar;
        this.c = i;
        boolean z = false;
        if ((rVar instanceof g0) && ((g0) rVar).j) {
            d dVar = new d(new C0320e(true));
            dVar.c = new d[0];
            dVar.d = false;
            dVar.g = false;
            this.b = dVar;
            z = true;
        }
        this.e = z;
    }

    public final void a(int i, d dVar) {
        if (!this.e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.b) {
            try {
                if (i >= this.b.c.length) {
                    this.b.c = (d[]) Arrays.copyOf(this.b.c, i + 1);
                }
                this.b.c[i] = dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.b == null ? "" : new C0261h0(this, u.e, 2).toString();
    }
}

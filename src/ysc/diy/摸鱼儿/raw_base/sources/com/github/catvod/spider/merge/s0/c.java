package com.github.catvod.spider.merge.s0;

import com.github.catvod.spider.merge.A.C0246c0;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class c implements com.github.catvod.spider.merge.q0.a {
    public final String a;
    public volatile com.github.catvod.spider.merge.q0.a b;
    public Boolean c;
    public Method d;
    public C0246c0 e;
    public final Queue f;
    public final boolean g;

    public c(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.a = str;
        this.f = linkedBlockingQueue;
        this.g = z;
    }

    @Override // com.github.catvod.spider.merge.q0.a
    public final void a(String str, Exception exc) {
        com.github.catvod.spider.merge.q0.a aVar;
        if (this.b != null) {
            aVar = this.b;
        } else if (this.g) {
            aVar = a.a;
        } else {
            if (this.e == null) {
                this.e = new C0246c0(this, (LinkedBlockingQueue) this.f);
            }
            aVar = this.e;
        }
        aVar.a(str, exc);
    }

    public final boolean b() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", com.github.catvod.spider.merge.r0.a.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.a.equals(((c) obj).a);
    }

    @Override // com.github.catvod.spider.merge.q0.a
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

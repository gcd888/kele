package com.github.catvod.spider.merge.p003d;

import com.github.catvod.spider.merge.A.C0297t1;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class c {
    public static volatile c d;
    public static final Object e = new Object();

    @SerializedName("user")
    private o a;

    @SerializedName("oauth")
    private h b;

    @SerializedName("drive")
    private f c;

    public static c d() {
        if (d != null) {
            return d;
        }
        synchronized (e) {
            if (d != null) {
                return d;
            }
            try {
                String strH = C0297t1.h("aliyun");
                if (!strH.isEmpty()) {
                    c cVar = (c) new Gson().fromJson(strH, c.class);
                    if (cVar == null) {
                        cVar = new c();
                    }
                    d = cVar;
                    return d;
                }
            } catch (Exception unused) {
            }
            d = new c();
            return d;
        }
    }

    public final f a() {
        if (this.c == null) {
            this.c = new f();
        }
        return this.c;
    }

    public final h b() {
        if (this.b == null) {
            this.b = new h();
        }
        return this.b;
    }

    public final o c() {
        if (this.a == null) {
            this.a = new o();
        }
        return this.a;
    }

    public final void e(f fVar) {
        synchronized (e) {
            this.c = fVar;
            C0297t1.j("aliyun", toString());
        }
    }

    public final void f(h hVar) {
        synchronized (e) {
            this.b = hVar;
            C0297t1.j("aliyun", toString());
        }
    }

    public final void g(o oVar) {
        synchronized (e) {
            this.a = oVar;
            C0297t1.j("aliyun", toString());
        }
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}

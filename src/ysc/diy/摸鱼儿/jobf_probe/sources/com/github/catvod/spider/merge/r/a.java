package com.github.catvod.spider.merge.r;

import com.github.catvod.spider.merge.A.C0297t1;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class a {
    public static volatile a b;
    public static final Object c = new Object();

    @SerializedName("user")
    private b a;

    public static a c() {
        b bVar;
        if (b != null) {
            return b;
        }
        synchronized (c) {
            if (b != null) {
                return b;
            }
            try {
                String strH = C0297t1.h("xunlei");
                if (!strH.isEmpty()) {
                    a aVar = (a) new Gson().fromJson(strH, a.class);
                    if (aVar == null) {
                        aVar = new a();
                    }
                    if (aVar.b().a().isEmpty() && (bVar = (b) new Gson().fromJson(strH, b.class)) != null && !bVar.a().isEmpty()) {
                        aVar = new a();
                        aVar.a = bVar;
                        C0297t1.j("xunlei", new Gson().toJson(aVar));
                    }
                    b = aVar;
                    return b;
                }
            } catch (Exception unused) {
            }
            b = new a();
            return b;
        }
    }

    public static void d() {
        synchronized (c) {
            b = null;
        }
    }

    public final void a() {
        synchronized (c) {
            this.a = new b();
            C0297t1.j("xunlei", "");
        }
        d();
    }

    public final b b() {
        b bVar = this.a;
        return bVar == null ? new b() : bVar;
    }

    public final void e(b bVar) {
        synchronized (c) {
            this.a = bVar;
            C0297t1.j("xunlei", new Gson().toJson(this));
        }
    }
}

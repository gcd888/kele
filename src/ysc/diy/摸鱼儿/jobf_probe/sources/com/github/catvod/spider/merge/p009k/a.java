package com.github.catvod.spider.merge.p009k;

import com.github.catvod.spider.merge.A.C0297t1;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class a {
    public static volatile a c;
    public static final Object d = new Object();

    @SerializedName("user")
    private d a;

    @SerializedName("saveFileIds")
    private Map<String, String> b;

    public static a e() {
        if (c != null) {
            return c;
        }
        synchronized (d) {
            if (c != null) {
                return c;
            }
            try {
                String strH = C0297t1.h("quark");
                if (!strH.isEmpty()) {
                    a aVar = (a) new Gson().fromJson(strH, a.class);
                    if (aVar == null) {
                        aVar = new a();
                    }
                    c = aVar;
                    return c;
                }
            } catch (Exception unused) {
            }
            c = new a();
            return c;
        }
    }

    public static String f() {
        return e().d().a();
    }

    public final void a() {
        synchronized (d) {
            try {
                Map<String, String> map = this.b;
                if (map != null) {
                    map.clear();
                    i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String b(String str) {
        Map<String, String> map = this.b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final Map c() {
        Map<String, String> map = this.b;
        return map == null ? new HashMap() : map;
    }

    public final d d() {
        d dVar = this.a;
        return dVar == null ? new d() : dVar;
    }

    public final void g(String str, String str2) {
        synchronized (d) {
            try {
                if (this.b == null) {
                    this.b = new HashMap();
                }
                this.b.put(str, str2);
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(String str) {
        synchronized (d) {
            try {
                Map<String, String> map = this.b;
                if (map != null) {
                    map.remove(str);
                    i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        C0297t1.j("quark", new Gson().toJson(this));
    }

    public final void j(boolean z, boolean z2) {
        synchronized (d) {
            d dVarD = d();
            dVarD.f(z);
            dVarD.e(z2);
            this.a = dVarD;
            i();
        }
    }

    public final void k(d dVar) {
        synchronized (d) {
            this.a = dVar;
            i();
        }
    }
}

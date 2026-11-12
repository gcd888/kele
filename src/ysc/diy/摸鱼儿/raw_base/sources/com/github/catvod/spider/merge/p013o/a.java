package com.github.catvod.spider.merge.p013o;

import com.github.catvod.spider.merge.A.C0297t1;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class a {
    public static volatile a d;
    public static final Object e = new Object();

    @SerializedName("user")
    private c a;

    @SerializedName("saveFileIds")
    private Map<String, String> b;

    @SerializedName("utToken")
    private String c;

    public static a g() {
        if (d != null) {
            return d;
        }
        synchronized (e) {
            if (d != null) {
                return d;
            }
            try {
                String strH = C0297t1.h("uc");
                if (!strH.isEmpty()) {
                    a aVar = (a) new Gson().fromJson(strH, a.class);
                    if (aVar == null) {
                        aVar = new a();
                    }
                    d = aVar;
                    return d;
                }
            } catch (Exception unused) {
            }
            d = new a();
            return d;
        }
    }

    public static String h() {
        return g().e().a();
    }

    public static void k() {
        synchronized (e) {
            d = null;
        }
    }

    public final void a() {
        synchronized (e) {
            try {
                Map<String, String> map = this.b;
                if (map != null) {
                    map.clear();
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        this.c = "";
        C0297t1.j("uc_machine_code", "");
    }

    public final String c(String str) {
        Map<String, String> map = this.b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final Map d() {
        Map<String, String> map = this.b;
        return map == null ? new HashMap() : map;
    }

    public final c e() {
        c cVar = this.a;
        return cVar == null ? new c() : cVar;
    }

    public final String f() {
        if (this.c == null) {
            this.c = C0297t1.h("uc_machine_code");
        }
        return this.c;
    }

    public final void i(String str, String str2) {
        synchronized (e) {
            try {
                if (this.b == null) {
                    this.b = new HashMap();
                }
                if (str2 != null) {
                    this.b.put(str, str2);
                } else {
                    this.b.remove(str);
                }
                l();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(String str) {
        synchronized (e) {
            try {
                Map<String, String> map = this.b;
                if (map != null) {
                    map.remove(str);
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        C0297t1.j("uc", toString());
    }

    public final void m(boolean z, boolean z2) {
        synchronized (e) {
            c cVarE = e();
            cVarE.e(z);
            cVarE.d(z2);
            this.a = cVarE;
            l();
        }
    }

    public final void n(c cVar) {
        synchronized (e) {
            this.a = cVar;
            l();
        }
    }

    public final void o(String str) {
        this.c = str;
        if (str == null) {
            str = "";
        }
        C0297t1.j("uc_machine_code", str);
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}

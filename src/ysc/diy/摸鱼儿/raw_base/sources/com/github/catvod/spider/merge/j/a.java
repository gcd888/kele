package com.github.catvod.spider.merge.j;

import com.github.catvod.spider.merge.A.C0297t1;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class a {
    public static volatile a c;
    public static final Object d = new Object();

    @SerializedName("user")
    private b a;

    @SerializedName("saveFileIds")
    private Map<String, String> b;

    public static a b() {
        if (c != null) {
            return c;
        }
        synchronized (d) {
            if (c != null) {
                return c;
            }
            try {
                String strH = C0297t1.h("pan123");
                if (!strH.isEmpty()) {
                    c = c(strH);
                    return c;
                }
            } catch (Exception unused) {
            }
            c = new a();
            return c;
        }
    }

    public static a c(String str) {
        if (str.isEmpty()) {
            return new a();
        }
        a aVar = (a) new Gson().fromJson(str, a.class);
        return aVar == null ? new a() : aVar;
    }

    public static void d() {
        synchronized (d) {
            c = null;
        }
    }

    public final b a() {
        b bVar = this.a;
        return bVar == null ? new b() : bVar;
    }

    public final void e(b bVar) {
        synchronized (d) {
            this.a = bVar;
            C0297t1.j("pan123", toString());
        }
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}

package com.github.catvod.spider.merge.p012n;

import com.github.catvod.spider.merge.A.C0297t1;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class a {
    public static volatile a c;
    public static final Object d = new Object();

    @SerializedName("user")
    private c a;

    @SerializedName("saveFileIds")
    private Map<String, String> b;

    public static a a() {
        if (c != null) {
            return c;
        }
        synchronized (d) {
            if (c != null) {
                return c;
            }
            try {
                String strH = C0297t1.h("tianyi");
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

    public static String b() {
        c cVar = a().a;
        if (cVar == null) {
            cVar = new c("");
        }
        return cVar.a();
    }

    public final void c(c cVar) {
        synchronized (d) {
            this.a = cVar;
            C0297t1.j("tianyi", toString());
        }
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}

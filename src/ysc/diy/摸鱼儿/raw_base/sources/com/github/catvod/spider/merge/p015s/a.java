package com.github.catvod.spider.merge.p015s;

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
                String strH = C0297t1.h("yun");
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

    public final b a() {
        b bVar = this.a;
        return bVar == null ? new b("") : bVar;
    }

    public final void c(b bVar) {
        synchronized (d) {
            this.a = bVar;
            C0297t1.j("yun", toString());
        }
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}

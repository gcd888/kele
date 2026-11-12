package com.github.catvod.spider.merge.p002c;

import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.p015s.b;
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

    public static a a() {
        if (c != null) {
            return c;
        }
        synchronized (d) {
            if (c != null) {
                return c;
            }
            try {
                String strH = C0297t1.h("baidu");
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
        b bVar = a().a;
        if (bVar == null) {
            bVar = new b("");
        }
        return bVar.b();
    }

    public final void c(b bVar) {
        synchronized (d) {
            this.a = bVar;
            C0297t1.j("baidu", toString());
        }
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}

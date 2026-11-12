package com.github.catvod.spider.merge.p006g;

import com.github.catvod.spider.merge.T.j0;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class b {
    public static final j0 h;
    public static final j0 i;
    public static final HashMap j;

    @SerializedName("id")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("episode")
    private String c;

    @SerializedName("url")
    private String d;

    @SerializedName("platform")
    private String e;

    @SerializedName("count")
    private int f;
    public transient String g;

    static {
        j0 j0Var = new j0(2);
        h = j0Var;
        i = new j0(3);
        new j0(4);
        j = new HashMap();
        for (Map.Entry entry : j0Var.entrySet()) {
            j.put((String) entry.getValue(), (String) entry.getKey());
        }
    }

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        String str2 = (String) h.get(str);
        if (str2 != null) {
            return str2;
        }
        if (str.length() > 2) {
            str = str.substring(0, 2);
        }
        return str.toUpperCase();
    }

    public final int b() {
        return this.f;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return a(this.e);
    }

    public final String h() {
        return this.d;
    }

    public final void i(int i2) {
        this.f = i2;
    }

    public final void j(String str) {
        this.a = str;
    }

    public final void k(String str) {
        this.b = str;
    }

    public final void l(String str) {
        this.e = str;
    }

    public final void m(String str) {
        this.d = str;
    }
}

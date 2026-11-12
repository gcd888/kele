package com.github.catvod.spider.merge.j;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class b {

    @SerializedName("expire")
    private long a;

    @SerializedName("cookie")
    private String b;

    @SerializedName("userName")
    private String c;

    @SerializedName("password")
    private String d;

    public final String a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final void e(String str) {
        this.b = str;
    }

    public final void f(long j) {
        this.a = j;
    }

    public final void g(String str) {
        this.d = str;
    }

    public final void h(String str) {
        this.c = str;
    }
}

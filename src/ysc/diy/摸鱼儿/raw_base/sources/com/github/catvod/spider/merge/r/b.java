package com.github.catvod.spider.merge.r;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class b {

    @SerializedName("access_token")
    private String a = "";

    @SerializedName("refresh_token")
    private String b = "";

    @SerializedName("user_id")
    private String c = "";

    @SerializedName("username")
    private String d = "";

    @SerializedName("device_id")
    private String e = "";

    @SerializedName("client_id")
    private String f = "";

    @SerializedName("expires_at")
    private long g = 0;

    @SerializedName("updated_at")
    private long h = 0;

    public final String a() {
        String str = this.a;
        return str != null ? str : "";
    }

    public final String b() {
        String str = this.f;
        return str != null ? str : "";
    }

    public final String c() {
        String str = this.e;
        return str != null ? str : "";
    }

    public final long d() {
        return this.g;
    }

    public final String e() {
        String str = this.b;
        return str != null ? str : "";
    }

    public final String f() {
        String str = this.c;
        return str != null ? str : "";
    }

    public final String g() {
        String str = this.d;
        return str != null ? str : "";
    }

    public final void h(String str) {
        this.a = str;
    }

    public final void i(String str) {
        this.f = str;
    }

    public final void j(String str) {
        this.e = str;
    }

    public final void k(long j) {
        this.g = j;
    }

    public final void l(String str) {
        this.b = str;
    }

    public final void m(long j) {
        this.h = j;
    }

    public final void n(String str) {
        this.c = str;
    }

    public final void o(String str) {
        this.d = str;
    }
}

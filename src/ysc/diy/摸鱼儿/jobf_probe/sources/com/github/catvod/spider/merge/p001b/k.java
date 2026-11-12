package com.github.catvod.spider.merge.p001b;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class k {

    @SerializedName("type_name")
    private String a;

    @SerializedName("vod_id")
    private String b;

    @SerializedName("vod_name")
    private String c;

    @SerializedName("vod_pic")
    private String d;

    @SerializedName("vod_remarks")
    private String e;

    @SerializedName("vod_year")
    private String f;

    @SerializedName("vod_area")
    private String g;

    @SerializedName("vod_actor")
    private String h;

    @SerializedName("vod_director")
    private String i;

    @SerializedName("vod_content")
    private String j;

    @SerializedName("vod_play_from")
    private String k;

    @SerializedName("vod_play_url")
    private String l;

    @SerializedName("vod_tag")
    private String m;

    @SerializedName("action")
    private String n;

    @SerializedName("style")
    private i o;

    public k() {
    }

    public final String a() {
        return this.j;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.k;
    }

    public final String e() {
        return this.l;
    }

    public final String f() {
        return this.m;
    }

    public final void g(String str) {
        this.n = str;
    }

    public final void h(i iVar) {
        this.o = iVar;
    }

    public final void i(String str) {
        this.a = str;
    }

    public final void j(String str) {
        this.h = str;
    }

    public final void k(String str) {
        this.g = str;
    }

    public final void l(String str) {
        this.j = str;
    }

    public final void m(String str) {
        this.i = str;
    }

    public final void n(String str) {
        this.b = str;
    }

    public final void o(String str) {
        this.c = str;
    }

    public final void p(String str) {
        this.d = str;
    }

    public final void q(String str) {
        this.k = str;
    }

    public final void r(String str) {
        this.l = str;
    }

    public final void s(String str) {
        this.e = str;
    }

    public final void t(String str) {
        this.m = str;
    }

    public final void u(String str) {
        this.f = str;
    }

    public k(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public k(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public k(String str, String str2, String str3, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.n = str5;
    }

    public k(String str, String str2, String str3, String str4, i iVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.o = iVar;
    }

    public k(String str, String str2, i iVar) {
        this.b = "poster_ai_profile";
        this.c = "我的口味画像";
        this.d = str;
        this.e = str2;
        this.o = iVar;
        this.n = "poster_ai_profile";
    }

    public k(String str, String str2, String str3, String str4, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.m = z ? "folder" : "file";
    }
}

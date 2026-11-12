package com.github.catvod.spider.merge.p015s;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class b {

    @SerializedName("cookie")
    private String a;

    @SerializedName("account")
    private String b;

    @SerializedName("expire")
    private long c;

    @SerializedName("personalCloudHost")
    private String d;

    @SerializedName("familyCloudHost")
    private String e;

    @SerializedName("familyCloudId")
    private String f;

    @SerializedName("familyRootFolderId")
    private String g;

    @SerializedName("familyCloudName")
    private String h;

    @SerializedName("userDomainId")
    private String i;

    @SerializedName("loginMode")
    private String j;

    @SerializedName("loginAccount")
    private String k;

    @SerializedName("loginPassword")
    private String l;

    @SerializedName("lastLoginAt")
    private long m;

    @SerializedName("authToken")
    private String n;

    @SerializedName("credentialType")
    private String o;

    @SerializedName("lastRefreshAt")
    private long p;

    public b(String str) {
        this.a = str;
    }

    public final void A(String str) {
        this.j = str;
    }

    public final void B(String str) {
        this.l = str;
    }

    public final void C(String str) {
        this.d = str;
    }

    public final void D(String str) {
        this.i = str;
    }

    public final String a() {
        String str = this.b;
        return str == null ? "" : str;
    }

    public final String b() {
        String str = this.a;
        return str == null ? "" : str;
    }

    public final String c() {
        String str = this.o;
        return str == null ? "" : str;
    }

    public final long d() {
        return this.c;
    }

    public final String e() {
        String str = this.f;
        return str == null ? "" : str;
    }

    public final String f() {
        String str = this.h;
        return str == null ? "" : str;
    }

    public final String g() {
        String str = this.g;
        return str == null ? "" : str;
    }

    public final long h() {
        return this.m;
    }

    public final long i() {
        return this.p;
    }

    public final String j() {
        String str = this.k;
        return str == null ? "" : str;
    }

    public final String k() {
        String str = this.j;
        return str == null ? "" : str;
    }

    public final String l() {
        String str = this.l;
        return str == null ? "" : str;
    }

    public final String m() {
        String str = this.d;
        return str == null ? "" : str;
    }

    public final String n() {
        String str = this.i;
        return str == null ? "" : str;
    }

    public final void o(String str) {
        this.b = str;
    }

    public final void p(String str) {
        this.n = str;
    }

    public final void q(String str) {
        this.a = str;
    }

    public final void r(String str) {
        this.o = str;
    }

    public final void s(long j) {
        this.c = j;
    }

    public final void t(String str) {
        this.e = str;
    }

    public final void u(String str) {
        this.f = str;
    }

    public final void v(String str) {
        this.h = str;
    }

    public final void w(String str) {
        this.g = str;
    }

    public final void x(long j) {
        this.m = j;
    }

    public final void y(long j) {
        this.p = j;
    }

    public final void z(String str) {
        this.k = str;
    }
}

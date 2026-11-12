package com.github.catvod.spider.merge.p003d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.D.b;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class g implements Comparable<g> {

    @SerializedName("items")
    private List<g> a;

    @SerializedName("next_marker")
    private String b;

    @SerializedName("file_id")
    private String c;

    @SerializedName("share_id")
    private String d;

    @SerializedName("name")
    private String e;

    @SerializedName("type")
    private String f;

    @SerializedName("file_extension")
    private String g;

    @SerializedName("category")
    private String h;

    @SerializedName("size")
    private double i;

    @SerializedName("parent")
    private String j;

    public g(String str) {
        this.c = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final String b() {
        String str;
        if (this.i == 0.0d) {
            str = "";
        } else {
            str = "[" + AbstractC0309x1.h(this.i) + "]";
        }
        return TextUtils.join(" ", Arrays.asList(str, h(), f())).trim();
    }

    public final String c() {
        return TextUtils.isEmpty(this.g) ? "" : this.g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(g gVar) {
        g gVar2 = gVar;
        return TextUtils.join(" ", Arrays.asList(h(), AbstractC0309x1.f(f()))).trim().compareTo(TextUtils.join(" ", Arrays.asList(gVar2.h(), AbstractC0309x1.f(gVar2.f()))).trim());
    }

    public final String d() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final List e() {
        List<g> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String f() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final String g() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String h() {
        return TextUtils.isEmpty(this.j) ? "" : b.m(new StringBuilder("["), this.j, "]");
    }

    public final String i() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public final void j(String str) {
        this.j = str;
    }
}

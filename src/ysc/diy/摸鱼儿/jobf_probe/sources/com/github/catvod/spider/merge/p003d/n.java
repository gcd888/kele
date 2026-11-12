package com.github.catvod.spider.merge.p003d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class n {

    @SerializedName("share_id")
    private String a;

    @SerializedName("share_token")
    private String b;

    @SerializedName("expire_time")
    private String c;

    @SerializedName("expires_in")
    private int d;

    @SerializedName("creator_id")
    private String e;

    @SerializedName("creator_name")
    private String f;

    @SerializedName("creator_phone")
    private String g;

    @SerializedName("expiration")
    private String h;

    @SerializedName("updated_at")
    private String i;

    @SerializedName("vip")
    private String j;

    @SerializedName("avatar")
    private String k;

    @SerializedName("share_name")
    private String l;

    @SerializedName("display_name")
    private String m;

    @SerializedName("share_title")
    private String n;

    @SerializedName("has_pwd")
    private boolean o;

    @SerializedName("file_infos")
    private List<g> p;
    public long q;

    public final boolean a(String str) {
        return (TextUtils.isEmpty(this.a) ? "" : this.a).equals(str) && System.currentTimeMillis() <= this.q;
    }

    public final String b() {
        return TextUtils.isEmpty(this.k) ? "" : this.k;
    }

    public final List c() {
        List<g> list = this.p;
        return list == null ? Collections.emptyList() : list;
    }

    public final String d() {
        return TextUtils.isEmpty(this.l) ? "" : this.l;
    }

    public final String e() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final void f(String str) {
        this.a = str;
    }
}

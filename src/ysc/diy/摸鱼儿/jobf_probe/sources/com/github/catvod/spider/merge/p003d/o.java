package com.github.catvod.spider.merge.p003d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class o {

    @SerializedName("token_type")
    private String a;

    @SerializedName("access_token")
    private String b;

    @SerializedName("refresh_token")
    private String c;

    @SerializedName("domain_id")
    private String d;

    @SerializedName("default_drive_id")
    private String e;

    public final void a() {
        this.a = "";
        this.c = "";
        this.b = "";
        this.d = "";
        this.e = "";
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.a) ? "" : this.a);
        sb.append(" ");
        sb.append(b());
        return sb.toString();
    }

    public final String d() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final String e() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final String f() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final boolean g() {
        return (TextUtils.isEmpty(this.a) ? "" : this.a).length() > 0 && b().length() > 0;
    }

    public final void h(String str) {
        this.c = str;
    }
}

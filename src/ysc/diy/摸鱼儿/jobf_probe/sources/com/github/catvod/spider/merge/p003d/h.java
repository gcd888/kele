package com.github.catvod.spider.merge.p003d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class h {

    @SerializedName("token_type")
    private String a;

    @SerializedName("access_token")
    private String b;

    @SerializedName("refresh_token")
    private String c;

    public final void a() {
        this.a = "";
        this.c = "";
        this.b = "";
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
}

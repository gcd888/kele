package com.github.catvod.spider.merge.p003d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class l {

    @SerializedName("domain_id")
    private String a;

    @SerializedName("drive_id")
    private String b;

    @SerializedName("file_id")
    private String c;

    @SerializedName("code")
    private String d;

    @SerializedName("message")
    private String e;

    public final String a() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final String b() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String c() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String d() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }
}

package com.github.catvod.spider.merge.p003d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class j {

    @SerializedName("template_id")
    private String a;

    @SerializedName("language")
    private String b;

    @SerializedName("status")
    private String c;

    @SerializedName("url")
    private String d;

    public final String a() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String b() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String c() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }
}

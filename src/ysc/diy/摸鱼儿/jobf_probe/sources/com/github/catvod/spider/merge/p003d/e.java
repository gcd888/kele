package com.github.catvod.spider.merge.p003d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class e {

    @SerializedName("url")
    private String a;

    @SerializedName("file_id")
    private String b;

    @SerializedName("expiration")
    private String c;

    public final String a() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }
}

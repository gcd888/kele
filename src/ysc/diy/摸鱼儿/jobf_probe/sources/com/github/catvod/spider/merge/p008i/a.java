package com.github.catvod.spider.merge.p008i;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class a {

    @SerializedName("source_name")
    private String a;

    @SerializedName("url")
    private String b;

    public final String a() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b.replaceAll("ftp", "tvbox-xg:ftp");
    }
}

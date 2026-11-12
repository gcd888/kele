package com.github.catvod.spider.merge.p003d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class f {

    @SerializedName("default_drive_id")
    private String a;

    @SerializedName("resource_drive_id")
    private String b;

    public final String a() {
        if ((TextUtils.isEmpty(this.b) ? "" : this.b).isEmpty()) {
            return TextUtils.isEmpty(this.a) ? "" : this.a;
        }
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }
}

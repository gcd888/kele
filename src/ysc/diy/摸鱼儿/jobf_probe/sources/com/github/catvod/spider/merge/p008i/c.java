package com.github.catvod.spider.merge.p008i;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class c {

    @SerializedName(alternate = {"name"}, value = "title")
    private String a;

    public final String a() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }
}

package com.github.catvod.spider.merge.p001b;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class i {

    @SerializedName("type")
    private String a;

    @SerializedName("ratio")
    private Float b;

    public i() {
        this.a = "list";
    }

    public static i a(float f) {
        return new i("rect", Float.valueOf(f));
    }

    public i(String str, Float f) {
        this.a = str;
        this.b = f;
    }
}

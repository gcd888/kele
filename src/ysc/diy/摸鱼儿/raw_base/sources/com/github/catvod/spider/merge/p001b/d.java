package com.github.catvod.spider.merge.p001b;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class d {

    @SerializedName("key")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("init")
    private String c;

    @SerializedName("value")
    private List<c> d;

    public d(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.d = list;
    }
}

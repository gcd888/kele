package com.github.catvod.spider.merge.p003d;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class a {

    @SerializedName("refreshToken")
    private String a;

    @SerializedName("refresh_token")
    private String b;

    public final String a() {
        String str = this.a;
        if (str != null && !str.isEmpty()) {
            return this.a;
        }
        String str2 = this.b;
        return str2 == null ? "" : str2;
    }
}

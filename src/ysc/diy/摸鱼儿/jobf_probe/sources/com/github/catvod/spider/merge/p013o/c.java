package com.github.catvod.spider.merge.p013o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class c {

    @SerializedName("cookie")
    private String a = "";

    @SerializedName("refresh_token")
    private String b;

    @SerializedName("device_id")
    private String c;

    @SerializedName("vip")
    private boolean d;

    @SerializedName("svip")
    private boolean e;

    public final String a() {
        String str = this.a;
        return str == null ? "" : str;
    }

    public final boolean b() {
        return this.e;
    }

    public final void c(String str) {
        this.a = str;
    }

    public final void d(boolean z) {
        this.e = z;
    }

    public final void e(boolean z) {
        this.d = z;
    }
}

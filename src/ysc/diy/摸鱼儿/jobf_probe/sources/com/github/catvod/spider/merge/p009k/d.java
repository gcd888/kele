package com.github.catvod.spider.merge.p009k;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class d {

    @SerializedName("cookie")
    private String a = "";

    @SerializedName("isVip")
    private boolean b = false;

    @SerializedName("isSvip")
    private boolean c;

    public final String a() {
        String str = this.a;
        return str != null ? str : "";
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public final void d(String str) {
        this.a = str;
    }

    public final void e(boolean z) {
        this.c = z;
    }

    public final void f(boolean z) {
        this.b = z;
    }
}

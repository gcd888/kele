package com.github.catvod.spider.merge.p001b;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class h {

    @SerializedName("url")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("lang")
    private String c;

    @SerializedName("format")
    private String d;

    public final void a(String str) {
        str.getClass();
        switch (str) {
            case "ass":
            case "ssa":
                this.d = "text/x-ssa";
                break;
            case "vtt":
                this.d = "text/vtt";
                break;
            default:
                this.d = "application/x-subrip";
                break;
        }
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void d(String str) {
        this.a = str;
    }
}

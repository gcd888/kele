package com.github.catvod.spider.merge.p001b;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class b {

    @SerializedName("type_id")
    private String a;

    @SerializedName("type_name")
    private String b;

    @SerializedName("type_flag")
    private String c;

    @SerializedName("style")
    private i d;

    public b(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final void b(i iVar) {
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.a.equals(((b) obj).a);
        }
        return false;
    }
}

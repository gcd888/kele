package com.github.catvod.spider.merge.p008i;

import android.text.TextUtils;
import com.github.catvod.spider.merge.p001b.k;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class g {

    @SerializedName("data")
    private List<g> a;

    @SerializedName("id")
    private String b;

    @SerializedName(alternate = {"path"}, value = "thumbnail")
    private String c;

    @SerializedName("title")
    private String d;

    @SerializedName("mask")
    private String e;

    public final List a() {
        List<g> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final k b(String str) {
        return new k(TextUtils.isEmpty(this.b) ? "" : this.b, TextUtils.isEmpty(this.d) ? "" : this.d, d.a(str, this.c), TextUtils.isEmpty(this.e) ? "" : this.e);
    }
}

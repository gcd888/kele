package com.github.catvod.spider.merge.p008i;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class b {

    @SerializedName("name")
    private String a;

    @SerializedName("source_list")
    private List<a> b;

    public final List a() {
        List<a> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final String b() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }
}

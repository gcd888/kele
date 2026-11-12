package com.github.catvod.spider.merge.p003d;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class m {

    @SerializedName("responses")
    private List<m> a;

    @SerializedName("body")
    private l b;

    @SerializedName("id")
    private String c;

    @SerializedName("status")
    private int d;

    public final l a() {
        l lVar = this.b;
        return lVar == null ? new l() : lVar;
    }

    public final String b() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final m c() {
        return d().isEmpty() ? new m() : (m) d().get(0);
    }

    public final List d() {
        List<m> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final int e() {
        return this.d;
    }
}

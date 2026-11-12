package com.github.catvod.spider.merge.p005f;

import android.text.TextUtils;
import com.github.catvod.spider.merge.D.b;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class s {

    @SerializedName("mid")
    private String a;

    @SerializedName("name")
    private String b;

    public final String a() {
        return b.m(b.r("[a=cr:{\"id\":\"", b.m(new StringBuilder(), TextUtils.isEmpty(this.a) ? "" : this.a, "/{pg}"), "\",\"name\":\"", TextUtils.isEmpty(this.b) ? "" : this.b, "\"}/]"), TextUtils.isEmpty(this.b) ? "" : this.b, "[/a]");
    }
}

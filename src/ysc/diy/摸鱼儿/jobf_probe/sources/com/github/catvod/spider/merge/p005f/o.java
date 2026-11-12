package com.github.catvod.spider.merge.p005f;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class o {

    @SerializedName("duration")
    private String a;

    @SerializedName(alternate = {"min_buffer_time"}, value = "minBufferTime")
    private String b;

    @SerializedName("video")
    private List<r> c;

    @SerializedName("audio")
    private List<r> d;

    public final List a() {
        List<r> list = this.d;
        return list == null ? Collections.emptyList() : list;
    }

    public final String b() {
        String str = this.a;
        return str == null ? "0" : str;
    }

    public final String c() {
        String str = this.b;
        return str == null ? "0" : str;
    }

    public final List d() {
        List<r> list = this.c;
        return list == null ? Collections.emptyList() : list;
    }
}

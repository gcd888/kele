package com.github.catvod.spider.merge.p005f;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class r {

    @SerializedName("id")
    private String a;

    @SerializedName(alternate = {"base_url"}, value = "baseUrl")
    private String b;

    @SerializedName(alternate = {"backup_url"}, value = "backupUrl")
    private List<String> c;

    @SerializedName("bandwidth")
    private String d;

    @SerializedName(alternate = {"mime_type"}, value = "mimeType")
    private String e;

    @SerializedName("codecs")
    private String f;

    @SerializedName("width")
    private String g;

    @SerializedName("height")
    private String h;

    @SerializedName(alternate = {"frame_rate"}, value = "frameRate")
    private String i;

    @SerializedName("sar")
    private String j;

    @SerializedName(alternate = {"start_with_sap"}, value = "startWithSap")
    private String k;

    @SerializedName(alternate = {"segmentBase", "segment_base"}, value = "SegmentBase")
    private y l;

    @SerializedName(alternate = {"codec_id"}, value = "codecid")
    private String m;

    public final List a() {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.c;
        if (list != null) {
            for (String str : list) {
                if (str != null && str.length() > 0 && !arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList.isEmpty() ? Collections.emptyList() : arrayList;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.m;
    }

    public final String e() {
        return this.f;
    }

    public final String f() {
        return this.i;
    }

    public final String g() {
        return this.h;
    }

    public final String h() {
        return this.a;
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.j;
    }

    public final y k() {
        return this.l;
    }

    public final String l() {
        return this.k;
    }

    public final String m() {
        return this.g;
    }
}

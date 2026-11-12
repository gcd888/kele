package com.github.catvod.spider.merge.p005f;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class p {

    @SerializedName("result")
    private JsonElement a;

    @SerializedName("list")
    private JsonElement b;

    @SerializedName("isLogin")
    private Boolean c;

    @SerializedName("vipStatus")
    private Integer d;

    @SerializedName("qrcode_key")
    private String e;

    @SerializedName("url")
    private String f;

    @SerializedName("aid")
    private String g;

    @SerializedName("cid")
    private String h;

    @SerializedName("title")
    private String i;

    @SerializedName("tname")
    private String j;

    @SerializedName("pic")
    private String k;

    @SerializedName("duration")
    private Long l;

    @SerializedName("desc")
    private String m;

    @SerializedName("accept_description")
    private List<String> n;

    @SerializedName("accept_quality")
    private List<Integer> o;

    @SerializedName("pages")
    private List<t> p;

    @SerializedName("dash")
    private o q;

    @SerializedName("owner")
    private s r;

    @SerializedName("wbi_img")
    private z s;

    @SerializedName("uname")
    private String t;

    @SerializedName("face")
    private String u;

    @SerializedName("mid")
    private Long v;

    @SerializedName("level_info")
    private q w;

    @SerializedName("money")
    private Double x;

    @SerializedName("vipType")
    private Integer y;

    @SerializedName("vipDueDate")
    private Long z;

    public final List a() {
        List<String> list = this.n;
        return list == null ? Collections.emptyList() : list;
    }

    public final List b() {
        List<Integer> list = this.o;
        return list == null ? Collections.emptyList() : list;
    }

    public final String c() {
        return TextUtils.isEmpty(this.m) ? "" : this.m;
    }

    public final Long d() {
        Long l = this.l;
        return Long.valueOf(l == null ? 0L : l.longValue());
    }

    public final q e() {
        q qVar = this.w;
        return qVar == null ? new q() : qVar;
    }

    public final long f() {
        Long l = this.v;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final double g() {
        Double d = this.x;
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    public final s h() {
        s sVar = this.r;
        return sVar == null ? new s() : sVar;
    }

    public final List i() {
        List<t> list = this.p;
        return list == null ? Collections.emptyList() : list;
    }

    public final String j() {
        return TextUtils.isEmpty(this.k) ? "" : this.k;
    }

    public final JsonElement k() {
        return this.a;
    }

    public final String l() {
        return TextUtils.isEmpty(this.i) ? "" : this.i;
    }

    public final String m() {
        return TextUtils.isEmpty(this.j) ? "" : this.j;
    }

    public final String n() {
        return this.t;
    }

    public final long o() {
        Long l = this.z;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final String p() {
        Integer num = this.y;
        if (num == null || num.intValue() == 0) {
            return "";
        }
        return this.y.intValue() == 1 ? "月度大会员" : "年度大会员";
    }

    public final z q() {
        z zVar = this.s;
        return zVar == null ? new z() : zVar;
    }

    public final boolean r() {
        Long l;
        return (TextUtils.isEmpty(this.t) || (l = this.v) == null || l.longValue() <= 0) ? false : true;
    }

    public final boolean s() {
        Integer num = this.d;
        return (num == null || num.intValue() == 0) ? false : true;
    }
}

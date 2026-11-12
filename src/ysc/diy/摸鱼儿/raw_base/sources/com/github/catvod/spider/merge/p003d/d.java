package com.github.catvod.spider.merge.p003d;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class d {

    @SerializedName("data")
    private d a;

    @SerializedName("content")
    private d b;

    @SerializedName("t")
    private String c;

    @SerializedName("ck")
    private String d;

    @SerializedName("codeContent")
    private String e;

    @SerializedName("qrCodeStatus")
    private String f;

    @SerializedName("bizExt")
    private String g;

    public static d g(String str) {
        try {
            d dVar = (d) new Gson().fromJson(str, d.class);
            return dVar == null ? new d() : dVar;
        } catch (Exception unused) {
            return new d();
        }
    }

    public final String a() {
        String str = this.g;
        return str == null ? "" : str;
    }

    public final String b() {
        String str = this.e;
        return str == null ? "" : str;
    }

    public final d c() {
        d dVar = this.b;
        return dVar == null ? new d() : dVar;
    }

    public final d d() {
        d dVar = this.a;
        return dVar == null ? new d() : dVar;
    }

    public final HashMap e() {
        HashMap map = new HashMap();
        String str = this.c;
        if (str == null) {
            str = "";
        }
        map.put("t", str);
        String str2 = this.d;
        if (str2 == null) {
            str2 = "";
        }
        map.put("ck", str2);
        map.put("appName", "aliyun_drive");
        map.put("appEntrance", "web");
        map.put("isMobile", "false");
        map.put("lang", "zh_CN");
        map.put("returnUrl", "");
        map.put("fromSite", "52");
        map.put("bizParams", "");
        map.put("navlanguage", "zh-CN");
        map.put("navPlatform", "MacIntel");
        return map;
    }

    public final boolean f() {
        String str = this.f;
        if (str == null) {
            str = "";
        }
        return str.equals("CONFIRMED") && a().length() > 0;
    }
}

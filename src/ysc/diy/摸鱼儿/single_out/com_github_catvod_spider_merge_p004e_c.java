package com.github.catvod.spider.merge.p004e;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p001b.k;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class c {

    @SerializedName("name")
    private String a;

    @SerializedName(alternate = {"parent"}, value = "path")
    private String b;

    @SerializedName("type")
    private int c;

    @SerializedName("size")
    private long d;

    @SerializedName(alternate = {"thumbnail"}, value = "thumb")
    private String e;

    @SerializedName(alternate = {"raw_url"}, value = "url")
    private String f;

    @SerializedName(alternate = {"updated_at"}, value = "modified")
    private String g;

    public static List a(String str) {
        return (List) new Gson().fromJson(str, new b().getType());
    }

    public final Date b() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(this.g);
        } catch (Exception unused) {
            return new Date();
        }
    }

    public final String c() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final long d() {
        return this.d;
    }

    public final String e() {
        if (TextUtils.isEmpty(this.f)) {
            return "";
        }
        if (!this.f.startsWith("//")) {
            return this.f;
        }
        return "http:" + this.f;
    }

    public final k f(a aVar, String str) {
        String strH = h(aVar.g());
        String strC = c();
        if (!(TextUtils.isEmpty(this.e) ? "" : this.e).isEmpty() || !j()) {
            str = TextUtils.isEmpty(this.e) ? "" : this.e;
        }
        return new k(strH, strC, str, aVar.g(), j());
    }

    public final k g(String str, String str2) {
        String strH = h(str);
        String strC = c();
        if (!(TextUtils.isEmpty(this.e) ? "" : this.e).isEmpty() || !j()) {
            str2 = TextUtils.isEmpty(this.e) ? "" : this.e;
        }
        return new k(strH, strC, str2, AbstractC0309x1.h(this.d), j());
    }

    public final String h(String str) {
        StringBuilder sbO = b.o(str);
        sbO.append(TextUtils.isEmpty(this.b) ? "" : this.b);
        sbO.append("/");
        sbO.append(c());
        return sbO.toString();
    }

    public final boolean i(boolean z) {
        if (c().endsWith(".ts") || c().endsWith(".mpg")) {
            return false;
        }
        if (z) {
            int i = this.c;
            return i == 0 || i == 4;
        }
        int i2 = this.c;
        return i2 == 0 || i2 == 2 || i2 == 5;
    }

    public final boolean j() {
        return this.c == 1;
    }

    public final boolean k(boolean z) {
        if (c().endsWith(".ts") || c().endsWith(".mpg")) {
            return true;
        }
        if (z) {
            int i = this.c;
            return i == 2 || i == 3;
        }
        int i2 = this.c;
        return i2 == 3 || i2 == 4;
    }

    public final void l(String str) {
        this.a = str;
    }

    public final void m(String str) {
        this.b = str;
    }

    public final void n(String str) {
        this.e = str;
    }

    public final void o(int i) {
        this.c = i;
    }
}

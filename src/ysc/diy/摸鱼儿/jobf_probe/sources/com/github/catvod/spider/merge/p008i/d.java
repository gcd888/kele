package com.github.catvod.spider.merge.p008i;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p001b.k;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class d {

    @SerializedName("jump_id")
    private String a;

    @SerializedName("id")
    private String b;

    @SerializedName(alternate = {"path", "cover_image"}, value = "thumbnail")
    private String c;

    @SerializedName("title")
    private String d;

    @SerializedName("mask")
    private String e;

    @SerializedName("description")
    private String f;

    @SerializedName("playlist")
    private c g;

    @SerializedName("year")
    private String h;

    @SerializedName("area")
    private String i;

    @SerializedName("types")
    private List<c> j;

    @SerializedName("actors")
    private List<c> k;

    @SerializedName("directors")
    private List<c> l;

    @SerializedName("source_list_source")
    private List<b> m;

    @SerializedName("dataList")
    private List<d> n;

    public static String a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        String strTrim = str2.trim();
        if (strTrim.length() == 0) {
            return "";
        }
        if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
            if (strTrim.startsWith("//")) {
                return "https:".concat(strTrim);
            }
            if (str != null && str.length() != 0) {
                String strTrim2 = str.trim();
                if (strTrim2.length() == 0) {
                    return strTrim;
                }
                if (strTrim2.startsWith("//")) {
                    strTrim2 = "https:".concat(strTrim2);
                }
                if (!strTrim2.startsWith("http://") && !strTrim2.startsWith("https://")) {
                    strTrim2 = "https://".concat(strTrim2);
                }
                while (strTrim2.endsWith("/")) {
                    strTrim2 = b.g(strTrim2, 1, 0);
                }
                if (!strTrim.startsWith("/")) {
                    strTrim = "/".concat(strTrim);
                }
                return b.i(strTrim2, strTrim);
            }
        }
        return strTrim;
    }

    public static String j(List list, boolean z) {
        String strA;
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (z) {
                strA = b.m(b.r("[a=cr:{\"id\":\"", cVar.a() + "/{pg}", "\",\"name\":\"", cVar.a(), "\"}/]"), cVar.a(), "[/a]");
            } else {
                strA = cVar.a();
            }
            sb.append(strA);
            sb.append(" ");
        }
        return AbstractC0309x1.o(sb.toString());
    }

    public final String b() {
        List<c> list = this.k;
        return list == null ? "" : j(list, true);
    }

    public final String c() {
        String str = this.i;
        return str == null ? "" : str;
    }

    public final List d() {
        List<d> list = this.n;
        return list == null ? Collections.emptyList() : list;
    }

    public final String e() {
        return TextUtils.isEmpty(this.f) ? "" : this.f.replace("\u3000", "");
    }

    public final String f() {
        List<c> list = this.l;
        return list == null ? "" : j(list, true);
    }

    public final List g() {
        List<b> list = this.m;
        return list == null ? Collections.emptyList() : list;
    }

    public final String h() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final String i() {
        List<c> list = this.j;
        return list == null ? "" : j(list, false);
    }

    public final String k() {
        String str = this.h;
        return str == null ? "" : str;
    }

    public final k l(String str) {
        return new k(TextUtils.isEmpty(this.a) ? "" : this.a, h(), a(str, this.c));
    }

    public final k m(String str) {
        String strA = "";
        String str2 = TextUtils.isEmpty(this.b) ? "" : this.b;
        String strH = h();
        String strA2 = a(str, this.c);
        if (TextUtils.isEmpty(this.e)) {
            c cVar = this.g;
            if (cVar != null) {
                strA = cVar.a();
            }
        } else {
            strA = this.e;
        }
        return new k(str2, strH, strA2, strA);
    }
}

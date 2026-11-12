package com.github.catvod.spider.merge.p001b;

import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.merge.A.AbstractC0251e;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0312y1;
import com.github.catvod.spider.merge.A.k2;
import com.github.catvod.spider.merge.p010l.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class g {

    @SerializedName("class")
    private List<b> a;

    @SerializedName("list")
    private List<k> b;

    @SerializedName("filters")
    private LinkedHashMap<String, List<d>> c;

    @SerializedName("header")
    private String d;

    @SerializedName("format")
    private String e;

    @SerializedName("danmaku")
    private String f;

    @SerializedName("click")
    private String g;

    @SerializedName("msg")
    private String h;

    @SerializedName("url")
    private Object i;

    @SerializedName("subs")
    private List<h> j;

    @SerializedName("parse")
    private int k;

    @SerializedName("jx")
    private int l;

    @SerializedName("page")
    private Integer m;

    @SerializedName("pagecount")
    private Integer n;

    @SerializedName("limit")
    private Integer o;

    @SerializedName("total")
    private Integer p;

    public static String A(List list, List list2, LinkedHashMap linkedHashMap) {
        g gVar = new g();
        gVar.a = list;
        gVar.F(list2);
        gVar.c = linkedHashMap;
        return gVar.r();
    }

    public static String d(String str) {
        g gVar = new g();
        gVar.F(Collections.emptyList());
        gVar.h = str;
        return gVar.r();
    }

    public static String m(String str) {
        g gVar = new g();
        gVar.h = str;
        return gVar.r();
    }

    public static String s(k kVar) {
        g gVar = new g();
        gVar.E(kVar);
        return gVar.r();
    }

    public static String t(ArrayList arrayList, JsonElement jsonElement) {
        g gVar = new g();
        gVar.a = arrayList;
        if (jsonElement != null) {
            gVar.c = (LinkedHashMap) new Gson().fromJson(jsonElement.toString(), new f().getType());
        }
        return gVar.r();
    }

    public static String u(ArrayList arrayList, ArrayList arrayList2, JsonObject jsonObject) {
        g gVar = new g();
        gVar.a = arrayList;
        gVar.F(arrayList2);
        if (jsonObject != null) {
            gVar.c = (LinkedHashMap) new Gson().fromJson(jsonObject.toString(), new f().getType());
        }
        return gVar.r();
    }

    public static String v(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        g gVar = new g();
        gVar.a = arrayList;
        gVar.c = linkedHashMap;
        return gVar.r();
    }

    public static String w(ArrayList arrayList, List list, JSONObject jSONObject) {
        g gVar = new g();
        gVar.a = arrayList;
        gVar.F(list);
        if (jSONObject != null) {
            gVar.c = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new e().getType());
        }
        return gVar.r();
    }

    public static String x(ArrayList arrayList, JSONObject jSONObject) {
        g gVar = new g();
        gVar.a = arrayList;
        gVar.c = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new e().getType());
        return gVar.r();
    }

    public static String y(List list) {
        g gVar = new g();
        gVar.F(list);
        return gVar.r();
    }

    public static String z(List list, List list2) {
        g gVar = new g();
        gVar.a = list;
        gVar.F(list2);
        return gVar.r();
    }

    public final void B(List list) {
        this.j = list;
    }

    public final void C(String str) {
        this.i = str;
    }

    public final void D(ArrayList arrayList) {
        this.i = arrayList;
    }

    public final void E(k kVar) {
        AbstractC0280n1.o(kVar);
        this.b = Arrays.asList(kVar);
    }

    public final void F(List list) {
        Object obj = AbstractC0251e.a;
        JSONArray jSONArrayA = AbstractC0312y1.a(list);
        if (jSONArrayA.length() != 0) {
            synchronized (AbstractC0251e.a) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (int i = 0; i < jSONArrayA.length(); i++) {
                        AbstractC0251e.d(AbstractC0251e.z(jSONArrayA.optJSONObject(i), jCurrentTimeMillis));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (list != null && list.size() == 1) {
            AbstractC0280n1.o((k) list.get(0));
        }
        this.b = list;
    }

    public final void a(List list) {
        this.a = list;
    }

    public final void b(String str) {
        this.f = str;
    }

    public final void c() {
        this.e = "application/dash+xml";
    }

    public final void e(LinkedHashMap linkedHashMap) {
        this.c = linkedHashMap;
    }

    public final void f(String str) {
        this.e = str;
    }

    public final List g() {
        List<k> list = this.b;
        return list == null ? Collections.emptyList() : list;
    }

    public final void h(Map map) {
        if (map.isEmpty()) {
            return;
        }
        this.d = new Gson().toJson(map);
    }

    public final void i() {
        this.e = "video/x-iso";
    }

    public final void j() {
        this.l = 1;
    }

    public final void k() {
        this.e = "application/x-mpegURL";
    }

    public final void l(String str) {
        this.h = str;
    }

    public final void n() {
        this.e = "application/octet-stream";
    }

    public final void o(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.m = Integer.valueOf(i);
        if (i3 <= 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.o = Integer.valueOf(i3);
        if (i4 <= 0) {
            i4 = Integer.MAX_VALUE;
        }
        this.p = Integer.valueOf(i4);
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.n = Integer.valueOf(i2);
    }

    public final void p() {
        this.k = 1;
    }

    public final void q(int i) {
        this.k = i;
    }

    public final String r() {
        String strTrim;
        Object obj = this.i;
        String str = AbstractC0280n1.a;
        if (!(obj instanceof String)) {
            if (!(obj instanceof List)) {
                strTrim = "";
                break;
            }
            Iterator it = ((List) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    strTrim = "";
                    break;
                }
                Object next = it.next();
                String strTrim2 = next == null ? "" : String.valueOf(next).trim();
                if (!strTrim2.isEmpty()) {
                    strTrim = strTrim2;
                    break;
                }
            }
        } else {
            strTrim = ((String) obj).trim();
        }
        String str2 = AbstractC0280n1.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strB = AbstractC0280n1.b(str2, AbstractC0280n1.c);
        if (!strTrim.isEmpty() && !str2.isEmpty() && AbstractC0280n1.k != 0 && jCurrentTimeMillis - AbstractC0280n1.k <= 300000 && (!strB.equals(AbstractC0280n1.m) || jCurrentTimeMillis - AbstractC0280n1.l >= 30000)) {
            int iK = AbstractC0280n1.k("", strTrim);
            AbstractC0280n1.n(iK);
            if (a.i().n && AbstractC0251e.I(str2, iK, AbstractC0280n1.l(iK, strTrim), "", "", AbstractC0280n1.b, AbstractC0280n1.c)) {
                PianDan.onBehaviorRecorded();
            }
            if (k2.o()) {
                k2.y();
            }
        }
        return toString();
    }

    public final String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }
}

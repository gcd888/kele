package com.github.catvod.spider.merge.p010l;

import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.D.b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a {
    public int a = 2;
    public String b = "";
    public String c = "https://api.tmdb.org/3";
    public String d = "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500";
    public String[] e = new String[0];
    public String[] f = new String[0];
    public String g = "zh-CN";
    public String h = "CN";
    public int i = 7;
    public int j = 0;
    public int k = 0;
    public boolean l = false;
    public boolean m = true;
    public boolean n = true;
    public boolean o = false;
    public boolean p = true;
    public String q = "";
    public String r = "https://api.deepseek.com";
    public String s = "deepseek-chat";

    public static String[] a(String str, String[] strArr) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return e(strArr);
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : e(strArr)) {
            arrayList.add(str2);
        }
        if (!arrayList.contains(strTrim)) {
            arrayList.add(strTrim);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String c(String str) {
        return str == null ? "" : str.trim();
    }

    public static String[] d(String[] strArr, boolean z) {
        if (strArr == null || strArr.length == 0) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String strM = z ? m(str) : l(str);
            if (!strM.isEmpty() && !arrayList.contains(strM)) {
                arrayList.add(strM);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String[] e(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String strC = c(str);
            if (!strC.isEmpty() && !arrayList.contains(strC)) {
                arrayList.add(strC);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String h(String str) {
        String strC = c(str);
        int iIndexOf = strC.indexOf("?url=");
        if (iIndexOf >= 0) {
            strC = strC.substring(iIndexOf + 5);
        }
        if (strC.startsWith("https://")) {
            strC = strC.substring(8);
        }
        if (strC.startsWith("http://")) {
            strC = strC.substring(7);
        }
        int iIndexOf2 = strC.indexOf(47);
        return iIndexOf2 > 0 ? strC.substring(0, iIndexOf2) : strC;
    }

    public static a i() {
        a aVar = new a();
        JSONObject jSONObject = null;
        try {
            boolean z = FishCrypto.a;
            String strH = C0297t1.h("smart_poster_wall_config");
            if (!strH.trim().isEmpty()) {
                JSONObject jSONObject2 = new JSONObject(strH);
                try {
                    aVar.n(jSONObject2);
                } catch (Exception unused) {
                }
                jSONObject = jSONObject2;
            }
        } catch (Exception unused2) {
        }
        try {
            boolean z2 = FishCrypto.a;
            String strH2 = C0297t1.h("smart_history_collection_config");
            if (strH2.trim().isEmpty()) {
                boolean z3 = jSONObject != null && (jSONObject.has("recordSearchEnabled") || jSONObject.has("recordPlayEnabled"));
                if (z3) {
                    aVar.m = jSONObject.optBoolean("recordSearchEnabled", true);
                    aVar.n = jSONObject.optBoolean("recordPlayEnabled", true);
                }
                aVar.r();
                if (z3) {
                    JSONObject jSONObject3 = new JSONObject(C0297t1.h("smart_history_collection_config"));
                    if (jSONObject3.has("recordSearchEnabled") && jSONObject3.has("recordPlayEnabled") && jSONObject3.optBoolean("recordSearchEnabled", true) == aVar.m && jSONObject3.optBoolean("recordPlayEnabled", true) == aVar.n) {
                        jSONObject.remove("recordSearchEnabled");
                        jSONObject.remove("recordPlayEnabled");
                        C0297t1.j("smart_poster_wall_config", jSONObject.toString());
                    }
                }
            } else {
                JSONObject jSONObject4 = new JSONObject(strH2);
                aVar.m = jSONObject4.optBoolean("recordSearchEnabled", true);
                aVar.n = jSONObject4.optBoolean("recordPlayEnabled", true);
            }
        } catch (Exception unused3) {
        }
        aVar.k();
        return aVar;
    }

    public static String l(String str) {
        String strC = c(str);
        if (strC.isEmpty()) {
            return "";
        }
        while (strC.endsWith("/")) {
            strC = b.g(strC, 1, 0);
        }
        String lowerCase = strC.toLowerCase();
        return (lowerCase.equals("https://api.themoviedb.org") || lowerCase.equals("http://api.themoviedb.org") || lowerCase.equals("https://api.tmdb.org") || lowerCase.equals("http://api.tmdb.org")) ? strC.concat("/3") : strC;
    }

    public static String m(String str) {
        String strC = c(str);
        if (strC.isEmpty()) {
            return "";
        }
        while (strC.endsWith("/")) {
            strC = b.g(strC, 1, 0);
        }
        String lowerCase = strC.toLowerCase();
        return (lowerCase.equals("https://image.tmdb.org") || lowerCase.equals("http://image.tmdb.org")) ? strC.concat("/t/p/w500") : strC;
    }

    public static String[] o(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String strC = c(jSONArray.optString(i, ""));
            if (!strC.isEmpty() && !arrayList.contains(strC)) {
                arrayList.add(strC);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String b() {
        if (g()) {
            return "Token已配置 · ".concat("US".equals(this.h) ? "English" : "中文");
        }
        return "Token未配置";
    }

    public final boolean f() {
        return (this.q.isEmpty() || this.r.isEmpty() || this.s.isEmpty()) ? false : true;
    }

    public final boolean g() {
        return (this.b.isEmpty() || this.b.contains("在这里填")) ? false : true;
    }

    public final String j() {
        return h(this.c) + " · " + h(this.d);
    }

    public final void k() {
        int i = this.a;
        if (i != 1 && i != 2) {
            this.a = 2;
        }
        this.b = c(this.b);
        this.c = l(this.c);
        this.d = m(this.d);
        this.e = d(this.e, false);
        this.f = d(this.f, true);
        String upperCase = c(this.h).toUpperCase();
        String str = ("US".equals(upperCase) || "GB".equals(upperCase) || "EN".equals(upperCase)) ? "US" : "CN";
        this.h = str;
        this.g = "US".equals(str) ? "en-US" : "zh-CN";
        if (this.c.isEmpty()) {
            this.c = "https://api.tmdb.org/3";
        }
        if (this.d.isEmpty()) {
            this.d = "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500";
        }
        if (this.g.isEmpty()) {
            this.g = "zh-CN";
        }
        if (this.h.isEmpty()) {
            this.h = "CN";
        }
        this.q = c(this.q);
        this.r = c(this.r);
        this.s = c(this.s);
        if (this.r.isEmpty()) {
            this.r = "https://api.deepseek.com";
        }
        if (this.s.isEmpty()) {
            this.s = "deepseek-chat";
        }
        this.i = Math.max(1, Math.min(31, this.i));
        int i2 = this.j;
        if (i2 != 0 && i2 != 1) {
            this.j = 0;
        }
        int i3 = this.k;
        if (i3 == 0 || i3 == 1) {
            return;
        }
        this.k = 0;
    }

    public final void n(JSONObject jSONObject) {
        this.a = jSONObject.optInt("sourceMode", 2);
        this.b = jSONObject.optString("tmdbToken", "");
        this.c = jSONObject.optString("tmdbBaseUrl", "https://api.tmdb.org/3");
        this.d = jSONObject.optString("tmdbImageBaseUrl", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500");
        this.e = o(jSONObject.optJSONArray("tmdbBaseOptions"));
        this.f = o(jSONObject.optJSONArray("tmdbImageOptions"));
        this.g = jSONObject.optString("language", "zh-CN");
        this.h = jSONObject.optString("region", "CN");
        this.i = jSONObject.optInt("calendarDays", 7);
        this.j = jSONObject.optInt("posterStyle", 0);
        this.k = jSONObject.optInt("followStyle", 0);
        this.l = jSONObject.optBoolean("followReminderEnabled", false);
        this.o = jSONObject.optBoolean("aiRecommendEnabled", false);
        this.p = jSONObject.optBoolean("aiCategoryEnabled", true);
        this.q = jSONObject.optString("aiApiKey", "");
        this.r = jSONObject.optString("aiBaseUrl", "https://api.deepseek.com");
        this.s = jSONObject.optString("aiModel", "deepseek-chat");
    }

    public final String p(boolean z) {
        if (!this.o) {
            return "默认关闭 · 保护模型额度";
        }
        if (!this.p) {
            return "已开启 · 分类隐藏";
        }
        if (!f()) {
            return "已开启 · 模型未配置";
        }
        if (!z) {
            return "已开启 · 待积累记录";
        }
        return "已开启 · " + this.s;
    }

    public final void q() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sourceMode", this.a);
            jSONObject.put("tmdbToken", this.b);
            jSONObject.put("tmdbBaseUrl", this.c);
            jSONObject.put("tmdbImageBaseUrl", this.d);
            String[] strArr = this.e;
            JSONArray jSONArray = new JSONArray();
            for (String str : e(strArr)) {
                jSONArray.put(str);
            }
            jSONObject.put("tmdbBaseOptions", jSONArray);
            String[] strArr2 = this.f;
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : e(strArr2)) {
                jSONArray2.put(str2);
            }
            jSONObject.put("tmdbImageOptions", jSONArray2);
            jSONObject.put("language", this.g);
            jSONObject.put("region", this.h);
            jSONObject.put("calendarDays", this.i);
            jSONObject.put("posterStyle", this.j);
            jSONObject.put("followStyle", this.k);
            jSONObject.put("followReminderEnabled", this.l);
            jSONObject.put("aiRecommendEnabled", this.o);
            jSONObject.put("aiCategoryEnabled", this.p);
            jSONObject.put("aiApiKey", this.q);
            jSONObject.put("aiBaseUrl", this.r);
            jSONObject.put("aiModel", this.s);
            String string = jSONObject.toString();
            boolean z = FishCrypto.a;
            C0297t1.j("smart_poster_wall_config", string);
        } catch (Exception unused) {
        }
    }

    public final void r() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("recordSearchEnabled", this.m);
            jSONObject.put("recordPlayEnabled", this.n);
            String string = jSONObject.toString();
            boolean z = FishCrypto.a;
            C0297t1.j("smart_history_collection_config", string);
        } catch (Exception unused) {
        }
    }

    public final boolean s() {
        return this.a == 1;
    }
}

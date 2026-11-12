package com.github.catvod.spider.merge.p007h;

import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public a(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public static a a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        int i;
        int i2;
        String strTrim = jSONObject == null ? "" : jSONObject.optString("embyItemTypesLocal", "").trim();
        String strTrim2 = jSONObject == null ? "" : jSONObject.optString("embySearchTypesLocal", "").trim();
        int iC = c("embySearchLimitLocal", jSONObject);
        int iC2 = c("embyPageSizeLocal", jSONObject);
        String strTrim3 = jSONObject2 == null ? "" : jSONObject2.optString("embyItemTypes", "").trim();
        if (b(strTrim)) {
            str = strTrim;
        } else {
            if (!b(strTrim3)) {
                strTrim3 = "Movie,Series";
            }
            str = strTrim3;
        }
        String strTrim4 = jSONObject2 != null ? jSONObject2.optString("embySearchTypes", "").trim() : "";
        if (b(strTrim2)) {
            str2 = strTrim2;
        } else {
            if (!b(strTrim4)) {
                strTrim4 = "Movie,Series,BoxSet";
            }
            str2 = strTrim4;
        }
        int iC3 = c("embySearchLimit", jSONObject2);
        if (iC > 0) {
            i = iC;
        } else {
            i = iC3 > 0 ? iC3 : 50;
        }
        int iC4 = c("pageSize", jSONObject2);
        if (iC2 > 0) {
            i2 = iC2;
        } else {
            i2 = iC4 > 0 ? iC4 : 20;
        }
        return new a(str, str2, i, i2, b(strTrim), b(strTrim2), iC > 0, iC2 > 0);
    }

    public static boolean b(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    public static int c(String str, JSONObject jSONObject) {
        int iOptInt;
        if (jSONObject != null && (iOptInt = jSONObject.optInt(str, 0)) > 0) {
            return Math.min(iOptInt, 100);
        }
        return 0;
    }
}

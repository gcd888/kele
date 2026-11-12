package com.github.catvod.spider.merge.p005f;

import android.text.TextUtils;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p001b.g;
import com.github.catvod.spider.merge.p001b.k;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class n {
    public static final Object f = new Object();
    public static long g;
    public final l a;
    public final HashMap b = new HashMap();
    public long c = 0;
    public String d = "";
    public long e = Long.MIN_VALUE;

    public n(l lVar) {
        this.a = lVar;
    }

    public static LinkedHashMap b(String str, String str2, String str3, String str4, String str5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_type", str);
        linkedHashMap.put("keyword", str2);
        if (!TextUtils.isEmpty(str3)) {
            linkedHashMap.put("order", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            linkedHashMap.put("duration", str4);
        }
        if ("video".equals(str)) {
            linkedHashMap.put("tids", "0");
        }
        linkedHashMap.put("web_location", "1430654");
        linkedHashMap.put("page", str5);
        return linkedHashMap;
    }

    public static ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        String strH = AbstractC0302v0.h();
        if (TextUtils.isEmpty(str)) {
            str = "请登录或稍后重试";
        }
        k kVar = new k("bili_status", "B站搜索暂不可用", strH, str, "bili_status");
        kVar.t("file");
        arrayList.add(kVar);
        return arrayList;
    }

    public static String f(String str, List list) {
        int iMax;
        try {
            iMax = Math.max(1, Integer.parseInt(str));
        } catch (Exception unused) {
            iMax = 1;
        }
        int size = list == null ? 0 : list.size();
        int i = size >= 20 ? iMax + 1 : iMax;
        int iMax2 = Math.max(1, ((iMax - 1) * 20) + size);
        g gVar = new g();
        gVar.F(list);
        gVar.o(iMax, i, 20, iMax2);
        return gVar.r();
    }

    public static k g(JsonObject jsonObject) {
        int asInt = (!jsonObject.has("code") || jsonObject.get("code").isJsonNull()) ? 0 : jsonObject.get("code").getAsInt();
        String asString = (!jsonObject.has("message") || jsonObject.get("message").isJsonNull()) ? "" : jsonObject.get("message").getAsString();
        JsonObject asJsonObject = (jsonObject.has("data") && jsonObject.get("data").isJsonObject()) ? jsonObject.getAsJsonObject("data") : null;
        if (asJsonObject != null && asJsonObject.has("v_voucher")) {
            return new k(false, false, true, "B站 WBI 验证失败，请稍后重试", new ArrayList());
        }
        if (asInt == -101) {
            return new k(false, true, false, "B站账号未登录或 Cookie 已失效", new ArrayList());
        }
        if (asInt == -352 || asInt == -412) {
            return new k(false, true, false, "B站搜索被风控拦截，请稍后再试", new ArrayList());
        }
        if (asInt == 0) {
            return null;
        }
        if (TextUtils.isEmpty(asString)) {
            asString = b.e(asInt, "B站搜索失败: ");
        }
        return new k(false, false, asInt == -352 || asInt == -403 || asInt == -412, asString, new ArrayList());
    }

    public static String i(ArrayList arrayList) {
        int size = arrayList.size();
        g gVarC = b.c(arrayList);
        gVarC.o(1, 1, Math.max(1, size), Math.max(1, size));
        return gVarC.r();
    }

    public final boolean a(String str, String str2, String str3, ArrayList arrayList) {
        try {
            String strC = c(str, str2, null, null, str3, false);
            if (TextUtils.isEmpty(strC)) {
                return false;
            }
            JsonObject jsonObjectC = I0.c(h(strC));
            k kVarG = g(jsonObjectC);
            if (kVarG != null && kVarG.c) {
                String strC2 = c(str, str2, null, null, str3, true);
                if (TextUtils.isEmpty(strC2)) {
                    return false;
                }
                jsonObjectC = I0.c(h(strC2));
                kVarG = g(jsonObjectC);
            }
            if (kVarG != null) {
                boolean z = kVarG.b;
                if (z) {
                    this.d = kVarG.d;
                    this.c = System.currentTimeMillis() + 180000;
                    this.e = this.a.credentialGeneration();
                }
                return z;
            }
            x xVarC = x.c(jsonObjectC.toString());
            if (xVarC != null && xVarC.b() != null && xVarC.b().k() != null) {
                Iterator it = w.a(xVarC.b().k()).iterator();
                while (it.hasNext()) {
                    k kVarD = ((w) it.next()).d();
                    if (kVarD != null) {
                        kVarD.t("file");
                        arrayList.add(kVarD);
                    }
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public final String c(String str, String str2, String str3, String str4, String str5, boolean z) {
        l lVar = this.a;
        lVar.ensureWbi(z);
        if (!lVar.hasWbi()) {
            return "";
        }
        try {
            return Bili.api("/x/web-interface/wbi/search/type?") + lVar.wbiQuery(b(str, str2, str3, str4, str5));
        } catch (Exception unused) {
            lVar.clearWbi();
            return "";
        }
    }

    public final k d(String str) {
        if (TextUtils.isEmpty(str)) {
            return new k(false, false, true, "B站 WBI 初始化失败，请稍后重试", new ArrayList());
        }
        JsonObject jsonObjectC = I0.c(h(str));
        k kVarG = g(jsonObjectC);
        if (kVarG != null) {
            return kVarG;
        }
        JsonObject asJsonObject = (jsonObjectC.has("data") && jsonObjectC.get("data").isJsonObject()) ? jsonObjectC.getAsJsonObject("data") : null;
        if (asJsonObject == null || !asJsonObject.has("result") || asJsonObject.get("result").isJsonNull()) {
            return new k(true, false, false, "", new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        List<w> listA = w.a(asJsonObject.get("result"));
        if (listA != null) {
            for (w wVar : listA) {
                if (wVar != null && !TextUtils.isEmpty(wVar.b()) && !TextUtils.isEmpty(wVar.c())) {
                    k kVarF = wVar.f();
                    kVarF.t("file");
                    arrayList.add(kVarF);
                }
            }
        }
        return new k(true, false, false, "", arrayList);
    }

    public final String h(String str) {
        synchronized (f) {
            try {
                long jCurrentTimeMillis = 1500 - (System.currentTimeMillis() - g);
                if (jCurrentTimeMillis > 0) {
                    Thread.sleep(jCurrentTimeMillis);
                }
                g = System.currentTimeMillis();
            } catch (Throwable th) {
                throw th;
            }
        }
        return X1.X(str, null, this.a.headers());
    }

    public final void j() {
        long jCredentialGeneration = this.a.credentialGeneration();
        long j = this.e;
        if (j == Long.MIN_VALUE) {
            this.e = jCredentialGeneration;
        } else if (jCredentialGeneration != j) {
            this.b.clear();
            this.c = 0L;
            this.d = "";
            this.e = jCredentialGeneration;
        }
    }

    public final String k(String str, String str2, String str3, String str4) {
        j();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        l lVar = this.a;
        sb2.append(lVar.credentialGeneration());
        sb2.append("|");
        sb.append(sb2.toString());
        sb.append(str);
        b.A(sb, "|", str2, "|", str3);
        String strM = b.m(sb, "|", str4);
        HashMap map = this.b;
        m mVar = (m) map.get(strM);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (mVar != null && jCurrentTimeMillis - mVar.a < 120000) {
            return f(str2, new ArrayList(mVar.b));
        }
        if (jCurrentTimeMillis < this.c) {
            return i(e(this.d));
        }
        k kVarD = d(c("video", str, str3, str4, str2, false));
        if (kVarD.c) {
            kVarD = d(c("video", str, str3, str4, str2, true));
        }
        boolean z = kVarD.b;
        String str5 = kVarD.d;
        if (z) {
            this.d = str5;
            this.c = System.currentTimeMillis() + 180000;
            this.e = lVar.credentialGeneration();
            return i(e(str5));
        }
        boolean z2 = kVarD.a;
        List list = kVarD.e;
        if (!z2 && list.isEmpty()) {
            return i(e(str5));
        }
        map.put(strM, new m(list));
        return f(str2, list);
    }
}

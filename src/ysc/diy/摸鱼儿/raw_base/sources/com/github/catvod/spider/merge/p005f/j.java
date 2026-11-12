package com.github.catvod.spider.merge.p005f;

import android.text.TextUtils;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.T.j0;
import com.github.catvod.spider.merge.p000a.A;
import com.github.catvod.spider.merge.p000a.N;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class j {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public static final ExecutorService d = Executors.newSingleThreadExecutor();
    public static final j0 e = new j0(1);
    public final i a;

    public j(i iVar) {
        this.a = iVar;
    }

    public static void a(JsonObject jsonObject, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        if (jsonObject != null && jsonObject.has("accept_quality") && jsonObject.has("accept_description")) {
            for (int i = 0; i < jsonObject.getAsJsonArray("accept_quality").size() && i < jsonObject.getAsJsonArray("accept_description").size(); i++) {
                try {
                    int asInt = jsonObject.getAsJsonArray("accept_quality").get(i).getAsInt();
                    String asString = jsonObject.getAsJsonArray("accept_description").get(i).getAsString();
                    if (!z || (!asString.contains("HDR") && !asString.contains("真彩") && !asString.contains("杜比"))) {
                        arrayList.add(Integer.valueOf(asInt));
                        arrayList2.add(asString);
                    }
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    public static void b() {
        HashMap map = c;
        synchronized (map) {
            map.clear();
        }
    }

    public static String c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strConcat = str2.concat("=");
            for (String str3 : str.split(";")) {
                String strTrim = str3.trim();
                if (strTrim.startsWith(strConcat)) {
                    return strTrim.substring(strConcat.length());
                }
            }
        }
        return "";
    }

    public static Object[] d(int i, String str) {
        try {
            return new Object[]{Integer.valueOf(i), "text/plain; charset=utf-8", new ByteArrayInputStream(str.getBytes("UTF-8"))};
        } catch (Exception unused) {
            return new Object[]{Integer.valueOf(i), "text/plain", new ByteArrayInputStream(str.getBytes())};
        }
    }

    public static String e(String str) {
        return str == null ? "" : str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&apos;");
    }

    public static String f(r rVar, String str) {
        String strI = rVar.i();
        String strSubstring = strI.contains("/") ? strI.substring(0, strI.indexOf(47)) : strI;
        y yVarK = rVar.k();
        StringBuilder sb = new StringBuilder("<BaseURL>");
        sb.append(e(rVar.c()));
        sb.append("</BaseURL>\n");
        for (String str2 : rVar.a()) {
            if (!TextUtils.isEmpty(str2) && !str2.equals(rVar.c())) {
                sb.append("<BaseURL>");
                sb.append(e(str2));
                sb.append("</BaseURL>\n");
            }
        }
        Locale.getDefault();
        String strE = e(strSubstring);
        String strE2 = e(rVar.h() + "_" + rVar.d());
        String strE3 = e(rVar.b());
        String strE4 = e(rVar.e());
        String strE5 = e(strI);
        String strE6 = e(rVar.l());
        String string = sb.toString();
        String strE7 = e(yVarK.a());
        String strE8 = e(yVarK.b());
        StringBuilder sbR = b.r("<AdaptationSet>\n<ContentComponent contentType=\"", strE, "\"/>\n<Representation id=\"", strE2, "\" bandwidth=\"");
        b.A(sbR, strE3, "\" codecs=\"", strE4, "\" mimeType=\"");
        b.A(sbR, strE5, "\" ", str, " startWithSAP=\"");
        b.A(sbR, strE6, "\">\n", string, "<SegmentBase indexRange=\"");
        sbR.append(strE7);
        sbR.append("\">\n<Initialization range=\"");
        sbR.append(strE8);
        sbR.append("\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>");
        return sbR.toString();
    }

    public static int g(JsonObject jsonObject) {
        try {
            if (!jsonObject.has("code") || jsonObject.get("code").isJsonNull()) {
                return 0;
            }
            return jsonObject.get("code").getAsInt();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String h(r rVar) {
        if (rVar != null && !TextUtils.isEmpty(rVar.i()) && !TextUtils.isEmpty(rVar.c()) && rVar.k() != null) {
            if (rVar.i().startsWith("video")) {
                Locale.getDefault();
                String strG = rVar.g();
                String strM = rVar.m();
                String strF = rVar.f();
                String strJ = rVar.j();
                StringBuilder sbR = b.r("height='", strG, "' width='", strM, "' frameRate='");
                sbR.append(strF);
                sbR.append("' sar='");
                sbR.append(strJ);
                sbR.append("'");
                return f(rVar, sbR.toString());
            }
            if (rVar.i().startsWith("audio")) {
                String str = (String) e.get(rVar.h());
                return f(rVar, TextUtils.isEmpty(str) ? "numChannels='2'" : b.j("numChannels='2' sampleRate='", str, "'"));
            }
        }
        return "";
    }

    public static N i(String str, boolean z) {
        String strE = "";
        JsonObject jsonObjectC = I0.c(str);
        o oVar = null;
        if (jsonObjectC.entrySet().isEmpty()) {
            return null;
        }
        int iG = g(jsonObjectC);
        try {
            if (jsonObjectC.has("message") && !jsonObjectC.get("message").isJsonNull()) {
                strE = jsonObjectC.get("message").getAsString();
            }
        } catch (Exception unused) {
        }
        String str2 = z ? "result" : "data";
        JsonObject asJsonObject = (jsonObjectC.has(str2) && jsonObjectC.get(str2).isJsonObject()) ? jsonObjectC.getAsJsonObject(str2) : null;
        if (asJsonObject != null && asJsonObject.has("dash") && asJsonObject.get("dash").isJsonObject()) {
            oVar = (o) new Gson().fromJson(asJsonObject.getAsJsonObject("dash").toString(), o.class);
        }
        if (TextUtils.isEmpty(strE)) {
            strE = b.e(iG, "upstream code=");
        }
        return new N(iG, strE, oVar);
    }

    public static String l(o oVar, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        for (r rVar : oVar.a()) {
            String strH = h(rVar);
            if (!TextUtils.isEmpty(strH)) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = strH;
                }
                if (e.containsKey(rVar.h())) {
                    sb2.append(strH);
                }
            }
        }
        if (sb2.length() == 0 && !TextUtils.isEmpty(str2)) {
            sb2.append(str2);
        }
        for (r rVar2 : oVar.d()) {
            if (str != null && str.equals(rVar2.h())) {
                String strH2 = h(rVar2);
                if (!TextUtils.isEmpty(strH2)) {
                    sb.append(strH2);
                    break;
                }
                break;
            }
        }
        if (sb.length() == 0) {
            Iterator it = oVar.d().iterator();
            while (it.hasNext()) {
                String strH3 = h((r) it.next());
                if (!TextUtils.isEmpty(strH3)) {
                    sb.append(strH3);
                    break;
                }
            }
        }
        if (sb.length() == 0) {
            return "";
        }
        String string = sb.toString();
        String string2 = sb2.toString();
        Locale.getDefault();
        String strB = oVar.b();
        String strC = oVar.c();
        String strB2 = oVar.b();
        StringBuilder sbR = b.r("<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT", strB, "S\" minBufferTime=\"PT", strC, "S\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT");
        b.A(sbR, strB2, "S\" start=\"PT0S\">\n", string, "\n");
        return b.m(sbR, string2, "\n</Period>\n</MPD>");
    }

    public final h j(String str, String str2, String str3) {
        h hVar = new h();
        ArrayList arrayList = (ArrayList) hVar.a;
        ArrayList arrayList2 = (ArrayList) hVar.b;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            for (int i = 0; i < 2 && arrayList.isEmpty(); i++) {
                try {
                    JsonObject jsonObjectC = I0.c(Bili.pgcPlayerApi(str, str2, str3, "127", A.j().f()));
                    if (g(jsonObjectC) != 0) {
                        break;
                    }
                    a((jsonObjectC.has("result") && jsonObjectC.get("result").isJsonObject()) ? jsonObjectC.getAsJsonObject("result") : null, arrayList, arrayList2, this.a.lowEndMode());
                } catch (Exception unused) {
                    if (i == 0) {
                        try {
                            Thread.sleep(200L);
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        }
        return hVar;
    }

    public final h k(String str, String str2) {
        h hVar = new h();
        ArrayList arrayList = (ArrayList) hVar.a;
        ArrayList arrayList2 = (ArrayList) hVar.b;
        for (int i = 0; i < 2 && arrayList.isEmpty(); i++) {
            try {
                x xVarC = x.c(Bili.playerApi(str, str2, "127", A.j().f()));
                if (xVarC != null) {
                    if (xVarC.a() != 0) {
                        break;
                    }
                    p pVarB = xVarC.b();
                    if (pVarB != null && pVarB.b() != null && pVarB.a() != null) {
                        List listB = pVarB.b();
                        List listA = pVarB.a();
                        for (int i2 = 0; i2 < listB.size() && i2 < listA.size(); i2++) {
                            String str3 = (String) listA.get(i2);
                            if (!this.a.lowEndMode() || (!str3.contains("HDR") && !str3.contains("真彩") && !str3.contains("杜比"))) {
                                arrayList.add((Integer) listB.get(i2));
                                arrayList2.add(str3);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
                if (i == 0) {
                    try {
                        Thread.sleep(200L);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return hVar;
    }
}

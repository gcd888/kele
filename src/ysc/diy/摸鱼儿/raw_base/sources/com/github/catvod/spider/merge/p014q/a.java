package com.github.catvod.spider.merge.p014q;

import com.github.catvod.crawler.SpiderDebug;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a {
    public String A;
    public String B;
    public String C;
    public String D;
    public Pattern E;
    public String F;
    public Pattern G;
    public String H;
    public Pattern I;
    public String J;
    public Pattern K;
    public String L;
    public Pattern M;
    public String N;
    public Pattern O;
    public String P;
    public Pattern Q;
    public String R;
    public Pattern S;
    public String T;
    public Pattern U;
    public String V;
    public String W;
    public Pattern X;
    public String Y;
    public String Z;
    public String a;
    public String a0;
    public String b;
    public Pattern b0;
    public String c;
    public String c0;
    public String d;
    public Pattern d0;
    public Pattern e;
    public String e0;
    public String f;
    public String f0;
    public Pattern g;
    public String g0;
    public final LinkedHashMap h = new LinkedHashMap();
    public String h0;
    public JSONObject i;
    public String i0;
    public String j;
    public String j0;
    public String k;
    public Pattern k0;
    public Pattern l;
    public String l0;
    public String m;
    public Pattern m0;
    public Pattern n;
    public String n0;
    public String o;
    public Pattern o0;
    public Pattern p;
    public String p0;
    public String q;
    public Pattern q0;
    public Pattern r;
    public String s;
    public String t;
    public String u;
    public Pattern v;
    public String w;
    public Pattern x;
    public String y;
    public Pattern z;

    public static String a(String str, Pattern pattern) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return str;
    }

    public static a b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a();
            aVar.a = jSONObject.optString("ua");
            aVar.b = jSONObject.optString("homeUrl").trim();
            aVar.c = jSONObject.optString("cateNode").trim();
            aVar.d = jSONObject.optString("cateName").trim();
            aVar.e = c("cateNameR", jSONObject);
            aVar.f = jSONObject.optString("cateId").trim();
            aVar.g = c("cateIdR", jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cateManual");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    aVar.h.put(next.trim(), jSONObjectOptJSONObject.getString(next).trim());
                }
            }
            aVar.i = jSONObject.optJSONObject("filter");
            aVar.j = jSONObject.optString("homeVodNode").trim();
            aVar.k = jSONObject.optString("homeVodName").trim();
            aVar.l = c("homeVodNameR", jSONObject);
            aVar.m = jSONObject.optString("homeVodId").trim();
            aVar.n = c("homeVodIdR", jSONObject);
            aVar.o = jSONObject.optString("homeVodImg").trim();
            aVar.p = c("homeVodImgR", jSONObject);
            aVar.q = jSONObject.optString("homeVodMark").trim();
            aVar.r = c("homeVodMarkR", jSONObject);
            aVar.s = jSONObject.optString("cateUrl").trim();
            aVar.t = jSONObject.optString("cateVodNode").trim();
            aVar.u = jSONObject.optString("cateVodName").trim();
            aVar.v = c("cateVodNameR", jSONObject);
            aVar.w = jSONObject.optString("cateVodId").trim();
            aVar.x = c("cateVodIdR", jSONObject);
            aVar.y = jSONObject.optString("cateVodImg").trim();
            aVar.z = c("cateVodImgR", jSONObject);
            aVar.A = jSONObject.optString("cateVodMark").trim();
            c("cateVodMarkR", jSONObject);
            aVar.B = jSONObject.optString("dtUrl");
            aVar.C = jSONObject.optString("dtNode");
            aVar.D = jSONObject.optString("dtName");
            aVar.E = c("dtNameR", jSONObject);
            aVar.F = jSONObject.optString("dtImg");
            aVar.G = c("dtImgR", jSONObject);
            aVar.H = jSONObject.optString("dtCate");
            aVar.I = c("dtCateR", jSONObject);
            aVar.J = jSONObject.optString("dtYear");
            aVar.K = c("dtYearR", jSONObject);
            aVar.L = jSONObject.optString("dtArea");
            aVar.M = c("dtAreaR", jSONObject);
            aVar.N = jSONObject.optString("dtMark");
            aVar.O = c("dtMarkR", jSONObject);
            aVar.P = jSONObject.optString("dtActor");
            aVar.Q = c("dtActorR", jSONObject);
            aVar.R = jSONObject.optString("dtDirector");
            aVar.S = c("dtDirectorR", jSONObject);
            aVar.T = jSONObject.optString("dtDesc");
            aVar.U = c("dtDescR", jSONObject);
            aVar.V = jSONObject.optString("dtFromNode");
            aVar.W = jSONObject.optString("dtFromName");
            aVar.X = c("dtFromNameR", jSONObject);
            aVar.Y = jSONObject.optString("dtUrlNode");
            aVar.Z = jSONObject.optString("dtUrlSubNode");
            aVar.a0 = jSONObject.optString("dtUrlId");
            aVar.b0 = c("dtUrlIdR", jSONObject);
            aVar.c0 = jSONObject.optString("dtUrlName");
            aVar.d0 = c("dtUrlNameR", jSONObject);
            aVar.e0 = jSONObject.optString("playUrl");
            aVar.f0 = jSONObject.optString("playUa");
            aVar.g0 = jSONObject.optString("playReferer");
            aVar.h0 = jSONObject.optString("searchUrl");
            aVar.i0 = jSONObject.optString("scVodNode").trim();
            aVar.j0 = jSONObject.optString("scVodName").trim();
            aVar.k0 = c("scVodNameR", jSONObject);
            aVar.l0 = jSONObject.optString("scVodId").trim();
            aVar.m0 = c("scVodIdR", jSONObject);
            aVar.n0 = jSONObject.optString("scVodImg").trim();
            aVar.o0 = c("scVodImgR", jSONObject);
            aVar.p0 = jSONObject.optString("scVodMark").trim();
            aVar.q0 = c("scVodMarkR", jSONObject);
            return aVar;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public static Pattern c(String str, JSONObject jSONObject) {
        String strTrim = jSONObject.optString(str).trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        try {
            return Pattern.compile(strTrim);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }
}

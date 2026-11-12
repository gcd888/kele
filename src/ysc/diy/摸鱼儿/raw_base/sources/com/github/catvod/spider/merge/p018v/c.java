package com.github.catvod.spider.merge.p018v;

import android.text.TextUtils;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p001b.g;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p022z.C0538n;
import com.github.catvod.spider.merge.p022z.RunnableC0473a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class c {
    public final d a;
    public final X1 b;

    public /* synthetic */ c(d dVar, X1 x1) {
        this.a = dVar;
        this.b = x1;
    }

    public String a(String str, String str2, String str3, boolean z) throws Throwable {
        String strM;
        int i;
        String string;
        String strValueOf;
        String strTrim = str == null ? "" : str.trim();
        String strTrim2 = str2 == null ? "" : str2.trim();
        if (strTrim.isEmpty() || strTrim2.isEmpty()) {
            return g.d("房间标识不完整");
        }
        String strC = TextUtils.isEmpty(str3) ? b.C(strTrim, "_", strTrim2) : str3;
        String str4 = "/detail?site=" + b.f(strTrim) + "&room_id=" + b.f(strTrim2);
        X1 x1 = this.b;
        JSONObject jSONObjectX = x1.x(x1.m(str4));
        if (jSONObjectX == null) {
            return g.d("获取房间详情失败");
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectX.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            return g.d("房间数据为空");
        }
        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("status", false);
        String strOptString = jSONObjectOptJSONObject.optString("title", "直播间");
        String strK = b.k(jSONObjectOptJSONObject);
        String strOptString2 = jSONObjectOptJSONObject.optString("user_name", "");
        int iOptInt = jSONObjectOptJSONObject.optInt("online", 0);
        String strOptString3 = jSONObjectOptJSONObject.optString("introduction", "");
        String strOptString4 = jSONObjectOptJSONObject.optString("notice", "");
        k kVarA = AbstractC0449a.a(strC);
        kVarA.o(b.g(strTrim) + ":" + (strOptString2.isEmpty() ? strOptString : strOptString2));
        kVarA.p(strK);
        if (zOptBoolean) {
            StringBuilder sb = new StringBuilder("直播中 · ");
            if (iOptInt >= 10000) {
                double d = iOptInt;
                Double.isNaN(d);
                strValueOf = String.format("%.1f万", Double.valueOf(d / 10000.0d));
            } else {
                strValueOf = String.valueOf(iOptInt);
            }
            strM = b.m(sb, strValueOf, "人");
        } else {
            strM = "未开播";
        }
        kVarA.s(strM);
        String strE = b.e(strOptString);
        String strE2 = b.e(strOptString3);
        String strE3 = b.e(strOptString4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(strE);
        if (!strE2.isEmpty() && !strE2.equals(strE)) {
            arrayList.add(strE2);
        }
        if (!strE3.isEmpty() && !strE3.equals(strE) && !strE3.equals(strE2)) {
            arrayList.add(strE3);
        }
        kVarA.l(TextUtils.join(" · ", arrayList));
        d dVar = this.a;
        dVar.f = strTrim;
        dVar.g = strTrim2;
        dVar.h = strOptString;
        dVar.i = strOptString2;
        dVar.j = strK;
        if (!zOptBoolean) {
            kVarA.q("提示");
            kVarA.r("当前未开播$" + strC);
            boolean z2 = FishCrypto.a;
            N1.d(kVarA);
            return g.s(kVarA);
        }
        JSONObject jSONObjectX2 = x1.x(x1.m("/all_play_urls?site=" + b.f(strTrim) + "&room_id=" + b.f(strTrim2)));
        if (jSONObjectX2 == null || jSONObjectX2.optJSONArray("data") == null) {
            kVarA.q("提示");
            kVarA.r("获取播放地址失败$" + strC);
            boolean z3 = FishCrypto.a;
            N1.d(kVarA);
            return g.s(kVarA);
        }
        JSONArray jSONArray = jSONObjectX2.getJSONArray("data");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String strOptString5 = jSONObject.optString("quality", "默认");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("urls");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                i = 1;
            } else {
                arrayList2.add(strOptString5);
                ArrayList arrayList4 = new ArrayList();
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    String str5 = jSONArrayOptJSONArray.length() > 1 ? "线路" + (i3 + 1) : "播放";
                    if (z) {
                        StringBuilder sbR = b.r("alllive|", strTrim, "|", strTrim2, "|");
                        sbR.append(i2);
                        sbR.append("|");
                        sbR.append(i3);
                        string = sbR.toString();
                    } else {
                        string = strTrim + "|" + strTrim2 + "|" + i2 + "|" + i3;
                    }
                    arrayList4.add(str5 + "$" + string);
                }
                i = 1;
                arrayList3.add(TextUtils.join("#", arrayList4));
            }
            i2 += i;
        }
        if (arrayList2.isEmpty()) {
            kVarA.q("提示");
            kVarA.r("暂无可用线路$" + strC);
        } else {
            kVarA.q(TextUtils.join("$$$", arrayList2));
            kVarA.r(TextUtils.join("$$$", arrayList3));
        }
        boolean z4 = FishCrypto.a;
        N1.d(kVarA);
        return g.s(kVarA);
    }

    public String b(String str) throws JSONException {
        String string;
        String str2;
        String strE;
        String[] strArrJ = b.j(str);
        String str3 = "";
        if (strArrJ == null) {
            return b.f("");
        }
        String str4 = strArrJ[0];
        boolean zOptBoolean = true;
        String str5 = strArrJ[1];
        try {
            int i = Integer.parseInt(strArrJ[2]);
            int i2 = Integer.parseInt(strArrJ[3]);
            StringBuilder sbQ = b.q("/all_play_urls?site=", str4, "&room_id=");
            sbQ.append(b.f(str5));
            String string2 = sbQ.toString();
            X1 x1 = this.b;
            JSONObject jSONObjectX = x1.x(x1.m(string2));
            if (jSONObjectX == null) {
                return b.f("");
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectX.optJSONArray("data");
            if (jSONArrayOptJSONArray == null || i < 0 || i >= jSONArrayOptJSONArray.length()) {
                return b.f("");
            }
            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("urls");
            if (jSONArrayOptJSONArray2 == null || i2 < 0 || i2 >= jSONArrayOptJSONArray2.length()) {
                return b.f("");
            }
            String string3 = jSONArrayOptJSONArray2.getString(i2);
            C0239a.e().getClass();
            if (!C0239a.g() || "kuaishou".equals(str4)) {
                string = "";
            } else {
                String str6 = "/danmaku/ws?site=" + b.f(str4) + "&room_id=" + b.f(str5);
                StringBuilder sb = new StringBuilder();
                d dVar = (d) x1.b;
                if (dVar.b || (strE = dVar.a) == null) {
                    strE = C0299u0.x().E();
                }
                sb.append(strE.replace("http://", "ws://").replace("https://", "wss://"));
                sb.append("/alllive");
                sb.append(str6);
                string = sb.toString();
            }
            HashMap map = new HashMap();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObjectOptJSONObject.optString(next));
                }
            }
            d dVar2 = this.a;
            String str7 = dVar2.f;
            if (str7 == null || !str7.equals(str4) || (str2 = dVar2.g) == null || !str2.equals(str5)) {
                C0239a.e().getClass();
                C0239a.b(str4, str5, "", "", "");
            } else {
                C0239a c0239aE = C0239a.e();
                String str8 = dVar2.i;
                String str9 = dVar2.j;
                String str10 = dVar2.h;
                c0239aE.getClass();
                C0239a.b(str4, str5, str8, str9, str10);
            }
            String str11 = dVar2.f;
            String str12 = (str11 == null || !str11.equals(str4)) ? "" : dVar2.i;
            String str13 = dVar2.f;
            String str14 = (str13 == null || !str13.equals(str4)) ? "" : dVar2.j;
            String str15 = dVar2.f;
            if (str15 != null && str15.equals(str4)) {
                str3 = dVar2.h;
            }
            String str16 = str3;
            String[][] strArr = b.a;
            int[] iArr = C0538n.a;
            C0239a c0239aE2 = C0239a.e();
            c0239aE2.getClass();
            if (!C0239a.h(str4, str5)) {
                try {
                    zOptBoolean = C0239a.j().optBoolean("followPrompt", true);
                } catch (Exception unused) {
                }
                if (zOptBoolean) {
                    InitOrigin.run(new RunnableC0473a(strArr, str4, str12, str16, c0239aE2, str5, str14));
                }
            }
            g gVar = new g();
            gVar.C(string3);
            gVar.b(string);
            if (!map.isEmpty()) {
                gVar.h(map);
            }
            return gVar.r();
        } catch (NumberFormatException unused2) {
            return b.f("");
        }
    }
}

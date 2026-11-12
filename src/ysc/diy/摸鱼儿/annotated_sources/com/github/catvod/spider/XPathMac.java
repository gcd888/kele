package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.google.gson.Gson;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class XPathMac extends XPath {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f110short = {2734, 2741, 2738, 2730, 2624, 2635, 2630, 2647, 2652, 2645, 2641, 2121, 2114, 2142, 2131, 2123, 2151, 2112, 2142, 2127, 2527, 2520, 2502, 3007, 2991, 3006, 2981, 3004, 3000, 3040, 3063, 3044, 2998, 3046, 3066, 3063, 3055, 3059, 3044, 3017, 1105, 1088, 1107, 1106, 1092, 1495, 1477, 1557, 2262, 2267, 2271, 2266, 2267, 2252, 2106, 2086, 2091, 2099, 2079, 2104, 2086, 2362, 2332, 2314, 2333, 2370, 2350, 2312, 2314, 2305, 2331, 2504, 2559, 2556, 2559, 2536, 2559, 2536, 1383, 1406, 1397, 1358, 1377, 1405, 1392, 1384, 1358, 1399, 1379, 1406, 1404, 1204, 1201, 1195, 1196, 719, 695, 719, 695, 719, 695, 2096, 2096, 2096, 940, 939, 928, 907, 939, 932, 907, 985, 938, 989, 968, 954, 918, 916, 935, 923, 918, 910, 914, 901, 948, 920, 921, 913, 926, 912, 985, 903, 923, 918, 910, 914, 901, 936, 923, 926, 900, 899, 940, 939, 928, 907, 939, 932, 907, 985, 938, 989, 968, 970, 991, 940, 939, 928, 907, 939, 932, 907, 985, 938, 989, 968, 990, 987, 954, 918, 916, 935, 923, 918, 910, 914, 901, 948, 920, 921, 913, 926, 912, 985, 915, 920, 896, 921, 914, 901, 936, 923, 926, 900, 899, 1373, 1370, 1385, 1365, 1368, 1344, 1388, 1355, 1365, 1720, 1727, 1674, 1717, 1708, 1690, 1712, 1725, 1723, 953, 958, 910, 949, 946, 938, 1007, 907, 948, 941, 704, 755, 726, 727, 762, 707, 1840, 1795, 1830, 1831, 1802, 1843, 1810, 2357, 2356, 2341, 2352, 2360, 2365, 2322, 2366, 2367, 2341, 2356, 2367, 2341, 764, 763, 761, 753, 727, 763, 762, 736, 753, 762, 736, 1507, 1535, 1522, 1514, 1526, 1505, 1488, 1532, 1533, 1511, 1526, 1533, 1511};
    public boolean c;
    public boolean d;
    public String e = "";
    public String f = C0095.m379(f110short, 104, 91, 1015);
    public final HashMap g = new HashMap();

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        String strHomeContent = super.homeContent(z);
        if (strHomeContent.length() > 0 && this.e.length() > 0) {
            Matcher matcher = Pattern.compile(this.f).matcher(b(this.e));
            if (matcher.find()) {
                try {
                    JSONObject jSONObject = new JSONObject(matcher.group(1));
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        if (jSONObjectOptJSONObject != null) {
                            String strTrim = jSONObjectOptJSONObject.optString(C0098.m390(f110short, 0, 4, 2781)).trim();
                            if (!strTrim.isEmpty()) {
                                this.g.put(strTrim, next);
                            }
                        }
                    }
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
        }
        return strHomeContent;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e6 A[EDGE_INSN: B:25:0x00e6->B:28:0x00ee BREAK  A[LOOP:0: B:9:0x007c->B:26:0x00e8]] */
    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strDecode;
        String strM346 = C0087.m346(f110short, 4, 7, 2597);
        AbstractC0280n1.u(str, str2);
        c();
        String strReplace = this.b.e0.isEmpty() ? str2 : this.b.e0.replace(C0126.m503(f110short, 11, 9, 2098), str2);
        boolean z = this.c;
        String strM288 = C0073.m288(f110short, 20, 3, 2474);
        String str3 = null;
        if (z) {
            try {
                com.github.catvod.spider.merge.h0.d dVarQ = X1.L(b(strReplace), "").Q(C0055.m219(f110short, 23, 6, 3020));
                for (int i = 0; i < dVarQ.size(); i++) {
                    String strTrim = ((k) dVarQ.get(i)).K().trim();
                    if (strTrim.startsWith(C0119.m473(f110short, 29, 11, 2966))) {
                        JSONObject jSONObject = new JSONObject(strTrim.substring(strTrim.indexOf(123), strTrim.lastIndexOf(125) + 1));
                        String string = jSONObject.getString(strM288);
                        if (!jSONObject.has(strM346)) {
                            str3 = string;
                            break;
                        }
                        int i2 = jSONObject.getInt(strM346);
                        if (i2 != 1) {
                            if (i2 != 2) {
                                str3 = string;
                                break;
                            }
                            strDecode = URLDecoder.decode(new String(Base64.decode(string, 0)));
                        } else {
                            strDecode = URLDecoder.decode(string);
                        }
                        str3 = strDecode;
                        break;
                    }
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }
        if (str3 != null) {
            boolean z2 = this.d;
            String strM322 = C0081.m322(f110short, 40, 5, 1057);
            if (z2 && AbstractC0309x1.k(str3)) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(strM322, 1);
                    jSONObject2.put(C0047.m186(f110short, 45, 2, 1469), C0098.m390(f110short, 47, 1, 1572));
                    jSONObject2.put(strM288, str3);
                    return jSONObject2.toString();
                } catch (Exception e2) {
                    SpiderDebug.log(e2);
                }
            } else {
                boolean z3 = this.d;
                String strM1 = C0001.m1(f110short, 48, 6, 2238);
                String strM36 = C0010.m36(f110short, 54, 7, 2122);
                if (z3 && list.contains(str)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(strM322, 1);
                        jSONObject3.put(strM36, "");
                        jSONObject3.put(strM288, str3);
                        jSONObject3.put(strM1, "");
                        return jSONObject3.toString();
                    } catch (Exception e3) {
                        SpiderDebug.log(e3);
                    }
                } else if (isVideoFormat(str3)) {
                    try {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(strM322, 0);
                        jSONObject4.put(strM36, "");
                        jSONObject4.put(strM288, str3);
                        HashMap map = new HashMap();
                        if (this.b.f0.length() > 0) {
                            map.put(C0126.m503(f110short, 61, 10, 2415), this.b.f0);
                        }
                        if (this.b.g0.length() > 0) {
                            map.put(C0114.m454(f110short, 71, 7, 2458), this.b.g0);
                        }
                        jSONObject4.put(strM1, new Gson().toJson(map));
                        return jSONObject4.toString();
                    } catch (Exception e4) {
                        SpiderDebug.log(e4);
                    }
                }
            }
        }
        return super.playerContent(str, str2, list);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        String strM402 = C0101.m402(f110short, 78, 13, 1297);
        String strM408 = C0103.m408(f110short, 91, 4, 1240);
        String strDetailContent = super.detailContent(list);
        if (!this.d || strDetailContent.length() <= 0) {
            return strDetailContent;
        }
        try {
            JSONObject jSONObject = new JSONObject(strDetailContent);
            String[] strArrSplit = jSONObject.optJSONArray(strM408).getJSONObject(0).optString(strM402).split(C0053.m210(f110short, 95, 6, 659));
            if (strArrSplit.length <= 0) {
                return strDetailContent;
            }
            for (int i = 0; i < strArrSplit.length; i++) {
                HashMap map = this.g;
                if (map.containsKey(strArrSplit[i])) {
                    strArrSplit[i] = (String) map.get(strArrSplit[i]);
                }
            }
            jSONObject.optJSONArray(strM408).getJSONObject(0).put(strM402, TextUtils.join(C0118.m471(f110short, 101, 3, 2068), strArrSplit));
            return jSONObject.toString();
        } catch (Throwable th) {
            SpiderDebug.log(th);
            return strDetailContent;
        }
    }

    @Override // com.github.catvod.spider.XPath
    public final void d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.c = jSONObject.optBoolean(C0014.m54(f110short, 195, 9, 1337), false);
            this.d = jSONObject.optBoolean(C0125.m499(f110short, 204, 9, 1756), false);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C0017.m65(f110short, 213, 10, 989));
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.g.put(next.trim(), jSONObjectOptJSONObject.getString(next).trim());
                }
            }
            this.e = jSONObject.optString(C0112.m445(f110short, 223, 6, 688)).trim();
            this.f = jSONObject.optString(C0076.m301(f110short, 229, 7, 1856), this.f).trim();
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    @Override // com.github.catvod.spider.XPath
    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0043.m169(f110short, 236, 13, 2385));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$6c1ebb3cb60973b4 = $host$6c1ebb3cb60973b4(list);
            FishCrypto.endHostEntry(null);
            return str$host$6c1ebb3cb60973b4;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    @Override // com.github.catvod.spider.XPath
    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0076.m301(f110short, 249, 11, 660));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$1b26b551389a5dab = $host$1b26b551389a5dab(z);
            FishCrypto.endHostEntry(null);
            return str$host$1b26b551389a5dab;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    @Override // com.github.catvod.spider.XPath
    public void init(Context context, String str) {
        super.init(context, str);
    }

    @Override // com.github.catvod.spider.XPath
    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0082.m325(f110short, 260, 13, 1427));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$62d5eed2b06b9d14 = $host$62d5eed2b06b9d14(str, str2, list);
            FishCrypto.endHostEntry(null);
            return str$host$62d5eed2b06b9d14;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }
}

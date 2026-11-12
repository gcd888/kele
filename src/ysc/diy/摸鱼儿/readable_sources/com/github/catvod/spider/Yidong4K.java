package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Yidong4K extends Cloud {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f119short = {2115, 767, 30392, 23804, 321, 32171, -32424, 23289, 366, 24228, 25383, 1849, -29049, 26020, -31018, 22199, 23632, -30652, 2635, 2631, 2636, 2637, 2396, 2396, 2396, 2396, 2396, 2396, 3115, 3133, 3135, 3108, 3107, 3129, 1030, 1049, 1044, 1045, 1055, 1081, 1044, 2942, 2939, 2939, 2910, 2940, 2940, 2938, 2924, 2924, 2893, 2938, 2940, 2928, 2925, 2939, -29497, -28010, 28931, -29496, 24137, -30115, 1520, 1523, 1528, 1495, 1512, 1509, 1508, 1518, 1477, 1508, 1525, 1504, 1512, 1517, 2699, 2702, 2715, 2702, -29088, 25923, 24822, 26344, 19388, 32764, 2454, 2433, 2455, 2481, 2454, 2440, 2068, 2073, 824, 805, 824, 800, 809, 1066, 1083, 1083, 1032, 1060, 1085, 1070, 1081, 1054, 1081, 1063, 587, 603, 599, 586, 605, 612, 614, 625, 618, 631, 1320, 1317, 1342, 1321, 1327, 1336, 1315, 1342, 1725, 1706, 1698, 1710, 1725, 1700, 1147, 1145, 1132, 1149, 1110, 1145, 1141, 1149, 1108, 1137, 1131, 1132, 2176, 314, 310, 309, 300, 308, 311, 272, 317, 567, 565, 544, 561, 541, 560, 536, 573, 551, 544, 399, 414, 408, 410, 438, 401, 411, 410, 391, 413, 396, 394, 392, 446, 388, 407, 392, 2425, 2415, 2411, 2424, 2409, 2402, 2369, 2415, 2419, 2343, 2340, 2351, 2310, 2359, 2353, 2355, 2325, 2361, 2362, 2339, 2363, 2360, 2304, 2367, 2354, 2355, 2361, 3092, 3092, 3092, 3092, 3092, 3092, 506, 502, 509, 508, 1339, 1342, 1323, 1342, 989, 984, 962, 965, 3176, 3193, 3199, 3197, 3179, 2305, 2330, 2305, 2324, 2329, 3158, 3163, 3252, 3241, 3252, 3244, 3237, 1247, 1230, 1230, 1277, 1233, 1224, 1243, 1228, 1259, 1228, 1234, 2390, 2378, 2378, 2382, 2381, 2308, 2321, 2321, 2376, 2391, 2394, 2381, 2391, 2378, 2395, 2320, 2397, 2386, 2385, 2379, 2394, 2381, 2395, 2395, 2389, 2380, 2320, 2397, 2385, 2387, 2321, 2376, 2391, 2394, 2381, 2391, 2378, 2395, 2321, 2376, 2381, 2321, 3173, 3160, 3139, 3149, 3139, 3140, 1283, 1311, 1311, 1307, 1304, 1361, 1348, 1348, 1309, 1282, 1295, 1304, 1282, 1311, 1294, 1349, 1288, 1287, 1284, 1310, 1295, 1304, 1294, 1294, 1280, 1305, 1349, 1288, 1284, 1286, 306, 272, 272, 278, 259, 263, 692, 677, 677, 697, 700, 694, 692, 673, 700, 698, 699, 762, 703, 678, 698, 699, 761, 757, 673, 688, 685, 673, 762, 677, 697, 692, 700, 699, 761, 757, 767, 762, 767, 434, 404, 386, 405, 458, 422, 384, 386, 393, 403, 2129, 2163, 2150, 2165, 2160, 2160, 2173, 2099, 2089, 2098, 2092, 2108, 2100, 2123, 2165, 2162, 2168, 2163, 2155, 2159, 2108, 2130, 2120, 2108, 2093, 2092, 2098, 2092, 2087, 2108, 2123, 2165, 2162, 2090, 2088, 2087, 2108, 2148, 2090, 2088, 2101, 2108, 2141, 2156, 2156, 2160, 2169, 2123, 2169, 2174, 2135, 2165, 2152, 2099, 2089, 2095, 2091, 2098, 2095, 2090, 2108, 2100, 2135, 2132, 2120, 2129, 2128, 2096, 2108, 2160, 2165, 2167, 2169, 2108, 2139, 2169, 2175, 2167, 2163, 2101, 2108, 2143, 2164, 2158, 2163, 2161, 2169, 2099, 2093, 2094, 2094, 2098, 2092, 2098, 2092, 2098, 2092, 2108, 2127, 2173, 2170, 2173, 2158, 2165, 2099, 2089, 2095, 2091, 2098, 2095, 2090, 806, 785, 786, 785, 774, 785, 774, 2108, 2080, 2080, 2084, 2087, 2158, 2171, 2171, 2082, 2109, 2096, 2087, 2109, 2080, 2097, 2170, 2103, 2104, 2107, 2081, 2096, 2087, 2097, 2097, 2111, 2086, 2170, 2103, 2107, 2105, 2171, 2082, 2109, 2096, 2171, 2101, 2084, 2084, 2171, 2624, 2626, 2647, 2630, 2628, 2636, 2641, 2650, 2656, 2636, 2637, 2647, 2630, 2637, 2647, 1468, 1469, 1452, 1465, 1457, 1460, 1435, 1463, 1462, 1452, 1469, 1462, 1452, 565, 541, 570, 529, 515, 557, 541, 560, 539, 538, 531, 576, 575, 555, 613, 3099, 3100, 3102, 3094, 3120, 3100, 3101, 3079, 3094, 3101, 3079, 2683, 2669, 2665, 2682, 2667, 2656, 2635, 2663, 2662, 2684, 2669, 2662, 2684, 2423, 2401, 2405, 2422, 2407, 2412, 2375, 2411, 2410, 2416, 2401, 2410, 2416};
    public String r;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("1", "电影", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("2", "电视剧", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("3", "动漫", null));
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.a(arrayList);
        return gVar.r();
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return i("0", str2, str);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strJoin;
        String strM554 = "详情获取失败";
        String strM545 = "code";
        String strM175 = "000000";
        String strM126 = "fprint";
        String strM473 = "videoId";
        try {
            String str = list.get(0);
            int i = Integer.parseInt(str);
            String strH = h();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(strM473, i);
            jSONObject.put(strM126, strH);
            if (!strM175.equals(k("addAccessRecord", jSONObject).optString(strM545))) {
                return com.github.catvod.spider.merge.p001b.g.d("访问登记失败");
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(strM473, i);
            jSONObject2.put(strM126, strH);
            JSONObject jSONObjectK = k("qryVideoDetail", jSONObject2);
            if (!strM175.equals(jSONObjectK.optString(strM545))) {
                return com.github.catvod.spider.merge.p001b.g.d(strM554);
            }
            JSONObject jSONObjectOptJSONObject = jSONObjectK.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                return com.github.catvod.spider.merge.p001b.g.d("详情数据为空");
            }
            String strOptString = jSONObjectOptJSONObject.optString("resUrl");
            List listEmptyList = TextUtils.isEmpty(strOptString) ? Collections.emptyList() : Collections.singletonList(strOptString);
            String strB = b(listEmptyList);
            k kVar = new k();
            kVar.n(jSONObjectOptJSONObject.optString("id", str));
            kVar.o(jSONObjectOptJSONObject.optString("title"));
            kVar.p(jSONObjectOptJSONObject.optString("appCoverUrl"));
            kVar.s(jSONObjectOptJSONObject.optString("score"));
            kVar.j(jSONObjectOptJSONObject.optString("actor"));
            kVar.m(jSONObjectOptJSONObject.optString("director"));
            kVar.l(jSONObjectOptJSONObject.optString("remark"));
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("cateNameList");
            if (jSONArrayOptJSONArray == null) {
                strJoin = "";
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i2));
                }
                strJoin = TextUtils.join("/", arrayList);
            }
            kVar.i(strJoin);
            kVar.q(a(listEmptyList));
            kVar.r(strB);
            AbstractC0280n1.p(kVar.c());
            AbstractC0280n1.q(strB);
            boolean z = FishCrypto.a;
            N1.d(kVar);
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.p001b.g.d(strM554);
        }
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        return i(str, str2, "");
    }

    public static String i(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        try {
            int iMax = Math.max(1, Integer.parseInt(str2));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("columnId", Integer.parseInt(str));
            jSONObject.put("cateIdList", new JSONArray().put(0).put(0).put(0));
            jSONObject.put("pageIndex", iMax);
            jSONObject.put("pageSize", 9);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("searchKey", str3);
            }
            JSONObject jSONObjectK = k("qryPageColumnVideo", jSONObject);
            if ("000000".equals(jSONObjectK.optString("code")) && (jSONObjectOptJSONObject = jSONObjectK.optJSONObject("data")) != null) {
                ArrayList arrayListJ = j(jSONObjectOptJSONObject.optJSONArray("list"));
                if (arrayListJ.isEmpty()) {
                    return com.github.catvod.spider.merge.p001b.g.y(arrayListJ);
                }
                com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.F(arrayListJ);
                gVar.o(iMax, jSONObjectOptJSONObject.optInt("pages", iMax), 9, jSONObjectOptJSONObject.optInt("total", arrayListJ.size()));
                return gVar.r();
            }
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
    }

    public static ArrayList j(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("id");
                String strOptString2 = jSONObjectOptJSONObject.optString("title");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    arrayList.add(new k(strOptString, strOptString2, jSONObjectOptJSONObject.optString("appCoverUrl"), ""));
                }
            }
        }
        return arrayList;
    }

    public static JSONObject k(String str, JSONObject jSONObject) {
        String strConcat = "https://vidsite.cloudseekr.com/vidsite/vs/".concat(str);
        String string = jSONObject.toString();
        HashMap mapT = com.github.catvod.spider.merge.D.b.t("Origin", "https://vidsite.cloudseekr.com", "Accept", "application/json, text/plain, */*");
        mapT.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
        mapT.put("Referer", "https://vidsite.cloudseekr.com/vid/app/");
        return new JSONObject(X1.M(strConcat, string, mapT).a());
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "categoryContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$f9d7235748f992e0 = $host$f9d7235748f992e0(str, str2, z, map);
            FishCrypto.endHostEntry(null);
            return str$host$f9d7235748f992e0;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "detailContent");
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

    public final String h() {
        if (TextUtils.isEmpty(this.r)) {
            this.r = AbstractC0309x1.a("AiNewYiDong4K_" + System.currentTimeMillis() + "_" + System.nanoTime());
        }
        return this.r;
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "homeContent");
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

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        super.init(context, str);
        h();
    }

    public String searchContent(String str, boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "searchContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$0b14bd34f5ca9ec8 = $host$0b14bd34f5ca9ec8(str, z);
            FishCrypto.endHostEntry(null);
            return str$host$0b14bd34f5ca9ec8;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public String searchContent(String str, boolean z, String str2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "searchContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$5abcbf7c29fbb7fe = $host$5abcbf7c29fbb7fe(str, z, str2);
            FishCrypto.endHostEntry(null);
            return str$host$5abcbf7c29fbb7fe;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }
}

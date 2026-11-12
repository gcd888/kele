package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0241a1;
import com.github.catvod.spider.merge.A.C0261h0;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.C0359j;
import com.github.catvod.spider.merge.p000a.J;
import com.github.catvod.spider.merge.p000a.K;
import com.github.catvod.spider.merge.p000a.L;
import com.github.catvod.spider.merge.p000a.M;
import com.github.catvod.spider.merge.p000a.O;
import com.github.catvod.spider.merge.p000a.P;
import com.github.catvod.spider.merge.p000a.Q;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
import com.github.catvod.spider.merge.p000a.S;
import com.github.catvod.spider.merge.p000a.T;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.RunnableC0452d;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.p022z.Y3;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class FanShu extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f31short = {1289, 1595, 1588, 1593, 1579, 1579, 20949, 32680, 1606, 1626, 1630, 1613, 24494, 20263, 24058, -25478, 25594, 24906, 3173, 3176, 3197, 3180, 3194, 3197, 28544, 30829, 2508, 2507, 2512, 2711, 2699, 2710, 2704, 26670, 21811, 1769, 1774, 1761, 1788, 1767, 1786, 1744, 1785, 1770, 1789, 1766, 1769, 1782, 1744, 1770, 1761, 1787, 1789, 1782, 30224, -31019, -26122, -30533, 560, 627, 557, 619, 550, 3038, 3027, 3034, 3023, 3061, 3011, 3022, 479, 474, 478, 474, 455, 2412, 2430, 2430, 2416, 2423, 2402, 2372, 2409, 2426, 2421, 2416, 2418, 2421, 2428, 2408, 1543, 1536, 1551, 1554, 1545, 1556, 1598, 1559, 1540, 1555, 1544, 1543, 1560, 1598, 1540, 1551, 1557, 1555, 1560, 2803, 2804, 2811, 2790, 2813, 2784, 2762, 2787, 2800, 2791, 2812, 2803, 2796, 1402, 1405, 1394, 1391, 1396, 1385, 1347, 1396, 1401, 1392, 1388, 30249, -30996, 27430, 24806, 25678, 20962, 25705, -28146, 31789, 599, 528, 527, 1961, 1968, 1979, 1920, 1974, 1979, 2097, 2093, 2103, 2096, 2081, 2087, 3105, 3124, 3117, 3127, 3115, 3104, 3105, 3099, 3117, 3114, 3104, 3105, 3132, 3268, 3281, 3272, 3282, 3278, 3269, 3268, 3326, 3272, 3269, 1092, 1117, 1110, 1133, 1116, 1107, 1119, 1111, 28722, -32521, 25077, 24678, 21096, 21016, -29509, 25288, 23657, -30595, 32162, -29337, 27749, 28150, 24783, -31986, 27944, 28032, 2922, 2925, 2914, 2943, 2916, 2937, 2899, 2938, 2921, 2942, 2917, 2922, 2933, 2899, 2921, 2914, 2936, 2942, 2933, 3106, 3109, 3114, 3127, 3116, 3121, 3099, 3122, 3105, 3126, 3117, 3106, 3133, 2230, 2225, 2238, 2211, 2232, 2213, 2191, 2232, 2229, 2236, 2208, 1469, 1466, 1461, 1448, 1459, 1454, 1412, 1453, 1470, 1449, 1458, 1469, 1442, 527, 520, 519, 538, 513, 540, 566, 513, 524, 517, 537, 2499, 2500, 2507, 2518, 2509, 2512, 2554, 2515, 2496, 2519, 2508, 2499, 2524, 2554, 2496, 2507, 2513, 2519, 2524, 23417, -25593, -29366, -28536, -32315, 21301, -30943, 25258, -24820, -29119, 1281, 1430, 1281, 26474, 22409, 24237, 26417, 24893, 30723, -24659, -28960, 26386, 32300, -26238, -30513, 1836, 1835, 1828, 1849, 1826, 1855, 1813, 1852, 1839, 1848, 1827, 1836, 1843, 1541, 1538, 1549, 1552, 1547, 1558, 1596, 1557, 1542, 1553, 1546, 1541, 1562, -26886, -30793, 29815, 17194, 31070, 15479, -31771, 23827, 27087, 21369, 22778, -26886, -30793, 32448, 27767, 1208, 1215, 1200, 1197, 1206, 1195, 1153, 1206, 1211, 1202, 1198, 640, 647, 648, 661, 654, 659, 697, 654, 643, 650, 662, -26921, -30822, 29786, 21109, 24306, 2141, 2130, 2143, 2125, 2125, 3248, 3244, 3240, 3259, 2184, 2196, 2185, 2191, 2958, 282, 262, 262, 258, 1534, 1497, 1494, 1515, 1488, 1485, 1432, 1501, 1494, 1499, 1482, 1473, 1480, 1484, 1501, 1500, 1432, 1501, 1472, 1484, 1432, 1499, 1495, 1494, 1484, 1497, 1489, 1494, 1483, 1432, 1497, 1494, 1432, 1489, 1494, 1486, 1497, 1492, 1489, 1500, 1432, 1498, 1482, 1489, 1500, 1503, 1501, 1432, 1517, 1514, 1524, 299, 268, 259, 318, 261, 280, 333, 264, 259, 270, 287, 276, 285, 281, 264, 265, 333, 264, 277, 281, 333, 287, 264, 284, 280, 260, 287, 264, 286, 333, 268, 333, 271, 287, 260, 265, 266, 264, 333, 312, 319, 289, 2343, 2304, 2319, 2354, 2313, 2324, 2369, 2308, 2329, 2325, 2369, 2309, 2308, 2306, 2323, 2328, 2321, 2325, 2369, 2311, 2304, 2312, 2317, 2308, 2309, 22095, -26673, 2507, 2505, 2520, 2524, 2507, 2496, 2505, 1629, 1622, 1631, 1618, 1618, 1627, 1616, 1625, 1627, -27946, -31845, 28763, 599, 460, 1000, 26835, 26944, 1165, 1172, 1183, 1188, 1170, 1183, 1858, 1886, 1860, 1859, 1874, 1876, 1509, 1520, 1513, 1523, 1519, 1508, 1509, 1503, 1513, 1518, 1508, 1509, 1528, 2595, 2614, 2607, 2613, 2601, 2594, 2595, 2585, 2607, 2594, 2161, 2152, 2147, 2136, 2153, 2150, 2154, 2146, 1995, 1932, 1939, 2394, 3092, 1389, 1389, 1389, 1925, 1945, 1940, 1932, 1930, 1942, 1940, 1925, 1921, 1942, 1949, 1940, 1930, 1927, 1936, 1924, 1920, 1948, 1927, 1936, 1937, 2164, 2166, 2151, 2147, 2164, 2175, 2166, 2120, 2149, 2162, 2150, 2146, 2174, 2149, 2162, 2163, 1842, 1840, 1831, 1850, 1852, 1853, 3013, 3015, 3026, 3011, 3009, 3017, 3028, 3039, 3045, 3017, 3016, 3026, 3011, 3016, 3026, 2108, 2109, 2092, 2105, 2097, 2100, 2075, 2103, 2102, 2092, 2109, 2102, 2092, 1126, 1121, 1134, 1139, 1128, 1141, 1119, 1139, 1125, 1121, 1138, 1123, 1128, 1119, 1142, 1125, 1138, 1129, 1126, 1145, 1119, 1142, 1073, 3306, 3309, 3320, 3309, 3324, 277, 262, 273, 266, 261, 266, 262, 263, 1975, 1956, 1971, 1960, 1959, 1960, 1956, 1957, 1950, 1952, 1973, 1173, 1161, 1156, 1180, 1159, 1156, 1158, 1166, 1210, 1158, 1156, 1173, 1169, 1158, 1165, 1156, 24394, 20846, 28464, 26133, 26502, -26572, -30343, -26944, -30835, 29773, 24187, 27132, 26477, 26940, -31861, 21846, -3264, -30789, 30273, 22594, -25215, -30823, 1641, 1646, 1644, 1636, 1602, 1646, 1647, 1653, 1636, 1647, 1653, 907, 908, 910, 902, 949, 906, 903, 902, 908, 928, 908, 909, 919, 902, 909, 919, 1970, 2001, 1926, 1921, 1951, 2001, 689, 754, 739, 762, 689, 1789, 1725, 1709, 1718, 1723, 1720, 1722, 1789, 2793, 2734, 2725, 2735, 2747, 2724, 2722, 2725, 2751, 2744, 2793, 2262, 2257, 2244, 2257, 2240, 3156, 3155, 3164, 3137, 3162, 3143, 3181, 3137, 3159, 3155, 3136, 3153, 3162, 3181, 3140, 3159, 3136, 3163, 3156, 3147, 3181, 3140, 3075, 1316, 1335, 1312, 1339, 1332, 1339, 1335, 1334, 2417, 2402, 2421, 2414, 2401, 2414, 2402, 2403, 2392, 2406, 2419, 723, 719, 706, 730, 710, 721, 736, 716, 717, 727, 710, 717, 727, 1984, 2006, 2002, 1985, 2000, 2011, 2032, 2012, 2013, 1991, 2006, 2013, 1991, 1880, 1870, 1866, 1881, 1864, 1859, 1896, 1860, 1861, 1887, 1870, 1861, 1887};
    public final CaptchaPrompter a;
    public final boolean b;
    public volatile T c;
    public volatile List d;
    public volatile boolean e;
    public volatile int f;
    public volatile long g;
    public final Object h;

    public interface CaptchaPrompter {
        Y3 prompt(K k);

        Y3 prompt(byte[] bArr);
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        List<L> listF = f();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (L l : listF) {
            String strValueOf = String.valueOf(l.a);
            arrayList.add(new com.github.catvod.spider.merge.p001b.b(strValueOf, l.b, null));
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                List list = l.c;
                if (!list.isEmpty()) {
                    arrayList2.add(new com.github.catvod.spider.merge.p001b.d("class", "分类", c(list)));
                }
                List list2 = l.d;
                if (!list2.isEmpty()) {
                    arrayList2.add(new com.github.catvod.spider.merge.p001b.d("year", "年份", c(list2)));
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new com.github.catvod.spider.merge.p001b.c("全部", ""));
                arrayList3.add(new com.github.catvod.spider.merge.p001b.c("最新", "latest"));
                arrayList3.add(new com.github.catvod.spider.merge.p001b.c("最热", "hot"));
                arrayList2.add(new com.github.catvod.spider.merge.p001b.d("sort", "排序", arrayList3));
                linkedHashMap.put(strValueOf, arrayList2);
            }
        }
        com.github.catvod.spider.merge.D.b.z("fanshu_verify_entry", "番薯验证", null, arrayList);
        return com.github.catvod.spider.merge.p001b.g.v(arrayList, linkedHashMap);
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        return str != null && (str.toLowerCase(Locale.US).contains(".m3u8") || AbstractC0309x1.j(str));
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        if (!d(this.c)) {
            return b(1);
        }
        try {
            T t = this.c;
            List listF = f();
            int i = listF.isEmpty() ? 0 : ((L) listF.get(0)).a;
            t.getClass();
            O oM = T.m(t.c("weekly_rankings", T.k("type_id", Integer.valueOf(i), "limit", 15)));
            return oM.f ? b(1) : j(oM, 1);
        } catch (Exception unused) {
            return b(1);
        }
    }

    private /* synthetic */ boolean $host$53940b53855fde82() {
        return true;
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        String strTrim;
        int iMax;
        String str3 = str;
        if (str2 == null) {
            strTrim = "";
        } else {
            try {
                strTrim = str2.trim();
            } catch (Exception unused) {
                iMax = 1;
            }
        }
        iMax = Math.max(1, Integer.parseInt(strTrim));
        if (!d(this.c) || this.f != 1) {
            return b(iMax);
        }
        try {
            T t = this.c;
            if (str3 == null) {
                str3 = "";
            }
            O oS = t.s(iMax, str3);
            if (!oS.f) {
                return j(oS, iMax);
            }
            this.f = 0;
            this.g = 0L;
            g();
            return b(iMax);
        } catch (J e) {
            if (e(e)) {
                this.f = 0;
                this.g = 0L;
                g();
            }
            return b(iMax);
        } catch (Exception unused2) {
            return b(iMax);
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        C0241a1 c0241a1;
        if ("fanshu_verify_entry".equals(str2) || "fanshu_verify".equals(str2) || "fanshu_help".equals(str2)) {
            action(str2);
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C("");
            return gVar.r();
        }
        if (!d(this.c)) {
            return com.github.catvod.spider.merge.p001b.g.d("番薯桥接服务未配置");
        }
        if (TextUtils.isEmpty(str2)) {
            c0241a1 = null;
        } else {
            String strTrim = str2.trim();
            if (strTrim.startsWith("v1.")) {
                strTrim = strTrim.substring(3);
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(T.h(strTrim), StandardCharsets.UTF_8));
                String strOptString = jSONObject.optString("vod_id");
                String strOptString2 = jSONObject.optString("source");
                int iOptInt = jSONObject.optInt("episode_index", 0);
                String strOptString3 = jSONObject.optString("episode_id");
                jSONObject.optString("vod_name");
                c0241a1 = new C0241a1(iOptInt, strOptString, strOptString2, strOptString3);
            } catch (Exception unused) {
                c0241a1 = null;
            }
        }
        if (c0241a1 == null || TextUtils.isEmpty((String) c0241a1.b) || TextUtils.isEmpty((String) c0241a1.c)) {
            return com.github.catvod.spider.merge.p001b.g.d("番薯播放标识无效");
        }
        try {
            com.github.catvod.spider.merge.S.e eVarH = h(c0241a1);
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.q(eVarH.a);
            gVar2.C((String) eVarH.c);
            gVar2.h((Map) eVarH.d);
            String strI = AbstractC0280n1.i(str, str2, null, null);
            if (!TextUtils.isEmpty(strI)) {
                gVar2.b(strI);
            }
            if (eVarH.b) {
                gVar2.k();
            }
            return gVar2.r();
        } catch (Exception e) {
            return com.github.catvod.spider.merge.p001b.g.d(TextUtils.isEmpty(e.getMessage()) ? "番薯播放地址解析失败" : e.getMessage());
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(list.get(0))) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        String strTrim = list.get(0).trim();
        if ("fanshu_verify_entry".equals(strTrim) || "fanshu_verify".equals(strTrim) || "fanshu_help".equals(strTrim)) {
            AbstractC0302v0.g0(strTrim, new i(6, this));
            return "";
        }
        if (!d(this.c)) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        try {
            k kVarK = k(this.c.y(strTrim), strTrim);
            if (TextUtils.isEmpty(kVarK.b())) {
                return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
            }
            AbstractC0280n1.o(kVarK);
            FishCrypto.c(kVarK);
            return com.github.catvod.spider.merge.p001b.g.s(kVarK);
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        if ("fanshu_verify".equals(str)) {
            InitOrigin.execute(new RunnableC0341a(4, this));
            return "";
        }
        if (!"fanshu_help".equals(str)) {
            return "";
        }
        InitOrigin.run(new RunnableC0452d(6));
        return "";
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String strTrim;
        int iMax;
        int iMax2;
        String strM210;
        String strTrim2 = "";
        if (str2 == null) {
            strTrim = "";
        } else {
            try {
                strTrim = str2.trim();
            } catch (Exception unused) {
                iMax = 1;
            }
        }
        iMax = Math.max(1, Integer.parseInt(strTrim));
        if ("fanshu_verify_entry".equals(str)) {
            if (iMax != 1) {
                return b(iMax);
            }
            ArrayList arrayList = new ArrayList();
            String strY0 = AbstractC0302v0.y0();
            StringBuilder sb = new StringBuilder();
            if (this.f == 1) {
                strM210 = "已验证";
            } else {
                strM210 = this.f == -1 ? "验证失败" : "未验证";
            }
            arrayList.add(new k("fanshu_verify", "搜索验证", strY0, com.github.catvod.spider.merge.D.b.m(sb, strM210, " · 手动完成搜索验证"), "fanshu_verify"));
            arrayList.add(new k("fanshu_help", "验证码帮助", AbstractC0302v0.a0(), "验证码作用、输入方式和验证状态", "fanshu_help"));
            return AbstractC0449a.c(1, 1, arrayList.size(), arrayList.size(), arrayList);
        }
        if (str != null) {
            try {
                strTrim2 = str.trim();
            } catch (Exception unused2) {
                iMax2 = 0;
            }
        }
        iMax2 = Math.max(0, Integer.parseInt(strTrim2));
        if (iMax2 <= 0) {
            return b(iMax);
        }
        if (iMax2 <= 0 || !d(this.c)) {
            return b(iMax);
        }
        try {
            O oE = this.c.e(iMax2, iMax, l("class", map), l("year", map), l("sort", map));
            return oE.f ? b(iMax) : j(oE, iMax);
        } catch (Exception unused3) {
            return b(iMax);
        }
    }

    public FanShu() {
        this(null, null);
    }

    public FanShu(T t, CaptchaPrompter captchaPrompter) {
        CaptchaPrompter captchaPrompter2 = captchaPrompter;
        T t2 = t;
        this.d = Collections.emptyList();
        this.f = 0;
        this.h = new Object();
        this.b = t2 != null;
        this.c = t2 == null ? new T() : t2;
        this.a = captchaPrompter2 == null ? new C0359j(7) : captchaPrompter2;
    }

    public static String a(String str) throws Throwable {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            return strTrim;
        }
        if (strTrim.startsWith("{") || strTrim.startsWith("http")) {
            try {
                String strG = FishCrypto.g(strTrim);
                return !TextUtils.isEmpty(strG) ? strG.trim() : strTrim;
            } catch (Throwable unused) {
                return strTrim;
            }
        }
        String strG2 = FishCrypto.g(strTrim);
        if (TextUtils.isEmpty(strG2)) {
            throw new IllegalArgumentException("FanShu ext decrypt failed");
        }
        ArrayList arrayList = (ArrayList) T.i(strG2).b;
        if (Collections.unmodifiableList(arrayList).isEmpty()) {
            throw new IllegalArgumentException("FanShu encrypted ext requires a bridge URL");
        }
        Iterator it = Collections.unmodifiableList(arrayList).iterator();
        while (it.hasNext()) {
            if (HttpUrl.parse((String) it.next()) == null) {
                throw new IllegalArgumentException("FanShu encrypted ext contains an invalid bridge URL");
            }
        }
        return strG2.trim();
    }

    public static String b(int i) {
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.F(Collections.emptyList());
        gVar.o(i, Math.max(1, 1), 12, 0);
        return gVar.r();
    }

    public static ArrayList c(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM21 = "全部";
        linkedHashMap.put("", strM21);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String strTrim = str == null ? "" : str.trim();
                if (!strTrim.isEmpty() && !strM21.equals(strTrim)) {
                    linkedHashMap.put(strTrim, strTrim);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new com.github.catvod.spider.merge.p001b.c((String) entry.getValue(), (String) entry.getKey()));
        }
        return arrayList;
    }

    public static boolean d(T t) {
        return t != null && (Collections.unmodifiableList((ArrayList) t.b.b).isEmpty() ^ true);
    }

    public static boolean e(J j) {
        String lowerCase = j.a.toLowerCase(Locale.US);
        return lowerCase.contains("captcha") || lowerCase.contains("challenge") || lowerCase.contains("验证码");
    }

    public static String i(String str) {
        String strK = str != null ? com.github.catvod.spider.merge.D.b.k(str, "#", " ", "$", "") : "";
        return TextUtils.isEmpty(strK) ? "播放" : strK;
    }

    public static String j(O o, int i) {
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        List<S> list = o.e;
        if (list != null) {
            for (S s : list) {
                if (s != null) {
                    String str = s.a;
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = s.b;
                        if (!TextUtils.isEmpty(str2)) {
                            arrayList.add(new k(str, str2, s.c, s.d));
                        }
                    }
                }
            }
        }
        int i3 = o.a;
        if (i3 > 0) {
            i2 = i3;
        }
        return AbstractC0449a.c(i2, Math.max(1, o.b), Math.max(1, o.c), Math.max(arrayList.size(), o.d), arrayList);
    }

    public static k k(Q q, String str) {
        String strEncodeToString;
        k kVar = new k();
        String str2 = q.a;
        if (TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        kVar.n(str2);
        kVar.o(q.b);
        kVar.p(q.c);
        kVar.u(q.d);
        kVar.k(q.e);
        kVar.i(q.f);
        kVar.s(q.g);
        kVar.j(q.h);
        kVar.m(q.i);
        kVar.l(q.j);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (P p : q.k) {
            if (p != null) {
                List<M> list = p.c;
                if (!list.isEmpty()) {
                    String str3 = p.a;
                    boolean zIsEmpty = TextUtils.isEmpty(str3);
                    String str4 = p.b;
                    if (zIsEmpty) {
                        str3 = str4;
                    }
                    String strI = i(str3);
                    if (TextUtils.isEmpty(str4)) {
                        str4 = strI;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (M m : list) {
                        if (m != null) {
                            try {
                                strEncodeToString = Base64.encodeToString(new JSONObject().put("vod_id", T.f(kVar.b())).put("source", T.f(str4)).put("episode_index", Math.max(0, Math.max(0, m.c))).put("episode_id", T.f(m.a)).put("vod_name", T.f(kVar.c())).toString().getBytes(StandardCharsets.UTF_8), 11);
                            } catch (JSONException unused) {
                                strEncodeToString = "";
                            }
                            String strB = TextUtils.isEmpty(strEncodeToString) ? "" : com.github.catvod.spider.merge.D.b.B("v1.", strEncodeToString);
                            if (!TextUtils.isEmpty(strB)) {
                                arrayList3.add(i(m.b) + "$" + strB);
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(strI);
                        arrayList2.add(TextUtils.join("#", arrayList3));
                    }
                }
            }
        }
        String strM360 = "$$$";
        kVar.q(TextUtils.join(strM360, arrayList));
        kVar.r(TextUtils.join(strM360, arrayList2));
        return kVar;
    }

    public static String l(String str, Map map) {
        return (map == null || map.get(str) == null) ? "" : ((String) map.get(str)).trim();
    }

    public static boolean requiresPlaybackCaptcha(String str) {
        return "PLAY_CAPTCHA_REQUIRED".equalsIgnoreCase(str) || "captcha_required".equalsIgnoreCase(str);
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "action");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$b5d914d976e0069f = $host$b5d914d976e0069f(str);
            FishCrypto.endHostEntry(null);
            return str$host$b5d914d976e0069f;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
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

    public final List f() {
        if (this.e) {
            return this.d;
        }
        synchronized (this) {
            if (!this.e) {
                List listEmptyList = Collections.emptyList();
                if (d(this.c)) {
                    try {
                        listEmptyList = this.c.j();
                    } catch (Exception unused) {
                    }
                }
                if (listEmptyList == null) {
                    listEmptyList = Collections.emptyList();
                }
                this.d = listEmptyList;
                this.e = (this.d.isEmpty() && d(this.c)) ? false : true;
            }
        }
        return this.d;
    }

    public final void g() {
        try {
            String strM408 = "fanshu_search_verify_v1";
            JSONObject jSONObjectPut = new JSONObject().put("state", this.f);
            String strM277 = "verified";
            boolean z = true;
            if (this.f != 1) {
                z = false;
            }
            String string = jSONObjectPut.put(strM277, z).put("verified_at", this.g).toString();
            boolean z2 = FishCrypto.a;
            C0297t1.j(strM408, string);
        } catch (Throwable unused) {
        }
    }

    public final com.github.catvod.spider.merge.S.e h(C0241a1 c0241a1) {
        int i;
        com.github.catvod.spider.merge.S.e eVarZ;
        synchronized (this.h) {
            try {
                try {
                    eVarZ = this.c.z((String) c0241a1.b, (String) c0241a1.c, c0241a1.a, (String) c0241a1.d, null);
                } catch (J e) {
                    if (!requiresPlaybackCaptcha(e.a)) {
                        throw e;
                    }
                    for (int i2 = 0; i2 < 8; i2++) {
                        T t = this.c;
                        t.getClass();
                        Y3 y3Prompt = this.a.prompt(t.d(t.c("playback_captcha", new JSONObject())));
                        if (y3Prompt == null || (i = y3Prompt.a) == 3) {
                            throw new IOException("已取消播放验证");
                        }
                        if (i != 2) {
                            return this.c.z((String) c0241a1.b, (String) c0241a1.c, c0241a1.a, (String) c0241a1.d, new JSONObject(y3Prompt.b));
                        }
                    }
                    throw new IOException("验证码刷新次数过多，请稍后重试");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVarZ;
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

    public String homeVideoContent() {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "homeVideoContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$4a0a5542814a3609 = $host$4a0a5542814a3609();
            FishCrypto.endHostEntry(null);
            return str$host$4a0a5542814a3609;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
    public void init(Context context, String str) throws Throwable {
        super.init(context, str);
        Init.init(context);
        int iOptInt = 0;
        try {
            String strA = a(str);
            if (!this.b || !d(this.c)) {
                this.c.g(T.i(strA));
            } else if (!TextUtils.isEmpty(strA) && strA.trim().startsWith("{")) {
                String lowerCase = strA.toLowerCase(Locale.US);
                if (lowerCase.contains("\"url\"") || lowerCase.contains("\"api\"") || lowerCase.contains("\"bridge\"") || lowerCase.contains("\"endpoints\"")) {
                    this.c.g(T.i(strA));
                }
            }
            this.d = Collections.emptyList();
            this.e = false;
            String strM314 = "state";
            this.f = 0;
            this.g = 0L;
            try {
                String strM292 = "fanshu_search_verify_v1";
                boolean z = FishCrypto.a;
                String strH = C0297t1.h(strM292);
                if (TextUtils.isEmpty(strH)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(strH);
                if (jSONObject.has(strM314)) {
                    iOptInt = jSONObject.optInt(strM314, 0);
                } else if (jSONObject.optBoolean("verified", false)) {
                    iOptInt = 1;
                }
                if (iOptInt == 1 || iOptInt == -1) {
                    this.f = iOptInt;
                    this.g = jSONObject.optLong("verified_at", 0L);
                }
            } catch (Throwable unused) {
            }
        } catch (RuntimeException e) {
            this.c.g(new C0261h0(3));
            this.d = Collections.emptyList();
            this.e = false;
            throw e;
        }
    }

    public boolean isVideoFormat(String str) {
        if (FishCrypto.businessReady()) {
            return $host$42ceaa68a95df632(str);
        }
        return false;
    }

    public boolean manualVideoCheck() {
        if (FishCrypto.businessReady()) {
            return $host$53940b53855fde82();
        }
        return false;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "playerContent");
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

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
        return searchContent(str, z, C0009.m33(f31short, 0, 1, 1336));
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
                    arrayList2.add(new com.github.catvod.spider.merge.p001b.d(C0106.m422(f31short, 1, 5, 1624), C0045.m177(f31short, 6, 2, 979), c(list)));
                }
                List list2 = l.d;
                if (!list2.isEmpty()) {
                    arrayList2.add(new com.github.catvod.spider.merge.p001b.d(C0093.m368(f31short, 8, 4, 1599), C0087.m346(f31short, 12, 2, 474), c(list2)));
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new com.github.catvod.spider.merge.p001b.c(C0063.m249(f31short, 14, 2, 3218), ""));
                arrayList3.add(new com.github.catvod.spider.merge.p001b.c(C0117.m467(f31short, 16, 2, 1274), C0090.m358(f31short, 18, 6, 3081)));
                arrayList3.add(new com.github.catvod.spider.merge.p001b.c(C0115.m459(f31short, 24, 2, 2176), C0096.m382(f31short, 26, 3, 2468)));
                arrayList2.add(new com.github.catvod.spider.merge.p001b.d(C0019.m75(f31short, 29, 4, 2788), C0055.m219(f31short, 33, 2, 3004), arrayList3));
                linkedHashMap.put(strValueOf, arrayList2);
            }
        }
        com.github.catvod.spider.merge.D.b.z(C0137.m545(f31short, 35, 19, 1679), C0043.m169(f31short, 54, 4, 890), null, arrayList);
        return com.github.catvod.spider.merge.p001b.g.v(arrayList, linkedHashMap);
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        return str != null && (str.toLowerCase(Locale.US).contains(C0114.m454(f31short, 58, 5, 542)) || AbstractC0309x1.j(str));
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
            O oM = T.m(t.c(C0097.m386(f31short, 75, 15, 2331), T.k(C0095.m379(f31short, 63, 7, 2986), Integer.valueOf(i), C0074.m292(f31short, 70, 5, 435), 15)));
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
        if (C0093.m368(f31short, 90, 19, 1633).equals(str2) || C0125.m499(f31short, 109, 13, 2709).equals(str2) || C0014.m54(f31short, 122, 11, 1308).equals(str2)) {
            action(str2);
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C("");
            return gVar.r();
        }
        if (!d(this.c)) {
            return com.github.catvod.spider.merge.p001b.g.d(C0133.m529(f31short, 133, 9, 835));
        }
        if (TextUtils.isEmpty(str2)) {
            c0241a1 = null;
        } else {
            String strTrim = str2.trim();
            if (strTrim.startsWith(C0092.m365(f31short, 142, 3, 545))) {
                strTrim = strTrim.substring(3);
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(T.h(strTrim), StandardCharsets.UTF_8));
                String strOptString = jSONObject.optString(C0089.m355(f31short, 145, 6, 2015));
                String strOptString2 = jSONObject.optString(C0098.m390(f31short, 151, 6, 2114));
                int iOptInt = jSONObject.optInt(C0072.m285(f31short, 157, 13, 3140), 0);
                String strOptString3 = jSONObject.optString(C0055.m219(f31short, 170, 10, 3233));
                jSONObject.optString(C0105.m416(f31short, 180, 8, 1074));
                c0241a1 = new C0241a1(iOptInt, strOptString, strOptString2, strOptString3);
            } catch (Exception unused) {
                c0241a1 = null;
            }
        }
        if (c0241a1 == null || TextUtils.isEmpty((String) c0241a1.b) || TextUtils.isEmpty((String) c0241a1.c)) {
            return com.github.catvod.spider.merge.p001b.g.d(C0095.m379(f31short, 198, 8, 2248));
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
            return com.github.catvod.spider.merge.p001b.g.d(TextUtils.isEmpty(e.getMessage()) ? C0139.m554(f31short, 188, 10, 1368) : e.getMessage());
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(list.get(0))) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        String strTrim = list.get(0).trim();
        if (C0096.m382(f31short, 206, 19, 2828).equals(strTrim) || C0142.m567(f31short, 225, 13, 3140).equals(strTrim) || C0103.m408(f31short, 238, 11, 2256).equals(strTrim)) {
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
        if (C0021.m83(f31short, 249, 13, 1499).equals(str)) {
            InitOrigin.execute(new RunnableC0341a(4, this));
            return "";
        }
        if (!C0104.m414(f31short, 262, 11, 617).equals(str)) {
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
        if (C0011.m42(f31short, 273, 19, 2469).equals(str)) {
            if (iMax != 1) {
                return b(iMax);
            }
            ArrayList arrayList = new ArrayList();
            String strY0 = AbstractC0302v0.y0();
            StringBuilder sb = new StringBuilder();
            if (this.f == 1) {
                strM210 = C0112.m445(f31short, 292, 3, 1675);
            } else {
                strM210 = this.f == -1 ? C0053.m210(f31short, 295, 4, 2564) : C0114.m454(f31short, 299, 3, 1408);
            }
            arrayList.add(new k(C0104.m414(f31short, 330, 13, 1635), C0103.m408(f31short, 313, 4, 782), strY0, com.github.catvod.spider.merge.D.b.m(sb, strM210, C0118.m471(f31short, 302, 11, 1313)), C0133.m529(f31short, 317, 13, 1866)));
            arrayList.add(new k(C0130.m516(f31short, 369, 11, 742), C0097.m386(f31short, 380, 5, 3163), AbstractC0302v0.a0(), C0114.m454(f31short, 343, 15, 3190), C0137.m545(f31short, 358, 11, 1246)));
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
            O oE = this.c.e(iMax2, iMax, l(C0098.m390(f31short, 385, 5, 2110), map), l(C0063.m249(f31short, 390, 4, 3273), map), l(C0125.m499(f31short, 394, 4, 2299), map));
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
        if (strTrim.startsWith(C0063.m249(f31short, 398, 1, 3061)) || strTrim.startsWith(C0074.m292(f31short, 399, 4, 370))) {
            try {
                String strG = FishCrypto.g(strTrim);
                return !TextUtils.isEmpty(strG) ? strG.trim() : strTrim;
            } catch (Throwable unused) {
                return strTrim;
            }
        }
        String strG2 = FishCrypto.g(strTrim);
        if (TextUtils.isEmpty(strG2)) {
            throw new IllegalArgumentException(C0116.m463(f31short, 496, 25, 2401));
        }
        ArrayList arrayList = (ArrayList) T.i(strG2).b;
        if (Collections.unmodifiableList(arrayList).isEmpty()) {
            throw new IllegalArgumentException(C0137.m545(f31short, 454, 42, 365));
        }
        Iterator it = Collections.unmodifiableList(arrayList).iterator();
        while (it.hasNext()) {
            if (HttpUrl.parse((String) it.next()) == null) {
                throw new IllegalArgumentException(C0072.m285(f31short, 403, 51, 1464));
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
        String strM21 = C0006.m21(f31short, 521, 2, 1831);
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
        return lowerCase.contains(C0128.m511(f31short, 523, 7, 2472)) || lowerCase.contains(C0119.m473(f31short, 530, 9, 1598)) || lowerCase.contains(C0049.m193(f31short, 539, 3, 2138));
    }

    public static String i(String str) {
        String strK = str != null ? com.github.catvod.spider.merge.D.b.k(str, C0097.m386(f31short, 542, 1, 628), C0092.m365(f31short, 543, 1, 492), C0115.m459(f31short, 544, 1, 972), "") : "";
        return TextUtils.isEmpty(strK) ? C0014.m54(f31short, 545, 2, 3198) : strK;
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
                                strEncodeToString = Base64.encodeToString(new JSONObject().put(C0105.m416(f31short, 547, 6, 1275), T.f(kVar.b())).put(C0092.m365(f31short, 553, 6, 1841), T.f(str4)).put(C0045.m177(f31short, 559, 13, 1408), Math.max(0, Math.max(0, m.c))).put(C0112.m445(f31short, 572, 10, 2630), T.f(m.a)).put(C0009.m33(f31short, 582, 8, 2055), T.f(kVar.c())).toString().getBytes(StandardCharsets.UTF_8), 11);
                            } catch (JSONException unused) {
                                strEncodeToString = "";
                            }
                            String strB = TextUtils.isEmpty(strEncodeToString) ? "" : com.github.catvod.spider.merge.D.b.B(C0118.m471(f31short, 590, 3, 1981), strEncodeToString);
                            if (!TextUtils.isEmpty(strB)) {
                                arrayList3.add(i(m.b) + C0140.m558(f31short, 593, 1, 2430) + strB);
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(strI);
                        arrayList2.add(TextUtils.join(C0140.m558(f31short, 594, 1, 3127), arrayList3));
                    }
                }
            }
        }
        String strM360 = C0091.m360(f31short, 595, 3, 1353);
        kVar.q(TextUtils.join(strM360, arrayList));
        kVar.r(TextUtils.join(strM360, arrayList2));
        return kVar;
    }

    public static String l(String str, Map map) {
        return (map == null || map.get(str) == null) ? "" : ((String) map.get(str)).trim();
    }

    public static boolean requiresPlaybackCaptcha(String str) {
        return C0137.m545(f31short, 598, 21, 2005).equalsIgnoreCase(str) || C0072.m285(f31short, 619, 16, 2071).equalsIgnoreCase(str);
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0050.m199(f31short, 635, 6, 1875));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0046.m182(f31short, 641, 15, 2982));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0079.m314(f31short, 656, 13, 2136));
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
            String strM408 = C0103.m408(f31short, 669, 23, 1024);
            JSONObject jSONObjectPut = new JSONObject().put(C0076.m301(f31short, 692, 5, 3225), this.f);
            String strM277 = C0070.m277(f31short, 697, 8, 355);
            boolean z = true;
            if (this.f != 1) {
                z = false;
            }
            String string = jSONObjectPut.put(strM277, z).put(C0139.m554(f31short, 705, 11, 1985), this.g).toString();
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
                        Y3 y3Prompt = this.a.prompt(t.d(t.c(C0008.m31(f31short, 716, 16, 1253), new JSONObject())));
                        if (y3Prompt == null || (i = y3Prompt.a) == 3) {
                            throw new IOException(C0096.m382(f31short, 732, 7, 696));
                        }
                        if (i != 2) {
                            return this.c.z((String) c0241a1.b, (String) c0241a1.c, c0241a1.a, (String) c0241a1.d, new JSONObject(y3Prompt.b));
                        }
                    }
                    throw new IOException(C0115.m459(f31short, 739, 15, 3148));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVarZ;
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0101.m402(f31short, 754, 11, 1537));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0092.m365(f31short, 765, 16, 995));
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
            } else if (!TextUtils.isEmpty(strA) && strA.trim().startsWith(C0019.m75(f31short, 781, 1, 1993))) {
                String lowerCase = strA.toLowerCase(Locale.US);
                if (lowerCase.contains(C0142.m567(f31short, 782, 5, 2035)) || lowerCase.contains(C0090.m358(f31short, 787, 5, 659)) || lowerCase.contains(C0081.m322(f31short, 792, 8, 1759)) || lowerCase.contains(C0056.m223(f31short, 800, 11, 2763))) {
                    this.c.g(T.i(strA));
                }
            }
            this.d = Collections.emptyList();
            this.e = false;
            String strM314 = C0079.m314(f31short, 811, 5, 2213);
            this.f = 0;
            this.g = 0L;
            try {
                String strM292 = C0074.m292(f31short, 816, 23, 3122);
                boolean z = FishCrypto.a;
                String strH = C0297t1.h(strM292);
                if (TextUtils.isEmpty(strH)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(strH);
                if (jSONObject.has(strM314)) {
                    iOptInt = jSONObject.optInt(strM314, 0);
                } else if (jSONObject.optBoolean(C0091.m360(f31short, 839, 8, 1362), false)) {
                    iOptInt = 1;
                }
                if (iOptInt == 1 || iOptInt == -1) {
                    this.f = iOptInt;
                    this.g = jSONObject.optLong(C0096.m382(f31short, 847, 11, 2311), 0L);
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0087.m346(f31short, 858, 13, 675));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0105.m416(f31short, 871, 13, 1971));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0049.m193(f31short, 884, 13, 1835));
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

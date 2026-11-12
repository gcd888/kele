package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0260h;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0257g;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Qiwei extends Cloud {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f83short = {2784, 2726, 2721, 2731, 2730, 2743, 2785, 2751, 2727, 2751, 2784, 2734, 2725, 2734, 2743, 2784, 2748, 2746, 2728, 2728, 2730, 2748, 2747, 2800, 2722, 2726, 2731, 2802, 2814, 2793, 2723, 2726, 2722, 2726, 2747, 2802, 2813, 2815, 2793, 2744, 2731, 2802, 1390, 1391, 1405, 1302, 1283, 2054, 2425, 2382, 2381, 2382, 2393, 2382, 2393, 1120, 1125, 1151, 1144, 645, 648, 2206, 2193, 2205, 2197, 262, 287, 277, 854, 788, 783, 854, 2682, 2620, 2592, 2617, 2616, 2408, 2403, 3039, 31112, 21452, 2398, 22025, -27992, 2242, 30650, -29892, 1867, 21689, 26938, 1043, 1040, 28877, 21831, 2235, 2210, 2272, 2221, 2209, 2208, 2234, 2219, 2208, 2234, 2275, 2210, 2215, 2237, 2234, 2286, 2210, 2215, 3230, 3292, 3289, 3229, 3289, 3293, 3287, 3216, 3281, 445, 423, 432, 435, 2063, 2059, 2049, 262, 267, 275, 2597, 2596, 2613, 514, 590, 579, 600, 600, 579, 577, 542, 24567, 24284, 3188, 3139, 3136, 3139, 3156, 3139, 3156, 1925, 1938, 1921, 1967, 1920, 2008, 1923, 1951, 1938, 1930, 1942, 1921, 1964, 1938, 1938, 1938, 1938, 1967, 1920, 2009, 1998, 1967, 1920, 2009, 2011, 1967, 1928, 2013, 2009, 1996, 1967, 1934, 2010, 1967, 1920, 2009, 1992, 1996, 1967, 1920, 2009, 1999, 2012, 1920, 1936, 1921, 1946, 1923, 1927, 1997, 3119, 3112, 3126, 1444, 1511, 1515, 1507, 1508, 1447, 1535, 1507, 1447, 1511, 1519, 1534, 1515, 1450, 1507, 1511, 1517, 1446, 1450, 1444, 1507, 1511, 1517, 1450, 1507, 1511, 1517, 2793, 2792, 2809, 1909, 1836, 410, 494, 410, 418, 445, 498, 443, 410, 495, 482, 2716, 2719, 2702, 2689, 3020, 3017, 2983, 3002, 2990, 3018, 2045, 1982, 1970, 1978, 1981, 2046, 1958, 1978, 2046, 1982, 1974, 1959, 1970, 2035, 2029, 2035, 1975, 1978, 1957, 23212, 28228, -438, 20881, 25977, 2647, 18919, 26824, -1850, 18207, 26160, 2334, 30558, 23726, -3009, 30841, 21385, 1080, 24483, 23465, -2167, 24261, 23247, 2511, 21725, 21272, -2033, 20976, 22069, 514, 2712, 2779, 2777, 2752, 2783, 2771, 2715, 2783, 2776, 2754, 2756, 2777, 2770, 2755, 2773, 2771, 2710, 2758, 2712, 2764, 2781, 2780, 2780, 2793, 2775, 2714, 2710, 2782, 2692, 2700, 2773, 2777, 2776, 2754, 2775, 2783, 2776, 2757, 2718, 22737, -25488, 17533, 29819, 2719, 2710, 2717, 2710, 2758, 2714, 2710, 2782, 2692, 2700, 2773, 2777, 2776, 2754, 2775, 2783, 2776, 2757, 2718, 22737, 27251, 17533, 29819, 2719, 2710, 2717, 2710, 2758, 2592, 2617, 2683, 2597, 2604, 2680, 2593, 2612, 2615, 2598, 2677, 2617, 2620, 2769, 2760, 2698, 2772, 2760, 2757, 2781, 2753, 2774, 2396, 2396, 2396, 447, 391, 456, 455, 21935, 21636, 2128, 2133, 2076, 2141, 1954, 1976, 1967, 1964, 1607, 1570, 2422, 2352, 2348, 2357, 2356, 2859, 2930, 2928, 2859, 611, 763, 738, 672, 749, 737, 736, 762, 747, 736, 762, 675, 738, 743, 765, 762, 686, 738, 743, 3047, 2981, 2976, 3044, 2976, 2980, 2990, 3049, 2984, 1111, 1101, 1114, 1113, 387, 391, 397, 1617, 1628, 1604, 2126, 2127, 2142, 2313, 2373, 2376, 2387, 2387, 2376, 2378, 2325, 817, 828, 803, 891, 805, 820, 818, 816, 806, 885, 820, 2073, 2081, 2158, 500, 430, 30005, 31932, 17519, -31463, 1666, 1736, 1731, 1755, 1730, 1665, 1728, 1733, 1730, 1735, 402, 407, 464, 410, 401, 393, 400, 467, 402, 407, 397, 394, 460, 478, 464, 410, 401, 393, 400, 467, 402, 407, 397, 394, 461, 478, 415, 2894, 2900, 2883, 2880, 996, 1016, 1016, 1020, 1516, 1529, 1529, 970, 1795, 1804, 1795, -1051, 2010, 2177, 2215, 2225, 2214, 2297, 2197, 2227, 2225, 2234, 2208, 2425, 2395, 2382, 2397, 2392, 2392, 2389, 2331, 2305, 2330, 2308, 2324, 2332, 2403, 2397, 2394, 2384, 2395, 2371, 2375, 2324, 2426, 2400, 2324, 2309, 2308, 2330, 2308, 2319, 2324, 2403, 2397, 2394, 2306, 2304, 2319, 2324, 2380, 2306, 2304, 2333, 2324, 2421, 2372, 2372, 2392, 2385, 2403, 2385, 2390, 2431, 2397, 2368, 2331, 2305, 2311, 2307, 2330, 2311, 2306, 2324, 2332, 2431, 2428, 2400, 2425, 2424, 2328, 2324, 2392, 2397, 2399, 2385, 2324, 2419, 2385, 2391, 2399, 2395, 2333, 2324, 2423, 2396, 2374, 2395, 2393, 2385, 2331, 2309, 2310, 2308, 2330, 2308, 2330, 2308, 2330, 2308, 2324, 2407, 2389, 2386, 2389, 2374, 2397, 2331, 2305, 2311, 2307, 2330, 2311, 2306, 465, 467, 454, 471, 469, 477, 448, 459, 497, 477, 476, 454, 471, 476, 454, 1609, 1608, 1625, 1612, 1604, 1601, 1646, 1602, 1603, 1625, 1608, 1603, 1625, 2650, 2630, 2630, 2626, 462, 2005, 2002, 2000, 2008, 2046, 2002, 2003, 1993, 2008, 2003, 1993, 2073, 2053, 2053, 2049, 2050, 2123, 2142, 2142, 2054, 2054, 2054, 2143, 2048, 2054, 2079, 2052, 2077, 2077, 2143, 2066, 2078, 2076, 2463, 280, 258, 287, 270, 2474, 2477, 2483, 653, 657, 657, 661, 662, 735, 714, 714, 658, 658, 658, 715, 660, 658, 651, 656, 649, 649, 715, 646, 650, 648, 2081, 2105, 2087, 2101, 2105, 2063, 2083, 2105, 2084, 2101, 2063, 2085, 2082, 2108, 2563, 2591, 2578, 2570, 2582, 2561, 2608, 2588, 2589, 2567, 2582, 2589, 2567, 1534, 1512, 1516, 1535, 1518, 1509, 1486, 1506, 1507, 1529, 1512, 1507, 1529};
    public C0257g r;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        String strM210 = C0053.m210(f83short, 0, 42, 2767);
        ArrayList arrayList = new ArrayList();
        try {
            C0257g c0257g = this.r;
            String str2 = strM210 + URLEncoder.encode(str, C0125.m499(f83short, 42, 5, 1339));
            String str3 = i() + C0143.m570(f83short, 47, 1, 2089);
            HashMap mapL = l();
            mapL.put(C0046.m182(f83short, 48, 7, 2347), str3);
            JSONArray jSONArrayOptJSONArray = new JSONObject(c0257g.a(str2, mapL)).optJSONArray(C0128.m511(f83short, 55, 4, 1036));
            if (jSONArrayOptJSONArray == null) {
                return com.github.catvod.spider.merge.p001b.g.y(arrayList);
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    String strTrim = jSONObject.optString(C0055.m219(f83short, 59, 2, 748), "").trim();
                    String strTrim2 = jSONObject.optString(C0072.m285(f83short, 61, 4, 2288), "").trim();
                    if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                        String strH = h(jSONObject.optString(C0074.m292(f83short, 65, 3, 374), "").trim());
                        k kVar = new k();
                        kVar.n(C0003.m10(f83short, 68, 4, 889) + strTrim + C0117.m467(f83short, 72, 5, 2644));
                        kVar.o(strTrim2);
                        kVar.p(strH);
                        kVar.s(jSONObject.optString(C0097.m386(f83short, 77, 2, 2317), "").trim());
                        arrayList.add(kVar);
                    }
                } catch (Exception unused) {
                }
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        } catch (Exception unused2) {
        }
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0143.m570(f83short, 79, 1, 3054), C0133.m529(f83short, 80, 2, 3261), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0082.m325(f83short, 82, 1, 2412), C0101.m402(f83short, 83, 2, 1134), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0014.m54(f83short, 85, 1, 2289), C0105.m416(f83short, 86, 2, 2374), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0050.m199(f83short, 88, 1, 1919), C0055.m219(f83short, 89, 2, 1553), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0049.m193(f83short, 91, 2, 1056), C0098.m390(f83short, 93, 2, 1824), null));
        ArrayList arrayList2 = new ArrayList();
        try {
            for (com.github.catvod.spider.merge.f0.k kVar : X1.L(this.r.a("", l()), "").Q(C0125.m499(f83short, 95, 18, 2254))) {
                try {
                    com.github.catvod.spider.merge.f0.k kVarR = kVar.R(C0096.m382(f83short, 113, 9, 3248));
                    if (kVarR != null) {
                        String strC = kVarR.c(C0072.m285(f83short, 122, 4, 469));
                        com.github.catvod.spider.merge.f0.k kVarR2 = kVarR.R(C0089.m355(f83short, 126, 3, 2150));
                        if (kVarR2 != null) {
                            String strC2 = kVarR2.c(C0017.m65(f83short, 129, 3, 359));
                            String strC3 = kVarR2.c(C0081.m322(f83short, 132, 3, 2646));
                            if (!TextUtils.isEmpty(strC) && !TextUtils.isEmpty(strC2)) {
                                String strH = h(strC3);
                                com.github.catvod.spider.merge.f0.k kVarR3 = kVar.R(C0027.m105(f83short, 135, 8, 556));
                                String strTrim = kVarR3 != null ? kVarR3.T().trim() : "";
                                k kVar2 = new k();
                                kVar2.n(strC);
                                kVar2.o(strC2);
                                kVar2.p(strH);
                                kVar2.s(strTrim);
                                arrayList2.add(kVar2);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, arrayList2);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        AbstractC0280n1.u(str, str2);
        try {
            if (!str.contains(C0140.m558(f83short, 143, 2, 1758))) {
                return super.playerContent(str, str2, list);
            }
            String strH = h(str2);
            C0257g c0257g = this.r;
            HashMap mapL = l();
            mapL.put(C0070.m277(f83short, 145, 7, 3110), strH);
            Matcher matcher = Pattern.compile(C0056.m223(f83short, 152, 50, 2035), 32).matcher(c0257g.a(strH, mapL));
            if (!matcher.find()) {
                return "";
            }
            String strOptString = new JSONObject(matcher.group(1)).optString(C0056.m223(f83short, 202, 3, 3162), "");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(strOptString);
            gVar.h(l());
            return gVar.r();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str;
        com.github.catvod.spider.merge.h0.d dVar;
        String str2 = "";
        String str3 = list.get(0);
        k kVarA = AbstractC0449a.a(str3);
        try {
            com.github.catvod.spider.merge.f0.g gVarL = X1.L(this.r.a(h(str3), l()), "");
            com.github.catvod.spider.merge.f0.k kVarR = gVarL.R(C0143.m570(f83short, 205, 27, 1418));
            if (kVarR != null) {
                String strC = kVarR.c(C0114.m454(f83short, 232, 3, 2714));
                if (!TextUtils.isEmpty(strC)) {
                    kVarA.p(h(strC));
                }
            }
            com.github.catvod.spider.merge.f0.k kVarR2 = gVarL.R(C0143.m570(f83short, 235, 2, 1821));
            if (kVarR2 != null) {
                String strTrim = kVarR2.N().trim();
                if (TextUtils.isEmpty(strTrim)) {
                    strTrim = kVarR2.T().trim();
                }
                kVarA.o(strTrim.replaceAll(C0142.m567(f83short, 237, 10, 454), "").trim());
                com.github.catvod.spider.merge.f0.k kVarR3 = kVarR2.R(C0128.m511(f83short, 247, 4, 2799));
                if (kVarR3 != null) {
                    String strReplaceAll = kVarR3.T().replaceAll(C0021.m83(f83short, 251, 6, 2967), "");
                    if (!TextUtils.isEmpty(strReplaceAll)) {
                        kVarA.u(strReplaceAll);
                    }
                }
            }
            for (com.github.catvod.spider.merge.f0.k kVar : gVarL.Q(C0114.m454(f83short, 257, 19, 2003))) {
                String strTrim2 = kVar.T().trim();
                if (strTrim2.startsWith(C0115.m459(f83short, 276, 3, 336)) || strTrim2.startsWith(C0021.m83(f83short, 279, 3, 2669))) {
                    kVarA.m(k(kVar));
                } else if (strTrim2.startsWith(C0032.m126(f83short, 282, 3, 2012)) || strTrim2.startsWith(C0103.m408(f83short, 285, 3, 2340))) {
                    kVarA.j(k(kVar));
                } else if (strTrim2.startsWith(C0018.m70(f83short, 288, 3, 2853)) || strTrim2.startsWith(C0044.m175(f83short, 291, 3, 1026))) {
                    kVarA.i(k(kVar));
                } else if (strTrim2.startsWith(C0001.m1(f83short, 294, 3, 2195)) || strTrim2.startsWith(C0026.m102(f83short, 297, 3, 2549))) {
                    kVarA.k(k(kVar));
                } else if (strTrim2.startsWith(C0081.m322(f83short, 300, 3, 1813)) || strTrim2.startsWith(C0135.m539(f83short, 303, 3, 568))) {
                    kVarA.s(strTrim2.substring(3).trim());
                }
            }
            com.github.catvod.spider.merge.f0.k kVarR4 = gVarL.R(C0021.m83(f83short, 306, 71, 2742));
            if (kVarR4 != null) {
                kVarA.l(kVarR4.N().trim());
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q(C0044.m175(f83short, 377, 13, 2645));
            com.github.catvod.spider.merge.h0.d dVarQ2 = gVarL.Q(C0006.m21(f83short, 390, 9, 2724));
            int size = dVarQ.size();
            String strM105 = C0027.m105(f83short, 399, 3, 2424);
            if (size > 0 && dVarQ2.size() > 0) {
                int iMin = Math.min(dVarQ.size(), dVarQ2.size());
                int i = 0;
                while (i < iMin) {
                    String strTrim3 = ((com.github.catvod.spider.merge.f0.k) dVarQ.get(i)).N().trim();
                    if (TextUtils.isEmpty(strTrim3)) {
                        strTrim3 = ((com.github.catvod.spider.merge.f0.k) dVarQ.get(i)).T().replaceAll(C0126.m503(f83short, 402, 4, 483), str2).trim();
                    }
                    if (strTrim3.contains(C0053.m210(f83short, 406, 2, 3206))) {
                        com.github.catvod.spider.merge.h0.d dVarQ3 = ((com.github.catvod.spider.merge.f0.k) dVarQ2.get(i)).Q(C0098.m390(f83short, 408, 4, 2108));
                        StringBuilder sb3 = new StringBuilder();
                        int i2 = 0;
                        while (i2 < dVarQ3.size()) {
                            com.github.catvod.spider.merge.f0.k kVar2 = (com.github.catvod.spider.merge.f0.k) dVarQ3.get(i2);
                            String str4 = str2;
                            String strTrim4 = kVar2.T().trim();
                            com.github.catvod.spider.merge.h0.d dVar2 = dVarQ;
                            String strC2 = kVar2.c(C0010.m36(f83short, 412, 4, 1994));
                            if (!TextUtils.isEmpty(strC2)) {
                                if (i2 > 0) {
                                    sb3.append(C0072.m285(f83short, 416, 1, 1636));
                                }
                                sb3.append(strTrim4);
                                sb3.append(C0085.m339(f83short, 417, 1, 1542));
                                sb3.append(strC2);
                            }
                            i2++;
                            dVarQ = dVar2;
                            str2 = str4;
                        }
                        str = str2;
                        dVar = dVarQ;
                        if (sb3.length() > 0) {
                            if (sb.length() > 0) {
                                sb.append(strM105);
                            }
                            sb.append(strTrim3);
                            if (sb2.length() > 0) {
                                sb2.append(strM105);
                            }
                            sb2.append((CharSequence) sb3);
                        }
                    } else {
                        str = str2;
                        dVar = dVarQ;
                    }
                    i++;
                    dVarQ = dVar;
                    str2 = str;
                }
            }
            ArrayList arrayListJ = j(gVarL);
            if (!arrayListJ.isEmpty()) {
                String strA = a(arrayListJ);
                String strB = b(arrayListJ);
                if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strB)) {
                    if (sb.length() > 0) {
                        sb.append(strM105);
                        sb.append(strA);
                        sb2.append(strM105);
                        sb2.append(strB);
                    } else {
                        sb.append(strA);
                        sb2.append(strB);
                    }
                }
            }
            if (sb.length() > 0) {
                kVarA.q(sb.toString());
                kVarA.r(sb2.toString());
            }
        } catch (Exception unused) {
        }
        FishCrypto.c(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        try {
            i = Integer.parseInt(str2);
            String strM210 = C0053.m210(f83short, 418, 5, 2392);
            String strM301 = C0076.m301(f83short, 423, 4, 2820);
            try {
                com.github.catvod.spider.merge.f0.g gVarL = X1.L(this.r.a(i <= 1 ? strM301 + str + strM210 : strM301 + str + C0116.m463(f83short, 427, 1, 590) + str2 + strM210, l()), "");
                for (com.github.catvod.spider.merge.f0.k kVar : gVarL.Q(C0125.m499(f83short, 428, 18, 654))) {
                    try {
                        com.github.catvod.spider.merge.f0.k kVarR = kVar.R(C0135.m539(f83short, 446, 9, 3017));
                        if (kVarR != null) {
                            String strC = kVarR.c(C0008.m31(f83short, 455, 4, 1087));
                            com.github.catvod.spider.merge.f0.k kVarR2 = kVarR.R(C0101.m402(f83short, 459, 3, 490));
                            if (kVarR2 != null) {
                                String strC2 = kVarR2.c(C0140.m558(f83short, 462, 3, 1584));
                                String strC3 = kVarR2.c(C0074.m292(f83short, 465, 3, 2109));
                                if (!TextUtils.isEmpty(strC) && !TextUtils.isEmpty(strC2)) {
                                    String strH = h(strC3);
                                    com.github.catvod.spider.merge.f0.k kVarR3 = kVar.R(C0135.m539(f83short, 468, 8, 2343));
                                    String strTrim = kVarR3 != null ? kVarR3.T().trim() : "";
                                    k kVar2 = new k();
                                    kVar2.n(strC);
                                    kVar2.o(strC2);
                                    kVar2.p(strH);
                                    kVar2.s(strTrim);
                                    arrayList.add(kVar2);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q(C0056.m223(f83short, 476, 11, 853));
                for (int size = dVarQ.size() - 1; size >= 0; size--) {
                    String strTrim2 = ((com.github.catvod.spider.merge.f0.k) dVarQ.get(size)).T().trim();
                    if (strTrim2.matches(C0010.m36(f83short, 487, 3, 2117))) {
                        try {
                            int i3 = Integer.parseInt(strTrim2);
                            if (i3 <= 1) {
                                break;
                            }
                            i2 = i3;
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                }
                if (i2 < i) {
                    i2 = i;
                }
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
            i = 1;
        }
        return AbstractC0449a.c(i, i2, arrayList.size(), arrayList.size() * i2, arrayList);
    }

    public static ArrayList j(com.github.catvod.spider.merge.f0.g gVar) {
        com.github.catvod.spider.merge.f0.k kVarR;
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (com.github.catvod.spider.merge.f0.k kVar : gVar.Q(C0050.m199(f83short, 490, 2, 412))) {
            if (kVar.T().contains(C0087.m346(f83short, 492, 4, 2660))) {
                com.github.catvod.spider.merge.f0.k kVar2 = (com.github.catvod.spider.merge.f0.k) kVar.a;
                if (kVar2 != null && (kVarR = kVar2.R(C0003.m10(f83short, 496, 10, 1708))) != null) {
                    Iterator<E> it = kVarR.Q(C0098.m390(f83short, 506, 27, 510)).iterator();
                    while (it.hasNext()) {
                        String strC = ((com.github.catvod.spider.merge.f0.k) it.next()).c(C0139.m554(f83short, 533, 4, 2854));
                        if (!TextUtils.isEmpty(strC) && strC.startsWith(C0130.m516(f83short, 537, 4, 908))) {
                            String lowerCase = "";
                            try {
                                int iIndexOf = strC.indexOf(C0010.m36(f83short, 541, 3, 1494));
                                if (iIndexOf >= 0) {
                                    int i = iIndexOf + 3;
                                    int iIndexOf2 = strC.indexOf(47, i);
                                    if (iIndexOf2 < 0) {
                                        iIndexOf2 = strC.length();
                                    }
                                    lowerCase = strC.substring(i, iIndexOf2).toLowerCase();
                                }
                            } catch (Exception unused) {
                            }
                            if (!TextUtils.isEmpty(lowerCase)) {
                                int iIntValue = map.containsKey(lowerCase) ? ((Integer) map.get(lowerCase)).intValue() : 0;
                                if (iIntValue < 3) {
                                    map.put(lowerCase, Integer.valueOf(iIntValue + 1));
                                    arrayList.add(strC);
                                }
                            }
                        }
                    }
                    break;
                }
                break;
                break;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String k(com.github.catvod.spider.merge.f0.k kVar) {
        com.github.catvod.spider.merge.h0.d dVarQ = kVar.Q(C0028.m108(f83short, 544, 1, 939));
        if (dVarQ.size() <= 0) {
            String strTrim = kVar.T().trim();
            int iIndexOf = strTrim.indexOf(C0017.m65(f83short, 548, 1, 1279));
            if (iIndexOf < 0) {
                iIndexOf = strTrim.indexOf(C0125.m499(f83short, 549, 1, 2016));
            }
            return iIndexOf >= 0 ? strTrim.substring(iIndexOf + 1).trim() : strTrim;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dVarQ.size(); i++) {
            if (i > 0) {
                sb.append(C0133.m529(f83short, 545, 3, 1827));
            }
            sb.append(((com.github.catvod.spider.merge.f0.k) dVarQ.get(i)).T().trim());
        }
        return sb.toString();
    }

    public static HashMap l() {
        return com.github.catvod.spider.merge.D.b.s(C0021.m83(f83short, 550, 10, 2260), C0135.m539(f83short, 560, 111, 2356));
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0089.m355(f83short, 671, 15, 434));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0115.m459(f83short, 686, 13, 1581));
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

    public final String h(String str) {
        String strConcat = str;
        if (TextUtils.isEmpty(strConcat) || strConcat.startsWith(C0082.m325(f83short, 699, 4, 2610))) {
            return strConcat;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i());
        String strM402 = C0101.m402(f83short, 703, 1, 481);
        if (!strConcat.startsWith(strM402)) {
            strConcat = strM402.concat(strConcat);
        }
        sb.append(strConcat);
        return sb.toString();
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0050.m199(f83short, 704, 11, 1981));
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

    public final String i() {
        C0257g c0257g = this.r;
        String strB = c0257g != null ? c0257g.b() : C0056.m223(f83short, 715, 22, 2161);
        return strB.endsWith(C0115.m459(f83short, 737, 1, 2480)) ? com.github.catvod.spider.merge.D.b.g(strB, 1, 0) : strB;
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        super.init(context, str);
        String strM108 = C0028.m108(f83short, 738, 4, 363);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strM108);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strTrim = jSONArrayOptJSONArray.optString(i, "").trim();
                        if (!strTrim.isEmpty()) {
                            arrayList.add(strTrim);
                        }
                    }
                } else {
                    String strTrim2 = jSONObject.optString(strM108, jSONObject.optString(C0030.m116(f83short, 742, 3, 2527), "")).trim();
                    if (!strTrim2.isEmpty()) {
                        arrayList.add(strTrim2);
                    }
                }
            } catch (Exception unused) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(C0049.m193(f83short, 745, 22, 741));
        }
        this.r = AbstractC0260h.b(C0087.m346(f83short, 767, 14, 2128), arrayList, false);
    }

    @Override // com.github.catvod.spider.Cloud
    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0009.m33(f83short, 781, 13, 2675));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0050.m199(f83short, 794, 13, 1421));
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
}

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
        String strM210 = "/index.php/ajax/suggest?mid=1&limit=20&wd=";
        ArrayList arrayList = new ArrayList();
        try {
            C0257g c0257g = this.r;
            String str2 = strM210 + URLEncoder.encode(str, "UTF-8");
            String str3 = i() + "/";
            HashMap mapL = l();
            mapL.put("Referer", str3);
            JSONArray jSONArrayOptJSONArray = new JSONObject(c0257g.a(str2, mapL)).optJSONArray("list");
            if (jSONArrayOptJSONArray == null) {
                return com.github.catvod.spider.merge.p001b.g.y(arrayList);
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    String strTrim = jSONObject.optString("id", "").trim();
                    String strTrim2 = jSONObject.optString("name", "").trim();
                    if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                        String strH = h(jSONObject.optString("pic", "").trim());
                        k kVar = new k();
                        kVar.n("/mv/" + strTrim + ".html");
                        kVar.o(strTrim2);
                        kVar.p(strH);
                        kVar.s(jSONObject.optString("en", "").trim());
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
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("1", "电影", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("2", "剧集", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("3", "综艺", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("4", "动漫", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("30", "短剧", null));
        ArrayList arrayList2 = new ArrayList();
        try {
            for (com.github.catvod.spider.merge.f0.k kVar : X1.L(this.r.a("", l()), "").Q("ul.content-list li")) {
                try {
                    com.github.catvod.spider.merge.f0.k kVarR = kVar.R(".li-img a");
                    if (kVarR != null) {
                        String strC = kVarR.c("href");
                        com.github.catvod.spider.merge.f0.k kVarR2 = kVarR.R("img");
                        if (kVarR2 != null) {
                            String strC2 = kVarR2.c("alt");
                            String strC3 = kVarR2.c("src");
                            if (!TextUtils.isEmpty(strC) && !TextUtils.isEmpty(strC2)) {
                                String strH = h(strC3);
                                com.github.catvod.spider.merge.f0.k kVarR3 = kVar.R(".bottom2");
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
            if (!str.contains("天堂")) {
                return super.playerContent(str, str2, list);
            }
            String strH = h(str2);
            C0257g c0257g = this.r;
            HashMap mapL = l();
            mapL.put("Referer", strH);
            Matcher matcher = Pattern.compile("var\\s+player_aaaa\\s*=\\s*(\\{.*?\\})\\s*;?\\s*</script>", 32).matcher(c0257g.a(strH, mapL));
            if (!matcher.find()) {
                return "";
            }
            String strOptString = new JSONObject(matcher.group(1)).optString("url", "");
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
            com.github.catvod.spider.merge.f0.k kVarR = gVarL.R(".main-ui-meta img, .img img");
            if (kVarR != null) {
                String strC = kVarR.c("src");
                if (!TextUtils.isEmpty(strC)) {
                    kVarA.p(h(strC));
                }
            }
            com.github.catvod.spider.merge.f0.k kVarR2 = gVarL.R("h1");
            if (kVarR2 != null) {
                String strTrim = kVarR2.N().trim();
                if (TextUtils.isEmpty(strTrim)) {
                    strTrim = kVarR2.T().trim();
                }
                kVarA.o(strTrim.replaceAll("\\(\\d{4}\\)$", "").trim());
                com.github.catvod.spider.merge.f0.k kVarR3 = kVarR2.R("span");
                if (kVarR3 != null) {
                    String strReplaceAll = kVarR3.T().replaceAll("[^0-9]", "");
                    if (!TextUtils.isEmpty(strReplaceAll)) {
                        kVarA.u(strReplaceAll);
                    }
                }
            }
            for (com.github.catvod.spider.merge.f0.k kVar : gVarL.Q(".main-ui-meta > div")) {
                String strTrim2 = kVar.T().trim();
                if (strTrim2.startsWith("导演：") || strTrim2.startsWith("导演:")) {
                    kVarA.m(k(kVar));
                } else if (strTrim2.startsWith("主演：") || strTrim2.startsWith("主演:")) {
                    kVarA.j(k(kVar));
                } else if (strTrim2.startsWith("类型：") || strTrim2.startsWith("类型:")) {
                    kVarA.i(k(kVar));
                } else if (strTrim2.startsWith("地区：") || strTrim2.startsWith("地区:")) {
                    kVarA.k(k(kVar));
                } else if (strTrim2.startsWith("又名：") || strTrim2.startsWith("又名:")) {
                    kVarA.s(strTrim2.substring(3).trim());
                }
            }
            com.github.catvod.spider.merge.f0.k kVarR4 = gVarL.R(".movie-introduce p.zkjj_a, h2:contains(剧集介绍) + p, h2:contains(剧情介绍) + p");
            if (kVarR4 != null) {
                kVarA.l(kVarR4.N().trim());
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q("ul.py-tabs li");
            com.github.catvod.spider.merge.h0.d dVarQ2 = gVarL.Q("ul.player");
            int size = dVarQ.size();
            String strM105 = "$$$";
            if (size > 0 && dVarQ2.size() > 0) {
                int iMin = Math.min(dVarQ.size(), dVarQ2.size());
                int i = 0;
                while (i < iMin) {
                    String strTrim3 = ((com.github.catvod.spider.merge.f0.k) dVarQ.get(i)).N().trim();
                    if (TextUtils.isEmpty(strTrim3)) {
                        strTrim3 = ((com.github.catvod.spider.merge.f0.k) dVarQ.get(i)).T().replaceAll("\\d+$", str2).trim();
                    }
                    if (strTrim3.contains("天堂")) {
                        com.github.catvod.spider.merge.h0.d dVarQ3 = ((com.github.catvod.spider.merge.f0.k) dVarQ2.get(i)).Q("li a");
                        StringBuilder sb3 = new StringBuilder();
                        int i2 = 0;
                        while (i2 < dVarQ3.size()) {
                            com.github.catvod.spider.merge.f0.k kVar2 = (com.github.catvod.spider.merge.f0.k) dVarQ3.get(i2);
                            String str4 = str2;
                            String strTrim4 = kVar2.T().trim();
                            com.github.catvod.spider.merge.h0.d dVar2 = dVarQ;
                            String strC2 = kVar2.c("href");
                            if (!TextUtils.isEmpty(strC2)) {
                                if (i2 > 0) {
                                    sb3.append("#");
                                }
                                sb3.append(strTrim4);
                                sb3.append("$");
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
            String strM210 = ".html";
            String strM301 = "/vt/";
            try {
                com.github.catvod.spider.merge.f0.g gVarL = X1.L(this.r.a(i <= 1 ? strM301 + str + strM210 : strM301 + str + "-" + str2 + strM210, l()), "");
                for (com.github.catvod.spider.merge.f0.k kVar : gVarL.Q("ul.content-list li")) {
                    try {
                        com.github.catvod.spider.merge.f0.k kVarR = kVar.R(".li-img a");
                        if (kVarR != null) {
                            String strC = kVarR.c("href");
                            com.github.catvod.spider.merge.f0.k kVarR2 = kVarR.R("img");
                            if (kVarR2 != null) {
                                String strC2 = kVarR2.c("alt");
                                String strC3 = kVarR2.c("src");
                                if (!TextUtils.isEmpty(strC) && !TextUtils.isEmpty(strC2)) {
                                    String strH = h(strC3);
                                    com.github.catvod.spider.merge.f0.k kVarR3 = kVar.R(".bottom2");
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
                com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q("div.pages a");
                for (int size = dVarQ.size() - 1; size >= 0; size--) {
                    String strTrim2 = ((com.github.catvod.spider.merge.f0.k) dVarQ.get(size)).T().trim();
                    if (strTrim2.matches("\\d+")) {
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
        for (com.github.catvod.spider.merge.f0.k kVar : gVar.Q("h2")) {
            if (kVar.T().contains("网盘下载")) {
                com.github.catvod.spider.merge.f0.k kVar2 = (com.github.catvod.spider.merge.f0.k) kVar.a;
                if (kVar2 != null && (kVarR = kVar2.R(".down-link")) != null) {
                    Iterator<E> it = kVarR.Q("li.down-list2 .down-list3 a").iterator();
                    while (it.hasNext()) {
                        String strC = ((com.github.catvod.spider.merge.f0.k) it.next()).c("href");
                        if (!TextUtils.isEmpty(strC) && strC.startsWith("http")) {
                            String lowerCase = "";
                            try {
                                int iIndexOf = strC.indexOf("://");
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
        com.github.catvod.spider.merge.h0.d dVarQ = kVar.Q("a");
        if (dVarQ.size() <= 0) {
            String strTrim = kVar.T().trim();
            int iIndexOf = strTrim.indexOf("：");
            if (iIndexOf < 0) {
                iIndexOf = strTrim.indexOf(":");
            }
            return iIndexOf >= 0 ? strTrim.substring(iIndexOf + 1).trim() : strTrim;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dVarQ.size(); i++) {
            if (i > 0) {
                sb.append(" / ");
            }
            sb.append(((com.github.catvod.spider.merge.f0.k) dVarQ.get(i)).T().trim());
        }
        return sb.toString();
    }

    public static HashMap l() {
        return com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
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

    public final String h(String str) {
        String strConcat = str;
        if (TextUtils.isEmpty(strConcat) || strConcat.startsWith("http")) {
            return strConcat;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i());
        String strM402 = "/";
        if (!strConcat.startsWith(strM402)) {
            strConcat = strM402.concat(strConcat);
        }
        sb.append(strConcat);
        return sb.toString();
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

    public final String i() {
        C0257g c0257g = this.r;
        String strB = c0257g != null ? c0257g.b() : "https://www.qwnull.com";
        return strB.endsWith("/") ? com.github.catvod.spider.merge.D.b.g(strB, 1, 0) : strB;
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        super.init(context, str);
        String strM108 = "site";
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
                    String strTrim2 = jSONObject.optString(strM108, jSONObject.optString("url", "")).trim();
                    if (!strTrim2.isEmpty()) {
                        arrayList.add(strTrim2);
                    }
                }
            } catch (Exception unused) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("https://www.qwnull.com");
        }
        this.r = AbstractC0260h.b("qiwei_site_url", arrayList, false);
    }

    @Override // com.github.catvod.spider.Cloud
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
}

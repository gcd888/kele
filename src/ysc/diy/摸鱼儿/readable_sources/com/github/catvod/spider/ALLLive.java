package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.C0246c0;
import com.github.catvod.spider.merge.A.C0261h0;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.P0;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.S.e;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
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
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.A;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.W;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0538n;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0503g;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0518j;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class ALLLive extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f0short = {1530, 3117, 3092, 3101, 3102, 3102, 3101, 3077, 3073, 25436, 30665, 20542, 28069, 912, 940, 942, 955, 938, 936, 928, 957, 934, 938, 956, 25801, 28764, 21726, 31395, 2974, 2985, 2984, 2994, 2997, 2990, 2995, 3000, -28959, 28712, 21669, 21713, 706, 750, 760, 745, 745, 756, 755, 762, 750, 29096, 31688, -32561, 29727, 3165, 3147, 3151, 3164, 3149, 3142, 3176, 3137, 3138, 3146, 3147, 3164, 3171, 3137, 3146, 3147, 1897, 1845, 1827, 1831, 1844, 1829, 1838, 1817, 1831, 1834, 1834, 1913, 1837, 1827, 1855, 1841, 1833, 1844, 1826, 1915, 2136, 2062, 2079, 2073, 2075, 2115, 557, 552, 573, 552, 463, 483, 501, 497, 482, 499, 504, 463, 502, 511, 508, 500, 501, 482, 464, 464, 1050, 1277, 1269, 18165, 2294, 3039, 3046, 3055, 3052, 3052, 3055, 3063, 3059, 3039, 3052, 3049, 3062, 3045, 1236, 1256, 1258, 1279, 1275, 1236, 1290, 1334, 1332, 1313, 1290, 1937, 1946, 1951, 1946, 1964, 1951, 1948, 1940, 1946, 1949, 409, 399, 414, 414, 387, 388, 397, 409, 2797, 2811, 2815, 2796, 2813, 2806, 2753, 2810, 2807, 2797, 2798, 2802, 2815, 2791, 1241, 1237, 1242, 1237, 1235, 1233, 1259, 1234, 1243, 1240, 1240, 1243, 1219, 1223, 1050, 1046, 1049, 1046, 1040, 1042, 1064, 1055, 1054, 1028, 1027, 1048, 1029, 1038, 2750, 2738, 2749, 2738, 2740, 2742, 2700, 2736, 2738, 2727, 2742, 2740, 2748, 2721, 2746, 2742, 2720, 2314, 2326, 2331, 2307, 2341, 2313, 2335, 2318, 2318, 2323, 2324, 2333, 2313, 1833, 1836, 1827, 1824, 1836, 1830, 1848, 1810, 1854, 1832, 1849, 1849, 1828, 1827, 1834, 1854, 2315, 2318, 2305, 2306, 2318, 2308, 2330, 2352, 2315, 2304, 2316, 2332, 515, 526, 526, 526, 523, 532, 519, 573, 522, 519, 526, 530, 1605, 1614, 1611, 1614, 1605, 1614, 1611, 1614, 419, 1853, 1846, 1843, 1846, 1792, 1843, 1840, 1848, 1846, 1841, 1929, 1951, 1934, 1934, 1939, 1940, 1949, 1929, 1912, 1902, 1898, 1913, 1896, 1891, 1876, 1903, 1890, 1912, 1915, 1895, 1898, 1906, 2384, 2396, 2387, 2396, 2394, 2392, 2402, 2395, 2386, 2385, 2385, 2386, 2378, 2382, 998, 1002, 997, 1002, 1004, 1006, 980, 995, 994, 1016, 1023, 996, 1017, 1010, 2242, 2254, 2241, 2254, 2248, 2250, 2288, 2252, 2254, 2267, 2250, 2248, 2240, 2269, 2246, 2250, 2268, 3163, 3143, 3146, 3154, 3188, 3160, 3150, 3167, 3167, 3138, 3141, 3148, 3160, 3040, 3045, 3050, 3049, 3045, 3055, 3057, 3035, 3063, 3041, 3056, 3056, 3053, 3050, 3043, 3063, 3163, 3166, 3153, 3154, 3166, 3156, 3146, 3168, 3163, 3152, 3164, 3148, 1191, 1194, 1194, 1194, 1199, 1200, 1187, 1177, 1198, 1187, 1194, 1206, 273, 317, 299, 303, 316, 301, 294, 273, 296, 289, 290, 298, 299, 316, 270, 270, 2895, 563, 543, 521, 536, 536, 517, 514, 523, 543, 1933, 18656, 18838, 25344, 20671, 494, 22401, 23296, 26267, 2643, 21885, 28089, -29376, 2223, 1832, 1827, 1830, 1827, 1813, 1830, 1829, 1837, 1827, 1828, 1011, 31080, 28935, 25520, 1608, 31955, 28785, 22879, 22195, 32058, 21524, 2913, 3062, 2913, 31736, 23226, 27812, 31818, 21522, 22796, 31223, 27456, 25165, 29468, 23090, 1351, 1488, 1351, 29468, 23090, 20841, 22152, 29292, -24641, 28764, -30641, 2833, 2823, 2838, 2838, 2827, 2828, 2821, 2833, 21664, 22819, 29042, 32469, 23351, 21828, 20531, 29379, 24730, 23108, 22471, 1626, 1612, 1608, 1627, 1610, 1601, 1654, 1613, 1600, 1626, 1625, 1605, 1608, 1616, 25990, 31928, 24015, 30880, 3135, 3113, 3117, 3134, 3119, 3108, 3082, 3107, 3104, 3112, 3113, 3134, 3073, 3107, 3112, 3113, 26402, 23128, 22491, 25004, 19165, 23826, 28906, 26043, 21513, -29066, 2967, 2971, 2964, 2971, 2973, 2975, 2981, 2969, 2971, 2958, 2975, 2973, 2965, 2952, 2963, 2975, 2953, 23485, 30144, 29210, 32189, 1681, 18587, 21687, 31434, 2439, 2443, 2436, 2443, 2445, 2447, 2485, 2444, 2437, 2438, 2438, 2437, 2461, 2457, 31876, 29475, 22102, 27597, 453, 457, 454, 457, 463, 461, 503, 448, 449, 475, 476, 455, 474, 465, -30637, 30362, 21015, 21091, 3098, 27483, -30838, 21359, 2623, 2595, 2606, 2614, 2576, 2620, 2602, 2619, 2619, 2598, 2593, 2600, 2620, 21657, 26882, -29100, 31364, 22376, 27379, 26059, -26743, 1595, 1708, 1595, 22811, 25270, 26059, -26743, 3122, 3127, 3128, 3131, 3127, 3133, 3107, 3081, 3109, 3123, 3106, 3106, 3135, 3128, 3121, 3109, 22510, 22146, -26214, 30649, 21856, 22418, 23741, 23581, 20636, -27646, 1693, 1688, 1687, 1684, 1688, 1682, 1676, 1702, 1693, 1686, 1690, 1674, 22056, 22340, 21224, 27316, -32027, 28447, 464, 482, 485, 468, 488, 484, 492, 482, 499, 423, 25122, 21092, 25600, 27108, 966, 971, 971, 971, 974, 977, 962, 1016, 975, 962, 971, 983, 27550, 31600, 21077, 24274, 24255, -29475, -30764, 27182, 16942, 17247, 30984, 28455, 24439, 3164, 3161, 3139, 3140, 3112, 3129, 3135, 3133, 2285, 2300, 2298, 2296, 2302, 2290, 2280, 2291, 2281, 2678, 2675, 2679, 2675, 2670, 1709, 1718, 1709, 1720, 1717, 1828, 1821, 1812, 1815, 1815, 1812, 1804, 1800, 1198, 2091, 29213, 24644, -28387, 1437, 1408, 1437, 1413, 1420, 795, 791, 782, 797, 778, 2741, 2739, 2725, 2738, 2702, 2721, 2733, 2725, 647, 666, 666, 664, 700, 657, 1318, 1311, 1302, 1301, 1301, 1302, 1294, 1290, 1318, 1301, 1296, 1295, 1308, 1176, 1154, 1183, 1166, 2464, 2460, 2462, 2443, 2458, 2456, 2448, 2445, 2454, 2458, 2444, 1076, 1061, 1078, 1057, 1066, 1072, 1037, 1056, 1996, 1998, 2011, 2022, 1995, 2048, 2050, 2071, 2093, 2050, 2062, 2054, 3323, 3306, 3321, 3310, 3301, 3327, 3269, 3306, 3302, 3310, 1199, 1205, 1192, 1209, 1170, 1213, 1201, 1209, 1257, 1246, 1247, 1221, 1218, 1241, 1220, 1231, 2266, 2240, 2253, 2253, 2253, 2280, 2295, 2276, 2258, 2293, 2286, 2291, 2272, 2278, 2276, 2268, 2209, 2285, 2286, 2272, 2277, 2249, 2280, 2290, 2293, 2286, 2291, 2296, 2240, 2290, 2263, 2286, 2277, 2209, 2276, 2291, 2291, 2286, 2291, 2235, 2209, 2590, 2599, 2592, 2615, 2590, 485, 504, 489, 481, 511, 1204, 1213, 1199, 1155, 1201, 1203, 1198, 1209, 1591, 1586, 1575, 1586, 683, 765, 748, 746, 744, 688, 1266, 1188, 1205, 1190, 1201, 1210, 1184, 1163, 1213, 1200, 1257, 2479, 2538, 2536, 2557, 2540, 2542, 2534, 2555, 2544, 2518, 2528, 2541, 2484, 1559, 1610, 1623, 1623, 1621, 1611, 1543, 1611, 1617, 1612, 1629, 1541, 1760, 1756, 1758, 1739, 1743, 1760, 3125, 3130, 3126, 3134, 1531, 1526, 2180, 2191, 2190, 2187, 2179, 2197, 2178, 
    2185, 311, 294, 309, 290, 297, 307, 280, 302, 291, 3152, 3180, 3182, 3195, 3152, 1969, 1975, 1953, 1974, 1947, 1957, 1970, 1957, 1968, 1957, 1974, 31319, 26638, 17038, 3203, 3092, 3203, 1501, 1479, 1482, 1482, 1482, 1519, 1520, 1507, 1493, 1522, 1513, 1524, 1511, 1505, 1507, 1499, 1446, 1514, 1513, 1511, 1506, 1472, 1513, 1514, 1514, 1513, 1521, 1525, 1479, 1525, 1488, 1513, 1506, 1446, 1507, 1524, 1524, 1513, 1524, 1468, 1446, 2060, 18273, 17943, 27777, 25423, 24324, 32472, 27777, 29934, 26295, 19511, 929, 920, 913, 914, 914, 913, 905, 909, 929, 914, 919, 904, 923, -29449, 25220, 22290, 19391, -28182, 26289, 1332, 1443, 1332, 22758, 21607, 27132, 1332, -29499, 25270, 1289, 32391, 28960, 21589, 27086, 287, 275, 284, 275, 277, 279, 301, 276, 285, 286, 286, 285, 261, 257, 2169, 2165, 2170, 2165, 2163, 2161, 2123, 2162, 2171, 2168, 2168, 2171, 2147, 2151, 2187, 2185, 2206, 2179, 2181, 2180, 1031, 1029, 1040, 1025, 1027, 1035, 1046, 1053, 1063, 1035, 1034, 1040, 1025, 1034, 1040, 3179, 3178, 3195, 3182, 3174, 3171, 3148, 3168, 3169, 3195, 3178, 3169, 3195, 555, 556, 558, 550, 512, 556, 557, 567, 550, 557, 567, 2598, 2593, 2595, 2603, 2584, 2599, 2602, 2603, 2593, 2573, 2593, 2592, 2618, 2603, 2592, 2618, 3156, 3144, 3141, 3165, 3137, 3158, 3175, 3147, 3146, 3152, 3137, 3146, 3152, 984, 974, 970, 985, 968, 963, 1000, 964, 965, 991, 974, 965, 991, 263, 273, 277, 262, 279, 284, 311, 283, 282, 256, 273, 282, 256};
    public final X1 a;
    public final com.github.catvod.spider.merge.S.e b;
    public final X1 c;
    public final C0246c0 d;
    public final com.github.catvod.spider.merge.p018v.c e;
    public final com.github.catvod.spider.merge.p018v.c f;
    public final C0261h0 g;
    public C0246c0 h;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        this.c.getClass();
        ArrayList arrayList = new ArrayList();
        C0239a.e().getClass();
        HashSet hashSetF = C0239a.f();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("_follows", "我的关注", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("_categories", "我的分类", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("_history", "观看历史", null));
        com.github.catvod.spider.merge.D.b.z("_settings", "站点设置", null, arrayList);
        String[][] strArr = com.github.catvod.spider.merge.p018v.b.a;
        for (int i = 0; i < 5; i++) {
            String[] strArr2 = strArr[i];
            if (hashSetF.contains(strArr2[0])) {
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(strArr2[0], strArr2[1], null));
            }
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, new ArrayList());
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        String strY;
        com.github.catvod.spider.merge.S.e eVar = (com.github.catvod.spider.merge.S.e) this.c.b;
        synchronized (eVar) {
            try {
                if (!((com.github.catvod.spider.merge.p018v.d) eVar.c).e && !eVar.b) {
                    eVar.b = true;
                    eVar.g(eVar.a, 0);
                }
                strY = com.github.catvod.spider.merge.p001b.g.y(new ArrayList());
            } catch (Throwable th) {
                throw th;
            }
        }
        return strY;
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int i;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        C0261h0 c0261h0 = this.g;
        c0261h0.getClass();
        try {
            i = Integer.parseInt(str2);
        } catch (Exception unused) {
            i = 1;
        }
        HashMap map = (HashMap) c0261h0.c;
        if (i <= 1) {
            map.clear();
        }
        ArrayList arrayList = new ArrayList();
        C0239a.e().getClass();
        boolean zOptBoolean = C0239a.j().optBoolean("searchFolderMode", true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = "/search_all?keyword=" + com.github.catvod.spider.merge.p018v.b.f(str) + "&page=" + i;
        X1 x1 = (X1) c0261h0.b;
        JSONObject jSONObjectX = x1.x(x1.m(str3));
        C0239a.e().getClass();
        HashSet hashSetF = C0239a.f();
        if (jSONObjectX != null && (jSONObjectOptJSONObject = jSONObjectX.optJSONObject("data")) != null) {
            String[][] strArr = com.github.catvod.spider.merge.p018v.b.a;
            char c = 0;
            int i2 = 0;
            while (i2 < 5) {
                String[] strArr2 = strArr[i2];
                if (hashSetF.contains(strArr2[c]) && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(strArr2[c])) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    while (i3 < jSONArrayOptJSONArray.length()) {
                        try {
                            arrayList2.add(com.github.catvod.spider.merge.p018v.b.l(strArr2[c], jSONArrayOptJSONArray.getJSONObject(i3)));
                        } catch (Exception unused2) {
                        }
                        i3++;
                        c = 0;
                    }
                    if (!zOptBoolean) {
                        arrayList.addAll(arrayList2);
                    } else if (!arrayList2.isEmpty()) {
                        String str4 = "_search_folder@@" + strArr2[0] + "_" + jCurrentTimeMillis;
                        arrayList.add(new k(str4, strArr2[1] + " (" + arrayList2.size() + "个)", AbstractC0302v0.x0(strArr2[0]), "", true));
                        map.put(str4, arrayList2);
                    }
                }
                i2++;
                c = 0;
            }
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        return this.f.b(str2);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        String[] strArr;
        String str = list.get(0);
        if ("_follows_live".equals(str)) {
            return com.github.catvod.spider.merge.p001b.g.s(com.github.catvod.spider.merge.p018v.b.c(str));
        }
        if (str != null && str.startsWith("_catp_")) {
            return com.github.catvod.spider.merge.p001b.g.s(com.github.catvod.spider.merge.p018v.b.c(str));
        }
        if (str != null && str.startsWith("_cat_")) {
            return com.github.catvod.spider.merge.p001b.g.s(com.github.catvod.spider.merge.p018v.b.c(str));
        }
        if ("bili_login".equals(str) || "settings".equals(str) || "search_display".equals(str) || "manage_follows".equals(str) || "manage_history".equals(str) || "manage_categories".equals(str) || "play_settings".equals(str) || "danmaku_settings".equals(str) || "danmaku_docs".equals(str) || "alllive_help".equals(str)) {
            AbstractC0302v0.g0(str, new i(1, this));
            return "";
        }
        com.github.catvod.spider.merge.p018v.c cVar = this.e;
        cVar.getClass();
        String strM368 = "bilibili";
        if (str == null) {
            strArr = new String[]{strM368, ""};
        } else {
            int iIndexOf = str.indexOf("_");
            strArr = iIndexOf > 0 ? new String[]{str.substring(0, iIndexOf), str.substring(iIndexOf + 1)} : new String[]{strM368, str};
        }
        return cVar.a(strArr[0], strArr[1], str, false);
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        if (this.h == null) {
            this.h = new C0246c0(this.a, this.b, new C0538n(com.github.catvod.spider.merge.p018v.b.a));
        }
        final C0246c0 c0246c0 = this.h;
        c0246c0.getClass();
        if ("bili_login".equals(str)) {
            InitOrigin.run(new A(20));
            return "";
        }
        if ("settings".equals(str)) {
            final int i = 0;
            InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.v.a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zOptBoolean;
                    boolean zOptBoolean2;
                    C0246c0 c0246c1 = c0246c0;
                    final int i2 = 0;
                    final int i3 = 1;
                    switch (i) {
                        case 0:
                            C0538n c0538n = (C0538n) c0246c1.c;
                            c0538n.getClass();
                            try {
                                Activity activity = InitOrigin.getActivity();
                                C0239a c0239aE = C0239a.e();
                                LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                StringBuilder sb = new StringBuilder("关注 ");
                                c0239aE.getClass();
                                sb.append(C0239a.l().length());
                                sb.append(" · 历史 ");
                                sb.append(C0239a.m().length());
                                View viewP = AbstractC0583w0.p(activity, "站点设置", sb.toString());
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                                linearLayoutK.addView(viewP, layoutParams);
                                AbstractC0583w0.g(linearLayoutK, "平台管理（关闭后首页和搜索将跳过该平台）");
                                LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                boolean[] zArr = new boolean[5];
                                HashSet hashSetF = C0239a.f();
                                int i4 = 0;
                                while (true) {
                                    String[][] strArr = b.a;
                                    if (i4 >= 5) {
                                        LinearLayout linearLayout = new LinearLayout(activity);
                                        linearLayout.setOrientation(1);
                                        linearLayout.setDescendantFocusability(262144);
                                        int i5 = 0;
                                        while (i5 < 5) {
                                            String str2 = strArr[i5][1];
                                            int[] iArr = C0538n.a;
                                            AbstractC0583w0.m(linearLayout, str2, null, iArr[i5 % iArr.length], zArr[i5], i5, i5 > 0, null, zArr, null);
                                            i5++;
                                        }
                                        linearLayoutY.addView(linearLayout);
                                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams2.bottomMargin = AbstractC0583w0.Q(12, activity);
                                        linearLayoutK.addView(linearLayoutY, layoutParams2);
                                        AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0503g(c0538n, zArr, c0239aE, 0)).setNeutralButton("清除历史", new P0(activity, c0239aE, 2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    } else {
                                        zArr[i4] = hashSetF.contains(strArr[i4][0]);
                                        i4++;
                                    }
                                }
                            } catch (Exception unused) {
                                X0.a("显示设置失败");
                                return;
                            }
                            break;
                        case 1:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity2 = InitOrigin.getActivity();
                                C0239a c0239aE2 = C0239a.e();
                                LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams3.bottomMargin = AbstractC0583w0.Q(12, activity2);
                                linearLayoutK2.addView(AbstractC0583w0.p(activity2, "搜索展示", "选择搜索结果的展示方式"), layoutParams3);
                                c0239aE2.getClass();
                                int[] iArr2 = {!C0239a.j().optBoolean("searchFolderMode", true) ? 1 : 0};
                                linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"文件夹(按平台分组)", "列表(直接展示)"}, new String[]{"搜索结果按直播平台归类", "直接展示所有直播间"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, iArr2, null));
                                AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(linearLayoutK2).setPositiveButton("确定", new P0(c0239aE2, iArr2, 1)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                            } catch (Exception unused2) {
                                X0.a("显示搜索设置失败");
                                return;
                            }
                            break;
                        case 2:
                            X1 x1 = (X1) c0246c1.a;
                            Objects.requireNonNull(x1);
                            i iVar = new i(20, x1);
                            e eVar = (e) c0246c1.b;
                            Objects.requireNonNull(eVar);
                            RunnableC0341a runnableC0341a = new RunnableC0341a(9, eVar);
                            C0538n c0538n2 = (C0538n) c0246c1.c;
                            c0538n2.getClass();
                            C0239a.e().getClass();
                            P1.L0("我的关注", "选择要使用的关注功能", new String[]{"解析分享链接", "管理关注列表"}, new String[]{"粘贴或扫码添加直播间", b.h("已关注 ", C0239a.l().length(), " 位主播")}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d}, new Runnable[]{new W(c0538n2, iVar, runnableC0341a, 1), new RunnableC0242b(c0538n2, runnableC0341a, 11)}, new A(29), false);
                            break;
                        case 3:
                            C0538n c0538n3 = (C0538n) c0246c1.c;
                            c0538n3.getClass();
                            try {
                                Activity activity3 = InitOrigin.getActivity();
                                C0239a c0239aE3 = C0239a.e();
                                c0239aE3.getClass();
                                JSONArray jSONArrayM = C0239a.m();
                                LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                                View viewP2 = AbstractC0583w0.p(activity3, "观看历史", "共 " + jSONArrayM.length() + " 条记录");
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams4.bottomMargin = AbstractC0583w0.Q(12, activity3);
                                linearLayoutK3.addView(viewP2, layoutParams4);
                                if (jSONArrayM.length() == 0) {
                                    linearLayoutK3.addView(AbstractC0583w0.D(activity3, "暂无观看记录"));
                                } else {
                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                    linearLayout2.setOrientation(1);
                                    c0538n3.b(linearLayout2, jSONArrayM);
                                    linearLayoutK3.addView(C0538n.c(activity3, linearLayout2));
                                }
                                AlertDialog.Builder negativeButton = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK3)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null);
                                if (jSONArrayM.length() > 0) {
                                    negativeButton.setNeutralButton("全部清除", new DialogInterfaceOnClickListenerC0518j(0, c0239aE3));
                                }
                                AbstractC0583w0.j0(negativeButton.create());
                            } catch (Exception unused3) {
                                X0.a("显示历史管理失败");
                                return;
                            }
                            break;
                        case 4:
                            c0246c1.getClass();
                            ((C0538n) c0246c1.c).g(new i(19, c0246c1));
                            break;
                        case 5:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity4 = InitOrigin.getActivity();
                                if (activity4 != null) {
                                    final C0239a c0239aE4 = C0239a.e();
                                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity4);
                                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams5.bottomMargin = AbstractC0583w0.Q(12, activity4);
                                    StringBuilder sb2 = new StringBuilder("已关注 ");
                                    c0239aE4.getClass();
                                    sb2.append(C0239a.l().length());
                                    sb2.append(" 位主播");
                                    linearLayoutK4.addView(AbstractC0583w0.p(activity4, "关注设置", sb2.toString()), layoutParams5);
                                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity4);
                                    try {
                                        zOptBoolean = C0239a.j().optBoolean("followPrompt", true);
                                    } catch (Exception unused4) {
                                        zOptBoolean = true;
                                    }
                                    try {
                                        zOptBoolean2 = C0239a.j().optBoolean("liveNotify", true);
                                    } catch (Exception unused5) {
                                        zOptBoolean2 = true;
                                    }
                                    final boolean[] zArr2 = {zOptBoolean, zOptBoolean2};
                                    LinearLayout linearLayout3 = new LinearLayout(activity4);
                                    linearLayout3.setOrientation(1);
                                    linearLayout3.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout3, "关注提醒", "播放时询问是否关注主播", AbstractC0583w0.c, zArr2[0], 0, false, null, zArr2, null);
                                    AbstractC0583w0.m(linearLayout3, "开播提醒", "加载时检查关注主播是否开播", AbstractC0583w0.d, zArr2[1], 1, true, null, zArr2, null);
                                    linearLayoutY2.addView(linearLayout3);
                                    linearLayoutK4.addView(linearLayoutY2);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity4).setView(AbstractC0583w0.q0(linearLayoutK4)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i6) {
                                            switch (i3) {
                                                case 0:
                                                    boolean[] zArr3 = zArr2;
                                                    boolean z = zArr3[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr3[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr4 = zArr2;
                                                    boolean z2 = zArr4[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr4[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    break;
                                }
                            } catch (Exception unused6) {
                                X0.a("显示关注设置失败");
                                return;
                            }
                            break;
                        default:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity5 = InitOrigin.getActivity();
                                if (activity5 != null) {
                                    final C0239a c0239aE5 = C0239a.e();
                                    LinearLayout linearLayoutK5 = AbstractC0583w0.K(activity5);
                                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams6.bottomMargin = AbstractC0583w0.Q(12, activity5);
                                    c0239aE5.getClass();
                                    linearLayoutK5.addView(AbstractC0583w0.p(activity5, "弹幕配置", "流式弹幕当前".concat(C0239a.g() ? "已开启" : "已关闭")), layoutParams6);
                                    LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity5);
                                    final boolean[] zArr3 = {C0239a.g()};
                                    LinearLayout linearLayout4 = new LinearLayout(activity5);
                                    linearLayout4.setOrientation(1);
                                    linearLayout4.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout4, "流式弹幕", "WebSocket 实时弹幕（快手暂不支持）", AbstractC0583w0.f, zArr3[0], 0, false, null, zArr3, null);
                                    linearLayoutY3.addView(linearLayout4);
                                    linearLayoutK5.addView(linearLayoutY3, AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity5)));
                                    AbstractC0583w0.g(linearLayoutK5, "兼容提醒");
                                    LinearLayout linearLayoutY4 = AbstractC0583w0.y(activity5);
                                    TextView textView = new TextView(activity5);
                                    textView.setText("推荐使用已完成适配的 Peek（PickTV）或 WebHTV\n支持哔哩、虎牙、斗鱼和抖音；快手暂不支持直播弹幕");
                                    textView.setTextSize(13.0f);
                                    textView.setTextColor(AbstractC0583w0.g);
                                    textView.setPadding(AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5), AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5));
                                    textView.setLineSpacing(AbstractC0583w0.Q(3, activity5), 1.0f);
                                    linearLayoutY4.addView(textView);
                                    linearLayoutK5.addView(linearLayoutY4);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity5).setView(AbstractC0583w0.q0(linearLayoutK5)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i6) {
                                            switch (i2) {
                                                case 0:
                                                    boolean[] zArr4 = zArr3;
                                                    boolean z = zArr4[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr3;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                }
                            } catch (Exception unused7) {
                                X0.a("显示弹幕配置失败");
                            }
                            break;
                    }
                }
            });
            return "";
        }
        if ("search_display".equals(str)) {
            final int i2 = 1;
            InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.v.a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zOptBoolean;
                    boolean zOptBoolean2;
                    C0246c0 c0246c1 = c0246c0;
                    final int i3 = 0;
                    final int i4 = 1;
                    switch (i2) {
                        case 0:
                            C0538n c0538n = (C0538n) c0246c1.c;
                            c0538n.getClass();
                            try {
                                Activity activity = InitOrigin.getActivity();
                                C0239a c0239aE = C0239a.e();
                                LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                StringBuilder sb = new StringBuilder("关注 ");
                                c0239aE.getClass();
                                sb.append(C0239a.l().length());
                                sb.append(" · 历史 ");
                                sb.append(C0239a.m().length());
                                View viewP = AbstractC0583w0.p(activity, "站点设置", sb.toString());
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                                linearLayoutK.addView(viewP, layoutParams);
                                AbstractC0583w0.g(linearLayoutK, "平台管理（关闭后首页和搜索将跳过该平台）");
                                LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                boolean[] zArr = new boolean[5];
                                HashSet hashSetF = C0239a.f();
                                int i5 = 0;
                                while (true) {
                                    String[][] strArr = b.a;
                                    if (i5 >= 5) {
                                        LinearLayout linearLayout = new LinearLayout(activity);
                                        linearLayout.setOrientation(1);
                                        linearLayout.setDescendantFocusability(262144);
                                        int i6 = 0;
                                        while (i6 < 5) {
                                            String str2 = strArr[i6][1];
                                            int[] iArr = C0538n.a;
                                            AbstractC0583w0.m(linearLayout, str2, null, iArr[i6 % iArr.length], zArr[i6], i6, i6 > 0, null, zArr, null);
                                            i6++;
                                        }
                                        linearLayoutY.addView(linearLayout);
                                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams2.bottomMargin = AbstractC0583w0.Q(12, activity);
                                        linearLayoutK.addView(linearLayoutY, layoutParams2);
                                        AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0503g(c0538n, zArr, c0239aE, 0)).setNeutralButton("清除历史", new P0(activity, c0239aE, 2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    } else {
                                        zArr[i5] = hashSetF.contains(strArr[i5][0]);
                                        i5++;
                                    }
                                }
                            } catch (Exception unused) {
                                X0.a("显示设置失败");
                                return;
                            }
                            break;
                        case 1:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity2 = InitOrigin.getActivity();
                                C0239a c0239aE2 = C0239a.e();
                                LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams3.bottomMargin = AbstractC0583w0.Q(12, activity2);
                                linearLayoutK2.addView(AbstractC0583w0.p(activity2, "搜索展示", "选择搜索结果的展示方式"), layoutParams3);
                                c0239aE2.getClass();
                                int[] iArr2 = {!C0239a.j().optBoolean("searchFolderMode", true) ? 1 : 0};
                                linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"文件夹(按平台分组)", "列表(直接展示)"}, new String[]{"搜索结果按直播平台归类", "直接展示所有直播间"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, iArr2, null));
                                AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(linearLayoutK2).setPositiveButton("确定", new P0(c0239aE2, iArr2, 1)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                            } catch (Exception unused2) {
                                X0.a("显示搜索设置失败");
                                return;
                            }
                            break;
                        case 2:
                            X1 x1 = (X1) c0246c1.a;
                            Objects.requireNonNull(x1);
                            i iVar = new i(20, x1);
                            e eVar = (e) c0246c1.b;
                            Objects.requireNonNull(eVar);
                            RunnableC0341a runnableC0341a = new RunnableC0341a(9, eVar);
                            C0538n c0538n2 = (C0538n) c0246c1.c;
                            c0538n2.getClass();
                            C0239a.e().getClass();
                            P1.L0("我的关注", "选择要使用的关注功能", new String[]{"解析分享链接", "管理关注列表"}, new String[]{"粘贴或扫码添加直播间", b.h("已关注 ", C0239a.l().length(), " 位主播")}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d}, new Runnable[]{new W(c0538n2, iVar, runnableC0341a, 1), new RunnableC0242b(c0538n2, runnableC0341a, 11)}, new A(29), false);
                            break;
                        case 3:
                            C0538n c0538n3 = (C0538n) c0246c1.c;
                            c0538n3.getClass();
                            try {
                                Activity activity3 = InitOrigin.getActivity();
                                C0239a c0239aE3 = C0239a.e();
                                c0239aE3.getClass();
                                JSONArray jSONArrayM = C0239a.m();
                                LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                                View viewP2 = AbstractC0583w0.p(activity3, "观看历史", "共 " + jSONArrayM.length() + " 条记录");
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams4.bottomMargin = AbstractC0583w0.Q(12, activity3);
                                linearLayoutK3.addView(viewP2, layoutParams4);
                                if (jSONArrayM.length() == 0) {
                                    linearLayoutK3.addView(AbstractC0583w0.D(activity3, "暂无观看记录"));
                                } else {
                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                    linearLayout2.setOrientation(1);
                                    c0538n3.b(linearLayout2, jSONArrayM);
                                    linearLayoutK3.addView(C0538n.c(activity3, linearLayout2));
                                }
                                AlertDialog.Builder negativeButton = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK3)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null);
                                if (jSONArrayM.length() > 0) {
                                    negativeButton.setNeutralButton("全部清除", new DialogInterfaceOnClickListenerC0518j(0, c0239aE3));
                                }
                                AbstractC0583w0.j0(negativeButton.create());
                            } catch (Exception unused3) {
                                X0.a("显示历史管理失败");
                                return;
                            }
                            break;
                        case 4:
                            c0246c1.getClass();
                            ((C0538n) c0246c1.c).g(new i(19, c0246c1));
                            break;
                        case 5:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity4 = InitOrigin.getActivity();
                                if (activity4 != null) {
                                    final C0239a c0239aE4 = C0239a.e();
                                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity4);
                                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams5.bottomMargin = AbstractC0583w0.Q(12, activity4);
                                    StringBuilder sb2 = new StringBuilder("已关注 ");
                                    c0239aE4.getClass();
                                    sb2.append(C0239a.l().length());
                                    sb2.append(" 位主播");
                                    linearLayoutK4.addView(AbstractC0583w0.p(activity4, "关注设置", sb2.toString()), layoutParams5);
                                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity4);
                                    try {
                                        zOptBoolean = C0239a.j().optBoolean("followPrompt", true);
                                    } catch (Exception unused4) {
                                        zOptBoolean = true;
                                    }
                                    try {
                                        zOptBoolean2 = C0239a.j().optBoolean("liveNotify", true);
                                    } catch (Exception unused5) {
                                        zOptBoolean2 = true;
                                    }
                                    final boolean[] zArr2 = {zOptBoolean, zOptBoolean2};
                                    LinearLayout linearLayout3 = new LinearLayout(activity4);
                                    linearLayout3.setOrientation(1);
                                    linearLayout3.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout3, "关注提醒", "播放时询问是否关注主播", AbstractC0583w0.c, zArr2[0], 0, false, null, zArr2, null);
                                    AbstractC0583w0.m(linearLayout3, "开播提醒", "加载时检查关注主播是否开播", AbstractC0583w0.d, zArr2[1], 1, true, null, zArr2, null);
                                    linearLayoutY2.addView(linearLayout3);
                                    linearLayoutK4.addView(linearLayoutY2);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity4).setView(AbstractC0583w0.q0(linearLayoutK4)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i7) {
                                            switch (i4) {
                                                case 0:
                                                    boolean[] zArr4 = zArr2;
                                                    boolean z = zArr4[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr2;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    break;
                                }
                            } catch (Exception unused6) {
                                X0.a("显示关注设置失败");
                                return;
                            }
                            break;
                        default:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity5 = InitOrigin.getActivity();
                                if (activity5 != null) {
                                    final C0239a c0239aE5 = C0239a.e();
                                    LinearLayout linearLayoutK5 = AbstractC0583w0.K(activity5);
                                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams6.bottomMargin = AbstractC0583w0.Q(12, activity5);
                                    c0239aE5.getClass();
                                    linearLayoutK5.addView(AbstractC0583w0.p(activity5, "弹幕配置", "流式弹幕当前".concat(C0239a.g() ? "已开启" : "已关闭")), layoutParams6);
                                    LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity5);
                                    final boolean[] zArr3 = {C0239a.g()};
                                    LinearLayout linearLayout4 = new LinearLayout(activity5);
                                    linearLayout4.setOrientation(1);
                                    linearLayout4.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout4, "流式弹幕", "WebSocket 实时弹幕（快手暂不支持）", AbstractC0583w0.f, zArr3[0], 0, false, null, zArr3, null);
                                    linearLayoutY3.addView(linearLayout4);
                                    linearLayoutK5.addView(linearLayoutY3, AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity5)));
                                    AbstractC0583w0.g(linearLayoutK5, "兼容提醒");
                                    LinearLayout linearLayoutY4 = AbstractC0583w0.y(activity5);
                                    TextView textView = new TextView(activity5);
                                    textView.setText("推荐使用已完成适配的 Peek（PickTV）或 WebHTV\n支持哔哩、虎牙、斗鱼和抖音；快手暂不支持直播弹幕");
                                    textView.setTextSize(13.0f);
                                    textView.setTextColor(AbstractC0583w0.g);
                                    textView.setPadding(AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5), AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5));
                                    textView.setLineSpacing(AbstractC0583w0.Q(3, activity5), 1.0f);
                                    linearLayoutY4.addView(textView);
                                    linearLayoutK5.addView(linearLayoutY4);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity5).setView(AbstractC0583w0.q0(linearLayoutK5)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i7) {
                                            switch (i3) {
                                                case 0:
                                                    boolean[] zArr4 = zArr3;
                                                    boolean z = zArr4[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr3;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                }
                            } catch (Exception unused7) {
                                X0.a("显示弹幕配置失败");
                            }
                            break;
                    }
                }
            });
            return "";
        }
        if ("manage_follows".equals(str)) {
            final int i3 = 2;
            InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.v.a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zOptBoolean;
                    boolean zOptBoolean2;
                    C0246c0 c0246c1 = c0246c0;
                    final int i4 = 0;
                    final int i5 = 1;
                    switch (i3) {
                        case 0:
                            C0538n c0538n = (C0538n) c0246c1.c;
                            c0538n.getClass();
                            try {
                                Activity activity = InitOrigin.getActivity();
                                C0239a c0239aE = C0239a.e();
                                LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                StringBuilder sb = new StringBuilder("关注 ");
                                c0239aE.getClass();
                                sb.append(C0239a.l().length());
                                sb.append(" · 历史 ");
                                sb.append(C0239a.m().length());
                                View viewP = AbstractC0583w0.p(activity, "站点设置", sb.toString());
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                                linearLayoutK.addView(viewP, layoutParams);
                                AbstractC0583w0.g(linearLayoutK, "平台管理（关闭后首页和搜索将跳过该平台）");
                                LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                boolean[] zArr = new boolean[5];
                                HashSet hashSetF = C0239a.f();
                                int i6 = 0;
                                while (true) {
                                    String[][] strArr = b.a;
                                    if (i6 >= 5) {
                                        LinearLayout linearLayout = new LinearLayout(activity);
                                        linearLayout.setOrientation(1);
                                        linearLayout.setDescendantFocusability(262144);
                                        int i7 = 0;
                                        while (i7 < 5) {
                                            String str2 = strArr[i7][1];
                                            int[] iArr = C0538n.a;
                                            AbstractC0583w0.m(linearLayout, str2, null, iArr[i7 % iArr.length], zArr[i7], i7, i7 > 0, null, zArr, null);
                                            i7++;
                                        }
                                        linearLayoutY.addView(linearLayout);
                                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams2.bottomMargin = AbstractC0583w0.Q(12, activity);
                                        linearLayoutK.addView(linearLayoutY, layoutParams2);
                                        AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0503g(c0538n, zArr, c0239aE, 0)).setNeutralButton("清除历史", new P0(activity, c0239aE, 2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    } else {
                                        zArr[i6] = hashSetF.contains(strArr[i6][0]);
                                        i6++;
                                    }
                                }
                            } catch (Exception unused) {
                                X0.a("显示设置失败");
                                return;
                            }
                            break;
                        case 1:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity2 = InitOrigin.getActivity();
                                C0239a c0239aE2 = C0239a.e();
                                LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams3.bottomMargin = AbstractC0583w0.Q(12, activity2);
                                linearLayoutK2.addView(AbstractC0583w0.p(activity2, "搜索展示", "选择搜索结果的展示方式"), layoutParams3);
                                c0239aE2.getClass();
                                int[] iArr2 = {!C0239a.j().optBoolean("searchFolderMode", true) ? 1 : 0};
                                linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"文件夹(按平台分组)", "列表(直接展示)"}, new String[]{"搜索结果按直播平台归类", "直接展示所有直播间"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, iArr2, null));
                                AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(linearLayoutK2).setPositiveButton("确定", new P0(c0239aE2, iArr2, 1)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                            } catch (Exception unused2) {
                                X0.a("显示搜索设置失败");
                                return;
                            }
                            break;
                        case 2:
                            X1 x1 = (X1) c0246c1.a;
                            Objects.requireNonNull(x1);
                            i iVar = new i(20, x1);
                            e eVar = (e) c0246c1.b;
                            Objects.requireNonNull(eVar);
                            RunnableC0341a runnableC0341a = new RunnableC0341a(9, eVar);
                            C0538n c0538n2 = (C0538n) c0246c1.c;
                            c0538n2.getClass();
                            C0239a.e().getClass();
                            P1.L0("我的关注", "选择要使用的关注功能", new String[]{"解析分享链接", "管理关注列表"}, new String[]{"粘贴或扫码添加直播间", b.h("已关注 ", C0239a.l().length(), " 位主播")}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d}, new Runnable[]{new W(c0538n2, iVar, runnableC0341a, 1), new RunnableC0242b(c0538n2, runnableC0341a, 11)}, new A(29), false);
                            break;
                        case 3:
                            C0538n c0538n3 = (C0538n) c0246c1.c;
                            c0538n3.getClass();
                            try {
                                Activity activity3 = InitOrigin.getActivity();
                                C0239a c0239aE3 = C0239a.e();
                                c0239aE3.getClass();
                                JSONArray jSONArrayM = C0239a.m();
                                LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                                View viewP2 = AbstractC0583w0.p(activity3, "观看历史", "共 " + jSONArrayM.length() + " 条记录");
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams4.bottomMargin = AbstractC0583w0.Q(12, activity3);
                                linearLayoutK3.addView(viewP2, layoutParams4);
                                if (jSONArrayM.length() == 0) {
                                    linearLayoutK3.addView(AbstractC0583w0.D(activity3, "暂无观看记录"));
                                } else {
                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                    linearLayout2.setOrientation(1);
                                    c0538n3.b(linearLayout2, jSONArrayM);
                                    linearLayoutK3.addView(C0538n.c(activity3, linearLayout2));
                                }
                                AlertDialog.Builder negativeButton = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK3)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null);
                                if (jSONArrayM.length() > 0) {
                                    negativeButton.setNeutralButton("全部清除", new DialogInterfaceOnClickListenerC0518j(0, c0239aE3));
                                }
                                AbstractC0583w0.j0(negativeButton.create());
                            } catch (Exception unused3) {
                                X0.a("显示历史管理失败");
                                return;
                            }
                            break;
                        case 4:
                            c0246c1.getClass();
                            ((C0538n) c0246c1.c).g(new i(19, c0246c1));
                            break;
                        case 5:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity4 = InitOrigin.getActivity();
                                if (activity4 != null) {
                                    final C0239a c0239aE4 = C0239a.e();
                                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity4);
                                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams5.bottomMargin = AbstractC0583w0.Q(12, activity4);
                                    StringBuilder sb2 = new StringBuilder("已关注 ");
                                    c0239aE4.getClass();
                                    sb2.append(C0239a.l().length());
                                    sb2.append(" 位主播");
                                    linearLayoutK4.addView(AbstractC0583w0.p(activity4, "关注设置", sb2.toString()), layoutParams5);
                                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity4);
                                    try {
                                        zOptBoolean = C0239a.j().optBoolean("followPrompt", true);
                                    } catch (Exception unused4) {
                                        zOptBoolean = true;
                                    }
                                    try {
                                        zOptBoolean2 = C0239a.j().optBoolean("liveNotify", true);
                                    } catch (Exception unused5) {
                                        zOptBoolean2 = true;
                                    }
                                    final boolean[] zArr2 = {zOptBoolean, zOptBoolean2};
                                    LinearLayout linearLayout3 = new LinearLayout(activity4);
                                    linearLayout3.setOrientation(1);
                                    linearLayout3.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout3, "关注提醒", "播放时询问是否关注主播", AbstractC0583w0.c, zArr2[0], 0, false, null, zArr2, null);
                                    AbstractC0583w0.m(linearLayout3, "开播提醒", "加载时检查关注主播是否开播", AbstractC0583w0.d, zArr2[1], 1, true, null, zArr2, null);
                                    linearLayoutY2.addView(linearLayout3);
                                    linearLayoutK4.addView(linearLayoutY2);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity4).setView(AbstractC0583w0.q0(linearLayoutK4)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i8) {
                                            switch (i5) {
                                                case 0:
                                                    boolean[] zArr4 = zArr2;
                                                    boolean z = zArr4[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr2;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    break;
                                }
                            } catch (Exception unused6) {
                                X0.a("显示关注设置失败");
                                return;
                            }
                            break;
                        default:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity5 = InitOrigin.getActivity();
                                if (activity5 != null) {
                                    final C0239a c0239aE5 = C0239a.e();
                                    LinearLayout linearLayoutK5 = AbstractC0583w0.K(activity5);
                                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams6.bottomMargin = AbstractC0583w0.Q(12, activity5);
                                    c0239aE5.getClass();
                                    linearLayoutK5.addView(AbstractC0583w0.p(activity5, "弹幕配置", "流式弹幕当前".concat(C0239a.g() ? "已开启" : "已关闭")), layoutParams6);
                                    LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity5);
                                    final boolean[] zArr3 = {C0239a.g()};
                                    LinearLayout linearLayout4 = new LinearLayout(activity5);
                                    linearLayout4.setOrientation(1);
                                    linearLayout4.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout4, "流式弹幕", "WebSocket 实时弹幕（快手暂不支持）", AbstractC0583w0.f, zArr3[0], 0, false, null, zArr3, null);
                                    linearLayoutY3.addView(linearLayout4);
                                    linearLayoutK5.addView(linearLayoutY3, AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity5)));
                                    AbstractC0583w0.g(linearLayoutK5, "兼容提醒");
                                    LinearLayout linearLayoutY4 = AbstractC0583w0.y(activity5);
                                    TextView textView = new TextView(activity5);
                                    textView.setText("推荐使用已完成适配的 Peek（PickTV）或 WebHTV\n支持哔哩、虎牙、斗鱼和抖音；快手暂不支持直播弹幕");
                                    textView.setTextSize(13.0f);
                                    textView.setTextColor(AbstractC0583w0.g);
                                    textView.setPadding(AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5), AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5));
                                    textView.setLineSpacing(AbstractC0583w0.Q(3, activity5), 1.0f);
                                    linearLayoutY4.addView(textView);
                                    linearLayoutK5.addView(linearLayoutY4);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity5).setView(AbstractC0583w0.q0(linearLayoutK5)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i8) {
                                            switch (i4) {
                                                case 0:
                                                    boolean[] zArr4 = zArr3;
                                                    boolean z = zArr4[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr3;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                }
                            } catch (Exception unused7) {
                                X0.a("显示弹幕配置失败");
                            }
                            break;
                    }
                }
            });
            return "";
        }
        if ("manage_history".equals(str)) {
            final int i4 = 3;
            InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.v.a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zOptBoolean;
                    boolean zOptBoolean2;
                    C0246c0 c0246c1 = c0246c0;
                    final int i5 = 0;
                    final int i6 = 1;
                    switch (i4) {
                        case 0:
                            C0538n c0538n = (C0538n) c0246c1.c;
                            c0538n.getClass();
                            try {
                                Activity activity = InitOrigin.getActivity();
                                C0239a c0239aE = C0239a.e();
                                LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                StringBuilder sb = new StringBuilder("关注 ");
                                c0239aE.getClass();
                                sb.append(C0239a.l().length());
                                sb.append(" · 历史 ");
                                sb.append(C0239a.m().length());
                                View viewP = AbstractC0583w0.p(activity, "站点设置", sb.toString());
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                                linearLayoutK.addView(viewP, layoutParams);
                                AbstractC0583w0.g(linearLayoutK, "平台管理（关闭后首页和搜索将跳过该平台）");
                                LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                boolean[] zArr = new boolean[5];
                                HashSet hashSetF = C0239a.f();
                                int i7 = 0;
                                while (true) {
                                    String[][] strArr = b.a;
                                    if (i7 >= 5) {
                                        LinearLayout linearLayout = new LinearLayout(activity);
                                        linearLayout.setOrientation(1);
                                        linearLayout.setDescendantFocusability(262144);
                                        int i8 = 0;
                                        while (i8 < 5) {
                                            String str2 = strArr[i8][1];
                                            int[] iArr = C0538n.a;
                                            AbstractC0583w0.m(linearLayout, str2, null, iArr[i8 % iArr.length], zArr[i8], i8, i8 > 0, null, zArr, null);
                                            i8++;
                                        }
                                        linearLayoutY.addView(linearLayout);
                                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams2.bottomMargin = AbstractC0583w0.Q(12, activity);
                                        linearLayoutK.addView(linearLayoutY, layoutParams2);
                                        AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0503g(c0538n, zArr, c0239aE, 0)).setNeutralButton("清除历史", new P0(activity, c0239aE, 2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    } else {
                                        zArr[i7] = hashSetF.contains(strArr[i7][0]);
                                        i7++;
                                    }
                                }
                            } catch (Exception unused) {
                                X0.a("显示设置失败");
                                return;
                            }
                            break;
                        case 1:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity2 = InitOrigin.getActivity();
                                C0239a c0239aE2 = C0239a.e();
                                LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams3.bottomMargin = AbstractC0583w0.Q(12, activity2);
                                linearLayoutK2.addView(AbstractC0583w0.p(activity2, "搜索展示", "选择搜索结果的展示方式"), layoutParams3);
                                c0239aE2.getClass();
                                int[] iArr2 = {!C0239a.j().optBoolean("searchFolderMode", true) ? 1 : 0};
                                linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"文件夹(按平台分组)", "列表(直接展示)"}, new String[]{"搜索结果按直播平台归类", "直接展示所有直播间"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, iArr2, null));
                                AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(linearLayoutK2).setPositiveButton("确定", new P0(c0239aE2, iArr2, 1)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                            } catch (Exception unused2) {
                                X0.a("显示搜索设置失败");
                                return;
                            }
                            break;
                        case 2:
                            X1 x1 = (X1) c0246c1.a;
                            Objects.requireNonNull(x1);
                            i iVar = new i(20, x1);
                            e eVar = (e) c0246c1.b;
                            Objects.requireNonNull(eVar);
                            RunnableC0341a runnableC0341a = new RunnableC0341a(9, eVar);
                            C0538n c0538n2 = (C0538n) c0246c1.c;
                            c0538n2.getClass();
                            C0239a.e().getClass();
                            P1.L0("我的关注", "选择要使用的关注功能", new String[]{"解析分享链接", "管理关注列表"}, new String[]{"粘贴或扫码添加直播间", b.h("已关注 ", C0239a.l().length(), " 位主播")}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d}, new Runnable[]{new W(c0538n2, iVar, runnableC0341a, 1), new RunnableC0242b(c0538n2, runnableC0341a, 11)}, new A(29), false);
                            break;
                        case 3:
                            C0538n c0538n3 = (C0538n) c0246c1.c;
                            c0538n3.getClass();
                            try {
                                Activity activity3 = InitOrigin.getActivity();
                                C0239a c0239aE3 = C0239a.e();
                                c0239aE3.getClass();
                                JSONArray jSONArrayM = C0239a.m();
                                LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                                View viewP2 = AbstractC0583w0.p(activity3, "观看历史", "共 " + jSONArrayM.length() + " 条记录");
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams4.bottomMargin = AbstractC0583w0.Q(12, activity3);
                                linearLayoutK3.addView(viewP2, layoutParams4);
                                if (jSONArrayM.length() == 0) {
                                    linearLayoutK3.addView(AbstractC0583w0.D(activity3, "暂无观看记录"));
                                } else {
                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                    linearLayout2.setOrientation(1);
                                    c0538n3.b(linearLayout2, jSONArrayM);
                                    linearLayoutK3.addView(C0538n.c(activity3, linearLayout2));
                                }
                                AlertDialog.Builder negativeButton = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK3)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null);
                                if (jSONArrayM.length() > 0) {
                                    negativeButton.setNeutralButton("全部清除", new DialogInterfaceOnClickListenerC0518j(0, c0239aE3));
                                }
                                AbstractC0583w0.j0(negativeButton.create());
                            } catch (Exception unused3) {
                                X0.a("显示历史管理失败");
                                return;
                            }
                            break;
                        case 4:
                            c0246c1.getClass();
                            ((C0538n) c0246c1.c).g(new i(19, c0246c1));
                            break;
                        case 5:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity4 = InitOrigin.getActivity();
                                if (activity4 != null) {
                                    final C0239a c0239aE4 = C0239a.e();
                                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity4);
                                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams5.bottomMargin = AbstractC0583w0.Q(12, activity4);
                                    StringBuilder sb2 = new StringBuilder("已关注 ");
                                    c0239aE4.getClass();
                                    sb2.append(C0239a.l().length());
                                    sb2.append(" 位主播");
                                    linearLayoutK4.addView(AbstractC0583w0.p(activity4, "关注设置", sb2.toString()), layoutParams5);
                                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity4);
                                    try {
                                        zOptBoolean = C0239a.j().optBoolean("followPrompt", true);
                                    } catch (Exception unused4) {
                                        zOptBoolean = true;
                                    }
                                    try {
                                        zOptBoolean2 = C0239a.j().optBoolean("liveNotify", true);
                                    } catch (Exception unused5) {
                                        zOptBoolean2 = true;
                                    }
                                    final boolean[] zArr2 = {zOptBoolean, zOptBoolean2};
                                    LinearLayout linearLayout3 = new LinearLayout(activity4);
                                    linearLayout3.setOrientation(1);
                                    linearLayout3.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout3, "关注提醒", "播放时询问是否关注主播", AbstractC0583w0.c, zArr2[0], 0, false, null, zArr2, null);
                                    AbstractC0583w0.m(linearLayout3, "开播提醒", "加载时检查关注主播是否开播", AbstractC0583w0.d, zArr2[1], 1, true, null, zArr2, null);
                                    linearLayoutY2.addView(linearLayout3);
                                    linearLayoutK4.addView(linearLayoutY2);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity4).setView(AbstractC0583w0.q0(linearLayoutK4)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i9) {
                                            switch (i6) {
                                                case 0:
                                                    boolean[] zArr4 = zArr2;
                                                    boolean z = zArr4[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr2;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    break;
                                }
                            } catch (Exception unused6) {
                                X0.a("显示关注设置失败");
                                return;
                            }
                            break;
                        default:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity5 = InitOrigin.getActivity();
                                if (activity5 != null) {
                                    final C0239a c0239aE5 = C0239a.e();
                                    LinearLayout linearLayoutK5 = AbstractC0583w0.K(activity5);
                                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams6.bottomMargin = AbstractC0583w0.Q(12, activity5);
                                    c0239aE5.getClass();
                                    linearLayoutK5.addView(AbstractC0583w0.p(activity5, "弹幕配置", "流式弹幕当前".concat(C0239a.g() ? "已开启" : "已关闭")), layoutParams6);
                                    LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity5);
                                    final boolean[] zArr3 = {C0239a.g()};
                                    LinearLayout linearLayout4 = new LinearLayout(activity5);
                                    linearLayout4.setOrientation(1);
                                    linearLayout4.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout4, "流式弹幕", "WebSocket 实时弹幕（快手暂不支持）", AbstractC0583w0.f, zArr3[0], 0, false, null, zArr3, null);
                                    linearLayoutY3.addView(linearLayout4);
                                    linearLayoutK5.addView(linearLayoutY3, AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity5)));
                                    AbstractC0583w0.g(linearLayoutK5, "兼容提醒");
                                    LinearLayout linearLayoutY4 = AbstractC0583w0.y(activity5);
                                    TextView textView = new TextView(activity5);
                                    textView.setText("推荐使用已完成适配的 Peek（PickTV）或 WebHTV\n支持哔哩、虎牙、斗鱼和抖音；快手暂不支持直播弹幕");
                                    textView.setTextSize(13.0f);
                                    textView.setTextColor(AbstractC0583w0.g);
                                    textView.setPadding(AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5), AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5));
                                    textView.setLineSpacing(AbstractC0583w0.Q(3, activity5), 1.0f);
                                    linearLayoutY4.addView(textView);
                                    linearLayoutK5.addView(linearLayoutY4);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity5).setView(AbstractC0583w0.q0(linearLayoutK5)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i9) {
                                            switch (i5) {
                                                case 0:
                                                    boolean[] zArr4 = zArr3;
                                                    boolean z = zArr4[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr3;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                }
                            } catch (Exception unused7) {
                                X0.a("显示弹幕配置失败");
                            }
                            break;
                    }
                }
            });
            return "";
        }
        if ("manage_categories".equals(str)) {
            final int i5 = 4;
            InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.v.a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zOptBoolean;
                    boolean zOptBoolean2;
                    C0246c0 c0246c1 = c0246c0;
                    final int i6 = 0;
                    final int i7 = 1;
                    switch (i5) {
                        case 0:
                            C0538n c0538n = (C0538n) c0246c1.c;
                            c0538n.getClass();
                            try {
                                Activity activity = InitOrigin.getActivity();
                                C0239a c0239aE = C0239a.e();
                                LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                StringBuilder sb = new StringBuilder("关注 ");
                                c0239aE.getClass();
                                sb.append(C0239a.l().length());
                                sb.append(" · 历史 ");
                                sb.append(C0239a.m().length());
                                View viewP = AbstractC0583w0.p(activity, "站点设置", sb.toString());
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                                linearLayoutK.addView(viewP, layoutParams);
                                AbstractC0583w0.g(linearLayoutK, "平台管理（关闭后首页和搜索将跳过该平台）");
                                LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                boolean[] zArr = new boolean[5];
                                HashSet hashSetF = C0239a.f();
                                int i8 = 0;
                                while (true) {
                                    String[][] strArr = b.a;
                                    if (i8 >= 5) {
                                        LinearLayout linearLayout = new LinearLayout(activity);
                                        linearLayout.setOrientation(1);
                                        linearLayout.setDescendantFocusability(262144);
                                        int i9 = 0;
                                        while (i9 < 5) {
                                            String str2 = strArr[i9][1];
                                            int[] iArr = C0538n.a;
                                            AbstractC0583w0.m(linearLayout, str2, null, iArr[i9 % iArr.length], zArr[i9], i9, i9 > 0, null, zArr, null);
                                            i9++;
                                        }
                                        linearLayoutY.addView(linearLayout);
                                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams2.bottomMargin = AbstractC0583w0.Q(12, activity);
                                        linearLayoutK.addView(linearLayoutY, layoutParams2);
                                        AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0503g(c0538n, zArr, c0239aE, 0)).setNeutralButton("清除历史", new P0(activity, c0239aE, 2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    } else {
                                        zArr[i8] = hashSetF.contains(strArr[i8][0]);
                                        i8++;
                                    }
                                }
                            } catch (Exception unused) {
                                X0.a("显示设置失败");
                                return;
                            }
                            break;
                        case 1:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity2 = InitOrigin.getActivity();
                                C0239a c0239aE2 = C0239a.e();
                                LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams3.bottomMargin = AbstractC0583w0.Q(12, activity2);
                                linearLayoutK2.addView(AbstractC0583w0.p(activity2, "搜索展示", "选择搜索结果的展示方式"), layoutParams3);
                                c0239aE2.getClass();
                                int[] iArr2 = {!C0239a.j().optBoolean("searchFolderMode", true) ? 1 : 0};
                                linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"文件夹(按平台分组)", "列表(直接展示)"}, new String[]{"搜索结果按直播平台归类", "直接展示所有直播间"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, iArr2, null));
                                AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(linearLayoutK2).setPositiveButton("确定", new P0(c0239aE2, iArr2, 1)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                            } catch (Exception unused2) {
                                X0.a("显示搜索设置失败");
                                return;
                            }
                            break;
                        case 2:
                            X1 x1 = (X1) c0246c1.a;
                            Objects.requireNonNull(x1);
                            i iVar = new i(20, x1);
                            e eVar = (e) c0246c1.b;
                            Objects.requireNonNull(eVar);
                            RunnableC0341a runnableC0341a = new RunnableC0341a(9, eVar);
                            C0538n c0538n2 = (C0538n) c0246c1.c;
                            c0538n2.getClass();
                            C0239a.e().getClass();
                            P1.L0("我的关注", "选择要使用的关注功能", new String[]{"解析分享链接", "管理关注列表"}, new String[]{"粘贴或扫码添加直播间", b.h("已关注 ", C0239a.l().length(), " 位主播")}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d}, new Runnable[]{new W(c0538n2, iVar, runnableC0341a, 1), new RunnableC0242b(c0538n2, runnableC0341a, 11)}, new A(29), false);
                            break;
                        case 3:
                            C0538n c0538n3 = (C0538n) c0246c1.c;
                            c0538n3.getClass();
                            try {
                                Activity activity3 = InitOrigin.getActivity();
                                C0239a c0239aE3 = C0239a.e();
                                c0239aE3.getClass();
                                JSONArray jSONArrayM = C0239a.m();
                                LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                                View viewP2 = AbstractC0583w0.p(activity3, "观看历史", "共 " + jSONArrayM.length() + " 条记录");
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams4.bottomMargin = AbstractC0583w0.Q(12, activity3);
                                linearLayoutK3.addView(viewP2, layoutParams4);
                                if (jSONArrayM.length() == 0) {
                                    linearLayoutK3.addView(AbstractC0583w0.D(activity3, "暂无观看记录"));
                                } else {
                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                    linearLayout2.setOrientation(1);
                                    c0538n3.b(linearLayout2, jSONArrayM);
                                    linearLayoutK3.addView(C0538n.c(activity3, linearLayout2));
                                }
                                AlertDialog.Builder negativeButton = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK3)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null);
                                if (jSONArrayM.length() > 0) {
                                    negativeButton.setNeutralButton("全部清除", new DialogInterfaceOnClickListenerC0518j(0, c0239aE3));
                                }
                                AbstractC0583w0.j0(negativeButton.create());
                            } catch (Exception unused3) {
                                X0.a("显示历史管理失败");
                                return;
                            }
                            break;
                        case 4:
                            c0246c1.getClass();
                            ((C0538n) c0246c1.c).g(new i(19, c0246c1));
                            break;
                        case 5:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity4 = InitOrigin.getActivity();
                                if (activity4 != null) {
                                    final C0239a c0239aE4 = C0239a.e();
                                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity4);
                                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams5.bottomMargin = AbstractC0583w0.Q(12, activity4);
                                    StringBuilder sb2 = new StringBuilder("已关注 ");
                                    c0239aE4.getClass();
                                    sb2.append(C0239a.l().length());
                                    sb2.append(" 位主播");
                                    linearLayoutK4.addView(AbstractC0583w0.p(activity4, "关注设置", sb2.toString()), layoutParams5);
                                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity4);
                                    try {
                                        zOptBoolean = C0239a.j().optBoolean("followPrompt", true);
                                    } catch (Exception unused4) {
                                        zOptBoolean = true;
                                    }
                                    try {
                                        zOptBoolean2 = C0239a.j().optBoolean("liveNotify", true);
                                    } catch (Exception unused5) {
                                        zOptBoolean2 = true;
                                    }
                                    final boolean[] zArr2 = {zOptBoolean, zOptBoolean2};
                                    LinearLayout linearLayout3 = new LinearLayout(activity4);
                                    linearLayout3.setOrientation(1);
                                    linearLayout3.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout3, "关注提醒", "播放时询问是否关注主播", AbstractC0583w0.c, zArr2[0], 0, false, null, zArr2, null);
                                    AbstractC0583w0.m(linearLayout3, "开播提醒", "加载时检查关注主播是否开播", AbstractC0583w0.d, zArr2[1], 1, true, null, zArr2, null);
                                    linearLayoutY2.addView(linearLayout3);
                                    linearLayoutK4.addView(linearLayoutY2);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity4).setView(AbstractC0583w0.q0(linearLayoutK4)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            switch (i7) {
                                                case 0:
                                                    boolean[] zArr4 = zArr2;
                                                    boolean z = zArr4[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr2;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    break;
                                }
                            } catch (Exception unused6) {
                                X0.a("显示关注设置失败");
                                return;
                            }
                            break;
                        default:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity5 = InitOrigin.getActivity();
                                if (activity5 != null) {
                                    final C0239a c0239aE5 = C0239a.e();
                                    LinearLayout linearLayoutK5 = AbstractC0583w0.K(activity5);
                                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams6.bottomMargin = AbstractC0583w0.Q(12, activity5);
                                    c0239aE5.getClass();
                                    linearLayoutK5.addView(AbstractC0583w0.p(activity5, "弹幕配置", "流式弹幕当前".concat(C0239a.g() ? "已开启" : "已关闭")), layoutParams6);
                                    LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity5);
                                    final boolean[] zArr3 = {C0239a.g()};
                                    LinearLayout linearLayout4 = new LinearLayout(activity5);
                                    linearLayout4.setOrientation(1);
                                    linearLayout4.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout4, "流式弹幕", "WebSocket 实时弹幕（快手暂不支持）", AbstractC0583w0.f, zArr3[0], 0, false, null, zArr3, null);
                                    linearLayoutY3.addView(linearLayout4);
                                    linearLayoutK5.addView(linearLayoutY3, AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity5)));
                                    AbstractC0583w0.g(linearLayoutK5, "兼容提醒");
                                    LinearLayout linearLayoutY4 = AbstractC0583w0.y(activity5);
                                    TextView textView = new TextView(activity5);
                                    textView.setText("推荐使用已完成适配的 Peek（PickTV）或 WebHTV\n支持哔哩、虎牙、斗鱼和抖音；快手暂不支持直播弹幕");
                                    textView.setTextSize(13.0f);
                                    textView.setTextColor(AbstractC0583w0.g);
                                    textView.setPadding(AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5), AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5));
                                    textView.setLineSpacing(AbstractC0583w0.Q(3, activity5), 1.0f);
                                    linearLayoutY4.addView(textView);
                                    linearLayoutK5.addView(linearLayoutY4);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity5).setView(AbstractC0583w0.q0(linearLayoutK5)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            switch (i6) {
                                                case 0:
                                                    boolean[] zArr4 = zArr3;
                                                    boolean z = zArr4[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr3;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                }
                            } catch (Exception unused7) {
                                X0.a("显示弹幕配置失败");
                            }
                            break;
                    }
                }
            });
            return "";
        }
        if ("play_settings".equals(str)) {
            final int i6 = 5;
            InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.v.a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zOptBoolean;
                    boolean zOptBoolean2;
                    C0246c0 c0246c1 = c0246c0;
                    final int i7 = 0;
                    final int i8 = 1;
                    switch (i6) {
                        case 0:
                            C0538n c0538n = (C0538n) c0246c1.c;
                            c0538n.getClass();
                            try {
                                Activity activity = InitOrigin.getActivity();
                                C0239a c0239aE = C0239a.e();
                                LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                StringBuilder sb = new StringBuilder("关注 ");
                                c0239aE.getClass();
                                sb.append(C0239a.l().length());
                                sb.append(" · 历史 ");
                                sb.append(C0239a.m().length());
                                View viewP = AbstractC0583w0.p(activity, "站点设置", sb.toString());
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                                linearLayoutK.addView(viewP, layoutParams);
                                AbstractC0583w0.g(linearLayoutK, "平台管理（关闭后首页和搜索将跳过该平台）");
                                LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                boolean[] zArr = new boolean[5];
                                HashSet hashSetF = C0239a.f();
                                int i9 = 0;
                                while (true) {
                                    String[][] strArr = b.a;
                                    if (i9 >= 5) {
                                        LinearLayout linearLayout = new LinearLayout(activity);
                                        linearLayout.setOrientation(1);
                                        linearLayout.setDescendantFocusability(262144);
                                        int i10 = 0;
                                        while (i10 < 5) {
                                            String str2 = strArr[i10][1];
                                            int[] iArr = C0538n.a;
                                            AbstractC0583w0.m(linearLayout, str2, null, iArr[i10 % iArr.length], zArr[i10], i10, i10 > 0, null, zArr, null);
                                            i10++;
                                        }
                                        linearLayoutY.addView(linearLayout);
                                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams2.bottomMargin = AbstractC0583w0.Q(12, activity);
                                        linearLayoutK.addView(linearLayoutY, layoutParams2);
                                        AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0503g(c0538n, zArr, c0239aE, 0)).setNeutralButton("清除历史", new P0(activity, c0239aE, 2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    } else {
                                        zArr[i9] = hashSetF.contains(strArr[i9][0]);
                                        i9++;
                                    }
                                }
                            } catch (Exception unused) {
                                X0.a("显示设置失败");
                                return;
                            }
                            break;
                        case 1:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity2 = InitOrigin.getActivity();
                                C0239a c0239aE2 = C0239a.e();
                                LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams3.bottomMargin = AbstractC0583w0.Q(12, activity2);
                                linearLayoutK2.addView(AbstractC0583w0.p(activity2, "搜索展示", "选择搜索结果的展示方式"), layoutParams3);
                                c0239aE2.getClass();
                                int[] iArr2 = {!C0239a.j().optBoolean("searchFolderMode", true) ? 1 : 0};
                                linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"文件夹(按平台分组)", "列表(直接展示)"}, new String[]{"搜索结果按直播平台归类", "直接展示所有直播间"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, iArr2, null));
                                AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(linearLayoutK2).setPositiveButton("确定", new P0(c0239aE2, iArr2, 1)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                            } catch (Exception unused2) {
                                X0.a("显示搜索设置失败");
                                return;
                            }
                            break;
                        case 2:
                            X1 x1 = (X1) c0246c1.a;
                            Objects.requireNonNull(x1);
                            i iVar = new i(20, x1);
                            e eVar = (e) c0246c1.b;
                            Objects.requireNonNull(eVar);
                            RunnableC0341a runnableC0341a = new RunnableC0341a(9, eVar);
                            C0538n c0538n2 = (C0538n) c0246c1.c;
                            c0538n2.getClass();
                            C0239a.e().getClass();
                            P1.L0("我的关注", "选择要使用的关注功能", new String[]{"解析分享链接", "管理关注列表"}, new String[]{"粘贴或扫码添加直播间", b.h("已关注 ", C0239a.l().length(), " 位主播")}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d}, new Runnable[]{new W(c0538n2, iVar, runnableC0341a, 1), new RunnableC0242b(c0538n2, runnableC0341a, 11)}, new A(29), false);
                            break;
                        case 3:
                            C0538n c0538n3 = (C0538n) c0246c1.c;
                            c0538n3.getClass();
                            try {
                                Activity activity3 = InitOrigin.getActivity();
                                C0239a c0239aE3 = C0239a.e();
                                c0239aE3.getClass();
                                JSONArray jSONArrayM = C0239a.m();
                                LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                                View viewP2 = AbstractC0583w0.p(activity3, "观看历史", "共 " + jSONArrayM.length() + " 条记录");
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams4.bottomMargin = AbstractC0583w0.Q(12, activity3);
                                linearLayoutK3.addView(viewP2, layoutParams4);
                                if (jSONArrayM.length() == 0) {
                                    linearLayoutK3.addView(AbstractC0583w0.D(activity3, "暂无观看记录"));
                                } else {
                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                    linearLayout2.setOrientation(1);
                                    c0538n3.b(linearLayout2, jSONArrayM);
                                    linearLayoutK3.addView(C0538n.c(activity3, linearLayout2));
                                }
                                AlertDialog.Builder negativeButton = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK3)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null);
                                if (jSONArrayM.length() > 0) {
                                    negativeButton.setNeutralButton("全部清除", new DialogInterfaceOnClickListenerC0518j(0, c0239aE3));
                                }
                                AbstractC0583w0.j0(negativeButton.create());
                            } catch (Exception unused3) {
                                X0.a("显示历史管理失败");
                                return;
                            }
                            break;
                        case 4:
                            c0246c1.getClass();
                            ((C0538n) c0246c1.c).g(new i(19, c0246c1));
                            break;
                        case 5:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity4 = InitOrigin.getActivity();
                                if (activity4 != null) {
                                    final C0239a c0239aE4 = C0239a.e();
                                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity4);
                                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams5.bottomMargin = AbstractC0583w0.Q(12, activity4);
                                    StringBuilder sb2 = new StringBuilder("已关注 ");
                                    c0239aE4.getClass();
                                    sb2.append(C0239a.l().length());
                                    sb2.append(" 位主播");
                                    linearLayoutK4.addView(AbstractC0583w0.p(activity4, "关注设置", sb2.toString()), layoutParams5);
                                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity4);
                                    try {
                                        zOptBoolean = C0239a.j().optBoolean("followPrompt", true);
                                    } catch (Exception unused4) {
                                        zOptBoolean = true;
                                    }
                                    try {
                                        zOptBoolean2 = C0239a.j().optBoolean("liveNotify", true);
                                    } catch (Exception unused5) {
                                        zOptBoolean2 = true;
                                    }
                                    final boolean[] zArr2 = {zOptBoolean, zOptBoolean2};
                                    LinearLayout linearLayout3 = new LinearLayout(activity4);
                                    linearLayout3.setOrientation(1);
                                    linearLayout3.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout3, "关注提醒", "播放时询问是否关注主播", AbstractC0583w0.c, zArr2[0], 0, false, null, zArr2, null);
                                    AbstractC0583w0.m(linearLayout3, "开播提醒", "加载时检查关注主播是否开播", AbstractC0583w0.d, zArr2[1], 1, true, null, zArr2, null);
                                    linearLayoutY2.addView(linearLayout3);
                                    linearLayoutK4.addView(linearLayoutY2);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity4).setView(AbstractC0583w0.q0(linearLayoutK4)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i11) {
                                            switch (i8) {
                                                case 0:
                                                    boolean[] zArr4 = zArr2;
                                                    boolean z = zArr4[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr2;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    break;
                                }
                            } catch (Exception unused6) {
                                X0.a("显示关注设置失败");
                                return;
                            }
                            break;
                        default:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity5 = InitOrigin.getActivity();
                                if (activity5 != null) {
                                    final C0239a c0239aE5 = C0239a.e();
                                    LinearLayout linearLayoutK5 = AbstractC0583w0.K(activity5);
                                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams6.bottomMargin = AbstractC0583w0.Q(12, activity5);
                                    c0239aE5.getClass();
                                    linearLayoutK5.addView(AbstractC0583w0.p(activity5, "弹幕配置", "流式弹幕当前".concat(C0239a.g() ? "已开启" : "已关闭")), layoutParams6);
                                    LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity5);
                                    final boolean[] zArr3 = {C0239a.g()};
                                    LinearLayout linearLayout4 = new LinearLayout(activity5);
                                    linearLayout4.setOrientation(1);
                                    linearLayout4.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout4, "流式弹幕", "WebSocket 实时弹幕（快手暂不支持）", AbstractC0583w0.f, zArr3[0], 0, false, null, zArr3, null);
                                    linearLayoutY3.addView(linearLayout4);
                                    linearLayoutK5.addView(linearLayoutY3, AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity5)));
                                    AbstractC0583w0.g(linearLayoutK5, "兼容提醒");
                                    LinearLayout linearLayoutY4 = AbstractC0583w0.y(activity5);
                                    TextView textView = new TextView(activity5);
                                    textView.setText("推荐使用已完成适配的 Peek（PickTV）或 WebHTV\n支持哔哩、虎牙、斗鱼和抖音；快手暂不支持直播弹幕");
                                    textView.setTextSize(13.0f);
                                    textView.setTextColor(AbstractC0583w0.g);
                                    textView.setPadding(AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5), AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5));
                                    textView.setLineSpacing(AbstractC0583w0.Q(3, activity5), 1.0f);
                                    linearLayoutY4.addView(textView);
                                    linearLayoutK5.addView(linearLayoutY4);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity5).setView(AbstractC0583w0.q0(linearLayoutK5)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i11) {
                                            switch (i7) {
                                                case 0:
                                                    boolean[] zArr4 = zArr3;
                                                    boolean z = zArr4[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr3;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                }
                            } catch (Exception unused7) {
                                X0.a("显示弹幕配置失败");
                            }
                            break;
                    }
                }
            });
            return "";
        }
        if ("danmaku_settings".equals(str)) {
            final int i7 = 6;
            InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.v.a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zOptBoolean;
                    boolean zOptBoolean2;
                    C0246c0 c0246c1 = c0246c0;
                    final int i8 = 0;
                    final int i9 = 1;
                    switch (i7) {
                        case 0:
                            C0538n c0538n = (C0538n) c0246c1.c;
                            c0538n.getClass();
                            try {
                                Activity activity = InitOrigin.getActivity();
                                C0239a c0239aE = C0239a.e();
                                LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                StringBuilder sb = new StringBuilder("关注 ");
                                c0239aE.getClass();
                                sb.append(C0239a.l().length());
                                sb.append(" · 历史 ");
                                sb.append(C0239a.m().length());
                                View viewP = AbstractC0583w0.p(activity, "站点设置", sb.toString());
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                                linearLayoutK.addView(viewP, layoutParams);
                                AbstractC0583w0.g(linearLayoutK, "平台管理（关闭后首页和搜索将跳过该平台）");
                                LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                boolean[] zArr = new boolean[5];
                                HashSet hashSetF = C0239a.f();
                                int i10 = 0;
                                while (true) {
                                    String[][] strArr = b.a;
                                    if (i10 >= 5) {
                                        LinearLayout linearLayout = new LinearLayout(activity);
                                        linearLayout.setOrientation(1);
                                        linearLayout.setDescendantFocusability(262144);
                                        int i11 = 0;
                                        while (i11 < 5) {
                                            String str2 = strArr[i11][1];
                                            int[] iArr = C0538n.a;
                                            AbstractC0583w0.m(linearLayout, str2, null, iArr[i11 % iArr.length], zArr[i11], i11, i11 > 0, null, zArr, null);
                                            i11++;
                                        }
                                        linearLayoutY.addView(linearLayout);
                                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams2.bottomMargin = AbstractC0583w0.Q(12, activity);
                                        linearLayoutK.addView(linearLayoutY, layoutParams2);
                                        AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0503g(c0538n, zArr, c0239aE, 0)).setNeutralButton("清除历史", new P0(activity, c0239aE, 2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    } else {
                                        zArr[i10] = hashSetF.contains(strArr[i10][0]);
                                        i10++;
                                    }
                                }
                            } catch (Exception unused) {
                                X0.a("显示设置失败");
                                return;
                            }
                            break;
                        case 1:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity2 = InitOrigin.getActivity();
                                C0239a c0239aE2 = C0239a.e();
                                LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams3.bottomMargin = AbstractC0583w0.Q(12, activity2);
                                linearLayoutK2.addView(AbstractC0583w0.p(activity2, "搜索展示", "选择搜索结果的展示方式"), layoutParams3);
                                c0239aE2.getClass();
                                int[] iArr2 = {!C0239a.j().optBoolean("searchFolderMode", true) ? 1 : 0};
                                linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"文件夹(按平台分组)", "列表(直接展示)"}, new String[]{"搜索结果按直播平台归类", "直接展示所有直播间"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, iArr2, null));
                                AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(linearLayoutK2).setPositiveButton("确定", new P0(c0239aE2, iArr2, 1)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                            } catch (Exception unused2) {
                                X0.a("显示搜索设置失败");
                                return;
                            }
                            break;
                        case 2:
                            X1 x1 = (X1) c0246c1.a;
                            Objects.requireNonNull(x1);
                            i iVar = new i(20, x1);
                            e eVar = (e) c0246c1.b;
                            Objects.requireNonNull(eVar);
                            RunnableC0341a runnableC0341a = new RunnableC0341a(9, eVar);
                            C0538n c0538n2 = (C0538n) c0246c1.c;
                            c0538n2.getClass();
                            C0239a.e().getClass();
                            P1.L0("我的关注", "选择要使用的关注功能", new String[]{"解析分享链接", "管理关注列表"}, new String[]{"粘贴或扫码添加直播间", b.h("已关注 ", C0239a.l().length(), " 位主播")}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d}, new Runnable[]{new W(c0538n2, iVar, runnableC0341a, 1), new RunnableC0242b(c0538n2, runnableC0341a, 11)}, new A(29), false);
                            break;
                        case 3:
                            C0538n c0538n3 = (C0538n) c0246c1.c;
                            c0538n3.getClass();
                            try {
                                Activity activity3 = InitOrigin.getActivity();
                                C0239a c0239aE3 = C0239a.e();
                                c0239aE3.getClass();
                                JSONArray jSONArrayM = C0239a.m();
                                LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                                View viewP2 = AbstractC0583w0.p(activity3, "观看历史", "共 " + jSONArrayM.length() + " 条记录");
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams4.bottomMargin = AbstractC0583w0.Q(12, activity3);
                                linearLayoutK3.addView(viewP2, layoutParams4);
                                if (jSONArrayM.length() == 0) {
                                    linearLayoutK3.addView(AbstractC0583w0.D(activity3, "暂无观看记录"));
                                } else {
                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                    linearLayout2.setOrientation(1);
                                    c0538n3.b(linearLayout2, jSONArrayM);
                                    linearLayoutK3.addView(C0538n.c(activity3, linearLayout2));
                                }
                                AlertDialog.Builder negativeButton = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK3)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null);
                                if (jSONArrayM.length() > 0) {
                                    negativeButton.setNeutralButton("全部清除", new DialogInterfaceOnClickListenerC0518j(0, c0239aE3));
                                }
                                AbstractC0583w0.j0(negativeButton.create());
                            } catch (Exception unused3) {
                                X0.a("显示历史管理失败");
                                return;
                            }
                            break;
                        case 4:
                            c0246c1.getClass();
                            ((C0538n) c0246c1.c).g(new i(19, c0246c1));
                            break;
                        case 5:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity4 = InitOrigin.getActivity();
                                if (activity4 != null) {
                                    final C0239a c0239aE4 = C0239a.e();
                                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity4);
                                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams5.bottomMargin = AbstractC0583w0.Q(12, activity4);
                                    StringBuilder sb2 = new StringBuilder("已关注 ");
                                    c0239aE4.getClass();
                                    sb2.append(C0239a.l().length());
                                    sb2.append(" 位主播");
                                    linearLayoutK4.addView(AbstractC0583w0.p(activity4, "关注设置", sb2.toString()), layoutParams5);
                                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity4);
                                    try {
                                        zOptBoolean = C0239a.j().optBoolean("followPrompt", true);
                                    } catch (Exception unused4) {
                                        zOptBoolean = true;
                                    }
                                    try {
                                        zOptBoolean2 = C0239a.j().optBoolean("liveNotify", true);
                                    } catch (Exception unused5) {
                                        zOptBoolean2 = true;
                                    }
                                    final boolean[] zArr2 = {zOptBoolean, zOptBoolean2};
                                    LinearLayout linearLayout3 = new LinearLayout(activity4);
                                    linearLayout3.setOrientation(1);
                                    linearLayout3.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout3, "关注提醒", "播放时询问是否关注主播", AbstractC0583w0.c, zArr2[0], 0, false, null, zArr2, null);
                                    AbstractC0583w0.m(linearLayout3, "开播提醒", "加载时检查关注主播是否开播", AbstractC0583w0.d, zArr2[1], 1, true, null, zArr2, null);
                                    linearLayoutY2.addView(linearLayout3);
                                    linearLayoutK4.addView(linearLayoutY2);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity4).setView(AbstractC0583w0.q0(linearLayoutK4)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i12) {
                                            switch (i9) {
                                                case 0:
                                                    boolean[] zArr4 = zArr2;
                                                    boolean z = zArr4[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr2;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE4.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                    break;
                                }
                            } catch (Exception unused6) {
                                X0.a("显示关注设置失败");
                                return;
                            }
                            break;
                        default:
                            ((C0538n) c0246c1.c).getClass();
                            try {
                                Activity activity5 = InitOrigin.getActivity();
                                if (activity5 != null) {
                                    final C0239a c0239aE5 = C0239a.e();
                                    LinearLayout linearLayoutK5 = AbstractC0583w0.K(activity5);
                                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams6.bottomMargin = AbstractC0583w0.Q(12, activity5);
                                    c0239aE5.getClass();
                                    linearLayoutK5.addView(AbstractC0583w0.p(activity5, "弹幕配置", "流式弹幕当前".concat(C0239a.g() ? "已开启" : "已关闭")), layoutParams6);
                                    LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity5);
                                    final boolean[] zArr3 = {C0239a.g()};
                                    LinearLayout linearLayout4 = new LinearLayout(activity5);
                                    linearLayout4.setOrientation(1);
                                    linearLayout4.setDescendantFocusability(262144);
                                    AbstractC0583w0.m(linearLayout4, "流式弹幕", "WebSocket 实时弹幕（快手暂不支持）", AbstractC0583w0.f, zArr3[0], 0, false, null, zArr3, null);
                                    linearLayoutY3.addView(linearLayout4);
                                    linearLayoutK5.addView(linearLayoutY3, AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity5)));
                                    AbstractC0583w0.g(linearLayoutK5, "兼容提醒");
                                    LinearLayout linearLayoutY4 = AbstractC0583w0.y(activity5);
                                    TextView textView = new TextView(activity5);
                                    textView.setText("推荐使用已完成适配的 Peek（PickTV）或 WebHTV\n支持哔哩、虎牙、斗鱼和抖音；快手暂不支持直播弹幕");
                                    textView.setTextSize(13.0f);
                                    textView.setTextColor(AbstractC0583w0.g);
                                    textView.setPadding(AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5), AbstractC0583w0.Q(14, activity5), AbstractC0583w0.Q(12, activity5));
                                    textView.setLineSpacing(AbstractC0583w0.Q(3, activity5), 1.0f);
                                    linearLayoutY4.addView(textView);
                                    linearLayoutK5.addView(linearLayoutY4);
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity5).setView(AbstractC0583w0.q0(linearLayoutK5)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.i
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i12) {
                                            switch (i8) {
                                                case 0:
                                                    boolean[] zArr4 = zArr3;
                                                    boolean z = zArr4[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ = C0239a.j();
                                                        jSONObjectJ.put("danmaku", z);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                                                    } catch (Exception e) {
                                                        b.D(e, new StringBuilder("[ALLLiveStorage] setDanmakuEnabled error: "));
                                                    }
                                                    X0.a(zArr4[0] ? "流式弹幕已开启" : "流式弹幕已关闭");
                                                    break;
                                                default:
                                                    boolean[] zArr5 = zArr3;
                                                    boolean z2 = zArr5[0];
                                                    c0239aE5.getClass();
                                                    try {
                                                        JSONObject jSONObjectJ2 = C0239a.j();
                                                        jSONObjectJ2.put("followPrompt", z2);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ2.toString());
                                                    } catch (Exception e2) {
                                                        b.D(e2, new StringBuilder("[ALLLiveStorage] setFollowPromptEnabled error: "));
                                                    }
                                                    boolean z3 = zArr5[1];
                                                    try {
                                                        JSONObject jSONObjectJ3 = C0239a.j();
                                                        jSONObjectJ3.put("liveNotify", z3);
                                                        C0297t1.j("alllive_config.json", jSONObjectJ3.toString());
                                                    } catch (Exception e3) {
                                                        b.D(e3, new StringBuilder("[ALLLiveStorage] setLiveNotifyEnabled error: "));
                                                    }
                                                    X0.a("关注设置已保存");
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                }
                            } catch (Exception unused7) {
                                X0.a("显示弹幕配置失败");
                            }
                            break;
                    }
                }
            });
            return "";
        }
        if ("danmaku_docs".equals(str)) {
            InitOrigin.run(new A(21));
            return "";
        }
        if (!"alllive_help".equals(str)) {
            return "";
        }
        InitOrigin.run(new A(22));
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:172:0x09c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String[] strArr;
        JSONObject jSONObjectOptJSONObject;
        ?? r1;
        boolean zI;
        String[] strArr2;
        String strR;
        JSONObject jSONObjectOptJSONObject2;
        String[][] strArr3;
        String str4;
        if (str != null && str.startsWith("_search_folder@@")) {
            C0261h0 c0261h0 = this.g;
            c0261h0.getClass();
            List arrayList = "1".equals(str2) ? (List) ((HashMap) c0261h0.c).get(str) : null;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        }
        C0246c0 c0246c0 = this.d;
        c0246c0.getClass();
        int i = Integer.parseInt(str2);
        boolean zEquals = "_settings".equals(str);
        String strM339 = " 位主播";
        if (zEquals) {
            String strM175 = "共 ";
            String strM177 = "已关注 ";
            String strM54 = "已收藏 ";
            try {
                C0239a c0239aE = C0239a.e();
                JSONArray jSONArray = new JSONArray();
                boolean zQ = com.github.catvod.spider.merge.p000a.A.j().q();
                jSONArray.put(com.github.catvod.spider.merge.p018v.b.a("bili_login", zQ ? "B站状态" : "B站登录", zQ ? "已登录 · 点击查看当前状态" : "未登录 · 登录后可看高画质", AbstractC0302v0.h()));
                jSONArray.put(com.github.catvod.spider.merge.p018v.b.a("settings", "平台管理", "开关各直播平台", AbstractC0302v0.S()));
                String strM199 = "search_display";
                String strM21 = "搜索展示";
                c0239aE.getClass();
                jSONArray.put(com.github.catvod.spider.merge.p018v.b.a(strM199, strM21, C0239a.j().optBoolean("searchFolderMode", true) ? "按平台文件夹" : "直接列表", AbstractC0302v0.I()));
                jSONArray.put(com.github.catvod.spider.merge.p018v.b.a("manage_categories", "分类管理", strM54 + C0239a.k().length() + " 个分类", AbstractC0302v0.H1()));
                jSONArray.put(com.github.catvod.spider.merge.p018v.b.a("manage_follows", "管理关注", strM177 + C0239a.l().length() + strM339, AbstractC0302v0.U()));
                jSONArray.put(com.github.catvod.spider.merge.p018v.b.a("manage_history", "观看历史", strM175 + C0239a.m().length() + " 条记录", AbstractC0302v0.c0()));
                jSONArray.put(com.github.catvod.spider.merge.p018v.b.a("play_settings", "关注设置", "关注提醒 · 开播提醒", AbstractC0302v0.z1()));
                jSONArray.put(com.github.catvod.spider.merge.p018v.b.a("danmaku_settings", "弹幕配置", C0239a.g() ? "已开启" : "已关闭", AbstractC0302v0.D()));
                jSONArray.put(com.github.catvod.spider.merge.p018v.b.a("danmaku_docs", "弹幕对接说明", "WebSocket 接口文档", AbstractC0302v0.a0()));
                jSONArray.put(com.github.catvod.spider.merge.p018v.b.a("alllive_help", "查看帮助", "功能说明与使用指南", AbstractC0302v0.a0()));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("list", jSONArray);
                jSONObject.put("page", 1);
                jSONObject.put("pagecount", 1);
                jSONObject.put("limit", 20);
                jSONObject.put("total", jSONArray.length());
                return jSONObject.toString();
            } catch (Exception unused) {
                com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.F(new ArrayList());
                gVar.o(1, 1, 0, 1);
                return gVar.r();
            }
        }
        boolean zEquals2 = "_follows".equals(str);
        String[][] strArr4 = com.github.catvod.spider.merge.p018v.b.a;
        String strM459 = ":";
        String strM1910 = "_";
        String strM210 = "直播间";
        String strM277 = "title";
        String strM169 = "cover";
        String strM10 = "userName";
        String strM529 = "roomId";
        String str5 = "";
        String strM234 = "_follows_live";
        String strM454 = "site";
        if (zEquals2 || strM234.equals(str)) {
            String str6 = strM210;
            String str7 = strM277;
            HashMap mapH = ((com.github.catvod.spider.merge.S.e) c0246c0.c).h(false);
            boolean zEquals3 = strM234.equals(str);
            HashSet hashSet = ((com.github.catvod.spider.merge.p018v.d) c0246c0.a).d;
            C0239a.e().getClass();
            ArrayList arrayList2 = new ArrayList();
            try {
                JSONArray jSONArrayL = C0239a.l();
                int length = jSONArrayL.length() - 1;
                while (length >= 0) {
                    JSONObject jSONObject2 = jSONArrayL.getJSONObject(length);
                    String strOptString = jSONObject2.optString(strM454);
                    JSONArray jSONArray2 = jSONArrayL;
                    String str8 = strM454;
                    String str9 = strOptString + strM1910 + jSONObject2.optString(strM529);
                    boolean z2 = hashSet != null && hashSet.contains(str9);
                    if (!zEquals3 || z2) {
                        String strOptString2 = jSONObject2.optString(strM10, str5);
                        JSONObject jSONObject3 = (JSONObject) mapH.get(str9);
                        String strK = jSONObject3 == null ? str5 : com.github.catvod.spider.merge.p018v.b.k(jSONObject3);
                        if (strK.isEmpty()) {
                            strK = jSONObject2.optString(strM169, str5);
                        }
                        String strBuildLiveCoverUrl = ProxyOrigin.buildLiveCoverUrl(strOptString, strK, jSONObject3 == null ? str5 : jSONObject3.optString("user_avatar", str5));
                        String str10 = str6;
                        str3 = str7;
                        String strOptString3 = jSONObject2.optString(str3, str10);
                        str6 = str10;
                        for (int i2 = 0; i2 < 5; i2++) {
                            String[] strArr5 = strArr4[i2];
                            if (strArr5[0].equals(strOptString)) {
                                strOptString = strArr5[1];
                                break;
                            }
                        }
                        arrayList2.add(new k(str9, strOptString + strM459 + (strOptString2.isEmpty() ? strOptString3 : strOptString2), strBuildLiveCoverUrl, z2 ? "直播中 · " + C0239a.c(strOptString3) : C0239a.c(strOptString3)));
                    } else {
                        strM529 = strM529;
                        str3 = str7;
                    }
                    length--;
                    jSONArrayL = jSONArray2;
                    str5 = str5;
                    strM454 = str8;
                    str7 = str3;
                    strM529 = strM529;
                    strM10 = strM10;
                    mapH = mapH;
                }
            } catch (Exception e) {
                com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[ALLLiveStorage] loadFollowsAsVod error: "));
            }
            if (!zEquals3) {
                int size = arrayList2.size();
                arrayList2.add(0, new k("_follows_live", "直播中", AbstractC0302v0.Z(), hashSet.size() + " 位主播正在直播", true));
                arrayList2.add(0, new k("manage_follows", "解析/管理关注", AbstractC0302v0.U(), com.github.catvod.spider.merge.D.b.h("解析分享链接 · 已关注 ", size, strM339), "manage_follows"));
            }
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.o(1, 1, arrayList2.size(), arrayList2.size());
            gVar2.F(arrayList2);
            return gVar2.r();
        }
        if ("_categories".equals(str)) {
            try {
                C0239a.e().getClass();
                HashSet hashSetF = C0239a.f();
                JSONArray jSONArrayK = C0239a.k();
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < jSONArrayK.length(); i3++) {
                    JSONObject jSONObject4 = jSONArrayK.getJSONObject(i3);
                    String strOptString4 = jSONObject4.optString(strM454);
                    if (hashSetF.contains(strOptString4)) {
                        String strOptString5 = jSONObject4.optString("parentId");
                        String strOptString6 = jSONObject4.optString("catId");
                        String strOptString7 = jSONObject4.optString("catName");
                        String strOptString8 = jSONObject4.optString("parentName");
                        if (strOptString8.isEmpty()) {
                            strOptString8 = jSONObject4.optString("siteName");
                        }
                        if (!strOptString4.isEmpty() && !strOptString5.isEmpty() && !strOptString6.isEmpty() && !strOptString7.isEmpty()) {
                            arrayList3.add(com.github.catvod.spider.merge.p018v.b.d(strOptString4, strOptString5, strOptString6, strOptString8, strOptString7));
                        }
                    }
                }
                com.github.catvod.spider.merge.p001b.g gVar3 = new com.github.catvod.spider.merge.p001b.g();
                gVar3.o(1, 1, arrayList3.size(), arrayList3.size());
                gVar3.F(arrayList3);
                return gVar3.r();
            } catch (Exception unused2) {
                com.github.catvod.spider.merge.p001b.g gVar4 = new com.github.catvod.spider.merge.p001b.g();
                gVar4.F(new ArrayList());
                gVar4.o(1, 1, 0, 1);
                return gVar4.r();
            }
        }
        if ("_history".equals(str)) {
            C0239a.e().getClass();
            ArrayList arrayList4 = new ArrayList();
            try {
                JSONArray jSONArrayM = C0239a.m();
                int i4 = 0;
                String[][] strArr6 = strArr4;
                while (i4 < jSONArrayM.length()) {
                    JSONObject jSONObject5 = jSONArrayM.getJSONObject(i4);
                    String strOptString9 = jSONObject5.optString(strM454);
                    String strOptString10 = jSONObject5.optString(strM529);
                    String strOptString11 = jSONObject5.optString(strM10, "");
                    String strOptString12 = jSONObject5.optString(strM169, "");
                    if (strOptString12.isEmpty()) {
                        strOptString12 = AbstractC0302v0.x0(strOptString9);
                    }
                    JSONArray jSONArray3 = jSONArrayM;
                    String str11 = strOptString12;
                    String strOptString13 = jSONObject5.optString(strM277, strM210);
                    String str12 = strM210;
                    String str13 = strOptString9 + strM1910 + strOptString10;
                    String str14 = strM277;
                    int i5 = 0;
                    String[][] strArr7 = strArr6;
                    while (true) {
                        if (i5 >= 5) {
                            strArr3 = strArr7;
                            str4 = strOptString9;
                            break;
                        }
                        String[] strArr8 = strArr7[i5];
                        String[][] strArr9 = strArr7;
                        if (strArr8[0].equals(strOptString9)) {
                            str4 = strArr8[1];
                            strArr3 = strArr9;
                            break;
                        }
                        i5++;
                        strArr7 = strArr9;
                    }
                    arrayList4.add(new k(str13, str4 + strM459 + (strOptString11.isEmpty() ? strOptString13 : strOptString11), str11, C0239a.c(strOptString13)));
                    i4++;
                    jSONArrayM = jSONArray3;
                    strM210 = str12;
                    strM277 = str14;
                    strArr6 = strArr3;
                }
            } catch (Exception e2) {
                com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder("[ALLLiveStorage] loadHistoryAsVod error: "));
            }
            com.github.catvod.spider.merge.p001b.g gVar5 = new com.github.catvod.spider.merge.p001b.g();
            gVar5.o(1, 1, arrayList4.size(), arrayList4.size());
            gVar5.F(arrayList4);
            return gVar5.r();
        }
        boolean zStartsWith = str.startsWith("_fav_");
        String strM554 = "items";
        String strM386 = "has_more";
        String strM358 = "data";
        String strM445 = "&page=";
        String strM33 = "&parent_id=";
        String strM193 = "&category_id=";
        String strM102 = "/rooms?site=";
        if (zStartsWith) {
            X1 x1 = (X1) c0246c0.b;
            try {
                String strSubstring = str.substring(5);
                int iIndexOf = strSubstring.indexOf(95);
                if (iIndexOf < 0) {
                    return C0246c0.b(i);
                }
                String strSubstring2 = strSubstring.substring(0, iIndexOf);
                String strSubstring3 = strSubstring.substring(iIndexOf + 1);
                int iLastIndexOf = strSubstring3.lastIndexOf(95);
                if (iLastIndexOf < 0) {
                    return C0246c0.b(i);
                }
                JSONObject jSONObjectX = x1.x(x1.m(strM102 + strSubstring2 + strM193 + com.github.catvod.spider.merge.p018v.b.f(strSubstring3.substring(iLastIndexOf + 1)) + strM33 + com.github.catvod.spider.merge.p018v.b.f(strSubstring3.substring(0, iLastIndexOf)) + strM445 + i));
                if (jSONObjectX != null && (jSONObjectOptJSONObject2 = jSONObjectX.optJSONObject(strM358)) != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject2.optBoolean(strM386, false);
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(strM554);
                    ArrayList arrayList5 = new ArrayList();
                    if (jSONArrayOptJSONArray != null) {
                        for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                            arrayList5.add(com.github.catvod.spider.merge.p018v.b.l(strSubstring2, jSONArrayOptJSONArray.getJSONObject(i6)));
                        }
                    }
                    int i7 = zOptBoolean ? i + 1 : i;
                    com.github.catvod.spider.merge.p001b.g gVar6 = new com.github.catvod.spider.merge.p001b.g();
                    gVar6.o(i, i7, arrayList5.size(), arrayList5.size());
                    gVar6.F(arrayList5);
                    return gVar6.r();
                }
                return C0246c0.b(i);
            } catch (Exception unused3) {
                return C0246c0.b(i);
            }
        }
        String strM422 = "_catp_";
        if (!str.startsWith(strM422)) {
            String strM471 = "_cat_";
            if (!str.startsWith(strM471)) {
                try {
                    return c0246c0.k(i, str);
                } catch (Exception unused4) {
                    return C0246c0.b(i);
                }
            }
            X1 x2 = (X1) c0246c0.b;
            try {
                if (str.startsWith(strM471)) {
                    String strSubstring4 = str.substring(5);
                    int iIndexOf2 = strSubstring4.indexOf(95);
                    int iLastIndexOf2 = strSubstring4.lastIndexOf(95);
                    if (iIndexOf2 <= 0 || iLastIndexOf2 <= iIndexOf2) {
                        strArr = null;
                    } else {
                        String strSubstring5 = strSubstring4.substring(0, iIndexOf2);
                        String strSubstring6 = strSubstring4.substring(iIndexOf2 + 1, iLastIndexOf2);
                        String strSubstring7 = strSubstring4.substring(iLastIndexOf2 + 1);
                        if (!com.github.catvod.spider.merge.p018v.b.i(strSubstring5) || strSubstring6.isEmpty() || strSubstring7.isEmpty()) {
                            strArr = null;
                        } else {
                            strArr = new String[]{strSubstring5, strSubstring6, strSubstring7};
                        }
                    }
                } else {
                    strArr = null;
                }
                if (strArr == null) {
                    return C0246c0.b(i);
                }
                String str15 = strArr[0];
                JSONObject jSONObjectX2 = x2.x(x2.m(strM102 + str15 + strM193 + com.github.catvod.spider.merge.p018v.b.f(strArr[2]) + strM33 + com.github.catvod.spider.merge.p018v.b.f(strArr[1]) + strM445 + i));
                if (jSONObjectX2 != null && (jSONObjectOptJSONObject = jSONObjectX2.optJSONObject(strM358)) != null) {
                    boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean(strM386, false);
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(strM554);
                    ArrayList arrayList6 = new ArrayList();
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i8 = 0; i8 < jSONArrayOptJSONArray2.length(); i8++) {
                            arrayList6.add(com.github.catvod.spider.merge.p018v.b.l(str15, jSONArrayOptJSONArray2.getJSONObject(i8)));
                        }
                    }
                    int i9 = zOptBoolean2 ? i + 1 : i;
                    com.github.catvod.spider.merge.p001b.g gVar7 = new com.github.catvod.spider.merge.p001b.g();
                    gVar7.o(i, i9, arrayList6.size(), arrayList6.size());
                    gVar7.F(arrayList6);
                    return gVar7.r();
                }
                return C0246c0.b(i);
            } catch (Exception unused5) {
                return C0246c0.b(i);
            }
        }
        String strM194 = "name";
        String strM463 = "id";
        try {
            boolean zStartsWith2 = str.startsWith(strM422);
            boolean z3 = zStartsWith2;
            if (zStartsWith2) {
                String strSubstring8 = str.substring(6);
                int iIndexOf3 = strSubstring8.indexOf(95);
                if (iIndexOf3 <= 0) {
                    z3 = iIndexOf3;
                } else {
                    String strSubstring9 = strSubstring8.substring(0, iIndexOf3);
                    String strSubstring10 = strSubstring8.substring(iIndexOf3 + 1);
                    zI = com.github.catvod.spider.merge.p018v.b.i(strSubstring9);
                    if (zI) {
                        boolean zIsEmpty = strSubstring10.isEmpty();
                        if (zIsEmpty) {
                            z3 = zI;
                            z3 = zIsEmpty;
                        } else {
                            z3 = zI;
                            strArr2 = new String[]{strSubstring9, strSubstring10};
                            r1 = zIsEmpty;
                        }
                    }
                }
                z3 = zI;
                strArr2 = null;
                r1 = z3;
            } else {
                z3 = zI;
                strArr2 = null;
                r1 = z3;
            }
            try {
                if (strArr2 == null) {
                    r1 = 1;
                    strR = C0246c0.b(1);
                } else {
                    r1 = 1;
                    String str16 = strArr2[0];
                    String str17 = strArr2[1];
                    JSONArray jSONArrayG = c0246c0.g(str16);
                    if (jSONArrayG == null) {
                        strR = C0246c0.b(1);
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        for (int i10 = 0; i10 < jSONArrayG.length(); i10++) {
                            JSONObject jSONObject6 = jSONArrayG.getJSONObject(i10);
                            String strOptString14 = jSONObject6.optString(strM463);
                            if (str17.equals(strOptString14)) {
                                String strOptString15 = jSONObject6.optString(strM194);
                                JSONArray jSONArrayOptJSONArray3 = jSONObject6.optJSONArray("children");
                                if (jSONArrayOptJSONArray3 != null) {
                                    for (int i11 = 0; i11 < jSONArrayOptJSONArray3.length(); i11++) {
                                        JSONObject jSONObject7 = jSONArrayOptJSONArray3.getJSONObject(i11);
                                        String strOptString16 = jSONObject7.optString(strM194);
                                        String strOptString17 = jSONObject7.optString("parent_id", strOptString14);
                                        String strOptString18 = jSONObject7.optString(strM463);
                                        if (!strOptString17.isEmpty() && !strOptString18.isEmpty() && !strOptString16.isEmpty()) {
                                            arrayList7.add(com.github.catvod.spider.merge.p018v.b.d(str16, strOptString17, strOptString18, strOptString15, strOptString16));
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        com.github.catvod.spider.merge.p001b.g gVar8 = new com.github.catvod.spider.merge.p001b.g();
                        gVar8.o(1, 1, arrayList7.size(), arrayList7.size());
                        gVar8.F(arrayList7);
                        strR = gVar8.r();
                        r1 = arrayList7;
                    }
                }
                return strR;
            } catch (Exception unused6) {
                return C0246c0.b(r1);
            }
        } catch (Exception unused7) {
            r1 = 1;
        }
    }

    public ALLLive() {
        com.github.catvod.spider.merge.p018v.d dVar = new com.github.catvod.spider.merge.p018v.d();
        X1 x1 = new X1(8, dVar);
        this.a = x1;
        com.github.catvod.spider.merge.S.e eVar = new com.github.catvod.spider.merge.S.e(dVar, x1);
        this.b = eVar;
        this.c = new X1(9, eVar);
        this.d = new C0246c0(dVar, x1, eVar);
        this.e = new com.github.catvod.spider.merge.p018v.c(dVar, x1);
        this.f = new com.github.catvod.spider.merge.p018v.c(dVar, x1);
        this.g = new C0261h0(x1);
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

    public void init(Context context, String str) {
        Init.init(context);
        X1 x1 = this.a;
        ((com.github.catvod.spider.merge.p018v.d) x1.b).c = false;
        if (str == null || str.isEmpty()) {
            com.github.catvod.spider.merge.p018v.d dVar = (com.github.catvod.spider.merge.p018v.d) x1.b;
            dVar.a = null;
            dVar.b = true;
        } else {
            com.github.catvod.spider.merge.p018v.d dVar2 = (com.github.catvod.spider.merge.p018v.d) x1.b;
            dVar2.a = str;
            dVar2.b = false;
        }
        this.h = new C0246c0(x1, this.b, new C0538n(com.github.catvod.spider.merge.p018v.b.a));
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

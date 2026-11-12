package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.utils.C0143;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Buguyy extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f20short = {2605, 589, 515, 530, 523, 589, 524, 519, 533, 526, 523, 529, 534, 28122, 28522, 2053, 2062, 2076, 19144, 26726, 1824, 1831, 1852, 32074, -28163, 671, 652, 643, 649, 642, 640, -27881, 19124, 19158, 29699, 3062, 3058, 3043, -28240, 18451, 21067, -28539, 3319, 3322, 3316, 3299, 3323, 435, 446, 439, 418, 29821, 24461, 298, 299, 313, 338, 327, 965, 907, 922, 899, 965, 921, 911, 907, 920, 905, 898, 981, 897, 911, 915, 925, 901, 920, 910, 983, 742, 762, 762, 766, 692, 673, 673, 751, 672, 748, 763, 745, 763, 759, 759, 672, 762, 737, 766, 673, 736, 747, 761, 751, 766, 743, 673, 745, 747, 762, 763, 764, 738, 700, 672, 766, 742, 766, 689, 743, 746, 691, 1939, 2028, 2035, 1931, 1928, 1936, 1982, 1975, 1951, 1930, 1962, 1968, 1937, 1928, 1928, 2025, 1979, 1970, 1979, 1973, 1967, 1934, 1924, 1941, 2030, 1962, 1946, 1931, 1976, 1925, 1936, 2024, 1971, 1950, 1939, 1937, 2038, 1973, 1945, 1925, 2024, 1977, 1977, 1968, 1963, 1938, 1968, 2034, 2024, 1982, 1927, 1931, 1957, 1940, 1934, 1941, 1974, 1973, 2028, 1933, 1943, 1971, 1979, 2024, 1951, 1976, 1937, 1982, 1934, 1947, 1929, 1959, 1934, 1957, 1950, 1924, 1929, 1948, 1939, 2025, 1930, 1934, 1940, 1942, 1943, 1963, 1936, 1966, 1983, 1962, 1929, 1930, 2024, 1975, 2038, 1928, 1977, 1947, 1965, 2027, 1973, 1982, 2038, 1942, 1973, 1931, 2030, 1975, 1928, 2021, 2016, 1562, 1620, 1605, 1628, 1562, 1618, 1616, 1601, 1600, 1607, 1625, 1546, 1628, 1617, 1544, 1490, 1491, 1473, 1450, 1471, 1454, 1448, 1470, 1470, 1464, 1454, 1454, 1421, 1425, 1425, 1429, 1060, 1059, 1085, 795, 780, 780, 785, 780, 1293, 1295, 1310, 1311, 1304, 1286, 1368, 1334, 1348, 1306, 1282, 1306, 1334, 1365, 1283, 1294, 1367, 1346, 1334, 1294, 1345, 1347, 864, 869, 880, 869, 2894, 2882, 2889, 2888, 1764, 1733, 1732, 1743, 2322, 2307, 2320, 2321, 2311, 1360, 1398, 1376, 1399, 1320, 1348, 1378, 1376, 1387, 1393, 2926, 2892, 2905, 2890, 2895, 2895, 2882, 2828, 2838, 2829, 2835, 2819, 2827, 2932, 2890, 2893, 2887, 2892, 2900, 2896, 2819, 2925, 2935, 2819, 2834, 2835, 2829, 2835, 2840, 2819, 2932, 2890, 2893, 2837, 2839, 2840, 2819, 2907, 2837, 2839, 2826, 2819, 2914, 2899, 2899, 2895, 2886, 2932, 2886, 2881, 2920, 2890, 2903, 2828, 2838, 2832, 2836, 2829, 2832, 2837, 2819, 2827, 2920, 2923, 2935, 2926, 2927, 2831, 2819, 2895, 2890, 2888, 2886, 2819, 2916, 2886, 2880, 2888, 2892, 2826, 2819, 2912, 2891, 2897, 2892, 2894, 2886, 2828, 2834, 2833, 2838, 2829, 2835, 2829, 2835, 2829, 2835, 2819, 2928, 2882, 2885, 2882, 2897, 2890, 2828, 2838, 2832, 2836, 2829, 2832, 2837, 1100, 1089, 1093, 1088, 1089, 1110, 1891, 1917, 1900, 892, 895, 882, 872, 873, 2418, 2426, 2412, 2412, 2430, 2424, 2426, 26472, 26363, 21749, 21637, -32654, 20499, 23284, -28960, 1933, 1936, 1933, 1941, 1948, 870, 895, 885, 867, 868, 890, 2191, 2196, 2189, 2189, 3170, 3101, 3074, 3194, 3193, 3169, 3151, 3142, 3182, 3195, 3163, 3137, 3168, 3193, 3193, 3096, 3146, 3139, 3146, 3140, 3166, 3199, 3189, 3172, 3103, 3163, 3179, 3194, 3145, 3188, 3169, 3097, 3138, 3183, 3170, 3168, 3079, 3140, 3176, 3188, 3097, 3144, 3144, 3137, 3162, 3171, 3137, 3075, 3097, 3151, 3190, 3194, 3156, 3173, 3199, 3172, 3143, 3140, 3101, 3196, 3174, 3138, 3146, 3097, 3182, 3145, 3168, 3151, 3199, 3178, 3192, 3158, 3199, 3156, 3183, 3189, 3192, 3181, 3170, 3096, 3195, 3199, 3173, 3175, 3174, 3162, 3169, 3167, 3150, 3163, 3192, 3195, 3097, 3142, 3079, 3193, 3144, 3178, 3164, 3098, 3140, 3151, 3079, 3175, 3140, 3194, 3103, 3142, 3193, 3092, 3089, 2739, 2813, 2796, 2796, 2800, 2809, 2737, 2792, 2803, 2793, 2815, 2804, 2737, 2805, 2815, 2803, 2802, 2738, 2796, 2802, 2811, 475, 449, 454, 463, 461, 474, 2301, 2302, 2291, 2281, 2280, 2460, 2498, 2514, 2432, 2447, 2462, 2168, 2926, 2864, 2848, 2941, 2924, 21649, -31067, -25247, 17602, 1871, 1858, 1871, 2305, 3248, 3261, 3252, 3233, 562, 565, 558, 471, 409, 392, 401, 471, 400, 407, 396, 404, 401, 395, 396, 1730, 1745, 1758, 1748, 1759, 1757, 1636, 1578, 1595, 1570, 1636, 1593, 1578, 1573, 1583, 1572, 1574, 2442, 2446, 2463, 3018, 2948, 2965, 2956, 3018, 2957, 2944, 2959, 2956, 3034, 2950, 2956, 2945, 3032, 3028, 3029, 3011, 2965, 2948, 2946, 2944, 3032, 2496, 2509, 2499, 2516, 2508, 2303, 2225, 2208, 2233, 2303, 2232, 2229, 2234, 2233, 2287, 2227, 2233, 2228, 2285, 2273, 2273, 2294, 2208, 2225, 2231, 2229, 2285, 1127, 1065, 1080, 1057, 1127, 1062, 1069, 1087, 1060, 1057, 1083, 1084, 3187, 3192, 3178, 28602, 27914, 1094, 1089, 1114, 16917, 24763, 3024, 3011, 3020, 3014, 3021, 3023, 30689, -25770, 1348, 1344, 1361, -24775, 18074, 18168, 30765, 2575, 2562, 2572, 2587, 2563, -25610, 16981, 22541, -25917, 25565, -31908, -29914, 23367, 20896, -31308, 3190, 3112, 3128, 3178, 3173, 3188, 949, 1385, 1335, 1319, 1402, 1387, 2140, 2050, 2066, 2142, 2904, 2911, 3279, 3305, 3327, 3304, 3255, 3291, 3325, 3327, 3316, 3310, 587, 617, 636, 623, 618, 618, 615, 553, 563, 552, 566, 550, 558, 593, 623, 616, 610, 617, 625, 629, 550, 584, 594, 550, 567, 566, 552, 566, 573, 550, 593, 623, 616, 560, 562, 573, 550, 638, 560, 562, 559, 550, 583, 630, 630, 618, 611, 593, 611, 612, 589, 623, 626, 553, 563, 565, 561, 552, 565, 560, 550, 558, 589, 590, 594, 587, 586, 554, 550, 618, 623, 621, 611, 550, 577, 611, 613, 621, 617, 559, 550, 581, 622, 628, 617, 619, 611, 553, 567, 564, 563, 552, 566, 552, 566, 552, 566, 550, 597, 615, 608, 615, 628, 623, 553, 563, 565, 561, 552, 565, 560, 1566, 1633, 1662, 1542, 1541, 1565, 1587, 1594, 1554, 1543, 1575, 1597, 1564, 1541, 1541, 1636, 1590, 1599, 1590, 1592, 1570, 1539, 1545, 1560, 1635, 1575, 1559, 1542, 1589, 1544, 1565, 1637, 1598, 1555, 1566, 1564, 1659, 1592, 1556, 1544, 1637, 1588, 1588, 1597, 1574, 1567, 1597, 1663, 1637, 1587, 1546, 1542, 1576, 1561, 1539, 1560, 1595, 1592, 1633, 1536, 1562, 1598, 1590, 1637, 1554, 1589, 1564, 1587, 1539, 1558, 1540, 1578, 1539, 1576, 1555, 1545, 1540, 1553, 1566, 1636, 1543, 1539, 1561, 1563, 
    1562, 1574, 1565, 1571, 1586, 1575, 1540, 1543, 1637, 1594, 1659, 1541, 1588, 1558, 1568, 1638, 1592, 1587, 1659, 1563, 1592, 1542, 1635, 1594, 1541, 1640, 1645, 764, 1626, 1645, 1646, 1645, 1658, 1645, 1658, 1527, 1493, 1493, 1491, 1478, 1474, 1140, 1125, 1125, 1145, 1148, 1142, 1140, 1121, 1148, 1146, 1147, 1082, 1151, 1126, 1146, 1147, 1081, 1077, 1121, 1136, 1133, 1121, 1082, 1125, 1145, 1140, 1148, 1147, 1081, 1077, 1087, 1082, 1087, 2677, 2570, 2581, 2669, 2670, 2678, 2648, 2641, 2681, 2668, 2636, 2646, 2679, 2670, 2670, 2575, 2653, 2644, 2653, 2643, 2633, 2664, 2658, 2675, 2568, 2636, 2684, 2669, 2654, 2659, 2678, 2574, 2645, 2680, 2677, 2679, 2576, 2643, 2687, 2659, 2574, 2655, 2655, 2646, 2637, 2676, 2646, 2580, 2574, 2648, 2657, 2669, 2627, 2674, 2664, 2675, 2640, 2643, 2570, 2667, 2673, 2645, 2653, 2574, 2681, 2654, 2679, 2648, 2664, 2685, 2671, 2625, 2664, 2627, 2680, 2658, 2671, 2682, 2677, 2575, 2668, 2664, 2674, 2672, 2673, 2637, 2678, 2632, 2649, 2636, 2671, 2668, 2574, 2641, 2576, 2670, 2655, 2685, 2635, 2573, 2643, 2648, 2576, 2672, 2643, 2669, 2568, 2641, 2670, 2563, 2566, 2407, 2402, 2423, 2402, 809, 804, 3131, 3110, 3131, 3107, 3114, 2270, 2244, 2243, 2250, 2248, 2271, 1083, 1058, 1064, 1086, 1081, 1063, 1826, 1849, 1824, 1824, 1948, 2002, 1987, 1987, 2015, 2006, 1950, 1991, 2012, 1990, 2000, 2011, 1950, 2010, 2000, 2012, 2013, 1949, 1987, 2013, 2004, 2085, 2099, 2100, 2100, 2083, 2088, 2098, 2070, 2087, 2081, 2083, 1244, 1223, 1244, 1225, 1220, 1272, 1225, 1231, 1229, 1243, 1305, 1301, 1295, 1300, 1294, 2730, 2737, 2730, 2751, 2738, 2717, 2737, 2731, 2736, 2730, 530, 528, 517, 532, 534, 542, 515, 520, 562, 542, 543, 517, 532, 543, 517, 2074, 2075, 2058, 2079, 2071, 2066, 2109, 2065, 2064, 2058, 2075, 2064, 2058, 2129, 2134, 2132, 2140, 2170, 2134, 2135, 2125, 2140, 2135, 2125, 455, 475, 470, 462, 466, 453, 500, 472, 473, 451, 466, 473, 451, 3272, 3294, 3290, 3273, 3288, 3283, 3320, 3284, 3285, 3279, 3294, 3285, 3279, 1166, 1176, 1180, 1167, 1182, 1173, 1214, 1170, 1171, 1161, 1176, 1171, 1161};
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.github.catvod.spider.Buguyy$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
    }

    class FetchResult {
        public final List a;
        public final int b;
        public final int c;
        public final int d;

        public FetchResult(ArrayList arrayList, int i, int i2, int i3) {
            this.a = arrayList;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayListA = a();
        FetchResult fetchResultC = c("/api/newlist");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.c("最新", "new"));
        arrayList.add(new com.github.catvod.spider.merge.p001b.c("人气", "hot"));
        arrayList.add(new com.github.catvod.spider.merge.p001b.c("精选", "random"));
        arrayList.add(new com.github.catvod.spider.merge.p001b.c("音乐串烧", "mix"));
        arrayList.add(new com.github.catvod.spider.merge.p001b.c("音乐合集", "album"));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new com.github.catvod.spider.merge.p001b.d("type", "类型", arrayList));
        Iterator it = a().iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((com.github.catvod.spider.merge.p001b.b) it.next()).a(), arrayList2);
        }
        return com.github.catvod.spider.merge.p001b.g.A(arrayListA, fetchResultC.a, linkedHashMap);
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) throws UnsupportedEncodingException {
        FetchResult fetchResultC = c("/api/search?keyword=" + URLEncoder.encode(str, "UTF-8"));
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.o(1, 1, 50, fetchResultC.d);
        gVar.F(fetchResultC.a);
        return gVar.r();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00f4  */
    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws JSONException {
        String strGroup;
        String strM54 = "http://a.buguyy.top/newapi/geturl2.php?id=";
        JSONObject jSONObject = new JSONObject(X1.X(FishCrypto.v("N1.VUMcjBWwmLUU4fofhrSYH3wGVeXM5nCNL+hDX5ddmvOm/5cZVxISHkh1PJnf5BeLcSFTzSxCYTAN4WSIKJvMsbwTW5j+UdFp6hc+KhV3jU8=") + "/api/geturl?id=" + URLEncoder.encode(str2, "UTF-8"), null, d()));
        String strM567 = "success";
        boolean zOptBoolean = jSONObject.optBoolean(strM567);
        String strM102 = "http";
        String strM193 = "url";
        if (!zOptBoolean) {
            String strOptString = jSONObject.optString("error");
            if (strOptString == null || strOptString.isEmpty()) {
                strGroup = "";
            } else {
                Matcher matcher = Pattern.compile("geturl2\\.php\\?id=(\\d+)").matcher(strOptString);
                if (matcher.find()) {
                    strGroup = matcher.group(1);
                } else {
                    strGroup = "";
                }
            }
            if (!strGroup.isEmpty()) {
                try {
                    JSONObject jSONObject2 = new JSONObject(X1.X(strM54.concat(strGroup), null, d()));
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                    if (jSONObject2.optInt("code") == 200 && jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optString(strM193).startsWith(strM102)) {
                        jSONObjectOptJSONObject.put(strM567, true);
                        jSONObject = jSONObjectOptJSONObject;
                    }
                } catch (Exception unused) {
                }
            }
        }
        String strOptString2 = jSONObject.optString(strM193);
        if (!jSONObject.optBoolean(strM567) || !strOptString2.startsWith(strM102) || "None".equalsIgnoreCase(strOptString2)) {
            return com.github.catvod.spider.merge.p001b.g.d(jSONObject.optString("message", "播放地址获取失败"));
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("parse", 0);
        jSONObject3.put(strM193, strOptString2);
        jSONObject3.put("header", new JSONObject(com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36")));
        String strM382 = "lrc";
        String strB = b(jSONObject.optString(strM382));
        if (TextUtils.isEmpty(strB)) {
            JSONObject jSONObject4 = (JSONObject) this.a.get(str2);
            strB = b(jSONObject4 != null ? e("about", jSONObject4) : "");
        }
        if (!TextUtils.isEmpty(strB)) {
            jSONObject3.put(strM382, strB);
        }
        return jSONObject3.toString();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strTrim;
        String str = list.get(0);
        JSONObject jSONObject = (JSONObject) this.a.get(str);
        k kVarA = AbstractC0449a.a(str);
        String strM193 = "title";
        kVarA.o(jSONObject == null ? str : e(strM193, jSONObject));
        String strE = jSONObject == null ? "" : e("picurl", jSONObject);
        if (TextUtils.isEmpty(strE) || "null".equalsIgnoreCase(strE)) {
            strE = FishCrypto.v("N1.VUMcjBWwmLUU4fofhrSYH3wGVeXM5nCNL+hDX5ddmvOm/5cZVxISHkh1PJnf5BeLcSFTzSxCYTAN4WSIKJvMsbwTW5j+UdFp6hc+KhV3jU8=").concat("/apple-touch-icon.png");
        }
        kVarA.p(strE);
        String strM223 = "singer";
        kVarA.j(jSONObject == null ? "" : e(strM223, jSONObject));
        kVarA.s(jSONObject == null ? "" : e(strM223, jSONObject));
        String strE2 = jSONObject == null ? "" : e("about", jSONObject);
        if (TextUtils.isEmpty(strE2)) {
            strTrim = "";
        } else {
            String strM1 = "<br />";
            String strM554 = "\n";
            strTrim = X1.L(strE2.replace(strM1, strM554).replace("<br/>", strM554), "").T().trim();
        }
        kVarA.l(strTrim);
        kVarA.q("布谷音乐");
        StringBuilder sb = new StringBuilder();
        String strC = jSONObject == null ? kVarA.c() : e(strM193, jSONObject);
        String strE3 = jSONObject != null ? e(strM223, jSONObject) : "";
        if (!TextUtils.isEmpty(strE3)) {
            strC = com.github.catvod.spider.merge.D.b.C(strC, " - ", strE3);
        }
        sb.append(strC);
        sb.append("$");
        sb.append(str);
        kVarA.r(sb.toString());
        FishCrypto.c(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        FetchResult fetchResultC;
        String str3 = str;
        if (map != null) {
            String strM545 = "type";
            if (!TextUtils.isEmpty(map.get(strM545))) {
                str3 = map.get(strM545);
            }
        }
        int iMax = 1;
        try {
            iMax = Math.max(Integer.parseInt(str2), 1);
        } catch (Exception unused) {
        }
        if ("hot".equals(str3)) {
            fetchResultC = c("/api/hotlist");
        } else if ("random".equals(str3)) {
            fetchResultC = c("/api/random");
        } else if ("mix".equals(str3)) {
            fetchResultC = c("/api/heji?cid=10&page=" + iMax);
        } else if ("album".equals(str3)) {
            fetchResultC = c("/api/heji?cid=11&page=" + iMax);
        } else {
            fetchResultC = c("/api/newlist");
        }
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        int i = fetchResultC.b;
        if (i > 0) {
            iMax = i;
        }
        gVar.o(iMax, fetchResultC.c, 50, fetchResultC.d);
        gVar.F(fetchResultC.a);
        return gVar.r();
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("new", "最新", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("hot", "人气", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("random", "精选", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("mix", "音乐串烧", null));
        com.github.catvod.spider.merge.D.b.z("album", "音乐合集", null, arrayList);
        return arrayList;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || str.contains("歌词获取失败")) {
            return "";
        }
        String strM346 = "<br />";
        String strM301 = "\n";
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(str.replace(strM346, strM301).replace("<br/>", strM301).replace("<br>", strM301), "");
        gVarL.getClass();
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        com.github.catvod.spider.merge.l0.k.a(new i(0, sbB), gVarL);
        return com.github.catvod.spider.merge.e0.b.g(sbB).replace("\r\n", strM301).replace('\r', '\n').trim();
    }

    public static HashMap d() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36");
        mapS.put("Referer", FishCrypto.v("N1.VUMcjBWwmLUU4fofhrSYH3wGVeXM5nCNL+hDX5ddmvOm/5cZVxISHkh1PJnf5BeLcSFTzSxCYTAN4WSIKJvMsbwTW5j+UdFp6hc+KhV3jU8=").concat("/"));
        mapS.put("Accept", "application/json, text/plain, */*");
        return mapS;
    }

    public static String e(String str, JSONObject jSONObject) {
        return jSONObject.isNull(str) ? "" : jSONObject.optString(str, "");
    }

    public final FetchResult c(String str) {
        StringBuilder sb = new StringBuilder();
        String strM467 = "N1.VUMcjBWwmLUU4fofhrSYH3wGVeXM5nCNL+hDX5ddmvOm/5cZVxISHkh1PJnf5BeLcSFTzSxCYTAN4WSIKJvMsbwTW5j+UdFp6hc+KhV3jU8=";
        sb.append(FishCrypto.v(strM467));
        sb.append(str);
        JSONObject jSONObject = new JSONObject(X1.X(sb.toString(), null, d()));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strE = e("id", jSONObjectOptJSONObject);
                    String strE2 = e("title", jSONObjectOptJSONObject);
                    if (!TextUtils.isEmpty(strE) && !TextUtils.isEmpty(strE2)) {
                        String strE3 = e("singer", jSONObjectOptJSONObject);
                        String strE4 = e("picurl", jSONObjectOptJSONObject);
                        if (TextUtils.isEmpty(strE4) || "null".equalsIgnoreCase(strE4)) {
                            strE4 = FishCrypto.v(strM467).concat("/apple-touch-icon.png");
                        }
                        arrayList.add(new k(strE, strE2, strE4, strE3));
                        this.a.put(strE, jSONObjectOptJSONObject);
                    }
                }
            }
        }
        return new FetchResult(arrayList, jSONObject.optInt("currentPage", 1), Math.max(jSONObject.optInt("totalPages", 1), 1), Math.max(jSONObject.optInt("totalCount", jSONObject.optInt("count", arrayList.size())), arrayList.size()));
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

    public void init(Context context, String str) {
        super.init(context, str);
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

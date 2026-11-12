package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class TuXiaoBei extends Spider {
    public static final LinkedHashMap a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f99short = {2900, 2859, 2868, 2943, 2909, 2928, 2882, 2942, 2932, 2914, 2931, 2907, 2888, 2927, 2895, 2858, 2929, 2861, 2892, 2943, 2902, 2908, 2862, 2911, 2930, 2928, 2921, 2897, 2905, 2924, 2920, 2933, 2914, 2856, 2912, 2896, 2928, 2860, 2935, 2859, 2914, 2926, 2888, 2922, 2897, 2894, 2928, 2869, 2904, 2858, 2904, 2911, 2929, 2942, 2863, 2850, 2860, 2856, 2925, 2912, 2909, 2860, 2925, 2912, 2925, 2865, 2882, 2930, 2929, 2915, 2942, 2936, 2851, 2926, 2909, 2898, 2892, 2929, 2857, 2869, 2940, 2889, 2902, 2930, 2922, 2898, 2857, 2939, 2921, 2856, 2902, 2869, 2920, 2898, 2889, 2882, 2910, 2904, 2861, 2897, 2942, 2889, 2850, 2935, 2856, 2926, 2857, 2937, 2924, 2921, 2855, 2731, 2807, 2785, 2789, 2806, 2791, 2796, 2731, 2797, 2794, 2784, 2785, 2812, 2747, 2799, 2785, 2813, 2745, 2728, 2729, 2747, 2768, 2757, 2603, 2577, 2594, 2616, 2607, 2604, 2580, 2679, 2661, 2618, 2598, 2603, 2611, 2661, 2583, 1142, 1132, 1147, 1144, 677, 762, 742, 747, 755, 677, 1082, 1086, 1076, 1426, 1427, 1410, 2774, 26501, 26134, 19193, 1617, 1641, 1574, 26729, 27130, -3106, 25172, 25543, 1751, 1747, 2199, 2223, 2272, 2199, 2277, 2292, 2199, 2223, 2273, 18124, 2093, 2130, 2125, 2054, 2084, 2057, 2107, 2055, 2061, 2075, 2058, 2082, 2097, 2070, 2102, 2131, 2056, 2132, 2101, 2054, 2095, 2085, 2135, 2086, 2059, 2057, 2064, 2088, 2080, 2069, 2065, 2060, 2075, 2129, 2073, 2089, 2057, 2133, 2062, 2130, 2075, 2071, 2097, 2067, 2088, 2103, 2057, 2124, 2081, 2131, 2081, 2086, 2056, 2055, 2134, 2139, 2133, 2129, 2068, 2073, 2084, 2133, 2068, 2073, 2068, 2120, 2107, 2059, 2056, 2074, 2055, 2049, 2138, 2071, 2084, 2091, 2101, 2056, 2128, 2124, 2053, 2096, 2095, 2059, 2067, 2091, 2128, 2050, 2064, 2129, 2095, 2124, 2065, 2091, 2096, 2107, 2087, 2081, 2132, 2088, 2055, 2096, 2139, 2062, 2129, 2071, 2128, 2048, 2069, 2064, 2142, 1070, 1120, 1135, 1128, 1132, 1120, 1141, 1124, 2616, 2562, 2609, 2603, 2620, 2623, 2567, 2660, 2678, 2601, 2613, 2616, 2592, 2678, 2564, 1686, 1676, 1691, 1688, 3027, 2956, 2960, 2973, 2949, 3027, 1483, 1487, 1477, 2113, 2112, 2129, 3127, 3179, 3175, 3127, 3110, 3125, 3110, 3104, 3125, 3110, 3127, 3119, 3179, 3175, 3104, 3106, 3113, 3106, 3125, 3118, 3108, 24843, 24728, 18864, 2624, 2680, 2615, 28354, 28497, -2699, 27900, 28015, 2175, 2171, 3211, 3316, 3307, 3232, 3202, 3247, 3229, 3233, 3243, 3261, 3244, 3204, 3223, 3248, 3216, 3317, 3246, 3314, 3219, 3232, 3209, 3203, 3313, 3200, 3245, 3247, 3254, 3214, 3206, 3251, 3255, 3242, 3261, 3319, 3263, 3215, 3247, 3315, 3240, 3316, 3261, 3249, 3223, 3253, 3214, 3217, 3247, 3306, 3207, 3317, 3207, 3200, 3246, 3233, 3312, 3325, 3315, 3319, 3250, 3263, 3202, 3315, 3250, 3263, 3250, 3310, 3229, 3245, 3246, 3260, 3233, 3239, 3324, 3249, 3202, 3213, 3219, 3246, 3318, 3306, 3235, 3222, 3209, 3245, 3253, 3213, 3318, 3236, 3254, 3319, 3209, 3306, 3255, 3213, 3222, 3229, 3201, 3207, 3314, 3214, 3233, 3222, 3325, 3240, 3319, 3249, 3318, 3238, 3251, 3254, 3320, 1934, 2001, 1997, 1984, 2008, 1934, 1190, 1152, 1174, 1153, 1246, 1202, 1172, 1174, 1181, 1159, 2012, 2046, 2027, 2040, 2045, 2045, 2032, 1982, 1956, 1983, 1953, 1969, 1977, 2040, 1985, 2041, 2046, 2047, 2036, 1962, 1969, 2002, 1985, 1988, 1969, 2040, 1985, 2041, 2046, 2047, 2036, 1969, 2014, 1986, 1969, 1952, 1954, 1998, 1955, 1998, 1954, 1969, 2045, 2040, 2042, 2036, 1969, 2012, 2032, 2034, 1969, 2014, 1986, 1969, 1993, 1976, 1969, 2000, 2017, 2017, 2045, 2036, 1990, 2036, 2035, 2010, 2040, 2021, 1982, 1959, 1953, 1956, 1983, 1952, 1983, 1952, 1956, 1969, 1977, 2010, 2009, 1989, 2012, 2013, 1981, 1969, 2045, 2040, 2042, 2036, 1969, 2006, 2036, 2034, 2042, 2046, 1976, 1969, 1991, 2036, 2019, 2018, 2040, 2046, 2047, 1982, 1952, 1954, 1983, 1953, 1983, 1954, 1969, 2012, 2046, 2035, 2040, 2045, 2036, 1982, 1952, 1956, 2004, 1952, 1957, 1961, 1969, 1986, 2032, 2039, 2032, 2019, 2040, 1982, 1959, 1953, 1957, 1983, 1952, 883, 806, 825, 820, 821, 831, 775, 802, 817, 800, 880, 806, 825, 820, 821, 831, 1096, 1097, 1112, 1327, 1402, 1381, 1384, 1385, 1379, 1371, 1406, 1389, 1404, 2891, 2900, 2905, 2904, 2898, 2832, 2894, 2895, 2910, 1513, 1430, 1417, 1487, 1501, 1505, 1477, 1477, 1430, 1493, 1426, 1519, 1472, 1491, 1519, 1515, 1487, 1477, 1520, 1514, 1480, 1508, 1514, 1518, 1523, 1485, 1519, 1535, 1481, 1438, 1428, 1534, 1507, 1523, 1428, 1522, 1534, 1428, 1516, 1424, 1490, 1488, 1484, 1488, 1522, 1521, 1487, 1438, 1523, 1477, 1477, 1420, 1522, 1525, 1514, 1524, 1482, 1503, 1514, 1506, 1424, 1527, 1427, 1420, 1476, 1429, 1521, 1526, 1520, 1534, 1489, 1518, 1518, 1481, 1487, 1515, 1492, 1524, 1495, 1475, 1483, 1476, 1482, 1493, 1492, 1512, 1475, 1524, 1472, 1434, 1434, -32483, 28526, 20943, -31269, 28288, 28435, 2569, 1871, 1840, 1839, 1892, 1862, 1899, 1881, 1893, 1903, 1913, 1896, 1856, 1875, 1908, 1876, 1841, 1898, 1846, 1879, 1892, 1869, 1863, 1845, 1860, 1897, 1899, 1906, 1866, 1858, 1911, 1907, 1902, 1913, 1843, 1915, 1867, 1899, 1847, 1900, 1840, 1913, 1909, 1875, 1905, 1866, 1877, 1899, 1838, 1859, 1841, 1859, 1860, 1898, 1893, 1844, 1849, 1847, 1843, 1910, 1915, 1862, 1847, 1910, 1915, 1910, 1834, 1881, 1897, 1898, 1912, 1893, 1891, 1848, 1909, 1862, 1865, 1879, 1898, 1842, 1838, 1895, 1874, 1869, 1897, 1905, 1865, 1842, 1888, 1906, 1843, 1869, 1838, 1907, 1865, 1874, 1881, 1861, 1859, 1846, 1866, 1893, 1874, 1849, 1900, 1843, 1909, 1842, 1890, 1911, 1906, 1852, 2681, 2598, 2618, 2615, 2607, 2681, 771, 859, 836, 841, 840, 834, 768, 841, 840, 857, 844, 836, 833, 781, 771, 857, 836, 857, 833, 840, 1850, 1831, 1850, 1826, 1835, 1202, 2488, 2528, 2559, 2546, 2547, 2553, 2491, 2534, 2554, 2551, 2543, 2491, 2548, 2553, 2542, 2486, 2559, 2555, 2545, 297, 296, 313, 1998, 1942, 1929, 1924, 1925, 1935, 1997, 1924, 1925, 1940, 1921, 1929, 1932, 1984, 1998, 1940, 1945, 1936, 1925, 904, 976, 975, 962, 963, 969, 907, 962, 963, 978, 967, 975, 970, 902, 904, 965, 969, 979, 968, 978, 1108, 1036, 1043, 1054, 1055, 1045, 1111, 1054, 1055, 1038, 1051, 1043, 1046, 1114, 1108, 1054, 1055, 1033, 1049, 22615, 21772, 
    -31714, -29065, 25940, -31194, 22087, 23712, -30540, 2404, 2331, 2308, 2383, 2413, 2368, 2418, 2382, 2372, 2386, 2371, 2411, 2424, 2399, 2431, 2330, 2369, 2333, 2428, 2383, 2406, 2412, 2334, 2415, 2370, 2368, 2393, 2401, 2409, 2396, 2392, 2373, 2386, 2328, 2384, 2400, 2368, 2332, 2375, 2331, 2386, 2398, 2424, 2394, 2401, 2430, 2368, 2309, 2408, 2330, 2408, 2415, 2369, 2382, 2335, 2322, 2332, 2328, 2397, 2384, 2413, 2332, 2397, 2384, 2397, 2305, 2418, 2370, 2369, 2387, 2382, 2376, 2323, 2398, 2413, 2402, 2428, 2369, 2329, 2309, 2380, 2425, 2406, 2370, 2394, 2402, 2329, 2379, 2393, 2328, 2406, 2309, 2392, 2402, 2425, 2418, 2414, 2408, 2333, 2401, 2382, 2425, 2322, 2375, 2328, 2398, 2329, 2377, 2396, 2393, 2327, 847, 1696, 1690, 1705, 1715, 1700, 1703, 1695, 1788, 1774, 1713, 1709, 1696, 1720, 1774, 1692, 2210, 2232, 2223, 2220, 3151, 3088, 3084, 3073, 3097, 3151, 859, 863, 853, 1019, 1018, 1003, 588, 528, 540, 588, 605, 590, 605, 603, 590, 605, 588, 596, 25053, 24654, 17514, 1312, 1304, 1367, 27917, 27806, -2374, 24892, 24751, 1471, 1467, 315, 259, 332, 315, 329, 344, 315, 259, 333, 20320, 271, 280, 269, 271, 22903, 25348, 479, 461, 459, 464, 465, 24684, 19362, 2250, 2264, 2242, 2261, 2264, 2248, 21088, 24571, 2332, 2324, 2325, 2332, 2306, 2322, 23409, 31959, 3172, 3138, 3156, 3139, 3100, 3184, 3158, 3156, 3167, 3141, 3162, 3192, 3181, 3198, 3195, 3195, 3190, 3128, 3106, 3129, 3111, 3127, 3135, 3136, 3198, 3193, 3187, 3192, 3168, 3172, 3127, 3161, 3139, 3127, 3110, 3111, 3129, 3111, 3116, 3127, 3136, 3198, 3193, 3105, 3107, 3116, 3127, 3183, 3105, 3107, 3134, 3127, 3158, 3175, 3175, 3195, 3186, 3136, 3186, 3189, 3164, 3198, 3171, 3128, 3106, 3108, 3104, 3129, 3108, 3105, 3127, 3135, 3164, 3167, 3139, 3162, 3163, 3131, 3127, 3195, 3198, 3196, 3186, 3127, 3152, 3186, 3188, 3196, 3192, 3134, 3127, 3156, 3199, 3173, 3192, 3194, 3186, 3128, 3110, 3109, 3109, 3129, 3111, 3129, 3111, 3129, 3111, 3127, 3140, 3190, 3185, 3190, 3173, 3198, 3128, 3106, 3108, 3104, 3129, 3108, 3105, 2525, 2466, 2493, 2550, 2516, 2553, 2507, 2551, 2557, 2539, 2554, 2514, 2497, 2534, 2502, 2467, 2552, 2468, 2501, 2550, 2527, 2517, 2471, 2518, 2555, 2553, 2528, 2520, 2512, 2533, 2529, 2556, 2539, 2465, 2537, 2521, 2553, 2469, 2558, 2466, 2539, 2535, 2497, 2531, 2520, 2503, 2553, 2492, 2513, 2467, 2513, 2518, 2552, 2551, 2470, 2475, 2469, 2465, 2532, 2537, 2516, 2469, 2532, 2537, 2532, 2488, 2507, 2555, 2552, 2538, 2551, 2545, 2474, 2535, 2516, 2523, 2501, 2552, 2464, 2492, 2549, 2496, 2527, 2555, 2531, 2523, 2464, 2546, 2528, 2465, 2527, 2492, 2529, 2523, 2496, 2507, 2519, 2513, 2468, 2520, 2551, 2496, 2475, 2558, 2465, 2535, 2464, 2544, 2533, 2528, 2478, 1095, 1427, 1444, 1447, 1444, 1459, 1444, 1459, 273, 275, 262, 279, 277, 285, 256, 267, 305, 285, 284, 262, 279, 284, 262, 572, 573, 556, 569, 561, 564, 539, 567, 566, 556, 573, 566, 556, 1157, 1154, 1152, 1160, 1198, 1154, 1155, 1177, 1160, 1155, 1177, 1366, 1354, 1351, 1375, 1347, 1364, 1381, 1353, 1352, 1362, 1347, 1352, 1362, 501, 483, 487, 500, 485, 494, 453, 489, 488, 498, 483, 488, 498};

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            for (k kVar : X1.L(X1.X(FishCrypto.v("N1.eGjXdnxiARuU0k7VeLF4EhjsKCvrox2zJj6m1xtRpKTj/B0BEkd5862wzG6wzw+Xhkydb9tGHVk3/fSLhpH3as2L/rHSXDB7KdS8m2t3cvs=") + "/search/index?key=" + URLEncoder.encode(str, "UTF-8"), null, a()), "").Q("a[href^=/play/]")) {
                String strReplace = kVar.c("href").replace("/play/", "");
                if (!strReplace.isEmpty()) {
                    k kVarR = kVar.R("img");
                    String strC = kVarR != null ? kVarR.c("src") : "";
                    Iterator<E> it = kVar.Q("p").iterator();
                    String strTrim = "";
                    String strReplace2 = strTrim;
                    while (it.hasNext()) {
                        String strTrim2 = ((k) it.next()).T().trim();
                        if (!strTrim2.isEmpty()) {
                            if (strTrim2.contains("播放") || strTrim2.contains("万")) {
                                strReplace2 = strTrim2.replace("播放：", "");
                            } else if (strTrim.isEmpty() && !strTrim2.matches("\\d+")) {
                                strTrim = strTrim2;
                            }
                        }
                    }
                    if (strTrim.isEmpty()) {
                        strTrim = kVar.T().replaceAll("播放.*", "").replaceAll("\\d+\\.?\\d*万", "").trim();
                    }
                    if (!strTrim.isEmpty() && !strReplace.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                arrayList.add(new com.github.catvod.spider.merge.p001b.k(strReplace, strTrim, strC, strReplace2));
                                break;
                            }
                        } while (!((com.github.catvod.spider.merge.p001b.k) it2.next()).b().equals(strReplace));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a.entrySet()) {
            arrayList.add(new com.github.catvod.spider.merge.p001b.b((String) entry.getKey(), (String) entry.getValue(), null));
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            for (k kVar : X1.L(X1.X(FishCrypto.v("N1.eGjXdnxiARuU0k7VeLF4EhjsKCvrox2zJj6m1xtRpKTj/B0BEkd5862wzG6wzw+Xhkydb9tGHVk3/fSLhpH3as2L/rHSXDB7KdS8m2t3cvs=") + "/animate", null, a()), "").Q("a[href^=/play/]")) {
                String strReplace = kVar.c("href").replace("/play/", "");
                if (!strReplace.isEmpty()) {
                    k kVarR = kVar.R("img");
                    String strC = kVarR != null ? kVarR.c("src") : "";
                    Iterator<E> it = kVar.Q("p, paragraph, generic").iterator();
                    String strTrim = "";
                    String strReplace2 = strTrim;
                    while (it.hasNext()) {
                        String strTrim2 = ((k) it.next()).T().trim();
                        if (!strTrim2.isEmpty()) {
                            if (strTrim2.contains("播放") || strTrim2.contains("万")) {
                                strReplace2 = strTrim2.replace("播放：", "");
                            } else if (strTrim.isEmpty() && !strTrim2.matches("\\d+")) {
                                strTrim = strTrim2;
                            }
                        }
                    }
                    if (strTrim.isEmpty()) {
                        strTrim = kVar.T().replaceAll("播放.*", "").trim();
                    }
                    if (!strTrim.isEmpty() && !strReplace.isEmpty() && arrayList2.size() < 30) {
                        arrayList2.add(new com.github.catvod.spider.merge.p001b.k(strReplace, strTrim, strC, strReplace2));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, arrayList2);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        AbstractC0280n1.u(str, str2);
        try {
            String str3 = FishCrypto.v("N1.eGjXdnxiARuU0k7VeLF4EhjsKCvrox2zJj6m1xtRpKTj/B0BEkd5862wzG6wzw+Xhkydb9tGHVk3/fSLhpH3as2L/rHSXDB7KdS8m2t3cvs=") + "/play/" + str2;
            HashMap mapA = a();
            mapA.put("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1");
            com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(str3, null, mapA), "");
            String strA = gVarL.Q("#videoWrap video").a("src");
            if (strA.isEmpty()) {
                strA = gVarL.Q("#videoWrap").a("video-src");
            }
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(FishCrypto.u("N1.hzFbb1r5HgtHLhbWMoCMITjHXn93YDT3UY3K7uwkwUVh9Tbb+URMSmxME7P4+c2VQWYvIInhLsSpdlcmrsOdSg==", strA));
            gVar.h(mapA);
            return gVar.r();
        } catch (Exception e) {
            e.printStackTrace();
            return com.github.catvod.spider.merge.p001b.g.d("解析失败");
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strM105 = "播放$";
        try {
            String str = list.get(0);
            com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(FishCrypto.v("N1.eGjXdnxiARuU0k7VeLF4EhjsKCvrox2zJj6m1xtRpKTj/B0BEkd5862wzG6wzw+Xhkydb9tGHVk3/fSLhpH3as2L/rHSXDB7KdS8m2t3cvs=") + "/play/" + str, null, a()), "");
            String strG = gVarL.Q(".video-detail .title").g();
            if (strG.isEmpty()) {
                strG = gVarL.Q("title").g().split("-")[0].trim();
            }
            String strA = gVarL.Q(".video-play-box img").a("src");
            String strG2 = gVarL.Q(".video-detail .type").g();
            String strG3 = gVarL.Q(".video-detail .count").g();
            String strG4 = gVarL.Q(".video-detail .desc").g();
            if (strG4.isEmpty()) {
                strG4 = strG;
            }
            com.github.catvod.spider.merge.p001b.k kVar = new com.github.catvod.spider.merge.p001b.k();
            kVar.n(str);
            kVar.o(strG);
            kVar.p(strA);
            kVar.i(strG2);
            kVar.s(strG3);
            kVar.l(strG4);
            kVar.q("兔小贝");
            kVar.r(strM105 + str);
            N1.d(kVar);
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        } catch (Exception e) {
            e.printStackTrace();
            return com.github.catvod.spider.merge.p001b.g.d("详情获取失败");
        }
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        try {
            for (k kVar : X1.L(X1.X(FishCrypto.v("N1.eGjXdnxiARuU0k7VeLF4EhjsKCvrox2zJj6m1xtRpKTj/B0BEkd5862wzG6wzw+Xhkydb9tGHVk3/fSLhpH3as2L/rHSXDB7KdS8m2t3cvs=") + "/" + str, null, a()), "").Q("a[href^=/play/]")) {
                String strReplace = kVar.c("href").replace("/play/", "");
                if (!strReplace.isEmpty()) {
                    k kVarR = kVar.R("img");
                    String strC = kVarR != null ? kVarR.c("src") : "";
                    Iterator<E> it = kVar.Q("p, paragraph").iterator();
                    String strTrim = "";
                    String strReplace2 = strTrim;
                    while (it.hasNext()) {
                        String strTrim2 = ((k) it.next()).T().trim();
                        if (!strTrim2.isEmpty()) {
                            if (strTrim2.contains("播放") || strTrim2.contains("万")) {
                                strReplace2 = strTrim2.replace("播放：", "");
                            } else if (strTrim.isEmpty() && !strTrim2.matches("\\d+")) {
                                strTrim = strTrim2;
                            }
                        }
                    }
                    if (strTrim.isEmpty()) {
                        strTrim = kVar.T().replaceAll("播放.*", "").replaceAll("\\d+\\.?\\d*万", "").trim();
                    }
                    if (!strTrim.isEmpty() && !strReplace.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                arrayList.add(new com.github.catvod.spider.merge.p001b.k(strReplace, strTrim, strC, strReplace2));
                                break;
                            }
                        } while (!((com.github.catvod.spider.merge.p001b.k) it2.next()).b().equals(strReplace));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        linkedHashMap.put("erge", "儿歌");
        linkedHashMap.put("gushi", "故事");
        linkedHashMap.put("guoxue", "国学");
        linkedHashMap.put("gongyi", "公益");
    }

    public static HashMap a() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
        mapS.put("Referer", FishCrypto.v("N1.eGjXdnxiARuU0k7VeLF4EhjsKCvrox2zJj6m1xtRpKTj/B0BEkd5862wzG6wzw+Xhkydb9tGHVk3/fSLhpH3as2L/rHSXDB7KdS8m2t3cvs=").concat("/"));
        return mapS;
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
}

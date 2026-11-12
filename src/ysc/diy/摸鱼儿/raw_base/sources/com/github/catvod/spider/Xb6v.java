package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0261h0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.S0;
import com.github.catvod.spider.merge.A.T0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.f0.p;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.j;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Xb6v extends Cloud {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f112short = {1133, 2616, 2596, 2596, 2592, 2595, 2666, 2687, 2687, 2599, 2599, 2599, 2686, 2600, 2610, 2662, 2598, 2686, 2611, 2623, 2621, 2262, 2200, 2192, 2203, 2176, 2182, 2261, 2251, 2261, 2201, 2204, 2261, 2251, 2261, 2196, 707, 729, 718, 717, 30590, -29811, 20524, 19487, -27582, 2759, 2577, 2579, 2566, 2583, 2619, 2582, 31580, 20652, 1420, 1628, 1607, 1600, 1624, 2065, 2060, 2065, 2057, 2048, 2460, 2445, 2437, 2456, 2433, 2444, 2893, 2907, 2903, 2904, 2900, 2908, 2868, 2855, 2849, 2876, 2870, 2873, 2864, 573, 569, 564, 3096, 3091, 3084, 3091, 3087, 3080, 1675, 1693, 1689, 1674, 1691, 1680, 2685, 2683, 2668, 2659, 2663, 2682, 1028, 1034, 1046, 1037, 1024, 1038, 1053, 1035, 3243, 3255, 3255, 3251, 3248, 3321, 3308, 3308, 3252, 3252, 3252, 3309, 3259, 3233, 3317, 3253, 3309, 3232, 3244, 3246, 3308, 3238, 3308, 3248, 3238, 3234, 3249, 3232, 3243, 3308, 3314, 3242, 3245, 3239, 3238, 3259, 3309, 3251, 3243, 3251, 1645, 1611, 1629, 1610, 1557, 1657, 1631, 1629, 1622, 1612, 3104, 3074, 3095, 3076, 3073, 3073, 3084, 3138, 3160, 3139, 3165, 3149, 3141, 3130, 3076, 3075, 3081, 3074, 3098, 3102, 3149, 3107, 3129, 3149, 3164, 3165, 3139, 3165, 3158, 3149, 3130, 3076, 3075, 3163, 3161, 3158, 3149, 3093, 3163, 3161, 3140, 3149, 3116, 3101, 3101, 3073, 3080, 3130, 3080, 3087, 3110, 3076, 3097, 3138, 3160, 3166, 3162, 3139, 3166, 3163, 3149, 3141, 3110, 3109, 3129, 3104, 3105, 3137, 3149, 3073, 3076, 3078, 3080, 3149, 3114, 3080, 3086, 3078, 3074, 3140, 3149, 3118, 3077, 3103, 3074, 3072, 3080, 3138, 3164, 3167, 3167, 3139, 3165, 3139, 3165, 3139, 3165, 3149, 3134, 3084, 3083, 3084, 3103, 3076, 3138, 3160, 3166, 3162, 3139, 3166, 3163, 291, 286, 261, 267, 261, 258, 445, 417, 417, 421, 422, 495, 506, 506, 418, 418, 418, 507, 429, 439, 483, 419, 507, 438, 442, 440, 3099, 3116, 3119, 3116, 3131, 3116, 3131, 2567, 2587, 2587, 2591, 2588, 2645, 2624, 2624, 2584, 2584, 2584, 2625, 2583, 2573, 2649, 2585, 2625, 2572, 2560, 2562, 2624, 421, 454, 394, 412, 408, 395, 410, 401, 400, 413, 452, 834, 837, 847, 846, 851, 773, 859, 835, 859, 788, 859, 842, 844, 846, 790, 1091, 1046, 1024, 1028, 1047, 1030, 1037, 1036, 1025, 1112, 20508, 22639, 447, 447, 443, 1549, 1564, 1555, 1612, 1615, 1614, 1514, 1513, 1512, 22084, 28896, 2918, 2917, 2916, 28343, -25337, 3075, 3103, 3103, 3099, 3096, 3153, 3140, 3140, 3100, 3100, 3100, 3141, 3091, 3081, 3165, 3101, 3141, 3080, 3076, 3078, 964, 971, 991, 972, 960, 968, 1945, 1944, 1929, 2726, 2746, 2746, 2750, 2749, 2804, 2785, 2785, 2745, 2745, 2745, 2784, 2742, 2732, 2808, 2744, 2784, 2733, 2721, 2723, 2322, 2356, 2338, 2357, 2410, 2310, 2336, 2338, 2345, 2355, 1887, 1917, 1896, 1915, 1918, 1918, 1907, 1853, 1831, 1852, 1826, 1842, 1850, 1861, 1915, 1916, 1910, 1917, 1893, 1889, 1842, 1884, 1862, 1842, 1827, 1826, 1852, 1826, 1833, 1842, 1861, 1915, 1916, 1828, 1830, 1833, 1842, 1898, 1828, 1830, 1851, 1842, 1875, 1890, 1890, 1918, 1911, 1861, 1911, 1904, 1881, 1915, 1894, 1853, 1831, 1825, 1829, 1852, 1825, 1828, 1842, 1850, 1881, 1882, 1862, 1887, 1886, 1854, 1842, 1918, 1915, 1913, 1911, 1842, 1877, 1911, 1905, 1913, 1917, 1851, 1842, 1873, 1914, 1888, 1917, 1919, 1911, 1853, 1827, 1824, 1824, 1852, 1826, 1852, 1826, 1852, 1826, 1842, 1857, 1907, 1908, 1907, 1888, 1915, 1853, 1831, 1825, 1829, 1852, 1825, 1828, 2799, 2748, 2723, 2751, 2744, 2707, 2735, 2723, 2722, 2744, 2729, 2722, 2744, 2291, 2236, 2223, 2217, 2228, 2238, 2225, 2232, 2178, 2238, 2226, 2227, 2217, 2236, 2228, 2227, 2232, 2223, 2301, 2275, 2301, 2229, 2284, 2641, 2635, 2652, 2655, 1821, 1800, 1803, 1797, 1804, 1865, 1800, 2475, 2470, 2489, 2529, 2476, 2464, 2465, 2491, 2474, 2487, 2491, 2543, 2545, 2543, 2475, 2470, 2489, 2529, 2477, 2464, 2487, 1005, 950, 273, 2437, 2501, 2521, 2521, 2525, 2526, 2455, 2545, 2434, 2545, 2434, 2525, 2508, 2499, 2545, 2435, 2524, 2520, 2508, 2527, 2502, 2545, 2435, 2510, 2499, 2545, 2434, 2526, 2545, 2434, 2550, 2547, 2447, 2544, 2438, 2436, 993, 929, 957, 957, 953, 954, 1014, 1011, 917, 998, 917, 998, 993, 1014, 1011, 993, 1014, 1011, 958, 958, 958, 949, 953, 936, 935, 992, 917, 999, 992, 1014, 993, 1014, 1011, 1016, 1016, 1020, 917, 999, 938, 934, 932, 949, 1016, 1016, 1020, 938, 941, 935, 917, 999, 938, 934, 932, 992, 917, 998, 954, 917, 998, 914, 919, 917, 954, 1013, 1003, 1006, 916, 994, 992, 780, 783, 782, 845, 860, 851, 787, 862, 850, 848, 2346, 2345, 2344, 2411, 2426, 2421, 2357, 2424, 2421, 3187, 3176, 3169, 3186, 3173, 3118, 3121, 3122, 3123, 3184, 3169, 3182, 3118, 3171, 3182, 1888, 1891, 1890, 1895, 1897, 1893, 1919, 1842, 1854, 1852, 1110, 1109, 1108, 1119, 1105, 1106, 1097, 1028, 1032, 1034, 3088, 3091, 3090, 3096, 3088, 3091, 3087, 3138, 3150, 3148, 807, 804, 805, 803, 815, 804, 824, 885, 889, 891, 2747, 2806, 2810, 2811, 2785, 2800, 2797, 2785, 3063, 385, 466, 461, 465, 470, 509, 449, 461, 460, 470, 455, 460, 470, 386, 459, 463, 453, 3185, 3184, 3169, 8231, 31122, 13801, 13801, 22466, 13801, 1473, 1479, 1475, 1494, 1472, 1493, 1419, 1435, 1495, 1533, 1492, 1475, 1482, 1435, 1477, 1479, 1490, 1475, 1473, 1481, 1492, 1503, 1414, 1490, 1479, 1473, 1531, 9885, 23847, 13139, 13139, 19888, 13139, 891, 893, 889, 876, 890, 879, 817, 801, 877, -27850, 28173, 2714, 2696, 2702, 2698, 2719, 2697, 2716, 2754, 2770, 2718, 12267, 17538, 14885, 14885, 23829, 14885, 2573, 2571, 2575, 2586, 2572, 2585, 2631, 2647, 2587, 21927, 20909, 685, 703, 697, 701, 680, 702, 683, 757, 741, 681, 11843, 17799, 28077, 28264, 27794, 15245, 2981, 2979, 2983, 2994, 2980, 2993, 3055, 3071, 2995, 11455, 26213, 14705, 14705, 23849, 14705, 2393, 2399, 2395, 2382, 2392, 2381, 2398, 2305, 2383, 8924, 18729, 14098, 14098, 26630, 14098, 1850, 1852, 1848, 1837, 1851, 1838, 1853, 1890, 1836, 19466, 27941, 523, 537, 543, 539, 526, 536, 525, 595, 579, 527, 9770, 22552, 13284, 13284, 27888, 13284, 972, 970, 974, 987, 973, 984, 902, 918, 986, 20983, 25887, 2609, 2595, 2597, 2593, 2612, 2594, 
    2615, 2665, 2681, 2613, 10720, 30638, 15406, 15406, 17125, 3078, 3072, 3076, 3089, 3079, 3090, 3142, 3164, 3088, 31028, 19583, 668, 666, 670, 651, 669, 648, 667, 708, 650, 1237, 1239, 1218, 1235, 1279, 1234, 1026, 1054, 1054, 1050, 1049, 1104, 1093, 1093, 1053, 1053, 1053, 1092, 1042, 1032, 1116, 1052, 1092, 1033, 1029, 1031, 1921, 597, 594, 600, 601, 580, 611, 885, 819, 815, 822, 823, 1683, 1741, 1756, 1754, 1748, 1747, 1756, 1737, 1748, 1746, 1747, 1693, 1667, 1693, 1756, 2362, 2336, 2359, 2356, 1969, 1974, 1980, 1981, 1952, 1927, 2032, 2038, 2034, 2023, 2033, 2038, 1968, 1964, 1973, 1972, 381, 302, 305, 301, 298, 257, 317, 305, 304, 298, 319, 311, 304, 315, 300, 382, 368, 302, 305, 301, 298, 257, 310, 305, 296, 315, 300, 521, 599, 583, 523, 2436, 2508, 2496, 2513, 2514, 2457, 1624, 1567, 1555, 1550, 1605, 1109, 1105, 1116, 1116, 1111, 1100, 1027, 15024, 14818, 14818, 14818, 14818, 14818, 1746, 13660, 13660, 13660, 13660, 1404, 13660, 15076, 1411, 1424, 1408, 1508, 1505, 1409, 1506, 1428, 1409, 2827, 2319, 2376, 2372, 2393, 2322, 2143, 2139, 2134, 2134, 2141, 2118, 2057, 15528, 1835, 1827, 1846, 1842, 1832, 1916, 15139, 1162, 1180, 1161, 1165, 1175, 1219, 14215, 12993, 3091, 3125, 3107, 3124, 3179, 3079, 3105, 3107, 3112, 3122, 2232, 2202, 2191, 2204, 2201, 2201, 2196, 2266, 2240, 2267, 2245, 2261, 2269, 2210, 2204, 2203, 2193, 2202, 2178, 2182, 2261, 2235, 2209, 2261, 2244, 2245, 2267, 2245, 2254, 2261, 2210, 2204, 2203, 2243, 2241, 2254, 2261, 2189, 2243, 2241, 2268, 2261, 2228, 2181, 2181, 2201, 2192, 2210, 2192, 2199, 2238, 2204, 2177, 2266, 2240, 2246, 2242, 2267, 2246, 2243, 2261, 2269, 2238, 2237, 2209, 2232, 2233, 2265, 2261, 2201, 2204, 2206, 2192, 2261, 2226, 2192, 2198, 2206, 2202, 2268, 2261, 2230, 2205, 2183, 2202, 2200, 2192, 2266, 2244, 2247, 2247, 2267, 2245, 2267, 2245, 2267, 2245, 2261, 2214, 2196, 2195, 2196, 2183, 2204, 2266, 2240, 2246, 2242, 2267, 2246, 2243, 1395, 1348, 1351, 1348, 1363, 1348, 1363, 515, 543, 543, 539, 536, 593, 580, 580, 540, 540, 540, 581, 531, 521, 605, 541, 581, 520, 516, 518, 580, 1502, 1502, 1502, 2011, 1928, 1943, 1931, 1932, 1959, 1947, 1943, 1942, 1932, 1945, 1937, 1942, 1949, 1930, 2008, 2006, 1928, 1943, 1931, 1932, 1959, 1936, 1943, 1934, 1949, 1930, 412, 420, 427, 422, 436, 436, 506, 445, 424, 424, 426, 410, 1847, 1837, 1850, 1849, 1101, 1104, 1101, 1109, 1116, 1452, 1471, 1455, 1483, 1486, 1454, 1485, 1467, 1454, 3105, 3109, 3119, 2888, 2889, 2904, 2305, 2344, 2367, 2358, 2407, 2361, 2363, 2350, 2367, 2365, 2357, 2344, 2339, 2426, 2350, 2363, 2365, 2311, 3080, 3082, 3103, 3086, 3084, 3076, 3097, 3090, 3112, 3076, 3077, 3103, 3086, 3077, 3103, 2112, 2113, 2128, 2117, 2125, 2120, 2151, 2123, 2122, 2128, 2113, 2122, 2128, 554, 557, 559, 551, 513, 557, 556, 566, 551, 556, 566, 1854, 1826, 1839, 1847, 1835, 1852, 1805, 1825, 1824, 1850, 1835, 1824, 1850, 1612, 1626, 1630, 1613, 1628, 1623, 1660, 1616, 1617, 1611, 1626, 1617, 1611, 2281, 2303, 2299, 2280, 2297, 2290, 2265, 2293, 2292, 2286, 2303, 2292, 2286};
    public String r;
    public String s;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0126.m503(f112short, 0, 1, 1116));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        k kVar;
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(C0105.m416(f112short, 1, 20, 2640), null, j()), "");
        com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q(C0125.m499(f112short, 21, 15, 2293));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < dVarQ.size(); i++) {
            if (i >= 2 && i != dVarQ.size() - 1) {
                k kVar2 = (k) dVarQ.get(i);
                String strM339 = C0085.m339(f112short, 36, 4, 683);
                String strC = kVar2.c(strM339);
                String strT = kVar2.T();
                if (strT.equals(C0055.m219(f112short, 40, 3, 587))) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new com.github.catvod.spider.merge.p001b.c(C0009.m33(f112short, 43, 2, 530), ""));
                    p pVar = kVar2.a;
                    if (pVar == null) {
                        kVar = null;
                    } else {
                        List listC = ((k) pVar).C();
                        int iL = k.L(kVar2, listC) + 1;
                        if (listC.size() > iL) {
                            kVar = (k) listC.get(iL);
                        } else {
                            kVar = null;
                        }
                    }
                    for (k kVar3 : kVar.Q(C0104.m414(f112short, 45, 1, 2726))) {
                        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(kVar3.T(), kVar3.c(strM339).replaceAll(strC, "")));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new com.github.catvod.spider.merge.p001b.d(C0045.m177(f112short, 46, 6, 2674), C0122.m486(f112short, 52, 2, 1831), arrayList2));
                    linkedHashMap.put(strC, arrayList3);
                }
                com.github.catvod.spider.merge.D.b.z(strC, strT, null, arrayList);
            }
        }
        return com.github.catvod.spider.merge.p001b.g.A(arrayList, m(gVarL), linkedHashMap);
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        String strM126 = C0032.m126(f112short, 54, 1, 1469);
        if (!str2.equals(strM126)) {
            return com.github.catvod.spider.merge.p001b.g.y(m(X1.L(X1.X(this.r + (Integer.parseInt(str2) - 1) + this.s, null, j()), "")));
        }
        Response responseI = X1.I(new Request.Builder().url(C0043.m169(f112short, 112, 40, 3267)).addHeader(C0120.m477(f112short, 152, 10, 1592), C0090.m358(f112short, 162, 111, 3181)).addHeader(C0098.m390(f112short, 273, 6, 364), C0112.m445(f112short, 279, 20, 469)).addHeader(C0089.m355(f112short, 299, 7, 3145), C0053.m210(f112short, 306, 21, 2671)).post(new FormBody.Builder().add(C0117.m467(f112short, 55, 4, 1583), C0125.m499(f112short, 59, 5, 2149)).add(C0125.m499(f112short, 64, 6, 2536), strM126).add(C0085.m339(f112short, 70, 6, 2873), C0019.m75(f112short, 76, 7, 2901)).add(C0070.m277(f112short, 83, 3, 592), strM126).add(C0063.m249(f112short, 86, 6, 3196), C0118.m471(f112short, 92, 6, 1784)).add(C0091.m360(f112short, 98, 6, 2574), "").addEncoded(C0128.m511(f112short, 104, 8, 1135), str).build()).build());
        String[] strArrSplit = String.valueOf(responseI.request().url()).split(C0059.m234(f112short, 327, 11, 505));
        this.r = com.github.catvod.spider.merge.D.b.m(new StringBuilder(), strArrSplit[0], C0082.m325(f112short, 338, 15, 811));
        this.s = C0076.m301(f112short, 353, 10, 1125) + strArrSplit[1];
        return com.github.catvod.spider.merge.p001b.g.y(m(X1.L(responseI.body().string(), "")));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strI = AbstractC0280n1.i(str, str2, null, null);
        String strX = AbstractC0302v0.X(str, str2);
        if (strX != null) {
            return strX;
        }
        if (str.contains(C0010.m36(f112short, 363, 2, 2340)) || str.contains(C0119.m473(f112short, 365, 3, 398)) || str.contains(C0021.m83(f112short, 368, 6, 1661)) || str.contains(C0095.m379(f112short, 374, 5, 1499)) || str.contains(C0105.m416(f112short, 379, 5, 2903))) {
            return super.playerContent(str, str2, list);
        }
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(C0125.m499(f112short, 384, 20, 3179) + str2, null, null), "");
        Pattern pattern = AbstractC0309x1.a;
        Matcher matcher = Pattern.compile(pattern.pattern()).matcher(gVarL.K());
        String strGroup = matcher.find() ? matcher.group(0) : "";
        if (com.github.catvod.spider.merge.Y.c.a(strGroup)) {
            Matcher matcher2 = Pattern.compile(pattern.pattern()).matcher(X1.L(X1.X(gVarL.Q(C0142.m567(f112short, 404, 6, 941)).a(C0137.m545(f112short, 410, 3, 2026)), null, null), "").K());
            strGroup = matcher2.find() ? matcher2.group(0) : "";
        }
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(strGroup);
        gVar.b(strI);
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strM368;
        String strB;
        String strA;
        String str;
        String strB2 = com.github.catvod.spider.merge.D.b.B(C0030.m116(f112short, 413, 20, 2766), list.get(0));
        HashMap map = new HashMap();
        map.put(C0030.m116(f112short, 433, 10, 2375), C0063.m249(f112short, 443, 111, 1810));
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(strB2, null, map), "");
        com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q(C0137.m545(f112short, 554, 13, 2764));
        String strG = gVarL.Q(C0103.m408(f112short, 567, 23, 2269)).g();
        C0261h0 c0261h0 = new C0261h0(4);
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = dVarQ.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strM368 = C0093.m368(f112short, 590, 4, 2617);
            if (!zHasNext) {
                break;
            }
            for (k kVar : ((k) it.next()).Q(C0087.m346(f112short, 594, 7, 1897))) {
                String strC = kVar.c(strM368);
                String strT = kVar.T();
                if (AbstractC0302v0.r0(strC)) {
                    arrayList.add(new T0(strT, strC));
                }
            }
        }
        S0 s0G = AbstractC0302v0.G(strG, arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = gVarL.Q(C0008.m31(f112short, 601, 21, 2511)).iterator();
        while (it2.hasNext()) {
            k kVar2 = (k) it2.next();
            String strG2 = kVar2.Q(C0017.m65(f112short, 622, 2, 901)).g();
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (k kVar3 : kVar2.Q(C0021.m83(f112short, 624, 1, 368))) {
                String strC2 = kVar3.c(strM368);
                String strT2 = kVar3.T();
                Iterator it3 = it2;
                if (strC2.matches(C0128.m511(f112short, 625, 36, 2477)) || strC2.matches(C0117.m467(f112short, 661, 69, 969))) {
                    str = strM368;
                } else {
                    String lowerCase = strC2.toLowerCase();
                    str = strM368;
                    if (!lowerCase.contains(C0092.m365(f112short, 730, 10, 829)) && !lowerCase.contains(C0095.m379(f112short, 740, 9, 2331)) && !lowerCase.contains(C0117.m467(f112short, 749, 15, 3072)) && !lowerCase.contains(C0128.m511(f112short, 764, 10, 1873)) && !lowerCase.contains(C0097.m386(f112short, 774, 10, 1127)) && !lowerCase.contains(C0137.m545(f112short, 784, 10, 3105)) && !lowerCase.contains(C0098.m390(f112short, 794, 10, 790))) {
                        j jVar = new j();
                        jVar.a = strT2;
                        jVar.b = strC2;
                        arrayList3.add(jVar);
                        i++;
                    }
                    it2 = it3;
                    strM368 = str;
                }
                arrayList2.add(strC2);
                it2 = it3;
                strM368 = str;
            }
            Iterator it4 = it2;
            String str2 = strM368;
            if (i > 0) {
                c0261h0.b(strG2, arrayList3);
            }
            it2 = it4;
            strM368 = str2;
        }
        if (arrayList2.isEmpty()) {
            strB = "";
            strA = strB;
        } else {
            strB = b(arrayList2);
            strA = a(arrayList2);
        }
        S0 s0C = c0261h0.c();
        com.github.catvod.spider.merge.h0.d<k> dVarQ2 = gVarL.Q(C0135.m539(f112short, 804, 8, 2709));
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        for (k kVar4 : dVarQ2) {
            if (sbB.length() != 0) {
                sbB.append(C0014.m54(f112short, 812, 1, 3069));
            }
            sbB.append(kVar4.K());
        }
        String strG3 = com.github.catvod.spider.merge.e0.b.g(sbB);
        String strA2 = gVarL.Q(C0032.m126(f112short, 813, 17, 418)).a(C0143.m570(f112short, 830, 3, 3074));
        String strK = k(strG3, Pattern.compile(C0045.m177(f112short, 833, 15, 1513)));
        if (strK.equals("")) {
            strK = gVarL.Q(C0074.m292(f112short, 848, 18, 1446)).g();
        }
        String strK2 = k(strG3, Pattern.compile(C0106.m422(f112short, 866, 15, 851)));
        if (strK2.equals("")) {
            strK2 = k(strG3, Pattern.compile(C0137.m545(f112short, 881, 12, 2720)));
        }
        String strK3 = k(strG3, Pattern.compile(C0006.m21(f112short, 893, 15, 2597)));
        if (strK3.equals("")) {
            strK3 = k(strG3, Pattern.compile(C0130.m516(f112short, 908, 12, 663)));
        }
        String strK4 = k(strG3, Pattern.compile(C0126.m503(f112short, 920, 15, 2957)));
        String strH = h(strG3, Pattern.compile(C0072.m285(f112short, 935, 15, 2417)));
        if (strH.equals("")) {
            strH = h(strG3, Pattern.compile(C0143.m570(f112short, 950, 15, 1810)));
        }
        if (strH.equals("")) {
            strH = h(strG3, Pattern.compile(C0085.m339(f112short, 965, 12, 561)));
        }
        String strH2 = h(strG3, Pattern.compile(C0003.m10(f112short, 977, 15, 996)));
        if (strH2.equals("")) {
            strH2 = h(strG3, Pattern.compile(C0093.m368(f112short, 992, 12, 2571)));
        }
        String str3 = strA;
        String strI = i(strG3, Pattern.compile(C0133.m529(f112short, 1004, 14, 3118), 34));
        if (strI.equals("")) {
            strI = i(strG3, Pattern.compile(C0101.m402(f112short, 1018, 11, 692), 34));
        }
        com.github.catvod.spider.merge.p001b.k kVar5 = new com.github.catvod.spider.merge.p001b.k();
        kVar5.n(list.get(0));
        kVar5.o(strG);
        kVar5.p(strA2);
        kVar5.i(strK);
        kVar5.u(strK2);
        kVar5.k(strK3);
        kVar5.s(strK4);
        kVar5.j(strH);
        kVar5.m(strH2);
        kVar5.l(strI);
        String strL = l(strB, s0G.c, s0C.c);
        kVar5.q(l(str3, s0G.b, s0C.b));
        kVar5.r(strL);
        AbstractC0280n1.p(strG);
        AbstractC0280n1.q(strL);
        boolean z = FishCrypto.a;
        N1.d(kVar5);
        return com.github.catvod.spider.merge.p001b.g.s(kVar5);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int size;
        String strM365 = C0092.m365(f112short, 1029, 6, 1206);
        String strJ = com.github.catvod.spider.merge.D.b.j(C0009.m33(f112short, 1035, 20, 1130), str, map.get(strM365) == null ? "" : map.get(strM365));
        if (!str2.equals(C0017.m65(f112short, 1055, 1, 1968))) {
            strJ = strJ + C0028.m108(f112short, 1056, 6, 572) + str2 + C0112.m445(f112short, 1062, 5, 859);
        }
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(strJ, null, j()), "");
        String strC = gVarL.Q(C0081.m322(f112short, 1067, 15, 1725)).e().c(C0076.m301(f112short, 1082, 4, 2386));
        int i = Integer.parseInt(str2);
        int i2 = Integer.parseInt(k(strC, Pattern.compile(C0142.m567(f112short, 1086, 16, 2008))));
        com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q(C0021.m83(f112short, 1102, 27, 350));
        if (i == i2) {
            size = dVarQ.size() + ((i - 1) * 18);
        } else {
            size = i2 * 18;
        }
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.F(m(gVarL));
        gVar.o(i, i2, 18, size);
        return gVar.r();
    }

    public static String h(String str, Pattern pattern) {
        String strReplaceAll = k(str, pattern).replaceAll(C0046.m182(f112short, 1129, 4, 565), "").replaceAll(C0019.m75(f112short, 1133, 6, 2466), "").replaceAll(C0087.m346(f112short, 1139, 5, 1662), "").replaceAll(C0044.m175(f112short, 1144, 7, 1080), C0074.m292(f112short, 1151, 1, 2635));
        String strM102 = C0026.m102(f112short, 1152, 5, 2530);
        String strM193 = C0049.m193(f112short, 1157, 1, 1790);
        return strReplaceAll.replaceAll(strM102, strM193).replaceAll(C0109.m432(f112short, 1158, 6, 1372), strM193).replaceAll(C0006.m21(f112short, 1164, 1, 2788), "");
    }

    public static String i(String str, Pattern pattern) {
        return k(str, pattern).replaceAll(C0101.m402(f112short, 1165, 9, 1471), "").replaceAll(C0097.m386(f112short, 1174, 1, 2817), "").replaceAll(C0001.m1(f112short, 1175, 5, 2345), "").replaceAll(C0089.m355(f112short, 1180, 7, 2098), C0073.m288(f112short, 1187, 1, 3155)).replaceAll(C0059.m234(f112short, 1188, 6, 1863), C0137.m545(f112short, 1194, 1, 2867)).replaceAll(C0103.m408(f112short, 1195, 6, 1272), C0030.m116(f112short, 1201, 1, 1942)).replaceAll(C0073.m288(f112short, 1202, 1, 705), "");
    }

    public static HashMap j() {
        return com.github.catvod.spider.merge.D.b.t(C0032.m126(f112short, 1203, 10, 3142), C0106.m422(f112short, 1213, 111, 2293), C0137.m545(f112short, 1324, 7, 1313), C0091.m360(f112short, 1331, 21, 619));
    }

    public static String k(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).trim() : "";
    }

    public static String l(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return TextUtils.join(C0001.m1(f112short, 1352, 3, 1530), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList m(com.github.catvod.spider.merge.f0.g gVar) {
        com.github.catvod.spider.merge.h0.d<k> dVarQ = gVar.Q(C0009.m33(f112short, 1355, 27, 2040));
        ArrayList arrayList = new ArrayList();
        for (k kVar : dVarQ) {
            k kVar2 = (k) kVar.Q(C0021.m83(f112short, 1382, 12, 455)).get(0);
            arrayList.add(new com.github.catvod.spider.merge.p001b.k(kVar2.c(C0026.m102(f112short, 1394, 4, 1887)), kVar2.c(C0079.m314(f112short, 1398, 5, 1081)).replaceAll(C0142.m567(f112short, 1403, 9, 1424), ""), kVar2.Q(C0114.m454(f112short, 1412, 3, 3144)).a(C0079.m314(f112short, 1415, 3, 2875)), kVar.Q(C0044.m175(f112short, 1418, 18, 2394)).g()));
        }
        return arrayList;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0076.m301(f112short, 1436, 15, 3179));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0050.m199(f112short, 1451, 13, 2084));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0117.m467(f112short, 1464, 11, 578));
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
    }

    @Override // com.github.catvod.spider.Cloud
    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0085.m339(f112short, 1475, 13, 1870));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0105.m416(f112short, 1488, 13, 1599));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0092.m365(f112short, 1501, 13, 2202));
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

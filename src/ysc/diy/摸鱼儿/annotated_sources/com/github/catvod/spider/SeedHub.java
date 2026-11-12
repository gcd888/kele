package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.SeedHub;
import com.github.catvod.spider.merge.A.AbstractC0244b1;
import com.github.catvod.spider.merge.A.AbstractC0260h;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0257g;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.S0;
import com.github.catvod.spider.merge.A.T0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.l0.l;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.A;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.CallableC0455g;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.p022z.J1;
import com.github.catvod.spider.merge.p022z.K1;
import com.github.catvod.spider.merge.p022z.R0;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0120;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class SeedHub extends Cloud {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f86short = {3050, 2998, 3050, 1187, 1186, 1200, 1243, 1230, 3232, 580, 518, 516, 541, 514, 526, 536, 580, 2354, 2312, 2363, 2337, 2358, 2357, 2425, 2414, 2339, 2354, 2365, 2316, 2362, 2359, 2318, 2504, 2514, 2501, 2502, 1065, 1061, 1059, 1066, 1057, 1072, 2709, 2735, 2716, 2694, 2705, 2706, 2782, 2761, 2695, 2705, 2705, 2704, 2731, 2717, 2704, 2729, 991, 969, 969, 968, 1011, 965, 968, 913, 900, 1008, 968, 903, 901, 2745, 2741, 2739, 2746, 2737, 2720, 1539, 1557, 1557, 1556, 1583, 1486, 1496, 1496, 1497, 1493, 1480, 1503, 1506, 1499, 1490, 1489, 1497, 1496, 1487, 1533, 1533, 1059, 1059, 791, 799, 18065, 2194, 670, 31873, 22213, 2340, 20491, 28040, 2202, 20494, -27473, 854, 832, 832, 833, 845, 848, 839, 890, 854, 832, 849, 849, 844, 843, 834, 3310, 3288, 3288, 3289, 3317, 3272, 3295, -30973, 29651, 1876, 1858, 1858, 1859, 1912, 31408, 20714, 24451, 19669, 31912, 19680, 19578, -29428, 25044, 31184, 26309, 25489, 21471, 31022, 21364, -27375, 25162, 3092, 3091, 3085, 1527, 1522, 1533, 1534, 1522, 1528, 1510, 1331, 1317, 1317, 1316, 1320, 1333, 1314, 1311, 1316, 1321, 1331, 1328, 1324, 1313, 1337, 2029, 2043, 2043, 2042, 2038, 2027, 2044, 1985, 2040, 2039, 2034, 2026, 2043, 2028, 296, 318, 318, 319, 307, 302, 313, 260, 308, 297, 319, 318, 297, 2176, 2198, 2198, 2199, 2203, 2182, 2193, 2220, 2177, 2198, 2176, 2198, 2183, 518, 521, 531, 520, 528, 531, 575, 516, 517, 532, 513, 521, 524, 544, 544, -30500, 27400, 24696, 24784, 1814, 1792, 1792, 1793, 1850, 1309, 1375, 1373, 1348, 1371, 1367, 1345, 1309, 2670, 1067, 1138, 2768, 438, 434, 440, 388, 446, 435, 427, 386, 1182, 1183, 1166, 915, 906, 966, 984, 966, 906, 911, 20614, 25710, 2880, 18297, 26198, 2424, 28924, 23308, 3261, 2287, 2283, 2205, 2213, 2234, 2293, 2236, 2287, 2283, 2371, 2427, 2404, 2347, 2402, 20416, 22288, 31540, 21063, -27938, 21450, 28520, 28065, 1999, 1941, 1949, 1988, 1992, 1993, 2003, 1990, 1998, 1993, 2004, 1935, 31783, 18796, 1934, 1927, 1932, 1927, 2007, 3030, 3052, 3039, 3013, 3026, 3025, 2973, 2954, 3015, 3030, 3033, 3048, 3038, 3027, 3050, 1734, 1756, 1739, 1736, 2319, 2334, 2321, 2336, 2326, 2331, 2336, 2391, 2339, 2331, 2388, 2390, 2634, 2570, 2582, 2582, 2578, 2577, 2648, 2622, 2637, 2622, 2637, 2578, 2563, 2572, 2622, 2636, 2579, 2583, 2563, 2576, 2569, 2622, 2636, 2561, 2572, 2622, 2637, 2577, 2622, 2637, 2617, 2620, 2624, 2623, 2633, 2635, 1251, 1187, 1215, 1215, 1211, 1208, 1265, 1175, 1252, 1175, 1252, 1199, 1209, 1186, 1213, 1198, 1175, 1253, 1214, 1192, 1175, 1253, 1192, 1189, 1175, 1252, 1208, 1175, 1252, 1168, 1173, 1257, 1174, 1248, 1250, 2450, 2446, 2446, 2442, 2441, 2496, 2517, 2517, 2442, 2459, 2452, 2516, 2456, 2459, 2451, 2462, 2447, 2516, 2457, 2453, 2455, 1961, 2025, 2037, 2037, 2033, 2034, 1979, 2013, 1966, 2013, 1966, 2038, 2038, 2038, 2013, 1967, 2016, 2029, 2024, 2040, 2036, 2031, 2021, 2035, 2024, 2039, 2020, 2013, 1967, 2018, 2030, 2028, 2013, 1966, 2034, 2013, 1966, 2010, 2015, 1955, 2012, 1962, 2045, 2025, 2037, 2037, 2033, 2034, 1979, 2013, 1966, 2013, 1966, 2038, 2038, 2038, 2013, 1967, 2016, 2029, 2024, 2033, 2016, 2031, 2013, 1967, 2018, 2030, 2028, 2013, 1966, 2034, 2013, 1966, 2010, 2015, 1955, 2012, 1962, 1960, 978, 914, 910, 910, 906, 905, 960, 934, 981, 934, 981, 906, 923, 916, 934, 980, 898, 911, 916, 918, 927, 915, 934, 980, 921, 917, 919, 934, 981, 905, 934, 981, 929, 932, 984, 935, 977, 979, 528, 528, 532, 527, 578, 590, 588, 526, 594, 526, 340, 340, 336, 262, 257, 267, 331, 262, 266, 264, 330, 278, 330, 2316, 2319, 2318, 2381, 2396, 2387, 2323, 2398, 2386, 2384, 1383, 1380, 1381, 1318, 1335, 1336, 1400, 1333, 1336, 2128, 2123, 2114, 2129, 2118, 2061, 2066, 2065, 2064, 2131, 2114, 2125, 2061, 2112, 2125, 3200, 3203, 3202, 3207, 3209, 3205, 3231, 3282, 3294, 3292, 1762, 1761, 1760, 1771, 1765, 1766, 1789, 1712, 1724, 1726, 2473, 2474, 2475, 2465, 2473, 2474, 2486, 2555, 2551, 2549, 2379, 2376, 2377, 2383, 2371, 2376, 2388, 2329, 2325, 2327, 3021, 3021, 3021, 1694, 1700, 1687, 1677, 1690, 1689, 1749, 1730, 1676, 1690, 1690, 1691, 1696, 1686, 1691, 1698, 3155, 3141, 3141, 3140, 3199, 3145, 3140, 3101, 3080, 3196, 3140, 3083, 3081, 1674, 1674, 1674, 31950, 22164, 1071, 1666, 1684, 1684, 1685, 1689, 1668, 1683, 1710, 1685, 1688, 1666, 1665, 1693, 1680, 1672, 2667, 2685, 2685, 2684, 2672, 2669, 2682, 2631, 2666, 2685, 2667, 2685, 2668, 1960, 1982, 1982, 1983, 1971, 1966, 1977, 1924, 1972, 1961, 1983, 1982, 1961, 1855, 1833, 1833, 1832, 1828, 1849, 1838, 1811, 1834, 1829, 1824, 1848, 1833, 1854, 1842, 1828, 1828, 1829, 1833, 1844, 1827, 1822, 1842, 1828, 1845, 1845, 1832, 1839, 1830, 2085, 29824, 32009, 30634, 23642, 28246, 17703, 21224, 22645, 28979, 23037, -31870, 28634, 30436, 22419, 29436, 1403, 1389, 1389, 1388, 1376, 1405, 1386, 1367, 1388, 1377, 1403, 1400, 1380, 1385, 1393, 819, 805, 805, 804, 808, 821, 802, 799, 804, 809, 819, 816, 812, 801, 825, 645, 18547, 30009, 31920, -31313, 25740, 2786, 2804, 2804, 2805, 2809, 2788, 2803, 2766, 2807, 2808, 2813, 2789, 2804, 2787, 3148, 3162, 3162, 3163, 3159, 3146, 3165, 3168, 3161, 3158, 3155, 3147, 3162, 3149, 30746, 29075, 25817, 22980, 3098, 3084, 3084, 3085, 3073, 3100, 3083, 3126, 3078, 3099, 3085, 3084, 3099, 766, 744, 744, 745, 741, 760, 751, 722, 738, 767, 745, 744, 767, 2843, 2829, 2829, 2828, 2816, 2845, 2826, 2871, 2842, 2829, 2843, 2829, 2844, 1860, 1874, 1874, 1875, 1887, 1858, 1877, 1896, 1861, 1874, 1860, 1874, 1859, 25133, 23362, -25449, -30229, 1459, 1445, 1445, 1444, 1448, 1461, 1442, 1439, 1446, 1455, 1452, 1444, 1445, 1458, 1408, 1408, 2514, 2514, 324, 264, 266, 287, 270, 268, 260, 281, 258, 270, 280, 324, 2280, 2218, 2216, 2225, 2222, 2210, 2228, 2280, 2833, 2910, 2895, 2889, 2891, 2835, 1459, 1512, 1457, 1469, 1468, 1446, 1459, 1467, 1468, 1441, 1530, 19417, 19410, -25177, 1531, 373, 296, 318, 318, 319, 307, 302, 313, 260, 312, 308, 309, 317, 306, 316, 1919, 1959, 1952, 1982, 971, 970, 977, 960, 2474, 2479, 2490, 2475, 
    2490, 2471, 2467, 2475, 2272, 2300, 2278, 2273, 2288, 2294, 2264, 2268, 2256, 2262, 2260, 2242, 2757, 2794, 2738, 347, 3305, 3305, 3305, 582, 636, 591, 597, 578, 577, 601, 538, 520, 586, 584, 593, 590, 578, 596, 520, 635, 579, 524, 520, 634, 1278, 1252, 1267, 1264, 2588, 2584, 2589, 2655, 2653, 2628, 2651, 2647, 2625, 2589, 2586, 2670, 2646, 2585, 2587, 2589, 2588, 2584, 1727, 1706, 1102, 1098, 1088, 535, 538, 514, 2769, 2699, 2485, 3295, 3294, 3279, 1394, 1399, 1378, 1399, 1339, 1381, 1380, 1397, 2760, 2765, 2588, 2664, 2640, 2639, 2560, 2633, 2589, 2703, 2701, 2714, 2695, 2689, 2688, 2638, 2636, 2649, 2632, 2634, 2626, 2655, 2644, 2670, 2626, 2627, 2649, 2632, 2627, 2649, 3069, 3068, 3053, 3064, 3056, 3061, 3034, 3062, 3063, 3053, 3068, 3063, 3053, 1431, 1424, 1426, 1434, 1468, 1424, 1425, 1419, 1434, 1425, 1419, 1447, 1469, 1440, 1457, 2186, 2198, 2198, 2194, 2193, 2264, 2253, 2253, 2197, 2197, 2197, 2252, 2193, 2183, 2183, 2182, 2186, 2199, 2176, 2252, 2177, 2177, 3156, 3138, 3138, 3139, 3151, 3154, 3141, 3192, 3156, 3150, 3155, 3138, 3192, 3154, 3157, 3147, 421, 387, 405, 386, 477, 433, 407, 405, 414, 388, 1009, 979, 966, 981, 976, 976, 989, 915, 905, 914, 908, 924, 916, 1003, 981, 978, 984, 979, 971, 975, 924, 1010, 1000, 924, 909, 908, 914, 908, 903, 924, 1003, 981, 978, 906, 904, 903, 924, 964, 906, 904, 917, 924, 1021, 972, 972, 976, 985, 1003, 985, 990, 1015, 981, 968, 915, 905, 911, 907, 914, 911, 906, 924, 916, 1015, 1012, 1000, 1009, 1008, 912, 924, 976, 981, 983, 985, 924, 1019, 985, 991, 983, 979, 917, 924, 1023, 980, 974, 979, 977, 985, 915, 909, 910, 910, 914, 908, 914, 908, 914, 908, 924, 1007, 989, 986, 989, 974, 981, 915, 905, 911, 907, 914, 911, 906, 632, 2213, 2194, 2193, 2194, 2181, 2194, 2181, 25498, 26318, 22144, 31857, 22059, -28594, 26389, 596, 610, 610, 611, 591, 626, 613, 31430, 20636, 906, 902, 896, 905, 898, 915, 2341, 2361, 2361, 2365, 869, 832, 839, 834, 885, 858, 771, 788, 885, 858, 771, 882, 779, 782, 884, 769, 882, 887, 779, 782, 884, 770, 768, 882, 779, 782, 884, 2966, 3029, 3024, 3031, 3026, 3046, 3018, 3021, 3032, 3019, 3021, 2966, 2950, 3018, 3036, 3036, 3037, 3046, 3024, 3037, 2948, 2264, 2195, 2193, 2184, 2199, 2203, 2209, 2186, 2199, 2186, 2194, 2203, 2243, 2195, 2207, 2201, 2192, 2203, 2186, 3014, 3027, 3016, 3013, 3067, 2959, 3068, 2949, 2944, 3066, 2959, 3068, 3046, 2954, 3069, 3014, 2954, 3037, 2967, 2954, 2974, 2956, 2952, 2970, 3066, 2956, 2958, 3068, 2949, 2944, 3066, 3067, 2958, 814, 825, 828, 880, 871, 884, 890, 874, 867, 882, 890, 869, 873, 872, 885, 882, 815, 858, 885, 813, 866, 871, 882, 871, 858, 885, 812, 827, 858, 885, 812, 861, 804, 801, 859, 814, 861, 856, 804, 801, 859, 813, 815, 861, 804, 801, 859, 2048, 2053, 2064, 2053, 2104, 2071, 2126, 2137, 2104, 2071, 2126, 2111, 2118, 2115, 2105, 2124, 2111, 2085, 2121, 2110, 2053, 2121, 2078, 2132, 2121, 2141, 2127, 2123, 2137, 2105, 2127, 2125, 2111, 2118, 2115, 2105, 1025, 1037, 1035, 1026, 1033, 1048, 1110, 499, 438, 442, 444, 437, 446, 431, 481, 391, 484, 419, 431, 486, 430, 425, 437, 481, 384, 389, 505, 508, 391, 424, 487, 485, 390, 496, 498, 2226, 2216, 2239, 2236, 2279, 2177, 2296, 2301, 2183, 2290, 2231, 2235, 2237, 2228, 2239, 2222, 2272, 2177, 2180, 2296, 2301, 2183, 2289, 2291, 2177, 2296, 2301, 2183, 2469, 2489, 2484, 2476, 2480, 2471, 2454, 2490, 2491, 2465, 2480, 2491, 2465, 2466, 2484, 2480, 2467, 2482, 2489, 2450, 2494, 2495, 2469, 2484, 2495, 2469};
    public static final HashMap v = new HashMap();
    public C0257g s;
    public K1 t;
    public final com.github.catvod.spider.merge.p020x.b r = new com.github.catvod.spider.merge.p020x.b(C0117.m467(f86short, 973, 15, 347));
    public final J1 u = new J1() { // from class: com.github.catvod.spider.SeedHub.1

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f87short = {26363, -31229, 1395, 27138, -29958, 3015, 3014, 3031, 2953, 3029, 3032, 3032, 23931, 25219, 895, 867, 867, 871, 868, 813, 824, 824, 864, 864, 864, 825, 868, 882, 882, 883, 895, 866, 885, 825, 884, 884};

        @Override // com.github.catvod.spider.merge.p022z.J1
        public boolean addApiUrl(String str) {
            List customUrls = getCustomUrls();
            if (customUrls.contains(str)) {
                return false;
            }
            customUrls.add(str);
            return true;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public boolean addApiUrl(String str, String str2) {
            return addApiUrl(str2);
        }

        public void addCustomUrl(String str) {
            List customUrls = getCustomUrls();
            if (customUrls.contains(str)) {
                return;
            }
            customUrls.add(str);
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public boolean clearCustomApiUrls() {
            clearCustomUrls();
            return true;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public void clearCustomUrls() {
            getCustomUrls().clear();
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public String getApiName(String str) {
            if (!isBuiltinUrl(str)) {
                return str;
            }
            String[] builtinUrls = getBuiltinUrls();
            for (int i = 0; i < builtinUrls.length; i++) {
                if (str.equals(builtinUrls[i])) {
                    return C0082.m325(f87short, 0, 3, 1363) + (i + 1);
                }
            }
            return C0045.m177(f87short, 3, 2, 2474);
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public String[] getBuiltinUrls() {
            return new String[0];
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public /* bridge */ /* synthetic */ String getChannelApiUrl() {
            return "";
        }

        public /* bridge */ /* synthetic */ String getChannelDetail() {
            return C0142.m567(f87short, 5, 7, 2996);
        }

        public /* bridge */ /* synthetic */ int getChannelMode() {
            return 0;
        }

        public /* bridge */ /* synthetic */ String getChannelSummary() {
            return C0109.m432(f87short, 12, 2, 3091);
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public List getChannels() {
            return new ArrayList();
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public List getCustomChannels() {
            return new ArrayList();
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public List getCustomPlugins() {
            return new ArrayList();
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public List<String> getCustomUrls() {
            return Collections.emptyList();
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public int getEnabledApiCount() {
            return getVisibleApiUrls().size();
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public List<String> getEnabledTypes() {
            return SeedHub.this.r.f;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public List<String> getExcludeKeywords() {
            return SeedHub.this.r.h;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public Map<String, String> getHeaders() {
            HashMap map = SeedHub.v;
            return SeedHub.this.j();
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public List<String> getIncludeKeywords() {
            return SeedHub.this.r.g;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public /* bridge */ /* synthetic */ int getLinkCheckMode() {
            return 1;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public int getMaxPerType() {
            return SeedHub.this.r.n;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public String[][] getPanTypes() {
            return com.github.catvod.spider.merge.p020x.c.c;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public List getPlugins() {
            return new ArrayList();
        }

        public String getSiteUrl() {
            C0257g c0257g = SeedHub.this.s;
            return c0257g == null ? C0082.m325(f87short, 14, 22, 791) : c0257g.b();
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public List getVisibleApiUrls() {
            ArrayList arrayList = new ArrayList();
            for (String str : getBuiltinUrls()) {
                arrayList.add(str);
            }
            arrayList.addAll(getCustomUrls());
            return arrayList;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public /* bridge */ /* synthetic */ boolean isApiEnabled(String str) {
            return true;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public boolean isBuiltinUrl(String str) {
            if (str == null) {
                return false;
            }
            for (String str2 : getBuiltinUrls()) {
                if (str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public boolean isFolderMode() {
            return SeedHub.this.r.o;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public boolean removeApiUrl(String str) {
            return getCustomUrls().remove(str);
        }

        public void removeCustomUrl(String str) {
            getCustomUrls().remove(str);
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public void saveConfig() {
            SeedHub.this.r.t();
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public /* bridge */ /* synthetic */ boolean setApiEnabled(String str, boolean z) {
            return true;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public /* bridge */ /* synthetic */ void setChannelApiUrl(String str) {
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public /* bridge */ /* synthetic */ void setChannelMode(int i) {
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public void setFolderMode(boolean z) {
            SeedHub.this.r.o = z;
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public /* bridge */ /* synthetic */ void setLinkCheckMode(int i) {
        }

        @Override // com.github.catvod.spider.merge.p022z.J1
        public void setMaxPerType(int i) {
            com.github.catvod.spider.merge.p020x.b bVar = SeedHub.this.r;
            bVar.getClass();
            bVar.n = Math.max(0, i);
        }

        public void setSiteUrl(String str) {
        }
    };

    final class SeedHubItem {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public SeedHubItem(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0136  */
    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        ArrayList arrayList;
        String str2;
        int i;
        String strM360;
        String str3;
        String str4;
        SeedHubItem seedHubItem;
        SeedHub seedHub = this;
        StringBuilder sb = new StringBuilder(C0085.m339(f86short, 0, 3, 3013));
        String strM42 = C0011.m42(f86short, 3, 5, 1270);
        sb.append(URLEncoder.encode(str, strM42));
        String strM365 = C0092.m365(f86short, 8, 1, 3215);
        sb.append(strM365);
        ArrayList<SeedHubItem> arrayListM = m(X1.L(seedHub.s.a(sb.toString(), j()), ""));
        com.github.catvod.spider.merge.p020x.b bVar = seedHub.r;
        if (bVar.o) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = bVar.f.iterator();
            while (it.hasNext()) {
                linkedHashMap.put((String) it.next(), new ArrayList());
            }
            HashSet hashSet = new HashSet();
            int iMin = Math.min(arrayListM.size(), 12);
            int i2 = 0;
            while (i2 < iMin && !k(linkedHashMap)) {
                SeedHubItem seedHubItem2 = (SeedHubItem) arrayListM.get(i2);
                String strM31 = C0008.m31(f86short, 9, 8, 619);
                try {
                    com.github.catvod.spider.merge.f0.g gVarL = X1.L(seedHub.s.a(strM31 + seedHubItem2.a + strM365, j()), "");
                    Iterator<E> it2 = gVarL.Q(C0118.m471(f86short, 17, 15, 2387)).iterator();
                    int i3 = 0;
                    while (true) {
                        boolean zHasNext = it2.hasNext();
                        strM360 = C0091.m360(f86short, 32, 4, 2464);
                        str3 = seedHubItem2.b;
                        if (!zHasNext) {
                            str2 = strM365;
                            break;
                        }
                        k kVar = (k) it2.next();
                        int i4 = i3 + 1;
                        str2 = strM365;
                        if (i3 >= 12) {
                            break;
                        }
                        try {
                            if (k(linkedHashMap)) {
                                break;
                            }
                            String strO = seedHub.o(kVar.c(strM360));
                            if (TextUtils.isEmpty(strO)) {
                                str4 = "";
                            } else {
                                String strL = AbstractC0244b1.l(AbstractC0302v0.b1(strO));
                                if (TextUtils.isEmpty(strL)) {
                                    if (AbstractC0302v0.r0(strO)) {
                                        strL = C0096.m382(f86short, 36, 6, 1092);
                                    } else {
                                        str4 = "";
                                    }
                                }
                                str4 = strL;
                            }
                            if (TextUtils.isEmpty(str4)) {
                                seedHubItem = seedHubItem2;
                                i = i2;
                            } else {
                                seedHubItem = seedHubItem2;
                                i = i2;
                                try {
                                    h(linkedHashMap, hashSet, str4, strO, i(kVar.T(), str3), seedHubItem);
                                } catch (Exception unused) {
                                }
                            }
                            gVarL = gVarL;
                            seedHubItem2 = seedHubItem;
                            i3 = i4;
                            strM365 = str2;
                            i2 = i;
                            seedHub = this;
                        } catch (Exception unused2) {
                            i = i2;
                        }
                        i2 = i + 1;
                        seedHub = this;
                        strM365 = str2;
                    }
                    SeedHubItem seedHubItem3 = seedHubItem2;
                    i = i2;
                    int i5 = 0;
                    for (k kVar2 : gVarL.Q(C0046.m182(f86short, 42, 16, 2804))) {
                        int i6 = i5 + 1;
                        if (i5 >= 12 || k(linkedHashMap)) {
                            break;
                        }
                        String strC = kVar2.c(strM360);
                        Pattern patternCompile = Pattern.compile(C0096.m382(f86short, 58, 13, 940));
                        if (strC == null) {
                            strC = "";
                        }
                        Matcher matcher = patternCompile.matcher(strC);
                        String strGroup = matcher.find() ? matcher.group(1) : "";
                        if (!TextUtils.isEmpty(strGroup)) {
                            try {
                                h(linkedHashMap, hashSet, C0106.m422(f86short, 71, 6, 2772), C0116.m463(f86short, 77, 5, 1648) + strGroup, i(kVar2.T(), str3), seedHubItem3);
                            } catch (Exception unused3) {
                            }
                        }
                        i5 = i6;
                        strM360 = strM360;
                        i2 = i + 1;
                        seedHub = this;
                        strM365 = str2;
                    }
                } catch (Exception unused4) {
                    str2 = strM365;
                }
                i2 = i + 1;
                seedHub = this;
                strM365 = str2;
            }
            arrayList = new ArrayList();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                List list = (List) entry.getValue();
                if (!list.isEmpty()) {
                    String str5 = (String) entry.getKey();
                    String strL2 = com.github.catvod.spider.merge.p020x.b.l(str5);
                    StringBuilder sb2 = new StringBuilder(C0137.m545(f86short, 82, 16, 1469));
                    sb2.append(URLEncoder.encode(str, strM42));
                    String strM186 = C0047.m186(f86short, 98, 2, 1123);
                    sb2.append(strM186);
                    sb2.append(str5);
                    sb2.append(strM186);
                    sb2.append(jCurrentTimeMillis);
                    String string = sb2.toString();
                    v.put(string, list);
                    StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strL2, C0105.m416(f86short, 100, 2, 823));
                    sbP.append(list.size());
                    sbP.append(C0101.m402(f86short, 102, 2, 2235));
                    arrayList.add(new com.github.catvod.spider.merge.p001b.k(string, sbP.toString(), AbstractC0302v0.j(str5), strL2, true));
                }
            }
        } else {
            arrayList = new ArrayList();
            for (SeedHubItem seedHubItem4 : arrayListM) {
                arrayList.add(new com.github.catvod.spider.merge.p001b.k(seedHubItem4.a, seedHubItem4.b, seedHubItem4.c, seedHubItem4.d));
            }
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0010.m36(f86short, 104, 1, 687), C0010.m36(f86short, 105, 2, 2484), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0044.m175(f86short, 107, 1, 2326), C0095.m379(f86short, 108, 2, 675), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0046.m182(f86short, 110, 1, 2217), C0043.m169(f86short, 111, 2, 617), null));
        com.github.catvod.spider.merge.D.b.z(C0026.m102(f86short, 113, 15, 805), C0017.m65(f86short, 128, 9, 3261), null, arrayList2);
        arrayList.addAll(n(X1.L(this.s.a("", j()), "")));
        return com.github.catvod.spider.merge.p001b.g.z(arrayList2, arrayList);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws JSONException {
        String strX = AbstractC0302v0.X(str, str2);
        if (strX == null) {
            String strM471 = C0118.m471(f86short, 137, 5, 1831);
            if (!str2.startsWith(strM471)) {
                return super.playerContent(str, str2, list);
            }
            if (!AbstractC0302v0.C1()) {
                if (AbstractC0302v0.Y()) {
                    AbstractC0302v0.D1();
                }
                return com.github.catvod.spider.merge.p001b.g.m(C0093.m368(f86short, 142, 10, 625));
            }
            String strP = p(str2.replace(strM471, ""));
            if (TextUtils.isEmpty(strP)) {
                return com.github.catvod.spider.merge.p001b.g.d(C0107.m427(f86short, 152, 7, 495));
            }
            strX = com.github.catvod.spider.merge.D.b.f(strP);
        }
        try {
            JSONObject jSONObject = new JSONObject(strX);
            if (!TextUtils.isEmpty(jSONObject.optString(C0003.m10(f86short, 159, 3, 3169)))) {
                String strM463 = C0116.m463(f86short, 162, 7, 1427);
                if (!jSONObject.has(strM463)) {
                    String strI = AbstractC0280n1.i(str, str2, null, null);
                    if (TextUtils.isEmpty(strI)) {
                        return strX;
                    }
                    jSONObject.put(strM463, strI);
                    return jSONObject.toString();
                }
            }
        } catch (JSONException unused) {
        }
        return strX;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0415  */
    /* JADX WARN: Code duplicated, block: B:109:0x042e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0432  */
    /* JADX WARN: Code duplicated, block: B:112:0x0438  */
    /* JADX WARN: Code duplicated, block: B:114:0x044f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0453  */
    /* JADX WARN: Code duplicated, block: B:119:0x0470  */
    /* JADX WARN: Code duplicated, block: B:121:0x047a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0482  */
    /* JADX WARN: Code duplicated, block: B:125:0x049f  */
    /* JADX WARN: Code duplicated, block: B:127:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:128:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:131:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:133:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:136:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:137:0x0518 A[PHI: r13 r25
  0x0518: PHI (r13v21 int) = (r13v19 int), (r13v40 int) binds: [B:135:0x04fd, B:134:0x04f6] A[DONT_GENERATE, DONT_INLINE]
  0x0518: PHI (r25v7 int) = (r25v5 int), (r25v9 int) binds: [B:135:0x04fd, B:134:0x04f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x0535  */
    /* JADX WARN: Code duplicated, block: B:151:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:154:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:194:0x077a  */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str;
        String strM554;
        String str2;
        String str3;
        String strC;
        String strC2;
        String str4;
        String str5;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String lowerCase;
        int i12;
        int i13;
        String str6 = list.get(0);
        if (C0082.m325(f86short, 169, 15, 1344).equals(str6) || C0017.m65(f86short, 184, 14, 1950).equals(str6) || C0063.m249(f86short, 198, 13, 347).equals(str6) || C0115.m459(f86short, 211, 13, 2291).equals(str6)) {
            AbstractC0302v0.g0(str6, new i(17, this));
            return "";
        }
        if (str6.startsWith(C0130.m516(f86short, 224, 15, 608))) {
            String[] strArrK = l.k(str6);
            String strG = l.g(strArrK);
            if (TextUtils.isEmpty(strG)) {
                return com.github.catvod.spider.merge.p001b.g.d(C0047.m186(f86short, 239, 4, 1432));
            }
            if (strG.startsWith(C0047.m186(f86short, 243, 5, 1893))) {
                return l(str6, p(strG.substring(5)), strArrK);
            }
            if (AbstractC0302v0.r0(strG)) {
                return l(str6, strG, strArrK);
            }
            String strDetailContent = super.detailContent(Collections.singletonList(strG));
            return l.j(strDetailContent) ? l.i(str6, strArrK) : l.c(strDetailContent, strArrK);
        }
        String strM288 = C0073.m288(f86short, 248, 8, 1330);
        String strM558 = C0140.m558(f86short, 256, 1, 2625);
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(this.s.a(com.github.catvod.spider.merge.D.b.j(strM288, str6, strM558), j()), "");
        k kVarR = gVarL.R(C0028.m108(f86short, 257, 2, 1091));
        String strTrim = kVarR != null ? kVarR.T().replace(C0059.m234(f86short, 259, 1, 2803), "").trim() : "";
        k kVarR2 = gVarL.R(C0114.m454(f86short, 260, 8, 479));
        String strC3 = kVarR2 != null ? kVarR2.c(C0072.m285(f86short, 268, 3, 1261)) : "";
        Iterator<E> it = gVarL.Q(C0097.m386(f86short, 271, 7, 998)).iterator();
        String strTrim2 = "";
        String strTrim3 = strTrim2;
        String strTrim4 = strTrim3;
        String str7 = strTrim4;
        String str8 = str7;
        while (it.hasNext()) {
            String strT = ((k) it.next()).T();
            String strM567 = C0142.m567(f86short, 278, 3, 2938);
            if (strT.startsWith(strM567)) {
                strTrim2 = strT.replace(strM567, "").trim();
            } else {
                String strM545 = C0137.m545(f86short, 281, 3, 2370);
                if (strT.startsWith(strM545)) {
                    strTrim3 = strT.replace(strM545, "").trim();
                } else {
                    String strM427 = C0107.m427(f86short, 284, 3, 3207);
                    if (strT.startsWith(strM427)) {
                        strTrim4 = strT.replace(strM427, "").trim();
                    } else if (strT.contains(strM558) && strT.matches(C0091.m360(f86short, 287, 9, 2241))) {
                        String[] strArrSplit = strT.split(strM558);
                        int length = strArrSplit.length;
                        int i14 = 0;
                        while (i14 < length) {
                            String[] strArr = strArrSplit;
                            String strTrim5 = strArrSplit[i14].trim();
                            String str9 = strM558;
                            if (strTrim5.matches(C0082.m325(f86short, 296, 5, 2335))) {
                                str7 = strTrim5;
                            } else if (strTrim5.contains(C0055.m219(f86short, 301, 2, 493)) || strTrim5.contains(C0070.m277(f86short, 303, 2, 1210)) || strTrim5.contains(C0092.m365(f86short, 305, 2, 1335)) || strTrim5.contains(C0046.m182(f86short, 307, 2, 2701))) {
                                str8 = strTrim5;
                            }
                            i14++;
                            strM558 = str9;
                            strArrSplit = strArr;
                        }
                    }
                }
            }
            strM558 = strM558;
        }
        k kVarR3 = gVarL.R(C0095.m379(f86short, 309, 19, 1959));
        String strT2 = kVarR3 != null ? kVarR3.T() : "";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q(C0125.m499(f86short, 328, 15, 2999));
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = dVarQ.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            str = strT2;
            strM554 = C0139.m554(f86short, 343, 4, 1710);
            if (!zHasNext) {
                str2 = str7;
                str3 = str8;
                break;
            }
            Iterator it3 = it2;
            k kVar = (k) it2.next();
            str3 = str8;
            str2 = str7;
            if (arrayList4.size() >= 80) {
                break;
            }
            Matcher matcher = Pattern.compile(C0046.m182(f86short, 347, 12, 2431)).matcher(kVar.c(strM554));
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                if (!hashSet.contains(strGroup)) {
                    hashSet.add(strGroup);
                    arrayList4.add(strGroup);
                }
            }
            str8 = str3;
            strT2 = str;
            it2 = it3;
            str7 = str2;
        }
        if (arrayList4.isEmpty()) {
            strM554 = strM554;
            strTrim3 = strTrim3;
            strTrim4 = strTrim4;
            break;
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(new CallableC0455g(this, (String) it4.next(), 1));
        }
        Iterator it5 = AbstractC0260h.a(arrayList5, 10).iterator();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            if (!it5.hasNext()) {
                strM554 = strM554;
                strTrim3 = strTrim3;
                strTrim4 = strTrim4;
                break;
            }
            String str10 = (String) it5.next();
            if (str10 != null) {
                Iterator it6 = it5;
                if (str10.matches(C0109.m432(f86short, 359, 36, 2658))) {
                    i11 = 10;
                    if (i15 < 10) {
                        arrayList3.add(str10);
                        i15++;
                    } else if (str10.matches(C0030.m116(f86short, 395, 35, 1227))) {
                        i11 = 10;
                        if (i16 < 10) {
                            arrayList3.add(str10);
                            i16++;
                        } else {
                            if (str10.contains(C0030.m116(f86short, 430, 21, 2554))) {
                                i11 = 10;
                                if (i17 < 10) {
                                    arrayList3.add(str10);
                                    i17++;
                                }
                            }
                            if (str10.matches(C0116.m463(f86short, 451, 80, 1921))) {
                                i11 = 10;
                                int i22 = i18;
                                i = i15;
                                i2 = i22;
                                if (i2 < 10) {
                                    arrayList3.add(str10);
                                    i7 = i2 + 1;
                                    i15 = i;
                                    i8 = i19;
                                    i9 = i20;
                                    i10 = i21;
                                }
                            } else {
                                int i23 = i18;
                                i = i15;
                                i2 = i23;
                            }
                            if (str10.matches(C0082.m325(f86short, 531, 38, 1018))) {
                                int i24 = i19;
                                i3 = i2;
                                i4 = i24;
                                if (i4 < 10) {
                                    arrayList3.add(str10);
                                    int i25 = i4 + 1;
                                    i15 = i;
                                    i11 = 10;
                                    i8 = i25;
                                    i7 = i3;
                                    i9 = i20;
                                    i10 = i21;
                                }
                            } else {
                                int i26 = i19;
                                i3 = i2;
                                i4 = i26;
                            }
                            if (!str10.contains(C0135.m539(f86short, 569, 10, 545)) || str10.contains(C0043.m169(f86short, 579, 13, 357))) {
                                int i27 = i20;
                                i5 = i4;
                                i6 = i27;
                                if (i6 < 10) {
                                    arrayList3.add(str10);
                                    int i28 = i6 + 1;
                                    i15 = i;
                                    i7 = i3;
                                    strM554 = strM554;
                                    strTrim4 = strTrim4;
                                    i8 = i5;
                                    i9 = i28;
                                    i10 = i21;
                                    i11 = 10;
                                }
                            } else {
                                int i29 = i20;
                                i5 = i4;
                                i6 = i29;
                            }
                            lowerCase = str10.toLowerCase();
                            i12 = i6;
                            if (!lowerCase.contains(C0019.m75(f86short, 592, 10, 2365)) || lowerCase.contains(C0087.m346(f86short, 602, 9, 1366)) || lowerCase.contains(C0101.m402(f86short, 611, 15, 2083)) || lowerCase.contains(C0079.m314(f86short, 626, 10, 3249)) || lowerCase.contains(C0006.m21(f86short, 636, 10, 1747)) || lowerCase.contains(C0135.m539(f86short, 646, 10, 2456)) || lowerCase.contains(C0008.m31(f86short, 656, 10, 2426))) {
                                i13 = i21;
                                i11 = 10;
                                if (i13 < 10) {
                                    arrayList3.add(str10);
                                    i21 = i13 + 1;
                                    i15 = i;
                                    i7 = i3;
                                    strM554 = strM554;
                                    i8 = i5;
                                    i9 = i12;
                                    i10 = i21;
                                }
                            } else {
                                i13 = i21;
                                i11 = 10;
                            }
                            i7 = i3;
                            strTrim4 = strTrim4;
                            i9 = i12;
                            int i30 = i;
                            strM554 = strM554;
                            i8 = i5;
                            i10 = i13;
                            i15 = i30;
                        }
                    } else {
                        if (str10.contains(C0030.m116(f86short, 430, 21, 2554))) {
                            i11 = 10;
                            if (i17 < 10) {
                                arrayList3.add(str10);
                                i17++;
                            }
                        }
                        if (str10.matches(C0116.m463(f86short, 451, 80, 1921))) {
                            i11 = 10;
                            int i210 = i18;
                            i = i15;
                            i2 = i210;
                            if (i2 < 10) {
                                arrayList3.add(str10);
                                i7 = i2 + 1;
                                i15 = i;
                                i8 = i19;
                                i9 = i20;
                                i10 = i21;
                            }
                        } else {
                            int i211 = i18;
                            i = i15;
                            i2 = i211;
                        }
                        if (str10.matches(C0082.m325(f86short, 531, 38, 1018))) {
                            int i212 = i19;
                            i3 = i2;
                            i4 = i212;
                            if (i4 < 10) {
                                arrayList3.add(str10);
                                int i213 = i4 + 1;
                                i15 = i;
                                i11 = 10;
                                i8 = i213;
                                i7 = i3;
                                i9 = i20;
                                i10 = i21;
                            }
                        } else {
                            int i214 = i19;
                            i3 = i2;
                            i4 = i214;
                        }
                        if (str10.contains(C0135.m539(f86short, 569, 10, 545))) {
                            int i215 = i20;
                            i5 = i4;
                            i6 = i215;
                            if (i6 < 10) {
                                arrayList3.add(str10);
                                int i216 = i6 + 1;
                                i15 = i;
                                i7 = i3;
                                strM554 = strM554;
                                strTrim4 = strTrim4;
                                i8 = i5;
                                i9 = i216;
                                i10 = i21;
                                i11 = 10;
                            } else {
                                lowerCase = str10.toLowerCase();
                                i12 = i6;
                                if (lowerCase.contains(C0019.m75(f86short, 592, 10, 2365))) {
                                    i13 = i21;
                                    i11 = 10;
                                    if (i13 < 10) {
                                        arrayList3.add(str10);
                                        i21 = i13 + 1;
                                        i15 = i;
                                        i7 = i3;
                                        strM554 = strM554;
                                        i8 = i5;
                                        i9 = i12;
                                        i10 = i21;
                                    }
                                } else {
                                    i13 = i21;
                                    i11 = 10;
                                    if (i13 < 10) {
                                        arrayList3.add(str10);
                                        i21 = i13 + 1;
                                        i15 = i;
                                        i7 = i3;
                                        strM554 = strM554;
                                        i8 = i5;
                                        i9 = i12;
                                        i10 = i21;
                                    }
                                }
                                i7 = i3;
                                strTrim4 = strTrim4;
                                i9 = i12;
                                int i31 = i;
                                strM554 = strM554;
                                i8 = i5;
                                i10 = i13;
                                i15 = i31;
                            }
                        } else {
                            int i217 = i20;
                            i5 = i4;
                            i6 = i217;
                            if (i6 < 10) {
                                arrayList3.add(str10);
                                int i218 = i6 + 1;
                                i15 = i;
                                i7 = i3;
                                strM554 = strM554;
                                strTrim4 = strTrim4;
                                i8 = i5;
                                i9 = i218;
                                i10 = i21;
                                i11 = 10;
                            } else {
                                lowerCase = str10.toLowerCase();
                                i12 = i6;
                                if (lowerCase.contains(C0019.m75(f86short, 592, 10, 2365))) {
                                    i13 = i21;
                                    i11 = 10;
                                    if (i13 < 10) {
                                        arrayList3.add(str10);
                                        i21 = i13 + 1;
                                        i15 = i;
                                        i7 = i3;
                                        strM554 = strM554;
                                        i8 = i5;
                                        i9 = i12;
                                        i10 = i21;
                                    }
                                } else {
                                    i13 = i21;
                                    i11 = 10;
                                    if (i13 < 10) {
                                        arrayList3.add(str10);
                                        i21 = i13 + 1;
                                        i15 = i;
                                        i7 = i3;
                                        strM554 = strM554;
                                        i8 = i5;
                                        i9 = i12;
                                        i10 = i21;
                                    }
                                }
                                i7 = i3;
                                strTrim4 = strTrim4;
                                i9 = i12;
                                int i32 = i;
                                strM554 = strM554;
                                i8 = i5;
                                i10 = i13;
                                i15 = i32;
                            }
                        }
                    }
                    i7 = i18;
                    i8 = i19;
                    i9 = i20;
                    i10 = i21;
                } else if (str10.matches(C0030.m116(f86short, 395, 35, 1227))) {
                    i11 = 10;
                    if (i16 < 10) {
                        arrayList3.add(str10);
                        i16++;
                    } else {
                        if (str10.contains(C0030.m116(f86short, 430, 21, 2554))) {
                            i11 = 10;
                            if (i17 < 10) {
                                arrayList3.add(str10);
                                i17++;
                            }
                        }
                        if (str10.matches(C0116.m463(f86short, 451, 80, 1921))) {
                            i11 = 10;
                            int i219 = i18;
                            i = i15;
                            i2 = i219;
                            if (i2 < 10) {
                                arrayList3.add(str10);
                                i7 = i2 + 1;
                                i15 = i;
                                i8 = i19;
                                i9 = i20;
                                i10 = i21;
                            }
                        } else {
                            int i2110 = i18;
                            i = i15;
                            i2 = i2110;
                        }
                        if (str10.matches(C0082.m325(f86short, 531, 38, 1018))) {
                            int i2111 = i19;
                            i3 = i2;
                            i4 = i2111;
                            if (i4 < 10) {
                                arrayList3.add(str10);
                                int i2112 = i4 + 1;
                                i15 = i;
                                i11 = 10;
                                i8 = i2112;
                                i7 = i3;
                                i9 = i20;
                                i10 = i21;
                            }
                        } else {
                            int i2113 = i19;
                            i3 = i2;
                            i4 = i2113;
                        }
                        if (str10.contains(C0135.m539(f86short, 569, 10, 545))) {
                            int i2114 = i20;
                            i5 = i4;
                            i6 = i2114;
                            if (i6 < 10) {
                                arrayList3.add(str10);
                                int i2115 = i6 + 1;
                                i15 = i;
                                i7 = i3;
                                strM554 = strM554;
                                strTrim4 = strTrim4;
                                i8 = i5;
                                i9 = i2115;
                                i10 = i21;
                                i11 = 10;
                            } else {
                                lowerCase = str10.toLowerCase();
                                i12 = i6;
                                if (lowerCase.contains(C0019.m75(f86short, 592, 10, 2365))) {
                                    i13 = i21;
                                    i11 = 10;
                                    if (i13 < 10) {
                                        arrayList3.add(str10);
                                        i21 = i13 + 1;
                                        i15 = i;
                                        i7 = i3;
                                        strM554 = strM554;
                                        i8 = i5;
                                        i9 = i12;
                                        i10 = i21;
                                    }
                                } else {
                                    i13 = i21;
                                    i11 = 10;
                                    if (i13 < 10) {
                                        arrayList3.add(str10);
                                        i21 = i13 + 1;
                                        i15 = i;
                                        i7 = i3;
                                        strM554 = strM554;
                                        i8 = i5;
                                        i9 = i12;
                                        i10 = i21;
                                    }
                                }
                                i7 = i3;
                                strTrim4 = strTrim4;
                                i9 = i12;
                                int i33 = i;
                                strM554 = strM554;
                                i8 = i5;
                                i10 = i13;
                                i15 = i33;
                            }
                        } else {
                            int i2116 = i20;
                            i5 = i4;
                            i6 = i2116;
                            if (i6 < 10) {
                                arrayList3.add(str10);
                                int i2117 = i6 + 1;
                                i15 = i;
                                i7 = i3;
                                strM554 = strM554;
                                strTrim4 = strTrim4;
                                i8 = i5;
                                i9 = i2117;
                                i10 = i21;
                                i11 = 10;
                            } else {
                                lowerCase = str10.toLowerCase();
                                i12 = i6;
                                if (lowerCase.contains(C0019.m75(f86short, 592, 10, 2365))) {
                                    i13 = i21;
                                    i11 = 10;
                                    if (i13 < 10) {
                                        arrayList3.add(str10);
                                        i21 = i13 + 1;
                                        i15 = i;
                                        i7 = i3;
                                        strM554 = strM554;
                                        i8 = i5;
                                        i9 = i12;
                                        i10 = i21;
                                    }
                                } else {
                                    i13 = i21;
                                    i11 = 10;
                                    if (i13 < 10) {
                                        arrayList3.add(str10);
                                        i21 = i13 + 1;
                                        i15 = i;
                                        i7 = i3;
                                        strM554 = strM554;
                                        i8 = i5;
                                        i9 = i12;
                                        i10 = i21;
                                    }
                                }
                                i7 = i3;
                                strTrim4 = strTrim4;
                                i9 = i12;
                                int i34 = i;
                                strM554 = strM554;
                                i8 = i5;
                                i10 = i13;
                                i15 = i34;
                            }
                        }
                    }
                    i7 = i18;
                    i8 = i19;
                    i9 = i20;
                    i10 = i21;
                } else {
                    if (str10.contains(C0030.m116(f86short, 430, 21, 2554))) {
                        i11 = 10;
                        if (i17 < 10) {
                            arrayList3.add(str10);
                            i17++;
                            i7 = i18;
                            i8 = i19;
                            i9 = i20;
                            i10 = i21;
                        }
                    }
                    if (str10.matches(C0116.m463(f86short, 451, 80, 1921))) {
                        i11 = 10;
                        int i2118 = i18;
                        i = i15;
                        i2 = i2118;
                        if (i2 < 10) {
                            arrayList3.add(str10);
                            i7 = i2 + 1;
                            i15 = i;
                            i8 = i19;
                            i9 = i20;
                            i10 = i21;
                        }
                    } else {
                        int i2119 = i18;
                        i = i15;
                        i2 = i2119;
                    }
                    if (str10.matches(C0082.m325(f86short, 531, 38, 1018))) {
                        int i21110 = i19;
                        i3 = i2;
                        i4 = i21110;
                        if (i4 < 10) {
                            arrayList3.add(str10);
                            int i21111 = i4 + 1;
                            i15 = i;
                            i11 = 10;
                            i8 = i21111;
                            i7 = i3;
                            i9 = i20;
                            i10 = i21;
                        }
                    } else {
                        int i21112 = i19;
                        i3 = i2;
                        i4 = i21112;
                    }
                    if (str10.contains(C0135.m539(f86short, 569, 10, 545))) {
                        int i21113 = i20;
                        i5 = i4;
                        i6 = i21113;
                        if (i6 < 10) {
                            arrayList3.add(str10);
                            int i21114 = i6 + 1;
                            i15 = i;
                            i7 = i3;
                            strM554 = strM554;
                            strTrim4 = strTrim4;
                            i8 = i5;
                            i9 = i21114;
                            i10 = i21;
                            i11 = 10;
                        } else {
                            lowerCase = str10.toLowerCase();
                            i12 = i6;
                            if (lowerCase.contains(C0019.m75(f86short, 592, 10, 2365))) {
                                i13 = i21;
                                i11 = 10;
                                if (i13 < 10) {
                                    arrayList3.add(str10);
                                    i21 = i13 + 1;
                                    i15 = i;
                                    i7 = i3;
                                    strM554 = strM554;
                                    i8 = i5;
                                    i9 = i12;
                                    i10 = i21;
                                }
                            } else {
                                i13 = i21;
                                i11 = 10;
                                if (i13 < 10) {
                                    arrayList3.add(str10);
                                    i21 = i13 + 1;
                                    i15 = i;
                                    i7 = i3;
                                    strM554 = strM554;
                                    i8 = i5;
                                    i9 = i12;
                                    i10 = i21;
                                }
                            }
                            i7 = i3;
                            strTrim4 = strTrim4;
                            i9 = i12;
                            int i35 = i;
                            strM554 = strM554;
                            i8 = i5;
                            i10 = i13;
                            i15 = i35;
                        }
                    } else {
                        int i21115 = i20;
                        i5 = i4;
                        i6 = i21115;
                        if (i6 < 10) {
                            arrayList3.add(str10);
                            int i21116 = i6 + 1;
                            i15 = i;
                            i7 = i3;
                            strM554 = strM554;
                            strTrim4 = strTrim4;
                            i8 = i5;
                            i9 = i21116;
                            i10 = i21;
                            i11 = 10;
                        } else {
                            lowerCase = str10.toLowerCase();
                            i12 = i6;
                            if (lowerCase.contains(C0019.m75(f86short, 592, 10, 2365))) {
                                i13 = i21;
                                i11 = 10;
                                if (i13 < 10) {
                                    arrayList3.add(str10);
                                    i21 = i13 + 1;
                                    i15 = i;
                                    i7 = i3;
                                    strM554 = strM554;
                                    i8 = i5;
                                    i9 = i12;
                                    i10 = i21;
                                }
                            } else {
                                i13 = i21;
                                i11 = 10;
                                if (i13 < 10) {
                                    arrayList3.add(str10);
                                    i21 = i13 + 1;
                                    i15 = i;
                                    i7 = i3;
                                    strM554 = strM554;
                                    i8 = i5;
                                    i9 = i12;
                                    i10 = i21;
                                }
                            }
                            i7 = i3;
                            strTrim4 = strTrim4;
                            i9 = i12;
                            int i36 = i;
                            strM554 = strM554;
                            i8 = i5;
                            i10 = i13;
                            i15 = i36;
                        }
                    }
                }
                if (i15 >= i11 && i16 >= i11 && i17 >= i11 && i7 >= i11 && i8 >= i11 && i9 >= i11 && i10 >= i11) {
                    break;
                }
                i21 = i10;
                it5 = it6;
                strTrim3 = strTrim3;
                i20 = i9;
                strTrim4 = strTrim4;
                i19 = i8;
                strM554 = strM554;
                i18 = i7;
            }
        }
        String strM428 = C0107.m427(f86short, 666, 3, 3049);
        TextUtils.join(strM428, arrayList);
        TextUtils.join(strM428, arrayList2);
        if (arrayList3.isEmpty()) {
            strC = "";
            strC2 = strC;
        } else {
            strC = b(arrayList3);
            strC2 = a(arrayList3);
        }
        com.github.catvod.spider.merge.p001b.k kVar2 = new com.github.catvod.spider.merge.p001b.k();
        kVar2.n(list.get(0));
        kVar2.o(strTrim);
        kVar2.p(strC3);
        kVar2.m(strTrim2);
        kVar2.j(strTrim3);
        kVar2.i(strTrim4);
        kVar2.u(str2);
        kVar2.k(str3);
        kVar2.l(str);
        com.github.catvod.spider.merge.h0.d<k> dVarQ2 = gVarL.Q(C0056.m223(f86short, 669, 16, 1791));
        if (dVarQ2.isEmpty()) {
            str4 = "";
            str5 = str4;
        } else {
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            HashSet hashSet2 = new HashSet();
            for (k kVar3 : dVarQ2) {
                String str11 = strM554;
                Matcher matcher2 = Pattern.compile(C0018.m70(f86short, 685, 13, 3104)).matcher(kVar3.c(str11));
                if (matcher2.find()) {
                    String strGroup2 = matcher2.group(1);
                    if (!hashSet2.contains(strGroup2)) {
                        hashSet2.add(strGroup2);
                        String strTrim6 = kVar3.T().trim();
                        if (strTrim6.length() > 40) {
                            strTrim6 = strTrim6.substring(0, 40) + C0079.m314(f86short, 698, 3, 1700);
                        }
                        arrayList6.add(strGroup2);
                        if (TextUtils.isEmpty(strTrim6)) {
                            strTrim6 = C0093.m368(f86short, 701, 3, 1039) + arrayList6.size();
                        }
                        arrayList7.add(strTrim6);
                        if (arrayList6.size() >= 15) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                strM554 = str11;
            }
            int iM = AbstractC0302v0.m(strTrim, arrayList7);
            if (iM >= 0) {
                S0 s0G = AbstractC0302v0.G(strTrim, Collections.singletonList(new T0((String) arrayList7.get(iM), p((String) arrayList6.get(iM)))));
                str5 = s0G.b;
                str4 = s0G.c;
            } else {
                str4 = "";
                str5 = str4;
            }
        }
        if (!str5.isEmpty()) {
            if (strC2.isEmpty()) {
                strC = str4;
                strC2 = str5;
            } else {
                strC2 = com.github.catvod.spider.merge.D.b.C(strC2, strM428, str5);
                strC = com.github.catvod.spider.merge.D.b.C(strC, strM428, str4);
            }
        }
        kVar2.q(strC2);
        kVar2.r(strC);
        AbstractC0280n1.p(strTrim);
        AbstractC0280n1.q(strC);
        boolean z = FishCrypto.a;
        N1.d(kVar2);
        return com.github.catvod.spider.merge.p001b.g.s(kVar2);
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        final int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        if (this.t == null) {
            this.t = new K1(this.u);
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -578299085:
                if (str.equals(C0091.m360(f86short, 745, 14, 1868))) {
                    b = 0;
                }
                break;
            case -148630477:
                if (str.equals(C0074.m292(f86short, 732, 13, 2011))) {
                    b = 1;
                }
                break;
            case -146232780:
                if (str.equals(C0055.m219(f86short, 719, 13, 2584))) {
                    b = 2;
                }
                break;
            case 1778909287:
                if (str.equals(C0093.m368(f86short, 704, 15, 1777))) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
                InitOrigin.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.u.Q
                    public final /* synthetic */ SeedHub b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                K1 k1 = this.b.t;
                                InitOrigin.run(new R0(k1, k1.a.isFolderMode(), 1));
                                break;
                            case 1:
                                this.b.t.o();
                                break;
                            default:
                                this.b.t.p();
                                break;
                        }
                    }
                });
                break;
            case 1:
                InitOrigin.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.u.Q
                    public final /* synthetic */ SeedHub b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                K1 k1 = this.b.t;
                                InitOrigin.run(new R0(k1, k1.a.isFolderMode(), 1));
                                break;
                            case 1:
                                this.b.t.o();
                                break;
                            default:
                                this.b.t.p();
                                break;
                        }
                    }
                });
                break;
            case 2:
                this.r.s();
                InitOrigin.run(new A(13));
                break;
            case 3:
                InitOrigin.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.u.Q
                    public final /* synthetic */ SeedHub b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                K1 k1 = this.b.t;
                                InitOrigin.run(new R0(k1, k1.a.isFolderMode(), 1));
                                break;
                            case 1:
                                this.b.t.o();
                                break;
                            default:
                                this.b.t.p();
                                break;
                        }
                    }
                });
                break;
        }
        return "";
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        boolean zEquals = C0044.m175(f86short, 759, 15, 1857).equals(str);
        com.github.catvod.spider.merge.p020x.b bVar = this.r;
        String strM292 = C0074.m292(f86short, 774, 1, 2068);
        if (zEquals) {
            if (!strM292.equals(str2)) {
                return com.github.catvod.spider.merge.D.b.d();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.github.catvod.spider.merge.p001b.k(C0021.m83(f86short, 805, 15, 832), C0125.m499(f86short, 786, 4, 3014), AbstractC0302v0.I(), bVar.o ? C0114.m454(f86short, 775, 7, 3025) : C0049.m193(f86short, 782, 4, 3050), C0116.m463(f86short, 790, 15, 1288)));
            String strS = AbstractC0302v0.S();
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.f.size());
            sb.append(C0120.m477(f86short, 820, 1, 682));
            arrayList.add(new com.github.catvod.spider.merge.p001b.k(C0093.m368(f86short, 840, 14, 3135), C0120.m477(f86short, 822, 4, 2664), strS, com.github.catvod.spider.merge.D.b.l(sb, com.github.catvod.spider.merge.p020x.c.c.length, C0125.m499(f86short, 821, 1, 1625)), C0070.m277(f86short, 826, 14, 2705)));
            arrayList.add(new com.github.catvod.spider.merge.p001b.k(C0126.m503(f86short, 871, 13, 653), C0098.m390(f86short, 854, 4, 1867), AbstractC0302v0.H1(), bVar.k(), C0053.m210(f86short, 858, 13, 3177)));
            arrayList.add(new com.github.catvod.spider.merge.p001b.k(C0059.m234(f86short, 897, 13, 1847), C0070.m277(f86short, 910, 4, 591), AbstractC0302v0.v1(), "", C0018.m70(f86short, 884, 13, 2920)));
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        }
        if (!str.startsWith(C0006.m21(f86short, 914, 16, 1472))) {
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sbQ = com.github.catvod.spider.merge.D.b.q(C0021.m83(f86short, 932, 12, 363), str, C0027.m105(f86short, 944, 8, 2247));
            sbQ.append(str2.equals(strM292) ? "" : C0045.m177(f86short, 952, 6, 2862).concat(str2));
            com.github.catvod.spider.merge.f0.g gVarL = X1.L(this.s.a(sbQ.toString(), j()), "");
            arrayList2.addAll(n(gVarL));
            int i = Integer.parseInt(str2);
            int i2 = i * 20;
            if (gVarL.R(C0109.m432(f86short, 958, 15, 1490)) != null) {
                i2 = (i + 1) * 20;
            }
            return AbstractC0449a.c(i, i + 1, 20, i2, arrayList2);
        }
        if (!strM292.equals(str2)) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        ArrayList arrayList3 = new ArrayList();
        List list = (List) v.get(str);
        if (list != null) {
            String[] strArrSplit = str.split(C0056.m223(f86short, 930, 2, 2450));
            String str3 = strArrSplit.length > 2 ? strArrSplit[2] : "";
            bVar.getClass();
            String strL = com.github.catvod.spider.merge.p020x.b.l(str3);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(l.f(str3, strL, "", (JSONObject) it.next()));
            }
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList3);
    }

    public static void h(LinkedHashMap linkedHashMap, HashSet hashSet, String str, String str2, String str3, SeedHubItem seedHubItem) {
        List list = (List) linkedHashMap.get(str);
        if (list == null || list.size() >= 60 || TextUtils.isEmpty(str2)) {
            return;
        }
        if (hashSet.add(str + C0090.m358(f86short, 988, 1, 1795) + str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0106.m422(f86short, 989, 3, 2002), str2);
                jSONObject.put(C0128.m511(f86short, 992, 4, 933), str3);
                String strM219 = C0055.m219(f86short, 996, 8, 2510);
                String str4 = seedHubItem.d;
                String str5 = seedHubItem.c;
                jSONObject.put(strM219, str4);
                jSONObject.put(C0104.m414(f86short, 1004, 6, 2195), seedHubItem.b);
                if (!TextUtils.isEmpty(str5)) {
                    jSONObject.put(C0045.m177(f86short, 1010, 6, 2225), new JSONArray().put(str5));
                }
                list.add(jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public static String i(String str, String str2) {
        String str3 = str2;
        String strReplaceAll = str == null ? "" : str.replace('\n', ' ').replace('\r', ' ').trim().replaceAll(C0059.m234(f86short, 1016, 3, 2713), C0128.m511(f86short, 1019, 1, 379));
        if (!TextUtils.isEmpty(strReplaceAll)) {
            str3 = strReplaceAll;
        }
        if (str3.length() <= 150) {
            return str3;
        }
        return str3.substring(0, 147) + C0130.m516(f86short, 1020, 3, 3271);
    }

    public static boolean k(LinkedHashMap linkedHashMap) {
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            if (((List) it.next()).size() < 60) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList m(com.github.catvod.spider.merge.f0.g gVar) {
        k kVarR;
        k kVarR2;
        k kVarR3;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (k kVar : gVar.Q(C0008.m31(f86short, 1023, 21, 551))) {
            try {
                String strC = kVar.c(C0098.m390(f86short, 1044, 4, 1174));
                String strReplaceAll = strC.replaceAll(C0076.m301(f86short, 1048, 18, 2610), C0021.m83(f86short, 1066, 2, 1691));
                if (!strReplaceAll.equals(strC) && !hashSet.contains(strReplaceAll) && (kVarR = kVar.R(C0101.m402(f86short, 1068, 3, 1063))) != null) {
                    String strTrim = kVarR.c(C0117.m467(f86short, 1071, 3, 630)).trim();
                    String strGroup = "";
                    if (strTrim.isEmpty() && (kVarR3 = kVar.R(C0073.m288(f86short, 1074, 2, 2745))) != null) {
                        strTrim = kVarR3.T().replace(C0125.m499(f86short, 1076, 1, 2454), "").trim();
                    }
                    if (!strTrim.isEmpty()) {
                        String strC2 = kVarR.c(C0011.m42(f86short, 1077, 3, 3244));
                        if (strC2.isEmpty()) {
                            strC2 = kVarR.c(C0046.m182(f86short, 1080, 8, 1302));
                        }
                        k kVar2 = (k) kVar.a;
                        if (kVar2 != null && (kVarR2 = kVar2.R(C0045.m177(f86short, 1088, 2, 2724))) != null) {
                            Matcher matcher = Pattern.compile(C0091.m360(f86short, 1090, 7, 2612)).matcher(kVarR2.T());
                            if (matcher.find()) {
                                strGroup = matcher.group(1);
                            }
                        }
                        hashSet.add(strReplaceAll);
                        arrayList.add(new SeedHubItem(strReplaceAll, strTrim, strC2, strGroup));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static ArrayList n(com.github.catvod.spider.merge.f0.g gVar) {
        ArrayList arrayList = new ArrayList();
        for (SeedHubItem seedHubItem : m(gVar)) {
            arrayList.add(new com.github.catvod.spider.merge.p001b.k(seedHubItem.a, seedHubItem.b, seedHubItem.c, seedHubItem.d));
        }
        return arrayList;
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0056.m223(f86short, 1097, 6, 2798));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0053.m210(f86short, 1103, 15, 2605));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0142.m567(f86short, 1118, 13, 2969));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0092.m365(f86short, 1131, 11, 1535));
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
        String strM454 = C0114.m454(f86short, 1142, 4, 1492);
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strM454);
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strTrim = jSONArrayOptJSONArray.optString(i, "").trim();
                    if (!strTrim.isEmpty()) {
                        arrayList.add(strTrim);
                    }
                }
            } else {
                String strTrim2 = jSONObject.optString(strM454, "").trim();
                if (!strTrim2.isEmpty()) {
                    arrayList.add(strTrim2);
                }
            }
        } catch (Exception unused) {
        }
        if (arrayList.isEmpty()) {
            arrayList.add(C0125.m499(f86short, 1146, 22, 2274));
        }
        this.s = AbstractC0260h.b(C0070.m277(f86short, 1168, 16, 3111), arrayList, false);
        this.r.o();
        this.t = new K1(this.u);
    }

    public final HashMap j() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(C0114.m454(f86short, 1184, 10, 496), C0003.m10(f86short, 1194, 111, 956));
        mapS.put(C0112.m445(f86short, 1306, 7, 2295), this.s.b() + C0001.m1(f86short, 1305, 1, 599));
        return mapS;
    }

    public final String l(String str, String str2, String[] strArr) throws Throwable {
        String strJ1;
        String strL;
        if (TextUtils.isEmpty(str2)) {
            return com.github.catvod.spider.merge.p001b.g.d(C0010.m36(f86short, 1313, 7, 1200));
        }
        String strL2 = l.l(strArr, 1);
        if (TextUtils.isEmpty(strL2)) {
            strL2 = C0026.m102(f86short, 1320, 9, 519);
        }
        boolean zJ0 = AbstractC0302v0.j0();
        boolean zC1 = AbstractC0302v0.C1();
        if (!zJ0 && AbstractC0302v0.Y()) {
            AbstractC0302v0.D1();
        }
        if (zJ0) {
            strJ1 = AbstractC0302v0.j1(strL2, str2);
        } else {
            strJ1 = zC1 ? str2 : "";
        }
        if (zJ0) {
            strL = AbstractC0302v0.h1(str2);
        } else if (zC1) {
            this.r.getClass();
            strL = com.github.catvod.spider.merge.p020x.b.l(C0139.m554(f86short, 1329, 6, 999));
        } else {
            strL = "";
        }
        com.github.catvod.spider.merge.p001b.k kVar = new com.github.catvod.spider.merge.p001b.k();
        kVar.n(str);
        kVar.o(strL2);
        kVar.q(strL);
        kVar.r(strJ1);
        l.b(kVar, strArr, "");
        AbstractC0280n1.p(strL2);
        AbstractC0280n1.q(strJ1);
        boolean z = FishCrypto.a;
        N1.d(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    public final String o(String str) {
        String strReplace = str;
        if (TextUtils.isEmpty(strReplace)) {
            return "";
        }
        if (strReplace.startsWith(C0021.m83(f86short, 1335, 4, 2381))) {
            strReplace = strReplace.replace(this.s.b(), "");
        }
        Matcher matcher = Pattern.compile(C0070.m277(f86short, 1339, 27, 809)).matcher(this.s.a(strReplace, j()));
        return matcher.find() ? matcher.group(1) : "";
    }

    public final String p(String str) {
        String strA = this.s.a(com.github.catvod.spider.merge.D.b.j(C0027.m105(f86short, 1366, 21, 3001), str, C0073.m288(f86short, 1387, 19, 2302)), j());
        String[] strArr = {C0050.m199(f86short, 1439, 47, 774), C0120.m477(f86short, 1486, 36, 2148), C0105.m416(f86short, 1406, 33, 2983)};
        for (int i = 0; i < 3; i++) {
            Matcher matcher = Pattern.compile(strArr[i]).matcher(strA);
            if (matcher.find()) {
                try {
                    String strTrim = new String(Base64.decode(matcher.group(1), 0)).trim();
                    if (strTrim.startsWith(C0043.m169(f86short, 1522, 7, 1132))) {
                        return strTrim;
                    }
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        Matcher matcher2 = Pattern.compile(C0011.m42(f86short, 1529, 28, 475)).matcher(strA);
        if (matcher2.find()) {
            return matcher2.group(1);
        }
        Matcher matcher3 = Pattern.compile(C0011.m42(f86short, 1557, 28, 2266)).matcher(strA);
        return matcher3.find() ? matcher3.group(1) : "";
    }

    @Override // com.github.catvod.spider.Cloud
    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0096.m382(f86short, 1585, 13, 2517));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0047.m186(f86short, 1598, 13, 2513));
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

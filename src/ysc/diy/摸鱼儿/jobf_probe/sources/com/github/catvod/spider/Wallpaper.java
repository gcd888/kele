package com.github.catvod.spider;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
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
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0089;
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
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.A;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.RunnableC0466s;
import com.github.catvod.spider.merge.p017u.T;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Wallpaper extends Spider {
    public static long f;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f103short = {1492, 2457, 2454, 2458, 2450, 2422, 2427, 607, 585, 589, 606, 591, 580, 28743, -25835, 24192, 21089, 3102, 3097, 3086, 3095, 3082, 3089, 3084, 3101, 3083, 24670, 29899, 26489, -30848, 1336, 1323, 1316, 1326, 1317, 1319, 1301, 1314, 1315, 1337, 1342, 1317, 1336, 1331, -25246, 27863, 22635, 22559, 1824, 1852, 1852, 1848, 1906, 1895, 1895, 1913, 1914, 1919, 1894, 1912, 1894, 1912, 1894, 1913, 1906, 1917, 1914, 1918, 1918, 1895, 1855, 1833, 1828, 1828, 1848, 1833, 1848, 1837, 1850, 1895, 1835, 1833, 1852, 1837, 1839, 1831, 1850, 1825, 1837, 1851, 21729, 29336, 27437, 24193, 26435, 23304, 24038, 21799, 3290, 3286, 3296, 3309, 3309, 3313, 3296, 3313, 3300, 3315, 3292, 3233, 24105, 27776, 24199, 28922, 24097, -31748, 21936, -32348, 3259, 3233, 2438, 2437, 2437, 2436, 32350, -27927, 792, 788, -26420, 27665, 23253, 31916, 2791, 2804, 2797, 2797, 2802, 2786, 2803, 2788, 2788, 2799, 23841, -25813, 20486, 1572, 1661, 816, 841, 23491, 32186, 902, 907, 900, 910, 921, 905, 907, 922, 911, 949, 987, 897, 967, 957, 27100, 24505, 1637, 1654, 31089, -29355, 21637, 29436, 2112, 2131, 2159, 2050, 2139, 1276, 1157, 28388, 22657, 944, 931, 927, 1012, 939, 3175, 3096, 26233, 20508, 2597, 2614, 2570, 2656, 2622, 656, 750, 26767, 24298, 3174, 3189, 3145, 3118, 3197, 1245, 1198, 28367, 22698, 874, 865, 872, 893, -30262, 20649, -30388, 28655, 2124, 2137, 2138, 2132, 2141, 2124, 21840, 27740, 21474, 30107, 1382, 1395, 1397, 28267, 32018, 1248, 1260, 1242, 1239, 1239, 1227, 1242, 1227, 1246, 1225, 1254, 1179, 1227, 1242, 1225, 1224, 1246, 1266, 1237, 1231, 1179, 1246, 1225, 1225, 1236, 1225, 1153, 1179, 833, 861, 861, 857, 787, 774, 774, 792, 795, 798, 775, 793, 775, 793, 775, 792, 787, 796, 795, 799, 799, 774, 862, 840, 837, 837, 857, 840, 857, 844, 859, 774, 858, 844, 840, 859, 842, 833, 790, 834, 844, 848, 862, 838, 859, 845, 788, 2096, 2097, 2083, 2120, 2141, 537, 591, 606, 600, 602, 514, 2956, 3034, 3019, 3021, 3023, 3061, 3033, 3011, 3024, 3023, 2967, 2969, 2970, 1568, 1590, 1586, 1569, 1584, 1595, 1548, 1569, 1590, 1568, 1574, 1599, 1575, 1436, 1468, 23263, 31910, 2925, 2939, 2922, 2922, 2935, 2928, 2937, 2925, 834, 845, 836, 832, 851, 2243, 2252, 2245, 2241, 2258, 2303, 2260, 2262, 877, 866, 875, 879, 892, 849, 867, 865, 876, 871, 866, 875, 1023, 1011, 1020, 1011, 1013, 1015, 973, 1012, 1011, 996, 1021, 992, 1019, 998, 1015, 993, 2757, 2762, 2755, 2759, 2772, 2809, 2766, 2767, 2773, 2770, 2761, 2772, 2783, 3097, 3099, 3084, 3103, 3072, 3084, 3102, 3155, 1025, 1057, 23574, 31343, 27771, 31924, 20762, -29516, 28827, 806, 828, 571, 611, 571, 2960, 31523, 23137, 28471, 28324, -27874, -32174, 21181, 23908, 2107, -28077, -31969, 28462, 32704, 20972, 24117, 2287, 2635, 2633, 2654, 2637, 2642, 2654, 2636, 2561, 531, 543, 553, 548, 548, 568, 553, 568, 557, 570, 533, 616, 568, 553, 570, 571, 557, 513, 550, 572, 616, 557, 570, 570, 551, 570, 626, 616, 968, 990, 975, 975, 978, 981, 988, 968, 2859, 2852, 2861, 2857, 2874, 2839, 2876, 2878, 1005, 994, 1003, 1007, 1020, 1298, 1309, 1300, 1296, 1283, 1326, 1308, 1310, 1299, 1304, 1309, 1300, 2492, 2480, 2495, 2480, 2486, 2484, 2446, 2487, 2480, 2471, 2494, 2467, 2488, 2469, 2484, 2466, 1767, 1768, 1761, 1765, 1782, 1755, 1772, 1773, 1783, 1776, 1771, 1782, 1789, 22892, 27291, -27910, 28340, 22737, 23647, 31270, 20964, 25107, -25998, 21719, 29358, 23288, 26895, -28306, 32220, 23365, 24523, 31154, 2991, 2988, 2988, 2989, 2903, 2884, 3076, 2586, 2589, 2570, 2579, 2574, 2581, 2568, 2585, 2575, 2456, 22168, 2911, 2909, 2890, 2905, 2886, 2890, 2904, 2837, 21237, 29836, 2427, 2422, 2426, 2420, 2427, 2407, 2024, 2038, 2043, 2027, 2039, 1630, 1603, 1630, 1606, 1615, 2290, 2286, 2291, 2283, 2276, 2259, 2292, 2282, 1761, 1772, 1791, 1770, 1768, 1752, 1791, 1761, 412, 2240, 2247, 2256, 2249, 2260, 2255, 2258, 2243, 2261, 2297, 872, 879, 888, 865, 892, 871, 890, 875, 893, 882, 454, 499, 511, 457, 452, 452, 472, 457, 472, 461, 474, 501, 392, 452, 455, 457, 460, 494, 457, 478, 455, 474, 449, 476, 461, 475, 392, 461, 474, 474, 455, 474, 402, 392, 31059, 30452, 26564, -30915, 920, 900, 900, 896, 899, 970, 991, 991, 900, 915, 989, 926, 917, 903, 990, 906, 990, 903, 921, 923, 921, 991, 913, 901, 900, 927, 901, 896, 924, 927, 913, 916, 991, 921, 937, 952, 932, 935, 934, 904, 966, 932, 968, 930, 898, 947, 925, 897, 916, 951, 948, 966, 957, 959, 916, 921, 959, 943, 959, 905, 902, 936, 967, 925, 953, 919, 904, 950, 946, 918, 948, 957, 948, 949, 898, 899, 991, 962, 960, 962, 966, 991, 918, 921, 899, 920, 964, 923, 990, 922, 896, 917, 919, 2440, 2436, 2443, 2436, 2434, 2432, 2490, 2435, 2436, 2451, 2442, 2455, 2444, 2449, 2432, 2454, 2490, 2439, 2449, 2443, 579, 591, 576, 591, 585, 587, 625, 584, 591, 600, 577, 604, 583, 602, 587, 605, 972, 991, 976, 986, 977, 979, 993, 982, 983, 973, 970, 977, 972, 967, 684, 703, 688, 698, 689, 691, 641, 694, 695, 685, 682, 689, 684, 679, 752, 692, 685, 689, 688, 1635, 1653, 1656, 1656, 1636, 1653, 1636, 1649, 1638, 1611, 1638, 1653, 1658, 1648, 1659, 1657, 1611, 1660, 1661, 1639, 1632, 1659, 1638, 1645, 2405, 2424, 2403, 2415, 2404, 2430, 2411, 2430, 2403, 2405, 2404, 391, 410, 414, 406, 609, 608, 634, 637, 614, 635, 624, 598, 2001, 2013, 2027, 2022, 2022, 2042, 2027, 2042, 2031, 2040, 2007, 1962, 2022, 2021, 2027, 2030, 1986, 2019, 2041, 2046, 2021, 2040, 2035, 1962, 2031, 2040, 2040, 2021, 2040, 1968, 1962, 3089, 3102, 3095, 3091, 3072, 3117, 3098, 3099, 3073, 3078, 3101, 3072, 3083, 1874, 1885, 1876, 1872, 1859, 1902, 1881, 1880, 1858, 1861, 1886, 1859, 1864, 26689, 31806, -28469, 24958, 21954, 21942, 2530, 2558, 2558, 2554, 2553, 2480, 2469, 2469, 2558, 2537, 2471, 2532, 2543, 2557, 2468, 2544, 2468, 2557, 2531, 2529, 2531, 2469, 2539, 2559, 2558, 2533, 2559, 2554, 2534, 2533, 2539, 2542, 2469, 2531, 2515, 2498, 2526, 2525, 2524, 2546, 2492, 2526, 2482, 
    2520, 2552, 2505, 2535, 2555, 2542, 2509, 2510, 2492, 2503, 2501, 2542, 2531, 2501, 2517, 2501, 2547, 2556, 2514, 2493, 2535, 2499, 2541, 2546, 2508, 2504, 2540, 2510, 2503, 2510, 2511, 2552, 2553, 2469, 2488, 2490, 2488, 2492, 2469, 2540, 2531, 2553, 2530, 2494, 2529, 2468, 2528, 2554, 2543, 2541, 990, 968, 972, 991, 974, 965, 1427, 1477, 1492, 1490, 1488, 1514, 1478, 1500, 1487, 1488, 1416, 1414, 1413, 1179, 1166, 1160, 1485, 1489, 1489, 1493, 1439, 1418, 1418, 1428, 1431, 1426, 1419, 1429, 1419, 1429, 1419, 1428, 1439, 1424, 1431, 1427, 1427, 1418, 1490, 1476, 1481, 1481, 1493, 1476, 1493, 1472, 1495, 1418, 1489, 1476, 1474, 1434, 1489, 1476, 1474, 1432, 3297, 3296, 3314, 3225, 3212, 392, 478, 463, 457, 459, 403, 1014, 1011, 998, 1011, 961, 1021, 999, 992, 1009, 1015, 3174, 3189, 3141, 3189, 3172, 3187, 3187, 3192, 1911, 1915, 1913, 1913, 1915, 1914, 1880, 1917, 1895, 1888, 739, 751, 749, 749, 751, 750, 2344, 2355, 2334, 2347, 2349, 2252, 2256, 2256, 2260, 2206, 2187, 2187, 2197, 2198, 2195, 2186, 2196, 2186, 2196, 2186, 2197, 2206, 2193, 2198, 2194, 2194, 2187, 2259, 2245, 2248, 2248, 2260, 2245, 2260, 2241, 2262, 2187, 2628, 2571, 2586, 2588, 2590, 2630, 1150, 1129, 1149, 1145, 1129, 1151, 1144, 1116, 1133, 1150, 1133, 1121, 1151, 821, 1614, 485, 505, 505, 509, 439, 418, 418, 444, 447, 442, 419, 445, 419, 445, 419, 444, 439, 440, 447, 443, 443, 418, 506, 492, 481, 481, 509, 492, 509, 488, 511, 418, 494, 482, 480, 480, 482, 483, 434, 509, 492, 490, 488, 432, 3262, 3304, 3321, 3327, 3325, 3271, 3307, 3313, 3298, 3325, 3237, 3243, 3240, 3262, 3307, 3313, 3298, 3325, 3271, 3308, 3297, 3304, 3325, 3237, 3240, 2244, 2264, 2264, 2268, 2198, 2179, 2179, 2205, 2206, 2203, 2178, 2204, 2178, 2204, 2178, 2205, 2198, 2201, 2206, 2202, 2202, 2179, 2267, 2253, 2240, 2240, 2268, 2253, 2268, 2249, 2270, 2179, 2268, 2255, 2195, 2268, 2253, 2251, 2249, 2193, 2609, 2605, 2605, 2601, 2659, 2678, 2678, 2664, 2667, 2670, 2679, 2665, 2679, 2665, 2679, 2664, 2659, 2668, 2667, 2671, 2671, 2678, 2606, 2616, 2613, 2613, 2601, 2616, 2601, 2620, 2603, 2678, 2623, 2620, 2620, 2621, 2662, 2601, 2616, 2622, 2620, 2660, 1270, 1275, 1268, 1278, 1257, 1273, 1275, 1258, 1279, 1221, 1195, 1265, 1637, 1654, 1647, 1647, 1648, 1632, 1649, 1638, 1638, 1645, 2893, 2910, 2914, 2821, 2902, 2305, 2322, 2350, 2372, 2330, 1812, 1799, 1851, 1872, 1807, 2936, 2923, 2903, 2874, 2915, 867, 872, 865, 884, 3242, 3238, 1340, 1379, 1728, 1689, 1614, 1627, 1624, 1622, 1631, 1614, 364, 314, 299, 301, 303, 277, 313, 291, 304, 303, 375, 377, 378, 364, 313, 291, 304, 303, 277, 318, 307, 314, 303, 375, 377, 364, 313, 293, 312, 318, 277, 318, 307, 314, 303, 375, 382, 2453, 2499, 2514, 2516, 2518, 2540, 2496, 2522, 2505, 2518, 2446, 2432, 2435, 2453, 2496, 2522, 2505, 2518, 2540, 2503, 2506, 2499, 2518, 2446, 2434, 2390, 2304, 2321, 2327, 2325, 2351, 2307, 2329, 2314, 2325, 2381, 2371, 2368, 2390, 2307, 2329, 2314, 2325, 2351, 2308, 2313, 2304, 2325, 2381, 2371, 2369, 2401, 2359, 2342, 2336, 2338, 2328, 2356, 2350, 2365, 2338, 2426, 2420, 2423, 2401, 2356, 2350, 2365, 2338, 2328, 2355, 2366, 2359, 2338, 2426, 2421, 2430, 2857, 2943, 2926, 2920, 2922, 2896, 2940, 2918, 2933, 2922, 2866, 2876, 2879, 2857, 2940, 2918, 2933, 2922, 2896, 2939, 2934, 2943, 2922, 2866, 2877, 2873, 461, 411, 394, 396, 398, 436, 408, 386, 401, 398, 470, 472, 475, 461, 408, 386, 401, 398, 436, 415, 402, 411, 398, 470, 473, 473, 1782, 1696, 1713, 1719, 1717, 1679, 1699, 1721, 1706, 1717, 1773, 1763, 1760, 1782, 1700, 1713, 1714, 1724, 1717, 1679, 1700, 1705, 1696, 1717, 1773, 1764, 3223, 3265, 3280, 3286, 3284, 3310, 3266, 3288, 3275, 3284, 3212, 3202, 3201, 3223, 3266, 3288, 3275, 3284, 3310, 3269, 3272, 3265, 3284, 3212, 3203, 3200, 391, 465, 448, 454, 452, 510, 466, 456, 475, 452, 412, 402, 401, 391, 466, 456, 475, 452, 510, 469, 472, 465, 452, 412, 403, 405, 1198, 1272, 1257, 1263, 1261, 1239, 1275, 1249, 1266, 1261, 1205, 1211, 1208, 1198, 1275, 1249, 1266, 1261, 1239, 1276, 1265, 1272, 1261, 1205, 1210, 1432, 1486, 1503, 1497, 1499, 1505, 1485, 1495, 1476, 1499, 1411, 1421, 1422, 1432, 1482, 1503, 1500, 1490, 1499, 1505, 1482, 1479, 1486, 1499, 1411, 1414, 22155, 25729, 28468, 25990, 31203, -25577, 25270, 21723, 26968, 26003, 27044, 23807, 31060, 18861, 27648, 22114, -30706, 22031, 25182, 21534, 24033, -28609, 1232, 1240, 31305, 29098, 24511, 22604, 31356, 32602, 1847, 1842, 1831, 1842, 23662, 31255, 25506, 22030, 28620, 21383, 21865, 23976, -1117, -28840, 32418, 20641, -27294, -28806, 537, 533, 547, 558, 558, 562, 547, 562, 551, 560, 543, 610, 545, 547, 566, 551, 549, 557, 560, 571, 513, 557, 556, 566, 551, 556, 566, 610, 551, 560, 560, 557, 560, 632, 610, 646, 666, 666, 670, 724, 705, 705, 735, 732, 729, 704, 734, 704, 734, 704, 735, 724, 731, 732, 728, 728, 705, 665, 655, 642, 642, 670, 655, 670, 651, 668, 705, 647, 643, 649, 721, 667, 668, 642, 723, 1370, 1371, 1353, 1314, 1335, 2041, 2041, 562, 558, 563, 555, 548, 531, 564, 554, 2410, 2407, 2420, 2401, 2403, 2387, 2420, 2410, 682, 694, 694, 690, 760, 749, 749, 755, 752, 757, 748, 754, 748, 754, 748, 755, 760, 759, 752, 756, 756, 749, 693, 675, 686, 686, 690, 675, 690, 679, 688, 749, 688, 675, 684, 678, 685, 687, 765, 694, 699, 690, 679, 767, 2322, 2320, 2002, 2000, 2013, 2006, 2003, 2010, 2504, 2516, 2516, 2512, 2515, 2458, 424, 420, 402, 415, 415, 387, 402, 387, 406, 385, 430, 467, 405, 406, 391, 400, 411, 417, 402, 413, 407, 412, 414, 420, 402, 415, 415, 387, 402, 387, 406, 385, 467, 406, 385, 385, 412, 385, 457, 467, 2108, 2090, 2087, 2087, 2107, 2090, 2107, 2094, 2105, 2068, 2093, 2090, 2109, 2084, 2105, 2082, 2111, 2094, 2104, 1895, 1905, 1916, 1916, 1888, 1905, 1888, 1909, 1890, 1871, 1891, 1909, 1916, 1909, 1907, 1892, 1909, 1908, 
    1834, 1836, 2594, 2607, 342, 3041, 3052, 2994, 1759, 1746, 1729, 1748, 1750, 1766, 1729, 1759, 2499, 2527, 2498, 2522, 2517, 2530, 2501, 2523, 640, 647, 665, 719, 2144, 2836, 2480, 2343, 2480, 313, 315, 24993, 22468, 31056, 24521, 2113, 2113, 2081, 2152, 2152, 2092, 2116, 2116, 2102, 2145, 2145, 525, 531, 532, 542, 533, 525, 916, 904, 904, 908, 966, 979, 979, 973, 974, 971, 978, 972, 978, 972, 978, 973, 966, 969, 974, 970, 970, 566, 544, 553, 544, 550, 561, 544, 545, 619, 559, 565, 546, 2436, 2450, 2459, 2450, 2452, 2435, 2450, 2451, 2472, 2435, 2433, 2521, 2461, 2439, 2448, 596, 578, 587, 578, 580, 595, 578, 579, 632, 586, 584, 581, 590, 587, 578, 521, 589, 599, 576, 2814, 2792, 2789, 2789, 2809, 2792, 2809, 2796, 2811, 2352, 2363, 2348, 2363, 2420, 2355, 2357, 2420, 2350, 2359, 2346, 2366, 2355, 2344, 913, 2082, 2082, 1817, 1812, 1816, 1814, 1817, 1797, 1950, 1920, 1933, 1949, 1921, 1581, 1585, 1580, 1588, 1595, 1548, 1579, 1589, 1709, 1696, 1715, 1702, 1700, 1684, 1715, 1709, 3295, 3266, 3295, 3271, 3278, 1618, 1631, 20607, 30214, 2206, 2205, 766, 764, 747, 760, 743, 747, 761, 692, 1346, 1374, 1374, 1370, 1369, 1296, 23482, 32195, 1130, 2421, 2035, 2021, 2024, 2024, 2036, 2021, 2036, 2017, 2038, 2011, 2039, 2017, 2024, 2017, 2023, 2032, 2017, 2016, 878, 867, 880, 869, 871, 855, 880, 878, 2982, 3002, 2983, 3007, 2992, 2951, 2976, 3006, 661, 658, 645, 668, 641, 666, 647, 662, 640, 733, 665, 640, 668, 669, 2984, 3006, 2995, 2995, 2991, 3006, 2991, 3002, 2989, 2944, 3001, 3006, 2985, 2992, 2989, 2998, 2987, 3002, 2988, 3048, 3045, 3062, 3043, 3041, 3025, 3062, 3048, 2313, 2312, 2330, 2417, 2404, 594, 606, 616, 613, 613, 633, 616, 633, 620, 635, 596, 553, 635, 620, 616, 621, 579, 634, 614, 615, 584, 635, 635, 616, 624, 602, 637, 614, 635, 620, 553, 620, 635, 635, 614, 635, 563, 553, 2586, 2566, 2566, 2562, 2561, 2632, 2635, 2647, 2647, 2643, 2640, 2585, 1578, 1596, 1585, 1585, 1581, 1596, 1581, 1592, 1583, 1538, 1582, 1592, 1585, 1592, 1598, 1577, 1592, 1593, 2644, 2626, 2639, 2639, 2643, 2626, 2643, 2630, 2641, 2684, 2640, 2630, 2639, 2630, 2624, 2647, 2630, 2631, 892, 881, 866, 887, 885, 837, 866, 892, 2625, 2653, 2624, 2648, 2647, 2656, 2631, 2649, 3158, 3158, 2230, 2218, 2231, 2223, 2208, 2199, 2224, 2222, 871, 871, 2164, 2168, 2126, 2115, 2115, 2143, 2126, 2143, 2122, 2141, 2162, 2063, 2141, 2122, 2140, 2139, 2112, 2141, 2122, 2172, 2122, 2115, 2122, 2124, 2139, 2122, 2123, 2153, 2141, 2112, 2114, 2146, 2122, 2139, 2126, 2123, 2126, 2139, 2126, 2063, 2122, 2141, 2141, 2112, 2141, 2069, 2063, 2329, 2324, 2328, 2326, 2329, 2309, 432, 430, 419, 435, 431, 1042, 1039, 1042, 1034, 1027, 844, 848, 845, 853, 858, 877, 842, 852, 599, 602, 585, 604, 606, 622, 585, 599, 2496, 3247, 3240, 3263, 3238, 3259, 3232, 3261, 3244, 3258, 3253, 3321, 3253, 20796, 30533, 1292, 2706, 2718, 2728, 2725, 2725, 2745, 2728, 2745, 2732, 2747, 2708, 2793, 2725, 2726, 2728, 2733, 2703, 2728, 2751, 2726, 2747, 2720, 2749, 2732, 2746, 2793, 2732, 2747, 2747, 2726, 2747, 2803, 2793, 1523, 1527, 1531, 1533, 1535, 1461, 1520, 1514, 1535, 1533, 2850, 2878, 2878, 2874, 2928, 2917, 2917, 2939, 2936, 2941, 2916, 2938, 2916, 2938, 2916, 2939, 2928, 2943, 2936, 2940, 2940, 2917, 2877, 2859, 2854, 2854, 2874, 2859, 2874, 2863, 2872, 2917, 2878, 2876, 2206, 2178, 2178, 2182, 2252, 2265, 2265, 2247, 2244, 2241, 2264, 2246, 2264, 2246, 2264, 2247, 2252, 2243, 2244, 2240, 2240, 2265, 2177, 2199, 2202, 2202, 2182, 2199, 2182, 2195, 2180, 2123, 2118, 2133, 2112, 2114, 2162, 2133, 2123, 1926, 1946, 1927, 1951, 1936, 1959, 1920, 1950, 3003, 2998, 1858, 1871, 2138, 2135, 2116, 2129, 2131, 2147, 2116, 2138, 2859, 2871, 2858, 2866, 2877, 2826, 2861, 2867, 2040, 2021, 2040, 2016, 2025, 2208, 2237, 2208, 2232, 2225, 1296, 1294, 1283, 1299, 1295, 3144, 3158, 3163, 3147, 3159, 2737, 2748, 2736, 2750, 2737, 2733, 2112, 2125, 2113, 2127, 2112, 2140, 2921, 2932, 2927, 2915, 2920, 2930, 2919, 2930, 2927, 2921, 2920, 2016, 2018, 1683, 1681, 1692, 1687, 1682, 1691, 1819, 1798, 1794, 1802, 3199, 3180, 3171, 3177, 3170, 3168, 3154, 3173, 3172, 3198, 3193, 3170, 3199, 3188, 3107, 3175, 3198, 3170, 3171, 2696, 2718, 2707, 2707, 2703, 2718, 2703, 2714, 2701, 2720, 2701, 2718, 2705, 2715, 2704, 2706, 2720, 2711, 2710, 2700, 2699, 2704, 2701, 2694, 2487, 2465, 2476, 2476, 2480, 2465, 2480, 2469, 2482, 2463, 2482, 2465, 2478, 2468, 2479, 2477, 2463, 2472, 2473, 2483, 2484, 2479, 2482, 2489, 2748, 2737, 2722, 2743, 2741, 2693, 2722, 2748, 763, 743, 762, 738, 749, 730, 765, 739, 2992, 2989, 2992, 2984, 2977, 2422, 2408, 2405, 2421, 2409, 1266, 1279, 1267, 1277, 1266, 1262, 1567, 1545, 1540, 1540, 1560, 1545, 1560, 1549, 1562, 1591, 1563, 1549, 1540, 1549, 1547, 1564, 1549, 1548, 1669, 1673, 1727, 1714, 1714, 1710, 1727, 1710, 1723, 1708, 1667, 1790, 1705, 1708, 1719, 1706, 1723, 1684, 1709, 1713, 1712, 1695, 1708, 1708, 1727, 1703, 1677, 1706, 1713, 1708, 1723, 1790, 1723, 1708, 1708, 1713, 1708, 1764, 1790, 1694, 1683, 1664, 1685, 1687, 1703, 1664, 1694, 2413, 2427, 2422, 2422, 2410, 2427, 2410, 2431, 2408, 2373, 2428, 2427, 2412, 2421, 2408, 2419, 2414, 2431, 2409, 2673, 2684, 2671, 2682, 2680, 2632, 2671, 2673, 593, 589, 592, 584, 583, 624, 599, 585, 2084, 2105, 2084, 2108, 2101, 290, 316, 305, 289, 317, 828, 817, 829, 819, 828, 800, 478, 456, 453, 453, 473, 456, 473, 460, 475, 502, 463, 456, 479, 454, 475, 448, 477, 460, 474, 3178, 3176, 3199, 3170, 3172, 3173, 2382, 2380, 2393, 2376, 2378, 2370, 2399, 2388, 2414, 2370, 2371, 2393, 2376, 2371, 2393, 3172, 3173, 3188, 3169, 3177, 3180, 3139, 3183, 3182, 3188, 3173, 3182, 3188, 2943, 2936, 2938, 2930, 2900, 2936, 2937, 2915, 2930, 2937, 2915, 1700, 1704, 1694, 1683, 1683, 1679, 1694, 1679, 1690, 1677, 1698, 1759, 1720, 1680, 18460, 29433, 28060, 20951, 22329, 24568, 2681, 2661, 2664, 2672, 2668, 2683, 2634, 2662, 
    2663, 2685, 2668, 2663, 2685, 1420, 1434, 1438, 1421, 1436, 1431, 1468, 1424, 1425, 1419, 1434, 1425, 1419, 2243, 2261, 2257, 2242, 2259, 2264, 2291, 2271, 2270, 2244, 2261, 2270, 2244};
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();
    public static volatile ArrayList c = new ArrayList();
    public static final Object d = new Object();
    public static final Object e = new Object();
    public static final String[] g = {C0089.m355(f103short, 1724, 2, 1241), C0019.m75(f103short, 1726, 2, 1651), C0074.m292(f103short, 1728, 2, 2987), C0096.m382(f103short, 1730, 2, 517), C0049.m193(f103short, 1732, 3, 1825), C0101.m402(f103short, 1735, 4, 1365), C0009.m33(f103short, 1739, 2, 2289), C0056.m223(f103short, 1741, 4, 1169), C0137.m545(f103short, 1719, 3, 2692), C0105.m416(f103short, 1722, 2, 921), C0011.m42(f103short, 1745, 2, 1033), C0072.m285(f103short, 1747, 2, 508)};

    /* JADX INFO: renamed from: com.github.catvod.spider.Wallpaper$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
    }

    class RandomWallpaperResult {
        public byte[] a;
        public JsonObject b;
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0104.m414(f103short, 0, 1, 1509));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        String strM219 = C0055.m219(f103short, 1, 4, 2551);
        String strM554 = C0139.m554(f103short, 5, 2, 2335);
        ArrayList arrayList = new ArrayList();
        String strM177 = C0045.m177(f103short, 7, 6, 556);
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(strM177, C0103.m408(f103short, 13, 4, 2844), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0089.m355(f103short, 17, 9, 3192), C0135.m539(f103short, 26, 4, 591), null));
        com.github.catvod.spider.merge.D.b.z(C0047.m186(f103short, 30, 14, 1354), C0076.m301(f103short, 44, 4, 3053), null, arrayList);
        try {
            if (!C0299u0.x().z0()) {
                throw new IllegalStateException(C0109.m432(f103short, 90, 8, 3104));
            }
            JsonElement string = JsonParser.parseString(X1.X(C0003.m10(f103short, 48, 42, 1864), null, null));
            if (string.isJsonArray()) {
                HashMap map = b;
                map.clear();
                for (JsonElement jsonElement : string.getAsJsonArray()) {
                    if (jsonElement.isJsonObject()) {
                        JsonObject asJsonObject = jsonElement.getAsJsonObject();
                        String asString = asJsonObject.has(strM554) ? asJsonObject.get(strM554).getAsString() : "";
                        String asString2 = asJsonObject.has(strM219) ? asJsonObject.get(strM219).getAsString() : "";
                        if (!asString.isEmpty() && !asString2.isEmpty()) {
                            arrayList.add(new com.github.catvod.spider.merge.p001b.b(asString, asString2, null));
                            map.put(asString, asJsonObject);
                        }
                    }
                }
            }
            if (arrayList.size() == 3) {
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0126.m503(f103short, 120, 4, 2528), C0014.m54(f103short, 124, 2, 736), null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0018.m70(f103short, 126, 2, 880), C0126.m503(f103short, 128, 4, 532), null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0103.m408(f103short, 132, 10, 2689), C0107.m427(f103short, 142, 3, 3145), null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0087.m346(f103short, 145, 2, 1558), C0106.m422(f103short, 147, 4, 770), null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0116.m463(f103short, 151, 12, 1002), C0109.m432(f103short, 163, 4, 1014), null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0008.m31(f103short, 167, 2, 1557), C0047.m186(f103short, 169, 4, 3140), null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0101.m402(f103short, 173, 5, 2096), C0017.m65(f103short, 178, 4, 1230), null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0014.m54(f103short, 182, 5, 960), C0089.m355(f103short, 187, 4, 3155), null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0063.m249(f103short, 191, 5, 2645), C0006.m21(f103short, 196, 4, 677), null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0045.m177(f103short, 200, 5, 3094), C0119.m473(f103short, 205, 4, 1253), null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0096.m382(f103short, 209, 4, 777), C0126.m503(f103short, 213, 4, 2432), null));
                com.github.catvod.spider.merge.D.b.z(C0096.m382(f103short, 217, 6, 2104), C0095.m379(f103short, 223, 4, 2851), null, arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : g) {
                arrayList2.add(new com.github.catvod.spider.merge.p001b.c(str, str));
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new com.github.catvod.spider.merge.p001b.d(C0079.m314(f103short, 227, 3, 1298), C0010.m36(f103short, 230, 2, 1644), arrayList2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(strM177, arrayList3);
            return com.github.catvod.spider.merge.p001b.g.v(arrayList, linkedHashMap);
        } catch (Exception e2) {
            com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder(C0014.m54(f103short, 98, 22, 3201)));
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int i = 0;
        if (str2 != null && !str2.isEmpty()) {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                SpiderDebug.log(C0137.m545(f103short, 232, 28, 1211).concat(str2));
            }
        }
        if (i <= 0) {
            i = 1;
        }
        return a(C0133.m529(f103short, 260, 47, 809) + URLEncoder.encode(str, C0021.m83(f103short, 307, 5, 2149)) + C0059.m234(f103short, 312, 6, 575) + i + C0104.m414(f103short, 318, 13, 2986), i, C0032.m126(f103short, 331, 13, 1619));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.split(C0047.m186(f103short, 344, 2, 1472));
        InitOrigin.run(new RunnableC0466s(strArrSplit.length > 4 ? strArrSplit[4] : C0056.m223(f103short, 346, 2, 542), (Serializable) (strArrSplit.length > 2 ? strArrSplit[2] : ""), (Serializable) (strArrSplit.length > 3 ? strArrSplit[3] : ""), (Object) (strArrSplit.length > 5 ? strArrSplit[5] : ""), (Object) (strArrSplit.length > 6 ? strArrSplit[6] : ""), 2));
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C("");
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        String str = list.get(0);
        if (C0050.m199(f103short, 348, 8, 2846).equals(str) || C0118.m471(f103short, 356, 5, 801).equals(str) || C0019.m75(f103short, 361, 8, 2208).equals(str) || C0115.m459(f103short, 369, 12, 782).equals(str) || C0049.m193(f103short, 381, 16, 914).equals(str) || C0027.m105(f103short, 397, 13, 2726).equals(str) || str.startsWith(C0107.m427(f103short, 410, 8, 3177))) {
            AbstractC0302v0.g0(str, new i(18, this));
            return "";
        }
        String[] strArrSplit = str.split(C0103.m408(f103short, 418, 2, 1117));
        k kVarA = AbstractC0449a.a(str);
        kVarA.o(strArrSplit.length > 4 ? strArrSplit[4] : C0046.m182(f103short, 420, 2, 1239));
        kVarA.p(strArrSplit.length > 3 ? strArrSplit[3] : "");
        int length = strArrSplit.length;
        String strM223 = C0056.m223(f103short, 422, 2, 2897);
        String str2 = length > 5 ? strArrSplit[5] : strM223;
        if (strArrSplit.length > 6) {
            strM223 = strArrSplit[6];
        }
        kVarA.l(C0001.m1(f103short, 424, 5, 796) + str2 + C0142.m567(f103short, 429, 3, 539) + strM223 + C0109.m432(f103short, 432, 9, 2970));
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(C0103.m408(f103short, 441, 1, 2115));
        sb.append(strM223);
        kVarA.s(sb.toString());
        kVarA.q(C0046.m182(f103short, 442, 2, 2775));
        kVarA.r(C0096.m382(f103short, 444, 5, 2251).concat(str));
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        int i;
        int i2;
        byte b2 = -1;
        if (str != null && !str.isEmpty()) {
            if (str.startsWith(C0019.m75(f103short, 449, 8, 2619))) {
                String[] strArr = (String[]) a.get(str.substring(8));
                if (strArr != null && strArr.length >= 5) {
                    String str2 = strArr[0];
                    String str3 = strArr[1];
                    String str4 = strArr[2];
                    String str5 = strArr[3];
                    String str6 = strArr[4];
                    if (strArr.length > 5) {
                        String str7 = strArr[5];
                        if (str7 == null || str7.isEmpty()) {
                            i2 = 0;
                        } else {
                            try {
                                i2 = Integer.parseInt(str7);
                            } catch (NumberFormatException unused) {
                                SpiderDebug.log(C0053.m210(f103short, 457, 28, 584).concat(str7));
                                i2 = 0;
                            }
                        }
                        i = i2;
                    } else {
                        i = -1;
                    }
                    InitOrigin.run(new T(str2, str3, str4, str5, str6, i, c));
                }
                return "";
            }
            switch (str.hashCode()) {
                case -1812683614:
                    if (str.equals(C0091.m360(f103short, 534, 13, 1668))) {
                        b2 = 0;
                    }
                    break;
                case -1749202947:
                    if (str.equals(C0117.m467(f103short, 518, 16, 2513))) {
                        b2 = 1;
                    }
                    break;
                case -48851244:
                    if (str.equals(C0018.m70(f103short, 506, 12, 1393))) {
                        b2 = 2;
                    }
                    break;
                case 94746189:
                    if (str.equals(C0027.m105(f103short, 501, 5, 910))) {
                        b2 = 3;
                    }
                    break;
                case 790298036:
                    if (str.equals(C0106.m422(f103short, 493, 8, 2888))) {
                        b2 = 4;
                    }
                    break;
                case 1434631203:
                    if (str.equals(C0125.m499(f103short, 485, 8, 955))) {
                        b2 = 5;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    InitOrigin.run(new A(16));
                    break;
                case 1:
                    InitOrigin.run(new A(15));
                    break;
                case 2:
                    clearSelected(false);
                    X0.a(C0125.m499(f103short, 559, 7, 1802));
                    break;
                case 3:
                    clearSelected();
                    X0.a(C0103.m408(f103short, 554, 5, 3094));
                    break;
                case 4:
                    clearSelected(true);
                    X0.a(C0126.m503(f103short, 547, 7, 1182));
                    break;
                case 5:
                    InitOrigin.run(new A(14));
                    break;
            }
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:109:0x050e  */
    /* JADX WARN: Code duplicated, block: B:72:0x02f0  */
    /* JADX WARN: Instruction removed from duplicated block: B:109:0x050e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x02f0, please report this as an issue */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String strH;
        ArrayList arrayList;
        String str3;
        JsonArray jsonArray;
        String str4;
        String str5;
        JsonArray jsonArray2;
        String strM432 = C0109.m432(f103short, 566, 4, 3017);
        String strM529 = C0133.m529(f103short, 570, 2, 2855);
        String strM503 = C0126.m503(f103short, 572, 1, 3192);
        int i = Integer.parseInt(str2);
        boolean zEquals = C0115.m459(f103short, 573, 9, 2684).equals(str);
        String strM199 = C0050.m199(f103short, 582, 2, 2488);
        String strM433 = C0109.m432(f103short, 584, 8, 2863);
        String strM102 = C0026.m102(f103short, 592, 2, 2612);
        String strM322 = C0081.m322(f103short, 594, 6, 2323);
        String strM169 = C0043.m169(f103short, 600, 5, 1951);
        String strM467 = C0117.m467(f103short, 605, 5, 1578);
        String strM70 = C0018.m70(f103short, 610, 8, 2182);
        String strM499 = C0125.m499(f103short, 618, 8, 1677);
        if (zEquals) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            try {
                JsonArray jsonArrayI = i();
                int size = jsonArrayI.size() - 1;
                while (size >= 0) {
                    JsonElement jsonElement = jsonArrayI.get(size);
                    if (jsonElement.isJsonObject()) {
                        JsonObject asJsonObject = jsonElement.getAsJsonObject();
                        String asString = asJsonObject.has(strM499) ? asJsonObject.get(strM499).getAsString() : "";
                        String asString2 = asJsonObject.has(strM70) ? asJsonObject.get(strM70).getAsString() : "";
                        String asString3 = asJsonObject.has(strM467) ? asJsonObject.get(strM467).getAsString() : "";
                        boolean zHas = asJsonObject.has(strM169);
                        jsonArray2 = jsonArrayI;
                        String strM545 = C0137.m545(f103short, 626, 1, 428);
                        String asString4 = zHas ? asJsonObject.get(strM169).getAsString() : strM545;
                        String asString5 = asJsonObject.has(strM322) ? asJsonObject.get(strM322).getAsString() : strM545;
                        if (!asString.isEmpty()) {
                            String str6 = asString3.isEmpty() ? strM102 : asString3;
                            int size2 = arrayList3.size();
                            arrayList3.add(new String[]{asString, asString2, str6, asString4, asString5});
                            String strBuildProxyImageUrl = buildProxyImageUrl(asString2.isEmpty() ? asString : asString2);
                            StringBuilder sb = new StringBuilder();
                            strM499 = strM499;
                            sb.append(C0079.m314(f103short, 627, 10, 2214));
                            sb.append(size2);
                            String string = sb.toString();
                            strM199 = strM199;
                            try {
                                a.put(string, new String[]{str6, asString, asString2, asString4, asString5, String.valueOf(size2)});
                                k kVar = new k();
                                StringBuilder sb2 = new StringBuilder();
                                arrayList3 = arrayList3;
                                try {
                                    sb2.append(C0104.m414(f103short, 637, 10, 782));
                                    sb2.append(size2);
                                    sb2.append(strM503);
                                    sb2.append(asString);
                                    sb2.append(strM503);
                                    sb2.append(asString2);
                                    sb2.append(strM503);
                                    sb2.append(str6);
                                    sb2.append(strM503);
                                    sb2.append(asString4);
                                    sb2.append(strM503);
                                    sb2.append(asString5);
                                    kVar.n(sb2.toString());
                                    kVar.o(asString3.isEmpty() ? strM102 : asString3);
                                    kVar.p(strBuildProxyImageUrl);
                                    kVar.s((asString4.isEmpty() || strM545.equals(asString4)) ? "" : asString4 + C0018.m70(f103short, 647, 1, 446) + asString5);
                                    kVar.g(strM433 + string);
                                    arrayList2.add(kVar);
                                } catch (Exception e2) {
                                    e = e2;
                                    com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0070.m277(f103short, 648, 33, 424)));
                                    if (!arrayList2.isEmpty()) {
                                        arrayList2.add(0, new k(C0032.m126(f103short, 778, 20, 2533), C0143.m570(f103short, 681, 4, 754), C0017.m65(f103short, 685, 93, 1008), arrayList3.size() + strM199, C0081.m322(f103short, 798, 16, 558)));
                                    }
                                    c = arrayList3;
                                    return AbstractC0449a.c(1, 1, arrayList2.size() + 1, arrayList2.size(), arrayList2);
                                }
                            } catch (Exception e3) {
                                e = e3;
                                arrayList3 = arrayList3;
                            }
                        }
                        size--;
                        jsonArrayI = jsonArray2;
                        arrayList3 = arrayList3;
                        strM102 = strM102;
                        strM322 = strM322;
                        strM169 = strM169;
                        strM467 = strM467;
                        strM70 = strM70;
                        strM499 = strM499;
                        strM199 = strM199;
                    } else {
                        jsonArray2 = jsonArrayI;
                        strM102 = strM102;
                    }
                    size--;
                    jsonArrayI = jsonArray2;
                    arrayList3 = arrayList3;
                    strM102 = strM102;
                    strM322 = strM322;
                    strM169 = strM169;
                    strM467 = strM467;
                    strM70 = strM70;
                    strM499 = strM499;
                    strM199 = strM199;
                }
                arrayList3 = arrayList3;
                strM199 = strM199;
            } catch (Exception e4) {
                e = e4;
                arrayList3 = arrayList3;
                strM199 = strM199;
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(0, new k(C0032.m126(f103short, 778, 20, 2533), C0143.m570(f103short, 681, 4, 754), C0017.m65(f103short, 685, 93, 1008), arrayList3.size() + strM199, C0081.m322(f103short, 798, 16, 558)));
            }
            c = arrayList3;
            return AbstractC0449a.c(1, 1, arrayList2.size() + 1, arrayList2.size(), arrayList2);
        }
        String str7 = strM199;
        String str8 = strM499;
        String str9 = strM322;
        String str10 = strM169;
        String str11 = strM467;
        String str12 = strM70;
        byte b2 = -1;
        if (C0027.m105(f103short, 814, 14, 958).equals(str)) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            try {
                JsonArray jsonArrayK = k(new File(getWallpaperBackupDir(), C0059.m234(f103short, 828, 19, 734)), C0140.m558(f103short, 847, 24, 1556));
                int i2 = 0;
                while (i2 < jsonArrayK.size()) {
                    JsonElement jsonElement2 = jsonArrayK.get(i2);
                    if (jsonElement2.isJsonObject()) {
                        JsonObject asJsonObject2 = jsonElement2.getAsJsonObject();
                        String str13 = str8;
                        String strG = g(asJsonObject2, str13);
                        String str14 = str12;
                        String strG2 = g(asJsonObject2, str14);
                        String str15 = str11;
                        String strG3 = g(asJsonObject2, str15);
                        String str16 = str10;
                        String strG4 = g(asJsonObject2, str16);
                        jsonArray = jsonArrayK;
                        String str17 = str9;
                        String strG5 = g(asJsonObject2, str17);
                        str8 = str13;
                        String strG6 = g(asJsonObject2, C0130.m516(f103short, 871, 11, 2314));
                        str12 = str14;
                        String strG7 = g(asJsonObject2, C0119.m473(f103short, 882, 4, 499));
                        if (strG.isEmpty()) {
                            arrayList = arrayList5;
                            str3 = str7;
                            str11 = str15;
                            str4 = str17;
                            str5 = str16;
                        } else {
                            String str18 = strG3.isEmpty() ? strM102 : strG3;
                            int size3 = arrayList5.size();
                            str11 = str15;
                            arrayList5.add(new String[]{strG, strG2, str18, strG4, strG5});
                            String strBuildProxyImageUrl2 = buildProxyImageUrl(strG2.isEmpty() ? strG : strG2);
                            String str19 = C0026.m102(f103short, 886, 8, 521) + size3;
                            str3 = str7;
                            str4 = str17;
                            arrayList = arrayList5;
                            str5 = str16;
                            try {
                                a.put(str19, new String[]{str18, strG, strG2, strG4, strG5, String.valueOf(size3)});
                                arrayList4.add(new k(strM433 + str19, str18, strBuildProxyImageUrl2, e(strG4, strG5, strG6, strG7), strM433 + str19));
                            } catch (Exception e5) {
                                e = e5;
                                com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0117.m467(f103short, 894, 31, 1930)));
                                if (!arrayList4.isEmpty()) {
                                    arrayList4.add(0, new k(C0097.m386(f103short, 925, 13, 3186), C0059.m234(f103short, 951, 6, 1604), C0044.m175(f103short, 957, 93, 2442), arrayList.size() + str3, C0101.m402(f103short, 938, 13, 1841)));
                                }
                                c = arrayList;
                                return AbstractC0449a.c(1, 1, arrayList4.size() + 1, arrayList4.size(), arrayList4);
                            }
                        }
                    } else {
                        jsonArray = jsonArrayK;
                        arrayList = arrayList5;
                        str3 = str7;
                        str4 = str9;
                        str5 = str10;
                    }
                    i2++;
                    jsonArrayK = jsonArray;
                    arrayList5 = arrayList;
                    str9 = str4;
                    str10 = str5;
                    str7 = str3;
                }
                arrayList = arrayList5;
                str3 = str7;
            } catch (Exception e6) {
                e = e6;
                arrayList = arrayList5;
                str3 = str7;
            }
            if (!arrayList4.isEmpty()) {
                arrayList4.add(0, new k(C0097.m386(f103short, 925, 13, 3186), C0059.m234(f103short, 951, 6, 1604), C0044.m175(f103short, 957, 93, 2442), arrayList.size() + str3, C0101.m402(f103short, 938, 13, 1841)));
            }
            c = arrayList;
            return AbstractC0449a.c(1, 1, arrayList4.size() + 1, arrayList4.size(), arrayList4);
        }
        boolean zEquals2 = C0116.m463(f103short, 1050, 6, 941).equals(str);
        String strM368 = C0093.m368(f103short, 1056, 13, 1461);
        String strM369 = C0093.m368(f103short, 1069, 3, 1263);
        if (zEquals2) {
            String str20 = map != null ? map.get(strM369) : "";
            if (str20 == null || str20.isEmpty()) {
                str20 = g[0];
            }
            return a(C0117.m467(f103short, 1072, 40, 1445) + URLEncoder.encode(str20, C0074.m292(f103short, 1112, 5, 3252)) + C0072.m285(f103short, 1117, 6, 430) + i + strM368, i, str);
        }
        HashMap map2 = b;
        if (!map2.containsKey(str)) {
            str.getClass();
            String strM177 = C0045.m177(f103short, 1215, 44, 397);
            String strM459 = C0115.m459(f103short, 1259, 25, 3224);
            String strM511 = C0128.m511(f103short, 1284, 40, 2220);
            String strM504 = C0126.m503(f103short, 1324, 42, 2649);
            switch (str.hashCode()) {
                case -881377690:
                    if (str.equals(C0104.m414(f103short, 1418, 6, 1594))) {
                        b2 = 0;
                    }
                    break;
                case 1657:
                    if (str.equals(C0125.m499(f103short, 1416, 2, 1778))) {
                        b2 = 1;
                    }
                    break;
                case 1719:
                    if (str.equals(C0130.m516(f103short, 1414, 2, 1288))) {
                        b2 = 2;
                    }
                    break;
                case 3324:
                    if (str.equals(C0109.m432(f103short, 1412, 2, 3266))) {
                        b2 = 3;
                    }
                    break;
                case 3571:
                    if (str.equals(strM529)) {
                        b2 = 4;
                    }
                    break;
                case 3052376:
                    if (str.equals(C0133.m529(f103short, 1408, 4, 768))) {
                        b2 = 5;
                    }
                    break;
                case 3138974:
                    if (str.equals(strM432)) {
                        b2 = 6;
                    }
                    break;
                case 106476613:
                    if (str.equals(C0021.m83(f103short, 1403, 5, 2824))) {
                        b2 = 7;
                    }
                    break;
                case 106476675:
                    if (str.equals(C0085.m339(f103short, 1398, 5, 1892))) {
                        b2 = 8;
                    }
                    break;
                case 106476706:
                    if (str.equals(C0028.m108(f103short, 1393, 5, 2417))) {
                        b2 = 9;
                    }
                    break;
                case 106476799:
                    if (str.equals(C0018.m70(f103short, 1388, 5, 2877))) {
                        b2 = 10;
                    }
                    break;
                case 110066619:
                    if (str.equals(C0049.m193(f103short, 1378, 10, 1539))) {
                        b2 = 11;
                    }
                    break;
                case 1458780766:
                    if (str.equals(C0116.m463(f103short, 1366, 12, 1178))) {
                        b2 = 12;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    strH = com.github.catvod.spider.merge.D.b.h(strM177, i, C0091.m360(f103short, 1693, 26, 1470));
                    break;
                case 1:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, C0081.m322(f103short, 1668, 25, 1160));
                    break;
                case 2:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, C0056.m223(f103short, 1642, 26, 417));
                    break;
                case 3:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, C0050.m199(f103short, 1616, 26, 3249));
                    break;
                case 4:
                    strH = com.github.catvod.spider.merge.D.b.h(strM511, i, strM459);
                    break;
                case 5:
                    strH = com.github.catvod.spider.merge.D.b.h(strM177, i, C0115.m459(f103short, 1590, 26, 1744));
                    break;
                case 6:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, strM459);
                    break;
                case 7:
                    strH = com.github.catvod.spider.merge.D.b.h(strM511, i, C0143.m570(f103short, 1564, 26, 491));
                    break;
                case 8:
                    strH = com.github.catvod.spider.merge.D.b.h(strM511, i, C0117.m467(f103short, 1538, 26, 2831));
                    break;
                case 9:
                    strH = com.github.catvod.spider.merge.D.b.h(strM511, i, C0096.m382(f103short, 1512, 26, 2375));
                    break;
                case 10:
                    strH = com.github.catvod.spider.merge.D.b.h(strM511, i, C0056.m223(f103short, 1486, 26, 2416));
                    break;
                case 11:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, C0026.m102(f103short, 1461, 25, 2483));
                    break;
                case 12:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, C0030.m116(f103short, 1424, 37, 330));
                    break;
                default:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, strM368);
                    break;
            }
        } else {
            JsonObject jsonObject = (JsonObject) map2.get(str);
            String strM339 = C0085.m339(f103short, 1123, 10, 914);
            String asString6 = jsonObject.has(strM339) ? jsonObject.get(strM339).getAsString() : "";
            if (asString6.contains(C0118.m471(f103short, 1133, 8, 3094))) {
                strM432 = strM529;
            } else if (asString6.contains(C0135.m539(f103short, 1141, 10, 1812))) {
                strM432 = C0118.m471(f103short, 1151, 6, 640);
            } else if (asString6.contains(C0128.m511(f103short, 1157, 5, 2378))) {
                strM432 = strM369;
            }
            StringBuilder sb3 = new StringBuilder(C0115.m459(f103short, 1162, 32, 2212).concat(strM432));
            sb3.append(C0093.m368(f103short, 1194, 6, 2683));
            sb3.append(i);
            sb3.append(strM368);
            String strM193 = C0049.m193(f103short, 1200, 13, 1036);
            if (jsonObject.has(strM193) && jsonObject.get(strM193).isJsonObject()) {
                for (Map.Entry entry : jsonObject.getAsJsonObject(strM193).entrySet()) {
                    sb3.append(C0026.m102(f103short, 1213, 1, 787));
                    sb3.append((String) entry.getKey());
                    sb3.append(C0010.m36(f103short, 1214, 1, 1651));
                    sb3.append(((JsonElement) entry.getValue()).getAsString());
                }
            }
            strH = sb3.toString();
        }
        return a(strH, i, str);
    }

    public static String a(String str, int i, String str2) {
        k kVarH;
        String strM516 = C0130.m516(f103short, 1749, 4, 1875);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            if (!C0299u0.x().z0()) {
                return com.github.catvod.spider.merge.p001b.g.d(C0093.m368(f103short, 1753, 14, 1199));
            }
            JsonArray<JsonElement> asJsonArray = null;
            String strX = X1.X(str, null, null);
            JsonObject jsonObjectC = I0.c(strX);
            if (jsonObjectC.has(strM516) && jsonObjectC.get(strM516).isJsonArray()) {
                asJsonArray = jsonObjectC.getAsJsonArray(strM516);
            } else {
                try {
                    JsonElement string = JsonParser.parseString(strX);
                    if (string.isJsonArray()) {
                        asJsonArray = string.getAsJsonArray();
                    }
                } catch (Exception unused) {
                }
            }
            if (asJsonArray != null) {
                for (JsonElement jsonElement : asJsonArray) {
                    if (jsonElement.isJsonObject() && (kVarH = h(jsonElement.getAsJsonObject(), str2, arrayList2.size(), arrayList2)) != null) {
                        arrayList.add(kVarH);
                    }
                }
            }
            c = arrayList2;
            return AbstractC0449a.c(i, Integer.MAX_VALUE, 30, Integer.MAX_VALUE, arrayList);
        } catch (Exception e2) {
            com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder(C0063.m249(f103short, 1767, 35, 578)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] b(String str, boolean z) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setInstanceFollowRedirects(z);
        if (!z) {
            try {
                if (httpURLConnection.getResponseCode() / 100 != 2) {
                    httpURLConnection.disconnect();
                    return null;
                }
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStream.close();
                        httpURLConnection.disconnect();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th5;
        }
    }

    public static long beginSelectedUpdate() {
        long j;
        synchronized (d) {
            j = f + 1;
            f = j;
        }
        return j;
    }

    public static String buildProxyImageUrl(String str) {
        String strM36 = C0010.m36(f103short, 1802, 40, 750);
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            return strM36 + URLEncoder.encode(str, C0139.m554(f103short, 1842, 5, 1295));
        } catch (Exception unused) {
            return str;
        }
    }

    public static RandomWallpaperResult c(boolean z) {
        String strM386 = C0097.m386(f103short, 1847, 2, 2006);
        String strM31 = C0008.m31(f103short, 1849, 8, 582);
        String strM108 = C0028.m108(f103short, 1857, 8, 2310);
        String strM169 = C0043.m169(f103short, 1865, 44, 706);
        try {
            if (!C0299u0.x().z0()) {
                return null;
            }
            JsonObject jsonObjectC = I0.c(X1.X(strM169.concat(z ? C0107.m427(f103short, 1909, 2, 2406) : C0133.m529(f103short, 1911, 6, 1983)), null, null));
            String strG = g(jsonObjectC, strM108);
            String strG2 = g(jsonObjectC, strM31);
            boolean zStartsWith = strG.startsWith(strM386);
            String strM54 = C0014.m54(f103short, 1917, 6, 2464);
            if (zStartsWith) {
                strG = strM54.concat(strG);
            }
            if (strG2.startsWith(strM386)) {
                strG2 = strM54.concat(strG2);
            }
            String str = strG.isEmpty() ? strG2 : strG;
            if (str.isEmpty()) {
                return null;
            }
            jsonObjectC.addProperty(strM108, strG);
            jsonObjectC.addProperty(strM31, strG2);
            byte[] bArrB = b(buildProxyImageUrl(str), true);
            if (bArrB != null && bArrB.length != 0) {
                RandomWallpaperResult randomWallpaperResult = new RandomWallpaperResult();
                randomWallpaperResult.a = bArrB;
                randomWallpaperResult.b = jsonObjectC;
                return randomWallpaperResult;
            }
            return null;
        } catch (Exception e2) {
            com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder(C0097.m386(f103short, 1923, 40, 499)));
            return null;
        }
    }

    public static void clearFavorites() {
        o(C0072.m285(f103short, 1963, 19, 2123), new JsonArray());
    }

    public static void clearSelected() {
        synchronized (d) {
            try {
                f++;
                File selectedFile = getSelectedFile();
                if (selectedFile.exists()) {
                    selectedFile.delete();
                }
                C0297t1.j(C0074.m292(f103short, 1982, 18, 1808), C0059.m234(f103short, 2000, 2, 1873));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void clearSelected(boolean z) {
        File selectedFile = getSelectedFile(z);
        if (selectedFile.exists()) {
            selectedFile.delete();
        }
    }

    public static String d(JsonObject jsonObject) {
        String strG = g(jsonObject, C0003.m10(f103short, 2002, 2, 2635));
        if (!strG.isEmpty() && !C0091.m360(f103short, 2004, 1, 358).equals(strG)) {
            return C0142.m567(f103short, 2005, 3, 2952).concat(strG);
        }
        String strG2 = g(jsonObject, C0089.m355(f103short, 2008, 8, 1715));
        if (strG2.isEmpty()) {
            strG2 = g(jsonObject, C0125.m499(f103short, 2016, 8, 2487));
        }
        int iIndexOf = strG2.indexOf(63);
        if (iIndexOf >= 0) {
            strG2 = strG2.substring(0, iIndexOf);
        }
        return com.github.catvod.spider.merge.D.b.B(C0096.m382(f103short, 2024, 4, 757), strG2);
    }

    public static String e(String str, String str2, String str3, String str4) {
        String str5;
        String str6 = str4;
        StringBuilder sb = new StringBuilder();
        if (!str.isEmpty() && !C0107.m427(f103short, 2028, 1, 2128).equals(str)) {
            sb.append(str);
            sb.append(C0140.m558(f103short, 2029, 1, 2924));
            sb.append(str2);
        }
        boolean zIsEmpty = str3.isEmpty();
        String strM477 = C0120.m477(f103short, 2030, 3, 2448);
        if (!zIsEmpty) {
            if (sb.length() > 0) {
                sb.append(strM477);
            }
            sb.append(C0017.m65(f103short, 2033, 2, 333).equals(str3) ? C0010.m36(f103short, 2035, 2, 2955) : C0032.m126(f103short, 2037, 2, 902));
        }
        if (!str6.isEmpty()) {
            try {
                str5 = new SimpleDateFormat(C0104.m414(f103short, 2039, 11, 2060), Locale.getDefault()).format(new Date(Long.parseLong(str6)));
            } catch (Exception unused) {
                str5 = "";
            }
            str6 = str5;
        }
        if (!str6.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(strM477);
            }
            sb.append(str6);
        }
        return sb.toString();
    }

    public static boolean f() {
        Application applicationContext = InitOrigin.context();
        if (applicationContext == null) {
            return false;
        }
        try {
            int i = applicationContext.getResources().getConfiguration().orientation;
            if (i == 2) {
                return true;
            }
            if (i == 1) {
                return false;
            }
            try {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService(C0142.m567(f103short, 2050, 6, 634));
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    return point.x > point.y;
                }
            } catch (Exception unused) {
            }
            try {
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                return displayMetrics.widthPixels > displayMetrics.heightPixels;
            } catch (Exception unused2) {
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public static String g(JsonObject jsonObject, String str) {
        if (jsonObject == null) {
            return "";
        }
        try {
            return (!jsonObject.has(str) || jsonObject.get(str).isJsonNull()) ? "" : jsonObject.get(str).getAsString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getApiBase() {
        return C0101.m402(f103short, 2056, 21, 1020);
    }

    public static int getPageSize() {
        return 30;
    }

    public static File getSelectedFile() {
        return new File(getWallpaperBackupDir(), C0133.m529(f103short, 2077, 12, 581));
    }

    public static File getSelectedFile(boolean z) {
        return new File(getWallpaperBackupDir(), z ? C0122.m486(f103short, 2089, 15, 2551) : C0073.m288(f103short, 2104, 19, 551));
    }

    public static File getWallpaperBackupDir() {
        String strM70 = C0018.m70(f103short, 2123, 9, 2697);
        try {
            File file = new File(InitOrigin.context().getCacheDir(), strM70);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        } catch (Exception unused) {
            return new File(System.getProperty(C0106.m422(f103short, 2132, 14, 2394), C0087.m346(f103short, 2146, 1, 959)), strM70);
        }
    }

    public static k h(JsonObject jsonObject, String str, int i, ArrayList arrayList) {
        String strM36 = C0010.m36(f103short, 2147, 2, 2061);
        String strM21 = C0006.m21(f103short, 2149, 6, 1905);
        String strM37 = C0010.m36(f103short, 2155, 5, 2025);
        String strM365 = C0092.m365(f103short, 2160, 8, 1625);
        String strM177 = C0045.m177(f103short, 2168, 8, 1729);
        String strM219 = C0055.m219(f103short, 2176, 5, 3243);
        String strM22 = C0006.m21(f103short, 2181, 2, 1595);
        String strM210 = C0053.m210(f103short, 2183, 4, 2238);
        String strM65 = C0017.m65(f103short, 2187, 8, 654);
        try {
            long asLong = jsonObject.has(strM22) ? jsonObject.get(strM22).getAsLong() : 0L;
            String asString = jsonObject.has(strM219) ? jsonObject.get(strM219).getAsString() : "";
            String asString2 = jsonObject.has(strM177) ? jsonObject.get(strM177).getAsString() : "";
            String asString3 = jsonObject.has(strM365) ? jsonObject.get(strM365).getAsString() : "";
            int asInt = jsonObject.has(strM37) ? jsonObject.get(strM37).getAsInt() : 0;
            int asInt2 = jsonObject.has(strM21) ? jsonObject.get(strM21).getAsInt() : 0;
            boolean zStartsWith = asString2.startsWith(strM36);
            String strM539 = C0135.m539(f103short, 2195, 6, 1322);
            if (zStartsWith) {
                asString2 = strM539.concat(asString2);
            }
            String str2 = asString2;
            if (asString3.startsWith(strM36)) {
                asString3 = strM539.concat(asString3);
            }
            if (str2.isEmpty()) {
                return null;
            }
            String strM339 = asString.isEmpty() ? C0085.m339(f103short, 2201, 2, 891) : asString;
            arrayList.add(new String[]{str2, asString3, strM339, String.valueOf(asInt), String.valueOf(asInt2)});
            String strBuildProxyImageUrl = buildProxyImageUrl(asString3.isEmpty() ? str2 : asString3);
            String str3 = str + C0026.m102(f103short, 2203, 1, 1077) + asLong;
            a.put(str3, new String[]{strM339, str2, asString3, String.valueOf(asInt), String.valueOf(asInt2), String.valueOf(i)});
            String str4 = strM65 + str3;
            if (asString.isEmpty()) {
                asString = strM210 + asLong;
            }
            return new k(str4, asString, strBuildProxyImageUrl, asInt + C0105.m416(f103short, 2204, 1, 2317) + asInt2, str4);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean hasSelected() {
        synchronized (d) {
            try {
                File selectedFile = getSelectedFile();
                boolean z = true;
                if (selectedFile.exists() && selectedFile.length() > 0) {
                    return true;
                }
                JsonObject jsonObjectC = I0.c(C0297t1.h(C0070.m277(f103short, 2205, 18, 1924)));
                if (g(jsonObjectC, C0001.m1(f103short, 2223, 8, 770)).isEmpty() && g(jsonObjectC, C0001.m1(f103short, 2231, 8, 3026)).isEmpty()) {
                    z = false;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean hasSelected(boolean z) {
        File selectedFile = getSelectedFile(z);
        return selectedFile.exists() && selectedFile.length() > 0;
    }

    public static JsonArray i() {
        return k(new File(getWallpaperBackupDir(), C0119.m473(f103short, 2239, 14, 755)), C0098.m390(f103short, 2253, 19, 3039));
    }

    public static void invalidateSelectedImageAfterRestore() {
        synchronized (d) {
            try {
                f++;
                File selectedFile = getSelectedFile();
                if (selectedFile.exists()) {
                    selectedFile.delete();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        l();
    }

    public static boolean isFavorited(String str) {
        if (str != null && !str.isEmpty()) {
            for (JsonElement jsonElement : i()) {
                if (jsonElement.isJsonObject()) {
                    JsonObject asJsonObject = jsonElement.getAsJsonObject();
                    String strM390 = C0098.m390(f103short, 2272, 8, 2948);
                    if (str.equals(asJsonObject.has(strM390) ? asJsonObject.get(strM390).getAsString() : "")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static byte[] j(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        fileInputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        fileInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            fileInputStream.close();
            throw th4;
        }
    }

    public static JsonArray k(File file, String str) {
        try {
            String strH = C0297t1.h(str);
            if (strH.trim().isEmpty() && file.exists()) {
                strH = new String(j(file), C0050.m199(f103short, 2280, 5, 2396));
                if (!strH.trim().isEmpty()) {
                    C0297t1.j(str, strH);
                }
            }
            try {
                if (strH.trim().isEmpty()) {
                    return new JsonArray();
                }
                JsonElement string = JsonParser.parseString(strH);
                return string.isJsonArray() ? string.getAsJsonArray() : new JsonArray();
            } catch (Exception unused) {
                return new JsonArray();
            }
        } catch (Exception e2) {
            SpiderDebug.log(C0128.m511(f103short, 2285, 38, 521) + e2.getMessage());
            return new JsonArray();
        }
    }

    public static void l() {
        byte[] bArrB;
        String strM21 = C0006.m21(f103short, 2323, 6, 2674);
        String strM70 = C0018.m70(f103short, 2329, 6, 2595);
        synchronized (e) {
            File selectedFile = getSelectedFile();
            try {
                synchronized (d) {
                    long j = f;
                    if (selectedFile.exists() && selectedFile.length() > 0) {
                        try {
                            j(selectedFile);
                            return;
                        } catch (Exception unused) {
                            selectedFile.delete();
                        }
                    }
                    File fileD = C0297t1.d(C0105.m416(f103short, 2335, 18, 1629));
                    if (fileD != null && fileD.exists()) {
                        JsonObject jsonObjectC = I0.c(C0297t1.h(C0010.m36(f103short, 2353, 18, 2595)));
                        String strG = g(jsonObjectC, C0089.m355(f103short, 2371, 8, 784));
                        if (strG.isEmpty()) {
                            strG = g(jsonObjectC, C0112.m445(f103short, 2379, 8, 2613));
                        }
                        if (strG.startsWith(C0109.m432(f103short, 2387, 2, 3193))) {
                            strG = strM70.concat(strG);
                        }
                        if (strG.isEmpty()) {
                            return;
                        }
                        String strG2 = g(jsonObjectC, C0079.m314(f103short, 2389, 8, 2242));
                        if (strG2.startsWith(C0003.m10(f103short, 2397, 2, 840))) {
                            strG2 = strM21.concat(strG2);
                        }
                        byte[] bArrB2 = null;
                        try {
                            bArrB = b(buildProxyImageUrl(strG), false);
                        } catch (Exception unused2) {
                            bArrB = null;
                        }
                        if ((bArrB == null || bArrB.length == 0) && !strG2.isEmpty() && !strG2.equals(strG)) {
                            try {
                                bArrB2 = b(buildProxyImageUrl(strG2), false);
                            } catch (Exception unused3) {
                            }
                            bArrB = bArrB2;
                        }
                        if (bArrB != null && bArrB.length != 0) {
                            synchronized (d) {
                                if (j != f) {
                                    return;
                                }
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(selectedFile);
                                    try {
                                        fileOutputStream.write(bArrB);
                                        fileOutputStream.close();
                                    } catch (Throwable th) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (Exception e2) {
                                    if (selectedFile.exists()) {
                                        selectedFile.delete();
                                    }
                                    throw e2;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                SpiderDebug.log(C0142.m567(f103short, 2399, 47, 2095) + e3.getMessage());
            }
        }
    }

    public static List<k> loadFavorites() {
        String strM199 = C0050.m199(f103short, 2446, 6, 2417);
        String strM486 = C0122.m486(f103short, 2452, 5, 455);
        String strM31 = C0008.m31(f103short, 2457, 5, 1126);
        String strM382 = C0096.m382(f103short, 2462, 8, 824);
        String strM10 = C0003.m10(f103short, 2470, 8, 571);
        String strM529 = C0133.m529(f103short, 2478, 1, 2492);
        ArrayList arrayList = new ArrayList();
        try {
            JsonArray jsonArrayI = i();
            int size = jsonArrayI.size() - 1;
            while (size >= 0) {
                JsonElement jsonElement = jsonArrayI.get(size);
                if (jsonElement.isJsonObject()) {
                    JsonObject asJsonObject = jsonElement.getAsJsonObject();
                    String str = "";
                    String asString = asJsonObject.has(strM10) ? asJsonObject.get(strM10).getAsString() : "";
                    String asString2 = asJsonObject.has(strM382) ? asJsonObject.get(strM382).getAsString() : "";
                    String asString3 = asJsonObject.has(strM31) ? asJsonObject.get(strM31).getAsString() : "";
                    String asString4 = asJsonObject.has(strM486) ? asJsonObject.get(strM486).getAsString() : "";
                    String asString5 = asJsonObject.has(strM199) ? asJsonObject.get(strM199).getAsString() : "";
                    if (!asString.isEmpty()) {
                        String strBuildProxyImageUrl = buildProxyImageUrl(asString2.isEmpty() ? asString : asString2);
                        String str2 = C0044.m175(f103short, 2479, 12, 3273) + asString + strM529 + asString2 + strM529 + asString3 + strM529 + asString4 + strM529 + asString5;
                        k kVar = new k();
                        kVar.n(str2);
                        if (asString3.isEmpty()) {
                            asString3 = C0047.m186(f103short, 2491, 2, 2557);
                        }
                        kVar.o(asString3);
                        kVar.p(strBuildProxyImageUrl);
                        if (!asString4.isEmpty()) {
                            str = asString4 + C0137.m545(f103short, 2493, 1, 1396) + asString5;
                        }
                        kVar.s(str);
                        arrayList.add(kVar);
                    }
                }
                size--;
                strM199 = strM199;
                strM486 = strM486;
            }
        } catch (Exception e2) {
            com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder(C0085.m339(f103short, 2494, 33, 2761)));
        }
        return arrayList;
    }

    public static Object[] localProxy(Map<String, String> map) {
        byte[] bArrJ;
        byte[] bArr;
        Object[] objArr = {200, C0140.m558(f103short, 2527, 10, 1434), new ByteArrayInputStream(new byte[0])};
        try {
            synchronized (d) {
                try {
                    File selectedFile = getSelectedFile();
                    bArrJ = (!selectedFile.exists() || selectedFile.length() <= 0) ? null : j(selectedFile);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bArrJ == null || bArrJ.length <= 0) {
                boolean zF = f();
                RandomWallpaperResult randomWallpaperResultC = c(zF);
                if (randomWallpaperResultC != null && (bArr = randomWallpaperResultC.a) != null && bArr.length > 0) {
                    m(randomWallpaperResultC.b, zF);
                    objArr[2] = new ByteArrayInputStream(randomWallpaperResultC.a);
                } else {
                    if (!C0299u0.x().z0()) {
                        return objArr;
                    }
                    objArr[2] = new ByteArrayInputStream(b(zF ? C0126.m503(f103short, 2537, 34, 2890) : C0130.m516(f103short, 2571, 31, 2294), true));
                }
            } else {
                objArr[2] = new ByteArrayInputStream(bArrJ);
            }
        } catch (Exception unused) {
        }
        return objArr;
    }

    public static synchronized void m(JsonObject jsonObject, boolean z) {
        if (jsonObject == null) {
            return;
        }
        String strG = g(jsonObject, C0074.m292(f103short, 2602, 8, 2087));
        String strG2 = g(jsonObject, C0053.m210(f103short, 2610, 8, 2034));
        if (strG.isEmpty() && strG2.isEmpty()) {
            return;
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty(C0026.m102(f103short, 2618, 2, 3026), g(jsonObject, C0122.m486(f103short, 2620, 2, 1835)));
        jsonObject2.addProperty(C0116.m463(f103short, 2622, 8, 2102), strG);
        jsonObject2.addProperty(C0072.m285(f103short, 2630, 8, 2911), strG2);
        jsonObject2.addProperty(C0096.m382(f103short, 2638, 5, 1932), g(jsonObject, C0140.m558(f103short, 2643, 5, 2260)));
        jsonObject2.addProperty(C0106.m422(f103short, 2648, 5, 1383), g(jsonObject, C0053.m210(f103short, 2653, 5, 3135)));
        jsonObject2.addProperty(C0072.m285(f103short, 2658, 6, 2777), g(jsonObject, C0103.m408(f103short, 2664, 6, 2088)));
        jsonObject2.addProperty(C0115.m459(f103short, 2670, 11, 2822), z ? C0070.m277(f103short, 2681, 2, 1940) : C0112.m445(f103short, 2683, 6, 1790));
        jsonObject2.addProperty(C0105.m416(f103short, 2689, 4, 1903), String.valueOf(System.currentTimeMillis()));
        String strD = d(jsonObject2);
        JsonArray<JsonElement> jsonArrayK = k(new File(getWallpaperBackupDir(), C0118.m471(f103short, 2693, 19, 3085)), C0028.m108(f103short, 2712, 24, 2815));
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(jsonObject2);
        for (JsonElement jsonElement : jsonArrayK) {
            if (jsonElement.isJsonObject()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (!strD.equals(d(asJsonObject))) {
                    jsonArray.add(asJsonObject);
                    if (jsonArray.size() >= 50) {
                        break;
                    }
                }
            }
        }
        o(C0085.m339(f103short, 2736, 24, 2496), jsonArray);
    }

    public static void n(String str, String str2, String str3, String str4, String str5) {
        String str6 = str5;
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        String str10 = str;
        JsonObject jsonObject = new JsonObject();
        if (str10 == null) {
            str10 = "";
        }
        jsonObject.addProperty(C0112.m445(f103short, 2760, 8, 2768), str10);
        if (str9 == null) {
            str9 = "";
        }
        jsonObject.addProperty(C0116.m463(f103short, 2768, 8, 655), str9);
        if (str8 == null) {
            str8 = "";
        }
        jsonObject.addProperty(C0112.m445(f103short, 2776, 5, 3012), str8);
        if (str7 == null) {
            str7 = "";
        }
        jsonObject.addProperty(C0104.m414(f103short, 2781, 5, 2305), str7);
        if (str6 == null) {
            str6 = "";
        }
        jsonObject.addProperty(C0117.m467(f103short, 2786, 6, 1178), str6);
        C0297t1.j(C0092.m365(f103short, 2792, 18, 1640), jsonObject.toString());
    }

    public static void o(String str, JsonArray jsonArray) {
        try {
            C0297t1.j(str, new Gson().toJson(jsonArray));
        } catch (Exception e2) {
            com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder(C0125.m499(f103short, 2810, 39, 1758)));
        }
    }

    public static void removeFavorite(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        JsonArray<JsonElement> jsonArrayI = i();
        JsonArray jsonArray = new JsonArray();
        for (JsonElement jsonElement : jsonArrayI) {
            if (jsonElement.isJsonObject()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                String strM416 = C0105.m416(f103short, 2849, 8, 1778);
                if (!str.equals(asJsonObject.has(strM416) ? asJsonObject.get(strM416).getAsString() : "")) {
                    jsonArray.add(asJsonObject);
                }
            }
        }
        o(C0008.m31(f103short, 2857, 19, 2330), jsonArray);
    }

    public static void saveFavorite(String str, String str2, String str3, String str4, String str5) {
        String str6 = str5;
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        if (str == null || str.isEmpty()) {
            return;
        }
        JsonArray jsonArrayI = i();
        Iterator it = jsonArrayI.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String strM105 = C0027.m105(f103short, 2876, 8, 2589);
            if (!zHasNext) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(strM105, str);
                if (str9 == null) {
                    str9 = "";
                }
                jsonObject.addProperty(C0063.m249(f103short, 2884, 8, 549), str9);
                if (str8 == null) {
                    str8 = "";
                }
                jsonObject.addProperty(C0049.m193(f103short, 2892, 5, 2128), str8);
                if (str7 == null) {
                    str7 = "";
                }
                jsonObject.addProperty(C0045.m177(f103short, 2897, 5, 341), str7);
                if (str6 == null) {
                    str6 = "";
                }
                jsonObject.addProperty(C0117.m467(f103short, 2902, 6, 852), str6);
                jsonArrayI.add(jsonObject);
                o(C0114.m454(f103short, 2908, 19, 425), jsonArrayI);
                return;
            }
            JsonElement jsonElement = (JsonElement) it.next();
            if (jsonElement.isJsonObject()) {
                if (str.equals(jsonElement.getAsJsonObject().has(strM105) ? jsonElement.getAsJsonObject().get(strM105).getAsString() : "")) {
                    return;
                }
            }
        }
    }

    public static boolean saveSelected(long j, byte[] bArr, String str, String str2, String str3, String str4, String str5) {
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        synchronized (d) {
            try {
                if (j != f) {
                    return false;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(getSelectedFile());
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    n(str, str2, str3, str4, str5);
                    return true;
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0074.m292(f103short, 2927, 6, 3083));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0045.m177(f103short, 2933, 15, 2349));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0073.m288(f103short, 2948, 13, 3072));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0081.m322(f103short, 2961, 11, 2839));
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
        if (C0299u0.x().z0()) {
            return;
        }
        SpiderDebug.log(C0026.m102(f103short, 2972, 20, 1791));
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0101.m402(f103short, 2992, 13, 2569));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0010.m36(f103short, 3005, 13, 1535));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0047.m186(f103short, 3018, 13, 2224));
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

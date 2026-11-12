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
    public static final String[] g = {"风景", "动漫", "游戏", "建筑", "二次元", "赛博朋克", "唐风", "AI绘画", "小清新", "星空", "家居", "简约"};

    /* JADX INFO: renamed from: com.github.catvod.spider.Wallpaper$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
    }

    class RandomWallpaperResult {
        public byte[] a;
        public JsonObject b;
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        String strM219 = "name";
        String strM554 = "id";
        ArrayList arrayList = new ArrayList();
        String strM177 = "search";
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(strM177, "筛选喜好", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("favorites", "我的收藏", null));
        com.github.catvod.spider.merge.D.b.z("random_history", "随机历史", null, arrayList);
        try {
            if (!C0299u0.x().z0()) {
                throw new IllegalStateException("壁纸服务正在准备");
            }
            JsonElement string = JsonParser.parseString(X1.X("http://127.0.0.1:5266/wallpaper/categories", null, null));
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
                arrayList.add(new com.github.catvod.spider.merge.p001b.b("feed", "精选", null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b("hd", "高清壁纸", null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b("fullscreen", "全面屏", null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b("2k", "2K壁纸", null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b("landscape_1k", "1K横屏", null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b("pc", "电脑壁纸", null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b("pc_2k", "2K横屏", null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b("pc_4k", "4K横屏", null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b("pc_5k", "5K横屏", null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b("pc_8k", "8K横屏", null));
                arrayList.add(new com.github.catvod.spider.merge.p001b.b("chat", "聊天背景", null));
                com.github.catvod.spider.merge.D.b.z("tablet", "平板壁纸", null, arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : g) {
                arrayList2.add(new com.github.catvod.spider.merge.p001b.c(str, str));
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new com.github.catvod.spider.merge.p001b.d("tag", "标签", arrayList2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(strM177, arrayList3);
            return com.github.catvod.spider.merge.p001b.g.v(arrayList, linkedHashMap);
        } catch (Exception e2) {
            com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder("[Wallpaper] 动态分类加载失败: "));
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int i = 0;
        if (str2 != null && !str2.isEmpty()) {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                SpiderDebug.log("[Wallpaper] parseInt error: ".concat(str2));
            }
        }
        if (i <= 0) {
            i = 1;
        }
        return a("http://127.0.0.1:5266/wallpaper/search?keyword=" + URLEncoder.encode(str, "UTF-8") + "&page=" + i + "&page_size=30", i, "search_result");
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.split("\\|");
        InitOrigin.run(new RunnableC0466s(strArrSplit.length > 4 ? strArrSplit[4] : "壁纸", (Serializable) (strArrSplit.length > 2 ? strArrSplit[2] : ""), (Serializable) (strArrSplit.length > 3 ? strArrSplit[3] : ""), (Object) (strArrSplit.length > 5 ? strArrSplit[5] : ""), (Object) (strArrSplit.length > 6 ? strArrSplit[6] : ""), 2));
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C("");
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        String str = list.get(0);
        if ("settings".equals(str) || "clear".equals(str) || "clear_tv".equals(str) || "clear_mobile".equals(str) || "manage_favorites".equals(str) || "clear_history".equals(str) || str.startsWith("preview:")) {
            AbstractC0302v0.g0(str, new i(18, this));
            return "";
        }
        String[] strArrSplit = str.split("\\|");
        k kVarA = AbstractC0449a.a(str);
        kVarA.o(strArrSplit.length > 4 ? strArrSplit[4] : "壁纸");
        kVarA.p(strArrSplit.length > 3 ? strArrSplit[3] : "");
        int length = strArrSplit.length;
        String strM223 = "未知";
        String str2 = length > 5 ? strArrSplit[5] : strM223;
        if (strArrSplit.length > 6) {
            strM223 = strArrSplit[6];
        }
        kVarA.l("分辨率: " + str2 + " x " + strM223 + "\n点击播放预览大图");
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("x");
        sb.append(strM223);
        kVarA.s(sb.toString());
        kVarA.q("预览");
        kVarA.r("查看大图$".concat(str));
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        int i;
        int i2;
        byte b2 = -1;
        if (str != null && !str.isEmpty()) {
            if (str.startsWith("preview:")) {
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
                                SpiderDebug.log("[Wallpaper] parseInt error: ".concat(str7));
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
                    if (str.equals("clear_history")) {
                        b2 = 0;
                    }
                    break;
                case -1749202947:
                    if (str.equals("manage_favorites")) {
                        b2 = 1;
                    }
                    break;
                case -48851244:
                    if (str.equals("clear_mobile")) {
                        b2 = 2;
                    }
                    break;
                case 94746189:
                    if (str.equals("clear")) {
                        b2 = 3;
                    }
                    break;
                case 790298036:
                    if (str.equals("clear_tv")) {
                        b2 = 4;
                    }
                    break;
                case 1434631203:
                    if (str.equals("settings")) {
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
                    X0.a("已清除竖屏壁纸");
                    break;
                case 3:
                    clearSelected();
                    X0.a("已清除壁纸");
                    break;
                case 4:
                    clearSelected(true);
                    X0.a("已清除横屏壁纸");
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
        String strM432 = "feed";
        String strM529 = "pc";
        String strM503 = "|";
        int i = Integer.parseInt(str2);
        boolean zEquals = "favorites".equals(str);
        String strM199 = " 张";
        String strM433 = "preview:";
        String strM102 = "壁纸";
        String strM322 = "height";
        String strM169 = "width";
        String strM467 = "title";
        String strM70 = "thumbUrl";
        String strM499 = "largeUrl";
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
                        String strM545 = "0";
                        String asString4 = zHas ? asJsonObject.get(strM169).getAsString() : strM545;
                        String asString5 = asJsonObject.has(strM322) ? asJsonObject.get(strM322).getAsString() : strM545;
                        if (!asString.isEmpty()) {
                            String str6 = asString3.isEmpty() ? strM102 : asString3;
                            int size2 = arrayList3.size();
                            arrayList3.add(new String[]{asString, asString2, str6, asString4, asString5});
                            String strBuildProxyImageUrl = buildProxyImageUrl(asString2.isEmpty() ? asString : asString2);
                            StringBuilder sb = new StringBuilder();
                            strM499 = strM499;
                            sb.append("favorites_");
                            sb.append(size2);
                            String string = sb.toString();
                            strM199 = strM199;
                            try {
                                a.put(string, new String[]{str6, asString, asString2, asString4, asString5, String.valueOf(size2)});
                                k kVar = new k();
                                StringBuilder sb2 = new StringBuilder();
                                arrayList3 = arrayList3;
                                try {
                                    sb2.append("favorites|");
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
                                    kVar.s((asString4.isEmpty() || strM545.equals(asString4)) ? "" : asString4 + "x" + asString5);
                                    kVar.g(strM433 + string);
                                    arrayList2.add(kVar);
                                } catch (Exception e2) {
                                    e = e2;
                                    com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[Wallpaper] loadFavorites error: "));
                                    if (!arrayList2.isEmpty()) {
                                        arrayList2.add(0, new k("manage_favorites_btn", "管理收藏", "https://tc-new.z.wiki/autoupload/iYHTWVx6T8RrCmqdGD6MOdiO_OyvX7mIgxFBfDMDErs/2026/fish4k.jpeg", arrayList3.size() + strM199, "manage_favorites"));
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
                arrayList2.add(0, new k("manage_favorites_btn", "管理收藏", "https://tc-new.z.wiki/autoupload/iYHTWVx6T8RrCmqdGD6MOdiO_OyvX7mIgxFBfDMDErs/2026/fish4k.jpeg", arrayList3.size() + strM199, "manage_favorites"));
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
        if ("random_history".equals(str)) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            try {
                JsonArray jsonArrayK = k(new File(getWallpaperBackupDir(), "random_history.json"), "wallpaper_random_history");
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
                        String strG6 = g(asJsonObject2, "orientation");
                        str12 = str14;
                        String strG7 = g(asJsonObject2, "time");
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
                            String str19 = "history_" + size3;
                            str3 = str7;
                            str4 = str17;
                            arrayList = arrayList5;
                            str5 = str16;
                            try {
                                a.put(str19, new String[]{str18, strG, strG2, strG4, strG5, String.valueOf(size3)});
                                arrayList4.add(new k(strM433 + str19, str18, strBuildProxyImageUrl2, e(strG4, strG5, strG6, strG7), strM433 + str19));
                            } catch (Exception e5) {
                                e = e5;
                                com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[Wallpaper] loadHistory error: "));
                                if (!arrayList4.isEmpty()) {
                                    arrayList4.add(0, new k("clear_history", "清空随机历史", "https://tc-new.z.wiki/autoupload/iYHTWVx6T8RrCmqdGD6MOdiO_OyvX7mIgxFBfDMDErs/2026/fish4k.jpeg", arrayList.size() + str3, "clear_history"));
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
                arrayList4.add(0, new k("clear_history", "清空随机历史", "https://tc-new.z.wiki/autoupload/iYHTWVx6T8RrCmqdGD6MOdiO_OyvX7mIgxFBfDMDErs/2026/fish4k.jpeg", arrayList.size() + str3, "clear_history"));
            }
            c = arrayList;
            return AbstractC0449a.c(1, 1, arrayList4.size() + 1, arrayList4.size(), arrayList4);
        }
        boolean zEquals2 = "search".equals(str);
        String strM368 = "&page_size=30";
        String strM369 = "tag";
        if (zEquals2) {
            String str20 = map != null ? map.get(strM369) : "";
            if (str20 == null || str20.isEmpty()) {
                str20 = g[0];
            }
            return a("http://127.0.0.1:5266/wallpaper/tag?tag=" + URLEncoder.encode(str20, "UTF-8") + "&page=" + i + strM368, i, str);
        }
        HashMap map2 = b;
        if (!map2.containsKey(str)) {
            str.getClass();
            String strM177 = "http://127.0.0.1:5266/wallpaper/common?page=";
            String strM459 = "&page_size=30&size_type=0";
            String strM511 = "http://127.0.0.1:5266/wallpaper/pc?page=";
            String strM504 = "http://127.0.0.1:5266/wallpaper/feed?page=";
            switch (str.hashCode()) {
                case -881377690:
                    if (str.equals("tablet")) {
                        b2 = 0;
                    }
                    break;
                case 1657:
                    if (str.equals("2k")) {
                        b2 = 1;
                    }
                    break;
                case 1719:
                    if (str.equals("4k")) {
                        b2 = 2;
                    }
                    break;
                case 3324:
                    if (str.equals("hd")) {
                        b2 = 3;
                    }
                    break;
                case 3571:
                    if (str.equals(strM529)) {
                        b2 = 4;
                    }
                    break;
                case 3052376:
                    if (str.equals("chat")) {
                        b2 = 5;
                    }
                    break;
                case 3138974:
                    if (str.equals(strM432)) {
                        b2 = 6;
                    }
                    break;
                case 106476613:
                    if (str.equals("pc_2k")) {
                        b2 = 7;
                    }
                    break;
                case 106476675:
                    if (str.equals("pc_4k")) {
                        b2 = 8;
                    }
                    break;
                case 106476706:
                    if (str.equals("pc_5k")) {
                        b2 = 9;
                    }
                    break;
                case 106476799:
                    if (str.equals("pc_8k")) {
                        b2 = 10;
                    }
                    break;
                case 110066619:
                    if (str.equals("fullscreen")) {
                        b2 = 11;
                    }
                    break;
                case 1458780766:
                    if (str.equals("landscape_1k")) {
                        b2 = 12;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    strH = com.github.catvod.spider.merge.D.b.h(strM177, i, "&page_size=30&table_type=8");
                    break;
                case 1:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, "&page_size=30&size_type=2");
                    break;
                case 2:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, "&page_size=30&size_type=24");
                    break;
                case 3:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, "&page_size=30&size_type=21");
                    break;
                case 4:
                    strH = com.github.catvod.spider.merge.D.b.h(strM511, i, strM459);
                    break;
                case 5:
                    strH = com.github.catvod.spider.merge.D.b.h(strM177, i, "&page_size=30&table_type=4");
                    break;
                case 6:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, strM459);
                    break;
                case 7:
                    strH = com.github.catvod.spider.merge.D.b.h(strM511, i, "&page_size=30&size_type=22");
                    break;
                case 8:
                    strH = com.github.catvod.spider.merge.D.b.h(strM511, i, "&page_size=30&size_type=26");
                    break;
                case 9:
                    strH = com.github.catvod.spider.merge.D.b.h(strM511, i, "&page_size=30&size_type=29");
                    break;
                case 10:
                    strH = com.github.catvod.spider.merge.D.b.h(strM511, i, "&page_size=30&size_type=31");
                    break;
                case 11:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, "&page_size=30&size_type=1");
                    break;
                case 12:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, "&page_size=30&size_type=3&sort_type=4");
                    break;
                default:
                    strH = com.github.catvod.spider.merge.D.b.h(strM504, i, strM368);
                    break;
            }
        } else {
            JsonObject jsonObject = (JsonObject) map2.get(str);
            String strM339 = "dataSource";
            String asString6 = jsonObject.has(strM339) ? jsonObject.get(strM339).getAsString() : "";
            if (asString6.contains("pcScreen")) {
                strM432 = strM529;
            } else if (asString6.contains("commonList")) {
                strM432 = "common";
            } else if (asString6.contains("byTag")) {
                strM432 = strM369;
            }
            StringBuilder sb3 = new StringBuilder("http://127.0.0.1:5266/wallpaper/".concat(strM432));
            sb3.append("?page=");
            sb3.append(i);
            sb3.append(strM368);
            String strM193 = "requestParams";
            if (jsonObject.has(strM193) && jsonObject.get(strM193).isJsonObject()) {
                for (Map.Entry entry : jsonObject.getAsJsonObject(strM193).entrySet()) {
                    sb3.append("&");
                    sb3.append((String) entry.getKey());
                    sb3.append("=");
                    sb3.append(((JsonElement) entry.getValue()).getAsString());
                }
            }
            strH = sb3.toString();
        }
        return a(strH, i, str);
    }

    public static String a(String str, int i, String str2) {
        k kVarH;
        String strM516 = "data";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            if (!C0299u0.x().z0()) {
                return com.github.catvod.spider.merge.p001b.g.d("壁纸服务正在准备，请稍后重试");
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
            com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder("[Wallpaper] categoryContent error: "));
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
        String strM36 = "http://127.0.0.1:5266/wallpaper/img?url=";
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            return strM36 + URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return str;
        }
    }

    public static RandomWallpaperResult c(boolean z) {
        String strM386 = "//";
        String strM31 = "thumbUrl";
        String strM108 = "largeUrl";
        String strM169 = "http://127.0.0.1:5266/wallpaper/random?type=";
        try {
            if (!C0299u0.x().z0()) {
                return null;
            }
            JsonObject jsonObjectC = I0.c(X1.X(strM169.concat(z ? "tv" : "mobile"), null, null));
            String strG = g(jsonObjectC, strM108);
            String strG2 = g(jsonObjectC, strM31);
            boolean zStartsWith = strG.startsWith(strM386);
            String strM54 = "https:";
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
            com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder("[Wallpaper] fetchRandomWallpaper error: "));
            return null;
        }
    }

    public static void clearFavorites() {
        o("wallpaper_favorites", new JsonArray());
    }

    public static void clearSelected() {
        synchronized (d) {
            try {
                f++;
                File selectedFile = getSelectedFile();
                if (selectedFile.exists()) {
                    selectedFile.delete();
                }
                C0297t1.j("wallpaper_selected", "{}");
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
        String strG = g(jsonObject, "id");
        if (!strG.isEmpty() && !"0".equals(strG)) {
            return "id:".concat(strG);
        }
        String strG2 = g(jsonObject, "largeUrl");
        if (strG2.isEmpty()) {
            strG2 = g(jsonObject, "thumbUrl");
        }
        int iIndexOf = strG2.indexOf(63);
        if (iIndexOf >= 0) {
            strG2 = strG2.substring(0, iIndexOf);
        }
        return com.github.catvod.spider.merge.D.b.B("url:", strG2);
    }

    public static String e(String str, String str2, String str3, String str4) {
        String str5;
        String str6 = str4;
        StringBuilder sb = new StringBuilder();
        if (!str.isEmpty() && !"0".equals(str)) {
            sb.append(str);
            sb.append("x");
            sb.append(str2);
        }
        boolean zIsEmpty = str3.isEmpty();
        String strM477 = " · ";
        if (!zIsEmpty) {
            if (sb.length() > 0) {
                sb.append(strM477);
            }
            sb.append("tv".equals(str3) ? "横屏" : "竖屏");
        }
        if (!str6.isEmpty()) {
            try {
                str5 = new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault()).format(new Date(Long.parseLong(str6)));
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
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
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
        return "http://127.0.0.1:5266";
    }

    public static int getPageSize() {
        return 30;
    }

    public static File getSelectedFile() {
        return new File(getWallpaperBackupDir(), "selected.jpg");
    }

    public static File getSelectedFile(boolean z) {
        return new File(getWallpaperBackupDir(), z ? "selected_tv.jpg" : "selected_mobile.jpg");
    }

    public static File getWallpaperBackupDir() {
        String strM70 = "wallpaper";
        try {
            File file = new File(InitOrigin.context().getCacheDir(), strM70);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        } catch (Exception unused) {
            return new File(System.getProperty("java.io.tmpdir", "."), strM70);
        }
    }

    public static k h(JsonObject jsonObject, String str, int i, ArrayList arrayList) {
        String strM36 = "//";
        String strM21 = "height";
        String strM37 = "width";
        String strM365 = "thumbUrl";
        String strM177 = "largeUrl";
        String strM219 = "title";
        String strM22 = "id";
        String strM210 = "壁纸 #";
        String strM65 = "preview:";
        try {
            long asLong = jsonObject.has(strM22) ? jsonObject.get(strM22).getAsLong() : 0L;
            String asString = jsonObject.has(strM219) ? jsonObject.get(strM219).getAsString() : "";
            String asString2 = jsonObject.has(strM177) ? jsonObject.get(strM177).getAsString() : "";
            String asString3 = jsonObject.has(strM365) ? jsonObject.get(strM365).getAsString() : "";
            int asInt = jsonObject.has(strM37) ? jsonObject.get(strM37).getAsInt() : 0;
            int asInt2 = jsonObject.has(strM21) ? jsonObject.get(strM21).getAsInt() : 0;
            boolean zStartsWith = asString2.startsWith(strM36);
            String strM539 = "https:";
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
            String strM339 = asString.isEmpty() ? "壁纸" : asString;
            arrayList.add(new String[]{str2, asString3, strM339, String.valueOf(asInt), String.valueOf(asInt2)});
            String strBuildProxyImageUrl = buildProxyImageUrl(asString3.isEmpty() ? str2 : asString3);
            String str3 = str + "_" + asLong;
            a.put(str3, new String[]{strM339, str2, asString3, String.valueOf(asInt), String.valueOf(asInt2), String.valueOf(i)});
            String str4 = strM65 + str3;
            if (asString.isEmpty()) {
                asString = strM210 + asLong;
            }
            return new k(str4, asString, strBuildProxyImageUrl, asInt + "x" + asInt2, str4);
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
                JsonObject jsonObjectC = I0.c(C0297t1.h("wallpaper_selected"));
                if (g(jsonObjectC, "largeUrl").isEmpty() && g(jsonObjectC, "thumbUrl").isEmpty()) {
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
        return k(new File(getWallpaperBackupDir(), "favorites.json"), "wallpaper_favorites");
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
                    String strM390 = "largeUrl";
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
                strH = new String(j(file), "UTF-8");
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
            SpiderDebug.log("[Wallpaper] readJsonArrayStore error: " + e2.getMessage());
            return new JsonArray();
        }
    }

    public static void l() {
        byte[] bArrB;
        String strM21 = "https:";
        String strM70 = "https:";
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
                    File fileD = C0297t1.d("wallpaper_selected");
                    if (fileD != null && fileD.exists()) {
                        JsonObject jsonObjectC = I0.c(C0297t1.h("wallpaper_selected"));
                        String strG = g(jsonObjectC, "largeUrl");
                        if (strG.isEmpty()) {
                            strG = g(jsonObjectC, "thumbUrl");
                        }
                        if (strG.startsWith("//")) {
                            strG = strM70.concat(strG);
                        }
                        if (strG.isEmpty()) {
                            return;
                        }
                        String strG2 = g(jsonObjectC, "thumbUrl");
                        if (strG2.startsWith("//")) {
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
                SpiderDebug.log("[Wallpaper] restoreSelectedFromMetadata error: " + e3.getMessage());
            }
        }
    }

    public static List<k> loadFavorites() {
        String strM199 = "height";
        String strM486 = "width";
        String strM31 = "title";
        String strM382 = "thumbUrl";
        String strM10 = "largeUrl";
        String strM529 = "|";
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
                        String str2 = "favorites|0|" + asString + strM529 + asString2 + strM529 + asString3 + strM529 + asString4 + strM529 + asString5;
                        k kVar = new k();
                        kVar.n(str2);
                        if (asString3.isEmpty()) {
                            asString3 = "壁纸";
                        }
                        kVar.o(asString3);
                        kVar.p(strBuildProxyImageUrl);
                        if (!asString4.isEmpty()) {
                            str = asString4 + "x" + asString5;
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
            com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder("[Wallpaper] loadFavorites error: "));
        }
        return arrayList;
    }

    public static Object[] localProxy(Map<String, String> map) {
        byte[] bArrJ;
        byte[] bArr;
        Object[] objArr = {200, "image/jpeg", new ByteArrayInputStream(new byte[0])};
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
                    objArr[2] = new ByteArrayInputStream(b(zF ? "http://127.0.0.1:5266/wallpaper/tv" : "http://127.0.0.1:5266/wallpaper", true));
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
        String strG = g(jsonObject, "largeUrl");
        String strG2 = g(jsonObject, "thumbUrl");
        if (strG.isEmpty() && strG2.isEmpty()) {
            return;
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("id", g(jsonObject, "id"));
        jsonObject2.addProperty("largeUrl", strG);
        jsonObject2.addProperty("thumbUrl", strG2);
        jsonObject2.addProperty("title", g(jsonObject, "title"));
        jsonObject2.addProperty("width", g(jsonObject, "width"));
        jsonObject2.addProperty("height", g(jsonObject, "height"));
        jsonObject2.addProperty("orientation", z ? "tv" : "mobile");
        jsonObject2.addProperty("time", String.valueOf(System.currentTimeMillis()));
        String strD = d(jsonObject2);
        JsonArray<JsonElement> jsonArrayK = k(new File(getWallpaperBackupDir(), "random_history.json"), "wallpaper_random_history");
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
        o("wallpaper_random_history", jsonArray);
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
        jsonObject.addProperty("largeUrl", str10);
        if (str9 == null) {
            str9 = "";
        }
        jsonObject.addProperty("thumbUrl", str9);
        if (str8 == null) {
            str8 = "";
        }
        jsonObject.addProperty("title", str8);
        if (str7 == null) {
            str7 = "";
        }
        jsonObject.addProperty("width", str7);
        if (str6 == null) {
            str6 = "";
        }
        jsonObject.addProperty("height", str6);
        C0297t1.j("wallpaper_selected", jsonObject.toString());
    }

    public static void o(String str, JsonArray jsonArray) {
        try {
            C0297t1.j(str, new Gson().toJson(jsonArray));
        } catch (Exception e2) {
            com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder("[Wallpaper] writeJsonArrayStore error: "));
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
                String strM416 = "largeUrl";
                if (!str.equals(asJsonObject.has(strM416) ? asJsonObject.get(strM416).getAsString() : "")) {
                    jsonArray.add(asJsonObject);
                }
            }
        }
        o("wallpaper_favorites", jsonArray);
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
            String strM105 = "largeUrl";
            if (!zHasNext) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(strM105, str);
                if (str9 == null) {
                    str9 = "";
                }
                jsonObject.addProperty("thumbUrl", str9);
                if (str8 == null) {
                    str8 = "";
                }
                jsonObject.addProperty("title", str8);
                if (str7 == null) {
                    str7 = "";
                }
                jsonObject.addProperty("width", str7);
                if (str6 == null) {
                    str6 = "";
                }
                jsonObject.addProperty("height", str6);
                jsonArrayI.add(jsonObject);
                o("wallpaper_favorites", jsonArrayI);
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

    public void init(Context context, String str) {
        super.init(context, str);
        if (C0299u0.x().z0()) {
            return;
        }
        SpiderDebug.log("[Wallpaper] Go代理正在准备");
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

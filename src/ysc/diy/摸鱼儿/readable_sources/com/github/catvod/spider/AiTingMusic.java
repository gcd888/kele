package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.C0001;
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
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.i;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
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
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
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
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class AiTingMusic extends Spider {
    public static volatile long f;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f3short = {1869, 3011, 2975, 2949, 2946, 2955, 2953, 2974, 2944, 2949, 2975, 2968, 3011, 2949, 2946, 2952, 2953, 2964, 3011, 2949, 2946, 2952, 2953, 2964, 3011, 2949, 2946, 2952, 2953, 2964, 3011, 2949, 2946, 2952, 2953, 2964, 3010, 2948, 2968, 2945, 2944, 26972, 24667, 2732, 2799, 2794, 2800, 2807, 2732, 2807, 2796, 2803, 2733, 2795, 2807, 2798, 2799, 1051, 1024, 1055, 28115, 22298, 2148, 2087, 2082, 2104, 2111, 2148, 2085, 2094, 2108, 2149, 2083, 2111, 2086, 2087, 25374, 28130, 28466, 32402, 22615, 905, 980, 967, 962, 975, 969, 970, 975, 981, 978, 905, 975, 968, 962, 963, 990, 904, 974, 978, 971, 970, 2879, 2941, 2918, 2940, 2937, 2915, 2916, 2879, 2943, 2917, 2941, 2933, 2937, 2878, 2936, 2916, 2941, 2940, -25539, 26848, 1704, 1715, 2345, 2407, 2410, 2404, 2419, 2411, 2410, 2415, 2421, 2418, 2345, 2415, 2408, 2402, 2403, 2430, 2344, 2414, 2418, 2411, 2410, 17871, -31667, 1193, 1270, 1258, 1255, 1279, 1266, 1279, 1270, 1251, 1193, 1263, 1256, 1250, 1251, 1278, 1192, 1262, 1266, 1259, 1258, 26920, 20785, 22029, -26739, 2421, 2418, 2424, 2425, 2404, 22027, -29016, 1108, 1097, 1117, 1093, 1097, 26471, 29646, 2859, 2865, 2857, 2849, 2861, -25715, 23193, 2529, 2536, 2535, 2542, 2556, 2534, 25785, 26224, 1717, 1710, 1701, 1717, 1705, 558, 573, 554, 558, 20737, 21771, 31796, 2787, 2799, 2786, 2795, 23309, 1508, 1514, 1521, 1519, 31395, 20591, 2322, 2321, 2334, 2324, 2369, 2391, 2378, 25055, 21459, 27890, -30209, 2368, 2373, 2393, 2388, 2373, 2370, 2379, 30362, 22783, 3065, 3060, 3068, 3059, 3047, 3060, 24715, 27158, 2038, 2030, 2016, 2024, 2042, 2017, 21784, 22507, 1145, 1128, 1129, 1120, 3318, 3202, 3302, 657, 641, 28285, -29105, 1613, 1609, 1614, 1625, 1601, 1615, 30245, 23803, 1552, 1551, 1567, 1545, 1554, 1555, 20734, 21090, 590, 604, 589, 576, 584, 583, 555, 553, 546, 574, 553, 27654, 27769, 3194, 3185, 3192, 3179, 20852, 25070, 25493, 24869, 27778, 31599, 3098, 3101, 3078, 28231, 20926, 21825, -32070, 1027, 1026, 1051, 1032, 1025, 31450, 21714, 1426, 1411, 1419, 1412, 1421, 1427, 1411, -27139, 19550, 2486, 2478, 2472, 2482, 2488, 25983, 25765, 543, 535, 533, 526, 531, 533, 532, 23101, 25579, 1171, 1173, 1177, 1169, 21960, -31873, 1328, 1312, 1319, 1326, 1338, 1313, 1312, -29391, 24547, 30144, 446, 427, 422, 417, 441, 418, 421, 445, 22184, 22236, 1920, 1921, 1947, 1948, 1927, 1946, 1937, 23223, 29037, 1961, 1954, 1955, 1958, 1966, 1976, 1967, 1956, 28321, -29878, 559, 558, 575, 553, 555, 574, 547, 549, 548, 21733, 22248, 1365, 1373, 1345, 1345, 1371, 1346, 27124, 32346, 2960, 2961, 2957, 2952, 2957, 23915, 25406, 1829, 1832, 1836, 1833, 1825, 1828, 1827, 1832, 399, 386, 22765, 30352, 294, 316, 315, 306, 304, 295, 313, 316, 294, 289, 2872, 2859, 2862, 2851, 2853, 2854, 2851, 2873, 2878, 991, 964, 987, 3202, 3269, 3264, 3269, 3266, 3275, 3271, 3289, 3315, 3274, 3264, 3017, 2948, 2955, 2950, 2964, 2964, 3000, 2955, 2958, 2964, 2963, 993, 956, 940, 957, 938, 938, 929, 912, 931, 934, 956, 955, 3204, 3272, 3269, 3282, 3317, 3270, 3267, 3289, 3294, 1949, 2013, 2002, 1989, 2028, 2015, 2010, 1984, 1991, 965, 3242, 3248, 3239, 3236, 2038, 1941, 1798, 1805, 566, 567, 549, 590, 603, 1765, 3027, 3012, 3014, 2278, 2208, 2236, 2213, 2212, 635, 551, 571, 635, 1325, 2980, 3048, 3051, 3065, 3055, 3029, 3046, 2986, 3046, 3043, 2982, 2986, 2980, 3066, 3046, 3051, 3059, 3029, 3046, 3043, 3065, 3070, 2986, 3046, 3043, 2045, 2027, 2031, 2044, 2029, 2022, 2903, 2902, 2884, 2863, 2874, 2073, 2073, 2073, 2073, 1098, 1098, 1098, 2865, 2833, 2865, 2833, 2865, 2833, 3144, 3131, 1934, 2097, 2167, 2155, 2162, 2163, 1418, 1421, 1427, 604, 547, 572, 604, 584, 606, 624, 584, 554, 580, 593, 638, 628, 595, 608, 599, 602, 595, 632, 602, 576, 624, 611, 602, 593, 551, 625, 634, 607, 581, 596, 597, 613, 619, 615, 599, 581, 610, 608, 581, 625, 614, 555, 625, 578, 611, 614, 614, 602, 582, 587, 586, 639, 639, 629, 604, 611, 605, 636, 547, 573, 551, 597, 612, 613, 546, 630, 547, 593, 629, 638, 605, 627, 634, 547, 632, 614, 603, 579, 637, 548, 583, 597, 555, 547, 549, 630, 544, 639, 587, 569, 546, 595, 583, 615, 612, 616, 554, 569, 555, 636, 579, 582, 551, 603, 578, 592, 632, 627, 583, 559, 1913, 1803, 1805, 1864, 1814, 1872, 1821, 1881, 1864, 1877, 1809, 1881, 1864, 1877, 1814, 1881, 1864, 1809, 1860, 1881, 1859, 1865, 1875, 1804, 1805, 1913, 1818, 1881, 1793, 1804, 1836, 1881, 1830, 1809, 1797, 1793, 1809, 1799, 1792, 1809, 1808, 1881, 1827, 1821, 1792, 1820, 790, 771, 770, 774, 826, 826, 830, 796, 811, 831, 827, 811, 829, 826, 1900, 1889, 1207, 1210, 1203, 1190, 950, 942, 936, 946, 952, 825, 892, 869, 825, 870, 890, 887, 879, 824, 870, 894, 870, 3156, 3082, 3090, 3082, 2250, 2253, 2255, 2242, 2318, 2322, 2322, 2326, 1274, 1272, 1190, 1261, 1259, 1271, 1274, 1250, 1213, 1266, 1279, 1190, 1828, 1907, 1855, 1702, 1664, 1686, 1665, 1758, 1714, 1684, 1686, 1693, 1671, 3013, 3047, 3058, 3041, 3044, 3044, 3049, 2983, 3005, 2982, 3000, 2984, 2976, 3012, 3041, 3046, 3069, 3056, 2995, 2984, 3017, 3046, 3052, 3066, 3047, 3041, 3052, 2984, 3001, 3000, 2995, 2984, 3011, 2977, 2984, 3017, 3064, 3064, 3044, 3053, 3039, 3053, 3050, 3011, 3041, 3068, 2983, 3005, 3003, 3007, 2982, 3003, 3006, 2984, 2976, 3011, 3008, 3036, 3013, 3012, 2980, 2984, 3044, 3041, 3043, 3053, 2984, 3023, 3053, 3051, 3043, 3047, 2977, 2984, 3019, 3040, 3066, 3047, 3045, 3053, 2983, 3001, 3002, 3000, 2982, 3000, 2982, 3000, 2982, 3000, 2984, 3013, 3047, 3050, 3041, 3044, 3053, 2984, 3035, 3049, 3054, 3049, 3066, 3041, 2983, 3005, 3003, 3007, 2982, 3003, 3006, 1594, 1572, 1574, 1598, 1663, 1586, 1599, 430, 409, 410, 409, 398, 409, 398, 3067, 3047, 3047, 3043, 3040, 2985, 3004, 3004, 3044, 3044, 3044, 3005, 3064, 3046, 3044, 3068, 3005, 3056, 3069, 3004, 3250, 3250, 3297, 3253, 3246, 3299, 3311, 3309, 1659, 1642, 1657, 1656, 1646, 2192, 2287, 2288, 2286, 2227, 2217, 2201, 2186, 2191, 2180, 2189, 2285, 2212, 2280, 2180, 2221, 2184, 2226, 
    2235, 2281, 2214, 2195, 2287, 2192, 2222, 2182, 2225, 2289, 2232, 2216, 2205, 2180, 2195, 2280, 2188, 2205, 2185, 2195, 2286, 2196, 2199, 2190, 2223, 2191, 2217, 2287, 2186, 2222, 2223, 2236, 2184, 2286, 2225, 2202, 2191, 2236, 2231, 2279, 2279, 2226, 2281, 2184, 2197, 2284, 2284, 2231, 2279, 2280, 2188, 2234, 2199, 2205, 2190, 2216, 2280, 2285, 2216, 2182, 2199, 2233, 2287, 2200, 2184, 2289, 2284, 2185, 2284, 2293, 2217, 2275, 2275, 1353, 1348, 1344, 1349, 1348, 1363, 3143, 3161, 3144, 2547, 2543, 2543, 2539, 2536, 2465, 2484, 2484, 2545, 2536, 2485, 2558, 2558, 2541, 2472, 2485, 2552, 2548, 2550, 2484, 2551, 2537, 2552, 2485, 2539, 2547, 2539, 2468, 2552, 2546, 2559, 2470, 581, 540, 2466, 2536, 2534, 2556, 2539, 2476, 2533, 2529, 2539, 2464, 2476, 2466, 2556, 2533, 2543, 2476, 2533, 2529, 2539, 2464, 2476, 2466, 2536, 2534, 2556, 2533, 2543, 2476, 2533, 2529, 2539, 425, 424, 441, 704, 671, 643, 654, 662, 643, 646, 668, 667, 704, 2522, 1369, 1303, 1306, 1300, 1283, 1307, 1369, 1513, 1450, 1455, 1461, 1458, 1513, 2242, 2206, 2180, 2179, 2186, 2184, 2207, 2242, 474, 390, 389, 400, 406, 412, 404, 409, 474, 3303, 3258, 3241, 3244, 3233, 3239, 3303, 2994, 3055, 3068, 3065, 3060, 3058, 3057, 3060, 3054, 3049, 2994, 1725, 1791, 1764, 1790, 1787, 1761, 1766, 1725, 2202, 2244, 2261, 2259, 2257, 2196, 2261, 2200, 2196, 2202, 2256, 2257, 2256, 2257, 2283, 2244, 2261, 2259, 2257, 2247, 2196, 2261, 2200, 2196, 2202, 2244, 2261, 2259, 2257, 2264, 2269, 2247, 2240, 2196, 2261, 3079, 3101, 3082, 3081, 688, 699, 684, 699, 681, 697, 680, 691, 682, 686, 26605, 26238, 20823, -29912, 2231, 2247, 2247, 2247, 2247, 2414, 2321, 2318, 2414, 2426, 2412, 2370, 2426, 2328, 2422, 2403, 2380, 2374, 2401, 2386, 2405, 2408, 2401, 2378, 2408, 2418, 2370, 2385, 2408, 2403, 2325, 2371, 2376, 2413, 2423, 2406, 2407, 2391, 2393, 2389, 2405, 2423, 2384, 2386, 2423, 2371, 2388, 2329, 2371, 2416, 2385, 2388, 2388, 2408, 2420, 2425, 2424, 2381, 2381, 2375, 2414, 2385, 2415, 2382, 2321, 2319, 2325, 2407, 2390, 2391, 2320, 2372, 2321, 2403, 2375, 2380, 2415, 2369, 2376, 2321, 2378, 2388, 2409, 2417, 2383, 2326, 2421, 2407, 2329, 2321, 2327, 2372, 2322, 2381, 2425, 2315, 2320, 2401, 2421, 2389, 2390, 2394, 2328, 2315, 2329, 2382, 2417, 2420, 2325, 2409, 2416, 2402, 2378, 2369, 2421, 2333, 2014, 1921, 1949, 1924, 1942, 2014, 1941, 1950, 1926, 1951, 2015, 1921, 1945, 1921, 1998, 1936, 1938, 1996, 1948, 1924, 1922, 1944, 1938, 2007, 1949, 1946, 1996, 1949, 1923, 1938, 2007, 1944, 1941, 1996, 28286, 28653, 2807, 709, 709, 709, -32106, 22274, -30717, 27523, -26226, 27987, 2809, 30594, 20895, -28096, 19427, -32076, 27847, 21094, -31118, 2931, 1609, 1592, 1592, 1592, 1592, 395, 390, 399, 410, 873, 878, 880, 2492, 2488, 2482, 859, 863, 851, 853, 855, 797, 856, 834, 855, 853, 2735, 2737, 2720, 3129, 3128, 3114, 3137, 3156, 1889, 1904, 1904, 1900, 1897, 1891, 1889, 1908, 1897, 1903, 1902, 1839, 1903, 1891, 1908, 1893, 1908, 1837, 1907, 1908, 1906, 1893, 1889, 1901, 345, 261, 287, 280, 273, 275, 260, 282, 287, 261, 258, 345, 2944, 2951, 2957, 2956, 2961, 853, 1773, 1707, 1719, 1710, 1711, 2042, 2025, 2046, 2042, 2379, 2397, 2368, 2313, 2315, 2304, 2332, 2315, 2569, 2562, 2571, 2584, 3158, 3149, 3154, 1005, 992, 944, 312, 309, 356, 2870, 2875, 2302, 2291, 2214, 968, 965, 915, 256, 269, 346, 964, 963, 969, 968, 981, 899, 965, 985, 960, 961, 985, 962, 989, 899, 965, 985, 960, 961, 888, 805, 822, 819, 830, 824, 827, 830, 804, 803, 888, 1336, 1402, 1377, 1403, 1406, 1380, 1379, 1336, 1950, 1985, 2013, 2000, 1992, 1989, 1992, 1985, 2004, 1950, 1859, 1792, 1797, 1823, 1816, 1859, 3169, 1073, 1094, 1093, 1149, 1074, 1125, 1078, 1093, 1149, 1074, 1072, 1062, 1093, 1079, 1137, 1133, 1140, 1141, 1085, 3220, 3274, 3286, 3291, 3267, 3301, 3286, 3283, 3273, 3278, 3226, 3286, 3283, 3222, 3226, 3220, 3276, 3283, 3294, 3295, 3285, 3301, 3286, 3283, 3273, 3278, 3226, 3286, 3283, 3222, 3226, 3220, 3274, 3283, 3289, 3301, 3286, 3283, 3273, 3278, 3226, 3286, 3283, 3222, 3226, 3220, 3273, 3283, 3284, 3293, 3295, 3272, 3301, 3286, 3283, 3273, 3278, 3226, 3286, 3283, 3222, 3226, 3220, 3291, 3286, 3283, 3226, 3286, 3283, 3222, 3226, 3220, 3286, 3291, 3267, 3279, 3283, 3223, 3272, 3285, 3277, 3226, 3286, 3283, 3222, 3226, 3220, 3288, 3291, 3273, 3295, 3301, 3286, 3226, 3286, 3283, 2930, 2933, 2862, 2866, 2867, 2874, 2849, 2864, 2861, 2926, 2849, 2863, 2876, 2873, 2868, 2866, 2849, 2863, 2876, 2873, 2868, 2866, 2865, 2868, 2862, 2857, 2849, 2863, 2876, 2873, 2868, 2866, 2861, 2865, 2876, 2852, 2932, 2930, 2933, 2822, 2819, 2930, 2816, 2934, 2932, 2817, 2931, 2869, 2857, 2864, 2865, 715, 716, 658, 653, 640, 641, 651, 664, 649, 660, 720, 717, 715, 716, 703, 698, 715, 697, 719, 717, 696, 714, 652, 656, 649, 648, 265, 262, 266, 258, 346, 316, 325, 320, 314, 260, 276, 277, 257, 312, 275, 264, 268, 258, 265, 316, 325, 320, 314, 315, 276, 332, 273, 262, 267, 274, 258, 346, 316, 325, 320, 314, 335, 316, 313, 325, 320, 314, 332, 334, 316, 325, 320, 314, 2467, 2524, 2499, 2467, 2487, 2465, 2447, 2487, 2517, 2491, 2478, 2433, 2443, 2476, 2463, 2472, 2469, 2476, 2439, 2469, 2495, 2447, 2460, 2469, 2478, 2520, 2446, 2437, 2464, 2490, 2475, 2474, 2458, 2452, 2456, 2472, 2490, 2461, 2463, 2490, 2446, 2457, 2516, 2446, 2493, 2460, 2457, 2457, 2469, 2489, 2484, 2485, 2432, 2432, 2442, 2467, 2460, 2466, 2435, 2524, 2498, 2520, 2474, 2459, 2458, 2525, 2441, 2524, 2478, 2442, 2433, 2466, 2444, 2437, 2524, 2439, 2457, 2468, 2492, 2434, 2523, 2488, 2474, 2516, 2524, 2522, 2441, 2527, 2432, 2484, 2502, 2525, 2476, 2488, 2456, 2459, 2455, 2517, 2502, 2516, 2435, 2492, 2489, 2520, 2468, 2493, 2479, 2439, 2444, 2488, 2512, 1491, 1487, 1487, 1483, 1762, 2409, 2326, 2313, 2327, 2378, 2384, 2400, 2419, 2422, 2429, 2420, 2324, 2397, 2321, 2429, 2388, 2417, 2379, 2370, 2320, 2399, 2410, 2326, 2409, 2391, 2431, 2376, 2312, 2369, 2385, 2404, 2429, 
    2410, 2321, 2421, 2404, 2416, 2410, 2327, 2413, 2414, 2423, 2390, 2422, 2384, 2326, 2419, 2391, 2390, 2373, 2417, 2327, 2376, 2403, 2422, 2373, 2382, 2334, 2334, 2379, 2320, 2417, 2412, 2325, 2325, 2382, 2334, 2321, 2421, 2371, 2414, 2404, 2423, 2385, 2321, 2324, 2385, 2431, 2414, 2368, 2326, 2401, 2417, 2312, 2325, 2416, 2325, 2316, 2384, 2330, 2330, 1617, 29768, 30160, -28278, 18473, 31016, 1541, -28737, -24856, 18546, -30460, -29299, 24695, 1541, -28737, -24856, 18546, -30460, 20809, 20793, 1541, 1550, 1550, 1550, 1573, 1623, 1611, 1549, 1612, 1601, 1573, 1623, 1562, 1558, 1556, 1541, 1588, 1577, 1610, 22324, -29888, 18546, -30460, 1541, 1589, 1579, 1594, 27957, -29260, 18546, -30460, 1541, 22289, -26991, 27957, 24715, 1541, 1573, 1570, 32085, 1573, 1565, 1618, -25076, 1573, 1572, 1541, 21582, 25545, 1541, 28086, 25500, 26065, -31447, 1541, 24953, 25545, 1541, 30356, -27759, 1541, 26065, -31447, 1541, 1588, 1583, 1541, -25439, 26748, 1541, 25497, 25894, 1616, 2809, 2808, 2794, 2689, 2708, 895, 1228, 1866, 1845, 1834, 1866, 1886, 1864, 1894, 1886, 1852, 1874, 1863, 1896, 1890, 1861, 1910, 1857, 1868, 1861, 1902, 1868, 1878, 1894, 1909, 1868, 1863, 1841, 1895, 1900, 1865, 1875, 1858, 1859, 1907, 1917, 1905, 1857, 1875, 1908, 1910, 1875, 1895, 1904, 1853, 1895, 1876, 1909, 1904, 1904, 1868, 1872, 1885, 1884, 1897, 1897, 1891, 1866, 1909, 1867, 1898, 1845, 1835, 1841, 1859, 1906, 1907, 1844, 1888, 1845, 1863, 1891, 1896, 1867, 1893, 1900, 1845, 1902, 1904, 1869, 1877, 1899, 1842, 1873, 1859, 1853, 1845, 1843, 1888, 1846, 1897, 1885, 1839, 1844, 1861, 1873, 1905, 1906, 1918, 1852, 1839, 1853, 1898, 1877, 1872, 1841, 1869, 1876, 1862, 1902, 1893, 1873, 1849, 1152, 1279, 1248, 1152, 1172, 1154, 1196, 1172, 1270, 1176, 1165, 1186, 1192, 1167, 1212, 1163, 1158, 1167, 1188, 1158, 1180, 1196, 1215, 1158, 1165, 1275, 1197, 1190, 1155, 1177, 1160, 1161, 1209, 1207, 1211, 1163, 1177, 1214, 1212, 1177, 1197, 1210, 1271, 1197, 1182, 1215, 1210, 1210, 1158, 1178, 1175, 1174, 1187, 1187, 1193, 1152, 1215, 1153, 1184, 1279, 1249, 1275, 1161, 1208, 1209, 1278, 1194, 1279, 1165, 1193, 1186, 1153, 1199, 1190, 1279, 1188, 1210, 1159, 1183, 1185, 1272, 1179, 1161, 1271, 1279, 1273, 1194, 1276, 1187, 1175, 1253, 1278, 1167, 1179, 1211, 1208, 1204, 1270, 1253, 1271, 1184, 1183, 1178, 1275, 1159, 1182, 1164, 1188, 1199, 1179, 1267, 1143, 1139, 1029, 1143, 1079, 1084, 1069, 1143, 1139, 1070, 1066, -27661, 19024, 31569, 1070, 1066, 26426, -31786, 27517, -30809, 3126, 3122, 28038, 28787, 2692, 2688, 1173, 1169, 23236, 20721, 1173, 1169, 1216, 1216, 31541, 1215, 1211, 1766, 1762, 1727, 1727, 1727, 1684, 1766, 1766, 1762, 1922, 1926, 1988, 2008, 2008, 2012, 1922, 1926, 2616, 2620, 2634, 2616, 2677, 2681, 2683, 2616, 2620, 1081, 1085, 1099, 1081, 1140, 1145, 1081, 1085, 1290, 1294, 26356, 19135, 1290, 1294, 2874, 2878, 17695, -31639, 2874, 2878, 1812, 2541, 2543, 2536, 2543, 2519, 2504, 2433, 2510, 2441, 2543, 2519, 2504, 2433, 2510, 2825, 2902, 2890, 2899, 2881, 2825, 2882, 2889, 2897, 2888, 2824, 2902, 2894, 2902, 2802, 2902, 2897, 2895, 2030, 1949, 657, 3090, 3086, 3086, 3082, 1117, 1033, 1045, 1036, 1037, 1119, 1117, 1102, 1033, 1045, 1036, 1037, 1119, 1124, 1082, 1062, 1067, 1075, 1045, 1062, 1059, 1081, 1086, 1130, 1062, 1059, 1126, 1130, 1124, 1081, 1061, 1060, 1069, 1045, 1062, 1059, 1081, 1086, 1130, 1062, 1059, 1126, 1130, 1124, 1063, 1087, 1081, 1059, 1065, 1045, 1062, 1059, 1081, 1086, 1130, 1062, 1059, 1126, 1130, 1124, 1084, 1059, 1070, 1071, 1061, 1045, 1062, 1059, 1081, 1086, 1130, 1062, 1059, 869, 1434, 1408, 1431, 1428, 1565, 1629, 1618, 1630, 1622, 2928, 2816, 2816, 2816, 2816, 1700, 825, 838, 857, 825, 813, 827, 789, 813, 847, 801, 820, 795, 785, 822, 773, 818, 831, 822, 797, 831, 805, 789, 774, 831, 820, 834, 788, 799, 826, 800, 817, 816, 768, 782, 770, 818, 800, 775, 773, 800, 788, 771, 846, 788, 807, 774, 771, 771, 831, 803, 814, 815, 794, 794, 784, 825, 774, 824, 793, 838, 856, 834, 816, 769, 768, 839, 787, 838, 820, 784, 795, 824, 790, 799, 838, 797, 771, 830, 806, 792, 833, 802, 816, 846, 838, 832, 787, 837, 794, 814, 860, 839, 822, 802, 770, 769, 781, 847, 860, 846, 793, 806, 803, 834, 830, 807, 821, 797, 790, 802, 842, 2838, 2889, 2901, 2892, 2910, 2838, 2909, 2902, 2894, 2903, 2839, 2889, 2897, 2889, 2822, 2904, 2906, 2820, 2900, 2892, 2890, 2896, 2906, 2847, 2901, 2898, 2820, 2901, 2891, 2906, 2847, 2896, 2909, 2820, 781, 781, 781, 1030, 1056, 1078, 1057, 1150, 1042, 1076, 1078, 1085, 1063, 3033, 3067, 3054, 3069, 3064, 3064, 3061, 3003, 2977, 3002, 2980, 2996, 3004, 3032, 3069, 3066, 3041, 3052, 2991, 2996, 3029, 3066, 3056, 3046, 3067, 3069, 3056, 2996, 2981, 2980, 2991, 2996, 3039, 3005, 2996, 3029, 3044, 3044, 3064, 3057, 3011, 3057, 3062, 3039, 3069, 3040, 3003, 2977, 2983, 2979, 3002, 2983, 2978, 2996, 3004, 3039, 3036, 3008, 3033, 3032, 3000, 2996, 3064, 3069, 3071, 3057, 2996, 3027, 3057, 3063, 3071, 3067, 3005, 2996, 3031, 3068, 3046, 3067, 3065, 3057, 3003, 2981, 2982, 2980, 3002, 2980, 3002, 2980, 3002, 2980, 2996, 3033, 3067, 3062, 3069, 3064, 3057, 2996, 3015, 3061, 3058, 3061, 3046, 3069, 3003, 2977, 2983, 2979, 3002, 2983, 2978, 1013, 906, 917, 1013, 993, 1015, 985, 993, 899, 1005, 1016, 983, 989, 1018, 969, 1022, 1011, 1018, 977, 1011, 1001, 985, 970, 1011, 1016, 910, 984, 979, 1014, 1004, 1021, 1020, 972, 962, 974, 1022, 1004, 971, 969, 1004, 984, 975, 898, 984, 1003, 970, 975, 975, 1011, 1007, 994, 995, 982, 982, 988, 1013, 970, 1012, 981, 906, 916, 910, 1020, 973, 972, 907, 991, 906, 1016, 988, 983, 1012, 986, 979, 906, 977, 975, 1010, 1002, 980, 909, 1006, 1020, 898, 906, 908, 991, 905, 982, 994, 912, 907, 1018, 1006, 974, 973, 961, 899, 912, 898, 981, 1002, 1007, 910, 1010, 1003, 1017, 977, 986, 1006, 902, 711, 877, 858, 857, 858, 845, 858, 845, 1098, 1128, 1128, 1134, 1147, 1151, 470, 455, 474, 470, 397, 458, 470, 463, 462, 398, 451, 466, 466, 
    462, 459, 449, 451, 470, 459, 461, 460, 397, 474, 458, 470, 463, 462, 393, 474, 463, 462, 398, 451, 466, 466, 462, 459, 449, 451, 470, 459, 461, 460, 397, 474, 463, 462, 409, 467, 415, 402, 396, 411, 398, 392, 397, 392, 409, 467, 415, 402, 396, 410, 1758, 1788, 1788, 1786, 1775, 1771, 1714, 1747, 1790, 1777, 1784, 1770, 1790, 1784, 1786, 3272, 3290, 3231, 3313, 3324, 3230, 3272, 3290, 3209, 3267, 3215, 3202, 3228, 3211, 2862, 2867, 2859, 2855, 2856, 2841, 2853, 2862, 2851, 2853, 2861, 680, 696, 697, 685, 660, 703, 676, 672, 686, 677, 2141, 2126, 2137, 2114, 2125, 2130, 2054, 2121, 2116, 2131, 1946, 2503, 2525, 2506, 2505, 1735, 1277, 1191, 1185, 1207, 1184, 1277, 1552, 1619, 1616, 1624, 1622, 1617, 1552, 2203, 2192, 2183, 2192, 2178, 2194, 2179, 2200, 2177, 2181, 3212, 3276, 3267, 3279, 3271, 3318, 3307, 3318, 3310, 3303, 1278, 1274, 1264, 709, 704, 725, 704, 652, 718, 723, 712, 710, 712, 719, 704, 717, 1548, 1545, 1564, 1545, 1605, 1563, 1562, 1547, 739, 738, 755, 1579, 1576, 1578, 1932, 1929, 1929, 2717, 2786, 2813, 2717, 2697, 2719, 2737, 2697, 2795, 2693, 2704, 2751, 2741, 2706, 2721, 2710, 2715, 2706, 2745, 2715, 2689, 2737, 2722, 2715, 2704, 2790, 2736, 2747, 2718, 2692, 2709, 2708, 2724, 2730, 2726, 2710, 2692, 2723, 2721, 2692, 2736, 2727, 2794, 2736, 2691, 2722, 2727, 2727, 2715, 2695, 2698, 2699, 2750, 2750, 2740, 2717, 2722, 2716, 2749, 2786, 2812, 2790, 2708, 2725, 2724, 2787, 2743, 2786, 2704, 2740, 2751, 2716, 2738, 2747, 2786, 2745, 2727, 2714, 2690, 2748, 2789, 2694, 2708, 2794, 2786, 2788, 2743, 2785, 2750, 2698, 2808, 2787, 2706, 2694, 2726, 2725, 2729, 2795, 2808, 2794, 2749, 2690, 2695, 2790, 2714, 2691, 2705, 2745, 2738, 2694, 2798, 1069, 1131, 1135, 1123, 1125, 1127, 1137, 1069, 1134, 1133, 1125, 1133, 1068, 1138, 1132, 1125, 1703, 1788, 1783, 1701, 1785, 1777, 1772, 1777, 1782, 1791, 1726, 1772, 1761, 1768, 1789, 1701, 1777, 1781, 1791, 1726, 1773, 1770, 1780, 1701, 2917, 2916, 2934, 2845, 2824, 1247, 1155, 1177, 1182, 1175, 1173, 1154, 1247, 2492, 2469, 2482, 2495, 1863, 1796, 1793, 1819, 1820, 1863, 2467, 2556, 2528, 2541, 2549, 2552, 2549, 2556, 2537, 2467, 2161, 2111, 2098, 2108, 2091, 2099, 2098, 2103, 2093, 2090, 2161, 2859, 2876, 2874, 2861, 2100, 2097, 2091, 2092, 1408, 1535, 1504, 1408, 1428, 1410, 1452, 1428, 1526, 1432, 1421, 1442, 1448, 1423, 1468, 1419, 1414, 1423, 1444, 1414, 1436, 1452, 1471, 1414, 1421, 1531, 1453, 1446, 1411, 1433, 1416, 1417, 1465, 1463, 1467, 1419, 1433, 1470, 1468, 1433, 1453, 1466, 1527, 1453, 1438, 1471, 1466, 1466, 1414, 1434, 1431, 1430, 1443, 1443, 1449, 1408, 1471, 1409, 1440, 1535, 1505, 1531, 1417, 1464, 1465, 1534, 1450, 1535, 1421, 1449, 1442, 1409, 1455, 1446, 1535, 1444, 1466, 1415, 1439, 1441, 1528, 1435, 1417, 1527, 1535, 1529, 1450, 1532, 1443, 1431, 1509, 1534, 1423, 1435, 1467, 1464, 1460, 1526, 1509, 1527, 1440, 1439, 1434, 1531, 1415, 1438, 1420, 1444, 1455, 1435, 1523, 2499, 2558, 2533, 2539, 2533, 2530, 1292, 1339, 1336, 1339, 1324, 1339, 1324, 2777, 2761, 2760, 2780, 2789, 2766, 2773, 2769, 2783, 2772, 496, 493, 501, 505, 502, 455, 507, 496, 509, 507, 499, 2428, 2429, 1413, 1754, 1752, 1741, 1756, 1758, 1750, 1739, 1728, 1786, 1750, 1751, 1741, 1756, 1751, 1741, 1185, 1184, 1201, 1188, 1196, 1193, 1158, 1194, 1195, 1201, 1184, 1195, 1201, 542, 537, 539, 531, 565, 537, 536, 514, 531, 536, 514, 2571, 2572, 2574, 2566, 2613, 2570, 2567, 2566, 2572, 2592, 2572, 2573, 2583, 2566, 2573, 2583, 1320, 1332, 1337, 1313, 1341, 1322, 1307, 1335, 1334, 1324, 1341, 1334, 1324, 890, 876, 872, 891, 874, 865, 842, 870, 871, 893, 876, 871, 893, 2866, 2852, 2848, 2867, 2850, 2857, 2818, 2862, 2863, 2869, 2852, 2863, 2869};
    public static final Pattern a = Pattern.compile("/(song|mp3|radio|radiolist|radioplay)/([^/]+)\\.html");
    public static final Pattern b = Pattern.compile("/(video|mp4)/([^/]+)\\.html");
    public static final Pattern c = Pattern.compile("name=[\"']csrf_token[\"']\\s+value=[\"']([^\"']+)[\"']");
    public static final AitingCookieJar d = new AitingCookieJar();
    public static final Object e = new Object();

    class AitingCookieJar implements CookieJar {
        public final HashMap a = new HashMap();

        public List<Cookie> loadForRequest(HttpUrl httpUrl) {
            if (httpUrl == null) {
                return Collections.emptyList();
            }
            synchronized (this.a) {
                try {
                    List<Cookie> list = (List) this.a.get(httpUrl.host());
                    if (list != null && !list.isEmpty()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ArrayList arrayList = new ArrayList();
                        for (Cookie cookie : list) {
                            if (cookie.expiresAt() > jCurrentTimeMillis && cookie.matches(httpUrl)) {
                                arrayList.add(cookie);
                            }
                        }
                        return arrayList;
                    }
                    return Collections.emptyList();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
            if (httpUrl == null || list == null || list.isEmpty()) {
                return;
            }
            synchronized (this.a) {
                try {
                    ArrayList arrayList = new ArrayList();
                    List<Cookie> list2 = (List) this.a.get(httpUrl.host());
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (list2 != null) {
                        for (Cookie cookie : list2) {
                            if (cookie.expiresAt() > jCurrentTimeMillis) {
                                Iterator<Cookie> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        arrayList.add(cookie);
                                        break;
                                    }
                                    Cookie next = it.next();
                                    if (next.name().equals(cookie.name()) && next.domain().equals(cookie.domain()) && next.path().equals(cookie.path())) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    for (Cookie cookie2 : list) {
                        if (cookie2.expiresAt() > jCurrentTimeMillis) {
                            arrayList.add(cookie2);
                        }
                    }
                    this.a.put(httpUrl.host(), arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0972  */
    /* JADX WARN: Code duplicated, block: B:81:0x097b A[SYNTHETIC] */
    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        Iterator it;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM558 = "/singerlist/index/index/index/index.html";
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(strM558, "歌手", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("/list/top.html", "TOP榜单", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("/list/new.html", "新歌榜", null));
        String strM285 = "电台";
        String strM463 = "/radiolist/index.html";
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(strM463, strM285, null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("/mvlist/oumei.html", "高清MV", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("/albumlist/index.html", "专辑", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("/playtype/index.html", "歌单", null));
        ArrayList arrayList2 = new ArrayList();
        String strM473 = "全部";
        String strM416 = "index";
        arrayList2.add(new com.github.catvod.spider.merge.p001b.d("area", "地区", Arrays.asList(new com.github.catvod.spider.merge.p001b.c(strM473, strM416), new com.github.catvod.spider.merge.p001b.c("华语", "huayu"), new com.github.catvod.spider.merge.p001b.c("欧美", "oumei"), new com.github.catvod.spider.merge.p001b.c("韩国", "hanguo"), new com.github.catvod.spider.merge.p001b.c("日本", "ribrn"))));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.d("sex", "性别", Arrays.asList(new com.github.catvod.spider.merge.p001b.c(strM473, strM416), new com.github.catvod.spider.merge.p001b.c("男", "male"), new com.github.catvod.spider.merge.p001b.c("女", "girl"), new com.github.catvod.spider.merge.p001b.c("组合", "band"))));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.d("genre", "流派", Arrays.asList(new com.github.catvod.spider.merge.p001b.c(strM473, strM416), new com.github.catvod.spider.merge.p001b.c("流行", "liuxing"), new com.github.catvod.spider.merge.p001b.c("电子", "dianzi"), new com.github.catvod.spider.merge.p001b.c("摇滚", "yaogun"), new com.github.catvod.spider.merge.p001b.c("嘻哈", "xiha"), new com.github.catvod.spider.merge.p001b.c("R&B", "rb"), new com.github.catvod.spider.merge.p001b.c("民谣", "minyao"), new com.github.catvod.spider.merge.p001b.c("爵士", "jueshi"), new com.github.catvod.spider.merge.p001b.c("古典", "gudian"))));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM473, strM416));
        for (char c2 = 'A'; c2 <= 'Z'; c2 = (char) (c2 + 1)) {
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(String.valueOf(c2), String.valueOf(c2).toLowerCase()));
        }
        arrayList2.add(new com.github.catvod.spider.merge.p001b.d("char", "字母", arrayList3));
        linkedHashMap.put(strM558, arrayList2);
        ArrayList arrayList4 = new ArrayList();
        String str3 = strM473;
        List listAsList = Arrays.asList(new com.github.catvod.spider.merge.p001b.c("最新", strM416), new com.github.catvod.spider.merge.p001b.c("最热", "hot"), new com.github.catvod.spider.merge.p001b.c("有声小说", "novel"), new com.github.catvod.spider.merge.p001b.c("相声", "xiangyi"), new com.github.catvod.spider.merge.p001b.c("音乐", "music"), new com.github.catvod.spider.merge.p001b.c("情感", "emotion"), new com.github.catvod.spider.merge.p001b.c("国漫", "game"), new com.github.catvod.spider.merge.p001b.c("影视", "yingshi"), new com.github.catvod.spider.merge.p001b.c("脱口秀", "talkshow"), new com.github.catvod.spider.merge.p001b.c("历史", "history"), new com.github.catvod.spider.merge.p001b.c("儿童", "children"), new com.github.catvod.spider.merge.p001b.c("教育", "education"), new com.github.catvod.spider.merge.p001b.c("八卦", "gossip"), new com.github.catvod.spider.merge.p001b.c("推理", "tuili"), new com.github.catvod.spider.merge.p001b.c("头条", "headline"));
        String strM277 = "id";
        String strM31 = "分类";
        arrayList4.add(new com.github.catvod.spider.merge.p001b.d(strM277, strM31, listAsList));
        linkedHashMap.put(strM463, arrayList4);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String strA = ((com.github.catvod.spider.merge.p001b.b) it2.next()).a();
            if (strA.contains("singerlist") || strA.contains("radiolist") || linkedHashMap.containsKey(strA)) {
                it = it2;
                str = str3;
            } else {
                String strM567 = "top";
                ArrayList arrayList5 = new ArrayList();
                try {
                    com.github.catvod.spider.merge.f0.g gVarH = h(strA);
                    String[] strArr = {".ilingku_fl", ".class_list", ".screen_list", ".box_list", ".nav_list"};
                    int i = 0;
                    while (i < 5) {
                        com.github.catvod.spider.merge.h0.d dVarQ = gVarH.Q(strArr[i]);
                        if (dVarQ.isEmpty()) {
                            it = it2;
                            str2 = strM567;
                            str = str3;
                        } else {
                            ArrayList arrayList6 = new ArrayList();
                            str = str3;
                            try {
                                arrayList6.add(new com.github.catvod.spider.merge.p001b.c(str, strA.contains(strM567) ? strM567 : strM416));
                                HashSet hashSet = new HashSet();
                                for (k kVar : dVarQ.f("a")) {
                                    try {
                                        String strC = kVar.c("href");
                                        if (!TextUtils.isEmpty(strC)) {
                                            it = it2;
                                            try {
                                                String str4 = strM567;
                                                String strReplaceAll = strC.split("\\?")[0].replaceAll("/$", "");
                                                if (!TextUtils.isEmpty(strReplaceAll) && !hashSet.contains(strReplaceAll)) {
                                                    arrayList6.add(new com.github.catvod.spider.merge.p001b.c(kVar.T().trim(), strReplaceAll));
                                                    hashSet.add(strReplaceAll);
                                                }
                                                it2 = it;
                                                strM567 = str4;
                                            } catch (Exception unused) {
                                                if (!arrayList5.isEmpty()) {
                                                    linkedHashMap.put(strA, arrayList5);
                                                }
                                                it2 = it;
                                                str3 = str;
                                            }
                                        }
                                    } catch (Exception unused2) {
                                        it = it2;
                                    }
                                }
                                it = it2;
                                str2 = strM567;
                                try {
                                    if (arrayList6.size() > 1) {
                                        arrayList5.add(new com.github.catvod.spider.merge.p001b.d(i == 0 ? strM277 : strM277 + i, strM31, arrayList6));
                                    }
                                } catch (Exception unused3) {
                                    if (!arrayList5.isEmpty()) {
                                        linkedHashMap.put(strA, arrayList5);
                                    }
                                    it2 = it;
                                    str3 = str;
                                }
                            } catch (Exception unused4) {
                                it = it2;
                            }
                        }
                        i++;
                        it2 = it;
                        str3 = str;
                        strM567 = str2;
                    }
                    it = it2;
                    str = str3;
                } catch (Exception unused5) {
                    it = it2;
                    str = str3;
                }
                if (!arrayList5.isEmpty()) {
                    linkedHashMap.put(strA, arrayList5);
                }
            }
            it2 = it;
            str3 = str;
        }
        return com.github.catvod.spider.merge.p001b.g.A(arrayList, new ArrayList(), linkedHashMap);
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        return com.github.catvod.spider.merge.D.b.d();
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int i;
        String strJ;
        String strReplace = URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        try {
            i = Integer.parseInt(str2);
        } catch (Exception unused) {
            i = 1;
        }
        String strM1 = ".html";
        String strM368 = "/so/";
        if (i <= 1) {
            strJ = com.github.catvod.spider.merge.D.b.j(strM368, strReplace, strM1);
        } else {
            strJ = strM368 + strReplace + "/" + i + strM1;
        }
        ArrayList arrayListL = l(h(strJ).Q(".base_l li, .play_list li"), "search");
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.o(Integer.parseInt(str2), 9999, 90, 999999);
        gVar.F(arrayListL);
        return gVar.r();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x029d A[PHI: r12
  0x029d: PHI (r12v8 java.lang.String) = 
  (r12v7 java.lang.String)
  (r12v7 java.lang.String)
  (r12v7 java.lang.String)
  (r12v7 java.lang.String)
  (r12v7 java.lang.String)
  (r12v25 java.lang.String)
  (r12v26 java.lang.String)
 binds: [B:19:0x00e8, B:24:0x010f, B:47:0x0243, B:87:0x029d, B:34:0x01d3, B:44:0x0232, B:45:0x0234] A[DONT_GENERATE, DONT_INLINE]] */
    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws JSONException {
        String str3;
        String str4;
        String strOptString;
        String strA;
        String str5 = str2;
        String strM414 = "UTF-8";
        try {
            str3 = new String(Base64.decode(str5, 2), strM414);
        } catch (Exception unused) {
            str3 = str5;
        }
        String strM499 = "@@@@";
        String[] strArrSplit = str3.split(strM499);
        try {
            str5 = new String(Base64.decode(str5, 2), strM414);
        } catch (Exception unused2) {
        }
        String str6 = strArrSplit[str5.split(strM499).length - 1];
        if (str6.contains("|||")) {
            String[] strArrSplit2 = str6.split("\\|\\|\\|");
            String str7 = strArrSplit2[0];
            str4 = strArrSplit2.length > 1 ? strArrSplit2[1] : "";
            str6 = str7;
        } else {
            str4 = "";
        }
        String strM386 = "\\/";
        String strM116 = "/";
        String strReplace = str6.replace(strM386, strM116);
        boolean zContains = strReplace.contains(".html");
        String strM322 = "url";
        String strM186 = "N1.NZLbZ8VClfArEHAjHRbqHC5chMWFGwyuEWprWct9cPqttHTYXmmgNqOn1/5Gvw0d1CglOah1jtIQo6UG917d2mY+0AUuvz8+9nQT5IPBjaU=";
        if (!zContains) {
            strOptString = "";
            break;
        }
        if (!(TextUtils.isEmpty(strReplace) ? false : Pattern.compile("\\.(m3u8|mp4|mp3|m4a|flv)(\\?|$)", 2).matcher(strReplace).find())) {
            Matcher matcher = a.matcher(strReplace);
            if (!matcher.find()) {
                Matcher matcher2 = b.matcher(strReplace);
                if (!matcher2.find()) {
                    strOptString = "";
                    break;
                }
                String strGroup = matcher2.group(2);
                int[] iArr = {1080, 720, 480};
                int i = 0;
                while (true) {
                    if (i >= 3) {
                        strOptString = "";
                        break;
                    }
                    String strG = g("ac=vplay&id=" + strGroup + "&q=" + iArr[i]);
                    if (!TextUtils.isEmpty(strG)) {
                        strOptString = "";
                        strReplace = strG;
                        break;
                    }
                    i++;
                }
            } else {
                String strGroup2 = matcher.group(2);
                HashMap mapJ = j();
                mapJ.put("X-Requested-With", "XMLHttpRequest");
                HashMap map = new HashMap();
                map.put("id", strGroup2);
                map.put("type", "music");
                String strA2 = a(FishCrypto.v(strM186).concat("/js/play.php"));
                if (TextUtils.isEmpty(strA2)) {
                    strA = "";
                } else {
                    d();
                    AitingCookieJar aitingCookieJar = d;
                    strA = X1.O(strA2, map, mapJ, aitingCookieJar).a();
                    if (k(strA)) {
                        f = 0L;
                        d();
                        strA = X1.O(strA2, map, mapJ, aitingCookieJar).a();
                    }
                }
                if (!TextUtils.isEmpty(strA)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strA);
                        String strOptString2 = jSONObject.optString(strM322, "");
                        if (!TextUtils.isEmpty(strOptString2) && !strOptString2.contains(".php")) {
                            strReplace = strOptString2.replace(strM386, strM116);
                        }
                        strOptString = jSONObject.optString("lkid", "");
                    } catch (Exception unused3) {
                        if (strA.trim().startsWith("http")) {
                            strReplace = strA.trim();
                        }
                        strOptString = "";
                        break;
                    }
                } else {
                    strOptString = "";
                    break;
                }
            }
        } else {
            strOptString = "";
            break;
        }
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36");
        boolean zContains2 = strReplace.contains("kuwo.cn");
        String strM339 = "Referer";
        if (zContains2) {
            mapS.put(strM339, "https://www.kuwo.cn/");
        } else if (strReplace.contains("22a5.com")) {
            mapS.put(strM339, FishCrypto.v(strM186).concat(strM116));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("parse", 0);
        String strM545 = "N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==";
        jSONObject2.put(strM322, FishCrypto.w(strM545, strReplace));
        jSONObject2.put("header", new JSONObject(mapS));
        boolean zIsEmpty = TextUtils.isEmpty(strOptString);
        String strM416 = "lrc";
        try {
            if (zIsEmpty) {
                if (!TextUtils.isEmpty(str4)) {
                    String strX = X1.X(FishCrypto.w(strM545, str4), null, j());
                    if (!TextUtils.isEmpty(strX)) {
                        jSONObject2.put(strM416, e(strX));
                    }
                }
                return jSONObject2.toString();
            }
            String strX2 = X1.X(FishCrypto.w(strM545, "https://js.eev3.com/lrc.php?cid=" + strOptString), null, j());
            if (!TextUtils.isEmpty(strX2)) {
                String strOptString3 = new JSONObject(strX2).optString(strM416, "");
                if (!TextUtils.isEmpty(strOptString3)) {
                    jSONObject2.put(strM416, e(strOptString3));
                }
            }
        } catch (Exception unused4) {
        }
        return jSONObject2.toString();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Exception {
        String strA = a(list.get(0));
        com.github.catvod.spider.merge.f0.g gVarH = h(strA);
        com.github.catvod.spider.merge.p001b.k kVarA = AbstractC0449a.a(strA);
        String strG = gVarH.Q("h1").g();
        if (TextUtils.isEmpty(strG)) {
            strG = gVarH.Y();
        }
        kVarA.o(b(strG));
        k kVarR = gVarH.R(".djpg img, .pic img, .djpic img");
        if (kVarR != null) {
            kVarA.p(a(kVarR.c("src")));
        }
        boolean zContains = strA.contains("/playlist/");
        String strM210 = "#";
        if (zContains || strA.contains("/album/") || strA.contains("/list/") || strA.contains("/singer/") || strA.contains("/special/") || strA.contains("/radio/") || strA.contains("/radiolist/") || strA.contains("/mvlist/")) {
            ArrayList arrayListI = i(gVarH);
            com.github.catvod.spider.merge.h0.d dVarQ = gVarH.Q(".page a, .dede_pages a, .pagelist a");
            HashSet<String> hashSet = new HashSet();
            Iterator<E> it = dVarQ.iterator();
            while (it.hasNext()) {
                String strC = ((k) it.next()).c("href");
                if (!TextUtils.isEmpty(strC) && !strC.contains("javascript")) {
                    String strA2 = a(strC);
                    if (!strA2.equals(strA)) {
                        hashSet.add(strA2);
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(5);
                try {
                    ArrayList arrayList = new ArrayList();
                    for (final String str : hashSet) {
                        arrayList.add(executorServiceNewFixedThreadPool.submit(new Callable<List<String>>() { // from class: com.github.catvod.spider.AiTingMusic.1
                            @Override // java.util.concurrent.Callable
                            public List<String> call() {
                                try {
                                    AiTingMusic aiTingMusic = AiTingMusic.this;
                                    String str2 = str;
                                    Pattern pattern = AiTingMusic.a;
                                    aiTingMusic.getClass();
                                    return AiTingMusic.i(AiTingMusic.h(str2));
                                } catch (Exception unused) {
                                    return new ArrayList();
                                }
                            }
                        }));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        try {
                            arrayListI.addAll((Collection) ((Future) it2.next()).get());
                        } catch (Exception unused) {
                        }
                    }
                    executorServiceNewFixedThreadPool.shutdownNow();
                } catch (Throwable th) {
                    executorServiceNewFixedThreadPool.shutdownNow();
                    throw th;
                }
            }
            if (!arrayListI.isEmpty()) {
                kVarA.q("播放列表");
                kVarA.r(TextUtils.join(strM210, arrayListI));
                return com.github.catvod.spider.merge.p001b.g.s(kVarA);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Matcher matcher = a.matcher(strA);
        boolean zFind = matcher.find();
        String strM379 = "0@@@@";
        if (zFind) {
            String str2 = FishCrypto.v("N1.NZLbZ8VClfArEHAjHRbqHC5chMWFGwyuEWprWct9cPqttHTYXmmgNqOn1/5Gvw0d1CglOah1jtIQo6UG917d2mY+0AUuvz8+9nQT5IPBjaU=") + "/plug/down.php?ac=music&lk=lrc&id=" + matcher.group(2);
            StringBuilder sb = new StringBuilder("播放$");
            sb.append(c(strM379 + strA + "|||" + str2));
            arrayList2.add(sb.toString());
        } else {
            Matcher matcher2 = b.matcher(strA);
            if (matcher2.find()) {
                final String strGroup = matcher2.group(2);
                ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(3);
                try {
                    ArrayList arrayList3 = new ArrayList();
                    int[] iArr = {1080, 720, 480};
                    String[] strArr = {"蓝光", "超清", "高清"};
                    int i = 0;
                    for (int i2 = 3; i < i2; i2 = 3) {
                        final int i3 = iArr[i];
                        final String str3 = strArr[i];
                        arrayList3.add(executorServiceNewFixedThreadPool2.submit(new Callable<String[]>() { // from class: com.github.catvod.spider.AiTingMusic.2

                            /* JADX INFO: renamed from: short, reason: not valid java name */
                            private static final short[] f4short = {595, 593, 527, 580, 578, 606, 595, 587, 532, 603, 598, 527, 1176, 1231, 1155};

                            @Override // java.util.concurrent.Callable
                            public String[] call() {
                                String str4 = "ac=vplay&id=" + strGroup + "&q=" + i3;
                                Pattern pattern = AiTingMusic.a;
                                AiTingMusic.this.getClass();
                                return new String[]{str3, AiTingMusic.g(str4)};
                            }
                        }));
                        i++;
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        try {
                            String[] strArr2 = (String[]) ((Future) it3.next()).get();
                            if (!TextUtils.isEmpty(strArr2[1])) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(strArr2[0]);
                                sb2.append("$");
                                sb2.append(c(strM379 + strArr2[1]));
                                arrayList2.add(sb2.toString());
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    executorServiceNewFixedThreadPool2.shutdownNow();
                } catch (Throwable th2) {
                    executorServiceNewFixedThreadPool2.shutdownNow();
                    throw th2;
                }
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        String strM175 = "爱听音乐";
        if (zIsEmpty) {
            kVarA.q(strM175);
            kVarA.r("解析失败$" + c("1@@@@".concat(strA)));
        } else {
            kVarA.q(strM175);
            kVarA.r(TextUtils.join(strM210, arrayList2));
        }
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ Object[] $host$dca6c5e1c5a7de15(Map<String, String> map) {
        String str = map.get("type");
        String strA = a(map.get("url"));
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        if ("img".equals(str)) {
            d();
            return new Object[]{200, "image/jpeg", X1.r(d).newCall(com.github.catvod.spider.merge.D.b.u(strA).headers(Headers.of(j())).build()).execute().body().bytes()};
        }
        if ("lrc".equals(str)) {
            return new Object[]{200, "application/octet-stream", e(f(strA, j())).getBytes("UTF-8")};
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0085  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0241  */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws Exception {
        String strM;
        String str3;
        String str4;
        String str5;
        int i = Integer.parseInt(str2);
        String strM292 = "/singerlist/";
        boolean zContains = str.contains(strM292);
        String strM301 = "index";
        String strM486 = "/";
        String strM169 = ".html";
        if (zContains) {
            if (str.split(strM486).length >= 6) {
                if (map != null) {
                    String strM554 = "area";
                    if (map.containsKey(strM554)) {
                        str3 = map.get(strM554);
                    } else {
                        str3 = strM301;
                    }
                } else {
                    str3 = strM301;
                }
                if (map != null) {
                    String strM555 = "sex";
                    if (map.containsKey(strM555)) {
                        str4 = map.get(strM555);
                    } else {
                        str4 = strM301;
                    }
                } else {
                    str4 = strM301;
                }
                if (map != null) {
                    String strM432 = "genre";
                    if (map.containsKey(strM432)) {
                        str5 = map.get(strM432);
                    } else {
                        str5 = strM301;
                    }
                } else {
                    str5 = strM301;
                }
                if (map != null) {
                    String strM382 = "char";
                    if (map.containsKey(strM382)) {
                        strM301 = map.get(strM382);
                    }
                }
                StringBuilder sbR = com.github.catvod.spider.merge.D.b.r(strM292, str3, strM486, str4, strM486);
                sbR.append(str5);
                sbR.append(strM486);
                sbR.append(strM301);
                sbR.append(strM169);
                strM = sbR.toString();
            } else {
                strM = str;
            }
        } else if (map == null || map.isEmpty()) {
            strM = str;
        } else {
            boolean zIsEmpty = map.isEmpty();
            String strM567 = "top";
            if (!zIsEmpty) {
                String[] strArr = {"id", "id1", "id2", "id3", "id4", "id5"};
                int i2 = 0;
                while (true) {
                    if (i2 >= 6) {
                        Iterator<String> it = map.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                strM = "";
                                break;
                            }
                            String next = it.next();
                            if (!TextUtils.isEmpty(next) && !next.equals(strM301) && !next.equals(strM567)) {
                                strM = next;
                                break;
                            }
                        }
                    } else {
                        String str6 = map.get(strArr[i2]);
                        if (!TextUtils.isEmpty(str6) && !str6.equals(strM301) && !str6.equals(strM567)) {
                            strM = str6;
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                strM = "";
                break;
            }
            if (TextUtils.isEmpty(strM)) {
                strM = str;
            } else if (!strM.endsWith(strM169)) {
                if (strM.equals(strM301) || strM.equals(strM567)) {
                    strM = str;
                } else {
                    String strReplace = str.replace("index.html", strM.concat(strM169)).replace("top.html", strM.concat(strM169));
                    if (strReplace.equals(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str.substring(0, str.lastIndexOf(47) + 1));
                        strM = com.github.catvod.spider.merge.D.b.m(sb, strM, strM169);
                    } else {
                        strM = strReplace;
                    }
                }
            }
        }
        if (i > 1) {
            if (!strM.contains(strM292) && !strM.contains("/radiolist/") && !strM.contains("/mvlist/") && !strM.contains("/playtype/") && !strM.contains("/list/")) {
                strM486 = "_";
            }
            strM = strM.replaceAll("(_\\d+|/\\d+)?\\.html$", strM486 + i + strM169);
        }
        com.github.catvod.spider.merge.f0.g gVarH = h(strM);
        String strM471 = ".play_list li, .video_list li, .pic_list li, .singer_list li, .ali li, .layui-row li, .base_l li";
        if ((gVarH == null || gVarH.Q(strM471).isEmpty()) && i == 1 && !strM.equals(str)) {
            gVarH = h(str);
        }
        return AbstractC0449a.c(i, 9999, 90, 999999, l(gVarH.Q(strM471), str));
    }

    public static String a(String str) {
        String strM = str;
        if (TextUtils.isEmpty(strM)) {
            return "";
        }
        String strV = FishCrypto.v("N1.NZLbZ8VClfArEHAjHRbqHC5chMWFGwyuEWprWct9cPqttHTYXmmgNqOn1/5Gvw0d1CglOah1jtIQo6UG917d2mY+0AUuvz8+9nQT5IPBjaU=");
        if (TextUtils.isEmpty(strV)) {
            return "";
        }
        if (!strM.startsWith("http")) {
            StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strV);
            String strM42 = "/";
            strM = com.github.catvod.spider.merge.D.b.m(sbO, strM.startsWith(strM42) ? "" : strM42, strM);
        }
        return FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", strM);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replaceAll("(爱玩音乐网|视频下载说明|视频下载地址|www\\.2t58\\.com|MP3免费下载|LRC歌词下载|全部歌曲|\\[第\\d+页\\]|刷新|每日推荐|最新|热门|推荐|MV|高清|无损)", "").trim();
    }

    public static String c(String str) {
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 2);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void d() {
        String strM471 = "/";
        String strM408 = "/";
        try {
            if (System.currentTimeMillis() - f < 3000000) {
                return;
            }
            synchronized (e) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - f < 3000000) {
                        return;
                    }
                    String strW = X1.W(FishCrypto.v("N1.NZLbZ8VClfArEHAjHRbqHC5chMWFGwyuEWprWct9cPqttHTYXmmgNqOn1/5Gvw0d1CglOah1jtIQo6UG917d2mY+0AUuvz8+9nQT5IPBjaU=").concat(strM408), j(), d);
                    if (k(strW)) {
                        m(strW, FishCrypto.v("N1.NZLbZ8VClfArEHAjHRbqHC5chMWFGwyuEWprWct9cPqttHTYXmmgNqOn1/5Gvw0d1CglOah1jtIQo6UG917d2mY+0AUuvz8+9nQT5IPBjaU=").concat(strM471));
                    } else {
                        f = jCurrentTimeMillis;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArr = {"欢迎来访.*", "本站.*", ".*广告.*", "QQ群.*", ".*www\\..*", ".*http.*", ".*\\.com.*", ".*\\.cn.*", ".*\\.net.*", ".*音乐网.*", ".*提供.*", ".*下载.*"};
        StringBuilder sb = new StringBuilder();
        String strM108 = "\n";
        for (String str2 : str.split(strM108)) {
            if (Pattern.compile("^\\[\\d{2}:\\d{2}").matcher(str2).find()) {
                int i = 0;
                while (true) {
                    if (i >= 12) {
                        sb.append(str2);
                        sb.append(strM108);
                        break;
                    }
                    if (Pattern.compile(strArr[i], 2).matcher(str2).find()) {
                        break;
                    }
                    i++;
                }
            } else {
                sb.append(str2);
                sb.append(strM108);
            }
        }
        return sb.toString().trim();
    }

    public static String f(String str, HashMap map) {
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            return "";
        }
        d();
        AitingCookieJar aitingCookieJar = d;
        String strW = X1.W(strA, map, aitingCookieJar);
        if (!k(strW)) {
            return strW;
        }
        f = 0L;
        d();
        return X1.W(strA, map, aitingCookieJar);
    }

    public static String g(String str) {
        String strM31 = "/plug/down.php";
        String strM408 = "?";
        try {
            HashMap mapJ = j();
            StringBuilder sb = new StringBuilder(strM31);
            sb.append(str.isEmpty() ? "" : strM408.concat(str));
            String strA = a(sb.toString());
            if (TextUtils.isEmpty(strA)) {
                return "";
            }
            d();
            String strD = X1.D(strA, mapJ, d);
            if (!TextUtils.isEmpty(strD)) {
                return strD.trim();
            }
            String strF = f(strA, mapJ);
            if (!TextUtils.isEmpty(strF)) {
                try {
                    String strReplace = new JSONObject(strF).optString("url", "").replace("\\/", "/");
                    if (!TextUtils.isEmpty(strReplace)) {
                        return a(strReplace);
                    }
                } catch (Exception unused) {
                    if (strF.trim().startsWith("http")) {
                        return strF.trim();
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return "";
    }

    public static com.github.catvod.spider.merge.f0.g h(String str) throws Exception {
        String str2 = str;
        for (int i = 0; i < 2; i++) {
            try {
                String strA = a(str2);
                return X1.L(f(strA, j()), strA);
            } catch (Exception e2) {
                if (i == 1) {
                    throw e2;
                }
                Thread.sleep(100L);
            }
        }
        return X1.L("<html></html>", "");
    }

    public static ArrayList i(com.github.catvod.spider.merge.f0.g gVar) {
        ArrayList arrayList = new ArrayList();
        for (k kVar : gVar.Q(".play_list li, .song_list li, .music_list li, .video_list li")) {
            k kVarR = kVar.R("a");
            if (kVarR != null) {
                String strC = kVarR.c("href");
                String strA = a(strC);
                k kVarR2 = kVar.R(".name");
                String strB = b(kVarR2 != null ? kVarR2.T() : kVarR.T());
                if (!TextUtils.isEmpty(strB)) {
                    Matcher matcher = a.matcher(strC);
                    boolean zFind = matcher.find();
                    String strM70 = "0@@@@";
                    String strM486 = "$";
                    if (zFind) {
                        String str = FishCrypto.v("N1.NZLbZ8VClfArEHAjHRbqHC5chMWFGwyuEWprWct9cPqttHTYXmmgNqOn1/5Gvw0d1CglOah1jtIQo6UG917d2mY+0AUuvz8+9nQT5IPBjaU=") + "/plug/down.php?ac=music&lk=lrc&id=" + matcher.group(2);
                        StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strB, strM486);
                        sbP.append(c(strM70 + strA + "|||" + str));
                        arrayList.add(sbP.toString());
                    } else if (b.matcher(strC).find()) {
                        StringBuilder sbP2 = com.github.catvod.spider.merge.D.b.p(strB, strM486);
                        sbP2.append(c(strM70 + strA));
                        arrayList.add(sbP2.toString());
                    }
                }
            }
        }
        return arrayList;
    }

    public static HashMap j() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36");
        mapS.put("Referer", FishCrypto.v("N1.NZLbZ8VClfArEHAjHRbqHC5chMWFGwyuEWprWct9cPqttHTYXmmgNqOn1/5Gvw0d1CglOah1jtIQo6UG917d2mY+0AUuvz8+9nQT5IPBjaU=").concat("/"));
        mapS.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        mapS.put("Accept-Language", "zh-CN,zh;q=0.9");
        return mapS;
    }

    public static boolean k(String str) {
        return !TextUtils.isEmpty(str) && (str.contains("human_check") || str.contains("csrf_token") || str.contains("verify-box"));
    }

    public static ArrayList l(com.github.catvod.spider.merge.h0.d dVar, String str) {
        i iVar;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = dVar.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            k kVarR = kVar.R("a");
            if (kVarR != null) {
                String strC = kVarR.c("href");
                if (!TextUtils.isEmpty(strC) && !strC.equals("/") && !strC.contains("/user/") && !strC.contains("/login/") && !strC.contains("javascript")) {
                    k kVarR2 = kVar.R(".name");
                    String strT = kVarR2 != null ? kVarR2.T() : kVarR.c("title");
                    if (TextUtils.isEmpty(strT)) {
                        strT = kVarR.T();
                    }
                    String strB = b(strT);
                    if (!TextUtils.isEmpty(strB)) {
                        k kVarR3 = kVar.R("img");
                        String string = "";
                        if (kVarR3 != null) {
                            String strC2 = kVarR3.c("data-original");
                            if (TextUtils.isEmpty(strC2)) {
                                strC2 = kVarR3.c("data-src");
                            }
                            if (TextUtils.isEmpty(strC2)) {
                                strC2 = kVarR3.c("src");
                            }
                            if (!TextUtils.isEmpty(strC2)) {
                                string = a(strC2.replace("120", "500"));
                            }
                        }
                        if (TextUtils.isEmpty(string)) {
                            string = FishCrypto.v("N1.NZLbZ8VClfArEHAjHRbqHC5chMWFGwyuEWprWct9cPqttHTYXmmgNqOn1/5Gvw0d1CglOah1jtIQo6UG917d2mY+0AUuvz8+9nQT5IPBjaU=").concat("/images/logo.png");
                        }
                        com.github.catvod.spider.merge.p001b.k kVar2 = new com.github.catvod.spider.merge.p001b.k();
                        kVar2.n(a(strC));
                        kVar2.o(strB);
                        if (!TextUtils.isEmpty(string)) {
                            String url = ProxyOrigin.getUrl();
                            if (!TextUtils.isEmpty(url)) {
                                StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(url, "?do=aiting&type=img&url=");
                                try {
                                    string = URLEncoder.encode(string, "UTF-8");
                                } catch (Exception unused) {
                                }
                                sbP.append(string);
                                string = sbP.toString();
                            }
                            kVar2.p(string);
                        }
                        if (strC.contains("/singer/")) {
                            iVar = new i("oval", Float.valueOf(1.0f));
                        } else if (str.contains("/list/") || str.contains("/playtype/") || str.contains("/albumlist/")) {
                            iVar = new i("list", Float.valueOf(1.33f));
                        } else {
                            iVar = new i("rect", Float.valueOf(1.33f));
                        }
                        kVar2.h(iVar);
                        arrayList.add(kVar2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void m(String str, String str2) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            HashMap mapJ = j();
            String strM454 = "N1.NZLbZ8VClfArEHAjHRbqHC5chMWFGwyuEWprWct9cPqttHTYXmmgNqOn1/5Gvw0d1CglOah1jtIQo6UG917d2mY+0AUuvz8+9nQT5IPBjaU=";
            mapJ.put("Origin", FishCrypto.v(strM454));
            mapJ.put("Referer", str2);
            HashMap map = new HashMap();
            map.put("csrf_token", matcher.group(1));
            map.put("human_check", "on");
            X1.O(FishCrypto.v(strM454).concat("/"), map, mapJ, d);
            f = System.currentTimeMillis();
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

    public Object[] proxy(Map<String, String> map) {
        return !FishCrypto.businessReady() ? FishCrypto.blockedProxy() : $host$dca6c5e1c5a7de15(map);
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

package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0294s1;
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
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.C0359j;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
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
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.C0451c;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class DengFeng extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f27short = {1601, 2139, 2132, 2136, 2128, 2699, 2692, 2707, 2724, 2731, 2734, 2742, 2727, 2736, 2737, 3068, 3059, 3070, 3052, 3052, 3066, 3052, 24074, 28791, -31797, 21782, 2747, 2742, 31087, -28099, -29197, 23342, 2047, 2024, 2021, 2044, 2028, 29435, -26199, -26199, -28199, -31129, 20666, 2622, 1538, 1868, 1858, 1886, 802, 821, 867, 803, 804, 800, 854, 804, 802, 871, 825, 895, 818, 886, 871, 890, 830, 886, 871, 890, 878, 886, 876, 870, 892, 886, 871, 865, 892, 886, 894, 889, 803, 814, 2975, 2968, 2970, 2962, 1819, 1805, 1801, 1818, 1803, 1792, 1622, 1605, 2533, 2548, 2546, 2544, 1294, 1289, 1303, 952, 932, 937, 945, 941, 954, 2367, 2354, 740, 757, 742, 743, 753, 27879, 28020, 27962, 27428, 24694, 22341, -25261, -31835, 1487, 1474, 1478, 1475, 1474, 1493, 1492, 2698, 2726, 2726, 2722, 2720, 2732, 2177, 2229, 2228, 2216, 2223, 2226, 2217, 2234, 2209, 2228, 2217, 2223, 2222, 22529, 19904, 21374, 25085, -27245, -29934, 691, 731, 711, 711, 707, 704, 1119, 1110, 1099, 1108, 1112, 1101, 2563, 2588, 2577, 2576, 2586, 2650, 2573, 2648, 2584, 2580, 2561, 2567, 2586, 2566, 2590, 2580, 1869, 1874, 1887, 1886, 1876, 1812, 1878, 1867, 1801, 1871, 2793, 2808, 2808, 2788, 2785, 2795, 2793, 2812, 2785, 2791, 2790, 2727, 2800, 2725, 2789, 2808, 2797, 2799, 2781, 2778, 2756, 2379, 2394, 2394, 2374, 2371, 2377, 2379, 2398, 2371, 2373, 2372, 2309, 2382, 2379, 2393, 2370, 2305, 2386, 2375, 2374, 2768, 2767, 2754, 2755, 2761, 2697, 2763, 2774, 2706, 1197, 1202, 1215, 1214, 1204, 1268, 1187, 1270, 1213, 1207, 1197, 24375, 19190, 28057, 23210, -28484, -29110, 1391, 1400, 1400, 1381, 1400, 1067, 1067, 1067, 2253, 2240, 22699, 30109, 28637, -29668, 18912, 32160, 1236, 1237, 1220, 1233, 1241, 1244, 937, 944, 955, 816, 821, 818, 825, 815, 31962, -28790, -29278, 23423, 1947, 1934, 1943, 1933, 1937, 1946, 1947, 1933, -26936, -28665, -30458, 24539, 737, 750, 738, 746, 1414, 1425, 1501, 1415, 1408, 1412, 1525, 1421, 1418, 1522, 1501, 1523, 1408, 1412, -28030, -27571, 27276, -30387, -26734, -30364, 664, 1945, 24755, 25553, 21982, 29465, -27080, -28425, 28756, -27693, 2356, 2345, 2340, 633, 616, 622, 620, 1836, 1827, 1838, 1852, 1852, 1783, 1764, 1779, 1783, 1765, 1768, 1767, 1774, 1899, 1911, 1907, 1888, 1437, 1434, 1423, 1436, 2512, 2525, 2502, 2513, 2519, 2496, 2523, 2502, 531, 532, 513, 532, 517, 407, 388, 403, 402, 392, 398, 399, 2357, 2344, 2366, 2367, 2344, 1226, 1224, 1245, 1228, 1230, 1222, 1243, 1232, 1095, 1117, 1073, 1094, 1149, 1073, 1126, 1068, 1073, 1061, 1079, 1075, 1089, 1078, 1057, 1127, 1068, 1072, 1070, 1121, 27393, 24769, 836, 806, 773, 791, 769, 850, 848, 836, 27480, 23659, -27011, -30581, 29001, -27954, -2790, 31991, 32122, -30639, 28644, 23191, -29053, -854, -30639, 31147, 22440, -28053, -30605, 27611, 23453, 27918, 27408, 20858, 31864, 20815, -31397, -30583, 28476, 23114, -29511, 23129, 2203, 2199, 2198, 2188, 2205, 2198, 2188, 2261, 2196, 2205, 2198, 2207, 2188, 2192, 3191, 3185, 3170, 3181, 3184, 3173, 3174, 3185, 3118, 3174, 3181, 3168, 3180, 3175, 3178, 3181, 3172, 903, 896, 924, 923, 2475, 2471, 2470, 2470, 2477, 2475, 2492, 2465, 2471, 2470, 2400, 2402, 2431, 2408, 2409, 2365, 2417, 2405, 2404, 2424, 2431, 2402, 2425, 2410, 2417, 2404, 2425, 2431, 2430, -29512, 27405, 24187, 23576, 27898, -28074, -29536, 1810, 1822, 1822, 1818, 1816, 1812, 1892, 1904, 1905, 1901, 1898, 1911, 1900, 1919, 1892, 1905, 1900, 1898, 1899, 2140, 2138, 2124, 2139, 2052, 2120, 2126, 2124, 2119, 2141, 2897, 2886, 2885, 2886, 2897, 2886, 2897, 2891, 2902, 2893, 2883, 2893, 2890, 1510, 1508, 1508, 1506, 1527, 1523, 2426, 2424, 2424, 2430, 2411, 2415, 2358, 2430, 2421, 2424, 2420, 2431, 2418, 2421, 2428, 22224, 17169, -30795, 24576, 21878, -26277, -30803, 27768, 26552, 24941, 24394, 27681, 23314, -28412, -28686, 25243, 26971, 28558, 20905, -30211, 23562, -24601, -32495, 25237, 26965, 2768, 2746, 2723, 2751, 2750, 2768, 25292, 22015, -24599, -32481, 2497, 2516, 2516, 2120, 809, 824, 830, 828, 2379, 2394, 2396, 2398, 2392, 2388, 2382, 2389, 2383, 2442, 2447, 2443, 2447, 2450, 1052, 1031, 1052, 1033, 1028, 1430, 1445, 1450, 1443, 1441, 2586, 2589, 2563, 2794, 2791, 2787, 2790, 2791, 2800, 2801, 2397, 2388, 2377, 2390, 2394, 2383, 386, 430, 430, 426, 424, 420, 2702, 2746, 2747, 2727, 2720, 2749, 2726, 2741, 2734, 2747, 2726, 2720, 2721, -29132, 27009, 21550, 26285, -27965, -29630, 1507, 1419, 1431, 1431, 1427, 1424, 1810, 1840, 1840, 1846, 1827, 1831, 1918, 1814, 1853, 1840, 1852, 1847, 1850, 1853, 1844, 837, 840, 841, 834, 856, 837, 856, 853, 25713, 28593, 22339, 26529, 25640, 21275, -26355, -30725, 972, 987, 919, 973, 970, 974, 959, 952, 924, 980, 980, 969, 952, 924, 982, 980, 952, 924, 979, 898, 953, 970, 974, 24212, 24292, 24984, 22187, -25411, -32181, 730, 725, 729, 721, 809, 816, 826, 266, 285, 277, 281, 266, 275, 2643, 2639, 2635, 2648, 1015, 996, 1011, 1015, 2660, 2665, 2656, 2677, 2854, 2852, 2867, 2856, 2869, 1578, 1575, 1596, 1579, 1581, 1594, 1569, 1596, 2232, 2228, 2229, 2223, 2238, 2229, 2223, 2027, 1940, 1931, 2012, 2044, 2038, 2019, 1938, 2025, 1996, 1936, 2001, 2037, 2001, 2037, 2035, 2027, 1941, 2003, 2025, 1999, 1941, 1948, 2026, 2006, 1934, 1948, 1992, 1997, 2000, 1986, 2036, 1990, 1988, 1984, 1995, 2013, 2036, 2036, 1949, 2026, 1985, 1993, 1986, 2045, 2006, 2017, 2006, 2003, 2039, 2031, 1943, 1990, 1998, 2013, 1984, 1995, 2032, 1949, 1992, 2006, 1943, 1934, 1938, 2029, 1988, 1942, 1930, 1941, 2027, 2045, 2025, 2032, 2003, 1999, 1993, 2037, 1939, 2029, 1992, 2007, 2036, 2036, 2012, 2001, 1988, 1994, 1988, 1995, 1990, 2038, 1984, 1992, 2000, 1986, 2038, 2035, 1993, 2000, 2025, 2013, 1949, 1937, 1990, 2018, 2030, 2020, 2018, 2019, 1994, 1944, 3284, 3243, 3252, 3274, 3295, 3306, 3253, 3326, 3276, 3293, 3287, 3323, 3325, 3326, 3285, 3294, 3304, 3267, 3284, 3295, 3275, 3285, 3294, 3326, 3298, 3266, 3319, 3249, 3286, 3317, 3292, 3316, 3278, 3275, 3278, 3319, 3292, 3264, 3324, 3241, 3310, 3318, 3325, 3310, 3277, 3298, 3296, 3284, 3266, 3267, 3286, 3326, 3327, 3326, 3242, 3264, 3325, 3317, 3278, 3266, 3241, 3266, 3304, 3249, 3281, 3327, 3264, 3278, 3280, 3274, 3264, 3307, 3316, 3304, 
    3293, 3324, 3244, 3234, 3296, 3266, 3275, 3243, 3280, 3276, 3247, 3321, 3288, 3272, 3324, 3276, 3325, 3299, 3321, 3311, 3314, 3278, 3312, 3267, 3288, 3274, 3284, 3247, 3273, 3319, 3282, 3327, 3327, 3240, 3296, 3279, 3239, 2816, 2943, 2912, 2838, 2913, 2841, 2854, 2936, 2860, 2826, 2846, 2857, 2857, 2821, 2941, 2846, 2852, 2849, 2941, 2823, 2853, 2816, 2936, 2839, 2937, 2818, 2843, 2940, 2941, 2844, 2852, 2843, 2819, 2859, 2872, 2818, 2861, 2822, 2843, 2829, 2824, 2845, 2824, 2877, 2938, 2937, 2839, 2934, 2823, 2855, 2860, 2872, 2842, 2817, 2822, 2934, 2854, 2838, 2851, 2831, 2851, 2840, 2844, 2936, 2873, 2819, 2942, 2847, 2817, 2829, 2840, 2934, 2849, 2828, 2844, 2879, 2855, 2818, 2819, 2855, 2841, 2872, 2854, 2875, 2935, 2936, 2818, 2856, 2849, 2859, 2861, 2855, 2878, 2819, 2839, 2879, 2942, 2821, 2854, 2938, 2858, 2824, 2846, 2878, 2913, 2825, 2859, 2851, 2851, 2819, 2931, 2376, 2359, 2344, 2383, 2381, 2409, 2401, 2368, 2387, 2378, 2382, 2404, 2396, 2355, 2409, 2390, 2423, 2403, 2407, 2376, 2402, 2414, 2389, 2404, 2398, 2372, 2382, 2345, 2414, 2386, 2396, 2385, 2407, 2405, 2371, 2372, 2413, 2411, 2368, 2408, 2367, 2375, 2414, 2430, 2403, 2402, 2415, 2404, 2416, 2385, 2387, 2354, 2416, 2379, 2345, 2376, 2404, 2378, 2382, 2352, 2378, 2409, 2379, 2388, 2354, 2371, 2407, 2411, 2402, 2428, 2379, 2370, 2402, 2414, 2388, 2353, 2391, 2371, 2375, 2385, 2402, 2409, 2417, 2417, 2408, 2402, 2413, 2359, 2354, 2366, 2401, 2359, 2382, 2412, 2414, 2358, 2383, 2401, 2405, 2414, 2418, 2353, 2345, 2370, 2370, 2373, 2430, 2419, 2345, 2385, 2396, 2428, 2412, 2405, 2422, 2357, 2381, 2379, 2414, 2403, 2390, 2356, 2356, 2417, 2354, 2378, 2404, 2386, 2414, 2376, 2356, 25467, 26811, -32535, 26460, 22974, 20696, 21039, -31173, 314, 312, 302, 290, 305, 290, 308, 316, 318, 313, 304, 24694, 27574, -31772, 25681, -30764, 20788, 1478, 1508, 1508, 1506, 1527, 1523, 1450, 1474, 1513, 1508, 1512, 1507, 1518, 1513, 1504, 771, 782, 783, 772, 798, 771, 798, 787, 2432, 2449, 2449, 2445, 2440, 2434, 2432, 2453, 2440, 2446, 2447, 2510, 2443, 2450, 2446, 2447, 2522, 2497, 2434, 2441, 2432, 2451, 2450, 2436, 2453, 2524, 2452, 2453, 2439, 2508, 2521, 27901, 26429, 25493, 22073, 25114, 19093, 22391, 29104, 24903, 27271, 20532, 24534, 21109, 25239, -25541, -32051, 25610, 28618, 22441, 27112, -26250, -30848, 25664, 28544, 22760, 21169, -31290, 22499, 21780, -32512, 464, 468, 2680, 2671, 2671, 2674, 2671, 28236, 25996, 24868, 21640, -27856, -29242, 3112, 3133, 3133, 379, 462, 1437, 1432, 1421, 1432, -30807, 24604, 20908, 24456, 25046, 28232, 30343, 25294, 20548, 27508, 24131, 21909, 24392, -29640, 27533, -30134, 25145, 1027, 1025, 1044, 1029, 1031, 1039, 1042, 1049, 1059, 1039, 1038, 1044, 1029, 1038, 1044, 3017, 3016, 3033, 3020, 3012, 3009, 3054, 3010, 3011, 3033, 3016, 3011, 3033, 3283, 3284, 3265, 3284, 3285, 3283, 589, 585, 1397, 1399, 1376, 1405, 1403, 1402, 3136, 3138, 3157, 3136, 3153, 3138, 3157, 999, 1015, 1009, 1018, 1009, 468, 453, 470, 453, 457, 471, 27844, 26372, 28612, -25083, -29850, 23995, 1133, 1135, 1128, 1122, 3321, 3310, 3320, 3326, 3303, 3327, 1806, 1801, 1815, 2133, 2140, 2113, 2142, 2130, 2119, 2517, 2520, 2524, 2521, 2520, 2511, 2510, 21070, 18319, 24800, 22483, 18129, 18140, -30424, 1226, 1239, 1245, 1237, 1243, 1226, 25331, 26931, 29694, 27128, -24689, -32391, 848, 860, 861, 832, 838, 862, 854, 1672, 1674, 1687, 1690, 1693, 3286, 3265, 3285, 3281, 3265, 3287, 3280, 24948, 27316, 25204, -27723, -25592, -32002, 763, 755, 738, 766, 761, 754, 1403, 1398, 1405, 1376, 1350, 1403, 1327, 1325, 3006, 3004, 2989, 2632, 2647, 2635, 2636, -31917, 25830, 27933, 25713, -25155, -31925, 317, 319, 302, 346, -30067, 27960, 20009, -27549, -30059, 3239, 3243, 3242, 3248, 3233, 3242, 3248, 3305, 3248, 3261, 3252, 3233, 2488, 2484, 2485, 2479, 2494, 2485, 2479, 2550, 2494, 2485, 2488, 2484, 2495, 2482, 2485, 2492, 2814, 2813, 2801, 2803, 2790, 2811, 2813, 2812, 2222, 2227, 2231, 2239, 2229, 2223, 2222, 1890, 1892, 2505, 2511, 2524, 2515, 2510, 2509, 2514, 2511, 2505, 2530, 2520, 2511, 2511, 2514, 2511, -29335, 27356, -30375, 24505, 23553, 22104, -30965, 20971, 26025, 21999, 28015, 25483, -30261, 24363, 2500, 2499, 2497, 2505, 2543, 2499, 2498, 2520, 2505, 2498, 2520, 1410, 1413, 1415, 1423, 1468, 1411, 1422, 1423, 1413, 1449, 1413, 1412, 1438, 1423, 1412, 1438, 3320, 1809, 1804, 1792, 1876, 18865, -27079, 30746, 1876, 1828, 1852, 1828, 1876, 20548, 20532, 3081, 3093, 3093, 3089, 3163, 3150, 3150, 2715, 2695, 2695, 2691, 2688, 2761, 2780, 2780, 2619, 2595, 2619, 2635, 23899, 23851, 25175, 21860, -24718, -32380, 1552, 1557, 1551, 1544, 20730, -30075, -29398, 23498, 3192, 3189, 395, 410, 412, 414, 2880, 2897, 2903, 2901, 2899, 2911, 2885, 2910, 2884, 2904, 2909, 2905, 2909, 2880, 2416, 2411, 2416, 2405, 2408, 2531, 2512, 2527, 2518, 2516, 2060, 2071, 2074, 2059, 2077, 2131, 2142, 2115, 2134, 2143, 2135, 2143, 21049, 18424, -31400, -30777, -30868, 20913, 1021, 990, 978, 976, 965, 984, 990, 991, 23746, 18691, -29789, -30404, 20832, 20752, -27831, -29249, 20832, 17569, -31231, -31586, 22717, -32676, -24853, -32739, 1210, 1174, 1174, 1170, 1168, 1180, 1909, 1857, 1856, 1884, 1883, 1862, 1885, 1870, 1877, 1856, 1885, 1883, 1882, 21272, 18137, 24250, 24266, 28424, 18311, 23141, 31906, 740, 642, 671, 659, 650, 756, 658, 1323, 1338, 1338, 1318, 1315, 1321, 1323, 1342, 1315, 1317, 1316, 1381, 1330, 1383, 1319, 1338, 1327, 1325, 1311, 1304, 1286, 1224, 1247, 1171, 1225, 1230, 1226, 1244, 1224, 1247, 1242, 1211, 1185, 1229, 1210, 1153, 1229, 1178, 1232, 1229, 1241, 1215, 1213, 1227, 1242, 1225, 1247, 1197, 1200, 1188, 1224, 1247, 1242, 1212, 1171, 1180, 1246, 1225, 1230, 1226, 1280, 1297, 1297, 1293, 1288, 1282, 1280, 1301, 1288, 1294, 1295, 1358, 1285, 1280, 1298, 1289, 1354, 1305, 1292, 1293, 1321, 1339, 1334, 1343, 2730, 2741, 2744, 2745, 2739, 2803, 2737, 2732, 2792, 1619, 1612, 1601, 1600, 1610, 1546, 1629, 1544, 1603, 1609, 1619, 756, 747, 742, 743, 749, 685, 762, 687, 751, 739, 758, 752, 749, 753, 745, 739, 2236, 2211, 2222, 2223, 2213, 2277, 2215, 2234, 2296, 2238, 22264, 17209, 25686, 21349, 27456, -30804, 24129, 1451, 1463, 1466, 1442, 1470, 1449, 1432, 1460, 1461, 
    1455, 1470, 1461, 1455, 2659, 2677, 2673, 2658, 2675, 2680, 2643, 2687, 2686, 2660, 2677, 2686, 2660, 507, 493, 489, 506, 491, 480, 459, 487, 486, 508, 493, 486, 508};
    public volatile Session a;

    final class Failure extends IOException {
        public Failure(String str) {
            super(str);
        }
    }

    final class Reply {
        public final int a;
        public final Headers b;
        public final byte[] c;

        public Reply(int i, Headers headers, byte[] bArr) {
            this.a = i;
            this.b = headers;
            this.c = bArr;
        }
    }

    final class Session {
        public final String a;
        public final HashSet b = new HashSet();
        public final OkHttpClient c;
        public volatile boolean d;

        public Session(String str) {
            OkHttpClient.Builder builderRetryOnConnectionFailure = new OkHttpClient.Builder().proxy(java.net.Proxy.NO_PROXY).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(false);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.c = builderRetryOnConnectionFailure.connectTimeout(6L, timeUnit).readTimeout(12L, timeUnit).writeTimeout(12L, timeUnit).addNetworkInterceptor(new C0451c(2)).build();
            this.a = str;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0085.m339(f27short, 0, 1, 1648));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        ArrayList arrayList;
        DengFeng dengFeng = this;
        String strM516 = C0130.m516(f27short, 1, 4, 2101);
        Session session = dengFeng.a;
        long jD = d();
        try {
            JSONObject jSONObjectF = f(session, C0009.m33(f27short, 5, 3, 2789), new JSONObject(), jD);
            JSONObject jSONObject2 = jSONObjectF.getJSONObject(C0070.m277(f27short, 8, 7, 2754));
            JSONArray jSONArray2 = jSONObjectF.getJSONArray(C0091.m360(f27short, 15, 7, 2975));
            j(C0104.m414(f27short, 22, 4, 3084), jSONArray2.length() <= 64);
            ArrayList arrayList2 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            while (i < jSONArray2.length()) {
                try {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                    String strS = s(C0093.m368(f27short, 26, 2, 2770), jSONObject3);
                    arrayList2.add(new com.github.catvod.spider.merge.p001b.b(strS, i(s(strM516, jSONObject3)), null));
                    if (z) {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray(strS);
                        j(C0115.m459(f27short, 28, 4, 564), jSONArray3.length() <= 32);
                        ArrayList arrayList3 = new ArrayList();
                        int i2 = 0;
                        while (i2 < jSONArray3.length()) {
                            JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
                            JSONArray jSONArray4 = jSONObject4.getJSONArray(C0059.m234(f27short, 32, 5, 1929));
                            JSONArray jSONArray5 = jSONArray2;
                            JSONObject jSONObject5 = jSONObject2;
                            j(C0089.m355(f27short, 37, 6, 2464), jSONArray4.length() <= 10000);
                            ArrayList arrayList4 = new ArrayList();
                            JSONArray jSONArray6 = jSONArray3;
                            int i3 = 0;
                            while (i3 < jSONArray4.length()) {
                                JSONObject jSONObject6 = jSONArray4.getJSONObject(i3);
                                arrayList4.add(new com.github.catvod.spider.merge.p001b.c(i(s(C0045.m177(f27short, 43, 1, 2640), jSONObject6)), s(C0097.m386(f27short, 44, 1, 1652), jSONObject6)));
                                i3++;
                                jSONArray4 = jSONArray4;
                                arrayList2 = arrayList2;
                            }
                            arrayList3.add(new com.github.catvod.spider.merge.p001b.d(s(C0043.m169(f27short, 45, 3, 1831), jSONObject4), i(s(strM516, jSONObject4)), arrayList4));
                            i2++;
                            jSONArray2 = jSONArray5;
                            jSONObject2 = jSONObject5;
                            jSONArray3 = jSONArray6;
                            arrayList2 = arrayList2;
                        }
                        jSONArray = jSONArray2;
                        jSONObject = jSONObject2;
                        arrayList = arrayList2;
                        linkedHashMap.put(strS, arrayList3);
                    } else {
                        jSONArray = jSONArray2;
                        jSONObject = jSONObject2;
                        arrayList = arrayList2;
                    }
                    i++;
                    dengFeng = this;
                    jSONArray2 = jSONArray;
                    jSONObject2 = jSONObject;
                    arrayList2 = arrayList;
                } catch (Exception e) {
                    e = e;
                    return com.github.catvod.spider.merge.p001b.g.d(e(e));
                }
            }
            ArrayList arrayList5 = arrayList2;
            try {
                dengFeng.c(session, jD);
                return com.github.catvod.spider.merge.p001b.g.v(arrayList5, linkedHashMap);
            } catch (Exception e2) {
                e = e2;
                return com.github.catvod.spider.merge.p001b.g.d(e(e));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        try {
            return t(str).encodedPath().matches(C0117.m467(f27short, 48, 34, 778));
        } catch (Exception unused) {
            return false;
        }
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        Session session = this.a;
        long jD = d();
        try {
            return n(session, f(session, C0089.m355(f27short, 82, 4, 3063), new JSONObject(), jD), jD);
        } catch (Exception e) {
            return o(e, 1);
        }
    }

    private /* synthetic */ boolean $host$53940b53855fde82() {
        return false;
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int iMax;
        String str3 = str;
        Session session = this.a;
        long jD = d();
        try {
            iMax = (int) Math.max(1L, Math.min(1000000L, Long.parseLong(str2.trim())));
        } catch (Exception unused) {
            iMax = 1;
        }
        try {
            String strM175 = C0044.m175(f27short, 86, 6, 1896);
            JSONObject jSONObject = new JSONObject();
            String strM427 = C0107.m427(f27short, 92, 2, 1569);
            if (str3 == null) {
                str3 = "";
            }
            return n(session, f(session, strM175, jSONObject.put(strM427, str3).put(C0112.m445(f27short, 94, 4, 2453), iMax), jD), jD);
        } catch (Exception e) {
            return o(e, iMax);
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strM467 = C0117.m467(f27short, 98, 3, 1403);
        Session session = this.a;
        long jD = d();
        try {
            JSONObject jSONObjectF = f(session, C0056.m223(f27short, 101, 6, 968), new JSONObject().put(C0093.m368(f27short, 107, 2, 2390), str2), jD);
            boolean z = true;
            j(C0030.m116(f27short, 114, 8, 2122), k(0, C0079.m314(f27short, 109, 5, 660), jSONObjectF) == 0);
            HttpUrl httpUrlT = t(s(strM467, jSONObjectF));
            Headers headersH = h(jSONObjectF.getJSONObject(C0101.m402(f27short, 122, 7, 1447)), true);
            if (!httpUrlT.isHttps() && (headersH.get(C0125.m499(f27short, 129, 6, 2761)) != null || headersH.get(C0043.m169(f27short, 135, 13, 2240)) != null)) {
                z = false;
            }
            j(C0093.m368(f27short, 148, 12, 659), z);
            String strS = s(C0112.m445(f27short, 160, 6, 1081), jSONObjectF);
            j(C0079.m314(f27short, 253, 6, 1445), Arrays.asList(C0032.m126(f27short, 192, 21, 2696), C0063.m249(f27short, 213, 20, 2346), C0091.m360(f27short, 233, 9, 2726), C0018.m70(f27short, 242, 11, 1243), C0001.m1(f27short, 166, 16, 2677), C0090.m358(f27short, 182, 10, 1851)).contains(strS));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < headersH.size(); i++) {
                linkedHashMap.put(headersH.name(i), headersH.value(i));
            }
            c(session, jD);
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.q(0);
            gVar.C(httpUrlT.toString());
            gVar.h(linkedHashMap);
            gVar.f(strS);
            return gVar.r();
        } catch (Exception e) {
            String strE = e(e);
            return new JSONObject(com.github.catvod.spider.merge.p001b.g.d(strE)).put(strM467, "").put(C0117.m467(f27short, 259, 5, 1290), strE).toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:13:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:19:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:25:0x0133 A[Catch: Exception -> 0x0167, TRY_ENTER, TryCatch #2 {Exception -> 0x0167, blocks: (B:17:0x00dc, B:21:0x0100, B:22:0x011a, B:25:0x0133, B:27:0x0143, B:29:0x014e, B:36:0x016f, B:37:0x01bd, B:39:0x01c5, B:40:0x01e8, B:41:0x01f3), top: B:52:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0143 A[Catch: Exception -> 0x0167, TryCatch #2 {Exception -> 0x0167, blocks: (B:17:0x00dc, B:21:0x0100, B:22:0x011a, B:25:0x0133, B:27:0x0143, B:29:0x014e, B:36:0x016f, B:37:0x01bd, B:39:0x01c5, B:40:0x01e8, B:41:0x01f3), top: B:52:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:34:0x016c  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c5 A[Catch: Exception -> 0x0167, TryCatch #2 {Exception -> 0x0167, blocks: (B:17:0x00dc, B:21:0x0100, B:22:0x011a, B:25:0x0133, B:27:0x0143, B:29:0x014e, B:36:0x016f, B:37:0x01bd, B:39:0x01c5, B:40:0x01e8, B:41:0x01f3), top: B:52:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01bd A[EDGE_INSN: B:57:0x01bd->B:37:0x01bd BREAK  A[LOOP:1: B:22:0x011a->B:36:0x016f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x003f  */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        boolean z;
        JSONArray jSONArray;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        boolean z3;
        ArrayList arrayList3;
        int i2;
        int length;
        JSONArray jSONArray3;
        String strM463;
        String strS;
        String str;
        boolean z4;
        DengFeng dengFeng = this;
        String strM21 = C0006.m21(f27short, 264, 3, 1039);
        String strM570 = C0143.m570(f27short, 267, 2, 2212);
        Session session = dengFeng.a;
        long jD = d();
        if (list == null) {
            z = false;
            j(C0079.m314(f27short, 269, 6, 2010), z);
            JSONObject jSONObjectF = f(session, C0125.m499(f27short, 275, 6, 1200), new JSONObject().put(strM570, list.get(0)), jD);
            JSONObject jSONObject2 = jSONObjectF.getJSONObject(C0082.m325(f27short, 281, 3, 991));
            k kVarU = u(s(strM570, jSONObject2), jSONObject2);
            jSONArray = jSONObjectF.getJSONArray(C0026.m102(f27short, 284, 5, 860));
            if (jSONArray.length() <= 64) {
                z2 = true;
            } else {
                z2 = false;
            }
            j(C0073.m288(f27short, 289, 4, 613), z2);
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            i = 0;
            while (i < jSONArray.length()) {
                jSONObject = jSONArray.getJSONObject(i);
                jSONArray2 = jSONObject.getJSONArray(C0028.m108(f27short, 293, 8, 2046));
                if (jSONArray2.length() <= 10000) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                j(C0098.m390(f27short, 301, 4, 1729), z3);
                arrayList3 = new ArrayList();
                i2 = 0;
                while (true) {
                    length = jSONArray2.length();
                    jSONArray3 = jSONArray;
                    strM463 = C0116.m463(f27short, 305, 4, 655);
                    if (i2 < length) {
                        break;
                        break;
                    }
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    JSONArray jSONArray4 = jSONArray2;
                    strS = s(strM570, jSONObject3);
                    if (strS.isEmpty()) {
                        str = strM570;
                    } else {
                        str = strM570;
                        if (strS.length() > 200000) {
                        }
                        j(C0059.m234(f27short, 323, 6, 651), z4);
                        arrayList3.add(i(s(strM463, jSONObject3)) + C0074.m292(f27short, 329, 1, 700) + strS);
                        i2++;
                        jSONArray = jSONArray3;
                        jSONArray2 = jSONArray4;
                        strM570 = str;
                    }
                    z4 = false;
                    j(C0059.m234(f27short, 323, 6, 651), z4);
                    arrayList3.add(i(s(strM463, jSONObject3)) + C0074.m292(f27short, 329, 1, 700) + strS);
                    i2++;
                    jSONArray = jSONArray3;
                    jSONArray2 = jSONArray4;
                    strM570 = str;
                }
                String str2 = strM570;
                if (!arrayList3.isEmpty()) {
                    arrayList.add(i(s(strM463, jSONObject)));
                    arrayList2.add(TextUtils.join(C0109.m432(f27short, 330, 1, 1978), arrayList3));
                }
                i++;
                dengFeng = this;
                jSONArray = jSONArray3;
                strM570 = str2;
            }
            j(C0120.m477(f27short, 331, 6, 1585), !arrayList.isEmpty());
            C0294s1.e(arrayList, arrayList2);
            C0294s1.c(C0135.m539(f27short, 337, 2, 2845), arrayList);
            kVarU.q(TextUtils.join(strM21, arrayList));
            kVarU.r(TextUtils.join(strM21, arrayList2));
            c(session, jD);
            return com.github.catvod.spider.merge.p001b.g.s(kVarU);
        }
        try {
            if (list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            j(C0079.m314(f27short, 269, 6, 2010), z);
            JSONObject jSONObjectF2 = f(session, C0125.m499(f27short, 275, 6, 1200), new JSONObject().put(strM570, list.get(0)), jD);
            JSONObject jSONObject4 = jSONObjectF2.getJSONObject(C0082.m325(f27short, 281, 3, 991));
            k kVarU2 = u(s(strM570, jSONObject4), jSONObject4);
            jSONArray = jSONObjectF2.getJSONArray(C0026.m102(f27short, 284, 5, 860));
            if (jSONArray.length() <= 64) {
                z2 = true;
            } else {
                z2 = false;
            }
            j(C0073.m288(f27short, 289, 4, 613), z2);
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            i = 0;
            while (i < jSONArray.length()) {
                try {
                    jSONObject = jSONArray.getJSONObject(i);
                    jSONArray2 = jSONObject.getJSONArray(C0028.m108(f27short, 293, 8, 2046));
                    if (jSONArray2.length() <= 10000) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    j(C0098.m390(f27short, 301, 4, 1729), z3);
                    arrayList3 = new ArrayList();
                    i2 = 0;
                    while (true) {
                        length = jSONArray2.length();
                        jSONArray3 = jSONArray;
                        strM463 = C0116.m463(f27short, 305, 4, 655);
                        if (i2 < length) {
                            break;
                        }
                        JSONObject jSONObject5 = jSONArray2.getJSONObject(i2);
                        JSONArray jSONArray5 = jSONArray2;
                        strS = s(strM570, jSONObject5);
                        if (strS.isEmpty()) {
                            str = strM570;
                            if (strS.length() > 200000 && !strS.matches(C0018.m70(f27short, 309, 14, 1454))) {
                                z4 = true;
                            }
                            j(C0059.m234(f27short, 323, 6, 651), z4);
                            arrayList3.add(i(s(strM463, jSONObject5)) + C0074.m292(f27short, 329, 1, 700) + strS);
                            i2++;
                            jSONArray = jSONArray3;
                            jSONArray2 = jSONArray5;
                            strM570 = str;
                        } else {
                            str = strM570;
                        }
                        z4 = false;
                        j(C0059.m234(f27short, 323, 6, 651), z4);
                        arrayList3.add(i(s(strM463, jSONObject5)) + C0074.m292(f27short, 329, 1, 700) + strS);
                        i2++;
                        jSONArray = jSONArray3;
                        jSONArray2 = jSONArray5;
                        strM570 = str;
                    }
                    String str3 = strM570;
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(i(s(strM463, jSONObject)));
                        arrayList2.add(TextUtils.join(C0109.m432(f27short, 330, 1, 1978), arrayList3));
                    }
                    i++;
                    dengFeng = this;
                    jSONArray = jSONArray3;
                    strM570 = str3;
                } catch (Exception e) {
                    e = e;
                }
            }
            j(C0120.m477(f27short, 331, 6, 1585), !arrayList.isEmpty());
            C0294s1.e(arrayList, arrayList2);
            C0294s1.c(C0135.m539(f27short, 337, 2, 2845), arrayList);
            kVarU2.q(TextUtils.join(strM21, arrayList));
            kVarU2.r(TextUtils.join(strM21, arrayList2));
            try {
                c(session, jD);
                return com.github.catvod.spider.merge.p001b.g.s(kVarU2);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        return com.github.catvod.spider.merge.p001b.g.d(e(e));
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int iMax;
        Session session = this.a;
        long jD = d();
        try {
            iMax = (int) Math.max(1L, Math.min(1000000L, Long.parseLong(str2.trim())));
        } catch (Exception unused) {
            iMax = 1;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put(C0106.m422(f27short, 339, 3, 2368), str).put(C0076.m301(f27short, 342, 4, 521), iMax);
            String[] strArr = {C0142.m567(f27short, 346, 5, 1871), C0104.m414(f27short, 351, 4, 1686), C0030.m116(f27short, 355, 4, 1673), C0098.m390(f27short, 359, 4, 1810), C0076.m301(f27short, 363, 4, 1518), C0011.m42(f27short, 367, 8, 2484), C0026.m102(f27short, 375, 5, 608), C0008.m31(f27short, 380, 7, 481), C0106.m422(f27short, 387, 5, 2394)};
            for (int i = 0; i < 9; i++) {
                String str3 = strArr[i];
                if (map != null && map.get(str3) != null) {
                    jSONObjectPut.put(str3, map.get(str3));
                }
            }
            return n(session, f(session, C0090.m358(f27short, 392, 8, 1193), jSONObjectPut, jD), jD);
        } catch (Exception e) {
            return o(e, iMax);
        }
    }

    public static byte[] b(int i, String str) throws Failure {
        boolean z = false;
        boolean z2 = ((long) str.length()) <= ((((long) i) + 2) / 3) * 4 && str.matches(C0074.m292(f27short, 400, 20, 1052));
        String strM368 = C0093.m368(f27short, 420, 14, 868);
        j(strM368, z2);
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode.length <= i && Base64.encodeToString(bArrDecode, 2).equals(str)) {
            z = true;
        }
        j(strM368, z);
        return bArrDecode;
    }

    public static long d() {
        return TimeUnit.SECONDS.toNanos(45L) + System.nanoTime();
    }

    public static String e(Exception exc) {
        String strM471;
        StringBuilder sb = new StringBuilder(C0117.m467(f27short, 434, 3, 2560));
        if (exc instanceof Failure) {
            strM471 = exc.getMessage();
        } else {
            strM471 = exc instanceof IOException ? C0118.m471(f27short, 437, 12, 934) : C0122.m486(f27short, 449, 8, 2174);
        }
        sb.append(strM471);
        return sb.toString();
    }

    public static Headers h(JSONObject jSONObject, boolean z) throws Failure {
        j(C0120.m477(f27short, 457, 5, 894), jSONObject.toString().length() <= 16384);
        Headers.Builder builder = new Headers.Builder();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String lowerCase = next.toLowerCase(Locale.ROOT);
            j(C0030.m116(f27short, 526, 7, 1871), !Arrays.asList(C0010.m36(f27short, 493, 4, 1007), C0049.m193(f27short, 462, 14, 2296), C0104.m414(f27short, 476, 17, 3075), C0045.m177(f27short, 497, 10, 2504), C0026.m102(f27short, 507, 19, 2320)).contains(lowerCase));
            if (z) {
                j(C0091.m360(f27short, 596, 7, 3138), Arrays.asList(C0010.m36(f27short, 552, 10, 2089), C0093.m368(f27short, 562, 7, 2851), C0126.m503(f27short, 569, 6, 2852), C0122.m486(f27short, 533, 6, 1905), C0117.m467(f27short, 539, 13, 1797), C0089.m355(f27short, 575, 6, 1415), C0133.m529(f27short, 581, 15, 2331)).contains(lowerCase));
            }
            builder.set(next, s(next, jSONObject));
        }
        return builder.build();
    }

    public static String i(String str) {
        return str.replace('$', (char) 65284).replace('#', (char) 65283).replace('\r', ' ').replace('\n', ' ').trim();
    }

    public static void j(String str, boolean z) throws Failure {
        if (!z) {
            throw new Failure(str);
        }
    }

    public static int k(int i, String str, JSONObject jSONObject) throws Failure {
        Object objOpt = jSONObject.opt(str);
        j(C0126.m503(f27short, 603, 8, 1053), (objOpt instanceof Integer) || (objOpt instanceof Long));
        long jLongValue = ((Number) objOpt).longValue();
        j(C0026.m102(f27short, 611, 8, 2814), jLongValue >= ((long) i) && jLongValue <= 2147483647L);
        return (int) jLongValue;
    }

    public static JSONObject l(byte[] bArr) throws JSONException, Failure {
        JSONTokener jSONTokener = new JSONTokener(StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString());
        Object objNextValue = jSONTokener.nextValue();
        j(C0053.m210(f27short, 619, 12, 2800), (objNextValue instanceof JSONObject) && jSONTokener.nextClean() == 0);
        return (JSONObject) objNextValue;
    }

    public static String m(HttpUrl httpUrl) {
        return httpUrl.scheme() + C0101.m402(f27short, 631, 3, 2555) + httpUrl.host() + C0009.m33(f27short, 634, 1, 2162) + httpUrl.port();
    }

    public static String o(Exception exc, int i) {
        return new JSONObject(com.github.catvod.spider.merge.p001b.g.d(e(exc))).put(C0073.m288(f27short, 635, 4, 857), i).put(C0063.m249(f27short, 639, 9, 2363), i).put(C0056.m223(f27short, 648, 5, 2534), 24).put(C0003.m10(f27short, 653, 5, 1128), 0).toString();
    }

    public static JSONObject q(Request request, String str) throws JSONException {
        Headers headersBuild = request.headers().newBuilder().removeAll(C0074.m292(f27short, 658, 5, 1476)).build();
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < headersBuild.size(); i++) {
            jSONObject.put(headersBuild.name(i), headersBuild.value(i));
        }
        return new JSONObject().put(C0074.m292(f27short, 663, 3, 2671), request.url().toString()).put(C0072.m285(f27short, 666, 7, 2690), jSONObject).put(C0105.m416(f27short, 673, 6, 2363), str);
    }

    public static Request.Builder r(HttpUrl httpUrl, Headers headers) throws Failure {
        j(C0028.m108(f27short, 698, 12, 1475), httpUrl.isHttps() || (headers.get(C0001.m1(f27short, 679, 6, 449)) == null && headers.get(C0050.m199(f27short, 685, 13, 2767)) == null));
        Request.Builder builderTag = new Request.Builder().url(httpUrl).headers(headers).tag(Headers.class, headers);
        String strM414 = C0104.m414(f27short, 710, 15, 1875);
        if (headers.get(strM414) == null) {
            builderTag.header(strM414, C0010.m36(f27short, 725, 8, 812));
        }
        return builderTag;
    }

    public static String s(String str, JSONObject jSONObject) throws Failure {
        Object objOpt = jSONObject.opt(str);
        j(C0125.m499(f27short, 733, 8, 3092), objOpt instanceof String);
        return (String) objOpt;
    }

    public static HttpUrl t(String str) throws Failure {
        boolean z = false;
        boolean z2 = (str == null || str.length() > 32768 || str.matches(C0026.m102(f27short, 741, 23, 996))) ? false : true;
        String strM21 = C0006.m21(f27short, 764, 6, 2468);
        j(strM21, z2);
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl != null && httpUrl.username().isEmpty() && httpUrl.password().isEmpty()) {
            z = true;
        }
        j(strM21, z);
        return httpUrl;
    }

    public static k u(String str, JSONObject jSONObject) {
        k kVar = new k(str, i(s(C0105.m416(f27short, 770, 4, 692), jSONObject)), s(C0006.m21(f27short, 774, 3, 857), jSONObject), i(s(C0082.m325(f27short, 777, 6, 376), jSONObject)));
        kVar.u(jSONObject.optString(C0050.m199(f27short, 783, 4, 2602)));
        kVar.k(jSONObject.optString(C0045.m177(f27short, 787, 4, 918)));
        kVar.i(jSONObject.optString(C0001.m1(f27short, 791, 4, 2576)));
        kVar.j(jSONObject.optString(C0055.m219(f27short, 795, 5, 2887)));
        kVar.m(jSONObject.optString(C0006.m21(f27short, 800, 8, 1614)));
        kVar.l(jSONObject.optString(C0114.m454(f27short, 808, 7, 2267)));
        return kVar;
    }

    public final JSONObject a(Session session, JSONObject jSONObject, long j) throws JSONException, Failure {
        c(session, j);
        String string = jSONObject.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM382 = C0096.m382(f27short, 815, 111, 1957);
        String strM529 = C0133.m529(f27short, 926, 111, 3226);
        byte[] bArrT = FishCrypto.t(strM382, strM529, C0143.m570(f27short, 1037, 111, 2894), C0053.m210(f27short, 1148, 131, 2310), bytes);
        j(C0043.m169(f27short, 1279, 8, 2846), bArrT != null && bArrT.length > 0);
        JSONObject jSONObject2 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM368 = C0093.m368(f27short, 1287, 11, 343);
        byte[] bytes2 = jSONObject2.put(strM368, strEncodeToString).toString().getBytes(charset);
        j(C0017.m65(f27short, 1298, 6, 2067), bytes2.length <= 10485760);
        Reply replyG = g(session, new Request.Builder().url(session.a).header(C0114.m454(f27short, 1304, 15, 1415), C0107.m427(f27short, 1319, 8, 874)).post(RequestBody.create(MediaType.parse(C0043.m169(f27short, 1327, 31, 2529)), bytes2)).build(), j, 10485760, false);
        c(session, j);
        j(C0045.m177(f27short, 1358, 8, 1176), replyG.a == 200);
        JSONObject jSONObjectL = l(replyG.c);
        j(C0006.m21(f27short, 1366, 8, 2338), jSONObjectL.length() == 1);
        byte[] bArrB = b(10485760, s(strM368, jSONObjectL));
        j(C0119.m473(f27short, 1374, 6, 3183), bArrB.length > 0 && bArrB.length % 16 == 0);
        byte[] bArrS = FishCrypto.s(strM382, strM529, bArrB);
        j(C0044.m175(f27short, 1380, 8, 3109), bArrS != null && bArrS.length > 0 && bArrS.length <= 10485760);
        JSONObject jSONObjectL2 = l(bArrS);
        if (Boolean.TRUE.equals(jSONObjectL2.opt(C0128.m511(f27short, 1388, 2, 447)))) {
            return jSONObjectL2.getJSONObject(C0028.m108(f27short, 1406, 4, 1529));
        }
        String strM285 = C0072.m285(f27short, 1390, 5, 2589);
        String strM346 = C0087.m346(f27short, 1395, 6, 1577);
        String strOptString = jSONObjectL2.optString(strM285, strM346);
        j(strM346, (strOptString.length() > 160 || strOptString.contains(C0017.m65(f27short, 1401, 3, 3090)) || strOptString.contains(C0009.m33(f27short, 1404, 1, 369)) || strOptString.contains(C0085.m339(f27short, 1405, 1, 451))) ? false : true);
        throw new Failure(strOptString);
    }

    public final long c(Session session, long j) throws Failure {
        j(C0104.m414(f27short, 1410, 13, 3166), (session == null || session != this.a || session.d || Thread.currentThread().isInterrupted()) ? false : true);
        long jNanoTime = j - System.nanoTime();
        j(C0142.m567(f27short, 1423, 4, 1999), jNanoTime > 0);
        return jNanoTime;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0050.m199(f27short, 1427, 15, 1120));
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

    public synchronized void destroy() {
        Session session = this.a;
        this.a = null;
        if (session == null) {
            return;
        }
        synchronized (session) {
            try {
                session.d = true;
                Iterator it = session.b.iterator();
                while (it.hasNext()) {
                    ((Call) it.next()).cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        session.c.connectionPool().evictAll();
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0046.m182(f27short, 1442, 13, 2989));
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

    /* JADX WARN: Code duplicated, block: B:33:0x021f  */
    /* JADX WARN: Code duplicated, block: B:39:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0308  */
    /* JADX WARN: Code duplicated, block: B:55:0x0373 A[Catch: IOException -> 0x0395, TryCatch #1 {IOException -> 0x0395, blocks: (B:52:0x0327, B:55:0x0373, B:57:0x037b, B:58:0x0382, B:59:0x0385), top: B:82:0x0327 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x037b A[Catch: IOException -> 0x0395, TryCatch #1 {IOException -> 0x0395, blocks: (B:52:0x0327, B:55:0x0373, B:57:0x037b, B:58:0x0382, B:59:0x0385), top: B:82:0x0327 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0382 A[SYNTHETIC] */
    public final JSONObject f(Session session, String str, JSONObject jSONObject, long j) throws JSONException, IOException {
        int i;
        JSONObject jSONObjectPut;
        String strM408;
        JSONObject jSONObject2;
        String str2;
        String str3;
        Object obj;
        JSONObject jSONObjectP;
        JSONObject jSONObjectPut2;
        JSONObject jSONObject3;
        String str4;
        JSONObject jSONObject4;
        String strS;
        byte[] bArrB;
        String strM75;
        boolean zEquals;
        String strM36;
        boolean z;
        boolean z2;
        Request.Builder builderR;
        String str5;
        String str6;
        Headers headers;
        JSONObject jSONObject5;
        String[] strArr;
        int i2;
        String str7;
        String strM285 = C0072.m285(f27short, 1455, 6, 3232);
        String strM545 = C0137.m545(f27short, 1461, 2, 546);
        c(session, j);
        JSONObject jSONObject6 = new JSONObject();
        String strM511 = C0128.m511(f27short, 1463, 6, 1300);
        JSONObject jSONObjectA = a(session, jSONObject6.put(strM511, C0095.m379(f27short, 1469, 7, 3120)).put(C0115.m459(f27short, 1476, 5, 916), str).put(C0047.m186(f27short, 1481, 6, 420), jSONObject), j);
        JSONObject jSONObject7 = null;
        int i3 = 0;
        while (true) {
            String strM503 = C0126.m503(f27short, 1487, 6, 1185);
            if (i3 > 24) {
                throw new Failure(strM503);
            }
            c(session, j);
            String strS2 = s(C0115.m459(f27short, 1493, 4, 1030), jSONObjectA);
            String strM322 = C0081.m322(f27short, 1497, 6, 3211);
            boolean zEquals2 = strS2.equals(strM322);
            String strM454 = C0114.m454(f27short, 1503, 3, 1915);
            String strM486 = C0122.m486(f27short, 1506, 6, 2099);
            String strM76 = C0019.m75(f27short, 1512, 7, 2493);
            if (zEquals2) {
                JSONObject jSONObject8 = jSONObjectA.getJSONObject(strM322);
                if (jSONObject7 != null) {
                    j(C0119.m473(f27short, 1519, 7, 2268), s(strM486, jSONObject8).equals(jSONObject7.getString(strM486)));
                    jSONObject8.put(strM454, jSONObject7.getString(strM454)).put(strM76, jSONObject7.getJSONObject(strM76));
                }
                return jSONObject8;
            }
            j(strM503, i3 < 24);
            String strM314 = C0079.m314(f27short, 1526, 6, 1214);
            String strS3 = s(strM314, jSONObjectA);
            if (strS3.isEmpty()) {
                i = i3;
            } else {
                i = i3;
                boolean z3 = strS3.length() <= 400000;
                j(C0087.m346(f27short, 1532, 6, 2710), z3);
                jSONObjectPut = new JSONObject().put(strM511, C0109.m432(f27short, 1538, 7, 819)).put(strM314, strS3);
                strM408 = C0103.m408(f27short, 1545, 5, 1784);
                if (strS2.equals(strM408)) {
                    try {
                        str3 = strM511;
                        obj = "";
                        jSONObject2 = jSONObjectPut;
                        str2 = strM408;
                        try {
                            jSONObjectP = p(session, t(s(strM454, jSONObjectA)), h(jSONObjectA.getJSONObject(strM76), true), j);
                            try {
                                jSONObjectPut2 = new JSONObject().put(strM545, true).put(strM486, jSONObjectP.getString(strM486));
                            } catch (Exception unused) {
                                c(session, j);
                                jSONObjectPut2 = new JSONObject().put(strM545, false).put(strM486, obj);
                            }
                        } catch (Exception unused2) {
                            jSONObjectP = null;
                            c(session, j);
                            jSONObjectPut2 = new JSONObject().put(strM545, false).put(strM486, obj);
                            jSONObject2.put(str2, jSONObjectPut2);
                            jSONObject3 = jSONObjectP;
                            str4 = strM545;
                            jSONObject4 = jSONObject2;
                            c(session, j);
                            i3 = i + 1;
                            jSONObject7 = jSONObject3;
                            jSONObjectA = a(session, jSONObject4, j);
                            strM511 = str3;
                            strM545 = str4;
                        }
                    } catch (Exception unused3) {
                        jSONObject2 = jSONObjectPut;
                        str2 = strM408;
                        str3 = strM511;
                        obj = "";
                    }
                    jSONObject2.put(str2, jSONObjectPut2);
                    jSONObject3 = jSONObjectP;
                    str4 = strM545;
                    jSONObject4 = jSONObject2;
                } else {
                    str3 = strM511;
                    j(C0017.m65(f27short, 1557, 6, 2321), strS2.equals(C0095.m379(f27short, 1550, 7, 3236)));
                    HttpUrl httpUrlT = t(s(strM454, jSONObjectA));
                    Headers headersH = h(jSONObjectA.getJSONObject(strM76), false);
                    strS = s(C0087.m346(f27short, 1563, 6, 662), jSONObjectA);
                    String strM360 = C0091.m360(f27short, 1569, 8, 1305);
                    bArrB = b(4194304, s(strM360, jSONObjectA));
                    strM75 = C0019.m75(f27short, 1577, 3, 3065);
                    zEquals = strS.equals(strM75);
                    strM36 = C0010.m36(f27short, 1580, 4, 2584);
                    if (!zEquals || strS.equals(strM36)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    j(C0044.m175(f27short, 1584, 6, 2212), z);
                    if (strS.equals(strM75) || bArrB.length == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    j(C0014.m54(f27short, 1590, 9, 378), z2);
                    builderR = r(httpUrlT, headersH);
                    if (strS.equals(strM36)) {
                        builderR.post(RequestBody.create((MediaType) null, bArrB));
                    }
                    try {
                        str5 = strM76;
                        str4 = strM545;
                        str6 = strM360;
                        jSONObject4 = jSONObjectPut;
                        try {
                            Reply replyG = g(session, builderR.build(), j, 4194304, false);
                            JSONObject jSONObjectPut3 = jSONObject4.put(strM285, replyG.a);
                            headers = replyG.b;
                            jSONObject5 = new JSONObject();
                            strArr = new String[]{C0030.m116(f27short, 1627, 8, 2706), C0115.m459(f27short, 1599, 12, 3268), C0114.m454(f27short, 1611, 16, 2523)};
                            for (i2 = 0; i2 < 3; i2++) {
                                str7 = strArr[i2];
                                if (headers.get(str7) != null) {
                                    jSONObject5.put(str7, headers.get(str7));
                                }
                            }
                            jSONObjectPut3.put(str5, jSONObject5).put(str6, Base64.encodeToString(replyG.c, 2));
                        } catch (IOException e) {
                            e = e;
                            c(session, j);
                            if (e instanceof Failure) {
                                throw e;
                            }
                            jSONObject4.put(strM285, 0).put(str5, new JSONObject()).put(str6, "").put(C0112.m445(f27short, 1644, 15, 2493), e instanceof SocketTimeoutException ? C0030.m116(f27short, 1635, 7, 2266) : C0101.m402(f27short, 1642, 2, 1803));
                        }
                    } catch (IOException e2) {
                        e = e2;
                        str5 = r3;
                        str4 = strM545;
                        str6 = r6;
                        jSONObject4 = jSONObjectPut;
                    }
                    jSONObject3 = null;
                }
                c(session, j);
                i3 = i + 1;
                jSONObject7 = jSONObject3;
                jSONObjectA = a(session, jSONObject4, j);
                strM511 = str3;
                strM545 = str4;
            }
            j(C0087.m346(f27short, 1532, 6, 2710), z3);
            jSONObjectPut = new JSONObject().put(strM511, C0109.m432(f27short, 1538, 7, 819)).put(strM314, strS3);
            strM408 = C0103.m408(f27short, 1545, 5, 1784);
            if (strS2.equals(strM408)) {
                str3 = strM511;
                obj = "";
                jSONObject2 = jSONObjectPut;
                str2 = strM408;
                jSONObjectP = p(session, t(s(strM454, jSONObjectA)), h(jSONObjectA.getJSONObject(strM76), true), j);
                jSONObjectPut2 = new JSONObject().put(strM545, true).put(strM486, jSONObjectP.getString(strM486));
                jSONObject2.put(str2, jSONObjectPut2);
                jSONObject3 = jSONObjectP;
                str4 = strM545;
                jSONObject4 = jSONObject2;
            } else {
                str3 = strM511;
                j(C0017.m65(f27short, 1557, 6, 2321), strS2.equals(C0095.m379(f27short, 1550, 7, 3236)));
                HttpUrl httpUrlT2 = t(s(strM454, jSONObjectA));
                Headers headersH2 = h(jSONObjectA.getJSONObject(strM76), false);
                strS = s(C0087.m346(f27short, 1563, 6, 662), jSONObjectA);
                String strM361 = C0091.m360(f27short, 1569, 8, 1305);
                bArrB = b(4194304, s(strM361, jSONObjectA));
                strM75 = C0019.m75(f27short, 1577, 3, 3065);
                zEquals = strS.equals(strM75);
                strM36 = C0010.m36(f27short, 1580, 4, 2584);
                if (zEquals) {
                    z = true;
                } else {
                    z = true;
                }
                j(C0044.m175(f27short, 1584, 6, 2212), z);
                if (strS.equals(strM75)) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                j(C0014.m54(f27short, 1590, 9, 378), z2);
                builderR = r(httpUrlT2, headersH2);
                if (strS.equals(strM36)) {
                    builderR.post(RequestBody.create((MediaType) null, bArrB));
                }
                str5 = strM76;
                str4 = strM545;
                str6 = strM361;
                jSONObject4 = jSONObjectPut;
                Reply replyG2 = g(session, builderR.build(), j, 4194304, false);
                JSONObject jSONObjectPut4 = jSONObject4.put(strM285, replyG2.a);
                headers = replyG2.b;
                jSONObject5 = new JSONObject();
                strArr = new String[]{C0030.m116(f27short, 1627, 8, 2706), C0115.m459(f27short, 1599, 12, 3268), C0114.m454(f27short, 1611, 16, 2523)};
                while (i2 < 3) {
                    str7 = strArr[i2];
                    if (headers.get(str7) != null) {
                        jSONObject5.put(str7, headers.get(str7));
                    }
                }
                jSONObjectPut4.put(str5, jSONObject5).put(str6, Base64.encodeToString(replyG2.c, 2));
                jSONObject3 = null;
            }
            c(session, j);
            i3 = i + 1;
            jSONObject7 = jSONObject3;
            jSONObjectA = a(session, jSONObject4, j);
            strM511 = str3;
            strM545 = str4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    public final Reply g(Session session, Request request, long j, int i, boolean z) throws Failure {
        boolean z2;
        if (request.headers().byteCount() > 65536) {
            z2 = false;
        } else {
            if (request.body() != null) {
                if (request.body().contentLength() > (request.tag(Headers.class) == null ? 10485760 : 4194304)) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        j(C0017.m65(f27short, 1659, 4, 1694), z2);
        OkHttpClient.Builder builderCallTimeout = session.c.newBuilder().callTimeout(c(session, j), TimeUnit.NANOSECONDS);
        if (request.tag(Headers.class) != null) {
            builderCallTimeout.dns(new C0359j(6));
        }
        Call callNewCall = builderCallTimeout.build().newCall(request);
        synchronized (session) {
            c(session, j);
            session.b.add(callNewCall);
        }
        try {
            Response responseExecute = callNewCall.execute();
            try {
                j(C0056.m223(f27short, 1663, 4, 2252), responseExecute.headers().byteCount() <= 65536 && (z || responseExecute.body() == null || responseExecute.body().contentLength() <= ((long) i)));
                Buffer buffer = new Buffer();
                long j2 = i;
                if (!z) {
                    j2++;
                }
                while (responseExecute.body() != null && buffer.size() < j2) {
                    c(session, j);
                    if (responseExecute.body().source().read(buffer, Math.min(8192L, j2 - buffer.size())) < 0) {
                        break;
                    }
                }
                j(C0101.m402(f27short, 1667, 6, 1548), z || buffer.size() <= ((long) i));
                c(session, j);
                Reply reply = new Reply(responseExecute.code(), responseExecute.headers(), buffer.readByteArray());
                responseExecute.close();
                synchronized (session) {
                    session.b.remove(callNewCall);
                }
                return reply;
            } catch (Throwable th) {
                if (responseExecute == null) {
                    throw th;
                }
                try {
                    responseExecute.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            synchronized (session) {
                session.b.remove(callNewCall);
                throw th3;
            }
        }
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0096.m382(f27short, 1673, 11, 2476));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0043.m169(f27short, 1684, 16, 1514));
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

    public void init(Context context) {
        init(context, "");
    }

    public synchronized void init(Context context, String str) {
        try {
            destroy();
            String strTrim = str == null ? "" : str.trim();
            j(C0126.m503(f27short, 1701, 14, 1908), (strTrim.isEmpty() || strTrim.startsWith(C0085.m339(f27short, 1700, 1, 3203))) ? false : true);
            if (!strTrim.startsWith(C0114.m454(f27short, 1715, 7, 3169)) && !strTrim.startsWith(C0119.m473(f27short, 1722, 8, 2803))) {
                strTrim = FishCrypto.g(strTrim);
            }
            HttpUrl httpUrlT = t(strTrim);
            j(C0017.m65(f27short, 1730, 10, 2667), httpUrlT.fragment() == null);
            this.a = new Session(httpUrlT.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isVideoFormat(String str) {
        if (FishCrypto.businessReady()) {
            return $host$42ceaa68a95df632(str);
        }
        return false;
    }

    public boolean manualVideoCheck() {
        if (FishCrypto.businessReady()) {
            return $host$53940b53855fde82();
        }
        return false;
    }

    public final String n(Session session, JSONObject jSONObject, long j) throws JSONException, Failure {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(C0019.m75(f27short, 1740, 4, 1660));
        j(C0114.m454(f27short, 1744, 4, 749), jSONArray.length() <= 10000);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(u(s(C0098.m390(f27short, 1748, 2, 3089), jSONObject2), jSONObject2));
        }
        c(session, j);
        JSONObject jSONObject3 = new JSONObject(com.github.catvod.spider.merge.p001b.g.y(arrayList));
        String strM105 = C0027.m105(f27short, 1750, 4, 507);
        JSONObject jSONObjectPut = jSONObject3.put(strM105, k(1, strM105, jSONObject));
        String strM365 = C0092.m365(f27short, 1754, 9, 2864);
        JSONObject jSONObjectPut2 = jSONObjectPut.put(strM365, k(1, strM365, jSONObject));
        String strM358 = C0090.m358(f27short, 1763, 5, 2868);
        JSONObject jSONObjectPut3 = jSONObjectPut2.put(strM358, k(1, strM358, jSONObject));
        String strM75 = C0019.m75(f27short, 1768, 5, 2308);
        return jSONObjectPut3.put(strM75, k(0, strM75, jSONObject)).toString();
    }

    public final JSONObject p(Session session, HttpUrl httpUrl, Headers headers, long j) throws Failure {
        Request requestBuild = r(httpUrl, headers.newBuilder().set(C0055.m219(f27short, 1773, 5, 2481), C0133.m529(f27short, 1778, 12, 2158)).build()).build();
        int i = 0;
        while (true) {
            String strM83 = C0021.m83(f27short, 1790, 6, 2219);
            if (i > 3) {
                throw new Failure(strM83);
            }
            c(session, j);
            Reply replyG = g(session, requestBuild, j, 8192, true);
            List listAsList = Arrays.asList(301, 302, 303, 307, 308);
            int i2 = replyG.a;
            if (!listAsList.contains(Integer.valueOf(i2))) {
                j(C0092.m365(f27short, 1839, 8, 2442), i2 == 200 || i2 == 206);
                Charset charset = StandardCharsets.UTF_8;
                byte[] bArr = replyG.c;
                String strTrim = new String(bArr, charset).trim();
                if (strTrim.startsWith(C0026.m102(f27short, 1847, 7, 711))) {
                    return q(requestBuild, C0142.m567(f27short, 1854, 21, 1354));
                }
                if (strTrim.matches(C0079.m314(f27short, 1875, 39, 1248))) {
                    return q(requestBuild, C0114.m454(f27short, 1914, 20, 1377));
                }
                if (bArr.length >= 8 && new String(bArr, 4, 4, StandardCharsets.US_ASCII).equals(C0109.m432(f27short, 1934, 4, 1359))) {
                    return q(requestBuild, C0103.m408(f27short, 1938, 9, 2780));
                }
                if (bArr.length >= 3 && bArr[0] == 70 && bArr[1] == 76 && bArr[2] == 86) {
                    return q(requestBuild, C0126.m503(f27short, 1947, 11, 1573));
                }
                if (bArr.length >= 4 && bArr[0] == 26 && bArr[1] == 69 && bArr[2] == -33 && bArr[3] == -93) {
                    return q(requestBuild, C0076.m301(f27short, 1958, 16, 642));
                }
                if (bArr.length > 376 && bArr[0] == 71 && bArr[188] == 71 && bArr[376] == 71) {
                    return q(requestBuild, C0117.m467(f27short, 1974, 10, 2250));
                }
                throw new Failure(C0091.m360(f27short, 1984, 7, 3178));
            }
            j(strM83, i < 3);
            String str = replyG.b.get(C0046.m182(f27short, 1796, 8, 945));
            HttpUrl httpUrlResolve = str == null ? null : requestBuild.url().resolve(str);
            j(C0115.m459(f27short, 1804, 8, 1616), httpUrlResolve != null);
            t(httpUrlResolve.toString());
            j(C0014.m54(f27short, 1812, 8, 3058), !requestBuild.url().isHttps() || httpUrlResolve.isHttps());
            Headers.Builder builderNewBuilder = requestBuild.headers().newBuilder();
            if (!m(httpUrlResolve).equals(m(requestBuild.url()))) {
                builderNewBuilder.removeAll(C0044.m175(f27short, 1820, 6, 1273)).removeAll(C0006.m21(f27short, 1826, 13, 1844));
            }
            requestBuild = r(httpUrlResolve, builderNewBuilder.build()).build();
            i++;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0006.m21(f27short, 1991, 13, 1499));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0122.m486(f27short, 2004, 13, 2576));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0076.m301(f27short, 2017, 13, 392));
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

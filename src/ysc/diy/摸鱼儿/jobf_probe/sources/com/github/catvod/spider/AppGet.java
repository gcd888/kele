package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0294s1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
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
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
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
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class AppGet extends Spider {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k = "";
    public String l = C0130.m516(f8short, 956, 15, 1870);

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f8short = {2461, 2436, 2447, 2484, 2457, 2446, 2438, 2442, 2457, 2432, 2456, 1959, 1982, 1973, 1934, 1953, 1976, 1970, 422, 447, 436, 399, 446, 433, 445, 437, 2566, 2591, 2580, 2607, 2585, 2580, 2904, 2711, 2714, 2707, 2694, 2748, 2698, 2695, 2536, 2534, 2554, 2548, 2540, 2545, 2535, 2544, 1586, 1571, 1573, 1575, 2301, 2283, 2287, 2300, 2285, 2278, 2242, 2279, 2301, 2298, 620, 634, 638, 621, 636, 631, 576, 627, 630, 620, 619, 1307, 1310, 1284, 1283, 1151, 1126, 1133, 1110, 1147, 1132, 1124, 1128, 1147, 1122, 1146, 1492, 1485, 1478, 1533, 1490, 1483, 1473, 2432, 2457, 2450, 2473, 2456, 2455, 2459, 2451, 2739, 2730, 2721, 2714, 2732, 2721, 539, 532, 537, 523, 523, 1926, 1923, 1945, 1950, 1362, 1375, 1366, 1347, 1401, 1352, 1351, 1355, 1347, 3264, 3277, 3268, 3281, 3307, 3293, 3280, 815, 3066, 3069, 3066, 3047, 3013, 2978, 2978, 2986, 1756, 1754, 2007, 2010, 2003, 1990, 2044, 1999, 1994, 2000, 2007, 24665, 31090, 2923, 2923, 29854, 19964, 30428, 31659, 20493, 21951, 22209, -24622, 856, 855, 850, 842, 859, 844, 865, 842, 839, 846, 859, 865, 850, 855, 845, 842, 1978, 1973, 1977, 1969, 1292, 1311, 1288, 1292, 464, 477, 466, 475, 1760, 1788, 1784, 1771, 1246, 1218, 1247, 1241, 2743, 2720, 2726, 2730, 2728, 2728, 2720, 2731, 2721, 2714, 2729, 2732, 2742, 2737, 3163, 3156, 3153, 3145, 3160, 3151, 3150, 3165, 3197, 2425, 2399, 2377, 2398, 2305, 2413, 2379, 2377, 2370, 2392, 510, 476, 457, 474, 479, 479, 466, 412, 390, 413, 387, 403, 411, 484, 474, 477, 471, 476, 452, 448, 403, 509, 487, 403, 386, 387, 413, 387, 392, 403, 484, 474, 477, 389, 391, 392, 403, 459, 389, 391, 410, 403, 498, 451, 451, 479, 470, 484, 470, 465, 504, 474, 455, 412, 390, 384, 388, 413, 384, 389, 403, 411, 504, 507, 487, 510, 511, 415, 403, 479, 474, 472, 470, 403, 500, 470, 464, 472, 476, 410, 403, 496, 475, 449, 476, 478, 470, 412, 386, 386, 388, 413, 387, 413, 387, 413, 387, 403, 480, 466, 469, 466, 449, 474, 412, 390, 384, 388, 413, 384, 389, 2712, 2734, 2738, 2738, 2742, 2741, 2809, 2812, 2793, 2793, 2792, 2796, 1002, 1007, 992, 995, 1007, 997, 1019, 2499, 2510, 2506, 2511, 2510, 2521, 2539, 2554, 2537, 2536, 2558, 2085, 2161, 2175, 2147, 2087, 720, 666, 669, 643, 722, 644, 763, 740, 767, 686, 672, 702, 673, 649, 702, 765, 644, 697, 669, 667, 640, 737, 668, 677, 646, 641, 666, 673, 699, 766, 737, 643, 679, 645, 699, 761, 701, 688, 671, 667, 643, 685, 700, 647, 696, 658, 697, 737, 645, 654, 699, 762, 677, 681, 688, 741, 697, 703, 702, 655, 671, 763, 762, 673, 646, 684, 765, 690, 737, 658, 703, 767, 647, 698, 741, 764, 640, 674, 699, 741, 681, 686, 703, 698, 764, 763, 754, 653, 761, 645, 672, 685, 691, 701, 759, 759, 2958, 2953, 2967, 2666, 2690, 2773, 2770, 2764, 2690, 2812, 2771, 2698, 2714, 2812, 2771, 2698, 2690, 2696, 2811, 2814, 2690, 2813, 2699, 2697, 2690, 1482, 1485, 1491, 1410, 1491, 1495, 1493, 1424, 1486, 1416, 1477, 1409, 1424, 1421, 1481, 1409, 1424, 1430, 1419, 1492, 1491, 1495, 2327, 2315, 2322, 2323, 2015, 1927, 1942, 1925, 1924, 1938, 1960, 1942, 1927, 1950, 1994, 2014, 2015, 2009, 2013, 1992, 2014, 2015, 1992, 1994, 2001, 1923, 1944, 1948, 1938, 1945, 2014, 2015, 2001, 1923, 1944, 1948, 1938, 1945, 2014, 2201, 2204, 2185, 2204, 3084, 3088, 3101, 3077, 3113, 3086, 3088, 1107, 1107, 1107, 951, 942, 933, 926, 933, 936, 947, 932, 930, 949, 942, 947, 2330, 2307, 2312, 2355, 2317, 2319, 2328, 2307, 2334, 889, 864, 875, 848, 893, 874, 866, 878, 893, 868, 892, 995, 1018, 1009, 970, 997, 1020, 1014, 2887, 2910, 2901, 2926, 2904, 2901, 950, 943, 932, 927, 931, 943, 942, 948, 933, 942, 948, 3253, 3244, 3239, 3228, 3245, 3234, 3246, 3238, 2127, 2332, 2373, 2396, 2391, 2423, 2390, 2375, 2386, 2394, 2399, 1747, 1738, 1729, 581, 584, 577, 596, 622, 607, 592, 604, 596, 1354, 1363, 1368, 1379, 1375, 1360, 1373, 1359, 1359, 3290, 3267, 3272, 3315, 3292, 3264, 3277, 3285, 3315, 3264, 3269, 3295, 3288, 1908, 1896, 1893, 1917, 1889, 1910, 1883, 1901, 1898, 1890, 1899, 3192, 3171, 3172, 3196, 3032, 3039, 2987, -2933, 3039, 3032, 15251, 3038, 3032, 3037, 2986, -2934, 3039, 3038, 15250, 3038, 2985, 29735, 3032, 3037, 2986, -2934, 3039, 3038, 15250, 3038, 2985, 3032, 2986, -2934, 3039, 3038, 15250, 3038, 2968, 2953, 2970, 2971, 2957, 704, 711, 729, 710, 2694, 2697, 2693, 2701, 1150, 1145, 1127, 1652, 1637, 1654, 1655, 1633, 1627, 1637, 1652, 1645, 1627, 1649, 1654, 1640, 2750, 2725, 2721, 2735, 2724, 462, 457, 452, 2120, 2174, 2146, 2146, 2150, 2149, 2089, 2092, 2105, 2105, 2104, 2108, 2458, 2071, 2054, 2069, 2068, 2050, 2104, 2054, 2071, 2062, 2138, 465, 386, 389, 411, 458, 2452, 2502, 2525, 2521, 2519, 2524, 2447, 455, 3190, 731, 706, 713, 754, 733, 705, 716, 724, 754, 715, 735, 706, 704, 1717, 1708, 1703, 1692, 1715, 1711, 1698, 1722, 1692, 1718, 1713, 1711, 533, 528, 522, 525, 2025, 2032, 2043, 1984, 2029, 2042, 2034, 2046, 2029, 2036, 2028, 548, 573, 566, 525, 546, 571, 561, 752, 745, 738, 729, 744, 743, 747, 739, 1754, 1731, 1736, 1779, 1733, 1736, 2025, 2040, 2046, 2044, 1102, 1109, 976, 972, 968, 987, 1197, 1214, 1193, 1197, 283, 278, 281, 272, 1823, 1808, 1821, 1807, 1807, 3181, 1078, 1083, 1074, 1063, 1053, 1067, 1062, 2126, 2130, 2127, 2121, 1127, 1084, 1073, 1080, 1069, 1038, 1057, 1060, 1084, 1069, 1082, 1054, 1063, 1068, 1028, 1057, 1083, 1084, 1143, 1080, 1065, 1071, 1069, 1141, 1603, 1620, 1618, 1630, 1628, 1628, 1620, 1631, 1621, 1646, 1629, 1624, 1602, 1605, 870, 887, 881, 883, 885, 889, 867, 888, 866, 1089, 1092, 1118, 1113, 1833, 1835, 1850, 1839, 1854, 1854, 1839, 1854, 1831, 1888, 1831, 1824, 1834, 1835, 1846, 973, 2766, 1376, 1404, 1377, 1383, 1006, 1013, 2244, 2250, 2262, 1924, 1931, 1927, 1935, 832, 855, 858, 835, 851, 504, 421, 418, 444, 493, 505, 504, 510, 506, 
    495, 505, 504, 495, 493, 502, 420, 447, 443, 437, 446, 505, 504, 502, 420, 447, 443, 437, 446, 505, 3229, 3228, 3214, 3301, 3312, 2878, 2874, 2860, 2896, 2876, 2877, 2876, 2896, 2863, 2868, 2876, 2860, 2888, 2863, 2846, 2843, 2843, 2838, 2833, 2840, 2997, 2993, 2983, 1798, 1794, 1812, 1896, 1796, 1797, 1796, 1896, 1815, 1804, 1796, 1812, 1906, 1815, 1830, 1827, 1827, 1838, 1833, 1824, 675, 679, 689, 3105, 3107, 3126, 3111, 3109, 3117, 3120, 3131, 3073, 3117, 3116, 3126, 3111, 3116, 3126, 1853, 1843, 1888, 1895, 1913, 1832, 1852, 1853, 1851, 1855, 1834, 1852, 1853, 1834, 1832, 1843, 1889, 1914, 1918, 1904, 1915, 1852, 1853, 1843, 1889, 1914, 1918, 1904, 1915, 1852, 2287, 2286, 2303, 2282, 2274, 2279, 2248, 2276, 2277, 2303, 2286, 2277, 2303, 1737, 1741, 1742, 1746, 1746, 1750, 1673, 1685, 1672, 1687, 1682, 1672, 1695, 2120, 2158, 2168, 2159, 2096, 2140, 2170, 2168, 2163, 2153, 313, 296, 296, 308, 305, 315, 313, 300, 305, 311, 310, 375, 288, 373, 303, 303, 303, 373, 318, 311, 298, 309, 373, 301, 298, 308, 317, 310, 315, 311, 316, 317, 316, 2399, 2336, 2367, 2375, 2377, 2427, 2375, 2362, 2370, 2416, 2384, 2424, 2394, 2408, 2340, 2408, 2411, 2340, 2411, 2420, 2425, 2400, 2336, 2431, 2411, 2341, 2396, 2368, 2377, 2424, 2421, 2362, 2339, 2371, 2369, 2342, 2396, 2388, 2419, 2399, 2409, 2340, 2395, 2377, 2371, 2375, 2379, 2371, 2405, 2387, 2391, 2370, 2399, 2379, 2407, 2403, 2428, 2423, 2376, 2424, 2421, 2344, 2402, 2379, 2407, 2396, 2338, 2379, 2337, 2418, 2400, 2398, 2421, 2391, 2337, 2400, 2393, 2427, 2388, 2336, 2388, 2377, 2392, 2395, 2402, 2336, 2422, 2342, 2384, 2348, 2348, 1045, 1155, 1242, 1219, 1224, 1276, 1229, 1246, 1247, 1225, 3096, 3134, 3112, 3135, 3168, 3084, 3114, 3112, 3107, 3129, 697, 701, 702, 674, 674, 678, 761, 741, 760, 743, 738, 760, 751, 2496, 2540, 2541, 2541, 2534, 2528, 2551, 2538, 2540, 2541, 393, 423, 423, 434, 495, 387, 430, 427, 436, 423, 3163, 3191, 3190, 3180, 3197, 3190, 3180, 3125, 3148, 3169, 3176, 3197, 511, 494, 494, 435, 488, 507, 492, 493, 503, 497, 496, 435, 509, 497, 506, 507, 971, 986, 986, 903, 991, 985, 975, 984, 903, 990, 965, 961, 975, 964, 1176, 1161, 1161, 1236, 1164, 1168, 1236, 1172, 1174, 1181, 1180, 862, 859, 853, 858, 838, 388, 405, 405, 456, 400, 406, 384, 407, 456, 385, 384, 403, 396, 390, 384, 456, 396, 385, 858, 843, 843, 790, 858, 843, 850, 790, 845, 862, 841, 850, 861, 834, 790, 847, 850, 854, 862, 1756, 1741, 1741, 1680, 1756, 1741, 1748, 1680, 1739, 1752, 1743, 1748, 1755, 1732, 1680, 1742, 1748, 1754, 1747, 1896, 1901, 1912, 1901, 1031, 1054, 1026, 1027, 1778, 1781, 1771, 1924, 2043, 2020, 1948, 1938, 1952, 1948, 2017, 1945, 1963, 1931, 1955, 1921, 1971, 2047, 1971, 1968, 2047, 1968, 1967, 1954, 1979, 2043, 1956, 1968, 2046, 1927, 1947, 1938, 1955, 1966, 2017, 2040, 1944, 1946, 2045, 1927, 1935, 1960, 1924, 1970, 2047, 1920, 1938, 1944, 1948, 1936, 1944, 1982, 1928, 1932, 1945, 1924, 1936, 1980, 1976, 1959, 1964, 1939, 1955, 1966, 2035, 1977, 1936, 1980, 1927, 2041, 1936, 2042, 1961, 1979, 1925, 1966, 1932, 2042, 1979, 1922, 1952, 1935, 2043, 1935, 1938, 1923, 1920, 1977, 2043, 1965, 2045, 1931, 2039, 2039, 3317, 3300, 3300, 3320, 3325, 3319, 3317, 3296, 3325, 3323, 3322, 3259, 3326, 3303, 3323, 3322, 3247, 3252, 3319, 3324, 3317, 3302, 3303, 3313, 3296, 3241, 3297, 3296, 3314, 3257, 3244, 1731, 1765, 1779, 1764, 1723, 1751, 1777, 1779, 1784, 1762, 2569, 2573, 2574, 2578, 2578, 2582, 2633, 2645, 2632, 2647, 2642, 2632, 2655, 2029, 1985, 1984, 2010, 1995, 1984, 2010, 1923, 2042, 2007, 2014, 1995, 2551, 2534, 2534, 2554, 2559, 2549, 2551, 2530, 2559, 2553, 2552, 2489, 2542, 2491, 2529, 2529, 2529, 2491, 2544, 2553, 2532, 2555, 2491, 2531, 2532, 2554, 2547, 2552, 2549, 2553, 2546, 2547, 2546, 883, 866, 866, 831, 871, 865, 887, 864, 831, 886, 887, 868, 891, 881, 887, 831, 891, 886, 1152, 1169, 1169, 1228, 1175, 1156, 1171, 1170, 1160, 1166, 1167, 1228, 1154, 1166, 1157, 1156, 2316, 2333, 2333, 2368, 2316, 2333, 2308, 2368, 2331, 2312, 2335, 2308, 2315, 2324, 2368, 2329, 2308, 2304, 2312, 2131, 2114, 2114, 2079, 2131, 2114, 2139, 2079, 2116, 2135, 2112, 2139, 2132, 2123, 2079, 2113, 2139, 2133, 2140, 1368, 1353, 1353, 1300, 1356, 1360, 1300, 1364, 1366, 1373, 1372, 1533, 1528, 1526, 1529, 1509, 440, 425, 425, 500, 428, 426, 444, 427, 500, 429, 438, 434, 444, 439, 3185, 3188, 3169, 3188, 1209, 1214, 1212, 1204, 1170, 1214, 1215, 1189, 1204, 1215, 1189, 2328, 2335, 2328, 2309, 3122, 3110, 703, 696, 678, 1783, 1776, 1772, 1771, 2269, 2241, 2241, 2245, 1713, 2673, 2667, 2678, 2663, 1090, 1048, 1044, 1048, 306, 311, 290, 311, 285, 307, 303, 553, 556, 569, 556, 550, 552, 564, 689, 703, 675, 2550, 2547, 2534, 2547, 2523, 2532, 1216, 1221, 1232, 1221, 1229, 1234, 3065, 3046, 1937, 1936, 1923, 1948, 1942, 1936, 1980, 1937, 284, 285, 270, 273, 283, 285, 273, 284, 1707, 1720, 1711, 1710, 1716, 1714, 1715, 2998, 2989, 2985, 2983, 2988, 2695, 2690, 2703, 2735, 2692, 2693, 2749, 2802, 2807, 2803, 1330, 1316, 1312, 1331, 1314, 1321, 1864, 1881, 1856, 1237, 1083, 1059, 1056, 1059, 1067, 1082, 1082, 1067, 1082, 1059, 1124, 1059, 1060, 1070, 1071, 1074, 957, 1973, 1956, 1956, 1973, 1956, 1981, 2374, 2372, 2389, 2368, 2385, 2385, 2368, 2385, 2376, 2319, 2376, 2383, 2373, 2372, 2393, 1792, 1820, 1798, 1793, 1808, 1814, 1845, 1818, 1823, 1799, 1814, 1793, 577, 590, 587, 595, 578, 597, 1122, 1150, 1139, 1131, 1148, 1139, 1151, 1143, 1726, 1698, 1711, 1719, 1707, 1724, 1677, 1697, 1696, 1722, 1707, 1696, 1722, 396, 410, 414, 397, 412, 407, 444, 400, 401, 395, 410, 401, 395};
    public static final HashMap m = new HashMap<String, String>() { // from class: com.github.catvod.spider.AppGet.1

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f9short = {1912, 1911, 1914, 1896, 1896, 31232, 20976, 2554, 2537, 2558, 2554, 21468, 22486, 2353, 2364, 2355, 2362, -30183, -29708, 309, 297, 301, 318, 22039, 18078, 834, 857, 27286, 22411};

        {
            put(C0028.m108(f9short, 0, 5, 1819), C0001.m1(f9short, 5, 2, 1659));
            put(C0106.m422(f9short, 7, 4, 2459), C0106.m422(f9short, 11, 2, 1260));
            put(C0095.m379(f9short, 13, 4, 2397), C0143.m570(f9short, 17, 2, 500));
            put(C0103.m408(f9short, 19, 4, 332), C0081.m322(f9short, 23, 2, 2147));
            put(C0095.m379(f9short, 25, 2, 800), C0087.m346(f9short, 27, 2, 2308));
        }
    };

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) throws JSONException {
        String strM477 = C0120.m477(f8short, 0, 11, 2539);
        String strM471 = C0118.m471(f8short, 11, 7, 2001);
        String strM416 = C0105.m416(f8short, 18, 8, 464);
        String strM21 = C0006.m21(f8short, 26, 6, 2672);
        String strM539 = C0135.m539(f8short, 32, 1, 2935);
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0097.m386(f8short, 33, 7, 2787), 0);
            jSONObject.put(C0139.m554(f8short, 40, 8, 2435), str);
            jSONObject.put(C0043.m169(f8short, 48, 4, 1602), 1);
            JSONArray jSONArrayOptJSONArray = new JSONObject(h(strM539 + this.l + strM539 + (TextUtils.isEmpty(this.j) ? C0008.m31(f8short, 52, 10, 2190) : this.j), jSONObject.toString())).optJSONArray(C0021.m83(f8short, 62, 11, 543));
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(strM21, jSONObject2.optString(strM21));
                    jSONObject3.put(strM416, jSONObject2.optString(strM416));
                    jSONObject3.put(strM471, jSONObject2.optString(strM471));
                    jSONObject3.put(strM477, jSONObject2.optString(strM477));
                    jSONArray.put(jSONObject3);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(C0070.m277(f8short, 73, 4, 1399), jSONArray);
        return jSONObject4.toString();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0264  */
    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String str;
        String str2;
        JSONArray jSONArray3;
        String strM219 = C0055.m219(f8short, 77, 11, 1033);
        String strM108 = C0028.m108(f8short, 88, 7, 1442);
        String strM301 = C0076.m301(f8short, 95, 8, 2550);
        String strM454 = C0114.m454(f8short, 103, 6, 2757);
        String strM477 = C0120.m477(f8short, 109, 5, 632);
        String strM529 = C0133.m529(f8short, 114, 4, 2026);
        String strM249 = C0063.m249(f8short, 118, 9, 1318);
        String strM414 = C0104.m414(f8short, 127, 7, 3252);
        String strM65 = C0017.m65(f8short, 134, 1, 768);
        JSONArray jSONArray4 = new JSONArray();
        JSONArray jSONArray5 = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(h(strM65 + this.l + strM65 + (TextUtils.isEmpty(this.i) ? C0043.m169(f8short, 135, 8, 2963) : this.i), C0050.m199(f8short, 143, 2, 1703)));
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(C0089.m355(f8short, 145, 9, 1955));
            if (jSONArrayOptJSONArray != null) {
                int i = 0;
                while (i < jSONArrayOptJSONArray.length()) {
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                        String strOptString = jSONObject3.optString(strM414);
                        JSONArray jSONArray6 = jSONArrayOptJSONArray;
                        String strOptString2 = jSONObject3.optString(strM249);
                        jSONArray2 = jSONArray5;
                        try {
                            if (strOptString2.contains(C0117.m467(f8short, 154, 5, 2874)) || C0143.m570(f8short, 159, 2, 730).equals(strOptString2) || C0009.m33(f8short, 161, 2, 548).equals(strOptString2) || C0085.m339(f8short, 163, 3, 2480).equals(strOptString2)) {
                                str = strM249;
                                str2 = strM414;
                            } else {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put(strM414, strOptString);
                                jSONObject4.put(strM249, strOptString2);
                                jSONArray4.put(jSONObject4);
                                JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray(C0128.m511(f8short, 166, 16, 830));
                                if (jSONArrayOptJSONArray2 != null) {
                                    JSONArray jSONArray7 = new JSONArray();
                                    str = strM249;
                                    int i2 = 0;
                                    while (i2 < jSONArrayOptJSONArray2.length()) {
                                        JSONObject jSONObject5 = jSONArrayOptJSONArray2.getJSONObject(i2);
                                        String str3 = strM414;
                                        String strOptString3 = jSONObject5.optString(C0115.m459(f8short, 182, 4, 2004));
                                        JSONArray jSONArrayOptJSONArray3 = jSONObject5.optJSONArray(strM529);
                                        if (jSONArrayOptJSONArray3 != null) {
                                            if (strM477.equals(strOptString3)) {
                                                jSONArray3 = jSONArrayOptJSONArray2;
                                            } else {
                                                jSONArray3 = jSONArrayOptJSONArray2;
                                                if (C0125.m499(f8short, 186, 4, 1389).equals(strOptString3) || C0126.m503(f8short, 190, 4, 444).equals(strOptString3) || C0119.m473(f8short, 194, 4, 1689).equals(strOptString3) || C0097.m386(f8short, 198, 4, 1197).equals(strOptString3)) {
                                                }
                                            }
                                            jSONArray7.put(c(strOptString3, jSONArrayOptJSONArray3));
                                        } else {
                                            jSONArray3 = jSONArrayOptJSONArray2;
                                        }
                                        i2++;
                                        strM414 = str3;
                                        jSONArrayOptJSONArray2 = jSONArray3;
                                    }
                                    str2 = strM414;
                                    if (jSONArray7.length() > 0) {
                                        jSONObject.put(strOptString, jSONArray7);
                                    }
                                } else {
                                    str = strM249;
                                    str2 = strM414;
                                }
                            }
                            i++;
                            jSONArrayOptJSONArray = jSONArray6;
                            jSONArray5 = jSONArray2;
                            strM249 = str;
                            strM414 = str2;
                        } catch (Exception e) {
                            e = e;
                            jSONArray = jSONArray2;
                            e.printStackTrace();
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put(strM477, jSONArray4);
                            jSONObject6.put(C0139.m554(f8short, 216, 7, 3133), jSONObject);
                            jSONObject6.put(strM529, jSONArray);
                            return jSONObject6.toString();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        jSONArray2 = jSONArray5;
                        jSONArray = jSONArray2;
                        e.printStackTrace();
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put(strM477, jSONArray4);
                        jSONObject7.put(C0139.m554(f8short, 216, 7, 3133), jSONObject);
                        jSONObject7.put(strM529, jSONArray);
                        return jSONObject7.toString();
                    }
                }
            }
            jSONArray2 = jSONArray5;
            JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray(C0074.m292(f8short, 202, 14, 2757));
            if (jSONArrayOptJSONArray4 != null) {
                int i3 = 0;
                while (i3 < jSONArrayOptJSONArray4.length()) {
                    JSONObject jSONObject8 = jSONArrayOptJSONArray4.getJSONObject(i3);
                    JSONObject jSONObject9 = new JSONObject();
                    jSONObject9.put(strM454, jSONObject8.optString(strM454));
                    jSONObject9.put(strM301, jSONObject8.optString(strM301));
                    jSONObject9.put(strM108, jSONObject8.optString(strM108));
                    jSONObject9.put(strM219, jSONObject8.optString(strM219));
                    jSONArray = jSONArray2;
                    try {
                        jSONArray.put(jSONObject9);
                        i3++;
                        jSONArray2 = jSONArray;
                    } catch (Exception e3) {
                        e = e3;
                        e.printStackTrace();
                        JSONObject jSONObject10 = new JSONObject();
                        jSONObject10.put(strM477, jSONArray4);
                        jSONObject10.put(C0139.m554(f8short, 216, 7, 3133), jSONObject);
                        jSONObject10.put(strM529, jSONArray);
                        return jSONObject10.toString();
                    }
                }
            }
            jSONArray = jSONArray2;
        } catch (Exception e4) {
            e = e4;
            jSONArray = jSONArray5;
        }
        JSONObject jSONObject11 = new JSONObject();
        jSONObject11.put(strM477, jSONArray4);
        jSONObject11.put(C0139.m554(f8short, 216, 7, 3133), jSONObject);
        jSONObject11.put(strM529, jSONArray);
        return jSONObject11.toString();
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strOptString;
        try {
            String[] strArrSplit = str2.split(C0049.m193(f8short, 223, 2, 3073));
            String str3 = strArrSplit[0];
            if (strArrSplit.length > 1) {
                String str4 = strArrSplit[1];
            }
            if (strArrSplit.length > 2) {
                String str5 = strArrSplit[2];
            }
            HashMap mapF = f();
            mapF.put(C0126.m503(f8short, 225, 10, 2348), C0133.m529(f8short, 235, 111, 435));
            boolean zMatches = str3.matches(C0105.m416(f8short, 346, 12, 2758));
            String strM83 = C0021.m83(f8short, 358, 7, 910);
            String strM65 = C0017.m65(f8short, 365, 6, 2475);
            String strM554 = C0139.m554(f8short, 371, 5, 2459);
            String strM223 = C0056.m223(f8short, 376, 5, 2074);
            String strM355 = C0089.m355(f8short, 381, 5, 751);
            String strM169 = C0043.m169(f8short, 386, 91, 714);
            String strM486 = C0122.m486(f8short, 477, 3, 3067);
            if (zMatches && (str3.contains(strM355) || str3.contains(strM223))) {
                String strX = X1.X(FishCrypto.w(strM169, str3), null, f());
                if (strX.startsWith(C0097.m386(f8short, 480, 1, 2577))) {
                    strOptString = new JSONObject(strX).optString(strM486);
                } else {
                    Matcher matcher = Pattern.compile(C0095.m379(f8short, 481, 21, 2720)).matcher(strX);
                    strOptString = matcher.find() ? matcher.group(1) : "";
                }
                if (!TextUtils.isEmpty(strOptString) && strOptString.contains(C0105.m416(f8short, 502, 4, 1471))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(strM554, 1);
                    jSONObject.put(strM486, FishCrypto.w(strM169, strOptString));
                    jSONObject.put(strM65, new JSONObject(mapF));
                    String strI = AbstractC0280n1.i(str, str2, null, null);
                    if (strI != null) {
                        jSONObject.put(strM83, strI);
                    }
                    return jSONObject.toString();
                }
            } else if (str3.matches(C0014.m54(f8short, 506, 18, 1533))) {
                strOptString = str3;
            } else if (str3.contains(strM355) || str3.contains(strM223) || str3.contains(C0053.m210(f8short, 524, 4, 2431))) {
                Matcher matcher2 = Pattern.compile(C0019.m75(f8short, 528, 35, 2039)).matcher(d(str3));
                if (matcher2.find()) {
                    JSONObject jSONObject2 = new JSONObject(X1.X(FishCrypto.w(strM169, matcher2.group(2)), null, null));
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(C0143.m570(f8short, 563, 4, 2301));
                    strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(strM486) : "";
                    if (TextUtils.isEmpty(strOptString)) {
                        strOptString = jSONObject2.optString(strM486);
                    }
                } else {
                    strOptString = "";
                }
            } else {
                strOptString = g(e(str3));
            }
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = g(e(str3));
            }
            String strI2 = AbstractC0280n1.i(str, str2, null, null);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(strM554, 0);
            jSONObject3.put(C0079.m314(f8short, 567, 7, 3196), "");
            jSONObject3.put(strM486, FishCrypto.w(strM169, strOptString));
            jSONObject3.put(strM65, new JSONObject(mapF));
            if (strI2 != null) {
                jSONObject3.put(strM83, strI2);
            }
            return jSONObject3.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str;
        String str2;
        String strM473 = C0119.m473(f8short, 574, 3, 1143);
        String str3 = "";
        String strM416 = C0105.m416(f8short, 577, 12, 961);
        String strM474 = C0119.m473(f8short, 589, 9, 2412);
        String strM422 = C0106.m422(f8short, 598, 11, 783);
        String strM105 = C0027.m105(f8short, 609, 7, 917);
        String strM554 = C0139.m554(f8short, 616, 6, 2865);
        String strM386 = C0097.m386(f8short, 622, 11, 960);
        String strM459 = C0115.m459(f8short, 633, 8, 3267);
        String strM471 = C0118.m471(f8short, 641, 1, 2144);
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            jSONObject.put(strM554, list.get(0));
            JSONObject jSONObject2 = new JSONObject(h(strM471 + this.l + C0091.m360(f8short, 642, 10, 2355), jSONObject.toString()));
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(C0091.m360(f8short, 652, 3, 1701));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(strM554, list.get(0));
            jSONObject3.put(strM459, jSONObjectOptJSONObject.optString(strM459));
            jSONObject3.put(strM105, jSONObjectOptJSONObject.optString(strM105));
            jSONObject3.put(strM422, jSONObjectOptJSONObject.optString(strM422));
            jSONObject3.put(strM386, jSONObjectOptJSONObject.optString(strM386));
            jSONObject3.put(strM474, jSONObjectOptJSONObject.optString(strM474));
            jSONObject3.put(strM416, jSONObjectOptJSONObject.optString(strM416));
            jSONObject3.put(C0003.m10(f8short, 655, 9, 561), jSONObjectOptJSONObject.optString(C0074.m292(f8short, 664, 9, 1340)));
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(C0044.m175(f8short, 673, 13, 3244));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int i2 = 0;
                while (i2 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(C0091.m360(f8short, 686, 11, 1796));
                    String strOptString = jSONObjectOptJSONObject3.optString(C0046.m182(f8short, 697, 4, 3083));
                    if (!TextUtils.isEmpty(strOptString)) {
                        if (!TextUtils.isEmpty(this.h)) {
                            try {
                                strOptString = strOptString.replaceAll(this.h, str3);
                            } catch (Exception unused) {
                            }
                        }
                        strOptString = strOptString.replaceAll(C0081.m322(f8short, 701, 34, 2947), str3).trim();
                    }
                    String strOptString2 = jSONObjectOptJSONObject3.optString(C0030.m116(f8short, 735, 5, 3048));
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray(C0122.m486(f8short, 740, 4, 693));
                    ArrayList arrayList3 = new ArrayList();
                    JSONArray jSONArray = jSONArrayOptJSONArray;
                    while (i < jSONArrayOptJSONArray2.length()) {
                        JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i);
                        JSONArray jSONArray2 = jSONArrayOptJSONArray2;
                        String strOptString3 = jSONObjectOptJSONObject4.optString(C0092.m365(f8short, 744, 4, 2792));
                        str = str3;
                        try {
                            String strOptString4 = jSONObjectOptJSONObject4.optString(C0087.m346(f8short, 748, 3, 1035));
                            String str4 = strM386;
                            String strOptString5 = jSONObjectOptJSONObject4.optString(C0053.m210(f8short, 751, 13, 1540));
                            JSONObject jSONObject4 = jSONObject3;
                            String strOptString6 = jSONObjectOptJSONObject4.optString(C0032.m126(f8short, 764, 5, 2762));
                            String str5 = strM473;
                            String strOptString7 = jSONObjectOptJSONObject4.optString(C0081.m322(f8short, 769, 3, 416));
                            String strOptString8 = jSONObjectOptJSONObject.optString(strM459);
                            String str6 = strM459;
                            boolean zMatches = strOptString5.matches(C0006.m21(f8short, 772, 12, 2070));
                            JSONObject jSONObject5 = jSONObjectOptJSONObject;
                            String strM539 = C0135.m539(f8short, 784, 1, 2534);
                            if (zMatches) {
                                str2 = strOptString5 + strM539 + strOptString8 + strM539 + strOptString7;
                            } else {
                                str2 = C0116.m463(f8short, 785, 10, 2151) + strOptString2 + C0104.m414(f8short, 795, 5, 503) + Base64.encodeToString(b(strOptString4), 2) + C0056.m223(f8short, 800, 7, 2482) + strOptString6 + strM539 + strOptString8 + strM539 + strOptString7;
                            }
                            arrayList3.add(strOptString3 + C0105.m416(f8short, 807, 1, 483) + str2);
                            i++;
                            jSONArrayOptJSONArray2 = jSONArray2;
                            str3 = str;
                            strM386 = str4;
                            jSONObject3 = jSONObject4;
                            strM473 = str5;
                            strM459 = str6;
                            jSONObjectOptJSONObject = jSONObject5;
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            return str;
                        }
                    }
                    arrayList.add(strOptString);
                    arrayList2.add(TextUtils.join(C0079.m314(f8short, 808, 1, 3157), arrayList3));
                    i2++;
                    jSONArrayOptJSONArray = jSONArray;
                    str3 = str3;
                    strM386 = strM386;
                    jSONObject3 = jSONObject3;
                    strM473 = strM473;
                    strM459 = strM459;
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject;
                    i = 0;
                }
            }
            String str7 = strM473;
            str = str3;
            String str8 = strM386;
            JSONObject jSONObject6 = jSONObjectOptJSONObject;
            JSONObject jSONObject7 = jSONObject3;
            C0294s1.e(arrayList, arrayList2);
            C0294s1.c(this.k, arrayList);
            String strJoin = TextUtils.join(str7, arrayList2);
            jSONObject7.put(C0115.m459(f8short, 809, 13, 685), TextUtils.join(str7, arrayList));
            jSONObject7.put(C0107.m427(f8short, 822, 12, 1731), strJoin);
            jSONObject7.put(str8, FishCrypto.a(jSONObject6.optString(str8)));
            AbstractC0280n1.p(jSONObject6.optString(strM459));
            AbstractC0280n1.q(strJoin);
            JSONObject jSONObject8 = new JSONObject();
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put(jSONObject7);
            jSONObject8.put(C0106.m422(f8short, 834, 4, 633), jSONArray3);
            return jSONObject8.toString();
        } catch (Exception e2) {
            e = e2;
            str = str3;
        }
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        JSONArray jSONArray;
        String strM390 = C0098.m390(f8short, 838, 11, 1951);
        String strM382 = C0096.m382(f8short, 849, 7, 594);
        String strM463 = C0116.m463(f8short, 856, 8, 646);
        String strM516 = C0130.m516(f8short, 864, 6, 1708);
        String strM325 = C0082.m325(f8short, 870, 4, 1945);
        String strM199 = C0050.m199(f8short, 874, 2, 1068);
        String strM529 = C0133.m529(f8short, 876, 4, 937);
        String strM1910 = C0050.m199(f8short, 880, 4, 1228);
        String strM567 = C0142.m567(f8short, 884, 4, 375);
        String strM511 = C0128.m511(f8short, 888, 5, 1916);
        String strM503 = C0126.m503(f8short, 893, 1, 3138);
        JSONArray jSONArray2 = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray3 = jSONArray2;
            try {
                String str3 = strM390;
                jSONObject.put(C0001.m1(f8short, 894, 7, 1090), str);
                if (map != null) {
                    if (map.containsKey(strM511) && !map.get(strM511).isEmpty()) {
                        jSONObject.put(strM511, map.get(strM511));
                    }
                    if (map.containsKey(strM567) && !map.get(strM567).isEmpty()) {
                        jSONObject.put(strM567, map.get(strM567));
                    }
                    if (map.containsKey(strM1910) && !map.get(strM1910).isEmpty()) {
                        jSONObject.put(strM1910, map.get(strM1910));
                    }
                    if (map.containsKey(strM529) && !map.get(strM529).isEmpty()) {
                        jSONObject.put(strM529, map.get(strM529));
                    }
                    if (map.containsKey(strM199) && !map.get(strM199).isEmpty()) {
                        jSONObject.put(C0073.m288(f8short, 901, 4, 2109), map.get(strM199));
                    }
                }
                jSONObject.put(strM325, str2);
                JSONArray jSONArrayOptJSONArray = new JSONObject(h(strM503 + this.l + C0140.m558(f8short, 905, 24, 1096) + str2, jSONObject.toString())).optJSONArray(C0053.m210(f8short, 929, 14, 1585));
                if (jSONArrayOptJSONArray != null) {
                    int i = 0;
                    while (i < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(strM516, jSONObject2.optString(strM516));
                        jSONObject3.put(strM463, jSONObject2.optString(strM463));
                        jSONObject3.put(strM382, jSONObject2.optString(strM382));
                        String str4 = str3;
                        jSONObject3.put(str4, jSONObject2.optString(str4));
                        jSONArray = jSONArray3;
                        try {
                            jSONArray.put(jSONObject3);
                            i++;
                            jSONArray3 = jSONArray;
                            str3 = str4;
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put(strM325, Integer.parseInt(str2));
                            jSONObject4.put(C0050.m199(f8short, 943, 9, 790), Integer.MAX_VALUE);
                            jSONObject4.put(C0130.m516(f8short, 952, 4, 1069), jSONArray);
                            return jSONObject4.toString();
                        }
                    }
                }
                jSONArray = jSONArray3;
            } catch (Exception e2) {
                e = e2;
                jSONArray = jSONArray3;
            }
        } catch (Exception e3) {
            e = e3;
            jSONArray = jSONArray2;
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put(strM325, Integer.parseInt(str2));
        jSONObject5.put(C0050.m199(f8short, 943, 9, 790), Integer.MAX_VALUE);
        jSONObject5.put(C0130.m516(f8short, 952, 4, 1069), jSONArray);
        return jSONObject5.toString();
    }

    public static JSONObject c(String str, JSONArray jSONArray) throws JSONException {
        String str2 = str;
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            jSONArray2.put(new JSONObject().put(C0072.m285(f8short, 971, 1, 931), strOptString).put(C0097.m386(f8short, 972, 1, 2744), strOptString));
        }
        String strM368 = C0008.m31(f8short, 973, 4, 1299).equals(str2) ? C0093.m368(f8short, 977, 2, 908) : str2;
        HashMap map = m;
        if (map.containsKey(strM368)) {
            str2 = (String) map.get(strM368);
        }
        JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v(C0030.m116(f8short, 979, 3, 2223), strM368, C0063.m249(f8short, 982, 4, 2026), str2);
        jSONObjectV.put(C0116.m463(f8short, 986, 5, 822), jSONArray2);
        return jSONObjectV;
    }

    public static String e(String str) {
        Matcher matcher = Pattern.compile(C0098.m390(f8short, 991, 29, 464)).matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, matcher.group(1) + URLEncoder.encode(matcher.group(2), C0019.m75(f8short, 1020, 5, 3272)) + matcher.group(3));
            } catch (Exception unused) {
                return str;
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final String a(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            Cipher cipher = Cipher.getInstance(C0056.m223(f8short, 1025, 20, 2943));
            String str2 = this.b;
            Charset charset = StandardCharsets.UTF_8;
            cipher.init(2, new SecretKeySpec(str2.getBytes(charset), C0001.m1(f8short, 1045, 3, 3060)), new IvParameterSpec(this.c.getBytes(charset)));
            return new String(cipher.doFinal(bArrDecode), charset);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final byte[] b(String str) {
        try {
            Cipher cipher = Cipher.getInstance(C0107.m427(f8short, 1048, 20, 1863));
            String str2 = this.b;
            Charset charset = StandardCharsets.UTF_8;
            cipher.init(1, new SecretKeySpec(str2.getBytes(charset), C0098.m390(f8short, 1068, 3, 738)), new IvParameterSpec(this.c.getBytes(charset)));
            return cipher.doFinal(str.getBytes(charset));
        } catch (Exception e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0122.m486(f8short, 1071, 15, 3138));
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

    public final String d(String str) {
        Matcher matcher = Pattern.compile(C0115.m459(f8short, 1086, 30, 1813)).matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, matcher.group(1) + a(matcher.group(2)) + matcher.group(3));
            } catch (Exception unused) {
                return str;
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0097.m386(f8short, 1116, 13, 2187));
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

    public final HashMap f() {
        HashMap map = new HashMap();
        map.put(C0115.m459(f8short, 1142, 10, 2077), TextUtils.isEmpty(this.f) ? C0097.m386(f8short, 1129, 13, 1702) : this.f);
        return map;
    }

    public final String g(String str) {
        String strM277 = C0070.m277(f8short, 1152, 33, 344);
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String strEncodeToString = Base64.encodeToString(b(strValueOf), 2);
            Request.Builder builderAddHeader = new Request.Builder().url(this.a + FishCrypto.v(C0055.m219(f8short, 1185, 91, 2321)) + C0044.m175(f8short, 1276, 1, 1082) + this.l + C0098.m390(f8short, 1277, 9, 1196)).post(RequestBody.create(MediaType.parse(strM277), str)).addHeader(C0032.m126(f8short, 1286, 10, 3149), TextUtils.isEmpty(this.f) ? C0115.m459(f8short, 1296, 13, 726) : this.f).addHeader(C0137.m545(f8short, 1309, 10, 2435), C0056.m223(f8short, 1319, 10, 450)).addHeader(C0070.m277(f8short, 1329, 12, 3096), strM277).addHeader(C0087.m346(f8short, 1341, 16, 414), TextUtils.isEmpty(this.e) ? "" : this.e);
            if (!TextUtils.isEmpty(this.g)) {
                builderAddHeader.addHeader(C0044.m175(f8short, 1357, 14, 938), this.g);
            }
            builderAddHeader.addHeader(C0118.m471(f8short, 1371, 11, 1273), C0125.m499(f8short, 1382, 5, 818)).addHeader(C0096.m382(f8short, 1387, 18, 485), TextUtils.isEmpty(this.d) ? "" : this.d).addHeader(C0118.m471(f8short, 1405, 19, 827), strValueOf).addHeader(C0112.m445(f8short, 1424, 19, 1725), strEncodeToString);
            return new JSONObject(new JSONObject(a(new JSONObject(X1.I(builderAddHeader.build()).body().string()).getString(C0093.m368(f8short, 1443, 4, 1804)))).getString(C0143.m570(f8short, 1447, 4, 1133))).getString(C0130.m516(f8short, 1451, 3, 1671));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final String h(String str, String str2) {
        try {
            if (TextUtils.isEmpty(this.a)) {
                return "";
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String strEncodeToString = Base64.encodeToString(b(strValueOf), 2);
            Request.Builder builderAddHeader = new Request.Builder().url(this.a + FishCrypto.v(C0122.m486(f8short, 1454, 91, 1994)) + str).post(RequestBody.create(MediaType.parse(C0089.m355(f8short, 1545, 31, 3220)), str2)).addHeader(C0091.m360(f8short, 1576, 10, 1686), TextUtils.isEmpty(this.f) ? C0050.m199(f8short, 1586, 13, 2662) : this.f).addHeader(C0046.m182(f8short, 1599, 12, 1966), C0122.m486(f8short, 1611, 33, 2454));
            String strM499 = C0125.m499(f8short, 1644, 18, 786);
            String str3 = this.d;
            if (str3 == null) {
                str3 = "";
            }
            Request.Builder builderAddHeader2 = builderAddHeader.addHeader(strM499, str3);
            String strM292 = C0074.m292(f8short, 1662, 16, 1249);
            String str4 = this.e;
            if (str4 == null) {
                str4 = "";
            }
            Request.Builder builderAddHeader3 = builderAddHeader2.addHeader(strM292, str4).addHeader(C0090.m358(f8short, 1678, 19, 2413), strValueOf).addHeader(C0130.m516(f8short, 1697, 19, 2098), strEncodeToString).addHeader(C0059.m234(f8short, 1716, 11, 1337), C0091.m360(f8short, 1727, 5, 1425));
            if (!TextUtils.isEmpty(this.g)) {
                builderAddHeader3.addHeader(C0118.m471(f8short, 1732, 14, 473), this.g);
            }
            return a(new JSONObject(X1.I(builderAddHeader3.build()).body().string()).getString(C0003.m10(f8short, 1746, 4, 3093)));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0092.m365(f8short, 1750, 11, 1233));
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
        String strTrim;
        String strM102 = C0026.m102(f8short, 1761, 4, 2417);
        super.init(context, str);
        try {
            JSONObject jSONObject = new JSONObject(FishCrypto.g(str));
            this.f = jSONObject.optString(C0106.m422(f8short, 1765, 2, 3143), "");
            String strOptString = jSONObject.optString(C0047.m186(f8short, 1767, 3, 714), jSONObject.optString(C0081.m322(f8short, 1770, 4, 1695), ""));
            this.a = strOptString;
            boolean zIsEmpty = TextUtils.isEmpty(strOptString);
            String strM529 = C0133.m529(f8short, 1774, 4, 2229);
            String strM83 = C0021.m83(f8short, 1778, 1, 1723);
            if (zIsEmpty) {
                String strOptString2 = jSONObject.optString(C0091.m360(f8short, 1779, 4, 2562), "");
                if (!TextUtils.isEmpty(strOptString2)) {
                    String strX = X1.X(strOptString2, null, f());
                    if (!TextUtils.isEmpty(strX)) {
                        for (String str2 : strX.split(strM83)) {
                            String strTrim2 = str2.trim();
                            if (!TextUtils.isEmpty(strTrim2) && strTrim2.startsWith(strM529)) {
                                this.a = strTrim2;
                                break;
                            }
                        }
                    }
                }
            }
            if (this.a.endsWith(C0092.m365(f8short, 1783, 4, 1132))) {
                String strX2 = X1.X(this.a, null, f());
                if (!TextUtils.isEmpty(strX2)) {
                    for (String str3 : strX2.split(strM83)) {
                        String strTrim3 = str3.trim();
                        if (!TextUtils.isEmpty(strTrim3) && strTrim3.startsWith(strM529)) {
                            this.a = strTrim3;
                            break;
                        }
                    }
                }
            }
            this.b = jSONObject.optString(C0081.m322(f8short, 1787, 7, 342), jSONObject.optString(C0079.m314(f8short, 1794, 7, 589), jSONObject.optString(C0085.m339(f8short, 1801, 3, 730), "")));
            this.c = jSONObject.optString(C0133.m529(f8short, 1804, 6, 2450), jSONObject.optString(C0143.m570(f8short, 1810, 6, 1188), jSONObject.optString(C0046.m182(f8short, 1816, 2, 2960), "")));
            if (!TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.c)) {
                this.c = this.b;
            }
            this.d = jSONObject.optString(C0130.m516(f8short, 1818, 8, 2037), jSONObject.optString(C0103.m408(f8short, 1826, 8, 376), ""));
            this.e = jSONObject.optString(C0143.m570(f8short, 1834, 7, 1757), "");
            this.g = jSONObject.optString(C0128.m511(f8short, 1841, 5, 3010), "");
            String strOptString3 = jSONObject.optString(strM102, "");
            if (TextUtils.isEmpty(strOptString3)) {
                strTrim = "";
            } else {
                strTrim = strOptString3.trim();
                if (strTrim.matches(C0050.m199(f8short, 1846, 10, 2777))) {
                    strTrim = strM102 + strTrim.substring(0, 1).toUpperCase() + strTrim.substring(1);
                }
            }
            this.i = strTrim;
            this.j = jSONObject.optString(C0090.m358(f8short, 1856, 6, 1345), "");
            String strOptString4 = jSONObject.optString(C0043.m169(f8short, 1862, 3, 1833), "");
            this.l = C0092.m365(f8short, 1865, 1, 1255).equals(strOptString4) ? C0117.m467(f8short, 1866, 16, 1098) : C0063.m249(f8short, 1882, 1, 910).equals(strOptString4) ? C0056.m223(f8short, 1883, 6, 2004) : C0018.m70(f8short, 1889, 15, 2337);
            this.h = jSONObject.optString(C0001.m1(f8short, 1904, 12, 1907), jSONObject.optString(C0073.m288(f8short, 1916, 6, 551), ""));
            this.k = jSONObject.optString(C0027.m105(f8short, 1922, 8, 1042), "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0116.m463(f8short, 1930, 13, 1742));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0050.m199(f8short, 1943, 13, 511));
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

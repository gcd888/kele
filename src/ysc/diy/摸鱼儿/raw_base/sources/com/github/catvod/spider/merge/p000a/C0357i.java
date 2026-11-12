package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.C0141;
import com.github.catvod.spider.merge.A.C0002;
import com.github.catvod.spider.merge.B.C0004;
import com.github.catvod.spider.merge.B.C0005;
import com.github.catvod.spider.merge.D.C0007;
import com.github.catvod.spider.merge.D.C0012;
import com.github.catvod.spider.merge.E.C0013;
import com.github.catvod.spider.merge.E.C0015;
import com.github.catvod.spider.merge.F.a;
import com.github.catvod.spider.merge.G.C0022;
import com.github.catvod.spider.merge.G.C0023;
import com.github.catvod.spider.merge.G.C0024;
import com.github.catvod.spider.merge.G.n;
import com.github.catvod.spider.merge.G.o;
import com.github.catvod.spider.merge.I.C0025;
import com.github.catvod.spider.merge.K.C0029;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.N.C0035;
import com.github.catvod.spider.merge.N.C0036;
import com.github.catvod.spider.merge.N.C0037;
import com.github.catvod.spider.merge.O.C0038;
import com.github.catvod.spider.merge.O.C0039;
import com.github.catvod.spider.merge.Q.C0040;
import com.github.catvod.spider.merge.X.C0052;
import com.github.catvod.spider.merge.Z.C0054;
import com.github.catvod.spider.merge.b0.C0060;
import com.github.catvod.spider.merge.b0.C0061;
import com.github.catvod.spider.merge.c0.C0065;
import com.github.catvod.spider.merge.d0.C0068;
import com.github.catvod.spider.merge.d0.C0069;
import com.github.catvod.spider.merge.e0.C0075;
import com.github.catvod.spider.merge.f0.C0078;
import com.github.catvod.spider.merge.f0.C0080;
import com.github.catvod.spider.merge.h0.C0086;
import com.github.catvod.spider.merge.j0.C0094;
import com.github.catvod.spider.merge.k0.C0099;
import com.github.catvod.spider.merge.k0.C0100;
import com.github.catvod.spider.merge.p0.C0110;
import com.github.catvod.spider.merge.p0.C0111;
import com.github.catvod.spider.merge.p003d.C0066;
import com.github.catvod.spider.merge.p007h.C0083;
import com.github.catvod.spider.merge.p008i.C0088;
import com.github.catvod.spider.merge.p013o.C0108;
import com.github.catvod.spider.merge.p015s.b;
import com.github.catvod.spider.merge.p017u.C0129;
import com.github.catvod.spider.merge.p018v.C0132;
import com.github.catvod.spider.merge.p019w.C0134;
import com.github.catvod.spider.merge.p020x.C0138;
import com.github.catvod.spider.merge.q0.C0113;
import com.github.catvod.spider.merge.t0.C0123;
import com.github.catvod.spider.merge.t0.C0124;
import com.github.catvod.utils.C0144;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moyu.fucking.C0146;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0154;
import moyu.fucking.C0155;
import moyu.fucking.C0157;
import moyu.fucking.C0159;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0170;
import moyu.fucking.C0174;
import moyu.fucking.C0175;
import moyu.fucking.C0177;
import moyu.fucking.C0178;
import moyu.fucking.C0179;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0184;
import moyu.fucking.C0186;
import moyu.fucking.C0188;
import moyu.fucking.C0189;
import moyu.fucking.C0191;
import moyu.fucking.C0194;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0201;
import moyu.fucking.C0204;
import moyu.fucking.C0205;
import moyu.fucking.C0209;
import moyu.fucking.C0210;
import moyu.fucking.C0213;
import moyu.fucking.C0218;
import moyu.fucking.C0219;
import moyu.fucking.C0221;
import moyu.fucking.C0224;
import moyu.fucking.C0225;
import moyu.fucking.C0231;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0357i {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f238short = {407, 433, 423, 432, 495, 387, 421, 423, 428, 438, 1070, 1036, 1049, 1034, 1039, 1039, 1026, 1100, 1110, 1101, 1107, 1091, 1099, 1071, 1034, 1037, 1046, 1051, 1112, 1091, 1058, 1037, 1031, 1041, 1036, 1034, 1031, 1091, 1106, 1105, 1112, 1091, 1072, 1070, 1102, 1083, 1115, 1107, 1107, 1098, 1091, 1058, 1043, 1043, 1039, 1030, 1076, 1030, 1025, 1064, 1034, 1047, 1100, 1110, 1104, 1108, 1101, 1104, 1109, 1091, 1099, 1064, 1067, 1079, 1070, 1071, 1103, 1091, 1039, 1034, 1032, 1030, 1091, 1060, 1030, 1024, 1032, 1036, 1098, 1091, 1056, 1035, 1041, 1036, 1038, 1030, 1100, 1106, 1107, 1106, 1101, 1107, 1101, 1111, 1114, 1110, 1106, 1101, 1111, 1107, 1091, 1072, 1026, 1029, 1026, 1041, 1034, 1100, 1110, 1104, 1108, 1101, 1104, 1109, 1694, 1724, 1724, 1722, 1711, 1707, 1586, 1571, 1571, 1599, 1594, 1584, 1586, 1575, 1594, 1596, 1597, 1660, 1593, 1568, 1596, 1597, 1663, 1651, 1575, 1590, 1579, 1575, 1660, 1571, 1599, 1586, 1594, 1597, 1663, 1651, 1657, 1660, 1657, 1462, 1434, 1435, 1409, 1424, 1435, 1409, 1496, 1441, 1420, 1413, 1424, 1095, 1110, 1110, 1098, 1103, 1093, 1095, 1106, 1103, 1097, 1096, 1033, 1118, 1035, 1105, 1105, 1105, 1035, 1088, 1097, 1108, 1099, 1035, 1107, 1108, 1098, 1091, 1096, 1093, 1097, 1090, 1091, 1090, 2011, 2022, 2045, 2035, 2045, 2042, 1248, 1276, 1276, 1272, 1275, 1202, 1191, 1191, 1272, 1257, 1254, 1190, 1258, 1257, 1249, 1260, 1277, 1190, 1259, 1255, 1253, 2911, 2920, 2923, 2920, 2943, 2920, 2943, 1952, 1980, 1980, 1976, 1979, 2034, 2023, 2023, 1976, 1961, 1958, 2022, 1962, 1961, 1953, 1964, 1981, 2022, 1963, 1959, 1957, 2023, 570, 600, 2293, 2302, 2273, 2230, 2288, 2203, 2194, 2975, 2964, 2955, 3036, 2970, 3063, 3064, 2446, 2437, 2457, 2509, 2443, 2540, 2537, 1330, 1702, 1706, 1704, 1717, 1708, 1705, 1696, 1773, 1771, 1771, 1771, 1772, 3131, 3132, 3106, 3111, 3110, 3070, 3035, 3009, 3014, 2962, 3035, 3009, 2962, 3031, 3039, 3010, 3014, 3019, 2972, 747, 732, 712, 716, 732, 714, 717, 732, 733, 665, 732, 725, 732, 724, 732, 727, 717, 665, 730, 726, 716, 727, 717, 665, 697, 752, 746, 697, 757, 764, 746, 746, 697, 749, 753, 760, 759, 697, 739, 764, 747, 758, 695, 1940, 1937, 1943, 1936, 2006, 2000, 2000, 2000, 2007, 2021, 2019, 2034, 2036, 2036, 1698, 1765, 1769, 1780, 1727, 3139, 1493, 1439, 1415, 1480, 2833, 3093, 3156, 3143, 3080, 1095, 647, 720, 724, 718, 725, 666, 1042, 1909, 1904, 1888, 1898, 1896, 1141, 2211, 2214, 2301, 2231, 2226, 2238, 758, 748, 747, 738, 745, 736, 753, 746, 747, 712, 740, 757, 685, 683, 683, 683, 684, 629, 610, 610, 639, 610, 2339, 2356, 2356, 2319, 2344, 2336, 2345, 3178, 3181, 3192, 3181, 3180, 3178, 1322, 1341, 1341, 1313, 1312, 31763, 21821, 21337, -30899, 2642, 2632, 3046, 3040, 3057, 3063, 3063, 2969, 3079, 3099, 3099, 3103, 3100, 3157, 3136, 3136, 3103, 3086, 3100, 3100, 3103, 3072, 3101, 3099, 3137, 3085, 3086, 3078, 3083, 3098, 3137, 3084, 3072, 3074, 3136, 3097, 3164, 3136, 3075, 3072, 3080, 3078, 3073, 3136, 3074, 3086, 3078, 3073, 3136, 3102, 3101, 3085, 3083, 3098, 3100, 3100, 3075, 3072, 3080, 3078, 3073, 3152, 3097, 3154, 1506, 1534, 1534, 1530, 1529, 1456, 1445, 1445, 1530, 1515, 1529, 1529, 1530, 1509, 1528, 1534, 1444, 1512, 1515, 1507, 1518, 1535, 1444, 1513, 1509, 1511, 1445, 1513, 1506, 1515, 1508, 1508, 1519, 1510, 1445, 1535, 1508, 1507, 1513, 1515, 1529, 1534, 1461, 1513, 1506, 1515, 1508, 1508, 1519, 1510, 1493, 1507, 1518, 1463, 2466, 2544, 2548, 2536, 2489, 2538, 2529, 2544, 2528, 2541, 2551, 2543, 2466, 2535, 2533, 2536, 2536, 2534, 2533, 2535, 2543, 2489, 2466, 2533, 2548, 2541, 2546, 2529, 2550, 2489, 2546, 2487, 2466, 2544, 2544, 2489, 1762, 1691, 1785, 449, 458, 451, 460, 460, 455, 462, 509, 468, 1775, 2109, 2169, 2175, 2158, 2152, 2152, 2086, 2642, 2561, 2633, 2642, 2584, 2587, 2579, 2589, 2586, 2594, 2577, 2566, 2567, 2589, 2587, 2586, 2633, 2562, 2624, 2642, 2565, 2566, 2583, 2587, 2576, 2577, 2633, 2629, 2642, 2560, 2564, 2584, 2633, 2586, 2577, 2560, 2576, 2589, 2567, 2591, 2642, 2581, 2564, 2589, 2562, 2577, 2566, 2633, 2562, 2631, 2642, 2560, 2560, 2633, 2718, 2764, 2762, 2777, 2779, 2781, 2769, 2780, 2693, 2718, 2779, 2777, 2772, 2772, 2778, 2777, 2779, 2771, 2693, 2778, 2780, 2791, 2791, 2779, 2778, 2763, 2791, 2791, 2779, 2765, 2760, 2763, 2764, 2764, 2034, 2032, 2017, 2007, 2042, 2033, 2028, 1981, 1979, 1979, 1979, 1980, 2938, 1331, 1743, 1742, 2530, 1167, 1177, 1160, 1233, 1183, 1171, 1171, 1175, 1173, 1177, 1934, 1933, 1925, 1928, 1945, 32246, 21806, 32243, 21725, 27032, 22807, 1996, 1994, 2012, 2012, 2010, 1996, 1996, 2664, 2670, 2687, 2681, 2681, 27824, 25493, 29195, 23333, 30406, 25713, 23873, -30379, 1098, 1104, 1288, 1291, 1283, 1294, 1311, 867, 847, 847, 843, 841, 837, 2274, 2295, 2253, 2272, 1477, 1436, 1499, 1484, 1484, 1489, 1484, 1436, 1412, 1436, 25236, 29637, 23275, 1436, 1475, 2821, 2244, 2264, 2264, 2268, 2271, 2198, 2179, 2179, 2268, 2253, 2242, 2178, 2254, 2253, 2245, 2248, 2265, 2178, 2255, 2243, 2241, 2179, 2253, 2268, 2245, 2179, 2250, 2245, 2240, 2249, 2241, 2249, 2264, 2253, 2271, 2195, 2250, 2271, 2245, 2248, 2271, 2193, 2603, 2665, 2657, 2660, 2659, 2662, 2608, 2620, 816, 807, 807, 827, 826, 1534, 1447, 1504, 1527, 1527, 1514, 1527, 1447, 1471, 1447, -31182, 22099, 24578, 19315, 19044, 26090, 23732, -30560, 1447, 1528, 3311, 3304, 3296, 3305, 1718, 1703, 1714, 1710, 2418, 2404, 2419, 2423, 2404, 2419, 2398, 2407, 2408, 2413, 2404, 2415, 2400, 2412, 2404, 2378, 1259, 1252, 1249, 1256, 1251, 1260, 1248, 1256, 2272, 2289, 2274, 2293, 2302, 2276, 2255, 2272, 2289, 2276, 2296, 2930, 2921, 2901, 2930, 2932, 2927, 2920, 2913, 2862, 2856, 2856, 2856, 2863, 2315, 2386, 2325, 2306, 2306, 2335, 2306, 2386, 2378, 2386, 27895, 18310, 18301, 21032, 24152, 2386, 2317, 3295, 3289, 3279, 3278, 2882, 2905, 2882, 2903, 2906, 2598, 2619, 2611, 2602, 2609, 2598, 2588, 2615, 2602, 2606, 2598, 595, 603, 595, 604, 603, 588, 1449, 1446, 1450, 1443, 1451, 1468, 2957, 2952, 2973, 2952, 2159, 2150, 2164, 2116, 2152, 2152, 2156, 2158, 
    2146, 2231, 2225, 2208, 2214, 2214, 1865, 1861, 1861, 1857, 1859, 1871, 2781, 2753, 2753, 2757, 2758, 2703, 2714, 2714, 2776, 2775, 2769, 2715, 2775, 2772, 2780, 2769, 2752, 2715, 2774, 2778, 2776, 2714, 2752, 2758, 2768, 2759, 2765, 2714, 2755, 2692, 2714, 2780, 2779, 2771, 2778, 2714, 2770, 2768, 2753, 2698, 2772, 2757, 2757, 2779, 2772, 2776, 2768, 2696, 2775, 2772, 2780, 2769, 2752, 2775, 2778, 2765, 2772, 2757, 2757, 2707, 2771, 2780, 2768, 2777, 2769, 2758, 2696, 2798, 2711, 2775, 2770, 2794, 2780, 2776, 2772, 2770, 2768, 2711, 2713, 2711, 2776, 2768, 2776, 2775, 2768, 2759, 2711, 2713, 2711, 2752, 2780, 2769, 2711, 2713, 2711, 2772, 2755, 2772, 2753, 2772, 2759, 2711, 2713, 2711, 2772, 2755, 2772, 2753, 2772, 2759, 2794, 2776, 2768, 2776, 2775, 2768, 2759, 2711, 2713, 2711, 2752, 2758, 2768, 2759, 2779, 2772, 2776, 2768, 2711, 2713, 2711, 2769, 2780, 2758, 2757, 2777, 2772, 2764, 2779, 2772, 2776, 2768, 2711, 2792, 1666, 1679, 1685, 1686, 1674, 1671, 1695, 1672, 1671, 1675, 1667, 2591, 2585, 2575, 2584, 2564, 2571, 2567, 2575, 2541, 2538, 2528, 2536, 2541, 2530, 2542, 2534, 31928, 21600, 32750, 26865, 2872, 2850, 2830, 2855, 2872, 2849, 2823, 2845, 2872, 2823, 2846, 2201, 2193, 2201, 2198, 2193, 2182, 2219, 2176, 2189, 2180, 2193, 1795, 1820, 1797, 1834, 1817, 1808, 1795, 1808, 1817, 2414, 2417, 2408, 25945, -27859, 30239, 24832, 318, 318, 318, 318, 362, 266, 266, 362, 291, 291, 1976, 1956, 1956, 1952, 1955, 2026, 2047, 2047, 1952, 1969, 1982, 2046, 1970, 1969, 1977, 1972, 1957, 2046, 1971, 1983, 1981, 2047, 1969, 1952, 1977, 2047, 1953, 1957, 1983, 1956, 1969, 2031, 1971, 1976, 1973, 1971, 1979, 1974, 1954, 1973, 1973, 2029, 2017, 2038, 1971, 1976, 1973, 1971, 1979, 1973, 1960, 1952, 1977, 1954, 1973, 2029, 2017, 2548, 2543, 2548, 2529, 2540, 2527, 2531, 2529, 2544, 2529, 2531, 2537, 2548, 2553, 2062, 2056, 2078, 2079, 2084, 2072, 2074, 2059, 2074, 2072, 2066, 2063, 2050, 1787, 1789, 1775, 1769, 1771, 1745, 1790, 1771, 1788, 1773, 1771, 1760, 1786, 2452, 2463, 2432, 2519, 3056, 3027, 3035, 3062, 3015, 3051, 3015, 3036, 3066, 3027, 3036, 3030, 3038, 3031, 3008, 2972, 3029, 3031, 3014, 3047, 3009, 3031, 3008, 3067, 3036, 3028, 3037, 2962, 3031, 3008, 3008, 3037, 3008, 2952, 2962, 1044, 1038, 1033, 1024, 1035, 1026, 1043, 1032, 1033, 1066, 1030, 1047, 1103, 1097, 1097, 1097, 1102, 411, 408, 425, 389, 398, 399, 419, 391, 395, 397, 399, 447, 408, 390, 1680, 1671, 1671, 1690, 1671, 2782, 2756, 2762, 2755, 1508, 1523, 1523, 1519, 1518, 1286, 1306, 1306, 1310, 1309, 1364, 1345, 1345, 1305, 1295, 1310, 1310, 1295, 1309, 1309, 1344, 1292, 1295, 1287, 1290, 1307, 1344, 1293, 1281, 1283, 1345, 1305, 1310, 1345, 1361, 1311, 1308, 1282, 1281, 1289, 1287, 1280, 1352, 1306, 1363, 2446, 2450, 2450, 2454, 2453, 2524, 2505, 2505, -31260, 21893, 28712, 22790, 18655, 30887, 32338, -27830, -29252, 1663, 1651, 1584, 1596, 1591, 1590, 1641, 1651, 2645, 2633, 2633, 2637, 2638, 2567, 2578, 2578, 2637, 2652, 2638, 2638, 2637, 2642, 2639, 2633, 2579, 2655, 2652, 2644, 2649, 2632, 2579, 2654, 2642, 2640, 2578, 2635, 2575, 2578, 2652, 2637, 2644, 2578, 2650, 2648, 2633, 2636, 2639, 2654, 2642, 2649, 2648, 2562, 2641, 2637, 2560, 2637, 2654, 2587, 2658, 2560, 656, 660, 670, 652, 651, 661, 876, 815, 824, 824, 805, 824, 887, 890, 876, 825, 803, 813, 804, 887, 958, 1019, 1013, 1020, 933, 1012, 1015, 1023, 1009, 1014, 958, 1012, 1000, 933, 1000, 1019, 958, 1004, 1000, 1012, 933, 1014, 1021, 1004, 1020, 1009, 1003, 1011, 958, 1005, 1017, 1015, 1014, 1012, 993, 933, 958, 1019, 1012, 1009, 1021, 1014, 1004, 967, 1009, 1020, 933, 958, 1017, 1020, 1017, 1000, 1004, 1021, 1002, 933, 939, 958, 1019, 1012, 1009, 1021, 1014, 1004, 933, 958, 1001, 1002, 1012, 1015, 1023, 1009, 1014, 1022, 1002, 1015, 1013, 933, 1000, 1019, 958, 1007, 1021, 1019, 1008, 1017, 1004, 933, 936, 958, 1004, 1002, 1017, 1019, 1021, 1009, 1020, 933, 773, 774, 824, 795, 787, 797, 794, 801, 774, 792, -29954, 23199, 18373, 30653, 29000, 20600, -31636, 2419, 2409, 403, 405, 387, 404, 459, 391, 385, 387, 392, 402, 2128, 2162, 2151, 2164, 2161, 2161, 2172, 2098, 2088, 2099, 2093, 2109, 2101, 2122, 2164, 2163, 2169, 2162, 2154, 2158, 2109, 2131, 2121, 2109, 2092, 2093, 2099, 2093, 2086, 2109, 2122, 2164, 2163, 2091, 2089, 2086, 2109, 2149, 2091, 2089, 2100, 2109, 2140, 2157, 2157, 2161, 2168, 2122, 2168, 2175, 2134, 2164, 2153, 2098, 2088, 2094, 2090, 2099, 2094, 2091, 2109, 2101, 2134, 2133, 2121, 2128, 2129, 2097, 2109, 2161, 2164, 2166, 2168, 2109, 2138, 2168, 2174, 2166, 2162, 2100, 2109, 2142, 2165, 2159, 2162, 2160, 2168, 2098, 2084, 2084, 2099, 2093, 2099, 2089, 2085, 2089, 2089, 2099, 2088, 2092, 2109, 2126, 2172, 2171, 2172, 2159, 2164, 2098, 2088, 2094, 2090, 2099, 2094, 2091, 2564, 2591, 2578, 2563, 2581, 2638, 2632, 2632, 2632, 2639, 2301, 2303, 2286, 2264, 2275, 2286, 2303, 2281, 2226, 2228, 2228, 2228, 2227, 1026, 1025, 1033, 1028, 1045, 25055, 28944, -27668, -29414, 29708, 23764, -32315, 20900, 19710, 31878, 31347, 23363, -28841, 584, 594};
    public ScheduledExecutorService a;
    public volatile boolean c;
    public volatile boolean d;
    public String b = (String) C0195.n(43185);
    public final Map e = (Map) C0184.n(91372, null, new Object[]{new a[]{new a((String) C0149.n(63176, null, new Object[]{(short[]) C0184.n(11174), 0, Integer.valueOf(C0065.f274 ^ 25), 450}), (String) C0198.n(39623, null, new Object[]{(short[]) C0184.n(11174), 10, Integer.valueOf(C0088.f297 ^ 409), 1123})), new a((String) C0162.n(52865, null, new Object[]{(short[]) C0184.n(11174), 124, Integer.valueOf(C0039.f195 ^ 792), 1759}), (String) C0162.n(76230, null, new Object[]{(short[]) C0184.n(11174), 130, Integer.valueOf(C0002.f158 ^ 548), 1619})), new a((String) C0224.n(25428, null, new Object[]{(short[]) C0184.n(11174), 163, Integer.valueOf(C0037.f193 ^ 800), 1525}), (String) C0198.n(62249, null, new Object[]{(short[]) C0184.n(11174), 175, Integer.valueOf(C0075.f284 ^ 803), 1062})), new a((String) C0149.n(63176, null, new Object[]{(short[]) C0184.n(11174), 208, Integer.valueOf(C0078.f287 ^ (-696)), 1940}), (String) C0191.n(93496, null, new Object[]{(short[]) C0184.n(11174), 214, Integer.valueOf(C0004.f160 ^ (-327)), 1160})), new a((String) C0162.n(24506, null, new Object[]{(short[]) C0184.n(11174), 235, Integer.valueOf(C0141.f351 ^ (-778)), 2829}), (String) C0162.n(83354, null, new Object[]{(short[]) C0184.n(11174), 242, Integer.valueOf(C0004.f160 ^ (-326)), 1992}))}});

    public C0357i(int i) throws Throwable {
        int iIntValue = ((Integer) C0184.n(83781, null, new Object[0])).intValue();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (iIntValue >= 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0178.n(16623, null, new Object[]{(String) C0191.n(87373, null, new Object[]{(String) C0184.n(93259)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    public static String c(long j) {
        long j2 = C0069.f278 ^ 1301;
        long j3 = 1109 ^ ((long) C0113.f322);
        long j4 = j2 * j3;
        long j5 = j2 * j4;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (j < j3) {
                        i = 1709;
                    }
                    break;
                case 204:
                    StringBuilder sb = new StringBuilder();
                    String str = (String) C0198.n(89992, sb, new Object[0]);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return str;
                        }
                    }
                    break;
                case 239:
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                if (j < j4) {
                                    i3 = 48736;
                                }
                                break;
                            case 47384:
                                int i4 = 48891;
                                while (true) {
                                    i4 ^= 48908;
                                    switch (i4) {
                                        case 22:
                                            break;
                                        case 53:
                                            double d = j;
                                            double d2 = j5;
                                            ((Boolean) C0189.n(62661, null, new Object[]{Double.valueOf(d)})).booleanValue();
                                            ((Boolean) C0189.n(62661, null, new Object[]{Double.valueOf(d2)})).booleanValue();
                                            return (String) C0194.n(82620, null, new Object[]{(String) C0198.n(43897, null, new Object[]{(short[]) C0184.n(11174), 280, Integer.valueOf(C0144.f354 ^ (-606)), 2475}), (Object[]) C0184.n(40126, null, new Object[]{new Object[]{(Double) C0189.n(91561, null, new Object[]{Double.valueOf(d / d2)})}, 1})});
                                        case 503:
                                            if (j < j5) {
                                                i4 = 49635;
                                            }
                                            break;
                                        case 32495:
                                            double d3 = j;
                                            double d4 = j4;
                                            ((Boolean) C0189.n(62661, null, new Object[]{Double.valueOf(d3)})).booleanValue();
                                            ((Boolean) C0189.n(62661, null, new Object[]{Double.valueOf(d4)})).booleanValue();
                                            String str2 = (String) C0194.n(82620, null, new Object[]{(String) C0195.n(99405, null, new Object[]{(short[]) C0184.n(11174), 273, Integer.valueOf(C0035.f191 ^ 315), 3002}), (Object[]) C0184.n(40126, null, new Object[]{new Object[]{(Double) C0189.n(91561, null, new Object[]{Double.valueOf(d3 / d4)})}, 1})});
                                            int i5 = 49666;
                                            while (true) {
                                                i5 ^= 49683;
                                                switch (i5) {
                                                    case 17:
                                                        i5 = 49697;
                                                        break;
                                                    case 50:
                                                        return str2;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i4 = 48953;
                                }
                                break;
                            case 47417:
                                double d5 = j;
                                double d6 = j3;
                                ((Boolean) C0189.n(62661, null, new Object[]{Double.valueOf(d5)})).booleanValue();
                                ((Boolean) C0189.n(62661, null, new Object[]{Double.valueOf(d6)})).booleanValue();
                                String str3 = (String) C0194.n(82620, null, new Object[]{(String) C0162.n(52865, null, new Object[]{(short[]) C0184.n(11174), 266, Integer.valueOf(C0124.f333 ^ (-756)), 2256}), (Object[]) C0184.n(40126, null, new Object[]{new Object[]{(Double) C0189.n(91561, null, new Object[]{Double.valueOf(d5 / d6)})}, 1})});
                                int i6 = 48767;
                                while (true) {
                                    i6 ^= 48784;
                                    switch (i6) {
                                        case 14:
                                            return str3;
                                        case 239:
                                            i6 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                        i3 = 48705;
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:148:0x04f8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:155:0x050d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x01af. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x0259. Please report as an issue. */
    public static String d(List list) throws Throwable {
        List list2;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = list != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0219.n(37451, list, new Object[0])).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = zBooleanValue ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                ArrayList arrayList = new ArrayList();
                                Iterator it = (Iterator) C0221.n(11992, list, new Object[0]);
                                while (true) {
                                    boolean zBooleanValue2 = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
                                    String str = (String) C0224.n(99346, null, new Object[]{(short[]) C0184.n(11174), 287, 1, 1289});
                                    int i3 = 48767;
                                    while (true) {
                                        i3 ^= 48784;
                                        switch (i3) {
                                            case 14:
                                                break;
                                            case 45:
                                                String str2 = (String) C0175.n(20734, null, new Object[]{str, arrayList});
                                                C0184.n(23083, null, new Object[]{str2, (String) C0198.n(39623, null, new Object[]{(short[]) C0184.n(11174), 362, Integer.valueOf(C0099.f308 ^ 817), 2046})});
                                                return str2;
                                            case 76:
                                                break;
                                            case 239:
                                                i3 = zBooleanValue2 ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    String str3 = (String) C0221.n(87284, it, new Object[0]);
                                    Pattern pattern = (Pattern) C0195.n(73905, null, new Object[]{str});
                                    C0184.n(23083, null, new Object[]{pattern, (String) C0224.n(52346, null, new Object[]{(short[]) C0184.n(11174), 288, Integer.valueOf(C0113.f322 ^ 89), 1733})});
                                    C0159.n(35468, null, new Object[]{str3, (String) C0198.n(98419, null, new Object[]{(short[]) C0184.n(11174), 300, Integer.valueOf(C0080.f289 ^ 254), 3154})});
                                    C0184.n(3586, null, new Object[]{0});
                                    Matcher matcher = (Matcher) C0178.n(2458, pattern, new Object[]{str3});
                                    boolean zBooleanValue3 = ((Boolean) C0204.n(77326, matcher, new Object[0])).booleanValue();
                                    int i4 = 48891;
                                    while (true) {
                                        i4 ^= 48908;
                                        switch (i4) {
                                            case 22:
                                                break;
                                            case 53:
                                                ArrayList arrayList2 = new ArrayList(C0113.f322 ^ 95);
                                                int i5 = 0;
                                                while (true) {
                                                    ((Boolean) C0179.n(13382, arrayList2, new Object[]{(String) C0149.n(67310, (CharSequence) C0184.n(82790, str3, new Object[]{Integer.valueOf(i5), Integer.valueOf(((Integer) C0205.n(4923, matcher, new Object[0])).intValue())}), new Object[0])})).booleanValue();
                                                    int iIntValue = ((Integer) C0204.n(64744, matcher, new Object[0])).intValue();
                                                    boolean zBooleanValue4 = ((Boolean) C0204.n(77326, matcher, new Object[0])).booleanValue();
                                                    int i6 = 49790;
                                                    while (true) {
                                                        i6 ^= 49807;
                                                        switch (i6) {
                                                            case 18:
                                                                break;
                                                            case 51:
                                                                i5 = iIntValue;
                                                                break;
                                                            case 84:
                                                                break;
                                                            case 241:
                                                                i6 = !zBooleanValue4 ? 49883 : 49852;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        ((Boolean) C0179.n(13382, arrayList2, new Object[]{(String) C0149.n(67310, (CharSequence) C0184.n(82790, str3, new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(((Integer) C0149.n(89092, str3, new Object[0])).intValue())}), new Object[0])})).booleanValue();
                                                        list2 = arrayList2;
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 503:
                                                i4 = !zBooleanValue3 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                List list3 = (List) C0184.n(94877, null, new Object[]{(String) C0149.n(67310, str3, new Object[0])});
                                                int i7 = 49666;
                                                while (true) {
                                                    i7 ^= 49683;
                                                    switch (i7) {
                                                        case 17:
                                                            i7 = 49697;
                                                            break;
                                                        case 50:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    list2 = list3;
                                                    break;
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    boolean zBooleanValue5 = ((Boolean) C0219.n(37451, list2, new Object[0])).booleanValue();
                                    Object obj = (n) C0184.n(57754);
                                    int i8 = 49914;
                                    while (true) {
                                        i8 ^= 49931;
                                        switch (i8) {
                                            case 497:
                                                i8 = !zBooleanValue5 ? 50658 : 50627;
                                                break;
                                            case 1711:
                                                break;
                                            case 1736:
                                                break;
                                            case 1769:
                                                ListIterator listIterator = (ListIterator) C0184.n(8303, list2, new Object[]{Integer.valueOf(((Integer) C0154.n(77394, list2, new Object[0])).intValue())});
                                                while (true) {
                                                    boolean zBooleanValue6 = ((Boolean) C0184.n(64989, listIterator, new Object[0])).booleanValue();
                                                    int i9 = 50689;
                                                    while (true) {
                                                        i9 ^= 50706;
                                                        switch (i9) {
                                                            case 19:
                                                                i9 = zBooleanValue6 ? 50782 : 50751;
                                                                break;
                                                            case 45:
                                                                break;
                                                            case 50:
                                                                break;
                                                            case 76:
                                                                int iIntValue2 = ((Integer) C0149.n(89092, (String) C0184.n(61495, listIterator, new Object[0]), new Object[0])).intValue();
                                                                int i10 = 50813;
                                                                while (true) {
                                                                    i10 ^= 50830;
                                                                    switch (i10) {
                                                                        case 18:
                                                                            break;
                                                                        case 53:
                                                                            int iIntValue3 = ((((Integer) C0184.n(17207, listIterator, new Object[0])).intValue() + 3) + 1) - 3;
                                                                            int i11 = 51712;
                                                                            while (true) {
                                                                                i11 ^= 51729;
                                                                                switch (i11) {
                                                                                    case 14:
                                                                                        break;
                                                                                    case 17:
                                                                                        i11 = iIntValue3 >= 0 ? 51805 : 51774;
                                                                                        break;
                                                                                    case 47:
                                                                                        throw new IllegalArgumentException((String) C0149.n(67310, (String) C0194.n(49193, null, new Object[]{(String) C0209.n(32662, null, new Object[]{(short[]) C0184.n(11174), 319, Integer.valueOf(C0060.f269 ^ (-986)), 697}), Integer.valueOf(iIntValue3), (String) C0149.n(42779, null, new Object[]{(short[]) C0184.n(11174), 343, Integer.valueOf(C0113.f322 ^ 70), 665})}), new Object[0]));
                                                                                    case 76:
                                                                                        int i12 = 51836;
                                                                                        while (true) {
                                                                                            i12 ^= 51853;
                                                                                            switch (i12) {
                                                                                                case 241:
                                                                                                    i12 = iIntValue3 == 0 ? 52580 : 52549;
                                                                                                    break;
                                                                                                case 1963:
                                                                                                    break;
                                                                                                case 1992:
                                                                                                    int iIntValue4 = ((Integer) C0184.n(41795, list2, new Object[0])).intValue();
                                                                                                    int i13 = 52735;
                                                                                                    while (true) {
                                                                                                        i13 ^= 52752;
                                                                                                        switch (i13) {
                                                                                                            case 14:
                                                                                                                break;
                                                                                                            case 45:
                                                                                                                int i14 = 53634;
                                                                                                                while (true) {
                                                                                                                    i14 ^= 53651;
                                                                                                                    switch (i14) {
                                                                                                                        case 17:
                                                                                                                            i14 = iIntValue3 == 1 ? 53727 : 53696;
                                                                                                                            break;
                                                                                                                        case 50:
                                                                                                                            break;
                                                                                                                        case 76:
                                                                                                                            boolean zBooleanValue7 = ((Boolean) C0219.n(37451, list2, new Object[0])).booleanValue();
                                                                                                                            int i15 = 53758;
                                                                                                                            while (true) {
                                                                                                                                i15 ^= 53775;
                                                                                                                                switch (i15) {
                                                                                                                                    case 1009:
                                                                                                                                        i15 = !zBooleanValue7 ? 54502 : 54471;
                                                                                                                                        break;
                                                                                                                                    case 1703:
                                                                                                                                        break;
                                                                                                                                    case 1736:
                                                                                                                                        throw new NoSuchElementException((String) C0198.n(54030, null, new Object[]{(short[]) C0184.n(11174), 305, Integer.valueOf(C0111.f320 ^ (-942)), 2994}));
                                                                                                                                    case 1769:
                                                                                                                                        obj = (List) C0184.n(94877, null, new Object[]{C0186.n(33996, list2, new Object[]{0})});
                                                                                                                                        int i16 = 54533;
                                                                                                                                        while (true) {
                                                                                                                                            i16 ^= 54550;
                                                                                                                                            switch (i16) {
                                                                                                                                                case 19:
                                                                                                                                                    i16 = 54564;
                                                                                                                                                    break;
                                                                                                                                                case 50:
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 83:
                                                                                                                            ArrayList arrayList3 = new ArrayList(iIntValue3);
                                                                                                                            Iterator it2 = (Iterator) C0184.n(45227, list2, new Object[0]);
                                                                                                                            int i17 = 0;
                                                                                                                            while (true) {
                                                                                                                                int i18 = i17;
                                                                                                                                boolean zBooleanValue8 = ((Boolean) C0221.n(22175, it2, new Object[0])).booleanValue();
                                                                                                                                int i19 = 54657;
                                                                                                                                while (true) {
                                                                                                                                    i19 ^= 54674;
                                                                                                                                    switch (i19) {
                                                                                                                                        case 19:
                                                                                                                                            i19 = zBooleanValue8 ? 55401 : 54719;
                                                                                                                                            break;
                                                                                                                                        case 45:
                                                                                                                                            break;
                                                                                                                                        case 50:
                                                                                                                                            break;
                                                                                                                                        case 3579:
                                                                                                                                            ((Boolean) C0179.n(13382, arrayList3, new Object[]{C0221.n(87284, it2, new Object[0])})).booleanValue();
                                                                                                                                            i17 = 1 - (0 - i18);
                                                                                                                                            int i20 = 55432;
                                                                                                                                            while (true) {
                                                                                                                                                i20 ^= 55449;
                                                                                                                                                switch (i20) {
                                                                                                                                                    case 17:
                                                                                                                                                        i20 = i17 == iIntValue3 ? 55525 : 55494;
                                                                                                                                                        break;
                                                                                                                                                    case 62:
                                                                                                                                                        break;
                                                                                                                                                    case 95:
                                                                                                                                                        break;
                                                                                                                                                    case 124:
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            int iIntValue5 = ((Integer) C0179.n(44660, arrayList3, new Object[0])).intValue();
                                                                                                                            int i21 = 55556;
                                                                                                                            while (true) {
                                                                                                                                i21 ^= 55573;
                                                                                                                                switch (i21) {
                                                                                                                                    case 17:
                                                                                                                                        i21 = iIntValue5 != 0 ? 55649 : 55618;
                                                                                                                                        break;
                                                                                                                                    case 54:
                                                                                                                                        break;
                                                                                                                                    case 87:
                                                                                                                                        break;
                                                                                                                                    case 116:
                                                                                                                                        int i22 = 55680;
                                                                                                                                        while (true) {
                                                                                                                                            i22 ^= 55697;
                                                                                                                                            switch (i22) {
                                                                                                                                                case 17:
                                                                                                                                                    i22 = iIntValue5 != 1 ? 56424 : 56393;
                                                                                                                                                    break;
                                                                                                                                                case 1467:
                                                                                                                                                    break;
                                                                                                                                                case 1496:
                                                                                                                                                    obj = (List) C0184.n(94877, null, new Object[]{C0205.n(27026, arrayList3, new Object[]{0})});
                                                                                                                                                    int i23 = 56579;
                                                                                                                                                    while (true) {
                                                                                                                                                        i23 ^= 56596;
                                                                                                                                                        switch (i23) {
                                                                                                                                                            case 23:
                                                                                                                                                                i23 = 56610;
                                                                                                                                                                break;
                                                                                                                                                            case 54:
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 1529:
                                                                                                                                                    int i24 = 56455;
                                                                                                                                                    while (true) {
                                                                                                                                                        i24 ^= 56472;
                                                                                                                                                        switch (i24) {
                                                                                                                                                            case 31:
                                                                                                                                                                i24 = 56486;
                                                                                                                                                                break;
                                                                                                                                                            case 62:
                                                                                                                                                                obj = arrayList3;
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            case 1007:
                                                                                                                i13 = iIntValue3 >= iIntValue4 ? 53479 : 52797;
                                                                                                                break;
                                                                                                            case 7927:
                                                                                                                obj = (List) C0184.n(98744, null, new Object[]{list2});
                                                                                                                int i25 = 53510;
                                                                                                                while (true) {
                                                                                                                    i25 ^= 53527;
                                                                                                                    switch (i25) {
                                                                                                                        case 17:
                                                                                                                            i25 = 53541;
                                                                                                                            break;
                                                                                                                        case 50:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 2025:
                                                                                                    int i26 = 52611;
                                                                                                    while (true) {
                                                                                                        i26 ^= 52628;
                                                                                                        switch (i26) {
                                                                                                            case 23:
                                                                                                                i26 = 52642;
                                                                                                                break;
                                                                                                            case 54:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 243:
                                                                            i10 = iIntValue2 == 0 ? 51557 : 50875;
                                                                            break;
                                                                        case 4075:
                                                                            int i27 = 51588;
                                                                            while (true) {
                                                                                i27 ^= 51605;
                                                                                switch (i27) {
                                                                                    case 17:
                                                                                        i27 = 51619;
                                                                                        break;
                                                                                    case 54:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    ((Boolean) C0179.n(13382, arrayList, new Object[]{((String[]) ((Object[]) C0184.n(49722, obj, new Object[]{new String[0]})))[0]})).booleanValue();
                                    int i28 = 1507503;
                                    while (true) {
                                        i28 ^= 1507520;
                                        switch (i28) {
                                            case 14:
                                                break;
                                            case 111:
                                                i28 = 1507534;
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 500:
                                int i29 = 1864;
                                while (true) {
                                    i29 ^= 1881;
                                    switch (i29) {
                                        case 17:
                                            i29 = 48674;
                                            continue;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        return (String) C0195.n(43185);
    }

    public static String g() {
        String str = (String) C0184.n(59214, null, new Object[0]);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (str == null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return (String) C0195.n(43185);
                case 239:
                    return str;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static boolean i() {
        String str = (String) C0205.n(5991, null, new Object[0]);
        int iIntValue = ((Integer) C0149.n(89092, str, new Object[0])).intValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iIntValue > 0 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0184.n(22950, null, new Object[]{str, (String) C0162.n(89013, null, new Object[]{(short[]) C0184.n(11174), 371, Integer.valueOf(C0023.f179 ^ 702), 1959})})).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = zBooleanValue ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = 48674;
                                            break;
                                        case 47483:
                                            return true;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        return false;
    }

    public static String k(String str) throws Throwable {
        Object objN = null;
        int i = 0;
        int i2 = 0;
        Object[] objArr = null;
        Integer num = null;
        String str2 = null;
        Object[] objArr2 = null;
        Integer num2 = null;
        String str3 = null;
        Object[] objArr3 = null;
        short[] sArr = null;
        Object[] objArr4 = null;
        String str4 = null;
        short[] sArr2 = null;
        Object[] objArr5 = null;
        String str5 = null;
        Object[] objArr6 = null;
        String str6 = null;
        Object[] objArr7 = null;
        String str7 = null;
        Object[] objArr8 = null;
        String str8 = null;
        short[] sArr3 = null;
        Object[] objArr9 = null;
        Integer numValueOf = null;
        String str9 = null;
        short[] sArr4 = null;
        Object[] objArr10 = null;
        Integer num3 = null;
        Object[] objArr11 = null;
        String str10 = null;
        short[] sArr5 = null;
        Object[] objArr12 = null;
        String str11 = null;
        Object[] objArr13 = null;
        Integer num4 = null;
        String str12 = null;
        String str13 = null;
        Object[] objArr14 = null;
        String str14 = null;
        String str15 = "ۨۤۡ";
        String str16 = null;
        Object[] objArr15 = null;
        while (true) {
            switch (C0034.m132(str15)) {
                case 56354:
                    i = C0039.f195;
                    i2 = i ^ 792;
                    Object[] objArr16 = new Object[4];
                    objArr16[0] = (short[]) objN;
                    objArr16[1] = 405;
                    objArr14 = objArr16;
                    str15 = "ۧۨ۠";
                    break;
                case 56482:
                    objArr15[0] = str13;
                    objArr15[1] = str14;
                    objArr15[2] = str12;
                    return (String) C0146.n(75054, null, objArr15);
                case 1746693:
                    objArr13[1] = num4;
                    objArr13[2] = 1;
                    objArr13[3] = 1106;
                    Object objN2 = C0178.n(26978, null, objArr13);
                    str15 = "۠ۦ۠";
                    str12 = (String) objN2;
                    objN = objN2;
                    break;
                case 1746848:
                    objArr6[1] = 387;
                    objArr6[2] = Integer.valueOf(i2);
                    objArr6[3] = 3123;
                    objN = C0224.n(52346, null, objArr6);
                    str15 = "ۦۣ۠";
                    break;
                case 1747807:
                    objArr2[2] = num2;
                    objArr2[3] = 3173;
                    Object objN3 = C0198.n(14698, null, objArr2);
                    objArr3 = new Object[3];
                    objArr3[0] = str;
                    str15 = "۠ۦۨ";
                    str3 = (String) objN3;
                    objN = objN3;
                    break;
                case 1747866:
                    String str17 = (String) C0146.n(75054, null, new Object[]{str10, str11, str12});
                    objN = C0184.n(11174);
                    str13 = str17;
                    str15 = "ۣۡ";
                    break;
                case 1747868:
                    objArr[1] = num;
                    objArr[2] = Integer.valueOf(i2);
                    objArr[3] = 1668;
                    Object objN4 = C0162.n(41206, null, objArr);
                    str15 = "ۨۧۦ";
                    str2 = (String) objN4;
                    objN = objN4;
                    break;
                case 1747874:
                    objArr3[1] = str2;
                    objArr3[2] = str3;
                    String str18 = (String) C0146.n(75054, null, objArr3);
                    objN = C0184.n(11174);
                    i = C0065.f274;
                    str15 = "ۧۥۣ";
                    str16 = str18;
                    sArr = (short[]) objN;
                    break;
                case 1748733:
                    String str19 = (String) objN;
                    objN = C0184.n(11174);
                    i = C0129.f338;
                    i2 = i ^ 918;
                    objArr6 = new Object[4];
                    objArr6[0] = (short[]) objN;
                    str5 = str19;
                    str15 = "۟ۤۥ";
                    break;
                case 1748736:
                    String str20 = (String) C0146.n(75054, null, objArr11);
                    objN = C0184.n(11174);
                    i = C0068.f277;
                    i2 = i ^ 352;
                    objArr12 = new Object[4];
                    str15 = "ۡۧ۟";
                    str10 = str20;
                    sArr5 = (short[]) objN;
                    break;
                case 1748857:
                    objArr12[0] = sArr5;
                    objArr12[1] = 399;
                    objArr12[2] = Integer.valueOf(i2);
                    objArr12[3] = 1875;
                    str15 = "ۢۤۨ";
                    break;
                case 1749734:
                    String str21 = (String) C0198.n(98419, null, objArr12);
                    objN = C0184.n(11174);
                    objArr13 = new Object[4];
                    objArr13[0] = (short[]) objN;
                    str15 = "۟۟ۥ";
                    num4 = 404;
                    str11 = str21;
                    break;
                case 1750599:
                    objN = C0146.n(75054, null, new Object[]{str16, str4, (String) C0182.n(27462, null, objArr5)});
                    str15 = "ۣۡ۟";
                    break;
                case 1750662:
                    i = C0069.f278;
                    i2 = i ^ 275;
                    Object[] objArr17 = new Object[4];
                    objArr17[0] = sArr3;
                    objArr17[1] = 392;
                    str15 = "ۨ۠۠";
                    numValueOf = Integer.valueOf(i2);
                    objArr9 = objArr17;
                    break;
                case 1750753:
                    objArr4[3] = 1523;
                    String str22 = (String) C0181.n(53852, null, objArr4);
                    objN = C0184.n(11174);
                    objArr5 = new Object[4];
                    str15 = "ۣۨۢ";
                    str4 = str22;
                    sArr2 = (short[]) objN;
                    break;
                case 1751775:
                    objArr10[3] = num3;
                    Object objN5 = C0162.n(68576, null, objArr10);
                    objArr11 = new Object[]{str8, str9, (String) objN5};
                    objN = objN5;
                    str15 = "ۣۡۢ";
                    break;
                case 1753449:
                    String str23 = (String) objN;
                    objN = C0184.n(11174);
                    objArr7 = new Object[4];
                    objArr7[0] = (short[]) objN;
                    objArr7[1] = 391;
                    str6 = str23;
                    str15 = "ۨۦۧ";
                    break;
                case 1754565:
                    i2 = i ^ 23;
                    Object[] objArr18 = new Object[4];
                    objArr18[0] = sArr;
                    objArr18[1] = 382;
                    objArr18[2] = Integer.valueOf(i2);
                    objArr4 = objArr18;
                    str15 = "ۣۦۤ";
                    break;
                case 1754655:
                    objArr14[2] = Integer.valueOf(i2);
                    objArr14[3] = 2181;
                    Object objN6 = C0224.n(25428, null, objArr14);
                    objArr15 = new Object[3];
                    str15 = "ۥۧ";
                    str14 = (String) objN6;
                    objN = objN6;
                    break;
                case 1755368:
                    objArr9[2] = numValueOf;
                    objArr9[3] = 673;
                    String str24 = (String) C0149.n(74485, null, objArr9);
                    objN = C0184.n(11174);
                    str15 = "ۦۦ";
                    str9 = str24;
                    sArr4 = (short[]) objN;
                    break;
                case 1755399:
                    objArr8[0] = str5;
                    objArr8[1] = str6;
                    objArr8[2] = str7;
                    String str25 = (String) C0146.n(75054, null, objArr8);
                    objN = C0184.n(11174);
                    str15 = "ۣۣۦ";
                    str8 = str25;
                    sArr3 = (short[]) objN;
                    break;
                case 1755433:
                    objArr5[0] = sArr2;
                    objArr5[1] = 386;
                    objArr5[2] = 1;
                    objArr5[3] = 2861;
                    str15 = "ۣۡۥ";
                    break;
                case 1755493:
                    Object objN7 = C0184.n(11174);
                    i = C0022.f178;
                    i2 = i ^ 101;
                    objArr = new Object[4];
                    objArr[0] = (short[]) objN7;
                    str15 = "۠ۦۢ";
                    num = 376;
                    objN = objN7;
                    break;
                case 1755561:
                    objArr7[2] = 1;
                    objArr7[3] = 1145;
                    Object objN8 = C0152.n(8274, null, objArr7);
                    objArr8 = new Object[3];
                    str15 = "ۨۡ۠";
                    str7 = (String) objN8;
                    objN = objN8;
                    break;
                case 1755591:
                    Object objN9 = C0184.n(11174);
                    objArr2 = new Object[4];
                    objArr2[0] = (short[]) objN9;
                    objArr2[1] = 381;
                    str15 = "ۣ۠ۤ";
                    num2 = 1;
                    objN = objN9;
                    break;
                default:
                    Object[] objArr19 = new Object[4];
                    objArr19[0] = sArr4;
                    objArr19[1] = 398;
                    objArr19[2] = 1;
                    str15 = "ۣۤۨ";
                    objArr10 = objArr19;
                    num3 = 1072;
                    break;
            }
        }
    }

    public final void a(String str) throws Throwable {
        String str2 = (String) C0152.n(8274, null, new Object[]{(short[]) C0184.n(11174), 411, Integer.valueOf(C0100.f309 ^ (-489)), 645});
        String str3 = (String) C0152.n(8274, null, new Object[]{(short[]) C0184.n(11174), 428, Integer.valueOf(C0132.f341 ^ (-6)), 528});
        String str4 = (String) C0157.n(78385, null, new Object[]{(short[]) C0184.n(11174), 433, Integer.valueOf(C0066.f275 ^ 436), 2374});
        String str5 = (String) C0198.n(45548, null, new Object[]{(short[]) C0184.n(11174), 440, Integer.valueOf(C0029.f185 ^ 269), 3097});
        String str6 = (String) C0195.n(99405, null, new Object[]{(short[]) C0184.n(11174), 446, Integer.valueOf(C0035.f191 ^ 313), 1359});
        String str7 = (String) C0157.n(97123, null, new Object[]{(short[]) C0184.n(11174), 451, Integer.valueOf(C0123.f332 ^ (-146)), 2664});
        String str8 = (String) C0162.n(89013, null, new Object[]{(short[]) C0184.n(11174), 457, Integer.valueOf(C0039.f195 ^ 792), 2980});
        String str9 = (String) C0224.n(54707, null, new Object[]{(short[]) C0184.n(11174), 463, Integer.valueOf(C0025.f181 ^ (-660)), 3183});
        String str10 = (String) C0224.n(58480, null, new Object[]{(short[]) C0184.n(11174), 519, Integer.valueOf(C0024.f180 ^ (-519)), 1418});
        try {
            long jLongValue = ((Long) C0191.n(43180, null, new Object[0])).longValue();
            StringBuilder sb = new StringBuilder(str10);
            String str11 = (String) C0198.n(89992, sb, new Object[0]);
            o oVar = (o) C0146.n(52361);
            Map map = (Map) C0146.n(88021, this);
            String str12 = (String) C0219.n(31142, null, new Object[]{str11, oVar, map});
            C0146.n(53810, null, new Object[]{str12});
            JsonObject jsonObject = (JsonObject) C0174.n(3898, null, new Object[]{(String) C0146.n(99496, null, new Object[]{str12, new char[]{'(', ' ', '\n', ')'}})});
            int iIntValue = ((Integer) C0177.n(28206, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str6}), new Object[0])).intValue();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (iIntValue == 0) {
                            i = 1709;
                        }
                        break;
                    case 204:
                        JsonObject jsonObject2 = (JsonObject) C0174.n(3898, null, new Object[]{(String) C0170.n(10931, (JsonElement) C0174.n(61056, jsonObject, new Object[]{(String) C0149.n(60368, null, new Object[]{(short[]) C0184.n(11174), 612, Integer.valueOf(C0088.f297 ^ 482), 418})}), new Object[0])});
                        int iIntValue2 = ((Integer) C0177.n(28206, (JsonElement) C0174.n(61056, jsonObject2, new Object[]{str5}), new Object[0])).intValue();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (iIntValue2 == 0) {
                                        i2 = 1833;
                                    }
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    C0184.n(23083, null, new Object[]{(Map) C0231.n(80450, null, new Object[]{str5, (Integer) C0182.n(76256, null, new Object[]{Integer.valueOf(((Integer) C0177.n(28206, (JsonElement) C0174.n(61056, jsonObject2, new Object[]{str5}), new Object[0])).intValue())})}), str2});
                                    int i3 = 51588;
                                    while (true) {
                                        i3 ^= 51605;
                                        switch (i3) {
                                            case 17:
                                                i3 = 51619;
                                                break;
                                            case 54:
                                                return;
                                        }
                                    }
                                    break;
                                case 500:
                                    String str13 = (String) C0170.n(10931, (JsonElement) C0174.n(61056, jsonObject2, new Object[]{(String) C0224.n(25428, null, new Object[]{(short[]) C0184.n(11174), 621, 1, 1689})}), new Object[0]);
                                    long jLongValue2 = ((Long) C0191.n(43180, null, new Object[0])).longValue();
                                    StringBuilder sb2 = new StringBuilder(str9);
                                    N n = (N) C0204.n(75499, null, new Object[]{(String) C0198.n(89992, sb2, new Object[0]), oVar, map});
                                    String str14 = (String) C0188.n(56707, n, new Object[0]);
                                    C0184.n(23083, null, new Object[]{str14, (String) C0224.n(54707, null, new Object[]{(short[]) C0184.n(11174), 717, Integer.valueOf(C0113.f322 ^ 89), 1941})});
                                    String str15 = (String) C0146.n(6011, null, new Object[]{(String) C0146.n(53523, null, new Object[]{str14, (String) C0224.n(52346, null, new Object[]{(short[]) C0184.n(11174), 729, 1, 2898}), str14}), (String) C0178.n(80760, null, new Object[]{(short[]) C0184.n(11174), 730, 1, 1306})});
                                    JsonObject jsonObject3 = (JsonObject) C0174.n(3898, null, new Object[]{(String) C0146.n(13458, null, new Object[]{str15})});
                                    boolean zBooleanValue = ((Boolean) C0174.n(5787, jsonObject3, new Object[]{str4})).booleanValue();
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = zBooleanValue ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                boolean zBooleanValue2 = ((Boolean) C0146.n(10734, null, new Object[]{(String) C0170.n(10931, (JsonElement) C0174.n(61056, (JsonObject) C0181.n(24176, (JsonElement) C0174.n(61056, jsonObject3, new Object[]{str4}), new Object[0]), new Object[]{(String) C0149.n(36390, null, new Object[]{(short[]) C0184.n(11174), 731, Integer.valueOf(C0060.f269 ^ (-964)), 1697})}), new Object[0]), (String) C0198.n(14698, null, new Object[]{(short[]) C0184.n(11174), 733, 1, 2514})})).booleanValue();
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            break;
                                                        case 76:
                                                            StringBuilder sb3 = new StringBuilder(str8);
                                                            this.b = (String) C0198.n(89992, sb3, new Object[0]);
                                                            String str16 = (String) C0146.n(50612, null, new Object[]{(List) C0157.n(70947, (Map) C0221.n(85613, n), new Object[]{(String) C0198.n(6303, null, new Object[]{(short[]) C0184.n(11174), 734, Integer.valueOf(C0013.f169 ^ 661), 1276})})});
                                                            this.b = str16;
                                                            int iIntValue3 = ((Integer) C0149.n(89092, str16, new Object[0])).intValue();
                                                            int i6 = 48891;
                                                            while (true) {
                                                                i6 ^= 48908;
                                                                switch (i6) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 503:
                                                                        i6 = iIntValue3 > 0 ? 49635 : 48953;
                                                                        break;
                                                                    case 32495:
                                                                        C0146.n(21707, (com.github.catvod.spider.merge.p002c.a) C0146.n(69659, null, new Object[0]), new Object[]{new b((String) C0146.n(16832, this))});
                                                                        C0218.n(64823, null, new Object[]{(String) C0149.n(74485, null, new Object[]{(short[]) C0184.n(11174), 744, Integer.valueOf(C0038.f194 ^ 218), 2028})});
                                                                        C0210.n(49492, null, new Object[0]);
                                                                        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C0159.n(43199, this);
                                                                        int i7 = 49666;
                                                                        while (true) {
                                                                            i7 ^= 49683;
                                                                            switch (i7) {
                                                                                case 17:
                                                                                    i7 = scheduledExecutorService != null ? 49759 : 49728;
                                                                                    break;
                                                                                case 50:
                                                                                    break;
                                                                                case 76:
                                                                                    break;
                                                                                case 83:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0231.n(50374, null, new Object[0]);
                                                                        C0188.n(1950, null, new Object[]{(String) C0198.n(54030, null, new Object[]{(short[]) C0184.n(11174), 749, Integer.valueOf(C0129.f338 ^ 916), 2952})});
                                                                        int i8 = 49790;
                                                                        while (true) {
                                                                            i8 ^= 49807;
                                                                            switch (i8) {
                                                                                case 18:
                                                                                    break;
                                                                                case 241:
                                                                                    i8 = 49821;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            int i9 = 50689;
                                                            while (true) {
                                                                i9 ^= 50706;
                                                                switch (i9) {
                                                                    case 19:
                                                                        i9 = 50720;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 239:
                                                            i5 = zBooleanValue2 ? 48860 : 48829;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                break;
                                        }
                                        return;
                                    }
                                    C0184.n(23083, null, new Object[]{(Map) C0231.n(80450, null, new Object[]{str3, (String) C0198.n(26710, str7, new Object[]{str15})}), str2});
                                    int i10 = 50813;
                                    while (true) {
                                        i10 ^= 50830;
                                        switch (i10) {
                                            case 18:
                                                return;
                                            case 243:
                                                i10 = 50844;
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        break;
                    case 239:
                        C0184.n(23083, null, new Object[]{(Map) C0231.n(80450, null, new Object[]{str6, (Integer) C0182.n(76256, null, new Object[]{Integer.valueOf(((Integer) C0177.n(28206, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str6}), new Object[0])).intValue())})}), str2});
                        int i11 = 51712;
                        while (true) {
                            i11 ^= 51729;
                            switch (i11) {
                                case 14:
                                    return;
                                case 17:
                                    i11 = 51743;
                                    break;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            int i12 = 49914;
            while (true) {
                i12 ^= 49931;
                switch (i12) {
                    case 497:
                        i12 = 50596;
                        break;
                    case 1711:
                        StringBuilder sb4 = new StringBuilder((String) C0149.n(61324, null, new Object[]{(short[]) C0184.n(11174), 767, Integer.valueOf(C0111.f320 ^ (-938)), 1136}));
                        C0184.n(23083, null, new Object[]{(Map) C0231.n(80450, null, new Object[]{str3, (String) C0198.n(89992, sb4, new Object[0])}), str2});
                        return;
                }
            }
        }
    }

    public final void b() throws Throwable {
        this.b = (String) C0195.n(43185);
        C0146.n(21707, (com.github.catvod.spider.merge.p002c.a) C0146.n(69659, null, new Object[0]), new Object[]{new b((String) C0195.n(43185))});
        C0188.n(35332, null, new Object[]{(String) C0209.n(32662, null, new Object[]{(short[]) C0184.n(11174), 777, Integer.valueOf(C0039.f195 ^ 795), 1386}), (String) C0195.n(43185)});
        synchronized (C0146.n(56736)) {
            com.github.catvod.spider.merge.p002c.a.c = null;
        }
    }

    public final LinkedHashMap e() {
        Object objN = null;
        Map map = null;
        Object[] objArr = null;
        LinkedHashMap linkedHashMap = null;
        Object[] objArr2 = null;
        short[] sArr = null;
        int i = 0;
        int i2 = 0;
        Object[] objArr3 = null;
        Integer num = null;
        Integer numValueOf = null;
        Integer num2 = null;
        String str = null;
        Object[] objArr4 = null;
        String str2 = "ۡۨ";
        String str3 = null;
        while (true) {
            switch (C0034.m132(str2)) {
                case 56359:
                    objN = C0146.n(88021, this);
                    str2 = "ۦۥۤ";
                    break;
                case 1746721:
                    objN = C0162.n(76230, null, objArr3);
                    str2 = "ۣۥۡ";
                    break;
                case 1746816:
                    objN = C0146.n(67663, null, objArr);
                    str2 = "ۨۡ۠";
                    break;
                case 1746845:
                    objArr4[0] = str;
                    str2 = "۟ۥ۠";
                    break;
                case 1746848:
                    str2 = "ۥۨ۠";
                    sArr = (short[]) objN;
                    break;
                case 1746874:
                    objArr4[1] = str3;
                    str2 = "ۣۨۢ";
                    break;
                case 1746912:
                    str2 = "ۦۤۨ";
                    num = 782;
                    break;
                case 1747776:
                    objArr3[3] = num2;
                    str2 = "۟۠ۢ";
                    break;
                case 1747780:
                    i2 = i ^ 21;
                    str2 = "ۧۢۦ";
                    break;
                case 1748679:
                    objN = C0184.n(11174);
                    str2 = "۟ۤۥ";
                    break;
                case 1750537:
                    return linkedHashMap;
                case 1750656:
                    str2 = "ۣۨۦ";
                    numValueOf = Integer.valueOf(i2);
                    break;
                case 1750719:
                    str2 = "ۨ۠۟";
                    str = (String) objN;
                    break;
                case 1750817:
                    objArr3[2] = numValueOf;
                    str2 = "ۧۡۦ";
                    break;
                case 1751653:
                    objN = C0205.n(5991, null, objArr2);
                    str2 = "ۧۨۨ";
                    break;
                case 1751681:
                    str2 = "ۤۤۥ";
                    objArr2 = new Object[0];
                    break;
                case 1751776:
                    objArr[0] = map;
                    str2 = "ۣ۟ۤ";
                    break;
                case 1753450:
                    str2 = "ۤۨۤ";
                    objArr = new Object[1];
                    break;
                case 1753578:
                    objArr3[1] = num;
                    str2 = "ۣۣ۠";
                    break;
                case 1753605:
                    str2 = "ۦ۠ۤ";
                    map = (Map) objN;
                    break;
                case 1754444:
                    str2 = "ۣۣ۠";
                    num2 = 800;
                    break;
                case 1754475:
                    str2 = "ۨ۠ۦ";
                    objArr3 = new Object[4];
                    break;
                case 1754663:
                    str2 = "ۡۡۧ";
                    str3 = (String) objN;
                    break;
                case 1755367:
                    str2 = "۟ۤۢ";
                    objArr4 = new Object[2];
                    break;
                case 1755374:
                    objArr3[0] = sArr;
                    str2 = "۟ۦۧ";
                    break;
                case 1755399:
                    str2 = "ۤۥۢ";
                    linkedHashMap = (LinkedHashMap) objN;
                    break;
                case 1755463:
                    objN = C0204.n(62847, linkedHashMap, objArr4);
                    str2 = "ۣ۟ۥ";
                    break;
                default:
                    i = C0065.f274;
                    str2 = "ۣ۠ۧ";
                    break;
            }
        }
    }

    public final String f(String str) throws Throwable {
        String str2;
        C0159.n(35468, null, new Object[]{str, (String) C0149.n(61324, null, new Object[]{(short[]) C0184.n(11174), 788, Integer.valueOf(C0134.f343 ^ (-245)), 2180})});
        boolean zBooleanValue = ((Boolean) C0146.n(68176, null, new Object[0])).booleanValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!zBooleanValue) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return (String) C0224.n(74697, null, new Object[]{(short[]) C0184.n(11174), 792, Integer.valueOf(C0040.f196 ^ (-324)), 1470});
                case 239:
                    StringBuilder sb = new StringBuilder((String) C0198.n(68788, null, new Object[]{(short[]) C0184.n(11174), 807, 1, 2910}));
                    JSONObject jSONObject = new JSONObject((String) C0219.n(31142, null, new Object[]{(String) C0174.n(81017, null, new Object[]{(String) C0162.n(95122, null, new Object[]{(short[]) C0184.n(11174), 808, Integer.valueOf(C0060.f269 ^ (-1004)), 2220}), (String) C0198.n(89992, sb, new Object[0]), (String) C0149.n(42779, null, new Object[]{(short[]) C0184.n(11174), 850, Integer.valueOf(C0069.f278 ^ 285), 2573})}), (o) C0146.n(52361), (LinkedHashMap) C0146.n(43473, this, new Object[0])}));
                    int iIntValue = ((Integer) C0155.n(98955, jSONObject, new Object[]{(String) C0162.n(29890, null, new Object[]{(short[]) C0184.n(11174), 858, Integer.valueOf(C0015.f171 ^ (-941)), 853}), Integer.valueOf(C0123.f332 ^ 151)})).intValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (iIntValue != 0) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                JSONArray jSONArray = (JSONArray) C0181.n(34380, jSONObject, new Object[]{(String) C0182.n(27462, null, new Object[]{(short[]) C0184.n(11174), 883, Integer.valueOf(C0108.f317 ^ (-376)), 3206})});
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = jSONArray != null ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            int iIntValue2 = ((Integer) C0195.n(12588, jSONArray, new Object[0])).intValue();
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        JSONObject jSONObject2 = (JSONObject) C0195.n(10400, jSONArray, new Object[]{0});
                                                        String str3 = (String) C0224.n(52346, null, new Object[]{(short[]) C0184.n(11174), 887, Integer.valueOf(C0025.f181 ^ (-688)), 1734});
                                                        String str4 = (String) C0195.n(43185);
                                                        String str5 = (String) C0182.n(6366, jSONObject2, new Object[]{str3, str4});
                                                        String str6 = (String) C0182.n(6366, jSONObject2, new Object[]{(String) C0162.n(68576, null, new Object[]{(short[]) C0184.n(11174), 891, Integer.valueOf(C0054.f210 ^ (-646)), 2305}), str4});
                                                        C0146.n(53810, null, new Object[]{str5});
                                                        String str7 = (String) C0224.n(99346, null, new Object[]{(short[]) C0184.n(11174), 906, 1, 2405});
                                                        boolean zBooleanValue2 = ((Boolean) C0184.n(22950, null, new Object[]{str5, str7})).booleanValue();
                                                        int i5 = 49666;
                                                        while (true) {
                                                            i5 ^= 49683;
                                                            switch (i5) {
                                                                case 17:
                                                                    i5 = zBooleanValue2 ? 49759 : 49728;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                                case 76:
                                                                    str2 = (String) C0146.n(6011, null, new Object[]{str5, str7});
                                                                    int i6 = 49790;
                                                                    while (true) {
                                                                        i6 ^= 49807;
                                                                        switch (i6) {
                                                                            case 18:
                                                                                break;
                                                                            case 241:
                                                                                i6 = 49821;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    str2 = str7;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        JSONObject jSONObject3 = (JSONObject) C0146.n(96618, null, new Object[]{str3, str5, (String) C0157.n(78385, null, new Object[]{(short[]) C0184.n(11174), 907, Integer.valueOf(C0086.f295 ^ (-347)), 1165}), str6});
                                                        int iIntValue3 = ((Integer) C0149.n(89092, str2, new Object[0])).intValue();
                                                        int i7 = 49914;
                                                        while (true) {
                                                            i7 ^= 49931;
                                                            switch (i7) {
                                                                case 497:
                                                                    i7 = iIntValue3 == 0 ? 50658 : 50627;
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                                case 1736:
                                                                    str7 = str2;
                                                                    break;
                                                                case 1769:
                                                                    int i8 = 50689;
                                                                    while (true) {
                                                                        i8 ^= 50706;
                                                                        switch (i8) {
                                                                            case 19:
                                                                                i8 = 50720;
                                                                                continue;
                                                                            case 50:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        String str8 = (String) C0182.n(84813, jSONObject3, new Object[0]);
                                                        C0184.n(23083, null, new Object[]{str8, (String) C0198.n(30341, null, new Object[]{(short[]) C0184.n(11174), 926, Integer.valueOf(C0083.f292 ^ (-194)), 2822})});
                                                        return str8;
                                                    case 76:
                                                        int i9 = 48891;
                                                        while (true) {
                                                            i9 ^= 48908;
                                                            switch (i9) {
                                                                case 22:
                                                                    break;
                                                                case 503:
                                                                    i9 = 48922;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        if (iIntValue2 == 0) {
                                                            i4 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i4 = 48829;
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                return (String) C0178.n(26978, null, new Object[]{(short[]) C0184.n(11174), 939, Integer.valueOf(C0124.f333 ^ (-742)), 2416});
                            case 500:
                                return (String) C0178.n(65464, null, new Object[]{(short[]) C0184.n(11174), 863, Integer.valueOf(C0066.f275 ^ 423), 1413});
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:421:0x07f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x082d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x07f4 A[SYNTHETIC] */
    public final LinkedHashMap h() throws Throwable {
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        long jLongValue;
        int i;
        String str5 = (String) C0198.n(14698, null, new Object[]{(short[]) C0184.n(11174), 956, Integer.valueOf(C0002.f158 ^ 513), 3242});
        String str6 = (String) C0181.n(92093, null, new Object[]{(short[]) C0184.n(11174), 960, Integer.valueOf(C0069.f278 ^ 272), 2870});
        String str7 = (String) C0198.n(6303, null, new Object[]{(short[]) C0184.n(11174), 965, Integer.valueOf(C0111.f320 ^ (-937)), 2627});
        String str8 = (String) C0182.n(69249, null, new Object[]{(short[]) C0184.n(11174), 976, Integer.valueOf(C0086.f295 ^ (-341)), 574});
        String str9 = (String) C0162.n(29890, null, new Object[]{(short[]) C0184.n(11174), 982, Integer.valueOf(C0129.f338 ^ 916), 1487});
        String str10 = (String) C0224.n(30768, null, new Object[]{(short[]) C0184.n(11174), 988, Integer.valueOf(C0005.f161 ^ 645), 3049});
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = (Boolean) C0225.n(22935);
        String str11 = (String) C0198.n(62249, null, new Object[]{(short[]) C0184.n(11174), 992, Integer.valueOf(C0002.f158 ^ 524), 2055});
        C0204.n(62847, linkedHashMap, new Object[]{str11, bool});
        try {
            String str12 = (String) C0205.n(5991, null, new Object[0]);
            int iIntValue = ((Integer) C0149.n(89092, str12, new Object[0])).intValue();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = iIntValue == 0 ? 1709 : 1678;
                        break;
                    case 204:
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        boolean zBooleanValue = ((Boolean) C0184.n(22950, null, new Object[]{str12, (String) C0157.n(78385, null, new Object[]{(short[]) C0184.n(11174), 1001, Integer.valueOf(C0022.f178 ^ 101), 2293})})).booleanValue();
                        int i4 = 1864;
                        while (true) {
                            i4 ^= 1881;
                            switch (i4) {
                                case 17:
                                    i4 = !zBooleanValue ? 48736 : 48705;
                                    break;
                                case 47384:
                                    C0204.n(62847, linkedHashMap, new Object[]{str11, (Boolean) C0182.n(26387)});
                                    C0204.n(62847, linkedHashMap, new Object[]{(String) C0198.n(74142, null, new Object[]{(short[]) C0184.n(11174), 1006, Integer.valueOf(C0138.f347 ^ 270), 1834}), str12});
                                    String str13 = (String) C0157.n(78385, null, new Object[]{(short[]) C0184.n(11174), 1012, Integer.valueOf(C0060.f269 ^ (-850)), 2741});
                                    o oVar = (o) C0146.n(52361);
                                    JsonObject jsonObject = (JsonObject) C0174.n(3898, null, new Object[]{(String) C0219.n(31142, null, new Object[]{str13, oVar, (LinkedHashMap) C0146.n(43473, this, new Object[0])})});
                                    boolean zBooleanValue2 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{str10})).booleanValue();
                                    int i5 = 48767;
                                    while (true) {
                                        i5 ^= 48784;
                                        switch (i5) {
                                            case 14:
                                                break;
                                            case 45:
                                                break;
                                            case 76:
                                                boolean zBooleanValue3 = ((Boolean) C0174.n(5787, (JsonObject) C0181.n(24176, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str10}), new Object[0]), new Object[]{str9})).booleanValue();
                                                int i6 = 48891;
                                                while (true) {
                                                    i6 ^= 48908;
                                                    switch (i6) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 503:
                                                            i6 = zBooleanValue3 ? 49635 : 48953;
                                                            break;
                                                        case 32495:
                                                            JsonObject jsonObject2 = (JsonObject) C0181.n(24176, (JsonElement) C0174.n(61056, (JsonObject) C0181.n(24176, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str10}), new Object[0]), new Object[]{str9}), new Object[0]);
                                                            JsonElement jsonElement = (JsonElement) C0174.n(61056, jsonObject2, new Object[]{(String) C0198.n(71923, null, new Object[]{(short[]) C0184.n(11174), 1156, Integer.valueOf(C0111.f320 ^ (-937)), 1766})});
                                                            String str14 = (String) C0195.n(43185);
                                                            int i7 = 49666;
                                                            while (true) {
                                                                i7 ^= 49683;
                                                                switch (i7) {
                                                                    case 17:
                                                                        i7 = jsonElement != null ? 49759 : 49728;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    case 76:
                                                                        String str15 = (String) C0170.n(10931, jsonElement, new Object[0]);
                                                                        int i8 = 49790;
                                                                        while (true) {
                                                                            i8 ^= 49807;
                                                                            switch (i8) {
                                                                                case 18:
                                                                                    break;
                                                                                case 51:
                                                                                    str = str15;
                                                                                    break;
                                                                                case 84:
                                                                                    int i9 = 49914;
                                                                                    while (true) {
                                                                                        i9 ^= 49931;
                                                                                        switch (i9) {
                                                                                            case 497:
                                                                                                i9 = 50596;
                                                                                                continue;
                                                                                            case 1711:
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                        str = str14;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 241:
                                                                                    i8 = str15 == null ? 49883 : 49852;
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 83:
                                                                        str = str14;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            JsonElement jsonElement2 = (JsonElement) C0174.n(61056, jsonObject2, new Object[]{(String) C0198.n(14698, null, new Object[]{(short[]) C0184.n(11174), 1167, Integer.valueOf(C0068.f277 ^ 365), 2666})});
                                                            int i10 = 50813;
                                                            while (true) {
                                                                i10 ^= 50830;
                                                                switch (i10) {
                                                                    case 18:
                                                                        break;
                                                                    case 53:
                                                                        str2 = str14;
                                                                        break;
                                                                    case 243:
                                                                        i10 = jsonElement2 != null ? 51557 : 50875;
                                                                        break;
                                                                    case 4075:
                                                                        String str16 = (String) C0170.n(10931, jsonElement2, new Object[0]);
                                                                        int i11 = 51588;
                                                                        while (true) {
                                                                            i11 ^= 51605;
                                                                            switch (i11) {
                                                                                case 17:
                                                                                    i11 = str16 == null ? 51681 : 51650;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                case 87:
                                                                                    str2 = str16;
                                                                                    break;
                                                                                case 116:
                                                                                    int i12 = 51712;
                                                                                    while (true) {
                                                                                        i12 ^= 51729;
                                                                                        switch (i12) {
                                                                                            case 14:
                                                                                                str2 = str14;
                                                                                                break;
                                                                                            case 15:
                                                                                            case 16:
                                                                                            default:
                                                                                                continue;
                                                                                            case 17:
                                                                                                i12 = 51743;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            String str17 = (String) C0149.n(42779, null, new Object[]{(short[]) C0184.n(11174), 1175, Integer.valueOf(C0052.f208 ^ (-125)), 2435});
                                                            int iIntValue2 = ((Integer) C0149.n(89092, str, new Object[0])).intValue();
                                                            int i13 = 51836;
                                                            while (true) {
                                                                i13 ^= 51853;
                                                                switch (i13) {
                                                                    case 241:
                                                                        i13 = iIntValue2 > 0 ? 52580 : 52549;
                                                                        break;
                                                                    case 1963:
                                                                        break;
                                                                    case 1992:
                                                                        int iIntValue3 = ((Integer) C0149.n(89092, str2, new Object[0])).intValue();
                                                                        int i14 = 52735;
                                                                        while (true) {
                                                                            i14 ^= 52752;
                                                                            switch (i14) {
                                                                                case 14:
                                                                                    break;
                                                                                case 45:
                                                                                    str3 = (String) C0149.n(42779, null, new Object[]{(short[]) C0184.n(11174), 1183, Integer.valueOf(C0007.f163 ^ 163), 2758});
                                                                                    break;
                                                                                case 1007:
                                                                                    i14 = iIntValue3 > 0 ? 53479 : 52797;
                                                                                    break;
                                                                                case 7927:
                                                                                    int i15 = 53510;
                                                                                    while (true) {
                                                                                        i15 ^= 53527;
                                                                                        switch (i15) {
                                                                                            case 17:
                                                                                                i15 = 53541;
                                                                                                continue;
                                                                                            case 50:
                                                                                                str3 = str2;
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2025:
                                                                        int i16 = 52611;
                                                                        while (true) {
                                                                            i16 ^= 52628;
                                                                            switch (i16) {
                                                                                case 23:
                                                                                    i16 = 52642;
                                                                                    continue;
                                                                                case 54:
                                                                                    str3 = str;
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            C0204.n(62847, linkedHashMap, new Object[]{str17, str3});
                                                            boolean zBooleanValue4 = ((Boolean) C0174.n(5787, jsonObject2, new Object[]{str8})).booleanValue();
                                                            int i17 = 53634;
                                                            while (true) {
                                                                i17 ^= 53651;
                                                                switch (i17) {
                                                                    case 17:
                                                                        i17 = zBooleanValue4 ? 53727 : 53696;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    case 76:
                                                                        JsonObject jsonObject3 = (JsonObject) C0181.n(24176, (JsonElement) C0174.n(61056, jsonObject2, new Object[]{str8}), new Object[0]);
                                                                        JsonElement jsonElement3 = (JsonElement) C0174.n(61056, jsonObject3, new Object[]{(String) C0149.n(60368, null, new Object[]{(short[]) C0184.n(11174), 1187, Integer.valueOf(C0039.f195 ^ 792), 2897})});
                                                                        int i18 = 53758;
                                                                        while (true) {
                                                                            i18 ^= 53775;
                                                                            switch (i18) {
                                                                                case 1009:
                                                                                    i18 = jsonElement3 != null ? 54502 : 54471;
                                                                                    break;
                                                                                case 1703:
                                                                                    break;
                                                                                case 1736:
                                                                                    z = false;
                                                                                    break;
                                                                                case 1769:
                                                                                    int iIntValue4 = ((Integer) C0177.n(28206, jsonElement3, new Object[0])).intValue();
                                                                                    int i19 = 54533;
                                                                                    while (true) {
                                                                                        i19 ^= 54550;
                                                                                        switch (i19) {
                                                                                            case 19:
                                                                                                i19 = iIntValue4 == 1 ? 54626 : 54595;
                                                                                                break;
                                                                                            case 50:
                                                                                                break;
                                                                                            case 85:
                                                                                                z = false;
                                                                                                break;
                                                                                            case 116:
                                                                                                int i20 = 54657;
                                                                                                while (true) {
                                                                                                    i20 ^= 54674;
                                                                                                    switch (i20) {
                                                                                                        case 19:
                                                                                                            i20 = 54688;
                                                                                                            continue;
                                                                                                        case 50:
                                                                                                            z = true;
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0204.n(62847, linkedHashMap, new Object[]{(String) C0224.n(25428, null, new Object[]{(short[]) C0184.n(11174), 1193, Integer.valueOf(C0002.f158 ^ 512), 2926}), (Boolean) C0224.n(34197, null, new Object[]{Boolean.valueOf(z)})});
                                                                        String str18 = (String) C0149.n(83930, null, new Object[]{(short[]) C0184.n(11174), 1198, Integer.valueOf(C0100.f309 ^ (-499)), 2292});
                                                                        int i21 = 55432;
                                                                        while (true) {
                                                                            i21 ^= 55449;
                                                                            switch (i21) {
                                                                                case 17:
                                                                                    i21 = z ? 55525 : 55494;
                                                                                    break;
                                                                                case 62:
                                                                                    break;
                                                                                case 95:
                                                                                    str4 = (String) C0162.n(24506, null, new Object[]{(short[]) C0184.n(11174), 1221, Integer.valueOf(C0134.f343 ^ (-245)), 823});
                                                                                    break;
                                                                                case 124:
                                                                                    JsonElement jsonElement4 = (JsonElement) C0174.n(61056, jsonObject3, new Object[]{(String) C0198.n(62249, null, new Object[]{(short[]) C0184.n(11174), 1209, Integer.valueOf(C0022.f178 ^ 105), 1909})});
                                                                                    int i22 = 55556;
                                                                                    while (true) {
                                                                                        i22 ^= 55573;
                                                                                        switch (i22) {
                                                                                            case 17:
                                                                                                i22 = jsonElement4 != null ? 55649 : 55618;
                                                                                                break;
                                                                                            case 54:
                                                                                                break;
                                                                                            case 87:
                                                                                                str4 = (String) C0209.n(32662, null, new Object[]{(short[]) C0184.n(11174), 1218, Integer.valueOf(C0141.f351 ^ (-782)), 2360});
                                                                                                i = 56455;
                                                                                                while (true) {
                                                                                                    i ^= 56472;
                                                                                                    switch (i) {
                                                                                                        case 31:
                                                                                                            i = 56486;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        case 62:
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 116:
                                                                                                str4 = (String) C0170.n(10931, jsonElement4, new Object[0]);
                                                                                                int i23 = 55680;
                                                                                                while (true) {
                                                                                                    i23 ^= 55697;
                                                                                                    switch (i23) {
                                                                                                        case 17:
                                                                                                            i23 = str4 == null ? 56424 : 56393;
                                                                                                            break;
                                                                                                        case 1467:
                                                                                                            break;
                                                                                                        case 1496:
                                                                                                            break;
                                                                                                        case 1529:
                                                                                                            str4 = (String) C0209.n(32662, null, new Object[]{(short[]) C0184.n(11174), 1218, Integer.valueOf(C0141.f351 ^ (-782)), 2360});
                                                                                                            i = 56455;
                                                                                                            while (true) {
                                                                                                                i ^= 56472;
                                                                                                                switch (i) {
                                                                                                                    case 31:
                                                                                                                        i = 56486;
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                    case 62:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        continue;
                                                                                                                        continue;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0204.n(62847, linkedHashMap, new Object[]{str18, str4});
                                                                        JsonElement jsonElement5 = (JsonElement) C0174.n(61056, jsonObject3, new Object[]{str7});
                                                                        int i24 = 56579;
                                                                        while (true) {
                                                                            i24 ^= 56596;
                                                                            switch (i24) {
                                                                                case 23:
                                                                                    if (jsonElement5 != null) {
                                                                                        i24 = 1507472;
                                                                                    }
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                case 85:
                                                                                    jLongValue = 0;
                                                                                    break;
                                                                                case 1564036:
                                                                                    jLongValue = ((Long) C0177.n(79691, jsonElement5, new Object[0])).longValue();
                                                                                    int i25 = 1507503;
                                                                                    while (true) {
                                                                                        i25 ^= 1507520;
                                                                                        switch (i25) {
                                                                                            case 14:
                                                                                                break;
                                                                                            case 111:
                                                                                                i25 = 1507534;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            i24 = 56641;
                                                                        }
                                                                        int i26 = 1507627;
                                                                        while (true) {
                                                                            i26 ^= 1507644;
                                                                            switch (i26) {
                                                                                case 23:
                                                                                    i26 = jLongValue > 0 ? 1507720 : 1507689;
                                                                                    break;
                                                                                case 85:
                                                                                    break;
                                                                                case 118:
                                                                                    break;
                                                                                case 180:
                                                                                    C0204.n(62847, linkedHashMap, new Object[]{str7, (String) C0209.n(47001, new SimpleDateFormat((String) C0162.n(59518, null, new Object[]{(short[]) C0184.n(11174), 1225, Integer.valueOf(C0036.f192 ^ (-34)), 327})), new Object[]{new Date(jLongValue * ((long) (C0034.f190 ^ 876)))})});
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i5 = zBooleanValue2 ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    JsonObject jsonObject4 = (JsonObject) C0174.n(3898, null, new Object[]{(String) C0219.n(31142, null, new Object[]{(String) C0162.n(13243, null, new Object[]{(short[]) C0184.n(11174), 1235, Integer.valueOf(C0099.f308 ^ 769), 2000}), oVar, (LinkedHashMap) C0146.n(43473, this, new Object[0])})});
                                    boolean zBooleanValue5 = ((Boolean) C0174.n(5787, jsonObject4, new Object[]{str6})).booleanValue();
                                    int i27 = 1507751;
                                    while (true) {
                                        i27 ^= 1507768;
                                        switch (i27) {
                                            case 31:
                                                i27 = zBooleanValue5 ? 1508495 : 1508464;
                                                break;
                                            case 1335:
                                                boolean zBooleanValue6 = ((Boolean) C0174.n(5787, jsonObject4, new Object[]{str5})).booleanValue();
                                                int i28 = 1508526;
                                                while (true) {
                                                    i28 ^= 1508543;
                                                    switch (i28) {
                                                        case 17:
                                                            i28 = zBooleanValue6 ? 1508619 : 1508588;
                                                            break;
                                                        case 83:
                                                            break;
                                                        case 114:
                                                            break;
                                                        case 436:
                                                            long jLongValue2 = ((Long) C0177.n(79691, (JsonElement) C0174.n(61056, jsonObject4, new Object[]{str6}), new Object[0])).longValue();
                                                            long jLongValue3 = ((Long) C0177.n(79691, (JsonElement) C0174.n(61056, jsonObject4, new Object[]{str5}), new Object[0])).longValue();
                                                            C0204.n(62847, linkedHashMap, new Object[]{(String) C0198.n(30341, null, new Object[]{(short[]) C0184.n(11174), 1292, Integer.valueOf(C0023.f179 ^ 693), 2432}), (String) C0146.n(63539, null, new Object[]{Long.valueOf(jLongValue2)})});
                                                            C0204.n(62847, linkedHashMap, new Object[]{(String) C0162.n(24506, null, new Object[]{(short[]) C0184.n(11174), 1306, Integer.valueOf(C0023.f179 ^ 694), 2171}), (String) C0146.n(63539, null, new Object[]{Long.valueOf(jLongValue3)})});
                                                            int i29 = 1508650;
                                                            while (true) {
                                                                i29 ^= 1508667;
                                                                switch (i29) {
                                                                    case 17:
                                                                        i29 = jLongValue2 > 0 ? 1509394 : 1508712;
                                                                        break;
                                                                    case 83:
                                                                        break;
                                                                    case 114:
                                                                        break;
                                                                    case 3369:
                                                                        String str19 = (String) C0198.n(54030, null, new Object[]{(short[]) C0184.n(11174), 1319, Integer.valueOf(C0039.f195 ^ 787), 1678});
                                                                        String str20 = (String) C0178.n(26978, null, new Object[]{(short[]) C0184.n(11174), 1332, Integer.valueOf(C0134.f343 ^ (-245)), 2481});
                                                                        double d = jLongValue3;
                                                                        ((Boolean) C0189.n(62661, null, new Object[]{Double.valueOf(d)})).booleanValue();
                                                                        double d2 = jLongValue2;
                                                                        ((Boolean) C0189.n(62661, null, new Object[]{Double.valueOf(d2)})).booleanValue();
                                                                        C0204.n(62847, linkedHashMap, new Object[]{str19, (String) C0194.n(82620, null, new Object[]{str20, (Object[]) C0184.n(40126, null, new Object[]{new Object[]{(Double) C0189.n(91561, null, new Object[]{Double.valueOf((100.0d * d) / d2)})}, 1})})});
                                                                        int i30 = 1509425;
                                                                        while (true) {
                                                                            i30 ^= 1509442;
                                                                            switch (i30) {
                                                                                case 18:
                                                                                    break;
                                                                                case 115:
                                                                                    i30 = 1509456;
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 1480:
                                                break;
                                            case 1513:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 47417:
                                    break;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
                return linkedHashMap;
            }
            return linkedHashMap;
        } catch (Exception e) {
            int i31 = 50689;
            while (true) {
                i31 ^= 50706;
                switch (i31) {
                    case 19:
                        i31 = 50720;
                        continue;
                    case 50:
                        C0219.n(8575, null, new Object[]{e, new StringBuilder((String) C0224.n(67549, null, new Object[]{(short[]) C0184.n(11174), 1336, Integer.valueOf(C0004.f160 ^ (-369)), 2994}))});
                        break;
                    default:
                        continue;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x02ed. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v121 */
    /* JADX WARN: Type inference failed for: r2v122 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v62, types: [java.lang.Object[]] */
    public final void j() {
        Map map;
        boolean zBooleanValue;
        int i;
        String str;
        int i2;
        String str2;
        int iIntValue;
        int i3;
        byte[] bArr;
        ?? r2 = (String) C0149.n(36390, null, new Object[]{(short[]) C0184.n(11174), 1371, Integer.valueOf(C0110.f319 ^ (-563)), 1127});
        String str3 = (String) C0152.n(8274, null, new Object[]{(short[]) C0184.n(11174), 1388, Integer.valueOf(C0061.f270 ^ (-916)), 490});
        String str4 = (String) C0198.n(98419, null, new Object[]{(short[]) C0184.n(11174), 1402, Integer.valueOf(C0068.f277 ^ 352), 1781});
        String str5 = (String) C0198.n(39623, null, new Object[]{(short[]) C0184.n(11174), 1407, Integer.valueOf(C0068.f277 ^ 353), 2733});
        String str6 = (String) C0157.n(78385, null, new Object[]{(short[]) C0184.n(11174), 1411, Integer.valueOf(C0012.f168 ^ 872), 1409});
        String str7 = (String) C0178.n(80760, null, new Object[]{(short[]) C0184.n(11174), 1416, Integer.valueOf(C0036.f192 ^ (-4)), 1390});
        String str8 = (String) C0149.n(34115, null, new Object[]{(short[]) C0184.n(11174), 1456, Integer.valueOf(C0111.f320 ^ (-940)), 2534});
        String str9 = (String) C0198.n(51837, null, new Object[]{(short[]) C0184.n(11174), 1464, Integer.valueOf(C0037.f193 ^ 829), 1619});
        String str10 = (String) C0162.n(68576, null, new Object[]{(short[]) C0184.n(11174), 1481, Integer.valueOf(C0083.f292 ^ (-249)), 2621});
        try {
            long jLongValue = ((Long) C0191.n(43180, null, new Object[0])).longValue();
            StringBuilder sb = new StringBuilder(str10);
            JsonObject jsonObject = (JsonObject) C0174.n(3898, null, new Object[]{(String) C0219.n(31142, null, new Object[]{(String) C0198.n(89992, sb, new Object[0]), (o) C0146.n(52361), (Map) C0146.n(88021, this)})});
            int iIntValue2 = ((Integer) C0177.n(28206, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str6}), new Object[0])).intValue();
            int i4 = 1616;
            while (true) {
                i4 ^= 1633;
                switch (i4) {
                    case 14:
                        break;
                    case 49:
                        i4 = iIntValue2 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        StringBuilder sb2 = new StringBuilder(str9);
                        Map map2 = (Map) C0231.n(80450, null, new Object[]{str4, (String) C0198.n(89992, sb2, new Object[0])});
                        C0184.n(23083, null, new Object[]{map2, r2});
                        int i5 = 1740;
                        while (true) {
                            i5 ^= 1757;
                            r2 = i5;
                            map = map2;
                            switch (i5) {
                                case 17:
                                    i5 = 1771;
                                    break;
                                case 54:
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        String str11 = (String) C0170.n(10931, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str5}), new Object[0]);
                        String str12 = (String) C0170.n(10931, (JsonElement) C0174.n(61056, jsonObject, new Object[]{(String) C0224.n(52346, null, new Object[]{(short[]) C0184.n(11174), 1533, Integer.valueOf(C0100.f309 ^ (-512)), 761})}), new Object[0]);
                        StringBuilder sb3 = new StringBuilder(str8);
                        String str13 = (String) C0198.n(89992, sb3, new Object[0]);
                        StringBuilder sb4 = new StringBuilder(str7);
                        Map map3 = (Map) C0184.n(91372, null, new Object[]{new a[]{new a(str3, str13), new a((String) C0149.n(63176, null, new Object[]{(short[]) C0184.n(11174), 1651, Integer.valueOf(C0025.f181 ^ (-674)), 884}), (String) C0198.n(89992, sb4, new Object[0])), new a(str5, str11)}});
                        int i6 = 48767;
                        while (true) {
                            i6 ^= 48784;
                            switch (i6) {
                                case 14:
                                    map = map3;
                                    r2 = map3;
                                    break;
                                case 239:
                                    i6 = 48798;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            while (true) {
                i ^= 48908;
                switch (i) {
                    case 22:
                        break;
                    case 53:
                        break;
                    case 503:
                        i = !zBooleanValue ? 49635 : 48953;
                        break;
                    case 32495:
                        boolean zBooleanValue2 = ((Boolean) C0219.n(36072, map, new Object[]{str3})).booleanValue();
                        int i7 = 49666;
                        while (true) {
                            i7 ^= 49683;
                            switch (i7) {
                                case 17:
                                    i7 = !zBooleanValue2 ? 49759 : 49728;
                                    break;
                                case 50:
                                    break;
                                case 76:
                                    int i8 = 49790;
                                    while (true) {
                                        i8 ^= 49807;
                                        switch (i8) {
                                            case 18:
                                                break;
                                            case 241:
                                                i8 = 49821;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 83:
                                    Object objN = C0157.n(70947, map, new Object[]{str3});
                                    C0146.n(53810, null, new Object[]{objN});
                                    Response response = (Response) C0231.n(95308, null, new Object[]{(Request) C0188.n(95309, (Request.Builder) C0177.n(36532, (Request.Builder) C0177.n(5807, null, new Object[]{(String) objN}), new Object[]{(Headers) C0177.n(13361, null, new Object[]{(HashMap) C0189.n(63978, null, new Object[]{(String) C0162.n(68576, null, new Object[]{(short[]) C0184.n(11174), 1670, Integer.valueOf(C0094.f303 ^ (-114)), 486}), (String) C0157.n(97123, null, new Object[]{(short[]) C0184.n(11174), 1680, Integer.valueOf(C0054.f210 ^ (-761)), 2077})})})}), new Object[0])});
                                    int iIntValue3 = ((Integer) C0188.n(85911, response, new Object[0])).intValue();
                                    int i9 = 49914;
                                    while (true) {
                                        i9 ^= 49931;
                                        switch (i9) {
                                            case 497:
                                                if (iIntValue3 == 200) {
                                                    i9 = 50658;
                                                }
                                                break;
                                            case 1711:
                                                break;
                                            case 1736:
                                                byte[] bArr2 = (byte[]) C0182.n(67839, (String) C0195.n(43185), new Object[]{(Charset) C0146.n(10675)});
                                                C0184.n(23083, null, new Object[]{bArr2, (String) C0198.n(6303, null, new Object[]{(short[]) C0184.n(11174), 1804, Integer.valueOf(C0065.f274 ^ 30), 2202})});
                                                bArr = bArr2;
                                                break;
                                            case 1769:
                                                ResponseBody responseBody = (ResponseBody) C0188.n(57688, response, new Object[0]);
                                                C0146.n(53810, null, new Object[]{responseBody});
                                                byte[] bArr3 = (byte[]) C0201.n(26051, responseBody, new Object[0]);
                                                C0184.n(23083, null, new Object[]{bArr3, (String) C0224.n(67549, null, new Object[]{(short[]) C0184.n(11174), 1794, Integer.valueOf(C0054.f210 ^ (-641)), 2662})});
                                                int i10 = 50689;
                                                while (true) {
                                                    i10 ^= 50706;
                                                    switch (i10) {
                                                        case 19:
                                                            i10 = 50720;
                                                            break;
                                                        case 50:
                                                            bArr = bArr3;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i9 = 50627;
                                    }
                                    String str14 = (String) C0182.n(27462, null, new Object[]{(short[]) C0184.n(11174), 1817, Integer.valueOf(C0040.f196 ^ (-330)), 1120});
                                    C0231.n(91077, null, new Object[]{(String) C0213.n(38612, null, new Object[]{str14}), Integer.valueOf(((Integer) C0210.n(71584, null, new Object[]{str14})).intValue()), bArr, new RunnableC0341a(1, this)});
                                    C0157.n(96203, null, new Object[]{new RunnableC0382v(this, map, 3)});
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
                return;
            }
            while (true) {
                i2 ^= 50830;
                switch (i2) {
                    case 18:
                        break;
                    case 53:
                        str2 = str;
                        break;
                    case 243:
                        i2 = str == null ? 51557 : 50875;
                        break;
                    case 4075:
                        str2 = (String) C0224.n(74697, null, new Object[]{(short[]) C0184.n(11174), 1822, Integer.valueOf(C0036.f192 ^ (-48)), 1781});
                        break;
                    default:
                        break;
                }
            }
            while (true) {
                i3 ^= 51605;
                switch (i3) {
                    case 17:
                        if (iIntValue <= 0) {
                            i3 = 51681;
                        }
                        break;
                    case 54:
                        break;
                    case 87:
                        return;
                    case 116:
                        C0162.n(83524, (PrintStream) C0195.n(72538), new Object[]{Long.valueOf(((Long) C0162.n(73560, null, new Object[]{(String) C0195.n(36669, null, new Object[]{(String) C0146.n(37522)})})).longValue())});
                        return;
                    default:
                        continue;
                }
                i3 = 51650;
            }
        } catch (Exception e) {
            int i11 = 1864;
            while (true) {
                i11 ^= 1881;
                switch (i11) {
                    case 17:
                        i11 = 48674;
                        continue;
                    case 47483:
                        StringBuilder sb5 = new StringBuilder((String) C0162.n(41206, null, new Object[]{(short[]) C0184.n(11174), 1661, Integer.valueOf(C0134.f343 ^ (-250)), 2377}));
                        map = (Map) C0231.n(80450, null, new Object[]{str4, (String) C0198.n(89992, sb5, new Object[0])});
                        C0184.n(23083, null, new Object[]{map, r2});
                        break;
                    default:
                        continue;
                }
            }
        }
        zBooleanValue = ((Boolean) C0219.n(36072, map, new Object[]{str4})).booleanValue();
        i = 48891;
        str = (String) C0157.n(70947, map, new Object[]{str4});
        i2 = 50813;
        C0188.n(1950, null, new Object[]{(String) C0198.n(26710, (String) C0181.n(53852, null, new Object[]{(short[]) C0184.n(11174), 1826, Integer.valueOf(C0088.f297 ^ 480), 626}), new Object[]{str2})});
        iIntValue = ((Integer) C0168.n(23434, null, new Object[0])).intValue();
        i3 = 51588;
    }
}

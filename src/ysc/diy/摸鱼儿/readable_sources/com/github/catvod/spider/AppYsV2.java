package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.N1;
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
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
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
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class AppYsV2 extends Spider {
    public static final Pattern[] f;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f14short = {1038, 1097, 1110, 1038, 1047, 1052, 3051, 2980, 2997, 2995, 2993, 3049, 3045, 3058, 3000, 3005, 3001, 3005, 2976, 3049, 3045, 3044, 3058, 2979, 2992, 3049, 3226, 3293, 3276, 3285, 3287, 3289, 3269, 3201, 1238, 1179, 1173, 1161, 1156, 1177, 1181, 1173, 1229, 1844, 1890, 1907, 1909, 1911, 1839, 506, 434, 417, 504, 585, 529, 520, 515, 1553, 1536, 1561, 1630, 1536, 1560, 1536, 1631, 1553, 1536, 1536, 667, 644, 642, 659, 659, 3318, 3296, 3300, 3319, 3302, 3309, 3258, 3313, 3296, 3325, 3313, 3256, 1776, 1702, 1713, 1771, 1256, 1261, 1271, 1264, 2945, 2948, 2961, 2948, 1067, 1074, 1081, 1026, 1076, 1081, 2853, 2876, 2871, 2828, 2849, 2870, 2878, 2866, 2849, 2872, 2848, 280, 257, 266, 305, 286, 263, 269, 2643, 2634, 2625, 2682, 2635, 2628, 2632, 2624, 454, 461, 464, 476, 452, 449, 454, 451, 2237, 2208, 2237, 2213, 2220, 752, 745, 739, 2791, 2784, 2805, 2784, 2801, 791, 792, 789, 775, 775, 2331, 2314, 2323, 2388, 2314, 2322, 2314, 2389, 2331, 2314, 2314, 1988, 2011, 2013, 1996, 1996, 1531, 1468, 1443, 1531, 1506, 1513, 2898, 2826, 2835, 2840, 739, 696, 693, 700, 681, 703, 1779, 1788, 1771, 1698, 1769, 1778, 1782, 1784, 1779, 1696, 2585, 1291, 1404, 3110, 1693, 1680, 1689, 1676, 1718, 1664, 1677, 1118, 1107, 1114, 1103, 1141, 1092, 1099, 1095, 1103, 1546, 1551, 1557, 1554, 626, 631, 610, 631, 1100, 1089, 1096, 1117, 1127, 1117, 1088, 1100, 1117, 1110, 1116, 29467, -26551, 1287, 1307, 1311, 1292, 1535, 1522, 1533, 1524, 805, 822, 801, 805, 32018, 22242, 23452, 19221, -32202, -31781, 24482, 23464, 1973, 1979, 1959, 1637, 1642, 1638, 1646, 2329, 1092, 2675, 2660, 2665, 2672, 2656, 2182, 2185, 2188, 2196, 2181, 2194, 2195, 2425, 2408, 2417, 2358, 2408, 2416, 2408, 2359, 2425, 2408, 2408, 2995, 2988, 2986, 3003, 3003, 731, 668, 643, 731, 706, 713, 808, 880, 873, 866, 1831, 1918, 1895, 1900, 1880, 1888, 1898, 1865, 1892, 1892, 1847, 1897, 1912, 1889, 1891, 1901, 1905, 1845, 425, 484, 490, 502, 507, 486, 482, 490, 434, 1050, 1091, 1114, 1105, 1125, 1117, 1111, 1140, 1113, 1113, 893, 890, 880, 881, 876, 843, 866, 893, 880, 881, 891, 811, 864, 891, 895, 881, 890, 809, 1300, 1302, 1295, 1296, 1308, 1375, 1289, 1304, 1310, 1308, 1348, 1352, 1375, 1304, 1291, 1308, 1304, 1348, 1375, 1293, 1280, 1289, 1308, 1348, 1375, 1290, 1293, 1304, 1291, 1293, 1348, 1512, 1521, 1530, 1473, 1516, 1531, 1523, 1535, 1516, 1525, 1517, 875, 882, 889, 834, 877, 884, 894, 3261, 3236, 3247, 3220, 3237, 3242, 3238, 3246, 1055, 1030, 1037, 1078, 1024, 1037, 1485, 1480, 1501, 1480, 3051, 3040, 3069, 3057, 3049, 3052, 3051, 3054, 2549, 2536, 2549, 2541, 2532, 676, 701, 695, 281, 286, 267, 286, 271, 477, 455, 450, 472, 479, 569, 544, 555, 528, 547, 550, 572, 571, 1752, 1757, 1735, 1728, 1663, 1625, 1615, 1624, 1543, 1643, 1613, 1615, 1604, 1630, 2520, 1753, 1748, 1744, 1749, 1748, 1731, 1492, 1489, 1502, 1501, 1489, 1499, 1477, 2618, 2603, 2616, 2617, 2607, 2524, 2523, 2501, 2061, 1478, 1498, 1498, 1502, 2696, 2716, 2127, 2121, 2143, 2120, 2071, 2139, 2141, 2143, 2132, 2126, 3176, 3187, 3178, 3178, 1967, 2043, 2023, 2046, 2047, 2272, 2300, 2289, 2281, 2245, 2274, 2300, 2012, 1998, 403, 3035, 2947, 2970, 2961, 1873, 1870, 1864, 1881, 1881, 3240, 3299, 3298, 3315, 3302, 3310, 3307, 3256, 3313, 3304, 3299, 3288, 3310, 3299, 3258, 744, 687, 688, 744, 753, 762, 2218, 2302, 2281, 2272, 2259, 2272, 2277, 2273, 2277, 2296, 2225, 2237, 2236, 2298, 2237, 2220, 2229, 2231, 2233, 2213, 2273, 495, 418, 428, 432, 445, 416, 420, 428, 500, 523, 538, 515, 580, 538, 514, 538, 581, 523, 538, 538, 1461, 1450, 1447, 1446, 1452, 1436, 1447, 1446, 1463, 1442, 1450, 1455, 1532, 1450, 1447, 1534, 1360, 1345, 1368, 1311, 1345, 1369, 1345, 1310, 1360, 1345, 1345, 1310, 513, 536, 531, 552, 537, 534, 538, 530, 1383, 1406, 1397, 1358, 1394, 1406, 1407, 1381, 1396, 1407, 1381, 1183, 1166, 1181, 1180, 1162, 1200, 1166, 1183, 1158, 3020, 3011, 3023, 3015, 2614, 2618, 2609, 2608, 1396, 1389, 1382, 1373, 1399, 1392, 1390, 1373, 1397, 1387, 1398, 1386, 1373, 1394, 1390, 1379, 1403, 1383, 1392, 2684, 2683, 2661, 3040, 3065, 3058, 3017, 3061, 3066, 3063, 3045, 3045, 2951, 2954, 2947, 2966, 2988, 2973, 2962, 2974, 2966, 982, 979, 966, 979, 2730, 2739, 2744, 2691, 2744, 2741, 2734, 2745, 2751, 2728, 2739, 2734, 493, 500, 511, 452, 506, 504, 495, 500, 489, 2164, 2157, 2150, 2141, 2160, 2151, 2159, 2147, 2160, 2153, 2161, 1202, 1195, 1184, 1179, 1189, 1206, 1185, 1189, 2015, 1990, 1997, 2038, 2000, 1996, 1992, 2011, 812, 821, 830, 773, 810, 819, 825, 1292, 1301, 1310, 1317, 1299, 1310, 2058, 2067, 2072, 2083, 2069, 2066, 2074, 2067, 2476, 2485, 2494, 2437, 2474, 2486, 2491, 2467, 2437, 2486, 2483, 2473, 2478, 2093, 2097, 2108, 2084, 2104, 2095, 2050, 2100, 2099, 2107, 2098, 1695, 1668, 1667, 1691, 1324, 1336, 1317, 1319, 8964, 809, 2782, 478, 463, 476, 477, 459, 2126, 2143, 2124, 2125, 2139, 2060, 2414, 2418, 2418, 2422, 2377, 636, 2306, 3017, 3017, 3017, 3089, 3080, 3075, 3128, 3095, 3083, 3078, 3102, 3128, 3073, 3093, 3080, 3082, 1188, 1213, 1206, 1165, 1186, 1214, 1203, 1195, 1165, 1191, 1184, 1214, 587, 563, 587, 563, 587, 563, 1390, 1387, 1393, 1398, 2574, 2581, 2574, 2587, 2582, 2570, 2587, 2589, 2591, 1263, 1258, 1262, 1258, 1271, 939, 944, 939, 958, 947, 2985, 3000, 3006, 3004, 3002, 2998, 2988, 2999, 2989, 1659, 1662, 1643, 1662, 724, 659, 652, 724, 717, 710, 899, 927, 923, 904, 1280, 1293, 1282, 1291, 3000, 2987, 3004, 3000, 982, 985, 980, 966, 966, 1697, 1770, 1767, 1774, 1787, 1699, 3135, 3194, 3189, 3192, 3178, 3178, 3108, 1482, 1408, 1421, 1410, 1419, 1489, 3218, 3285, 3270, 3281, 3285, 3209, 3140, 3099, 3079, 3075, 3088, 3167, 402, 470, 461, 393, 402, 452, 469, 467, 465, 393, 2743, 2813, 2808, 2812, 2808, 2789, 2732, 2720, 2729, 1815, 1872, 1857, 1880, 1882, 1876, 1864, 1804, 2834, 2911, 2897, 2893, 2880, 2909, 2905, 2897, 2825, 3104, 3121, 3112, 3183, 3121, 3113, 
    3121, 3182, 3104, 3121, 3121, 1332, 1323, 1325, 1340, 1340, 986, 898, 923, 912, 2118, 2051, 2060, 2049, 2067, 2067, 2141, 29499, -26519, 2051, 2060, 2049, 2067, 2067, 2118, 2049, 2066, 2053, 2049, 2141, 29499, -26519, 2049, 2066, 2053, 2049, 2118, 2060, 2049, 2062, 2055, 2141, 29499, -26519, 2060, 2049, 2062, 2055, 2118, 2073, 2053, 2049, 2066, 2141, 29499, -26519, 2073, 2053, 2049, 2066, 2118, 2060, 2057, 2061, 2057, 2068, 2141, 2129, 2136, 2118, 2064, 2049, 2055, 2053, 2141, 2115, 2096, 2094, 2115, 543, 602, 597, 600, 586, 586, 516, 31074, -28112, 602, 597, 600, 586, 586, 543, 600, 587, 604, 600, 516, 31074, -28112, 600, 587, 604, 600, 543, 597, 600, 599, 606, 516, 31074, -28112, 597, 600, 599, 606, 543, 576, 604, 600, 587, 516, 31074, -28112, 576, 604, 600, 587, 543, 603, 576, 516, 25003, 23734, 543, 597, 592, 596, 592, 589, 516, 520, 513, 543, 585, 600, 606, 604, 516, 538, 617, 631, 538, 475, 414, 401, 412, 398, 398, 448, 31398, -28172, 414, 401, 412, 398, 398, 475, 412, 399, 408, 412, 448, 31398, -28172, 412, 399, 408, 412, 475, 401, 412, 403, 410, 448, 31398, -28172, 401, 412, 403, 410, 475, 388, 408, 412, 399, 448, 31398, -28172, 388, 408, 412, 399, 475, 401, 404, 400, 404, 393, 448, 460, 453, 475, 397, 410, 448, 478, 429, 435, 478, 1917, 1806, 1808, 1917, 31392, -28174, 408, 407, 410, 392, 392, 32015, -27043, 1589, 1574, 1585, 1589, 28876, -25698, 3067, 3062, 3065, 3056, 29202, -26304, 2352, 2348, 2344, 2363, 26250, 23447, 2248, 2253, 2263, 2256, 437, 428, 423, 412, 426, 423, 2955, 2962, 2969, 2978, 2959, 2968, 2960, 2972, 2959, 2966, 2958, 1758, 1735, 1740, 1783, 1752, 1729, 1739, 1985, 2008, 2003, 2024, 2009, 2006, 2010, 2002, 1069, 1062, 1083, 1079, 1071, 1066, 1069, 1064, 3146, 3159, 3146, 3154, 3163, 664, 641, 651, 2177, 2182, 2195, 2182, 2199, 2939, 2922, 2924, 2926, 2849, 2853, 2855, 2938, 2941, 2915, 2931, 2937, 2931, 2937, 2918, 2923, 2931, 2943, 2919, 2943, 2899, 2864, 2918, 2923, 2854, 2866, 2134, 2122, 2122, 2126, 2125, 2049, 2052, 2065, 2065, 2149, 2144, 2065, 2147, 2068, 818, 814, 803, 827, 807, 816, 895, 812, 807, 821, 2052, 2140, 2129, 2126, 2072, 2129, 2140, 2053, 2074, 2126, 2129, 2140, 2141, 2135, 2074, 3046, 3006, 2995, 2988, 3066, 2995, 3006, 3047, 3064, 2945, 2948, 3064, 2951, 3056, 3045, 2986, 2998, 3003, 2979, 3007, 2984, 3064, 1816, 1852, 1827, 1818, 1827, 1792, 1852, 1841, 1833, 1845, 1826, 1804, 1912, 1041, 1092, 1099, 1119, 1100, 1088, 1096, 1142, 1137, 1118, 1137, 1150, 1136, 1031, 1042, 1118, 1119, 1102, 1040, 1039, 1142, 1139, 1039, 1136, 1030, 1042, 1039, 3017, 2947, 2972, 2961, 2960, 2970, 2990, 2985, 2950, 2985, 2982, 2984, 3039, 3018, 2950, 2951, 2966, 3016, 3031, 2990, 2987, 3031, 2984, 3038, 3018, 3031, -3402, 2875, 2858, 2867, 2932, 2858, 2866, 2858, 2933, 2875, 2858, 2858, 544, 575, 569, 552, 552, 2732, 2795, 2804, 2732, 2741, 2750, 3026, 2969, 2964, 2973, 2952, 3024, 1019, 931, 954, 945, 2711, 2696, 2693, 2692, 2702, 2782, 2709, 2696, 2693, 2780, 3090, 3090, 3090, 3147, 3080, 3074, 3089, 3091, 3147, 3078, 3082, 3080, 555, 582, 612, 625, 610, 615, 615, 618, 548, 574, 549, 571, 2468, 788, 818, 804, 819, 876, 768, 806, 804, 815, 821, 1838, 1817, 1818, 1817, 1806, 1817, 1806, 624, 621, 624, 613, 618, 554, 617, 611, 624, 626, 3023, 3012, 3009, 3012, 3023, 3012, 3009, 3012, 2299, 2227, 2223, 2223, 2219, 2216, 2273, 2292, 2292, 2220, 2220, 2220, 2293, 2233, 2226, 2231, 2226, 2233, 2226, 2231, 2226, 2293, 2232, 2228, 2230, 2292, 1524, 1433, 1467, 1454, 1469, 1464, 1464, 1461, 1531, 1505, 1530, 1508, 1524, 1532, 1411, 1469, 1466, 1456, 1467, 1443, 1447, 1524, 1434, 1408, 1524, 1509, 1508, 1530, 1508, 1519, 1524, 1411, 1469, 1466, 1506, 1504, 1519, 1524, 1452, 1506, 1504, 1533, 1524, 1429, 1444, 1444, 1464, 1457, 1411, 1457, 1462, 1439, 1469, 1440, 1531, 1505, 1511, 1507, 1530, 1511, 1506, 1524, 1532, 1439, 1436, 1408, 1433, 1432, 1528, 1524, 1464, 1469, 1471, 1457, 1524, 1427, 1457, 1463, 1471, 1467, 1533, 1524, 1431, 1468, 1446, 1467, 1465, 1457, 1531, 1509, 1510, 1510, 1530, 1508, 1530, 1508, 1530, 1508, 1524, 1415, 1461, 1458, 1461, 1446, 1469, 1531, 1505, 1511, 1507, 1530, 1511, 1506, 3140, 3147, 3142, 3156, 3156, 1420, 1439, 1416, 1420, 2794, 2791, 2792, 2785, 2955, 2967, 2963, 2944, 29171, -25951, 1889, 22050, -26718, 1911, 1889, 2911, 1966, 2639, 2022, 1953, 1982, 2022, 2047, 2036, 983, 911, 918, 925, 1388, 26356, 23529, 1357, 21518, -27250, 1371, 1357, 25190, 24790, 1371, 1298, 1295, 1291, 1283, 1357, 25190, 30091, 1371, 1294, 1295, 1298, 1301, 1357, -29022, 22368, 1371, 1301, 1285, 1289, 1300, 1283, 1216, 1233, 1224, 1167, 1233, 1225, 1233, 1166, 1216, 1233, 1233, 717, 722, 724, 709, 709, 2007, 1936, 1935, 2007, 1998, 1989, 2104, 2144, 2169, 2162, 1261, 1224, 1221, 1247, 1216, 1218, 1158, 1179, 1159, 1176, 1159, 1177, 2107, 2111, 2108, 2080, 2080, 2084, 2171, 2144, 2170, 2149, 2150, 2170, 2148, 2059, 2094, 2109, 2107, 2144, 2173, 2145, 2174, 2171, 2159, 2151, 2091, 2094, 2109, 2107, 2165, 2086, 2080, 2150, 2965, 2995, 2981, 2994, 3053, 2945, 2983, 2981, 2990, 2996, 2386, 2395, 2346, 1132, 1133, 1151, 1044, 1025, 2711, 2690, 2688, 2762, 1033, 1036, 1049, 1036, 2688, 2695, 2713, 2452, 2452, 1716, 1704, 1704, 1708, 1711, 1766, 479, 451, 451, 455, 2021, 2027, 2031, 2021, 2027, 2031, 2034, 1956, 1957, 1958, 2232, 2288, 2303, 2274, 2220, 1799, 1802, 1806, 1803, 1802, 1821, 2928, 2909, 2905, 2908, 2909, 2890, 1764, 1769, 1773, 1768, 1769, 1790, 1791, 2534, 2507, 2511, 2506, 2507, 2524, 2525, 756, 754, 740, 755, 684, 736, 742, 740, 751, 757, 2330, 2364, 2346, 2365, 2402, 2318, 2344, 2346, 2337, 2363, 1657, 2682, 2669, 2670, 2669, 2682, 2669, 2682, 2361, 2318, 2317, 2318, 2329, 2318, 2329, 1136, 1121, 1138, 1139, 1125, 792, 2506, 3021, 1978, 2948, 1140, 2812, 2785, 2789, 2797, 2811, 2812, 2793, 2789, 2808, 1061, 1056, 1077, 1056, 1074, 1064, 1062, 1071, 2993, 2995, 2982, 2999, 2997, 3005, 2976, 2987, 2961, 
    3005, 3004, 2982, 2999, 3004, 2982, 1718, 1719, 1702, 1715, 1723, 1726, 1681, 1725, 1724, 1702, 1719, 1724, 1702, 1949, 1946, 1944, 1936, 1974, 1946, 1947, 1921, 1936, 1947, 1921, 3305, 3310, 3308, 3300, 3287, 3304, 3301, 3300, 3310, 3266, 3310, 3311, 3317, 3300, 3311, 3317, 1011, 2518, 1457, 1440, 1465, 2991, 3006, 2983, 3005, 2983, 2985, 2976, 2981, 2987, 2999, 2549, 2544, 2533, 2544, 2530, 2552, 2550, 2559, 2554, 2548, 2536, 469, 457, 457, 461, 2046, 2046, 2046, 932, 952, 949, 941, 945, 934, 919, 955, 954, 928, 945, 954, 928, 2399, 2377, 2381, 2398, 2383, 2372, 2415, 2371, 2370, 2392, 2377, 2370, 2392};
    public String a = "";
    public String b = "";
    public String c = "";
    public final HashMap d = new HashMap();
    public String[] e = null;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) throws JSONException {
        String strI;
        String strE = e();
        boolean zK = k();
        String strM432 = "v1.vod";
        if (zK && strE.endsWith(strM432)) {
            String strB = com.github.catvod.spider.merge.D.b.B("?page=1&limit=10&wd=", URLEncoder.encode(str));
            if (k()) {
                String strI2 = i();
                StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strB, "&apikey=");
                sbP.append(a());
                sbP.append("&keytime=");
                sbP.append(strI2);
                strB = c(sbP.toString(), strI2);
            }
            strI = com.github.catvod.spider.merge.D.b.i(strE, strB);
        } else {
            String strEncode = URLEncoder.encode(str);
            boolean zEndsWith = strE.endsWith(strM432);
            String strM499 = "&page=";
            String strM471 = "?wd=";
            if (zEndsWith || strE.contains(".vod")) {
                strI = strE + strM471 + strEncode + strM499;
            } else if (strE.contains("api.php/app") || strE.contains("xgapp")) {
                strI = strE + "search?text=" + strEncode + "&pg=";
            } else {
                strI = strE + strM471 + strEncode + strM499;
            }
        }
        JSONArray jSONArray = null;
        JSONObject jSONObject = new JSONObject(b(X1.X(strI, null, h(strI))));
        JSONArray jSONArray2 = new JSONArray();
        String strM414 = "list";
        if (jSONObject.has(strM414) && (jSONObject.get(strM414) instanceof JSONArray)) {
            jSONArray = jSONObject.getJSONArray(strM414);
        } else {
            String strM65 = "data";
            if (jSONObject.has(strM65) && (jSONObject.get(strM65) instanceof JSONObject) && jSONObject.getJSONObject(strM65).has(strM414) && (jSONObject.getJSONObject(strM65).get(strM414) instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONObject(strM65).getJSONArray(strM414);
            } else if (jSONObject.has(strM65) && (jSONObject.get(strM65) instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONArray(strM65);
            }
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String strM314 = "vod_id";
                boolean zHas = jSONObject2.has(strM314);
                String strM529 = "vod_remarks";
                String strM116 = "vod_pic";
                String strM433 = "vod_name";
                if (zHas) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(strM314, jSONObject2.getString(strM314));
                    jSONObject3.put(strM433, jSONObject2.getString(strM433));
                    jSONObject3.put(strM116, jSONObject2.getString(strM116));
                    jSONObject3.put(strM529, jSONObject2.getString(strM529));
                    jSONArray2.put(jSONObject3);
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(strM314, jSONObject2.getString("nextlink"));
                    jSONObject4.put(strM433, jSONObject2.getString("title"));
                    jSONObject4.put(strM116, jSONObject2.getString("pic"));
                    jSONObject4.put(strM529, jSONObject2.getString("state"));
                    jSONArray2.put(jSONObject4);
                }
            }
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put(strM414, jSONArray2);
        return jSONObject5.toString();
    }

    /* JADX WARN: Code duplicated, block: B:66:0x028f A[PHI: r23
  0x028f: PHI (r23v16 java.lang.String) = (r23v8 java.lang.String), (r23v9 java.lang.String), (r23v10 java.lang.String), (r23v17 java.lang.String) binds: [B:80:0x02ed, B:76:0x02d1, B:72:0x02b5, B:65:0x028d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x037e  */
    /* JADX WARN: Code duplicated, block: B:97:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:98:0x03c4  */
    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x02f1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, org.json.JSONArray] */
    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws JSONException {
        String strConcat;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        JSONArray jSONArray;
        int i2;
        String str9;
        String str10;
        String str11;
        String str12;
        int i3;
        JSONObject jSONObject;
        String strTrim;
        int iIndexOf;
        String strM186;
        String strM414;
        int i4;
        String str13;
        byte b;
        String strM223;
        String strM199 = "class";
        int i5 = 2;
        String strE = e();
        String str14 = "";
        JSONArray jSONArray2 = null;
        if (strE.contains("api.php/app") || strE.contains("xgapp")) {
            strConcat = strE.concat("nav?token=");
        } else if (strE.endsWith("v1.vod") || strE.contains(".vod")) {
            boolean zK = k();
            String strM10 = "/types";
            if (zK) {
                strM10 = c(strM10, null);
            }
            strConcat = com.github.catvod.spider.merge.D.b.i(strE, strM10);
        } else {
            strConcat = "";
        }
        boolean zIsEmpty = strConcat.isEmpty();
        String strM355 = "=";
        String strM182 = "\\+";
        String strM567 = "\n";
        String strM285 = "type_id";
        String strM183 = "type_name";
        if (zIsEmpty) {
            String[] strArrSplit = g(strConcat, null).split(strM567)[0].split(strM182);
            jSONArray2 = new JSONArray();
            int i6 = 1;
            while (i6 < strArrSplit.length) {
                String[] strArrSplit2 = strArrSplit[i6].trim().split(strM355);
                if (strArrSplit2.length < i5) {
                    i = 1;
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(strM183, strArrSplit2[0].trim());
                    i = 1;
                    jSONObject2.put(strM285, strArrSplit2[1].trim());
                    jSONArray2.put(jSONObject2);
                }
                i6 += i;
                i5 = 2;
            }
        } else {
            SpiderDebug.log(strConcat);
            JSONObject jSONObject3 = new JSONObject(b(X1.X(strConcat, null, h(strConcat))));
            String strM432 = "list";
            if (jSONObject3.has(strM432) && (jSONObject3.get(strM432) instanceof JSONArray)) {
                jSONArray2 = jSONObject3.getJSONArray(strM432);
            } else {
                String strM65 = "data";
                if (jSONObject3.has(strM65) && (jSONObject3.get(strM65) instanceof JSONObject) && jSONObject3.getJSONObject(strM65).has(strM432) && (jSONObject3.getJSONObject(strM65).get(strM432) instanceof JSONArray)) {
                    jSONArray2 = jSONObject3.getJSONObject(strM65).getJSONArray(strM432);
                } else if (jSONObject3.has(strM65) && (jSONObject3.get(strM65) instanceof JSONArray)) {
                    jSONArray2 = jSONObject3.getJSONArray(strM65);
                }
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        JSONArray jSONArray3 = new JSONArray();
        if (jSONArray2 != null) {
            int i7 = 0;
            while (i7 < jSONArray2.length()) {
                JSONObject jSONObject5 = jSONArray2.getJSONObject(i7);
                String string = jSONObject5.getString(strM183);
                String string2 = jSONObject5.getString(strM285);
                JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v(strM285, string2, strM183, string);
                JSONObject jSONObjectOptJSONObject = jSONObject5.optJSONObject("type_extend");
                if (z) {
                    String[] strArrSplit3 = g(strConcat, jSONObjectOptJSONObject).split(strM567);
                    ?? jSONArray4 = new JSONArray();
                    ?? IsEmpty = strConcat.isEmpty();
                    while (IsEmpty < strArrSplit3.length) {
                        String strTrim2 = strArrSplit3[IsEmpty].trim();
                        if (strTrim2.isEmpty()) {
                            str9 = strM199;
                            str14 = str14;
                            str10 = strM355;
                            str11 = strM285;
                            str12 = strM183;
                            i3 = 1;
                        } else {
                            String[] strArrSplit4 = strTrim2.split(strM182);
                            String strTrim3 = strArrSplit4[0].trim();
                            String strM339 = "筛选";
                            if (strTrim3.contains(strM339)) {
                                String strReplace = strTrim3.replace(strM339, str14);
                                strReplace.getClass();
                                switch (strReplace.hashCode()) {
                                    case 3002509:
                                        str13 = strTrim3;
                                        if (!strReplace.equals("area")) {
                                            b = -1;
                                        } else {
                                            b = 0;
                                        }
                                        break;
                                    case 3314158:
                                        str13 = strTrim3;
                                        if (!strReplace.equals("lang")) {
                                            b = -1;
                                        } else {
                                            b = 1;
                                        }
                                        break;
                                    case 3704893:
                                        str13 = strTrim3;
                                        if (!strReplace.equals("year")) {
                                            b = -1;
                                        } else {
                                            b = 2;
                                        }
                                        break;
                                    case 94742904:
                                        if (strReplace.equals(strM199)) {
                                            str13 = strTrim3;
                                            b = 3;
                                            break;
                                        }
                                    default:
                                        str13 = strTrim3;
                                        b = -1;
                                        break;
                                }
                                switch (b) {
                                    case 0:
                                        strM223 = "地区";
                                        str8 = strM223;
                                        strTrim3 = strReplace;
                                        break;
                                    case 1:
                                        strM223 = "语言";
                                        str8 = strM223;
                                        strTrim3 = strReplace;
                                        break;
                                    case 2:
                                        strM223 = "年份";
                                        str8 = strM223;
                                        strTrim3 = strReplace;
                                        break;
                                    case 3:
                                        strM223 = "类型";
                                        str8 = strM223;
                                        strTrim3 = strReplace;
                                        break;
                                    default:
                                        strTrim3 = strReplace;
                                        str8 = str13;
                                        break;
                                }
                                ?? V = com.github.catvod.spider.merge.D.b.v("key", strTrim3, "name", str8);
                                jSONArray = new JSONArray();
                                i2 = 1;
                                while (i2 < strArrSplit4.length) {
                                    jSONObject = new JSONObject();
                                    String[] strArr = strArrSplit4;
                                    strTrim = strArrSplit4[i2].trim();
                                    String str15 = strM285;
                                    iIndexOf = strTrim.indexOf(strM355);
                                    String str16 = strM355;
                                    strM186 = "v";
                                    String str17 = strM183;
                                    strM414 = "n";
                                    String str18 = strM199;
                                    if (iIndexOf == -1) {
                                        jSONObject.put(strM414, strTrim);
                                        jSONObject.put(strM186, strTrim);
                                        i4 = 1;
                                    } else {
                                        jSONObject.put(strM414, strTrim.substring(0, iIndexOf).trim());
                                        i4 = 1;
                                        jSONObject.put(strM186, strTrim.substring(iIndexOf + 1).trim());
                                    }
                                    jSONArray.put(jSONObject);
                                    i2 += i4;
                                    strM285 = str15;
                                    strArrSplit4 = strArr;
                                    strM355 = str16;
                                    strM183 = str17;
                                    strM199 = str18;
                                }
                                str9 = strM199;
                                str10 = strM355;
                                str11 = strM285;
                                str12 = strM183;
                                i3 = 1;
                                V.put("value", jSONArray);
                                jSONArray4.put(V);
                            } else {
                                str8 = strTrim3;
                            }
                            ?? V2 = com.github.catvod.spider.merge.D.b.v("key", strTrim3, "name", str8);
                            jSONArray = new JSONArray();
                            i2 = 1;
                            while (i2 < strArrSplit4.length) {
                                jSONObject = new JSONObject();
                                String[] strArr2 = strArrSplit4;
                                strTrim = strArrSplit4[i2].trim();
                                String str19 = strM285;
                                iIndexOf = strTrim.indexOf(strM355);
                                String str110 = strM355;
                                strM186 = "v";
                                String str111 = strM183;
                                strM414 = "n";
                                String str112 = strM199;
                                if (iIndexOf == -1) {
                                    jSONObject.put(strM414, strTrim);
                                    jSONObject.put(strM186, strTrim);
                                    i4 = 1;
                                } else {
                                    jSONObject.put(strM414, strTrim.substring(0, iIndexOf).trim());
                                    i4 = 1;
                                    jSONObject.put(strM186, strTrim.substring(iIndexOf + 1).trim());
                                }
                                jSONArray.put(jSONObject);
                                i2 += i4;
                                strM285 = str19;
                                strArrSplit4 = strArr2;
                                strM355 = str110;
                                strM183 = str111;
                                strM199 = str112;
                            }
                            str9 = strM199;
                            str10 = strM355;
                            str11 = strM285;
                            str12 = strM183;
                            i3 = 1;
                            V2.put("value", jSONArray);
                            jSONArray4.put(V2);
                        }
                        int i8 = IsEmpty + i3;
                        strM182 = strM182;
                        strArrSplit3 = strArrSplit3;
                        str14 = str14;
                        strM567 = strM567;
                        strM285 = str11;
                        strM355 = str10;
                        strM183 = str12;
                        strM199 = str9;
                        IsEmpty = i8;
                    }
                    str = strM199;
                    str2 = str14;
                    str3 = strM355;
                    str4 = strM182;
                    str5 = strM567;
                    str6 = strM285;
                    str7 = strM183;
                    String strM83 = "filters";
                    if (!jSONObject4.has(strM83)) {
                        jSONObject4.put(strM83, new JSONObject());
                    }
                    jSONObject4.getJSONObject(strM83).put(string2, jSONArray4);
                } else {
                    str = strM199;
                    str2 = str14;
                    str3 = strM355;
                    str4 = strM182;
                    str5 = strM567;
                    str6 = strM285;
                    str7 = strM183;
                }
                jSONArray3.put(jSONObjectV);
                i7++;
                jSONArray2 = jSONArray2;
                strConcat = strConcat;
                strM182 = str4;
                str14 = str2;
                strM567 = str5;
                strM285 = str6;
                strM355 = str3;
                strM183 = str7;
                strM199 = str;
            }
        }
        jSONObject4.put(strM199, jSONArray3);
        return jSONObject4.toString();
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        return AbstractC0309x1.j(str);
    }

    private /* synthetic */ String $host$4a0a5542814a3609() throws JSONException {
        String strConcat;
        boolean z;
        String strM379;
        String strE = e();
        if (strE.contains("api.php/app") || strE.contains("xgapp")) {
            strConcat = strE.concat("index_video?token=");
        } else if (strE.endsWith("v1.vod") || strE.contains(".vod")) {
            if (k()) {
                String strI = i();
                strM379 = c("/vodPhbAll?apikey=" + a() + "&keytime=" + strI, strI);
            } else {
                strM379 = "/vodPhbAll";
            }
            strConcat = com.github.catvod.spider.merge.D.b.i(strE, strM379);
        } else {
            strConcat = "";
        }
        if (strConcat.isEmpty()) {
            strConcat = f(strE) + "movie&page=1&area=&type=&start=";
            z = true;
        } else {
            z = false;
        }
        SpiderDebug.log(strConcat);
        JSONObject jSONObject = new JSONObject(b(X1.X(strConcat, null, h(strConcat))));
        JSONArray jSONArray = new JSONArray();
        String strM558 = "vod_remarks";
        String strM408 = "vod_pic";
        String strM511 = "vod_name";
        String strM126 = "vod_id";
        if (z) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("data");
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(strM126, jSONObject2.getString("nextlink"));
                jSONObject3.put(strM511, jSONObject2.getString("title"));
                jSONObject3.put(strM408, jSONObject2.getString("pic"));
                jSONObject3.put(strM558, jSONObject2.getString("state"));
                jSONArray.put(jSONObject3);
            }
        } else {
            ArrayList<JSONArray> arrayList = new ArrayList();
            d(jSONObject, "vlist", arrayList);
            if (arrayList.isEmpty()) {
                d(jSONObject, "vod_list", arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (JSONArray jSONArray3 : arrayList) {
                for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                    JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
                    String string = jSONObject4.getString(strM126);
                    if (!arrayList2.contains(string)) {
                        arrayList2.add(string);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put(strM126, string);
                        jSONObject5.put(strM511, jSONObject4.getString(strM511));
                        jSONObject5.put(strM408, jSONObject4.getString(strM408));
                        jSONObject5.put(strM558, jSONObject4.getString(strM558));
                        jSONArray.put(jSONObject5);
                    }
                }
            }
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("list", jSONArray);
        return jSONObject6.toString();
    }

    private /* synthetic */ boolean $host$53940b53855fde82() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00df  */
    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws JSONException {
        String str3;
        JSONObject jSONObject;
        JSONObject jSONObjectJsonParse;
        String str4 = str;
        String str5 = str2;
        String strM75 = "User-Agent";
        Map map = null;
        String strI = AbstractC0280n1.i(str4, str5, null, null);
        String strM368 = "@";
        String str6 = "";
        if (str5.contains(strM368)) {
            String[] strArrSplit = str5.split(strM368, 2);
            String str7 = strArrSplit[0];
            str3 = strArrSplit[1];
            str5 = str7;
        } else {
            str3 = "";
        }
        boolean zIsEmpty = str3.isEmpty();
        String strM175 = "header";
        String strM10 = "danmaku";
        String strM432 = "parse";
        String strM554 = "url";
        if (!zIsEmpty) {
            String strM108 = ",";
            String[] strArrSplit2 = str3.contains(strM108) ? str3.split(strM108) : new String[]{str3};
            int length = strArrSplit2.length;
            int i = 0;
            while (i < length) {
                String strTrim = strArrSplit2[i].trim();
                if (!strTrim.isEmpty()) {
                    String strM365 = "http";
                    if (strTrim.startsWith(strM365)) {
                        try {
                            String str8 = strTrim + str5;
                            JSONObject jSONObject2 = new JSONObject(b(X1.X(str8, map, h(str8))));
                            String strOptString = jSONObject2.optString(strM554, "");
                            if (strOptString.startsWith(strM365)) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put(strM432, 0);
                                jSONObject3.put(strM554, strOptString);
                                try {
                                    String strOptString2 = jSONObject2.optString("ua", jSONObject2.optString("user-agent", jSONObject2.optString(strM75, "")));
                                    if (!strOptString2.isEmpty()) {
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put(strM75, strOptString2);
                                        jSONObject3.put(strM175, jSONObject4.toString());
                                    }
                                    if (strI != null) {
                                        jSONObject3.put(strM10, strI);
                                    }
                                    return jSONObject3.toString();
                                } catch (Exception unused) {
                                    continue;
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
                i++;
                strArrSplit2 = strArrSplit2;
                map = null;
            }
        }
        if (AbstractC0309x1.j(str5)) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(strM432, 0);
            jSONObject5.put(strM554, str5);
            if (strI != null) {
                jSONObject5.put(strM10, strI);
            }
            return jSONObject5.toString();
        }
        ArrayList arrayList = (ArrayList) this.d.get(str4);
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    if (!str6.isEmpty()) {
                        jSONObject = new JSONObject();
                        jSONObject.put(strM432, 1);
                        jSONObject.put("playUrl", str6);
                        jSONObject.put(strM554, str5);
                        break;
                    }
                    jSONObject = null;
                    break;
                }
                String str9 = (String) it.next();
                if (!str9.isEmpty() && !str9.equals("null")) {
                    String strX = X1.X(str9.concat(str5), null, null);
                    try {
                        jSONObjectJsonParse = jsonParse(str5, strX);
                    } catch (Throwable unused3) {
                        jSONObjectJsonParse = null;
                    }
                    if (jSONObjectJsonParse != null && jSONObjectJsonParse.has(strM554) && jSONObjectJsonParse.has(strM175)) {
                        jSONObjectJsonParse.put(strM175, jSONObjectJsonParse.getJSONObject(strM175).toString());
                        jSONObject = jSONObjectJsonParse;
                        break;
                    }
                    if (strX.contains("<html")) {
                        for (Pattern pattern : f) {
                            if (pattern.matcher(strX).find()) {
                                str6 = str9;
                                break;
                            }
                        }
                    }
                }
            }
            if (jSONObject != null) {
                if (strI != null) {
                    jSONObject.put(strM10, strI);
                }
                return jSONObject.toString();
            }
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put(strM432, 1);
        jSONObject6.put("jx", "1");
        jSONObject6.put(strM554, str5);
        if (strI != null) {
            jSONObject6.put(strM10, strI);
        }
        return jSONObject6.toString();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws JSONException {
        String string;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str2;
        String str3;
        String strE = e();
        boolean zK = k();
        String strM379 = ".vod";
        String strM346 = "xgapp";
        String strM42 = "/detail?vod_id=";
        String strM355 = "v1.vod";
        if (zK && strE.endsWith(strM355)) {
            String strJ = com.github.catvod.spider.merge.D.b.j(strM42, list.get(0), "&rel_limit=10");
            if (k()) {
                String strI = i();
                StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strJ, "&apikey=");
                sbP.append(a());
                sbP.append("&keytime=");
                sbP.append(strI);
                strJ = c(sbP.toString(), strI);
            }
            string = com.github.catvod.spider.merge.D.b.i(strE, strJ);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append((strE.contains("api.php/app") || strE.contains(strM346)) ? strE.concat("video_detail?id=") : (strE.endsWith(strM355) || strE.contains(strM379)) ? strE.concat(strM42) : strE.concat(strM42));
            sb.append(list.get(0));
            string = sb.toString();
        }
        SpiderDebug.log(string);
        JSONObject jSONObject = new JSONObject(b(X1.X(string, null, h(string))));
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        String str4 = list.get(0);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        boolean zContains = strE.contains("api.php/app/");
        HashMap map = this.d;
        String strM570 = "vod_name";
        String strM43 = "vod_content";
        String strM477 = "parse_api";
        String strM292 = "name";
        String strM31 = "code";
        String strM558 = "vod_url_with_player";
        String strM454 = "url";
        String strM511 = "vod_class";
        String strM75 = "type_name";
        HashMap map2 = map;
        String strM234 = "data";
        String str5 = strM477;
        String strM386 = "vod_director";
        ArrayList arrayList6 = arrayList4;
        String strM44 = "vod_actor";
        String str6 = strM454;
        String strM325 = "vod_remarks";
        ArrayList arrayList7 = arrayList5;
        String strM432 = "vod_area";
        String str7 = strM292;
        String strM193 = "vod_year";
        String str8 = strM31;
        String strM408 = "vod_pic";
        String strM33 = "vod_id";
        if (zContains) {
            JSONObject jSONObject4 = jSONObject.getJSONObject(strM234);
            jSONObject3.put(strM33, jSONObject4.optString(strM33, str4));
            jSONObject3.put(strM570, jSONObject4.getString(strM570));
            jSONObject3.put(strM408, jSONObject4.getString(strM408));
            jSONObject3.put(strM75, jSONObject4.optString(strM511));
            jSONObject3.put(strM193, jSONObject4.optString(strM193));
            jSONObject3.put(strM432, jSONObject4.optString(strM432));
            jSONObject3.put(strM325, jSONObject4.optString(strM325));
            jSONObject3.put(strM44, jSONObject4.optString(strM44));
            jSONObject3.put(strM386, jSONObject4.optString(strM386));
            jSONObject3.put(strM43, jSONObject4.optString(strM43));
            JSONArray jSONArray = jSONObject4.getJSONArray(strM558);
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                String str9 = str8;
                String strTrim = jSONObject5.optString(str9).trim();
                if (strTrim.isEmpty()) {
                    str3 = str7;
                    strTrim = jSONObject5.getString(str3).trim();
                } else {
                    str3 = str7;
                }
                ArrayList arrayList8 = arrayList7;
                arrayList8.add(strTrim);
                String str10 = str6;
                ArrayList arrayList9 = arrayList6;
                arrayList9.add(jSONObject5.getString(str10));
                String str11 = str5;
                String strTrim2 = jSONObject5.optString(str11).trim();
                HashMap map3 = map2;
                ArrayList arrayList10 = map3.get(strTrim) == null ? new ArrayList() : (ArrayList) map3.get(strTrim);
                if (!strTrim2.isEmpty() && !arrayList10.contains(strTrim2)) {
                    arrayList10.add(strTrim2);
                }
                i++;
                str8 = str9;
                str7 = str3;
                arrayList7 = arrayList8;
                str6 = str10;
                str5 = str11;
                arrayList6 = arrayList9;
                map2 = map3;
            }
            str = strM43;
            arrayList2 = arrayList6;
            arrayList3 = arrayList7;
        } else {
            HashMap map4 = map2;
            String str12 = str5;
            ArrayList arrayList11 = arrayList6;
            String str13 = str6;
            ArrayList arrayList12 = arrayList7;
            String str14 = str7;
            String str15 = str8;
            if (strE.contains(strM346)) {
                JSONObject jSONObject6 = jSONObject.getJSONObject(strM234).getJSONObject("vod_info");
                jSONObject3.put(strM33, jSONObject6.optString(strM33, str4));
                jSONObject3.put(strM570, jSONObject6.getString(strM570));
                jSONObject3.put(strM408, jSONObject6.getString(strM408));
                jSONObject3.put(strM75, jSONObject6.optString(strM511));
                jSONObject3.put(strM193, jSONObject6.optString(strM193));
                jSONObject3.put(strM432, jSONObject6.optString(strM432));
                jSONObject3.put(strM325, jSONObject6.optString(strM325));
                jSONObject3.put(strM44, jSONObject6.optString(strM44));
                jSONObject3.put(strM386, jSONObject6.optString(strM386));
                jSONObject3.put(strM43, jSONObject6.optString(strM43));
                JSONArray jSONArray2 = jSONObject6.getJSONArray(strM558);
                int i2 = 0;
                while (i2 < jSONArray2.length()) {
                    JSONObject jSONObject7 = jSONArray2.getJSONObject(i2);
                    String str16 = str15;
                    String strTrim3 = jSONObject7.optString(str16).trim();
                    if (strTrim3.isEmpty()) {
                        str2 = str14;
                        strTrim3 = jSONObject7.getString(str2).trim();
                    } else {
                        str2 = str14;
                    }
                    ArrayList arrayList13 = arrayList12;
                    arrayList13.add(strTrim3);
                    String str17 = str13;
                    ArrayList arrayList14 = arrayList11;
                    arrayList14.add(jSONObject7.getString(str17));
                    String str18 = str12;
                    String strTrim4 = jSONObject7.optString(str18).trim();
                    HashMap map5 = map4;
                    ArrayList arrayList15 = map5.get(strTrim3) == null ? new ArrayList() : (ArrayList) map5.get(strTrim3);
                    if (!strTrim4.isEmpty() && !arrayList15.contains(strTrim4)) {
                        arrayList15.add(strTrim4);
                    }
                    i2++;
                    str15 = str16;
                    str14 = str2;
                    arrayList12 = arrayList13;
                    str13 = str17;
                    str12 = str18;
                    arrayList11 = arrayList14;
                    map4 = map5;
                }
                str = strM43;
                arrayList2 = arrayList11;
                arrayList3 = arrayList12;
            } else {
                ArrayList arrayList16 = arrayList11;
                ArrayList arrayList17 = arrayList12;
                String str19 = str13;
                if (strE.endsWith(strM355) || strE.contains(strM379)) {
                    JSONObject jSONObject8 = jSONObject.getJSONObject(strM234);
                    jSONObject3.put(strM33, jSONObject8.optString(strM33, str4));
                    jSONObject3.put(strM570, jSONObject8.getString(strM570));
                    jSONObject3.put(strM408, jSONObject8.getString(strM408));
                    jSONObject3.put(strM75, jSONObject8.optString(strM511));
                    jSONObject3.put(strM193, jSONObject8.optString(strM193));
                    jSONObject3.put(strM432, jSONObject8.optString(strM432));
                    jSONObject3.put(strM325, jSONObject8.optString(strM325));
                    jSONObject3.put(strM44, jSONObject8.optString(strM44));
                    jSONObject3.put(strM386, jSONObject8.optString(strM386));
                    str = strM43;
                    jSONObject3.put(str, jSONObject8.optString(str));
                    JSONArray jSONArray3 = jSONObject8.getJSONArray("vod_play_list");
                    int i3 = 0;
                    while (i3 < jSONArray3.length()) {
                        JSONObject jSONObject9 = jSONArray3.getJSONObject(i3);
                        JSONObject jSONObject10 = jSONObject9.getJSONObject("player_info");
                        String strTrim5 = jSONObject10.optString("show", "").trim();
                        String strTrim6 = jSONObject10.optString("from", "").trim();
                        if (!strTrim5.equals(strTrim6) && !strTrim6.isEmpty()) {
                            strTrim5 = strTrim5 + " (" + strTrim6 + ")";
                        }
                        ArrayList arrayList18 = arrayList17;
                        arrayList18.add(strTrim5);
                        String strTrim7 = jSONObject10.optString("parse", "").trim();
                        String strTrim8 = jSONObject10.optString("parse2", "").trim();
                        String strM422 = "http";
                        String strI2 = strTrim7.startsWith(strM422) ? strTrim7 : "";
                        if (strTrim8.startsWith(strM422) && !strTrim8.equals(strTrim7)) {
                            if (!strI2.isEmpty()) {
                                strI2 = strI2.concat(",");
                            }
                            strI2 = com.github.catvod.spider.merge.D.b.i(strI2, strTrim8);
                        }
                        String str20 = str19;
                        String strOptString = jSONObject9.optString(str20, "");
                        if (strI2.isEmpty() || strOptString.isEmpty()) {
                            arrayList = arrayList16;
                            arrayList.add(strOptString);
                        } else {
                            String strM194 = "#";
                            String[] strArrSplit = strOptString.split(strM194);
                            StringBuilder sb2 = new StringBuilder();
                            for (String str21 : strArrSplit) {
                                if (sb2.length() > 0) {
                                    sb2.append(strM194);
                                }
                                sb2.append(str21);
                                sb2.append("@");
                                sb2.append(strI2);
                            }
                            arrayList = arrayList16;
                            arrayList.add(sb2.toString());
                        }
                        i3++;
                        str19 = str20;
                        arrayList16 = arrayList;
                        arrayList17 = arrayList18;
                    }
                } else {
                    str = strM43;
                }
                arrayList2 = arrayList16;
                arrayList3 = arrayList17;
            }
        }
        String strM177 = "$$$";
        String strF = com.github.catvod.spider.merge.Y.c.f(arrayList3, strM177);
        String strM288 = "vod_play_from";
        jSONObject3.put(strM288, strF);
        String strF2 = com.github.catvod.spider.merge.Y.c.f(arrayList2, strM177);
        String strM289 = "vod_play_url";
        jSONObject3.put(strM289, strF2);
        jSONObject3.put(str, FishCrypto.a(jSONObject3.optString(str)));
        String strOptString2 = jSONObject3.optString(strM288);
        if (!N1.E()) {
            N1.s();
            String str22 = N1.n;
            if (!TextUtils.isEmpty(str22) && !TextUtils.isEmpty(strOptString2)) {
                String[] strArrSplit2 = strOptString2.split("\\$\\$\\$", -1);
                strArrSplit2[0] = str22;
                strOptString2 = TextUtils.join(strM177, strArrSplit2);
            }
        }
        jSONObject3.put(strM288, strOptString2);
        AbstractC0280n1.p(jSONObject3.optString(strM570));
        AbstractC0280n1.q(jSONObject3.optString(strM289));
        JSONArray jSONArray4 = new JSONArray();
        jSONArray4.put(jSONObject3);
        jSONObject2.put("list", jSONArray4);
        return jSONObject2.toString();
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        String strReplace;
        int i;
        String strM467 = "totalpage";
        String strM292 = "limit";
        String strM83 = "total";
        String strM1 = "pagecount";
        String strM186 = "data";
        String strE = e();
        boolean zK = k();
        String strM301 = "v1.vod";
        String strM33 = "year";
        String strM365 = "lang";
        String strM2 = "area";
        String strM84 = "class";
        String str3 = "";
        if (zK && strE.endsWith(strM301)) {
            String str4 = (map == null || !map.containsKey(strM84)) ? "" : map.get(strM84);
            String str5 = (map == null || !map.containsKey(strM2)) ? "" : map.get(strM2);
            String str6 = (map == null || !map.containsKey(strM365)) ? "" : map.get(strM365);
            if (map != null && map.containsKey(strM33)) {
                str3 = map.get(strM33);
            }
            StringBuilder sbR = com.github.catvod.spider.merge.D.b.r("?type=", str, "&class=", str4, "&lang=");
            com.github.catvod.spider.merge.D.b.A(sbR, str6, "&area=", str5, "&year=");
            sbR.append(str3);
            sbR.append("&by=&page=");
            sbR.append(str2);
            sbR.append("&limit=18");
            String string = sbR.toString();
            if (k()) {
                String strI = i();
                StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(string, "&apikey=");
                sbP.append(a());
                sbP.append("&keytime=");
                sbP.append(strI);
                string = c(sbP.toString(), strI);
            }
            strReplace = com.github.catvod.spider.merge.D.b.i(strE, string);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(f(strE));
            sb.append(str);
            sb.append((strE.contains("api.php/app") || strE.contains("xgapp")) ? "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&limit=18&pg=#PN#" : (strE.endsWith(strM301) || strE.contains(".vod")) ? "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&by=排序&limit=18&page=#PN#" : "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&limit=18&page=#PN#");
            String strReplace2 = sb.toString().replace("#PN#", str2).replace("筛选class", (map == null || !map.containsKey(strM84)) ? "" : map.get(strM84)).replace("筛选area", (map == null || !map.containsKey(strM2)) ? "" : map.get(strM2)).replace("筛选lang", (map == null || !map.containsKey(strM365)) ? "" : map.get(strM365)).replace("筛选year", (map == null || !map.containsKey(strM33)) ? "" : map.get(strM33));
            String strM210 = "排序";
            strReplace = strReplace2.replace(strM210, (map == null || !map.containsKey(strM210)) ? "" : map.get(strM210));
        }
        SpiderDebug.log(strReplace);
        JSONArray jSONArray = null;
        JSONObject jSONObject = new JSONObject(b(X1.X(strReplace, null, h(strReplace))));
        try {
            if (jSONObject.has(strM467) && (jSONObject.get(strM467) instanceof Integer)) {
                i = jSONObject.getInt(strM467);
            } else if (jSONObject.has(strM1) && (jSONObject.get(strM1) instanceof Integer)) {
                i = jSONObject.getInt(strM1);
            } else if (jSONObject.has(strM186) && (jSONObject.get(strM186) instanceof JSONObject) && jSONObject.getJSONObject(strM186).has(strM83) && (jSONObject.getJSONObject(strM186).get(strM83) instanceof Integer) && jSONObject.getJSONObject(strM186).has(strM292) && (jSONObject.getJSONObject(strM186).get(strM292) instanceof Integer)) {
                int i2 = jSONObject.getJSONObject(strM186).getInt(strM292);
                int i3 = jSONObject.getJSONObject(strM186).getInt(strM83);
                i = i3 % i2 == 0 ? i3 / i2 : (i3 / i2) + 1;
            } else {
                i = Integer.MAX_VALUE;
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        JSONArray jSONArray2 = new JSONArray();
        String strM75 = "list";
        if (jSONObject.has(strM75) && (jSONObject.get(strM75) instanceof JSONArray)) {
            jSONArray = jSONObject.getJSONArray(strM75);
        } else if (jSONObject.has(strM186) && (jSONObject.get(strM186) instanceof JSONObject) && jSONObject.getJSONObject(strM186).has(strM75) && (jSONObject.getJSONObject(strM186).get(strM75) instanceof JSONArray)) {
            jSONArray = jSONObject.getJSONObject(strM186).getJSONArray(strM75);
        } else if (jSONObject.has(strM186) && (jSONObject.get(strM186) instanceof JSONArray)) {
            jSONArray = jSONObject.getJSONArray(strM186);
        }
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                String strM471 = "vod_id";
                boolean zHas = jSONObject2.has(strM471);
                String strM54 = "vod_remarks";
                String strM65 = "vod_pic";
                String strM454 = "vod_name";
                if (zHas) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(strM471, jSONObject2.getString(strM471));
                    jSONObject3.put(strM454, jSONObject2.getString(strM454));
                    jSONObject3.put(strM65, jSONObject2.getString(strM65));
                    jSONObject3.put(strM54, jSONObject2.getString(strM54));
                    jSONArray2.put(jSONObject3);
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(strM471, jSONObject2.getString("nextlink"));
                    jSONObject4.put(strM454, jSONObject2.getString("title"));
                    jSONObject4.put(strM65, jSONObject2.getString("pic"));
                    jSONObject4.put(strM54, jSONObject2.getString("state"));
                    jSONArray2.put(jSONObject4);
                }
            }
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("page", str2);
        jSONObject5.put(strM1, i);
        jSONObject5.put(strM292, 90);
        jSONObject5.put(strM83, Integer.MAX_VALUE);
        jSONObject5.put(strM75, jSONArray2);
        return jSONObject5.toString();
    }

    static {
        Pattern.compile(".*(url|v|vid|php\\?id)=");
        Pattern.compile("https?://[^/]*");
        f = new Pattern[]{Pattern.compile("player=new"), Pattern.compile("<div id=\"video\""), Pattern.compile("<div id=\"[^\"]*?player\""), Pattern.compile("HlsJsPlayer\\("), Pattern.compile("<iframe[\\s\\S]*?src=\"[^\"]+?\""), Pattern.compile("<video[\\s\\S]*?src=\"[^\"]+?\"")};
    }

    public static String b(String str) {
        return (str == null || !str.startsWith("﻿")) ? str : str.substring(1);
    }

    public static void d(JSONObject jSONObject, String str, ArrayList arrayList) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (next.equals(str) && (obj instanceof JSONArray)) {
                    arrayList.add((JSONArray) obj);
                }
                if (obj instanceof JSONObject) {
                    d((JSONObject) obj, str, arrayList);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        d(jSONArray.getJSONObject(i), str, arrayList);
                    }
                }
            } catch (JSONException e) {
                SpiderDebug.log(e);
            }
        }
    }

    public static String f(String str) {
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str.concat("video?tid=");
        }
        boolean zEndsWith = str.endsWith("v1.vod");
        String strM105 = "?type=";
        return (zEndsWith || str.contains(".vod")) ? str.concat(strM105) : str.concat(strM105);
    }

    public static JSONObject fixJsonVodHeader(JSONObject jSONObject, String str, String str2) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        boolean zContains = str.contains("www.mgtv.com");
        String strM102 = " Mozilla/5.0";
        String strM177 = " ";
        String strM473 = "User-Agent";
        String strM471 = "Referer";
        if (zContains || str2.contains("titan.mgtv")) {
            jSONObject2.put(strM471, strM177);
            jSONObject2.put(strM473, strM102);
        } else if (str.contains("bilibili")) {
            jSONObject2.put(strM471, " https://www.bilibili.com/");
            jSONObject2.put(strM473, " Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
        }
        return jSONObject2;
    }

    public static String g(String str, JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.equals("class") || next.equals("area") || next.equals("lang") || next.equals("year")) {
                    try {
                        sb.append("筛选");
                        sb.append(next);
                        sb.append("+全部=+");
                        sb.append(jSONObject.getString(next).replace(",", "+"));
                        sb.append("\n");
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        if (str.endsWith("v1.vod") || str.contains(".vod")) {
            sb.append("\n排序+全部=+最新=time+最热=hits+评分=score");
        }
        return sb.toString();
    }

    public static HashMap h(String str) {
        String strM346;
        HashMap map = new HashMap();
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            strM346 = "Dart/2.14 (dart:io)";
        } else {
            strM346 = (str.endsWith("v1.vod") || str.contains(".vod")) ? "okhttp/4.12.0" : "Dalvik/2.1.0";
        }
        map.put("User-Agent", strM346);
        return map;
    }

    public static String i() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    public static String j(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Integer.valueOf(b & 255)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static JSONObject jsonParse(String str, String str2) throws JSONException {
        String strOptString;
        JSONObject jSONObject = new JSONObject(str2);
        String strM65 = "data";
        boolean zHas = jSONObject.has(strM65);
        String strM471 = "url";
        if (zHas && (jSONObject.get(strM65) instanceof JSONObject) && !jSONObject.has(strM471)) {
            jSONObject = jSONObject.getJSONObject(strM65);
        }
        String string = jSONObject.getString(strM471);
        if (string.startsWith("//")) {
            string = "https:".concat(string);
        }
        if (!string.trim().startsWith("http")) {
            return null;
        }
        if (string.equals(str) && (AbstractC0309x1.k(string) || !AbstractC0309x1.j(string))) {
            return null;
        }
        Pattern pattern = AbstractC0309x1.a;
        Iterator it = Arrays.asList("973973.xyz", ".fit:").iterator();
        while (it.hasNext()) {
            if (string.contains((String) it.next())) {
                return null;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        String strM199 = "header";
        if (jSONObject.has(strM199)) {
            jSONObject2 = jSONObject.optJSONObject(strM199);
        } else {
            String strM467 = "Header";
            if (jSONObject.has(strM467)) {
                jSONObject2 = jSONObject.optJSONObject(strM467);
            } else {
                String strM301 = "headers";
                if (jSONObject.has(strM301)) {
                    jSONObject2 = jSONObject.optJSONObject(strM301);
                } else {
                    String strM116 = "Headers";
                    if (jSONObject.has(strM116)) {
                        jSONObject2 = jSONObject.optJSONObject(strM116);
                    }
                }
            }
        }
        String strM516 = "user-agent";
        boolean zHas2 = jSONObject.has(strM516);
        String strM277 = "User-Agent";
        String strOptString2 = "";
        if (zHas2) {
            strOptString = jSONObject.optString(strM516, "");
        } else {
            strOptString = jSONObject.has(strM277) ? jSONObject.optString(strM277, "") : "";
        }
        boolean zIsEmpty = strOptString.trim().isEmpty();
        String strM322 = " ";
        if (!zIsEmpty) {
            jSONObject2.put(strM277, strM322.concat(strOptString));
        }
        String strM570 = "referer";
        boolean zHas3 = jSONObject.has(strM570);
        String strM234 = "Referer";
        if (zHas3) {
            strOptString2 = jSONObject.optString(strM570, "");
        } else if (jSONObject.has(strM234)) {
            strOptString2 = jSONObject.optString(strM234, "");
        }
        if (!strOptString2.trim().isEmpty()) {
            jSONObject2.put(strM234, strM322.concat(strOptString2));
        }
        JSONObject jSONObjectFixJsonVodHeader = fixJsonVodHeader(jSONObject2, str, string);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(strM199, jSONObjectFixJsonVodHeader);
        jSONObject3.put(strM471, string);
        jSONObject3.put("parse", "0");
        return jSONObject3;
    }

    public final String a() {
        Calendar calendar = Calendar.getInstance();
        String strValueOf = String.valueOf(calendar.get(1));
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        String strM33 = "0";
        String strE = i < 10 ? com.github.catvod.spider.merge.D.b.e(i, strM33) : String.valueOf(i);
        String strE2 = i2 < 10 ? com.github.catvod.spider.merge.D.b.e(i2, strM33) : String.valueOf(i2);
        StringBuilder sb = new StringBuilder();
        sb.append(strValueOf);
        String strM83 = ":";
        sb.append(strM83);
        sb.append(strE);
        sb.append(strM83);
        sb.append(strValueOf);
        sb.append(strM83);
        sb.append(strE2);
        sb.append(strM83);
        sb.append(this.b);
        return j(sb.toString());
    }

    public final String c(String str, String str2) {
        String strSubstring;
        String strSubstring2;
        String strI = str2;
        if (strI == null || strI.isEmpty()) {
            strI = i();
        }
        String strM33 = "?";
        int iIndexOf = str.indexOf(strM33);
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
            strSubstring2 = str.substring(iIndexOf + 1);
        } else {
            strSubstring = str;
            strSubstring2 = "";
        }
        TreeMap treeMap = new TreeMap();
        boolean zIsEmpty = strSubstring2.isEmpty();
        String strM249 = "=";
        String strM65 = "&";
        if (!zIsEmpty) {
            for (String str3 : strSubstring2.split(strM65)) {
                int iIndexOf2 = str3.indexOf(strM249);
                if (iIndexOf2 > 0) {
                    String strSubstring3 = str3.substring(0, iIndexOf2);
                    String strSubstring4 = str3.substring(iIndexOf2 + 1);
                    if (!strSubstring4.isEmpty()) {
                        treeMap.put(strSubstring3, strSubstring4);
                    }
                }
            }
        }
        treeMap.put("timestamp", strI);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append(strM65);
            }
            sb.append((String) entry.getKey());
            sb.append(strM249);
            sb.append((String) entry.getValue());
        }
        treeMap.put("datasign", j(sb.toString() + this.c));
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : treeMap.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(strM65);
            }
            sb2.append((String) entry2.getKey());
            sb2.append(strM249);
            sb2.append((String) entry2.getValue());
        }
        StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strSubstring, strM33);
        sbP.append(sb2.toString());
        return sbP.toString();
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

    public final String e() {
        if (!this.a.isEmpty()) {
            return this.a;
        }
        String[] strArr = this.e;
        return (strArr == null || strArr.length < 1) ? "" : strArr[0].trim();
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

    public void init(Context context, String str) throws Throwable {
        super.init(context, str);
        try {
            String strG = FishCrypto.g(str);
            boolean zStartsWith = strG.startsWith("{");
            String strM445 = "/";
            if (zStartsWith) {
                JSONObject jSONObject = new JSONObject(strG);
                String strTrim = jSONObject.optString("api", "").trim();
                this.a = strTrim;
                if (strTrim.endsWith(strM445)) {
                    String str2 = this.a;
                    this.a = str2.substring(0, str2.length() - 1);
                }
                this.b = jSONObject.optString("apisignkey", "");
                this.c = jSONObject.optString("datasignkey", "");
                return;
            }
            boolean zStartsWith2 = strG.startsWith("http");
            String strM567 = "###";
            if (!zStartsWith2) {
                this.e = strG.split(strM567);
                return;
            }
            String strTrim2 = strG.split(strM567)[0].trim();
            this.a = strTrim2;
            if (strTrim2.endsWith(strM445)) {
                String str3 = this.a;
                this.a = str3.substring(0, str3.length() - 1);
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    public boolean isVideoFormat(String str) {
        if (FishCrypto.businessReady()) {
            return $host$42ceaa68a95df632(str);
        }
        return false;
    }

    public final boolean k() {
        return (this.b.isEmpty() || this.c.isEmpty()) ? false : true;
    }

    public boolean manualVideoCheck() {
        if (FishCrypto.businessReady()) {
            return $host$53940b53855fde82();
        }
        return false;
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

package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.WoNiu;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.RunnableC0271k1;
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
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.l0.l;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.C0359j;
import com.github.catvod.spider.merge.p000a.N;
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
import com.github.catvod.spider.merge.p012n.C0104;
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
import com.github.catvod.spider.merge.p017u.U;
import com.github.catvod.spider.merge.p017u.X;
import com.github.catvod.spider.merge.p017u.Y;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.p022z.C0517i3;
import com.github.catvod.spider.merge.p022z.I2;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.T2;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class WoNiu extends Cloud {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f105short = {548, 1893, 30298, 23582, 3052, -29616, 32099, 20969, 2537, 32555, -31827, 1906, 22835, 25776, 2933, 2925, 2924, 2923, 2935, 2909, 2929, 2919, 2934, 2934, 2923, 2924, 2917, 2929, -31821, 30563, 3255, 1191, 1279, 1248, 1261, 1260, 1254, 1188, 1274, 1260, 1258, 1277, 1248, 1254, 1255, 2222, 2223, 2237, 2262, 2243, 1766, 1727, 1702, 1709, 1722, 1708, 1704, 1723, 1706, 1697, 1766, 1764, 1764, 1764, 1764, 1764, 1764, 1764, 1764, 1764, 1764, 1764, 1764, 1764, 1766, 1782, 1726, 1709, 1780, 1742, 1687, 1678, 1669, 1682, 1668, 1664, 1683, 1666, 1673, 1742, 527, 1273, 1262, 1260, 1419, 1419, 1419, 1419, 1419, 1419, 1419, 1419, 1419, 1419, 768, 768, 768, 770, 2143, 2119, 2118, 2113, 2141, 2167, 2139, 2125, 2121, 2138, 2123, 2112, 2167, 2126, 2119, 2116, 2124, 2125, 2138, 411, 1384, 1329, 1320, 1315, 1315, 1314, 1331, 1318, 1326, 1323, 1384, 744, 1449, 1527, 1525, 1506, 1514, 1518, 1522, 1514, 1450, 1523, 1518, 1523, 1515, 1506, 1451, 1447, 1449, 1514, 1512, 1509, 1518, 1515, 1506, 1450, 1507, 1506, 1523, 1510, 1518, 1515, 1450, 1523, 1518, 1523, 1515, 1506, 572, 610, 608, 631, 639, 635, 615, 639, 575, 610, 637, 609, 614, 631, 608, 562, 635, 639, 629, 1871, 1870, 1887, 2539, 2547, 2546, 2549, 2537, 2499, 2554, 2547, 2544, 2552, 2553, 2542, 2524, 2524, 2334, 2334, 2895, 2887, 19326, 1405, 286, 262, 263, 256, 284, 310, 261, 262, 270, 256, 263, 2804, 2796, 2797, 2794, 2806, 2780, 2786, 2784, 2784, 2796, 2806, 2797, 2807, 3138, 3162, 3163, 3164, 3136, 3178, 3156, 3136, 3137, 3162, 3178, 3158, 3165, 3152, 3158, 3166, 3164, 3163, 3325, 3301, 3300, 3299, 3327, 3285, 3321, 3311, 3307, 3320, 3305, 3298, 3285, 3310, 3299, 3321, 3322, 3302, 3307, 3315, 1636, 1660, 1661, 1658, 1638, 1612, 1654, 1643, 1639, 1633, 1650, 1648, 1639, 1612, 1648, 1660, 1638, 1661, 1639, 1655, 1656, 1634, 1657, 1633, 1634, 1614, 1653, 1652, 1637, 1648, 1656, 1661, 1617, 1617, -30039, 27005, 25101, 25253, 814, 790, 857, 1179, 1218, 1243, 1232, 1232, 1233, 1216, 1237, 1245, 1240, 1179, 1501, 3307, 3253, 3255, 3232, 3240, 3244, 3248, 3240, 3304, 3249, 3244, 3249, 3241, 3232, 3305, 3301, 3307, 3240, 3242, 3239, 3244, 3241, 3232, 3304, 3233, 3232, 3249, 3236, 3244, 3241, 3304, 3249, 3244, 3249, 3241, 3232, 1042, 1100, 1102, 1113, 1105, 1109, 1097, 1105, 1041, 1100, 1107, 1103, 1096, 1113, 1102, 1052, 1109, 1105, 1115, 2522, 2523, 2506, 24291, 27147, 19929, 27894, 24150, 27577, 2269, 2202, 2203, 2186, 2207, 2199, 2194, 2234, 2203, 2189, 2205, 2218, 2203, 2182, 2186, 2579, 2637, 2639, 2648, 2640, 2644, 2632, 2640, 2576, 2633, 2652, 2650, 2638, 2576, 2633, 2642, 2637, 2589, 2579, 2637, 2576, 2633, 2652, 2650, 2567, 2643, 2642, 2633, 2581, 2579, 2638, 2654, 2642, 2639, 2648, 2580, 3118, 3184, 3169, 3182, 3117, 3180, 3183, 3171, 3179, 3117, 3170, 3183, 3192, -30927, 23534, -30856, 29608, 24256, 28861, 31421, 21395, 30239, 31871, -32288, 24369, 2328, -31031, 22647, -32084, 30332, 23316, 30057, 18029, 31802, -31692, 23269, 21204, 28947, 32617, 22087, 23836, 23137, 23293, -32023, 23236, 30275, 32714, -31658, 26498, 14608, 1697, 1721, 1720, 1727, 1699, 1673, 1722, 1721, 1713, 1727, 1720, 2748, 2724, 2725, 2722, 2750, 2708, 2750, 2744, 2734, 2745, 2725, 2730, 2726, 2734, 1681, 1687, 1665, 1686, 1674, 1669, 1673, 1665, 1736, -29758, 21779, 1736, -30345, 22401, -29758, 21779, 1688, 1684, 1669, 1687, 1687, 1683, 1675, 1686, 1664, 1736, 23842, 32485, 1736, -30345, 22401, 23842, 32485, 1736, 1684, 1683, 1664, -31341, 28895, 676, 717, 676, 688, 719, 1465, 1441, 1440, 1447, 1467, 1425, 1455, 1453, 1453, 1441, 1467, 1440, 1466, 2511, 2519, 2518, 2513, 2509, 2535, 2521, 2509, 2508, 2519, 2535, 2523, 2512, 2525, 2523, 2515, 2513, 2518, 1252, 624, 616, 617, 622, 626, 600, 628, 610, 614, 629, 612, 623, 600, 611, 622, 628, 631, 619, 614, 638, 1319, 1343, 1342, 1337, 1317, 1295, 1333, 1320, 1316, 1314, 1329, 1331, 1316, 1295, 1331, 1343, 1317, 1342, 1316, 2413, 2421, 2420, 2419, 2415, 2373, 2409, 2431, 2414, 2414, 2419, 2420, 2429, 2409, 3271, 3295, 3294, 3289, 3269, 3311, 3269, 3267, 3285, 3266, 3294, 3281, 3293, 3285, 1818, 1933, 1818, 25850, 30123, 23685, 21718, 18169, 21116, 17982, -32007, 963, 987, 986, 989, 961, 1003, 984, 987, 979, 989, 986, 534, 526, 527, 520, 532, 574, 525, 526, 518, 520, 527, -30318, 22339, 29391, 23521, -31180, 28393, 15217, 29343, 22902, 17790, 28686, 22848, 31174, 27505, 950, 942, 943, 936, 948, 926, 928, 930, 930, 942, 948, 943, 949, 3100, 3076, 3077, 3074, 3102, 3124, 3082, 3080, 3080, 3076, 3102, 3077, 3103, -31577, 23158, 18016, 27118, 2245, 2269, 2268, 2267, 2247, 2285, 2259, 2247, 2246, 2269, 2285, 2257, 2266, 2263, 2257, 2265, 2267, 2268, 1437, -31372, 23498, -27847, -27942, -29883, 22535, 29137, 22687, 2703, 2584, 2703, 22365, 21935, 24192, -31753, 23881, -27206, -27559, -29242, 24196, 30546, 24092, 3084, 3227, 3084, 20958, 23903, -26175, 1491, 1483, 1482, 1485, 1489, 1531, 1477, 1489, 1488, 1483, 1531, 1479, 1484, 1473, 1479, 1487, 1485, 1482, 1865, 1873, 1872, 1879, 1867, 1889, 1887, 1867, 1866, 1873, 1889, 1885, 1878, 1883, 1885, 1877, 1879, 1872, -29734, 22680, 29006, 22528, 2967, 2959, 2958, 2953, 2965, 3007, 2963, 2949, 2945, 2962, 2947, 2952, 3007, 2950, 2959, 2956, 2948, 2949, 2962, 1007, 32040, 29857, 32258, 22002, 26622, 19599, 23360, 601, 718, 601, 23029, 26381, 26213, 32603, 30566, 26417, 23459, 29413, 23083, -32684, 2984, 2992, 2993, 2998, 2986, 2944, 2988, 3002, 3006, 2989, 3004, 2999, 2944, 3003, 2998, 2988, 2991, 2995, 3006, 2982, 2804, 2796, 2797, 2794, 2806, 2780, 2800, 2790, 2786, 2801, 2784, 2795, 2780, 2791, 2794, 2800, 2803, 2799, 2786, 2810, 27926, 29736, 21855, 28720, -32652, 28167, 23514, 2487, 2175, 28478, 27715, 30077, 30348, 28611, 2175, 2280, 2175, 18074, 28120, 18089, 20838, 25214, 22352, 32064, 27927, 2140, 2116, 2117, 2114, 2142, 2164, 2126, 2131, 2143, 2137, 2122, 2120, 2143, 2164, 2120, 2116, 2142, 2117, 2143, 1069, 1077, 1076, 1075, 1071, 1029, 1087, 1058, 1070, 1064, 1083, 1081, 1070, 1029, 1081, 1077, 1071, 1076, 1070, 26558, 22456, 24862, -27231, 2378, 2386, 2387, 2388, 2376, 2402, 2395, 2386, 2385, 2393, 2392, 2383, 2429, 2429, 1216, 1216, 2701, 2791, 2811, 2786, 2699, 3220, 3200, 
    3289, 3264, 3275, 3291, 3286, 3295, 3274, 3200, 1048, 2431, 2342, 2367, 2356, 2356, 2357, 2340, 2353, 2361, 2364, 2431, 2424, 2316, 2356, 2427, 2425, 2431, 32199, 22062, 26549, 23249, 28331, -24919, 32175, 27312, 23690, 19845, 22215, 31835, 24752, -30623, 29131, 22757, 29310, 23376, 1061, 1100, 1109, -29150, 32529, 31362, 21452, 29823, -32015, 29230, 23392, 18495, 25360, 29763, 26356, 25404, 28465, 22527, 23431, 24953, 24925, 32043, 21605, 24648, 24684, -31533, 22771, 733, 705, 705, 709, 710, 655, 666, 666, 706, 731, 641, 734, 667, 726, 730, 728, 1382, 1402, 1402, 1406, 1405, 1332, 1313, 1313, 1401, 1376, 1338, 1381, 1312, 1389, 1377, 1379, 953, 929, 928, 935, 955, 913, 941, 929, 929, 933, 935, 939, 1118, 1094, 1095, 1088, 1116, 1142, 1098, 1094, 1094, 1090, 1088, 1100, 633, 638, 608, 1563, 1562, 1537, 1552, 1089, 1117, 1095, 1088, 1105, 1111, -32031, 30637, 1494, 1471, 1494, 1474, 1469, 2911, 2907, 2903, 2897, 2899, 2885, 2309, 2323, 2306, 2395, 2325, 2329, 2329, 2333, 2335, 2323, 729, 988, 967, 1845, 1833, 1833, 1837, 2022, 2022, 2574, 2578, 2578, 2582, 2581, 2652, 1646, -29471, 32027, 21272, 22171, -29501, 2078, 2054, 2055, 2048, 2076, 2102, 2060, 2065, 2077, 2075, 2056, 2058, 2077, 2102, 2058, 2054, 2076, 2055, 2077, 923, 980, 906, 923, 925, 927, 983, 920, 910, 916, 929, 914, 904, 927, 924, 935, 17486, 17477, -28112, 1828, 1852, 1853, 1850, 1830, 1804, 1840, 1852, 1852, 1848, 1850, 1846, 1124, 1063, 1071, 1086, 1067, 1127, 1059, 1086, 1071, 1063, 1917, 1854, 1918, 1855, 1842, 1841, 1846, 1855, 2607, 2668, 2604, 2679, 2656, 2669, 3125, 3194, 3106, 3133, 3120, 3121, 3131, 3193, 3127, 3125, 3110, 3120, 3087, 3132, 3110, 3121, 3122, 3081, 2049, 2075, 2060, 2063, 2848, 2877, 2848, 2872, 2865, 931, 1019, 996, 1001, 1000, 994, 928, 1017, 996, 1017, 993, 1000, 2446, 2442, 2432, 2415, 2414, 2431, 1081, 1121, 1150, 1139, 1138, 1144, 1082, 1138, 1127, 1150, 1124, 1144, 1139, 1138, 1033, 1106, 1108, 1090, 1109, 1034, 1103, 1096, 1098, 1090, 1034, 1102, 1107, 1090, 1098, 2464, 2530, 2543, 2540, 2539, 2530, 2902, 2830, 2841, 2836, 2829, 2845, 1068, 1123, 1085, 1068, 1059, 1120, 1057, 1060, 1059, 1062, 1120, 1071, 1081, 1059, 1046, 1061, 1087, 1064, 1067, 1040, 2459, 2433, 2454, 2453, 2291, 2228, 2232, 2213, 2286, 2707, 30063, 24198, 18268, 27763, 31520, 27031, 31220, 20666, 28732, 25227, 23626, 31430, 21384, 28913, 26606, 20948, 27543, 31430, 21480, 1503, 1501, 1482, 1495, 1489, 1488, 2339, 2337, 2356, 2341, 2343, 2351, 2354, 2361, 2307, 2351, 2350, 2356, 2341, 2350, 2356, 2420, 2421, 2404, 2417, 2425, 2428, 2387, 2431, 2430, 2404, 2421, 2430, 2404, 2908, 2907, 2905, 2897, 2935, 2907, 2906, 2880, 2897, 2906, 2880, 1705, 1713, 1712, 1719, 1707, 1665, 1727, 1707, 1706, 1713, 1665, 1725, 1718, 1723, 1725, 1717, 1719, 1712, 1350, 2732, 2736, 2736, 2740, 2743, 2814, 2795, 2795, 2739, 2730, 2800, 2735, 2794, 2727, 2731, 2729, 3085, 1820, 1798, 1819, 1802, 1373, 1345, 1345, 1349, 1350, 1295, 1306, 1306, 516, 536, 536, 540, 598, 579, 579, 2711, 2343, 2429, 2427, 2413, 2426, 2343, 2169, 2160, 2157, 2162, 2116, 2174, 2172, 2155, 2166, 2160, 2161, 2101, 2082, 2104, 2096, 2154, 2156, 2170, 2157, 2096, 2163, 2160, 2168, 2166, 2161, 2104, 2114, 2099, 2111, 2166, 2161, 2159, 2154, 2155, 2116, 2161, 2174, 2162, 2170, 2082, 2154, 2156, 2170, 2157, 2112, 2161, 2174, 2162, 2170, 2114, 2111, 2100, 2111, 2166, 2161, 2159, 2154, 2155, 2116, 2161, 2174, 2162, 2170, 2082, 2154, 2156, 2170, 2157, 2112, 2159, 2152, 2171, 2114, 28876, 26579, 29599, 23217, 1032, 1040, 1041, 1046, 1034, 1056, 1034, 1036, 1050, 1037, 1041, 1054, 1042, 1050, 2596, 2620, 2621, 2618, 2598, 2572, 2595, 2610, 2592, 2592, 2596, 2620, 2593, 2615, 2626, 2660, 2674, 2661, 2618, 2646, 2672, 2674, 2681, 2659, 1616, 1650, 1639, 1652, 1649, 1649, 1660, 1586, 1576, 1587, 1581, 1597, 1589, 1610, 1652, 1651, 1657, 1650, 1642, 1646, 1597, 1619, 1609, 1597, 1580, 1581, 1587, 1581, 1574, 1597, 1610, 1652, 1651, 1579, 1577, 1574, 1597, 1637, 1579, 1577, 1588, 1597, 1628, 1645, 1645, 1649, 1656, 1610, 1656, 1663, 1622, 1652, 1641, 1586, 1576, 1582, 1578, 1587, 1582, 1579, 1597, 1589, 1622, 1621, 1609, 1616, 1617, 1585, 1597, 1649, 1652, 1654, 1656, 1597, 1626, 1656, 1662, 1654, 1650, 1588, 1597, 1630, 1653, 1647, 1650, 1648, 1656, 1586, 1580, 1583, 1583, 1587, 1581, 1587, 1581, 1587, 1581, 1597, 1614, 1660, 1659, 1660, 1647, 1652, 1586, 1576, 1582, 1578, 1587, 1582, 1579, 2881, 1454, 1433, 1434, 1433, 1422, 1433, 1422, 3289, 3317, 3317, 3313, 3315, 3327, 1861, 1859, 1877, 1858, 1903, 1886, 1873, 1885, 1877, 2415, 2409, 2431, 2408, 2373, 2410, 2413, 2430, 2119, 2145, 2167, 2144, 2111, 2131, 2165, 2167, 2172, 2150, 837, 871, 882, 865, 868, 868, 873, 807, 829, 806, 824, 808, 800, 863, 865, 870, 876, 871, 895, 891, 808, 838, 860, 808, 825, 824, 806, 824, 819, 808, 863, 865, 870, 830, 828, 819, 808, 880, 830, 828, 801, 808, 841, 888, 888, 868, 877, 863, 877, 874, 835, 865, 892, 807, 829, 827, 831, 806, 827, 830, 808, 800, 835, 832, 860, 837, 836, 804, 808, 868, 865, 867, 877, 808, 847, 877, 875, 867, 871, 801, 808, 843, 864, 890, 871, 869, 877, 807, 825, 826, 826, 806, 824, 806, 824, 806, 824, 808, 859, 873, 878, 873, 890, 865, 807, 829, 827, 831, 806, 827, 830, 3110, 3089, 3090, 3089, 3078, 3089, 3078, 577, 539, 541, 523, 540, 577, 514, 513, 521, 519, 512, 577, 2469, 2456, 2435, 2445, 2435, 2436, 1506, 1431, 1512, 1503, 1483, 1487, 1503, 1481, 1486, 1503, 1502, 1431, 1517, 1491, 1486, 1490, 2438, 2451, 2450, 2454, 2474, 2474, 2478, 2444, 2491, 2479, 2475, 2491, 2477, 2474, 989, 1023, 1023, 1017, 1004, 1000, 3137, 3152, 3152, 3148, 3145, 3139, 3137, 3156, 3145, 3151, 3150, 3087, 3146, 3155, 3151, 3150, 3084, 3072, 3156, 3141, 3160, 3156, 3087, 3146, 3137, 3158, 3137, 3155, 3139, 3154, 3145, 3152, 3156, 3084, 3072, 3082, 3087, 3082, 3099, 3072, 3153, 3101, 3088, 3086, 3088, 3089, 1990, 1948, 1946, 1932, 1947, 1990, 1925, 1926, 1934, 1920, 1927, 1991, 1921, 1949, 1924, 
    1925, 1750, 1754, 1745, 1744, 3115, 3123, 3122, 3125, 3113, 3075, 3113, 3119, 3129, 3118, 3122, 3133, 3121, 3129, 1285, 1309, 1308, 1307, 1287, 1325, 1282, 1299, 1281, 1281, 1285, 1309, 1280, 1302, -28850, 31234, 32290, 22284, 27209, 23238, 29364, 23450, 26335, 22096, 19337, 26734, 25542, -30856, 23384, 19413, -28910, 1086, 1056, 1076, -29962, 21543, 26054, 23574, 32721, -27959, -29633, -31251, 28833, 29825, 23983, 23499, -28705, -544, 1581, 1595, 1599, 1580, 1597, 1590, 1565, 1585, 1584, 1578, 1595, 1584, 1578, 1944, 1934, 1930, 1945, 1928, 1923, 1960, 1924, 1925, 1951, 1934, 1925, 1951, 2379, 2387, 2386, 2389, 2377, 2403, 2377, 2383, 2393, 2382, 2386, 2397, 2385, 2393, 2544, 2536, 2537, 2542, 2546, 2520, 2551, 2534, 2548, 2548, 2544, 2536, 2549, 2531, 2343, 2429, 2427, 2413, 2426, 2343, 2401, 2406, 2412, 2413, 2416, 2342, 2400, 2428, 2405, 2404, 2214, 2223, 2226, 2221, 2203, 2209, 2211, 2228, 2217, 2223, 2222, 2282, 2301, 2279, 2287, 2229, 2227, 2213, 2226, 2287, 2220, 2223, 2215, 2217, 2222, 2279, 2205, 2284, 2272, 2217, 2222, 2224, 2229, 2228, 2203, 2222, 2209, 2221, 2213, 2301, 2229, 2227, 2213, 2226, 2207, 2222, 2209, 2221, 2213, 2205, 2272, 2283, 2272, 2217, 2222, 2224, 2229, 2228, 2203, 2222, 2209, 2221, 2213, 2301, 2229, 2227, 2213, 2226, 2207, 2224, 2231, 2212, 2205, 31833, 27462, 32522, 22052, 1275, 1185, 1191, 1201, 1190, 1275, 1207, 1212, 1201, 1207, 1215, 1213, 1210, 1274, 1212, 1184, 1209, 1208, -29978, 21559, 18465, 26543, -31625, 21526, 24305, -29979, -1830};
    public static final Pattern v = Pattern.compile(C0070.m277(f105short, 1009, 17, 2384));
    public static final LinkedHashMap w = new LinkedHashMap();
    public static final String[] x = {C0140.m558(f105short, 1032, 3, 2183), C0018.m70(f105short, 1035, 3, 671), C0045.m177(f105short, 1026, 2, 1064), C0087.m346(f105short, 1028, 4, 2909), C0053.m210(f105short, 1038, 4, 1968), C0010.m36(f105short, 1042, 5, 1029)};
    public static final String[] y = {C0104.m414(f105short, 1055, 4, 1781), C0032.m126(f105short, 1059, 4, 1040), C0139.m554(f105short, 1047, 4, 508), C0017.m65(f105short, 1051, 4, 2384), C0116.m463(f105short, 1063, 4, 1621), C0101.m402(f105short, 1067, 4, 1892)};
    public static volatile String z = C0125.m499(f105short, 1071, 16, 693);
    public String r = C0107.m427(f105short, 1087, 16, 1294);
    public boolean s;
    public boolean t;
    public boolean u;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z2) {
        return searchContent(str, z2, C0009.m33(f105short, 0, 1, 533));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z2) {
        i();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0126.m503(f105short, 1, 1, 1876), C0122.m486(f105short, 2, 2, 879), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0092.m365(f105short, 4, 1, 3038), C0095.m379(f105short, 5, 3, 910), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0079.m314(f105short, 8, 1, 2522), C0010.m36(f105short, 9, 2, 471), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0026.m102(f105short, 11, 1, 1862), C0139.m554(f105short, 12, 2, 2971), null));
        com.github.catvod.spider.merge.D.b.z(C0098.m390(f105short, 14, 14, 2818), C0118.m471(f105short, 28, 2, 2061), null, arrayList);
        k kVarK = k(C0125.m499(f105short, 30, 1, 3224));
        k kVarR = kVarK.R(C0030.m116(f105short, 31, 14, 1161));
        if (kVarR != null) {
            kVarK = kVarR;
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, u(kVarK, this.r));
    }

    /* JADX WARN: Code duplicated, block: B:63:0x02c3  */
    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z2, String str2) throws UnsupportedEncodingException {
        int iMax;
        String strL;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
            iMax = 1;
        }
        String strEncode = URLEncoder.encode(str, C0104.m414(f105short, 45, 5, 2299));
        if (iMax <= 1) {
            strL = com.github.catvod.spider.merge.D.b.B(C0043.m169(f105short, 50, 29, 1737), strEncode);
        } else {
            StringBuilder sb = new StringBuilder(C0101.m402(f105short, 79, 11, 1761));
            sb.append(strEncode.replace(C0017.m65(f105short, 90, 1, 548), C0081.m322(f105short, 91, 3, 1244)));
            sb.append(C0085.m339(f105short, 94, 10, 1446));
            strL = com.github.catvod.spider.merge.D.b.l(sb, iMax, C0087.m346(f105short, 104, 4, 813));
        }
        com.github.catvod.spider.merge.f0.g gVarK = k(strL);
        ArrayList arrayListU = u(gVarK, this.r);
        boolean zQ = q(gVarK);
        int size = zQ ? (iMax * 24) + 1 : ((iMax - 1) * 24) + arrayListU.size();
        if (!z2) {
            boolean z3 = FishCrypto.a;
            if (!C0117.m467(f105short, 127, 1, 427).equals(C0297t1.h(C0089.m355(f105short, 108, 19, 2088)))) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int iMin = Math.min(arrayListU.size(), p());
                for (int i = 0; i < iMin; i++) {
                    com.github.catvod.spider.merge.p001b.k kVar = (com.github.catvod.spider.merge.p001b.k) arrayListU.get(i);
                    try {
                        com.github.catvod.spider.merge.f0.g gVarK2 = k(C0097.m386(f105short, 128, 11, 1351) + kVar.b() + C0143.m570(f105short, 139, 1, 711));
                        k kVarR = gVarK2.R(C0046.m182(f105short, 140, 36, 1415));
                        String strTrim = kVarR == null ? "" : kVarR.T().trim();
                        if (TextUtils.isEmpty(strTrim)) {
                            strTrim = kVar.c();
                        }
                        String str3 = this.r;
                        k kVarR2 = gVarK2.R(C0118.m471(f105short, 176, 19, 530));
                        String strN = n(str3, kVarR2 == null ? "" : kVarR2.c(C0079.m314(f105short, 195, 3, 1852)));
                        Iterator it = w(gVarK2).iterator();
                        while (it.hasNext()) {
                            h(linkedHashMap, linkedHashSet, (String) it.next(), strTrim, strN);
                        }
                    } catch (Exception unused2) {
                    }
                }
                ArrayList arrayList = new ArrayList();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String[] strArr = new String[10];
                for (int i2 = 0; i2 < 10; i2++) {
                    strArr[i2] = AbstractC0302v0.k[i2].a;
                }
                int i3 = 0;
                for (int i4 = 10; i3 < i4; i4 = 10) {
                    String str4 = strArr[i3];
                    List list = (List) linkedHashMap.get(str4);
                    if (list != null && !list.isEmpty()) {
                        String str5 = C0140.m558(f105short, 198, 14, 2460) + str4 + C0045.m177(f105short, 212, 2, 2398) + jCurrentTimeMillis;
                        LinkedHashMap linkedHashMap2 = w;
                        synchronized (linkedHashMap2) {
                            try {
                                if (linkedHashMap2.size() >= 40) {
                                    linkedHashMap2.remove((String) linkedHashMap2.keySet().iterator().next());
                                }
                                linkedHashMap2.put(str5, new ArrayList(list));
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        String strY0 = AbstractC0302v0.Y0(str4);
                        StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strY0, C0076.m301(f105short, 214, 2, 2927));
                        sbP.append(list.size());
                        sbP.append(C0143.m570(f105short, 216, 2, 1364));
                        arrayList.add(new com.github.catvod.spider.merge.p001b.k(str5, sbP.toString(), AbstractC0302v0.j(str4), strY0, true));
                    }
                    i3++;
                }
                if (!arrayList.isEmpty()) {
                    arrayListU = arrayList;
                }
            }
        }
        return AbstractC0449a.c(iMax, zQ ? iMax + 1 : iMax, 24, size, arrayListU);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        if (list == null || list.isEmpty()) {
            return AbstractC0449a.b();
        }
        String str = list.get(0);
        if (C0101.m402(f105short, 218, 11, 361).equals(str) || C0093.m368(f105short, 229, 13, 2691).equals(str) || C0072.m285(f105short, 242, 18, 3125).equals(str) || C0104.m414(f105short, 260, 20, 3210).equals(str) || C0049.m193(f105short, 280, 19, 1555).equals(str)) {
            AbstractC0302v0.g0(str, new X(this));
            return "";
        }
        if (str.startsWith(C0107.m427(f105short, 299, 15, 1553))) {
            String[] strArrK = l.k(str);
            String strG = l.g(strArrK);
            if (TextUtils.isEmpty(strG)) {
                return com.github.catvod.spider.merge.p001b.g.d(C0072.m285(f105short, 314, 4, 2029));
            }
            String strDetailContent = super.detailContent(Collections.singletonList(strG));
            return l.j(strDetailContent) ? l.i(str, strArrK) : l.c(strDetailContent, strArrK);
        }
        if (!str.matches(C0119.m473(f105short, 318, 3, 882))) {
            return AbstractC0449a.b();
        }
        String strM10 = C0003.m10(f105short, 321, 11, 1204);
        StringBuilder sb = new StringBuilder(strM10);
        sb.append(str);
        String strM33 = C0009.m33(f105short, 332, 1, 1522);
        sb.append(strM33);
        com.github.catvod.spider.merge.f0.g gVarK = k(sb.toString());
        com.github.catvod.spider.merge.p001b.k kVarA = AbstractC0449a.a(str);
        k kVarR = gVarK.R(C0126.m503(f105short, 333, 36, 3269));
        kVarA.o(kVarR == null ? "" : kVarR.T().trim());
        String str2 = this.r;
        k kVarR2 = gVarK.R(C0072.m285(f105short, 369, 19, 1084));
        kVarA.p(n(str2, kVarR2 == null ? "" : kVarR2.c(C0021.m83(f105short, 388, 3, 2473))));
        kVarA.m(t(gVarK, C0073.m288(f105short, 391, 2, 1311)));
        kVarA.j(t(gVarK, C0073.m288(f105short, 393, 2, 994)));
        kVarA.s(t(gVarK, C0049.m193(f105short, 395, 2, 1873)));
        k kVarR3 = gVarK.R(C0076.m301(f105short, 397, 15, 2302));
        kVarA.l(kVarR3 != null ? kVarR3.T().trim() : "");
        com.github.catvod.spider.merge.h0.d dVarQ = gVarK.Q(C0073.m288(f105short, 412, 36, 2621));
        if (dVarQ.size() > 0) {
            kVarA.u(((k) dVarQ.get(0)).T());
        }
        if (dVarQ.size() > 1) {
            kVarA.k(((k) dVarQ.get(1)).T());
        }
        if (dVarQ.size() > 2) {
            kVarA.i(((k) dVarQ.get(2)).T());
        }
        ArrayList arrayListW = w(gVarK);
        boolean zIsEmpty = arrayListW.isEmpty();
        String strM223 = C0056.m223(f105short, 448, 13, 3072);
        if (zIsEmpty && !gVarK.Q(strM223).isEmpty() && x()) {
            gVarK = k(strM10 + str + strM33);
            arrayListW = w(gVarK);
        }
        if (!arrayListW.isEmpty()) {
            String strB = b(arrayListW);
            kVarA.r(strB);
            kVarA.q(a(arrayListW));
            AbstractC0280n1.p(kVarA.c());
            AbstractC0280n1.q(strB);
        } else if (!gVarK.Q(strM223).isEmpty()) {
            kVarA.s(C0021.m83(f105short, 461, 12, 3270));
            kVarA.l(kVarA.a() + C0044.m175(f105short, 473, 25, 2322));
        }
        boolean z2 = FishCrypto.a;
        N1.d(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        if (C0076.m301(f105short, 498, 11, 1750).equals(str)) {
            boolean z2 = FishCrypto.a;
            InitOrigin.run(new I2(C0011.m42(f105short, 523, 37, 1764), C0095.m379(f105short, 560, 7, 644), true, -16735786, String.valueOf(System.currentTimeMillis()), C0297t1.h(C0089.m355(f105short, 509, 14, 2763)), new X(this), null));
            return "";
        }
        if (C0098.m390(f105short, 567, 13, 1486).equals(str)) {
            InitOrigin.execute(new U(this, 0));
            return "";
        }
        String strM175 = C0044.m175(f105short, 580, 18, 2488);
        if (strM175.equals(str)) {
            boolean z3 = FishCrypto.a;
            InitOrigin.run(new RunnableC0271k1(!C0079.m314(f105short, 598, 1, 1236).equals(C0297t1.h(strM175)), new C0359j(10)));
            return "";
        }
        if (C0135.m539(f105short, 599, 20, 519).equals(str)) {
            InitOrigin.run(new A(19));
            return "";
        }
        if (!C0021.m83(f105short, 619, 19, 1360).equals(str)) {
            return "";
        }
        InitOrigin.run(new A(18));
        return "";
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z2, HashMap<String, String> map) {
        int iMax;
        String strJ;
        List arrayList;
        String strSubstring;
        int iIndexOf;
        String string;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
            iMax = 1;
        }
        if (C0098.m390(f105short, 638, 14, 2330).equals(str)) {
            boolean z3 = FishCrypto.a;
            String strH = C0297t1.h(C0006.m21(f105short, 652, 14, 3248));
            boolean zIsEmpty = TextUtils.isEmpty(getSavedCookie());
            String strM292 = C0074.m292(f105short, 666, 3, 1850);
            if (zIsEmpty) {
                string = C0028.m108(f105short, 669, 3, 976);
            } else {
                StringBuilder sb = new StringBuilder(C0095.m379(f105short, 672, 5, 2340));
                sb.append(TextUtils.isEmpty(strH) ? "" : strM292.concat(strH));
                string = sb.toString();
            }
            ArrayList arrayList2 = new ArrayList();
            String strY0 = AbstractC0302v0.y0();
            StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(string, strM292);
            sbP.append(this.r);
            arrayList2.add(new com.github.catvod.spider.merge.p001b.k(C0090.m358(f105short, 688, 11, 609), C0063.m249(f105short, 699, 4, 1204), strY0, sbP.toString(), C0017.m65(f105short, 677, 11, 948)));
            arrayList2.add(new com.github.catvod.spider.merge.p001b.k(C0076.m301(f105short, 726, 13, 3179), C0085.m339(f105short, 739, 4, 2433), AbstractC0302v0.a(), C0059.m234(f105short, 703, 10, 2928), C0049.m193(f105short, 713, 13, 961)));
            arrayList2.add(new com.github.catvod.spider.merge.p001b.k(C0018.m70(f105short, 808, 18, 1854), C0001.m1(f105short, 826, 4, 2608), AbstractC0302v0.Z(), C0074.m292(f105short, 761, 1, 1453).equals(C0297t1.h(C0101.m402(f105short, 743, 18, 2226))) ^ true ? C0119.m473(f105short, 762, 14, 2735) : C0085.m339(f105short, 776, 14, 3116), C0070.m277(f105short, 790, 18, 1444)));
            arrayList2.add(new com.github.catvod.spider.merge.p001b.k(C0104.m414(f105short, 890, 20, 2691), C0133.m529(f105short, 910, 4, 2314), AbstractC0302v0.I(), true ^ C0114.m454(f105short, 849, 1, 991).equals(C0297t1.h(C0137.m545(f105short, 830, 19, 3040))) ? C0122.m486(f105short, 850, 16, 633) : C0008.m31(f105short, 866, 4, 2108), C0044.m175(f105short, 870, 20, 3039)));
            arrayList2.add(new com.github.catvod.spider.merge.p001b.k(C0070.m277(f105short, 954, 19, 1114), C0092.m365(f105short, 973, 4, 1134), AbstractC0302v0.D0(), C0053.m210(f105short, 914, 4, 2455) + p() + C0055.m219(f105short, 918, 17, 2143), C0072.m285(f105short, 935, 19, 2091)));
            return AbstractC0449a.c(iMax, iMax, arrayList2.size(), arrayList2.size(), arrayList2);
        }
        if (!str.startsWith(C0107.m427(f105short, 977, 14, 2365))) {
            if (!str.matches(C0101.m402(f105short, 993, 5, 2774))) {
                return com.github.catvod.spider.merge.D.b.d();
            }
            String strM75 = C0019.m75(f105short, 998, 1, 3259);
            String strM558 = C0140.m558(f105short, 999, 9, 3247);
            if (iMax <= 1) {
                strJ = com.github.catvod.spider.merge.D.b.j(strM558, str, strM75);
            } else {
                strJ = strM558 + str + C0104.m414(f105short, 1008, 1, 1077) + iMax + strM75;
            }
            com.github.catvod.spider.merge.f0.g gVarK = k(strJ);
            ArrayList arrayListU = u(gVarK, this.r);
            boolean zQ = q(gVarK);
            return AbstractC0449a.c(iMax, zQ ? 1 + iMax : iMax, 36, zQ ? (iMax * 36) + 1 : ((iMax - 1) * 36) + arrayListU.size(), arrayListU);
        }
        if (iMax != 1) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        LinkedHashMap linkedHashMap = w;
        synchronized (linkedHashMap) {
            try {
                arrayList = (List) linkedHashMap.get(str);
                if (arrayList != null) {
                    arrayList = new ArrayList(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null && (iIndexOf = (strSubstring = str.substring(14)).indexOf(C0019.m75(f105short, 991, 2, 1152))) > 0) {
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            String strY1 = AbstractC0302v0.Y0(strSubstring2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(l.f(strSubstring2, strY1, "", (JSONObject) it.next()));
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList3);
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList3);
    }

    public static void clearCookie() {
        boolean z2 = FishCrypto.a;
        C0297t1.b(C0055.m219(f105short, 1103, 12, 974));
    }

    public static String getCurrentSiteUrl() {
        return z;
    }

    public static String getSavedCookie() {
        boolean z2 = FishCrypto.a;
        return P1.u0(C0297t1.h(C0139.m554(f105short, 1115, 12, 1065)));
    }

    public static void h(LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet, String str, String str2, String str3) {
        String strB1 = AbstractC0302v0.b1(str);
        if (TextUtils.isEmpty(strB1) || !linkedHashSet.add(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0106.m422(f105short, 1127, 3, 524), str);
            jSONObject.put(C0047.m186(f105short, 1130, 4, 1653), str2);
            jSONObject.put(C0091.m360(f105short, 1134, 6, 1074), C0026.m102(f105short, 1140, 7, 1526));
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(C0098.m390(f105short, 1147, 6, 2870), new JSONArray().put(str3));
            }
            List arrayList = (List) linkedHashMap.get(strB1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strB1, arrayList);
            }
            arrayList.add(jSONObject);
        } catch (Exception unused) {
        }
    }

    public static String j(Map map) {
        String strTrim;
        int iIndexOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map == null) {
            return "";
        }
        for (Map.Entry entry : map.entrySet()) {
            if (C0107.m427(f105short, 1153, 10, 2422).equalsIgnoreCase((String) entry.getKey()) && entry.getValue() != null) {
                for (String str : (List) entry.getValue()) {
                    if (!TextUtils.isEmpty(str) && (iIndexOf = (strTrim = str.split(C0117.m467(f105short, 1163, 1, 738), 2)[0].trim()).indexOf(61)) > 0) {
                        linkedHashMap.put(strTrim.substring(0, iIndexOf).trim(), strTrim.substring(iIndexOf + 1).trim());
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append(C0089.m355(f105short, 1164, 2, 999));
            }
            sb.append((String) entry2.getKey());
            sb.append('=');
            sb.append((String) entry2.getValue());
        }
        return sb.toString();
    }

    public static String n(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith(C0030.m116(f105short, 1166, 4, 1885))) {
            return str2;
        }
        if (str2.startsWith(C0139.m554(f105short, 1170, 2, 1993))) {
            return C0055.m219(f105short, 1172, 6, 2662).concat(str2);
        }
        StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(str);
        String strM386 = C0097.m386(f105short, 1178, 1, 1601);
        if (str2.startsWith(strM386)) {
            strM386 = "";
        }
        return com.github.catvod.spider.merge.D.b.m(sbO, strM386, str2);
    }

    public static String o(Exception exc) {
        String message = exc.getMessage();
        return TextUtils.isEmpty(message) ? C0011.m42(f105short, 1179, 5, 1814) : message;
    }

    public static int p() {
        boolean z2 = FishCrypto.a;
        try {
            int i = Integer.parseInt(C0297t1.h(C0120.m477(f105short, 1184, 19, 2153)));
            if (i < 1 || i > 5) {
                return 3;
            }
            return i;
        } catch (Exception unused) {
            return 3;
        }
    }

    public static boolean q(com.github.catvod.spider.merge.f0.g gVar) {
        Iterator<E> it = gVar.Q(C0128.m511(f105short, 1203, 16, 1018)).iterator();
        while (it.hasNext()) {
            if (((k) it.next()).T().contains(C0001.m1(f105short, 1219, 3, 2629))) {
                return true;
            }
        }
        return false;
    }

    public static void saveCookie(String str) {
        String strU0 = P1.u0(str);
        if (TextUtils.isEmpty(strU0)) {
            clearCookie();
        } else {
            boolean z2 = FishCrypto.a;
            C0297t1.j(C0097.m386(f105short, 1222, 12, 1875), strU0);
        }
    }

    public static String t(com.github.catvod.spider.merge.f0.g gVar, String str) {
        for (k kVar : gVar.Q(C0085.m339(f105short, 1234, 10, 1098))) {
            if (str.equals(kVar.Q(C0104.m414(f105short, 1244, 8, 1875)).g())) {
                return kVar.Q(C0142.m567(f105short, 1252, 6, 2561)).g();
            }
        }
        return "";
    }

    public static ArrayList u(k kVar, String str) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar2 : kVar.Q(C0096.m382(f105short, 1258, 18, 3156))) {
            Matcher matcher = v.matcher(kVar2.c(C0128.m511(f105short, 1276, 4, 2153)));
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                String strC = kVar2.c(C0045.m177(f105short, 1280, 5, 2900));
                if (TextUtils.isEmpty(strC)) {
                    strC = kVar2.Q(C0044.m175(f105short, 1285, 12, 909)).g();
                }
                if (!TextUtils.isEmpty(strC) && linkedHashSet.add(strGroup)) {
                    arrayList.add(new com.github.catvod.spider.merge.p001b.k(strGroup, strC, n(str, kVar2.Q(C0014.m54(f105short, 1297, 3, 2535)).a(C0093.m368(f105short, 1300, 3, 2332))), kVar2.Q(C0014.m54(f105short, 1303, 14, 1047)).g()));
                }
            }
        }
        return arrayList;
    }

    public static LinkedHashMap v(com.github.catvod.spider.merge.f0.g gVar, String[] strArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (gVar == null) {
            return linkedHashMap;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Collections.addAll(linkedHashSet, strArr);
        for (k kVar : gVar.Q(C0044.m175(f105short, 1317, 15, 1063))) {
            k kVarR = kVar == null ? null : kVar.R(C0130.m516(f105short, 1332, 6, 2446));
            String strTrim = kVarR == null ? "" : kVarR.T().trim();
            if (linkedHashSet.contains(strTrim)) {
                k kVarR2 = kVar != null ? kVar.R(C0044.m175(f105short, 1338, 6, 2936)) : null;
                linkedHashMap.put(strTrim, kVarR2 != null ? kVarR2.T().trim() : "");
            }
        }
        return linkedHashMap;
    }

    public static ArrayList w(com.github.catvod.spider.merge.f0.g gVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<E> it = gVar.Q(C0135.m539(f105short, 1344, 20, 1101)).iterator();
        while (it.hasNext()) {
            String strReplace = ((k) it.next()).c(C0098.m390(f105short, 1364, 4, 2547)).trim().replace(C0008.m31(f105short, 1368, 5, 2261), C0073.m288(f105short, 1373, 1, 2741));
            if (AbstractC0302v0.s0(strReplace)) {
                linkedHashSet.add(strReplace);
            }
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.github.catvod.spider.merge.u.Y] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.github.catvod.spider.merge.u.Y] */
    public static void z(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new C0517i3((String) entry.getKey(), C0043.m169(f105short, 1374, 2, 3200).equals(entry.getKey()) ? AbstractC0583w0.f : AbstractC0583w0.h, (String) entry.getValue(), false));
            }
            if (linkedHashMap2 != null) {
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    boolean zEquals = C0106.m422(f105short, 1376, 4, 2454).equals(entry2.getKey());
                    String strM83 = C0021.m83(f105short, 1380, 4, 650);
                    String str = zEquals ? strM83 : (String) entry2.getKey();
                    arrayList2.add(new C0517i3(str, (strM83.equals(str) && ((String) entry2.getValue()).contains(C0027.m105(f105short, 1384, 3, 440))) ? AbstractC0583w0.d : AbstractC0583w0.h, (String) entry2.getValue(), false));
                }
            }
        }
        final boolean z2 = linkedHashMap != null;
        final String strM10 = z2 ? (String) linkedHashMap.get(C0118.m471(f105short, 1387, 3, 1497)) : C0003.m10(f105short, 1390, 3, 3261);
        final int i = 0;
        final ?? r4 = new Runnable() { // from class: com.github.catvod.spider.merge.u.Y
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = strM10;
                List list = arrayList;
                switch (i) {
                    case 0:
                        Pattern pattern = WoNiu.v;
                        InitOrigin.run(new T2("账号资料", str2, (ArrayList) list));
                        break;
                    default:
                        Pattern pattern2 = WoNiu.v;
                        InitOrigin.run(new T2("签到数据", str2, (ArrayList) list));
                        break;
                }
            }
        };
        final int i2 = 1;
        final ?? r6 = new Runnable() { // from class: com.github.catvod.spider.merge.u.Y
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = strM10;
                List list = arrayList2;
                switch (i2) {
                    case 0:
                        Pattern pattern = WoNiu.v;
                        InitOrigin.run(new T2("账号资料", str2, (ArrayList) list));
                        break;
                    default:
                        Pattern pattern2 = WoNiu.v;
                        InitOrigin.run(new T2("签到数据", str2, (ArrayList) list));
                        break;
                }
            }
        };
        InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.z.J2
            public final /* synthetic */ String a = "蜗牛账号信息";
            public final /* synthetic */ String d = "请在设置中的账号登录入口使用站点账号密码登录";
            public final /* synthetic */ int f = -16735786;

            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                String str3 = this.a;
                List list = arrayList;
                int i3 = this.f;
                Runnable runnable = r4;
                List list2 = arrayList2;
                Runnable runnable2 = r6;
                try {
                    Activity activityD0 = P1.D0();
                    if (activityD0 == null) {
                        return;
                    }
                    int iQ = AbstractC0583w0.Q(8, activityD0);
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activityD0);
                    AlertDialog[] alertDialogArr = {null};
                    boolean z3 = z2;
                    if (z3) {
                        str2 = strM10;
                        if (str2 == null || str2.isEmpty()) {
                            str2 = "已登录";
                        }
                    } else {
                        str2 = "未登录";
                    }
                    linearLayoutK.addView(AbstractC0583w0.p(activityD0, str3, str2), AbstractC0583w0.c0(iQ));
                    if (z3) {
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activityD0);
                        AbstractC0583w0.d(linearLayoutY, "账号资料", P1.J1("用户名", "查看账号资料", (ArrayList) list), i3, false).setOnClickListener(new A0(alertDialogArr, (Y) runnable, 1));
                        AbstractC0583w0.d(linearLayoutY, "签到数据", P1.J1("签到状态", "查看签到数据", (ArrayList) list2), AbstractC0583w0.d, true).setOnClickListener(new A0(alertDialogArr, (Y) runnable2, 2));
                        linearLayoutK.addView(linearLayoutY);
                    } else {
                        LinearLayout linearLayoutY2 = AbstractC0583w0.y(activityD0);
                        AbstractC0583w0.c(AbstractC0583w0.e, linearLayoutY2, "尚未登录");
                        String str4 = this.d;
                        if (str4 == null) {
                            str4 = "请先登录账号";
                        }
                        AbstractC0583w0.l(linearLayoutY2, str4);
                        linearLayoutK.addView(linearLayoutY2);
                    }
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(activityD0).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("关闭", (DialogInterface.OnClickListener) null).create();
                    alertDialogArr[0] = alertDialogCreate;
                    AbstractC0583w0.j0(alertDialogCreate);
                } catch (Exception unused) {
                    X0.a("显示账号信息失败");
                }
            }
        });
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0114.m454(f105short, 1393, 6, 1470));
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

    public String categoryContent(String str, String str2, boolean z2, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0053.m210(f105short, 1399, 15, 2368));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$f9d7235748f992e0 = $host$f9d7235748f992e0(str, str2, z2, map);
            FishCrypto.endHostEntry(null);
            return str$host$f9d7235748f992e0;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0139.m554(f105short, 1414, 13, 2320));
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

    public String homeContent(boolean z2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0082.m325(f105short, 1427, 11, 2868));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$1b26b551389a5dab = $host$1b26b551389a5dab(z2);
            FishCrypto.endHostEntry(null);
            return str$host$1b26b551389a5dab;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public final void i() {
        boolean z2 = FishCrypto.a;
        if (!(!C0028.m108(f105short, 1456, 1, 1398).equals(C0297t1.h(C0047.m186(f105short, 1438, 18, 1758)))) || TextUtils.isEmpty(getSavedCookie())) {
            return;
        }
        synchronized (this) {
            try {
                if (this.s) {
                    return;
                }
                this.s = true;
                InitOrigin.execute(new U(this, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) throws Throwable {
        super.init(context, str);
        this.r = C0082.m325(f105short, 1457, 16, 2756);
        String strG = "";
        String strTrim = str == null ? "" : str.trim();
        try {
            String strG2 = FishCrypto.g(strTrim);
            if (!TextUtils.isEmpty(strG2)) {
                strTrim = strG2.trim();
            }
        } catch (Exception unused) {
        }
        String strTrim2 = strTrim == null ? "" : strTrim.trim();
        if (strTrim2.startsWith(C0045.m177(f105short, 1473, 1, 3190))) {
            JsonObject jsonObjectC = I0.c(strTrim2);
            String strM108 = C0028.m108(f105short, 1474, 4, 1903);
            if (jsonObjectC.has(strM108) && !jsonObjectC.get(strM108).isJsonNull()) {
                String strTrim3 = jsonObjectC.get(strM108).getAsString().trim();
                if (strTrim3.startsWith(C0120.m477(f105short, 1478, 8, 1333)) || strTrim3.startsWith(C0056.m223(f105short, 1486, 7, 620))) {
                    strG = strTrim3;
                    while (strG.endsWith(C0137.m545(f105short, 1493, 1, 2744))) {
                        strG = com.github.catvod.spider.merge.D.b.g(strG, 1, 0);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(strG)) {
            this.r = strG;
        }
        z = this.r;
        this.s = false;
        this.t = false;
        this.u = false;
    }

    public final com.github.catvod.spider.merge.f0.g k(String str) {
        l();
        com.github.catvod.spider.merge.f0.g gVarM = m(str);
        if (str.startsWith(C0098.m390(f105short, 1494, 6, 2312))) {
            return ((gVarM.R(C0050.m199(f105short, 1500, 73, 2079)) != null || gVarM.Y().contains(C0128.m511(f105short, 1573, 4, 1508))) && x()) ? m(str) : gVarM;
        }
        return gVarM;
    }

    public final boolean l() {
        if (!TextUtils.isEmpty(getSavedCookie())) {
            return true;
        }
        String strM116 = C0030.m116(f105short, 1577, 14, 1151);
        boolean z2 = FishCrypto.a;
        String strH = C0297t1.h(strM116);
        String strH2 = C0297t1.h(C0143.m570(f105short, 1591, 14, 2643));
        if (TextUtils.isEmpty(strH) || TextUtils.isEmpty(strH2)) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.t) {
                    return false;
                }
                this.t = true;
                return s(strH, strH2, false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.github.catvod.spider.merge.f0.g m(String str) {
        return X1.L(X1.X(com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.r, str), null, r()), this.r);
    }

    public final HashMap r() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(C0128.m511(f105short, 1605, 10, 2583), C0006.m21(f105short, 1615, 111, 1565));
        mapS.put(C0097.m386(f105short, 1727, 7, 1532), this.r + C0009.m33(f105short, 1726, 1, 2926));
        String savedCookie = getSavedCookie();
        if (!TextUtils.isEmpty(savedCookie)) {
            mapS.put(C0107.m427(f105short, 1734, 6, 3226), savedCookie);
        }
        return mapS;
    }

    public final boolean s(String str, String str2, boolean z2) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(C0112.m445(f105short, 1740, 9, 1840), str);
            linkedHashMap.put(C0044.m175(f105short, 1749, 8, 2330), str2);
            HashMap map = new HashMap();
            map.put(C0126.m503(f105short, 1757, 10, 2066), C0106.m422(f105short, 1767, 111, 776));
            map.put(C0126.m503(f105short, 1878, 7, 3188), this.r + C0050.m199(f105short, 1885, 12, 622));
            map.put(C0009.m33(f105short, 1897, 6, 2538), this.r);
            map.put(C0115.m459(f105short, 1903, 16, 1466), C0074.m292(f105short, 1919, 14, 2526));
            map.put(C0135.m539(f105short, 1933, 6, 924), C0009.m33(f105short, 1939, 46, 3104));
            N N = X1.N(this.r + C0010.m36(f105short, 1985, 16, 2025), linkedHashMap, map);
            JSONObject jSONObject = new JSONObject(N.a());
            if (jSONObject.optInt(C0098.m390(f105short, 2001, 4, 1717), -1) != 1) {
                throw new IOException(jSONObject.optString(C0081.m322(f105short, 2050, 3, 1107), C0056.m223(f105short, 2053, 7, 2000)));
            }
            String strJ = j((Map) N.c);
            if (TextUtils.isEmpty(strJ)) {
                throw new IOException(C0046.m182(f105short, 2039, 11, 1231));
            }
            saveCookie(strJ);
            String strM467 = C0117.m467(f105short, 2005, 14, 3164);
            boolean z3 = FishCrypto.a;
            C0297t1.j(strM467, str);
            C0297t1.j(C0095.m379(f105short, 2019, 14, 1394), str2);
            this.s = false;
            synchronized (this) {
                try {
                    this.t = false;
                    if (z2) {
                        this.u = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                X0.a(C0130.m516(f105short, 2033, 6, 2137));
            }
            i();
            return true;
        } catch (Exception e) {
            if (z2) {
                X0.a(C0139.m554(f105short, 2060, 7, 762) + o(e));
            }
            return false;
        }
    }

    public String searchContent(String str, boolean z2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0017.m65(f105short, 2067, 13, 1630));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$0b14bd34f5ca9ec8 = $host$0b14bd34f5ca9ec8(str, z2);
            FishCrypto.endHostEntry(null);
            return str$host$0b14bd34f5ca9ec8;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public String searchContent(String str, boolean z2, String str2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0143.m570(f105short, 2080, 13, 2027));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$5abcbf7c29fbb7fe = $host$5abcbf7c29fbb7fe(str, z2, str2);
            FishCrypto.endHostEntry(null);
            return str$host$5abcbf7c29fbb7fe;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public final boolean x() {
        String strM467 = C0117.m467(f105short, 2093, 14, 2364);
        boolean z2 = FishCrypto.a;
        if (TextUtils.isEmpty(C0297t1.h(strM467)) || TextUtils.isEmpty(C0297t1.h(C0028.m108(f105short, 2107, 14, 2439)))) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.u) {
                    return false;
                }
                this.u = true;
                this.t = false;
                clearCookie();
                return l();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y() {
        if (TextUtils.isEmpty(getSavedCookie())) {
            if (l()) {
                y();
                return;
            } else {
                z(null, null);
                return;
            }
        }
        try {
            com.github.catvod.spider.merge.f0.g gVarK = k(C0116.m463(f105short, 2121, 16, 2312));
            if (gVarK.R(C0118.m471(f105short, 2137, 73, 2240)) == null && !gVarK.Y().contains(C0087.m346(f105short, 2210, 4, 2417))) {
                z(v(gVarK, x), v(k(C0019.m75(f105short, 2214, 18, 1236)), y));
                return;
            }
            clearCookie();
            z(null, null);
        } catch (Exception e) {
            X0.a(C0009.m33(f105short, 2232, 9, 1984) + o(e));
        }
    }
}

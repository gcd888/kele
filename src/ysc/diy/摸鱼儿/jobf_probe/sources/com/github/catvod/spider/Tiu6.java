package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0260h;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0257g;
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
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
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
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Tiu6 extends Cloud {
    public C0257g r;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f97short = {861, 2696, 2715, 2708, 2718, 2709, 2711, -31070, 32263, -25493, 28126, 30283, 32706, 2070, 599, 586, 598, 533, 636, 592, 582, 578, 593, 576, 587, 611, 611, 31737, 29296, 2938, 3053, 2938, 1386, 1719, 1719, 16973, 29494, 31423, -32477, 25335, 19165, 25087, 26577, 29268, 31617, 29192, 30891, 21339, -25407, 27546, 2053, 2079, 2209, 2211, 2186, 2237, 2234, 2209, 2277, 2302, 2297, 2273, 2249, 2302, 2297, 2274, 426, 428, 443, 435, 444, 442, 429, 390, 427, 444, 440, 437, 390, 429, 432, 436, 444, 390, 433, 438, 429, 444, 426, 429, 1355, 1353, 1360, 1359, 1347, 1401, 1364, 1347, 1351, 1354, 1401, 1362, 1359, 1355, 1347, 1401, 1358, 1353, 1362, 1347, 1365, 1362, 2726, 2724, 2701, 2720, 2743, 2739, 2750, 2701, 2726, 2747, 2751, 2743, 2701, 2746, 2749, 2726, 2743, 2721, 2726, 24969, 21585, 28750, 26866, 25797, -26466, 18764, 23729, 25288, 19931, 19585, 30091, -24688, 24326, 20185, 24564, -24978, 20632, 32149, -30651, 27788, 31895, -32665, 26188, -25576, 32739, 20996, -29723, 26133, 29312, -28101, 22230, 26868, -31200, 26029, 22041, 18194, 21269, 21485, 18868, -25429, 32026, -28154, 27272, 27132, 27095, 21389, 28862, 21833, 28694, 30432, -30290, 26839, 30438, 25907, 23971, 23971, 17808, -27564, 23555, 20517, 17798, 23865, 23555, 23601, 25305, 21117, 24509, 26673, 19161, 26478, -27826, 30751, 17977, 23153, 22146, 25919, 21710, 24584, 25047, -32356, 32555, 23375, 17428, 17728, 17527, 17806, 28113, 28786, -30069, 29247, 22658, 23280, 27267, 30438, 19193, -27610, 21461, 30679, 17999, 32021, 22040, 18375, 22250, 29618, 17938, 21501, 30645, 28782, 29338, 24923, 19093, 28463, 26152, 20801, -31292, 23602, 18757, -24621, 24094, 17720, 21189, 21019, 21150, -32114, 20572, 31359, 22323, 1003, 1022, 30011, 25780, 20596, 19795, 32068, 21433, 20654, 26570, 17739, 24430, 24871, 27516, -26413, 29795, -28222, -29152, 26269, 20817, 24603, 26493, 23699, 26540, -27547, 22446, 25576, 18206, 23472, 23504, 888, 869, 888, 864, 873, 2205, 2190, 2203, 2182, 2177, 2184, 2123, 2140, 2129, 2120, 2136, 983, 2207, 2189, 2234, 2233, 2234, 2221, 2234, 2221, 2274, 2231, 2219, 2219, 2223, 2220, 2277, 2288, 2288, 2238, 2223, 2230, 2289, 2235, 2224, 2218, 2237, 2238, 2225, 2289, 2236, 2224, 2226, 2288, 2207, 2186, 2220, 2234, 2221, 2290, 2206, 2232, 2234, 2225, 2219, 2274, 2194, 2224, 2213, 2230, 2227, 2227, 2238, 2288, 2282, 2289, 2287, 2303, 2295, 2184, 2230, 2225, 2235, 2224, 2216, 2220, 2303, 2193, 2187, 2303, 2286, 2287, 2289, 2287, 2276, 2303, 2184, 2230, 2225, 2281, 2283, 2276, 2303, 2215, 2281, 2283, 2294, 2303, 2206, 2223, 2223, 2227, 2234, 2184, 2234, 2237, 2196, 2230, 2219, 2288, 2282, 2284, 2280, 2289, 2284, 2281, 2303, 2295, 2196, 2199, 2187, 2194, 2195, 2291, 2303, 2227, 2230, 2228, 2234, 2303, 2200, 2234, 2236, 2228, 2224, 2294, 2303, 2204, 2231, 2221, 2224, 2226, 2234, 2288, 2286, 2285, 2285, 2289, 2287, 2289, 2287, 2289, 2287, 2303, 2188, 2238, 2233, 2238, 2221, 2230, 2288, 2282, 2284, 2280, 2289, 2284, 2281, 2731, 2738, 2744, 2388, 2389, 2376, 2391, 2395, 2390, 2526, 2524, 2501, 2522, 2518, 2540, 2497, 2518, 2514, 2527, 2540, 2503, 2522, 2526, 2518, 2540, 2523, 2524, 2503, 2518, 2496, 2503, 32642, 21958, 31322, 25387, 300, 302, 263, 298, 317, 313, 308, 263, 300, 305, 309, 317, 263, 304, 311, 300, 317, 299, 300, 21461, -26764, 29023, 26670, 2388, 2390, 2431, 2376, 2383, 2388, 29253, 26117, 20687, -27538, 2788, 2815, 2808, 2784, 2760, 2815, 2808, 2787, 29959, 24903, 31510, -30832, 23058, 25722, 29025, -27548, 1305, -28931, 22335, 1283, 2262, 2257, 2255, 2654, 2628, 2643, 2640, 1939, 1942, 1937, 1940, 2187, 2192, 2201, 2186, 2205, 2215, 2196, 2193, 2198, 2195, 955, 928, 937, 954, 941, 900, 929, 934, 931, 1536, 1565, 1536, 1560, 1553, 434, 445, 433, 441, 1471, 1470, 1445, 1460, 1703, 1699, 1711, 1705, 1707, 1681, 1723, 1724, 1698, 998, 1002, 1011, 992, 1015, 986, 1008, 1015, 1001, 2635, 2644, 2632, 2639, 2654, 2633, 1264, 1268, 1272, 1278, 1276, 2544, 2556, 2533, 2550, 2529, 2340, 2360, 2341, 2365, 2354, 1406, 1378, 1407, 1383, 1384, 1380, 1387, 1379, 1382, 1357, 1351, 1355, 1354, 1403, 1361, 1366, 1352, 2351, 2366, 2345, 2349, 2360, 2345, 2344, 2323, 2349, 2360, 1125, 1120, 1141, 1124, 625, 618, 611, 624, 615, 605, 630, 619, 623, 615, 3182, 3179, 3198, 3183, 3198, 3171, 3175, 3183, 1096, 1109, 1105, 1113, 430, 427, 447, 442, 431, 446, 388, 431, 434, 438, 446, 2208, 2221, 2335, 2312, 2334, 2306, 2328, 2335, 2318, 2312, 2354, 2308, 2313, 1887, 1859, 1881, 1886, 1871, 1865, 1651, 1647, 1653, 1650, 1635, 1637, 1631, 1652, 1657, 1648, 1637, 1915, 1895, 1917, 1914, 1899, 1901, 1879, 1892, 1897, 1898, 1901, 1892, 528, 539, 534, 528, 536, 544, 519, 530, 519, 518, 512, 395, 396, 409, 396, 413, 2478, 2473, 2492, 2473, 2472, 2478, 3009, 3018, 3015, 3009, 3017, 3069, 3025, 3030, 3011, 3030, 3031, 3025, 273, 281, 271, 271, 285, 283, 281, 439, 425, 445, 3113, 3134, 3123, 3126, 3131, 3126, 3115, 3110, 3072, 3115, 3130, 3111, 3115, 3074, 3093, 3096, 3101, 3088, 3101, 3072, 3085, 3104, 3089, 3084, 3072, 2005, 2002, 1991, 2002, 2003, 2005, 2041, 2002, 1987, 2014, 2002, 3015, 3008, 3029, 3008, 3009, 3015, 3040, 3025, 3020, 3008, 22021, 23100, 1243, 1219, 1196, 18605, 24975, 21706, 20716, 23432, 23115, 25522, 21513, 22741, -25012, 22686, 2052, 2052, 2148, 2093, 2093, 2153, 2049, 2049, 2163, 2084, 2084, 2503, 2503, 2471, 2542, 2542, 1499, 1499, 1499, 1499, 1423, 1519, 1519, 1423, 1478, 1478, 1410, 1514, 1514, 1432, 1487, 1487, 1432, 1489, 1489, 3072, 3072, 3072, 3072, 3156, 3124, 3124, 3156, 3101, 3101, 3161, 3121, 3121, 3139, 3092, 3092, 1298, 1298, 1298, 1298, 1350, 1318, 1318, 1350, 1295, 1295, 3082, 3094, 3094, 3090, 3089, 3160, 3149, 3149, 3076, 3088, 3085, 3078, 3085, 3148, 3078, 3085, 3095, 3072, 3075, 3084, 3148, 3073, 3085, 3087, 3149, 3075, 3090, 3083, 3149, 3092, 3152, 3149, 3089, 3095, 3072, 3080, 3079, 3073, 3094, 3133, 3073, 3085, 3086, 3086, 3079, 3073, 3094, 3083, 3085, 3084, 3149, 2638, 2568, 2581, 2564, 2572, 2578, 881, 815, 830, 807, 805, 811, 823, 883, 894, 815, 813, 890, 890, 815, 811, 894, 895, 888, 890, 887, 894, 810, 812, 892, 892, 894, 890, 813, 811, 894, 815, 894, 890, 892, 810, 812, 892, 887, 895, 
    888, 821, 864, 871, 882, 865, 871, 814, 803, 821, 880, 892, 870, 893, 871, 814, 801, 803, 863, 888, 868, 867, 2078, 2058, 2071, 2076, 2071, 2134, 2076, 2071, 2061, 2074, 2073, 2070, 2134, 2075, 2071, 2069, 1424, 1468, 1469, 1469, 1462, 1456, 1447, 1466, 1468, 1469, 1395, 1373, 1373, 1352, 1301, 1401, 1364, 1361, 1358, 1373, 1750, 1761, 1762, 1761, 1782, 1761, 1782, 2854, 2874, 2874, 2878, 2877, 2932, 2913, 2913, 2877, 2859, 2876, 2872, 2855, 2861, 2859, 2873, 2859, 2861, 2854, 2863, 2874, 2912, 2861, 2849, 2851, 2913, 2873, 2870, 2940, 2856, 2935, 2860, 2942, 2936, 2861, 2943, 2858, 2859, 2943, 2861, 2861, 2856, 2861, 2863, 2913, 2934, 2938, 2913, 2878, 2863, 2857, 2859, 2915, 2856, 2876, 2863, 2851, 2859, 2912, 2854, 2874, 2851, 2850, 2722, 2692, 2706, 2693, 2778, 2742, 2704, 2706, 2713, 2691, 1584, 1554, 1543, 1556, 1553, 1553, 1564, 1618, 1608, 1619, 1613, 1629, 1621, 1578, 1556, 1555, 1561, 1554, 1546, 1550, 1629, 1587, 1577, 1629, 1611, 1619, 1612, 1606, 1629, 1578, 1586, 1578, 1611, 1609, 1620, 1629, 1596, 1549, 1549, 1553, 1560, 1578, 1560, 1567, 1590, 1556, 1545, 1618, 1608, 1614, 1610, 1619, 1614, 1611, 1629, 1621, 1590, 1589, 1577, 1584, 1585, 1617, 1629, 1553, 1556, 1558, 1560, 1629, 1594, 1560, 1566, 1558, 1554, 1620, 1629, 1598, 1557, 1551, 1554, 1552, 1560, 1618, 1608, 1614, 1619, 1613, 1619, 1615, 1610, 1605, 1608, 1619, 1612, 1609, 1614, 1629, 1582, 1564, 1563, 1564, 1551, 1556, 1618, 1608, 1614, 1610, 1619, 1614, 1611, 1629, 1584, 1556, 1566, 1551, 1554, 1584, 1560, 1550, 1550, 1560, 1555, 1562, 1560, 1551, 1618, 1610, 1619, 1613, 1619, 1604, 1619, 1608, 1613, 1612, 1629, 1587, 1560, 1545, 1577, 1540, 1549, 1560, 1618, 1578, 1588, 1595, 1588, 1629, 1584, 1556, 1555, 1556, 1581, 1551, 1554, 1562, 1551, 1564, 1552, 1592, 1555, 1547, 1618, 1578, 1556, 1555, 1561, 1554, 1546, 1550, 1629, 1578, 1556, 1555, 1561, 1554, 1546, 1550, 1578, 1560, 1566, 1557, 1564, 1545, 1439, 1433, 1422, 1414, 1417, 1423, 1432, 1459, 1423, 1411, 1408, 1408, 1417, 1423, 1432, 1413, 1411, 1410, 1459, 1413, 1432, 1417, 1409, 1439, 2011, 1990, 2007, 2015, 1985, 831, 802, 830, 893, 788, 824, 814, 810, 825, 808, 803, 779, 779, 20995, 32300, 26796, -30636, 1976, 714, 712, 733, 716, 718, 710, 731, 720, 746, 710, 711, 733, 716, 711, 733, 954, 955, 938, 959, 951, 946, 925, 945, 944, 938, 955, 944, 938, 2569, 2574, 2572, 2564, 2594, 2574, 2575, 2581, 2564, 2575, 2581, 1730, 1752, 1733, 1748, 991, 963, 963, 967, 964, 909, 920, 920, 960, 960, 960, 921, 963, 990, 962, 897, 921, 980, 985, 1125, 1144, 1124, 1063, 1102, 1122, 1144, 1125, 1140, 1102, 1124, 1123, 1149, 1276, 1202, 1187, 1210, 1276, 1205, 1185, 1212, 1213, 1191, 1206, 1213, 1207, 1276, 1184, 1206, 1202, 1185, 1200, 1211, 1260, 1186, 1262, 2042, 2043, 2025, 1922, 1943, 480, 418, 436, 431, 432, 419, 507, 2104, 2109, 2088, 2109, 2176, 2188, 2190, 2195, 2191, 2182, 2199, 2182, 2311, 2306, 2328, 2335, 1979, 1958, 1975, 1983, 1953, 1586, 1572, 1568, 1587, 1570, 1577, 1566, 1576, 1573, 2983, 2993, 2997, 2982, 2999, 3004, 2973, 2992, 2603, 2661, 2676, 2669, 2603, 2658, 2678, 2667, 2666, 2672, 2657, 2666, 2656, 2603, 2679, 2657, 2661, 2678, 2663, 2668, 2603, 2676, 2667, 2664, 2664, 2619, 2669, 2656, 2617, 2570, 2571, 2585, 2674, 2663, 1821, 1816, 1805, 1816, 2495, 2457, 2447, 2456, 2503, 2475, 2445, 2447, 2436, 2462, 1857, 1891, 1910, 1893, 1888, 1888, 1901, 1827, 1849, 1826, 1852, 1836, 1828, 1883, 1893, 1890, 1896, 1891, 1915, 1919, 1836, 1858, 1880, 1836, 1853, 1852, 1826, 1852, 1847, 1836, 1883, 1893, 1890, 1850, 1848, 1847, 1836, 1908, 1850, 1848, 1829, 1836, 1869, 1916, 1916, 1888, 1897, 1883, 1897, 1902, 1863, 1893, 1912, 1827, 1849, 1855, 1851, 1826, 1855, 1850, 1836, 1828, 1863, 1860, 1880, 1857, 1856, 1824, 1836, 1888, 1893, 1895, 1897, 1836, 1867, 1897, 1903, 1895, 1891, 1829, 1836, 1871, 1892, 1918, 1891, 1889, 1897, 1827, 1853, 1854, 1854, 1826, 1852, 1826, 1852, 1826, 1852, 1836, 1887, 1901, 1898, 1901, 1918, 1893, 1827, 1849, 1855, 1851, 1826, 1855, 1850, 281, 315, 315, 317, 296, 300, 2622, 2607, 2607, 2611, 2614, 2620, 2622, 2603, 2614, 2608, 2609, 2672, 2613, 2604, 2608, 2609, 2739, 1420, 1467, 1464, 1467, 1452, 1467, 1452, 1056, 1053, 1030, 1032, 1030, 1025, 1792, 1814, 1810, 1793, 1808, 1819, 1840, 1820, 1821, 1799, 1814, 1821, 1799, 3024, 3014, 3010, 3025, 3008, 3019, 3040, 3020, 3021, 3031, 3014, 3021, 3031};
    public static final String[] s = {C0063.m249(f97short, 66, 24, 473), C0120.m477(f97short, 90, 22, 1318), C0092.m365(f97short, 112, 19, 2770), C0076.m301(f97short, 52, 6, 2261), C0109.m432(f97short, 58, 8, 2198)};
    public static final String[] t = {C0119.m473(f97short, 140, 2, 978), C0106.m422(f97short, 142, 2, 1865), C0089.m355(f97short, 144, 3, 384), C0044.m175(f97short, 147, 5, 2833), C0125.m499(f97short, 152, 2, 726), C0046.m182(f97short, 154, 5, 2407), C0107.m427(f97short, 159, 5, 1028), C0135.m539(f97short, 164, 4, 2457), C0046.m182(f97short, 168, 7, 2047), C0130.m516(f97short, 175, 4, 1213), C0093.m368(f97short, 179, 2, 2376), C0021.m83(f97short, 181, 4, 1549), C0011.m42(f97short, 185, 3, 1952), C0050.m199(f97short, 188, 7, 3021), C0043.m169(f97short, 195, 3, 998), C0103.m408(f97short, 198, 4, 1241), C0096.m382(f97short, 202, 4, 2162), C0047.m186(f97short, 206, 4, 528), C0047.m186(f97short, 210, 3, 3232), C0018.m70(f97short, 213, 5, 2734), C0109.m432(f97short, 218, 4, 2118), C0142.m567(f97short, 222, 4, 3228), C0014.m54(f97short, 226, 2, 1056), C0070.m277(f97short, 228, 4, 2137), C0014.m54(f97short, 232, 6, 2206), C0045.m177(f97short, 238, 5, 1054), C0010.m36(f97short, 243, 2, 1123), C0059.m234(f97short, 245, 3, 2069), C0014.m54(f97short, 248, 2, 1821), C0008.m31(f97short, 250, 5, 2946), C0125.m499(f97short, 255, 10, 959), C0098.m390(f97short, 265, 3, 1161), C0076.m301(f97short, 268, 2, 2899), C0109.m432(f97short, 270, 4, 1547), C0119.m473(f97short, 274, 4, 477), C0079.m314(f97short, 278, 7, 1460), C0101.m402(f97short, 285, 2, 2195), C0079.m314(f97short, 287, 2, 1202), C0014.m54(f97short, 131, 5, 1738), C0103.m408(f97short, 136, 4, 1799)};
    public static final Map u = Collections.synchronizedMap(new HashMap());

    class DoubanItem {
        public final String a;
        public final String b;
        public final String c;
        public final double d;

        public DoubanItem(String str, String str2, String str3, double d) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = d;
        }
    }

    class SearchItem {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f98short = {1862, 3024, 3030, 3025, 3009, 394, 406, 384, 2332, 2328, 2244, 2721, 2726, 2731, 2740, 2722, 2240, 2241, 1508, 1523, 1534, 1531, 1526, 2868, 2862, 2818, 2859, 2876, 2865, 2868, 2873, 1934, 1945, 1934, 1926, 1923, 1934, 1933, 1923, 1930, 2219, 2223, 2756, 2757, 2764, 2757, 2772, 2757, 2756, 1920, 1927, 1938, 1927, 1926, 1920, 513, 522, 519, 513, 521, 573, 529, 534, 515, 534, 535, 529, 2937, 2930, 2943, 2937, 2929, 2889, 2926, 2939, 2926, 2927, 2921, 1619, 1620, 1601, 1620, 1605, 2163, 2739, 2740, 2721, 2740, 2741, 2739, 2719, 2740, 2725, 2744, 2740, 3320, 3327, 3306, 3327, 3326, 3320, 3295, 3310, 3315, 3327, 934, 945, 956, 953, 948, 953, 932, 937, 911, 932, 949, 936, 932, 3019, 3036, 3025, 3028, 3033, 3028, 3017, 3012, 3049, 3032, 3013, 3017, 1207, 1215, 1193, 1193, 1211, 1213, 1215, 1930, 1940, 1920, 3180, 3179, 3187, 3172, 3177, 3180, 3169, 256, 283, 276, 259, 276, 284, 281, 276, 279, 281, 272, 282, 263, 271, 278, 269, 282, 283, 2193, 2198, 2206, 2203, 1817, 1806, 1806, 1811, 1806, 24091, 25186, 28417, 28585, 22268, -27976, 1778, 1779, 1774, 1777, 1789, 1776, 2021, 2019, 2037, 2037, 2035, 2021, 2021, 28505, 27928, 22639, 32424, 24678, 21821, -26914, -30625, 23064, 31199};
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
        public Boolean k;
        public boolean l;
        public long m;

        public static Boolean a(JSONObject jSONObject, String... strArr) {
            for (String str : strArr) {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    if (objOpt instanceof Boolean) {
                        return (Boolean) objOpt;
                    }
                    String lowerCase = String.valueOf(objOpt).trim().toLowerCase();
                    if (C0056.m223(f98short, 0, 1, 1911).equals(lowerCase) || C0140.m558(f98short, 1, 4, 2980).equals(lowerCase) || C0101.m402(f98short, 5, 3, 499).equals(lowerCase) || C0140.m558(f98short, 8, 2, 2419).equals(lowerCase)) {
                        return Boolean.TRUE;
                    }
                    if (C0137.m545(f98short, 10, 1, 2292).equals(lowerCase) || C0087.m346(f98short, 11, 5, 2759).equals(lowerCase) || C0137.m545(f98short, 16, 2, 2222).equals(lowerCase)) {
                        return Boolean.FALSE;
                    }
                }
            }
            return null;
        }

        public static String b(JSONObject jSONObject, String... strArr) {
            for (String str : strArr) {
                String strTrim = jSONObject.optString(str, "").trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    return strTrim;
                }
            }
            return "";
        }

        public static Boolean c(JSONObject jSONObject) {
            String strM36 = C0010.m36(f98short, 18, 5, 1426);
            String strM234 = C0059.m234(f98short, 23, 8, 2909);
            String strM75 = C0019.m75(f98short, 31, 9, 2031);
            Boolean boolA = a(jSONObject, strM36, strM234, strM75, C0142.m567(f98short, 40, 2, 2244));
            if (boolA != null) {
                return boolA;
            }
            String strM235 = C0059.m234(f98short, 42, 7, 2720);
            Boolean boolA2 = a(jSONObject, strM235);
            Boolean bool = Boolean.TRUE;
            if (boolA2 == bool) {
                return Boolean.FALSE;
            }
            String lowerCase = (b(jSONObject, C0059.m234(f98short, 49, 6, 2035), C0125.m499(f98short, 55, 12, 610), C0135.m539(f98short, 67, 11, 2842), C0096.m382(f98short, 78, 5, 1568)) + C0021.m83(f98short, 83, 1, 2131) + b(jSONObject, C0001.m1(f98short, 105, 13, 976), C0006.m21(f98short, 118, 12, 3005), C0055.m219(f98short, 84, 11, 2752), C0090.m358(f98short, 95, 10, 3211), C0114.m454(f98short, 130, 7, 1242), C0092.m365(f98short, 137, 3, 2023))).toLowerCase();
            if (lowerCase.contains(C0098.m390(f98short, 140, 7, 3077)) || lowerCase.contains(C0017.m65(f98short, 147, 11, 373)) || lowerCase.contains(C0115.m459(f98short, 158, 7, 383)) || lowerCase.contains(strM235) || lowerCase.contains(C0001.m1(f98short, 165, 4, 2295)) || lowerCase.contains(C0072.m285(f98short, 169, 5, 1916)) || lowerCase.contains(C0043.m169(f98short, 174, 2, 1834)) || lowerCase.contains(C0095.m379(f98short, 176, 2, 2785)) || lowerCase.contains(C0090.m358(f98short, 178, 2, 1244))) {
                return Boolean.FALSE;
            }
            if (lowerCase.contains(strM36) || lowerCase.contains(strM75) || lowerCase.contains(C0082.m325(f98short, 180, 6, 1692)) || lowerCase.contains(C0056.m223(f98short, 186, 7, 1942)) || lowerCase.contains(C0142.m567(f98short, 193, 2, 2128)) || lowerCase.contains(C0017.m65(f98short, 195, 2, 2944)) || lowerCase.contains(C0017.m65(f98short, 197, 2, 2821)) || lowerCase.contains(C0135.m539(f98short, 199, 4, 478))) {
                return bool;
            }
            return null;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0001.m1(f97short, 0, 1, 876));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0001.m1(f97short, 1, 6, 2810), C0006.m21(f97short, 7, 4, 2788), null));
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, l(30));
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int i;
        try {
            i = Integer.parseInt(str2);
        } catch (Exception unused) {
            i = 1;
        }
        ArrayList arrayListK = k(m(str, Math.max((i * 20) + 20, 80), 10));
        ArrayList arrayList = new ArrayList();
        int iMax = Math.max(0, (i - 1) * 20);
        int iMin = Math.min(arrayListK.size(), iMax + 20);
        while (iMax < iMin) {
            SearchItem searchItem = (SearchItem) arrayListK.get(iMax);
            String str3 = searchItem.b;
            String str4 = searchItem.a;
            String strJ = TextUtils.isEmpty(searchItem.c) ? AbstractC0302v0.j(searchItem.e) : searchItem.c;
            String strC1 = AbstractC0302v0.c1(searchItem.e);
            if (TextUtils.isEmpty(strC1) || strC1.equals(searchItem.e)) {
                strC1 = C0006.m21(f97short, 11, 2, 2330);
            }
            StringBuilder sb = new StringBuilder(strC1);
            if (!TextUtils.isEmpty(searchItem.d)) {
                sb.append(C0122.m486(f97short, 13, 1, 2102));
                sb.append(searchItem.d);
            }
            arrayList.add(new k(str3, str4, strJ, sb.toString()));
            iMax++;
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strB;
        String strD1 = "";
        String str = list.get(0);
        if (!str.startsWith(C0109.m432(f97short, 14, 13, 547))) {
            String strDetailContent = super.detailContent(list);
            if (!TextUtils.isEmpty(strDetailContent)) {
                return FishCrypto.b(strDetailContent);
            }
            k kVar = new k();
            kVar.n(str);
            kVar.o(C0014.m54(f97short, 40, 8, 1232));
            kVar.l(C0072.m285(f97short, 48, 4, 2111).concat(str));
            boolean z = FishCrypto.a;
            N1.d(kVar);
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        }
        try {
            strB = AbstractC0309x1.b(str.substring(13));
        } catch (Exception unused) {
            strB = "";
        }
        ArrayList<SearchItem> arrayListK = k(m(strB, 500, 30));
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (SearchItem searchItem : arrayListK) {
            if (TextUtils.isEmpty(strD1) && !TextUtils.isEmpty(searchItem.c)) {
                strD1 = searchItem.c;
            }
            arrayList.add(searchItem.b);
            String strC1 = AbstractC0302v0.c1(searchItem.e);
            if (TextUtils.isEmpty(strC1) || strC1.equals(searchItem.e)) {
                strC1 = C0097.m386(f97short, 27, 2, 1192);
            }
            sb.append(strC1);
            String strM432 = C0109.m432(f97short, 29, 3, 2906);
            sb.append(strM432);
            sb.append(searchItem.a);
            if (!TextUtils.isEmpty(searchItem.d)) {
                sb.append(strM432);
                sb.append(searchItem.d);
            }
            sb.append(C0120.m477(f97short, 32, 1, 1376));
            sb.append(searchItem.b);
            sb.append(C0008.m31(f97short, 33, 2, 1725));
        }
        k kVar2 = new k();
        kVar2.n(str);
        kVar2.o(strB);
        if (TextUtils.isEmpty(strD1)) {
            strD1 = AbstractC0302v0.d1();
        }
        kVar2.p(strD1);
        kVar2.s(arrayList.size() + C0001.m1(f97short, 35, 5, 3175));
        kVar2.l(sb.toString().trim());
        if (!arrayList.isEmpty()) {
            String strB2 = b(arrayList);
            kVar2.r(strB2);
            kVar2.q(a(arrayList));
            AbstractC0280n1.p(strB);
            AbstractC0280n1.q(strB2);
        }
        boolean z2 = FishCrypto.a;
        N1.d(kVar2);
        return com.github.catvod.spider.merge.p001b.g.s(kVar2);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int i;
        try {
            i = Integer.parseInt(str2);
        } catch (Exception unused) {
            i = 1;
        }
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(l(20));
        gVarC.o(i, i + 1, 20, Integer.MAX_VALUE);
        return gVarC.r();
    }

    public static void h(ArrayList arrayList, HashSet hashSet, JSONArray jSONArray, String str) {
        double d;
        String strD1;
        String strM459;
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strTrim = jSONObjectOptJSONObject.optString(C0019.m75(f97short, 289, 5, 780), "").trim();
                if (!TextUtils.isEmpty(strTrim) && hashSet.add(strTrim)) {
                    try {
                        d = Double.parseDouble(jSONObjectOptJSONObject.getJSONObject(C0044.m175(f97short, 294, 6, 2287)).optString(C0045.m177(f97short, 300, 5, 2109), C0019.m75(f97short, 305, 1, 999)));
                    } catch (Exception unused) {
                        d = 0.0d;
                    }
                    String strM379 = C0095.m379(f97short, 306, 155, 2271);
                    try {
                        String strOptString = jSONObjectOptJSONObject.getJSONObject(C0125.m499(f97short, 461, 3, 2779)).optString(C0043.m169(f97short, 464, 6, 2362), "");
                        strD1 = TextUtils.isEmpty(strOptString) ? AbstractC0302v0.d1() : strOptString + strM379;
                    } catch (Exception unused2) {
                        strD1 = AbstractC0302v0.d1();
                    }
                    if (C0098.m390(f97short, 470, 22, 2483).equals(str)) {
                        strM459 = C0017.m65(f97short, 492, 4, 2743);
                    } else if (C0043.m169(f97short, 496, 19, 344).equals(str)) {
                        strM459 = C0090.m358(f97short, 515, 4, 434);
                    } else if (C0104.m414(f97short, 519, 6, 2336).equals(str)) {
                        strM459 = C0018.m70(f97short, 525, 4, 680);
                    } else {
                        strM459 = C0128.m511(f97short, 529, 8, 2711).equals(str) ? C0115.m459(f97short, 537, 4, 1514) : C0014.m54(f97short, 541, 4, 396);
                    }
                    if (d > 0.0d) {
                        strM459 = strM459 + C0133.m529(f97short, 545, 4, 1337) + d;
                    }
                    arrayList.add(new DoubanItem(strTrim, strD1, strM459, d));
                }
            }
        }
    }

    public static void i(ArrayList arrayList, HashSet hashSet, JSONArray jSONArray) {
        long j;
        long j2;
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            SearchItem searchItem = null;
            if (jSONObjectOptJSONObject != null) {
                String strB = SearchItem.b(jSONObjectOptJSONObject, C0114.m454(f97short, 556, 4, 2047), C0106.m422(f97short, 560, 10, 2296), C0050.m199(f97short, 570, 9, 968), C0009.m33(f97short, 549, 3, 2211), C0112.m445(f97short, 552, 4, 2614));
                String strB2 = SearchItem.b(jSONObjectOptJSONObject, C0103.m408(f97short, 579, 5, 1652), C0120.m477(f97short, 584, 4, 476), C0027.m105(f97short, 588, 4, 1489));
                if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(strB2)) {
                    searchItem = new SearchItem();
                    searchItem.a = strB2;
                    searchItem.b = strB;
                    searchItem.c = SearchItem.b(jSONObjectOptJSONObject, C0135.m539(f97short, 610, 6, 2619), C0043.m169(f97short, 616, 5, 1177), C0059.m234(f97short, 621, 5, 2451), C0109.m432(f97short, 626, 5, 2384), C0010.m36(f97short, 631, 9, 1290), C0063.m249(f97short, 640, 8, 1316), C0096.m382(f97short, 592, 9, 1742), C0055.m219(f97short, 601, 9, 901));
                    searchItem.d = SearchItem.b(jSONObjectOptJSONObject, C0125.m499(f97short, 662, 10, 514), C0104.m414(f97short, 672, 8, 3082), C0070.m277(f97short, 680, 4, 1084), C0089.m355(f97short, 684, 11, 475), C0140.m558(f97short, 648, 10, 2380), C0115.m459(f97short, 658, 4, 1025));
                    String strM301 = C0076.m301(f97short, 695, 2, 2249);
                    String strM42 = C0011.m42(f97short, 697, 11, 2413);
                    searchItem.f = SearchItem.b(jSONObjectOptJSONObject, strM301, strM42);
                    searchItem.g = SearchItem.b(jSONObjectOptJSONObject, strM42, strM301);
                    searchItem.h = SearchItem.b(jSONObjectOptJSONObject, C0030.m116(f97short, 708, 6, 1836), C0006.m21(f97short, 714, 11, 1536), C0053.m210(f97short, 725, 12, 1800));
                    searchItem.i = SearchItem.b(jSONObjectOptJSONObject, C0073.m288(f97short, 753, 6, 2525), C0009.m33(f97short, 759, 12, 2978), C0063.m249(f97short, 737, 11, 627), C0028.m108(f97short, 748, 5, 504));
                    searchItem.j = SearchItem.b(jSONObjectOptJSONObject, C0109.m432(f97short, 781, 13, 3167), C0139.m554(f97short, 794, 12, 3188), C0098.m390(f97short, 806, 11, 1958), C0056.m223(f97short, 817, 10, 2996), C0091.m360(f97short, 771, 7, 380), C0018.m70(f97short, 778, 3, 474));
                    searchItem.k = SearchItem.c(jSONObjectOptJSONObject);
                }
            }
            if (searchItem != null && AbstractC0302v0.s0(searchItem.b)) {
                if (hashSet.add(searchItem.b)) {
                    searchItem.e = AbstractC0302v0.b1(searchItem.b);
                    String str = searchItem.d;
                    long time = 0;
                    if (!TextUtils.isEmpty(str)) {
                        String strTrim = str.trim();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            boolean zContains = strTrim.contains(C0027.m105(f97short, 827, 2, 2161));
                            String strM285 = C0072.m285(f97short, 829, 3, 1159);
                            if (zContains) {
                                j = Long.parseLong(strTrim.replaceAll(strM285, ""));
                                j2 = 31536000000L;
                            } else if (strTrim.contains(C0027.m105(f97short, 832, 3, 1671))) {
                                j = Long.parseLong(strTrim.replaceAll(strM285, ""));
                                j2 = 2592000000L;
                            } else if (strTrim.contains(C0106.m422(f97short, 835, 2, 2501))) {
                                j = Long.parseLong(strTrim.replaceAll(strM285, ""));
                                j2 = 86400000;
                            } else if (strTrim.contains(C0097.m386(f97short, 837, 3, 1604))) {
                                j = Long.parseLong(strTrim.replaceAll(strM285, ""));
                                j2 = 3600000;
                            } else if (strTrim.contains(C0122.m486(f97short, 840, 3, 2771))) {
                                j = Long.parseLong(strTrim.replaceAll(strM285, ""));
                                j2 = 60000;
                            } else {
                                String[] strArr = {C0044.m175(f97short, 859, 19, 1442), C0090.m358(f97short, 878, 16, 3193), C0143.m570(f97short, 894, 10, 1387), C0143.m570(f97short, 843, 11, 2121), C0043.m169(f97short, 854, 5, 2442)};
                                for (int i2 = 0; i2 < 5; i2++) {
                                    try {
                                        Date date = new SimpleDateFormat(strArr[i2], Locale.CHINA).parse(strTrim);
                                        if (date != null) {
                                            time = date.getTime();
                                            break;
                                        }
                                        continue;
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            time = jCurrentTimeMillis - (j * j2);
                        } catch (Exception unused2) {
                        }
                    }
                    searchItem.m = time;
                    arrayList.add(searchItem);
                }
            }
        }
    }

    public static ArrayList l(int i) {
        int i2 = i * 3;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        String[] strArr = s;
        int i3 = 0;
        for (int i4 = 0; i4 < 5; i4++) {
            String str = strArr[i4];
            try {
                String str2 = C0072.m285(f97short, 904, 51, 3170) + str + C0143.m570(f97short, 955, 6, 2657) + C0115.m459(f97short, 961, 40, 846) + C0096.m382(f97short, 1001, 17, 787);
                HashMap map = new HashMap();
                map.put(C0096.m382(f97short, 1018, 4, 791), C0050.m199(f97short, 1022, 16, 2168));
                map.put(C0098.m390(f97short, 1038, 10, 1491), C0047.m186(f97short, 1048, 10, 1336));
                map.put(C0021.m83(f97short, 1058, 7, 1668), C0049.m193(f97short, 1065, 63, 2894));
                map.put(C0043.m169(f97short, 1128, 10, 2807), C0073.m288(f97short, 1138, 184, 1661));
                JSONObject jSONObject = new JSONObject(X1.X(str2, null, map));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C0011.m42(f97short, 1322, 24, 1516));
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray(C0142.m567(f97short, 1346, 5, 1970));
                }
                h(arrayList, hashSet, jSONArrayOptJSONArray, str);
                if (arrayList.size() >= i2) {
                    break;
                }
            } catch (Exception unused) {
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        String strM219 = C0055.m219(f97short, 1351, 13, 843);
        if (zIsEmpty) {
            ArrayList arrayList2 = new ArrayList();
            Collections.addAll(arrayList2, t);
            Collections.shuffle(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            int iMin = Math.min(i, arrayList2.size());
            while (i3 < iMin) {
                String str3 = (String) arrayList2.get(i3);
                arrayList3.add(new k(strM219.concat(AbstractC0309x1.c(str3.getBytes())), str3, AbstractC0302v0.d1(), C0107.m427(f97short, 1364, 4, 2820)));
                i3++;
            }
            return arrayList3;
        }
        Collections.sort(arrayList, new Comparator<DoubanItem>() { // from class: com.github.catvod.spider.Tiu6.1
            @Override // java.util.Comparator
            public int compare(DoubanItem doubanItem, DoubanItem doubanItem2) {
                return Double.compare(doubanItem2.d, doubanItem.d);
            }
        });
        ArrayList arrayList4 = new ArrayList();
        int iMin2 = Math.min(i, arrayList.size());
        while (i3 < iMin2) {
            DoubanItem doubanItem = (DoubanItem) arrayList.get(i3);
            arrayList4.add(new k(strM219.concat(AbstractC0309x1.c(doubanItem.a.getBytes())), doubanItem.a, doubanItem.b, doubanItem.c));
            i3++;
        }
        return arrayList4;
    }

    public static String o(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        while (strTrim.endsWith(C0125.m499(f97short, 1368, 1, 1943))) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
        }
        return strTrim;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0093.m368(f97short, 1369, 15, 681));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0095.m379(f97short, 1384, 13, 990));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0053.m210(f97short, 1397, 11, 2657));
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
        String strM529 = C0133.m529(f97short, 1408, 4, 1713);
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strM529);
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strO = o(jSONArrayOptJSONArray.optString(i, ""));
                    if (!TextUtils.isEmpty(strO)) {
                        arrayList.add(strO);
                    }
                }
            } else {
                String strO2 = o(jSONObject.optString(strM529, ""));
                if (!TextUtils.isEmpty(strO2)) {
                    arrayList.add(strO2);
                }
            }
        } catch (Exception unused) {
        }
        if (arrayList.isEmpty()) {
            arrayList.add(C0043.m169(f97short, 1412, 19, 951));
        }
        this.r = AbstractC0260h.b(C0109.m432(f97short, 1431, 13, 1041), arrayList, false);
    }

    public final JSONObject j(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(o(this.r.b()));
        sb.append(C0019.m75(f97short, 1444, 23, 1235));
        String strM467 = C0117.m467(f97short, 1467, 5, 1967);
        sb.append(URLEncoder.encode(str, strM467));
        String string = sb.toString();
        if (!TextUtils.isEmpty("")) {
            StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(string, C0096.m382(f97short, 1472, 7, 454));
            sbP.append(URLEncoder.encode("", strM467));
            string = sbP.toString();
        }
        JSONObject jSONObjectOptJSONObject = new JSONObject(X1.X(string, null, n())).optJSONObject(C0074.m292(f97short, 1479, 4, 2140));
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList<SearchItem> arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        int iMax = Math.max(12, 3);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SearchItem searchItem = (SearchItem) it.next();
            int iIntValue = map.containsKey(searchItem.e) ? ((Integer) map.get(searchItem.e)).intValue() : 0;
            if (iIntValue < iMax) {
                map.put(searchItem.e, Integer.valueOf(iIntValue + 1));
                arrayList2.add(searchItem);
            }
        }
        if (!arrayList2.isEmpty()) {
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.min(4, arrayList2.size()));
            ArrayList arrayList3 = new ArrayList();
            try {
                for (final SearchItem searchItem2 : arrayList2) {
                    arrayList3.add(executorServiceNewFixedThreadPool.submit(new Callable() { // from class: com.github.catvod.spider.g

                        /* JADX INFO: renamed from: short, reason: not valid java name */
                        private static final short[] f126short = {1196, 1250, 1267, 1258, 1196, 1253, 1265, 1260, 1261, 1271, 1254, 1261, 1255, 1196, 1265, 1254, 1264, 1260, 1270, 1265, 1248, 1254, 1198, 1248, 1259, 1254, 1248, 1256, 1685, 3076, 3075, 3099, 3084, 3073, 3076, 3081, 2264, 2243, 2252, 2267, 2252, 2244, 2241, 2252, 2255, 2241, 2248, 856, 837, 845, 852, 847, 856, 857, 2842, 2843, 2834, 2843, 2826, 2843, 2842, 707, 708, 716, 713, 866, 885, 885, 872, 885, 21005, 28276, 27772, 27860, 22073, -28035, 1005, 1018, 1015, 1010, 1023, 812, 827, 812, 804, 801, 812, 815, 801, 808, 3074, 3075, 3102, 3073, 3085, 3072, 3274, 3276, 3290, 3290, 3292, 3274, 3274, 28385, 27808, 23429, 32066, 28444, 23111, 1431, 1434, 2972, 2955, 2973, 2945, 2971, 2972, 2957, 2955, 2993, 2951, 2954, 2153, 2165, 2159, 2152, 2169, 2175, 1669, 1683, 1672, 1687, 1668, 1726, 1685, 1688, 1681, 1668, 785, 796, 774, 798, 810, 769, 780, 773, 784, 1106, 1097, 1088, 1107, 1092, 1150, 1101, 1096, 1103, 1098, 958, 933, 940, 959, 936, 897, 932, 931, 934, 1511, 1506, 1509, 1504, 1502, 1490, 1497, 1496, 672, 677, 688, 677};

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            boolean zBooleanValue;
                            JSONObject jSONObjectOptJSONObject;
                            String[] strArr = Tiu6.s;
                            Tiu6 tiu6 = this.a;
                            tiu6.getClass();
                            String strM21 = C0006.m21(f126short, 0, 28, 1155);
                            Tiu6.SearchItem searchItem3 = searchItem2;
                            String str = searchItem3.b;
                            Map map2 = Tiu6.u;
                            Boolean bool = (Boolean) map2.get(str);
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            } else {
                                Boolean bool2 = searchItem3.k;
                                if (bool2 == null) {
                                    String lowerCase = (searchItem3.i + C0087.m346(f126short, 28, 1, 1717) + searchItem3.j).toLowerCase();
                                    if (lowerCase.contains(C0128.m511(f126short, 29, 7, 3181)) || lowerCase.contains(C0008.m31(f126short, 36, 11, 2221)) || lowerCase.contains(C0106.m422(f126short, 47, 7, 829)) || lowerCase.contains(C0049.m193(f126short, 54, 7, 2942)) || lowerCase.contains(C0063.m249(f126short, 61, 4, 677)) || lowerCase.contains(C0079.m314(f126short, 65, 5, 775)) || lowerCase.contains(C0059.m234(f126short, 70, 2, 2876)) || lowerCase.contains(C0059.m234(f126short, 72, 2, 2460)) || lowerCase.contains(C0018.m70(f126short, 74, 2, 1049))) {
                                        bool2 = Boolean.FALSE;
                                    } else {
                                        bool2 = (lowerCase.contains(C0142.m567(f126short, 76, 5, 923)) || lowerCase.contains(C0090.m358(f126short, 81, 9, 845)) || lowerCase.contains(C0112.m445(f126short, 90, 6, 3180)) || lowerCase.contains(C0087.m346(f126short, 96, 7, 3257)) || lowerCase.contains(C0028.m108(f126short, 103, 2, 2536)) || lowerCase.contains(C0120.m477(f126short, 105, 2, 2154)) || lowerCase.contains(C0074.m292(f126short, 107, 2, 1151))) ? Boolean.TRUE : null;
                                    }
                                }
                                if (bool2 != null) {
                                    map2.put(searchItem3.b, bool2);
                                    zBooleanValue = bool2.booleanValue();
                                } else {
                                    boolean z = false;
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put(C0070.m277(f126short, 109, 2, 1534), TextUtils.isEmpty(searchItem3.f) ? searchItem3.a : searchItem3.f);
                                        jSONObject.put(C0109.m432(f126short, 111, 11, 3054), TextUtils.isEmpty(searchItem3.g) ? searchItem3.f : searchItem3.g);
                                        jSONObject.put(C0014.m54(f126short, 122, 6, 2074), searchItem3.h);
                                        jSONObject.put(C0017.m65(f126short, 128, 10, 1761), searchItem3.e);
                                        jSONObject.put(C0105.m416(f126short, 138, 9, 885), searchItem3.e);
                                        jSONObject.put(C0106.m422(f126short, 147, 10, 1057), searchItem3.b);
                                        jSONObject.put(C0014.m54(f126short, 157, 9, 973), searchItem3.b);
                                        jSONObject.put(C0032.m126(f126short, 166, 4, 1419), searchItem3.b);
                                        JSONObject jSONObject2 = new JSONObject(X1.M(Tiu6.o(tiu6.r.b()).concat(strM21), jSONObject.toString(), tiu6.n()).a());
                                        if (jSONObject2.optInt(C0133.m529(f126short, 170, 4, 1469), -1) == 0 && (jSONObjectOptJSONObject = jSONObject2.optJSONObject(C0019.m75(f126short, 174, 4, 708))) != null && Tiu6.SearchItem.c(jSONObjectOptJSONObject) == Boolean.TRUE) {
                                            z = true;
                                        }
                                        zBooleanValue = z;
                                    } catch (Exception unused) {
                                        zBooleanValue = false;
                                    }
                                    map2.put(searchItem3.b, Boolean.valueOf(zBooleanValue));
                                }
                            }
                            return Boolean.valueOf(zBooleanValue);
                        }
                    }));
                }
                for (int i = 0; i < arrayList2.size(); i++) {
                    try {
                        ((SearchItem) arrayList2.get(i)).l = ((Boolean) ((Future) arrayList3.get(i)).get()).booleanValue();
                    } catch (Exception unused) {
                        ((SearchItem) arrayList2.get(i)).l = false;
                    }
                }
                executorServiceNewFixedThreadPool.shutdownNow();
            } catch (Throwable th) {
                executorServiceNewFixedThreadPool.shutdownNow();
                throw th;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        HashMap map2 = new HashMap();
        for (SearchItem searchItem3 : arrayList2) {
            int iIntValue2 = map2.containsKey(searchItem3.e) ? ((Integer) map2.get(searchItem3.e)).intValue() : 0;
            if (iIntValue2 < 3 && searchItem3.l) {
                map2.put(searchItem3.e, Integer.valueOf(iIntValue2 + 1));
                arrayList4.add(searchItem3);
            }
        }
        return arrayList4;
    }

    public final ArrayList m(String str, int i, int i2) {
        String strM83 = C0021.m83(f97short, 1483, 8, 2275);
        String strM414 = C0104.m414(f97short, 1491, 4, 2411);
        String strM292 = C0074.m292(f97short, 1495, 5, 2002);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            JSONObject jSONObjectJ = j(str);
            i(arrayList, hashSet, jSONObjectJ.optJSONArray(strM292));
            i(arrayList, hashSet, jSONObjectJ.optJSONArray(strM414));
            String strOptString = jSONObjectJ.optString(C0056.m223(f97short, 1500, 9, 1601), jSONObjectJ.optString(C0026.m102(f97short, 1509, 8, 3028), ""));
            boolean zOptBoolean = jSONObjectJ.optBoolean(strM83, false);
            int i3 = 0;
            while (!zOptBoolean && !TextUtils.isEmpty(strOptString) && i3 < i2 && arrayList.size() < i) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                JSONObject jSONObjectOptJSONObject = new JSONObject(X1.X(o(this.r.b()) + C0028.m108(f97short, 1517, 29, 2564) + URLEncoder.encode(strOptString, C0117.m467(f97short, 1546, 5, 2655)), null, n())).optJSONObject(C0009.m33(f97short, 1551, 4, 1913));
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean(strM83, false);
                i(arrayList, hashSet, jSONObjectOptJSONObject.optJSONArray(strM292));
                i(arrayList, hashSet, jSONObjectOptJSONObject.optJSONArray(strM414));
                i3++;
                zOptBoolean = zOptBoolean2;
            }
        } catch (Exception unused2) {
        }
        Collections.sort(arrayList, new Comparator<SearchItem>() { // from class: com.github.catvod.spider.Tiu6.2
            @Override // java.util.Comparator
            public int compare(SearchItem searchItem, SearchItem searchItem2) {
                return Long.compare(searchItem2.m, searchItem.m);
            }
        });
        return arrayList;
    }

    public final HashMap n() {
        HashMap mapT = com.github.catvod.spider.merge.D.b.t(C0063.m249(f97short, 1555, 10, 2538), C0140.m558(f97short, 1565, 111, 1804), C0085.m339(f97short, 1676, 6, 344), C0098.m390(f97short, 1682, 16, 2655));
        mapT.put(C0092.m365(f97short, 1699, 7, 1502), o(this.r.b()).concat(C0076.m301(f97short, 1698, 1, 2716)));
        mapT.put(C0105.m416(f97short, 1706, 6, 1135), o(this.r.b()));
        return mapT;
    }

    public String searchContent(String str, boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0032.m126(f97short, 1712, 13, 1907));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0098.m390(f97short, 1725, 13, 2979));
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

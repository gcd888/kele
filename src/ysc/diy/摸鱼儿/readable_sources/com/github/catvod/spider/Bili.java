package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.I0;
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
import com.github.catvod.spider.merge.p000a.A;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.C0386x;
import com.github.catvod.spider.merge.p000a.N;
import com.github.catvod.spider.merge.p000a.V;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p005f.h;
import com.github.catvod.spider.merge.p005f.j;
import com.github.catvod.spider.merge.p005f.l;
import com.github.catvod.spider.merge.p005f.n;
import com.github.catvod.spider.merge.p005f.o;
import com.github.catvod.spider.merge.p005f.p;
import com.github.catvod.spider.merge.p005f.t;
import com.github.catvod.spider.merge.p005f.w;
import com.github.catvod.spider.merge.p005f.x;
import com.github.catvod.spider.merge.p005f.z;
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
import com.github.catvod.spider.merge.p017u.RunnableC0452d;
import com.github.catvod.spider.merge.p017u.RunnableC0453e;
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
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Bili extends Spider {
    public static volatile z o;
    public static boolean p;
    public static long q;
    public static long r;
    public static volatile Bili s;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f18short = {583, -30629, 31883, 1661, 1654, 1651, 1654, 1600, 1662, 1660, 1660, 1648, 1642, 1649, 1643, 28229, 31440, 3167, 3156, 3153, 3156, 3170, 3149, 3160, 3151, 3150, 3154, 3155, 3164, 3153, 2119, 2120, 2117, 2135, 2135, 2624, 2637, 2628, 2641, 2667, 2653, 2640, 266, 263, 270, 283, 289, 272, 287, 275, 283, 24771, 24030, 402, 399, 409, 408, 399, 1526, 1674, 2862, 1003, 1851, 2346, 2365, 2361, 2309, 26228, 26599, 26537, -27882, 24933, 25121, 25191, -28059, 25015, -25489, -29325, 21681, 22032, 22396, 27737, -26394, -29049, 30321, 20416, 25610, 22658, 25391, 25204, -28042, 3066, 17944, 28210, 28132, -25114, 2519, 23873, -25407, 2442, 2454, 21542, -30638, 555, 565, 559, 17585, -30896, 21258, 17719, 24181, 2617, 2593, 2619, 2347, 2365, 2361, 2347, 2359, 2358, 2311, 2347, 2348, 2361, 2348, 2349, 2347, -25344, -28867, 263, 284, 263, 274, 287, 257, 274, 285, 280, 27513, 21859, -27993, 26803, 873, 870, 867, 873, 865, 28548, 27956, 32504, 22151, 2222, 2219, 2236, 2234, 2239, 2218, 2235, 27725, 21079, 21509, 21784, 2219, 2210, 25302, 23756, 24800, -32743, 1971, 1972, 1967, 1975, 22636, -26132, 28486, -25485, 549, 547, 20501, -27125, 19702, 19481, 1249, 1250, 1196, 1252, 1250, 22228, -28470, 2364, 2365, 2419, 2366, 2365, 23307, -25323, 515, 514, 20532, -27094, 19671, 19513, 3289, 3272, 3279, 3292, 3273, 3284, 3282, 3283, 24848, -28123, 1001, 998, 1003, 1017, 1017, 2111, 2098, 2107, 2094, 2068, 2082, 2095, 3280, 3271, 3267, 3327, 531, 536, 541, 536, 558, 528, 530, 530, 542, 516, 543, 517, 1433, 1234, 1242, 1243, 1238, 1246, 1248, 1245, 1246, 1233, 1240, 1226, 1234, 1238, 993, 1001, 1000, 997, 1005, 979, 1002, 1016, 1333, 1326, 1333, 1312, 1325, 1331, 1312, 1327, 1322, 1103, 424, 479, 1039, 1048, 1052, 1087, 515, 523, 26245, 22169, 20298, 30127, 20591, 22702, 20356, -347, -30114, 31652, 21927, -28572, -30084, 630, 602, 602, 606, 604, 592, 3067, 3063, 3063, 3059, 3057, 3069, 1404, 1399, 1394, 1399, 1345, 1396, 1405, 1386, 2845, 2827, 2845, 2845, 2826, 2831, 2842, 2831, 2013, 2571, 2003, 1924, 2003, 1930, 1997, 2003, 1944, 1937, 2003, 1936, 1941, 1935, 1928, 2002, 1935, 1939, 1987, 1939, 1941, 1944, 1985, 2196, 2255, 2244, 2198, 2249, 2242, 2247, 2242, 2189, 2250, 2242, 2255, 2198, 1795, 1862, 1868, 1857, 1816, 1576, 1663, 1632, 1587, 489, 443, 438, 447, 426, 498, 418, 447, 427, 3186, 3121, 3108, 3083, 3133, 3120, 3177, 1801, 1794, 1799, 1794, 1844, 633, 623, 619, 633, 613, 612, 597, 3091, 3148, 3163, 3167, 3091, 3146, 3157, 3161, 3147, 3091, 3147, 3161, 3166, 3091, 3151, 3161, 3165, 3151, 3155, 3154, 3075, 3151, 3161, 3165, 3151, 3155, 3154, 3171, 3157, 3160, 3073, 1153, 1165, 1158, 1159, 3036, 3019, 3037, 3035, 3010, 3034, 2802, 2788, 2784, 2802, 2798, 2799, 2782, 2357, 2344, 2357, 2349, 2340, 2372, 2376, 2385, 2370, 2389, 1258, 1265, 1272, 1259, 1276, 1222, 1258, 1260, 1275, 1222, 1261, 1264, 1261, 1269, 1276, 1453, 1470, 1449, 1453, 1471, 2741, 2746, 2742, 2750, 2893, 2888, 2911, 2897, 2900, 2894, 2901, 2101, 2096, 2087, 2074, 2097, 2092, 2088, 2080, 3280, 3291, 3273, 3297, 3291, 3278, 1440, 1441, 1463, 1447, 1600, 1619, 1606, 1627, 1628, 1621, -30857, 24245, 3209, 3219, 680, 696, 692, 681, 702, 410, 1324, 1343, 1320, 1317, 1340, 1320, 1341, 1324, 1618, 1607, 1630, 1604, 1624, 1619, 1618, 1604, -28185, 23849, 2652, 2655, 2650, 2649, 2651, 2544, 2547, 2546, 2555, 2499, 2536, 2549, 2536, 2544, 2553, 2146, 2159, 3106, 3127, 3096, 3118, 3107, 617, 611, 622, 1269, 1277, 1264, 28851, -28677, 1115, 2283, 1505, -29786, 22756, 1852, 938, 1391, 1400, 1404, 1375, 1663, 691, 691, 691, 2657, 1375, 1288, 1375, 1287, 1301, 1298, 1373, 1305, 1310, 1284, 1301, 1282, 1302, 1297, 1299, 1301, 1375, 1286, 1305, 1301, 1287, 1359, 1297, 1305, 1300, 1357, 22220, -28462, -30605, 23345, 414, 2744, 1008, 2478, 1371, 1371, 1371, 1876, 1876, 1876, 2304, 2315, 2318, 2315, 2365, 2322, 2311, 2320, 2321, 2317, 2316, 2307, 2318, 2365, 2320, 2311, 2321, 2311, 2326, 1922, 1929, 1932, 1929, 1983, 1928, 1925, 1932, 1936, 2914, 2921, 2924, 2921, 2911, 2930, 2917, 2931, 2917, 2932, 2911, 2925, 2913, 2926, 2913, 2919, 2917, 2688, 2699, 2702, 2699, 2749, 2706, 2695, 2704, 2705, 2701, 2700, 2691, 2702, 2749, 2705, 2701, 2704, 2710, 881, 890, 895, 890, 844, 867, 895, 882, 874, 881, 882, 880, 888, 844, 894, 882, 893, 882, 884, 886, 1157, 1166, 1163, 1166, 1208, 1167, 1166, 1172, 1171, 1160, 1173, 1182, 1208, 1172, 1182, 1161, 1156, 1364, 1375, 1370, 1375, 1385, 1350, 1363, 1348, 1349, 1369, 1368, 1367, 1370, 1385, 1344, 1375, 1349, 1375, 1364, 1375, 1370, 1375, 1346, 1359, 2479, 2468, 2465, 2468, 2450, 2494, 2489, 2476, 2489, 2488, 2494, 1566, 1557, 1552, 1557, 1571, 1548, 1561, 1550, 1551, 1555, 1554, 1565, 1552, 1571, 1553, 1565, 1554, 1565, 1563, 1561, 2457, 2450, 2455, 2450, 2468, 2455, 2452, 2460, 2452, 2446, 2447, 1711, 1700, 1697, 1700, 1682, 1726, 1722, 1700, 1721, 1710, 1701, 1682, 1696, 1698, 1705, 1704, 2968, 2963, 2966, 2963, 2981, 2969, 2971, 2958, 2975, 2973, 2965, 2952, 2947, 2981, 2967, 2971, 2964, 2971, 2973, 2975, 2094, 2085, 2080, 2085, 2067, 2080, 2083, 2107, 2067, 2089, 2082, 2088, 798, 789, 784, 789, 803, 784, 787, 795, 789, 786, 587, 576, 581, 576, 630, 586, 581, 588, 584, 583, 2709, 2718, 2715, 2718, 2728, 2710, 2708, 2708, 2712, 2690, 2713, 2691, 2782, 3093, 3072, 3084, 3103, 3085, 3084, 425, 418, 423, 418, 404, 443, 430, 441, 440, 420, 421, 426, 423, 2680, 2661, 2680, 2656, 2665, 1614, 1602, 1627, 1608, 1631, 1226, 3111, 3107, 3118, 2850, 2862, 2853, 2852, 397, 392, 402, 405, 1113, 1116, 1097, 1116, 552, 551, 546, 555, 821, 808, 830, 831, 808, 1456, 1447, 1443, 1439, 2304, 2311, 2317, 2316, 2321, 2358, 2330, 2305, 2310, 2334, 1702, 1712, 1716, 1702, 1722, 1723, 1674, 1702, 1697, 1716, 1697, 1696, 1702, 771, 853, 836, 834, 832, 854, 844, 863, 832, 792, 791, 789, 806, 826, 2099, 2156, 2171, 2175, 2099, 2159, 2169, 2173, 2159, 2163, 2162, 2099, 2165, 2162, 2168, 2169, 2148, 2099, 2158, 2169, 2159, 2153, 2160, 2152, 2083, 2152, 2149, 2156, 2169, 2081, 2093, 2106, 2159, 2169, 2173, 2159, 2163, 
    2162, 2115, 2152, 2149, 2156, 2169, 2081, 1169, 1240, 1221, 1235, 1234, 1221, 1162, 768, 853, 835, 839, 853, 841, 840, 889, 853, 850, 839, 850, 851, 853, 795, 1647, 1593, 1576, 1582, 1580, 1652, 3032, 3022, 3018, 3032, 3012, 3013, 3060, 1496, 1486, 1482, 1496, 1476, 1477, 1524, 1474, 1487, 2506, 2462, 2453, 2434, 2456, 3172, 1587, 1581, 2464, 2551, 2464, 2556, 2559, 2542, 2540, 2538, 2464, 2552, 2541, 2534, 2464, 2542, 2557, 2540, 2464, 2556, 2538, 2542, 2557, 2540, 2535, 2480, 1151, 1125, 1120, 1146, 1149, 3074, 3097, 3074, 3095, 3098, 3076, 3095, 3096, 3101, 1908, 1893, 1890, 1905, 1892, 1913, 1919, 1918, 826, 712, 725, 728, 2054, 1704, 1697, 1698, 1706, 1707, 1724, 517, 514, 512, 518, 1361, 1287, 1305, 1354, 1350, 1361, 1287, 1284, 1354, 1350, 1361, 1304, 1285, 1299, 1298, 1285, 1354, 1299, 1298, 1284, 1300, 1361, 1304, 1285, 1299, 1298, 1285, 1320, 1283, 1294, 1287, 1298, 1354, 1302, 1283, 1283, 1298, 1305, 1283, 1310, 1304, 1305, 1468, 1454, 1409, 1469, 1463, 1456, 1467, 1459, 1471, 1262, 1276, 1235, 1262, 1261, 1250, 1259, 1273, 1249, 1253, 2191, 2205, 2226, 2187, 2178, 2177, 2177, 2178, 2202, 2226, 2188, 2207, 2190, 2181, 2180, 2203, 2184, 2206, 283, 265, 294, 287, 280, 271, 2360, 2346, 2309, 2350, 2357, 2348, 2355, 2367, 2349, 1440, 1458, 1437, 1450, 1451, 1457, 1462, 1453, 1456, 1467, 450, 457, 460, 457, 511, 468, 463, 470, 457, 453, 471, 2022, 2029, 2024, 2029, 2011, 2018, 2021, 2034, 1554, 1561, 1564, 1561, 1583, 1558, 1567, 1564, 1564, 1567, 1543, 1583, 1553, 1538, 1555, 1560, 1561, 1542, 1557, 1539, 3299, 3304, 3309, 3304, 3294, 3299, 3296, 3311, 3302, 3316, 3308, 3304, 3294, 3303, 3310, 3309, 3309, 3310, 3318, 2169, 2162, 2167, 2162, 2116, 2168, 2162, 2165, 2174, 2166, 2170, 2116, 2173, 2164, 2167, 2167, 2164, 2156, 596, 607, 602, 607, 617, 606, 607, 581, 578, 601, 580, 591, 3155, 3076, 3155, 3086, 3097, 3088, 3101, 3080, 3093, 3091, 3090, 3155, 3098, 3091, 3088, 3088, 3091, 3083, 3093, 3090, 3099, 3087, 3139, 3082, 3089, 3093, 3096, 3137, 32518, 22056, 23923, 28312, 32374, 2397, 2367, 29604, 18263, 18375, 22776, 21188, 3126, 2178, 2176, 2187, 2202, 2179, 2186, 2261, 1255, 1200, 1255, 1215, 1197, 1194, 1253, 1185, 1190, 1212, 1197, 1210, 1198, 1193, 1195, 1197, 1255, 1184, 1185, 1211, 1212, 1191, 1210, 1201, 1255, 1195, 1213, 1210, 1211, 1191, 1210, 1271, 1208, 1211, 1269, 1273, 1262, 1212, 1201, 1208, 1197, 1269, 1193, 1210, 1195, 1184, 1185, 1214, 1197, 579, 532, 579, 538, 606, 579, 516, 517, 543, 536, 515, 542, 533, 579, 536, 515, 538, 517, 521, 539, 595, 540, 514, 593, 605, 586, 540, 543, 593, 605, 3196, 3173, 3183, -29234, 29447, -28740, 23385, 29631, 23996, 22591, 32441, 27880, -29679, 20711, 24978, 699, 718, 715, 699, 19616, 28628, -29869, 24590, 30884, 22723, -30004, 28763, 22358, 22765, -29982, 23150, -29479, 18037, 18149, 18034, 22428, 25214, 24328, 28533, 23664, 32119, 17415, 17559, 17408, 21998, -30223, 22904, 17440, 20853, 23813, -31192, 23474, -29109, 29916, 2225, 2211, 2188, 2229, 2226, 2213, 2188, -29763, 21868, 18810, 26356, 25009, 21676, 25387, -1641, -29332, -26794, 25387, 25800, 22939, 1723, 1753, 31810, -29763, 21868, -24850, 27028, -30355, 21915, -30887, 24436, 21907, -32377, 32315, 22293, 23630, 28581, 32587, 2144, 2050, 29337, 28022, -29297, 2423, 2336, 2423, 2350, 2411, 2423, 2366, 2361, 2350, 2423, 2366, 2359, 2356, 2364, 2365, 2346, 2423, 2363, 2346, 2365, 2361, 2348, 2365, 2364, 2423, 2356, 2353, 2347, 2348, 2421, 2361, 2356, 2356, 2407, 2349, 2344, 2311, 2357, 2353, 2364, 2405, 2741, 2744, 2743, 2751, 2750, 2739, 2747, 2693, 2745, 2741, 2735, 2740, 2734, 957, 19895, -30117, -25844, 28643, 27777, 27735, -29522, 20568, 2401, 2419, 2396, 2422, 2419, 2396, 22277, 27294, 1622, 1571, 1574, 1622, -29299, 21920, 24391, -29869, 2925, 2875, 2872, 2934, 2937, 2939, 2925, 2852, 2873, 2863, 2862, 2873, 2934, 2863, 2862, 2872, 2856, 2925, 2852, 2873, 2863, 2862, 2873, 2836, 2879, 2866, 2875, 2862, 2934, 2858, 2879, 2879, 2862, 2853, 2879, 2850, 2852, 2853, 30133, 23707, 22464, 25643, 29893, 21181, 28454, 24923, 31217, 2791, 2737, 2735, 2812, 2515, 2504, 2503, 2507, 2499, 2460, 2438, 2440, 2433, 25679, 29857, 24895, 31125, 25171, 24881, 21922, 26681, 1265, 1156, 1153, 1428, 1439, 1434, 1439, 1449, 1413, 1410, 1431, 1410, 1411, 1413, 28919, 23001, 22505, 21871, 1821, 1814, 1811, 1814, 1824, 1804, 1803, 1822, 1803, 1802, 1804, 2755, 2748, 2723, 2785, 2796, 2796, 2811, 2741, 2777, 2757, 2809, 2798, 2741, 2798, 2812, 2762, 2746, 2788, 2811, 2746, 2778, 2808, 2811, 2781, 2796, 2813, 2763, 2776, 2777, 2747, 2776, 2787, 2726, 2757, 2809, 2751, 2764, 2788, 2753, 2799, 2761, 2752, 2794, 2793, 2807, 2815, 2807, 2762, 2741, 2766, 2745, 2776, 2790, 2773, 2763, 2794, 2754, 2804, 2773, 2808, 2773, 2763, 2792, 2775, 2751, 2756, 2786, 2758, 2805, 2784, 2787, 2748, 2791, 2788, 2762, 2766, 2764, 2740, 2808, 2775, 2805, 2785, 2722, 2749, 2793, 2775, 2757, 2757, 2767, 2795, 2780, 2758, 2759, 2759, 2782, 2750, 2796, 2804, 2754, 2786, 2786, 2815, 2783, 2750, 2753, 2776, 2804, 2811, 2754, 2760, 2736, 1781, 1698, 1781, 1709, 1727, 1720, 1783, 1715, 1716, 1710, 1727, 1704, 1724, 1723, 1721, 1727, 1781, 1716, 1723, 1708, 2459, 2448, 2453, 2448, 2470, 3109, 3097, 3075, 3076, 3093, 3091, 3158, 3103, 3096, 3103, 3074, 3158, 3076, 3091, 3079, 3075, 3091, 3077, 3074, 3158, 3088, 3095, 3103, 3098, 3091, 3090, 1971, 1935, 1941, 1938, 1923, 1925, 1984, 1929, 1934, 1929, 1940, 1984, 1923, 1921, 1934, 1923, 1925, 1932, 1932, 1925, 1924, 1984, 1935, 1938, 1984, 1940, 1929, 1933, 1925, 1924, 1984, 1935, 1941, 1940, 2836, 2847, 2842, 2847, 2857, 2839, 2837, 2837, 2841, 2819, 2840, 2818, 3027, 3014, 3018, 3033, 3019, 3018, 1896, 1891, 1894, 1891, 1877, 1914, 1903, 1912, 1913, 1893, 1892, 1899, 1894, 2861, 2822, 2819, 2822, 2895, 2847, 2845, 2816, 2839, 2838, 2895, 2826, 2845, 2845, 2816, 2845, 2901, 2895, 3129, 3090, 3095, 3090, 3163, 3083, 3081, 3092, 3075, 3074, 3137, 3163, 2385, 2426, 2431, 2426, 2355, 2403, 2401, 2428, 2411, 2410, 2345, 2355, 2430, 2426, 2400, 2400, 2426, 2429, 2420, 2355, 2403, 2418, 2401, 2418, 2430, 2422, 2407, 2422, 2401, 2400, 1753, 
    1747, 1758, 1133, 1138, 2314, 2306, 2319, 2520, 2509, 2530, 2516, 2521, 1870, 1883, 1858, 1871, 878, 891, 852, 866, 879, 2892, 2884, 2401, 2378, 2383, 2378, 2307, 2387, 2385, 2380, 2395, 2394, 2329, 2307, 2383, 2380, 2372, 2378, 2381, 2307, 2374, 2395, 2387, 2378, 2385, 2374, 2375, 486, 461, 456, 461, 388, 468, 470, 459, 476, 477, 414, 388, 453, 455, 455, 459, 465, 458, 464, 388, 455, 460, 453, 458, 451, 449, 448, 392, 388, 470, 449, 464, 470, 477, 388, 468, 456, 453, 477, 454, 453, 455, 463, 2585, 2610, 2615, 2610, 2683, 2603, 2601, 2612, 2595, 2594, 2657, 2683, 2610, 2613, 2605, 2618, 2615, 2610, 2623, 2683, 2577, 2568, 2580, 2581, 2683, 2601, 2622, 2600, 2603, 2612, 2613, 2600, 2622, 289, 266, 271, 266, 323, 275, 273, 268, 283, 282, 345, 323, 295, 290, 304, 299, 323, 263, 258, 279, 258, 323, 278, 269, 258, 277, 258, 266, 271, 258, 257, 271, 262, 1518, 1477, 1472, 1477, 1420, 1500, 1502, 1475, 1492, 1493, 1430, 1420, 1474, 1475, 1420, 1500, 1472, 1485, 1493, 1485, 1486, 1472, 1481, 1420, 1498, 1477, 1480, 1481, 1475, 1420, 1502, 1481, 1500, 1502, 1481, 1503, 1481, 1474, 1496, 1485, 1496, 1477, 1475, 1474, 1136, 1137, 1123, 1032, 1053, 1940, 1925, 1925, 1945, 1948, 1942, 1940, 1921, 1948, 1946, 1947, 2010, 1937, 1940, 1926, 1949, 2014, 1933, 1944, 1945, 392, 419, 422, 419, 490, 442, 440, 421, 434, 435, 496, 490, 423, 419, 441, 441, 419, 420, 429, 490, 427, 419, 430, 485, 425, 419, 430, 2339, 2385, 1163, 842, 841, 846, 2336, 2394, 2396, 2387, 2386, 2343, 2385, 2342, 779, 958, 2784, 2802, 2688, 3214, 3225, 3227, 1588, 2344, 2345, 2363, 2384, 2373, 2313, 614, 567, 543, 562, 553, 548, 637, 1796, 1804, 1845, 1898, 1917, 1913, 1845, 1898, 1910, 1915, 1891, 1919, 1896, 1845, 1901, 1919, 1912, 1845, 1898, 1910, 1915, 1891, 1903, 1896, 1910, 1829, 1919, 1898, 1861, 1907, 1918, 1831, 2498, 2437, 2450, 2445, 2432, 2521, 1109, 1040, 1050, 1047, 1102, 1076, 1123, 1148, 1071, 3296, 3232, 3240, 3248, 3235, 3252, 3323, 3318, 3296, 3232, 3240, 3248, 3239, 3242, 3323, 3314, 3318, 3314, 3326, 3296, 3232, 3241, 3251, 3252, 3245, 3323, 3319, 2812, 2731, 2812, 2723, 2751, 2738, 2730, 2742, 2721, 2812, 2723, 2751, 2738, 2730, 2726, 2721, 2751, 2796, 2738, 2725, 2746, 2743, 2798, 503, 434, 440, 437, 492, 470, 385, 414, 461, 443, 507, 499, 491, 508, 497, 416, 425, 429, 425, 421, 443, 507, 498, 488, 495, 502, 416, 428, 442, 429, 434, 447, 1709, 1703, 1706, 1845, 1834, 898, 906, 914, 901, 904, 3153, 3160, 3138, 3141, 3164, 1509, 1458, 1509, 1466, 1446, 1451, 1459, 1455, 1464, 1509, 1469, 1448, 1443, 1509, 1466, 1446, 1451, 1459, 1471, 1464, 1446, 1525, 26269, 30668, 24290, 421, 430, 427, 430, 408, 436, 435, 422, 435, 434, 436, 22063, 23345, 31690, 27005, 1988, 1999, 1994, 1999, 2041, 2005, 2002, 1991, 2002, 2003, 2005, 2540, 2535, 2530, 2535, 2513, 2530, 2529, 2537, 2535, 2528, -29023, 25008, 30758, 30593, 26920, 29506, 32056, 21526, 26965, 26888, 23019, -31536, 23078, 2816, 2860, 2860, 2856, 2858, 2854, 1140, 1151, 1146, 1151, 1097, 1146, 1145, 1137, 1151, 1144, -29172, 22719, 28143, 22721, 28352, 30718, 24829, 21971, 22006, 22760, 2719, 2693, 2330, 2321, 2324, 2321, 2343, 2315, 2319, 2321, 2316, 2331, 2320, 2343, 2325, 2327, 2332, 2333, 20565, 24880, 26739, 23901, 1788, 1783, 1778, 1783, 1729, 1773, 1769, 1783, 1770, 1789, 1782, 1729, 1779, 1777, 1786, 1787, 2482, 2486, 2466, 2479, 2474, 2487, 2490, 2547, 2541, 2473, 2483, 2468, 27881, 26096, 746, 22590, 21695, -28639, 21841, 22435, 23692, 2677, 2786, 2677, 22995, 22951, 2677, 2120, 2115, 2118, 2115, 2165, 2138, 2118, 2123, 2131, 2120, 2123, 2121, 2113, 2165, 2119, 2123, 2116, 2123, 2125, 2127, 24922, 24777, -29111, 31385, 2761, 2754, 2759, 2754, 2804, 2779, 2759, 2762, 2770, 2761, 2762, 2760, 2752, 2804, 2758, 2762, 2757, 2762, 2764, 2766, 25538, -28842, 31622, 1239, 3106, 3106, 3106, 3048, 3043, 3046, 3043, 3029, 3049, 3051, 3070, 3055, 3053, 3045, 3064, 3059, 3029, 3047, 3051, 3044, 3051, 3053, 3055, 22980, 30649, 28771, 32708, 2033, 2042, 2047, 2042, 1996, 2032, 2034, 2023, 2038, 2036, 2044, 2017, 2026, 1996, 2046, 2034, 2045, 2034, 2036, 2038, 1170, 1177, 1180, 1177, 1199, 1152, 1173, 1154, 1155, 1183, 1182, 1169, 1180, 1199, 1181, 1169, 1182, 1169, 1175, 1173, 18368, 18256, 18375, 22057, 29259, 32236, 1826, 1833, 1836, 1833, 1823, 1840, 1829, 1842, 1843, 1839, 1838, 1825, 1836, 1823, 1837, 1825, 1838, 1825, 1831, 1829, 2455, 2460, 2457, 2460, 2474, 2439, 2448, 2438, 2448, 2433, 2474, 2456, 2452, 2459, 2452, 2450, 2448, -25731, 30174, -32498, 30174, 22313, 31060, 20899, 19205, 19349, 19202, 23276, 25933, 23586, -25609, -29045, 851, 856, 861, 856, 878, 835, 852, 834, 852, 837, 878, 860, 848, 863, 848, 854, 852, 2385, 2394, 2399, 2394, 2412, 2395, 2390, 2399, 2371, 31861, 21851, 21536, 22695, 25680, 29886, 1015, 31084, 30158, 23776, 22329, 26392, 26251, -30655, 26043, 2601, 2594, 2599, 2594, 2580, 2595, 2606, 2599, 2619, 1625, 1618, 1623, 1618, 1636, 1624, 1623, 1630, 1626, 1621, 28544, -26655, -29533, 21106, 27938, -27325, 25611, 21527, 869, 31230, 30044, 23666, 19654, 25416, 3175, 3180, 3177, 3180, 3162, 3174, 3177, 3168, 3172, 3179, 2507, 2505, 2526, 2499, 2501, 2500, 2957, 2959, 2970, 2955, 2953, 2945, 2972, 2967, 2989, 2945, 2944, 2970, 2955, 2944, 2970, 1136, 1137, 1120, 1141, 1149, 1144, 1111, 1147, 1146, 1120, 1137, 1146, 1120, 1534, 1529, 1531, 1523, 1493, 1529, 1528, 1506, 1523, 1528, 1506, 1415, 1408, 1410, 1418, 1465, 1414, 1419, 1418, 1408, 1452, 1408, 1409, 1435, 1418, 1409, 1435, 412, 464, 475, 478, 475, 464, 475, 478, 475, 493, 465, 477, 477, 473, 475, 471, 2726, 2724, 2737, 2720, 2722, 2730, 2743, 2732, 2720, 2742, 1737, 1736, 1746, 1749, 1742, 1747, 1752, 1778, 1752, 1743, 1730, 1764, 1743, 1728, 1731, 1741, 1732, 1733, 647, 644, 668, 686, 645, 655, 678, 644, 655, 654, 792, 775, 779, 793, 803, 769, 778, 779, 2300, 2281, 2302, 2303, 2275, 2274, 2285, 2272, 2241, 2275, 2280, 2297, 2272, 2281, 2303, 3196, 3184, 3184, 3188, 3190, 3194, 2034, 
    2030, 2030, 2026, 2497, 2494, 2465, 2490, 2552, 2539, 2559, 2505, 2557, 2468, 2540, 2533, 2493, 2500, 2509, 2468, 2486, 2502, 2557, 2549, 2504, 2538, 2541, 2549, 2495, 2524, 2542, 2527, 2497, 2528, 2549, 2549, 2502, 2495, 2526, 2491, 2527, 2521, 2553, 2541, 2519, 2498, 2487, 2539, 2525, 2500, 2517, 2492, 2525, 2536, 2520, 2541, 2519, 2527, 2551, 2537, 2555, 2501, 2502, 2510, 2495, 2491, 2556, 2519, 2507, 2486, 2537, 2556, 2552, 2552, 2496, 2550, 2553, 2536, 2554, 2526, 2530, 2519, 2489, 2502, 2499, 2493, 2487, 2502, 2538, 2521, 2523, 2526, 2536, 2482, 2482, 620, 608, 608, 612, 614, 618, 2459, 2434, 2462, 2463, 579, 572, 547, 568, 634, 617, 637, 587, 639, 550, 622, 615, 575, 582, 591, 550, 564, 580, 639, 631, 586, 616, 623, 631, 573, 606, 620, 605, 579, 610, 631, 631, 580, 573, 604, 569, 605, 603, 635, 623, 597, 576, 565, 617, 607, 582, 599, 574, 607, 618, 602, 623, 597, 605, 629, 619, 633, 583, 580, 588, 573, 569, 638, 597, 585, 564, 619, 638, 634, 634, 578, 628, 635, 618, 632, 604, 608, 597, 571, 580, 577, 575, 565, 580, 616, 603, 601, 604, 618, 560, 560, 2046, 2033, 2044, 2030, 2030, 2100, 2105, 2096, 2085, 2079, 2089, 2084, 1552, 1565, 1556, 1537, 1595, 1549, 1536, 563, 574, 567, 546, 536, 558, 547, 857, 852, 861, 840, 882, 836, 841, 2439, 2442, 2435, 2454, 2476, 2458, 2455, 495, 482, 491, 510, 452, 501, 506, 502, 510, 2671, 2632, 2640, 2631, 2634, 2639, 2626, 2566, 2638, 2633, 2635, 2627, 2566, 2629, 2634, 2631, 2645, 2645, 3031, 3059, 3049, 3049, 3059, 3060, 3069, 3002, 3058, 3061, 3063, 3071, 3002, 3065, 3062, 3067, 3049, 3049, 3071, 3049, 589, 593, 604, 580, 600, 591, 638, 594, 595, 585, 600, 595, 585, 2677, 2659, 2663, 2676, 2661, 2670, 2629, 2665, 2664, 2674, 2659, 2664, 2674, 1994, 2012, 2008, 1995, 2010, 2001, 2042, 2006, 2007, 1997, 2012, 2007, 1997};
    public volatile JsonObject a;
    public volatile String b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public long h;
    public long i;
    public final com.github.catvod.spider.merge.p005f.c j = new com.github.catvod.spider.merge.p005f.c();
    public final com.github.catvod.spider.merge.p005f.f k = new com.github.catvod.spider.merge.p005f.f(new com.github.catvod.spider.merge.p005f.e() { // from class: com.github.catvod.spider.Bili.1
        @Override // com.github.catvod.spider.merge.p005f.e
        public long credentialGeneration() {
            return A.j().k();
        }

        public void ensureWbi() {
            Bili.d(false);
        }

        @Override // com.github.catvod.spider.merge.p005f.e
        public void ensureWbi(boolean z) {
            Bili.d(z);
        }

        @Override // com.github.catvod.spider.merge.p005f.e
        public boolean hasWbi() {
            return Bili.g();
        }

        @Override // com.github.catvod.spider.merge.p005f.e
        public Map<String, String> headers() {
            return Bili.f();
        }

        @Override // com.github.catvod.spider.merge.p005f.e
        public String wbiQuery(LinkedHashMap<String, Object> linkedHashMap) {
            return Bili.o(linkedHashMap);
        }
    });
    public final n l = new n(new l() { // from class: com.github.catvod.spider.Bili.2
        @Override // com.github.catvod.spider.merge.p005f.l
        public void clearWbi() {
            Bili.b();
        }

        @Override // com.github.catvod.spider.merge.p005f.l
        public long credentialGeneration() {
            return A.j().k();
        }

        @Override // com.github.catvod.spider.merge.p005f.l
        public void ensureWbi(boolean z) {
            Bili.d(z);
        }

        @Override // com.github.catvod.spider.merge.p005f.l
        public boolean hasWbi() {
            return Bili.g();
        }

        @Override // com.github.catvod.spider.merge.p005f.l
        public Map<String, String> headers() {
            return Bili.f();
        }

        @Override // com.github.catvod.spider.merge.p005f.l
        public String wbiQuery(LinkedHashMap<String, Object> linkedHashMap) {
            return Bili.o(linkedHashMap);
        }
    });
    public final j m;
    public final h n;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws Throwable {
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        Bili bili = this;
        bili.l(true);
        String str4 = bili.b;
        String strM314 = "设置";
        String strM567 = "bili_account";
        String strM558 = "我的";
        String strM31 = "bili_personal";
        if (str4 == null) {
            ArrayList arrayList2 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            com.github.catvod.spider.merge.p005f.c cVar = bili.j;
            boolean z2 = cVar.a == 1;
            String strM32 = "排序";
            String strM386 = "order";
            String strM471 = "3";
            String strM285 = "1";
            String strM286 = "4";
            String strM390 = "0";
            String strM65 = "2";
            if (z2) {
                int i = 0;
                while (true) {
                    bili.n.getClass();
                    if (i >= 6) {
                        break;
                    }
                    bili.n.getClass();
                    String str5 = "pgc_" + h.d[i];
                    String str6 = strM567;
                    bili.n.getClass();
                    arrayList2.add(new com.github.catvod.spider.merge.p001b.b(str5, h.c[i], null));
                    bili.n.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    String str7 = strM286;
                    String str8 = strM471;
                    arrayList3.add(new com.github.catvod.spider.merge.p001b.d(strM386, strM32, Arrays.asList(new com.github.catvod.spider.merge.p001b.c("播放数量", strM65), new com.github.catvod.spider.merge.p001b.c("更新时间", strM390), new com.github.catvod.spider.merge.p001b.c("最高评分", strM286), new com.github.catvod.spider.merge.p001b.c("弹幕数量", strM285), new com.github.catvod.spider.merge.p001b.c("追看人数", strM471), new com.github.catvod.spider.merge.p001b.c("开播时间", "5"), new com.github.catvod.spider.merge.p001b.c("上映时间", "6"))));
                    com.github.catvod.spider.merge.p001b.c cVar2 = new com.github.catvod.spider.merge.p001b.c("全部", "-1");
                    com.github.catvod.spider.merge.p001b.c cVar3 = new com.github.catvod.spider.merge.p001b.c("免费", strM285);
                    String strM382 = "2,6";
                    String strM499 = "付费";
                    arrayList3.add(new com.github.catvod.spider.merge.p001b.d("season_status", strM499, Arrays.asList(cVar2, cVar3, new com.github.catvod.spider.merge.p001b.c(strM499, strM382), new com.github.catvod.spider.merge.p001b.c("大会员", "4,6"))));
                    linkedHashMap.put(str5, arrayList3);
                    i++;
                    bili = this;
                    strM567 = str6;
                    strM558 = strM558;
                    strM31 = strM31;
                    strM65 = strM65;
                    strM390 = strM390;
                    strM286 = str7;
                    strM471 = str8;
                    arrayList2 = arrayList2;
                }
                str = strM567;
                str2 = strM558;
                str3 = strM31;
                arrayList = arrayList2;
            } else {
                String str9 = strM471;
                String str10 = strM286;
                ArrayList arrayList4 = arrayList2;
                str = strM567;
                str2 = strM558;
                str3 = strM31;
                String str11 = strM390;
                cVar.getClass();
                Iterator it = new ArrayList(cVar.d).iterator();
                while (it.hasNext()) {
                    String str12 = (String) it.next();
                    ArrayList arrayList5 = arrayList4;
                    com.github.catvod.spider.merge.D.b.z(str12, str12, null, arrayList5);
                    this.j.getClass();
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(new com.github.catvod.spider.merge.p001b.d(strM386, strM32, Arrays.asList(new com.github.catvod.spider.merge.p001b.c("預設", "totalrank"), new com.github.catvod.spider.merge.p001b.c("最多點擊", "click"), new com.github.catvod.spider.merge.p001b.c("最新發布", "pubdate"), new com.github.catvod.spider.merge.p001b.c("最多彈幕", "dm"), new com.github.catvod.spider.merge.p001b.c("最多收藏", "stow"))));
                    String str13 = str11;
                    String str14 = str10;
                    String str15 = str9;
                    arrayList6.add(new com.github.catvod.spider.merge.p001b.d("duration", "時長", Arrays.asList(new com.github.catvod.spider.merge.p001b.c("全部時長", str13), new com.github.catvod.spider.merge.p001b.c("60分鐘以上", str14), new com.github.catvod.spider.merge.p001b.c("30~60分鐘", str15), new com.github.catvod.spider.merge.p001b.c("10~30分鐘", strM65), new com.github.catvod.spider.merge.p001b.c("10分鐘以下", strM285))));
                    linkedHashMap.put(str12, arrayList6);
                    strM285 = strM285;
                    arrayList4 = arrayList5;
                    str9 = str15;
                    it = it;
                    strM32 = strM32;
                    strM386 = strM386;
                    str11 = str13;
                    str10 = str14;
                }
                arrayList = arrayList4;
            }
            arrayList.add(new com.github.catvod.spider.merge.p001b.b(str3, str2, null));
            com.github.catvod.spider.merge.D.b.z(str, strM314, null, arrayList);
            return com.github.catvod.spider.merge.p001b.g.v(arrayList, linkedHashMap);
        }
        JsonObject jsonObjectC = I0.c(str4);
        String strM249 = "class";
        JsonArray asJsonArray = jsonObjectC.getAsJsonArray(strM249);
        if (asJsonArray == null) {
            return str4;
        }
        JsonArray jsonArray = new JsonArray();
        int i2 = 0;
        while (true) {
            int size = asJsonArray.size();
            String strM83 = "type_id";
            if (i2 >= size) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(strM83, strM31);
                String strM75 = "type_name";
                jsonObject.addProperty(strM75, strM558);
                jsonArray.add(jsonObject);
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty(strM83, strM567);
                jsonObject2.addProperty(strM75, strM314);
                jsonArray.add(jsonObject2);
                jsonObjectC.add(strM249, jsonArray);
                return jsonObjectC.toString();
            }
            JsonObject asJsonObject = asJsonArray.get(i2).getAsJsonObject();
            if (!h(asJsonObject.has(strM83) ? asJsonObject.get(strM83).getAsString() : "")) {
                jsonArray.add(asJsonObject);
            }
            i2++;
        }
    }

    private /* synthetic */ String $host$4a0a5542814a3609() throws Throwable {
        JsonArray asJsonArray;
        l(true);
        try {
            String str = this.b;
            String strM210 = "";
            if (str != null && (asJsonArray = I0.c(str).getAsJsonArray("class")) != null) {
                for (int i = 0; i < asJsonArray.size(); i++) {
                    String asString = asJsonArray.get(i).getAsJsonObject().get("type_id").getAsString();
                    if (!h(asString)) {
                        strM210 = asString;
                        break;
                    }
                }
            }
            if (strM210.isEmpty()) {
                com.github.catvod.spider.merge.p005f.c cVar = this.j;
                if (cVar.a == 1) {
                    this.n.getClass();
                    strM210 = "pgc_" + h.d[0];
                } else {
                    strM210 = "bili_account";
                    ArrayList arrayList = cVar.d;
                    if (!arrayList.isEmpty()) {
                        strM210 = (String) arrayList.get(0);
                    }
                }
            }
            return categoryContent(strM210, "1", true, new HashMap<>());
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.D.b.d();
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) throws Throwable {
        l(false);
        boolean z2 = this.j.a == 1;
        n nVar = this.l;
        if (!z2) {
            return nVar.k(str, str2, "totalrank", "0");
        }
        nVar.j();
        if (System.currentTimeMillis() < nVar.c) {
            return n.i(n.e(nVar.d));
        }
        ArrayList arrayList = new ArrayList();
        if (!nVar.a("media_bangumi", str, str2, arrayList) && !nVar.a("media_ft", str, str2, arrayList)) {
            return n.f(str2, arrayList);
        }
        return n.i(n.e(nVar.d));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws Throwable {
        String strM193;
        l(false);
        AbstractC0280n1.u(str, str2);
        j jVar = this.m;
        jVar.getClass();
        String[] strArrSplit = str2.split("\\+");
        boolean z = strArrSplit.length >= 4 && strArrSplit[0].startsWith("pgc@");
        if ((!z && strArrSplit.length < 2) || (z && strArrSplit.length < 4)) {
            return com.github.catvod.spider.merge.D.b.f("");
        }
        String strSubstring = z ? strArrSplit[0].substring(4) : "";
        String str3 = z ? strArrSplit[1] : strArrSplit[0];
        String str4 = z ? strArrSplit[2] : strArrSplit[1];
        if (z) {
            strM193 = strArrSplit[3];
        } else {
            strM193 = strArrSplit.length > 2 ? strArrSplit[2] : "80";
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || (z && TextUtils.isEmpty(strSubstring))) {
            return com.github.catvod.spider.merge.D.b.f("");
        }
        String url = ProxyOrigin.getUrl();
        if (TextUtils.isEmpty(url)) {
            return com.github.catvod.spider.merge.p001b.g.d("本地代理准备中，请稍后重试");
        }
        if (jVar.a.historySyncEnabled() && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            C0386x c0386xF = A.j().f();
            Map map = c0386xF.a;
            String str5 = "";
            if (map != null) {
                String str6 = (String) map.get("Cookie");
                if (TextUtils.isEmpty(str6)) {
                    str6 = (String) map.get("cookie");
                }
                if (str6 != null) {
                    str5 = str6;
                }
            }
            String strC = j.c(str5, "bili_jct");
            if (!TextUtils.isEmpty(strC) && !TextUtils.isEmpty(j.c(str5, "SESSDATA"))) {
                long j = c0386xF.b;
                String str7 = j + "|" + str3 + "+" + str4;
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap map2 = j.c;
                synchronized (map2) {
                    try {
                        Long l = (Long) map2.get(str7);
                        if (l == null || jCurrentTimeMillis - l.longValue() >= 600000) {
                            map2.put(str7, Long.valueOf(jCurrentTimeMillis));
                            j.d.execute(new V(j, str3, str4, strC, map == null ? new HashMap() : new HashMap(map)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        String strConcat = api("/x/v1/dm/list.so?oid=").concat(str4);
        StringBuilder sb = new StringBuilder();
        sb.append(url);
        sb.append("?do=bili&aid=");
        sb.append(str3);
        sb.append("&cid=");
        sb.append(str4);
        String strN = com.github.catvod.spider.merge.D.b.n(sb, "&qn=", strM193, "&type=mpd");
        if (z) {
            strN = com.github.catvod.spider.merge.D.b.C(strN, "&ep_id=", strSubstring);
        }
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(strN);
        gVar.b(strConcat);
        gVar.c();
        gVar.h(jVar.a.playerHeaders());
        return gVar.r();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0459  */
    /* JADX WARN: Code duplicated, block: B:19:0x00e0  */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strY;
        int i;
        String strA;
        String strS;
        k kVar;
        String strM219;
        String strM70;
        String strM31;
        String strM463;
        k kVar2;
        String str;
        h hVar;
        StringBuilder sb;
        String str2;
        String str3;
        String str4;
        h hVar2;
        int i2 = 3;
        int i3 = 1;
        String str5 = list.get(0);
        if (str5.startsWith("bili_")) {
            AbstractC0302v0.g0(str5, new i(i2, this));
            return "";
        }
        l(false);
        if (!A.j().q() && !A.j().j) {
            InitOrigin.run(new RunnableC0452d(i3));
        }
        if (!str5.startsWith("season_")) {
            j jVar = this.m;
            jVar.getClass();
            synchronized (j.b) {
                try {
                    String[] strArrSplit = str5.split("@", 2);
                    if (strArrSplit.length < 2 || TextUtils.isEmpty(strArrSplit[1])) {
                        strY = com.github.catvod.spider.merge.p001b.g.y(new ArrayList());
                    } else {
                        String str6 = strArrSplit[1];
                        x xVarC = x.c(X1.X(api("/x/web-interface/view?aid=") + str6, null, jVar.a.headers()));
                        if (xVarC == null || xVarC.a() != 0) {
                            strY = com.github.catvod.spider.merge.p001b.g.y(new ArrayList());
                        } else {
                            p pVarB = xVarC.b();
                            if (TextUtils.isEmpty(pVarB.l()) || pVarB.i().isEmpty()) {
                                strY = com.github.catvod.spider.merge.p001b.g.y(new ArrayList());
                            } else {
                                k kVar3 = new k();
                                kVar3.n(str5);
                                kVar3.p(pVarB.j());
                                kVar3.o(pVarB.l());
                                kVar3.i(pVarB.m());
                                kVar3.l(pVarB.c());
                                kVar3.m(pVarB.h().a());
                                kVar3.s((pVarB.d().longValue() / 60) + "分鐘");
                                if (pVarB.i().isEmpty()) {
                                    strA = "";
                                    i = 0;
                                } else {
                                    i = 0;
                                    strA = ((t) pVarB.i().get(0)).a();
                                }
                                h hVarK = jVar.k(str6, strA);
                                if (((ArrayList) hVarK.a).isEmpty()) {
                                    ((ArrayList) hVarK.a).add(80);
                                    ((ArrayList) hVarK.b).add("自动");
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                while (i < ((ArrayList) hVarK.a).size()) {
                                    int iIntValue = ((Integer) ((ArrayList) hVarK.a).get(i)).intValue();
                                    String str7 = (String) ((ArrayList) hVarK.b).get(i);
                                    ArrayList arrayList = new ArrayList();
                                    for (t tVar : pVarB.i()) {
                                        arrayList.add(tVar.b() + "$" + str6 + "+" + tVar.a() + "+" + iIntValue);
                                    }
                                    linkedHashMap.put(str7, TextUtils.join("#", arrayList));
                                    i++;
                                }
                                kVar3.q(TextUtils.join("$$$", linkedHashMap.keySet()));
                                kVar3.r(TextUtils.join("$$$", linkedHashMap.values()));
                                boolean z = FishCrypto.a;
                                N1.d(kVar3);
                                strY = com.github.catvod.spider.merge.p001b.g.s(kVar3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            j(strY);
            return strY;
        }
        h hVar3 = this.n;
        String strSubstring = str5.substring(7);
        hVar3.getClass();
        JsonObject jsonObjectC = I0.c(X1.X(api("/pgc/view/web/season?season_id=") + strSubstring, null, ((com.github.catvod.spider.merge.p005f.g) hVar3.a).headers()));
        String strM529 = "code";
        String str8 = "";
        if (jsonObjectC.has(strM529) && jsonObjectC.get(strM529).getAsInt() == 0) {
            String strM499 = "result";
            if (jsonObjectC.has(strM499)) {
                JsonObject asJsonObject = jsonObjectC.getAsJsonObject(strM499);
                k kVar4 = new k();
                kVar4.n("season_" + strSubstring);
                String strM182 = "title";
                kVar4.o(asJsonObject.get(strM182).getAsString());
                kVar4.p(asJsonObject.get("cover").getAsString());
                String strM1 = "share_sub_title";
                if (asJsonObject.has(strM1)) {
                    kVar4.i(asJsonObject.get(strM1).getAsString());
                }
                String strM210 = "areas";
                if (asJsonObject.has(strM210) && asJsonObject.getAsJsonArray(strM210).size() > 0) {
                    kVar4.k(asJsonObject.getAsJsonArray(strM210).get(0).getAsJsonObject().get("name").getAsString());
                }
                String strM108 = "publish";
                if (asJsonObject.has(strM108)) {
                    JsonObject asJsonObject2 = asJsonObject.getAsJsonObject(strM108);
                    String strM454 = "pub_time";
                    if (asJsonObject2.has(strM454)) {
                        String asString = asJsonObject.getAsJsonObject(strM108).get(strM454).getAsString();
                        if (asString.length() >= 4) {
                            kVar4.u(asString.substring(0, 4));
                        }
                    }
                }
                String strM277 = "new_ep";
                if (asJsonObject.has(strM277)) {
                    JsonObject asJsonObject3 = asJsonObject.getAsJsonObject(strM277);
                    String strM432 = "desc";
                    if (asJsonObject3.has(strM432)) {
                        kVar4.s(asJsonObject.getAsJsonObject(strM277).get(strM432).getAsString());
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                String strM545 = "rating";
                if (asJsonObject.has(strM545)) {
                    sb2.append("评分: ");
                    sb2.append(asJsonObject.getAsJsonObject(strM545).get("score").getAsString());
                    sb2.append("\n");
                }
                String strM558 = "evaluate";
                if (asJsonObject.has(strM558)) {
                    sb2.append(asJsonObject.get(strM558).getAsString());
                }
                kVar4.l(sb2.toString());
                String strM288 = "episodes";
                if (asJsonObject.has(strM288)) {
                    JsonArray asJsonArray = asJsonObject.getAsJsonArray(strM288);
                    String strM109 = "预告";
                    String strM422 = "badge";
                    String strM193 = "long_title";
                    int i4 = 0;
                    while (true) {
                        int size = asJsonArray.size();
                        strM219 = "id";
                        strM70 = "ep_id";
                        strM31 = "cid";
                        strM463 = "aid";
                        if (i4 >= size) {
                            kVar2 = kVar4;
                            str = str8;
                            hVar = new h();
                            break;
                        }
                        try {
                            JsonObject asJsonObject4 = asJsonArray.get(i4).getAsJsonObject();
                            String strA2 = h.a(asJsonObject4, strM463);
                            str = str8;
                            try {
                                String strA3 = h.a(asJsonObject4, strM31);
                                if (!TextUtils.isEmpty(strA2) && !TextUtils.isEmpty(strA3)) {
                                    String strA4 = h.a(asJsonObject4, strM70, strM219);
                                    boolean zIsEmpty = TextUtils.isEmpty(strA4);
                                    kVar2 = kVar4;
                                    j jVar2 = (j) hVar3.b;
                                    if (zIsEmpty) {
                                        hVar2 = hVar3;
                                    } else {
                                        try {
                                            hVar = jVar2.j(strA4, strA2, strA3);
                                            hVar2 = hVar3;
                                            try {
                                                if (!((ArrayList) hVar.a).isEmpty()) {
                                                    break;
                                                }
                                                break;
                                            } catch (Exception unused) {
                                            }
                                        } catch (Exception unused2) {
                                            hVar2 = hVar3;
                                        }
                                    }
                                    if (TextUtils.isEmpty(strA4)) {
                                        hVar = jVar2.k(strA2, strA3);
                                        if (!((ArrayList) hVar.a).isEmpty()) {
                                            break;
                                        }
                                    }
                                } else {
                                    hVar2 = hVar3;
                                    kVar2 = kVar4;
                                }
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            hVar2 = hVar3;
                            kVar2 = kVar4;
                            str = str8;
                        }
                        i4++;
                        str8 = str;
                        kVar4 = kVar2;
                        hVar3 = hVar2;
                    }
                    ArrayList<String[]> arrayList2 = new ArrayList();
                    int i5 = 0;
                    while (i5 < asJsonArray.size()) {
                        try {
                            JsonObject asJsonObject5 = asJsonArray.get(i5).getAsJsonObject();
                            if (asJsonObject5.has(strM31) && asJsonObject5.has(strM463)) {
                                String asString2 = asJsonObject5.has(strM182) ? asJsonObject5.get(strM182).getAsString() : String.valueOf(i5 + 1);
                                String asString3 = asJsonObject5.has(strM193) ? asJsonObject5.get(strM193).getAsString() : str;
                                String asString4 = asJsonObject5.has(strM422) ? asJsonObject5.get(strM422).getAsString() : str;
                                if (asString2.contains(strM109) || asString4.contains(strM109)) {
                                    strM70 = strM70;
                                    str2 = strM31;
                                    str3 = strM182;
                                } else {
                                    str2 = strM31;
                                    try {
                                        String asString5 = asJsonObject5.get(strM31).getAsString();
                                        str3 = strM182;
                                        try {
                                            String asString6 = asJsonObject5.get(strM463).getAsString();
                                            str4 = strM463;
                                            try {
                                                String strA5 = h.a(asJsonObject5, strM70, strM219);
                                                if (TextUtils.isEmpty(asString6) || TextUtils.isEmpty(asString5)) {
                                                    strM70 = strM70;
                                                } else {
                                                    strM70 = strM70;
                                                    try {
                                                        StringBuilder sb3 = new StringBuilder("第");
                                                        sb3.append(asString2);
                                                        sb3.append("话");
                                                        if (!TextUtils.isEmpty(asString3)) {
                                                            sb3.append(" ");
                                                            sb3.append(asString3);
                                                        }
                                                        if (!TextUtils.isEmpty(asString4)) {
                                                            sb3.append("[");
                                                            sb3.append(asString4);
                                                            sb3.append("]");
                                                        }
                                                        arrayList2.add(new String[]{sb3.toString(), asString6, asString5, strA5});
                                                    } catch (Exception unused5) {
                                                    }
                                                }
                                            } catch (Exception unused6) {
                                            }
                                        } catch (Exception unused7) {
                                            strM70 = strM70;
                                            str4 = strM463;
                                        }
                                    } catch (Exception unused8) {
                                        str3 = strM182;
                                    }
                                }
                                str4 = strM463;
                            } else {
                                strM70 = strM70;
                                str2 = strM31;
                                str3 = strM182;
                                str4 = strM463;
                            }
                        } catch (Exception unused9) {
                            str2 = strM31;
                        }
                        i5++;
                        strM463 = str4;
                        strM31 = str2;
                        strM182 = str3;
                        strM70 = strM70;
                    }
                    if (arrayList2.isEmpty()) {
                        kVar = kVar2;
                    } else {
                        ArrayList arrayList3 = (ArrayList) hVar.a;
                        boolean zIsEmpty2 = arrayList3.isEmpty();
                        ArrayList arrayList4 = (ArrayList) hVar.b;
                        if (zIsEmpty2) {
                            arrayList3.add(80);
                            arrayList4.add("自动");
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                            int iIntValue2 = ((Integer) arrayList3.get(i6)).intValue();
                            String str9 = (String) arrayList4.get(i6);
                            ArrayList arrayList5 = new ArrayList();
                            for (String[] strArr : arrayList2) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(strArr[0]);
                                sb4.append("$");
                                String str10 = strArr[3];
                                String str11 = strArr[1];
                                String str12 = strArr[2];
                                String strM408 = "+";
                                if (str10 == null || str10.length() == 0) {
                                    sb = new StringBuilder();
                                    sb.append(str11);
                                    sb.append(strM408);
                                } else {
                                    sb = com.github.catvod.spider.merge.D.b.r("pgc@", str10, strM408, str11, strM408);
                                }
                                sb.append(str12);
                                sb.append(strM408);
                                sb.append(iIntValue2);
                                sb4.append(sb.toString());
                                arrayList5.add(sb4.toString());
                            }
                            linkedHashMap2.put(str9, TextUtils.join("#", arrayList5));
                        }
                        Set setKeySet = linkedHashMap2.keySet();
                        String strM301 = "$$$";
                        kVar = kVar2;
                        kVar.q(TextUtils.join(strM301, setKeySet));
                        kVar.r(TextUtils.join(strM301, linkedHashMap2.values()));
                    }
                } else {
                    kVar = kVar4;
                }
                boolean z2 = FishCrypto.a;
                N1.d(kVar);
                strS = com.github.catvod.spider.merge.p001b.g.s(kVar);
            } else {
                strS = "";
            }
        } else {
            strS = "";
        }
        j(strS);
        return strS;
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        int i = 5;
        int i2 = 2;
        int i3 = 1;
        int i4 = 4;
        int i5 = 3;
        int i6 = 0;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2124535218:
                if (str.equals("bili_clean")) {
                    b = 0;
                }
                break;
            case -2116131986:
                if (str.equals("bili_login")) {
                    b = 1;
                }
                break;
            case -2068834251:
                if (str.equals("bili_low_end")) {
                    b = 2;
                }
                break;
            case -2059020917:
                if (str.equals("bili_category_manage")) {
                    b = 3;
                }
                break;
            case -1409730541:
                if (str.equals("bili_switch_mode")) {
                    b = 4;
                }
                break;
            case -1175576027:
                if (str.equals("bili_logout")) {
                    b = 5;
                }
                break;
            case -1082925559:
                if (str.equals("bili_personal_manage")) {
                    b = 6;
                }
                break;
            case -970728307:
                if (str.equals("bili_status")) {
                    b = 7;
                }
                break;
            case -435768906:
                if (str.equals("bili_personal_visibility")) {
                    b = 8;
                }
                break;
            case 1021889:
                if (str.equals("bili_history_sync")) {
                    b = 9;
                }
                break;
            case 222998990:
                if (str.equals("bili_playback_manage")) {
                    b = 10;
                }
                break;
            case 1308561218:
                if (str.equals("bili_personal_sort")) {
                    b = 11;
                }
                break;
            case 1331274416:
                if (str.equals("bili_reset_manage")) {
                    b = 12;
                }
                break;
            case 1732724380:
                if (str.equals("bili_help")) {
                    b = 13;
                }
                break;
            case 1909471275:
                if (str.equals("bili_personal_reset")) {
                    b = 14;
                }
                break;
        }
        switch (b) {
            case 0:
            case 5:
                InitOrigin.run(new RunnableC0452d(i5));
                break;
            case 1:
                InitOrigin.run(new RunnableC0453e(this, 21));
                break;
            case 2:
                InitOrigin.run(new RunnableC0453e(this, i2));
                break;
            case 3:
                InitOrigin.run(new RunnableC0453e(this, i4));
                break;
            case 4:
                InitOrigin.run(new RunnableC0453e(this, i6));
                break;
            case 6:
                InitOrigin.run(new RunnableC0453e(this, i));
                break;
            case 7:
                InitOrigin.run(new RunnableC0452d(i6));
                break;
            case 8:
                InitOrigin.run(new RunnableC0453e(this, 18));
                break;
            case 9:
                InitOrigin.run(new RunnableC0453e(this, i5));
                break;
            case 10:
                InitOrigin.run(new RunnableC0453e(this, i3));
                break;
            case 11:
                InitOrigin.run(new RunnableC0453e(this, 19));
                break;
            case 12:
                InitOrigin.run(new RunnableC0453e(this, 17));
                break;
            case 13:
                InitOrigin.run(new RunnableC0452d(i4));
                break;
            case 14:
                InitOrigin.run(new RunnableC0453e(this, 20));
                break;
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:155:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:181:0x079f  */
    /* JADX WARN: Code duplicated, block: B:225:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:229:0x08de  */
    /* JADX WARN: Code duplicated, block: B:232:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:234:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:235:0x0911  */
    /* JADX WARN: Code duplicated, block: B:237:0x0917  */
    /* JADX WARN: Code duplicated, block: B:238:0x0929  */
    /* JADX WARN: Code duplicated, block: B:240:0x092f  */
    /* JADX WARN: Code duplicated, block: B:241:0x0941  */
    /* JADX WARN: Code duplicated, block: B:243:0x0947  */
    /* JADX WARN: Code duplicated, block: B:244:0x0959  */
    /* JADX WARN: Code duplicated, block: B:246:0x095f  */
    /* JADX WARN: Code duplicated, block: B:247:0x0972  */
    /* JADX WARN: Code duplicated, block: B:92:0x03fe  */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws Throwable {
        String str3;
        int i;
        int iMax;
        String str4;
        String strX;
        String str5;
        String strH;
        String str6;
        String str7;
        String str8;
        String str9;
        String strM193;
        String strR;
        int i2;
        int iMax2;
        JsonArray jsonArray;
        int iMax3;
        int iMax4;
        String string = str;
        boolean zEquals = "bili_account".equals(string);
        String strM355 = "1";
        if (zEquals || "peizhi".equals(string)) {
            if (!strM355.equals(str2)) {
                return com.github.catvod.spider.merge.D.b.d();
            }
            if (this.b != null) {
                return com.github.catvod.spider.merge.p001b.g.y(Collections.singletonList(new k("bili_status", "登录入口", AbstractC0302v0.h(), A.j().m(), "bili_status")));
            }
            return com.github.catvod.spider.merge.p001b.g.y(a(A.j().m()));
        }
        l(false);
        this.k.getClass();
        String strM10 = "bili_personal";
        boolean zEquals2 = strM10.equals(string);
        String strM382 = "title";
        String strM390 = "cover";
        String strM511 = "2";
        String strM346 = "mid";
        String strM33 = "code";
        String strM391 = "list";
        String strM223 = "data";
        if (!zEquals2 && !com.github.catvod.spider.merge.p005f.f.t(str) && !com.github.catvod.spider.merge.p005f.f.u(str)) {
            this.n.getClass();
            String strM368 = "file";
            String strM34 = "order";
            if (string != null && string.startsWith("pgc_")) {
                h hVar = this.n;
                hVar.getClass();
                String strSubstring = string.substring(4);
                String strM292 = "index_show";
                String strM31 = "season_status";
                String strM360 = "&pagesize=20";
                ArrayList arrayList = new ArrayList();
                try {
                    JsonObject jsonObjectC = I0.c(X1.X(api("/pgc/season/index/result?type=1&season_type=") + strSubstring + "&order=" + (map.containsKey(strM34) ? map.get(strM34) : strM511) + "&season_status=" + (map.containsKey(strM31) ? map.get(strM31) : "-1") + "&page=" + str2 + strM360, null, ((com.github.catvod.spider.merge.p005f.g) hVar.a).headers()));
                    if (jsonObjectC.get(strM33).getAsInt() == 0) {
                        JsonArray asJsonArray = jsonObjectC.getAsJsonObject(strM223).getAsJsonArray(strM391);
                        for (int i3 = 0; i3 < asJsonArray.size(); i3++) {
                            JsonObject asJsonObject = asJsonArray.get(i3).getAsJsonObject();
                            k kVar = new k("season_" + asJsonObject.get("season_id").getAsString(), asJsonObject.get(strM382).getAsString(), asJsonObject.get(strM390).getAsString(), asJsonObject.has(strM292) ? asJsonObject.get(strM292).getAsString() : "");
                            kVar.t(strM368);
                            arrayList.add(kVar);
                        }
                    }
                } catch (Exception unused) {
                }
                try {
                    iMax4 = Math.max(1, Integer.parseInt(str2));
                } catch (Exception unused2) {
                    iMax4 = 1;
                }
                int size = arrayList.size();
                int i4 = size >= 20 ? iMax4 + 1 : iMax4;
                int iMax5 = Math.max(1, ((iMax4 - 1) * 20) + size);
                com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.F(arrayList);
                gVar.o(iMax4, i4, 20, iMax5);
                return gVar.r();
            }
            if (!string.endsWith("/{pg}")) {
                String strM459 = map.containsKey(strM34) ? map.get(strM34) : "totalrank";
                String strM210 = "duration";
                String strM516 = map.containsKey(strM210) ? map.get(strM210) : "0";
                String strM322 = "tid";
                if (map.containsKey(strM322)) {
                    StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(string, " ");
                    sbP.append(map.get(strM322));
                    string = sbP.toString();
                }
                return this.l.k(string, str2, strM459, strM516);
            }
            String str10 = string.split("/")[0];
            int i5 = 0;
            while (i5 < 2) {
                d(i5 > 0);
                if (!g()) {
                    return com.github.catvod.spider.merge.D.b.d();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(strM346, str10);
                linkedHashMap.put("pn", str2);
                JsonObject jsonObjectC2 = I0.c(X1.X(api("/x/space/wbi/arc/search?") + o(linkedHashMap), null, f()));
                int asInt = (!jsonObjectC2.has(strM33) || jsonObjectC2.get(strM33).isJsonNull()) ? 0 : jsonObjectC2.get(strM33).getAsInt();
                if (asInt != -352 && asInt != -403 && asInt != -412) {
                    if (asInt != 0) {
                        return com.github.catvod.spider.merge.D.b.d();
                    }
                    JsonObject asJsonObject2 = (jsonObjectC2.has(strM223) && jsonObjectC2.get(strM223).isJsonObject()) ? jsonObjectC2.getAsJsonObject(strM223) : null;
                    JsonObject asJsonObject3 = (asJsonObject2 != null && asJsonObject2.has(strM391) && asJsonObject2.get(strM391).isJsonObject()) ? asJsonObject2.getAsJsonObject(strM391) : null;
                    if (asJsonObject3 != null) {
                        String strM285 = "vlist";
                        if (asJsonObject3.has(strM285)) {
                            jsonArray = asJsonObject3.getAsJsonArray(strM285);
                        } else {
                            jsonArray = new JsonArray();
                        }
                    } else {
                        jsonArray = new JsonArray();
                    }
                    ArrayList arrayList2 = new ArrayList();
                    List<w> listA = w.a(jsonArray);
                    if (listA != null) {
                        for (w wVar : listA) {
                            if (wVar != null && !TextUtils.isEmpty(wVar.b()) && !TextUtils.isEmpty(wVar.c())) {
                                k kVarF = wVar.f();
                                kVarF.t(strM368);
                                arrayList2.add(kVarF);
                            }
                        }
                    }
                    try {
                        iMax3 = Math.max(1, Integer.parseInt(str2));
                    } catch (Exception unused3) {
                        iMax3 = 1;
                    }
                    int size2 = arrayList2.size();
                    int i6 = size2 >= 20 ? iMax3 + 1 : iMax3;
                    int iMax6 = Math.max(1, ((iMax3 - 1) * 20) + size2);
                    com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
                    gVar2.F(arrayList2);
                    gVar2.o(iMax3, i6, 20, iMax6);
                    return gVar2.r();
                }
                i5++;
            }
            return com.github.catvod.spider.merge.D.b.d();
        }
        String str11 = strM511;
        com.github.catvod.spider.merge.p005f.f fVar = this.k;
        fVar.getClass();
        boolean zEquals3 = strM10.equals(string);
        com.github.catvod.spider.merge.p005f.e eVar = fVar.a;
        String strM175 = "folder";
        String strM286 = "face";
        String strM477 = "&pn=1&ps=1&order=desc&order_type=attention";
        String strM108 = "bp_cinema";
        String strM392 = "bp_bangumi";
        String strM383 = "bp_follow_archives";
        String str12 = strM346;
        String strM32 = "bp_fav";
        String strM473 = "bp_toview";
        String str13 = strM382;
        String strM471 = "bp_history";
        String strM21 = "bili_toview";
        String strM472 = "bili_fav";
        String strM361 = "bili_follow_archives";
        String strM499 = "bili_bangumi_follow";
        String strM219 = "bili_cinema_follow";
        String strM402 = "bili_history";
        String strM169 = "/x/relation/followings?vmid=";
        if (!zEquals3) {
            boolean zT = com.github.catvod.spider.merge.p005f.f.t(str);
            String strM347 = "个人中心菜单不存在";
            String strM416 = "追剧";
            String strM65 = "追番";
            if (!zT) {
                if (strM402.equals(str)) {
                    return fVar.s(str2);
                }
                if (strM21.equals(str)) {
                    return fVar.F(str2);
                }
                if (strM472.equals(str)) {
                    return fVar.g(str2, fVar.j());
                }
                if (!strM361.equals(str)) {
                    if (strM499.equals(str)) {
                        return fVar.b(str2, strM355, strM65);
                    }
                    return strM219.equals(str) ? fVar.b(str2, str11, strM416) : com.github.catvod.spider.merge.p005f.f.D(com.github.catvod.spider.merge.p005f.f.d(strM347));
                }
                try {
                    long jN = A.j().n();
                    if (jN > 0) {
                        JsonArray jsonArrayN = com.github.catvod.spider.merge.p005f.f.n(com.github.catvod.spider.merge.p005f.f.q(I0.c(X1.X(api(strM169) + jN + strM477, null, eVar.headers())), strM223), strM391);
                        strR = jsonArrayN.size() == 0 ? "" : com.github.catvod.spider.merge.p005f.f.r(jsonArrayN.get(0).getAsJsonObject(), str12);
                    }
                } catch (Exception unused4) {
                }
                return fVar.l(str2, strR);
            }
            if (strM471.equals(str)) {
                return fVar.s(str2);
            }
            if (strM473.equals(str)) {
                return fVar.F(str2);
            }
            boolean zEquals4 = strM32.equals(str);
            String strM512 = "bp_fav_";
            String strM194 = "账号信息未刷新，请重新打开 B站账号页";
            if (zEquals4) {
                try {
                    i2 = 1;
                    try {
                        iMax2 = Math.max(1, Integer.parseInt(str2));
                    } catch (Exception unused5) {
                        iMax2 = 1;
                    }
                } catch (Exception unused6) {
                    i2 = 1;
                }
                if (!(iMax2 <= i2)) {
                    return com.github.catvod.spider.merge.p005f.f.y(str2, new ArrayList(), false);
                }
                String strM513 = "收藏夹读取失败";
                if (!A.j().q()) {
                    return com.github.catvod.spider.merge.p005f.f.D(com.github.catvod.spider.merge.p005f.f.v("登录后查看 B站收藏"));
                }
                try {
                    long jN2 = A.j().n();
                    if (jN2 <= 0) {
                        return com.github.catvod.spider.merge.p005f.f.D(com.github.catvod.spider.merge.p005f.f.v(strM194));
                    }
                    JsonObject jsonObjectC3 = I0.c(X1.X(api("/x/v3/fav/folder/created/list-all?up_mid=") + jN2, null, eVar.headers()));
                    if (com.github.catvod.spider.merge.p005f.f.o(jsonObjectC3, strM33) != 0) {
                        return com.github.catvod.spider.merge.p005f.f.D(com.github.catvod.spider.merge.p005f.f.e(jsonObjectC3, strM513));
                    }
                    JsonArray jsonArrayN2 = com.github.catvod.spider.merge.p005f.f.n(com.github.catvod.spider.merge.p005f.f.q(jsonObjectC3, strM223), strM391);
                    ArrayList arrayList3 = new ArrayList();
                    int i7 = 0;
                    while (i7 < jsonArrayN2.size()) {
                        JsonObject asJsonObject4 = jsonArrayN2.get(i7).getAsJsonObject();
                        String strR2 = com.github.catvod.spider.merge.p005f.f.r(asJsonObject4, "id");
                        String str14 = str13;
                        String strR3 = com.github.catvod.spider.merge.p005f.f.r(asJsonObject4, str14);
                        if (!TextUtils.isEmpty(strR2) && !TextUtils.isEmpty(strR3)) {
                            k kVar2 = new k(strM512 + strR2, strR3, fVar.h(strR2), com.github.catvod.spider.merge.p005f.f.o(asJsonObject4, "media_count") + " 个视频", com.github.catvod.spider.merge.p001b.i.a(0.7f));
                            kVar2.t(strM175);
                            arrayList3.add(kVar2);
                        }
                        i7++;
                        str13 = str14;
                    }
                    if (arrayList3.isEmpty()) {
                        arrayList3 = com.github.catvod.spider.merge.p005f.f.d("暂无收藏夹");
                    }
                    return com.github.catvod.spider.merge.p005f.f.D(arrayList3);
                } catch (Exception unused7) {
                    return com.github.catvod.spider.merge.p005f.f.D(com.github.catvod.spider.merge.p005f.f.f(strM513));
                }
            }
            if (str.startsWith(strM512)) {
                return fVar.g(str2, str.substring(7));
            }
            boolean zEquals5 = strM383.equals(str);
            String strM22 = "bp_up_";
            if (!zEquals5) {
                if (str.startsWith(strM22)) {
                    return fVar.l(str2, str.substring(6));
                }
                if (strM392.equals(str)) {
                    return fVar.b(str2, strM355, strM65);
                }
                return strM108.equals(str) ? fVar.b(str2, str11, strM416) : com.github.catvod.spider.merge.p005f.f.D(com.github.catvod.spider.merge.p005f.f.d(strM347));
            }
            String strM35 = "关注 UP 读取失败";
            String strM199 = "&ps=20&order=desc&order_type=attention";
            if (!A.j().q()) {
                return com.github.catvod.spider.merge.p005f.f.D(com.github.catvod.spider.merge.p005f.f.v("登录后查看关注投稿"));
            }
            try {
                long jN3 = A.j().n();
                if (jN3 <= 0) {
                    return com.github.catvod.spider.merge.p005f.f.D(com.github.catvod.spider.merge.p005f.f.v(strM194));
                }
                JsonObject jsonObjectC4 = I0.c(X1.X(api(strM169) + jN3 + "&pn=" + str2 + strM199, null, eVar.headers()));
                if (com.github.catvod.spider.merge.p005f.f.o(jsonObjectC4, strM33) != 0) {
                    return com.github.catvod.spider.merge.p005f.f.D(com.github.catvod.spider.merge.p005f.f.e(jsonObjectC4, strM35));
                }
                JsonArray jsonArrayN3 = com.github.catvod.spider.merge.p005f.f.n(com.github.catvod.spider.merge.p005f.f.q(jsonObjectC4, strM223), strM391);
                ArrayList arrayList4 = new ArrayList();
                int i8 = 0;
                while (i8 < jsonArrayN3.size()) {
                    JsonObject asJsonObject5 = jsonArrayN3.get(i8).getAsJsonObject();
                    String str15 = str12;
                    String strR4 = com.github.catvod.spider.merge.p005f.f.r(asJsonObject5, str15);
                    String strR5 = com.github.catvod.spider.merge.p005f.f.r(asJsonObject5, "uname");
                    if (!TextUtils.isEmpty(strR4) && !TextUtils.isEmpty(strR5)) {
                        k kVar3 = new k(strM22 + strR4, strR5, com.github.catvod.spider.merge.p005f.f.x(com.github.catvod.spider.merge.p005f.f.r(asJsonObject5, strM286)), com.github.catvod.spider.merge.p005f.f.k(com.github.catvod.spider.merge.p005f.f.r(asJsonObject5, "sign"), "查看投稿"), com.github.catvod.spider.merge.p001b.i.a(0.7f));
                        kVar3.t(strM175);
                        arrayList4.add(kVar3);
                    }
                    i8++;
                    str12 = str15;
                }
                return com.github.catvod.spider.merge.p005f.f.c(str2, "暂无关注 UP", arrayList4);
            } catch (Exception unused8) {
                return com.github.catvod.spider.merge.p005f.f.D(com.github.catvod.spider.merge.p005f.f.f(strM35));
            }
        }
        try {
            str3 = strM175;
            i = 1;
            try {
                iMax = Math.max(1, Integer.parseInt(str2));
            } catch (Exception unused9) {
                iMax = 1;
            }
        } catch (Exception unused10) {
            str3 = strM175;
            i = 1;
        }
        if (!(iMax <= i)) {
            return com.github.catvod.spider.merge.p005f.f.y(str2, new ArrayList(), false);
        }
        if (!A.j().q()) {
            return com.github.catvod.spider.merge.p005f.f.D(com.github.catvod.spider.merge.p005f.f.v("登录后查看 B站个人内容"));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it = fVar.b.iterator();
        while (it.hasNext()) {
            it = it;
            String str16 = (String) it.next();
            if (com.github.catvod.spider.merge.p005f.f.u(str16)) {
                ArrayList arrayList6 = arrayList5;
                if (strM402.equals(str16)) {
                    str4 = strM471;
                } else if (strM21.equals(str16)) {
                    str4 = strM473;
                } else if (strM472.equals(str16)) {
                    str4 = strM32;
                } else if (strM361.equals(str16)) {
                    str4 = strM383;
                } else if (strM499.equals(str16)) {
                    str4 = strM392;
                } else if (strM219.equals(str16)) {
                    str4 = strM108;
                } else {
                    str4 = strM471;
                }
                String strW = com.github.catvod.spider.merge.p005f.f.w(str16);
                StringBuilder sb = new StringBuilder();
                String str17 = strM219;
                StringBuilder sb2 = new StringBuilder();
                String str18 = strM355;
                String str19 = strM286;
                String str20 = strM477;
                sb2.append(fVar.a.credentialGeneration());
                sb2.append(":");
                sb.append(sb2.toString());
                sb.append("module:");
                sb.append(str16);
                String string2 = sb.toString();
                HashMap map2 = fVar.c;
                String str21 = (String) map2.get(string2);
                if (TextUtils.isEmpty(str21)) {
                    if (strM402.equals(str16)) {
                        try {
                            JsonArray jsonArrayN4 = com.github.catvod.spider.merge.p005f.f.n(com.github.catvod.spider.merge.p005f.f.q(I0.c(X1.X(api("/x/web-interface/history/cursor?ps=1&type=archive"), null, eVar.headers())), strM223), strM391);
                            if (jsonArrayN4.size() > 0) {
                                strX = com.github.catvod.spider.merge.p005f.f.x(com.github.catvod.spider.merge.p005f.f.r(jsonArrayN4.get(0).getAsJsonObject(), strM390));
                            } else {
                                strX = "";
                            }
                        } catch (Exception unused11) {
                        }
                        str5 = strM390;
                        strM286 = str19;
                        strH = strX;
                        str6 = str18;
                    } else {
                        if (strM21.equals(str16)) {
                            try {
                                JsonArray jsonArrayN5 = com.github.catvod.spider.merge.p005f.f.n(com.github.catvod.spider.merge.p005f.f.q(I0.c(X1.X(api("/x/v2/history/toview?pn=1&ps=1"), null, eVar.headers())), strM223), strM391);
                                if (jsonArrayN5.size() > 0) {
                                    strX = com.github.catvod.spider.merge.p005f.f.x(com.github.catvod.spider.merge.p005f.f.r(jsonArrayN5.get(0).getAsJsonObject(), "pic"));
                                } else {
                                    strX = "";
                                }
                            } catch (Exception unused12) {
                            }
                        } else if (strM472.equals(str16)) {
                            strX = fVar.h(fVar.j());
                        } else if (strM361.equals(str16)) {
                            try {
                                long jN4 = A.j().n();
                                if (jN4 <= 0) {
                                    str5 = strM390;
                                    strX = "";
                                    strM286 = str19;
                                    str9 = str20;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    str5 = strM390;
                                    try {
                                        sb3.append(api(strM169));
                                        sb3.append(jN4);
                                        str9 = str20;
                                        try {
                                            sb3.append(str9);
                                            JsonArray jsonArrayN6 = com.github.catvod.spider.merge.p005f.f.n(com.github.catvod.spider.merge.p005f.f.q(I0.c(X1.X(sb3.toString(), null, eVar.headers())), strM223), strM391);
                                            if (jsonArrayN6.size() > 0) {
                                                strM286 = str19;
                                                try {
                                                    strX = com.github.catvod.spider.merge.p005f.f.x(com.github.catvod.spider.merge.p005f.f.r(jsonArrayN6.get(0).getAsJsonObject(), strM286));
                                                } catch (Exception unused13) {
                                                    strX = "";
                                                }
                                            } else {
                                                strM286 = str19;
                                                strX = "";
                                            }
                                        } catch (Exception unused14) {
                                            strM286 = str19;
                                        }
                                    } catch (Exception unused15) {
                                        strM286 = str19;
                                        str9 = str20;
                                        strX = "";
                                        str20 = str9;
                                        strH = strX;
                                        str6 = str18;
                                        if (TextUtils.isEmpty(strH)) {
                                            strH = AbstractC0302v0.h();
                                        }
                                        str7 = str11;
                                        str8 = strH;
                                        map2.put(string2, str8);
                                        if (strM402.equals(str16)) {
                                            strM193 = "观看记录";
                                        } else if (strM21.equals(str16)) {
                                            strM193 = "稍后再看";
                                        } else if (strM472.equals(str16)) {
                                            strM193 = "收藏夹";
                                        } else if (strM361.equals(str16)) {
                                            strM193 = "按 UP 主浏览投稿";
                                        } else if (strM499.equals(str16)) {
                                            strM193 = "已追番剧";
                                        } else {
                                            if (str17.equals(str16)) {
                                                strM193 = "已追影视";
                                            } else {
                                                strM193 = "";
                                            }
                                            k kVar4 = new k(str4, strW, str8, strM193);
                                            kVar4.t(str3);
                                            arrayList6.add(kVar4);
                                            arrayList5 = arrayList6;
                                            strM355 = str6;
                                            strM219 = str17;
                                            strM499 = strM499;
                                            str11 = str7;
                                            strM477 = str20;
                                            strM390 = str5;
                                        }
                                        k kVar5 = new k(str4, strW, str8, strM193);
                                        kVar5.t(str3);
                                        arrayList6.add(kVar5);
                                        arrayList5 = arrayList6;
                                        strM355 = str6;
                                        strM219 = str17;
                                        strM499 = strM499;
                                        str11 = str7;
                                        strM477 = str20;
                                        strM390 = str5;
                                    }
                                }
                            } catch (Exception unused16) {
                                str5 = strM390;
                            }
                            str20 = str9;
                            strH = strX;
                            str6 = str18;
                        } else {
                            str5 = strM390;
                            strM286 = str19;
                            if (strM499.equals(str16)) {
                                str6 = str18;
                                str20 = str20;
                                str11 = str11;
                                strH = fVar.i(str6);
                                str17 = str17;
                            } else {
                                str17 = str17;
                                str6 = str18;
                                str11 = str11;
                                if (str17.equals(str16)) {
                                    str20 = str20;
                                    strH = fVar.i(str11);
                                } else {
                                    str20 = str20;
                                    strH = "";
                                }
                            }
                        }
                        str5 = strM390;
                        strM286 = str19;
                        strH = strX;
                        str6 = str18;
                    }
                    if (TextUtils.isEmpty(strH)) {
                        strH = AbstractC0302v0.h();
                    }
                    str7 = str11;
                    str8 = strH;
                    map2.put(string2, str8);
                } else {
                    str5 = strM390;
                    str17 = str17;
                    strM286 = str19;
                    str8 = str21;
                    str7 = str11;
                    str6 = str18;
                }
                if (strM402.equals(str16)) {
                    strM193 = "观看记录";
                } else if (strM21.equals(str16)) {
                    strM193 = "稍后再看";
                } else if (strM472.equals(str16)) {
                    strM193 = "收藏夹";
                } else if (strM361.equals(str16)) {
                    strM193 = "按 UP 主浏览投稿";
                } else if (strM499.equals(str16)) {
                    strM193 = "已追番剧";
                } else {
                    if (str17.equals(str16)) {
                        strM193 = "已追影视";
                    } else {
                        strM193 = "";
                    }
                    k kVar6 = new k(str4, strW, str8, strM193);
                    kVar6.t(str3);
                    arrayList6.add(kVar6);
                    arrayList5 = arrayList6;
                    strM355 = str6;
                    strM219 = str17;
                    strM499 = strM499;
                    str11 = str7;
                    strM477 = str20;
                    strM390 = str5;
                }
                k kVar7 = new k(str4, strW, str8, strM193);
                kVar7.t(str3);
                arrayList6.add(kVar7);
                arrayList5 = arrayList6;
                strM355 = str6;
                strM219 = str17;
                strM499 = strM499;
                str11 = str7;
                strM477 = str20;
                strM390 = str5;
            }
        }
        ArrayList arrayList7 = arrayList5;
        return com.github.catvod.spider.merge.p005f.f.D(arrayList7.isEmpty() ? com.github.catvod.spider.merge.p005f.f.d("个人中心模块未启用") : arrayList7);
    }

    public Bili() {
        j jVar = new j(new com.github.catvod.spider.merge.p005f.i() { // from class: com.github.catvod.spider.Bili.3

            /* JADX INFO: renamed from: short, reason: not valid java name */
            private static final short[] f19short = {2000, 2038, 2016, 2039, 1960, 1988, 2018, 2016, 2027, 2033, 2027, 1993, 2012, 1999, 1994, 1994, 1991, 1929, 1939, 1928, 1942, 1926, 1934, 2033, 1999, 1992, 1986, 1993, 2001, 2005, 1926, 2024, 2034, 1926, 1943, 1942, 1928, 1942, 1949, 1926, 2033, 1999, 1992, 1936, 1938, 1949, 1926, 2014, 1936, 1938, 1935, 1926, 2023, 2006, 2006, 1994, 1987, 2033, 1987, 1988, 2029, 1999, 2002, 1929, 1939, 1941, 1937, 1928, 1941, 1936, 1926, 1934, 2029, 2030, 2034, 2027, 2026, 1930, 1926, 1994, 1999, 1997, 1987, 1926, 2017, 1987, 1989, 1997, 1993, 1935, 1926, 2021, 1998, 2004, 1993, 1995, 1987, 1929, 1943, 1940, 1940, 1928, 1942, 1928, 1942, 1928, 1942, 1926, 2037, 1991, 1984, 1991, 2004, 1999, 1929, 1939, 1941, 1937, 1928, 1941, 1936, 832, 887, 884, 887, 864, 887, 864, 716, 720, 720, 724, 727, 670, 651, 651, 723, 723, 723, 650, 710, 717, 712, 717, 710, 717, 712, 717, 650, 711, 715, 713};

            @Override // com.github.catvod.spider.merge.p005f.i
            public Map<String, String> headers() {
                return Bili.f();
            }

            @Override // com.github.catvod.spider.merge.p005f.i
            public boolean historySyncEnabled() {
                return Bili.this.j.c;
            }

            @Override // com.github.catvod.spider.merge.p005f.i
            public boolean lowEndMode() {
                return Bili.this.j.b;
            }

            @Override // com.github.catvod.spider.merge.p005f.i
            public Map<String, String> playerHeaders() {
                return com.github.catvod.spider.merge.D.b.t("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36", "Referer", "https://www.bilibili.com");
            }
        });
        this.m = jVar;
        this.n = new h(new com.github.catvod.spider.merge.p005f.g() { // from class: com.github.catvod.spider.Bili.4
            @Override // com.github.catvod.spider.merge.p005f.g
            public Map<String, String> headers() {
                return Bili.f();
            }
        }, jVar);
    }

    public static String api(String str) {
        return FishCrypto.v("N1.laav8THtc8cqG7iv7WuvPapFUT6Un+Ht2AiLbDMgdzrzG8C4UkXFgOyXuXFeZ2IoKxmn1jiGCA9uZxl/0dZHHBfQKJJS3ayOoorR3LUyvOE=") + str;
    }

    public static synchronized void b() {
        q++;
        o = null;
        r = 0L;
    }

    public static String c(JsonObject jsonObject, String str) {
        return (jsonObject != null && jsonObject.has(str) && jsonObject.get(str).isJsonPrimitive() && jsonObject.getAsJsonPrimitive(str).isString()) ? jsonObject.get(str).getAsString().trim() : "";
    }

    public static List<k> configItems() {
        Bili biliN = n();
        biliN.getClass();
        return biliN.a(A.j().m());
    }

    public static void d(boolean z) {
        synchronized (Bili.class) {
            while (p) {
                try {
                    Bili.class.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            if (z || !g() || System.currentTimeMillis() - r >= 21600000) {
                long j = q;
                p = true;
                try {
                    A aJ = A.j();
                    aJ.F();
                    C0386x c0386xF = aJ.f();
                    p pVarB = x.c(X1.X(api("/x/web-interface/nav"), null, c0386xF.a)).b();
                    if (pVarB != null) {
                        z zVarQ = pVarB.q();
                        if (!zVarQ.a().isEmpty() && !zVarQ.b().isEmpty()) {
                            synchronized (Bili.class) {
                                try {
                                    if (j == q && c0386xF.b == aJ.k() && !Thread.currentThread().isInterrupted()) {
                                        o = zVarQ;
                                        r = System.currentTimeMillis();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                    synchronized (Bili.class) {
                        p = false;
                        Bili.class.notifyAll();
                    }
                } catch (Exception unused2) {
                    synchronized (Bili.class) {
                        p = false;
                        Bili.class.notifyAll();
                    }
                } catch (Throwable th2) {
                    synchronized (Bili.class) {
                        p = false;
                        Bili.class.notifyAll();
                        throw th2;
                    }
                }
            }
        }
    }

    public static boolean dispatchConfigAction(String str) {
        if (str == null || !str.startsWith("bili_")) {
            return false;
        }
        n().action(str);
        return true;
    }

    public static String e(long j, String str) throws IOException {
        long millis = TimeUnit.NANOSECONDS.toMillis(j - System.nanoTime());
        if (millis <= 0 || Thread.currentThread().isInterrupted()) {
            throw new IOException("Source init cancelled or timed out");
        }
        Response responseJ = X1.J(new Request.Builder().url(str).build(), millis);
        if (responseJ != null) {
            try {
                if (responseJ.isSuccessful() && responseJ.body() != null) {
                    String strString = responseJ.body().string();
                    responseJ.close();
                    return strString;
                }
            } catch (Throwable th) {
                if (responseJ != null) {
                    try {
                        responseJ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Source init request failed");
    }

    public static HashMap f() {
        return A.l(A.j().b());
    }

    public static boolean g() {
        z zVar = o;
        return (zVar == null || zVar.a().isEmpty() || zVar.b().isEmpty()) ? false : true;
    }

    public static boolean h(String str) {
        return "bili_account".equals(str) || "peizhi".equals(str) || "bili_personal".equals(str) || com.github.catvod.spider.merge.p005f.f.u(str);
    }

    public static void j(String str) {
        try {
            List listG = ((com.github.catvod.spider.merge.p001b.g) new Gson().fromJson(str, com.github.catvod.spider.merge.p001b.g.class)).g();
            if (listG == null || listG.isEmpty()) {
                return;
            }
            AbstractC0280n1.o((k) listG.get(0));
        } catch (Exception unused) {
        }
    }

    public static Object[] localProxy(Map<String, String> map) {
        Object[] objArrD;
        String strM516 = "Bili proxy error: ";
        String strM368 = "Bili proxy: ";
        synchronized (j.b) {
            try {
                if (map == null) {
                    objArrD = j.d(400, "Bili proxy: missing parameters");
                } else {
                    C0386x c0386xF = A.j().f();
                    String str = map.get("cid");
                    String strM199 = map.get("qn");
                    String str2 = map.get("aid");
                    String str3 = TextUtils.isEmpty(map.get("ep_id")) ? map.get("epid") : map.get("ep_id");
                    if (TextUtils.isEmpty(strM199)) {
                        strM199 = "80";
                    }
                    if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                        objArrD = j.d(400, "Bili proxy: missing aid/cid");
                    } else {
                        boolean z = !TextUtils.isEmpty(str3);
                        N nI = j.i(z ? pgcPlayerApi(str3, str2, str, strM199, c0386xF) : playerApi(str2, str, strM199, c0386xF), z);
                        int i = 401;
                        if (A.j().k() != c0386xF.b) {
                            objArrD = (nI == null || nI.a != -101) ? j.d(409, "Bili proxy: account changed, retry playback") : j.d(401, "Bili proxy: login expired");
                        } else if (nI == null) {
                            objArrD = j.d(502, "Bili proxy: invalid JSON response");
                        } else {
                            int i2 = nI.a;
                            if (i2 != 0) {
                                if (i2 != -101) {
                                    i = (i2 == -403 || i2 == -412 || i2 == -352 || i2 == -10403) ? 403 : 502;
                                }
                                objArrD = j.d(i, strM368 + ((String) nI.b));
                            } else {
                                o oVar = (o) nI.c;
                                if (oVar == null) {
                                    objArrD = j.d(502, "Bili proxy: DASH data unavailable");
                                } else {
                                    String strL = j.l(oVar, strM199);
                                    objArrD = TextUtils.isEmpty(strL) ? j.d(502, "Bili proxy: no playable video representation") : new Object[]{200, "application/dash+xml", new ByteArrayInputStream(strL.getBytes("UTF-8"))};
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                objArrD = j.d(502, strM516 + e.getMessage());
            }
        }
        return objArrD;
    }

    public static Bili n() {
        Bili bili;
        Bili bili2 = s;
        if (bili2 != null) {
            return bili2;
        }
        synchronized (Bili.class) {
            if (s == null) {
                Bili bili3 = new Bili();
                try {
                    bili3.init(InitOrigin.context(), "");
                } catch (Exception unused) {
                    bili3.i();
                    s = bili3;
                }
                bili = s;
            } else {
                bili = s;
            }
            throw th;
        }
        return bili;
    }

    public static String o(LinkedHashMap linkedHashMap) {
        String strReplace;
        z zVar = o;
        if (zVar == null) {
            return "";
        }
        String lastPathSegment = Uri.parse(zVar.a()).getLastPathSegment();
        String lastPathSegment2 = Uri.parse(zVar.b()).getLastPathSegment();
        String strM427 = "\\.";
        String strM360 = ".";
        if (lastPathSegment != null && lastPathSegment.contains(strM360)) {
            lastPathSegment = lastPathSegment.split(strM427)[0];
        } else if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        if (lastPathSegment2 != null && lastPathSegment2.contains(strM360)) {
            lastPathSegment2 = lastPathSegment2.split(strM427)[0];
        } else if (lastPathSegment2 == null) {
            lastPathSegment2 = "";
        }
        String strI = com.github.catvod.spider.merge.D.b.i(lastPathSegment, lastPathSegment2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(strI.charAt(zVar.a[i]));
        }
        String string = sb.toString();
        linkedHashMap.put("wts", Long.valueOf(System.currentTimeMillis() / 1000));
        TreeMap treeMap = new TreeMap(linkedHashMap);
        StringBuilder sb2 = new StringBuilder();
        for (String str : treeMap.keySet()) {
            String strReplaceAll = treeMap.get(str).toString().replaceAll("[!'()\\*]", "");
            sb2.append(str);
            sb2.append("=");
            String strM422 = "~";
            String strM75 = "%7E";
            String strM355 = "%20";
            String strM499 = "+";
            try {
                strReplace = URLEncoder.encode(strReplaceAll, "UTF-8").replace(strM499, strM355).replace(strM75, strM422);
            } catch (Exception unused) {
                strReplace = URLEncoder.encode(strReplaceAll).replace(strM499, strM355).replace(strM75, strM422);
            }
            sb2.append(strReplace);
            sb2.append("&");
        }
        String strO = AbstractC0309x1.o(sb2.toString());
        return com.github.catvod.spider.merge.D.b.C(strO, "&w_rid=", AbstractC0309x1.a(strO + string));
    }

    public static synchronized void onCredentialChanged() {
        b();
        j.b();
    }

    public static String pgcPlayerApi(String str, String str2, String str3, String str4, C0386x c0386x) throws Throwable {
        String strM193 = str4;
        if (TextUtils.isEmpty(strM193)) {
            strM193 = "80";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(api("/pgc/player/web/playurl?ep_id="));
        sb.append(str);
        sb.append("&avid=");
        sb.append(str2);
        com.github.catvod.spider.merge.D.b.A(sb, "&cid=", str3, "&qn=", strM193);
        sb.append("&fnver=0&fnval=4048&fourk=1");
        String string = sb.toString();
        A aJ = A.j();
        long j = c0386x.b;
        String strX = X1.X(string, null, c0386x.a);
        try {
            x xVarC = x.c(strX);
            if (xVarC != null && xVarC.a() == -101) {
                aJ.v(j);
            }
        } catch (Exception unused) {
        }
        return strX;
    }

    public static String playerApi(String str, String str2, String str3, C0386x c0386x) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append(api("/x/player/playurl?avid="));
        sb.append(str);
        sb.append("&cid=");
        sb.append(str2);
        String strN = com.github.catvod.spider.merge.D.b.n(sb, "&qn=", str3, "&fnval=4048&fourk=1");
        A aJ = A.j();
        long j = c0386x.b;
        boolean z = c0386x.c;
        Map map = c0386x.a;
        if (!z) {
            return X1.X(strN, null, map);
        }
        int i = 0;
        while (i < 2) {
            try {
                d(i > 0);
                if (!g()) {
                    break;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("avid", str);
                linkedHashMap.put("cid", str2);
                linkedHashMap.put("qn", str3);
                linkedHashMap.put("fnval", 4048);
                linkedHashMap.put("fourk", 1);
                String strX = X1.X(api("/x/player/wbi/playurl?") + o(linkedHashMap), null, map);
                x xVarC = x.c(strX);
                if (xVarC != null && xVarC.a() == 0) {
                    return strX;
                }
                if (xVarC != null && xVarC.a() == -101) {
                    aJ.v(j);
                    return strX;
                }
                if (xVarC == null || (xVarC.a() != -352 && xVarC.a() != -403 && xVarC.a() != -412)) {
                    break;
                    break;
                }
                b();
                i++;
            } catch (Exception unused) {
            }
        }
        String strX2 = X1.X(strN, null, map);
        try {
            x xVarC2 = x.c(strX2);
            if (xVarC2 != null && xVarC2.a() == -101) {
                aJ.v(j);
            }
        } catch (Exception unused2) {
        }
        return strX2;
    }

    public final ArrayList a(String str) {
        String string;
        String strM285 = str;
        ArrayList arrayList = new ArrayList();
        String strH = AbstractC0302v0.h();
        if (TextUtils.isEmpty(strM285)) {
            strM285 = "未登录";
        }
        arrayList.add(new k("bili_status", "当前状态", strH, strM285, "bili_status"));
        arrayList.add(new k("bili_login", "账户管理", AbstractC0302v0.y0(), "扫码登录或手动输入Cookie", "bili_login"));
        String strV1 = AbstractC0302v0.v1();
        com.github.catvod.spider.merge.p005f.c cVar = this.j;
        arrayList.add(new k("bili_switch_mode", "切换模式", strV1, "当前: ".concat(cVar.a == 1 ? "观影模式" : "搜索模式"), "bili_switch_mode"));
        String strM = com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "quality0.jpg");
        StringBuilder sb = new StringBuilder("渣机 ");
        boolean z = cVar.b;
        String strM471 = "已关闭";
        String strM529 = "已开启";
        sb.append(z ? strM529 : strM471);
        sb.append(" · 历史 ");
        if (cVar.c) {
            strM471 = strM529;
        }
        sb.append(strM471);
        arrayList.add(new k("bili_playback_manage", "播放设置", strM, sb.toString(), "bili_playback_manage"));
        String strH1 = AbstractC0302v0.H1();
        ArrayList arrayList2 = cVar.d;
        if (arrayList2.isEmpty()) {
            string = "未设置";
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < Math.min(arrayList2.size(), 4); i++) {
                if (i > 0) {
                    sb2.append(">");
                }
                sb2.append((String) arrayList2.get(i));
            }
            if (arrayList2.size() > 4) {
                sb2.append("...");
            }
            string = sb2.toString();
        }
        arrayList.add(new k("bili_category_manage", "分类管理", strH1, string, "bili_category_manage"));
        arrayList.add(new k("bili_personal_manage", "个人中心管理", AbstractC0302v0.H1(), this.k.E(), "bili_personal_manage"));
        arrayList.add(new k("bili_reset_manage", "重置设置", AbstractC0302v0.v1(), "分类和个人中心恢复默认", "bili_reset_manage"));
        arrayList.add(new k("bili_help", "登录帮助", AbstractC0302v0.a0(), "查看B站登录和播放说明", "bili_help"));
        arrayList.add(new k("bili_clean", "清除账号", AbstractC0302v0.o(), "清除本地B站登录信息", "bili_clean"));
        return arrayList;
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

    public final void i() throws Throwable {
        A.j().r();
        JsonObject jsonObjectC = null;
        try {
            String strM358 = ".bilibili_cookie";
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(strM358);
            if (!strH.isEmpty()) {
                jsonObjectC = I0.c(strH);
            }
        } catch (Exception unused) {
        }
        String strM414 = "categories";
        String strM486 = "historySyncEnabled";
        String strM379 = "lowEndMode";
        String strM408 = "viewMode";
        com.github.catvod.spider.merge.p005f.c cVar = this.j;
        ArrayList arrayList = cVar.d;
        arrayList.clear();
        if (jsonObjectC != null) {
            try {
                cVar.a = jsonObjectC.has(strM408) ? jsonObjectC.get(strM408).getAsInt() : 1;
                cVar.b = jsonObjectC.has(strM379) && jsonObjectC.get(strM379).getAsBoolean();
                cVar.c = jsonObjectC.has(strM486) && jsonObjectC.get(strM486).getAsBoolean();
                if (jsonObjectC.has(strM414)) {
                    JsonArray asJsonArray = jsonObjectC.getAsJsonArray(strM414);
                    for (int i = 0; i < asJsonArray.size(); i++) {
                        arrayList.add(asJsonArray.get(i).getAsString());
                    }
                }
            } catch (Exception unused2) {
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(Arrays.asList(com.github.catvod.spider.merge.p005f.c.e));
        }
        String strM463 = "personalModules";
        com.github.catvod.spider.merge.p005f.f fVar = this.k;
        ArrayList arrayList2 = fVar.b;
        arrayList2.clear();
        if (jsonObjectC != null) {
            try {
                if (jsonObjectC.has(strM463)) {
                    JsonArray asJsonArray2 = jsonObjectC.getAsJsonArray(strM463);
                    for (int i2 = 0; i2 < asJsonArray2.size(); i2++) {
                        String asString = asJsonArray2.get(i2).getAsString();
                        if (com.github.catvod.spider.merge.p005f.f.u(asString) && !arrayList2.contains(asString)) {
                            arrayList2.add(asString);
                        }
                    }
                }
            } catch (Exception unused3) {
            }
        }
        if (arrayList2.isEmpty()) {
            fVar.A();
        }
    }

    public void init(Context context, String str) throws Throwable {
        Init.init(context);
        i();
        A aJ = A.j();
        synchronized (aJ) {
            synchronized (this) {
                this.a = I0.c(str);
                this.b = null;
                this.e = false;
                this.f = aJ.k();
                this.g = aJ.m.get();
                this.h = 0L;
                this.i = 0L;
            }
        }
        s = this;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x019b */
    /* JADX WARN: Code duplicated, block: B:183:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x0233 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x022d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x016a, code lost:
    
        if (r0 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x016d, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x016f, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0170, code lost:
    
        r71.e = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0173, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0174, code lost:
    
        r7 = 5;
        r7 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0177, code lost:
    
        monitor-exit(r71);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0178, code lost:
    
        monitor-enter(r71);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0179, code lost:
    
        r71.d = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x017d, code lost:
    
        if (r71.a != r4) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x017f, code lost:
    
        r71.i = java.lang.System.nanoTime() + java.util.concurrent.TimeUnit.SECONDS.toNanos(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x018f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0191, code lost:
    
        monitor-exit(r71);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0195, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0197, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0198, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x019d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x019e, code lost:
    
        r7 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01a2, code lost:
    
        r7 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01af, code lost:
    
        monitor-enter(r71);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01b0, code lost:
    
        r71.d = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01b4, code lost:
    
        if (r71.a != r4) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01b6, code lost:
    
        if (r6 == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01b8, code lost:
    
        r71.i = java.lang.System.nanoTime() + java.util.concurrent.TimeUnit.SECONDS.toNanos(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c8, code lost:
    
        monitor-exit(r71);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01c9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01cb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01d1, code lost:
    
        monitor-enter(r71);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01d2, code lost:
    
        r71.d = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01d6, code lost:
    
        if (r71.a != r4) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d8, code lost:
    
        if (r6 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01da, code lost:
    
        r71.i = java.lang.System.nanoTime() + java.util.concurrent.TimeUnit.SECONDS.toNanos(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01ea, code lost:
    
        monitor-exit(r71);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01eb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01ed, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e9, code lost:
    
        r2 = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(r72 - java.lang.System.nanoTime());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
    
        if (r7.isEmpty() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ff, code lost:
    
        if (r2 <= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0107, code lost:
    
        if (r9.k() != r14) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0111, code lost:
    
        if (r9.m.get() == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0117, code lost:
    
        r0 = new com.github.catvod.spider.merge.p017u.CallableC0455g(r71, r4, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011f, code lost:
    
        if (r14 < 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0123, code lost:
    
        if (r12 < 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0127, code lost:
    
        if (r2 <= 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0129, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0134, code lost:
    
        r8 = r9.a(r7, r14, r12, r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0139, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013a, code lost:
    
        r6 = true;
        r7 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013f, code lost:
    
        r6 = true;
        r7 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        r5 = false;
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0151, code lost:
    
        if (r9.k() != r14) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015d, code lost:
    
        if (r9.m.get() == r12) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0160, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0162, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0163, code lost:
    
        monitor-enter(r71);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0166, code lost:
    
        if (r71.a != r4) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0168, code lost:
    
        if (r8 != false) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(long j) throws Throwable {
        long jTrim;
        boolean z;
        if (Thread.currentThread().isInterrupted() || System.nanoTime() >= j) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.d && !this.e && System.nanoTime() >= this.i) {
                    JsonObject jsonObject = this.a;
                    String strC = c(jsonObject, "cookie");
                    if (strC.isEmpty()) {
                        return;
                    }
                    long j2 = this.f;
                    long j3 = this.g;
                    boolean z2 = true;
                    this.d = true;
                    try {
                        try {
                            A aJ = A.j();
                            if (aJ.k() == j2) {
                                try {
                                    if (aJ.m.get() == j3) {
                                        if (strC.startsWith("http")) {
                                            String strU = FishCrypto.u("N1.5wdpFr+cj2KB+9IrzGebz0SaPNozzI0Q4PVvbXM8dRKZ3RgWbXPxftJIA04sXD9fswwOyvguQmX6IL28IeVTQg==", strC);
                                            if (TextUtils.isEmpty(strU)) {
                                                synchronized (this) {
                                                    this.d = false;
                                                }
                                                return;
                                            }
                                            try {
                                                jTrim = e(j, strU).trim();
                                                z = true;
                                            } catch (Exception unused) {
                                                jTrim = 5;
                                                z2 = false;
                                                z = true;
                                                synchronized (this) {
                                                    try {
                                                        this.d = z2;
                                                        if (this.a == jsonObject) {
                                                            this.i = System.nanoTime() + TimeUnit.SECONDS.toNanos(jTrim);
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                jTrim = 5;
                                                z2 = false;
                                                z = true;
                                                synchronized (this) {
                                                    try {
                                                        this.d = z2;
                                                        if (this.a == jsonObject) {
                                                            this.i = System.nanoTime() + TimeUnit.SECONDS.toNanos(jTrim);
                                                        }
                                                        throw th;
                                                    } catch (Throwable th3) {
                                                        throw th3;
                                                    }
                                                }
                                            }
                                        } else {
                                            jTrim = strC;
                                            z = false;
                                        }
                                        try {
                                            try {
                                                synchronized (this) {
                                                    try {
                                                        if (this.a != jsonObject || Thread.currentThread().isInterrupted()) {
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        jTrim = 5;
                                                        z2 = false;
                                                        throw th;
                                                    }
                                                    synchronized (this) {
                                                        this.d = z2;
                                                        if (this.a == jsonObject && z) {
                                                            this.i = System.nanoTime() + TimeUnit.SECONDS.toNanos(jTrim);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                        } catch (Exception unused2) {
                                            jTrim = 5;
                                            z2 = false;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            jTrim = 5;
                                            z2 = false;
                                        }
                                        try {
                                            throw th;
                                        } catch (Exception unused3) {
                                        } catch (Throwable th7) {
                                            th = th7;
                                            synchronized (this) {
                                                this.d = z2;
                                                if (this.a == jsonObject) {
                                                    this.i = System.nanoTime() + TimeUnit.SECONDS.toNanos(jTrim);
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    jTrim = 5;
                                    z2 = false;
                                    z = false;
                                    synchronized (this) {
                                        this.d = z2;
                                        if (this.a == jsonObject && z) {
                                            this.i = System.nanoTime() + TimeUnit.SECONDS.toNanos(jTrim);
                                        }
                                        throw th;
                                    }
                                }
                            }
                            jTrim = 5;
                            z2 = false;
                            try {
                                synchronized (this) {
                                    try {
                                        if (this.a == jsonObject) {
                                            this.e = true;
                                        }
                                        synchronized (this) {
                                            this.d = false;
                                        }
                                    } catch (Throwable th9) {
                                        throw th9;
                                    }
                                }
                            } catch (Exception unused4) {
                                z = false;
                                synchronized (this) {
                                    this.d = z2;
                                    if (this.a == jsonObject) {
                                        this.i = System.nanoTime() + TimeUnit.SECONDS.toNanos(jTrim);
                                    }
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                z = false;
                                synchronized (this) {
                                    this.d = z2;
                                    if (this.a == jsonObject) {
                                        this.i = System.nanoTime() + TimeUnit.SECONDS.toNanos(jTrim);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Exception unused5) {
                            jTrim = 5;
                            z2 = false;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                }
            } catch (Throwable th12) {
                throw th12;
            }
        }
    }

    public final void l(boolean z) throws Throwable {
        long nanos;
        if (Thread.currentThread().isInterrupted()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long nanos2 = timeUnit.toNanos(3000L) + jNanoTime;
        if (z) {
            synchronized (this) {
                try {
                    nanos = (this.d || this.e || jNanoTime < this.i || c(this.a, "cookie").isEmpty()) ? nanos2 : jNanoTime + timeUnit.toNanos(1500L);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m(nanos);
        }
        k(nanos2);
    }

    public final void m(long j) throws Throwable {
        synchronized (this) {
            try {
                if (!this.c && this.b == null && System.nanoTime() >= this.h) {
                    JsonObject jsonObject = this.a;
                    String strC = c(jsonObject, "json");
                    if (strC.isEmpty()) {
                        return;
                    }
                    boolean z = true;
                    this.c = true;
                    try {
                        String strU = FishCrypto.u("N1.5wdpFr+cj2KB+9IrzGebz0SaPNozzI0Q4PVvbXM8dRKZ3RgWbXPxftJIA04sXD9fswwOyvguQmX6IL28IeVTQg==", strC);
                        if (TextUtils.isEmpty(strU)) {
                            synchronized (this) {
                                this.c = false;
                            }
                            return;
                        }
                        try {
                            JsonObject asJsonObject = JsonParser.parseString(e(j, strU)).getAsJsonObject();
                            JsonArray asJsonArray = asJsonObject.getAsJsonArray("class");
                            if (asJsonArray == null || asJsonArray.isEmpty()) {
                                throw new IllegalArgumentException("Missing home classes");
                            }
                            for (int i = 0; i < asJsonArray.size(); i++) {
                                JsonObject asJsonObject2 = asJsonArray.get(i).getAsJsonObject();
                                if (asJsonObject2.has("type_id") && asJsonObject2.get("type_id").isJsonPrimitive() && (asJsonObject2.getAsJsonPrimitive("type_id").isString() || asJsonObject2.getAsJsonPrimitive("type_id").isNumber())) {
                                    if (!asJsonObject2.get("type_id").getAsString().trim().isEmpty() && !c(asJsonObject2, "type_name").isEmpty()) {
                                    }
                                }
                                throw new IllegalArgumentException("Invalid home class");
                            }
                            synchronized (this) {
                                try {
                                    if (this.a == jsonObject && System.nanoTime() < j && !Thread.currentThread().isInterrupted()) {
                                        this.b = asJsonObject.toString();
                                    }
                                    synchronized (this) {
                                        try {
                                            this.c = false;
                                            if (this.a == jsonObject) {
                                                this.h = System.nanoTime() + TimeUnit.SECONDS.toNanos(5L);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        } catch (Exception unused) {
                            synchronized (this) {
                                try {
                                    this.c = false;
                                    if (this.a == jsonObject && z) {
                                        this.h = System.nanoTime() + TimeUnit.SECONDS.toNanos(5L);
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            synchronized (this) {
                                try {
                                    this.c = false;
                                    if (this.a == jsonObject && z) {
                                        this.h = System.nanoTime() + TimeUnit.SECONDS.toNanos(5L);
                                    }
                                    throw th;
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        }
                    } catch (Exception unused2) {
                        z = false;
                    } catch (Throwable th6) {
                        th = th6;
                        z = false;
                    }
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
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

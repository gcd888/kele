package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
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
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
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
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0120;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class WenCai extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f104short = {1592, 1302, 29023, 23323, 2799, 28989, -29234, 22127, 2931, 22987, 25672, 2562, 31062, -31280, 20628, -28396, 18174, 24110, 20980, -24939, 17581, 23677, -27879, 25775, 20415, 22383, 21090, 28652, 31165, 20686, 25742, 26183, -27934, 21494, 26981, 21352, 22460, 23146, 21910, 18998, 864, 866, 866, 875, 812, 864, 866, 866, 866, 2455, 2462, 22490, 18253, 934, 942, 24042, 19837, 2264, 2251, 2268, 2264, 21796, 20782, 2102, 2090, 2094, 2109, 22681, 18448, 843, 837, 857, 797, 1225, 1206, 1193, 1258, 1234, 1253, 1270, 1237, 1260, 1201, 1279, 1201, 1270, 1256, 1228, 1218, 1263, 1192, 1265, 1279, 1205, 1265, 1220, 1221, 1214, 1214, 1265, 1246, 1245, 1205, 1238, 1237, 1257, 1238, 1228, 1200, 1202, 1256, 1226, 1267, 1248, 1224, 1218, 1230, 1239, 1235, 1220, 1215, 1248, 1266, 1215, 1206, 1278, 1220, 1226, 1228, 1261, 1202, 1201, 1269, 1219, 1228, 1278, 1254, 1258, 1192, 1269, 1278, 1232, 1219, 1204, 1231, 1278, 1267, 1239, 1256, 1206, 1245, 1220, 1201, 1232, 1257, 1239, 1254, 1230, 1205, 1239, 1237, 1200, 1203, 1214, 1257, 1204, 1269, 1234, 1249, 1249, 1250, 1262, 1232, 1247, 1231, 1251, 1239, 1205, 1238, 1248, 1215, 1192, 1203, 1254, 1268, 1226, 1203, 1203, 1218, 1207, 1205, 1216, 1265, 1236, 1239, 1238, 1221, 1196, 1264, 1216, 1196, 1271, 1221, 1245, 1164, 1246, 1175, 2235, 2236, 2238, 2230, 2300, 2235, 2236, 2215, 2176, 2230, 2226, 2209, 2224, 2235, 1416, 1421, 1432, 1421, 2873, 2927, 2942, 2936, 2938, 2897, 2922, 2930, 2850, 1495, 1497, 1477, 1483, 1491, 1486, 1496, 1409, 2499, 2498, 2512, 2491, 2478, 917, 963, 978, 980, 982, 992, 986, 969, 982, 910, 897, 899, 917, 984, 982, 970, 910, 2599, 2648, 2631, 2564, 2620, 2571, 2584, 2619, 2562, 2655, 2577, 2655, 2584, 2566, 2594, 2604, 2561, 2630, 2591, 2577, 2651, 2591, 2602, 2603, 2640, 2640, 2591, 2608, 2611, 2651, 2616, 2619, 2567, 2616, 2594, 2654, 2652, 2566, 2596, 2589, 2574, 2598, 2604, 2592, 2617, 2621, 2602, 2641, 2574, 2588, 2641, 2648, 2576, 2602, 2596, 2594, 2563, 2652, 2655, 2587, 2605, 2594, 2576, 2568, 2564, 2630, 2587, 2576, 2622, 2605, 2650, 2593, 2576, 2589, 2617, 2566, 2648, 2611, 2602, 2655, 2622, 2567, 2617, 2568, 2592, 2651, 2617, 2619, 2654, 2653, 2640, 2567, 2650, 2587, 2620, 2575, 2575, 2572, 2560, 2622, 2609, 2593, 2573, 2617, 2651, 2616, 2574, 2641, 2630, 2653, 2568, 2586, 2596, 2653, 2653, 2604, 2649, 2651, 2606, 2591, 2618, 2617, 2616, 2603, 2626, 2590, 2606, 2626, 2585, 2603, 2611, 2068, 2118, 2063, 1829, 1850, 1847, 1846, 1852, 1916, 1824, 1846, 1842, 1825, 1840, 1851, 1809, 1834, 1796, 1852, 1825, 1847, 1900, 1848, 1846, 1834, 1828, 1852, 1825, 1847, 1902, 2350, 2424, 2409, 2415, 2413, 2395, 2401, 2418, 2413, 2357, 2362, 2360, 1169, 1172, 1153, 1172, 2303, 2280, 2302, 2296, 2273, 2297, 2212, 2209, 2235, 2236, 17313, 30849, 556, 565, 574, 537, 566, 571, 553, 553, 2485, 2557, 2554, 2551, 2478, 3304, 3301, 3260, 2122, 785, 860, 850, 846, 778, 632, 519, 536, 603, 611, 596, 583, 612, 605, 512, 590, 512, 583, 601, 637, 627, 606, 537, 576, 590, 516, 576, 629, 628, 527, 527, 576, 623, 620, 516, 615, 612, 600, 615, 637, 513, 515, 601, 635, 578, 593, 633, 627, 639, 614, 610, 629, 526, 593, 579, 526, 519, 591, 629, 635, 637, 604, 515, 512, 580, 626, 637, 591, 599, 603, 537, 580, 591, 609, 626, 517, 638, 591, 578, 614, 601, 519, 620, 629, 512, 609, 600, 614, 599, 639, 516, 614, 612, 513, 514, 527, 600, 517, 580, 611, 592, 592, 595, 607, 609, 622, 638, 594, 614, 516, 615, 593, 526, 537, 514, 599, 581, 635, 514, 514, 627, 518, 516, 625, 576, 613, 614, 615, 628, 541, 577, 625, 541, 582, 628, 620, 1197, 1279, 1206, 1096, 1036, 1041, 1096, 1111, 1114, 1115, 1105, 1041, 1115, 1102, 1111, 1101, 1105, 1114, 1115, 1041, 1099, 1100, 1106, 1025, 1111, 1114, 1027, 1504, 1509, 1520, 1509, 291, 294, 316, 315, 2903, 2896, 2894, 419, 389, 403, 388, 475, 439, 401, 403, 408, 386, 2911, 2941, 2920, 2939, 2942, 2942, 2931, 2877, 2855, 2876, 2850, 2866, 2874, 2885, 2939, 2940, 2934, 2941, 2917, 2913, 2866, 2908, 2886, 2866, 2851, 2850, 2876, 2850, 2857, 2866, 2885, 2939, 2940, 2852, 2854, 2857, 2866, 2922, 2852, 2854, 2875, 2866, 2899, 2914, 2914, 2942, 2935, 2885, 2935, 2928, 2905, 2939, 2918, 2877, 2855, 2849, 2853, 2876, 2849, 2852, 2866, 2874, 2905, 2906, 2886, 2911, 2910, 2878, 2866, 2942, 2939, 2937, 2935, 2866, 2901, 2935, 2929, 2937, 2941, 2875, 2866, 2897, 2938, 2912, 2941, 2943, 2935, 2877, 2851, 2851, 2853, 2876, 2850, 2876, 2850, 2876, 2850, 2866, 2881, 2931, 2932, 2931, 2912, 2939, 2877, 2855, 2849, 2853, 2876, 2849, 2852, 899, 958, 933, 939, 933, 930, 507, 460, 463, 460, 475, 460, 475, 2781, 2756, 2767, 2789, 2762, 2758, 2766, 3102, 3091, 3146, 2725, 2792, 2790, 2810, 2750, 3285, 3242, 3253, 3318, 3278, 3321, 3306, 3273, 3312, 3245, 3299, 3245, 3306, 3316, 3280, 3294, 3315, 3252, 3309, 3299, 3241, 3309, 3288, 3289, 3234, 3234, 3309, 3266, 3265, 3241, 3274, 3273, 3317, 3274, 3280, 3244, 3246, 3316, 3286, 3311, 3324, 3284, 3294, 3282, 3275, 3279, 3288, 3235, 3324, 3310, 3235, 3242, 3298, 3288, 3286, 3280, 3313, 3246, 3245, 3305, 3295, 3280, 3298, 3322, 3318, 3252, 3305, 3298, 3276, 3295, 3240, 3283, 3298, 3311, 3275, 3316, 3242, 3265, 3288, 3245, 3276, 3317, 3275, 3322, 3282, 3241, 3275, 3273, 3244, 3247, 3234, 3317, 3240, 3305, 3278, 3325, 3325, 3326, 3314, 3276, 3267, 3283, 3327, 3275, 3241, 3274, 3324, 3235, 3252, 3247, 3322, 3304, 3286, 3247, 3247, 3294, 3243, 3241, 3292, 3309, 3272, 3275, 3274, 3289, 3248, 3308, 3292, 3248, 3307, 3289, 3265, 2547, 2465, 2536, 472, 455, 458, 459, 449, 385, 458, 459, 474, 463, 455, 450, 401, 455, 458, 403, 1951, 1946, 1935, 1946, 1820, 1797, 1806, 1827, 1806, 1368, 1345, 1354, 1406, 1351, 1357, 3165, 3140, 3151, 3186, 3150, 3146, 3161, 1752, 1729, 1738, 1775, 1756, 1739, 1743, 1868, 1877, 1886, 1915, 1881, 1870, 1877, 1864, 2545, 2536, 2531, 2499, 2542, 2549, 2530, 2532, 2547, 2536, 2549, 2101, 2092, 2087, 2048, 2092, 2093, 2103, 2086, 2093, 
    2103, 1518, 1507, 1514, 1535, 1492, 1531, 1527, 1535, 1990, 2003, 1994, 2000, 1996, 1991, 1990, 2031, 1994, 2000, 2007, 528, 543, 531, 539, 32375, -25927, 2044, 2043, 2038, 339, 443, 966, 28162, 27080, 2775, 2696, 2708, 2704, 2691, 2764, 3219, 3269, 3284, 3282, 3280, 3323, 3264, 3288, 3208, 1941, 1929, 1933, 1950, 2784, 2803, 2788, 2784, 519, 532, 515, 519, 603, 868, 822, 827, 818, 807, 883, 895, 2604, 2657, 2671, 2675, 2615, 1829, 1882, 1861, 1798, 1854, 1801, 1818, 1849, 1792, 1885, 1811, 1885, 1818, 1796, 1824, 1838, 1795, 1860, 1821, 1811, 1881, 1821, 1832, 1833, 1874, 1874, 1821, 1842, 1841, 1881, 1850, 1849, 1797, 1850, 1824, 1884, 1886, 1796, 1830, 1823, 1804, 1828, 1838, 1826, 1851, 1855, 1832, 1875, 1804, 1822, 1875, 1882, 1810, 1832, 1830, 1824, 1793, 1886, 1885, 1817, 1839, 1824, 1810, 1802, 1798, 1860, 1817, 1810, 1852, 1839, 1880, 1827, 1810, 1823, 1851, 1796, 1882, 1841, 1832, 1885, 1852, 1797, 1851, 1802, 1826, 1881, 1851, 1849, 1884, 1887, 1874, 1797, 1880, 1817, 1854, 1805, 1805, 1806, 1794, 1852, 1843, 1827, 1807, 1851, 1881, 1850, 1804, 1875, 1860, 1887, 1802, 1816, 1830, 1887, 1887, 1838, 1883, 1881, 1836, 1821, 1848, 1851, 1850, 1833, 1856, 1820, 1836, 1856, 1819, 1833, 1841, 632, 554, 611, 581, 602, 599, 598, 604, 540, 607, 602, 576, 583, 524, 583, 586, 579, 598, 514, 526, 1370, 1309, 1294, 1305, 1309, 1345, 2602, 2607, 2618, 2607, 2135, 2130, 2120, 2127, 3308, 3312, 3312, 3316, 3319, 2046, 2525, 2466, 2493, 2532, 2474, 2496, 2519, 2558, 2548, 2469, 2545, 2532, 2545, 2531, 2559, 2512, 2506, 2522, 2469, 2522, 2506, 2507, 2546, 2524, 2526, 2521, 2545, 2521, 2552, 2550, 2523, 2551, 2488, 2519, 2513, 2506, 2471, 2528, 2505, 2468, 2470, 2551, 2498, 2471, 2488, 2512, 2502, 2505, 2496, 2499, 2501, 2466, 2538, 2467, 2523, 2539, 2475, 2469, 2505, 2488, 2499, 2469, 2466, 2531, 2550, 2500, 2475, 2559, 2465, 2539, 2469, 2512, 2546, 2525, 2475, 2500, 2557, 2469, 2555, 2544, 2469, 2559, 2521, 2554, 2552, 2553, 2507, 2505, 2514, 2478, 2478, 455, 477, 467, 474, 2619, 3055, 3022, 3037, 3010, 3016, 3022, 3010, 3023, 1755, 1789, 1771, 1788, 1699, 1743, 1769, 1771, 1760, 1786, 1617, 1621, 1622, 1610, 1610, 1614, 1553, 1546, 1552, 1543, 1552, 1549, 3264, 3289, 3282, 3327, 3282, 830, 807, 812, 774, 809, 805, 813, 814, 823, 828, 776, 817, 827, 1295, 1302, 1309, 1323, 1308, 1300, 1304, 1291, 1298, 1290, 1155, 1178, 1169, 1187, 1168, 1159, 1158, 1180, 1178, 1179, 1097, 1096, 1114, 1073, 1060, 1382, 1391, 1310, 2779, 2752, 2761, 2725, 2745, 1407, 1280, 1311, 1385, 1387, 1355, 1281, 1403, 1353, 1406, 1394, 1406, 1368, 1399, 1405, 1387, 1285, 1351, 1407, 1404, 1384, 1360, 1280, 1369, 1288, 1395, 1382, 1379, 1372, 1287, 1397, 1281, 1387, 1385, 1365, 1387, 1401, 1376, 1369, 1401, 1380, 1353, 1355, 1347, 1350, 1383, 1377, 1405, 1363, 1378, 1345, 1369, 1362, 1405, 1376, 1369, 1392, 1406, 1286, 1383, 1289, 1306, 1380, 1378, 1362, 1349, 1346, 1347, 1283, 1387, 1401, 1287, 1387, 1381, 1382, 1385, 1394, 1285, 1368, 1385, 1399, 1355, 1378, 1382, 1364, 1397, 1394, 1379, 1362, 1363, 1394, 1377, 1403, 1351, 1366, 1387, 1373, 1383, 1280, 1287, 1353, 1373, 1365, 1399, 1352, 1403, 1280, 1282, 1387, 1362, 1292, 1992, 1994, 2015, 1998, 1996, 1988, 2009, 2002, 2024, 1988, 1989, 2015, 1998, 1989, 2015, 3165, 3164, 3149, 3160, 3152, 3157, 3194, 3158, 3159, 3149, 3164, 3159, 3149, 2443, 2444, 2446, 2438, 2464, 2444, 2445, 2455, 2438, 2445, 2455, 1305, 1310, 1308, 1300, 1319, 1304, 1301, 1300, 1310, 1330, 1310, 1311, 1285, 1300, 1311, 1285, 3116, 3155, 3148, 3087, 3109, 3094, 3118, 3110, 3130, 3127, 3083, 3078, 3152, 3163, 3145, 3130, 3130, 3111, 3159, 3086, 3159, 3105, 3095, 3127, 3119, 3145, 3121, 3110, 3077, 3159, 3122, 3123, 3125, 3145, 3082, 3075, 3085, 3152, 3113, 3114, 3109, 3114, 3087, 3085, 3152, 3119, 3123, 3111, 3077, 3121, 3083, 3130, 3122, 3112, 3104, 3145, 3096, 3104, 3110, 3091, 3145, 3105, 3131, 3163, 3119, 3080, 3075, 3083, 3107, 3107, 3125, 3158, 3109, 3105, 3111, 3153, 3122, 3127, 3123, 3087, 3110, 3084, 3108, 3108, 3099, 3126, 3113, 3124, 3115, 3159, 3131, 3105, 3155, 3104, 3083, 3125, 3159, 3073, 3090, 3163, 3154, 3130, 3085, 3083, 3152, 3112, 3099, 3088, 3162, 3158, 3167, 477, 1280, 1308, 1308, 1304, 621, 625, 636, 612, 632, 623, 606, 626, 627, 617, 632, 627, 617, 2460, 2442, 2446, 2461, 2444, 2439, 2476, 2432, 2433, 2459, 2442, 2433, 2459, 1500, 1482, 1486, 1501, 1484, 1479, 1516, 1472, 1473, 1499, 1482, 1473, 1499};
    public String a = "";

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("1", "电影", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("2", "电视剧", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("4", "动漫", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("3", "综艺", null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        String strM355 = "全部";
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strM355, ""));
        String strM499 = "中国大陆";
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strM499, strM499));
        String strM285 = "中国香港";
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strM285, strM285));
        String strM322 = "中国台湾";
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strM322, strM322));
        String strM414 = "美国";
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strM414, strM414));
        String strM558 = "日本";
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strM558, strM558));
        String strM175 = "韩国";
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strM175, strM175));
        String strM210 = "泰国";
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strM210, strM210));
        String strM249 = "印度";
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strM249, strM249));
        String strM567 = "其他";
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strM567, strM567));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM355, ""));
        for (int i = 2025; i >= 2010; i--) {
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(String.valueOf(i), String.valueOf(i)));
        }
        String strM169 = "2009~2000";
        arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM169, strM169));
        String strM529 = "90年代";
        arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM529, strM529));
        String strM427 = "80年代";
        arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM427, strM427));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new com.github.catvod.spider.merge.p001b.d("area", "地区", arrayList2));
        arrayList4.add(new com.github.catvod.spider.merge.p001b.d("year", "年份", arrayList3));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((com.github.catvod.spider.merge.p001b.b) it.next()).a(), arrayList4);
        }
        ArrayList arrayList5 = new ArrayList();
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis());
            JSONArray jSONArray = new JSONObject(X1.X(a("home/hotSearch"), null, c(e("key=" + FishCrypto.v("N1.mUbqRk6x6qoKEh/vx2vCB99vYZ2QRnQK75oMtgOEIPTC8gu81yCMKj56rDKyam/ryWD3HytPo1ZC6WnPaI2PR749n3rUffeiWXHdP2Qg8/4asM44E02GvSPQB+wG+pBZ") + "&t=" + strValueOf), strValueOf))).getJSONArray("data");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList5.add(d(jSONArray.getJSONObject(i2)));
            }
        } catch (Exception unused) {
        }
        return com.github.catvod.spider.merge.p001b.g.A(arrayList, arrayList5, linkedHashMap);
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        return homeContent(false);
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        String strM379 = "&pageNum=";
        String strM36 = "keyword=";
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String strEncode = URLEncoder.encode(str, "UTF-8");
            HashMap mapC = c(e(strM36 + str + strM379 + str2 + "&pageSize=20&key=" + FishCrypto.v("N1.mUbqRk6x6qoKEh/vx2vCB99vYZ2QRnQK75oMtgOEIPTC8gu81yCMKj56rDKyam/ryWD3HytPo1ZC6WnPaI2PR749n3rUffeiWXHdP2Qg8/4asM44E02GvSPQB+wG+pBZ") + "&t=" + strValueOf), strValueOf);
            StringBuilder sb = new StringBuilder();
            sb.append(a("video/searchByWord?keyword="));
            sb.append(strEncode);
            sb.append(strM379);
            sb.append(str2);
            sb.append("&pageSize=20");
            JSONArray jSONArray = new JSONObject(X1.X(sb.toString(), null, mapC)).getJSONObject("data").getJSONObject("result").getJSONArray("list");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (!"伦理".equals(jSONObject.optString("vodClass"))) {
                    arrayList.add(d(jSONObject));
                }
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.D.b.d();
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strM177 = "&nid=";
        String strM414 = "id=";
        String strI = AbstractC0280n1.i(str, str2, null, null);
        try {
            String[] strArrSplit = str2.split("@");
            String str3 = strArrSplit[0];
            String str4 = strArrSplit.length > 1 ? strArrSplit[1] : "";
            String strValueOf = String.valueOf(System.currentTimeMillis());
            HashMap mapC = c(e(strM414 + str3 + strM177 + str4 + "&key=" + FishCrypto.v("N1.mUbqRk6x6qoKEh/vx2vCB99vYZ2QRnQK75oMtgOEIPTC8gu81yCMKj56rDKyam/ryWD3HytPo1ZC6WnPaI2PR749n3rUffeiWXHdP2Qg8/4asM44E02GvSPQB+wG+pBZ") + "&t=" + strValueOf), strValueOf);
            StringBuilder sb = new StringBuilder();
            sb.append(a("v2/video/episode/url?id="));
            sb.append(str3);
            sb.append(strM177);
            sb.append(str4);
            String string = new JSONObject(X1.X(sb.toString(), null, mapC)).getJSONObject("data").getJSONArray("list").getJSONObject(0).getString("url");
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            map.put("Origin", this.a);
            map.put("Referer", this.a);
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(string);
            gVar.h(map);
            gVar.b(strI);
            return gVar.r();
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.D.b.f("");
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strM554 = "vodName";
        String strM54 = "id=";
        int i = 0;
        try {
            String str = list.get(0);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            HashMap mapC = c(e(strM54 + str + "&key=" + FishCrypto.v("N1.mUbqRk6x6qoKEh/vx2vCB99vYZ2QRnQK75oMtgOEIPTC8gu81yCMKj56rDKyam/ryWD3HytPo1ZC6WnPaI2PR749n3rUffeiWXHdP2Qg8/4asM44E02GvSPQB+wG+pBZ") + "&t=" + strValueOf), strValueOf);
            StringBuilder sb = new StringBuilder();
            sb.append(a("video/detail?id="));
            sb.append(str);
            JSONObject jSONObject = new JSONObject(X1.X(sb.toString(), null, mapC)).getJSONObject("data");
            k kVar = new k();
            kVar.n(String.valueOf(jSONObject.optInt("vodId")));
            kVar.o(jSONObject.optString(strM554));
            kVar.p(jSONObject.optString("vodPic"));
            kVar.u(jSONObject.optString("vodYear"));
            kVar.k(jSONObject.optString("vodArea"));
            kVar.j(jSONObject.optString("vodActor"));
            kVar.m(jSONObject.optString("vodDirector"));
            kVar.l(jSONObject.optString("vodContent"));
            kVar.i(jSONObject.optString("typeName"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("episodeList");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                while (i < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    String strM83 = "name";
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("第");
                    i++;
                    sb2.append(i);
                    sb2.append("集");
                    arrayList.add(jSONObject2.optString(strM83, sb2.toString()) + "$" + str + "@" + String.valueOf(jSONObject2.optLong("nid")));
                }
                String strJoin = TextUtils.join("#", arrayList);
                kVar.q("文才");
                kVar.r(strJoin);
                AbstractC0280n1.p(jSONObject.optString(strM554));
                AbstractC0280n1.q(strJoin);
            }
            N1.d(kVar);
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        } catch (Exception unused) {
            return AbstractC0449a.b();
        }
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM339 = "&year=";
        String strM108 = "&pageNum=";
        String strM529 = "year";
        String strM169 = "area";
        String strM477 = "area=";
        try {
            String str3 = map.containsKey(strM169) ? map.get(strM169) : "";
            String str4 = map.containsKey(strM529) ? map.get(strM529) : "";
            String strValueOf = String.valueOf(System.currentTimeMillis());
            HashMap mapC = c(e(strM477 + str3 + strM108 + str2 + "&type1=" + str + strM339 + str4 + "&key=" + FishCrypto.v("N1.mUbqRk6x6qoKEh/vx2vCB99vYZ2QRnQK75oMtgOEIPTC8gu81yCMKj56rDKyam/ryWD3HytPo1ZC6WnPaI2PR749n3rUffeiWXHdP2Qg8/4asM44E02GvSPQB+wG+pBZ") + "&t=" + strValueOf), strValueOf);
            StringBuilder sb = new StringBuilder();
            sb.append(a("video/list?type1="));
            sb.append(str);
            sb.append(strM108);
            sb.append(str2);
            sb.append("&area=");
            sb.append(str3);
            sb.append(strM339);
            sb.append(str4);
            JSONArray jSONArray = new JSONObject(X1.X(sb.toString(), null, mapC)).getJSONObject("data").getJSONArray("list");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(d(jSONArray.getJSONObject(i)));
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.D.b.d();
        }
    }

    public static String b(String str) {
        String strG = str;
        int iIndexOf = strG.indexOf(58);
        String strSubstring = iIndexOf > 0 ? strG.substring(0, iIndexOf) : "https";
        if (iIndexOf > 0) {
            strG = strG.substring(Math.min(iIndexOf + 3, strG.length()));
        }
        while (strG.endsWith("/")) {
            strG = com.github.catvod.spider.merge.D.b.g(strG, 1, 0);
        }
        StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strSubstring);
        sbO.append(FishCrypto.v("N1.w9SDmg6bwbplCYI6IYXaOMJbJkeHd+DBY4sZ75dQ4+CUZSPV1y0Hx86Z+P61peW8l2x6CaN8Wn6hc6lJikjXZA=="));
        sbO.append(strG);
        return sbO.toString();
    }

    public static HashMap c(String str, String str2) {
        HashMap mapT = com.github.catvod.spider.merge.D.b.t("sign", str, "T", str2);
        String strM169 = "Deviceid";
        mapT.put(strM169, strM169);
        mapT.put("User-Agent", "okhttp/4.9.3");
        return mapT;
    }

    public static k d(JSONObject jSONObject) {
        k kVar = new k();
        kVar.n(jSONObject.optString("vodId"));
        kVar.o(jSONObject.optString("vodName"));
        kVar.p(jSONObject.optString("vodPic"));
        kVar.s(jSONObject.optString("vodVersion", jSONObject.optString("vodRemarks")));
        return kVar;
    }

    public static String e(String str) {
        String lowerCase;
        String strM169 = "UTF-8";
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(strM169));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            lowerCase = sb.toString().toLowerCase();
        } catch (Exception unused) {
            lowerCase = "";
        }
        try {
            byte[] bArrDigest2 = MessageDigest.getInstance("SHA-1").digest(lowerCase.getBytes(strM169));
            StringBuilder sb2 = new StringBuilder();
            for (byte b2 : bArrDigest2) {
                String hexString2 = Integer.toHexString(b2 & 255);
                if (hexString2.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString2);
            }
            return sb2.toString().toLowerCase();
        } catch (Exception unused2) {
            return "";
        }
    }

    public final String a(String str) {
        return this.a + FishCrypto.v("N1.XZz0JxOCOiFLZ4vNMYa1h9BWRm6D0ZXdZHQhHUxzrwVPLbSphcLQhAO7V8+USctsr2ZH6ZTWXC4iXFzSWeDCRcbCPJvgZlV16xldFyJ13Zc=") + str;
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
        Init.init(context);
        this.a = b(FishCrypto.v("N1.mGtLDXUid29+XXE5l5CuUM+SDg5PQW+hao2KHGHmo2MQEgSiXPJB+zBDq+CY9MjaiAAW4GCE3PUQmDnFFyTKVI5YC1BiW5cp90Xoi2Jyr84="));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(",")) {
            String strTrim = str2.trim();
            if (strTrim.startsWith("http")) {
                String strB = b(strTrim);
                try {
                    Response responseI = X1.I(new Request.Builder().url(strB).head().build());
                    int iCode = responseI.code();
                    responseI.close();
                    if (iCode >= 200 && iCode < 400) {
                        this.a = strB;
                        return;
                    }
                } catch (Exception unused) {
                    continue;
                }
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

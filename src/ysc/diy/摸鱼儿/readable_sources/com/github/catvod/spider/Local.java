package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LruCache;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0265i1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.U0;
import com.github.catvod.spider.merge.A.X0;
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
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.g0.O;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.Q0;
import com.github.catvod.spider.merge.p000a.V;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.h;
import com.github.catvod.spider.merge.p002c.C0063;
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
import com.github.catvod.spider.merge.p017u.A;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.RunnableC0459k;
import com.github.catvod.spider.merge.p017u.W;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p021y.k;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Local extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f66short = {-29475, 30733, 1035, 1053, 1036, 1036, 1041, 1046, 1055, 3136, 3139, 3151, 3149, 3136, 3187, 3137, 3145, 3138, 3161, 943, 940, 928, 930, 943, 1017, 26924, 21553, 1240, 1220, 1241, 1247, 30914, 21298, 384, 386, 389, 399, 1426, 1435, 1432, 1424, 1425, 1414, 28224, 17713, 21246, 2356, 2347, 2342, 2343, 2349, -29722, -25935, 20629, -28395, 22246, 18758, 2550, 2541, 2545, 2556, 2539, 998, 965, 969, 971, 966, 906, 985, 962, 971, 984, 975, 906, 986, 966, 971, 979, 975, 984, 906, 975, 984, 984, 965, 984, 912, 906, 1203, 1200, 1212, 1214, 1203, 1253, 2789, 2798, 2806, 2799, 2797, 2798, 2784, 2789, 2747, 1079, 25457, 25561, 28693, 25366, 18535, 1752, 1749, 1900, 1895, 1919, 1894, 1892, 1895, 1897, 1900, 1879, 22903, 26326, 23429, 19086, -29704, 31979, -28895, 1215, 1189, 1331, 1335, 1315, 1328, 1321, -31230, 22115, 416, 419, 427, 422, 439, 2286, 2296, 1776, 1764, 3077, 3096, 3088, 3103, 3080, 3096, 2893, 2909, 2896, 2907, 2906, 2899, 2923, 2898, 2901, 2905, 2909, 2904, 2893, 3278, 3294, 3283, 3288, 3289, 3280, 1859, 1886, 1878, 1881, 1870, 1886, 1896, 1873, 1878, 1882, 1886, 1883, 1870, 566, 566, 562, 2053, 2071, 2051, 2060, 2053, 2075, 2051, 1973, 1962, 1959, 1958, 1964, 2028, 1979, 2030, 1962, 1968, 1964, 3114, 3131, 3131, 3111, 3106, 3112, 3114, 3135, 3106, 3108, 3109, 3172, 3108, 3112, 3135, 3118, 3135, 3174, 3128, 3135, 3129, 3118, 3114, 3110, 24918, 20810, 25303, 25412, 18585, 29308, 27929, 20818, 22460, 24445, -1674, -29299, 31863, 21108, -26697, -29265, 24915, 24768, 21198, 21182, 23759, -30501, 26234, 26601, 23526, -28686, 749, 759, 3026, 3022, 3022, 3018, 2965, 2970, 2975, 2966, 3017, 3036, 3036, 1985, 742, 1783, 533, 534, 538, 536, 533, 522, 529, 536, 523, 540, 596, 536, 541, 541, 579, 1176, 1179, 1175, 1173, 1176, 1159, 1180, 1173, 1158, 1169, 1241, 1168, 1169, 1176, 1169, 1152, 1169, 1230, 825, 826, 822, 820, 825, 778, 824, 816, 827, 800, 778, 824, 820, 827, 820, 818, 816, 1039, 1036, 1024, 1026, 1039, 1084, 1026, 1024, 1024, 1036, 1046, 1037, 1047, 1084, 1039, 1036, 1028, 1034, 1037, 2167, 2164, 2168, 2170, 2167, 2116, 2170, 2168, 2168, 2164, 2158, 2165, 2159, 2116, 2164, 2157, 2174, 2153, 2157, 2162, 2174, 2156, 2477, 2478, 2466, 2464, 2477, 2462, 2482, 2478, 2483, 2485, 2462, 2466, 2478, 2479, 2471, 2472, 2470, 2472, 2475, 2471, 2469, 2472, 2459, 2480, 2476, 2486, 2465, 2469, 2464, 2459, 2471, 2475, 2474, 2466, 2477, 2467, 1866, 1865, 1861, 1863, 1866, 1913, 1873, 1859, 1860, 1858, 1863, 1872, 1913, 1860, 1863, 1861, 1869, 1875, 1878, 2955, 2944, 2968, 2945, 2947, 2944, 2958, 2955, 3029, 1186, 1197, 1192, 1185, 1184, 1185, 1200, 1189, 1197, 1192, 1278, 1955, 1954, 1963, 1954, 1971, 1954, 2045, 1460, 1463, 1471, 1457, 1462, 1506, 636, 639, 627, 625, 636, 611, 632, 625, 610, 629, 573, 630, 633, 636, 629, 554, 3261, -29914, 26866, 22769, 21604, 18633, 25573, 18580, 25474, 25386, 748, 748, 744, 902, 902, 898, 1000, 984, 965, 990, 976, 990, 985, 982, 987, 1952, 1952, 1956, 1998, 2021, 2046, 1998, 1952, 1955, 1954, 3222, 3222, 3218, 3320, 3283, 3272, 3320, 3270, 3275, 3278, 2639, 2636, 2628, 2633, 2648, 824, 827, 819, 830, 815, 773, 821, 808, 819, 829, 819, 820, 827, 822, 436, 439, 447, 434, 419, 393, 419, 440, 442, 447, 443, 447, 418, 435, 434, 2748, 2721, 2729, 2726, 2737, 2721, 2260, 2249, 2241, 2254, 2265, 2249, 2303, 2255, 2258, 2249, 2247, 2249, 2254, 2241, 2252, 1273, 1268, 1263, 1261, 1252, 1256, 1886, 1875, 1864, 1866, 1859, 1871, 1913, 1877, 1867, 1863, 1876, 1874, 3163, 3158, 3149, 3151, 3142, 3146, 3196, 3148, 3153, 3146, 3140, 3146, 3149, 3138, 3151, 2030, 2044, 2024, 2023, 2030, 2032, 2024, 3158, 3140, 3152, 3167, 3158, 3144, 3152, 3182, 3166, 3139, 3160, 3158, 3160, 3167, 3152, 3165, 1916, 1902, 1914, 1909, 1916, 1890, 1914, 1860, 1902, 1909, 1911, 1906, 1910, 1906, 1903, 1918, 1919, 1424, 1410, 1430, 1433, 1424, 1422, 1430, 1448, 1411, 1432, 1448, 1478, 1477, 1476, 1917, 1904, 1909, 1429, 1432, 1437, 1451, 1435, 1414, 1437, 1427, 1437, 1434, 1429, 1432, 23483, 22181, 31673, 29232, 26697, 25569, 20679, 29120, 29292, 24645, 25046, 31319, -30457, 2228, 2228, 2228, 1683, 1680, 1692, 1694, 1683, 1676, 1687, 1694, 1677, 1690, 1746, 1683, 1690, 1694, 1689, 1733, -30886, 25742, 21645, 22552, 17589, 22718, -31389, 21295, -30917, -2812, 935, 932, 936, 938, 935, 952, 931, 938, 953, 942, 998, 930, 959, 942, 934, 1009, 2364, 2347, 2347, 2358, 2347, 21773, -30512, 24220, -30072, -28886, 27902, 23805, 20584, 19653, 21854, 21806, 26510, 26406, 25087, 28976, -27700, -29382, 1813, 1810, 1799, 1810, 1795, 1884, 2567, 2587, 2587, 2591, 1867, 1864, 1860, 1862, 1867, 1821, 465, 27916, 32195, 28577, 17616, -32068, -27669, 28413, 17804, 31097, 28912, 1123, 1143, 25862, 25749, 25081, 25243, 21652, 25526, 18471, 22270, 23746, 522, 521, 517, 519, 522, 533, 526, 519, 532, 515, 587, 519, 514, 514, 604, 1977, 1978, 1974, 1972, 1977, 1958, 1981, 1972, 1959, 1968, 2040, 1969, 1968, 1977, 1968, 1953, 1968, 2031, 1948, 1951, 1939, 1937, 1948, 1967, 1949, 1941, 1950, 1925, 1967, 1949, 1937, 1950, 1937, 1943, 1941, 604, 607, 595, 593, 604, 623, 593, 595, 595, 607, 581, 606, 580, 623, 604, 607, 599, 601, 606, 1386, 1385, 1381, 1383, 1386, 1369, 1383, 1381, 1381, 1385, 1395, 1384, 1394, 1369, 1385, 1392, 1379, 1396, 1392, 1391, 1379, 1393, 558, 557, 545, 547, 558, 541, 561, 557, 560, 566, 541, 545, 557, 556, 548, 555, 549, 1184, 1187, 1199, 1197, 1184, 1171, 1208, 1188, 1214, 1193, 1197, 1192, 1171, 1199, 1187, 1186, 1194, 1189, 1195, 2668, 2671, 2659, 2657, 2668, 2655, 2679, 2661, 2658, 2660, 2657, 2678, 2655, 2658, 2657, 2659, 2667, 2677, 2672, 2760, 2763, 2755, 2765, 2762, 2718, 2649, 1313, 1322, 1330, 1323, 1321, 1322, 1316, 1313, 2238, 2239, 2230, 2239, 2222, 2239, 3024, 3039, 3034, 3027, 3026, 3027, 3010, 3031, 3039, 3034, 1349, 1363, 1346, 1346, 1375, 1368, 1361, 436, 439, 443, 441, 436, 391, 437, 445, 438, 429, 1667, 1683, 1681, 1694, 1758, 1690, 1664, 1687, 29131, 22757, 18878, 23628, 22229, 30945, 29032, -30058, 21575, 2694, 2693, 2697, 2699, 
    2694, 2741, 2699, 2697, 2697, 2693, 2719, 2692, 2718, 2741, 2694, 2693, 2701, 2691, 2692, -30127, 21632, 28940, 22562, 25757, 29811, 23595, 20789, -29090, 20623, 29134, 25465, 1095, 1092, 1096, 1098, 1095, 1140, 1098, 1096, 1096, 1092, 1118, 1093, 1119, 1140, 1092, 1117, 1102, 1113, 1117, 1090, 1102, 1116, -30428, 22517, 25657, -29238, 23026, 21740, 1691, 1665, 3096, 3099, 3095, 3093, 3096, 3115, 3079, 3099, 3078, 3072, 3115, 3095, 3099, 3098, 3090, 3101, 3091, 26544, 19649, 24997, 23736, -25206, 29609, 29590, 31263, 17100, -31814, 29304, 30412, 1865, 1866, 1862, 1860, 1865, 1914, 1873, 1869, 1879, 1856, 1860, 1857, 1914, 1862, 1866, 1867, 1859, 1868, 1858, 19053, -29925, 31449, 32365, -27567, 31346, 23579, 19425, 19218, 25009, 24610, 22170, 22254, 20752, 28281, 785, 786, 798, 796, 785, 802, 778, 792, 799, 793, 796, 779, 802, 799, 796, 798, 790, 776, 781, 18793, 32023, 24319, 18693, 2434, 2433, 2445, 2447, 2434, 2481, 2435, 2443, 2432, 2459, 2481, 2435, 2447, 2432, 2447, 2441, 2443, 20566, 32299, 31217, 30294, 1687, 1681, 1684, 1665, 1686, 1723, 1672, 1677, 1670, 1686, 1669, 1686, 1693, 2554, 2553, 2549, 2551, 2554, 2533, 2558, 2551, 2532, 2547, 2491, 2544, 2553, 2554, 2546, 2547, 2532, 2476, 1850, 1843, 1840, 1848, 1849, 1838, 2230, 18108, 23184, 17981, 1781, 1782, 1786, 1784, 1781, 1770, 1777, 1784, 1771, 1788, 1716, 1776, 1773, 1788, 1780, 1699, 863, 860, 848, 850, 863, 832, 859, 850, 833, 854, 798, 850, 855, 855, 777, 26952, 22035, 22027, 19110, -28429, 26536, 25612, 22818, 21434, 20247, 2631, 2628, 2632, 2634, 2631, 2648, 2627, 2634, 2649, 2638, 2566, 2639, 2638, 2631, 2638, 2655, 2638, 2577, 21779, -28329, 22905, 30610, 27370, -30442, 21350, 18101, 23290, 18007, 21733, -28511, 21699, 18542, 884, 887, 891, 889, 884, 875, 880, 889, 874, 893, 821, 892, 881, 874, 802, -30378, 27266, 23169, 22036, 19129, 29436, 23367, 25074, 24922, 2011, 1990, 1998, 1985, 2006, 1990, -30071, 27070, 26267, 21368, 20437, -28621, 32272, 730, 733, 712, 733, 716, 659, 730, 705, 712, 731, 716, 758, 704, 711, 735, 712, 709, 704, 717, -28711, 27661, 23566, 20635, 19510, 21933, 21981, 26493, 26581, 1287, 1287, 1283, 2923, 2920, 2912, 2925, 2940, 2898, 2911, 2884, 2886, 2895, 2883, 1150, 1132, 1144, 1143, 1150, 1120, 1144, 2861, 2848, 2853, 2317, 2314, 2335, 2314, 2331, 2372, 2317, 2326, 2335, 2316, 2331, 2337, 2331, 2316, 2316, 2321, 2316, -30037, 27007, 22908, 21993, 18756, 21839, -30574, 24286, -30006, 24430, 23157, 19017, 18514, 18626, 18665, 633, 522, 572, 554, 554, 560, 566, 567, 24491, -29282, 25926, -683, -30290, -27756, 26601, 29730, 23820, 3062, 3051, 3043, 3052, 3067, 3051, 3000, 2991, 2995, 2995, 1604, 1625, 1617, 1630, 1609, 1625, 1647, 1622, 1617, 1629, 1625, 1628, 1609, 1546, 1797, 1813, 1816, 1811, 1810, 1819, 32671, 21708, 18677, 28860, 1893, 1909, 1912, 1907, 1906, 1915, 1830, 1843, 3249, 3233, 3244, 3239, 3238, 3247, 3223, 3246, 3241, 3237, 3233, 3236, 3249, 3314, 2155, 2152, 2148, 2150, 2155, 2109, 2372, 2372, 2372, 2372, 2322, 2416, 2416, 2322, 2393, 2393, 2333, 2421, 2421, 2311, 2384, 2384, 2311, 2382, 2382, 3151, 3166, 3166, 3138, 3143, 3149, 3151, 3162, 3143, 3137, 3136, 3073, 3137, 3149, 3162, 3147, 3162, 3075, 3165, 3162, 3164, 3147, 3151, 3139, 2552, 2537, 2556, 2528, 2064, 2066, 2053, 2072, 2078, 2079, 554, 552, 573, 556, 558, 550, 571, 560, 522, 550, 551, 573, 556, 551, 573, 1088, 1089, 1104, 1093, 1101, 1096, 1127, 1099, 1098, 1104, 1089, 1098, 1104, 1329, 1334, 1332, 1340, 1306, 1334, 1335, 1325, 1340, 1335, 1325, 1610, 1622, 1622, 1618, 1560, 1549, 1549, 2362, 2342, 2342, 2338, 2337, 2408, 2429, 2429, 3027, 3016, 3009, 3026, 3013, 3027, 3154, 3185, 3197, 3199, 3186, 3134, 3181, 3190, 3199, 3180, 3195, 3134, 3197, 3185, 3184, 3192, 3191, 3193, 3134, 3195, 3180, 3180, 3185, 3180, 3108, 3134, 2104, 2104, 2104, 2104, 2158, 2060, 2060, 2158, 2085, 2085, 2145, 2057, 2057, 2171, 2092, 2092, 2171, 2098, 2098, 1451, 1463, 1466, 1442, 1470, 1449, 1432, 1460, 1461, 1455, 1470, 1461, 1455};
    public final Cloud a = new Cloud();
    public k b = new k(Collections.emptyMap());
    public SimpleDateFormat c;

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b("setting", "设置", null));
        ArrayList<String[]> arrayListT = com.github.catvod.spider.merge.p021y.b.t();
        String[] strArrQ = com.github.catvod.spider.merge.p021y.b.q(arrayListT);
        ArrayList<String> arrayListW = com.github.catvod.spider.merge.p021y.b.w(strArrQ);
        boolean[] zArrC = U0.c("local_menu", strArrQ, new String[0]);
        HashMap map = new HashMap();
        for (String[] strArr : arrayListT) {
            map.put(strArr[0], strArr);
        }
        for (String str : arrayListW) {
            int i = 0;
            while (true) {
                if (i >= strArrQ.length) {
                    i = -1;
                    break;
                }
                if (strArrQ[i].equals(str)) {
                    break;
                }
                i++;
            }
            String[] strArr2 = (String[]) map.get(str);
            if (strArr2 != null && i >= 0 && zArrC[i]) {
                arrayList2.add(new com.github.catvod.spider.merge.p001b.b(strArr2[0], strArr2[1], strArr2[2]));
            }
        }
        if (!z) {
            return com.github.catvod.spider.merge.p001b.g.z(arrayList2, new ArrayList());
        }
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String strA = ((com.github.catvod.spider.merge.p001b.b) it2.next()).a();
            if (strA != null) {
                boolean zStartsWith = strA.startsWith("local:");
                String strM70 = "排序";
                String strM355 = "sort";
                String strM116 = "类型";
                String strM360 = "kind";
                String strM219 = "folder";
                String strM432 = "文件夹";
                String strM249 = "video";
                String strM2110 = "视频";
                String strM2111 = "全部";
                if (zStartsWith) {
                    ArrayList arrayList4 = new ArrayList();
                    it = it2;
                    ArrayList arrayList5 = new ArrayList();
                    arrayList = arrayList2;
                    arrayList5.add(new com.github.catvod.spider.merge.p001b.c(strM2111, ""));
                    arrayList5.add(new com.github.catvod.spider.merge.p001b.c(strM2110, strM249));
                    arrayList5.add(new com.github.catvod.spider.merge.p001b.c(strM432, strM219));
                    arrayList4.add(new com.github.catvod.spider.merge.p001b.d(strM360, strM116, arrayList5));
                    arrayList4.add(new com.github.catvod.spider.merge.p001b.d(strM355, strM70, com.github.catvod.spider.merge.p021y.b.B()));
                    linkedHashMap.put(strA, arrayList4);
                } else {
                    arrayList = arrayList2;
                    it = it2;
                    if (com.github.catvod.spider.merge.p021y.b.x(strA) != null) {
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(new com.github.catvod.spider.merge.p001b.c(strM2111, ""));
                        arrayList7.add(new com.github.catvod.spider.merge.p001b.c(strM2110, strM249));
                        arrayList7.add(new com.github.catvod.spider.merge.p001b.c(strM432, strM219));
                        arrayList7.add(new com.github.catvod.spider.merge.p001b.c("其他", "other"));
                        arrayList6.add(new com.github.catvod.spider.merge.p001b.d(strM360, strM116, arrayList7));
                        arrayList6.add(new com.github.catvod.spider.merge.p001b.d(strM355, strM70, com.github.catvod.spider.merge.p021y.b.B()));
                        linkedHashMap.put(strA, arrayList6);
                    }
                }
                it2 = it;
                arrayList2 = arrayList;
            }
        }
        return com.github.catvod.spider.merge.p001b.g.A(arrayList2, arrayList3, linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:132:0x04b3  */
    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws Throwable {
        List listEmptyList;
        if (com.github.catvod.spider.merge.p021y.b.k(str2) == null && !TextUtils.isEmpty(AbstractC0302v0.L1(str))) {
            try {
                String strPlayerContent = this.a.playerContent(str, str2, list);
                if (strPlayerContent != null && !strPlayerContent.equals(str)) {
                    return strPlayerContent;
                }
            } catch (Exception e) {
                com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("Local share player error: "));
            }
        }
        String strSubstring = str2.startsWith("local:") ? str2.substring(6) : str2;
        boolean z = true;
        if (str2.startsWith("download:")) {
            String[] strArrSplit = str2.substring(9).split(":", 2);
            if (strArrSplit.length < 2) {
                return com.github.catvod.spider.merge.p001b.g.d("无效的文件ID");
            }
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            String[] strArrL = com.github.catvod.spider.merge.p021y.b.l(str3, str4);
            String str5 = strArrL[2].isEmpty() ? str4 : strArrL[2];
            String strB = strArrL[0].isEmpty() ? com.github.catvod.spider.merge.D.b.B("download_", str4) : strArrL[0];
            InitOrigin.run(new V(new com.github.catvod.spider.merge.p021y.a(6, strB, str3, str5), strB, com.github.catvod.spider.merge.p021y.b.u(str3)));
            return com.github.catvod.spider.merge.p001b.g.m("已打开下载确认: " + strB);
        }
        String strK = com.github.catvod.spider.merge.p021y.b.k(str2);
        if (strK == null) {
            if (strSubstring.startsWith("http")) {
                return com.github.catvod.spider.merge.D.b.f(strSubstring);
            }
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            String strM463 = "file://";
            gVar.C(strM463.concat(strSubstring));
            File file = new File(strSubstring);
            File[] fileArrListFiles = file.getParentFile() != null ? file.getParentFile().listFiles() : null;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                listEmptyList = Collections.emptyList();
            } else {
                Arrays.sort(fileArrListFiles, com.github.catvod.spider.merge.p021y.f.b);
                String lowerCase = AbstractC0309x1.l(file.getName()).toLowerCase(Locale.getDefault());
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        String strG = AbstractC0309x1.g(file2.getName());
                        if (AbstractC0309x1.d.contains(strG)) {
                            String strL = AbstractC0309x1.l(file2.getName());
                            String lowerCase2 = strL.toLowerCase(Locale.getDefault());
                            h hVar = new h();
                            hVar.c(strL);
                            hVar.a(strG);
                            hVar.d(strM463 + file2.getAbsolutePath());
                            if (lowerCase2.equals(lowerCase)) {
                                arrayList.add(hVar);
                            } else {
                                if (lowerCase2.startsWith(lowerCase + ".")) {
                                    arrayList.add(hVar);
                                } else {
                                    if (lowerCase2.startsWith(lowerCase + "-")) {
                                        arrayList.add(hVar);
                                    } else {
                                        if (lowerCase2.startsWith(lowerCase + "_")) {
                                            arrayList.add(hVar);
                                        } else {
                                            arrayList2.add(hVar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                listEmptyList = arrayList;
                if (zIsEmpty) {
                    listEmptyList = arrayList2;
                }
            }
            gVar.B(listEmptyList);
            return gVar.r();
        }
        String strSubstring2 = str2.substring(strK.length() + 1);
        String strM539 = "quark";
        String strM42 = "获取";
        try {
            boolean zEquals = strM539.equals(strK);
            String strM169 = "baidu";
            String strM43 = "uc";
            if (zEquals || strM43.equals(strK) || "xl".equals(strK) || strM169.equals(strK)) {
                C0265i1.C();
            }
            boolean zEquals2 = strK.equals("tianyi");
            String strM414 = "yidong_family";
            String strM432 = "yidong";
            if (zEquals2 || strK.equals("tianyi_family") || strK.equals(strM432) || strK.equals(strM414)) {
                String[] strArrL2 = com.github.catvod.spider.merge.p021y.b.l(strK, strSubstring2);
                if (!strArrL2[2].isEmpty()) {
                    strSubstring2 = strArrL2[2];
                }
            }
            String strI = com.github.catvod.spider.merge.p021y.b.i(strK, strSubstring2);
            if (strI != null && !strI.isEmpty()) {
                if ((!strM539.equals(strK) || !A0.s().u) && (!strM43.equals(strK) || !Z0.t().z)) {
                    z = false;
                }
                Map mapP = com.github.catvod.spider.merge.p021y.b.p(strK);
                if (strM169.equals(strK)) {
                    com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
                    gVar2.C(strI);
                    gVar2.h(mapP);
                    gVar2.n();
                    return gVar2.r();
                }
                if ("115".equals(strK)) {
                    com.github.catvod.spider.merge.p001b.g gVar3 = new com.github.catvod.spider.merge.p001b.g();
                    gVar3.C(strI);
                    gVar3.h(mapP);
                    gVar3.n();
                    return gVar3.r();
                }
                if ("guangya".equals(strK)) {
                    com.github.catvod.spider.merge.p001b.g gVar4 = new com.github.catvod.spider.merge.p001b.g();
                    gVar4.C(strI);
                    gVar4.h(mapP);
                    gVar4.n();
                    return gVar4.r();
                }
                if (!strM432.equals(strK) && !strM414.equals(strK)) {
                    String strX0 = C0299u0.x0(strI, mapP, com.github.catvod.spider.merge.p021y.b.D(strK), strK, null);
                    if (strX0 != null && !strX0.isEmpty()) {
                        com.github.catvod.spider.merge.p001b.g gVar5 = new com.github.catvod.spider.merge.p001b.g();
                        gVar5.C(strX0);
                        gVar5.f(z ? "video/x-iso" : "application/octet-stream");
                        return gVar5.r();
                    }
                    return com.github.catvod.spider.merge.p001b.g.d("本地播放代理正在准备，请稍后重试");
                }
                com.github.catvod.spider.merge.p001b.g gVar6 = new com.github.catvod.spider.merge.p001b.g();
                gVar6.C(strI);
                gVar6.h(mapP);
                gVar6.n();
                return gVar6.r();
            }
            return com.github.catvod.spider.merge.p001b.g.d(strM42 + com.github.catvod.spider.merge.p021y.b.u(strK) + "播放地址失败");
        } catch (Exception e2) {
            return com.github.catvod.spider.merge.p001b.g.d("播放失败: " + e2.getMessage());
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        if ((k.a(str, "localshare-add:").isEmpty() && k.a(str, "localshare-delete:").isEmpty()) ? false : true) {
            AbstractC0302v0.g0(str, new i(10, this));
            return "";
        }
        if ("local_menu_manage".equals(str) || "local_account_login".equals(str) || "local_account_overview".equals(str) || "local_sort_config".equals(str) || "local_thread_config".equals(str) || "local_webdav_backup".equals(str) || str.startsWith("download:") || str.startsWith("filedetail:") || str.startsWith("delete:") || str.startsWith("login:")) {
            AbstractC0302v0.g0(str, new i(10, this));
            return "";
        }
        String strM126 = "localshare-file:";
        boolean zStartsWith = str.startsWith(strM126);
        String strM422 = "$";
        String strM182 = "资源库分享文件无效";
        if (zStartsWith) {
            this.b.getClass();
            String[] strArrT = k.t(strM126, 3, str);
            if (strArrT == null) {
                return com.github.catvod.spider.merge.p001b.g.d(strM182);
            }
            String strB1 = AbstractC0302v0.b1(strArrT[0]);
            ArrayList<String> arrayList = new ArrayList();
            if ("115".equals(strB1)) {
                arrayList.add("115_original");
                arrayList.add("115_to_123");
                arrayList.add("115_to_ali");
            } else if ("baidu".equals(strB1)) {
                arrayList.add("baidu_original");
                arrayList.add("baidu_unlimited");
            } else if ("tianyi".equals(strB1)) {
                arrayList.add("tianyi_original");
            } else if ("xunlei".equals(strB1)) {
                arrayList.add("xunlei_smart");
                arrayList.add("xunlei_original");
            } else if ("guangya".equals(strB1)) {
                arrayList.add("guangya_original");
                arrayList.add("guangya_unlimited");
                arrayList.add("guangya_to_123");
            } else if ("ali".equals(strB1)) {
                arrayList.add("ali_original");
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : arrayList) {
                if (C0299u0.g0(str2)) {
                    arrayList2.add(AbstractC0302v0.f1(str2));
                    arrayList3.add(strArrT[1] + strM422 + strArrT[2]);
                }
            }
            if (arrayList2.isEmpty()) {
                return com.github.catvod.spider.merge.p001b.g.d("当前网盘没有启用的播放线路");
            }
            com.github.catvod.spider.merge.p001b.k kVarA = AbstractC0449a.a(str);
            kVarA.o(strArrT[1]);
            kVarA.p("data:image/png;base64,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");
            kVarA.i(AbstractC0302v0.Y0(strB1));
            String strM445 = "$$$";
            kVarA.q(TextUtils.join(strM445, arrayList2));
            kVarA.r(TextUtils.join(strM445, arrayList3));
            return com.github.catvod.spider.merge.p001b.g.s(AbstractC0302v0.f(kVarA));
        }
        boolean zStartsWith2 = str.startsWith("localshare-leaf:");
        Cloud cloud = this.a;
        String strM186 = "资源库分享加载失败：";
        if (zStartsWith2) {
            k kVar = this.b;
            kVar.getClass();
            O oJ = k.j(str);
            if (oJ == null) {
                return com.github.catvod.spider.merge.p001b.g.d(strM182);
            }
            try {
                return k.e(str, kVar.k(oJ.b, cloud));
            } catch (Exception e) {
                return com.github.catvod.spider.merge.p001b.g.d(strM186 + k.p(e));
            }
        }
        boolean zStartsWith3 = str.startsWith("localshare-item:");
        String strM249 = "error";
        if (zStartsWith3) {
            String strU = k.u(str);
            boolean zIsEmpty = TextUtils.isEmpty(strU);
            String strM234 = "加载失败";
            if (zIsEmpty) {
                return com.github.catvod.spider.merge.p021y.b.z(strM249, strM234, "资源库分享地址无效");
            }
            try {
                return cloud.detailContent(Collections.singletonList(strU));
            } catch (Exception e2) {
                String strM288 = strM186 + e2.getMessage();
                if (strM288 == null) {
                    strM288 = "未知错误";
                }
                return com.github.catvod.spider.merge.p021y.b.z(strM249, strM234, strM288);
            }
        }
        if (str.startsWith("state:") || strM249.equals(str)) {
            return com.github.catvod.spider.merge.p001b.g.m("暂无可操作内容");
        }
        if (str.startsWith("http")) {
            return com.github.catvod.spider.merge.p001b.g.s(com.github.catvod.spider.merge.p021y.b.e(Uri.parse(str).getLastPathSegment(), str));
        }
        if (str.startsWith("local:")) {
            return com.github.catvod.spider.merge.p021y.b.h(str.substring(6));
        }
        if (com.github.catvod.spider.merge.p021y.b.k(str) == null) {
            return com.github.catvod.spider.merge.p021y.b.h(str);
        }
        String strM219 = ":";
        String[] strArrSplit = str.split(strM219, 2);
        if (strArrSplit.length < 2) {
            return com.github.catvod.spider.merge.p001b.g.s(com.github.catvod.spider.merge.p021y.b.e("未知文件", str));
        }
        String str3 = strArrSplit[0];
        String[] strArrL = com.github.catvod.spider.merge.p021y.b.l(str3, strArrSplit[1]);
        String strM187 = strArrL[0].isEmpty() ? "视频文件" : strArrL[0];
        String str4 = strArrL[1];
        String str5 = strArrL[2];
        com.github.catvod.spider.merge.p001b.k kVar2 = new com.github.catvod.spider.merge.p001b.k();
        kVar2.i("网盘");
        kVar2.n(str);
        kVar2.o(strM187);
        kVar2.p(com.github.catvod.spider.merge.p021y.f.c(strM187));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (!str4.isEmpty() || "xl".equals(str3)) {
            try {
                ArrayList<com.github.catvod.spider.merge.p021y.c> arrayListD = com.github.catvod.spider.merge.p021y.b.d(str3, str4);
                Collections.sort(arrayListD, com.github.catvod.spider.merge.p021y.f.c);
                for (com.github.catvod.spider.merge.p021y.c cVar : arrayListD) {
                    boolean z = cVar.d;
                    String str6 = cVar.b;
                    if (!z && AbstractC0309x1.i(str6)) {
                        arrayList4.add(str6);
                        arrayList5.add(str3 + strM219 + cVar.a);
                    }
                }
            } catch (Exception unused) {
            }
        }
        com.github.catvod.spider.merge.p021y.b.a(kVar2, com.github.catvod.spider.merge.p021y.b.u(str3), arrayList4, arrayList5, com.github.catvod.spider.merge.D.b.C(str3, strM219, str5));
        if (arrayList4.isEmpty()) {
            kVar2.q("播放");
            kVar2.r(com.github.catvod.spider.merge.p021y.f.f(strM187) + strM422 + str);
        }
        boolean z2 = FishCrypto.a;
        N1.d(kVar2);
        return com.github.catvod.spider.merge.p001b.g.s(kVar2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        final int i = 0;
        final int i2 = 1;
        String strM219 = "localshare-add:";
        boolean zIsEmpty = k.a(str, strM219).isEmpty();
        String strM414 = "localshare-delete:";
        if ((zIsEmpty && k.a(str, strM414).isEmpty()) ? false : true) {
            final k kVar = this.b;
            kVar.getClass();
            final String strA = k.a(str, strM219);
            if (strA.isEmpty()) {
                final String strA2 = k.a(str, strM414);
                if (!strA2.isEmpty()) {
                    InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.y.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    k kVar2 = kVar;
                                    kVar2.getClass();
                                    String str2 = strA2;
                                    P1.M0(new String[]{b.u(str2)}, String.valueOf(System.currentTimeMillis()), "name,分享名称,例如：我的资源|url,分享链接,粘贴完整链接或短ID|pwd,提取码,无密码留空", new C(kVar2, str2));
                                    break;
                                default:
                                    k kVar3 = kVar;
                                    List list = (List) kVar3.b.get(strA2);
                                    if (list == null || list.isEmpty()) {
                                        X0.a("当前网盘暂无可删除分享");
                                    } else {
                                        ArrayList arrayList = new ArrayList(list);
                                        String[] strArr = new String[arrayList.size()];
                                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                            i iVar = (i) arrayList.get(i3);
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(iVar.c);
                                            sb.append(iVar.d ? " · 内置" : " · 自定义");
                                            strArr[i3] = sb.toString();
                                        }
                                        InitOrigin.run(new W(strArr, "删除分享", new C(kVar3, arrayList), 6));
                                    }
                                    break;
                            }
                        }
                    });
                }
            } else {
                InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.y.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                k kVar2 = kVar;
                                kVar2.getClass();
                                String str2 = strA;
                                P1.M0(new String[]{b.u(str2)}, String.valueOf(System.currentTimeMillis()), "name,分享名称,例如：我的资源|url,分享链接,粘贴完整链接或短ID|pwd,提取码,无密码留空", new C(kVar2, str2));
                                break;
                            default:
                                k kVar3 = kVar;
                                List list = (List) kVar3.b.get(strA);
                                if (list == null || list.isEmpty()) {
                                    X0.a("当前网盘暂无可删除分享");
                                } else {
                                    ArrayList arrayList = new ArrayList(list);
                                    String[] strArr = new String[arrayList.size()];
                                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                        i iVar = (i) arrayList.get(i3);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(iVar.c);
                                        sb.append(iVar.d ? " · 内置" : " · 自定义");
                                        strArr[i3] = sb.toString();
                                    }
                                    InitOrigin.run(new W(strArr, "删除分享", new C(kVar3, arrayList), 6));
                                }
                                break;
                        }
                    }
                });
            }
            return "";
        }
        if ("local_menu_manage".equals(str)) {
            InitOrigin.run(new A(26));
        } else if ("local_account_login".equals(str)) {
            InitOrigin.run(new RunnableC0459k(11));
        } else if ("local_account_overview".equals(str)) {
            FishConfig.showAccountOverviewDialog();
        } else if ("local_sort_config".equals(str)) {
            InitOrigin.run(new A(27));
        } else if ("local_thread_config".equals(str)) {
            InitOrigin.run(new RunnableC0459k(17));
        } else if ("local_webdav_backup".equals(str)) {
            InitOrigin.run(new RunnableC0459k(25));
        } else if (!str.startsWith("login:")) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf >= 0) {
                String strSubstring = str.substring(0, iIndexOf);
                String[] strArrSplit = str.substring(iIndexOf + 1).split(":", 3);
                if (strArrSplit.length >= 3) {
                    String str2 = strArrSplit[0];
                    String str3 = strArrSplit[1];
                    String str4 = strArrSplit[2];
                    strSubstring.getClass();
                    byte b = -1;
                    switch (strSubstring.hashCode()) {
                        case -2020409139:
                            if (strSubstring.equals("filedetail")) {
                                b = 0;
                            }
                            break;
                        case -1335458389:
                            if (strSubstring.equals("delete")) {
                                b = 1;
                            }
                            break;
                        case 1427818632:
                            if (strSubstring.equals("download")) {
                                b = 2;
                            }
                            break;
                    }
                    switch (b) {
                        case 0:
                            InitOrigin.run(new com.github.catvod.spider.merge.p021y.a(1, str2, str3, str4));
                            break;
                        case 1:
                            InitOrigin.execute(new com.github.catvod.spider.merge.p021y.a(2, str2, str3, str4));
                            break;
                        case 2:
                            InitOrigin.run(new com.github.catvod.spider.merge.p021y.a(0, str2, str3, str4));
                            break;
                    }
                }
            }
        } else {
            com.github.catvod.spider.merge.p021y.b.y(str.substring(6));
        }
        return "";
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws Throwable {
        int iMax;
        com.github.catvod.spider.merge.p021y.e eVar = com.github.catvod.spider.merge.p021y.f.a;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
            iMax = 1;
        }
        boolean zEquals = "setting".equals(str);
        String strM36 = "local_menu";
        if (zEquals) {
            String[] strArrQ = com.github.catvod.spider.merge.p021y.b.q(com.github.catvod.spider.merge.p021y.b.t());
            ArrayList arrayList = new ArrayList();
            String strM = com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "scan.jpg");
            String strM499 = "登录与导入网盘账号";
            String strM37 = "local_account_login";
            arrayList.add(new com.github.catvod.spider.merge.p001b.k(strM37, "账号登录", strM, strM499, strM37));
            String strA = AbstractC0302v0.a();
            String strM325 = "查看当前账号状态";
            String strM322 = "local_account_overview";
            arrayList.add(new com.github.catvod.spider.merge.p001b.k(strM322, "账号总览", strA, strM325, strM322));
            StringBuilder sb = new StringBuilder("当前: ");
            String[] strArr = com.github.catvod.spider.merge.p021y.b.b;
            String strF = com.github.catvod.spider.merge.p021y.b.f();
            int i = 0;
            while (i < 6) {
                if (com.github.catvod.spider.merge.p021y.b.d[i].equals(strF)) {
                    sb.append(strArr[i]);
                    String string = sb.toString();
                    String strH1 = AbstractC0302v0.H1();
                    String strM219 = "local_sort_config";
                    arrayList.add(new com.github.catvod.spider.merge.p001b.k(strM219, "文件排序", strH1, string, strM219));
                    String strS1 = AbstractC0302v0.S1();
                    String strM558 = "配置网盘下载线程";
                    String strM234 = "local_thread_config";
                    arrayList.add(new com.github.catvod.spider.merge.p001b.k(strM234, "下载线程", strS1, strM558, strM234));
                    String strG = AbstractC0302v0.g();
                    String strM358 = "配置备份与播放历史同步";
                    String strM545 = "local_webdav_backup";
                    arrayList.add(new com.github.catvod.spider.merge.p001b.k(strM545, "云端备份", strG, strM358, strM545));
                    String strD = U0.d(strM36, strArrQ, new String[0]);
                    String strZ1 = AbstractC0302v0.z1();
                    String strM546 = "local_menu_manage";
                    arrayList.add(new com.github.catvod.spider.merge.p001b.k(strM546, "分类管理", strZ1, strD, strM546));
                    com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                    gVar.F(arrayList);
                    gVar.o(1, 1, 0, 1);
                    return gVar.r();
                }
                i++;
            }
            i = 0;
            sb.append(strArr[i]);
            String string2 = sb.toString();
            String strH2 = AbstractC0302v0.H1();
            String strM2110 = "local_sort_config";
            arrayList.add(new com.github.catvod.spider.merge.p001b.k(strM2110, "文件排序", strH2, string2, strM2110));
            String strS2 = AbstractC0302v0.S1();
            String strM559 = "配置网盘下载线程";
            String strM235 = "local_thread_config";
            arrayList.add(new com.github.catvod.spider.merge.p001b.k(strM235, "下载线程", strS2, strM559, strM235));
            String strG2 = AbstractC0302v0.g();
            String strM359 = "配置备份与播放历史同步";
            String strM547 = "local_webdav_backup";
            arrayList.add(new com.github.catvod.spider.merge.p001b.k(strM547, "云端备份", strG2, strM359, strM547));
            String strD2 = U0.d(strM36, strArrQ, new String[0]);
            String strZ2 = AbstractC0302v0.z1();
            String strM548 = "local_menu_manage";
            arrayList.add(new com.github.catvod.spider.merge.p001b.k(strM548, "分类管理", strZ2, strD2, strM548));
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.F(arrayList);
            gVar2.o(1, 1, 0, 1);
            return gVar2.r();
        }
        boolean zEquals2 = "super_library".equals(str);
        String strM1 = "localshare-folder:";
        String strM355 = "folder";
        if (zEquals2) {
            k kVar = this.b;
            kVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : U0.f(strM36, k.g)) {
                List list = (List) kVar.b.get(str3);
                com.github.catvod.spider.merge.p001b.k kVar2 = new com.github.catvod.spider.merge.p001b.k();
                kVar2.n(strM1 + str3);
                kVar2.o(com.github.catvod.spider.merge.p021y.b.u(str3));
                kVar2.p(AbstractC0302v0.j(str3));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(list == null ? 0 : list.size());
                sb2.append(" 个分享");
                kVar2.s(sb2.toString());
                kVar2.t(strM355);
                arrayList2.add(kVar2);
            }
            com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayList2);
            gVarC.o(1, 1, arrayList2.size(), arrayList2.size());
            return gVarC.r();
        }
        String strM471 = "localshare-item:";
        if (str != null && str.startsWith(strM1)) {
            if (k.g(str.startsWith(strM1) ? str.substring(18) : "")) {
                k kVar3 = this.b;
                String strSubstring = str.startsWith(strM1) ? str.substring(18) : "";
                List<com.github.catvod.spider.merge.p021y.i> list2 = (List) kVar3.b.get(strSubstring);
                int size = list2 != null ? list2.size() : 0;
                ArrayList arrayList3 = new ArrayList();
                String strU = com.github.catvod.spider.merge.p021y.b.u(strSubstring);
                String strConcat = "localshare-add:".concat(strSubstring);
                String strJ = com.github.catvod.spider.merge.D.b.j("添加", strU, "分享链接");
                String strF1 = AbstractC0302v0.F1();
                com.github.catvod.spider.merge.p001b.k kVar4 = new com.github.catvod.spider.merge.p001b.k();
                kVar4.n(strConcat);
                kVar4.o("新增分享");
                kVar4.p(strF1);
                kVar4.s(strJ);
                kVar4.g(strConcat);
                arrayList3.add(kVar4);
                String strConcat2 = "localshare-delete:".concat(strSubstring);
                String strJ2 = com.github.catvod.spider.merge.D.b.j("删除", strU, "内置或自定义分享");
                String strO = AbstractC0302v0.o();
                com.github.catvod.spider.merge.p001b.k kVar5 = new com.github.catvod.spider.merge.p001b.k();
                kVar5.n(strConcat2);
                kVar5.o("删除分享");
                kVar5.p(strO);
                kVar5.s(strJ2);
                kVar5.g(strConcat2);
                arrayList3.add(kVar5);
                if (list2 != null) {
                    for (com.github.catvod.spider.merge.p021y.i iVar : list2) {
                        com.github.catvod.spider.merge.p001b.k kVar6 = new com.github.catvod.spider.merge.p001b.k();
                        kVar6.n(strM471 + Base64.encodeToString(iVar.b.getBytes(StandardCharsets.UTF_8), 11));
                        kVar6.o(iVar.c);
                        kVar6.p("data:image/png;base64,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");
                        kVar6.s(strU);
                        kVar6.t(strM355);
                        arrayList3.add(kVar6);
                    }
                }
                int iMax2 = Math.max(1, (size + 101) / 100);
                int iMax3 = Math.max(1, Math.min(iMax, iMax2));
                com.github.catvod.spider.merge.p001b.g gVar3 = new com.github.catvod.spider.merge.p001b.g();
                gVar3.F(com.github.catvod.spider.merge.p021y.f.e(arrayList3, iMax3));
                gVar3.o(iMax3, iMax2, 100, 2 + size);
                return gVar3.r();
            }
        }
        if (str != null) {
            String strM33 = "localshare-dir:";
            if (str.startsWith(strM33)) {
                this.b.getClass();
                String[] strArrT = k.t(strM33, 2, str);
                return strArrT == null ? com.github.catvod.spider.merge.p001b.g.d("资源库分享目录无效") : k.b(strArrT[0], iMax, strArrT[1]);
            }
        }
        boolean z2 = str != null && str.startsWith(strM471);
        String strM314 = "tianyi";
        if (z2) {
            k kVar7 = this.b;
            Cloud cloud = this.a;
            kVar7.getClass();
            String strU2 = k.u(str);
            if (TextUtils.isEmpty(strU2)) {
                return com.github.catvod.spider.merge.p021y.b.z("state:share_invalid", "资源库分享地址无效", "请检查分享配置");
            }
            String strB1 = AbstractC0302v0.b1(strU2);
            if ("115".equals(strB1) || "baidu".equals(strB1) || strM314.equals(strB1) || "xunlei".equals(strB1) || "guangya".equals(strB1) || "ali".equals(strB1)) {
                return k.b(strU2, iMax, "");
            }
            try {
                return k.d(strU2, iMax, kVar7.k(strU2, cloud));
            } catch (Exception e) {
                return com.github.catvod.spider.merge.p021y.b.z("state:share_error", "资源库分享加载失败", k.p(e));
            }
        }
        boolean zEquals3 = strM314.equals(str);
        String strM102 = "家庭云";
        String strM567 = "个人云";
        if (zEquals3) {
            ArrayList arrayList4 = new ArrayList();
            if (!com.github.catvod.spider.merge.p021y.b.r(strM314)) {
                InitOrigin.run(new com.github.catvod.spider.merge.p019w.a(strM314, 2));
                return com.github.catvod.spider.merge.p021y.b.v(com.github.catvod.spider.merge.p021y.b.u(strM314), strM314);
            }
            Q0 q0F = Q0.f();
            q0F.getClass();
            try {
                q0F.e();
                if (!q0F.c.z() && !q0F.A()) {
                    X0.a(AbstractC0302v0.Y0(strM314) + " Session已过期，请重新登录");
                }
            } catch (Exception unused2) {
            }
            com.github.catvod.spider.merge.p001b.k kVar8 = new com.github.catvod.spider.merge.p001b.k();
            kVar8.n("tianyi:-11");
            kVar8.o(strM567);
            kVar8.p("data:image/png;base64,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");
            kVar8.t(strM355);
            arrayList4.add(kVar8);
            com.github.catvod.spider.merge.p001b.k kVar9 = new com.github.catvod.spider.merge.p001b.k();
            kVar9.n("tianyi_family:");
            kVar9.o(strM102);
            kVar9.p("data:image/png;base64,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");
            kVar9.t(strM355);
            arrayList4.add(kVar9);
            com.github.catvod.spider.merge.p001b.g gVar4 = new com.github.catvod.spider.merge.p001b.g();
            gVar4.F(arrayList4);
            gVar4.o(1, 1, 0, 1);
            return gVar4.r();
        }
        String strM199 = "yidong";
        if (!strM199.equals(str)) {
            String strX = com.github.catvod.spider.merge.p021y.b.x(str);
            if (strX != null) {
                return com.github.catvod.spider.merge.p021y.b.m(iMax, str, strX, map);
            }
            boolean zStartsWith = str.startsWith("local:");
            String strM175 = "yyyy/MM/dd HH:mm:ss";
            if (zStartsWith) {
                String strSubstring2 = str.substring(6);
                if (this.c == null) {
                    this.c = new SimpleDateFormat(strM175, Locale.getDefault());
                }
                return com.github.catvod.spider.merge.p021y.b.n(strSubstring2, iMax, map, this.c);
            }
            String strK = com.github.catvod.spider.merge.p021y.b.k(str);
            if (strK != null) {
                return com.github.catvod.spider.merge.p021y.b.m(iMax, strK, str.substring(strK.length() + 1), map);
            }
            if (this.c == null) {
                this.c = new SimpleDateFormat(strM175, Locale.getDefault());
            }
            return com.github.catvod.spider.merge.p021y.b.n(str, iMax, map, this.c);
        }
        ArrayList arrayList5 = new ArrayList();
        if (!com.github.catvod.spider.merge.p021y.b.r(strM199)) {
            InitOrigin.run(new com.github.catvod.spider.merge.p019w.a(strM199, 2));
            return com.github.catvod.spider.merge.p021y.b.v("移动云盘", strM199);
        }
        com.github.catvod.spider.merge.p001b.k kVar10 = new com.github.catvod.spider.merge.p001b.k();
        kVar10.n("yidong:/");
        kVar10.o(strM567);
        kVar10.p("data:image/png;base64,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");
        kVar10.t(strM355);
        arrayList5.add(kVar10);
        com.github.catvod.spider.merge.p001b.k kVar11 = new com.github.catvod.spider.merge.p001b.k();
        kVar11.n("yidong_family:");
        kVar11.o(strM102);
        kVar11.p("data:image/png;base64,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");
        kVar11.t(strM355);
        arrayList5.add(kVar11);
        com.github.catvod.spider.merge.p001b.g gVar5 = new com.github.catvod.spider.merge.p001b.g();
        gVar5.F(arrayList5);
        gVar5.o(1, 1, 0, 1);
        return gVar5.r();
    }

    public static Object[] localProxy(Map<String, String> map) {
        String str;
        LruCache lruCache = com.github.catvod.spider.merge.p021y.g.a;
        Object[] objArr = new Object[3];
        objArr[0] = 200;
        objArr[1] = "application/octet-stream";
        if (map == null) {
            str = null;
        } else {
            try {
                str = map.get("path");
            } catch (Exception unused) {
                objArr[2] = new ByteArrayInputStream(com.github.catvod.spider.merge.p021y.g.b());
            }
        }
        objArr[2] = new ByteArrayInputStream(com.github.catvod.spider.merge.p021y.g.a(new String(Base64.decode(str, 8))));
        return objArr;
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
        k kVar;
        JSONObject jSONObjectOptJSONObject;
        Init.init(context);
        if (TextUtils.isEmpty(str)) {
            kVar = new k(Collections.emptyMap());
        } else {
            try {
                String strTrim = str.trim();
                if (strTrim.startsWith("http://") || strTrim.startsWith("https://")) {
                    strTrim = X1.X(strTrim, null, null);
                }
                if (TextUtils.isEmpty(strTrim) || strTrim.length() > 1048576 || (jSONObjectOptJSONObject = new JSONObject(strTrim).optJSONObject("shares")) == null) {
                    kVar = new k(Collections.emptyMap());
                } else {
                    HashMap map = new HashMap();
                    String[] strArr = k.g;
                    for (int i = 0; i < 9; i++) {
                        String str2 = strArr[i];
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(str2);
                        if (jSONArrayOptJSONArray != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length() && arrayList.size() < 10000; i2++) {
                                String[] strArrM = k.m(str2, jSONArrayOptJSONArray.optString(i2, ""));
                                if (strArrM != null) {
                                    arrayList.add(new com.github.catvod.spider.merge.p021y.i(str2, strArrM[0], strArrM[1], true));
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                map.put(str2, arrayList);
                            }
                        }
                    }
                    kVar = new k(map);
                }
            } catch (Exception e) {
                SpiderDebug.log("Local share config error: " + e.getMessage());
                kVar = new k(Collections.emptyMap());
            }
        }
        this.b = kVar;
        this.c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault());
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
}

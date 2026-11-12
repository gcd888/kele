package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.C0299u0;
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
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.h0.n;
import com.github.catvod.spider.merge.h0.p;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.N;
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
import com.github.catvod.spider.merge.p017u.A;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.RunnableC0452d;
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
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class PanWebShare123 extends Cloud {
    public static final Pattern A;
    public static final Pattern B;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f76short = {1875, 377, 30391, 23795, 660, 664, 20822, -27145, 1245, 1246, 447, 448, 21012, 30547, 1928, 1935, 31404, -31190, 1250, 1254, 21757, 27006, 2445, 2460, 2451, 2508, 2511, 2510, 2466, 2446, 2456, 2441, 2441, 2452, 2451, 2458, 2446, -30011, 32277, 1064, 1077, 1080, 2927, 1727, 1763, 1781, 1777, 1762, 1779, 1784, 1726, 1784, 1764, 1789, 1711, 1787, 1781, 1769, 1767, 1791, 1762, 1780, 1709, 1139, 1138, 1120, 1035, 1054, 455, 463, 473, 473, 459, 461, 463, 1887, 1880, 1862, 2110, 2082, 2104, 2095, 2091, 2094, 2151, 1581, 1643, 1655, 1646, 3098, 3100, 3083, 3075, 3084, 3082, 3101, 1248, 1254, 1264, 1255, 1226, 1268, 1251, 1268, 1249, 1268, 1255, 1226, 1248, 1255, 1273, 2728, 2740, 2740, 2736, 1828, 3171, 3186, 3197, 3106, 3105, 3104, 3148, 3184, 3196, 3198, 3198, 3174, 3197, 3194, 3175, 3178, 3148, 3184, 3196, 3196, 3192, 3194, 3190, 831, 814, 801, 894, 893, 892, 784, 812, 800, 800, 804, 806, 810, 784, 807, 810, 803, 831, 2543, 2547, 2547, 2551, 548, 22445, 23219, 22248, 21422, -24578, -32385, 32389, 22443, 1872, 1885, 1858, 1818, 1881, 1873, 1863, 1863, 1877, 1875, 1873, -29477, 20978, 24097, 21282, 22177, 24777, 28711, -31270, 22168, 21230, 23869, 23809, -30443, -1220, -28729, 27888, 25557, 32014, 22282, -30442, 22471, -30373, 23065, 24175, 20924, 23743, 18044, 28571, -32430, -25168, -2115, -31930, 24689, 28500, 2290, 2270, 2270, 2266, 2264, 2260, 22272, 23070, 22085, 21251, -24749, -32302, 24205, 20830, 23645, 28598, 32600, 2572, 2640, 2632, 2628, 2572, 2645, 2632, 2628, 2634, 2576, 2572, 2582, 2561, 2565, 2560, 2633, 2576, 2573, 2576, 2568, 2561, 2632, 2628, 2634, 2576, 2572, 2582, 2561, 2565, 2560, 2619, 2583, 2577, 2566, 2574, 2561, 2567, 2576, 2632, 2628, 2634, 2567, 2565, 2582, 2560, 2633, 2576, 2573, 2576, 2568, 2561, 2422, 2421, 2420, 28793, 23165, 25912, 25026, 20932, 20514, -26900, 25015, 1899, 27778, 1692, 1677, 1666, 1757, 1758, 1759, 1715, 1679, 1667, 1665, 1665, 1689, 1666, 1669, 1688, 1685, 1715, 1679, 1667, 1667, 1671, 1669, 1673, 2019, 2034, 2045, 1954, 1953, 1952, 1996, 2032, 2044, 2044, 2040, 2042, 2038, 1996, 2043, 2038, 2047, 2019, 1654, 1639, 1640, 1591, 1588, 1589, 1625, 1653, 1635, 1650, 1650, 1647, 1640, 1633, 1653, 24181, -27958, 31977, -885, 29502, 21116, 20584, 25971, 26167, 24977, 28034, -27165, 27797, -25870, 29905, -2893, 31494, 23108, 30503, -31093, 32196, 21738, 3068, 3024, 3024, 3028, 3030, 3034, 1193, 1248, 1257, 1268, 1267, 1259, 1195, 974, 1012, 946, 942, 951, 22652, 21858, 32246, 30614, -28625, -29010, 29012, 22650, 870, 890, 890, 894, 893, 820, 801, 801, 831, 828, 829, 894, 879, 864, 872, 886, 800, 877, 865, 867, 2839, 2827, 2827, 2831, 2828, 2885, 2896, 2896, 2831, 2846, 2833, 2894, 2897, 2834, 2842, 25861, 16962, -31774, -29025, 17151, -3208, 21293, 22801, 23840, 26017, 30592, -604, 25527, -29046, 20654, 19459, 27587, -30978, 25504, 17639, 22746, 17527, -2595, -29457, 19740, -29070, 28070, 23068, 27620, 19888, -969, 24351, 26587, -30942, -543, -28977, -28977, -532, 20440, -27444, 30545, -29551, 28485, -295, 25850, 25300, 20437, 20446, 842, 778, 790, 790, 786, 785, 861, 856, 845, 845, 825, 828, 830, 785, 832, 837, 862, 860, 831, 841, 842, 861, 856, 830, 844, 778, 790, 783, 782, 843, 861, 843, 2384, 2384, 2375, 2370, 2319, 2319, 2319, 2340, 2390, 2385, 2375, 2384, 2375, 2370, 2377, 2378, 2379, 2340, 2319, 2307, 2379, 2309, 2340, 2390, 2331, 2327, 2325, 2308, 2377, 2378, 2379, 2312, 2329, 2326, 2340, 2390, 2384, 2375, 2370, 2331, 2327, 2325, 2308, 2331, 2326, 2385, 2308, 2315, 2320, 2329, 2314, 2333, 2340, 2390, 2377, 2378, 2379, 2312, 2329, 2326, 2340, 2390, 2331, 2326, 2385, 2391, 2384, 2375, 2370, 2315, 2308, 2377, 2378, 2379, 2312, 2329, 2326, 2385, 2391, 2339, 2342, 2340, 2315, 2394, 2399, 2372, 2374, 2341, 2387, 2385, 1923, 1940, 1937, 25723, 21629, 32682, 2007, -29676, -28091, 32682, 2007, 23661, 32682, 2007, 32682, 1922, 2039, 2008, 1921, 2032, 1937, -1871, 1942, 2038, 1940, 2039, 2008, 1921, 1923, 2032, 2026, 1926, 2033, 1994, 1926, 2001, 1947, 1926, 1938, 2038, 2000, 1951, 1927, 1939, 2006, 1922, 2135, 2123, 2129, 2118, 2114, 2119, 2062, 2059, 2175, 2119, 2056, 2058, 32718, 26833, 29730, 28422, 28069, -32423, -24824, 26496, 25891, -30241, -26738, -30331, 25887, 21815, -27653, -29318, 29312, 23470, 26294, -31738, -28860, -28395, 26766, 25735, 28463, 28517, -24970, -31847, -25144, 473, 469, 478, 479, -29053, 21564, 29455, 23073, -29326, 28926, 22992, 29077, 22715, 21472, 23058, -29178, -25318, -31764, 27094, 27509, 25107, -27904, 21159, 21606, -25912, 31768, 31116, 26100, -27749, -32042, 28950, 22427, 25602, 1396, 1404, 1386, 1386, 1400, 1406, 1404, 483, 509, 489, 26669, 22690, 941, 1002, 998, 1019, 944, 840, 2698, 2764, 2768, 2761, 2760, 2619, 2619, 2223, 2227, 2227, 2231, 2228, 2301, 1821, 1793, 1793, 1797, 1005, 928, 940, 942, 1542, 1611, 1606, 1709, 1713, 1713, 1717, 1718, 1791, 1770, 1770, 726, 2054, 2058, 2058, 2062, 2060, 2048, 2143, 1055, 2048, 1713, 1706, 1702, 1697, 1714, 1771, 30724, 29069, 2724, 2731, 2724, 2337, 2407, 2427, 2402, 2403, 904, 2417, 2358, 2362, 2343, 2412, 1267, 559, 617, 629, 620, 621, 21137, 22954, 19384, 24381, 20587, 26186, 22092, 32155, -30711, -27048, 31671, 22935, 31312, -25582, 27465, -2058, -26383, 28586, 3125, 14427, -840, 1203, 2022, -2786, 1046, 512, 529, 542, 519, 533, 530, 515, 536, 529, 514, 533, 577, 578, 579, 559, 531, 543, 543, 539, 537, 533, 3235, 3325, 3308, 3299, 3322, 3304, 3311, 3326, 3301, 3308, 3327, 3304, 3260, 3263, 3262, 3282, 3310, 3298, 3298, 3302, 3300, 3304, 23452, -26845, 30976, 27688, -26033, 29804, 1159, 1174, 1177, 1152, 1170, 1173, 1156, 1183, 1174, 1157, 1170, 1222, 1221, 1220, 1192, 1172, 1176, 1176, 1180, 1182, 1170, 1447, 1529, 1512, 1511, 1534, 1516, 1515, 1530, 1505, 1512, 1531, 1516, 1464, 1467, 1466, 1494, 1514, 1510, 1510, 1506, 1504, 1516, 3049, 1726, 1700, 1736, 1727, 1668, 1736, 1695, 1749, 1736, 1756, 1720, 1694, 1745, 1737, 1757, 1688, 664, 708, 664, 1432, 1414, 1413, 1412, 1479, 1494, 1497, 1432, 400, 403, 402, 465, 448, 463, 399, 450, 462, 460, 1101, 1102, 1103, 1036, 1053, 1042, 1106, 1055, 1042, 2526, 2501, 2508, 2527, 2504, 2435, 2460, 2463, 2462, 2525, 2508, 2499, 2435, 2510, 2499, 2101, 2102, 2103, 2098, 2108, 2096, 2090, 2151, 
    2155, 2153, 1791, 1788, 1789, 1782, 1784, 1787, 1760, 1709, 1697, 1699, 2614, 2613, 2612, 2622, 2614, 2613, 2601, 2660, 2664, 2666, 2912, 2915, 2914, 2916, 2920, 2915, 2943, 2866, 2878, 2876, 2585, 2589, 2566, 2565, 2564, 2667, 2624, 2636, 2564, 2634, 2667, 2585, 2644, 2648, 2650, 2584, 2591, 2568, 2573, 2628, 2635, 2566, 2565, 2564, 2631, 2646, 2649, 2590, 2584, 2585, 2589, 1323, 1316, 1319, 1341, 1324, 1382, 29797, -30405, -26774, 31365, -610, 354, 2621, 1269, 1266, 1249, 1208, 749, 1335, 1325, 1993, 1998, 2013, 1924, 2182, 878, 2002, 1987, 1996, 1939, 1936, 1937, 2045, 1985, 1997, 1999, 1999, 2007, 1996, 1995, 2006, 2011, 2045, 1985, 1997, 1997, 1993, 1995, 1991, -28067, 31870, 801, 802, 803, 31278, 20522, 851, 895, 895, 891, 889, 885, 29595, 21209, 30851, 30500, 865, 845, 845, 841, 843, 839, 2516, 2371, 2516, -26922, 24973, -718, 897, 1013, 918, 985, 990, 973, 916, 1010, 968, 900, 979, 1000, 900, 1011, 921, 900, 912, 1012, 898, 896, 897, 903, 899, 918, 896, 1013, 918, 985, 990, 973, 916, 1010, 968, 900, 979, 1000, 900, 1011, 921, 900, 912, 1012, 898, 1656, 1645, 1656, 1646, 618, 521, 582, 577, 594, 523, 621, 599, 539, 588, 631, 539, 620, 518, 539, 527, 619, 589, 514, 538, 526, 587, 2338, 27354, 23260, 28939, 2385, 2390, 2425, 2352, -2544, 2391, 2336, 2385, 2411, 2343, 2416, 2379, 2343, 2384, 2362, 2343, 2355, 2391, 2417, 2366, 2342, 2354, 2423, 2422, -32075, -25372, 28939, 2385, 2390, 2425, 2352, -2544, 2391, 2336, 2385, 2411, 2343, 2416, 2379, 2343, 2384, 2362, 2343, 2355, 2391, 2417, 2366, 2342, 2354, 2423, 2422, 21196, 28939, 2385, 2390, 2425, 2352, -2544, 2391, 2336, 2385, 2411, 2343, 2416, 2379, 2343, 2384, 2362, 2343, 2355, 2391, 2417, 2366, 2342, 2354, 2423, 2422, 28939, 2385, 2390, 2425, 2352, -2544, 2391, 2336, 2385, 2411, 2343, 2416, 2379, 2343, 2384, 2362, 2343, 2355, 2391, 2417, 2366, 2342, 2354, 2423, 2339, 2645, 2581, 2569, 2569, 2573, 2574, 2626, 2631, 2642, 2642, 2598, 2595, 2593, 2574, 2592, 2646, 2644, 2645, 27053, 22955, 29308, 2598, 2593, 2574, 2631, -2713, 2592, 2647, 2561, -32318, -24685, 29308, 2598, 2593, 2574, 2631, -2713, 2592, 2647, 2561, 20923, 29308, 2598, 2593, 2574, 2631, -2713, 2592, 2647, 2561, 29308, 2598, 2593, 2574, 2631, -2713, 2592, 2647, 2644, 2645, 2598, 2588, 2640, 2567, 2620, 2640, 2599, 2637, 2640, 2628, 2592, 2566, 2633, 2641, 2629, 2560, 2644, 364, 377, 375, 312, 319, 300, 373, 364, 379, 496, 503, 1636, 1543, 1636, 1543, 1608, 1615, 1628, 1541, 2166, 2105, 2110, 2093, 2164, 2296, 2281, 2278, 2233, 2234, 2235, 2263, 2283, 2279, 2279, 2275, 2273, 2285, 2263, 2272, 2285, 2276, 2296, 1401, 1365, 1365, 1361, 1363, 1375, -31091, 22252, 24675, 32561, 27543, -29841, 18240, 32023, 2153, 2134, 2142, 25968, -32265, 24151, 2079, 2184, 2079, -30014, 22912, 24054, 21029, 21017, -31219, -3022, -30621, 23329, 24407, 20612, 20664, -31572, -2413, 2497, 2525, 2525, 2521, 2473, 680, 672, 694, 694, 676, 674, 672, 2937, 2919, 2931, 1204, 2532, 2178, -29746, 22668, 23802, 21289, 21269, -30975, -2754, 28766, 24297, 21680, -31952, 26735, 23142, 22274, -30805, 21407, 18202, 21407, 23753, 22858, -30948, -32629, 18124, -30790, -2101, 17954, 22922, 25935, -30512, 23233, 18028, -30526, 32323, 22922, 32444, 25990, -26360, 1200, 1271, 1275, 1254, 1197, 2843, 783, 839, 843, 858, 857, 786, 812, 863, 2787, 2279, 2209, 2237, 2212, 2213, 1612, 1635, 1595, 1630, 1615, 1600, 1625, 1611, 1612, 1629, 1606, 1615, 1628, 1611, 1567, 1564, 1565, 1649, 1613, 1601, 1601, 1605, 1607, 1611, 3322, 3229, 3224, 3320, 3227, 3309, 3320, 3258, 3296, 3310, 3321, 3324, 3301, 3226, 3234, 3309, 3325, 3258, 3301, 3262, 3229, 3226, 3234, 3239, 3307, 3232, 3207, 3307, 3200, 3227, 3309, 3325, 3258, 3229, 3239, 3307, 3260, 3227, 3309, 3325, 3311, 1203, 1269, 1257, 1264, 1265, 2490, 2470, 2470, 2466, 2465, 2536, 2557, 2557, 2479, 2485, 2521, 2478, 2453, 2521, 2446, 2500, 2521, 2509, 2473, 2447, 2496, 2520, 2508, 2441, 1879, 1876, 1877, 1814, 1799, 1800, 1792, 1822, 1849, 1797, 1801, 1801, 1805, 1807, 1795, 1198, 1186, 1186, 1190, 1188, 1192, 3168, 3181, 3186, 3114, 3177, 3169, 3191, 3191, 3173, 3171, 3169, 560, 558, 618, 615, 632, 558, 560, 558, 618, 615, 632, 544, 623, 610, 619, 636, 634, 546, 558, 560, 558, 618, 615, 632, 544, 623, 610, 619, 636, 634, 546, 558, 560, 558, 637, 619, 621, 634, 615, 609, 608, 558, 560, 558, 618, 615, 632, 544, 623, 610, 619, 636, 634, 2080, 2074, 2089, 2099, 2084, 2087, 2076, 1447, 1469, 1450, 1449, 480, 508, 508, 504, 2291, 2223, 2291, 339, 264, 339, 2690, 2716, 2719, 2718, 2781, 2764, 2755, 2690, 1028, 1054, 1138, 1029, 1086, 1138, 1061, 1135, 1138, 1126, 1026, 1060, 1131, 1139, 1127, 1058, 634, 565, 562, 545, 632, 2382, 2386, 2376, 2399, 2395, 2398, 2327, 1045, 2476, 2442, 2460, 2443, 2516, 2488, 2462, 2460, 2455, 2445, 1805, 1839, 1850, 1833, 1836, 1836, 1825, 1903, 1909, 1902, 1904, 1888, 1896, 1815, 1833, 1838, 1828, 1839, 1847, 1843, 1888, 1806, 1812, 1888, 1905, 1904, 1902, 1904, 1915, 1888, 1815, 1833, 1838, 1910, 1908, 1915, 1888, 1848, 1910, 1908, 1897, 1888, 1793, 1840, 1840, 1836, 1829, 1815, 1829, 1826, 1803, 1833, 1844, 1903, 1909, 1907, 1911, 1902, 1907, 1910, 1888, 1896, 1803, 1800, 1812, 1805, 1804, 1900, 1888, 1836, 1833, 1835, 1829, 1888, 1799, 1829, 1827, 1835, 1839, 1897, 1888, 1795, 1832, 1842, 1839, 1837, 1829, 1903, 1911, 1911, 1902, 1904, 1902, 1907, 1912, 1910, 1909, 1902, 1913, 1904, 1888, 1811, 1825, 1830, 1825, 1842, 1833, 1903, 1909, 1907, 1911, 1902, 1907, 1910, 3038, 3049, 3050, 3049, 3070, 3049, 3070, 2157, 2127, 2127, 2121, 2140, 2136, 2049, 2144, 2125, 2114, 2123, 2137, 2125, 2123, 2121, 481, 499, 438, 472, 469, 439, 481, 499, 416, 490, 422, 427, 437, 418, 439, 510, 501, 416, 490, 422, 427, 437, 419, 439, 510, 501, 438, 476, 473, 416, 490, 422, 427, 437, 428, 439, 510, 501, 438, 462, 456, 416, 490, 422, 427, 437, 429, 981, 1017, 1017, 1021, 1023, 1011, 1027, 1050, 1112, 1026, 1054, 1028, 1043, 1047, 1042, 1050, 1055, 1029, 1026, 1110, 1096, 1110, 1050, 
    1055, 1096, 1495, 1483, 1483, 1487, 571, 570, 555, 2144, 2170, 2157, 2158, 3188, 511, 506, 495, 506, 438, 491, 503, 506, 504, 510, 502, 510, 501, 495, 2165, 2158, 2161, 2033, 2044, 2019, 1973, 1963, 1973, 2033, 2044, 2019, 1979, 2022, 2016, 2039, 2047, 2032, 2038, 2017, 1973, 1963, 1973, 2036, 1977, 1973, 2033, 2044, 2019, 1973, 1963, 1973, 2033, 2044, 2019, 1979, 2022, 2017, 2028, 2041, 2032, 1958, 1994, 2022, 2016, 2039, 2047, 2032, 2038, 2017, 1973, 1963, 1973, 2036, 2350, 2415, 2417, 2415, 2342, 2338, 2344, 1012, 1017, 998, 944, 942, 944, 1012, 1017, 998, 958, 995, 997, 1010, 1018, 1013, 1011, 996, 944, 942, 944, 1009, 958, 1010, 1009, 1012, 1015, 1013, 956, 944, 1012, 1017, 998, 944, 942, 944, 1012, 1017, 998, 958, 995, 996, 1001, 1020, 1013, 931, 975, 995, 997, 1010, 1018, 1013, 1011, 996, 944, 942, 944, 1009, 958, 1010, 1009, 1012, 1015, 1013, 2017, 2011, 2024, 2034, 2021, 2022, 1962, 1981, 2036, 2024, 2034, 2021, 2017, 2020, 1965, 2013, 598, 586, 592, 583, 579, 582, 527, 577, 592, 583, 579, 598, 583, 1624, 1566, 1538, 1563, 1320, 1333, 1320, 1328, 1337, 818, 823, 882, 894, 880, 829, 831, 812, 826, 882, 894, 880, 819, 827, 826, 823, 831, 882, 894, 880, 810, 822, 812, 827, 831, 826, 882, 894, 880, 818, 823, 813, 810, 883, 825, 812, 817, 811, 814, 883, 823, 810, 827, 819, 1183, 1179, 1169, 608, 556, 559, 554, 553, 555, 610, 622, 608, 570, 559, 553, 610, 622, 608, 570, 555, 566, 570, 611, 547, 571, 570, 555, 554, 2347, 2317, 2331, 2316, 2387, 2367, 2329, 2331, 2320, 2314, 2917, 2887, 2898, 2881, 2884, 2884, 2889, 2823, 2845, 2822, 2840, 2824, 2816, 2881, 2936, 2880, 2887, 2886, 2893, 2835, 2824, 2923, 2936, 2941, 2824, 2881, 2936, 2880, 2887, 2886, 2893, 2824, 2919, 2939, 2824, 2841, 2846, 2935, 2846, 2824, 2884, 2881, 2883, 2893, 2824, 2917, 2889, 2891, 2824, 2919, 2939, 2824, 2928, 2817, 2824, 2921, 2904, 2904, 2884, 2893, 2943, 2893, 2890, 2915, 2881, 2908, 2823, 2846, 2840, 2845, 2822, 2841, 2822, 2841, 2845, 2824, 2816, 2915, 2912, 2940, 2917, 2916, 2820, 2824, 2884, 2881, 2883, 2893, 2824, 2927, 2893, 2891, 2883, 2887, 2817, 2824, 2942, 2893, 2906, 2907, 2881, 2887, 2886, 2823, 2841, 2846, 2822, 2846, 2824, 2917, 2887, 2890, 2881, 2884, 2893, 2823, 2841, 2845, 2925, 2841, 2844, 2832, 2824, 2939, 2889, 2894, 2889, 2906, 2881, 2823, 2846, 2840, 2844, 2822, 2841, 2880, 2935, 2932, 2935, 2912, 2935, 2912, 2222, 2267, 2212, 2195, 2183, 2179, 2195, 2181, 2178, 2195, 2194, 2267, 2209, 2207, 2178, 2206, 1482, 1503, 1502, 1498, 1510, 1510, 1506, 1472, 1527, 1507, 1511, 1527, 1505, 1510, 1337, 1301, 1301, 1297, 1299, 1311, 2817, 2819, 2836, 2825, 2831, 2830, 861, 863, 842, 859, 857, 849, 844, 839, 893, 849, 848, 842, 859, 848, 842, 1298, 1299, 1282, 1303, 1311, 1306, 1333, 1305, 1304, 1282, 1299, 1304, 1282, 1969, 1974, 1972, 1980, 1946, 1974, 1975, 1965, 1980, 1975, 1965, 398, 404, 393, 408, 2043, 2023, 2023, 2019, 2203, 2198, 2194, 2199, 1814, 1818, 1818, 1822, 1820, 1808, 1236, 1239, 1238, 1173, 1156, 1163, 1155, 1181, 1210, 1158, 1162, 1162, 1166, 1164, 1152, 651, 705, 716, 732, 762, 710, 714, 714, 718, 716, 704, 2866, 2879, 2863, 2825, 2869, 2873, 2873, 2877, 2879, 2867, 25707, 28062, 22564, 23906, 25077, 31519, 28884, 25187, 28352, 27194, 23100, 23514, 23045, 31938, 30395, 32562, -25324, 27215, -32190, 24949, 28240, 2436, 2439, 2438, 30436, 32621, 27928, 27787, 22197, 22726, 14772, 28811, 23183, 2550, 2522, 2522, 2526, 2524, 2512, 27555, 22435, 21221, 28570, 23955, 18296, -24907, 24427, 20664, 31007, 28822, 28373, 25579, -26796, 21913, 27579, 23485, 27846, 27989, 23164, -32765, -2201, 32415, 27598, -26526, 27266, 30420, -31356, 27846, 27989, 497, 497, -27387, 25182, 449, 976, 1377, 1349, 1349, 1349, 22681, 29290, 28686, 28389, 23067, 20559, -25222, 27169, 1036, 1050, 1054, 1037, 1052, 1047, 1084, 1040, 1041, 1035, 1050, 1041, 1035, 2849, 2871, 2867, 2848, 2865, 2874, 2833, 2877, 2876, 2854, 2871, 2876, 2854, 22792, 21526, 22605, 23819, -28325, -28710, 20613, 24406, 21077, 25022, 29008, -1705, -29268, 22291, -26858, 31029, 32613, 21857, 1560, 1588, 1588, 1584, 1586, 1598, -31672, 22282, 21372, 23727, 23699, -30585, -1352, 23476, 24306, 1515, 1510, 24642, 24810, 1809, 1830, 1829, 1830, 1841, 1830, 1841, 1400, 1349, 1374, 1360, 1374, 1369, 589, 568, 583, 624, 612, 608, 624, 614, 609, 624, 625, 568, 578, 636, 609, 637, 2573, 2584, 2585, 2589, 2593, 2593, 2597, 2567, 2608, 2596, 2592, 2608, 2598, 2593, 1330, 1310, 1311, 1285, 1300, 1311, 1285, 1372, 1317, 1288, 1281, 1300, 2376, 2393, 2393, 2373, 2368, 2378, 2376, 2397, 2368, 2374, 2375, 2310, 2385, 2308, 2398, 2398, 2398, 2308, 2383, 2374, 2395, 2372, 2308, 2396, 2395, 2373, 2380, 2375, 2378, 2374, 2381, 2380, 2381, 2322, 2313, 2378, 2369, 2376, 2395, 2394, 2380, 2397, 2324, 2428, 2429, 2415, 2308, 2321, 946, 953, 949, 930, 943, 934, 947, 511, 995, 1012, 997, 996, 995, 1023, 974, 1017, 997, 1020, 1021, 1257, 1878, 1874, 1864, 1875, 1858, 1879, 1870, 1859, 840, 832, 854, 854, 836, 834, 832, 2516, 2512, 2508, 2502, 2510, 2554, 2519, 2496, 2517, 2505, 2524, 2554, 2504, 2496, 2518, 2518, 2500, 2498, 2496, 1542, 1709, 1778, 1773, 1777, 1782, 1711, 1761, 1776, 1767, 1763, 1782, 1767, 1711, 2270, 2242, 2269, 2203, 2183, 2206, -30103, 22827, 23901, 21134, 21170, -31066, -2919, -29709, 22705, 23751, 21268, 22507, 17460, 28596};
    public static final String[] v;
    public static volatile String w;
    public static final String[] x;
    public static final Pattern y;
    public static final Pattern z;
    public String r = v[0];
    public String s = "";
    public String t = "";
    public long u = 0;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z2) {
        return searchContent(str, z2, C0017.m65(f76short, 0, 1, 1890));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0047.m186(f76short, 1, 1, 331), C0142.m567(f76short, 2, 2, 898), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0053.m210(f76short, 4, 2, 672), C0118.m471(f76short, 6, 2, 817), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0112.m445(f76short, 8, 2, 1256), C0103.m408(f76short, 10, 4, 395), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0063.m249(f76short, 14, 2, 1981), C0030.m116(f76short, 16, 2, 1104), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0106.m422(f76short, 18, 2, 1233), C0143.m570(f76short, 20, 2, 1621), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0119.m473(f76short, 22, 15, 2557), C0056.m223(f76short, 37, 2, 379), null));
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, new ArrayList());
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z2, String str2) {
        String strM1 = C0001.m1(f76short, 39, 3, 1116);
        if (!C0103.m408(f76short, 42, 1, 2910).equals(str2)) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(X1.X(this.r + C0032.m126(f76short, 43, 20, 1680) + URLEncoder.encode(str, C0087.m346(f76short, 63, 5, 1062)), null, K())).optJSONArray(C0105.m416(f76short, 68, 7, 426));
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray == null) {
                return com.github.catvod.spider.merge.p001b.g.y(arrayList);
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString(C0008.m31(f76short, 75, 3, 1834), "");
                    if (TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString(strM1, ""))) {
                        strOptString = C0087.m346(f76short, 78, 7, 2122) + jSONObjectOptJSONObject.optString(strM1) + C0028.m108(f76short, 85, 4, 1539);
                    }
                    String strT = t(jSONObjectOptJSONObject.optString(C0032.m126(f76short, 89, 7, 3177), ""));
                    String strOptString2 = jSONObjectOptJSONObject.optString(C0018.m70(f76short, 96, 15, 1173), "");
                    if (!TextUtils.isEmpty(strOptString2) && !strOptString2.startsWith(C0090.m358(f76short, 111, 4, 2752))) {
                        strOptString2 = this.r + C0053.m210(f76short, 115, 1, 1803) + M(strOptString2);
                    }
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strT)) {
                        arrayList.add(new k(strOptString, strT, strOptString2, ""));
                    }
                }
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.D.b.d();
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        if (list == null || list.isEmpty()) {
            return AbstractC0449a.b();
        }
        String str = list.get(0);
        String strT = "";
        if (C0006.m21(f76short, 116, 23, 3091).equals(str) || C0045.m177(f76short, 139, 18, 847).equals(str)) {
            AbstractC0302v0.g0(str, new i(13, this));
            return "";
        }
        String str2 = str.startsWith(C0089.m355(f76short, 157, 4, 2439)) ? str : this.r + C0103.m408(f76short, 161, 1, 523) + M(str);
        try {
            ArrayList arrayList = new ArrayList();
            com.github.catvod.spider.merge.f0.g gVarL = null;
            boolean zW = false;
            boolean zContains = false;
            for (int i = 0; i < 3; i++) {
                gVarL = X1.L(X1.X(str2, null, B()), this.r);
                if (C(gVarL)) {
                    return o(C0115.m459(f76short, 162, 8, 2302));
                }
                arrayList = y(gVarL);
                String strM42 = C0011.m42(f76short, 170, 11, 1844);
                com.github.catvod.spider.merge.f0.k kVarR = gVarL == null ? null : gVarL.R(strM42);
                zContains = (kVarR == null ? gVarL.Q(strM42).g() : kVarR.T()).contains(C0028.m108(f76short, 181, 7, 1836));
                if (!arrayList.isEmpty() || !zContains) {
                    break;
                    break;
                }
                if (!zW && !(zW = w(str, str2))) {
                    return o(TextUtils.isEmpty(this.t) ? C0119.m473(f76short, 188, 14, 1072) : this.t);
                }
                try {
                    Thread.sleep(1200L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            if (gVarL == null) {
                return com.github.catvod.spider.merge.p001b.g.s(new k());
            }
            ArrayList arrayListG = G(arrayList);
            if (arrayListG.isEmpty() && zContains) {
                return o(zW ? C0047.m186(f76short, 202, 19, 2225) : C0011.m42(f76short, 221, 11, 2131));
            }
            com.github.catvod.spider.merge.f0.k kVarR2 = gVarL.R(C0103.m408(f76short, 232, 51, 2660));
            if (kVarR2 != null) {
                strT = t(kVarR2.T());
            }
            if (TextUtils.isEmpty(strT)) {
                strT = gVarL.Y();
            }
            k kVar = new k();
            kVar.n(str);
            kVar.o(strT);
            kVar.p(AbstractC0302v0.W0());
            kVar.i(C0044.m175(f76short, 283, 5, 2375));
            kVar.s(arrayListG.isEmpty() ? C0085.m339(f76short, 288, 6, 530) : H(arrayListG) + C0104.m414(f76short, 294, 1, 1867) + arrayListG.size() + C0079.m314(f76short, 295, 1, 3043));
            kVar.l(n(str2, arrayListG));
            if (!arrayListG.isEmpty()) {
                String strB = b(arrayListG);
                kVar.q(a(arrayListG));
                kVar.r(strB);
                AbstractC0280n1.p(strT);
                AbstractC0280n1.q(strB);
            }
            boolean z2 = FishCrypto.a;
            N1.d(kVar);
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        } catch (Exception unused2) {
            return AbstractC0449a.b();
        }
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        if (C0092.m365(f76short, 296, 23, 1772).equals(str)) {
            InitOrigin.run(new RunnableC0452d(26));
            return "";
        }
        if (!C0133.m529(f76short, 319, 18, 1939).equals(str)) {
            return "";
        }
        InitOrigin.run(new A(10));
        return "";
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z2, HashMap<String, String> map) {
        int iMax;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
            iMax = 1;
        }
        if (C0118.m471(f76short, 337, 15, 1542).equals(str)) {
            if (iMax > 1) {
                return L(new ArrayList());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(p(hasSavedCookie() ? C0082.m325(f76short, 352, 12, 903) : C0081.m322(f76short, 364, 16, 3007)));
            arrayList.add(q());
            return L(arrayList);
        }
        try {
            com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(this.r + C0070.m277(f76short, 380, 7, 1158) + str + C0044.m175(f76short, 387, 1, 995) + iMax + C0101.m402(f76short, 388, 4, 986), null, B()), this.r);
            if (C(gVarL)) {
                return o(C0092.m365(f76short, 392, 8, 1839));
            }
            ArrayList arrayListI = I(gVarL);
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.F(arrayListI);
            gVar.o(iMax, arrayListI.isEmpty() ? iMax : iMax + 1, 20, (iMax * 20) + arrayListI.size());
            return gVar.r();
        } catch (Exception unused2) {
            return com.github.catvod.spider.merge.D.b.d();
        }
    }

    static {
        String[] strArr = {C0026.m102(f76short, 400, 20, 782), C0091.m360(f76short, 420, 15, 2943)};
        v = strArr;
        w = strArr[0];
        x = new String[]{C0044.m175(f76short, 451, 7, 2780), C0087.m346(f76short, 458, 8, 822), C0019.m75(f76short, 466, 7, 749), C0073.m288(f76short, 473, 10, 469), C0081.m322(f76short, 435, 6, 3193), C0001.m1(f76short, 441, 10, 680)};
        y = Pattern.compile(C0043.m169(f76short, 483, 32, 866), 2);
        z = Pattern.compile(C0059.m234(f76short, 515, 90, 2424), 2);
        A = Pattern.compile(C0118.m471(f76short, 605, 46, 1963), 2);
        B = Pattern.compile(C0010.m36(f76short, 651, 12, 2083), 2);
    }

    public static String A(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strTrim = E(str).trim();
        String strB1 = AbstractC0302v0.b1(strTrim);
        return (TextUtils.isEmpty(strB1) || !C0299u0.e0(strB1)) ? "" : strTrim;
    }

    public static boolean C(com.github.catvod.spider.merge.f0.g gVar) {
        if (gVar == null) {
            return false;
        }
        String strT = gVar.T();
        return strT.contains(C0137.m545(f76short, 663, 7, 2790)) || strT.contains(C0112.m445(f76short, 670, 7, 608)) || strT.contains(C0130.m516(f76short, 677, 8, 1275)) || strT.contains(C0095.m379(f76short, 685, 7, 2086));
    }

    public static boolean D(N n) {
        String strM83 = C0021.m83(f76short, 692, 4, 442);
        String strA = n.a();
        if (n.a >= 400) {
            return false;
        }
        if (strA == null) {
            strA = "";
        }
        if (!strA.contains(C0049.m193(f76short, 696, 4, 1396)) && !strA.contains(C0006.m21(f76short, 700, 3, 1669)) && !strA.contains(C0076.m301(f76short, 703, 3, 2030))) {
            String strM70 = C0018.m70(f76short, 706, 2, 803);
            if (!strA.contains(strM70)) {
                String strM42 = C0011.m42(f76short, 708, 2, 2051);
                if (!strA.contains(strM42) && !strA.contains(C0009.m33(f76short, 710, 2, 3126)) && !strA.contains(C0093.m368(f76short, 712, 2, 1360)) && !strA.contains(C0139.m554(f76short, 714, 2, 2957)) && !strA.contains(C0019.m75(f76short, 716, 2, 601)) && !strA.contains(C0021.m83(f76short, 718, 2, 2496)) && !strA.contains(C0097.m386(f76short, 720, 3, 2327)) && !strA.contains(C0090.m358(f76short, 723, 2, 3130))) {
                    try {
                        JSONObject jSONObject = new JSONObject(strA);
                        if (jSONObject.has(strM83)) {
                            return jSONObject.optInt(strM83, -1) == 0;
                        }
                        String str = jSONObject.optString(C0010.m36(f76short, 725, 7, 1305), "") + jSONObject.optString(C0047.m186(f76short, 732, 3, 398), "");
                        if (str.contains(C0056.m223(f76short, 735, 2, 2621))) {
                            return true;
                        }
                        return (str.contains(strM70) || str.contains(strM42)) ? false : true;
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return false;
    }

    public static String E(String str) {
        if (str == null) {
            return "";
        }
        String strReplace = str.trim().replace(C0128.m511(f76short, 737, 5, 907), C0046.m182(f76short, 742, 1, 878)).replace(C0081.m322(f76short, 743, 5, 2724), "");
        if (strReplace.startsWith(C0097.m386(f76short, 748, 2, 2580))) {
            strReplace = C0137.m545(f76short, 750, 6, 2247).concat(strReplace);
        }
        if (strReplace.toLowerCase().startsWith(C0142.m567(f76short, 756, 4, 1909))) {
            return strReplace;
        }
        return (strReplace.contains(C0116.m463(f76short, 760, 4, 963)) || strReplace.contains(C0055.m219(f76short, 764, 3, 1576))) ? C0115.m459(f76short, 767, 8, 1733).concat(strReplace) : strReplace;
    }

    public static String F(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        if (TextUtils.isEmpty(strTrim)) {
            return "";
        }
        if (strTrim.startsWith(C0030.m116(f76short, 775, 1, 685))) {
            String strV = v(strTrim);
            if (!TextUtils.isEmpty(strV)) {
                return strV;
            }
        }
        if (strTrim.toLowerCase().startsWith(C0109.m432(f76short, 776, 7, 2149))) {
            strTrim = strTrim.substring(7).trim();
        }
        String strM54 = C0014.m54(f76short, 783, 1, 1042);
        String strM358 = C0090.m358(f76short, 784, 1, 2058);
        return com.github.catvod.spider.merge.D.b.k(strTrim, strM54, strM358, strM358, C0050.m199(f76short, 785, 2, 1674));
    }

    public static ArrayList G(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strA = A((String) it.next());
            if (!TextUtils.isEmpty(strA)) {
                linkedHashSet.add(strA);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(linkedHashSet);
        if (arrayList2.size() == 2) {
            ArrayList arrayList3 = new ArrayList();
            for (String str : arrayList2) {
                if (str.contains(C0093.m368(f76short, 787, 4, 1750))) {
                    arrayList3.add(str);
                }
            }
            if (!arrayList3.isEmpty()) {
                return arrayList3;
            }
        }
        return arrayList2;
    }

    public static String H(ArrayList arrayList) {
        String strM486;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strM486 = C0122.m486(f76short, 791, 2, 1877);
            if (!zHasNext) {
                break;
            }
            String strB1 = AbstractC0302v0.b1((String) it.next());
            String strC1 = TextUtils.isEmpty(strB1) ? "" : AbstractC0302v0.c1(strB1);
            if (!TextUtils.isEmpty(strC1)) {
                strM486 = strC1;
            }
            if (!TextUtils.isEmpty(strM486)) {
                linkedHashSet.add(strM486);
            }
        }
        if (linkedHashSet.isEmpty()) {
            return strM486;
        }
        return TextUtils.join(C0044.m175(f76short, 793, 3, 2692), new ArrayList(linkedHashSet));
    }

    public static String J(String str) {
        if (str == null) {
            return "";
        }
        Object objProcessExtractionCode = processExtractionCode(str.replace(C0082.m325(f76short, 796, 5, 2319), ""));
        return objProcessExtractionCode instanceof String ? E((String) objProcessExtractionCode) : "";
    }

    public static String L(ArrayList arrayList) {
        int size = arrayList.size();
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayList);
        gVarC.o(1, 1, Math.max(1, size), size);
        return gVarC.r();
    }

    public static String M(String str) {
        String strSubstring = str;
        while (strSubstring.startsWith(C0120.m477(f76short, 801, 1, 935))) {
            strSubstring = strSubstring.substring(1);
        }
        return strSubstring;
    }

    public static String N(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strReplace = str.replace(C0119.m473(f76short, 802, 5, 2391), C0098.m390(f76short, 807, 1, 1237)).replace(C0133.m529(f76short, 808, 5, 513), "");
        String[] strArr = {C0055.m219(f76short, 818, 3, 1434), C0122.m486(f76short, 821, 3, 950), C0109.m432(f76short, 824, 2, 593), C0030.m116(f76short, 813, 2, 2972), C0049.m193(f76short, 815, 3, 1125), C0140.m558(f76short, 826, 3, 2284), C0142.m567(f76short, 829, 3, 3087)};
        for (int i = 0; i < 7; i++) {
            int iIndexOf = strReplace.indexOf(strArr[i]);
            if (iIndexOf > 0) {
                strReplace = strReplace.substring(0, iIndexOf);
            }
        }
        while (true) {
            if (!strReplace.endsWith(C0117.m467(f76short, 832, 1, 2137)) && !strReplace.endsWith(C0143.m570(f76short, 833, 1, 948)) && !strReplace.endsWith(C0117.m467(f76short, 834, 1, 1183)) && !strReplace.endsWith(C0092.m365(f76short, 835, 1, 2013)) && !strReplace.endsWith(C0074.m292(f76short, 836, 1, 2565)) && !strReplace.endsWith(C0049.m193(f76short, 837, 1, 1077))) {
                return strReplace.trim();
            }
            strReplace = com.github.catvod.spider.merge.D.b.g(strReplace, 1, 0);
        }
    }

    public static void clearCookie() {
        boolean z2 = FishCrypto.a;
        C0297t1.b(C0019.m75(f76short, 838, 21, 624));
        C0297t1.b(C0090.m358(f76short, 859, 22, 3213));
    }

    public static String getCookieStatus() {
        return hasSavedCookie() ? C0090.m358(f76short, 881, 3, 1646) : C0126.m503(f76short, 884, 3, 2818);
    }

    public static String getCurrentSiteUrl() {
        return TextUtils.isEmpty(w) ? v[0] : w;
    }

    public static String getSavedCookie() {
        boolean z2 = FishCrypto.a;
        String strF = F(C0297t1.h(C0115.m459(f76short, 887, 21, 1271)));
        return TextUtils.isEmpty(strF) ? F(C0297t1.h(C0081.m322(f76short, 908, 22, 1417))) : strF;
    }

    public static boolean hasSavedCookie() {
        return !TextUtils.isEmpty(getSavedCookie());
    }

    public static void i(String str, ArrayList arrayList) {
        String strTrim = E(str).trim();
        if (TextUtils.isEmpty(strTrim) || !AbstractC0302v0.s0(strTrim)) {
            return;
        }
        String strA = A(strTrim);
        if (TextUtils.isEmpty(strA) || arrayList.contains(strA)) {
            return;
        }
        arrayList.add(strA);
    }

    public static void j(String str, ArrayList arrayList) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strTrim = str.trim();
        while (strTrim.endsWith(C0046.m182(f76short, 930, 1, 3014))) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
        }
        if (TextUtils.isEmpty(strTrim) || arrayList.contains(strTrim)) {
            return;
        }
        arrayList.add(strTrim);
    }

    public static String k(String str, String str2) {
        String strX = x(str2);
        if (TextUtils.isEmpty(strX) && str2 != null && str2.matches(C0010.m36(f76short, 931, 16, 1765))) {
            strX = str2;
        }
        if (TextUtils.isEmpty(strX)) {
            return str2 == null ? "" : str2;
        }
        String lowerCase = str.toLowerCase();
        if ((!lowerCase.contains(C0017.m65(f76short, 947, 3, 695)) && !lowerCase.contains(C0044.m175(f76short, 950, 8, 1463))) || (!lowerCase.contains(C0001.m1(f76short, 958, 10, 417)) && !lowerCase.contains(C0006.m21(f76short, 968, 9, 1148)) && !lowerCase.contains(C0096.m382(f76short, 977, 15, 2477)) && !lowerCase.contains(C0046.m182(f76short, 992, 10, 2052)) && !lowerCase.contains(C0130.m516(f76short, 1002, 10, 1742)) && !lowerCase.contains(C0101.m402(f76short, 1012, 10, 2567)) && !lowerCase.contains(C0109.m432(f76short, 1022, 10, 2897)) && !lowerCase.matches(C0006.m21(f76short, 1032, 31, 2615)))) {
            return (!str.contains(C0082.m325(f76short, 1063, 6, 1352)) || str2.contains(C0074.m292(f76short, 1069, 1, 3172))) ? str2 : C0091.m360(f76short, 1070, 4, 644).concat(str2);
        }
        StringBuilder sb = new StringBuilder();
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strM301 = C0076.m301(f76short, 1074, 1, 349);
        if (!zIsEmpty && str.contains(strM301)) {
            strM301 = C0059.m234(f76short, 1075, 1, 2587);
        }
        return com.github.catvod.spider.merge.D.b.n(sb, strM301, C0122.m486(f76short, 1076, 4, 1157), strX);
    }

    public static void l(StringBuilder sb, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(C0092.m365(f76short, 1080, 1, 743));
        }
        sb.append(str);
        sb.append(C0085.m339(f76short, 1081, 2, 1293));
        sb.append(str2);
    }

    public static String m(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        String strM249 = C0063.m249(f76short, 1083, 4, 1977);
        if (str.contains(strM249)) {
            return str;
        }
        StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(str);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strM108 = C0028.m108(f76short, 1087, 1, 2233);
        if (!zIsEmpty && str.contains(strM108)) {
            strM108 = C0053.m210(f76short, 1088, 1, 840);
        }
        return com.github.catvod.spider.merge.D.b.n(sbO, strM108, strM249, str2);
    }

    public static String o(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p(str));
        arrayList.add(q());
        return L(arrayList);
    }

    public static k p(String str) {
        String strM471 = str;
        k kVar = new k();
        String strM21 = C0006.m21(f76short, 1089, 23, 1954);
        kVar.n(strM21);
        kVar.o(C0125.m499(f76short, 1112, 13, 784));
        kVar.p(AbstractC0302v0.W0());
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(strM471)) {
            strM471 = C0118.m471(f76short, 1125, 10, 802);
        }
        sb.append(strM471);
        sb.append(C0116.m463(f76short, 1135, 3, 2548));
        sb.append(getCurrentSiteUrl());
        kVar.s(sb.toString());
        kVar.g(strM21);
        return kVar;
    }

    public static Object processExtractionCode(Object obj) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String strReplaceAll = Pattern.compile(C0081.m322(f76short, 1141, 43, 937)).matcher(((String) obj).replace(C0142.m567(f76short, 1138, 3, 552), "")).replaceAll(C0114.m454(f76short, 1184, 4, 1628));
        return Pattern.compile(C0105.m416(f76short, 1402, 2, 467)).matcher(Pattern.compile(C0126.m503(f76short, 1404, 8, 1592)).matcher(Pattern.compile(C0074.m292(f76short, 1188, 22, 566), 2).matcher(strReplaceAll).find() ? Pattern.compile(C0081.m322(f76short, 1210, 106, 2314)).matcher(strReplaceAll).replaceAll("").trim() : Pattern.compile(C0001.m1(f76short, 1316, 77, 2685), 2).matcher(strReplaceAll).replaceAll(C0130.m516(f76short, 1393, 9, 328))).replaceAll(C0072.m285(f76short, 1412, 5, 2121))).replaceAll("");
    }

    public static k q() {
        k kVar = new k();
        String strM539 = C0135.m539(f76short, 1417, 18, 2184);
        kVar.n(strM539);
        kVar.o(C0128.m511(f76short, 1435, 10, 1338));
        kVar.p(AbstractC0302v0.a0());
        kVar.s(C0019.m75(f76short, 1445, 13, 2111) + getCurrentSiteUrl());
        kVar.g(strM539);
        return kVar;
    }

    public static String r(N n) {
        String str = "";
        String strM169 = C0043.m169(f76short, 1458, 7, 2856);
        String strA = n.a();
        int i = n.a;
        if (i >= 400) {
            return com.github.catvod.spider.merge.D.b.e(i, C0128.m511(f76short, 1465, 12, 2441));
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            String strOptString = jSONObject.optString(C0137.m545(f76short, 1477, 7, 709), "");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObject.optString(C0001.m1(f76short, 1484, 3, 2836), "");
            }
            if (!TextUtils.isEmpty(strOptString)) {
                return strM169 + strOptString;
            }
        } catch (Exception unused) {
        }
        if (strA != null) {
            String strM1610 = C0043.m169(f76short, 1487, 1, 1209);
            String strM368 = C0093.m368(f76short, 1488, 1, 2500);
            String strK = com.github.catvod.spider.merge.D.b.k(strA, strM1610, strM368, C0026.m102(f76short, 1489, 1, 2184), strM368);
            if (strK.length() > 160) {
                strK = strK.substring(0, 160);
            }
            str = strK;
        }
        return TextUtils.isEmpty(str) ? C0056.m223(f76short, 1490, 10, 2596) : com.github.catvod.spider.merge.D.b.B(strM169, str);
    }

    public static String s(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace(C0059.m234(f76short, 1500, 27, 2247), "").replace(C0120.m477(f76short, 1527, 5, 1174), C0014.m54(f76short, 1532, 1, 2877)).replace(C0090.m358(f76short, 1533, 6, 809), "").replace(C0120.m477(f76short, 1539, 2, 880), C0089.m355(f76short, 1541, 1, 2764)).replace(C0118.m471(f76short, 1542, 5, 2249), "").replaceAll(C0056.m223(f76short, 1547, 3, 1552), "");
    }

    public static void saveCookie(String str) {
        String strF = F(str);
        if (TextUtils.isEmpty(strF)) {
            clearCookie();
        } else {
            boolean z2 = FishCrypto.a;
            C0297t1.j(C0009.m33(f76short, 1550, 21, 1582), strF);
        }
    }

    public static String t(String str) {
        return str == null ? "" : X1.L(str.replaceAll(C0105.m416(f76short, 1571, 41, 3270), ""), "").T();
    }

    public static void u(String str, ArrayList arrayList) {
        String strM382;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int size = arrayList.size();
        Matcher matcher = z.matcher(str);
        while (true) {
            boolean zFind = matcher.find();
            strM382 = C0096.m382(f76short, 1612, 5, 1181);
            if (!zFind) {
                break;
            }
            String strReplace = matcher.group(1).replace(strM382, "");
            String str2 = C0107.m427(f76short, 1617, 8, 2514) + N(strReplace);
            StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strReplace);
            sbO.append(str.substring(Math.min(str.length(), matcher.end())));
            i(J(m(str2, x(sbO.toString()))), arrayList);
        }
        Matcher matcher2 = y.matcher(str);
        while (matcher2.find()) {
            String strReplace2 = matcher2.group(1).replace(strM382, "");
            String strN = N(strReplace2);
            StringBuilder sbO2 = com.github.catvod.spider.merge.D.b.o(strReplace2);
            sbO2.append(str.substring(Math.min(str.length(), matcher2.end())));
            i(J(m(strN, x(sbO2.toString()))), arrayList);
        }
        if (arrayList.size() == size) {
            String strX = x(str);
            if (TextUtils.isEmpty(strX) && str.matches(C0130.m516(f76short, 1625, 16, 2548))) {
                strX = str;
            }
            if (TextUtils.isEmpty(strX)) {
                i(J(str), arrayList);
            } else {
                if (arrayList.contains(strX)) {
                    return;
                }
                arrayList.add(strX);
            }
        }
    }

    public static String v(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(C0098.m390(f76short, 1641, 15, 1894), "");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObject.optString(C0030.m116(f76short, 1656, 6, 1229), "");
            }
            return F(strOptString);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String x(String str) {
        if (str == null) {
            return "";
        }
        Matcher matcher = A.matcher(str);
        return matcher.find() ? matcher.group(1) : "";
    }

    public static ArrayList y(com.github.catvod.spider.merge.f0.g gVar) {
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.f0.k kVarR = gVar == null ? null : gVar.R(C0101.m402(f76short, 1662, 11, 3076));
        com.github.catvod.spider.merge.h0.d<com.github.catvod.spider.merge.f0.k> dVar = kVarR == null ? new com.github.catvod.spider.merge.h0.d() : kVarR.Q(C0028.m108(f76short, 1673, 53, 526));
        if (kVarR != null && dVar.isEmpty()) {
            dVar.add(kVarR);
        }
        for (com.github.catvod.spider.merge.f0.k kVar : dVar) {
            String strS = s(kVar.T());
            u(strS, arrayList);
            String strS2 = s(kVar.K());
            if (!TextUtils.equals(strS, strS2)) {
                u(strS2, arrayList);
            }
        }
        com.github.catvod.spider.merge.h0.d<com.github.catvod.spider.merge.f0.k> dVar2 = kVarR == null ? new com.github.catvod.spider.merge.h0.d() : kVarR.Q(C0126.m503(f76short, 1726, 7, 2113));
        int size = arrayList.size();
        String strM116 = C0030.m116(f76short, 1733, 4, 1487);
        if (size == 1) {
            String str = (String) arrayList.get(0);
            String strM382 = C0096.m382(f76short, 1737, 4, 392);
            if (!str.contains(strM382) && arrayList.size() == 1 && !((String) arrayList.get(0)).contains(strM382)) {
                String str2 = (String) arrayList.get(0);
                Iterator<E> it = dVar2.iterator();
                while (it.hasNext()) {
                    String strE = E(((com.github.catvod.spider.merge.f0.k) it.next()).c(strM116));
                    if (AbstractC0302v0.s0(strE) && (strE.contains(C0087.m346(f76short, 1741, 3, 2268)) || strE.contains(C0045.m177(f76short, 1744, 3, 380)) || strE.contains(C0117.m467(f76short, 1747, 8, 2733)))) {
                        StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strE);
                        sbO.append(k(strE, str2));
                        arrayList.set(0, sbO.toString());
                        break;
                    }
                }
            }
        }
        for (com.github.catvod.spider.merge.f0.k kVar2 : dVar2) {
            String strE2 = E(kVar2.c(strM116));
            if (AbstractC0302v0.s0(strE2)) {
                String strJ = J(strE2);
                com.github.catvod.spider.merge.f0.k kVar3 = (com.github.catvod.spider.merge.f0.k) kVar2.a;
                i(m(strJ, x(kVar3 != null ? kVar3.T() : kVar2.T())), arrayList);
            }
        }
        String str3 = "";
        String str4 = "";
        int i = -1;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str5 = (String) arrayList.get(i2);
            if (!TextUtils.isEmpty(str5)) {
                if (AbstractC0302v0.s0(str5)) {
                    if (!TextUtils.isEmpty(str4)) {
                        return arrayList;
                    }
                    str4 = str5;
                    i = i2;
                } else if (!str5.matches(C0118.m471(f76short, 1755, 16, 1119))) {
                    continue;
                } else {
                    if (!TextUtils.isEmpty(str3)) {
                        return arrayList;
                    }
                    str3 = str5;
                }
            }
        }
        if (i >= 0 && !TextUtils.isEmpty(str3) && !str4.contains(C0089.m355(f76short, 1771, 5, 581))) {
            StringBuilder sbO2 = com.github.catvod.spider.merge.D.b.o(str4);
            sbO2.append(k(str4, str3));
            arrayList.set(i, sbO2.toString());
            arrayList.remove(str3);
        }
        return arrayList;
    }

    public static String z(String str) {
        int i;
        int iIndexOf;
        Matcher matcher = B.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        int iIndexOf2 = str.indexOf(C0092.m365(f76short, 1776, 7, 2362));
        String strSubstring = "";
        if (iIndexOf2 >= 0 && (iIndexOf = str.indexOf(C0049.m193(f76short, 1783, 1, 1083), (i = 7 + iIndexOf2))) > i) {
            strSubstring = str.substring(i, iIndexOf);
        }
        return strSubstring;
    }

    public final HashMap B() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(C0103.m408(f76short, 1784, 10, 2553), C0074.m292(f76short, 1794, 114, 1856));
        mapS.put(C0125.m499(f76short, 1908, 7, 2956), this.r);
        mapS.put(C0046.m182(f76short, 1915, 15, 2092), C0091.m360(f76short, 1930, 47, 411));
        String strH = h();
        if (!TextUtils.isEmpty(strH)) {
            mapS.put(C0130.m516(f76short, 1977, 6, 918), strH);
        }
        return mapS;
    }

    public final ArrayList I(com.github.catvod.spider.merge.f0.g gVar) {
        String strM360;
        String strM21;
        String strM414;
        String strM31;
        String strA;
        String strG;
        com.github.catvod.spider.merge.f0.k kVarR;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = gVar.Q(C0082.m325(f76short, 1983, 18, 1142)).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strM360 = C0091.m360(f76short, 2001, 1, 1127);
            strM21 = C0006.m21(f76short, 2002, 4, 1471);
            strM414 = C0104.m414(f76short, 2006, 3, 584);
            strM31 = C0008.m31(f76short, 2009, 4, 2056);
            if (!zHasNext) {
                break;
            }
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) it.next();
            if (!kVar.Q(C0026.m102(f76short, 2013, 1, 3101)).a(C0018.m70(f76short, 2014, 14, 411)).contains(C0009.m33(f76short, 2028, 3, 2049)) && (kVarR = kVar.R(C0128.m511(f76short, 2031, 51, 1941))) != null) {
                String strC = kVarR.c(strM31);
                String strT = kVarR.T();
                String strA2 = kVar.Q(C0055.m219(f76short, 2082, 7, 2383)).a(strM414);
                if (!TextUtils.isEmpty(strA2) && !strA2.startsWith(strM21)) {
                    strA2 = this.r + strM360 + M(strA2);
                }
                String strG2 = kVar.Q(C0140.m558(f76short, 2089, 63, 912)).g();
                if (!TextUtils.isEmpty(strC) && !TextUtils.isEmpty(strT)) {
                    arrayList.add(new k(strC, strT, strA2, strG2));
                }
            }
        }
        if (arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (com.github.catvod.spider.merge.f0.k kVar2 : gVar.Q(C0017.m65(f76short, 2152, 16, 1920))) {
                String strC2 = kVar2.c(strM31);
                if (!TextUtils.isEmpty(strC2) && !strC2.contains(C0008.m31(f76short, 2168, 13, 546)) && strC2.contains(C0140.m558(f76short, 2181, 4, 1654)) && linkedHashSet.add(strC2)) {
                    String strT2 = t(kVar2.T());
                    if (TextUtils.isEmpty(strT2)) {
                        strT2 = t(kVar2.c(C0112.m445(f76short, 2185, 5, 1372)));
                    }
                    while (true) {
                        if (kVar2 == null) {
                            kVar2 = null;
                            break;
                        }
                        n nVarJ = p.j(C0009.m33(f76short, 2190, 44, 862));
                        com.github.catvod.spider.merge.f0.p pVar = kVar2;
                        while (true) {
                            com.github.catvod.spider.merge.f0.p pVar2 = pVar.a;
                            if (pVar2 == null) {
                                break;
                            }
                            pVar = pVar2;
                        }
                        if (nVarJ.a((com.github.catvod.spider.merge.f0.k) pVar, kVar2)) {
                            break;
                        }
                        kVar2 = (com.github.catvod.spider.merge.f0.k) kVar2.a;
                    }
                    if (kVar2 != null) {
                        strA = kVar2.Q(C0072.m285(f76short, 2234, 3, 1270)).a(strM414);
                        strG = kVar2.Q(C0089.m355(f76short, 2237, 25, 590)).g();
                    } else {
                        strA = "";
                        strG = "";
                    }
                    if (!TextUtils.isEmpty(strA) && !strA.startsWith(strM21)) {
                        strA = this.r + strM360 + M(strA);
                    }
                    if (!TextUtils.isEmpty(strT2)) {
                        arrayList.add(new k(strC2, strT2, strA, strG));
                    }
                }
            }
        }
        return arrayList;
    }

    public final HashMap K() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(C0097.m386(f76short, 2262, 10, 2430), C0142.m567(f76short, 2272, 135, 2856));
        mapS.put(C0076.m301(f76short, 2407, 7, 2834), this.r);
        mapS.put(C0125.m499(f76short, 2414, 16, 2294), C0059.m234(f76short, 2430, 14, 1426));
        String strH = h();
        if (!TextUtils.isEmpty(strH)) {
            mapS.put(C0081.m322(f76short, 2444, 6, 1402), strH);
        }
        return mapS;
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0049.m193(f76short, 2450, 6, 2912));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0130.m516(f76short, 2456, 15, 830));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0053.m210(f76short, 2471, 13, 1398));
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

    public final String h() {
        String savedCookie = getSavedCookie();
        if (TextUtils.isEmpty(savedCookie)) {
            savedCookie = this.s;
        }
        return savedCookie == null ? "" : savedCookie;
    }

    public String homeContent(boolean z2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0030.m116(f76short, 2484, 11, 2009));
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

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) throws Throwable {
        JSONObject jSONObject;
        String str2;
        boolean z2;
        super.init(context, str);
        try {
            jSONObject = TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        ArrayList arrayList = new ArrayList();
        String strM499 = C0125.m499(f76short, 2495, 4, 509);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strM499);
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                j(jSONArrayOptJSONArray.optString(i, ""), arrayList);
            }
        } else {
            j(jSONObject.optString(strM499, ""), arrayList);
        }
        if (arrayList.isEmpty() && !TextUtils.isEmpty(str) && str.trim().startsWith(C0047.m186(f76short, 2499, 4, 1939))) {
            j(str, arrayList);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        String[] strArr = v;
        if (zIsEmpty) {
            for (int i2 = 0; i2 < 2; i2++) {
                j(strArr[i2], arrayList);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                str2 = arrayList.isEmpty() ? strArr[0] : (String) arrayList.get(0);
                break;
            }
            str2 = (String) it.next();
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str2).openConnection();
                try {
                    httpURLConnection2.setInstanceFollowRedirects(true);
                    httpURLConnection2.setConnectTimeout(10000);
                    httpURLConnection2.setReadTimeout(10000);
                    httpURLConnection2.setRequestMethod(C0142.m567(f76short, 2503, 4, 2259));
                    int responseCode = httpURLConnection2.getResponseCode();
                    z2 = responseCode >= 200 && responseCode < 400;
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused4) {
                        }
                    }
                    z2 = false;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused5) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused6) {
            } catch (Throwable th2) {
                th = th2;
            }
        } while (!z2);
        this.r = str2;
        w = str2;
        String strOptString = jSONObject.optString(C0115.m459(f76short, 2507, 6, 1909), "");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = jSONObject.optString(C0079.m314(f76short, 2513, 15, 1253), "");
        }
        if (TextUtils.isEmpty(strOptString)) {
            boolean z3 = FishCrypto.a;
            strOptString = v(C0297t1.h(C0076.m301(f76short, 2528, 11, 677)));
        }
        if (TextUtils.isEmpty(strOptString)) {
            boolean z4 = FishCrypto.a;
            strOptString = v(C0297t1.h(C0139.m554(f76short, 2539, 10, 2902)));
        }
        this.s = F(strOptString);
        h();
    }

    public final String n(String str, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        l(sb, C0026.m102(f76short, 2549, 2, 782), this.r);
        l(sb, C0018.m70(f76short, 2551, 2, 1586), str);
        boolean zIsEmpty = arrayList.isEmpty();
        String strM182 = C0046.m182(f76short, 2553, 2, 549);
        if (zIsEmpty) {
            l(sb, C0089.m355(f76short, 2555, 2, 610), C0008.m31(f76short, 2557, 10, 2538));
            l(sb, strM182, C0055.m219(f76short, 2567, 30, 2485));
            return sb.toString();
        }
        l(sb, C0142.m567(f76short, 2597, 2, 1614), H(arrayList));
        l(sb, C0139.m554(f76short, 2600, 2, 1691), arrayList.size() + C0137.m545(f76short, 2599, 1, 2484));
        l(sb, strM182, C0120.m477(f76short, 2602, 16, 2155));
        int iMin = Math.min(3, arrayList.size());
        if (iMin > 0) {
            sb.append(C0125.m499(f76short, 2618, 5, 507));
            for (int i = 0; i < iMin; i++) {
                sb.append(C0103.m408(f76short, 2623, 1, 986));
                sb.append((String) arrayList.get(i));
            }
            if (arrayList.size() > iMin) {
                sb.append(C0103.m408(f76short, 2624, 7, 1387));
                sb.append(arrayList.size() - iMin);
                sb.append(C0112.m445(f76short, 2631, 5, 2436));
            }
        }
        return sb.toString();
    }

    public String searchContent(String str, boolean z2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0091.m360(f76short, 2636, 13, 1151));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0070.m277(f76short, 2649, 13, 2898));
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

    public final boolean w(String str, String str2) {
        String strR = "";
        this.t = "";
        if (TextUtils.isEmpty(h())) {
            this.t = C0070.m277(f76short, 2662, 24, 1627);
            return false;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.u;
            long j2 = jCurrentTimeMillis - j;
            if (j > 0 && j2 < 21000) {
                Thread.sleep(21000 - j2);
            }
            String strZ = z(str);
            if (TextUtils.isEmpty(strZ)) {
                this.t = C0059.m234(f76short, 2686, 13, 1442);
                return false;
            }
            HashMap mapB = B();
            if (!TextUtils.isEmpty(str2)) {
                mapB.put(C0072.m285(f76short, 2699, 7, 1859), str2);
            }
            mapB.put(C0085.m339(f76short, 2706, 6, 1335), this.r);
            mapB.put(C0053.m210(f76short, 2712, 16, 533), C0030.m116(f76short, 2728, 14, 2645));
            mapB.put(C0074.m292(f76short, 2742, 12, 1393), C0063.m249(f76short, 2754, 48, 2345));
            HashMap map = new HashMap();
            map.put(C0063.m249(f76short, 2802, 7, 982), C0090.m358(f76short, 2809, 1, 462));
            map.put(C0008.m31(f76short, 2810, 11, 913), C0105.m416(f76short, 2821, 1, 1241));
            map.put(C0076.m301(f76short, 2822, 8, 1831), "");
            map.put(C0050.m199(f76short, 2830, 7, 805), x[new Random().nextInt(6)]);
            map.put(C0010.m36(f76short, 2837, 19, 2469), C0137.m545(f76short, 2856, 1, 1586));
            N N = X1.N(this.r + C0003.m10(f76short, 2857, 13, 1666) + strZ + C0085.m339(f76short, 2870, 6, 2291), map, mapB);
            this.u = System.currentTimeMillis();
            boolean zD = D(N);
            if (!zD) {
                strR = r(N);
            }
            this.t = strR;
            return zD;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.t = C0001.m1(f76short, 2883, 7, 2585);
            return false;
        } catch (Exception e) {
            this.t = C0085.m339(f76short, 2876, 7, 2947) + e.getMessage();
            return false;
        }
    }
}

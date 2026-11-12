package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.Gying;
import com.github.catvod.spider.merge.A.AbstractC0244b1;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0241a1;
import com.github.catvod.spider.merge.A.C0261h0;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.InterfaceC0245c;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.S0;
import com.github.catvod.spider.merge.A.T0;
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
import com.github.catvod.spider.merge.T.Q;
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
import com.github.catvod.spider.merge.l0.l;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.N;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
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
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.RunnableC0460l;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.math.BigInteger;
import java.net.IDN;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Gying extends Cloud {
    public static final String[] A;
    public static final Q B;
    public static final Object C;
    public static final HashMap D;
    public static volatile String E;
    public static final HashMap F;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f50short = {1771, 1770, 1784, 1683, 1670, 3099, 3143, 3153, 3157, 3142, 3159, 3164, 3083, 3141, 3081, 2378, 2328, 2325, 2332, 2313, 2385, 2378, 2305, 2307, 2312, 2313, 2385, 2397, 2754, 30432, 29544, 21048, 22745, -27843, -32144, 29684, 30332, -25691, -31452, 31454, 21488, 2989, 2998, 32319, 21627, 2878, 2881, 2796, 2798, 21857, -28224, 1842, 1869, 3105, 3107, 21503, 28284, 355, 284, 1474, 1492, 1477, 1477, 1496, 1503, 1494, 1474, -32189, 30355, 1726, 31887, 30983, -27426, -30113, 30117, 23691, 30551, 29407, 21391, 22894, -28022, -31801, 1772, 1771, 1769, 1772, 1782, 1777, 592, 605, 2625, 2489, 1313, 1773, 1619, 1631, 1625, 1616, 1627, 1610, 1540, 399, 409, 511, 481, 497, 502, 511, 455, 494, 481, 507, 480, 504, 507, 471, 492, 493, 508, 489, 481, 484, 456, 456, -28882, 27898, 26506, 26402, 2112, 2174, 2158, 2153, 2144, 28870, 23196, 1557, 1561, 1567, 1558, 1565, 1548, 2024, 1101, 1040, 1031, 1041, 1101, 1030, 1037, 1045, 1036, 1047, 1040, 1038, 1101, 602, 582, 582, 578, 577, 520, 541, 541, 577, 540, 582, 583, 582, 583, 540, 578, 607, 541, 603, 607, 597, 541, 981, 968, 975, 972, 980, 909, 927, 920, 906, -29856, 23297, -31951, 26642, 20966, -31246, 3126, 3112, 3128, 3135, 3126, 3086, 3106, 3124, 3109, 3086, 3122, 3134, 3134, 3130, 3128, 3124, 3060, 3050, 3066, 3069, 3060, 3020, 3067, 3062, 3071, 3043, 511, 489, 504, 504, 485, 482, 491, 511, 2727, 28414, -32150, 30394, 24200, -30524, 31764, -910, 29635, 21121, -27977, 26314, -29463, 21023, -909, 17368, 31119, 23842, 29641, 3300, 3272, 3272, 3276, 3278, 3266, -3153, 31774, 23900, -31455, 31345, -3154, 1336, 1455, 1336, 28956, 22578, -27094, 30729, 2840, 2822, 2838, 2833, 2840, 2848, 2828, 2842, 2827, 2848, 2844, 2832, 2832, 2836, 2838, 2842, 994, 1020, 1004, 1003, 994, 986, 1014, 992, 1009, 986, 998, 1002, 1002, 1006, 1004, 992, 24391, 18832, -31374, 21779, 1670, 1706, 1706, 1710, 1708, 1696, 315, 293, 309, 306, 315, 259, 308, 313, 304, 300, 3047, 3065, 3049, 3054, 3047, 3039, 3048, 3045, 3052, 3056, 20204, 29883, 24509, 21306, 32000, 29833, 32298, 21978, 26582, 19623, 23400, 23354, 29308, 23218, -32563, 25026, 30972, 22923, 31972, 2865, 2876, 2854, 2853, 2873, 2868, 2860, 3126, 3131, 3105, 3106, 3134, 3123, 3115, 18435, 32411, 30482, -29171, 28462, 1443, 1452, 1449, 1457, 1440, 1463, 1164, 1155, 1158, 1182, 1167, 1176, 30621, 32276, 27486, 22083, 294, 315, 301, 300, 315, 462, 467, 453, 452, 467, 2076, 2059, 2077, 2059, 2074, 1154, 1173, 1155, 1173, 1156, 27539, 21244, -27351, -32683, 1291, 1284, 1310, 1285, 1309, 1310, 1325, 1325, 3253, 430, 430, 573, 608, 631, 609, 573, 682, 741, 756, 754, 752, 680, 31483, 32627, -27990, -29653, 29649, 23295, 31552, 32456, 24472, 21881, -24931, -28720, 2701, 2623, 2606, 2600, 2602, 3136, 3153, 3159, 3157, 3139, 1373, 1370, 1368, 1373, 1351, 1344, 1313, 1588, 2844, 31777, 23435, 21008, 21995, 2754, 2749, 3011, 3009, 3011, 3015, 2467, 2465, 2467, 2468, 32125, 22329, 21798, 18642, 29896, -28211, 25716, 26308, 30350, 22385, 31331, 2069, 2071, 2069, 2065, 22859, -25110, 30635, 23106, -28504, 21798, 1297, 1299, 1297, 1302, 29563, -27010, 22621, 32718, 30681, 20692, 20969, 27754, 1534, 1532, 1534, 1530, 600, 602, 600, 607, 1037, 1041, 1041, 1045, 1046, 1119, 1098, 1098, 1042, 1042, 1042, 1099, 1053, 1035, 1096, 1096, 1042, 1030, 1043, 1104, 1116, 1055, 1099, 1030, 1034, 1032, 523, 535, 535, 531, 528, 601, 588, 588, 532, 532, 532, 589, 539, 525, 590, 590, 529, 523, 530, 531, 603, 596, 519, 517, 524, 522, 533, 602, 514, 603, 592, 595, 516, 589, 512, 524, 526, 2850, 2878, 2878, 2874, 2873, 2928, 2917, 2917, 2877, 2877, 2877, 2916, 2866, 2852, 2919, 2919, 2849, 2851, 2876, 2852, 2941, 2940, 2856, 2942, 2939, 2852, 2852, 2850, 2851, 2916, 2857, 2853, 2855, 2030, 2034, 2034, 2038, 2037, 1980, 1961, 1961, 2033, 2033, 2033, 1960, 2046, 2024, 1963, 1963, 1975, 1974, 2032, 2036, 1968, 1975, 2023, 1973, 2046, 2021, 1971, 2046, 1973, 2020, 1960, 2021, 2025, 2027, 2368, 2396, 2396, 2392, 2395, 2322, 2311, 2311, 2399, 2399, 2399, 2310, 2384, 2374, 2309, 2309, 2335, 2332, 2393, 2386, 2329, 2328, 2379, 2393, 2395, 2372, 2396, 2369, 2378, 2368, 2332, 2328, 2377, 2371, 2395, 2395, 2310, 2379, 2375, 2373, 1730, 1758, 1758, 1754, 1753, 1680, 1669, 1669, 1757, 1757, 1757, 1668, 1746, 1732, 1671, 1671, 1756, 1737, 1753, 1746, 1691, 1731, 1754, 1682, 1736, 1682, 1757, 1694, 1731, 1668, 1737, 1733, 1735, 1910, 1898, 1898, 1902, 1901, 1828, 1841, 1841, 1897, 1897, 1897, 1840, 1894, 1904, 1843, 1843, 1833, 1834, 1903, 1895, 1830, 1914, 1909, 1834, 1914, 1900, 1896, 1913, 1836, 1831, 1894, 1840, 1917, 1905, 1907, 1981, 1953, 1953, 1957, 1958, 2031, 2042, 2042, 1954, 1954, 1954, 2043, 1965, 1979, 2040, 2040, 1969, 1957, 1956, 1955, 2023, 2021, 1968, 2029, 1952, 1970, 2019, 1959, 2029, 1972, 2043, 1974, 1978, 1976, 2345, 2400, 2430, 2414, 2409, 2400, 2392, 2404, 2408, 2409, 2401, 2414, 2400, 1771, 1756, 1759, 1756, 1739, 1756, 1739, 606, 632, 622, 633, 550, 586, 620, 622, 613, 639, 2248, 2282, 2303, 2284, 2281, 2281, 2276, 2218, 2224, 2219, 2229, 2213, 2221, 2284, 2261, 2285, 2282, 2283, 2272, 2238, 2213, 2246, 2261, 2256, 2213, 2284, 2261, 2285, 2282, 2283, 2272, 2213, 2250, 2262, 2213, 2228, 2237, 2266, 2224, 2213, 2281, 2284, 2286, 2272, 2213, 2248, 2276, 2278, 2213, 2250, 2262, 2213, 2269, 2220, 2213, 2244, 2293, 2293, 2281, 2272, 2258, 2272, 2279, 2254, 2284, 2289, 2218, 2227, 2229, 2224, 2219, 2228, 2219, 2228, 2224, 2213, 2221, 2254, 2253, 2257, 2248, 2249, 2217, 2213, 2281, 2284, 2286, 2272, 2213, 2242, 2272, 2278, 2286, 2282, 2220, 2213, 2259, 2272, 2295, 2294, 2284, 2282, 2283, 2218, 2228, 2237, 2219, 2224, 2213, 2248, 2282, 2279, 2284, 2281, 2272, 2218, 2228, 2224, 2240, 2228, 2225, 2237, 2213, 2262, 2276, 2275, 2276, 2295, 2284, 2218, 2227, 2229, 2225, 2219, 2228, 1855, 1821, 1821, 1819, 1806, 1802, 1305, 1288, 1301, 1305, 1346, 1285, 1305, 1280, 1281, 1345, 1292, 1309, 1309, 1281, 1284, 1294, 1292, 1305, 1284, 1282, 1283, 1346, 1301, 1285, 1305, 1280, 1281, 1350, 1301, 1280, 1281, 1345, 1292, 1309, 1309, 1281, 1284, 1294, 1292, 1305, 1284, 1282, 1283, 1346, 1287, 
    1310, 1282, 1283, 1345, 1305, 1288, 1301, 1305, 1346, 1309, 1281, 1292, 1284, 1283, 1345, 1351, 1346, 1351, 1152, 1154, 1154, 1156, 1169, 1173, 1228, 1165, 1152, 1167, 1158, 1172, 1152, 1158, 1156, 1931, 1945, 2012, 1970, 1983, 2013, 1931, 1945, 1994, 1920, 1996, 1985, 2015, 1992, 1295, 1294, 1293, 1294, 1286, 1288, 1295, 25427, 29186, 23340, 2332, 2321, 2315, 2312, 2324, 2329, 2305, 1478, 1481, 1484, 1492, 1477, 1490, 296, 309, 291, 290, 309, 2146, 2165, 2147, 2165, 2148, 3134, 3086, 3075, 3083, 3151, 877, 866, 871, 878, 865, 866, 869, 1116, 1091, 1115, 1026, 1115, 1091, 1118, 1095, 1097, 1118, 26885, -29310, 21026, 24515, 21794, -24890, -28789, 1729, 1889, 1901, 1894, 1895, 1088, 1111, 1108, 1088, 1111, 1089, 1114, 2625, 2655, 2635, -27653, -32074, 28213, -30030, 21778, -26122, -30533, 24200, -29507, 25701, 2253, 2188, 2176, 2187, 2186, 2253, 2261, 2267, 2270, 2262, 2630, 2075, 2071, 2065, 2072, 2067, 2050, 2124, 494, 504, 485, 484, 438, 1238, 1217, 1175, 1239, 1189, 1230, 1235, 1223, 1183, 1235, 1176, 1187, 1157, 1226, 1230, 1155, -32590, 20691, 26536, 26171, 28053, 23092, -29152, -993, -29861, 23354, 27713, 28114, 26236, 20957, -31287, -2058, 28614, 32407, 22457, 1326, 1314, 1321, 1320, 2571, 2581, 2561, 27240, 23086, -31207, 24339, 22223, 22517, -31190, 22091, 24880, 24739, 27405, 23724, -30536, -1401, 20816, 23305, -29570, 25101, -28540, -29070, -32291, 20924, 26311, 26452, 27898, 23387, -28849, -656, -28882, 27898, 25039, 20873, -30015, 23011, 21250, -26394, -30293, 24716, 24640, 1684, 1045, 1028, 1041, 1037, 2497, 2506, 2504, 2500, 2508, 2507, 1712, 1709, 1701, 1724, 1703, 1712, 1702, 846, 834, 859, 782, 834, 836, 838, 452, 470, 474, 466, 452, 478, 451, 466, 1604, 1618, 1620, 1602, 1605, 1618, 2276, 2296, 2296, 2300, 2275, 2274, 2272, 2293, 2158, 2156, 2167, 2161, 2156, 2167, 2154, 2151, 28569, 28170, 2343, 2200, 794, 2801, 2788, 2788, 2763, 2773, 2757, 2754, 2763, 2803, 2767, 2755, 2755, 2759, 2757, 2761, 1651, 1645, 1661, 1658, 1651, 1611, 1655, 1659, 1659, 1663, 1661, 1649, 2065, 3082, 3085, 3091, 1779, 1778, 1769, 1784, 1018, 1023, 1002, 1019, 1002, 1015, 1011, 1019, 2067, 2063, 2069, 2066, 2051, 2053, 1967, 1963, 1959, 1953, 1955, 1973, 2305, 957, 810, 957, 1346, 1372, 1356, 1355, 1346, 1402, 1366, 1344, 1361, 1402, 1350, 1354, 1354, 1358, 1356, 1344, 29301, 23387, -27325, 31584, 475, 453, 469, 466, 475, 483, 463, 473, 456, 483, 479, 467, 467, 471, 469, 473, 2147, 2159, 2153, 2144, 2155, 2170, 2100, 2097, 2166, 2170, 2099, 2171, 2172, 2144, 2100, 2156, 2170, 2151, 2150, 2100, 937, 1003, 993, 946, 2910, 2911, 2893, 2854, 2867, 427, 437, 421, 418, 427, 403, 431, 419, 419, 423, 421, 425, 1980, 1977, 1955, 1956, 879, 2665, 787, 1747, 1402, 1281, 2830, 791, 1016, 1012, 1010, 1019, 1008, 993, 2095, 2088, 2102, 436, 3147, 3150, 3145, 3148, 1359, 1407, 1394, 1402, 1342, 728, 3136, 3142, 2489, 2495, 3199, 3192, 3174, 568, 573, 551, 544, 2836, 2835, 2829, 2834, 3177, 3196, 3196, 2342, 1199, 2841, 2825, 2836, 2828, 2824, 2846, 2825, 2852, 2829, 2846, 2825, 2834, 2845, 2834, 2846, 2847, 2948, 2091, 2096, 526, 918, 3018, 1034, 1111, 1088, 1110, 1034, 1109, 1098, 1106, 274, 1406, 970, 1349, 1400, 1379, 1389, 1379, 1380, 1553, 481, 487, 497, 497, 503, 481, 481, 3128, 3125, 1670, 1691, 1670, 1694, 1687, 1114, 1111, 1100, 937, 946, 2609, 2605, 2601, 2618, 1440, 1442, 2672, 2674, 1275, 3067, 3047, 3047, 3043, 3040, 2985, 3004, 3004, 3040, 3005, 3047, 3046, 3047, 3046, 3005, 3043, 3070, 3004, 3066, 3070, 3060, 3004, 2305, 2332, 2331, 2328, 2304, 2393, 2379, 2380, 2398, 860, 862, 841, 852, 850, 851, 2156, 2158, 2171, 2154, 2152, 2144, 2173, 2166, 2124, 2144, 2145, 2171, 2154, 2145, 2171, 2837, 2836, 2821, 2832, 2840, 2845, 2866, 2846, 2847, 2821, 2836, 2847, 2821, 1716, 1698, 1715, 1770, 1700, 1704, 1704, 1708, 1710, 1698, 451, 1507, 1528, 2219, 2895, 2897, 2881, 2886, 2895, 2935, 2891, 2887, 2887, 2883, 2881, 2893, 2508, 2507, 2505, 2497, 2535, 2507, 2506, 2512, 2497, 2506, 2512, 3019, 3015, 3015, 3011, 3009, 3021, 1212, 1190, 1211, 1194, 409, 387, 414, 399, 409, 1997, 1994, 2004, 1025, 1171, 1243, 1222, 1243, 1219, 1226, 1169, 1179, 1183, 1179, 1167, 1249, 1216, 1243, 1167, 1257, 1216, 1242, 1217, 1227, 1171, 1152, 1243, 1222, 1243, 1219, 1226, 1169, 649, 1231, 1235, 1235, 1239, 1236, 1181, 1160, 1160, 1236, 1161, 1235, 1234, 1235, 1234, 1161, 1239, 1226, 1160, 1230, 1226, 1216, 1160, 2866, 2863, 2856, 2859, 2867, 2922, 2936, 2943, 2925, 2827, 3289, 3279, 3275, 3288, 3273, 3266, 897, 1565, 2151, 2831, 2834, 2831, 2839, 2846, 2780, 2771, 2783, 2775, 1403, 1392, 1407, 1395, 1403, 946, 942, 938, 953, 1527, 1520, 1528, 1521, 1501, 1478, 524, 526, 772, 774, 1577, 1574, 1577, 2661, 2681, 2681, 2685, 2686, 2615, 2594, 2594, 2686, 2595, 2681, 2680, 2681, 2680, 2595, 2685, 2656, 2594, 2660, 2656, 2666, 2594, 1674, 1687, 1680, 1683, 1675, 1746, 1728, 1735, 1749, 424, 501, 482, 500, 424, 500, 482, 486, 501, 484, 495, 472, 500, 498, 480, 480, 482, 500, 499, 440, 502, 442, 1122, 2008, 1984, 2012, 2001, 1993, 2005, 1986, 2035, 2015, 2014, 1988, 2005, 2014, 1988, 648, 660, 660, 656, 659, 730, 719, 719, 659, 718, 660, 661, 660, 661, 718, 656, 653, 719, 649, 653, 647, 719, 3031, 1916, 1825, 1846, 1824, 1916, 1847, 1852, 1828, 1853, 1830, 1825, 1855, 1916, 2893, 2896, 2903, 2900, 2892, 2837, 2823, 2816, 2834, 2505, 2520, 2519, 2517, 2512, 2506, 2509, 2997, 3001, 3007, 2998, 3005, 2988, 1742, 1733, 1757, 1732, 1734, 1731, 1753, 1758, 2275, 2284, 2294, 2285, 2293, 2294, 2245, 2245, 2357, 2356, 2342, 2381, 2392, 2433, 2433, 2196, 2204, 18797, 1902, 2458, 2450, 2441, 809, 821, 821, 817, 818, 891, 878, 878, 818, 879, 821, 820, 821, 820, 879, 817, 812, 878, 808, 812, 806, 878, 1896, 1909, 1906, 1905, 1897, 1840, 1826, 1829, 1847, 1442, 1311, 1282, 1311, 1287, 1294, 1790, 1784, 1760, 1760, 1772, 1791, 1780, 274, 270, 266, 281, 3118, 3107, 3131, 3135, 3294, 3276, 3281, 3293, 3269, 3274, 1722, 1727, 1713, 1703, 1727, 1712, -30636, 25463, -25657, -29927, 
    22587, 21210, -26306, -30605, 24916, 24984, -834, 24128, 26251, 30362, -28938, 27938, 24599, 20561, 20754, -29489, 26399, 26252, -25653, 13232, 2797, 2812, 2803, 2801, 2804, 2798, 2793, 1389, 1393, 1404, 1380, 1393, 1396, 1390, 1385, 2749, 25024, 24659, 2823, 2824, 2820, 2828, 1372, 1371, 1349, 1457, 3269, 3289, 3284, 3276, 1441, 1469, 1469, 1465, 1523, 1510, 1510, 2651, 2631, 2631, 2627, 2624, 2569, 2588, 2588, 925, 913, 919, 926, 917, 900, 970, 775, 2683, 20597, 31202, 25584, 25187, 2549, 2558, 2534, 2559, 2557, 2552, 2530, 2533, 846, 843, 849, 854, 3041, 2480, 934, 2995, 2981, 3025, 2628, 2623, 2502, 397, 833, 833, 833, 25026, 25248, 21679, 29288, 25581, 25214, 27088, 1751, 1729, 1733, 1750, 1735, 1740, 1767, 1739, 1738, 1744, 1729, 1738, 1744, 430, 1742, 1001, 1003, 2937, 2939, 1354, 1355, 1369, 1330, 1319, 1443, 1471, 1471, 1467};
    public static final String[] x = {C0044.m175(f50short, 461, 2, 2806), C0104.m414(f50short, 463, 4, 3057), C0014.m54(f50short, 467, 4, 2449), C0101.m402(f50short, 471, 2, 2120), C0008.m31(f50short, 473, 2, 1934), C0112.m445(f50short, 457, 2, 1520), C0089.m355(f50short, 459, 2, 1932), C0125.m499(f50short, 475, 2, 1061), C0073.m288(f50short, 477, 2, 884)};
    public static final String[] y = {C0003.m10(f50short, 486, 2, 2860), C0116.m463(f50short, 488, 2, 2085), C0142.m567(f50short, 490, 2, 1857), C0055.m219(f50short, 479, 3, 2084), C0106.m422(f50short, 482, 4, 2087), C0107.m427(f50short, 492, 4, 1315), C0142.m567(f50short, 496, 2, 918)};
    public static final String[] z = {C0114.m454(f50short, 502, 2, 833), C0101.m402(f50short, 498, 2, 2805), C0056.m223(f50short, 500, 2, 691), C0120.m477(f50short, 504, 4, 1484), C0030.m116(f50short, 508, 4, 618)};
    public String r = "";
    public String s = "";
    public String t = "";
    public final HashMap u = new HashMap();
    public final com.github.catvod.spider.merge.p020x.b v = new com.github.catvod.spider.merge.p020x.b(C0085.m339(f50short, 784, 13, 2311));
    public C0261h0 w;

    final class SuggestResult {
        public final boolean a;
        public final String b;

        public SuggestResult(String str, boolean z) {
            this.a = z;
            this.b = str;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        }
        try {
            String strEncode = URLEncoder.encode(str, C0133.m529(f50short, 0, 5, 1726));
            String str2 = "";
            if (!z2) {
                String strY = y(this.r + C0112.m445(f50short, 5, 10, 3124) + strEncode + C0006.m21(f50short, 15, 13, 2412), B(this.r + C0082.m325(f50short, 28, 1, 2797)));
                if (D(strY)) {
                    str2 = strY;
                } else {
                    m(strY, arrayList);
                }
            }
            if (arrayList.isEmpty()) {
                SuggestResult suggestResultN = n(strEncode, null, arrayList);
                String str3 = suggestResultN.b;
                boolean zIsEmpty = arrayList.isEmpty();
                String strM360 = C0091.m360(f50short, 29, 6, 2481);
                String strM33 = C0009.m33(f50short, 35, 6, 3237);
                if (zIsEmpty && !TextUtils.isEmpty(str3)) {
                    if (E(str3)) {
                        strM360 = strM33;
                    }
                    return com.github.catvod.spider.merge.p001b.g.y(o(strM360));
                }
                if (arrayList.isEmpty() && !suggestResultN.a && !TextUtils.isEmpty(str2)) {
                    if (E(str2)) {
                        strM360 = strM33;
                    }
                    return com.github.catvod.spider.merge.p001b.g.y(o(strM360));
                }
            }
            if (!z2 && this.v.o && !arrayList.isEmpty()) {
                ArrayList arrayListQ = q(str, arrayList);
                if (!arrayListQ.isEmpty()) {
                    return com.github.catvod.spider.merge.p001b.g.y(arrayListQ);
                }
            }
        } catch (Exception unused) {
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z2) {
        ArrayList arrayList = new ArrayList();
        String strM554 = C0139.m554(f50short, 41, 2, 3008);
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(strM554, C0097.m386(f50short, 43, 4, 2826), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0055.m219(f50short, 47, 2, 2712), C0001.m1(f50short, 49, 4, 1798), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0119.m473(f50short, 53, 2, 3136), C0116.m463(f50short, 55, 4, 343), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0085.m339(f50short, 59, 8, 1457), C0126.m503(f50short, 67, 2, 2557), null));
        ArrayList arrayList2 = new ArrayList();
        try {
            String strY = y(this.r + C0059.m234(f50short, 69, 1, 1681), C());
            if (D(strY)) {
                arrayList2.addAll(o(E(strY) ? C0009.m33(f50short, 70, 6, 990) : C0028.m108(f50short, 76, 6, 2054)));
            } else {
                JSONArray jSONArray = new JSONArray(w(strY, C0044.m175(f50short, 82, 6, 1669)));
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject.optString(C0122.m486(f50short, 88, 2, 548));
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C0114.m454(f50short, 90, 1, 2600));
                        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(C0085.m339(f50short, 91, 1, 2509));
                        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(C0073.m288(f50short, 92, 1, 1350));
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null) {
                            k(arrayList2, strOptString, jSONArrayOptJSONArray, jSONArrayOptJSONArray2, jSONArrayOptJSONArray3);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(x(strM554, C0087.m346(f50short, 93, 1, 1756)));
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, arrayList2);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        AbstractC0280n1.u(str, str2);
        String strX = AbstractC0302v0.X(str, str2);
        if (strX != null) {
            return strX;
        }
        return (TextUtils.isEmpty(str2) || (!str2.startsWith(C0003.m10(f50short, 94, 7, 1598)) && (TextUtils.isEmpty(str) || !str.contains(C0044.m175(f50short, 101, 2, 461))))) ? super.playerContent(str, str2, list) : com.github.catvod.spider.merge.D.b.f(str2);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strJ1;
        String strL;
        final int i = 1;
        final int i2 = 0;
        String str = list.get(0);
        if (str.startsWith(C0130.m516(f50short, 103, 6, 408))) {
            AbstractC0302v0.g0(str, new InterfaceC0245c(this) { // from class: com.github.catvod.spider.merge.u.r
                public final /* synthetic */ Gying b;

                {
                    this.b = this;
                }

                @Override // com.github.catvod.spider.merge.A.InterfaceC0245c
                public final String dispatch(String str2) {
                    Gying gying = this.b;
                    switch (i2) {
                        case 0:
                            String[] strArr = Gying.x;
                            break;
                        default:
                            String[] strArr2 = Gying.x;
                            break;
                    }
                    return gying.action(str2);
                }
            });
            return "";
        }
        if (F(str)) {
            AbstractC0302v0.g0(str, new InterfaceC0245c(this) { // from class: com.github.catvod.spider.merge.u.r
                public final /* synthetic */ Gying b;

                {
                    this.b = this;
                }

                @Override // com.github.catvod.spider.merge.A.InterfaceC0245c
                public final String dispatch(String str2) {
                    Gying gying = this.b;
                    switch (i) {
                        case 0:
                            String[] strArr = Gying.x;
                            break;
                        default:
                            String[] strArr2 = Gying.x;
                            break;
                    }
                    return gying.action(str2);
                }
            });
            return "";
        }
        if (str.startsWith(C0053.m210(f50short, 109, 15, 392))) {
            String[] strArrK = l.k(str);
            String strG = l.g(strArrK);
            if (TextUtils.isEmpty(strG)) {
                return com.github.catvod.spider.merge.p001b.g.d(C0137.m545(f50short, 124, 4, 618));
            }
            if (!AbstractC0302v0.r0(strG)) {
                String strDetailContent = super.detailContent(Collections.singletonList(strG));
                return l.j(strDetailContent) ? l.i(str, strArrK) : l.c(strDetailContent, strArrK);
            }
            String strL2 = l.l(strArrK, 1);
            if (TextUtils.isEmpty(strL2)) {
                strL2 = C0098.m390(f50short, 128, 7, 2055);
            }
            boolean zJ0 = AbstractC0302v0.j0();
            boolean zC1 = AbstractC0302v0.C1();
            if (!zJ0 && AbstractC0302v0.Y()) {
                AbstractC0302v0.D1();
            }
            if (zJ0) {
                strJ1 = AbstractC0302v0.j1(strL2, strG);
            } else {
                strJ1 = zC1 ? strG : "";
            }
            if (zJ0) {
                strL = AbstractC0302v0.h1(strG);
            } else if (zC1) {
                this.v.getClass();
                strL = com.github.catvod.spider.merge.p020x.b.l(C0044.m175(f50short, 135, 6, 1656));
            } else {
                strL = "";
            }
            k kVar = new k();
            kVar.n(str);
            kVar.o(strL2);
            kVar.q(strL);
            kVar.r(strJ1);
            l.b(kVar, strArrK, "");
            AbstractC0280n1.p(strL2);
            AbstractC0280n1.q(strJ1);
            boolean z2 = FishCrypto.a;
            N1.d(kVar);
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        }
        String strM102 = C0026.m102(f50short, 141, 1, 1991);
        String[] strArrSplit = str.split(strM102, 2);
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        try {
            final String str4 = this.r + strM102 + str2 + strM102 + str3;
            final String str5 = this.r + C0126.m503(f50short, 142, 13, 1122) + str2 + strM102 + str3;
            final HashMap mapC = C();
            final HashMap mapB = B(str4);
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
            try {
                Future futureSubmit = executorServiceNewFixedThreadPool.submit(new Callable<String>() { // from class: com.github.catvod.spider.Gying.1
                    @Override // java.util.concurrent.Callable
                    public String call() {
                        String[] strArr = Gying.x;
                        return Gying.this.y(str4, mapC);
                    }
                });
                Future futureSubmit2 = executorServiceNewFixedThreadPool.submit(new Callable<String>() { // from class: com.github.catvod.spider.Gying.2
                    @Override // java.util.concurrent.Callable
                    public String call() {
                        String[] strArr = Gying.x;
                        return Gying.this.y(str5, mapB);
                    }
                });
                TimeUnit timeUnit = TimeUnit.SECONDS;
                String str6 = (String) futureSubmit.get(30L, timeUnit);
                String str7 = (String) futureSubmit2.get(30L, timeUnit);
                executorServiceNewFixedThreadPool.shutdownNow();
                k kVarR = r(list.get(0), str6, str7);
                boolean z3 = FishCrypto.a;
                N1.d(kVarR);
                return com.github.catvod.spider.merge.p001b.g.s(kVarR);
            } catch (Throwable th) {
                executorServiceNewFixedThreadPool.shutdownNow();
                throw th;
            }
        } catch (Exception unused) {
            k kVar2 = new k();
            kVar2.n(list.get(0));
            kVar2.o(str3);
            kVar2.p(C0093.m368(f50short, 155, 22, 562) + str2 + strM102 + str3 + C0118.m471(f50short, 177, 9, 1018));
            kVar2.s(C0097.m386(f50short, 186, 6, 2263));
            boolean z4 = FishCrypto.a;
            N1.d(kVar2);
            return com.github.catvod.spider.merge.p001b.g.s(kVar2);
        }
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        if (F(str)) {
            if (this.w == null) {
                this.w = new C0261h0(this.v, 7);
            }
            this.w.i(str);
            return "";
        }
        str.getClass();
        if (str.equals(C0114.m454(f50short, 192, 16, 3153))) {
            InitOrigin.run(new RunnableC0460l(26));
        } else if (str.equals(C0105.m416(f50short, 208, 10, 2963))) {
            InitOrigin.run(new RunnableC0341a(5, this));
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:64:0x048a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0497  */
    /* JADX WARN: Code duplicated, block: B:67:0x049b  */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z2, HashMap<String, String> map) {
        int i;
        boolean zEquals = C0109.m432(f50short, 218, 8, 396).equals(str);
        String strM477 = C0120.m477(f50short, 226, 1, 2696);
        com.github.catvod.spider.merge.p020x.b bVar = this.v;
        int i2 = 1;
        if (zEquals) {
            String strM1 = TextUtils.isEmpty(this.s) ? C0001.m1(f50short, 227, 3, 2516) : C0001.m1(f50short, 230, 11, 890);
            if (!TextUtils.isEmpty(this.s) && this.s.equals(this.t)) {
                strM1 = C0135.m539(f50short, 241, 16, 3239);
            }
            ArrayList arrayList = new ArrayList();
            String strY0 = AbstractC0302v0.y0();
            StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strM1, C0119.m473(f50short, 257, 3, 1304));
            sbP.append(getCurrentSiteUrl());
            arrayList.add(new k(C0047.m186(f50short, 280, 16, 901), C0053.m210(f50short, 260, 4, 1895), strY0, sbP.toString(), C0120.m477(f50short, 264, 16, 2943)));
            arrayList.add(new k(C0105.m416(f50short, 316, 10, 2944), C0056.m223(f50short, 326, 4, 403), AbstractC0302v0.a0(), C0090.m358(f50short, 296, 10, 1733), C0133.m529(f50short, 306, 10, 348)));
            arrayList.add(new k(C0116.m463(f50short, 352, 7, 3154), C0142.m567(f50short, 341, 4, 1502), AbstractC0302v0.I(), bVar.o ? C0137.m545(f50short, 330, 7, 593) : C0017.m65(f50short, 337, 4, 2213), C0008.m31(f50short, 345, 7, 2901)));
            String strS = AbstractC0302v0.S();
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.f.size());
            sb.append(strM477);
            arrayList.add(new k(C0001.m1(f50short, 370, 6, 1258), C0135.m539(f50short, 360, 4, 458), strS, com.github.catvod.spider.merge.D.b.l(sb, com.github.catvod.spider.merge.p020x.c.c.length, C0044.m175(f50short, 359, 1, 1577)), C0116.m463(f50short, 364, 6, 1477)));
            arrayList.add(new k(C0055.m219(f50short, 385, 5, 417), C0079.m314(f50short, 376, 4, 2252), AbstractC0302v0.H1(), bVar.k(), C0119.m473(f50short, 380, 5, 329)));
            arrayList.add(new k(C0135.m539(f50short, 395, 5, 1264), C0044.m175(f50short, 400, 4, 3057), AbstractC0302v0.v1(), "", C0118.m471(f50short, 390, 5, 2158)));
            return AbstractC0449a.c(1, 1, arrayList.size(), arrayList.size(), arrayList);
        }
        if (str.startsWith(C0085.m339(f50short, 404, 8, 1389))) {
            if (!C0001.m1(f50short, 412, 1, 3204).equals(str2)) {
                return com.github.catvod.spider.merge.D.b.d();
            }
            ArrayList arrayList2 = new ArrayList();
            List list = (List) F.get(str);
            if (list != null) {
                String[] strArrSplit = str.split(C0076.m301(f50short, 413, 2, 494));
                String str3 = strArrSplit.length > 2 ? strArrSplit[2] : "";
                bVar.getClass();
                String strL = com.github.catvod.spider.merge.p020x.b.l(str3);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(l.f(str3, strL, "", (JSONObject) it.next()));
                }
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        try {
            int i3 = Integer.parseInt(str2);
            try {
                String strY = y(this.r + C0008.m31(f50short, 415, 5, 530) + str + C0001.m1(f50short, 420, 6, 661) + str2, B(this.r + strM477));
                if (D(strY)) {
                    arrayList3.addAll(o(E(strY) ? C0092.m365(f50short, 426, 6, 1450) : C0010.m36(f50short, 432, 6, 1041)));
                    com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                    gVar.o(i3, 1, 60, 60);
                    gVar.F(arrayList3);
                    return gVar.r();
                }
                if (strY.startsWith(C0098.m390(f50short, 438, 1, 2806))) {
                    JSONObject jSONObject = new JSONObject(strY);
                    i = jSONObject.getJSONObject(C0143.m570(f50short, 439, 4, 2639)).getInt(C0074.m292(f50short, 443, 5, 3120));
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(C0081.m322(f50short, 448, 6, 1332));
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(C0008.m31(f50short, 454, 1, 1352));
                        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(C0103.m408(f50short, 455, 1, 1600));
                        JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray(C0063.m249(f50short, 456, 1, 2939));
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null) {
                            k(arrayList3, str, jSONArrayOptJSONArray, jSONArrayOptJSONArray2, jSONArrayOptJSONArray3);
                        }
                    } catch (Exception unused) {
                        i2 = i3;
                        i3 = i2;
                    }
                    i2 = i;
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.addAll(x(str, str2));
                    if (arrayList3.size() >= 60) {
                        i2 = i3 + 1;
                    } else {
                        i2 = i3;
                    }
                }
                return AbstractC0449a.c(i3, i2, 60, i2 * 60, arrayList3);
            } catch (Exception unused2) {
                i2 = i3;
                i = 1;
                i3 = i2;
                i2 = i;
                if (arrayList3.isEmpty()) {
                    arrayList3.addAll(x(str, str2));
                    if (arrayList3.size() >= 60) {
                        i2 = i3 + 1;
                    } else {
                        i2 = i3;
                    }
                }
                return AbstractC0449a.c(i3, i2, 60, i2 * 60, arrayList3);
            }
        } catch (Exception unused3) {
        }
    }

    static {
        String[] strArr = {C0103.m408(f50short, 575, 33, 2890), C0114.m454(f50short, 608, 34, 1926), C0118.m471(f50short, 642, 40, 2344), C0046.m182(f50short, 682, 33, 1706), C0059.m234(f50short, 512, 26, 1125), C0017.m65(f50short, 538, 37, 611), C0055.m219(f50short, 715, 35, 1822), C0097.m386(f50short, 750, 34, 2005)};
        A = strArr;
        B = new Q(1);
        C = new Object();
        D = new HashMap();
        E = strArr[0];
        F = new HashMap();
    }

    public static String A(String... strArr) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public static HashMap B(String str) {
        String strReplace = str;
        HashMap mapC = C();
        try {
            String host = new URL(strReplace).getHost();
            String ascii = IDN.toASCII(host);
            if (!host.equals(ascii)) {
                strReplace = strReplace.replace(host, ascii);
            }
        } catch (Exception unused) {
        }
        mapC.put(C0026.m102(f50short, 797, 7, 1721), strReplace);
        return mapC;
    }

    public static HashMap C() {
        HashMap mapT = com.github.catvod.spider.merge.D.b.t(C0027.m105(f50short, 804, 10, 523), C0001.m1(f50short, 814, 135, 2181), C0097.m386(f50short, 949, 6, 1918), C0030.m116(f50short, 955, 63, 1389));
        mapT.put(C0128.m511(f50short, 1018, 15, 1249), C0105.m416(f50short, 1033, 14, 2033));
        return mapT;
    }

    public static boolean D(String str) {
        return G(str) || H(str) || E(str);
    }

    public static boolean E(String str) {
        return !TextUtils.isEmpty(str) && (str.contains(C0109.m432(f50short, 1047, 7, 1377)) || str.contains(C0101.m402(f50short, 1054, 3, 1145)));
    }

    public static boolean F(String str) {
        return C0117.m467(f50short, 1057, 7, 2424).equals(str) || C0118.m471(f50short, 1064, 6, 1440).equals(str) || C0082.m325(f50short, 1070, 5, 327).equals(str) || C0019.m75(f50short, 1075, 5, 2064).equals(str);
    }

    public static boolean G(String str) {
        return (TextUtils.isEmpty(str) || str.contains(C0109.m432(f50short, 1080, 5, 3169)) || (!str.contains(C0114.m454(f50short, 1085, 7, 779)) && !str.contains(C0128.m511(f50short, 1092, 10, 1068)) && !str.contains(C0105.m416(f50short, 1102, 7, 1098)))) ? false : true;
    }

    public static boolean H(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith(C0091.m360(f50short, 1109, 1, 1722))) {
            try {
                JSONObject jSONObject = new JSONObject(strTrim);
                if (jSONObject.optInt(C0090.m358(f50short, 1110, 4, 1794), 0) == 419) {
                    return true;
                }
                if (jSONObject.optInt(C0010.m36(f50short, 1114, 7, 1074), 0) == 1 && jSONObject.optString(C0093.m368(f50short, 1121, 3, 2604), "").contains(C0053.m210(f50short, 1124, 2, 2423))) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return strTrim.contains(C0021.m83(f50short, 1126, 8, 890)) || strTrim.contains(C0072.m285(f50short, 1134, 10, 2287));
    }

    public static String I(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (i > 0) {
                sb.append(C0045.m177(f50short, 1144, 1, 2666));
            }
            sb.append(jSONArray.optString(i));
        }
        return sb.toString();
    }

    public static String J(String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strTrim = str.trim();
        if (strTrim.startsWith(C0085.m339(f50short, 1145, 7, 2166)) && (iIndexOf = strTrim.indexOf(C0045.m177(f50short, 1152, 5, 396))) >= 0) {
            int iIndexOf2 = strTrim.indexOf(38, iIndexOf);
            int i = iIndexOf + 5;
            strTrim = iIndexOf2 >= 0 ? strTrim.substring(i, iIndexOf2) : strTrim.substring(i);
        }
        return strTrim.matches(C0114.m454(f50short, 1157, 16, 1278)) ? strTrim.toLowerCase() : "";
    }

    public static JSONObject K(k kVar, String str) {
        String strM358 = C0090.m358(f50short, 1173, 8, 773);
        if (TextUtils.isEmpty(str) || G(str)) {
            kVar.s(C0045.m177(f50short, 1219, 19, 618));
            return null;
        }
        if (E(str)) {
            kVar.s(C0128.m511(f50short, 1181, 11, 2284));
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt(C0104.m414(f50short, 1192, 4, 1357), 200) == 200) {
                return jSONObject;
            }
            kVar.s(strM358 + jSONObject.optString(C0017.m65(f50short, 1196, 3, 2662), C0049.m193(f50short, 1199, 6, 2509)));
            return null;
        } catch (Exception unused) {
            kVar.s(C0122.m486(f50short, 1205, 14, 1437));
            return null;
        }
    }

    public static void L(String str, LinkedHashMap linkedHashMap) {
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(C0073.m288(f50short, 1238, 1, 1711))) {
            String strTrim = str2.trim();
            if (!strTrim.isEmpty() && (iIndexOf = strTrim.indexOf(61)) > 0) {
                String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                String strTrim3 = strTrim.substring(iIndexOf + 1).trim();
                if (!TextUtils.isEmpty(strTrim2)) {
                    String lowerCase = strTrim2.toLowerCase();
                    if (!lowerCase.equals(C0074.m292(f50short, 1239, 4, 1125)) && !lowerCase.equals(C0106.m422(f50short, 1243, 6, 2469)) && !lowerCase.equals(C0018.m70(f50short, 1249, 7, 1749)) && !lowerCase.equals(C0122.m486(f50short, 1256, 7, 803)) && !lowerCase.equals(C0074.m292(f50short, 1263, 8, 439)) && !lowerCase.equals(C0135.m539(f50short, 1271, 6, 1591)) && !lowerCase.equals(C0106.m422(f50short, 1277, 8, 2188)) && !lowerCase.equals(C0130.m516(f50short, 1285, 8, 2078))) {
                        if (TextUtils.isEmpty(strTrim3)) {
                            linkedHashMap.remove(strTrim2);
                        } else {
                            linkedHashMap.put(strTrim2, strTrim3);
                        }
                    }
                }
            }
        }
    }

    public static void N() {
        B.a();
        synchronized (C) {
            D.clear();
        }
    }

    public static String O(String str) {
        if (TextUtils.isEmpty(str)) {
            return C0072.m285(f50short, 1293, 2, 2868);
        }
        String strM42 = C0011.m42(f50short, 1295, 1, 2307);
        String strM301 = C0076.m301(f50short, 1296, 1, 2232);
        return com.github.catvod.spider.merge.D.b.k(str, strM42, strM301, C0011.m42(f50short, 1297, 1, 825), strM301);
    }

    public static String Q(String str) {
        try {
            return new URL(str).getHost();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String R(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + C0011.m42(f50short, 1298, 3, 2763) + url.getHost();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void clearCookie() {
        boolean z2 = FishCrypto.a;
        C0297t1.b(C0028.m108(f50short, 1301, 12, 2732));
        N();
    }

    public static String getCurrentSiteUrl() {
        return TextUtils.isEmpty(E) ? A[0] : E;
    }

    public static String getSavedCookie() {
        boolean z2 = FishCrypto.a;
        return P1.u0(C0297t1.h(C0101.m402(f50short, 1313, 12, 1556)));
    }

    public static void i(JSONObject jSONObject, HashSet hashSet, String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (hashSet.add(str + C0117.m467(f50short, 1325, 1, 2157) + str2)) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONObject.put(str, jSONArrayOptJSONArray);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C0116.m463(f50short, 1326, 3, 3199), str2);
                jSONObject2.put(C0001.m1(f50short, 1329, 4, 1693), str3);
                jSONObject2.put(C0105.m416(f50short, 1333, 8, 926), str5);
                jSONObject2.put(C0003.m10(f50short, 1341, 6, 2144), str6);
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject2.put(C0126.m503(f50short, 1347, 6, 1990), new JSONArray().put(str4));
                }
                jSONArrayOptJSONArray.put(jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    public static void j(ArrayList arrayList, ArrayList arrayList2, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        arrayList.add(str);
        arrayList2.add(str2);
    }

    public static void l(StringBuilder sb, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(C0059.m234(f50short, 1353, 1, 2315));
        }
        sb.append(str);
    }

    public static ArrayList o(String str) {
        boolean z2 = FishCrypto.a;
        String str2 = N1.p;
        ArrayList arrayList = new ArrayList();
        StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(str, C0098.m390(f50short, 1354, 3, 925));
        sbP.append(getCurrentSiteUrl());
        arrayList.add(new k(C0074.m292(f50short, 1357, 16, 1317), C0118.m471(f50short, 1373, 4, 1038), str2, sbP.toString(), C0074.m292(f50short, 1377, 16, 444)));
        return arrayList;
    }

    public static String p(String str, String str2) {
        String strB = com.github.catvod.spider.merge.D.b.B(C0091.m360(f50short, 1393, 20, 2062), str);
        if (TextUtils.isEmpty(str2)) {
            return strB;
        }
        try {
            return strB + C0095.m379(f50short, 1413, 4, 911) + URLEncoder.encode(str2, C0009.m33(f50short, 1417, 5, 2827));
        } catch (Exception unused) {
            return strB;
        }
    }

    public static void saveCookie(String str) {
        String strU0 = P1.u0(str);
        if (TextUtils.isEmpty(strU0)) {
            clearCookie();
            return;
        }
        boolean z2 = FishCrypto.a;
        C0297t1.j(C0070.m277(f50short, 1422, 12, 460), strU0);
        N();
    }

    public static void t(JSONObject jSONObject, HashSet hashSet, JSONObject jSONObject2, String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject2 == null || (jSONObjectOptJSONObject = jSONObject2.optJSONObject(C0028.m108(f50short, 1434, 4, 2000))) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(C0095.m379(f50short, 1438, 1, 770))) == null) {
            return;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(C0073.m288(f50short, 1439, 1, 2589));
        JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray(C0143.m570(f50short, 1440, 1, 864));
        JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject.optJSONArray(C0044.m175(f50short, 1441, 1, 1699));
        for (int i = 0; i < jSONArrayOptJSONArray.length() && i < 80; i++) {
            String strJ = J(jSONArrayOptJSONArray.optString(i, ""));
            if (!TextUtils.isEmpty(strJ)) {
                String strOptString = jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.optString(i, "") : "";
                if (TextUtils.isEmpty(strOptString)) {
                    strOptString = str;
                }
                String strOptString2 = jSONArrayOptJSONArray3 != null ? jSONArrayOptJSONArray3.optString(i, "") : "";
                String strOptString3 = jSONArrayOptJSONArray4 != null ? jSONArrayOptJSONArray4.optString(i, "") : "";
                StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strOptString);
                sbO.append(TextUtils.isEmpty(strOptString2) ? "" : com.github.catvod.spider.merge.D.b.j(C0101.m402(f50short, 1442, 2, 1370), strOptString2, C0122.m486(f50short, 1444, 1, 2899)));
                sbO.append(TextUtils.isEmpty(strOptString3) ? "" : com.github.catvod.spider.merge.D.b.B(C0117.m467(f50short, 1445, 1, 823), strOptString3));
                i(jSONObject, hashSet, C0009.m33(f50short, 1446, 6, 917), p(strJ, strOptString), O(sbO.toString()), str2, str3, str);
            }
        }
    }

    public static void u(JSONArray jSONArray, ArrayList arrayList) {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objOpt;
                String strA = A(jSONObject.optString(C0087.m346(f50short, 1452, 3, 2138)), jSONObject.optString(C0116.m463(f50short, 1455, 1, 449)), jSONObject.optString(C0056.m223(f50short, 1456, 4, 3111)));
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(strA);
                }
            } else {
                String strOptString = jSONArray.optString(i, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(strOptString);
                }
            }
        }
    }

    public static String w(String str, String str2) {
        int length;
        String strJ = com.github.catvod.spider.merge.D.b.j(C0139.m554(f50short, 1460, 5, 1296), str2, C0028.m108(f50short, 1465, 1, 741));
        int iIndexOf = str.indexOf(strJ);
        String strM175 = C0044.m175(f50short, 1466, 2, 3131);
        if (iIndexOf < 0 || (length = strJ.length() + iIndexOf) >= str.length()) {
            return strM175;
        }
        char cCharAt = str.charAt(length);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        for (int i2 = length; i2 < str.length(); i2++) {
            char cCharAt2 = str.charAt(i2);
            if (z2) {
                z2 = false;
            } else if (cCharAt2 == '\\' && z3) {
                z2 = true;
            } else if (cCharAt2 == '\"') {
                z3 = !z3;
            } else if (z3) {
                continue;
            } else if (cCharAt2 == '{' || cCharAt2 == '[') {
                i++;
            } else if ((cCharAt2 == '}' || cCharAt2 == ']') && (i = i - 1) == 0) {
                return str.substring(length, i2 + 1);
            }
        }
        return cCharAt == '[' ? C0044.m175(f50short, 1468, 2, 2530) : strM175;
    }

    public static ArrayList z(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof JSONArray) {
            u((JSONArray) obj, arrayList);
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            u(jSONObject.optJSONArray(C0032.m126(f50short, 1470, 3, 3082)), arrayList);
            u(jSONObject.optJSONArray(C0117.m467(f50short, 1473, 4, 596)), arrayList);
            u(jSONObject.optJSONArray(C0053.m210(f50short, 1477, 4, 2913)), arrayList);
        }
        JSONArray jSONArray = new JSONArray((Collection) arrayList);
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String lowerCase = "";
            String strOptString = jSONArray.optString(i, "");
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    int iIndexOf = strOptString.indexOf(C0030.m116(f50short, 1481, 3, 3155));
                    if (iIndexOf >= 0) {
                        int i2 = iIndexOf + 3;
                        int iIndexOf2 = strOptString.indexOf(47, i2);
                        if (iIndexOf2 < 0) {
                            iIndexOf2 = strOptString.length();
                        }
                        lowerCase = strOptString.substring(i2, iIndexOf2).toLowerCase();
                    }
                } catch (Exception unused) {
                }
                if (!TextUtils.isEmpty(lowerCase)) {
                    int iIntValue = map.containsKey(lowerCase) ? ((Integer) map.get(lowerCase)).intValue() : 0;
                    if (iIntValue < 3) {
                        map.put(lowerCase, Integer.valueOf(iIntValue + 1));
                        arrayList2.add(strOptString);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final void M(String str) {
        String strR = R(str);
        if (TextUtils.isEmpty(strR)) {
            return;
        }
        String strQ = Q(strR);
        synchronized (C) {
            try {
                Q q = B;
                q.a();
                P(strR, false);
                N nY = X1.y(strR + C0011.m42(f50short, 1484, 1, 2313), null, B(strR + C0032.m126(f50short, 1485, 1, 1152)), q);
                h(nY);
                String strA = nY.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                if (!G(strA) || S(strR)) {
                    D.put(strQ, Long.valueOf(System.currentTimeMillis()));
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void P(String str, boolean z2) {
        String savedCookie;
        int iIndexOf;
        if (z2) {
            savedCookie = getSavedCookie();
            if (TextUtils.isEmpty(savedCookie)) {
                savedCookie = this.s;
            }
        } else {
            savedCookie = getSavedCookie();
            if (TextUtils.isEmpty(savedCookie)) {
                savedCookie = this.s;
            }
            if (!TextUtils.isEmpty(savedCookie)) {
                String strM116 = C0030.m116(f50short, 1486, 16, 2939);
                if (!TextUtils.isEmpty(strM116)) {
                    StringBuilder sb = new StringBuilder();
                    String lowerCase = strM116.toLowerCase();
                    for (String str2 : savedCookie.split(C0003.m10(f50short, 1502, 1, 3007))) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty() && (iIndexOf = strTrim.indexOf(61)) > 0) {
                            String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                            if (!lowerCase.equals(strTrim2.toLowerCase())) {
                                if (sb.length() > 0) {
                                    sb.append(C0135.m539(f50short, 1503, 2, 2064));
                                }
                                sb.append(strTrim2);
                                sb.append(C0011.m42(f50short, 1505, 1, 563));
                                sb.append(strTrim.substring(iIndexOf + 1).trim());
                            }
                        }
                    }
                    savedCookie = sb.toString();
                }
            }
        }
        if (TextUtils.isEmpty(savedCookie)) {
            return;
        }
        B.b(com.github.catvod.spider.merge.D.b.i(str, C0044.m175(f50short, 1506, 1, 953)), savedCookie);
    }

    public final boolean S(String str) {
        Q q = B;
        String strM382 = C0096.m382(f50short, 1507, 1, 3045);
        String strM477 = C0120.m477(f50short, 1508, 8, 1061);
        try {
            JSONObject jSONObject = new JSONObject(X1.W(str + strM477, B(str + strM382), q));
            String strOptString = jSONObject.optString(C0059.m234(f50short, 1516, 1, 348));
            String strOptString2 = jSONObject.optString(C0115.m459(f50short, 1517, 1, 1286));
            int iOptInt = jSONObject.optInt(C0049.m193(f50short, 1518, 1, 958));
            String string = "";
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && iOptInt >= 0 && iOptInt <= 2000000) {
                try {
                    BigInteger bigInteger = new BigInteger(strOptString, 16);
                    BigInteger bigInteger2 = new BigInteger(strOptString2, 16);
                    for (int i = 0; i < iOptInt; i++) {
                        bigInteger2 = bigInteger2.multiply(bigInteger2).mod(bigInteger);
                    }
                    string = bigInteger2.toString(16);
                } catch (Exception unused) {
                }
            }
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            HashMap mapB = B(str + strM382);
            mapB.put(C0079.m314(f50short, 1519, 6, 1290), str);
            HashMap map = new HashMap();
            map.put(C0085.m339(f50short, 1525, 1, 1640), string);
            N nO = X1.O(str + strM477, map, mapB, q);
            boolean zOptBoolean = new JSONObject(nO.a()).optBoolean(C0044.m175(f50short, 1526, 7, 402));
            if (zOptBoolean) {
                h(nO);
            }
            return zOptBoolean;
        } catch (Exception unused2) {
            return false;
        }
    }

    public final k T(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(C0140.m558(f50short, 1533, 2, 3153), "");
        String strOptString2 = jSONObject.optString(C0026.m102(f50short, 1535, 5, 1778), "");
        String strM186 = C0047.m186(f50short, 1540, 3, 1086);
        String strM105 = C0027.m105(f50short, 1543, 2, 964);
        String strOptString3 = jSONObject.optString(strM186, strM105);
        String strOptString4 = jSONObject.optString(C0074.m292(f50short, 1545, 4, 2632), "");
        if (!TextUtils.isEmpty(str) && !str.equals(strOptString3)) {
            return null;
        }
        if ((!strM105.equals(strOptString3) && !C0073.m288(f50short, 1549, 2, 1492).equals(strOptString3) && !C0135.m539(f50short, 1551, 2, 2577).equals(strOptString3)) || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        k kVar = new k();
        StringBuilder sb = new StringBuilder();
        sb.append(strOptString3);
        String strM463 = C0116.m463(f50short, 1553, 1, 1236);
        sb.append(strM463);
        sb.append(strOptString);
        kVar.n(sb.toString());
        kVar.o(strOptString2);
        String str2 = C0044.m175(f50short, 1554, 22, 2963) + strOptString3 + strM463 + strOptString + C0008.m31(f50short, 1576, 9, 2350);
        kVar.p(str2);
        kVar.s(strOptString4);
        kVar.u(strOptString4);
        s(kVar.b(), strOptString2, str2, strOptString4, strOptString4, "");
        return kVar;
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0120.m477(f50short, 1585, 6, 829));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0056.m223(f50short, 1591, 15, 2063));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0021.m83(f50short, 1606, 13, 2929));
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

    public final void h(N n) {
        List list;
        ArrayList<String> arrayList = new ArrayList();
        Map map = (Map) n.c;
        if (map != null) {
            String strM355 = C0089.m355(f50short, 1619, 10, 1735);
            if (!TextUtils.isEmpty(strM355)) {
                for (String str : map.keySet()) {
                    if (str != null && strM355.equalsIgnoreCase(str) && (list = (List) map.get(str)) != null) {
                        arrayList.addAll(list);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String savedCookie = getSavedCookie();
        if (TextUtils.isEmpty(savedCookie)) {
            savedCookie = this.s;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        L(savedCookie, linkedHashMap);
        for (String str2 : arrayList) {
            if (!TextUtils.isEmpty(str2)) {
                String[] strArrSplit = str2.split(C0107.m427(f50short, 1629, 1, 504));
                if (strArrSplit.length != 0) {
                    L(strArrSplit[0], linkedHashMap);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : linkedHashMap.keySet()) {
            String str4 = (String) linkedHashMap.get(str3);
            if (!TextUtils.isEmpty(str3) && str4 != null) {
                if (sb.length() > 0) {
                    sb.append(C0019.m75(f50short, 1630, 2, 1496));
                }
                sb.append(str3);
                sb.append(C0125.m499(f50short, 1632, 1, 2198));
                sb.append(str4);
            }
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (!TextUtils.isEmpty(savedCookie)) {
            this.s = string;
        }
        if (TextUtils.isEmpty(getSavedCookie())) {
            return;
        }
        boolean z2 = FishCrypto.a;
        C0297t1.j(C0096.m382(f50short, 1633, 12, 2856), string);
    }

    public String homeContent(boolean z2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0045.m177(f50short, 1645, 11, 2468));
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

    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9 A[LOOP:0: B:28:0x00d5->B:30:0x00d9, LOOP_END] */
    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        JSONArray jSONArrayOptJSONArray;
        String strTrim;
        String[] strArr;
        int i;
        super.init(context, str);
        this.v.o();
        this.w = new C0261h0(this.v, 7);
        if (!TextUtils.isEmpty(str)) {
            try {
                String strOptString = new JSONObject(str).optString(C0018.m70(f50short, 1656, 6, 2984), "");
                if (!TextUtils.isEmpty(strOptString)) {
                    this.t = P1.u0(strOptString);
                }
            } catch (Exception unused) {
                this.t = P1.u0(str);
            }
        }
        this.s = this.t;
        String savedCookie = getSavedCookie();
        if (!TextUtils.isEmpty(savedCookie)) {
            this.s = savedCookie;
        }
        N();
        if (TextUtils.isEmpty(str)) {
            jSONArrayOptJSONArray = new JSONArray();
            strArr = A;
            for (i = 0; i < 8; i++) {
                jSONArrayOptJSONArray.put(strArr[i]);
            }
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strM325 = C0082.m325(f50short, 1662, 4, 1231);
                jSONArrayOptJSONArray = jSONObject.optJSONArray(strM325);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray(C0091.m360(f50short, 1666, 5, 490));
                }
                if (jSONArrayOptJSONArray == null) {
                    String strOptString2 = jSONObject.optString(strM325, jSONObject.optString(C0120.m477(f50short, 1671, 3, 1976), ""));
                    if (TextUtils.isEmpty(strOptString2)) {
                        jSONArrayOptJSONArray = null;
                    } else {
                        jSONArrayOptJSONArray = new JSONArray();
                        jSONArrayOptJSONArray.put(strOptString2);
                    }
                }
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                    jSONArrayOptJSONArray = new JSONArray();
                    strArr = A;
                    while (i < 8) {
                        jSONArrayOptJSONArray.put(strArr[i]);
                    }
                }
            } catch (Exception unused2) {
            }
        }
        int length = jSONArrayOptJSONArray.length();
        String strM108 = C0028.m108(f50short, 1674, 1, 1070);
        if (length > 0) {
            String str2 = "";
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                String strOptString3 = jSONArrayOptJSONArray.optString(i2, "");
                if (TextUtils.isEmpty(strOptString3)) {
                    strTrim = "";
                } else {
                    strTrim = strOptString3.trim();
                    if (strTrim.endsWith(strM108)) {
                        strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
                    }
                    try {
                        String host = new URL(strTrim).getHost();
                        String ascii = IDN.toASCII(host);
                        if (!host.equals(ascii)) {
                            strTrim = strTrim.replace(host, ascii);
                        }
                    } catch (Exception unused3) {
                    }
                }
                if (!strTrim.isEmpty()) {
                    if (str2.isEmpty()) {
                        str2 = strTrim;
                    }
                    try {
                        String strY = y(strTrim + strM108, B(strTrim + strM108));
                        if (!TextUtils.isEmpty(strY) && !G(strY) && !strY.contains(C0017.m65(f50short, 1675, 28, 1199))) {
                            this.r = strTrim;
                            break;
                        }
                    } catch (Exception unused4) {
                        continue;
                    }
                }
            }
            if (this.r.isEmpty()) {
                this.r = str2;
            }
        }
        if (this.r.endsWith(strM108)) {
            this.r = com.github.catvod.spider.merge.D.b.g(this.r, 1, 0);
        }
        if (TextUtils.isEmpty(this.r)) {
            return;
        }
        E = this.r;
    }

    public final void k(ArrayList arrayList, String str, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i, "");
            String strOptString2 = jSONArray2.optString(i, "");
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                String strOptString3 = jSONArray3 != null ? jSONArray3.optString(i, "") : "";
                k kVar = new k();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String strM108 = C0028.m108(f50short, 1703, 1, 678);
                sb.append(strM108);
                sb.append(strOptString);
                kVar.n(sb.toString());
                kVar.o(strOptString2);
                String str2 = C0076.m301(f50short, 1704, 22, 1191) + str + strM108 + strOptString + C0017.m65(f50short, 1726, 9, 2845);
                kVar.p(str2);
                kVar.s(strOptString3);
                s(kVar.b(), strOptString2, str2, strOptString3, "", "");
                arrayList.add(kVar);
            }
        }
    }

    public final void m(String str, ArrayList arrayList) {
        String str2;
        String strM10 = C0003.m10(f50short, 1735, 1, 2852);
        if (TextUtils.isEmpty(str) || G(str) || E(str)) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(w(str, C0050.m199(f50short, 1736, 6, 3242))).optJSONObject(C0128.m511(f50short, 1742, 1, 1005));
            if (jSONObjectOptJSONObject == null) {
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(C0019.m75(f50short, 1743, 1, 1652));
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(C0115.m459(f50short, 1744, 1, 2051));
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray(C0140.m558(f50short, 1745, 5, 2939));
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray3 != null) {
                JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject.optJSONArray(C0093.m368(f50short, 1750, 4, 2738));
                JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject.optJSONArray(C0059.m234(f50short, 1754, 5, 1310));
                JSONArray jSONArrayOptJSONArray6 = jSONObjectOptJSONObject.optJSONArray(C0063.m249(f50short, 1759, 4, 971));
                JSONArray jSONArrayOptJSONArray7 = jSONObjectOptJSONObject.optJSONArray(C0028.m108(f50short, 1763, 4, 1438));
                int i = 0;
                while (i < jSONArrayOptJSONArray.length()) {
                    String strOptString = jSONArrayOptJSONArray.optString(i, "");
                    String strOptString2 = jSONArrayOptJSONArray2.optString(i, "");
                    String strA = A(jSONArrayOptJSONArray3.optString(i, ""), jSONArrayOptJSONArray4 != null ? jSONArrayOptJSONArray4.optString(i, "") : "");
                    if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strA) || !(C0003.m10(f50short, 1767, 2, 1456).equals(strOptString2) || C0030.m116(f50short, 1769, 2, 632).equals(strOptString2) || C0118.m471(f50short, 1771, 2, 869).equals(strOptString2))) {
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    } else {
                        String strOptString3 = jSONArrayOptJSONArray6 != null ? jSONArrayOptJSONArray6.optString(i, "") : "";
                        String strOptString4 = jSONArrayOptJSONArray7 != null ? jSONArrayOptJSONArray7.optString(i, "") : "";
                        if (TextUtils.isEmpty(strOptString3)) {
                            if (strOptString4 == null) {
                                strOptString4 = "";
                            }
                            str2 = strOptString4;
                        } else if (TextUtils.isEmpty(strOptString4)) {
                            str2 = strOptString3;
                        } else {
                            str2 = strOptString3 + C0046.m182(f50short, 1773, 3, 1545) + strOptString4;
                        }
                        String str3 = strOptString2 + strM10 + strOptString;
                        String str4 = C0139.m554(f50short, 1776, 22, 2573) + strOptString2 + strM10 + strOptString + C0107.m427(f50short, 1798, 9, 1701);
                        StringBuilder sb = new StringBuilder();
                        l(sb, jSONArrayOptJSONArray4 != null ? jSONArrayOptJSONArray4.optString(i, "") : "");
                        l(sb, jSONArrayOptJSONArray5 != null ? jSONArrayOptJSONArray5.optString(i, "") : "");
                        l(sb, jSONArrayOptJSONArray7 != null ? jSONArrayOptJSONArray7.optString(i, "") : "");
                        String string = sb.toString();
                        k kVar = new k();
                        kVar.n(str3);
                        kVar.o(strA);
                        kVar.p(str4);
                        kVar.s(str2);
                        kVar.u(strOptString3);
                        kVar.l(string);
                        s(str3, strA, str4, str2, strOptString3, string);
                        arrayList.add(kVar);
                    }
                    i++;
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final SuggestResult n(String str, String str2, ArrayList arrayList) {
        try {
            String strY = y(this.r + C0018.m70(f50short, 1807, 22, 391) + str, B(this.r + C0045.m177(f50short, 1829, 1, 1101)));
            if (D(strY)) {
                return new SuggestResult(strY, false);
            }
            if (TextUtils.isEmpty(strY) || !strY.trim().startsWith(C0011.m42(f50short, 1830, 1, 1923))) {
                return new SuggestResult("", false);
            }
            JSONArray jSONArray = new JSONArray(strY);
            for (int i = 0; i < jSONArray.length(); i++) {
                k kVarT = T(str2, jSONArray.optJSONObject(i));
                if (kVarT != null) {
                    arrayList.add(kVarT);
                }
            }
            return new SuggestResult("", true);
        } catch (Exception unused) {
            return new SuggestResult("", false);
        }
    }

    @Override // com.github.catvod.spider.Cloud
    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0105.m416(f50short, 1831, 13, 1968));
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

    public final ArrayList q(String str, ArrayList arrayList) {
        JSONObject jSONObject = new JSONObject();
        HashSet hashSet = new HashSet();
        int iMin = Math.min(arrayList.size(), 12);
        char c = 0;
        int i = 0;
        while (i < iMin) {
            k kVar = (k) arrayList.get(i);
            String strM193 = C0049.m193(f50short, 1844, 22, 736);
            if (kVar != null && !TextUtils.isEmpty(kVar.b())) {
                String strB = kVar.b();
                String strM116 = C0030.m116(f50short, 1866, 1, 3064);
                String[] strArrSplit = strB.split(strM116, 2);
                if (strArrSplit.length >= 2) {
                    String str2 = strArrSplit[c];
                    String str3 = strArrSplit[1];
                    try {
                        JSONObject jSONObjectK = K(new k(), y(this.r + C0019.m75(f50short, 1867, 13, 1875) + str2 + strM116 + str3, B(this.r + strM116 + str2 + strM116 + str3)));
                        if (jSONObjectK != null) {
                            String[] strArr = (String[]) this.u.get(kVar.b());
                            String strC = kVar.c();
                            String str4 = (strArr == null || TextUtils.isEmpty(strArr[1])) ? strM193 + str2 + strM116 + str3 + C0115.m459(f50short, 1880, 9, 2914) : strArr[1];
                            String str5 = strArr != null ? strArr[2] : "";
                            for (String str6 : z(jSONObjectK.opt(C0101.m402(f50short, 1889, 7, 2489)))) {
                                String strL = AbstractC0244b1.l(AbstractC0302v0.b1(str6));
                                if (TextUtils.isEmpty(strL)) {
                                    strL = AbstractC0302v0.r0(str6) ? C0030.m116(f50short, 1896, 6, 3032) : "";
                                }
                                String str7 = strL;
                                if (!TextUtils.isEmpty(str7)) {
                                    i(jSONObject, hashSet, str7, str6, strC, str4, str5, strC);
                                }
                            }
                            t(jSONObject, hashSet, jSONObjectK.optJSONObject(C0046.m182(f50short, 1902, 8, 1706)), strC, str4, str5);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            i++;
            c = 0;
        }
        com.github.catvod.spider.merge.p020x.b bVar = this.v;
        LinkedHashMap linkedHashMapI = AbstractC0244b1.i(jSONObject, new C0241a1(bVar.f, bVar.g, bVar.h, bVar.n));
        ArrayList arrayList2 = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (String str8 : bVar.f) {
            List list = (List) linkedHashMapI.get(str8);
            if (list != null && !list.isEmpty()) {
                String strL2 = com.github.catvod.spider.merge.p020x.b.l(str8);
                StringBuilder sb = new StringBuilder(C0101.m402(f50short, 1910, 8, 2181));
                sb.append(URLEncoder.encode(str, C0019.m75(f50short, 1918, 5, 2400)));
                String strM234 = C0059.m234(f50short, 1923, 2, 2497);
                sb.append(strM234);
                sb.append(str8);
                sb.append(strM234);
                sb.append(jCurrentTimeMillis);
                String string = sb.toString();
                F.put(string, list);
                StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strL2, C0043.m169(f50short, 1925, 2, 2228));
                sbP.append(list.size());
                sbP.append(C0118.m471(f50short, 1927, 2, 1863));
                arrayList2.add(new k(string, sbP.toString(), AbstractC0302v0.j(str8), strL2, true));
            }
        }
        return arrayList2;
    }

    public final k r(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        String strOptString;
        String strA;
        String strM567 = C0142.m567(f50short, 1929, 1, 2485);
        String[] strArrSplit = str.split(strM567, 2);
        String strM322 = strArrSplit.length > 0 ? strArrSplit[0] : C0081.m322(f50short, 1930, 2, 2559);
        String str4 = strArrSplit.length > 1 ? strArrSplit[1] : str;
        k kVarA = AbstractC0449a.a(str);
        String strM473 = C0119.m473(f50short, 1932, 22, 833);
        StringBuilder sb = new StringBuilder(strM473);
        sb.append(strM322);
        sb.append(strM567);
        sb.append(str4);
        String strM355 = C0089.m355(f50short, 1954, 9, 1863);
        sb.append(strM355);
        kVarA.p(sb.toString());
        String[] strArr = (String[]) this.u.get(str);
        if (strArr != null) {
            if (!TextUtils.isEmpty(strArr[0])) {
                kVarA.o(strArr[0]);
            }
            if (!TextUtils.isEmpty(strArr[1])) {
                kVarA.p(strArr[1]);
            }
            if (!TextUtils.isEmpty(strArr[2])) {
                kVarA.s(strArr[2]);
            }
            if (!TextUtils.isEmpty(strArr[3])) {
                kVarA.u(strArr[3]);
            }
            if (!TextUtils.isEmpty(strArr[4])) {
                kVarA.l(strArr[4]);
            }
        }
        JSONObject jSONObject = null;
        if (!TextUtils.isEmpty(str2) && !G(str2) && !E(str2)) {
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(w(str2, C0140.m558(f50short, 1963, 1, 1478)));
                    if (jSONObject2.length() != 0) {
                        jSONObject = jSONObject2;
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
        }
        String strM42 = C0011.m42(f50short, 1964, 5, 1387);
        if (jSONObject != null) {
            kVarA.o(jSONObject.optString(strM42));
            kVarA.p(strM473 + strM322 + strM567 + str4 + strM355);
            kVarA.l(jSONObject.optString(C0107.m427(f50short, 1969, 7, 1677)));
            kVarA.u(jSONObject.optString(C0043.m169(f50short, 1976, 4, 363)));
            kVarA.k(I(jSONObject.optJSONArray(C0017.m65(f50short, 1980, 4, 3146))));
            kVarA.j(I(jSONObject.optJSONArray(C0006.m21(f50short, 1984, 6, 3236))));
            kVarA.m(I(jSONObject.optJSONArray(C0128.m511(f50short, 1990, 6, 1758))));
        } else if (G(str2) || E(str2)) {
            kVarA.l(C0097.m386(f50short, 1996, 24, 946));
        }
        if (TextUtils.isEmpty(kVarA.c())) {
            kVarA.o(str4);
        }
        JSONObject jSONObjectK = K(kVarA, str3);
        if (jSONObjectK == null) {
            return kVarA;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            ArrayList arrayListZ = z(jSONObjectK.opt(C0001.m1(f50short, 2020, 7, 2717)));
            if (!arrayListZ.isEmpty()) {
                j(arrayList, arrayList2, a(arrayListZ), b(arrayListZ));
            }
        } catch (Exception unused3) {
        }
        Object objOpt = jSONObjectK.opt(C0109.m432(f50short, 2027, 8, 1309));
        boolean z2 = objOpt instanceof JSONArray;
        String strM36 = C0010.m36(f50short, 2035, 1, 2761);
        if (z2) {
            JSONArray jSONArray = (JSONArray) objOpt;
            ArrayList arrayList3 = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objOpt2 = jSONArray.opt(i);
                boolean z3 = objOpt2 instanceof JSONObject;
                String strM323 = C0081.m322(f50short, 2036, 2, 1389);
                if (z3) {
                    JSONObject jSONObject3 = (JSONObject) objOpt2;
                    strA = A(jSONObject3.optString(C0089.m355(f50short, 2038, 4, 2921)), jSONObject3.optString(strM42), jSONObject3.optString(strM36), strM323 + (i + 1));
                    strOptString = A(jSONObject3.optString(C0106.m422(f50short, 2042, 3, 1321)), jSONObject3.optString(C0126.m503(f50short, 2045, 1, 1476)), jSONObject3.optString(C0032.m126(f50short, 2046, 4, 3253)));
                } else {
                    strOptString = jSONArray.optString(i);
                    strA = strM323 + (i + 1);
                }
                if (!TextUtils.isEmpty(strOptString) && (strOptString.startsWith(C0045.m177(f50short, 2050, 7, 1481)) || strOptString.startsWith(C0093.m368(f50short, 2057, 8, 2611)) || strOptString.startsWith(C0122.m486(f50short, 2065, 7, 1008)))) {
                    arrayList3.add(O(strA) + C0056.m223(f50short, 2072, 1, 803) + strOptString);
                }
            }
            if (!arrayList3.isEmpty()) {
                j(arrayList, arrayList2, C0109.m432(f50short, 2074, 4, 1885), TextUtils.join(C0128.m511(f50short, 2073, 1, 2648), arrayList3));
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectK.optJSONObject(C0140.m558(f50short, 2078, 8, 2449));
        String strC = kVarA.c();
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(C0122.m486(f50short, 2086, 4, 802))) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(C0116.m463(f50short, 2090, 1, 2956))) != null && jSONArrayOptJSONArray.length() != 0) {
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(strM36);
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray(C0072.m285(f50short, 2091, 1, 2499));
            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject.optJSONArray(C0126.m503(f50short, 2092, 1, 982));
            ArrayList arrayList4 = new ArrayList();
            int i2 = 0;
            while (i2 < jSONArrayOptJSONArray.length() && i2 < 80) {
                String strJ = J(jSONArrayOptJSONArray.optString(i2, ""));
                if (TextUtils.isEmpty(strJ)) {
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                } else {
                    String strOptString2 = jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.optString(i2, "") : "";
                    if (TextUtils.isEmpty(strOptString2)) {
                        strOptString2 = C0081.m322(f50short, 2093, 3, 3057) + (i2 + 1);
                    }
                    String strOptString3 = jSONArrayOptJSONArray3 != null ? jSONArrayOptJSONArray3.optString(i2, "") : "";
                    String strOptString4 = jSONArrayOptJSONArray4 != null ? jSONArrayOptJSONArray4.optString(i2, "") : "";
                    StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strOptString2);
                    sbO.append(TextUtils.isEmpty(strOptString3) ? "" : com.github.catvod.spider.merge.D.b.j(C0019.m75(f50short, 2096, 2, 2660), strOptString3, C0014.m54(f50short, 2098, 1, 2459)));
                    sbO.append(TextUtils.isEmpty(strOptString4) ? "" : com.github.catvod.spider.merge.D.b.B(C0117.m467(f50short, 2099, 1, 429), strOptString4));
                    arrayList4.add(new T0(O(sbO.toString()), p(strJ, strOptString2)));
                }
                i2++;
                jSONArrayOptJSONArray4 = jSONArrayOptJSONArray4;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
            }
            S0 s0G = AbstractC0302v0.G(strC, arrayList4);
            j(arrayList, arrayList2, s0G.b, s0G.c);
        }
        if (arrayList.isEmpty()) {
            kVarA.s(C0104.m414(f50short, 2103, 7, 1856));
        } else {
            String strM416 = C0105.m416(f50short, 2100, 3, 869);
            kVarA.q(TextUtils.join(strM416, arrayList));
            kVarA.r(TextUtils.join(strM416, arrayList2));
            AbstractC0280n1.p(kVarA.c());
            AbstractC0280n1.q(kVarA.e());
        }
        return kVarA;
    }

    public final void s(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = str6;
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = this.u;
        if (str11 == null) {
            str11 = "";
        }
        if (str10 == null) {
            str10 = "";
        }
        if (str9 == null) {
            str9 = "";
        }
        if (str8 == null) {
            str8 = "";
        }
        if (str7 == null) {
            str7 = "";
        }
        map.put(str, new String[]{str11, str10, str9, str8, str7});
    }

    public String searchContent(String str, boolean z2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0139.m554(f50short, 2110, 13, 1700));
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

    public final void v(String str) {
        String strR = R(str);
        if (TextUtils.isEmpty(strR)) {
            return;
        }
        P(strR, true);
        String strQ = Q(strR);
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (C) {
            HashMap map = D;
            Long l = (Long) map.get(strQ);
            if (l == null || jCurrentTimeMillis - l.longValue() >= 3000000) {
                try {
                    N nY = X1.y(strR + C0073.m288(f50short, 2123, 1, 385), null, B(strR + C0063.m249(f50short, 2124, 1, 1761)), B);
                    h(nY);
                    String strA = nY.a();
                    if (TextUtils.isEmpty(strA)) {
                        return;
                    }
                    if (G(strA) && !S(strR)) {
                    } else {
                        map.put(strQ, Long.valueOf(System.currentTimeMillis()));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final ArrayList x(String str, String str2) {
        int iMax;
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str3 : C0120.m477(f50short, 2125, 2, 925).equals(str) ? y : C0010.m36(f50short, 2127, 2, 2840).equals(str) ? z : x) {
            try {
                ArrayList<k> arrayList2 = new ArrayList();
                n(URLEncoder.encode(str3, C0135.m539(f50short, 2129, 5, 1311)), str, arrayList2);
                for (k kVar : arrayList2) {
                    if (kVar != null && linkedHashSet.add(kVar.b())) {
                        arrayList.add(kVar);
                    }
                }
            } catch (Exception unused) {
            }
        }
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused2) {
            iMax = 1;
        }
        int i = (iMax - 1) * 60;
        return i >= arrayList.size() ? new ArrayList() : new ArrayList(arrayList.subList(i, Math.min(i + 60, arrayList.size())));
    }

    public final String y(String str, HashMap map) {
        if (!str.startsWith(C0105.m416(f50short, 2134, 4, 1483))) {
            return "";
        }
        try {
            v(str);
            Q q = B;
            String strW = X1.W(str, map, q);
            if (!G(strW) && !H(strW)) {
                return strW;
            }
            String strQ = Q(str);
            synchronized (C) {
                D.remove(strQ);
            }
            M(str);
            return X1.W(str, map, q);
        } catch (Exception unused) {
            return "";
        }
    }
}

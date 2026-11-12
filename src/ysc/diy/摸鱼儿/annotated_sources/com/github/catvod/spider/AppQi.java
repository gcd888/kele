package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0294s1;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
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
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
public class AppQi extends Spider {
    public String a;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f10short = {2963, 3018, 2972, 2961, 2968, 2957, 2999, 2945, 2956, 3018, 3026, 3032, 3012, 3018, 2947, 2957, 2961, 2975, 2951, 2970, 2956, 2971, 3018, 3026, 3018, 2550, 2552, 2550, 2468, 2485, 2483, 2481, 2550, 2542, 2533, 2473, 2357, 2339, 2343, 2356, 2341, 2350, 2314, 2351, 2357, 2354, 536, 582, 606, 605, 606, 598, 583, 583, 598, 583, 606, 537, 606, 601, 595, 594, 591, 536, 1892, 1906, 1910, 1893, 1908, 1919, 1864, 1915, 1918, 1892, 1891, 1074, 1077, 1074, 1071, 1037, 1130, 1129, 1131, 3066, 2980, 3004, 3007, 3004, 2996, 2981, 2981, 2996, 2981, 3004, 3067, 3004, 3003, 2993, 2992, 2989, 3066, 2615, 2609, 1922, 1935, 1926, 1939, 1961, 1946, 1951, 1925, 1922, 1362, 1373, 1360, 1346, 1346, 1873, 1876, 1870, 1865, 2649, 2644, 2653, 2632, 2674, 2628, 2633, 1880, 1877, 1884, 1865, 1907, 1858, 1869, 1857, 1865, 18657, 29633, 29688, 22622, 24247, 24009, -27430, 1753, 1750, 1747, 1739, 1754, 1741, 1760, 1739, 1734, 1743, 1754, 1760, 1747, 1750, 1740, 1739, 3242, 3237, 3241, 3233, 1585, 1581, 1584, 1590, 3144, 3163, 3148, 3144, 1411, 1422, 1409, 1416, 796, 768, 772, 791, 554, 599, 1914, 1889, 724, 730, 710, 2770, 2757, 2760, 2769, 2753, 1262, 1273, 1279, 1267, 1265, 1265, 1273, 1266, 1272, 1219, 1264, 1269, 1263, 1256, 2796, 2805, 2814, 2757, 2803, 2814, 1893, 1916, 1911, 1868, 1917, 1906, 1918, 1910, 594, 587, 576, 635, 596, 589, 583, 585, 592, 603, 608, 589, 602, 594, 606, 589, 596, 588, 2638, 2625, 2628, 2652, 2637, 2650, 2651, 1652, 1620, 1162, 1196, 1210, 1197, 1266, 1182, 1208, 1210, 1201, 1195, 1644, 1614, 1627, 1608, 1613, 1613, 1600, 1550, 1556, 1551, 1553, 1537, 1545, 1654, 1608, 1615, 1605, 1614, 1622, 1618, 1537, 1647, 1653, 1537, 1552, 1553, 1551, 1553, 1562, 1537, 1654, 1608, 1615, 1559, 1557, 1562, 1537, 1625, 1559, 1557, 1544, 1537, 1632, 1617, 1617, 1613, 1604, 1654, 1604, 1603, 1642, 1608, 1621, 1550, 1556, 1554, 1558, 1551, 1554, 1559, 1537, 1545, 1642, 1641, 1653, 1644, 1645, 1549, 1537, 1613, 1608, 1610, 1604, 1537, 1638, 1604, 1602, 1610, 1614, 1544, 1537, 1634, 1609, 1619, 1614, 1612, 1604, 1550, 1552, 1552, 1558, 1551, 1553, 1551, 1553, 1551, 1553, 1537, 1650, 1600, 1607, 1600, 1619, 1608, 1550, 1556, 1554, 1558, 1551, 1554, 1559, 298, 284, 256, 256, 260, 263, 331, 334, 347, 347, 346, 350, 945, 997, 1003, 1015, 947, 1249, 1195, 1196, 1202, 1251, 2312, 2319, 2321, 2201, 2278, 2297, 2201, 2287, 2183, 2210, 2228, 2201, 2278, 2286, 2177, 2228, 2178, 2222, 2224, 2192, 2207, 2209, 2193, 2211, 2198, 2204, 2230, 2214, 2239, 2195, 2208, 2180, 2236, 2279, 2194, 2221, 2196, 2224, 2238, 2225, 2202, 2177, 2191, 2287, 2190, 2215, 2211, 2180, 2178, 2200, 2198, 2210, 2194, 2230, 2276, 2203, 2272, 2238, 2275, 2224, 2177, 2202, 2180, 2206, 2201, 2226, 2183, 2221, 2229, 2210, 2204, 2208, 2206, 2201, 2176, 2179, 2215, 2214, 2190, 2234, 2228, 2225, 2234, 2212, 2287, 2204, 2222, 2273, 2192, 2180, 2213, 2198, 2282, 2282, 769, 773, 775, 834, 796, 858, 791, 851, 834, 863, 795, 851, 834, 836, 857, 774, 769, 773, 1035, 1038, 1051, 1038, 2378, 2390, 2383, 2382, 2091, 2166, 2161, 2159, 2110, 2090, 2091, 2093, 2089, 2108, 2090, 2091, 2108, 2110, 2085, 2167, 2156, 2152, 2150, 2157, 2090, 2091, 2085, 2167, 2156, 2152, 2150, 2157, 2090, 2753, 2752, 2770, 2745, 2732, 587, 602, 602, 582, 579, 585, 587, 606, 579, 581, 580, 517, 594, 519, 605, 605, 605, 519, 588, 581, 600, 583, 519, 607, 600, 582, 591, 580, 585, 581, 590, 591, 590, 1535, 1408, 1439, 1510, 1526, 1498, 1495, 1526, 1497, 1527, 1483, 1488, 1524, 1408, 1496, 1412, 1493, 1410, 1533, 1512, 1515, 1512, 1409, 1505, 1525, 1511, 1507, 1533, 1478, 1490, 1410, 1534, 1515, 1474, 1508, 1474, 1503, 1512, 1495, 1488, 1526, 1528, 1413, 1528, 1501, 1495, 1410, 1522, 1529, 1508, 1416, 1410, 1415, 1503, 1490, 1496, 1534, 1495, 1481, 1499, 1491, 1534, 1502, 1475, 1529, 1520, 1520, 1531, 1416, 1438, 1522, 1478, 1528, 1475, 1412, 1530, 1481, 1535, 1491, 1503, 1522, 1525, 1411, 1512, 1495, 1499, 1507, 1415, 1520, 1420, 1420, 920, 966, 990, 989, 990, 982, 967, 967, 982, 967, 990, 921, 990, 985, 979, 978, 975, 920, 961, 984, 979, 999, 982, 965, 964, 978, 1535, 1531, 1528, 1508, 1508, 1504, 1471, 1443, 1470, 1441, 1444, 1470, 1449, 2558, 2514, 2515, 2515, 2520, 2526, 2505, 2516, 2514, 2515, 2170, 2132, 2132, 2113, 2076, 2160, 2141, 2136, 2119, 2132, 3119, 3075, 3074, 3096, 3081, 3074, 3096, 3137, 3128, 3093, 3100, 3081, 442, 427, 427, 502, 430, 434, 502, 438, 436, 447, 446, 2903, 2898, 2908, 2899, 2895, 2008, 1993, 1993, 1940, 2008, 1993, 2000, 1940, 1999, 2012, 1995, 2000, 2015, 1984, 1940, 1997, 2000, 2004, 2012, 627, 610, 610, 575, 627, 610, 635, 575, 612, 631, 608, 635, 628, 619, 575, 609, 635, 629, 636, 3172, 3189, 3189, 3112, 3187, 3168, 3191, 3190, 3180, 3178, 3179, 3112, 3174, 3178, 3169, 3168, 692, 677, 677, 760, 672, 678, 688, 679, 760, 689, 688, 675, 700, 694, 688, 760, 700, 689, 2374, 2399, 2371, 2370, 1949, 1927, 1974, 1974, 1943, 1967, 1947, 2022, 1974, 1959, 1972, 1973, 1955, 1942, 1962, 1959, 1983, 2044, 2022, 466, 476, 399, 392, 406, 455, 467, 466, 468, 464, 453, 467, 466, 453, 455, 476, 398, 405, 401, 415, 404, 467, 466, 476, 398, 405, 401, 415, 404, 467, 2259, 2187, 2202, 2185, 2184, 2206, 2212, 2202, 2187, 2194, 2246, 2258, 2259, 2261, 2257, 2244, 2258, 2259, 2244, 2246, 2269, 2191, 2196, 2192, 2206, 2197, 2258, 2259, 2269, 2191, 2196, 2192, 2206, 2197, 2258, 1474, 1502, 1502, 1498, 3256, 3297, 3253, 3244, 3239, 3228, 3242, 3239, 3297, 3321, 3297, 2323, 2380, 3084, 3154, 3146, 3145, 3146, 3138, 3155, 3155, 3138, 3155, 3146, 3085, 3146, 3149, 3143, 3142, 3163, 3084, 3157, 3148, 3143, 3175, 3142, 3159, 3138, 3146, 3151, 2521, 2496, 2507, 3292, 3269, 3278, 3317, 3268, 3275, 3271, 3279, 1586, 1579, 1568, 1563, 1588, 1581, 1575, 2528, 2553, 2546, 2505, 2532, 2547, 2555, 2551, 2532, 2557, 2533, 2723, 2746, 2737, 2698, 2742, 2746, 2747, 2721, 2736, 2747, 2721, 3023, 
    3030, 3037, 3046, 3032, 3034, 3021, 3030, 3019, 808, 817, 826, 769, 826, 823, 812, 827, 829, 810, 817, 812, 1085, 1060, 1071, 1044, 1064, 1063, 1066, 1080, 1080, 2031, 2038, 2045, 1990, 2025, 2037, 2040, 2016, 1990, 2037, 2032, 2026, 2029, 1641, 1653, 1656, 1632, 1660, 1643, 1606, 1648, 1655, 1663, 1654, 2628, 2655, 2648, 2624, 2691, 2706, 2689, 2688, 2710, 3037, 3034, 3012, 3035, 2979, 2988, 2976, 2984, 1359, 1352, 1366, 2040, 2025, 2042, 2043, 2029, 2007, 2025, 2040, 2017, 2007, 2045, 2042, 2020, 732, 711, 707, 717, 710, 2176, 2183, 2186, 1697, 1687, 1675, 1675, 1679, 1676, 1728, 1733, 1744, 1744, 1745, 1749, 1671, 2149, 1152, 1236, 1221, 1238, 1239, 1217, 1275, 1221, 1236, 1229, 1177, 664, 715, 716, 722, 643, 541, 591, 596, 592, 606, 597, 518, 2652, 1616, 1616, 1616, 697, 692, 701, 680, 658, 676, 681, 2042, 2037, 2040, 2026, 2026, 1708, 1697, 1710, 1703, 1392, 1379, 1396, 1392, 703, 675, 679, 692, 516, 543, 878, 882, 879, 873, 2750, 2735, 2729, 2731, 1477, 1435, 1411, 1408, 1411, 1419, 1434, 1434, 1419, 1434, 1411, 1476, 1411, 1412, 1422, 1423, 1426, 1477, 1438, 1427, 1434, 1423, 1452, 1411, 1414, 1438, 1423, 1432, 1468, 1413, 1422, 1446, 1411, 1433, 1438, 1493, 1434, 1419, 1421, 1423, 1495, 1969, 1958, 1952, 1964, 1966, 1966, 1958, 1965, 1959, 1948, 1967, 1962, 1968, 1975, 1015, 1006, 997, 990, 1007, 992, 1004, 996, 560, 553, 546, 537, 559, 546, 2193, 2184, 2179, 2232, 2199, 2190, 2180, 1890, 1915, 1904, 1867, 1894, 1905, 1913, 1909, 1894, 1919, 1895, 521, 531, 546, 546, 515, 571, 527, 626, 546, 563, 544, 545, 567, 516, 573, 566, 542, 571, 545, 550, 616, 626, 2761, 2765, 2779, 2727, 2763, 2762, 2763, 2727, 2776, 2755, 2763, 2779, 2751, 2776, 2793, 2796, 2796, 2785, 2790, 2799, 1540, 1536, 1558, 742, 764, 717, 717, 748, 724, 736, 669, 732, 728, 718, 761, 728, 734, 719, 708, 717, 713, 647, 669, 869, 865, 887, 2909, 2905, 2895, 2867, 2911, 2910, 2911, 2867, 2892, 2903, 2911, 2895, 2857, 2892, 2909, 2904, 2904, 2901, 2898, 2907, 2963, 2967, 2964, 2952, 2952, 2956, 3027, 3023, 3026, 3021, 3016, 3026, 3013, 2602, 2572, 2586, 2573, 2642, 2622, 2584, 2586, 2577, 2571, 3319, 3317, 3296, 3313, 3315, 3323, 3302, 3309, 3287, 3323, 3322, 3296, 3313, 3322, 3296, 2269, 2268, 2253, 2264, 2256, 2261, 2298, 2262, 2263, 2253, 2268, 2263, 2253, 2871, 2843, 2842, 2816, 2833, 2842, 2816, 2905, 2848, 2829, 2820, 2833, 760, 745, 745, 757, 752, 762, 760, 749, 752, 758, 759, 694, 737, 692, 750, 750, 750, 692, 767, 758, 747, 756, 692, 748, 747, 757, 764, 759, 762, 758, 765, 764, 765, 1497, 1480, 1480, 1429, 1485, 1483, 1501, 1482, 1429, 1500, 1501, 1486, 1489, 1499, 1501, 1429, 1489, 1500, 2816, 2833, 2833, 2892, 2839, 2820, 2835, 2834, 2824, 2830, 2831, 2892, 2818, 2830, 2821, 2820, 2394, 2379, 2379, 2326, 2394, 2379, 2386, 2326, 2381, 2398, 2377, 2386, 2397, 2370, 2326, 2383, 2386, 2390, 2398, 552, 569, 569, 612, 572, 544, 612, 548, 550, 557, 556, 2488, 2493, 2483, 2492, 2464, 2206, 2273, 2302, 2183, 2199, 2235, 2230, 2199, 2232, 2198, 2218, 2225, 2197, 2273, 2233, 2277, 2228, 2275, 2204, 2185, 2186, 2185, 2272, 2176, 2196, 2182, 2178, 2204, 2215, 2227, 2275, 2207, 2186, 2211, 2181, 2211, 2238, 2185, 2230, 2225, 2199, 2201, 2276, 2201, 2236, 2230, 2275, 2195, 2200, 2181, 2281, 2275, 2278, 2238, 2227, 2233, 2207, 2230, 2216, 2234, 2226, 2207, 2239, 2210, 2200, 2193, 2193, 2202, 2281, 2303, 2195, 2215, 2201, 2210, 2277, 2203, 2216, 2206, 2226, 2238, 2195, 2196, 2274, 2185, 2230, 2234, 2178, 2278, 2193, 2285, 2285, 3114, 3131, 3131, 3111, 3106, 3112, 3114, 3135, 3106, 3108, 3109, 3172, 3105, 3128, 3108, 3109, 3184, 3179, 3112, 3107, 3114, 3129, 3128, 3118, 3135, 3190, 3134, 3135, 3117, 3174, 3187, 2892, 2889, 2908, 2889, 2040, 2018, 2003, 2003, 2034, 1994, 2046, 1923, 2003, 1996, 2000, 2007, 1923, 1989, 1986, 1994, 1999, 1990, 1991, 1923, 2040, 3084, 3179, 3185, 2130, 2133, 2135, 2143, 2169, 2133, 2132, 2126, 2143, 2132, 2126, 424, 431, 433, 1542, 1564, 1537, 1552, 3275, 3031, 3019, 3019, 3023, 1660, 1657, 1644, 1657, 1619, 1661, 1633, 3189, 3184, 3173, 3184, 3160, 3175, 2742, 2743, 2724, 2747, 2737, 2743, 2715, 2742, 1757, 1742, 1753, 1752, 1730, 1732, 1733, 2424, 2412, 2650, 2653, 2650, 2631, 2984, 3006, 3002, 2985, 3000, 2995, 1420, 1424, 1437, 1413, 1426, 1437, 1425, 1433, 2621, 2599, 2582, 2582, 2615, 2575, 2619, 2630, 2575, 2568, 2575, 2578, 2652, 2630, 884, 872, 869, 893, 865, 886, 839, 875, 874, 880, 865, 874, 880, 1044, 1026, 1030, 1045, 1028, 1039, 1060, 1032, 1033, 1043, 1026, 1033, 1043};
    public static final HashMap k = new HashMap<String, String>() { // from class: com.github.catvod.spider.AppQi.1

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f11short = {2017, 2030, 2019, 2033, 2033, 29885, 24397, 2013, 1998, 2009, 2013, 21674, 20640, 2621, 2608, 2623, 2614, -30051, -29840, 2141, 2113, 2117, 2134, 24346, 20371, 1549, 1558, 27242, 22391};

        {
            put(C0135.m539(f11short, 0, 5, 1922), C0055.m219(f11short, 5, 2, 2246));
            put(C0043.m169(f11short, 7, 4, 1980), C0087.m346(f11short, 11, 2, 922));
            put(C0143.m570(f11short, 13, 4, 2641), C0055.m219(f11short, 17, 2, 368));
            put(C0003.m10(f11short, 19, 4, 2084), C0074.m292(f11short, 23, 2, 366));
            put(C0006.m21(f11short, 25, 2, 1647), C0095.m379(f11short, 27, 2, 2552));
        }
    };
    public final ArrayList b = new ArrayList();
    public String j = "";

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return com.github.catvod.spider.merge.p001b.g.y(d(new JSONObject(e(C0011.m42(f10short, 46, 18, 567) + (TextUtils.isEmpty(this.i) ? C0142.m567(f10short, 36, 10, 2374) : this.i), com.github.catvod.spider.merge.D.b.j(C0018.m70(f10short, 0, 25, 3048), str, C0117.m467(f10short, 25, 11, 2516)))).optJSONArray(C0119.m473(f10short, 64, 11, 1815))));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0292  */
    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws JSONException {
        JSONArray jSONArray;
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject(e(C0106.m422(f10short, 83, 18, 3029) + (TextUtils.isEmpty(this.h) ? C0072.m285(f10short, 75, 8, 1115) : this.h), C0126.m503(f10short, 101, 2, 2636)));
        JSONArray jSONArray2 = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C0142.m567(f10short, 103, 9, 2038));
        String strM499 = C0125.m499(f10short, 112, 5, 1329);
        String strM459 = C0115.m459(f10short, 117, 4, 1853);
        if (jSONArrayOptJSONArray != null) {
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                String strM234 = C0059.m234(f10short, 121, 7, 2605);
                String string = jSONObject3.getString(strM234);
                String strM454 = C0114.m454(f10short, 128, 9, 1836);
                String string2 = jSONObject3.getString(strM454);
                if (C0028.m108(f10short, 137, 2, 1991).equals(string2) || C0089.m355(f10short, 139, 2, 2679).equals(string2) || C0010.m36(f10short, 141, 3, 696).equals(string2)) {
                    jSONArray = jSONArrayOptJSONArray;
                    str = strM459;
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(strM234, string);
                    jSONObject4.put(strM454, string2);
                    jSONArray2.put(jSONObject4);
                    JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray(C0106.m422(f10short, 144, 16, 1727));
                    if (jSONArrayOptJSONArray2 != null) {
                        JSONArray jSONArray3 = new JSONArray();
                        int i2 = 0;
                        while (i2 < jSONArrayOptJSONArray2.length()) {
                            JSONObject jSONObject5 = jSONArrayOptJSONArray2.getJSONObject(i2);
                            String strM249 = C0063.m249(f10short, 160, 4, 3268);
                            String strOptString = jSONObject5.optString(strM249);
                            JSONArray jSONArrayOptJSONArray3 = jSONObject5.optJSONArray(strM459);
                            if (jSONArrayOptJSONArray3 != null) {
                                boolean zEquals = strM499.equals(strOptString);
                                String strM4910 = C0125.m499(f10short, 164, 4, 1602);
                                if (zEquals || C0030.m116(f10short, 168, 4, 3113).equals(strOptString) || C0140.m558(f10short, 172, 4, 1519).equals(strOptString) || C0096.m382(f10short, 176, 4, 869).equals(strOptString) || strM4910.equals(strOptString)) {
                                    JSONArray jSONArray4 = new JSONArray();
                                    int i3 = 0;
                                    while (i3 < jSONArrayOptJSONArray3.length()) {
                                        String strOptString2 = jSONArrayOptJSONArray3.optString(i3);
                                        jSONArray4.put(new JSONObject().put(C0059.m234(f10short, 180, 1, 580), strOptString2).put(C0074.m292(f10short, 181, 1, 545), strOptString2));
                                        i3++;
                                        jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                                        strM459 = strM459;
                                    }
                                    str2 = strM459;
                                    String strM223 = strM4910.equals(strOptString) ? C0056.m223(f10short, 182, 2, 1816) : strOptString;
                                    HashMap map = k;
                                    if (map.containsKey(strM223)) {
                                        strOptString = (String) map.get(strM223);
                                    }
                                    JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v(C0046.m182(f10short, 184, 3, 703), strM223, strM249, strOptString);
                                    jSONObjectV.put(C0112.m445(f10short, 187, 5, 2724), jSONArray4);
                                    jSONArray3.put(jSONObjectV);
                                } else {
                                    str2 = strM459;
                                }
                            } else {
                                str2 = strM459;
                            }
                            i2++;
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                            jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                            strM459 = str2;
                        }
                        jSONArray = jSONArrayOptJSONArray;
                        str = strM459;
                        if (jSONArray3.length() > 0) {
                            jSONObject2.put(string, jSONArray3);
                        }
                    } else {
                        jSONArray = jSONArrayOptJSONArray;
                        str = strM459;
                    }
                }
                i++;
                jSONArrayOptJSONArray = jSONArray;
                strM459 = str;
            }
        }
        String str3 = strM459;
        JSONArray jSONArray5 = new JSONArray();
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray(C0107.m427(f10short, 192, 14, 1180));
        if (jSONArrayOptJSONArray4 != null) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                JSONObject jSONObject6 = jSONArrayOptJSONArray4.getJSONObject(i4);
                JSONObject jSONObject7 = new JSONObject();
                String strM105 = C0027.m105(f10short, 206, 6, 2714);
                jSONObject7.put(strM105, jSONObject6.optString(strM105));
                String strM379 = C0095.m379(f10short, 212, 8, 1811);
                jSONObject7.put(strM379, jSONObject6.optString(strM379));
                String strM325 = C0082.m325(f10short, 220, 7, 548);
                jSONObject7.put(strM325, jSONObject6.optString(strM325));
                String strM210 = C0053.m210(f10short, 227, 11, 575);
                jSONObject7.put(strM210, jSONObject6.optString(strM210));
                jSONArray5.put(jSONObject7);
            }
        }
        JSONObject jSONObject8 = new JSONObject();
        jSONObject8.put(strM499, jSONArray2);
        jSONObject8.put(C0082.m325(f10short, 238, 7, 2600), jSONObject2);
        jSONObject8.put(str3, jSONArray5);
        return jSONObject8.toString();
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strOptString;
        String[] strArrSplit = str2.split(C0091.m360(f10short, 245, 2, 1576));
        String string = strArrSplit[0];
        int i = 1;
        if (strArrSplit.length > 1) {
            String str3 = strArrSplit[1];
        }
        if (strArrSplit.length > 2) {
            String str4 = strArrSplit[2];
        }
        HashMap mapC = c();
        String strM234 = C0059.m234(f10short, 247, 10, 1247);
        mapC.put(strM234, C0010.m36(f10short, 257, 111, 1569));
        boolean zMatches = string.matches(C0120.m477(f10short, 368, 12, 372));
        String strM408 = C0103.m408(f10short, 380, 5, 910);
        String strM33 = C0009.m33(f10short, 385, 5, 1246);
        String strM511 = C0128.m511(f10short, 390, 3, 2429);
        String strM529 = C0133.m529(f10short, 393, 91, 2263);
        if (zMatches && (string.contains(strM33) || string.contains(strM408))) {
            string = new JSONObject(X1.X(FishCrypto.w(strM529, string), null, c())).optString(strM511);
        } else if (!string.matches(C0032.m126(f10short, 484, 18, 815))) {
            boolean zContains = string.contains(strM33);
            String strM249 = C0063.m249(f10short, 502, 4, 1135);
            if (zContains || string.contains(strM408) || string.contains(C0030.m116(f10short, 506, 4, 2338))) {
                Matcher matcher = Pattern.compile(C0137.m545(f10short, 850, 30, 506)).matcher(string);
                StringBuffer stringBuffer = new StringBuffer();
                while (matcher.find()) {
                    try {
                        matcher.appendReplacement(stringBuffer, matcher.group(1) + a(matcher.group(2)) + matcher.group(3));
                    } catch (Exception unused) {
                    }
                }
                matcher.appendTail(stringBuffer);
                string = stringBuffer.toString();
                Matcher matcher2 = Pattern.compile(C0116.m463(f10short, 880, 35, 2299)).matcher(string);
                if (matcher2.find()) {
                    strOptString = new JSONObject(X1.X(FishCrypto.w(strM529, matcher2.group(2)), null, null)).optJSONObject(strM249).optString(strM511);
                    string = strOptString;
                } else {
                    string = "";
                }
            } else {
                Matcher matcher3 = Pattern.compile(C0095.m379(f10short, 510, 29, 2051)).matcher(string);
                StringBuffer stringBuffer2 = new StringBuffer();
                while (matcher3.find()) {
                    try {
                        matcher3.appendReplacement(stringBuffer2, matcher3.group(i) + URLEncoder.encode(matcher3.group(2), C0017.m65(f10short, 539, 5, 2708)) + matcher3.group(3));
                        i = 1;
                    } catch (Exception unused2) {
                    }
                }
                matcher3.appendTail(stringBuffer2);
                string = stringBuffer2.toString();
                String strM10 = C0003.m10(f10short, 544, 33, 554);
                try {
                    String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
                    Request.Builder builderAddHeader = new Request.Builder().url(this.a + FishCrypto.v(C0103.m408(f10short, 577, 91, 1457)) + C0104.m414(f10short, 668, 26, 951)).post(RequestBody.create(MediaType.parse(strM10), string)).addHeader(strM234, TextUtils.isEmpty(this.g) ? C0107.m427(f10short, 694, 13, 1424) : this.g).addHeader(C0112.m445(f10short, 707, 10, 2493), C0027.m105(f10short, 717, 10, 2097)).addHeader(C0091.m360(f10short, 727, 12, 3180), strM10).addHeader(C0095.m379(f10short, 739, 11, 475), C0047.m186(f10short, 750, 5, 2875)).addHeader(C0019.m75(f10short, 755, 19, 1977), strValueOf).addHeader(C0087.m346(f10short, 774, 19, 530), Base64.encodeToString(b(strValueOf), 2));
                    if (!TextUtils.isEmpty(this.f)) {
                        builderAddHeader.addHeader(C0045.m177(f10short, 793, 16, 3077), this.f);
                    }
                    if (!TextUtils.isEmpty(this.e)) {
                        builderAddHeader.addHeader(C0104.m414(f10short, 809, 18, 725), this.e);
                    }
                    strOptString = new JSONObject(new JSONObject(a(new JSONObject(X1.I(builderAddHeader.build()).body().string()).getString(strM249))).getString(C0143.m570(f10short, 827, 4, 2348))).getString(strM511);
                    string = strOptString;
                } catch (Exception e) {
                    com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0006.m21(f10short, 831, 19, 1990)));
                    string = "";
                }
            }
        }
        if (TextUtils.isEmpty(string) || !string.startsWith(C0014.m54(f10short, 915, 4, 1450))) {
            return "";
        }
        String strI = AbstractC0280n1.i(str, str2, null, null);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(FishCrypto.w(strM529, string));
        gVar.h(mapC);
        gVar.b(strI);
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strM;
        String str = list.get(0);
        JSONObject jSONObject = new JSONObject(e(C0143.m570(f10short, 932, 27, 3107), C0073.m288(f10short, 919, 11, 3267) + str + C0125.m499(f10short, 930, 2, 2353)));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C0117.m467(f10short, 959, 3, 2479));
        k kVarA = AbstractC0449a.a(str);
        String strM365 = C0092.m365(f10short, 962, 8, 3242);
        kVarA.o(jSONObjectOptJSONObject.optString(strM365));
        kVarA.p(jSONObjectOptJSONObject.optString(C0087.m346(f10short, 970, 7, 1604)));
        kVarA.s(jSONObjectOptJSONObject.optString(C0092.m365(f10short, 977, 11, 2454)));
        kVarA.l(jSONObjectOptJSONObject.optString(C0139.m554(f10short, 988, 11, 2773)));
        kVarA.j(jSONObjectOptJSONObject.optString(C0105.m416(f10short, 999, 9, 3001)));
        kVarA.m(jSONObjectOptJSONObject.optString(C0072.m285(f10short, 1008, 12, 862)));
        kVarA.i(jSONObjectOptJSONObject.optString(C0107.m427(f10short, 1020, 9, 1099)));
        String strOptString = jSONObjectOptJSONObject.optString(strM365);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C0049.m193(f10short, 1029, 13, 1945));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(C0009.m33(f10short, 1042, 11, 1561));
            String strOptString2 = jSONObjectOptJSONObject3.optString(C0003.m10(f10short, 1053, 4, 2615));
            String strOptString3 = jSONObjectOptJSONObject3.optString(C0097.m386(f10short, 1057, 5, 2803));
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray(C0027.m105(f10short, 1062, 4, 2984));
            ArrayList arrayList3 = new ArrayList();
            int i2 = 0;
            while (i2 < jSONArrayOptJSONArray2.length()) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i2);
                String strOptString4 = jSONObjectOptJSONObject4.optString(C0118.m471(f10short, 1066, 4, 3021));
                String strOptString5 = jSONObjectOptJSONObject4.optString(C0135.m539(f10short, 1070, 3, 1338));
                String strOptString6 = jSONObjectOptJSONObject4.optString(C0014.m54(f10short, 1073, 13, 1928));
                JSONArray jSONArray = jSONArrayOptJSONArray;
                String strOptString7 = jSONObjectOptJSONObject4.optString(C0014.m54(f10short, 1086, 5, 680));
                JSONArray jSONArray2 = jSONArrayOptJSONArray2;
                String strOptString8 = jSONObjectOptJSONObject4.optString(C0089.m355(f10short, 1091, 3, 2286));
                boolean zMatches = strOptString6.matches(C0014.m54(f10short, 1094, 12, 1791));
                k kVar = kVarA;
                String strM379 = C0095.m379(f10short, 1106, 1, 1787);
                if (zMatches) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strOptString4);
                    sb.append(C0105.m416(f10short, 1107, 1, 2113));
                    sb.append(strOptString6);
                    sb.append(strM379);
                    sb.append(strOptString);
                    strM = com.github.catvod.spider.merge.D.b.m(sb, strM379, strOptString8);
                } else {
                    String strEncodeToString = Base64.encodeToString(b(strOptString5), 2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strOptString4);
                    sb2.append(C0097.m386(f10short, 1108, 11, 1188));
                    sb2.append(strOptString3);
                    sb2.append(C0009.m33(f10short, 1119, 5, 702));
                    sb2.append(strEncodeToString);
                    com.github.catvod.spider.merge.D.b.A(sb2, C0095.m379(f10short, 1124, 7, 571), strOptString7, strM379, strOptString);
                    strM = com.github.catvod.spider.merge.D.b.m(sb2, strM379, strOptString8);
                }
                arrayList3.add(strM);
                i2++;
                jSONArrayOptJSONArray = jSONArray;
                jSONArrayOptJSONArray2 = jSONArray2;
                kVarA = kVar;
            }
            arrayList.add(strOptString2);
            arrayList2.add(TextUtils.join(C0014.m54(f10short, 1131, 1, 2687), arrayList3));
        }
        k kVar2 = kVarA;
        C0294s1.e(arrayList, arrayList2);
        C0294s1.c(this.j, arrayList);
        String strM249 = C0063.m249(f10short, 1132, 3, 1652);
        String strJoin = TextUtils.join(strM249, arrayList2);
        kVar2.q(TextUtils.join(strM249, arrayList));
        kVar2.r(strJoin);
        AbstractC0280n1.p(strOptString);
        AbstractC0280n1.q(strJoin);
        boolean z = FishCrypto.a;
        N1.d(kVar2);
        return com.github.catvod.spider.merge.p001b.g.s(kVar2);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0104.m414(f10short, 1135, 7, 717), str);
        if (map != null) {
            String strM105 = C0027.m105(f10short, 1142, 5, 1945);
            if (map.containsKey(strM105) && !map.get(strM105).isEmpty()) {
                jSONObject.put(strM105, map.get(strM105));
            }
            String strM42 = C0011.m42(f10short, 1147, 4, 1728);
            if (map.containsKey(strM42) && !map.get(strM42).isEmpty()) {
                jSONObject.put(strM42, map.get(strM42));
            }
            String strM177 = C0045.m177(f10short, 1151, 4, 1297);
            if (map.containsKey(strM177) && !map.get(strM177).isEmpty()) {
                jSONObject.put(strM177, map.get(strM177));
            }
            String strM499 = C0125.m499(f10short, 1155, 4, 710);
            if (map.containsKey(strM499) && !map.get(strM499).isEmpty()) {
                jSONObject.put(strM499, map.get(strM499));
            }
            String strM199 = C0050.m199(f10short, 1159, 2, 614);
            if (map.containsKey(strM199) && !map.get(strM199).isEmpty()) {
                jSONObject.put(C0009.m33(f10short, 1161, 4, 797), map.get(strM199));
            }
        }
        jSONObject.put(C0027.m105(f10short, 1165, 4, 2766), str2);
        return com.github.catvod.spider.merge.p001b.g.y(d(new JSONObject(e(C0073.m288(f10short, 1169, 41, 1514) + str2, jSONObject.toString())).optJSONArray(C0050.m199(f10short, 1210, 14, 1987))));
    }

    public static ArrayList d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.optString(C0063.m249(f10short, 1224, 8, 897));
                k kVar = new k();
                kVar.n(jSONObject.optString(C0125.m499(f10short, 1232, 6, 582)));
                kVar.o(strOptString);
                kVar.p(jSONObject.optString(C0139.m554(f10short, 1238, 7, 2279)));
                kVar.s(jSONObject.optString(C0126.m503(f10short, 1245, 11, 1812)));
                arrayList.add(kVar);
            } catch (Exception e) {
                com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0082.m325(f10short, 1256, 22, 594)));
            }
        }
        return arrayList;
    }

    public final String a(String str) {
        try {
            Cipher cipher = Cipher.getInstance(C0126.m503(f10short, 1278, 20, 2696));
            cipher.init(2, new SecretKeySpec(this.c.getBytes(), C0114.m454(f10short, 1298, 3, 1605)), new IvParameterSpec(this.d.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)));
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0050.m199(f10short, 1301, 20, 701)));
            return "";
        }
    }

    public final byte[] b(String str) {
        try {
            String str2 = this.d;
            Charset charset = StandardCharsets.UTF_8;
            IvParameterSpec ivParameterSpec = new IvParameterSpec(str2.getBytes(charset));
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.c.getBytes(charset), C0125.m499(f10short, 1321, 3, 804));
            Cipher cipher = Cipher.getInstance(C0139.m554(f10short, 1324, 20, 2844));
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(str.getBytes());
        } catch (Exception unused) {
            return "".getBytes();
        }
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        map.put(C0137.m545(f10short, 1357, 10, 2687), TextUtils.isEmpty(this.g) ? C0118.m471(f10short, 1344, 13, 3068) : this.g);
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0095.m379(f10short, 1367, 15, 3220));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0122.m486(f10short, 1382, 13, 2233));
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

    public final String e(String str, String str2) {
        ArrayList arrayList = this.b;
        boolean zIsEmpty = arrayList.isEmpty();
        List listSingletonList = arrayList;
        if (zIsEmpty) {
            listSingletonList = Collections.singletonList(this.a);
        }
        Iterator it = listSingletonList.iterator();
        while (true) {
            if (!it.hasNext()) {
                return "";
            }
            String str3 = (String) it.next();
            try {
                String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
                HashMap mapC = c();
                mapC.put(C0059.m234(f10short, 1395, 12, 2932), C0135.m539(f10short, 1407, 33, 665));
                String strM554 = C0139.m554(f10short, 1440, 18, 1464);
                String str4 = this.e;
                if (str4 == null) {
                    str4 = "";
                }
                mapC.put(strM554, str4);
                String strM210 = C0053.m210(f10short, 1458, 16, 2913);
                String str5 = this.f;
                mapC.put(strM210, str5 != null ? str5 : "");
                mapC.put(C0043.m169(f10short, 1474, 19, 2363), strValueOf);
                mapC.put(C0087.m346(f10short, 1493, 11, 585), C0055.m219(f10short, 1504, 5, 2516));
                Request.Builder builderPost = new Request.Builder().url(str3 + FishCrypto.v(C0125.m499(f10short, 1509, 91, 2256)) + str).post(RequestBody.create(MediaType.parse(C0076.m301(f10short, 1600, 31, 3147)), str2));
                for (Map.Entry entry : mapC.entrySet()) {
                    builderPost.addHeader((String) entry.getKey(), (String) entry.getValue());
                }
                String strA = a(new JSONObject(X1.I(builderPost.build()).body().string()).getString(C0118.m471(f10short, 1631, 4, 2856)));
                this.a = str3;
                return strA;
            } catch (Exception e) {
                com.github.catvod.spider.merge.D.b.D(e, com.github.catvod.spider.merge.D.b.q(C0125.m499(f10short, 1635, 21, 1955), str3, C0122.m486(f10short, 1656, 3, 3153)));
            }
        }
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0001.m1(f10short, 1659, 11, 2106));
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
        super.init(context, str);
        try {
            JSONObject jSONObject = new JSONObject(FishCrypto.g(str));
            String strOptString = jSONObject.optString(C0019.m75(f10short, 1670, 3, 477), "");
            this.a = strOptString;
            if (TextUtils.isEmpty(strOptString)) {
                String strOptString2 = jSONObject.optString(C0017.m65(f10short, 1673, 4, 1653), "");
                boolean zIsEmpty = TextUtils.isEmpty(strOptString2);
                ArrayList arrayList = this.b;
                if (!zIsEmpty) {
                    String strX = X1.X(strOptString2, null, new HashMap());
                    if (!TextUtils.isEmpty(strX)) {
                        for (String str2 : strX.split(C0101.m402(f10short, 1677, 1, 3265))) {
                            String strTrim = str2.trim();
                            if (strTrim.startsWith(C0118.m471(f10short, 1678, 4, 3007))) {
                                arrayList.add(strTrim);
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.a = (String) arrayList.get(0);
                }
            }
            this.c = jSONObject.optString(C0043.m169(f10short, 1682, 7, 1560));
            this.d = jSONObject.optString(C0096.m382(f10short, 1689, 6, 3089));
            this.e = jSONObject.optString(C0115.m459(f10short, 1695, 8, 2770));
            this.f = jSONObject.optString(C0050.m199(f10short, 1703, 7, 1707));
            this.g = jSONObject.optString(C0096.m382(f10short, 1710, 2, 2317));
            this.h = jSONObject.optString(C0140.m558(f10short, 1712, 4, 2611));
            this.i = jSONObject.optString(C0126.m503(f10short, 1716, 6, 3035));
            this.j = jSONObject.optString(C0050.m199(f10short, 1722, 8, 1532), "");
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0092.m365(f10short, 1730, 14, 2662)));
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0098.m390(f10short, 1744, 13, 772));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0079.m314(f10short, 1757, 13, 1127));
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

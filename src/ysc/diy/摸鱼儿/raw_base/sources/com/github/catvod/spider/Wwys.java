package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
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
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.T.C0046;
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
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
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
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0120;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Wwys extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f107short = {2183, 2241, 2246, 2252, 2253, 2256, 2182, 2264, 2240, 2264, 2199, 2245, 2197, 2270, 2247, 2252, 2181, 2267, 2253, 2249, 2266, 2251, 2240, 2190, 2271, 2252, 2197, 1864, 1865, 1883, 1840, 1829, 2229, 2274, 2297, 2278, 2296, 2295, 2272, 2230, 2216, 2230, 2275, 2298, 2220, 2296, 2274, 2302, 2235, 2293, 2302, 2303, 2298, 2290, 2238, 2215, 2239, 2230, 2298, 2303, 2230, 2295, 2234, 2230, 2229, 2274, 2297, 2278, 2296, 2295, 2272, 2230, 2298, 2303, 2230, 2295, 1199, 1205, 1186, 1185, 2952, 2249, 2237, 2181, 2250, 2248, 3098, 32347, 21535, 2358, 32744, -31973, 22714, 1468, 31591, -30751, 2920, 23411, 26352, 2327, 2305, 2311, 2320, 2317, 2315, 2314, 2378, 2313, 2315, 2304, 2398, 2314, 2320, 2316, 2377, 2311, 2316, 2317, 2312, 2304, 2380, 2391, 2381, 2372, 2394, 2372, 2304, 2317, 2322, 2398, 2314, 2320, 2316, 2377, 2311, 2316, 2317, 2312, 2304, 2380, 2390, 2381, 2372, 2321, 2312, 2378, 2326, 2305, 2327, 2317, 2334, 2305, 2363, 2312, 2317, 2327, 2320, 1668, 1665, 306, 363, 376, 363, 371, 274, 306, 363, 290, 300, 304, 363, 371, 363, 298, 296, 317, 300, 256, 301, 363, 357, 363, 295, 296, 292, 300, 363, 371, 363, 32050, 22210, 363, 357, 363, 319, 296, 293, 316, 300, 363, 371, 274, 306, 363, 295, 363, 371, 363, 20513, -28255, 363, 357, 363, 319, 363, 371, 363, 376, 363, 308, 357, 306, 363, 295, 363, 371, 363, 21473, 19989, 29454, 363, 357, 363, 319, 363, 371, 363, 380, 363, 308, 357, 306, 363, 295, 363, 371, 363, 21717, 21294, 29454, 363, 357, 363, 319, 363, 371, 363, 383, 363, 308, 357, 306, 363, 295, 363, 371, 363, 29560, 24972, 29454, 363, 357, 363, 319, 363, 371, 363, 382, 363, 308, 357, 306, 363, 295, 363, 371, 363, 30872, 24370, 29454, 363, 357, 363, 319, 363, 371, 363, 369, 363, 308, 357, 306, 363, 295, 363, 371, 363, 24857, 24927, 29454, 363, 357, 363, 319, 363, 371, 363, 368, 363, 308, 357, 306, 363, 295, 363, 371, 363, 21294, 24972, 29454, 363, 357, 363, 319, 363, 371, 363, 376, 377, 363, 308, 357, 306, 363, 295, 363, 371, 363, 25425, 20416, 29454, 363, 357, 363, 319, 363, 371, 363, 376, 376, 363, 308, 357, 306, 363, 295, 363, 371, 363, 24963, 25043, 29454, 363, 357, 363, 319, 363, 371, 363, 376, 383, 363, 308, 357, 306, 363, 295, 363, 371, 363, 22542, 24370, 29454, 363, 357, 363, 319, 363, 371, 363, 376, 382, 363, 308, 276, 308, 276, 357, 363, 379, 363, 371, 274, 306, 363, 290, 300, 304, 363, 371, 363, 298, 296, 317, 300, 256, 301, 363, 357, 363, 295, 296, 292, 300, 363, 371, 363, 32050, 22210, 363, 357, 363, 319, 296, 293, 316, 300, 363, 371, 274, 306, 363, 295, 363, 371, 363, 20513, -28255, 363, 357, 363, 319, 363, 371, 363, 379, 363, 308, 357, 306, 363, 295, 363, 371, 363, 22452, 20462, 21294, 363, 357, 363, 319, 363, 371, 363, 376, 379, 363, 308, 357, 306, 363, 295, 363, 371, 363, 28518, 21177, 21294, 363, 357, 363, 319, 363, 371, 363, 376, 378, 363, 308, 357, 306, 363, 295, 363, 371, 363, 25772, -26976, 21294, 363, 357, 363, 319, 363, 371, 363, 376, 381, 363, 308, 357, 306, 363, 295, 363, 371, 363, 27246, 32455, 21294, 363, 357, 363, 319, 363, 371, 363, 376, 380, 363, 308, 276, 308, 276, 308, 833, 798, 770, 783, 791, 779, 796, 833, 793, 793, 777, 788, 832, 772, 797, 1358, 1369, 1372, 1301, 1300, 1285, 1338, 1301, 1356, 1371, 1338, 1301, 1356, 1359, 1369, 1341, 1348, 1345, 1339, 1358, 1341, 1336, 1348, 1345, 1339, 1357, 1359, 1341, 1348, 1345, 1339, 1338, 1301, 1356, 1338, 1357, 1338, 1301, 1356, 1296, 1295, 1282, 1283, 1289, 1331, 1300, 1290, 1147, 1146, 1131, 1108, 1147, 1058, 1077, 1108, 1147, 1058, 1107, 1066, 1071, 1109, 1056, 1107, 1110, 1066, 1071, 1109, 1059, 1057, 1726, 1727, 1710, 1681, 1726, 1767, 1776, 1681, 1726, 1767, 1770, 1765, 1686, 1683, 1770, 1680, 1766, 1764, 1770, 1681, 1726, 1767, 1681, 1766, 1681, 1726, 1767, 1723, 1700, 1705, 1704, 1698, 1688, 1727, 1697, 2696, 2703, 2705, 2759, 2721, 2702, 2775, 2778, 2773, 2726, 2723, 2778, 2720, 2775, 2772, 2778, 2278, 2233, 2213, 2216, 2224, 2220, 2235, 2278, 2213, 2227, 2212, 2298, 2236, 2289, 2279, 2211, 2234, 899, 980, 979, 973, 899, 1021, 978, 907, 923, 1021, 978, 907, 899, 905, 1018, 1023, 899, 1020, 906, 904, 899, 1735, 1755, 1755, 1759, 1342, 1345, 1374, 1297, 1307, 1335, 1338, 1349, 1351, 1312, 1346, 1333, 1313, 1286, 1311, 1283, 1298, 1320, 1331, 1298, 1284, 1304, 1349, 1314, 1311, 1352, 1352, 1346, 1282, 1340, 1285, 1339, 1281, 1283, 1320, 1318, 1303, 1375, 1318, 1331, 1341, 1303, 1311, 1331, 1297, 1333, 1303, 1289, 1329, 1338, 1284, 1302, 1312, 1315, 1353, 1309, 1330, 1317, 1322, 1321, 1333, 1335, 1298, 1301, 1319, 1308, 1329, 1348, 1349, 1352, 1315, 1338, 1331, 1304, 1321, 1349, 1318, 1300, 1301, 1313, 1371, 1346, 1311, 1339, 1338, 1313, 1333, 1283, 1329, 1357, 1357, 1921, 1940, 1940, 2454, 2517, 2443, 2509, 2432, 2794, 2739, 2730, 2721, 2792, 2721, 2720, 2737, 2724, 2732, 2729, 2792, 2732, 2721, 2792, 2709, 2771, 2767, 2774, 2775, 1718, 1775, 1782, 1789, 1716, 1769, 1781, 1784, 1760, 1716, 1776, 1789, 1716, 2200, 2246, 2247, 2262, 2200, 2180, 2200, 2267, 2240, 2264, 2200, 2180, 2203, 2269, 2241, 2264, 2265, 2984, 2980, 2982, 2970, 2992, 2999, 2985, 3064, 3042, 3053, 2974, 2971, 3042, 2968, 3055, 3052, 3042, 2253, 2199, 2186, 2199, 2191, 2182, 2243, 2269, 2243, 2178, 2265, 2189, 2199, 2187, 2254, 2176, 2187, 2186, 2191, 2183, 2251, 2258, 2250, 2078, 2051, 2078, 2054, 2063, 2272, 2234, 2215, 2234, 2210, 2219, 2286, 2214, 2303, 2274, 2286, 2214, 2303, 2274, 2286, 2272, 2232, 2209, 2218, 2214, 2286, 2214, 2300, 1679, 1678, 1695, 2011, 2014, 1995, 2014, 1938, 1996, 1997, 2012, 1036, 1033, 1052, 1033, 1093, 1031, 1050, 1025, 1039, 1025, 1030, 1033, 1028, 2572, 2642, 2627, 2629, 2631, 2575, 2634, 2630, 2562, 2588, 2562, 2627, 2584, 2636, 2646, 2634, 2575, 2625, 2634, 2635, 2638, 2630, 2570, 2579, 2571, 2562, 
    2588, 2562, 2635, 2639, 2629, 2584, 2636, 2646, 2634, 2575, 2625, 2634, 2635, 2638, 2630, 2570, 2579, 2571, 2574, 2562, 2572, 2642, 2627, 2629, 2631, 2575, 2634, 2630, 2562, 2635, 2639, 2629, 2574, 2562, 2572, 2644, 2637, 2630, 2667, 2639, 2629, 2562, 2635, 2639, 2629, 2574, 2562, 2572, 2642, 2635, 2625, 2562, 2635, 2639, 2629, 1761, 1721, 1696, 1707, 1727, 1699, 1710, 1718, 1702, 1697, 1705, 1696, 1763, 1775, 1761, 1707, 1706, 1724, 1763, 1775, 1761, 1708, 1696, 1697, 1723, 1706, 1697, 1723, 1763, 1775, 1761, 1721, 1696, 1707, 1680, 1708, 1696, 1697, 1723, 1706, 1697, 1723, 31715, 20499, 24012, 22982, 22932, 18717, 19567, 27968, 24168, 27264, 21280, 31415, 24741, 24886, 462, 460, 473, 456, 484, 457, 2229, 2284, 2293, 2302, 2231, 2294, 2291, 2281, 2286, 2231, 2291, 2302, 2231, 2148, 2105, 2094, 2148, 3031, 2965, 2952, 2974, 2975, 2952, 3031, 3031, 2968, 2947, 3031, 2958, 2963, 2967, 2975, 3031, 2969, 2966, 2971, 2953, 2953, 3031, 3018, 3031, 2947, 2975, 2971, 2952, 3031, 3018, 3031, 2966, 2975, 2958, 2958, 2975, 2952, 3031, 3031, 2971, 2952, 2975, 2971, 3031, 3031, 2966, 2971, 2964, 2973, 3031, 3028, 2962, 2958, 2967, 2966, 548, 636, 613, 622, 611, 612, 620, 613, 616, 613, 626, 554, 614, 611, 550, 554, 548, 611, 612, 620, 613, 554, 614, 611, 550, 554, 548, 636, 613, 622, 597, 617, 613, 612, 638, 623, 612, 638, 554, 614, 611, 550, 554, 634, 1420, 1526, 1497, 1408, 1521, 1424, -1360, 1527, 1429, 1526, 1497, 1408, 412, 384, 384, 388, 1851, 1851, 2916, 2936, 2936, 2940, 2943, 2870, 3144, 2103, 2061, 2110, 2084, 2099, 2096, 2059, 1220, 1246, 1225, 1226, 694, 706, 762, 693, 695, 1864, 1906, 1885, 1856, 1885, 1861, 1868, 1908, 2642, 2639, 2642, 2634, 2627, 559, 628, 615, 550, 619, 615, 559, 627, 615, 550, 619, 615, 617, 563, 558, 563, 555, 546, 615, 550, 619, 615, 550, 540, 559, 565, 546, 545, 538, 1059, 1058, 1075, 2958, 2955, 2974, 2955, 3015, 2969, 2968, 2953, 3197, 3192, 3181, 3192, 3124, 3190, 3179, 3184, 3198, 3184, 3191, 3192, 3189, 1275, 1279, 1269, 1716, 1769, 1707, 1718, 1722, 1716, 1770, 1779, 1785, 1719, 1774, 1791, 1762, 1774, 1718, 1722, 1716, 1768, 1791, 1783, 1787, 1768, 1777, 1769, 1718, 1722, 1716, 1785, 1781, 1780, 1774, 1779, 1780, 1775, 1718, 1722, 1769, 1770, 1787, 1780, 2133, 2135, 2114, 2131, 2129, 2137, 2116, 2127, 2165, 2137, 2136, 2114, 2131, 2136, 2114, 2639, 2638, 2655, 2634, 2626, 2631, 2664, 2628, 2629, 2655, 2638, 2629, 2655, 278, 361, 374, 313, 307, 287, 274, 365, 367, 264, 362, 285, 265, 302, 311, 299, 314, 256, 283, 314, 300, 304, 365, 266, 311, 352, 352, 362, 298, 276, 301, 275, 297, 299, 256, 270, 319, 375, 270, 283, 277, 319, 311, 283, 313, 285, 319, 289, 281, 274, 300, 318, 264, 267, 353, 309, 282, 269, 258, 257, 285, 287, 314, 317, 271, 308, 281, 364, 365, 352, 267, 274, 283, 304, 257, 365, 270, 316, 317, 265, 371, 362, 311, 275, 274, 265, 285, 299, 281, 357, 357, 2747, 2717, 2699, 2716, 2755, 2735, 2697, 2699, 2688, 2714, 2099, 2065, 2052, 2071, 2066, 2066, 2079, 2129, 2123, 2128, 2126, 2142, 2134, 2098, 2071, 2064, 2059, 2054, 2117, 2142, 2111, 2064, 2074, 2060, 2065, 2071, 2074, 2142, 2127, 2125, 2117, 2142, 2093, 2099, 2131, 2111, 2126, 2125, 2121, 2091, 2135, 2142, 2111, 2062, 2062, 2066, 2075, 2089, 2075, 2076, 2101, 2071, 2058, 2129, 2123, 2125, 2121, 2128, 2125, 2120, 2142, 2134, 2101, 2102, 2090, 2099, 2098, 2130, 2142, 2066, 2071, 2069, 2075, 2142, 2105, 2075, 2077, 2069, 2065, 2135, 2142, 2109, 2070, 2060, 2065, 2067, 2075, 2129, 2127, 2127, 2124, 2128, 2126, 2128, 2126, 2128, 2126, 2142, 2099, 2065, 2076, 2071, 2066, 2075, 2142, 2093, 2079, 2072, 2079, 2060, 2071, 2129, 2123, 2125, 2121, 2128, 2125, 2120, 2142, 2142, 2059, 2079, 2077, 2063, 717, 1182, 1193, 1194, 1193, 1214, 1193, 1214, 868, 824, 815, 825, 803, 816, 815, 789, 806, 803, 825, 830, 874, 884, 874, 806, 803, 1779, 1770, 1704, 1780, 1763, 1781, 1775, 1788, 1763, 1753, 1770, 1775, 1781, 1778, 1702, 1770, 1775, 1706, 1702, 1704, 1776, 1769, 1762, 1770, 1775, 1781, 1778, 1702, 1770, 1775, 1706, 1702, 1704, 1770, 1775, 1781, 1778, 1702, 1770, 1775, 1706, 1702, 1770, 1775, 1724, 1774, 1767, 1781, 1710, 1767, 1757, 1774, 1780, 1763, 1760, 1708, 1723, 1776, 1769, 1762, 1707, 1762, 1763, 1778, 1767, 1775, 1770, 1707, 1775, 1762, 1755, 1711, 2360, 2367, 2365, 2357, 2323, 2367, 2366, 2340, 2357, 2366, 2340, 600, 551, 568, 583, 605, 578, 600, 632, 545, 609, 547, 548, 613, 576, 582, 633, 558, 608, 546, 579, 551, 609, 608, 576, 544, 569, 609, 626, 605, 597, 638, 604, 629, 622, 590, 615, 608, 609, 577, 580, 635, 631, 628, 634, 599, 599, 588, 599, 639, 578, 578, 596, 607, 631, 596, 545, 634, 622, 627, 599, 573, 576, 604, 577, 636, 582, 544, 603, 582, 602, 614, 580, 625, 629, 607, 595, 595, 559, 544, 626, 620, 569, 599, 576, 614, 632, 603, 610, 579, 638, 611, 615, 590, 599, 607, 631, 551, 606, 604, 615, 593, 639, 559, 578, 623, 634, 636, 609, 600, 591, 555, 1324, 1328, 1328, 1332, 2682, 2656, 2685, 2668, 2743, 753, 749, 736, 760, 740, 755, 706, 750, 751, 757, 740, 751, 757, 1387, 1405, 1401, 1386, 1403, 1392, 1371, 1399, 1398, 1388, 1405, 1398, 1388};
    public String a = "";

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList = h(X1.L(f(this.a + C0142.m567(f107short, 0, 27, 2216) + URLEncoder.encode(str, C0056.m223(f107short, 27, 5, 1821))), ""));
        } catch (Exception unused) {
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(f(this.a), "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : gVarL.Q(C0046.m182(f107short, 32, 44, 2198))) {
            String strC = kVar.c(C0135.m539(f107short, 76, 4, 1223));
            String[] strArrSplit = strC.split(C0120.m477(f107short, 80, 1, 2981));
            String strGroup = strArrSplit.length > 3 ? strArrSplit[3] : "";
            if (TextUtils.isEmpty(strGroup)) {
                if (TextUtils.isEmpty(strC)) {
                    strGroup = "";
                } else {
                    Matcher matcher = Pattern.compile(C0063.m249(f107short, 81, 5, 2273)).matcher(strC);
                    strGroup = "";
                    while (matcher.find()) {
                        strGroup = matcher.group(1);
                    }
                }
            }
            String strTrim = kVar.T().trim();
            if (!TextUtils.isEmpty(strGroup) && !TextUtils.isEmpty(strTrim) && linkedHashSet.add(strGroup)) {
                com.github.catvod.spider.merge.D.b.z(strGroup, strTrim, null, arrayList);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0139.m554(f107short, 86, 1, 3115), C0056.m223(f107short, 87, 2, 2926), null));
            arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0030.m116(f107short, 89, 1, 2308), C0055.m219(f107short, 90, 3, 2781), null));
            arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0018.m70(f107short, 93, 1, 1423), C0093.m368(f107short, 94, 2, 1435), null));
            com.github.catvod.spider.merge.D.b.z(C0082.m325(f107short, 96, 1, 2908), C0130.m516(f107short, 97, 2, 2523), null, arrayList);
        }
        com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q(C0056.m223(f107short, 99, 58, 2404));
        if (!dVarQ.isEmpty()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<E> it = dVarQ.iterator();
            while (it.hasNext()) {
                Iterator<E> it2 = ((k) it.next()).Q(C0027.m105(f107short, 157, 2, 1768)).iterator();
                while (it2.hasNext()) {
                    b(arrayList2, linkedHashSet2, (k) it2.next());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = h(gVarL);
        }
        return com.github.catvod.spider.merge.p001b.g.w(arrayList, arrayList2, new JSONObject(C0053.m210(f107short, 159, 397, 329)));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strU = str2;
        String strI = AbstractC0280n1.i(str, strU, null, null);
        String strF = f(this.a + C0107.m427(f107short, 556, 15, 878));
        String strM554 = C0139.m554(f107short, 571, 47, 1382);
        String strD = d(strM554, strF);
        boolean zIsEmpty = TextUtils.isEmpty(strD);
        String strM499 = C0125.m499(f107short, 618, 22, 1032);
        if (zIsEmpty) {
            strD = d(strM499, strF);
        }
        String strF2 = f(c(strD, strU));
        String strD2 = d(C0030.m116(f107short, 640, 35, 1741), strF2);
        boolean zIsEmpty2 = TextUtils.isEmpty(strD2);
        String strM445 = C0112.m445(f107short, 675, 16, 2813);
        String strD3 = zIsEmpty2 ? d(strM445, strF2) : d(strM445, f(c(strD2, strU)));
        if (TextUtils.isEmpty(strD3)) {
            String strF3 = f(this.a + C0070.m277(f107short, 691, 17, 2249));
            String strD4 = d(strM554, strF3);
            if (TextUtils.isEmpty(strD4)) {
                strD4 = d(strM499, strF3);
            }
            strD3 = d(C0059.m234(f107short, 708, 21, 929), f(c(strD4, strU)));
        }
        if (TextUtils.isEmpty(strD3)) {
            strD3 = "";
        } else if (!strD3.startsWith(C0090.m358(f107short, 729, 4, 1711))) {
            strD3 = a(strD3);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(strD3);
        String strM108 = C0028.m108(f107short, 733, 91, 1392);
        String strM36 = C0010.m36(f107short, 824, 3, 1979);
        if (zIsEmpty3) {
            if (strU != null && strU.contains(strM36)) {
                strU = FishCrypto.u(strM108, strU);
            }
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.q(1);
            gVar.C(strU);
            gVar.b(strI);
            return gVar.r();
        }
        String strU2 = strD3.contains(strM36) ? FishCrypto.u(strM108, strD3) : strD3;
        com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
        gVar2.C(strU2);
        gVar2.h(g());
        gVar2.b(strI);
        if (strD3.contains(C0063.m249(f107short, 827, 5, 2488))) {
            gVar2.k();
        }
        return gVar2.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(f(this.a + C0018.m70(f107short, 832, 15, 2757) + str + C0104.m414(f107short, 847, 5, 2747)), "");
        String strD = d(C0126.m503(f107short, 882, 17, 3013), f(this.a + C0128.m511(f107short, 852, 13, 1689) + str + C0074.m292(f107short, 865, 17, 2229)));
        com.github.catvod.spider.merge.p001b.k kVarA = AbstractC0449a.a(str);
        k kVarR = gVarL.R(C0009.m33(f107short, 899, 23, 2275));
        String strTrim = kVarR != null ? kVarR.c(C0116.m463(f107short, 922, 5, 2154)).trim() : "";
        if (TextUtils.isEmpty(strTrim)) {
            strTrim = j(gVarL, C0120.m477(f107short, 927, 23, 2254));
        }
        String strI = i(gVarL, C0017.m65(f107short, 974, 81, 2594), C0120.m477(f107short, 953, 8, 1983), C0001.m1(f107short, 961, 13, 1128), C0017.m65(f107short, 950, 3, 1788));
        String strJ = j(gVarL, C0011.m42(f107short, 1055, 42, 1743));
        kVarA.o(strTrim);
        kVarA.p(a(strI));
        kVarA.i(e(gVarL, C0072.m285(f107short, 1097, 2, 1944)));
        kVarA.k(e(gVarL, C0082.m325(f107short, 1099, 2, 2812)));
        kVarA.u(e(gVarL, C0055.m219(f107short, 1101, 2, 2016)));
        kVarA.j(e(gVarL, C0019.m75(f107short, 1103, 2, 596)));
        kVarA.m(e(gVarL, C0001.m1(f107short, 1105, 2, 1428)));
        kVarA.l(strJ);
        kVarA.q(C0021.m83(f107short, 1107, 4, 1032));
        kVarA.r(strD);
        AbstractC0280n1.p(strTrim);
        AbstractC0280n1.q(strD);
        FishCrypto.c(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = str;
        String str4 = map == null ? "" : map.get(C0097.m386(f107short, 1111, 6, 429));
        if (!TextUtils.isEmpty(str4)) {
            str3 = str4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(C0079.m314(f107short, 1117, 13, 2202) + str3 + C0073.m288(f107short, 1130, 4, 2121) + str2 + C0093.m368(f107short, 1134, 55, 3066));
        ArrayList arrayListH = h(X1.L(f(sb.toString()), ""));
        int i = Integer.parseInt(str2);
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayListH);
        int i2 = i + 1;
        gVarC.o(i, i2, arrayListH.size(), Math.max(arrayListH.size(), 1) * i2);
        return gVarC.r();
    }

    public static String d(String str, String str2) {
        String str3 = str2;
        Pattern patternCompile = Pattern.compile(str, 32);
        if (str3 == null) {
            str3 = "";
        }
        Matcher matcher = patternCompile.matcher(str3);
        return matcher.find() ? matcher.group(1).trim() : "";
    }

    public static String e(com.github.catvod.spider.merge.f0.g gVar, String str) {
        Iterator<E> it = gVar.Q(C0010.m36(f107short, 1189, 44, 522)).iterator();
        while (it.hasNext()) {
            String strTrim = ((k) it.next()).T().trim();
            if (strTrim.startsWith(str)) {
                return strTrim.replaceFirst(C0049.m193(f107short, 1233, 1, 1490) + Pattern.quote(str) + C0122.m486(f107short, 1234, 11, 1450), "").trim();
            }
        }
        return "";
    }

    public static String i(k kVar, String str, String... strArr) {
        k kVarR = kVar.R(str);
        if (kVarR == null) {
            return "";
        }
        for (String str2 : strArr) {
            String strTrim = kVarR.c(str2).trim();
            if (!TextUtils.isEmpty(strTrim)) {
                return strTrim;
            }
        }
        return "";
    }

    public static String j(k kVar, String str) {
        k kVarR = kVar.R(str);
        return kVarR == null ? "" : kVarR.T().trim();
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(C0109.m432(f107short, 1245, 4, 500))) {
            return str;
        }
        if (str.startsWith(C0073.m288(f107short, 1249, 2, 1812))) {
            return C0001.m1(f107short, 1251, 6, 2828).concat(str);
        }
        String strM365 = C0092.m365(f107short, 1257, 1, 3175);
        return str.startsWith(strM365) ? com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.a, str) : com.github.catvod.spider.merge.D.b.n(new StringBuilder(), this.a, strM365, str);
    }

    public final void b(ArrayList arrayList, LinkedHashSet linkedHashSet, k kVar) {
        String strGroup;
        k kVarR = kVar.R(C0090.m358(f107short, 1258, 7, 2134));
        String strTrim = kVarR == null ? "" : kVarR.c(C0056.m223(f107short, 1265, 4, 1196)).trim();
        if (TextUtils.isEmpty(strTrim)) {
            strGroup = "";
        } else {
            Matcher matcher = Pattern.compile(C0003.m10(f107short, 1269, 5, 670)).matcher(strTrim);
            strGroup = "";
            while (matcher.find()) {
                strGroup = matcher.group(1);
            }
        }
        String strM36 = C0010.m36(f107short, 1274, 8, 1833);
        k kVarR2 = kVar.R(strM36);
        String strTrim2 = kVarR2 != null ? kVarR2.c(C0059.m234(f107short, 1282, 5, 2598)).trim() : "";
        if (TextUtils.isEmpty(strTrim2)) {
            strTrim2 = j(kVar, strM36);
        }
        if (TextUtils.isEmpty(strTrim2)) {
            strTrim2 = j(kVar, C0079.m314(f107short, 1287, 29, 583));
        }
        if (TextUtils.isEmpty(strGroup) || TextUtils.isEmpty(strTrim2) || !linkedHashSet.add(strGroup)) {
            return;
        }
        arrayList.add(new com.github.catvod.spider.merge.p001b.k(strGroup, strTrim2, a(i(kVar, C0032.m126(f107short, 1340, 3, 1170), C0027.m105(f107short, 1319, 8, 3050), C0046.m182(f107short, 1327, 13, 3097), C0008.m31(f107short, 1316, 3, 1104))), j(kVar, C0027.m105(f107short, 1343, 40, 1690))));
    }

    public final String c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a(str) + str2;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0109.m432(f107short, 1383, 15, 2102));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0076.m301(f107short, 1398, 13, 2603));
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

    public final String f(String str) {
        try {
            return X1.X(FishCrypto.u(C0085.m339(f107short, 1411, 91, 344), str), null, g());
        } catch (Exception unused) {
            return "";
        }
    }

    public final HashMap g() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(C0098.m390(f107short, 1502, 10, 2798), C0050.m199(f107short, 1512, 124, 2174));
        mapS.put(C0089.m355(f107short, 1637, 7, 1228), this.a + C0074.m292(f107short, 1636, 1, 738));
        return mapS;
    }

    public final ArrayList h(com.github.catvod.spider.merge.f0.g gVar) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        com.github.catvod.spider.merge.h0.d dVarQ = gVar.Q(C0063.m249(f107short, 1644, 17, 842));
        if (dVarQ.isEmpty()) {
            dVarQ = gVar.Q(C0090.m358(f107short, 1661, 72, 1670));
        }
        Iterator<E> it = dVarQ.iterator();
        while (it.hasNext()) {
            b(arrayList, linkedHashSet, (k) it.next());
        }
        return arrayList;
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0014.m54(f107short, 1733, 11, 2384));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0044 A[PHI: r2
  0x0044: PHI (r2v11 java.lang.String) = (r2v8 java.lang.String), (r2v10 java.lang.String) binds: [B:6:0x0042, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    public void init(Context context, String str) {
        super.init(context, str);
        this.a = FishCrypto.v(C0046.m182(f107short, 1744, 111, 534));
        String strG = "";
        if (!TextUtils.isEmpty(str)) {
            String strTrim = str.trim();
            if (strTrim.startsWith(C0096.m382(f107short, 1855, 4, 1348))) {
                strG = strTrim;
            } else {
                try {
                    strTrim = new JSONObject(strTrim).optString(C0006.m21(f107short, 1859, 4, 2569));
                    if (!TextUtils.isEmpty(strTrim)) {
                        strG = strTrim;
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        while (strG.endsWith(C0095.m379(f107short, 1863, 1, 2712))) {
            strG = com.github.catvod.spider.merge.D.b.g(strG, 1, 0);
        }
        this.a = strG;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0091.m360(f107short, 1864, 13, 641));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0009.m33(f107short, 1877, 13, 1304));
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

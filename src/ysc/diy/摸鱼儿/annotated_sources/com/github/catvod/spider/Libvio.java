package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.spider.merge.A.AbstractC0260h;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0257g;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
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
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
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
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.G;
import com.github.catvod.spider.merge.p017u.H;
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
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Libvio extends Cloud {
    public final Q r = new Q(1);
    public final Object s = new Object();
    public final Object t = new Object();
    public ArrayList u = new ArrayList();
    public volatile String v = "";
    public volatile String w = "";
    public volatile String x = "";
    public volatile int y = 0;
    public volatile String z = "";

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f65short = {831, 809, 813, 830, 815, 804, 867, 865, 865, 865, 865, 865, 865, 865, 865, 865, 865, 865, 865, 865, 866, 804, 824, 801, 800, 883, 827, 808, 881, 2583, 2582, 2564, 2671, 2682, 2260, 2253, 2191, 2258, 2261, 2260, 2248, 2188, 2249, 2244, 2240, 2245, 2244, 2259, 2302, 2302, 2252, 2244, 2255, 2260, 2177, 2207, 2177, 2253, 2248, 2177, 2207, 2177, 2240, 2298, 2249, 2259, 2244, 2247, 2303, 2204, 2190, 2261, 2264, 2257, 2244, 2190, 2300, 2189, 2177, 2240, 2298, 2249, 2259, 2244, 2247, 2303, 2204, 2190, 2258, 2249, 2254, 2262, 2190, 2300, 2666, 2672, 2663, 2660, 2563, 2629, 2649, 2624, 2625, 764, 24831, 24337, 23187, 21216, 1753, 1743, 18704, -28722, -28203, -27098, 21395, 30022, 23102, 25112, 32420, 22007, -30443, -28633, 1523, 1506, 1517, 1458, 1457, 1456, 2610, 2609, 2608, 22940, 32568, 1720, 1723, 1722, 25449, -28455, 3042, 3042, 3046, 1712, 1708, 1708, 1704, 1284, 1524, 1512, 1509, 1533, 1451, 1445, 1533, 2474, 2540, 2544, 2537, 2536, -32001, 22592, 21124, 27416, 25671, -32576, 24416, -27772, -32055, 22398, -26555, 30310, 2379, 2407, 2407, 2403, 2401, 2413, 2401, 2422, 2419, 2367, 2344, 2363, 2325, 2362, 2402, 2400, 2422, 2361, 2341, 2344, 2352, 2348, 2363, 2326, 2344, 2344, 2344, 2344, 2325, 2362, 2403, 2420, 2325, 2362, 2403, 2401, 2325, 2354, 2407, 2403, 2422, 2325, 2356, 2400, 2325, 2362, 2403, 2418, 2422, 2325, 2362, 2403, 2421, 2406, 2362, 2346, 2363, 2336, 2361, 2365, 2423, -29198, 25473, 23840, -30412, 3045, 3042, 3068, 895, 884, 889, 872, 867, 874, 878, 549, 548, 566, 605, 584, 1947, 2008, 1926, 1984, 1933, 1783, 1778, 1785, 1773, 1778, 1780, 1732, 1784, 1780, 1780, 1776, 1778, 1790, 1249, 1252, 1263, 1275, 1252, 1250, 1234, 1262, 1250, 1250, 1254, 1252, 1256, 1234, 1253, 1256, 1249, 1277, 876, 877, 892, 873, 865, 868, 807, 2121, 2063, 2067, 2058, 2059, 2797, 2784, 2815, 2727, 2815, 2790, 2797, 2724, 2784, 2791, 2799, 2790, 2729, 2785, 2744, 2727, 2813, 2784, 2813, 2789, 2796, 1069, 1056, 1087, 1127, 1087, 1062, 1069, 1124, 1081, 1062, 1082, 1085, 1068, 1083, 1129, 1056, 1060, 1070, 1081, 1084, 1065, 1084, 1136, 1074, 1071, 1076, 1082, 1076, 1075, 1084, 1073, 2018, 2019, 2034, 2977, 2988, 2995, 3051, 2995, 2986, 2977, 3048, 2988, 2987, 2979, 2986, 3045, 2977, 2988, 2995, 3051, 2995, 2986, 2977, 3048, 2984, 2976, 2993, 2980, 1100, 1103, 1118, 1105, 1041, 1106, 1114, 1099, 1118, 1042, 1110, 1099, 1114, 1106, 2332, 19068, 27475, -1187, 23910, 27022, -1664, 1315, 1326, 1329, 1385, 1329, 1320, 1315, 1386, 1326, 1321, 1313, 1320, 1383, 1385, 1329, 1320, 1315, 1386, 1333, 1318, 1331, 1326, 1321, 1312, 1383, 1385, 1332, 1316, 1320, 1333, 1314, 24136, 510, 499, 492, 436, 492, 501, 510, 439, 499, 500, 508, 501, 442, 489, 490, 507, 500, 436, 510, 511, 494, 507, 499, 502, 439, 505, 501, 500, 494, 511, 500, 494, 438, 442, 510, 499, 492, 436, 492, 501, 510, 439, 499, 500, 508, 501, 442, 490, 22235, 21902, 2734, 12080, 23254, 22915, 2654, 2643, 2636, 2580, 2644, 2655, 2638, 2654, 2643, 2633, 2641, 2583, 2634, 2651, 2644, 2655, 2646, 1473, 1499, 1484, 1487, 296, 274, 289, 315, 300, 303, 276, 2272, 2289, 2302, 2238, 2273, 2277, 2289, 2274, 2299, 2238, 2291, 2302, 2239, 2275, 2239, 3302, 3312, 3307, 3316, 3303, 3244, 3319, 3297, 3244, 3297, 3308, 3245, 3313, 3245, 1221, 1224, 1229, 1245, 1233, 1226, 1216, 1238, 1229, 1234, 1217, 1162, 1223, 1227, 1225, 1163, 1239, 1163, 1836, 1825, 1828, 1853, 1836, 1827, 1891, 1838, 1826, 1824, 1890, 1854, 1890, 1720, 1723, 1722, 1785, 1768, 1767, 1703, 1770, 1766, 1764, 3005, 3006, 3007, 3068, 3053, 3042, 2978, 3055, 3042, 1696, 1723, 1714, 1697, 1718, 1789, 1762, 1761, 1760, 1699, 1714, 1725, 1789, 1712, 1725, 2427, 2424, 2425, 2428, 2418, 2430, 2404, 2345, 2341, 2343, 970, 969, 968, 963, 973, 974, 981, 920, 916, 918, 3263, 3260, 3261, 3255, 3263, 3260, 3232, 3309, 3297, 3299, 1347, 1344, 1345, 1351, 1355, 1344, 1372, 1297, 1309, 1311, 2415, 2430, 2417, 2353, 2407, 2410, 2417, 2419, 2426, 2422, 2353, 2428, 2416, 2418, 2352, 2412, 2352, 2989, 3004, 2995, 3059, 3007, 3004, 2996, 3001, 2984, 3059, 3006, 2994, 2992, 3058, 655, 640, 643, 665, 648, 706, 733, 724, 725, 706, 655, 642, 707, 1844, 1848, 1827, 1891, 1916, 1918, 1908, 1891, 1838, 1826, 1824, 1890, 1592, 1592, 1596, 1575, 1642, 1638, 1636, 1574, 1658, 1574, 2881, 2881, 2885, 2835, 2836, 2846, 2910, 2835, 2847, 2845, 2911, 2819, 2911, 2951, 2954, 2965, 3021, 2963, 2959, 2946, 2970, 2959, 2954, 2960, 2967, 3022, 2963, 2946, 2957, 2950, 2959, 3284, 3295, 3278, 3294, 3283, 3273, 3281, 3223, 3274, 3291, 3284, 3295, 3286, 2667, 2608, 1323, 1297, 1314, 1336, 1327, 1324, 1376, 1399, 1381, 1338, 1318, 1323, 1331, 1381, 1303, 1382, 1386, 1323, 1297, 1314, 1336, 1327, 1324, 1376, 1399, 1381, 1341, 1381, 1303, 498, 501, 482, 487, 429, 433, 444, 420, 417, 426, 500, 498, 501, 390, 387, 498, 482, 510, 384, 502, 500, 2736, 2951, 2387, 2387, 2387, 1830, 1827, 1832, 1852, 1827, 1829, 1813, 1833, 1829, 1829, 1825, 1827, 1839, 1969, 1972, 1983, 1963, 1972, 1970, 1922, 1982, 1970, 1970, 1974, 1972, 1976, 1922, 1973, 1976, 1969, 1965, 2573, 2348, 2410, 2422, 2415, 2414, 1329, 1322, 1325, 1333, 1389, 814, 821, 818, 810, 882, 885, 769, 825, 886, 884, 1153, 1153, 1153, 1153, 1153, 1153, 1153, 1153, 2509, 2509, 2509, 2510, 2440, 2452, 2445, 2444, 2703, 2526, 2503, 2437, 2520, 2527, 2526, 2498, 2438, 2523, 2506, 2508, 2510, 2548, 2548, 2498, 2527, 2510, 2502, 2443, 2503, 2498, 2437, 2506, 2504, 2527, 2498, 2525, 2510, 2437, 2501, 2526, 2502, 2443, 2506, 901, 924, 990, 899, 900, 901, 921, 989, 896, 913, 919, 917, 943, 943, 921, 900, 917, 925, 976, 924, 921, 990, 913, 915, 900, 921, 902, 917, 990, 926, 901, 925, 567, 555, 555, 559, 556, 613, 624, 624, 552, 552, 552, 625, 563, 566, 573, 567, 571, 625, 572, 560, 562, 624, 1855, 1832, 1837, 1867, 1909, 1855, 1832, 1837, 1889, 1910, 1893, 1899, 1915, 1906, 1891, 1899, 1908, 1912, 1913, 1892, 1891, 1854, 1867, 1892, 1852, 1854, 1832, 1867, 1909, 
    1855, 1859, 1860, 1899, 1860, 1886, 1872, 1899, 1875, 1886, 1873, 1873, 1899, 1882, 1880, 1875, 1874, 1899, 1863, 1880, 1856, 1854, 1867, 1892, 1853, 1834, 1867, 1892, 1853, 1855, 1868, 1840, 1845, 1866, 1854, 1855, 1868, 1865, 1840, 1845, 1866, 1853, 1854, 1867, 1829, 1393, 1867, 1883, 1862, 1886, 1882, 1868, 1883, 1801, 1887, 1868, 1883, 1856, 1871, 1856, 1866, 1864, 1885, 1856, 1862, 1863, 522, 513, 524, 522, 514, 512, 519, 526, 585, 528, 518, 540, 539, 585, 523, 539, 518, 542, 538, 524, 539, 3321, 3306, 3325, 3302, 3305, 3318, 3247, 3318, 3296, 3322, 3247, 3310, 3325, 3306, 3247, 3303, 3322, 3298, 3310, 3297, 3190, 3173, 3186, 3177, 3174, 3193, 3104, 3188, 3176, 3169, 3188, 3104, 3193, 3183, 3189, 3104, 3169, 3186, 3173, 3104, 3176, 3189, 3181, 3169, 3182, 2271, 2259, 2258, 2266, 2261, 2254, 2257, 2204, 2245, 2259, 2249, 2204, 2269, 2254, 2265, 2204, 2260, 2249, 2257, 2269, 2258, 1288, 1350, 1292, 1345, 1289, 1300, 1292, 1280, 1295, 1234, 1238, 1179, 1235, 1230, 1238, 1242, 1237, 2324, 2326, 2315, 2315, 2306, 2377, 2315, 2306, 2377, 2323, 2315, 2326, 2319, 2150, 2148, 2169, 2169, 2160, 2102, 2169, 2160, 2102, 2145, 2169, 2148, 2173, 1661, 1643, 1645, 1659, 1660, 1639, 1658, 1655, 1582, 1634, 1647, 1655, 1643, 1660, 2409, 2364, 2418, 2421, 2431, 2364, 2418, 2425, 2416, 2429, 2429, 2420, 2431, 2422, 2420, 25920, 24958, 28750, 18923, 27683, -30556, 22276, -25632, -30035, 21213, 22588, -27688, -32107, 17887, 27743, -28183, -32604, 2814, 1525, 1522, 1521, 1510, 2033, 2047, 2018, 2046, 2019, 2036, 1976, 2047, 2041, 2700, 2697, 2690, 2710, 2697, 2703, 2823, 2818, 2825, 2819, 2831, 2063, 2056, 2059, 2076, 3073, 3076, 3087, 3099, 3076, 3074, 3139, 3084, 3101, 3101, 1503, 1489, 1484, 1488, 1485, 1498, 1430, 1489, 1495, 3107, 3135, 3135, 3131, 3185, 3172, 3172, 1493, 1481, 1481, 1485, 1486, 1415, 1426, 1426, 2872, 2872, 2706, 2702, 2702, 2698, 2697, 2752, 2127, 3080, 2465, 2477, 2484, 2529, 2477, 2475, 2473, 1074, 1065, 571, 571, 2620, 2592, 2592, 2596, 2599, 2670, 2569, 2581, 2581, 2577, 2651, 2638, 2638, 2234, 2214, 2214, 2210, 2209, 2280, 2301, 2301, 392, 304, 311, 1407, 1381, 1387, 2739, 2750, 2737, 2737, 2451, 2449, 2458, 2459, 3239, 3251, 3250, 3241, 1364, 1355, 1363, 1672, 1672, 1716, 1715, 1721, 1672, 1703, 1720, 1696, 291, 308, 297, 287, 318, 312, 308, 319, 318, 2285, 2301, 2292, 2292, 2299, 2289, 2299, 2291, 2302, 3188, 3177, 3178, 3176, 3168, 3198, 3195, 1119, 1107, 1106, 1103, 1096, 1120, 1103, 1047, 1123, 1143, 1120, 1103, 1046, 1025, 1120, 1103, 1046, 1127, 1051, 1054, 1121, 1044, 1127, 1122, 1051, 1054, 1121, 1047, 1045, 3295, 3283, 3282, 3279, 3272, 3296, 3279, 3223, 3299, 3326, 3325, 3327, 3319, 3305, 3308, 3296, 3279, 3222, 3201, 3296, 3279, 3222, 3296, 3303, 3220, 3218, 3222, 3203, 3221, 3296, 3297, 3207, 1812, 1795, 1822, 1832, 1801, 1807, 1795, 1800, 1801, 1840, 1860, 1847, 1867, 1870, 1841, 1860, 1847, 1884, 1857, 1877, 1856, 1840, 1823, 1841, 1863, 1861, 1847, 1867, 1870, 1841, 1840, 1823, 1862, 1856, 1840, 1823, 1862, 1843, 1831, 1840, 1861, 290, 318, 318, 314, 313, 373, 368, 357, 357, 273, 276, 278, 313, 360, 365, 374, 372, 279, 353, 2536, 2919, 2934, 2915, 2943, 529, 538, 536, 532, 540, 539, 968, 981, 989, 964, 991, 968, 990, 1144, 1140, 1133, 1080, 1140, 1138, 1136, 1241, 1227, 1223, 1231, 1241, 1219, 1246, 1231, 2324, 2306, 2308, 2322, 2325, 2306, 1217, 1245, 1245, 1241, 1222, 1223, 1221, 1232, 1472, 1474, 1497, 1503, 1474, 1497, 1476, 1481, 2247, 2242, 2249, 2269, 2242, 2244, 2292, 2248, 2244, 2244, 2240, 2242, 2254, 1887, 1875, 1875, 1879, 1877, 1881, 745, 761, 740, 764, 760, 750, 761, 724, 744, 740, 740, 736, 738, 750, 2243, 2256, 2247, 2268, 2259, 2252, 2282, 2262, 2266, 2266, 2270, 2268, 2256, 1246, 1235, 1239, 1234, 1235, 1220, 1221, 2609, 2620, 2616, 2621, 2620, 2603, 2652, 2672, 2672, 2676, 2678, 2682, 2456, 2484, 2484, 2480, 2482, 2494, 3065, 1408, 1413, 1422, 1434, 1413, 1411, 1459, 1423, 1411, 1411, 1415, 1413, 1417, 1500, 1438, 1435, 1424, 1412, 1435, 1437, 1453, 1425, 1437, 1437, 1433, 1435, 1431, 1596, 1568, 1568, 1572, 1575, 1646, 1659, 1659, 1571, 1571, 1571, 1658, 1592, 1597, 1590, 1596, 1584, 1658, 1591, 1595, 1593, 1659, 2160, 2165, 2174, 2154, 2165, 2163, 2115, 2175, 2163, 2163, 2167, 2165, 2169, 2020, 1958, 1955, 1960, 1980, 1955, 1957, 1941, 1961, 1957, 1957, 1953, 1955, 1967, 2621, 2679, 2682, 2666, 2636, 2672, 2684, 2684, 2680, 2682, 2678, 3266, 3279, 3295, 3321, 3269, 3273, 3273, 3277, 3279, 3267, 3134, 3109, 3116, 3136, 3167, 3160, 3163, 2499, 2498, 2512, 2491, 2478, 321, 2068, 2615, 2610, 2617, 2605, 2610, 2612, 2564, 2616, 2612, 2612, 2608, 2610, 2622, 2041, 2037, 2037, 2033, 2035, 2047, 2326, 2362, 2362, 2366, 2364, 2352, 1972, 1956, 1977, 1953, 1957, 1971, 1956, 1929, 1973, 1977, 1977, 1981, 1983, 1971, 737, 754, 741, 766, 753, 750, 712, 756, 760, 760, 764, 766, 754, 3078, 3075, 3080, 3100, 3075, 3077, 3125, 3081, 3077, 3077, 3073, 3075, 3087, 1455, 1530, 1460, 1459, 1465, 1530, 1460, 1471, 1462, 1467, 1467, 1458, 1465, 1456, 1458, 1912, 1905, 1792, 2883, 850, 894, 894, 890, 888, 884, 2917, 2915, 2936, 2837, 2873, 2848, 2933, 2841, 2879, 2877, 2917, 2920, 965, 746, 29218, 30786, -32390, 25785, 21367, 27371, 26036, -32461, 24211, -28041, -31942, 1120, 1122, 1141, 1128, 1134, 1135, 2895, 2893, 2904, 2889, 2891, 2883, 2910, 2901, 2927, 2883, 2882, 2904, 2889, 2882, 2904, 993, 992, 1009, 996, 1004, 1001, 966, 1002, 1003, 1009, 992, 1003, 1009, 3186, 3172, 3189, 3116, 3170, 3182, 3182, 3178, 3176, 3172, 544, 551, 549, 557, 523, 551, 550, 572, 557, 550, 572, 2740, 3006, 2978, 2978, 2982, 732, 710, 731, 714, 1424, 1431, 1428, 1411, 523, 526, 537, 535, 530, 520, 531, 679, 688, 697, 688, 692, 678, 688, 1148, 1126, 1147, 1130, 1148, 2755, 2783, 2783, 2779, 1634, 1662, 1662, 1658, 1657, 1584, 1573, 1573, 1661, 1661, 1661, 1572, 1638, 1635, 1640, 1634, 1646, 1572, 1641, 1637, 1639, 1573, 1341, 1336, 1331, 1319, 1336, 1342, 2777, 2757, 2757, 2753, 2754, 
    2699, 2718, 2718, 2758, 2758, 2758, 2719, 2781, 2776, 2771, 2777, 2773, 2719, 2770, 2782, 2780, 2718, 2821, 2890, 2839, 2832, 2833, 2829, 2889, 2834, 2827, 2816, 2824, 2829, 2839, 2832, 2875, 2875, 2832, 2828, 2833, 2825, 2822, 2879, 2828, 2838, 2817, 2818, 2894, 2905, 2891, 2816, 2817, 2832, 2821, 2829, 2824, 2891, 2873, 2888, 2884, 2833, 2824, 2890, 2839, 2832, 2833, 2829, 2889, 2834, 2827, 2816, 2824, 2829, 2839, 2832, 2884, 2821, 2879, 2832, 2829, 2832, 2824, 2817, 2873, 2879, 2828, 2838, 2817, 2818, 2894, 2905, 2891, 2816, 2817, 2832, 2821, 2829, 2824, 2891, 2873, 2888, 2884, 2821, 2879, 2828, 2838, 2817, 2818, 2894, 2905, 2891, 2816, 2817, 2832, 2821, 2829, 2824, 2891, 2873, 2879, 2832, 2829, 2832, 2824, 2817, 2873, 1418, 1423, 1434, 1423, 1475, 1409, 1436, 1415, 1417, 1415, 1408, 1423, 1410, 2442, 2448, 2439, 2436, 1289, 1346, 1347, 1362, 1351, 1359, 1354, 1289, 1294, 1405, 1400, 1289, 1305, 1285, 1403, 1293, 1295, 2830, 2888, 2900, 2893, 2892, 2577, 2572, 2577, 2569, 2560, 2697, 2700, 2713, 2700, 2752, 2718, 2719, 2702, 2929, 2928, 2913, 2817, 2822, 2840, 2856, 2908, 2863, 2899, 2902, 2857, 2891, 2908, 2863, 2858, 2899, 2902, 2909, 2857, 2911, 2909, 2511, 2504, 2501, 2512, 2521, 3315, 3319, 3325, 26366, -28519, 32442, 407, 443, 443, 447, 445, 433, 1701, 1673, 1673, 1677, 1679, 1667, 23316, -26709, 31112, 32681, 30153, -29455, 26930, 24316, 26464, 26687, -29512, 21272, -24580, -29007, 1368, 1487, 1368, 1738, 1743, 1732, 1744, 1743, 1737, 1785, 1733, 1737, 1737, 1741, 1743, 1731, 26323, -32172, 24052, -28400, -32675, 3004, 2995, 3004, 3039, 3059, 3059, 3063, 3061, 3065, -25903, 29938, 466, 471, 476, 456, 471, 465, 481, 477, 465, 465, 469, 471, 475, 1812, 1809, 1818, 1806, 1809, 1815, 1831, 1819, 1815, 1815, 1811, 1809, 1821, 1831, 1808, 1821, 1812, 1800, 3042, 3022, 3022, 3018, 3016, 3012, -30698, 22647, 28408, 29098, 23903, 25795, 31754, 30314, -25505, -29422, 21213, 20493, 24248, 1680, 1724, 1724, 1720, 1722, 1718, 2014, 2011, 2000, 1988, 2011, 2013, 2029, 2001, 2013, 2013, 2009, 2011, 2007, 2029, 2010, 2007, 2014, 1986, 2547, 2506, 2521, 2498, 2511, 2504, 2498, 2547, 2520, 2499, 2503, 2505, 2498, 2449, 2922, 2934, 2939, 2915, 2943, 2920, 2905, 2933, 2932, 2926, 2943, 2932, 2926, 1483, 941, 945, 945, 949, 950, 1023, 1002, 1002, 946, 946, 946, 1003, 937, 940, 935, 941, 929, 1003, 934, 938, 936, 1002, 2541, 2555, 2559, 2540, 2557, 2550, 2525, 2545, 2544, 2538, 2555, 2544, 2538, 3300, 3325, 3277, 3311, 3326, 3322, 3309, 3302, 3311, 3288, 3307, 3324, 3303, 3304, 3319, 3297, 3288, 3275, 3280, 3293, 3290, 3280, 3297, 3274, 3281, 3285, 3291, 3280, 780, 775, 782, 771, 771, 778, 769, 776, 778, 853, 819, 796, 837, 840, 839, 820, 817, 840, 818, 837, 838, 840, 1692, 1683, 1678, 1674, 1688, 1679, 1735, 1697, 1678, 1751, 1754, 1749, 1702, 1699, 1754, 1696, 1751, 1748, 1754, 2220, 2218, 2236, 2219, 2224, 2231, 2239, 2230, 2275, 2181, 2218, 2291, 2302, 2289, 2178, 2183, 2302, 2180, 2291, 2288, 2302, 2115, 2116, 2136, 2143, 2114, 2117, 2125, 2116, 2065, 2167, 2136, 2049, 2060, 2051, 2160, 2165, 2060, 2166, 2049, 2050, 2060, 2485, 2492, 2509, 1199, 1193, 1215, 1192, 1203, 1204, 1212, 1205, 533, 530, 526, 521, 532, 531, 539, 530, 3082, 3073, 3080, 3077, 3077, 3084, 3079, 3086, 3084, 2653, 2642, 2639, 2635, 2649, 2638, 2571, 2567, 2572, 2573, 2008, 1988, 1988, 1984, 1987, 1930, 1951, 1951, 2006, 2014, 1949, 2003, 2001, 1984, 1988, 2003, 2008, 2001, 1950, 1988, 2001, 2003, 2015, 2015, 2012, 1950, 2003, 2015, 2013, 1951, 2010, 1987, 2035, 2001, 1984, 1988, 2003, 2008, 2001, 2022, 2005, 1986, 2009, 2006, 1993, 2484, 2481, 2445, 2470, 2493, 2489, 2487, 2492, 1764, 1747, 1744, 1747, 1732, 1747, 1732, 2806, 2794, 2794, 2798, 2724, 2737, 2737, 3139, 3167, 3167, 3163, 3160, 3089, 3076, 3076, 311, 256, 259, 256, 279, 256, 279, 1231, 2748, 1628, 1627, 1626, 1606, 1538, 1625, 1600, 1611, 1603, 1606, 1628, 1627, 582, 525, 524, 541, 520, 512, 517, 582, 1778, 1783, 1762, 1783, 1708, 2521, 2501, 2501, 2497, 3031, 3031, 2381, 2385, 2385, 2389, 2390, 2335, 1799, 2887, 2928, 2931, 2928, 2919, 2928, 2919, 2063, 2083, 2083, 2087, 2085, 2089, 2175, 2137, 2127, 2136, 2055, 2155, 2125, 2127, 2116, 2142, 1252, 1222, 1235, 1216, 1221, 1221, 1224, 1158, 1180, 1159, 1177, 1161, 1153, 1253, 1216, 1223, 1244, 1233, 1170, 1161, 1256, 1223, 1229, 1243, 1222, 1216, 1229, 1161, 1176, 1176, 1170, 1161, 1273, 1216, 1233, 1228, 1221, 1161, 1182, 1152, 1161, 1256, 1241, 1241, 1221, 1228, 1278, 1228, 1227, 1250, 1216, 1245, 1158, 1180, 1178, 1182, 1159, 1178, 1183, 1161, 1153, 1250, 1249, 1277, 1252, 1253, 1157, 1161, 1221, 1216, 1218, 1228, 1161, 1262, 1228, 1226, 1218, 1222, 1152, 1161, 1258, 1217, 1243, 1222, 1220, 1228, 1158, 1176, 1179, 1179, 1159, 1177, 1159, 1177, 1159, 1177, 1161, 1252, 1222, 1227, 1216, 1221, 1228, 1161, 1274, 1224, 1231, 1224, 1243, 1216, 1158, 1180, 1178, 1182, 1159, 1178, 1183, 290, 256, 256, 262, 275, 279, 2329, 2312, 2325, 2329, 2370, 2309, 2329, 2304, 2305, 2369, 2316, 2333, 2333, 2305, 2308, 2318, 2316, 2329, 2308, 2306, 2307, 2370, 2325, 2309, 2329, 2304, 2305, 2374, 2325, 2304, 2305, 2369, 2316, 2333, 2333, 2305, 2308, 2318, 2316, 2329, 2308, 2306, 2307, 2370, 2325, 2304, 2305, 2390, 2332, 2384, 2397, 2371, 2388, 2369, 2375, 2370, 2375, 2390, 2332, 2384, 2397, 2371, 2389, 2257, 2291, 2291, 2293, 2272, 2276, 2237, 2268, 2289, 2302, 2295, 2277, 2289, 2295, 2293, 2974, 2956, 3017, 2983, 2986, 3016, 2974, 2956, 3039, 2965, 3033, 3028, 3018, 3037, 3016, 2945, 2954, 3039, 2965, 3033, 3028, 3018, 3036, 1393, 440, 404, 404, 400, 402, 414};
    public static volatile String A = C0117.m467(f65short, 949, 22, 607);
    public static final Pattern B = Pattern.compile(C0030.m116(f65short, 971, 74, 1815), 2);

    final class PageResponse {
        public final int a;
        public final String b;
        public final Map c;

        public PageResponse(int i, String str, Map map) {
            Map map2 = map;
            String str2 = str;
            this.a = i;
            this.b = str2 == null ? "" : str2;
            this.c = map2 == null ? new HashMap() : map2;
        }
    }

    final class PowChallenge {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public PowChallenge(String str, String str2, String str3, String str4, String str5) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        String strM322 = C0081.m322(f65short, 0, 29, 844);
        ArrayList arrayList = new ArrayList();
        try {
            String strT = t(strM322 + URLEncoder.encode(str, C0055.m219(f65short, 29, 5, 2626)), y());
            if (J(strT)) {
                return n();
            }
            l(X1.L(strT, ""), arrayList);
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        } catch (Exception unused) {
        }
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strT = t("", y());
        if (J(strT)) {
            return n();
        }
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(strT, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : gVarL.Q(C0076.m301(f65short, 34, 60, 2209))) {
            String strTrim = kVar.T().trim();
            String strReplace = kVar.c(C0045.m177(f65short, 94, 4, 2562)).replace(C0053.m210(f65short, 98, 5, 2605), "");
            if (strReplace.startsWith(C0101.m402(f65short, 103, 1, 723))) {
                strReplace = strReplace.substring(1);
            }
            if (!strTrim.isEmpty() && !C0142.m567(f65short, 104, 2, 1547).equals(strTrim) && linkedHashSet.add(strReplace)) {
                com.github.catvod.spider.merge.D.b.z(strReplace, strTrim, null, arrayList2);
            }
        }
        l(gVarL, arrayList);
        return com.github.catvod.spider.merge.p001b.g.z(arrayList2, arrayList);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws UnsupportedEncodingException {
        String strI = AbstractC0280n1.i(str, str2, null, null);
        if (str != null && (str.contains(C0118.m471(f65short, 106, 2, 939)) || str.contains(C0044.m175(f65short, 108, 2, 1676)) || str.contains(C0115.m459(f65short, 110, 2, 1544)) || str.contains(C0105.m416(f65short, 112, 2, 2026)) || str.contains(C0006.m21(f65short, 114, 2, 2746)) || str.contains(C0063.m249(f65short, 116, 2, 791)) || str.contains(C0118.m471(f65short, 118, 2, 1887)) || str.contains(C0114.m454(f65short, 120, 2, 1744)) || str.contains(C0021.m83(f65short, 122, 6, 1411)) || str.contains(C0096.m382(f65short, 128, 5, 2563)) || str.contains(C0021.m83(f65short, 133, 5, 1673)) || str.contains(C0074.m292(f65short, 138, 3, 3027)))) {
            return super.playerContent(str, str2, list);
        }
        String strTrim = str2 == null ? "" : str2.trim();
        String strM199 = C0050.m199(f65short, 141, 4, 1752);
        if (!strTrim.startsWith(strM199)) {
            if (strTrim.startsWith(C0089.m355(f65short, 145, 1, 1323))) {
                strTrim = strTrim.substring(1);
            }
            if (!strTrim.startsWith(C0085.m339(f65short, 146, 5, 1412))) {
                String strM539 = C0135.m539(f65short, 151, 2, 1490);
                if (!strTrim.startsWith(strM539)) {
                    strTrim = strM539.concat(strTrim);
                }
            }
            String strM210 = C0053.m210(f65short, 153, 5, 2436);
            if (!strTrim.endsWith(strM210)) {
                strTrim = strTrim.concat(strM210);
            }
        }
        String strH = strTrim.startsWith(strM199) ? strTrim : H(r(), strTrim);
        String strT = t(strTrim, x(strH));
        if (J(strT)) {
            return com.github.catvod.spider.merge.p001b.g.d(C0118.m471(f65short, 158, 18, 2312));
        }
        Matcher matcher = Pattern.compile(C0003.m10(f65short, 176, 55, 2377), 32).matcher(strT);
        boolean zFind = matcher.find();
        String strM288 = C0073.m288(f65short, 231, 4, 1041);
        if (!zFind) {
            return com.github.catvod.spider.merge.p001b.g.d(strM288);
        }
        JSONObject jSONObject = new JSONObject(matcher.group(1));
        String strOptString = jSONObject.optString(C0008.m31(f65short, 235, 3, 2960), "");
        int iOptInt = jSONObject.optInt(C0104.m414(f65short, 238, 7, 794), 0);
        String strM529 = C0133.m529(f65short, 245, 5, 624);
        if (iOptInt == 2) {
            strOptString = URLDecoder.decode(new String(Base64.decode(strOptString, 0)), strM529);
        } else if (iOptInt == 1) {
            strOptString = URLDecoder.decode(strOptString, strM529);
        }
        if (strOptString.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d(strM288);
        }
        if (!strOptString.contains(C0143.m570(f65short, 250, 5, 1973))) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(strOptString);
            gVar.h(x(strH));
            gVar.b(strI);
            return gVar.r();
        }
        com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
        gVar2.C(strOptString);
        gVar2.h(x(strH));
        gVar2.k();
        gVar2.b(strI);
        return gVar2.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strTrim;
        String strTrim2;
        String strTrim3;
        String strTrim4;
        String strTrim5;
        String str;
        String strM177;
        String str2;
        if (list == null || list.isEmpty() || TextUtils.isEmpty(list.get(0))) {
            return AbstractC0449a.b();
        }
        String str3 = list.get(0);
        if (C0074.m292(f65short, 255, 13, 1691).equals(str3) || C0137.m545(f65short, 268, 18, 1165).equals(str3)) {
            AbstractC0302v0.g0(str3, new G(this));
            return "";
        }
        String strM42 = C0011.m42(f65short, 286, 7, 776);
        String strM382 = C0096.m382(f65short, 293, 5, 2151);
        String strT = t(com.github.catvod.spider.merge.D.b.j(strM42, str3, strM382), y());
        if (J(strT)) {
            return n();
        }
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(strT, "");
        String strG = gVarL.Q(C0137.m545(f65short, 298, 21, 2697)).g();
        String strM285 = C0072.m285(f65short, 319, 18, 1097);
        String strA = gVarL.Q(strM285).a(C0137.m545(f65short, 337, 13, 1117));
        if (strA.isEmpty()) {
            strA = gVarL.Q(strM285).a(C0118.m471(f65short, 350, 3, 1937));
        }
        com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q(C0006.m21(f65short, 353, 25, 3013));
        if (dVarQ.size() > 0) {
            com.github.catvod.spider.merge.h0.d dVarQ2 = ((k) dVarQ.get(0)).Q(C0009.m33(f65short, 378, 14, 1087));
            int size = dVarQ2.size();
            String strM277 = C0070.m277(f65short, 392, 1, 2355);
            strTrim = size > 0 ? ((k) dVarQ2.get(0)).T().replace(strM277, "").trim() : "";
            strTrim3 = dVarQ2.size() > 1 ? ((k) dVarQ2.get(1)).T().replace(strM277, "").trim() : "";
            strTrim2 = dVarQ2.size() > 2 ? ((k) dVarQ2.get(2)).T().replace(strM277, "").trim() : "";
        } else {
            strTrim = "";
            strTrim2 = strTrim;
            strTrim3 = strTrim2;
        }
        if (dVarQ.size() > 1) {
            String strT2 = ((k) dVarQ.get(1)).T();
            strTrim4 = strT2.startsWith(C0043.m169(f65short, 393, 3, 1095)) ? strT2.substring(3).trim() : strT2.trim();
        } else {
            strTrim4 = "";
        }
        if (dVarQ.size() > 2) {
            String strT3 = ((k) dVarQ.get(2)).T();
            strTrim5 = strT3.startsWith(C0112.m445(f65short, 396, 3, 1690)) ? strT3.substring(3).trim() : strT3.trim();
        } else {
            strTrim5 = "";
        }
        k kVarR = gVarL.R(C0079.m314(f65short, 399, 31, 1351));
        String strTrim6 = kVarR != null ? kVarR.T().replace(C0097.m386(f65short, 430, 1, 3150), "").trim() : "";
        k kVarR2 = gVarL.R(C0047.m186(f65short, 431, 48, 410));
        String strTrim7 = kVarR2 == null ? "" : kVarR2.T().replace(C0050.m199(f65short, 479, 4, 2702), "").replace(C0009.m33(f65short, 483, 2, 1667), "").trim();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str4 = strTrim7;
        Iterator it = gVarL.Q(C0063.m249(f65short, 485, 17, 2618)).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            str = strTrim6;
            strM177 = C0045.m177(f65short, 502, 4, 1449);
            if (!zHasNext) {
                break;
            }
            Iterator it2 = it;
            String str5 = strTrim5;
            Iterator it3 = ((k) it.next()).Q(C0070.m277(f65short, 506, 7, 329)).iterator();
            while (it3.hasNext()) {
                String strTrim8 = ((k) it3.next()).c(strM177).trim();
                if (!strTrim8.isEmpty()) {
                    Iterator it4 = it3;
                    if (strTrim8.contains(C0139.m554(f65short, 513, 15, 2192)) || strTrim8.contains(C0045.m177(f65short, 528, 14, 3202)) || strTrim8.contains(C0128.m511(f65short, 542, 18, 1188)) || strTrim8.contains(C0115.m459(f65short, 560, 13, 1869))) {
                        str2 = strTrim4;
                    } else {
                        if (TextUtils.isEmpty(strTrim8)) {
                            str2 = strTrim4;
                        } else {
                            String lowerCase = strTrim8.toLowerCase();
                            str2 = strTrim4;
                            if (lowerCase.contains(C0087.m346(f65short, 573, 10, 1673)) || lowerCase.contains(C0097.m386(f65short, 583, 9, 2956)) || lowerCase.contains(C0143.m570(f65short, 592, 15, 1747)) || lowerCase.contains(C0079.m314(f65short, 607, 10, 2378)) || lowerCase.contains(C0070.m277(f65short, 617, 10, 1019)) || lowerCase.contains(C0135.m539(f65short, 627, 10, 3214)) || lowerCase.contains(C0053.m210(f65short, 637, 10, 1394))) {
                            }
                            it3 = it4;
                            strTrim4 = str2;
                        }
                        if (strTrim8.contains(C0093.m368(f65short, 647, 17, 2335)) || strTrim8.contains(C0073.m288(f65short, 664, 14, 3037)) || strTrim8.contains(C0098.m390(f65short, 678, 13, 748)) || strTrim8.contains(C0044.m175(f65short, 691, 12, 1869)) || strTrim8.contains(C0139.m554(f65short, 703, 10, 1545)) || strTrim8.contains(C0109.m432(f65short, 713, 13, 2928))) {
                        }
                        it3 = it4;
                        strTrim4 = str2;
                    }
                    if (linkedHashSet.add(strTrim8)) {
                        arrayList.add(strTrim8);
                    }
                    it3 = it4;
                    strTrim4 = str2;
                }
            }
            strTrim5 = str5;
            strTrim6 = str;
            it = it2;
        }
        String str6 = strTrim5;
        String str7 = strTrim4;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it5 = gVarL.Q(C0076.m301(f65short, 726, 18, 3043)).iterator();
        while (it5.hasNext()) {
            k kVar = (k) it5.next();
            if (!kVar.I(C0072.m285(f65short, 744, 13, 3258))) {
                String strTrim9 = kVar.Q(C0119.m473(f65short, 757, 2, 2563)).g().trim();
                if (!strTrim9.isEmpty()) {
                    Iterator it6 = it5;
                    ArrayList arrayList4 = new ArrayList();
                    String str8 = strTrim2;
                    Iterator it7 = kVar.Q(C0139.m554(f65short, 759, 29, 1354)).iterator();
                    while (it7.hasNext()) {
                        k kVar2 = (k) it7.next();
                        String strC = kVar2.c(strM177);
                        Iterator it8 = it7;
                        String str9 = strM177;
                        Matcher matcher = Pattern.compile(C0082.m325(f65short, 788, 21, 477)).matcher(strC == null ? "" : strC);
                        String strReplace = matcher.find() ? matcher.group(1).replace(strM382, "") : "";
                        String strTrim10 = kVar2.T().trim();
                        if (!strReplace.isEmpty() && !strTrim10.isEmpty()) {
                            arrayList4.add(strTrim10 + C0143.m570(f65short, 809, 1, 2708) + strReplace);
                        }
                        strM177 = str9;
                        it7 = it8;
                    }
                    String str10 = strM177;
                    if (!arrayList4.isEmpty()) {
                        arrayList2.add(strTrim9);
                        arrayList3.add(TextUtils.join(C0120.m477(f65short, 810, 1, 2980), arrayList4));
                    }
                    it5 = it6;
                    strTrim2 = str8;
                    strM177 = str10;
                }
            }
        }
        String str11 = strTrim2;
        String strM454 = C0114.m454(f65short, 811, 3, 2423);
        String strJoin = TextUtils.join(strM454, arrayList2);
        String strJoin2 = TextUtils.join(strM454, arrayList3);
        if (!arrayList.isEmpty()) {
            String strA2 = a(arrayList);
            String strB = b(arrayList);
            if (!strA2.isEmpty() && !strB.isEmpty()) {
                strJoin = strJoin.isEmpty() ? strA2 : com.github.catvod.spider.merge.D.b.C(strJoin, strM454, strA2);
                strJoin2 = strJoin2.isEmpty() ? strB : com.github.catvod.spider.merge.D.b.C(strJoin2, strM454, strB);
            }
        }
        com.github.catvod.spider.merge.p001b.k kVarA = AbstractC0449a.a(str3);
        kVarA.p(w(strA));
        kVarA.o(strG);
        kVarA.i(strTrim);
        kVarA.k(strTrim3);
        kVarA.u(str11);
        kVarA.j(str7);
        kVarA.m(str6);
        kVarA.s(str);
        kVarA.l(str4);
        kVarA.q(strJoin);
        kVarA.r(strJoin2);
        AbstractC0280n1.p(strG);
        AbstractC0280n1.q(strJoin2);
        boolean z = FishCrypto.a;
        N1.d(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        if (C0117.m467(f65short, 814, 13, 1866).equals(str)) {
            InitOrigin.run(new H(this, 0));
            return "";
        }
        if (!C0106.m422(f65short, 827, 18, 2013).equals(str)) {
            return "";
        }
        InitOrigin.run(new H(this, 1));
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00c4  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x00c4, please report this as an issue */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String strT;
        int iIndexOf;
        ArrayList arrayList = new ArrayList();
        String strTrim = str == null ? "" : str.trim();
        String strM386 = C0097.m386(f65short, 845, 1, 2594);
        if (strTrim.startsWith(strM386)) {
            strTrim = strTrim.substring(1);
        }
        String strM416 = C0105.m416(f65short, 846, 5, 2306);
        int i = 0;
        if (strTrim.endsWith(strM416)) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 5, 0);
        }
        String strM558 = C0140.m558(f65short, 851, 5, 1346);
        if (strTrim.startsWith(strM558)) {
            Matcher matcher = Pattern.compile(C0116.m463(f65short, 856, 10, 861)).matcher(strTrim);
            if (matcher.find()) {
                str3 = strM558 + matcher.group(1) + C0030.m116(f65short, 866, 8, 1196) + str2 + C0001.m1(f65short, 874, 8, 2528);
            } else {
                str3 = strTrim + C0010.m36(f65short, 882, 1, 2722) + str2 + strM416;
            }
        } else {
            str3 = strTrim + C0010.m36(f65short, 882, 1, 2722) + str2 + strM416;
        }
        String strT2 = t(str3, y());
        if (J(strT2)) {
            return n();
        }
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(strT2, "");
        l(gVarL, arrayList);
        int i2 = Integer.parseInt(str2);
        k kVarR = gVarL.R(C0098.m390(f65short, 883, 34, 2475));
        if (kVarR == null) {
            kVarR = gVarL.R(C0116.m463(f65short, 917, 32, 1008));
        }
        if (kVarR != null && (iIndexOf = (strT = kVarR.T()).indexOf(strM386)) > 0) {
            try {
                i = Integer.parseInt(strT.substring(iIndexOf + 1).trim());
            } catch (Exception unused) {
            }
        }
        if (i <= 0) {
            i = i2 + 1;
        }
        return AbstractC0449a.c(i2, i, arrayList.size(), arrayList.size() * i, arrayList);
    }

    public static boolean A(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : str.split(C0063.m249(f65short, 1045, 1, 1354))) {
            int iIndexOf = str2.indexOf(61);
            if (iIndexOf > 0 && !TextUtils.isEmpty(str2.substring(iIndexOf + 1).trim())) {
                return true;
            }
        }
        return false;
    }

    public static boolean B(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.contains(C0091.m360(f65short, 1046, 20, 1833)) || lowerCase.contains(C0014.m54(f65short, 1066, 21, 617)) || lowerCase.contains(C0059.m234(f65short, 1087, 20, 3215)) || lowerCase.contains(C0082.m325(f65short, 1107, 25, 3072)) || lowerCase.contains(C0093.m368(f65short, 1132, 21, 2236)) || lowerCase.contains(C0095.m379(f65short, 1153, 9, 1377)) || lowerCase.contains(C0142.m567(f65short, 1162, 8, 1211)) || lowerCase.contains(C0056.m223(f65short, 1170, 13, 2404)) || lowerCase.contains(C0126.m503(f65short, 1183, 13, 2070)) || lowerCase.contains(C0014.m54(f65short, 1196, 14, 1550)) || lowerCase.contains(C0055.m219(f65short, 1210, 15, 2321)) || str.contains(C0009.m33(f65short, 1225, 4, 1873)) || str.contains(C0087.m346(f65short, 1229, 5, 364)) || str.contains(C0112.m445(f65short, 1234, 4, 2388)) || str.contains(C0043.m169(f65short, 1238, 4, 2917));
    }

    public static boolean C(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains(C0030.m116(f65short, 1242, 1, 2750)) || lowerCase.contains(C0089.m355(f65short, 1243, 4, 1427)) || lowerCase.contains(C0026.m102(f65short, 1247, 9, 1942))) {
            return false;
        }
        return lowerCase.contains(C0126.m503(f65short, 1256, 6, 2784)) || lowerCase.contains(C0045.m177(f65short, 1262, 5, 2923));
    }

    public static boolean D(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            boolean z = cCharAt >= '0' && cCharAt <= '9';
            boolean z2 = cCharAt >= 'a' && cCharAt <= 'f';
            boolean z3 = cCharAt >= 'A' && cCharAt <= 'F';
            if (!z && !z2 && !z3) {
                return false;
            }
        }
        return true;
    }

    public static boolean E(String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase.contains(C0117.m467(f65short, 1267, 4, 2153)) || lowerCase.contains(C0014.m54(f65short, 1271, 10, 3181)) || lowerCase.contains(C0140.m558(f65short, 1281, 9, 1464));
    }

    public static boolean F(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                return true;
            }
            char cCharAt = str.charAt(i);
            boolean z2 = (cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z');
            boolean z3 = cCharAt >= '0' && cCharAt <= '9';
            if (!z2 && !z3 && cCharAt != '_' && cCharAt != '-' && cCharAt != '.' && cCharAt != '~') {
                return false;
            }
            i++;
        }
    }

    public static boolean G(int i, String str, Map map) {
        return i == 403 || z(map) || B(str);
    }

    public static String H(String str, String str2) {
        String strConcat = str2;
        if (strConcat == null) {
            strConcat = "";
        }
        if (strConcat.startsWith(C0050.m199(f65short, 1290, 7, 3147)) || strConcat.startsWith(C0028.m108(f65short, 1297, 8, 1469))) {
            return strConcat;
        }
        if (strConcat.startsWith(C0120.m477(f65short, 1305, 2, 2839))) {
            return C0021.m83(f65short, 1307, 6, 2810).concat(strConcat);
        }
        String strK = K(str);
        if (strK.isEmpty()) {
            return "";
        }
        boolean zIsEmpty = strConcat.isEmpty();
        String strM234 = C0059.m234(f65short, 1313, 1, 2144);
        if (zIsEmpty) {
            return strK.concat(strM234);
        }
        StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strK);
        if (!strConcat.startsWith(strM234)) {
            strConcat = strM234.concat(strConcat);
        }
        sbO.append(strConcat);
        return sbO.toString();
    }

    public static String I(String str, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        O(str, linkedHashMap);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2)) {
                    String[] strArrSplit = str2.split(C0106.m422(f65short, 1314, 1, 3123));
                    if (strArrSplit.length != 0) {
                        boolean z = false;
                        for (int i = 1; i < strArrSplit.length; i++) {
                            String strTrim = strArrSplit[i].trim();
                            String lowerCase = strTrim.toLowerCase(Locale.ROOT);
                            int iIndexOf = lowerCase.indexOf(61);
                            if (iIndexOf > 0) {
                                if (C0114.m454(f65short, 1315, 7, 2508).equals(lowerCase.substring(0, iIndexOf).trim())) {
                                    try {
                                        z = Long.parseLong(strTrim.substring(iIndexOf + 1).trim()) <= 0;
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (z) {
                                break;
                            }
                        }
                        String strTrim2 = strArrSplit[0].trim();
                        int iIndexOf2 = strTrim2.indexOf(61);
                        if (!z || iIndexOf2 <= 0) {
                            O(strTrim2, linkedHashMap);
                        } else {
                            linkedHashMap.remove(strTrim2.substring(0, iIndexOf2).trim());
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && entry.getValue() != null) {
                if (sb.length() > 0) {
                    sb.append(C0130.m516(f65short, 1322, 2, 1033));
                }
                sb.append((String) entry.getKey());
                sb.append('=');
                sb.append((String) entry.getValue());
            }
        }
        return sb.toString();
    }

    public static String K(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return "";
        }
        if (strTrim.startsWith(C0137.m545(f65short, 1324, 2, 532))) {
            strTrim = C0097.m386(f65short, 1326, 6, 2644).concat(strTrim);
        }
        if (!strTrim.startsWith(C0050.m199(f65short, 1332, 7, 2657))) {
            String strM1 = C0001.m1(f65short, 1339, 8, 2258);
            if (!strTrim.startsWith(strM1)) {
                strTrim = strM1.concat(strTrim);
            }
        }
        while (strTrim.endsWith(C0014.m54(f65short, 1347, 1, 423))) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
        }
        return strTrim;
    }

    public static PowChallenge L(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap map = new HashMap();
        Matcher matcher = B.matcher(str);
        while (matcher.find()) {
            map.put(matcher.group(1).toUpperCase(Locale.ROOT), matcher.group(3));
        }
        String strM31 = C0008.m31(f65short, 1348, 2, 356);
        String strS = s(strM31, "", map);
        String strM36 = C0010.m36(f65short, 1350, 3, 1324);
        String strS2 = s(strM36, "", map);
        String strM210 = C0053.m210(f65short, 1353, 4, 2807);
        String strS3 = s(strM210, "", map);
        String strS4 = s(C0050.m199(f65short, 1357, 4, 2526), C0055.m219(f65short, 1361, 4, 3270), map);
        String strS5 = s(C0125.m499(f65short, 1365, 3, 1284), C0044.m175(f65short, 1368, 9, 1751), map);
        if (map.containsKey(strM31) && map.containsKey(strM36) && map.containsKey(strM210) && F(strS, false) && F(strS2, false) && F(strS3, true) && D(strS3) && F(strS4, false) && F(strS5, false) && strS3.length() <= 64) {
            return new PowChallenge(strS, strS2, strS3.toLowerCase(Locale.ROOT), strS4, strS5);
        }
        return null;
    }

    public static ArrayList M(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (!str.isEmpty() && str.contains(C0120.m477(f65short, 1377, 9, 347)) && str.contains(C0014.m54(f65short, 1386, 9, 2226)) && str.contains(C0079.m314(f65short, 1395, 7, 3115))) {
                Matcher matcher = Pattern.compile(C0125.m499(f65short, 1402, 29, 1084)).matcher(str);
                String strGroup = matcher.find() ? matcher.group(1) : "";
                if (!strGroup.isEmpty()) {
                    Matcher matcher2 = Pattern.compile(C0003.m10(f65short, 1431, 32, 3260), 32).matcher(str);
                    Matcher matcher3 = Pattern.compile(C0130.m516(f65short, 1463, 41, 1900)).matcher(matcher2.find() ? matcher2.group(1) : str);
                    while (matcher3.find()) {
                        String strK = K(W(matcher3.group(1), strGroup));
                        if (C(strK)) {
                            k(strK, arrayList);
                        }
                    }
                }
                Matcher matcher4 = Pattern.compile(C0133.m529(f65short, 1504, 19, 330)).matcher(str);
                while (matcher4.find()) {
                    String strK2 = K(matcher4.group());
                    if (C(strK2)) {
                        k(strK2, arrayList);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static void O(String str, LinkedHashMap linkedHashMap) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strU0 = P1.u0(str);
        if (TextUtils.isEmpty(strU0)) {
            return;
        }
        for (String str2 : strU0.split(C0119.m473(f65short, 1523, 1, 2515))) {
            String strTrim = str2.trim();
            int iIndexOf = strTrim.indexOf(61);
            if (iIndexOf > 0) {
                String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                String strTrim3 = strTrim.substring(iIndexOf + 1).trim();
                if (!TextUtils.isEmpty(strTrim2)) {
                    String lowerCase = strTrim2.toLowerCase(Locale.ROOT);
                    if (!lowerCase.equals(C0089.m355(f65short, 1524, 4, 2839)) && !lowerCase.equals(C0114.m454(f65short, 1528, 6, 629)) && !lowerCase.equals(C0056.m223(f65short, 1534, 7, 941)) && !lowerCase.equals(C0082.m325(f65short, 1541, 7, 1045)) && !lowerCase.equals(C0137.m545(f65short, 1548, 8, 1194)) && !lowerCase.equals(C0095.m379(f65short, 1556, 6, 2407)) && !lowerCase.equals(C0070.m277(f65short, 1562, 8, 1193)) && !lowerCase.equals(C0049.m193(f65short, 1570, 8, 1456))) {
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

    public static String P(JSONObject jSONObject) {
        String strM402 = C0101.m402(f65short, 1578, 13, 2219);
        String strM390 = C0098.m390(f65short, 1591, 6, 1852);
        String[] strArr = {strM390, strM402, C0090.m358(f65short, 1597, 14, 651), C0076.m301(f65short, 1611, 13, 2229)};
        for (int i = 0; i < 4; i++) {
            String strU0 = P1.u0(jSONObject.optString(strArr[i], ""));
            if (!TextUtils.isEmpty(strU0)) {
                return strU0;
            }
        }
        String[] strArr2 = {C0087.m346(f65short, 1624, 7, 1206), C0125.m499(f65short, 1631, 6, 2649)};
        for (int i2 = 0; i2 < 2; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strArr2[i2]);
            if (jSONObjectOptJSONObject != null) {
                String strU1 = P1.u0(jSONObjectOptJSONObject.optString(C0125.m499(f65short, 1637, 6, 2591), jSONObjectOptJSONObject.optString(strM390, "")));
                if (!TextUtils.isEmpty(strU1)) {
                    return strU1;
                }
            }
        }
        return "";
    }

    public static void Q(HashMap map) {
        String strM83 = C0021.m83(f65short, 1643, 6, 2523);
        if (TextUtils.isEmpty(strM83)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            if (str != null && strM83.equalsIgnoreCase(str)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }

    public static String W(String str, String str2) {
        if (str != null && !str.isEmpty() && !str2.isEmpty()) {
            try {
                String[] strArrSplit = str.split(C0095.m379(f65short, 1649, 1, 3029));
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < strArrSplit.length; i++) {
                    sb.append((char) (Integer.parseInt(strArrSplit[i].trim()) ^ str2.charAt(i % str2.length())));
                }
                return sb.toString();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static void clearCookie() {
        boolean z = FishCrypto.a;
        C0297t1.b(C0011.m42(f65short, 1650, 13, 1516));
        C0297t1.b(C0081.m322(f65short, 1663, 14, 1522));
    }

    public static String getCurrentSiteUrl() {
        String strK = K(A);
        return TextUtils.isEmpty(strK) ? K(C0119.m473(f65short, 1677, 22, 1620)) : strK;
    }

    public static String getSavedCookie() {
        String strH;
        String strH2;
        String strH3;
        String strH4 = "";
        String strM360 = C0091.m360(f65short, 1699, 13, 2076);
        try {
            boolean z = FishCrypto.a;
            strH = C0297t1.h(strM360);
        } catch (Throwable unused) {
            strH = "";
        }
        String strU0 = P1.u0(strH);
        if (TextUtils.isEmpty(strU0)) {
            String strM427 = C0107.m427(f65short, 1712, 14, 1994);
            try {
                boolean z2 = FishCrypto.a;
                strH3 = C0297t1.h(strM427);
            } catch (Throwable unused2) {
                strH3 = "";
            }
            strU0 = P1.u0(strH3);
        }
        if (TextUtils.isEmpty(strU0)) {
            String strM368 = C0093.m368(f65short, 1726, 11, 2579);
            try {
                boolean z3 = FishCrypto.a;
                strH2 = C0297t1.h(strM368);
            } catch (Throwable unused3) {
                strH2 = "";
            }
            strU0 = o(strH2);
        }
        if (!TextUtils.isEmpty(strU0)) {
            return strU0;
        }
        String strM285 = C0072.m285(f65short, 1737, 10, 3238);
        try {
            boolean z4 = FishCrypto.a;
            strH4 = C0297t1.h(strM285);
        } catch (Throwable unused4) {
        }
        return o(strH4);
    }

    public static boolean hasSavedCookie() {
        return !TextUtils.isEmpty(getSavedCookie());
    }

    public static void k(String str, ArrayList arrayList) {
        String strK = K(str);
        if (strK.isEmpty() || arrayList.contains(strK)) {
            return;
        }
        arrayList.add(strK);
    }

    public static String m(String str) {
        String strValueOf;
        String str2;
        int i;
        PowChallenge powChallengeL = L(str);
        if (powChallengeL == null) {
            return "";
        }
        String str3 = powChallengeL.b;
        if (TextUtils.isEmpty(str3) || (str2 = powChallengeL.c) == null || str2.length() > 64 || !D(str2)) {
            strValueOf = "";
        } else {
            int iMin = Math.min(2100000, 2100000);
            long jMin = (Math.min(20000L, 20000L) * 1000000) + System.nanoTime();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(C0143.m570(f65short, 1747, 7, 3181));
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                int i2 = 0;
                while (true) {
                    if (i2 < iMin) {
                        byte[] bArrDigest = messageDigest.digest((str3 + i2).getBytes(C0011.m42(f65short, 1754, 5, 2454)));
                        if (!TextUtils.isEmpty(lowerCase)) {
                            if (bArrDigest != null && lowerCase.length() <= bArrDigest.length * 2) {
                                while (true) {
                                    if (i < lowerCase.length()) {
                                        int i3 = (bArrDigest[i / 2] >>> ((i & 1) == 0 ? (byte) 4 : (byte) 0)) & 15;
                                        int iDigit = Character.digit(lowerCase.charAt(i), 16);
                                        i = (iDigit >= 0 && i3 == iDigit) ? i + 1 : 0;
                                    }
                                }
                            }
                            if ((i2 & 1023) != 0 || System.nanoTime() < jMin) {
                                i2++;
                            }
                        }
                        strValueOf = String.valueOf(i2);
                    }
                    strValueOf = "";
                }
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(strValueOf)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(powChallengeL.e);
        sb.append(C0047.m186(f65short, 1759, 1, 380));
        sb.append(powChallengeL.a);
        String strM379 = C0095.m379(f65short, 1760, 1, 2123);
        sb.append(strM379);
        com.github.catvod.spider.merge.D.b.A(sb, powChallengeL.d, strM379, strValueOf, strM379);
        sb.append(str3);
        return sb.toString();
    }

    public static String o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String[] strArr = {C0092.m365(f65short, 1761, 13, 2651), C0053.m210(f65short, 1774, 6, 1946), C0006.m21(f65short, 1780, 6, 2389), C0011.m42(f65short, 1786, 14, 2006), C0091.m360(f65short, 1800, 13, 663)};
            for (int i = 0; i < 5; i++) {
                String strU0 = P1.u0(jSONObject.optString(strArr[i], ""));
                if (!TextUtils.isEmpty(strU0)) {
                    return strU0;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static String s(String str, String str2, HashMap map) {
        String str3 = (String) map.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3.trim();
    }

    public static void saveCookie(String str) {
        String strU0 = P1.u0(str);
        if (TextUtils.isEmpty(strU0)) {
            clearCookie();
        } else {
            boolean z = FishCrypto.a;
            C0297t1.j(C0028.m108(f65short, 1813, 13, 3178), strU0);
        }
    }

    public static boolean z(Map map) {
        if (map == null) {
            return false;
        }
        for (String str : map.keySet()) {
            if (str != null && C0008.m31(f65short, 1826, 15, 1495).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J(String str) {
        return this.y == 1 || G(0, str, null);
    }

    public String MD5(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(C0109.m432(f65short, 1841, 3, 1845)).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public final ArrayList N(ArrayList arrayList) {
        String strM516 = C0130.m516(f65short, 1844, 1, 2924);
        ArrayList arrayList2 = new ArrayList();
        ArrayList<String> arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strK = K((String) it.next());
            if (E(strK)) {
                k(strK, arrayList3);
            }
        }
        if (arrayList3.isEmpty()) {
            return arrayList2;
        }
        try {
            for (String str : arrayList3) {
                PageResponse pageResponseS = S(str + strM516, x(str + strM516));
                String str2 = pageResponseS.b;
                if (!G(pageResponseS.a, str2, pageResponseS.c)) {
                    ArrayList arrayListM = M(str2);
                    if (!arrayListM.isEmpty()) {
                        return arrayListM;
                    }
                }
            }
            return arrayList2;
        } catch (Exception unused) {
            return arrayList2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.github.catvod.spider.merge.T.Q] */
    /* JADX WARN: Type inference failed for: r6v1, types: [okhttp3.CookieJar] */
    /* JADX WARN: Type inference failed for: r6v2, types: [okhttp3.CookieJar] */
    /* JADX WARN: Type inference failed for: r6v3, types: [okhttp3.CookieJar] */
    public final PageResponse R(String str, HashMap map) {
        String str2;
        int size;
        String strM54 = C0014.m54(f65short, 1845, 6, 785);
        try {
            HashMap map2 = new HashMap();
            map2.putAll(map);
            if (!TextUtils.isEmpty(strM54)) {
                Iterator it = map2.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getKey() != null && strM54.equalsIgnoreCase((String) entry.getKey())) {
                            if (entry.getValue() != null) {
                                str2 = (String) entry.getValue();
                                break;
                            }
                        }
                    }
                    str2 = "";
                    break;
                }
            }
            str2 = "";
            break;
            Q(map2);
            String strQ = q(str, str2);
            U(str, strQ);
            HttpUrl httpUrl = HttpUrl.parse(str);
            boolean zIsEmpty = TextUtils.isEmpty(strQ);
            ?? r6 = this.r;
            if (!zIsEmpty && httpUrl != null) {
                int size2 = r6.loadForRequest(httpUrl).size();
                if (TextUtils.isEmpty(strQ)) {
                    size = 0;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    O(strQ, linkedHashMap);
                    size = linkedHashMap.size();
                }
                if (size2 < size) {
                    map2.put(strM54, strQ);
                    r6 = CookieJar.NO_COOKIES;
                }
            } else if (!TextUtils.isEmpty(strQ)) {
                map2.put(strM54, strQ);
                r6 = CookieJar.NO_COOKIES;
            }
            N nY = X1.y(str, null, map2, r6);
            PageResponse pageResponse = new PageResponse(nY.a, nY.a(), (Map) nY.c);
            h(pageResponse);
            return pageResponse;
        } catch (Exception unused) {
            return new PageResponse(500, "", null);
        }
    }

    public final PageResponse S(String str, HashMap map) {
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            return new PageResponse(500, "", null);
        }
        synchronized (this.t) {
            try {
                PageResponse pageResponseR = R(str, map);
                V(pageResponseR);
                int i = pageResponseR.a;
                Map map2 = pageResponseR.c;
                String str2 = pageResponseR.b;
                if (!G(i, str2, map2) || L(str2) == null) {
                    return pageResponseR;
                }
                String strM = m(pageResponseR.b);
                if (TextUtils.isEmpty(strM)) {
                    return pageResponseR;
                }
                synchronized (this.s) {
                    this.w = I(this.w, Collections.singletonList(strM));
                }
                PageResponse pageResponseR2 = R(str, map);
                V(pageResponseR2);
                String strTrim = "";
                if (!TextUtils.isEmpty(strM) && (iIndexOf = strM.indexOf(61)) > 0) {
                    strTrim = strM.substring(0, iIndexOf).trim();
                }
                if (!TextUtils.isEmpty(strTrim)) {
                    synchronized (this.s) {
                        this.w = I(this.w, Collections.singletonList(strTrim + C0117.m467(f65short, 1851, 12, 2904)));
                    }
                    T();
                }
                return pageResponseR2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T() {
        ArrayList arrayList;
        synchronized (this.t) {
            try {
                this.r.a();
                String strP = p();
                if (!TextUtils.isEmpty(strP) && (arrayList = this.u) != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String strK = K((String) it.next());
                        if (!strK.isEmpty()) {
                            this.r.b(strK + C0070.m277(f65short, 1863, 1, 1002), strP);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        synchronized (this.t) {
            try {
                this.r.a();
                ArrayList arrayList = this.u;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String strK = K((String) it.next());
                        if (!strK.isEmpty()) {
                            this.r.b(strK + C0130.m516(f65short, 1864, 1, 709), str2);
                        }
                    }
                }
                this.r.b(str, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void V(PageResponse pageResponse) {
        if (G(pageResponse.a, pageResponse.b, pageResponse.c)) {
            this.y = 1;
            this.z = C0092.m365(f65short, 1865, 11, 2299);
            return;
        }
        int i = pageResponse.a;
        if (i < 200 || i >= 400 || TextUtils.isEmpty(pageResponse.b)) {
            return;
        }
        this.y = 2;
        this.z = "";
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0044.m175(f65short, 1876, 6, 1025));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0104.m414(f65short, 1882, 15, 2860));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0087.m346(f65short, 1897, 13, 901));
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

    public final void h(PageResponse pageResponse) {
        Map map = pageResponse.c;
        String strM31 = C0008.m31(f65short, 1910, 10, 3073);
        ArrayList arrayList = new ArrayList();
        if (map != null && !TextUtils.isEmpty(strM31)) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() != null && strM31.equalsIgnoreCase((String) entry.getKey()) && entry.getValue() != null) {
                    arrayList.addAll((Collection) entry.getValue());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (this.s) {
            this.w = I(this.w, arrayList);
        }
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0056.m223(f65short, 1920, 11, 584));
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

    public final void i(String str, ArrayList arrayList) {
        String strK = K(str);
        if (strK.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        k(strK, arrayList2);
        ArrayList arrayListN = N(arrayList2);
        if (arrayListN.isEmpty()) {
            if (E(strK)) {
                return;
            }
            k(strK, arrayList);
        } else {
            Iterator it = arrayListN.iterator();
            while (it.hasNext()) {
                k((String) it.next(), arrayList);
            }
        }
    }

    @Override // com.github.catvod.spider.Cloud
    public synchronized void init(Context context, String str) {
        try {
            super.init(context, str);
            this.v = "";
            this.r.a();
            this.x = "";
            this.y = 0;
            this.z = "";
            String strTrim = str == null ? "" : str.trim();
            try {
                String strG = FishCrypto.g(strTrim);
                if (!TextUtils.isEmpty(strG)) {
                    strTrim = strG.trim();
                }
            } catch (Throwable unused) {
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = new JSONObject(strTrim);
            } catch (Exception unused2) {
            }
            String strP = P(jSONObject);
            if (TextUtils.isEmpty(strP) && !strTrim.startsWith(C0082.m325(f65short, 1931, 1, 2767))) {
                String strU0 = P1.u0(strTrim);
                if (!strTrim.startsWith(C0026.m102(f65short, 1932, 4, 3030)) && A(strU0)) {
                    strP = strU0;
                }
            }
            String savedCookie = getSavedCookie();
            if (TextUtils.isEmpty(strP)) {
                strP = savedCookie;
            }
            this.w = strP;
            ArrayList arrayList = new ArrayList();
            try {
                j(arrayList, jSONObject.opt(C0053.m210(f65short, 1936, 4, 687)));
                j(arrayList, jSONObject.opt(C0050.m199(f65short, 1940, 4, 1526)));
                j(arrayList, jSONObject.opt(C0087.m346(f65short, 1944, 7, 635)));
                j(arrayList, jSONObject.opt(C0074.m292(f65short, 1951, 7, 725)));
                j(arrayList, jSONObject.opt(C0008.m31(f65short, 1958, 5, 1039)));
            } catch (Exception unused3) {
                i(strTrim, arrayList);
            }
            if (arrayList.isEmpty() && strTrim.startsWith(C0044.m175(f65short, 1963, 4, 2731))) {
                i(strTrim, arrayList);
            }
            if (arrayList.isEmpty()) {
                arrayList.add(C0063.m249(f65short, 1967, 22, 1546));
            }
            this.u = new ArrayList(arrayList);
            T();
            ArrayList arrayListV = v(arrayList);
            if (!arrayListV.isEmpty()) {
                this.u = arrayListV;
            }
            C0257g c0257gB = AbstractC0260h.b(C0117.m467(f65short, 1989, 6, 1361), this.u, true);
            this.v = this.u.isEmpty() ? K(C0090.m358(f65short, 1995, 22, 2737)) : (String) this.u.get(0);
            if (!TextUtils.isEmpty(c0257gB.b())) {
                String strK = K(c0257gB.b());
                if (!strK.isEmpty() && this.u.contains(strK)) {
                    this.v = strK;
                }
            }
            A = this.v;
            T();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j(ArrayList arrayList, Object obj) {
        if (obj == null || obj == JSONObject.NULL) {
            return;
        }
        if (!(obj instanceof JSONArray)) {
            i(String.valueOf(obj), arrayList);
            return;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String strK = K(jSONArray.optString(i, ""));
            if (!strK.isEmpty()) {
                if (E(strK)) {
                    k(strK, arrayList3);
                } else {
                    i(strK, arrayList2);
                }
            }
        }
        ArrayList arrayListN = N(arrayList3);
        if (arrayListN.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                k((String) it.next(), arrayList);
            }
        } else {
            Iterator it2 = arrayListN.iterator();
            while (it2.hasNext()) {
                k((String) it2.next(), arrayList);
            }
        }
    }

    public final void l(com.github.catvod.spider.merge.f0.g gVar, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : gVar.Q(C0109.m432(f65short, 2017, 105, 2916))) {
            String strM414 = C0104.m414(f65short, 2122, 13, 1518);
            try {
                String strC = kVar.c(C0030.m116(f65short, 2135, 4, 2530));
                Pattern patternCompile = Pattern.compile(C0049.m193(f65short, 2139, 17, 1318));
                if (strC == null) {
                    strC = "";
                }
                Matcher matcher = patternCompile.matcher(strC);
                String strReplace = matcher.find() ? matcher.group(1).replace(C0028.m108(f65short, 2156, 5, 2848), "") : "";
                String strTrim = kVar.c(C0128.m511(f65short, 2161, 5, 2661)).trim();
                if (strTrim.isEmpty()) {
                    strTrim = kVar.T().trim();
                }
                if (!strReplace.isEmpty() && !strTrim.isEmpty() && linkedHashSet.add(strReplace)) {
                    String strC2 = kVar.c(strM414);
                    boolean zIsEmpty = strC2.isEmpty();
                    String strM379 = C0095.m379(f65short, 2166, 8, 2797);
                    if (zIsEmpty) {
                        strC2 = kVar.c(strM379);
                    }
                    boolean zIsEmpty2 = strC2.isEmpty();
                    String strM322 = C0081.m322(f65short, 2174, 3, 2818);
                    if (zIsEmpty2) {
                        strC2 = kVar.c(strM322);
                    }
                    boolean zIsEmpty3 = strC2.isEmpty();
                    String strM499 = C0125.m499(f65short, 2177, 19, 2932);
                    String strM21 = C0006.m21(f65short, 2196, 5, 2492);
                    if (zIsEmpty3) {
                        String strC3 = kVar.c(strM21);
                        Pattern patternCompile2 = Pattern.compile(strM499);
                        if (strC3 == null) {
                            strC3 = "";
                        }
                        Matcher matcher2 = patternCompile2.matcher(strC3);
                        strC2 = matcher2.find() ? matcher2.group(1) : "";
                    }
                    k kVarR = kVar.R(C0119.m473(f65short, 2201, 3, 3226));
                    if (kVarR != null && strC2.isEmpty()) {
                        strC2 = kVarR.c(strM414);
                    }
                    if (kVarR != null && strC2.isEmpty()) {
                        strC2 = kVarR.c(strM379);
                    }
                    if (kVarR != null && strC2.isEmpty()) {
                        strC2 = kVarR.c(strM322);
                    }
                    if (kVarR != null && strC2.isEmpty()) {
                        String strC4 = kVarR.c(strM21);
                        Pattern patternCompile3 = Pattern.compile(strM499);
                        if (strC4 == null) {
                            strC4 = "";
                        }
                        Matcher matcher3 = patternCompile3.matcher(strC4);
                        strC2 = matcher3.find() ? matcher3.group(1) : "";
                    }
                    arrayList.add(new com.github.catvod.spider.merge.p001b.k(strReplace, strTrim, w(strC2)));
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String n() {
        ArrayList arrayList = new ArrayList();
        String strY0 = AbstractC0302v0.y0();
        String strM223 = (A(this.w) || hasSavedCookie()) ? C0056.m223(f65short, 2213, 9, 1766) : C0093.m368(f65short, 2204, 9, 468);
        String strM459 = TextUtils.isEmpty(this.z) ? C0115.m459(f65short, 2222, 11, 1392) : this.z;
        StringBuilder sb = new StringBuilder();
        sb.append(strM459);
        String strM102 = C0026.m102(f65short, 2233, 3, 1400);
        sb.append(strM102);
        sb.append(strM223);
        sb.append(strM102);
        sb.append(r());
        arrayList.add(new com.github.catvod.spider.merge.p001b.k(C0074.m292(f65short, 2236, 13, 1702), C0028.m108(f65short, 2249, 16, 2972), strY0, sb.toString(), C0081.m322(f65short, 2265, 13, 446)));
        arrayList.add(new com.github.catvod.spider.merge.p001b.k(C0098.m390(f65short, 2278, 18, 1912), C0114.m454(f65short, 2296, 10, 2977), AbstractC0302v0.a0(), C0139.m554(f65short, 2306, 15, 1747), C0053.m210(f65short, 2321, 18, 1970)));
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.F(arrayList);
        gVar.o(1, 1, arrayList.size(), arrayList.size());
        return gVar.r();
    }

    public final String p() {
        String strU0;
        String strM511 = C0128.m511(f65short, 2339, 14, 2476);
        synchronized (this.s) {
            try {
                strU0 = P1.u0(this.w);
                if (!TextUtils.isEmpty(this.x)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(strM511 + this.x);
                    strU0 = I(strU0, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strU0;
    }

    @Override // com.github.catvod.spider.Cloud
    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0021.m83(f65short, 2353, 13, 2842));
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

    public final String q(String str, String str2) {
        String str3 = str;
        String strP = p();
        if (TextUtils.isEmpty(strP) && !TextUtils.isEmpty(str2)) {
            strP = I(strP, Collections.singletonList(str2));
        }
        if (str3 == null) {
            str3 = "";
        }
        HttpUrl httpUrl = HttpUrl.parse(str3);
        if (httpUrl == null) {
            return strP;
        }
        List<Cookie> listLoadForRequest = this.r.loadForRequest(httpUrl);
        String strU0 = P1.u0(strP);
        if (listLoadForRequest != null) {
            for (Cookie cookie : listLoadForRequest) {
                if (cookie != null) {
                    strU0 = I(strU0, Collections.singletonList(cookie.name() + C0056.m223(f65short, 2366, 1, 1526) + cookie.value()));
                }
            }
        }
        return strU0;
    }

    public final String r() {
        String strK = K(this.v);
        if (!strK.isEmpty()) {
            return strK;
        }
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String strK2 = K((String) it.next());
                if (!strK2.isEmpty()) {
                    return strK2;
                }
            }
        }
        return K(C0010.m36(f65short, 2367, 22, 965));
    }

    public String searchContent(String str, boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0125.m499(f65short, 2389, 13, 2462));
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

    public final String t(String str, HashMap map) {
        String strValueOf;
        String str2 = u(str, map).b;
        if (str2 == null || !str2.contains(C0096.m382(f65short, 2402, 15, 3214)) || !str2.contains(C0049.m193(f65short, 2417, 13, 3262))) {
            return str2;
        }
        String strOptString = "";
        try {
            Matcher matcher = Pattern.compile(C0017.m65(f65short, 2430, 22, 879)).matcher(str2);
            String strGroup = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = Pattern.compile(C0003.m10(f65short, 2452, 19, 1789)).matcher(str2);
            String strGroup2 = matcher2.find() ? matcher2.group(1) : "";
            Matcher matcher3 = Pattern.compile(C0059.m234(f65short, 2471, 21, 2265)).matcher(str2);
            String strGroup3 = matcher3.find() ? matcher3.group(1) : "";
            Matcher matcher4 = Pattern.compile(C0081.m322(f65short, 2492, 21, 2091)).matcher(str2);
            String strGroup4 = matcher4.find() ? matcher4.group(1) : "";
            if (!strGroup.isEmpty() && !strGroup2.isEmpty()) {
                MessageDigest messageDigest = MessageDigest.getInstance(C0026.m102(f65short, 2513, 3, 2552));
                int i = 100000;
                while (true) {
                    if (i > 999999) {
                        strValueOf = "";
                        break;
                    }
                    messageDigest.reset();
                    byte[] bArrDigest = messageDigest.digest((strGroup + i).getBytes());
                    StringBuilder sb = new StringBuilder(32);
                    for (byte b : bArrDigest) {
                        int i2 = b & 255;
                        if (i2 < 16) {
                            sb.append('0');
                        }
                        sb.append(Integer.toHexString(i2));
                    }
                    if (sb.toString().equals(strGroup2)) {
                        strValueOf = String.valueOf(i);
                        break;
                    }
                    i++;
                }
                if (!strValueOf.isEmpty()) {
                    HashMap map2 = new HashMap();
                    map2.put(C0093.m368(f65short, 2516, 8, 1242), strGroup3);
                    map2.put(C0096.m382(f65short, 2524, 8, 637), strGroup4);
                    map2.put(C0081.m322(f65short, 2532, 9, 3177), strGroup);
                    map2.put(C0056.m223(f65short, 2541, 6, 2620), strGroup2);
                    map2.put(C0079.m314(f65short, 2547, 4, 2664), strValueOf);
                    strOptString = new JSONObject(X1.N(C0140.m558(f65short, 2551, 45, 1968), map2, null).a()).optString(C0055.m219(f65short, 2596, 8, 2514), "");
                }
            }
        } catch (Exception unused) {
        }
        if (strOptString.isEmpty()) {
            return str2;
        }
        this.x = strOptString;
        String str3 = (String) map.get(C0003.m10(f65short, 2604, 7, 1718));
        return u(str, str3 != null ? x(str3) : y()).b;
    }

    public final PageResponse u(String str, HashMap map) {
        if (str != null && (str.startsWith(C0063.m249(f65short, 2611, 7, 2718)) || str.startsWith(C0098.m390(f65short, 2618, 8, 3115)))) {
            return S(str, map);
        }
        ArrayList<String> arrayList = new ArrayList();
        k(this.v, arrayList);
        ArrayList arrayList2 = this.u;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                k((String) it.next(), arrayList);
            }
        }
        if (arrayList.isEmpty()) {
            k(r(), arrayList);
        }
        PageResponse pageResponse = null;
        for (String str2 : arrayList) {
            String strH = H(str2, str);
            HashMap map2 = new HashMap();
            map2.putAll(map);
            String strM459 = C0115.m459(f65short, 2626, 7, 357);
            if (!map2.containsKey(strM459)) {
                map2.put(strM459, str2 + C0126.m503(f65short, 2633, 1, 1248));
            }
            PageResponse pageResponseS = S(strH, map2);
            int i = pageResponseS.a;
            if (i >= 200 && i < 400) {
                String str3 = pageResponseS.b;
                if (!TextUtils.isEmpty(str3) && !G(i, str3, pageResponseS.c)) {
                    this.v = K(str2);
                    A = this.v;
                    return pageResponseS;
                }
            }
            if (pageResponse != null) {
                int i2 = pageResponseS.a;
                Map map3 = pageResponseS.c;
                String str4 = pageResponseS.b;
                boolean zG = G(i2, str4, map3);
                int i3 = pageResponse.a;
                Map map4 = pageResponse.c;
                String str5 = pageResponse.b;
                if (zG == G(i3, str5, map4)) {
                    zG = TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str4);
                }
                if (zG) {
                }
            }
            pageResponse = pageResponseS;
        }
        return pageResponse == null ? new PageResponse(500, "", null) : pageResponse;
    }

    public final ArrayList v(ArrayList arrayList) {
        String strM360 = C0091.m360(f65short, 2634, 1, 2707);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strK = K((String) it.next());
            if (!strK.isEmpty()) {
                try {
                    PageResponse pageResponseS = S(strK + strM360, x(strK + strM360));
                    int i = pageResponseS.a;
                    Map map = pageResponseS.c;
                    String str = pageResponseS.b;
                    if (z(map) || B(str) || (i >= 200 && i < 400 && str != null && str.contains(C0116.m463(f65short, 2635, 12, 1583)) && str.contains(C0093.m368(f65short, 2647, 8, 617)))) {
                        k(strK, arrayList2);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return arrayList2;
    }

    public final String w(String str) {
        String strConcat = str;
        if (strConcat == null || strConcat.isEmpty()) {
            return "";
        }
        if (strConcat.startsWith(C0125.m499(f65short, 2655, 5, 1686)) || strConcat.startsWith(C0032.m126(f65short, 2660, 4, 2481))) {
            return strConcat;
        }
        if (strConcat.startsWith(C0009.m33(f65short, 2664, 2, 3064))) {
            return C0125.m499(f65short, 2666, 6, 2341).concat(strConcat);
        }
        StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(r());
        String strM36 = C0010.m36(f65short, 2672, 1, 1832);
        if (!strConcat.startsWith(strM36)) {
            strConcat = strM36.concat(strConcat);
        }
        sbO.append(strConcat);
        return sbO.toString();
    }

    public final HashMap x(String str) {
        HashMap mapY = y();
        if (!TextUtils.isEmpty(str)) {
            mapY.put(C0105.m416(f65short, 2673, 7, 2837), str);
            Q(mapY);
            String strQ = q(str, "");
            if (!TextUtils.isEmpty(strQ)) {
                mapY.put(C0021.m83(f65short, 2680, 6, 2124), strQ);
            }
        }
        return mapY;
    }

    public final HashMap y() {
        HashMap mapT = com.github.catvod.spider.merge.D.b.t(C0043.m169(f65short, 2686, 10, 2090), C0133.m529(f65short, 2696, 117, 1193), C0125.m499(f65short, 2813, 6, 355), C0105.m416(f65short, 2819, 63, 2413));
        mapT.put(C0017.m65(f65short, 2882, 15, 2192), C0137.m545(f65short, 2897, 23, 3044));
        String strQ = q(r().concat(C0082.m325(f65short, 2920, 1, 1374)), "");
        if (!TextUtils.isEmpty(strQ)) {
            mapT.put(C0091.m360(f65short, 2921, 6, 507), strQ);
        }
        return mapT;
    }
}

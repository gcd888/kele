package com.github.catvod.spider;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0294s1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
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
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p011m.C0103;
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
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class App88 extends Spider {
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public JSONObject e = new JSONObject();

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f7short = {1458, 2183, 2176, 2178, 2186, 2134, 2137, 2132, 2118, 2118, 2128, 2118, 1053, 1040, 1315, 1324, 1312, 1320, 1491, 1494, 1484, 1483, 1383, 1384, 1389, 1397, 1380, 1395, 1394, 643, 704, 670, 728, 661, 1361, 1366, 1364, 1372, 1382, 1359, 1360, 1373, 1372, 1366, 2594, 2599, 2621, 2618, 2601, 2599, 2619, 1245, 1228, 1226, 1224, 2122, 2140, 2136, 2123, 2138, 2129, 2888, 2885, 1478, 1498, 1495, 1487, 922, 925, 899, 2309, 2426, 2405, 2354, 2363, 2322, 2428, 2312, 2360, 2307, 2355, 2354, 2355, 2431, 2329, 2312, 2431, 2339, 2426, 2355, 2314, 2418, 2367, 2337, 2428, 2333, 2318, 2338, 2431, 2351, 2343, 2308, 2304, 2425, 2339, 2309, 2418, 2341, 2335, 2430, 2336, 2338, 2360, 2428, 2323, 2310, 2419, 2343, 2363, 2318, 2426, 2319, 2306, 2426, 2428, 2317, 2354, 2336, 2321, 2363, 2343, 2341, 2306, 2419, 2322, 2314, 2350, 2428, 2308, 2321, 2425, 2311, 2349, 2331, 2318, 2342, 2346, 2319, 2310, 2350, 2328, 2346, 2366, 2419, 2354, 2343, 2313, 2335, 2314, 2422, 2422, 2952, 2949, 2945, 2948, 2949, 2962, 2963, 707, 669, 731, 662, 704, 643, 733, 667, 726, 437, 388, 388, 460, 460, 468, 406, 390, 413, 400, 403, 401, 468, 388, 408, 405, 397, 468, 417, 422, 440, 468, 413, 391, 468, 413, 410, 386, 405, 408, 413, 400, 3246, 3235, 2206, 2207, 2190, 2203, 2195, 2198, 3051, 3058, 3065, 3272, 3284, 3278, 3273, 3288, 3294, 3272, 1179, 1166, 1175, 1165, 1169, 1178, 1179, 1165, 651, 644, 648, 640, 1764, 1784, 1781, 1773, 1739, 1789, 1776, 30885, -26861, 1247, 31849, -28871, 958, 1213, 1213, 1213, 1235, 1230, 1219, 453, 468, 466, 464, 851, 846, 834, 851, 856, 850, 1984, 1986, 2007, 1990, 1988, 1996, 2001, 2010, 1116, 1101, 1101, 1105, 1108, 1118, 1116, 1097, 1108, 1106, 1107, 1042, 1111, 1102, 1106, 1107, 1030, 1053, 1118, 1109, 1116, 1103, 1102, 1112, 1097, 1024, 1096, 1097, 1115, 1040, 1029, 1850, 1848, 1838, 1826, 1841, 1826, 1844, 1852, 1854, 1849, 1840, 2378, 2357, 2346, 2415, 2384, 2347, 2407, 2420, 2400, 2368, 2421, 2408, 2382, 2351, 2414, 2383, 2385, 2356, 2370, 2413, 2414, 2374, 2397, 2356, 2412, 2430, 2417, 2413, 2420, 2386, 2359, 2371, 2391, 2365, 2351, 2375, 2357, 2397, 2409, 2386, 2370, 2422, 2389, 2357, 2374, 2347, 2376, 2380, 2421, 2422, 2413, 2379, 2386, 2406, 2369, 2376, 2428, 2407, 2356, 2354, 2389, 2398, 2359, 2376, 2409, 2355, 2375, 2364, 2406, 2418, 2377, 2417, 2384, 2430, 2409, 2370, 2421, 2403, 2368, 2419, 2402, 2357, 2412, 2354, 2411, 2409, 2412, 2356, 2418, 2383, 2409, 2418, 2352, 2396, 2391, 2382, 2378, 2422, 2387, 2415, 2365, 2402, 2376, 2429, 2377, 2369, 2374, 2391, 2375, 2385, 2361, 556, 595, 588, 567, 531, 552, 595, 563, 534, 566, 512, 512, 589, 548, 560, 548, 529, 565, 527, 556, 597, 599, 544, 595, 585, 515, 564, 512, 598, 513, 550, 563, 562, 557, 512, 562, 570, 589, 602, 524, 554, 568, 595, 553, 518, 528, 568, 559, 549, 593, 534, 551, 526, 525, 518, 597, 525, 532, 531, 517, 520, 589, 562, 558, 570, 593, 545, 568, 597, 603, 564, 519, 594, 552, 533, 517, 518, 531, 513, 516, 521, 548, 523, 547, 570, 530, 554, 570, 594, 512, 521, 515, 527, 535, 553, 561, 585, 517, 527, 556, 515, 568, 571, 538, 603, 517, 552, 603, 592, 602, 607, 563, 514, 514, 586, 586, 594, 528, 512, 539, 534, 533, 535, 594, 512, 535, 513, 514, 541, 540, 513, 535, 594, 534, 535, 529, 512, 523, 514, 518, 539, 541, 540, 594, 532, 531, 539, 542, 535, 534, 1162, 1211, 1211, 1267, 1267, 1259, 1193, 1209, 1186, 1199, 1196, 1198, 1259, 1209, 1198, 1208, 1211, 1188, 1189, 1208, 1198, 1259, 1198, 1189, 1213, 1198, 1191, 1188, 1211, 1198, 1259, 1186, 1208, 1259, 1186, 1189, 1213, 1194, 1191, 1186, 1199, 2799, 2782, 2782, 2710, 2710, 2702, 2764, 2780, 2759, 2762, 2761, 2763, 2702, 2780, 2763, 2778, 2779, 2780, 2752, 2763, 2762, 2702, 2752, 2753, 2702, 2780, 2763, 2781, 2782, 2753, 2752, 2781, 2763, 1890, 2410, 2416, 2413, 2428, 1360, 1352, 1360, 908, 907, 917, 2816, 2833, 2824, 2527, 2499, 2510, 2518, 2497, 2510, 2498, 2506, 2162, 2146, 2169, 2164, 2167, 2165, 390, 407, 407, 479, 479, 866, 845, 839, 849, 844, 842, 839, 1415, 1431, 1436, 1425, 1433, 1429, 2133, 2133, 2121, 2116, 2888, 2885, 2888, 3184, 3173, 3175, 3117, 2288, 2303, 2293, 2275, 2302, 2296, 2293, 2264, 2293, 2889, 2904, 2895, 2891, 2910, 2895, 2894, 2923, 2910, 1761, 1764, 1776, 1781, 1760, 1777, 1776, 1749, 1760, 1880, 1879, 1883, 1875, 1700, 1702, 1709, 1708, 1701, 1176, 1175, 1181, 1163, 1174, 1168, 1181, 2908, 2909, 2894, 2897, 2907, 2909, 1086, 1070, 1085, 1074, 1080, 1328, 1340, 1331, 1320, 1339, 1340, 1342, 1321, 1320, 1327, 1336, 1327, 2808, 2810, 2791, 2796, 2813, 2795, 2812, 2506, 2499, 2512, 2502, 2517, 2499, 2512, 2503, 511, 484, 481, 484, 485, 509, 484, 3142, 3147, 3147, 3152, 3144, 3147, 3141, 3136, 3137, 3158, 1349, 1362, 1371, 1362, 1366, 1348, 1362, 1306, 1372, 1362, 1358, 1348, 720, 733, 711, 708, 728, 725, 717, 1044, 1043, 1039, 1032, 2118, 2131, 2133, 2113, 2239, 2233, 2223, 2232, 769, 780, 773, 784, 2121, 2118, 2124, 2138, 2119, 2113, 2124, 2055, 2141, 2118, 2115, 2118, 2119, 2143, 2118, 2055, 2141, 2118, 2115, 2118, 2119, 2143, 2118, 2066, 2141, 2139, 2125, 2138, 2055, 2138, 2125, 2116, 2125, 2121, 2139, 2125, 2053, 2115, 2125, 2129, 2139, 1260, 1251, 1252, 1261, 1263, 1272, 2624, 2643, 2628, 2629, 2655, 2649, 2648, 3253, 3234, 3245, 3215, 3240, 3250, 3106, 3104, 3115, 3104, 3127, 3116, 3110, 3034, 3026, 3018, 3027, 3038, 3019, 3024, 3021, 1773, 1765, 1765, 1773, 1766, 1775, 1749, 1785, 1774, 1761, 1727, 1704, 1703, 2357, 2351, 2316, 2356, 2341, 2351, 2357, 2367, 2365, 2352, 2328, 2361, 2346, 2357, 2367, 2361, 1083, 1068, 1061, 1068, 1064, 1082, 1068, 486, 452, 465, 450, 455, 455, 458, 388, 414, 389, 411, 395, 387, 487, 450, 453, 478, 467, 400, 395, 490, 453, 463, 473, 452, 450, 463, 395, 2742, 2733, 1856, 1826, 1813, 1801, 1804, 1796, 1871, 1604, 1613, 1580, 1565, 1565, 1537, 1544, 1594, 1544, 
    1551, 1574, 1540, 1561, 1602, 1624, 1630, 1626, 1603, 1630, 1627, 1613, 1582, 1541, 1567, 1538, 1536, 1544, 1602, 1628, 1631, 1631, 1603, 1629, 1613, 1568, 1538, 1551, 1540, 1537, 1544, 1613, 1598, 1548, 1547, 1548, 1567, 1540, 1602, 1624, 1630, 1626, 1603, 1630, 1627, 3262, 3256, 3246, 3257, 3210, 3244, 3246, 3237, 3263, 2588, 2585, 2563, 2564, 1502, 1487, 1481, 1483, 1234, 1219, 1221, 1223, 1233, 2343, 2358, 2352, 2354, 2356, 2360, 2338, 2361, 2339, 2719, 2714, 2718, 2714, 2695, 2349, 2358, 2349, 2360, 2357, 1024, 1037, 566, 569, 565, 573, 2549, 2540, 2534, 759, 736, 744, 740, 759, 750, 758, 3060, 3048, 3052, 3071, 1890, 1905, 1894, 1890, 930, 928, 951, 940, 945, 2992, 3005, 2982, 2993, 2999, 2976, 3003, 2982, 2113, 2126, 2115, 2129, 2129, 1110, 1115, 1106, 1095, 2789, 2795, 2802, 2805, 2789, 2403, 2415, 2414, 2420, 2405, 2414, 2420, 1096, 1093, 2478, 2465, 2477, 2469, 1253, 1196, 1206, 1253, 1201, 1194, 1194, 1253, 1193, 1188, 1207, 1186, 1184, 2946, 2995, 2995, 3067, 3067, 3043, 2249, 2241, 2256, 2252, 2251, 2240, 454, 452, 469, 2401, 2430, 2402, 2405, 2912, 2897, 2897, 2841, 2841, 2817, 2883, 2899, 2888, 2885, 2886, 2884, 2817, 2901, 2880, 2899, 2886, 2884, 2901, 2817, 2892, 2884, 2901, 2889, 2894, 2885, 2817, 2888, 2898, 2817, 2895, 2894, 2901, 2817, 2880, 2893, 2893, 2894, 2902, 2884, 2885, 1277, 1274, 1252, 1952, 2019, 1981, 2043, 1974, 460, 399, 402, 470, 1762, 1720, 1727, 1630, 1565, 1604, 1539, 2079, 2140, 2113, 2133, 1597, 1650, 1650, 1648, 1222, 1155, 1165, 1169, 2303, 2290, 2294, 2291, 2290, 2277, 2276, 2601, 2597, 2596, 2622, 2607, 2596, 2622, 2663, 2622, 2611, 2618, 2607, 3298, 3283, 3283, 3227, 3227, 3203, 3265, 3281, 3274, 3271, 3268, 3270, 3203, 3281, 3270, 3282, 3286, 3270, 3280, 3287, 3203, 3275, 3270, 3266, 3271, 3270, 3281, 3203, 3274, 3280, 3203, 3274, 3277, 3285, 3266, 3279, 3274, 3271, 1995, 2042, 2042, 1970, 1970, 1962, 2024, 2040, 2019, 2030, 2029, 2031, 1962, 2040, 2031, 2043, 2047, 2031, 2041, 2046, 1962, 2018, 2031, 2027, 2030, 2031, 2040, 2041, 1962, 2027, 2040, 2031, 1962, 2046, 2021, 2021, 1962, 2022, 2027, 2040, 2029, 2031, 1651, 1662, 1653, 1640, 1614, 1651, 1575, 1573, 2971, 2986, 2986, 3042, 3042, 3066, 3000, 2984, 2995, 3006, 3005, 3007, 3066, 2973, 2975, 2958, 3066, 2984, 3007, 2987, 2991, 3007, 2985, 2990, 3066, 3001, 2997, 2996, 2990, 3003, 2995, 2996, 2985, 3066, 3003, 3066, 3000, 2997, 3006, 2979, 772, 821, 821, 893, 893, 869, 807, 823, 812, 801, 802, 800, 869, 823, 800, 820, 816, 800, 822, 817, 869, 807, 810, 801, 828, 869, 812, 822, 869, 817, 810, 810, 869, 809, 804, 823, 802, 800, 681, 700, 687, 698, 696, 681, 765, 687, 696, 686, 685, 690, 691, 686, 696, 555, 538, 538, 594, 594, 586, 520, 536, 515, 526, 525, 527, 586, 536, 527, 539, 543, 527, 537, 542, 586, 520, 517, 526, 531, 586, 515, 537, 586, 515, 516, 540, 523, 518, 515, 526, 809, 792, 792, 848, 848, 840, 778, 794, 769, 780, 783, 781, 840, 796, 777, 794, 783, 781, 796, 840, 829, 826, 804, 840, 769, 795, 840, 769, 774, 798, 777, 772, 769, 780, 1960, 1956, 1077, 1028, 1028, 1100, 1100, 1108, 1046, 1030, 1053, 1040, 1043, 1041, 1108, 1030, 1041, 1031, 1028, 1051, 1050, 1031, 1041, 1108, 1052, 1041, 1045, 1040, 1041, 1030, 1031, 1108, 1045, 1030, 1041, 1108, 1024, 1051, 1051, 1108, 1048, 1045, 1030, 1043, 1041, 910, 2664, 391, 27649, 28050, 583, 630, 630, 574, 574, 550, 612, 628, 623, 610, 609, 611, 550, 628, 611, 631, 627, 611, 629, 626, 550, 610, 611, 615, 610, 618, 623, 616, 611, 550, 611, 638, 613, 611, 611, 610, 611, 610, 2924, 2924, 2928, 2941, 2236, 2729, 2754, 2783, 2763, 2707, 2783, 2708, 2739, 2783, 2740, 2735, 2697, 2753, 2752, 2703, 893, 880, 893, 2297, 2294, 2300, 2282, 2295, 2289, 2300, 2257, 2300, 384, 491, 502, 482, 442, 502, 445, 410, 502, 413, 390, 416, 490, 493, 422, 278, 263, 272, 276, 257, 272, 273, 308, 257, 1642, 1647, 1659, 1662, 1643, 1658, 1659, 1630, 1643, 3040, 3042, 3063, 3046, 3044, 3052, 3057, 3066, 3008, 3052, 3053, 3063, 3046, 3053, 3063, 1376, 1383, 1376, 1405, 515, 516, 515, 542, 3268, 3269, 3286, 3273, 3267, 3269, 530, 531, 514, 535, 543, 538, 565, 537, 536, 514, 531, 536, 514, 2465, 2467, 2484, 2473, 2479, 2478, 1758, 1756, 1739, 1758, 1743, 1756, 1739, 272, 256, 262, 269, 262, 821, 804, 823, 804, 808, 822, 1397, 1396, 1383, 1400, 1394, 1396, 1358, 1400, 1397, 3016, 3023, 3034, 3023, 3038, 1443, 1460, 1442, 1444, 1469, 1445, 1093, 1106, 1094, 1090, 1106, 1092, 1091, 2193, 2188, 2182, 2190, 2176, 2193, 1741, 1745, 1756, 1732, 774, 778, 779, 790, 784, 776, 768, 968, 975, 986, 975, 974, 968, 1273, 1268, 1264, 1269, 1268, 1251, 1250, 2576, 2589, 2582, 2571, 2605, 2576, 2628, 2630, 3296, 3313, 3302, 3321, 3325, 3322, 3317, 3320, 434, 441, 420, 424, 936, 921, 921, 977, 977, 969, 907, 923, 896, 909, 910, 908, 969, 906, 902, 903, 922, 924, 900, 908, 969, 923, 908, 922, 921, 902, 903, 922, 908, 969, 896, 922, 969, 896, 903, 927, 904, 901, 896, 909, 2829, 2876, 2876, 2932, 2932, 2924, 2862, 2878, 2853, 2856, 2859, 2857, 2924, 2876, 2878, 2857, 2876, 2861, 2878, 2857, 2924, 2878, 2857, 2879, 2876, 2851, 2850, 2879, 2857, 2924, 2853, 2879, 2924, 2853, 2850, 2874, 2861, 2848, 2853, 2856, 705, 752, 752, 696, 696, 672, 738, 754, 745, 740, 743, 741, 672, 754, 741, 753, 757, 741, 755, 756, 672, 740, 741, 737, 740, 748, 745, 750, 741, 672, 741, 760, 739, 741, 741, 740, 741, 740, 2045, 1996, 1996, 1924, 1924, 1948, 2014, 1998, 2005, 2008, 2011, 2009, 1948, 1998, 2009, 1997, 1993, 2009, 1999, 1992, 1948, 2009, 1988, 2015, 2009, 2009, 2008, 2009, 2008, 1948, 1998, 2003, 1993, 2002, 2008, 1948, 2000, 2005, 2001, 2005, 1992, 769, 816, 816, 888, 888, 864, 802, 818, 809, 804, 807, 805, 864, 809, 819, 864, 814, 815, 820, 864, 803, 
    815, 814, 806, 809, 807, 821, 818, 805, 804, 1652, 1651, 1649, 1657, 1631, 1651, 1650, 1640, 1657, 1650, 1640, 2576, 2583, 2581, 2589, 2606, 2577, 2588, 2589, 2583, 2619, 2583, 2582, 2572, 2589, 2582, 2572, 1268, 1221, 1221, 1165, 1165, 1173, 1223, 1232, 1240, 1242, 1217, 1232, 1173, 1232, 1229, 1217, 1173, 1223, 1232, 1220, 1216, 1232, 1222, 1217, 1173, 1235, 1236, 1244, 1241, 1232, 1233, 862, 801, 830, 873, 864, 841, 807, 851, 867, 856, 872, 873, 872, 804, 834, 851, 804, 888, 801, 872, 849, 809, 868, 890, 807, 838, 853, 889, 804, 884, 892, 863, 859, 802, 888, 862, 809, 894, 836, 805, 891, 889, 867, 807, 840, 861, 808, 892, 864, 853, 801, 852, 857, 801, 807, 854, 873, 891, 842, 864, 892, 894, 857, 808, 841, 849, 885, 807, 863, 842, 802, 860, 886, 832, 853, 893, 881, 852, 861, 885, 835, 881, 869, 808, 873, 892, 850, 836, 849, 813, 813, 2152, 2123, 2119, 2117, 2128, 2125, 2123, 2122, 806, 791, 791, 863, 863, 839, 789, 770, 778, 776, 787, 770, 839, 770, 799, 787, 839, 789, 770, 771, 782, 789, 770, 772, 787, 839, 782, 788, 839, 782, 777, 785, 774, 779, 782, 771, 3270, 3281, 3289, 3291, 3264, 3281, 3220, 3281, 3276, 3264, 2711, 2709, 2696, 2689, 2702, 2699, 2690, 2744, 1688, 1684, 1686, 1749, 1683, 1682, 1686, 1673, 1672, 1688, 1749, 1677, 1682, 1665, 1671, 649, 658, 667, 759, 744, 751, 748, 1400, 1389, 1391, 1317, 2016, 2033, 2033, 1977, 1977, 2014, 2021, 2020, 2039, 2024, 2018, 2020, 2014, 2033, 2035, 2030, 2023, 2024, 2029, 2020, 2034, 1142, 1095, 1095, 1039, 1039, 1047, 1107, 1106, 1089, 1118, 1108, 1106, 1047, 1095, 1093, 1112, 1105, 1118, 1115, 1106, 1047, 1095, 1106, 1093, 1092, 1118, 1092, 1091, 1106, 1113, 1108, 1106, 1047, 1105, 1110, 1118, 1115, 1106, 1107, 3042, 3055, 3042, 745, 750, 745, 756, 3048, 3049, 3066, 3045, 3055, 3049, 311, 262, 262, 334, 334, 342, 276, 260, 287, 274, 273, 275, 342, 261, 258, 279, 258, 275, 342, 287, 261, 342, 283, 287, 261, 261, 287, 280, 273, 407, 422, 422, 494, 494, 502, 436, 420, 447, 434, 433, 435, 502, 387, 388, 410, 502, 447, 421, 502, 447, 440, 416, 439, 442, 447, 434, 1500, 1443, 1468, 1529, 1478, 1469, 1521, 1506, 1526, 1494, 1507, 1534, 1496, 1465, 1528, 1497, 1479, 1442, 1492, 1531, 1528, 1488, 1483, 1442, 1530, 1512, 1511, 1531, 1506, 1476, 1441, 1493, 1473, 1451, 1465, 1489, 1443, 1483, 1535, 1476, 1492, 1504, 1475, 1443, 1488, 1469, 1502, 1498, 1507, 1504, 1531, 1501, 1476, 1520, 1495, 1502, 1514, 1521, 1442, 1444, 1475, 1480, 1441, 1502, 1535, 1445, 1489, 1450, 1520, 1508, 1503, 1511, 1478, 1512, 1535, 1492, 1507, 1525, 1494, 1509, 1524, 1443, 1530, 1444, 1533, 1535, 1530, 1442, 1508, 1497, 1535, 1508, 1446, 1482, 1473, 1496, 1500, 1504, 1477, 1529, 1451, 1524, 1502, 1515, 1503, 1495, 1488, 1473, 1489, 1479, 1455, 1778, 1677, 1682, 1769, 1741, 1782, 1677, 1773, 1736, 1768, 1758, 1758, 1683, 1786, 1774, 1786, 1743, 1771, 1745, 1778, 1675, 1673, 1790, 1677, 1687, 1757, 1770, 1758, 1672, 1759, 1784, 1773, 1772, 1779, 1758, 1772, 1764, 1683, 1668, 1746, 1780, 1766, 1677, 1783, 1752, 1742, 1766, 1777, 1787, 1679, 1736, 1785, 1744, 1747, 1752, 1675, 1747, 1738, 1741, 1755, 1750, 1683, 1772, 1776, 1764, 1679, 1791, 1766, 1675, 1669, 1770, 1753, 1676, 1782, 1739, 1755, 1752, 1741, 1759, 1754, 1751, 1786, 1749, 1789, 1764, 1740, 1780, 1764, 1676, 1758, 1751, 1757, 1745, 1737, 1783, 1775, 1687, 1755, 1745, 1778, 1757, 1766, 1765, 1732, 1669, 1755, 1782, 1669, 1678, 1668, 1665, 2978, 3037, 3010, 2987, 2951, 2951, 3007, 2979, 2986, 2952, 2983, 2996, 3003, 3033, 2982, 2986, 2959, 2965, 3007, 2947, 2973, 3002, 2986, 2947, 2951, 2977, 2983, 2991, 2975, 3029, 2945, 3003, 2984, 2945, 2975, 2990, 2953, 3029, 2971, 3038, 3007, 3001, 3033, 2990, 3028, 3003, 2952, 2965, 2983, 3038, 2954, 2953, 2982, 2985, 3000, 2965, 2976, 2945, 3039, 2996, 2945, 2953, 2944, 2981, 2948, 2950, 2997, 2978, 2970, 2957, 2983, 3007, 2975, 3029, 2986, 2958, 2979, 3006, 2996, 2958, 2949, 3006, 2964, 2948, 2945, 3006, 2987, 2974, 3005, 3025, 3025, 1035, 1140, 1131, 1044, 1059, 1040, 1028, 1074, 1130, 1138, 1042, 1041, 1059, 1141, 1053, 1134, 1073, 1077, 1084, 1055, 1059, 1070, 1142, 1031, 1042, 1034, 1139, 1025, 1148, 1076, 1064, 1028, 1062, 1026, 1141, 1055, 1033, 1043, 1044, 1060, 1045, 1068, 1059, 1047, 1059, 1079, 1039, 1074, 1073, 1036, 1056, 1062, 1140, 1059, 1068, 1072, 1032, 1041, 1140, 1032, 1074, 1072, 1031, 1036, 1069, 1139, 1036, 1053, 1066, 1075, 1060, 1072, 1070, 1041, 1071, 1130, 1072, 1068, 1026, 1041, 1052, 1047, 1143, 1064, 1025, 1066, 1060, 1130, 1042, 1076, 1067, 1060, 1068, 1072, 1031, 1136, 1074, 1149, 1068, 1024, 1067, 1060, 1033, 1031, 1067, 1078, 1075, 1059, 1044, 1070, 1047, 1062, 1032, 1130, 1087, 1045, 1138, 1138, 1138, 1047, 1038, 1059, 1045, 1039, 1141, 1141, 1063, 1032, 1038, 1025, 1077, 1038, 1030, 1067, 1058, 1062, 1032, 1084, 1058, 1056, 1072, 1137, 1044, 1078, 1141, 1070, 1141, 1087, 1057, 1056, 1085, 1065, 1058, 1144, 1144, 487, 485, 499, 511, 492, 511, 489, 481, 483, 484, 493, 2571, 2587, 2560, 2573, 2574, 2572, 2633, 2587, 2572, 2586, 2585, 2566, 2567, 2586, 2572, 2875, 2879, 2800, 2791, 2801, 2791, 2806, 2986, 3005, 3005, 2976, 3005, 1306, 1323, 1323, 1379, 1379, 1403, 1337, 1321, 1330, 1343, 1340, 1342, 1403, 1320, 1327, 1338, 1327, 1342, 1403, 1342, 1315, 1323, 1330, 1321, 1342, 1343, 2894, 2943, 2943, 2871, 2871, 2863, 2925, 2941, 2918, 2923, 2920, 2922, 2863, 2940, 2922, 2941, 2937, 2918, 2924, 2922, 2863, 2921, 2926, 2918, 2915, 2922, 2923, 1185, 1188, 1201, 1188, 2498, 2547, 2547, 2491, 2491, 2467, 2529, 2545, 2538, 2535, 2532, 2534, 2467, 2535, 2530, 2551, 2530, 2467, 2538, 2544, 2467, 2542, 2538, 2544, 2544, 2538, 2541, 2532, 2537, 2520, 2520, 2448, 2448, 2440, 2506, 2522, 2497, 2508, 2511, 2509, 2440, 2522, 2509, 2524, 2525, 2522, 2502, 2509, 2508, 2440, 2502, 2503, 2440, 2522, 2509, 2523, 2520, 2503, 2502, 2523, 2509, 1453, 
    1436, 1436, 1492, 1492, 1484, 1422, 1438, 1413, 1416, 1419, 1417, 1484, 1438, 1417, 1416, 1413, 1438, 1417, 1423, 1432, 1484, 1413, 1439, 1484, 1410, 1411, 1432, 1484, 1421, 1408, 1408, 1411, 1435, 1417, 1416, 1134, 1119, 1119, 1047, 1047, 1039, 1101, 1117, 1094, 1099, 1096, 1098, 1039, 1117, 1098, 1118, 1114, 1098, 1116, 1115, 1039, 1098, 1089, 1100, 1117, 1110, 1119, 1115, 1094, 1088, 1089, 1039, 1097, 1102, 1094, 1091, 1098, 1099, 762, 742, 747, 755, 751, 760, 713, 741, 740, 766, 751, 740, 766, 1449, 1471, 1467, 1448, 1465, 1458, 1433, 1461, 1460, 1454, 1471, 1460, 1454, 1767, 1777, 1781, 1766, 1783, 1788, 1751, 1787, 1786, 1760, 1777, 1786, 1760};
    public static final MediaType f = MediaType.parse(C0118.m471(f7short, 276, 31, 1085));
    public static final SecureRandom g = new SecureRandom();
    public static final Object h = new Object();

    final class BridgeEndpoint {
        public final String a;
        public final String b;
        public final String c;

        public BridgeEndpoint(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    final class BridgeStateException extends IOException {
        public BridgeStateException(String str) {
            super(str);
        }
    }

    final class TargetReply {
        public final int a;
        public final JSONObject b;
        public final String c;

        public TargetReply(int i, String str, JSONObject jSONObject) {
            this.a = i;
            this.b = jSONObject;
            this.c = str;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0055.m219(f7short, 0, 1, 1411));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        JSONObject jSONObjectD = d(C0090.m358(f7short, 1, 4, 2287), new JSONObject());
        JSONArray jSONArrayOptJSONArray = jSONObjectD.optJSONArray(C0104.m414(f7short, 5, 7, 2101));
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strTrim = jSONObjectOptJSONObject.optString(C0133.m529(f7short, 12, 2, 1140)).trim();
                    String strTrim2 = jSONObjectOptJSONObject.optString(C0117.m467(f7short, 14, 4, 1357)).trim();
                    if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                        com.github.catvod.spider.merge.D.b.z(strTrim, strTrim2, null, arrayList);
                    }
                }
            }
        }
        return com.github.catvod.spider.merge.p001b.g.w(arrayList, i(jSONObjectD.optJSONArray(C0044.m175(f7short, 18, 4, 1471))), jSONObjectD.optJSONObject(C0109.m432(f7short, 22, 7, 1281)));
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        return str != null && (str.toLowerCase(Locale.US).contains(C0105.m416(f7short, 29, 5, 685)) || AbstractC0309x1.j(str));
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        return com.github.catvod.spider.merge.p001b.g.y(i(d(C0125.m499(f7short, 34, 10, 1337), new JSONObject()).optJSONArray(C0142.m567(f7short, 44, 4, 2638))));
    }

    private /* synthetic */ boolean $host$53940b53855fde82() {
        return true;
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) throws JSONException {
        String str3 = str;
        int i = 1;
        try {
            int i2 = Integer.parseInt(str2);
            if (i2 > 0 && i2 <= 100000) {
                i = i2;
            }
        } catch (Exception unused) {
        }
        JSONObject jSONObject = new JSONObject();
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put(C0026.m102(f7short, 48, 3, 2626), str3);
        jSONObject.put(C0085.m339(f7short, 51, 4, 1197), i);
        return g(i, d(C0115.m459(f7short, 55, 6, 2105), jSONObject));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0018.m70(f7short, 61, 2, 2849), str2 == null ? "" : str2);
        JSONObject jSONObjectD = d(C0120.m477(f7short, 63, 4, 1462), jSONObject);
        String strTrim = jSONObjectD.optString(C0026.m102(f7short, 67, 3, 1007)).trim();
        HttpUrl httpUrl = HttpUrl.parse(strTrim);
        if (httpUrl == null) {
            throw new IOException(C0137.m545(f7short, 177, 32, 500));
        }
        String strI = AbstractC0280n1.i(str, str2, null, null);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(FishCrypto.w(C0109.m432(f7short, 70, 91, 2379), strTrim));
        gVar.b(strI != null ? strI : "");
        JSONObject jSONObjectOptJSONObject = jSONObjectD.optJSONObject(C0128.m511(f7short, 161, 7, 3040));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObjectOptJSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOptString)) {
                    linkedHashMap.put(next, strOptString);
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            gVar.h(linkedHashMap);
        }
        if (jSONObjectD.optBoolean(C0126.m503(f7short, 168, 4, 686)) || httpUrl.toString().toLowerCase(Locale.US).contains(C0073.m288(f7short, 172, 5, 750))) {
            gVar.k();
        }
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        JSONArray jSONArrayOptJSONArray;
        String strM463;
        if (list == null || list.isEmpty() || TextUtils.isEmpty(list.get(0))) {
            return AbstractC0449a.b();
        }
        String str = list.get(0);
        JSONObject jSONObject = new JSONObject();
        String strM402 = C0101.m402(f7short, 209, 2, 3271);
        JSONObject jSONObjectD = d(C0082.m325(f7short, 211, 6, 2298), jSONObject.put(strM402, str));
        JSONObject jSONObjectOptJSONObject = jSONObjectD.optJSONObject(C0082.m325(f7short, 217, 3, 2973));
        if (jSONObjectOptJSONObject == null) {
            return AbstractC0449a.b();
        }
        k kVarH = h(str, jSONObjectOptJSONObject);
        kVarH.l(FishCrypto.a(kVarH.a()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObjectD.optJSONArray(C0032.m126(f7short, 220, 7, 3259));
        if (jSONArrayOptJSONArray2 != null) {
            for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(C0119.m473(f7short, 227, 8, 1278))) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    int i2 = 0;
                    while (true) {
                        int length = jSONArrayOptJSONArray.length();
                        strM463 = C0116.m463(f7short, 235, 4, 741);
                        if (i2 >= length) {
                            break;
                        }
                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject3 != null) {
                            String strTrim = jSONObjectOptJSONObject3.optString(C0103.m408(f7short, 239, 7, 1684), jSONObjectOptJSONObject3.optString(strM402, "")).trim();
                            if (!TextUtils.isEmpty(strTrim)) {
                                String strTrim2 = jSONObjectOptJSONObject3.optString(strM463, "").trim();
                                if (TextUtils.isEmpty(strTrim2)) {
                                    strTrim2 = C0114.m454(f7short, 246, 1, 905) + (i2 + 1) + C0046.m182(f7short, 247, 1, 469);
                                }
                                arrayList3.add(n(strTrim2) + C0087.m346(f7short, 248, 1, 1275) + strTrim);
                            }
                        }
                        i2++;
                    }
                    if (!arrayList3.isEmpty()) {
                        String strTrim3 = jSONObjectOptJSONObject2.optString(strM463).trim();
                        if (TextUtils.isEmpty(strTrim3)) {
                            strTrim3 = C0003.m10(f7short, 249, 2, 726) + (arrayList.size() + 1);
                        }
                        arrayList.add(n(strTrim3));
                        arrayList2.add(TextUtils.join(C0125.m499(f7short, 251, 1, 925), arrayList3));
                    }
                }
            }
        }
        C0294s1.e(arrayList, arrayList2);
        C0294s1.c(this.d, arrayList);
        String strM105 = C0027.m105(f7short, 252, 3, 1177);
        String strJoin = TextUtils.join(strM105, arrayList2);
        kVarH.q(TextUtils.join(strM105, arrayList));
        kVarH.r(strJoin);
        AbstractC0280n1.p(kVarH.c());
        AbstractC0280n1.q(strJoin);
        return com.github.catvod.spider.merge.p001b.g.s(kVarH);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        Object obj = str;
        int i = 1;
        try {
            int i2 = Integer.parseInt(str2);
            if (i2 > 0 && i2 <= 100000) {
                i = i2;
            }
        } catch (Exception unused) {
        }
        JSONObject jSONObject = new JSONObject();
        if (obj == null) {
            obj = "";
        }
        jSONObject.put(C0140.m558(f7short, 255, 3, 1191), obj);
        jSONObject.put(C0118.m471(f7short, 258, 4, 437), i);
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    jSONObject2.put(key, value);
                }
            }
        }
        jSONObject.put(C0114.m454(f7short, 262, 6, 822), jSONObject2);
        return g(i, d(C0056.m223(f7short, 268, 8, 1955), jSONObject));
    }

    public static String a(String str) throws Throwable {
        String strTrim = str == null ? "" : str.trim();
        if (TextUtils.isEmpty(strTrim)) {
            return "";
        }
        try {
            String strG = FishCrypto.g(strTrim);
            return !TextUtils.isEmpty(strG) ? strG.trim() : strTrim;
        } catch (Exception unused) {
            return strTrim;
        }
    }

    public static JSONObject b(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            throw new IOException(C0106.m422(f7short, 620, 33, 2734));
        }
        JSONObject jSONObject = new JSONObject(str);
        Object objOpt = jSONObject.opt(C0103.m408(f7short, 307, 11, 1879));
        if (jSONObject.length() == 1 && (objOpt instanceof String)) {
            String str2 = (String) objOpt;
            if (!TextUtils.isEmpty(str2)) {
                byte[] bArrS = FishCrypto.s(C0001.m1(f7short, 318, 111, 2308), C0055.m219(f7short, 429, 111, 610), Base64.decode(str2, 0));
                if (bArrS != null) {
                    return new JSONObject(new String(bArrS, StandardCharsets.UTF_8));
                }
                throw new IOException(C0074.m292(f7short, 540, 39, 626));
            }
        }
        throw new IOException(C0092.m365(f7short, 579, 41, 1227));
    }

    public static BridgeEndpoint c(String str) {
        String str2;
        String str3 = "";
        String strTrim = str == null ? "" : str.trim();
        boolean zStartsWith = strTrim.startsWith(C0116.m463(f7short, 653, 1, 1817));
        String strM75 = C0019.m75(f7short, 654, 4, 2329);
        if (zStartsWith) {
            try {
                JSONObject jSONObject = new JSONObject(strTrim);
                strTrim = jSONObject.optString(C0118.m471(f7short, 658, 3, 1312), jSONObject.optString(C0076.m301(f7short, 661, 3, 1017), jSONObject.optString(C0070.m277(f7short, 664, 3, 2913), ""))).trim();
                String strTrim2 = jSONObject.optString(C0008.m31(f7short, 667, 8, 2479), "").trim();
                String strTrim3 = jSONObject.optString(strM75, strTrim2).trim();
                str2 = strTrim2;
                str3 = strTrim3;
            } catch (Exception unused) {
                return null;
            }
        } else {
            str2 = "";
        }
        HttpUrl httpUrlBuild = HttpUrl.parse(strTrim);
        if (httpUrlBuild == null) {
            return null;
        }
        String strQueryParameter = httpUrlBuild.queryParameter(strM75);
        if (!TextUtils.isEmpty(strQueryParameter) || TextUtils.isEmpty(str3)) {
            str3 = strQueryParameter;
        } else {
            httpUrlBuild = httpUrlBuild.newBuilder().addQueryParameter(strM75, str3).build();
        }
        String strQueryParameter2 = httpUrlBuild.queryParameter(C0142.m567(f7short, 675, 6, 2064));
        if ((TextUtils.isEmpty(strQueryParameter2) || C0079.m314(f7short, 681, 5, 487).equalsIgnoreCase(strQueryParameter2)) && !TextUtils.isEmpty(str3)) {
            return new BridgeEndpoint(httpUrlBuild.toString(), str3.trim(), str2);
        }
        return null;
    }

    public static JSONObject f() throws JSONException {
        boolean z = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strQ = q(Build.VERSION.RELEASE, String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MODEL;
        String strM31 = C0008.m31(f7short, 686, 7, 803);
        String strQ2 = q(str, strM31);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0073.m288(f7short, 693, 6, 1524), 1);
        jSONObject.put(C0120.m477(f7short, 699, 4, 2080), UUID.randomUUID().toString());
        jSONObject.put(C0011.m42(f7short, 703, 3, 2860), UUID.randomUUID().toString());
        byte[] bArr = new byte[8];
        g.nextBytes(bArr);
        StringBuilder sb = new StringBuilder(16);
        for (int i = 0; i < 8; i++) {
            sb.append(String.format(Locale.US, C0133.m529(f7short, 706, 4, 3157), Integer.valueOf(bArr[i] & 255)));
        }
        jSONObject.put(C0140.m558(f7short, 710, 9, 2193), sb.toString());
        jSONObject.put(C0092.m365(f7short, 719, 9, 2858), jCurrentTimeMillis);
        jSONObject.put(C0125.m499(f7short, 728, 9, 1684), jCurrentTimeMillis);
        String str2 = Build.MODEL;
        jSONObject.put(C0096.m382(f7short, 737, 4, 1846), q(str2, strM31));
        jSONObject.put(C0003.m10(f7short, 741, 5, 1737), strQ2);
        String str3 = Build.DEVICE;
        String strM32 = C0008.m31(f7short, 746, 7, 1273);
        jSONObject.put(C0133.m529(f7short, 753, 6, 2872), q(str3, strM32));
        jSONObject.put(C0133.m529(f7short, 759, 5, 1116), q(Build.BRAND, strM31));
        jSONObject.put(C0021.m83(f7short, 764, 12, 1373), q(Build.MANUFACTURER, strM31));
        String str4 = Build.PRODUCT;
        jSONObject.put(C0087.m346(f7short, 776, 7, 2696), q(str4, strM32));
        jSONObject.put(C0120.m477(f7short, 783, 8, 2466), q(Build.HARDWARE, strM32));
        jSONObject.put(C0009.m33(f7short, 798, 10, 3108), q(Build.BOOTLOADER, C0128.m511(f7short, 791, 7, 394)));
        String str5 = Build.DISPLAY;
        String strM416 = C0105.m416(f7short, 808, 12, 1335);
        jSONObject.put(C0117.m467(f7short, 820, 7, 692), q(str5, strM416));
        jSONObject.put(C0120.m477(f7short, 827, 4, 1148), q(Build.HOST, strM32));
        jSONObject.put(C0096.m382(f7short, 831, 4, 2098), q(Build.TAGS, strM416));
        jSONObject.put(C0047.m186(f7short, 839, 4, 885), q(Build.TYPE, C0140.m558(f7short, 835, 4, 2250)));
        String str6 = Build.FINGERPRINT;
        jSONObject.put(C0106.m422(f7short, 884, 6, 1162), q(str6, C0030.m116(f7short, 843, 41, 2088)));
        jSONObject.put(C0053.m210(f7short, 890, 7, 2614), strQ);
        jSONObject.put(C0118.m471(f7short, 897, 6, 3270), Math.max(1, Build.VERSION.SDK_INT));
        String strQ3 = q(str6, "");
        Locale locale = Locale.US;
        String lowerCase = strQ3.toLowerCase(locale);
        String lowerCase2 = q(str2, "").toLowerCase(locale);
        String lowerCase3 = q(str4, "").toLowerCase(locale);
        if (!lowerCase.startsWith(C0074.m292(f7short, 903, 7, 3141))) {
            String strM193 = C0049.m193(f7short, 910, 8, 3007);
            if (!lowerCase.contains(strM193) && !lowerCase2.contains(C0027.m105(f7short, 918, 10, 1674)) && !lowerCase2.contains(strM193) && !lowerCase3.contains(C0059.m234(f7short, 928, 3, 1740))) {
                z = true;
            }
        }
        jSONObject.put(C0028.m108(f7short, 931, 16, 2396), z);
        String strQ4 = q(Build.ID, C0046.m182(f7short, 947, 7, 1097));
        StringBuilder sbR = com.github.catvod.spider.merge.D.b.r(C0072.m285(f7short, 954, 28, 427), strQ, C0008.m31(f7short, 982, 2, 2701), strQ2, C0059.m234(f7short, 984, 7, 1888));
        sbR.append(strQ4);
        sbR.append(C0081.m322(f7short, 991, 54, 1645));
        jSONObject.put(C0011.m42(f7short, 1045, 9, 3275), sbR.toString());
        return jSONObject;
    }

    public static String g(int i, JSONObject jSONObject) {
        int i2 = i;
        ArrayList arrayListI = i(jSONObject.optJSONArray(C0092.m365(f7short, 1054, 4, 2672)));
        int iOptInt = jSONObject.optInt(C0026.m102(f7short, 1058, 4, 1454), i2);
        if (iOptInt > 0) {
            i2 = iOptInt;
        }
        int iOptInt2 = jSONObject.optInt(C0087.m346(f7short, 1067, 9, 2391), jSONObject.optInt(C0118.m471(f7short, 1062, 5, 1186), i2));
        if (iOptInt2 <= 0) {
            iOptInt2 = i2;
        }
        int iOptInt3 = jSONObject.optInt(C0028.m108(f7short, 1076, 5, 2803), 21);
        return AbstractC0449a.c(i2, iOptInt2, iOptInt3 > 0 ? iOptInt3 : 21, Math.max(jSONObject.optInt(C0128.m511(f7short, 1081, 5, 2393), arrayListI.size()), arrayListI.size()), arrayListI);
    }

    public static k h(String str, JSONObject jSONObject) {
        String str2 = str;
        k kVar = new k();
        String strOptString = jSONObject.optString(C0079.m314(f7short, 1086, 2, 1129), str2);
        if (!TextUtils.isEmpty(strOptString)) {
            str2 = strOptString;
        }
        kVar.n(str2);
        kVar.o(jSONObject.optString(C0116.m463(f7short, 1088, 4, 600)));
        kVar.p(jSONObject.optString(C0095.m379(f7short, 1092, 3, 2437)));
        kVar.s(jSONObject.optString(C0027.m105(f7short, 1095, 7, 645)));
        kVar.u(jSONObject.optString(C0082.m325(f7short, 1102, 4, 2957)));
        kVar.k(jSONObject.optString(C0043.m169(f7short, 1106, 4, 1795)));
        kVar.j(jSONObject.optString(C0090.m358(f7short, 1110, 5, 963)));
        kVar.m(jSONObject.optString(C0112.m445(f7short, 1115, 8, 3028)));
        kVar.i(jSONObject.optString(C0008.m31(f7short, 1128, 4, 1058), jSONObject.optString(C0096.m382(f7short, 1123, 5, 2082), "")));
        kVar.l(jSONObject.optString(C0047.m186(f7short, 1137, 7, 2304), jSONObject.optString(C0120.m477(f7short, 1132, 5, 2695), "")));
        return kVar;
    }

    public static ArrayList i(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strTrim = jSONObjectOptJSONObject.optString(C0139.m554(f7short, 1144, 2, 1057)).trim();
                String strTrim2 = jSONObjectOptJSONObject.optString(C0073.m288(f7short, 1146, 4, 2496)).trim();
                if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                    arrayList.add(h("", jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    public static byte[] k(ResponseBody responseBody, String str, int i) throws IOException {
        long jContentLength = responseBody.contentLength();
        long j = i;
        String strM570 = C0143.m570(f7short, 1150, 13, 1221);
        String strM223 = C0056.m223(f7short, 1163, 6, 3011);
        if (jContentLength > j) {
            throw new IOException(com.github.catvod.spider.merge.D.b.j(strM223, str, strM570));
        }
        InputStream inputStreamByteStream = responseBody.byteStream();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                int i2 = 0;
                while (true) {
                    int i3 = inputStreamByteStream.read(bArr);
                    if (i3 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStreamByteStream.close();
                        return byteArray;
                    }
                    i2 += i3;
                    if (i2 > i) {
                        throw new IOException(strM223 + str + strM570);
                    }
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStreamByteStream != null) {
                try {
                    inputStreamByteStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static TargetReply l(JSONObject jSONObject, long j) throws IOException {
        byte[] bArrDecode;
        String strM83 = C0021.m83(f7short, 1169, 6, 2212);
        String strM31 = C0008.m31(f7short, 1175, 3, 385);
        String strTrim = jSONObject.optString(strM83, strM31).trim();
        Locale locale = Locale.US;
        String upperCase = strTrim.toUpperCase(locale);
        if (!strM31.equals(upperCase) && !C0089.m355(f7short, 1178, 4, 2353).equals(upperCase)) {
            throw new IOException(C0105.m416(f7short, 1182, 41, 2849));
        }
        HttpUrl httpUrl = HttpUrl.parse(jSONObject.optString(C0112.m445(f7short, 1223, 3, 1160)).trim());
        if (httpUrl != null) {
            String lowerCase = httpUrl.encodedPath().toLowerCase(locale);
            if (!lowerCase.endsWith(C0115.m459(f7short, 1226, 5, 1934)) && !lowerCase.endsWith(C0021.m83(f7short, 1231, 4, 482)) && !lowerCase.endsWith(C0093.m368(f7short, 1235, 3, 1740)) && !lowerCase.endsWith(C0072.m285(f7short, 1238, 4, 1648)) && !lowerCase.endsWith(C0104.m414(f7short, 1242, 4, 2097)) && !lowerCase.endsWith(C0006.m21(f7short, 1246, 4, 1555)) && !lowerCase.endsWith(C0139.m554(f7short, 1250, 4, 1256))) {
                Request.Builder builderUrl = new Request.Builder().url(httpUrl);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C0120.m477(f7short, 1254, 7, 2199));
                String str = "";
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    int i = 0;
                    int length = 0;
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObjectOptJSONObject.optString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOptString)) {
                            i++;
                            Charset charset = StandardCharsets.UTF_8;
                            length += strOptString.getBytes(charset).length + next.getBytes(charset).length;
                            if (i > 64 || length > 16384) {
                                throw new IOException(C0008.m31(f7short, 1311, 42, 1930));
                            }
                            try {
                                builderUrl.header(next, strOptString);
                                if (C0093.m368(f7short, 1261, 12, 2634).equalsIgnoreCase(next)) {
                                    str = strOptString;
                                }
                            } catch (IllegalArgumentException e) {
                                throw new IOException(C0091.m360(f7short, 1273, 38, 3235), e);
                            }
                        }
                    }
                }
                String strOptString2 = jSONObject.optString(C0074.m292(f7short, 1353, 8, 1553));
                if (!strM31.equals(upperCase)) {
                    if (TextUtils.isEmpty(strOptString2)) {
                        bArrDecode = new byte[0];
                    } else {
                        int length2 = strOptString2.length();
                        String strM219 = C0055.m219(f7short, 1401, 38, 837);
                        if (length2 > 2796210) {
                            throw new IOException(strM219);
                        }
                        try {
                            bArrDecode = Base64.decode(strOptString2, 0);
                            if (bArrDecode.length > 2097152) {
                                throw new IOException(strM219);
                            }
                        } catch (IllegalArgumentException e2) {
                            throw new IOException(C0095.m379(f7short, 1454, 36, 618), e2);
                        }
                    }
                    builderUrl.post(RequestBody.create(TextUtils.isEmpty(str) ? null : MediaType.parse(str), bArrDecode));
                } else {
                    if (!TextUtils.isEmpty(strOptString2)) {
                        throw new IOException(C0091.m360(f7short, 1361, 40, 3034));
                    }
                    builderUrl.get();
                }
                Response responseK = X1.K(builderUrl.build(), o(j));
                try {
                    ResponseBody responseBodyBody = responseK.body();
                    TargetReply targetReply = new TargetReply(responseK.code(), Base64.encodeToString((responseBodyBody == null || responseK.isRedirect()) ? new byte[0] : k(responseBodyBody, C0106.m422(f7short, 1439, 15, 733), 2097152), 2), m(responseK.headers()));
                    responseK.close();
                    return targetReply;
                } catch (Throwable th) {
                    if (responseK != null) {
                        try {
                            responseK.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
        throw new IOException(C0073.m288(f7short, 1490, 34, 872));
    }

    public static JSONObject m(Headers headers) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        int length = 0;
        for (String str : headers.names()) {
            String strJoin = TextUtils.join(C0092.m365(f7short, 1524, 2, 1924), headers.values(str));
            i++;
            Charset charset = StandardCharsets.UTF_8;
            length += strJoin.getBytes(charset).length + str.getBytes(charset).length;
            if (i > 64 || length > 16384) {
                throw new IOException(C0044.m175(f7short, 1526, 43, 1140));
            }
            jSONObject.put(str.toLowerCase(Locale.US), strJoin);
        }
        return jSONObject;
    }

    public static String n(String str) {
        String strK;
        if (str == null) {
            strK = "";
        } else {
            String strM427 = C0107.m427(f7short, 1569, 1, 941);
            String strM108 = C0028.m108(f7short, 1570, 1, 2632);
            strK = com.github.catvod.spider.merge.D.b.k(str, strM427, strM108, C0063.m249(f7short, 1571, 1, 419), strM108);
        }
        return TextUtils.isEmpty(strK) ? C0095.m379(f7short, 1572, 2, 2220) : strK;
    }

    public static long o(long j) throws IOException {
        long jElapsedRealtime = j - SystemClock.elapsedRealtime();
        if (jElapsedRealtime > 0) {
            return Math.max(1L, Math.min(15000L, jElapsedRealtime));
        }
        throw new IOException(C0017.m65(f7short, 1574, 38, 518));
    }

    public static boolean p(JSONObject jSONObject) {
        return jSONObject.optString(C0027.m105(f7short, 1612, 4, 2841)).replace(C0026.m102(f7short, 1616, 1, 2193), "").matches(C0032.m126(f7short, 1617, 15, 2802)) && !TextUtils.isEmpty(jSONObject.optString(C0076.m301(f7short, 1632, 3, 793))) && jSONObject.optString(C0027.m105(f7short, 1635, 9, 2200)).matches(C0046.m182(f7short, 1644, 15, 475)) && jSONObject.optLong(C0091.m360(f7short, 1659, 9, 373)) > 0 && jSONObject.optLong(C0028.m108(f7short, 1668, 9, 1567)) > 0;
    }

    public static String q(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0008.m31(f7short, 1677, 15, 2947));
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

    public final synchronized JSONObject d(String str, JSONObject jSONObject) {
        try {
        } catch (BridgeStateException e) {
            if (C0114.m454(f7short, 1692, 4, 1289).equals(str) || this.e.length() == 0) {
                throw e;
            }
            this.c = "";
            e(C0139.m554(f7short, 1696, 4, 618), new JSONObject().put(C0116.m463(f7short, 1700, 6, 3232), this.e));
            return e(str, jSONObject);
        }
        return e(str, jSONObject);
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0070.m277(f7short, 1706, 13, 630));
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

    public final JSONObject e(String str, JSONObject jSONObject) throws JSONException, IOException {
        TargetReply targetReply;
        boolean z;
        if (TextUtils.isEmpty(this.a)) {
            throw new IOException(C0112.m445(f7short, 1979, 30, 832));
        }
        JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : new JSONObject(jSONObject.toString());
        String str2 = this.c;
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 300000;
        int i = 0;
        while (i < 128) {
            if (SystemClock.elapsedRealtime() >= jElapsedRealtime) {
                throw new IOException(C0018.m70(f7short, 1900, 38, 640));
            }
            String strM193 = C0049.m193(f7short, 1719, 6, 2496);
            String strM379 = C0095.m379(f7short, 1725, 7, 1710);
            String strM545 = C0137.m545(f7short, 1732, 5, 355);
            JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v(strM193, strM379, strM545, str);
            jSONObjectV.put(C0049.m193(f7short, 1737, 6, 837), jSONObject2);
            jSONObjectV.put(C0047.m186(f7short, 1743, 9, 1297), this.b);
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            String strM471 = C0118.m471(f7short, 1752, 5, 3003);
            if (!zIsEmpty) {
                jSONObjectV.put(strM471, str2);
            }
            JSONObject jSONObjectJ = j(jSONObjectV, o(jElapsedRealtime));
            String strTrim = jSONObjectJ.optString(strM471, str2).trim();
            String strM346 = C0087.m346(f7short, 1757, 6, 1489);
            JSONObject jSONObjectOptJSONObject = jSONObjectJ.optJSONObject(strM346);
            if (jSONObjectOptJSONObject != null) {
                this.c = strTrim;
                return jSONObjectOptJSONObject;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectJ.optJSONObject(C0139.m554(f7short, 1763, 7, 1079));
            String strM382 = C0096.m382(f7short, 1770, 6, 2277);
            String strTrim2 = jSONObjectJ.optString(strM382).trim();
            if (jSONObjectOptJSONObject2 == null || TextUtils.isEmpty(strTrim2)) {
                throw new IOException(C0115.m459(f7short, 1860, 40, 2892));
            }
            try {
                targetReply = l(jSONObjectOptJSONObject2, jElapsedRealtime);
                z = true;
            } catch (IOException e) {
                if (!C0076.m301(f7short, 1776, 4, 1725).equals(str)) {
                    throw e;
                }
                targetReply = new TargetReply(599, "", new JSONObject());
                z = false;
            }
            if (z && jSONObjectJ.has(strM471)) {
                this.c = strTrim;
            }
            JSONObject jSONObjectV2 = com.github.catvod.spider.merge.D.b.v(strM193, C0142.m567(f7short, 1780, 7, 869), strM545, str);
            jSONObjectV2.put(strM382, strTrim2);
            jSONObjectV2.put(C0006.m21(f7short, 1787, 6, 955), targetReply.a);
            jSONObjectV2.put(C0092.m365(f7short, 1793, 7, 1169), targetReply.b);
            jSONObjectV2.put(C0106.m422(f7short, 1800, 8, 2674), targetReply.c);
            JSONObject jSONObjectJ2 = j(jSONObjectV2, o(jElapsedRealtime));
            String strTrim3 = jSONObjectJ2.optString(strM471, strTrim).trim();
            JSONObject jSONObjectOptJSONObject3 = jSONObjectJ2.optJSONObject(strM346);
            if (jSONObjectOptJSONObject3 != null) {
                this.c = strTrim3;
                return jSONObjectOptJSONObject3;
            }
            if (jSONObjectJ2.optBoolean(C0003.m10(f7short, 1808, 8, 3220)) || !jSONObjectJ2.optBoolean(C0056.m223(f7short, 1816, 4, 476))) {
                throw new IOException(C0014.m54(f7short, 1820, 40, 1001));
            }
            i++;
            str2 = strTrim3;
            jSONObject2 = jSONObject2;
        }
        throw new IOException(C0072.m285(f7short, 1938, 41, 1980));
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0093.m368(f7short, 2009, 11, 1564));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0026.m102(f7short, 2020, 16, 2680));
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

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
    
        if (r2 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(android.content.Context r61, java.lang.String r62) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.App88.init(android.content.Context, java.lang.String):void");
    }

    public boolean isVideoFormat(String str) {
        if (FishCrypto.businessReady()) {
            return $host$42ceaa68a95df632(str);
        }
        return false;
    }

    public final JSONObject j(JSONObject jSONObject, long j) throws IOException {
        String string = jSONObject.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bArrT = FishCrypto.t(C0104.m414(f7short, 2375, 111, 1426), C0130.m516(f7short, 2486, 111, 1724), C0044.m175(f7short, 2597, 91, 3052), C0104.m414(f7short, 2688, 155, 1093), string.getBytes(charset));
        if (bArrT == null) {
            throw new IOException(C0120.m477(f7short, 3035, 38, 1071));
        }
        Response responseK = X1.K(new Request.Builder().url(this.a).post(RequestBody.create(f, new JSONObject().put(C0079.m314(f7short, 2843, 11, 394), Base64.encodeToString(bArrT, 2)).toString())).build(), j);
        try {
            if (responseK.isRedirect()) {
                throw new IOException(C0109.m432(f7short, 2999, 36, 1516));
            }
            ResponseBody responseBodyBody = responseK.body();
            if (responseBodyBody == null) {
                throw new IOException(C0119.m473(f7short, 2966, 33, 2472));
            }
            JSONObject jSONObjectB = b(new String(k(responseBodyBody, C0117.m467(f7short, 2854, 15, 2665), 4194304), charset));
            if (jSONObjectB.optBoolean(C0050.m199(f7short, 2869, 2, 2900))) {
                JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(C0135.m539(f7short, 2934, 4, 1221));
                if (jSONObjectOptJSONObject == null) {
                    throw new IOException(C0082.m325(f7short, 2938, 28, 2435));
                }
                responseK.close();
                return jSONObjectOptJSONObject;
            }
            boolean zOptBoolean = jSONObjectB.optBoolean(C0021.m83(f7short, 2871, 5, 2690));
            String strM177 = C0045.m177(f7short, 2876, 5, 3023);
            if (zOptBoolean) {
                throw new BridgeStateException(jSONObjectB.optString(strM177, C0003.m10(f7short, 2881, 26, 1371)));
            }
            throw new IOException(jSONObjectB.optString(strM177, C0125.m499(f7short, 2907, 27, 2831)));
        } catch (Throwable th) {
            if (responseK != null) {
                try {
                    responseK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean manualVideoCheck() {
        if (FishCrypto.businessReady()) {
            return $host$53940b53855fde82();
        }
        return false;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0103.m408(f7short, 3073, 13, 650));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0028.m108(f7short, 3086, 13, 1498));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0049.m193(f7short, 3099, 13, 1684));
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

package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
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
import java.security.MessageDigest;
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
    public static final MediaType f = MediaType.parse("application/json; charset=utf-8");
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
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        JSONObject jSONObjectD = d("home", new JSONObject());
        JSONArray jSONArrayOptJSONArray = jSONObjectD.optJSONArray("classes");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strTrim = jSONObjectOptJSONObject.optString("id").trim();
                    String strTrim2 = jSONObjectOptJSONObject.optString("name").trim();
                    if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                        com.github.catvod.spider.merge.D.b.z(strTrim, strTrim2, null, arrayList);
                    }
                }
            }
        }
        return com.github.catvod.spider.merge.p001b.g.w(arrayList, i(jSONObjectD.optJSONArray("list")), jSONObjectD.optJSONObject("filters"));
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        return str != null && (str.toLowerCase(Locale.US).contains(".m3u8") || AbstractC0309x1.j(str));
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        return com.github.catvod.spider.merge.p001b.g.y(i(d("home_video", new JSONObject()).optJSONArray("list")));
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
        jSONObject.put("key", str3);
        jSONObject.put("page", i);
        return g(i, d("search", jSONObject));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str2 == null ? "" : str2);
        JSONObject jSONObjectD = d("play", jSONObject);
        String strTrim = jSONObjectD.optString("url").trim();
        HttpUrl httpUrl = HttpUrl.parse(strTrim);
        if (httpUrl == null) {
            throw new IOException("App88 bridge play URL is invalid");
        }
        String strI = AbstractC0280n1.i(str, str2, null, null);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(FishCrypto.w("N1.ypY7CsHxyx4RC4h1xA9tj7VEi4dlOK2hN9nT5kis7XM8lpE1DI17FykZplnI8YAe7OZ2LfPEmaDMeSau8ylBTA==", strTrim));
        gVar.b(strI != null ? strI : "");
        JSONObject jSONObjectOptJSONObject = jSONObjectD.optJSONObject("headers");
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
        if (jSONObjectD.optBoolean("m3u8") || httpUrl.toString().toLowerCase(Locale.US).contains(".m3u8")) {
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
        String strM402 = "id";
        JSONObject jSONObjectD = d("detail", jSONObject.put(strM402, str));
        JSONObject jSONObjectOptJSONObject = jSONObjectD.optJSONObject("vod");
        if (jSONObjectOptJSONObject == null) {
            return AbstractC0449a.b();
        }
        k kVarH = h(str, jSONObjectOptJSONObject);
        kVarH.l(FishCrypto.a(kVarH.a()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObjectD.optJSONArray("sources");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("episodes")) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    int i2 = 0;
                    while (true) {
                        int length = jSONArrayOptJSONArray.length();
                        strM463 = "name";
                        if (i2 >= length) {
                            break;
                        }
                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject3 != null) {
                            String strTrim = jSONObjectOptJSONObject3.optString("play_id", jSONObjectOptJSONObject3.optString(strM402, "")).trim();
                            if (!TextUtils.isEmpty(strTrim)) {
                                String strTrim2 = jSONObjectOptJSONObject3.optString(strM463, "").trim();
                                if (TextUtils.isEmpty(strTrim2)) {
                                    strTrim2 = "第" + (i2 + 1) + "集";
                                }
                                arrayList3.add(n(strTrim2) + "$" + strTrim);
                            }
                        }
                        i2++;
                    }
                    if (!arrayList3.isEmpty()) {
                        String strTrim3 = jSONObjectOptJSONObject2.optString(strM463).trim();
                        if (TextUtils.isEmpty(strTrim3)) {
                            strTrim3 = "线路" + (arrayList.size() + 1);
                        }
                        arrayList.add(n(strTrim3));
                        arrayList2.add(TextUtils.join("#", arrayList3));
                    }
                }
            }
        }
        C0294s1.e(arrayList, arrayList2);
        C0294s1.c(this.d, arrayList);
        String strM105 = "$$$";
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
        jSONObject.put("tid", obj);
        jSONObject.put("page", i);
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
        jSONObject.put("extend", jSONObject2);
        return g(i, d("category", jSONObject));
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
            throw new IOException("App88 bridge returned no response");
        }
        JSONObject jSONObject = new JSONObject(str);
        Object objOpt = jSONObject.opt("moyufucking");
        if (jSONObject.length() == 1 && (objOpt instanceof String)) {
            String str2 = (String) objOpt;
            if (!TextUtils.isEmpty(str2)) {
                byte[] bArrS = FishCrypto.s("N1.kT/cpdDqlJ+jKU0FijBY0hzuipV3GS9+C1YmVFrQ1B/LHqriOVbELxc06QZ3Lm7C8bvMuTzmFqgDwf1h6omh0vKmv4XSJNrWk9fLyMEBSCU=", "N1.UqJ1QtTbb/FRFsWmN75B1+aVb4cDQPObPX/8nHZ1KdrZMG3tElod7ovqgj/PLX3CZ79Ve0JwgdqcfkFiAXpHX0bkamuKS+gmNaZYx9gJ928=", Base64.decode(str2, 0));
                if (bArrS != null) {
                    return new JSONObject(new String(bArrS, StandardCharsets.UTF_8));
                }
                throw new IOException("App88 bridge response decryption failed");
            }
        }
        throw new IOException("App88 bridge response envelope is invalid");
    }

    public static BridgeEndpoint c(String str) {
        String str2;
        String str3 = "";
        String strTrim = str == null ? "" : str.trim();
        boolean zStartsWith = strTrim.startsWith("{");
        String strM75 = "site";
        if (zStartsWith) {
            try {
                JSONObject jSONObject = new JSONObject(strTrim);
                strTrim = jSONObject.optString("php", jSONObject.optString("url", jSONObject.optString("api", ""))).trim();
                String strTrim2 = jSONObject.optString("playname", "").trim();
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
        String strQueryParameter2 = httpUrlBuild.queryParameter("bridge");
        if ((TextUtils.isEmpty(strQueryParameter2) || "app88".equalsIgnoreCase(strQueryParameter2)) && !TextUtils.isEmpty(str3)) {
            return new BridgeEndpoint(httpUrlBuild.toString(), str3.trim(), str2);
        }
        return null;
    }

    public static JSONObject f() throws JSONException {
        boolean z = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strQ = q(Build.VERSION.RELEASE, String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MODEL;
        String strM31 = "Android";
        String strQ2 = q(str, strM31);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("schema", 1);
        jSONObject.put("uuid", UUID.randomUUID().toString());
        jSONObject.put("did", UUID.randomUUID().toString());
        byte[] bArr = new byte[8];
        g.nextBytes(bArr);
        StringBuilder sb = new StringBuilder(16);
        for (int i = 0; i < 8; i++) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(bArr[i] & 255)));
        }
        jSONObject.put("androidId", sb.toString());
        jSONObject.put("createdAt", jCurrentTimeMillis);
        jSONObject.put("updatedAt", jCurrentTimeMillis);
        String str2 = Build.MODEL;
        jSONObject.put("name", q(str2, strM31));
        jSONObject.put("model", strQ2);
        String str3 = Build.DEVICE;
        String strM32 = "android";
        jSONObject.put("device", q(str3, strM32));
        jSONObject.put("brand", q(Build.BRAND, strM31));
        jSONObject.put("manufacturer", q(Build.MANUFACTURER, strM31));
        String str4 = Build.PRODUCT;
        jSONObject.put("product", q(str4, strM32));
        jSONObject.put("hardware", q(Build.HARDWARE, strM32));
        jSONObject.put("bootloader", q(Build.BOOTLOADER, "unknown"));
        String str5 = Build.DISPLAY;
        String strM416 = "release-keys";
        jSONObject.put("display", q(str5, strM416));
        jSONObject.put("host", q(Build.HOST, strM32));
        jSONObject.put("tags", q(Build.TAGS, strM416));
        jSONObject.put("type", q(Build.TYPE, "user"));
        String str6 = Build.FINGERPRINT;
        jSONObject.put("finger", q(str6, "android/unknown/unknown:user/release-keys"));
        jSONObject.put("version", strQ);
        jSONObject.put("sdkInt", Math.max(1, Build.VERSION.SDK_INT));
        String strQ3 = q(str6, "");
        Locale locale = Locale.US;
        String lowerCase = strQ3.toLowerCase(locale);
        String lowerCase2 = q(str2, "").toLowerCase(locale);
        String lowerCase3 = q(str4, "").toLowerCase(locale);
        if (!lowerCase.startsWith("generic")) {
            String strM193 = "emulator";
            if (!lowerCase.contains(strM193) && !lowerCase2.contains("google_sdk") && !lowerCase2.contains(strM193) && !lowerCase3.contains("sdk")) {
                z = true;
            }
        }
        jSONObject.put("isPhysicalDevice", z);
        String strQ4 = q(Build.ID, "release");
        StringBuilder sbR = com.github.catvod.spider.merge.D.b.r("Mozilla/5.0 (Linux; Android ", strQ, "; ", strQ2, " Build/");
        sbR.append(strQ4);
        sbR.append(") AppleWebKit/537.36 Chrome/122.0 Mobile Safari/537.36");
        jSONObject.put("userAgent", sbR.toString());
        return jSONObject;
    }

    public static String g(int i, JSONObject jSONObject) {
        int i2 = i;
        ArrayList arrayListI = i(jSONObject.optJSONArray("list"));
        int iOptInt = jSONObject.optInt("page", i2);
        if (iOptInt > 0) {
            i2 = iOptInt;
        }
        int iOptInt2 = jSONObject.optInt("pagecount", jSONObject.optInt("pages", i2));
        if (iOptInt2 <= 0) {
            iOptInt2 = i2;
        }
        int iOptInt3 = jSONObject.optInt("limit", 21);
        return AbstractC0449a.c(i2, iOptInt2, iOptInt3 > 0 ? iOptInt3 : 21, Math.max(jSONObject.optInt("total", arrayListI.size()), arrayListI.size()), arrayListI);
    }

    public static k h(String str, JSONObject jSONObject) {
        String str2 = str;
        k kVar = new k();
        String strOptString = jSONObject.optString("id", str2);
        if (!TextUtils.isEmpty(strOptString)) {
            str2 = strOptString;
        }
        kVar.n(str2);
        kVar.o(jSONObject.optString("name"));
        kVar.p(jSONObject.optString("pic"));
        kVar.s(jSONObject.optString("remarks"));
        kVar.u(jSONObject.optString("year"));
        kVar.k(jSONObject.optString("area"));
        kVar.j(jSONObject.optString("actor"));
        kVar.m(jSONObject.optString("director"));
        kVar.i(jSONObject.optString("type", jSONObject.optString("class", "")));
        kVar.l(jSONObject.optString("content", jSONObject.optString("blurb", "")));
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
                String strTrim = jSONObjectOptJSONObject.optString("id").trim();
                String strTrim2 = jSONObjectOptJSONObject.optString("name").trim();
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
        String strM570 = " is too large";
        String strM223 = "App88 ";
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
        String strM83 = "method";
        String strM31 = "GET";
        String strTrim = jSONObject.optString(strM83, strM31).trim();
        Locale locale = Locale.US;
        String upperCase = strTrim.toUpperCase(locale);
        if (!strM31.equals(upperCase) && !"POST".equals(upperCase)) {
            throw new IOException("App88 bridge target method is not allowed");
        }
        HttpUrl httpUrl = HttpUrl.parse(jSONObject.optString("url").trim());
        if (httpUrl != null) {
            String lowerCase = httpUrl.encodedPath().toLowerCase(locale);
            if (!lowerCase.endsWith(".m3u8") && !lowerCase.endsWith(".mp4") && !lowerCase.endsWith(".ts") && !lowerCase.endsWith(".m4s") && !lowerCase.endsWith(".mpd") && !lowerCase.endsWith(".aac") && !lowerCase.endsWith(".key")) {
                Request.Builder builderUrl = new Request.Builder().url(httpUrl);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
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
                                throw new IOException("App88 bridge request headers are too large");
                            }
                            try {
                                builderUrl.header(next, strOptString);
                                if ("content-type".equalsIgnoreCase(next)) {
                                    str = strOptString;
                                }
                            } catch (IllegalArgumentException e) {
                                throw new IOException("App88 bridge request header is invalid", e);
                            }
                        }
                    }
                }
                String strOptString2 = jSONObject.optString("body_b64");
                if (!strM31.equals(upperCase)) {
                    if (TextUtils.isEmpty(strOptString2)) {
                        bArrDecode = new byte[0];
                    } else {
                        int length2 = strOptString2.length();
                        String strM219 = "App88 bridge request body is too large";
                        if (length2 > 2796210) {
                            throw new IOException(strM219);
                        }
                        try {
                            bArrDecode = Base64.decode(strOptString2, 0);
                            if (bArrDecode.length > 2097152) {
                                throw new IOException(strM219);
                            }
                        } catch (IllegalArgumentException e2) {
                            throw new IOException("App88 bridge request body is invalid", e2);
                        }
                    }
                    builderUrl.post(RequestBody.create(TextUtils.isEmpty(str) ? null : MediaType.parse(str), bArrDecode));
                } else {
                    if (!TextUtils.isEmpty(strOptString2)) {
                        throw new IOException("App88 bridge GET request contains a body");
                    }
                    builderUrl.get();
                }
                Response responseK = X1.K(builderUrl.build(), o(j));
                try {
                    ResponseBody responseBodyBody = responseK.body();
                    TargetReply targetReply = new TargetReply(responseK.code(), Base64.encodeToString((responseBodyBody == null || responseK.isRedirect()) ? new byte[0] : k(responseBodyBody, "target response", 2097152), 2), m(responseK.headers()));
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
        throw new IOException("App88 bridge target URL is invalid");
    }

    public static JSONObject m(Headers headers) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        int length = 0;
        for (String str : headers.names()) {
            String strJoin = TextUtils.join(", ", headers.values(str));
            i++;
            Charset charset = StandardCharsets.UTF_8;
            length += strJoin.getBytes(charset).length + str.getBytes(charset).length;
            if (i > 64 || length > 16384) {
                throw new IOException("App88 bridge response headers are too large");
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
            String strM427 = "#";
            String strM108 = " ";
            strK = com.github.catvod.spider.merge.D.b.k(str, strM427, strM108, "$", strM108);
        }
        return TextUtils.isEmpty(strK) ? "播放" : strK;
    }

    public static long o(long j) throws IOException {
        long jElapsedRealtime = j - SystemClock.elapsedRealtime();
        if (jElapsedRealtime > 0) {
            return Math.max(1L, Math.min(15000L, jElapsedRealtime));
        }
        throw new IOException("App88 bridge request deadline exceeded");
    }

    public static boolean p(JSONObject jSONObject) {
        return jSONObject.optString("uuid").replace("-", "").matches("[0-9a-fA-F]{32}") && !TextUtils.isEmpty(jSONObject.optString("did")) && jSONObject.optString("androidId").matches("[0-9a-fA-F]{16}") && jSONObject.optLong("createdAt") > 0 && jSONObject.optLong("updatedAt") > 0;
    }

    public static String q(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
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

    public final synchronized JSONObject d(String str, JSONObject jSONObject) {
        try {
        } catch (BridgeStateException e) {
            if ("init".equals(str) || this.e.length() == 0) {
                throw e;
            }
            this.c = "";
            e("init", new JSONObject().put("device", this.e));
            return e(str, jSONObject);
        }
        return e(str, jSONObject);
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

    public final JSONObject e(String str, JSONObject jSONObject) throws JSONException, IOException {
        TargetReply targetReply;
        boolean z;
        if (TextUtils.isEmpty(this.a)) {
            throw new IOException("App88 bridge is not configured");
        }
        JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : new JSONObject(jSONObject.toString());
        String str2 = this.c;
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 300000;
        int i = 0;
        while (i < 128) {
            if (SystemClock.elapsedRealtime() >= jElapsedRealtime) {
                throw new IOException("App88 bridge request deadline exceeded");
            }
            String strM193 = "action";
            String strM379 = "prepare";
            String strM545 = "scene";
            JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v(strM193, strM379, strM545, str);
            jSONObjectV.put("params", jSONObject2);
            jSONObjectV.put("device_id", this.b);
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            String strM471 = "state";
            if (!zIsEmpty) {
                jSONObjectV.put(strM471, str2);
            }
            JSONObject jSONObjectJ = j(jSONObjectV, o(jElapsedRealtime));
            String strTrim = jSONObjectJ.optString(strM471, str2).trim();
            String strM346 = "result";
            JSONObject jSONObjectOptJSONObject = jSONObjectJ.optJSONObject(strM346);
            if (jSONObjectOptJSONObject != null) {
                this.c = strTrim;
                return jSONObjectOptJSONObject;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectJ.optJSONObject("request");
            String strM382 = "ticket";
            String strTrim2 = jSONObjectJ.optString(strM382).trim();
            if (jSONObjectOptJSONObject2 == null || TextUtils.isEmpty(strTrim2)) {
                throw new IOException("App88 bridge prepare response is invalid");
            }
            try {
                targetReply = l(jSONObjectOptJSONObject2, jElapsedRealtime);
                z = true;
            } catch (IOException e) {
                if (!"play".equals(str)) {
                    throw e;
                }
                targetReply = new TargetReply(599, "", new JSONObject());
                z = false;
            }
            if (z && jSONObjectJ.has(strM471)) {
                this.c = strTrim;
            }
            JSONObject jSONObjectV2 = com.github.catvod.spider.merge.D.b.v(strM193, "consume", strM545, str);
            jSONObjectV2.put(strM382, strTrim2);
            jSONObjectV2.put("status", targetReply.a);
            jSONObjectV2.put("headers", targetReply.b);
            jSONObjectV2.put("body_b64", targetReply.c);
            JSONObject jSONObjectJ2 = j(jSONObjectV2, o(jElapsedRealtime));
            String strTrim3 = jSONObjectJ2.optString(strM471, strTrim).trim();
            JSONObject jSONObjectOptJSONObject3 = jSONObjectJ2.optJSONObject(strM346);
            if (jSONObjectOptJSONObject3 != null) {
                this.c = strTrim3;
                return jSONObjectOptJSONObject3;
            }
            if (jSONObjectJ2.optBoolean("terminal") || !jSONObjectJ2.optBoolean("next")) {
                throw new IOException("App88 bridge consume response is invalid");
            }
            i++;
            str2 = strTrim3;
            jSONObject2 = jSONObject2;
        }
        throw new IOException("App88 bridge request exceeded round limit");
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

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
    
        if (r2 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(Context context, String str) throws Throwable {
        JSONObject jSONObject;
        Context context2 = context;
        String strA = a(str);
        BridgeEndpoint bridgeEndpointC = c(strA);
        if (bridgeEndpointC == null) {
            HttpUrl httpUrlResolve = HttpUrl.parse(strA);
            if (httpUrlResolve != null) {
                int i = 0;
                while (true) {
                    String strM199 = "App88 remote ext request failed";
                    if (i > 3) {
                        throw new IOException(strM199);
                    }
                    Response responseK = X1.K(new Request.Builder().url(FishCrypto.w("N1.ypY7CsHxyx4RC4h1xA9tj7VEi4dlOK2hN9nT5kis7XM8lpE1DI17FykZplnI8YAe7OZ2LfPEmaDMeSau8ylBTA==", httpUrlResolve.toString())).get().build(), 15000L);
                    try {
                        if (responseK.isRedirect()) {
                            String strTrim = responseK.header("Location", "").trim();
                            httpUrlResolve = TextUtils.isEmpty(strTrim) ? null : httpUrlResolve.resolve(strTrim);
                            if (httpUrlResolve == null || i == 3) {
                                throw new IOException("App88 remote ext redirect is invalid");
                            }
                            responseK.close();
                            i++;
                        } else {
                            if (!responseK.isSuccessful() || responseK.body() == null) {
                                throw new IOException(strM199);
                            }
                            String str2 = new String(k(responseK.body(), "remote ext", 65536), StandardCharsets.UTF_8);
                            responseK.close();
                            bridgeEndpointC = c(a(str2));
                        }
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
            throw new IllegalArgumentException("App88 bridge URL is invalid");
        }
        super.init(context2, bridgeEndpointC.a);
        this.a = bridgeEndpointC.a;
        this.d = TextUtils.isEmpty(bridgeEndpointC.c) ? "" : n(bridgeEndpointC.c);
        this.c = "";
        String str3 = bridgeEndpointC.b;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext != null) {
            context2 = applicationContext;
        }
        StringBuilder sb = new StringBuilder("profile_");
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(com.github.catvod.spider.merge.D.b.B("com.himrsc.viz|", str3).getBytes(StandardCharsets.UTF_8));
        StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
        for (byte b : bArrDigest) {
            sb2.append(String.format(Locale.US, "%02x", Integer.valueOf(b & 255)));
        }
        sb.append(sb2.toString().substring(0, 32));
        String string = sb.toString();
        synchronized (h) {
            SharedPreferences sharedPreferences = context2.getSharedPreferences("app88_device_profiles", 0);
            try {
                jSONObject = new JSONObject(sharedPreferences.getString(string, ""));
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            if (!p(jSONObject)) {
                jSONObject = f();
                if (!sharedPreferences.edit().putString(string, jSONObject.toString()).commit()) {
                    throw new IOException("App88 device profile persistence failed");
                }
            }
        }
        this.e = jSONObject;
        this.b = jSONObject.optString("did").trim();
        d("init", new JSONObject().put("device", this.e));
        if (TextUtils.isEmpty(this.c)) {
            throw new IOException("App88 bridge state is missing");
        }
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
        byte[] bArrT = FishCrypto.t("N1.kT/cpdDqlJ+jKU0FijBY0hzuipV3GS9+C1YmVFrQ1B/LHqriOVbELxc06QZ3Lm7C8bvMuTzmFqgDwf1h6omh0vKmv4XSJNrWk9fLyMEBSCU=", "N1.UqJ1QtTbb/FRFsWmN75B1+aVb4cDQPObPX/8nHZ1KdrZMG3tElod7ovqgj/PLX3CZ79Ve0JwgdqcfkFiAXpHX0bkamuKS+gmNaZYx9gJ928=", "N1.GkkSOFdKXW5JFcySoqVFokMKCs9mWDmsBe9w2SU5B8WdyK2feJETyLm3XmelIhjYNvaKSs9FbORXbiRxhmRGrQ==", "N1.QfUAw/7WTf0X+tpyZfk3BWO6D9qmAcG0ZLVQaPifRfrJwtIec1fiuMT1MwuBIh6IXovaukTj/uiGTYR2mDoa/WqnaiuB5w8iEnaLBnsvfQkRcM/zP777RKfPJ00bMKDpKCngcMygeu4Qs0k0zdexlg==", string.getBytes(charset));
        if (bArrT == null) {
            throw new IOException("App88 bridge request encryption failed");
        }
        Response responseK = X1.K(new Request.Builder().url(this.a).post(RequestBody.create(f, new JSONObject().put("moyufucking", Base64.encodeToString(bArrT, 2)).toString())).build(), j);
        try {
            if (responseK.isRedirect()) {
                throw new IOException("App88 bridge redirect is not allowed");
            }
            ResponseBody responseBodyBody = responseK.body();
            if (responseBodyBody == null) {
                throw new IOException("App88 bridge returned no response");
            }
            JSONObject jSONObjectB = b(new String(k(responseBodyBody, "bridge response", 4194304), charset));
            if (jSONObjectB.optBoolean("ok")) {
                JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("data");
                if (jSONObjectOptJSONObject == null) {
                    throw new IOException("App88 bridge data is missing");
                }
                responseK.close();
                return jSONObjectOptJSONObject;
            }
            boolean zOptBoolean = jSONObjectB.optBoolean("reset");
            String strM177 = "error";
            if (zOptBoolean) {
                throw new BridgeStateException(jSONObjectB.optString(strM177, "App88 bridge state expired"));
            }
            throw new IOException(jSONObjectB.optString(strM177, "App88 bridge service failed"));
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

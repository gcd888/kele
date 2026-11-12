package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.KaiFan;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0294s1;
import com.github.catvod.spider.merge.A.C0297t1;
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
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.CallableC0363l;
import com.github.catvod.spider.merge.p000a.ThreadFactoryC0365m;
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
import com.github.catvod.spider.merge.p017u.C;
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
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class KaiFan extends Spider {
    public final Set a = Collections.synchronizedSet(new HashSet());
    public volatile OkHttpClient b;
    public volatile ThreadPoolExecutor c;
    public volatile long d;
    public String e;
    public String f;
    public String g;
    public long h;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f57short = {2551, 984, 983, 960, 2364, 2355, 2340, 3099, 3077, 3096, 3076, 3123, 3082, 3077, 3072, 3096, 3081, 3102, 3103, 2445, 2440, 2450, 2453, 3150, 3147, 3153, 3158, 1055, 1032, 1118, 1054, 1049, 1053, 1131, 1049, 1055, 1114, 1028, 1090, 1039, 1099, 1114, 1095, 1027, 1099, 1114, 1095, 1107, 1099, 1105, 1115, 1089, 1099, 1114, 1116, 1089, 1099, 1091, 1092, 1054, 1055, 1032, 1037, 1043, 1099, 1132, 1032, 1041, 1044, 1130, 1049, 1053, 1054, 1258, 1261, 1263, 1255, 2680, 2687, 2685, 2677, 2326, 2304, 2308, 2327, 2310, 2317, 1934, 1949, 2714, 2699, 2701, 2703, 568, 548, 553, 561, 1634, 1637, 1659, 2311, 2310, 2383, 2372, 2341, 2367, 2387, 2340, 2335, 2387, 2308, 2382, 2387, 2375, 2337, 2387, 2339, 2389, 1747, 1734, 1759, 1733, 1753, 1746, 1747, 1769, 1759, 1746, 1480, 1477, 1502, 1481, 1487, 1496, 2972, 2974, 2965, 2964, 3109, 3116, 3121, 3118, 3106, 3127, 2107, 2102, 2098, 2103, 2102, 2081, 2080, 2830, 2847, 2847, 2819, 2822, 2828, 2830, 2843, 2822, 2816, 2817, 2880, 2839, 2882, 2818, 2847, 2826, 2824, 2874, 2877, 2851, 726, 713, 708, 709, 719, 655, 717, 720, 660, 2121, 2136, 2136, 2116, 2113, 2123, 2121, 2140, 2113, 2119, 2118, 2055, 2124, 2121, 2139, 2112, 2051, 2128, 2117, 2116, 26380, 26271, 897, 997, 1013, 1006, 897, 27549, 23726, -26952, -30642, 24740, 24887, 1065, 1101, 1117, 1094, 1065, 28200, 23302, -28400, -28698, -28921, 22215, 24896, 23536, -25187, 23425, 30391, -28906, 25653, 20734, -27331, 24896, -27399, -28106, 2519, 2502, 2517, 2516, 2498, 1840, 1840, 1840, 1715, 1726, 2515, 2514, 2499, 2518, 2526, 2523, 589, 596, 607, 2095, 2090, 2093, 2086, 2096, 1045, 1050, 1046, 1054, 1889, 1908, 1901, 1911, 1899, 1888, 1889, 1911, 3040, 3061, 3052, 3062, 3050, 3041, 3040, 3034, 3052, 3041, 1419, 1418, 1475, 1480, 1449, 1459, 1503, 1448, 1427, 1503, 1416, 1474, 1503, 1483, 1453, 1503, 1455, 1497, 1111, -30334, 20546, 26565, 23925, -25832, 23812, 28722, -30317, 25264, 22139, -27720, 26565, -28036, -27469, 553, 3018, 3027, 3033, 3032, 3023, 3015, 3019, 3032, 3009, 999, 997, 1010, 1001, 1012, 3032, 3029, 3022, 3033, 3039, 3016, 3027, 3022, 2280, 2277, 2284, 2297, 1344, 1363, 1348, 1344, 1353, 1365, 1361, 1346, 2555, 2551, 2550, 2540, 2557, 2550, 2540, 23282, -25441, 2608, 2621, 2610, 2619, 21746, 31172, -32667, 27462, 26402, 27786, 22636, 32427, 30012, -31124, 2988, -25718, -25275, -28789, 25768, 1101, 1065, 1081, 1058, 1101, 31611, 22426, 19040, 22356, -27360, 836, 833, 859, 860, 1544, 1553, 1562, 1569, 1554, 1567, 1552, 1561, 29737, 22274, 21602, 31060, 29701, 22756, 684, 701, 672, 684, 759, 680, 692, 697, 689, 694, 739, 760, 699, 688, 697, 682, 683, 701, 684, 741, 685, 684, 702, 757, 736, 27979, -24661, 28551, 24475, 17992, 31917, 2752, 2754, 2775, 2758, 2756, 2764, 2769, 2778, 524, 529, 540, 3147, 3162, 3164, 3166, 22441, -27095, 22978, -24657, 21700, 31417, 31188, 21813, -27685, -29395, 347, 347, 1407, 1406, 2023, 2170, 1301, 857, 748, 750, 2998, 2997, 1900, 1891, 1902, 1916, 1916, 412, 384, 413, 411, 1206, 1194, 1198, 1213, 3086, 3101, 3082, 3086, 630, 635, 628, 637, 1441, 1457, 1450, 1477, 24674, 25289, 24242, 28240, -28420, -29174, 28257, 26017, 1572, 1606, 1637, 1655, 1633, 1586, 1584, 1572, 28216, 22795, -27875, -29205, 2555, 2529, 2445, 2554, 2497, 2445, 2522, 2448, 2445, 2457, 2443, 2447, 2557, 2442, 2461, 2523, 2448, 2444, 2450, 2525, 2694, 2699, 2250, 2245, 2249, 2241, 1578, 1587, 1593, 2592, 2615, 2623, 2611, 2592, 2617, 1642, 1661, 1585, 1643, 1644, 1640, 1566, 1586, 1593, 1537, 1580, 1590, 1584, 1582, 1599, 1644, 1640, 1175, 1163, 1163, 1167, 1279, 21487, 21407, 27875, 23504, -28218, -28880, 2150, 2167, 2161, 2163, 2968, 2953, 2959, 2957, 2955, 2951, 2973, 2950, 2972, 854, 851, 855, 851, 846, 2080, 2107, 2080, 2101, 2104, 22285, -28320, 2093, 2121, 2137, 2114, 2093, 28029, 27491, -25324, -31774, 2910, 2889, 2889, 2900, 2889, 816, 831, 826, 822, 829, 807, 812, 822, 801, 801, 828, 801, 1642, 1638, 1645, 1644, 1522, 1518, 1518, 1514, 1434, 1522, 1503, 1499, 1502, 1503, 1480, 1481, 1434, 20914, 20918, -28509, -29099, 1967, 2005, 2007, 2000, 2001, 2002, 2003, 2014, 2015, 2010, 1962, 1963, 1960, 1932, 1986, 1988, 1928, 1930, 1988, 2009, 1997, 1973, 2009, 1966, 1941, 2009, 1934, 2009, 1961, 2015, 373, 354, 302, 372, 371, 375, 262, 259, 257, 293, 367, 365, 368, 257, 293, 362, 312, 256, 371, 375, 1567, 1561, 1551, 1560, 1607, 1547, 1549, 1551, 1540, 1566, 3113, 3134, 3133, 3134, 3113, 3134, 3113, 2484, 2473, 2482, 2492, 2482, 2485, 1129, 1131, 1131, 1133, 1144, 1148, 2039, 2037, 2037, 2035, 2022, 2018, 1979, 2042, 2039, 2040, 2033, 2019, 2039, 2033, 2035, 1173, 1175, 1175, 1169, 1156, 1152, 1241, 1169, 1178, 1175, 1179, 1168, 1181, 1178, 1171, 1598, 1581, 1570, 1579, 1577, 2574, 2562, 2562, 2566, 2564, 2568, 1685, 1665, 1664, 1692, 1691, 1670, 1693, 1678, 1685, 1664, 1693, 1691, 1690, 25241, 25354, 20572, 1556, 1660, 1617, 1621, 1616, 1617, 1606, 1607, 1556, 21023, -28310, 23718, 18791, 23907, 28033, 27453, 24829, 24831, 20846, 22543, 26861, -27071, -30537, 2331, 2324, 2329, 2315, 2315, 2333, 2315, 789, 794, 790, 798, 1820, 1809, 22326, -28960, 3306, 3214, 3230, 3205, 3306, -26157, -30939, 1595, 1588, 1585, 1577, 1592, 1583, 1582, 994, 1004, 1008, 3262, 3241, 3236, 3261, 3245, 315, 745, 29273, -26357, 2338, 2374, 2390, 2381, 2338, 21077, 25271, -25573, -32019, 30534, -25580, 3133, 3161, 3145, 3154, 3133, 16912, 22417, 26985, 2909, 2904, 2882, 2885, 23911, -31567, 21661, 31456, 18582, 23831, 25583, 419, 435, 424, 455, 25747, 25751, 23216, 27218, -29587, 29867, 25328, 26928, 2741, 2783, 2758, 2778, 2779, 2741, 25257, 21914, -24692, -32390, 24922, 27290, 2335, 2410, 2411, 2425, 2311, 2320, 2421, 2412, 2416, 2417, 2335, 24835, 22064, -25562, -32048, 2980, 2977, 3003, 3004, 1126, 1143, 1137, 1139, 1201, 1184, 1190, 1188, 275, 258, 260, 262, 256, 268, 278, 269, 279, 1849, 1832, 1838, 1836, 1834, 1830, 1852, 1831, 1853, 2587, 2590, 2586, 2590, 2563, 2335, 2330, 2334, 2330, 2311, 399, 404, 399, 410, 407, 3121, 3114, 3121, 3108, 3113, 1135, 3196, 3168, 3168, 3172, 3118, 3131, 3131, 2385, 2381, 2381, 2377, 2378, 2307, 2326, 2326, 3163, 3164, 3138, 1486, 1491, 1503, 1419, 19310, 26126, 22140, 
    1419, 1502, 1497, 1479, 552, 555, 551, 549, 552, 556, 555, 567, 560, 2936, 2939, 2942, 2919, 2937, 2919, 2937, 2919, 2936, 2689, 2689, 2698, 2585, 2561, 2585, 2665, 23929, 23817, -28110, 17718, 32609, 2665, 2561, 2589, 2589, 2585, 2586, -31983, -26197, 30600, 22502, -28277, 2246, 2230, 2222, 2230, 2246, 24534, 24486, 22700, -24895, 1932, 1993, 2004, 2008, 1932, 18793, 25609, 21627, 1932, 2044, 2020, 2044, 1932, 20636, 20716, 26042, 1932, 2009, 2014, 1984, 1932, 23637, -29747, 1235, 1209, 1189, 1201, 1237, 1235, 1208, 1189, 1201, 1237, 1267, 1208, 1188, 1209, 1200, 1269, 23917, 28763, 32010, 20971, 19473, 25651, 25877, 26452, 27007, 26472, 26476, 32268, 24805, 24530, 24482, 18159, 21692, 18028, 22926, 22498, 30643, 30270, 2535, 2544, 2470, 2534, 2471, 2491, 2491, 2495, 2492, 2544, 2549, 2528, 2528, 2452, 2449, 2451, 2492, 2450, 2532, 592, 21819, 21835, 24569, -31942, 26436, 598, 3308, 3323, 3245, 3309, 3206, 3233, 3237, 3254, 3233, 3254, 3224, 3255, 3311, 3231, 3226, 3224, 3255, 3225, 3311, 912, 951, 947, 928, 951, 928, 1010, 905, 24096, -32029, 26269, 911, 2321, 2310, 2384, 2320, 2321, 2381, 2390, 2386, 2396, 2391, 2373, 2392, 2380, 2381, 2385, 2406, 2386, 2396, 2368, 2373, 2377, 2392, 2378, 2378, 2382, 2390, 2379, 2397, 2373, 2397, 2396, 2383, 2384, 2394, 2396, 2406, 2384, 2397, 2373, 2392, 2380, 2381, 2385, 2390, 2379, 2384, 2371, 2392, 2381, 2384, 2390, 2391, 2373, 2378, 2384, 2398, 2391, 2392, 2381, 2380, 2379, 2396, 2373, 2386, 2396, 2368, 2373, 2384, 2383, 2373, 2385, 2392, 2391, 2397, 2389, 2396, 2373, 2381, 2384, 2394, 2386, 2396, 2381, 2320, 2405, 2378, 2323, 2402, 2308, 2307, 2404, 2405, 2378, 2323, 2402, 2407, 2335, 2405, 2378, 2404, 2322, 1109, 1088, 1100, 1066, 22915, -31424, 24894, 1068, 1736, 1746, 1726, 1737, 1778, 1726, 1769, 1699, 1726, 1706, 1740, 1720, 1724, 1710, 1726, 1742, 1768, 1696, 1697, 1727, 1774, 807, 24206, -32179, 26163, 801, 2236, 2235, 2199, 2204, 2212, 2185, 2195, 2197, 2187, 2202, 2234, 838, 22067, -28578, -32060, 25969, 20482, -31722, 24963, 27203, 28814, 27272, 23439, 18111, 27664, -25582, 18411, -31659, 1692, 1689, 1678, 1691, 1672, 1677, 1676, 1413, 1432, 1424, 1413, 1411, 1428, 458, 461, 465, 470, 1389, 1377, 1376, 1402, 1387, 1376, 1402, 1315, 1378, 1387, 1376, 1385, 1402, 1382, 2170, 2172, 2159, 2144, 2173, 2152, 2155, 2172, 2083, 2155, 2144, 2157, 2145, 2154, 2151, 2144, 2153, 1337, 1333, 1332, 1332, 1343, 1337, 1326, 1331, 1333, 1332, 707, 705, 732, 715, 714, 670, 722, 710, 711, 731, 732, 705, 730, 713, 722, 711, 730, 732, 733, 2695, 2693, 2712, 2703, 2702, 2778, 2708, 2712, 2713, 2713, 2706, 2708, 2691, 2718, 2712, 2713, 493, 508, 1015, 1009, 994, 1002, 1007, 998, 1009, 2726, 2738, 2739, 2735, 2728, 2741, 2734, 2749, 2726, 2739, 2734, 2728, 2729, 1360, 1351, 1297, 1361, 1338, 1309, 1305, 1290, 1309, 1290, 1316, 1291, 1363, 1366, 1362, 22940, 22103, 25812, 28990, 29012, 28605, -29619, 27640, -24639, 18629, 29330, 1946, 2034, 2030, 2030, 2026, 2025, 29827, 27242, 589, 549, 520, 524, 521, 520, 543, 542, 589, 22086, 19789, -29186, 19888, 30516, 22842, 27096, 31475, 24127, 27103, 25119, 23624, 21100, 27698, 483, 487, 1229, 1202, 1197, 1232, 1206, 1229, 1237, 1269, 1234, 1217, 1263, 1210, 1257, 1254, 1243, 1210, 1242, 1228, 1217, 1205, 1238, 1220, 1233, 1204, 1225, 1275, 1207, 1262, 1218, 1263, 1225, 1232, 1232, 1234, 1210, 1242, 1262, 1238, 1259, 1260, 1222, 1224, 1266, 1274, 1235, 1205, 1248, 1255, 1249, 1266, 1221, 1238, 1257, 1221, 1265, 1225, 1273, 1206, 1235, 1237, 1223, 1201, 1205, 1203, 1226, 1207, 1210, 1254, 1241, 1204, 1263, 1201, 1262, 1210, 1228, 1253, 1225, 1234, 1228, 1236, 1265, 1263, 1225, 1269, 1210, 1242, 1232, 1232, 1260, 1273, 1228, 1224, 1258, 1218, 1260, 1201, 1267, 1234, 1267, 1268, 1259, 1222, 1261, 1262, 1238, 1254, 1264, 1201, 1270, 1230, 1214, 3102, 3169, 3198, 3135, 3077, 3103, 3081, 3098, 3170, 3075, 3112, 3093, 3135, 3112, 3173, 3076, 3170, 3135, 3173, 3074, 3106, 3128, 3129, 3131, 3081, 3173, 3199, 3128, 3174, 3133, 3195, 3128, 3199, 3124, 3168, 3128, 3177, 3097, 3095, 3126, 3176, 3114, 3102, 3170, 3074, 3107, 3079, 3122, 3106, 3081, 3082, 3112, 3077, 3105, 3107, 3173, 3133, 3176, 3170, 3100, 3101, 3122, 3130, 3076, 3097, 3098, 3199, 3174, 3122, 3111, 3104, 3134, 3076, 3080, 3077, 3174, 3131, 3169, 3077, 3131, 3075, 3125, 3130, 3126, 3074, 3072, 3109, 3168, 3125, 3080, 3126, 3072, 3092, 3127, 3175, 3176, 3099, 3106, 3123, 3170, 3095, 3132, 3121, 3072, 3133, 3176, 3103, 3199, 3101, 3077, 3181, 1002, 1000, 1022, 1010, 993, 1010, 996, 1004, 1006, 1001, 992, 1088, 1112, 1088, 1072, 25373, 22193, 1072, 1112, 1092, 1092, 1088, 1072, 1002, 999, 1004, 1009, 983, 1002, 958, 956, 2857, 2902, 2889, 2825, 2846, 2861, 2858, 2819, 2861, 2836, 2830, 2836, 2911, 2826, 2871, 2830, 2888, 2817, 2832, 2826, 2869, 2869, 2866, 2865, 2856, 2831, 2871, 2850, 2845, 2911, 2879, 2817, 2866, 2854, 2896, 2863, 2848, 2848, 2870, 2846, 2856, 2827, 2846, 2836, 2900, 2863, 2892, 2863, 2864, 2902, 2858, 2822, 2816, 2854, 2830, 2846, 2892, 2836, 2864, 2866, 2853, 2820, 2829, 2870, 2819, 2878, 2845, 2870, 2825, 2901, 2825, 2836, 2898, 2899, 2818, 2817, 2868, 2824, 2865, 2848, 2861, 2871, 2861, 2837, 2898, 2865, 2869, 2862, 2870, 2906, 2906, 2364, 2371, 2396, 2373, 2370, 2356, 2309, 2397, 2315, 2307, 2352, 2328, 2334, 2329, 2360, 2347, 2353, 2366, 2343, 2342, 2347, 2311, 2368, 2371, 2344, 2356, 2312, 2315, 2353, 2332, 2362, 2326, 2393, 2308, 2342, 2340, 2378, 2311, 2304, 2339, 2324, 2338, 2393, 2324, 2325, 2344, 2326, 2337, 2308, 2334, 2361, 2325, 2326, 2310, 2331, 2337, 2314, 2331, 2364, 2364, 2305, 2362, 2323, 2368, 2306, 2307, 2369, 2339, 2304, 2369, 2378, 2328, 2338, 2367, 2334, 2375, 2357, 2346, 2333, 2357, 2355, 2340, 2328, 2360, 2369, 2332, 2360, 2340, 2306, 2332, 2379, 2320, 2343, 2327, 2362, 2333, 2334, 2343, 2323, 2338, 2362, 2320, 2342, 2333, 2309, 2372, 2308, 2374, 2325, 2326, 2336, 2325, 2325, 2366, 2331, 2304, 2378, 2371, 2373, 2362, 2373, 2355, 2340, 2328, 2326, 2367, 2305, 2378, 2331, 2366, 2324, 2324, 2338, 2337, 2340, 2344, 2379, 2375, 2338, 2304, 2321, 2368, 2327, 2363, 2366, 2311, 2306, 
    2369, 2304, 2304, 2347, 2339, 2309, 2383, 2383, 748, 718, 718, 712, 733, 729, 640, 744, 707, 718, 706, 713, 708, 707, 714, 2174, 2163, 2162, 2169, 2147, 2174, 2147, 2158, 3017, 3032, 3032, 3012, 3009, 3019, 3017, 3036, 3009, 3015, 3014, 2951, 3010, 3035, 3015, 3014, 2963, 2952, 3019, 3008, 3017, 3034, 3035, 3021, 3036, 2965, 3037, 3036, 3022, 2949, 2960, 1778, 1790, 1781, 1780, 1116, 1099, 1099, 1110, 1099, 1208, 1186, 1230, 1209, 1214, 1208, 1186, 1230, 1209, 1235, 1230, 1242, 1212, 1214, 1176, 1235, 1231, 1237, 1232, 1182, 25361, 26833, -24979, -32613, 2900, 2864, 2848, 2875, 2900, -24979, -32613, 2752, 2757, 2768, 2757, 28597, 25717, 21277, 22852, 30054, 26577, -27959, -29633, 22879, -24782, 1663, 1585, 1598, 1579, 1590, 1577, 1594, 1663, 18878, 23134, -28740, 32350, 24430, -29830, 27626, 24618, 23193, 21883, 22744, 26682, -26986, -30624, 21880, -27883, 2648, 2582, 2585, 2572, 2577, 2574, 2589, 2648, 17817, 22137, 27986, 22089, 29842, 24003, -25682, 739, 659, 651, 659, 739, 22030, 23639, 22219, 22223, -26662, -30420, 2537, 2539, 2558, 2543, 2541, 2533, 2552, 2547, 2505, 2533, 2532, 2558, 2543, 2532, 2558, 1572, 1573, 1588, 1569, 1577, 1580, 1539, 1583, 1582, 1588, 1573, 1582, 1588, 22642, -25057, -29563, 27440, -29961, -30539, 25220, -28382, 23217, -25380, -29114, 27123, 22595, 22119, 26681, 24203, -26394, 31570, 28443, 23673, 20728, -27546, 25501, -28602, 25659, 21291, -28938, 1475, 1520, 1523, 1535, 1527, 1837, 1832, 2217, 2206, 2199, 2200, 2194, 2202, 2195, 1648, 1726, 1668, 1736, 1667, 1749, 1736, 1756, 1720, 1694, 1750, 1751, 1688, 28498, 25746, 21714, 24819, -29561, 22626, -28114, -29480, 2102, 2100, 2083, 2110, 2104, 2105, 3318, 3316, 3299, 3318, 3303, 3316, 3299, 317, 301, 299, 288, 299, 1665, 1680, 1667, 1680, 1692, 1666, 2553, 2542, 2554, 2558, 2542, 2552, 2559, 2516, 2530, 2543, 465, 472, 471, 477, 469, 476, 1342, 1335, 1336, 1330, 1338, 1331, 280, 282, 285, 279, 1216, 1274, 1206, 1277, 1195, 1206, 1186, 1222, 1248, 1192, 1193, 1254, 272, 263, 275, 279, 263, 273, 278, 317, 267, 262, 2404, 2419, 2407, 2403, 2419, 2405, 2402, 969, 990, 968, 974, 983, 975, 904, 906, 925, 904, 921, 906, 925, 984, 26781, -26276, -26911, -30697, 2486, 2465, 2487, 2481, 2472, 2480, 2680, 2671, 2681, 2687, 2662, 2686, 2483, 2494, 2485, 2472, 2446, 2483, 2535, 2533, 2289, 2246, 2255, 2240, 2250, 2242, 2251, 25649, 28657, 24497, 27536, 17289, 22284, 21861, -32399, 2771, 2756, 2770, 2772, 2765, 2773, 2952, 2975, 2953, 2959, 2966, 2958, 880, 877, 871, 879, 865, 880, 2222, 2214, 2231, 2219, 2220, 2215, 624, 586, 518, 589, 539, 518, 530, 630, 592, 536, 537, 598, 3098, 3096, 3081, 1371, 1348, 1368, 1375, 1759, 1730, 1738, 1747, 1736, 1759, 1737, 1765, 1755, 1742, 878, 867, 871, 866, 867, 884, 885, 1978, 1981, 1955, 2166, 2171, 2160, 2157, 2123, 2166, 2082, 2080, 2915, 2913, 2928, 2458, 2456, 2441, 2557, -32132, 23503, 24054, -32214, 26015, 18062, 2093, 2063, 2063, 2057, 2076, 2072, 2113, 2089, 2050, 2063, 2051, 2056, 2053, 2050, 2059, 603, 633, 633, 639, 618, 622, 567, 607, 628, 633, 629, 638, 627, 628, 637, 1633, 1644, 1645, 1638, 1660, 1633, 1660, 1649, 970, 981, 969, 974, 1931, 1929, 1950, 1923, 1925, 1924, 3002, 2998, 2999, 2986, 2988, 2996, 3004, 1657, 1646, 1658, 1662, 1646, 1656, 1663, 1620, 1634, 1647, 294, 303, 288, 298, 290, 299, 1528, 1509, 1519, 1511, 1513, 1528, 991, 984, 973, 984, 985, 991, 1837, 1824, 1828, 1825, 1824, 1847, 1846, 1502, 1491, 1496, 1477, 1507, 1502, 1418, 1416, 1462, 1457, 1444, 1457, 1456, 1462, 549, 552, 556, 553, 552, 575, 574, 1138, 1151, 1140, 1129, 1103, 1138, 1062, 1060, 3161, 3167, 3148, 3139, 3166, 3165, 3138, 3167, 3161, 3186, 3144, 3167, 3167, 3138, 3167, 546, 569, 569, 521, 570, 567, 548, 561, 563, 2730, 2743, 2739, 2747, 2737, 2731, 2730, 2351, 2345, 1088, 1097, 1094, 1100, 1092, 1101, 2543, 2552, 2540, 2536, 2552, 2542, 2537, 2498, 2548, 2553, 395, 412, 394, 396, 405, 397, 1539, 1556, 1538, 1540, 1565, 1541, 3089, 3091, 3092, 3102, 1723, 1708, 1722, 1724, 1701, 1725, 2722, 2734, 2735, 2741, 2728, 2735, 2740, 2724, 906, 904, 911, 901, 1849, 1845, 1844, 1833, 1839, 1847, 1855, 1914, 27711, -25090, -28093, -29515, 1709, 1697, 1696, 1725, 1723, 1699, 1707, 1774, 30751, 23892, 18627, 22007, -26749, 25418, 26762, 29255, 26689, 26937, 28310, 26618, -25034, -32576, 27217, 24977, 29914, 27187, 26961, -26480, -28751, -29197, 19518, -27548, 27687, 26599, 22439, 25478, 26196, -28747, 26624, 31572, 22453, 19023, 22395, -27377, 949, 946, 935, 946, 931, 953, 939, 943, 949, 949, 943, 936, 929, 1535, 1480, 1473, 1486, 1476, 1484, 1477, 28333, 25965, 21805, 24844, -26875, 31142, 24569, -29715, 23804, -25967, 27545, 24665, 22516, 22512, -26907, -30701, 25321, 26921, 20948, 23076, 31842, 21977, 28070, 22205, 29798, 3132, 3131, 3129, 3121, 3095, 3131, 3130, 3104, 3121, 3130, 3104, 1091, 1092, 1094, 1102, 1149, 1090, 1103, 1102, 1092, 1128, 1092, 1093, 1119, 1102, 1093, 1119, 2453, 2463, 2455, 2456, 2463, 2448, 2465, 1780, 1784, 2207, 2179, 2179, 2183, 2295, 23578, 22083, 23775, 23771, -25138, -31944, 3163, 3143, 3143, 3139, 3123, 17203, -31872, 21794, -32458, 21673, -27964, 29040, 25913, 22107, 23258, -25020, 1083, 1144, 1062, 1120, 1069, 3165, 3148, 3148, 3152, 3157, 3167, 3165, 3144, 3157, 3155, 3154, 3091, 3140, 3089, 3153, 3148, 3161, 3163, 3177, 3182, 3184, 1159, 1220, 1241, 1181, 695, 680, 677, 676, 686, 750, 684, 689, 757, 1418, 1481, 1492, 1472, 1565, 1548, 1548, 1552, 1557, 1567, 1565, 1544, 1557, 1555, 1554, 1619, 1560, 1565, 1551, 1556, 1623, 1540, 1553, 1552, 3284, 3303, 3304, 3297, 3299, 1158, 1181, 1168, 1153, 1175, 1241, 1236, 1225, 1237, 1236, 1238, 1239, 1192, 1162, 1162, 1164, 1177, 1181, 1220, 1196, 1159, 1162, 1158, 1165, 1152, 1159, 1166, 1455, 1442, 1443, 1448, 1458, 1455, 1458, 1471, 723, 767, 766, 740, 757, 766, 740, 701, 708, 745, 736, 757, 411, 390, 403, 401, 387, 388, 410, -94, 1552, 1654, 1643, 1639, 1662, 1536, 1638, 1434, 1439, 1421, 1430, 1493, 1414, 1427, 1426, 24459, 19018, 1337, 1361, 1357, 1357, 1353, 1337, 2090, 2057, 2053, 2055, 2066, 2063, 2057, 2056, 21007, 18382, -26288, 21255, 23692, -25212, -31886, 1593, 
    1573, 1576, 1584, 1580, 1595, 1546, 1574, 1575, 1597, 1580, 1575, 1597, 465, 455, 451, 464, 449, 458, 481, 461, 460, 470, 455, 460, 470, 2982, 2992, 2996, 2983, 2998, 3005, 2966, 3002, 3003, 2977, 2992, 3003, 2977, 23706, 24392, -32090, 27861, 26596, 27724, 23669, 23557, 24099, 24049, -32737, 28268, 20685, -31527, 22058, -28601, 24309, 23847, -32567, 28346, 21720, 23292, 25762, 22835, -24738, 20972, 21054, -28720, 24995, 30834, 23018, 22396, -28399, 24483, 23665, -32353, 28652, 21902, 22799, -25199};
    public static final List i = Arrays.asList("1", "2", "3", "4", "20", "21", "22", "23");
    public static final List j = Arrays.asList("year", "area", "lang", "class", "sort");

    class BridgeFailure extends IOException {
        public final String a;

        public BridgeFailure(String str, String str2) {
            super(str2);
            this.a = str;
        }
    }

    class LimitFailure extends IOException {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f58short = {28338, 25970, 25511, 26041, -29870, -30448, 24560, 23256, -28537, 21729};

        public LimitFailure() {
            super("桥接数据超过大小限制");
        }
    }

    class Reply {
        public final int a;
        public final JSONObject b;
        public final byte[] c;

        public Reply(int i, JSONObject jSONObject, byte[] bArr) {
            this.a = i;
            this.b = jSONObject;
            this.c = bArr;
        }
    }

    class Run {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f59short = {3286, 3289, 3278, 1733, 1753, 1748, 1740};
        public final long a;
        public final long b;
        public int c;

        public Run(long j, String str) {
            this.a = j;
            String strM75 = "nav";
            this.b = KaiFan.g(strM75.equals(str) ? 45 : "play".equals(str) ? 30 : 25);
            this.c = strM75.equals(str) ? 24 : 12;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        long j2 = this.d;
        Run run = new Run(j2, "nav");
        try {
            String strP = p(h("nav", new JSONObject().put("with_filters", z), run), z);
            synchronized (this) {
                e(run.b, j2);
                this.g = new JSONObject().put("list", new JSONObject(strP).getJSONArray("list")).toString();
                this.h = g(60);
            }
            return strP;
        } catch (Exception e) {
            return j(e).toString();
        }
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        return str != null && str.matches("(?i).*\\.(m3u8|mp4|mpd|flv|mkv|ts)(?:$|[?&#].*)");
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        long j2 = this.d;
        Run run = new Run(j2, "home");
        try {
            synchronized (this) {
                try {
                    e(run.b, j2);
                    if (this.g != null && System.nanoTime() < this.h) {
                        return this.g;
                    }
                    String strS = s(h("home", new JSONObject(), run));
                    synchronized (this) {
                        e(run.b, j2);
                        this.g = strS;
                        this.h = g(60);
                    }
                    return strS;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            return i(e, 1);
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int iMax;
        String str3 = str;
        try {
            iMax = (int) Math.max(1L, Math.min(1000000L, Long.parseLong(str2.trim())));
        } catch (Exception unused) {
            iMax = 1;
        }
        long j2 = this.d;
        String strM234 = "search";
        Run run = new Run(j2, strM234);
        try {
            JSONObject jSONObject = new JSONObject();
            String strM285 = "wd";
            if (str3 == null) {
                str3 = "";
            }
            String strS = s(h(strM234, jSONObject.put(strM285, str3).put("page", iMax), run));
            e(run.b, j2);
            return strS;
        } catch (Exception e) {
            return i(e, iMax);
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        long j2 = this.d;
        String strM301 = "play";
        Run run = new Run(j2, strM301);
        String strM503 = "url";
        if (str2 != null) {
            try {
                if (str2.length() <= 32768 && str2.matches("yx1:[A-Za-z0-9_-]+")) {
                    JSONObject jSONObjectH = h(strM301, new JSONObject().put("episode_id", str2), run);
                    if (!"direct".equals(A("mode", jSONObjectH))) {
                        throw new IOException("播放 DTO 模式错误");
                    }
                    String string = f(A(strM503, jSONObjectH), false).toString();
                    String strA = A("format", jSONObjectH);
                    LinkedHashMap linkedHashMapL = l(jSONObjectH.getJSONObject("headers"), true);
                    HttpUrl httpUrlZ = z(string, Headers.of(linkedHashMapL));
                    w(httpUrlZ.host(), run.b, j2, true);
                    if (strA.isEmpty()) {
                        strA = n(httpUrlZ, linkedHashMapL, run);
                    }
                    if (!strA.isEmpty() && !Arrays.asList("application/x-mpegURL", "video/mp4", "application/dash+xml").contains(strA)) {
                        throw new IOException("播放 DTO 格式错误");
                    }
                    e(run.b, j2);
                    com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                    gVar.q(0);
                    gVar.C(string);
                    gVar.h(linkedHashMapL);
                    if (!strA.isEmpty()) {
                        gVar.f(strA);
                    }
                    return gVar.r();
                }
            } catch (Exception e) {
                return j(e).put(strM503, "").put("parse", 0).toString();
            }
        }
        throw new IOException("请刷新开饭影片详情后重新选集");
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strM234;
        KaiFan kaiFan = this;
        String strM545 = "$$$";
        String strM1 = "id";
        long j2 = kaiFan.d;
        String strM102 = "detail";
        Run run = new Run(j2, strM102);
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            String next = it.next();
                            kaiFan.e(run.b, run.a);
                            u(next);
                            JSONObject jSONObjectH = kaiFan.h(strM102, new JSONObject().put(strM1, next), run);
                            JSONObject jSONObject = jSONObjectH.getJSONObject("vod");
                            if (!next.equals(A(strM1, jSONObject))) {
                                throw new IOException("详情 DTO 编号不匹配");
                            }
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            JSONArray jSONArray = jSONObjectH.getJSONArray("lines");
                            int i2 = 0;
                            while (true) {
                                int length = jSONArray.length();
                                strM234 = "name";
                                if (i2 < length) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                    String str = strM1;
                                    String strM = m(A(strM234, jSONObject2));
                                    String str2 = strM102;
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator<String> it2 = it;
                                    JSONArray jSONArray2 = jSONObject2.getJSONArray("episodes");
                                    JSONArray jSONArray3 = jSONArray;
                                    int i3 = 0;
                                    while (i3 < jSONArray2.length()) {
                                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                                        JSONArray jSONArray4 = jSONArray2;
                                        String strA = A("episode_id", jSONObject3);
                                        String strM2 = m(A(strM234, jSONObject3));
                                        if (!strA.isEmpty()) {
                                            if (strA.length() > 32768 || !strA.matches("yx1:[A-Za-z0-9_-]+")) {
                                                throw new IOException("请刷新开饭影片详情后重新选集");
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            if (strM2.isEmpty()) {
                                                strM2 = String.valueOf(i3 + 1);
                                            }
                                            sb.append(strM2);
                                            sb.append("$");
                                            sb.append(strA);
                                            arrayList5.add(sb.toString());
                                        }
                                        i3++;
                                        jSONArray2 = jSONArray4;
                                        run = run;
                                    }
                                    Run run2 = run;
                                    if (!arrayList5.isEmpty()) {
                                        arrayList3.add(strM);
                                        arrayList4.add(TextUtils.join("#", arrayList5));
                                    }
                                    i2++;
                                    strM102 = str2;
                                    strM1 = str;
                                    it = it2;
                                    jSONArray = jSONArray3;
                                    run = run2;
                                }
                            }
                            String str3 = strM1;
                            Run run3 = run;
                            String str4 = strM102;
                            Iterator<String> it3 = it;
                            if (arrayList4.isEmpty()) {
                                throw new IOException("影片详情没有可用线路/选集");
                            }
                            k kVar = new k(next, m(A(strM234, jSONObject)), A("pic", jSONObject), A("remark", jSONObject));
                            kVar.j(A("actor", jSONObject));
                            kVar.m(A("director", jSONObject));
                            kVar.i(A("type", jSONObject));
                            kVar.k(A("area", jSONObject));
                            kVar.u(A("year", jSONObject));
                            kVar.l(A("content", jSONObject));
                            C0294s1.e(arrayList3, arrayList4);
                            C0294s1.c("开饭", arrayList3);
                            kVar.q(TextUtils.join(strM545, arrayList3));
                            kVar.r(TextUtils.join(strM545, arrayList4));
                            arrayList.add(kVar);
                            arrayList2.add(A("lang", jSONObject));
                            kaiFan = this;
                            strM102 = str4;
                            strM1 = str3;
                            it = it3;
                            run = run3;
                        } catch (Exception e) {
                            e = e;
                            return j(e).toString();
                        }
                    }
                    Run run4 = run;
                    JSONObject jSONObject4 = new JSONObject(com.github.catvod.spider.merge.p001b.g.y(arrayList));
                    JSONArray jSONArray5 = jSONObject4.getJSONArray("list");
                    for (int i4 = 0; i4 < jSONArray5.length(); i4++) {
                        jSONArray5.getJSONObject(i4).put("vod_lang", arrayList2.get(i4));
                    }
                    e(run4.b, run4.a);
                    return jSONObject4.toString();
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        throw new IOException("缺少影片编号");
    }

    private /* synthetic */ Object[] $host$dca6c5e1c5a7de15(Map<String, String> map) {
        return new Object[]{404, "text/plain; charset=utf-8", "无需本地代理"};
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int iMax;
        try {
            iMax = (int) Math.max(1L, Math.min(1000000L, Long.parseLong(str2.trim())));
        } catch (Exception unused) {
            iMax = 1;
        }
        long j2 = this.d;
        String strM199 = "category";
        Run run = new Run(j2, strM199);
        try {
            if (!i.contains(str)) {
                throw new IOException("开饭分类编号错误");
            }
            JSONObject jSONObjectPut = new JSONObject().put("tid", str).put("page", iMax);
            if (map != null) {
                for (String str3 : j) {
                    String str4 = map.get(str3);
                    if (str4 != null && !str4.isEmpty() && !"全部".equals(str4)) {
                        jSONObjectPut.put(str3, str4);
                    }
                }
            }
            String strS = s(h(strM199, jSONObjectPut, run));
            e(run.b, run.a);
            return strS;
        } catch (Exception e) {
            return i(e, iMax);
        }
    }

    public static String A(String str, JSONObject jSONObject) throws IOException {
        if (jSONObject.opt(str) instanceof String) {
            return (String) jSONObject.opt(str);
        }
        throw new IOException("DTO 文本字段错误");
    }

    public static byte[] c(int i2, String str) throws IOException {
        if (str.length() > ((((long) i2) + 2) / 3) * 4) {
            throw new LimitFailure();
        }
        int length = str.length() % 4;
        String strM360 = "桥接 Base64 格式错误";
        if (length != 0 || !str.matches("[A-Za-z0-9+/]*={0,2}")) {
            throw new IOException(strM360);
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length > i2) {
                throw new LimitFailure();
            }
            if (Base64.encodeToString(bArrDecode, 2).equals(str)) {
                return bArrDecode;
            }
            throw new IOException(strM360);
        } catch (IllegalArgumentException unused) {
            throw new IOException(strM360);
        }
    }

    public static ArrayList d(JSONArray jSONArray) throws JSONException, IOException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String strA = A("id", jSONObject);
            u(strA);
            arrayList.add(new k(strA, m(A("name", jSONObject)), A("pic", jSONObject), m(A("remark", jSONObject))));
        }
        return arrayList;
    }

    public static HttpUrl f(String str, boolean z) throws IOException {
        HttpUrl httpUrl = str == null ? null : HttpUrl.parse(str);
        if (httpUrl == null || str.length() > 16384 || str.matches("(?s).*\\p{Cntrl}.*") || !httpUrl.username().isEmpty() || !httpUrl.password().isEmpty() || httpUrl.fragment() != null || (z && !str.equals(httpUrl.toString()))) {
            throw new IOException("HTTP 地址格式错误");
        }
        return httpUrl;
    }

    public static long g(int i2) {
        return TimeUnit.SECONDS.toNanos(i2) + System.nanoTime();
    }

    public static String i(Exception exc, int i2) {
        return j(exc).put("page", i2).put("pagecount", 1).put("limit", 0).put("total", 0).toString();
    }

    public static JSONObject j(Exception exc) {
        String strX = x(exc instanceof IOException ? exc.getMessage() : "开饭 DTO 数据错误");
        return new JSONObject(com.github.catvod.spider.merge.p001b.g.d(strX)).put("error", strX).put("code", exc instanceof BridgeFailure ? ((BridgeFailure) exc).a : "CLIENT_ERROR");
    }

    public static LinkedHashMap l(JSONObject jSONObject, boolean z) throws IOException {
        String strM288 = "HTTP Headers 合同错误";
        try {
            o("", jSONObject);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashSet hashSet = new HashSet();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strA = A(next, jSONObject);
                if (next.matches("[!#$%&'*+.^_\\x60|~0-9A-Za-z-]+")) {
                    Locale locale = Locale.ROOT;
                    if (hashSet.add(next.toLowerCase(locale)) && !strA.matches("(?s).*[^\\x20-\\x7e].*") && strA.equals(strA.trim())) {
                        if (z && !Arrays.asList("user-agent", "referer", "origin", "accept", "accept-language", "accept-encoding", "range", "cookie", "authorization").contains(next.toLowerCase(locale))) {
                            throw new IOException("播放器 Headers 含非媒体字段");
                        }
                        linkedHashMap.put(next, strA);
                    }
                }
                throw new IOException(strM288);
            }
            return linkedHashMap;
        } catch (IOException e) {
            throw e;
        } catch (Exception unused) {
            throw new IOException(strM288);
        }
    }

    public static String m(String str) {
        return str.replace('$', ' ').replace('#', ' ').replace('\r', ' ').replace('\n', ' ').trim();
    }

    public static void o(String str, JSONObject jSONObject) throws IOException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!next.equals(str)) {
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            if (jSONObject2.toString().getBytes(StandardCharsets.UTF_8).length <= 65536) {
            } else {
                throw new LimitFailure();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception unused) {
            throw new IOException("桥接控制字段错误");
        }
    }

    public static String p(JSONObject jSONObject, boolean z) throws JSONException, IOException {
        List list;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("classes");
        int i2 = 0;
        while (true) {
            int length = jSONArray.length();
            List list2 = i;
            String strM116 = "name";
            if (i2 >= length) {
                if (hashSet.size() != list2.size()) {
                    throw new IOException("导航分类不完整");
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JSONObject jSONObject2 = jSONObject.getJSONObject("filters");
                if (z) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        JSONArray jSONArray2 = jSONObject2.getJSONArray(str);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet2 = new HashSet();
                        int i3 = 0;
                        while (true) {
                            int length2 = jSONArray2.length();
                            list = j;
                            if (i3 < length2) {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                                String strA = A("key", jSONObject3);
                                if (!list.contains(strA) || !hashSet2.add(strA)) {
                                    throw new IOException("筛选 DTO 字段错误");
                                }
                                ArrayList arrayList3 = new ArrayList();
                                JSONObject jSONObject4 = jSONObject2;
                                int i4 = 0;
                                for (JSONArray jSONArray3 = jSONObject3.getJSONArray("value"); i4 < jSONArray3.length(); jSONArray3 = jSONArray3) {
                                    JSONObject jSONObject5 = jSONArray3.getJSONObject(i4);
                                    arrayList3.add(new com.github.catvod.spider.merge.p001b.c(m(A("n", jSONObject5)), A("v", jSONObject5)));
                                    i4++;
                                    it = it;
                                    jSONArray2 = jSONArray2;
                                }
                                arrayList2.add(new com.github.catvod.spider.merge.p001b.d(strA, m(A(strM116, jSONObject3)), arrayList3));
                                i3++;
                                jSONObject2 = jSONObject4;
                            }
                        }
                        JSONObject jSONObject6 = jSONObject2;
                        Iterator it2 = it;
                        if (hashSet2.size() != list.size()) {
                            throw new IOException("筛选 DTO 不完整");
                        }
                        linkedHashMap.put(str, arrayList2);
                        it = it2;
                        jSONObject2 = jSONObject6;
                    }
                }
                return com.github.catvod.spider.merge.p001b.g.A(arrayList, d(jSONObject.getJSONArray("list")), linkedHashMap);
            }
            JSONObject jSONObject7 = jSONArray.getJSONObject(i2);
            String strA2 = A("id", jSONObject7);
            String strM = m(A(strM116, jSONObject7));
            if (!list2.contains(strA2) || !hashSet.add(strA2) || strM.isEmpty()) {
                throw new IOException("导航 DTO 错误");
            }
            arrayList.add(new com.github.catvod.spider.merge.p001b.b(strA2, strM, null));
            i2++;
        }
    }

    public static long q(long j2, long j3, String str, JSONObject jSONObject) throws IOException {
        Object objOpt = jSONObject.opt(str);
        if ((objOpt instanceof Integer) || (objOpt instanceof Long)) {
            Number number = (Number) objOpt;
            if (number.longValue() >= j2 && number.longValue() <= j3) {
                return number.longValue();
            }
        }
        throw new IOException("DTO 整数字段越界");
    }

    public static JSONObject r(byte[] bArr) throws IOException {
        try {
            JSONTokener jSONTokener = new JSONTokener(StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString());
            Object objNextValue = jSONTokener.nextValue();
            if ((objNextValue instanceof JSONObject) && jSONTokener.nextClean() == 0) {
                return (JSONObject) objNextValue;
            }
            throw new IOException("桥接 JSON 格式错误");
        } catch (IOException e) {
            throw e;
        } catch (Exception unused) {
            throw new IOException("桥接 UTF8/JSON 格式错误");
        }
    }

    public static String s(JSONObject jSONObject) throws JSONException, IOException {
        return new JSONObject(com.github.catvod.spider.merge.p001b.g.y(d(jSONObject.getJSONArray("list")))).put("page", q(1L, 1000000L, "page", jSONObject)).put("pagecount", q(1L, 1000000L, "pagecount", jSONObject)).put("limit", q(0L, 2147483647L, "limit", jSONObject)).put("total", q(0L, 2147483647L, "total", jSONObject)).toString();
    }

    public static String t(String str) throws Throwable {
        String strTrim;
        String strM432 = "{";
        if (str == null) {
            strTrim = "";
        } else {
            try {
                strTrim = str.trim();
            } catch (IOException e) {
                throw e;
            } catch (Exception unused) {
                throw new IOException("开饭 ext 仅接受 PHP 地址或 url 对象");
            }
        }
        if (!strTrim.startsWith(strM432) && !strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
            strTrim = FishCrypto.g(strTrim);
        }
        if (strTrim.trim().isEmpty()) {
            throw new IOException("请配置开饭 PHP 地址");
        }
        if (strTrim.trim().startsWith(strM432)) {
            JSONObject jSONObjectR = r(strTrim.trim().getBytes(StandardCharsets.UTF_8));
            if (jSONObjectR.length() != 1) {
                throw new IOException("ext 仅接受 url");
            }
            strTrim = A("url", jSONObjectR);
        }
        HttpUrl httpUrlF = f(strTrim.trim(), true);
        if (!httpUrlF.isHttps() && !"localhost".equals(httpUrlF.host()) && !"127.0.0.1".equals(httpUrlF.host()) && !"::1".equals(httpUrlF.host())) {
            throw new IOException("PHP 地址须使用 HTTPS");
        }
        return httpUrlF.toString();
    }

    public static void u(String str) throws IOException {
        if (str != null) {
            try {
                if (str.matches("[1-9][0-9]{0,18}") && Long.parseLong(str) > 0) {
                    return;
                }
            } catch (NumberFormatException unused) {
                throw new IOException("影片编号不是有效正整数");
            }
        }
        throw new NumberFormatException();
    }

    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    public static void v(InetAddress inetAddress) throws IOException {
        String strM186 = "目标地址不属于公开网络";
        if (inetAddress == null || inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isSiteLocalAddress() || inetAddress.isMulticastAddress()) {
            throw new IOException(strM186);
        }
        byte[] address = inetAddress.getAddress();
        byte b = address[0];
        int i2 = b & 255;
        int i3 = address[1] & 255;
        if (address.length != 4) {
            if (address.length == 16 && (b & 224) == 32) {
                if (i2 == 32 && i3 == 1) {
                    byte b2 = address[2];
                    if ((b2 & 255) >= 2 && ((b2 & 255) != 13 || (address[3] & 255) != 184)) {
                        if (i2 == 32) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else if ((i2 == 32 || i3 != 2) && (i2 != 63 || i3 != 255 || (address[2] & 240) != 0)) {
                    return;
                }
            }
            throw new IOException(strM186);
        }
        int i4 = address[2] & 255;
        if (i2 == 0 || i2 == 10 || i2 == 127 || i2 >= 224 || ((i2 == 100 && i3 >= 64 && i3 <= 127) || ((i2 == 169 && i3 == 254) || ((i2 == 172 && i3 >= 16 && i3 <= 31) || ((i2 == 192 && (i3 == 168 || ((i3 == 0 && (i4 == 0 || i4 == 2)) || (i3 == 88 && i4 == 99)))) || ((i2 == 198 && (i3 == 18 || i3 == 19 || (i3 == 51 && i4 == 100))) || (i2 == 203 && i3 == 0 && i4 == 113))))))) {
            throw new IOException(strM186);
        }
    }

    public static String x(String str) {
        if (str == null || str.isEmpty()) {
            return "开饭请求失败";
        }
        String strReplaceAll = str.replaceAll("(?i)https?://[^\\s]+", "[地址已脱敏]").replaceAll("(?i)Bearer\\s+[^\\s]+", "Bearer [已脱敏]").replaceAll("(?i)(token|auth_key|password|device_id|authorization|signature|key|iv|handle|ticket)\\s*[=:]\\s*[^&\\s]+", "$1=[已脱敏]").replaceAll("[A-Za-z0-9_+/=-]{32,}", "[已脱敏]").replaceAll("[\\p{Cntrl}]", " ");
        return strReplaceAll.substring(0, Math.min(250, strReplaceAll.length()));
    }

    public static long y(long j2, long j3) throws InterruptedIOException {
        long jNanoTime = System.nanoTime();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(j2) - System.currentTimeMillis();
        String strM234 = "桥接票据剩余时间不足";
        if (millis <= 2000) {
            throw new InterruptedIOException(strM234);
        }
        long jMin = Math.min(j3 - jNanoTime, TimeUnit.MILLISECONDS.toNanos(Math.min(millis, 20000L))) - timeUnit.toNanos(2L);
        if (jMin > 0) {
            return jNanoTime + jMin;
        }
        throw new InterruptedIOException(strM234);
    }

    public static HttpUrl z(String str, Headers headers) throws IOException {
        HttpUrl httpUrlF = f(str, true);
        for (int i2 = 0; i2 < headers.size(); i2++) {
            String lowerCase = headers.name(i2).toLowerCase(Locale.ROOT);
            if (Arrays.asList("host", "content-length", "transfer-encoding", "connection", "proxy-authorization", "proxy-connection", "te", "trailer", "upgrade", "expect").contains(lowerCase)) {
                throw new IOException("目标 Headers 含传输保留字段");
            }
            if (!httpUrlF.isHttps() && ("authorization".equals(lowerCase) || headers.value(i2).matches("(?i)Bearer\\s+.*"))) {
                throw new IOException("带凭据的目标请求须使用 HTTPS");
            }
        }
        return httpUrlF;
    }

    public final FileLock a(FileChannel fileChannel, Run run) throws IOException {
        while (true) {
            long jE = e(run.b, run.a);
            try {
                FileLock fileLockTryLock = fileChannel.tryLock();
                if (fileLockTryLock != null) {
                    return fileLockTryLock;
                }
            } catch (OverlappingFileLockException unused) {
            }
            try {
                TimeUnit.NANOSECONDS.sleep(Math.min(jE, TimeUnit.MILLISECONDS.toNanos(20L)));
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("等待桥接已取消");
            }
        }
    }

    public final JSONObject b(String str, JSONObject jSONObject, Run run) throws IOException {
        long j2 = run.b;
        String strM570 = "ok";
        String strM339 = "N1.S5NVvQBl9jeX9YOB6UGR7Jx4mAlJSSQ9YmUhoEKqyP6cdbqFUjFrJz5PVD260I49eZ7l2m9OfJQOWrlJv9YSSozOKiAo2pQpwhEnmUes2uM=";
        String strM471 = "N1.oUOYJ2SxEox5T2o5RrhikY5/h6m+h/d0h9IGf8zN2RsWbrYZxUqs5m82LMbjTIJ/6bwpnTXU6k1UkSejfRPu0eXfPDg78Krc2GlaPm8O/MU=";
        String strM169 = "moyufucking";
        String strM325 = "PHP 服务 HTTP ";
        long j3 = run.a;
        try {
            e(j2, j3);
            o("body_b64", jSONObject);
            String strM486 = "N1.nyJMdJsis8mPi/fwmRRUVOhPEz8XfUA7HGGQyOlys3H+HW1MagAiy+sWUBcjQdYzQn2ns54efSoVGJPJr5VRIQ==";
            String strM54 = "N1.70Fw/yqBjlkJYCLUTYu21ZFzyCnHd+vTV8urQfP+fgZdSvlKgdtiSxiNNsHa2pq3Qr38jPMl5GXoGAVjJ3nJVpn9bUeHolUaPHbTow6v4gdRggLir817H7AVjdMs8iLffPSVZ95Prc2eILup3rrYQw==";
            String string = jSONObject.toString();
            Charset charset = StandardCharsets.UTF_8;
            byte[] bArrT = FishCrypto.t(strM471, strM339, strM486, strM54, string.getBytes(charset));
            if (bArrT == null || bArrT.length == 0) {
                throw new IOException("开饭 native 信封未就绪");
            }
            byte[] bytes = new JSONObject().put(strM169, Base64.encodeToString(bArrT, 2)).toString().getBytes(charset);
            if (bytes.length > 4194304) {
                throw new LimitFailure();
            }
            Reply replyK = k(new Request.Builder().url(str).header("Accept-Encoding", "identity").post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), bytes)).build(), run.b, 4194304, false, run.a, false);
            JSONObject jSONObjectR = r(replyK.c);
            if (jSONObjectR.length() != 1 || !jSONObjectR.has(strM169)) {
                throw new IOException("桥接外围字段错误");
            }
            byte[] bArrS = FishCrypto.s(strM471, strM339, c(4194304, A(strM169, jSONObjectR)));
            if (bArrS == null || bArrS.length == 0 || bArrS.length > 4194304) {
                throw new IOException("开饭 native 信封解码失败");
            }
            JSONObject jSONObjectR2 = r(bArrS);
            if (!(jSONObjectR2.opt(strM570) instanceof Boolean)) {
                throw new IOException("桥接响应状态错误");
            }
            if (!jSONObjectR2.getBoolean(strM570)) {
                o("", jSONObjectR2);
                String strA = A("code", jSONObjectR2);
                String strA2 = A("error", jSONObjectR2);
                if (strA.matches("[A-Z][A-Z0-9_]{0,63}") && !strA2.trim().isEmpty()) {
                    throw new BridgeFailure(strA, x(strA2));
                }
                throw new IOException("桥接错误 DTO 错误");
            }
            int i2 = replyK.a;
            if (i2 >= 200 && i2 < 300) {
                e(j2, j3);
                return jSONObjectR2.getJSONObject("data");
            }
            throw new IOException(strM325 + i2);
        } catch (IOException e) {
            throw e;
        } catch (Exception unused) {
            throw new IOException("开饭 PHP 响应合同错误");
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

    public synchronized void destroy() {
        try {
            this.d++;
            OkHttpClient okHttpClient = this.b;
            ThreadPoolExecutor threadPoolExecutor = this.c;
            this.b = null;
            this.c = null;
            this.g = null;
            this.h = 0L;
            synchronized (this.a) {
                try {
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((Call) it.next()).cancel();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdownNow();
            }
            if (okHttpClient != null) {
                okHttpClient.connectionPool().evictAll();
                okHttpClient.dispatcher().executorService().shutdown();
            }
        } catch (Throwable th2) {
            throw th2;
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

    public final long e(long j2, long j3) throws IOException {
        if (this.b == null || j3 != this.d) {
            throw new IOException("开饭站源已关闭或重新加载");
        }
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("开饭请求已取消");
        }
        long jNanoTime = j2 - System.nanoTime();
        if (jNanoTime >= TimeUnit.MILLISECONDS.toNanos(1L)) {
            return jNanoTime;
        }
        throw new InterruptedIOException("开饭请求超过时限");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v47, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r78v0, types: [com.github.catvod.spider.KaiFan] */
    public final JSONObject h(String str, JSONObject jSONObject, Run run) throws IOException {
        String str2;
        String str3;
        ?? r25;
        JSONObject jSONObject2;
        String str4;
        String str5;
        String strM473;
        ?? r26;
        e(run.b, run.a);
        if (jSONObject.toString().getBytes(StandardCharsets.UTF_8).length > 65536) {
            throw new LimitFailure();
        }
        synchronized (this) {
            e(run.b, run.a);
            str2 = this.e;
            str3 = this.f;
        }
        File fileD = C0297t1.d(str3 + "_lock");
        if (fileD == null || fileD.getParentFile() == null || !(fileD.getParentFile().isDirectory() || fileD.getParentFile().mkdirs())) {
            throw new IOException("桥接存储目录未就绪");
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileD, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    FileLock fileLockA = a(channel, run);
                    try {
                        String strI = C0297t1.i(str3 + "_handle");
                        String strReplace = UUID.randomUUID().toString().replace("-", "");
                        if (!strI.isEmpty() && !strI.matches("[a-f0-9]{32}")) {
                            throw new IOException("桥接句柄记录错误");
                        }
                        ?? r1 = strI;
                        boolean z = true;
                        boolean z2 = false;
                        while (true) {
                            e(run.b, run.a);
                            ?? Put = new JSONObject().put("action", "prepare").put("scene", str).put("params", jSONObject).put("request_id", strReplace);
                            if (!r1.isEmpty()) {
                                Put.put("handle", r1);
                            }
                            try {
                                JSONObject jSONObjectB = b(str2, Put, run);
                                ?? A = A("handle", jSONObjectB);
                                String strA = A("kind", jSONObjectB);
                                if (A == 0 || !A.matches("[a-f0-9]{32}") || ((!r1.isEmpty() && !r1.equals(A)) || !strReplace.equals(A("request_id", jSONObjectB)))) {
                                    break;
                                }
                                if (!"request".equals(strA) && !"result".equals(strA)) {
                                    throw new IOException("prepare 步骤错误");
                                }
                                o("result".equals(strA) ? "result" : "body_b64", jSONObjectB);
                                synchronized (this) {
                                    try {
                                        e(run.b, run.a);
                                        if (!A.equals(r1)) {
                                            if (!C0297t1.k(str3 + "_handle", A)) {
                                                throw new IOException("桥接句柄保存失败");
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if ("result".equals(strA)) {
                                    JSONObject jSONObject3 = jSONObjectB.getJSONObject("result");
                                    fileLockA.release();
                                    channel.close();
                                    randomAccessFile.close();
                                    return jSONObject3;
                                }
                                int i2 = run.c;
                                run.c = i2 - 1;
                                if (i2 <= 0) {
                                    throw new IOException("桥接目标步骤超过上限");
                                }
                                String strA2 = A("ticket", jSONObjectB);
                                String strA3 = A("method", jSONObjectB);
                                if (strA2 == null || !strA2.matches("[a-f0-9]{32}") || (!"GET".equals(strA3) && !"POST".equals(strA3))) {
                                    throw new IOException("桥接票据或方法错误");
                                }
                                long jQ = q(1L, 9223372036854775L, "expires_at", jSONObjectB);
                                Headers headersOf = Headers.of(l(jSONObjectB.getJSONObject("headers"), false));
                                HttpUrl httpUrlZ = z(A("url", jSONObjectB), headersOf);
                                byte[] bArrC = c(2097152, A("body_b64", jSONObjectB));
                                if ("GET".equals(strA3) && bArrC.length != 0) {
                                    throw new IOException("GET 计划含请求体");
                                }
                                Request.Builder builderTag = new Request.Builder().url(httpUrlZ).headers(headersOf).tag(Headers.class, headersOf);
                                if (headersOf.get("Accept-Encoding") == null) {
                                    builderTag.header("Accept-Encoding", "identity");
                                }
                                if ("POST".equals(strA3)) {
                                    builderTag.post(RequestBody.create((MediaType) null, bArrC));
                                } else {
                                    builderTag.get();
                                }
                                JSONObject jSONObjectPut = new JSONObject().put("action", "consume").put("request_id", strReplace).put("handle", A).put("ticket", strA2);
                                try {
                                    r25 = A;
                                    str4 = str3;
                                    str5 = strReplace;
                                    try {
                                        Reply replyK = k(builderTag.build(), y(jQ, run.b), 2097152, false, run.a, true);
                                        jSONObject2 = jSONObjectPut;
                                        try {
                                            jSONObject2.put("status", replyK.a).put("headers", replyK.b).put("body_b64", Base64.encodeToString(replyK.c, 2));
                                            r26 = r25;
                                        } catch (IOException e) {
                                            e = e;
                                            e(run.b, run.a);
                                            JSONObject jSONObjectPut2 = jSONObject2.put("status", 0).put("headers", new JSONObject()).put("body_b64", "");
                                            String strM459 = "transport_error";
                                            if (e instanceof LimitFailure) {
                                                strM473 = "too_large";
                                            } else {
                                                strM473 = e instanceof InterruptedIOException ? "timeout" : "io";
                                            }
                                            jSONObjectPut2.put(strM459, strM473);
                                            r26 = r25;
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        jSONObject2 = jSONObjectPut;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    r25 = A;
                                    jSONObject2 = jSONObjectPut;
                                    str4 = str3;
                                    str5 = strReplace;
                                }
                                JSONObject jSONObjectB2 = b(str2, jSONObject2, run);
                                e(run.b, run.a);
                                ?? r2 = r26;
                                if (!r2.equals(A("handle", jSONObjectB2)) || !str5.equals(A("request_id", jSONObjectB2))) {
                                    throw new IOException("consume 绑定不匹配");
                                }
                                o("result", jSONObjectB2);
                                if ("result".equals(A("kind", jSONObjectB2))) {
                                    JSONObject jSONObject4 = jSONObjectB2.getJSONObject("result");
                                    fileLockA.release();
                                    channel.close();
                                    randomAccessFile.close();
                                    return jSONObject4;
                                }
                                if (!"continue".equals(A("kind", jSONObjectB2))) {
                                    throw new IOException("consume 步骤错误");
                                }
                                r1 = r2;
                                strReplace = str5;
                                str3 = str4;
                                z = false;
                            } catch (BridgeFailure e4) {
                                String str6 = str3;
                                String str7 = strReplace;
                                if (!z) {
                                    throw e4;
                                }
                                if (z2) {
                                    throw e4;
                                }
                                if (r1.isEmpty()) {
                                    throw e4;
                                }
                                if (!"STATE_MISSING".equals(e4.a)) {
                                    throw e4;
                                }
                                synchronized (this) {
                                    e(run.b, run.a);
                                    if (!C0297t1.k(str6 + "_handle", "")) {
                                        throw new IOException("桥接句柄重置失败");
                                    }
                                    strReplace = str7;
                                    z2 = true;
                                    str3 = str6;
                                    r1 = "";
                                }
                            }
                        }
                        throw new IOException("桥接句柄或请求编号不匹配");
                    } catch (Throwable th2) {
                        fileLockA.release();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    if (channel == null) {
                        throw th3;
                    }
                    try {
                        channel.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                    throw e;
                }
            } catch (Throwable th5) {
                try {
                    randomAccessFile.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } catch (IOException e5) {
            throw e5;
        } catch (Exception unused) {
            throw new IOException("开饭桥接合同错误");
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

    public void init(Context context) {
        init(context, "");
    }

    public synchronized void init(Context context, String str) {
        String strM365 = "kaifan_";
        synchronized (this) {
            destroy();
            this.e = t(str);
            this.f = strM365 + AbstractC0309x1.n(this.e).substring(0, 24);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.c = new ThreadPoolExecutor(0, 2, 30L, timeUnit, new SynchronousQueue(), new ThreadFactoryC0365m(1));
            this.b = new OkHttpClient.Builder().proxy(java.net.Proxy.NO_PROXY).protocols(Collections.singletonList(Protocol.HTTP_1_1)).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(false).connectTimeout(4L, timeUnit).readTimeout(12L, timeUnit).writeTimeout(12L, timeUnit).build();
        }
    }

    public boolean isVideoFormat(String str) {
        if (FishCrypto.businessReady()) {
            return $host$42ceaa68a95df632(str);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final Reply k(final Request request, final long j2, int i2, boolean z, final long j3, boolean z2) throws IOException {
        int i3;
        long j4;
        OkHttpClient okHttpClient = this.b;
        if (okHttpClient == null) {
            throw new IOException("开饭站源已关闭");
        }
        final Headers[] headersArr = new Headers[1];
        final long j5 = z2;
        Call callNewCall = okHttpClient.newBuilder().dns(new C(request, w(request.url().host(), j2, j3, z2))).callTimeout(e(j2, j3), TimeUnit.NANOSECONDS).addNetworkInterceptor(new Interceptor() { // from class: com.github.catvod.spider.merge.u.D
            public final Response intercept(Interceptor.Chain chain) throws IOException {
                List list = KaiFan.i;
                this.a.e(j2, j3);
                Headers[] headersArr2 = headersArr;
                if (headersArr2[0] != null) {
                    throw new IOException("禁止隐式重发 HTTP 请求");
                }
                if (j5) {
                    KaiFan.v(chain.connection().socket().getInetAddress());
                }
                Request request2 = chain.request();
                Headers headers = (Headers) request.tag(Headers.class);
                if (headers != null) {
                    Request.Builder builderHeader = request2.newBuilder().headers(headers).header("Host", request2.header("Host"));
                    if (request2.header("Content-Length") != null) {
                        builderHeader.header("Content-Length", request2.header("Content-Length"));
                    }
                    request2 = builderHeader.build();
                }
                Response responseProceed = chain.proceed(request2);
                headersArr2[0] = responseProceed.headers();
                return responseProceed.code() == 503 ? responseProceed.newBuilder().header("Retry-After", "1").build() : responseProceed;
            }
        }).build().newCall(request);
        this.a.add(callNewCall);
        if (okHttpClient != this.b || j3 != this.d) {
            callNewCall.cancel();
        }
        try {
            try {
                try {
                    Response responseExecute = callNewCall.execute();
                    try {
                        try {
                            Headers headers = headersArr[0];
                            if (headers == null) {
                                headers = responseExecute.headers();
                            }
                            try {
                                if (headers.byteCount() <= 65536) {
                                    if (z || responseExecute.body() == null) {
                                        i3 = i2;
                                    } else {
                                        i3 = i2;
                                        if (responseExecute.body().contentLength() <= i3) {
                                        }
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    for (String str : headers.names()) {
                                        jSONObject.put(str, TextUtils.join(", ", headers.values(str)));
                                    }
                                    o("", jSONObject);
                                    Buffer buffer = new Buffer();
                                    long j6 = i3;
                                    long j7 = ((long) (!z ? 1 : 0)) + j6;
                                    while (true) {
                                        if (responseExecute.body() == null || buffer.size() >= j7) {
                                            j4 = j2;
                                            break;
                                        }
                                        j4 = j2;
                                        e(j4, j3);
                                        long j8 = j7;
                                        if (responseExecute.body().source().read(buffer, Math.min(8192L, j7 - buffer.size())) < 0) {
                                            break;
                                        }
                                        j7 = j8;
                                    }
                                    e(j4, j3);
                                    if (buffer.size() > j6) {
                                        throw new LimitFailure();
                                    }
                                    Reply reply = new Reply(responseExecute.code(), jSONObject, buffer.readByteArray());
                                    responseExecute.close();
                                    this.a.remove(callNewCall);
                                    return reply;
                                }
                                throw new LimitFailure();
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                if (responseExecute == null) {
                                    throw th2;
                                }
                                try {
                                    responseExecute.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (IOException unused) {
                            e(j5, j3);
                            throw new IOException("HTTP 传输失败");
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException unused2) {
                    j5 = j2;
                }
            } catch (LimitFailure e) {
                throw e;
            } catch (InterruptedIOException e2) {
                throw e2;
            } catch (Exception unused3) {
                throw new IOException("HTTP 响应合同错误");
            }
        } catch (Throwable th5) {
            this.a.remove(callNewCall);
            throw th5;
        }
    }

    public final String n(HttpUrl httpUrl, LinkedHashMap linkedHashMap, Run run) throws IOException {
        String strOptString;
        String strOptString2;
        String lowerCase = httpUrl.encodedPath().toLowerCase(Locale.ROOT);
        boolean zEndsWith = lowerCase.endsWith(".m3u8");
        String strM42 = "application/x-mpegURL";
        if (zEndsWith) {
            return strM42;
        }
        boolean zEndsWith2 = lowerCase.endsWith(".mp4");
        String strM511 = "video/mp4";
        if (zEndsWith2) {
            return strM511;
        }
        boolean zEndsWith3 = lowerCase.endsWith(".mpd");
        String strM390 = "application/dash+xml";
        if (zEndsWith3) {
            return strM390;
        }
        long jMin = Math.min(run.b, g(4));
        Headers headersBuild = Headers.of(linkedHashMap).newBuilder().set("Range", "bytes=0-1023").set("Accept-Encoding", "identity").build();
        HttpUrl httpUrl2 = httpUrl;
        int i2 = 0;
        while (i2 <= 3) {
            int i3 = i2;
            Reply replyK = k(new Request.Builder().url(httpUrl2).headers(headersBuild).tag(Headers.class, headersBuild).get().build(), jMin, 1024, true, run.a, true);
            JSONObject jSONObject = replyK.b;
            int i4 = replyK.a;
            if (i4 != 301 && i4 != 302 && i4 != 303 && i4 != 307 && i4 != 308) {
                if (i4 < 200 || i4 >= 300) {
                    throw new IOException(com.github.catvod.spider.merge.D.b.e(i4, "媒体 HTTP "));
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (true) {
                    if (!itKeys.hasNext()) {
                        strOptString2 = "";
                        break;
                    }
                    String next = itKeys.next();
                    if (next.equalsIgnoreCase("Content-Type")) {
                        strOptString2 = jSONObject.optString(next);
                        break;
                    }
                }
                String lowerCase2 = strOptString2.toLowerCase(Locale.ROOT);
                if (!lowerCase2.contains("mpegurl")) {
                    Charset charset = StandardCharsets.UTF_8;
                    byte[] bArr = replyK.c;
                    if (!new String(bArr, charset).replace("﻿", "").trim().startsWith("#EXTM3U")) {
                        if (lowerCase2.contains("dash+xml")) {
                            return strM390;
                        }
                        return (bArr.length >= 8 && bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) ? strM511 : "";
                    }
                }
                return strM42;
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (true) {
                if (!itKeys2.hasNext()) {
                    strOptString = "";
                    break;
                }
                String next2 = itKeys2.next();
                if (next2.equalsIgnoreCase("Location")) {
                    strOptString = jSONObject.optString(next2);
                    break;
                }
            }
            HttpUrl httpUrlResolve = httpUrl2.resolve(strOptString);
            if (httpUrlResolve == null || i3 == 3) {
                throw new IOException("媒体重定向错误");
            }
            z(httpUrlResolve.toString(), headersBuild);
            if (!httpUrlResolve.scheme().equals(httpUrl2.scheme()) || !httpUrlResolve.host().equals(httpUrl2.host()) || httpUrlResolve.port() != httpUrl2.port()) {
                return "";
            }
            i2 = i3 + 1;
            httpUrl2 = httpUrlResolve;
        }
        return "";
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

    public Object[] proxy(Map<String, String> map) {
        return !FishCrypto.businessReady() ? FishCrypto.blockedProxy() : $host$dca6c5e1c5a7de15(map);
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

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        r1 = (java.util.List) r7.get(java.lang.Math.min(r1, java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(20)), java.util.concurrent.TimeUnit.NANOSECONDS);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List w(String str, long j2, long j3, boolean z) throws IOException {
        List list;
        ThreadPoolExecutor threadPoolExecutor = this.c;
        e(j2, j3);
        if (threadPoolExecutor == null) {
            throw new IOException("开饭域名解析已关闭");
        }
        long jMin = Math.min(j2, g(4));
        try {
            Future futureSubmit = threadPoolExecutor.submit(new CallableC0363l(str, 11));
            while (true) {
                try {
                    try {
                        long jE = e(jMin, j3);
                        try {
                            break;
                        } catch (TimeoutException unused) {
                        }
                    } catch (Throwable th) {
                        futureSubmit.cancel(true);
                        throw th;
                    }
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("开饭域名解析已取消");
                } catch (ExecutionException unused3) {
                    throw new IOException("域名解析失败");
                }
            }
            if (list.isEmpty()) {
                throw new IOException("域名解析没有地址");
            }
            if (z) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    v((InetAddress) it.next());
                }
            }
            e(jMin, j3);
            futureSubmit.cancel(true);
            return list;
        } catch (RejectedExecutionException unused4) {
            throw new IOException("开饭域名解析繁忙");
        }
    }
}

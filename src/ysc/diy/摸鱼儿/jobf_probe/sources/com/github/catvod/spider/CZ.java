package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0297t1;
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
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.f0.p;
import com.github.catvod.spider.merge.h0.C0085;
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
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p016t.C0122;
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
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Cookie;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class CZ extends Spider {
    public static volatile long m;
    public static volatile CZ o;
    public boolean f;
    public boolean h;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f22short = {452, 393, 388, 408, 408, 474, 420, 474, 468, 410, 470, 1406, 1407, 1389, 1286, 1299, 462, 389, 387, 405, 398, 401, 467, 468, 465, -29945, 29602, 1813, 1838, 1841, 1907, 1908, 1905, 1168, 1234, 1232, 1225, 1238, 1242, 1248, 1245, 1227, 20849, 32524, 30764, -27778, 2999, 3061, 3069, 3057, 3058, 3053, 3052, 3052, 31204, 21517, 2681, 2596, 2623, 2620, 2595, 24758, 22324, 2566, 2625, 2632, 2631, 2627, 2652, 2653, 2655, -28297, 21753, 1626, 1555, 1556, 1563, 1567, 1536, 31923, 23486, 3139, 3083, 3087, 3078, 21661, 19655, 20487, 535, 604, 599, 598, 607, 597, 601, 598, 594, 589, 603, 592, 601, 598, 607, 602, 601, 598, 24177, 23340, 32350, 2268, 2203, 2194, 2202, 2180, 2194, 2202, 2201, 2182, 2178, 2202, 2183, 2194, 24940, 21773, 24188, 3177, 3105, 3111, 3113, 3104, 3107, 3112, 3135, 3119, 3112, 3105, 3125, 3118, 3119, -25528, 21654, 23009, -28842, 2180, 2243, 2270, 2250, 2258, 2270, 2255, 2242, 2250, 2245, 2258, 2242, 2245, 2252, 22442, -28919, 29137, 23445, 2284, 2220, 2230, 2222, 2214, 2218, 2215, 2218, 2210, 2221, 2234, 2218, 2221, 2212, 25151, 30358, 31789, 22121, 2975, 3032, 3025, 3038, 3031, 3013, 3039, 3028, 3033, 3025, 3038, 3017, 3033, 3038, 3031, -28180, 20728, 29488, 22900, 1694, 1731, 1752, 1747, 1748, 1759, 1749, 1752, 1744, 1759, 1736, 1752, 1759, 1750, 28122, 28435, 32010, 22350, 497, 488, 461, 481, 503, 486, 486, 507, 508, 501, 481, -30548, 31868, 1235, 1231, 1231, 1227, 1636, 1563, 1540, 1639, 1640, 1646, 1564, 1560, 1600, 1541, 1640, 1603, 1614, 1631, 1609, 1640, 1639, 1602, 1639, 1601, 1565, 1651, 1624, 1611, 1645, 1635, 1606, 1640, 1631, 1608, 1648, 1633, 1645, 1616, 1663, 1635, 1603, 1662, 1636, 1564, 1635, 1566, 1635, 1602, 1639, 1618, 1567, 1633, 1560, 1626, 1651, 1643, 1627, 1662, 1562, 1625, 1619, 1662, 1659, 1609, 1554, 1561, 1650, 1631, 1613, 1606, 1628, 1604, 1636, 1608, 1643, 1563, 1634, 1632, 1647, 1561, 1651, 1662, 1619, 1661, 1566, 1633, 1608, 1651, 1632, 1662, 1566, 1613, 1643, 1559, 1559, 702, 679, 642, 689, 690, 698, 692, 691, 31858, 21852, 24071, 22906, 23014, -31797, 32002, 851, 838, 839, 832, 786, 2818, 2821, 2843, 887, 849, 839, 848, 783, 867, 837, 839, 844, 854, 2886, 2891, 2900, 2828, 2900, 2891, 2886, 2887, 2893, 2898, 2894, 2883, 2907, 2818, 2844, 2818, 2891, 2884, 2896, 2883, 2895, 2887, 481, 480, 497, 2267, 2297, 2284, 2303, 2298, 2298, 2295, 2233, 2211, 2232, 2214, 2230, 2238, 2267, 2295, 2293, 2303, 2296, 2274, 2297, 2277, 2302, 2221, 2230, 2271, 2296, 2274, 2291, 2298, 2230, 2267, 2295, 2293, 2230, 2265, 2245, 2230, 2254, 2230, 2215, 2214, 2249, 2215, 2211, 2249, 2209, 2239, 2230, 2263, 2278, 2278, 2298, 2291, 2241, 2291, 2292, 2269, 2303, 2274, 2233, 2211, 2213, 2209, 2232, 2213, 2208, 2230, 2238, 2269, 2270, 2242, 2267, 2266, 2234, 2230, 2298, 2303, 2301, 2291, 2230, 2257, 2291, 2293, 2301, 2297, 2239, 2230, 2261, 2302, 2276, 2297, 2299, 2291, 2233, 2215, 2214, 2214, 2232, 2214, 2232, 2210, 2222, 2223, 2208, 2232, 2209, 2211, 2230, 2245, 2295, 2288, 2295, 2276, 2303, 2233, 2211, 2213, 2209, 2232, 2213, 2208, 3058, 3031, 3008, 3029, 3014, 3011, 3010, 2954, 3054, 3017, 3028, 3010, 3012, 3026, 3029, 3010, 2954, 3061, 3010, 3030, 3026, 3010, 3028, 3027, 3028, 2696, 481, 471, 465, 415, 500, 471, 454, 465, 474, 415, 502, 471, 449, 454, 2541, 2530, 2550, 2533, 2537, 2529, 588, 635, 632, 635, 620, 635, 620, 2636, 2682, 2684, 2610, 2649, 2682, 2667, 2684, 2679, 2610, 2636, 2678, 2667, 2682, 3087, 3102, 3075, 3103, 3103, 3137, 3103, 3077, 3096, 3081, 2917, 2899, 2901, 2843, 2928, 2899, 2882, 2901, 2910, 2843, 2939, 2905, 2898, 2899, 616, 615, 624, 623, 609, 615, 626, 611, 3093, 3097, 3096, 3077, 3074, 3114, 3077, 3165, 3099, 3087, 3077, 3072, 3089, 3114, 3077, 3164, 3147, 3114, 3077, 3164, 3117, 3153, 3156, 3115, 3166, 3117, 3112, 3153, 3156, 3115, 3165, 3167, 3117, 3153, 3156, 3115, 2580, 2563, 2576, 2626, 2576, 2567, 2577, 2583, 2574, 2582, 2621, 2580, 2640, 2626, 2655, 2626, 2634, 2622, 2585, 2636, 2632, 2653, 2622, 2591, 2635, 2649, 2252, 2249, 2268, 2249, 1568, 1585, 1570, 1571, 1589, 2833, 2829, 2816, 2840, 2868, 2835, 2829, 2173, 2143, 2122, 2137, 2140, 2140, 2129, 2079, 2053, 2078, 2048, 2064, 2072, 2172, 2137, 2142, 2117, 2120, 2059, 2064, 2161, 2142, 2132, 2114, 2143, 2137, 2132, 2064, 2049, 2053, 2059, 2064, 2144, 2170, 2154, 2049, 2049, 2048, 2064, 2162, 2117, 2137, 2140, 2132, 2079, 2161, 2144, 2051, 2161, 2078, 2050, 2052, 2048, 2054, 2049, 2055, 2078, 2048, 2048, 2056, 2059, 2064, 2119, 2118, 2073, 2064, 2161, 2112, 2112, 2140, 2133, 2151, 2133, 2130, 2171, 2137, 2116, 2079, 2053, 2051, 2055, 2078, 2051, 2054, 2064, 2072, 2171, 2168, 2148, 2173, 2172, 2076, 2064, 2140, 2137, 2139, 2133, 2064, 2167, 2133, 2131, 2139, 2143, 2073, 2064, 2150, 2133, 2114, 2115, 2137, 2143, 2142, 2079, 2052, 2078, 2048, 2064, 2163, 2136, 2114, 2143, 2141, 2133, 2079, 2049, 2051, 2054, 2078, 2048, 2078, 2055, 2049, 2048, 2051, 2078, 2049, 2050, 2055, 2064, 2173, 2143, 2130, 2137, 2140, 2133, 2064, 2147, 2129, 2134, 2129, 2114, 2137, 2079, 2053, 2051, 2055, 2078, 2051, 2054, 1982, 1923, 1944, 1942, 1944, 1951, 2479, 2466, 2470, 2467, 2466, 2485, 2027, 2029, 2042, 2046, 2463, 2502, 2500, 2500, 2463, 2501, 2500, 2518, 2461, 2440, 2324, 2322, 2309, 2323, 825, 828, 819, 816, 828, 822, 808, 1431, 1422, 1451, 1432, 1435, 1427, 1437, 1434, 1543, 1563, 1563, 1567, 317, 356, 2092, 2150, 2171, 2155, 2159, 2149, 2082, 2155, 2159, 2149, 1195, 1208, 1214, 1187, 1193, 1190, 1199, 1258, 1187, 1191, 1197, 2290, 2295, 2274, 2295, 2235, 2297, 2276, 2303, 2289, 2303, 2296, 2295, 2298, 2743, 2742, 2727, 2082, 2165, 2172, 2131, 2159, 2147, 2146, 2168, 2153, 2164, 2168, 1945, 1940, 1931, 32203, 22415, 17973, 30259, 1154, 1244, 1229, 1216, 1237, 1267, 1216, 1221, 1247, 1240, 1267, 1230, 1240, 1218, 3152, 3178, 3161, 3139, 3156, 3159, 3099, 3084, 3143, 3182, 3137, 3165, 3152, 3144, 3180, 755, 697, 690, 680, 689, 692, 686, 681, 752, 692, 681, 696, 688, 765, 700, 646, 693, 687, 696, 699, 759, 736, 683, 642, 685, 689, 
    700, 676, 640, 1046, 1036, 1051, 1048, 28069, 27702, 2427, 2388, 2316, 30520, -31640, 2360, 2365, 2362, 2353, 3188, 2992, 20757, -26648, -28717, 27655, 27796, 30128, 2003, 1049, 1049, 1049, 2566, 2591, 2618, 2569, 2570, 2562, 2572, 2571, 1162, 1171, 1206, 1178, 1164, 1181, 1181, 1152, 1159, 1166, 1178, 2878, 2985, 2878, 31989, 21979, -25661, 30176, 923, 898, 935, 916, 919, 927, 913, 918, 673, 696, 669, 686, 685, 677, 683, 684, 3321, 1907, 1836, 1853, 1851, 1849, 1907, 2920, 2914, 2833, 2836, 2920, 2839, 2913, 2915, 2920, 2929, 2876, 2859, 2872, 2922, 2833, 2838, 2862, 2838, 2877, 2839, 2913, 2935, 2860, 2879, 2852, 2857, 2878, 2851, 2853, 2852, 2922, 2862, 2852, 2857, 2872, 2867, 2916, 2912, 2855, 2862, 2943, 2916, 2863, 2852, 2857, 2916, 2847, 2878, 2860, 2930, 2916, 2874, 2859, 2872, 2873, 2863, 2838, 2914, 2920, 2914, 2833, 2838, 2862, 2838, 2877, 2839, 2913, 2915, 2920, 2916, 2912, 2855, 2862, 2943, 2916, 2863, 2852, 2857, 2916, 2847, 2878, 2860, 2930, 2916, 2874, 2859, 2872, 2873, 2863, 2838, 2914, 2914, 2838, 2862, 2913, 2915, 2838, 2915, 1630, 1601, 1612, 1613, 1607, 1554, 1544, 1652, 1619, 1629, 1626, 1604, 1554, 1544, 1546, 1536, 1651, 1654, 1546, 1653, 1539, 1537, 1546, 2945, 2951, 2960, 2950, 2971, 2950, 2974, 2967, 3016, 3026, 2990, 2953, 2951, 2944, 2974, 3016, 3024, 3034, 2985, 2988, 3024, 2991, 3033, 2990, 3036, 2948, 2950, 2950, 3035, 3024, 1054, 1026, 1026, 1030, 1100, 1113, 1113, 2366, 2338, 2338, 2342, 2341, 2412, 2425, 2425, 2447, 2443, 2436, 2301, 2297, 2287, 2195, 2303, 2302, 2303, 2195, 2284, 2295, 2303, 2287, 2187, 2284, 2269, 2264, 2264, 2261, 2258, 2267, 1139, 1143, 1121, 1547, 1542, 1564, 1550, 1549, 1539, 1546, 1547, 1500, 1499, 1477, 2536, 2537, 2555, 2448, 2437, 570, 1224, 1167, 1155, 1182, 1237, 2185, 2192, 2268, 2242, 2268, 2192, 2197, 724, 655, 668, 733, 2221, 2231, 2208, 2211, 2840, 2844, 2838, 2899, 2902, 2883, 2902, 2842, 2904, 2885, 2910, 2896, 2910, 2905, 2902, 2907, 482, 483, 498, 2844, 2882, 2907, 2897, 2847, 2886, 2903, 2890, 2886, 1232, 1199, 1200, 1272, 1229, 1269, 1266, 1265, 1223, 1269, 1235, 1205, 1243, 1234, 1267, 1231, 1195, 1205, 1190, 1256, 1220, 1227, 1190, 1223, 1245, 1266, 1230, 1247, 1198, 1231, 1262, 1223, 1272, 1272, 1205, 1230, 1224, 1256, 1238, 1220, 1242, 1264, 1252, 1276, 1271, 1229, 1231, 1242, 1257, 1257, 1230, 1257, 1261, 1230, 1191, 1252, 1247, 1259, 1274, 1244, 1236, 1258, 1277, 1276, 1262, 1205, 1237, 1279, 1244, 1270, 1273, 1192, 1252, 1270, 1227, 1258, 1236, 1234, 1223, 1197, 1240, 1196, 1229, 1244, 1270, 1271, 1269, 1271, 1254, 1226, 1196, 1194, 1196, 1277, 1222, 1192, 1224, 1268, 1266, 1235, 1243, 1193, 1220, 1197, 1241, 1240, 1247, 1190, 1193, 1261, 1187, 1098, 1095, 1117, 1103, 1100, 1090, 1099, 1098, 25416, -27345, 31500, 1983, 1971, 1971, 1975, 1973, 1977, 2626, 2628, 2642, 2629, 2649, 2646, 2650, 2642, 2684, 2669, 2687, 2687, 2683, 2659, 2686, 2664, 1619, 1663, 1663, 1659, 1657, 1653, 21148, -29898, 21991, 23522, -26787, 31102, 956, 912, 912, 916, 918, 922, 24077, -27982, 31889, -31365, 23466, 21935, -26352, 30515, 530, 543, 517, 535, 532, 538, 531, 530, 784, 796, 796, 792, 794, 790, 1716, 1721, 1699, 1713, 1714, 1724, 1717, 1716, 2432, 2444, 2444, 2440, 2442, 2438, 1351, 1345, 1367, 1344, 1372, 1363, 1375, 1367, 1181, 1164, 1182, 1182, 1178, 1154, 1183, 1161, 764, 2502, 2526, 2499, 2517, 2497, 2499, 2516, 2498, 2498, 2542, 2525, 2526, 2518, 2518, 2516, 2517, 2542, 2520, 2527, 2542, 1486, 1494, 1483, 1501, 1481, 1483, 1500, 1482, 1482, 1510, 1482, 1500, 1498, 1510, 2350, 2359, 2322, 2337, 2338, 2346, 2340, 2339, 2322, 2363, 2428, 2993, 1626, 1603, 1638, 1621, 1622, 1630, 1616, 1623, 1638, 1615, 1544, 2707, 2718, 2692, 2710, 2709, 2715, 2706, 2707, 2825, 2821, 2821, 2817, 2819, 2831, 1938, 1951, 1925, 1943, 1940, 1946, 1939, 1938, 635, 618, 632, 632, 636, 612, 633, 623, 2940, 2938, 2924, 2939, 2919, 2920, 2916, 2924, 1470, 1470, 3184, 3180, 3180, 3176, 3179, 3106, 1685, 1673, 1673, 1677, 898, 1522, 1520, 1511, 1530, 1532, 1533, 1850, 1848, 1837, 1852, 1854, 1846, 1835, 1824, 1818, 1846, 1847, 1837, 1852, 1847, 1837, 3003, 2973, 2955, 2972, 3011, 2991, 2953, 2955, 2944, 2970, 2736, 2706, 2695, 2708, 2705, 2705, 2716, 2770, 2760, 2771, 2765, 2781, 2773, 2737, 2708, 2707, 2696, 2693, 2758, 2781, 2748, 2707, 2713, 2703, 2706, 2708, 2713, 2781, 2764, 2760, 2758, 2781, 2733, 2743, 2727, 2764, 2764, 2765, 2781, 2751, 2696, 2708, 2705, 2713, 2770, 2748, 2733, 2766, 2748, 2771, 2767, 2761, 2765, 2763, 2764, 2762, 2771, 2765, 2765, 2757, 2758, 2781, 2698, 2699, 2772, 2781, 2748, 2701, 2701, 2705, 2712, 2730, 2712, 2719, 2742, 2708, 2697, 2770, 2760, 2766, 2762, 2771, 2766, 2763, 2781, 2773, 2742, 2741, 2729, 2736, 2737, 2769, 2781, 2705, 2708, 2710, 2712, 2781, 2746, 2712, 2718, 2710, 2706, 2772, 2781, 2731, 2712, 2703, 2702, 2708, 2706, 2707, 2770, 2761, 2771, 2765, 2781, 2750, 2709, 2703, 2706, 2704, 2712, 2770, 2764, 2766, 2763, 2771, 2765, 2771, 2762, 2764, 2765, 2766, 2771, 2764, 2767, 2762, 2781, 2736, 2706, 2719, 2708, 2705, 2712, 2781, 2734, 2716, 2715, 2716, 2703, 2708, 2770, 2760, 2766, 2762, 2771, 2766, 2763, 1857, 1064, 1055, 1052, 1055, 1032, 1055, 1032, 1995, 2025, 2025, 2031, 2042, 2046, 1959, 1990, 2027, 2020, 2029, 2047, 2027, 2029, 2031, 2430, 2412, 2345, 2375, 2378, 2344, 2430, 2412, 2367, 2421, 2361, 2356, 2346, 2365, 958, 959, 942, 955, 947, 950, 921, 949, 948, 942, 959, 948, 942, 2581, 2573, 2576, 2566, 2578, 2576, 2567, 2577, 2577, 2621, 2574, 2573, 2565, 2565, 2567, 2566, 2621, 2571, 2572, 2621, 2694, 2718, 2691, 2709, 2689, 2691, 2708, 2690, 2690, 2734, 2690, 2708, 2706, 2734, 2024, 2030, 2040, 2040, 2046, 2024, 2024, 2417, 2422, 2408, 2409, 2408, 2405, 2403, 2397, 2392, 2407, 2347, 2400, 2358, 2347, 2367, 2395, 2429, 2358, 2346, 2359, 2352, 2427, 2350, 2397, 2407, 2347, 2400, 2358, 2347, 2367, 2395, 2429, 2366, 2346, 2427, 2351, 295, 289, 311, 288, 316, 307, 319, 311, 3285, 3268, 3286, 3286, 3282, 3274, 3287, 3265, 1842, 1850, 1846, 1854, 1851, 2577, 2775, 2768, 
    2766, 440, 447, 423, 440, 421, 436, 434, 446, 437, 436, 2330, 2335, 2328, 2307, 2309, 2323, 2308, 553, 604, 550, 545, 604, 575, 542, 543, 530, 532, 2580, 2650, 2635, 2642, 2580, 2637, 2632, 2580, 2632, 2654, 2632, 2632, 2642, 2644, 2645, 860, 803, 828, 863, 848, 854, 804, 800, 888, 829, 848, 891, 886, 871, 881, 848, 863, 890, 863, 889, 805, 843, 864, 883, 853, 859, 894, 848, 871, 880, 840, 857, 853, 872, 839, 859, 891, 838, 860, 804, 859, 806, 859, 890, 863, 874, 807, 857, 800, 866, 843, 851, 867, 838, 802, 865, 875, 838, 835, 881, 810, 801, 842, 871, 885, 894, 868, 892, 860, 880, 851, 803, 858, 856, 855, 801, 843, 838, 875, 837, 806, 857, 880, 843, 856, 838, 806, 885, 851, 815, 815, 2459, 2460, 2462, 2454, 2480, 2460, 2461, 2439, 2454, 2461, 2439, 3088, 1732, 1758, 1731, 1746, 2455, 2536, 2551, 2495, 2442, 2482, 2485, 2486, 2432, 2482, 2452, 2546, 2460, 2453, 2484, 2440, 2540, 2546, 2529, 2479, 2435, 2444, 2529, 2432, 2458, 2485, 2441, 2456, 2537, 2440, 2473, 2432, 2495, 2495, 2546, 2441, 2447, 2479, 2449, 2435, 2461, 2487, 2467, 2491, 2480, 2442, 2440, 2461, 2478, 2478, 2441, 2478, 2474, 2441, 2528, 2467, 2456, 2476, 2493, 2459, 2451, 2477, 2490, 2491, 2473, 2546, 2450, 2488, 2459, 2481, 2494, 2543, 2467, 2481, 2444, 2477, 2451, 2453, 2432, 2538, 2463, 2539, 2442, 2459, 2481, 2480, 2482, 2480, 2465, 2445, 2539, 2541, 2539, 2490, 2433, 2543, 2447, 2483, 2485, 2452, 2460, 2542, 2435, 2538, 2462, 2463, 2456, 2529, 2542, 2474, 2532, 302, 319, 301, 301, 297, 305, 300, 314, 3012, 3010, 3028, 3011, 3039, 3024, 3036, 3028, 3047, 3051, 3051, 3055, 3053, 3041, 2912, 2847, 2816, 2915, 2924, 2922, 2840, 2844, 2884, 2817, 2924, 2887, 2890, 2907, 2893, 2924, 2915, 2886, 2915, 2885, 2841, 2935, 2908, 2895, 2921, 2919, 2882, 2924, 2907, 2892, 2932, 2917, 2921, 2900, 2939, 2919, 2887, 2938, 2912, 2840, 2919, 2842, 2919, 2886, 2915, 2902, 2843, 2917, 2844, 2910, 2935, 2927, 2911, 2938, 2846, 2909, 2903, 2938, 2943, 2893, 2838, 2845, 2934, 2907, 2889, 2882, 2904, 2880, 2912, 2892, 2927, 2847, 2918, 2916, 2923, 2845, 2935, 2938, 2903, 2937, 2842, 2917, 2892, 2935, 2916, 2938, 2842, 2889, 2927, 2835, 2835, 2065, 2076, 2072, 2077, 570, 540, 522, 541, 578, 558, 520, 522, 513, 539, 1878, 1908, 1889, 1906, 1911, 1911, 1914, 1844, 1838, 1845, 1835, 1851, 1843, 1879, 1906, 1909, 1902, 1891, 1824, 1851, 1882, 1909, 1919, 1897, 1908, 1906, 1919, 1851, 1834, 1838, 1824, 1851, 1867, 1873, 1857, 1834, 1834, 1835, 1851, 1881, 1902, 1906, 1911, 1919, 1844, 1882, 1867, 1832, 1882, 1845, 1833, 1839, 1835, 1837, 1834, 1836, 1845, 1835, 1835, 1827, 1824, 1851, 1900, 1901, 1842, 1851, 1882, 1899, 1899, 1911, 1918, 1868, 1918, 1913, 1872, 1906, 1903, 1844, 1838, 1832, 1836, 1845, 1832, 1837, 1851, 1843, 1872, 1875, 1871, 1878, 1879, 1847, 1851, 1911, 1906, 1904, 1918, 1851, 1884, 1918, 1912, 1904, 1908, 1842, 1851, 1869, 1918, 1897, 1896, 1906, 1908, 1909, 1844, 1839, 1845, 1835, 1851, 1880, 1907, 1897, 1908, 1910, 1918, 1844, 1834, 1832, 1837, 1845, 1835, 1845, 1836, 1834, 1835, 1832, 1845, 1834, 1833, 1836, 1851, 1878, 1908, 1913, 1906, 1911, 1918, 1851, 1864, 1914, 1917, 1914, 1897, 1906, 1844, 1838, 1832, 1836, 1845, 1832, 1837, 2713, 2708, 2702, 2716, 2719, 2705, 2712, 2713, 660, 655, 1312, 1325, 1335, 1317, 1318, 1320, 1313, 1312, 811, 807, 807, 803, 801, 813, 2271, 2265, 2255, 2264, 2244, 2251, 2247, 2255, 997, 1012, 998, 998, 994, 1018, 999, 1009, 1454, 1489, 1486, 1453, 1442, 1444, 1494, 1490, 1418, 1487, 1442, 1417, 1412, 1429, 1411, 1442, 1453, 1416, 1453, 1419, 1495, 1465, 1426, 1409, 1447, 1449, 1420, 1442, 1429, 1410, 1466, 1451, 1447, 1434, 1461, 1449, 1417, 1460, 1454, 1494, 1449, 1492, 1449, 1416, 1453, 1432, 1493, 1451, 1490, 1424, 1465, 1441, 1425, 1460, 1488, 1427, 1433, 1460, 1457, 1411, 1496, 1491, 1464, 1429, 1415, 1420, 1430, 1422, 1454, 1410, 1441, 1489, 1448, 1450, 1445, 1491, 1465, 1460, 1433, 1463, 1492, 1451, 1410, 1465, 1450, 1460, 1492, 1415, 1441, 1501, 1501, 32331, 22373, 23614, 23363, 23519, -32270, 32571, 2174, 3133, 3138, 3165, 3134, 3121, 3127, 3141, 3137, 3097, 3164, 3121, 3098, 3095, 3078, 3088, 3121, 3134, 3099, 3134, 3096, 3140, 3114, 3073, 3090, 3124, 3130, 3103, 3121, 3078, 3089, 3113, 3128, 3124, 3081, 3110, 3130, 3098, 3111, 3133, 3141, 3130, 3143, 3130, 3099, 3134, 3083, 3142, 3128, 3137, 3075, 3114, 3122, 3074, 3111, 3139, 3072, 3082, 3111, 3106, 3088, 3147, 3136, 3115, 3078, 3092, 3103, 3077, 3101, 3133, 3089, 3122, 3138, 3131, 3129, 3126, 3136, 3114, 3111, 3082, 3108, 3143, 3128, 3089, 3114, 3129, 3111, 3143, 3092, 3122, 3150, 3150, 2038, 2026, 2023, 2047, 2019, 2036, 1989, 2025, 2024, 2034, 2019, 2024, 2034, 1752, 1742, 1738, 1753, 1736, 1731, 1768, 1732, 1733, 1759, 1742, 1733, 1759};
    public static final Pattern j = Pattern.compile(C0093.m368(f22short, 1079, 98, 2890));
    public static final Pattern k = Pattern.compile(C0059.m234(f22short, 1177, 23, 1576));
    public static final Pattern l = Pattern.compile(C0081.m322(f22short, 1200, 30, 3058));
    public static volatile String n = "";
    public String a = "";
    public final Q b = new Q(1);
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";
    public long i = -1;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            f(X1.L(m(this.a + C0109.m432(f22short, 0, 11, 491) + URLEncoder.encode(str, C0050.m199(f22short, 11, 5, 1323))), ""), arrayList);
        } catch (Exception unused) {
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0006.m21(f22short, 16, 9, 481), C0125.m499(f22short, 25, 8, 1857), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0112.m445(f22short, 33, 9, 1215), C0118.m471(f22short, 42, 4, 887), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0053.m210(f22short, 46, 8, 2968), C0019.m75(f22short, 54, 2, 1642), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0126.m503(f22short, 56, 5, 2646), C0103.m408(f22short, 61, 2, 1363), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0101.m402(f22short, 63, 8, 2601), C0001.m1(f22short, 71, 2, 1694), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0055.m219(f22short, 73, 6, 1653), C0073.m288(f22short, 79, 2, 2521), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0118.m471(f22short, 81, 4, 3180), C0026.m102(f22short, 85, 3, 608), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0046.m182(f22short, 88, 18, 568), C0104.m414(f22short, 106, 3, 3094), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0045.m177(f22short, 109, 13, 2291), C0142.m567(f22short, 122, 3, 3099), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0133.m529(f22short, 125, 14, 3142), C0070.m277(f22short, 139, 4, 1680), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0095.m379(f22short, 143, 14, 2219), C0105.m416(f22short, 157, 4, 1252), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0055.m219(f22short, 161, 14, 2243), C0044.m175(f22short, 175, 4, 2328), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0018.m70(f22short, 179, 15, 2992), C0085.m339(f22short, 194, 4, 1541), null));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(C0053.m210(f22short, 198, 14, 1713), C0053.m210(f22short, 212, 4, 2111), null));
        com.github.catvod.spider.merge.D.b.z(C0135.m539(f22short, 216, 11, 402), C0045.m177(f22short, 227, 2, 786), null, arrayList2);
        f(X1.L(m(this.a), ""), arrayList);
        return com.github.catvod.spider.merge.p001b.g.z(arrayList2, arrayList);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strGroup;
        String strE;
        String str3 = str2;
        String strM83 = C0021.m83(f22short, 229, 4, 1211);
        String strM477 = C0120.m477(f22short, 233, 91, 1578);
        if (C0055.m219(f22short, 324, 8, 733).equals(str3)) {
            AbstractC0302v0.g0(str3, new i(4, this));
            return "";
        }
        String strI = AbstractC0280n1.i(str, str3, null, null);
        try {
            if (!str3.startsWith(strM83)) {
                str3 = this.a + str3;
            }
            String strM = m(str3);
            com.github.catvod.spider.merge.f0.g gVarL = X1.L(strM, "");
            if (!TextUtils.isEmpty(strM) && strM.contains(C0046.m182(f22short, 332, 7, 2569))) {
                InitOrigin.run(new RunnableC0452d(5));
                com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.C(FishCrypto.u(strM477, str3));
                gVar.p();
                gVar.b(strI);
                return gVar.r();
            }
            Matcher matcher = j.matcher(strM);
            if (matcher.find()) {
                String strC = c(matcher.group(1), matcher.group(2), String.format(C0116.m463(f22short, 339, 5, 886), Long.valueOf(Long.parseLong(matcher.group(3)))));
                Matcher matcher2 = k.matcher(strC);
                strE = matcher2.find() ? matcher2.group(1) : "";
                Matcher matcher3 = l.matcher(strC);
                strGroup = matcher3.find() ? matcher3.group(1) : "";
            } else {
                strGroup = "";
                strE = strGroup;
            }
            boolean zIsEmpty = TextUtils.isEmpty(strE);
            String strM186 = C0047.m186(f22short, 344, 3, 2935);
            String strM554 = C0139.m554(f22short, 347, 10, 802);
            if (zIsEmpty) {
                String strA = gVarL.Q(C0120.m477(f22short, 357, 22, 2850)).a(C0028.m108(f22short, 379, 3, 402));
                if (!TextUtils.isEmpty(strA)) {
                    String strA2 = a(strA);
                    strE = e(strA2);
                    if (!strE.startsWith(strM83)) {
                        strE = "";
                    }
                    HashMap map = new HashMap();
                    map.put(strM554, C0074.m292(f22short, 382, 121, 2198));
                    map.put(C0021.m83(f22short, 503, 25, 2983), C0130.m516(f22short, 528, 1, 2745));
                    map.put(C0118.m471(f22short, 529, 14, 434), C0125.m499(f22short, 543, 6, 2436));
                    map.put(C0114.m454(f22short, 549, 7, 542), this.a);
                    map.put(C0107.m427(f22short, 556, 14, 2591), C0098.m390(f22short, 570, 10, 3180));
                    map.put(C0135.m539(f22short, 580, 14, 2870), C0050.m199(f22short, 594, 8, 518));
                    if (TextUtils.isEmpty(strE)) {
                        String strW = X1.W(FishCrypto.u(strM477, strA2), map, this.b);
                        Matcher matcher4 = Pattern.compile(C0032.m126(f22short, 602, 36, 3190)).matcher(strW);
                        if (matcher4.find()) {
                            strE = matcher4.group(1);
                        }
                        Matcher matcher5 = Pattern.compile(C0003.m10(f22short, 638, 26, 2658), 32).matcher(strW);
                        if (TextUtils.isEmpty(strE) && matcher5.find()) {
                            try {
                                strE = new String(Base64.decode(new StringBuilder(new JSONObject(matcher5.group(1)).getString(C0096.m382(f22short, 664, 4, 2216))).reverse().toString(), 0), StandardCharsets.UTF_8);
                            } catch (Exception unused) {
                                strE = "";
                            }
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(strE)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0076.m301(f22short, 668, 5, 1616), 0);
                jSONObject.put(C0135.m539(f22short, 673, 7, 2913), "");
                jSONObject.put(strM186, FishCrypto.u(strM477, strE));
                HashMap map2 = new HashMap();
                map2.put(strM554, C0114.m454(f22short, 680, 159, 2096));
                map2.put(C0090.m358(f22short, 839, 6, 2033), this.a);
                jSONObject.put(C0045.m177(f22short, 845, 6, 2503), new JSONObject(map2).toString());
                if (!TextUtils.isEmpty(strGroup)) {
                    jSONObject.put(C0107.m427(f22short, 851, 4, 1944), C0097.m386(f22short, 855, 10, 2480));
                    jSONObject.put(C0074.m292(f22short, 865, 4, 2407), strGroup);
                }
                if (strI != null) {
                    jSONObject.put(C0063.m249(f22short, 869, 7, 861), strI);
                }
                return jSONObject.toString();
            }
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C(FishCrypto.u(strM477, str3));
            gVar2.p();
            gVar2.b(strI);
            return gVar2.r();
        } catch (Exception unused2) {
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        if (list == null || list.isEmpty()) {
            return AbstractC0449a.b();
        }
        String strM = list.get(0);
        if (C0019.m75(f22short, 876, 8, 1524).equals(strM)) {
            AbstractC0302v0.g0(strM, new i(4, this));
            return "";
        }
        if (!strM.startsWith(C0032.m126(f22short, 884, 4, 1647))) {
            strM = com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.a, strM);
        }
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(m(strM), "");
        k kVarA = AbstractC0449a.a(strM);
        com.github.catvod.spider.merge.f0.k kVarR = gVarL.R(C0017.m65(f22short, 888, 2, 341));
        if (kVarR != null) {
            kVarA.o(kVarR.T());
        }
        com.github.catvod.spider.merge.f0.k kVarR2 = gVarL.R(C0056.m223(f22short, 890, 10, 2050));
        if (kVarR2 == null) {
            kVarR2 = gVarL.R(C0043.m169(f22short, 900, 11, 1226));
        }
        if (kVarR2 != null) {
            String strC = kVarR2.c(C0097.m386(f22short, 911, 13, 2198));
            if (strC.isEmpty()) {
                strC = kVarR2.c(C0114.m454(f22short, 924, 3, 2756));
            }
            kVarA.p(strC);
        }
        com.github.catvod.spider.merge.f0.k kVarR3 = gVarL.R(C0089.m355(f22short, 927, 11, 2060));
        if (kVarR3 == null) {
            for (com.github.catvod.spider.merge.f0.k kVar : gVarL.Q(C0143.m570(f22short, 938, 3, 2045))) {
                if (kVar.T().contains(C0008.m31(f22short, 941, 4, 2302))) {
                    p pVar = kVar.a;
                    com.github.catvod.spider.merge.f0.k kVar2 = null;
                    if (pVar != null) {
                        List listC = ((com.github.catvod.spider.merge.f0.k) pVar).C();
                        int iL = com.github.catvod.spider.merge.f0.k.L(kVar, listC) + 1;
                        if (listC.size() > iL) {
                            kVar2 = (com.github.catvod.spider.merge.f0.k) listC.get(iL);
                        }
                    }
                    if (kVar2 != null) {
                        kVarR3 = kVar2;
                        break;
                    }
                }
            }
        }
        if (kVarR3 != null) {
            kVarA.l(kVarR3.T());
        }
        ArrayList<List> arrayList = new ArrayList();
        com.github.catvod.spider.merge.h0.d<com.github.catvod.spider.merge.f0.k> dVarQ = gVarL.Q(C0133.m529(f22short, 945, 14, 1196));
        boolean zIsEmpty = dVarQ.isEmpty();
        String strM285 = C0072.m285(f22short, 959, 15, 3121);
        if (!zIsEmpty) {
            for (com.github.catvod.spider.merge.f0.k kVar3 : dVarQ) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(kVar3.Q(strM285));
                if (!arrayList2.isEmpty()) {
                    arrayList.add(arrayList2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(gVarL.Q(C0017.m65(f22short, 974, 29, 733)));
            if (arrayList3.isEmpty()) {
                arrayList3.addAll(gVarL.Q(strM285));
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(arrayList3);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (List<com.github.catvod.spider.merge.f0.k> list2 : arrayList) {
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            for (com.github.catvod.spider.merge.f0.k kVar4 : list2) {
                String strTrim = kVar4.c(C0006.m21(f22short, 1003, 4, 1150)).trim();
                if (!TextUtils.isEmpty(strTrim) && linkedHashSet.add(strTrim)) {
                    String strTrim2 = kVar4.T().trim();
                    if (TextUtils.isEmpty(strTrim2)) {
                        strTrim2 = C0125.m499(f22short, 1007, 2, 2312);
                    }
                    arrayList6.add(strTrim2);
                    arrayList7.add(strTrim);
                }
            }
            if (!arrayList7.isEmpty()) {
                Iterator it = arrayList6.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str = (String) it.next();
                        if (!TextUtils.isEmpty(str)) {
                            String lowerCase = str.replaceAll(C0139.m554(f22short, 1009, 3, 2343), "").toLowerCase();
                            if (lowerCase.contains(C0109.m432(f22short, 1012, 2, 2439)) || lowerCase.startsWith(C0047.m186(f22short, 1014, 4, 2388))) {
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (int i = 0; i < arrayList7.size(); i++) {
                            String strN = n((String) arrayList6.get(i), linkedHashMap2);
                            if (sb.length() > 0) {
                                sb.append(C0082.m325(f22short, 1018, 1, 3159));
                            }
                            sb.append(strN);
                            sb.append(C0133.m529(f22short, 1019, 1, 2964));
                            sb.append((String) arrayList7.get(i));
                        }
                        arrayList4.add(n(C0073.m288(f22short, 1020, 4, 663), linkedHashMap));
                        arrayList5.add(sb.toString());
                    } else {
                        for (int i2 = 0; i2 < arrayList7.size(); i2++) {
                            arrayList4.add(n((String) arrayList6.get(i2), linkedHashMap));
                            arrayList5.add(C0028.m108(f22short, 1024, 3, 2039) + ((String) arrayList7.get(i2)));
                        }
                    }
                }
            }
        }
        String strM249 = C0063.m249(f22short, 1027, 3, 1085);
        String strJoin = TextUtils.join(strM249, arrayList4);
        String strJoin2 = TextUtils.join(strM249, arrayList5);
        kVarA.q(strJoin);
        kVarA.r(strJoin2);
        if (kVarR != null) {
            AbstractC0280n1.p(kVarR.T());
        }
        AbstractC0280n1.q(strJoin2);
        FishCrypto.c(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        if (!C0018.m70(f22short, 1030, 8, 2661).equals(str)) {
            return "";
        }
        InitOrigin.run(new RunnableC0452d(5));
        return "";
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        if (C0076.m301(f22short, 1038, 11, 1257).equals(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new k(C0006.m21(f22short, 1064, 8, 706), C0056.m223(f22short, 1052, 4, 2702), AbstractC0302v0.y0(), getLoginStatus() + C0030.m116(f22short, 1049, 3, 2846) + this.a, C0079.m314(f22short, 1056, 8, 1016)));
            return AbstractC0449a.c(1, 1, arrayList.size(), arrayList.size(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        String strM = com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.a, str);
        if (!str2.equals(C0001.m1(f22short, 1072, 1, 3272))) {
            strM = this.a + str + C0093.m368(f22short, 1073, 6, 1884) + str2;
        }
        f(X1.L(m(strM), ""), arrayList2);
        return com.github.catvod.spider.merge.p001b.g.y(arrayList2);
    }

    public static void b(String str, ArrayList arrayList) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strTrim = str.trim();
        if (!strTrim.startsWith(C0125.m499(f22short, 1230, 7, 1142))) {
            String strM193 = C0049.m193(f22short, 1237, 8, 2390);
            if (!strTrim.startsWith(strM193)) {
                strTrim = strM193.concat(strTrim);
            }
        }
        String strReplaceAll = strTrim.replaceAll(C0053.m210(f22short, 1245, 3, 2464), "");
        if (arrayList.contains(strReplaceAll)) {
            return;
        }
        arrayList.add(strReplaceAll);
    }

    public static String c(String str, String str2, String str3) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            Cipher cipher = Cipher.getInstance(C0030.m116(f22short, 1248, 20, 2236));
            Charset charset = StandardCharsets.UTF_8;
            cipher.init(2, new SecretKeySpec(str2.getBytes(charset), C0011.m42(f22short, 1268, 3, 1074)), new IvParameterSpec(str3.getBytes(charset)));
            return new String(cipher.doFinal(bArrDecode), charset);
        } catch (Exception unused) {
            return "";
        }
    }

    public static void clearLogin() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0133.m529(f22short, 1271, 8, 1647), true);
        } catch (Exception unused) {
        }
        p(jSONObject);
    }

    public static String e(String str) {
        String strM182 = C0046.m182(f22short, 1279, 3, 1449);
        String strM54 = C0014.m54(f22short, 1282, 5, 2493);
        String strM234 = C0059.m234(f22short, 1287, 1, 540);
        try {
            int iIndexOf = str.indexOf(63);
            if (iIndexOf >= 0 && iIndexOf < str.length() - 1) {
                String strSubstring = str.substring(iIndexOf + 1);
                if (TextUtils.isEmpty(strSubstring)) {
                    return "";
                }
                for (String str2 : strSubstring.split(strM234)) {
                    int iIndexOf2 = str2.indexOf(61);
                    if (strM182.equals(URLDecoder.decode(iIndexOf2 >= 0 ? str2.substring(0, iIndexOf2) : str2, strM54))) {
                        return URLDecoder.decode((iIndexOf2 >= 0 ? str2.substring(iIndexOf2 + 1) : "").replace(C0139.m554(f22short, 1288, 5, 1262), strM234), strM54);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static void f(com.github.catvod.spider.merge.f0.g gVar, ArrayList arrayList) {
        for (com.github.catvod.spider.merge.f0.k kVar : gVar.Q(C0128.m511(f22short, 1293, 7, 2300))) {
            try {
                com.github.catvod.spider.merge.f0.k kVarR = kVar.R(C0063.m249(f22short, 1300, 4, 700));
                if (kVarR != null) {
                    String strC = kVarR.c(C0030.m116(f22short, 1304, 4, 2245));
                    String strT = kVarR.T();
                    if (!strC.isEmpty() && !strT.isEmpty()) {
                        com.github.catvod.spider.merge.f0.k kVarR2 = kVar.R(C0092.m365(f22short, 1308, 3, 2929));
                        String strC2 = kVarR2 != null ? kVarR2.c(C0125.m499(f22short, 1311, 13, 2871)) : "";
                        if (strC2.isEmpty() && kVarR2 != null) {
                            strC2 = kVarR2.c(C0032.m126(f22short, 1324, 3, 401));
                        }
                        com.github.catvod.spider.merge.f0.k kVarR3 = kVar.R(C0021.m83(f22short, 1327, 9, 2866));
                        arrayList.add(new k(strC, strT, strC2, kVarR3 != null ? kVarR3.T() : ""));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static String getCurrentSiteUrl() {
        return TextUtils.isEmpty(n) ? FishCrypto.v(C0095.m379(f22short, 1336, 111, 1182)) : n;
    }

    public static String getLoginStatus() {
        JSONObject jSONObjectK = k();
        boolean z = false;
        boolean zOptBoolean = jSONObjectK.optBoolean(C0104.m414(f22short, 1447, 8, 1070), false);
        String strM169 = C0043.m169(f22short, 1455, 3, 1122);
        if (zOptBoolean) {
            return strM169;
        }
        boolean z2 = !TextUtils.isEmpty(P1.u0(jSONObjectK.optString(C0046.m182(f22short, 1458, 6, 2012), "")));
        if (!TextUtils.isEmpty(jSONObjectK.optString(C0049.m193(f22short, 1464, 8, 2615), "").trim()) && !TextUtils.isEmpty(jSONObjectK.optString(C0115.m459(f22short, 1472, 8, 2572), ""))) {
            z = true;
        }
        if (z2 && z) {
            return C0001.m1(f22short, 1480, 12, 1552);
        }
        if (z2) {
            return C0128.m511(f22short, 1492, 9, 1023);
        }
        return z ? C0104.m414(f22short, 1501, 5, 2141) : strM169;
    }

    public static String getSavedCookie() {
        JSONObject jSONObjectK = k();
        return jSONObjectK.optBoolean(C0044.m175(f22short, 1506, 8, 630), false) ? "" : P1.u0(jSONObjectK.optString(C0047.m186(f22short, 1514, 6, 883), ""));
    }

    public static boolean hasLoginConfig() {
        JSONObject jSONObjectK = k();
        if (jSONObjectK.optBoolean(C0009.m33(f22short, 1520, 8, 1744), false)) {
            return false;
        }
        return (TextUtils.isEmpty(P1.u0(jSONObjectK.optString(C0092.m365(f22short, 1528, 6, 2531), ""))) && (TextUtils.isEmpty(jSONObjectK.optString(C0014.m54(f22short, 1534, 8, 1330), "").trim()) || TextUtils.isEmpty(jSONObjectK.optString(C0089.m355(f22short, 1542, 8, 1261), "")))) ? false : true;
    }

    public static boolean importCookie(String str) {
        String strU0 = P1.u0(str);
        if (!TextUtils.isEmpty(strU0)) {
            for (String str2 : strU0.split(C0049.m193(f22short, 1550, 1, 711))) {
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.startsWith(C0047.m186(f22short, 1551, 20, 2481)) || lowerCase.startsWith(C0047.m186(f22short, 1571, 14, 1465))) {
                    saveCookie(strU0);
                    CZ cz = o;
                    if (cz == null) {
                        return true;
                    }
                    cz.l();
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject k() {
        try {
            String strM473 = C0119.m473(f22short, 1585, 11, 2381);
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(strM473);
            return TextUtils.isEmpty(strH) ? new JSONObject() : new JSONObject(strH);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static boolean loginWithCredentials(String str, String str2) throws Throwable {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                CZ cz = o;
                if (cz == null) {
                    if (InitOrigin.context() == null) {
                        return false;
                    }
                    cz = new CZ();
                    cz.init(InitOrigin.context(), n);
                }
                synchronized (cz) {
                    try {
                        String str3 = cz.c;
                        String str4 = cz.d;
                        String str5 = cz.e;
                        cz.b.a();
                        cz.e = "";
                        cz.c = str.trim();
                        cz.d = str2;
                        cz.f = false;
                        cz.g = "";
                        cz.h = true;
                        if (cz.h()) {
                            saveCredentials(str, str2);
                            cz.i = m;
                            return true;
                        }
                        cz.b.a();
                        cz.e = str5;
                        if (!TextUtils.isEmpty(str5)) {
                            cz.b.b(cz.a, str5);
                        }
                        cz.c = str3;
                        cz.d = str4;
                        cz.f = false;
                        cz.g = "";
                        cz.h = false;
                        return false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String n(String str, LinkedHashMap linkedHashMap) {
        Integer num = (Integer) linkedHashMap.get(str);
        int iIntValue = num == null ? 1 : num.intValue() + 1;
        linkedHashMap.put(str, Integer.valueOf(iIntValue));
        if (iIntValue == 1) {
            return str;
        }
        return str + C0028.m108(f22short, 1596, 1, 2972) + iIntValue;
    }

    public static void p(JSONObject jSONObject) {
        String string = jSONObject.toString();
        boolean z = FishCrypto.a;
        C0297t1.j(C0082.m325(f22short, 1597, 11, 1593), string);
        m++;
    }

    public static void saveCookie(String str) {
        JSONObject jSONObjectK = k();
        jSONObjectK.remove(C0011.m42(f22short, 1608, 8, 2807));
        String strU0 = P1.u0(str);
        boolean zIsEmpty = TextUtils.isEmpty(strU0);
        String strM75 = C0019.m75(f22short, 1616, 6, 2922);
        if (zIsEmpty) {
            jSONObjectK.remove(strM75);
        } else {
            try {
                jSONObjectK.put(strM75, strU0);
            } catch (Exception unused) {
            }
        }
        p(jSONObjectK);
    }

    public static void saveCredentials(String str, String str2) {
        JSONObject jSONObjectK = k();
        jSONObjectK.remove(C0032.m126(f22short, 1622, 8, 2038));
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strM503 = C0126.m503(f22short, 1630, 8, 523);
        String strM126 = C0032.m126(f22short, 1638, 8, 2825);
        if (zIsEmpty || TextUtils.isEmpty(str2)) {
            jSONObjectK.remove(strM126);
            jSONObjectK.remove(strM503);
        } else {
            try {
                jSONObjectK.put(strM126, str.trim());
                jSONObjectK.put(strM503, str2);
            } catch (Exception unused) {
            }
        }
        p(jSONObjectK);
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(C0006.m21(f22short, 1646, 2, 1425))) {
            return C0027.m105(f22short, 1648, 6, 3096).concat(str);
        }
        if (str.startsWith(C0109.m432(f22short, 1654, 4, 1789))) {
            return str;
        }
        String strM379 = C0095.m379(f22short, 1658, 1, 941);
        return str.startsWith(strM379) ? com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.a, str) : com.github.catvod.spider.merge.D.b.n(new StringBuilder(), this.a, strM379, str);
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0089.m355(f22short, 1659, 6, 1427));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0120.m477(f22short, 1665, 15, 1881));
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

    public final HashMap d() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(C0070.m277(f22short, 1680, 10, 3054), C0010.m36(f22short, 1690, 159, 2813));
        mapS.put(C0126.m503(f22short, 1850, 7, 1146), this.a + C0095.m379(f22short, 1849, 1, 1902));
        mapS.put(C0045.m177(f22short, 1857, 15, 1930), C0122.m486(f22short, 1872, 14, 2308));
        return mapS;
    }

    public void destroy() {
        if (o == this) {
            o = null;
        }
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0128.m511(f22short, 1886, 13, 986));
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

    public final boolean g() {
        HttpUrl httpUrl = HttpUrl.parse(this.a);
        if (httpUrl == null) {
            return false;
        }
        Iterator it = this.b.loadForRequest(httpUrl).iterator();
        while (it.hasNext()) {
            String lowerCase = ((Cookie) it.next()).name().toLowerCase();
            if (lowerCase.startsWith(C0118.m471(f22short, 1899, 20, 2658)) || lowerCase.startsWith(C0011.m42(f22short, 1919, 14, 2801))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x016a A[PHI: r4
  0x016a: PHI (r4v5 boolean) = (r4v3 boolean), (r4v6 boolean), (r4v6 boolean), (r4v6 boolean) binds: [B:23:0x0168, B:19:0x015f, B:21:0x0165, B:17:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:4:0x0020  */
    public final boolean h() {
        String strGroup;
        boolean zHas;
        boolean zG;
        int i;
        String strM219 = C0055.m219(f22short, 1933, 7, 1947);
        String strO = o();
        if (TextUtils.isEmpty(strO)) {
            strGroup = "";
        } else {
            Matcher matcher = Pattern.compile(C0095.m379(f22short, 1940, 36, 2310), 2).matcher(strO);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                strGroup = "";
            }
        }
        HashMap map = new HashMap();
        map.put(C0021.m83(f22short, 1976, 8, 338), this.c);
        map.put(C0055.m219(f22short, 1984, 8, 3237), this.d);
        map.put(C0137.m545(f22short, 1992, 5, 1879), "");
        map.put(C0139.m554(f22short, 1998, 3, 2722), this.a + C0092.m365(f22short, 1997, 1, 2622));
        map.put(C0092.m365(f22short, 2001, 10, 465), "");
        map.put(C0130.m516(f22short, 2011, 7, 2422), "");
        HashMap mapD = d();
        if (!TextUtils.isEmpty(strGroup)) {
            mapD.put(C0027.m105(f22short, 2018, 10, 625), strGroup);
        }
        try {
            N nO = X1.O(FishCrypto.u(C0090.m358(f22short, 2043, 91, 786), this.a + C0114.m454(f22short, 2028, 15, 2619)), map, mapD, this.b);
            try {
                JSONObject jSONObject = new JSONObject(nO.a());
                zHas = jSONObject.has(strM219);
                try {
                    if (jSONObject.optInt(strM219, 0) == 1 || jSONObject.optBoolean(strM219, false)) {
                        zG = g();
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                zHas = false;
            }
            if (!zHas && (i = nO.a) >= 200 && i < 300) {
                zG = g();
            }
            if (zG) {
                j();
            }
            return zG;
        } catch (Exception unused3) {
            return false;
        }
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0053.m210(f22short, 2134, 11, 2547));
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

    public final String i() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        String strM414 = C0104.m414(f22short, 2145, 1, 3098);
        sb.append(strM414);
        sb.append(this.c);
        sb.append(strM414);
        sb.append(this.d);
        return sb.toString();
    }

    public void init(Context context, String str) throws Throwable {
        String strTrim;
        boolean z;
        String strM223 = C0056.m223(f22short, 2146, 4, 1719);
        super.init(context, str);
        Init.init(context);
        o = this;
        String strV = FishCrypto.v(C0125.m499(f22short, 2150, 111, 2521));
        this.a = strV;
        n = strV;
        this.b.a();
        this.f = false;
        this.g = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.h = false;
        ArrayList<String> arrayList = new ArrayList();
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strM177 = C0045.m177(f22short, 2261, 8, 350);
        String strM339 = C0085.m339(f22short, 2269, 8, 2993);
        String strM292 = C0074.m292(f22short, 2277, 6, 2948);
        if (zIsEmpty) {
            strTrim = "";
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                strTrim = jSONObject.optString(strM292, "").trim();
                try {
                    this.c = jSONObject.optString(strM339, "").trim();
                    this.d = jSONObject.optString(strM177, "");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strM223);
                    if (jSONArrayOptJSONArray != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            b(jSONArrayOptJSONArray.optString(i), arrayList);
                        }
                    } else {
                        b(jSONObject.optString(strM223), arrayList);
                    }
                } catch (Exception unused) {
                    b(str, arrayList);
                }
            } catch (Exception unused2) {
                strTrim = "";
            }
        }
        if (!arrayList.isEmpty()) {
            this.a = (String) arrayList.get(0);
            for (String str2 : arrayList) {
                HttpURLConnection httpURLConnection = null;
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(FishCrypto.u(C0140.m558(f22short, 2283, 91, 2862), str2)).openConnection();
                    try {
                        httpURLConnection2.setInstanceFollowRedirects(true);
                        httpURLConnection2.setConnectTimeout(5000);
                        httpURLConnection2.setReadTimeout(5000);
                        httpURLConnection2.setRequestMethod(C0109.m432(f22short, 2374, 4, 2137));
                        httpURLConnection2.setRequestProperty(C0049.m193(f22short, 2378, 10, 623), C0018.m70(f22short, 2388, 159, 1819));
                        int responseCode = httpURLConnection2.getResponseCode();
                        z = responseCode >= 200 && responseCode < 400;
                        httpURLConnection2.disconnect();
                    } catch (Exception unused3) {
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Exception unused4) {
                } catch (Throwable th2) {
                    th = th2;
                }
                if (z) {
                    this.a = str2;
                    break;
                }
            }
        }
        n = this.a;
        JSONObject jSONObjectK = k();
        if (jSONObjectK.optBoolean(C0133.m529(f22short, 2547, 8, 2813), false)) {
            this.c = "";
            this.d = "";
            this.e = "";
        } else if (jSONObjectK.has(strM292) || jSONObjectK.has(strM339) || jSONObjectK.has(strM177)) {
            this.e = P1.u0(jSONObjectK.optString(strM292, ""));
            this.c = jSONObjectK.optString(strM339, "").trim();
            this.d = jSONObjectK.optString(strM177, "");
        } else {
            this.e = P1.u0(strTrim);
        }
        if (!TextUtils.isEmpty(this.e)) {
            this.b.b(this.a, this.e);
        }
        this.i = m;
    }

    public final void j() {
        HttpUrl httpUrl = HttpUrl.parse(this.a);
        if (httpUrl == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Cookie cookie : this.b.loadForRequest(httpUrl)) {
            if (sb.length() > 0) {
                sb.append(C0096.m382(f22short, 2555, 2, 687));
            }
            sb.append(cookie.name());
            sb.append('=');
            sb.append(cookie.value());
        }
        if (sb.length() > 0) {
            String string = sb.toString();
            this.e = string;
            saveCookie(string);
            this.i = m;
        }
    }

    public final void l() {
        if (this.i == m) {
            return;
        }
        JSONObject jSONObjectK = k();
        String strI = i();
        if (jSONObjectK.optBoolean(C0135.m539(f22short, 2557, 8, 1348), false)) {
            this.e = "";
            this.c = "";
            this.d = "";
        } else {
            this.e = P1.u0(jSONObjectK.optString(C0030.m116(f22short, 2565, 6, 840), ""));
            this.c = jSONObjectK.optString(C0008.m31(f22short, 2571, 8, 2218), "").trim();
            this.d = jSONObjectK.optString(C0098.m390(f22short, 2579, 8, 917), "");
        }
        if (!strI.equals(i())) {
            this.b.a();
            if (!TextUtils.isEmpty(this.e)) {
                this.b.b(this.a, this.e);
            }
            this.f = false;
            this.g = "";
            this.h = false;
        }
        this.i = m;
    }

    public final String m(String str) {
        l();
        o();
        if (!TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d) && !this.h) {
            this.h = true;
            h();
        }
        String strM31 = C0008.m31(f22short, 2587, 91, 1504);
        String strU = FishCrypto.u(strM31, str);
        HashMap mapD = d();
        Q q = this.b;
        String strW = X1.W(strU, mapD, q);
        if (TextUtils.isEmpty(strW) || !strW.contains(C0017.m65(f22short, 2678, 7, 2096)) || TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d)) {
            return strW;
        }
        this.h = false;
        this.f = false;
        o();
        if (!TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d) && !this.h) {
            this.h = true;
            h();
        }
        return X1.W(FishCrypto.u(strM31, str), d(), q);
    }

    public final String o() {
        if (!this.f) {
            this.g = X1.W(FishCrypto.u(C0008.m31(f22short, 2686, 91, 3187), this.a + C0011.m42(f22short, 2685, 1, 2129)), d(), this.b);
            this.f = true;
        }
        return this.g;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0076.m301(f22short, 2777, 13, 1926));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0140.m558(f22short, 2790, 13, 1707));
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

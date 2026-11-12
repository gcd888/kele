package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0265i1;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.RunnableC0240a0;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.X0;
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
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
import com.github.catvod.spider.merge.p000a.V;
import com.github.catvod.spider.merge.p000a.Z0;
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
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.W;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Market extends Spider {
    public ArrayList a;
    public final ArrayList b = new ArrayList();

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f69short = {3001, 3001, 2966, 2964, 2947, 2965, 2947, 2962, 3001, 3001, 26302, -31162, 21651, 24239, 1534, 1534, 1474, 1492, 1490, 1493, 1486, 1484, 1534, 1534, 26443, 29662, -31568, 24256, 19219, 1584, 1584, 1564, 1546, 1563, 1563, 1542, 1537, 1544, 1584, 1584, -30438, 32202, 2139, 2143, 2123, 2136, 2113, 1892, 1906, 1519, 1508, 1532, 1509, 1511, 1508, 1514, 1519, 1457, 22640, 26577, 23170, 19337, -29953, 32236, -29146, -1394, -29067, 21162, 23227, 32533, 19375, 32236, -29146, 19608, -29202, 19560, 20530, 26483, 26587, -609, -30364, -29369, 21581, 20612, -29957, -27810, 26403, -28006, 24698, 1927, 24656, 24824, 29492, 24631, 19270, 1529, 1524, -31587, 21756, 25479, 25108, 20506, 20586, 24091, -30193, 3088, 3111, 3108, 3111, 3120, 3111, 3120, 1904, 1900, 1900, 1896, 1899, 1826, 1847, 1847, 1896, 1913, 1910, 1846, 1897, 1901, 1913, 1898, 1907, 1846, 1915, 1910, 1847, 3139, 3167, 3167, 3163, 3160, 3089, 3076, 3076, 3151, 3161, 3138, 3165, 3150, 3077, 3166, 3144, 3077, 3144, 3141, 3076, 28197, 24121, 28068, 27703, 18410, 32015, 25194, 24097, 22735, 20494, -2555, -32002, 29444, 23815, -26428, -32036, 28293, 28438, 21273, -30963, 2578, 2568, 3317, 3321, 3306, 3315, 3325, 3308, 3271, 635, 624, 616, 625, 627, 624, 638, 635, 549, 2048, 24818, 24666, 29590, 24725, 19428, 1371, 1366, 30101, 31772, 28483, 17458, 1698, 2582, 23830, 20407, -30629, -26356, 1838, 1977, 1838, 22621, 21827, 18740, 21785, -28826, 31778, 18987, 18816, -30474, 3052, 2988, 2983, 3007, 2982, 2980, 2983, 2985, 2988, 3058, 3117, 3105, 3122, 3115, 3109, 3124, 3103, 3105, 3108, 3108, 1179, 1175, 1156, 1181, 1171, 1154, 1193, 1183, 1176, 1168, 1177, 1154, 1166, 1181, 1156, 1162, 1179, 1200, 1163, 1162, 1155, 1162, 1179, 1162, 1046, 1053, 1029, 1052, 1054, 1053, 1043, 1046, 1096, 3194, 3194, 3157, 3159, 3136, 3158, 3136, 3153, 3194, 3194, 24605, 25471, -25061, -29407, 21657, 31460, -26853, 31032, 18555, 27383, 24927, 24927, 25374, 28882, 24430, 22301, 1657, 1539, 1557, 21584, 18685, 1793, 1793, 1853, 1835, 1837, 1834, 1841, 1843, 1793, 1793, 24652, 25390, -30940, 23892, 18567, 21704, 31413, -29390, 20973, -29317, 31147, 18664, 27454, 21605, 25036, 25485, 28737, 24573, 22414, 1770, 1680, 1670, 21699, 18542, 2776, 2776, 2804, 2786, 2803, 2803, 2798, 2793, 2784, 2776, 2776, 1200, 1205, 1205, 25932, 23063, 23217, 29900, 24179, 22016, 1892, 1822, 1800, 2522, 2518, 2501, 2524, 2514, 2499, 2536, 2518, 2515, 2515, 680, 681, 672, 21978, -28258, 22012, 31617, -29980, 20628, 17735, 3125, 3129, 3114, 3123, 3133, 3116, 3079, 3132, 3133, 3124, 3133, 3116, 3133, 2301, 2298, 2290, 2299, 28478, 32720, -26218, 30645, 21844, 22602, 1760, 1772, 1791, 1766, 1768, 1785, 1746, 1764, 1763, 1771, 1762, 2317, 2312, 2322, 2325, 2953, 2968, 2974, 2972, 1752, 1737, 1743, 1741, 1739, 1735, 1757, 1734, 1756, 2255, 2250, 2254, 2250, 2263, 2538, 2545, 2538, 2559, 2546, 1399, 23110, -30821, 20951, -31293, 27009, 26921, 31461, 24167, 17098, 31375, 21300, 3112, 3109, 19490, 26368, 24878, 29867, 32126, 29943, 32340, 21924, -715, 956, 952, 940, 959, 934, 993, 1015, 3305, 3307, 3308, 3302, 23556, 20762, 32556, 21724, 28662, 25694, 20590, -28134, 21202, 22766, -933, -30560, 20816, 24629, 32556, 21724, 30732, -27810, 24897, -29565, 21897, 19805, 32240, -29498, 19765, 20761, 19892, 30193, 23626, 26013, 26367, 26264, 19945, -1005, 20720, -29493, 21953, 19733, 32184, 24841, 27615, 25850, 20761, 19892, 21146, 22694, 25122, 24896, 21797, 24345, -32502, 20843, 20667, 19478, 26426, 19531, 20650, -29995, 23436, -28776, 647, 669, 24193, -31908, 21776, -32508, -3283, -30762, 30252, 22575, -25108, -30732, 27402, 31323, 21365, 28556, 27463, 3325, 3313, 3313, 3317, 3319, 3323, 1262, 1261, 1253, 1259, 1260, 27496, 23406, 28857, 23608, Short.MAX_VALUE, 491, 506, 488, 488, 504, 500, 511, 510, 22416, 19261, 1798, 1853, 1849, 1847, 1852, 2087, 2108, 2104, 2102, 2109, 2327, 2326, 2317, 2393, 2335, 2326, 2316, 2327, 2333, 1420, 1419, 1427, 1412, 1417, 1420, 1409, 2427, 2406, 2402, 2410, 2400, 2426, 2427, 1059, 1086, 1082, 1074, 1075, 1143, 1080, 1058, 1059, 3294, 3289, 3281, 3284, 3293, 3292, 3224, 3276, 3287, 3224, 3291, 3287, 3286, 3286, 3293, 3291, 3276, 2925, 2934, 2937, 2938, 2932, 2941, 2872, 2924, 2935, 2872, 2922, 2941, 2923, 2935, 2932, 2926, 2941, 29685, 29304, 21686, -30357, 24359, -29901, -1780, 30224, 30621, -31073, 27364, 20592, -31644, -2469, 22644, -29850, 22121, 21162, 28371, 27021, 28283, 27864, -32732, -24971, -2943, 26613, 22515, 31780, 18984, 28486, 31819, 26163, 22999, 23828, 24941, -1217, -24767, -32320, 32314, 22292, 27223, -26356, 30511, -31385, 23478, -2213, 1674, 1691, 1684, 1702, 1748, 1675, 1679, 1691, 1672, 1681, 1702, 1748, 1689, 1684, 1749, 1673, 1749, 1746, 1697, 1700, 1702, 1702, 1670, 1753, 1749, 1703, 1745, 1747, 2844, 2826, 2833, 2830, 2845, 2852, 2902, 2829, 2843, 2852, 2902, 2843, 2838, 2903, 2827, 2903, 2896, 2851, 2854, 2852, 2852, 2820, 2907, 2903, 2853, 2899, 2897, 2380, 2389, 2398, 2405, 2387, 2398, 3318, 3311, 3300, 3295, 3310, 3297, 3309, 3301, 798, 775, 780, 823, 792, 769, 779, 2934, 2927, 2916, 2911, 2930, 2917, 2925, 2913, 2930, 2923, 2931, 684, 686, 697, 676, 674, 675, 484, 488, 507, 482, 492, 509, 470, 487, 486, 486, 505, 419, 418, 432, 475, 462, 2284, 2693, 514, 521, 517, 542, 3125, 3105, 3107, 832, 843, 839, 1195, 1191, 1195, 1465, 1456, 632, 612, 612, 608, 611, 554, 575, 575, 633, 637, 631, 574, 633, 627, 639, 638, 611, 552, 574, 627, 639, 637, 575, 627, 639, 636, 639, 610, 575, 553, 550, 575, 628, 639, 627, 613, 637, 629, 638, 612, 574, 608, 638, 631, 441, 425, 428, 863, 843, 852, 2643, 2631, 2648, 2643, 3102, 3074, 3074, 3078, 3077, 3148, 3161, 3161, 3103, 3099, 3089, 3160, 3103, 3093, 3097, 3096, 3077, 3150, 3160, 3093, 3097, 3099, 3161, 3093, 3097, 3098, 3097, 3076, 3161, 3151, 3136, 3161, 3099, 3077, 3163, 3091, 3086, 3093, 3091, 3098, 3160, 3078, 3096, 3089, 771, 771, 775, 1918, 1918, 1914, 1910, 2440, 2452, 2452, 2448, 2451, 2522, 2511, 2511, 2441, 2445, 2439, 2510, 2441, 2435, 2447, 2446, 2451, 2520, 2510, 2435, 2447, 2445, 2511, 2435, 2447, 2444, 2447, 2450, 2511, 2521, 2518, 2511, 2445, 2451, 2509, 2448, 2447, 2455, 2437, 2450, 2448, 2447, 2441, 2446, 2452, 2510, 2448, 2446, 2439, 1246, 1229, 1246, 1356, 1281, 1122, 1137, 1128, 1220, 1233, 1218, 2619, 2598, 2639, 2643, 2643, 2647, 2644, 
    2589, 2568, 2568, 2638, 2634, 2624, 2569, 2638, 2628, 2632, 2633, 2644, 2591, 2569, 2628, 2632, 2634, 2568, 2628, 2632, 2635, 2632, 2645, 2568, 2590, 2577, 2568, 2630, 2645, 2628, 2639, 2638, 2641, 2626, 2569, 2647, 2633, 2624, 1678, 1680, 1689, 1290, 1284, 1291, 2394, 2368, 2391, 2737, 2731, 2750, 2748, 496, 511, 482, 764, 750, 745, 763, 2727, 2747, 2747, 2751, 2748, 2805, 2784, 2784, 2726, 2722, 2728, 2785, 2726, 2732, 2720, 2721, 2748, 2807, 2785, 2732, 2720, 2722, 2784, 2732, 2720, 2723, 2720, 2749, 2784, 2806, 2809, 2784, 2726, 2722, 2734, 2728, 2730, 2785, 2751, 2721, 2728, 1399, 1382, 1405, 1213, 1185, 1185, 1189, 1190, 1263, 1274, 1274, 1212, 1208, 1202, 1275, 1212, 1206, 1210, 1211, 1190, 1261, 1275, 1206, 1210, 1208, 1274, 1206, 1210, 1209, 1210, 1191, 1274, 1260, 1251, 1274, 1204, 1211, 1201, 1191, 1210, 1212, 1201, 1272, 1210, 1190, 1275, 1189, 1211, 1202, 311, 299, 299, 303, 300, 357, 368, 368, 310, 306, 312, 369, 310, 316, 304, 305, 300, 359, 369, 316, 304, 306, 368, 316, 304, 307, 304, 301, 368, 358, 361, 368, 313, 310, 307, 314, 369, 303, 305, 312, 2995, 2981, 909, 905, 925, 910, 919, 926, 653, 650, 657, 661, 667, 656, 1973, 1967, 412, -32386, 20767, 20687, 19554, 669, 678, 674, 684, 679, 23544, -28692, 25041, 28800, 22958, 24515, 22448, -29731, 21772, -1545, 25371, 27182, 18672, -30330, 17589, 28567, 27065, 31804, 30185, 31840, 30403, 23859, 22973, -26563, -29124, -24725, 2613, 2602, 2599, 2598, 2604, 28437, 17508, 21419, 2234, 2227, 2224, 2232, 2233, 2222, 22416, 18480, 597, 590, 594, 607, 584, 1884, 1886, 1881, 1875, 29820, 24460, -26855, -32155, 22155, 31606, 27109, 23561, 2227, 2236, 2224, 2232, 2178, 2236, 2222, 2238, 21220, 32537, 22267, 22630, 1923, 1932, 1920, 1928, 1970, 1929, 1928, 1950, 1934, 23656, 22848, 28204, 23488, 1645, 1655, 1636, 1659, 1601, 1663, 1645, 1661, 24209, 23481, 22436, 22841, 2297, 2275, 2288, 2287, 2261, 2286, 2287, 2297, 2281, 793, 773, 792, 798, 27471, 22098, 1281, 1303, 1919, 1915, 1903, 1916, 1893, 27971, 27856, 23231, 21196, 20865, 19756, 2548, 2530, 23463, 18186, 1092, 1917, 2684, 2677, 2678, 2686, 2687, 2664, 317, 305, 290, 315, 309, 292, 271, 318, 319, 319, 288, 884, 886, 881, 891, 1223, 1243, 1222, 1216, 770, 779, 776, 768, 769, 790, 1472, 1487, 1482, 1475, 1529, 1480, 1479, 1483, 1475, 1038, 1027, 1048, 781, 786, 799, 798, 788, 989, 966, 986, 983, 960, 2885, 2890, 2886, 2894, 2932, 2890, 2904, 2888, 417, 430, 418, 426, 400, 427, 426, 444, 428, 692, 686, 701, 674, 664, 678, 692, 676, 2803, 2793, 2810, 2789, 2783, 2788, 2789, 2803, 2787, 473, 470, 475, 2236, 2215, 2222, 2237, 2218, 2192, 2217, 2214, 2219, 2192, 2235, 2208, 2212, 2218, 2209, 1130, 24604, 19309, 23714, 2315, 2314, 2328, 2419, 2406, 412, 390, 405, 394, 2355, 1415, 1420, 1427, 1476, 1513, 1504, 2089, 2082, 2109, 2154, 2113, 2126, 1319, 1324, 1328, 1380, 1349, 1344, 709, 714, 719, 710, 28127, 18094, 2373, 2382, 2390, 2383, 2381, 2382, 2368, 2373, 2331, 1755, 1753, 1742, 1747, 1749, 1748, 388, 390, 403, 386, 384, 392, 405, 414, 420, 392, 393, 403, 386, 393, 403, 2308, 2309, 2324, 2305, 2313, 2316, 2339, 2319, 2318, 2324, 2309, 2318, 2324, 3293, 3290, 3288, 3280, 3318, 3290, 3291, 3265, 3280, 3291, 3265, 1126, 1121, 1138, 2152, 2159, 2161, 3032, 3031, 3035, 3027, 941, 943, 954, 939, 937, 929, 956, 935, 939, 957, 423, 443, 443, 447, 26294, 21985, 21905, 3055, 2988, 2976, 2995, 2986, 2980, 2997, 2974, 2978, 2990, 2991, 2983, 2984, 2982, 1711, 1707, 1727, 1708, 1717, 1856, 1878, 2397, 2394, 2369, 2373, 2379, 2368, 3101, 3078, 3087, 3100, 3083, 3137, 3101, 3078, 3087, 3100, 3083, 3102, 3087, 3081, 3083, 3137, 3082, 3083, 3098, 3087, 3079, 3074, 3153, 571, 621, 618, 633, 578, 628, 633, 544, 2168, 2093, 2090, 2097, 2101, 2107, 2096, 2147, 1602, 1603, 1617, 1594, 1583, 1150, 1064, 1084, 1073, 1066, 1031, 1086, 1073, 1084, 1125, 3062, 2998, 3007, 2978, 2995, 2997, 3053, 3040, 3062, 2959, 2976, 2993, 2999, 2997, 3053, 3041, 3062, 2959, 2979, 3001, 2986, 2997, 3053, 3042, 3040, 3040, 3062, 2959, 2979, 3007, 2978, 2980, 3053, 2998, 3001, 3004, 2997, 2959, 2980, 2985, 2976, 2997, 3050, 2993, 2979, 2995, 3068, 2998, 3001, 3004, 2997, 2959, 3006, 2993, 3005, 2997, 3050, 2993, 2979, 2995, 671, 659, 664, 665, 2310, 2307, 2326, 2307, 1907, 1910, 1900, 1899, 1022, 1018, 1006, 1021, 996, 716, 708, 722, 722, 704, 710, 708, -32234, 21111, 25638, 20311, 21430, -30263, 22672, -29564, -28894, 24387, 24211, 16958, 3265, 3322, 3326, 3312, 3323, 21924, -32336, 2266, 2252, 3175, 3171, 3191, 3172, 3197, 2242, 2249, 2257, 2248, 2250, 2249, 2247, 2242, 2204, 1767, 1774, 1773, 1765, 1764, 1779, 568, 575, 548, 544, 558, 549, 2583, 2572, 2565, 2582, 2561, 2635, 2583, 2572, 2565, 2582, 2561, 2580, 2565, 2563, 2561, 2635, 2560, 2561, 2576, 2565, 2573, 2568, 2651, 2580, 2582, 2649, 2609, 2599, 2598, 2582, 2571, 2579, 2583, 2561, 2582, 2626, 2562, 2582, 2649, 2580, 2567, 2626, 2580, 2579, 2560, 2619, 2573, 2560, 2649, 2719, 2762, 2765, 2774, 2770, 2780, 2775, 2692, 2858, 2859, 2873, 2898, 2887, 385, 471, 451, 462, 469, 504, 449, 462, 451, 410, 577, 513, 520, 533, 516, 514, 602, 599, 577, 568, 535, 518, 512, 514, 602, 598, 577, 568, 532, 526, 541, 514, 602, 597, 599, 599, 577, 568, 532, 520, 533, 531, 602, 513, 526, 523, 514, 568, 531, 542, 535, 514, 605, 518, 532, 516, 587, 513, 526, 523, 514, 568, 521, 518, 522, 514, 605, 518, 532, 516, 2596, 2598, 2615, 2718, 2706, 2713, 2712, 983, 978, 967, 978, 1949, 1944, 1922, 1925, 1829, 1843, 1760, 1768, 1790, 1790, 1772, 1770, 1768, -31237, 21914, 25547, 18618, 21595, -29148, 24445, -29847, -31331, 22012, 21548, 18561, 1662, 1605, 1601, 1615, 1604, 24347, -29937, 1170, 1181, 1169, 1177, 2205, 2202, 2180, 3072, 3079, 3092, 391, 389, 400, 385, 387, 395, 406, 397, 385, 407, 382, 317, 305, 290, 315, 309, 292, 271, 307, 319, 318, 310, 313, 311, 392, 404, 409, 385, 413, 394, 443, 407, 406, 396, 413, 
    406, 396, 1409, 27937, 28041, 32325, 27974, 17975, 2184, 2181};
    public static final Pattern c = Pattern.compile("pan\\.quark\\.cn/s/([^\\\\|#/]+)");
    public static final Pattern d = Pattern.compile("drive\\.uc\\.cn/s/([^\\\\|#/]+)");

    /* JADX INFO: renamed from: com.github.catvod.spider.Market$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
    }

    class Category {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f70short = {2303, 3062, 3058, 3046, 3061, 3052, 566, 544};
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        public Category() {
        }

        public Category(int i) {
        }

        public final void a() {
            Matcher matcher = Market.c.matcher(this.b);
            boolean zFind = matcher.find();
            String strM21 = "0";
            if (zFind) {
                this.d = "quark";
                this.e = matcher.group(1);
                this.f = strM21;
            } else {
                Matcher matcher2 = Market.d.matcher(this.b);
                if (matcher2.find()) {
                    this.d = "uc";
                    this.e = matcher2.group(1);
                    this.f = strM21;
                }
            }
        }
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("__preset__", "推荐内容", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("__custom__", "我的自定义", null));
        com.github.catvod.spider.merge.D.b.z("__setting__", "设置", null, arrayList);
        if (!z) {
            return com.github.catvod.spider.merge.p001b.g.z(arrayList, new ArrayList());
        }
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(e((Category) it.next()), i());
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(e((Category) it2.next()), i());
        }
        return com.github.catvod.spider.merge.p001b.g.A(arrayList, arrayList2, linkedHashMap);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws Throwable {
        int iF;
        String strM249 = "quark";
        String strM325 = "uc";
        if (str2.startsWith("download:")) {
            return com.github.catvod.spider.merge.p001b.g.m(q(str2.substring(9)) ? "已打开下载确认，请在弹窗中确认" : "下载任务无效，请返回列表重新选择");
        }
        String[] strArrSplit = str2.split(":", 7);
        if (strArrSplit.length < 7) {
            return com.github.catvod.spider.merge.p001b.g.d("无效的文件ID");
        }
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        String str5 = strArrSplit[2];
        String str6 = strArrSplit[3];
        String str7 = strArrSplit[4];
        d(strArrSplit[6]);
        try {
            String strH = h(str3, str4, str5, str6, str7);
            if (TextUtils.isEmpty(strH)) {
                return com.github.catvod.spider.merge.p001b.g.d("获取播放地址失败");
            }
            HashMap map = new HashMap();
            String strM177 = "Referer";
            if (str3.equals(strM325)) {
                map.put(strM177, "https://drive.uc.cn/");
            } else if (str3.equals(strM249)) {
                map.put(strM177, "https://pan.quark.cn/");
            }
            if (str3.equals(strM325)) {
                iF = C0299u0.F(strM325);
            } else {
                iF = !str3.equals(strM249) ? 16 : C0299u0.F(strM249);
            }
            String strX0 = C0299u0.x0(strH, map, iF, str3, null);
            if (TextUtils.isEmpty(strX0)) {
                return com.github.catvod.spider.merge.p001b.g.d("本地播放代理正在准备，请稍后重试");
            }
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(strX0);
            gVar.n();
            return gVar.r();
        } catch (Exception e) {
            return com.github.catvod.spider.merge.p001b.g.d("播放失败: " + e.getMessage());
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        if (str.startsWith("market_") || str.startsWith("download:")) {
            AbstractC0302v0.g0(str, new i(11, this));
            return "";
        }
        String[] strArrSplit = str.split(":", 7);
        if (strArrSplit.length < 7) {
            return com.github.catvod.spider.merge.p001b.g.d("无效的文件ID");
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        String str4 = strArrSplit[2];
        String str5 = strArrSplit[3];
        String str6 = strArrSplit[4];
        String str7 = strArrSplit[5];
        String strD = d(strArrSplit[6]);
        k kVar = new k();
        kVar.i("网盘文件");
        kVar.n(str);
        kVar.o(strD);
        kVar.p(g(strD));
        if (AbstractC0309x1.i(strD)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!str7.isEmpty()) {
                try {
                    for (k kVar2 : m(str2, str3, str7, str5)) {
                        arrayList.add(o(kVar2.c()));
                        arrayList2.add(kVar2.b());
                    }
                } catch (Exception unused) {
                }
            }
            String strJ = j(str2);
            boolean zIsEmpty = arrayList.isEmpty();
            String strM539 = "$";
            if (!zIsEmpty) {
                int i = 0;
                while (true) {
                    if (i >= arrayList2.size()) {
                        i = -1;
                        break;
                    }
                    if (((String) arrayList2.get(i)).equals(str)) {
                        break;
                    }
                    i++;
                }
                int size = arrayList.size();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i >= 0 ? (i + i2) % size : i2;
                    if (sb.length() > 0) {
                        sb.append("#");
                    }
                    sb.append(o((String) arrayList.get(i3)));
                    sb.append(strM539);
                    sb.append((String) arrayList2.get(i3));
                }
                kVar.q(strJ);
                kVar.r(sb.toString());
                StringBuilder sb2 = new StringBuilder("共");
                sb2.append(size);
                sb2.append("个视频");
                sb2.append(i >= 0 ? " · 当前为列表第" + (i + 1) + "个" : "");
                kVar.s(sb2.toString());
            }
            if (arrayList.isEmpty()) {
                kVar.q(j(str2));
                kVar.r(o(strD) + strM539 + str);
            }
        } else {
            kVar.q("下载");
            kVar.r(o(strD) + "$download:" + str);
        }
        boolean z = FishCrypto.a;
        N1.d(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        final int i = 1;
        final int i2 = 0;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1014893810:
                if (str.equals("market_delete")) {
                    b = 0;
                }
                break;
            case 285134545:
                if (str.equals("market_info")) {
                    b = 1;
                }
                break;
            case 1117568542:
                if (str.equals("market_add")) {
                    b = 2;
                }
                break;
        }
        switch (b) {
            case 0:
                InitOrigin.run(new Runnable(this) { // from class: com.github.catvod.spider.f

                    /* JADX INFO: renamed from: short, reason: not valid java name */
                    private static final short[] f125short = {1197, 2430, 2416, 2406, 2424, 3264, 21923, 24016, 3270, 1044, 1040, 1028, 1047, 1038, 24605, 25471, -30859, 23813, 18646, 21657, 31460, 872, 876, 888, 875, 882, 2840, 21115, 23048, 2846, 2334, 2320, 2310, 2328, 2820, 22831, -25237, 22793, 30580};
                    public final /* synthetic */ Market b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                Market market = this.b;
                                ArrayList arrayList = market.b;
                                if (arrayList.isEmpty()) {
                                    X0.a("暂无自定义分类");
                                } else {
                                    String[] strArr = new String[arrayList.size()];
                                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                        Market.Category category = (Market.Category) arrayList.get(i3);
                                        StringBuilder sbP = com.github.catvod.spider.merge.D.b.p("quark".equals(category.d) ? "[夸克]" : "[UC]", " ");
                                        sbP.append(category.a);
                                        strArr[i3] = sbP.toString();
                                    }
                                    InitOrigin.run(new W(strArr, "删除分类", new e(market), 6));
                                }
                                break;
                            default:
                                Market market2 = this.b;
                                final String[] strArr2 = new String[market2.a.size()];
                                int i4 = 0;
                                while (true) {
                                    int size = market2.a.size();
                                    String strM292 = " ";
                                    String strM358 = "[UC]";
                                    String strM199 = "[夸克]";
                                    String strM477 = "quark";
                                    if (i4 >= size) {
                                        ArrayList arrayList2 = market2.b;
                                        final String[] strArr3 = new String[arrayList2.size()];
                                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                            Market.Category category2 = (Market.Category) arrayList2.get(i5);
                                            StringBuilder sbP2 = com.github.catvod.spider.merge.D.b.p(strM477.equals(category2.d) ? strM199 : strM358, strM292);
                                            sbP2.append(category2.a);
                                            strArr3[i5] = sbP2.toString();
                                        }
                                        final int i6 = AbstractC0583w0.c;
                                        final int i7 = AbstractC0583w0.f;
                                        InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.z.D0
                                            public final /* synthetic */ String a = "配置信息";
                                            public final /* synthetic */ String b = "预设分类";
                                            public final /* synthetic */ String e = "暂无预设分类";
                                            public final /* synthetic */ String f = "自定义分类";
                                            public final /* synthetic */ String i = "暂无自定义分类，点击「添加分类」创建";
                                            public final /* synthetic */ String j = "提示：自定义分类仅支持夸克和UC网盘";

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                String str2 = this.a;
                                                String str3 = this.b;
                                                int i8 = i6;
                                                String[] strArr4 = strArr2;
                                                String str4 = this.e;
                                                String str5 = this.f;
                                                int i9 = i7;
                                                String[] strArr5 = strArr3;
                                                String str6 = this.i;
                                                try {
                                                    Activity activity = InitOrigin.getActivity();
                                                    if (activity == null || activity.isFinishing()) {
                                                        return;
                                                    }
                                                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                                    linearLayoutK.addView(AbstractC0583w0.p(activity, str2, "查看预设和自定义分类"), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
                                                    P1.n(linearLayoutK, str3, i8, strArr4, str4);
                                                    P1.n(linearLayoutK, str5, i9, strArr5, str6);
                                                    String str7 = this.j;
                                                    if (str7 != null && !str7.isEmpty()) {
                                                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                                        AbstractC0583w0.l(linearLayoutY, str7);
                                                        linearLayoutK.addView(linearLayoutY);
                                                    }
                                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("确定", (DialogInterface.OnClickListener) null).create());
                                                } catch (Exception unused) {
                                                }
                                            }
                                        });
                                    } else {
                                        Market.Category category3 = (Market.Category) market2.a.get(i4);
                                        if (strM477.equals(category3.d)) {
                                            strM358 = strM199;
                                        }
                                        StringBuilder sbP3 = com.github.catvod.spider.merge.D.b.p(strM358, strM292);
                                        sbP3.append(category3.a);
                                        strArr2[i4] = sbP3.toString();
                                        i4++;
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                InitOrigin.run(new Runnable(this) { // from class: com.github.catvod.spider.f

                    /* JADX INFO: renamed from: short, reason: not valid java name */
                    private static final short[] f125short = {1197, 2430, 2416, 2406, 2424, 3264, 21923, 24016, 3270, 1044, 1040, 1028, 1047, 1038, 24605, 25471, -30859, 23813, 18646, 21657, 31460, 872, 876, 888, 875, 882, 2840, 21115, 23048, 2846, 2334, 2320, 2310, 2328, 2820, 22831, -25237, 22793, 30580};
                    public final /* synthetic */ Market b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                Market market = this.b;
                                ArrayList arrayList = market.b;
                                if (arrayList.isEmpty()) {
                                    X0.a("暂无自定义分类");
                                } else {
                                    String[] strArr = new String[arrayList.size()];
                                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                        Market.Category category = (Market.Category) arrayList.get(i3);
                                        StringBuilder sbP = com.github.catvod.spider.merge.D.b.p("quark".equals(category.d) ? "[夸克]" : "[UC]", " ");
                                        sbP.append(category.a);
                                        strArr[i3] = sbP.toString();
                                    }
                                    InitOrigin.run(new W(strArr, "删除分类", new e(market), 6));
                                }
                                break;
                            default:
                                Market market2 = this.b;
                                final String[] strArr2 = new String[market2.a.size()];
                                int i4 = 0;
                                while (true) {
                                    int size = market2.a.size();
                                    String strM292 = " ";
                                    String strM358 = "[UC]";
                                    String strM199 = "[夸克]";
                                    String strM477 = "quark";
                                    if (i4 >= size) {
                                        ArrayList arrayList2 = market2.b;
                                        final String[] strArr3 = new String[arrayList2.size()];
                                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                            Market.Category category2 = (Market.Category) arrayList2.get(i5);
                                            StringBuilder sbP2 = com.github.catvod.spider.merge.D.b.p(strM477.equals(category2.d) ? strM199 : strM358, strM292);
                                            sbP2.append(category2.a);
                                            strArr3[i5] = sbP2.toString();
                                        }
                                        final int i6 = AbstractC0583w0.c;
                                        final int i7 = AbstractC0583w0.f;
                                        InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.z.D0
                                            public final /* synthetic */ String a = "配置信息";
                                            public final /* synthetic */ String b = "预设分类";
                                            public final /* synthetic */ String e = "暂无预设分类";
                                            public final /* synthetic */ String f = "自定义分类";
                                            public final /* synthetic */ String i = "暂无自定义分类，点击「添加分类」创建";
                                            public final /* synthetic */ String j = "提示：自定义分类仅支持夸克和UC网盘";

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                String str2 = this.a;
                                                String str3 = this.b;
                                                int i8 = i6;
                                                String[] strArr4 = strArr2;
                                                String str4 = this.e;
                                                String str5 = this.f;
                                                int i9 = i7;
                                                String[] strArr5 = strArr3;
                                                String str6 = this.i;
                                                try {
                                                    Activity activity = InitOrigin.getActivity();
                                                    if (activity == null || activity.isFinishing()) {
                                                        return;
                                                    }
                                                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                                    linearLayoutK.addView(AbstractC0583w0.p(activity, str2, "查看预设和自定义分类"), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
                                                    P1.n(linearLayoutK, str3, i8, strArr4, str4);
                                                    P1.n(linearLayoutK, str5, i9, strArr5, str6);
                                                    String str7 = this.j;
                                                    if (str7 != null && !str7.isEmpty()) {
                                                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                                        AbstractC0583w0.l(linearLayoutY, str7);
                                                        linearLayoutK.addView(linearLayoutY);
                                                    }
                                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("确定", (DialogInterface.OnClickListener) null).create());
                                                } catch (Exception unused) {
                                                }
                                            }
                                        });
                                    } else {
                                        Market.Category category3 = (Market.Category) market2.a.get(i4);
                                        if (strM477.equals(category3.d)) {
                                            strM358 = strM199;
                                        }
                                        StringBuilder sbP3 = com.github.catvod.spider.merge.D.b.p(strM358, strM292);
                                        sbP3.append(category3.a);
                                        strArr2[i4] = sbP3.toString();
                                        i4++;
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                InitOrigin.run(new RunnableC0341a(6, this));
                break;
            default:
                if (str.startsWith("download:")) {
                    InitOrigin.run(new RunnableC0242b(this, str.substring(9), 8));
                }
                break;
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:39:0x02bf  */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String strC;
        byte b;
        ArrayList arrayListL;
        if ("__preset__".equals(str)) {
            return k("暂无预设分类", "配置中没有有效的夸克/UC分享", this.a);
        }
        if ("__custom__".equals(str)) {
            return k("暂无自定义分类", "请在设置中添加有效的夸克/UC分享", this.b);
        }
        if ("__setting__".equals(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(b("add", "添加分类", "夸克/UC", AbstractC0302v0.F1(), "market_add"));
                jSONArray.put(b("del", "删除分类", "自定义", AbstractC0302v0.o(), "market_delete"));
                jSONArray.put(b("info", "查看配置", "当前", AbstractC0302v0.z1(), "market_info"));
                jSONObject.put("list", jSONArray);
                jSONObject.put("page", 1);
                jSONObject.put("pagecount", 1);
                jSONObject.put("limit", 20);
                jSONObject.put("total", 3);
                return jSONObject.toString();
            } catch (Exception unused) {
                return com.github.catvod.spider.merge.D.b.d();
            }
        }
        String strM390 = ":";
        if (!str.contains(strM390)) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        String[] strArrSplit = str.split(strM390, 4);
        int length = strArrSplit.length;
        String strM193 = "加载失败";
        if (length < 3) {
            return c(strM193, "无效的分享目录ID", AbstractC0302v0.b0());
        }
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        String str5 = strArrSplit[2];
        String str6 = strArrSplit.length > 3 ? strArrSplit[3] : "";
        String strM529 = "不支持的网盘类型：";
        new ArrayList();
        try {
            int iHashCode = str3.hashCode();
            if (iHashCode != 3726) {
                if (iHashCode == 107940278 && str3.equals("quark")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str3.equals("uc")) {
                b = 1;
            } else {
                b = -1;
            }
            if (b == 0) {
                arrayListL = l(str4, str5, str6, map);
            } else {
                if (b != 1) {
                    return c(strM193, strM529.concat(str3), AbstractC0302v0.b0());
                }
                arrayListL = n(str4, str5, str6, map);
            }
            if (arrayListL.isEmpty()) {
                return c("暂无内容", TextUtils.isEmpty(f("kind", map)) ^ true ? "当前类型没有匹配内容，请切换类型筛选或返回上级" : "这个分享目录暂无文件，可返回上级或检查分享内容", "data:image/png;base64,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");
            }
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.F(arrayListL);
            gVar.o(1, 1, 0, 1);
            return gVar.r();
        } catch (Exception e) {
            SpiderDebug.log("获取分享文件列表失败: " + e.getMessage());
            String message = e.getMessage();
            String strTrim = message != null ? message.trim() : "";
            String lowerCase = strTrim.toLowerCase();
            String strJ = j(str3);
            if (TextUtils.isEmpty(strTrim)) {
                strC = strJ.concat("加载失败，请稍后重试");
            } else if (strTrim.contains("未登录") || strTrim.contains("授权") || lowerCase.contains("cookie") || lowerCase.contains("login")) {
                strC = com.github.catvod.spider.merge.D.b.C(strJ, "需要登录或配置账号：", strTrim);
            } else if (strTrim.contains("提取码") || strTrim.contains("密码") || strTrim.contains("passcode")) {
                strC = com.github.catvod.spider.merge.D.b.C(strJ, "提取码不正确或已失效：", strTrim);
            } else if (strTrim.contains("分享") || strTrim.contains("Token") || lowerCase.contains("token") || lowerCase.contains("not found") || lowerCase.contains("invalid")) {
                strC = com.github.catvod.spider.merge.D.b.C(strJ, "可能已失效或无权访问：", strTrim);
            } else {
                strC = (lowerCase.contains("timeout") || lowerCase.contains("timed out") || lowerCase.contains("failed to connect") || lowerCase.contains("unable to resolve") || strTrim.contains("网络")) ? "网络连接失败：".concat(strTrim) : "加载失败：".concat(strTrim);
            }
            return c(strM193, strC, AbstractC0302v0.b0());
        }
    }

    public static JSONObject b(String str, String str2, String str3, String str4, String str5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vod_id", str);
            jSONObject.put("vod_name", str2);
            jSONObject.put("vod_pic", str4);
            jSONObject.put("vod_remarks", str3);
            if (!str5.isEmpty()) {
                jSONObject.put("action", str5);
            }
            return jSONObject;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static String c(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        k kVar = new k();
        kVar.n("market_noop");
        kVar.o(str);
        kVar.p(str3);
        kVar.s(str2);
        kVar.h(new com.github.catvod.spider.merge.p001b.i());
        arrayList.add(kVar);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.F(arrayList);
        gVar.o(1, 1, 0, 1);
        return gVar.r();
    }

    public static String d(String str) {
        try {
            return URLDecoder.decode(str == null ? "" : str, "UTF-8");
        } catch (Exception unused) {
            return str == null ? "" : str;
        }
    }

    public static String e(Category category) {
        String strM567 = category.f;
        if (strM567 == null) {
            strM567 = "0";
        }
        String str = category.c;
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(category.d);
        String strM1 = ":";
        sb.append(strM1);
        com.github.catvod.spider.merge.D.b.A(sb, category.e, strM1, strM567, strM1);
        sb.append(str);
        return sb.toString();
    }

    public static String f(String str, HashMap map) {
        return (map == null || !map.containsKey(str)) ? "" : (String) map.get(str);
    }

    public static String g(String str) {
        String lowerCase = AbstractC0309x1.g(str).toLowerCase();
        if (AbstractC0309x1.i(str)) {
            return "data:image/png;base64,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";
        }
        if (Arrays.asList("doc", "docx", "pdf", "txt", "md").contains(lowerCase)) {
            return "https://img.icons8.com/color/96/document.png";
        }
        if (Arrays.asList("xls", "xlsx", "csv").contains(lowerCase)) {
            return "https://img.icons8.com/color/96/ms-excel.png";
        }
        if (Arrays.asList("ppt", "pptx").contains(lowerCase)) {
            return "https://img.icons8.com/color/96/ms-powerpoint.png";
        }
        if (Arrays.asList("zip", "rar", "7z", "tar", "gz").contains(lowerCase)) {
            return "https://img.icons8.com/color/96/archive.png";
        }
        if (Arrays.asList("jpg", "jpeg", "png", "gif", "bmp", "webp").contains(lowerCase)) {
            return "https://img.icons8.com/color/96/image.png";
        }
        return Arrays.asList("apk").contains(lowerCase) ? "https://img.icons8.com/color/96/android-os.png" : "https://img.icons8.com/color/96/file.png";
    }

    public static String h(String str, String str2, String str3, String str4, String str5) {
        String strW;
        str.getClass();
        if (str.equals("uc")) {
            return Z0.t().G(str2, str3, str4, str5);
        }
        if (!str.equals("quark")) {
            throw new Exception("不支持的网盘类型");
        }
        A0 a0S = A0.s();
        long jIncrementAndGet = a0S.i.incrementAndGet();
        synchronized (a0S) {
            if (!a0S.P()) {
                throw new Exception("未登录夸克账号，无法下载");
            }
            com.github.catvod.spider.merge.p009k.c cVar = new com.github.catvod.spider.merge.p009k.c(str2, "0");
            cVar.c = str4;
            a0S.L(cVar);
            if (!a0S.b.containsKey(str2)) {
                throw new Exception("获取分享Token失败");
            }
            String str6 = (String) ((Map) a0S.b.get(str2)).get("stoken");
            C0265i1.D(C0265i1.g, "QK");
            a0S.d(jIncrementAndGet, a0S.v());
            strW = a0S.w(str2, str6, str3, str5, "0");
        }
        return strW;
    }

    public static ArrayList i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.d("kind", "类型", Arrays.asList(new com.github.catvod.spider.merge.p001b.c("全部", ""), new com.github.catvod.spider.merge.p001b.c("视频", "video"), new com.github.catvod.spider.merge.p001b.c("文件夹", "folder"), new com.github.catvod.spider.merge.p001b.c("其他", "other"))));
        arrayList.add(new com.github.catvod.spider.merge.p001b.d("sort", "排序", Arrays.asList(new com.github.catvod.spider.merge.p001b.c("默认", ""), new com.github.catvod.spider.merge.p001b.c("名称正序", "name_asc"), new com.github.catvod.spider.merge.p001b.c("名称倒序", "name_desc"), new com.github.catvod.spider.merge.p001b.c("大小正序", "size_asc"), new com.github.catvod.spider.merge.p001b.c("大小倒序", "size_desc"))));
        return arrayList;
    }

    public static String j(String str) {
        str.getClass();
        if (str.equals("uc")) {
            return "UC分享";
        }
        return !str.equals("quark") ? "播放" : "夸克分享";
    }

    public static String k(String str, String str2, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList == null || arrayList.isEmpty()) {
            k kVar = new k();
            kVar.n("market_noop");
            kVar.o(str);
            kVar.p("data:image/png;base64,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");
            kVar.s(str2);
            kVar.h(new com.github.catvod.spider.merge.p001b.i());
            arrayList2.add(kVar);
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.F(arrayList2);
            gVar.o(1, 1, 0, 1);
            return gVar.r();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Category category = (Category) it.next();
            k kVar2 = new k();
            String strM108 = category.f;
            if (strM108 == null) {
                strM108 = "0";
            }
            String str3 = category.c;
            if (str3 == null) {
                str3 = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(category.d);
            String strM285 = ":";
            sb.append(strM285);
            com.github.catvod.spider.merge.D.b.A(sb, category.e, strM285, strM108, strM285);
            sb.append(str3);
            kVar2.n(sb.toString());
            kVar2.o(category.a);
            kVar2.p("data:image/png;base64,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");
            kVar2.t("folder");
            kVar2.s(j(category.d));
            arrayList2.add(kVar2);
        }
        com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
        gVar2.F(arrayList2);
        gVar2.o(1, 1, 0, 1);
        return gVar2.r();
    }

    public static String o(String str) {
        return str == null ? "" : str.replace('$', ' ').replace('#', ' ').trim();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList a(String str, String str2, String str3, String str4, JSONArray jSONArray, HashMap map) throws JSONException {
        String strM322;
        String strM325;
        String strM529;
        String strEncode;
        Iterator it;
        boolean z = false;
        Object[] objArr = 0;
        ArrayList arrayList = new ArrayList();
        String strF = f("kind", map);
        String strF2 = f("sort", map);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        while (true) {
            int length = jSONArray.length();
            strM322 = "folder";
            strM325 = "file_name";
            strM529 = "dir";
            if (i >= length) {
                break;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            boolean zOptBoolean = jSONObject.optBoolean(strM529, false);
            String strOptString = jSONObject.optString(strM325);
            if ((!strM322.equals(strF) || zOptBoolean) && ((!"video".equals(strF) || (!zOptBoolean && AbstractC0309x1.i(strOptString))) && (!"other".equals(strF) || (!zOptBoolean && !AbstractC0309x1.i(strOptString))))) {
                if (zOptBoolean) {
                    arrayList2.add(jSONObject);
                } else {
                    arrayList3.add(jSONObject);
                }
            }
            i++;
        }
        Comparator comparator = null;
        if (!TextUtils.isEmpty(strF2)) {
            if ("name_asc".equals(strF2)) {
                final Object[] objArr2 = objArr == true ? 1 : 0;
                comparator = new Comparator(this) { // from class: com.github.catvod.spider.merge.u.I
                    public final /* synthetic */ Market b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Market market = this.b;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        JSONObject jSONObject3 = (JSONObject) obj2;
                        switch (objArr2) {
                            case 0:
                                Pattern pattern = Market.c;
                                market.getClass();
                                return jSONObject2.optString("file_name", "").compareToIgnoreCase(jSONObject3.optString("file_name", ""));
                            case 1:
                                Pattern pattern2 = Market.c;
                                market.getClass();
                                return jSONObject3.optString("file_name", "").compareToIgnoreCase(jSONObject2.optString("file_name", ""));
                            case 2:
                                Pattern pattern3 = Market.c;
                                market.getClass();
                                int iCompare = Long.compare(jSONObject2.optLong("size", 0L), jSONObject3.optLong("size", 0L));
                                return iCompare != 0 ? iCompare : jSONObject2.optString("file_name", "").compareToIgnoreCase(jSONObject3.optString("file_name", ""));
                            default:
                                Pattern pattern4 = Market.c;
                                market.getClass();
                                int iCompare2 = Long.compare(jSONObject3.optLong("size", 0L), jSONObject2.optLong("size", 0L));
                                return iCompare2 != 0 ? iCompare2 : jSONObject3.optString("file_name", "").compareToIgnoreCase(jSONObject2.optString("file_name", ""));
                        }
                    }
                };
            } else if ("name_desc".equals(strF2)) {
                final int i2 = 1;
                comparator = new Comparator(this) { // from class: com.github.catvod.spider.merge.u.I
                    public final /* synthetic */ Market b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Market market = this.b;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        JSONObject jSONObject3 = (JSONObject) obj2;
                        switch (i2) {
                            case 0:
                                Pattern pattern = Market.c;
                                market.getClass();
                                return jSONObject2.optString("file_name", "").compareToIgnoreCase(jSONObject3.optString("file_name", ""));
                            case 1:
                                Pattern pattern2 = Market.c;
                                market.getClass();
                                return jSONObject3.optString("file_name", "").compareToIgnoreCase(jSONObject2.optString("file_name", ""));
                            case 2:
                                Pattern pattern3 = Market.c;
                                market.getClass();
                                int iCompare = Long.compare(jSONObject2.optLong("size", 0L), jSONObject3.optLong("size", 0L));
                                return iCompare != 0 ? iCompare : jSONObject2.optString("file_name", "").compareToIgnoreCase(jSONObject3.optString("file_name", ""));
                            default:
                                Pattern pattern4 = Market.c;
                                market.getClass();
                                int iCompare2 = Long.compare(jSONObject3.optLong("size", 0L), jSONObject2.optLong("size", 0L));
                                return iCompare2 != 0 ? iCompare2 : jSONObject3.optString("file_name", "").compareToIgnoreCase(jSONObject2.optString("file_name", ""));
                        }
                    }
                };
            } else if ("size_asc".equals(strF2)) {
                final int i3 = 2;
                comparator = new Comparator(this) { // from class: com.github.catvod.spider.merge.u.I
                    public final /* synthetic */ Market b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Market market = this.b;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        JSONObject jSONObject3 = (JSONObject) obj2;
                        switch (i3) {
                            case 0:
                                Pattern pattern = Market.c;
                                market.getClass();
                                return jSONObject2.optString("file_name", "").compareToIgnoreCase(jSONObject3.optString("file_name", ""));
                            case 1:
                                Pattern pattern2 = Market.c;
                                market.getClass();
                                return jSONObject3.optString("file_name", "").compareToIgnoreCase(jSONObject2.optString("file_name", ""));
                            case 2:
                                Pattern pattern3 = Market.c;
                                market.getClass();
                                int iCompare = Long.compare(jSONObject2.optLong("size", 0L), jSONObject3.optLong("size", 0L));
                                return iCompare != 0 ? iCompare : jSONObject2.optString("file_name", "").compareToIgnoreCase(jSONObject3.optString("file_name", ""));
                            default:
                                Pattern pattern4 = Market.c;
                                market.getClass();
                                int iCompare2 = Long.compare(jSONObject3.optLong("size", 0L), jSONObject2.optLong("size", 0L));
                                return iCompare2 != 0 ? iCompare2 : jSONObject3.optString("file_name", "").compareToIgnoreCase(jSONObject2.optString("file_name", ""));
                        }
                    }
                };
            } else if ("size_desc".equals(strF2)) {
                final int i4 = 3;
                comparator = new Comparator(this) { // from class: com.github.catvod.spider.merge.u.I
                    public final /* synthetic */ Market b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Market market = this.b;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        JSONObject jSONObject3 = (JSONObject) obj2;
                        switch (i4) {
                            case 0:
                                Pattern pattern = Market.c;
                                market.getClass();
                                return jSONObject2.optString("file_name", "").compareToIgnoreCase(jSONObject3.optString("file_name", ""));
                            case 1:
                                Pattern pattern2 = Market.c;
                                market.getClass();
                                return jSONObject3.optString("file_name", "").compareToIgnoreCase(jSONObject2.optString("file_name", ""));
                            case 2:
                                Pattern pattern3 = Market.c;
                                market.getClass();
                                int iCompare = Long.compare(jSONObject2.optLong("size", 0L), jSONObject3.optLong("size", 0L));
                                return iCompare != 0 ? iCompare : jSONObject2.optString("file_name", "").compareToIgnoreCase(jSONObject3.optString("file_name", ""));
                            default:
                                Pattern pattern4 = Market.c;
                                market.getClass();
                                int iCompare2 = Long.compare(jSONObject3.optLong("size", 0L), jSONObject2.optLong("size", 0L));
                                return iCompare2 != 0 ? iCompare2 : jSONObject3.optString("file_name", "").compareToIgnoreCase(jSONObject2.optString("file_name", ""));
                        }
                    }
                };
            }
        }
        if (comparator != null) {
            Collections.sort(arrayList2, comparator);
            Collections.sort(arrayList3, comparator);
        }
        arrayList2.addAll(arrayList3);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            JSONObject jSONObject2 = (JSONObject) it2.next();
            String strOptString2 = jSONObject2.optString("fid");
            String strOptString3 = jSONObject2.optString(strM325);
            String strM314 = "";
            String strOptString4 = jSONObject2.optString("share_fid_token", "");
            boolean zOptBoolean2 = jSONObject2.optBoolean(strM529, z);
            k kVar = new k();
            String strM408 = ":";
            if (zOptBoolean2) {
                kVar.n(str + strM408 + str2 + strM408 + strOptString2 + strM408 + str4);
                kVar.o(strOptString3);
                kVar.p("data:image/png;base64,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");
                kVar.t(strM322);
                kVar.s("文件夹");
                it = it2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(r17);
                sb.append(strM408);
                sb.append(r18);
                sb.append(strM408);
                sb.append(strOptString2);
                com.github.catvod.spider.merge.D.b.A(sb, strM408, r20, strM408, strOptString4);
                sb.append(strM408);
                sb.append(str3);
                sb.append(strM408);
                try {
                    strEncode = URLEncoder.encode(strOptString3 == null ? "" : strOptString3, "UTF-8");
                } catch (Exception unused) {
                    strEncode = strOptString3 == null ? "" : strOptString3;
                }
                sb.append(strEncode);
                String string = sb.toString();
                it = it2;
                long jOptLong = jSONObject2.optLong("size", 0L);
                if (jOptLong > 0) {
                    if (jOptLong < 1024) {
                        strM314 = jOptLong + "B";
                    } else if (jOptLong < 1048576) {
                        double d2 = jOptLong;
                        Double.isNaN(d2);
                        strM314 = String.format("%.1fKB", Double.valueOf(d2 / 1024.0d));
                    } else if (jOptLong < 1073741824) {
                        double d3 = jOptLong;
                        Double.isNaN(d3);
                        strM314 = String.format("%.1fMB", Double.valueOf(d3 / 1048576.0d));
                    } else {
                        double d4 = jOptLong;
                        Double.isNaN(d4);
                        strM314 = String.format("%.2fGB", Double.valueOf(d4 / 1.073741824E9d));
                    }
                }
                kVar.o(strOptString3);
                kVar.p(g(strOptString3));
                kVar.t("file");
                if (TextUtils.isEmpty(strM314)) {
                    strM314 = "文件";
                }
                kVar.s(strM314);
                if (AbstractC0309x1.i(strOptString3)) {
                    kVar.n(string);
                } else {
                    String strM432 = "download:";
                    kVar.n(strM432 + string);
                    kVar.g(strM432 + string);
                }
            }
            arrayList.add(kVar);
            it2 = it;
            z = false;
        }
        return arrayList;
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

    public void init(Context context, String str) throws Throwable {
        String strX = str;
        Init.init(context);
        this.a = new ArrayList();
        boolean zIsEmpty = TextUtils.isEmpty(strX);
        String strM511 = "pwd";
        String strM249 = "url";
        String strM360 = "name";
        String strM1 = "categories";
        if (!zIsEmpty) {
            if (strX.startsWith("http")) {
                strX = X1.X(strX, null, null);
            }
            JSONArray jSONArrayOptJSONArray = new JSONObject(FishCrypto.g(strX)).optJSONArray(strM1);
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    Category category = new Category();
                    category.a = jSONObject.optString(strM360, "未命名");
                    category.b = jSONObject.optString(strM249, "");
                    category.c = jSONObject.optString(strM511, "");
                    category.a();
                    if (category.d != null) {
                        this.a.add(category);
                    }
                }
            }
        }
        ArrayList arrayList = this.b;
        arrayList.clear();
        try {
            String strM368 = ".market_config";
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(strM368);
            if (!strH.isEmpty()) {
                JsonObject jsonObjectC = I0.c(strH);
                if (jsonObjectC.has(strM1)) {
                    JsonArray asJsonArray = jsonObjectC.getAsJsonArray(strM1);
                    for (int i2 = 0; i2 < asJsonArray.size(); i2++) {
                        JsonObject asJsonObject = asJsonArray.get(i2).getAsJsonObject();
                        Category category2 = new Category(0);
                        category2.a = asJsonObject.has(strM360) ? asJsonObject.get(strM360).getAsString() : "";
                        category2.b = asJsonObject.has(strM249) ? asJsonObject.get(strM249).getAsString() : "";
                        category2.c = asJsonObject.has(strM511) ? asJsonObject.get(strM511).getAsString() : "";
                        category2.a();
                        String str2 = category2.d;
                        if (str2 != null && ("quark".equals(str2) || "uc".equals(category2.d))) {
                            arrayList.add(category2);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        InitOrigin.checkPermission();
    }

    public final ArrayList l(String str, String str2, String str3, HashMap map) throws Exception {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        A0 a0S = A0.s();
        a0S.getClass();
        com.github.catvod.spider.merge.p009k.c cVar = new com.github.catvod.spider.merge.p009k.c(str, str2);
        cVar.c = str3;
        a0S.L(cVar);
        ConcurrentHashMap concurrentHashMap = a0S.b;
        if (!concurrentHashMap.containsKey(str)) {
            throw new Exception("获取分享Token失败");
        }
        String str4 = (String) ((Map) concurrentHashMap.get(str)).get("stoken");
        StringBuilder sb = new StringBuilder("share/sharepage/detail?");
        com.github.catvod.spider.merge.D.b.A(sb, a0S.c, "&pwd_id=", str, "&stoken=");
        sb.append(URLEncoder.encode(str4, "UTF-8"));
        sb.append("&pdir_fid=");
        sb.append(str2);
        sb.append("&force=0&_page=1&_size=200&_sort=file_type:asc,file_name:asc");
        String string = sb.toString();
        Collections.emptyMap();
        JSONObject jSONObject = new JSONObject(X1.z(com.github.catvod.spider.merge.D.b.m(new StringBuilder(), a0S.a, string), Collections.emptyMap(), a0S.H()).a());
        if (jSONObject.optInt("code") != 0) {
            throw new Exception(jSONObject.optString("message", "获取文件列表失败"));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        return (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list")) == null) ? arrayList : a("quark", str, str2, str3, jSONArrayOptJSONArray, map);
    }

    public final ArrayList m(String str, String str2, String str3, String str4) throws Exception {
        ArrayList<k> arrayListN;
        str.getClass();
        if (str.equals("uc")) {
            arrayListN = n(str2, str3, str4, null);
        } else {
            if (!str.equals("quark")) {
                return new ArrayList();
            }
            arrayListN = l(str2, str3, str4, null);
        }
        ArrayList arrayList = new ArrayList();
        for (k kVar : arrayListN) {
            String strB = kVar.b();
            if (strB != null && !strB.startsWith("download:") && !"folder".equals(kVar.f()) && kVar.c() != null && AbstractC0309x1.i(kVar.c())) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    public final ArrayList n(String str, String str2, String str3, HashMap map) throws Exception {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        Z0 z0T = Z0.t();
        z0T.getClass();
        com.github.catvod.spider.merge.p009k.c cVar = new com.github.catvod.spider.merge.p009k.c(str, str2);
        cVar.c = str3;
        z0T.I(cVar, false);
        ConcurrentHashMap concurrentHashMap = z0T.j;
        if (!concurrentHashMap.containsKey(str)) {
            throw new Exception("获取分享Token失败");
        }
        String str4 = (String) ((Map) concurrentHashMap.get(str)).get("stoken");
        StringBuilder sbQ = com.github.catvod.spider.merge.D.b.q("share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=", str, "&stoken=");
        sbQ.append(URLEncoder.encode(str4, "UTF-8"));
        sbQ.append("&pdir_fid=");
        sbQ.append(str2);
        sbQ.append("&force=0&_page=1&_size=200&_sort=file_type:asc,file_name:asc");
        JSONObject jSONObject = new JSONObject(Z0.j0(sbQ.toString(), "GET", Collections.emptyMap()));
        if (jSONObject.optInt("code") != 0) {
            throw new Exception(jSONObject.optString("message", "获取文件列表失败"));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        return (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list")) == null) ? arrayList : a("uc", str, str2, str3, jSONArrayOptJSONArray, map);
    }

    public final void p() {
        try {
            JsonObject jsonObject = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            for (Category category : this.b) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("name", category.a);
                jsonObject2.addProperty("url", category.b);
                String strM529 = "pwd";
                String str = category.c;
                if (str == null) {
                    str = "";
                }
                jsonObject2.addProperty(strM529, str);
                jsonArray.add(jsonObject2);
            }
            jsonObject.add("categories", jsonArray);
            String strM105 = ".market_config";
            String string = jsonObject.toString();
            boolean z = FishCrypto.a;
            C0297t1.j(strM105, string);
        } catch (Exception unused) {
        }
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

    public final boolean q(String str) {
        String[] strArrSplit = str.split(":", 7);
        if (strArrSplit.length < 7) {
            X0.a("无效的文件ID");
            return false;
        }
        String strD = d(strArrSplit[6]);
        String str2 = strArrSplit[0];
        InitOrigin.run(new V(new RunnableC0240a0(this, strD, strArrSplit, str2, 3), strD, j(str2)));
        return true;
    }
}

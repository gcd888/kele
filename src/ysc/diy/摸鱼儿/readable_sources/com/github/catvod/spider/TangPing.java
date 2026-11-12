package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
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
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
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
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
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
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class TangPing extends Spider {
    public String a = "";

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f92short = {1194, 836, 1422, 1415, 1428, 1415, 1422, 27971, 22410, 1436, 1432, 1518, 1436, 1434, 1503, 1409, 1479, 1418, 1486, 1503, 1474, 1414, 1486, 1492, 1502, 1476, 1486, 1478, 1473, 1435, 1434, 1513, 1421, 1425, 1519, 1436, 1432, 1435, 1421, 1430, 2205, 2188, 2193, 2205, 2457, 2440, 2446, 2444, 2559, 2537, 2541, 2558, 2543, 2532, 2163, 2166, 2156, 2155, 31390, 22965, -27219, -27806, 1517, 1504, 1006, 1017, 1007, 1011, 1008, 1002, 1017, 1213, 1190, 1186, 1196, 1191, 1307, 1308, 1282, 25927, 25812, 22234, 22186, -30711, 26234, 22747, -29489, 2206, 2203, 2196, 2199, 2191, 2028, 2017, 2021, 2016, 2017, 2038, 2039, 881, 885, 771, 881, 818, 876, 810, 871, 887, 772, 864, 892, 770, 881, 885, 886, 864, 891, 30766, 23301, 22629, 30035, 1885, 1872, 1027, 1038, 2700, 2701, 2716, 2697, 2689, 2692, 2167, 2158, 2149, -30903, 27754, 17045, 30421, 1595, 1588, 1592, 1584, 1853, 1828, 1838, 912, 903, 911, 899, 912, 905, 913, 642, 655, 646, 659, 696, 663, 667, 659, 1012, 1000, 1004, 1023, 1223, 1236, 1219, 1223, 2411, 2409, 2430, 2405, 2424, 2646, 2651, 2624, 2647, 2641, 2630, 2653, 2624, 576, 588, 589, 599, 582, 589, 599, 542, 523, 534, 524, 521, 522, 30433, -31311, 2856, 2877, 2852, 2878, 2850, 2857, 2856, 2878, 2361, 1968, 1963, 1967, 1953, 1962, 818, 752, 25391, 25276, -30098, 24909, 25133, 21099, 27945, 26241, 21095, 29856, 32567, -29593, 516, 516, 516, 2508, 715, 726, 731, 2876, 2861, 2859, 2857, 287, 258, 276, 277, 258, 414, 387, 391, 399, 3319, 3326, 3309, 3326, 3319, 493, 482, 495, 509, 509, 2257, 2242, 2261, 2257, 2340, 2345, 2342, 2351, 2674, 2670, 2666, 2681, 22890, -26390, 2620, 2622, 2603, 2618, 2616, 2608, 2605, 2598, 1873, 1876, 1870, 1865, 628, 613, 611, 609, 615, 619, 625, 618, 624, 555, 560, 555, 574, 563, 25549, 28596, 799, 774, 781, 822, 769, 768, 797, 794, 822, 781, 776, 784, 24070, 25586, 1231, 1238, 1245, 1254, 1233, 1232, 1229, 1226, 1254, 1230, 1244, 1244, 1234, 25424, 28100, 2780, 2757, 2766, 2805, 2754, 2755, 2782, 2777, 2805, 2759, 2757, 2756, 2782, 2754, 26043, 27676, 1315, 1338, 1329, 1290, 1341, 1340, 1313, 1318, 23567, -29002, 27886, 1112, 1089, 1098, 1137, 1117, 1101, 1089, 1116, 1099, 1193, 30646, 24050, 1192, 29472, -28717, 21618, 494, 30259, -30027, 2401, 23523, 26208, 1466, 29557, 22271, 2072, 2139, 32009, 22349, 24992, 1152, 1216, 29214, -28947, 21836, 28343, 461, 396, 31948, -32694, 27564, 2903, 2833, 20665, 27962, 27533, 1196, 1259, 30151, 20557, 27574, 3049, 3054, 3056, 2679, 2682, 2686, 2683, 2682, 2669, 2668, 1786, 1783, 1788, 1761, 3177, 3169, 3184, 3180, 3179, 3168, 899, 924, 896, 903, 2431, 2429, 2412, 1903, 1907, 1907, 1911, 1799, 2235, 2190, 2177, 2184, 2239, 2182, 2177, 2184, 2255, -31976, 25773, 24543, 24495, 18133, 29333, 990, 979, 2611, 2620, 2608, 2616, 845, 852, 862, 3191, 3168, 3176, 3172, 3191, 3182, 3190, 28293, 28438, -31797, 28088, 21273, -30963, 1002, 992, 1005, 1003, 2805, 2793, 2788, 2812, 2768, 2807, 2793, 2479, 2466, 2470, 2467, 2466, 2485, 1868, 1883, 1883, 1862, 1883, 2458, 2462, 2536, 2458, 2521, 2439, 2497, 2444, 2460, 2543, 2443, 2455, 2537, 2458, 2462, 2461, 2443, 2448, 1681, 1685, 1763, 1681, 1687, 1746, 1743, 1675, 1731, 1753, 1747, 1737, 1731, 1739, 1740, 1686, 1687, 1764, 1664, 1692, 1762, 1681, 1685, 1686, 1664, 1691, 3135, 3133, 3114, 3135, 3118, 3133, 3114, 2682, 2673, 2673, 2672, 2358, 2340, 2360, 2357, 2356, 2399, 2410, 2405, 2412, 2395, 2402, 2405, 2412, 2347, 23813, 29668, 24123, 24139, 18182, 23268, 31779, 269, 266, 276, 3288, 3284, 3285, 3272, 3278, 3286, 3294, 1045, 1054, 1054, 1055, 1032, 1060, 1043, 1044, 1032, 1039, 896, 949, 954, 947, 900, 957, 954, 947, 1012, 22490, 31035, 21732, 21652, 23269, 26268, 1569, 1574, 1572, 1580, 268, 265, 275, 276, 618, 631, 634, 2277, 2213, 1535, 1518, 1512, 1514, 955, 934, 944, 945, 934, 2480, 2477, 2473, 2465, 963, 961, 980, 965, 967, 975, 978, 985, 2783, 2781, 2760, 2777, 2779, 2771, 2766, 2757, 2815, 2771, 2770, 2760, 2777, 2770, 2760, 269, 268, 285, 264, 256, 261, 298, 262, 263, 285, 268, 263, 285, 2958, 2956, 2971, 2950, 2944, 2945, 1303, 1287, 1281, 1290, 1281, 1206, 1191, 1204, 1191, 1195, 1205, 2369, 2380, 2375, 2394, 1673, 1670, 1667, 1679, 1668, 1694, 1717, 1694, 1667, 1671, 1679, 2617, 2630, 2649, 2619, 2581, 2576, 2616, 2598, 2652, 2624, 2561, 2564, 2575, 2631, 2562, 2652, 2576, 2631, 2581, 2582, 2578, 2625, 2584, 2648, 2595, 2580, 2573, 2592, 2599, 2578, 2587, 2597, 2618, 2562, 2593, 2580, 2564, 2605, 2584, 2639, 2599, 2622, 2585, 2623, 2616, 2562, 2593, 2592, 2618, 2598, 2624, 2591, 2567, 2605, 2598, 2623, 2561, 2613, 2584, 2616, 2582, 2578, 2606, 2608, 2610, 2592, 2617, 2592, 2573, 2630, 2625, 2596, 2606, 2577, 2648, 2627, 2577, 2595, 2629, 2630, 2629, 2610, 2563, 2616, 2563, 2592, 2561, 2612, 2588, 2648, 2584, 2591, 2564, 2565, 2610, 2605, 2589, 2620, 2577, 2622, 2576, 2585, 2599, 2631, 2625, 2585, 2566, 2581, 2588, 2580, 2634, 1967, 2000, 1999, 1977, 1959, 1966, 1976, 1937, 1956, 1973, 1958, 1938, 1929, 1967, 1923, 1920, 1945, 1979, 1962, 1957, 1936, 1958, 1937, 1975, 1936, 2000, 1975, 1977, 1972, 2008, 1975, 1969, 1970, 2002, 1947, 1925, 2009, 1977, 1975, 1955, 2003, 1959, 1974, 2009, 1975, 1955, 1952, 1973, 1931, 1943, 1957, 1966, 1962, 1928, 1922, 1968, 1969, 1945, 1939, 1942, 1974, 1974, 1970, 1945, 1941, 1970, 2006, 1963, 2000, 1962, 1937, 1943, 1967, 2006, 1924, 1960, 1964, 1931, 1939, 1994, 2005, 1962, 1939, 1934, 1963, 2003, 2003, 1964, 1958, 1976, 1934, 1955, 1925, 2009, 1974, 2000, 1925, 1971, 1945, 1926, 1944, 1961, 1957, 2004, 1929, 1958, 2007, 1930, 2008, 1922, 2012, 1068, 1107, 1100, 1105, 1062, 1028, 1067, 1101, 1110, 1059, 1080, 1036, 1044, 1030, 1029, 1051, 1042, 1070, 1036, 1056, 1051, 1051, 1075, 1032, 1034, 1061, 1075, 1074, 1057, 1075, 1073, 1107, 1067, 1030, 1036, 1035, 1062, 1059, 1079, 1107, 1104, 1073, 1107, 1077, 1071, 1036, 1104, 1028, 1097, 1077, 1069, 1025, 1065, 1073, 1077, 1114, 1045, 1041, 1065, 1107, 1071, 1048, 1051, 1082, 1050, 1027, 1040, 1109, 1080, 1072, 1108, 1069, 1051, 1037, 1027, 1106, 1106, 1050, 1069, 
    1082, 1108, 1110, 1077, 1045, 1038, 1050, 1083, 1042, 1029, 1119, 1119, 2990, 3025, 3022, 2957, 2947, 2958, 2995, 3026, 2953, 2952, 2998, 2964, 2962, 2945, 2982, 2998, 2999, 3032, 3001, 2954, 2947, 3026, 2993, 2981, 2968, 2954, 2994, 2967, 2994, 2962, 3024, 2988, 2959, 2963, 2996, 2993, 2999, 3001, 2952, 2959, 3029, 2994, 2948, 3002, 2953, 2991, 2991, 2956, 3002, 2964, 3030, 2964, 2969, 3027, 2983, 2969, 2951, 2946, 3019, 2953, 2947, 2957, 2967, 2979, 2969, 3028, 2966, 2962, 2983, 2982, 2978, 2980, 2964, 2953, 2946, 2981, 2965, 2992, 3031, 2983, 2961, 3000, 2988, 2992, 3033, 2953, 2964, 2956, 2996, 2979, 2957, 2970, 2999, 2960, 2961, 2983, 3028, 2959, 2964, 2981, 2961, 2992, 3029, 2990, 2950, 2982, 2951, 2945, 2982, 2951, 2966, 2948, 2969, 2979, 2966, 2965, 2982, 2948, 2946, 2961, 2957, 2967, 3001, 2995, 2994, 3001, 2952, 2964, 3033, 2994, 3027, 3000, 2981, 2989, 2947, 2991, 2984, 2990, 3030, 2958, 2961, 3028, 2970, 2948, 3030, 3002, 2958, 2967, 3025, 3028, 2987, 2957, 2977, 3037, 3037, 675, 673, 695, 699, 680, 699, 685, 677, 679, 672, 681, 1566, 1562, 2857, 2860, 2873, 2860, 1334, 1283, 1292, 1285, 1330, 1291, 1292, 1285, 1346, 25199, 22467, 24594, 26124, 19288, 32536, 2699, 2716, 2716, 2689, 2716, 534, 547, 556, 549, 530, 555, 556, 549, 610, 25935, 20707, 23411, -28825, 2558, 2507, 2500, 2509, 2554, 2499, 2500, 2509, 2442, 23911, 22334, -32695, 21100, 20635, -31601, 627, 582, 585, 576, 631, 590, 585, 576, 519, 22250, 23731, 23009, 26528, 19485, 30813, 558, 539, 532, 541, 554, 531, 532, 541, 602, 22199, 23790, 19867, 24187, 26522, 26418, 2418, 2375, 2376, 2369, 2422, 2383, 2376, 2369, 2310, 28203, 23431, 27846, 24043, 22450, 2825, 2876, 2867, 2874, 2829, 2868, 2867, 2874, 2941, -32598, 26399, 23037, 20635, 21100, -31112, 1220, 1265, 1278, 1271, 1216, 1273, 1278, 1271, 1200, 25501, 22065, 21408, 21456, 25530, -27171, 31742, 472, 474, 461, 472, 457, 474, 461, 1270, 1252, 1272, 1269, 1268, 2442, 2445, 2451, 2370, 2382, 2383, 2386, 2388, 2380, 2372, 3280, 3287, 3275, 3276, 1192, 1181, 1170, 1179, 1196, 1173, 1170, 1179, 1244, 23529, 24320, 24013, -30247, 3053, 3032, 3031, 3038, 3049, 3024, 3031, 3038, 2969, 21676, 20549, 23689, 23801, 29827, 21128, 2932, 2931, 2929, 2937, 2911, 2931, 2930, 2920, 2937, 2930, 2920, 2818, 2821, 2823, 2831, 2876, 2819, 2830, 2831, 2821, 2857, 2821, 2820, 2846, 2831, 2820, 2846, 797, 866, 893, 3294, 3307, 3300, 3309, 3290, 3299, 3300, 3309, 3242, -25145, 29668, -31383, 22348, 21947, -32337, 2757, 2443, 2455, 2455, 2451, 921, 927, 3100, 3113, 3110, 3119, 3096, 3105, 3110, 3119, 3176, -25339, 29478, -31317, 22414, 21881, -32403, 2590, 2767, 2760, 2774, 1501, 1484, 1493, 1066, 1357, 1400, 1399, 1406, 1353, 1392, 1399, 1406, 1337, -27564, 31351, -28135, -29544, 1337, 1353, 1361, 1353, 1337, 25108, 22456, 21033, 21081, 1674, 1727, 1712, 1721, 1678, 1719, 1712, 1721, 1790, -26733, 31152, 18660, 31908, -1596, -28194, -28833, 1790, 1678, 1686, 1678, 1790, 25043, 21631, 20974, 20894, 1226, 1238, 1243, 1219, 1247, 1224, 1273, 1237, 1236, 1230, 1247, 1236, 1230, 3296, 3318, 3314, 3297, 3312, 3323, 3280, 3324, 3325, 3303, 3318, 3325, 3303, 2222, 2232, 2236, 2223, 2238, 2229, 2206, 2226, 2227, 2217, 2232, 2227, 2217};
    public static final String[][] b = {new String[]{"日榜", "vod_hits_day"}, new String[]{"周榜", "vod_hits_week"}, new String[]{"月榜", "vod_hits_month"}, new String[]{"总榜", "vod_hits"}, new String[]{"好评榜", "vod_score"}};
    public static final String[][] c = {new String[]{"1", "电影"}, new String[]{"2", "电视剧"}, new String[]{"3", "综艺"}, new String[]{"4", "动漫"}, new String[]{"5", "短剧"}, new String[]{"r1", "电影榜"}, new String[]{"r2", "电视剧榜"}, new String[]{"r3", "综艺榜"}, new String[]{"r4", "动漫榜"}, new String[]{"r5", "短剧榜"}};

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList = c();
        } catch (Exception unused) {
        }
        ArrayList arrayList2 = new ArrayList();
        String[][] strArr = c;
        for (int i = 0; i < 10; i++) {
            String[] strArr2 = strArr[i];
            arrayList2.add(new com.github.catvod.spider.merge.p001b.b(strArr2[0], strArr2[1], null));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 1; i2 <= 5; i2++) {
            String strE = com.github.catvod.spider.merge.D.b.e(i2, "r");
            ArrayList arrayList3 = new ArrayList();
            String[][] strArr3 = b;
            for (int i3 = 0; i3 < 5; i3++) {
                String[] strArr4 = strArr3[i3];
                arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strArr4[0], strArr4[1]));
            }
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(new com.github.catvod.spider.merge.p001b.d("level", "榜单", arrayList3));
            linkedHashMap.put(strE, arrayList4);
        }
        return com.github.catvod.spider.merge.p001b.g.A(arrayList2, arrayList, linkedHashMap);
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        return str != null && str.toLowerCase(Locale.ROOT).matches(".*\\.(m3u8|mp4|flv|ts)([?#].*)?$");
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        return com.github.catvod.spider.merge.p001b.g.y(c());
    }

    private /* synthetic */ boolean $host$53940b53855fde82() {
        return false;
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) throws JSONException {
        String str3 = str;
        JSONObject jSONObject = new JSONObject();
        String strTrim = "";
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("text", str3);
        int iMax = 1;
        if (str2 != null) {
            try {
                strTrim = str2.trim();
            } catch (Exception unused) {
            }
        }
        iMax = Math.max(1, Integer.parseInt(strTrim));
        jSONObject.put("page", iMax);
        return com.github.catvod.spider.merge.p001b.g.y(d(a("search", jSONObject).optJSONArray("list")));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strTrim = str2 == null ? "" : str2.trim();
        if (strTrim.isEmpty()) {
            return f(str, "缺少选集ID");
        }
        try {
            JSONObject jSONObjectA = a("resolve", new JSONObject().put("token", strTrim));
            String strOptString = jSONObjectA.optString("url");
            if (TextUtils.isEmpty(strOptString)) {
                return f(str, "播放地址解析失败");
            }
            String strOptString2 = jSONObjectA.optString("danmu");
            if (!TextUtils.isEmpty(strOptString2)) {
                strTrim = strOptString2;
            }
            return g(str, strTrim, strOptString, jSONObjectA.optJSONObject("headers"), strOptString != null && strOptString.toLowerCase(Locale.ROOT).matches(".*\\.m3u8([?#].*)?$"));
        } catch (Exception e) {
            return f(str, e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0205  */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strM463;
        JSONArray jSONArray;
        String strK;
        String strTrim = (list == null || list.isEmpty() || list.get(0) == null) ? "" : list.get(0).trim();
        if (strTrim.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d("缺少影片ID");
        }
        JSONObject jSONObject = new JSONObject();
        String strM31 = "id";
        JSONObject jSONObjectA = a("detail", jSONObject.put(strM31, strTrim));
        JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("vod");
        if (jSONObjectOptJSONObject == null) {
            return com.github.catvod.spider.merge.p001b.g.d("详情为空");
        }
        String strOptString = jSONObjectOptJSONObject.optString(strM31);
        if (!TextUtils.isEmpty(strOptString)) {
            strTrim = strOptString;
        }
        String strM193 = "name";
        k kVar = new k(strTrim, jSONObjectOptJSONObject.optString(strM193), jSONObjectOptJSONObject.optString("pic"), jSONObjectOptJSONObject.optString("remarks"));
        kVar.i(jSONObjectOptJSONObject.optString("typeName"));
        kVar.u(jSONObjectOptJSONObject.optString("year"));
        kVar.k(jSONObjectOptJSONObject.optString("area"));
        kVar.j(jSONObjectOptJSONObject.optString("actor"));
        kVar.m(jSONObjectOptJSONObject.optString("director"));
        kVar.l(jSONObjectOptJSONObject.optString("content"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectA.optJSONArray("groups");
        int i = 0;
        while (jSONArrayOptJSONArray != null && i < jSONArrayOptJSONArray.length()) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 == null) {
                jSONArray = jSONArrayOptJSONArray;
            } else {
                String strOptString2 = jSONObjectOptJSONObject2.optString(strM193);
                if (TextUtils.isEmpty(strOptString2)) {
                    strOptString2 = "线路";
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("episodes");
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                while (true) {
                    strM463 = "#";
                    if (jSONArrayOptJSONArray2 == null || i2 >= jSONArrayOptJSONArray2.length()) {
                        break;
                    }
                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                    if (jSONObjectOptJSONObject3 != null) {
                        String strOptString3 = jSONObjectOptJSONObject3.optString("token");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            StringBuilder sb = new StringBuilder();
                            String strOptString4 = jSONObjectOptJSONObject3.optString(strM193);
                            String strM355 = "$";
                            if (strOptString4 == null) {
                                strK = "";
                            } else {
                                String strM360 = " ";
                                strK = com.github.catvod.spider.merge.D.b.k(strOptString4, strM463, strM360, strM355, strM360);
                            }
                            if (TextUtils.isEmpty(strK)) {
                                strK = "播放";
                            }
                            sb.append(strK);
                            sb.append(strM355);
                            sb.append(strOptString3);
                            arrayList3.add(sb.toString());
                        }
                    }
                    i2++;
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                }
                jSONArray = jSONArrayOptJSONArray;
                if (!arrayList3.isEmpty()) {
                    arrayList.add(strOptString2);
                    arrayList2.add(TextUtils.join(strM463, arrayList3));
                }
            }
            i++;
            jSONArrayOptJSONArray = jSONArray;
        }
        if (!arrayList2.isEmpty()) {
            String strM10 = "$$$";
            kVar.q(TextUtils.join(strM10, arrayList));
            kVar.r(TextUtils.join(strM10, arrayList2));
            FishCrypto.c(kVar);
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        }
        kVar.q("");
        kVar.r("");
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.E(kVar);
        gVar.l("详情接口没有可用线路");
        return gVar.r();
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, IOException {
        String strTrim;
        String strM339 = str;
        int iMax = 1;
        if (str2 == null) {
            strTrim = "";
        } else {
            try {
                strTrim = str2.trim();
            } catch (Exception unused) {
            }
        }
        iMax = Math.max(1, Integer.parseInt(strTrim));
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(strM339)) {
            strM339 = "1";
        }
        jSONObject.put("tid", strM339);
        jSONObject.put("page", iMax);
        String strM105 = "order";
        jSONObject.put(strM105, i(strM105, "time", map));
        String strM193 = "level";
        String strI = i(strM193, "", map);
        if (!TextUtils.isEmpty(strI)) {
            jSONObject.put(strM193, strI);
        }
        String[] strArr = {"class", "area", "lang", "year"};
        for (int i = 0; i < 4; i++) {
            String str3 = strArr[i];
            String strI2 = i(str3, "", map);
            if (!TextUtils.isEmpty(strI2) && !"全部".equals(strI2)) {
                jSONObject.put(str3, strI2);
            }
        }
        JSONObject jSONObjectA = a("category", jSONObject);
        ArrayList arrayListD = d(jSONObjectA.optJSONArray("list"));
        int iMax2 = Math.max(iMax, jSONObjectA.optInt("pagecount", iMax));
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayListD);
        gVarC.o(iMax, iMax2, 30, jSONObjectA.optInt("total", -1));
        return gVarC.r();
    }

    public static byte[] b(JSONObject jSONObject) throws IOException {
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            throw new IOException("TangPing 请求地址为空");
        }
        Request.Builder builderU = com.github.catvod.spider.merge.D.b.u(strOptString);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                builderU.header(next, jSONObjectOptJSONObject.optString(next));
            }
        }
        byte[] bArrDecode = new byte[0];
        String strOptString2 = jSONObject.optString("body");
        if (!TextUtils.isEmpty(strOptString2)) {
            bArrDecode = Base64.decode(strOptString2, 0);
        }
        String strOptString3 = jSONObject.optString("method", "POST");
        if ("GET".equalsIgnoreCase(strOptString3)) {
            builderU.get();
        } else {
            builderU.method(strOptString3.toUpperCase(Locale.ROOT), RequestBody.create((MediaType) null, bArrDecode));
        }
        Response responseI = X1.I(builderU.build());
        try {
            if (responseI.isSuccessful()) {
                byte[] bArrBytes = responseI.body() == null ? new byte[0] : responseI.body().bytes();
                responseI.close();
                return bArrBytes;
            }
            throw new IOException("HTTP " + responseI.code());
        } catch (Throwable th) {
            if (responseI != null) {
                try {
                    responseI.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static ArrayList d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(new k(jSONObjectOptJSONObject.optString("id"), jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("pic"), jSONObjectOptJSONObject.optString("remarks")));
            }
        }
        return arrayList;
    }

    public static String f(String str, String str2) {
        String strSubstring = str2;
        String str3 = str;
        if (TextUtils.isEmpty(strSubstring)) {
            strSubstring = "播放解析失败";
        }
        if (strSubstring.length() > 240) {
            strSubstring = strSubstring.substring(0, 240);
        }
        try {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C("");
            gVar.q(1);
            gVar.l(strSubstring);
            JSONObject jSONObject = new JSONObject(gVar.r());
            String strM102 = "flag";
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put(strM102, str3);
            jSONObject.put("playUrl", "");
            jSONObject.put("header", "");
            jSONObject.put("error", strSubstring);
            return jSONObject.toString();
        } catch (Exception unused) {
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C("");
            gVar2.q(1);
            gVar2.l(strSubstring);
            return gVar2.r();
        }
    }

    public static String g(String str, String str2, String str3, JSONObject jSONObject, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                linkedHashMap.put(next, (objOpt == null || objOpt == JSONObject.NULL) ? "" : String.valueOf(objOpt));
            }
        }
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(str3);
        gVar.h(linkedHashMap);
        int i = 0;
        if ((str3 != null && str3.toLowerCase(Locale.ROOT).matches(".*\\.m3u8([?#].*)?$")) || (str3 != null && str3.toLowerCase(Locale.ROOT).matches(".*\\.(mp4|flv|ts)([?#].*)?$"))) {
            i = 1;
        }
        gVar.q(i ^ 1);
        if (z) {
            gVar.k();
        }
        String strI = AbstractC0280n1.i(str, str2, null, null);
        if (strI != null && !strI.isEmpty()) {
            gVar.b(strI);
        }
        return gVar.r();
    }

    public static String i(String str, String str2, Map map) {
        return (map == null || TextUtils.isEmpty((CharSequence) map.get(str))) ? str2 : (String) map.get(str);
    }

    public final JSONObject a(String str, JSONObject jSONObject) throws JSONException, IOException {
        boolean z = false;
        while (true) {
            JSONObject jSONObjectE = e("prepare", str, null, jSONObject);
            if (!"guide".equals(jSONObjectE.optString("need"))) {
                JSONObject jSONObjectE2 = e("consume", str, !TextUtils.isEmpty(jSONObjectE.optString("url")) ? Base64.encodeToString(b(jSONObjectE), 2) : "", jSONObject);
                if (!jSONObjectE2.optBoolean("needs_host")) {
                    return jSONObjectE2;
                }
                if (z) {
                    throw new IOException("TangPing 后端地址失效");
                }
                h();
            } else {
                if (z) {
                    throw new IOException("TangPing 后端地址不可用");
                }
                h();
            }
            z = true;
        }
    }

    public final ArrayList c() throws JSONException, IOException {
        JSONObject jSONObjectA = a("home", new JSONObject());
        String strM182 = "list";
        ArrayList arrayListD = d(jSONObjectA.optJSONArray(strM182));
        if (!arrayListD.isEmpty()) {
            return arrayListD;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tid", "r2");
        jSONObject.put("page", 1);
        jSONObject.put("order", "time");
        return d(a("category", jSONObject).optJSONArray(strM182));
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

    public final JSONObject e(String str, String str2, String str3, JSONObject jSONObject) throws JSONException, IOException {
        JSONObject jSONObject2 = jSONObject;
        String str4 = str3;
        if (TextUtils.isEmpty(this.a)) {
            throw new IOException("TangPing 服务地址未配置");
        }
        JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v("action", str, "scene", str2);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObjectV.put("params", jSONObject2);
        if (str4 == null) {
            str4 = "";
        }
        jSONObjectV.put("body", str4);
        jSONObjectV.put("client_time", System.currentTimeMillis() / 1000);
        String str5 = this.a;
        String string = jSONObjectV.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM386 = "N1.LbgOQ+7vsx0u+g0bae6o/TczWPelRMuVcsZo8PInHOuVWMQ7hpZQHvBoOaeYGEWNWz16SYf/4fT212EtOtWvCk/ohsrEZjKfIgnP06nqbkc=";
        String strM414 = "N1.XFOYpETGshNbaxZKDqGpVq1VXU9VPS3zd8XVB2FW8VBATjvDOKicQPxrwWWSxtS7J1KpvN7eIMjr+4KroJ22MGYoBd8W1dRxgyHD5hG6k9c=";
        byte[] bArrT = FishCrypto.t(strM386, strM414, "N1.3DfI/4AZnvdgypLnByyQjhGQPCQS1IdniDAU12S1WMn2f+WOcKSW8wsK1MzyXxar7ZR6Oyoa00xOX64WwlxYpg==", "N1.mcnS2ihVtraFVW8Yjc2QExjRwRr0LosTQWYho5RdZiOOlZt6ty3Gygb+icmwCy4vrGFBDtibEuP7GqXLP9itlTCmzWpqG4otEqP5NfFgaFgvdyCvuFdbqmwYSRYht9R3XEMcOHN6nq4zd6Znw14KmA==", bytes);
        if (bArrT == null) {
            throw new IOException("TangPing 请求加密失败");
        }
        JSONObject jSONObject3 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM387 = "moyufucking";
        String strP = X1.P(str5, jSONObject3.put(strM387, strEncodeToString).toString());
        if (TextUtils.isEmpty(strP)) {
            throw new IOException("TangPing 服务无响应");
        }
        JSONObject jSONObject4 = new JSONObject(strP);
        if (jSONObject4.length() != 1) {
            throw new IOException("TangPing 响应信封无效");
        }
        String strOptString = jSONObject4.optString(strM387);
        if (TextUtils.isEmpty(strOptString)) {
            throw new IOException("TangPing 响应密文为空");
        }
        byte[] bArrS = FishCrypto.s(strM386, strM414, Base64.decode(strOptString, 0));
        if (bArrS == null) {
            throw new IOException("TangPing 响应解密失败");
        }
        JSONObject jSONObject5 = new JSONObject(new String(bArrS, charset));
        if (!jSONObject5.optBoolean("ok")) {
            throw new IOException(jSONObject5.optString("error", "TangPing 服务失败"));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject5.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        throw new IOException("TangPing 服务数据为空");
    }

    public final void h() throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String strM365 = "prepare";
        String strM33 = "guide";
        JSONObject jSONObjectE = e(strM365, strM33, null, jSONObject);
        if (TextUtils.isEmpty(jSONObjectE.optString("url"))) {
            throw new IOException("TangPing 引导地址缺失");
        }
        JSONObject jSONObject2 = new JSONObject();
        if (TextUtils.isEmpty(e("consume", strM33, Base64.encodeToString(b(jSONObjectE), 2), jSONObject2).optString("host"))) {
            throw new IOException("TangPing 引导失败");
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

    public synchronized void init(Context context, String str) {
        try {
            super.init(context, str);
            String strTrim = str == null ? "" : str.trim();
            if (strTrim.isEmpty()) {
                throw new IOException("TangPing 配置为空：需要 PHP 服务地址");
            }
            if (strTrim.startsWith("N1.")) {
                String strV = FishCrypto.v(strTrim);
                if (TextUtils.isEmpty(strV)) {
                    throw new IOException("TangPing 配置解密失败");
                }
                strTrim = strV.trim();
            } else if (!strTrim.startsWith("{") && !strTrim.startsWith("http")) {
                String strG = FishCrypto.g(strTrim);
                if (TextUtils.isEmpty(strG) || "{}".equals(strG.trim())) {
                    throw new IOException("TangPing 配置解密失败");
                }
                strTrim = strG.trim();
            }
            if (strTrim.startsWith("{")) {
                JSONObject jSONObject = new JSONObject(strTrim);
                strTrim = jSONObject.optString("url", jSONObject.optString("api", "")).trim();
            }
            if (HttpUrl.parse(strTrim) == null) {
                throw new IOException("TangPing 配置需要 PHP 服务地址");
            }
            while (strTrim.endsWith("/")) {
                strTrim = strTrim.substring(0, strTrim.length() - 1);
            }
            this.a = strTrim;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isVideoFormat(String str) {
        if (FishCrypto.businessReady()) {
            return $host$42ceaa68a95df632(str);
        }
        return false;
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

package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0294s1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.C0359j;
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
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.C0451c;
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
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class BanDeng extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f16short = {2473, 2867, 2876, 2864, 2872, 1357, 1346, 1365, 833, 846, 835, 849, 849, 839, 849, 824, 821, 1684, 1691, 1694, 1670, 1687, 1664, 1665, 2097, 2086, 2091, 2098, 2082, 1866, 666, 2476, 2466, 2494, 535, 512, 598, 534, 529, 533, 611, 529, 535, 594, 524, 586, 519, 579, 594, 591, 523, 579, 594, 596, 585, 579, 601, 595, 585, 579, 594, 591, 603, 579, 587, 588, 579, 594, 592, 585, 534, 535, 612, 512, 540, 610, 529, 533, 534, 512, 539, 402, 405, 407, 415, 2655, 2633, 2637, 2654, 2639, 2628, 952, 939, 812, 829, 827, 825, 994, 1022, 1011, 1003, 1015, 992, 540, 529, 3167, 3160, 3142, 650, 667, 648, 649, 671, 28393, 28538, 28468, 26922, 25208, 21835, -24739, -32341, 1972, 1977, 1981, 1976, 1977, 1966, 1967, 2565, 2569, 2569, 2573, 2575, 2563, 21507, 26240, 21214, 21166, -25195, 19089, 28870, 1486, 1446, 1466, 1466, 1470, 1469, 2899, 2884, 2884, 2905, 2884, 1463, 1463, 1463, 1021, 1010, 1022, 1014, 628, 633, 22141, 31563, 24843, -32054, 18230, 29558, 1136, 1137, 1120, 1141, 1149, 1144, 1629, 1604, 1615, 1365, 1356, 1350, 2280, 2303, 2295, 2299, 2280, 2289, 1500, 1472, 1476, 1495, 2077, 2062, 2073, 2077, 273, 284, 277, 256, 1319, 1317, 1330, 1321, 1332, 2765, 2752, 2779, 2764, 2762, 2781, 2758, 2779, 1307, 1303, 1302, 1292, 1309, 1302, 1292, 1585, 1588, 1587, 1592, 1582, 1275, 1262, 1271, 1261, 1265, 1274, 1275, 1261, 513, 534, 602, 512, 519, 515, 626, 522, 525, 629, 602, 628, 519, 515, -27125, -28476, 28165, -29244, -27877, -29203, 1885, 2131, 27927, 28277, 22650, 32445, -25700, -25261, 27904, 23436, 1205, 1188, 1209, 1205, 1262, 1201, 1197, 1184, 1192, 1199, 1274, 1249, 1186, 1193, 1184, 1203, 1202, 1188, 1205, 1276, 1204, 1205, 1191, 1260, 1273, 24661, 29160, 26017, 17724, -25551, -32080, 27677, 23553, 17874, 32567, 1377, 1404, 1393, 2521, 2504, 2510, 2508, 2026, 2021, 2024, 2042, 2042, 871, 884, 867, 871, 1566, 1538, 1542, 1557, 2839, 2837, 2816, 2833, 2835, 2843, 2822, 2829, 25224, 21508, -1299, 30328, 30709, -32034, 25963, 20504, -31732, -2523, -32034, 29476, 23847, -26396, -32004, 27220, 23058, 27777, 27295, 20725, 32247, 20672, -31532, -29458, 27483, 24109, -30498, 24126, 25408, 26752, 28245, 20594, 25369, 21546, -25028, -32566, 25773, 28525, 27064, 22431, -32435, 23858, -28725, 23100, 24622, 27630, 2155, 2049, 2072, 2052, 2053, 2155, 24695, 22340, -25262, -31836, 1706, 1711, 1717, 1714, 2311, 2314, 1099, 1092, 1096, 1088, 3069, 3044, 3054, 503, 480, 488, 484, 503, 494, 2138, 2123, 2125, 2127, 258, 275, 277, 279, 273, 285, 263, 284, 262, 1570, 1575, 1571, 1575, 1594, 2796, 2807, 2796, 2809, 2804, 634, 619, 621, 623, 1978, 1963, 1965, 1967, 1961, 1957, 1983, 1956, 1982, 876, 873, 877, 873, 884, 2990, 2997, 2990, 3003, 2998, 293, 1821, 1792, 1804, 1880, 18877, -27083, 30742, 1880, 1832, 1840, 1832, 1880, 20552, 20536, 1134, 1138, 1138, 1142, 1084, 1065, 1065, 1165, 1169, 1169, 1173, 1174, 1247, 1226, 1226, 2186, 2194, 2186, 2298, 24554, 24474, 24806, 22485, -25149, -31947, 27744, 26528, 24402, 28592, 27705, 23306, -28388, -28694, 396, 411, 471, 397, 394, 398, 511, 504, 476, 404, 404, 393, 504, 476, 406, 404, 504, 476, 403, 450, 505, 394, 398, 20707, 20627, 28655, 22748, -27958, -29636, 1614, 1585, 1582, 1605, 1639, 1658, 1620, 1611, 1615, 1584, 1579, 1611, 1637, 1612, 1620, 1583, 1655, 1605, 1645, 1619, 1603, 1643, 1623, 1653, 1646, 1654, 1634, 1656, 1586, 1635, 1645, 1606, 1652, 1646, 1614, 1619, 1652, 1626, 1650, 1616, 1655, 1658, 1618, 1585, 1637, 1644, 1601, 1625, 1610, 1624, 1655, 1645, 1647, 1586, 1641, 1603, 1593, 1616, 1614, 1592, 1645, 1611, 1646, 1641, 1605, 1605, 1655, 1651, 1613, 1641, 1651, 1616, 1644, 1643, 1650, 1619, 1624, 1652, 1611, 1593, 1612, 1651, 1622, 1634, 1652, 1633, 1655, 1649, 1615, 1646, 1586, 1601, 1610, 1585, 1591, 1585, 1619, 1653, 1602, 1650, 1633, 1620, 1607, 1590, 1618, 1641, 1607, 1587, 1651, 1617, 1597, 2499, 2492, 2467, 2519, 2492, 2539, 2493, 2538, 2508, 2498, 2539, 2548, 2540, 2528, 2555, 2504, 2492, 2526, 2552, 2497, 2533, 2558, 2519, 2494, 2555, 2498, 2536, 2548, 2534, 2505, 2506, 2491, 2538, 2530, 2543, 2500, 2498, 2493, 2531, 2502, 2511, 2557, 2533, 2492, 2557, 2511, 2534, 2521, 2553, 2492, 2470, 2493, 2499, 2558, 2532, 2527, 2501, 2498, 2505, 2490, 2496, 2540, 2554, 2485, 2506, 2538, 2498, 2559, 2499, 2548, 2493, 2543, 2539, 2520, 2526, 2496, 2510, 2501, 2553, 2527, 2551, 2521, 2536, 2525, 2488, 2535, 2488, 2520, 2501, 2494, 2507, 2484, 2549, 2500, 2466, 2540, 2543, 2539, 2536, 2492, 2491, 2528, 2501, 2470, 2508, 2553, 2506, 2500, 2519, 2538, 2480, 3132, 3139, 3164, 3098, 3142, 3140, 3141, 3121, 3092, 3123, 3130, 3095, 3128, 3139, 3093, 3112, 3120, 3109, 3138, 3093, 3125, 3075, 3136, 3111, 3079, 3112, 3120, 3107, 3103, 3083, 3125, 3140, 3147, 3101, 3139, 3104, 3103, 3089, 3102, 3093, 3107, 3108, 3124, 3142, 3100, 3128, 3123, 3140, 3093, 3111, 3109, 3079, 3124, 3102, 3111, 3127, 3165, 3161, 3165, 3096, 3136, 3079, 3127, 3103, 3109, 3135, 3106, 3134, 3091, 3123, 3091, 3132, 3147, 3077, 3096, 3080, 3121, 3099, 3108, 3111, 3133, 3078, 3083, 3165, 3096, 3121, 3131, 3142, 3131, 3078, 3139, 3079, 3129, 3136, 3104, 3138, 3094, 3078, 3109, 3121, 3127, 3089, 3105, 3128, 3115, 3114, 3128, 3093, 3095, 3089, 3151, 917, 1002, 1013, 931, 953, 938, 910, 924, 917, 944, 950, 944, 899, 919, 926, 931, 922, 952, 919, 921, 941, 921, 930, 1006, 942, 931, 908, 919, 912, 950, 1002, 898, 942, 954, 957, 949, 1003, 927, 941, 920, 941, 898, 920, 1004, 917, 941, 954, 929, 1006, 937, 942, 910, 921, 958, 914, 919, 914, 1012, 1012, 1002, 1002, 907, 943, 949, 941, 927, 957, 908, 944, 911, 942, 910, 953, 899, 1000, 920, 954, 948, 905, 958, 920, 953, 995, 919, 994, 1012, 1000, 1000, 939, 929, 904, 941, 918, 904, 936, 1012, 957, 921, 910, 918, 949, 951, 910, 920, 913, 951, 954, 995, 931, 995, 1002, 913, 912, 948, 927, 926, 920, 1000, 1003, 929, 1000, 908, 899, 897, 899, 937, 952, 899, 922, 958, 916, 916, 1000, 1003, 918, 944, 1012, 1003, 926, 1002, 942, 1008, 904, 919, 1005, 931, 
    953, 921, 920, 959, 942, 921, 920, 951, 952, 950, 907, 921, 944, 948, 919, 908, 1003, 1004, 1004, 922, 931, 898, 951, 907, 911, 956, 898, 898, 998, 1639, 1640, 1661, 1632, 1663, 1644, 1577, -29186, 27211, 21673, 24015, 24376, -29908, 1073, 1075, 1061, 1065, 1082, 1065, 1087, 1079, 1077, 1074, 1083, 27212, 24972, -30242, 28267, -29202, 23310, 2022, 2039, 2039, 2027, 2030, 2020, 2022, 2035, 2030, 2024, 2025, 1960, 2029, 2036, 2024, 2025, 1980, 1959, 2020, 2031, 2022, 2037, 2036, 2018, 2035, 1978, 2034, 2035, 2017, 1962, 1983, 25364, 26836, 2897, 2873, 2853, 2853, 2849, 2897, 26896, 25296, 22627, 22401, 23074, 27328, -27540, -30054, 2792, 2802, 2718, 2793, 2770, 2718, 2761, 2691, 2718, 2698, 2712, 2716, 2798, 2713, 2702, 2760, 2691, 2719, 2689, 2766, 3061, 3030, 3012, 3026, 2945, 2947, 2967, 25483, 21688, -24914, -32680, 27920, 26320, 24243, 24818, -28662, 23507, -28564, -29030, 2498, 2509, 2520, 2501, 2522, 2505, 2444, 23905, 22328, -32689, 21098, 20637, -31607, 2812, 2808, 2260, 2243, 2243, 2270, 2243, 28175, 26063, 24935, 21707, -27789, -29307, 1437, 1416, 1416, 2262, 390, 387, 406, 387, -29625, 27634, 23106, 21606, 27192, 26022, 32105, 26912, 23466, 24730, 21933, 24187, 21670, -31930, 25843, -31436, 27975, 2682, 2680, 2669, 2684, 2686, 2678, 2667, 2656, 2650, 2678, 2679, 2669, 2684, 2679, 2669, 465, 467, 452, 473, 479, 478, 769, 771, 788, 769, 784, 771, 788, 1875, 1859, 1861, 1870, 1861, 2297, 2280, 2299, 2280, 2276, 2298, 2621, 2618, 2607, 2618, 2603, 2737, 2742, 2723, 2742, 2727, 835, 836, 849, 836, 853, 27740, 26524, 30351, 25656, -29698, -28346, 2453, 2455, 2448, 2458, 2810, 2797, 2811, 2813, 2788, 2812, 709, 722, 708, 706, 731, 707, 2737, 2726, 2738, 2742, 2726, 2736, 2743, 27973, 26245, -28969, 26978, -30555, -29977, 28229, -24700, 19242, -27792, 1446, 1467, 1457, 1465, 1463, 1446, 27472, 24720, 31325, 24667, -27092, -30502, 1342, 1337, 1319, 1229, 1216, 1220, 1217, 1216, 1239, 1238, 1098, 1094, 1094, 1090, 1088, 1100, 2982, 2994, 2995, 2991, 2984, 2997, 2990, 3005, 2982, 2995, 2990, 2984, 2985, 21655, 26132, 21066, 21050, -25343, 18949, 28754, 1370, 1330, 1326, 1326, 1322, 1321, 1273, 1275, 1260, 1265, 1271, 1270, 2462, 2450, 2451, 2446, 2440, 2448, 2456, 1763, 1790, 1780, 1788, 1778, 1763, 629, 626, 615, 626, 627, 629, 2053, 2056, 2060, 2057, 2056, 2079, 2078, 1032, 1029, 1038, 1043, 25327, 26927, -32387, 26312, -30961, -31411, 25071, -28626, 17536, -25382, 432, 433, 416, 437, 445, 440, 407, 443, 442, 416, 433, 442, 416, 2007, 2037, 2037, 2035, 2022, 2018, 1979, 2003, 2040, 2037, 2041, 2034, 2047, 2040, 2033, 641, 675, 675, 677, 688, 692, 749, 645, 686, 675, 687, 676, 681, 686, 679, 1180, 1169, 1168, 1179, 1153, 1180, 1153, 1164, 21117, 22564, 24452, -30345, 24471, 27003, 22845, 25021, 28505, -31463, 21497, 1833, 1834, 1830, 1828, 1841, 1836, 1834, 1835, 3104, 3116, 3117, 3127, 3110, 3117, 3127, 3182, 3127, 3130, 3123, 3110, 2074, 2070, 2071, 2061, 2076, 2071, 2061, 2132, 2076, 2071, 2074, 2070, 2077, 2064, 2071, 2078, 25611, 21581, 27853, 25129, -30615, 24201, 838, 833, 835, 843, 877, 833, 832, 858, 843, 832, 858, 1775, 1768, 1770, 1762, 1745, 1774, 1763, 1762, 1768, 1732, 1768, 1769, 1779, 1762, 1769, 1779, 989, 961, 972, 980, 968, 991, 1006, 962, 963, 985, 968, 963, 985, 1951, 1929, 1933, 1950, 1935, 1924, 1967, 1923, 1922, 1944, 1929, 1922, 1944, 513, 535, 531, 512, 529, 538, 561, 541, 540, 518, 535, 540, 518};
    public volatile Session a;

    final class Failure extends IOException {
        public Failure(String str) {
            super(str);
        }
    }

    final class Reply {
        public final int a;
        public final JSONObject b;
        public final byte[] c;

        public Reply(int i, JSONObject jSONObject, byte[] bArr) {
            this.a = i;
            this.b = jSONObject;
            this.c = bArr;
        }
    }

    final class Session {
        public final String a;
        public final HashSet b = new HashSet();
        public final OkHttpClient c;
        public volatile String d;
        public volatile boolean e;

        public Session(String str) {
            OkHttpClient.Builder builderRetryOnConnectionFailure = new OkHttpClient.Builder().proxy(java.net.Proxy.NO_PROXY).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(false);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.c = builderRetryOnConnectionFailure.connectTimeout(4L, timeUnit).readTimeout(12L, timeUnit).writeTimeout(12L, timeUnit).addNetworkInterceptor(new C0451c(0)).build();
            this.d = "";
            this.a = str;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        String strM358 = "name";
        try {
            JSONObject jSONObjectD = d("nav", new JSONObject());
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONArray jSONArray2 = jSONObjectD.getJSONArray("classes");
            int i = 0;
            while (i < jSONArray2.length()) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                String strN = n("id", jSONObject2);
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(strN, n(strM358, jSONObject2), null));
                if (z) {
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArray3 = jSONObjectD.getJSONObject("filters").getJSONArray(strN);
                    int i2 = 0;
                    while (i2 < jSONArray3.length()) {
                        JSONObject jSONObject3 = jSONArray3.getJSONObject(i2);
                        JSONArray jSONArray4 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList3 = new ArrayList();
                        int i3 = 0;
                        while (i3 < jSONArray4.length()) {
                            JSONObject jSONObject4 = jSONArray4.getJSONObject(i3);
                            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(n("n", jSONObject4), n("v", jSONObject4)));
                            i3++;
                            jSONObjectD = jSONObjectD;
                            jSONArray2 = jSONArray2;
                        }
                        arrayList2.add(new com.github.catvod.spider.merge.p001b.d(n("key", jSONObject3), n(strM358, jSONObject3), arrayList3));
                        i2++;
                        jSONObjectD = jSONObjectD;
                        jSONArray2 = jSONArray2;
                    }
                    jSONObject = jSONObjectD;
                    jSONArray = jSONArray2;
                    linkedHashMap.put(strN, arrayList2);
                } else {
                    jSONObject = jSONObjectD;
                    jSONArray = jSONArray2;
                }
                i++;
                jSONObjectD = jSONObject;
                jSONArray2 = jSONArray;
            }
            return com.github.catvod.spider.merge.p001b.g.v(arrayList, linkedHashMap);
        } catch (Exception e) {
            return com.github.catvod.spider.merge.p001b.g.d(c(e));
        }
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        return str != null && str.matches("(?i).*\\.(m3u8|mp4|mkv|flv|mpd|ts|mov)([?#].*)?$");
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        try {
            return k(d("home", new JSONObject()));
        } catch (Exception e) {
            return l(e, 1);
        }
    }

    private /* synthetic */ boolean $host$53940b53855fde82() {
        return false;
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int iMax;
        String str3 = str;
        try {
            iMax = (int) Math.max(1L, Math.min(1000000L, Long.parseLong(str2.trim())));
        } catch (Exception unused) {
            iMax = 1;
        }
        try {
            String strM21 = "search";
            JSONObject jSONObject = new JSONObject();
            String strM379 = "wd";
            if (str3 == null) {
                str3 = "";
            }
            return k(d(strM21, jSONObject.put(strM379, str3).put("page", iMax)));
        } catch (Exception e) {
            return l(e, iMax);
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObjectD = d("player", new JSONObject().put("id", str2));
            HttpUrl httpUrlO = o(n("url", jSONObjectD));
            int i = i(0, "parse", jSONObjectD);
            boolean z = true;
            h("播放数据格式错误", i <= 1);
            Headers headersF = f(jSONObjectD.getJSONObject("headers"));
            if (!httpUrlO.isHttps() && headersF.get("cookie") != null) {
                z = false;
            }
            h("凭据地址须使用 HTTPS", z);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i2 = 0; i2 < headersF.size(); i2++) {
                linkedHashMap.put(headersF.name(i2), headersF.value(i2));
            }
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.q(i);
            gVar.C(httpUrlO.toString());
            gVar.h(linkedHashMap);
            return gVar.r();
        } catch (Exception e) {
            String strC = c(e);
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C("");
            gVar2.l(strC);
            return new JSONObject(gVar2.r()).put("error", strC).toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0184 A[Catch: Exception -> 0x01db, TryCatch #0 {Exception -> 0x01db, blocks: (B:12:0x007e, B:13:0x017e, B:15:0x0184, B:16:0x01a3, B:18:0x01a9, B:20:0x01b7, B:22:0x01c2, B:29:0x01e1, B:30:0x022a, B:32:0x0232, B:33:0x0255, B:34:0x025c), top: B:38:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:18:0x01a9 A[Catch: Exception -> 0x01db, TryCatch #0 {Exception -> 0x01db, blocks: (B:12:0x007e, B:13:0x017e, B:15:0x0184, B:16:0x01a3, B:18:0x01a9, B:20:0x01b7, B:22:0x01c2, B:29:0x01e1, B:30:0x022a, B:32:0x0232, B:33:0x0255, B:34:0x025c), top: B:38:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x01b7 A[Catch: Exception -> 0x01db, TryCatch #0 {Exception -> 0x01db, blocks: (B:12:0x007e, B:13:0x017e, B:15:0x0184, B:16:0x01a3, B:18:0x01a9, B:20:0x01b7, B:22:0x01c2, B:29:0x01e1, B:30:0x022a, B:32:0x0232, B:33:0x0255, B:34:0x025c), top: B:38:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:27:0x01de  */
    /* JADX WARN: Code duplicated, block: B:32:0x0232 A[Catch: Exception -> 0x01db, TryCatch #0 {Exception -> 0x01db, blocks: (B:12:0x007e, B:13:0x017e, B:15:0x0184, B:16:0x01a3, B:18:0x01a9, B:20:0x01b7, B:22:0x01c2, B:29:0x01e1, B:30:0x022a, B:32:0x0232, B:33:0x0255, B:34:0x025c), top: B:38:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0049  */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONArray jSONArray;
        int i;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        ArrayList arrayList3;
        int i2;
        String strN;
        JSONArray jSONArray3;
        boolean z2;
        String strM33 = "$$$";
        String strM529 = "name";
        String strM545 = "id";
        if (list == null) {
            z = false;
            h("影片标识为空", z);
            JSONObject jSONObjectD = d("detail", new JSONObject().put(strM545, list.get(0)));
            JSONObject jSONObject2 = jSONObjectD.getJSONObject("vod");
            k kVar = new k(n(strM545, jSONObject2), n(strM529, jSONObject2), n("pic", jSONObject2), n("remark", jSONObject2));
            kVar.u(jSONObject2.optString("year"));
            kVar.k(jSONObject2.optString("area"));
            kVar.i(jSONObject2.optString("type"));
            kVar.j(jSONObject2.optString("actor"));
            kVar.m(jSONObject2.optString("director"));
            kVar.l(jSONObject2.optString("content"));
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            jSONArray = jSONObjectD.getJSONArray("lines");
            i = 0;
            while (i < jSONArray.length()) {
                jSONObject = jSONArray.getJSONObject(i);
                jSONArray2 = jSONObject.getJSONArray("episodes");
                arrayList3 = new ArrayList();
                i2 = 0;
                while (i2 < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    strN = n(strM545, jSONObject3);
                    if (strN.isEmpty()) {
                        jSONArray3 = jSONArray;
                    } else {
                        jSONArray3 = jSONArray;
                        if (strN.length() > 200000) {
                        }
                        h("选集标识错误", z2);
                        arrayList3.add(g(n(strM529, jSONObject3)) + "$" + strN);
                        i2++;
                        jSONArray = jSONArray3;
                    }
                    z2 = false;
                    h("选集标识错误", z2);
                    arrayList3.add(g(n(strM529, jSONObject3)) + "$" + strN);
                    i2++;
                    jSONArray = jSONArray3;
                }
                JSONArray jSONArray4 = jSONArray;
                if (!arrayList3.isEmpty()) {
                    arrayList.add(g(n(strM529, jSONObject)));
                    arrayList2.add(TextUtils.join("#", arrayList3));
                }
                i++;
                jSONArray = jSONArray4;
            }
            h("暂无可用选集", !arrayList.isEmpty());
            C0294s1.e(arrayList, arrayList2);
            C0294s1.c("板凳", arrayList);
            kVar.q(TextUtils.join(strM33, arrayList));
            kVar.r(TextUtils.join(strM33, arrayList2));
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        }
        try {
            if (list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            h("影片标识为空", z);
            try {
                JSONObject jSONObjectD2 = d("detail", new JSONObject().put(strM545, list.get(0)));
                JSONObject jSONObject4 = jSONObjectD2.getJSONObject("vod");
                k kVar2 = new k(n(strM545, jSONObject4), n(strM529, jSONObject4), n("pic", jSONObject4), n("remark", jSONObject4));
                kVar2.u(jSONObject4.optString("year"));
                kVar2.k(jSONObject4.optString("area"));
                kVar2.i(jSONObject4.optString("type"));
                kVar2.j(jSONObject4.optString("actor"));
                kVar2.m(jSONObject4.optString("director"));
                kVar2.l(jSONObject4.optString("content"));
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                jSONArray = jSONObjectD2.getJSONArray("lines");
                i = 0;
                while (i < jSONArray.length()) {
                    jSONObject = jSONArray.getJSONObject(i);
                    jSONArray2 = jSONObject.getJSONArray("episodes");
                    arrayList3 = new ArrayList();
                    i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        JSONObject jSONObject5 = jSONArray2.getJSONObject(i2);
                        strN = n(strM545, jSONObject5);
                        if (strN.isEmpty()) {
                            jSONArray3 = jSONArray;
                            if (strN.length() > 200000 && !strN.matches("(?s).*[#$\\s].*")) {
                                z2 = true;
                            }
                            h("选集标识错误", z2);
                            arrayList3.add(g(n(strM529, jSONObject5)) + "$" + strN);
                            i2++;
                            jSONArray = jSONArray3;
                        } else {
                            jSONArray3 = jSONArray;
                        }
                        z2 = false;
                        h("选集标识错误", z2);
                        arrayList3.add(g(n(strM529, jSONObject5)) + "$" + strN);
                        i2++;
                        jSONArray = jSONArray3;
                    }
                    JSONArray jSONArray5 = jSONArray;
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(g(n(strM529, jSONObject)));
                        arrayList2.add(TextUtils.join("#", arrayList3));
                    }
                    i++;
                    jSONArray = jSONArray5;
                }
                h("暂无可用选集", !arrayList.isEmpty());
                C0294s1.e(arrayList, arrayList2);
                C0294s1.c("板凳", arrayList);
                kVar2.q(TextUtils.join(strM33, arrayList));
                kVar2.r(TextUtils.join(strM33, arrayList2));
                return com.github.catvod.spider.merge.p001b.g.s(kVar2);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        return com.github.catvod.spider.merge.p001b.g.d(c(e));
    }

    private /* synthetic */ Object[] $host$dca6c5e1c5a7de15(Map<String, String> map) {
        return new Object[]{404, "text/plain; charset=utf-8", "此站源不需要本地代理"};
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int iMax;
        try {
            iMax = (int) Math.max(1L, Math.min(1000000L, Long.parseLong(str2.trim())));
        } catch (Exception unused) {
            iMax = 1;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("tid", str).put("page", iMax);
            if (map != null) {
                String[] strArr = {"class", "area", "year"};
                for (int i = 0; i < 3; i++) {
                    String str3 = strArr[i];
                    jSONObjectPut.put(str3, map.get(str3));
                }
            }
            return k(d("category", jSONObjectPut));
        } catch (Exception e) {
            return l(e, iMax);
        }
    }

    public static String c(Exception exc) {
        String strM445;
        StringBuilder sb = new StringBuilder("板凳：");
        if (exc instanceof Failure) {
            strM445 = exc.getMessage();
        } else {
            strM445 = exc instanceof IOException ? "网络请求失败，请稍后重试" : "接口数据处理失败";
        }
        sb.append(strM445);
        return sb.toString();
    }

    public static Headers f(JSONObject jSONObject) throws Failure {
        h("请求头过大", jSONObject.toString().getBytes(StandardCharsets.UTF_8).length <= 65536);
        Headers.Builder builder = new Headers.Builder();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            builder.set(next, n(next, jSONObject));
        }
        return builder.build();
    }

    public static String g(String str) {
        return str.replace('$', (char) 65284).replace('#', (char) 65283).replace('\r', ' ').replace('\n', ' ').trim();
    }

    public static void h(String str, boolean z) throws Failure {
        if (!z) {
            throw new Failure(str);
        }
    }

    public static int i(int i, String str, JSONObject jSONObject) throws Failure {
        Object objOpt = jSONObject.opt(str);
        h("桥接数字格式错误", (objOpt instanceof Integer) || (objOpt instanceof Long));
        long jLongValue = ((Number) objOpt).longValue();
        h("桥接数字超出范围", jLongValue >= ((long) i) && jLongValue <= 2147483647L);
        return (int) jLongValue;
    }

    public static JSONObject j(byte[] bArr) throws JSONException, Failure {
        JSONTokener jSONTokener = new JSONTokener(StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString());
        Object objNextValue = jSONTokener.nextValue();
        h("桥接 JSON 格式错误", (objNextValue instanceof JSONObject) && jSONTokener.nextClean() == 0);
        return (JSONObject) objNextValue;
    }

    public static String k(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("list");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(new k(n("id", jSONObject2), n("name", jSONObject2), n("pic", jSONObject2), n("remark", jSONObject2)));
        }
        JSONObject jSONObject3 = new JSONObject(com.github.catvod.spider.merge.p001b.g.y(arrayList));
        String strM169 = "page";
        JSONObject jSONObjectPut = jSONObject3.put(strM169, i(1, strM169, jSONObject));
        String strM477 = "pagecount";
        JSONObject jSONObjectPut2 = jSONObjectPut.put(strM477, i(1, strM477, jSONObject));
        String strM83 = "limit";
        JSONObject jSONObjectPut3 = jSONObjectPut2.put(strM83, i(0, strM83, jSONObject));
        String strM360 = "total";
        return jSONObjectPut3.put(strM360, i(0, strM360, jSONObject)).toString();
    }

    public static String l(Exception exc, int i) {
        return new JSONObject(com.github.catvod.spider.merge.p001b.g.d(c(exc))).put("page", i).put("pagecount", i).put("limit", 24).put("total", 0).toString();
    }

    public static String m(String str) throws Throwable {
        String strTrim = str == null ? "" : str.trim();
        h("ext 仅配置 PHP 地址", (strTrim.isEmpty() || strTrim.startsWith("{")) ? false : true);
        if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
            strTrim = FishCrypto.g(strTrim);
        }
        HttpUrl httpUrlO = o(strTrim);
        h("PHP 地址格式错误", httpUrlO.fragment() == null);
        return httpUrlO.toString();
    }

    public static String n(String str, JSONObject jSONObject) throws Failure {
        Object objOpt = jSONObject.opt(str);
        h("桥接字段格式错误", objOpt instanceof String);
        return (String) objOpt;
    }

    public static HttpUrl o(String str) throws Failure {
        boolean z = false;
        boolean z2 = (str == null || str.length() > 32768 || str.matches("(?s).*[\\x00-\\x20\\x7f].*")) ? false : true;
        String strM539 = "地址格式错误";
        h(strM539, z2);
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl != null && httpUrl.username().isEmpty() && httpUrl.password().isEmpty()) {
            z = true;
        }
        h(strM539, z);
        return httpUrl;
    }

    public final JSONObject a(Session session, JSONObject jSONObject, long j) throws JSONException, Failure {
        b(session, j);
        String string = jSONObject.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM539 = "N1.EgzTKO0+KeLT/wEmSCkWunvbx2cmFtnNStZrPwzR1elAYJXwmo2iC9PN8mKniEEwsMisPlkrSXtK9LsVbtawqOn2AJ171SuBraTG6RiG3sQ=";
        String strM467 = "N1.Z1f0gAOfyamvE1SuLhsZ3vOeykDG6gobIO0nKBph1pBkTt1+0NsiRHOD7Maw8GgOrNy0bfUSMCHtRzTeP5j5UH3F9xI/abfe16mH+AtGIZg=";
        byte[] bArrT = FishCrypto.t(strM539, strM467, "N1.h467CfAHeJ1gZBW0gGq2UuZBQmyG69o1RmclgQVF4nJA6gUWuFlUE/+/j2uEmWMPLaAaN9wjzCiVUOty/jCI4It1uK2R0dtWCEcSJYXJgec=", "N1.xbqUGNkmkXLExAcLBvBy5uxWLKm1Yuafn0DvCvYC7Nvaz5ruUBeILI//11PtnvDfWkTuUbX3CaoReCb8L9/33pzSvMSs/fBUMnlUCJla8x81JKoDEC30z3WXZXrcXAeOO30Mk/0E1u+SL6xbBCduBClcmPBkoLW077AxYlPTgYY=", bytes);
        h("native 请求加密失败", bArrT != null && bArrT.length > 0);
        JSONObject jSONObject2 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM83 = "moyufucking";
        byte[] bytes2 = jSONObject2.put(strM83, strEncodeToString).toString().getBytes(charset);
        h("桥接请求过大", bytes2.length <= 10485760);
        Reply replyE = e(session, new Request.Builder().url(session.a).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), bytes2)).build(), j, 10485760, false);
        b(session, j);
        int i = replyE.a;
        h("桥接 HTTP " + i, i == 200);
        JSONObject jSONObjectJ = j(replyE.c);
        h("桥接外围字段错误", jSONObjectJ.length() == 1);
        String strN = n(strM83, jSONObjectJ);
        boolean z = ((long) strN.length()) <= ((((long) 10485760) + 2) / 3) * 4 && strN.matches("[A-Za-z0-9+/]*={0,2}");
        String strM567 = "Base64 格式错误";
        h(strM567, z);
        byte[] bArrDecode = Base64.decode(strN, 2);
        h(strM567, bArrDecode.length <= 10485760 && Base64.encodeToString(bArrDecode, 2).equals(strN));
        h("桥接密文长度错误", bArrDecode.length > 0 && bArrDecode.length % 16 == 0);
        byte[] bArrS = FishCrypto.s(strM539, strM467, bArrDecode);
        h("native 响应解密失败", bArrS != null && bArrS.length > 0 && bArrS.length <= 10485760);
        JSONObject jSONObjectJ2 = j(bArrS);
        if (Boolean.TRUE.equals(jSONObjectJ2.opt("ok"))) {
            return jSONObjectJ2.getJSONObject("data");
        }
        String strM499 = "error";
        String strM379 = "桥接服务错误";
        String strOptString = jSONObjectJ2.optString(strM499, strM379);
        h(strM379, (strOptString.length() > 160 || strOptString.contains("://") || strOptString.contains("\n")) ? false : true);
        throw new Failure(strOptString);
    }

    public final long b(Session session, long j) throws Failure {
        h("请求已取消或站源尚未初始化", (session == null || session != this.a || session.e || Thread.currentThread().isInterrupted()) ? false : true);
        long jNanoTime = j - System.nanoTime();
        h("请求超时", jNanoTime > 0);
        return jNanoTime;
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

    public final JSONObject d(String str, JSONObject jSONObject) throws JSONException, IOException {
        Reply reply;
        Session session = this.a;
        long nanos = TimeUnit.SECONDS.toNanos(45L) + System.nanoTime();
        b(session, nanos);
        JSONObject jSONObjectA = a(session, new JSONObject().put("action", "prepare").put("scene", str).put("params", jSONObject).put("state", session.d), nanos);
        int i = 0;
        while (i <= 12) {
            b(session, nanos);
            boolean z = true;
            if (jSONObjectA.has("state")) {
                synchronized (session) {
                    b(session, nanos);
                    String strN = n("state", jSONObjectA);
                    h("桥接状态过长", strN.length() <= 16384);
                    session.d = strN;
                }
            }
            String strN2 = n("kind", jSONObjectA);
            if (strN2.equals("result")) {
                return jSONObjectA.getJSONObject("result");
            }
            h("桥接请求超过步骤上限", strN2.equals("request") && i < 12);
            String strN3 = n("ticket", jSONObjectA);
            h("桥接票据错误", !strN3.isEmpty() && strN3.length() <= 400000);
            HttpUrl httpUrlO = o(n("url", jSONObjectA));
            Headers headersF = f(jSONObjectA.getJSONObject("headers"));
            if (!httpUrlO.isHttps() && (headersF.get("cookie") != null || headersF.get("authorization") != null)) {
                z = false;
            }
            h("凭据地址须使用 HTTPS", z);
            try {
                reply = e(session, new Request.Builder().url(httpUrlO).headers(headersF).tag(Headers.class, headersF).get().build(), nanos, 4194304, true);
            } catch (IOException e) {
                b(session, nanos);
                if (e instanceof Failure) {
                    throw e;
                }
                reply = new Reply(0, new JSONObject(), new byte[0]);
            }
            b(session, nanos);
            jSONObjectA = a(session, new JSONObject().put("action", "consume").put("ticket", strN3).put("status", reply.a).put("headers", reply.b).put("body", Base64.encodeToString(reply.c, 2)), nanos);
            i++;
        }
        throw new Failure("桥接请求超过步骤上限");
    }

    public synchronized void destroy() {
        Session session = this.a;
        this.a = null;
        if (session == null) {
            return;
        }
        synchronized (session) {
            try {
                session.e = true;
                session.d = "";
                Iterator it = session.b.iterator();
                while (it.hasNext()) {
                    ((Call) it.next()).cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        session.c.connectionPool().evictAll();
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

    public final Reply e(Session session, Request request, long j, int i, boolean z) {
        BanDeng banDeng = this;
        Request requestBuild = request;
        OkHttpClient.Builder builderCallTimeout = session.c.newBuilder().callTimeout(banDeng.b(session, j), TimeUnit.NANOSECONDS);
        if (z) {
            builderCallTimeout.dns(new C0359j(4));
        }
        if (requestBuild.tag(Headers.class) != null && requestBuild.header("Accept-Encoding") == null) {
            requestBuild = request.newBuilder().header("Accept-Encoding", "identity").build();
        }
        Call callNewCall = builderCallTimeout.build().newCall(requestBuild);
        synchronized (session) {
            banDeng.b(session, j);
            session.b.add(callNewCall);
        }
        try {
            Response responseExecute = callNewCall.execute();
            try {
                h("响应头过大", responseExecute.headers().byteCount() <= 65536);
                h("接口正文过大", responseExecute.body() == null || responseExecute.body().contentLength() <= ((long) i));
                JSONObject jSONObject = new JSONObject();
                String[] strArr = {"location", "content-type", "content-encoding"};
                for (int i2 = 0; i2 < 3; i2++) {
                    String str = strArr[i2];
                    if (responseExecute.header(str) != null) {
                        jSONObject.put(str, responseExecute.header(str));
                    }
                }
                Buffer buffer = new Buffer();
                while (responseExecute.body() != null) {
                    try {
                        long j2 = i;
                        if (buffer.size() > j2) {
                            break;
                        }
                        banDeng.b(session, j);
                        if (responseExecute.body().source().read(buffer, Math.min(8192L, (j2 + 1) - buffer.size())) < 0) {
                            break;
                        }
                        banDeng = this;
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
                }
                b(session, j);
                h("接口正文过大", buffer.size() <= ((long) i));
                Reply reply = new Reply(responseExecute.code(), jSONObject, buffer.readByteArray());
                responseExecute.close();
                synchronized (session) {
                    session.b.remove(callNewCall);
                }
                return reply;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            synchronized (session) {
                session.b.remove(callNewCall);
                throw th5;
            }
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
        destroy();
        this.a = new Session(m(str));
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
}

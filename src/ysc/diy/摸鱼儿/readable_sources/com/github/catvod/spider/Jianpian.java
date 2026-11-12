package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.s0.C0118;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Jianpian extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f55short = {869, 2437, 2507, 2522, 2499, 2437, 2524, 2456, 2437, 2521, 2511, 2526, 2526, 2499, 2500, 2509, 2521, 2437, 2498, 2501, 2503, 2511, 2537, 2507, 2526, 2511, 2509, 2501, 2520, 2515, 1878, 1875, 1862, 1875, 448, 463, 451, 459, 28512, -28776, 1384, 1381, 962, 908, 925, 900, 962, 926, 897, 900, 905, 904, 962, 897, 900, 926, 921, 978, 925, 898, 926, 946, 900, 905, 976, 981, 981, 2333, 2402, 2429, 2347, 2330, 2341, 2345, 2364, 2336, 2328, 2407, 2320, 2308, 2400, 2308, 2352, 2310, 2354, 2327, 2337, 2360, 2328, 2353, 2335, 2343, 2308, 2306, 2411, 2401, 2364, 2327, 2310, 2314, 2340, 2308, 2342, 2336, 2404, 2307, 2329, 2357, 2339, 2307, 2314, 2402, 2330, 2326, 2366, 2328, 2406, 2313, 2315, 2313, 2326, 2360, 2367, 2330, 2311, 2335, 2325, 2357, 2367, 2306, 2411, 2360, 2403, 2326, 2407, 2367, 2335, 2405, 2345, 2320, 2428, 2359, 2311, 2345, 2359, 2328, 2324, 2428, 2332, 2311, 2360, 2335, 2315, 2346, 2339, 2340, 2414, 2414, 2689, 2708, 2708, 3206, 3272, 3289, 3264, 3206, 3295, 3227, 3206, 3290, 3276, 3272, 3291, 3274, 3265, 3206, 3295, 3264, 3277, 3276, 3270, 3327, 3227, 3222, 3266, 3276, 3280, 3220, 2116, 2049, 2051, 2070, 2055, 2053, 2061, 2064, 2075, 2109, 2059, 2054, 2143, 2138, 2138, 2116, 2066, 2051, 2053, 2055, 2143, 721, 647, 662, 656, 658, 676, 670, 653, 658, 714, 709, 711, 799, 2705, 2783, 2766, 2775, 2705, 2760, 2775, 2778, 2779, 2769, 2705, 2778, 2779, 2762, 2783, 2775, 2770, 2760, 2700, 2689, 2775, 2778, 2691, 1623, 677, 677, 677, 479, 1258, 2236, 2280, 2275, 2292, 2286, 339, 2863, 2858, 819, 869, 884, 882, 880, 808, 3154, 3154, 3109, 3109, 3109, 2581, 2566, 2577, 2581, 1661, 1978, 1958, 1954, 1969, 472, 451, 1760, 1765, 1777, 1780, 1761, 1780, 1278, 1200, 1185, 1208, 1278, 1202, 1187, 1188, 1212, 1203, 1278, 1213, 1208, 1186, 1189, 1262, 1207, 1202, 1200, 1189, 1204, 1166, 1185, 1208, 1205, 1260, 3198, 3129, 3114, 3133, 3129, 3173, 2132, 2059, 2071, 2067, 2048, 2127, 2762, 2712, 2709, 2716, 2697, 2769, 2780, 2762, 2719, 2691, 2718, 2712, 2769, 1152, 1221, 1223, 1234, 1219, 1217, 1225, 1236, 1247, 1273, 1231, 1218, 1179, 2277, 2219, 2234, 2211, 2277, 2222, 2227, 2206, 2219, 2221, 2277, 2214, 2211, 2233, 2238, 2293, 2217, 2219, 2238, 2223, 2221, 2213, 2232, 2227, 2197, 2211, 2222, 2295, 3010, 3049, 3051, 3047, 3055, 3048, 2982, 3042, 3055, 3061, 3045, 3049, 3056, 3043, 3060, 3071, 2982, 3040, 3047, 3055, 3050, 3043, 3042, 1486, 1509, 1511, 1515, 1507, 1508, 1450, 1518, 1507, 1529, 1513, 1509, 1532, 1519, 1528, 1523, 1450, 1513, 1515, 1508, 1513, 1519, 1510, 1510, 1519, 1518, 1450, 1509, 1528, 1450, 1534, 1507, 1511, 1519, 1518, 1450, 1509, 1535, 1534, 1213, 1179, 1165, 1178, 1221, 1193, 1167, 1165, 1158, 1180, 2297, 2267, 2254, 2269, 2264, 2264, 2261, 2203, 2177, 2202, 2180, 2196, 2204, 2296, 2269, 2266, 2241, 2252, 2191, 2196, 2293, 2266, 2256, 2246, 2267, 2269, 2256, 2196, 2189, 2191, 2196, 2274, 2182, 2181, 2189, 2178, 2293, 2196, 2294, 2241, 2269, 2264, 2256, 2203, 2276, 2277, 2183, 2293, 2202, 2181, 2189, 2180, 2179, 2180, 2177, 2202, 2180, 2188, 2182, 2181, 2181, 2188, 2180, 2189, 2191, 2196, 2243, 2242, 2205, 2196, 2293, 2244, 2244, 2264, 2257, 2275, 2257, 2262, 2303, 2269, 2240, 2203, 2177, 2183, 2179, 2202, 2183, 2178, 2196, 2204, 2303, 2300, 2272, 2297, 2296, 2200, 2196, 2264, 2269, 2271, 2257, 2196, 2291, 2257, 2263, 2271, 2267, 2205, 2196, 2274, 2257, 2246, 2247, 2269, 2267, 2266, 2203, 2176, 2202, 2180, 2196, 2295, 2268, 2246, 2267, 2265, 2257, 2203, 2189, 2181, 2202, 2180, 2202, 2176, 2176, 2179, 2182, 2202, 2181, 2181, 2176, 2196, 2297, 2267, 2262, 2269, 2264, 2257, 2196, 2279, 2261, 2258, 2261, 2246, 2269, 2203, 2177, 2183, 2179, 2202, 2183, 2178, 2191, 2243, 2257, 2262, 2261, 2266, 2271, 2203, 2268, 2177, 2258, 2261, 2263, 2257, 2191, 2243, 2257, 2262, 2261, 2266, 2271, 2203, 2181, 2202, 2180, 2191, 2266, 2257, 2240, 2272, 2253, 2244, 2257, 2190, 2298, 2289, 2272, 2275, 2299, 2278, 2303, 2283, 2275, 2301, 2290, 2301, 2191, 2261, 2244, 2244, 2274, 2257, 2246, 2247, 2269, 2267, 2266, 2190, 2176, 2181, 2178, 2191, 2244, 2261, 2263, 2271, 2261, 2259, 2257, 2298, 2261, 2265, 2257, 2190, 2263, 2267, 2265, 2202, 2270, 2244, 2183, 2202, 2252, 2259, 2183, 2431, 2376, 2379, 2376, 2399, 2376, 2399, 2750, 2753, 2782, 2738, 2750, 2744, 2707, 2761, 2750, 2740, 2743, 2725, 2746, 2689, 2695, 2693, 2705, 2742, 2723, 2753, 2708, 2722, 2751, 2758, 2722, 2729, 2712, 2747, 2755, 2738, 2725, 2729, 2783, 2751, 2698, 2711, 2725, 2689, 2690, 2688, 2688, 2719, 2692, 2694, 2747, 2688, 2720, 2689, 2706, 2708, 2758, 2694, 2694, 2713, 2752, 2710, 2711, 2742, 2759, 2723, 2707, 2746, 2708, 2730, 2694, 2697, 2720, 2744, 2738, 2747, 2696, 2691, 2738, 2692, 2779, 2737, 2696, 2725, 2750, 2745, 2739, 2690, 2753, 2761, 2724, 2726, 2747, 2758, 2723, 2740, 2693, 2719, 2758, 2712, 2779, 2743, 2712, 2723, 2745, 2692, 2691, 2753, 2718, 2725, 2742, 2689, 2688, 2711, 2713, 2721, 2765, 3019, 2996, 2987, 3043, 3019, 3060, 2993, 3024, 3043, 3022, 3041, 3051, 3009, 3021, 3068, 3019, 3062, 3056, 3071, 3019, 2999, 3004, 3025, 3053, 3021, 3005, 3017, 3024, 3062, 3061, 2995, 3019, 3056, 3060, 2999, 2990, 3004, 3036, 3054, 3027, 3037, 3050, 2999, 3016, 3012, 3022, 2994, 3005, 3051, 3028, 2996, 3037, 3015, 3062, 3058, 3018, 3048, 3071, 3048, 3019, 3012, 3037, 3030, 2992, 2997, 2995, 3010, 3054, 3049, 3053, 3029, 3044, 3051, 3018, 3071, 3026, 3044, 3053, 3005, 3058, 3050, 3057, 2986, 3016, 3029, 3071, 3053, 2994, 3037, 3054, 3041, 3029, 2999, 3020, 3037, 3022, 3008, 2997, 3059, 3036, 3068, 3053, 3058, 3019, 3048, 3036, 2995, 3028, 3019, 3008, 2997, 3011, 2997, 3071, 3023, 3062, 3010, 3056, 3047, 2995, 3026, 3059, 3031, 3015, 3027, 3042, 3071, 3044, 2998, 3031, 3053, 3050, 3030, 3019, 3016, 3052, 3031, 3012, 3019, 3022, 3047, 3010, 2986, 3026, 3041, 3029, 3040, 3024, 3061, 2993, 3053, 3042, 3058, 3000, 3000, 2279, 2248, 2261, 2257, 2243, 2260, 1216, 1221, 1232, 1221, 3234, 755, 2988, 2992, 2992, 2996, 2999, 3070, 3051, 3051, 2995, 2981, 2986, 2979, 2977, 2998, 2986, 2989, 2993, 
    3050, 2630, 2568, 2585, 2560, 2630, 2591, 2651, 2630, 2586, 2572, 2589, 2589, 2560, 2567, 2574, 2586, 2630, 2587, 2572, 2586, 2566, 2588, 2587, 2570, 2572, 2605, 2566, 2564, 2568, 2560, 2567, 2602, 2566, 2567, 2575, 2560, 2574, 3118, 3153, 3150, 3096, 3113, 3094, 3098, 3087, 3091, 3115, 3156, 3107, 3127, 3155, 3127, 3075, 3125, 3073, 3108, 3090, 3083, 3115, 3074, 3116, 3092, 3127, 3121, 3160, 3154, 3087, 3108, 3125, 3129, 3095, 3127, 3093, 3091, 3159, 3120, 3114, 3078, 3088, 3120, 3129, 3153, 3113, 3109, 3085, 3115, 3157, 3130, 3128, 3130, 3109, 3083, 3084, 3113, 3124, 3116, 3110, 3078, 3084, 3121, 3160, 3083, 3152, 3109, 3156, 3084, 3116, 3158, 3098, 3107, 3151, 3076, 3124, 3098, 3076, 3115, 3111, 3151, 3119, 3124, 3083, 3116, 3128, 3097, 3088, 3095, 3165, 3165, 2425, 2428, 2409, 2428, 458, 462, 452, 487, 460, 462, 450, 458, 461, 2567, 2680, 2663, 2609, 2560, 2623, 2611, 2598, 2618, 2562, 2685, 2570, 2590, 2682, 2590, 2602, 2588, 2600, 2573, 2619, 2594, 2562, 2603, 2565, 2621, 2590, 2584, 2673, 2683, 2598, 2573, 2588, 2576, 2622, 2590, 2620, 2618, 2686, 2585, 2563, 2607, 2617, 2585, 2576, 2680, 2560, 2572, 2596, 2562, 2684, 2579, 2577, 2579, 2572, 2594, 2597, 2560, 2589, 2565, 2575, 2607, 2597, 2584, 2673, 2594, 2681, 2572, 2685, 2597, 2565, 2687, 2611, 2570, 2662, 2605, 2589, 2611, 2605, 2562, 2574, 2662, 2566, 2589, 2594, 2565, 2577, 2608, 2617, 2622, 2676, 2676, 2507, 2505, 2524, 2509, 2511, 2503, 2522, 2513, 2539, 2503, 2502, 2524, 2509, 2502, 2524, 1444, 1445, 1460, 1441, 1449, 1452, 1411, 1455, 1454, 1460, 1445, 1454, 1460, 2639, 987, 987, 451, 479, 479, 475, 472, 401, 1035, 1047, 1047, 1043, 1113, 1100, 1100, 3155, 3151, 3151, 3147, 3144, 3073, 3092, 3092, 1811, 1409, 1534, 1505, 1463, 1414, 1465, 1461, 1440, 1468, 1412, 1531, 1420, 1432, 1532, 1432, 1452, 1434, 1454, 1419, 1469, 1444, 1412, 1453, 1411, 1467, 1432, 1438, 1527, 1533, 1440, 1419, 1434, 1430, 1464, 1432, 1466, 1468, 1528, 1439, 1413, 1449, 1471, 1439, 1430, 1534, 1414, 1418, 1442, 1412, 1530, 1429, 1431, 1429, 1418, 1444, 1443, 1414, 1435, 1411, 1417, 1449, 1443, 1438, 1527, 1444, 1535, 1418, 1531, 1443, 1411, 1529, 1461, 1420, 1504, 1451, 1435, 1461, 1451, 1412, 1416, 1504, 1408, 1435, 1444, 1411, 1431, 1462, 1471, 1464, 1522, 1522, 1402, 1405, 1407, 1399, 1361, 1405, 1404, 1382, 1399, 1404, 1382, 1118, 1113, 1115, 1107, 1120, 1119, 1106, 1107, 1113, 1141, 1113, 1112, 1090, 1107, 1112, 1090, 1032, 1044, 1049, 1025, 1053, 1034, 1083, 1047, 1046, 1036, 1053, 1046, 1036, 2002, 1988, 1984, 2003, 1986, 1993, 2018, 1998, 1999, 2005, 1988, 1999, 2005, 2928, 2918, 2914, 2929, 2912, 2923, 2880, 2924, 2925, 2935, 2918, 2925, 2935, 1843, 1829, 1825, 1842, 1827, 1832, 1795, 1839, 1838, 1844, 1829, 1838, 1844};
    public volatile String a = "";
    public volatile String b;
    public volatile String c;
    public boolean d;
    public long e;
    public long f;
    public volatile boolean g;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        b();
        if (this.a.isEmpty()) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement : ((JsonObject) new Gson().fromJson(c(this.a + "/api/v2/settings/homeCategory"), JsonObject.class)).getAsJsonArray("data")) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            String strM277 = "name";
            if (!asJsonObject.get(strM277).getAsString().equals("推荐")) {
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(jsonElement.getAsJsonObject().get("id").getAsString(), jsonElement.getAsJsonObject().get(strM277).getAsString(), null));
            }
        }
        return com.github.catvod.spider.merge.p001b.g.t(arrayList, JsonParser.parseString(c(this.c)));
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        b();
        if (this.a.isEmpty()) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = com.github.catvod.spider.merge.p008i.f.b(c(this.a + "/api/slide/list?pos_id=88")).a().iterator();
        while (it.hasNext()) {
            arrayList.add(((com.github.catvod.spider.merge.p008i.d) it.next()).l(this.b));
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String str3 = str2;
        b();
        String strI = AbstractC0280n1.i(str, str3, null, null);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        String strV = FishCrypto.v("N1.xIvzosK4CW3WcUaDrkKbLtWQ82oDUYwWus7PJfpPY1IEmK5ZXZEklITLFflQ8k0E4lL6zC/dTzdKG/OTkLXypw==");
        if (str3 == null || str3.isEmpty() || strV.isEmpty()) {
            str3 = "";
        } else {
            int iIndexOf = str3.indexOf("://");
            if (iIndexOf >= 0) {
                str3 = str3.substring(0, iIndexOf) + strV + str3.substring(iIndexOf + 3);
            }
        }
        gVar.C(str3);
        gVar.h(d(this.a));
        gVar.b(strI);
        return gVar.r();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00ae A[Catch: Exception -> 0x00b4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b4, blocks: (B:8:0x007e, B:10:0x0084, B:13:0x00a0, B:14:0x00ae), top: B:24:0x007e }] */
    private /* synthetic */ String $host$65c98ef5fb2c1de8(String str, String str2) {
        com.github.catvod.spider.merge.p008i.g gVar;
        b();
        if (this.a.isEmpty()) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("/api/v2/search/videoV2?key=" + URLEncoder.encode(str) + "&category_id=88&page=" + str2 + "&pageSize=20");
        String strC = c(sb.toString());
        if (strC != null) {
            try {
                if (strC.isEmpty() || !strC.trim().startsWith("{")) {
                    gVar = new com.github.catvod.spider.merge.p008i.g();
                } else {
                    gVar = (com.github.catvod.spider.merge.p008i.g) new Gson().fromJson(strC, com.github.catvod.spider.merge.p008i.g.class);
                }
            } catch (Exception unused) {
                gVar = new com.github.catvod.spider.merge.p008i.g();
            }
        } else {
            gVar = new com.github.catvod.spider.merge.p008i.g();
        }
        Iterator it = gVar.a().iterator();
        while (it.hasNext()) {
            arrayList.add(((com.github.catvod.spider.merge.p008i.g) it.next()).b(this.b));
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0076 A[Catch: Exception -> 0x007c, TRY_LEAVE, TryCatch #0 {Exception -> 0x007c, blocks: (B:8:0x0046, B:10:0x004c, B:13:0x0068, B:14:0x0076), top: B:32:0x0046 }] */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        com.github.catvod.spider.merge.p008i.e eVar;
        b();
        if (this.a.isEmpty()) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        String strC = c(this.a + "/api/video/detailv2?id=" + list.get(0));
        if (strC != null) {
            try {
                if (strC.isEmpty() || !strC.trim().startsWith("{")) {
                    eVar = new com.github.catvod.spider.merge.p008i.e();
                } else {
                    eVar = (com.github.catvod.spider.merge.p008i.e) new Gson().fromJson(strC, com.github.catvod.spider.merge.p008i.e.class);
                }
            } catch (Exception unused) {
                eVar = new com.github.catvod.spider.merge.p008i.e();
            }
        } else {
            eVar = new com.github.catvod.spider.merge.p008i.e();
        }
        com.github.catvod.spider.merge.p008i.d dVarA = eVar.a();
        k kVarM = dVarA.m(this.b);
        ArrayList arrayList = new ArrayList();
        Iterator it = dVarA.g().iterator();
        while (it.hasNext()) {
            arrayList.add(((com.github.catvod.spider.merge.p008i.b) it.next()).b());
        }
        String strM368 = "$$$";
        kVarM.q(TextUtils.join(strM368, arrayList));
        kVarM.u(dVarA.k());
        kVarM.k(dVarA.c());
        kVarM.i(dVarA.i());
        kVarM.j(dVarA.b());
        ArrayList arrayList2 = new ArrayList();
        for (com.github.catvod.spider.merge.p008i.b bVar : dVarA.g()) {
            ArrayList arrayList3 = new ArrayList();
            for (com.github.catvod.spider.merge.p008i.a aVar : bVar.a()) {
                arrayList3.add(aVar.a() + "$" + aVar.b());
            }
            arrayList2.add(TextUtils.join("#", arrayList3));
        }
        String strJoin = TextUtils.join(strM368, arrayList2);
        kVarM.r(strJoin);
        kVarM.m(dVarA.f());
        kVarM.l(dVarA.e());
        AbstractC0280n1.p(dVarA.h());
        AbstractC0280n1.q(strJoin);
        N1.d(kVarM);
        return com.github.catvod.spider.merge.p001b.g.s(kVarM);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        b();
        if (this.a.isEmpty()) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        if (str.endsWith("/{pg}")) {
            return searchContent(str.split("/")[0], str2);
        }
        boolean zEquals = str.equals("50");
        String strM454 = "&page=";
        if (zEquals || str.equals("99") || str.equals("111")) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("/api/dyTag/list?category_id=" + str + strM454 + str2);
            Iterator it = com.github.catvod.spider.merge.p008i.f.b(c(sb.toString())).a().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((com.github.catvod.spider.merge.p008i.d) it.next()).d().iterator();
                while (it2.hasNext()) {
                    arrayList.add(((com.github.catvod.spider.merge.p008i.d) it2.next()).m(this.b));
                }
            }
            return AbstractC0449a.c(1, 1, 0, 1, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        String strM10 = "area";
        Object obj = map2.get(strM10);
        String strM54 = "0";
        String str3 = obj == null ? strM54 : (String) map2.get(strM10);
        String strM346 = "year";
        if (map2.get(strM346) != null) {
            strM54 = (String) map2.get(strM346);
        }
        String strM83 = "by";
        String strM358 = map2.get(strM83) == null ? "updata" : (String) map2.get(strM83);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a);
        StringBuilder sb3 = new StringBuilder("/api/crumb/list?fcate_pid=");
        sb3.append(str);
        sb3.append("&area=");
        com.github.catvod.spider.merge.D.b.A(sb3, str3, "&year=", strM54, "&type=0&sort=");
        sb3.append(strM358);
        sb3.append(strM454);
        sb3.append(str2);
        sb3.append("&category_id=");
        sb2.append(sb3.toString());
        Iterator it3 = com.github.catvod.spider.merge.p008i.f.b(c(sb2.toString())).a().iterator();
        while (it3.hasNext()) {
            arrayList2.add(((com.github.catvod.spider.merge.p008i.d) it3.next()).m(this.b));
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList2);
    }

    public static String a(long j, String str, String str2) throws IOException {
        long millis = TimeUnit.NANOSECONDS.toMillis(j - System.nanoTime());
        if (millis <= 0 || Thread.currentThread().isInterrupted()) {
            throw new IOException("Domain discovery cancelled or timed out");
        }
        Response responseJ = X1.J(com.github.catvod.spider.merge.D.b.u(str).headers(Headers.of(d(str2))).build(), millis);
        if (responseJ != null) {
            try {
                if (responseJ.isSuccessful() && responseJ.body() != null) {
                    String strString = responseJ.body().string();
                    responseJ.close();
                    return strString;
                }
            } catch (Throwable th) {
                if (responseJ != null) {
                    try {
                        responseJ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Domain discovery failed");
    }

    public static HashMap d(String str) {
        return com.github.catvod.spider.merge.D.b.t("User-Agent", "Mozilla/5.0 (Linux; Android 9; V2196A Build/PQ3A.190705.08211809; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/91.0.4472.114 Mobile Safari/537.36;webank/h5face;webank/1.0;netType:NETWORK_WIFI;appVersion:416;packageName:com.jp3.xg3", "Referer", str);
    }

    public final void b() {
        if (this.g || Thread.currentThread().isInterrupted()) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.g && !this.d && System.nanoTime() >= this.f) {
                    String strV = FishCrypto.v("N1.BNHc9NDGUJqwuaFS1dRO6RYhK3BUY/OzgUqrppotvKpPqbd6vvi0fgF7ScJdZvyPHBKxsBt+AxUNICr19TVK6SDuo6h+GhSIts1nUFqpgiQ=");
                    if (strV.isEmpty()) {
                        return;
                    }
                    if (this.a.isEmpty()) {
                        this.a = strV;
                    }
                    long j = this.e;
                    this.d = true;
                    long nanos = TimeUnit.MILLISECONDS.toNanos(3000L) + System.nanoTime();
                    try {
                        try {
                            JsonArray asJsonArray = JsonParser.parseString(a(nanos, FishCrypto.v("N1.fNq4UfKdnDHyNsuzN29ThH8LUsp6Nuq2+9YkVXo2MAK78nQ1XBswOmzmNAXS506GklhPanOzWah8wot/MPzh7XkdP2IXKE0vYyhwNmY6QNE0F0zJsGub6WvRBVgza3RhoSNMiRANKbG/WdPeUp4hgw=="), this.a)).getAsJsonObject().getAsJsonArray("Answer");
                            if (asJsonArray != null && !asJsonArray.isEmpty()) {
                                String[] strArrSplit = asJsonArray.get(0).getAsJsonObject().get("data").getAsString().replace("\"", "").split(",");
                                for (int i = 0; i < strArrSplit.length; i++) {
                                    String str = "https://wangerniu." + strArrSplit[i];
                                    long jNanoTime = System.nanoTime();
                                    try {
                                        String strE = e(nanos, JsonParser.parseString(a(jNanoTime + ((nanos - jNanoTime) / ((long) (strArrSplit.length - i))), FishCrypto.u("N1.xIvzosK4CW3WcUaDrkKbLtWQ82oDUYwWus7PJfpPY1IEmK5ZXZEklITLFflQ8k0E4lL6zC/dTzdKG/OTkLXypw==", str + "/api/v2/settings/resourceDomainConfig"), str)).getAsJsonObject().getAsJsonObject("data").get("imgDomain").getAsString());
                                        synchronized (this) {
                                            try {
                                                if (j == this.e && !Thread.currentThread().isInterrupted()) {
                                                    this.b = strE;
                                                    this.a = str;
                                                    this.g = true;
                                                    synchronized (this) {
                                                        try {
                                                            this.d = false;
                                                            if (j == this.e) {
                                                                this.f = System.nanoTime() + TimeUnit.SECONDS.toNanos(5L);
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                    return;
                                                }
                                                synchronized (this) {
                                                    try {
                                                        this.d = false;
                                                        if (j == this.e) {
                                                            this.f = System.nanoTime() + TimeUnit.SECONDS.toNanos(5L);
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                return;
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    } catch (Exception unused) {
                                        if (System.nanoTime() >= nanos || Thread.currentThread().isInterrupted()) {
                                            synchronized (this) {
                                                try {
                                                    this.d = false;
                                                    if (j == this.e) {
                                                        this.f = System.nanoTime() + TimeUnit.SECONDS.toNanos(5L);
                                                    }
                                                    return;
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                            }
                                        }
                                    }
                                }
                                synchronized (this) {
                                    try {
                                        this.d = false;
                                        if (j == this.e) {
                                            this.f = System.nanoTime() + TimeUnit.SECONDS.toNanos(5L);
                                        }
                                        return;
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                            }
                            synchronized (this) {
                                try {
                                    this.d = false;
                                    if (j == this.e) {
                                        this.f = System.nanoTime() + TimeUnit.SECONDS.toNanos(5L);
                                    }
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        } catch (Exception unused2) {
                            synchronized (this) {
                                try {
                                    this.d = false;
                                    if (j == this.e) {
                                        this.f = System.nanoTime() + TimeUnit.SECONDS.toNanos(5L);
                                    }
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        }
                    } catch (Throwable th8) {
                        synchronized (this) {
                            try {
                                this.d = false;
                                if (j == this.e) {
                                    this.f = System.nanoTime() + TimeUnit.SECONDS.toNanos(5L);
                                }
                                throw th8;
                            } catch (Throwable th9) {
                                throw th9;
                            }
                        }
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final String c(String str) {
        return X1.X(FishCrypto.u("N1.xIvzosK4CW3WcUaDrkKbLtWQ82oDUYwWus7PJfpPY1IEmK5ZXZEklITLFflQ8k0E4lL6zC/dTzdKG/OTkLXypw==", str), null, d(this.a));
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

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    public final String e(long j, String str) {
        String strTrim;
        boolean z;
        if (str == null || str.length() == 0) {
            return "";
        }
        String str2 = "";
        for (String str3 : str.split(",")) {
            if (str3 == null) {
                strTrim = "";
            } else {
                strTrim = str3.trim();
                if (strTrim.length() == 0) {
                    strTrim = "";
                } else {
                    if (strTrim.startsWith("//")) {
                        strTrim = "https:".concat(strTrim);
                    }
                    if (!strTrim.startsWith("http://")) {
                        String strM199 = "https://";
                        if (!strTrim.startsWith(strM199)) {
                            strTrim = strM199.concat(strTrim);
                        }
                    }
                    while (strTrim.endsWith("/")) {
                        strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
                    }
                }
            }
            if (strTrim.length() != 0) {
                if (str2.length() == 0) {
                    str2 = strTrim;
                }
                Response responseJ = null;
                try {
                    long millis = TimeUnit.NANOSECONDS.toMillis(j - System.nanoTime());
                    if (millis <= 0 || Thread.currentThread().isInterrupted()) {
                        z = false;
                    } else {
                        try {
                            responseJ = X1.J(new Request.Builder().url(FishCrypto.u("N1.xIvzosK4CW3WcUaDrkKbLtWQ82oDUYwWus7PJfpPY1IEmK5ZXZEklITLFflQ8k0E4lL6zC/dTzdKG/OTkLXypw==", strTrim)).headers(Headers.of(d(this.a))).build(), millis);
                            z = responseJ != null && responseJ.code() > 0 && responseJ.code() < 500;
                            if (responseJ != null) {
                                responseJ.close();
                            }
                        } catch (Throwable unused) {
                            if (responseJ != null) {
                                responseJ.close();
                            }
                            z = false;
                        }
                    }
                } catch (Throwable unused2) {
                }
                if (z) {
                    return strTrim;
                }
                if (System.nanoTime() >= j || Thread.currentThread().isInterrupted()) {
                    break;
                }
            }
        }
        return str2;
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

    public void init(Context context, String str) {
        Init.init(context);
        synchronized (this) {
            this.c = str;
            this.e++;
            this.a = "";
            this.b = "";
            this.g = false;
            this.f = 0L;
        }
        b();
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

    public String searchContent(String str, String str2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "searchContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$65c98ef5fb2c1de8 = $host$65c98ef5fb2c1de8(str, str2);
            FishCrypto.endHostEntry(null);
            return str$host$65c98ef5fb2c1de8;
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

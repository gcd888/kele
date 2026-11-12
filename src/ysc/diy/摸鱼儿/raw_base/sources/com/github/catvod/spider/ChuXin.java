package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.ChuXin;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
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
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
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
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0481b2;
import com.github.catvod.spider.merge.p022z.C0559r1;
import com.github.catvod.spider.merge.p022z.InterfaceC0476a2;
import com.github.catvod.spider.merge.p022z.Z1;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.utils.C0143;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class ChuXin extends Spider {
    public C0559r1 a;
    public final InterfaceC0476a2 b = new InterfaceC0476a2() { // from class: com.github.catvod.spider.ChuXin.1
        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0476a2
        public void addItem(String str) {
            ChuXin.f.add(str);
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0476a2
        public List<String> getItems() {
            return ChuXin.f;
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0476a2
        public void removeItems(List<String> list) {
            ArrayList arrayList = ChuXin.f;
            arrayList.removeAll(list);
            if (arrayList.isEmpty()) {
                arrayList.addAll(Arrays.asList(ChuXin.e));
            }
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0476a2
        public void resetItems() {
            ArrayList arrayList = ChuXin.f;
            arrayList.clear();
            arrayList.addAll(Arrays.asList(ChuXin.e));
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0476a2
        public void saveConfig() {
            HashMap map = ChuXin.c;
            ChuXin.this.getClass();
            ChuXin.g();
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0476a2
        public /* bridge */ /* synthetic */ void setItems(List list) {
        }
    };

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f23short = {324, 262, 285, 324, 340, 280, 280, 342, 3011, 3004, 2979, 3018, 3002, 3063, 3002, 3044, 3018, 3012, 3004, 2978, 3034, 3060, 2978, 3065, 3009, 3022, 3009, 3063, 3017, 3069, 3007, 3045, 3012, 3010, 3046, 3028, 3043, 3044, 3034, 3044, 2978, 3016, 3038, 3019, 3023, 3036, 3013, 3012, 3050, 3040, 3023, 3045, 3040, 3051, 3033, 3010, 3032, 3051, 3031, 3031, 3000, 3067, 3009, 3003, 3046, 3035, 3005, 3050, 3012, 3037, 3068, 3023, 3005, 3009, 3070, 2997, 2996, 3013, 3005, 3006, 3016, 3043, 3035, 3035, 2982, 3071, 3018, 3010, 3013, 3022, 3003, 3018, 3036, 3064, 3002, 3007, 3020, 2992, 2992, 484, 485, 503, 412, 393, 2104, 2083, 2058, 2100, 2087, 2081, 2108, 2086, 2081, 2086, 21191, 24102, 27671, 25872, 887, 892, 885, 870, 864, 814, 1561, 1538, 1579, 1557, 1542, 1536, 1565, 1543, 1536, 1579, 1561, 1557, 1562, 1557, 1555, 1553, 28552, 20691, 22511, 23310, 2088, 2099, 2074, 2084, 2103, 2097, 2092, 2102, 2097, 2074, 2088, 2084, 2091, 2084, 2082, 2080, 2990, 3005, 3003, 2982, 3004, 3003, 3061, 3207, 3228, 22722, -26100, 2806, 2814, 2787, 2791, 2794, 27818, 28616, 2661, 2686, -30868, 25784, 862, 862, 2972, 3043, 3068, 2965, 3045, 2984, 3045, 3003, 2965, 2971, 3043, 3069, 2949, 2987, 3069, 2982, 2974, 2961, 2974, 2984, 2966, 2978, 3040, 3002, 2971, 2973, 3001, 2955, 3004, 3003, 2949, 3003, 3069, 2967, 2945, 2964, 2960, 2947, 2970, 2971, 2997, 3007, 2960, 3002, 3007, 2996, 2950, 2973, 2951, 2996, 2952, 2952, 3047, 2980, 2974, 3044, 3001, 2948, 3042, 2997, 2971, 2946, 2979, 2960, 3042, 2974, 2977, 3050, 3051, 2970, 3042, 3041, 2967, 3004, 2948, 2948, 3065, 2976, 2965, 2973, 2970, 2961, 3044, 2965, 2947, 2983, 3045, 3040, 2963, 3055, 3055, 2651, 2581, 2564, 2589, 2651, 2591, 2579, 2651, 2946, 3009, 3036, 2968, 1953, 1964, 1953, 2947, 2968, 2993, 2959, 2972, 2970, 2951, 2973, 2970, 2993, 1648, 1635, 1637, 1656, 1634, 1637, 1579, 2406, 2426, 2427, 2418, 2351, 636, 636, 1866, 1873, 22504, 23094, 3104, -30037, 24968, -32006, 21147, 22652, -29592, 2987, 2992, 2969, 2983, 2996, 2994, 2991, 2997, 2994, 2969, 2987, 2983, 2984, 2983, 2977, 2979, 703, 676, 653, 691, 672, 678, 699, 673, 678, 653, 672, 695, 673, 695, 678, 2133, 2126, 2151, 2137, 2122, 2124, 2129, 2123, 2124, 2123, 1041, 1034, 1059, 1053, 1038, 1032, 1045, 1039, 1032, 1059, 1041, 1053, 1042, 1053, 1051, 1049, 28032, 25735, 32109, 29386, 682, 689, 664, 678, 693, 691, 686, 692, 691, 664, 682, 678, 681, 678, 672, 674, 1901, 1918, 1912, 1893, 1919, 1912, 1846, 1486, 1493, 20875, -27835, 2574, 2565, 2572, 2591, 2585, 2647, 2496, 2495, 2464, 2538, 2551, 2498, 2487, 2529, 2496, 2525, 2541, 2524, 2500, 2537, 2519, 2553, 2494, 2532, 2507, 2535, 2509, 2509, 2543, 2554, 2540, 2530, 2555, 2535, 2518, 2548, 2500, 2556, 2499, 2518, 2551, 2511, 2557, 2465, 2530, 2526, 2559, 2556, 2527, 2550, 2526, 2548, 2540, 2538, 2535, 2534, 2533, 2530, 2508, 2502, 2502, 2533, 2518, 2511, 2501, 2526, 2469, 2503, 2507, 2508, 2535, 2540, 2558, 2493, 2531, 2536, 2533, 2537, 2522, 2557, 2535, 2538, 2469, 2506, 2490, 2529, 2494, 2539, 2495, 2537, 2490, 2493, 2489, 2503, 2518, 2551, 2520, 2497, 2486, 2529, 2498, 2529, 2518, 2554, 2532, 2536, 2511, 2526, 2495, 2548, 2489, 2511, 2532, 2521, 2524, 2537, 2483, 2781, 2704, 2691, 2700, 2697, 2699, 2694, 2783, 2788, 2738, 2723, 2725, 2727, 2815, 542, 594, 587, 599, 598, 517, 588, 586, 589, 605, 3124, 3112, 3113, 3104, 3124, 1175, 1170, 1160, 1167, 1761, 1774, 1771, 1762, 1769, 1766, 1770, 1762, 2339, 2350, 2336, 2359, 2351, 2333, 2353, 2347, 2360, 2339, 2336, 2350, 2343, 2333, 2337, 2349, 2356, 2343, 2352, 2887, 2895, 2901, 2886, 2905, 2881, 2063, 2059, 2059, 2616, 2596, 2596, 2592, 2595, 2666, 2687, 2687, 2623, 2592, 2613, 2622, 2686, 2599, 2601, 2609, 2662, 2686, 2611, 2623, 2621, 2687, 2612, 2687, 2612, 2623, 2599, 2622, 2687, 2658, 2656, 2658, 2662, 2687, 2614, 2617, 2595, 2616, 2660, 2619, 2686, 2618, 2592, 2613, 2615, 1684, 1672, 1673, 1664, 1757, 1455, 1455, 1455, 1455, -24729, 21753, 28194, 1330, 1330, 1330, 1330, 2936, 2915, 2940, 2841, 2844, 2844, 485, 483, 494, 480, 486, 20194, 21920, 29885, 21972, -26381, 30027, 24747, 27628, 17329, 27403, 21786, 26114, 20052, -24666, 20667, -31189, -31722, 20422, -29269, 1201, 1212, 1201, 3049, 2987, 2992, 3049, 3065, 2997, 2997, 3067, 2195, 2176, 2182, 2203, 2177, 2182, 2248, 3252, 3289, 3266, 22684, -26030, 2249, 2258, 2002, 29046, 26034, 24827, 1983, 1956, 18606, 21299, 3315, 3212, 3219, 3322, 3210, 3271, 3210, 3284, 3322, 3316, 3212, 3218, 3306, 3268, 3218, 3273, 3313, 3326, 3313, 3271, 3321, 3277, 3215, 3285, 3316, 3314, 3286, 3300, 3283, 3284, 3306, 3284, 3218, 3320, 3310, 3323, 3327, 3308, 3317, 3316, 3290, 3280, 3327, 3285, 3280, 3291, 3305, 3314, 3304, 3291, 3303, 3303, 3208, 3275, 3313, 3211, 3286, 3307, 3213, 3290, 3316, 3309, 3276, 3327, 3213, 3313, 3278, 3205, 3204, 3317, 3213, 3214, 3320, 3283, 3307, 3307, 3222, 3279, 3322, 3314, 3317, 3326, 3211, 3322, 3308, 3272, 3210, 3215, 3324, 3200, 3200, 1492, 1493, 1479, 1452, 1465, 2283, 2215, 2188, 2185, 2281, 2186, 2301, 2211, 2238, 2211, 2235, 2226, 2282, 2188, 2288, 2293, 2186, 2303, 2188, 2185, 2288, 2293, 2186, 2301, 2302, 2188, 2288, 2293, 2186, 2188, 2185, 2281, 2186, 2301, 2238, 2227, 2282, 2188, 2288, 2293, 2186, 2280, 2303, 2187, 2227, 2300, 2302, 2188, 2288, 2293, 2186, 2280, 2188, 2185, 2281, 2186, 2301, 2281, 381, 22082, 23452, 732, 281, 259, 260, 269, 271, 280, 314, 259, 265, 890, 895, 869, 866, 2104, 2109, 2088, 2109, 1815, 1805, 1802, 1795, 1793, 1814, 2854, 2905, 2886, 2865, 2857, 2853, 2826, 2830, 2860, 2825, 2848, 2831, 2904, 2907, 2821, 2887, 2860, 2825, 2840, 2906, 2908, 2855, 2896, 2851, 2855, 2858, 2818, 2877, 2821, 2879, 2910, 2850, 2844, 2833, 2844, 2823, 2879, 2883, 2907, 2860, 2857, 2834, 2887, 2910, 2848, 2846, 2830, 2879, 2907, 2822, 2887, 2910, 2851, 2846, 2826, 2844, 2866, 2877, 2817, 2847, 2863, 2906, 2850, 2842, 2878, 2872, 2876, 2850, 2849, 2822, 2873, 2819, 2911, 2818, 2878, 2857, 2842, 2862, 2827, 2817, 2846, 2834, 2904, 2863, 2911, 2818, 2848, 2855, 2846, 2904, 2857, 2877, 2860, 2829, 2850, 2842, 
    2904, 2833, 2879, 2863, 2847, 2908, 2849, 2906, 2823, 2897, 2853, 2821, 2904, 2823, 2858, 2849, 2847, 2831, 2866, 2833, 2905, 2841, 2830, 2872, 2829, 2859, 2841, 2854, 2850, 2873, 2862, 2853, 2906, 2828, 2843, 2822, 2865, 2847, 2846, 2829, 2857, 2887, 2854, 2834, 2852, 2878, 2878, 2859, 2833, 2853, 2879, 2904, 2843, 2866, 2845, 2852, 2848, 2887, 2875, 2883, 2896, 2846, 2896, 2887, 2860, 2819, 2909, 2817, 2828, 2840, 2897, 2883, 2820, 2848, 2823, 2830, 2826, 2827, 2901, 2698, 2699, 2713, 2802, 2791, 1448, 1483, 1487, 1482, 1410, 1483, 1487, 1482, 1463, 1482, 1482, 1482, 1646, 1551, 1548, 1548, 1604, 1551, 1548, 1548, 1649, 1548, 1548, 1548, 1852, 1824, 1824, 1828, 1831, 1902, 1915, 1915, 1851, 1828, 1841, 1850, 1914, 1827, 1837, 1845, 1890, 1914, 1847, 1851, 1849, 1915, 1840, 1915, 1840, 1851, 1827, 1850, 1915, 1894, 1892, 1894, 1890, 1915, 1842, 1853, 1831, 1852, 1888, 1855, 1914, 1854, 1828, 1841, 1843, 28078, -32454, 30186, 1765, 2096, 2096, 2096, 3292, 3322, 3308, 3323, 3236, 3272, 3310, 3308, 3303, 3325, 982, 1012, 993, 1010, 1015, 1015, 1018, 948, 942, 949, 939, 955, 947, 983, 1010, 1013, 1006, 995, 928, 955, 986, 1013, 1023, 1001, 1012, 1010, 1023, 955, 938, 938, 928, 955, 971, 1010, 995, 1022, 1015, 955, 942, 946, 955, 986, 1003, 1003, 1015, 1022, 972, 1022, 1017, 976, 1010, 1007, 948, 942, 936, 940, 949, 936, 941, 955, 947, 976, 979, 975, 982, 983, 951, 955, 1015, 1010, 1008, 1022, 955, 988, 1022, 1016, 1008, 1012, 946, 955, 984, 1011, 1001, 1012, 1014, 1022, 948, 930, 939, 949, 939, 949, 943, 943, 936, 939, 949, 930, 938, 955, 982, 1012, 1017, 1010, 1015, 1022, 955, 968, 1018, 1021, 1018, 1001, 1010, 948, 942, 936, 940, 949, 936, 941, 2387, 2348, 2355, 2394, 2346, 2407, 2346, 2420, 2394, 2388, 2348, 2354, 2378, 2404, 2354, 2409, 2385, 2398, 2385, 2407, 2393, 2413, 2351, 2421, 2388, 2386, 2422, 2372, 2419, 2420, 2378, 2420, 2354, 2392, 2382, 2395, 2399, 2380, 2389, 2388, 2426, 2416, 2399, 2421, 2416, 2427, 2377, 2386, 2376, 2427, 2375, 2375, 2344, 2411, 2385, 2347, 2422, 2379, 2349, 2426, 2388, 2381, 2412, 2399, 2349, 2385, 2414, 2341, 2340, 2389, 2349, 2350, 2392, 2419, 2379, 2379, 2358, 2415, 2394, 2386, 2389, 2398, 2347, 2394, 2380, 2408, 2346, 2351, 2396, 2336, 2336, 3261, 3327, 3300, 3261, 3038, 3049, 3050, 3049, 3070, 3049, 3070, 323, 257, 282, 323, 339, 287, 287, 337, 2377, 2389, 2388, 2397, 2304, 2962, 2958, 2958, 2954, 2953, 3008, 3029, 3029, 2965, 2954, 2975, 2964, 3028, 2957, 2947, 2971, 3020, 3028, 2969, 2965, 2967, 3029, 2974, 3029, 2974, 2965, 2957, 2964, 3029, 3016, 3018, 3016, 3020, 3029, 2972, 2963, 2953, 2962, 3022, 2961, 3028, 2960, 2954, 2975, 2973, 2326, 2317, 1094, 1099, 1094, 765, 762, 655, 651, 670, 765, 764, 2762, 2787, 2725, 2726, 2727, 2726, 2744, 2748, 2729, 2762, 2787, 2725, 2726, 2727, 2727, 28322, 30620, 2692, 2718, 2724, 2779, 2756, 2733, 2781, 2704, 2781, 2691, 2733, 2723, 2779, 2757, 2749, 2707, 2757, 2718, 2726, 2729, 2726, 2704, 2734, 2714, 2776, 2690, 2723, 2725, 2689, 2739, 2692, 2691, 2749, 2691, 2757, 2735, 2745, 2732, 2728, 2747, 2722, 2723, 2701, 2695, 2728, 2690, 2695, 2700, 2750, 2725, 2751, 2700, 2736, 2736, 2783, 2716, 2726, 2780, 2689, 2748, 2778, 2701, 2723, 2746, 2715, 2728, 2778, 2726, 2713, 2770, 2771, 2722, 2778, 2777, 2735, 2692, 2748, 2748, 2753, 2712, 2733, 2725, 2722, 2729, 2780, 2733, 2747, 2719, 2781, 2776, 2731, 2775, 2775, 2504, 2505, 2523, 2480, 2469, 3057, 3005, 2966, 2963, 3059, 2960, 3047, 3001, 2980, 3001, 2977, 2984, 3056, 2966, 3050, 3055, 2960, 3045, 2966, 2963, 3050, 3055, 2960, 3047, 3044, 2966, 3050, 3055, 2960, 2966, 2963, 3059, 2960, 3047, 2980, 2985, 3056, 2966, 3050, 3055, 2960, 3058, 3045, 2961, 2985, 3046, 3044, 2966, 3050, 3055, 2960, 3058, 2966, 2963, 3059, 2960, 3047, 3059, 1318, 22412, 23122, 1110, 28319, 28157, 2128, 2123, 2105, 2168, 2160, 2157, 2153, 2148, 2640, 2588, 2615, 2610, 2642, 2609, 2630, 2584, 2565, 2584, 2560, 2569, 2641, 2615, 2635, 2638, 2609, 2628, 2615, 2610, 2635, 2638, 2609, 2630, 2629, 2615, 2635, 2638, 2609, 2615, 2610, 2642, 2609, 2630, 2565, 2568, 2641, 2615, 2635, 2638, 2609, 2643, 2628, 2608, 2568, 2631, 2629, 2615, 2635, 2638, 2609, 2643, 2615, 2610, 2642, 2609, 2630, 2642, 2628, 2615, 2608, 2591, 2608, 2623, 2609, 2630, 2643, 2629, 2640, 2627, 2588, 2642, 1622, 1627, 1622, -8291, -9480, 1669, 1686, 1752, 1671, 3083, 3180, 3177, 3081, 3178, 3100, 3081, 1241, 1241, 2093, 2110, 2104, 2085, 2111, 2104, 2111, 1743, 1756, 1754, 1735, 1757, 1754, 1790, 1735, 1741, 1757, 1801, 1860, 1871, 1874, 1887, 1870, 1865, 1912, 1860, 1864, 1865, 1857, 1870, 1856, 858, 856, 847, 850, 852, 853, 2743, 2741, 2720, 2737, 2739, 2747, 2726, 2733, 2711, 2747, 2746, 2720, 2737, 2746, 2720, 1994, 1995, 2010, 1999, 1991, 1986, 2029, 1985, 1984, 2010, 1995, 1984, 2010, 2094, 2089, 2091, 2083, 2053, 2089, 2088, 2098, 2083, 2088, 2098, 784, 771, 773, 792, 770, 773, 801, 792, 786, 770, 477, 462, 456, 469, 463, 456, 463, 3252, 3321, 3314, 3311, 3298, 3315, 3316, 3269, 3321, 3317, 3316, 3324, 3315, 3325, 27181, 21878, 21066, 30183, 27802, 26013, 2627, 2640, 2646, 2635, 2641, 2646, 27934, 25625, 32243, 29268, 25317, 27618, 26458, 22529, 24381, 30864, 25069, 26858, 23053, 949, 943, 22503, 25855, 19625, 13198, -27876, 32420, 27460, -30766, 22820, 25357, 27146, 23628, 29105, 901, 921, 916, 908, 912, 903, 950, 922, 923, 897, 912, 923, 897, 1655, 1633, 1637, 1654, 1639, 1644, 1607, 1643, 1642, 1648, 1633, 1642, 1648};
    public static final HashMap c = new HashMap();
    public static final String[][] d = {new String[]{C0030.m116(f23short, 649, 4, 1433), C0101.m402(f23short, 653, 3, 1982)}, new String[]{C0095.m379(f23short, 656, 4, 1290), C0076.m301(f23short, 660, 6, 2860)}, new String[]{C0137.m545(f23short, 666, 5, 471), C0125.m499(f23short, 671, 4, 504)}};
    public static final String[] e = {C0046.m182(f23short, 681, 3, 370), C0030.m116(f23short, 675, 3, 2144), C0010.m36(f23short, 678, 3, 3195), C0116.m463(f23short, 684, 3, 2542), C0118.m471(f23short, 687, 3, 397)};
    public static final ArrayList f = new ArrayList();

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        String strM193 = C0049.m193(f23short, 0, 8, 363);
        ArrayList arrayList = new ArrayList();
        try {
            arrayList = f(X1.X(FishCrypto.v(C0021.m83(f23short, 8, 91, 2957)) + strM193 + URLEncoder.encode(str, C0049.m193(f23short, 99, 5, 433)), null, d()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.D.b.z(C0030.m116(f23short, 104, 10, 2133), C0118.m471(f23short, 114, 4, 1883), null, arrayList);
        for (String[] strArr : d) {
            arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0098.m390(f23short, 118, 6, 788) + strArr[0], strArr[1], null));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new k(C0026.m102(f23short, 124, 16, 1652), C0079.m314(f23short, 140, 4, 627), AbstractC0302v0.U(), c(), C0097.m386(f23short, 144, 16, 2117)));
        for (String str : f) {
            k kVar = new k();
            kVar.n(C0008.m31(f23short, 160, 7, 3023) + str);
            kVar.o(str);
            kVar.p(b(str));
            kVar.s(C0063.m249(f23short, 167, 4, 3274));
            arrayList2.add(kVar);
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, arrayList2);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String str3 = str2;
        if (str3.equals(C0122.m486(f23short, 171, 5, 2707))) {
            return com.github.catvod.spider.merge.p001b.g.d(C0125.m499(f23short, 176, 6, 2600));
        }
        String strM382 = C0096.m382(f23short, 182, 2, 798);
        if (str3.contains(strM382)) {
            str3 = str3.split(strM382)[0];
        }
        String str4 = FishCrypto.v(C0133.m529(f23short, 184, 91, 3026)) + C0089.m355(f23short, 275, 8, 2676) + str3 + C0089.m355(f23short, 283, 4, 2988);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(str4);
        gVar.h(d());
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strTrim;
        String strTrim2;
        String strM529 = C0133.m529(f23short, 287, 3, 1921);
        try {
            String str = list.get(0);
            if (str.startsWith(C0055.m219(f23short, 290, 10, 3054))) {
                AbstractC0302v0.g0(str, new i(5, this));
                return "";
            }
            if (str.startsWith(C0073.m288(f23short, 300, 7, 1553))) {
                return a(str.substring(7));
            }
            if (str.startsWith(C0085.m339(f23short, 307, 5, 2325))) {
                return e(str.substring(5));
            }
            String[] strArrSplit = str.split(C0009.m33(f23short, 312, 2, 572));
            String str2 = strArrSplit[0];
            String str3 = strArrSplit.length > 1 ? strArrSplit[1] : str2;
            if (str3.contains(strM529)) {
                String[] strArrSplit2 = str3.split(strM529, 2);
                strTrim2 = strArrSplit2[0].trim();
                strTrim = strArrSplit2[1].trim();
            } else {
                strTrim = str3;
                strTrim2 = "";
            }
            k kVar = new k();
            kVar.n(str);
            kVar.o(str3);
            kVar.p("");
            kVar.i(C0008.m31(f23short, 314, 2, 1799));
            kVar.j(strTrim2);
            kVar.l(str3);
            kVar.q(C0107.m427(f23short, 316, 2, 1525));
            kVar.r(strTrim + C0056.m223(f23short, 318, 1, 3076) + str2);
            boolean z = FishCrypto.a;
            N1.d(kVar);
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        } catch (Exception e2) {
            e2.printStackTrace();
            return com.github.catvod.spider.merge.p001b.g.d(C0103.m408(f23short, 319, 6, 333));
        }
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        str.getClass();
        if (str.equals(C0130.m516(f23short, 325, 16, 3014))) {
            final int i = 0;
            InitOrigin.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.u.h
                public final /* synthetic */ ChuXin b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            C0559r1 c0559r1 = this.b.a;
                            c0559r1.getClass();
                            InitOrigin.run(new Z1(c0559r1, 1));
                            break;
                        default:
                            C0559r1 c0559r2 = this.b.a;
                            c0559r2.getClass();
                            InitOrigin.run(new Z1(c0559r2, 0));
                            break;
                    }
                }
            });
            return "";
        }
        if (!str.equals(C0139.m554(f23short, 341, 15, 722))) {
            return "";
        }
        final int i2 = 1;
        InitOrigin.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.u.h
            public final /* synthetic */ ChuXin b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        C0559r1 c0559r1 = this.b.a;
                        c0559r1.getClass();
                        InitOrigin.run(new Z1(c0559r1, 1));
                        break;
                    default:
                        C0559r1 c0559r2 = this.b.a;
                        c0559r2.getClass();
                        InitOrigin.run(new Z1(c0559r2, 0));
                        break;
                }
            }
        });
        return "";
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        int i = Integer.parseInt(str2);
        if (str.equals(C0073.m288(f23short, 356, 10, 2104))) {
            if (i > 1) {
                return com.github.catvod.spider.merge.p001b.g.y(arrayList);
            }
            arrayList.add(new k(C0104.m414(f23short, 366, 16, 1148), C0115.m459(f23short, 382, 4, 1740), AbstractC0302v0.U(), c(), C0125.m499(f23short, 386, 16, 711)));
            for (String str3 : f) {
                k kVar = new k();
                kVar.n(C0043.m169(f23short, 402, 7, 1804) + str3);
                kVar.o(str3);
                kVar.p(b(str3));
                kVar.s(C0032.m126(f23short, 409, 4, 1411));
                arrayList.add(kVar);
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        }
        if (!str.startsWith(C0010.m36(f23short, 413, 6, 2669))) {
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(X1.X(FishCrypto.v(C0093.m368(f23short, 419, 111, 2446)) + C0105.m416(f23short, 530, 8, 2786) + str.substring(6) + C0076.m301(f23short, 538, 6, 2754) + i + C0114.m454(f23short, 544, 10, 568), null, d())).optJSONObject(C0112.m445(f23short, 554, 5, 3143));
            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(C0098.m390(f23short, 559, 4, 1275))) != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                    String strOptString = jSONObject.optString(C0142.m567(f23short, 563, 8, 1671), "");
                    if (!strOptString.isEmpty()) {
                        String strOptString2 = jSONObject.optString(C0143.m570(f23short, 571, 19, 2370), "");
                        String strReplace = !strOptString2.isEmpty() ? strOptString2.replace(C0043.m169(f23short, 590, 6, 2876), C0098.m390(f23short, 596, 3, 2107)) : C0026.m102(f23short, 599, 45, 2640);
                        k kVar2 = new k();
                        kVar2.n(C0090.m358(f23short, 644, 5, 1767) + strOptString);
                        kVar2.o(strOptString);
                        kVar2.p(strReplace);
                        kVar2.s("" + (i2 + 1));
                        arrayList.add(kVar2);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    public static String a(String str) throws Throwable {
        String strM108 = C0028.m108(f23short, 690, 3, 1169);
        String strM33 = C0009.m33(f23short, 693, 8, 3014);
        k kVar = new k();
        kVar.n(C0053.m210(f23short, 701, 7, 2290) + str);
        kVar.o(str + C0050.m199(f23short, 708, 5, 3220));
        kVar.p(b(str));
        kVar.i(C0006.m21(f23short, 713, 2, 2180));
        kVar.j(str);
        kVar.l(str + C0089.m355(f23short, 715, 8, 2034));
        ArrayList arrayList = new ArrayList();
        try {
            Matcher matcher = Pattern.compile(C0119.m473(f23short, 819, 58, 2263)).matcher(X1.X(FishCrypto.v(C0087.m346(f23short, 723, 91, 3261)) + strM33 + URLEncoder.encode(str, C0047.m186(f23short, 814, 5, 1409)), null, d()));
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                if (!TextUtils.isEmpty(strGroup) && !TextUtils.isEmpty(strGroup2)) {
                    if (strGroup.contains(strM108)) {
                        strGroup = strGroup.split(strM108, 2)[1];
                    }
                    arrayList.add(strGroup + C0081.m322(f23short, 877, 1, 345) + strGroup2);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!arrayList.isEmpty()) {
            kVar.q(C0128.m511(f23short, 878, 2, 1119));
            kVar.r(TextUtils.join(C0072.m285(f23short, 880, 1, 767), arrayList));
        }
        boolean z = FishCrypto.a;
        N1.d(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    public static String b(String str) {
        String strM408 = C0103.m408(f23short, 881, 9, 362);
        String strM175 = C0044.m175(f23short, 890, 4, 790);
        String strM33 = C0009.m33(f23short, 894, 4, 2140);
        String strM545 = C0137.m545(f23short, 898, 6, 1892);
        HashMap map = c;
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        try {
            JsonObject jsonObjectC = I0.c(X1.X(String.format(FishCrypto.v(C0056.m223(f23short, 904, 175, 2920)), URLEncoder.encode(str, C0074.m292(f23short, 1079, 5, 2783))), null, d()));
            if (jsonObjectC.has(strM33)) {
                JsonObject asJsonObject = jsonObjectC.getAsJsonObject(strM33);
                if (asJsonObject.has(strM545) && asJsonObject.getAsJsonObject(strM545).has(strM175)) {
                    JsonArray asJsonArray = asJsonObject.getAsJsonObject(strM545).getAsJsonArray(strM175);
                    if (asJsonArray.size() > 0) {
                        JsonObject asJsonObject2 = asJsonArray.get(0).getAsJsonObject();
                        String asString = asJsonObject2.has(strM408) ? asJsonObject2.get(strM408).getAsString() : "";
                        if (!asString.isEmpty()) {
                            String strReplace = asString.replace(C0008.m31(f23short, 1084, 12, 1530), C0101.m402(f23short, 1096, 12, 1596));
                            map.put(str, strReplace);
                            g();
                            return strReplace;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return C0095.m379(f23short, 1108, 45, 1876);
    }

    public static String c() {
        ArrayList arrayList = f;
        if (arrayList.isEmpty()) {
            return C0079.m314(f23short, 1153, 3, 2692);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(arrayList.size(), 4); i++) {
            if (i > 0) {
                sb.append(C0106.m422(f23short, 1156, 1, 1755));
            }
            sb.append((String) arrayList.get(i));
        }
        if (arrayList.size() > 4) {
            sb.append(C0143.m570(f23short, 1157, 3, 2078));
        }
        return sb.toString();
    }

    public static HashMap d() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(C0063.m249(f23short, 1160, 10, 3209), C0006.m21(f23short, 1170, 120, 923));
        mapS.put(C0073.m288(f23short, 1385, 7, 2956), FishCrypto.v(C0056.m223(f23short, 1290, 91, 2333)).concat(C0133.m529(f23short, 1381, 4, 3218)));
        return mapS;
    }

    public static String e(String str) throws Throwable {
        String strTrim = str;
        String strM301 = C0076.m301(f23short, 1392, 8, 364);
        k kVar = new k();
        kVar.n(C0089.m355(f23short, 1400, 5, 2362) + strTrim);
        kVar.o(strTrim);
        kVar.p(C0072.m285(f23short, 1405, 45, 3066));
        kVar.i(C0011.m42(f23short, 1450, 2, 2395));
        String strM379 = C0095.m379(f23short, 1452, 3, 1126);
        if (strTrim.contains(strM379)) {
            String[] strArrSplit = strTrim.split(strM379, 2);
            kVar.j(strArrSplit[0]);
            strTrim = strArrSplit[1].replaceAll(C0107.m427(f23short, 1455, 7, 673), "").replaceAll(C0091.m360(f23short, 1462, 15, 2710), "").trim();
        }
        kVar.l(C0045.m177(f23short, 1477, 4, 2750) + strTrim);
        ArrayList arrayList = new ArrayList();
        try {
            Matcher matcher = Pattern.compile(C0049.m193(f23short, 1577, 58, 3021)).matcher(X1.X(FishCrypto.v(C0047.m186(f23short, 1481, 91, 2794)) + strM301 + URLEncoder.encode(strTrim, C0011.m42(f23short, 1572, 5, 2461)), null, d()));
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                if (!TextUtils.isEmpty(strGroup) && !TextUtils.isEmpty(strGroup2)) {
                    if (strGroup.contains(strM379)) {
                        strGroup = strGroup.split(strM379, 2)[1];
                    }
                    arrayList.add(strGroup + C0043.m169(f23short, 1635, 1, 1282) + strGroup2);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        boolean zIsEmpty = arrayList.isEmpty();
        String strM277 = C0070.m277(f23short, 1636, 2, 1425);
        if (zIsEmpty) {
            kVar.q(strM277);
            kVar.r(C0122.m486(f23short, 1639, 10, 2077));
        } else {
            kVar.q(strM277);
            kVar.r(TextUtils.join(C0135.m539(f23short, 1638, 1, 1141), arrayList));
        }
        boolean z = FishCrypto.a;
        N1.d(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        Matcher matcher = Pattern.compile(C0079.m314(f23short, 1649, 72, 2668)).matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            String strGroup3 = matcher.group(3);
            if (!TextUtils.isEmpty(strGroup) && !TextUtils.isEmpty(strGroup2)) {
                String strM379 = C0095.m379(f23short, 1721, 3, 1654);
                String strB = b(strGroup.contains(strM379) ? strGroup.split(strM379)[0].trim() : strGroup);
                int iLastIndexOf = strGroup3.lastIndexOf(C0089.m355(f23short, 1724, 2, 1952));
                String strTrim = "";
                if (iLastIndexOf > 0) {
                    int iIndexOf = strGroup3.indexOf(C0043.m169(f23short, 1726, 4, 1721), iLastIndexOf);
                    if (iIndexOf < 0) {
                        iIndexOf = strGroup3.length();
                    }
                    strTrim = strGroup3.substring(iLastIndexOf + 1, iIndexOf).replaceAll(C0053.m210(f23short, 1730, 7, 3127), "").trim();
                }
                arrayList.add(new k(com.github.catvod.spider.merge.D.b.C(strGroup2, C0019.m75(f23short, 1737, 2, 1177), strGroup), strGroup, strB, strTrim));
            }
        }
        return arrayList;
    }

    public static void g() {
        try {
            JsonObject jsonObject = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            Iterator it = f.iterator();
            while (it.hasNext()) {
                jsonArray.add((String) it.next());
            }
            jsonObject.add(C0045.m177(f23short, 1739, 7, 2124), jsonArray);
            JsonObject jsonObject2 = new JsonObject();
            for (Map.Entry entry : c.entrySet()) {
                jsonObject2.addProperty((String) entry.getKey(), (String) entry.getValue());
            }
            jsonObject.add(C0014.m54(f23short, 1746, 10, 1710), jsonObject2);
            String strM570 = C0143.m570(f23short, 1756, 14, 1831);
            String string = jsonObject.toString();
            boolean z = FishCrypto.a;
            C0297t1.j(strM570, string);
        } catch (Exception unused) {
        }
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0008.m31(f23short, 1770, 6, 827));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0019.m75(f23short, 1776, 15, 2772));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0019.m75(f23short, 1791, 13, 1966));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0112.m445(f23short, 1804, 11, 2118));
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

    public void init(Context context, String str) {
        super.init(context, str);
        String strM445 = C0112.m445(f23short, 1815, 10, 881);
        String strM182 = C0046.m182(f23short, 1825, 7, 444);
        ArrayList arrayList = f;
        try {
            String strM346 = C0087.m346(f23short, 1832, 14, 3226);
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(strM346);
            if (!strH.isEmpty()) {
                JsonObject jsonObjectC = I0.c(strH);
                arrayList.clear();
                if (jsonObjectC.has(strM182)) {
                    JsonArray asJsonArray = jsonObjectC.getAsJsonArray(strM182);
                    for (int i = 0; i < asJsonArray.size(); i++) {
                        arrayList.add(asJsonArray.get(i).getAsString());
                    }
                }
                if (jsonObjectC.has(strM445)) {
                    JsonObject asJsonObject = jsonObjectC.getAsJsonObject(strM445);
                    for (String str2 : asJsonObject.keySet()) {
                        c.put(str2, asJsonObject.get(str2).getAsString());
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(Arrays.asList(e));
        }
        this.a = new C0559r1(this.b, new C0481b2(C0109.m432(f23short, 1858, 4, 1618), C0105.m416(f23short, 1862, 2, 2473), C0105.m416(f23short, 1864, 6, 2721), C0098.m390(f23short, 1870, 10, 911), C0050.m199(f23short, 1846, 6, 2006), C0137.m545(f23short, 1852, 6, 2594), C0008.m31(f23short, 1880, 6, 2113), false));
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0128.m511(f23short, 1886, 13, 1013));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0090.m358(f23short, 1899, 13, 1540));
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

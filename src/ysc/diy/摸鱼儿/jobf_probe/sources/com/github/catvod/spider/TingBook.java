package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class TingBook extends Spider {
    public static String a = "";

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f94short = {873, 822, 805, 873, 815, 808, 802, 803, 830, 873, 821, 803, 807, 820, 805, 814, 873, 813, 803, 831, 817, 809, 820, 802, 873, 407, 406, 388, 495, 506, 1770, 1708, 1712, 1705, 1704, 1724, 31029, 21706, 21494, 21706, 3030, -27419, 23066, -29160, 25821, 3087, 21253, 27961, 20957, -28609, 1134, 23839, 20925, 21441, 25759, 1444, 1445, 28403, 18997, 19276, 18997, 2559, 2559, 23152, 18375, 27593, 31847, 510, 509, 28459, -25888, 30040, 21234, 2883, 2881, -25265, 31133, 30461, -32504, 3065, 3068, 25740, 25802, 25622, 25670, 2038, 2034, 25835, 23050, 21226, 21150, 2905, 2907, -30904, 17130, 31348, 21628, 380, 369, 18478, 26157, 26319, 26389, 2664, 2668, 23367, 28829, 28671, 20766, 1651, 1652, 23600, 20907, 24290, -29100, 2872, 2878, 22924, 26467, -32120, 21253, 1737, 1736, 23221, -26162, 23420, 31983, 2748, 2800, 2802, 2791, 2806, 2804, 2812, 2785, 2794, 2748, 2725, 2748, 2721, 2748, 2722, 2749, 2811, 2791, 2814, 2815, 2687, 2592, 2620, 2609, 2601, 2687, 2924, 2858, 2870, 2863, 2862, 421, 2256, 2223, 2224, 2216, 2294, 2257, 2267, 2291, 2254, 2247, 2280, 2285, 2286, 2294, 2297, 2295, 2252, 2253, 2290, 2222, 2278, 2268, 2259, 2261, 2263, 2269, 2300, 2268, 2298, 2296, 2294, 2281, 2287, 2271, 2286, 2271, 2297, 2220, 2269, 2262, 2282, 2288, 2253, 2287, 2271, 2217, 2214, 2286, 2216, 2221, 2278, 2280, 2287, 2289, 2214, 2283, 2253, 2278, 2287, 2262, 2222, 2246, 2253, 2286, 2279, 2249, 2225, 2218, 2249, 2286, 2219, 2255, 2260, 2265, 2249, 2269, 2291, 2292, 2249, 2290, 2250, 2286, 2269, 2288, 2244, 2220, 2294, 2264, 2271, 2211, 2211, 2633, 2582, 2565, 2633, 2575, 2568, 2562, 2563, 2590, 2633, 2561, 2563, 2578, 2565, 2574, 2567, 2582, 2578, 2563, 2580, 2579, 2580, 2570, 2633, 2564, 2569, 2569, 2573, 2607, 2562, 2633, 2627, 2581, 2633, 2565, 2574, 2567, 2582, 2578, 2563, 2580, 2607, 2562, 2633, 2627, 2581, 2633, 2578, 2575, 2571, 2563, 2581, 2578, 2567, 2571, 2582, 2633, 2627, 2562, 2632, 2574, 2578, 2571, 2570, 2185, 2184, 2201, 2514, 2507, 2514, 2517, 1850, 2369, 2411, 2401, 2406, 2423, 2431, 2354, 2391, 2400, 2400, 2429, 2400, 2209, 2299, 2279, 2219, 2214, 2214, 2210, 2276, 2237, 2208, 2237, 2213, 2220, 2054, 2143, 2112, 2074, 2055, 2074, 2050, 2059, 2840, 2900, 2905, 2905, 2909, 2843, 2898, 2899, 2882, 2903, 2911, 2906, 2838, 2911, 2907, 2897, 2840, 2911, 2907, 2897, 1183, 1179, 1169, 1197, 1175, 1178, 1154, 1195, 1287, 1356, 1361, 1373, 1371, 1352, 2303, 2300, 2285, 2274, 2210, 2296, 2281, 2292, 2296, 2489, 32544, 21712, 17908, 28514, 24348, -30508, 29497, 24974, 3096, 3156, 3161, 3161, 3165, 3099, 3167, 3160, 3138, 3140, 3161, 2532, 2557, 2495, 2529, 2544, 2550, 2552, 2559, 2544, 2533, 2552, 2558, 2559, 2481, 2557, 2552, 2481, 2544, 2506, 2553, 2531, 2548, 2551, 2508, 1364, 1349, 1347, 1345, 1305, 1493, 1487, 1496, 1499, 1297, 1300, 1402, 1383, 1395, 1303, 1348, 533, 22927, 28650, 2957, 3009, 3011, 3030, 3015, 3013, 3021, 3024, 3035, 2957, 589, 592, 589, 2028, 1962, 1974, 1967, 1966, 605, 558, 2686, 831, 775, 840, 843, 831, 841, 831, 775, 840, 842, 840, 546, 596, 1947, 1947, 2210, 2238, 2238, 2234, 2233, 2288, 3026, 2989, 2994, 2986, 3060, 3027, 3033, 3057, 3020, 3013, 3050, 3055, 3052, 3060, 3067, 3061, 3022, 3023, 3056, 2988, 3044, 3038, 3025, 3031, 3029, 3039, 3070, 3038, 3064, 3066, 3060, 3051, 3053, 3037, 3052, 3037, 3067, 2990, 3039, 3028, 3048, 3058, 3023, 3053, 3037, 2987, 2980, 3052, 2986, 2991, 3044, 3050, 3053, 3059, 2980, 3049, 3023, 3044, 3053, 3028, 2988, 3012, 3023, 3052, 3045, 3019, 2995, 2984, 3019, 3052, 2985, 3021, 3030, 3035, 3019, 3039, 3057, 3062, 3019, 3056, 3016, 3052, 3039, 3058, 3014, 2990, 3060, 3034, 3037, 2977, 2977, 445, 411, 397, 410, 453, 425, 399, 397, 390, 412, 1845, 1815, 1794, 1809, 1812, 1812, 1817, 1879, 1869, 1878, 1864, 1880, 1872, 1839, 1809, 1814, 1820, 1815, 1807, 1803, 1880, 1846, 1836, 1880, 1865, 1864, 1878, 1864, 1859, 1880, 1839, 1809, 1814, 1870, 1868, 1859, 1880, 1792, 1870, 1868, 1873, 1880, 1849, 1800, 1800, 1812, 1821, 1839, 1821, 1818, 1843, 1809, 1804, 1879, 1869, 1867, 1871, 1878, 1867, 1870, 1880, 1872, 1843, 1840, 1836, 1845, 1844, 1876, 1880, 1812, 1809, 1811, 1821, 1880, 1855, 1821, 1819, 1811, 1815, 1873, 1880, 1851, 1808, 1802, 1815, 1813, 1821, 1879, 1865, 1866, 1864, 1878, 1864, 1878, 1864, 1878, 1864, 1880, 1835, 1817, 1822, 1817, 1802, 1809, 1879, 1869, 1867, 1871, 1878, 1867, 1870, 2463, 2458, 2447, 2458, 2518, 2452, 2441, 2450, 2460, 2450, 2453, 2458, 2455, 1235, 1238, 1219, 1238, 1178, 1220, 1221, 1236, 507, 506, 491, 1565, 1565, 661, 649, 649, 653, 654, 711, 2701, 2754, 2688, 2693, 2719, 2712, 2753, 2693, 2712, 2697, 2689, 2743, 2692, 2718, 2697, 2698, 2738, 2769, 2755, 2716, 2688, 2701, 2709, 2755, 2737, 860, 838, 849, 850, 3249, 3244, 3249, 3241, 3232, 588, 1477, 549, 543, 556, 566, 545, 546, 538, 633, 619, 550, 555, 555, 559, 619, 537, 757, 751, 760, 763, 2924, 2849, 2860, 2860, 2856, 2924, 2847, 2855, 2920, 2847, 2925, 2859, 2871, 2862, 2863, 1105, 1035, 1917, 960, 964, 974, 1535, 1533, 1512, 1529, 1531, 1523, 1518, 1509, 1503, 1523, 1522, 1512, 1529, 1522, 1512, 1228, 1229, 1244, 1225, 1217, 1220, 1259, 1223, 1222, 1244, 1229, 1222, 1244, 2497, 2502, 2500, 2508, 2538, 2502, 2503, 2525, 2508, 2503, 2525, 2830, 2929, 2926, 2854, 2865, 2836, 2825, 2862, 2838, 2828, 2833, 2859, 2860, 2934, 2829, 2858, 2817, 2931, 2934, 2871, 2819, 2819, 2835, 2868, 2936, 2824, 2850, 2853, 2864, 2934, 2823, 2855, 2935, 2860, 2836, 2862, 2855, 2864, 2836, 2866, 2864, 2819, 2854, 2923, 2931, 2860, 2857, 2866, 2838, 2864, 2821, 2842, 2834, 2852, 2827, 2839, 2872, 2863, 2833, 2856, 2869, 2855, 2870, 2933, 2822, 2937, 2841, 2866, 2866, 2817, 2838, 2826, 2934, 2842, 2831, 2935, 2827, 2834, 2852, 2827, 2825, 2871, 2832, 2836, 2923, 2831, 2863, 2868, 2826, 2870, 2826, 2931, 2830, 2834, 2850, 2932, 2927, 2832, 2857, 2927, 2923, 2818, 2840, 2837, 2827, 2870, 2937, 2819, 2832, 2863, 2941, 1874, 1864, 1877, 1860, 2424, 2431, 2401, 392, 869, 889, 884, 876, 880, 871, 854, 890, 891, 865, 880, 891, 865, 2941, 2923, 2927, 2940, 2925, 2918, 
    2893, 2913, 2912, 2938, 2923, 2912, 2938};

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return com.github.catvod.spider.merge.p001b.g.y(f(X1.L(b(a + C0112.m445(f94short, 0, 25, 838) + URLEncoder.encode(str, C0116.m463(f94short, 25, 5, 450)) + C0126.m503(f94short, 30, 5, 1732)), "")));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0072.m285(f94short, 35, 1, 1674), C0059.m234(f94short, 36, 4, 2737), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0117.m467(f94short, 40, 1, 3041), C0056.m223(f94short, 41, 4, 1048), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0135.m539(f94short, 45, 1, 3127), C0103.m408(f94short, 46, 4, 2222), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0115.m459(f94short, 50, 1, 1111), C0098.m390(f94short, 51, 4, 1671), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0053.m210(f94short, 55, 2, 1429), C0006.m21(f94short, 57, 4, 1429), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0118.m471(f94short, 61, 2, 2510), C0135.m539(f94short, 63, 4, 2145), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0076.m301(f94short, 67, 2, 463), C0109.m432(f94short, 69, 4, 3209), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0104.m414(f94short, 73, 2, 2930), C0082.m325(f94short, 75, 4, 3202), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0049.m193(f94short, 79, 2, 3016), C0073.m288(f94short, 81, 4, 1244), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0044.m175(f94short, 85, 2, 1991), C0090.m358(f94short, 87, 4, 364), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0109.m432(f94short, 91, 2, 2922), C0050.m199(f94short, 93, 4, 3212), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0030.m116(f94short, 97, 2, 328), C0096.m382(f94short, 99, 4, 1546), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0106.m422(f94short, 103, 2, 2653), C0117.m467(f94short, 105, 4, 2680), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0018.m70(f94short, 109, 2, 1606), C0087.m346(f94short, 111, 4, 2765), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0055.m219(f94short, 115, 2, 2829), C0027.m105(f94short, 117, 4, 570), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0125.m499(f94short, 121, 2, 1788), C0017.m65(f94short, 123, 4, 2516), null));
        ArrayList arrayList2 = new ArrayList();
        try {
            arrayList2 = f(X1.L(b(a + C0126.m503(f94short, 127, 20, 2707)), ""));
        } catch (Exception unused) {
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, arrayList2);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.replace(C0009.m33(f94short, 147, 6, 2640), "").replace(C0116.m463(f94short, 153, 5, 2882), "").split(C0126.m503(f94short, 158, 1, 394));
        int length = strArrSplit.length;
        String strM570 = C0143.m570(f94short, 159, 91, 2206);
        if (length < 2) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(FishCrypto.u(strM570, a + str2));
            gVar.p();
            gVar.h(c());
            return gVar.r();
        }
        try {
            JSONObject jSONObject = new JSONObject(b(a + String.format(C0056.m223(f94short, 250, 64, 2662), strArrSplit[0], strArrSplit[1], Long.valueOf(System.currentTimeMillis() / 1000))));
            String strA = a(jSONObject.optInt(C0130.m516(f94short, 317, 4, 2488), 0), jSONObject.optString(C0137.m545(f94short, 314, 3, 2298), ""));
            if (!strA.isEmpty()) {
                com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
                gVar2.C(FishCrypto.u(strM570, strA));
                gVar2.h(c());
                return gVar2.r();
            }
        } catch (Exception unused) {
        }
        com.github.catvod.spider.merge.p001b.g gVar3 = new com.github.catvod.spider.merge.p001b.g();
        gVar3.C(FishCrypto.u(strM570, a + str2));
        gVar3.p();
        gVar3.h(c());
        return gVar3.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws InterruptedException {
        String strM285;
        int i;
        String strTrim;
        String strM422 = C0106.m422(f94short, 321, 1, 1797);
        String str = list.get(0);
        String strB = "";
        for (int i2 = 0; i2 < 3; i2++) {
            strB = b(a + str);
            if (!strB.contains(C0092.m365(f94short, 322, 12, 2322))) {
                break;
            }
            Thread.sleep(500L);
        }
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(strB, "");
        k kVarR = gVarL.R(C0140.m558(f94short, 334, 13, 2249));
        String strTrim2 = kVarR != null ? kVarR.T().trim() : "";
        if (strTrim2.isEmpty()) {
            k kVarR2 = gVarL.R(C0115.m459(f94short, 347, 8, 2158));
            strTrim2 = kVarR2 != null ? kVarR2.T().trim() : "";
        }
        k kVarR3 = gVarL.R(C0106.m422(f94short, 355, 20, 2870));
        if (kVarR3 == null) {
            kVarR3 = gVarL.R(C0089.m355(f94short, 375, 8, 1270));
        }
        String strD = d(kVarR3);
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        for (k kVar : gVarL.Q(C0118.m471(f94short, 383, 6, 1321))) {
            String strTrim3 = kVar.N().trim();
            k kVarR4 = kVar.R(C0045.m177(f94short, 389, 9, 2188));
            if (kVarR4 != null) {
                k kVarR5 = kVarR4.R(C0130.m516(f94short, 398, 1, 2520));
                strTrim = (kVarR5 != null ? kVarR5.T() : kVarR4.T()).trim();
            } else {
                strTrim = "";
            }
            if (strTrim3.startsWith(C0114.m454(f94short, 399, 2, 859))) {
                str2 = strTrim;
            } else if (strTrim3.startsWith(C0046.m182(f94short, 401, 2, 3023))) {
                str3 = strTrim;
            } else if (strTrim3.startsWith(C0045.m177(f94short, 403, 2, 3203))) {
                str4 = strTrim;
            } else if (strTrim3.startsWith(C0112.m445(f94short, 405, 2, 399))) {
                str5 = strTrim;
            }
        }
        k kVarR6 = gVarL.R(C0085.m339(f94short, 407, 11, 3126));
        String strTrim4 = kVarR6 != null ? kVarR6.T().trim() : "";
        ArrayList arrayList = new ArrayList();
        e(gVarL, arrayList);
        Iterator<E> it = gVarL.Q(C0073.m288(f94short, 418, 24, 2449)).iterator();
        int i3 = 1;
        while (true) {
            boolean zHasNext = it.hasNext();
            strM285 = C0072.m285(f94short, 442, 5, 1316);
            if (!zHasNext) {
                break;
            }
            try {
                String strC = ((k) it.next()).c(C0105.m416(f94short, 447, 4, 1469));
                int iIndexOf = strC.indexOf(strM285);
                if (iIndexOf >= 0) {
                    String strReplaceAll = strC.substring(iIndexOf + 5).replaceAll(C0014.m54(f94short, 451, 6, 1354), "");
                    if (!strReplaceAll.isEmpty() && (i = Integer.parseInt(strReplaceAll)) > i3) {
                        i3 = i;
                    }
                }
            } catch (Exception unused) {
            }
        }
        for (int i4 = 2; i4 <= i3 && i4 <= 200; i4++) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append(str);
                sb.append(str.contains(strM422) ? C0093.m368(f94short, 457, 1, 1378) : strM422);
                sb.append(strM285);
                sb.append(i4);
                e(X1.L(b(sb.toString()), ""), arrayList);
            } catch (Exception unused2) {
            }
        }
        String strJoin = TextUtils.join(C0116.m463(f94short, 458, 1, 566), arrayList);
        com.github.catvod.spider.merge.p001b.k kVar2 = new com.github.catvod.spider.merge.p001b.k();
        kVar2.n(str);
        kVar2.o(strTrim2);
        kVar2.p(strD);
        kVar2.l(strTrim4);
        kVar2.j(str3);
        kVar2.m(str4);
        kVar2.i(str2);
        kVar2.s(str5);
        kVar2.q(C0101.m402(f94short, 459, 2, 2274));
        kVar2.r(strJoin);
        return com.github.catvod.spider.merge.p001b.g.s(kVar2);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(C0116.m463(f94short, 461, 10, 2978) + str + C0073.m288(f94short, 471, 3, 610) + str2 + C0043.m169(f94short, 474, 5, 1986));
        return com.github.catvod.spider.merge.p001b.g.y(f(X1.L(b(sb.toString()), "")));
    }

    public static String a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strTrim = str.replace(C0003.m10(f94short, 479, 2, 513), C0109.m432(f94short, 481, 1, 2641)).trim();
        if (i == 1 || strTrim.matches(C0074.m292(f94short, 482, 11, 867))) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : strTrim.split(C0112.m445(f94short, 493, 2, 638))) {
                try {
                    if (!str2.isEmpty()) {
                        sb.append((char) Integer.parseInt(str2));
                    }
                } catch (Exception unused) {
                    return strTrim;
                }
            }
            strTrim = sb.toString();
        }
        return strTrim.startsWith(C0096.m382(f94short, 495, 2, 1972)) ? C0028.m108(f94short, 497, 6, 2250).concat(strTrim) : strTrim;
    }

    public static String b(String str) {
        return X1.X(FishCrypto.u(C0139.m554(f94short, 503, 91, 2972), str), null, c());
    }

    public static HashMap c() {
        return com.github.catvod.spider.merge.D.b.s(C0009.m33(f94short, 594, 10, 488), C0003.m10(f94short, 604, 111, 1912));
    }

    public static String d(k kVar) {
        if (kVar == null) {
            return "";
        }
        String strC = kVar.c(C0095.m379(f94short, 715, 13, 2555));
        if (strC.isEmpty()) {
            strC = kVar.c(C0073.m288(f94short, 728, 8, 1207));
        }
        if (strC.isEmpty()) {
            strC = kVar.c(C0125.m499(f94short, 736, 3, 392));
        }
        if (strC.isEmpty()) {
            return "";
        }
        return strC.startsWith(C0006.m21(f94short, 739, 2, 1586)) ? C0056.m223(f94short, 741, 6, 765).concat(strC) : strC;
    }

    public static void e(com.github.catvod.spider.merge.f0.g gVar, ArrayList arrayList) {
        int iLastIndexOf;
        for (k kVar : gVar.Q(C0091.m360(f94short, 747, 25, 2796))) {
            String strC = kVar.c(C0053.m210(f94short, 772, 4, 820));
            String strTrim = kVar.T().trim();
            String strTrim2 = kVar.c(C0028.m108(f94short, 776, 5, 3269)).trim();
            if (!TextUtils.isEmpty(strTrim2) && (iLastIndexOf = strTrim2.lastIndexOf(C0074.m292(f94short, 781, 1, 620))) >= 0 && iLastIndexOf < strTrim2.length() - 1) {
                strTrim = strTrim2.substring(iLastIndexOf + 1).trim();
            }
            if (!strC.isEmpty() && !strTrim.isEmpty()) {
                arrayList.add(strTrim + C0043.m169(f94short, 782, 1, 1505) + strC);
            }
        }
    }

    public static ArrayList f(com.github.catvod.spider.merge.f0.g gVar) {
        k kVarR;
        ArrayList arrayList = new ArrayList();
        for (k kVar : gVar.Q(C0140.m558(f94short, 783, 15, 580))) {
            try {
                String strC = kVar.c(C0003.m10(f94short, 798, 4, 669));
                if (strC.matches(C0017.m65(f94short, 802, 15, 2883)) && (kVarR = kVar.R(C0092.m365(f94short, 817, 2, 1081))) != null) {
                    String strTrim = kVarR.T().trim();
                    String strTrim2 = "";
                    int iIndexOf = strTrim.indexOf(C0128.m511(f94short, 819, 1, 1793));
                    if (iIndexOf > 0) {
                        strTrim2 = strTrim.substring(0, iIndexOf).trim();
                        strTrim = strTrim.substring(iIndexOf + 1).trim();
                    }
                    String strD = d(kVar.R(C0103.m408(f94short, 820, 3, 937)));
                    if (!strTrim.isEmpty()) {
                        arrayList.add(new com.github.catvod.spider.merge.p001b.k(strC, strTrim, strD, strTrim2));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0081.m322(f94short, 823, 15, 1436));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0116.m463(f94short, 838, 13, 1192));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0050.m199(f94short, 851, 11, 2473));
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
        Init.init(context);
        a = FishCrypto.v(C0093.m368(f94short, 862, 111, 2880));
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString(C0081.m322(f94short, 973, 4, 1825), jSONObject.optString(C0115.m459(f94short, 977, 3, 2317), ""));
                if (!TextUtils.isEmpty(strOptString)) {
                    a = strOptString;
                }
            } catch (Exception unused) {
                a = str;
            }
        }
        if (a.endsWith(C0050.m199(f94short, 980, 1, 423))) {
            a = com.github.catvod.spider.merge.D.b.g(a, 1, 0);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0003.m10(f94short, 981, 13, 789));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0059.m234(f94short, 994, 13, 2830));
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

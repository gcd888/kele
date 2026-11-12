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
        return com.github.catvod.spider.merge.p001b.g.y(f(X1.L(b(a + "/pc/index/search/keyword/" + URLEncoder.encode(str, "UTF-8") + ".html"), "")));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("6", "玄幻奇幻", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("7", "都市言情", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("8", "宫斗女频", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("9", "官场商战", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("10", "武侠仙侠", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("11", "刑侦推理", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("12", "探险科幻", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("13", "重生穿越", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("14", "恐怖惊悚", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("15", "文学历史", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("31", "评书相声", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("49", "两性情感", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("51", "儿童文学", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("52", "国学启蒙", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("53", "家教育儿", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("54", "卡通动画", null));
        ArrayList arrayList2 = new ArrayList();
        try {
            arrayList2 = f(X1.L(b(a + "/category/6/2/1.html"), ""));
        } catch (Exception unused) {
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, arrayList2);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.replace("/play/", "").replace(".html", "").split("/");
        int length = strArrSplit.length;
        String strM570 = "N1.6hOEmPYvsphgiRSl0xBMKICbBdfhwqApAg2CHtnSqA78p63xvqo8uSxqH0XSpyW/4Wp5QJGWCmjWlTpCnZ2hFA==";
        if (length < 2) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(FishCrypto.u(strM570, a + str2));
            gVar.p();
            gVar.h(c());
            return gVar.r();
        }
        try {
            JSONObject jSONObject = new JSONObject(b(a + String.format("/pc/index/getchapterurl/bookId/%s/chapterId/%s/timestamp/%d.html", strArrSplit[0], strArrSplit[1], Long.valueOf(System.currentTimeMillis() / 1000))));
            String strA = a(jSONObject.optInt("jsjm", 0), jSONObject.optString("src", ""));
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
        String strM422 = "?";
        String str = list.get(0);
        String strB = "";
        for (int i2 = 0; i2 < 3; i2++) {
            strB = b(a + str);
            if (!strB.contains("System Error")) {
                break;
            }
            Thread.sleep(500L);
        }
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(strB, "");
        k kVarR = gVarL.R("h2.book-title");
        String strTrim2 = kVarR != null ? kVarR.T().trim() : "";
        if (strTrim2.isEmpty()) {
            k kVarR2 = gVarL.R("h1.title");
            strTrim2 = kVarR2 != null ? kVarR2.T().trim() : "";
        }
        k kVarR3 = gVarL.R(".book-detail img.img");
        if (kVarR3 == null) {
            kVarR3 = gVarL.R("img[alt]");
        }
        String strD = d(kVarR3);
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        for (k kVar : gVarL.Q(".extra")) {
            String strTrim3 = kVar.N().trim();
            k kVarR4 = kVar.R("span.text");
            if (kVarR4 != null) {
                k kVarR5 = kVarR4.R("a");
                strTrim = (kVarR5 != null ? kVarR5.T() : kVarR4.T()).trim();
            } else {
                strTrim = "";
            }
            if (strTrim3.startsWith("类型")) {
                str2 = strTrim;
            } else if (strTrim3.startsWith("主播")) {
                str3 = strTrim;
            } else if (strTrim3.startsWith("原著")) {
                str4 = strTrim;
            } else if (strTrim3.startsWith("状态")) {
                str5 = strTrim;
            }
        }
        k kVarR6 = gVarL.R(".book-intro");
        String strTrim4 = kVarR6 != null ? kVarR6.T().trim() : "";
        ArrayList arrayList = new ArrayList();
        e(gVarL, arrayList);
        Iterator<E> it = gVarL.Q("ul.pagination li a[href]").iterator();
        int i3 = 1;
        while (true) {
            boolean zHasNext = it.hasNext();
            strM285 = "page=";
            if (!zHasNext) {
                break;
            }
            try {
                String strC = ((k) it.next()).c("href");
                int iIndexOf = strC.indexOf(strM285);
                if (iIndexOf >= 0) {
                    String strReplaceAll = strC.substring(iIndexOf + 5).replaceAll("[^0-9]", "");
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
                sb.append(str.contains(strM422) ? "&" : strM422);
                sb.append(strM285);
                sb.append(i4);
                e(X1.L(b(sb.toString()), ""), arrayList);
            } catch (Exception unused2) {
            }
        }
        String strJoin = TextUtils.join("#", arrayList);
        com.github.catvod.spider.merge.p001b.k kVar2 = new com.github.catvod.spider.merge.p001b.k();
        kVar2.n(str);
        kVar2.o(strTrim2);
        kVar2.p(strD);
        kVar2.l(strTrim4);
        kVar2.j(str3);
        kVar2.m(str4);
        kVar2.i(str2);
        kVar2.s(str5);
        kVar2.q("六月");
        kVar2.r(strJoin);
        return com.github.catvod.spider.merge.p001b.g.s(kVar2);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("/category/" + str + "/2/" + str2 + ".html");
        return com.github.catvod.spider.merge.p001b.g.y(f(X1.L(b(sb.toString()), "")));
    }

    public static String a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strTrim = str.replace("\\/", "/").trim();
        if (i == 1 || strTrim.matches("\\d+(\\*\\d+)+")) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : strTrim.split("\\*")) {
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
        return strTrim.startsWith("//") ? "https:".concat(strTrim) : strTrim;
    }

    public static String b(String str) {
        return X1.X(FishCrypto.u("N1.6hOEmPYvsphgiRSl0xBMKICbBdfhwqApAg2CHtnSqA78p63xvqo8uSxqH0XSpyW/4Wp5QJGWCmjWlTpCnZ2hFA==", str), null, c());
    }

    public static HashMap c() {
        return com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
    }

    public static String d(k kVar) {
        if (kVar == null) {
            return "";
        }
        String strC = kVar.c("data-original");
        if (strC.isEmpty()) {
            strC = kVar.c("data-src");
        }
        if (strC.isEmpty()) {
            strC = kVar.c("src");
        }
        if (strC.isEmpty()) {
            return "";
        }
        return strC.startsWith("//") ? "https:".concat(strC) : strC;
    }

    public static void e(com.github.catvod.spider.merge.f0.g gVar, ArrayList arrayList) {
        int iLastIndexOf;
        for (k kVar : gVar.Q("a.list-item[href^=/play/]")) {
            String strC = kVar.c("href");
            String strTrim = kVar.T().trim();
            String strTrim2 = kVar.c("title").trim();
            if (!TextUtils.isEmpty(strTrim2) && (iLastIndexOf = strTrim2.lastIndexOf(" ")) >= 0 && iLastIndexOf < strTrim2.length() - 1) {
                strTrim = strTrim2.substring(iLastIndexOf + 1).trim();
            }
            if (!strC.isEmpty() && !strTrim.isEmpty()) {
                arrayList.add(strTrim + "$" + strC);
            }
        }
    }

    public static ArrayList f(com.github.catvod.spider.merge.f0.g gVar) {
        k kVarR;
        ArrayList arrayList = new ArrayList();
        for (k kVar : gVar.Q("a[href^=/book/]")) {
            try {
                String strC = kVar.c("href");
                if (strC.matches("/book/\\d+\\.html") && (kVarR = kVar.R("h2")) != null) {
                    String strTrim = kVarR.T().trim();
                    String strTrim2 = "";
                    int iIndexOf = strTrim.indexOf("|");
                    if (iIndexOf > 0) {
                        strTrim2 = strTrim.substring(0, iIndexOf).trim();
                        strTrim = strTrim.substring(iIndexOf + 1).trim();
                    }
                    String strD = d(kVar.R("img"));
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

    public void init(Context context, String str) {
        Init.init(context);
        a = FishCrypto.v("N1.fqTInVLQkl6MjA36wCCSt8Hbep6Gg7lTngpTrpCf+3lirVpEZRdKWxoQhugv5F9YrrAVJ6ZO7KRdKIwPT+OotJvJ3NRb4/Pi/+BXUKv9CPo=");
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("site", jSONObject.optString("url", ""));
                if (!TextUtils.isEmpty(strOptString)) {
                    a = strOptString;
                }
            } catch (Exception unused) {
                a = str;
            }
        }
        if (a.endsWith("/")) {
            a = com.github.catvod.spider.merge.D.b.g(a, 1, 0);
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
}

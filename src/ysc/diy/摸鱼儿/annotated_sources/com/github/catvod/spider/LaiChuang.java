package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
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
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class LaiChuang extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f64short = {3000, 2537, 2552, 2539, 2541, 575, 568, 570, 562, 797, 786, 773, 830, 803, 818, 826, 804, 2845, 2832, 1769, 1766, 1770, 1762, 1242, 1237, 1232, 1224, 1241, 1230, 1231, 1188, 1187, 1193, 1192, 1205, 548, 545, 571, 572, 2864, 2849, 2866, 2868, 2592, 2599, 2605, 2604, 2609, 1087, 1080, 1082, 1074, 861, 856, 834, 837, 2516, 2501, 2520, 2516, 2350, 2367, 2361, 2363, 1039, 1049, 1053, 1038, 1055, 1044, 843, 846, 852, 851, 21663, 22913, 30067, -31197, -32209, 27740, 21245, -30999, -2880, -32709, 22987, 26798, 23226, 17690, 30067, -31197, 784, 784, 784, 1012, 997, 1014, 1015, 993, 1303, 1296, 1294, 1355, 1372, 1357, 1355, 1344, 1382, 1373, 1372, 1357, 1368, 1360, 1365, 3281, 3280, 3265, 3284, 3292, 3289, 890, 887, 1220, 1220, 1220, 3296, 3311, 3299, 3307, 1261, 1248, 1550, 1551, 1566, 1547, 1539, 1542, 2233, 2208, 2219, 3026, 3019, 3009, 3060, 3043, 3051, 3047, 3060, 3053, 3061, 609, 637, 633, 618, 1394, 1377, 1398, 1394, 2476, 2478, 2489, 2466, 2495, 2114, 2127, 2132, 2115, 2117, 2130, 2121, 2132, 3285, 3288, 3281, 3268, 3131, 3127, 3126, 3116, 3133, 3126, 3116, 2583, 2571, 2577, 2582, 2567, 2561, 2583, 3018, 3039, 3014, 3036, 3008, 3019, 3018, 3036, 1666, 1678, 1669, 1668, 30476, -31652, 2718, 2697, 2692, 2717, 2701, 297, 297, 297, 1986, 2003, 2005, 2007, 2479, 2482, 2495, 436, 425, 447, 446, 425, 877, 866, 879, 893, 893, 1170, 1153, 1174, 1170, 1486, 1475, 1484, 1477, 2194, 2190, 2186, 2201, 1866, 1864, 1885, 1868, 1870, 1862, 1883, 1872, 2061, 2076, 2074, 2072, 2078, 2066, 2056, 2067, 2057, 2566, 2589, 2566, 2579, 2590, 804, 801, 827, 828, 3132, 3123, 3134, 3116, 3116, 29940, 24324, 1044, 1031, 1040, 1044, 20509, 21527, 2909, 2896, 2911, 2902, -32453, -32554, 1721, 1701, 1697, 1714, 22344, 18369, 21894, -27642, 576, 265, 260, 1800, 1799, 1803, 1795, 2762, 2771, 2777, 1800, 1823, 1815, 1819, 1800, 1809, 1801, 1991, 1989, 2002, 1991, 2006, 1989, 2002, 3190, 3194, 3195, 3169, 3184, 3181, 3169, 2043, 2044, 2018, 2911, 2898, 2902, 2899, 2898, 2885, 2884, 2735, 2727, 2742, 2730, 2733, 2726, 1399, 1397, 1380, 466, 461, 465, 470, 2612, 2617, 2610, 2607, 2437, 2473, 2472, 2482, 2467, 2472, 2482, 2539, 2450, 2495, 2486, 2467, 1061, 1076, 1076, 1064, 1069, 1063, 1061, 1072, 1069, 1067, 1066, 1131, 1070, 1079, 1067, 1066, 1151, 1124, 1063, 1068, 1061, 1078, 1079, 1057, 1072, 1145, 1073, 1072, 1058, 1129, 1148, 3264, 3292, 3292, 3288, 3240, 2052, 2056, 2057, 2068, 2066, 2058, 2050, 3107, 3112, 3125, 3129, -28881, 23795, -29798, 26089, -27569, 27084, -28676, -27607, 3317, 3319, 3298, 3315, 3313, 3321, 3300, 3311, 3285, 3321, 3320, 3298, 3315, 3320, 3298, 2961, 2963, 2948, 2969, 2975, 2974, 1388, 1404, 1402, 1393, 1402, 2529, 2544, 2531, 2544, 2556, 2530, 1028, 1033, 1026, 1055, 2614, 2617, 2620, 2608, 2619, 2593, 2570, 2593, 2620, 2616, 2608, 1523, 1535, 1534, 1508, 1525, 1512, 1508, 786, 798, 799, 770, 772, 796, 788, 1523, 1524, 1505, 1524, 1525, 1523, 746, 661, 650, 739, 711, 713, 655, 747, 745, 720, 717, 713, 723, 710, 655, 749, 732, 739, 745, 734, 705, 706, 755, 718, 705, 739, 742, 748, 751, 657, 756, 747, 726, 741, 706, 766, 732, 712, 741, 744, 655, 717, 655, 719, 757, 722, 744, 712, 742, 753, 655, 663, 758, 705, 748, 707, 759, 723, 719, 750, 739, 727, 725, 705, 750, 713, 651, 734, 656, 651, 720, 756, 663, 707, 712, 715, 711, 718, 719, 711, 718, 715, 706, 765, 759, 719, 710, 718, 656, 749, 727, 707, 669, 724, 733, 764, 756, 709, 764, 752, 750, 743, 705, 723, 660, 747, 755, 657, 706, 753, 665, 2830, 2929, 2926, 2930, 2851, 2834, 2852, 2865, 2866, 2929, 2852, 2832, 2835, 2859, 2865, 2829, 2836, 2828, 2828, 2854, 2870, 2855, 2857, 2869, 2868, 2923, 2831, 2832, 2874, 2839, 2870, 2856, 2829, 2831, 2841, 2928, 2923, 2934, 2874, 2834, 2826, 2873, 2830, 2818, 2817, 2837, 2870, 2858, 2833, 2855, 2851, 2860, 2839, 2832, 2836, 2934, 2923, 2855, 2817, 2850, 2851, 2860, 2831, 2841, 2930, 2855, 2842, 2874, 2923, 2873, 2927, 2930, 2923, 2851, 2840, 2868, 2842, 2860, 2853, 2853, 2825, 2836, 2857, 2831, 2867, 2819, 2871, 2835, 2867, 2829, 2872, 2857, 2860, 2851, 2867, 2867, 2868, 2865, 2868, 2817, 2868, 2853, 2820, 2930, 2927, 2836, 2817, 2832, 2869, 2829, 2941, 1838, 1873, 1870, 1834, 1800, 1829, 1867, 1881, 1800, 1877, 1842, 1871, 1805, 1877, 1836, 1830, 1878, 1810, 1874, 1825, 1813, 1826, 1839, 1834, 1848, 1844, 1832, 1813, 1867, 1802, 1831, 1877, 1813, 1833, 1807, 1875, 1837, 1809, 1839, 1804, 1793, 1813, 1876, 1807, 1797, 1800, 1872, 1812, 1875, 1836, 1836, 1879, 1836, 1797, 1814, 1848, 1847, 1833, 1849, 1880, 1796, 1839, 1833, 1806, 1837, 1841, 1817, 1805, 1871, 1875, 1818, 1827, 1834, 1798, 1880, 1806, 1828, 1797, 1832, 1817, 1881, 1826, 1807, 1840, 1799, 1830, 1818, 1850, 1841, 1885, 1885, 2947, 3068, 3043, 2980, 2979, 2944, 2947, 2951, 3061, 2999, 2996, 2951, 3064, 3000, 3068, 2980, 2978, 3046, 2949, 2974, 3005, 2975, 3002, 3005, 2973, 2954, 3003, 2945, 3068, 3065, 2951, 3068, 2969, 2971, 2991, 2988, 2958, 3000, 2972, 3071, 2975, 3065, 2950, 3070, 2958, 2981, 2953, 2979, 2946, 2977, 2977, 2972, 2970, 2944, 2999, 2947, 2970, 3004, 2978, 2988, 2952, 2979, 2970, 2990, 2980, 3068, 3068, 2947, 2987, 3070, 3002, 2965, 3071, 3005, 3061, 2959, 2948, 2999, 2987, 2982, 3001, 3005, 2985, 2972, 2953, 3071, 2964, 3046, 3007, 2952, 2972, 2947, 2948, 3069, 3066, 2976, 3060, 3060, 2955, 2953, 3065, 2978, 2986, 3004, 3000, 2986, 2944, 3004, 3002, 3004, 3068, 2980, 3001, 3068, 3065, 2980, 3046, 2983, 2965, 2976, 2954, 3007, 3066, 2999, 2959, 2968, 2968, 2964, 3002, 3066, 2950, 2982, 2948, 2972, 2977, 2982, 2990, 2968, 2952, 2974, 3000, 2982, 2944, 2981, 2951, 3001, 2967, 2988, 2952, 2956, 2951, 3064, 2972, 3056, 3056, 2979, 2977, 2999, 3003, 2984, 3003, 2989, 2981, 2983, 2976, 2985, 2803, 2807, 1602, 1607, 1618, 1607, -32311, 21013, 27538, 24126, 27119, 28657, 17061, 30437, 2746, 2733, 2733, 2736, 2733, -29959, 22821, 24738, 21774, 24222, -30070, -28876, 23784, 22191, 23798, -29823, 22948, 23379, -28857, -31444, 22256, 23735, 22254, 
    21436, 28157, 17984, 29184, -30857, 21675, 24300, 21685, 17856, 22048, 28609, 28521, -31326, 22142, 28665, 23125, 27924, 23609, 22112, -30810, 21626, -32505, 26290, 22608, 20790, 21441, -30763, -29083, 23993, 25662, 20882, 21507, 21619, 25625, -28034, 31837, 2948, 2949, 2964, 2945, 2953, 2956, 2979, 2959, 2958, 2964, 2949, 2958, 2964, 2730, 2741, 2744, 610, 613, 623, 622, 627, 1793, 1814, 1819, 1794, 1810, 2091, 2087, 2092, 2093, 1048, 1039, 1049, 1029, 1030, 1052, 1039, 572, 571, 569, 561, 535, 571, 570, 544, 561, 570, 544, 2632, 2639, 2637, 2629, 2678, 2633, 2628, 2629, 2639, 2659, 2639, 2638, 2644, 2629, 2638, 2644, 867, 895, 895, 891, 1458, 1806, 1827, 1835, 1793, 1834, 1847, 1827, 1836, 1829, 1890, 1831, 1850, 1846, 1890, 1830, 1831, 1825, 1840, 1851, 1842, 1846, 1890, 1828, 1827, 1835, 1838, 1831, 1830, 2753, 2768, 2761, 3181, 3178, 3188, 2906, 2935, 2943, 2901, 2942, 2915, 2935, 2936, 2929, 2870, 2931, 2936, 2933, 2916, 2927, 2918, 2914, 2931, 2930, 2870, 2931, 2926, 2914, 2870, 2916, 2931, 2919, 2915, 2943, 2916, 2931, 2917, 2870, 2935, 2870, 2932, 2916, 2943, 2930, 2929, 2931, 2870, 2883, 2884, 2906, 1722, 3147, 3174, 3182, 3140, 3183, 3186, 3174, 3177, 3168, 3111, 3170, 3199, 3187, 3111, 3182, 3188, 3111, 3170, 3178, 3191, 3187, 3198, 1860, 1880, 1877, 1869, 1873, 1862, 1911, 1883, 1882, 1856, 1873, 1882, 1856, 2891, 2909, 2905, 2890, 2907, 2896, 2939, 2903, 2902, 2892, 2909, 2902, 2892, 531, 517, 513, 530, 515, 520, 547, 527, 526, 532, 517, 526, 532};
    public String a = "";

    final class Pid {
        public final String a;
        public final String b;
        public final int c;
        public final String d;

        public Pid(int i, String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = str3;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0018.m70(f64short, 0, 1, 2953));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        String strM358 = C0090.m358(f64short, 1, 4, 2457);
        String strM292 = C0074.m292(f64short, 5, 4, 599);
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONArray jSONArrayOptJSONArray = b(strM292, new JSONObject().put(strM358, C0014.m54(f64short, 9, 3, 883))).optJSONArray(C0116.m463(f64short, 12, 5, 855));
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString(C0019.m75(f64short, 17, 2, 2932));
                        arrayList.add(new com.github.catvod.spider.merge.p001b.b(strOptString, jSONObjectOptJSONObject.optString(C0101.m402(f64short, 19, 4, 1671)), null));
                        if (z) {
                            a(linkedHashMap, strOptString, jSONObjectOptJSONObject.optJSONObject(C0059.m234(f64short, 23, 7, 1212)));
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            arrayList2 = c(b(strM292, new JSONObject().put(strM358, C0081.m322(f64short, 30, 5, 1229))).optJSONArray(C0044.m175(f64short, 35, 4, 584)));
        } catch (Exception unused2) {
        }
        return com.github.catvod.spider.merge.p001b.g.A(arrayList, arrayList2, linkedHashMap);
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        try {
            return com.github.catvod.spider.merge.p001b.g.y(c(b(C0045.m177(f64short, 48, 4, 1111), new JSONObject().put(C0059.m234(f64short, 39, 4, 2880), C0006.m21(f64short, 43, 5, 2633))).optJSONArray(C0079.m314(f64short, 52, 4, 817))));
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        String str3 = str;
        try {
            JSONObject jSONObject = new JSONObject();
            String strM108 = C0028.m108(f64short, 56, 4, 2464);
            if (str3 == null) {
                str3 = "";
            }
            JSONObject jSONObjectPut = jSONObject.put(strM108, str3);
            String strM390 = C0098.m390(f64short, 60, 4, 2398);
            int iMax = 1;
            try {
                iMax = Math.max(1, Integer.parseInt(str2));
            } catch (Exception unused) {
            }
            return com.github.catvod.spider.merge.p001b.g.y(c(b(C0021.m83(f64short, 64, 6, 1148), jSONObjectPut.put(strM390, iMax)).optJSONArray(C0090.m358(f64short, 70, 4, 807))));
        } catch (Exception unused2) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String str3 = str2;
        String strM432 = C0109.m432(f64short, 74, 16, 3020);
        Pid pid = null;
        if (str3 != null) {
            try {
                String[] strArrSplit = str3.split(C0047.m186(f64short, 90, 3, 848), 4);
                if (strArrSplit.length == 4) {
                    try {
                        pid = new Pid(Integer.parseInt(strArrSplit[2]), strArrSplit[0], strArrSplit[1], strArrSplit[3]);
                    } catch (NumberFormatException unused) {
                    }
                }
            } catch (Exception unused2) {
                com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.C("");
                gVar.q(0);
                gVar.l(strM432);
                return gVar.r();
            }
        }
        String strM545 = C0137.m545(f64short, 93, 5, 900);
        String strM486 = C0122.m486(f64short, 98, 3, 1378);
        if (pid == null) {
            if (str3 == null) {
                str3 = "";
            }
            JSONObject jSONObjectF = f(-1, "", str3, "");
            String strOptString = jSONObjectF.optString(strM486);
            if (!TextUtils.isEmpty(strOptString)) {
                return e(jSONObjectF.optInt(strM545, 1), str, str3, strOptString);
            }
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C("");
            gVar2.q(0);
            gVar2.l(strM432);
            return gVar2.r();
        }
        String strValueOf = String.valueOf(pid.c + 1);
        JSONObject jSONObjectF2 = f(pid.c, pid.b, pid.d, pid.a);
        String strOptString2 = jSONObjectF2.optString(strM486);
        if (TextUtils.isEmpty(strOptString2) && jSONObjectF2.optBoolean(C0112.m445(f64short, 101, 12, 1337), true)) {
            try {
                b(C0044.m175(f64short, 113, 6, 3253), new JSONObject().put(C0028.m108(f64short, 119, 2, 787), pid.b));
            } catch (Exception unused3) {
            }
            jSONObjectF2 = f(pid.c, pid.b, pid.d, pid.a);
            strOptString2 = jSONObjectF2.optString(strM486);
        }
        if (!TextUtils.isEmpty(strOptString2)) {
            return e(jSONObjectF2.optInt(strM545, 1), str, strValueOf, strOptString2);
        }
        com.github.catvod.spider.merge.p001b.g gVar3 = new com.github.catvod.spider.merge.p001b.g();
        gVar3.C("");
        gVar3.q(0);
        gVar3.l(strM432);
        return gVar3.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        JSONArray jSONArrayOptJSONArray;
        String str;
        String strM390 = C0098.m390(f64short, 121, 3, 1248);
        String strM301 = C0076.m301(f64short, 124, 4, 3214);
        String strM75 = C0019.m75(f64short, 128, 2, 1156);
        if (list == null || list.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        String strTrim = list.get(0) == null ? "" : list.get(0).trim();
        try {
            try {
                JSONObject jSONObjectB = b(C0098.m390(f64short, 130, 6, 1642), new JSONObject().put(strM75, strTrim));
                JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(C0103.m408(f64short, 136, 3, 2255));
                if (jSONObjectOptJSONObject == null) {
                    return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
                }
                k kVar = new k();
                kVar.n(TextUtils.isEmpty(jSONObjectOptJSONObject.optString(strM75)) ? strTrim : jSONObjectOptJSONObject.optString(strM75));
                kVar.o(jSONObjectOptJSONObject.optString(strM301));
                kVar.p(jSONObjectOptJSONObject.optString(C0085.m339(f64short, 139, 3, 2978)));
                kVar.s(jSONObjectOptJSONObject.optString(C0072.m285(f64short, 142, 7, 2950)));
                kVar.u(jSONObjectOptJSONObject.optString(C0091.m360(f64short, 149, 4, 536)));
                kVar.k(jSONObjectOptJSONObject.optString(C0140.m558(f64short, 153, 4, 1299)));
                kVar.j(jSONObjectOptJSONObject.optString(C0009.m33(f64short, 157, 5, 2509)));
                kVar.m(jSONObjectOptJSONObject.optString(C0107.m427(f64short, 162, 8, 2086)));
                kVar.i(jSONObjectOptJSONObject.optString(C0117.m467(f64short, 170, 4, 3233)));
                kVar.l(jSONObjectOptJSONObject.optString(C0050.m199(f64short, 174, 7, 3160)));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArrayOptJSONArray2 = jSONObjectB.optJSONArray(C0006.m21(f64short, 181, 7, 2660));
                if (jSONArrayOptJSONArray2 != null) {
                    int i = 0;
                    while (i < jSONArrayOptJSONArray2.length()) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i);
                        if (jSONObjectOptJSONObject2 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(C0116.m463(f64short, 188, 8, 2991))) == null || jSONArrayOptJSONArray.length() == 0) {
                            str = strM301;
                        } else {
                            String strOptString = jSONObjectOptJSONObject2.optString(C0081.m322(f64short, 196, 4, 1761));
                            String strOptString2 = jSONObjectOptJSONObject2.optString(strM301);
                            if (TextUtils.isEmpty(strOptString2)) {
                                strOptString2 = TextUtils.isEmpty(strOptString) ? C0096.m382(f64short, 200, 2, 2483) : strOptString;
                            }
                            StringBuilder sb = new StringBuilder();
                            int i2 = 0;
                            while (i2 < jSONArrayOptJSONArray.length()) {
                                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i2);
                                if (jSONObjectOptJSONObject3 != null) {
                                    if (sb.length() > 0) {
                                        sb.append('#');
                                    }
                                    sb.append(jSONObjectOptJSONObject3.optString(strM301));
                                    sb.append('$');
                                    String strOptString3 = jSONObjectOptJSONObject3.optString(C0109.m432(f64short, 202, 5, 2792));
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(strOptString);
                                    String strM21 = C0006.m21(f64short, 207, 3, 361);
                                    sb2.append(strM21);
                                    sb2.append(strTrim);
                                    sb2.append(strM21);
                                    sb2.append(i2);
                                    sb2.append(strM21);
                                    sb2.append(strOptString3);
                                    sb.append(sb2.toString());
                                }
                                i2++;
                                strM301 = strM301;
                            }
                            str = strM301;
                            if (sb.length() != 0) {
                                arrayList.add(strOptString2);
                                arrayList2.add(sb.toString());
                            }
                        }
                        i++;
                        strM301 = str;
                    }
                }
                kVar.q(TextUtils.join(strM390, arrayList));
                kVar.r(TextUtils.join(strM390, arrayList2));
                AbstractC0280n1.p(kVar.c());
                AbstractC0280n1.q(kVar.e());
                FishCrypto.c(kVar);
                return com.github.catvod.spider.merge.p001b.g.s(kVar);
            } catch (Exception unused) {
                return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
            }
        } catch (Exception unused2) {
        }
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int iMax;
        String str3 = str;
        String strM169 = C0043.m169(f64short, 210, 4, 1970);
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
            iMax = 1;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String strM379 = C0095.m379(f64short, 214, 3, 2523);
            if (str3 == null) {
                str3 = "";
            }
            JSONObject jSONObjectPut = jSONObject.put(strM379, str3).put(strM169, iMax);
            String[] strArr = {C0103.m408(f64short, 217, 5, 475), C0072.m285(f64short, 222, 5, 782), C0140.m558(f64short, 227, 4, 1267), C0030.m116(f64short, 231, 4, 1442), C0081.m322(f64short, 235, 4, 2283)};
            for (int i = 0; i < 5; i++) {
                String str4 = strArr[i];
                String str5 = (map == null || TextUtils.isEmpty(map.get(str4))) ? "" : map.get(str4);
                if (!TextUtils.isEmpty(str5)) {
                    jSONObjectPut.put(str4, str5);
                }
            }
            JSONObject jSONObjectB = b(C0087.m346(f64short, 239, 8, 1833), jSONObjectPut);
            int iOptInt = jSONObjectB.optInt(strM169, iMax);
            int iOptInt2 = jSONObjectB.optInt(C0095.m379(f64short, 247, 9, 2173), 1);
            int iOptInt3 = jSONObjectB.optInt(C0115.m459(f64short, 256, 5, 2674), 0);
            ArrayList arrayListC = c(jSONObjectB.optJSONArray(C0091.m360(f64short, 261, 4, 840)));
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.F(arrayListC);
            gVar.o(Math.max(iOptInt, 1), Math.max(iOptInt2, 1), 21, iOptInt3);
            return gVar.r();
        } catch (Exception unused2) {
            List listEmptyList = Collections.emptyList();
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.F(listEmptyList);
            gVar2.o(Math.max(iMax, 1), Math.max(1, 1), 21, 0);
            return gVar2.r();
        }
    }

    public static void a(LinkedHashMap linkedHashMap, String str, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        String[][] strArr = {new String[]{C0103.m408(f64short, 265, 5, 3167), C0008.m31(f64short, 270, 2, 2191)}, new String[]{C0118.m471(f64short, 272, 4, 1141), C0082.m325(f64short, 276, 2, 1837)}, new String[]{C0055.m219(f64short, 278, 4, 2865), C0106.m422(f64short, 282, 2, 2774)}, new String[]{C0130.m516(f64short, 284, 4, 1728), C0126.m503(f64short, 288, 2, 2364)}};
        for (int i = 0; i < 4; i++) {
            String[] strArr2 = strArr[i];
            String strOptString = jSONObject == null ? "" : jSONObject.optString(strArr2[0]);
            if (!TextUtils.isEmpty(strOptString)) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new com.github.catvod.spider.merge.p001b.c(C0027.m105(f64short, 290, 2, 1262), ""));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (String str2 : strOptString.split(C0090.m358(f64short, 292, 1, 620))) {
                    if (!TextUtils.isEmpty(str2) && linkedHashSet.add(str2)) {
                        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(str2, str2));
                    }
                }
                arrayList.add(new com.github.catvod.spider.merge.p001b.d(strArr2[0], strArr2[1], arrayList2));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        linkedHashMap.put(str, arrayList);
    }

    public static ArrayList c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(new k(jSONObjectOptJSONObject.optString(C0026.m102(f64short, 293, 2, 352)), jSONObjectOptJSONObject.optString(C0043.m169(f64short, 295, 4, 1894)), jSONObjectOptJSONObject.optString(C0011.m42(f64short, 299, 3, 2746)), jSONObjectOptJSONObject.optString(C0093.m368(f64short, 302, 7, 1914))));
            }
        }
        return arrayList;
    }

    public static String e(int i, String str, String str2, String str3) {
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(str3);
        gVar.h(new HashMap());
        gVar.q(i);
        String strI = AbstractC0280n1.i(str, str2, null, null);
        if (!TextUtils.isEmpty(strI)) {
            gVar.b(strI);
        }
        return gVar.r();
    }

    public final JSONObject b(String str, JSONObject jSONObject) throws JSONException, IOException {
        int i;
        String strOptString = "";
        for (int i2 = 0; i2 < 4; i2++) {
            JSONObject jSONObjectD = d(C0073.m288(f64short, 309, 7, 1975), str, jSONObject, null, strOptString, 0);
            String strOptString2 = jSONObjectD.optString(C0085.m339(f64short, 316, 7, 3093), "");
            String strOptString3 = jSONObjectD.optString(C0028.m108(f64short, 323, 3, 1934));
            byte[] bArrBytes = new byte[0];
            if (TextUtils.isEmpty(strOptString3)) {
                i = 200;
            } else {
                Request.Builder builderU = com.github.catvod.spider.merge.D.b.u(strOptString3);
                JSONObject jSONObjectOptJSONObject = jSONObjectD.optJSONObject(C0140.m558(f64short, 326, 7, 2871));
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        builderU.header(next, jSONObjectOptJSONObject.optString(next));
                    }
                }
                if (C0070.m277(f64short, 342, 4, 386).equalsIgnoreCase(jSONObjectD.optString(C0081.m322(f64short, 333, 6, 2754), C0082.m325(f64short, 339, 3, 1328)))) {
                    byte[] bArrDecode = Base64.decode(jSONObjectD.optString(C0030.m116(f64short, 346, 4, 2646), ""), 0);
                    String strHeader = builderU.build().header(C0001.m1(f64short, 350, 12, 2502));
                    if (TextUtils.isEmpty(strHeader)) {
                        strHeader = C0142.m567(f64short, 362, 31, 1092);
                    }
                    builderU.post(RequestBody.create(MediaType.parse(strHeader), bArrDecode));
                }
                try {
                    Response responseI = X1.I(builderU.build());
                    try {
                        int iCode = responseI.code();
                        if (!responseI.isSuccessful() && TextUtils.isEmpty(strOptString2)) {
                            throw new IOException(C0047.m186(f64short, 393, 5, 3208) + iCode);
                        }
                        bArrBytes = responseI.body() == null ? new byte[0] : responseI.body().bytes();
                        responseI.close();
                        i = iCode;
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
                } catch (IOException e) {
                    if (TextUtils.isEmpty(strOptString2)) {
                        throw e;
                    }
                    bArrBytes = new byte[0];
                    i = 0;
                }
            }
            JSONObject jSONObjectD2 = d(C0105.m416(f64short, 398, 7, 2151), str, jSONObject, Base64.encodeToString(bArrBytes, 2), strOptString2, i);
            strOptString = jSONObjectD2.optString(C0120.m477(f64short, 405, 4, 3149), "");
            if (TextUtils.isEmpty(strOptString)) {
                return jSONObjectD2;
            }
        }
        throw new IOException(C0027.m105(f64short, 409, 8, 633));
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0030.m116(f64short, 417, 15, 3222));
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

    public final JSONObject d(String str, String str2, JSONObject jSONObject, String str3, String str4, int i) throws JSONException, IOException {
        String str5 = str3;
        if (TextUtils.isEmpty(this.a)) {
            throw new IOException(C0010.m36(f64short, 1027, 9, 819));
        }
        JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v(C0081.m322(f64short, 432, 6, 3056), str, C0044.m175(f64short, 438, 5, 1311), str2);
        if (jSONObject != null) {
            jSONObjectV.put(C0087.m346(f64short, 443, 6, 2449), jSONObject);
        }
        if (str5 == null) {
            str5 = "";
        }
        jSONObjectV.put(C0089.m355(f64short, 449, 4, 1126), str5);
        jSONObjectV.put(C0006.m21(f64short, 453, 11, 2645), System.currentTimeMillis() / 1000);
        jSONObjectV.put(C0047.m186(f64short, 464, 7, 1424), str4);
        if (C0050.m199(f64short, 471, 7, 881).equals(str)) {
            jSONObjectV.put(C0009.m33(f64short, 478, 6, 1408), i);
        }
        String str6 = this.a;
        String string = jSONObjectV.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM554 = C0139.m554(f64short, 484, 111, 676);
        String strM31 = C0008.m31(f64short, 595, 111, 2880);
        byte[] bArrT = FishCrypto.t(strM554, strM31, C0093.m368(f64short, 706, 91, 1888), C0073.m288(f64short, 797, 155, 3021), bytes);
        if (bArrT == null) {
            throw new IOException(C0114.m454(f64short, 1019, 8, 2800));
        }
        JSONObject jSONObject2 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM292 = C0074.m292(f64short, 952, 11, 3022);
        String strP = X1.P(str6, jSONObject2.put(strM292, strEncodeToString).toString());
        if (TextUtils.isEmpty(strP)) {
            throw new IOException(C0126.m503(f64short, 1012, 7, 2292));
        }
        JSONObject jSONObject3 = new JSONObject(strP);
        if (jSONObject3.length() != 1) {
            throw new IOException(C0063.m249(f64short, 1004, 8, 2593));
        }
        String strOptString = jSONObject3.optString(strM292);
        if (TextUtils.isEmpty(strOptString)) {
            throw new IOException(C0008.m31(f64short, 996, 8, 2170));
        }
        byte[] bArrS = FishCrypto.s(strM554, strM31, Base64.decode(strOptString, 0));
        if (bArrS == null) {
            throw new IOException(C0137.m545(f64short, 988, 8, 610));
        }
        JSONObject jSONObject4 = new JSONObject(new String(bArrS, charset));
        if (!jSONObject4.optBoolean(C0053.m210(f64short, 963, 2, 2716))) {
            throw new IOException(jSONObject4.optString(C0107.m427(f64short, 977, 5, 2783), C0046.m182(f64short, 982, 6, 1967)));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject(C0055.m219(f64short, 965, 4, 1574));
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        throw new IOException(C0047.m186(f64short, 969, 8, 3231));
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0021.m83(f64short, 1036, 13, 3040));
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

    public final JSONObject f(int i, String str, String str2, String str3) throws JSONException {
        String str4 = str3;
        JSONObject jSONObjectPut = new JSONObject().put(C0009.m33(f64short, 1049, 3, 2780), str).put(C0143.m570(f64short, 1052, 5, 523), i).put(C0026.m102(f64short, 1057, 5, 1911), str2);
        if (str4 == null) {
            str4 = "";
        }
        return b(C0095.m379(f64short, 1066, 7, 1130), jSONObjectPut.put(C0076.m301(f64short, 1062, 4, 2120), str4));
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0081.m322(f64short, 1073, 11, 596));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0050.m199(f64short, 1084, 16, 2592));
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

    public void init(Context context, String str) throws Exception {
        super.init(context, str);
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            throw new IOException(C0063.m249(f64short, 1185, 22, 3079));
        }
        boolean zIsEmpty = strTrim.isEmpty();
        String strM21 = C0006.m21(f64short, 1100, 4, 779);
        String strM193 = C0049.m193(f64short, 1104, 1, 1481);
        boolean z = (zIsEmpty || strTrim.startsWith(strM193) || strTrim.startsWith(strM21)) ? false : true;
        if (z) {
            this.a = "";
        }
        try {
            String strG = FishCrypto.g(strTrim);
            if (z && TextUtils.isEmpty(strG)) {
                throw new IOException(C0095.m379(f64short, 1105, 28, 1858));
            }
            if (!TextUtils.isEmpty(strG)) {
                strTrim = strG.trim();
            }
        } catch (Exception e) {
            if (z) {
                throw e;
            }
        }
        if (strTrim.startsWith(strM193)) {
            JSONObject jSONObject = new JSONObject(strTrim);
            strTrim = jSONObject.optString(C0021.m83(f64short, 1136, 3, 3096), jSONObject.optString(C0114.m454(f64short, 1133, 3, 2720), "")).trim();
        }
        if (z && HttpUrl.parse(strTrim) == null) {
            throw new IOException(C0125.m499(f64short, 1139, 45, 2838));
        }
        if (strTrim.startsWith(strM21)) {
            while (strTrim.endsWith(C0092.m365(f64short, 1184, 1, 1685))) {
                strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
            }
            this.a = strTrim;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0107.m427(f64short, 1207, 13, 1844));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0085.m339(f64short, 1220, 13, 2872));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0081.m322(f64short, 1233, 13, 608));
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

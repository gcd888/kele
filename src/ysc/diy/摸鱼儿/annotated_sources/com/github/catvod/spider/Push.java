package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
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
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
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
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.C0342a0;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.h;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.P;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.p022z.InterfaceC0522j3;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import com.google.gson.JsonObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Push extends Spider {
    public final Cloud a;
    public final X1 b;
    public final com.github.catvod.spider.merge.p018v.c c;
    public final com.github.catvod.spider.merge.p018v.c d;
    public final ArrayList e;
    public X1 f;
    public final InterfaceC0522j3 g;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f81short = {1614, 1624, 1609, 1609, 1620, 1619, 1626, 11701, 2828, 26756, -25811, -32622, 29762, 841, 840, 850, 853, 846, 851, 856, 27172, -26227, 23050, 23166, 1482, 1479, 1479, 1479, 1506, 1533, 1518, 1451, 1531, 1534, 1528, 1507, 1451, 1531, 1511, 1514, 1522, 1518, 1529, 1480, 1508, 1509, 1535, 1518, 1509, 1535, 1451, 1518, 1529, 1529, 1508, 1529, 1457, 1451, 32320, 27673, 27673, 28042, 24452, 24564, -29949, 23394, 20869, -31343, 28726, -30436, 1084, 1075, 1078, 1087, 1120, 1141, 1141, 31886, -26023, 21280, 25927, -29509, 25288, 28487, 24411, 3235, 3247, 3246, 3252, 3237, 3246, 3252, 3322, 3311, 3311, 3056, -31087, -24669, 410, 437, 438, 428, 445, 505, 425, 437, 440, 416, 444, 427, 410, 438, 439, 429, 444, 439, 429, 505, 444, 427, 427, 438, 427, 483, 505, 2032, 2028, 2028, 2024, 1954, 1975, 1975, 1529, 1508, 1440, 997, 995, 1022, 2465, 2464, 2470, 2840, 2826, 2826, 1446, 503, 496, 494, 491, 490, 1145, 1142, 1151, 1147, 1128, 2564, 2572, 2577, 2581, 2584, 917, 911, 914, 899, 2913, 2940, 2940, 2942, 2892, 2938, 2935, 699, 697, 694, 695, 694, 689, 699, 697, 692, 647, 685, 682, 692, 30521, 25952, -27341, 25192, -30674, 26205, 32542, 26193, 20416, 23105, 25785, 1821, 1808, 1808, 1808, 1845, 1834, 1849, 1916, 1836, 1833, 1839, 1844, 1916, 1838, 1849, 1839, 1843, 1840, 1834, 1849, 1916, 1849, 1838, 1838, 1843, 1838, 1894, 1916, 1942, 1950, 1941, 1929, 1942, 1937, 1951, 702, 701, 696, 673, 703, 673, 703, 2673, 2674, 2686, 2684, 2673, 2677, 2674, 2670, 2665, 1329, 1341, 1340, 1318, 1335, 1340, 1318, 1384, 1405, 1405, 28421, 24345, 27690, 23606, -32064, -27753, 3173, 3178, 3183, 3174, 3129, 3116, 3116, 1597, 2572, 2640, 2647, 2636, 2641, 2626, 2628, 2630, 2572, 1567, 1603, 1620, 1619, 1617, 1602, 1620, 1567, 2113, 2058, 2063, 2074, 2063, 2113, 2224, 2270, 2289, 2299, 2285, 2288, 2294, 2299, 2224, 24375, 30368, -32295, -28530, 26950, -25873, 29231, 22645, -31014, -24600, 2059, 29974, -29636, 783, 1086, 30122, -29568, 890, 890, 890, 22171, 24828, 890, 890, 890, -30019, 25806, 2770, 2770, 2770, 2875, 2868, 2877, 2873, 2858, 2237, 2234, 2212, 2209, 2208, 753, 743, 758, 758, 747, 748, 741, 1867, 2625, 2624, 2650, 2653, 2630, 2651, 2640, 1476, 1473, 1479, 1500, 1524, 30571, 25906, 421, 447, 2973, 2951, 31096, 21282, 387, 409, 1710, 1710, 1710, 1922, 1933, 1928, 1921, 2014, 1995, 1995, 28198, 24122, 2352, 2346, 25168, 24882, 26490, -27437, 22356, 22304, 24715, -27870, -26659, 24710, 22317, 19513, 21515, -29446, -27921, 25885, 31257, 525, 517, 536, 540, 529, 1056, 1120, 1148, 1148, 1144, 1147, 1079, 1074, 1063, 1063, 1107, 1110, 1108, 1147, 1108, 1149, 1083, 1080, 1080, 1080, 1066, 1071, 1076, 1078, 1108, 1109, 1108, 1057, -1279, 13337, 1109, 1059, 1057, 2963, 2963, 2948, 2945, 3019, 3034, 3029, 3047, 2965, 3018, 3022, 3034, 3017, 3024, 3047, 2965, 3032, 3029, 3015, 3039, 3017, 3026, 3021, 3038, 3047, 2965, 3022, 3032, 3047, 2965, 3032, 3029, 3015, 3034, 3031, 3026, 3010, 3022, 3029, 3039, 3017, 3026, 3021, 3038, 3047, 2965, 3032, 3028, 3030, 3015, 3034, 3031, 3026, 3019, 3034, 3029, 3047, 2965, 3032, 3028, 3030, 3015, 3032, 3031, 3028, 3022, 3039, 3047, 2965, 2954, 2947, 2946, 3047, 2965, 3032, 3029, 3015, 3032, 3031, 3028, 3022, 3039, 3047, 2965, 2954, 2947, 2946, 3047, 2965, 3032, 3028, 3030, 3015, 3010, 3022, 3029, 3047, 2965, 2954, 2952, 2946, 3047, 2965, 3032, 3028, 3030, 3015, 3032, 3034, 3026, 3010, 3022, 3029, 3047, 2965, 2954, 2952, 2946, 3047, 2965, 3032, 3028, 3030, 3015, 3019, 3034, 3029, 3047, 2965, 3033, 3034, 3026, 3039, 3022, 3047, 2965, 3032, 3028, 3030, 3015, 3019, 3034, 3029, 3047, 2965, 3011, 3022, 3029, 3031, 3038, 3026, 3047, 2965, 3032, 3028, 3030, 3015, 2954, 2954, 2958, 3047, 2965, 3032, 3028, 3030, 3015, 2954, 2954, 2958, 3032, 3039, 3029, 3047, 2965, 3032, 3028, 3030, 3015, 2954, 2953, 2952, 3019, 3034, 3029, 3047, 2965, 3032, 3028, 3030, 3015, 2954, 2953, 2952, 3019, 3034, 3029, 3047, 2965, 3032, 3029, 3015, 3016, 3027, 3034, 3017, 3038, 3047, 2965, 2954, 2953, 2952, 3019, 3034, 3029, 3047, 2965, 3032, 3029, 3015, 3036, 3022, 3034, 3029, 3036, 3010, 3034, 3019, 3034, 3029, 3047, 2965, 3032, 3028, 3030, 2962, 3040, 3045, 3047, 3016, 3047, 3022, 2952, 2955, 2955, 2955, 2969, 2972, 2951, 2949, 3047, 3046, 3047, 2962, -2894, 15274, 3046, 2961, 2962, -2973, 13149, -1693, 1757, 1305, 867, 1739, 1742, 1736, 1747, 1787, 268, 272, 272, 276, 350, 331, 331, 1125, 1145, 1145, 1149, 1150, 1079, 1058, 1058, 2808, 2808, 2808, 312, 308, 306, 315, 304, 289, 698, 664, 706, 729, 708, 708, 723, 728, 706, 2013, 2007, 2002, 2007, 1924, 1308, 1280, 1280, 1284, 2386, 2382, 2382, 2378, 2377, 1270, 1190, 1191, 1210, 1248, 1250, 2110, 2107, 2084, 2103, 2172, 2096, 2107, 2110, 2107, 2096, 2107, 2110, 2107, 2172, 2097, 2109, 2111, 993, 1020, 1008, 1000, 935, 1002, 998, 996, 2897, 2897, 2897, 2824, 2894, 2899, 2911, 2887, 2824, 2885, 2889, 2891, 1698, 1761, 1703, 1722, 1718, 1710, 1761, 1708, 1696, 1698, 2165, 2174, 2148, 2152, 2148, 2111, 2162, 2174, 2172, 640, 640, 640, 729, 659, 664, 642, 654, 642, 729, 660, 664, 666, 2359, 2420, 2366, 2357, 2351, 2339, 2351, 2420, 2361, 2357, 2359, 3039, 3034, 3013, 3030, 2973, 3031, 3036, 3014, 3018, 3034, 3037, 2973, 3024, 3036, 3038, 2944, 2944, 2944, 3033, 2963, 2968, 2946, 2958, 2974, 2969, 3033, 2964, 2968, 2970, 1432, 1472, 1418, 1409, 1435, 1431, 1415, 1408, 1472, 1421, 1409, 1411, 1853, 1839, 1832, 1833, 1835, 1849, 1854, 1892, 1835, 1831, 1839, 1831, 1852, 1892, 1833, 1829, 1831, 718, 715, 724, 711, 652, 713, 727, 707, 715, 721, 714, 717, 727, 652, 705, 717, 719, 568, 573, 546, 561, 634, 575, 545, 565, 573, 551, 572, 571, 545, 634, 567, 570, 3107, 3195, 3134, 3104, 3124, 3132, 3110, 3133, 3130, 3104, 3195, 3126, 3130, 3128, 1892, 1914, 1902, 1894, 1916, 1895, 1888, 1914, 1568, 1579, 1585, 1597, 1581, 1578, 2209, 2218, 2224, 2236, 2224, 2739, 2734, 2722, 2746, 2681, 2674, 2679, 2674, 2681, 2674, 2679, 2674, 1395, 1332, 1336, 1317, 1390, 2661, 3317, 3206, 2302, 1130, 396, 387, 390, 399, 464, 453, 453, 1355, 1552, 1548, 1548, 
    1544, 2807, 2795, 2795, 2799, 2796, 433, 435, 420, 441, 447, 446, 915, 913, 900, 917, 919, 927, 898, 905, 947, 927, 926, 900, 917, 926, 900, 2961, 2960, 2945, 2964, 2972, 2969, 2998, 2970, 2971, 2945, 2960, 2971, 2945, 3079, 3095, 3093, 3098, 3162, 3102, 3076, 3091, 1589, 1586, 1580, 1577, 1576, 26154, 22217, -29710, 21764, -28513, 26564, -30873, 22929, 30629, 32300, 2267, -32462, -28571, -25590, 27473, 985, 990, 960, 965, 964, 24746, -29573, 22686, 2731, 2724, 2733, 2729, 2746, 25840, -25455, 22899, 22791, -32443, 21920, 2820, 2827, 2818, 2822, 2837, 1055, 1048, 1050, 1042, 1076, 1048, 1049, 1027, 1042, 1049, 1027, 1637, 1610, 1609, 1619, 1602, 1542, 1615, 1608, 1615, 1618, 1542, 1603, 1620, 1620, 1609, 1620, 1564, 1542, 736, 749, 749, 749, 744, 759, 740, 641, 652, 652, 684, 649, 662, 645, 691, 645, 658, 662, 645, 658, 2316, 2305, 2305, 2305, 2308, 2331, 2312, 2354, 2334, 2312, 2335, 2331, 2312, 2335, 2325, 2328, 2328, 2328, 2333, 2306, 2321, 2343, 2321, 2310, 2306, 2321, 2310, 1857, 1868, 1868, 1919, 1868, 1865, 1878, 1861, 1919, 1875, 1861, 1874, 1878, 1861, 1874, 789, 771, 788, 784, 771, 788, 2660, 2674, 2661, 2657, 2674, 2661, 2632, 2658, 2661, 2683, 2249, 2254, 2256, 2277, 2235, 2238, 2232, 2211, 2196, 2211, 2210, 2232, 2239, 2212, 2233, 2226, 881, 815, 810, 812, 823, 768, 823, 822, 812, 811, 816, 813, 806, 3152, 3148, 3137, 3161, 3141, 3154, 3171, 3151, 3150, 3156, 3141, 3150, 3156};
    public static final Pattern h = Pattern.compile(C0063.m249(f81short, 408, 33, 1032), 2);
    public static final Pattern i = Pattern.compile(C0045.m177(f81short, 441, 258, 3003), 2);

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0011.m42(f81short, 0, 7, 1597), C0026.m102(f81short, 7, 6, 2860), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0047.m186(f81short, 13, 7, 801), C0076.m301(f81short, 20, 4, 2444), null));
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, e());
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strX = AbstractC0302v0.X(str, str2);
        if (strX != null) {
            return strX;
        }
        String[] strArrJ = com.github.catvod.spider.merge.p018v.b.j(str2);
        if (strArrJ != null && com.github.catvod.spider.merge.p018v.b.i(strArrJ[0])) {
            try {
                return this.d.b(str2);
            } catch (Exception e) {
                SpiderDebug.log(C0105.m416(f81short, 24, 34, 1419) + e.getMessage());
                return com.github.catvod.spider.merge.p001b.g.d(C0119.m473(f81short, 58, 10, 2228));
            }
        }
        boolean zEquals = str.equals(C0128.m511(f81short, 68, 2, 1730));
        String strM31 = C0008.m31(f81short, 70, 7, 1114);
        if (zEquals || str.equals(C0116.m463(f81short, 77, 2, 2682))) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(str2);
            ArrayList arrayList = new ArrayList();
            if (str2.startsWith(strM31)) {
                m(str2, arrayList);
            }
            if (str2.startsWith(C0107.m427(f81short, 125, 7, 1944))) {
                List listAsList = Arrays.asList(C0091.m360(f81short, 132, 3, 1428), C0044.m175(f81short, 135, 3, 904));
                List<String> listAsList2 = Arrays.asList(C0003.m10(f81short, 138, 3, 2514), C0047.m186(f81short, 141, 3, 2937));
                if (listAsList.contains(AbstractC0309x1.g(str2))) {
                    for (String str3 : listAsList2) {
                        String strConcat = AbstractC0309x1.l(str2).concat(C0074.m292(f81short, 144, 1, 1416)).concat(str3);
                        if (X1.X(strConcat, null, null).length() >= 100) {
                            String lastPathSegment = Uri.parse(strConcat).getLastPathSegment();
                            h hVar = new h();
                            hVar.c(lastPathSegment);
                            hVar.a(str3);
                            hVar.d(strConcat);
                            arrayList.add(hVar);
                        }
                    }
                }
            }
            gVar.B(arrayList);
            return gVar.r();
        }
        if (str.equals(C0101.m402(f81short, 79, 2, 1765))) {
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.p();
            gVar2.C(str2);
            return gVar2.r();
        }
        if (str.equals(C0001.m1(f81short, 81, 2, 1368))) {
            com.github.catvod.spider.merge.p001b.g gVar3 = new com.github.catvod.spider.merge.p001b.g();
            gVar3.p();
            gVar3.j();
            gVar3.C(str2);
            return gVar3.r();
        }
        if (!str.equals(C0081.m322(f81short, 83, 2, 2155))) {
            if (str.equals(C0142.m567(f81short, 96, 2, 2388))) {
                return com.github.catvod.spider.merge.D.b.f(str2);
            }
            try {
                String strPlayerContent = this.a.playerContent(str, str2, list);
                if (strPlayerContent != null && !strPlayerContent.equals(str)) {
                    return strPlayerContent;
                }
            } catch (Exception e2) {
                com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder(C0010.m36(f81short, 98, 27, 473)));
            }
            return com.github.catvod.spider.merge.D.b.f(str2);
        }
        com.github.catvod.spider.merge.p001b.g gVar4 = new com.github.catvod.spider.merge.p001b.g();
        gVar4.C(str2);
        ArrayList arrayList2 = new ArrayList();
        if (!str2.startsWith(C0120.m477(f81short, 85, 10, 3264))) {
            if (str2.startsWith(strM31)) {
                m(str2, arrayList2);
            } else if (str2.startsWith(C0028.m108(f81short, 95, 1, 3039))) {
                m(strM31.concat(str2), arrayList2);
            }
        }
        gVar4.B(arrayList2);
        return gVar4.r();
    }

    /* JADX WARN: Code duplicated, block: B:83:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0314  */
    /* JADX WARN: Code duplicated, block: B:90:0x031a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0325  */
    /* JADX WARN: Code duplicated, block: B:93:0x032b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0344  */
    /* JADX WARN: Code duplicated, block: B:96:0x035b  */
    /* JADX WARN: Code duplicated, block: B:97:0x039d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01f9 -> B:56:0x01fa). Please report as a decompilation issue!!! */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        String lastPathSegment;
        int iLastIndexOf;
        boolean zS0 = false;
        String strC = c(list.get(0).trim());
        if (C0135.m539(f81short, 145, 5, 414).equals(strC) || C0070.m277(f81short, 150, 5, 1050).equals(strC)) {
            AbstractC0302v0.g0(strC, new i(16, this));
            return "";
        }
        if (C0103.m408(f81short, 155, 5, 2657).equals(strC)) {
            return AbstractC0449a.b();
        }
        a(strC);
        String strJ = j(strC);
        if (!TextUtils.isEmpty(i(strJ))) {
            try {
                JSONObject jSONObjectT = this.b.T(strJ);
                String strTrim = jSONObjectT.optString(C0104.m414(f81short, 160, 4, 998)).trim();
                String strTrim2 = jSONObjectT.optString(C0095.m379(f81short, 164, 7, 2835)).trim();
                String strTrim3 = jSONObjectT.optString(C0059.m234(f81short, 171, 13, 728)).trim();
                if (strTrim.isEmpty() || strTrim2.isEmpty() || strTrim3.isEmpty()) {
                    throw new Exception(C0106.m422(f81short, 184, 11, 461));
                }
                k(strJ, strTrim3);
                return this.c.a(strTrim, strTrim2, strTrim3, true);
            } catch (Exception e) {
                com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0079.m314(f81short, 195, 28, 1884)));
            }
        }
        String strS = C0342a0.S(j(strJ));
        if (!h(strS)) {
            String lowerCase = strS.toLowerCase(Locale.ROOT);
            if (!lowerCase.contains(C0050.m199(f81short, 223, 7, 1959)) && !lowerCase.contains(C0021.m83(f81short, 230, 7, 655)) && !lowerCase.contains(C0021.m83(f81short, 237, 9, 2589))) {
                zS0 = AbstractC0302v0.s0(strS);
            }
        }
        if (zS0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C0342a0.S(strJ));
            String strDetailContent = this.a.detailContent(arrayList);
            if (strDetailContent != null) {
                return strDetailContent;
            }
        }
        k kVarA = AbstractC0449a.a(strJ);
        kVarA.p(g(strJ));
        boolean zStartsWith = strJ.startsWith(C0055.m219(f81short, 246, 10, 1362));
        String strM65 = C0017.m65(f81short, 256, 2, 2089);
        String strM365 = C0092.m365(f81short, 258, 4, 2822);
        if (zStartsWith) {
            try {
                Uri uri = Uri.parse(strJ);
                String path = uri.getPath();
                if (path == null || (iLastIndexOf = path.lastIndexOf(47)) < 0 || iLastIndexOf >= path.length() - 1) {
                    lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment == null || lastPathSegment.isEmpty()) {
                        lastPathSegment = null;
                    }
                } else {
                    lastPathSegment = path.substring(iLastIndexOf + 1);
                }
            } catch (Exception unused) {
            }
            if (lastPathSegment == null) {
                lastPathSegment = strM365;
            }
            kVarA.o(lastPathSegment);
            kVarA.i(strM365);
            kVarA.q(strM65);
            kVarA.r(strJ);
        } else {
            String strM390 = C0098.m390(f81short, 262, 7, 3075);
            if (strJ.startsWith(strM390)) {
                kVarA.o(new File(strJ.replace(strM390, "")).getName());
                kVarA.i(strM365);
                kVarA.q(strM65);
                kVarA.r(strJ);
            } else if (strJ.isEmpty()) {
                kVarA.o(strJ);
                kVarA.i(C0125.m499(f81short, 302, 4, 2079));
                if (AbstractC0302v0.r0(strJ)) {
                    if (AbstractC0302v0.j0()) {
                        String strJ1 = AbstractC0302v0.j1(C0125.m499(f81short, 306, 4, 2798), strJ);
                        kVarA.q(AbstractC0302v0.h1(strJ));
                        kVarA.r(strJ1);
                    } else if (AbstractC0302v0.Y()) {
                        AbstractC0302v0.D1();
                        kVarA.q("");
                        kVarA.r("");
                    } else if (h(strJ)) {
                        kVarA.q(C0105.m416(f81short, 310, 2, 2335));
                        kVarA.r(strJ);
                    } else if (strJ.contains(C0047.m186(f81short, 312, 1, 2095))) {
                        kVarA.q(C0087.m346(f81short, 313, 2, 994));
                        kVarA.r(TextUtils.join(C0011.m42(f81short, 316, 1, 1053), strJ.split(C0055.m219(f81short, 315, 1, 773))));
                    } else {
                        kVarA.q(C0044.m175(f81short, 317, 12, 862));
                        StringBuilder sb = new StringBuilder();
                        sb.append(strJ);
                        String strM54 = C0014.m54(f81short, 329, 3, 2806);
                        sb.append(strM54);
                        sb.append(strJ);
                        sb.append(strM54);
                        sb.append(strJ);
                        kVarA.r(sb.toString());
                    }
                } else if (h(strJ)) {
                    kVarA.q(C0105.m416(f81short, 310, 2, 2335));
                    kVarA.r(strJ);
                } else if (strJ.contains(C0047.m186(f81short, 312, 1, 2095))) {
                    kVarA.q(C0087.m346(f81short, 313, 2, 994));
                    kVarA.r(TextUtils.join(C0011.m42(f81short, 316, 1, 1053), strJ.split(C0055.m219(f81short, 315, 1, 773))));
                } else {
                    kVarA.q(C0044.m175(f81short, 317, 12, 862));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strJ);
                    String strM55 = C0014.m54(f81short, 329, 3, 2806);
                    sb2.append(strM55);
                    sb2.append(strJ);
                    sb2.append(strM55);
                    sb2.append(strJ);
                    kVarA.r(sb2.toString());
                }
            } else {
                if (!strJ.startsWith(C0053.m210(f81short, 269, 1, 1554)) && !strJ.contains(C0116.m463(f81short, 270, 9, 2595)) && !strJ.contains(C0126.m503(f81short, 279, 8, 1584)) && !strJ.contains(C0098.m390(f81short, 287, 6, 2158)) && !strJ.contains(C0011.m42(f81short, 293, 9, 2207))) {
                    File file = new File(strJ);
                    if (!file.exists() || !file.isFile()) {
                        kVarA.o(strJ);
                        kVarA.i(C0125.m499(f81short, 302, 4, 2079));
                        if (AbstractC0302v0.r0(strJ)) {
                            if (h(strJ)) {
                                kVarA.q(C0105.m416(f81short, 310, 2, 2335));
                                kVarA.r(strJ);
                            } else if (strJ.contains(C0047.m186(f81short, 312, 1, 2095))) {
                                kVarA.q(C0087.m346(f81short, 313, 2, 994));
                                kVarA.r(TextUtils.join(C0011.m42(f81short, 316, 1, 1053), strJ.split(C0055.m219(f81short, 315, 1, 773))));
                            } else {
                                kVarA.q(C0044.m175(f81short, 317, 12, 862));
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(strJ);
                                String strM56 = C0014.m54(f81short, 329, 3, 2806);
                                sb3.append(strM56);
                                sb3.append(strJ);
                                sb3.append(strM56);
                                sb3.append(strJ);
                                kVarA.r(sb3.toString());
                            }
                        } else if (AbstractC0302v0.j0()) {
                            String strJ2 = AbstractC0302v0.j1(C0125.m499(f81short, 306, 4, 2798), strJ);
                            kVarA.q(AbstractC0302v0.h1(strJ));
                            kVarA.r(strJ2);
                        } else if (AbstractC0302v0.Y()) {
                            AbstractC0302v0.D1();
                            kVarA.q("");
                            kVarA.r("");
                        } else if (h(strJ)) {
                            kVarA.q(C0105.m416(f81short, 310, 2, 2335));
                            kVarA.r(strJ);
                        } else if (strJ.contains(C0047.m186(f81short, 312, 1, 2095))) {
                            kVarA.q(C0087.m346(f81short, 313, 2, 994));
                            kVarA.r(TextUtils.join(C0011.m42(f81short, 316, 1, 1053), strJ.split(C0055.m219(f81short, 315, 1, 773))));
                        } else {
                            kVarA.q(C0044.m175(f81short, 317, 12, 862));
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(strJ);
                            String strM57 = C0014.m54(f81short, 329, 3, 2806);
                            sb4.append(strM57);
                            sb4.append(strJ);
                            sb4.append(strM57);
                            sb4.append(strJ);
                            kVarA.r(sb4.toString());
                        }
                    }
                }
                kVarA.o(new File(strJ).getName());
                kVarA.i(strM365);
                kVarA.q(strM65);
                kVarA.r(strM390.concat(strJ));
            }
        }
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        X1 x1;
        str.getClass();
        if (str.equals(C0050.m199(f81short, 332, 5, 2904))) {
            if (this.f == null) {
                return "";
            }
            InitOrigin.run(new RunnableC0341a(8, this));
            return "";
        }
        if (!str.equals(C0044.m175(f81short, 337, 5, 2260)) || (x1 = this.f) == null) {
            return "";
        }
        Objects.requireNonNull(x1);
        InitOrigin.run(new P(x1, 0));
        return "";
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String strF;
        boolean zEquals = C0074.m292(f81short, 342, 7, 642).equals(str);
        String strM36 = C0010.m36(f81short, 349, 1, 1914);
        if (zEquals && strM36.equals(str2)) {
            return com.github.catvod.spider.merge.p001b.g.y(e());
        }
        if (!C0010.m36(f81short, 350, 7, 2601).equals(str) || !strM36.equals(str2)) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        ArrayList arrayList = new ArrayList();
        for (String str4 : this.e) {
            String strM529 = C0133.m529(f81short, 357, 5, 1460);
            try {
                str3 = strM529 + Base64.encodeToString((str4 == null ? "" : str4).getBytes(StandardCharsets.UTF_8), 11);
            } catch (Exception unused) {
                str3 = str4;
            }
            String strJ = j(c(str4));
            String strI = i(strJ);
            if (TextUtils.isEmpty(strI)) {
                String strB1 = AbstractC0302v0.b1(C0342a0.S(strJ));
                String strC1 = TextUtils.isEmpty(strB1) ? "" : AbstractC0302v0.c1(strB1);
                if (!TextUtils.isEmpty(strC1)) {
                    StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strC1, C0010.m36(f81short, 366, 2, 2983));
                    sbP.append(f(strJ));
                    strF = sbP.toString();
                } else if (h(strJ)) {
                    strF = C0044.m175(f81short, 368, 4, 441) + strJ.substring(0, Math.min(50, strJ.length())) + C0096.m382(f81short, 372, 3, 1664);
                } else if (strJ.startsWith(C0115.m459(f81short, 375, 7, 2020))) {
                    strF = C0125.m499(f81short, 382, 4, 2314) + new File(strJ).getName();
                } else {
                    strF = f(strJ);
                }
            } else {
                strF = com.github.catvod.spider.merge.p018v.b.g(strI) + C0009.m33(f81short, 362, 4, 415) + f(strJ);
            }
            arrayList.add(new k(str3, strF, g(str4), ""));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new k(C0050.m199(f81short, 403, 5, 616), C0118.m471(f81short, 386, 6, 1234), AbstractC0302v0.d1(), C0119.m473(f81short, 392, 11, 803)));
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    public Push() {
        com.github.catvod.spider.merge.p018v.d dVar = new com.github.catvod.spider.merge.p018v.d();
        X1 x1 = new X1(8, dVar);
        this.b = x1;
        this.c = new com.github.catvod.spider.merge.p018v.c(dVar, x1);
        this.d = new com.github.catvod.spider.merge.p018v.c(dVar, x1);
        this.e = new ArrayList();
        this.g = new InterfaceC0522j3() { // from class: com.github.catvod.spider.Push.1
            @Override // com.github.catvod.spider.merge.p022z.InterfaceC0522j3
            public void addToHistory(String str) {
                Pattern pattern = Push.h;
                Push.this.a(str);
            }

            @Override // com.github.catvod.spider.merge.p022z.InterfaceC0522j3
            public void clearHistory() {
                Push push = Push.this;
                push.e.clear();
                push.l();
            }
        };
        this.a = new Cloud();
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        while (true) {
            if (!strTrim.endsWith(C0104.m414(f81short, 699, 1, 2927)) && !strTrim.endsWith(C0019.m75(f81short, 700, 1, 863)) && !strTrim.endsWith(C0003.m10(f81short, 701, 1, 1656)) && !strTrim.endsWith(C0130.m516(f81short, 702, 1, 1777)) && !strTrim.endsWith(C0137.m545(f81short, 703, 1, 1314)) && !strTrim.endsWith(C0085.m339(f81short, 704, 1, 845))) {
                return strTrim;
            }
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
        }
    }

    public static String c(String str) {
        if (str == null || !str.startsWith(C0135.m539(f81short, 705, 5, 1723))) {
            return str == null ? "" : str;
        }
        try {
            return new String(Base64.decode(str.substring(5), 11), StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String d(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String strGroup = matcher.group(1);
        if (strGroup == null || strGroup.startsWith(C0087.m346(f81short, 710, 7, 356))) {
            return strGroup;
        }
        String strM545 = C0137.m545(f81short, 717, 8, 1037);
        return !strGroup.startsWith(strM545) ? strM545.concat(strGroup) : strGroup;
    }

    public static String f(String str) {
        if (str.length() <= 60) {
            return str;
        }
        return str.substring(0, 30) + C0092.m365(f81short, 725, 3, 2774) + str.substring(str.length() - 20);
    }

    public static String g(String str) {
        String strJ = j(c(str));
        String strI = i(strJ);
        if (!TextUtils.isEmpty(strI)) {
            return AbstractC0302v0.x0(strI);
        }
        String strB1 = AbstractC0302v0.b1(C0342a0.S(strJ));
        if (TextUtils.isEmpty(strB1)) {
            return h(strJ) ? AbstractC0302v0.z0() : "data:image/png;base64,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";
        }
        return AbstractC0302v0.j(strB1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.trim().toLowerCase();
        if (!AbstractC0309x1.b.matcher(lowerCase).find()) {
            if (lowerCase != null && !lowerCase.startsWith(C0085.m339(f81short, 728, 6, 341))) {
                String[] strArrSplit = lowerCase.split(C0006.m21(f81short, 734, 1, 641));
                if (strArrSplit.length <= 0 || !strArrSplit[0].endsWith(C0027.m105(f81short, 735, 8, 694))) {
                    if (lowerCase.startsWith(C0053.m210(f81short, 743, 5, 1982))) {
                        return false;
                    }
                }
            } else if (lowerCase.startsWith(C0053.m210(f81short, 743, 5, 1982))) {
                return false;
            }
        }
        return true;
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (scheme != null && host != null && (C0017.m65(f81short, 748, 4, 1396).equalsIgnoreCase(scheme) || C0089.m355(f81short, 752, 5, 2362).equalsIgnoreCase(scheme))) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                if (!C0139.m554(f81short, 757, 6, 1172).equals(lowerCase) && !C0043.m169(f81short, 763, 17, 2130).equals(lowerCase)) {
                    if (!C0011.m42(f81short, 780, 8, 905).equals(lowerCase) && !C0098.m390(f81short, 788, 12, 2854).equals(lowerCase) && !C0076.m301(f81short, 800, 10, 1743).equals(lowerCase)) {
                        if (!C0014.m54(f81short, 810, 9, 2065).equals(lowerCase) && !C0044.m175(f81short, 819, 13, 759).equals(lowerCase) && !C0096.m382(f81short, 832, 11, 2394).equals(lowerCase)) {
                            if (!C0079.m314(f81short, 843, 15, 2995).equals(lowerCase) && !C0079.m314(f81short, 858, 14, 3063).equals(lowerCase) && !C0095.m379(f81short, 872, 12, 1518).equals(lowerCase) && !C0143.m570(f81short, 884, 17, 1866).equals(lowerCase)) {
                                if (C0046.m182(f81short, 901, 17, 674).equals(lowerCase) || C0140.m558(f81short, 918, 16, 596).equals(lowerCase) || C0122.m486(f81short, 934, 14, 3157).equals(lowerCase)) {
                                    return C0105.m416(f81short, 948, 8, 1807);
                                }
                            }
                            return C0119.m473(f81short, 956, 6, 1604);
                        }
                        return C0070.m277(f81short, 962, 5, 2245);
                    }
                    return C0114.m454(f81short, 967, 4, 2779);
                }
                return C0126.m503(f81short, 971, 8, 2587);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strReplace = c(str).trim().replace(C0095.m379(f81short, 979, 5, 1365), C0089.m355(f81short, 984, 1, 2627)).replace(C0055.m219(f81short, 985, 2, 3241), C0047.m186(f81short, 987, 1, 2257));
        if (TextUtils.isEmpty(strReplace) || h(strReplace) || strReplace.contains(C0001.m1(f81short, 988, 1, 1102))) {
            return strReplace;
        }
        String strD = d(strReplace, i);
        if (!TextUtils.isEmpty(strD)) {
            return C0342a0.S(b(strD));
        }
        String strD2 = d(strReplace, h);
        return !TextUtils.isEmpty(strD2) ? b(strD2) : strReplace;
    }

    public static void m(String str, ArrayList arrayList) {
        String strM467 = C0117.m467(f81short, 989, 7, 490);
        File file = new File(str.replace(strM467, ""));
        if (file.getParentFile() == null) {
            return;
        }
        for (File file2 : file.getParentFile().listFiles()) {
            String strG = AbstractC0309x1.g(file2.getName());
            if (AbstractC0309x1.d.contains(strG)) {
                h hVar = new h();
                hVar.c(AbstractC0309x1.l(file2.getName()));
                hVar.a(strG);
                hVar.d(strM467 + file2.getAbsolutePath());
                arrayList.add(hVar);
            }
        }
    }

    public static String n(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strTrim = str.trim();
        while (strTrim.endsWith(C0008.m31(f81short, 996, 1, 1380))) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
        }
        try {
            Uri uri = Uri.parse(strTrim);
            String scheme = uri.getScheme();
            if ((C0076.m301(f81short, 997, 4, 1656).equalsIgnoreCase(scheme) || C0143.m570(f81short, 1001, 5, 2719).equalsIgnoreCase(scheme)) && !TextUtils.isEmpty(uri.getHost()) && uri.getUserInfo() == null && uri.getQuery() == null && uri.getFragment() == null) {
                Locale locale = Locale.ROOT;
                if (scheme.equals(scheme.toLowerCase(locale))) {
                    return strTrim;
                }
                return scheme.toLowerCase(locale) + strTrim.substring(scheme.length());
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public final void a(String str) {
        String strJ = j(str);
        if (strJ == null || strJ.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.e;
        arrayList.remove(strJ);
        arrayList.add(0, strJ);
        while (arrayList.size() > 20) {
            arrayList.remove(arrayList.size() - 1);
        }
        l();
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0142.m567(f81short, 1006, 6, 464));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0053.m210(f81short, 1012, 15, 1008));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0116.m463(f81short, 1027, 13, 3061));
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

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k(C0137.m545(f81short, 1048, 5, 1628), C0093.m368(f81short, 1053, 6, 1121), com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, C0093.m368(f81short, 1040, 8, 3188)), C0017.m65(f81short, 1059, 9, 2292), C0126.m503(f81short, 1068, 5, 944)));
        arrayList.add(new k(C0008.m31(f81short, 1076, 5, 2760), C0003.m10(f81short, 1081, 6, 2805), AbstractC0302v0.o(), this.e.size() + C0105.m416(f81short, 1073, 3, 1995), C0085.m339(f81short, 1087, 5, 2919)));
        return arrayList;
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0056.m223(f81short, 1092, 11, 1143));
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
        try {
            this.a.init(context, str);
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0106.m422(f81short, 1103, 18, 1574)));
        }
        String strM365 = C0092.m365(f81short, 1121, 7, 641);
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                JsonObject jsonObjectC = I0.c(str);
                String[] strArr = {C0139.m554(f81short, 1128, 13, 736), C0116.m463(f81short, 1141, 14, 2413), C0046.m182(f81short, 1155, 13, 2420), C0014.m54(f81short, 1168, 15, 1824)};
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        if (!jsonObjectC.has(strM365) || !jsonObjectC.get(strM365).isJsonObject()) {
                            break;
                            break;
                        }
                        JsonObject asJsonObject = jsonObjectC.getAsJsonObject(strM365);
                        String[] strArr2 = {C0074.m292(f81short, 1183, 6, 870), C0106.m422(f81short, 1189, 10, 2583), C0021.m83(f81short, 1199, 3, 2236)};
                        for (int i3 = 0; i3 < 3; i3++) {
                            String str3 = strArr2[i3];
                            if (asJsonObject.has(str3) && !asJsonObject.get(str3).isJsonNull()) {
                                String strN = n(asJsonObject.get(str3).getAsString().trim());
                                if (!strN.isEmpty()) {
                                    str2 = strN;
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    String str4 = strArr[i2];
                    if (jsonObjectC.has(str4) && !jsonObjectC.get(str4).isJsonNull()) {
                        String strN2 = n(jsonObjectC.get(str4).getAsString().trim());
                        if (!strN2.isEmpty()) {
                            str2 = strN2;
                            break;
                        }
                    }
                    i2++;
                }
            } catch (Exception unused) {
            }
        }
        X1 x1 = this.b;
        ((com.github.catvod.spider.merge.p018v.d) x1.b).c = false;
        if (str2.isEmpty()) {
            com.github.catvod.spider.merge.p018v.d dVar = (com.github.catvod.spider.merge.p018v.d) x1.b;
            dVar.a = null;
            dVar.b = true;
        } else {
            com.github.catvod.spider.merge.p018v.d dVar2 = (com.github.catvod.spider.merge.p018v.d) x1.b;
            dVar2.a = str2;
            dVar2.b = false;
        }
        ArrayList arrayList = this.e;
        arrayList.clear();
        try {
            String strM193 = C0049.m193(f81short, 1202, 13, 2251);
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(strM193);
            if (!strH.isEmpty()) {
                JSONArray jSONArray = new JSONArray(strH);
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    String strOptString = jSONArray.optString(i4);
                    if (strOptString != null && !strOptString.isEmpty()) {
                        arrayList.add(strOptString);
                    }
                }
            }
        } catch (Exception unused2) {
        }
        this.f = new X1(15, this.g);
    }

    public final void k(String str, String str2) {
        String strJ = j(str);
        String strJ2 = j(str2);
        if (TextUtils.isEmpty(strJ2)) {
            return;
        }
        ArrayList arrayList = this.e;
        arrayList.remove(strJ);
        arrayList.remove(strJ2);
        arrayList.add(0, strJ2);
        while (arrayList.size() > 20) {
            arrayList.remove(arrayList.size() - 1);
        }
        l();
    }

    public final void l() {
        try {
            String strM379 = C0095.m379(f81short, 1215, 13, 863);
            String string = new JSONArray((Collection) this.e).toString();
            boolean z = FishCrypto.a;
            C0297t1.j(strM379, string);
        } catch (Exception unused) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0096.m382(f81short, 1228, 13, 3104));
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
}

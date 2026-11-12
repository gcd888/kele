package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class TvDy extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f100short = {522, 629, 618, 529, 525, 549, 515, 541, 559, 524, 530, 551, 627, 556, 566, 526, 637, 636, 528, 545, 514, 564, 520, 546, 512, 558, 513, 529, 540, 553, 549, 557, 519, 628, 631, 630, 517, 547, 532, 573, 540, 550, 631, 541, 520, 540, 560, 532, 572, 556, 513, 540, 542, 518, 627, 573, 540, 520, 561, 549, 636, 525, 559, 515, 626, 559, 629, 553, 535, 535, 563, 528, 546, 547, 523, 572, 528, 531, 533, 528, 626, 556, 513, 563, 636, 522, 518, 534, 541, 563, 560, 628, 532, 619, 512, 551, 626, 561, 631, 535, 567, 554, 524, 533, 520, 533, 517, 519, 572, 636, 633, 1386, 1331, 1322, 1313, 1334, 1312, 1316, 1335, 1318, 1325, 1386, 1384, 2745, 2744, 2730, 2753, 2772, 1202, 1202, 1202, 1202, 1202, 1202, 1202, 1202, 1202, 1202, 1202, 1202, 1201, 1271, 1259, 1266, 1267, 595, 540, 577, 582, 583, 603, 543, 580, 605, 598, 606, 603, 577, 582, 621, 621, 582, 602, 583, 607, 592, 2878, 2852, 2867, 2864, 1391, 1394, 1391, 1399, 1406, 1196, 1193, 1212, 1193, 1253, 1191, 1210, 1185, 1199, 1185, 1190, 1193, 1188, 2619, 2606, 1271, 1264, 1277, 1256, 1249, 2653, 2649, 2566, 2561, 2591, 2607, 2651, 2600, 2644, 2641, 2606, 2636, 2651, 2600, 2605, 2644, 2641, 2607, 2650, 2606, 2648, 2650, 2600, 2644, 2641, 2606, 2636, 2607, 2650, 2653, 2649, 1194, 1206, 1206, 1202, 2312, 2316, 2313, 2318, 2426, 2370, 2317, 2319, 2426, 2312, 2382, 2386, 2379, 2378, 2312, 2316, 1838, 1827, 1835, 1828, 1843, 1827, 1828, 1837, 2347, 2342, 2350, 2337, 2364, 2343, 2342, 2341, 2362, 2919, 2930, 2931, 2938, 2916, 2932, 1660, 1655, 1654, 1663, 1653, 1657, 1654, 32758, 21938, 28732, -29489, 22382, 30071, -30223, 21814, 26805, 2407, 2328, 2311, 2428, 2400, 2376, 2414, 2416, 2370, 2401, 2431, 2378, 2334, 2369, 2395, 2403, 2320, 2321, 2429, 2380, 2415, 2393, 2405, 2383, 2413, 2371, 2412, 2428, 2417, 2372, 2376, 2368, 2410, 2329, 2330, 2331, 2408, 2382, 2425, 2384, 2417, 2379, 2330, 2416, 2405, 2417, 2397, 2425, 2385, 2369, 2412, 2417, 2419, 2411, 2334, 2384, 2417, 2405, 2396, 2376, 2321, 2400, 2370, 2414, 2335, 2370, 2328, 2372, 2426, 2426, 2398, 2429, 2383, 2382, 2406, 2385, 2429, 2430, 2424, 2429, 2335, 2369, 2412, 2398, 2321, 2407, 2411, 2427, 2416, 2398, 2397, 2329, 2425, 2310, 2413, 2378, 2335, 2396, 2330, 2426, 2394, 2375, 2401, 2424, 2405, 2424, 2408, 2410, 2385, 2321, 2324, 2144, 2095, 2162, 2165, 2164, 2152, 2092, 2167, 2158, 2149, 2157, 2152, 2162, 2165, 2142, 2142, 2165, 2153, 2164, 2156, 2147, 2762, 2768, 2759, 2756, 1584, 1581, 1584, 1576, 1569, 1102, 1099, 1118, 1099, 1031, 1093, 1112, 1091, 1101, 1091, 1092, 1099, 1094, 2865, 2852, 2066, 2069, 2072, 2061, 2052, 932, 928, 1023, 1016, 998, 982, 930, 977, 941, 936, 983, 949, 930, 977, 980, 941, 936, 982, 931, 983, 929, 931, 977, 941, 936, 983, 949, 982, 931, 932, 928, 3177, 3189, 3189, 3185, 2054, 2136, 2113, 2123, 2053, 2140, 2125, 2128, 2140, 2080, 2084, 2081, 2086, 2130, 2154, 2085, 2087, 2130, 2080, 2150, 2170, 2147, 2146, 2080, 2084, 931, 988, 963, 952, 932, 908, 938, 948, 902, 933, 955, 910, 986, 901, 927, 935, 980, 981, 953, 904, 939, 925, 929, 907, 937, 903, 936, 952, 949, 896, 908, 900, 942, 989, 990, 991, 940, 906, 957, 916, 949, 911, 990, 948, 929, 949, 921, 957, 917, 901, 936, 949, 951, 943, 986, 916, 949, 929, 920, 908, 981, 932, 902, 938, 987, 902, 988, 896, 958, 958, 922, 953, 907, 906, 930, 917, 953, 954, 956, 953, 987, 901, 936, 922, 981, 931, 943, 959, 948, 922, 921, 989, 957, 962, 937, 910, 987, 920, 990, 958, 926, 899, 933, 956, 929, 956, 940, 942, 917, 981, 976, 966, 927, 902, 909, 921, 901, 904, 912, 966, 400, 470, 458, 467, 466, 2877, 2938, 2929, 2940, 2925, 2918, 2927, 2923, 2877, 2883, 2924, 2869, 2853, 2883, 2924, 2869, 2871, 2883, 2939, 2868, 2870, 1702, 1722, 1719, 1711, 1715, 1700, 1673, 1719, 1719, 1719, 1719, 1674, 1701, 1788, 1771, 1674, 1701, 1788, 1674, 1709, 1784, 1788, 1769, 1780, 1699, 1700, 1722, 1780, 1674, 1701, 1788, 1772, 1674, 1701, 1788, 1780, 1790, 1677, 1672, 1780, 1675, 1789, 1791, 1780, 736, 671, 640, 749, 758, 709, 731, 671, 759, 724, 749, 711, 751, 766, 747, 719, 727, 766, 709, 747, 706, 734, 728, 641, 726, 764, 704, 765, 734, 662, 663, 760, 765, 707, 670, 756, 706, 729, 662, 731, 765, 763, 747, 765, 749, 737, 727, 727, 715, 745, 713, 732, 748, 728, 716, 759, 714, 670, 760, 667, 717, 665, 767, 744, 746, 765, 730, 712, 733, 759, 738, 734, 739, 742, 736, 671, 726, 765, 724, 767, 749, 759, 749, 669, 705, 749, 744, 709, 751, 659, 659, 636, 637, 623, 516, 529, 1890, 1825, 1919, 1849, 1908, 1620, 1556, 1544, 1544, 1548, 1551, 1603, 1606, 1619, 1619, 1575, 1570, 1630, 1627, 1568, 1551, 1569, 1623, 1568, 1618, 1553, 1615, 1545, 1604, 1575, 1570, 1630, 1627, 1568, 1551, 1569, 1622, 1621, -31951, 27970, 21475, -30729, 2090, 2133, 2122, 2097, 2093, 2053, 2083, 2109, 2063, 2092, 2098, 2055, 2131, 2060, 2070, 2094, 2141, 2140, 2096, 2049, 2082, 2068, 2088, 2050, 2080, 2062, 2081, 2097, 2108, 2057, 2053, 2061, 2087, 2132, 2135, 2134, 2085, 2051, 2100, 2077, 2108, 2054, 2135, 2109, 2088, 2108, 2064, 2100, 2076, 2060, 2081, 2108, 2110, 2086, 2131, 2077, 2108, 2088, 2065, 2053, 2140, 2093, 2063, 2083, 2130, 2063, 2133, 2057, 2103, 2103, 2067, 2096, 2050, 2051, 2091, 2076, 2096, 2099, 2101, 2096, 2130, 2060, 2081, 2067, 2140, 2090, 2086, 2102, 2109, 2067, 2064, 2132, 2100, 2123, 2080, 2055, 2130, 2065, 2135, 2103, 2071, 2058, 2092, 2101, 2088, 2101, 2085, 2087, 2076, 2140, 2137, 3187, 3114, 3123, 3128, 3128, 3129, 3112, 3133, 3125, 3120, 3187, 2618, 2684, 2656, 2681, 2680, 1036, 1109, 2289, 2251, 2296, 2274, 2293, 2294, 2234, 2221, 2278, 2303, 2292, 2292, 2293, 2276, 2289, 2297, 2300, 2253, 2224, 2297, 2301, 2295, 1147, 1150, 1131, 1150, 1074, 1136, 1133, 1142, 1144, 1142, 1137, 1150, 1139, 546, 547, 
    562, 767, 739, 739, 743, 2552, 2482, 2539, 2535, 2534, 2556, 2537, 2529, 2534, 2555, 2464, 29192, 18243, 2465, 29167, 17572, -2699, 1430, 1423, 1464, 1408, 1423, 1410, 1424, 1424, 1481, 1502, 1408, 1420, 1421, 1431, 1414, 1421, 1431, 1468, 1468, 1427, 1423, 1410, 1434, 1423, 1418, 1424, 1431, 1470, 2868, 2861, 2939, 2857, 2848, 2866, 2921, 2848, 2842, 2857, 2867, 2852, 2855, 2923, 2940, 2871, 2862, 2853, 2865, 2861, 2848, 2872, 2844, 2920, 2520, 2530, 2513, 2507, 2524, 2527, 2451, 2436, 2511, 2518, 2525, 2505, 2517, 2520, 2496, 2532, 1995, 2001, 1990, 1989, 3184, 3188, 3185, 3112, 3121, 3130, 3118, 3122, 3135, 3111, 3185, 3190, 3184, 3188, 3169, 3191, 3074, 3184, 3126, 3114, 3123, 3122, 3184, 3188, 3044, 3057, 1075, 2938, 24004, 29779, 28225, 28626, 478, 417, 446, 453, 473, 497, 471, 457, 507, 472, 454, 499, 423, 504, 482, 474, 425, 424, 452, 501, 470, 480, 476, 502, 468, 506, 469, 453, 456, 509, 497, 505, 467, 416, 419, 418, 465, 503, 448, 489, 456, 498, 419, 457, 476, 456, 484, 448, 488, 504, 469, 456, 458, 466, 423, 489, 456, 476, 485, 497, 424, 473, 507, 471, 422, 507, 417, 509, 451, 451, 487, 452, 502, 503, 479, 488, 452, 455, 449, 452, 422, 504, 469, 487, 424, 478, 466, 450, 457, 487, 484, 416, 448, 447, 468, 499, 422, 485, 419, 451, 483, 510, 472, 449, 476, 449, 465, 467, 488, 424, 429, 528, 585, 592, 603, 587, 582, 591, 602, 528, 3165, 481, 423, 443, 418, 419, 2830, 2881, 2844, 2843, 2842, 2822, 2882, 2841, 2816, 2827, 2819, 2822, 2844, 2843, 2864, 2864, 2843, 2823, 2842, 2818, 2829, 593, 587, 604, 607, 2515, 2510, 2515, 2507, 2498, 2637, 2632, 2653, 2632, 2564, 2630, 2651, 2624, 2638, 2624, 2631, 2632, 2629, 3106, 3127, 1879, 1872, 1885, 1864, 1857, 1642, 1646, 1585, 1590, 1576, 1560, 1644, 1567, 1635, 1638, 1561, 1659, 1644, 1567, 1562, 1635, 1638, 1560, 1645, 1561, 1647, 1645, 1567, 1635, 1638, 1561, 1659, 1560, 1645, 1642, 1646, 892, 864, 864, 868, 3203, 3293, 3268, 3278, 3200, 3289, 3272, 3285, 3289, 2739, 2743, 2738, 2741, 2753, 2809, 2742, 2740, 2753, 2739, 2805, 2793, 2800, 2801, 2739, 2743, 2824, 2862, 2872, 2863, 2928, 2844, 2874, 2872, 2867, 2857, 1992, 2026, 2047, 2028, 2025, 2025, 2020, 1962, 1968, 1963, 1973, 1957, 1965, 2002, 2028, 2027, 2017, 2026, 2034, 2038, 1957, 1995, 2001, 1957, 1972, 1973, 1963, 1973, 1982, 1957, 2002, 2028, 2027, 1971, 1969, 1982, 1957, 2045, 1971, 1969, 1964, 1957, 1988, 2037, 2037, 2025, 2016, 2002, 2016, 2023, 1998, 2028, 2033, 1962, 1968, 1974, 1970, 1963, 1974, 1971, 1957, 1965, 1998, 1997, 2001, 1992, 1993, 1961, 1957, 2025, 2028, 2030, 2016, 1957, 1986, 2016, 2022, 2030, 2026, 1964, 1957, 1990, 2029, 2039, 2026, 2024, 2016, 1962, 1972, 1975, 1975, 1963, 1973, 1963, 1973, 1963, 1973, 1957, 2006, 2020, 2019, 2020, 2039, 2028, 1962, 1968, 1974, 1970, 1963, 1974, 1971, 2131, 2129, 2116, 2133, 2135, 2143, 2114, 2121, 2163, 2143, 2142, 2116, 2133, 2142, 2116, 2072, 2073, 2056, 2077, 2069, 2064, 2111, 2067, 2066, 2056, 2073, 2066, 2056, 257, 262, 260, 268, 298, 262, 263, 285, 268, 263, 285, 2934, 2922, 2919, 2943, 2915, 2932, 2885, 2921, 2920, 2930, 2915, 2920, 2930, 1561, 1551, 1547, 1560, 1545, 1538, 1577, 1541, 1540, 1566, 1551, 1540, 1566};

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String strM33 = C0009.m33(f100short, 0, 111, 580);
        sb.append(FishCrypto.v(strM33));
        sb.append(C0103.m408(f100short, 111, 12, 1349));
        sb.append(URLEncoder.encode(str, C0063.m249(f100short, 123, 5, 2796)));
        sb.append(C0091.m360(f100short, 128, 17, 1183));
        for (k kVar : X1.L(X1.X(sb.toString(), null, a()), "").Q(C0003.m10(f100short, 145, 21, 562))) {
            try {
                String strC = kVar.c(C0106.m422(f100short, 166, 4, 2902));
                String strC2 = kVar.c(C0072.m285(f100short, 170, 5, 1307));
                if (!strC2.isEmpty()) {
                    String strC3 = kVar.c(C0045.m177(f100short, 175, 13, 1224));
                    boolean zIsEmpty = strC3.isEmpty();
                    String strM75 = C0019.m75(f100short, 188, 2, 2591);
                    if (zIsEmpty) {
                        strC3 = kVar.c(C0006.m21(f100short, 190, 5, 1156)).replaceAll(C0045.m177(f100short, 195, 31, 2675), strM75);
                    }
                    if (!strC3.startsWith(C0092.m365(f100short, 226, 4, 1218)) && !strC3.isEmpty()) {
                        strC3 = FishCrypto.v(strM33) + strC3;
                    }
                    String strReplaceAll = strC.replaceAll(C0028.m108(f100short, 230, 16, 2342), strM75);
                    if (!strReplaceAll.isEmpty() && !strReplaceAll.equals(strC)) {
                        arrayList.add(new com.github.catvod.spider.merge.p001b.k(strReplaceAll, strC2, strC3));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] strArr = {C0104.m414(f100short, 246, 8, 1866), C0056.m223(f100short, 254, 9, 2383), C0044.m175(f100short, 263, 6, 2845), C0097.m386(f100short, 269, 7, 1560)};
        String[] strArr2 = {C0076.m301(f100short, 276, 2, 2755), C0090.m358(f100short, 278, 3, 1289), C0014.m54(f100short, 281, 2, 2955), C0135.m539(f100short, 283, 2, 1950)};
        for (int i = 0; i < 4; i++) {
            arrayList2.add(new com.github.catvod.spider.merge.p001b.b(strArr[i], strArr2[i], null));
        }
        String strM193 = C0049.m193(f100short, 285, 111, 2345);
        for (k kVar : X1.L(X1.X(FishCrypto.v(strM193), null, a()), "").Q(C0009.m33(f100short, 396, 21, 2049))) {
            try {
                String strC = kVar.c(C0095.m379(f100short, 417, 4, 2722));
                String strC2 = kVar.c(C0076.m301(f100short, 421, 5, 1604));
                if (!strC2.isEmpty()) {
                    String strC3 = kVar.c(C0101.m402(f100short, 426, 13, 1066));
                    boolean zIsEmpty = strC3.isEmpty();
                    String strM223 = C0056.m223(f100short, 439, 2, 2837);
                    if (zIsEmpty) {
                        strC3 = kVar.c(C0085.m339(f100short, 441, 5, 2145)).replaceAll(C0106.m422(f100short, 446, 31, 906), strM223);
                    }
                    if (!strC3.startsWith(C0049.m193(f100short, 477, 4, 3073)) && !strC3.isEmpty()) {
                        strC3 = FishCrypto.v(strM193) + strC3;
                    }
                    k kVarR = kVar.R(C0119.m473(f100short, 481, 9, 2088));
                    String strT = kVarR != null ? kVarR.T() : "";
                    String strReplaceAll = strC.replaceAll(C0117.m467(f100short, 490, 16, 2062), strM223);
                    if (!strReplaceAll.isEmpty() && !strReplaceAll.equals(strC)) {
                        arrayList.add(new com.github.catvod.spider.merge.p001b.k(strReplaceAll, strC2, strC3, strT));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList2, arrayList);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws UnsupportedEncodingException {
        String strI = AbstractC0280n1.i(str, str2, null, null);
        String strX = X1.X(FishCrypto.v(C0006.m21(f100short, 506, 111, 1005)) + C0019.m75(f100short, 617, 9, 1001) + str2 + C0120.m477(f100short, 626, 5, 446), null, a());
        Matcher matcher = Pattern.compile(C0133.m529(f100short, 631, 21, 2847)).matcher(strX);
        int i = matcher.find() ? Integer.parseInt(matcher.group(1)) : 0;
        Matcher matcher2 = Pattern.compile(C0053.m210(f100short, 652, 44, 1750), 32).matcher(strX);
        boolean zFind = matcher2.find();
        String strM516 = C0130.m516(f100short, 696, 91, 686);
        if (!zFind) {
            Matcher matcher3 = Pattern.compile(C0047.m186(f100short, 797, 33, 1660)).matcher(strX);
            if (!matcher3.find()) {
                return com.github.catvod.spider.merge.p001b.g.d(C0072.m285(f100short, 830, 4, 2770));
            }
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(FishCrypto.u(strM516, matcher3.group(1)));
            gVar.k();
            gVar.h(a());
            gVar.b(strI);
            return gVar.r();
        }
        String strGroup = matcher2.group(1);
        String strM75 = C0019.m75(f100short, 787, 5, 553);
        if (i == 2) {
            strGroup = URLDecoder.decode(new String(Base64.decode(strGroup, 0)), strM75);
        } else if (i == 1) {
            strGroup = URLDecoder.decode(strGroup, strM75);
        }
        if (!strGroup.contains(C0079.m314(f100short, 792, 5, 1868))) {
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C(FishCrypto.u(strM516, strGroup));
            gVar2.h(a());
            gVar2.b(strI);
            return gVar2.r();
        }
        com.github.catvod.spider.merge.p001b.g gVar3 = new com.github.catvod.spider.merge.p001b.g();
        gVar3.C(FishCrypto.u(strM516, strGroup));
        gVar3.k();
        gVar3.h(a());
        gVar3.b(strI);
        return gVar3.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        StringBuilder sb = new StringBuilder();
        String strM360 = C0091.m360(f100short, 834, 111, 2148);
        sb.append(FishCrypto.v(strM360));
        sb.append(C0130.m516(f100short, 945, 11, 3164));
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(com.github.catvod.spider.merge.D.b.m(sb, list.get(0), C0135.m539(f100short, 956, 5, 2580)), null, a()), "");
        String strM386 = C0097.m386(f100short, 961, 2, 1124);
        String strT = gVarL.Q(strM386).d() != null ? gVarL.Q(strM386).d().T() : "";
        k kVarR = gVarL.R(C0114.m454(f100short, 963, 22, 2192));
        String strC = kVarR != null ? kVarR.c(C0063.m249(f100short, 985, 13, 1055)) : "";
        if (strC.isEmpty() && kVarR != null) {
            strC = kVarR.c(C0093.m368(f100short, 998, 3, 593));
        }
        if (!strC.startsWith(C0130.m516(f100short, 1001, 4, 663)) && !strC.isEmpty()) {
            strC = FishCrypto.v(strM360).concat(strC);
        }
        k kVarR2 = gVarL.R(C0096.m382(f100short, 1005, 14, 2440));
        String strReplace = kVarR2 != null ? kVarR2.T().replace(C0087.m346(f100short, 1019, 3, 2671), "") : "";
        com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q(C0047.m186(f100short, 1022, 28, 1507));
        if (dVarQ.isEmpty()) {
            dVarQ = gVarL.Q(C0115.m459(f100short, 1050, 24, 2881));
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<E> it = dVarQ.iterator();
        if (it.hasNext()) {
            com.github.catvod.spider.merge.h0.d dVarQ2 = ((k) it.next()).Q(C0104.m414(f100short, 1074, 16, 2489));
            for (int i = 0; i < dVarQ2.size(); i++) {
                k kVar = (k) dVarQ2.get(i);
                String strT2 = kVar.T();
                String strReplaceAll = kVar.c(C0109.m432(f100short, 1090, 4, 1955)).replaceAll(C0137.m545(f100short, 1094, 24, 3166), C0076.m301(f100short, 1118, 2, 3008));
                if (sb2.length() > 0) {
                    sb2.append(C0128.m511(f100short, 1120, 1, 1040));
                }
                sb2.append(strT2);
                sb2.append(C0044.m175(f100short, 1121, 1, 2910));
                sb2.append(strReplaceAll);
            }
        }
        com.github.catvod.spider.merge.p001b.k kVar2 = new com.github.catvod.spider.merge.p001b.k();
        kVar2.n(list.get(0));
        kVar2.p(strC);
        kVar2.o(strT);
        kVar2.l(strReplace);
        String string = sb2.toString();
        kVar2.q(C0119.m473(f100short, 1122, 4, 2796));
        kVar2.r(string);
        AbstractC0280n1.p(strT);
        AbstractC0280n1.q(string);
        FishCrypto.c(kVar2);
        return com.github.catvod.spider.merge.p001b.g.s(kVar2);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String strM402 = C0101.m402(f100short, 1126, 111, 400);
        sb.append(FishCrypto.v(strM402));
        sb.append(C0139.m554(f100short, 1237, 9, 575));
        sb.append(str);
        sb.append(C0017.m65(f100short, 1246, 1, 3184));
        for (k kVar : X1.L(X1.X(com.github.catvod.spider.merge.D.b.m(sb, str2, C0055.m219(f100short, 1247, 5, 463)), null, a()), "").Q(C0139.m554(f100short, 1252, 21, 2927))) {
            try {
                String strC = kVar.c(C0103.m408(f100short, 1273, 4, 569));
                String strC2 = kVar.c(C0030.m116(f100short, 1277, 5, 2471));
                if (!strC2.isEmpty()) {
                    String strC3 = kVar.c(C0135.m539(f100short, 1282, 13, 2601));
                    boolean zIsEmpty = strC3.isEmpty();
                    String strM193 = C0049.m193(f100short, 1295, 2, 3078);
                    if (zIsEmpty) {
                        strC3 = kVar.c(C0097.m386(f100short, 1297, 5, 1828)).replaceAll(C0089.m355(f100short, 1302, 31, 1604), strM193);
                    }
                    if (!strC3.startsWith(C0126.m503(f100short, 1333, 4, 788)) && !strC3.isEmpty()) {
                        strC3 = FishCrypto.v(strM402) + strC3;
                    }
                    k kVarR = kVar.R(C0142.m567(f100short, 1337, 9, 3245));
                    String strT = kVarR != null ? kVarR.T() : "";
                    String strReplaceAll = strC.replaceAll(C0098.m390(f100short, 1346, 16, 2717), strM193);
                    if (!strReplaceAll.isEmpty() && !strReplaceAll.equals(strC)) {
                        arrayList.add(new com.github.catvod.spider.merge.p001b.k(strReplaceAll, strC2, strC3, strT));
                    }
                }
            } catch (Exception unused) {
            }
        }
        int i = Integer.parseInt(str2);
        int i2 = i + 1;
        return AbstractC0449a.c(i, i2, 20, i2 * 20, arrayList);
    }

    public static HashMap a() {
        return com.github.catvod.spider.merge.D.b.s(C0126.m503(f100short, 1362, 10, 2909), C0049.m193(f100short, 1372, 111, 1925));
    }

    public static String decodeBase64(String str) {
        return new String(Base64.decode(str, 0));
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0112.m445(f100short, 1483, 15, 2096));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0009.m33(f100short, 1498, 13, 2172));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0074.m292(f100short, 1511, 11, 361));
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
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0046.m182(f100short, 1522, 13, 2822));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0107.m427(f100short, 1535, 13, 1642));
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

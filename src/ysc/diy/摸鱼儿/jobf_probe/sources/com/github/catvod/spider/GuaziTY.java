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
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.T.C0046;
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
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.utils.C0143;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class GuaziTY extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f49short = {2332, 2331, 2304, 29281, -26780, 658, 670, 669, 609, 621, 622, 2383, 2374, 2374, 2397, 2379, 2376, 2373, 2373, -29772, 29188, 1353, 1354, 1368, 1344, 1358, 1375, 1353, 1354, 1351, 1351, 28689, 32764, 719, 688, 687, 742, 721, 711, 707, 704, 712, 754, 706, 736, 747, 754, 688, 710, 712, 751, 689, 759, 711, 695, 741, 739, 745, 708, 721, 747, 751, 758, 740, 756, 716, 719, 740, 751, 704, 721, 716, 757, 763, 744, 761, 710, 714, 711, 709, 751, 686, 682, 715, 692, 755, 716, 745, 725, 688, 760, 711, 708, 758, 708, 707, 741, 725, 688, 712, 746, 731, 686, 754, 731, 738, 726, 738, 713, 706, 760, 729, 758, 720, 747, 752, 736, 696, 691, 696, 689, 742, 700, 700, 1490, 1524, 1506, 1525, 1450, 1478, 1504, 1506, 1513, 1523, 1449, 1412, 1427, 1411, 1482, 1488, 1490, 1483, 1501, 1494, 1483, 1492, 1493, 1493, 737, 726, 725, 726, 705, 726, 705, 1659, 1639, 1639, 1635, 1577, 1596, 1596, 1604, 1625, 1658, 1609, 1643, 1631, 1611, 1618, 1569, 1597, 1648, 1660, 1662, 1596, 1491, 1424, 1486, 1416, 1477, 1368, 1281, 1358, 1354, 1351, 1281, 1305, 1281, 1186, 1277, 926, 927, 910, 923, 915, 918, 555, 556, 558, 550, 1758, 1729, 1755, 1729, 1756, 1729, 1734, 1743, 311, 312, 308, 316, 1048, 1102, 1099, 1048, 1232, 1244, 1225, 1246, 1237, 1250, 1230, 1225, 1244, 1225, 1224, 1230, 1250, 1236, 1235, 1243, 1234, 30124, 23072, 2476, 2473, 2486, 2469, 2463, 2476, 2473, 2478, 2469, 2665, 2615, 2673, 2620, 24804, 24951, 1360, 28430, 27756, 27937, 27826, 27900, 27362, 2818, 1300, 763, 764, 743, 3316, 3245, 3305, 3325, 3310, 3298, 3306, 3245, 3253, 3245, 3263, 3245, 3235, 3245, 3303, 3296, 3323, 3245, 3253, 3245, 3262, 3245, 3235, 3245, 3323, 3310, 3304, 3245, 3253, 3245, 3263, 3245, 3235, 3245, 3323, 3318, 3327, 3306, 3245, 3253, 3245, 3263, 3245, 3314, 1421, 1409, 1410, 2095, 2166, 2098, 2086, 2101, 2105, 2097, 2166, 2158, 2166, 2148, 2166, 2168, 2166, 2108, 2107, 2080, 2166, 2158, 2166, 2148, 2166, 2168, 2166, 2080, 2101, 2099, 2166, 2158, 2166, 2151, 2147, 2166, 2168, 2166, 2080, 2093, 2084, 2097, 2166, 2158, 2166, 2148, 2166, 2089, 737, 744, 744, 755, 741, 742, 747, 747, 1754, 1667, 1735, 1747, 1728, 1740, 1732, 1667, 1691, 1667, 1681, 1667, 1677, 1667, 1737, 1742, 1749, 1667, 1691, 1667, 1681, 1667, 1677, 1667, 1749, 1728, 1734, 1667, 1691, 1667, 1681, 1667, 1677, 1667, 1749, 1752, 1745, 1732, 1667, 1691, 1667, 1680, 1667, 1756, 2690, 2689, 2707, 2699, 2693, 2708, 2690, 2689, 2700, 2700, 2523, 2434, 2502, 2514, 2497, 2509, 2501, 2434, 2458, 2434, 2448, 2434, 2444, 2434, 2504, 2511, 2516, 2434, 2458, 2434, 2448, 2434, 2444, 2434, 2516, 2497, 2503, 2434, 2458, 2434, 2448, 2434, 2444, 2434, 2516, 2521, 2512, 2501, 2434, 2458, 2434, 2450, 2434, 2525, 1991, 1988, 2011, 1990, 1984, 1991, 2836, 2836, 2932, 2877, 2877, 2937, 2833, 2833, 2915, 2868, 2868, 1178, 1174, 1155, 1172, 1183, 1192, 1155, 1182, 1178, 1170, 841, 891, 855, 848, 837, 848, 849, 855, 2590, 2585, 2587, 2579, 2399, 2368, 2394, 2368, 2397, 2368, 2375, 2382, 2072, 2076, 2065, 1237, 1242, 1238, 1246, 2780, 2698, 2703, 2780, 2757, 2774, 2757, 2766, 2772, 2815, 2766, 2753, 2765, 2757, 592, 3284, 3288, 3277, 3290, 3281, 3302, 3274, 3277, 3288, 3277, 3276, 3274, 3302, 3280, 3287, 3295, 3286, 271, 275, 275, 279, 276, 349, 328, 328, 262, 279, 270, 329, 339, 337, 259, 338, 274, 266, 279, 268, 329, 260, 264, 266, 2513, 2498, 2513, 2522, 2496, 2539, 2520, 2523, 2515, 2523, 2165, 2166, 2174, 2166, 732, 731, 729, 721, 1786, 1765, 1791, 1765, 1784, 1765, 1762, 1771, 2124, 2135, 2126, 2126, 887, 880, 882, 890, 1542, 1558, 1562, 1543, 1552, 2840, 2823, 2845, 2823, 2842, 2823, 2816, 2825, 2336, 25300, 23302, 1964, 3027, 3025, 3012, 3029, 3031, 3039, 3010, 3017, 3059, 3039, 3038, 3012, 3029, 3038, 3012, 956, 952, 942, 978, 958, 959, 958, 978, 941, 950, 958, 942, 968, 941, 924, 921, 921, 916, 915, 922, 2289, 2293, 2275, 2838, 2823, 2836, 2823, 2827, 2819, 2834, 2819, 2836, 2007, 1960, 1975, 2043, 1996, 2016, 1962, 2038, 1960, 1960, 2002, 2015, 2030, 1952, 2014, 2038, 2044, 1963, 2045, 1987, 1961, 2026, 2024, 2008, 1960, 1995, 2005, 2046, 2028, 1970, 2032, 2014, 2028, 2015, 1952, 2011, 1984, 2008, 2027, 2043, 2000, 2043, 2035, 2035, 1999, 2038, 2001, 2028, 1997, 1952, 2011, 2011, 2032, 2006, 1999, 2010, 1993, 1996, 2037, 1964, 2008, 2011, 2007, 2042, 2002, 2046, 2040, 2038, 1997, 2033, 1994, 2027, 1964, 1962, 1994, 2010, 2028, 1966, 1967, 2030, 2030, 1963, 1993, 2046, 2010, 2001, 2035, 1997, 2046, 1956, 1956, 2029, 1954, 1971, 1952, 1971, 1983, 1975, 1958, 1975, 1952, 2031, 1977, 1975, 1963, 2354, 2324, 2306, 2325, 2378, 2342, 2304, 2306, 2313, 2323, 3290, 3294, 3293, 3265, 3265, 3269, 3226, 3206, 3227, 3204, 3207, 3227, 3205, 2558, 2546, 2547, 2537, 2552, 2547, 2537, 2480, 2537, 2532, 2541, 2552, 3326, 3311, 3311, 3315, 3318, 3324, 3326, 3307, 3318, 3312, 3313, 3248, 3303, 3250, 3304, 3304, 3304, 3250, 3321, 3312, 3309, 3314, 3250, 3306, 3309, 3315, 3322, 3313, 3324, 3312, 3323, 3322, 3323, 1919, 1913, 1903, 1912, 1831, 1914, 1894, 1899, 1918, 1900, 1893, 1912, 1895, 903, 924, 901, 901, 439, 440, 445, 433, 442, 416, 505, 418, 433, 422, 423, 445, 443, 442, 1336, 1317, 1339, 1317, 1338, 1317, 1338, 2477, 2466, 2471, 2475, 2464, 2490, 2531, 2477, 2470, 2479, 2464, 2464, 2475, 2466, 3023, 3028, 3024, 3038, 3029, 700, 697, 684, 697, 886, 2142, 2143, 2126, 2139, 2131, 2134, 2169, 2133, 2132, 2126, 2143, 2132, 2126, 2696, 2703, 2701, 2693, 2723, 2703, 2702, 2708, 2693, 2702, 2708, 2072, 2151, 2168, 2077, 2099, 2049, 2085, 2151, 2064, 2159, 2053, 2052, 2063, 2158, 2086, 2076, 2077, 2066, 2087, 2079, 2049, 2086, 2149, 2105, 2086, 2106, 2110, 2169, 2086, 2075, 2078, 2060, 2072, 2106, 2149, 2067, 2051, 2054, 2145, 2101, 2101, 2087, 2055, 2146, 2094, 2151, 2071, 2097, 2173, 2150, 2066, 2072, 2094, 2111, 2065, 2145, 2107, 2052, 2069, 2095, 2097, 2106, 2055, 2110, 2074, 2073, 2077, 2085, 2073, 2092, 2075, 2095, 
    2085, 2083, 2050, 2099, 2144, 2106, 2062, 2098, 2106, 2082, 2151, 2068, 2075, 2151, 2108, 2105, 2060, 2096, 2108, 2086, 2105, 2103, 2087, 2063, 2052, 2081, 2100, 2085, 2095, 2111, 2081, 2109, 2151, 2073, 2147, 2053, 2083, 2097, 2155, 2210, 2269, 2242, 2232, 2190, 2203, 2196, 2211, 2180, 2189, 2266, 2239, 2239, 2222, 2222, 2232, 2207, 2202, 2260, 2215, 2236, 2182, 2217, 2211, 2260, 2237, 2178, 2215, 2247, 2211, 2236, 2184, 2187, 2202, 2217, 2239, 2217, 2180, 2237, 2176, 2238, 2202, 2191, 2234, 2265, 2178, 2229, 2243, 2183, 2179, 2268, 2261, 2197, 2261, 2270, 2206, 2196, 2237, 2200, 2184, 2216, 2236, 2206, 2176, 2178, 2264, 2233, 2179, 2196, 2181, 2176, 2270, 2239, 2201, 2197, 2207, 2268, 2229, 2232, 2243, 2204, 2264, 2261, 2210, 2211, 2176, 2183, 2183, 2238, 2237, 2213, 2181, 2268, 2222, 2267, 2198, 2260, 2271, 2198, 2183, 2260, 2234, 2229, 2207, 2202, 2213, 2210, 2203, 2218, 2217, 2257, 2752, 2780, 2780, 2776, 1209, 2656, 2673, 2664, 3079, 3101, 3072, 3089, 1227, 1221, 1241, 1645, 1650, 1938, 1934, 1923, 1947, 1927, 1936, 1953, 1933, 1932, 1942, 1927, 1932, 1942, 270, 280, 284, 271, 286, 277, 318, 274, 275, 265, 280, 275, 265, 3283, 3269, 3265, 3282, 3267, 3272, 3299, 3279, 3278, 3284, 3269, 3278, 3284};
    public String a = C0073.m288(f49short, 547, 24, 359);
    public String b = "";
    public String c = "";

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return com.github.catvod.spider.merge.D.b.d();
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0059.m234(f49short, 0, 3, 2420), C0133.m529(f49short, 3, 2, 652), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0030.m116(f49short, 5, 3, 764), C0026.m102(f49short, 8, 3, 559), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0139.m554(f49short, 11, 8, 2345), C0014.m54(f49short, 19, 2, 1543), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0050.m199(f49short, 21, 10, 1323), C0003.m10(f49short, 31, 2, 3071), null));
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, new ArrayList());
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return searchContent(str, z);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strI = AbstractC0280n1.i(str, str2, null, null);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(FishCrypto.w(C0117.m467(f49short, 33, 91, 641), str2));
        HashMap map = new HashMap();
        map.put(C0122.m486(f49short, 124, 10, 1415), C0085.m339(f49short, 134, 14, 1509));
        map.put(C0091.m360(f49short, 148, 7, 691), C0130.m516(f49short, 155, 21, 1555));
        gVar.h(map);
        gVar.b(strI);
        if (str2.contains(C0126.m503(f49short, 176, 5, 1533))) {
            gVar.k();
        }
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        JSONObject jSONObject = new JSONObject(d(C0019.m75(f49short, 191, 6, 1018), C0112.m445(f49short, 181, 8, 1315) + str + C0128.m511(f49short, 189, 2, 1152)));
        JSONObject jSONObjectC = c(C0055.m219(f49short, 197, 4, 579), jSONObject);
        JSONObject jSONObjectC2 = c(C0097.m386(f49short, 201, 8, 1704), jSONObject);
        StringBuilder sb = new StringBuilder();
        String strM21 = C0006.m21(f49short, 209, 4, 345);
        sb.append(b(strM21, jSONObjectC));
        sb.append(C0092.m365(f49short, 213, 4, 1080));
        sb.append(b(strM21, jSONObjectC2));
        String string = sb.toString();
        String strE = e(b(C0143.m570(f49short, 217, 17, 1213), jSONObject), jSONObject);
        k kVar = new k();
        kVar.n(str);
        kVar.o(string);
        kVar.p(a(jSONObject));
        kVar.s(strE);
        kVar.l(strE);
        kVar.q(C0089.m355(f49short, 234, 2, 368));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C0030.m116(f49short, 236, 9, 2496));
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strB = b(C0046.m182(f49short, 245, 4, 2564), jSONObjectOptJSONObject);
                    if (!TextUtils.isEmpty(strB)) {
                        String strB2 = b(strM21, jSONObjectOptJSONObject);
                        StringBuilder sb2 = new StringBuilder();
                        if (TextUtils.isEmpty(strB2)) {
                            strB2 = C0009.m33(f49short, 249, 2, 1097);
                        }
                        sb2.append(strB2);
                        sb2.append(C0003.m10(f49short, 251, 1, 1396));
                        sb2.append(strB);
                        arrayList.add(sb2.toString());
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d(C0008.m31(f49short, 252, 6, 2444));
        }
        kVar.r(TextUtils.join(C0008.m31(f49short, 258, 1, 2849), arrayList));
        AbstractC0280n1.p(string);
        AbstractC0280n1.q(kVar.e());
        FishCrypto.c(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        if (!C0059.m234(f49short, 259, 1, 1317).equals(str2)) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        String strM193 = C0049.m193(f49short, 260, 3, 659);
        HashMap mapT = com.github.catvod.spider.merge.D.b.t(strM193, C0122.m486(f49short, 263, 44, 3215), C0092.m365(f49short, 307, 3, 1507), C0119.m473(f49short, 310, 45, 2132));
        mapT.put(C0006.m21(f49short, 355, 8, 647), C0116.m463(f49short, 363, 44, 1697));
        mapT.put(C0114.m454(f49short, 407, 10, 2784), C0114.m454(f49short, 417, 44, 2464));
        JSONArray jSONArray = new JSONArray(d(C0032.m126(f49short, 461, 6, 1972), (String) (mapT.containsKey(str) ? mapT.get(str) : mapT.get(strM193))));
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0104.m414(f49short, 467, 11, 2905), Locale.getDefault());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                long jOptLong = jSONObjectOptJSONObject.optLong(C0097.m386(f49short, 478, 10, 1271)) * 1000;
                if (jOptLong >= jCurrentTimeMillis && jSONObjectOptJSONObject.optInt(C0076.m301(f49short, 488, 8, 804)) < 2) {
                    JSONObject jSONObjectC = c(C0133.m529(f49short, 496, 4, 2678), jSONObjectOptJSONObject);
                    JSONObject jSONObjectC2 = c(C0049.m193(f49short, 500, 8, 2345), jSONObjectOptJSONObject);
                    String strB = b(C0028.m108(f49short, 508, 3, 2165), jSONObjectOptJSONObject);
                    StringBuilder sb = new StringBuilder();
                    String strM234 = C0059.m234(f49short, 511, 4, 1211);
                    sb.append(b(strM234, jSONObjectC));
                    sb.append(C0027.m105(f49short, 515, 4, 2812));
                    sb.append(b(strM234, jSONObjectC2));
                    String string = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b(C0010.m36(f49short, 519, 10, 2720), jSONObjectOptJSONObject));
                    String strM102 = C0026.m102(f49short, 529, 1, 624);
                    sb2.append(strM102);
                    sb2.append(simpleDateFormat.format(new Date(jOptLong)));
                    sb2.append(strM102);
                    sb2.append(e(b(C0091.m360(f49short, 530, 17, 3257), jSONObjectOptJSONObject), jSONObjectOptJSONObject));
                    String string2 = sb2.toString();
                    if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(string.trim())) {
                        arrayList.add(new k(strB, string, a(jSONObjectOptJSONObject), string2));
                    }
                }
            }
        }
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayList);
        gVarC.o(1, 1, arrayList.size(), arrayList.size());
        return gVarC.r();
    }

    public static String a(JSONObject jSONObject) {
        String strB = b(C0092.m365(f49short, 571, 10, 2484), jSONObject);
        boolean zIsEmpty = TextUtils.isEmpty(strB);
        String strM1 = C0001.m1(f49short, 581, 4, 2073);
        if (zIsEmpty) {
            strB = b(strM1, c(C0096.m382(f49short, 585, 4, 692), jSONObject));
        }
        return TextUtils.isEmpty(strB) ? b(strM1, c(C0028.m108(f49short, 589, 8, 1676), jSONObject)) : strB;
    }

    public static String b(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return "";
        }
        String strOptString = jSONObject.optString(str);
        return C0074.m292(f49short, 597, 4, 2082).equals(strOptString) ? "" : strOptString;
    }

    public static JSONObject c(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    public static String e(String str, JSONObject jSONObject) {
        JSONObject jSONObjectC = c(C0116.m463(f49short, 601, 4, 799), jSONObject);
        String strM486 = C0122.m486(f49short, 605, 5, 1653);
        int iOptInt = jSONObjectC.optInt(strM486);
        int iOptInt2 = c(C0104.m414(f49short, 610, 8, 2926), jSONObject).optInt(strM486);
        if (iOptInt <= 0 && iOptInt2 <= 0) {
            return str;
        }
        return str + C0140.m558(f49short, 618, 3, 2304) + iOptInt + C0081.m322(f49short, 621, 1, 1921) + iOptInt2;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0044.m175(f49short, 622, 15, 2992));
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

    public final String d(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        String strM210 = C0053.m210(f49short, 637, 20, 1021);
        Cipher cipher = Cipher.getInstance(strM210);
        String str3 = this.b;
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = str3.getBytes(charset);
        String strM365 = C0092.m365(f49short, 657, 3, 2224);
        cipher.init(1, new SecretKeySpec(bytes, strM365), new IvParameterSpec(this.c.getBytes(charset)));
        map.put(C0018.m70(f49short, 660, 9, 2918), Base64.encodeToString(cipher.doFinal(str2.getBytes(charset)), 2));
        String strN = com.github.catvod.spider.merge.D.b.n(new StringBuilder(), this.a, FishCrypto.v(C0018.m70(f49short, 669, 91, 1945)).concat(str), C0095.m379(f49short, 760, 14, 2002));
        HashMap mapT = com.github.catvod.spider.merge.D.b.t(C0118.m471(f49short, 774, 10, 2407), C0139.m554(f49short, 784, 13, 3253), C0070.m277(f49short, 797, 12, 2461), C0091.m360(f49short, 809, 33, 3231));
        mapT.put(C0076.m301(f49short, 842, 13, 1802), C0114.m454(f49short, 855, 4, 1001));
        mapT.put(C0098.m390(f49short, 859, 14, 468), C0135.m539(f49short, 873, 7, 1291));
        mapT.put(C0006.m21(f49short, 880, 14, 2510), "");
        mapT.put(C0139.m554(f49short, 894, 5, 3003), "");
        String strOptString = new JSONObject(X1.N(strN, map, mapT).a()).optString(C0063.m249(f49short, 899, 4, 728));
        try {
            Cipher cipher2 = Cipher.getInstance(strM210);
            cipher2.init(2, new SecretKeySpec(this.b.getBytes(charset), strM365), new IvParameterSpec(this.c.getBytes(charset)));
            return new String(cipher2.doFinal(Base64.decode(strOptString.replace(C0128.m511(f49short, 903, 1, 810), ""), 0)), charset);
        } catch (Exception unused) {
            return strOptString;
        }
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0091.m360(f49short, 904, 13, 2106));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0119.m473(f49short, 917, 11, 2784));
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
        this.b = FishCrypto.v(C0092.m365(f49short, 928, 111, 2134));
        this.c = FishCrypto.v(C0079.m314(f49short, 1039, 111, 2284));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strTrim = str.trim();
        boolean zStartsWith = strTrim.startsWith(C0070.m277(f49short, 1150, 4, 2728));
        String strM355 = C0089.m355(f49short, 1154, 1, 1174);
        if (zStartsWith) {
            while (strTrim.endsWith(strM355)) {
                strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
            }
            this.a = strTrim;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strTrim);
            String strOptString = jSONObject.optString(C0085.m339(f49short, 1155, 3, 2561));
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObject.optString(C0087.m346(f49short, 1158, 4, 3188));
            }
            if (!TextUtils.isEmpty(strOptString)) {
                while (strOptString.endsWith(strM355)) {
                    strOptString = strOptString.substring(0, strOptString.length() - 1);
                }
                this.a = strOptString;
            }
            String strOptString2 = jSONObject.optString(C0072.m285(f49short, 1162, 3, 1184));
            String strOptString3 = jSONObject.optString(C0009.m33(f49short, 1165, 2, 1540));
            if (!TextUtils.isEmpty(strOptString2)) {
                this.b = strOptString2;
            }
            if (TextUtils.isEmpty(strOptString3)) {
                return;
            }
            this.c = strOptString3;
        } catch (Exception unused) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0082.m325(f49short, 1167, 13, 2018));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0009.m33(f49short, 1180, 13, 381));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0087.m346(f49short, 1193, 13, 3232));
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

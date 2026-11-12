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
    public String a = "https://api.46d5umpk.com";
    public String b = "";
    public String c = "";

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return com.github.catvod.spider.merge.D.b.d();
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("hot", "热门", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("nba", "NBA", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("football", "足球", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("basketball", "篮球", null));
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, new ArrayList());
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return searchContent(str, z);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strI = AbstractC0280n1.i(str, str2, null, null);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(FishCrypto.w("N1.gPFBAIsCajs1GIn0vF6dbhEPjnweuMNenAPMtzixGKFDn/+J5rMhT1yFEwEBdT1IkZ/sZcWcHCyXwQjqa9290g==", str2));
        HashMap map = new HashMap();
        map.put("User-Agent", "Lavf/57.83.100");
        map.put("Referer", "http://WJiZxLXA2.com/");
        gVar.h(map);
        gVar.b(strI);
        if (str2.contains(".m3u8")) {
            gVar.k();
        }
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        JSONObject jSONObject = new JSONObject(d("detail", "{\"mid\":\"" + str + "\"}"));
        JSONObject jSONObjectC = c("home", jSONObject);
        JSONObject jSONObjectC2 = c("visiting", jSONObject);
        StringBuilder sb = new StringBuilder();
        String strM21 = "name";
        sb.append(b(strM21, jSONObjectC));
        sb.append(" vs ");
        sb.append(b(strM21, jSONObjectC2));
        String string = sb.toString();
        String strE = e(b("match_status_info", jSONObject), jSONObject);
        k kVar = new k();
        kVar.n(str);
        kVar.o(string);
        kVar.p(a(jSONObject));
        kVar.s(strE);
        kVar.l(strE);
        kVar.q("瓜子");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("live_line");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strB = b("m3u8", jSONObjectOptJSONObject);
                    if (!TextUtils.isEmpty(strB)) {
                        String strB2 = b(strM21, jSONObjectOptJSONObject);
                        StringBuilder sb2 = new StringBuilder();
                        if (TextUtils.isEmpty(strB2)) {
                            strB2 = "播放";
                        }
                        sb2.append(strB2);
                        sb2.append("$");
                        sb2.append(strB);
                        arrayList.add(sb2.toString());
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d("暂无播放数据");
        }
        kVar.r(TextUtils.join("#", arrayList));
        AbstractC0280n1.p(string);
        AbstractC0280n1.q(kVar.e());
        FishCrypto.c(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        if (!"1".equals(str2)) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        String strM193 = "hot";
        HashMap mapT = com.github.catvod.spider.merge.D.b.t(strM193, "{\"frame\":\"0\",\"hot\":\"1\",\"tag\":\"0\",\"type\":\"0\"}", "nba", "{\"frame\":\"0\",\"hot\":\"0\",\"tag\":\"37\",\"type\":\"0\"}");
        mapT.put("football", "{\"frame\":\"0\",\"hot\":\"0\",\"tag\":\"0\",\"type\":\"1\"}");
        mapT.put("basketball", "{\"frame\":\"0\",\"hot\":\"0\",\"tag\":\"0\",\"type\":\"2\"}");
        JSONArray jSONArray = new JSONArray(d("sports", (String) (mapT.containsKey(str) ? mapT.get(str) : mapT.get(strM193))));
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                long jOptLong = jSONObjectOptJSONObject.optLong("match_time") * 1000;
                if (jOptLong >= jCurrentTimeMillis && jSONObjectOptJSONObject.optInt("m_status") < 2) {
                    JSONObject jSONObjectC = c("home", jSONObjectOptJSONObject);
                    JSONObject jSONObjectC2 = c("visiting", jSONObjectOptJSONObject);
                    String strB = b("mid", jSONObjectOptJSONObject);
                    StringBuilder sb = new StringBuilder();
                    String strM234 = "name";
                    sb.append(b(strM234, jSONObjectC));
                    sb.append(" vs ");
                    sb.append(b(strM234, jSONObjectC2));
                    String string = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b("event_name", jSONObjectOptJSONObject));
                    String strM102 = " ";
                    sb2.append(strM102);
                    sb2.append(simpleDateFormat.format(new Date(jOptLong)));
                    sb2.append(strM102);
                    sb2.append(e(b("match_status_info", jSONObjectOptJSONObject), jSONObjectOptJSONObject));
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
        String strB = b("event_logo", jSONObject);
        boolean zIsEmpty = TextUtils.isEmpty(strB);
        String strM1 = "logo";
        if (zIsEmpty) {
            strB = b(strM1, c("home", jSONObject));
        }
        return TextUtils.isEmpty(strB) ? b(strM1, c("visiting", jSONObject)) : strB;
    }

    public static String b(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return "";
        }
        String strOptString = jSONObject.optString(str);
        return "null".equals(strOptString) ? "" : strOptString;
    }

    public static JSONObject c(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    public static String e(String str, JSONObject jSONObject) {
        JSONObject jSONObjectC = c("home", jSONObject);
        String strM486 = "score";
        int iOptInt = jSONObjectC.optInt(strM486);
        int iOptInt2 = c("visiting", jSONObject).optInt(strM486);
        if (iOptInt <= 0 && iOptInt2 <= 0) {
            return str;
        }
        return str + " 比分" + iOptInt + "-" + iOptInt2;
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

    public final String d(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        String strM210 = "AES/CBC/PKCS5Padding";
        Cipher cipher = Cipher.getInstance(strM210);
        String str3 = this.b;
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = str3.getBytes(charset);
        String strM365 = "AES";
        cipher.init(1, new SecretKeySpec(bytes, strM365), new IvParameterSpec(this.c.getBytes(charset)));
        map.put("parameter", Base64.encodeToString(cipher.doFinal(str2.getBytes(charset)), 2));
        String strN = com.github.catvod.spider.merge.D.b.n(new StringBuilder(), this.a, FishCrypto.v("N1.bUy3o11KFw9Goe2dZ0sqA1RLgu+iGuF9BYArbIbjjVoHuT9BBiOVCPUl5ABNcKgaoThSr53SCu76ww2PgCHjTg==").concat(str), "?parameter=key");
        HashMap mapT = com.github.catvod.spider.merge.D.b.t("User-Agent", "okhttp/3.12.0", "content-type", "application/x-www-form-urlencoded");
        mapT.put("user-platform", "null");
        mapT.put("client-version", "3.0.1.1");
        mapT.put("client-channel", "");
        mapT.put("token", "");
        String strOptString = new JSONObject(X1.N(strN, map, mapT).a()).optString("data");
        try {
            Cipher cipher2 = Cipher.getInstance(strM210);
            cipher2.init(2, new SecretKeySpec(this.b.getBytes(charset), strM365), new IvParameterSpec(this.c.getBytes(charset)));
            return new String(cipher2.doFinal(Base64.decode(strOptString.replace("\\", ""), 0)), charset);
        } catch (Exception unused) {
            return strOptString;
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
        super.init(context, str);
        this.b = FishCrypto.v("N1.KeWs1F9SRY8pJKDqIWp3oplh/pMHZNl3EUP7ccqQ4x1Ag+0DNxiG7mRCyglQhLOKsOzMysuTe6lXdlt1BM1joZfjpoaqYRwbsyiwk1O5Sug=");
        this.c = FishCrypto.v("N1.TbwxOha6SSBBTsv8KPjEO8QnK+OPdgvESEhQlRvcV5nY/ko09y92rxQtdDPrln4Uoxil2Suys0YT/p49NOlkkRQIi0B7z83zk8VYsvINwFE=");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strTrim = str.trim();
        boolean zStartsWith = strTrim.startsWith("http");
        String strM355 = "/";
        if (zStartsWith) {
            while (strTrim.endsWith(strM355)) {
                strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
            }
            this.a = strTrim;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strTrim);
            String strOptString = jSONObject.optString("api");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObject.optString("site");
            }
            if (!TextUtils.isEmpty(strOptString)) {
                while (strOptString.endsWith(strM355)) {
                    strOptString = strOptString.substring(0, strOptString.length() - 1);
                }
                this.a = strOptString;
            }
            String strOptString2 = jSONObject.optString("key");
            String strOptString3 = jSONObject.optString("iv");
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

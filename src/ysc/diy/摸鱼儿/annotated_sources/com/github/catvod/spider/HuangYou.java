package com.github.catvod.spider;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
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
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class HuangYou extends Spider {
    public final String a = UUID.randomUUID().toString().replace(C0101.m402(f52short, 249, 1, 735), "");
    public String b = "";

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f52short = {1577, 3133, 3122, 3109, 1554, 1551, 1566, 1558, 1544, 1189, 1192, 3242, 3237, 3241, 3233, 2025, 2022, 2019, 2043, 2026, 2045, 2044, 2695, 2688, 2690, 2698, 2956, 2953, 2963, 2964, 947, 948, 950, 958, 1436, 1433, 1411, 1412, 2574, 2591, 2562, 2574, 836, 853, 851, 849, 1442, 1460, 1456, 1443, 1458, 1465, 941, 932, 953, 934, 938, 959, 25117, 25854, 24819, 24928, -29251, 25550, 23919, -30341, -1198, -28759, -27245, -28789, 23309, 22035, -27561, -28008, 3061, 3042, 3060, 3048, 3051, 3057, 3042, 2644, 2639, 2635, 2629, 2638, 3194, 3197, 3171, 2326, 2311, 2324, 2325, 2307, 1635, 1646, 1642, 1647, 1646, 1657, 1597, 1584, 3083, 3082, 3099, 3086, 3078, 3075, 1134, 1143, 1148, 2467, 2476, 2464, 2472, 1373, 1348, 1358, 2684, 2667, 2659, 2671, 2684, 2661, 2685, 453, 473, 477, 462, 1404, 1391, 1400, 1404, 2937, 2939, 2924, 2935, 2922, 1713, 1724, 1703, 1712, 1718, 1697, 1722, 1703, 396, 384, 385, 411, 394, 385, 411, 2810, 2815, 2808, 2803, 2789, 2441, 2460, 2437, 2463, 2435, 2440, 2441, 2463, 2802, 2793, 2797, 2787, 2792, 2747, 702, 690, 697, 696, 946, 3310, 3310, 3310, 2341, 2360, 2357, 3291, 3274, 3276, 3278, 2519, 2500, 2515, 2519, 926, 898, 902, 917, 1891, 1900, 1889, 1907, 1907, 713, 718, 731, 718, 735, 2210, 2239, 2217, 2216, 2239, 2661, 2663, 2674, 2659, 2657, 2665, 2676, 2687, 604, 589, 589, 593, 596, 606, 604, 585, 596, 594, 595, 530, 599, 590, 594, 595, 518, 541, 606, 597, 604, 591, 590, 600, 585, 512, 584, 585, 603, 528, 517, 754, 1053, 1048, 1026, 1029, 1882, 1867, 1869, 1871, 1015, 998, 992, 994, 996, 1000, 1010, 1001, 1011, 1235, 1238, 1234, 1238, 1227, 2762, 2769, 2762, 2783, 2770, 557, 544, 1105, 1118, 1106, 1114, 2325, 2316, 2310, 1874, 1861, 1869, 1857, 1874, 1867, 1875, 24856, 26619, 21398, 22991, -30564, 24188, 28535, 27028, -32061, 25974, -31567, 27842, 937, 939, 956, 937, 952, 939, 956, 728, 719, 729, 735, 710, 734, 1922, 1934, 1935, 1941, 1924, 1945, 1941, 1205, 1209, 1208, 1186, 1215, 1208, 1187, 1203, 1834, 1835, 1826, 1839, 1847, 1809, 1827, 1853, 755, 763, 746, 758, 753, 762, 2832, 2834, 2819, 2836, 2835, 2829, 1789, 1776, 1780, 1777, 1776, 1767, 1766, 849, 846, 850, 853, 2042, 2006, 2007, 1997, 2012, 2007, 1997, 1940, 2029, 1984, 1993, 2012, 3158, 3143, 3143, 3163, 3166, 3156, 3158, 3139, 3166, 3160, 3161, 3096, 3165, 3140, 3160, 3161, 3084, 3095, 3156, 3167, 3158, 3141, 3140, 3154, 3139, 3082, 3138, 3139, 3153, 3098, 3087, 1982, 1971, 1976, 1957, 3142, 3140, 3157, 3116, 3072, 3073, 3099, 3082, 3073, 3099, 3138, 3131, 3094, 3103, 3082, 2503, 2520, 2517, 2516, 2526, 2462, 632, 620, 637, 624, 630, 566, 3053, 3056, 3045, 3047, 3061, 3058, 3052, 2385, 2388, 2374, 2397, 2334, 2381, 2392, 2393, 306, 318, 319, 290, 292, 316, 308, 1111, 1115, 1114, 1088, 1117, 1114, 1089, 1105, 744, 740, 741, 767, 750, 755, 767, 25655, 25300, -30333, 28214, 26573, 28321, 26516, 26428, 27175, 27844, -30829, 24614, 27654, 21865, -32287, -31837, 17006, -26060, 1862, 1860, 1873, 1856, 1858, 1866, 1879, 1884, 1894, 1866, 1867, 1873, 1856, 1867, 1873, 25812, 25143, 27378, 24882, 695, 735, 707, 707, 711, 695, 2345, 2347, 2364, 2337, 2343, 2342, 1235, 1219, 1221, 1230, 1221, 2921, 2936, 2923, 2936, 2932, 2922, 2172, 2160, 2161, 2155, 2170, 2151, 2155, 972, 961, 970, 983, 1758, 1753, 1740, 1753, 1752, 1758, 1546, 1543, 1539, 1542, 1543, 1552, 1553, 830, 809, 831, 828, 803, 802, 831, 809, 787, 825, 830, 800, 1414, 1529, 1510, 1534, 1439, 1408, 1437, 1528, 1507, 1469, 1438, 1451, 1442, 1420, 1438, 1464, 1424, 1441, 1413, 1415, 1532, 1528, 1533, 1452, 1470, 1471, 1438, 1455, 1410, 1444, 1451, 1471, 1453, 1412, 1520, 1466, 1426, 1421, 1424, 1410, 1445, 1455, 1417, 1410, 1444, 1436, 1433, 1419, 1419, 1443, 1465, 1507, 1434, 1449, 1421, 1455, 1528, 1528, 1452, 1412, 1466, 1450, 1423, 1449, 1471, 1521, 1456, 1453, 1411, 1440, 1423, 1417, 1469, 1453, 1422, 1466, 1467, 1465, 1409, 1468, 1530, 1450, 1529, 1443, 1457, 1420, 1425, 1456, 1455, 1525, 1525, 2109, 2114, 2141, 2066, 2052, 2057, 2075, 2140, 2076, 2081, 2064, 2076, 2106, 2110, 2079, 2083, 2090, 2075, 2119, 2051, 2085, 2114, 2059, 2079, 2071, 2058, 2083, 2066, 2055, 2100, 2059, 2079, 2069, 2122, 2068, 2072, 2089, 2100, 2098, 2101, 2065, 2097, 2059, 2086, 2140, 2055, 2119, 2115, 2098, 2140, 2100, 2052, 2070, 2057, 2105, 2081, 2072, 2071, 2085, 2140, 2113, 2054, 2074, 2113, 2065, 2119, 2069, 2091, 2114, 2119, 2112, 2051, 2054, 2096, 2104, 2083, 2119, 2055, 2082, 2102, 2085, 2096, 2074, 2113, 2065, 2091, 2049, 2058, 2066, 2097, 2064, 2049, 2072, 2082, 2079, 2119, 2106, 2119, 2053, 2050, 2073, 2100, 2074, 2104, 2136, 2079, 2082, 2069, 2122, 2083, 2085, 2087, 2104, 2051, 2101, 2111, 2078, 2140, 2102, 2136, 2079, 2085, 2105, 2077, 2105, 2110, 2087, 2073, 2113, 2084, 2089, 2049, 2106, 2079, 2111, 2082, 2075, 2101, 2089, 2118, 2053, 2101, 2096, 2087, 2083, 2072, 2098, 2076, 2064, 2073, 2086, 2057, 2052, 2126, 2126, 2875, 2884, 2907, 2846, 2836, 2847, 2843, 2834, 2832, 2865, 2868, 2821, 2910, 2864, 2892, 2879, 2871, 2820, 2878, 2836, 2885, 2845, 2822, 2845, 2863, 2885, 2867, 2870, 2882, 2850, 2870, 2828, 2867, 2893, 2822, 2866, 2819, 2871, 2848, 2847, 2849, 2851, 2836, 2882, 2823, 2852, 2848, 2851, 2847, 2845, 2849, 2879, 2838, 2842, 2822, 2833, 2820, 2887, 2839, 2885, 2875, 2886, 2892, 2892, 2844, 2874, 2845, 2864, 2867, 2851, 2820, 2853, 2874, 2855, 2874, 2910, 2892, 2868, 2816, 2883, 2845, 2883, 2821, 2906, 2821, 2822, 2878, 2833, 2880, 2840, 2884, 2823, 2874, 2864, 2847, 2832, 2850, 2847, 2884, 2832, 2866, 2843, 2866, 2835, 2823, 2840, 2886, 2860, 2893, 2842, 2888, 841, 822, 809, 864, 868, 872, 808, 869, 884, 819, 887, 823, 843, 812, 881, 878, 874, 842, 864, 872, 847, 852, 862, 841, 878, 820, 812, 862, 875, 847, 808, 873, 819, 885, 886, 874, 818, 830, 834, 819, 885, 808, 878, 831, 812, 886, 862, 864, 883, 894, 842, 838, 851, 866, 849, 862, 833, 836, 817, 844, 870, 830, 855, 845, 845, 861, 886, 894, 865, 855, 893, 862, 
    851, 884, 816, 872, 846, 881, 879, 895, 882, 836, 845, 819, 854, 820, 883, 831, 850, 855, 881, 885, 820, 847, 819, 873, 838, 855, 823, 875, 832, 823, 886, 832, 841, 882, 812, 808, 885, 864, 826, 1904, 1906, 1892, 1896, 1915, 1896, 1918, 1910, 1908, 1907, 1914, 571, 575, 1853, 1848, 1837, 1848, 3084, 3099, 3099, 3078, 3099, 28303, 26732, 24745, 27497, 20989, -31255, 26563, 24864, 21837, 24340, -30621, 23110, 22705, -29531, 28190, 26877, 23696, 22217, 18364, 21596, 28093, 27925, 24943, 26508, -29477, 27502, 21900, 23786, 24093, -30199, 25596, 25887, 1439, 1519, 1527, 1519, 1439, 28122, 21135, 21247, 25237, -27406, 31441, 3297, 3296, 3313, 3300, 3308, 3305, 3270, 3306, 3307, 3313, 3296, 3307, 3313, 2809, 2814, 2812, 2804, 2770, 2814, 2815, 2789, 2804, 2815, 2789, 1009, 1014, 1012, 1020, 975, 1008, 1021, 1020, 1014, 986, 1014, 1015, 1005, 1020, 1015, 1005, 1915, 1895, 1895, 1891, 2833, 1763, 1764, 1786, 25978, 25497, 793, 873, 881, 873, 793, 27484, 21513, 21625, 26329, 26225, 27722, 27305, 2601, 2649, 2625, 2649, 2601, 25196, 23865, 23881, 27939, -25788, 30055, 3111, 3131, 3126, 3118, 3122, 3109, 3092, 3128, 3129, 3107, 3122, 3129, 3107, 1009, 999, 995, 1008, 993, 1002, 961, 1005, 1004, 1014, 999, 1004, 1014, 411, 397, 393, 410, 395, 384, 427, 391, 390, 412, 397, 390, 412};
    public static final MediaType c = MediaType.parse(C0089.m355(f52short, 218, 31, 573));

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0045.m177(f52short, 0, 1, 1560));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayOptJSONArray = a(C0046.m182(f52short, 1, 3, 3155), new JSONObject()).optJSONArray(C0045.m177(f52short, 4, 5, 1659));
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString(C0070.m277(f52short, 9, 2, 1228));
                    arrayList.add(new com.github.catvod.spider.merge.p001b.b(strOptString, jSONObjectOptJSONObject.optString(C0070.m277(f52short, 11, 4, 3268)), null));
                    if (z) {
                        jSONObject.put(strOptString, jSONObjectOptJSONObject.optJSONArray(C0114.m454(f52short, 15, 7, 1935)));
                    }
                }
            }
        }
        return com.github.catvod.spider.merge.p001b.g.w(arrayList, c(a(C0017.m65(f52short, 22, 4, 2799), new JSONObject()).optJSONArray(C0045.m177(f52short, 26, 4, 3040))), jSONObject);
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        return com.github.catvod.spider.merge.p001b.g.y(c(a(C0089.m355(f52short, 30, 4, 987), new JSONObject()).optJSONArray(C0010.m36(f52short, 34, 4, 1520))));
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(C0117.m467(f52short, 38, 4, 2682), str);
        int iMax = 1;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        return b(a(C0047.m186(f52short, 46, 6, 1489), jSONObjectPut.put(C0092.m365(f52short, 42, 4, 820), iMax)));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strM516 = C0130.m516(f52short, 52, 6, 971);
        String strM223 = C0056.m223(f52short, 58, 16, 1118);
        String strSubstring = str2 == null ? "" : str2;
        try {
            int iIndexOf = strSubstring.indexOf(36);
            if (iIndexOf >= 0) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            JSONObject jSONObjectA = a(C0097.m386(f52short, 74, 7, 2951), new JSONObject().put(C0072.m285(f52short, 81, 5, 2592), strSubstring));
            String strOptString = jSONObjectA.optString(C0047.m186(f52short, 86, 3, 3087));
            if (TextUtils.isEmpty(strOptString)) {
                com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.C("");
                gVar.q(0);
                gVar.l(strM223);
                return gVar.r();
            }
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C(strOptString);
            gVar2.q(jSONObjectA.optInt(C0087.m346(f52short, 89, 5, 2406), 0));
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(C0044.m175(f52short, 94, 6, 1547));
            HashMap map = new HashMap();
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObjectOptJSONObject.optString(next));
                }
            }
            gVar2.h(map);
            if (!jSONObjectA.optString(strM516).isEmpty()) {
                gVar2.f(jSONObjectA.optString(strM516));
            }
            String strI = AbstractC0280n1.i(str, str2, null, null);
            if (!TextUtils.isEmpty(strI)) {
                gVar2.b(strI);
            }
            return gVar2.r();
        } catch (Exception unused) {
            com.github.catvod.spider.merge.p001b.g gVar3 = new com.github.catvod.spider.merge.p001b.g();
            gVar3.C("");
            gVar3.q(0);
            gVar3.l(strM223);
            return gVar3.r();
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        if (list == null || list.isEmpty() || list.get(0) == null || list.get(0).trim().isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        JSONObject jSONObject = new JSONObject();
        String str = list.get(0);
        String strM386 = C0097.m386(f52short, 100, 2, 1620);
        JSONObject jSONObjectA = a(C0011.m42(f52short, 102, 6, 3183), jSONObject.put(strM386, str));
        JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(C0120.m477(f52short, 108, 3, 1048));
        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        String strOptString = jSONObjectOptJSONObject.optString(strM386);
        String strM545 = C0137.m545(f52short, 111, 4, 2509);
        k kVar = new k(strOptString, jSONObjectOptJSONObject.optString(strM545), jSONObjectOptJSONObject.optString(C0105.m416(f52short, 115, 3, 1325)), jSONObjectOptJSONObject.optString(C0135.m539(f52short, 118, 7, 2574)));
        kVar.u(jSONObjectOptJSONObject.optString(C0135.m539(f52short, 125, 4, 444)));
        kVar.k(jSONObjectOptJSONObject.optString(C0140.m558(f52short, 129, 4, 1309)));
        kVar.j(jSONObjectOptJSONObject.optString(C0063.m249(f52short, 133, 5, 2840)));
        kVar.m(jSONObjectOptJSONObject.optString(C0116.m463(f52short, 138, 8, 1749)));
        kVar.l(jSONObjectOptJSONObject.optString(C0103.m408(f52short, 146, 7, 495)));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectA.optJSONArray(C0098.m390(f52short, 153, 5, 2710));
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray(C0073.m288(f52short, 158, 8, 2540));
                    ArrayList arrayList3 = new ArrayList();
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject3 != null) {
                                String strM546 = C0137.m545(f52short, 166, 5, 2694);
                                if (!jSONObjectOptJSONObject3.optString(strM546).isEmpty()) {
                                    arrayList3.add(jSONObjectOptJSONObject3.optString(strM545) + C0050.m199(f52short, 171, 1, 2719) + jSONObjectOptJSONObject3.optString(strM546));
                                }
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(jSONObjectOptJSONObject2.optString(strM545, jSONObjectOptJSONObject2.optString(C0032.m126(f52short, 172, 4, 733))));
                        arrayList2.add(TextUtils.join(C0105.m416(f52short, 176, 1, 913), arrayList3));
                    }
                }
            }
        }
        String strM511 = C0128.m511(f52short, 177, 3, 3274);
        kVar.q(TextUtils.join(strM511, arrayList));
        kVar.r(TextUtils.join(strM511, arrayList2));
        AbstractC0280n1.p(kVar.c());
        AbstractC0280n1.q(kVar.e());
        FishCrypto.c(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(C0044.m175(f52short, 180, 3, 2385), str);
        int iMax = 1;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put(C0097.m386(f52short, 183, 4, 3243), iMax);
        if (map != null) {
            String[] strArr = {C0125.m499(f52short, 195, 5, 1792), C0050.m199(f52short, 187, 4, 2486), C0130.m516(f52short, 191, 4, 999), C0126.m503(f52short, 200, 5, 698), C0006.m21(f52short, 205, 5, 2253)};
            for (int i = 0; i < 5; i++) {
                String str3 = strArr[i];
                String str4 = map.get(str3);
                if (!TextUtils.isEmpty(str4)) {
                    jSONObjectPut2.put(str3, str4);
                }
            }
        }
        return b(a(C0109.m432(f52short, 210, 8, 2566), jSONObjectPut2));
    }

    public static String b(JSONObject jSONObject) {
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.F(c(jSONObject.optJSONArray(C0130.m516(f52short, 250, 4, 1137))));
        gVar.o(jSONObject.optInt(C0119.m473(f52short, 254, 4, 1834), 1), jSONObject.optInt(C0003.m10(f52short, 258, 9, 903), 1), jSONObject.optInt(C0059.m234(f52short, 267, 5, 1215), 30), jSONObject.optInt(C0070.m277(f52short, 272, 5, 2750), 0));
        return gVar.r();
    }

    public static ArrayList c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new k(jSONObjectOptJSONObject.optString(C0045.m177(f52short, 277, 2, 580)), jSONObjectOptJSONObject.optString(C0074.m292(f52short, 279, 4, 1087)), jSONObjectOptJSONObject.optString(C0104.m414(f52short, 283, 3, 2405)), jSONObjectOptJSONObject.optString(C0105.m416(f52short, 286, 7, 1824))));
                }
            }
        }
        return arrayList;
    }

    public static byte[] e(Response response, int i) throws IOException {
        if (response.body() == null) {
            return new byte[0];
        }
        long jContentLength = response.body().contentLength();
        long j = i;
        String strM402 = C0101.m402(f52short, 293, 6, 1883);
        if (jContentLength > j) {
            throw new IOException(strM402);
        }
        InputStream inputStreamByteStream = response.body().byteStream();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i2 = inputStreamByteStream.read(bArr);
                    if (i2 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStreamByteStream.close();
                        return byteArray;
                    }
                    if (byteArrayOutputStream.size() + i2 > i) {
                        throw new IOException(strM402);
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStreamByteStream != null) {
                try {
                    inputStreamByteStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static long f(long j) throws IOException {
        long jElapsedRealtime = j - SystemClock.elapsedRealtime();
        if (jElapsedRealtime > 0) {
            return Math.min(20000L, jElapsedRealtime);
        }
        throw new IOException(C0049.m193(f52short, 299, 6, 2356));
    }

    public final synchronized JSONObject a(String str, JSONObject jSONObject) {
        String str2;
        int i;
        try {
            String str3 = this.a;
            long jElapsedRealtime = SystemClock.elapsedRealtime() + 180000;
            String string = str3;
            int i2 = 0;
            while (i2 < 48 && SystemClock.elapsedRealtime() < jElapsedRealtime) {
                int i3 = i2;
                JSONObject jSONObjectD = d(C0074.m292(f52short, 305, 7, 985), str, jSONObject, string, "", 0, new JSONObject(), "", jElapsedRealtime);
                JSONObject jSONObjectOptJSONObject = jSONObjectD.optJSONObject(C0093.m368(f52short, 312, 6, 682));
                if (jSONObjectOptJSONObject != null) {
                    return jSONObjectOptJSONObject;
                }
                string = jSONObjectD.getString(C0137.m545(f52short, 318, 7, 2017));
                if (jSONObjectD.optBoolean(C0059.m234(f52short, 325, 8, 1238))) {
                    Thread.sleep(Math.min(f(jElapsedRealtime), Math.max(0, Math.min(1000, jSONObjectD.optInt(C0096.m382(f52short, 333, 8, 1870), 200)))));
                } else {
                    String strOptString = jSONObjectD.optString(C0026.m102(f52short, 341, 6, 670), C0097.m386(f52short, 347, 3, 2903));
                    Request.Builder builderUrl = new Request.Builder().url(jSONObjectD.getString(C0092.m365(f52short, 350, 3, 2913)));
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectD.optJSONObject(C0130.m516(f52short, 353, 7, 1685));
                    HashMap map = new HashMap();
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObjectOptJSONObject2.optString(next));
                        }
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        builderUrl.header((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (C0103.m408(f52short, 360, 4, 769).equals(strOptString)) {
                        String strHeader = builderUrl.build().header(C0053.m210(f52short, 364, 12, 1977));
                        if (strHeader == null) {
                            strHeader = C0107.m427(f52short, 376, 31, 3127);
                        }
                        builderUrl.post(RequestBody.create(MediaType.parse(strHeader), Base64.decode(jSONObjectD.getString(C0101.m402(f52short, 407, 4, 2012)), 0)));
                    } else {
                        if (!C0047.m186(f52short, 411, 3, 3073).equals(strOptString)) {
                            throw new IOException(C0072.m285(f52short, 475, 8, 628));
                        }
                        builderUrl.get();
                    }
                    byte[] bArrE = new byte[0];
                    JSONObject jSONObject2 = new JSONObject();
                    String string2 = "";
                    try {
                        Response responseK = X1.K(builderUrl.build(), f(jElapsedRealtime));
                        try {
                            int iCode = responseK.code();
                            string2 = responseK.request().url().toString();
                            for (String str4 : responseK.headers().names()) {
                                jSONObject2.put(str4, responseK.header(str4, ""));
                            }
                            String lowerCase = responseK.header(C0044.m175(f52short, 414, 12, 3183), "").toLowerCase(Locale.ROOT);
                            if (!lowerCase.startsWith(C0107.m427(f52short, 426, 6, 2481)) && !lowerCase.startsWith(C0017.m65(f52short, 432, 6, 537)) && !lowerCase.contains(C0079.m314(f52short, 438, 7, 2944)) && !lowerCase.contains(C0079.m314(f52short, 445, 8, 2357))) {
                                bArrE = e(responseK, 8388608);
                            }
                            responseK.close();
                            i = iCode;
                            str2 = string2;
                        } catch (Throwable th) {
                            if (responseK != null) {
                                try {
                                    responseK.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        str2 = string2;
                        i = 0;
                    }
                    JSONObject jSONObjectD2 = d(C0059.m234(f52short, 453, 7, 337), str, jSONObject, string, Base64.encodeToString(bArrE, 2), i, jSONObject2, str2, jElapsedRealtime);
                    if (!jSONObjectD2.optBoolean(C0011.m42(f52short, 460, 8, 1076))) {
                        return jSONObjectD2;
                    }
                    string = jSONObjectD2.getString(C0103.m408(f52short, 468, 7, 651));
                }
                i2 = i3 + 1;
            }
            throw new IOException(C0125.m499(f52short, 483, 10, 3172));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0091.m360(f52short, 493, 15, 1829));
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

    public final JSONObject d(String str, String str2, JSONObject jSONObject, String str3, String str4, int i, JSONObject jSONObject2, String str5, long j) throws IOException {
        String strM360 = C0091.m360(f52short, 508, 10, 663);
        if (this.b.isEmpty()) {
            throw new IOException(C0120.m477(f52short, 1091, 13, 1471));
        }
        String string = new JSONObject().put(C0049.m193(f52short, 518, 6, 2376), str).put(C0076.m301(f52short, 524, 5, 1184), str2).put(C0074.m292(f52short, 529, 6, 2841), jSONObject).put(C0049.m193(f52short, 535, 7, 2079), str3).put(C0030.m116(f52short, 542, 4, 942), str4).put(C0085.m339(f52short, 546, 6, 1709), i).put(C0142.m567(f52short, 552, 7, 1634), jSONObject2).put(C0043.m169(f52short, 559, 12, 844), str5).toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM503 = C0126.m503(f52short, 571, 91, 1480);
        String strM539 = C0135.m539(f52short, 662, 155, 2163);
        String strM379 = C0095.m379(f52short, 817, 111, 2933);
        String strM382 = C0096.m382(f52short, 928, 111, 775);
        byte[] bArrT = FishCrypto.t(strM379, strM382, strM503, strM539, bytes);
        if (bArrT == null) {
            throw new IOException(C0076.m301(f52short, 1083, 8, 1836));
        }
        JSONObject jSONObject3 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM301 = C0076.m301(f52short, 1039, 11, 1821);
        Response responseK = X1.K(new Request.Builder().url(this.b).post(RequestBody.create(c, jSONObject3.put(strM301, strEncodeToString).toString())).build(), f(j));
        try {
            if (!responseK.isSuccessful()) {
                throw new IOException(strM360 + responseK.code());
            }
            String str6 = new String(e(responseK, 16777216), charset);
            responseK.close();
            JSONObject jSONObject4 = new JSONObject(str6);
            if (jSONObject4.length() != 1 || !jSONObject4.has(strM301)) {
                throw new IOException(C0063.m249(f52short, 1075, 8, 2141));
            }
            byte[] bArrS = FishCrypto.s(strM379, strM382, Base64.decode(jSONObject4.getString(strM301), 0));
            if (bArrS == null) {
                throw new IOException(C0014.m54(f52short, 1067, 8, 384));
            }
            JSONObject jSONObject5 = new JSONObject(new String(bArrS, charset));
            if (jSONObject5.optBoolean(C0093.m368(f52short, 1050, 2, 596))) {
                return jSONObject5.getJSONObject(C0010.m36(f52short, 1052, 4, 1881));
            }
            throw new IOException(jSONObject5.optString(C0003.m10(f52short, 1056, 5, 3177), C0115.m459(f52short, 1061, 6, 2252)));
        } catch (Throwable th) {
            if (responseK != null) {
                try {
                    responseK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0120.m477(f52short, 1104, 13, 3205));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0056.m223(f52short, 1117, 11, 2705));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0072.m285(f52short, 1128, 16, 921));
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

    public void init(Context context, String str) throws Throwable {
        super.init(context, str);
        this.b = "";
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            throw new IOException(C0027.m105(f52short, 1164, 13, 2569));
        }
        boolean zStartsWith = strTrim.startsWith(C0027.m105(f52short, 1144, 4, 1811));
        String strM416 = C0105.m416(f52short, 1148, 1, 2922);
        if (!zStartsWith && !strTrim.startsWith(strM416)) {
            strTrim = FishCrypto.g(strTrim);
        }
        String strTrim2 = strTrim.trim();
        if (strTrim2.startsWith(strM416)) {
            strTrim2 = new JSONObject(strTrim2).optString(C0104.m414(f52short, 1149, 3, 1686), "").trim();
        }
        HttpUrl httpUrl = HttpUrl.parse(strTrim2);
        if (httpUrl == null || !httpUrl.username().isEmpty() || !httpUrl.password().isEmpty()) {
            throw new IOException(C0089.m355(f52short, 1152, 12, 825));
        }
        this.b = strTrim2;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0019.m75(f52short, 1177, 13, 3159));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0001.m1(f52short, 1190, 13, 898));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0053.m210(f52short, 1203, 13, 488));
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

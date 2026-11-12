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
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
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
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
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
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
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
import java.util.Locale;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class ZhiWo extends Spider {
    public String a = "";

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f120short = {1062, 1182, 1169, 1158, 2062, 2067, 2050, 2058, 2068, 2581, 2584, 2657, 2670, 2658, 2666, 3233, 3246, 3243, 3251, 3234, 3253, 3252, 397, 394, 392, 384, 3071, 3066, 3040, 3047, 1755, 1756, 1758, 1750, 3075, 3078, 3100, 3099, 2481, 2464, 2493, 2481, 2286, 2303, 2297, 2299, 3252, 3234, 3238, 3253, 3236, 3247, 1507, 1510, 1532, 1531, 797, 797, 1698, 1668, 1682, 1669, 1754, 1718, 1680, 1682, 1689, 1667, 1386, 1352, 1373, 1358, 1355, 1355, 1350, 1288, 1298, 1289, 1303, 1287, 1295, 1387, 1358, 1353, 1362, 1375, 1308, 1287, 1382, 1353, 1347, 1365, 1352, 1358, 1347, 1287, 1302, 1300, 1308, 1287, 1399, 1379, 1301, 1301, 1300, 1301, 1294, 1287, 1382, 1367, 1367, 1355, 1346, 1392, 1346, 1349, 1388, 1358, 1363, 1288, 1298, 1300, 1296, 1289, 1300, 1297, 1287, 1295, 1388, 1391, 1395, 1386, 1387, 1291, 1287, 1355, 1358, 1356, 1346, 1287, 1376, 1346, 1348, 1356, 1352, 1294, 1287, 1380, 1359, 1365, 1352, 1354, 1346, 1288, 1302, 1301, 1303, 1289, 1303, 1289, 1303, 1289, 1303, 1287, 1386, 1352, 1349, 1358, 1355, 1346, 1287, 1396, 1350, 1345, 1350, 1365, 1358, 1288, 1298, 1300, 1296, 1289, 1300, 1297, 1404, 1392, 1403, 1402, 2640, 2635, 2639, 2625, 2634, 2654, 2625, 2636, 726, 721, 731, 730, 711, 517, 530, 516, 536, 539, 513, 530, 2814, 2809, 2791, 1082, 1067, 1080, 1081, 1071, 2778, 2775, 2771, 2774, 2775, 2752, 25218, 25361, 20767, 20847, -28724, 25023, 24350, -29942, 1168, 1267, 2058, 2121, 2071, 2129, 2076, 2990, 2990, 2990, 2896, 2909, 3035, 3028, 3032, 3024, 885, 884, 869, 880, 888, 893, 1886, 1863, 1868, 1988, 2013, 2007, 2951, 2960, 2968, 2964, 2951, 2974, 2950, 1477, 1497, 1501, 1486, 1960, 1979, 1964, 1960, 2404, 2406, 2417, 2410, 2423, 3133, 3121, 3120, 3114, 3131, 3120, 3114, 2644, 2632, 2642, 2645, 2628, 2626, 2644, 2127, 2138, 2115, 2137, 2117, 2126, 2127, 2137, 2908, 2896, 2907, 2906, 623, 628, 624, 638, 629, 430, 435, 446, 1168, 1153, 1159, 1157, 1070, 1068, 1081, 1064, 1066, 1058, 1087, 1076, 2637, 2632, 2642, 2645, 1407, 1380, 1407, 1386, 1383, 1824, 1850, 1833, 1846, 1932, 1987, 2004, 1995, 2378, 2323, 2305, 2310, 2313, 1480, 1419, 1493, 1427, 1502, 2919, 2852, 2873, 2941, 457, 394, 396, 401, 2810, 2738, 2744, 2722, 1014, 940, 939, 2528, 2467, 2465, 2488, 2454, 2511, 2517, 2510, 1630, 1602, 1606, 1621, 2078, 2051, 2069, 2068, 2051, 729, 716, 714, 1441, 1458, 1445, 1441, 2107, 2102, 2105, 2096, 3291, 3270, 3280, 3281, 3270, 23028, -26508, -25972, -28688, 1129, 25454, 25054, 1107, 1050, 1031, 1027, 1035, 27551, 31858, 3234, 3319, 3318, 3307, 3308, -28819, 22191, 1172, 1242, 1226, 1222, 1243, 1228, 969, 980, 962, 963, 980, 26754, 21919, 1443, 1452, 1441, 1459, 1459, 2856, 2877, 2875, 30463, 23823, 1371, 1352, 1375, 1371, 24039, 23021, 3287, 3290, 3285, 3292, -28719, -29124, 1804, 1808, 1812, 1799, 23540, 19325, 770, 793, 797, 787, 792, 1400, 1380, 1380, 1376, 1322, 1343, 1343, 2991, 2995, 2995, 2999, 2996, 3069, 3048, 3048, 2483, 2512, 2447, 2871, 2874, 2849, 2870, 2864, 2855, 2573, 2577, 2577, 2581, 1080, 1066, 1069, 453, 453, 754, 767, 2845, 2834, 2846, 2838, 1189, 1212, 1206, 2135, 2112, 2120, 2116, 2135, 2126, 2134, 2043, 2626, 2638, 2639, 2645, 2632, 2639, 2644, 2628, 2585, 2581, 2580, 2574, 2591, 2562, 2574, 1952, 1959, 1977, 862, 860, 843, 862, 847, 860, 843, 3145, 3166, 3144, 3150, 3159, 3151, 621, 618, 615, 615, 617, 618, 616, 608, 1267, 1266, 1275, 1270, 1262, 1224, 1274, 1252, 1245, 1232, 1236, 1233, 1232, 1223, 1222, 1103, 1104, 1100, 1099, 1427, 1435, 1418, 1430, 1425, 1434, 2791, 2789, 2804, 3173, 3176, 3171, 3198, 2254, 2271, 2271, 2243, 2246, 2252, 2254, 2267, 2246, 2240, 2241, 2176, 2245, 2268, 2240, 2241, 2196, 2191, 2252, 2247, 2254, 2269, 2268, 2250, 2267, 2194, 2266, 2267, 2249, 2178, 2199, 29521, 26277, -28861, 26870, 19431, 19086, 32462, 3020, 3008, 3009, 3036, 3034, 3010, 3018, 28930, 25846, -29424, 27301, 20951, 20903, 18653, 31901, 32080, 26788, -32446, 26359, 27351, 21432, -30928, -31374, 17599, -25371, 1895, 1893, 1904, 1889, 1891, 1899, 1910, 1917, 1863, 1899, 1898, 1904, 1889, 1898, 1904, 499, 498, 483, 502, 510, 507, 468, 504, 505, 483, 498, 505, 483, 619, 617, 638, 611, 613, 612, 871, 887, 881, 890, 881, 573, 556, 575, 556, 544, 574, 1741, 1728, 1739, 1750, 1428, 1432, 1433, 1411, 1426, 1423, 1411, 385, 397, 396, 401, 407, 399, 391, 3267, 3268, 3281, 3268, 3269, 3267, 716, 707, 710, 714, 705, 731, 752, 731, 710, 706, 714, 3303, 3224, 3207, 3226, 3300, 3320, 3283, 3276, 3307, 3265, 3304, 3303, 3231, 3321, 3267, 3297, 3216, 3324, 3269, 3281, 3304, 3279, 3290, 3225, 3308, 3309, 3228, 3276, 3280, 3324, 3312, 3206, 3276, 3307, 3310, 3270, 3279, 3272, 3299, 3292, 3225, 3206, 3293, 3327, 3226, 3325, 3217, 3230, 3276, 3216, 3224, 3267, 3308, 3267, 3320, 3227, 3313, 3298, 3322, 3281, 3298, 3323, 3277, 3307, 3292, 3291, 3324, 3274, 3267, 3293, 3321, 3230, 3298, 3271, 3308, 3298, 3296, 3298, 3266, 3225, 3291, 3295, 3293, 3230, 3323, 3291, 3310, 3301, 3320, 3296, 3279, 3303, 3227, 3264, 3308, 3295, 3226, 3300, 3229, 3323, 3267, 3322, 3294, 3216, 3308, 3299, 3304, 3309, 3293, 3274, 3220, 1873, 1838, 1841, 1840, 1864, 1902, 1834, 1878, 1838, 1874, 1840, 1877, 1833, 1899, 1870, 1832, 1910, 1868, 1893, 1917, 1872, 1869, 1868, 1900, 1899, 1912, 1867, 1916, 1872, 1906, 1834, 1883, 1902, 1876, 1839, 1899, 1911, 1862, 1832, 1876, 1906, 1884, 1862, 1834, 1905, 1914, 1864, 1908, 1899, 1838, 1833, 1869, 1909, 1867, 1871, 1831, 1861, 1898, 1883, 1901, 1876, 1869, 1899, 1883, 1867, 1836, 1896, 1875, 1913, 1874, 1835, 1832, 1844, 1873, 1863, 1898, 1911, 1905, 1835, 1875, 1882, 1879, 1868, 1905, 1869, 1832, 1883, 1897, 1894, 1894, 1884, 1910, 1907, 1835, 1838, 1895, 1904, 1897, 1897, 1830, 1896, 1834, 1915, 1844, 1866, 1865, 1862, 1917, 1905, 1908, 1826, 2412, 2323, 2316, 2389, 2313, 2369, 2387, 2313, 2378, 2387, 2384, 2313, 2322, 2320, 2411, 2331, 2388, 2386, 2373, 2419, 2375, 2419, 2406, 2381, 2426, 2413, 2387, 2327, 2422, 2414, 2391, 2384, 2410, 2423, 2382, 2419, 2405, 2413, 2321, 2322, 2407, 2408, 2385, 2387, 2390, 2417, 2383, 2368, 
    2321, 2386, 2372, 2383, 2414, 2414, 2422, 2409, 2389, 2382, 2415, 2408, 2426, 2379, 2322, 2373, 2423, 2373, 2379, 2419, 2388, 2411, 2371, 2413, 2375, 2373, 2322, 2427, 2373, 2413, 2317, 2421, 2368, 2419, 2313, 2330, 2412, 2371, 2388, 2371, 2373, 2335, 2335, 2102, 2121, 2134, 2125, 2096, 2127, 2110, 2097, 2123, 2126, 2081, 2089, 2057, 2125, 2108, 2082, 2050, 2071, 2077, 2095, 2121, 2056, 2113, 2094, 2066, 2121, 2078, 2050, 2101, 2078, 2097, 2113, 2122, 2076, 2108, 2112, 2125, 2098, 2108, 2071, 2048, 2057, 2049, 2058, 2060, 2113, 2101, 2073, 2090, 2107, 2112, 2074, 2074, 2064, 2126, 2066, 2057, 2122, 2127, 2127, 2124, 2059, 2060, 2099, 2131, 2076, 2080, 2081, 2068, 2121, 2091, 2124, 2071, 2064, 2076, 2120, 2113, 2122, 2082, 2121, 2131, 2080, 2107, 2068, 2107, 2077, 2067, 2049, 2124, 2060, 2070, 2064, 2065, 2131, 2101, 2076, 2076, 2124, 2088, 2070, 2060, 2090, 2103, 2049, 2101, 2135, 2059, 2073, 2105, 2122, 2071, 2048, 2069, 2123, 2090, 2082, 2065, 2110, 2102, 2095, 2103, 2059, 2076, 2108, 2091, 2089, 2135, 2063, 2066, 2062, 2088, 2097, 2048, 2093, 2063, 2096, 2073, 2069, 2100, 2071, 2067, 2122, 2120, 2077, 2049, 2131, 2096, 2096, 2067, 2098, 2131, 2107, 2105, 2117, 2117, 1212, 1214, 1192, 1188, 1207, 1188, 1202, 1210, 1208, 1215, 1206, 277, 273, 1434, 1439, 1418, 1439, 30149, 24625, 25901, 20609, 26448, 24910, 19482, 30810, 2478, 2489, 2489, 2468, 2489, 29991, 24787, 26063, 20579, 23539, -28697, 28875, 25919, 21475, 22970, -28979, 23784, 24095, -30197, 31827, 27047, 24443, 21794, 20592, 28209, 17804, 29132, 32680, 27228, 23680, 22233, 18348, 21580, 28077, 27909, 28932, 25840, 25068, 21568, 25345, 21036, 22645, 32384, 27508, -32110, 25895, 23493, 21155, 20564, -31680, 32614, 27282, 28558, 23074, 24499, 24515, 28585, -26162, 30701, 1932, 1931, 1929, 1921, 1959, 1931, 1930, 1936, 1921, 1930, 1936, 1657, 1662, 1660, 1652, 1607, 1656, 1653, 1652, 1662, 1618, 1662, 1663, 1637, 1652, 1663, 1637, 882, 2964, 2952, 2952, 2956, 2991, 2985, 31668, 28224, 3185, 3124, 3113, 3109, 3185, -31310, 22423, 21856, -32396, 442, 445, 419, 1258, 29110, 25666, 1651, 1539, 1563, 1539, 1651, 28214, 20835, 20755, 25523, 25371, 32295, 27603, 2530, 2471, 2490, 2486, 2530, 18424, 29624, -2354, -24894, 20905, 22619, 2530, 2450, 2442, 2450, 2530, 24999, 24306, 24194, 2927, 2931, 2942, 2918, 2938, 2925, 2908, 2928, 2929, 2923, 2938, 2929, 2923, 805, 819, 823, 804, 821, 830, 789, 825, 824, 802, 819, 824, 802, 2990, 3000, 3004, 2991, 3006, 2997, 2974, 2994, 2995, 2985, 3000, 2995, 2985};
    public static final String[] b = {C0082.m325(f120short, 346, 5, 1510), C0089.m355(f120short, 351, 4, 2889), C0107.m427(f120short, 355, 4, 487), C0126.m503(f120short, 359, 4, 2772), C0114.m454(f120short, 363, 3, 984), C0018.m70(f120short, 366, 4, 2510), C0095.m379(f120short, 370, 4, 2488), C0142.m567(f120short, 337, 4, 1954), C0076.m301(f120short, 341, 5, 2404)};
    public static final String[] c = {C0076.m301(f120short, 383, 3, 685), C0063.m249(f120short, 386, 4, 1472), C0139.m554(f120short, 390, 4, 2135), C0107.m427(f120short, 374, 4, 1575), C0049.m193(f120short, 378, 5, 2161)};

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0010.m36(f120short, 0, 1, 1047));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = c(C0089.m355(f120short, 1, 3, 1264), new JSONObject()).optJSONArray(C0018.m70(f120short, 4, 5, 2151));
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString(C0090.m358(f120short, 9, 2, 2684));
                        arrayList.add(new com.github.catvod.spider.merge.p001b.b(strOptString, jSONObjectOptJSONObject.optString(C0001.m1(f120short, 11, 4, 2575)), null));
                        if (z) {
                            b(linkedHashMap, strOptString, jSONObjectOptJSONObject.optJSONObject(C0093.m368(f120short, 15, 7, 3271)));
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        try {
            arrayList2 = g(c(C0027.m105(f120short, 22, 4, 485), new JSONObject()).optJSONArray(C0026.m102(f120short, 26, 4, 2963)));
        } catch (Exception unused2) {
        }
        return com.github.catvod.spider.merge.p001b.g.A(arrayList, arrayList2, linkedHashMap);
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        try {
            return com.github.catvod.spider.merge.p001b.g.y(g(c(C0028.m108(f120short, 30, 4, 1715), new JSONObject()).optJSONArray(C0142.m567(f120short, 34, 4, 3183))));
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) throws JSONException {
        String str3 = str;
        JSONObject jSONObject = new JSONObject();
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put(C0073.m288(f120short, 38, 4, 2501), str3);
        jSONObject.put(C0059.m234(f120short, 42, 4, 2206), f(str2));
        ArrayList arrayList = new ArrayList();
        try {
            arrayList = g(c(C0085.m339(f120short, 46, 6, 3271), jSONObject).optJSONArray(C0112.m445(f120short, 52, 4, 1423)));
        } catch (Exception unused) {
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String str3;
        int iMax;
        String strOptString;
        int iOptInt;
        String str4 = str2;
        if (str4 == null) {
            str4 = "";
        }
        String[] strArrSplit = str4.split(C0103.m408(f120short, 56, 2, 861), -1);
        String strValueOf = strArrSplit.length > 0 ? strArrSplit[0] : "";
        int iIndexOf = strValueOf.indexOf(36);
        String strSubstring = iIndexOf >= 0 ? strValueOf.substring(iIndexOf + 1) : strValueOf;
        try {
            str3 = new String(Base64.decode(strSubstring, 0), StandardCharsets.UTF_8);
        } catch (Exception unused) {
            if (strSubstring == null) {
                strSubstring = "";
            }
            str3 = strSubstring;
        }
        String str5 = strArrSplit.length > 1 ? strArrSplit[1] : "";
        String str6 = strArrSplit.length > 5 ? strArrSplit[5] : "";
        if (strArrSplit.length > 3) {
            try {
                iMax = Math.max(0, Integer.parseInt(strArrSplit[3]));
            } catch (NumberFormatException unused2) {
                iMax = 0;
            }
        } else {
            iMax = 0;
        }
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(C0026.m102(f120short, 58, 10, 1783), C0044.m175(f120short, 68, 116, 1319));
        if (str3.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0126.m503(f120short, 184, 4, 1311), str6);
                jSONObject.put(C0011.m42(f120short, 188, 5, 2596), str3);
                jSONObject.put(C0081.m322(f120short, 193, 3, 2600), str5);
                jSONObject.put(C0143.m570(f120short, 196, 5, 703), iMax);
                JSONObject jSONObjectC = c(C0133.m529(f120short, 201, 7, 631), jSONObject);
                strOptString = jSONObjectC.optString(C0130.m516(f120short, 208, 3, 2699));
                try {
                    iOptInt = jSONObjectC.optInt(C0056.m223(f120short, 211, 5, 1098), 0);
                    try {
                        JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(C0026.m102(f120short, 216, 6, 2738));
                        if (jSONObjectOptJSONObject != null) {
                            mapS.clear();
                            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                mapS.put(next, jSONObjectOptJSONObject.optString(next));
                            }
                        }
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                    iOptInt = 0;
                }
            } catch (Exception unused5) {
                strOptString = "";
            }
        } else {
            strOptString = "";
            iOptInt = 0;
        }
        if (TextUtils.isEmpty(strOptString)) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C("");
            gVar.q(0);
            gVar.l(C0098.m390(f120short, 222, 8, 1583));
            return gVar.r();
        }
        com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
        gVar2.C(strOptString);
        gVar2.h(mapS);
        gVar2.q(iOptInt);
        if (strOptString != null) {
            String lowerCase = strOptString.toLowerCase(Locale.ROOT);
            String str7 = lowerCase.split(C0091.m360(f120short, 230, 2, 1228))[0];
            String strM368 = C0093.m368(f120short, 232, 5, 2084);
            if (str7.endsWith(strM368) || lowerCase.endsWith(strM368)) {
                gVar2.k();
            }
        }
        if (strArrSplit.length > 3) {
            strValueOf = String.valueOf(AbstractC0280n1.h(strArrSplit[3]) + 1);
        }
        String strI = AbstractC0280n1.i(str, strValueOf, null, null);
        if (strI != null && !strI.isEmpty()) {
            gVar2.b(strI);
        }
        return gVar2.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        JSONArray jSONArrayOptJSONArray;
        String str;
        int i;
        StringBuilder sb;
        String strM499 = C0125.m499(f120short, 237, 3, 2954);
        String strM126 = C0032.m126(f120short, 240, 2, 2873);
        String strM314 = C0079.m314(f120short, 242, 4, 2997);
        if (list == null || list.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        String str2 = list.get(0);
        if (str2 == null) {
            str2 = "";
        }
        try {
            try {
                JSONObject jSONObjectC = c(C0089.m355(f120short, 246, 6, 785), new JSONObject().put(strM126, str2));
                JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(C0049.m193(f120short, 252, 3, 1832));
                if (jSONObjectOptJSONObject == null) {
                    return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
                }
                k kVar = new k();
                kVar.n(jSONObjectOptJSONObject.optString(strM126, str2));
                kVar.o(jSONObjectOptJSONObject.optString(strM314, str2));
                kVar.p(jSONObjectOptJSONObject.optString(C0019.m75(f120short, 255, 3, 1972)));
                kVar.s(jSONObjectOptJSONObject.optString(C0105.m416(f120short, 258, 7, 3061)));
                kVar.u(jSONObjectOptJSONObject.optString(C0028.m108(f120short, 265, 4, 1468)));
                kVar.k(jSONObjectOptJSONObject.optString(C0072.m285(f120short, 269, 4, 1993)));
                kVar.j(jSONObjectOptJSONObject.optString(C0014.m54(f120short, 273, 5, 2309)));
                kVar.l(jSONObjectOptJSONObject.optString(C0115.m459(f120short, 278, 7, 3166)));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap map = new HashMap();
                JSONArray jSONArrayOptJSONArray2 = jSONObjectC.optJSONArray(C0087.m346(f120short, 285, 7, 2599));
                if (jSONArrayOptJSONArray2 != null) {
                    int i2 = 0;
                    while (i2 < jSONArrayOptJSONArray2.length()) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                        if (jSONObjectOptJSONObject2 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(C0115.m459(f120short, 292, 8, 2090))) == null || jSONArrayOptJSONArray.length() == 0) {
                            str = str2;
                            i = i2;
                        } else {
                            String strOptString = jSONObjectOptJSONObject2.optString(C0115.m459(f120short, 300, 4, 2879));
                            String strOptString2 = jSONObjectOptJSONObject2.optString(strM314);
                            if (TextUtils.isEmpty(strOptString2)) {
                                strOptString2 = strOptString;
                            }
                            Integer num = (Integer) map.get(strOptString2);
                            if (num == null) {
                                map.put(strOptString2, 1);
                            } else {
                                map.put(strOptString2, Integer.valueOf(num.intValue() + 1));
                                strOptString2 = strOptString2 + (num.intValue() + 1);
                            }
                            String str3 = strOptString2;
                            String strD = d(jSONArrayOptJSONArray);
                            StringBuilder sb2 = new StringBuilder();
                            int i3 = 0;
                            while (i3 < jSONArrayOptJSONArray.length()) {
                                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i3);
                                if (jSONObjectOptJSONObject3 == null) {
                                    sb = sb2;
                                } else {
                                    String strOptString3 = jSONObjectOptJSONObject3.optString(C0019.m75(f120short, 304, 5, 539));
                                    if (TextUtils.isEmpty(strOptString3)) {
                                        sb = sb2;
                                    } else {
                                        if (sb2.length() > 0) {
                                            sb2.append('#');
                                        }
                                        sb2.append(jSONObjectOptJSONObject3.optString(strM314));
                                        sb2.append('$');
                                        sb = sb2;
                                        sb.append(e(i3, strOptString3, str2, strD, jSONObjectOptJSONObject3.optString(strM314), strOptString));
                                    }
                                }
                                i3++;
                                str3 = str3;
                                sb2 = sb;
                                i2 = i2;
                                str2 = str2;
                                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                            }
                            str = str2;
                            StringBuilder sb3 = sb2;
                            String str4 = str3;
                            i = i2;
                            if (sb3.length() != 0) {
                                arrayList.add(str4);
                                arrayList2.add(sb3.toString());
                            }
                        }
                        i2 = i + 1;
                        str2 = str;
                    }
                }
                if (arrayList2.isEmpty()) {
                    return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
                }
                kVar.q(TextUtils.join(strM499, arrayList));
                kVar.r(TextUtils.join(strM499, arrayList2));
                FishCrypto.c(kVar);
                return com.github.catvod.spider.merge.p001b.g.s(kVar);
            } catch (Exception unused) {
                return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
            }
        } catch (Exception unused2) {
        }
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        Object obj = str;
        int iF = f(str2);
        JSONObject jSONObject = new JSONObject();
        if (obj == null) {
            obj = "";
        }
        jSONObject.put(C0032.m126(f120short, 309, 3, 474), obj);
        jSONObject.put(C0117.m467(f120short, 312, 4, 1248), iF);
        String[] strArr = c;
        int size = 0;
        for (int i = 0; i < 5; i++) {
            String str3 = strArr[i];
            String str4 = (map == null || TextUtils.isEmpty(map.get(str3))) ? "" : map.get(str3);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, str4);
            }
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 20;
        try {
            JSONObject jSONObjectC = c(C0101.m402(f120short, 316, 8, 1101), jSONObject);
            arrayList = g(jSONObjectC.optJSONArray(C0053.m210(f120short, 324, 4, 2593)));
            size = jSONObjectC.optInt(C0011.m42(f120short, 328, 5, 1291), 0);
            int iOptInt = jSONObjectC.optInt(C0097.m386(f120short, 333, 4, 1875), 20);
            if (iOptInt > 0) {
                i2 = iOptInt;
            }
        } catch (Exception unused) {
        }
        int iMax = size > 0 ? Math.max(1, ((size + i2) - 1) / i2) : arrayList.isEmpty() ? iF : iF + 1;
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayList);
        int size2 = arrayList.size();
        if (size <= 0) {
            size = arrayList.size();
        }
        gVarC.o(iF, iMax, size2, size);
        return gVarC.r();
    }

    public static void a(ArrayList arrayList, String str, String str2, String[] strArr) {
        if (strArr.length == 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!C0011.m42(f120short, 394, 5, 3252).equals(str)) {
            arrayList2.add(new com.github.catvod.spider.merge.p001b.c(C0117.m467(f120short, 399, 2, 2204), ""));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str3 : strArr) {
            String strTrim = str3.trim();
            if (!TextUtils.isEmpty(strTrim) && linkedHashSet.add(strTrim)) {
                int iIndexOf = strTrim.indexOf(61);
                arrayList2.add(iIndexOf < 0 ? new com.github.catvod.spider.merge.p001b.c(strTrim) : new com.github.catvod.spider.merge.p001b.c(strTrim.substring(0, iIndexOf), strTrim.substring(iIndexOf + 1)));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(new com.github.catvod.spider.merge.p001b.d(str, str2, arrayList2));
    }

    public static void b(LinkedHashMap linkedHashMap, String str, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        a(arrayList, C0049.m193(f120short, 426, 5, 934), C0050.m199(f120short, 431, 2, 2832), new String[]{C0135.m539(f120short, 401, 3, 1108), C0118.m471(f120short, 404, 7, 1134), C0106.m422(f120short, 411, 7, 3231), C0056.m223(f120short, 418, 8, 1193)});
        if (jSONObject != null) {
            a(arrayList, C0139.m554(f120short, 438, 3, 2908), C0059.m234(f120short, 441, 2, 2692), i(jSONObject.optString(C0126.m503(f120short, 433, 5, 1472))));
            String strM432 = C0109.m432(f120short, 443, 4, 1338);
            a(arrayList, strM432, C0053.m210(f120short, 447, 2, 2775), i(jSONObject.optString(strM432)));
            String strM102 = C0026.m102(f120short, 449, 4, 3259);
            a(arrayList, strM102, C0011.m42(f120short, 453, 2, 1084), i(jSONObject.optString(strM102)));
            String strM473 = C0119.m473(f120short, 455, 4, 1909);
            a(arrayList, strM473, C0047.m186(f120short, 459, 2, 1408), i(jSONObject.optString(strM473)));
        }
        linkedHashMap.put(str, arrayList);
    }

    public static String d(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(0);
        String strM31 = C0008.m31(f120short, 461, 5, 886);
        String strOptString = jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString(strM31);
        if (strOptString != null && (strOptString.startsWith(C0063.m249(f120short, 466, 7, 1296)) || strOptString.startsWith(C0021.m83(f120short, 473, 8, 3015)))) {
            String str = strOptString.split(C0050.m199(f120short, 481, 2, 2543))[0];
            String strM570 = C0143.m570(f120short, 483, 1, 2476);
            String str2 = str.split(strM570)[0];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            String lowerCase2 = strOptString.split(strM570)[0].toLowerCase(locale);
            String[] strArr = b;
            for (int i = 0; i < 9; i++) {
                String str3 = strArr[i];
                if (lowerCase.endsWith(str3) || lowerCase2.endsWith(str3)) {
                    return C0122.m486(f120short, 484, 6, 2899);
                }
            }
        }
        return strOptString.startsWith(C0019.m75(f120short, 490, 4, 2661)) ? C0097.m386(f120short, 494, 3, 1103) : strM31;
    }

    public static String e(int i, String str, String str2, String str3, String str4, String str5) {
        String str6 = str4;
        String str7 = str;
        StringBuilder sb = new StringBuilder();
        if (str7 == null) {
            str7 = "";
        }
        Charset charset = StandardCharsets.UTF_8;
        sb.append(Base64.encodeToString(str7.getBytes(charset), 2));
        String strM422 = C0106.m422(f120short, 497, 2, 389);
        sb.append(strM422);
        com.github.catvod.spider.merge.D.b.A(sb, str2, strM422, str3, strM422);
        sb.append(i);
        sb.append(strM422);
        if (str6 == null) {
            str6 = "";
        }
        sb.append(Base64.encodeToString(str6.getBytes(charset), 2));
        sb.append(strM422);
        sb.append(str5);
        return sb.toString();
    }

    public static int f(String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        try {
            return Math.max(1, Integer.parseInt(str2.trim()));
        } catch (Exception unused) {
            return 1;
        }
    }

    public static ArrayList g(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(new k(jSONObjectOptJSONObject.optString(C0139.m554(f120short, 499, 2, 667)), jSONObjectOptJSONObject.optString(C0010.m36(f120short, 501, 4, 2931)), jSONObjectOptJSONObject.optString(C0081.m322(f120short, 505, 3, 1237)), jSONObjectOptJSONObject.optString(C0026.m102(f120short, 508, 7, 2085))));
            }
        }
        return arrayList;
    }

    public static String[] i(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.split(C0125.m499(f120short, 515, 1, 2007));
    }

    public final JSONObject c(String str, JSONObject jSONObject) throws Exception {
        int i;
        String strM75 = C0019.m75(f120short, 516, 8, 2593);
        String strM102 = C0026.m102(f120short, 524, 7, 2682);
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 120000;
        String strOptString = "";
        JSONObject jSONObject2 = null;
        int i2 = 0;
        while (true) {
            String strM339 = C0085.m339(f120short, 531, 3, 2005);
            if (i2 >= 256) {
                break;
            }
            try {
                if (SystemClock.elapsedRealtime() >= jElapsedRealtime) {
                    break;
                }
                JSONObject jSONObjectH = h(C0074.m292(f120short, 534, 7, 814), str, jSONObject, "", strOptString, 0);
                JSONObject jSONObjectOptJSONObject = jSONObjectH.optJSONObject(C0049.m193(f120short, 541, 6, 3131));
                if (jSONObjectOptJSONObject != null) {
                    return jSONObjectOptJSONObject;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectH.optJSONObject(C0046.m182(f120short, 547, 8, 523));
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObject2 = jSONObjectOptJSONObject2;
                }
                String strOptString2 = jSONObjectH.optString(strM102, strOptString);
                if (jSONObjectH.optBoolean(strM75)) {
                    Thread.sleep(Math.max(0, Math.min(1000, jSONObjectH.optInt(C0119.m473(f120short, 555, 8, 1175), 200))));
                    strOptString = strOptString2;
                } else {
                    i2++;
                    String strOptString3 = jSONObjectH.optString(strM339);
                    if (TextUtils.isEmpty(strOptString3)) {
                        throw new IOException(C0047.m186(f120short, 632, 8, 1767));
                    }
                    Request.Builder builderUrl = new Request.Builder().url(strOptString3);
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectH.optJSONObject(C0137.m545(f120short, 563, 7, 1205));
                    if (jSONObjectOptJSONObject3 != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            builderUrl.header(next, jSONObjectOptJSONObject3.optString(next));
                        }
                    }
                    if (C0097.m386(f120short, 570, 4, 1055).equalsIgnoreCase(jSONObjectH.optString(C0096.m382(f120short, 574, 6, 1534), C0122.m486(f120short, 580, 3, 2720)))) {
                        String strOptString4 = jSONObjectH.optString(C0130.m516(f120short, 583, 4, 3079));
                        if (TextUtils.isEmpty(strOptString4)) {
                            throw new IOException(C0063.m249(f120short, 618, 7, 1204));
                        }
                        builderUrl.post(RequestBody.create(MediaType.parse(C0049.m193(f120short, 587, 31, 2223)), Base64.decode(strOptString4, 0)));
                    } else {
                        builderUrl.get();
                    }
                    byte[] bArrBytes = new byte[0];
                    try {
                        Response responseJ = X1.J(builderUrl.build(), 20000L);
                        try {
                            int iCode = responseJ.code();
                            bArrBytes = responseJ.body() == null ? new byte[0] : responseJ.body().bytes();
                            responseJ.close();
                            i = iCode;
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
                    } catch (IOException unused) {
                        i = 0;
                    }
                    JSONObject jSONObjectH2 = h(C0076.m301(f120short, 625, 7, 2991), str, jSONObject, Base64.encodeToString(bArrBytes, 2), strOptString2, i);
                    if (!jSONObjectH2.optBoolean(strM75)) {
                        return jSONObjectH2;
                    }
                    strOptString = jSONObjectH2.optString(strM102, strOptString2);
                }
            } catch (Exception e) {
                if (jSONObject2 == null || TextUtils.isEmpty(jSONObject2.optString(strM339))) {
                    throw e;
                }
                return jSONObject2;
            }
        }
        throw new IOException(C0142.m567(f120short, 640, 10, 2741));
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0045.m177(f120short, 650, 15, 1796));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0006.m21(f120short, 665, 13, 407));
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

    public final JSONObject h(String str, String str2, JSONObject jSONObject, String str3, String str4, int i) throws JSONException, IOException {
        String str5 = str3;
        JSONObject jSONObject2 = jSONObject;
        if (TextUtils.isEmpty(this.a)) {
            throw new IOException(C0112.m445(f120short, 1273, 9, 2179));
        }
        JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v(C0063.m249(f120short, 678, 6, 522), str, C0019.m75(f120short, 684, 5, 788), str2);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObjectV.put(C0116.m463(f120short, 689, 6, 589), jSONObject2);
        if (str5 == null) {
            str5 = "";
        }
        jSONObjectV.put(C0006.m21(f120short, 695, 4, 1711), str5);
        jSONObjectV.put(C0032.m126(f120short, 699, 7, 1527), str4);
        if (C0118.m471(f120short, 706, 7, 482).equals(str)) {
            jSONObjectV.put(C0003.m10(f120short, 713, 6, 3248), i);
        }
        jSONObjectV.put(C0130.m516(f120short, 719, 11, 687), System.currentTimeMillis() / 1000);
        String str6 = this.a;
        String string = jSONObjectV.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM223 = C0056.m223(f120short, 730, 111, 3241);
        String strM186 = C0047.m186(f120short, 841, 111, 1823);
        byte[] bArrT = FishCrypto.t(strM223, strM186, C0045.m177(f120short, 952, 91, 2338), C0003.m10(f120short, 1043, 155, 2168), bytes);
        if (bArrT == null) {
            throw new IOException(C0044.m175(f120short, 1265, 8, 2405));
        }
        JSONObject jSONObject3 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM382 = C0096.m382(f120short, 1198, 11, 1233);
        String strP = X1.P(str6, jSONObject3.put(strM382, strEncodeToString).toString());
        if (TextUtils.isEmpty(strP)) {
            throw new IOException(C0050.m199(f120short, 1258, 7, 1761));
        }
        JSONObject jSONObject4 = new JSONObject(strP);
        if (jSONObject4.length() != 1) {
            throw new IOException(C0112.m445(f120short, 1250, 8, 2125));
        }
        String strOptString = jSONObject4.optString(strM382);
        if (TextUtils.isEmpty(strOptString)) {
            throw new IOException(C0056.m223(f120short, 1242, 8, 2998));
        }
        byte[] bArrS = FishCrypto.s(strM223, strM186, Base64.decode(strOptString, 0));
        if (bArrS == null) {
            throw new IOException(C0093.m368(f120short, 1234, 8, 1838));
        }
        JSONObject jSONObject5 = new JSONObject(new String(bArrS, charset));
        if (!jSONObject5.optBoolean(C0117.m467(f120short, 1209, 2, 378))) {
            throw new IOException(jSONObject5.optString(C0074.m292(f120short, 1223, 5, 2507), C0105.m416(f120short, 1228, 6, 706)));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject5.optJSONObject(C0103.m408(f120short, 1211, 4, 1534));
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        throw new IOException(C0105.m416(f120short, 1215, 8, 544));
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0082.m325(f120short, 1282, 11, 2020));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0142.m567(f120short, 1293, 16, 1553));
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
        String strTrim = str == null ? "" : str.trim();
        if (TextUtils.isEmpty(strTrim)) {
            throw new IOException(C0045.m177(f120short, 1343, 21, 2498));
        }
        String strM365 = C0092.m365(f120short, 1309, 1, 777);
        boolean zStartsWith = strTrim.startsWith(strM365);
        String strM416 = C0105.m416(f120short, 1310, 4, 3068);
        if (!zStartsWith && !strTrim.startsWith(strM416)) {
            String strG = FishCrypto.g(strTrim);
            if (TextUtils.isEmpty(strG) || C0128.m511(f120short, 1314, 2, 3028).equals(strG.trim())) {
                throw new IOException(C0130.m516(f120short, 1316, 11, 3153));
            }
            strTrim = strG.trim();
        }
        if (strTrim.startsWith(strM365)) {
            strTrim = new JSONObject(strTrim).optString(C0056.m223(f120short, 1327, 3, 463), "").trim();
        }
        if (!strTrim.startsWith(strM416)) {
            throw new IOException(C0092.m365(f120short, 1331, 12, 1619));
        }
        while (strTrim.endsWith(C0126.m503(f120short, 1330, 1, 1221))) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
        }
        this.a = strTrim;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0056.m223(f120short, 1364, 13, 2847));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0017.m65(f120short, 1377, 13, 854));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0098.m390(f120short, 1390, 13, 3037));
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

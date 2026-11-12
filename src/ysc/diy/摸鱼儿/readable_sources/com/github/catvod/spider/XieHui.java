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
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.utils.C0143;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class XieHui extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f114short = {2061, 2289, 2302, 2281, 2016, 2045, 2028, 2020, 2042, 1062, 1067, 1159, 1160, 1156, 1164, 1825, 1830, 1828, 1836, 3112, 3117, 3127, 3120, 2988, 2987, 2985, 2977, 440, 445, 423, 416, 1797, 1811, 1815, 1796, 1813, 1822, 737, 752, 749, 737, 724, 709, 707, 705, 1406, 1385, 1407, 1379, 1376, 1402, 1385, 688, 683, 687, 673, 682, 964, 963, 989, 2496, 2526, 2506, 22847, 21537, -27035, -28502, -28785, 25084, 24413, -29879, -1696, -29285, -26719, -29255, 25722, 21611, 25870, 30931, -29821, 2466, 2483, 2464, 2465, 2487, 807, 810, 814, 811, 810, 829, 1971, 2029, 1963, 2022, 2002, 2011, 1990, 2009, 2005, 1984, 28364, 19089, 23256, 22470, -27262, -27827, -29592, 25115, 23738, -30546, -1401, -29060, 22460, 24635, -29075, 25934, 20869, -27578, -29090, 2206, 2206, 2206, 1097, 1106, 1110, 1112, 1107, 2649, 2644, 413, 402, 414, 406, 1184, 1185, 1200, 1189, 1197, 1192, 825, 800, 811, 1426, 1419, 1409, 1013, 994, 1002, 998, 1013, 1004, 1012, 1220, 1240, 1244, 1231, 1655, 1636, 1651, 1655, 1740, 1742, 1753, 1730, 1759, 2839, 2842, 2817, 2838, 2832, 2823, 2844, 2817, 2760, 2757, 2764, 2777, 2018, 2030, 2031, 2037, 2020, 2031, 2037, 2907, 2910, 2905, 2898, 2884, 1548, 1561, 1536, 1562, 1542, 1549, 1548, 1562, 434, 846, 834, 841, 840, 30234, -31414, 2382, 26436, 17177, -30747, 27846, -28748, 24533, 21810, -32474, -3313, -30732, -25138, -30762, 1545, 1547, 1566, 1551, 1549, 1541, 1560, 1555, 3304, 3317, 3320, 318, 303, 297, 299, 2668, 2685, 2683, 2681, 687, 702, 696, 698, 700, 688, 682, 689, 683, 1647, 1642, 1646, 1642, 1655, 3030, 3021, 3030, 3011, 3022, 275, 278, 268, 267, 985, 987, 973, 961, 978, 961, 983, 991, 989, 986, 979, 2288, 2191, 2192, 2286, 2263, 2191, 2250, 2294, 2246, 2255, 2284, 2299, 2256, 2246, 2248, 2279, 2287, 2301, 2295, 2279, 2252, 2257, 2279, 2184, 2251, 2267, 2286, 2295, 2283, 2287, 2193, 2297, 2244, 2261, 2296, 2267, 2292, 2259, 2247, 2259, 2184, 2287, 2279, 2300, 2197, 2252, 2250, 2280, 2257, 2303, 2263, 2247, 2287, 2253, 2260, 2244, 2187, 2293, 2250, 2278, 2276, 2268, 2244, 2295, 2276, 2252, 2182, 2189, 2256, 2269, 2189, 2298, 2288, 2185, 2261, 2287, 2182, 2292, 2294, 2271, 2189, 2266, 2276, 2283, 2187, 2182, 2184, 2265, 2185, 2191, 2190, 2300, 2191, 2301, 2290, 2281, 2183, 2257, 2293, 2252, 2290, 2244, 2264, 2188, 2257, 2267, 2286, 2280, 2281, 2186, 2179, 1453, 1490, 1485, 1489, 1457, 1415, 1490, 1488, 1455, 1416, 1488, 1457, 1489, 1431, 1424, 1484, 1448, 1457, 1446, 1431, 1460, 1440, 1428, 1453, 1422, 1451, 1444, 1413, 1490, 1428, 1446, 1466, 1408, 1458, 1461, 1480, 1457, 1440, 1488, 1426, 1451, 1466, 1462, 1462, 1420, 1427, 1408, 1442, 1433, 1433, 1451, 1447, 1467, 1457, 1442, 1488, 1423, 1458, 1419, 1493, 1414, 1452, 1435, 1415, 1413, 1480, 1412, 1408, 1418, 1445, 1422, 1410, 1426, 1491, 1488, 1480, 1414, 1446, 1424, 1415, 1459, 1410, 1465, 1425, 1457, 1425, 1455, 1446, 1425, 1445, 1491, 1408, 1452, 1456, 1418, 1457, 1452, 1419, 1427, 1418, 1435, 1490, 1424, 1416, 1423, 1480, 1422, 1408, 1466, 1420, 1502, 25176, 17925, 24018, 22411, -32516, 21209, 20526, -31686, 25495, 18378, 23581, 22084, 18225, 21713, 27952, 28056, 25206, 17963, 24060, 22437, -30986, 20502, 1655, 1658, 2387, 2396, 2384, 2392, 1513, 1520, 1530, 2711, 2688, 2696, 2692, 2711, 2702, 2710, 1592, 1594, 1581, 1592, 1577, 1594, 1581, 2423, 2400, 2422, 2416, 2409, 2417, 2710, 2714, 2715, 2689, 2704, 2701, 2689, 3070, 3065, 3047, 3087, 3074, 3078, 3075, 3074, 3093, 3092, 312, 304, 289, 317, 314, 305, 1046, 1044, 1029, 1453, 1458, 1454, 1449, 1055, 1075, 1074, 1064, 1081, 1074, 1064, 1137, 1032, 1061, 1068, 1081, 2978, 2995, 2995, 2991, 2986, 2976, 2978, 2999, 2986, 2988, 2989, 3052, 2985, 2992, 2988, 2989, 1335, 1338, 1329, 1324, 392, 407, 410, 411, 401, 465, 1050, 1038, 1055, 1042, 1044, 1108, 2759, 2778, 2767, 2765, 2783, 2776, 2758, 413, 408, 394, 401, 466, 385, 404, 405, 27068, 19937, -30452, 28345, 25280, 26381, -27477, 24329, 20683, 3319, 3323, 3322, 3303, 3297, 3321, 3313, 528, 540, 541, 519, 538, 541, 518, 534, 28325, 19192, -29163, 27040, 24667, 26935, 24578, 24746, 28258, 19007, -28974, 26983, -27885, 28304, -30560, -27787, 1299, 1297, 1284, 1301, 1303, 1311, 1282, 1289, 1331, 1311, 1310, 1284, 1301, 1310, 1284, 628, 629, 612, 625, 633, 636, 595, 639, 638, 612, 629, 638, 612, 1308, 1310, 1289, 1300, 1298, 1299, 1999, 2015, 2009, 2002, 2009, 2757, 2772, 2759, 2772, 2776, 2758, 1408, 1420, 1421, 1431, 1414, 1435, 1431, 448, 461, 454, 475, 1771, 1772, 1785, 1772, 1773, 1771, 945, 956, 952, 957, 956, 939, 938, 3269, 3282, 3268, 3271, 3288, 3289, 3268, 3282, 3304, 3266, 3269, 3291, 2475, 2490, 2490, 2470, 2467, 2473, 2475, 2494, 2467, 2469, 2468, 2533, 2464, 2489, 2469, 2468, 2545, 2538, 2473, 2466, 2475, 2488, 2489, 2479, 2494, 2551, 2495, 2494, 2476, 2535, 2546, 2093, 2130, 2125, 2099, 2058, 2130, 2071, 2091, 2075, 2066, 2097, 2086, 2061, 2075, 2069, 2106, 2098, 2080, 2090, 2106, 2065, 2060, 2106, 2133, 2070, 2054, 2099, 2090, 2102, 2098, 2124, 2084, 2073, 2056, 2085, 2054, 2089, 2062, 2074, 2062, 2133, 2098, 2106, 2081, 2120, 2065, 2071, 2101, 2060, 2082, 2058, 2074, 2098, 2064, 2057, 2073, 2134, 2088, 2071, 2107, 2105, 2049, 2073, 2090, 2105, 2065, 2139, 2128, 2061, 2048, 2128, 2087, 2093, 2132, 2056, 2098, 2139, 2089, 2091, 2050, 2128, 2055, 2105, 2102, 2134, 2139, 2133, 2052, 2132, 2130, 2131, 2081, 2130, 2080, 2095, 2100, 2138, 2060, 2088, 2065, 2095, 2073, 2053, 2129, 2060, 2054, 2099, 2101, 2100, 2135, 2142, 3297, 3230, 3201, 3229, 3325, 3275, 3230, 3228, 3299, 3268, 3228, 3325, 3229, 3291, 3292, 3200, 3300, 3325, 3306, 3291, 3320, 3308, 3288, 3297, 3266, 3303, 3304, 3273, 3230, 3288, 3306, 3318, 3276, 3326, 3321, 3204, 3325, 3308, 3228, 3294, 3303, 3318, 3322, 3322, 3264, 3295, 3276, 3310, 3285, 3285, 3303, 3307, 3319, 3325, 3310, 3228, 3267, 3326, 3271, 3225, 3274, 3296, 3287, 3275, 3273, 3204, 3272, 3276, 3270, 3305, 3266, 3278, 3294, 3231, 3228, 3204, 3274, 3306, 3292, 3275, 3327, 3278, 3317, 3293, 3325, 3293, 3299, 3306, 3293, 3305, 3231, 3276, 3296, 3324, 3270, 3325, 3296, 3271, 3295, 3270, 3287, 3230, 3292, 3268, 
    3267, 3204, 3266, 3276, 3318, 3264, 3218, 396, 499, 492, 431, 402, 436, 404, 440, 425, 489, 402, 436, 403, 425, 493, 489, 489, 385, 442, 396, 393, 429, 442, 493, 440, 426, 506, 440, 489, 384, 500, 426, 398, 420, 500, 420, 416, 423, 433, 390, 387, 500, 428, 392, 408, 388, 391, 402, 434, 411, 384, 401, 421, 434, 396, 406, 405, 439, 501, 422, 434, 397, 437, 439, 388, 501, 433, 421, 439, 489, 422, 394, 401, 421, 431, 388, 435, 426, 410, 428, 434, 437, 408, 399, 400, 416, 493, 422, 419, 426, 408, 439, 417, 442, 394, 501, 421, 387, 502, 387, 417, 407, 395, 416, 436, 396, 430, 428, 423, 403, 511, 1779, 1676, 1683, 1682, 1672, 1783, 1673, 1782, 1673, 1784, 1782, 1673, 1771, 1775, 1736, 1753, 1788, 1774, 1783, 1791, 1750, 1756, 1791, 1676, 1744, 1736, 1791, 1773, 1754, 1770, 1753, 1737, 1768, 1758, 1764, 1746, 1672, 1737, 1686, 1669, 1791, 1780, 1733, 1755, 1784, 1758, 1686, 1672, 1673, 1672, 1768, 1764, 1779, 1732, 1672, 1744, 1782, 1677, 1753, 1773, 1783, 1771, 1738, 1771, 1759, 1743, 1767, 1752, 1785, 1776, 1778, 1772, 1781, 1774, 1754, 1736, 1772, 1744, 1745, 1749, 1785, 1672, 1736, 1791, 1785, 1673, 1764, 1668, 1755, 1765, 1747, 1736, 1781, 1787, 1738, 1773, 1771, 1753, 1773, 1751, 1750, 1765, 1765, 1756, 1782, 1669, 1758, 1736, 1679, 1788, 1767, 1738, 1682, 1764, 1737, 1747, 1751, 1738, 1749, 1749, 1781, 1669, 1772, 1778, 1770, 1669, 1742, 1755, 1788, 1777, 1744, 1758, 1678, 1787, 1765, 1741, 1732, 1767, 1669, 1777, 1765, 1775, 1675, 1686, 1749, 1743, 1677, 1784, 1679, 1736, 1682, 1740, 1738, 1664, 1664, 1965, 1967, 1977, 1973, 1958, 1973, 1955, 1963, 1961, 1966, 1959, 2684, 2680, 1790, 1787, 1774, 1787, 2569, 2590, 2590, 2563, 2590, 25460, 18217, 28478, 23186, 20738, -31466, 26829, 19600, -30595, 28616, 25521, 26236, -27174, 24184, 20922, 24827, 17574, -32693, 26622, 22812, 20602, 21133, -31079, 24905, 17684, 27907, 22703, 23870, 23886, 27940, -25789, 30048, 1413, 1410, 1408, 1416, 1454, 1410, 1411, 1433, 1416, 1411, 1433, 445, 442, 440, 432, 387, 444, 433, 432, 442, 406, 442, 443, 417, 432, 443, 417, 1472, 1500, 1500, 1496, 26912, 19837, 25962, 20678, 21847, 21799, -29820, 22945, 23382, -28862, 26696, 19477, 25602, 20910, 21567, 21583, 26351, 26183, 27363, 20158, 26281, 21253, 22164, 22244, 20382, 31710, 1999, 2003, 2014, 1990, 2010, 1997, 2044, 2000, 2001, 1995, 2010, 2001, 1995, 2666, 2684, 2680, 2667, 2682, 2673, 2650, 2678, 2679, 2669, 2684, 2679, 2669, 2013, 1995, 1999, 2012, 1997, 1990, 2029, 1985, 1984, 2010, 1995, 1984, 2010};
    public String a = "";

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONArray jSONArrayOptJSONArray = a("nav", new JSONObject()).optJSONArray("items");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new com.github.catvod.spider.merge.p001b.b(jSONObjectOptJSONObject.optString("id"), jSONObjectOptJSONObject.optString("name"), null));
                    }
                }
            }
        } catch (Exception unused) {
        }
        try {
            return com.github.catvod.spider.merge.p001b.g.A(arrayList, g(a("home", new JSONObject()).optJSONArray("list")), linkedHashMap);
        } catch (Exception unused2) {
            return com.github.catvod.spider.merge.p001b.g.A(arrayList, Collections.emptyList(), linkedHashMap);
        }
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        try {
            return com.github.catvod.spider.merge.p001b.g.y(g(a("home", new JSONObject()).optJSONArray("list")));
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int iC = c(str2);
        try {
            return b(iC, a("search", new JSONObject().put("text", str).put("page", iC)));
        } catch (Exception unused) {
            List listEmptyList = Collections.emptyList();
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.o(iC, 1, 20, 0);
            gVar.F(listEmptyList);
            return gVar.r();
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws Throwable {
        try {
            JSONObject jSONObjectA = a("resolve", new JSONObject().put("token", str2 == null ? "" : str2));
            String strOptString = jSONObjectA.optString("url");
            if (strOptString.isEmpty()) {
                com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.C("");
                gVar.q(0);
                gVar.l(jSONObjectA.optString("msg", "当前选集解析失败，请重试或切换线路"));
                return gVar.r();
            }
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C(strOptString);
            gVar2.q(jSONObjectA.optInt("parse", 0));
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("header");
            HashMap map = new HashMap();
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObjectOptJSONObject.optString(next));
                }
            }
            gVar2.h(map);
            if ("m3u8".equals(jSONObjectA.optString("format"))) {
                gVar2.k();
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
            gVar3.l("歇会当前选集解析失败，请刷新详情后重试");
            return gVar3.r();
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        JSONArray jSONArray;
        String strM365 = "$$$";
        String strM454 = "token";
        String strM65 = "id";
        String strM322 = "name";
        if (list == null || list.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        try {
            int i = 0;
            JSONObject jSONObjectA = a("detail", new JSONObject().put(strM65, list.get(0)));
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("vod");
            if (jSONObjectOptJSONObject == null) {
                return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
            }
            k kVar = new k();
            kVar.n(jSONObjectOptJSONObject.optString(strM65, list.get(0)));
            kVar.o(jSONObjectOptJSONObject.optString(strM322));
            kVar.p(jSONObjectOptJSONObject.optString("pic"));
            kVar.s(jSONObjectOptJSONObject.optString("remarks"));
            kVar.u(jSONObjectOptJSONObject.optString("year"));
            kVar.k(jSONObjectOptJSONObject.optString("area"));
            kVar.j(jSONObjectOptJSONObject.optString("actor"));
            kVar.m(jSONObjectOptJSONObject.optString("director"));
            kVar.i(jSONObjectOptJSONObject.optString("type"));
            kVar.l(jSONObjectOptJSONObject.optString("content"));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectA.optJSONArray("lines");
            if (jSONArrayOptJSONArray != null) {
                int i2 = 0;
                while (i2 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject2 == null) {
                        jSONArray = jSONArrayOptJSONArray;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("episodes");
                        char c = '$';
                        if (jSONArrayOptJSONArray2 != null) {
                            while (i < jSONArrayOptJSONArray2.length()) {
                                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i);
                                if (jSONObjectOptJSONObject3 != null && !TextUtils.isEmpty(jSONObjectOptJSONObject3.optString(strM454))) {
                                    arrayList3.add(jSONObjectOptJSONObject3.optString(strM322).replace(c, ' ').replace('#', ' ') + "$" + jSONObjectOptJSONObject3.optString(strM454));
                                }
                                i++;
                                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                c = '$';
                            }
                        }
                        jSONArray = jSONArrayOptJSONArray;
                        if (!arrayList3.isEmpty()) {
                            arrayList.add(jSONObjectOptJSONObject2.optString(strM322, jSONObjectOptJSONObject2.optString("code", "线路")).replace('$', ' ').replace('#', ' '));
                            arrayList2.add(TextUtils.join("#", arrayList3));
                        }
                    }
                    i2++;
                    jSONArrayOptJSONArray = jSONArray;
                    i = 0;
                }
            }
            kVar.q(TextUtils.join(strM365, arrayList));
            kVar.r(TextUtils.join(strM365, arrayList2));
            AbstractC0280n1.p(kVar.c());
            AbstractC0280n1.q(kVar.e());
            FishCrypto.c(kVar);
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.p001b.g.d("歇会详情获取失败，请重试");
        }
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int iC = c(str2);
        try {
            return b(iC, a("category", new JSONObject().put("tid", str).put("page", iC)));
        } catch (Exception unused) {
            List listEmptyList = Collections.emptyList();
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.o(iC, 1, 20, 0);
            gVar.F(listEmptyList);
            return gVar.r();
        }
    }

    public static String b(int i, JSONObject jSONObject) {
        return AbstractC0449a.c(jSONObject.optInt("page", i), jSONObject.optInt("pagecount", 1), jSONObject.optInt("limit", 20), jSONObject.optInt("total", 0), g(jSONObject.optJSONArray("list")));
    }

    public static int c(String str) {
        try {
            return Math.max(1, Integer.parseInt(str));
        } catch (Exception unused) {
            return 1;
        }
    }

    public static JSONObject d(String str) throws IOException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.length() != 1) {
            throw new IOException("歇会响应信封无效");
        }
        byte[] bArrS = FishCrypto.s("N1.Pi1tHxqREnxvYQCIYroY6uePIUQ/GzkFeJmym6QYB+rtVoAiyQsjz5KtXZbzIZr83nc3DN7kQ8JHa3dZU586g710B1CLW9oKrLzf2oePVW4=", "N1.2Rd13Lk3R2ts/KREtWCwNmHGf1wEYcQV+RC3qHYUUopcAzzHDXRA3lQh6eOxdf+gciFmaq03+eEsdPaZrRrLErF0cOSiROhpix1skl+mcYo=", Base64.decode(jSONObject.getString("moyufucking"), 0));
        if (bArrS != null) {
            return new JSONObject(new String(bArrS, StandardCharsets.UTF_8));
        }
        throw new IOException("歇会响应解密失败");
    }

    public static byte[] f(Response response, int i) throws IOException {
        if (response.body() == null) {
            return new byte[0];
        }
        long jContentLength = response.body().contentLength();
        long j = i;
        String strM65 = "歇会响应过大";
        if (jContentLength > j) {
            throw new IOException(strM65);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamByteStream = response.body().byteStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i2 = inputStreamByteStream.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            if (byteArrayOutputStream.size() + i2 > i) {
                throw new IOException(strM65);
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public static ArrayList g(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new k(jSONObjectOptJSONObject.optString("id"), jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("pic"), jSONObjectOptJSONObject.optString("remarks")));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0284 A[LOOP:0: B:3:0x0013->B:65:0x0284, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x0283 A[SYNTHETIC] */
    public final JSONObject a(String str, JSONObject jSONObject) throws Throwable {
        String string;
        String str2;
        int i;
        JSONObject jSONObjectE;
        Throwable th;
        long jElapsedRealtime = 180000 + SystemClock.elapsedRealtime();
        int i2 = 0;
        String string2 = "";
        int i3 = 0;
        while (i3 < 16) {
            int i4 = i3;
            JSONObject jSONObjectE2 = e("prepare", str, jSONObject, string2, "", 0, new JSONObject(), "", jElapsedRealtime);
            JSONObject jSONObjectOptJSONObject = jSONObjectE2.optJSONObject("result");
            if (jSONObjectOptJSONObject != null) {
                return jSONObjectOptJSONObject;
            }
            String strM445 = "context";
            String string3 = jSONObjectE2.getString(strM445);
            Request.Builder builderUrl = new Request.Builder().url(jSONObjectE2.getString("url"));
            String strM75 = "headers";
            JSONObject jSONObjectOptJSONObject2 = jSONObjectE2.optJSONObject(strM75);
            if (jSONObjectOptJSONObject2 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    builderUrl.header(next, jSONObjectOptJSONObject2.getString(next));
                }
            }
            String strM463 = "method";
            String strM54 = "GET";
            String strOptString = jSONObjectE2.optString(strM463, strM54);
            boolean zEquals = "POST".equals(strOptString);
            String strM464 = "Content-Type";
            if (zEquals) {
                String strOptString2 = jSONObjectE2.optJSONObject(strM75) == null ? "" : jSONObjectOptJSONObject2.optString(strM464);
                if (strOptString2.isEmpty()) {
                    strOptString2 = "application/json";
                }
                builderUrl.post(RequestBody.create(MediaType.parse(strOptString2), Base64.decode(jSONObjectE2.optString("body", ""), i2)));
            } else if (!strM54.equals(strOptString)) {
                throw new IOException("歇会请求方法无效");
            }
            byte[] bArrF = new byte[i2];
            JSONObject jSONObject2 = new JSONObject();
            try {
                Request requestBuild = builderUrl.build();
                long jElapsedRealtime2 = jElapsedRealtime - SystemClock.elapsedRealtime();
                if (jElapsedRealtime2 <= 0) {
                    throw new IOException("歇会请求总时限已到");
                }
                Response responseK = X1.K(requestBuild, Math.min(30000L, jElapsedRealtime2));
                try {
                    int iCode = responseK.code();
                    string = responseK.request().url().toString();
                    try {
                        for (String str3 : responseK.headers().names()) {
                            jSONObject2.put(str3, responseK.header(str3));
                        }
                        String lowerCase = responseK.header(strM464, "").toLowerCase(Locale.ROOT);
                        if (!lowerCase.startsWith("video/") && !lowerCase.startsWith("audio/") && !lowerCase.contains("mpegurl") && !lowerCase.contains("dash+xml")) {
                            bArrF = f(responseK, 4194304);
                        }
                        try {
                            responseK.close();
                            i = iCode;
                            str2 = string;
                        } catch (IOException unused) {
                        }
                        jSONObjectE = e("consume", str, jSONObject, string3, Base64.encodeToString(bArrF, 2), i, jSONObject2, str2, jElapsedRealtime);
                        if (!jSONObjectE.optBoolean("continue")) {
                            return jSONObjectE;
                        }
                        string2 = jSONObjectE.getString(strM445);
                        i3 = i4 + 1;
                        i2 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        if (responseK != null) {
                            try {
                                responseK.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    string = "";
                }
            } catch (IOException unused2) {
                string = "";
            }
            bArrF = new byte[i2];
            str2 = string;
            i = 0;
            jSONObjectE = e("consume", str, jSONObject, string3, Base64.encodeToString(bArrF, 2), i, jSONObject2, str2, jElapsedRealtime);
            if (!jSONObjectE.optBoolean("continue")) {
                return jSONObjectE;
            }
            string2 = jSONObjectE.getString(strM445);
            i3 = i4 + 1;
            i2 = 0;
        }
        throw new IOException("歇会请求阶段超限");
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

    public final JSONObject e(String str, String str2, JSONObject jSONObject, String str3, String str4, int i, JSONObject jSONObject2, String str5, long j) throws JSONException, IOException {
        if (this.a.isEmpty()) {
            throw new IOException("歇会服务地址未配置");
        }
        JSONObject jSONObjectPut = new JSONObject().put("action", str).put("scene", str2).put("params", jSONObject).put("context", str3).put("body", str4).put("status", i).put("headers", jSONObject2).put("response_url", str5);
        Request.Builder builderUrl = new Request.Builder().url(this.a);
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        String string = jSONObjectPut.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bArrT = FishCrypto.t("N1.Pi1tHxqREnxvYQCIYroY6uePIUQ/GzkFeJmym6QYB+rtVoAiyQsjz5KtXZbzIZr83nc3DN7kQ8JHa3dZU586g710B1CLW9oKrLzf2oePVW4=", "N1.2Rd13Lk3R2ts/KREtWCwNmHGf1wEYcQV+RC3qHYUUopcAzzHDXRA3lQh6eOxdf+gciFmaq03+eEsdPaZrRrLErF0cOSiROhpix1skl+mcYo=", "N1.mPvVzk+PvQk/++CxNKox/zh8z+B6hLf6fbesDA6nJZFEPpYBSgpNTWu7dpOwuF7sgu+dHSgmFqhXnpwZMRb/dahZucxH7gA4AcUIbvNlneQ=", "N1./5J4K4EK4VRudASJBkaB1muBPgWdtUcYo5t+8BIxfEc+545UYNy5mK0dPJVwVbrZeDMOQHSguQmlhD5uBD4Y9fXnuHFwPVdPjkXXaK8cu2AZw/YtnjwhhH8QOW8sfALmc3FXpyZ8LXR6+hr0E2u/qw==", string.getBytes(charset));
        if (bArrT == null) {
            throw new IOException("歇会请求加密失败");
        }
        Request requestBuild = builderUrl.post(RequestBody.create(mediaType, new JSONObject().put("moyufucking", Base64.encodeToString(bArrT, 2)).toString())).build();
        long jElapsedRealtime = j - SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= 0) {
            throw new IOException("歇会请求总时限已到");
        }
        Response responseK = X1.K(requestBuild, Math.min(30000L, jElapsedRealtime));
        try {
            JSONObject jSONObjectD = d(new String(f(responseK, 12582912), charset));
            if (!jSONObjectD.optBoolean("ok")) {
                throw new IOException(jSONObjectD.optString("error", "歇会服务失败"));
            }
            JSONObject jSONObject3 = jSONObjectD.getJSONObject("data");
            responseK.close();
            return jSONObject3;
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

    public String homeVideoContent() {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "homeVideoContent");
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
        this.a = "";
        String strTrim = str != null ? str.trim() : "";
        if (strTrim.isEmpty()) {
            throw new IOException("歇会服务地址为空");
        }
        boolean z = !strTrim.startsWith("http");
        try {
            String strG = FishCrypto.g(strTrim);
            if (!TextUtils.isEmpty(strG)) {
                strTrim = strG.trim();
            } else if (z) {
                throw new IOException("歇会服务地址解密失败");
            }
        } catch (Exception e) {
            if (z) {
                throw e;
            }
        }
        HttpUrl httpUrl = HttpUrl.parse(strTrim);
        if (httpUrl == null || !httpUrl.username().isEmpty() || !httpUrl.password().isEmpty() || httpUrl.fragment() != null) {
            throw new IOException("歇会服务地址无效");
        }
        this.a = strTrim;
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

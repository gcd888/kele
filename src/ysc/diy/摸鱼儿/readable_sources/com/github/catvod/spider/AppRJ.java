package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
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
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.utils.C0143;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class AppRJ extends Spider {
    public String a = "";

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f12short = {1848, 1829, 1825, 1833, 1855, 1848, 1837, 1825, 1852, 1683, 1673, 1671, 1678, 1425, 1439, 1411, 1421, 1429, 1416, 1438, 1550, 1547, 1551, 1547, 1558, 585, 586, 943, 958, 952, 954, 2871, 2656, 2663, 2661, 2669, 2599, 2683, 2669, 2665, 2682, 2667, 2656, 2966, 2963, 2950, 2963, 3071, 3066, 3040, 3047, 2093, 2100, 2111, 2052, 2091, 2098, 2104, 2129, 2120, 2115, 2168, 2135, 2126, 2116, 2168, 2131, 2127, 2130, 2122, 2117, 2171, 2146, 2153, 2130, 2148, 2153, 1240, 1217, 1226, 1265, 1216, 1231, 1219, 1227, 1611, 1618, 1625, 1634, 1615, 1624, 1616, 1628, 1615, 1622, 1614, 662, 651, 655, 647, 657, 662, 643, 655, 658, 1608, 1618, 1628, 1621, 1368, 1365, 1372, 1353, 1283, 1368, 1347, 1372, 1395, 1368, 1365, 1372, 1353, 872, 877, 888, 877, 2267, 2270, 2244, 2243, 2495, 2482, 2491, 2478, 2452, 2466, 2479, 1306, 1303, 1310, 1291, 1329, 1280, 1295, 1283, 1291, 1607, 1626, 1622, 1607, 1612, 1606, 30296, 23976, 1632, 1651, 1636, 1632, 21504, 20490, 1257, 1269, 1265, 1250, 21946, 17715, 2405, 2408, 2407, 2414, -32693, -32346, 1581, 1570, 1583, 1597, 1597, 1565, 1597, 305, 1403, 1403, 2475, 1172, 1217, 1243, 1237, 1244, 1167, 807, 885, 872, 876, 868, 882, 885, 864, 876, 881, 828, 3296, 3287, 3284, 3287, 3264, 3287, 3264, 2404, 2403, 2429, 822, 802, 2370, 2373, 2395, 2314, 2399, 2371, 2371, 2375, 3129, 3197, 3172, 2510, 2435, 2451, 2451, 2158, 2088, 2100, 2093, 2092, 2905, 2885, 2885, 2881, 1152, 1190, 1200, 1191, 1272, 1172, 1202, 1200, 1211, 1185, 1960, 1973, 1969, 1977, 1967, 1960, 1981, 1969, 1964, 1732, 1758, 1744, 1753, 434, 427, 416, 411, 429, 416, 611, 612, 614, 622, 548, 637, 612, 623, 596, 623, 622, 639, 618, 610, 615, 632, 1368, 1373, 1352, 1373, 1596, 1573, 1582, 1557, 1572, 1579, 1575, 1583, 3055, 3062, 3069, 3014, 3049, 3056, 3066, 1155, 1178, 1169, 1194, 1157, 1180, 1174, 1194, 1153, 1181, 1152, 1176, 1175, 858, 835, 840, 883, 862, 841, 833, 845, 862, 839, 863, 1532, 1509, 1518, 1493, 1513, 1509, 1508, 1534, 1519, 1508, 1534, 843, 846, 19728, 829, -25419, 844, 869, 803, 800, 800, 800, 829, 13103, 844, 869, 886, 886, 800, 800, 829, 844, 869, 886, 886, 885, 886, 845, 556, 565, 574, 517, 547, 575, 571, 552, 2784, 2809, 2802, 2761, 2807, 2805, 2786, 2809, 2788, 1781, 1772, 1767, 1756, 1767, 1770, 1777, 1766, 1760, 1783, 1772, 1777, 2890, 2899, 2904, 2915, 2911, 2896, 2909, 2895, 2895, 1134, 1143, 1148, 1095, 1128, 1140, 1145, 1121, 1095, 1140, 1137, 1131, 1132, 2541, 2530, 2542, 2534, 1022, 1002, 1057, 1062, 1080, 1063, 2648, 2633, 2650, 2651, 2637, 2679, 2653, 2650, 2628, 2651, 2273, 1264, 1271, 1257, 2872, 2879, 2866, 1513, 1150, 881, 881, 371, 486, 486, 486, 460, 465, 469, 477, 459, 460, 473, 469, 456, 1540, 1566, 1552, 1561, 625, 636, 629, 608, 602, 620, 609, 2617, 2620, 2616, 2620, 2593, 1089, 1090, 2807, 2790, 2784, 2786, 2055, 2068, 2051, 2055, 2571, 2564, 2569, 2587, 2587, 2186, 2183, 2184, 2177, 485, 505, 509, 494, 432, 439, 437, 445, 503, 428, 417, 424, 445, 391, 427, 445, 441, 426, 443, 432, 2454, 2451, 2438, 2451, 745, 748, 758, 753, 2112, 2137, 2130, 2153, 2118, 2143, 2133, 2310, 2335, 2324, 2351, 2304, 2329, 2323, 2351, 2308, 2328, 2309, 2333, 2322, 1072, 1065, 1058, 1049, 1071, 1058, 582, 607, 596, 623, 606, 593, 605, 597, 2397, 2372, 2383, 2420, 2393, 2382, 2374, 2378, 2393, 2368, 2392, 2180, 2200, 2200, 2204, 2207, 2259, 2262, 2243, 2243, 2231, 2226, 2224, 2207, 2225, 2247, 2224, 2242, 2244, 2177, 2271, 2201, 2260, 2192, 2177, 2204, 2264, 2192, 2186, 2176, 2202, 2192, 2189, 2202, 2181, 2192, 2177, 2183, 2202, 2192, 2206, 2177, 2202, 2190, 2192, 2203, 2177, 2202, 2192, 2177, 2204, 2187, 2192, 2177, 2204, 2185, 2187, 2192, 2177, 2179, 2202, 2192, 2200, 2207, 2245, 2903, 2891, 2891, 2895, 2892, 2166, 2057, 2070, 2141, 2121, 2170, 2171, 2063, 2175, 2059, 2129, 2127, 2129, 2122, 2049, 2137, 2129, 2160, 2129, 2171, 2057, 2158, 2062, 2137, 2058, 2173, 2139, 2057, 2112, 2049, 2175, 2130, 2170, 2170, 2138, 2157, 2059, 2071, 2060, 2166, 2114, 2130, 2129, 2062, 2154, 2170, 2140, 2125, 2120, 2163, 2165, 2126, 2155, 2120, 2141, 2059, 2122, 2158, 2129, 2166, 2163, 2153, 2134, 2137, 2123, 2153, 2175, 2114, 2137, 2166, 2158, 2139, 2126, 2058, 2063, 2169, 2124, 2160, 2112, 2059, 2071, 2157, 2123, 2049, 2152, 2126, 2058, 2113, 2127, 2053, 2053, 2064, 2159, 2160, 2165, 2068, 2063, 2090, 2059, 2111, 2100, 2155, 2065, 2094, 2089, 2103, 2054, 2100, 2090, 2099, 2086, 2108, 2151, 2079, 2072, 2057, 2089, 2092, 2058, 2151, 2079, 2101, 2065, 2093, 2156, 2150, 2158, 2108, 2073, 2063, 2152, 2067, 2064, 2055, 2084, 2057, 2096, 2086, 2060, 2063, 2101, 2068, 2156, 2101, 2106, 2087, 2062, 2055, 2157, 2106, 2092, 2070, 2095, 2058, 2086, 2096, 2057, 2052, 2057, 2065, 2058, 2058, 2165, 2069, 2093, 2069, 2151, 2152, 2102, 2077, 2091, 2086, 2090, 2153, 2102, 2154, 2060, 2165, 2094, 2104, 2075, 2087, 2074, 2061, 2159, 2065, 2103, 2156, 2106, 2072, 2150, 2071, 2157, 2105, 2106, 2069, 2159, 2059, 2097, 2072, 2066, 2088, 2096, 2095, 2111, 2092, 2151, 2052, 2107, 2101, 2089, 2057, 2061, 2154, 2079, 2072, 2054, 2075, 2108, 2056, 2091, 2097, 1002, 995, 914, 1597, 1596, 1582, 1605, 1616, 454, 1637, 1639, 1650, 1635, 1633, 1641, 1652, 1663, 1605, 1641, 1640, 1650, 1635, 1640, 1650, 1821, 1890, 1917, 1815, 1846, 1803, 1841, 1916, 1810, 1916, 1916, 1916, 1894, 1889, 1823, 1829, 1815, 1855, 1894, 1817, 1892, 1793, 1853, 1849, 1820, 1799, 1852, 1810, 1797, 1824, 1893, 1849, 1835, 1822, 1850, 1842, 1899, 1799, 1855, 1828, 1797, 1796, 1821, 1822, 1826, 1889, 1818, 1831, 1813, 1854, 1891, 1829, 1855, 1844, 1798, 1853, 1821, 1831, 1852, 1892, 1797, 1820, 1801, 1840, 1835, 1833, 1844, 1834, 1825, 1810, 1916, 1851, 1809, 1889, 1797, 1834, 1824, 1820, 1792, 1822, 1847, 1796, 1889, 1849, 1798, 1794, 1889, 1799, 1844, 1902, 1902, 721, 759, 737, 758, 681, 709, 739, 737, 746, 752, 3318, 3314, 3313, 3309, 3309, 3305, 3252, 3318, 3314, 3326, 3318, 3254, 3315, 3324, 3320, 3306, 3318, 3319, 3317, 
    3299, 3296, 2766, 2767, 2782, 2763, 2755, 2758, 2793, 2757, 2756, 2782, 2767, 2756, 2782, 2145, 2150, 2148, 2156, 2122, 2150, 2151, 2173, 2156, 2151, 2173, 2564, 2563, 2589, 2770, 2766, 2755, 2779, 2759, 2768, 2785, 2765, 2764, 2774, 2759, 2764, 2774, 2247, 2257, 2261, 2246, 2263, 2268, 2295, 2267, 2266, 2240, 2257, 2266, 2240};
    public static final Pattern b = Pattern.compile("https?://[^\\s]+\\.(m3u8|mp4|flv|avi|mkv|rmvb|wmv|mpg|mpeg|mov|ts)");

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        String strC = c();
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("timestamp", strC);
        mapS.put("sign", b(strC));
        mapS.put("keyword", str);
        mapS.put("limit", "12");
        mapS.put("page", "1");
        JSONArray jSONArrayOptJSONArray = new JSONObject(d("home/search", mapS)).optJSONObject("data").optJSONArray("list");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("vod_pic");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObjectOptJSONObject.optString("vod_pic_thumb");
            }
            k kVar = new k();
            kVar.n(jSONObjectOptJSONObject.optString("vod_id"));
            kVar.o(jSONObjectOptJSONObject.optString("vod_name"));
            kVar.p(strOptString);
            kVar.s(jSONObjectOptJSONObject.optString("vod_remarks"));
            arrayList.add(kVar);
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        JSONArray jSONArray;
        String strM558;
        JSONArray jSONArray2;
        String strC = c();
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("timestamp", strC);
        mapS.put("sign", b(strC));
        JSONArray jSONArrayOptJSONArray = new JSONObject(d("type/top_type", mapS)).optJSONObject("data").optJSONArray("list");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < jSONArrayOptJSONArray.length()) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("type_id");
            com.github.catvod.spider.merge.D.b.z(strOptString, jSONObjectOptJSONObject.optString("type_name"), null, arrayList);
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strM516 = "extend";
                    if (next.equals(strM516)) {
                        strM558 = "类型";
                    } else if (next.equals("area")) {
                        strM558 = "地区";
                    } else if (next.equals("year")) {
                        strM558 = "年份";
                    } else {
                        strM558 = next.equals("lang") ? "语言" : "";
                    }
                    if (TextUtils.isEmpty(strM558)) {
                        jSONArray2 = jSONArrayOptJSONArray;
                    } else {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(next);
                        ArrayList arrayList3 = new ArrayList();
                        int i2 = 0;
                        while (true) {
                            jSONArray2 = jSONArrayOptJSONArray;
                            if (i2 >= jSONArrayOptJSONArray2.length()) {
                                break;
                            }
                            String strOptString2 = jSONArrayOptJSONArray2.optString(i2);
                            if (strOptString2.length() > 1) {
                                arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strOptString2, strOptString2));
                            }
                            i2++;
                            jSONArrayOptJSONArray = jSONArray2;
                        }
                        if (arrayList3.size() > 1) {
                            arrayList2.add(new com.github.catvod.spider.merge.p001b.d(next.replace(strM516, "class"), strM558, arrayList3));
                        }
                    }
                    jSONArrayOptJSONArray = jSONArray2;
                }
                jSONArray = jSONArrayOptJSONArray;
                linkedHashMap.put(strOptString, arrayList2);
            } else {
                jSONArray = jSONArrayOptJSONArray;
            }
            i++;
            jSONArrayOptJSONArray = jSONArray;
        }
        return com.github.catvod.spider.merge.p001b.g.A(arrayList, new ArrayList(), linkedHashMap);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strM105 = "\\|";
        String[] strArrSplit = str2.split(strM105);
        if (strArrSplit.length == 5) {
            StringBuilder sb = new StringBuilder();
            sb.append(strArrSplit[0]);
            String strM499 = "|";
            sb.append(strM499);
            sb.append(strArrSplit[1]);
            sb.append(strM499);
            sb.append(strArrSplit[2]);
            sb.append("||");
            sb.append(strArrSplit[3]);
            sb.append(strM499);
            sb.append(strArrSplit[4]);
            strArrSplit = sb.toString().split(strM105);
        }
        String str3 = strArrSplit[0];
        String strOptString = strArrSplit[1];
        String str4 = strArrSplit[2];
        String str5 = strArrSplit[4];
        String str6 = strArrSplit[5];
        if (!TextUtils.isEmpty(str3)) {
            for (String str7 : str3.split("@")) {
                if (!TextUtils.isEmpty(str7)) {
                    try {
                        String strC = c();
                        String str8 = a(str7) + strOptString + "&sign=" + b(strC) + "&timestamp=" + strC;
                        HashMap map = new HashMap();
                        map.put("Referer", "");
                        JSONObject jSONObject = new JSONObject(X1.X(str8, null, map));
                        strOptString = jSONObject.optString("url");
                        String strOptString2 = jSONObject.optString("UA", str4);
                        if (!TextUtils.isEmpty(strOptString2)) {
                            str4 = strOptString2;
                        }
                        if ((strOptString.contains("url=http") || strOptString.contains(".js") || strOptString.contains(".css") || strOptString.contains(".html")) ? false : b.matcher(strOptString).find()) {
                            break;
                        }
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
        }
        if (!strOptString.startsWith("http")) {
            return "";
        }
        String strA = a(strOptString);
        String strI = AbstractC0280n1.i(str, str2, null, null);
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(str4)) {
            map2.put("User-Agent", str4);
        }
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(strA);
        gVar.h(map2);
        gVar.b(strI);
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strC = c();
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("timestamp", strC);
        mapS.put("sign", b(strC));
        mapS.put("vod_id", list.get(0));
        JSONObject jSONObjectOptJSONObject = new JSONObject(d("home/vod_details", mapS)).optJSONObject("data");
        k kVar = new k();
        kVar.n(list.get(0));
        String strM288 = "vod_name";
        kVar.o(jSONObjectOptJSONObject.optString(strM288));
        String strOptString = jSONObjectOptJSONObject.optString("vod_pic");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = jSONObjectOptJSONObject.optString("vod_pic_thumb");
        }
        kVar.p(strOptString);
        kVar.s(jSONObjectOptJSONObject.optString("vod_remarks"));
        kVar.l(jSONObjectOptJSONObject.optString("vod_content").replaceAll("[^一-龥\\u3000-〿\\uff00-\\uffef]", ""));
        kVar.u(jSONObjectOptJSONObject.optString("vod_year"));
        kVar.j(jSONObjectOptJSONObject.optString("vod_actor"));
        kVar.m(jSONObjectOptJSONObject.optString("vod_director"));
        kVar.i(jSONObjectOptJSONObject.optString("vod_class"));
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("vod_play_list");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strOptString2 = jSONObjectOptJSONObject.optString(strM288);
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            String strM365 = "name";
            String string = jSONObjectOptJSONObject2.getString(strM365);
            String strOptString3 = jSONObjectOptJSONObject2.optString("ua");
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("urls");
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("parse_urls");
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                sb.append(jSONArrayOptJSONArray3.optString(i2));
                sb.append("@");
            }
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            while (i3 < jSONArrayOptJSONArray2.length()) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3);
                String strOptString4 = jSONObjectOptJSONObject3.optString(strM365);
                String strOptString5 = jSONObjectOptJSONObject3.optString("url");
                JSONArray jSONArray = jSONArrayOptJSONArray;
                String strOptString6 = jSONObjectOptJSONObject3.optString("nid");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strOptString4);
                sb2.append("$");
                sb2.append((Object) sb);
                String strM558 = "|";
                sb2.append(strM558);
                sb2.append(strOptString5);
                com.github.catvod.spider.merge.D.b.A(sb2, strM558, strOptString3, "||", strOptString2);
                sb2.append(strM558);
                sb2.append(strOptString6);
                arrayList3.add(sb2.toString());
                i3++;
                jSONArrayOptJSONArray = jSONArray;
            }
            arrayList.add(string);
            arrayList2.add(TextUtils.join("#", arrayList3));
        }
        String strM382 = "$$$";
        String strJoin = TextUtils.join(strM382, arrayList2);
        kVar.q(TextUtils.join(strM382, arrayList));
        kVar.r(strJoin);
        AbstractC0280n1.p(strOptString2);
        AbstractC0280n1.q(strJoin);
        FishCrypto.c(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String strC = c();
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("timestamp", strC);
        mapS.put("sign", b(strC));
        mapS.put("type_id", str);
        mapS.put("limit", "12");
        mapS.put("page", str2);
        if (map != null) {
            String strM177 = "area";
            if (map.containsKey(strM177)) {
                mapS.put(strM177, map.get(strM177));
            }
            String strM570 = "class";
            if (map.containsKey(strM570)) {
                mapS.put(strM570, map.get(strM570));
            }
            String strM292 = "lang";
            if (map.containsKey(strM292)) {
                mapS.put(strM292, map.get(strM292));
            }
            String strM339 = "year";
            if (map.containsKey(strM339)) {
                mapS.put(strM339, map.get(strM339));
            }
        }
        JSONArray jSONArrayOptJSONArray = new JSONObject(d("home/type_search", mapS)).optJSONObject("data").optJSONArray("list");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("vod_pic");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObjectOptJSONObject.optString("vod_pic_thumb");
            }
            k kVar = new k();
            kVar.n(jSONObjectOptJSONObject.optString("vod_id"));
            kVar.o(jSONObjectOptJSONObject.optString("vod_name"));
            kVar.p(strOptString);
            kVar.s(jSONObjectOptJSONObject.optString("vod_remarks"));
            arrayList.add(kVar);
        }
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayList);
        gVarC.o(Integer.parseInt(str2), 9999, 12, 999999);
        return gVarC.r();
    }

    public static String a(String str) {
        String strSubstring = str;
        int iIndexOf = strSubstring.indexOf(58);
        String strSubstring2 = iIndexOf > 0 ? strSubstring.substring(0, iIndexOf) : "https";
        if (iIndexOf > 0) {
            strSubstring = strSubstring.substring(Math.min(iIndexOf + 3, strSubstring.length()));
        }
        StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strSubstring2);
        sbO.append(FishCrypto.v("N1.eqBC7G3iwir9aiHiC1V6a2Ec1x9GjBBbU3/4Nzji6RBdupKMvSpe3rViNKQnasQGzaNVcv27AtHx3/Us9Pv2yw=="));
        sbO.append(strSubstring);
        return sbO.toString();
    }

    public static String b(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest((FishCrypto.v("N1.+JQtUaj5OpwiXjtmxb9AFWwrT9AkOs280bGQ6MNYzWnxRQkJ2kdyPY3drHqTxnWZWOTT+KsK96hCuxt7h4R+pfEyDS1Oi2dF8I3gdK1UoFLvnqar9ZekwWS4AFXEbVuo") + str).getBytes("UTF-8"))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, "0");
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c() {
        return String.valueOf(System.currentTimeMillis() / 1000);
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

    public final String d(String str, HashMap map) {
        try {
            String str2 = this.a + FishCrypto.v("N1.DeXb/A///52LvDl5J7RnjOToAVs6jxMia8TlwVWNMq2ItFm0vlgUnNto7VOZcxzgyrA/hB2VysOSMdW2jUQ2Tg==") + str;
            MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
            for (Map.Entry entry : map.entrySet()) {
                type.addFormDataPart((String) entry.getKey(), (String) entry.getValue());
            }
            Response responseExecute = new OkHttpClient().newCall(new Request.Builder().url(str2).post(type.build()).addHeader("User-Agent", "okhttp-okgo/jeasonlzy").build()).execute();
            return !responseExecute.isSuccessful() ? "" : responseExecute.body().string();
        } catch (Exception unused) {
            return "";
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
        try {
            this.a = a(new JSONObject(str).optString("url", ""));
        } catch (Exception e) {
            e.printStackTrace();
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

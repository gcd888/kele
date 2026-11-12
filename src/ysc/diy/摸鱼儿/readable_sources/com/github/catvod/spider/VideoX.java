package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.N;
import com.github.catvod.spider.merge.p001b.i;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class VideoX extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f102short = {761, 764, 739, 752, 19790, -25778, -27764, 26399, 26252, 21634, 21746, 19848, 31176, 3099, 3133, 3115, 3132, 3171, 3087, 3113, 3115, 3104, 3130, 415, 445, 424, 443, 446, 446, 435, 509, 487, 508, 482, 498, 506, 389, 443, 444, 438, 445, 421, 417, 498, 412, 390, 498, 483, 482, 508, 482, 489, 498, 389, 443, 444, 484, 486, 489, 498, 426, 484, 486, 507, 498, 403, 418, 418, 446, 439, 389, 439, 432, 409, 443, 422, 509, 487, 481, 485, 508, 481, 484, 498, 506, 409, 410, 390, 415, 414, 510, 498, 446, 443, 441, 439, 498, 405, 439, 433, 441, 445, 507, 498, 401, 442, 416, 445, 447, 439, 509, 483, 480, 480, 508, 482, 508, 482, 508, 482, 498, 385, 435, 436, 435, 416, 443, 509, 487, 481, 485, 508, 481, 484, 1488, 1455, 1456, 1503, 1495, 1501, 1517, 1500, 1517, 1532, 1478, 1496, 1499, 1519, 1454, 1508, 1479, 1496, 1448, 1527, 1529, 1461, 1484, 1535, 1454, 1476, 1511, 1518, 1510, 1453, 1515, 1489, 1492, 1521, 1513, 1503, 1515, 1451, 1490, 1525, 1526, 1501, 1512, 1490, 1533, 1531, 1526, 1446, 1498, 1531, 1454, 1522, 1499, 1446, 1524, 1525, 1514, 1490, 1495, 1488, 1514, 1511, 1461, 1503, 1510, 1535, 1501, 1446, 1516, 1501, 1511, 1517, 1488, 1515, 1531, 1452, 1478, 1499, 1525, 1448, 1512, 1455, 1453, 1508, 1484, 1446, 1516, 1529, 1529, 1443, 1443, 25089, 25490, 20892, 20972, 23390, 24477, 25572, -1632, -29349, 21659, 25372, 21691, -28988, 1573, 1586, 1594, 1590, 1573, 1596, 1572, 1583, 1568, 1580, 1572, 3296, 3303, 3321, 3302, 2251, 2252, 2258, 1750, 1738, 1744, 1751, 1734, 1728, 22524, 22756, -27806, -25696, 25278, 25110, -24625, -26867, 1815, 1818, 31943, 24556, -25748, -27730, 948, 953, 1453, 1448, 1463, 1444, -25813, -27671, 25912, 19895, 20565, 30354, 1955, 842, 845, 1675, 1780, 1771, 1673, 1698, 1674, 1683, 1716, 1674, 1668, 1713, 1704, 1693, 1685, 1727, 1679, 1668, 1704, 1678, 1683, 1706, 1698, 1697, 1676, 1670, 1708, 1725, 1776, 1783, 1703, 1679, 1718, 1683, 1782, 1692, 1788, 1712, 1695, 1725, 1716, 1704, 1699, 1708, 1778, 1685, 1727, 1776, 1702, 1713, 1677, 1712, 1779, 1706, 1710, 1664, 1704, 1683, 1692, 1699, 1676, 1725, 1714, 1782, 1686, 1685, 1781, 1665, 1717, 1780, 1719, 1677, 1682, 1783, 1684, 1696, 1718, 1708, 1679, 1686, 1705, 1774, 1664, 1679, 1665, 1685, 1779, 1719, 1718, 1698, 1784, 1784, 2172, 24506, -28846, 24398, -31261, 23128, 17912, 17887, -27804, -25690, 2323, 2412, 2419, 2347, 2353, 2309, 2321, 2309, 2350, 2321, 2411, 2328, 2327, 2322, 2343, 2335, 2358, 2364, 2361, 2334, 2316, 2314, 2352, 2360, 2322, 2351, 2319, 2346, 2347, 2343, 2363, 2355, 2323, 2331, 2366, 2358, 2321, 2327, 2346, 2316, 2351, 2360, 2366, 2364, 2311, 2411, 2332, 2332, 2311, 2332, 2316, 2312, 2327, 2330, 2325, 2366, 2361, 2349, 2356, 2409, 2344, 2332, 2315, 2329, 2322, 2328, 2413, 2322, 2316, 2325, 2344, 2314, 2350, 2361, 2348, 2413, 2324, 2329, 2320, 2359, 2358, 2410, 2346, 2349, 2415, 2328, 2367, 2357, 2332, 2400, 2400, 1966, 1961, 1975, 1960, 1628, 1619, 1631, 1623, 1770, 1661, 1770, 30837, -29915, 1482, 1503, 1474, 1496, 1501, 1408, 1497, 1476, 1497, 1473, 1480, 1424, 1423, 1537, 1662, 1633, 1593, 1571, 1559, 1539, 1559, 1596, 1539, 1657, 1546, 1541, 1536, 1589, 1549, 1572, 1582, 1579, 1548, 1566, 1560, 1570, 1578, 1536, 1597, 1565, 1592, 1593, 1589, 1577, 1569, 1537, 1545, 1580, 1572, 1539, 1541, 1592, 1566, 1597, 1578, 1580, 1582, 1557, 1657, 1550, 1550, 1557, 1550, 1566, 1562, 1541, 1544, 1543, 1580, 1579, 1599, 1574, 1659, 1594, 1550, 1561, 1547, 1536, 1546, 1663, 1536, 1566, 1543, 1594, 1560, 1596, 1579, 1598, 1663, 1542, 1547, 1538, 1573, 1572, 1656, 1592, 1599, 1661, 1546, 1581, 1575, 1550, 1650, 1650, 435, 460, 467, 444, 436, 446, 398, 447, 398, 415, 421, 443, 440, 396, 461, 391, 420, 443, 459, 404, 410, 470, 431, 412, 461, 423, 388, 397, 389, 462, 392, 434, 439, 402, 394, 444, 392, 456, 433, 406, 405, 446, 395, 433, 414, 408, 405, 453, 441, 408, 461, 401, 440, 453, 407, 406, 393, 433, 436, 435, 393, 388, 470, 444, 389, 412, 446, 453, 399, 446, 388, 398, 435, 392, 408, 463, 421, 440, 406, 459, 395, 460, 462, 391, 431, 453, 399, 410, 410, 448, 448, 2652, 2595, 2620, 2660, 2686, 2634, 2654, 2634, 2657, 2654, 2596, 2647, 2648, 2653, 2664, 2640, 2681, 2675, 2678, 2641, 2627, 2629, 2687, 2679, 2653, 2656, 2624, 2661, 2660, 2664, 2676, 2684, 2652, 2644, 2673, 2681, 2654, 2648, 2661, 2627, 2656, 2679, 2673, 2675, 2632, 2596, 2643, 2643, 2632, 2643, 2627, 2631, 2648, 2645, 2650, 2673, 2678, 2658, 2683, 2598, 2663, 2643, 2628, 2646, 2653, 2647, 2594, 2653, 2627, 2650, 2663, 2629, 2657, 2678, 2659, 2594, 2651, 2646, 2655, 2680, 2681, 2597, 2661, 2658, 2592, 2647, 2672, 2682, 2643, 2607, 2607, 1386, 1324, 1333, 1329, 1331, 1387, 1320, 1398, 1328, 25377, 25266, 21915, -28700, 18870, 32246, 25954, 25841, 21464, -30297, -30152, 28045, 22782, -29462, 501, 495, 391, 411, 411, 415, 495, 24875, 20791, 25258, 25401, 24842, 21670, 28004, 20783, 22465, 24320, -1781, -29200, 31754, 21001, -26678, -29230, 2323, 2324, 3167, 2875, 2860, 2852, 2856, 2875, 2850, 2874, 1201, 1214, 1202, 1210, 2893, 2890, 2900, 2891, 461, 434, 429, 463, 484, 460, 469, 498, 460, 450, 503, 494, 475, 467, 505, 457, 450, 494, 456, 469, 492, 484, 487, 458, 448, 490, 507, 438, 433, 481, 457, 496, 469, 432, 474, 442, 502, 473, 507, 498, 494, 485, 490, 436, 467, 505, 438, 480, 503, 459, 502, 437, 492, 488, 454, 494, 469, 474, 485, 458, 507, 500, 432, 464, 467, 435, 455, 499, 434, 497, 459, 468, 433, 466, 486, 496, 490, 457, 464, 495, 424, 454, 457, 455, 467, 437, 497, 496, 484, 446, 446, 2058, 3054, 3058, 3048, 3055, 3070, 3064, 2446, 2329, 2446, 24806, 31032, -30104, 2994, 3021, 3026, 3005, 2997, 3007, 2959, 3006, 2959, 2974, 2980, 3002, 3001, 2957, 3020, 2950, 2981, 3002, 3018, 2965, 2971, 3031, 2990, 2973, 3020, 2982, 2949, 2956, 2948, 3023, 2953, 2995, 2998, 2963, 2955, 3005, 2953, 3017, 2992, 2967, 2964, 3007, 2954, 2992, 2975, 2969, 2964, 3012, 3000, 2969, 
    3020, 2960, 3001, 3012, 2966, 2967, 2952, 2992, 2997, 2994, 2952, 2949, 3031, 3005, 2948, 2973, 3007, 3012, 2958, 3007, 2949, 2959, 2994, 2953, 2969, 3022, 2980, 3001, 2967, 3018, 2954, 3021, 3023, 2950, 2990, 3012, 2958, 2971, 2971, 3009, 3009, 2396, 2398, 2379, 2394, 2392, 2384, 2381, 2374, 2428, 2384, 2385, 2379, 2394, 2385, 2379, 1612, 1613, 1628, 1609, 1601, 1604, 1643, 1607, 1606, 1628, 1613, 1606, 1628, 2262, 2257, 2259, 2267, 2301, 2257, 2256, 2250, 2267, 2256, 2250, 3006, 2978, 2991, 2999, 2987, 3004, 2957, 2977, 2976, 3002, 2987, 2976, 3002};

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        com.github.catvod.spider.merge.p001b.b bVar = new com.github.catvod.spider.merge.p001b.b("live", "云频道", null);
        bVar.b(i.a(1.0f));
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.a(arrayList);
        return gVar.r();
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        if (TextUtils.isEmpty(str2)) {
            return com.github.catvod.spider.merge.p001b.g.d("播放地址为空");
        }
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(str2);
        gVar.q(0);
        gVar.k();
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
        gVar.h(map);
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(list.get(0))) {
            return com.github.catvod.spider.merge.p001b.g.d("缺少频道ID");
        }
        String str = list.get(0);
        if (!str.startsWith(FishCrypto.v("N1.AICsBsbXFEq0zYF6ig+Ra0Zypx3uOJowAu5LkhCvLceh8De0lE8jktLINty+AxaC8rCysNue2XEk6v13zR8rgg=="))) {
            return com.github.catvod.spider.merge.p001b.g.d("无效频道ID");
        }
        String strM459 = "播放地址已失效，请刷新列表";
        String strM177 = "remarks";
        try {
            JSONObject jSONObjectD = d(str);
            k kVar = new k();
            kVar.n(str);
            kVar.o(jSONObjectD.optString("name"));
            kVar.p(AbstractC0302v0.O1());
            kVar.s(jSONObjectD.optString(strM177));
            kVar.l(jSONObjectD.optString(strM177));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectD.optJSONArray("urls");
            String strOptString = jSONArrayOptJSONArray == null ? jSONObjectD.optString("url") : jSONArrayOptJSONArray.optString(0);
            try {
                Iterator it = h(f(), jSONObjectD.optString("source")).iterator();
                while (it.hasNext()) {
                    a(d(((k) it.next()).b()), arrayList, arrayList2);
                }
            } catch (Exception unused) {
                a(jSONObjectD, arrayList, arrayList2);
            }
            com.github.catvod.spider.merge.p021y.b.a(kVar, "小北频道", arrayList, arrayList2, strOptString);
            return TextUtils.isEmpty(kVar.e()) ? com.github.catvod.spider.merge.p001b.g.d(strM459) : com.github.catvod.spider.merge.p001b.g.s(kVar);
        } catch (Exception unused2) {
            return com.github.catvod.spider.merge.p001b.g.d(strM459);
        }
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [com.github.catvod.spider.merge.u.S] */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws Throwable {
        int iMax;
        boolean zEquals = "live".equals(str);
        int iMax2 = 1;
        String strM177 = "频道暂不可用";
        if (!zEquals) {
            if (TextUtils.isEmpty(str) || !str.startsWith(FishCrypto.v("N1.vlXLXsL6EJOzBkadCQWmeOrRwvzfnNFckLJwQrecaZ6AAZAQUJGHcdpi4uAVDOE0OQHuWsdq0IDMjk7wp2EbhA=="))) {
                return com.github.catvod.spider.merge.D.b.d();
            }
            try {
                iMax2 = Math.max(1, Integer.parseInt(str2));
            } catch (Exception unused) {
            }
            try {
                return g(h(f(), c(str)), iMax2);
            } catch (IllegalStateException e) {
                return com.github.catvod.spider.merge.p001b.g.d(e.getMessage());
            } catch (Exception unused2) {
                return com.github.catvod.spider.merge.p001b.g.d(strM177);
            }
        }
        String strM1 = "\n";
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused3) {
            iMax = 1;
        }
        if (iMax != 1) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        try {
            String strF = f();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strTrim = "";
            String strB = strTrim;
            for (String str3 : strF.replace("\r\n", strM1).split(strM1)) {
                String strTrim2 = str3.trim();
                if (strTrim2.startsWith(FishCrypto.v("N1.LgOVqOAtmXPzJAmKVogdICix52bJsV3Y9uZxqmfi7Pz5ctHu6okEmVYfIxw3SP0Dp1rHW2QesiJSl+EJDP6rsg=="))) {
                    int iIndexOf = strTrim2.indexOf(44);
                    strTrim = iIndexOf < 0 ? "" : strTrim2.substring(iIndexOf + 1).trim();
                    strB = b(strTrim2);
                } else if (!strTrim2.isEmpty() && !strTrim2.startsWith("#") && !strTrim.isEmpty() && !strB.isEmpty()) {
                    if ("央视".equals(strB) || "卫视".equals(strB) || "其他".equals(strB)) {
                        List list = (List) linkedHashMap.computeIfAbsent(strB, new Function() { // from class: com.github.catvod.spider.merge.u.S
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return new ArrayList();
                            }
                        });
                        if (!list.contains(strTrim)) {
                            list.add(strTrim);
                        }
                    }
                    strTrim = "";
                    strB = strTrim;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new k(e((String) entry.getKey()), (String) entry.getKey(), AbstractC0302v0.c0(), ((List) entry.getValue()).size() + "个频道", true));
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        } catch (IllegalStateException e2) {
            return com.github.catvod.spider.merge.p001b.g.d(e2.getMessage());
        } catch (Exception unused4) {
            return com.github.catvod.spider.merge.p001b.g.d(strM177);
        }
    }

    public static void a(JSONObject jSONObject, ArrayList arrayList, ArrayList arrayList2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("urls");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString)) {
                StringBuilder sb = new StringBuilder();
                sb.append(jSONObject.optString("name"));
                sb.append(jSONArrayOptJSONArray.length() > 1 ? " · 线路" + (i + 1) : "");
                arrayList.add(sb.toString());
                arrayList2.add(strOptString);
            }
        }
    }

    public static String b(String str) {
        int length;
        int iIndexOf;
        String strM463 = "group-title=\"";
        int iIndexOf2 = str.indexOf(strM463);
        return (iIndexOf2 >= 0 && (iIndexOf = str.indexOf(34, (length = strM463.length() + iIndexOf2))) >= 0) ? str.substring(length, iIndexOf) : "";
    }

    public static String c(String str) {
        return new String(Base64.decode(str.substring(FishCrypto.v("N1.vlXLXsL6EJOzBkadCQWmeOrRwvzfnNFckLJwQrecaZ6AAZAQUJGHcdpi4uAVDOE0OQHuWsdq0IDMjk7wp2EbhA==").length()), 11), StandardCharsets.UTF_8);
    }

    public static JSONObject d(String str) {
        return new JSONObject(new String(Base64.decode(str.substring(FishCrypto.v("N1.AICsBsbXFEq0zYF6ig+Ra0Zypx3uOJowAu5LkhCvLceh8De0lE8jktLINty+AxaC8rCysNue2XEk6v13zR8rgg==").length()), 11), StandardCharsets.UTF_8));
    }

    public static String e(String str) {
        return FishCrypto.v("N1.vlXLXsL6EJOzBkadCQWmeOrRwvzfnNFckLJwQrecaZ6AAZAQUJGHcdpi4uAVDOE0OQHuWsdq0IDMjk7wp2EbhA==") + Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 11);
    }

    public static String f() throws Throwable {
        String str;
        C0299u0 c0299u0X = C0299u0.x();
        if (c0299u0X.z0()) {
            str = c0299u0X.E() + "/iptv.m3u";
        } else {
            str = "";
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalStateException("本地播放服务正在准备，请稍后重试");
        }
        N nZ = X1.z(str, null, null);
        int i = nZ.a;
        if (i < 200 || i >= 300) {
            throw new IllegalStateException(com.github.catvod.spider.merge.D.b.e(i, "播放列表请求失败: HTTP "));
        }
        String strA = nZ.a();
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalStateException("播放列表为空");
        }
        return strA;
    }

    public static String g(ArrayList arrayList, int i) {
        int size = arrayList.size();
        if (size == 0) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        int iMin = Math.min(size, (i - 1) * 30);
        int iMin2 = Math.min(size, iMin + 30);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.F(new ArrayList(arrayList.subList(iMin, iMin2)));
        gVar.o(i, (size + 29) / 30, 30, size);
        return gVar.r();
    }

    public static ArrayList h(String str, String str2) throws JSONException {
        String strM102;
        String strM368;
        String strM175;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM390 = "\r\n";
        String strM477 = "\n";
        String[] strArrSplit = str.replace(strM390, strM477).split(strM477);
        int length = strArrSplit.length;
        String strTrim = "";
        String strB = strTrim;
        int i = 0;
        while (true) {
            strM102 = "remarks";
            strM368 = "name";
            strM175 = "urls";
            if (i >= length) {
                break;
            }
            String strTrim2 = strArrSplit[i].trim();
            if (strTrim2.startsWith(FishCrypto.v("N1.LgOVqOAtmXPzJAmKVogdICix52bJsV3Y9uZxqmfi7Pz5ctHu6okEmVYfIxw3SP0Dp1rHW2QesiJSl+EJDP6rsg=="))) {
                int iIndexOf = strTrim2.indexOf(44);
                strTrim = iIndexOf < 0 ? "" : strTrim2.substring(iIndexOf + 1).trim();
                strB = b(strTrim2);
            } else {
                if (!strTrim2.isEmpty() && !strTrim2.startsWith("#") && !strTrim.isEmpty()) {
                    if (str2.equals(strB)) {
                        JSONObject jSONObjectV = (JSONObject) linkedHashMap.get(strTrim);
                        if (jSONObjectV == null) {
                            jSONObjectV = com.github.catvod.spider.merge.D.b.v(strM368, strTrim, strM102, strB);
                            jSONObjectV.put("source", strB);
                            jSONObjectV.put(strM175, new JSONArray());
                            linkedHashMap.put(strTrim, jSONObjectV);
                        }
                        JSONArray jSONArray = jSONObjectV.getJSONArray(strM175);
                        boolean zEquals = false;
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            zEquals |= strTrim2.equals(jSONArray.optString(i2));
                        }
                        if (!zEquals) {
                            jSONArray.put(strTrim2);
                        }
                    }
                    strTrim = "";
                    strB = strTrim;
                }
                i++;
            }
            i++;
        }
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : linkedHashMap.values()) {
            int length2 = jSONObject.getJSONArray(strM175).length();
            StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(str2);
            sbO.append(length2 > 1 ? com.github.catvod.spider.merge.D.b.h(" · ", length2, "条线路") : "");
            String string = sbO.toString();
            jSONObject.put(strM102, string);
            arrayList.add(new k(FishCrypto.v("N1.AICsBsbXFEq0zYF6ig+Ra0Zypx3uOJowAu5LkhCvLceh8De0lE8jktLINty+AxaC8rCysNue2XEk6v13zR8rgg==") + Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 11), jSONObject.optString(strM368), AbstractC0302v0.O1(), string, false));
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
}

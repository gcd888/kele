package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.utils.C0143;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class BeiLeHu extends Spider {
    public static final LinkedHashMap a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f17short = {443, 443, 682, 701, 683, 685, 692, 684, 1050, 1049, 3061, 2954, 2965, 3037, 3061, 3010, 3064, 2946, 2959, 3053, 2960, 3055, 3058, 3019, 2960, 3034, 3065, 2946, 3048, 3048, 3052, 3023, 3062, 2964, 3049, 2958, 3066, 3056, 2953, 3018, 3024, 3063, 2946, 3010, 3071, 3041, 2958, 3022, 3025, 3026, 3034, 2964, 3036, 3016, 3064, 3056, 3053, 3041, 3060, 3053, 3063, 3016, 3050, 3071, 3028, 2947, 3026, 3058, 3068, 3069, 3042, 3017, 3024, 3053, 3057, 2960, 3062, 3016, 3049, 2960, 3019, 3049, 3066, 3011, 3071, 2964, 2958, 3063, 3020, 3051, 3060, 3032, 3058, 3028, 3069, 3049, 3043, 3026, 2960, 3043, 3019, 3070, 3062, 3029, 3064, 2964, 3069, 3069, 3057, 3037, 3070, 3017, 3022, 3052, 3051, 3018, 3017, 3066, 3011, 3017, 3036, 3031, 2953, 3011, 2952, 3069, 3069, 3063, 3068, 3069, 3063, 3031, 3032, 3054, 3065, 3030, 2954, 3016, 2954, 3054, 3064, 1593, 1567, 1545, 1566, 1601, 1581, 1547, 1545, 1538, 1560, 2265, 2299, 2286, 2301, 2296, 2296, 2293, 2235, 2209, 2234, 2212, 2228, 2236, 2301, 2244, 2300, 2299, 2298, 2289, 2223, 2228, 2263, 2244, 2241, 2228, 2301, 2244, 2300, 2299, 2298, 2289, 2228, 2267, 2247, 2228, 2213, 2215, 2251, 2214, 2251, 2215, 2228, 2296, 2301, 2303, 2289, 2228, 2265, 2293, 2295, 2228, 2267, 2247, 2228, 2252, 2237, 2228, 2261, 2276, 2276, 2296, 2289, 2243, 2289, 2294, 2271, 2301, 2272, 2235, 2210, 2212, 2209, 2234, 2213, 2234, 2213, 2209, 2228, 2236, 2271, 2268, 2240, 2265, 2264, 2232, 2228, 2296, 2301, 2303, 2289, 2228, 2259, 2289, 2295, 2303, 2299, 2237, 2228, 2242, 2289, 2278, 2279, 2301, 2299, 2298, 2235, 2213, 2215, 2234, 2212, 2234, 2215, 2228, 2265, 2299, 2294, 2301, 2296, 2289, 2235, 2213, 2209, 2257, 2213, 2208, 2220, 2228, 2247, 2293, 2290, 2293, 2278, 2301, 2235, 2210, 2212, 2208, 2234, 2213, 1728, 1772, 1773, 1783, 1766, 1773, 1783, 1710, 1751, 1786, 1779, 1766, 1217, 1232, 1232, 1228, 1225, 1219, 1217, 1236, 1225, 1231, 1230, 1167, 1226, 1235, 1231, 1230, 2938, 2919, 2934, 2942, 2912, 1901, 1898, 1908, 3048, 3061, 3048, 3056, 3065, 2467, 2471, 2475, 2477, 2479, 2347, 2356, 2360, 2346, 2366, 2354, 2344, 2355, 2345, 1420, 1420, 1023, 896, 927, 966, 1003, 1000, 986, 986, 961, 1000, 1008, 998, 999, 899, 996, 901, 897, 968, 1017, 904, 999, 1001, 999, 962, 978, 986, 991, 905, 968, 990, 995, 1018, 962, 999, 965, 962, 1001, 995, 984, 983, 969, 997, 971, 997, 1015, 990, 898, 983, 905, 991, 1008, 900, 1023, 1015, 968, 904, 967, 993, 896, 899, 989, 1001, 985, 1018, 903, 967, 926, 967, 1014, 901, 996, 983, 961, 922, 997, 980, 903, 961, 898, 985, 960, 994, 966, 965, 987, 1001, 971, 897, 982, 908, 908, 3143, 3169, 3191, 3168, 3135, 3155, 3189, 3191, 3196, 3174, 1457, 1427, 1414, 1429, 1424, 1424, 1437, 1491, 1481, 1490, 1484, 1500, 1492, 1429, 1452, 1428, 1427, 1426, 1433, 1479, 1500, 1471, 1452, 1449, 1500, 1429, 1452, 1428, 1427, 1426, 1433, 1500, 1459, 1455, 1500, 1485, 1487, 1443, 1486, 1443, 1487, 1500, 1424, 1429, 1431, 1433, 1500, 1457, 1437, 1439, 1500, 1459, 1455, 1500, 1444, 1493, 1500, 1469, 1420, 1420, 1424, 1433, 1451, 1433, 1438, 1463, 1429, 1416, 1491, 1482, 1484, 1481, 1490, 1485, 1490, 1485, 1481, 1500, 1492, 1463, 1460, 1448, 1457, 1456, 1488, 1500, 1424, 1429, 1431, 1433, 1500, 1467, 1433, 1439, 1431, 1427, 1493, 1500, 1450, 1433, 1422, 1423, 1429, 1427, 1426, 1491, 1485, 1487, 1490, 1484, 1490, 1487, 1500, 1457, 1427, 1438, 1429, 1424, 1433, 1491, 1485, 1481, 1465, 1485, 1480, 1476, 1500, 1455, 1437, 1434, 1437, 1422, 1429, 1491, 1482, 1484, 1480, 1490, 1485, -29566, 25329, 23632, -30652, 24868, 24759, 1453, 1633, 1633, 22383, 23105, -30288, 19197, -32029, -28947, 26062, -31044, 22237, 23610, -30674, 3062, 3062, 2877, 2858, 2876, 2874, 2851, 2875, 1701, 1754, 1733, 1677, 1701, 1682, 1704, 1746, 1759, 1725, 1728, 1727, 1698, 1691, 1728, 1674, 1705, 1746, 1720, 1720, 1724, 1695, 1702, 1732, 1721, 1758, 1706, 1696, 1753, 1690, 1664, 1703, 1746, 1682, 1711, 1713, 1758, 1694, 1665, 1666, 1674, 1732, 1676, 1688, 1704, 1696, 1725, 1713, 1700, 1725, 1703, 1688, 1722, 1711, 1668, 1747, 1666, 1698, 1708, 1709, 1714, 1689, 1664, 1725, 1697, 1728, 1702, 1688, 1721, 1728, 1691, 1721, 1706, 1683, 1711, 1732, 1758, 1703, 1692, 1723, 1700, 1672, 1698, 1668, 1709, 1721, 1715, 1666, 1728, 1715, 1691, 1710, 1702, 1669, 1704, 1732, 1709, 1709, 1697, 1677, 1710, 1689, 1694, 1724, 1723, 1690, 1689, 1706, 1683, 1689, 1676, 1671, 1753, 1683, 1752, 1709, 1709, 1703, 1708, 1709, 1703, 1671, 1672, 1726, 1705, 1670, 1754, 1688, 1754, 1726, 1704, 1961, 1935, 1945, 1934, 2001, 1981, 1947, 1945, 1938, 1928, 1306, 1336, 1325, 1342, 1339, 1339, 1334, 1400, 1378, 1401, 1383, 1399, 1407, 1342, 1287, 1343, 1336, 1337, 1330, 1388, 1399, 1300, 1287, 1282, 1399, 1342, 1287, 1343, 1336, 1337, 1330, 1399, 1304, 1284, 1399, 1382, 1380, 1288, 1381, 1288, 1380, 1399, 1339, 1342, 1340, 1330, 1399, 1306, 1334, 1332, 1399, 1304, 1284, 1399, 1295, 1406, 1399, 1302, 1319, 1319, 1339, 1330, 1280, 1330, 1333, 1308, 1342, 1315, 1400, 1377, 1383, 1378, 1401, 1382, 1401, 1382, 1378, 1399, 1407, 1308, 1311, 1283, 1306, 1307, 1403, 1399, 1339, 1342, 1340, 1330, 1399, 1296, 1330, 1332, 1340, 1336, 1406, 1399, 1281, 1330, 1317, 1316, 1342, 1336, 1337, 1400, 1382, 1380, 1401, 1383, 1401, 1380, 1399, 1306, 1336, 1333, 1342, 1339, 1330, 1400, 1382, 1378, 1298, 1382, 1379, 1391, 1399, 1284, 1334, 1329, 1334, 1317, 1342, 1400, 1377, 1383, 1379, 1401, 1382, 542, 562, 563, 553, 568, 563, 553, 624, 521, 548, 557, 568, 2532, 2549, 2549, 2537, 2540, 2534, 2532, 2545, 2540, 2538, 2539, 2474, 2543, 2550, 2538, 2539, 2437, 2456, 2441, 2433, 2463, 2461, 2458, 2436, 2172, 2145, 2172, 2148, 2157, 1229, 1225, 1221, 1219, 1217, 1026, 1053, 1041, 1027, 1047, 1051, 1025, 1050, 1024, 2277, 2278, 22178, 27857, 549, 544, 27979, 18053, 1903, 1899, 21785, -29398, 1509, 1506, -31720, -29436, 3017, 3019, -31984, 32593, 1129, 1130, 18522, 26325, 2132, 2130, 2128, 274, 259, 259, 261, 278, 257, 2392, 2368, 2399, 2368, 2391, 3194, 3192, 3177, 3190, 3183, 3136, 3180, 3179, 3198, 3179, 3178, 3180, 
    2769, 2772, 2763, 2770, 2813, 2769, 2774, 2755, 2774, 2775, 2769, 1633, 1639, 1636, 1964, 1962, 1981, 1980, 1982, 1963, 1978, 1942, 1979, 275, 1542, 1540, 1553, 1536, 1538, 1546, 1559, 1564, 1574, 1546, 1547, 1553, 1536, 1547, 1553, 1947, 1946, 1931, 1950, 1942, 1939, 1980, 1936, 1937, 1931, 1946, 1937, 1931, 1002, 1005, 1007, 999, 961, 1005, 1004, 1014, 999, 1004, 1014, 1013, 1001, 996, 1020, 992, 1015, 966, 1002, 1003, 1009, 992, 1003, 1009, 1552, 1542, 1538, 1553, 1536, 1547, 1568, 1548, 1549, 1559, 1542, 1549, 1559};

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return com.github.catvod.spider.merge.D.b.d();
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        JSONArray jSONArrayOptJSONArray;
        String strM570 = C0143.m570(f17short, 0, 2, 507);
        String strM427 = C0107.m427(f17short, 2, 6, 728);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a.entrySet()) {
            arrayList.add(new com.github.catvod.spider.merge.p001b.b((String) entry.getKey(), (String) entry.getValue(), null));
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            String strA = a(1, C0081.m322(f17short, 8, 2, 1071));
            String strV = FishCrypto.v(C0122.m486(f17short, 10, 131, 3003));
            HashMap map = new HashMap();
            map.put(C0021.m83(f17short, 141, 10, 1644), C0126.m503(f17short, 151, 139, 2196));
            map.put(C0011.m42(f17short, 290, 12, 1667), C0133.m529(f17short, 302, 16, 1184));
            JSONObject jSONObject = new JSONObject(X1.M(strV, strA, map).a());
            if (jSONObject.has(strM427) && (jSONArrayOptJSONArray = jSONObject.getJSONObject(strM427).optJSONArray(C0087.m346(f17short, 318, 5, 2835))) != null) {
                for (int i = 0; i < Math.min(jSONArrayOptJSONArray.length(), 20); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString = jSONObject2.optString(C0125.m499(f17short, 323, 3, 1816));
                    String strOptString2 = jSONObject2.optString(C0017.m65(f17short, 326, 5, 2972));
                    String strOptString3 = jSONObject2.optString(C0091.m360(f17short, 331, 5, 2506));
                    String strOptString4 = jSONObject2.optString(C0137.m545(f17short, 336, 9, 2397), "");
                    String str = strOptString + strM570 + strOptString2 + strM570 + strOptString3;
                    if (strOptString4.isEmpty()) {
                        strOptString4 = "";
                    }
                    arrayList2.add(new k(str, strOptString2, strOptString3, strOptString4));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, arrayList2);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String str3 = str2;
        String strM10 = C0003.m10(f17short, 345, 2, 1484);
        AbstractC0280n1.u(str, str3);
        try {
            if (str3.contains(strM10)) {
                String[] strArrSplit = str3.split(strM10);
                if (strArrSplit.length > 0) {
                    str3 = strArrSplit[0];
                }
            }
            String strW = FishCrypto.w(C0032.m126(f17short, 347, 91, 945), str3);
            HashMap map = new HashMap();
            map.put(C0027.m105(f17short, 438, 10, 3090), C0026.m102(f17short, 448, 139, 1532));
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(strW);
            gVar.h(map);
            return gVar.r();
        } catch (Exception e) {
            e.printStackTrace();
            return com.github.catvod.spider.merge.p001b.g.d(C0047.m186(f17short, 587, 4, 1377));
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strM116 = C0030.m116(f17short, 591, 3, 1417);
        try {
            String str = list.get(0);
            String[] strArrSplit = str.split(C0011.m42(f17short, 594, 2, 1569));
            String str2 = strArrSplit.length > 0 ? strArrSplit[0] : "";
            String str3 = strArrSplit.length > 1 ? strArrSplit[1] : "";
            String str4 = strArrSplit.length > 2 ? strArrSplit[2] : "";
            k kVar = new k();
            kVar.n(str);
            kVar.o(str3);
            kVar.p(str4);
            kVar.i(C0070.m277(f17short, 596, 2, 2942));
            kVar.l(str3);
            kVar.q(C0030.m116(f17short, 598, 3, 1197));
            kVar.r(strM116 + str2);
            boolean z = FishCrypto.a;
            N1.d(kVar);
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        } catch (Exception e) {
            e.printStackTrace();
            return com.github.catvod.spider.merge.p001b.g.d(C0047.m186(f17short, 601, 6, 1291));
        }
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        JSONArray jSONArrayOptJSONArray;
        String strM360 = C0091.m360(f17short, 607, 2, 2998);
        String strM10 = C0003.m10(f17short, 609, 6, 2895);
        ArrayList arrayList = new ArrayList();
        try {
            String strA = a(Integer.parseInt(str2), str);
            String strV = FishCrypto.v(C0050.m199(f17short, 615, 131, 1771));
            HashMap map2 = new HashMap();
            map2.put(C0105.m416(f17short, 746, 10, 2044), C0073.m288(f17short, 756, 139, 1367));
            map2.put(C0143.m570(f17short, 895, 12, 605), C0092.m365(f17short, 907, 16, 2437));
            JSONObject jSONObject = new JSONObject(X1.M(strV, strA, map2).a());
            if (jSONObject.has(strM10) && (jSONArrayOptJSONArray = jSONObject.getJSONObject(strM10).optJSONArray(C0133.m529(f17short, 923, 5, 2540))) != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString = jSONObject2.optString(C0107.m427(f17short, 928, 3, 2536));
                    String strOptString2 = jSONObject2.optString(C0073.m288(f17short, 931, 5, 2056));
                    String strOptString3 = jSONObject2.optString(C0046.m182(f17short, 936, 5, 1188));
                    String strOptString4 = jSONObject2.optString(C0092.m365(f17short, 941, 9, 1140), "");
                    String str3 = strOptString + strM360 + strOptString2 + strM360 + strOptString3;
                    if (strOptString4.isEmpty()) {
                        strOptString4 = "";
                    }
                    arrayList.add(new k(str3, strOptString2, strOptString3, strOptString4));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        linkedHashMap.put(C0087.m346(f17short, 950, 2, 2256), C0014.m54(f17short, 952, 2, 1949));
        linkedHashMap.put(C0050.m199(f17short, 954, 2, 531), C0090.m358(f17short, 956, 2, 2062));
        linkedHashMap.put(C0006.m21(f17short, 958, 2, 1881), C0076.m301(f17short, 960, 2, 1789));
        linkedHashMap.put(C0117.m467(f17short, 962, 2, 1491), C0059.m234(f17short, 964, 2, 1769));
        linkedHashMap.put(C0140.m558(f17short, 966, 2, 3071), C0076.m301(f17short, 968, 2, 2228));
        linkedHashMap.put(C0085.m339(f17short, 970, 2, 1119), C0109.m432(f17short, 972, 2, 1594));
    }

    public static String a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0118.m471(f17short, 974, 3, 2101), 1);
            jSONObject.put(C0130.m516(f17short, 977, 6, 371), C0050.m199(f17short, 983, 5, 2414));
            jSONObject.put(C0125.m499(f17short, 988, 12, 3103), 0);
            jSONObject.put(C0143.m570(f17short, 1000, 11, 2722), 0);
            jSONObject.put(C0126.m503(f17short, 1011, 3, 1559), 60);
            jSONObject.put(C0104.m414(f17short, 1014, 9, 2015), Integer.parseInt(str));
            jSONObject.put(C0030.m116(f17short, 1023, 1, 355), i);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0085.m339(f17short, 1024, 15, 1637));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0046.m182(f17short, 1039, 13, 2047));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0087.m346(f17short, 1052, 11, 898));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0056.m223(f17short, 1063, 13, 901));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0076.m301(f17short, 1076, 13, 1635));
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

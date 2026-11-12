package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.utils.C0143;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class QiutongTY extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f82short = {2764, 2768, 22055, -26713, 3260, -31247, 31809, 1718, 30853, 30568, 537, 537, 29338, 32113, 1551, 1648, 1647, 1593, 1538, 1588, 1541, 1590, 1547, 1580, 1586, 1555, 1548, 1574, 1649, 1574, 1560, 1593, 1542, 1544, 1592, 1583, 1656, 1642, 1547, 1539, 1549, 1571, 1551, 1585, 1550, 1579, 1538, 1583, 1540, 1548, 1585, 1585, 1545, 1550, 1540, 1550, 1546, 1545, 1571, 1578, 1575, 1547, 1546, 1654, 1541, 1654, 1583, 1539, 1575, 1549, 1558, 1585, 1589, 1657, 1578, 1590, 1577, 1595, 1551, 1655, 1590, 1651, 1549, 1559, 1546, 1568, 1649, 1548, 1573, 1585, 1571, 1656, 1560, 1570, 1595, 1559, 1539, 1589, 1582, 1584, 1574, 1539, 1536, 1660, 1660, 1829, 1795, 1813, 1794, 1885, 1841, 1815, 1813, 1822, 1796, 1084, 1054, 1035, 1048, 1053, 1053, 1040, 1118, 1092, 1119, 1089, 1105, 1113, 1062, 1048, 1055, 1045, 1054, 1030, 1026, 1105, 1087, 1061, 1105, 1088, 1089, 1119, 1089, 1098, 1105, 1062, 1048, 1055, 1095, 1093, 1098, 1105, 1033, 1095, 1093, 1112, 1105, 1072, 1025, 1025, 1053, 1044, 1062, 1044, 1043, 1082, 1048, 1029, 1118, 1092, 1090, 1094, 1119, 1090, 1095, 1105, 1113, 1082, 1081, 1061, 1084, 1085, 1117, 1105, 1053, 1048, 1050, 1044, 1105, 1078, 1044, 1042, 1050, 1054, 1112, 1105, 1074, 1049, 1027, 1054, 1052, 1044, 1118, 1088, 1093, 1089, 1119, 1089, 1119, 1089, 1119, 1089, 1105, 1058, 1040, 1047, 1040, 1027, 1048, 1118, 1092, 1090, 1094, 1119, 1090, 1095, 757, 727, 727, 721, 708, 704, 870, 887, 887, 875, 878, 868, 870, 883, 878, 872, 873, 808, 877, 884, 872, 873, 811, 807, 883, 866, 895, 883, 808, 887, 875, 870, 878, 873, 811, 807, 813, 808, 813, 2853, 2834, 2833, 2834, 2821, 2834, 2821, 2974, 2946, 2946, 2950, 2949, 3020, 3033, 3033, 2951, 2975, 2947, 3032, 2946, 2969, 2968, 2961, 3033, 1607, 1540, 1626, 1564, 1617, 2423, 2416, 2424, 2417, 2337, 2412, 2417, 2417, 2419, 2391, 2426, 2339, 1509, 1440, 1451, 1442, 1453, 1453, 1446, 1455, 1418, 1447, 1534, 1520, 1509, 1459, 1455, 1442, 1463, 1445, 1452, 1457, 1454, 1534, 1522, 2564, 2561, 2580, 2561, 25125, 24903, -28863, 25698, 25047, 26569, 1022, 995, 1022, 998, 1007, 2151, 2155, 2162, 2145, 2166, 2771, 2772, 2782, 2774, 2803, 2780, 2768, 2776, 886, 887, 865, 881, 864, 891, 866, 870, 891, 893, 892, 3150, 3151, 3156, 3145, 3139, 3141, 2106, 2101, 2082, 2074, 2101, 2105, 2097, 32295, -26050, 1402, 1407, 1401, 1378, 1375, 1400, 1382, 582, 588, 598, 516, 3134, 3131, 3106, 3106, 3099, 3132, 3106, 2279, 2233, 2303, 2226, 2222, 25800, 26538, 26343, 26484, 26426, 24868, 862, 1019, 999, 1753, 1750, 1729, 1790, 1747, 753, 736, 742, 740, 702, 755, 750, 750, 748, 725, 760, 753, 740, 700, 679, 751, 736, 759, 712, 741, 700, 2817, 2901, 2888, 2888, 2890, 2926, 2883, 2842, 2817, 2896, 2888, 2901, 2883, 2842, 2817, 2903, 2886, 2880, 2882, 2842, 2280, 2238, 2223, 2217, 2219, 2205, 2215, 2228, 2219, 2291, 2301, 2302, 2280, 2221, 2214, 2223, 2208, 2208, 2219, 2210, 2183, 2218, 2291, 2301, 2280, 2238, 2210, 2223, 2234, 2216, 2209, 2236, 2211, 2291, 2303, 3016, 3021, 3032, 3021, 1509, 1504, 1530, 1533, 1422, 1427, 1427, 1425, 1461, 1432, 3003, 2982, 3003, 2979, 2986, 585, 581, 604, 591, 600, 2033, 2046, 2025, 2001, 2046, 2034, 2042, 923, 896, 921, 921, 2077, 2146, 2173, 2051, 2064, 2101, 2109, 2050, 2155, 2075, 2083, 2078, 2069, 2065, 2074, 2155, 2083, 2090, 2106, 2086, 2065, 2084, 2084, 2076, 2069, 2146, 2151, 2070, 2084, 2052, 2108, 2055, 2097, 2148, 2068, 2076, 2087, 2149, 2147, 2105, 2064, 2048, 2072, 2108, 2057, 2074, 2097, 2071, 2102, 2111, 2055, 2085, 2103, 2071, 2068, 2149, 2109, 2104, 2080, 2087, 2109, 2073, 2103, 2151, 2070, 2068, 2109, 2052, 2052, 2054, 2085, 2085, 2145, 2146, 2100, 2101, 2051, 2096, 2098, 2144, 2050, 2069, 2096, 2089, 2075, 2104, 2104, 2058, 2066, 2158, 2158, 2147, 2117, 2131, 2116, 2075, 2167, 2129, 2131, 2136, 2114, 1285, 1319, 1330, 1313, 1316, 1316, 1321, 1383, 1405, 1382, 1400, 1384, 1376, 1311, 1313, 1318, 1324, 1319, 1343, 1339, 1384, 1286, 1308, 1384, 1401, 1400, 1382, 1400, 1395, 1384, 1311, 1313, 1318, 1406, 1404, 1395, 1384, 1328, 1406, 1404, 1377, 1384, 1289, 1336, 1336, 1316, 1325, 1311, 1325, 1322, 1283, 1313, 1340, 1383, 1405, 1403, 1407, 1382, 1403, 1406, 1384, 1376, 1283, 1280, 1308, 1285, 1284, 1380, 1384, 1316, 1313, 1315, 1325, 1384, 1295, 1325, 1323, 1315, 1319, 1377, 1384, 1291, 1312, 1338, 1319, 1317, 1325, 1383, 1401, 1404, 1400, 1382, 1400, 1382, 1400, 1382, 1400, 1384, 1307, 1321, 1326, 1321, 1338, 1313, 1383, 1405, 1403, 1407, 1382, 1403, 1406, 1436, 1470, 1470, 1464, 1453, 1449, 1078, 1063, 1063, 1083, 1086, 1076, 1078, 1059, 1086, 1080, 1081, 1144, 1085, 1060, 1080, 1081, 1147, 1143, 1059, 1074, 1071, 1059, 1144, 1063, 1083, 1078, 1086, 1081, 1147, 1143, 1149, 1144, 1149, 742, 721, 722, 721, 710, 721, 710, 689, 685, 685, 681, 682, 739, 758, 758, 680, 688, 684, 759, 685, 694, 695, 702, 758, 2445, 2447, 2458, 2443, 2441, 2433, 2460, 2455, 2477, 2433, 2432, 2458, 2443, 2432, 2458, 3170, 3171, 3186, 3175, 3183, 3178, 3141, 3177, 3176, 3186, 3171, 3176, 3186, 1492, 1491, 1489, 1497, 1535, 1491, 1490, 1480, 1497, 1490, 1480, 1414, 1529, 1510, 1419, 1466, 1451, 1445, 1450, 1530, 1432, 1511, 1465, 1467, 1413, 1529, 1437, 1447, 1424, 1439, 1426, 1445, 1411, 1425, 1444, 1531, 1425, 1520, 1457, 1434, 1528, 1468, 1424, 1439, 1436, 1425, 1421, 1439, 1521, 1409, 1471, 1454, 1466, 1468, 1438, 1466, 1437, 1532, 1511, 1507, 1445, 1452, 1464, 1414, 1535, 1434, 1531, 1435, 1455, 1511, 1440, 1441, 1408, 1411, 1456, 1410, 1408, 1436, 1450, 1426, 1442, 1413, 1531, 1457, 1470, 1511, 1471, 1420, 1442, 1422, 1469, 1417, 1423, 1452, 1438, 1413, 1531, 1419, 1455, 1408, 1433, 1415, 1521, 1469, 1453, 1409, 1418, 1409, 1520, 1469, 1418, 1439, 1425, 1535, 1444, 1520, 1413, 1454, 1464, 1507, 1451, 1525, 694, 682, 682, 686, 3321, 3304, 3313, 2959, 2965, 2952, 2969, 1345, 2516, 2504, 2501, 2525, 2497, 2518, 2535, 2507, 2506, 2512, 2497, 2506, 2512, 460, 474, 478, 461, 476, 471, 508, 464, 465, 459, 474, 465, 459, 2717, 2699, 2703, 2716, 2701, 2694, 
    2733, 2689, 2688, 2714, 2699, 2688, 2714};
    public String a = "";

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return com.github.catvod.spider.merge.D.b.d();
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("-1", "全部", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("1", "足球", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("2", "篮球", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("11", "电竞", null));
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, new ArrayList());
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return searchContent(str, z);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String str3 = str2;
        String strI = AbstractC0280n1.i(str, str3, null, null);
        String str4 = "";
        if (!TextUtils.isEmpty(str3)) {
            try {
                str4 = new String(Base64.decode(str3, 2), StandardCharsets.UTF_8);
            } catch (Exception unused) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            str3 = str4;
        }
        String strW = FishCrypto.w("N1.xCuDwJmsRMg0gYxGIyn9+JBLbNpOjCnEMppHOEOKHbkfJK7D7nBfLWpt8kwhzN6w2LVKa0Mdpb9YczVBtoqgBA==", str3);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(strW);
        HashMap mapT = com.github.catvod.spider.merge.D.b.t("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36", "Accept", "application/json, text/plain, */*");
        mapT.put("Referer", "https://qiu.tong/");
        gVar.h(mapT);
        gVar.b(strI);
        if (strW.contains(".m3u8")) {
            gVar.k();
        }
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        JSONObject jSONObjectOptJSONObject = new JSONObject(a("info?roomId=" + str + "&channelId=3&platform=1")).optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            return com.github.catvod.spider.merge.p001b.g.d("暂无详情数据");
        }
        k kVarA = AbstractC0449a.a(str);
        kVarA.o(b("title", jSONObjectOptJSONObject));
        kVarA.p(b("cover", jSONObjectOptJSONObject));
        kVarA.i(b("nickName", jSONObjectOptJSONObject));
        String strB = b("description", jSONObjectOptJSONObject);
        if (TextUtils.isEmpty(strB)) {
            strB = b("notice", jSONObjectOptJSONObject);
        }
        kVarA.l(strB);
        kVarA.s(b("navName", jSONObjectOptJSONObject));
        kVarA.q("球通");
        ArrayList arrayList = new ArrayList();
        String strB2 = b("pushUrl", jSONObjectOptJSONObject);
        if (!TextUtils.isEmpty(strB2)) {
            StringBuilder sb = new StringBuilder("flv$");
            sb.append(strB2 == null ? "" : Base64.encodeToString(strB2.getBytes(StandardCharsets.UTF_8), 2));
            arrayList.add(sb.toString());
        }
        String strB3 = b("pullUrl", jSONObjectOptJSONObject);
        if (!TextUtils.isEmpty(strB3)) {
            StringBuilder sb2 = new StringBuilder("m3u8$");
            sb2.append(strB3 != null ? Base64.encodeToString(strB3.getBytes(StandardCharsets.UTF_8), 2) : "");
            arrayList.add(sb2.toString());
        }
        if (arrayList.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d("暂无播放数据");
        }
        kVarA.r(TextUtils.join("#", arrayList));
        AbstractC0280n1.p(kVarA.c());
        AbstractC0280n1.q(kVarA.e());
        FishCrypto.c(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = str;
        if ("-1".equals(str3)) {
            str3 = "";
        }
        if (map != null) {
            String strM499 = "navId";
            if (map.get(strM499) != null) {
                str3 = map.get(strM499);
            }
        }
        JSONObject jSONObjectOptJSONObject = new JSONObject(a("page?roomType=&navId=" + str3 + "&roomId=&word=&page=" + str2 + "&pageSize=30&channelId=3&platform=1")).optJSONObject("data");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray("list");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null) {
                    String strB = b("roomId", jSONObjectOptJSONObject2);
                    String strB2 = b("title", jSONObjectOptJSONObject2);
                    String strB3 = b("cover", jSONObjectOptJSONObject2);
                    String strB4 = b("navName", jSONObjectOptJSONObject2);
                    if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(strB2)) {
                        arrayList.add(new k(strB, strB2, strB3, strB4));
                    }
                }
            }
        }
        int i2 = Integer.parseInt(str2);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.F(arrayList);
        gVar.o(i2, 71582788, 30, Integer.MAX_VALUE);
        return gVar.r();
    }

    public static String b(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return "";
        }
        String strOptString = jSONObject.optString(str);
        return "null".equals(strOptString) ? "" : strOptString;
    }

    public final String a(String str) {
        try {
            String str2 = this.a + FishCrypto.v("N1.PCfnQ8HpMFBI8pyiuBwwOF14EwWoTb7GOt60jCSKoZIbDelTvdDG6nkstnJd4EGnWWUvv21gfPca3QFczHkkYA==") + str;
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
            map.put("Accept", "application/json, text/plain, */*");
            map.put("Referer", "https://qiu.tong/");
            return X1.X(str2, null, map);
        } catch (Exception unused) {
            return "";
        }
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
        super.init(context, str);
        this.a = FishCrypto.v("N1.Crcmb2P/qsM1UoXWZmKYl3Y8yR0tXWTYEW9IwfrtVrU4/+mdpN7R3Sg/hiHKxJHTbZjM3yv/wDjFuAGdVM3CgHQO9ueIBI8uBWY7l8Mfp+c=");
        String strG = "";
        if (!TextUtils.isEmpty(str)) {
            String strTrim = str.trim();
            if (!strTrim.startsWith("http")) {
                try {
                    JSONObject jSONObject = new JSONObject(strTrim);
                    strTrim = jSONObject.optString("api");
                    if (TextUtils.isEmpty(strTrim)) {
                        strTrim = jSONObject.optString("site");
                    }
                } catch (Exception unused) {
                }
            }
            strG = strTrim;
        }
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        while (strG.endsWith("/")) {
            strG = com.github.catvod.spider.merge.D.b.g(strG, 1, 0);
        }
        this.a = strG;
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

package com.github.catvod.spider;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
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
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0120;
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
public class SuiYuan extends Spider {
    public final String a = UUID.randomUUID().toString().replace("-", "");
    public String b = "";

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f91short = {2125, 2161, 2174, 2153, 393, 404, 389, 397, 403, 1752, 1749, 2125, 2114, 2126, 2118, 2562, 2573, 2568, 2576, 2561, 2582, 2583, 2446, 2441, 2443, 2435, 649, 652, 662, 657, 1459, 1460, 1462, 1470, 2710, 2707, 2697, 2702, 1403, 1386, 1399, 1403, 1898, 1915, 1917, 1919, 1447, 1457, 1461, 1446, 1463, 1468, 1839, 1830, 1851, 1828, 1832, 1853, -25228, 29923, 28502, 28357, -32232, 27755, 21194, -31010, -2825, -32756, -26058, -32722, 21672, 22966, -25614, -25283, 1715, 1700, 1714, 1710, 1709, 1719, 1700, 604, 583, 579, 589, 582, 3136, 3143, 3161, 313, 296, 315, 314, 300, 901, 904, 908, 905, 904, 927, 1911, 1914, 2503, 2502, 2519, 2498, 2506, 2511, 2532, 2557, 2550, 580, 587, 583, 591, 2081, 2104, 2098, 1359, 1368, 1360, 1372, 1359, 1366, 1358, 621, 625, 629, 614, 2034, 2017, 2038, 2034, 2585, 2587, 2572, 2583, 2570, 1273, 1268, 1263, 1272, 1278, 1257, 1266, 1263, 1321, 1317, 1316, 1342, 1327, 1316, 1342, 267, 270, 265, 258, 276, 1569, 1588, 1581, 1591, 1579, 1568, 1569, 1591, 1349, 1374, 1370, 1364, 1375, 1214, 2463, 2451, 2456, 2457, 2857, 2045, 2045, 2045, 2522, 2503, 2506, 933, 948, 946, 944, 845, 849, 844, 842, 1932, 1951, 1928, 1932, 1425, 1421, 1417, 1434, 2499, 2497, 2516, 2501, 2503, 2511, 2514, 2521, 2209, 2224, 2224, 2220, 2217, 2211, 2209, 2228, 2217, 2223, 2222, 2287, 2218, 2227, 2223, 2222, 2299, 2272, 2211, 2216, 2209, 2226, 2227, 2213, 2228, 2301, 2229, 2228, 2214, 2285, 2296, 2474, 1461, 1456, 1450, 1453, 1759, 1742, 1736, 1738, 2380, 2397, 2395, 2393, 2399, 2387, 2377, 2386, 2376, 718, 715, 719, 715, 726, 1229, 1238, 1229, 1240, 1237, 553, 548, 2376, 2375, 2379, 2371, 1217, 1240, 1234, 2727, 2736, 2744, 2740, 2727, 2750, 2726, -27415, 32126, 22187, 23794, -29279, 23361, -27754, 31233, -28946, 26971, -30564, 24815, 1735, 1733, 1746, 1735, 1750, 1733, 1746, 491, 508, 490, 492, 501, 493, 2290, 2302, 2303, 2277, 2292, 2281, 2277, 2217, 2213, 2212, 2238, 2211, 2212, 2239, 2223, 1382, 1383, 1390, 1379, 1403, 1373, 1391, 1393, 2488, 2480, 2465, 2493, 2490, 2481, 2958, 2956, 2973, 1897, 1902, 1904, 1520, 1533, 1529, 1532, 1533, 1514, 1515, 2126, 2129, 2125, 2122, 3196, 3152, 3153, 3147, 3162, 3153, 3147, 3090, 3179, 3142, 3151, 3162, 3312, 3297, 3297, 3325, 3320, 3314, 3312, 3301, 3320, 3326, 3327, 3262, 3323, 3298, 3326, 3327, 3242, 3249, 3314, 3321, 3312, 3299, 3298, 3316, 3301, 3244, 3300, 3301, 3319, 3260, 3241, 1987, 1998, 1989, 2008, 2294, 2292, 2277, 2874, 2838, 2839, 2829, 2844, 2839, 2829, 2900, 2861, 2816, 2825, 2844, 1047, 1032, 1029, 1028, 1038, 1102, 1053, 1033, 1048, 1045, 1043, 1107, 2686, 2659, 2678, 2676, 2662, 2657, 2687, 1876, 1873, 1859, 1880, 1819, 1864, 1885, 1884, 2485, 2489, 2488, 2469, 2467, 2491, 2483, 3143, 3147, 3146, 3152, 3149, 3146, 3153, 3137, 1542, 1546, 1547, 1553, 1536, 1565, 1553, -28220, 30803, -29508, 27401, 25330, 27550, 25259, 25091, -28506, 31025, -29218, 27243, 26187, 24356, -29780, -30226, 18467, -28551, 1900, 1902, 1915, 1898, 1896, 1888, 1917, 1910, 1868, 1888, 1889, 1915, 1898, 1889, 1915, -25436, 30003, 25166, 27022, 2571, 2659, 2687, 2687, 2683, 2571, 479, 477, 458, 471, 465, 464, 2991, 3007, 3001, 2994, 3001, 1541, 1556, 1543, 1556, 1560, 1542, 665, 661, 660, 654, 671, 642, 654, 2188, 2177, 2186, 2199, 1121, 1126, 1139, 1126, 1127, 1121, 1457, 1468, 1464, 1469, 1468, 1451, 1450, 1315, 1332, 1314, 1313, 1342, 1343, 1314, 1332, 1294, 1316, 1315, 1341, 2717, 2786, 2813, 2747, 2697, 2719, 2745, 2712, 2726, 2736, 2720, 2794, 2791, 2746, 2699, 2710, 2694, 2808, 2722, 2712, 2812, 2689, 2745, 2691, 2710, 2724, 2750, 2704, 2724, 2726, 2795, 2721, 2718, 2794, 2719, 2738, 2751, 2788, 2789, 2689, 2697, 2713, 2705, 2713, 2795, 2743, 2697, 2751, 2709, 2731, 2740, 2750, 2715, 2714, 2790, 2713, 2719, 2791, 2788, 2725, 2712, 2716, 2723, 2688, 2730, 2722, 2790, 2718, 2730, 2698, 2731, 2750, 2751, 2693, 2698, 2791, 2691, 2789, 2717, 2747, 2786, 2717, 2724, 2791, 2719, 2715, 2688, 2736, 2724, 2798, 2798, 1373, 1314, 1341, 1404, 1346, 1383, 1370, 1344, 1318, 1361, 1353, 1349, 1396, 1406, 1396, 1381, 1405, 1353, 1403, 1401, 1404, 1376, 1319, 1396, 1361, 1362, 1385, 1350, 1399, 1386, 1393, 1365, 1315, 1370, 1402, 1394, 1323, 1367, 1368, 1361, 1385, 1371, 1348, 1402, 1405, 1319, 1407, 1362, 1367, 1406, 1379, 1344, 1336, 1348, 1336, 1392, 1354, 1387, 1385, 1340, 1317, 1382, 1407, 1372, 1376, 1340, 1400, 1319, 1317, 1404, 1376, 1372, 1345, 1362, 1346, 1316, 1387, 1397, 1377, 1365, 1350, 1407, 1347, 1367, 1369, 1380, 1312, 1405, 1364, 1396, 1393, 1375, 1367, 1400, 1368, 1400, 1385, 1379, 1379, 1322, 1404, 1340, 1406, 1375, 1378, 1369, 1394, 1392, 1340, 1381, 1361, 1319, 1407, 1365, 1398, 1398, 1397, 1365, 1376, 1365, 1397, 1373, 1378, 1386, 1381, 1317, 1354, 1318, 1401, 1360, 1402, 1402, 1399, 1401, 1319, 1351, 1348, 1376, 1394, 1406, 1379, 1374, 1336, 1364, 1375, 1315, 1315, 1402, 1399, 1406, 1371, 1317, 1346, 1326, 1326, 2986, 3029, 3018, 2988, 2983, 2944, 2967, 2983, 3024, 2992, 3029, 3030, 2999, 3019, 2986, 2978, 2989, 2989, 3030, 3037, 2989, 2950, 2951, 3036, 3024, 2966, 2976, 2946, 2967, 3037, 2957, 2960, 2952, 2979, 2966, 3023, 2962, 2981, 2988, 2953, 2951, 2996, 3004, 2944, 2960, 2952, 3031, 2989, 2992, 2988, 2961, 2952, 2945, 2974, 2951, 2984, 3019, 2967, 2986, 2956, 2992, 3024, 2997, 2953, 2996, 2984, 3028, 2977, 2946, 2944, 2985, 2965, 2992, 2954, 3019, 2967, 2974, 2964, 3005, 2950, 2990, 2972, 3031, 2996, 2959, 2953, 2997, 2993, 3026, 2947, 2973, 2995, 2996, 3004, 2947, 3004, 3005, 2981, 3030, 2989, 3005, 2965, 2999, 2981, 2995, 2976, 2985, 2984, 3027, 2959, 3033, 1351, 1336, 1319, 1381, 1361, 1328, 1359, 1369, 1386, 1342, 1357, 1379, 1387, 1347, 1376, 1347, 1352, 1380, 1404, 1380, 1314, 1318, 1407, 1387, 1355, 1354, 1342, 1343, 1384, 1329, 1384, 1368, 1390, 1357, 1389, 1339, 1329, 1391, 1329, 1340, 1376, 1378, 1318, 1407, 1348, 1405, 1328, 1389, 1374, 1342, 1314, 1404, 1391, 1389, 1347, 1351, 1345, 1388, 1363, 1391, 1352, 1390, 1357, 1356, 1345, 1350, 1355, 1381, 1375, 1358, 1349, 1400, 1392, 1350, 1403, 1347, 1340, 1328, 1391, 1392, 1348, 1340, 1358, 
    1376, 1372, 1369, 1386, 1329, 1386, 1354, 1378, 1383, 1355, 1340, 1384, 1363, 1391, 1351, 1405, 1381, 1404, 1371, 1338, 1349, 1405, 1360, 1387, 1390, 1405, 1352, 1332, 590, 588, 602, 598, 581, 598, 576, 584, 586, 589, 580, 1464, 1468, 1559, 1554, 1543, 1554, 1502, 1481, 1481, 1492, 1481, -28640, 31159, 28362, 25866, 24478, -29814, -25389, 30020, 24209, 21704, -31809, 20890, 21357, -30855, -27296, 31991, 22306, 23931, 19470, 24558, 26127, 26279, -28441, 31088, -29281, 27178, 21704, 23982, 24409, -29875, -28103, 31662, 1174, 1254, 1278, 1254, 1174, 27859, 21382, 21494, 25500, -27141, 31704, 601, 600, 585, 604, 596, 593, 638, 594, 595, 585, 600, 595, 585, 437, 434, 432, 440, 414, 434, 435, 425, 440, 435, 425, 863, 856, 858, 850, 865, 862, 851, 850, 856, 884, 856, 857, 835, 850, 857, 835, 2217, 2229, 2229, 2225, 1979, 3024, 3031, 3017, -27227, 31794, 778, 890, 866, 890, 778, 27471, 21530, 21610, 26314, 26210, -25266, 29913, 3041, 2961, 2953, 2961, 3041, 25508, 23793, 23681, 27883, -25972, 29871, 656, 652, 641, 665, 645, 658, 675, 655, 654, 660, 645, 654, 660, 1477, 1491, 1495, 1476, 1493, 1502, 1525, 1497, 1496, 1474, 1491, 1496, 1474, 2755, 2773, 2769, 2754, 2771, 2776, 2803, 2783, 2782, 2756, 2773, 2782, 2756};
    public static final MediaType c = MediaType.parse("application/json; charset=utf-8");

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayOptJSONArray = a("nav", new JSONObject()).optJSONArray("items");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    arrayList.add(new com.github.catvod.spider.merge.p001b.b(strOptString, jSONObjectOptJSONObject.optString("name"), null));
                    if (z) {
                        jSONObject.put(strOptString, jSONObjectOptJSONObject.optJSONArray("filters"));
                    }
                }
            }
        }
        return com.github.catvod.spider.merge.p001b.g.w(arrayList, c(a("home", new JSONObject()).optJSONArray("list")), jSONObject);
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        return com.github.catvod.spider.merge.p001b.g.y(c(a("home", new JSONObject()).optJSONArray("list")));
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("text", str);
        int iMax = 1;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        return b(a("search", jSONObjectPut.put("page", iMax)));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strM477 = "format";
        String strM182 = "随缘播放解析失败，请重试当前选集";
        String strSubstring = str2 == null ? "" : str2;
        try {
            int iIndexOf = strSubstring.indexOf(36);
            if (iIndexOf >= 0) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            JSONObject jSONObjectA = a("resolve", new JSONObject().put("token", strSubstring));
            String strOptString = jSONObjectA.optString("url");
            if (TextUtils.isEmpty(strOptString)) {
                com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.C("");
                gVar.q(0);
                gVar.l(strM182);
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
            if (!jSONObjectA.optString(strM477).isEmpty()) {
                gVar2.f(jSONObjectA.optString(strM477));
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
            gVar3.l(strM182);
            return gVar3.r();
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        if (list == null || list.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        JSONObject jSONObject = new JSONObject();
        String str = list.get(0);
        String strM292 = "id";
        JSONObject jSONObjectA = a("detail", jSONObject.put(strM292, str));
        JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("vod");
        if (jSONObjectOptJSONObject == null) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        String strOptString = jSONObjectOptJSONObject.optString(strM292);
        String strM277 = "name";
        k kVar = new k(strOptString, jSONObjectOptJSONObject.optString(strM277), jSONObjectOptJSONObject.optString("pic"), jSONObjectOptJSONObject.optString("remarks"));
        kVar.u(jSONObjectOptJSONObject.optString("year"));
        kVar.k(jSONObjectOptJSONObject.optString("area"));
        kVar.j(jSONObjectOptJSONObject.optString("actor"));
        kVar.m(jSONObjectOptJSONObject.optString("director"));
        kVar.l(jSONObjectOptJSONObject.optString("content"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectA.optJSONArray("lines");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("episodes");
                    ArrayList arrayList3 = new ArrayList();
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject3 != null) {
                                String strM65 = "token";
                                if (!jSONObjectOptJSONObject3.optString(strM65).isEmpty()) {
                                    arrayList3.add(jSONObjectOptJSONObject3.optString(strM277) + "$" + jSONObjectOptJSONObject3.optString(strM65));
                                }
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(jSONObjectOptJSONObject2.optString(strM277, jSONObjectOptJSONObject2.optString("code")));
                        arrayList2.add(TextUtils.join("#", arrayList3));
                    }
                }
            }
        }
        String strM126 = "$$$";
        kVar.q(TextUtils.join(strM126, arrayList));
        kVar.r(TextUtils.join(strM126, arrayList2));
        AbstractC0280n1.p(kVar.c());
        AbstractC0280n1.q(kVar.e());
        FishCrypto.c(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("tid", str);
        int iMax = 1;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("page", iMax);
        if (map != null) {
            String[] strArr = {"area", "year", "sort"};
            for (int i = 0; i < 3; i++) {
                String str3 = strArr[i];
                String str4 = map.get(str3);
                if (!TextUtils.isEmpty(str4)) {
                    jSONObjectPut2.put(str3, str4);
                }
            }
        }
        return b(a("category", jSONObjectPut2));
    }

    public static String b(JSONObject jSONObject) {
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.F(c(jSONObject.optJSONArray("list")));
        gVar.o(jSONObject.optInt("page", 1), jSONObject.optInt("pagecount", 1), jSONObject.optInt("limit", 30), jSONObject.optInt("total", 0));
        return gVar.r();
    }

    public static ArrayList c(JSONArray jSONArray) {
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

    public static byte[] e(Response response, int i) throws IOException {
        if (response.body() == null) {
            return new byte[0];
        }
        long jContentLength = response.body().contentLength();
        long j = i;
        String strM459 = "随缘响应过大";
        if (jContentLength > j) {
            throw new IOException(strM459);
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
                        throw new IOException(strM459);
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
        throw new IOException("随缘请求超时");
    }

    public final synchronized JSONObject a(String str, JSONObject jSONObject) {
        String str2;
        int i;
        try {
            String str3 = this.a;
            long jElapsedRealtime = SystemClock.elapsedRealtime() + 150000;
            String string = str3;
            int i2 = 0;
            while (i2 < 32 && SystemClock.elapsedRealtime() < jElapsedRealtime) {
                int i3 = i2;
                JSONObject jSONObjectD = d("prepare", str, jSONObject, string, "", 0, new JSONObject(), "", jElapsedRealtime);
                JSONObject jSONObjectOptJSONObject = jSONObjectD.optJSONObject("result");
                if (jSONObjectOptJSONObject != null) {
                    return jSONObjectOptJSONObject;
                }
                string = jSONObjectD.getString("context");
                if (jSONObjectD.optBoolean("continue")) {
                    Thread.sleep(Math.min(f(jElapsedRealtime), Math.max(0, Math.min(1000, jSONObjectD.optInt("delay_ms", 200)))));
                } else {
                    String strOptString = jSONObjectD.optString("method", "GET");
                    Request.Builder builderUrl = new Request.Builder().url(jSONObjectD.getString("url"));
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectD.optJSONObject("headers");
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
                    if ("POST".equals(strOptString)) {
                        String strHeader = builderUrl.build().header("Content-Type");
                        if (strHeader == null) {
                            strHeader = "application/json; charset=utf-8";
                        }
                        builderUrl.post(RequestBody.create(MediaType.parse(strHeader), Base64.decode(jSONObjectD.getString("body"), 0)));
                    } else {
                        if (!"GET".equals(strOptString)) {
                            throw new IOException("随缘请求方法无效");
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
                            String lowerCase = responseK.header("Content-Type", "").toLowerCase(Locale.ROOT);
                            if (!lowerCase.startsWith("video/") && !lowerCase.startsWith("audio/") && !lowerCase.contains("mpegurl") && !lowerCase.contains("dash+xml")) {
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
                    JSONObject jSONObjectD2 = d("consume", str, jSONObject, string, Base64.encodeToString(bArrE, 2), i, jSONObject2, str2, jElapsedRealtime);
                    if (!jSONObjectD2.optBoolean("continue")) {
                        return jSONObjectD2;
                    }
                    string = jSONObjectD2.getString("context");
                }
                i2 = i3 + 1;
            }
            throw new IOException("随缘请求恢复超过上限");
        } catch (Throwable th3) {
            throw th3;
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

    public final JSONObject d(String str, String str2, JSONObject jSONObject, String str3, String str4, int i, JSONObject jSONObject2, String str5, long j) throws IOException {
        String strM21 = "随缘桥接 HTTP ";
        if (this.b.isEmpty()) {
            throw new IOException("随缘 PHP 桥地址未配置");
        }
        String string = new JSONObject().put("action", str).put("scene", str2).put("params", jSONObject).put("context", str3).put("body", str4).put("status", i).put("headers", jSONObject2).put("response_url", str5).toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM386 = "N1.hZLjKucs94iXEU+qK/RjPEwmCwu8rM9Lal76RZJBJ8dZlFxgmHI5JL47vKOpSyq5MyYxmlVY4P6Nh1Nw4LHScw==";
        String strM463 = "N1.oQtIS5BZVgmgvnZhjos4gBAzUdybF0Iia8DKBzHWin4lADmpS+W+cYxz/6ulOs/k46osORAQ7xfrFUlPDJw3nGgbLDkKkzpp9o/mLqJac/vB4lFeefFsFfNqyv6Y5jCiidj4TWsampM+GL00idmH6Q==";
        String strM516 = "N1.HCdsC4T12S/NFII29Ibc84rDfs9itlGr+vAHmcPXdtl3ITHulezcL/sNhT4QmPL0EfdMqTn/szpYbJx3PkmQU6gyWPXgXYA2IYqSAWDML7k=";
        String strM105 = "N1.lX9FPc7DjbJiJAmum+/vbBC76a8aQgDd28f85ik/vMt9dW7+ufdJNHeZfAgDEHOBlVGLqyOrJ59fyM5GiUPc8cCknB5aZfNtluR3LtYbgtA=";
        byte[] bArrT = FishCrypto.t(strM516, strM105, strM386, strM463, bytes);
        if (bArrT == null) {
            throw new IOException("随缘请求加密失败");
        }
        JSONObject jSONObject3 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM182 = "moyufucking";
        Response responseK = X1.K(new Request.Builder().url(this.b).post(RequestBody.create(c, jSONObject3.put(strM182, strEncodeToString).toString())).build(), f(j));
        try {
            if (!responseK.isSuccessful()) {
                throw new IOException(strM21 + responseK.code());
            }
            String str6 = new String(e(responseK, 16777216), charset);
            responseK.close();
            JSONObject jSONObject4 = new JSONObject(str6);
            if (jSONObject4.length() != 1 || !jSONObject4.has(strM182)) {
                throw new IOException("随缘响应信封无效");
            }
            byte[] bArrS = FishCrypto.s(strM516, strM105, Base64.decode(jSONObject4.getString(strM182), 0));
            if (bArrS == null) {
                throw new IOException("随缘响应解密失败");
            }
            JSONObject jSONObject5 = new JSONObject(new String(bArrS, charset));
            if (jSONObject5.optBoolean("ok")) {
                return jSONObject5.getJSONObject("data");
            }
            throw new IOException(jSONObject5.optString("error", "随缘桥接失败"));
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

    public void init(Context context, String str) throws Throwable {
        super.init(context, str);
        this.b = "";
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            throw new IOException("随缘 PHP 桥地址未配置");
        }
        boolean zStartsWith = strTrim.startsWith("http");
        String strM414 = "{";
        if (!zStartsWith && !strTrim.startsWith(strM414)) {
            strTrim = FishCrypto.g(strTrim);
        }
        String strTrim2 = strTrim.trim();
        if (strTrim2.startsWith(strM414)) {
            strTrim2 = new JSONObject(strTrim2).optString("url", "").trim();
        }
        HttpUrl httpUrl = HttpUrl.parse(strTrim2);
        if (httpUrl == null || !httpUrl.username().isEmpty() || !httpUrl.password().isEmpty()) {
            throw new IOException("随缘 PHP 桥地址无效");
        }
        this.b = strTrim2;
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

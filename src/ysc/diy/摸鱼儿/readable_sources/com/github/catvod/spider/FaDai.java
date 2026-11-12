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
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
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
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
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
public class FaDai extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f30short = {935, 3173, 3178, 3197, 1395, 1390, 1407, 1399, 1385, 1924, 1929, 3267, 3276, 3264, 3272, 1728, 1743, 1738, 1746, 1731, 1748, 1749, 1513, 1534, 1523, 1514, 1530, 2116, 1227, 1243, 1237, 1225, 2018, 2021, 2023, 2031, 2083, 2086, 2108, 2107, 536, 521, 532, 536, 1281, 1296, 1302, 1300, 2680, 2670, 2666, 2681, 2664, 2659, 2611, 2618, 2599, 2616, 2612, 2593, 1548, 1563, 1549, 1553, 1554, 1544, 1563, 539, 512, 516, 522, 513, 2695, 2688, 2718, 21684, 21283, 25544, 25179, 20565, 20517, 18783, 32031, 1597, 1584, 1588, 1585, 1584, 1575, 2065, 2048, 2067, 2066, 2052, 21575, 21456, -29067, 24582, 24231, -30029, -1894, -29599, -27045, 22678, -29584, 26451, 25984, 24930, 25844, 31017, -30087, 662, 667, 1155, 1154, 1171, 1158, 1166, 1163, 1080, 1057, 1066, 24426, 22781, -30883, 27774, 17025, 30401, 2783, 2768, 2780, 2772, 831, 806, 812, 771, 788, 796, 784, 771, 794, 770, 1131, 1143, 1139, 1120, 1932, 1951, 1928, 1932, 2934, 2932, 2915, 2936, 2917, 1799, 1802, 1809, 1798, 1792, 1815, 1804, 1809, 2358, 2362, 2363, 2337, 2352, 2363, 2337, 1658, 1663, 1656, 1651, 1637, 1439, 1418, 1427, 1417, 1429, 1438, 1439, 1417, -2368, -2745, 2756, 687, 1360, 1355, 1359, 1345, 1354, 22485, 20546, 25222, 25060, 22507, 28972, -27635, -27966, 811, 811, 811, 2102, 2091, 2086, 2063, 2078, 2072, 2074, 2448, 2463, 2450, 2432, 2432, 2838, 2821, 2834, 2838, 2493, 2465, 2469, 2486, 661, 649, 660, 658, 595, 593, 580, 597, 599, 607, 578, 585, 1295, 1290, 1296, 1303, 1594, 1579, 1581, 1583, 934, 951, 945, 947, 949, 953, 931, 952, 930, 1512, 1517, 1513, 1517, 1520, 3315, 3304, 3315, 3302, 3307, 2646, 2601, 2614, 2626, 2633, 2644, 2670, 2683, 2625, 2670, 2657, 2643, 2687, 2665, 2604, 2602, 2601, 2649, 2647, 2665, 2653, 2643, 2606, 2624, 2681, 2678, 2684, 2637, 2670, 2673, 2656, 2603, 2624, 2653, 2687, 2611, 2669, 2649, 2593, 2672, 2685, 2640, 2686, 2646, 2624, 2665, 2644, 2656, 2650, 2674, 2674, 2639, 2668, 2655, 2665, 2605, 2670, 2605, 2676, 2607, 2650, 2667, 2603, 2668, 2672, 2640, 2652, 2639, 2669, 2676, 2643, 2655, 2625, 2667, 2683, 2671, 2645, 2634, 2637, 2641, 2636, 2644, 2645, 2642, 2600, 2645, 2634, 2637, 2615, 2636, 2645, 2606, 2685, 2645, 2669, 2668, 2592, 2607, 2672, 2652, 2642, 2624, 2677, 2677, 2635, 2684, 2679, 2681, 2678, 2687, 2597, 3194, 3077, 3098, 3166, 3171, 3180, 3075, 3199, 3140, 3192, 3198, 3153, 3149, 3157, 3158, 3161, 3148, 3137, 3142, 3079, 3191, 3163, 3155, 3142, 3194, 3072, 3193, 3150, 3084, 3073, 3154, 3174, 3174, 3197, 3195, 3162, 3141, 3099, 3180, 3197, 3192, 3142, 3170, 3138, 3138, 3166, 3187, 3153, 3187, 3197, 3190, 3166, 3078, 3143, 3141, 3166, 3076, 3155, 3173, 3196, 3195, 3191, 3154, 3191, 3173, 3185, 3148, 3180, 3141, 3190, 3189, 3166, 3140, 3148, 3099, 3190, 3167, 3157, 3187, 3153, 3137, 3085, 3190, 3195, 3138, 3073, 3182, 3157, 3175, 3165, 3162, 3160, 3181, 3075, 3141, 3199, 3085, 3078, 3170, 3152, 3197, 3172, 3152, 3170, 3185, 3162, 3076, 3161, 3184, 3185, 3186, 3170, 3171, 3170, 3187, 3103, 3159, 3099, 3141, 3173, 3074, 3136, 3159, 3185, 3079, 3164, 3162, 3103, 3168, 3139, 3192, 3191, 3157, 3193, 3150, 3141, 3185, 3196, 3103, 3168, 3141, 3187, 3193, 3084, 3173, 3148, 3078, 3159, 3143, 3172, 3103, 3182, 3173, 3081, 3081, 2357, 2378, 2389, 2346, 2313, 2321, 2348, 2345, 2377, 2350, 2353, 2360, 2312, 2319, 2362, 2384, 2358, 2315, 2353, 2313, 2327, 2380, 2382, 2384, 2358, 2377, 2380, 2334, 2323, 2364, 2377, 2371, 2326, 2353, 2335, 2335, 2360, 2348, 2326, 2349, 2383, 2358, 2376, 2371, 2378, 2334, 2345, 2376, 2353, 2380, 2356, 2327, 2346, 2364, 2318, 2316, 2335, 2355, 2382, 2324, 2362, 2327, 2337, 2339, 2321, 2371, 2358, 2366, 2314, 2346, 2334, 2312, 2367, 2322, 2324, 2378, 2344, 2388, 2346, 2365, 2305, 2376, 2366, 2358, 2383, 2312, 2317, 2378, 2317, 2318, 2338, 2328, 2328, 2365, 2350, 2365, 2321, 2318, 2359, 2320, 2366, 2344, 2362, 2325, 2328, 2350, 2357, 2338, 2377, 2379, 2374, 1752, 1703, 1720, 1764, 1734, 1749, 1731, 1779, 1728, 1730, 1711, 1790, 1791, 1777, 1733, 1742, 1776, 1791, 1728, 1779, 1755, 1764, 1732, 1756, 1702, 1764, 1780, 1764, 1779, 1749, 1762, 1784, 1789, 1744, 1752, 1757, 1735, 1749, 1789, 1721, 1784, 1710, 1698, 1733, 1700, 1747, 1749, 1702, 1700, 1752, 1728, 1762, 1785, 1780, 1785, 1702, 1790, 1744, 1764, 1763, 1733, 1735, 1757, 1791, 1783, 1742, 1790, 1747, 1778, 1783, 1766, 1742, 1743, 1696, 1735, 1734, 1721, 1761, 1697, 1732, 1790, 1748, 1728, 1711, 1789, 1749, 1790, 1748, 1783, 1772, 1745, 1745, 1777, 1791, 1734, 1745, 1766, 1762, 1778, 1698, 1744, 1749, 1703, 1775, 1721, 1730, 1758, 1731, 1730, 1735, 1707, 2728, 2730, 2748, 2736, 2723, 2736, 2726, 2734, 2732, 2731, 2722, 2796, 2813, 2813, 2785, 2788, 2798, 2796, 2809, 2788, 2786, 2787, 2722, 2791, 2814, 2786, 2787, 2742, 2733, 2798, 2789, 2796, 2815, 2814, 2792, 2809, 2736, 2808, 2809, 2795, 2720, 2741, 2954, 2958, 949, 944, 933, 944, 2578, 2565, 2565, 2584, 2565, 23026, 24165, 27950, 22658, 21266, -30970, 21842, 21189, 21070, 22551, -28832, 23877, 24498, -29786, 20604, 22507, 22368, 23865, 19532, 24492, 26189, 26341, 21655, 21248, 24651, 21991, 21387, 22994, 22596, 22910, 21944, 21039, -29282, 27179, 26194, 25503, -28615, 23451, 21593, 20641, 22326, -30585, 28466, 20944, 22710, 23105, -29099, 21054, 21929, 26338, 21326, 22239, 22191, 26309, -28510, 32385, 20784, 22183, 22060, 23669, -29402, 23494, 1490, 1503, 932, 939, 935, 943, 3107, 3130, 3120, 717, 730, 722, 734, 717, 724, 716, 2267, 2265, 2254, 2259, 2261, 2260, 1190, 1188, 1203, 1190, 1207, 1188, 1203, 1858, 1874, 1876, 1887, 1876, 1180, 1165, 1182, 1165, 1153, 1183, 1853, 1841, 1840, 1834, 1851, 1830, 1834, 2869, 2850, 2868, 2866, 2859, 2867, 1264, 1271, 1257, 2475, 2470, 2466, 2471, 2470, 2481, 2480, 1626, 1618, 1603, 1631, 1624, 1619, 2091, 2089, 2104, 1501, 1474, 1502, 1497, 2292, 2297, 2290, 2287, 2551, 2523, 2522, 2496, 2513, 2522, 2496, 2457, 2528, 2509, 2500, 2513, 586, 603, 603, 583, 578, 584, 586, 607, 578, 580, 581, 516, 577, 600, 580, 581, 1475, 1493, 1476, 1437, 1491, 1503, 1503, 1499, 1497, 1493, 2672, 2671, 2658, 2659, 2665, 2601, 1253, 1265, 1248, 1261, 1259, 1195, 2222, 2227, 2214, 2212, 2230, 
    2225, 2223, 2457, 2460, 2446, 2453, 2518, 2437, 2448, 2449, 22920, 24095, -32338, 26139, 27234, 28591, -25591, 22443, 22633, 993, 1005, 1004, 1009, 1015, 1007, 999, 893, 890, 879, 890, 891, 893, 410, 397, 411, 408, 391, 390, 411, 397, 439, 413, 410, 388, 599, 603, 602, 576, 605, 602, 577, 593, 22296, 20623, -28866, 26763, 24944, 26652, 24873, 24961, 22927, 24088, -32343, 26140, -25496, 25067, -30757, -25586, 2563, 2561, 2580, 2565, 2567, 2575, 2578, 2585, 2595, 2575, 2574, 2580, 2565, 2574, 2580, 490, 491, 506, 495, 487, 482, 461, 481, 480, 506, 491, 480, 506, 1071, 1064, 1066, 1058, 1028, 1064, 1065, 1075, 1058, 1065, 1075, 2267, 2268, 2270, 2262, 2277, 2266, 2263, 2262, 2268, 2288, 2268, 2269, 2247, 2262, 2269, 2247, 2889, 2901, 2901, 2897, 22811, 24204, 28103, 22635, 24058, 23946, 28458, 28546, 2470, 2490, 2487, 2479, 2483, 2468, 2453, 2489, 2488, 2466, 2483, 2488, 2466, 2554, 2540, 2536, 2555, 2538, 2529, 2506, 2534, 2535, 2557, 2540, 2535, 2557, 3172, 3186, 3190, 3173, 3188, 3199, 3156, 3192, 3193, 3171, 3186, 3193, 3171};
    public volatile String a = "";

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArrayOptJSONArray = a("nav", new JSONObject()).optJSONArray("items");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONArrayOptJSONArray != null) {
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null) {
                    jSONArray = jSONArrayOptJSONArray;
                } else {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    String strM459 = "name";
                    arrayList.add(new com.github.catvod.spider.merge.p001b.b(strOptString, jSONObjectOptJSONObject.optString(strM459), null));
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("filters");
                    if (z && jSONArrayOptJSONArray2 != null) {
                        int i2 = 0;
                        while (i2 < jSONArrayOptJSONArray2.length()) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject2 == null) {
                                jSONArray2 = jSONArrayOptJSONArray;
                            } else {
                                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("value");
                                ArrayList arrayList3 = new ArrayList();
                                if (jSONArrayOptJSONArray3 != null) {
                                    int i3 = 0;
                                    while (i3 < jSONArrayOptJSONArray3.length()) {
                                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray3.optJSONObject(i3);
                                        if (jSONObjectOptJSONObject3 != null) {
                                            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(jSONObjectOptJSONObject3.optString("n"), jSONObjectOptJSONObject3.optString("v")));
                                        }
                                        i3++;
                                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                    }
                                }
                                jSONArray2 = jSONArrayOptJSONArray;
                                if (!arrayList3.isEmpty()) {
                                    arrayList2.add(new com.github.catvod.spider.merge.p001b.d(jSONObjectOptJSONObject2.optString("key"), jSONObjectOptJSONObject2.optString(strM459), arrayList3));
                                }
                            }
                            i2++;
                            jSONArrayOptJSONArray = jSONArray2;
                        }
                    }
                    jSONArray = jSONArrayOptJSONArray;
                    if (!arrayList2.isEmpty()) {
                        linkedHashMap.put(strOptString, arrayList2);
                    }
                }
                i++;
                jSONArrayOptJSONArray = jSONArray;
            }
        }
        return com.github.catvod.spider.merge.p001b.g.v(arrayList, linkedHashMap);
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        return com.github.catvod.spider.merge.p001b.g.y(e(a("home", new JSONObject()).optJSONArray("list")));
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
        String strM33 = "format";
        try {
            JSONObject jSONObjectA = a("resolve", new JSONObject().put("token", str2));
            String strOptString = jSONObjectA.optString("url");
            if (TextUtils.isEmpty(strOptString)) {
                com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.C("");
                gVar.q(0);
                gVar.l("发呆播放地址为空");
                return gVar.r();
            }
            HashMap map = new HashMap();
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("header");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObjectOptJSONObject.optString(next));
                }
            }
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C(strOptString);
            gVar2.q(jSONObjectA.optInt("parse", 0));
            gVar2.h(map);
            if (!TextUtils.isEmpty(jSONObjectA.optString(strM33))) {
                gVar2.f(jSONObjectA.optString(strM33));
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
            gVar3.l("发呆解析失败，请重开详情或更换线路");
            return gVar3.r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0229  */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        JSONArray jSONArray;
        if (list == null || list.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        JSONObject jSONObject = new JSONObject();
        String str = list.get(0);
        String strM186 = "id";
        JSONObject jSONObjectA = a("detail", jSONObject.put(strM186, str));
        JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject("vod");
        if (jSONObjectOptJSONObject == null) {
            return com.github.catvod.spider.merge.p001b.g.d("发呆详情为空");
        }
        k kVar = new k();
        kVar.n(jSONObjectOptJSONObject.optString(strM186, list.get(0)));
        String strM116 = "name";
        kVar.o(jSONObjectOptJSONObject.optString(strM116));
        kVar.p(jSONObjectOptJSONObject.optString("pic"));
        kVar.s(jSONObjectOptJSONObject.optString("remarks"));
        kVar.u(jSONObjectOptJSONObject.optString("year"));
        kVar.k(jSONObjectOptJSONObject.optString("area"));
        kVar.j(jSONObjectOptJSONObject.optString("actor"));
        kVar.m(jSONObjectOptJSONObject.optString("director"));
        kVar.l(jSONObjectOptJSONObject.optString("content"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectA.optJSONArray("lines");
        if (jSONArrayOptJSONArray != null) {
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 == null) {
                    jSONArray = jSONArrayOptJSONArray;
                } else {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("episodes");
                    ArrayList arrayList3 = new ArrayList();
                    String strM187 = "＃";
                    String strM402 = "＄";
                    String strM314 = "#";
                    String strM65 = "$";
                    if (jSONArrayOptJSONArray2 != null) {
                        int i2 = 0;
                        while (i2 < jSONArrayOptJSONArray2.length()) {
                            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            JSONArray jSONArray2 = jSONArrayOptJSONArray;
                            if (jSONObjectOptJSONObject3 != null) {
                                String strM42 = "token";
                                if (!TextUtils.isEmpty(jSONObjectOptJSONObject3.optString(strM42))) {
                                    arrayList3.add(jSONObjectOptJSONObject3.optString(strM116).replace(strM65, strM402).replace(strM314, strM187) + strM65 + jSONObjectOptJSONObject3.optString(strM42));
                                }
                            }
                            i2++;
                            jSONArrayOptJSONArray = jSONArray2;
                            jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                        }
                    }
                    jSONArray = jSONArrayOptJSONArray;
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(jSONObjectOptJSONObject2.optString(strM116).replace(strM65, strM402).replace(strM314, strM187));
                        arrayList2.add(TextUtils.join(strM314, arrayList3));
                    }
                }
                i++;
                jSONArrayOptJSONArray = jSONArray;
            }
        }
        if (arrayList2.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d("发呆暂无可用选集");
        }
        String strM499 = "$$$";
        kVar.q(TextUtils.join(strM499, arrayList));
        kVar.r(TextUtils.join(strM499, arrayList2));
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
            String[] strArr = {"class", "area", "year", "sort"};
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                if (map.containsKey(str3)) {
                    jSONObjectPut2.put(str3, map.get(str3));
                }
            }
        }
        return b(a("category", jSONObjectPut2));
    }

    public static String b(JSONObject jSONObject) {
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.F(e(jSONObject.optJSONArray("list")));
        gVar.o(jSONObject.optInt("page", 1), jSONObject.optInt("pagecount", 1), jSONObject.optInt("limit", 24), jSONObject.optInt("total", 0));
        return gVar.r();
    }

    public static JSONObject c(long j, String str, JSONObject jSONObject) throws IOException {
        if (TextUtils.isEmpty(str)) {
            throw new IOException("发呆服务地址未配置");
        }
        String string = jSONObject.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM301 = "N1.ZQLvcYvyKgq421AOqEK6XandUvix3XEg+uA9heHfNXqLxBjjWtGq5v5l7Bs3thHDWulKGYscwMRUITLMJ0MRU/TM6eMut87hDJXmmSdoang=";
        String strM285 = "N1.jWX7KpLJeyabmxur3CogrN4Mz85fRRIOnq/XILrVvvjGeGIBj2sqj0gQHOCfCQExXqBAjpx/BkaGeu9BOv5ZaSinlY7qK92VdIPdVEn0mDEFVWVG+c/qQ6tcE3hn+TwLCaMzqEH+TqGM8Qx2csP+ZQ==";
        String strM390 = "N1.QrjWR2UJCstA+MpJrl75+M27ehG28mJddCWmV4M381eR3J7OlQGuwdH5oAlZXj8MEqQesDio1S/QFz3EM4sv1vuYccFUFjuLkESAncUNY20=";
        String strM416 = "N1.rPCUeVT9higSXfiVeMrRJ0rbreCtnkFNKQCk/n84S2EC02NVtobo0hFruSQKiaXhEdapXY6QP/w7RhBV9kChBazGGgiPGptd4FC1y/THUTQ=";
        byte[] bArrT = FishCrypto.t(strM390, strM416, strM301, strM285, bytes);
        if (bArrT == null) {
            throw new IOException("发呆请求加密失败");
        }
        JSONObject jSONObject2 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM408 = "moyufucking";
        Request requestBuild = com.github.catvod.spider.merge.D.b.u(str).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jSONObject2.put(strM408, strEncodeToString).toString())).build();
        long jElapsedRealtime = j - SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= 0) {
            throw new IOException("发呆请求总时限已到");
        }
        Response responseK = X1.K(requestBuild, Math.min(jElapsedRealtime, 20000L));
        try {
            if (!responseK.isSuccessful() || responseK.body() == null) {
                throw new IOException("发呆服务响应异常");
            }
            JSONObject jSONObject3 = new JSONObject(new String(d(responseK.body().byteStream()), charset));
            if (jSONObject3.length() != 1 || !jSONObject3.has(strM408)) {
                throw new IOException("发呆响应信封无效");
            }
            byte[] bArrS = FishCrypto.s(strM390, strM416, Base64.decode(jSONObject3.getString(strM408), 0));
            if (bArrS == null) {
                throw new IOException("发呆响应解密失败");
            }
            JSONObject jSONObject4 = new JSONObject(new String(bArrS, charset));
            if (!jSONObject4.optBoolean("ok")) {
                throw new IOException(jSONObject4.optString("error", "发呆服务失败"));
            }
            JSONObject jSONObject5 = jSONObject4.getJSONObject("data");
            responseK.close();
            return jSONObject5;
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

    public static byte[] d(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            if (byteArrayOutputStream.size() + i > 8388608) {
                throw new IOException("发呆响应过大");
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static ArrayList e(JSONArray jSONArray) {
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

    /* JADX WARN: Code duplicated, block: B:77:0x035a A[LOOP:0: B:3:0x001a->B:77:0x035a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0359 A[SYNTHETIC] */
    public final JSONObject a(String str, JSONObject jSONObject) throws JSONException, IOException {
        int i;
        long j;
        String str2;
        byte[] bArrD;
        int i2;
        long j2;
        JSONObject jSONObjectC;
        JSONObject jSONObject2 = jSONObject;
        String str3 = this.a;
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 240000;
        String string = "";
        int i3 = 0;
        while (i3 < 64) {
            JSONObject jSONObject3 = new JSONObject();
            String strM219 = "action";
            JSONObject jSONObjectPut = jSONObject3.put(strM219, "prepare");
            String strM186 = "scene";
            JSONObject jSONObjectPut2 = jSONObjectPut.put(strM186, str);
            String strM10 = "params";
            JSONObject jSONObjectPut3 = jSONObjectPut2.put(strM10, jSONObject2);
            String strM379 = "context";
            JSONObject jSONObjectC2 = c(jElapsedRealtime, str3, jSONObjectPut3.put(strM379, string));
            String strM322 = "result";
            if (jSONObjectC2.has(strM322)) {
                return jSONObjectC2.getJSONObject(strM322);
            }
            String string2 = jSONObjectC2.getString(strM379);
            Request.Builder builder = new Request.Builder();
            String strM558 = "url";
            Request.Builder builderUrl = builder.url(jSONObjectC2.getString(strM558));
            String strM323 = "headers";
            int i4 = i3;
            JSONObject jSONObjectOptJSONObject = jSONObjectC2.optJSONObject(strM323);
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String str4 = str3;
                    String next = itKeys.next();
                    builderUrl.header(next, jSONObjectOptJSONObject.getString(next));
                    strM323 = strM323;
                    str3 = str4;
                }
            }
            String str5 = str3;
            String str6 = strM323;
            String strM445 = "method";
            String strM83 = "GET";
            String strOptString = jSONObjectC2.optString(strM445, strM83);
            boolean zEquals = "POST".equals(strOptString);
            String strM355 = "body";
            String strM3710 = "Content-Type";
            if (zEquals) {
                String strM169 = "application/json";
                String strOptString2 = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optString(strM3710, strM169);
                if (strOptString2 != null) {
                    strM169 = strOptString2;
                }
                i = 0;
                builderUrl.post(RequestBody.create(MediaType.parse(strM169), Base64.decode(jSONObjectC2.optString(strM355, ""), 0)));
            } else {
                i = 0;
                if (!strM83.equals(strOptString)) {
                    throw new IOException("发呆请求方法无效");
                }
            }
            byte[] bArr = new byte[i];
            JSONObject jSONObject4 = new JSONObject();
            String string3 = jSONObjectC2.getString(strM558);
            try {
                Request requestBuild = builderUrl.build();
                str2 = strM355;
                long jElapsedRealtime2 = jElapsedRealtime - SystemClock.elapsedRealtime();
                j = jElapsedRealtime;
                if (jElapsedRealtime2 <= 0) {
                    throw new IOException("发呆请求总时限已到");
                }
                try {
                    Response responseK = X1.K(requestBuild, Math.min(jElapsedRealtime2, 20000L));
                    try {
                        int iCode = responseK.code();
                        string3 = responseK.request().url().toString();
                        for (String str7 : responseK.headers().names()) {
                            jSONObject4.put(str7, "set-cookie".equalsIgnoreCase(str7) ? new JSONArray((Collection) responseK.headers(str7)) : responseK.header(str7));
                        }
                        String lowerCase = responseK.header(strM3710, "").toLowerCase(Locale.ROOT);
                        bArrD = (responseK.body() == null || (lowerCase.startsWith("video/") || lowerCase.startsWith("audio/") || lowerCase.contains("mpegurl") || lowerCase.contains("dash+xml"))) ? bArr : d(responseK.body().byteStream());
                        responseK.close();
                        i2 = iCode;
                    } catch (Throwable th) {
                        if (responseK == null) {
                            throw th;
                        }
                        try {
                            responseK.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                        JSONObject jSONObjectPut4 = new JSONObject().put(strM219, "consume").put(strM186, str).put(strM10, jSONObject).put(strM379, string2).put(str2, Base64.encodeToString(bArrD, 2)).put("status", i2).put(str6, jSONObject4).put("response_url", string3);
                        j2 = j;
                        jSONObjectC = c(j2, str5, jSONObjectPut4);
                        if (!jSONObjectC.optBoolean("continue")) {
                            return jSONObjectC;
                        }
                        string = jSONObjectC.getString(strM379);
                        i3 = i4 + 1;
                        str3 = str5;
                        jSONObject2 = jSONObject;
                        jElapsedRealtime = j2;
                    }
                } catch (IOException unused) {
                    bArrD = new byte[0];
                    i2 = 0;
                }
                JSONObject jSONObjectPut5 = new JSONObject().put(strM219, "consume").put(strM186, str).put(strM10, jSONObject).put(strM379, string2).put(str2, Base64.encodeToString(bArrD, 2)).put("status", i2).put(str6, jSONObject4).put("response_url", string3);
                j2 = j;
                jSONObjectC = c(j2, str5, jSONObjectPut5);
                if (!jSONObjectC.optBoolean("continue")) {
                    return jSONObjectC;
                }
                string = jSONObjectC.getString(strM379);
                i3 = i4 + 1;
                str3 = str5;
                jSONObject2 = jSONObject;
                jElapsedRealtime = j2;
            } catch (IOException unused2) {
                j = jElapsedRealtime;
                str2 = strM355;
            }
        }
        throw new IOException("发呆请求阶段超限");
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
        this.a = "";
        String strTrim = str != null ? str.trim() : "";
        if (!strTrim.startsWith("http")) {
            strTrim = FishCrypto.g(strTrim);
        }
        if (HttpUrl.parse(strTrim.trim()) == null) {
            throw new IOException("发呆服务地址无效");
        }
        this.a = strTrim.trim();
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

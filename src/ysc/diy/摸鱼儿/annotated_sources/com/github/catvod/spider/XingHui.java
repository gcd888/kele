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
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
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
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
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
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
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
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class XingHui extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f115short = {1831, 2161, 2174, 2153, 1303, 1290, 1307, 1299, 1293, 2410, 2407, 2643, 2652, 2640, 2648, 2309, 2314, 2319, 2327, 2310, 2321, 2320, 24758, 25094, 1931, 1986, 2015, 2011, 2003, 31416, -24643, 2664, 2621, 2620, 2593, 2598, -26446, 20588, 599, 537, 521, 517, 536, 527, 594, 591, 601, 600, 591, 27018, 21655, 1673, 1670, 1675, 1689, 1689, 30069, 24197, 878, 893, 874, 878, 24294, 23276, 1144, 1141, 1146, 1139, -29671, -29196, 1763, 1791, 1787, 1768, 22273, 18312, 1620, 1619, 1617, 1625, 2100, 2097, 2091, 2092, 1055, 1038, 1043, 1055, 3139, 3154, 3156, 3158, 1586, 1572, 1568, 1587, 1570, 1577, 941, 950, 941, 952, 949, 1406, 1403, 1377, 1382, 2371, 2313, 1767, 1760, 1790, 1563, 1548, 1562, 1542, 1541, 1567, 1548, 26382, 26269, 21651, 21731, -30144, 25651, 23186, -29050, 1768, 1687, 1672, 1763, 1779, 1740, 1783, 1677, 1680, 1750, 1760, 1769, 1768, 1735, 1736, 1751, 1740, 1742, 1775, 1694, 1673, 1776, 1780, 1759, 1743, 1744, 1767, 1683, 1749, 1741, 1743, 1765, 1684, 1745, 1770, 1788, 1746, 1673, 1685, 1739, 1750, 1740, 1728, 1788, 1736, 1739, 1769, 1760, 1677, 1791, 1772, 1788, 1682, 1764, 1770, 1778, 1770, 1760, 1681, 1686, 1736, 1685, 1776, 1680, 1756, 1779, 1769, 1774, 1746, 1770, 1741, 1682, 1783, 1694, 1763, 1776, 1762, 1781, 1758, 1790, 1743, 1788, 1746, 1742, 1750, 1770, 1741, 1743, 1729, 1691, 1691, 1159, 1179, 1179, 1183, 1217, 1166, 1160, 1162, 1153, 1179, 1741, 1768, 1765, 1791, 1760, 1762, 1702, 1723, 1703, 1720, 1703, 1721, 1705, 1697, 1733, 1760, 1767, 1788, 1777, 1714, 1705, 1756, 1714, 1705, 1736, 1767, 1773, 1787, 1766, 1760, 1773, 1696, 2640, 2678, 2656, 2679, 2600, 2628, 2658, 2656, 2667, 2673, 2067, 2128, 2062, 2120, 2053, 2793, 2788, 3321, 3320, 3305, 3324, 3316, 3313, 1416, 1425, 1434, 2323, 2332, 2320, 2328, 1864, 1873, 1883, 1169, 1158, 1166, 1154, 1169, 1160, 1168, 3262, 3234, 3238, 3253, 577, 594, 581, 577, 905, 907, 924, 903, 922, 1806, 1795, 1816, 1807, 1801, 1822, 1797, 1816, 2817, 2829, 2828, 2838, 2823, 2828, 2838, 1259, 1271, 1261, 1258, 1275, 1277, 1259, 2585, 2581, 2590, 2591, 596, 576, 605, 607, 3031, 3010, 3035, 3009, 3037, 3030, 3031, 3009, 1208, 720, 727, 713, 1220, 637, 28372, 28487, 3290, 3275, 3288, 3289, 3279, 2781, 2711, 2841, 2887, 25798, 31745, 24630, 25428, 25113, 25482, 25540, 26074, 335, 335, 335, 1318, 1339, 1334, 499, 482, 484, 486, 918, 907, 925, 924, 907, 3006, 2979, 2983, 2991, 2765, 2754, 2767, 2781, 2781, 716, 735, 712, 716, 1580, 1569, 1582, 1575, 2580, 2568, 2572, 2591, 2124, 2126, 2139, 2122, 2120, 2112, 2141, 2134, 2954, 2961, 2954, 2975, 2962, 781, 776, 786, 789, 714, 727, 705, 704, 727, 22320, -26960, 3282, 3295, 2493, 2482, 2494, 2486, 549, 572, 566, 653, 666, 658, 670, 653, 660, 652, 2628, 316, 318, 297, 316, 301, 318, 297, 1506, 1509, 1531, 529, 540, 536, 541, 540, 523, 522, 1284, 1288, 1289, 1300, 1298, 1290, 1282, 1062, 1082, 1082, 1086, 1102, 279, 277, 256, 273, 275, 283, 262, 269, 311, 283, 282, 256, 273, 282, 256, 1642, 1643, 1658, 1647, 1639, 1634, 1613, 1633, 1632, 1658, 1643, 1632, 1658, 2939, 2937, 2926, 2931, 2933, 2932, 3306, 3322, 3324, 3319, 3324, 466, 451, 464, 451, 463, 465, 2338, 2351, 2340, 2361, 1054, 1052, 1035, 1054, 1039, 1052, 1035, 1571, 1599, 1599, 1595, 1637, 1578, 1580, 1582, 1573, 1599, 1283, 1318, 1323, 1329, 1326, 1324, 1384, 1397, 1385, 1398, 1385, 1399, 1383, 1391, 1291, 1326, 1321, 1330, 1343, 1404, 1383, 1298, 1404, 1383, 1286, 1321, 1315, 1333, 1320, 1326, 1315, 1390, 1235, 1223, 521, 518, 515, 527, 516, 542, 565, 542, 515, 519, 527, 2202, 2277, 2298, 2198, 2204, 2238, 2198, 2208, 2237, 2285, 2274, 2221, 2273, 2222, 2279, 2303, 2279, 2192, 2180, 2178, 2224, 2238, 2198, 2229, 2200, 2285, 2199, 2199, 2235, 2211, 2237, 2238, 2221, 2230, 2201, 2208, 2177, 2230, 2233, 2177, 2209, 2211, 2202, 2224, 2210, 2225, 2182, 2214, 2181, 2210, 2233, 2234, 2178, 2212, 2274, 2203, 2177, 2194, 2182, 2213, 2238, 2201, 2176, 2206, 2212, 2176, 2273, 2224, 2181, 2200, 2284, 2181, 2194, 2198, 2188, 2224, 2204, 2202, 2190, 2232, 2192, 2199, 2211, 2237, 2230, 2275, 2299, 2201, 2213, 2181, 2299, 2200, 2220, 2192, 2226, 2221, 2211, 2278, 2199, 2189, 2285, 2221, 2179, 2198, 2276, 2190, 2208, 2195, 2225, 2272, 2281, 1772, 1683, 1676, 1764, 1737, 1760, 1754, 1728, 1768, 1684, 1764, 1738, 1686, 1686, 1745, 1752, 1754, 1779, 1734, 1728, 1783, 1787, 1778, 1685, 1749, 1752, 1744, 1748, 1774, 1734, 1747, 1774, 1787, 1768, 1684, 1766, 1732, 1742, 1779, 1765, 1743, 1691, 1751, 1732, 1766, 1680, 1754, 1769, 1784, 1682, 1764, 1755, 1761, 1680, 1737, 1685, 1734, 1683, 1774, 1729, 1739, 1749, 1775, 1734, 1774, 1767, 1771, 1751, 1787, 1744, 1683, 1746, 1775, 1787, 1683, 1754, 1754, 1765, 1729, 1782, 1774, 1745, 1761, 1739, 1773, 1761, 1734, 1673, 1770, 1686, 1767, 1781, 1748, 1742, 1680, 1745, 1778, 1751, 1771, 1740, 1773, 1731, 1750, 1772, 1742, 1731, 1751, 1736, 1685, 1686, 1695, 779, 884, 875, 882, 785, 808, 818, 790, 771, 828, 823, 785, 785, 874, 814, 770, 778, 783, 818, 882, 811, 808, 779, 817, 790, 821, 884, 878, 882, 886, 823, 887, 878, 800, 788, 809, 771, 812, 885, 784, 823, 817, 814, 880, 776, 783, 808, 810, 884, 797, 811, 828, 806, 814, 788, 880, 799, 782, 779, 808, 819, 880, 880, 784, 791, 768, 814, 883, 788, 887, 820, 828, 800, 813, 808, 772, 775, 783, 814, 878, 808, 883, 800, 814, 800, 772, 810, 821, 772, 888, 888, 2670, 2577, 2574, 2678, 2638, 2666, 2631, 2674, 2673, 2678, 2571, 2661, 2677, 2585, 2670, 2579, 2625, 2636, 2633, 2578, 2631, 2676, 2673, 2578, 2649, 2662, 2571, 2628, 2681, 2627, 2667, 2680, 2650, 2629, 2658, 2585, 2636, 2679, 2577, 2583, 2627, 2680, 2635, 2581, 2664, 2670, 2630, 2668, 2676, 2661, 2664, 2634, 2675, 2659, 2575, 2582, 2639, 2637, 2643, 2581, 2578, 2664, 2630, 2662, 2644, 2662, 2579, 2679, 2575, 2581, 2584, 2676, 2666, 2682, 2636, 2627, 2670, 2647, 2585, 2663, 2578, 2641, 2666, 2657, 2645, 2650, 2626, 2633, 2670, 2575, 2668, 2665, 2646, 2636, 
    2643, 2679, 2664, 2629, 2671, 2673, 2583, 2661, 2674, 2579, 2584, 2678, 2571, 2646, 2647, 2581, 2661, 2676, 2585, 2580, 2636, 2629, 2645, 2674, 2645, 2644, 2631, 2648, 2675, 2575, 2584, 2648, 2663, 2677, 2661, 2662, 2642, 2674, 2680, 2666, 2627, 2584, 2677, 2638, 2629, 2631, 2657, 2576, 2585, 2635, 2579, 2662, 2625, 2639, 2666, 2659, 2640, 2577, 2657, 2589, 2589, 2746, 2744, 2734, 2722, 2737, 2722, 2740, 2748, 2750, 2745, 2736, 948, 944, 2585, 2588, 2569, 2588, 28018, 30133, 27744, 22988, 28189, 26627, 17751, 28951, 2276, 2291, 2291, 2286, 2291, 26449, 32662, 26179, 21487, 22655, -29589, 25432, 31647, 20874, 23507, -29532, 24193, 23670, -30622, 25040, 30999, 21250, 22875, 23561, 25160, 18933, 32181, 27929, 30174, 24523, 21906, 17639, 22279, 28390, 28238, 25821, 31770, 26063, 20579, 26402, 22031, 23638, 25035, 30988, -29661, 27542, 21876, 23570, 24293, -29967, 26508, 32587, 26270, 21298, 22179, 22227, 26297, -28450, 32509, 2810, 2813, 2815, 2807, 2769, 2813, 2812, 2790, 2807, 2812, 2790, 2060, 2059, 2057, 2049, 2098, 2061, 2048, 2049, 2059, 2087, 2059, 2058, 2064, 2049, 2058, 2064, 1721, 1701, 1701, 1697, 2869, 461, 508, 507, 498, 477, 480, 508, 437, 496, 493, 481, 437, 497, 496, 502, 487, 492, 485, 481, 437, 499, 500, 508, 505, 496, 497, 2066, 2051, 2074, 1416, 1423, 1425, 2609, 2560, 2567, 2574, 2593, 2588, 2560, 2633, 2572, 2567, 2570, 2587, 2576, 2585, 2589, 2572, 2573, 2633, 2572, 2577, 2589, 2633, 2587, 2572, 2584, 2588, 2560, 2587, 2572, 2586, 2633, 2568, 2633, 2571, 2587, 2560, 2573, 2574, 2572, 2633, 2620, 2619, 2597, 2712, 1221, 1241, 1236, 1228, 1232, 1223, 1270, 1242, 1243, 1217, 1232, 1243, 1217, 2720, 2742, 2738, 2721, 2736, 2747, 2704, 2748, 2749, 2727, 2742, 2749, 2727, 2641, 2631, 2627, 2640, 2625, 2634, 2657, 2637, 2636, 2646, 2631, 2636, 2646};
    public String a = "";

    final class Packed {
        public final boolean a;
        public final String b;

        public Packed(String str, boolean z) {
            this.a = z;
            this.b = str;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0101.m402(f115short, 0, 1, 1814));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws JSONException, IOException {
        JSONObject jSONObjectB = b(C0119.m473(f115short, 1, 3, 2079), new JSONObject());
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray(C0028.m108(f115short, 4, 5, 1406));
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString(C0045.m177(f115short, 9, 2, 2307));
                    arrayList.add(new com.github.catvod.spider.merge.p001b.b(strOptString, jSONObjectOptJSONObject.optString(C0096.m382(f115short, 11, 4, 2621)), null));
                    if (z) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(C0028.m108(f115short, 15, 7, 2403));
                        ArrayList arrayList2 = new ArrayList();
                        a(arrayList2, C0081.m322(f115short, 44, 5, 573), C0101.m402(f115short, 49, 2, 2584), new String[]{C0137.m545(f115short, 22, 7, 1974), C0128.m511(f115short, 29, 7, 2645), C0076.m301(f115short, 36, 8, 618)});
                        if (jSONObjectOptJSONObject2 != null) {
                            String strM177 = C0045.m177(f115short, 51, 5, 1770);
                            a(arrayList2, strM177, C0133.m529(f115short, 56, 2, 2318), g(jSONObjectOptJSONObject2.optString(strM177)));
                            String strM416 = C0105.m416(f115short, 58, 4, 783);
                            a(arrayList2, strM416, C0047.m186(f115short, 62, 2, 2518), g(jSONObjectOptJSONObject2.optString(strM416)));
                            String strM325 = C0082.m325(f115short, 64, 4, 1044);
                            a(arrayList2, strM325, C0008.m31(f115short, 68, 2, 2036), g(jSONObjectOptJSONObject2.optString(strM325)));
                            String strM326 = C0082.m325(f115short, 70, 4, 1690);
                            a(arrayList2, strM326, C0116.m463(f115short, 74, 2, 2421), g(jSONObjectOptJSONObject2.optString(strM326)));
                        }
                        linkedHashMap.put(strOptString, arrayList2);
                    }
                }
            }
        }
        return com.github.catvod.spider.merge.p001b.g.v(arrayList, linkedHashMap);
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        return com.github.catvod.spider.merge.p001b.g.y(e(b(C0089.m355(f115short, 76, 4, 1596), new JSONObject()).optJSONArray(C0008.m31(f115short, 80, 4, 2136))));
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) throws JSONException, IOException {
        int iC = c(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0093.m368(f115short, 84, 4, 1131), str);
        jSONObject.put(C0001.m1(f115short, 88, 4, 3123), iC);
        JSONObject jSONObjectB = b(C0056.m223(f115short, 92, 6, 1601), jSONObject);
        return d(iC, jSONObjectB.optLong(C0106.m422(f115short, 98, 5, 985)), e(jSONObjectB.optJSONArray(C0119.m473(f115short, 103, 4, 1298))));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws JSONException {
        Packed packed;
        if (str2 == null || str2.length() <= 2 || str2.charAt(1) != ':') {
            packed = new Packed(str2, false);
        } else {
            try {
                packed = new Packed(new String(Base64.decode(str2.substring(2), 10), StandardCharsets.UTF_8), str2.startsWith(C0074.m292(f115short, 107, 2, 2355)));
            } catch (Exception unused) {
                packed = new Packed(str2, false);
            }
        }
        boolean z = packed.a;
        String strOptString = packed.b;
        if (z) {
            JSONObject jSONObject = new JSONObject();
            String strM116 = C0030.m116(f115short, 109, 3, 1682);
            strOptString = b(C0049.m193(f115short, 112, 7, 1641), jSONObject.put(strM116, strOptString)).optString(strM116);
            if (TextUtils.isEmpty(strOptString)) {
                return com.github.catvod.spider.merge.p001b.g.d(C0017.m65(f115short, 119, 8, 931));
            }
        }
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(FishCrypto.w(C0014.m54(f115short, 127, 91, 1702), strOptString));
        HashMap map = new HashMap();
        String property = System.getProperty(C0047.m186(f115short, 218, 10, 1263));
        if (TextUtils.isEmpty(property)) {
            property = C0112.m445(f115short, 228, 32, 1673);
        }
        map.put(C0098.m390(f115short, 260, 10, 2565), property);
        gVar.h(map);
        if (strOptString.contains(C0026.m102(f115short, 270, 5, 2109))) {
            gVar.k();
        }
        return gVar.r();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01f4  */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str;
        JSONArray jSONArray;
        String strK;
        XingHui xingHui = this;
        if (list == null || list.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        String str2 = list.get(0);
        JSONObject jSONObject = new JSONObject();
        String strM21 = C0006.m21(f115short, 275, 2, 2688);
        JSONObject jSONObjectB = xingHui.b(C0011.m42(f115short, 277, 6, 3229), jSONObject.put(strM21, str2));
        JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(C0137.m545(f115short, 283, 3, 1534));
        if (jSONObjectOptJSONObject == null) {
            return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
        }
        k kVar = new k();
        kVar.n(jSONObjectOptJSONObject.optString(strM21, str2));
        String strM499 = C0125.m499(f115short, 286, 4, 2429);
        kVar.o(jSONObjectOptJSONObject.optString(strM499));
        kVar.p(jSONObjectOptJSONObject.optString(C0018.m70(f115short, 290, 3, 1848)));
        kVar.s(jSONObjectOptJSONObject.optString(C0014.m54(f115short, 293, 7, 1251)));
        kVar.u(jSONObjectOptJSONObject.optString(C0011.m42(f115short, 300, 4, 3271)));
        kVar.k(jSONObjectOptJSONObject.optString(C0117.m467(f115short, 304, 4, 544)));
        kVar.j(jSONObjectOptJSONObject.optString(C0049.m193(f115short, 308, 5, 1000)));
        kVar.m(jSONObjectOptJSONObject.optString(C0125.m499(f115short, 313, 8, 1898)));
        kVar.l(jSONObjectOptJSONObject.optString(C0133.m529(f115short, 321, 7, 2914)));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray(C0139.m554(f115short, 328, 7, 1176));
        if (jSONArrayOptJSONArray != null) {
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 == null) {
                    str = str2;
                    jSONArray = jSONArrayOptJSONArray;
                } else {
                    JSONObject jSONObjectPut = new JSONObject().put(strM21, str2).put(C0098.m390(f115short, 339, 4, 562), jSONObjectOptJSONObject2.optString(C0085.m339(f115short, 335, 4, 2682)));
                    String strM567 = C0142.m567(f115short, 343, 8, 2994);
                    JSONArray jSONArrayOptJSONArray2 = xingHui.b(strM567, jSONObjectPut).optJSONArray(strM567);
                    ArrayList arrayList3 = new ArrayList();
                    String strM314 = C0079.m314(f115short, 351, 1, 1179);
                    if (jSONArrayOptJSONArray2 != null) {
                        int i2 = 0;
                        while (i2 < jSONArrayOptJSONArray2.length()) {
                            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject3 != null) {
                                String strM249 = C0063.m249(f115short, 352, 3, 677);
                                if (TextUtils.isEmpty(jSONObjectOptJSONObject3.optString(strM249))) {
                                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    String strOptString = jSONObjectOptJSONObject3.optString(strM499);
                                    String strM65 = C0017.m65(f115short, 355, 1, 1248);
                                    if (strOptString == null) {
                                        strK = "";
                                    } else {
                                        String strM54 = C0014.m54(f115short, 356, 1, 605);
                                        strK = com.github.catvod.spider.merge.D.b.k(strOptString, strM314, strM54, strM65, strM54);
                                    }
                                    if (TextUtils.isEmpty(strK)) {
                                        strK = C0115.m459(f115short, 357, 2, 2681);
                                    }
                                    sb.append(strK);
                                    sb.append(strM65);
                                    String strOptString2 = jSONObjectOptJSONObject3.optString(strM249);
                                    boolean zOptBoolean = jSONObjectOptJSONObject3.optBoolean(C0082.m325(f115short, 359, 5, 3242));
                                    String strEncodeToString = Base64.encodeToString(strOptString2.getBytes(StandardCharsets.UTF_8), 10);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(zOptBoolean ? C0097.m386(f115short, 364, 2, 2733) : C0096.m382(f115short, 366, 2, 2941));
                                    sb2.append(strEncodeToString);
                                    sb.append(sb2.toString());
                                    arrayList3.add(sb.toString());
                                }
                            } else {
                                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                            }
                            i2++;
                            str2 = str2;
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        }
                    }
                    str = str2;
                    jSONArray = jSONArrayOptJSONArray;
                    if (!arrayList3.isEmpty()) {
                        boolean zIsEmpty = arrayList.isEmpty();
                        String strM223 = C0056.m223(f115short, 368, 2, 729);
                        if (!zIsEmpty) {
                            strM223 = strM223 + (arrayList.size() + 1);
                        }
                        arrayList.add(strM223);
                        arrayList2.add(TextUtils.join(strM314, arrayList3));
                    }
                }
                i++;
                xingHui = this;
                str2 = str;
                jSONArrayOptJSONArray = jSONArray;
            }
        }
        if (arrayList2.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d(C0056.m223(f115short, 370, 6, 1716));
        }
        String strM486 = C0122.m486(f115short, 376, 3, 363);
        kVar.q(TextUtils.join(strM486, arrayList));
        kVar.r(TextUtils.join(strM486, arrayList2));
        AbstractC0280n1.p(kVar.c());
        AbstractC0280n1.q(kVar.e());
        FishCrypto.c(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException, IOException {
        int iC = c(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0079.m314(f115short, 379, 3, 1362), str);
        jSONObject.put(C0018.m70(f115short, 382, 4, 387), iC);
        String strM182 = C0046.m182(f115short, 386, 5, 1017);
        jSONObject.put(strM182, (map == null || TextUtils.isEmpty(map.get(strM182))) ? C0045.m177(f115short, 391, 4, 3018) : (String) map.get(strM182));
        String[] strArr = {C0114.m454(f115short, 395, 5, 2734), C0103.m408(f115short, 400, 4, 685), C0074.m292(f115short, 404, 4, 1600), C0117.m467(f115short, 408, 4, 2669)};
        for (int i = 0; i < 4; i++) {
            String str3 = strArr[i];
            String str4 = (map == null || TextUtils.isEmpty(map.get(str3))) ? "" : map.get(str3);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, str4);
            }
        }
        JSONObject jSONObjectB = b(C0133.m529(f115short, 412, 8, 2095), jSONObject);
        return d(iC, jSONObjectB.optLong(C0008.m31(f115short, 420, 5, 3070)), e(jSONObjectB.optJSONArray(C0047.m186(f115short, 425, 4, 865))));
    }

    public static void a(ArrayList arrayList, String str, String str2, String[] strArr) {
        if (strArr.length == 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!C0074.m292(f115short, 429, 5, 677).equals(str)) {
            arrayList2.add(new com.github.catvod.spider.merge.p001b.c(C0044.m175(f115short, 434, 2, 1624), ""));
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

    public static int c(String str) {
        try {
            return Math.max(1, Integer.parseInt(str));
        } catch (Exception unused) {
            return 1;
        }
    }

    public static String d(int i, long j, ArrayList arrayList) {
        int i2 = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
        int iMax = Math.max(1, (i2 + 19) / 20);
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayList);
        gVarC.o(i, iMax, 20, Math.max(i2, arrayList.size()));
        return gVarC.r();
    }

    public static ArrayList e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(new k(jSONObjectOptJSONObject.optString(C0053.m210(f115short, 436, 2, 3259)), jSONObjectOptJSONObject.optString(C0130.m516(f115short, 438, 4, 2515)), jSONObjectOptJSONObject.optString(C0135.m539(f115short, 442, 3, 597)), jSONObjectOptJSONObject.optString(C0095.m379(f115short, 445, 7, 767))));
            }
        }
        return arrayList;
    }

    public static String[] g(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.split(C0125.m499(f115short, 452, 1, 2664));
    }

    public final JSONObject b(String str, JSONObject jSONObject) throws JSONException, IOException {
        JSONObject jSONObjectF = f(C0076.m301(f115short, 453, 7, 332), str, null, jSONObject);
        Request.Builder builderUrl = new Request.Builder().url(jSONObjectF.getString(C0105.m416(f115short, 460, 3, 1431)));
        JSONObject jSONObjectOptJSONObject = jSONObjectF.optJSONObject(C0018.m70(f115short, 463, 7, 633));
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                builderUrl.header(next, jSONObjectOptJSONObject.optString(next));
            }
        }
        Response responseI = X1.I(builderUrl.build());
        try {
            if (responseI.isSuccessful()) {
                byte[] bArrBytes = responseI.body() == null ? new byte[0] : responseI.body().bytes();
                responseI.close();
                return f(C0120.m477(f115short, 470, 7, 1383), str, Base64.encodeToString(bArrBytes, 2), null);
            }
            throw new IOException(C0130.m516(f115short, 477, 5, 1134) + responseI.code());
        } catch (Throwable th) {
            if (responseI != null) {
                try {
                    responseI.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0104.m414(f115short, 482, 15, 372));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0074.m292(f115short, 497, 13, 1550));
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

    public final JSONObject f(String str, String str2, String str3, JSONObject jSONObject) throws JSONException, IOException {
        if (TextUtils.isEmpty(this.a)) {
            throw new IOException(C0128.m511(f115short, 1136, 9, 403));
        }
        JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v(C0014.m54(f115short, 510, 6, 2842), str, C0085.m339(f115short, 516, 5, 3225), str2);
        if (jSONObject != null) {
            jSONObjectV.put(C0106.m422(f115short, 521, 6, 418), jSONObject);
        }
        if (str3 != null) {
            jSONObjectV.put(C0118.m471(f115short, 527, 4, 2368), str3);
        }
        if (C0009.m33(f115short, 531, 7, 1134).equals(str)) {
            String property = System.getProperty(C0081.m322(f115short, 538, 10, 1611));
            if (TextUtils.isEmpty(property)) {
                property = C0011.m42(f115short, 548, 32, 1351);
            }
            jSONObjectV.put(C0063.m249(f115short, 580, 2, 1190), property);
            jSONObjectV.put(C0026.m102(f115short, 582, 11, 618), System.currentTimeMillis() / 1000);
        }
        String str4 = this.a;
        String string = jSONObjectV.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM558 = C0140.m558(f115short, 593, 111, 2260);
        String strM285 = C0072.m285(f115short, 704, 111, 1698);
        byte[] bArrT = FishCrypto.t(strM558, strM285, C0019.m75(f115short, 815, 91, 837), C0070.m277(f115short, 906, 155, 2592), bytes);
        if (bArrT == null) {
            throw new IOException(C0106.m422(f115short, 1128, 8, 2004));
        }
        JSONObject jSONObject2 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM210 = C0053.m210(f115short, 1061, 11, 2775);
        String strP = X1.P(str4, jSONObject2.put(strM210, strEncodeToString).toString());
        if (TextUtils.isEmpty(strP)) {
            throw new IOException(C0032.m126(f115short, 1121, 7, 706));
        }
        JSONObject jSONObject3 = new JSONObject(strP);
        if (jSONObject3.length() != 1) {
            throw new IOException(C0043.m169(f115short, 1113, 8, 2822));
        }
        String strOptString = jSONObject3.optString(strM210);
        if (TextUtils.isEmpty(strOptString)) {
            throw new IOException(C0137.m545(f115short, 1105, 8, 1999));
        }
        byte[] bArrS = FishCrypto.s(strM558, strM285, Base64.decode(strOptString, 0));
        if (bArrS == null) {
            throw new IOException(C0001.m1(f115short, 1097, 8, 1351));
        }
        JSONObject jSONObject4 = new JSONObject(new String(bArrS, charset));
        if (!jSONObject4.optBoolean(C0109.m432(f115short, 1072, 2, 987))) {
            throw new IOException(jSONObject4.optString(C0032.m126(f115short, 1086, 5, 2177), C0115.m459(f115short, 1091, 6, 334)));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject(C0114.m454(f115short, 1074, 4, 2685));
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        throw new IOException(C0046.m182(f115short, 1078, 8, 2925));
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0140.m558(f115short, 1145, 11, 2706));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0010.m36(f115short, 1156, 16, 2148));
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
        String strTrim = str == null ? "" : str.trim();
        boolean zIsEmpty = strTrim.isEmpty();
        String strM1 = C0001.m1(f115short, 1172, 4, 1745);
        String strM219 = C0055.m219(f115short, 1176, 1, 2894);
        boolean z = (zIsEmpty || strTrim.startsWith(strM219) || strTrim.startsWith(strM1)) ? false : true;
        if (z) {
            this.a = "";
        }
        try {
            String strG = FishCrypto.g(strTrim);
            if (z && TextUtils.isEmpty(strG)) {
                throw new IOException(C0056.m223(f115short, 1177, 26, 405));
            }
            if (!TextUtils.isEmpty(strG)) {
                strTrim = strG.trim();
            }
        } catch (Exception e) {
            if (z) {
                throw e;
            }
        }
        if (strTrim.startsWith(strM219)) {
            JSONObject jSONObject = new JSONObject(strTrim);
            strTrim = jSONObject.optString(C0107.m427(f115short, 1206, 3, 1533), jSONObject.optString(C0017.m65(f115short, 1203, 3, 2163), "")).trim();
        }
        if (z && HttpUrl.parse(strTrim) == null) {
            throw new IOException(C0120.m477(f115short, 1209, 43, 2665));
        }
        if (strTrim.startsWith(strM1)) {
            while (strTrim.endsWith(C0126.m503(f115short, 1252, 1, 2743))) {
                strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
            }
            this.a = strTrim;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0085.m339(f115short, 1253, 13, 1205));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0003.m10(f115short, 1266, 13, 2771));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0021.m83(f115short, 1279, 13, 2594));
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

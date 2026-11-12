package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0027;
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
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
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
import com.github.catvod.utils.C0143;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class TingYou extends Spider {
    public HttpUrl b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f96short = {434, 755, 741, 739, 756, 745, 751, 750, 889, 884, 865, 880, 870, 865, 1157, 1172, 1170, 1168, 3199, 2646, 2629, 2634, 2639, 2812, 2785, 2800, 2808, 2790, 1839, 1825, 1853, 1843, 1835, 1846, 1824, 872, 889, 895, 893, 2909, 2891, 2895, 2908, 2893, 2886, 2693, 2706, 2692, 2690, 2715, 2691, 2692, 2360, 2341, 2356, 2364, 2338, 392, 385, 403, 447, 397, 399, 402, 389, 2758, 2790, 3308, 3297, 3311, 3320, 3296, 3282, 3300, 3305, 2617, 2610, 2619, 2602, 2606, 2623, 2600, 2565, 2611, 2622, 2594, 3052, 3056, 3069, 3045, 3173, 3193, 3188, 3180, 3146, 3168, 3175, 3193, 23597, 23498, 27820, 27967, 24369, 24385, 28129, 27977, 24744, 24891, 22471, 24949, 25061, 24909, 1197, 1184, 1198, 1209, 1185, 1251, 3174, 3185, 3174, 3182, 3179, 3174, 3173, 3179, 3170, 16930, -31840, 20931, 16954, 27527, 931, 942, 1381, 1384, 1382, 1393, 1385, 1371, 1389, 1376, 1609, 1602, 1611, 1626, 1630, 1615, 1624, 1625, 1541, 1842, 1845, 1839, 1833, 1844, 1860, 1870, 1881, 1880, 1863, 1860, 1886, 1860, 482, 483, 501, 485, 500, 495, 502, 498, 495, 489, 488, 2301, 2284, 2277, 2277, 2284, 2299, 787, 775, 774, 794, 797, 768, 23601, 23510, 2139, 2128, 2121, 2114, 2123, 2138, 2142, 2127, 2136, 2137, 2230, 673, 678, 684, 685, 688, 1001, 1012, 1001, 1009, 1016, 30931, -27316, -2515, -836, 1039, 2314, 20780, 22219, 19219, -30063, 24688, 26222, 24800, 24648, 1110, 1531, 1529, 1516, 1533, 1535, 1527, 1514, 1505, 1423, 1410, 1419, 1438, 2810, 2790, 2811, 2813, 1723, 1719, 1717, 1704, 1706, 1725, 1712, 1725, 1718, 1707, 1713, 1710, 1725, 2166, 2151, 2145, 2147, 1180, 1177, 1164, 1177, 1636, 1657, 1640, 1632, 1662, 1047, 1030, 1024, 1026, 3152, 3137, 3143, 3141, 3155, 3247, 3242, 2403, 1684, 1686, 2398, 2398, 1637, 1645, 572, 575, 3176, 3181, 1369, 1375, 1968, 1972, 691, 1365, 1362, 1769, 1768, 2852, 2861, 22730, 25112, 21714, -29095, 19451, 30534, 23225, 23941, 23225, 26749, 19643, 24340, -30481, -30715, 25280, -28129, 19922, 32500, 20732, 21507, 23757, 27119, 27049, 26997, 26917, 22364, 23550, 22914, 28380, 22752, 22676, 23293, 17901, 32120, 20656, -32588, 23645, 24195, 17204, 24415, -29246, 28540, 20613, 28146, 21267, 19342, 30557, 31646, 24234, 17056, -31966, 3219, 3322, 3319, 3219, 26963, 27131, 3005, 3030, 3019, 3039, 3003, 3021, 478, 467, 2648, 2645, 2651, 2636, 2644, 2662, 2640, 2653, 22515, 20500, 22290, 23883, 31973, 24526, 20936, -29769, 22664, 26730, 3254, 3239, 3233, 3235, 964, 981, 979, 977, 983, 987, 961, 986, 960, 3150, 3147, 3151, 3147, 3158, 707, 728, 707, 726, 731, 863, 836, 861, 861, 2179, 2190, 2585, 2580, 2586, 2573, 2581, 2599, 2577, 2588, 2696, 2709, 2696, 2704, 2713, 1394, 1405, 1393, 1401, 2979, 2991, 2998, 2981, 2994, 2975, 2997, 2994, 2988, 1470, 1458, 1451, 1464, 1455, 1148, 1133, 1124, 1124, 1133, 1146, 686, 698, 699, 679, 672, 701, 1684, 1689, 1680, 1669, 1760, 1762, 1783, 23709, 23418, 22996, 23378, -30875, 24175, 2193, 2297, 2277, 2277, 2273, 2193, 916, 983, 978, 968, 975, 990, 981, 978, 981, 988, 490, 417, 508, 484, 428, 423, 445, 443, 432, 484, 429, 424, 445, 424, 302, 319, 294, 312, 315, 297, 319, 271, 264, 278, 2021, 2041, 2041, 2045, 2046, 1975, 1954, 1954, 2935, 2923, 2923, 2927, 2924, 3007, 3042, 3064, 3003, 3006, 2980, 2979, 2994, 3001, 3006, 3001, 2992, 3064, 2644, 2678, 2678, 2672, 2661, 2657, 882, 867, 867, 895, 890, 880, 882, 871, 890, 892, 893, 828, 889, 864, 892, 893, 2581, 2600, 2611, 2621, 2611, 2612, 2514, 2089, 2093, 2082, 1677, 1752, 1689, 1692, 1670, 1665, 1680, 1691, 1692, 1691, 1682, 1752, 1670, 1680, 1670, 1670, 1692, 1690, 1691, 771, 854, 791, 786, 776, 783, 798, 789, 786, 789, 796, 854, 783, 786, 790, 798, 769, 788, 789, 798, 2654, 2639, 2639, 2643, 2646, 2652, 2654, 2635, 2646, 2640, 2641, 2576, 2645, 2636, 2640, 2641, 2564, 2591, 2652, 2647, 2654, 2637, 2636, 2650, 2635, 2562, 2634, 2635, 2649, 2578, 2567, 21494, 21521, 25727, 21561, 2042, 2531, -31209, 24349, 2531, 2443, 2455, 2455, 2451, 2531, 23711, 23416, 2195, 2290, 2275, 2298, 2195, -26114, 30685, 27987, 28155, 24443, 22684, 23090, 22708, 29805, 22342, 2935, 2838, 2823, 2846, 2935, -26086, 29753, 763, 761, 748, 765, 767, 759, 746, 737, 731, 759, 758, 748, 765, 758, 748, 1110, 1111, 1094, 1107, 1115, 1118, 1137, 1117, 1116, 1094, 1111, 1116, 1094, 428, 394, 412, 395, 468, 440, 414, 412, 407, 397, 711, 741, 752, 739, 742, 742, 747, 677, 703, 676, 698, 682, 674, 733, 739, 740, 750, 741, 765, 761, 682, 708, 734, 682, 699, 698, 676, 698, 689, 682, 733, 739, 740, 700, 702, 689, 682, 754, 700, 702, 675, 682, 715, 762, 762, 742, 751, 733, 751, 744, 705, 739, 766, 677, 703, 697, 701, 676, 697, 700, 1677, 624, 583, 580, 583, 592, 583, 592, 2370, 2373, 2375, 2383, 2409, 2373, 2372, 2398, 2383, 2372, 2398, 1737, 1718, 1705, 1775, 1771, 1790, 1769, 1750, 1762, 1738, 1729, 1748, 1727, 1768, 1782, 1761, 1715, 1740, 1762, 1733, 1726, 1783, 1726, 1746, 1739, 1731, 1766, 1729, 1760, 1750, 1772, 1737, 1772, 1727, 1758, 1762, 1773, 1774, 1732, 1740, 1749, 1790, 1746, 1726, 1770, 1765, 1715, 1746, 1775, 1789, 1759, 1737, 1717, 1774, 1761, 1743, 1770, 1730, 1731, 1742, 1758, 1715, 1739, 1744, 1715, 1747, 1762, 1791, 1728, 1733, 1734, 1717, 1780, 1772, 1741, 1736, 1764, 1774, 1773, 1742, 1789, 1790, 1769, 1736, 1780, 1743, 1780, 1745, 1708, 1738, 1762, 1771, 1748, 1718, 1748, 1761, 1766, 1781, 1757, 1772, 1715, 1769, 1719, 1728, 1774, 1790, 1737, 1768, 1745, 1764, 1722, 520, 541, 541, 2944, 2972, 2972, 2968, 2971, 3026, 3015, 3015, 3003, 3007, 2992, 24533, 22578, 23196, 22554, 23753, 23737, 28185, 28337, 909, 913, 924, 900, 920, 911, 958, 914, 915, 905, 920, 915, 905, 1007, 1017, 1021, 1006, 1023, 1012, 991, 1011, 1010, 1000, 1017, 1010, 1000, 1502, 1480, 1484, 1503, 1486, 1477, 1518, 1474, 1475, 1497, 1480, 1475, 1497};
    public static final List d = Arrays.asList(C0010.m36(f96short, 279, 2, 1696), C0119.m473(f96short, 281, 2, 2415), C0070.m277(f96short, 283, 2, 1620), C0028.m108(f96short, 285, 2, 526), C0081.m322(f96short, 287, 2, 3161), C0045.m177(f96short, 289, 2, 1384), C0044.m175(f96short, 291, 2, 1921), C0090.m358(f96short, 293, 1, 650), C0098.m390(f96short, 294, 2, 1380), C0130.m516(f96short, 296, 2, 1752), C0032.m126(f96short, 298, 2, 2837), C0053.m210(f96short, 276, 2, 3228), C0079.m314(f96short, 278, 1, 2386));
    public static final List e = Arrays.asList(C0030.m116(f96short, 305, 4, 1218), C0137.m545(f96short, 309, 4, 795), C0096.m382(f96short, 313, 4, 517), C0046.m182(f96short, 317, 4, 2060), C0133.m529(f96short, 321, 4, 2495), C0140.m558(f96short, 325, 4, 3268), C0130.m516(f96short, 329, 4, 2918), C0103.m408(f96short, 333, 4, 2822), C0098.m390(f96short, 337, 4, 3218), C0003.m10(f96short, 341, 4, 2165), C0126.m503(f96short, 345, 4, 1332), C0055.m219(f96short, 300, 3, 1717), C0128.m511(f96short, 303, 2, 1437));
    public String a = "";
    public final String c = UUID.randomUUID().toString();

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0089.m355(f96short, 0, 1, 387));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            List list = d;
            if (i >= list.size()) {
                return com.github.catvod.spider.merge.p001b.g.z(arrayList, b(d(c(C0076.m301(f96short, 19, 4, 2596), null, C0095.m379(f96short, 1, 7, 640), C0043.m169(f96short, 8, 6, 789), C0133.m529(f96short, 14, 4, 1269), C0074.m292(f96short, 18, 1, 3150)), C0019.m75(f96short, 23, 5, 2709))));
            }
            arrayList.add(new com.github.catvod.spider.merge.p001b.b((String) list.get(i), (String) e.get(i), null));
            i++;
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int iMax = 1;
        try {
            if (!TextUtils.isEmpty(str2)) {
                iMax = Math.max(1, Integer.parseInt(str2));
            }
        } catch (NumberFormatException unused) {
        }
        JSONObject jSONObjectC = c(C0082.m325(f96short, 39, 6, 2862), new JSONObject().put(C0049.m193(f96short, 28, 7, 1860), str).put(C0120.m477(f96short, 35, 4, 792), iMax), new String[0]);
        return f(jSONObjectC, d(jSONObjectC, C0116.m463(f96short, 45, 7, 2807), C0135.m539(f96short, 52, 5, 2385)), iMax, jSONObjectC.optBoolean(C0092.m365(f96short, 57, 8, 480)) ? iMax + 1 : iMax, 10);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws IOException {
        String[] strArrSplit = str2 == null ? new String[0] : str2.split(C0063.m249(f96short, 65, 2, 2714), -1);
        try {
            if (strArrSplit.length != 2) {
                throw new NumberFormatException();
            }
            String strA = a(strArrSplit[0]);
            int i = Integer.parseInt(strArrSplit[1]);
            if (i < 0) {
                throw new NumberFormatException();
            }
            HttpUrl httpUrl = HttpUrl.parse(c(C0104.m414(f96short, 86, 4, 2972), new JSONObject().put(C0114.m454(f96short, 67, 8, 3213), strA).put(C0017.m65(f96short, 75, 11, 2650), i), new String[0]).optString(C0125.m499(f96short, 90, 8, 3093)));
            if (httpUrl == null) {
                throw new IOException(C0116.m463(f96short, 98, 8, 2049));
            }
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(httpUrl.toString());
            gVar.h(e());
            return gVar.r();
        } catch (IllegalArgumentException unused) {
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C("");
            gVar2.l(C0143.m570(f96short, 106, 6, 1029));
            return gVar2.r();
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        int iOptInt;
        int i = 0;
        String strA = a(list.get(0));
        JSONObject jSONObjectC = c(com.github.catvod.spider.merge.D.b.B(C0090.m358(f96short, 112, 6, 1228), strA), null, new String[0]);
        if (!jSONObjectC.optBoolean(C0133.m529(f96short, 118, 9, 3079), true)) {
            return com.github.catvod.spider.merge.p001b.g.d(C0028.m108(f96short, 127, 5, 3121));
        }
        if (TextUtils.isEmpty(g(jSONObjectC, C0070.m277(f96short, 132, 2, 970), C0018.m70(f96short, 134, 8, 1284)))) {
            throw new IOException(C0055.m219(f96short, 216, 8, 1280));
        }
        JSONObject jSONObjectC2 = c(com.github.catvod.spider.merge.D.b.B(C0021.m83(f96short, 142, 9, 1578), strA), null, new String[0]);
        k kVarH = h(jSONObjectC);
        kVarH.n(strA);
        kVarH.l(g(jSONObjectC, C0049.m193(f96short, 156, 8, 1847), C0001.m1(f96short, 164, 11, 390), C0079.m314(f96short, 151, 5, 1883)));
        kVarH.j(g(jSONObjectC, C0140.m558(f96short, 175, 6, 2185)));
        kVarH.m(g(jSONObjectC, C0116.m463(f96short, 181, 6, 882)));
        kVarH.q(C0130.m516(f96short, 187, 4, 2077));
        JSONArray jSONArrayD = d(jSONObjectC2, C0070.m277(f96short, 191, 8, 2090));
        TreeMap treeMap = new TreeMap();
        while (true) {
            int length = jSONArrayD.length();
            String strM511 = C0128.m511(f96short, 199, 1, 2197);
            if (i >= length) {
                kVarH.r(TextUtils.join(strM511, treeMap.values()));
                FishCrypto.c(kVarH);
                return com.github.catvod.spider.merge.p001b.g.s(kVarH);
            }
            JSONObject jSONObjectOptJSONObject = jSONArrayD.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt(C0055.m219(f96short, 200, 5, 712), -1)) >= 0 && !treeMap.containsKey(Integer.valueOf(iOptInt))) {
                String strG = g(jSONObjectOptJSONObject, C0021.m83(f96short, 205, 5, 925));
                if (TextUtils.isEmpty(strG)) {
                    strG = com.github.catvod.spider.merge.D.b.h(C0056.m223(f96short, 210, 1, 1023), iOptInt, C0115.m459(f96short, 211, 1, 906));
                }
                Integer numValueOf = Integer.valueOf(iOptInt);
                StringBuilder sb = new StringBuilder();
                String strReplace = strG.replace(strM511, C0006.m21(f96short, 212, 1, 2350));
                String strM539 = C0135.m539(f96short, 213, 1, 952);
                String strM339 = C0085.m339(f96short, 214, 1, 1067);
                sb.append(strReplace.replace(strM339, strM539));
                sb.append(strM339);
                sb.append(strA);
                sb.append(C0098.m390(f96short, 215, 1, 2422));
                sb.append(iOptInt);
                treeMap.put(numValueOf, sb.toString());
            }
            i++;
        }
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int iMax = 1;
        try {
            if (!TextUtils.isEmpty(str2)) {
                iMax = Math.max(1, Integer.parseInt(str2));
            }
        } catch (NumberFormatException unused) {
        }
        boolean zEquals = C0109.m432(f96short, 224, 1, 1127).equals(str);
        String strM355 = C0089.m355(f96short, 225, 8, 1432);
        JSONObject jSONObjectC = c(strM355, null, zEquals ? strM355 : C0019.m75(f96short, 233, 4, 1531), a(str), C0001.m1(f96short, 237, 4, 2697), C0019.m75(f96short, 241, 13, 1752), C0076.m301(f96short, 254, 4, 2054), String.valueOf(iMax));
        return f(jSONObjectC, d(jSONObjectC, C0049.m193(f96short, 258, 4, 1272), C0139.m554(f96short, 262, 5, 1549)), jSONObjectC.optInt(C0003.m10(f96short, 267, 4, 1127), iMax), jSONObjectC.optInt(C0105.m416(f96short, 271, 5, 3104), iMax), 20);
    }

    public static String a(String str) {
        String strM499 = C0125.m499(f96short, 349, 8, 3251);
        if (str == null || !str.matches(C0082.m325(f96short, 357, 6, 3046))) {
            throw new IllegalArgumentException(strM499);
        }
        long j = Long.parseLong(str);
        if (j > 0) {
            return String.valueOf(j);
        }
        throw new IllegalArgumentException(strM499);
    }

    public static ArrayList b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(g(jSONObjectOptJSONObject, C0137.m545(f96short, 363, 2, 439), C0112.m445(f96short, 365, 8, 2617)))) {
                arrayList.add(h(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static JSONArray d(JSONObject jSONObject, String... strArr) throws IOException {
        for (String str : strArr) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray != null) {
                return jSONArrayOptJSONArray;
            }
        }
        throw new IOException(C0082.m325(f96short, 373, 10, 991));
    }

    public static String f(JSONObject jSONObject, JSONArray jSONArray, int i, int i2, int i3) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject(com.github.catvod.spider.merge.p001b.g.y(b(jSONArray))).put(C0009.m33(f96short, 383, 4, 3270), Math.max(1, i)).put(C0045.m177(f96short, 387, 9, 948), Math.max(Math.max(1, i), i2)).put(C0070.m277(f96short, 396, 5, 3106), i3);
        String strM1 = C0001.m1(f96short, 401, 5, 695);
        if (jSONObject.has(strM1)) {
            jSONObjectPut.put(strM1, Math.max(0L, jSONObject.optLong(strM1)));
        }
        return jSONObjectPut.toString();
    }

    public static String g(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            String strOptString = jSONObject.optString(str);
            if (!TextUtils.isEmpty(strOptString) && !C0118.m471(f96short, 406, 4, 817).equals(strOptString)) {
                return strOptString;
            }
        }
        return "";
    }

    public static k h(JSONObject jSONObject) {
        k kVar = new k();
        kVar.n(g(jSONObject, C0003.m10(f96short, 410, 2, 2282), C0142.m567(f96short, 412, 8, 2680)));
        kVar.o(g(jSONObject, C0021.m83(f96short, 420, 5, 2812), C0126.m503(f96short, 425, 4, 1308)));
        kVar.p(g(jSONObject, C0126.m503(f96short, 429, 9, 3008), C0059.m234(f96short, 438, 5, 1501)));
        String strM486 = C0122.m486(f96short, 443, 6, 1032);
        String strM186 = C0047.m186(f96short, 449, 6, 719);
        String strM70 = C0018.m70(f96short, 455, 4, 1760);
        kVar.s(g(jSONObject, strM486, strM186, strM70));
        kVar.i(g(jSONObject, strM70, C0125.m499(f96short, 459, 3, 1667)));
        return kVar;
    }

    public final JSONObject c(String str, JSONObject jSONObject, String... strArr) {
        HttpUrl httpUrl;
        String strM10 = C0003.m10(f96short, 462, 12, 2225);
        synchronized (this) {
            httpUrl = this.b;
            if (httpUrl == null) {
                Response responseI = X1.I(new Request.Builder().url(this.a + C0140.m558(f96short, 474, 10, 955)).headers(Headers.of(e())).build());
                try {
                    if (!responseI.isSuccessful() || responseI.body() == null) {
                        throw new IOException(strM10 + responseI.code());
                    }
                    com.github.catvod.spider.merge.f0.k kVarR = X1.L(responseI.body().string(), "").R(C0087.m346(f96short, 484, 14, 457));
                    if (kVarR == null) {
                        throw new IOException(C0139.m554(f96short, 661, 13, 2903));
                    }
                    JSONObject jSONObjectOptJSONObject = new JSONObject(kVarR.F()).optJSONObject(C0116.m463(f96short, 498, 3, 335));
                    HttpUrl httpUrl2 = jSONObjectOptJSONObject == null ? null : HttpUrl.parse(jSONObjectOptJSONObject.optString(C0059.m234(f96short, 501, 7, 346)));
                    if (httpUrl2 == null || !httpUrl2.username().isEmpty() || !httpUrl2.password().isEmpty() || httpUrl2.query() != null || httpUrl2.fragment() != null || (this.a.startsWith(C0109.m432(f96short, 508, 8, 1933)) && !C0027.m105(f96short, 516, 5, 2847).equals(httpUrl2.scheme()))) {
                        throw new IOException(C0122.m486(f96short, 650, 11, 2227));
                    }
                    this.b = httpUrl2;
                    responseI.close();
                    httpUrl = httpUrl2;
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
        }
        HttpUrl.Builder builderAddPathSegments = httpUrl.newBuilder().addPathSegments(C0003.m10(f96short, 521, 13, 3031) + str);
        for (int i = 0; i < strArr.length; i += 2) {
            builderAddPathSegments.addQueryParameter(strArr[i], strArr[i + 1]);
        }
        HashMap mapE = e();
        mapE.put(C0137.m545(f96short, 534, 6, 2581), C0087.m346(f96short, 540, 16, 787));
        mapE.put(C0117.m467(f96short, 556, 6, 2650), HttpUrl.parse(this.a).resolve(C0137.m545(f96short, 562, 1, 2557)).toString().replaceAll(C0008.m31(f96short, 563, 3, 2054), ""));
        mapE.put(C0095.m379(f96short, 566, 19, 1781), this.c);
        mapE.put(C0120.m477(f96short, 585, 20, 891), TimeZone.getDefault().getID());
        Request.Builder builderHeaders = new Request.Builder().url(builderAddPathSegments.build()).headers(Headers.of(mapE));
        if (jSONObject != null) {
            builderHeaders.post(RequestBody.create(MediaType.parse(C0093.m368(f96short, 605, 31, 2623)), jSONObject.toString()));
        }
        Response responseI2 = X1.I(builderHeaders.build());
        try {
            if (responseI2.isSuccessful() && responseI2.body() != null) {
                JSONObject jSONObject2 = new JSONObject(responseI2.body().string());
                responseI2.close();
                return jSONObject2;
            }
            throw new IOException(C0091.m360(f96short, 636, 5, 2010) + str + C0126.m503(f96short, 641, 9, 2499) + responseI2.code());
        } catch (Throwable th3) {
            if (responseI2 != null) {
                try {
                    responseI2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0044.m175(f96short, 674, 15, 664));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0003.m10(f96short, 689, 13, 1074));
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

    public final HashMap e() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(C0098.m390(f96short, 702, 10, 505), C0106.m422(f96short, 712, 60, 650));
        mapS.put(C0092.m365(f96short, 773, 7, 546), this.a + C0032.m126(f96short, 772, 1, 1698));
        return mapS;
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0070.m277(f96short, 780, 11, 2346));
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

    public void init(Context context, String str) throws IOException {
        Init.init(context);
        String strV = TextUtils.isEmpty(str) ? FishCrypto.v(C0089.m355(f96short, 791, 111, 1671)) : str.trim();
        if (!strV.contains(C0114.m454(f96short, 902, 3, 562))) {
            strV = C0128.m511(f96short, 905, 8, 3048).concat(strV);
        }
        HttpUrl httpUrl = HttpUrl.parse(strV);
        if (httpUrl == null || !httpUrl.username().isEmpty() || !httpUrl.password().isEmpty() || httpUrl.query() != null || httpUrl.fragment() != null) {
            throw new IOException(C0101.m402(f96short, 916, 8, 3065));
        }
        this.a = httpUrl.toString().replaceAll(C0085.m339(f96short, 913, 3, 2964), "");
        this.b = null;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0081.m322(f96short, 924, 13, 1021));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0091.m360(f96short, 937, 13, 924));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0001.m1(f96short, 950, 13, 1453));
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

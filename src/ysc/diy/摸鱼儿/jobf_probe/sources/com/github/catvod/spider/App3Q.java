package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0294s1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
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
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.utils.C0143;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class App3Q extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f6short = {376, 759, 752, 754, 762, 976, 991, 978, 960, 960, 982, 960, 2543, 2530, 1808, 1823, 1811, 1819, 1603, 1606, 1628, 1627, 500, 506, 486, 3180, 3197, 3195, 3193, 2734, 2744, 2748, 2735, 2750, 2741, 990, 962, 975, 983, 784, 780, 769, 793, 831, 777, 772, 3011, 3012, 3034, 1712, 1743, 1744, 1714, 1721, 1688, 1738, 1683, 1689, 1700, 1670, 1679, 1687, 1724, 1677, 1695, 1739, 1703, 1689, 1668, 1738, 1704, 1739, 1702, 1716, 1727, 1721, 1677, 1734, 1737, 1700, 1717, 1737, 1691, 1718, 1695, 1700, 1689, 1717, 1706, 1713, 1718, 1717, 1690, 1686, 1700, 1685, 1739, 1683, 1708, 1674, 1724, 1716, 1692, 1684, 1668, 1691, 1670, 1686, 1676, 1678, 1703, 1670, 1741, 1734, 1718, 1741, 1679, 1677, 1690, 1749, 1684, 1690, 1717, 1708, 1712, 1675, 1714, 1677, 1695, 1703, 1703, 1711, 1749, 1740, 1691, 1690, 1738, 1673, 1731, 1731, 1061, 1126, 1080, 1150, 1075, 668, 668, 668, 3306, 3303, 795, 788, 792, 784, 1745, 1744, 1729, 1748, 1756, 1753, 2537, 2544, 2555, 1134, 1143, 1149, 3042, 3055, 3046, 3059, 3137, 3158, 3166, 3154, 3137, 3160, 3136, 2413, 2415, 2424, 2403, 2430, 2816, 2829, 2838, 2817, 2823, 2832, 2827, 2838, 1646, 1634, 1635, 1657, 1640, 1635, 1657, 2017, 2022, 1992, 2022, 2004, 2023, 1937, 2734, 2738, 2728, 2735, 2750, 2744, 2734, 499, 486, 511, 485, 505, 498, 499, 485, 2168, 2148, 2153, 2161, 2135, 2145, 2156, 937, 30126, -30978, 663, 1662, 1635, 1646, 861, 844, 842, 840, 1013, 1015, 994, 1011, 1009, 1017, 996, 1007, 1441, 1456, 1462, 1460, 2194, 2179, 2181, 2183, 2177, 2189, 2199, 2188, 2198, 1458, 1463, 1459, 1463, 1450, 2682, 2657, 2682, 2671, 2658, 2586, 2591, 2565, 2562, 308, 313, 2660, 2667, 2663, 2671, 563, 554, 544, 278, 257, 265, 261, 278, 271, 279, 2811, 2762, 2762, 2697, 2795, 31828, 25277, 24183, 21550, -31363, 21405, 2395, 3221, 712, 28220, 28591, 2610, 2608, 2599, 2618, 2620, 2621, 1419, 1417, 1438, 1419, 1434, 1417, 1438, 2493, 2477, 2475, 2464, 2475, 2317, 2332, 2319, 2332, 2320, 2318, 1215, 1200, 1205, 1209, 1202, 1192, 1155, 1192, 1205, 1201, 1209, 1155, 1201, 1199, 2247, 2246, 2261, 2250, 2240, 2246, 2300, 2250, 2247, 689, 694, 675, 694, 679, 762, 747, 764, 739, 743, 736, 751, 738, 1811, 1796, 1810, 1812, 1805, 1813, 1668, 1683, 1671, 1667, 1683, 1669, 1666, 1141, 1128, 1122, 1130, 1124, 1141, 2686, 2678, 2663, 2683, 2684, 2679, 2433, 2435, 2450, 1297, 1302, 1288, 944, 957, 953, 956, 957, 938, 939, 3037, 3025, 2800, 2812, 2813, 2784, 2790, 2814, 2806, 1381, 1378, 1399, 1378, 1379, 1381, 2664, 2661, 2670, 2675, 2796, 2791, 2810, 2806, 263, 262, 271, 258, 282, 316, 270, 272, 1136, 1089, 1089, 1026, 1120, 20732, 23205, 31458, 25517, 25041, 24953, 876, 861, 861, 798, 892, 32229, 26703, 32254, 25777, 19735, 31063, 3061, 3012, 3012, 2951, 3045, 32090, 25523, -32701, 26614, 28244, 28412, 2111, 2062, 2062, 2125, 2095, 18107, 22847, -31802, 2105, 2107, 2090, 32400, 24697, -31863, 25660, 1720, 1673, 1673, 1738, 1704, 22335, 24574, 30762, 24933, 25369, 25521, 2522, 2539, 2539, 2472, 2506, -32148, 26073, -25243, -31140, -25372, 879, 877, 888, 873, 875, 867, 894, 885, 847, 867, 866, 888, 873, 866, 888, 765, 764, 749, 760, 752, 757, 730, 758, 759, 749, 764, 759, 749, 278, 361, 374, 307, 268, 375, 315, 296, 316, 284, 297, 308, 274, 371, 306, 275, 269, 360, 286, 305, 306, 282, 257, 360, 304, 290, 301, 305, 296, 270, 363, 287, 267, 353, 371, 283, 361, 257, 309, 270, 286, 298, 265, 361, 282, 375, 276, 272, 297, 298, 305, 279, 270, 314, 285, 276, 288, 315, 360, 366, 265, 258, 363, 276, 309, 367, 283, 352, 314, 302, 277, 301, 268, 290, 309, 286, 297, 319, 284, 303, 318, 361, 304, 366, 311, 309, 304, 360, 302, 275, 309, 302, 364, 256, 267, 274, 278, 298, 271, 307, 353, 318, 276, 289, 277, 285, 282, 267, 283, 269, 357, 870, 793, 774, 893, 857, 866, 793, 889, 860, 892, 842, 842, 775, 878, 890, 878, 859, 895, 837, 870, 799, 797, 874, 793, 771, 841, 894, 842, 796, 843, 876, 889, 888, 871, 842, 888, 880, 775, 784, 838, 864, 882, 793, 867, 844, 858, 882, 869, 879, 795, 860, 877, 836, 839, 844, 799, 839, 862, 857, 847, 834, 775, 888, 868, 880, 795, 875, 882, 799, 785, 894, 845, 792, 866, 863, 847, 844, 857, 843, 846, 835, 878, 833, 873, 880, 856, 864, 880, 792, 842, 835, 841, 837, 861, 867, 891, 771, 847, 837, 870, 841, 882, 881, 848, 785, 847, 866, 785, 794, 784, 789, 834, 829, 802, 843, 871, 871, 863, 835, 842, 872, 839, 852, 859, 825, 838, 842, 879, 885, 863, 867, 893, 858, 842, 867, 871, 833, 839, 847, 895, 821, 865, 859, 840, 865, 895, 846, 873, 821, 891, 830, 863, 857, 825, 846, 820, 859, 872, 885, 839, 830, 874, 873, 838, 841, 856, 885, 832, 865, 831, 852, 865, 873, 864, 837, 868, 870, 853, 834, 890, 877, 839, 863, 895, 821, 842, 878, 835, 862, 852, 878, 869, 862, 884, 868, 865, 862, 843, 894, 861, 817, 817, 1295, 1392, 1391, 1296, 1319, 1300, 1280, 1334, 1390, 1398, 1302, 1301, 1319, 1393, 1305, 1386, 1333, 1329, 1336, 1307, 1319, 1322, 1394, 1283, 1302, 1294, 1399, 1285, 1400, 1328, 1324, 1280, 1314, 1286, 1393, 1307, 1293, 1303, 1296, 1312, 1297, 1320, 1319, 1299, 1319, 1331, 1291, 1334, 1333, 1288, 1316, 1314, 1392, 1319, 1320, 1332, 1292, 1301, 1392, 1292, 1334, 1332, 1283, 1288, 1321, 1399, 1288, 1305, 1326, 1335, 1312, 1332, 1322, 1301, 1323, 1390, 1332, 1320, 1286, 1301, 1304, 1299, 1395, 1324, 1285, 1326, 1312, 1390, 1302, 1328, 1327, 1312, 1320, 1332, 1283, 1396, 1334, 1401, 1320, 1284, 1327, 1312, 1293, 1283, 1327, 1330, 1335, 1319, 1296, 1322, 1299, 1314, 1292, 1390, 1339, 1297, 1398, 1398, 1398, 1299, 1290, 1319, 1297, 1291, 1393, 1393, 1315, 1292, 1290, 1285, 1329, 1290, 1282, 1327, 1318, 1314, 1292, 1336, 1318, 1316, 1332, 1397, 1296, 1330, 1393, 1322, 1393, 1339, 1317, 1316, 1337, 1325, 1318, 1404, 1404, 893, 895, 
    873, 869, 886, 869, 883, 891, 889, 894, 887, 2323, 2327, 1697, 1700, 1713, 1700, 1493, 1508, 1508, 1447, 1477, 25241, 22325, 24804, 26362, 19374, 32750, 1831, 1840, 1840, 1837, 1840, 675, 658, 658, 721, 691, 26095, 20547, 23507, -28729, 2118, 2167, 2167, 2100, 2134, 23754, 22163, -32284, 21441, 20790, -31454, 1663, 1614, 1614, 1549, 1647, 21235, 22698, 18911, 23103, 25566, 25462, 2084, 2069, 2069, 2134, 2100, 28520, 23236, 28037, 23720, 22257, 1916, 1869, 1869, 1806, 1900, -29494, 27519, 21917, 23803, 24076, -30184, 1676, 1725, 1725, 1790, 1692, 25024, 21612, 20989, 20877, 25063, -26752, 31139, 2449, 2454, 2452, 2460, 2490, 2454, 2455, 2445, 2460, 2455, 2445, 1994, 2015, 2013, 1943, 2979, 2962, 2962, 3025, 2995, 27887, 22851, 23762, 23714, 28162, 28330, 824, 804, 809, 817, 813, 826, 779, 807, 806, 828, 813, 806, 828, 1534, 1512, 1516, 1535, 1518, 1509, 1486, 1506, 1507, 1529, 1512, 1507, 1529, 1061, 1075, 1079, 1060, 1077, 1086, 1045, 1081, 1080, 1058, 1075, 1080, 1058};
    public final SecureRandom a = new SecureRandom();
    public String b = "";
    public String c = "";

    final class TargetReply {
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0116.m463(f6short, 0, 1, 329));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws Throwable {
        try {
            JSONObject jSONObjectB = b(C0103.m408(f6short, 1, 4, 671), new JSONObject());
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray(C0092.m365(f6short, 5, 7, 947));
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString(C0063.m249(f6short, 12, 2, 2438));
                        String strOptString2 = jSONObjectOptJSONObject.optString(C0112.m445(f6short, 14, 4, 1918));
                        if (!TextUtils.isEmpty(strOptString) && !C0294s1.d(strOptString2)) {
                            arrayList.add(new com.github.catvod.spider.merge.p001b.b(strOptString, strOptString2, null));
                        }
                    }
                }
            }
            return com.github.catvod.spider.merge.p001b.g.z(arrayList, d(jSONObjectB.optJSONArray(C0030.m116(f6short, 18, 4, 1583))));
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.p001b.g.z(new ArrayList(), new ArrayList());
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        String str3 = str;
        int iMax = 1;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        if (str3 != null && !str3.isEmpty()) {
            String[] strArr = C0294s1.b;
            for (int i = 0; i < 12; i++) {
                if (str3.contains(strArr[i])) {
                    return a(iMax);
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String strM471 = C0118.m471(f6short, 22, 3, 415);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put(strM471, str3);
            jSONObject.put(C0045.m177(f6short, 25, 4, 3100), iMax);
            return c(iMax, b(C0010.m36(f6short, 29, 6, 2781), jSONObject));
        } catch (Exception unused2) {
            return a(iMax);
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        try {
            String strTrim = b(C0098.m390(f6short, 35, 4, 942), new JSONObject().put(C0032.m126(f6short, 39, 7, 864), str2)).optString(C0018.m70(f6short, 46, 3, 2998)).trim();
            if (!TextUtils.isEmpty(strTrim) && HttpUrl.parse(strTrim) != null) {
                String strI = AbstractC0280n1.i(str, str2, null, null);
                com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.C(FishCrypto.w(C0053.m210(f6short, 49, 91, 1790), strTrim));
                if (strI == null) {
                    strI = "";
                }
                gVar.b(strI);
                if (strTrim.toLowerCase().contains(C0085.m339(f6short, 140, 5, 1035))) {
                    gVar.k();
                }
                return gVar.r();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        JSONArray jSONArray;
        String strM175 = C0044.m175(f6short, 145, 3, 696);
        String strM545 = C0137.m545(f6short, 148, 2, 3203);
        String strM414 = C0104.m414(f6short, 150, 4, 885);
        if (list != null && !list.isEmpty()) {
            try {
                try {
                    JSONObject jSONObjectB = b(C0116.m463(f6short, 154, 6, 1717), new JSONObject().put(strM545, list.get(0)));
                    JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(C0115.m459(f6short, 160, 3, 2463));
                    if (jSONObjectOptJSONObject == null) {
                        return "";
                    }
                    k kVar = new k();
                    kVar.n(jSONObjectOptJSONObject.optString(strM545, list.get(0)));
                    String strOptString = jSONObjectOptJSONObject.optString(strM414);
                    kVar.o(strOptString);
                    kVar.p(jSONObjectOptJSONObject.optString(C0109.m432(f6short, 163, 3, 1054)));
                    kVar.i(jSONObjectOptJSONObject.optString(C0130.m516(f6short, 166, 4, 2966)));
                    kVar.s(jSONObjectOptJSONObject.optString(C0019.m75(f6short, 170, 7, 3123)));
                    kVar.j(jSONObjectOptJSONObject.optString(C0047.m186(f6short, 177, 5, 2316)));
                    kVar.m(jSONObjectOptJSONObject.optString(C0116.m463(f6short, 182, 8, 2916)));
                    String strTrim = jSONObjectOptJSONObject.optString(C0046.m182(f6short, 190, 7, 1549)).replaceAll(C0097.m386(f6short, 197, 7, 1978), "").trim();
                    if (strTrim == null) {
                        strTrim = "";
                        break;
                    }
                    String[] strArr = C0294s1.a;
                    for (int i = 0; i < 15; i++) {
                        if (strTrim.contains(strArr[i])) {
                            strTrim = "";
                            break;
                        }
                    }
                    kVar.l(FishCrypto.a(strTrim));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray(C0116.m463(f6short, 204, 7, 2781));
                    if (jSONArrayOptJSONArray != null) {
                        int i2 = 0;
                        while (i2 < jSONArrayOptJSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject2 == null) {
                                jSONArray = jSONArrayOptJSONArray;
                            } else {
                                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray(C0095.m379(f6short, 211, 8, 406));
                                ArrayList arrayList3 = new ArrayList();
                                if (jSONArrayOptJSONArray2 != null) {
                                    int i3 = 0;
                                    while (i3 < jSONArrayOptJSONArray2.length()) {
                                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3);
                                        if (jSONObjectOptJSONObject3 != null) {
                                            String strOptString2 = jSONObjectOptJSONObject3.optString(C0081.m322(f6short, 219, 7, 2056));
                                            if (!TextUtils.isEmpty(strOptString2)) {
                                                arrayList3.add(g(jSONObjectOptJSONObject3.optString(strM414)) + C0059.m234(f6short, 226, 1, 909) + strOptString2);
                                            }
                                        }
                                        i3++;
                                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                    }
                                }
                                jSONArray = jSONArrayOptJSONArray;
                                if (!arrayList3.isEmpty()) {
                                    String strB = C0294s1.b(jSONObjectOptJSONObject2.optString(strM414));
                                    arrayList.add(TextUtils.isEmpty(strB) ? C0090.m358(f6short, 227, 2, 2833) + (arrayList.size() + 1) : g(strB));
                                    arrayList2.add(TextUtils.join(C0105.m416(f6short, 229, 1, 692), arrayList3));
                                }
                            }
                            i2++;
                            jSONArrayOptJSONArray = jSONArray;
                        }
                    }
                    String strJoin = TextUtils.join(strM175, arrayList2);
                    kVar.q(TextUtils.join(strM175, arrayList));
                    kVar.r(strJoin);
                    AbstractC0280n1.p(strOptString);
                    AbstractC0280n1.q(strJoin);
                    return com.github.catvod.spider.merge.p001b.g.s(kVar);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
        }
        return "";
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = str;
        int iMax = 1;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String strM42 = C0011.m42(f6short, 230, 3, 1546);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put(strM42, str3);
            jSONObject.put(C0049.m193(f6short, 233, 4, 813), iMax);
            return c(iMax, b(C0019.m75(f6short, 237, 8, 918), jSONObject));
        } catch (Exception unused2) {
            return a(iMax);
        }
    }

    public static String a(int i) {
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.o(i, i, 20, 0);
        gVar.F(Collections.emptyList());
        return gVar.r();
    }

    public static String c(int i, JSONObject jSONObject) {
        int iMax = Math.max(1, jSONObject.optInt(C0021.m83(f6short, 245, 4, 1489), i));
        int iMax2 = Math.max(1, jSONObject.optInt(C0119.m473(f6short, 249, 9, 2274), iMax));
        int iMax3 = Math.max(1, jSONObject.optInt(C0096.m382(f6short, 258, 5, 1502), 20));
        int iMax4 = Math.max(0, jSONObject.optInt(C0011.m42(f6short, 263, 5, 2574), 0));
        ArrayList arrayListD = d(jSONObject.optJSONArray(C0043.m169(f6short, 268, 4, 2678)));
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.o(iMax, iMax2, iMax3, Math.max(iMax4, arrayListD.size()));
        gVar.F(arrayListD);
        return gVar.r();
    }

    public static ArrayList d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString(C0070.m277(f6short, 272, 2, 349));
                String strOptString2 = jSONObjectOptJSONObject.optString(C0049.m193(f6short, 274, 4, 2570));
                if (!TextUtils.isEmpty(strOptString) && !C0294s1.d(strOptString2)) {
                    arrayList.add(new k(strOptString, strOptString2, jSONObjectOptJSONObject.optString(C0097.m386(f6short, 278, 3, 579)), jSONObjectOptJSONObject.optString(C0056.m223(f6short, 281, 7, 356))));
                }
            }
        }
        return arrayList;
    }

    public static byte[] f(ResponseBody responseBody) throws IOException {
        long jContentLength = responseBody.contentLength();
        String strM570 = C0143.m570(f6short, 288, 11, 2746);
        if (jContentLength > 2097152) {
            throw new IOException(strM570);
        }
        InputStream inputStreamByteStream = responseBody.byteStream();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int i2 = inputStreamByteStream.read(bArr);
                    if (i2 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStreamByteStream.close();
                        return byteArray;
                    }
                    i += i2;
                    if (i > 2097152) {
                        throw new IOException(strM570);
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

    public static String g(String str) {
        String strK;
        if (str == null) {
            strK = "";
        } else {
            String strM322 = C0081.m322(f6short, 299, 1, 2424);
            String strM499 = C0125.m499(f6short, 300, 1, 3253);
            strK = com.github.catvod.spider.merge.D.b.k(str, strM322, strM499, C0116.m463(f6short, 301, 1, 748), strM499);
        }
        return TextUtils.isEmpty(strK) ? C0128.m511(f6short, 302, 2, 2705) : strK;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0324 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[SYNTHETIC] */
    public final JSONObject b(String str, JSONObject jSONObject) throws Throwable {
        Throwable th;
        App3Q app3Q = this;
        Object objOpt = JSONObject.NULL;
        int i = 0;
        while (i < 4) {
            String strM219 = C0055.m219(f6short, 304, 6, 2643);
            String strM249 = C0063.m249(f6short, 310, 7, 1531);
            String strM186 = C0047.m186(f6short, 317, 5, 2510);
            JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v(strM219, strM249, strM186, str);
            JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
            String strM175 = C0044.m175(f6short, 322, 6, 2429);
            jSONObjectV.put(strM175, jSONObject2);
            jSONObjectV.put(C0115.m459(f6short, 328, 14, 1244), System.currentTimeMillis());
            jSONObjectV.put(C0019.m75(f6short, 342, 9, 2211), app3Q.c);
            Object obj = objOpt == null ? JSONObject.NULL : objOpt;
            String strM554 = C0139.m554(f6short, 351, 5, 706);
            jSONObjectV.put(strM554, obj);
            JSONObject jSONObjectE = app3Q.e(jSONObjectV);
            String strM33 = C0009.m33(f6short, 356, 8, 654);
            boolean zOptBoolean = jSONObjectE.optBoolean(strM33);
            String strM314 = C0079.m314(f6short, 364, 6, 1889);
            if (zOptBoolean && jSONObjectE.optJSONObject(strM314) != null) {
                return jSONObjectE.getJSONObject(strM314);
            }
            JSONObject jSONObjectOptJSONObject = jSONObjectE.optJSONObject(C0140.m558(f6short, 370, 7, 1782));
            String strM102 = C0026.m102(f6short, 377, 6, 1025);
            String strOptString = jSONObjectE.optString(strM102);
            if (jSONObjectOptJSONObject == null || TextUtils.isEmpty(strOptString)) {
                throw new IOException(C0046.m182(f6short, 481, 11, 1785));
            }
            if (jSONObjectE.has(strM554)) {
                objOpt = jSONObjectE.opt(strM554);
            }
            if (!C0027.m105(f6short, 389, 3, 2502).equalsIgnoreCase(jSONObjectOptJSONObject.optString(C0026.m102(f6short, 383, 6, 2579)))) {
                throw new IOException(C0043.m169(f6short, 466, 15, 2174));
            }
            HttpUrl httpUrl = HttpUrl.parse(jSONObjectOptJSONObject.optString(C0091.m360(f6short, 392, 3, 1380)));
            if (httpUrl == null) {
                throw new IOException(C0087.m346(f6short, 455, 11, 2996));
            }
            Request.Builder builder = new Request.Builder().url(httpUrl).get();
            String strM83 = C0021.m83(f6short, 395, 7, 984);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strM83);
            if (jSONObjectOptJSONObject2 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    int i2 = i;
                    String strOptString2 = jSONObjectOptJSONObject2.optString(next);
                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOptString2)) {
                        builder.header(next, strOptString2);
                    }
                    i = i2;
                }
            }
            int i3 = i;
            Response responseI = X1.I(builder.build());
            try {
                ResponseBody responseBodyBody = responseI.body();
                byte[] bArrF = responseBodyBody == null ? new byte[0] : f(responseBodyBody);
                int iCode = responseI.code();
                Headers headers = responseI.headers();
                JSONObject jSONObject3 = new JSONObject();
                for (String str2 : headers.names()) {
                    try {
                        String str3 = strM314;
                        String str4 = strM554;
                        jSONObject3.put(str2, TextUtils.join(C0105.m416(f6short, 402, 2, 3057), headers.values(str2)));
                        strM554 = str4;
                        strM314 = str3;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (responseI != null) {
                            throw th;
                        }
                        try {
                            responseI.close();
                            throw th;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th;
                        }
                    }
                }
                String str5 = strM554;
                String str6 = strM314;
                try {
                    String strEncodeToString = Base64.encodeToString(bArrF, 2);
                    responseI.close();
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(strM219, C0112.m445(f6short, 404, 7, 2707));
                    jSONObject4.put(strM186, str);
                    jSONObject4.put(strM175, jSONObject == null ? new JSONObject() : jSONObject);
                    jSONObject4.put(strM102, strOptString);
                    jSONObject4.put(C0070.m277(f6short, 411, 6, 1302), iCode);
                    jSONObject4.put(strM83, jSONObject3);
                    jSONObject4.put(C0142.m567(f6short, 417, 4, 2570), strEncodeToString);
                    jSONObject4.put(str5, objOpt == null ? JSONObject.NULL : objOpt);
                    app3Q = this;
                    JSONObject jSONObjectE2 = app3Q.e(jSONObject4);
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectE2.optJSONObject(str6);
                    if (jSONObjectOptJSONObject3 != null) {
                        return jSONObjectOptJSONObject3;
                    }
                    if (jSONObjectE2.optBoolean(strM33)) {
                        throw new IOException(C0089.m355(f6short, 444, 11, 813));
                    }
                    if (!jSONObjectE2.optBoolean(C0128.m511(f6short, 421, 4, 2690))) {
                        throw new IOException(C0070.m277(f6short, 433, 11, 1073));
                    }
                    if (jSONObjectE2.has(str5)) {
                        objOpt = jSONObjectE2.opt(str5);
                    }
                    long jOptLong = jSONObjectE2.optLong(C0073.m288(f6short, 425, 8, 355), 0L);
                    if (jOptLong > 0) {
                        Thread.sleep(Math.min(jOptLong, 5000L));
                    }
                    i = i3 + 1;
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    if (responseI != null) {
                        throw th;
                    }
                    responseI.close();
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        throw new IOException(C0096.m382(f6short, 492, 10, 2459));
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0026.m102(f6short, 502, 15, 780));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0063.m249(f6short, 517, 13, 665));
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

    public final JSONObject e(JSONObject jSONObject) throws IOException {
        if (TextUtils.isEmpty(this.b)) {
            throw new IOException(C0070.m277(f6short, 1083, 12, 1741));
        }
        String str = this.b;
        String string = jSONObject.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM126 = C0032.m126(f6short, 530, 111, 344);
        String strM445 = C0112.m445(f6short, 641, 111, 808);
        byte[] bArrT = FishCrypto.t(strM126, strM445, C0085.m339(f6short, 752, 91, 780), C0122.m486(f6short, 843, 155, 1345), bytes);
        if (bArrT == null) {
            throw new IOException(C0085.m339(f6short, 1072, 11, 1853));
        }
        JSONObject jSONObject2 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM199 = C0050.m199(f6short, 998, 11, 784);
        String strP = X1.P(str, jSONObject2.put(strM199, strEncodeToString).toString());
        if (TextUtils.isEmpty(strP)) {
            throw new IOException(C0014.m54(f6short, 1062, 10, 2149));
        }
        JSONObject jSONObject3 = new JSONObject(strP);
        Object objOpt = jSONObject3.opt(strM199);
        if (jSONObject3.length() == 1 && (objOpt instanceof String)) {
            String str2 = (String) objOpt;
            if (!TextUtils.isEmpty(str2)) {
                byte[] bArrS = FishCrypto.s(strM126, strM445, Base64.decode(str2, 0));
                if (bArrS == null) {
                    throw new IOException(C0085.m339(f6short, 1040, 11, 2055));
                }
                JSONObject jSONObject4 = new JSONObject(new String(bArrS, charset));
                if (!jSONObject4.optBoolean(C0073.m288(f6short, 1009, 2, 2428))) {
                    throw new IOException(jSONObject4.optString(C0128.m511(f6short, 1026, 5, 1858), C0047.m186(f6short, 1031, 9, 738)));
                }
                JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject(C0072.m285(f6short, 1011, 4, 1733));
                if (jSONObjectOptJSONObject != null) {
                    return jSONObjectOptJSONObject;
                }
                throw new IOException(C0059.m234(f6short, 1015, 11, 1428));
            }
        }
        throw new IOException(C0010.m36(f6short, 1051, 11, 1598));
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0107.m427(f6short, 1095, 11, 2553));
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

    public void init(Context context, String str) throws Throwable {
        super.init(context, str);
        byte[] bArr = new byte[8];
        this.a.nextBytes(bArr);
        StringBuilder sb = new StringBuilder(16);
        for (int i = 0; i < 8; i++) {
            sb.append(String.format(C0053.m210(f6short, 1106, 4, 2031), Integer.valueOf(bArr[i] & 255)));
        }
        this.c = sb.toString();
        this.b = "";
        String strTrim = str != null ? str.trim() : "";
        if (HttpUrl.parse(strTrim) == null) {
            strTrim = FishCrypto.g(strTrim);
        }
        if (strTrim == null || HttpUrl.parse(strTrim) == null) {
            throw new IOException(C0044.m175(f6short, 1110, 11, 3042));
        }
        this.b = strTrim;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0089.m355(f6short, 1121, 13, 840));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0112.m445(f6short, 1134, 13, 1421));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0093.m368(f6short, 1147, 13, 1110));
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

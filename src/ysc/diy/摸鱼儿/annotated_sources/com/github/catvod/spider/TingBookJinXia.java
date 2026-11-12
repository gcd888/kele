package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class TingBookJinXia extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f95short = {3069, 3053, 2977, 3055, 2982, 3003, 3004, 2997, 3071, 2977, 2999, 2995, 2976, 2993, 3002, 3071, 2981, 2998, 3071, 1647, 1646, 1660, 1559, 1538, 609, 611, 622, 639, 631, 622, 611, 631, 632, 638, 611, 631, 632, 25070, 17704, 30988, 21747, 2125, 2121, 2120, 2113, 2116, 2131, 2122, 2127, 2120, 2113, 2143, 2127, 25073, 25015, 29140, 24227, 1461, 1460, 1448, 1453, 1448, 1465, 1460, 1440, 1455, 1464, 1448, 25029, 30315, 25281, 30716, 1313, 1328, 1334, 1325, 1324, 1340, 1316, 1323, 1332, 1324, 1323, 1314, -27317, 23476, -28746, 25971, 2408, 2411, 2403, 2422, 2411, 2412, 2405, 2414, 2423, 2412, 2414, 2411, 22651, 23904, 19691, 30667, 2110, 2092, 2087, 2097, 2108, 2092, 2084, 2080, 2087, 2094, 2099, 2081, 2108, 23804, 20574, -30936, 20574, 1359, 1356, 1355, 1346, 1345, 1356, 1348, 1355, 1365, 1356, 1355, 1346, 1366, 1357, 1360, 29873, 23302, -32326, 17432, 850, 854, 858, 842, 859, 842, 850, 854, 28518, -29714, 27547, 28518, 3164, 3149, 3141, 3146, 3139, 3159, 3148, 3137, 3146, 3139, 3164, 3149, 3141, 3147, 3156, 3149, 3146, 29440, 23816, 23031, 20793, 2511, 2527, 2520, 2511, 2499, 2515, 22858, 31939, -25584, -27790, -24666, -29990, 27055, 17436, 26290, 2431, 2430, 2403, 2404, 28553, 26998, -26252, 872, 877, 877, 893, 864, 868, 876, 515, 542, 520, 521, 542, 27111, 21754, 2796, 2787, 2782, 2777, 2768, 2805, 2776, 2776, 2780, 2813, 2782, 2777, 2799, 2782, 2774, 2794, 2711, 2806, 2791, 2814, -31389, 23657, 2756, 2755, 2774, 2755, 2754, 2756, 2698, 2905, 2897, 2880, 2901, 2927, 2906, 2901, 2905, 2897, 2825, 2923, 2902, 2921, 2336, 2348, 2349, 2359, 2342, 2349, 2359, 2557, 2549, 2532, 2545, 2507, 2558, 2545, 2557, 2549, 2477, 2511, 2547, 2528, 2509, 594, 602, 587, 606, 612, 593, 606, 594, 602, 514, 608, 604, 610, 664, 656, 641, 660, 686, 667, 660, 664, 656, 712, 682, 645, 680, 1057, 1031, 1041, 1030, 1113, 1077, 1043, 1041, 1050, 1024, 1310, 1340, 1321, 1338, 1343, 1343, 1330, 1404, 1382, 1405, 1379, 1395, 1403, 1311, 1338, 1341, 1318, 1323, 1384, 1395, 1298, 1341, 1335, 1313, 1340, 1338, 1335, 1395, 1378, 1377, 1384, 1395, 1283, 1338, 1323, 1334, 1343, 1395, 1382, 1402, 1395, 1298, 1315, 1315, 1343, 1334, 1284, 1334, 1329, 1304, 1338, 1319, 1404, 1382, 1376, 1380, 1405, 1376, 1381, 1395, 1403, 1304, 1307, 1287, 1310, 1311, 1407, 1395, 1343, 1338, 1336, 1334, 1395, 1300, 1334, 1328, 1336, 1340, 1402, 1395, 1296, 1339, 1313, 1340, 1342, 1334, 1404, 1378, 1377, 1379, 1405, 1379, 1405, 1379, 1405, 1379, 1395, 1310, 1340, 1329, 1338, 1343, 1334, 1395, 1280, 1330, 1333, 1330, 1313, 1338, 1404, 1382, 1376, 1380, 1405, 1376, 1381, 1273, 1230, 1229, 1230, 1241, 1230, 1241, 887, 776, 791, 862, 858, 879, 894, 887, 790, 860, 851, 878, 853, 859, 888, 854, 875, 856, 855, 781, 875, 886, 872, 847, 884, 858, 860, 849, 768, 895, 769, 876, 887, 865, 847, 783, 843, 888, 862, 790, 850, 790, 781, 873, 835, 854, 776, 887, 879, 854, 874, 892, 849, 894, 781, 886, 858, 893, 845, 833, 860, 876, 885, 890, 769, 877, 842, 855, 769, 886, 852, 777, 860, 886, 845, 768, 840, 863, 850, 776, 790, 835, 841, 891, 872, 840, 842, 842, 862, 772, 772, 3303, 3306, 3306, 3310, 3276, 3297, 678, 700, 671, 686, 694, 417, 432, 438, 436, 1749, 1753, 2593, 2609, 2685, 2611, 2671, 2686, 2663, 2595, 2665, 2667, 2682, 2656, 2667, 2657, 2686, 2658, 2671, 2679, 898, 901, 912, 901, 900, 898, 1161, 1171, 1172, 1162, 2729, 2734, 2736, 1598, 1586, 1648, 1661, 1661, 1657, 1627, 1654, 1583, 2157, 2145, 2097, 2080, 2086, 2084, 2172, 2023, 2024, 2005, 2002, 2011, 2046, 2003, 2003, 2007, 2038, 2005, 2002, 2020, 2005, 2013, 2017, 1948, 2045, 2028, 2037, -29621, 27646, 24205, -30055, 1926, 1948, 3071, 3051, 3066, 3063, 3057, 3005, 3054, 3058, 3071, 3047, 3067, 3052, 1956, 1957, 1972, 3080, 3079, 3130, 3133, 3124, 3089, 3132, 3132, 3128, 3097, 3130, 3133, 3083, 3130, 3122, 3086, 3187, -25696, -27454, 3078, 3073, 3103, 28547, 24453, 21858, -32394, 3177, 3187, 589, 3177, 3109, 3118, 3113, 3105, 3112, 3175, 3119, 3190, 478, 402, 409, 413, 407, 464, 409, 413, 407, 2879, 2878, 2863, 2407, 2347, 2336, 2343, 2351, 2342, 2409, 2361, 28247, -25335, 17175, -29618, 31017, 27550, 670, 729, 734, 708, 706, 735, 656, 704, 18910, -30552, 1940, 1925, 1925, 1186, 1276, 1248, 1253, 1279, 1272, 1196, 1261, 1186, 1258, 2682, 2656, 2679, 2676, 30635, -25095, 2843, 1010, 23852, 23588, 833, 860, 842, 843, 860, 696, 766, 738, 763, 762, 2481, 2551, 2544, 2554, 2555, 2534, 1836, 2585, 2651, 2630, 2640, 2641, 2630, 2585, 1245, 1168, 1155, 1170, 1172, 1174, 1235, 1152, 1155, 1170, 1181, 1027, 1148, 1123, 1066, 1070, 1051, 1034, 1027, 1122, 1064, 1063, 1050, 1057, 1071, 1036, 1058, 1055, 1068, 1059, 1145, 1055, 1026, 1052, 1083, 1024, 1070, 1064, 1061, 1140, 1035, 1141, 1048, 1027, 1045, 1083, 1147, 1087, 1036, 1066, 1122, 1062, 1122, 1145, 1053, 1079, 1058, 1148, 1027, 1051, 1058, 1054, 1032, 1061, 1034, 1145, 1026, 1070, 1033, 1081, 1077, 1064, 1048, 1025, 1038, 1141, 1049, 1086, 1059, 1141, 1026, 1056, 1149, 1064, 1026, 1081, 1140, 1084, 1067, 1062, 1148, 1122, 1079, 1085, 1039, 1052, 1084, 1086, 1086, 1066, 1136, 1136, 2908, 2938, 2924, 2939, 2852, 2888, 2926, 2924, 2919, 2941, 2521, 2555, 2542, 2557, 2552, 2552, 2549, 2491, 2465, 2490, 2468, 2484, 2492, 2520, 2557, 2554, 2529, 2540, 2479, 2484, 2517, 2554, 2544, 2534, 2555, 2557, 2544, 2484, 2469, 2470, 2479, 2484, 2500, 2557, 2540, 2545, 2552, 2484, 2465, 2493, 2484, 2517, 2532, 2532, 2552, 2545, 2499, 2545, 2550, 2527, 2557, 2528, 2491, 2465, 2471, 2467, 2490, 2471, 2466, 2484, 2492, 2527, 2524, 2496, 2521, 2520, 2488, 2484, 2552, 2557, 2559, 2545, 2484, 2515, 2545, 2551, 2559, 2555, 2493, 2484, 2519, 2556, 2534, 2555, 2553, 2545, 2491, 2469, 2470, 2468, 2490, 2468, 2490, 2468, 2490, 2468, 2484, 2521, 2555, 2550, 2557, 2552, 2545, 2484, 2503, 2549, 2546, 2549, 2534, 2557, 2491, 2465, 2471, 2467, 2490, 2471, 2466, 1716, 2185, 2244, 2251, 2254, 2260, 2259, 2183, 2201, 2183, 2246, 2300, 2255, 2261, 2242, 2241, 2298, 782, 792, 798, 777, 788, 
    786, 787, 861, 796, 806, 789, 783, 792, 795, 857, 832, 851, 789, 777, 784, 785, 800, 839, 789, 796, 782, 853, 789, 846, 852, 3279, 3285, 3266, 3265, 1893, 1913, 1913, 1917, 2858, 2929, 1832, 738, 754, 678, 751, 747, 737, 270, 271, 286, 3153, 3153, 3093, 3141, 28075, -24843, 26144, -27266, -617, 27733, -24821, 2242, 3174, 3188, 3139, 3136, 3139, 3156, 3139, 3156, 3099, 1857, 1838, 1851, 1821, 1803, 1820, 1859, 1839, 1801, 1803, 1792, 1818, 1875, 1827, 1793, 1812, 1799, 1794, 1794, 1807, 1857, 1883, 1856, 1886, 1870, 1862, 1826, 1799, 1792, 1819, 1814, 1877, 1870, 1839, 1792, 1802, 1820, 1793, 1799, 1802, 1870, 1887, 1884, 1877, 1870, 1854, 1799, 1814, 1803, 1794, 1870, 1883, 1863, 1870, 1839, 1822, 1822, 1794, 1803, 1849, 1803, 1804, 1829, 1799, 1818, 1857, 1883, 1885, 1881, 1856, 1885, 1880, 1870, 1862, 1829, 1830, 1850, 1827, 1826, 1858, 1870, 1794, 1799, 1797, 1803, 1870, 1833, 1803, 1805, 1797, 1793, 1863, 1870, 1837, 1798, 1820, 1793, 1795, 1803, 1857, 1887, 1884, 1886, 1856, 1886, 1856, 1886, 1856, 1886, 1870, 1827, 1793, 1804, 1799, 1794, 1803, 1870, 1853, 1807, 1800, 1807, 1820, 1799, 1857, 1883, 1885, 1881, 1856, 1885, 1880, 3173, 3175, 3186, 3171, 3169, 3177, 3188, 3199, 3141, 3177, 3176, 3186, 3171, 3176, 3186, 3302, 3303, 3318, 3299, 3307, 3310, 3265, 3309, 3308, 3318, 3303, 3308, 3318, 540, 539, 537, 529, 567, 539, 538, 512, 529, 538, 512, 1424, 1519, 1520, 1412, 1430, 1416, 1451, 1421, 1516, 1519, 1462, 1434, 1447, 1437, 1456, 1422, 1450, 1461, 1459, 1469, 1435, 1453, 1454, 1516, 1452, 1514, 1412, 1417, 1468, 1423, 1468, 1525, 1457, 1454, 1451, 1514, 1450, 1459, 1511, 1420, 1457, 1462, 1519, 1517, 1450, 1435, 1430, 1466, 1516, 1426, 1460, 1430, 1465, 1439, 1447, 1511, 1436, 1516, 1421, 1437, 1459, 1453, 1518, 1416, 1525, 1460, 1453, 1516, 1412, 1456, 1467, 1427, 1517, 1436, 1444, 1446, 1425, 1416, 1414, 1464, 1452, 1471, 1469, 1456, 1461, 1415, 1461, 1462, 1429, 1416, 1447, 1518, 1464, 1414, 1518, 1437, 1436, 1458, 1414, 1448, 1455, 1458, 1431, 1448, 1511, 1412, 1444, 1460, 1460, 1431, 1507, 2128, 2124, 2113, 2137, 2117, 2130, 2147, 2127, 2126, 2132, 2117, 2126, 2132, 1095, 1105, 1109, 1094, 1111, 1116, 1143, 1115, 1114, 1088, 1105, 1114, 1088};
    public String a = "";

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return com.github.catvod.spider.merge.p001b.g.y(b(X1.L(a(this.a + C0082.m325(f95short, 0, 19, 3026) + URLEncoder.encode(str, C0091.m360(f95short, 19, 5, 1594))), "")));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0014.m54(f95short, 24, 13, 534), C0096.m382(f95short, 37, 4, 2696), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0014.m54(f95short, 41, 12, 2086), C0139.m554(f95short, 53, 4, 417), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0056.m223(f95short, 57, 11, 1473), C0103.m408(f95short, 68, 4, 621), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0082.m325(f95short, 72, 12, 1349), C0047.m186(f95short, 84, 4, 1462), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0011.m42(f95short, 88, 12, 2306), C0011.m42(f95short, 100, 4, 973), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0049.m193(f95short, 104, 13, 2121), C0128.m511(f95short, 117, 4, 1892), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0011.m42(f95short, 121, 15, 1317), C0046.m182(f95short, 136, 4, 2686), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0089.m355(f95short, 140, 8, 803), C0106.m422(f95short, 148, 4, 2452), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0133.m529(f95short, 152, 17, 3108), C0032.m126(f95short, 169, 4, 1528), null));
        com.github.catvod.spider.merge.D.b.z(C0107.m427(f95short, 173, 6, 2486), C0047.m186(f95short, 179, 4, 3043), null, arrayList);
        ArrayList arrayListB = b(X1.L(a(this.a), ""));
        if (!z) {
            return com.github.catvod.spider.merge.p001b.g.z(arrayList, arrayListB);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(C0076.m301(f95short, 183, 2, 382), ""));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(C0143.m570(f95short, 185, 3, 2726), C0087.m346(f95short, 188, 4, 2327)));
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(C0050.m199(f95short, 192, 3, 3200), C0009.m33(f95short, 195, 7, 777)));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new com.github.catvod.spider.merge.p001b.d(C0115.m459(f95short, 202, 5, 620), C0119.m473(f95short, 207, 2, 2677), arrayList2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((com.github.catvod.spider.merge.p001b.b) it.next()).a(), arrayList3);
        }
        return com.github.catvod.spider.merge.p001b.g.A(arrayList, arrayListB, linkedHashMap);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strM10 = C0003.m10(f95short, 209, 29, 2743);
        String strA = "";
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(a(this.a + str2), "");
        com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q(C0089.m355(f95short, 238, 13, 2868));
        String strM427 = C0107.m427(f95short, 251, 7, 2371);
        String strA2 = dVarQ.a(strM427);
        String strA3 = gVarL.Q(C0081.m322(f95short, 258, 14, 2448)).a(strM427);
        String strA4 = gVarL.Q(C0120.m477(f95short, 272, 13, 575)).a(strM427);
        String strA5 = gVarL.Q(C0087.m346(f95short, 285, 13, 757)).a(strM427);
        boolean zIsEmpty = strA2.isEmpty();
        String strM379 = C0095.m379(f95short, 298, 10, 1140);
        String strM83 = C0021.m83(f95short, 308, 117, 1363);
        String strM368 = C0093.m368(f95short, 425, 7, 1195);
        String strM360 = C0091.m360(f95short, 432, 91, 825);
        if (!zIsEmpty && !strA3.isEmpty()) {
            HashMap mapT = com.github.catvod.spider.merge.D.b.t(C0115.m459(f95short, 523, 6, 3205), strA2, C0101.m402(f95short, 529, 5, 719), strA5);
            mapT.put(C0021.m83(f95short, 534, 4, 465), strA3);
            HashMap map = new HashMap();
            map.put(strM379, strM83);
            map.put(strM368, this.a + str2);
            if (!strA4.isEmpty()) {
                map.put(C0142.m567(f95short, 538, 2, 1709), strA4);
            }
            try {
                JSONObject jSONObject = new JSONObject(X1.N(FishCrypto.u(strM360, this.a + C0101.m402(f95short, 540, 18, 2574)), mapT, map).a());
                int iOptInt = jSONObject.optInt(C0093.m368(f95short, 558, 6, 1009), 0);
                if (iOptInt == 1) {
                    String strOptString = jSONObject.optString(C0122.m486(f95short, 564, 4, 1254), "");
                    String strOptString2 = jSONObject.optString(C0093.m368(f95short, 568, 3, 2780), "");
                    if (!strOptString.isEmpty()) {
                        strA = strOptString;
                    } else if (!strOptString2.isEmpty()) {
                        strA = strOptString2;
                    }
                } else {
                    SpiderDebug.log(strM10 + iOptInt + C0074.m292(f95short, 571, 9, 1554) + strA2 + C0120.m477(f95short, 580, 7, 2113) + strA3);
                }
            } catch (Exception e) {
                com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0135.m539(f95short, 587, 26, 1980)));
            }
        }
        if (strA.isEmpty()) {
            strA = gVarL.Q(C0053.m210(f95short, 613, 12, 2974)).a(C0070.m277(f95short, 625, 3, 2007));
        }
        if (!strA.isEmpty()) {
            HashMap mapS = com.github.catvod.spider.merge.D.b.s(strM379, strM83);
            mapS.put(strM368, this.a + C0104.m414(f95short, 656, 1, 610));
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(FishCrypto.u(strM360, strA));
            gVar.h(mapS);
            return gVar.r();
        }
        SpiderDebug.log(C0001.m1(f95short, 628, 28, 3155) + str2);
        com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
        gVar2.C(FishCrypto.u(strM360, this.a + str2));
        gVar2.p();
        HashMap map2 = new HashMap();
        map2.put(strM379, strM83);
        gVar2.h(map2);
        return gVar2.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        String str2 = "";
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(a(this.a + str), "");
        String strTrim = gVarL.Q(C0044.m175(f95short, 657, 9, 3143)).g().trim();
        String strC = c(gVarL.Q(C0101.m402(f95short, 666, 9, 496)).a(C0087.m346(f95short, 675, 3, 2892)));
        Iterator<E> it = gVarL.Q(C0001.m1(f95short, 678, 8, 2377)).iterator();
        String strSubstring = "";
        String strSubstring2 = strSubstring;
        String strSubstring3 = strSubstring2;
        while (it.hasNext()) {
            String strTrim2 = ((k) it.next()).T().trim();
            if (strTrim2.startsWith(C0001.m1(f95short, 686, 2, 2810))) {
                strSubstring = strTrim2.substring(3);
            } else if (strTrim2.startsWith(C0059.m234(f95short, 688, 2, 3147))) {
                strSubstring2 = strTrim2.substring(3);
            } else if (strTrim2.startsWith(C0096.m382(f95short, 690, 2, 2975))) {
                strSubstring3 = strTrim2.substring(3);
            }
        }
        Iterator<E> it2 = gVarL.Q(C0070.m277(f95short, 692, 8, 688)).iterator();
        while (it2.hasNext()) {
            String strTrim3 = ((k) it2.next()).T().trim();
            if (!strTrim3.isEmpty() && !strTrim3.contains(C0079.m314(f95short, 700, 5, 2005)) && strTrim3.length() > 20) {
                str2 = strTrim3;
                break;
            }
        }
        com.github.catvod.spider.merge.h0.d<k> dVarQ = gVarL.Q(C0053.m210(f95short, 705, 10, 1164));
        ArrayList arrayList = new ArrayList();
        for (k kVar : dVarQ) {
            String strC2 = kVar.c(C0055.m219(f95short, 715, 4, 2578));
            String strTrim4 = kVar.T().trim();
            if (!strC2.isEmpty() && !strTrim4.isEmpty()) {
                arrayList.add(C0126.m503(f95short, 719, 1, 3207) + strTrim4 + C0055.m219(f95short, 720, 2, 2879) + strC2);
            }
        }
        String strJoin = TextUtils.join(C0019.m75(f95short, 722, 1, 977), arrayList);
        com.github.catvod.spider.merge.p001b.k kVar2 = new com.github.catvod.spider.merge.p001b.k();
        kVar2.n(str);
        kVar2.o(strTrim);
        kVar2.p(strC);
        kVar2.j(strSubstring);
        kVar2.m(strSubstring2);
        kVar2.s(strSubstring3);
        kVar2.l(str2);
        kVar2.q(C0119.m473(f95short, 723, 2, 1323));
        kVar2.r(strJoin);
        N1.d(kVar2);
        return com.github.catvod.spider.merge.p001b.g.s(kVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String string;
        int i;
        if (map != null) {
            String strM473 = C0119.m473(f95short, 725, 5, 814);
            if (map.containsKey(strM473)) {
                str3 = map.get(strM473);
            } else {
                str3 = "";
            }
        } else {
            str3 = "";
        }
        int i2 = Integer.parseInt(str2);
        String strM314 = C0079.m314(f95short, 730, 5, 662);
        String strM219 = C0055.m219(f95short, 735, 6, 2462);
        String strM301 = C0076.m301(f95short, 741, 1, 1795);
        if (str3 == null || str3.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(strM301);
            sb.append(str);
            sb.append(i2 == 1 ? strM301 : com.github.catvod.spider.merge.D.b.h(strM219, i2, strM314));
            string = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            com.github.catvod.spider.merge.D.b.A(sb2, this.a, strM301, str, strM219);
            sb2.append(i2);
            sb2.append(C0126.m503(f95short, 742, 7, 2612));
            sb2.append(str3);
            sb2.append(strM314);
            string = sb2.toString();
        }
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(a(string), "");
        ArrayList arrayListB = b(gVarL);
        Iterator<E> it = gVarL.Q(C0142.m567(f95short, 749, 11, 1267)).iterator();
        while (it.hasNext()) {
            String strTrim = ((k) it.next()).T().trim();
            if (strTrim.contains(strM301)) {
                try {
                    i = Integer.parseInt(strTrim.split(strM301)[1].trim());
                } catch (Exception unused) {
                    i = i2;
                }
                com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayListB);
                gVarC.o(i2, i, 10, i * 10);
                return gVarC.r();
            }
        }
        i = i2;
        com.github.catvod.spider.merge.p001b.g gVarC2 = com.github.catvod.spider.merge.D.b.c(arrayListB);
        gVarC2.o(i2, i, 10, i * 10);
        return gVarC2.r();
    }

    public static String a(String str) {
        String strU = FishCrypto.u(C0118.m471(f95short, 760, 91, 1101), str);
        HashMap map = new HashMap();
        map.put(C0133.m529(f95short, 851, 10, 2825), C0122.m486(f95short, 861, 117, 2452));
        return X1.X(strU, null, map);
    }

    public final ArrayList b(com.github.catvod.spider.merge.f0.g gVar) {
        String strTrim;
        String strM65 = C0017.m65(f95short, 978, 1, 1769);
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.h0.d<k> dVarQ = gVar.Q(C0053.m210(f95short, 979, 16, 2215));
        if (dVarQ.isEmpty()) {
            dVarQ = gVar.Q(C0107.m427(f95short, 995, 30, 893));
        }
        for (k kVar : dVarQ) {
            try {
                String strC = kVar.c(C0135.m539(f95short, 1025, 4, 3239));
                if (!strC.isEmpty() && !strC.startsWith(C0140.m558(f95short, 1029, 4, 1805))) {
                    String strTrim2 = kVar.Q(C0050.m199(f95short, 1033, 2, 2882)).g().trim();
                    if (strTrim2.startsWith(C0143.m570(f95short, 1035, 1, 1907)) && strTrim2.contains(strM65)) {
                        strTrim2 = strTrim2.substring(strTrim2.indexOf(strM65) + 1);
                    }
                    String strC2 = c(kVar.Q(C0047.m186(f95short, 1036, 6, 646)).a(C0082.m325(f95short, 1042, 3, 381)));
                    Iterator<E> it = kVar.Q(C0017.m65(f95short, 1045, 4, 3125)).iterator();
                    while (true) {
                        strTrim = "";
                        if (!it.hasNext()) {
                            break;
                        }
                        String strTrim3 = ((k) it.next()).T().trim();
                        if (strTrim3.startsWith(C0049.m193(f95short, 1049, 2, 2310))) {
                            strTrim = strTrim3.replace(C0118.m471(f95short, 1051, 3, 653), "").replace(C0043.m169(f95short, 1054, 3, 2296), "").trim();
                            break;
                        }
                    }
                    if (!strTrim2.isEmpty() && !strC2.isEmpty()) {
                        arrayList.add(new com.github.catvod.spider.merge.p001b.k(strC, strTrim2, strC2, strTrim));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public final String c(String str) {
        return (str == null || str.isEmpty()) ? "" : com.github.catvod.spider.merge.D.b.m(com.github.catvod.spider.merge.D.b.p(str, C0090.m358(f95short, 1057, 9, 3110)), this.a, C0126.m503(f95short, 1066, 130, 1902));
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0001.m1(f95short, 1196, 15, 3078));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0115.m459(f95short, 1211, 13, 3202));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0006.m21(f95short, 1224, 11, 628));
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
        this.a = FishCrypto.v(C0117.m467(f95short, 1235, 111, 1502));
        if (str == null || str.isEmpty()) {
            return;
        }
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0079.m314(f95short, 1346, 13, 2080));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0047.m186(f95short, 1359, 13, 1076));
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

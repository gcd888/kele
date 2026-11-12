package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.A.N1;
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
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
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
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
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
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Guazi extends Spider {
    public String a;
    public SharedPreferences b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;
    public boolean h;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f48short = {1373, 2263, 29448, 22860, 559, 20817, 18699, 21963, 1059, 22750, 25949, 1304, 1306, 29342, 22292, 770, 30859, -31731, 2894, 28225, 23072, 20817, 2350, 2359, 2362, 2014, 1344, 1326, 1311, 1311, 1344, 1318, 1281, 1291, 1290, 1303, 1315, 1286, 1308, 1307, 1344, 1286, 1281, 1291, 1290, 1303, 420, 417, 443, 444, 1324, 1314, 1342, 1328, 1320, 1333, 1315, 1332, 644, 665, 655, 654, 665, 692, 669, 650, 647, 2797, 2672, 2590, 2607, 2607, 2672, 2582, 2609, 2619, 2618, 2599, 2672, 2617, 2614, 2609, 2619, 2578, 2608, 2605, 2618, 2569, 2608, 2619, 711, 743, 711, 743, 2594, 2988, 3026, 3019, 3008, 3067, 3008, 3067, 3021, 3008, 1282, 1307, 1296, 1323, 1309, 1296, 1338, 1325, 1339, 1319, 1316, 1341, 1340, 1313, 1319, 1318, 2976, 3022, 3071, 3071, 2976, 3037, 3050, 3068, 3040, 3066, 3069, 3052, 3050, 2976, 3033, 3066, 3069, 3043, 3019, 3050, 3067, 3054, 3046, 3043, 2976, 3068, 3047, 3040, 3064, 3008, 3041, 3050, 1675, 1676, 1682, 1108, 1138, 1124, 1139, 1068, 1088, 1126, 1124, 1135, 1141, 1974, 1947, 1932, 1948, 2005, 1999, 1997, 2004, 1986, 1993, 2004, 1995, 1994, 1994, 495, 472, 475, 472, 463, 472, 463, 2759, 2779, 2779, 2783, 2709, 2688, 2688, 2808, 2789, 2758, 2805, 2775, 2787, 2807, 2798, 2717, 2689, 2764, 2752, 2754, 2688, 2791, 2812, 2808, 2806, 2813, 2764, 2810, 2807, 1813, 1804, 1799, 1852, 1802, 1799, 2160, 2162, 2175, 2164, 2161, 2168, 2114, 2153, 2164, 2160, 2168, 2208, 2235, 2239, 2225, 2234, 2571, 2568, 2575, 2577, 2594, 2590, 2577, 2578, 2568, 2585, 2594, 2580, 2585, 2609, 2417, 2408, 2403, 2392, 2403, 2392, 2414, 2403, 1241, 1207, 1158, 1158, 1241, 1215, 1176, 1170, 1171, 1166, 1190, 1178, 1175, 1167, 1241, 1158, 1178, 1175, 1167, 1215, 1176, 1168, 1177, 2750, 2768, 2785, 2785, 2750, 2755, 2804, 2786, 2814, 2788, 2787, 2802, 2804, 2750, 2759, 2788, 2787, 2813, 2750, 2786, 2809, 2814, 2790, 1614, 1623, 1628, 1649, 1622, 1630, 1623, 2735, 2742, 2749, 2694, 2743, 2744, 2740, 2748, 2632, 2641, 2650, 2657, 2638, 2647, 2653, 2764, 2777, 2815, 2793, 2814, 2721, 2765, 2795, 2793, 2786, 2808, 2737, 2760, 2797, 2784, 2810, 2789, 2791, 2723, 2750, 2722, 2749, 2722, 2748, 2220, 2229, 2238, 2181, 2211, 2239, 2235, 2216, 2925, 2932, 2943, 2884, 2938, 2921, 2942, 2938, 2402, 2427, 2416, 2379, 2421, 2423, 2400, 2427, 2406, 1940, 1933, 1926, 1981, 1926, 1931, 1936, 1927, 1921, 1942, 1933, 1936, 293, 316, 311, 268, 294, 288, 310, 268, 304, 316, 317, 295, 310, 317, 295, 13185, 2373, 1989, 1984, 2010, 2013, 1112, 1092, 1097, 1105, 1077, 1060, 1079, 1060, 1064, 1568, 1784, 1784, 2838, 1985, 1985, 1985, 1276, 1249, 1260, 2641, 2624, 2630, 2628, 2510, 2527, 2521, 2523, 2541, 2519, 2500, 2523, 535, 532, 1297, 1282, 1301, 1297, 2681, 2901, 2889, 2893, 2910, 1722, 1702, 1723, 1725, 1517, 1494, 1504, 1517, 647, 641, 662, 2040, 1942, 1959, 1959, 2040, 1950, 1977, 1971, 1970, 1967, 1947, 1982, 1956, 1955, 2040, 1982, 1977, 1971, 1970, 1967, 1947, 1982, 1956, 1955, 860, 832, 832, 836, 839, 782, 795, 795, 853, 836, 861, 794, 835, 775, 774, 846, 771, 834, 832, 848, 794, 855, 859, 857, 2433, 2461, 2461, 2457, 2458, 2515, 2502, 2502, 2440, 2457, 2432, 2503, 2527, 2440, 2526, 2439, 2439, 2447, 2526, 2503, 2442, 2438, 2436, 1000, 1012, 1012, 1008, 1011, 954, 943, 943, 993, 1008, 1001, 1006, 997, 1015, 942, 1013, 1007, 1018, 1014, 1010, 942, 995, 1007, 1005, 3007, 2979, 2979, 2983, 2980, 3053, 3064, 3064, 2998, 2983, 3006, 3065, 2978, 3002, 2990, 2992, 2981, 2991, 3044, 3065, 2996, 3000, 3002, 2048, 2076, 2076, 2072, 2075, 2130, 2119, 2119, 2057, 2072, 2049, 2118, 2074, 2053, 2061, 2060, 2072, 2048, 2051, 2118, 2059, 2055, 2053, 561, 590, 458, 457, 462, 456, 442, 443, 435, 443, 2378, 2383, 2381, 1271, 1275, 1267, 943, 938, 940, 3309, 3304, 3206, 3227, 3215, 3307, 2259, 2262, 2252, 2251, 3039, 3014, 3021, 3062, 3008, 3021, 2510, 2519, 2524, 2535, 2518, 2521, 2517, 2525, 2652, 2629, 2638, 2677, 2650, 2627, 2633, 2908, 2889, 2927, 2937, 2926, 2865, 2909, 2939, 2937, 2930, 2920, 2849, 2904, 2941, 2928, 2922, 2933, 2935, 2867, 2862, 2866, 2861, 2866, 2860, 2882, 2907, 2896, 2923, 2887, 2903, 2886, 2907, 2897, 980, 973, 966, 1021, 961, 973, 972, 982, 971, 972, 983, 2782, 2789, 2766, 2773, 2766, 2779, 2774, 2990, -27792, 21834, 27652, 28480, -29949, 2700, 2709, 2718, 2725, 2691, 2719, 2715, 2696, 649, 743, 726, 726, 649, 743, 723, 722, 718, 707, 712, 722, 719, 709, 711, 722, 719, 713, 712, 649, 2290, 2281, 2285, 2275, 2280, 2646, 2637, 2633, 2631, 2636, 2685, 2635, 2630, 1633, 1566, 1537, 1610, 1645, 1636, 1655, 1565, 1661, 1560, 1614, 1663, 1638, 1658, 1659, 1634, 1627, 1623, 1600, 1608, 1634, 1536, 1630, 1602, 1639, 1567, 1655, 1562, 1607, 1657, 1659, 1563, 1624, 1610, 1636, 1565, 1563, 1560, 1609, 1656, 1660, 1662, 1565, 1635, 1638, 1562, 1646, 1660, 1623, 1560, 1609, 1638, 1564, 1661, 1622, 1564, 1628, 1564, 1639, 1601, 1641, 1613, 1632, 1625, 1655, 1631, 1567, 1629, 1637, 1608, 1627, 1536, 1645, 1635, 1562, 1622, 1608, 1624, 1536, 1558, 1563, 1610, 1625, 1656, 1637, 1564, 1606, 1562, 1623, 1536, 1560, 1635, 1621, 1566, 1633, 1562, 1629, 1626, 1608, 1561, 1645, 1561, 1624, 1644, 1633, 1626, 1628, 1641, 1602, 1634, 1554, 1061, 1114, 1093, 1092, 1106, 1069, 1039, 1080, 1118, 1071, 1030, 1082, 1083, 1053, 1034, 1025, 1026, 1086, 1112, 1063, 1034, 1118, 1062, 1114, 1063, 1114, 1051, 1041, 1037, 1060, 1025, 1050, 1059, 1086, 1118, 1062, 1088, 1088, 1050, 1048, 1081, 1031, 1115, 1033, 1074, 1043, 1036, 1080, 1113, 1083, 1107, 1032, 1085, 1061, 1074, 1117, 1030, 1075, 1080, 1080, 1050, 1061, 1106, 1059, 1114, 1074, 1086, 1052, 1034, 1036, 1030, 1058, 1106, 1107, 1117, 1036, 1082, 1116, 1053, 1052, 1059, 1081, 1050, 1069, 1031, 1048, 1025, 1085, 1059, 1092, 1075, 1039, 1113, 1117, 1085, 1025, 1086, 1066, 1114, 1062, 1028, 1052, 1085, 1024, 1030, 1118, 1058, 1036, 1081, 1119, 1110, 2783, 2779, 2765, 2948, 2944, 2966, 3050, 2950, 2951, 2950, 3050, 2965, 2958, 2950, 2966, 3056, 2965, 2980, 2977, 2977, 2988, 2987, 2978, 2064, 2121, 2050, 2077, 
    2121, 2129, 2121, 1968, 1982, 1968, 2041, 2039, 2027, 1968, 1960, 1968, 2824, 2903, 1822, 1818, 1812, 1845, 1822, 1810, 1891, 1812, 1808, 1792, 1826, 1812, 1792, 1818, 1841, 1888, 1815, 1794, 1814, 1809, 1810, 1794, 1798, 1810, 1810, 1895, 1812, 1821, 1810, 1815, 1808, 1809, 1850, 1794, 1816, 1809, 1844, 1794, 1815, 1798, 1822, 1894, 1912, 1916, 1834, 1899, 1824, 1795, 1824, 1796, 1848, 1847, 1890, 1916, 1793, 1794, 1792, 1893, 1895, 1803, 1889, 1894, 1898, 1814, 1798, 1828, 1835, 1813, 1803, 1813, 1814, 1894, 1819, 1855, 1810, 1893, 1894, 1822, 1826, 1825, 1835, 1853, 1795, 1824, 1891, 1817, 1826, 1852, 1792, 1793, 1852, 1849, 1792, 1815, 1834, 1894, 1794, 1851, 1828, 1829, 1793, 1820, 1855, 1842, 1815, 1893, 1799, 1828, 1793, 1794, 1819, 1816, 1822, 1802, 1889, 1820, 1810, 1801, 1893, 1792, 1853, 1794, 1846, 1798, 1817, 1824, 1808, 1851, 1799, 1814, 1813, 1818, 1793, 1898, 1826, 1798, 1848, 1828, 1825, 1824, 1888, 1916, 1822, 1797, 1798, 1822, 1835, 1849, 1824, 1829, 1893, 1817, 1792, 1893, 1820, 1846, 1916, 1849, 1830, 1840, 1855, 1834, 1817, 1812, 1799, 1844, 1797, 1854, 1815, 1851, 1809, 1894, 1894, 1814, 1842, 1845, 1803, 1824, 1815, 1891, 1792, 1794, 1802, 1797, 1849, 1916, 1794, 1803, 1803, 1824, 1835, 1793, 1893, 1846, 1828, 1793, 1894, 1814, 1889, 1848, 1823, 1894, 1889, 1834, 1810, 1810, 1815, 1895, 1834, 1794, 1818, 1815, 1810, 1794, 1810, 1809, 769, 768, 786, 424, 425, 443, 469, 447, 441, 440, 469, 426, 433, 441, 425, 459, 426, 411, 414, 414, 403, 404, 413, 2399, 2372, 2368, 2382, 2373, 2420, 2370, 2383, 2326, 2311, 2399, 2372, 2368, 2382, 2373, 2326, 1642, 1590, 1582, 1577, 1576, 1571, 1561, 1586, 1599, 1590, 1571, 1659, 1655, 1642, 1588, 1571, 1591, 1587, 1571, 1589, 1586, 1561, 1581, 1571, 1599, 1659, 1954, 2031, 2046, 2046, 2001, 2023, 2026, 1971, 1983, 1954, 2042, 2023, 2019, 2027, 1971, 1854, 1913, 1911, 1899, 1889, 1839, 2755, 2767, 2707, 2719, 2701, 2719, 2701, 2719, 2701, 2701, 2699, 2703, 2688, 2690, 2690, 2690, 2716, 2692, 2717, 2692, 2701, 2718, 2712, 2713, 2713, 2713, 2774, 2709, 2781, 2736, 2760, 2714, 2760, 2779, 2699, 2715, 954, 947, 962, 1191, 1258, 1266, 1269, 1268, 1279, 1221, 1262, 1251, 1258, 1279, 1976, 1534, 1507, 1511, 1519, 472, 448, 455, 454, 461, 503, 453, 455, 460, 461, 452, 1894, 1911, 1919, 1905, 1907, 1911, 1843, 1836, 1835, 1838, 1837, 1839, 1198, 1184, 1212, 1206, 2066, 2053, 2065, 2069, 2053, 2067, 2068, 2111, 2059, 2053, 2073, 2678, 2668, 2658, 2667, 2660, 2673, 2672, 2679, 2656, 2352, 2337, 2337, 2318, 2360, 2357, 484, 481, 474, 499, 480, 503, 502, 492, 490, 491, 3102, 3128, 3118, 3129, 3174, 3082, 3116, 3118, 3109, 3135, 1918, 1875, 1860, 1876, 1821, 1799, 1797, 1820, 1802, 1793, 1820, 1795, 1794, 1794, 2644, 2648, 2643, 2642, 665, 644, 750, 749, 744, 743, 1913, 1912, 1899, 1908, 1918, 1912, 1876, 1913, 2418, 2431, 2416, 2425, 788, 774, 817, 781, 768, 872, 842, 840, 835, 846, 774, 872, 836, 837, 863, 857, 836, 839, 632, 633, 571, 629, 631, 629, 638, 627, 1126, 1098, 1099, 1105, 1088, 1099, 1105, 1032, 1137, 1116, 1109, 1088, 1307, 1290, 1290, 1302, 1299, 1305, 1307, 1294, 1299, 1301, 1300, 1365, 1282, 1367, 1293, 1293, 1293, 1367, 1308, 1301, 1288, 1303, 1367, 1295, 1288, 1302, 1311, 1300, 1305, 1301, 1310, 1311, 1310, 951, 900, 915, 914, 904, 910, 911, 1769, 1773, 1771, 1775, 1771, 1769, 1763, 1326, 1311, 1309, 1301, 1311, 1305, 1307, 1328, 1311, 1299, 1307, 1377, 1389, 1391, 1324, 1379, 1383, 1330, 1332, 1379, 1383, 1376, 1382, 1376, 1376, 1324, 1403, 1328, 1338, 1332, 1329, 1328, 1333, 1380, 1335, 1379, 1324, 1389, 1380, 1383, 1338, 1334, 1339, 1338, 1338, 1329, 1329, 1328, 1330, 1328, 1332, 1330, 1335, 1331, 1333, 3155, 3168, 3191, 365, 368, 366, 368, 365, 368, 364, 2111, 2094, 2103, 2163, 2088, 2107, 2092, -31846, 25647, 20828, -31416, 2135, 2125, 3052, 3049, 3068, 3049, 3307, 3324, 3306, 3305, 3318, 3319, 3306, 3324, 3270, 3314, 3324, 3296, 1278, 1278, 1278, 1278, 1278, 1169, 1174, 1172, 1178, 1181, 1267, 1155, 1153, 1178, 1157, 1170, 1159, 1174, 1267, 1176, 1174, 1162, 1278, 1278, 1278, 1278, 1278, 729, 729, 729, 729, 729, 694, 689, 691, 701, 698, 724, 678, 679, 693, 724, 676, 678, 701, 674, 693, 672, 689, 724, 703, 689, 685, 729, 729, 729, 729, 729, 766, 697, 701, 701, 695, 656, 659, 701, 694, 693, 688, 693, 698, 694, 659, 671, 645, 668, 671, 669, 691, 717, 643, 708, 694, 693, 677, 689, 690, 693, 693, 679, 695, 693, 665, 693, 643, 659, 659, 702, 663, 693, 659, 689, 693, 693, 667, 691, 693, 657, 706, 668, 703, 646, 675, 696, 669, 709, 654, 677, 665, 670, 672, 672, 709, 667, 654, 662, 689, 704, 677, 656, 690, 657, 702, 691, 698, 652, 641, 662, 652, 664, 656, 706, 691, 646, 690, 691, 652, 669, 665, 652, 658, 697, 647, 697, 694, 706, 694, 644, 702, 668, 644, 663, 672, 667, 641, 693, 645, 653, 643, 693, 690, 644, 644, 669, 703, 657, 640, 673, 694, 694, 662, 684, 643, 685, 647, 685, 673, 709, 643, 698, 646, 706, 704, 716, 684, 674, 665, 676, 665, 695, 697, 695, 653, 704, 646, 685, 716, 642, 656, 664, 669, 690, 666, 662, 697, 673, 670, 708, 716, 706, 688, 673, 706, 686, 735, 731, 667, 684, 694, 656, 675, 673, 711, 731, 662, 709, 691, 708, 688, 698, 711, 689, 717, 643, 673, 696, 678, 679, 643, 663, 703, 686, 672, 711, 643, 670, 731, 663, 695, 701, 709, 642, 647, 695, 665, 711, 659, 670, 710, 678, 705, 679, 645, 671, 693, 717, 685, 708, 695, 693, 643, 689, 693, 693, 677, 703, 694, 659, 693, 702, 700, 735, 704, 695, 652, 674, 708, 731, 654, 694, 674, 663, 696, 669, 694, 695, 700, 642, 679, 693, 698, 665, 708, 664, 707, 700, 657, 640, 653, 662, 672, 668, 731, 670, 710, 644, 708, 685, 709, 647, 672, 684, 646, 667, 704, 693, 696, 643, 693, 661, 695, 
    672, 673, 657, 645, 656, 694, 670, 675, 669, 696, 679, 667, 717, 664, 698, 643, 688, 700, 690, 653, 645, 716, 654, 684, 717, 708, 735, 659, 698, 652, 661, 707, 663, 705, 689, 645, 663, 675, 674, 717, 690, 665, 664, 674, 684, 646, 716, 674, 668, 658, 694, 654, 663, 686, 667, 709, 666, 684, 657, 698, 656, 684, 690, 672, 707, 640, 677, 710, 653, 661, 668, 731, 667, 656, 640, 656, 663, 652, 735, 642, 678, 697, 679, 691, 702, 656, 709, 640, 731, 705, 671, 705, 662, 688, 656, 717, 643, 693, 642, 685, 656, 701, 688, 662, 664, 697, 693, 659, 735, 643, 669, 703, 703, 686, 705, 703, 663, 656, 693, 671, 689, 693, 709, 663, 695, 661, 671, 689, 698, 704, 698, 657, 652, 671, 690, 705, 640, 700, 676, 678, 646, 678, 706, 684, 699, 685, 731, 684, 700, 658, 671, 645, 684, 652, 689, 668, 697, 645, 665, 698, 662, 694, 717, 673, 711, 704, 647, 661, 672, 702, 666, 696, 675, 701, 700, 695, 716, 701, 684, 653, 647, 706, 677, 665, 654, 654, 711, 708, 672, 640, 654, 695, 670, 641, 699, 645, 703, 678, 678, 653, 735, 690, 697, 697, 704, 672, 656, 643, 702, 694, 693, 702, 677, 686, 690, 676, 670, 647, 691, 695, 735, 678, 645, 663, 691, 705, 673, 642, 674, 697, 669, 697, 676, 668, 666, 643, 657, 731, 662, 684, 689, 657, 668, 679, 668, 703, 716, 706, 653, 702, 703, 731, 659, 731, 673, 669, 703, 646, 699, 716, 707, 668, 711, 661, 689, 641, 705, 659, 663, 702, 645, 694, 653, 659, 672, 645, 711, 694, 694, 694, 667, 700, 710, 665, 656, 711, 644, 646, 731, 675, 735, 668, 673, 697, 675, 694, 647, 695, 677, 677, 695, 668, 658, 668, 672, 701, 646, 656, 688, 669, 666, 703, 669, 706, 664, 678, 652, 646, 656, 694, 666, 666, 708, 699, 668, 670, 659, 710, 663, 643, 641, 645, 703, 705, 654, 654, 673, 717, 644, 731, 698, 735, 679, 717, 652, 707, 695, 671, 716, 643, 673, 701, 705, 711, 688, 703, 665, 716, 670, 673, 702, 689, 716, 675, 693, 691, 707, 675, 696, 670, 731, 667, 695, 699, 675, 689, 668, 735, 669, 663, 706, 698, 701, 643, 672, 656, 693, 671, 689, 693, 670, 708, 684, 716, 666, 668, 652, 706, 693, 684, 647, 659, 695, 685, 678, 645, 664, 709, 671, 664, 662, 645, 640, 674, 665, 696, 716, 735, 717, 705, 703, 686, 703, 707, 676, 666, 696, 675, 691, 731, 701, 658, 670, 677, 673, 653, 711, 644, 676, 691, 667, 679, 661, 686, 707, 658, 656, 645, 641, 691, 716, 662, 645, 716, 667, 653, 658, 705, 735, 656, 654, 670, 689, 731, 667, 672, 684, 663, 694, 653, 679, 735, 706, 684, 678, 677, 702, 693, 676, 731, 705, 663, 669, 653, 709, 662, 696, 711, 698, 668, 673, 668, 647, 661, 699, 674, 653, 705, 705, 697, 700, 684, 666, 676, 670, 656, 663, 672, 684, 708, 690, 661, 696, 669, 735, 653, 662, 684, 686, 701, 658, 701, 677, 710, 676, 704, 646, 662, 709, 717, 665, 674, 645, 709, 658, 657, 697, 662, 695, 684, 668, 654, 735, 696, 709, 646, 691, 716, 667, 661, 640, 705, 664, 685, 703, 658, 644, 657, 716, 671, 716, 711, 686, 693, 713, 713, 766, 729, 729, 729, 729, 729, 689, 698, 688, 724, 678, 679, 693, 724, 676, 678, 701, 674, 693, 672, 689, 724, 703, 689, 685, 729, 729, 729, 729, 729, 3034, 3034, 3034, 3034, 3034, 2994, 3001, 2995, 3031, 2983, 2981, 3006, 2977, 2998, 2979, 2994, 3031, 3004, 2994, 2990, 3034, 3034, 3034, 3034, 3034, 2083, 2083, 2083, 2083, 2083, 2124, 2123, 2121, 2119, 2112, 2094, 2140, 2141, 2127, 2094, 2142, 2140, 2119, 2136, 2127, 2138, 2123, 2094, 2117, 2123, 2135, 2083, 2083, 2083, 2083, 2083, 1428, 1428, 1428, 1428, 1428, 1532, 1527, 1533, 1433, 1515, 1514, 1528, 1433, 1513, 1515, 1520, 1519, 1528, 1517, 1532, 1433, 1522, 1532, 1504, 1428, 1428, 1428, 1428, 1428, 973, 994, 2503, 2505, 2517, 1302, 1289, 29123, 24436, 21805, 573, 550, 546, 556, 551, 2917, 2932, 2932, 2907, 2929, 2935, 2913, 2934, 2907, 2925, 2912, 1223, 1276, 1272, 1270, 1277, 1203, -30940, 22341, 23970, -30282, 1193, 1203, 1291, 1289, 1308, 1293, 1295, 1287, 1306, 1297, 1323, 1287, 1286, 1308, 1293, 1286, 1308, 1506, 1507, 1522, 1511, 1519, 1514, 1477, 1513, 1512, 1522, 1507, 1512, 1522, 1257, 1159, 1206, 1206, 1257, 1159, 1203, 1202, 1198, 1187, 1192, 1202, 1199, 1189, 1191, 1202, 1199, 1193, 1192, 1257, 1159, 1203, 1202, 1198, 1187, 1192, 1202, 1199, 1189, 1191, 1202, 1193, 1204, 1257, 1204, 1187, 1184, 1204, 1187, 1205, 1198, 1179, 1152, 1156, 1162, 1153, 2863, 2868, 2864, 2878, 2869, 2820, 2866, 2879, 653, 652, 671, 640, 650, 652, 694, 640, 653, 1324, 1325, 1342, 1313, 1323, 1325, 1303, 1315, 1325, 1329, 2875, 2860, 2862, 2848, 2874, 2877, 2860, 2875, 2860, 2861, 1282, 1285, 1287, 1295, 1321, 1285, 1284, 1310, 1295, 1284, 1310, 3064, 3071, 3069, 3061, 3014, 3065, 3060, 3061, 3071, 3027, 3071, 3070, 3044, 3061, 3070, 3044, 2812, 2807, 2789, 2765, 2809, 2807, 2795, 2987, 2984, 2976, 2971, 2991, 2977, 3005, 2745, 2708, 2718, 2714, 2709, 2703, 2728, 2720, 2714, 2730, 2705, 2716, 2713, 2716, 2793, 2699, 2737, 2807, 2707, 2702, 2734, 2741, 2796, 2793, 2478, 2496, 2545, 2545, 2478, 2496, 2548, 2549, 2537, 2532, 2543, 2549, 2536, 2530, 2528, 2549, 2536, 2542, 2543, 2478, 2501, 2532, 2551, 2536, 2530, 2532, 2478, 2546, 2536, 2534, 2543, 2504, 2543, 1242, 1189, 1210, 1265, 1238, 1247, 1228, 1190, 1222, 1187, 1269, 1220, 1245, 1217, 1216, 1241, 1248, 1260, 1275, 1267, 1241, 1211, 1253, 1273, 1244, 1188, 1228, 1185, 1276, 1218, 1216, 1184, 1251, 1265, 1247, 1190, 1184, 1187, 1266, 1219, 1223, 1221, 1190, 1240, 1245, 1185, 1237, 1223, 1260, 1187, 1266, 1245, 1191, 1222, 1261, 1191, 1255, 1191, 1244, 1274, 1234, 1270, 1243, 1250, 1228, 1252, 1188, 1254, 1246, 1267, 1248, 1211, 
    1238, 1240, 1185, 1261, 1267, 1251, 1211, 1197, 1184, 1265, 1250, 1219, 1246, 1191, 1277, 1185, 1260, 1211, 1187, 1240, 1262, 1189, 1242, 1185, 1254, 1249, 1267, 1186, 1238, 1186, 1251, 1239, 1242, 1249, 1255, 1234, 1273, 1241, 1193, 1209, 1222, 1241, 1240, 1230, 1201, 1171, 1188, 1218, 1203, 1178, 1190, 1191, 1153, 1174, 1181, 1182, 1186, 1220, 1211, 1174, 1218, 1210, 1222, 1211, 1222, 1159, 1165, 1169, 1208, 1181, 1158, 1215, 1186, 1218, 1210, 1244, 1244, 1158, 1156, 1189, 1179, 1223, 1173, 1198, 1167, 1168, 1188, 1221, 1191, 1231, 1172, 1185, 1209, 1198, 1217, 1178, 1199, 1188, 1188, 1158, 1209, 1230, 1215, 1222, 1198, 1186, 1152, 1174, 1168, 1178, 1214, 1230, 1231, 1217, 1168, 1190, 1216, 1153, 1152, 1215, 1189, 1158, 1201, 1179, 1156, 1181, 1185, 1215, 1240, 1199, 1171, 1221, 1217, 1185, 1181, 1186, 1206, 1222, 1210, 1176, 1152, 1185, 1180, 1178, 1218, 1214, 1168, 1189, 1219, 1226, 1241, 1279, 1257, 1278, 1185, 1229, 1259, 1257, 1250, 1272, 2599, 2565, 2576, 2563, 2566, 2566, 2571, 2629, 2655, 2628, 2650, 2634, 2626, 2621, 2563, 2564, 2574, 2565, 2589, 2585, 2634, 2596, 2622, 2634, 2651, 2650, 2628, 2650, 2641, 2634, 2621, 2563, 2564, 2652, 2654, 2641, 2634, 2578, 2652, 2654, 2627, 2634, 2603, 2586, 2586, 2566, 2575, 2621, 2575, 2568, 2593, 2563, 2590, 2629, 2655, 2649, 2653, 2628, 2649, 2652, 2060, 2078, 2058, 2065, 2050, 2100, 2058, 2078, 2079, 2051, 2461, 2438, 2434, 2444, 2439, 1902, 1909, 1905, 1919, 1908, 1861, 1907, 1918, 576, 577, 594, 589, 583, 577, 635, 589, 576, 1512, 1513, 1530, 1509, 1519, 1513, 1491, 1511, 1513, 1525, 583, 592, 594, 604, 582, 577, 592, 583, 592, 593, 1879, 2361, 776, 779, 1888, 3014, 3013, 750, 465, 465, 2528, 755, 753, 1565, 1558, 1540, 1580, 1560, 1558, 1546, 664, 667, 659, 680, 668, 658, 654, 2687, 2642, 2648, 2652, 2643, 2633, 2670, 2662, 2652, 2668, 2647, 2650, 2655, 2650, 2607, 2637, 2679, 2609, 2645, 2632, 2664, 2675, 2602, 2607, 1160, 1168, 1175, 1174, 1181, 1191, 1164, 1153, 1160, 1181, 2321, 2333, 2326, 2327, 799, 881, 832, 832, 799, 881, 837, 836, 856, 853, 862, 836, 857, 851, 849, 836, 857, 863, 862, 799, 884, 853, 838, 857, 851, 853, 799, 835, 857, 855, 862, 869, 832, 770, 798, 787, 779, 791, 768, 817, 797, 796, 774, 791, 796, 774, 2126, 2136, 2140, 2127, 2142, 2133, 2174, 2130, 2131, 2121, 2136, 2131, 2121, 1066, 1084, 1080, 1067, 1082, 1073, 1050, 1078, 1079, 1069, 1084, 1079, 1069};
    public static final String[] i = {"https://apinew.uozvr.com", "https://api.w32z7vtd.com", "https://api.6a7nnf7.com", "https://api.umygrx3.com", "https://api.rmedphk.com"};
    public static final SecureRandom j = new SecureRandom();
    public static final HashMap k = new HashMap();

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("1", "电影", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("2", "国产剧", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("4", "动漫", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("64", "短剧", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("3", "综艺", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("5", "海外剧", null));
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.a(arrayList);
        return gVar.r();
    }

    private /* synthetic */ String $host$4a0a5542814a3609() throws Exception {
        HashMap map = new HashMap();
        map.put("pid", "1");
        JsonObject jsonObjectB = b(0, "/App/IndexList/index", map);
        String strM75 = "list";
        JsonArray asJsonArray = jsonObjectB.has(strM75) ? jsonObjectB.getAsJsonArray(strM75) : null;
        ArrayList arrayList = new ArrayList();
        if (asJsonArray != null) {
            if (asJsonArray.size() > 1) {
                for (int i2 = 1; i2 < asJsonArray.size(); i2++) {
                    arrayList.addAll(g(asJsonArray.get(i2).getAsJsonObject()));
                }
            }
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return com.github.catvod.spider.merge.p001b.g.y(g(b(0, "/App/Index/findMoreVod", com.github.catvod.spider.merge.D.b.t("keywords", str, "order_val", "1"))));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws Exception {
        String str3 = str;
        String strI = AbstractC0280n1.i(str3, str2, null, null);
        String[] strArrSplit = str2.split("\\|\\|");
        String[] strArrSplit2 = strArrSplit[0].split("&");
        if (strArrSplit.length > 1) {
            str3 = strArrSplit[1];
        }
        HashMap map = new HashMap();
        for (String str4 : strArrSplit2) {
            String[] strArrSplit3 = str4.split("=");
            if (strArrSplit3.length == 2) {
                map.put(strArrSplit3[0].equals("vod_d_id") ? "vod_id" : strArrSplit3[0], strArrSplit3[1]);
            }
        }
        map.put("resolution", str3);
        JsonObject jsonObjectB = b(0, "/App/Resource/VurlDetail/showOne", map);
        String strM301 = "url";
        String asString = jsonObjectB.has(strM301) ? jsonObjectB.get(strM301).getAsString() : "";
        HashMap mapT = com.github.catvod.spider.merge.D.b.t("User-Agent", "Lavf/57.83.100", "Referer", "http://WJiZxLXA2.com/");
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(asString);
        gVar.h(mapT);
        gVar.b(strI);
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Exception {
        e();
        String str = list.get(0);
        HashMap map = new HashMap();
        map.put("token_id", this.d);
        map.put("vod_id", str);
        map.put("mobile_time", String.valueOf(System.currentTimeMillis() / 1000));
        map.put("token", this.c);
        HashMap map2 = new HashMap();
        map2.put("vurl_cloud_id", "2");
        map2.put("vod_d_id", str);
        JsonObject jsonObjectB = b(0, "/App/IndexPlay/playInfo", map);
        JsonObject jsonObjectB2 = b(0, "/App/Resource/Vurl/show", map2);
        JsonObject asJsonObject = jsonObjectB.getAsJsonObject("vodInfo");
        k kVarA = AbstractC0449a.a(str);
        String strM346 = "vod_name";
        kVarA.o(f(asJsonObject, strM346));
        kVarA.p(f(asJsonObject, "vod_pic") + "@User-Agent=Dalvik/2.1.0");
        kVarA.u(f(asJsonObject, "vod_year"));
        kVarA.k(f(asJsonObject, "vod_area"));
        kVarA.j(f(asJsonObject, "vod_actor"));
        kVarA.m(f(asJsonObject, "vod_director"));
        kVarA.l(f(asJsonObject, "vod_use_content").replace("　", "\n").trim());
        HashMap map3 = new HashMap();
        ArrayList<String> arrayList = new ArrayList();
        String strM459 = "list";
        if (jsonObjectB2.has(strM459) && jsonObjectB2.get(strM459).isJsonArray()) {
            JsonArray asJsonArray = jsonObjectB2.getAsJsonArray(strM459);
            for (int i2 = 0; i2 < asJsonArray.size(); i2++) {
                JsonObject asJsonObject2 = asJsonArray.get(i2).getAsJsonObject().getAsJsonObject("play");
                String strF = asJsonArray.size() == 1 ? f(asJsonObject, strM346) : String.valueOf(i2 + 1);
                for (Map.Entry entry : asJsonObject2.entrySet()) {
                    String str2 = (String) entry.getKey();
                    JsonObject asJsonObject3 = ((JsonElement) entry.getValue()).getAsJsonObject();
                    String strM54 = "param";
                    if (asJsonObject3.has(strM54) && !asJsonObject3.get(strM54).isJsonNull()) {
                        String strF2 = f(asJsonObject3, strM54);
                        if (!strF2.isEmpty()) {
                            if (!map3.containsKey(str2)) {
                                map3.put(str2, new ArrayList());
                                arrayList.add(str2);
                            }
                            ((List) map3.get(str2)).add(strF + "$" + strF2 + "||" + str2);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator<String>() { // from class: com.github.catvod.spider.Guazi.1
            @Override // java.util.Comparator
            public int compare(String str3, String str4) {
                Guazi guazi = Guazi.this;
                return Guazi.a(guazi, str4) - Guazi.a(guazi, str3);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str3 : arrayList) {
            arrayList2.add(str3);
            arrayList3.add(TextUtils.join("#", (Iterable) map3.get(str3)));
        }
        String strM21 = "$$$";
        String strJoin = TextUtils.join(strM21, arrayList3);
        kVarA.q(TextUtils.join(strM21, arrayList2));
        kVarA.r(strJoin);
        AbstractC0280n1.p(f(asJsonObject, strM346));
        AbstractC0280n1.q(strJoin);
        boolean z = FishCrypto.a;
        N1.d(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        Object obj;
        HashMap mapT = com.github.catvod.spider.merge.D.b.t("tid", str, "page", str2);
        mapT.put("pageSize", "30");
        String strM454 = "area";
        boolean zContainsKey = map.containsKey(strM454);
        String strM471 = "0";
        mapT.put(strM454, zContainsKey ? map.get(strM454) : strM471);
        String strM516 = "year";
        mapT.put(strM516, map.containsKey(strM516) ? map.get(strM516) : strM471);
        String strM422 = "sort";
        mapT.put(strM422, map.containsKey(strM422) ? map.get(strM422) : "d_id");
        String strM517 = "sub";
        if (!map.containsKey(strM517)) {
            HashMap map2 = k;
            if (map2.containsKey(str)) {
                obj = map2.get(str);
            }
            mapT.put(strM517, strM471);
            return com.github.catvod.spider.merge.p001b.g.y(g(b(0, "/App/IndexList/indexList", mapT)));
        }
        obj = map.get(strM517);
        strM471 = (String) obj;
        mapT.put(strM517, strM471);
        return com.github.catvod.spider.merge.p001b.g.y(g(b(0, "/App/IndexList/indexList", mapT)));
    }

    public static int a(Guazi guazi, String str) {
        guazi.getClass();
        if (str == null) {
            return 0;
        }
        String upperCase = str.toUpperCase();
        if (upperCase.contains("4K") || upperCase.contains("2160")) {
            return 2160;
        }
        if (upperCase.contains("1080")) {
            return 1080;
        }
        if (upperCase.contains("720")) {
            return 720;
        }
        if (upperCase.contains("480")) {
            return 480;
        }
        if (upperCase.contains("360")) {
            return 360;
        }
        try {
            return Integer.parseInt(upperCase.replaceAll("[^0-9]", ""));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String f(JsonObject jsonObject, String str) {
        return (jsonObject == null || !jsonObject.has(str) || jsonObject.get(str).isJsonNull()) ? "" : jsonObject.get(str).getAsString();
    }

    public static ArrayList g(JsonObject jsonObject) {
        ArrayList arrayList = new ArrayList();
        String strM503 = "list";
        if (!jsonObject.has(strM503)) {
            return arrayList;
        }
        Iterator it = jsonObject.getAsJsonArray(strM503).iterator();
        while (it.hasNext()) {
            JsonObject asJsonObject = ((JsonElement) it.next()).getAsJsonObject();
            k kVar = new k();
            kVar.n(f(asJsonObject, "vod_id"));
            kVar.o(f(asJsonObject, "vod_name"));
            kVar.p(f(asJsonObject, "vod_pic") + "@User-Agent=Dalvik/2.1.0");
            kVar.s(f(asJsonObject, "vod_scroe"));
            String strM33 = "vod_continu";
            if (asJsonObject.has(strM33)) {
                String strF = f(asJsonObject, strM33);
                String strF2 = f(asJsonObject, "d_total");
                String strM116 = "0";
                if (strM116.equals(strF2) || strM116.equals(strF)) {
                    kVar.s(f(asJsonObject, "vod_year"));
                } else {
                    boolean zEquals = strF.equals(strF2);
                    String strM414 = "集";
                    if (zEquals) {
                        kVar.s("全" + strF2 + strM414);
                    } else {
                        kVar.s("更新至" + strF + strM414);
                    }
                }
            }
            arrayList.add(kVar);
        }
        return arrayList;
    }

    public final JsonObject b(int i2, String str, HashMap map) throws Exception {
        String upperCase;
        if (TextUtils.isEmpty(this.a)) {
            return new JsonObject();
        }
        boolean zStartsWith = str.startsWith("/App/Authentication/");
        if (!zStartsWith) {
            e();
        }
        HashMap map2 = new HashMap();
        map2.putAll(map);
        String strM108 = "token";
        if (map2.containsKey(strM108)) {
            map2.put(strM108, this.c);
        }
        String strM10 = "token_id";
        if (map2.containsKey(strM10)) {
            map2.put(strM10, this.d);
        }
        String strD = I0.d(map2);
        String strV = FishCrypto.v("N1.eBKX2R7aPIUTMtxogM/qmH0X5hVT4weK247fWSQ2LI5ASx7fI3Ry3s3HnFbOvXp0rJgt/BL5ygw/94evWJ3i5x/7Lz1N5rug6B6wCNusFmM=");
        String strV2 = FishCrypto.v("N1./9FdS5DmQPvajiU3La5M1L1pzfOjqHU5M++qsRl0bYxgS2P8cVNY6mXSSqN9H1YUwagmI986gQ7vwHRqFlsjVH/Xd26VjUA1MowVkm5IgR4=");
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = strD.getBytes(charset);
        byte[] bytes2 = strV.getBytes();
        byte[] bytes3 = strV2.getBytes();
        String strM558 = "AES";
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes2, strM558);
        String strM463 = "AES/CBC/PKCS5Padding";
        Cipher cipher = Cipher.getInstance(strM463);
        cipher.init(1, secretKeySpec, new IvParameterSpec(bytes3));
        String upperCase2 = d(cipher.doFinal(bytes)).toUpperCase();
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String str2 = "{\"iv\":\"" + strV2 + "\",\"key\":\"" + strV + "\"}";
        byte[] bArrDecode = Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDUM5+/y8sPsWkd1/RQS64X259EUwxFXFE5HlA65MqrxnPs0JqoSRojSDy5QhwvROlaD6TwRQHKMY2OAZ6SnQeUJsChTEFIR9qUkwrs3/MVUMxjsv6JS6Oe/juclyJGTgVmDhB55EafXsD0SQYVj/QXXsxR6ewR5E2kL52yAAD4yQIDAQAB", 2);
        String strM408 = "RSA";
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(strM408).generatePublic(new X509EncodedKeySpec(bArrDecode));
        String strM379 = "RSA/ECB/PKCS1Padding";
        Cipher cipher2 = Cipher.getInstance(strM379);
        cipher2.init(1, publicKeyGeneratePublic);
        String strEncodeToString = Base64.encodeToString(cipher2.doFinal(str2.getBytes(charset)), 2);
        StringBuilder sb = new StringBuilder("token_id=,token=");
        com.github.catvod.spider.merge.D.b.A(sb, this.c, ",phone_type=1,request_key=", upperCase2, ",app_id=1,time=");
        sb.append(strValueOf);
        sb.append(",keys=");
        sb.append(strEncodeToString);
        sb.append("*&zvdvdvddbfikkkumtmdwqppp?|4Y!s!2br");
        try {
            StringBuilder sb2 = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest(sb.toString().getBytes(charset))).toString(16));
            while (sb2.length() < 32) {
                sb2.insert(0, "0");
            }
            upperCase = sb2.toString().toUpperCase();
        } catch (Exception unused) {
            upperCase = "";
        }
        FormBody.Builder builder = new FormBody.Builder();
        builder.add(strM108, this.c);
        builder.add(strM10, "");
        String strM21 = "phone_type";
        String strM386 = "1";
        builder.add(strM21, strM386);
        builder.add("time", strValueOf);
        builder.add("phone_model", "xiaomi-25031");
        String strM42 = "keys";
        builder.add(strM42, strEncodeToString);
        builder.add("request_key", upperCase2);
        builder.add("signature", upperCase);
        builder.add("app_id", strM386);
        builder.add("ad_version", strM386);
        Request.Builder builderPost = new Request.Builder().url(this.a + str).post(builder.build());
        String strM199 = "User-Agent";
        String strM529 = "Lavf/57.83.100";
        String strM360 = "code";
        HashMap mapT = com.github.catvod.spider.merge.D.b.t(strM199, strM529, strM360, "GZ0369");
        mapT.put("deviceId", this.e);
        mapT.put("lang", "zh_cn");
        mapT.put("Cache-Control", "no-cache");
        mapT.put("Content-Type", "application/x-www-form-urlencoded");
        mapT.put("Version", "2604028");
        mapT.put("PackageName", "com.ae06aebdbb.y286327f5a.ofe849883320260517");
        String strM445 = "Ver";
        String strM277 = "3.0.3.2";
        mapT.put(strM445, strM277);
        mapT.put("api-ver", strM277);
        for (Map.Entry entry : mapT.entrySet()) {
            builderPost.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        Response responseI = X1.I(builderPost.build());
        String strString = responseI.body() != null ? responseI.body().string() : "";
        if (strString.isEmpty()) {
            throw new Exception("空响应");
        }
        JsonObject asJsonObject = JsonParser.parseString(strString).getAsJsonObject();
        if (asJsonObject.has(strM360) && asJsonObject.get(strM360).getAsInt() != 200) {
            if (i2 >= 1 || zStartsWith) {
                throw new Exception("请求失败: " + asJsonObject);
            }
            this.h = false;
            e();
            return b(i2 + 1, str, map);
        }
        JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("data");
        String strF = f(asJsonObject2, "response_key");
        String strF2 = f(asJsonObject2, strM42);
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance(strM408).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode("-----BEGIN RSA PRIVATE KEY-----\nMIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGAe6hKrWLi1zQmjTT1ozbE4QdFeJGNxubxld6GrFGximxfMsMB6BpJhpcTouAqywAFppiKetUBBbXwYsYU1wNr648XVmPmCMCy4rY8vdliFnbMUj086DU6Z+/oXBdWU3/b1G0DN3E9wULRSwcKZT3wj/cCI1vsCm3gj2R5SqkA9Y0CAwEAAQKBgAJH+4CxV0/zBVcLiBCHvSANm0l7HetybTh/j2p0Y1sTXro4ALwAaCTUeqdBjWiLSo9lNwDHFyq8zX90+gNxa7c5EqcWV9FmlVXr8VhfBzcZo1nXeNdXFT7tQ2yah/odtdcx+vRMSGJd1t/5k5bDd9wAvYdIDblMAg+wiKKZ5KcdAkEA1cCakEN4NexkF5tHPRrR6XOY/XHfkqXxEhMqmNbB9U34saTJnLWIHC8IXys6Qmzz30TtzCjuOqKRRy+FMM4TdwJBAJQZFPjsGC+RqcG5UvVMiMPhnwe/bXEehShK86yJK/g/UiKrO87h3aEu5gcJqBygTq3BBBoH2md3pr/W+hUMWBsCQQChfhTIrdDinKi6lRxrdBnn0Ohjg2cwuqK5zzU9p/N+S9x7Ck8wUI53DKm8jUJE8WAG7WLj/oCOWEh+ic6NIwTdAkEAj0X8nhx6AXsgCYRql1klbqtVmL8+95KZK7PnLWG/IfjQUy3pPGoSaZ7fdquG8bq8oyf5+dzjE/oTXcByS+6XRQJAP/5ciy1bL3NhUhsaOVy55MHXnPjdcTX0FaLi+ybXZIfIQ2P4rb19mVq1feMbCXhz+L1rG8oat5lYKfpe8k83ZA==\n-----END RSA PRIVATE KEY-----".replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "").replace("-----BEGIN RSA PRIVATE KEY-----", "").replace("-----END RSA PRIVATE KEY-----", "").replaceAll("\\s", ""), 2)));
        Cipher cipher3 = Cipher.getInstance(strM379);
        cipher3.init(2, privateKeyGeneratePrivate);
        JsonObject asJsonObject3 = JsonParser.parseString(new String(cipher3.doFinal(Base64.decode(strF2, 2)), StandardCharsets.UTF_8)).getAsJsonObject();
        int length = strF.length();
        byte[] bArr = new byte[length / 2];
        for (int i3 = 0; i3 < length; i3 += 2) {
            bArr[i3 / 2] = (byte) (Character.digit(strF.charAt(i3 + 1), 16) + (Character.digit(strF.charAt(i3), 16) << 4));
        }
        String strF3 = f(asJsonObject3, "key");
        Charset charset2 = StandardCharsets.UTF_8;
        byte[] bytes4 = strF3.getBytes(charset2);
        byte[] bytes5 = f(asJsonObject3, "iv").getBytes(charset2);
        SecretKeySpec secretKeySpec2 = new SecretKeySpec(bytes4, strM558);
        Cipher cipher4 = Cipher.getInstance(strM463);
        cipher4.init(2, secretKeySpec2, new IvParameterSpec(bytes5));
        return JsonParser.parseString(new String(cipher4.doFinal(bArr), charset2)).getAsJsonObject();
    }

    public final void c(JsonObject jsonObject) throws Exception {
        String strF = f(jsonObject, "token");
        if (TextUtils.isEmpty(strF)) {
            throw new Exception("Token 获取失败: " + jsonObject);
        }
        this.c = strF;
        String strF2 = f(jsonObject, "app_user_id");
        if (!TextUtils.isEmpty(strF2)) {
            this.d = strF2;
        }
        h();
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

    public final synchronized void e() {
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        if (!this.h || TextUtils.isEmpty(this.c)) {
            if (TextUtils.isEmpty(this.c)) {
                if (this.g) {
                    i();
                } else {
                    j();
                }
            }
            try {
                c(b(0, "/App/Authentication/Authenticator/refresh", new HashMap()));
            } catch (Exception e) {
                if (!this.g) {
                    throw e;
                }
                i();
            }
            this.h = true;
        }
    }

    public final void h() {
        this.b.edit().putString("token", this.c).putString("token_id", this.d).putString("device_id", this.e).putString("device_key", this.f).putBoolean("registered", this.g).apply();
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

    public final void i() throws Exception {
        HashMap map = new HashMap();
        map.put("new_key", this.f);
        map.put("old_key", "aLFBMWpxBrIDAD1Si/KVvm41");
        c(b(0, "/App/Authentication/Device/signIn", map));
    }

    public void init(Context context, String str) {
        String str2;
        Init.init(context);
        if (!TextUtils.isEmpty(FishCrypto.v("N1.eBKX2R7aPIUTMtxogM/qmH0X5hVT4weK247fWSQ2LI5ASx7fI3Ry3s3HnFbOvXp0rJgt/BL5ygw/94evWJ3i5x/7Lz1N5rug6B6wCNusFmM=")) && !TextUtils.isEmpty(FishCrypto.v("N1./9FdS5DmQPvajiU3La5M1L1pzfOjqHU5M++qsRl0bYxgS2P8cVNY6mXSSqN9H1YUwagmI986gQ7vwHRqFlsjVH/Xd26VjUA1MowVkm5IgR4="))) {
            HashMap mapS = com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient okHttpClientBuild = builder.connectTimeout(3L, timeUnit).readTimeout(3L, timeUnit).writeTimeout(3L, timeUnit).hostnameVerifier(new com.github.catvod.spider.merge.p016t.a(2)).sslSocketFactory(new com.github.catvod.spider.merge.p016t.e(), com.github.catvod.spider.merge.p016t.e.d).build();
            String[] strArr = i;
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    str2 = strArr[0];
                    break;
                }
                str2 = strArr[i2];
                try {
                    Response responseExecute = okHttpClientBuild.newCall(new Request.Builder().url(str2).head().headers(Headers.of(mapS)).build()).execute();
                    int iCode = responseExecute.code();
                    responseExecute.close();
                    if (iCode >= 200 && iCode < 300) {
                        break;
                    } else {
                        i2++;
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            str2 = "";
        }
        this.a = str2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("guazi_auth", 0);
        this.b = sharedPreferences;
        this.c = sharedPreferences.getString("token", "");
        this.d = this.b.getString("token_id", "");
        this.e = this.b.getString("device_id", "");
        this.f = this.b.getString("device_key", "");
        this.g = this.b.getBoolean("registered", !TextUtils.isEmpty(this.c));
        this.h = false;
        if (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f)) {
            SecureRandom secureRandom = j;
            this.e = String.valueOf(((long) secureRandom.nextInt(10000)) + 864150060000000L);
            byte[] bArr = new byte[20];
            secureRandom.nextBytes(bArr);
            this.f = d(bArr).toUpperCase();
            this.c = "";
            this.d = "";
            this.g = false;
            h();
        }
        if (!TextUtils.isEmpty(this.a)) {
            try {
                e();
            } catch (Exception unused2) {
            }
        }
        HashMap map = k;
        map.put("1", "5");
        map.put("2", "12");
        map.put("3", "30");
        map.put("4", "22");
        map.put("64", "");
    }

    public final void j() throws Exception {
        HashMap map = new HashMap();
        map.put("new_key", this.f);
        map.put("old_key", "aLFBMWpxBrIDAD1Si/KVvm41");
        map.put("phone_type", 1);
        map.put("code", "");
        c(b(0, "/App/Authentication/Device/signUp", map));
        this.g = true;
        h();
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

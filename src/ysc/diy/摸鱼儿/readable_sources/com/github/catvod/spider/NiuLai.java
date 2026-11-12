package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0294s1;
import com.github.catvod.spider.merge.A.X0;
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
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class NiuLai extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f72short = {1988, 1211, 1212, 1214, 1206, 2714, 2709, 2704, 2696, 2713, 2702, 2250, 2269, 2258, 642, 653, 640, 658, 658, 644, 658, 2487, 2490, 1919, 1904, 1916, 1908, 2703, 2698, 2704, 2711, 2364, 2355, 2358, 2350, 2367, 2344, 2345, 741, 747, 759, 761, 737, 764, 746, 1482, 1499, 1501, 1503, 1973, 1954, 1965, 2674, 2660, 2656, 2675, 2658, 2665, 2400, 2428, 2417, 2409, 2421, 2402, 2116, 2115, 2116, 2137, 2030, 2034, 2047, 2023, 2044, 2047, 2045, 2037, 2017, 2026, 2039, 2035, 2043, 2033, 2027, 2026, 1716, 1726, 1715, 1717, 973, 970, 980, 761, 764, 763, 752, 3308, 3313, 3308, 3316, 3325, 436, 429, 422, 428, 419, 431, 423, 589, 602, 597, 2727, 2734, 2739, 2722, 2724, 2718, 2738, 2724, 2738, 2738, 2728, 2734, 2735, 3162, 3154, 3155, 3166, 3158, 998, 1018, 992, 999, 1014, 1008, 1002, 1008, 1005, 997, 1020, 999, 1008, 1009, 3195, 3128, 3174, 3104, 3181, 2873, 2846, 2818, 2875, 2838, 2846, 2903, 2823, 2843, 2838, 2830, 2837, 2838, 2836, 2844, 2903, 2836, 2838, 2841, 2835, 2846, 2835, 2838, 2819, 2834, 2820, 2903, 2834, 2842, 2823, 2819, 2830, 28226, 28625, 21470, -30774, -2589, -32488, 27914, 32228, 26943, 29653, 819, 818, 803, 822, 830, 827, 1950, 1939, 760, 751, 736, 2088, 2101, 2104, 702, 687, 681, 683, 1617, 1612, 1600, 1617, 1626, 1616, 1643, 1660, 1651, 502, 500, 481, 496, 498, 506, 487, 492, 2451, 2484, 2472, 2449, 2492, 2484, 2557, 2479, 2488, 2478, 2477, 2482, 2483, 2478, 2488, 2557, 2473, 2482, 2482, 2557, 2481, 2492, 2479, 2490, 2488, 2587, 2574, 2572, 2630, 3155, 2713, 2560, 1879, 28077, 27710, 467, 461, 468, 470, 410, 2640, 1725, 995, 1016, 1009, 925, 898, 901, 902, 1940, 1939, 1926, 1939, 1922, 1976, 1860, 1873, 1875, 1817, 1208, 655, 642, 643, 648, 658, 655, 658, 671, 697, 656, 643, 660, 661, 655, 649, 648, 1539, 1537, 1564, 1557, 1562, 1567, 1558, 1551, 1337, 1324, 1313, 1312, 1323, 1329, 1324, 1329, 1340, 1306, 1331, 1312, 1335, 1334, 1324, 1322, 1323, 2659, 2670, 2671, 2660, 2686, 2659, 2686, 2675, 2645, 2662, 2661, 2669, 2659, 2660, 2645, 2686, 2675, 2682, 2671, 1742, 1730, 1731, 1739, 1732, 1738, 1778, 1739, 1732, 1731, 1738, 1736, 1759, 1757, 1759, 1732, 1731, 1753, 509, 492, 492, 451, 501, 504, 689, 678, 693, 686, 678, 681, 691, 2158, 2156, 2156, 2144, 2170, 2145, 2171, 2437, 2441, 2443, 2432, 2433, 2438, 2445, 2487, 2433, 2444, 2066, 2079, 2078, 2069, 2063, 2066, 2063, 2050, 2084, 2061, 2074, 2057, 2066, 2074, 2069, 2063, 2080, 2093, 2092, 2087, 2109, 2080, 2109, 2096, 2070, 2088, 2105, 2105, 2070, 2080, 2093, 547, 515, 3198, 3196, 3169, 3176, 3175, 3170, 3179, 2699, 2704, 2713, 2805, 2794, 2797, 2798, 1368, 1357, 1359, 1285, 2943, 2940, 2926, 2936, 2882, 2928, 2940, 2942, 2933, 2932, 2931, 2936, 2882, 2932, 2937, 1705, 1720, 1706, 1706, 1710, 1718, 1707, 1725, 1233, 1234, 1242, 1236, 1235, 1250, 1225, 1220, 1229, 1240, 1395, 1384, 1388, 1378, 1385, 1839, 1826, 1827, 1832, 1842, 1839, 1842, 1855, 1817, 1825, 1827, 1832, 1827, 1844, 1831, 1842, 1839, 1833, 1832, 1463, 1440, 1451, 1440, 1458, 1444, 1449, 1434, 1463, 1440, 1457, 1463, 1468, 1434, 1444, 1443, 1457, 1440, 1463, 445, 426, 424, 422, 444, 443, 445, 430, 443, 422, 416, 417, 400, 445, 426, 443, 445, 438, 400, 430, 425, 443, 426, 445, 955, 932, 957, 3111, 3105, 3130, 3122, 3135, 3084, 3104, 3111, 3122, 3111, 3126, 2966, 2960, 2955, 2947, 2958, 3005, 2961, 2966, 2947, 2960, 2966, 2951, 2950, 3005, 2947, 2966, 2433, 2435, 2435, 2437, 2451, 2451, 2495, 2447, 2434, 2451, 2437, 2450, 2454, 2437, 2436, 1568, 3135, 3119, 3108, 3113, 3105, 3117, 3043, 3041, 3054, 3044, 3049, 3044, 3041, 3060, 3045, 3059, 1838, 1855, 1826, 1838, 1909, 1842, 1838, 1847, 1846, 817, 800, 800, 828, 825, 819, 817, 804, 825, 831, 830, 895, 826, 803, 831, 830, 2011, 1994, 1994, 2006, 2003, 2009, 2011, 1998, 2003, 2005, 2004, 1941, 1986, 2007, 2006, 1989, 1937, 1933, 1940, 1941, 1984, 2013, 1944, 1939, 1951, 1928, 1925, 1932, 1945, 486, 447, 424, 424, 437, 424, 1010, 939, 1002, 998, 1005, 1004, 939, 2972, 2973, 2945, 2951, 2961, 2970, 2969, 2967, 2955, 805, 870, 824, 894, 819, 1362, 1359, 1370, 1368, 1354, 1357, 1363, 1257, 1194, 1207, 1267, 1511, 1528, 1525, 1524, 1534, 1470, 2386, 2324, 2313, 2309, 2332, 2370, 2308, 2659, 2674, 2676, 2678, 2487, 2482, 2486, 2482, 2479, 1598, 1573, 1598, 1579, 1574, 870, 887, 881, 883, 885, 889, 867, 888, 866, 2727, 2722, 2744, 2751, 2133, 2135, 2113, 2125, 2142, 2125, 2139, 2131, 2129, 2134, 2143, 1527, 1416, 1431, 1419, 1516, 1430, 1480, 1484, 1495, 1484, 1473, 1517, 1514, 1481, 1482, 1505, 1530, 1484, 1513, 1487, 1423, 1518, 1505, 1496, 1423, 1430, 1530, 1489, 1524, 1513, 1496, 1421, 1483, 1489, 1485, 1419, 1505, 1516, 1535, 1496, 1502, 1483, 1517, 1475, 1519, 1482, 1520, 1514, 1499, 1423, 1504, 1534, 1523, 1484, 1526, 1498, 1423, 1514, 1489, 1486, 1481, 1516, 1418, 1421, 1518, 1533, 1499, 1416, 1501, 1512, 1482, 1482, 1503, 1417, 1503, 1515, 1531, 1527, 1473, 1419, 1507, 1519, 1485, 1489, 1409, 1501, 1501, 1500, 1493, 1512, 1532, 1507, 1417, 1515, 1430, 1512, 1486, 1530, 1507, 1525, 1507, 1482, 1496, 1530, 1419, 1515, 1534, 1512, 1493, 1504, 1412, 1790, 1665, 1694, 1750, 1758, 1752, 1668, 1760, 1672, 1666, 1754, 1749, 1783, 1788, 1761, 1767, 1730, 1750, 1750, 1783, 1778, 1746, 1666, 1786, 1778, 1695, 1789, 1695, 1754, 1769, 1785, 1764, 1752, 1760, 1671, 1779, 1778, 1733, 1731, 1758, 1756, 1753, 1691, 1761, 1790, 1752, 1695, 1691, 1750, 1748, 1758, 1731, 1738, 1670, 1731, 1787, 1672, 1761, 1748, 1748, 1770, 1786, 1788, 1731, 1668, 1728, 1671, 1746, 1790, 1673, 1781, 1790, 1669, 1780, 1729, 1736, 1779, 1749, 1736, 1788, 1748, 1732, 1785, 1747, 1788, 1751, 1754, 1766, 1736, 1770, 1673, 1754, 1765, 1735, 1664, 1767, 1735, 1691, 1765, 1691, 1789, 1756, 1738, 1728, 1738, 1752, 1769, 1691, 1766, 1751, 1677, 1276, 1243, 1223, 1278, 1235, 1243, 1170, 1232, 1216, 1243, 1238, 1237, 1239, 1170, 1216, 1239, 1217, 1218, 1245, 1244, 1217, 1239, 1170, 1238, 1239, 1233, 1216, 1227, 1218, 1222, 
    1243, 1245, 1244, 1170, 1236, 1235, 1243, 1246, 1239, 1238, 669, 698, 678, 671, 690, 698, 755, 689, 673, 698, 695, 692, 694, 755, 673, 694, 672, 675, 700, 701, 672, 694, 755, 694, 701, 677, 694, 703, 700, 675, 694, 755, 698, 672, 755, 698, 701, 677, 690, 703, 698, 695, 512, 551, 571, 514, 559, 551, 622, 574, 550, 574, 622, 572, 555, 570, 571, 572, 544, 555, 554, 622, 555, 547, 574, 570, 567, 622, 572, 555, 573, 574, 545, 544, 573, 555, 2404, 2428, 2404, 2903, 2893, 2896, 2881, 1884, 2975, 2947, 2947, 2951, 3118, 3122, 3122, 3126, 3125, 1489, 1515, 1447, 1520, 1466, 1447, 1459, 1495, 1489, 1515, 1447, 1520, 1466, 1447, 1459, 1493, 1447, 1495, 1521, 1466, 1446, 1468, 1465, 1527, 1003, 972, 976, 1001, 964, 972, 901, 960, 989, 977, 901, 983, 960, 980, 976, 972, 983, 960, 982, 901, 981, 973, 981, 901, 964, 971, 961, 901, 982, 972, 977, 960, 1123, 1092, 1112, 1121, 1100, 1092, 1037, 1096, 1109, 1113, 1037, 1119, 1096, 1116, 1112, 1092, 1119, 1096, 1118, 1037, 1090, 1091, 1089, 1108, 1037, 1117, 1093, 1117, 1037, 1100, 1091, 1097, 1037, 1118, 1092, 1113, 1096, 2042, 2036, 2024, 761, 758, 762, 754, 1100, 1115, 1110, 1103, 1119, 1097, 2376, 2165, 2451, 2452, 2442, 2624, 2637, 2628, 2641, 1910, 1915, 1919, 1914, 1915, 1900, 620, 624, 637, 613, 611, 617, 622, 624, 611, 633, 625, 620, 616, 613, 3316, 3321, 2690, 2701, 2689, 2697, 1605, 1628, 1622, 3297, 3318, 3326, 3314, 3297, 3320, 3296, 285, 257, 268, 276, 271, 268, 270, 262, 306, 281, 260, 256, 264, 258, 280, 281, 2165, 2153, 2148, 2172, 2151, 2148, 2150, 2158, 2170, 2161, 2156, 2152, 2144, 2154, 2160, 2161, 1986, 2005, 2007, 2009, 1987, 1988, 2005, 1986, 1999, 2003, 2015, 2015, 2012, 2004, 2015, 1991, 2014, 917, 899, 917, 917, 911, 905, 904, 921, 899, 926, 918, 911, 916, 899, 898, 2061, 2065, 2059, 2060, 2077, 2075, 2049, 2075, 2054, 2062, 2071, 2060, 2075, 2074, 1025, 1030, 1025, 1052, 1047, 1038, 1033, 1025, 1028, 1037, 1036, 1581, 1584, 1588, 1596, 1590, 1580, 1581, 628, 611, 609, 623, 629, 626, 628, 615, 626, 623, 617, 616, 550, 613, 617, 617, 618, 610, 617, 625, 616, 1795, 1812, 1814, 1816, 1794, 1797, 1812, 1795, 1838, 1810, 1822, 1822, 1821, 1813, 1822, 1798, 1823, 2666, 2684, 2666, 2666, 2672, 2678, 2679, 2630, 2684, 2657, 2665, 2672, 2667, 2684, 2685, 1386, 1404, 1386, 1386, 1392, 1398, 1399, 1337, 1404, 1377, 1385, 1392, 1387, 1404, 1405, 1669, 1666, 1687, 1666, 1683, 1750, 1683, 1678, 1670, 1695, 1668, 1683, 1682, 883, 878, 868, 876, 866, 883, 807, 866, 895, 887, 878, 885, 866, 867, 1419, 1424, 1428, 1434, 1425, 1503, 1434, 1415, 1423, 1430, 1421, 1434, 1435, 2605, 2614, 2610, 2620, 2615, 2681, 2612, 2608, 2602, 2602, 2608, 2615, 2622, 2706, 2705, 2713, 2711, 2704, 2782, 2700, 2715, 2708, 2715, 2717, 2698, 2715, 2714, 1506, 1504, 1531, 1510, 1504, 1505, 1455, 1533, 1514, 1509, 1514, 1516, 1531, 1514, 1515, 2050, 2048, 2075, 2054, 2048, 2049, 2127, 2057, 2062, 2054, 2051, 2058, 2059, 2060, 2074, 2060, 2060, 2070, 2064, 2065, 2143, 2073, 2078, 2070, 2067, 2074, 2075, 889, 869, 895, 888, 873, 879, 853, 879, 882, 890, 867, 888, 879, 878, 2892, 2893, 2897, 2903, 2881, 2890, 2889, 2887, 2907, 1951, 1923, 1934, 1942, 1968, 1946, 1949, 1923, 1968, 1930, 1922, 1951, 1947, 1942, 1130, 1142, 1147, 1123, 1151, 1128, 1082, 1128, 1151, 1136, 1151, 1145, 1134, 1151, 1150, 1764, 1784, 1781, 1773, 1777, 1766, 1716, 1761, 1766, 1784, 1716, 1789, 1786, 1762, 1781, 1784, 1789, 1776, 1353, 1345, 1344, 1357, 1349, 1284, 1364, 1366, 1355, 1350, 1345, 1284, 1366, 1345, 1358, 1345, 1351, 1360, 1345, 1344, 749, 741, 740, 745, 737, 2868, 2867, 2868, 2857, 2994, 2990, 2979, 3003, 2976, 2979, 2977, 2985, 3005, 2999, 2988, 2979, 2996, 2979, 2987, 2990, 2979, 2976, 2990, 2983, 28510, 28365, 30028, -31204, 24382, 21863, -31114, 28165, -2817, -32764, 29182, 24573, -26050, -32730, 27109, 23028, 26769, 30028, -31204, 27768, 28139, -31106, 17960, 25526, 24573, 22882, 23457, -2087, -31966, 29400, 23771, -26344, -32000, 26161, 26530, 19846, -30399, 24430, 23469, 26580, -624, -30357, 30865, 22162, -27823, -30391, -31966, -28043, 24020, 23972, 22294, 21461, 28588, -2584, 30239, 29755, 22294, 22265, -32463, 23442, 17458, 29787, -30965, -2584, -32493, 28905, 24298, -25815, -32463, 28185, 23477, -26535, 30330, -30045, 23234, 20517, -31695, -2536, -32029, 25044, 28401, 30277, 30664, 23834, -26407, -32063, 25026, 24657, 31696, -30592, 25581, 19298, 22144, 28743, -1437, -29032, 32610, 20833, -27486, -28998, 26489, 22376, 26125, 31696, -30592, 1714, 1680, 1680, 1686, 1667, 1671, 1758, 1718, 1693, 1680, 1692, 1687, 1690, 1693, 1684, 3031, 3034, 3035, 3024, 3018, 3031, 3018, 3015, 3285, 3319, 3317, 3326, 3315, 3259, 3285, 3321, 3320, 3298, 3300, 3321, 3322, 516, 517, 583, 521, 523, 521, 514, 527, 2247, 2292, 2299, 2290, 2288, 3286, 3277, 3264, 3281, 3271, 3209, 3204, 3225, 3200, 3204, 3213, 3201, 284, 304, 305, 299, 314, 305, 299, 370, 267, 294, 303, 314, 1967, 1959, 1974, 1962, 1965, 1958, 3146, 3144, 3161, 1226, 1223, 1219, 1222, 1342, 1313, 1341, 1338, 1171, 1204, 1192, 1169, 1212, 1204, 1277, 1193, 1212, 1199, 1210, 1208, 1193, 1277, 1200, 1208, 1193, 1205, 1202, 1209, 1277, 1204, 1198, 1277, 1204, 1203, 1195, 1212, 1201, 1204, 1209, 1049, 1054, 1024, 1659, 1639, 1639, 1635, 2608, 2604, 2604, 2600, 2603, 2521, 2516, 2512, 2517, 2516, 2499, 2498, 2496, 2508, 2509, 2519, 2502, 2509, 2519, 2446, 2519, 2522, 2515, 2502, 2177, 2214, 2234, 2179, 2222, 2214, 2287, 2235, 2222, 2237, 2216, 2218, 2235, 2287, 2215, 2218, 2222, 2219, 2218, 2237, 2287, 2214, 2236, 2287, 2214, 2209, 2233, 2222, 2211, 2214, 2219, 2690, 2725, 2745, 2688, 2733, 2725, 2796, 2744, 2733, 2750, 2731, 2729, 2744, 2796, 2724, 2729, 2733, 2728, 2729, 2750, 2751, 2796, 2733, 2750, 2729, 2796, 2744, 2723, 2723, 2796, 2720, 2733, 2750, 2731, 2729, 2574, 2563, 2568, 2581, 2611, 2574, 2650, 2648, 2199, 2224, 2220, 2197, 2232, 2224, 2297, 2219, 2236, 2216, 2220, 2236, 2218, 2221, 2297, 2235, 2230, 2237, 2208, 2297, 2221, 2230, 2230, 
    2297, 2229, 2232, 2219, 2238, 2236, 2456, 2495, 2467, 2458, 2487, 2495, 2550, 2449, 2451, 2434, 2550, 2484, 2489, 2482, 2479, 2550, 2495, 2469, 2550, 2495, 2488, 2464, 2487, 2490, 2495, 2482, 569, 542, 514, 571, 534, 542, 599, 575, 562, 566, 563, 599, 533, 536, 531, 526, 599, 542, 516, 599, 542, 537, 513, 534, 539, 542, 531, 542, 569, 549, 540, 561, 569, 624, 546, 565, 545, 549, 565, 547, 548, 624, 562, 575, 564, 553, 624, 569, 547, 624, 569, 574, 550, 561, 572, 569, 564, 997, 962, 990, 999, 970, 962, 907, 991, 970, 985, 972, 974, 991, 907, 1022, 1017, 999, 907, 962, 984, 907, 962, 965, 989, 970, 967, 962, 975, 426, 438, 443, 419, 440, 443, 441, 433, 421, 430, 435, 439, 447, 437, 431, 430, 2944, 2983, 3003, 2946, 2991, 2983, 3054, 2988, 3004, 2983, 2986, 2985, 2987, 3054, 3005, 3002, 2991, 3002, 2987, 3054, 3002, 2999, 3006, 2987, 3054, 2983, 3005, 3054, 2983, 2976, 3000, 2991, 2978, 2983, 2986, 2472, 2447, 2451, 2474, 2439, 2447, 2502, 2436, 2452, 2447, 2434, 2433, 2435, 2502, 2453, 2450, 2439, 2450, 2435, 2502, 2454, 2435, 2452, 2453, 2447, 2453, 2450, 2435, 2440, 2437, 2435, 2502, 2432, 2439, 2447, 2442, 2435, 2434, 1674, 1709, 1713, 1672, 1701, 1709, 1764, 1702, 1718, 1709, 1696, 1699, 1697, 1764, 1719, 1712, 1701, 1712, 1697, 1764, 1712, 1707, 1707, 1764, 1704, 1701, 1718, 1699, 1697, 2905, 2885, 2888, 2896, 2887, 2888, 2884, 2892, 2640, 2649, 2651, 2653, 2655, 2629, 2659, 2641, 2645, 2651, 2638, 2653, 2632, 2645, 2643, 2642, 2659, 2648, 2643, 2642, 2649, 1003, 995, 1010, 999, 2951, 2967, 2961, 2970, 2961, 554, 560, 557, 572, 2178, 2176, 2199, 2186, 2188, 2189, 297, 308, 318, 310, 312, 297, 2417, 2422, 2403, 2422, 2407, 1846, 1844, 1827, 1846, 1831, 1844, 1827, 2964, 2949, 2966, 2949, 2953, 2967, 2901, 2900, 2887, 2904, 2898, 2900, 2926, 2904, 2901, 1553, 1560, 1547, 1565, 1550, 1560, 1547, 1564, 1574, 1552, 1565, 515, 522, 520, 526, 524, 534, 560, 518, 523, 522, 513, 539, 518, 539, 534, 2275, 2292, 2272, 2276, 2292, 2274, 2277, 1248, 1270, 1278, 1251, 1224, 1274, 1252, 2639, 2649, 2641, 2636, 2677, 2635, 1429, 1428, 1437, 1424, 1416, 1454, 1436, 1410, 1889, 1901, 1900, 1905, 1911, 1903, 1895, 1702, 1697, 1716, 1697, 1696, 1702, 1197, 1184, 1195, 1206, 931, 936, 949, 953, 2822, 2833, 2823, 2817, 2840, 2816, 1803, 1836, 1840, 1801, 1828, 1836, 1893, 1831, 1847, 1836, 1825, 1826, 1824, 1893, 1845, 1847, 1824, 1845, 1828, 1847, 1824, 1893, 1847, 1824, 1844, 1840, 1824, 1846, 1841, 1893, 1832, 1836, 1846, 1846, 1836, 1835, 1826, 2838, 2865, 2861, 2836, 2873, 2865, 2936, 2874, 2858, 2865, 2876, 2879, 2877, 2936, 2858, 2877, 2857, 2861, 2877, 2859, 2860, 2936, 2877, 2848, 2875, 2877, 2877, 2876, 2877, 2876, 2936, 2858, 2871, 2861, 2870, 2876, 2936, 2868, 2865, 2869, 2865, 2860, 1953, 1955, 1974, 1959, 1957, 1965, 1968, 1979, 1921, 1965, 1964, 1974, 1959, 1964, 1974, 1547, 1546, 1563, 1550, 1542, 1539, 1580, 1536, 1537, 1563, 1546, 1537, 1563, 1538, 1541, 1538, 1567, 1874, 1861, 1866, 847, 840, 842, 834, 868, 840, 841, 851, 834, 841, 851, 1869, 1877, 1869, 489, 499, 494, 511, 1930, 1925, 1935, 1945, 1924, 1922, 1935, 1972, 1922, 1935, 2739, 2740, 2728, 2737, 2748, 2740, 2690, 2751, 2735, 2740, 2745, 2746, 2744, 2690, 2734, 2729, 2748, 2729, 2744, 2690, 2731, 2796, 954, 947, 945, 951, 949, 943, 905, 955, 959, 945, 932, 951, 930, 947, 946, 905, 928, 997, 905, 1783, 1769, 1776, 1778, 1755, 1783, 1761, 1783, 1783, 1773, 1771, 1770, 1755, 1778, 1717, 1056, 1031, 1051, 1058, 1039, 1031, 1102, 1035, 1046, 1050, 1102, 1052, 1035, 1055, 1051, 1031, 1052, 1035, 1053, 1102, 1054, 1030, 1054, 1102, 1039, 1024, 1034, 1102, 1053, 1031, 1050, 1035, 2157, 2164, 2175, 1244, 1233, 2581, 2586, 2582, 2590, 1597, 1572, 1582, 1292, 1307, 1299, 1311, 1292, 1301, 1293, 2616, 2596, 2592, 2611, 395, 408, 399, 395, 3054, 3043, 3050, 3071, 3269, 3271, 3280, 3275, 3286, 736, 749, 758, 737, 743, 752, 747, 758, 1417, 1413, 1412, 1438, 1423, 1412, 1438, 1214, 1186, 1208, 1215, 1198, 1192, 1214, 1616, 1615, 1602, 1603, 1609, 1657, 1610, 1615, 1621, 1618, 287, 266, 275, 265, 277, 286, 287, 265, 919, 912, 910, 2176, 1734, 1737, 1733, 1741, 517, 512, 519, 524, 2210, 2454, 2440, 2449, 2451, 2527, 1034, 1153, 1166, 1154, 1162, 30742, -29882, 2546, 1244, 1244, 1244, 2693, 2693, 2693, 2988, 2424, 2404, 2409, 2417, 2413, 2426, 2379, 2407, 2406, 2428, 2413, 2406, 2428, 706, 724, 720, 707, 722, 729, 754, 734, 735, 709, 724, 735, 709, 1558, 1536, 1540, 1559, 1542, 1549, 1574, 1546, 1547, 1553, 1536, 1547, 1553, 1591, 1584, 1573, 1584, 1569, 1725, 1690, 1670, 1727, 1682, 1690, 1747, 1667, 1691, 1667, 1747, 1723, 1703, 1703, 1699, 1747, 2385, 2368, 2368, 2396, 2393, 2387, 2385, 2372, 2393, 2399, 2398, 2335, 2394, 2371, 2399, 2398, 2315, 2320, 2387, 2392, 2385, 2370, 2371, 2389, 2372, 2317, 2373, 2372, 2390, 2333, 2312, 2510, 2481, 2478, 2482, 2517, 2479, 2545, 2549, 2542, 2549, 2552, 2516, 2515, 2544, 2547, 2520, 2499, 2549, 2512, 2550, 2486, 2519, 2520, 2529, 2486, 2479, 2499, 2536, 2509, 2512, 2529, 2484, 2546, 2536, 2548, 2482, 2520, 2517, 2502, 2529, 2535, 2546, 2516, 2554, 2518, 2547, 2505, 2515, 2530, 2486, 2521, 2503, 2506, 2549, 2511, 2531, 2486, 2515, 2536, 2551, 2544, 2517, 2483, 2484, 2519, 2500, 2530, 2481, 2532, 2513, 2547, 2547, 2534, 2480, 2534, 2514, 2498, 2510, 2552, 2482, 2522, 2518, 2548, 2536, 2488, 2532, 2532, 2533, 2540, 2513, 2501, 2522, 2480, 2514, 2479, 2513, 2551, 2499, 2522, 2508, 2522, 2547, 2529, 2499, 2482, 2514, 2503, 2513, 2540, 2521, 2493, 974, 945, 942, 998, 1006, 1000, 948, 976, 952, 946, 1002, 997, 967, 972, 977, 983, 1010, 998, 998, 967, 962, 994, 946, 970, 962, 943, 973, 943, 1002, 985, 969, 980, 1000, 976, 951, 963, 962, 1013, 1011, 1006, 1004, 1001, 939, 977, 974, 1000, 943, 939, 998, 996, 1006, 1011, 1018, 950, 1011, 971, 952, 977, 996, 996, 986, 970, 
    972, 1011, 948, 1008, 951, 994, 974, 953, 965, 974, 949, 964, 1009, 1016, 963, 997, 1016, 972, 996, 1012, 969, 995, 972, 999, 1002, 982, 1016, 986, 953, 1002, 981, 1015, 944, 983, 1015, 939, 981, 939, 973, 1004, 1018, 1008, 1018, 1000, 985, 939, 982, 999, 957, 1763, 1692, 1667, 1786, 1760, 1767, 1775, 1666, 1768, 1770, 1693, 1738, 1765, 1692, 1733, 1666, 1770, 1737, 1765, 1670, 1790, 1666, 1758, 1731, 1742, 1732, 1760, 1749, 1780, 1774, 1729, 1760, 1733, 1768, 1738, 1694, 1753, 1742, 1768, 1771, 1739, 1758, 1752, 1769, 1791, 1691, 1789, 1691, 1752, 1758, 1783, 1695, 1691, 1693, 1734, 1748, 1791, 1737, 1761, 1786, 1692, 1756, 1791, 1767, 1666, 1729, 1774, 1781, 1771, 1760, 1734, 1783, 1757, 1788, 1691, 1759, 1751, 1688, 1788, 1781, 1789, 1740, 1752, 1752, 1691, 1733, 1733, 1788, 1754, 1680, 1680, 3105, 3166, 3137, 3163, 3105, 3072, 3078, 3116, 3077, 3162, 3108, 3084, 3083, 3159, 3161, 3080, 3104, 3167, 3103, 3127, 3102, 3163, 3109, 3133, 3110, 3159, 3118, 3159, 3080, 3106, 3126, 3074, 3106, 3081, 3081, 3097, 3118, 3076, 3130, 3093, 3073, 3097, 3104, 3073, 3135, 3125, 3078, 3115, 3160, 3072, 3162, 3128, 3162, 3086, 3077, 3133, 3097, 3102, 3109, 3073, 3164, 3164, 3134, 3108, 3084, 3162, 3128, 3075, 3129, 3086, 3077, 3075, 3083, 3135, 3131, 3075, 3102, 3094, 3162, 3110, 3100, 3131, 3113, 3072, 3115, 3161, 3100, 3084, 3118, 3117, 3074, 3165, 3073, 3108, 3094, 3101, 3132, 3135, 3080, 3080, 3128, 3072, 3084, 3082, 3077, 3077, 3074, 3099, 3131, 3098, 3082, 3076, 3140, 3076, 3130, 3100, 3109, 3077, 3097, 3159, 3096, 3125, 3109, 3112, 3102, 3100, 3167, 3135, 3161, 3086, 3136, 3078, 3160, 3073, 3136, 3094, 3140, 3128, 3098, 3130, 3126, 3077, 3099, 3098, 3107, 3113, 3135, 3117, 3167, 3132, 3166, 3084, 3134, 3154, 3154, 2435, 2433, 2455, 2459, 2440, 2459, 2445, 2437, 2439, 2432, 2441, 1735, 1731, 1529, 1532, 1513, 1532, 1905, 1894, 1904, 1894, 1911, 3186, 3173, 3173, 3192, 3173, 2460, 2491, 2471, 2462, 2483, 2491, 2546, 2466, 2490, 2466, 2546, 2465, 2470, 2483, 2470, 2487, 2546, 2487, 2474, 2466, 2491, 2464, 2487, 2486, 627, 596, 584, 625, 604, 596, 541, 589, 597, 589, 541, 603, 604, 596, 593, 600, 601, 681, 654, 658, 683, 646, 654, 711, 663, 655, 663, 711, 643, 646, 659, 646, 711, 650, 654, 660, 660, 654, 649, 640, 3040, 3015, 3035, 3042, 3023, 3015, 2958, 3038, 3014, 3038, 2958, 3036, 3019, 3034, 3035, 3036, 3008, 3019, 3018, 2958, 3008, 3009, 2958, 3036, 3019, 3037, 3038, 3009, 3008, 3037, 3019, 2316, 2347, 2359, 2318, 2339, 2347, 2402, 2354, 2346, 2354, 2402, 2352, 2343, 2342, 2347, 2352, 2343, 2337, 2358, 2402, 2347, 2353, 2402, 2348, 2349, 2358, 2402, 2339, 2350, 2350, 2349, 2357, 2343, 2342, 741, 706, 734, 743, 714, 706, 651, 713, 729, 706, 719, 716, 718, 651, 729, 718, 730, 734, 718, 728, 735, 651, 718, 709, 712, 729, 722, 731, 735, 706, 708, 709, 651, 717, 714, 706, 711, 718, 719, 2621, 2586, 2566, 2623, 2578, 2586, 2643, 2563, 2587, 2563, 2643, 2586, 2560, 2643, 2589, 2588, 2567, 2643, 2576, 2588, 2589, 2581, 2586, 2580, 2566, 2561, 2582, 2583, 1244};
    public SharedPreferences g;
    public JSONObject j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String a = "";
    public String b = "";
    public volatile String c = "";
    public String d = "";
    public String e = "";
    public Object f = JSONObject.NULL;
    public String h = "";
    public String i = "";
    public final LinkedHashMap n = new LinkedHashMap(64, 0.75f, true);
    public final LinkedHashMap o = new LinkedHashMap(16, 0.75f, true);
    public final ThreadLocal p = new ThreadLocal();

    final class BridgeResetException extends IOException {
        public BridgeResetException(String str) {
            super(str);
        }
    }

    final class Episode {
        public final String a;
        public final String b;
        public final String c;

        public Episode(String str, String str2, String str3) {
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            this.a = str6 == null ? "" : str6;
            this.b = str5 == null ? "" : str5;
            this.c = str4 == null ? "" : str4;
        }
    }

    final class PlaybackContext {
        public final String a;
        public final String b;
        public final List c;

        public PlaybackContext(String str, String str2, List list) {
            List list2 = list;
            String str3 = str2;
            String str4 = str;
            this.a = str4 == null ? "" : str4;
            this.b = str3 == null ? "" : str3;
            this.c = list2 == null ? Collections.emptyList() : list2;
        }
    }

    final class PlayerResolution {
        public final String a;
        public final int b;
        public final Map c;

        public PlayerResolution(int i, String str, LinkedHashMap linkedHashMap) {
            this.a = str;
            this.b = i;
            this.c = linkedHashMap;
        }
    }

    final class TargetReply {
        public final int a;
        public final String b;

        public TargetReply(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        try {
            f();
            JSONObject jSONObjectB = b("home", new JSONObject().put("filter", z).put("sdk", Build.VERSION.SDK_INT));
            JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray("classes");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String strTrim = jSONObjectOptJSONObject.optString("id", "").trim();
                        String strTrim2 = jSONObjectOptJSONObject.optString("name", "").trim();
                        if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                            com.github.catvod.spider.merge.D.b.z(strTrim, strTrim2, null, arrayList);
                        }
                    }
                }
            }
            ArrayList arrayListU = u(jSONObjectB.optJSONArray("list"));
            return !z ? com.github.catvod.spider.merge.p001b.g.z(arrayList, arrayListU) : com.github.catvod.spider.merge.p001b.g.A(arrayList, arrayListU, s(jSONObjectB.optJSONObject("filters")));
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.p001b.g.z(Collections.emptyList(), Collections.emptyList());
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        String str3 = str;
        int iMax = 1;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        try {
            f();
            JSONObject jSONObject = new JSONObject();
            String strM554 = "keyword";
            if (str3 == null) {
                str3 = "";
            }
            return o(iMax, b("search", jSONObject.put(strM554, str3).put("page", iMax).put("sdk", Build.VERSION.SDK_INT)));
        } catch (Exception unused2) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.o(iMax, iMax, 0, 0);
            gVar.F(Collections.emptyList());
            return gVar.r();
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws Exception {
        String strM65;
        String str3;
        String strI;
        String str4 = str;
        String str5 = str2;
        String strM105 = "player";
        String strM471 = "init";
        long jN = n();
        long jMax = Math.max(0L, 60000L);
        long j = jN <= Long.MAX_VALUE - jMax ? jN + jMax : Long.MAX_VALUE;
        ThreadLocal threadLocal = this.p;
        threadLocal.set(Long.valueOf(j));
        try {
            try {
                f();
                PlaybackContext playbackContextX = x(str5);
                Episode episodeL = L(str2);
                List list2 = playbackContextX.c;
                String str6 = playbackContextX.b;
                String str7 = playbackContextX.a;
                ArrayList arrayListW = w(episodeL, list2);
                Exception e = null;
                int i = 0;
                while (true) {
                    strM65 = "PLAYBACK_TIMEOUT";
                    if (i >= 2) {
                        break;
                    }
                    int i2 = 0;
                    while (i2 < arrayListW.size()) {
                        Episode episode = (Episode) arrayListW.get(i2);
                        ArrayList arrayList = arrayListW;
                        try {
                            if (E(j, n()) > 0) {
                                PlayerResolution playerResolutionT = t(b(strM105, new JSONObject().put("flag", str4 != null ? str4 : "").put("url", episode.c).put("line", episode.b).put("title", episode.a).put("vodname", str7).put("sdk", Build.VERSION.SDK_INT).put("force_session", i > 0 && i2 == 0)));
                                String strM390 = "media";
                                int i3 = playerResolutionT.b;
                                Map map = playerResolutionT.c;
                                String str8 = playerResolutionT.a;
                                if (i3 == 0) {
                                    strM105 = strM105;
                                    str3 = strM390;
                                    try {
                                        long jN2 = n();
                                        i = i;
                                        try {
                                            String strG = g(str8, (LinkedHashMap) map);
                                            boolean zJ = j(jN2, strG);
                                            String strM182 = "SOURCE_EXPIRED";
                                            if (zJ) {
                                                throw new IOException(strM182);
                                            }
                                            int iE = E(j, n());
                                            if (iE <= 0) {
                                                throw new IOException(strM65);
                                            }
                                            if (!B(iE, str8, (LinkedHashMap) map)) {
                                                F(n(), strG);
                                                throw new IOException(strM182);
                                            }
                                            h(strG);
                                        } catch (Exception e2) {
                                            e = e2;
                                            str4 = str;
                                            str5 = str2;
                                            i2++;
                                            str4 = str4;
                                            str5 = str5;
                                            arrayListW = arrayList;
                                            strM105 = strM105;
                                            i = i;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        i = i;
                                    }
                                } else {
                                    strM105 = strM105;
                                    str3 = strM390;
                                    i = i;
                                }
                                try {
                                    com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                                    gVar.C(str8);
                                    gVar.h(map);
                                    gVar.q(i3 == 0 ? 0 : 1);
                                    if (str8.toLowerCase(Locale.US).contains(".m3u8")) {
                                        gVar.k();
                                    }
                                    if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(str6)) {
                                        str4 = str;
                                        str5 = str2;
                                        strI = "";
                                    } else {
                                        str4 = str;
                                        str5 = str2;
                                        try {
                                            strI = AbstractC0280n1.i(str4, str5, str7, str6);
                                        } catch (Exception e4) {
                                            e = e4;
                                            i2++;
                                            str4 = str4;
                                            str5 = str5;
                                            arrayListW = arrayList;
                                            strM105 = strM105;
                                            i = i;
                                        }
                                    }
                                    if (!TextUtils.isEmpty(strI)) {
                                        gVar.b(strI);
                                    }
                                    String strR = gVar.r();
                                    threadLocal.remove();
                                    return strR;
                                } catch (Exception e5) {
                                    e = e5;
                                    str4 = str;
                                    str5 = str2;
                                    i2++;
                                    str4 = str4;
                                    str5 = str5;
                                    arrayListW = arrayList;
                                    strM105 = strM105;
                                    i = i;
                                }
                            } else {
                                try {
                                    throw new IOException(strM65);
                                } catch (Exception e6) {
                                    e = e6;
                                }
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                        i2++;
                        str4 = str4;
                        str5 = str5;
                        arrayListW = arrayList;
                        strM105 = strM105;
                        i = i;
                    }
                    String str9 = strM105;
                    ArrayList arrayList2 = arrayListW;
                    int i4 = i;
                    String str10 = str5;
                    String str11 = str4;
                    if (i4 != 0 || E(j, n()) <= 0) {
                        break;
                    }
                    i = i4 + 1;
                    str4 = str11;
                    str5 = str10;
                    arrayListW = arrayList2;
                    strM105 = str9;
                }
                if (E(j, n()) <= 0) {
                    throw new IOException(strM65);
                }
                if (e == null) {
                    throw new IOException("NiuLai playback candidates empty");
                }
                throw e;
            } catch (Exception e8) {
                try {
                    X0.a(y(strM471, e8));
                } catch (Throwable unused) {
                }
                String strD = com.github.catvod.spider.merge.p001b.g.d("播放失败，请查看提示");
                threadLocal.remove();
                return strD;
            }
        } catch (Throwable th) {
            threadLocal.remove();
            throw th;
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        if (list == null || list.isEmpty()) {
            return AbstractC0449a.b();
        }
        String str = list.get(0);
        if (str == null) {
            str = "";
        }
        try {
            f();
            return com.github.catvod.spider.merge.p001b.g.s(p(str, b("detail", new JSONObject().put("id", str).put("sdk", Build.VERSION.SDK_INT))));
        } catch (Exception unused) {
            return AbstractC0449a.b();
        }
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = str;
        int iMax = 1;
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        try {
            f();
            JSONObject jSONObject = new JSONObject();
            String strM33 = "tid";
            if (str3 == null) {
                str3 = "";
            }
            JSONObject jSONObjectPut = jSONObject.put(strM33, str3).put("page", iMax);
            String strM473 = "extend";
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    jSONObject2.put(key, value);
                }
            }
            return o(iMax, b("category", jSONObjectPut.put(strM473, jSONObject2).put("sdk", Build.VERSION.SDK_INT)));
        } catch (Exception unused2) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.o(iMax, iMax, 0, 0);
            gVar.F(Collections.emptyList());
            return gVar.r();
        }
    }

    public static String A(int i, String str, Map map) {
        Object obj = map.get(str);
        if (!(obj instanceof String)) {
            return "";
        }
        String str2 = (String) obj;
        return str2.length() <= i ? str2 : "";
    }

    public static byte[] C(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            i += i2;
            if (i > 8388608) {
                throw new IOException("NiuLai response too large");
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public static String D() {
        String hostAddress = "";
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces != null && networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (!networkInterfaceNextElement.isLoopback()) {
                    byte[] hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                    if (hardwareAddress != null && hardwareAddress.length > 0) {
                        StringBuilder sb = new StringBuilder((hardwareAddress.length * 3) - 1);
                        for (byte b : hardwareAddress) {
                            if (sb.length() > 0) {
                                sb.append(':');
                            }
                            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b & 255)));
                        }
                        return sb.toString();
                    }
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.getHostAddress().contains(":")) {
                            hostAddress = inetAddressNextElement.getHostAddress();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return hostAddress;
    }

    public static int E(long j, long j2) {
        if (j <= j2) {
            return 0;
        }
        long j3 = j - j2;
        if (j3 < 0) {
            j3 = Long.MAX_VALUE;
        }
        return (int) Math.min(Math.max(1, 30), ((j3 - 1) / 1000) + 1);
    }

    public static String J(String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        String strM511 = "#";
        String strM301 = " ";
        String strK = com.github.catvod.spider.merge.D.b.k(str2, strM511, strM301, "$", strM301);
        return TextUtils.isEmpty(strK) ? "播放" : strK;
    }

    public static Episode L(String str) {
        String str2 = str;
        if (str2 != null && str2.startsWith("smtv:")) {
            String[] strArrSplit = str2.substring(5).split(":", 3);
            if (strArrSplit.length == 3) {
                try {
                    return new Episode(i(strArrSplit[1]), i(strArrSplit[0]), i(strArrSplit[2]));
                } catch (Exception unused) {
                }
            }
            if (strArrSplit.length == 2) {
                try {
                    return new Episode("", i(strArrSplit[0]), i(strArrSplit[1]));
                } catch (Exception unused2) {
                }
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        return new Episode("", "", str2);
    }

    public static String d(String str, String str2, String str3, String str4) {
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        StringBuilder sb = new StringBuilder();
        if (str8 == null) {
            str8 = "";
        }
        sb.append(str8.trim());
        String strM539 = "\n";
        sb.append(strM539);
        if (str7 == null) {
            str7 = "";
        }
        sb.append(str7.trim());
        sb.append(strM539);
        if (str6 == null) {
            str6 = "";
        }
        sb.append(str6.trim());
        sb.append(strM539);
        if (str5 == null) {
            str5 = "";
        }
        sb.append(str5.trim());
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(sb.toString().getBytes(StandardCharsets.UTF_8));
        StringBuilder sb2 = new StringBuilder((bArrDigest.length * 2) + 6);
        sb2.append("state_");
        for (byte b : bArrDigest) {
            sb2.append(String.format(Locale.US, "%02x", Integer.valueOf(b & 255)));
        }
        return sb2.toString();
    }

    public static String g(String str, LinkedHashMap linkedHashMap) {
        String str2 = str;
        ArrayList<String> arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            if (str3 == null) {
                str3 = "";
            }
            String lowerCase = str3.trim().toLowerCase(Locale.US);
            String str4 = (String) entry.getValue();
            String strTrim = (str4 != null ? str4 : "").trim();
            if (!TextUtils.isEmpty(lowerCase) && !TextUtils.isEmpty(strTrim)) {
                arrayList.add(lowerCase + " " + strTrim);
            }
        }
        Collections.sort(arrayList);
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder(str2.trim());
        for (String str5 : arrayList) {
            sb.append('\n');
            sb.append(str5);
        }
        return sb.toString();
    }

    public static String i(String str) {
        return new String(Base64.decode(str, 11), StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0557  */
    /* JADX WARN: Code duplicated, block: B:111:0x0565  */
    /* JADX WARN: Code duplicated, block: B:113:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:114:0x05be  */
    /* JADX WARN: Code duplicated, block: B:117:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:142:0x05d2 A[EDGE_INSN: B:142:0x05d2->B:119:0x05d2 BREAK  A[LOOP:1: B:32:0x00b4->B:110:0x055f], SYNTHETIC] */
    public static JSONObject k(SharedPreferences sharedPreferences, String str) throws JSONException {
        String strM408;
        JSONArray jSONArray;
        String str2;
        String str3;
        JSONArray jSONArray2;
        HashSet hashSet;
        String str4;
        JSONObject jSONObjectPut;
        String string;
        HashSet hashSet2;
        String str5;
        String string2;
        int i = 1;
        if (sharedPreferences != null) {
            String str6 = "";
            if (!TextUtils.isEmpty((str == null ? "" : str).trim())) {
                try {
                    Map<String, ?> all = sharedPreferences.getAll();
                    if (all == null || all.isEmpty()) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> it = all.keySet().iterator();
                    boolean z = false;
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        strM408 = "identity_version";
                        if (!zHasNext) {
                            break;
                        }
                        String next = it.next();
                        if (strM408.equals(next)) {
                            z = true;
                        } else if (next != null && next.startsWith("profile|") && next.endsWith("|identity_version")) {
                            arrayList.add(next.substring(0, next.length() - 16));
                        }
                    }
                    Collections.sort(arrayList);
                    if (z) {
                        arrayList.add("");
                    }
                    JSONArray jSONArray3 = new JSONArray();
                    HashSet hashSet3 = new HashSet();
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            jSONArray = jSONArray3;
                            break;
                        }
                        String str7 = (String) it2.next();
                        int iZ = z(-1, str7 + strM408, all);
                        int iZ2 = z(-1, str7 + "identity_login_type", all);
                        String strM10 = "config_fingerprint";
                        String strM33 = "app_id";
                        String strM445 = "variant";
                        String strM288 = "account";
                        String strM301 = "machine_id";
                        if (iZ < 4 || iZ > 6 || !(iZ2 == 0 || iZ2 == i || iZ2 == 3)) {
                            str2 = strM33;
                            str3 = str6;
                            it2 = it2;
                            jSONArray2 = jSONArray3;
                            hashSet = hashSet3;
                            str4 = strM10;
                        } else {
                            String strTrim = A(64, str7 + "identity_variant", all).trim();
                            StringBuilder sb = new StringBuilder();
                            sb.append(str7);
                            it2 = it2;
                            sb.append("identity_app_id");
                            String strTrim2 = A(128, sb.toString(), all).trim();
                            if (TextUtils.isEmpty(str7)) {
                                strM33 = strM33;
                                string2 = str6;
                                str3 = string2;
                                jSONArray2 = jSONArray3;
                                hashSet = hashSet3;
                                str5 = strM10;
                            } else {
                                jSONArray2 = jSONArray3;
                                String[] strArrSplit = str7.split("\\|", -1);
                                hashSet = hashSet3;
                                if (strArrSplit.length == 5) {
                                    str3 = str6;
                                    if ("profile".equals(strArrSplit[0]) && strArrSplit[4].isEmpty()) {
                                        String str8 = strArrSplit[3];
                                        if (str8 == null) {
                                            str8 = str3;
                                        }
                                        String strTrim3 = str8.trim();
                                        if (!TextUtils.isEmpty(strTrim3)) {
                                            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(strTrim3.getBytes(StandardCharsets.UTF_8));
                                            StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
                                            int length = bArrDigest.length;
                                            int i2 = 0;
                                            while (i2 < length) {
                                                sb2.append(String.format(Locale.US, "%02x", Integer.valueOf(bArrDigest[i2] & 255)));
                                                i2++;
                                                length = length;
                                                bArrDigest = bArrDigest;
                                                strM10 = strM10;
                                                strM33 = strM33;
                                            }
                                            strM33 = strM33;
                                            str5 = strM10;
                                            string2 = sb2.toString();
                                        }
                                    }
                                } else {
                                    str3 = str6;
                                }
                                str5 = strM10;
                                string2 = str3;
                            }
                            if (TextUtils.isEmpty(str7) || (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2) && !TextUtils.isEmpty(string2))) {
                                String strTrim4 = A(128, str7 + strM301, all).trim();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str7);
                                String strM486 = "base_machine_id";
                                sb3.append(strM486);
                                String strTrim5 = A(128, sb3.toString(), all).trim();
                                String strTrim6 = A(256, str7 + strM288, all).trim();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(str7);
                                String strM102 = "password";
                                sb4.append(strM102);
                                String strA = A(256, sb4.toString(), all);
                                if (!TextUtils.isEmpty(strTrim4) && !TextUtils.isEmpty(strTrim6) && !TextUtils.isEmpty(strA)) {
                                    String strTrim7 = (str == null ? str3 : str).trim();
                                    if (TextUtils.isEmpty(strTrim5)) {
                                        strTrim5 = strTrim4;
                                    }
                                    if (strTrim7.equals(strTrim5)) {
                                        JSONObject jSONObjectPut2 = new JSONObject().put(strM408, iZ).put("login_type", iZ2).put(strM445, strTrim);
                                        str2 = strM33;
                                        JSONObject jSONObjectPut3 = jSONObjectPut2.put(str2, strTrim2);
                                        str4 = str5;
                                        JSONObject jSONObjectPut4 = jSONObjectPut3.put(str4, string2).put(strM486, strTrim5).put(strM301, strTrim4).put(strM288, strTrim6).put(strM102, strA);
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(str7);
                                        String strM223 = "token";
                                        sb5.append(strM223);
                                        JSONObject jSONObjectPut5 = jSONObjectPut4.put(strM223, A(4096, sb5.toString(), all));
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append(str7);
                                        String strM379 = "identity_generation";
                                        sb6.append(strM379);
                                        JSONObject jSONObjectPut6 = jSONObjectPut5.put(strM379, Math.max(0, z(0, sb6.toString(), all)));
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append(str7);
                                        String strM1 = "renewal_retry_after";
                                        sb7.append(strM1);
                                        Object obj = all.get(sb7.toString());
                                        JSONObject jSONObjectPut7 = jSONObjectPut6.put(strM1, Math.max(0L, obj instanceof Number ? ((Number) obj).longValue() : 0L));
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append(str7);
                                        String strM325 = "registration_retry_after";
                                        sb8.append(strM325);
                                        Object obj2 = all.get(sb8.toString());
                                        JSONObject jSONObjectPut8 = jSONObjectPut7.put(strM325, Math.max(0L, obj2 instanceof Number ? ((Number) obj2).longValue() : 0L));
                                        StringBuilder sb9 = new StringBuilder();
                                        sb9.append(str7);
                                        String strM175 = "vip";
                                        sb9.append(strM175);
                                        JSONObject jSONObjectPut9 = jSONObjectPut8.put(strM175, A(512, sb9.toString(), all));
                                        StringBuilder sb10 = new StringBuilder();
                                        sb10.append(str7);
                                        String strM75 = "trial_state";
                                        sb10.append(strM75);
                                        JSONObject jSONObjectPut10 = jSONObjectPut9.put(strM75, Math.max(-1, Math.min(1, z(-1, sb10.toString(), all))));
                                        StringBuilder sb11 = new StringBuilder();
                                        sb11.append(str7);
                                        String strM103 = "trial_started_at";
                                        sb11.append(strM103);
                                        Object obj3 = all.get(sb11.toString());
                                        JSONObject jSONObjectPut11 = jSONObjectPut10.put(strM103, Math.max(0L, obj3 instanceof Number ? ((Number) obj3).longValue() : 0L));
                                        StringBuilder sb12 = new StringBuilder();
                                        sb12.append(str7);
                                        String strM70 = "access_observed";
                                        sb12.append(strM70);
                                        Object obj4 = all.get(sb12.toString());
                                        jSONObjectPut = jSONObjectPut11.put(strM70, obj4 instanceof Boolean ? ((Boolean) obj4).booleanValue() : false);
                                    }
                                    if (jSONObjectPut == null) {
                                        jSONArray3 = jSONArray2;
                                        hashSet3 = hashSet;
                                        str6 = str3;
                                    } else {
                                        StringBuilder sb13 = new StringBuilder();
                                        str6 = str3;
                                        sb13.append(jSONObjectPut.optString(strM445, str6));
                                        String strM42 = "\n";
                                        sb13.append(strM42);
                                        sb13.append(jSONObjectPut.optString(str2, str6));
                                        sb13.append(strM42);
                                        sb13.append(jSONObjectPut.optString(str4, str6));
                                        sb13.append(strM42);
                                        sb13.append(jSONObjectPut.optString(strM301, str6));
                                        sb13.append(strM42);
                                        sb13.append(jSONObjectPut.optString(strM288, str6));
                                        string = sb13.toString();
                                        hashSet2 = hashSet;
                                        if (hashSet2.add(string)) {
                                            jSONArray = jSONArray2;
                                            jSONArray.put(jSONObjectPut);
                                            if (jSONArray.length() >= 16) {
                                                break;
                                            }
                                            jSONArray3 = jSONArray;
                                            hashSet3 = hashSet2;
                                        } else {
                                            hashSet3 = hashSet2;
                                            jSONArray3 = jSONArray2;
                                        }
                                    }
                                    i = 1;
                                }
                            }
                            str4 = str5;
                            str2 = strM33;
                        }
                        jSONObjectPut = null;
                        if (jSONObjectPut == null) {
                            jSONArray3 = jSONArray2;
                            hashSet3 = hashSet;
                            str6 = str3;
                        } else {
                            StringBuilder sb14 = new StringBuilder();
                            str6 = str3;
                            sb14.append(jSONObjectPut.optString(strM445, str6));
                            String strM43 = "\n";
                            sb14.append(strM43);
                            sb14.append(jSONObjectPut.optString(str2, str6));
                            sb14.append(strM43);
                            sb14.append(jSONObjectPut.optString(str4, str6));
                            sb14.append(strM43);
                            sb14.append(jSONObjectPut.optString(strM301, str6));
                            sb14.append(strM43);
                            sb14.append(jSONObjectPut.optString(strM288, str6));
                            string = sb14.toString();
                            hashSet2 = hashSet;
                            if (hashSet2.add(string)) {
                                hashSet3 = hashSet2;
                                jSONArray3 = jSONArray2;
                            } else {
                                jSONArray = jSONArray2;
                                jSONArray.put(jSONObjectPut);
                                if (jSONArray.length() >= 16) {
                                    break;
                                    break;
                                }
                                jSONArray3 = jSONArray;
                                hashSet3 = hashSet2;
                            }
                        }
                        i = 1;
                    }
                    if (jSONArray.length() == 0) {
                        return null;
                    }
                    return new JSONObject().put("schema", 3).put("candidates", jSONArray);
                } catch (Exception unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static boolean m(int i, String str, String str2, byte[] bArr) {
        String str3 = str2;
        String str4 = str;
        if (i != 200 && i != 206) {
            return false;
        }
        if (str4 == null) {
            str4 = "";
        }
        Locale locale = Locale.US;
        String lowerCase = str4.toLowerCase(locale);
        if (str3 == null) {
            str3 = "";
        }
        String lowerCase2 = str3.toLowerCase(locale);
        String lowerCase3 = new String(bArr == null ? new byte[0] : bArr, StandardCharsets.UTF_8).trim().toLowerCase(locale);
        if (lowerCase.contains("text/html") || lowerCase.contains("application/json") || lowerCase.contains("application/xml") || lowerCase3.startsWith("<html") || lowerCase3.startsWith("<!doctype") || lowerCase3.startsWith("<error") || lowerCase3.startsWith("{\"code\"") || lowerCase3.contains("nosuchkey")) {
            return false;
        }
        if (lowerCase2.contains(".m3u8") || lowerCase.contains("mpegurl")) {
            return lowerCase3.startsWith("#extm3u");
        }
        if (lowerCase2.contains(".mp4") || lowerCase.startsWith("video/")) {
            return true;
        }
        return bArr != null && bArr.length > 0;
    }

    public static long n() {
        return System.nanoTime() / 1000000;
    }

    public static String o(int i, JSONObject jSONObject) {
        int iMax = Math.max(1, jSONObject.optInt("page", i));
        int iMax2 = Math.max(1, jSONObject.optInt("limit", 20));
        int iMax3 = Math.max(0, jSONObject.optInt("total", 0));
        int iMax4 = Math.max(iMax, jSONObject.optInt("pagecount", iMax3 == 0 ? iMax : ((iMax3 + iMax2) - 1) / iMax2));
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.o(iMax, iMax4, iMax2, iMax3);
        gVar.F(u(jSONObject.optJSONArray("list")));
        return gVar.r();
    }

    public static JSONObject q(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            throw new IOException("NiuLai php returned empty response");
        }
        JSONObject jSONObject = new JSONObject(str);
        Object objOpt = jSONObject.opt("moyufucking");
        if (jSONObject.length() == 1 && (objOpt instanceof String)) {
            String str2 = (String) objOpt;
            if (!TextUtils.isEmpty(str2)) {
                byte[] bArrS = FishCrypto.s("N1.2U/qunuxTSpsXCuPv6WXa6/ChMPa4rht2XUFagrTzVsISb6YGJuOc6ShwpU34WDb1dQssf0fRBNx2ZVth8ddelQEZ0R/QwCZLZsaC2RGQlY=", "N1.fnh4P82jeGLQWrffGBb2JB/M/jYIThP7CBusnli+QNh/+fdnsz6sK8QddZJLs4p7bN9EN5DqxCexLdtIcLgjVxZ9jUw0Ww+U+MlzpzhY+Vg=", Base64.decode(str2, 0));
                if (bArrS != null) {
                    return new JSONObject(new String(bArrS, StandardCharsets.UTF_8));
                }
                throw new IOException("NiuLai bridge response decryption failed");
            }
        }
        throw new IOException("NiuLai bridge response envelope is invalid");
    }

    public static JSONObject r(String str) throws IOException {
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        JSONObject jSONObject = new JSONObject(str2.trim());
        if (jSONObject.length() == 2) {
            String strM31 = "php";
            if (jSONObject.has(strM31)) {
                String strM499 = "site";
                if (jSONObject.has(strM499)) {
                    String strOptString = jSONObject.optString(strM31, "");
                    if (strOptString == null) {
                        strOptString = "";
                    }
                    String strTrim = strOptString.trim();
                    while (strTrim.endsWith("/")) {
                        strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
                    }
                    String strTrim2 = jSONObject.optString(strM499, "").trim();
                    HttpUrl httpUrl = HttpUrl.parse(strTrim);
                    if (httpUrl == null || !(("http".equals(httpUrl.scheme()) || "https".equals(httpUrl.scheme())) && strTrim2.matches("[a-z0-9][a-z0-9_-]{0,63}"))) {
                        throw new IOException("NiuLai ext requires php and site");
                    }
                    return new JSONObject().put(strM31, strTrim).put(strM499, strTrim2);
                }
            }
        }
        throw new IOException("NiuLai ext requires only php and site");
    }

    public static LinkedHashMap s(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject == null) {
            return linkedHashMap;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String strTrim = jSONObjectOptJSONObject.optString("key", "").trim();
                        String strTrim2 = jSONObjectOptJSONObject.optString("name", strTrim).trim();
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("values");
                        if (!TextUtils.isEmpty(strTrim) && jSONArrayOptJSONArray2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                                if (jSONObjectOptJSONObject2 != null) {
                                    String strOptString = jSONObjectOptJSONObject2.optString("n", "");
                                    String strOptString2 = jSONObjectOptJSONObject2.optString("v", "");
                                    if (!TextUtils.isEmpty(strOptString)) {
                                        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strOptString, strOptString2));
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                arrayList.add(new com.github.catvod.spider.merge.p001b.d(strTrim, strTrim2, arrayList2));
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put(next, arrayList);
            }
        }
        return linkedHashMap;
    }

    public static PlayerResolution t(JSONObject jSONObject) throws IOException {
        String strTrim = jSONObject.optString("url", "").trim();
        if (TextUtils.isEmpty(strTrim) || HttpUrl.parse(strTrim) == null) {
            throw new IOException("PLAY_URL_EMPTY");
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObjectOptJSONObject.optString(next, "");
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOptString)) {
                    linkedHashMap.put(next, strOptString);
                }
            }
        }
        return new PlayerResolution(iOptInt, strTrim, linkedHashMap);
    }

    public static ArrayList u(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("id", "");
                String strOptString2 = jSONObjectOptJSONObject.optString("name", "");
                String strOptString3 = jSONObjectOptJSONObject.optString("pic", "");
                String strOptString4 = jSONObjectOptJSONObject.optString("remarks", "");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    arrayList.add(new k(strOptString, strOptString2, strOptString3, strOptString4));
                }
            }
        }
        return arrayList;
    }

    public static ArrayList w(Episode episode, List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(episode);
        if (list != null) {
            String str = episode.a;
            if (!TextUtils.isEmpty(str)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Episode episode2 = (Episode) it.next();
                    if (str.equals(episode2.a) && (!episode.c.equals(episode2.c) || !episode.b.equals(episode2.b))) {
                        arrayList.add(episode2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static String y(String str, Exception exc) {
        String strM516;
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        String lowerCase = message.toLowerCase(Locale.US);
        boolean zContains = lowerCase.contains("playback_timeout");
        String strM219 = "PLAYBACK_TIMEOUT";
        String strM102 = "REGISTER_COOLDOWN";
        String strM454 = "SESSION_EXPIRED";
        String strM360 = "SOURCE_EXPIRED";
        String strM382 = "INIT_FAILED";
        if (zContains || lowerCase.contains("timeout")) {
            strM516 = strM219;
        } else if (lowerCase.contains("registration cooldown") || lowerCase.contains("register_cooldown")) {
            strM516 = strM102;
        } else if (lowerCase.contains("session_expired") || lowerCase.contains("session expired") || lowerCase.contains("state expired") || lowerCase.contains("ticket expired") || lowerCase.contains("token expired") || lowerCase.contains("token missing") || lowerCase.contains("login rejected") || lowerCase.contains("motion rejected") || lowerCase.contains("motion failed") || lowerCase.contains("session failed")) {
            strM516 = strM454;
        } else if (lowerCase.contains("source_expired") || lowerCase.contains("nosuchkey") || lowerCase.contains("play_url_empty") || lowerCase.contains("player rejected") || lowerCase.contains("player url invalid") || lowerCase.contains("media probe rejected") || "media".equals(str)) {
            strM516 = strM360;
        } else {
            strM516 = "init".equals(str) ? strM382 : "PLAYBACK_UNAVAILABLE";
        }
        if (strM219.equals(strM516)) {
            return "播放线路响应超时，请稍后重试或切换线路";
        }
        if (strM102.equals(strM516)) {
            return "播放身份正在冷却，请稍后重试";
        }
        if (strM454.equals(strM516)) {
            return "播放会话已失效，请稍后重试";
        }
        if (strM360.equals(strM516)) {
            return "视频地址已失效，系统已尝试其他线路，请稍后重试";
        }
        return strM382.equals(strM516) ? "服务配置获取失败，请检查网络后重试" : "播放线路暂不可用，请稍后重试或切换线路";
    }

    public static int z(int i, String str, Map map) {
        Object obj = map.get(str);
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    public final boolean B(int i, String str, LinkedHashMap linkedHashMap) {
        byte[] byteArray;
        int i2;
        Request.Builder builderUrl = new Request.Builder().url(str);
        String strM467 = "Accept-Encoding";
        String strM36 = "identity";
        Request.Builder builderHeader = builderUrl.header(strM467, strM36);
        String strM360 = "Cache-Control";
        String strM355 = "no-cache";
        Request.Builder builderHeader2 = builderHeader.header(strM360, strM355);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                builderHeader2.header((String) entry.getKey(), (String) entry.getValue());
            }
        }
        builderHeader2.header("Range", "bytes=0-4095").header(strM467, strM36).header(strM360, strM355);
        Response responseJ = X1.J(builderHeader2.build(), H(i));
        try {
            ResponseBody responseBodyBody = responseJ.body();
            if (responseBodyBody == null) {
                byteArray = new byte[0];
            } else {
                InputStream inputStreamByteStream = responseBodyBody.byteStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int iMin = Math.min(1024, 4096);
                byte[] bArr = new byte[iMin];
                while (byteArrayOutputStream.size() < 4096 && (i2 = inputStreamByteStream.read(bArr, 0, Math.min(iMin, 4096 - byteArrayOutputStream.size()))) >= 0) {
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
            boolean zM = m(responseJ.code(), responseJ.header("Content-Type", ""), str, byteArray);
            responseJ.close();
            return zM;
        } catch (Throwable th) {
            if (responseJ != null) {
                try {
                    responseJ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void F(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.o) {
            try {
                this.o.put(str, Long.valueOf(j));
                while (this.o.size() > 256) {
                    LinkedHashMap linkedHashMap = this.o;
                    linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final TargetReply G(JSONObject jSONObject) throws IOException {
        String str;
        String strM477 = "method";
        String strM516 = "GET";
        String upperCase = jSONObject.optString(strM477, strM516).trim().toUpperCase(Locale.US);
        boolean zEquals = strM516.equals(upperCase);
        String strM445 = "HEAD";
        if (!zEquals && !"POST".equals(upperCase) && !strM445.equals(upperCase)) {
            throw new IOException("NiuLai target method is invalid");
        }
        HttpUrl httpUrl = HttpUrl.parse(jSONObject.optString("url", "").trim());
        if (httpUrl == null || !("http".equals(httpUrl.scheme()) || "https".equals(httpUrl.scheme()))) {
            throw new IOException("NiuLai target URL is invalid");
        }
        Request.Builder builderUrl = new Request.Builder().url(httpUrl);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
        if (jSONObjectOptJSONObject == null) {
            str = "";
        } else {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            str = "";
            int i = 0;
            int length = 0;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObjectOptJSONObject.optString(next, "");
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOptString)) {
                    i++;
                    String str2 = next == null ? "" : next;
                    Charset charset = StandardCharsets.UTF_8;
                    length += (strOptString == null ? "" : strOptString).getBytes(charset).length + str2.getBytes(charset).length;
                    if (i > 64 || length > 32768) {
                        throw new IOException("NiuLai target headers are too large");
                    }
                    try {
                        builderUrl.header(next, strOptString);
                        if ("content-type".equalsIgnoreCase(next)) {
                            str = strOptString;
                        }
                    } catch (IllegalArgumentException e) {
                        throw new IOException("NiuLai target header is invalid", e);
                    }
                }
            }
        }
        String strOptString2 = jSONObject.optString("body_b64", "");
        int length2 = (strOptString2 == null ? "" : strOptString2).length();
        String strM108 = "NiuLai request body too large";
        if (length2 > 11184818) {
            throw new IOException(strM108);
        }
        try {
            byte[] bArrDecode = Base64.decode(strOptString2 != null ? strOptString2 : "", 0);
            if (bArrDecode.length > 8388608) {
                try {
                    throw new IOException(strM108);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new IOException("NiuLai request body is invalid", e);
                }
            }
            if (strM516.equals(upperCase)) {
                if (bArrDecode.length != 0) {
                    throw new IOException("NiuLai GET body is invalid");
                }
                builderUrl.get();
            } else if (!strM445.equals(upperCase)) {
                builderUrl.post(RequestBody.create(TextUtils.isEmpty(str) ? null : MediaType.parse(str), bArrDecode));
            } else {
                if (bArrDecode.length != 0) {
                    throw new IOException("NiuLai HEAD body is invalid");
                }
                builderUrl.head();
            }
            Response responseK = X1.K(builderUrl.build(), H(30));
            try {
                ResponseBody responseBodyBody = responseK.body();
                TargetReply targetReply = new TargetReply(responseK.code(), Base64.encodeToString((responseBodyBody == null || responseK.isRedirect()) ? new byte[0] : C(responseBodyBody.byteStream()), 2));
                responseK.close();
                return targetReply;
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
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
        }
    }

    public final long H(int i) throws IOException {
        long jMax = ((long) Math.max(1, i)) * 1000;
        Long l = (Long) this.p.get();
        if (l == null) {
            return jMax;
        }
        long jLongValue = l.longValue() - n();
        if (jLongValue > 0) {
            return Math.max(1L, Math.min(jMax, jLongValue));
        }
        throw new IOException("PLAYBACK_TIMEOUT");
    }

    public final void I() {
        this.e = "";
        this.d = "";
        this.c = "";
        this.b = "";
        this.a = "";
        this.f = JSONObject.NULL;
        this.g = null;
        this.h = "";
        this.i = "";
        this.j = null;
        this.k = false;
        this.l = false;
        this.m = false;
        synchronized (this.n) {
            this.n.clear();
        }
        synchronized (this.o) {
            this.o.clear();
        }
        this.p.remove();
    }

    public final void K(Object obj) throws IOException {
        String string;
        Object obj2 = obj;
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        this.f = obj2;
        if (this.g == null || TextUtils.isEmpty(this.h)) {
            return;
        }
        Object obj3 = this.f;
        if (obj3 == JSONObject.NULL) {
            e();
            return;
        }
        if ((obj3 instanceof JSONObject) || (obj3 instanceof JSONArray)) {
            string = obj3.toString();
        } else if (obj3 instanceof String) {
            string = JSONObject.quote((String) obj3);
        } else {
            if (!(obj3 instanceof Number) && !(obj3 instanceof Boolean)) {
                throw new IOException("NiuLai bridge state type is invalid");
            }
            string = obj3.toString();
        }
        if (string.getBytes(StandardCharsets.UTF_8).length > 524288) {
            throw new IOException("NiuLai bridge state too large");
        }
        SharedPreferences.Editor editorPutString = this.g.edit().putString(this.h, string);
        if (this.l) {
            editorPutString.putBoolean(this.i, true);
        }
        if (!editorPutString.commit()) {
            throw new IOException("NiuLai bridge state persistence failed");
        }
        if (this.l) {
            this.k = true;
        }
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strTrim = jSONObject.optString("playname", "").trim();
        if (!TextUtils.isEmpty(strTrim)) {
            this.c = strTrim;
        }
        if (jSONObject.optBoolean("legacy_migration_done")) {
            this.l = true;
        }
    }

    public final synchronized JSONObject b(String str, JSONObject jSONObject) {
        return c(str, jSONObject, true);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0185  */
    /* JADX WARN: Code duplicated, block: B:32:0x018d  */
    /* JADX WARN: Code duplicated, block: B:33:0x018e A[Catch: BridgeResetException -> 0x01c0, TryCatch #2 {BridgeResetException -> 0x01c0, blocks: (B:26:0x017e, B:49:0x01bc, B:52:0x01c5, B:30:0x0187, B:40:0x01a0, B:45:0x01ad, B:33:0x018e, B:36:0x0196), top: B:98:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0194  */
    /* JADX WARN: Code duplicated, block: B:36:0x0196 A[Catch: BridgeResetException -> 0x01c0, TryCatch #2 {BridgeResetException -> 0x01c0, blocks: (B:26:0x017e, B:49:0x01bc, B:52:0x01c5, B:30:0x0187, B:40:0x01a0, B:45:0x01ad, B:33:0x018e, B:36:0x0196), top: B:98:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:38:0x019c  */
    /* JADX WARN: Code duplicated, block: B:39:0x019e  */
    /* JADX WARN: Code duplicated, block: B:89:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:92:0x02f8  */
    public final JSONObject c(String str, JSONObject jSONObject, boolean z) throws JSONException, InterruptedException, IOException {
        String str2;
        long jMax;
        long jMax2;
        String str3 = str;
        String strM539 = "meta";
        String strM358 = "scene";
        String strM31 = "site";
        String strM175 = "action";
        String strM199 = "ticket";
        String strM382 = "state";
        Object obj = this.f;
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        int i = 0;
        while (i < 48) {
            try {
                JSONObject jSONObjectPut = new JSONObject().put(strM175, "prepare").put(strM31, this.b).put(strM358, str3).put("params", r20 == 0 ? new JSONObject() : jSONObject).put(strM382, obj).put("device_id", this.d).put("hardware_id", this.e);
                boolean z2 = this.k;
                JSONObject jSONObject2 = this.j;
                if (!z2 && jSONObject2 != null) {
                    jSONObjectPut.put("legacy_identity", jSONObject2);
                }
                JSONObject jSONObjectV = v(jSONObjectPut);
                a(jSONObjectV.optJSONObject(strM539));
                if (jSONObjectV.has(strM382)) {
                    obj = jSONObjectV.get(strM382);
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectV.optJSONObject("request");
                if (jSONObjectOptJSONObject == null) {
                    throw new IOException("NiuLai bridge prepare request missing");
                }
                String strM445 = "wait_ms";
                boolean zHas = jSONObjectV.has(strM445);
                String strM545 = "waitMs";
                String str4 = strM382;
                Object obj2 = obj;
                String strM177 = "delay_ms";
                if (zHas) {
                    if (!jSONObjectV.has(strM445)) {
                        if (jSONObjectV.has(strM545)) {
                            strM445 = strM545;
                        } else if (jSONObjectV.has(strM177)) {
                            strM445 = strM177;
                        } else {
                            strM445 = "";
                        }
                    }
                    if (TextUtils.isEmpty(strM445)) {
                        jMax = 0;
                    } else {
                        jMax = Math.max(0L, Math.min(jSONObjectV.getLong(strM445), 2000L));
                    }
                } else {
                    try {
                        if (jSONObjectV.has(strM545)) {
                            if (!jSONObjectV.has(strM445)) {
                                if (jSONObjectV.has(strM545)) {
                                    strM445 = strM545;
                                } else if (jSONObjectV.has(strM177)) {
                                    strM445 = strM177;
                                } else {
                                    strM445 = "";
                                }
                            }
                            if (TextUtils.isEmpty(strM445)) {
                                jMax = 0;
                            } else {
                                try {
                                    jMax = Math.max(0L, Math.min(jSONObjectV.getLong(strM445), 2000L));
                                } catch (Exception unused) {
                                    jMax = 0;
                                }
                            }
                        } else {
                            jMax = 0;
                        }
                    } catch (BridgeResetException e) {
                        e = e;
                        str2 = str;
                        if (z) {
                            throw e;
                        }
                        this.f = JSONObject.NULL;
                        e();
                        this.m = false;
                        JSONObject jSONObjectC = c(str2, jSONObject, false);
                        this.m = true;
                        return jSONObjectC;
                    }
                }
                if (jMax > 0) {
                    Thread.sleep(jMax);
                }
                TargetReply targetReplyG = G(jSONObjectOptJSONObject);
                str2 = str;
                try {
                    JSONObject jSONObjectV2 = v(new JSONObject().put(strM175, "consume").put(strM31, this.b).put(strM358, str2).put(strM199, jSONObjectV.has(strM199) ? jSONObjectV.get(strM199) : JSONObject.NULL).put("status", targetReplyG.a).put("body", targetReplyG.b));
                    a(jSONObjectV2.optJSONObject(strM539));
                    Object obj3 = jSONObjectV2.has(str4) ? jSONObjectV2.get(str4) : obj2;
                    if (!jSONObjectV2.optBoolean("next")) {
                        if (jSONObjectV2.has(str4)) {
                            K(obj3);
                        }
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectV2.optJSONObject("result");
                        return jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2;
                    }
                    if (jSONObjectV2.has(strM177)) {
                        try {
                            jMax2 = Math.max(0L, Math.min(jSONObjectV2.getLong(strM177), 2000L));
                        } catch (Exception unused2) {
                            jMax2 = 0;
                        }
                    } else {
                        jMax2 = 0;
                    }
                    if (jMax2 > 0) {
                        Thread.sleep(jMax2);
                    }
                    i++;
                    strM382 = str4;
                    obj = obj3;
                    str3 = str2;
                } catch (BridgeResetException e2) {
                    e = e2;
                    if (z) {
                        throw e;
                    }
                    this.f = JSONObject.NULL;
                    e();
                    this.m = false;
                    JSONObject jSONObjectC2 = c(str2, jSONObject, false);
                    this.m = true;
                    return jSONObjectC2;
                }
            } catch (BridgeResetException e3) {
                e = e3;
                str2 = str3;
            }
        }
        throw new IOException("NiuLai bridge request exceeded round limit");
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

    public final void e() {
        if (this.g != null && !TextUtils.isEmpty(this.h)) {
            SharedPreferences.Editor editorRemove = this.g.edit().remove(this.h);
            if (!TextUtils.isEmpty(this.i)) {
                editorRemove.remove(this.i);
            }
            editorRemove.commit();
        }
        this.k = false;
        this.l = false;
    }

    public final synchronized void f() {
        if (this.m) {
            return;
        }
        if (this.f != JSONObject.NULL) {
            this.m = true;
        } else {
            b("init", new JSONObject().put("sdk", Build.VERSION.SDK_INT));
            this.m = true;
        }
    }

    public final void h(String str) {
        String str2 = str;
        synchronized (this.o) {
            LinkedHashMap linkedHashMap = this.o;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.remove(str2);
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

    public synchronized void init(Context context, String str) {
        boolean z;
        SharedPreferences sharedPreferences;
        Context context2 = context;
        synchronized (this) {
            try {
                super.init(context2, str);
                I();
                String strTrim = str == null ? "" : str.trim();
                try {
                    String strG = FishCrypto.g(strTrim);
                    if (!TextUtils.isEmpty(strG)) {
                        strTrim = strG.trim();
                    }
                } catch (Throwable unused) {
                }
                JSONObject jSONObjectR = r(strTrim);
                this.a = jSONObjectR.getString("php");
                this.b = jSONObjectR.getString("site");
                if (TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b)) {
                    throw new IOException("NiuLai ext requires php and site");
                }
                String str2 = "";
                try {
                    String string = Settings.Secure.getString(context2.getContentResolver(), "android_id");
                    if (string != null) {
                        str2 = string;
                    }
                } catch (Throwable unused2) {
                }
                this.d = str2;
                this.e = D();
                JSONObject jSONObjectK = null;
                Context applicationContext = context2 == null ? null : context2.getApplicationContext();
                if (applicationContext != null) {
                    context2 = applicationContext;
                }
                this.g = context2 == null ? null : context2.getSharedPreferences("niulai_bridge_state_v1", 0);
                String strD = d(this.a, this.b, this.d, this.e);
                this.h = strD;
                if (strD == null) {
                    strD = "";
                }
                String strConcat = "legacy_migrated_v3_".concat(strD);
                this.i = strConcat;
                boolean z2 = true;
                try {
                    SharedPreferences sharedPreferences2 = this.g;
                    z = sharedPreferences2 != null && sharedPreferences2.getBoolean(strConcat, false);
                } catch (Exception unused3) {
                }
                Object objL = l();
                this.f = objL;
                if (!z || objL == null || objL == JSONObject.NULL) {
                    z2 = false;
                }
                this.k = z2;
                if (z && !z2 && (sharedPreferences = this.g) != null) {
                    sharedPreferences.edit().remove(this.i).commit();
                }
                if (context2 != null) {
                    jSONObjectK = k(context2.getSharedPreferences("smtv_session_v1", 0), this.d);
                }
                this.j = jSONObjectK;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(long j, String str) {
        String str2 = str;
        synchronized (this.o) {
            try {
                Long l = (Long) this.o.get(str2 == null ? "" : str2);
                if (l == null) {
                    return false;
                }
                long jLongValue = j - l.longValue();
                if (jLongValue >= 0 && jLongValue < 120000) {
                    return true;
                }
                LinkedHashMap linkedHashMap = this.o;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.remove(str2);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object l() {
        if (this.g == null || TextUtils.isEmpty(this.h)) {
            return JSONObject.NULL;
        }
        try {
            String string = this.g.getString(this.h, "");
            if (TextUtils.isEmpty(string)) {
                return JSONObject.NULL;
            }
            if (string.getBytes(StandardCharsets.UTF_8).length > 524288) {
                e();
                return JSONObject.NULL;
            }
            try {
                Object objNextValue = new JSONTokener(string).nextValue();
                return objNextValue == null ? JSONObject.NULL : objNextValue;
            } catch (Exception unused) {
                e();
                return JSONObject.NULL;
            }
        } catch (Exception unused2) {
            e();
            return JSONObject.NULL;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x01b1  */
    public final k p(String str, JSONObject jSONObject) throws Throwable {
        NiuLai niuLai;
        k kVar;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArray;
        k kVar2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vod");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        k kVar3 = new k();
        String strOptString = jSONObjectOptJSONObject.optString("id", "");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = str;
        }
        kVar3.n(strOptString);
        kVar3.o(jSONObjectOptJSONObject.optString("name", ""));
        kVar3.p(jSONObjectOptJSONObject.optString("pic", ""));
        kVar3.s(jSONObjectOptJSONObject.optString("remarks", ""));
        kVar3.u(jSONObjectOptJSONObject.optString("year", ""));
        kVar3.k(jSONObjectOptJSONObject.optString("area", ""));
        kVar3.i(jSONObjectOptJSONObject.optString("type", ""));
        kVar3.j(jSONObjectOptJSONObject.optString("actor", ""));
        kVar3.m(jSONObjectOptJSONObject.optString("director", ""));
        kVar3.l(jSONObjectOptJSONObject.optString("content", ""));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("sources");
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("video_list");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            int i = 0;
            while (i < jSONArrayOptJSONArray2.length()) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i);
                if (jSONObjectOptJSONObject2 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("episodes")) == null) {
                    jSONArray = jSONArrayOptJSONArray2;
                    kVar2 = kVar3;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    int i2 = 0;
                    while (i2 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject3 != null) {
                            String strTrim = jSONObjectOptJSONObject3.optString("url", "").trim();
                            if (!TextUtils.isEmpty(strTrim) && !"*".equals(strTrim)) {
                                String strJ = J(jSONObjectOptJSONObject3.optString("name", ""));
                                String strTrim2 = jSONObjectOptJSONObject3.optString("line", "").trim();
                                StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strJ, "$");
                                StringBuilder sb = new StringBuilder("smtv:");
                                String str2 = strTrim2 != null ? strTrim2 : "";
                                Charset charset = StandardCharsets.UTF_8;
                                sb.append(Base64.encodeToString(str2.getBytes(charset), 11));
                                String strM285 = ":";
                                sb.append(strM285);
                                sb.append(Base64.encodeToString((strJ == null ? "" : strJ).getBytes(charset), 11));
                                sb.append(strM285);
                                sb.append(Base64.encodeToString((strTrim == null ? "" : strTrim).getBytes(charset), 11));
                                sbP.append(sb.toString());
                                arrayList4.add(sbP.toString());
                                arrayList3.add(new Episode(strJ, strTrim2, strTrim));
                            }
                        }
                        i2++;
                        jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        kVar3 = kVar3;
                    }
                    jSONArray = jSONArrayOptJSONArray2;
                    kVar2 = kVar3;
                    if (!arrayList4.isEmpty()) {
                        String strB = C0294s1.b(jSONObjectOptJSONObject2.optString("name", "").trim());
                        if (TextUtils.isEmpty(strB)) {
                            strB = "线路" + (arrayList.size() + 1);
                        }
                        arrayList.add(J(strB));
                        arrayList2.add(TextUtils.join("#", arrayList4));
                    }
                }
                i++;
                jSONArrayOptJSONArray2 = jSONArray;
                kVar3 = kVar2;
            }
        }
        k kVar4 = kVar3;
        if (arrayList2.isEmpty()) {
            niuLai = this;
            kVar = kVar4;
        } else {
            C0294s1.e(arrayList, arrayList2);
            niuLai = this;
            C0294s1.c(niuLai.c, arrayList);
            String strJoin = TextUtils.join("$$$", arrayList);
            kVar = kVar4;
            kVar.q(strJoin);
            kVar.r(TextUtils.join("$$$", arrayList2));
            AbstractC0280n1.m(kVar.c(), kVar.e());
        }
        String strC = kVar.c();
        String strE = kVar.e();
        if (!arrayList3.isEmpty()) {
            ArrayList<Episode> arrayList5 = new ArrayList(arrayList3);
            synchronized (niuLai.n) {
                try {
                    for (Episode episode : arrayList5) {
                        niuLai.n.put(episode.b + "\n" + episode.c, new PlaybackContext(strC, strE, arrayList5));
                    }
                    while (niuLai.n.size() > 2048) {
                        LinkedHashMap linkedHashMap = niuLai.n;
                        linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kVar;
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

    public final JSONObject v(JSONObject jSONObject) throws IOException {
        boolean z;
        String strM499 = "state";
        String strM379 = "NiuLai php HTTP ";
        if (TextUtils.isEmpty(this.a)) {
            throw new IOException("NiuLai php is not configured");
        }
        Request.Builder builderUrl = new Request.Builder().url(this.a);
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        String string = jSONObject.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bArrT = FishCrypto.t("N1.2U/qunuxTSpsXCuPv6WXa6/ChMPa4rht2XUFagrTzVsISb6YGJuOc6ShwpU34WDb1dQssf0fRBNx2ZVth8ddelQEZ0R/QwCZLZsaC2RGQlY=", "N1.fnh4P82jeGLQWrffGBb2JB/M/jYIThP7CBusnli+QNh/+fdnsz6sK8QddZJLs4p7bN9EN5DqxCexLdtIcLgjVxZ9jUw0Ww+U+MlzpzhY+Vg=", "N1.WMJB/EG0gH1h/GdH+S/snciMxYClMhEg3tcEFfsuDR6P6usZ260kyRdLW1qRJ/lCXFMkZpQ6rz5QXPauu6hhQw==", "N1.4NoiCj5Kcd86gO0pXq4JRI8A8gMYmMffvAkUznvOnPZiD7o5W5ajRvqJn33QKc5WlVajldPTlqy5IsTFoD6scABm2nKyrSPggWocejjmtTuek+kUsJjv8wZJGqs0P6a/i7n/y+WuUYjtuLFPB0S1cQ==", string.getBytes(charset));
        if (bArrT == null) {
            throw new IOException("NiuLai bridge request encryption failed");
        }
        Response responseK = X1.K(builderUrl.post(RequestBody.create(mediaType, new JSONObject().put("moyufucking", Base64.encodeToString(bArrT, 2)).toString())).build(), H(30));
        try {
            if (responseK.isRedirect()) {
                throw new IOException("NiuLai php redirect is not allowed");
            }
            if (!responseK.isSuccessful()) {
                throw new IOException(strM379 + responseK.code());
            }
            ResponseBody responseBodyBody = responseK.body();
            if (responseBodyBody == null) {
                throw new IOException("NiuLai php returned no response");
            }
            JSONObject jSONObjectQ = q(new String(C(responseBodyBody.byteStream()), charset));
            boolean zOptBoolean = jSONObjectQ.optBoolean("ok");
            String strM210 = "data";
            if (zOptBoolean) {
                JSONObject jSONObjectOptJSONObject = jSONObjectQ.optJSONObject(strM210);
                if (jSONObjectOptJSONObject == null) {
                    throw new IOException("NiuLai php data missing");
                }
                responseK.close();
                return jSONObjectOptJSONObject;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectQ.optJSONObject(strM210);
            if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.has(strM499)) {
                z = false;
            } else {
                try {
                    Object obj = jSONObjectOptJSONObject2.get(strM499);
                    this.f = obj;
                    K(obj);
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
            }
            boolean zOptBoolean2 = jSONObjectQ.optBoolean("reset");
            String strM169 = "error";
            if (!zOptBoolean2 || z) {
                throw new IOException(jSONObjectQ.optString(strM169, "NiuLai php failed"));
            }
            this.f = JSONObject.NULL;
            e();
            this.m = false;
            throw new BridgeResetException(jSONObjectQ.optString(strM169, "NiuLai php state expired"));
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

    public final PlaybackContext x(String str) {
        Episode episodeL = L(str);
        synchronized (this.n) {
            try {
                PlaybackContext playbackContext = (PlaybackContext) this.n.get(episodeL.b + "\n" + episodeL.c);
                if (playbackContext != null) {
                    return playbackContext;
                }
                for (Map.Entry entry : this.n.entrySet()) {
                    Iterator it = ((PlaybackContext) entry.getValue()).c.iterator();
                    while (it.hasNext()) {
                        if (episodeL.c.equals(((Episode) it.next()).c)) {
                            return (PlaybackContext) entry.getValue();
                        }
                    }
                }
                return new PlaybackContext("", "", Collections.singletonList(episodeL));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

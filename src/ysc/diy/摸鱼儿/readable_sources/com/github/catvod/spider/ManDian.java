package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0294s1;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.D.C0006;
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
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.C0451c;
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
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class ManDian extends Spider {
    public volatile OkHttpClient b;
    public volatile long c;
    public String d;
    public String e;
    public volatile JSONObject f;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f67short = {723, 2290, 2301, 2282, 32713, 21901, 21867, -28214, 30557, -29733, 21460, 28247, 32764, 23158, 2351, 2353, 2341, 1537, 1558, 1600, 1536, 1543, 1539, 1653, 1543, 1537, 1604, 1562, 1628, 1553, 1621, 1604, 1625, 1565, 1621, 1615, 1605, 1631, 1621, 1604, 1602, 1631, 1621, 1629, 1626, 1536, 1537, 1558, 1555, 1549, 1621, 1650, 1558, 1551, 1546, 1652, 1543, 1539, 1536, 1936, 1951, 1928, 691, 692, 694, 702, 1648, 1640, 1647, 1638, 1656, 1640, 1647, 1638, 1595, 1650, 1653, 1632, 1653, 1652, 1650, 26101, 29742, 22071, -29718, 26439, 32173, -1139, 31239, 23365, 27995, 32181, 23497, 17901, -24665, -32431, 1653, 1635, 1639, 1652, 1637, 1646, 722, 705, 1378, 1395, 1397, 1399, 1477, 1484, 1489, 1486, 1474, 1495, 608, 636, 625, 617, 665, 667, 656, 657, 291, 292, 314, 2429, 2416, 2411, 2428, 2426, 2413, 2868, 2854, 2849, 26418, 22388, -29885, 21065, 25533, 29554, 24634, 25001, 28342, 23448, 609, 620, 616, 621, 620, 635, 634, 2124, 2134, 2106, 2125, 2166, 2106, 2157, 2087, 2106, 2094, 2102, 2100, 2099, 2097, 2121, 2120, 2105, 2108, 2106, 2122, 2108, 2104, 2124, 2134, 2106, 2125, 2166, 2106, 2157, 2087, 2106, 2094, 2102, 2100, 2099, 2097, 2121, 2120, 2105, 2108, 2106, 2122, 2108, 25592, 25195, 28521, 22618, 1909, 1809, 1793, 1818, 1909, -28084, -29510, 1023, 1000, 1000, 1013, 1000, 3066, 3066, 3066, 3132, 3112, 3125, 3127, 1138, 1151, 26667, 31216, 2409, 2329, 2305, 2329, 2409, 24876, 27372, 2371, 28233, -31080, -25520, -32090, -2477, 1065, 1073, 1078, 1087, 1057, 1073, 1078, 1087, 1122, 1067, 1068, 1081, 1068, 1069, 1067, 2066, 2062, 2117, 2060, 2059, 2078, 2059, 2058, 2060, 2795, 2794, 2811, 2798, 2790, 2787, 397, 404, 415, 1199, 1194, 1197, 1190, 1200, 2224, 2239, 2227, 2235, 2685, 2664, 2673, 2667, 2679, 2684, 2685, 2667, 1655, 1648, 1646, 2920, 2972, 2971, 2961, 2960, 2957, 532, 608, 633, 627, 1949, 1930, 1922, 1934, 1949, 1924, 1287, 1285, 1298, 1289, 1300, 2490, 2487, 2476, 2491, 2493, 2474, 2481, 2476, 1344, 1357, 1348, 1361, 1607, 1620, 1603, 1607, 582, 602, 606, 589, 1682, 1694, 1695, 1669, 1684, 1695, 1669, 25861, 29918, 2697, 2700, 2710, 2705, 288, 313, 306, 265, 314, 311, 312, 305, 2285, 2272, 2287, 2278, 23032, 29902, -29329, 26188, 27176, 24960, 21862, 29601, 30774, -29850, 1702, -27008, -28593, -30443, 25142, 723, 695, 679, 700, 723, 32229, 20740, 19710, 20938, -27714, 27419, 31424, -32333, 28628, 30936, 23539, 22675, 30117, 30964, 21525, 2322, 2307, 2334, 2322, 2377, 2326, 2314, 2311, 2319, 2312, 2397, 2374, 2309, 2318, 2311, 2324, 2325, 2307, 2322, 2395, 2323, 2322, 2304, 2379, 2398, 26234, -27494, 25782, 21674, 19833, 30620, 2885, 2896, 2902, 1356, 1318, 1338, 1314, 1354, 1724, 1697, 1708, 2739, 2722, 2724, 2726, 2240, 2259, 2244, 2240, 3165, 3137, 3141, 3158, 1232, 1229, 1243, 1242, 1229, 21619, -27149, 2414, 2401, 2412, 2430, 2430, 2514, 2512, 2501, 2516, 2518, 2526, 2499, 2504, 22526, 31107, 31470, 22031, 23404, 19394, 1496, 1481, 9707, 1485, 466, 462, 455, 471, 480, 473, 393, 391, 475, 473, 475, 392, 390, 392, 398, 390, 394, 392, 477, 477, 476, 395, 478, 474, 397, 398, 474, 397, 394, 1832, 1844, 1853, 1837, 1818, 1907, 1905, 1831, 1824, 1910, 1917, 1825, 1907, 1917, 1830, 1830, 1827, 1828, 1904, 1917, 1904, 1908, 1906, 1825, 1830, 1906, 1824, 1908, 1828, 917, 911, 995, 916, 943, 995, 948, 1022, 995, 1015, 997, 993, 915, 996, 1011, 949, 1022, 994, 1020, 947, 25508, 26724, 3041, 2947, 2976, 2994, 2980, 3063, 3061, 3041, 25597, 21710, -24872, -32722, 3018, 3037, 2961, 3019, 3020, 3016, 3006, 2962, 2969, 2977, 2956, 2966, 2960, 2958, 2975, 3020, 3016, 1926, 1946, 1946, 1950, 2030, 20734, 20622, 28658, 22721, -27945, -29663, 1802, 1904, 1906, 1909, 1908, 1911, 1910, 1915, 1914, 1919, 1807, 1806, 1805, 1833, 1895, 1889, 1837, 1839, 1889, 1916, 1896, 1808, 1916, 1803, 1840, 1916, 1835, 1916, 1804, 1914, 652, 667, 727, 653, 650, 654, 767, 762, 760, 732, 662, 660, 649, 760, 732, 659, 705, 761, 650, 654, 1488, 1484, 1484, 1480, 1464, 1488, 1533, 1529, 1532, 1533, 1514, 1515, 1464, 20880, 20884, -28543, -29065, 860, 874, 871, 870, 877, 887, 874, 887, 890, 2435, 2434, 2449, 2446, 2436, 2434, 2488, 2446, 2435, 3180, 3185, 3168, 3176, 3190, 2011, 2006, 2640, 2655, 2643, 2651, 1641, 1539, 1567, 1543, 1647, 2060, 2051, 2054, 2078, 2063, 2072, 2073, 2392, 2372, 2368, 2387, 1179, 1166, 1160, 3294, 3277, 3290, 3294, 21083, 17106, 32466, 21794, 23590, 22572, 20535, -28233, 30465, -25517, 3194, 3102, 3086, 3093, 3194, -26301, -30795, 23941, -31661, 1625, 1597, 1581, 1590, 1625, -27808, -29290, 24171, -30787, 1463, 1491, 1475, 1496, 1463, 19373, 32749, 478, 462, 469, 442, 25838, 25834, 23245, 27183, -29680, 29910, 27457, 24705, 772, 878, 887, 875, 874, 772, 27416, 23595, -27075, -30517, 25528, 26744, 3069, 2952, 2953, 2971, 3045, 3058, 2967, 2958, 2962, 2963, 3069, 25569, 21714, -24892, -32718, 847, 885, 825, 882, 804, 825, 813, 841, 879, 807, 806, 873, 1992, 739, 1157, 2667, 581, 601, 537, 530, -25427, -26014, 25763, -30878, -31901, -26149, 2978, 3016, 3028, 3008, 2980, 2978, 3017, 3028, 3008, 2980, 2946, 3017, 3029, 3016, 3009, 2948, 22852, 29810, 31011, 21954, 18488, 24602, 24892, 25469, 27990, 25409, 25413, 532, 515, 597, 533, 596, 584, 584, 588, 591, 515, 518, 531, 531, 615, 610, 608, 591, 609, 535, 1353, 21026, 21074, 22752, -31709, 24669, 1359, 2093, 2106, 2156, 2092, 2119, 2144, 2148, 2167, 2144, 2167, 2137, 2166, 2094, 2142, 2139, 2137, 2166, 2136, 2094, 1829, 1794, 1798, 1813, 1794, 1813, 1863, 1852, 23189, -31146, 25128, 1850, 1420, 1435, 1485, 1421, 1420, 1488, 1483, 1487, 1473, 1482, 1496, 1477, 1489, 1488, 1484, 1531, 1487, 1473, 1501, 1496, 1492, 1477, 1495, 1495, 1491, 1483, 1494, 1472, 1496, 1472, 1473, 1490, 1485, 1479, 1473, 1531, 1485, 1472, 1496, 1477, 1489, 1488, 1484, 1483, 1494, 1485, 1502, 1477, 1488, 1485, 1483, 1482, 1496, 1495, 1485, 1475, 1482, 1477, 1488, 1489, 1494, 1473, 1496, 1487, 1473, 1501, 1496, 1485, 1490, 1496, 1484, 1477, 1482, 1472, 1480, 1473, 1496, 1488, 1485, 1479, 1487, 1473, 1488, 1421, 1528, 1495, 1422, 1535, 1433, 1438, 1529, 1528, 1495, 1422, 1535, 1530, 1410, 1528, 1495, 1529, 1423, 1086, 1067, 1063, 1089, 
    23016, -31445, 24917, 1095, 667, 652, 730, 666, 751, 721, 744, 722, 670, 725, 643, 670, 650, 750, 712, 640, 641, 671, 718, 751, 721, 289, 23688, -32693, 25653, 295, 2148, 2147, 2127, 2116, 2172, 2129, 2123, 2125, 2131, 2114, 2146, 2008, 24778, 28945, -30113, 28138, 22681, -29555, 1182, 1194, 1195, 1207, 1200, 1197, 1206, 1189, 1214, 1195, 1206, 1200, 1201, 2054, 2084, 2105, 2094, 2095, 2171, 2071, 2083, 2082, 2110, 2105, 2084, 2111, 2092, 2103, 2082, 2111, 2105, 2104, 2859, 2876, 2922, 2858, 2881, 2918, 2914, 2929, 2918, 2929, 2911, 2928, 2856, 2861, 2857, 23555, 21448, 24907, 29857, 29899, 27170, -30254, 28263, -26018, 19802, 30477, 517, 621, 625, 625, 629, 630, 2658, 2674, 2665, 2566, 28577, 27914, 20849, 24979, -24769, -32311, 1550, 1554, 1618, 1625, 3300, 3326, 3218, 3301, 3294, 3218, 3269, 3215, 3218, 3206, 3296, 3218, 3298, 3220, -25810, -25119, 25376, -32543, 29745, 29478, -25026, -32568, -28893, 22243, 24932, 26038, 29805, 23461, 30355, -28878, 25617, 20698, -27367, 24932, -27427, -28142, 1600, 2272, 3199, 925, 941, 954, 1014, 940, 939, 943, 985, 1013, 1022, 966, 1003, 1009, 1015, 1001, 1016, 939, 943, -25540, -25869, 27472, 25253, 3093, 3168, 3169, 3187, 3085, 3093, -26324, -30758, -25577, -25896, 25625, -30760, 27515, 25230, 22345, 26539, -26361, -30735, -27876, -27181, 27410, -30509, 22594, 26784, -27124, -30470, 1665, 1669, 2971, 3044, 3067, 2979, 2996, 3007, 2948, 2998, 2963, 2992, 3040, 2993, 2972, 3001, 3042, 2956, 2973, 2944, 2975, 3044, 2978, 2951, 2949, 2966, 2964, 2973, 2979, 3006, 2951, 2945, 3005, 3002, 3044, 2979, 2992, 2989, 2982, 3042, 2988, 2996, 3040, 2991, 2950, 2982, 2961, 2972, 2960, 2962, 2964, 2999, 2975, 2998, 3047, 3042, 2959, 2951, 2945, 2980, 2976, 2972, 3002, 3047, 2972, 3045, 2964, 3070, 2993, 2979, 3042, 2980, 2945, 2961, 3005, 2994, 2944, 2981, 2982, 2974, 2992, 2998, 2989, 2949, 2968, 2976, 2944, 2977, 2970, 2973, 2946, 2980, 3004, 2980, 3042, 2947, 3053, 2996, 2962, 2946, 2988, 2999, 2946, 3005, 3042, 3046, 3043, 2993, 2966, 2948, 3001, 2948, 3048, 1819, 1892, 1915, 1839, 1843, 1853, 1841, 1828, 1853, 1796, 1817, 1804, 1893, 1798, 1895, 1831, 1888, 1807, 1818, 1892, 1849, 1819, 1854, 1829, 1844, 1894, 1848, 1851, 1836, 1855, 1817, 1855, 1811, 1804, 1827, 1814, 1914, 1807, 1851, 1812, 1889, 1844, 1850, 1827, 1828, 1839, 1836, 1842, 1825, 1824, 1836, 1796, 1804, 1804, 1831, 1900, 1895, 1891, 1804, 1798, 1918, 1829, 1914, 1888, 1892, 1823, 1795, 1818, 1815, 1893, 1889, 1849, 1823, 1890, 1820, 1849, 1804, 1855, 1891, 1901, 1824, 1827, 1817, 1822, 1815, 1839, 1814, 1895, 1821, 1827, 1796, 1819, 1828, 1816, 1811, 1890, 1848, 1818, 1888, 1799, 1826, 1805, 1819, 1797, 1900, 1824, 1855, 1852, 1841, 1893, 1896, 435, 433, 423, 427, 440, 427, 445, 437, 439, 432, 441, 2495, 2471, 2495, 2511, 28386, 23374, 2511, 2471, 2491, 2491, 2495, 2511, 899, 1020, 995, 1020, 1019, 1022, 1021, 1013, 1016, 922, 958, 936, 1018, 936, 949, 957, 1013, 956, 953, 923, 917, 949, 1016, 901, 906, 956, 952, 952, 998, 916, 953, 1022, 927, 903, 955, 1016, 930, 910, 958, 917, 903, 998, 1019, 926, 958, 931, 956, 919, 904, 933, 904, 897, 898, 1013, 927, 937, 907, 904, 956, 929, 942, 919, 917, 901, 897, 908, 897, 917, 1013, 903, 942, 1019, 896, 954, 949, 925, 929, 923, 939, 935, 904, 916, 924, 905, 1016, 1020, 916, 1021, 924, 1008, 1008, 1997, 1970, 1965, 1979, 1971, 1991, 2006, 1988, 2023, 1998, 2027, 1964, 2002, 1973, 2007, 2016, 1971, 2024, 2006, 1960, 2034, 2025, 2026, 1993, 2003, 2023, 1996, 1984, 2036, 1998, 2016, 1993, 1992, 2007, 2023, 2002, 2016, 2033, 1994, 2034, 1997, 2001, 2009, 2032, 2004, 1990, 2010, 2042, 2011, 1998, 2043, 2018, 2035, 1964, 2043, 2043, 1960, 2016, 1979, 1990, 1995, 2018, 2017, 1975, 2024, 1979, 1991, 2035, 1998, 2018, 1968, 2026, 2010, 1971, 2038, 2017, 2020, 1992, 1992, 1989, 2021, 2025, 2010, 1986, 2009, 2034, 1974, 1990, 2038, 2009, 1993, 2037, 2011, 2029, 2037, 2034, 2036, 2007, 2016, 1995, 2002, 2039, 1964, 2004, 2007, 1999, 1990, 2011, 2018, 2027, 2043, 1991, 1960, 2026, 2043, 2011, 2020, 2028, 1988, 2025, 2043, 2027, 1979, 1996, 1970, 2006, 1968, 1964, 2006, 2033, 1968, 2269, 2252, 2252, 2256, 2261, 2271, 2269, 2248, 2261, 2259, 2258, 2195, 2262, 2255, 2259, 2258, 2183, 2204, 2271, 2260, 2269, 2254, 2255, 2265, 2248, 2177, 2249, 2248, 2266, 2193, 2180, 2722, 2727, 2738, 2727, 2366, 2345, 2345, 2356, 2345, 27352, 24856, 22128, 23593, 28683, 25276, -26716, -30382, 26908, 30919, 2142, 2064, 2079, 2058, 2071, 2056, 2075, 2142, 18335, 21631, -32355, 28799, 20815, -31397, 25145, 27129, 21322, 23720, 20747, 25065, -24763, -32333, 26534, 30333, 1764, 1706, 1701, 1712, 1709, 1714, 1697, 1764, 18725, 23237, 25070, 23285, 30766, 27155, 31688, 2897, 2849, 2873, 2849, 2897, 24508, 21989, 24441, 24445, -24984, -32610, 26460, 30343, -29239, 27260, -29765, -30215, 25544, -28562, 26609, 30250, -29340, 27345, 23393, 21829, 27419, 26263, 30540, 32044, 26981, 23047, 22150, -28136, 26083, -27080, 25157, 21845, -30584, 1487, 1485, 1496, 1481, 1483, 1475, 1502, 1493, 1519, 1475, 1474, 1496, 1481, 1474, 1496, 2059, 2058, 2075, 2062, 2054, 2051, 2092, 2048, 2049, 2075, 2058, 2049, 2075, 24720, 29003, 466, 438, 422, 445, 466, 25730, 25244, -27413, -30179, 3311, 3309, 3306, 3296, 1773, 1786, 1772, 1770, 1779, 1771, 2856, 2863, 2874, 2863, 2862, 2856, 2117, 2151, 2151, 2145, 2164, 2160, 2089, 2113, 2154, 2151, 2155, 2144, 2157, 2154, 2147, 2215, 2213, 2228, 2338, 2367, 2357, 2365, 2355, 2338, 2702, 2700, 2715, 2694, 2688, 2689, 761, 718, 711, 712, 706, 714, 707, 2873, 2868, 2864, 2869, 2868, 2851, 2850, 615, 618, 609, 636, 602, 615, 563, 561, 1133, 1137, 1148, 1124, 1856, 1907, 1904, 1916, 1908, 3305, 3308, 28386, 25890, 21858, 24899, -29385, 22994, -27746, -29336, 764, 766, 745, 764, 749, 766, 745, 2355, 2339, 2341, 2350, 2341, 763, 746, 761, 746, 742, 760, 999, 1006, 993, 1003, 995, 1002, 2894, 2895, 2908, 2883, 2889, 2895, 2933, 2883, 2894, 714, 706, 723, 719, 712, 707, 2046, 2017, 2045, 2042, 27720, 26504, 24980, 26872, -28364, -28734, 496, 493, 485, 508, 487, 496, 486, 458, 500, 481, 2431, 2424, 2406, 1342, 1340, 1325, 
    1369, -28968, 22379, 20818, -29042, 26939, 18986, 27365, 24869, 20837, 25924, 19805, 23000, 23473, -28763, 2160, 2173, 2172, 2167, 2157, 2160, 2157, 2144, 1069, 1057, 1056, 1085, 1083, 1059, 1067, 1219, 1221, 1238, 1241, 1220, 1223, 1240, 1221, 1219, 1256, 1234, 1221, 1221, 1240, 1221, 2628, 2655, 2655, 2671, 2652, 2641, 2626, 2647, 2645, 418, 447, 443, 435, 441, 419, 418, 3286, 3280, 1979, 1975, 1974, 1964, 1969, 1974, 1965, 1981, 25321, 26921, -31400, 23634, 25065, -28632, -24683, -32413, 25855, 28479, -31922, 23108, 24447, 27486, 17047, 24483, -25129, 27367, 24871, 21441, 26610, 25068, -28921, -29371, -27438, 20660, 25524, 26740, 29369, 26815, 22051, -31722, 27854, 27162, 25050, 20890, 26043, 24681, 31511, 24849, -26778, -30320, 25571, 26659, -31229, -31679, 2999, 2996, 24803, 17804, -25130, 32559, 23523, 27651, 26563, 22932, 22448, 27118, 26488, 30371, 28287, 26047, 21010, 21014, -27901, -29195, 27479, 24727, 22634, 21402, 30172, 23655, 25624, 24323, 32216, 17520, 22731, 22952, 28442, -30737, -31315, -25542, 22620, 2872, 2857, 2863, 2861, 2561, 2576, 2582, 2580, 2578, 2590, 2564, 2591, 2565, 1796, 1793, 1797, 1793, 1820, 2201, 2178, 2201, 2188, 2177, 473, 478, 476, 468, 498, 478, 479, 453, 468, 479, 453, 766, 761, 763, 755, 704, 767, 754, 755, 761, 725, 761, 760, 738, 755, 760, 738, 2640, 2652, 1020, 992, 992, 996, 916, 22393, 23840, 22460, 22456, -26963, -30629, 27954, 31977, 30345, 25280, 20898, 23843, -26179, 1769, 1405, 1377, 1377, 1381, 1327, 1338, 1338, 3292, 3264, 3264, 3268, 3271, 3214, 3227, 3227, 756, 755, 749, 2396, 2369, 2381, 2329, 18428, 27292, 23278, 2329, 2380, 2379, 2389, 2315, 2312, 2308, 2310, 2315, 2319, 2312, 2324, 2323, 1291, 1288, 1293, 1300, 1290, 1300, 1290, 1300, 1291, 933, 933, 942, 2262, 2254, 2262, 2214, 24502, 24518, -28419, 18425, 32174, 2214, 2254, 2258, 2258, 2262, 2261, 1654, 1645, 1636, 1544, 1559, 1552, 1555, 1192, 1213, 1215, 1269, 1910, 1902, 1897, 1888, 1918, 1902, 1897, 1888, 1880, -28851, -27145, 31700, 26072, 29699, 1178, 1258, 1266, 1258, 1178, 21386, 21498, 24590, 29141, 332, 265, 276, 280, 332, 20393, 25289, 21179, 332, 316, 292, 316, 332, 22108, 22060, 25466, 332, 281, 286, 256, 332, 23189, -29427, 1835, 1896, 1846, 1904, 1853, 1375, 1358, 1358, 1362, 1367, 1373, 1375, 1354, 1367, 1361, 1360, 1297, 1350, 1299, 1363, 1358, 1371, 1369, 1387, 1388, 1394, 1114, 1049, 1028, 1088, 3296, 3327, 3314, 3315, 3321, 3257, 3323, 3302, 3234, 1897, 1882, 1877, 1884, 1886, 851, 840, 837, 852, 834, 780, 769, 796, 768, 769, 771, 770, 1812, 1848, 1849, 1827, 1842, 1849, 1827, 1914, 1795, 1838, 1831, 1842, 3170, 3199, 3178, 3176, 3194, 3197, 3171, -2201, 2490, 2524, 2497, 2509, 2516, 2474, 2508, 24139, 19338, 1273, 1169, 1165, 1165, 1161, 1273, 23716, 18789, 24949, -28570, 25828, 30955, 25632, -28570, 27511, -1730, 1662, 1634, 1634, 1638, 1558, -1515, 1011, 976, 988, 990, 971, 982, 976, 977, 22669, 19788, -27694, 22917, 22030, -26874, -30224, 437, 425, 420, 444, 416, 439, 390, 426, 427, 433, 416, 427, 433, 2151, 2146, 2168, 2175, 480, 493, 2906, 2901, 2905, 2897, 1224, 1233, 1243, 1172, 1155, 1163, 1159, 1172, 1165, 2485, 2468, 2466, 2464, 2938, 2923, 2925, 2927, 1876, 1861, 1859, 1857, 1863, 1867, 1873, 1866, 1872, 790, 775, 769, 771, 773, 777, 787, 776, 786, 2427, 2430, 2426, 2430, 2403, 1220, 1217, 1221, 1217, 1244, 639, 612, 639, 618, 615, 278, 269, 278, 259, 270, 1649, 1639, 1635, 1648, 1633, 1642, 1601, 1645, 1644, 1654, 1639, 1644, 1654, 1680, 1670, 1666, 1681, 1664, 1675, 1696, 1676, 1677, 1687, 1670, 1677, 1687};
    public static final String[] h = {"mqxh_f68dfd7971957bbc4ae21e25", "mqxh_64be38d68ccfa58517dc7e1a"};
    public final Set a = Collections.synchronizedSet(new HashSet());
    public volatile String g = "";

    class LimitFailure extends IOException {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f68short = {25152, 27008, 24296, 21681, -30816, -31262, 21250, 22058, -25483, 22547};

        public LimitFailure() {
            super("桥接响应超过大小限制");
        }
    }

    class Reply {
        public final int a;
        public final JSONObject b;
        public final byte[] c;

        public Reply(int i, JSONObject jSONObject, byte[] bArr) {
            this.a = i;
            this.b = jSONObject;
            this.c = bArr;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws Throwable {
        try {
            long j = this.c;
            long jE = e(25);
            if (this.f == null) {
                JSONObject jSONObjectG = g(jE, "nav", new JSONObject());
                n(jSONObjectG, z);
                synchronized (this) {
                    c(jE, j);
                    this.f = jSONObjectG;
                }
            }
            this.g = "";
            return n(this.f, z);
        } catch (Exception e) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = {"电影", "剧集", "综艺", "动漫", "短剧"};
            int i = 0;
            while (i < 5) {
                int i2 = i + 1;
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(String.valueOf(i2), strArr[i], null));
                i = i2;
            }
            return new JSONObject(com.github.catvod.spider.merge.p001b.g.v(arrayList, new LinkedHashMap())).put("msg", f(e)).toString();
        }
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        return str != null && str.matches("(?i).*\\.(m3u8|mp4|flv|mkv|ts)(?:$|[?&#].*)");
    }

    private /* synthetic */ String $host$4a0a5542814a3609() throws Throwable {
        try {
            long j = this.c;
            long jE = e(25);
            if (this.f == null) {
                JSONObject jSONObjectG = g(jE, "nav", new JSONObject());
                n(jSONObjectG, true);
                synchronized (this) {
                    c(jE, j);
                    this.f = jSONObjectG;
                }
            }
            return s(g(jE, "home", new JSONObject()));
        } catch (Exception e) {
            String strF = f(e);
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.E(new k("qingying:status", com.github.catvod.spider.merge.D.b.B("慢点加载提示：", strF), "", "点击查看具体错误"));
            gVar.l(strF);
            return gVar.r();
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int iMax;
        String str3 = str;
        try {
            iMax = (int) Math.max(1L, Math.min(1000000L, Long.parseLong(str2.trim())));
        } catch (Exception unused) {
            iMax = 1;
        }
        try {
            String strM301 = "search";
            JSONObject jSONObject = new JSONObject();
            String strM414 = "wd";
            if (str3 == null) {
                str3 = "";
            }
            return s(g(e(25), strM301, jSONObject.put(strM414, str3).put("page", iMax)));
        } catch (Exception e) {
            return h(e, iMax);
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws Throwable {
        String strM21 = "format";
        try {
            long jE = e(30);
            JSONObject jSONObjectG = g(jE, "play", x(str2));
            String strW = w("mode", jSONObjectG);
            String strW2 = w("url", jSONObjectG);
            boolean zEquals = "direct".equals(strW);
            String strM459 = "web";
            if (!zEquals && !strM459.equals(strW)) {
                throw new IOException("接口返回未知播放模式");
            }
            Headers headersJ = j(jSONObjectG.getJSONObject("headers"));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < headersJ.size(); i++) {
                linkedHashMap.put(headersJ.name(i), headersJ.value(i));
            }
            v(strW2, Headers.of(linkedHashMap));
            boolean zEquals2 = strM459.equals(strW);
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.q(zEquals2 ? 1 : 0);
            gVar.C(strW2);
            gVar.h(linkedHashMap);
            if (!zEquals2) {
                String strW3 = jSONObjectG.has(strM21) ? w(strM21, jSONObjectG) : "";
                if (strW3.isEmpty()) {
                    strW3 = m(strW2, linkedHashMap, jE);
                }
                if (!strW3.isEmpty()) {
                    if (strW3.length() > 128 || !strW3.matches("[A-Za-z0-9!#$&^_.+-]+/[A-Za-z0-9!#$&^_.+-]+")) {
                        throw new IOException("播放格式 DTO 错误");
                    }
                    gVar.f(strW3);
                }
            }
            this.g = "";
            return gVar.r();
        } catch (Exception e) {
            String strF = f(e);
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C("");
            gVar2.l(strF);
            return new JSONObject(gVar2.r()).put("error", strF).toString();
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strM529;
        ManDian manDian = this;
        String strM558 = "$$$";
        String strM379 = "from";
        String strM432 = "id";
        String strM445 = "慢点 PHP 桥接\n最近错误：";
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    String str = list.get(0);
                    if (!"qingying:status".equals(str) && !"mq:status".equals(str)) {
                        t(str);
                        JSONObject jSONObjectG = manDian.g(e(25), "detail", new JSONObject().put(strM432, str));
                        JSONObject jSONObject = jSONObjectG.getJSONObject("vod");
                        if (!str.equals(w(strM432, jSONObject))) {
                            throw new IOException("详情 DTO 编号不匹配");
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray = jSONObjectG.getJSONArray("lines");
                        int i = 0;
                        while (true) {
                            int length = jSONArray.length();
                            strM529 = "name";
                            if (i >= length) {
                                break;
                            }
                            try {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                String strW = w(strM379, jSONObject2);
                                String strK = k(w(strM529, jSONObject2));
                                if (strK.isEmpty()) {
                                    strK = k(strW);
                                }
                                ArrayList arrayList3 = new ArrayList();
                                JSONArray jSONArray2 = jSONObject2.getJSONArray("episodes");
                                JSONArray jSONArray3 = jSONArray;
                                int i2 = 0;
                                while (i2 < jSONArray2.length()) {
                                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                                    JSONArray jSONArray4 = jSONArray2;
                                    String strW2 = w("url", jSONObject3);
                                    String strW3 = w(strM379, jSONObject3);
                                    String strK2 = k(w(strM529, jSONObject3));
                                    String str2 = strW3.isEmpty() ? strW : strW3;
                                    if (!strW2.isEmpty() && !str2.isEmpty()) {
                                        StringBuilder sb = new StringBuilder();
                                        if (strK2.isEmpty()) {
                                            strK2 = String.valueOf(i2 + 1);
                                        }
                                        sb.append(strK2);
                                        sb.append("$");
                                        sb.append(r((int) o(1L, 1000000L, "index", jSONObject3), str, str2, strW2));
                                        arrayList3.add(sb.toString());
                                    }
                                    i2++;
                                    strM558 = strM558;
                                    jSONArray2 = jSONArray4;
                                    strM379 = strM379;
                                    strW = strW;
                                }
                                String str3 = strM558;
                                String str4 = strM379;
                                if (!arrayList3.isEmpty()) {
                                    arrayList.add(strK);
                                    arrayList2.add(TextUtils.join("#", arrayList3));
                                }
                                i++;
                                jSONArray = jSONArray3;
                                strM558 = str3;
                                strM379 = str4;
                            } catch (Exception e) {
                                e = e;
                                manDian = this;
                            }
                            e = e;
                            manDian = this;
                            return com.github.catvod.spider.merge.p001b.g.d(manDian.f(e));
                        }
                        String str5 = strM558;
                        if (arrayList2.isEmpty()) {
                            throw new IOException("影片详情没有可用线路/选集");
                        }
                        k kVar = new k(str, k(w(strM529, jSONObject)), w("pic", jSONObject), w("remark", jSONObject));
                        kVar.j(w("actor", jSONObject));
                        kVar.m(w("director", jSONObject));
                        kVar.i(w("type", jSONObject));
                        kVar.k(w("area", jSONObject));
                        kVar.u(w("year", jSONObject));
                        kVar.l(w("content", jSONObject));
                        C0294s1.e(arrayList, arrayList2);
                        C0294s1.c("慢点", arrayList);
                        kVar.q(TextUtils.join(str5, arrayList));
                        kVar.r(TextUtils.join(str5, arrayList2));
                        JSONObject jSONObject4 = new JSONObject(com.github.catvod.spider.merge.p001b.g.s(kVar));
                        jSONObject4.getJSONArray("list").getJSONObject(0).put("vod_lang", w("lang", jSONObject));
                        this.g = "";
                        return jSONObject4.toString();
                    }
                    k kVar2 = new k(str, "慢点诊断", "");
                    kVar2.l(strM445 + manDian.g);
                    kVar2.q("");
                    kVar2.r("");
                    return com.github.catvod.spider.merge.p001b.g.s(kVar2);
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        throw new IOException("缺少影片编号");
    }

    private /* synthetic */ Object[] $host$dca6c5e1c5a7de15(Map<String, String> map) {
        return new Object[]{404, "text/plain; charset=utf-8", "无需本地代理"};
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int iMax;
        String strM322;
        String strM554 = "tag";
        try {
            iMax = (int) Math.max(1L, Math.min(1000000L, Long.parseLong(str2.trim())));
        } catch (Exception unused) {
            iMax = 1;
        }
        if (str != null) {
            try {
                if (str.matches("[1-5]")) {
                    JSONObject jSONObjectPut = new JSONObject().put("tid", str).put("page", iMax);
                    if (map != null) {
                        String[] strArr = {strM554, "area", "year", "order"};
                        int i = 0;
                        while (true) {
                            strM322 = "全部";
                            if (i >= 4) {
                                break;
                            }
                            String str3 = strArr[i];
                            String str4 = map.get(str3);
                            if (str4 != null && !str4.isEmpty() && !strM322.equals(str4)) {
                                jSONObjectPut.put(str3, str4);
                            }
                            i++;
                        }
                        String str5 = map.get("class");
                        if (!jSONObjectPut.has(strM554) && str5 != null && !str5.isEmpty() && !strM322.equals(str5)) {
                            jSONObjectPut.put(strM554, str5);
                        }
                    }
                    return s(g(e(25), "category", jSONObjectPut));
                }
            } catch (Exception e) {
                return h(e, iMax);
            }
        }
        throw new IOException("分类编号应为 1–5");
    }

    public static byte[] b(int i, String str) throws IOException {
        if (str.length() > ((((long) i) + 2) / 3) * 4 || str.length() % 4 != 0 || !str.matches("[A-Za-z0-9+/]*={0,2}")) {
            throw new LimitFailure();
        }
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode.length > i || !Base64.encodeToString(bArrDecode, 2).equals(str)) {
            throw new IOException("桥接 Base64 格式错误");
        }
        return bArrDecode;
    }

    public static HttpUrl d(String str) throws IOException {
        HttpUrl httpUrl = str == null ? null : HttpUrl.parse(str);
        if (httpUrl != null && str.length() <= 16384 && !str.matches("(?s).*\\p{Cntrl}.*") && httpUrl.username().isEmpty() && httpUrl.password().isEmpty() && httpUrl.fragment() == null && str.equals(httpUrl.toString())) {
            return httpUrl;
        }
        throw new IOException("HTTP 地址格式错误");
    }

    public static long e(int i) {
        return TimeUnit.SECONDS.toNanos(Math.max(1, Math.min(30, i))) + System.nanoTime();
    }

    public static Headers j(JSONObject jSONObject) throws IOException {
        if (jSONObject.toString().getBytes(StandardCharsets.UTF_8).length > 65536) {
            throw new LimitFailure();
        }
        Headers.Builder builder = new Headers.Builder();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strW = w(next, jSONObject);
            if (!next.matches("[!#$%&'*+.^_\\x60|~0-9A-Za-z-]+") || !hashSet.add(next.toLowerCase(Locale.ROOT)) || strW.matches("(?s).*[^\\x20-\\x7e].*") || !strW.equals(strW.trim())) {
                throw new IOException("HTTP Headers 合同错误");
            }
            builder.add(next, strW);
        }
        return builder.build();
    }

    public static String k(String str) {
        return str.replace('$', ' ').replace('#', ' ').replace('\r', ' ').replace('\n', ' ').trim();
    }

    public static String l() {
        String[] strArr = h;
        for (int i = 0; i < 2; i++) {
            try {
                String string = p(C0297t1.i(strArr[i] + "_identity").getBytes(StandardCharsets.UTF_8)).getString("device_id");
                if (q(string)) {
                    return string;
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static String n(JSONObject jSONObject, boolean z) throws JSONException, IOException {
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String strW = w("id", jSONObject2);
            String strK = k(w("name", jSONObject2));
            if (!strW.matches("[1-5]") || strK.isEmpty() || linkedHashMap.containsKey(strW)) {
                throw new IOException("导航 DTO 错误");
            }
            linkedHashMap.put(strW, new com.github.catvod.spider.merge.p001b.b(strW, strK, null));
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject3 = jSONObject2.getJSONObject("filters");
            String[] strArr = {"tag", "area", "year"};
            String[] strArr2 = {"类型", "地区", "年份"};
            for (int i2 = 0; i2 < 3; i2++) {
                JSONArray jSONArray2 = jSONObject3.getJSONArray(strArr[i2]);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                String strM386 = "全部";
                linkedHashMap3.put("", new com.github.catvod.spider.merge.p001b.c(strM386, ""));
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    if (!(jSONArray2.get(i3) instanceof String)) {
                        throw new IOException("筛选 DTO 错误");
                    }
                    String str = (String) jSONArray2.get(i3);
                    if (!str.trim().isEmpty() && !strM386.equals(str)) {
                        linkedHashMap3.put(str, new com.github.catvod.spider.merge.p001b.c(str));
                    }
                }
                if (linkedHashMap3.size() > 1) {
                    arrayList.add(new com.github.catvod.spider.merge.p001b.d(strArr[i2], strArr2[i2], new ArrayList(linkedHashMap3.values())));
                }
            }
            if (z && !arrayList.isEmpty()) {
                linkedHashMap2.put(strW, arrayList);
            }
        }
        if (linkedHashMap.isEmpty()) {
            throw new IOException("导航 DTO 为空");
        }
        return com.github.catvod.spider.merge.p001b.g.v(new ArrayList(linkedHashMap.values()), linkedHashMap2);
    }

    public static long o(long j, long j2, String str, JSONObject jSONObject) throws IOException {
        Object objOpt = jSONObject.opt(str);
        if ((objOpt instanceof Integer) || (objOpt instanceof Long)) {
            Number number = (Number) objOpt;
            if (number.longValue() >= j && number.longValue() <= j2) {
                return number.longValue();
            }
        }
        throw new IOException("DTO 整数字段越界");
    }

    public static JSONObject p(byte[] bArr) throws IOException {
        try {
            JSONTokener jSONTokener = new JSONTokener(StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString());
            Object objNextValue = jSONTokener.nextValue();
            if ((objNextValue instanceof JSONObject) && jSONTokener.nextClean() == 0) {
                return (JSONObject) objNextValue;
            }
            throw new IOException("桥接 JSON 格式错误");
        } catch (IOException e) {
            throw e;
        } catch (Exception unused) {
            throw new IOException("桥接 UTF8/JSON 格式错误");
        }
    }

    public static boolean q(String str) {
        return str != null && str.matches("[a-f0-9]{32}");
    }

    public static String r(int i, String str, String str2, String str3) throws JSONException, IOException {
        JSONObject jSONObjectPut = new JSONObject().put("v", str).put("f", str2).put("u", str3).put("e", i);
        y(jSONObjectPut);
        String str4 = "mq1:" + Base64.encodeToString(jSONObjectPut.toString().getBytes(StandardCharsets.UTF_8), 11);
        if (str4.length() <= 32768) {
            return str4;
        }
        throw new IOException("选集标识过长");
    }

    public static void t(String str) throws IOException {
        if (str != null) {
            try {
                if (str.matches("[1-9][0-9]{0,18}") && Long.parseLong(str) > 0) {
                    return;
                }
            } catch (NumberFormatException unused) {
                throw new IOException("影片编号不是有效正整数");
            }
        }
        throw new NumberFormatException();
    }

    public static String u(String str) {
        if (str == null || str.isEmpty()) {
            return "慢点请求失败";
        }
        String strReplaceAll = str.replaceAll("(?i)https?://[^\\s]+", "[地址已脱敏]").replaceAll("(?i)Bearer\\s+[^\\s]+", "Bearer [已脱敏]").replaceAll("(?i)(token|auth_key|password|device_id|authorization|signature|key|iv|handle|ticket)\\s*[=:]\\s*[^&\\s]+", "$1=[已脱敏]").replaceAll("(?i)\\b[a-f0-9]{32,}\\b", "[已脱敏]").replaceAll("[\\p{Cntrl}]", " ");
        return strReplaceAll.substring(0, Math.min(250, strReplaceAll.length()));
    }

    public static HttpUrl v(String str, Headers headers) throws IOException {
        HttpUrl httpUrlD = d(str);
        if (!httpUrlD.isHttps()) {
            for (int i = 0; i < headers.size(); i++) {
                if (headers.name(i).equalsIgnoreCase("Authorization") || headers.name(i).equalsIgnoreCase("Proxy-Authorization") || headers.value(i).matches("(?i)Bearer\\s+.*")) {
                    throw new IOException("带凭据的目标请求须使用 HTTPS");
                }
            }
        }
        return httpUrlD;
    }

    public static String w(String str, JSONObject jSONObject) throws IOException {
        if (jSONObject.opt(str) instanceof String) {
            return (String) jSONObject.opt(str);
        }
        throw new IOException("DTO 文本字段错误");
    }

    public static JSONObject x(String str) throws IOException {
        if (str == null || !str.startsWith("mq1:") || str.length() > 32768) {
            throw new IOException("请刷新慢点影片详情后重新选集");
        }
        String strSubstring = str.substring(4);
        boolean zMatches = strSubstring.matches("[A-Za-z0-9_-]+");
        String strM499 = "选集标识编码错误";
        if (!zMatches || strSubstring.length() % 4 == 1) {
            throw new IOException(strM499);
        }
        byte[] bArrDecode = Base64.decode(strSubstring, 11);
        if (!strSubstring.equals(Base64.encodeToString(bArrDecode, 11))) {
            throw new IOException(strM499);
        }
        JSONObject jSONObjectP = p(bArrDecode);
        y(jSONObjectP);
        return jSONObjectP;
    }

    public static void y(JSONObject jSONObject) throws IOException {
        if (jSONObject.length() != 4) {
            throw new IOException("选集标识字段错误");
        }
        t(w("v", jSONObject));
        o(1L, 1000000L, "e", jSONObject);
        String strM427 = "u";
        String strM234 = "f";
        String[] strArr = {strM234, strM427};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            String strW = w(str, jSONObject);
            if (!strW.trim().isEmpty()) {
                if (strW.length() <= (strM234.equals(str) ? 256 : 16384) && !strW.matches("(?s).*\\p{Cntrl}.*")) {
                    try {
                        StandardCharsets.UTF_8.newEncoder().onMalformedInput(CodingErrorAction.REPORT).encode(CharBuffer.wrap(strW));
                    } catch (Exception unused) {
                        throw new IOException("选集来源 UTF8 错误");
                    }
                }
            }
            throw new IOException("选集标识来源字段错误");
        }
    }

    public final JSONObject a(long j, long j2, String str, JSONObject jSONObject) throws IOException {
        String strM65 = "ok";
        String strM390 = "N1.vajQcFe5dIl7YHUJ1wRPCAHvkRTho1vexs7ya5zSsDIEGAbJc27ZRTquIo2I0A+dv7qTDhgUpsKecxPMuUtOHWqiq7V8aGWybWh736dCQlQ=";
        String strM358 = "N1.zfhdqhQLY0S2r5ZO1lNkpa3mnyjLjFYvC/ZnA4aovqzygtuyQYYr926YS+p/51JVOB04lJ7IlYj68uvLKBzC2HvQNqMF7mO5RwXNP9ujid0=";
        String strM471 = "moyufucking";
        String strM288 = "PHP 服务 HTTP ";
        try {
            String strM234 = "N1.163085Wse7exp8qtVXx5HGquu+Yt3RJv5oCsXJ+6SsnqZEhELO8RdFEqlcZXHLALX8Jc6MwxPlVfjEYQD51Y0Q==";
            String strM408 = "N1.80DUGdMh/Q6Tc0kU+qjiJPdOCwMcJKTdQcrIqNRZsWEYyXMxap/xx+c8EHab4k8DpMa3iY0ubgKKFfjYAZq5EuZJvXnvqwTcHQt/WTLEXahxD+ixXgoGjxh8O1U3/Ur3";
            String string = jSONObject.toString();
            Charset charset = StandardCharsets.UTF_8;
            byte[] bArrT = FishCrypto.t(strM358, strM390, strM234, strM408, string.getBytes(charset));
            if (bArrT == null || bArrT.length == 0) {
                throw new IOException("慢点 native 信封未就绪");
            }
            byte[] bytes = new JSONObject().put(strM471, Base64.encodeToString(bArrT, 2)).toString().getBytes(charset);
            if (bytes.length > 4194304) {
                throw new LimitFailure();
            }
            Reply replyI = i(new Request.Builder().url(str).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), bytes)).build(), j, 4194304, false, j2);
            JSONObject jSONObjectP = p(replyI.c);
            if (jSONObjectP.length() != 1 || !jSONObjectP.has(strM471)) {
                throw new IOException("桥接外围字段错误");
            }
            byte[] bArrS = FishCrypto.s(strM358, strM390, b(4194304, w(strM471, jSONObjectP)));
            if (bArrS == null || bArrS.length == 0 || bArrS.length > 4194304) {
                throw new IOException("慢点 native 信封解码失败");
            }
            JSONObject jSONObjectP2 = p(bArrS);
            if (!(jSONObjectP2.opt(strM65) instanceof Boolean)) {
                throw new IOException("桥接响应状态错误");
            }
            if (!jSONObjectP2.getBoolean(strM65)) {
                throw new IOException(u(w("error", jSONObjectP2)));
            }
            int i = replyI.a;
            if (i >= 200 && i < 300) {
                return jSONObjectP2.getJSONObject("data");
            }
            throw new IOException(strM288 + i);
        } catch (IOException e) {
            throw e;
        } catch (Exception unused) {
            throw new IOException("慢点 PHP 响应合同错误");
        }
    }

    public final long c(long j, long j2) throws IOException {
        if (this.b == null || j2 != this.c) {
            throw new IOException("慢点站源已关闭或重新加载");
        }
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("慢点请求已取消");
        }
        long jNanoTime = j - System.nanoTime();
        if (jNanoTime >= TimeUnit.MILLISECONDS.toNanos(1L)) {
            return jNanoTime;
        }
        throw new InterruptedIOException("慢点请求超过时限");
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

    public synchronized void destroy() {
        this.c++;
        OkHttpClient okHttpClient = this.b;
        this.b = null;
        this.f = null;
        this.g = "";
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((Call) it.next()).cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (okHttpClient != null) {
            okHttpClient.connectionPool().evictAll();
            okHttpClient.dispatcher().executorService().shutdown();
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

    public final String f(Exception exc) {
        String strU = u(exc instanceof IOException ? exc.getMessage() : "慢点 DTO 数据错误");
        this.g = strU;
        return strU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r2v16, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r5v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r90v0, types: [com.github.catvod.spider.ManDian] */
    public final JSONObject g(long j, String str, JSONObject jSONObject) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileLock fileLockTryLock;
        ?? W;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ?? r38;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONObject jSONObject2;
        String strM467;
        ?? r39;
        String str12 = str;
        JSONObject jSONObject3 = jSONObject;
        String strM219 = "kind";
        String strM511 = "result";
        String strM545 = "status";
        String strM33 = "Accept-Encoding";
        String strM459 = "GET";
        String strM177 = "ticket";
        String strM402 = "action";
        String strM503 = "_handle";
        String strM516 = "headers";
        String strM379 = "body_b64";
        String str13 = strM219;
        String str14 = strM511;
        long j2 = this.c;
        String str15 = strM379;
        long jMin = Math.min(j, e("play".equals(str12) ? 30 : 25));
        c(jMin, j2);
        if (jSONObject3 == null || jSONObject.toString().getBytes(StandardCharsets.UTF_8).length > 65536) {
            throw new IOException("业务参数超过限制");
        }
        String str16 = strM545;
        String str17 = this.d;
        String str18 = strM33;
        String str19 = this.e;
        File fileD = C0297t1.d(str19 + "_lock");
        if (fileD == null || fileD.getParentFile() == null || !(fileD.getParentFile().isDirectory() || fileD.getParentFile().mkdirs())) {
            throw new IOException("桥接存储目录未就绪");
        }
        try {
            String str20 = strM516;
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(fileD, "rw");
            try {
                FileChannel channel = randomAccessFile2.getChannel();
                RandomAccessFile randomAccessFile3 = randomAccessFile2;
                while (true) {
                    try {
                        try {
                            long jC = c(jMin, j2);
                            try {
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    try {
                                        break;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                }
                            } catch (OverlappingFileLockException unused) {
                            }
                            randomAccessFile = randomAccessFile3;
                            String str21 = strM402;
                            String str22 = strM177;
                            String str23 = str17;
                            String str24 = str19;
                            String str25 = str15;
                            String str26 = str18;
                            long j3 = jMin;
                            String str27 = strM503;
                            String str28 = strM459;
                            String str29 = str13;
                            String str30 = str14;
                            String str31 = str16;
                            try {
                                try {
                                    TimeUnit.NANOSECONDS.sleep(Math.min(jC, TimeUnit.MILLISECONDS.toNanos(20L)));
                                    str12 = str;
                                    str13 = str29;
                                    str14 = str30;
                                    str16 = str31;
                                    jMin = j3;
                                    strM459 = str28;
                                    strM503 = str27;
                                    str17 = str23;
                                    randomAccessFile3 = randomAccessFile;
                                    strM177 = str22;
                                    strM402 = str21;
                                    str18 = str26;
                                    str19 = str24;
                                    str15 = str25;
                                    jSONObject3 = jSONObject;
                                } catch (InterruptedException unused2) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException("等待桥接已取消");
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                Throwable th3 = th;
                                if (channel == null) {
                                    throw th3;
                                }
                                try {
                                    channel.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            randomAccessFile = randomAccessFile3;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        Throwable th7 = th;
                        try {
                            randomAccessFile.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                }
                String strI = C0297t1.i(str19 + strM503);
                if (!strI.isEmpty() && !q(strI)) {
                    throw new IOException("桥接句柄记录错误");
                }
                int i = 0;
                ?? r0 = strI;
                while (i < 12) {
                    int i2 = i;
                    ?? Put = new JSONObject().put(strM402, "prepare").put("scene", str12).put("params", jSONObject3);
                    boolean zIsEmpty = r0.isEmpty();
                    String strM70 = "handle";
                    try {
                        if (zIsEmpty) {
                            String strL = l();
                            if (!strL.isEmpty()) {
                                Put.put("device_id", strL);
                            }
                            RandomAccessFile randomAccessFile4 = randomAccessFile3;
                            String str32 = str15;
                            String str33 = str19;
                            String str34 = strM503;
                            String str35 = str20;
                            String str36 = strM402;
                            String str37 = str17;
                            String str38 = str17;
                            String str39 = strM177;
                            JSONObject jSONObjectA = a(jMin, j2, str37, Put);
                            W = w(strM70, jSONObjectA);
                            String strW = w(str39, jSONObjectA);
                            String strW2 = w("method", jSONObjectA);
                            if (q(W) || !q(strW) || (!r0.isEmpty() && !r0.equals(W))) {
                                throw new IOException("桥接句柄或票据错误");
                            }
                            boolean zEquals = strM459.equals(strW2);
                            String strM75 = "POST";
                            if (!zEquals && !strM75.equals(strW2)) {
                                throw new IOException("桥接方法错误");
                            }
                            if (o(1L, Long.MAX_VALUE, "expires_at", jSONObjectA) <= System.currentTimeMillis() / 1000) {
                                throw new IOException("桥接票据已过期");
                            }
                            Headers headersJ = j(jSONObjectA.getJSONObject(str35));
                            HttpUrl httpUrlV = v(w("url", jSONObjectA), headersJ);
                            byte[] bArrB = b(2097152, w(str32, jSONObjectA));
                            if (strM459.equals(strW2) && bArrB.length != 0) {
                                throw new IOException("GET 计划含请求体");
                            }
                            String str40 = strM459;
                            if (jSONObjectA.toString().getBytes(StandardCharsets.UTF_8).length - w(str32, jSONObjectA).length() > 65536) {
                                throw new IOException("桥接元数据超过限制");
                            }
                            long j4 = jMin;
                            c(j4, j2);
                            if (W.equals(r0)) {
                                str2 = str33;
                                str3 = str34;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                str2 = str33;
                                sb.append(str2);
                                str3 = str34;
                                sb.append(str3);
                                if (!C0297t1.k(sb.toString(), W)) {
                                    throw new IOException("桥接句柄保存失败");
                                }
                            }
                            Request.Builder builderTag = new Request.Builder().url(httpUrlV).headers(headersJ).tag(Headers.class, headersJ);
                            String str41 = str18;
                            if (headersJ.get(str41) == null) {
                                builderTag.header(str41, "identity");
                            }
                            if (strM75.equals(strW2)) {
                                builderTag.post(RequestBody.create((MediaType) null, bArrB));
                            } else {
                                builderTag.get();
                            }
                            JSONObject jSONObjectPut = new JSONObject().put(str36, "consume").put(strM70, W).put(str39, strW);
                            try {
                                str4 = str3;
                                str5 = str39;
                                str6 = str36;
                                str7 = str41;
                                r38 = W;
                                str8 = str2;
                                str11 = str40;
                                try {
                                    Reply replyI = i(builderTag.build(), j4, 2097152, false, j2);
                                    str9 = str16;
                                    jSONObject2 = jSONObjectPut;
                                    try {
                                        str10 = str35;
                                        try {
                                            jSONObject2.put(str9, replyI.a).put(str10, replyI.b).put(str32, Base64.encodeToString(replyI.c, 2));
                                            r39 = r38;
                                        } catch (IOException e) {
                                            e = e;
                                            c(j4, j2);
                                            JSONObject jSONObjectPut2 = jSONObject2.put(str9, 0).put(str10, new JSONObject()).put(str32, "");
                                            String strM445 = "transport_error";
                                            if (e instanceof LimitFailure) {
                                                strM467 = "too_large";
                                            } else {
                                                strM467 = e instanceof InterruptedIOException ? "timeout" : "io";
                                            }
                                            jSONObjectPut2.put(strM445, strM467);
                                            r39 = r38;
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        str10 = str35;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    str9 = str16;
                                    str10 = str35;
                                    jSONObject2 = jSONObjectPut;
                                }
                            } catch (IOException e4) {
                                e = e4;
                                str4 = str3;
                                str5 = str39;
                                str6 = str36;
                                str7 = str41;
                                r38 = W;
                                str8 = str2;
                                str9 = str16;
                                str10 = str35;
                                str11 = str40;
                                jSONObject2 = jSONObjectPut;
                            }
                            str20 = str10;
                            JSONObject jSONObjectA2 = a(j4, j2, str38, jSONObject2);
                            c(j4, j2);
                            ?? r2 = r39;
                            if (!r2.equals(w(strM70, jSONObjectA2))) {
                                throw new IOException("桥接返回句柄不匹配");
                            }
                            String str42 = str13;
                            String str43 = str14;
                            if (str43.equals(w(str42, jSONObjectA2))) {
                                JSONObject jSONObject4 = jSONObjectA2.getJSONObject(str43);
                                fileLockTryLock.release();
                                channel.close();
                                randomAccessFile4.close();
                                return jSONObject4;
                            }
                            if (!"continue".equals(w(str42, jSONObjectA2))) {
                                throw new IOException("桥接返回步骤错误");
                            }
                            i = i2 + 1;
                            str12 = str;
                            r0 = r2;
                            str13 = str42;
                            str14 = str43;
                            str16 = str9;
                            jMin = j4;
                            strM459 = str11;
                            strM503 = str4;
                            str17 = str38;
                            randomAccessFile3 = randomAccessFile4;
                            strM177 = str5;
                            strM402 = str6;
                            str18 = str7;
                            str19 = str8;
                            str15 = str32;
                            jSONObject3 = jSONObject;
                        } else {
                            Put.put(strM70, r0);
                        }
                        JSONObject jSONObjectA3 = a(jMin, j2, str37, Put);
                        W = w(strM70, jSONObjectA3);
                        String strW3 = w(str39, jSONObjectA3);
                        String strW4 = w("method", jSONObjectA3);
                        if (q(W)) {
                        }
                        throw new IOException("桥接句柄或票据错误");
                    } catch (Throwable th9) {
                        th = th9;
                        fileLockTryLock.release();
                        throw th;
                    }
                    RandomAccessFile randomAccessFile5 = randomAccessFile3;
                    String str310 = str15;
                    String str311 = str19;
                    String str312 = strM503;
                    String str313 = str20;
                    String str314 = strM402;
                    String str315 = str17;
                    String str316 = str17;
                    String str317 = strM177;
                }
                throw new IOException("桥接超过12步上限");
            } catch (Throwable th10) {
                th = th10;
                randomAccessFile = randomAccessFile2;
            }
        } catch (IOException e5) {
            throw e5;
        } catch (Exception unused3) {
            throw new IOException("慢点桥接合同错误");
        }
    }

    public final String h(Exception exc, int i) {
        return new JSONObject(com.github.catvod.spider.merge.p001b.g.d(f(exc))).put("page", i).put("pagecount", i).put("limit", 0).put("total", 0).toString();
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

    public final Reply i(Request request, long j, int i, boolean z, long j2) throws IOException {
        OkHttpClient okHttpClient = this.b;
        if (okHttpClient == null) {
            throw new IOException("慢点站源已关闭");
        }
        Call callNewCall = okHttpClient.newBuilder().callTimeout(c(j, j2), TimeUnit.NANOSECONDS).build().newCall(request);
        this.a.add(callNewCall);
        if (okHttpClient != this.b || j2 != this.c) {
            callNewCall.cancel();
        }
        try {
            try {
                try {
                    Response responseExecute = callNewCall.execute();
                    try {
                        if (responseExecute.headers().byteCount() > 65536 || (!z && responseExecute.body() != null && responseExecute.body().contentLength() > i)) {
                            throw new LimitFailure();
                        }
                        JSONObject jSONObject = new JSONObject();
                        HashMap map = new HashMap();
                        for (int i2 = 0; i2 < responseExecute.headers().size(); i2++) {
                            String strName = responseExecute.headers().name(i2);
                            Locale locale = Locale.ROOT;
                            String str = (String) map.get(strName.toLowerCase(locale));
                            if (str == null) {
                                map.put(strName.toLowerCase(locale), strName);
                                jSONObject.put(strName, responseExecute.headers().value(i2));
                            } else {
                                jSONObject.put(str, jSONObject.getString(str) + ", " + responseExecute.headers().value(i2));
                            }
                        }
                        if (jSONObject.toString().getBytes(StandardCharsets.UTF_8).length > 65536) {
                            throw new LimitFailure();
                        }
                        Buffer buffer = new Buffer();
                        long j3 = i;
                        long j4 = ((long) (!z ? 1 : 0)) + j3;
                        while (responseExecute.body() != null && buffer.size() < j4) {
                            c(j, j2);
                            long j5 = j4;
                            if (responseExecute.body().source().read(buffer, Math.min(8192L, j4 - buffer.size())) < 0) {
                                break;
                            }
                            j4 = j5;
                        }
                        c(j, j2);
                        if (buffer.size() > j3) {
                            throw new LimitFailure();
                        }
                        Reply reply = new Reply(responseExecute.code(), jSONObject, buffer.readByteArray());
                        responseExecute.close();
                        this.a.remove(callNewCall);
                        return reply;
                    } catch (Throwable th) {
                        if (responseExecute == null) {
                            throw th;
                        }
                        try {
                            responseExecute.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    throw e;
                }
            } catch (Exception unused) {
                throw new IOException("HTTP 响应合同错误");
            }
        } catch (Throwable th3) {
            this.a.remove(callNewCall);
            throw th3;
        }
    }

    public void init(Context context) throws Throwable {
        init(context, "");
    }

    public void init(Context context, String str) throws Throwable {
        String strTrim;
        destroy();
        String strM102 = "{";
        if (str == null) {
            strTrim = "";
        } else {
            try {
                strTrim = str.trim();
            } catch (IOException e) {
                throw e;
            } catch (Exception unused) {
                throw new IOException("慢点 ext 仅接受 PHP 地址或 url 对象");
            }
        }
        if (!strTrim.startsWith(strM102) && !strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
            strTrim = FishCrypto.g(strTrim);
        }
        if (strTrim.trim().isEmpty()) {
            throw new IOException("请配置慢点 PHP 地址");
        }
        if (strTrim.trim().startsWith(strM102)) {
            JSONObject jSONObjectP = p(strTrim.trim().getBytes(StandardCharsets.UTF_8));
            if (jSONObjectP.length() != 1) {
                throw new IOException("ext 仅接受 url");
            }
            strTrim = w("url", jSONObjectP);
        }
        HttpUrl httpUrlD = d(strTrim.trim());
        if (!httpUrlD.isHttps() && !"localhost".equals(httpUrlD.host()) && !"127.0.0.1".equals(httpUrlD.host()) && !"::1".equals(httpUrlD.host())) {
            throw new IOException("PHP 地址须使用 HTTPS");
        }
        this.d = httpUrlD.toString();
        StringBuilder sb = new StringBuilder();
        for (byte b : MessageDigest.getInstance("SHA-256").digest(this.d.getBytes(StandardCharsets.UTF_8))) {
            sb.append(String.format(Locale.ROOT, "%02x", Integer.valueOf(b & 255)));
        }
        this.e = "qingying_" + sb.substring(0, 24);
        OkHttpClient.Builder builderRetryOnConnectionFailure = new OkHttpClient.Builder().followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.b = builderRetryOnConnectionFailure.connectTimeout(4L, timeUnit).readTimeout(12L, timeUnit).writeTimeout(12L, timeUnit).addNetworkInterceptor(new C0451c(3)).build();
    }

    public boolean isVideoFormat(String str) {
        if (FishCrypto.businessReady()) {
            return $host$42ceaa68a95df632(str);
        }
        return false;
    }

    public final String m(String str, LinkedHashMap linkedHashMap, long j) throws IOException {
        HttpUrl httpUrlV = v(str, Headers.of(linkedHashMap));
        String lowerCase = httpUrlV.encodedPath().toLowerCase(Locale.ROOT);
        boolean zEndsWith = lowerCase.endsWith(".m3u8");
        String strM42 = "application/x-mpegURL";
        if (zEndsWith) {
            return strM42;
        }
        boolean zEndsWith2 = lowerCase.endsWith(".mp4");
        String strM355 = "video/mp4";
        if (zEndsWith2) {
            return strM355;
        }
        long j2 = this.c;
        long jMin = Math.min(j, e(4));
        Request.Builder builderHeader = new Request.Builder().url(httpUrlV).headers(Headers.of(linkedHashMap)).header("Range", "bytes=0-1023");
        int i = 0;
        while (i <= 3) {
            long j3 = jMin;
            Request.Builder builder = builderHeader;
            long j4 = jMin;
            int i2 = i;
            Reply replyI = i(builderHeader.build(), j3, 1024, true, j2);
            int i3 = replyI.a;
            if (i3 != 301 && i3 != 302 && i3 != 303 && i3 != 307 && i3 != 308) {
                if (i3 == 403 || i3 == 429) {
                    throw new IOException(com.github.catvod.spider.merge.D.b.l(new StringBuilder("媒体权限拒绝或限流（HTTP "), replyI.a, "）"));
                }
                if (i3 < 200 || i3 >= 300) {
                    throw new IOException("媒体 HTTP " + replyI.a);
                }
                Iterator<String> itKeys = replyI.b.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next.equalsIgnoreCase("Content-Type") && replyI.b.optString(next).toLowerCase(Locale.ROOT).contains("mpegurl")) {
                        return strM42;
                    }
                }
                if (new String(replyI.c, StandardCharsets.UTF_8).replace("﻿", "").trim().startsWith("#EXTM3U")) {
                    return strM42;
                }
                byte[] bArr = replyI.c;
                return (bArr.length >= 8 && bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) ? strM355 : "";
            }
            Iterator<String> itKeys2 = replyI.b.keys();
            String strOptString = "";
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (next2.equalsIgnoreCase("Location")) {
                    strOptString = replyI.b.optString(next2);
                }
            }
            HttpUrl httpUrlResolve = httpUrlV.resolve(strOptString);
            if (httpUrlResolve == null || i2 == 3) {
                throw new IOException("媒体重定向错误");
            }
            v(httpUrlResolve.toString(), Headers.of(linkedHashMap));
            if (!httpUrlResolve.scheme().equals(httpUrlV.scheme()) || !httpUrlResolve.host().equals(httpUrlV.host()) || httpUrlResolve.port() != httpUrlV.port()) {
                return "";
            }
            builder.url(httpUrlResolve);
            i = i2 + 1;
            jMin = j4;
            builderHeader = builder;
            httpUrlV = httpUrlResolve;
        }
        return "";
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

    public Object[] proxy(Map<String, String> map) {
        return !FishCrypto.businessReady() ? FishCrypto.blockedProxy() : $host$dca6c5e1c5a7de15(map);
    }

    public final String s(JSONObject jSONObject) throws JSONException, IOException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("list");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String strW = w("id", jSONObject2);
            t(strW);
            arrayList.add(new k(strW, k(w("name", jSONObject2)), w("pic", jSONObject2), k(w("remark", jSONObject2))));
        }
        this.g = "";
        return new JSONObject(com.github.catvod.spider.merge.p001b.g.y(arrayList)).put("page", o(1L, 1000000L, "page", jSONObject)).put("pagecount", o(1L, 1000000L, "pagecount", jSONObject)).put("limit", o(1L, 100L, "limit", jSONObject)).put("total", o(0L, 2147483647L, "total", jSONObject)).toString();
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

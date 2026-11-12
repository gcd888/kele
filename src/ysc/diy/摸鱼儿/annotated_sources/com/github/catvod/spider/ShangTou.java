package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0294s1;
import com.github.catvod.spider.merge.A.N1;
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
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.C0359j;
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
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.C0451c;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
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
import okio.GzipSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class ShangTou extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f88short = {3232, 2612, 2619, 2615, 2623, 3110, 3113, 3134, 1530, 1525, 1520, 1512, 1529, 1518, 1519, 2020, 2027, 2022, 2036, 2036, 2018, 2036, 20833, 32540, -29536, 23165, 2788, 2793, 31948, -26722, -30640, 24205, 1424, 1415, 1418, 1427, 1411, 31888, -26686, -26686, -24654, -30708, 24273, 2000, 2808, 1631, 1617, 1613, 851, 836, 786, 850, 853, 849, 807, 853, 851, 790, 840, 782, 835, 775, 790, 779, 847, 775, 790, 779, 799, 775, 797, 791, 781, 775, 790, 784, 781, 775, 783, 776, 850, 863, 1623, 1616, 1618, 1626, 2921, 2943, 2939, 2920, 2937, 2930, 961, 978, 2838, 2823, 2817, 2819, 3270, 3266, 3294, 3284, 3292, 1967, 1960, 1974, 3109, 3129, 3124, 3116, 3120, 3111, 1143, 1146, 684, 701, 686, 687, 697, 25031, 24660, 24602, 26116, 27990, 23141, -28557, -29051, 1996, 1985, 1989, 1984, 1985, 2006, 2007, 2042, 2006, 2006, 2002, 2000, 2012, 1153, 1205, 1204, 1192, 1199, 1202, 1193, 1210, 1185, 1204, 1193, 1199, 1198, 25189, 25590, 22309, 26022, -28216, -28855, 1768, 1664, 1692, 1692, 1688, 1691, 3113, 3104, 3133, 3106, 3118, 3131, 315, 300, 300, 305, 300, 872, 872, 872, 318, 307, 23138, 30548, 27924, -28971, 19241, 32617, 3017, 3016, 3033, 3020, 3012, 3009, 2357, 2348, 2343, 2553, 2556, 2555, 2544, 2534, 31862, -28890, -29426, 23507, 1123, 1142, 1135, 1141, 1129, 1122, 1123, 1141, -26910, -28627, -30420, 24561, 509, 498, 510, 502, 2499, 2516, 2456, 2498, 2501, 2497, 2480, 2504, 2511, 2487, 2456, 2486, 2501, 2497, -26339, -24622, 24851, -32046, -25587, -32005, 3238, 1893, 27979, 28201, 22566, 32481, -25664, -25329, 2445, 2448, 2461, 3007, 2990, 2984, 2986, 2402, 2430, 2426, 2409, 2373, 2390, 2369, 2373, 2840, 2837, 2842, 2835, 959, 951, 926, 924, 905, 920, 922, 914, 911, 900, 19158, 24040, -1082, 31993, 32116, -30625, 28650, 23193, -29043, -860, -30625, 31141, 22438, -28059, -30595, 26251, 22221, 24670, 26176, 23594, 28968, 23583, -30709, -29144, 27037, 23787, -30184, 23800, 2775, 2779, 2778, 2752, 2769, 2778, 2752, 2713, 2776, 2769, 2778, 2771, 2752, 2780, 815, 809, 826, 821, 808, 829, 830, 809, 886, 830, 821, 824, 820, 831, 818, 821, 828, 2416, 2423, 2411, 2412, 742, 746, 747, 747, 736, 742, 753, 748, 746, 747, 1211, 1209, 1188, 1203, 1202, 1254, 1194, 1214, 1215, 1187, 1188, 1209, 1186, 1201, 1194, 1215, 1186, 1188, 1189, -30579, 28472, 23118, 22573, 26831, -27037, -30571, 1945, 1941, 1941, 1937, 1939, 1951, 2586, 2574, 2575, 2579, 2580, 2569, 2578, 2561, 2586, 2575, 2578, 2580, 2581, 2566, 2560, 2582, 2561, 2654, 2578, 2580, 2582, 2589, 2567, 1402, 1389, 1390, 1389, 1402, 1389, 1402, 2208, 2237, 2214, 2216, 2214, 2209, 2131, 2129, 2129, 2135, 2114, 2118, 2812, 2814, 2814, 2808, 2797, 2793, 2736, 2808, 2803, 2814, 2802, 2809, 2804, 2803, 2810, 23810, 18627, -29593, 27602, 24228, -28023, -29569, 2424, 2334, 2307, 2319, 2326, 2408, 2318, 2984, 3001, 3001, 2981, 2976, 2986, 2984, 3005, 2976, 2982, 2983, 3046, 2993, 3044, 2980, 3001, 2988, 2990, 2972, 2971, 2949, 3001, 2990, 3042, 3000, 3023, 3001, 2990, 2987, 2989, 3021, 2990, 3049, 3068, 3069, 3018, 3023, 2991, 3020, 3003, 2991, 3021, 3042, 3003, 3000, 2990, 3001, 2990, 2987, 2989, 2992, 3004, 3004, 3018, 3021, 3042, 3021, 3010, 3020, 3003, 2990, 3004, 3004, 2991, 3021, 3042, 3003, 3000, 2990, 2989, 3001, 2990, 2987, 3018, 3024, 3004, 3019, 3056, 3004, 3051, 2977, 3004, 2984, 3022, 3020, 3002, 2987, 3000, 2990, 3036, 3009, 3029, 3001, 2990, 2987, 3021, 3042, 3053, 2991, 3000, 3007, 3003, 687, 702, 702, 674, 679, 685, 687, 698, 679, 673, 672, 737, 682, 687, 701, 678, 741, 694, 675, 674, 1560, 1546, 1543, 1550, 391, 408, 405, 404, 414, 478, 412, 385, 453, 2226, 2221, 2208, 2209, 2219, 2283, 2236, 2281, 2210, 2216, 2226, 1032, 1047, 1050, 1051, 1041, 1105, 1030, 1107, 1043, 1055, 1034, 1036, 1041, 1037, 1045, 1055, 3314, 3309, 3296, 3297, 3307, 3243, 3305, 3316, 3254, 3312, 25013, 27253, 27808, 21127, 25068, 22239, -25399, -32193, 25544, 26632, 28381, 20730, -30546, 23897, -24908, -32702, 24677, 27557, 2080, 2122, 2131, 2127, 2126, 2080, 24636, 22287, -25319, -31761, 2960, 2949, 2949, 1789, 865, 880, 886, 884, 275, 258, 260, 262, 256, 268, 278, 269, 279, 2789, 2784, 2788, 2784, 2813, 1095, 1116, 1095, 1106, 1119, 306, 286, 286, 282, 280, 276, 533, 545, 544, 572, 571, 550, 573, 558, 565, 544, 573, 571, 570, -32762, 26547, 23068, 26783, -25359, -32144, 3025, 3001, 2981, 2981, 2977, 2978, 1698, 1664, 1664, 1670, 1683, 1687, 1742, 1702, 1677, 1664, 1676, 1671, 1674, 1677, 1668, 1265, 1276, 1277, 1270, 1260, 1265, 1260, 1249, 27262, 25022, 22860, 27054, 27175, 23828, -26878, -30220, 355, 372, 312, 354, 357, 353, 272, 279, 307, 379, 379, 358, 279, 307, 377, 379, 279, 307, 380, 301, 278, 357, 353, 20686, 20670, 28610, 22769, -27929, -29679, 1837, 1826, 1838, 1830, 471, 462, 452, 1969, 1958, 1966, 1954, 1969, 1960, 2006, 1994, 1998, 2013, 2051, 2064, 2055, 2051, 2125, 2112, 2121, 2140, 1568, 1570, 1589, 1582, 1587, 1040, 1053, 1030, 1041, 1047, 1024, 1051, 1030, 1781, 1785, 1784, 1762, 1779, 1784, 1762, 2498, 2493, 2466, 2520, 2531, 2497, 2556, 2504, 2498, 2507, 2493, 2536, 2494, 2541, 2535, 2534, 2496, 2467, 2558, 2532, 2539, 2537, 2504, 2492, 2488, 2557, 2467, 2554, 2559, 2518, 2485, 2554, 2531, 2516, 2532, 2530, 2522, 2524, 2533, 2516, 2549, 2552, 2549, 2534, 2518, 2556, 2525, 2505, 2503, 2541, 2488, 2548, 2523, 2501, 2553, 2506, 2528, 2496, 2548, 2517, 2489, 2485, 2496, 2542, 2550, 2491, 2517, 2525, 2502, 2542, 2520, 2553, 2516, 2500, 2494, 2489, 2539, 2531, 2488, 2491, 2505, 2494, 2521, 2550, 2543, 2526, 2484, 2524, 2500, 2517, 2502, 2517, 2491, 2557, 2509, 2520, 2517, 2493, 2553, 2497, 2506, 2500, 2494, 2536, 2493, 2516, 2524, 2496, 2542, 2497, 2481, 1051, 1124, 1147, 1044, 1084, 1027, 1086, 1056, 1029, 1121, 1069, 1053, 1061, 1146, 1054, 1060, 1073, 1074, 1121, 1043, 1127, 1086, 1061, 1084, 1043, 1036, 1071, 1030, 1039, 1060, 1120, 1087, 1150, 1029, 1072, 1026, 1042, 1043, 1146, 1069, 1124, 1126, 1127, 1036, 1053, 1061, 1060, 1082, 1080, 1126, 1085, 1084, 1036, 1031, 1048, 1061, 1039, 1133, 1079, 1073, 1127, 1080, 1028, 1052, 1060, 1133, 1079, 1048, 1132, 1074, 1041, 1027, 
    1029, 1123, 1120, 1125, 1055, 1087, 1053, 1025, 1087, 1047, 1120, 1050, 1071, 1122, 1078, 1086, 1125, 1085, 1028, 1123, 1083, 1041, 1080, 1028, 1123, 1058, 1044, 1053, 1043, 1058, 1063, 1026, 1075, 1121, 1150, 1043, 1028, 1052, 1128, 1840, 1871, 1872, 1845, 1844, 1811, 1804, 1837, 1817, 1812, 1815, 1831, 1855, 1813, 1868, 1836, 1877, 1835, 1817, 1818, 1811, 1866, 1833, 1809, 1847, 1801, 1805, 1818, 1800, 1866, 1848, 1873, 1820, 1839, 1828, 1804, 1818, 1855, 1839, 1868, 1871, 1820, 1833, 1848, 1848, 1804, 1816, 1864, 1812, 1862, 1802, 1853, 1816, 1863, 1806, 1863, 1828, 1803, 1865, 1818, 1838, 1802, 1846, 1821, 1846, 1806, 1864, 1817, 1835, 1835, 1814, 1869, 1846, 1836, 1796, 1806, 1862, 1815, 1811, 1848, 1817, 1836, 1828, 1813, 1869, 1865, 1817, 1820, 1801, 1851, 1847, 1843, 1863, 1807, 1796, 1823, 1835, 1851, 1801, 1830, 1863, 1815, 1840, 1870, 1816, 1805, 1828, 1847, 1869, 1866, 1859, 1895, 1816, 1799, 1894, 1895, 1919, 1822, 1794, 1918, 1916, 1900, 1817, 1858, 1893, 1870, 1885, 1857, 1820, 1869, 1857, 1863, 1881, 1916, 1856, 1817, 1919, 1892, 1902, 1902, 1868, 1873, 1822, 1914, 1866, 1862, 1862, 1889, 1817, 1905, 1891, 1901, 1820, 1880, 1873, 1892, 1871, 1794, 1888, 1918, 1869, 1887, 1794, 1860, 1881, 1819, 1882, 1914, 1881, 1868, 1875, 1889, 1808, 1798, 1893, 1899, 1868, 1892, 1904, 1794, 1893, 1798, 1900, 1900, 1818, 1912, 1870, 1915, 1914, 1859, 1794, 1907, 1869, 1898, 1907, 1821, 1904, 1885, 1823, 1861, 1866, 1913, 1914, 1809, 1887, 1904, 1881, 1857, 1809, 1904, 1867, 1858, 1861, 1864, 1905, 1883, 1914, 1912, 1809, 1809, 1823, 1901, 1916, 1893, 1862, 1872, 1820, 1869, 1889, 1905, 1901, 1859, 1918, 1809, 1866, 1875, 1819, 1916, 1859, 1869, 1899, 1885, 1898, 1822, 1873, 1898, 1916, 1912, 1819, 1899, 1919, 1914, 1889, 1886, 1890, 1808, 1818, 1918, 1866, 1917, 1871, 1816, 1896, 1902, 1881, 1819, 1885, 1880, 1869, 1880, 1919, 1905, 1871, 1914, 1880, 1915, 1881, 1895, 1858, 1892, 1856, 1823, 1881, 1859, 1904, 1812, 27769, 26553, -28693, 26718, 22204, 24538, 23853, -30407, 607, 605, 587, 583, 596, 583, 593, 601, 603, 604, 597, 28158, 26174, -29076, 27097, -30116, 23740, 2494, 2460, 2460, 2458, 2447, 2443, 2514, 2490, 2449, 2460, 2448, 2459, 2454, 2449, 2456, 3187, 3198, 3199, 3188, 3182, 3187, 3182, 3171, 1240, 1225, 1225, 1237, 1232, 1242, 1240, 1229, 1232, 1238, 1239, 1174, 1235, 1226, 1238, 1239, 1154, 1177, 1242, 1233, 1240, 1227, 1226, 1244, 1229, 1156, 1228, 1229, 1247, 1172, 1153, 25826, 28450, 27530, 24102, 27141, 17034, 24424, 31151, 28413, 25917, 24462, 20588, 24015, 27949, -27775, -29321, 526, 532, 632, 527, 564, 632, 559, 613, 632, 620, 638, 634, 520, 639, 616, 558, 613, 633, 615, 552, 28135, 26151, 1442, 1472, 1507, 1521, 1511, 1460, 1462, 1442, 28094, 23181, -28517, -29075, 27801, 26457, 24378, 24955, -28187, -28909, 24935, 27303, 24015, 22422, -32543, 21188, 20531, -31705, 1639, 1635, 1624, 1615, 1615, 1618, 1615, 27752, 26536, 25344, 22188, -28396, -28702, 1633, 1652, 1652, 2977, 2961, 988, 985, 972, 985, -32063, 25972, 21700, 23264, 25790, 27424, 29679, 26534, 21804, 28188, 23339, 20733, 23072, -29397, 27294, -29863, 25386, 486, 484, 497, 480, 482, 490, 503, 508, 454, 490, 491, 497, 480, 491, 497, 1918, 1919, 1902, 1915, 1907, 1910, 1881, 1909, 1908, 1902, 1919, 1908, 1902, 526, 521, 540, 521, 520, 526, 2604, 2600, 1508, 1510, 1521, 1516, 1514, 1515, 1795, 1793, 1814, 1795, 1810, 1793, 1814, 2134, 2118, 2112, 2123, 2112, 1352, 1369, 1354, 1369, 1365, 1355, 27977, 26249, 28233, -24696, -29973, 23606, 2569, 2571, 2572, 2566, 2140, 2123, 2141, 2139, 2114, 2138, 3022, 3026, 3039, 3015, 3035, 3020, 2284, 2283, 2293, 732, 721, 725, 720, 721, 710, 711, 3034, 3027, 3022, 3025, 3037, 3016, 814, 831, 812, 813, 827, 25564, 25167, 25089, 25631, 28493, 22654, -28056, -29538, 21172, 18293, 21564, 28428, -26564, -30751, 28426, 24342, 27524, 25965, 24508, 19069, 27922, 23073, 19235, 19246, -31526, 2615, 2602, 2592, 2600, 2598, 2615, 25760, 28512, 30125, 28587, -26148, -30934, 549, 553, 552, 565, 563, 555, 547, 723, 721, 716, 705, 710, 24721, 28280, 21513, 25948, -27094, -30500, 2603, 2620, 2600, 2604, 2620, 2602, 2605, 27665, 26577, 28433, -24880, -28307, -28773, 1454, 1446, 1463, 1451, 1452, 1447, 702, 700, 685, 2744, 2741, 2750, 2723, 2693, 2744, 2796, 2798, -30656, 28661, 26126, 28514, 24993, 26836, 26160, -26962, -30632, 2360, 2356, 2357, 2351, 2366, 2357, 2351, 2422, 2351, 2338, 2347, 2366, 2327, 2331, 2330, 2304, 2321, 2330, 2304, 2393, 2321, 2330, 2327, 2331, 2320, 2333, 2330, 2323, 1305, 1306, 1302, 1300, 1281, 1308, 1306, 1307, 1472, 1501, 1497, 1489, 1499, 1473, 1472, 1275, 1277, 2479, 2473, 2490, 2485, 2472, 2475, 2484, 2473, 2479, 2436, 2494, 2473, 2473, 2484, 2473, 23350, 20215, 26248, 22164, 25094, 27887, 22677, -29567, -30752, 24661, -31792, 21808, 24157, 21508, -31401, 21431, 1610, 1638, 1639, 1661, 1644, 1639, 1661, 1572, 1612, 1639, 1642, 1638, 1645, 1632, 1639, 1646, 1779, 1774, 1789, 1764, 2157, 2144, 2145, 2154, 2160, 2157, 2160, 2173, 26166, 22128, 20830, 23303, 31365, 32146, -28534, -29060, 2461, 2481, 2480, 2474, 2491, 2480, 2474, 2547, 2442, 2471, 2478, 2491, 1120, 1151, 1138, 1139, 1145, 1081, 1896, 1916, 1901, 1888, 1894, 1830, 2662, 2683, 2670, 2668, 2686, 2681, 2663, 970, 975, 989, 966, 901, 982, 963, 962, 22901, 19636, -30704, 28581, -27417, -30106, 25803, 21719, 24645, 28332, 23561, 18888, -29332, 27353, -28261, -28902, 25015, 20907, 25913, 27600, 26823, 22657, 24577, 28389, -31579, 21061, 24434, 19123, -29161, 27042, -27936, -29599, 25292, 21200, 26178, 26795, 2191, 2184, 2186, 2178, 2212, 2184, 2185, 2195, 2178, 2185, 2195, 3046, 3041, 3043, 3051, 3032, 3047, 3050, 3051, 3041, 3021, 3041, 3040, 3066, 3051, 3040, 3066, 1714, 1711, 1699, 1783, 28395, 23000, -27698, -29384, 3109, 932, 952, 952, 956, 1014, 995, 995, 949, 937, 937, 941, 942, 999, 1010, 1010, 2515, 2510, 2498, 2454, 24970, 22201, -25425, -32167, 1020, 2893, 2901, 2893, 537, 517, 520, 528, 519, 520, 516, 524, 3322, 3303, 3307, 3263, 22472, 26410, -26234, -30864, 824, 800, 824, 2776, 2756, 2761, 2769, 2758, 2761, 2757, 2765, 3071, 3043, 3054, 3062, 3041, 3054, 3042, 3050, 32029, -29107, 22447, 31314, -29595, -26915, 3156, 3148, 3156, 3108, 23348, 
    23364, 25656, 21259, -26339, -30741, 1744, 1749, 1743, 1736, 21667, -28964, -30349, 24467, 663, 666, 3020, 3037, 3035, 3033, 3040, 3057, 3063, 3061, 3059, 3071, 3045, 3070, 3044, 421, 416, 420, 416, 445, 3025, 3018, 3025, 3012, 3017, 1108, 1098, 1118, 2027, 2032, 2045, 2028, 2042, 1972, 1977, 1956, 1969, 1976, 1968, 1976, 2151, 2132, 2139, 2130, 2128, 20990, 17471, -31073, -31744, -31573, 21110, 2704, 2739, 2751, 2749, 2728, 2741, 2739, 2738, 22949, 19556, -28988, -29605, 21511, 21623, -27090, -30504, 24519, 18950, -30554, -30151, 22042, -28933, -28596, -28998, 953, 917, 917, 913, 915, 927, 1315, 1303, 1302, 1290, 1293, 1296, 1291, 1304, 1283, 1302, 1291, 1293, 1292, 20999, 18374, 24485, 24533, 28183, 18072, 23418, 32189, 21367, 18102, 25049, 22250, 28367, -32221, 23502, 2125, 2122, 2132, 2543, 2530, 2534, 2531, 2530, 2549, 2548, 3047, 3054, 3059, 3052, 3040, 3061, 3038, 3010, 3023, 3031, 3019, 3036, 3053, 3009, 3008, 3034, 3019, 3008, 3034, 446, 424, 428, 447, 430, 421, 398, 418, 419, 441, 424, 419, 441, 912, 902, 898, 913, 896, 907, 928, 908, 909, 919, 902, 909, 919};
    public volatile Session a;

    final class Failure extends IOException {
        public Failure(String str) {
            super(str);
        }
    }

    final class Reply {
        public final int a;
        public final Headers b;
        public final byte[] c;

        public Reply(int i, Headers headers, byte[] bArr) {
            this.a = i;
            this.b = headers;
            this.c = bArr;
        }
    }

    final class Session {
        public final String a;
        public final String b;
        public final HashSet c = new HashSet();
        public final OkHttpClient d;
        public volatile boolean e;

        public Session(String str, String str2) {
            OkHttpClient.Builder builderRetryOnConnectionFailure = new OkHttpClient.Builder().proxy(java.net.Proxy.NO_PROXY).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(false);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.d = builderRetryOnConnectionFailure.connectTimeout(6L, timeUnit).readTimeout(12L, timeUnit).writeTimeout(12L, timeUnit).addNetworkInterceptor(new C0451c(4)).build();
            this.a = str;
            this.b = str2;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0018.m70(f88short, 0, 1, 3217));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws Throwable {
        JSONArray jSONArray;
        JSONObject jSONObject;
        ArrayList arrayList;
        ShangTou shangTou = this;
        String strM365 = C0092.m365(f88short, 1, 4, 2650);
        Session session = shangTou.a;
        long jC = c();
        try {
            JSONObject jSONObjectE = e(session, C0044.m175(f88short, 5, 3, 3144), new JSONObject(), jC);
            JSONObject jSONObject2 = jSONObjectE.getJSONObject(C0001.m1(f88short, 8, 7, 1436));
            JSONArray jSONArray2 = jSONObjectE.getJSONArray(C0006.m21(f88short, 15, 7, 1927));
            j(C0056.m223(f88short, 22, 4, 871), jSONArray2.length() <= 64);
            ArrayList arrayList2 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            while (i < jSONArray2.length()) {
                try {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                    String strR = r(C0107.m427(f88short, 26, 2, 2701), jSONObject3);
                    arrayList2.add(new com.github.catvod.spider.merge.p001b.b(strR, h(r(strM365, jSONObject3)), null));
                    if (z) {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray(strR);
                        j(C0140.m558(f88short, 28, 4, 1943), jSONArray3.length() <= 32);
                        ArrayList arrayList3 = new ArrayList();
                        int i2 = 0;
                        while (i2 < jSONArray3.length()) {
                            JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
                            JSONArray jSONArray4 = jSONObject4.getJSONArray(C0018.m70(f88short, 32, 5, 1510));
                            JSONArray jSONArray5 = jSONArray2;
                            JSONObject jSONObject5 = jSONObject2;
                            j(C0063.m249(f88short, 37, 6, 1995), jSONArray4.length() <= 10000);
                            ArrayList arrayList4 = new ArrayList();
                            JSONArray jSONArray6 = jSONArray3;
                            int i3 = 0;
                            while (i3 < jSONArray4.length()) {
                                JSONObject jSONObject6 = jSONArray4.getJSONObject(i3);
                                arrayList4.add(new com.github.catvod.spider.merge.p001b.c(h(r(C0050.m199(f88short, 43, 1, 1982), jSONObject6)), r(C0044.m175(f88short, 44, 1, 2702), jSONObject6)));
                                i3++;
                                jSONArray4 = jSONArray4;
                                arrayList2 = arrayList2;
                            }
                            arrayList3.add(new com.github.catvod.spider.merge.p001b.d(r(C0049.m193(f88short, 45, 3, 1588), jSONObject4), h(r(strM365, jSONObject4)), arrayList4));
                            i2++;
                            jSONArray2 = jSONArray5;
                            jSONObject2 = jSONObject5;
                            jSONArray3 = jSONArray6;
                            arrayList2 = arrayList2;
                        }
                        jSONArray = jSONArray2;
                        jSONObject = jSONObject2;
                        arrayList = arrayList2;
                        linkedHashMap.put(strR, arrayList3);
                    } else {
                        jSONArray = jSONArray2;
                        jSONObject = jSONObject2;
                        arrayList = arrayList2;
                    }
                    i++;
                    shangTou = this;
                    jSONArray2 = jSONArray;
                    jSONObject2 = jSONObject;
                    arrayList2 = arrayList;
                } catch (Exception e) {
                    e = e;
                    return com.github.catvod.spider.merge.p001b.g.d(d(e));
                }
            }
            ArrayList arrayList5 = arrayList2;
            try {
                shangTou.b(session, jC);
                return com.github.catvod.spider.merge.p001b.g.v(arrayList5, linkedHashMap);
            } catch (Exception e2) {
                e = e2;
                return com.github.catvod.spider.merge.p001b.g.d(d(e));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        try {
            return s(str).encodedPath().matches(C0003.m10(f88short, 48, 34, 891));
        } catch (Exception unused) {
            return false;
        }
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        Session session = this.a;
        long jC = c();
        try {
            return n(session, e(session, C0010.m36(f88short, 82, 4, 1599), new JSONObject(), jC), jC);
        } catch (Exception e) {
            return o(e, 1);
        }
    }

    private /* synthetic */ boolean $host$53940b53855fde82() {
        return false;
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int iMax;
        String str3 = str;
        Session session = this.a;
        long jC = c();
        try {
            iMax = (int) Math.max(1L, Math.min(1000000L, Long.parseLong(str2.trim())));
        } catch (Exception unused) {
            iMax = 1;
        }
        try {
            String strM126 = C0032.m126(f88short, 86, 6, 2842);
            JSONObject jSONObject = new JSONObject();
            String strM292 = C0074.m292(f88short, 92, 2, 950);
            if (str3 == null) {
                str3 = "";
            }
            return n(session, e(session, strM126, jSONObject.put(strM292, str3).put(C0030.m116(f88short, 94, 4, 2918), iMax).put(C0059.m234(f88short, 98, 5, 3255), z), jC), jC);
        } catch (Exception e) {
            return o(e, iMax);
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws Throwable {
        String strM42 = C0011.m42(f88short, 103, 3, 2010);
        Session session = this.a;
        long jC = c();
        try {
            JSONObject jSONObjectE = e(session, C0055.m219(f88short, 106, 6, 3157), new JSONObject().put(C0118.m471(f88short, 112, 2, 1054), str2), jC);
            int iK = k(0, C0119.m473(f88short, 114, 5, 732), jSONObjectE);
            boolean z = true;
            j(C0021.m83(f88short, 119, 8, 1386), iK <= 1);
            HttpUrl httpUrlS = s(r(strM42, jSONObjectE));
            Headers headersG = g(jSONObjectE.getJSONObject(C0018.m70(f88short, 127, 7, 1956)), true);
            if (!httpUrlS.isHttps() && (headersG.get(C0117.m467(f88short, 134, 6, 1977)) != null || headersG.get(C0008.m31(f88short, 140, 13, 1216)) != null)) {
                z = false;
            }
            j(C0047.m186(f88short, 153, 12, 1736), z);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < headersG.size(); i++) {
                linkedHashMap.put(headersG.name(i), headersG.value(i));
            }
            b(session, jC);
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.q(iK);
            gVar.C(httpUrlS.toString());
            gVar.h(linkedHashMap);
            if (iK == 0) {
                gVar.f(r(C0104.m414(f88short, 165, 6, 3151), jSONObjectE));
            }
            gVar.b(AbstractC0280n1.i(str, str2, null, null));
            return gVar.r();
        } catch (Exception e) {
            String strD = d(e);
            return new JSONObject(com.github.catvod.spider.merge.p001b.g.d(strD)).put(strM42, "").put(C0105.m416(f88short, 171, 5, 350), strD).toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:13:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:19:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:25:0x0133 A[Catch: Exception -> 0x0167, TRY_ENTER, TryCatch #1 {Exception -> 0x0167, blocks: (B:17:0x00dc, B:21:0x0100, B:22:0x011a, B:25:0x0133, B:27:0x0143, B:29:0x014e, B:36:0x016f, B:37:0x01bd, B:39:0x01c5, B:40:0x01e8, B:41:0x01f3, B:43:0x0215, B:44:0x021a), top: B:53:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0143 A[Catch: Exception -> 0x0167, TryCatch #1 {Exception -> 0x0167, blocks: (B:17:0x00dc, B:21:0x0100, B:22:0x011a, B:25:0x0133, B:27:0x0143, B:29:0x014e, B:36:0x016f, B:37:0x01bd, B:39:0x01c5, B:40:0x01e8, B:41:0x01f3, B:43:0x0215, B:44:0x021a), top: B:53:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:34:0x016c  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c5 A[Catch: Exception -> 0x0167, TryCatch #1 {Exception -> 0x0167, blocks: (B:17:0x00dc, B:21:0x0100, B:22:0x011a, B:25:0x0133, B:27:0x0143, B:29:0x014e, B:36:0x016f, B:37:0x01bd, B:39:0x01c5, B:40:0x01e8, B:41:0x01f3, B:43:0x0215, B:44:0x021a), top: B:53:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0215 A[Catch: Exception -> 0x0167, TryCatch #1 {Exception -> 0x0167, blocks: (B:17:0x00dc, B:21:0x0100, B:22:0x011a, B:25:0x0133, B:27:0x0143, B:29:0x014e, B:36:0x016f, B:37:0x01bd, B:39:0x01c5, B:40:0x01e8, B:41:0x01f3, B:43:0x0215, B:44:0x021a), top: B:53:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01bd A[EDGE_INSN: B:60:0x01bd->B:37:0x01bd BREAK  A[LOOP:1: B:22:0x011a->B:36:0x016f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x003f  */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        boolean z;
        JSONArray jSONArray;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        boolean z3;
        ArrayList arrayList3;
        int i2;
        int length;
        JSONArray jSONArray3;
        String strM408;
        String strR;
        String str;
        boolean z4;
        ShangTou shangTou = this;
        String strM325 = C0082.m325(f88short, 176, 3, 844);
        String strM10 = C0003.m10(f88short, 179, 2, 343);
        Session session = shangTou.a;
        long jC = c();
        if (list == null) {
            z = false;
            j(C0018.m70(f88short, 181, 6, 1299), z);
            JSONObject jSONObjectE = e(session, C0085.m339(f88short, 187, 6, 2989), new JSONObject().put(strM10, list.get(0)), jC);
            JSONObject jSONObject2 = jSONObjectE.getJSONObject(C0119.m473(f88short, 193, 3, 2371));
            k kVarT = t(r(strM10, jSONObject2), jSONObject2);
            jSONArray = jSONObjectE.getJSONArray(C0026.m102(f88short, 196, 5, 2453));
            if (jSONArray.length() <= 64) {
                z2 = true;
            } else {
                z2 = false;
            }
            j(C0133.m529(f88short, 201, 4, 713), z2);
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            i = 0;
            while (i < jSONArray.length()) {
                jSONObject = jSONArray.getJSONObject(i);
                jSONArray2 = jSONObject.getJSONArray(C0120.m477(f88short, 205, 8, 1030));
                if (jSONArray2.length() <= 10000) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                j(C0026.m102(f88short, 213, 4, 1771), z3);
                arrayList3 = new ArrayList();
                i2 = 0;
                while (true) {
                    length = jSONArray2.length();
                    jSONArray3 = jSONArray;
                    strM408 = C0103.m408(f88short, 217, 4, 403);
                    if (i2 < length) {
                        break;
                        break;
                    }
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    JSONArray jSONArray4 = jSONArray2;
                    strR = r(strM10, jSONObject3);
                    if (strR.isEmpty()) {
                        str = strM10;
                    } else {
                        str = strM10;
                        if (strR.length() > 200000) {
                        }
                        j(C0087.m346(f88short, 235, 6, 2324), z4);
                        arrayList3.add(h(r(strM408, jSONObject3)) + C0117.m467(f88short, 241, 1, 3202) + strR);
                        i2++;
                        jSONArray = jSONArray3;
                        jSONArray2 = jSONArray4;
                        strM10 = str;
                    }
                    z4 = false;
                    j(C0087.m346(f88short, 235, 6, 2324), z4);
                    arrayList3.add(h(r(strM408, jSONObject3)) + C0117.m467(f88short, 241, 1, 3202) + strR);
                    i2++;
                    jSONArray = jSONArray3;
                    jSONArray2 = jSONArray4;
                    strM10 = str;
                }
                String str2 = strM10;
                if (!arrayList3.isEmpty()) {
                    arrayList.add(h(r(strM408, jSONObject)));
                    arrayList2.add(TextUtils.join(C0017.m65(f88short, 242, 1, 1862), arrayList3));
                }
                i++;
                shangTou = this;
                jSONArray = jSONArray3;
                strM10 = str2;
            }
            j(C0026.m102(f88short, 243, 6, 3017), !arrayList.isEmpty());
            if (!session.b.isEmpty()) {
                C0294s1.c(session.b, arrayList);
            }
            kVarT.q(TextUtils.join(strM325, arrayList));
            kVarT.r(TextUtils.join(strM325, arrayList2));
            b(session, jC);
            N1.d(kVarT);
            return com.github.catvod.spider.merge.p001b.g.s(kVarT);
        }
        try {
            if (list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            j(C0018.m70(f88short, 181, 6, 1299), z);
            JSONObject jSONObjectE2 = e(session, C0085.m339(f88short, 187, 6, 2989), new JSONObject().put(strM10, list.get(0)), jC);
            JSONObject jSONObject4 = jSONObjectE2.getJSONObject(C0119.m473(f88short, 193, 3, 2371));
            k kVarT2 = t(r(strM10, jSONObject4), jSONObject4);
            jSONArray = jSONObjectE2.getJSONArray(C0026.m102(f88short, 196, 5, 2453));
            if (jSONArray.length() <= 64) {
                z2 = true;
            } else {
                z2 = false;
            }
            j(C0133.m529(f88short, 201, 4, 713), z2);
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            i = 0;
            while (i < jSONArray.length()) {
                try {
                    jSONObject = jSONArray.getJSONObject(i);
                    jSONArray2 = jSONObject.getJSONArray(C0120.m477(f88short, 205, 8, 1030));
                    if (jSONArray2.length() <= 10000) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    j(C0026.m102(f88short, 213, 4, 1771), z3);
                    arrayList3 = new ArrayList();
                    i2 = 0;
                    while (true) {
                        length = jSONArray2.length();
                        jSONArray3 = jSONArray;
                        strM408 = C0103.m408(f88short, 217, 4, 403);
                        if (i2 < length) {
                            break;
                        }
                        JSONObject jSONObject5 = jSONArray2.getJSONObject(i2);
                        JSONArray jSONArray5 = jSONArray2;
                        strR = r(strM10, jSONObject5);
                        if (strR.isEmpty()) {
                            str = strM10;
                            if (strR.length() > 200000 && !strR.matches(C0001.m1(f88short, 221, 14, 2539))) {
                                z4 = true;
                            }
                            j(C0087.m346(f88short, 235, 6, 2324), z4);
                            arrayList3.add(h(r(strM408, jSONObject5)) + C0117.m467(f88short, 241, 1, 3202) + strR);
                            i2++;
                            jSONArray = jSONArray3;
                            jSONArray2 = jSONArray5;
                            strM10 = str;
                        } else {
                            str = strM10;
                        }
                        z4 = false;
                        j(C0087.m346(f88short, 235, 6, 2324), z4);
                        arrayList3.add(h(r(strM408, jSONObject5)) + C0117.m467(f88short, 241, 1, 3202) + strR);
                        i2++;
                        jSONArray = jSONArray3;
                        jSONArray2 = jSONArray5;
                        strM10 = str;
                    }
                    String str3 = strM10;
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(h(r(strM408, jSONObject)));
                        arrayList2.add(TextUtils.join(C0017.m65(f88short, 242, 1, 1862), arrayList3));
                    }
                    i++;
                    shangTou = this;
                    jSONArray = jSONArray3;
                    strM10 = str3;
                } catch (Exception e) {
                    e = e;
                }
            }
            j(C0026.m102(f88short, 243, 6, 3017), !arrayList.isEmpty());
            if (!session.b.isEmpty()) {
                C0294s1.c(session.b, arrayList);
            }
            kVarT2.q(TextUtils.join(strM325, arrayList));
            kVarT2.r(TextUtils.join(strM325, arrayList2));
            try {
                b(session, jC);
                N1.d(kVarT2);
                return com.github.catvod.spider.merge.p001b.g.s(kVarT2);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        return com.github.catvod.spider.merge.p001b.g.d(d(e));
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int iMax;
        Session session = this.a;
        long jC = c();
        try {
            iMax = (int) Math.max(1L, Math.min(1000000L, Long.parseLong(str2.trim())));
        } catch (Exception unused) {
            iMax = 1;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put(C0050.m199(f88short, 249, 3, 2553), str).put(C0074.m292(f88short, 252, 4, 3023), iMax);
            String[] strArr = {C0050.m199(f88short, 256, 4, 2331), C0087.m346(f88short, 260, 4, 2340), C0009.m33(f88short, 264, 4, 2932), C0019.m75(f88short, 268, 2, 975)};
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                if (map != null && map.get(str3) != null) {
                    jSONObjectPut.put(str3, map.get(str3));
                }
            }
            return n(session, e(session, C0032.m126(f88short, 270, 8, 1021), jSONObjectPut, jC), jC);
        } catch (Exception e) {
            return o(e, iMax);
        }
    }

    public static long c() {
        return TimeUnit.SECONDS.toNanos(45L) + System.nanoTime();
    }

    public static String d(Exception exc) {
        String strM169;
        StringBuilder sb = new StringBuilder(C0014.m54(f88short, 278, 3, 1244));
        if (exc instanceof Failure) {
            strM169 = exc.getMessage();
        } else {
            strM169 = exc instanceof IOException ? C0043.m169(f88short, 281, 12, 936) : C0055.m219(f88short, 293, 8, 1326);
        }
        sb.append(strM169);
        return sb.toString();
    }

    public static Headers g(JSONObject jSONObject, boolean z) throws Failure {
        j(C0103.m408(f88short, 301, 5, 1503), jSONObject.toString().length() <= 16384);
        Headers.Builder builder = new Headers.Builder();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String lowerCase = next.toLowerCase(Locale.ROOT);
            j(C0128.m511(f88short, 370, 7, 890), !Arrays.asList(C0056.m223(f88short, 337, 4, 2328), C0089.m355(f88short, 306, 14, 2740), C0103.m408(f88short, 320, 17, 859), C0119.m473(f88short, 341, 10, 645), C0008.m31(f88short, 351, 19, 1227)).contains(lowerCase));
            if (z) {
                j(C0115.m459(f88short, 440, 7, 1936), Arrays.asList(C0026.m102(f88short, 396, 10, 2675), C0098.m390(f88short, 406, 7, 1288), C0021.m83(f88short, 413, 6, 2255), C0014.m54(f88short, 377, 6, 2042), C0079.m314(f88short, 383, 13, 2683), C0142.m567(f88short, 419, 6, 2098), C0032.m126(f88short, 425, 15, 2717)).contains(lowerCase));
            }
            builder.set(next, r(next, jSONObject));
        }
        return builder.build();
    }

    public static String h(String str) {
        return str.replace('$', (char) 65284).replace('#', (char) 65283).replace('\r', ' ').replace('\n', ' ').trim();
    }

    public static String i(byte[] bArr) {
        String strTrim = new String(bArr, StandardCharsets.UTF_8).trim();
        if (strTrim.startsWith(C0076.m301(f88short, 447, 7, 2395))) {
            return C0096.m382(f88short, 454, 21, 3017);
        }
        if (strTrim.matches(C0049.m193(f88short, 475, 81, 2961))) {
            return C0026.m102(f88short, 556, 20, 718);
        }
        if (bArr.length >= 8 && new String(bArr, 4, 4, StandardCharsets.US_ASCII).equals(C0079.m314(f88short, 576, 4, 1662))) {
            return C0130.m516(f88short, 580, 9, 497);
        }
        if (bArr.length >= 3 && bArr[0] == 70 && bArr[1] == 76 && bArr[2] == 86) {
            return C0096.m382(f88short, 589, 11, 2244);
        }
        if (bArr.length >= 4 && bArr[0] == 26 && bArr[1] == 69 && bArr[2] == -33 && bArr[3] == -93) {
            return C0085.m339(f88short, 600, 16, 1150);
        }
        return (bArr.length > 376 && bArr[0] == 71 && bArr[188] == 71 && bArr[376] == 71) ? C0140.m558(f88short, 616, 10, 3204) : "";
    }

    public static void j(String str, boolean z) throws Failure {
        if (!z) {
            throw new Failure(str);
        }
    }

    public static int k(int i, String str, JSONObject jSONObject) throws Failure {
        Object objOpt = jSONObject.opt(str);
        j(C0093.m368(f88short, 626, 8, 2512), (objOpt instanceof Integer) || (objOpt instanceof Long));
        long jLongValue = ((Number) objOpt).longValue();
        j(C0014.m54(f88short, 634, 8, 2989), jLongValue >= ((long) i) && jLongValue <= 2147483647L);
        return (int) jLongValue;
    }

    public static JSONObject l(byte[] bArr) throws JSONException, Failure {
        JSONTokener jSONTokener = new JSONTokener(StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString());
        Object objNextValue = jSONTokener.nextValue();
        j(C0089.m355(f88short, 642, 12, 2048), (objNextValue instanceof JSONObject) && jSONTokener.nextClean() == 0);
        return (JSONObject) objNextValue;
    }

    public static String m(HttpUrl httpUrl) {
        return httpUrl.scheme() + C0045.m177(f88short, 654, 3, 2986) + httpUrl.host() + C0043.m169(f88short, 657, 1, 1735) + httpUrl.port();
    }

    public static String o(Exception exc, int i) {
        return new JSONObject(com.github.catvod.spider.merge.p001b.g.d(d(exc))).put(C0008.m31(f88short, 658, 4, 785), i).put(C0089.m355(f88short, 662, 9, 355), i).put(C0122.m486(f88short, 671, 5, 2697), 24).put(C0105.m416(f88short, 676, 5, 1075), 0).toString();
    }

    public static Request.Builder q(HttpUrl httpUrl, Headers headers) throws Failure {
        j(C0076.m301(f88short, 700, 12, 3057), httpUrl.isHttps() || (headers.get(C0117.m467(f88short, 681, 6, 369)) == null && headers.get(C0095.m379(f88short, 687, 13, 596)) == null));
        Request.Builder builderTag = new Request.Builder().url(httpUrl).headers(headers).tag(Headers.class, headers);
        String strM223 = C0056.m223(f88short, 712, 15, 1763);
        if (headers.get(strM223) == null) {
            builderTag.header(strM223, C0026.m102(f88short, 727, 8, 1176));
        }
        return builderTag;
    }

    public static String r(String str, JSONObject jSONObject) throws Failure {
        Object objOpt = jSONObject.opt(str);
        j(C0114.m454(f88short, 735, 8, 539), objOpt instanceof String);
        return (String) objOpt;
    }

    public static HttpUrl s(String str) throws Failure {
        boolean z = false;
        boolean z2 = (str == null || str.length() > 32768 || str.matches(C0103.m408(f88short, 743, 23, 331))) ? false : true;
        String strM21 = C0006.m21(f88short, 766, 6, 2046);
        j(strM21, z2);
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl != null && httpUrl.username().isEmpty() && httpUrl.password().isEmpty()) {
            z = true;
        }
        j(strM21, z);
        return httpUrl;
    }

    public static k t(String str, JSONObject jSONObject) {
        k kVar = new k(str, h(r(C0021.m83(f88short, 772, 4, 1859), jSONObject)), r(C0006.m21(f88short, 776, 3, 423), jSONObject), h(r(C0106.m422(f88short, 779, 6, 1987), jSONObject)));
        kVar.u(jSONObject.optString(C0056.m223(f88short, 785, 4, 1967)));
        kVar.k(jSONObject.optString(C0070.m277(f88short, 789, 4, 2146)));
        kVar.i(jSONObject.optString(C0082.m325(f88short, 793, 4, 2105)));
        kVar.j(jSONObject.optString(C0043.m169(f88short, 797, 5, 1601)));
        kVar.m(jSONObject.optString(C0105.m416(f88short, 802, 8, 1140)));
        kVar.l(jSONObject.optString(C0055.m219(f88short, 810, 7, 1686)));
        return kVar;
    }

    public final JSONObject a(Session session, JSONObject jSONObject, long j) throws Throwable {
        b(session, j);
        String string = jSONObject.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM1 = C0001.m1(f88short, 817, 111, 2444);
        String strM292 = C0074.m292(f88short, 928, 111, 1109);
        byte[] bArrT = FishCrypto.t(strM1, strM292, C0010.m36(f88short, 1039, 111, 1918), C0140.m558(f88short, 1150, 175, 1833), bytes);
        j(C0120.m477(f88short, 1325, 8, 1052), bArrT != null && bArrT.length > 0);
        JSONObject jSONObject2 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM360 = C0091.m360(f88short, 1333, 11, 562);
        byte[] bytes2 = jSONObject2.put(strM360, strEncodeToString).toString().getBytes(charset);
        j(C0045.m177(f88short, 1344, 6, 1435), bytes2.length <= 10485760);
        Reply replyF = f(session, new Request.Builder().url(session.a).header(C0070.m277(f88short, 1350, 15, 2559), C0126.m503(f88short, 1365, 8, 3098)).post(RequestBody.create(MediaType.parse(C0137.m545(f88short, 1373, 31, 1209)), bytes2)).build(), j, 10485760, false);
        b(session, j);
        j(C0092.m365(f88short, 1404, 8, 3207), replyF.a == 200);
        JSONObject jSONObjectL = l(replyF.c);
        j(C0001.m1(f88short, 1412, 8, 1688), jSONObjectL.length() == 1);
        String strR = r(strM360, jSONObjectL);
        boolean z = ((long) strR.length()) <= ((((long) 10485760) + 2) / 3) * 4 && strR.matches(C0043.m169(f88short, 1420, 20, 597));
        String strM390 = C0098.m390(f88short, 1440, 14, 1410);
        j(strM390, z);
        byte[] bArrDecode = Base64.decode(strR, 2);
        j(strM390, bArrDecode.length <= 10485760 && Base64.encodeToString(bArrDecode, 2).equals(strR));
        j(C0092.m365(f88short, 1454, 6, 1276), bArrDecode.length > 0 && bArrDecode.length % 16 == 0);
        byte[] bArrS = FishCrypto.s(strM1, strM292, bArrDecode);
        j(C0093.m368(f88short, 1460, 8, 2306), bArrS != null && bArrS.length > 0 && bArrS.length <= 10485760);
        JSONObject jSONObjectL2 = l(bArrS);
        if (Boolean.TRUE.equals(jSONObjectL2.opt(C0101.m402(f88short, 1468, 2, 1544)))) {
            return jSONObjectL2.getJSONObject(C0056.m223(f88short, 1486, 4, 952));
        }
        String strM108 = C0028.m108(f88short, 1470, 5, 1597);
        String strM116 = C0030.m116(f88short, 1475, 6, 1037);
        String strOptString = jSONObjectL2.optString(strM108, strM116);
        j(strM116, (strOptString.length() > 160 || strOptString.contains(C0006.m21(f88short, 1481, 3, 1627)) || strOptString.contains(C0059.m234(f88short, 1484, 1, 2987)) || strOptString.contains(C0101.m402(f88short, 1485, 1, 2972))) ? false : true);
        throw new Failure(strOptString);
    }

    public final long b(Session session, long j) throws Failure {
        j(C0076.m301(f88short, 1490, 13, 2358), (session == null || session != this.a || session.e || Thread.currentThread().isInterrupted()) ? false : true);
        long jNanoTime = j - System.nanoTime();
        j(C0074.m292(f88short, 1503, 4, 1756), jNanoTime > 0);
        return jNanoTime;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0049.m193(f88short, 1507, 15, 389));
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
        Session session = this.a;
        this.a = null;
        if (session == null) {
            return;
        }
        synchronized (session) {
            try {
                session.e = true;
                Iterator it = session.c.iterator();
                while (it.hasNext()) {
                    ((Call) it.next()).cancel();
                }
                session.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        session.d.connectionPool().evictAll();
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0104.m414(f88short, 1522, 13, 1818));
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

    /* JADX WARN: Code duplicated, block: B:113:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x023a  */
    /* JADX WARN: Code duplicated, block: B:52:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:57:0x0344  */
    /* JADX WARN: Code duplicated, block: B:66:0x03c4 A[Catch: IOException -> 0x03eb, TryCatch #5 {IOException -> 0x03eb, blocks: (B:63:0x037e, B:66:0x03c4, B:68:0x03cc, B:69:0x03d3, B:70:0x03d7), top: B:103:0x037e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x03cc A[Catch: IOException -> 0x03eb, TryCatch #5 {IOException -> 0x03eb, blocks: (B:63:0x037e, B:66:0x03c4, B:68:0x03cc, B:69:0x03d3, B:70:0x03d7), top: B:103:0x037e }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0417  */
    /* JADX WARN: Code duplicated, block: B:85:0x0429  */
    public final JSONObject e(Session session, String str, JSONObject jSONObject, long j) throws Throwable {
        int i;
        JSONObject jSONObjectPut;
        String strM193;
        boolean zEquals;
        String strM382;
        boolean z;
        String str2;
        Object obj;
        JSONObject jSONObject2;
        String str3;
        String str4;
        String strM558;
        JSONObject jSONObject3;
        boolean z2;
        Headers headers;
        JSONObject jSONObject4;
        String[] strArr;
        int i2;
        String str5;
        Object obj2;
        JSONObject jSONObject5;
        String str6;
        JSONObject jSONObjectP;
        JSONObject jSONObjectPut2;
        JSONObject jSONObject6;
        boolean z3;
        ShangTou shangTou = this;
        String str7 = str;
        String strM70 = C0018.m70(f88short, 1535, 6, 637);
        String strM223 = C0056.m223(f88short, 1541, 2, 2627);
        shangTou.b(session, j);
        JSONObject jSONObject7 = new JSONObject();
        String strM36 = C0010.m36(f88short, 1543, 6, 1413);
        JSONObject jSONObjectA = shangTou.a(session, jSONObject7.put(strM36, C0142.m567(f88short, 1549, 7, 1907)).put(C0140.m558(f88short, 1556, 5, 2085), str7).put(C0106.m422(f88short, 1561, 6, 1336), jSONObject), j);
        JSONObject jSONObject8 = null;
        int i3 = 0;
        while (true) {
            String strM554 = C0139.m554(f88short, 1567, 6, 1324);
            if (i3 > 24) {
                throw new Failure(strM554);
            }
            shangTou.b(session, j);
            String strR = r(C0076.m301(f88short, 1573, 4, 2658), jSONObjectA);
            String strM402 = C0101.m402(f88short, 1577, 6, 2094);
            boolean zEquals2 = strR.equals(strM402);
            String strM355 = C0089.m355(f88short, 1583, 6, 3006);
            String strM288 = C0073.m288(f88short, 1589, 3, 2201);
            String str8 = strM70;
            String strM249 = C0063.m249(f88short, 1592, 7, 692);
            String strM289 = C0073.m288(f88short, 1599, 6, 3004);
            if (zEquals2) {
                JSONObject jSONObject9 = jSONObjectA.getJSONObject(strM402);
                if (str7.equals(strM355)) {
                    int iK = k(0, C0032.m126(f88short, 1605, 5, 862), jSONObject9);
                    j(C0114.m454(f88short, 1610, 8, 1905), iK <= 1);
                    if (iK == 0) {
                        j(C0081.m322(f88short, 1618, 10, 2086), jSONObject8 != null);
                        j(C0001.m1(f88short, 1628, 7, 1326), !jSONObject9.has(strM289) || r(strM289, jSONObject9).equals(jSONObject8.getString(strM289)));
                        jSONObject9.put(strM288, jSONObject8.getString(strM288)).put(strM249, jSONObject8.getJSONObject(strM249)).put(strM289, jSONObject8.getString(strM289));
                    }
                }
                return jSONObject9;
            }
            j(strM554, i3 < 24);
            String strM365 = C0092.m365(f88short, 1635, 6, 2627);
            String strR2 = r(strM365, jSONObjectA);
            if (strR2.isEmpty()) {
                i = i3;
            } else {
                i = i3;
                boolean z4 = strR2.length() <= 400000;
                j(C0017.m65(f88short, 1641, 6, 3269), z4);
                jSONObjectPut = new JSONObject().put(strM36, C0126.m503(f88short, 1647, 7, 582)).put(strM365, strR2);
                strM193 = C0049.m193(f88short, 1654, 5, 675);
                if (strR.equals(strM193)) {
                    j(C0090.m358(f88short, 1659, 6, 819), str7.equals(strM355));
                    try {
                        HttpUrl httpUrlS = s(r(strM288, jSONObjectA));
                        Headers headersG = g(jSONObjectA.getJSONObject(strM249), true);
                        obj2 = "";
                        jSONObject5 = jSONObjectPut;
                        str6 = strM193;
                        try {
                            jSONObjectP = p(session, httpUrlS, headersG, j);
                            try {
                                jSONObjectPut2 = new JSONObject().put(strM223, true).put(strM289, jSONObjectP.getString(strM289));
                                z3 = false;
                                shangTou = this;
                                jSONObject6 = jSONObject5;
                            } catch (Exception unused) {
                                shangTou = this;
                                shangTou.b(session, j);
                                jSONObjectPut2 = new JSONObject().put(strM223, false).put(strM289, obj2);
                                jSONObject6 = jSONObject5;
                                z3 = true;
                            }
                        } catch (Exception unused2) {
                            jSONObjectP = null;
                            shangTou = this;
                            shangTou.b(session, j);
                            jSONObjectPut2 = new JSONObject().put(strM223, false).put(strM289, obj2);
                            jSONObject6 = jSONObject5;
                            z3 = true;
                            jSONObject6.put(str6, jSONObjectPut2);
                            jSONObject3 = jSONObjectP;
                            z2 = z3;
                            jSONObject2 = jSONObject6;
                            str3 = strM223;
                            str4 = str8;
                            shangTou.b(session, j);
                            JSONObject jSONObjectA2 = shangTou.a(session, jSONObject2, j);
                            j(C0087.m346(f88short, 1764, 8, 420), !z2);
                            i3 = i + 1;
                            str7 = str;
                            jSONObject8 = jSONObject3;
                            jSONObjectA = jSONObjectA2;
                            strM70 = str4;
                            strM223 = str3;
                        }
                    } catch (Exception unused3) {
                        obj2 = "";
                        jSONObject5 = jSONObjectPut;
                        str6 = strM193;
                    }
                    jSONObject6.put(str6, jSONObjectPut2);
                    jSONObject3 = jSONObjectP;
                    z2 = z3;
                    jSONObject2 = jSONObject6;
                    str3 = strM223;
                    str4 = str8;
                } else {
                    shangTou = this;
                    j(C0096.m382(f88short, 1672, 6, 1140), strR.equals(C0046.m182(f88short, 1665, 7, 2649)));
                    HttpUrl httpUrlS2 = s(r(strM288, jSONObjectA));
                    Headers headersG2 = g(jSONObjectA.getJSONObject(strM249), false);
                    zEquals = r(C0120.m477(f88short, 1678, 6, 1475), jSONObjectA).equals(C0019.m75(f88short, 1684, 3, 761));
                    strM382 = C0096.m382(f88short, 1687, 8, 2778);
                    if (zEquals || !r(strM382, jSONObjectA).isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    j(C0096.m382(f88short, 1695, 9, 951), z);
                    try {
                        obj = "";
                        jSONObject2 = jSONObjectPut;
                        str3 = strM223;
                        try {
                            Reply replyF = f(session, q(httpUrlS2, headersG2).build(), j, 4194304, false);
                            str4 = str8;
                            try {
                                JSONObject jSONObjectPut3 = jSONObject2.put(str4, replyF.a);
                                headers = replyF.b;
                                jSONObject4 = new JSONObject();
                                strArr = new String[]{C0142.m567(f88short, 1732, 8, 1397), C0139.m554(f88short, 1704, 12, 2395), C0028.m108(f88short, 1716, 16, 2420)};
                                for (i2 = 0; i2 < 3; i2++) {
                                    str5 = strArr[i2];
                                    if (headers.get(str5) != null) {
                                        jSONObject4.put(str5, headers.get(str5));
                                    }
                                }
                                str2 = strM382;
                                try {
                                    jSONObjectPut3.put(strM249, jSONObject4).put(str2, Base64.encodeToString(replyF.c, 2));
                                } catch (IOException e) {
                                    e = e;
                                    shangTou.b(session, j);
                                    JSONObject jSONObjectPut4 = jSONObject2.put(str4, 0).put(strM249, new JSONObject()).put(str2, obj);
                                    if (e instanceof SocketTimeoutException) {
                                        strM558 = C0017.m65(f88short, 1740, 7, 1460);
                                    } else {
                                        strM558 = C0140.m558(f88short, 1747, 2, 1170);
                                    }
                                    jSONObjectPut4.put(C0072.m285(f88short, 1749, 15, 2523), strM558);
                                }
                            } catch (IOException e2) {
                                e = e2;
                                str2 = strM382;
                                shangTou.b(session, j);
                                JSONObject jSONObjectPut5 = jSONObject2.put(str4, 0).put(strM249, new JSONObject()).put(str2, obj);
                                if (e instanceof SocketTimeoutException) {
                                    strM558 = C0017.m65(f88short, 1740, 7, 1460);
                                } else {
                                    strM558 = C0140.m558(f88short, 1747, 2, 1170);
                                }
                                jSONObjectPut5.put(C0072.m285(f88short, 1749, 15, 2523), strM558);
                                jSONObject3 = null;
                                z2 = false;
                                shangTou.b(session, j);
                                JSONObject jSONObjectA3 = shangTou.a(session, jSONObject2, j);
                                j(C0087.m346(f88short, 1764, 8, 420), !z2);
                                i3 = i + 1;
                                str7 = str;
                                jSONObject8 = jSONObject3;
                                jSONObjectA = jSONObjectA3;
                                strM70 = str4;
                                strM223 = str3;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            str4 = str8;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        str2 = strM382;
                        obj = "";
                        jSONObject2 = jSONObjectPut;
                        str3 = strM223;
                        str4 = str8;
                    }
                    jSONObject3 = null;
                    z2 = false;
                }
                shangTou.b(session, j);
                JSONObject jSONObjectA4 = shangTou.a(session, jSONObject2, j);
                j(C0087.m346(f88short, 1764, 8, 420), !z2);
                i3 = i + 1;
                str7 = str;
                jSONObject8 = jSONObject3;
                jSONObjectA = jSONObjectA4;
                strM70 = str4;
                strM223 = str3;
            }
            j(C0017.m65(f88short, 1641, 6, 3269), z4);
            jSONObjectPut = new JSONObject().put(strM36, C0126.m503(f88short, 1647, 7, 582)).put(strM365, strR2);
            strM193 = C0049.m193(f88short, 1654, 5, 675);
            if (strR.equals(strM193)) {
                j(C0090.m358(f88short, 1659, 6, 819), str7.equals(strM355));
                HttpUrl httpUrlS3 = s(r(strM288, jSONObjectA));
                Headers headersG3 = g(jSONObjectA.getJSONObject(strM249), true);
                obj2 = "";
                jSONObject5 = jSONObjectPut;
                str6 = strM193;
                jSONObjectP = p(session, httpUrlS3, headersG3, j);
                jSONObjectPut2 = new JSONObject().put(strM223, true).put(strM289, jSONObjectP.getString(strM289));
                z3 = false;
                shangTou = this;
                jSONObject6 = jSONObject5;
                jSONObject6.put(str6, jSONObjectPut2);
                jSONObject3 = jSONObjectP;
                z2 = z3;
                jSONObject2 = jSONObject6;
                str3 = strM223;
                str4 = str8;
            } else {
                shangTou = this;
                j(C0096.m382(f88short, 1672, 6, 1140), strR.equals(C0046.m182(f88short, 1665, 7, 2649)));
                HttpUrl httpUrlS4 = s(r(strM288, jSONObjectA));
                Headers headersG4 = g(jSONObjectA.getJSONObject(strM249), false);
                zEquals = r(C0120.m477(f88short, 1678, 6, 1475), jSONObjectA).equals(C0019.m75(f88short, 1684, 3, 761));
                strM382 = C0096.m382(f88short, 1687, 8, 2778);
                if (zEquals) {
                    z = false;
                } else {
                    z = false;
                }
                j(C0096.m382(f88short, 1695, 9, 951), z);
                obj = "";
                jSONObject2 = jSONObjectPut;
                str3 = strM223;
                Reply replyF2 = f(session, q(httpUrlS4, headersG4).build(), j, 4194304, false);
                str4 = str8;
                JSONObject jSONObjectPut6 = jSONObject2.put(str4, replyF2.a);
                headers = replyF2.b;
                jSONObject4 = new JSONObject();
                strArr = new String[]{C0142.m567(f88short, 1732, 8, 1397), C0139.m554(f88short, 1704, 12, 2395), C0028.m108(f88short, 1716, 16, 2420)};
                while (i2 < 3) {
                    str5 = strArr[i2];
                    if (headers.get(str5) != null) {
                        jSONObject4.put(str5, headers.get(str5));
                    }
                }
                str2 = strM382;
                jSONObjectPut6.put(strM249, jSONObject4).put(str2, Base64.encodeToString(replyF2.c, 2));
                jSONObject3 = null;
                z2 = false;
            }
            shangTou.b(session, j);
            JSONObject jSONObjectA5 = shangTou.a(session, jSONObject2, j);
            j(C0087.m346(f88short, 1764, 8, 420), !z2);
            i3 = i + 1;
            str7 = str;
            jSONObject8 = jSONObject3;
            jSONObjectA = jSONObjectA5;
            strM70 = str4;
            strM223 = str3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0287 A[LOOP:0: B:75:0x01f3->B:103:0x0287, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0293 A[Catch: all -> 0x0274, TRY_LEAVE, TryCatch #6 {all -> 0x0274, blocks: (B:106:0x0293, B:114:0x02b6, B:124:0x0305, B:131:0x0312, B:130:0x030f, B:93:0x0248, B:115:0x02bf, B:116:0x02c4, B:118:0x02ce, B:123:0x02e5, B:126:0x0309), top: B:182:0x0248, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x029f  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b6 A[Catch: all -> 0x0274, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x0274, blocks: (B:106:0x0293, B:114:0x02b6, B:124:0x0305, B:131:0x0312, B:130:0x030f, B:93:0x0248, B:115:0x02bf, B:116:0x02c4, B:118:0x02ce, B:123:0x02e5, B:126:0x0309), top: B:182:0x0248, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02ce A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:115:0x02bf, B:116:0x02c4, B:118:0x02ce, B:123:0x02e5), top: B:171:0x02bf, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:156:0x034f A[Catch: all -> 0x034d, TRY_LEAVE, TryCatch #2 {all -> 0x034d, blocks: (B:156:0x034f, B:153:0x0349, B:149:0x0343), top: B:173:0x0343, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x032b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0353 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[LOOP:1: B:116:0x02c4->B:202:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[Catch: all -> 0x00b6, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00b6, blocks: (B:26:0x00a2, B:28:0x00a8, B:42:0x00e1, B:48:0x010f, B:53:0x012b, B:55:0x0131, B:63:0x017f, B:65:0x0196, B:67:0x01ad, B:69:0x01c4), top: B:185:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x010f A[Catch: all -> 0x00b6, TRY_ENTER, TryCatch #8 {all -> 0x00b6, blocks: (B:26:0x00a2, B:28:0x00a8, B:42:0x00e1, B:48:0x010f, B:53:0x012b, B:55:0x0131, B:63:0x017f, B:65:0x0196, B:67:0x01ad, B:69:0x01c4), top: B:185:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x012b A[Catch: all -> 0x00b6, TryCatch #8 {all -> 0x00b6, blocks: (B:26:0x00a2, B:28:0x00a8, B:42:0x00e1, B:48:0x010f, B:53:0x012b, B:55:0x0131, B:63:0x017f, B:65:0x0196, B:67:0x01ad, B:69:0x01c4), top: B:185:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x014d  */
    /* JADX WARN: Code duplicated, block: B:63:0x017f A[Catch: all -> 0x00b6, TRY_ENTER, TryCatch #8 {all -> 0x00b6, blocks: (B:26:0x00a2, B:28:0x00a8, B:42:0x00e1, B:48:0x010f, B:53:0x012b, B:55:0x0131, B:63:0x017f, B:65:0x0196, B:67:0x01ad, B:69:0x01c4), top: B:185:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01de  */
    /* JADX WARN: Code duplicated, block: B:80:0x0203 A[Catch: all -> 0x0279, TryCatch #10 {all -> 0x0279, blocks: (B:78:0x01fb, B:80:0x0203, B:83:0x0224, B:85:0x022e, B:91:0x0242), top: B:189:0x01fb }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0222 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x027d  */
    public final Reply f(Session session, Request request, long j, int i, boolean z) throws Throwable {
        boolean z2;
        Call call;
        Response response;
        Throwable th;
        boolean z3;
        Buffer buffer;
        long j2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Call call2;
        Buffer buffer2;
        Throwable th2;
        boolean z8;
        Reply reply;
        GzipSource gzipSource;
        Buffer buffer3;
        long j3;
        long j4;
        if (request.headers().byteCount() > 65536) {
            z2 = false;
        } else {
            if (request.body() != null) {
                if (request.body().contentLength() > (request.tag(Headers.class) == null ? 10485760 : 4194304)) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        j(C0073.m288(f88short, 1772, 4, 3095), z2);
        OkHttpClient.Builder builderCallTimeout = session.d.newBuilder().callTimeout(b(session, j), TimeUnit.NANOSECONDS);
        if (request.tag(Headers.class) != null) {
            builderCallTimeout.dns(new C0359j(9));
        }
        Call callNewCall = builderCallTimeout.build().newCall(request);
        synchronized (session) {
            b(session, j);
            session.c.add(callNewCall);
        }
        try {
            Response responseExecute = callNewCall.execute();
            try {
                if (responseExecute.headers().byteCount() <= 65536) {
                    if (!z) {
                        try {
                            if (responseExecute.body() != null && responseExecute.body().contentLength() > i) {
                                z3 = false;
                            }
                            j(C0026.m102(f88short, 1776, 4, 2704), z3);
                            buffer = new Buffer();
                            j2 = i;
                            if (!z) {
                                j2++;
                            }
                            if (z) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            String strTrim = responseExecute.header(C0092.m365(f88short, 1780, 16, 1545), "").trim();
                            Locale locale = Locale.ROOT;
                            String lowerCase = strTrim.toLowerCase(locale);
                            if (z4) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (z4) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            j(C0046.m182(f88short, 1808, 8, 1427), z6);
                            String lowerCase2 = responseExecute.header(C0046.m182(f88short, 1816, 12, 2526), "").toLowerCase(locale);
                            if (z4) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            j(C0122.m486(f88short, 1855, 10, 999), z7);
                            while (true) {
                                if (responseExecute.body() != null) {
                                    if (buffer.size() < j2) {
                                        b(session, j);
                                        buffer2 = buffer;
                                        j3 = responseExecute.body().source().read(buffer2, Math.min(8192L, j2 - buffer.size()));
                                        if (z4) {
                                            response = responseExecute;
                                            j4 = j2;
                                            call2 = callNewCall;
                                            if (j3 < 0) {
                                                break;
                                                break;
                                            }
                                            callNewCall = call2;
                                            buffer = buffer2;
                                            responseExecute = response;
                                            j2 = j4;
                                        } else {
                                            response = responseExecute;
                                            j4 = j2;
                                            call2 = callNewCall;
                                            if (j3 < 0) {
                                                break;
                                                break;
                                            }
                                            callNewCall = call2;
                                            buffer = buffer2;
                                            responseExecute = response;
                                            j2 = j4;
                                        }
                                    }
                                }
                                call2 = callNewCall;
                                response = responseExecute;
                                buffer2 = buffer;
                                break;
                            }
                            if (z) {
                                z8 = true;
                            } else {
                                z8 = true;
                            }
                            j(C0017.m65(f88short, 1875, 6, 2914), z8);
                            if (z5) {
                                gzipSource = new GzipSource(buffer2.clone());
                                buffer3 = new Buffer();
                                while (buffer3.size() < 8192) {
                                    b(session, j);
                                    if (gzipSource.read(buffer3, 8192 - buffer3.size()) < 0) {
                                        break;
                                        break;
                                    }
                                }
                                j(C0119.m473(f88short, 1881, 10, 1504), i(buffer3.readByteArray()).isEmpty());
                                gzipSource.close();
                            }
                            b(session, j);
                            reply = new Reply(response.code(), response.headers(), buffer2.readByteArray());
                            response.close();
                            synchronized (session) {
                                session.c.remove(call2);
                                return reply;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            call = callNewCall;
                            response = responseExecute;
                            if (response != null) {
                                throw th;
                            }
                            response.close();
                            throw th;
                            th = th;
                            synchronized (session) {
                                session.c.remove(call);
                                throw th;
                            }
                        }
                    }
                    z3 = true;
                    j(C0026.m102(f88short, 1776, 4, 2704), z3);
                    buffer = new Buffer();
                    j2 = i;
                    if (!z) {
                        j2++;
                    }
                    if (z) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    String strTrim2 = responseExecute.header(C0092.m365(f88short, 1780, 16, 1545), "").trim();
                    Locale locale2 = Locale.ROOT;
                    String lowerCase3 = strTrim2.toLowerCase(locale2);
                    if (z4) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z4) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    j(C0046.m182(f88short, 1808, 8, 1427), z6);
                    String lowerCase4 = responseExecute.header(C0046.m182(f88short, 1816, 12, 2526), "").toLowerCase(locale2);
                    if (z4) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    j(C0122.m486(f88short, 1855, 10, 999), z7);
                    while (true) {
                        if (responseExecute.body() != null) {
                            if (buffer.size() < j2) {
                                b(session, j);
                                buffer2 = buffer;
                                j3 = responseExecute.body().source().read(buffer2, Math.min(8192L, j2 - buffer.size()));
                                if (z4) {
                                    response = responseExecute;
                                    j4 = j2;
                                    call2 = callNewCall;
                                    if (j3 < 0) {
                                        break;
                                        break;
                                    }
                                    callNewCall = call2;
                                    buffer = buffer2;
                                    responseExecute = response;
                                    j2 = j4;
                                } else {
                                    response = responseExecute;
                                    j4 = j2;
                                    call2 = callNewCall;
                                    if (j3 < 0) {
                                        break;
                                        break;
                                    }
                                    callNewCall = call2;
                                    buffer = buffer2;
                                    responseExecute = response;
                                    j2 = j4;
                                }
                            }
                        }
                        call2 = callNewCall;
                        response = responseExecute;
                        buffer2 = buffer;
                        break;
                    }
                    if (z) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    j(C0017.m65(f88short, 1875, 6, 2914), z8);
                    if (z5) {
                        gzipSource = new GzipSource(buffer2.clone());
                        buffer3 = new Buffer();
                        while (buffer3.size() < 8192) {
                            b(session, j);
                            if (gzipSource.read(buffer3, 8192 - buffer3.size()) < 0) {
                                break;
                                break;
                            }
                        }
                        j(C0119.m473(f88short, 1881, 10, 1504), i(buffer3.readByteArray()).isEmpty());
                        gzipSource.close();
                    }
                    b(session, j);
                    reply = new Reply(response.code(), response.headers(), buffer2.readByteArray());
                    response.close();
                    synchronized (session) {
                        session.c.remove(call2);
                        return reply;
                    }
                }
                z3 = false;
                j(C0026.m102(f88short, 1776, 4, 2704), z3);
                buffer = new Buffer();
                j2 = i;
                if (!z) {
                    j2++;
                }
                if (z || request.tag(Headers.class) == null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                String strTrim3 = responseExecute.header(C0092.m365(f88short, 1780, 16, 1545), "").trim();
                Locale locale3 = Locale.ROOT;
                String lowerCase5 = strTrim3.toLowerCase(locale3);
                if (z4 || !lowerCase5.equals(C0119.m473(f88short, 1796, 4, 1684))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z4 || lowerCase5.isEmpty() || lowerCase5.equals(C0010.m36(f88short, 1800, 8, 2052)) || z5) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                j(C0046.m182(f88short, 1808, 8, 1427), z6);
                String lowerCase6 = responseExecute.header(C0046.m182(f88short, 1816, 12, 2526), "").toLowerCase(locale3);
                if (z4 || !(lowerCase6.startsWith(C0087.m346(f88short, 1828, 6, 1046)) || lowerCase6.startsWith(C0011.m42(f88short, 1834, 6, 1801)) || lowerCase6.contains(C0142.m567(f88short, 1840, 7, 2571)) || lowerCase6.contains(C0074.m292(f88short, 1847, 8, 942)))) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                j(C0122.m486(f88short, 1855, 10, 999), z7);
                while (true) {
                    if (responseExecute.body() != null) {
                        try {
                            if (buffer.size() < j2) {
                                b(session, j);
                                buffer2 = buffer;
                                j3 = responseExecute.body().source().read(buffer2, Math.min(8192L, j2 - buffer.size()));
                                if (z4 || z5 || buffer2.size() <= 0) {
                                    response = responseExecute;
                                    j4 = j2;
                                    call2 = callNewCall;
                                } else {
                                    j4 = j2;
                                    if (buffer2.size() >= 8192 || j3 < 0) {
                                        call2 = callNewCall;
                                        response = responseExecute;
                                        try {
                                            j(C0017.m65(f88short, 1865, 10, 1691), i(buffer2.clone().readByteArray(Math.min(8192L, buffer2.size()))).isEmpty());
                                            z4 = false;
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            th = th2;
                                            call = call2;
                                            if (response != null) {
                                                throw th;
                                            }
                                            try {
                                                try {
                                                    response.close();
                                                    throw th;
                                                } catch (Throwable th5) {
                                                    th.addSuppressed(th5);
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                            }
                                            th = th6;
                                        }
                                    } else {
                                        call2 = callNewCall;
                                        response = responseExecute;
                                    }
                                }
                                if (j3 < 0) {
                                    break;
                                }
                                callNewCall = call2;
                                buffer = buffer2;
                                responseExecute = response;
                                j2 = j4;
                            }
                        } catch (Throwable th7) {
                            th2 = th7;
                            call2 = callNewCall;
                            response = responseExecute;
                            th = th2;
                            call = call2;
                            if (response != null) {
                                throw th;
                            }
                            response.close();
                            throw th;
                            th = th6;
                        }
                    }
                    call2 = callNewCall;
                    response = responseExecute;
                    buffer2 = buffer;
                    break;
                }
                if (z || buffer2.size() <= i) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                try {
                    j(C0017.m65(f88short, 1875, 6, 2914), z8);
                    if (z5) {
                        gzipSource = new GzipSource(buffer2.clone());
                        try {
                            buffer3 = new Buffer();
                            while (buffer3.size() < 8192) {
                                b(session, j);
                                if (gzipSource.read(buffer3, 8192 - buffer3.size()) < 0) {
                                    break;
                                }
                            }
                            j(C0119.m473(f88short, 1881, 10, 1504), i(buffer3.readByteArray()).isEmpty());
                            gzipSource.close();
                        } catch (Throwable th8) {
                            try {
                                gzipSource.close();
                                throw th8;
                            } catch (Throwable th9) {
                                th8.addSuppressed(th9);
                                throw th8;
                            }
                        }
                    }
                    b(session, j);
                    reply = new Reply(response.code(), response.headers(), buffer2.readByteArray());
                    try {
                        response.close();
                        synchronized (session) {
                            session.c.remove(call2);
                        }
                        return reply;
                    } catch (Throwable th10) {
                        th = th10;
                        call = call2;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    call = call2;
                    th = th;
                    if (response != null) {
                        throw th;
                    }
                    response.close();
                    throw th;
                    th = th6;
                }
            } catch (Throwable th12) {
                th = th12;
                call = callNewCall;
                response = responseExecute;
            }
        } catch (Throwable th13) {
            th = th13;
            call = callNewCall;
        }
        synchronized (session) {
            session.c.remove(call);
        }
        throw th;
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0117.m467(f88short, 1891, 11, 2279));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0115.m459(f88short, 1902, 16, 2958));
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

    public void init(Context context) {
        init(context, "");
    }

    public synchronized void init(Context context, String str) {
        try {
            destroy();
            String strTrim = str == null ? "" : str.trim();
            j(C0117.m467(f88short, 1918, 8, 1751), !strTrim.isEmpty() && strTrim.length() <= 65536);
            if (!strTrim.startsWith(C0114.m454(f88short, 1926, 1, 3166))) {
                if (!strTrim.regionMatches(true, 0, C0045.m177(f88short, 1927, 7, 972), 0, 7)) {
                    if (!strTrim.regionMatches(true, 0, C0053.m210(f88short, 1934, 8, 989), 0, 8)) {
                        strTrim = FishCrypto.g(strTrim);
                    }
                }
            }
            j(C0053.m210(f88short, 1942, 8, 2486), strTrim.length() <= 65536);
            String strTrim2 = strTrim.trim();
            String strH = "";
            if (strTrim2.startsWith(C0085.m339(f88short, 1950, 1, 903))) {
                JSONObject jSONObjectL = l(strTrim2.getBytes(StandardCharsets.UTF_8));
                Iterator<String> itKeys = jSONObjectL.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    j(C0011.m42(f88short, 1962, 8, 3231), next.equals(C0139.m554(f88short, 1951, 3, 2877)) || next.equals(C0014.m54(f88short, 1954, 8, 617)));
                }
                String strTrim3 = r(C0126.m503(f88short, 1970, 3, 840), jSONObjectL).trim();
                strH = jSONObjectL.has(C0085.m339(f88short, 1973, 8, 2728)) ? h(r(C0044.m175(f88short, 1981, 8, 2959), jSONObjectL)) : "";
                j(C0073.m288(f88short, 1989, 6, 930), strH.length() <= 128);
                strTrim2 = strTrim3;
            }
            HttpUrl httpUrlS = s(strTrim2);
            j(C0126.m503(f88short, 1995, 10, 3076), httpUrlS.fragment() == null);
            this.a = new Session(httpUrlS.toString(), strH);
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isVideoFormat(String str) {
        if (FishCrypto.businessReady()) {
            return $host$42ceaa68a95df632(str);
        }
        return false;
    }

    public boolean manualVideoCheck() {
        if (FishCrypto.businessReady()) {
            return $host$53940b53855fde82();
        }
        return false;
    }

    public final String n(Session session, JSONObject jSONObject, long j) throws JSONException, Failure {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(C0096.m382(f88short, 2005, 4, 1724));
        j(C0021.m83(f88short, 2009, 4, 1716), jSONArray.length() <= 10000);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(t(r(C0045.m177(f88short, 2013, 2, 766), jSONObject2), jSONObject2));
        }
        b(session, j);
        JSONObject jSONObject3 = new JSONObject(com.github.catvod.spider.merge.p001b.g.y(arrayList));
        String strM33 = C0009.m33(f88short, 2015, 4, 3004);
        JSONObject jSONObjectPut = jSONObject3.put(strM33, k(1, strM33, jSONObject));
        String strM116 = C0030.m116(f88short, 2019, 9, 2960);
        JSONObject jSONObjectPut2 = jSONObjectPut.put(strM116, k(1, strM116, jSONObject));
        String strM126 = C0032.m126(f88short, 2028, 5, 457);
        JSONObject jSONObjectPut3 = jSONObjectPut2.put(strM126, k(0, strM126, jSONObject));
        String strM386 = C0097.m386(f88short, 2033, 5, 2981);
        JSONObject jSONObjectPut4 = jSONObjectPut3.put(strM386, k(0, strM386, jSONObject));
        String strM558 = C0140.m558(f88short, 2038, 3, 1081);
        if (jSONObject.has(strM558)) {
            jSONObjectPut4.put(strM558, r(strM558, jSONObject));
        }
        return jSONObjectPut4.toString();
    }

    public final JSONObject p(Session session, HttpUrl httpUrl, Headers headers, long j) throws Throwable {
        Headers.Builder builderNewBuilder = headers.newBuilder();
        String strM169 = C0043.m169(f88short, 2041, 12, 1929);
        String strM10 = C0003.m10(f88short, 2053, 5, 2101);
        Request requestBuild = q(httpUrl, builderNewBuilder.set(strM10, strM169).build()).build();
        int i = 0;
        while (true) {
            String strM126 = C0032.m126(f88short, 2058, 6, 2924);
            if (i > 3) {
                throw new Failure(strM126);
            }
            b(session, j);
            Reply replyF = f(session, requestBuild, j, 8192, true);
            List listAsList = Arrays.asList(301, 302, 303, 307, 308);
            int i2 = replyF.a;
            if (!listAsList.contains(Integer.valueOf(i2))) {
                j(C0001.m1(f88short, 2107, 8, 2197), i2 == 200 || i2 == 206);
                String strI = i(replyF.c);
                j(C0142.m567(f88short, 2115, 7, 2533), !strI.isEmpty());
                Headers headersBuild = requestBuild.headers().newBuilder().removeAll(strM10).build();
                JSONObject jSONObject = new JSONObject();
                for (int i3 = 0; i3 < headersBuild.size(); i3++) {
                    jSONObject.put(headersBuild.name(i3), headersBuild.value(i3));
                }
                return new JSONObject().put(C0009.m33(f88short, 2122, 3, 2104), requestBuild.url().toString()).put(C0103.m408(f88short, 2125, 7, 2439), jSONObject).put(C0115.m459(f88short, 2132, 6, 2945), strI);
            }
            j(strM126, i < 3);
            String str = replyF.b.get(C0014.m54(f88short, 2064, 8, 2780));
            HttpUrl httpUrlResolve = str == null ? null : requestBuild.url().resolve(str);
            j(C0143.m570(f88short, 2072, 8, 823), httpUrlResolve != null);
            s(httpUrlResolve.toString());
            j(C0114.m454(f88short, 2080, 8, 1365), !requestBuild.url().isHttps() || httpUrlResolve.isHttps());
            Headers.Builder builderNewBuilder2 = requestBuild.headers().newBuilder();
            if (!m(httpUrlResolve).equals(m(requestBuild.url()))) {
                builderNewBuilder2.removeAll(C0008.m31(f88short, 2088, 6, 1018)).removeAll(C0130.m516(f88short, 2094, 13, 1378));
            }
            requestBuild = q(httpUrlResolve, builderNewBuilder2.build()).build();
            i++;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0140.m558(f88short, 2138, 13, 2990));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0081.m322(f88short, 2151, 13, 461));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0081.m322(f88short, 2164, 13, 995));
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

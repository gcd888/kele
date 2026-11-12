package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
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
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
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
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.A;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.E;
import com.github.catvod.spider.merge.p017u.F;
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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Kan360 extends Spider {
    public HashMap a;
    public JsonObject c;
    public JsonObject k;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f60short = {2016, 1165, 1167, 1178, 1163, 1161, 1153, 1180, 1159, 1163, 1181, 1616, 1629, 367, 362, 364, 817, 830, 818, 826, 678, 2333, 2328, 2334, 31771, 22111, 1790, 1206, 1203, 1205, 29104, -29373, 22242, 1482, 3166, 3163, 3165, 24261, 25414, 3103, 2921, 2924, 2922, 30118, -30432, 3288, 3282, 3293, 3200, 3205, 3203, 3308, 3264, 3286, 3271, 3271, 3290, 3293, 3284, -29631, 30865, 1632, 1634, 1655, 1638, 1636, 1644, 1649, 1642, 1638, 1648, 1272, 1728, 1741, 499, 396, 403, 389, 399, 476, 466, 406, 488, 394, 460, 510, 503, 475, 463, 396, 394, 495, 492, 470, 504, 511, 461, 455, 497, 393, 497, 468, 478, 396, 491, 508, 479, 472, 470, 469, 463, 388, 458, 394, 402, 456, 484, 506, 463, 487, 453, 479, 508, 468, 393, 506, 457, 472, 499, 511, 397, 397, 466, 452, 464, 493, 463, 452, 473, 507, 392, 470, 459, 397, 470, 459, 398, 461, 474, 474, 389, 394, 393, 501, 495, 487, 402, 479, 489, 460, 463, 475, 463, 496, 484, 402, 466, 461, 476, 456, 493, 393, 467, 402, 497, 475, 499, 505, 506, 495, 459, 485, 406, 504, 384, 2900, 2829, 2820, 2841, 2824, 2830, 2868, 2845, 2902, 2906, 2893, 2816, 2844, 2902, 2815, 2814, 2796, 2695, 2706, 933, 997, 1009, 1004, 1006, 958, 933, 1011, 994, 996, 998, 1005, 1004, 958, 1674, 1754, 1779, 1741, 1756, 1681, 1693, 1674, 1752, 1741, 1742, 1681, 1741, 1728, 1728, 2680, 2685, 2664, 2685, 318, 317, 316, 309, 278, 307, 294, 307, 2536, 2549, 2541, 2537, 26521, 32115, 1306, 1286, 1286, 1282, 1281, 1352, 1373, 1373, 1730, 1758, 1758, 1754, 1680, 1669, 1669, 1829, 1882, 1861, 1820, 1819, 1880, 1854, 1833, 1810, 1825, 1850, 1882, 1874, 1811, 1796, 1887, 1793, 1811, 1823, 1842, 1823, 1828, 1830, 1874, 1807, 1829, 1838, 1874, 1826, 1822, 1831, 1837, 1817, 1822, 1796, 1820, 1807, 1885, 1793, 1855, 1799, 1809, 1887, 1836, 1817, 1824, 1887, 1854, 1881, 1797, 1805, 1836, 1825, 1839, 1883, 1819, 1823, 1860, 1796, 1816, 1822, 1874, 1826, 1885, 1881, 1823, 1798, 1880, 1796, 1793, 1819, 1794, 1851, 1824, 1842, 1822, 1829, 1797, 1875, 1850, 1852, 1826, 1828, 1802, 1854, 1801, 1830, 1805, 1820, 1878, 1878, 2078, 1404, 1379, 1390, 1391, 1381, 1333, 1404, 1379, 1390, 1335, 1538, 1633, 28043, 27939, 32495, 27846, 27989, -25451, 27598, 783, 783, 783, 742, 747, 747, 754, 759, 750, 745, 737, 744, 1993, 1948, 1926, 1947, 1930, 2002, 969, 968, 971, 972, 984, 961, 985, 968, 989, 964, 990, 962, 969, 968, 2071, 2058, 2071, 2063, 2054, 2160, 2173, 2173, 2164, 2145, 2168, 2165, 2164, 2149, 2160, 2168, 2173, 306, 311, 290, 311, 2800, 2741, 2743, 2746, 2746, 2740, 2743, 2741, 2749, 2795, -29388, 30097, 328, 338, 1884, 1856, 1856, 1860, 1863, 1806, 2643, 2648, 2647, 2644, 2650, 2643, 2642, 2326, 2311, 2324, 2325, 2307, 465, 460, 471, 472, 449, 464, 465, 3044, 3059, 3045, 3059, 3042, 1227, 1222, 1231, 1235, 1822, 1854, 2491, 402, 493, 498, 403, 408, 485, 422, 438, 499, 429, 430, 436, 446, 431, 435, 399, 424, 392, 442, 396, 427, 402, 410, 446, 495, 425, 388, 422, 411, 410, 426, 426, 443, 435, 442, 408, 439, 431, 411, 393, 397, 403, 492, 440, 399, 484, 495, 439, 413, 436, 440, 414, 413, 390, 395, 491, 405, 429, 443, 411, 395, 435, 446, 434, 426, 396, 408, 495, 411, 432, 406, 433, 414, 401, 425, 411, 420, 488, 405, 431, 402, 430, 432, 422, 395, 499, 404, 446, 431, 440, 405, 420, 398, 489, 428, 393, 426, 410, 484, 427, 413, 405, 400, 390, 431, 422, 485, 403, 410, 401, 481, 1911, 1852, 1853, 1836, 1849, 1841, 1844, 1895, 1851, 1849, 1836, 1893, 3098, 3157, 3160, 3073, 2473, 2440, 2503, 2435, 2438, 2451, 2438, 3187, 3188, 3198, 3187, 3199, 3174, 3189, 3170, 1551, 1555, 1555, 1559, 2663, 2661, 2684, 2659, 2671, 2665, 2667, 2686, 2671, 2669, 2661, 2680, 2675, 654, 669, 650, 654, 3083, 3078, 3101, 3082, 3084, 3099, 3072, 3101, 2615, 2613, 2594, 2617, 2596, 391, 390, 400, 384, 401, 394, 403, 407, 394, 396, 397, 3130, 3135, 3112, 3118, 3115, 3134, 3119, 1519, 1508, 1534, 1513, 1514, 1509, 1528, 1512, 1508, 1529, 1518, 667, 647, 650, 658, 647, 642, 645, 640, 692, 664, 642, 671, 654, 664, 279, 267, 262, 286, 267, 270, 265, 268, 276, 259, 258, 275, 262, 270, 267, 1615, 1092, 1091, 1117, -27164, 32567, 2345, 2428, 2427, 2414, 2429, 2427, 2354, 1527, 1460, 1471, 1461, 1516, 2942, 2914, 2927, 2935, 2914, 2919, 2912, 2917, 2897, 2912, 2939, 2915, 2771, 2761, 2772, 2757, 2326, 2327, 2324, 2323, 2311, 2334, 2310, 2349, 2311, 2304, 2334, 27690, 28089, 2211, 490, 1298, 1285, 1299, 1285, 1300, 3153, 3136, 3155, 3154, 3140, 3088, 3101, 3092, 3080, 1117, 1088, 1115, 1108, 1101, 1116, 1117, 2787, 2792, 2791, 2788, 2794, 2787, 2786, 1976, 1970, 1981, 2016, 2021, 2019, 1932, 1952, 1974, 1959, 1959, 1978, 1981, 1972, 28152, -32404, 30140, 2632, 2644, 2644, 2640, 2643, 2586, 2575, 2575, 1091, 1119, 1119, 1115, 1041, 1028, 1028, 26994, 22687, 20802, 28741, 24530, 31649, 30472, 2649, 2642, 2653, 2654, 2640, 2649, 2648, 3150, 3141, 3146, 3145, 3143, 3150, 3151, 27277, 21912, -29186, 25485, 1170, 1155, 1168, 1169, 1159, 1794, 1811, 1792, 1793, 1815, -31925, 27960, 26893, 22859, 21878, -30909, 26208, 2238, 2212, 1776, 1773, 1782, 1785, 1760, 1777, 1776, 3066, 3047, 3068, 3059, 3050, 3067, 3066, 23636, 20951, -29216, 27843, 1292, 1307, 1293, 1307, 1290, 26930, 20573, -26744, -32012, 659, 644, 658, 644, 661, 1308, 1297, 1304, 1284, 18967, 28736, 23366, 22465, -26807, 31082, -29200, 24586, 21128, 18811, 29484, 25859, 21843, 2138, 2135, 2142, 2114, 2276, 2295, 2296, 2301, 1835, 1833, 1852, 2067, 2063, 2059, 2072, 1201, 1186, 1205, 1201, 3095, 3094, 3076, 3183, 3194, 1919, 1792, 1823, 1918, 1909, 1800, 1867, 1883, 1822, 1856, 1859, 1881, 1875, 1858, 1886, 1890, 1861, 1893, 1879, 1889, 1862, 1919, 1911, 1875, 1794, 1860, 1897, 1867, 1910, 1911, 1863, 1863, 1878, 1886, 1879, 1909, 1882, 1858, 1910, 1892, 1888, 1918, 1793, 1877, 1890, 1801, 1794, 1882, 1904, 1881, 1877, 1907, 1904, 1899, 1894, 1798, 1912, 1856, 1878, 
    1910, 1894, 1886, 1875, 1887, 1863, 1889, 1909, 1794, 1910, 1885, 1915, 1884, 1907, 1916, 1860, 1910, 1865, 1797, 1912, 1858, 1919, 1859, 1885, 1867, 1894, 1822, 1913, 1875, 1858, 1877, 1912, 1865, 1891, 1796, 1857, 1892, 1863, 1911, 1801, 1862, 1904, 1912, 1917, 1899, 1858, 1867, 1800, 1918, 1911, 1916, 1804, 2505, 2432, 2447, 2442, 2450, 2435, 2452, 2505, 2442, 2447, 2453, 2450, 2521, 2437, 2439, 2450, 2447, 2434, 2523, 1352, 1308, 1295, 1280, 1285, 1363, 2046, 1979, 1977, 1964, 2021, 2904, 2823, 2843, 2847, 2828, 2883, 1250, 1189, 1206, 1185, 1189, 1273, 3072, 3157, 3151, 3164, 3139, 3099, 3093, 3091, 3072, 3158, 3143, 3137, 3139, 3144, 3145, 3099, 951, 946, 935, 946, 2006, 2004, 1997, 2002, 2014, 1992, 2241, 2265, 2249, 2265, 1288, 1280, 1075, 1061, 1087, 1057, 1087, 2195, 2177, 1763, 1763, 1973, 1977, 3132, 3128, 3122, 3130, 1658, 1648, 3266, 3275, 3293, 3270, 3271, 2799, 2800, 1326, 1317, 1312, 1317, 1326, 1317, 1312, 1317, 1405, 3039, 3025, 2045, 2017, 2022, 2043, 1319, 1340, 2890, 2838, 2846, 2839, 2834, 1746, 1754, 1011, 1006, 1018, 1013, 995, 1010, 1922, 1938, 2862, 2853, 2879, 2867, 2851, 2852, 494, 499, 2015, 1998, 1984, 2002, 1990, 1606, 1625, 3137, 3142, 3160, 1036, 1040, 1040, 1044, 1118, 1099, 1099, 1651, 1647, 1647, 1643, 1640, 1569, 1588, 1588, 902, 897, 899, 907, 960, 900, 926, 905, 2510, 491, 503, 503, 499, 496, 441, 2263, 2266, 3109, 3128, 3109, 3133, 3124, 2427, 2428, 2422, 2427, 2423, 2414, 2429, 2410, 2922, 2934, 2934, 2930, 2029, 2017, 2019, 2019, 2027, 2016, 2042, 793, 796, 779, 781, 776, 797, 780, 3168, 2500, 2520, 2520, 2524, 2527, 2454, 1741, 1743, 1754, 1777, 1735, 1738, 3305, 3298, 3283, 3301, 3304, 2241, 2268, 2241, 2265, 2256, 2273, 2253, 2241, 2165, 2152, 2165, 2157, 2148, 2550, 2449, 2452, 2548, 2455, 2529, 2548, 3010, 3022, 3031, 3012, 3027, 2391, 2379, 2379, 2383, 965, 967, 978, 1017, 968, 967, 971, 963, 1485, 1552, 1554, 1541, 1560, 1566, 1567, 804, 875, 885, 865, 804, 828, 804, 853, 883, 869, 869, 867, 885, 885, 804, 1774, 1768, 1047, 1045, 1024, 1041, 1043, 1051, 1030, 1037, 1079, 1051, 1050, 1024, 1041, 1050, 1024, 658, 659, 642, 663, 671, 666, 693, 665, 664, 642, 659, 664, 642, 1920, 2047, 2016, 1977, 1982, 2045, 1947, 1932, 1975, 1924, 1951, 2047, 2039, 1974, 1953, 2042, 1956, 1974, 1978, 1943, 1978, 1921, 1923, 2039, 1962, 1920, 1931, 2039, 1927, 1979, 1922, 1928, 1980, 1979, 1953, 1977, 1962, 2040, 1956, 1946, 1954, 1972, 2042, 1929, 1980, 1925, 2042, 1947, 2044, 1952, 1960, 1929, 1924, 1930, 2046, 1982, 1978, 2017, 1953, 1981, 1979, 2039, 1927, 2040, 2044, 1978, 1955, 2045, 1953, 1956, 1982, 1959, 1950, 1925, 1943, 1979, 1920, 1952, 2038, 1951, 1945, 1927, 1921, 1967, 1947, 1964, 1923, 1960, 1977, 2035, 2035, 2481, 2486, 2484, 2492, 2458, 2486, 2487, 2477, 2492, 2487, 2477, 1289, 1294, 1292, 1284, 1335, 1288, 1285, 1284, 1294, 1314, 1294, 1295, 1301, 1284, 1295, 1301, 933, 899, 917, 898, 989, 945, 919, 917, 926, 900, 2871, 2837, 2816, 2835, 2838, 2838, 2843, 2901, 2895, 2900, 2890, 2906, 2898, 2870, 2835, 2836, 2831, 2818, 2881, 2906, 2875, 2836, 2846, 2824, 2837, 2835, 2846, 2906, 2891, 2890, 2881, 2906, 2871, 2837, 2840, 2835, 2838, 2847, 2899, 2906, 2875, 2826, 2826, 2838, 2847, 2861, 2847, 2840, 2865, 2835, 2830, 2901, 2895, 2889, 2893, 2900, 2889, 2892, 2906, 2898, 2865, 2866, 2862, 2871, 2870, 2902, 2906, 2838, 2835, 2833, 2847, 2906, 2877, 2847, 2841, 2833, 2837, 2899, 2906, 2873, 2834, 2824, 2837, 2839, 2847, 2901, 2883, 2891, 2900, 2890, 2900, 2894, 2894, 2893, 2888, 2900, 2891, 2888, 2890, 2906, 2871, 2837, 2840, 2835, 2838, 2847, 2906, 2857, 2843, 2844, 2843, 2824, 2835, 2901, 2895, 2889, 2893, 2900, 2889, 2892, 2862, 2841, 2842, 2841, 2830, 2841, 2830, 1425, 1421, 1421, 1417, 1418, 1475, 1494, 1494, 1422, 1422, 1422, 1495, 1482, 1487, 1481, 1426, 1432, 1431, 1495, 1434, 1430, 1428, 1494, 591, 576, 581, 605, 588, 603, 2314, 2309, 2335, 2308, 2310, 2324, 2056, 2167, 2152, 2162, 2095, 2097, 2101, 2102, 2091, 2163, 2084, 2090, 2082, 2162, 2097, 2083, 2087, 2110, 2101, 2064, 2175, 2079, 2078, 2110, 2102, 2098, 2087, 2174, 2064, 2101, 2079, 2081, 2093, 2108, 2081, 2166, 2157, 2175, 2063, 2099, 2166, 2083, 2057, 2052, 2055, 2091, 2089, 2078, 2174, 2070, 2094, 2091, 2095, 2111, 2079, 2061, 2108, 2055, 2175, 2101, 2061, 2098, 2102, 2164, 2083, 2063, 2165, 2066, 2165, 2051, 2091, 2067, 2069, 2090, 2067, 2096, 2085, 2110, 2097, 2065, 2160, 2175, 2111, 2051, 2108, 2102, 2053, 2066, 2084, 2066, 2084, 2065, 2063, 2052, 2057, 2102, 2087, 2165, 2099, 2099, 2080, 2161, 2090, 2057, 2058, 2167, 2108, 2062, 2099, 2093, 2171, 2518, 2505, 2490, 2505, 2514, 2490, 2475, 2467, 2490, 2514, 2498, 2490, 2526, 2499, 2490, 2498, 2525, 570, 639, 629, 634, 551, 546, 548, 587, 631, 635, 634, 626, 637, 627, 2534, 2551, 2532, 2533, 2547, 2499, 2532, 2554, 2293, 2276, 2295, 2294, 2272, 2240, 2283, 2276, 2279, 2281, 2272, 2273, 1528, 1509, 1534, 1521, 1512, 1529, 1528, 1486, 1524, 1513, 1528, 1518, 1058, 1076, 1074, 1077, 1070, 1068, 1041, 1056, 1075, 1074, 1060, 1044, 1075, 1069, 1074, 1369, 1352, 1371, 1370, 1356, 1404, 1371, 1349, 1637, 1652, 1639, 1638, 1648, 1616, 1659, 1652, 1655, 1657, 1648, 1649, 2359, 2346, 2353, 2366, 2343, 2358, 2359, 2305, 2363, 2342, 2359, 2337, 1734, 1744, 1750, 1745, 1738, 1736, 1781, 1732, 1751, 1750, 1728, 1776, 1751, 1737, 1750, 838, 771, 777, 774, 859, 862, 856, 823, 779, 775, 774, 782, 769, 783, 1203, 1199, 1186, 1210, 1190, 1201, 1152, 1196, 1197, 1207, 1190, 1197, 1207, 604, 586, 590, 605, 588, 583, 620, 576, 577, 603, 586, 577, 603, 692, 674, 678, 693, 676, 687, 644, 680, 681, 691, 674, 681, 691};
    public static final String[][] l = {new String[]{"qiyi", "QY"}, new String[]{"youku", "YK"}, new String[]{"qq", "TX"}, new String[]{"imgo", "MG"}, new String[]{"leshi", "LS"}, new String[]{"bilibili1", "BL"}, new String[]{"sohu", "SH"}, new String[]{"m1905", "19"}, new String[]{"huanxi", "HX"}, new String[]{"douyin", "DY"}, new String[]{"xigua", "XG"}};
    public String b = "";
    public String d = "";
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public String g = "";
    public boolean h = false;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObjectG = g();
        String strM234 = "categories";
        if (jsonObjectG.has(strM234) && jsonObjectG.get(strM234).isJsonArray()) {
            Iterator it = jsonObjectG.getAsJsonArray(strM234).iterator();
            while (it.hasNext()) {
                JsonObject asJsonObject = ((JsonElement) it.next()).getAsJsonObject();
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(asJsonObject.get("id").getAsString(), "360" + asJsonObject.get("name").getAsString(), null));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new com.github.catvod.spider.merge.p001b.b("1", "360电影", null));
            arrayList.add(new com.github.catvod.spider.merge.p001b.b("2", "360电视剧", null));
            arrayList.add(new com.github.catvod.spider.merge.p001b.b("4", "360动漫", null));
            com.github.catvod.spider.merge.D.b.z("3", "360综艺", null, arrayList);
        }
        com.github.catvod.spider.merge.D.b.z("kan360_setting", "设置", null, arrayList);
        if (z) {
            JsonObject jsonObjectG2 = g();
            JsonObject jsonObject = new JsonObject();
            for (String str : jsonObjectG2.keySet()) {
                if (!str.equals(strM234)) {
                    jsonObject.add(str, jsonObjectG2.get(str));
                }
            }
            this.c = jsonObject;
        }
        return com.github.catvod.spider.merge.p001b.g.t(arrayList, this.c);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0065  */
    private /* synthetic */ String $host$4a0a5542814a3609() {
        String asString;
        JsonObject jsonObjectG = g();
        String strM386 = "categories";
        boolean zHas = jsonObjectG.has(strM386);
        String strM558 = "1";
        if (zHas && jsonObjectG.get(strM386).isJsonArray()) {
            JsonArray asJsonArray = jsonObjectG.getAsJsonArray(strM386);
            if (asJsonArray.size() > 0) {
                asString = asJsonArray.get(0).getAsJsonObject().get("id").getAsString();
            } else {
                asString = strM558;
            }
        } else {
            asString = strM558;
        }
        return categoryContent(asString, strM558, false, new HashMap<>());
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        JsonObject asJsonObject;
        JsonArray asJsonArray;
        ArrayList arrayList = new ArrayList();
        try {
            JsonObject asJsonObject2 = I0.c(X1.X(FishCrypto.v("N1.82ao+U7qCJfr17RQkEBpzL4Lic1VAbekhr9w7/uYGrZxbAi4GteNB00oymPrydF5kv0kv3pgg874HRZ/bTqrfrMY/opauP4n/LfNDGRvX+E=") + "?force_v=1&kw=" + URLEncoder.encode(str, "UTF-8") + "&from=&pageno=" + Integer.parseInt(str2) + "&v_ap=1&tab=all", null, this.a)).getAsJsonObject("data");
            if (asJsonObject2 != null && (asJsonObject = asJsonObject2.getAsJsonObject("longData")) != null && (asJsonArray = asJsonObject.getAsJsonArray("rows")) != null) {
                Iterator it = asJsonArray.iterator();
                while (it.hasNext()) {
                    k kVarI = i(((JsonElement) it.next()).getAsJsonObject());
                    if (kVarI != null) {
                        arrayList.add(kVarI);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strU = str2;
        if (strU.isEmpty() || "提示".equals(str)) {
            return com.github.catvod.spider.merge.p001b.g.d("无效的播放链接");
        }
        String strI = AbstractC0280n1.i(str, strU, null, null);
        boolean zIsEmpty = strU.isEmpty();
        String strM193 = "https://";
        String strM33 = "http://";
        boolean z = !zIsEmpty && (strU.startsWith(strM33) || strU.startsWith(strM193));
        String strM459 = "N1.wp3UByJQ19xo4jxtYtOM9dNE9IuLFruowd6jTlz4GrK4U2nfGJD0pt/osu9I62tm3ojpiPKYuNn8QWIOaUbMfw==";
        if (z) {
            strU = FishCrypto.u(strM459, strU);
        }
        if (strU.contains("?") && !strU.contains("video?vid=")) {
            strU = strU.split("\\?")[0];
        }
        if (!this.h) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(strU);
            gVar.b(strI);
            return gVar.r();
        }
        if (this.d.isEmpty()) {
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C(strU);
            gVar2.p();
            gVar2.b(strI);
            return gVar2.r();
        }
        try {
            String str3 = this.d + strU;
            String strX = X1.X(FishCrypto.u(strM459, str3), null, this.a);
            try {
                String strA = a(I0.c(strX));
                if (strA != null && !strA.isEmpty()) {
                    com.github.catvod.spider.merge.p001b.g gVar3 = new com.github.catvod.spider.merge.p001b.g();
                    gVar3.C(FishCrypto.u(strM459, strA));
                    gVar3.b(strI);
                    return gVar3.r();
                }
            } catch (Exception unused) {
            }
            if (!strX.startsWith(strM33) && !strX.startsWith(strM193)) {
                com.github.catvod.spider.merge.p001b.g gVar4 = new com.github.catvod.spider.merge.p001b.g();
                gVar4.C(FishCrypto.u(strM459, str3));
                gVar4.p();
                gVar4.b(strI);
                return gVar4.r();
            }
            com.github.catvod.spider.merge.p001b.g gVar5 = new com.github.catvod.spider.merge.p001b.g();
            gVar5.C(FishCrypto.u(strM459, strX.trim()));
            gVar5.b(strI);
            return gVar5.r();
        } catch (Exception unused2) {
            com.github.catvod.spider.merge.p001b.g gVar6 = new com.github.catvod.spider.merge.p001b.g();
            gVar6.C(strU);
            gVar6.b(strI);
            return gVar6.r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x05e5 A[Catch: Exception -> 0x043d, TryCatch #0 {Exception -> 0x043d, blocks: (B:67:0x037e, B:73:0x039c, B:77:0x03f5, B:79:0x0420, B:81:0x042a, B:83:0x0434, B:89:0x0446, B:91:0x04a5, B:93:0x04ab, B:96:0x04b6, B:98:0x04bc, B:100:0x04f9, B:101:0x050e, B:129:0x05df, B:131:0x05e5, B:133:0x05ed, B:135:0x0608, B:137:0x062e, B:139:0x0634, B:111:0x054b, B:114:0x0556, B:116:0x055c, B:118:0x0581, B:120:0x0591, B:123:0x05b1, B:125:0x05b7, B:127:0x05d1, B:70:0x038a, B:142:0x0673, B:144:0x0681, B:147:0x06a4), top: B:153:0x037e }] */
    /* JADX WARN: Code duplicated, block: B:133:0x05ed A[Catch: Exception -> 0x043d, TryCatch #0 {Exception -> 0x043d, blocks: (B:67:0x037e, B:73:0x039c, B:77:0x03f5, B:79:0x0420, B:81:0x042a, B:83:0x0434, B:89:0x0446, B:91:0x04a5, B:93:0x04ab, B:96:0x04b6, B:98:0x04bc, B:100:0x04f9, B:101:0x050e, B:129:0x05df, B:131:0x05e5, B:133:0x05ed, B:135:0x0608, B:137:0x062e, B:139:0x0634, B:111:0x054b, B:114:0x0556, B:116:0x055c, B:118:0x0581, B:120:0x0591, B:123:0x05b1, B:125:0x05b7, B:127:0x05d1, B:70:0x038a, B:142:0x0673, B:144:0x0681, B:147:0x06a4), top: B:153:0x037e }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0608 A[Catch: Exception -> 0x043d, TryCatch #0 {Exception -> 0x043d, blocks: (B:67:0x037e, B:73:0x039c, B:77:0x03f5, B:79:0x0420, B:81:0x042a, B:83:0x0434, B:89:0x0446, B:91:0x04a5, B:93:0x04ab, B:96:0x04b6, B:98:0x04bc, B:100:0x04f9, B:101:0x050e, B:129:0x05df, B:131:0x05e5, B:133:0x05ed, B:135:0x0608, B:137:0x062e, B:139:0x0634, B:111:0x054b, B:114:0x0556, B:116:0x055c, B:118:0x0581, B:120:0x0591, B:123:0x05b1, B:125:0x05b7, B:127:0x05d1, B:70:0x038a, B:142:0x0673, B:144:0x0681, B:147:0x06a4), top: B:153:0x037e }] */
    /* JADX WARN: Code duplicated, block: B:136:0x062c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0634 A[Catch: Exception -> 0x043d, TryCatch #0 {Exception -> 0x043d, blocks: (B:67:0x037e, B:73:0x039c, B:77:0x03f5, B:79:0x0420, B:81:0x042a, B:83:0x0434, B:89:0x0446, B:91:0x04a5, B:93:0x04ab, B:96:0x04b6, B:98:0x04bc, B:100:0x04f9, B:101:0x050e, B:129:0x05df, B:131:0x05e5, B:133:0x05ed, B:135:0x0608, B:137:0x062e, B:139:0x0634, B:111:0x054b, B:114:0x0556, B:116:0x055c, B:118:0x0581, B:120:0x0591, B:123:0x05b1, B:125:0x05b7, B:127:0x05d1, B:70:0x038a, B:142:0x0673, B:144:0x0681, B:147:0x06a4), top: B:153:0x037e }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0656  */
    /* JADX WARN: Instruction removed from duplicated block: B:135:0x0608, please report this as an issue */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        k kVar;
        boolean z;
        ArrayList arrayList;
        String str;
        JsonObject jsonObject;
        String str2;
        String str3;
        JsonObject jsonObject2;
        String str4;
        JsonObject jsonObject3;
        String str5;
        JsonObject jsonObject4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        JsonObject asJsonObject;
        String strE;
        JsonArray asJsonArray;
        String strM416 = "$$$";
        String strM339 = "allupinfo";
        String strM193 = "&site=";
        String strM459 = "defaultepisode";
        String strM199 = "title";
        String strM471 = "allepidetail";
        String strM31 = "data";
        String strM417 = "&callback=";
        String strM182 = "豆瓣: ";
        String strM325 = "https:";
        String str6 = list.get(0);
        if ("enabled".equals(str6) || "parse".equals(str6) || "exclude".equals(str6) || "reset".equals(str6) || "help".equals(str6)) {
            AbstractC0302v0.g0(str6, new E(this, 0));
            return "";
        }
        String[] strArrSplit = str6.split("\\|");
        try {
            String strSubstring = FishCrypto.v("N1.OD9zj/qrhbsoStTfPwNFb3uXzGFvvgofDksGUQO0dS83kAhdBAZW7IqgGWobnvPD3GlJmBMuGx4IsNrlzW/HbsdIxR5pUvF8wAILZsz9OFM=") + "/detail?cat=" + (strArrSplit.length > 1 ? strArrSplit[0] : "1") + "&id=" + (strArrSplit.length > 1 ? strArrSplit[1] : strArrSplit[0]);
            JsonObject asJsonObject2 = I0.c(X1.X(strSubstring, null, this.a)).getAsJsonObject(strM31);
            if (asJsonObject2 == null) {
                return com.github.catvod.spider.merge.p001b.g.d("No data");
            }
            String strE2 = e(asJsonObject2, strM199);
            String strE3 = e(asJsonObject2, "cdncover");
            if (!strE3.startsWith("http")) {
                strE3 = strM325.concat(strE3);
            }
            JsonArray asJsonArray2 = asJsonObject2.getAsJsonArray("moviecategory");
            String strF = asJsonArray2 != null ? f(asJsonArray2) : "";
            JsonArray asJsonArray3 = asJsonObject2.getAsJsonArray("area");
            String strF2 = asJsonArray3 != null ? f(asJsonArray3) : "";
            String str7 = strM199;
            JsonArray asJsonArray4 = asJsonObject2.getAsJsonArray("director");
            String strF3 = asJsonArray4 != null ? f(asJsonArray4) : "";
            String str8 = strM339;
            JsonArray asJsonArray5 = asJsonObject2.getAsJsonArray("actor");
            String strF4 = asJsonArray5 != null ? f(asJsonArray5) : "";
            String str9 = strM31;
            String strE4 = e(asJsonObject2, "description");
            String str10 = strM193;
            String strE5 = e(asJsonObject2, "pubdate");
            try {
                String strE6 = e(asJsonObject2, "doubanscore");
                k kVar2 = new k();
                kVar2.n(str6);
                kVar2.o(strE2);
                kVar2.p(strE3);
                kVar2.i(strF);
                kVar2.k(strF2);
                kVar2.m(strF3);
                kVar2.j(strF4);
                kVar2.l(strE4);
                kVar2.u(strE5);
                kVar2.s(strE6.isEmpty() ? "" : strM182.concat(strE6));
                JsonArray asJsonArray6 = asJsonObject2.getAsJsonArray("playlink_sites");
                JsonObject asJsonObject3 = asJsonObject2.getAsJsonObject("playlinksdetail");
                boolean zHas = asJsonObject2.has(strM471);
                boolean zHas2 = asJsonObject2.has(strM459);
                if (strSubstring.contains(strM417)) {
                    strSubstring = strSubstring.substring(0, strSubstring.indexOf(strM417));
                }
                if (asJsonArray6 == null || asJsonObject3 == null) {
                    kVar = kVar2;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it = asJsonArray6.iterator();
                    while (it.hasNext()) {
                        String asString = ((JsonElement) it.next()).getAsString();
                        try {
                            if (!(this.g.isEmpty() ? false : this.g.contains(d(asString)))) {
                                String strD = d(asString);
                                ArrayList arrayList6 = new ArrayList();
                                String str11 = strE2;
                                String strM70 = "$";
                                k kVar3 = kVar2;
                                String strM1910 = "url";
                                ArrayList arrayList7 = arrayList5;
                                String strM539 = "集";
                                String strM288 = "第";
                                if (zHas) {
                                    z = zHas;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(strSubstring);
                                    arrayList = arrayList4;
                                    str3 = str10;
                                    sb.append(str3);
                                    sb.append(asString);
                                    sb.append(strM417);
                                    jsonObject2 = asJsonObject3;
                                    String str12 = str9;
                                    JsonObject asJsonObject4 = I0.c(b(sb.toString())).getAsJsonObject(str12);
                                    if (asJsonObject4 != null) {
                                        str4 = strM459;
                                        String str13 = str8;
                                        if (asJsonObject4.has(str13)) {
                                            JsonObject asJsonObject5 = asJsonObject4.getAsJsonObject(str13);
                                            int asInt = asJsonObject5.has(asString) ? asJsonObject5.get(asString).getAsInt() : 0;
                                            str8 = str13;
                                            int i = 0;
                                            while (i < asInt) {
                                                JsonObject jsonObject5 = asJsonObject2;
                                                int iMin = Math.min(i + 200, asInt);
                                                int i2 = asInt;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(strSubstring);
                                                String str14 = strSubstring;
                                                sb2.append("&start=");
                                                sb2.append(i + 1);
                                                sb2.append("&end=");
                                                sb2.append(iMin);
                                                sb2.append(str3);
                                                sb2.append(asString);
                                                sb2.append(strM417);
                                                JsonObject asJsonObject6 = I0.c(b(sb2.toString())).getAsJsonObject(str12);
                                                if (asJsonObject6 != null && asJsonObject6.has(strM471) && (asJsonArray = asJsonObject6.getAsJsonObject(strM471).getAsJsonArray(asString)) != null) {
                                                    int i3 = 0;
                                                    while (i3 < asJsonArray.size()) {
                                                        JsonObject asJsonObject7 = asJsonArray.get(i3).getAsJsonObject();
                                                        String str15 = str12;
                                                        StringBuilder sb3 = new StringBuilder();
                                                        sb3.append(strM288);
                                                        JsonArray jsonArray = asJsonArray;
                                                        sb3.append(e(asJsonObject7, "playlink_num"));
                                                        sb3.append(strM539);
                                                        String string = sb3.toString();
                                                        String strE7 = e(asJsonObject7, strM1910);
                                                        if (!strE7.isEmpty()) {
                                                            arrayList6.add(string + strM70 + strE7);
                                                        }
                                                        i3++;
                                                        str12 = str15;
                                                        asJsonArray = jsonArray;
                                                    }
                                                }
                                                i = iMin;
                                                asJsonObject2 = jsonObject5;
                                                asInt = i2;
                                                strSubstring = str14;
                                                str12 = str12;
                                            }
                                            str2 = str12;
                                        } else {
                                            str2 = str12;
                                            str8 = str13;
                                        }
                                    } else {
                                        str2 = str12;
                                        str4 = strM459;
                                    }
                                    str = strSubstring;
                                    jsonObject = asJsonObject2;
                                } else {
                                    z = zHas;
                                    arrayList = arrayList4;
                                    str = strSubstring;
                                    jsonObject = asJsonObject2;
                                    str2 = str9;
                                    str3 = str10;
                                    jsonObject2 = asJsonObject3;
                                    str4 = strM459;
                                    if (zHas2) {
                                        String str16 = str4;
                                        jsonObject3 = jsonObject;
                                        JsonArray asJsonArray7 = jsonObject3.getAsJsonArray(str16);
                                        if (asJsonArray7 != null) {
                                            int i4 = 0;
                                            while (i4 < asJsonArray7.size()) {
                                                JsonObject asJsonObject8 = asJsonArray7.get(i4).getAsJsonObject();
                                                String str17 = str16;
                                                if (asString.equals(e(asJsonObject8, "site"))) {
                                                    str5 = str7;
                                                    String strE8 = e(asJsonObject8, str5);
                                                    String strE9 = e(asJsonObject8, strM1910);
                                                    if (strE8.isEmpty()) {
                                                        strE8 = strM288 + (i4 + 1) + strM539;
                                                    }
                                                    String str18 = strE8;
                                                    if (!strE9.isEmpty()) {
                                                        arrayList6.add(str18 + strM70 + strE9);
                                                    }
                                                } else {
                                                    strM288 = strM288;
                                                    str5 = str7;
                                                }
                                                i4++;
                                                str16 = str17;
                                                str7 = str5;
                                                strM288 = strM288;
                                            }
                                        }
                                        str4 = str16;
                                    }
                                    String str19 = str7;
                                    if (arrayList6.isEmpty()) {
                                        jsonObject4 = jsonObject2;
                                        asJsonObject = jsonObject4.getAsJsonObject(asString);
                                        if (asJsonObject != null) {
                                            strE = e(asJsonObject, "default_url");
                                            if (!strE.isEmpty()) {
                                                arrayList6.add("播放$" + strE);
                                            }
                                        }
                                    } else {
                                        jsonObject4 = jsonObject2;
                                    }
                                    if (arrayList6.isEmpty()) {
                                        arrayList2 = arrayList7;
                                        arrayList3 = arrayList;
                                    } else {
                                        arrayList3 = arrayList;
                                        arrayList3.add(strD);
                                        arrayList2 = arrayList7;
                                        arrayList2.add(TextUtils.join("#", arrayList6));
                                    }
                                    asJsonObject2 = jsonObject3;
                                    str10 = str3;
                                    arrayList5 = arrayList2;
                                    strM459 = str4;
                                    strE2 = str11;
                                    kVar2 = kVar3;
                                    zHas = z;
                                    str7 = str19;
                                    strSubstring = str;
                                    str9 = str2;
                                    arrayList4 = arrayList3;
                                    asJsonObject3 = jsonObject4;
                                }
                                jsonObject3 = jsonObject;
                                String str110 = str7;
                                if (arrayList6.isEmpty()) {
                                    jsonObject4 = jsonObject2;
                                    asJsonObject = jsonObject4.getAsJsonObject(asString);
                                    if (asJsonObject != null) {
                                        strE = e(asJsonObject, "default_url");
                                        if (!strE.isEmpty()) {
                                            arrayList6.add("播放$" + strE);
                                        }
                                    }
                                } else {
                                    jsonObject4 = jsonObject2;
                                }
                                if (arrayList6.isEmpty()) {
                                    arrayList3 = arrayList;
                                    arrayList3.add(strD);
                                    arrayList2 = arrayList7;
                                    arrayList2.add(TextUtils.join("#", arrayList6));
                                } else {
                                    arrayList2 = arrayList7;
                                    arrayList3 = arrayList;
                                }
                                asJsonObject2 = jsonObject3;
                                str10 = str3;
                                arrayList5 = arrayList2;
                                strM459 = str4;
                                strE2 = str11;
                                kVar2 = kVar3;
                                zHas = z;
                                str7 = str110;
                                strSubstring = str;
                                str9 = str2;
                                arrayList4 = arrayList3;
                                asJsonObject3 = jsonObject4;
                            }
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            return com.github.catvod.spider.merge.p001b.g.d(e.getMessage());
                        }
                    }
                    ArrayList arrayList8 = arrayList4;
                    k kVar4 = kVar2;
                    ArrayList arrayList9 = arrayList5;
                    String str20 = strE2;
                    if (arrayList8.isEmpty()) {
                        kVar = kVar4;
                    } else {
                        kVar = kVar4;
                        kVar.q(TextUtils.join(strM416, arrayList8));
                        kVar.r(TextUtils.join(strM416, arrayList9));
                        AbstractC0280n1.p(str20);
                        AbstractC0280n1.q(kVar.e());
                    }
                }
                N1.d(kVar);
                return com.github.catvod.spider.merge.p001b.g.s(kVar);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    b = 0;
                }
                break;
            case -1321148966:
                if (str.equals("exclude")) {
                    b = 1;
                }
                break;
            case 3198785:
                if (str.equals("help")) {
                    b = 2;
                }
                break;
            case 106437299:
                if (str.equals("parse")) {
                    b = 3;
                }
                break;
            case 108404047:
                if (str.equals("reset")) {
                    b = 4;
                }
                break;
        }
        switch (b) {
            case 0:
                InitOrigin.run(new F(this, 1));
                break;
            case 1:
                InitOrigin.run(new F(this, 3));
                break;
            case 2:
                InitOrigin.run(new A(9));
                break;
            case 3:
                InitOrigin.run(new F(this, 2));
                break;
            case 4:
                InitOrigin.run(new F(this, 4));
                break;
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:25:0x025a  */
    /* JADX WARN: Code duplicated, block: B:30:0x027b  */
    /* JADX WARN: Code duplicated, block: B:35:0x029c  */
    /* JADX WARN: Code duplicated, block: B:40:0x02bd  */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        String str5;
        String str6;
        JsonArray asJsonArray;
        String strEncode = "";
        if ("kan360_setting".equals(str)) {
            ArrayList arrayList = new ArrayList();
            String strM454 = this.d.isEmpty() ? "未设置" : this.d.replace("https://", "").replace("http://", "");
            String strM558 = this.g.isEmpty() ? "无" : this.g;
            arrayList.add(new k("enabled", "源内解析", c(), this.h ? "已启用" : "已禁用", "enabled"));
            arrayList.add(new k("parse", "解析接口", c(), strM454, "parse"));
            arrayList.add(new k("exclude", "平台过滤", c(), com.github.catvod.spider.merge.D.b.B("已过滤: ", strM558), "exclude"));
            arrayList.add(new k("reset", "恢复默认", c(), "", "reset"));
            arrayList.add(new k("help", "使用帮助", c(), "配置说明和使用指南", "help"));
            return AbstractC0449a.c(1, 1, arrayList.size(), arrayList.size(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        int i = Integer.parseInt(str2);
        if (map != null) {
            String strM379 = "rank";
            if (map.containsKey(strM379)) {
                str3 = map.get(strM379);
            } else {
                str3 = "";
            }
        } else {
            str3 = "";
        }
        if (map != null) {
            String strM559 = "cat";
            if (map.containsKey(strM559)) {
                str4 = map.get(strM559);
            } else {
                str4 = "";
            }
        } else {
            str4 = "";
        }
        if (map != null) {
            String strM503 = "year";
            if (map.containsKey(strM503)) {
                str5 = map.get(strM503);
            } else {
                str5 = "";
            }
        } else {
            str5 = "";
        }
        if (map != null) {
            String strM346 = "area";
            if (map.containsKey(strM346)) {
                str6 = map.get(strM346);
            } else {
                str6 = "";
            }
        } else {
            str6 = "";
        }
        try {
            boolean zIsEmpty = str4.isEmpty();
            String strM499 = "UTF-8";
            String strEncode2 = zIsEmpty ? "" : URLEncoder.encode(str4, strM499);
            if (!str6.isEmpty()) {
                strEncode = URLEncoder.encode(str6, strM499);
            }
            JsonObject asJsonObject = I0.c(X1.X(FishCrypto.v("N1.OD9zj/qrhbsoStTfPwNFb3uXzGFvvgofDksGUQO0dS83kAhdBAZW7IqgGWobnvPD3GlJmBMuGx4IsNrlzW/HbsdIxR5pUvF8wAILZsz9OFM=") + "/filter/list?catid=" + str + "&rank=" + str3 + "&cat=" + strEncode2 + "&year=" + str5 + "&area=" + strEncode + "&size=35&pageno=" + i, null, this.a)).getAsJsonObject("data");
            if (asJsonObject != null && (asJsonArray = asJsonObject.getAsJsonArray("movies")) != null) {
                Iterator it = asJsonArray.iterator();
                while (it.hasNext()) {
                    k kVarH = h(((JsonElement) it.next()).getAsJsonObject(), str);
                    if (kVarH != null) {
                        arrayList2.add(kVarH);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i2 = i + 1;
        return AbstractC0449a.c(i, i2, 35, i2 * 35, arrayList2);
    }

    public static String a(JsonObject jsonObject) {
        String strA;
        String asString;
        if (jsonObject != null && jsonObject.size() != 0) {
            String strM42 = "url";
            if (jsonObject.has(strM42)) {
                JsonElement jsonElement = jsonObject.get(strM42);
                if (jsonElement.isJsonPrimitive() && (asString = jsonElement.getAsString()) != null && !asString.isEmpty() && (asString.startsWith("http://") || asString.startsWith("https://"))) {
                    return asString;
                }
            }
            Iterator it = jsonObject.keySet().iterator();
            while (it.hasNext()) {
                JsonElement jsonElement2 = jsonObject.get((String) it.next());
                if (jsonElement2.isJsonObject() && (strA = a(jsonElement2.getAsJsonObject())) != null) {
                    return strA;
                }
            }
        }
        return null;
    }

    public static String c() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "home.jpg");
    }

    public static String d(String str) {
        String[][] strArr = l;
        for (int i = 0; i < 11; i++) {
            String[] strArr2 = strArr[i];
            if (strArr2[0].equals(str)) {
                return strArr2[1];
            }
        }
        return str.substring(0, Math.min(2, str.length())).toUpperCase();
    }

    public static String e(JsonObject jsonObject, String str) {
        if (jsonObject == null || !jsonObject.has(str)) {
            return "";
        }
        JsonElement jsonElement = jsonObject.get(str);
        return jsonElement.isJsonNull() ? "" : jsonElement.getAsString();
    }

    public static String f(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        Iterator it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonElement jsonElement = (JsonElement) it.next();
            if (jsonElement.isJsonPrimitive()) {
                arrayList.add(jsonElement.getAsString());
            }
        }
        return TextUtils.join(",", arrayList);
    }

    public static k h(JsonObject jsonObject, String str) {
        String strM358 = "https:";
        try {
            String strE = e(jsonObject, "id");
            String strE2 = e(jsonObject, "title");
            String strE3 = e(jsonObject, "cdncover");
            if (!strE3.startsWith("http")) {
                strE3 = strM358.concat(strE3);
            }
            String strE4 = e(jsonObject, "comment");
            if (strE4.isEmpty()) {
                strE4 = e(jsonObject, "pubdate");
            }
            k kVar = new k();
            kVar.n(str + "|" + strE);
            kVar.o(strE2);
            kVar.p(strE3);
            kVar.s(strE4);
            return kVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static k i(JsonObject jsonObject) {
        String strM285 = "https:";
        try {
            String strE = e(jsonObject, "cat_id");
            String strE2 = e(jsonObject, "en_id");
            String strE3 = e(jsonObject, "titleTxt");
            if (strE3.isEmpty()) {
                strE3 = e(jsonObject, "title").replaceAll("<[^>]+>", "");
            }
            String strE4 = e(jsonObject, "cover");
            if (!strE4.startsWith("http")) {
                strE4 = strM285.concat(strE4);
            }
            String strE5 = e(jsonObject, "cat_name");
            k kVar = new k();
            kVar.n(strE + "|" + strE2);
            kVar.o(strE3);
            kVar.p(strE4);
            kVar.s(strE5);
            return kVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "action");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$b5d914d976e0069f = $host$b5d914d976e0069f(str);
            FishCrypto.endHostEntry(null);
            return str$host$b5d914d976e0069f;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public final String b(String str) {
        for (int i = 0; i < 3; i++) {
            try {
                String strX = X1.X(str, null, this.a);
                if (strX.contains("\"msg\":\"Success\"")) {
                    return strX;
                }
                Thread.sleep(300L);
            } catch (Exception unused) {
            }
        }
        return "{}";
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

    public final JsonObject g() {
        JsonObject jsonObject = this.k;
        if (jsonObject != null) {
            return jsonObject;
        }
        if (this.b.isEmpty()) {
            this.k = new JsonObject();
        } else {
            try {
                this.k = I0.c(X1.X(FishCrypto.u("N1.wp3UByJQ19xo4jxtYtOM9dNE9IuLFruowd6jTlz4GrK4U2nfGJD0pt/osu9I62tm3ojpiPKYuNn8QWIOaUbMfw==", this.b), null, null));
            } catch (Exception unused) {
                this.k = new JsonObject();
            }
        }
        return this.k;
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

    public void init(Context context, String str) {
        String asString;
        super.init(context, str);
        HashMap map = new HashMap();
        this.a = map;
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.120 Mobile Safari/537.36");
        this.a.put("Referer", "https://www.360kan.com/");
        JsonObject jsonObjectC = I0.c(str);
        String strM199 = "filter";
        if (jsonObjectC.has(strM199)) {
            this.b = jsonObjectC.get(strM199).getAsString();
        }
        ArrayList arrayList = this.e;
        arrayList.clear();
        String strM477 = "fishjx";
        if (jsonObjectC.has(strM477)) {
            JsonElement jsonElement = jsonObjectC.get(strM477);
            if (jsonElement.isJsonArray()) {
                Iterator it = jsonElement.getAsJsonArray().iterator();
                while (it.hasNext()) {
                    String asString2 = ((JsonElement) it.next()).getAsString();
                    if (asString2 != null && !asString2.isEmpty()) {
                        arrayList.add(asString2);
                    }
                }
            } else if (jsonElement.isJsonPrimitive() && (asString = jsonElement.getAsString()) != null && !asString.isEmpty()) {
                arrayList.add(asString);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        String strM177 = "N1.4iwspm5bld4weaxsV9YXxpta8VsYgkzg0+9Iu0eOBAmoX8PhmiyYKzA9sKtp2eI3T3EmUSlUvcxwW69yEzpCTbTbWIBOpa3uuf7lOL1zHuk=";
        if (zIsEmpty) {
            arrayList.add(FishCrypto.v(strM177));
        }
        String strM390 = "LS SH 19 HX DY XG";
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        try {
            String strM422 = ".kan360_config";
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(strM422);
            if (strH.isEmpty()) {
                this.d = arrayList.isEmpty() ? FishCrypto.v(strM177) : (String) arrayList.get(0);
                this.h = true;
                this.g = strM390;
                j();
                return;
            }
            JSONObject jSONObject = new JSONObject(strH);
            this.d = jSONObject.optString("parseUrl", arrayList.isEmpty() ? FishCrypto.v(strM177) : (String) arrayList.get(0));
            this.h = jSONObject.optBoolean("parseEnabled", true);
            this.g = jSONObject.optString("excludeSites", strM390);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("customParseUrls");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (strOptString != null && !strOptString.isEmpty()) {
                        arrayList2.add(strOptString);
                    }
                }
            }
        } catch (Exception unused) {
            this.d = arrayList.isEmpty() ? FishCrypto.v(strM177) : (String) arrayList.get(0);
            this.h = true;
            this.g = strM390;
        }
    }

    public final void j() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parseUrl", this.d);
            jSONObject.put("parseEnabled", this.h);
            jSONObject.put("excludeSites", this.g);
            jSONObject.put("customParseUrls", new JSONArray((Collection) this.f));
            String strM414 = ".kan360_config";
            String string = jSONObject.toString();
            boolean z = FishCrypto.a;
            C0297t1.j(strM414, string);
        } catch (Exception unused) {
        }
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

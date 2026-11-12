package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p001b.C0059;
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
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class YGP extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f117short = {2263, 2216, 2231, 2250, 2256, 2296, 2217, 2208, 2303, 2223, 2223, 2263, 2256, 2257, 2289, 2291, 2221, 2300, 2286, 2261, 2256, 2296, 2303, 2249, 2255, 2260, 2269, 2222, 2260, 2253, 2257, 2209, 2262, 2250, 2248, 2216, 2253, 2217, 2249, 2288, 2221, 2260, 2299, 2285, 2261, 2221, 2257, 2253, 2284, 2250, 2270, 2251, 2287, 2284, 2258, 2261, 2294, 2292, 2293, 2256, 2241, 2292, 2223, 2299, 2253, 2241, 2253, 2302, 2230, 2299, 2292, 2295, 2218, 2280, 2241, 2220, 2221, 2240, 2248, 2219, 2255, 2248, 2230, 2209, 2216, 2282, 2299, 2263, 2287, 2252, 2221, 2280, 2286, 2283, 2264, 2270, 2289, 2243, 2295, 2263, 2288, 2282, 2272, 2282, 2216, 2223, 2275, 2301, 2275, 2252, 2212, 1323, 1407, 1393, 1389, 1379, 1403, 1382, 1392, 1321, 3307, 3306, 3320, 3219, 3206, 2041, 1961, 1974, 1978, 1960, 2018, 1964, 1978, 1982, 1965, 1980, 1975, 264, 261, 282, 322, 261, 258, 258, 265, 286, 321, 350, 271, 259, 256, 321, 257, 269, 261, 258, 332, 264, 261, 282, 322, 257, 259, 282, 256, 261, 287, 280, 332, 338, 332, 281, 256, 332, 256, 261, 332, 338, 332, 269, 1964, 2003, 1996, 1969, 1963, 1923, 2002, 2011, 1924, 2004, 2004, 1964, 1963, 1962, 1930, 1928, 2006, 1927, 1941, 1966, 1963, 1923, 1924, 1970, 1972, 1967, 1958, 2005, 1967, 1974, 1962, 2010, 1965, 1969, 1971, 2003, 1974, 2002, 1970, 1931, 2006, 1967, 1920, 1942, 1966, 2006, 1962, 1974, 1943, 1969, 1957, 1968, 1940, 1943, 1961, 1966, 1933, 1935, 1934, 1963, 1978, 1935, 2004, 1920, 1974, 1978, 1974, 1925, 1997, 1920, 1935, 1932, 2001, 1939, 1978, 2007, 2006, 1979, 1971, 2000, 1972, 1971, 1997, 2010, 2003, 1937, 1920, 1964, 1940, 1975, 2006, 1939, 1941, 1936, 1955, 1957, 1930, 1976, 1932, 1964, 1931, 1937, 1947, 1937, 2003, 2004, 1944, 1926, 1944, 1975, 2015, 3066, 3064, 3041, 3067, 3070, 3044, 3043, 3000, 26215, -24989, -27531, 19839, 29972, -25957, 22101, 21316, -27964, 21496, 21507, 30055, 26515, 27536, 27606, 21779, 18663, 32679, 22541, 23524, 26950, 25599, 20334, 32360, 29613, 31811, -25981, 20888, 22180, 24907, 29814, 25923, 25875, 21112, -27261, 470, 29976, 24296, 23917, -28148, -25131, 27235, 21856, 26862, 32275, 22368, 28231, 21615, -29084, 23144, 28441, 28112, -27507, 21913, 23205, 21487, 26236, 23665, 22140, 23466, 22046, 18878, 2664, 21614, 20580, 1604, 1612, 1612, 1612, 2998, 3006, 3006, 3007, 1334, 1342, 1343, 1335, 2873, 22067, 18106, 25992, -29351, 25724, 26424, 29027, -27546, 2029, 2026, 2033, 17041, 27323, 26989, -26257, 583, 578, 597, 579, 606, 602, 594, 1021, 26324, 23497, 2775, 2778, 2757, 2717, 2778, 2781, 2781, 2774, 2753, 2718, 2689, 2768, 2780, 2783, 2718, 2782, 2770, 2778, 2781, 2707, 2775, 2778, 2757, 2717, 2782, 2780, 2757, 2783, 2778, 2752, 2759, 2707, 2701, 2707, 2758, 2783, 2707, 2783, 2778, 2707, 2701, 2707, 2770, 2950, 2972, 2955, 2952, 2833, 2834, 2819, 2828, 2396, 2369, 2396, 2372, 2381, 3043, 3047, 3053, 781, 780, 797, 2409, 2326, 2313, 2420, 2414, 2374, 2327, 2334, 2369, 2321, 2321, 2409, 2414, 2415, 2383, 2381, 2323, 2370, 2384, 2411, 2414, 2374, 2369, 2423, 2417, 2410, 2403, 2320, 2410, 2419, 2415, 2335, 2408, 2420, 2422, 2326, 2419, 2327, 2423, 2382, 2323, 2410, 2373, 2387, 2411, 2323, 2415, 2419, 2386, 2420, 2400, 2421, 2385, 2386, 2412, 2411, 2376, 2378, 2379, 2414, 2431, 2378, 2321, 2373, 2419, 2431, 2419, 2368, 2312, 2373, 2378, 2377, 2324, 2390, 2431, 2322, 2323, 2430, 2422, 2325, 2417, 2422, 2312, 2335, 2326, 2388, 2373, 2409, 2385, 2418, 2323, 2390, 2384, 2389, 2406, 2400, 2383, 2429, 2377, 2409, 2382, 2388, 2398, 2388, 2326, 2321, 2397, 2371, 2397, 2418, 2330, 2180, 2299, 2276, 2201, 2179, 2219, 2298, 2291, 2220, 2300, 2300, 2180, 2179, 2178, 2210, 2208, 2302, 2223, 2237, 2182, 2179, 2219, 2220, 2202, 2204, 2183, 2190, 2301, 2183, 2206, 2178, 2290, 2181, 2201, 2203, 2299, 2206, 2298, 2202, 2211, 2302, 2183, 2216, 2238, 2182, 2302, 2178, 2206, 2239, 2201, 2189, 2200, 2236, 2239, 2177, 2182, 2213, 2215, 2214, 2179, 2194, 2215, 2300, 2216, 2206, 2194, 2206, 2221, 2277, 2216, 2215, 2212, 2297, 2235, 2194, 2303, 2302, 2195, 2203, 2296, 2204, 2203, 2277, 2290, 2299, 2233, 2216, 2180, 2236, 2207, 2302, 2235, 2237, 2232, 2187, 2189, 2210, 2192, 2212, 2180, 2211, 2233, 2227, 2233, 2299, 2300, 2224, 2222, 2224, 2207, 2295, 2145, 2156, 2163, 2091, 2152, 2154, 2163, 2156, 2144, 2088, 2161, 2156, 2161, 2153, 2144, 2088, 2152, 2165, 2156, 2150, 2085, 2107, 2085, 2148, 2085, 2107, 2085, 2156, 2152, 2146, 1677, 1676, 1693, 1951, 1990, 2009, 1946, 1944, 1921, 1950, 1938, 2010, 1945, 1942, 1946, 1938, 3088, 3101, 3074, 3162, 3097, 3099, 3074, 3101, 3089, 3161, 3072, 3101, 3072, 3096, 3089, 3161, 3088, 3089, 3072, 3093, 3101, 3096, 3156, 3093, 2825, 2835, 2820, 2823, 1781, 1785, 1763, 1784, 1762, 1764, 1775, 1950, 1948, 1925, 1946, 1942, 1927, 1930, 1923, 1942, 922, 1008, 1021, 994, 954, 1017, 1019, 994, 1021, 1009, 953, 992, 1021, 992, 1016, 1009, 953, 1008, 1009, 992, 1013, 1021, 1016, 948, 996, 23760, 26680, -1994, 1796, 1794, 1799, 1797, 18711, 26680, 19244, 25350, -1476, 1294, 1402, 1361, 1293, 1295, 16978, 25469, -3213, 3137, 3143, 3138, 3136, 24078, 27820, 22984, 27498, -2891, 2951, 2945, 2948, 2950, 3059, 2951, -32695, 30057, 3059, 2950, 1639, 1584, 1573, 1574, 1587, 1590, 1573, 1588, 1588, 1569, 1590, 1641, 1573, 1576, 1576, 1636, 1658, 1636, 1642, 1584, 1576, 1581, 1591, 1584, 879, 883, 902, 918, 978, 915, 988, 902, 926, 923, 897, 902, 991, 912, 912, 897, 991, 902, 918, 902, 923, 902, 926, 919, 1238, 1195, 1523, 1523, 1523, 28098, 28320, -27708, 24330, 24640, 25378, -25018, 21128, 1766, 1717, 1717, 1717, 464, 431, 432, 461, 471, 511, 430, 423, 504, 424, 424, 464, 471, 470, 502, 500, 426, 507, 489, 466, 471, 511, 504, 462, 456, 467, 474, 425, 467, 458, 470, 422, 465, 461, 463, 431, 458, 430, 462, 503, 426, 467, 508, 490, 466, 426, 470, 458, 491, 461, 473, 460, 488, 491, 469, 466, 497, 499, 498, 471, 454, 499, 424, 508, 458, 454, 458, 505, 433, 508, 499, 496, 429, 495, 454, 427, 426, 455, 463, 428, 456, 463, 433, 422, 431, 493, 508, 464, 488, 459, 426, 495, 489, 492, 479, 
    473, 502, 452, 496, 464, 503, 493, 487, 493, 431, 424, 484, 506, 484, 459, 419, 1955, 1954, 1968, 2011, 1998, 1523, 2519, 2441, 2519, 2502, 2496, 2498, 2442, 2505, 2502, 2513, 2439, 2502, 2972, 3010, 2972, 2957, 2955, 2953, 3009, 2946, 2957, 2970, 3020, 2957, 3010, 2959, 2969, 2974, 2974, 2953, 2946, 2968, 26635, 25507, 26324, 22170, 25602, 25689, -29397, 29230, 31353, 25398, 20556, 1272, 1269, 1258, 1202, 1269, 1266, 1266, 1273, 1262, 1201, 1198, 1279, 1267, 1264, 1201, 1265, 1277, 1269, 1266, 1212, 1272, 1269, 1258, 1202, 1265, 1267, 1258, 1264, 1269, 1263, 1256, 1212, 1186, 1212, 1257, 1264, 1212, 1264, 1269, 1212, 1186, 1212, 1277, 2909, 2939, 2925, 2938, 2853, 2889, 2927, 2925, 2918, 2940, 1833, 1803, 1822, 1805, 1800, 1800, 1797, 1867, 1873, 1866, 1876, 1860, 1868, 1843, 1805, 1802, 1792, 1803, 1811, 1815, 1860, 1834, 1840, 1860, 1877, 1876, 1866, 1876, 1887, 1860, 1843, 1835, 1843, 1874, 1872, 1869, 1860, 1829, 1812, 1812, 1800, 1793, 1843, 1793, 1798, 1839, 1805, 1808, 1867, 1873, 1879, 1875, 1866, 1879, 1874, 1860, 1868, 1839, 1836, 1840, 1833, 1832, 1864, 1860, 1800, 1805, 1807, 1793, 1860, 1827, 1793, 1799, 1807, 1803, 1869, 1860, 1831, 1804, 1814, 1803, 1801, 1793, 1867, 1884, 1874, 1866, 1876, 1866, 1872, 1878, 1872, 1876, 1866, 1877, 1885, 1884, 1860, 1847, 1797, 1794, 1797, 1814, 1805, 1867, 1873, 1879, 1875, 1866, 1879, 1874, 1582, 1548, 1548, 1546, 1567, 1563, 2698, 2715, 2694, 2698, 2769, 2710, 2698, 2707, 2706, 2770, 2719, 2702, 2702, 2706, 2711, 2717, 2719, 2698, 2711, 2705, 2704, 2769, 2694, 2710, 2698, 2707, 2706, 2773, 2694, 2707, 2706, 2770, 2719, 2702, 2702, 2706, 2711, 2717, 2719, 2698, 2711, 2705, 2704, 2769, 2694, 2707, 2706, 2757, 2703, 2755, 2766, 2768, 2759, 2770, 2711, 2707, 2719, 2713, 2715, 2769, 2719, 2696, 2711, 2712, 2770, 2711, 2707, 2719, 2713, 2715, 2769, 2697, 2715, 2716, 2702, 2770, 2711, 2707, 2719, 2713, 2715, 2769, 2719, 2702, 2704, 2713, 2770, 2772, 2769, 2772, 2757, 2703, 2755, 2766, 2768, 2758, 2770, 2719, 2702, 2702, 2706, 2711, 2717, 2719, 2698, 2711, 2705, 2704, 2769, 2701, 2711, 2713, 2704, 2715, 2714, 2771, 2715, 2694, 2717, 2710, 2719, 2704, 2713, 2715, 2757, 2696, 2755, 2716, 2765, 2757, 2703, 2755, 2766, 2768, 2759, 2648, 2682, 2682, 2684, 2665, 2669, 2612, 2645, 2680, 2679, 2686, 2668, 2680, 2686, 2684, 1684, 1670, 1731, 1709, 1696, 1730, 1684, 1670, 1749, 1695, 1747, 1758, 1728, 1751, 2735, 2741, 2722, 2721, 1764, 1767, 1782, 1785, 1748, 1737, 1748, 1740, 1733, 1155, 1159, 1165, 2723, 2722, 2739, 1119, 1091, 1091, 1095, 2773, 2730, 2741, 2760, 2770, 2810, 2731, 2722, 2813, 2733, 2733, 2773, 2770, 2771, 2803, 2801, 2735, 2814, 2796, 2775, 2770, 2810, 2813, 2763, 2765, 2774, 2783, 2732, 2774, 2767, 2771, 2723, 2772, 2760, 2762, 2730, 2767, 2731, 2763, 2802, 2735, 2774, 2809, 2799, 2775, 2735, 2771, 2767, 2798, 2760, 2780, 2761, 2797, 2798, 2768, 2775, 2804, 2806, 2807, 2770, 2755, 2806, 2733, 2809, 2767, 2755, 2767, 2812, 2740, 2809, 2806, 2805, 2728, 2794, 2755, 2734, 2735, 2754, 2762, 2729, 2765, 2762, 2740, 2723, 2730, 2792, 2809, 2773, 2797, 2766, 2735, 2794, 2796, 2793, 2778, 2780, 2803, 2753, 2805, 2773, 2802, 2792, 2786, 2792, 2730, 2733, 2785, 2815, 2785, 2766, 2726, 1111, 1116, 1094, 1105, 1106, 1117, 1114, 1116, 1053, 1104, 1116, 1118, 1436, 1431, 1421, 1434, 1433, 1430, 1494, 1435, 1431, 1429, 984, 970, 1021, 1022, 1021, 1002, 1021, 1002, 933, 1008, 1004, 1004, 1000, 1003, 930, 951, 951, 1013, 1015, 1006, 1009, 1021, 950, 1020, 1015, 1005, 1018, 1017, 1014, 950, 1019, 1015, 1013, 951, 822, 820, 801, 816, 818, 826, 807, 812, 790, 826, 827, 801, 816, 827, 801, 3001, 3000, 2985, 3004, 2996, 2993, 2974, 2994, 2995, 2985, 3000, 2995, 2985, 596, 595, 593, 601, 639, 595, 594, 584, 601, 594, 584, 1846, 1834, 1831, 1855, 1827, 1844, 1797, 1833, 1832, 1842, 1827, 1832, 1842, 708, 722, 726, 709, 724, 735, 756, 728, 729, 707, 722, 729, 707};

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        String strM570 = "N1.SIa09f66NIHhj4ewLIafPVMD7MTH8OSQ1T0Pi4MbtL4HTuSGRvuKLomlIXm6bTXTg/bmn3qX54YQ2VQ/81sbNvU4qwrAGhZnNisys16zdzU=";
        if (FishCrypto.v(strM570).isEmpty()) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        return com.github.catvod.spider.merge.p001b.g.y(d(X1.L(X1.X(FishCrypto.v(strM570) + "?keyword=" + URLEncoder.encode(str, "UTF-8") + "&view=search", null, b()), "").Q("div.inner-2col-main div.movlist > ul li > a")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        String strM177 = "N1.SIa09f66NIHhj4ewLIafPVMD7MTH8OSQ1T0Pi4MbtL4HTuSGRvuKLomlIXm6bTXTg/bmn3qX54YQ2VQ/81sbNvU4qwrAGhZnNisys16zdzU=";
        if (FishCrypto.v(strM177).isEmpty()) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        ArrayList arrayList = new ArrayList();
        String strM285 = "movlist/";
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(strM285, "摸鱼陪你看预告", null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            String strM416 = "全部";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM416, ""));
            String strM322 = "喜剧";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM322, strM322));
            String strM219 = "爱情";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM219, strM219));
            String strM175 = "恐怖";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM175, strM175));
            String strM427 = "动作";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM427, strM427));
            String strM286 = "科幻";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM286, strM286));
            String strM511 = "剧情";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM511, strM511));
            String strM31 = "战争";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM31, strM31));
            String strM379 = "犯罪";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM379, strM379));
            String strM499 = "灾难";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM499, strM499));
            String strM554 = "奇幻";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM554, strM554));
            String strM473 = "悬疑";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM473, strM473));
            String strM75 = "惊悚";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM75, strM75));
            String strM249 = "冒险";
            arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strM249, strM249));
            arrayList2.add(new com.github.catvod.spider.merge.p001b.d("1", "类型", arrayList3));
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM416, ""));
            String strM486 = "大陆";
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM486, strM486));
            String strM287 = "香港";
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM287, strM287));
            String strM539 = "台湾";
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM539, strM539));
            String strM358 = "美国";
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM358, strM358));
            String strM65 = "法国";
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM65, strM65));
            String strM83 = "英国";
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM83, strM83));
            String strM512 = "日本";
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM512, strM512));
            String strM234 = "韩国";
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM234, strM234));
            String strM428 = "德国";
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM428, strM428));
            String strM516 = "泰国";
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM516, strM516));
            String strM368 = "印度";
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM368, strM368));
            String strM54 = "其他";
            arrayList4.add(new com.github.catvod.spider.merge.p001b.c(strM54, strM54));
            arrayList2.add(new com.github.catvod.spider.merge.p001b.d("0", "地区", arrayList4));
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(new com.github.catvod.spider.merge.p001b.c(strM416, ""));
            for (int i = 2024; i >= 2000; i--) {
                arrayList5.add(new com.github.catvod.spider.merge.p001b.c(String.valueOf(i), String.valueOf(i)));
            }
            String strM105 = "1999";
            arrayList5.add(new com.github.catvod.spider.merge.p001b.c(strM105, strM105));
            String strM355 = "1998";
            arrayList5.add(new com.github.catvod.spider.merge.p001b.c(strM355, strM355));
            String strM126 = "1980";
            arrayList5.add(new com.github.catvod.spider.merge.p001b.c(strM126, strM126));
            arrayList2.add(new com.github.catvod.spider.merge.p001b.d("2", "年份", arrayList5));
            ArrayList arrayList6 = new ArrayList();
            arrayList6.add(new com.github.catvod.spider.merge.p001b.c("最近更新", ""));
            arrayList6.add(new com.github.catvod.spider.merge.p001b.c("热门", "hot"));
            arrayList6.add(new com.github.catvod.spider.merge.p001b.c("上映时间", "pubtime"));
            arrayList2.add(new com.github.catvod.spider.merge.p001b.d("3", "排序", arrayList6));
            linkedHashMap.put(strM285, arrayList2);
        }
        com.github.catvod.spider.merge.h0.d dVarQ = X1.L(X1.X(FishCrypto.v(strM177), null, b()), "").Q("div.inner-2col-main div.movlist > ul li > a");
        ArrayList arrayList7 = new ArrayList();
        int iMin = Math.min(30, dVarQ.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            k kVar = (k) dVarQ.get(i2);
            String strC = kVar.c("href");
            String strM369 = "span";
            String strC2 = kVar.R(strM369).c("title");
            String strE = e(kVar.R("img").c("src"));
            com.github.catvod.spider.merge.h0.d dVarQ2 = kVar.Q(strM369);
            String strT = dVarQ2.size() > 0 ? dVarQ2.e().T() : "";
            com.github.catvod.spider.merge.p001b.k kVar2 = new com.github.catvod.spider.merge.p001b.k();
            kVar2.n(strC);
            kVar2.o(strC2);
            kVar2.p(strE);
            kVar2.s(strT);
            arrayList7.add(kVar2);
        }
        return com.github.catvod.spider.merge.p001b.g.A(arrayList, arrayList7, linkedHashMap);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strM301 = "N1.SIa09f66NIHhj4ewLIafPVMD7MTH8OSQ1T0Pi4MbtL4HTuSGRvuKLomlIXm6bTXTg/bmn3qX54YQ2VQ/81sbNvU4qwrAGhZnNisys16zdzU=";
        if (FishCrypto.v(strM301).isEmpty()) {
            return com.github.catvod.spider.merge.D.b.f("");
        }
        AbstractC0280n1.u(str, str2);
        String str3 = FishCrypto.v(strM301) + str2;
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.q(1);
        gVar.C(str3);
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strM503;
        String strM386 = "N1.SIa09f66NIHhj4ewLIafPVMD7MTH8OSQ1T0Pi4MbtL4HTuSGRvuKLomlIXm6bTXTg/bmn3qX54YQ2VQ/81sbNvU4qwrAGhZnNisys16zdzU=";
        if (FishCrypto.v(strM386).isEmpty()) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        String str = list.get(0);
        String strT = "";
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(FishCrypto.v(strM386) + str, null, b()), "");
        String strE = e(gVarL.Q("div.movie-title-mpic > a > img").a("src"));
        String strG = gVarL.Q("h1.movie-name").g();
        StringBuilder sb = new StringBuilder();
        Iterator<E> it = gVarL.Q("div.movie-title-detail a").iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strM503 = "href";
            if (!zHasNext) {
                break;
            }
            k kVar = (k) it.next();
            String strC = kVar.c(strM503);
            if (strC.contains("country")) {
                strT = kVar.T();
            }
            if (strC.contains("movietype")) {
                sb.append(kVar.T());
                sb.append("/");
            }
        }
        String strG2 = gVarL.Q("div.movie-title-detail p").g();
        String strA = a(strG2, Pattern.compile("导演：(.+)主演"));
        String strA2 = a(strG2, Pattern.compile("上映：(\\w+)"));
        String strA3 = a(strG2, Pattern.compile("主演：(.+)剧情"));
        String strA4 = a(strG2, Pattern.compile("剧情：(.+)\\(详细\\)"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = gVarL.Q("#tabwrapper-all > .tlist").iterator();
        while (it2.hasNext()) {
            k kVar2 = (k) it2.next();
            arrayList.add(kVar2.Q("th").d().T());
            com.github.catvod.spider.merge.h0.d<k> dVarQ = kVar2.Q("td a.tlist-bbs-tdtitle");
            ArrayList arrayList3 = new ArrayList();
            for (k kVar3 : dVarQ) {
                Iterator it3 = it2;
                arrayList3.add(kVar3.T() + "$" + kVar3.c(strM503));
                it2 = it3;
                strM503 = strM503;
            }
            arrayList2.add(TextUtils.join("#", arrayList3));
            it2 = it2;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        String strM467 = "$$$";
        String strM422 = zIsEmpty ? "暂无预告" : TextUtils.join(strM467, arrayList);
        String strM193 = arrayList2.isEmpty() ? "暂无预告$www" : TextUtils.join(strM467, arrayList2);
        com.github.catvod.spider.merge.p001b.k kVar4 = new com.github.catvod.spider.merge.p001b.k();
        kVar4.n(str);
        kVar4.o(strG);
        kVar4.p(strE);
        kVar4.i(sb.toString());
        kVar4.u(strA2);
        kVar4.k(strT);
        kVar4.j(strA3);
        kVar4.m(strA);
        kVar4.l(strA4);
        kVar4.q(strM422);
        kVar4.r(strM193);
        N1.d(kVar4);
        return com.github.catvod.spider.merge.p001b.g.s(kVar4);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int i;
        String strM288 = "N1.SIa09f66NIHhj4ewLIafPVMD7MTH8OSQ1T0Pi4MbtL4HTuSGRvuKLomlIXm6bTXTg/bmn3qX54YQ2VQ/81sbNvU4qwrAGhZnNisys16zdzU=";
        if (FishCrypto.v(strM288).isEmpty()) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        int i2 = 0;
        String[] strArr = {"", "", "", "", ""};
        strArr[4] = str2;
        if (map != null && map.size() > 0) {
            for (String str3 : map.keySet()) {
                strArr[Integer.parseInt(str3)] = URLEncoder.encode(map.get(str3), "UTF-8");
            }
        }
        String strX = X1.X(FishCrypto.v(strM288) + str + TextUtils.join("_", strArr), null, b());
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(strX, "");
        int i3 = Integer.parseInt(str2);
        com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q("p.page-nav a");
        if (dVarQ.size() > 0) {
            Iterator<E> it = dVarQ.iterator();
            while (it.hasNext()) {
                String strT = ((k) it.next()).T();
                if (c(strT) && (i = Integer.parseInt(strT)) > i2) {
                    i2 = i;
                }
            }
            k kVarR = gVarL.R("p.page-nav a.current");
            if (kVarR != null && c(kVarR.T())) {
                i3 = Integer.parseInt(kVarR.T());
            }
        } else {
            i2 = i3;
        }
        ArrayList arrayList = new ArrayList();
        if (!strX.contains("没有找到您想要的结果哦")) {
            arrayList = d(gVarL.Q("div.inner-2col-main div.movlist > ul li > a"));
        }
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayList);
        gVarC.o(i3, i2, 30, i2 * 30);
        return gVarC.r();
    }

    public static String a(String str, Pattern pattern) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(1).trim() : str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static HashMap b() {
        HashMap mapT = com.github.catvod.spider.merge.D.b.t("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36", "Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        mapT.put("Accept-Language", "zh-CN,zh;q=0.9");
        return mapT;
    }

    public static boolean c(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList d(com.github.catvod.spider.merge.h0.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = dVar.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            String strC = kVar.c("href");
            String strM249 = "span";
            String strC2 = kVar.R(strM249).c("title");
            String strE = e(kVar.R("img").c("src"));
            com.github.catvod.spider.merge.h0.d dVarQ = kVar.Q(strM249);
            String strT = dVarQ.size() > 0 ? dVarQ.e().T() : "";
            com.github.catvod.spider.merge.p001b.k kVar2 = new com.github.catvod.spider.merge.p001b.k();
            kVar2.n(strC);
            kVar2.o(strC2);
            kVar2.p(strE);
            kVar2.s(strT);
            arrayList.add(kVar2);
        }
        return arrayList;
    }

    public static String e(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        if (str.startsWith("http")) {
            return (str.contains("doubanio.com") || str.contains("douban.com")) ? str.concat("@Referer=https://movie.douban.com/") : str;
        }
        return FishCrypto.v("N1.SIa09f66NIHhj4ewLIafPVMD7MTH8OSQ1T0Pi4MbtL4HTuSGRvuKLomlIXm6bTXTg/bmn3qX54YQ2VQ/81sbNvU4qwrAGhZnNisys16zdzU=").concat(str);
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

    public void init(Context context, String str) {
        super.init(context, str);
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
}

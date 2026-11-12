package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
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
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
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
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Sir88 extends Spider {
    public String a = "";

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f90short = {1890, 1821, 1794, 1859, 1883, 1887, 1885, 1897, 1861, 1909, 1881, 1909, 1860, 1914, 1901, 1916, 1895, 1867, 1822, 1884, 1818, 1823, 1919, 1914, 1889, 1910, 1881, 1889, 1865, 1889, 1919, 1887, 1857, 1886, 1823, 1859, 1893, 1917, 1899, 1884, 1870, 1812, 1820, 1916, 1889, 1895, 1895, 1865, 1913, 1822, 1885, 1876, 1876, 1884, 1894, 1894, 1817, 1860, 1903, 1890, 1887, 1918, 1821, 1816, 1899, 1897, 1902, 1917, 1912, 1913, 1889, 1795, 1901, 1861, 1899, 1878, 1865, 1819, 1916, 1876, 1897, 1862, 1918, 1857, 1817, 1917, 1886, 1919, 1813, 1865, 1857, 1858, 1896, 1898, 1919, 1866, 1816, 1892, 1860, 1903, 1795, 1870, 1897, 1917, 1891, 1890, 1898, 1880, 1912, 1816, 1809, 2284, 2281, 2300, 2281, 486, 493, 484, 491, 491, 480, 489, 474, 492, 481, 2527, 2516, 2525, 2514, 2514, 2521, 2512, 2531, 2514, 2525, 2513, 2521, 28663, -28913, 32463, 27798, 17942, 1755, 1700, 1723, 1777, 1757, 1741, 1782, 1747, 1786, 1741, 1752, 1708, 1722, 1741, 1722, 1726, 1731, 1753, 1763, 1697, 1760, 1700, 1703, 1784, 1782, 1744, 1699, 1741, 1744, 1748, 1758, 1703, 1734, 1788, 1751, 1744, 1758, 1759, 1703, 1703, 1756, 1763, 1756, 1755, 1765, 1740, 1790, 1778, 1790, 1740, 1744, 1790, 1735, 1741, 1703, 1782, 1765, 1785, 1791, 1766, 1776, 1776, 1745, 1779, 1763, 1772, 1752, 1791, 1785, 1790, 1790, 1722, 1757, 1728, 1784, 1785, 1766, 1702, 1751, 1748, 1728, 1759, 1777, 1726, 1786, 1764, 1779, 1765, 1778, 1732, 1756, 1743, 1750, 1755, 1778, 1747, 1788, 1756, 1764, 1702, 1767, 1785, 1772, 1779, 1753, 1729, 1696, 1757, 1753, 1740, 1704, 2426, 2420, 2410, 2364, 2349, 2347, 2345, 2417, 2428, 1260, 1265, 1265, 1267, 1261, 1741, 1744, 1744, 1746, 1760, 1739, 1750, 1739, 1747, 1754, 31415, 28407, 3041, 3067, 3040, 2954, 2954, 3058, 3058, 3058, 3184, 3154, 3154, 3156, 3137, 3141, 870, 870, 870, 1126, 1147, 1147, 1145, 1099, 1149, 1136, 2661, 2665, 2658, 2659, 2649, 2671, 2658, 1029, 1048, 1052, 1044, 2675, 2284, 2272, 2293, 2274, 2281, 2270, 2280, 2277, 3266, 3265, 3294, 3267, 3269, 3310, 3288, 3285, 390, 505, 486, 447, 391, 388, 390, 445, 430, 414, 396, 414, 504, 387, 497, 432, 386, 506, 390, 504, 430, 443, 395, 425, 409, 401, 412, 446, 483, 441, 441, 401, 445, 428, 506, 386, 396, 429, 505, 387, 418, 507, 509, 441, 496, 429, 434, 507, 408, 398, 497, 388, 510, 422, 434, 426, 416, 412, 433, 442, 421, 416, 423, 395, 447, 420, 398, 418, 444, 504, 428, 444, 510, 396, 506, 414, 425, 433, 444, 425, 504, 508, 496, 430, 385, 409, 446, 397, 395, 487, 412, 511, 446, 427, 390, 391, 401, 415, 413, 487, 504, 402, 497, 418, 425, 447, 508, 385, 384, 388, 387, 507, 417, 401, 391, 426, 415, 421, 426, 413, 384, 426, 443, 409, 444, 506, 446, 504, 430, 398, 509, 427, 414, 408, 417, 497, 394, 398, 414, 508, 422, 508, 401, 429, 396, 396, 419, 487, 386, 507, 420, 393, 510, 417, 444, 483, 444, 399, 504, 510, 399, 399, 511, 442, 509, 427, 445, 385, 410, 431, 419, 395, 408, 444, 496, 426, 400, 447, 432, 388, 447, 418, 416, 394, 420, 425, 387, 422, 414, 434, 400, 425, 419, 430, 429, 2812, 2790, 2792, 2785, 2798, 2811, 2810, 2813, 2794, 3181, 3090, 3085, 3180, 3179, 3150, 3149, 3144, 3144, 3159, 3187, 3150, 3092, 3153, 3142, 3088, 3138, 3178, 3098, 3176, 3182, 3169, 3187, 3181, 3190, 3146, 3186, 3090, 3145, 3142, 3172, 3095, 3191, 3091, 3091, 3180, 3189, 3150, 3189, 3174, 3188, 3151, 3155, 3186, 3144, 3149, 3156, 3173, 3092, 3170, 3146, 3170, 3152, 3093, 3184, 3148, 3177, 3143, 3168, 3093, 3144, 3191, 3184, 3138, 3178, 3169, 3180, 3169, 3095, 3094, 3137, 3179, 3088, 3183, 3185, 3188, 3178, 3191, 3188, 3188, 3156, 3190, 3143, 3170, 3177, 3194, 3144, 3158, 3137, 3159, 3163, 3176, 3145, 3089, 3095, 3137, 3173, 3138, 3145, 3159, 3084, 3172, 3176, 3182, 3150, 3173, 3151, 3186, 3187, 3093, 3146, 3174, 3185, 3180, 3168, 3149, 3084, 3188, 3174, 3159, 3137, 3184, 3142, 3144, 3170, 3140, 3148, 3141, 3186, 3185, 3162, 2460, 2520, 2521, 2522, 2501, 2458, 2438, 2443, 2451, 2501, 2463, 2456, 2438, 2116, 2133, 2133, 2121, 2124, 2118, 2116, 2129, 2124, 2122, 2123, 2058, 2127, 2134, 2122, 2123, 2057, 2053, 2129, 2112, 2141, 2129, 2058, 2127, 2116, 2131, 2116, 2134, 2118, 2135, 2124, 2133, 2129, 2057, 2053, 2063, 2058, 2063, 2078, 2053, 2132, 2072, 2069, 2059, 2069, 2068, 723, 767, 766, 740, 757, 766, 740, 701, 708, 745, 736, 757, 1466, 1451, 1451, 1463, 1458, 1464, 1466, 1455, 1458, 1460, 1461, 1524, 1443, 1526, 1452, 1452, 1452, 1526, 1469, 1460, 1449, 1462, 1526, 1454, 1449, 1463, 1470, 1461, 1464, 1460, 1471, 1470, 1471, 1504, 1464, 1459, 1466, 1449, 1448, 1470, 1455, 1510, 1422, 1423, 1437, 1526, 1507, 3040, 3059, 3044, 3045, 3071, 3065, 3064, 1227, 1236, 1218, 1236, 1230, 841, 840, 859, 836, 846, 840, 796, 706, 734, 723, 710, 724, 733, 704, 735, 1043, 1043, 1105, 1097, 1389, 1388, 1407, 1376, 1386, 1388, 1339, 818, 822, 830, 818, 2735, 2802, 2723, 2800, 2722, 2807, 2727, 2721, 2727, 2723, 2734, 2800, 2722, 2804, 2724, 2722, 2734, 2721, 2721, 2727, 2803, 2807, 2726, 2735, 2723, 2724, 2800, 2723, 2800, 2723, 2722, 2735, 2233, 2216, 2227, 2288, 2228, 2224, 2232, 2228, 3291, 3274, 3283, 3223, 3276, 3295, 3272, 3273, 3283, 3285, 3284, 379, 1067, 1314, 284, 2393, 2342, 2361, 2364, 2350, 2390, 2403, 2388, 2342, 2397, 2400, 2414, 2428, 2415, 2350, 2388, 2381, 2399, 2407, 2388, 2396, 2368, 2394, 2414, 2343, 2339, 2414, 2339, 2401, 2383, 2400, 2392, 2420, 2430, 2337, 2383, 2388, 2372, 2415, 2393, 2394, 2350, 2424, 2404, 2350, 2401, 2424, 2414, 2338, 2414, 2399, 2403, 2387, 2424, 2431, 2398, 2416, 2351, 2369, 2375, 2403, 2338, 2339, 2401, 2429, 2368, 2395, 2370, 2388, 2415, 2384, 2375, 2394, 2386, 2405, 2369, 2339, 2424, 2421, 2370, 2395, 2392, 2397, 2418, 2390, 2403, 2405, 2343, 2428, 2426, 2375, 2385, 2401, 2371, 2397, 2369, 2421, 2339, 2395, 2373, 2419, 2428, 2422, 2387, 2350, 2415, 2389, 2413, 2425, 2374, 2346, 3145, 3126, 3113, 3120, 3157, 3169, 3182, 3140, 
    3159, 3198, 3169, 3124, 3138, 3159, 3141, 3140, 3156, 3116, 3155, 3168, 3184, 3153, 3165, 3190, 3197, 3184, 3142, 3188, 3147, 3149, 3152, 3198, 3197, 3112, 3121, 3158, 3116, 3166, 3172, 3137, 3187, 3124, 3147, 3178, 3186, 3186, 3187, 3197, 3197, 3155, 3146, 3171, 3172, 3141, 3168, 3153, 3134, 3191, 3159, 3138, 3198, 3150, 3169, 3184, 3179, 3165, 3153, 3159, 3137, 3182, 3122, 3145, 3140, 3135, 3176, 3136, 3141, 3123, 3146, 3177, 3187, 3176, 3159, 3173, 3157, 3156, 3176, 3136, 3148, 3134, 3177, 3144, 3174, 3189, 3170, 3181, 3142, 3139, 3149, 3183, 3179, 3146, 3142, 3127, 3182, 3166, 3138, 3198, 3135, 3188, 3130, 1446, 1442, 1460, 1480, 1444, 1445, 1444, 1480, 1463, 1452, 1444, 1460, 1490, 1463, 1414, 1411, 1411, 1422, 1417, 1408, 2397, 2393, 2383, 2430, 2427, 2414, 2427, 1558, 1546, 1543, 1567, 1593, 1555, 1556, 1546, -31171, 22108, 24871, 24756, 21178, 21194, 23739, -30545, 613, 538, 517, 541, 537, 633, 581, 626, 617, 591, 601, 590, 593, 613, 612, 634, 608, 601, 617, 639, 539, 581, 576, 586, 616, 604, 600, 612, 605, 617, 623, 613, 586, 634, 607, 601, 540, 540, 604, 516, 639, 606, 601, 512, 632, 617, 595, 538, 588, 602, 616, 536, 530, 588, 617, 638, 601, 627, 602, 614, 625, 638, 614, 579, 543, 595, 621, 585, 578, 611, 636, 616, 585, 585, 635, 540, 578, 617, 600, 585, 603, 605, 590, 623, 578, 536, 583, 593, 588, 534, 534, 1418, 1423, 1418, 607, 627, 626, 626, 633, 639, 616, 629, 627, 626, 1977, 1943, 1943, 1922, 2015, 1971, 1950, 1947, 1924, 1943, 2418, 2373, 2374, 2373, 2386, 2373, 2386, 2164, 2103, 2153, 2095, 2146, 1854, 1910, 1916, 1894, 1675, 1684, 1689, 1688, 1682, 1746, 1669, 1744, 1691, 1681, 1675, 388, 388, 388, 1713, 1997, 1970, 1965, 2005, 2033, 1978, 2035, 2038, 1978, 2041, 2031, 2030, 2035, 1984, 1973, 1996, 1998, 1994, 2036, 1997, 1994, 1998, 1973, 2029, 2003, 1988, 2038, 1990, 2042, 1993, 2042, 1986, 2033, 1974, 1998, 2020, 1973, 2022, 2035, 1975, 1975, 2005, 1994, 1972, 1972, 2032, 2037, 1978, 1991, 1998, 1975, 2007, 1985, 1986, 2006, 1999, 1997, 2026, 1979, 2001, 1991, 2041, 1975, 2041, 2035, 2022, 1978, 1990, 1979, 2036, 2039, 1964, 2027, 2016, 2001, 1974, 2000, 2024, 1979, 2001, 1969, 2032, 1995, 1978, 1990, 1978, 2000, 1985, 2039, 2037, 2011, 1973, 1997, 2000, 1992, 1999, 2034, 2018, 1995, 1998, 1990, 1968, 1988, 2007, 1998, 2005, 2017, 2005, 2016, 1975, 1982, 698, 751, 748, 755, 750, 744, 707, 757, 760, 673, 951, 1020, 1008, 997, 1010, 1017, 974, 1016, 1013, 940, 3187, 3190, 3171, 3190, 31443, 26762, -26157, 16938, 22399, 23311, 1054, 1027, 1027, 1025, 1075, 1048, 1029, 1048, 1024, 1033, 1810, 1794, 1811, 1796, 1796, 1807, 1810, 1801, 1806, 1813, 1854, 1812, 1811, 1805, 2333, 2321, 2308, 2323, 2328, 2351, 2329, 2334, 2326, 2335, 668, 640, 653, 661, 691, 650, 640, 643, 667, 1524, 1531, 1527, 1535, 3163, 3143, 3146, 3154, 3188, 3166, 3161, 3143, 2138, 2143, 2118, 2118, 2165, 2136, 2142, 2119, 2138, 2165, 2143, 2136, 2118, 2755, 2757, 2780, 2753, 1949, 1944, 1921, 1921, 1970, 1931, 1921, 1947, 1970, 1944, 1951, 1921, 1866, 1856, 1882, 1630, 1602, 1615, 1623, 1649, 1613, 1602, 1615, 1628, 1607, 1626, 1623, 3099, 3092, 3097, 3082, 3089, 3084, 3073, 3283, 3264, 3275, 3292, 24645, 26183, -28860, 22092, 29259, 19282, -29323, -25566, 19102, 19016, 19430, 23244, 20729, 32119, 28462, 1775, 530, 621, 626, 568, 532, 516, 575, 538, 563, 516, 529, 613, 627, 516, 627, 631, 522, 528, 554, 616, 553, 621, 622, 561, 575, 537, 618, 516, 537, 541, 535, 622, 527, 565, 542, 537, 535, 534, 622, 622, 533, 554, 533, 530, 556, 517, 567, 571, 567, 517, 537, 567, 526, 516, 622, 575, 556, 560, 566, 559, 569, 569, 536, 570, 554, 549, 529, 566, 560, 567, 567, 627, 532, 521, 561, 560, 559, 623, 542, 541, 521, 534, 568, 631, 563, 557, 570, 556, 571, 525, 533, 518, 543, 530, 571, 538, 565, 533, 557, 623, 558, 560, 549, 570, 528, 520, 617, 532, 528, 517, 609, 2431, 2345, 2360, 2366, 2364, 2404, 2906, 2911, 2890, 2911, 3264, 3293, 3293, 3295, 3265, 1356, 1361, 1361, 1363, 1377, 1354, 1367, 1354, 1362, 1371, 29399, 24718, 18958, 2933, 2826, 2837, 2943, 2932, 2825, 2925, 2826, 2824, 2824, 2933, 2831, 2818, 2935, 2819, 2929, 2908, 2934, 2898, 2915, 2896, 2904, 2928, 2943, 2941, 2898, 2906, 2818, 2940, 2923, 2828, 2937, 2927, 2883, 2942, 2890, 2881, 2881, 2836, 2831, 2909, 2895, 2914, 2891, 2913, 2926, 2909, 2905, 2892, 2825, 2936, 2931, 2904, 2892, 2911, 2830, 2905, 2909, 2883, 2827, 2932, 2904, 2819, 2913, 2882, 2909, 2929, 2930, 2883, 2890, 2826, 2910, 2906, 2929, 2908, 2827, 2911, 2890, 2923, 2893, 2926, 2883, 2901, 2898, 2836, 2924, 2925, 2932, 2904, 2881, 2895, 2930, 2938, 2921, 2925, 2824, 2938, 2938, 2891, 2908, 2942, 2883, 2935, 2828, 2926, 2903, 2938, 2827, 2933, 2934, 2822, 2904, 2900, 2881, 2902, 2909, 2922, 2905, 2908, 2886, 2881, 2414, 2402, 2423, 2400, 2411, 2396, 2410, 2407, 385, 569, 570, 549, 568, 574, 533, 547, 558, 1233, 1242, 1235, 1222, 1216, 1245, 1245, 1247, 1261, 1243, 1238, 3208, 3208, 3208, 558, 553, 555, 547, 537, 552, 551, 555, 547, 1966, 1976, 1966, 1974, 1936, 1953, 1966, 1954, 1962, 1184, 1197, 1192, 1184, 1202, 1182, 1199, 1184, 1196, 1188, 1651, 1860, 1842, 1847, 1860, 3158, 3153, 3155, 3163, 3169, 3154, 3153, 3161, 3153, 2072, 2068, 2049, 2070, 2077, 2090, 2049, 2076, 2072, 2064, 632, 632, 536, 593, 593, 533, 637, 637, 527, 600, 600, 2691, 2737, 2731, 2723, 2797, 2705, 2730, 2723, 2732, 2725, 2730, 2723, 2731, 947, 947, 961, 918, 918, 18784, 25167, 1927, 27200, 27051, 3171, 2494, 2485, 2028, 2031, 570, 570, 569, 560, 2916, 2924, 23561, 31240, 27300, 28707, 29942, 22846, -30585, 18759, -30160, 31154, 22487, 293, 294, 302, 288, 295, 278, 314, 317, 296, 317, 316, 314, 1145, 1141, 1150, 1151, 2632, 2628, 2639, 2638, 2676, 2626, 2639, 1452, 1457, 1452, 1460, 1469, 708, 715, 711, 719, 3144, 27767, 28132, 1681, 967, 987, 987, 991, 988, 1807, 470, 
    425, 438, 430, 426, 458, 502, 449, 474, 508, 490, 509, 482, 470, 471, 457, 467, 490, 474, 460, 424, 502, 499, 505, 475, 495, 491, 471, 494, 474, 476, 470, 505, 457, 492, 490, 431, 431, 495, 439, 460, 493, 490, 435, 459, 474, 480, 425, 511, 489, 475, 427, 417, 511, 474, 461, 490, 448, 489, 469, 450, 461, 469, 496, 428, 480, 478, 506, 497, 464, 463, 475, 506, 506, 456, 431, 497, 474, 491, 506, 488, 494, 509, 476, 497, 427, 500, 482, 511, 421, 421, 2643, 2633, 2642, 2616, 2616, 2624, 2624, 2624, 2042, 2042, 2042, 2956, 2986, 3004, 2987, 3060, 2968, 3006, 3004, 2999, 2989, 2425, 2395, 2382, 2397, 2392, 2392, 2389, 2331, 2305, 2330, 2308, 2324, 2332, 2403, 2397, 2394, 2384, 2395, 2371, 2375, 2324, 2426, 2400, 2324, 2309, 2308, 2330, 2308, 2319, 2324, 2403, 2397, 2394, 2306, 2304, 2319, 2324, 2380, 2306, 2304, 2333, 2324, 2421, 2372, 2372, 2392, 2385, 2403, 2385, 2390, 2431, 2397, 2368, 2331, 2305, 2311, 2307, 2330, 2311, 2306, 2324, 2332, 2431, 2428, 2400, 2425, 2424, 2328, 2324, 2392, 2397, 2399, 2385, 2324, 2419, 2385, 2391, 2399, 2395, 2333, 2324, 2423, 2396, 2374, 2395, 2393, 2385, 2331, 2309, 2310, 2310, 2330, 2308, 2330, 2308, 2330, 2308, 2324, 2407, 2389, 2386, 2389, 2374, 2397, 2331, 2305, 2311, 2307, 2330, 2311, 2306, 594, 601, 592, 581, 579, 606, 606, 604, 622, 600, 597, 2668, 883, 880, 879, 882, 884, 863, 873, 868, 3167, 3155, 3142, 3153, 3162, 3181, 3163, 3158, 672, 672, 672, 1787, 1766, 1766, 1764, 1750, 1789, 1760, 1789, 1765, 1772, 1634, 1646, 1659, 1644, 1639, 1616, 1660, 1644, 1661, 1642, 1642, 1633, 1660, 1639, 1632, 1659, 1616, 1658, 1661, 1635, 928, 944, 929, 950, 950, 957, 928, 955, 956, 935, 908, 934, 929, 959, 3089, 3091, 3078, 3095, 3093, 3101, 3072, 3083, 3121, 3101, 3100, 3078, 3095, 3100, 3078, 443, 442, 427, 446, 438, 435, 412, 432, 433, 427, 442, 433, 427, 1942, 1937, 1939, 1947, 1981, 1937, 1936, 1930, 1947, 1936, 1930, 2982, 3033, 3014, 2949, 2957, 2993, 3038, 3006, 2981, 3039, 2978, 3015, 2960, 2982, 2983, 2990, 2960, 3037, 3011, 2993, 2955, 2991, 3005, 3002, 3038, 2947, 2950, 2958, 3037, 2956, 3011, 2975, 2982, 3005, 2956, 3033, 2994, 2978, 2961, 3003, 3000, 2986, 2988, 3025, 2953, 3000, 3004, 2958, 2986, 2980, 2958, 2982, 2987, 3025, 2946, 2976, 2977, 2978, 2978, 3005, 3039, 3025, 2977, 2949, 2981, 2975, 3039, 2978, 2983, 2982, 2973, 3003, 2959, 3003, 3037, 3007, 2951, 3002, 2960, 3034, 2969, 3007, 3032, 3006, 3005, 2988, 2976, 2953, 2959, 2955, 2968, 3036, 2970, 3025, 2992, 2955, 2960, 3036, 2945, 2954, 2990, 2985, 2959, 3000, 2969, 3033, 2948, 2976, 3001, 2974, 2989, 2968, 2972, 2979, 2980, 2989, 3039, 2948, 2977, 2972, 2949, 3004, 2976, 2981, 2949, 2961, 2989, 2976, 2949, 2951, 3038, 2073, 2053, 2056, 2064, 2060, 2075, 2090, 2054, 2055, 2077, 2060, 2055, 2077};
    public static final HashSet b = new HashSet(Arrays.asList(C0081.m322(f90short, 1940, 2, 514), C0130.m516(f90short, 1936, 2, 2438), C0046.m182(f90short, 1938, 2, 2011), C0112.m445(f90short, 1942, 2, 513), C0112.m445(f90short, 1944, 2, 2908)));
    public static final String[] c = {C0104.m414(f90short, 1950, 2, 648), C0087.m346(f90short, 1952, 1, 1483), C0093.m368(f90short, 1946, 2, 864), C0101.m402(f90short, 1948, 2, 623), C0050.m199(f90short, 1953, 2, 1863), C0019.m75(f90short, 1955, 2, 3207)};

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject(X1.X(this.a + FishCrypto.v(C0116.m463(f90short, 0, 111, 1836)), null, e()));
        String strM126 = C0032.m126(f90short, 111, 4, 2184);
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(strM126);
        if (jSONArrayOptJSONArray2 != null) {
            for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                String strOptString = jSONObject2.optString(C0074.m292(f90short, 115, 10, 389));
                String strOptString2 = jSONObject2.optString(C0120.m477(f90short, 125, 12, 2492));
                if (!b.contains(strOptString)) {
                    if (C0096.m382(f90short, 137, 2, 3167).equals(strOptString2)) {
                        strOptString2 = C0032.m126(f90short, 139, 3, 2107);
                    }
                    com.github.catvod.spider.merge.D.b.z(strOptString, strOptString2, null, arrayList);
                }
            }
        }
        JSONArray jSONArrayOptJSONArray3 = new JSONObject(X1.X(this.a + FishCrypto.v(C0095.m379(f90short, 142, 111, 1685)) + C0087.m346(f90short, 253, 9, 2380), null, e())).optJSONArray(strM126);
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0 && (jSONArrayOptJSONArray = jSONArrayOptJSONArray3.getJSONObject(0).optJSONArray(C0128.m511(f90short, 262, 5, 1182))) != null) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i2);
                String strOptString3 = jSONObject3.optString(C0044.m175(f90short, 267, 10, 1727), "");
                String[] strArr = c;
                int length = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        arrayList3.add(jSONObject3);
                        break;
                    }
                    if (strOptString3.contains(strArr[i3])) {
                        arrayList4.add(jSONObject3);
                        break;
                    }
                    i3++;
                }
            }
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList3);
            arrayList5.addAll(arrayList4);
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                arrayList2.add(f(C0089.m355(f90short, 277, 2, 2650), (JSONObject) it.next()));
            }
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, arrayList2);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str3 = str2;
        String strI = AbstractC0280n1.i(str, str3, null, null);
        String strM486 = C0122.m486(f90short, 279, 8, 2994);
        boolean zStartsWith = str3.startsWith(strM486);
        String strM445 = C0112.m445(f90short, 287, 6, 3121);
        if (zStartsWith) {
            String[] strArrSplit = str3.split(C0026.m102(f90short, 293, 3, 806));
            if (strArrSplit.length >= 5) {
                String str4 = strArrSplit[1];
                String str5 = strArrSplit[2];
                String str6 = strArrSplit[3];
                HashMap mapT = com.github.catvod.spider.merge.D.b.t(C0117.m467(f90short, 296, 7, 1044), str4, C0026.m102(f90short, 303, 7, 2566), strArrSplit[4]);
                mapT.put(C0081.m322(f90short, 310, 4, 1137), String.valueOf(System.currentTimeMillis() / 1000));
                String strM516 = C0130.m516(f90short, 314, 1, 2627);
                if (!strM516.equals(str6)) {
                    mapT.put(C0045.m177(f90short, 315, 8, 2177), str6);
                }
                if (!strM516.equals(str5)) {
                    mapT.put(C0027.m105(f90short, 323, 8, 3249), str5);
                }
                ArrayList<String> arrayList = new ArrayList(mapT.keySet());
                Collections.sort(arrayList);
                StringBuilder sb = new StringBuilder();
                for (String str7 : arrayList) {
                    sb.append(str7);
                    sb.append((String) mapT.get(str7));
                }
                sb.append(FishCrypto.v(C0028.m108(f90short, 331, 195, 456)));
                mapT.put(C0098.m390(f90short, 526, 9, 2703), AbstractC0309x1.a(sb.toString()));
                String strConcat = FishCrypto.v(C0053.m210(f90short, 535, 131, 3107)).concat(C0003.m10(f90short, 666, 13, 2538));
                HashMap mapE = e();
                mapE.put(strM445, C0105.m416(f90short, 679, 46, 2085));
                mapE.put(C0091.m360(f90short, 725, 12, 656), C0006.m21(f90short, 737, 47, 1499));
                String strM346 = C0087.m346(f90short, 784, 7, 2966);
                String strM402 = C0101.m402(f90short, 791, 5, 1274);
                mapE.put(strM346, strM402);
                String strM186 = C0047.m186(f90short, 796, 6, 813);
                String strM365 = C0092.m365(f90short, 802, 1, 815);
                mapE.put(strM186, strM365);
                mapE.put(C0032.m126(f90short, 803, 8, 690), C0142.m567(f90short, 811, 4, 1067));
                mapE.put(C0008.m31(f90short, 815, 7, 1289), strM365);
                mapE.put(C0119.m473(f90short, 822, 4, 859), C0122.m486(f90short, 826, 32, 2710));
                mapE.put(C0112.m445(f90short, 858, 8, 2269), "");
                mapE.put(C0087.m346(f90short, 866, 11, 3258), strM402);
                String strA = X1.N(strConcat, mapT, mapE).a();
                String strTrim = strA == null ? "" : strA.trim();
                String strM473 = C0119.m473(f90short, 877, 1, 345);
                if (strTrim.startsWith(strM473) && strTrim.endsWith(strM473)) {
                    strTrim = new JSONArray(com.github.catvod.spider.merge.D.b.j(C0001.m1(f90short, 878, 1, 1136), strTrim, C0112.m445(f90short, 879, 1, 1407))).optString(0);
                }
                if (!strTrim.startsWith(C0014.m54(f90short, 880, 1, 359))) {
                    String strV = FishCrypto.v(C0049.m193(f90short, 881, 111, 2327));
                    String strV2 = FishCrypto.v(C0044.m175(f90short, 992, 111, 3079));
                    Cipher cipher = Cipher.getInstance(C0044.m175(f90short, 1103, 20, 1511));
                    Charset charset = StandardCharsets.ISO_8859_1;
                    cipher.init(2, new SecretKeySpec(strV.getBytes(charset), C0018.m70(f90short, 1123, 3, 2332)), new IvParameterSpec(strV2.getBytes(charset)));
                    strTrim = new String(cipher.doFinal(Base64.decode(strTrim, 0)), StandardCharsets.UTF_8);
                }
                JSONObject jSONObjectOptJSONObject = new JSONObject(strTrim).optJSONObject(C0143.m570(f90short, 1126, 4, 2330));
                String strOptString = jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString(C0047.m186(f90short, 1130, 8, 1638), "");
                if (!TextUtils.isEmpty(strOptString)) {
                    str3 = strOptString;
                }
            }
        }
        if (str3.startsWith(strM486)) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C("");
            gVar.l(C0103.m408(f90short, 1138, 8, 1418));
            return gVar.r();
        }
        String strW = FishCrypto.w(C0137.m545(f90short, 1146, 91, 555), str3);
        com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
        gVar2.C(strW);
        HashMap mapE2 = e();
        mapE2.put(strM445, C0115.m459(f90short, 1237, 3, 1440));
        mapE2.put(C0001.m1(f90short, 1240, 10, 540), C0076.m301(f90short, 1250, 10, 2034));
        mapE2.put(C0044.m175(f90short, 1260, 7, 2336), this.a);
        gVar2.h(mapE2);
        gVar2.b(strI);
        if (strW.contains(C0101.m402(f90short, 1267, 5, 2138))) {
            gVar2.k();
        } else if (strW.contains(C0130.m516(f90short, 1272, 4, 1808))) {
            gVar2.f(C0104.m414(f90short, 1276, 11, 1789));
        }
        return gVar2.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        JSONArray jSONArray;
        String[] strArrSplit = list.get(0).split(C0130.m516(f90short, 1287, 3, 452));
        String str = strArrSplit[0];
        int length = strArrSplit.length;
        String strM42 = C0011.m42(f90short, 1290, 1, 1665);
        String str2 = length > 1 ? strArrSplit[1] : strM42;
        String str3 = strArrSplit.length > 2 ? strArrSplit[2] : strM42;
        StringBuilder sb = new StringBuilder(this.a + FishCrypto.v(C0055.m219(f90short, 1291, 111, 1923)) + str + C0120.m477(f90short, 1402, 10, 668) + str2);
        if (!strM42.equals(str3)) {
            sb.append(C0076.m301(f90short, 1412, 10, 913));
            sb.append(str3);
        }
        JSONObject jSONObjectOptJSONObject = new JSONObject(X1.X(sb.toString(), null, e())).optJSONObject(C0092.m365(f90short, 1422, 4, 3095));
        if (jSONObjectOptJSONObject == null) {
            return com.github.catvod.spider.merge.p001b.g.d(C0140.m558(f90short, 1426, 6, 3111));
        }
        String strOptString = jSONObjectOptJSONObject.optString(C0090.m358(f90short, 1432, 10, 1132), "");
        String strM177 = C0045.m177(f90short, 1442, 14, 1889);
        String strOptString2 = jSONObjectOptJSONObject.optString(strM177, "");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(C0021.m83(f90short, 1456, 10, 2416));
        if (TextUtils.isEmpty(strOptString2) && jSONObjectOptJSONObject2 != null) {
            strOptString2 = jSONObjectOptJSONObject2.optString(strM177, "");
        }
        String str4 = strOptString2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(C0126.m503(f90short, 1466, 9, 748));
        if (jSONArrayOptJSONArray != null) {
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                String strOptString3 = jSONObject.optString(C0030.m116(f90short, 1475, 4, 1434));
                String strOptString4 = jSONObject.optString(C0114.m454(f90short, 1479, 8, 3115));
                if (TextUtils.isEmpty(strOptString4)) {
                    jSONArray = jSONArrayOptJSONArray;
                    a(arrayList, hashSet, jSONObject, str, str2, str3);
                } else {
                    b(arrayList, hashSet, strOptString3, strOptString4);
                    jSONArray = jSONArrayOptJSONArray;
                }
                i++;
                hashSet = hashSet;
                arrayList = arrayList;
                jSONArrayOptJSONArray = jSONArray;
            }
        }
        HashSet hashSet2 = hashSet;
        ArrayList arrayList2 = arrayList;
        String strOptString5 = jSONObjectOptJSONObject.optString(C0092.m365(f90short, 1487, 13, 2090), "");
        if (!TextUtils.isEmpty(strOptString5)) {
            b(arrayList2, hashSet2, C0090.m358(f90short, 1500, 4, 2705), strOptString5);
        }
        String strOptString6 = jSONObjectOptJSONObject.optString(C0106.m422(f90short, 1504, 12, 2029), "");
        if (!TextUtils.isEmpty(strOptString6)) {
            b(arrayList2, hashSet2, C0063.m249(f90short, 1516, 3, 1804), strOptString6);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(C0063.m249(f90short, 1519, 12, 1582));
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(C0074.m292(f90short, 1531, 7, 3192));
        }
        JSONArray jSONArray2 = jSONArrayOptJSONArray2;
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                a(arrayList2, hashSet2, jSONArray2.getJSONObject(i2), str, str2, str3);
            }
        }
        if (arrayList2.isEmpty()) {
            b(arrayList2, hashSet2, C0106.m422(f90short, 1542, 2, 2114), d(str, str2, str3, C0119.m473(f90short, 1538, 4, 3249)));
        }
        k kVar = new k();
        kVar.n(list.get(0));
        kVar.o(strOptString);
        kVar.p(str4);
        kVar.l(C0053.m210(f90short, 1544, 11, 1203));
        kVar.q(C0017.m65(f90short, 1555, 2, 2947));
        kVar.r(TextUtils.join(C0122.m486(f90short, 1557, 1, 1740), arrayList2));
        AbstractC0280n1.p(strOptString);
        AbstractC0280n1.q(kVar.e());
        FishCrypto.c(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        String str3;
        JSONArray jSONArrayOptJSONArray2;
        int i = Integer.parseInt(str2);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(FishCrypto.v(C0090.m358(f90short, 1558, 111, 604)));
        sb.append(str);
        sb.append(C0122.m486(f90short, 1669, 6, 2393));
        sb.append(i - 1);
        JSONObject jSONObject = new JSONObject(X1.X(sb.toString(), null, e()));
        String strM175 = C0044.m175(f90short, 1675, 4, 2878);
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(strM175);
        int i2 = 0;
        if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() != 0 && (jSONArrayOptJSONArray2 = jSONArrayOptJSONArray3.getJSONObject(0).optJSONArray(C0021.m83(f90short, 1679, 5, 3250))) != null) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            while (i3 < jSONArrayOptJSONArray2.length()) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i3);
                String strOptString = jSONObject2.optString(C0142.m567(f90short, 1684, 10, 1342), "");
                String[] strArr = c;
                int length = strArr.length;
                while (true) {
                    if (i2 >= length) {
                        arrayList2.add(jSONObject2);
                        break;
                    }
                    if (strOptString.contains(strArr[i2])) {
                        arrayList3.add(jSONObject2);
                        break;
                    }
                    i2++;
                }
                i3++;
                i2 = 0;
            }
            arrayList2.addAll(arrayList3);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(f(C0009.m33(f90short, 1694, 3, 1059), (JSONObject) it.next()));
            }
        }
        if (!arrayList.isEmpty() || i > 1) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.o(i, i + 1, 0, arrayList.size());
            gVar.F(arrayList);
            return gVar.r();
        }
        ArrayList arrayList4 = new ArrayList();
        JSONObject jSONObjectOptJSONObject = new JSONObject(X1.X(this.a + FishCrypto.v(C0114.m454(f90short, 1697, 111, 2875)) + str, null, e())).optJSONObject(strM175);
        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(C0101.m402(f90short, 1808, 10, 2869))) != null) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i4);
                String strM339 = C0085.m339(f90short, 1818, 8, 2307);
                String strM1 = C0001.m1(f90short, 1826, 1, 433);
                String strOptString2 = jSONObject3.optString(strM339, strM1);
                String strOptString3 = jSONObject3.optString(C0104.m414(f90short, 1827, 8, 586), strM1);
                String strOptString4 = jSONObject3.optString(C0026.m102(f90short, 1835, 11, 1202), strM1);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strOptString4);
                String strM70 = C0018.m70(f90short, 1846, 3, 3272);
                sb2.append(strM70);
                sb2.append(strOptString3);
                sb2.append(strM70);
                sb2.append(strOptString2);
                String string = sb2.toString();
                String str4 = jSONObject3.optString(C0001.m1(f90short, 1867, 10, 1217), "") + C0082.m325(f90short, 1877, 1, 1619) + jSONObject3.optString(C0049.m193(f90short, 1849, 9, 582), "") + C0142.m567(f90short, 1878, 4, 1892) + jSONObject3.optString(C0019.m75(f90short, 1858, 9, 1999), "");
                String strOptString5 = jSONObject3.optString(C0095.m379(f90short, 1882, 9, 3134), "");
                long jOptLong = jSONObject3.optLong(C0006.m21(f90short, 1891, 10, 2165), 0L);
                if (jOptLong <= 0) {
                    str3 = "";
                } else {
                    Locale locale = Locale.CHINA;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0091.m360(f90short, 1901, 11, 565), locale);
                    String strM414 = C0104.m414(f90short, 1912, 13, 2754);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone(strM414));
                    Date date = new Date(jOptLong * 1000);
                    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(strM414));
                    Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone(strM414));
                    calendar2.setTime(date);
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(C0089.m355(f90short, 1925, 5, 1019), locale);
                    simpleDateFormat2.setTimeZone(TimeZone.getTimeZone(strM414));
                    if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
                        str3 = C0049.m193(f90short, 1930, 3, 1962) + simpleDateFormat2.format(date);
                    } else {
                        Calendar calendar3 = (Calendar) calendar.clone();
                        calendar3.add(6, 1);
                        str3 = (calendar3.get(1) == calendar2.get(1) && calendar3.get(6) == calendar2.get(6)) ? C0014.m54(f90short, 1933, 3, 3150) + simpleDateFormat2.format(date) : simpleDateFormat.format(date);
                    }
                }
                arrayList4.add(new k(string, str4, strOptString5, str3));
            }
        }
        com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
        gVar2.o(1, 1, 0, arrayList4.size());
        gVar2.F(arrayList4);
        return gVar2.r();
    }

    public static void a(ArrayList arrayList, HashSet hashSet, JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject == null || jSONObject.optInt(C0135.m539(f90short, 1957, 12, 329), 0) == 1) {
            return;
        }
        String strOptString = jSONObject.optString(C0073.m288(f90short, 1973, 7, 2603), jSONObject.optString(C0117.m467(f90short, 1969, 4, 1050), ""));
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String strD = d(str, str2, str3, strOptString);
        if (hashSet.add(strD)) {
            String strOptString2 = jSONObject.optString(C0119.m473(f90short, 1985, 4, 682), jSONObject.optString(C0053.m210(f90short, 1980, 5, 1496), strOptString));
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(strOptString2)) {
                strOptString = strOptString2;
            }
            sb.append(strOptString);
            sb.append(C0017.m65(f90short, 1989, 1, 3180));
            sb.append(strD);
            arrayList.add(sb.toString());
        }
    }

    public static void b(ArrayList arrayList, HashSet hashSet, String str, String str2) {
        String strM33 = str;
        if (TextUtils.isEmpty(str2) || !hashSet.add(str2)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(strM33)) {
            strM33 = C0009.m33(f90short, 1990, 2, 2266);
        }
        sb.append(strM33);
        sb.append(C0114.m454(f90short, 1992, 1, 1717));
        sb.append(str2);
        arrayList.add(sb.toString());
    }

    public static String c(String str) {
        String strG = str;
        int iIndexOf = strG.indexOf(58);
        String strSubstring = iIndexOf > 0 ? strG.substring(0, iIndexOf) : C0076.m301(f90short, 1993, 5, 943);
        if (iIndexOf > 0) {
            strG = strG.substring(Math.min(iIndexOf + 3, strG.length()));
        }
        while (true) {
            String strM116 = C0030.m116(f90short, 1998, 1, 1824);
            if (!strG.endsWith(strM116)) {
                StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strSubstring);
                sbO.append(FishCrypto.v(C0087.m346(f90short, 1999, 91, 408)));
                sbO.append(strG);
                sbO.append(strM116);
                return sbO.toString();
            }
            strG = com.github.catvod.spider.merge.D.b.g(strG, 1, 0);
        }
    }

    public static String d(String str, String str2, String str3, String str4) {
        String strM516 = C0130.m516(f90short, 2090, 8, 2560);
        String strM277 = C0070.m277(f90short, 2098, 3, 1978);
        return com.github.catvod.spider.merge.D.b.n(com.github.catvod.spider.merge.D.b.r(strM516, str, strM277, str2, strM277), str3, strM277, str4);
    }

    public static HashMap e() {
        return com.github.catvod.spider.merge.D.b.s(C0118.m471(f90short, 2101, 10, 3033), C0106.m422(f90short, 2111, 111, 2356));
    }

    public static k f(String str, JSONObject jSONObject) {
        String strM382 = C0096.m382(f90short, 2222, 11, 561);
        String strM383 = C0096.m382(f90short, 2233, 1, 2652);
        String strOptString = jSONObject.optString(strM382, strM383);
        String strOptString2 = jSONObject.optString(C0119.m473(f90short, 2234, 8, 768), strM383);
        String strOptString3 = jSONObject.optString(C0096.m382(f90short, 2242, 8, 3122), strM383);
        StringBuilder sb = new StringBuilder();
        sb.append(strOptString);
        String strM454 = C0114.m454(f90short, 2250, 3, 736);
        sb.append(strM454);
        sb.append(strOptString2);
        sb.append(strM454);
        sb.append(strOptString3);
        String string = sb.toString();
        String strOptString4 = jSONObject.optString(C0081.m322(f90short, 2253, 10, 1673), "");
        String strOptString5 = jSONObject.optString(C0047.m186(f90short, 2263, 20, 1551), "");
        if (TextUtils.isEmpty(strOptString5)) {
            strOptString5 = jSONObject.optString(C0105.m416(f90short, 2283, 14, 979), "");
        }
        return new k(string, strOptString4, strOptString5, str);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0076.m301(f90short, 2297, 15, 3186));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0026.m102(f90short, 2312, 13, 479));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0027.m105(f90short, 2325, 11, 2046));
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
        this.a = c(FishCrypto.v(C0072.m285(f90short, 2336, 131, 3048)));
        if (str == null || str.isEmpty()) {
            return;
        }
        this.a = c(str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0106.m422(f90short, 2467, 13, 2153));
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
}

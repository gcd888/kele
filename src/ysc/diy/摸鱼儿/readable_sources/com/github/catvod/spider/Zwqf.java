package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
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
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Zwqf extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f121short = {3100, 3171, 3196, 3083, 3197, 3111, 3077, 3076, 3078, 3170, 3072, 3091, 3074, 3168, 3135, 3124, 3098, 3133, 3173, 3179, 3092, 3175, 3126, 3106, 3128, 3131, 3132, 3089, 3124, 3076, 3093, 3092, 3112, 3126, 3124, 3133, 3074, 3092, 3174, 3178, 3123, 3097, 3093, 3126, 3178, 3083, 3133, 3078, 3197, 3126, 3099, 3134, 3126, 3094, 3130, 3076, 3168, 3093, 3178, 3100, 3170, 3179, 3193, 3111, 3079, 3107, 3129, 3099, 3178, 3112, 3074, 3121, 3079, 3124, 3096, 3112, 3124, 3173, 3121, 3097, 3173, 3178, 3074, 3077, 3169, 3100, 3089, 3168, 3125, 3183, 3183, 2627, 2626, 2640, 2619, 2606, 2025, 2028, 2038, 2033, 984, 985, 1012, 1010, 997, 990, 931, 1008, 998, 994, 1009, 992, 1003, 960, 1004, 1005, 1015, 998, 1005, 1015, 931, 998, 1009, 1009, 1004, 1009, 953, 931, 458, 437, 426, 433, 499, 509, 489, 499, 495, 459, 481, 495, 450, 494, 503, 431, 503, 466, 508, 508, 431, 478, 468, 481, 493, 455, 500, 435, 477, 495, 471, 451, 461, 498, 497, 461, 467, 500, 489, 500, 492, 489, 433, 487, 497, 455, 478, 438, 445, 433, 461, 457, 508, 469, 433, 459, 503, 495, 434, 489, 466, 489, 469, 437, 483, 496, 493, 481, 435, 467, 449, 500, 489, 462, 481, 445, 469, 488, 455, 492, 456, 454, 499, 432, 487, 492, 427, 485, 483, 441, 441, 2582, 2585, 2580, 2566, 2566, 2105, 2100, 2109, 2088, 2066, 2084, 2089, 507, 502, 511, 490, 464, 481, 494, 482, 490, 508, 505, 483, 484, 1315, 1314, 1295, 1289, 1310, 1317, 1368, 1296, 1303, 1301, 1309, 1339, 1303, 1302, 1292, 1309, 1302, 1292, 1368, 1309, 1290, 1290, 1303, 1290, 1346, 1368, 3086, 3185, 3182, 3189, 3127, 3129, 3117, 3127, 3115, 3087, 3109, 3115, 3078, 3114, 3123, 3179, 3123, 3094, 3128, 3128, 3179, 3098, 3088, 3109, 3113, 3075, 3120, 3191, 3097, 3115, 3091, 3079, 3081, 3126, 3125, 3081, 3095, 3120, 3117, 3120, 3112, 3117, 3189, 3107, 3125, 3075, 3098, 3186, 3193, 3189, 3081, 3085, 3128, 3089, 3189, 3087, 3123, 3115, 3190, 3117, 3094, 3117, 3089, 3185, 3111, 3124, 3113, 3109, 3191, 3095, 3077, 3120, 3117, 3082, 3109, 3193, 3089, 3116, 3075, 3112, 3084, 3074, 3127, 3188, 3107, 3112, 3183, 3105, 3111, 3197, 3197, 2375, 2370, 2392, 2399, 450, 451, 494, 488, 511, 452, 441, 497, 502, 500, 508, 463, 496, 509, 508, 502, 474, 502, 503, 493, 508, 503, 493, 441, 508, 491, 491, 502, 491, 419, 441, 620, 621, 639, 532, 513, 1691, 1764, 1787, 1762, 1689, 1772, 1686, 1725, 1773, 1683, 1680, 1689, 1677, 1767, 1696, 1699, 1669, 1726, 1691, 1687, 1693, 1719, 1726, 1676, 1720, 1693, 1699, 1709, 1664, 1702, 1762, 1688, 1764, 1715, 1668, 1760, 1767, 1767, 1708, 1665, 1702, 1699, 1764, 1712, 1767, 1722, 1711, 1669, 1699, 1690, 1689, 1665, 1727, 1683, 1761, 1715, 1698, 1711, 1716, 1772, 1680, 1684, 1714, 1689, 1682, 1714, 1723, 1708, 1699, 1696, 1761, 1772, 1713, 1702, 1712, 1697, 1720, 1700, 1708, 1772, 1692, 1694, 1764, 1690, 1766, 1766, 1698, 1700, 1698, 1768, 1768, 1709, 1746, 1741, 1755, 1676, 1709, 1679, 1745, 1740, 1678, 1708, 1750, 1679, 1686, 1744, 1700, 1685, 1678, 1744, 1673, 1717, 1751, 1721, 1721, 1689, 1689, 1666, 1744, 1716, 1707, 1680, 1697, 1719, 1740, 1698, 1721, 1677, 1719, 1714, 1708, 1674, 1668, 1673, 1708, 1714, 1673, 1740, 1718, 1745, 1686, 1706, 1669, 1748, 1664, 1749, 1678, 1716, 1678, 1723, 1715, 1755, 1744, 1682, 1672, 1664, 1686, 1708, 1755, 1718, 1755, 1755, 1687, 1700, 1696, 1716, 1703, 1708, 1671, 1678, 1707, 1718, 1719, 1736, 1666, 1672, 1719, 1715, 1681, 1698, 1758, 1758, 3326, 3321, 3303, 3287, 3270, 3285, 3284, 3266, 1973, 1972, 1945, 1951, 1928, 1971, 1998, 1950, 1922, 1935, 1943, 1931, 1948, 1965, 1921, 1920, 1946, 1931, 1920, 1946, 1998, 1931, 1948, 1948, 1921, 1948, 2004, 1998, 2626, 2621, 2594, 2621, 2617, 2657, 2682, 2645, 2671, 2649, 2639, 2635, 2631, 2686, 2660, 2682, 2685, 2685, 2618, 2595, 2644, 2662, 2655, 2680, 2666, 2670, 2677, 2666, 2627, 2631, 2653, 2670, 2620, 2631, 2624, 2677, 2684, 2656, 2629, 2654, 2683, 2622, 2639, 2627, 2623, 2663, 2618, 2662, 2652, 2678, 2630, 2659, 2638, 2684, 2658, 2650, 2613, 2624, 2648, 2671, 2599, 2655, 2613, 2649, 2633, 2666, 2655, 2646, 2595, 2670, 2677, 2651, 2685, 2658, 2682, 2671, 2595, 2665, 2624, 2634, 2619, 2631, 2627, 2639, 2627, 2622, 2664, 2654, 2683, 2609, 2609, 2945, 2944, 2962, 3065, 3052, 1643, 1646, 1652, 1651, 2328, 2305, 2314, 2353, 2311, 2314, 2869, 2860, 2855, 2844, 2861, 2850, 2862, 2854, 1034, 1043, 1048, 1059, 1036, 1045, 1055, 2499, 2522, 2513, 2538, 2503, 2512, 2520, 2516, 2503, 2526, 2502, 2914, 2939, 2928, 2891, 2925, 2929, 2933, 2918, 2867, 2858, 2849, 2842, 2852, 2871, 2848, 2852, 2283, 2290, 2297, 2242, 2300, 2302, 2281, 2290, 2287, 1289, 1296, 1307, 1312, 1307, 1302, 1293, 1306, 1308, 1291, 1296, 1293, 506, 483, 488, 467, 495, 483, 482, 504, 489, 482, 504, 2007, 2010, 2003, 1990, 2044, 1997, 1986, 1998, 1990, 3069, 3044, 3055, 3028, 3067, 3047, 3050, 3058, 3028, 3053, 3065, 3044, 3046, 2040, 2017, 2026, 2001, 2046, 2018, 2031, 2039, 2001, 2043, 2044, 2018, 2400, 2401, 2380, 2378, 2397, 2406, 2331, 2399, 2398, 2383, 2394, 2386, 2391, 2424, 2388, 2389, 2383, 2398, 2389, 2383, 2331, 2398, 2377, 2377, 2388, 2377, 2305, 2331, 507, 388, 411, 473, 479, 486, 453, 504, 471, 450, 508, 487, 451, 454, 499, 485, 484, 487, 466, 495, 384, 460, 502, 474, 389, 487, 451, 467, 479, 504, 448, 387, 449, 385, 384, 396, 454, 504, 495, 502, 505, 505, 384, 460, 396, 474, 466, 396, 493, 466, 473, 498, 387, 414, 463, 497, 470, 493, 479, 453, 480, 414, 484, 463, 510, 478, 410, 481, 496, 471, 448, 479, 485, 451, 492, 460, 477, 463, 455, 511, 465, 474, 511, 386, 467, 498, 506, 482, 484, 392, 392, 2902, 2857, 2870, 2900, 2863, 2942, 2929, 2914, 2867, 2891, 2859, 2891, 2903, 2911, 2892, 2897, 2899, 2889, 2860, 2912, 2926, 2940, 2890, 2900, 2862, 2900, 2943, 2889, 2920, 2858, 2859, 2927, 2906, 2860, 2881, 2921, 2914, 2860, 2922, 2849, 2920, 2940, 2882, 2906, 2942, 2863, 2914, 2930, 
    2905, 2880, 2900, 2921, 2940, 2927, 2927, 2867, 2907, 2928, 2889, 2894, 2889, 2862, 2899, 2940, 2926, 2911, 2929, 2923, 2891, 2920, 2905, 2935, 2926, 2859, 2937, 2911, 2858, 2939, 2900, 2906, 2929, 2909, 2897, 2859, 2909, 2858, 2901, 2892, 2943, 2853, 2853, 775, 888, 871, 891, 798, 817, 776, 816, 807, 804, 769, 798, 892, 889, 805, 815, 768, 806, 815, 799, 892, 778, 779, 819, 773, 807, 805, 827, 816, 801, 803, 806, 776, 800, 800, 783, 870, 784, 784, 776, 779, 800, 829, 888, 828, 813, 787, 804, 779, 774, 772, 828, 775, 770, 801, 808, 891, 814, 792, 784, 784, 828, 831, 775, 801, 893, 831, 889, 870, 880, 805, 778, 792, 880, 829, 808, 881, 813, 891, 811, 891, 797, 895, 829, 779, 814, 880, 891, 792, 884, 884, 1962, 1967, 1973, 1970, 3092, 3093, 3128, 3134, 3113, 3090, 3183, 3116, 3118, 3131, 3114, 3112, 3104, 3133, 3126, 3084, 3104, 3105, 3131, 3114, 3105, 3131, 3183, 3114, 3133, 3133, 3104, 3133, 3189, 3183, 1887, 1862, 1869, 1910, 1856, 1869, 2380, 2389, 2398, 2405, 2388, 2395, 2391, 2399, 3276, 3285, 3294, 3301, 3274, 3283, 3289, 1489, 1480, 1475, 1528, 1493, 1474, 1482, 1478, 1493, 1484, 1492, 964, 3099, 1358, 1329, 1326, 1402, 1366, 1384, 1368, 1391, 1401, 1382, 1379, 1402, 1357, 1328, 1391, 1345, 1394, 1399, 1364, 1327, 1336, 1332, 1331, 1350, 1360, 1401, 1381, 1353, 1336, 1329, 1350, 1377, 1368, 1356, 1390, 1336, 1402, 1364, 1335, 1355, 1333, 1396, 1333, 1386, 1331, 1348, 1361, 1335, 1347, 1333, 1390, 1331, 1353, 1351, 1380, 1367, 1349, 1385, 1363, 1354, 1357, 1335, 1360, 1399, 1359, 1347, 1360, 1391, 1388, 1345, 1349, 1362, 1361, 1378, 1360, 1328, 1349, 1355, 1332, 1351, 1383, 1380, 1389, 1336, 1337, 1328, 1402, 1370, 1361, 1341, 1341, 1831, 1880, 1863, 1807, 1853, 1822, 1818, 1850, 1818, 1802, 1832, 1835, 1795, 1843, 1883, 1839, 1884, 1825, 1885, 1829, 1798, 1851, 1804, 1855, 1854, 1830, 1854, 1858, 1809, 1829, 1834, 1818, 1795, 1794, 1824, 1809, 1822, 1834, 1840, 1852, 1802, 1817, 1800, 1882, 1793, 1882, 1792, 1838, 1872, 1854, 1835, 1852, 1883, 1880, 1834, 1843, 1881, 1793, 1794, 1796, 1807, 1886, 1835, 1843, 1881, 1855, 1836, 1832, 1881, 1807, 1828, 1852, 1827, 1851, 1848, 1818, 1882, 1862, 1852, 1830, 1882, 1826, 1851, 1793, 1850, 1886, 1803, 1840, 1808, 1798, 1881, 1795, 1843, 1835, 1873, 1872, 1819, 1826, 1792, 1824, 1796, 1884, 1862, 1807, 1827, 1805, 1798, 1852, 1826, 1795, 1829, 1824, 1799, 1817, 1841, 1838, 1826, 1799, 1858, 1821, 1884, 1817, 1804, 1884, 1819, 1854, 1796, 1798, 1887, 1886, 1795, 1855, 1818, 1837, 1834, 1854, 1819, 1850, 1843, 1843, 1830, 1792, 1805, 1822, 1803, 1835, 1805, 1811, 1839, 1862, 1794, 1829, 1832, 1876, 1876, 1457, 1486, 1489, 1429, 1457, 1462, 1470, 1465, 1482, 1432, 1450, 1436, 1460, 1462, 1487, 1463, 1486, 1468, 1484, 1492, 1431, 1432, 1465, 1431, 1452, 1461, 1482, 1434, 1463, 1445, 1492, 1430, 1451, 1450, 1468, 1453, 1485, 1487, 1434, 1421, 1437, 1483, 1429, 1462, 1481, 1429, 1420, 1436, 1428, 1483, 1434, 1483, 1488, 1428, 1449, 1448, 1481, 1425, 1449, 1461, 1469, 1426, 1429, 1447, 1418, 1433, 1450, 1437, 1462, 1483, 1464, 1427, 1414, 1426, 1423, 1421, 1445, 1422, 1459, 1468, 1438, 1437, 1430, 1461, 1433, 1422, 1486, 1487, 1470, 1474, 1474, 501, 503, 482, 499, 497, 505, 484, 495, 469, 505, 504, 482, 499, 504, 482, 1828, 1829, 1844, 1825, 1833, 1836, 1795, 1839, 1838, 1844, 1829, 1838, 1844, 1378, 1381, 1383, 1391, 1353, 1381, 1380, 1406, 1391, 1380, 1406, 1673, 1678, 1676, 1668, 1719, 1672, 1669, 1668, 1678, 1698, 1678, 1679, 1685, 1668, 1679, 1685, 3117, 3080, 3191, 3176, 3112, 3077, 3077, 3127, 3111, 3080, 3190, 3135, 3080, 3185, 3075, 3111, 3119, 3100, 3113, 3106, 3104, 3185, 3117, 3122, 3177, 3076, 3189, 3095, 3079, 3079, 3113, 3126, 3191, 3119, 3094, 3095, 3135, 3186, 3122, 3090, 3187, 3108, 3112, 3083, 3111, 3074, 3120, 3083, 3117, 3190, 3106, 3181, 3198, 3116, 3118, 3185, 3088, 3118, 3079, 3115, 3084, 3073, 3105, 3091, 3089, 3106, 3076, 3189, 3132, 3111, 3103, 3114, 3086, 3093, 3088, 3117, 3085, 3093, 3123, 3198, 3079, 3199, 3090, 3105, 3090, 3075, 3190, 3186, 3073, 3105, 3195, 3195, 3287, 3240, 3255, 3315, 3287, 3280, 3288, 3295, 3244, 3326, 3276, 3322, 3282, 3280, 3241, 3281, 3240, 3290, 3242, 3250, 3313, 3326, 3295, 3313, 3274, 3283, 3244, 3324, 3281, 3267, 3250, 3312, 3277, 3276, 3290, 3275, 3243, 3241, 3324, 3307, 3323, 3245, 3315, 3280, 3247, 3315, 3306, 3322, 3314, 3245, 3324, 3245, 3254, 3314, 3279, 3278, 3247, 3319, 3279, 3283, 3291, 3316, 3315, 3265, 3308, 3327, 3276, 3323, 3280, 3245, 3294, 3317, 3296, 3316, 3305, 3307, 3267, 3304, 3285, 3290, 3320, 3323, 3312, 3283, 3327, 3304, 3240, 3241, 3288, 3236, 3236, 2699, 2698, 2727, 2721, 2742, 2701, 2800, 2745, 2750, 2745, 2724, 2800, 2751, 2747, 1332, 1320, 1317, 1341, 1313, 1334, 1287, 1323, 1322, 1328, 1313, 1322, 1328, 2395, 2381, 2377, 2394, 2379, 2368, 2411, 2375, 2374, 2396, 2381, 2374, 2396};
    public String a;
    public String b;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = b(JsonParser.parseString(X1.X(a(FishCrypto.v("N1.Y/uWVT0RAP2mfHo79F5dpjinCfVGFzdfoPF48aKGd8YoT/dIldDhV2G8N09+uUqkI8zPcUfJzf7cK78PW3NC2g==") + URLEncoder.encode(str, "UTF-8")), null, c())).getAsJsonObject(), "list").iterator();
            while (it.hasNext()) {
                arrayList.add(e(((JsonElement) it.next()).getAsJsonObject()));
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[Zwqf] searchContent error: "));
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            JsonObject asJsonObject = JsonParser.parseString(X1.X(a(FishCrypto.v("N1.5wymwkOekFjs+sVxx+ZPeiCp7YkSGIvuIWpmphm5cuCZ295IMxQ5Osk6mVmQ1gtie7WEpmJe9QlChLBw4ch/ag==")), null, c())).getAsJsonObject();
            Iterator it = b(asJsonObject, "class").iterator();
            while (it.hasNext()) {
                JsonObject asJsonObject2 = ((JsonElement) it.next()).getAsJsonObject();
                String strD = d(asJsonObject2, "type_id");
                String strD2 = d(asJsonObject2, "type_name");
                if (!TextUtils.isEmpty(strD) && !TextUtils.isEmpty(strD2)) {
                    arrayList.add(new com.github.catvod.spider.merge.p001b.b(strD, strD2, null));
                }
            }
            Iterator it2 = b(asJsonObject, "list").iterator();
            while (it2.hasNext()) {
                arrayList2.add(e(((JsonElement) it2.next()).getAsJsonObject()));
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[Zwqf] homeContent error: "));
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, arrayList2);
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = b(JsonParser.parseString(X1.X(a(FishCrypto.v("N1.5wymwkOekFjs+sVxx+ZPeiCp7YkSGIvuIWpmphm5cuCZ295IMxQ5Osk6mVmQ1gtie7WEpmJe9QlChLBw4ch/ag==")), null, c())).getAsJsonObject(), "list").iterator();
            while (it.hasNext()) {
                arrayList.add(e(((JsonElement) it.next()).getAsJsonObject()));
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[Zwqf] homeVideoContent error: "));
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strM402 = "UTF-8";
        try {
            JsonObject asJsonObject = JsonParser.parseString(X1.X(a(FishCrypto.v("N1.7L9Ch8FELX2uvPkNBHbkYmHvxUs7M1fQ522yTsv1e2ozPvOLTjF4fwza9EAgLGgnyvu49dsetmqy9IK1O33wqw==") + URLEncoder.encode(str, strM402) + FishCrypto.v("N1.8oNl2/mO5lu3Gvm3jV4ZZzza3WHsBT/AZnTQOigjOQj/U2uIf7c6mWmXP83qkcuO8U88tGCWDOdmHUT+akTPrA==") + URLEncoder.encode(str2, strM402)), null, c())).getAsJsonObject();
            String strD = d(asJsonObject, "url");
            String strM249 = "parse";
            int asInt = 0;
            if (asJsonObject != null && asJsonObject.has(strM249) && !asJsonObject.get(strM249).isJsonNull()) {
                try {
                    asInt = asJsonObject.get(strM249).getAsInt();
                } catch (Exception unused) {
                }
            }
            String strI = AbstractC0280n1.i(str, str2, null, null);
            if (!TextUtils.isEmpty(strD)) {
                com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.C(strD);
                gVar.q(asInt);
                gVar.b(strI);
                return gVar.r();
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[Zwqf] playerContent error: "));
        }
        com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
        gVar2.q(1);
        gVar2.C(str2);
        return gVar2.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        try {
            String str = list.get(0);
            JsonArray jsonArrayB = b(JsonParser.parseString(X1.X(a(FishCrypto.v("N1.15mvYcUCGKrhvqq6/XjStfbyfOKQb0KLyplIRw2CO3k6jPzJoBpnV9LTc+S9UEfSZ/byWqnvc/eLF7KOCO2dRw==") + URLEncoder.encode(str, "UTF-8")), null, c())).getAsJsonObject(), "list");
            if (jsonArrayB.size() > 0) {
                JsonObject asJsonObject = jsonArrayB.get(0).getAsJsonObject();
                String strD = d(asJsonObject, "vod_id");
                String strD2 = d(asJsonObject, "vod_name");
                String strD3 = d(asJsonObject, "vod_pic");
                String strD4 = d(asJsonObject, "vod_remarks");
                String strD5 = d(asJsonObject, "vod_year");
                String strD6 = d(asJsonObject, "vod_area");
                String strD7 = d(asJsonObject, "vod_actor");
                String strD8 = d(asJsonObject, "vod_director");
                String strD9 = d(asJsonObject, "vod_content");
                String strD10 = d(asJsonObject, "type_name");
                String strD11 = d(asJsonObject, "vod_play_from");
                String strD12 = d(asJsonObject, "vod_play_url");
                k kVar = new k();
                if (!TextUtils.isEmpty(strD)) {
                    str = strD;
                }
                kVar.n(str);
                kVar.o(strD2);
                kVar.p(strD3);
                kVar.s(strD4);
                kVar.u(strD5);
                kVar.k(strD6);
                kVar.j(strD7);
                kVar.m(strD8);
                kVar.l(strD9);
                kVar.i(strD10);
                kVar.q(strD11);
                kVar.r(strD12);
                AbstractC0280n1.p(strD2);
                AbstractC0280n1.q(strD12);
                return com.github.catvod.spider.merge.p001b.g.s(kVar);
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[Zwqf] detailContent error: "));
        }
        return AbstractC0449a.b();
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(FishCrypto.v("N1.ljSpMbwIRvsFPQRgZ5yCo0RvfjMu6t459sMZCLL5y9og9XglG6+zDcXjpU+QzKk/TEbujPvYyhzrJdoJ7fGOWQ=="));
            sb.append(str);
            sb.append(FishCrypto.v("N1.L7fiz+S3SOGTIKQ4xvdRL6LgQp23wB4Yqz4r9pdZBf7zjAXLqdww+ChQVQ6KdvGisSpAov3aG2cLBiEI3E2MTg=="));
            sb.append(str2);
            if (map != null && !map.isEmpty()) {
                String json = new Gson().toJson(map);
                sb.append(FishCrypto.v("N1.2WxAynmHW50lfIofV5CBzLnlryhjoAiiF/YYABit1udZmBOMuNKha2gQYYuvNh4v0/9lCQ9ta8d2b2T6tBg92Q=="));
                sb.append(Base64.encodeToString(json.getBytes(), 2));
            }
            Iterator it = b(JsonParser.parseString(X1.X(a(sb.toString()), null, c())).getAsJsonObject(), "list").iterator();
            while (it.hasNext()) {
                arrayList.add(e(((JsonElement) it.next()).getAsJsonObject()));
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[Zwqf] categoryContent error: "));
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    public static JsonArray b(JsonObject jsonObject, String str) {
        if (jsonObject == null || !jsonObject.has(str) || jsonObject.get(str).isJsonNull()) {
            return new JsonArray();
        }
        try {
            return jsonObject.get(str).getAsJsonArray();
        } catch (Exception unused) {
            return new JsonArray();
        }
    }

    public static String d(JsonObject jsonObject, String str) {
        return (jsonObject == null || !jsonObject.has(str) || jsonObject.get(str).isJsonNull()) ? "" : jsonObject.get(str).getAsString();
    }

    public static k e(JsonObject jsonObject) {
        return new k(d(jsonObject, "vod_id"), d(jsonObject, "vod_name"), d(jsonObject, "vod_pic"), d(jsonObject, "vod_remarks"));
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(this.a)) {
            return "";
        }
        String str2 = this.a;
        String strM454 = "?";
        if (str2.contains(strM454)) {
            strM454 = "&";
        }
        return com.github.catvod.spider.merge.D.b.n(new StringBuilder(), this.a, strM454, str);
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        map.put(FishCrypto.v("N1.zVhXoyfczM0oArwT/843FPyeI81FaXLn8zT7K5t5j3DQ7C5n3IGdWEiSJM7PwOCPolAERQbP0EK4Ggdm890zZQ=="), FishCrypto.v("N1.fTwsSscABjZ2F5H4LoReVWOW+xLCsjkIxwCYUcpa3h3iG9WBU21CZ0hkmf7BZ0VEA0fMUJRQs3/UO3KRhS7bYyo0jZB89rKiIm5/fJdoUKjLInpXGKn+t5pe5rWmo67jVsDCWrSZZOidwbBdzF/kLA=="));
        if (!TextUtils.isEmpty(this.b)) {
            map.put(FishCrypto.v("N1.jNIAF5gUcKI0H1C3+hgFhSJ5eHZ+iTUCR20erb4jI6jsck4e4/kVW6nVJBmjXufUbI4GlymprZqLCabiJfq10A=="), this.b);
        }
        return map;
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
        super.init(context, str);
        if (!TextUtils.isEmpty(str)) {
            String strTrim = str.trim();
            if (strTrim.startsWith("{")) {
                try {
                    JsonObject asJsonObject = JsonParser.parseString(strTrim).getAsJsonObject();
                    this.a = d(asJsonObject, FishCrypto.v("N1.nCCqaN0yN7EaiZodf7kt/B3QAAop1iPQy4tT5bnMaDvMk0d+8jh7VhAmJGgUWdB3zaYlHSVkKSu8A9TgTE04Gg=="));
                    this.b = d(asJsonObject, FishCrypto.v("N1.jNIAF5gUcKI0H1C3+hgFhSJ5eHZ+iTUCR20erb4jI6jsck4e4/kVW6nVJBmjXufUbI4GlymprZqLCabiJfq10A=="));
                } catch (Exception unused) {
                    this.a = strTrim;
                }
            } else {
                this.a = strTrim;
            }
        }
        SpiderDebug.log("[Zwqf] init ok");
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

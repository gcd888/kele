package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.HonHon;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0282o0;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.RunnableC0240a0;
import com.github.catvod.spider.merge.A.X0;
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
import com.github.catvod.spider.merge.f0.i;
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
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class HonHon extends Spider {
    public volatile LinkedHashMap b;
    public volatile long c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f51short = {1876, 1487, 1486, 1484, 1497, 1535, 1492, 1487, 1476, 1473, 1497, 2574, 2572, 2567, 2587, 2572, 2733, 2728, 2732, 2728, 2741, 541, 610, 637, 564, 536, 571, 574, 554, 532, 519, 632, 609, 539, 537, 636, 612, 523, 549, 615, 537, 543, 609, 522, 613, 610, 535, 512, 550, 567, 611, 613, 533, 572, 548, 574, 546, 517, 512, 550, 567, 550, 544, 611, 514, 564, 532, 561, 542, 528, 612, 538, 514, 539, 547, 553, 569, 529, 569, 632, 636, 573, 546, 615, 535, 611, 535, 562, 538, 543, 569, 513, 632, 619, 516, 553, 569, 608, 553, 535, 613, 535, 517, 565, 545, 614, 543, 608, 538, 548, 622, 622, 3004, 2983, 2976, 3005, 3003, 2960, 3007, 2979, 2990, 2998, 423, 472, 455, 472, 426, 410, 390, 395, 447, 391, 477, 414, 450, 426, 384, 415, 478, 396, 415, 401, 399, 401, 391, 395, 433, 429, 424, 447, 392, 464, 394, 441, 403, 411, 445, 386, 395, 416, 444, 397, 465, 435, 386, 435, 465, 444, 474, 447, 399, 427, 479, 446, 432, 426, 390, 415, 387, 416, 392, 473, 408, 441, 428, 473, 430, 397, 418, 428, 399, 387, 397, 479, 409, 418, 414, 426, 399, 390, 399, 387, 479, 422, 444, 415, 427, 410, 464, 474, 424, 468, 468, 2226, 2239, 2225, 2210, 2228, 1792, 1815, 1809, 1821, 1823, 1823, 1815, 1820, 1814, 1780, 1788, 1738, 1766, 1776, 1767, 1788, 1776, 1766, 29773, 20935, 791, 19818, 26181, 19882, 26128, 28314, 21462, 262, 25113, -32031, 1290, 1282, 29350, 22316, 1532, 1404, 23650, 19265, 24827, 25692, 25674, 26589, 26190, 25725, 20945, 24934, 22777, 21016, -27798, -27869, 25690, 24385, 32154, -900, -30585, 31101, 22398, 20807, 26304, -24937, -24716, 21921, -30596, 23283, 21719, 27273, -2035, -29450, -26932, 25265, -30502, 22116, -2310, 2955, 2956, 2957, 2955, 2956, 2957, 3004, 2960, 2950, 2946, 2961, 2944, 2955, 823, 816, 817, 823, 816, 817, 768, 823, 822, 812, 811, 816, 813, 806, 768, 828, 819, 826, 830, 813, 799, 864, 895, 793, 774, 829, 771, 801, 805, 818, 870, 779, 804, 873, 828, 822, 830, 865, 825, 771, 798, 774, 769, 795, 807, 826, 816, 776, 794, 786, 803, 794, 865, 799, 787, 792, 866, 868, 790, 807, 826, 804, 776, 827, 822, 788, 799, 823, 819, 818, 808, 825, 819, 816, 821, 872, 816, 894, 829, 800, 797, 868, 786, 894, 871, 797, 799, 794, 872, 827, 790, 776, 821, 818, 816, 818, 769, 770, 890, 828, 890, 794, 809, 865, 798, 829, 797, 775, 768, 876, 876, 26322, 26433, -30328, 28221, 24461, -29996, 26575, -28042, -27463, 25728, 24861, 1197, 1211, 1196, 1207, 1211, 1197, 1153, 1207, 1210, 1854, 1849, 1848, 1854, 1849, 1848, 1801, 1829, 1843, 1847, 1828, 1845, 1854, 3099, 3100, 3101, 3099, 3100, 3101, 3116, 3099, 3098, 3072, 3079, 3100, 3073, 3082, 3116, 3088, 3103, 3094, 3090, 3073, 2044, 1923, 1948, 2007, 2037, 2040, 2015, 2013, 1989, 1994, 1923, 2022, 2008, 1923, 2021, 1924, 2033, 2043, 2022, 2017, 2033, 2020, 2015, 1920, 2047, 2044, 2024, 2047, 1931, 2026, 1991, 2027, 2021, 2026, 2003, 1985, 2001, 2015, 2026, 2008, 2016, 2037, 1990, 2007, 2010, 2012, 2021, 2019, 1995, 2000, 1985, 2000, 2006, 2020, 2047, 1945, 1988, 2000, 1924, 2004, 1926, 2022, 2042, 2010, 1986, 2043, 1995, 2047, 2011, 2018, 1926, 1995, 2012, 1926, 2045, 2019, 2014, 2044, 1923, 1945, 2038, 2036, 2007, 2038, 2041, 1922, 2045, 1931, 1989, 1935, 1935, 615, 623, 638, 619, 891, 878, 887, 877, 881, 890, 891, 877, 2478, 2483, 2478, 2486, 2495, 30388, 30388, 32763, 23153, 681, 677, 700, 687, 696, 1222, 1217, 1236, 1217, 1216, 1222, 1446, 1329, 1446, 1068, 1081, 1056, 1082, 1062, 1069, 1068, 1046, 1066, 1063, 1085, -25319, 2848, 2850, 2871, 2854, 2852, 2860, 2865, 2874, 752, 767, 752, 3076, 3075, 3097, 3103, 3074, 1784, 1791, 1781, 1780, 1769, 1733, 1748, 1747, 1728, 1749, 1736, 1742, 1743, 1790, 1740, 1746, 3106, 3123, 3124, 3111, 3122, 3119, 3113, 3112, 3070, 3051, 3062, 3052, 3049, 3014, 3056, 3069, 2014, 1987, 2002, 2010, 2024, 2014, 2003, 2136, 2119, 2122, 29401, -27163, 775, -29635, 28725, 21951, 24922, 25144, 24785, 25232, 25461, 25318, 20712, 20632, 592, 1067, 1066, 1058, 1066, 1098, 1086, 1086, 1086, 1069, 1064, 1066, 1098, 1086, 1086, 1086, 1071, 1070, 1066, 1098, 1086, 1086, 1086, 1070, 1058, 1066, 1098, 1086, 1086, 1086, 1065, 1068, 1066, 1098, 730, 730, 730, -29283, 29077, 21535, 24826, 25496, 21911, 25301, 25414, 21630, -28482, 30368, 21899, 30520, 30520, 23549, -24740, 30348, 23149, 1566, 1561, 1560, 1566, 1561, 1560, 1577, 1541, 1555, 1559, 1540, 1557, 1566, 1068, 1067, 1066, 1068, 1067, 1066, 1051, 1068, 1069, 1079, 1072, 1067, 1078, 1085, 1051, 1063, 1064, 1057, 1061, 1078, 796, 793, 797, 793, 772, 1862, 1885, 1882, 1863, 1857, 1898, 1861, 1881, 1876, 1868, 3323, 3321, 3314, 3310, 3321, 1413, 1422, 1436, 697, 687, 683, 696, 681, 674, 661, 674, 675, 697, 702, 677, 696, 691, 2175, 2148, 2159, 2154, 2162, 2400, 2335, 2304, 2377, 2405, 2374, 2371, 2391, 2409, 2426, 2309, 2332, 2406, 2404, 2305, 2329, 2422, 2392, 2330, 2404, 2402, 2332, 2423, 2328, 2335, 2410, 2429, 2395, 2378, 2334, 2328, 2408, 2369, 2393, 2371, 2399, 2424, 2429, 2395, 2378, 2395, 2397, 2334, 2431, 2377, 2409, 2380, 2403, 2413, 2329, 2407, 2431, 2406, 2398, 2388, 2372, 2412, 2372, 2309, 2305, 2368, 2399, 2330, 2410, 2334, 2410, 2383, 2407, 2402, 2372, 2428, 2309, 2326, 2425, 2388, 2372, 2333, 2388, 2410, 2328, 2410, 2424, 2376, 2396, 2331, 2402, 2333, 2407, 2393, 2323, 2323, 2849, 2848, 2850, 2871, 2833, 2874, 2849, 2858, 2863, 2871, 1565, 1553, 1555, 1559, 1565, 1569, 1548, 1563, 1565, 1553, 1555, 1555, 1563, 1552, 1562, 2234, 2231, 2233, 2218, 2236, 1379, 1308, 1283, 1308, 1390, 1374, 1346, 1359, 1403, 1347, 1305, 1370, 1286, 1390, 1348, 1371, 1306, 1352, 1371, 1365, 1355, 1365, 1347, 1359, 1397, 1385, 1388, 1403, 1356, 1300, 1358, 1405, 1367, 1375, 1401, 1350, 1359, 1380, 1400, 1353, 1301, 1399, 1350, 1399, 1301, 1400, 1310, 1403, 1355, 1391, 1307, 1402, 1396, 1390, 1346, 1371, 1351, 1380, 1356, 1309, 1372, 1405, 1384, 1309, 1386, 1353, 1382, 1384, 1355, 1351, 1353, 
    1307, 1373, 1382, 1370, 1390, 1355, 1346, 1355, 1351, 1307, 1378, 1400, 1371, 1391, 1374, 1300, 1310, 1388, 1296, 1296, 930, 949, 947, 959, 957, 957, 949, 958, 948, 2743, 2736, 2731, 3094, 3098, 3097, 3097, 3088, 3094, 3073, 707, 715, 765, 721, 711, 720, 715, 711, 721, 2815, 2803, 2801, 2805, 2815, 2755, 2799, 2809, 2798, 2805, 2809, 2799, 665, 670, 645, 686, 642, 658, 670, 643, 660, 3160, 3140, 3161, 3167, 865, 870, 893, 854, 874, 870, 869, 869, 876, 874, 893, 1366, 1354, 1351, 1359, 1351, 2512, 2502, 2519, 2519, 2506, 2509, 2500, 2904, 2907, 2905, 2897, 2909, 2888, 2901, 2895, 2900, 2910, 3296, 3298, 3305, 3299, 3298, 3317, 1449, 1452, 1460, 1470, 263, 256, 277, 256, 257, 263, 640, 767, 736, 645, 645, 664, 662, 676, 665, 702, 655, 644, 698, 668, 765, 652, 764, 649, 696, 649, 763, 665, 664, 678, 682, 767, 644, 647, 765, 664, 680, 646, 646, 767, 652, 763, 645, 641, 667, 741, 681, 645, 676, 695, 664, 673, 645, 700, 760, 647, 675, 681, 643, 701, 741, 682, 674, 667, 664, 697, 665, 673, 665, 660, 668, 697, 697, 698, 644, 666, 692, 760, 699, 697, 652, 741, 767, 660, 761, 646, 646, 697, 698, 737, 684, 670, 664, 666, 655, 755, 755, 2674, 2671, 2686, 2678, 2664, 1476, 1475, 1474, 1476, 1475, 1474, 1523, 1503, 1481, 1485, 1502, 1487, 1476, 25263, 31633, 30737, 30737, 22414, 29216, 27819, 30101, 22209, 23063, 22994, 23345, 23365, 3243, 3244, 3245, 3243, 3244, 3245, 3228, 3248, 3238, 3234, 3249, 3232, 3243, 2252, 2240, 2248, 2216, 2896, 2901, 2899, 2867, 1768, 1769, 1761, 1769, 1673, 1890, 1895, 1893, 1797, 2920, 2921, 2925, 2829, 1838, 1826, 1834, 1898, 2838, 2835, 2837, 2901, 1222, 1223, 1231, 1223, 1159, 2562, 2567, 2565, 2629, 1636, 1637, 1633, 1569, 1671, 1692, 1691, 1670, 1664, 1707, 1668, 1688, 1685, 1677, 29887, 20789, 790, 794, 792, 796, 790, 810, 774, 784, 775, 796, 784, 774, 28073, 20709, 2631, 2639, 2681, 2645, 2627, 2644, 2639, 2627, 2645, 2702, 2694, 32034, 22696, 960, 987, 976, 981, 973, 17727, 28176, 17919, 28229, 856, 852, 854, 850, 856, 868, 841, 862, 856, 852, 854, 854, 862, 853, 863, 26051, 22671, 26944, -30280, 1774, 1769, 1778, 29497, 26489, 27208, 1749, 1758, 1740, 25356, 21723, 28448, 1902, 1890, 1889, 1889, 1896, 1902, 1913, -25342, 25324, -32235, 599, 577, 581, 598, 583, 588, 635, 588, 589, 599, 592, 587, 598, 605, 28246, 30568, 22988, 22968, 1226, 1227, 1219, 1227, 1163, -28906, 21449, 32312, 29784, 1217, 1156, 1177, 1173, 1217, 19148, -27220, 31631, 1217, 1161, 1166, 1170, 1173, 3288, 3287, 3201, 3284, 3293, 3210, 1444, 1458, 1445, 1470, 1458, 1444, 1416, 1470, 1459, 2671, 2682, 2663, 2685, 2680, 2647, 2657, 2668, 2721, 2748, 2733, 2725, 2711, 2721, 2732, 1129, 1142, 1147, 1471, 1464, 1458, 1459, 1454, 1540, 1557, 1554, 1537, 1556, 1545, 1551, 1550, 1326, 1343, 1336, 1323, 1342, 1315, 1317, 1316, 1301, 1319, 1337, 1659, 1663, 1637, 1637, 1663, 1656, 1649, 1590, 1651, 1638, 1663, 1637, 1657, 1650, 1651, 1590, 1663, 1650, 1022, 1014, 1003, 1007, 994, 955, 1022, 1003, 1010, 1000, 1012, 1023, 1022, 955, 1007, 1012, 1008, 1022, 1013, 2197, 2179, 2196, 2191, 2179, 2197, 2233, 2191, 2178, 2866, 2855, 2874, 2848, 2853, 2826, 2876, 2865, 1287, 1306, 1291, 1283, 1329, 1287, 1290, 2490, 2469, 2472, 1468, 1467, 1457, 1456, 1453, 1837, 1852, 1851, 1832, 1853, 1824, 1830, 1831, 1814, 1828, 1850, 1727, 1712, 1766, 1715, 1722, 1773, 1036, 825, 805, 805, 801, 875, 894, 894, 2110, 2082, 2082, 2086, 2085, 2156, 2169, 2169, 3009, 3010, 3022, 3020, 3009, 3013, 3010, 3038, 3033, 2699, 2696, 2701, 2708, 2698, 2708, 2698, 2708, 2699, 1353, 1353, 1346, 924, 1021, 1021, 1014, 922, 1623, 1611, 1611, 1615, 1612, 1810, 1806, 1806, 1802, 2360, 2367, 2343, 2352, 2365, 2360, 2357, 2417, 2361, 2366, 2338, 2341, 863, 841, 862, 837, 841, 863, 883, 837, 840, 1528, 1509, 1528, 1504, 1513, 1811, 1798, 1823, 1797, 1817, 1810, 1811, 1833, 1813, 1816, 1794, 1517, 1402, 1517, -27333, 717, 714, 721, 2307, 2319, 2326, 2309, 2322, 1230, 1160, 1167, 1166, 1160, 1167, 1166, 1215, 1171, 1157, 1153, 1170, 1155, 1160, 1215, 1160, 1161, 1171, 1172, 1167, 1170, 1177, 2676, 27957, -32284, 21761, 2306, 2309, 2308, 2306, 2309, 2308, 2357, 2306, 2307, 2329, 2334, 2309, 2328, 2323, 2357, 2313, 2310, 2319, 2315, 2328, 25886, -25217, 28423, 30265, 22685, 22761, 1733, 1730, 1731, 1733, 1730, 1731, 1778, 1733, 1732, 1758, 1753, 1730, 1759, 1748, 1778, 1742, 1729, 1736, 1740, 1759, 2035, 2046, 3013, 3018, 3014, 3022, 2407, 2430, 2420, 589, 602, 594, 606, 589, 596, 588, -29145, 27026, -30635, 24614, -1316, -29145, 32733, 20958, 22503, 24672, -25877, -25848, 20957, -29696, 24207, 20651, 28405, -911, -30582, -27984, 26317, -29530, 21016, 31611, 31611, 25300, 22392, -29138, 27035, 23784, -30468, -1323, -29138, 32724, 20951, -27628, -29172, 2846, 2819, 2834, 2842, 2820, 287, 285, 266, 279, 273, 272, 31392, 31392, 32475, 29883, 23024, 21873, -28177, -1266, -28683, -27185, 25010, -29735, 21863, 21211, 22586, 30614, 18340, 28280, -26593, 30268, -2466, -32091, 21211, -32361, 31821, 18421, 31514, 21232, 27493, 29629, 2138, 2136, 2125, 2140, 2142, 2134, 2123, 2112, 2170, 2134, 2135, 2125, 2140, 2135, 2125, 1670, 1671, 1686, 1667, 1675, 1678, 1697, 1677, 1676, 1686, 1671, 1676, 1686, 29222, -26252, -2457, -32118, 25919, -31496, 27787, -2447, -32118, 29552, 23923, 23370, 27853, 2799, 2804, 2803, 2798, 2792, 2755, 2796, 2800, 2813, 2789, 2235, 2231, 2229, 2225, 2235, 2183, 2219, 2237, 2218, 2225, 2237, 2219, 2551, 2559, 2505, 2533, 2547, 2532, 2559, 2547, 2533, 3188, 3196, 31704, 24146, 30574, -25540, 31645, 24087, 30507, -25479, 26586, 23190, 29610, -26376, 529, 531, 536, 516, 531, 1859, 1852, 1827, 1913, 1861, 1914, 1884, 1894, 1850, 1894, 1864, 1876, 1850, 1857, 1858, 1856, 1898, 1883, 1892, 1866, 1853, 1858, 1851, 1912, 1862, 1914, 1883, 1868, 1851, 1895, 1890, 1848, 1911, 1851, 1849, 1853, 1880, 1856, 1889, 1860, 1897, 1853, 1889, 1900, 1870, 1871, 1913, 1908, 1870, 1826, 1916, 1895, 1870, 1917, 1859, 1893, 1866, 1898, 1909, 1892, 1859, 1913, 1858, 1880, 1879, 1848, 1826, 1893, 1830, 1849, 1890, 1908, 
    1895, 1902, 1852, 1919, 1898, 1918, 1866, 1862, 1912, 1868, 1916, 1865, 1913, 1896, 1845, 1826, 1884, 1840, 1840, 2942, 2915, 2939, 2943, 1503, 1490, 1499, 1486, 1461, 1463, 1442, 1459, 1457, 1465, 1444, 1455, 1417, 1458, 1471, 1467, 1417, 1442, 1470, 1459, 1467, 1459, 2840, 2820, 2825, 2817, 2825, 1224, 1226, 1247, 1230, 1228, 1220, 1241, 1234, 1268, 1231, 1218, 1222, 1268, 1241, 1220, 1223, 1230, 1596, 1578, 1595, 1595, 1574, 1569, 1576, 2526, 2524, 2505, 2520, 2522, 2514, 2511, 2500, 2530, 2521, 2516, 2512, 2530, 2520, 2509, 2514, 2526, 2517, 2673, 2674, 2672, 2680, 2676, 2657, 2684, 2662, 2685, 2679, 1833, 1832, 1834, 1839, 1832, 1827, 1817, 1842, 1839, 1835, 1827, 2439, 2434, 2458, 2448, 2451, 2434, 2453, 2449, 2436, 2457, 2463, 2462, 2479, 2435, 2436, 2449, 2436, 2437, 2435, 2507, 2508, 2521, 2508, 2509, 2507, 1512, 1524, 1513, 1519, 1267, 1265, 1274, 1264, 1265, 1254, 23202, -25822, 1948, 1921, 1936, 1944, 1926, 461, 450, 462, 454, 2050, 2063, 1008, 1005, 1013, 989, 1004, 995, 1007, 999, 29108, 21566, 27060, 21752, 2753, 2761, 32109, 22759, 29791, 24495, 1129, 1134, 1141, 3058, 3070, 3069, 3069, 3060, 3058, 3045, -1210, 2235, 2204, 2205, 2235, 2204, 2205, 2259, 1299, 1365, 1362, 1370, 1375, 1366, 1367, 1299, 1362, 1365, 1351, 1366, 1345, 1299, 2766, 2768, 2713, 2691, 2342, 2337, 2339, 2347, 2317, 2337, 2336, 2362, 2347, 2336, 2362, 1193, 1192, 1184, 1192, 1256, -29077, 21172, 32581, 29989, 1468, 1529, 1508, 1512, 1468, 19377, -27439, 31474, 1468, 1524, 1523, 1519, 1512, 3260, 1053, 1050, 1030, 1025, 2524, 2520, 2508, 2497, 2500, 2521, 2516, 3295, 3269, 3241, 3294, 3301, 3241, 3326, 3252, 3241, 3261, 3291, 3241, 3289, 3327, 3253, 3240, 3253, 3250, 3321, 29326, 29326, -25247, 29506, 25616, 21283, -26315, -30781, -3296, -30757, 25836, 27593, 3084, 3145, 3156, 3160, 3084, 3174, 3199, 3171, 3170, 2550, 2538, 2535, 2559, 2531, 2548, 2501, 2537, 2536, 2546, 2531, 2536, 2546, 1420, 1425, 1408, 1416, 1430, 2645, 2627, 2631, 2644, 2629, 2638, 2661, 2633, 2632, 2642, 2627, 2632, 2642, 1578, 1596, 1592, 1579, 1594, 1585, 1562, 1590, 1591, 1581, 1596, 1591, 1581};
    public static final String[] h = {C0122.m486(f51short, 1265, 5, 1753), C0130.m516(f51short, 1270, 4, 1877), C0044.m175(f51short, 1274, 4, 2909), C0053.m210(f51short, 1257, 4, 2296), C0119.m473(f51short, 1261, 4, 2915)};
    public static final String[] i = {C0098.m390(f51short, 1286, 5, 1271), C0090.m358(f51short, 1291, 4, 2613), C0009.m33(f51short, 1295, 4, 1617), C0120.m477(f51short, 1278, 4, 1818), C0043.m169(f51short, 1282, 4, 2853)};
    public static final List j = Arrays.asList(new com.github.catvod.spider.merge.p001b.b(C0063.m249(f51short, 1299, 10, 1780), C0105.m416(f51short, 1309, 2, 850), null), new com.github.catvod.spider.merge.p001b.b(C0105.m416(f51short, 1311, 12, 885), C0087.m346(f51short, 1323, 2, 642), null), new com.github.catvod.spider.merge.p001b.b(C0046.m182(f51short, 1325, 9, 2598), C0119.m473(f51short, 1334, 4, 2767), null), new com.github.catvod.spider.merge.p001b.b(C0006.m21(f51short, 1338, 5, 948), C0139.m554(f51short, 1343, 4, 3061), null), new com.github.catvod.spider.merge.p001b.b(C0019.m75(f51short, 1347, 15, 827), C0028.m108(f51short, 1362, 4, 2792), null), new com.github.catvod.spider.merge.p001b.b(C0142.m567(f51short, 1366, 3, 1670), C0137.m545(f51short, 1369, 3, 980), null), new com.github.catvod.spider.merge.p001b.b(C0120.m477(f51short, 1372, 3, 1723), C0010.m36(f51short, 1375, 3, 1724), null), new com.github.catvod.spider.merge.p001b.b(C0017.m65(f51short, 1378, 7, 1805), C0056.m223(f51short, 1385, 3, 2010), null), new com.github.catvod.spider.merge.p001b.b(C0137.m545(f51short, 1388, 14, 548), C0014.m54(f51short, 1402, 4, 2634), null));
    public final ExecutorService a = Executors.newFixedThreadPool(3);
    public final AtomicBoolean d = new AtomicBoolean();
    public String e = "";
    public String f = C0092.m365(f51short, 1406, 5, 1275);
    public String g = C0019.m75(f51short, 1411, 17, 1249);

    final class EpisodeRef {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final int e;
        public final long f;

        public EpisodeRef(String str, String str2, String str3, String str4, int i, long j) {
            this.a = str == null ? "" : str.trim();
            this.b = str2 == null ? "" : str2.trim();
            this.c = str3 == null ? "" : str3.trim();
            this.d = str4 != null ? str4.trim() : "";
            this.e = i;
            this.f = Math.min(2147483647L, Math.max(0L, j));
        }

        public final String a() {
            String str = this.d;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String str2 = this.c;
            return !TextUtils.isEmpty(str2) ? str2 : this.b;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0053.m210(f51short, 0, 1, 1893));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        String strM558 = C0140.m558(f51short, 1, 10, 1440);
        String strM322 = C0081.m322(f51short, 11, 5, 2665);
        String strM102 = C0026.m102(f51short, 16, 5, 2753);
        String strM108 = C0028.m108(f51short, 21, 91, 595);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = this.b;
        LinkedHashMap linkedHashMap2 = (!z || linkedHashMap == null) ? new LinkedHashMap() : new LinkedHashMap(linkedHashMap);
        long nanos = TimeUnit.SECONDS.toNanos(30L) + System.nanoTime();
        try {
            try {
                String strC = c();
                if (!strC.isEmpty()) {
                    throw new C0282o0(strC);
                }
                if (!C0299u0.x().c(this.d)) {
                    throw new C0282o0(C0133.m529(f51short, 257, 20, 880));
                }
                Future futureB = b(j(strM108), l(strM322, C0101.m402(f51short, 112, 10, 3023), strM558, Boolean.TRUE, strM102, 8), arrayList3);
                Future futureB2 = b(j(C0128.m511(f51short, 122, 91, 489)), l(C0128.m511(f51short, 213, 5, 2256), C0101.m402(f51short, 218, 9, 1906), strM102, 8), arrayList3);
                Future futureB3 = b(j(strM108), l(strM322, C0103.m408(f51short, 227, 9, 1685), strM558, Boolean.FALSE, strM102, 8), arrayList3);
                a(arrayList, futureB, C0142.m567(f51short, 236, 7, 928), nanos, arrayList2);
                a(arrayList, futureB2, C0044.m175(f51short, 243, 5, 433), nanos, arrayList2);
                a(arrayList, futureB3, C0120.m477(f51short, 248, 9, 1355), nanos, arrayList2);
                if (z) {
                    linkedHashMap2 = g(nanos, arrayList2, arrayList3);
                }
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).cancel(true);
                }
                com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.a(j);
                gVar.F(arrayList);
                gVar.e(linkedHashMap2);
                if (!arrayList2.isEmpty()) {
                    gVar.l(TextUtils.join(C0049.m193(f51short, 290, 1, 2529), arrayList2));
                }
                return gVar.r();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                arrayList2.add(C0089.m355(f51short, 277, 13, 1793));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    ((Future) it2.next()).cancel(true);
                }
            } catch (Exception e) {
                arrayList2.add(p(e));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ((Future) it3.next()).cancel(true);
                }
            }
        } catch (Throwable th) {
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                ((Future) it4.next()).cancel(true);
            }
            throw th;
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return com.github.catvod.spider.merge.p001b.g.y(Collections.emptyList());
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws Throwable {
        long j2;
        long j3;
        String strR0;
        if (C0003.m10(f51short, 291, 13, 3043).equals(str2) || C0070.m277(f51short, 304, 20, 863).equals(str2)) {
            action(str2);
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C("");
            return gVar.r();
        }
        String strC = c();
        if (!strC.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d(strC);
        }
        synchronized (AbstractC0302v0.b) {
            j2 = AbstractC0302v0.d + 1;
            AbstractC0302v0.d = j2;
            AbstractC0302v0.e = j2;
            AbstractC0302v0.f = this;
        }
        C0299u0.x().K0(j2);
        try {
            j(C0006.m21(f51short, 324, 91, 849));
            String str3 = this.f;
            for (int i2 = 0; i2 < 5; i2++) {
                if (h[i2].equalsIgnoreCase(str)) {
                    str3 = i[i2];
                    break;
                }
            }
            String str4 = str3;
            EpisodeRef episodeRefE = e(str2);
            String strU = C0299u0.x().U(j2, this.e, episodeRefE.a(), str4);
            try {
                j3 = j2;
                try {
                    strR0 = AbstractC0302v0.R0(this, j2, this.e, episodeRefE.a, episodeRefE.b, episodeRefE.c, episodeRefE.d, episodeRefE.f);
                } catch (Throwable unused) {
                    strR0 = null;
                }
            } catch (Throwable unused2) {
                j3 = j2;
            }
            long j4 = j3;
            if (!AbstractC0302v0.n0(this, j4)) {
                AbstractC0302v0.t(this, j4);
                return com.github.catvod.spider.merge.p001b.g.d(C0098.m390(f51short, 415, 11, 639));
            }
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C(strU);
            if (!TextUtils.isEmpty(strR0)) {
                gVar2.b(strR0);
            }
            return gVar2.r();
        } catch (Exception e) {
            return com.github.catvod.spider.merge.p001b.g.d(p(e));
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        long jOptLong;
        String strM31 = C0008.m31(f51short, 426, 9, 1246);
        if (list != null && !list.isEmpty() && (C0008.m31(f51short, 435, 13, 1878).equals(list.get(0)) || C0073.m288(f51short, 448, 20, 3187).equals(list.get(0)))) {
            AbstractC0302v0.g0(list.get(0), new i(9, this));
            return "";
        }
        String strC = c();
        if (!strC.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d(strC);
        }
        if (list == null || list.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d(C0109.m432(f51short, 725, 8, 2458));
        }
        try {
            JSONObject jSONObjectN = n(j(C0049.m193(f51short, 468, 91, 1970)), l(strM31, list.get(0)));
            JSONObject jSONObjectOptJSONObject = jSONObjectN.optJSONObject(C0133.m529(f51short, 559, 4, 522));
            JSONArray jSONArrayOptJSONArray = jSONObjectN.optJSONArray(C0106.m422(f51short, 563, 8, 798));
            if (jSONObjectOptJSONObject != null && jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                k kVar = new k(jSONObjectOptJSONObject.optString(strM31, list.get(0)), jSONObjectOptJSONObject.optString(C0076.m301(f51short, 571, 5, 2522), C0116.m463(f51short, 576, 4, 2070)), jSONObjectOptJSONObject.optString(C0027.m105(f51short, 580, 5, 714), ""), jSONObjectOptJSONObject.optString(C0030.m116(f51short, 585, 6, 1205), "") + C0097.m386(f51short, 591, 3, 1414) + jSONObjectOptJSONObject.optInt(C0095.m379(f51short, 594, 11, 1097), jSONArrayOptJSONArray.length()) + C0090.m358(f51short, 605, 1, 3039));
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(C0006.m21(f51short, 606, 8, 2883));
                String strM199 = C0050.m199(f51short, 614, 3, 720);
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; jSONArrayOptJSONArray2 != null && i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    String strOptString = jSONArrayOptJSONArray2.optString(i2, "");
                    if (!strOptString.isEmpty()) {
                        arrayList.add(strOptString);
                    }
                }
                kVar.i(TextUtils.join(strM199, arrayList));
                kVar.l(jSONObjectOptJSONObject.optString(C0044.m175(f51short, 617, 5, 3181), ""));
                String strOptString2 = jSONObjectOptJSONObject.optString(strM31, list.get(0));
                if (TextUtils.isEmpty(strOptString2)) {
                    strOptString2 = list.get(0);
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
                    if (jSONObjectOptJSONObject2 != null) {
                        int iOptInt = jSONObjectOptJSONObject2.optInt(C0030.m116(f51short, 622, 5, 1681), i3 + 1);
                        String strM554 = C0139.m554(f51short, 627, 11, 1697);
                        if (jSONObjectOptJSONObject2.has(strM554)) {
                            jOptLong = jSONObjectOptJSONObject2.optLong(strM554, 0L);
                        } else {
                            long jMax = Math.max(0L, jSONObjectOptJSONObject2.optLong(C0014.m54(f51short, 638, 8, 3142), 0L));
                            jOptLong = jMax > 2147483 ? 2147483647L : jMax * 1000;
                        }
                        EpisodeRef episodeRef = new EpisodeRef(strOptString2, jSONObjectOptJSONObject2.optString(C0143.m570(f51short, 646, 8, 2969)), jSONObjectOptJSONObject2.optString(C0135.m539(f51short, 654, 7, 1975)), jSONObjectOptJSONObject2.optString(C0093.m368(f51short, 661, 3, 2094)), iOptInt, jOptLong);
                        if (!TextUtils.isEmpty(episodeRef.a())) {
                            arrayList2.add(C0003.m10(f51short, 664, 1, 2549) + iOptInt + C0046.m182(f51short, 665, 2, 803) + f(episodeRef));
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return com.github.catvod.spider.merge.p001b.g.d(C0142.m567(f51short, 667, 11, 2008));
                }
                String strJoin = TextUtils.join(C0137.m545(f51short, 678, 1, 627), arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (int i4 = 0; i4 < 5; i4++) {
                    arrayList3.add(strJoin);
                }
                kVar.q(C0055.m219(f51short, 679, 33, 1050));
                kVar.r(TextUtils.join(C0019.m75(f51short, 712, 3, 766), arrayList3));
                FishCrypto.c(kVar);
                return com.github.catvod.spider.merge.p001b.g.s(kVar);
            }
            return com.github.catvod.spider.merge.p001b.g.d(C0096.m382(f51short, 715, 10, 1656));
        } catch (Exception e) {
            return com.github.catvod.spider.merge.p001b.g.d(p(e));
        }
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        if (C0098.m390(f51short, 733, 13, 1654).equals(str)) {
            final int i2 = 0;
            InitOrigin.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.u.u
                public final /* synthetic */ HonHon b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i3 = 0;
                    switch (i2) {
                        case 0:
                            String[] strArr = HonHon.h;
                            HonHon honHon = this.b;
                            String strC = honHon.c();
                            if (!strC.isEmpty()) {
                                X0.a(strC);
                                break;
                            } else {
                                try {
                                    Activity activity = InitOrigin.getActivity();
                                    if (activity != null) {
                                        String str2 = "honhon_search_" + System.currentTimeMillis();
                                        int iQ = AbstractC0583w0.Q(8, activity);
                                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                        linearLayoutK.addView(AbstractC0583w0.q(activity, "红红搜索", "搜索短剧后选择结果加入历史", -1754827), AbstractC0583w0.c0(iQ));
                                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                        EditText editTextM = AbstractC0583w0.M(activity, "输入短剧名称");
                                        linearLayoutY.addView(editTextM);
                                        TextView textViewF = AbstractC0583w0.F(activity, "搜索", AbstractC0583w0.d, -1);
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams.topMargin = iQ;
                                        linearLayoutY.addView(textViewF, layoutParams);
                                        linearLayoutK.addView(linearLayoutY);
                                        RunnableC0240a0 runnableC0240a0 = new RunnableC0240a0(honHon, alertDialogArr, editTextM, textViewF, 2);
                                        textViewF.setOnClickListener(new ViewOnClickListenerC0470w(runnableC0240a0, 0));
                                        editTextM.setImeOptions(3);
                                        editTextM.setOnEditorActionListener(new C0471x(runnableC0240a0, i3));
                                        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterfaceOnDismissListenerC0472y(str2, i3)).create();
                                        AlertDialog[] alertDialogArr = {alertDialogCreate};
                                        AbstractC0583w0.j0(alertDialogCreate);
                                        P1.x(alertDialogArr[0].getButton(-3), "红红搜索", str2, "query", "短剧名称", "输入要搜索的短剧名称", -1754827, editTextM, runnableC0240a0);
                                        textViewF.post(new z(textViewF, 0));
                                        break;
                                    }
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            break;
                        default:
                            String[] strArr2 = HonHon.h;
                            this.b.getClass();
                            try {
                                Activity activity2 = InitOrigin.getActivity();
                                if (activity2 != null) {
                                    String[][] strArr3 = {new String[]{"记录数量", HonHon.m().length() + " 条"}};
                                    int i4 = AbstractC0583w0.a;
                                    int i5 = AbstractC0583w0.a;
                                    AbstractC0583w0.j0(AbstractC0583w0.r(activity2, "清除搜索历史", "清除后历史中的短剧入口将被移除", -1754827, strArr3, null, new String[]{"确认清除", "取消"}, new Runnable[]{new RunnableC0460l(27), null}));
                                }
                            } catch (Exception unused2) {
                                X0.a("打开搜索历史设置失败");
                            }
                            break;
                    }
                }
            });
        }
        if (!C0076.m301(f51short, 746, 20, 1092).equals(str)) {
            return "";
        }
        final int i3 = 1;
        InitOrigin.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.u.u
            public final /* synthetic */ HonHon b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i4 = 0;
                switch (i3) {
                    case 0:
                        String[] strArr = HonHon.h;
                        HonHon honHon = this.b;
                        String strC = honHon.c();
                        if (!strC.isEmpty()) {
                            X0.a(strC);
                            break;
                        } else {
                            try {
                                Activity activity = InitOrigin.getActivity();
                                if (activity != null) {
                                    String str2 = "honhon_search_" + System.currentTimeMillis();
                                    int iQ = AbstractC0583w0.Q(8, activity);
                                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                    linearLayoutK.addView(AbstractC0583w0.q(activity, "红红搜索", "搜索短剧后选择结果加入历史", -1754827), AbstractC0583w0.c0(iQ));
                                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                    EditText editTextM = AbstractC0583w0.M(activity, "输入短剧名称");
                                    linearLayoutY.addView(editTextM);
                                    TextView textViewF = AbstractC0583w0.F(activity, "搜索", AbstractC0583w0.d, -1);
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                    layoutParams.topMargin = iQ;
                                    linearLayoutY.addView(textViewF, layoutParams);
                                    linearLayoutK.addView(linearLayoutY);
                                    RunnableC0240a0 runnableC0240a0 = new RunnableC0240a0(honHon, alertDialogArr, editTextM, textViewF, 2);
                                    textViewF.setOnClickListener(new ViewOnClickListenerC0470w(runnableC0240a0, 0));
                                    editTextM.setImeOptions(3);
                                    editTextM.setOnEditorActionListener(new C0471x(runnableC0240a0, i4));
                                    AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterfaceOnDismissListenerC0472y(str2, i4)).create();
                                    AlertDialog[] alertDialogArr = {alertDialogCreate};
                                    AbstractC0583w0.j0(alertDialogCreate);
                                    P1.x(alertDialogArr[0].getButton(-3), "红红搜索", str2, "query", "短剧名称", "输入要搜索的短剧名称", -1754827, editTextM, runnableC0240a0);
                                    textViewF.post(new z(textViewF, 0));
                                    break;
                                }
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    default:
                        String[] strArr2 = HonHon.h;
                        this.b.getClass();
                        try {
                            Activity activity2 = InitOrigin.getActivity();
                            if (activity2 != null) {
                                String[][] strArr3 = {new String[]{"记录数量", HonHon.m().length() + " 条"}};
                                int i5 = AbstractC0583w0.a;
                                int i6 = AbstractC0583w0.a;
                                AbstractC0583w0.j0(AbstractC0583w0.r(activity2, "清除搜索历史", "清除后历史中的短剧入口将被移除", -1754827, strArr3, null, new String[]{"确认清除", "取消"}, new Runnable[]{new RunnableC0460l(27), null}));
                            }
                        } catch (Exception unused2) {
                            X0.a("打开搜索历史设置失败");
                        }
                        break;
                }
            }
        });
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:53:0x020a  */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int iMax;
        String str3;
        String strM567 = C0142.m567(f51short, 766, 5, 880);
        String strM570 = C0143.m570(f51short, 771, 10, 1845);
        String strM285 = C0072.m285(f51short, 781, 5, 3228);
        String strM193 = C0049.m193(f51short, 786, 3, 1515);
        String strC = c();
        if (!strC.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d(strC);
        }
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
            iMax = 1;
        }
        if (iMax > 1) {
            List listEmptyList = Collections.emptyList();
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.o(iMax, 1, 36, 0);
            gVar.F(listEmptyList);
            return gVar.r();
        }
        try {
            if (C0073.m288(f51short, 789, 14, 714).equals(str)) {
                return com.github.catvod.spider.merge.p001b.g.y(o());
            }
            if (C0133.m529(f51short, 803, 5, 2059).equals(str)) {
                return q(j(C0130.m516(f51short, 808, 91, 2350)), l(strM285, strM570, C0074.m292(f51short, 899, 10, 2894), Boolean.TRUE, strM567, 36));
            }
            boolean zEquals = C0137.m545(f51short, 909, 15, 1662).equals(str);
            String strM286 = C0072.m285(f51short, 924, 5, 2264);
            String strM379 = C0095.m379(f51short, 929, 91, 1325);
            if (zEquals) {
                return q(j(strM379), l(strM286, C0043.m169(f51short, 1020, 9, 976), strM567, 36));
            }
            if (strM193.equals(str)) {
                return q(j(strM379), l(strM286, strM193, strM567, 36));
            }
            JSONObject jSONObject = new JSONObject();
            boolean zEquals2 = C0050.m199(f51short, 1029, 3, 2783).equals(str);
            String strM3710 = C0095.m379(f51short, 1032, 7, 3189);
            boolean z2 = zEquals2 || strM3710.equals(str);
            String strM70 = C0018.m70(f51short, 1039, 9, 674);
            String strM277 = C0070.m277(f51short, 1048, 12, 2716);
            String str4 = null;
            if (z2) {
                str3 = map == null ? null : map.get(strM285);
                if (TextUtils.isEmpty(str3)) {
                    str3 = strM570;
                }
                if (!strM277.equals(str3) && !strM70.equals(str3)) {
                    str3 = strM570;
                }
            } else if (strM277.equals(str) || strM70.equals(str)) {
                str3 = str;
            } else {
                str3 = strM570;
            }
            jSONObject.put(strM285, str3);
            Object objM210 = C0053.m210(f51short, 1060, 9, 753);
            String strM175 = C0044.m175(f51short, 1069, 4, 3115);
            if (!z2) {
                if (map != null) {
                    str4 = map.get(strM175);
                }
                if (!TextUtils.isEmpty(str4)) {
                    objM210 = str4;
                }
            } else if (strM3710.equals(str)) {
                objM210 = C0014.m54(f51short, 1073, 11, 777);
            }
            jSONObject.put(strM175, objM210);
            d(C0112.m445(f51short, 1084, 5, 1314), map, jSONObject);
            d(C0021.m83(f51short, 1089, 7, 2467), map, jSONObject);
            d(C0011.m42(f51short, 1096, 10, 2874), map, jSONObject);
            d(C0063.m249(f51short, 1106, 6, 3207), map, jSONObject);
            d(C0008.m31(f51short, 1112, 4, 1485), map, jSONObject);
            d(C0135.m539(f51short, 1116, 6, 372), map, jSONObject);
            jSONObject.put(strM567, strM570.equals(str) ? 35 : 36);
            ArrayList arrayListK = k("", n(j(C0089.m355(f51short, 1122, 91, 718)), jSONObject).optJSONArray(C0097.m386(f51short, 1213, 5, 2587)));
            if (strM570.equals(str)) {
                arrayListK.add(0, new k(C0097.m386(f51short, 1218, 13, 1452), C0032.m126(f51short, 1231, 4, 1715), AbstractC0302v0.d1(), C0044.m175(f51short, 1235, 9, 2231), C0021.m83(f51short, 1244, 13, 3267)));
            }
            int size = arrayListK.size();
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.o(1, 1, 36, size);
            gVar2.F(arrayListK);
            return gVar2.r();
        } catch (Exception e) {
            return com.github.catvod.spider.merge.p001b.g.d(p(e));
        }
    }

    public static void d(String str, Map map, JSONObject jSONObject) throws JSONException {
        if (map == null) {
            return;
        }
        String str2 = (String) map.get(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    public static EpisodeRef e(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith(C0026.m102(f51short, 1428, 6, 3248))) {
            return new EpisodeRef("", "", "", str, 0, 0L);
        }
        String strSubstring = str.substring(6);
        if (strSubstring.isEmpty()) {
            throw new IllegalArgumentException(C0026.m102(f51short, 1503, 19, 923));
        }
        JSONObject jSONObject = new JSONObject(new String(Base64.decode(strSubstring, 11), StandardCharsets.UTF_8));
        EpisodeRef episodeRef = new EpisodeRef(jSONObject.optString(C0096.m382(f51short, 1434, 9, 1495)), jSONObject.optString(C0073.m288(f51short, 1443, 8, 2568)), jSONObject.optString(C0045.m177(f51short, 1451, 7, 2760)), jSONObject.optString(C0017.m65(f51short, 1458, 3, 1055)), jSONObject.optInt(C0112.m445(f51short, 1461, 5, 1494)), Math.max(0L, jSONObject.optLong(C0125.m499(f51short, 1474, 11, 1354), jSONObject.optLong(C0087.m346(f51short, 1466, 8, 1632)))));
        if (TextUtils.isEmpty(episodeRef.a())) {
            throw new IllegalArgumentException(C0133.m529(f51short, 1485, 18, 1558));
        }
        return episodeRef;
    }

    public static String f(EpisodeRef episodeRef) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0063.m249(f51short, 1522, 9, 2278), episodeRef.a);
        jSONObject.put(C0019.m75(f51short, 1531, 8, 2901), episodeRef.b);
        jSONObject.put(C0140.m558(f51short, 1539, 7, 1390), episodeRef.c);
        jSONObject.put(C0017.m65(f51short, 1546, 3, 2508), episodeRef.d);
        jSONObject.put(C0072.m285(f51short, 1549, 5, 1493), episodeRef.e);
        jSONObject.put(C0128.m511(f51short, 1554, 11, 1865), episodeRef.f);
        return com.github.catvod.spider.merge.D.b.B(C0118.m471(f51short, 1565, 6, 1751), Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 11));
    }

    public static String i(String str) {
        String strM70;
        boolean z;
        String strTrim = str == null ? "" : str.trim();
        while (true) {
            strM70 = C0018.m70(f51short, 1571, 1, 1059);
            z = true;
            if (!strTrim.endsWith(strM70)) {
                break;
            }
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
        }
        if (strTrim.isEmpty()) {
            return "";
        }
        if (!strTrim.startsWith(C0090.m358(f51short, 1572, 7, 849))) {
            String strM477 = C0120.m477(f51short, 1579, 8, 2134);
            if (!strTrim.startsWith(strM477)) {
                strTrim = strM477.concat(strTrim);
            }
        }
        URL url = new URL(strTrim);
        if (!C0081.m322(f51short, 1587, 9, 2989).equalsIgnoreCase(url.getHost()) && !C0095.m379(f51short, 1596, 9, 2746).equals(url.getHost()) && !C0087.m346(f51short, 1605, 3, 1395).equals(url.getHost()) && !C0090.m358(f51short, 1608, 5, 967).equals(url.getHost())) {
            z = false;
        }
        if ((C0118.m471(f51short, 1613, 5, 1599).equals(url.getProtocol()) || (C0133.m529(f51short, 1618, 4, 1914).equals(url.getProtocol()) && z)) && !TextUtils.isEmpty(url.getHost()) && url.getUserInfo() == null && url.getQuery() == null && url.getRef() == null && (url.getPath().isEmpty() || strM70.equals(url.getPath()))) {
            return strTrim;
        }
        throw new IllegalArgumentException(C0089.m355(f51short, 1622, 12, 2385));
    }

    public static int j(String str) {
        return Integer.parseInt(FishCrypto.v(str));
    }

    public static ArrayList k(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; jSONArray != null && i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString(C0046.m182(f51short, 1634, 9, 812), "");
                String strOptString2 = jSONObjectOptJSONObject.optString(C0014.m54(f51short, 1643, 5, 1420), "");
                if (!strOptString.isEmpty() && !strOptString2.isEmpty()) {
                    int iOptInt = jSONObjectOptJSONObject.optInt(C0059.m234(f51short, 1648, 11, 1910), 0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.isEmpty() ? "" : str.concat(C0092.m365(f51short, 1659, 3, 1485)));
                    sb.append(iOptInt > 0 ? iOptInt + C0032.m126(f51short, 1662, 1, 1021) : jSONObjectOptJSONObject.optString(C0001.m1(f51short, 1663, 3, 677), ""));
                    arrayList.add(new k(strOptString, strOptString2, jSONObjectOptJSONObject.optString(C0032.m126(f51short, 1666, 5, 2400), ""), sb.toString()));
                }
            }
        }
        return arrayList;
    }

    public static JSONObject l(Object... objArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= objArr.length) {
                return jSONObject;
            }
            jSONObject.put((String) objArr[i2], objArr[i3]);
            i2 += 2;
        }
    }

    public static JSONArray m() {
        try {
            String strM379 = C0095.m379(f51short, 1671, 22, 1248);
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(strM379);
            return TextUtils.isEmpty(strH) ? new JSONArray() : new JSONArray(strH);
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    public static ArrayList o() {
        JSONArray jSONArrayM = m();
        ArrayList arrayList = new ArrayList();
        k kVar = new k(C0028.m108(f51short, 1697, 20, 2410), C0059.m234(f51short, 1717, 6, 2843), AbstractC0302v0.o(), jSONArrayM.length() + C0019.m75(f51short, 1693, 4, 2644), C0140.m558(f51short, 1723, 20, 1709));
        kVar.h(new com.github.catvod.spider.merge.p001b.i());
        arrayList.add(kVar);
        for (int i2 = 0; i2 < jSONArrayM.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayM.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(new k(jSONObjectOptJSONObject.optString(C0118.m471(f51short, 1743, 2, 1946)), jSONObjectOptJSONObject.optString(C0139.m554(f51short, 1745, 4, 2987)), jSONObjectOptJSONObject.optString(C0027.m105(f51short, 1749, 3, 2327)), jSONObjectOptJSONObject.optString(C0093.m368(f51short, 1752, 7, 575))));
            }
        }
        return arrayList;
    }

    public static String p(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof C0282o0) {
                return cause.getMessage();
            }
            if (cause instanceof TimeoutException) {
                return C0008.m31(f51short, 1759, 10, 1488);
            }
            if (cause instanceof CancellationException) {
                return C0118.m471(f51short, 1769, 13, 893);
            }
        }
        return C0133.m529(f51short, 1782, 14, 1497);
    }

    public final void a(ArrayList arrayList, Future future, String str, long j2, ArrayList arrayList2) throws InterruptedException {
        JSONObject jSONObjectH = h(future, str, j2, arrayList2);
        if (jSONObjectH != null) {
            arrayList.addAll(k(str, jSONObjectH.optJSONArray(C0087.m346(f51short, 1796, 5, 2935))));
        }
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0049.m193(f51short, 1801, 6, 382));
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

    public final Future b(final int i2, final JSONObject jSONObject, ArrayList arrayList) {
        Future futureSubmit = this.a.submit(new Callable() { // from class: com.github.catvod.spider.merge.u.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = HonHon.h;
                return this.a.n(i2, jSONObject);
            }
        });
        arrayList.add(futureSubmit);
        return futureSubmit;
    }

    public final String c() {
        if (this.d.get()) {
            return C0115.m459(f51short, 1807, 13, 1026);
        }
        if (this.g.isEmpty()) {
            return FishCrypto.l() ? "" : C0017.m65(f51short, 1820, 17, 2386);
        }
        return this.g;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0032.m126(f51short, 1837, 15, 2105));
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

    public void destroy() {
        this.d.set(true);
        this.a.shutdownNow();
        try {
            AbstractC0302v0.s(this);
        } catch (Throwable unused) {
        }
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0011.m42(f51short, 1852, 13, 1762));
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

    /* JADX WARN: Code duplicated, block: B:41:0x0179  */
    public final LinkedHashMap g(long j2, ArrayList arrayList, ArrayList arrayList2) throws InterruptedException {
        String strM108;
        JSONArray jSONArray;
        int i2;
        JSONArray jSONArray2;
        int i3;
        int i4 = 3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap != null && this.c != 0 && jCurrentTimeMillis - this.c < 1800000) {
            return linkedHashMap;
        }
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        if (this.d.get()) {
            throw new CancellationException();
        }
        if (j2 - System.nanoTime() <= 0) {
            arrayList.add(C0091.m360(f51short, 1865, 13, 2429));
            return linkedHashMap == null ? new LinkedHashMap() : linkedHashMap;
        }
        String strM390 = C0098.m390(f51short, 1878, 10, 2716);
        String strM75 = C0019.m75(f51short, 1888, 12, 2264);
        String strM355 = C0089.m355(f51short, 1900, 9, 2454);
        String[] strArr = {strM390, strM75, strM355};
        String[] strArr2 = {C0047.m186(f51short, 1915, 4, 3184), C0126.m503(f51short, 1919, 4, 2289), C0030.m116(f51short, 1909, 6, 3125)};
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        while (true) {
            strM108 = C0028.m108(f51short, 1923, 5, 630);
            if (i5 >= 3) {
                break;
            }
            arrayList3.add(b(j(C0076.m301(f51short, 1928, 91, 1805)), l(strM108, strArr[i5]), arrayList2));
            i5++;
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap == null ? new LinkedHashMap() : new LinkedHashMap(linkedHashMap);
        int i6 = 0;
        boolean z = true;
        while (i6 < i4) {
            ArrayList arrayList4 = arrayList3;
            String str = strM108;
            String str2 = strM355;
            JSONObject jSONObjectH = h((Future) arrayList3.get(i6), strArr2[i6], j2, arrayList);
            if (jSONObjectH == null) {
                i3 = 1;
                z = false;
            } else {
                String str3 = strArr[i6];
                JSONArray jSONArrayOptJSONArray = jSONObjectH.optJSONArray(C0125.m499(f51short, 2019, 4, 2828));
                ArrayList arrayList5 = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    int i7 = 0;
                    while (i7 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i7);
                        if (jSONObjectOptJSONObject == null) {
                            jSONArray = jSONArrayOptJSONArray;
                            i2 = 1;
                        } else {
                            String strOptString = jSONObjectOptJSONObject.optString(C0082.m325(f51short, 2023, 4, 1451));
                            if (C0082.m325(f51short, 2027, 18, 1494).equals(strOptString)) {
                                strOptString = C0117.m467(f51short, 2045, 5, 2924);
                            } else if (C0014.m54(f51short, 2050, 17, 1195).equals(strOptString)) {
                                strOptString = C0140.m558(f51short, 2067, 7, 1615);
                            } else if (C0120.m477(f51short, 2074, 18, 2493).equals(strOptString)) {
                                strOptString = C0009.m33(f51short, 2092, 10, 2579);
                            } else if (C0117.m467(f51short, 2102, 11, 1862).equals(strOptString)) {
                                strOptString = C0043.m169(f51short, 2113, 4, 2531);
                            } else if (C0030.m116(f51short, 2117, 15, 2544).equals(strOptString)) {
                                strOptString = C0089.m355(f51short, 2132, 6, 2488);
                            } else if (!C0143.m570(f51short, 2138, 4, 1435).equals(strOptString) && !C0076.m301(f51short, 2142, 6, 1172).equals(strOptString)) {
                                strOptString = "";
                            }
                            if (strOptString.isEmpty()) {
                                jSONArray = jSONArrayOptJSONArray;
                                i2 = 1;
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                jSONArray = jSONArrayOptJSONArray;
                                arrayList6.add(new com.github.catvod.spider.merge.p001b.c(C0021.m83(f51short, 2148, 2, 3018), ""));
                                int i8 = 0;
                                for (JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(C0122.m486(f51short, 2150, 5, 2037)); jSONArrayOptJSONArray2 != null && i8 < jSONArrayOptJSONArray2.length(); jSONArrayOptJSONArray2 = jSONArray2) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i8);
                                    if (jSONObjectOptJSONObject2 == null) {
                                        jSONArray2 = jSONArrayOptJSONArray2;
                                    } else {
                                        jSONArray2 = jSONArrayOptJSONArray2;
                                        String strOptString2 = jSONObjectOptJSONObject2.optString(C0045.m177(f51short, 2155, 4, 419), "");
                                        String strOptString3 = jSONObjectOptJSONObject2.optString(C0046.m182(f51short, 2159, 2, 2155), "");
                                        if (!strOptString2.isEmpty() && !strOptString3.isEmpty()) {
                                            arrayList6.add(new com.github.catvod.spider.merge.p001b.c(strOptString2, strOptString3));
                                        }
                                    }
                                    i8++;
                                }
                                i2 = 1;
                                if (arrayList6.size() > 1) {
                                    arrayList5.add(new com.github.catvod.spider.merge.p001b.d(strOptString, jSONObjectOptJSONObject.optString(C0109.m432(f51short, 2161, 8, 898), strOptString), arrayList6));
                                }
                            }
                        }
                        i7 += i2;
                        jSONArrayOptJSONArray = jSONArray;
                    }
                }
                i3 = 1;
                linkedHashMap2.put(str3, arrayList5);
            }
            i6 += i3;
            i4 = 3;
            strM355 = str2;
            arrayList3 = arrayList4;
            strM108 = str;
        }
        List listSingletonList = Collections.singletonList(new com.github.catvod.spider.merge.p001b.d(strM108, C0045.m177(f51short, 2177, 2, 2084), Arrays.asList(new com.github.catvod.spider.merge.p001b.c(C0070.m277(f51short, 2169, 2, 1625), strM390), new com.github.catvod.spider.merge.p001b.c(C0053.m210(f51short, 2171, 2, 1695), strM75), new com.github.catvod.spider.merge.p001b.c(C0135.m539(f51short, 2173, 4, 2688), strM355))));
        linkedHashMap2.put(C0135.m539(f51short, 2179, 3, 1025), listSingletonList);
        linkedHashMap2.put(C0091.m360(f51short, 2182, 7, 2961), listSingletonList);
        this.b = linkedHashMap2;
        this.c = z ? System.currentTimeMillis() : 0L;
        return linkedHashMap2;
    }

    public final JSONObject h(Future future, String str, long j2, ArrayList arrayList) throws InterruptedException {
        long jNanoTime = System.nanoTime();
        while (!Thread.currentThread().isInterrupted()) {
            try {
                if (this.d.get()) {
                    throw new CancellationException();
                }
                if (future.isDone()) {
                    return (JSONObject) future.get();
                }
                long jNanoTime2 = j2 - System.nanoTime();
                if (jNanoTime2 <= 0) {
                    throw new TimeoutException();
                }
                try {
                    return (JSONObject) future.get(Math.min(jNanoTime2, TimeUnit.MILLISECONDS.toNanos(100L)), TimeUnit.NANOSECONDS);
                } catch (TimeoutException unused) {
                }
            } catch (InterruptedException e) {
                throw e;
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                future.cancel(true);
                arrayList.add(str + C0126.m503(f51short, 2189, 1, 1116) + p(e3));
                Throwable cause = e3.getCause();
                Exception cause2 = e3;
                if (cause != null) {
                    cause2 = e3.getCause();
                }
                StringBuilder sbQ = com.github.catvod.spider.merge.D.b.q(C0140.m558(f51short, 2190, 7, 2291), str, C0079.m314(f51short, 2197, 14, 1331));
                sbQ.append(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime));
                sbQ.append(C0098.m390(f51short, 2211, 4, 2723));
                sbQ.append(cause2.getClass().getSimpleName());
                SpiderDebug.log(sbQ.toString());
                return null;
            }
        }
        throw new InterruptedException();
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0045.m177(f51short, 2215, 11, 2382));
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
        String strTrim;
        String strM486 = C0122.m486(f51short, 2226, 5, 1176);
        Init.init(context);
        this.e = "";
        this.g = C0105.m416(f51short, 2231, 17, 1436);
        this.b = null;
        this.c = 0L;
        if (str == null) {
            strTrim = "";
        } else {
            try {
                strTrim = str.trim();
            } catch (Exception unused) {
                this.g = C0107.m427(f51short, 2279, 21, 3116);
                return;
            }
        }
        if (!strTrim.isEmpty()) {
            try {
                String strG = FishCrypto.g(strTrim);
                if (!TextUtils.isEmpty(strG)) {
                    strTrim = strG;
                }
            } catch (Throwable unused2) {
            }
        }
        JSONObject jSONObject = strTrim.startsWith(C0076.m301(f51short, 2248, 1, 3271)) ? new JSONObject(strTrim) : new JSONObject();
        this.e = i(jSONObject.optString(C0095.m379(f51short, 2249, 4, 1141), ""));
        String strTrim2 = jSONObject.optString(C0115.m459(f51short, 2253, 7, 2477), strM486).trim();
        if (strTrim2.matches(C0104.m414(f51short, 2260, 19, 3204))) {
            strM486 = strTrim2;
        }
        this.f = strM486;
        if (this.e.isEmpty()) {
            return;
        }
        this.g = "";
    }

    public final JSONObject n(int i2, JSONObject jSONObject) throws InterruptedException {
        if (this.d.get() || Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        return C0299u0.x().P(this.e, i2, jSONObject, "", 0L);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0119.m473(f51short, 2300, 13, 2438));
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

    public final String q(int i2, JSONObject jSONObject) {
        ArrayList arrayListK = k("", n(i2, jSONObject).optJSONArray(C0008.m31(f51short, 2313, 5, 1509)));
        return AbstractC0449a.c(1, 1, 36, arrayListK.size(), arrayListK);
    }

    public String searchContent(String str, boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0115.m459(f51short, 2318, 13, 2598));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0101.m402(f51short, 2331, 13, 1625));
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

package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Music24bit;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0297t1;
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
import com.github.catvod.spider.merge.h0.C0085;
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
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.p022z.C0481b2;
import com.github.catvod.spider.merge.p022z.C0559r1;
import com.github.catvod.spider.merge.p022z.InterfaceC0476a2;
import com.github.catvod.spider.merge.p022z.Z1;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Music24bit extends Spider {
    public C0559r1 c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f71short = {2820, 2840, 2841, 2832, 2893, 823, 811, 811, 815, 812, 869, 880, 880, 816, 815, 826, 817, 881, 808, 806, 830, 873, 881, 828, 816, 818, 880, 827, 880, 827, 816, 808, 817, 880, 877, 879, 877, 873, 880, 825, 822, 812, 823, 875, 820, 881, 821, 815, 826, 824, 29993, 21611, 24972, 30898, 2122, 2130, 2132, 2126, 2116, 2168, 2132, 2114, 2131, 2131, 2126, 2121, 2112, -29180, 31444, 957, 954, 929, 906, 934, 954, 955, 946, 934, 24759, 21491, 30582, 28167, 1838, 1848, 1852, 1839, 1854, 1845, 1895, 25488, 20692, 28656, 26359, 27936, 926, 909, 907, 918, 908, 907, 965, 25170, 27477, 3294, 3264, 3281, 2972, 3004, 27710, 27798, 32602, 2455, 2458, 25058, 22225, 2266, 2250, 2249, 2257, 2753, 565, 1012, 950, 942, 936, 946, 952, 1012, 1471, 2200, 2278, 2940, 1183, 1260, 2066, 2137, 2116, 2133, 2141, 2173, 2117, 2115, 2137, 2131, 2066, 2156, 2115, 2074, 2058, 2156, 2115, 2074, 2156, 2123, 2155, 2158, 2125, 2157, 2074, 2066, 2117, 2114, 2140, 2066, 2156, 2115, 2074, 2058, 2156, 2115, 2074, 2066, 2072, 2155, 2158, 2066, 2157, 2075, 2073, 2066, 1187, 1251, 1279, 1279, 1275, 1272, 1204, 1201, 1188, 1188, 1232, 1237, 1193, 1196, 1239, 1239, 1239, 1272, 1207, 1205, 1238, 1184, 1239, 1189, 1187, 1261, 1255, 1258, 1256, 1271, 1254, 1275, 1208, 1271, 1276, 1258, 1277, 1271, 1254, 1215, 1258, 1186, 1232, 1237, 1193, 1196, 1239, 1239, 1239, 1272, 1207, 1205, 1238, 1185, 1186, 28295, 26546, -30512, 22705, 28618, 28249, -24679, 26818, 856, 894, 872, 895, 800, 844, 874, 872, 867, 889, 1324, 1294, 1307, 1288, 1293, 1293, 1280, 1358, 1364, 1359, 1361, 1345, 1353, 1334, 1288, 1295, 1285, 1294, 1302, 1298, 1345, 1327, 1333, 1345, 1360, 1361, 1359, 1361, 1370, 1345, 1334, 1288, 1295, 1367, 1365, 1370, 1345, 1305, 1367, 1365, 1352, 1345, 1312, 1297, 1297, 1293, 1284, 1334, 1284, 1283, 1322, 1288, 1301, 1358, 1364, 1362, 1366, 1359, 1362, 1367, 1345, 1353, 1322, 1321, 1333, 1324, 1325, 1357, 1345, 1293, 1288, 1290, 1284, 1345, 1318, 1284, 1282, 1290, 1294, 1352, 1345, 1314, 1289, 1299, 1294, 1292, 1284, 1358, 1360, 1363, 1363, 1359, 1361, 1359, 1361, 1359, 1361, 1345, 1330, 1280, 1287, 1280, 1299, 1288, 1358, 1364, 1362, 1366, 1359, 1362, 1367, 2969, 2990, 2989, 2990, 3001, 2990, 3001, 2505, 2533, 2533, 2529, 2531, 2543, 1686, 1769, 1782, 1665, 1723, 1686, 1682, 1680, 1698, 1684, 1691, 1771, 1695, 1687, 1704, 1715, 1770, 1715, 1768, 1771, 1691, 1725, 1704, 1678, 1678, 1718, 1773, 1665, 1673, 1771, 1710, 1679, 1760, 1769, 1695, 1779, 1682, 1696, 1683, 1772, 1705, 1664, 1675, 1715, 1725, 1771, 1709, 1761, 1680, 1719, 1727, 1771, 1768, 1714, 1675, 1678, 1695, 1726, 1684, 1673, 1704, 1705, 1682, 1696, 1709, 1690, 1679, 1665, 1694, 1673, 1716, 1682, 1683, 1696, 1711, 1675, 1783, 1697, 1687, 1774, 1690, 1707, 1768, 1687, 1693, 1679, 1775, 1718, 1711, 1765, 1765, 1429, 1417, 1417, 1421, 1422, 1479, 1490, 1490, 1424, 1416, 1422, 1428, 1438, 1491, 1484, 1483, 1486, 1491, 1438, 1426, 1424, 1490, 1040, 707, 700, 675, 761, 712, 735, 674, 724, 751, 701, 718, 742, 699, 706, 678, 718, 748, 734, 751, 702, 700, 766, 760, 763, 734, 678, 766, 760, 728, 737, 711, 764, 700, 738, 730, 718, 709, 743, 766, 757, 756, 751, 719, 728, 760, 719, 736, 733, 698, 766, 728, 718, 745, 697, 731, 710, 711, 744, 750, 734, 751, 706, 703, 713, 706, 725, 724, 699, 719, 727, 718, 730, 696, 702, 756, 678, 734, 727, 702, 744, 710, 715, 745, 766, 692, 706, 736, 766, 766, 735, 698, 761, 728, 751, 761, 761, 701, 710, 742, 729, 747, 744, 742, 713, 716, 678, 698, 727, 751, 743, 728, 751, 760, 739, 711, 751, 718, 742, 692, 760, 731, 704, 701, 743, 761, 761, 744, 697, 697, 760, 725, 1262, 1186, 1260, 1274, 1275, 1257, 1154, 1175, 3107, 3185, 3196, 3189, 3168, 3128, 3124, 3107, 3177, 3180, 3176, 3180, 3185, 3128, 3124, 3125, 749, 762, 748, 746, 755, 747, 2825, 2837, 2836, 2845, 2825, 819, 828, 816, 824, 3097, 3174, 3193, 3120, 3094, 3182, 3132, 3097, 3172, 3128, 3117, 3111, 3073, 3100, 3111, 3085, 3118, 3102, 3121, 3192, 3121, 3087, 3091, 3091, 3090, 3094, 3128, 3111, 3079, 3129, 3092, 3099, 3132, 3126, 3119, 3105, 3135, 3183, 3090, 3096, 3085, 3105, 3119, 3192, 3171, 3132, 3076, 3196, 3132, 3107, 3132, 3099, 3122, 3192, 3075, 3196, 3170, 3088, 3132, 3094, 3098, 3104, 3104, 3134, 3101, 3098, 3126, 3125, 3088, 3192, 3123, 3182, 3182, 3099, 3103, 3172, 3135, 3123, 3098, 3173, 3105, 3099, 3170, 3125, 3100, 3087, 3120, 3196, 3078, 3091, 3072, 3122, 3117, 3130, 3078, 3087, 3107, 3124, 3129, 3088, 3093, 3183, 3089, 3074, 3104, 3110, 3096, 3103, 3121, 3129, 3175, 3123, 3172, 3109, 3182, 3183, 3110, 3130, 3109, 3173, 3092, 3132, 3078, 3098, 3169, 3085, 3130, 3172, 3108, 3122, 3094, 2551, 2465, 2476, 2549, 2402, 2415, 708, 654, 660, 735, 723, 708, 649, 660, 735, 723, 708, 662, 660, 735, 719, 723, 1483, 1502, 1493, 1486, 1476, 1927, 1951, 1945, 1923, 1929, 1973, 1929, 1931, 1950, 1935, 1933, 1925, 1944, 1939, 1973, 986, 962, 964, 990, 980, 909, 28324, 25370, 1490, 1480, 2018, 2034, 2033, 2025, 3091, 3092, 3136, 3147, 3158, 27212, -25544, -25647, -32502, 636, 634, 556, 551, 570, -26474, -27203, -28826, 1339, 1339, 1339, 3118, 1526, 1151, 1119, 26394, 26546, 29822, -27383, 19626, 19739, 25237, 2013, 27803, 26012, 2029, 2039, 2217, 18096, -30926, 2201, 2179, -24601, 17988, 264, 283, 285, 256, 282, 285, 339, 2711, 2777, 2760, 2769, 2711, 2760, 2772, 2777, 2753, 2781, 2762, 2711, 2763, 2781, 2777, 2762, 2779, 2768, 2807, 2774, 2772, 2769, 2774, 2781, 2805, 2765, 2763, 2769, 2779, 2796, 2767, 2775, 2338, 2318, 2318, 2314, 2312, 2308, 718, 735, 735, 707, 710, 716, 718, 731, 710, 704, 705, 640, 709, 732, 704, 705, 3078, 3114, 3115, 3121, 3104, 3115, 3121, 3176, 3089, 3132, 3125, 3104, 2851, 2846, 2821, 2827, 2821, 2818, 1697, 1686, 1685, 1686, 1665, 1686, 1665, 432, 2181, 2215, 2226, 2209, 2212, 2212, 2217, 2279, 2301, 2278, 2296, 2280, 2272, 2207, 2209, 2214, 2220, 2215, 2239, 2235, 2280, 2182, 
    2204, 2280, 2297, 2296, 2278, 2296, 2291, 2280, 2207, 2209, 2214, 2302, 2300, 2291, 2280, 2224, 2302, 2300, 2273, 2280, 2185, 2232, 2232, 2212, 2221, 2207, 2221, 2218, 2179, 2209, 2236, 2279, 2301, 2299, 2303, 2278, 2299, 2302, 2280, 2272, 2179, 2176, 2204, 2181, 2180, 2276, 2280, 2212, 2209, 2211, 2221, 2280, 2191, 2221, 2219, 2211, 2215, 2273, 2280, 2187, 2208, 2234, 2215, 2213, 2221, 2279, 2297, 2298, 2298, 2278, 2296, 2278, 2296, 2278, 2296, 2280, 2203, 2217, 2222, 2217, 2234, 2209, 2279, 2301, 2299, 2303, 2278, 2299, 2302, 1884, 1914, 1900, 1915, 1828, 1864, 1902, 1900, 1895, 1917, 352, 302, 319, 294, 352, 319, 291, 302, 310, 298, 317, 352, 316, 298, 302, 317, 300, 295, 256, 289, 291, 294, 289, 298, 258, 314, 316, 294, 300, 256, 289, 298, 2810, 1171, 1182, 1168, 1159, 1183, 3173, 3193, 3188, 3180, 3184, 3175, 621, 610, 622, 614, 1249, 1260, 1416, 1439, 1417, 1423, 1430, 1422, 1510, 1505, 1524, 1505, 1504, 1510, 1419, 1434, 1436, 1438, 739, 749, 753, 767, 743, 762, 748, 1728, 1741, 1728, 28371, 26580, 1445, 1471, 2212, 2212, 27826, 30092, -31925, 25570, 27365, 32298, 27374, 28583, 25570, 28252, -2142, 27559, -24739, -31354, 23208, 29909, 21755, 29076, 25591, 27376, 756, 744, 745, 736, 701, 28205, 25491, 972, 1747, 1704, 24744, 24576, 29644, 1281, 1292, 28020, 23111, 3187, 3179, 3181, 3191, 3197, 3137, 3197, 3199, 3178, 3195, 3193, 3185, 3180, 3175, 3137, 3180, 3195, 3181, 3195, 3178, 1048, 1024, 1030, 1052, 1046, 1066, 1046, 1044, 1025, 1040, 1042, 1050, 1031, 1036, 1066, 1048, 1044, 1051, 1044, 1042, 1040, 3182, 3190, 3184, 3178, 3168, 3164, 3168, 3170, 3191, 3174, 3172, 3180, 3185, 3194, 3164, 3184, 3180, 3185, 3191, 1525, 1517, 1515, 1521, 1531, 1479, 1515, 1533, 1516, 1516, 1521, 1526, 1535, 25182, -28982, 31258, 2365, 3166, 3166, 3166, 1420, 1428, 1426, 1416, 1410, 1470, 1410, 1408, 1429, 1412, 1414, 1422, 1427, 1432, 1470, 1420, 1408, 1423, 1408, 1414, 1412, 21737, 31380, 32078, 29417, 2339, 2363, 2365, 2343, 2349, 2321, 2349, 2351, 2362, 2347, 2345, 2337, 2364, 2359, 2321, 2339, 2351, 2336, 2351, 2345, 2347, 1451, 1459, 1461, 1455, 1445, 1433, 1445, 1447, 1458, 1443, 1441, 1449, 1460, 1471, 1433, 1461, 1449, 1460, 1458, 21369, 32004, 25325, 24560, 31520, 23138, 17811, 29282, -30822, 28397, -27677, 21782, 3189, 3181, 3179, 3185, 3195, 3143, 3195, 3193, 3180, 3197, 3199, 3191, 3178, 3169, 3143, 3179, 3191, 3178, 3180, 3042, 3066, 3068, 3046, 3052, 3024, 3052, 3054, 3067, 3050, 3048, 3040, 3069, 3062, 3024, 3069, 3050, 3068, 3050, 3067, 25087, 22672, -24763, -30151, 25833, 23942, -26029, -28881, 22157, 30960, 22172, -29469, 789, 781, 779, 785, 795, 807, 795, 793, 780, 797, 799, 791, 778, 769, 807, 778, 797, 779, 797, 780, 1272, 1262, 1258, 1273, 1256, 1251, 1201, 1643, 1636, 1640, 1632, 1051, 1036, 1050, 1052, 1029, 1053, 2694, 2720, 2742, 2721, 2814, 2706, 2740, 2742, 2749, 2727, 2728, 2698, 2719, 2700, 2697, 2697, 2692, 2762, 2768, 2763, 2773, 2757, 2765, 2738, 2700, 2699, 2689, 2698, 2706, 2710, 2757, 2731, 2737, 2757, 2772, 2773, 2763, 2773, 2782, 2757, 2738, 2700, 2699, 2771, 2769, 2782, 2757, 2717, 2771, 2769, 2764, 2757, 2724, 2709, 2709, 2697, 2688, 2738, 2688, 2695, 2734, 2700, 2705, 2762, 2768, 2774, 2770, 2763, 2774, 2771, 2757, 2765, 2734, 2733, 2737, 2728, 2729, 2761, 2757, 2697, 2700, 2702, 2688, 2757, 2722, 2688, 2694, 2702, 2698, 2764, 2757, 2726, 2701, 2711, 2698, 2696, 2688, 2762, 2772, 2775, 2775, 2763, 2773, 2763, 2773, 2763, 2773, 2757, 2742, 2692, 2691, 2692, 2711, 2700, 2762, 2768, 2774, 2770, 2763, 2774, 2771, 725, 2416, 2375, 2372, 2375, 2384, 2375, 2384, 700, 641, 666, 660, 666, 669, 864, 844, 845, 855, 838, 845, 855, 782, 887, 858, 851, 838, 413, 396, 396, 400, 405, 415, 413, 392, 405, 403, 402, 467, 406, 399, 403, 402, 2063, 2083, 2083, 2087, 2085, 2089, 2696, 2758, 2775, 2766, 2696, 2775, 2763, 2758, 2782, 2754, 2773, 2696, 2772, 2754, 2758, 2773, 2756, 2767, 2792, 2761, 2763, 2766, 2761, 2754, 2794, 2770, 2772, 2766, 2756, 2792, 2761, 2754, 1166, 1152, 1180, 1170, 1162, 1175, 1153, 738, 755, 757, 759, 1456, 1463, 1442, 1463, 1462, 1456, 1371, 1366, 788, 776, 773, 797, 769, 790, 1427, 1438, 1424, 1415, 1439, 1247, 1235, 1226, 1241, 1230, 870, 894, 888, 866, 872, 817, 1371, 2191, 2184, 2195, 2232, 2196, 2184, 2185, 2176, 2196, 25420, 20488, 28460, 26155, 28156, 28204, 23912, 25164, 28658, 24732, 1998, 2002, 2003, 2010, 1927, 1162, 1177, 1183, 1154, 1176, 1183, 1176, 2060, 2064, 2065, 2072, 2060, 1566, 1633, 1662, 1572, 1557, 1538, 1663, 1545, 1586, 1632, 1555, 1595, 1638, 1567, 1659, 1555, 1585, 1539, 1586, 1635, 1633, 1571, 1573, 1574, 1539, 1659, 1571, 1573, 1541, 1596, 1562, 1569, 1633, 1599, 1543, 1555, 1560, 1594, 1571, 1576, 1577, 1586, 1554, 1541, 1573, 1554, 1597, 1536, 1639, 1571, 1541, 1555, 1588, 1636, 1542, 1563, 1562, 1589, 1587, 1539, 1586, 1567, 1634, 1556, 1567, 1544, 1545, 1638, 1554, 1546, 1555, 1543, 1637, 1635, 1577, 1659, 1539, 1546, 1635, 1589, 1563, 1558, 1588, 1571, 1641, 1567, 1597, 1571, 1571, 1538, 1639, 1572, 1541, 1586, 1572, 1572, 1632, 1563, 1595, 1540, 1590, 1589, 1595, 1556, 1553, 1659, 1639, 1546, 1586, 1594, 1541, 1586, 1573, 1598, 1562, 1586, 1555, 1595, 1641, 1573, 1542, 1565, 1632, 1594, 1572, 1572, 1589, 1636, 1636, 1573, 1544, 761, 693, 763, 821, 820, 806, 845, 856, 2798, 2748, 2737, 2744, 2733, 2805, 2809, 2798, 2724, 2721, 2725, 2721, 2748, 2805, 2809, 458, 470, 470, 466, 465, 408, 397, 397, 461, 466, 455, 460, 396, 469, 475, 451, 404, 396, 449, 461, 463, 397, 454, 397, 454, 461, 469, 460, 397, 400, 402, 400, 404, 397, 452, 459, 465, 458, 406, 457, 396, 456, 466, 455, 453, 30486, -28141, 27831, 24841, 28362, 18071, 28205, -28606, 24415, -30257, 21209, 25025, 18839, -25802, 30414, 25390, -29249, 18031, -31742, 2081, 2081, 2056, 2125, 2125, 2127, 2123, 3133, 3080, 3105, 3172, 3172, 3174, 3170, 2853, 2853, 2828, 2889, 2889, 2890, 2845, 2025, 3174, 3151, 3082, 3082, 3081, 3166, 833, 833, 818, 3105, 1761, 1682, 3317, 1980, 381, 2159, 2169, 2174, 
    2175, 2147, 2174, 2081, 2172, 2147, 2149, 2146, 2168, 2153, 2174, 2135, 2130, 2098, 2129, 2086, 2098, 2128, 2175, 2086, 2084, 2135, 2130, 2096, 2129, 2087, 2099, 2085, 2128, 2175, 2086, 2096, 2083, 2152, 2149, 2170, 2098, 3199, 3143, 3080, 452, 443, 420, 467, 489, 452, 448, 450, 496, 454, 457, 441, 461, 453, 506, 481, 440, 481, 442, 441, 457, 495, 506, 476, 476, 484, 447, 467, 475, 441, 508, 477, 434, 443, 461, 417, 448, 498, 449, 446, 507, 466, 473, 481, 495, 441, 511, 435, 450, 485, 493, 441, 442, 480, 473, 476, 461, 492, 454, 475, 506, 507, 448, 498, 511, 456, 477, 467, 460, 475, 486, 448, 449, 498, 509, 473, 421, 499, 453, 444, 456, 505, 442, 453, 463, 477, 445, 484, 509, 439, 439, 2881, 2878, 2849, 2902, 2924, 2881, 2885, 2887, 2933, 2883, 2892, 2876, 2888, 2880, 2943, 2916, 2877, 2916, 2879, 2876, 2892, 2922, 2943, 2905, 2905, 2913, 2874, 2902, 2910, 2876, 2937, 2904, 2871, 2878, 2888, 2852, 2885, 2935, 2884, 2875, 2942, 2903, 2908, 2916, 2922, 2876, 2938, 2870, 2887, 2912, 2920, 2876, 2879, 2917, 2908, 2905, 2888, 2921, 2883, 2910, 2943, 2942, 2885, 2935, 2938, 2893, 2904, 2902, 2889, 2910, 2915, 2885, 2884, 2935, 2936, 2908, 2848, 2934, 2880, 2873, 2893, 2940, 2879, 2880, 2890, 2904, 2872, 2913, 2936, 2866, 2866, 595, 593, 580, 597, 599, 607, 578, 601, 597, 579, 857, 842, 844, 849, 843, 844, 872, 849, 859, 843, 1761, 1698, 1722, 1724, 1702, 1708, 1789, 1787, 1709, 1702, 1723, 1680, 1708, 1696, 1697, 1705, 1702, 1704, 1169, 1171, 1156, 1177, 1183, 1182, 1920, 1922, 1943, 1926, 1924, 1932, 1937, 1946, 1952, 1932, 1933, 1943, 1926, 1933, 1943, 492, 501, 511, 457, 494, 496, 972, 987, 973, 971, 978, 970, 2362, 2345, 2351, 2354, 2344, 2351, 2344, 1602, 1597, 1570, 1656, 1609, 1630, 1571, 1621, 1646, 1596, 1615, 1639, 1594, 1603, 1575, 1615, 1645, 1631, 1646, 1599, 1597, 1663, 1657, 1658, 1631, 1575, 1663, 1657, 1625, 1632, 1606, 1661, 1597, 1635, 1627, 1615, 1604, 1638, 1663, 1652, 1653, 1646, 1614, 1625, 1657, 1614, 1633, 1628, 1595, 1663, 1625, 1615, 1640, 1592, 1626, 1607, 1606, 1641, 1647, 1631, 1646, 1603, 1598, 1608, 1603, 1620, 1621, 1594, 1614, 1622, 1615, 1627, 1593, 1599, 1653, 1575, 1631, 1622, 1599, 1641, 1607, 1610, 1640, 1663, 1589, 1603, 1633, 1663, 1663, 1630, 1595, 1656, 1625, 1646, 1656, 1656, 1596, 1607, 1639, 1624, 1642, 1641, 1639, 1608, 1613, 1575, 1595, 1622, 1646, 1638, 1625, 1646, 1657, 1634, 1606, 1646, 1615, 1639, 1589, 1657, 1626, 1601, 1596, 1638, 1656, 1656, 1641, 1592, 1592, 1657, 1620, 2508, 2432, 2510, 1422, 1423, 1437, 1526, 1507, 1541, 1623, 1626, 1619, 1606, 1566, 1554, 1555, 1555, 1541, 1615, 1610, 1614, 1610, 1623, 1566, 1554, 3033, 3013, 3013, 3009, 3010, 2955, 2974, 2974, 3038, 3009, 3028, 3039, 2975, 3014, 3016, 3024, 2951, 2975, 3026, 3038, 3036, 2974, 3029, 2974, 3029, 3038, 3014, 3039, 2974, 2947, 2945, 2947, 2951, 2974, 3031, 3032, 3010, 3033, 2949, 3034, 2975, 3035, 3009, 3028, 3030, 1605, 1604, 1621, 1600, 1608, 1613, 1634, 1614, 1615, 1621, 1604, 1615, 1621, 1760, 1734, 1744, 1735, 1688, 1780, 1746, 1744, 1755, 1729, 2202, 2232, 2221, 2238, 2235, 2235, 2230, 2296, 2274, 2297, 2279, 2295, 2303, 2176, 2238, 2233, 2227, 2232, 2208, 2212, 2295, 2201, 2179, 2295, 2278, 2279, 2297, 2279, 2284, 2295, 2176, 2238, 2233, 2273, 2275, 2284, 2295, 2223, 2273, 2275, 2302, 2295, 2198, 2215, 2215, 2235, 2226, 2176, 2226, 2229, 2204, 2238, 2211, 2296, 2274, 2276, 2272, 2297, 2276, 2273, 2295, 2303, 2204, 2207, 2179, 2202, 2203, 2299, 2295, 2235, 2238, 2236, 2226, 2295, 2192, 2226, 2228, 2236, 2232, 2302, 2295, 2196, 2239, 2213, 2232, 2234, 2226, 2296, 2278, 2277, 2277, 2297, 2279, 2297, 2279, 2297, 2279, 2295, 2180, 2230, 2225, 2230, 2213, 2238, 2296, 2274, 2276, 2272, 2297, 2276, 2273, 919, 3000, 2959, 2956, 2959, 2968, 2959, 2968, 2067, 2097, 2097, 2103, 2082, 2086, 2066, 2051, 2078, 2066, 2121, 2062, 2066, 2059, 2058, 2122, 2055, 2070, 2070, 2058, 2063, 2053, 2055, 2066, 2063, 2057, 2056, 2121, 2078, 2062, 2066, 2059, 2058, 2125, 2078, 2059, 2058, 2122, 2055, 2070, 2070, 2058, 2063, 2053, 2055, 2066, 2063, 2057, 2056, 2121, 2078, 2059, 2058, 2141, 2071, 2139, 2134, 2120, 2143, 2122, 2063, 2059, 2055, 2049, 2051, 2121, 2055, 2064, 2063, 2048, 2122, 2063, 2059, 2055, 2049, 2051, 2121, 2065, 2051, 2052, 2070, 2122, 2124, 2121, 2124, 2141, 2071, 2139, 2134, 2120, 2142, 1326, 1292, 1292, 1290, 1311, 1307, 1346, 1315, 1294, 1281, 1288, 1306, 1294, 1288, 1290, 2006, 1988, 1921, 2031, 2018, 1920, 2006, 1988, 1943, 2013, 1937, 1948, 1922, 1941, 1920, 1993, 1986, 1943, 2013, 1937, 1948, 1922, 1940, 1245, 1265, 1265, 1269, 1271, 1275, 1227, 1228, 1230, 1222, 1248, 1228, 1229, 1239, 1222, 1229, 1239, 2911, 2909, 2888, 2905, 2907, 2899, 2894, 2901, 2905, 2895, 319, 320, 351, 309, 279, 293, 267, 287, 288, 276, 264, 264, 281, 312, 265, 315, 294, 267, 322, 310, 308, 315, 288, 327, 272, 292, 258, 324, 314, 283, 318, 260, 290, 346, 297, 276, 285, 315, 290, 272, 260, 312, 316, 304, 310, 282, 282, 328, 289, 322, 327, 288, 292, 293, 272, 267, 325, 296, 313, 299, 328, 279, 292, 289, 316, 314, 313, 318, 322, 318, 327, 262, 280, 329, 258, 260, 279, 265, 261, 293, 292, 285, 311, 274, 310, 287, 258, 318, 310, 285, 316, 296, 318, 311, 308, 279, 327, 293, 327, 260, 314, 278, 319, 274, 285, 292, 306, 290, 292, 308, 332, 2484, 2488, 2488, 2492, 2494, 2482, 2002, 1992, 2005, 1988, 874, 886, 886, 882, 2642, 2625, 2631, 2650, 2624, 2631, 2659, 2650, 2640, 2624, 1290, 1353, 1361, 1367, 1357, 1351, 1302, 1296, 1350, 1357, 1360, 1403, 1351, 1355, 1354, 1346, 1357, 1347, 28562, 20681, 22517, 28760, 20591, 32274, 627, 625, 612, 629, 631, 639, 610, 617, 22764, 30353, 29003, 32492, 23380, 29993, 26522, 22721, 24573, 30800, 22631, 30234, 21396, 2604, 2614, 24190, 28006, 17712, 14871, 27746, 21311, 14871, 2644, 2675, 2671, 2681, 2680, 2674, 29023, -30784, 22838, 25375, 27160, 27205, 
    25375, 28321, 22816, -25219, -31842, 2668, 2672, 2685, 2661, 2681, 2670, 2655, 2675, 2674, 2664, 2681, 2674, 2664, 553, 575, 571, 552, 569, 562, 537, 565, 564, 558, 575, 564, 558};
    public static final HashMap e = new HashMap();
    public static String[] f = {"周杰伦", "林俊杰", "陈奕迅", "郓紫棋", "薛之谦"};
    public static final ArrayList g = new ArrayList();
    public String a = "";
    public String b = "";
    public final InterfaceC0476a2 d = new InterfaceC0476a2() { // from class: com.github.catvod.spider.Music24bit.1
        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0476a2
        public void addItem(String str) {
            Music24bit.g.add(str);
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0476a2
        public List<String> getItems() {
            return Music24bit.g;
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0476a2
        public void removeItems(List<String> list) {
            ArrayList arrayList = Music24bit.g;
            arrayList.removeAll(list);
            if (arrayList.isEmpty()) {
                arrayList.addAll(Arrays.asList(Music24bit.f));
            }
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0476a2
        public void resetItems() {
            ArrayList arrayList = Music24bit.g;
            arrayList.clear();
            arrayList.addAll(Arrays.asList(Music24bit.f));
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0476a2
        public void saveConfig() {
            HashMap map = Music24bit.e;
            Music24bit.this.getClass();
            Music24bit.g();
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0476a2
        public void setItems(List<String> list) {
            ArrayList arrayList = Music24bit.g;
            arrayList.clear();
            arrayList.addAll(list);
        }
    };

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        k kVar = new k();
        kVar.n("song:" + str);
        kVar.o(str);
        kVar.p("https://open.wya6.com/d/down/2026/fish4k.jpeg");
        kVar.s("点击搜索");
        arrayList.add(kVar);
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b("music_setting", "设置", null));
        com.github.catvod.spider.merge.D.b.z("hot_songs", "本周热榜", null, arrayList2);
        for (String str : g) {
            arrayList2.add(new com.github.catvod.spider.merge.p001b.b(com.github.catvod.spider.merge.D.b.B("search:", str), str, null));
        }
        String strC = c(this.a, e());
        ArrayList<String> arrayList3 = new ArrayList();
        arrayList3.addAll(b(strC, "本周歌手榜", null));
        for (String str2 : arrayList3) {
            k kVar = new k();
            kVar.n("artist:" + str2);
            kVar.o(str2);
            kVar.p(d(str2));
            kVar.s("歌手");
            arrayList.add(kVar);
        }
        return com.github.catvod.spider.merge.p001b.g.z(arrayList2, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x015d  */
    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws JSONException {
        String strA;
        String strM558 = "lrc";
        String[] strArrSplit = str2.split("\\|");
        if (strArrSplit.length < 4) {
            return com.github.catvod.spider.merge.p001b.g.d("无效的ID格式");
        }
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        String str5 = strArrSplit[2];
        String strM427 = str2.endsWith("|low") ? "b" : "c";
        StringBuilder sb = new StringBuilder();
        String str6 = this.a;
        String strM292 = "/music/";
        String strM177 = "/";
        com.github.catvod.spider.merge.D.b.A(sb, str6, strM292, strM427, strM177);
        sb.append(str3);
        String strC = c(sb.toString(), e());
        String str7 = "";
        if (strC == null || strC.isEmpty()) {
            strA = "";
        } else {
            String strReplace = strC.replace("\\\"", "\"").replace("\\/", strM177);
            Matcher matcher = Pattern.compile("\"itemMusic\"\\s*:\\s*\\{[^}]*\"url\"\\s*:\\s*\"([^\"]+)\"").matcher(strReplace);
            if (matcher.find()) {
                strA = a(matcher.group(1));
            } else {
                Matcher matcher2 = Pattern.compile("(https?://[^\"'\\\\\\s<>]+\\.(flac|mp3|wav|m4a)[^\"'\\\\\\s<>]*)").matcher(strReplace);
                if (matcher2.find()) {
                    strA = a(matcher2.group(1));
                } else {
                    strA = "";
                }
            }
        }
        if (strA.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d("无法获取播放链接");
        }
        String strM31 = "User-Agent";
        String strM414 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36";
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(strM31, strM414);
        String str8 = this.a + strM177;
        String strM390 = "Referer";
        mapS.put(strM390, str8);
        if (!this.b.isEmpty()) {
            mapS.put("Cookie", this.b);
        }
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(FishCrypto.u("N1.YcNJHzLC3GOpk2k03CepVVn5YQ3vW81G+JxK4qXSke3u9Hog30jSVGfLQpqJxuBWYFQlJKxwS/yO6Bs0OEW7nw==", strA));
        gVar.h(mapS);
        JSONObject jSONObject = new JSONObject(gVar.r());
        try {
            HashMap map = new HashMap();
            map.put(strM31, strM414);
            map.put(strM390, "https://music.163.com/");
            JSONObject jSONObjectOptJSONObject = new JSONObject(c(FishCrypto.v("N1.tER/Yb0Ck6O+CaSb31suvS+suUlJq1oWCHjsxybBUuBmP7sUCd4VKJecSbO2DOXY6BZCW53y+SZ3eKFds9OmssR7tUbtt0KkTfekDA+7ZbjUbunJbCk9uVM0jtte44uX") + "?s=" + URLEncoder.encode(str4 + " " + str5, "UTF-8") + "&type=1&limit=10", map)).optJSONObject("result");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray("songs");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2 != null && str4.equalsIgnoreCase(jSONObjectOptJSONObject2.optString("name"))) {
                        JSONObject jSONObjectOptJSONObject3 = new JSONObject(c(FishCrypto.v("N1.gA9kN3ozpVKpZyIf/fXDDEAopPnCLkaxvh8EOZvx/4kS+ktkLe/T+5GkAMwwiJMabG/d99LH3hdM2vL5bKXg+QDWezmQXtcnGB8FUwqOHfn0d3r98qmr2CkQM6Zm3seA") + "?id=" + jSONObjectOptJSONObject2.optLong("id") + "&lv=1&kv=1&tv=-1", map)).optJSONObject(strM558);
                        String strOptString = jSONObjectOptJSONObject3 == null ? "" : jSONObjectOptJSONObject3.optString("lyric");
                        if (!TextUtils.isEmpty(strOptString)) {
                            str7 = strOptString;
                            break;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (!str7.isEmpty()) {
            jSONObject.put(strM558, str7);
        }
        return jSONObject.toString();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str;
        String str2;
        String str3;
        k kVar;
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        k kVar2;
        JSONArray jSONArrayOptJSONArray2;
        String str12;
        String str13;
        ArrayList arrayList2;
        String str14;
        String str15;
        String str16 = list.get(0);
        if (str16.startsWith("music_category_")) {
            AbstractC0302v0.g0(str16, new i(12, this));
            return "";
        }
        String strM416 = "music:";
        boolean zStartsWith = str16.startsWith(strM416);
        String strM182 = "歌曲: ";
        String strM511 = "|low";
        String strM471 = "16bit普通音质";
        String strM36 = "24bit高音质";
        String strM427 = "$$$";
        String strM355 = "$";
        String strM288 = "|";
        if (zStartsWith) {
            String strSubstring = str16.substring(6);
            String[] strArrSplit = strSubstring.split("\\|");
            if (strArrSplit.length < 4) {
                return com.github.catvod.spider.merge.p001b.g.d("无效的音乐信息");
            }
            String str17 = strArrSplit[0];
            String str18 = strArrSplit[1];
            String str19 = strArrSplit[2];
            String str20 = strArrSplit[3];
            String strD = d(str19);
            k kVar3 = new k();
            kVar3.n(strM416.concat(strSubstring));
            kVar3.o(str18);
            kVar3.p(strD);
            kVar3.j(str19);
            kVar3.l(strM182 + str18 + "\n歌手: " + str19 + "\n专辑: " + str20);
            kVar3.i("音乐");
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            arrayList3.add(strM36);
            arrayList4.add(str18 + strM355 + str17 + strM288 + str18 + strM288 + str19 + strM288 + str20);
            arrayList3.add(strM471);
            StringBuilder sb = new StringBuilder();
            sb.append(str18);
            com.github.catvod.spider.merge.D.b.A(sb, strM355, str17, strM288, str18);
            com.github.catvod.spider.merge.D.b.A(sb, strM288, str19, strM288, str20);
            sb.append(strM511);
            arrayList4.add(sb.toString());
            kVar3.q(TextUtils.join(strM427, arrayList3));
            kVar3.r(TextUtils.join(strM427, arrayList4));
            boolean z = FishCrypto.a;
            N1.d(kVar3);
            return com.github.catvod.spider.merge.p001b.g.s(kVar3);
        }
        k kVarA = AbstractC0449a.a(str16);
        boolean zStartsWith2 = str16.startsWith("artist:");
        String strM417 = "/api/player/searchOnlineMusicTwo";
        String strM83 = "Cookie";
        String strM223 = "application/json";
        String strM126 = "Content-Type";
        String strM31 = "Origin";
        String strM224 = "Referer";
        String strM418 = "/";
        String strM177 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36";
        String str21 = strM511;
        String strM408 = "User-Agent";
        String strM467 = "/api/player/searchOnlineMusicOne";
        String str22 = strM288;
        String strM289 = "#";
        String strM503 = "album";
        String str23 = strM355;
        String strM512 = "player";
        String str24 = strM503;
        String strM382 = "name";
        String str25 = strM512;
        String strM339 = "id";
        String str26 = strM382;
        String strM225 = "result";
        String str27 = "";
        String strM186 = "status";
        String str28 = strM339;
        String strM1 = "page";
        String str29 = strM225;
        String strM10 = "keyword";
        String strM37 = " - ";
        if (zStartsWith2) {
            String strSubstring2 = str16.substring(7);
            kVarA.o(strSubstring2);
            kVarA.p(d(strSubstring2));
            kVarA.j(strSubstring2);
            String str30 = strM37;
            kVarA.l("歌手: " + strSubstring2 + "\n\n搜索该歌手的所有歌曲，按音质分类展示");
            kVarA.i("歌手");
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            String strM = com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.a, strM467);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(strM10, strSubstring2);
            jSONObject.put(strM1, 1);
            HashMap mapS = com.github.catvod.spider.merge.D.b.s(strM408, strM177);
            mapS.put(strM224, this.a + strM418);
            mapS.put(strM31, this.a);
            mapS.put(strM126, strM223);
            if (!this.b.isEmpty()) {
                mapS.put(strM83, this.b);
            }
            JSONObject jSONObject2 = new JSONObject(f(strM, jSONObject.toString(), mapS));
            if (jSONObject2.optBoolean(strM186, false)) {
                str10 = str29;
                JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray(str10);
                if (jSONArrayOptJSONArray3 != null) {
                    int i = 0;
                    while (i < jSONArrayOptJSONArray3.length()) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray3.getJSONObject(i);
                        String str31 = str27;
                        String str32 = str28;
                        String strOptString = jSONObject3.optString(str32, str31);
                        String str33 = str26;
                        String strOptString2 = jSONObject3.optString(str33, str31);
                        JSONArray jSONArray = jSONArrayOptJSONArray3;
                        String str34 = str25;
                        String strOptString3 = jSONObject3.optString(str34, str31);
                        str24 = str24;
                        String strOptString4 = jSONObject3.optString(str24, str31);
                        if (strOptString.isEmpty() || strOptString2.isEmpty()) {
                            str14 = str22;
                            str15 = str23;
                        } else {
                            String strC = com.github.catvod.spider.merge.D.b.C(strOptString2, str30, strOptString3);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(strC);
                            str15 = str23;
                            sb2.append(str15);
                            sb2.append(strOptString);
                            str14 = str22;
                            sb2.append(str14);
                            sb2.append(strOptString2);
                            sb2.append(str14);
                            sb2.append(strOptString3);
                            sb2.append(str14);
                            sb2.append(strOptString4);
                            arrayList5.add(sb2.toString());
                        }
                        i++;
                        str23 = str15;
                        str22 = str14;
                        jSONArrayOptJSONArray3 = jSONArray;
                        str26 = str33;
                        str25 = str34;
                        str27 = str31;
                        str28 = str32;
                    }
                }
                str7 = str22;
                str8 = str23;
                str9 = str28;
            } else {
                str7 = str22;
                str8 = str23;
                str9 = str28;
                str10 = str29;
            }
            String str35 = str27;
            String str36 = str25;
            String str37 = str26;
            String strM2 = com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.a, strM417);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(strM10, strSubstring2);
            jSONObject4.put(strM1, 1);
            JSONObject jSONObject5 = new JSONObject(f(strM2, jSONObject4.toString(), mapS));
            if (jSONObject5.optBoolean(strM186, false) && (jSONArrayOptJSONArray2 = jSONObject5.optJSONArray(str10)) != null) {
                int i2 = 0;
                while (i2 < jSONArrayOptJSONArray2.length()) {
                    JSONObject jSONObject6 = jSONArrayOptJSONArray2.getJSONObject(i2);
                    String str38 = str35;
                    String strOptString5 = jSONObject6.optString(str9, str38);
                    String str39 = str37;
                    String strOptString6 = jSONObject6.optString(str39, str38);
                    String str40 = str36;
                    String strOptString7 = jSONObject6.optString(str40, str38);
                    String str41 = str24;
                    String strOptString8 = jSONObject6.optString(str41, str38);
                    if (strOptString5.isEmpty() || strOptString6.isEmpty()) {
                        str12 = str21;
                        str13 = str30;
                        arrayList2 = arrayList6;
                    } else {
                        str13 = str30;
                        String strC2 = com.github.catvod.spider.merge.D.b.C(strOptString6, str13, strOptString7);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(strC2);
                        sb3.append(str8);
                        sb3.append(strOptString5);
                        sb3.append(str7);
                        sb3.append(strOptString6);
                        com.github.catvod.spider.merge.D.b.A(sb3, str7, strOptString7, str7, strOptString8);
                        str12 = str21;
                        sb3.append(str12);
                        String string = sb3.toString();
                        arrayList2 = arrayList6;
                        arrayList2.add(string);
                    }
                    i2++;
                    str21 = str12;
                    arrayList6 = arrayList2;
                    str37 = str39;
                    str24 = str41;
                    str30 = str13;
                    jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                    str35 = str38;
                    str36 = str40;
                }
            }
            ArrayList arrayList7 = arrayList6;
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            if (arrayList5.isEmpty()) {
                str11 = strM289;
            } else {
                arrayList8.add(strM36);
                str11 = strM289;
                arrayList9.add(TextUtils.join(str11, arrayList5));
            }
            if (!arrayList7.isEmpty()) {
                arrayList8.add(strM471);
                arrayList9.add(TextUtils.join(str11, arrayList7));
            }
            if (arrayList8.isEmpty()) {
                kVar2 = kVarA;
            } else {
                kVar2 = kVarA;
                kVar2.q(TextUtils.join(strM427, arrayList8));
                kVar2.r(TextUtils.join(strM427, arrayList9));
            }
            N1.d(kVar2);
            return com.github.catvod.spider.merge.p001b.g.s(kVar2);
        }
        String str42 = str22;
        String str43 = str24;
        String str44 = str25;
        String str45 = str26;
        String str46 = str28;
        if (!str16.startsWith("song:")) {
            return com.github.catvod.spider.merge.p001b.g.d("无效的ID格式");
        }
        String strSubstring3 = str16.substring(5);
        kVarA.o(strSubstring3);
        kVarA.p(d(strSubstring3.contains(strM37) ? strSubstring3.split(strM37)[0].trim() : strSubstring3));
        kVarA.l(strM182.concat(strSubstring3));
        kVarA.i("歌曲");
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        HashMap mapS2 = com.github.catvod.spider.merge.D.b.s(strM408, strM177);
        StringBuilder sb4 = new StringBuilder();
        ArrayList arrayList12 = arrayList11;
        sb4.append(this.a);
        sb4.append(strM418);
        mapS2.put(strM224, sb4.toString());
        mapS2.put(strM31, this.a);
        mapS2.put(strM126, strM223);
        if (!this.b.isEmpty()) {
            mapS2.put(strM83, this.b);
        }
        String strM3 = com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.a, strM467);
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put(strM10, strSubstring3);
        jSONObject7.put(strM1, 1);
        JSONObject jSONObject8 = new JSONObject(f(strM3, jSONObject7.toString(), mapS2));
        String str47 = strM186;
        boolean zOptBoolean = jSONObject8.optBoolean(str47, false);
        String strM422 = "]";
        String strM183 = " [";
        if (zOptBoolean) {
            String str48 = str29;
            JSONArray jSONArrayOptJSONArray4 = jSONObject8.optJSONArray(str48);
            if (jSONArrayOptJSONArray4 != null) {
                int i3 = 0;
                while (i3 < jSONArrayOptJSONArray4.length()) {
                    JSONObject jSONObject9 = jSONArrayOptJSONArray4.getJSONObject(i3);
                    JSONArray jSONArray2 = jSONArrayOptJSONArray4;
                    String str49 = str27;
                    String str50 = str46;
                    String strOptString9 = jSONObject9.optString(str50, str49);
                    String str51 = str48;
                    String str52 = str45;
                    String strOptString10 = jSONObject9.optString(str52, str49);
                    String str53 = str47;
                    String str54 = str44;
                    String strOptString11 = jSONObject9.optString(str54, str49);
                    String str55 = str43;
                    String strOptString12 = jSONObject9.optString(str55, str49);
                    if (strOptString9.isEmpty() || strOptString10.isEmpty()) {
                        str5 = str23;
                        str6 = str42;
                    } else {
                        String str56 = strOptString10 + strM37 + strOptString11 + strM183 + strOptString12 + strM422;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str56);
                        str5 = str23;
                        sb5.append(str5);
                        sb5.append(strOptString9);
                        str6 = str42;
                        sb5.append(str6);
                        sb5.append(strOptString10);
                        sb5.append(str6);
                        sb5.append(strOptString11);
                        sb5.append(str6);
                        sb5.append(strOptString12);
                        arrayList10.add(sb5.toString());
                    }
                    i3++;
                    str42 = str6;
                    str27 = str49;
                    str23 = str5;
                    jSONArrayOptJSONArray4 = jSONArray2;
                    strM422 = strM422;
                    str43 = str55;
                    str44 = str54;
                    str45 = str52;
                    str46 = str50;
                    str48 = str51;
                    str47 = str53;
                }
            }
            str = strM422;
            str2 = str47;
            str29 = str48;
        } else {
            str = strM422;
            str2 = str47;
        }
        String str57 = str23;
        String str58 = str27;
        String str59 = str42;
        String str60 = str43;
        String str61 = str44;
        String str62 = str45;
        String str63 = str46;
        String strM4 = com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.a, strM417);
        JSONObject jSONObject10 = new JSONObject();
        jSONObject10.put(strM10, strSubstring3);
        jSONObject10.put(strM1, 1);
        JSONObject jSONObject11 = new JSONObject(f(strM4, jSONObject10.toString(), mapS2));
        int i4 = 0;
        if (jSONObject11.optBoolean(str2, false) && (jSONArrayOptJSONArray = jSONObject11.optJSONArray(str29)) != null) {
            for (jSONArrayOptJSONArray = jSONObject11.optJSONArray(str29); i4 < jSONArrayOptJSONArray.length(); jSONArrayOptJSONArray = jSONArrayOptJSONArray) {
                JSONObject jSONObject12 = jSONArrayOptJSONArray.getJSONObject(i4);
                String str64 = str63;
                String strOptString13 = jSONObject12.optString(str64, str58);
                String str65 = str62;
                String strOptString14 = jSONObject12.optString(str65, str58);
                String str66 = str61;
                String strOptString15 = jSONObject12.optString(str66, str58);
                str60 = str60;
                String strOptString16 = jSONObject12.optString(str60, str58);
                if (strOptString13.isEmpty() || strOptString14.isEmpty()) {
                    arrayList = arrayList12;
                    str4 = str21;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(strOptString14 + strM37 + strOptString15 + strM183 + strOptString16 + str);
                    sb6.append(str57);
                    sb6.append(strOptString13);
                    sb6.append(str59);
                    sb6.append(strOptString14);
                    com.github.catvod.spider.merge.D.b.A(sb6, str59, strOptString15, str59, strOptString16);
                    str4 = str21;
                    sb6.append(str4);
                    arrayList = arrayList12;
                    arrayList.add(sb6.toString());
                }
                i4++;
                str21 = str4;
                arrayList12 = arrayList;
                str63 = str64;
                str62 = str65;
                str61 = str66;
            }
        }
        ArrayList arrayList13 = arrayList12;
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        if (arrayList10.isEmpty()) {
            str3 = strM289;
        } else {
            arrayList14.add(strM36);
            str3 = strM289;
            arrayList15.add(TextUtils.join(str3, arrayList10));
        }
        if (!arrayList13.isEmpty()) {
            arrayList14.add(strM471);
            arrayList15.add(TextUtils.join(str3, arrayList13));
        }
        if (arrayList14.isEmpty()) {
            kVar = kVarA;
        } else {
            kVar = kVarA;
            kVar.q(TextUtils.join(strM427, arrayList14));
            kVar.r(TextUtils.join(strM427, arrayList15));
        }
        N1.d(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        final int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -826999899:
                if (str.equals("music_category_sort")) {
                    b = 0;
                }
                break;
            case -362791508:
                if (str.equals("music_category_manage")) {
                    b = 1;
                }
                break;
            case 131586088:
                if (str.equals("music_category_reset")) {
                    b = 2;
                }
                break;
        }
        switch (b) {
            case 0:
                InitOrigin.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.u.J
                    public final /* synthetic */ Music24bit b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                C0559r1 c0559r1 = this.b.c;
                                c0559r1.getClass();
                                InitOrigin.run(new Z1(c0559r1, 1));
                                break;
                            case 1:
                                this.b.c.u();
                                break;
                            default:
                                C0559r1 c0559r2 = this.b.c;
                                c0559r2.getClass();
                                InitOrigin.run(new Z1(c0559r2, 0));
                                break;
                        }
                    }
                });
                break;
            case 1:
                InitOrigin.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.u.J
                    public final /* synthetic */ Music24bit b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                C0559r1 c0559r1 = this.b.c;
                                c0559r1.getClass();
                                InitOrigin.run(new Z1(c0559r1, 1));
                                break;
                            case 1:
                                this.b.c.u();
                                break;
                            default:
                                C0559r1 c0559r2 = this.b.c;
                                c0559r2.getClass();
                                InitOrigin.run(new Z1(c0559r2, 0));
                                break;
                        }
                    }
                });
                break;
            case 2:
                InitOrigin.run(new Runnable(this) { // from class: com.github.catvod.spider.merge.u.J
                    public final /* synthetic */ Music24bit b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                C0559r1 c0559r1 = this.b.c;
                                c0559r1.getClass();
                                InitOrigin.run(new Z1(c0559r1, 1));
                                break;
                            case 1:
                                this.b.c.u();
                                break;
                            default:
                                C0559r1 c0559r2 = this.b.c;
                                c0559r2.getClass();
                                InitOrigin.run(new Z1(c0559r2, 0));
                                break;
                        }
                    }
                });
                break;
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0530  */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        String strM379;
        JSONArray jSONArrayOptJSONArray;
        String string;
        ArrayList arrayList = new ArrayList();
        int i = Integer.parseInt(str2);
        int i2 = 0;
        if (str.equals("music_setting")) {
            if (i > 1) {
                return com.github.catvod.spider.merge.p001b.g.y(arrayList);
            }
            ArrayList arrayList2 = g;
            if (arrayList2.isEmpty()) {
                string = "未设置";
            } else {
                StringBuilder sb = new StringBuilder();
                while (i2 < Math.min(arrayList2.size(), 4)) {
                    if (i2 > 0) {
                        sb.append(">");
                    }
                    sb.append((String) arrayList2.get(i2));
                    i2++;
                }
                if (arrayList2.size() > 4) {
                    sb.append("...");
                }
                string = sb.toString();
            }
            arrayList.add(new k("music_category_manage", "分类管理", AbstractC0302v0.z1(), string, "music_category_manage"));
            arrayList.add(new k("music_category_sort", "分类排序", AbstractC0302v0.H1(), "点击上移调整顺序", "music_category_sort"));
            arrayList.add(new k("music_category_reset", "恢复默认", AbstractC0302v0.v1(), "恢复默认分类列表", "music_category_reset"));
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        }
        boolean zStartsWith = str.startsWith("search:");
        String strM558 = "name";
        String strM33 = "result";
        if (!zStartsWith) {
            if (i > 1) {
                return com.github.catvod.spider.merge.p001b.g.y(arrayList);
            }
            String strC = c(this.a, e());
            if (str.equals("hot_songs")) {
                for (String str3 : b(strC, "本周歌曲榜", "本周歌手榜")) {
                    k kVar = new k();
                    kVar.n("song:" + str3);
                    kVar.o(str3);
                    String strM314 = "artists";
                    String strM570 = "songs";
                    try {
                        JsonObject jsonObjectC = I0.c(c(FishCrypto.v("N1.tER/Yb0Ck6O+CaSb31suvS+suUlJq1oWCHjsxybBUuBmP7sUCd4VKJecSbO2DOXY6BZCW53y+SZ3eKFds9OmssR7tUbtt0KkTfekDA+7ZbjUbunJbCk9uVM0jtte44uX") + "?s=" + URLEncoder.encode(str3, "UTF-8") + "&type=1&limit=1", e()));
                        if (jsonObjectC.has(strM33)) {
                            JsonObject asJsonObject = jsonObjectC.getAsJsonObject(strM33);
                            if (!asJsonObject.has(strM570) || asJsonObject.getAsJsonArray(strM570).size() <= 0) {
                                strM379 = "https://open.wya6.com/d/down/2026/fish4k.jpeg";
                            } else {
                                JsonObject asJsonObject2 = asJsonObject.getAsJsonArray(strM570).get(0).getAsJsonObject();
                                if (!asJsonObject2.has(strM314) || asJsonObject2.getAsJsonArray(strM314).size() <= 0) {
                                    strM379 = "https://open.wya6.com/d/down/2026/fish4k.jpeg";
                                } else {
                                    JsonObject asJsonObject3 = asJsonObject2.getAsJsonArray(strM314).get(0).getAsJsonObject();
                                    String asString = asJsonObject3.has(strM558) ? asJsonObject3.get(strM558).getAsString() : "";
                                    if (asString.isEmpty()) {
                                        strM379 = "https://open.wya6.com/d/down/2026/fish4k.jpeg";
                                    } else {
                                        strM379 = d(asString);
                                    }
                                }
                            }
                        } else {
                            strM379 = "https://open.wya6.com/d/down/2026/fish4k.jpeg";
                        }
                    } catch (Exception unused) {
                    }
                    kVar.p(strM379);
                    kVar.s("热门歌曲");
                    arrayList.add(kVar);
                }
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        }
        String strSubstring = str.substring(7);
        ArrayList arrayList3 = new ArrayList();
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
        mapS.put("Referer", this.a + "/");
        mapS.put("Origin", this.a);
        mapS.put("Content-Type", "application/json");
        if (!this.b.isEmpty()) {
            mapS.put("Cookie", this.b);
        }
        String strM = com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.a, "/api/player/searchOnlineMusicOne");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("keyword", strSubstring);
        jSONObject.put("page", i);
        JSONObject jSONObject2 = new JSONObject(f(strM, jSONObject.toString(), mapS));
        if (jSONObject2.optBoolean("status", false) && (jSONArrayOptJSONArray = jSONObject2.optJSONArray(strM33)) != null) {
            while (i2 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i2);
                String strOptString = jSONObject3.optString("id", "");
                String strOptString2 = jSONObject3.optString(strM558, "");
                String strOptString3 = jSONObject3.optString("player", "");
                String strOptString4 = jSONObject3.optString("album", "");
                String strOptString5 = jSONObject3.optString("cover", "");
                if (!strOptString.isEmpty() && !strOptString2.isEmpty()) {
                    k kVar2 = new k();
                    String strM285 = "music:";
                    String strM186 = "|";
                    StringBuilder sbR = com.github.catvod.spider.merge.D.b.r(strM285, strOptString, strM186, strOptString2, strM186);
                    sbR.append(strOptString3);
                    sbR.append(strM186);
                    sbR.append(strOptString4);
                    kVar2.n(sbR.toString());
                    kVar2.o(strOptString2);
                    if (TextUtils.isEmpty(strOptString5)) {
                        strOptString5 = d(strOptString3);
                    }
                    kVar2.p(strOptString5);
                    kVar2.s(strOptString3);
                    arrayList3.add(kVar2);
                }
                i2++;
            }
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList3);
    }

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        String strM545 = "\\\\u0026";
        String strM288 = "&";
        String strReplace = str.replace(strM545, strM288).replace("\\u0026", strM288);
        String strM432 = "\\\\u003d";
        String strM499 = "=";
        String strReplace2 = strReplace.replace(strM432, strM499).replace("\\u003d", strM499);
        String strM408 = "\\\\/";
        String strM360 = "/";
        String strK = com.github.catvod.spider.merge.D.b.k(strReplace2, strM408, strM360, "\\/", strM360);
        int i = 0;
        while (true) {
            if (i >= strK.length()) {
                i = -1;
                break;
            }
            char cCharAt = strK.charAt(i);
            if (cCharAt == '\\' || cCharAt == '\"' || cCharAt == '\'' || cCharAt == '<' || Character.isWhitespace(cCharAt)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            strK = strK.substring(0, i);
        }
        while (true) {
            if (!strK.endsWith("\\") && !strK.endsWith("\"") && !strK.endsWith("'")) {
                return strK;
            }
            strK = com.github.catvod.spider.merge.D.b.g(strK, 1, 0);
        }
    }

    public static ArrayList b(String str, String str2, String str3) {
        String strSubstring = str;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(strSubstring)) {
            return arrayList;
        }
        int iIndexOf = strSubstring.indexOf(str2);
        if (iIndexOf >= 0) {
            int iIndexOf2 = str3 == null ? -1 : strSubstring.indexOf(str3, str2.length() + iIndexOf);
            strSubstring = iIndexOf2 > iIndexOf ? strSubstring.substring(iIndexOf, iIndexOf2) : strSubstring.substring(iIndexOf);
        }
        Matcher matcher = Pattern.compile("cursor-pointer[^>]*>\\s*([^<]+?)\\s*</div>", 32).matcher(strSubstring);
        HashSet hashSet = new HashSet();
        while (matcher.find() && arrayList.size() < 10) {
            String strTrim = matcher.group(1).trim();
            if (!strTrim.isEmpty() && !strTrim.matches("\\d+") && hashSet.add(strTrim)) {
                arrayList.add(strTrim);
            }
        }
        return arrayList;
    }

    public static String c(String str, HashMap map) {
        return X1.X(FishCrypto.u("N1.YcNJHzLC3GOpk2k03CepVVn5YQ3vW81G+JxK4qXSke3u9Hog30jSVGfLQpqJxuBWYFQlJKxwS/yO6Bs0OEW7nw==", str), null, map);
    }

    public static String f(String str, String str2, HashMap map) {
        return X1.M(FishCrypto.u("N1.YcNJHzLC3GOpk2k03CepVVn5YQ3vW81G+JxK4qXSke3u9Hog30jSVGfLQpqJxuBWYFQlJKxwS/yO6Bs0OEW7nw==", str), str2, map).a();
    }

    public static void g() {
        try {
            JsonObject jsonObject = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            Iterator it = g.iterator();
            while (it.hasNext()) {
                jsonArray.add((String) it.next());
            }
            jsonObject.add("categories", jsonArray);
            JsonObject jsonObject2 = new JsonObject();
            for (Map.Entry entry : e.entrySet()) {
                jsonObject2.addProperty((String) entry.getKey(), (String) entry.getValue());
            }
            jsonObject.add("artistPics", jsonObject2);
            String strM31 = ".music24bit_config";
            String string = jsonObject.toString();
            boolean z = FishCrypto.a;
            C0297t1.j(strM31, string);
        } catch (Exception unused) {
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

    public final String d(String str) {
        String strM473 = "picUrl";
        String strM219 = "result";
        String strM445 = "artists";
        HashMap map = e;
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        try {
            JsonObject jsonObjectC = I0.c(c(FishCrypto.v("N1.tER/Yb0Ck6O+CaSb31suvS+suUlJq1oWCHjsxybBUuBmP7sUCd4VKJecSbO2DOXY6BZCW53y+SZ3eKFds9OmssR7tUbtt0KkTfekDA+7ZbjUbunJbCk9uVM0jtte44uX") + "?s=" + URLEncoder.encode(str, "UTF-8") + "&type=100&limit=1", e()));
            if (jsonObjectC.has(strM219)) {
                JsonObject asJsonObject = jsonObjectC.getAsJsonObject(strM219);
                if (asJsonObject.has(strM445) && asJsonObject.getAsJsonArray(strM445).size() > 0) {
                    JsonObject asJsonObject2 = asJsonObject.getAsJsonArray(strM445).get(0).getAsJsonObject();
                    String asString = asJsonObject2.has(strM473) ? asJsonObject2.get(strM473).getAsString() : "";
                    if (!asString.isEmpty()) {
                        map.put(str, asString);
                        g();
                        return asString;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "https://open.wya6.com/d/down/2026/fish4k.jpeg";
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

    public final HashMap e() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
        mapS.put("Referer", this.a + "/");
        mapS.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
        mapS.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
        if (!this.b.isEmpty()) {
            mapS.put("Cookie", this.b);
        }
        return mapS;
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
        String strM36 = "categories";
        super.init(context, str);
        this.a = FishCrypto.v("N1.DfTznQeyyhIxJWz3GEJQ6aUs5KjOuS+XelJSauIMAGkk9P36QUTaz4YHZ9fUPMKHO3O6wi8sufxtTUlFcGnsOGlMYOFEf6T6uKgNclUCSUE=");
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.b = jSONObject.optString("cookie", "");
            String strOptString = jSONObject.optString("site", "");
            if (!strOptString.isEmpty() && strOptString.startsWith("http")) {
                this.a = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strM36);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                f = new String[jSONArrayOptJSONArray.length()];
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    f[i] = jSONArrayOptJSONArray.getString(i);
                }
            }
        } catch (Exception unused) {
        }
        String strM249 = "artistPics";
        ArrayList arrayList = g;
        try {
            String strM325 = ".music24bit_config";
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(strM325);
            if (!strH.isEmpty()) {
                JsonObject jsonObjectC = I0.c(strH);
                arrayList.clear();
                if (jsonObjectC.has(strM36)) {
                    JsonArray asJsonArray = jsonObjectC.getAsJsonArray(strM36);
                    for (int i2 = 0; i2 < asJsonArray.size(); i2++) {
                        arrayList.add(asJsonArray.get(i2).getAsString());
                    }
                }
                if (jsonObjectC.has(strM249)) {
                    JsonObject asJsonObject = jsonObjectC.getAsJsonObject(strM249);
                    for (String str2 : asJsonObject.keySet()) {
                        e.put(str2, asJsonObject.get(str2).getAsString());
                    }
                }
            }
        } catch (Exception unused2) {
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(Arrays.asList(f));
        }
        this.c = new C0559r1(this.d, new C0481b2("分类管理", "分类", "添加喜爱分类", "如: 周杰伦、晴天、Beyond等", "添加喜爱分类", "category", "输入歌手或歌曲关键词", true));
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

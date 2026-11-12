package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
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
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
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
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class XgAnime extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f113short = {584, 2486, 2481, 2474, 30357, -27760, 21712, 29507, 1105, 1110, 1101, 1126, 1114, 1111, 29556, -27023, 21860, 19774, 20785, 30370, 2820, 2835, 2837, 2835, 2840, 2818, 24911, -30306, 24763, 25599, 2482, 2509, 2514, 2482, 2500, 2494, 2510, 2453, 2461, 2515, 2491, 2449, 2488, 2458, 2482, 2480, 2515, 2458, 2450, 2461, 2456, 2449, 2451, 2450, 2457, 2463, 2491, 2479, 2475, 2501, 2505, 2447, 2493, 2500, 2470, 2450, 2487, 2487, 2477, 2480, 2453, 2493, 2482, 2437, 2441, 2506, 2446, 2500, 2468, 2515, 2455, 2479, 2519, 2473, 2484, 2441, 2463, 2448, 2452, 2490, 2456, 2494, 2491, 2515, 2452, 2509, 2508, 2441, 2459, 2481, 2457, 2476, 2470, 2515, 2475, 2453, 2479, 2489, 2445, 2472, 2488, 2472, 2473, 2456, 2470, 2441, 2487, 2519, 2451, 2438, 2501, 2506, 2441, 2475, 2487, 2468, 2477, 2509, 2454, 2507, 2448, 2436, 2456, 2511, 2500, 2455, 2484, 2443, 2468, 2473, 2497, 1519, 1443, 1452, 1441, 1459, 1459, 1449, 1446, 1465, 1653, 1597, 1586, 1591, 1583, 1598, 1577, 1030, 1102, 1089, 1092, 1116, 1101, 1114, 1029, 1088, 1101, 1097, 1100, 1032, 1030, 1088, 1050, 20765, 21783, 1353, 1374, 1372, 1362, 1364, 1365, 31540, 27011, 1342, 1337, 1324, 1337, 1320, -28330, 21399, 25357, 1640, 1639, 1634, 1658, 1643, 1660, 32181, 22085, 577, 588, 581, 592, 2216, 2272, 2287, 2282, 2290, 2275, 2292, 2219, 2287, 2290, 2275, 2283, 2214, 2279, 2269, 2286, 2292, 2275, 2272, 2267, 1000, 1010, 997, 998, 1785, 1724, 2050, 2051, 2065, 2170, 2159, 494, 401, 398, 494, 408, 482, 402, 457, 449, 399, 487, 461, 484, 454, 494, 492, 399, 454, 462, 449, 452, 461, 463, 462, 453, 451, 487, 499, 503, 409, 405, 467, 481, 408, 506, 462, 491, 491, 497, 492, 457, 481, 494, 473, 469, 406, 466, 408, 504, 399, 459, 499, 395, 501, 488, 469, 451, 460, 456, 486, 452, 482, 487, 399, 456, 401, 400, 469, 455, 493, 453, 496, 506, 399, 503, 457, 499, 485, 465, 500, 484, 500, 501, 452, 506, 469, 491, 395, 463, 474, 409, 406, 469, 503, 491, 504, 497, 401, 458, 407, 460, 472, 452, 403, 408, 459, 488, 471, 504, 501, 413, 1263, 2009, 1958, 1977, 2009, 1967, 2005, 1957, 2046, 2038, 1976, 2000, 2042, 2003, 2033, 2009, 2011, 1976, 2033, 2041, 2038, 2035, 2042, 2040, 2041, 2034, 2036, 2000, 1988, 1984, 1966, 1954, 2020, 2006, 1967, 1997, 2041, 2012, 2012, 1990, 2011, 2046, 2006, 2009, 2030, 2018, 1953, 2021, 1967, 1999, 1976, 2044, 1988, 1980, 1986, 2015, 2018, 2036, 2043, 2047, 2001, 2035, 2005, 2000, 1976, 2047, 1958, 1959, 2018, 2032, 2010, 2034, 1991, 1997, 1976, 1984, 2046, 1988, 2002, 2022, 1987, 2003, 1987, 1986, 2035, 1997, 2018, 2012, 1980, 2040, 2029, 1966, 1953, 2018, 1984, 2012, 1999, 1990, 1958, 2045, 1952, 2043, 2031, 2035, 1956, 1967, 2044, 2015, 2016, 1999, 1986, 1962, 3259, 3303, 3313, 3317, 3302, 3319, 3324, 3243, 3301, 3241, 1243, 1242, 1224, 1187, 1206, 2276, 2219, 2289, 2282, 2293, 2284, 2278, 2216, 2281, 2284, 2294, 2289, 2216, 2284, 2289, 2272, 2280, 2270, 2285, 2295, 2272, 2275, 2267, 2232, 2218, 2273, 2272, 2289, 2276, 2284, 2281, 2218, 2264, 3063, 3053, 3066, 3065, 816, 886, 813, 3301, 3305, 3316, 3241, 3309, 3305, 3299, 3295, 3319, 3318, 3303, 3246, 3257, 3303, 3307, 3314, 3297, 3318, 3243, 3289, 3240, 3236, 3309, 3305, 3299, 3295, 3319, 3318, 3303, 3246, 3257, 3303, 3307, 3314, 3297, 3318, 3243, 3289, 1345, 1344, 1361, 2170, 2080, 2107, 2084, 2109, 2103, 2169, 2104, 2109, 2087, 2080, 2169, 2109, 2080, 2097, 2105, 2169, 2169, 2101, 2081, 2080, 2108, 2107, 2086, 3214, 3284, 3265, 3271, 2272, 1890, 3326, 3298, 3298, 3302, 2810, 2693, 2714, 2786, 2808, 2800, 2803, 2770, 2694, 2812, 2690, 2768, 2796, 2812, 2796, 2812, 2759, 2693, 2814, 2776, 2719, 2802, 2782, 2810, 2778, 2769, 2759, 2692, 2688, 2789, 2814, 2752, 2801, 2788, 2775, 2785, 2790, 2813, 2690, 2695, 2752, 2812, 2787, 2756, 2800, 2798, 2810, 2773, 2701, 2802, 2781, 2775, 2758, 2752, 2771, 2688, 2774, 2766, 2798, 2700, 2719, 2798, 2701, 2785, 2692, 2796, 2770, 2786, 2806, 2780, 2771, 2800, 2700, 2807, 2802, 2693, 2692, 2789, 2694, 2773, 2701, 2758, 2798, 2766, 2765, 2688, 2695, 2802, 2807, 2757, 2754, 2780, 2754, 2788, 2693, 2800, 2774, 2700, 2758, 2782, 2786, 2755, 2775, 2757, 2701, 2701, 2813, 2778, 2776, 2692, 2697, 2332, 647, 760, 743, 677, 671, 703, 667, 666, 767, 642, 703, 656, 753, 762, 659, 697, 763, 761, 699, 666, 760, 672, 701, 667, 671, 678, 644, 698, 642, 700, 689, 762, 684, 752, 668, 699, 653, 679, 762, 668, 679, 738, 680, 766, 651, 664, 666, 644, 653, 682, 678, 640, 764, 689, 764, 674, 657, 764, 647, 643, 685, 671, 652, 648, 691, 674, 761, 765, 643, 679, 702, 648, 696, 699, 764, 643, 677, 667, 676, 678, 767, 640, 680, 753, 766, 653, 684, 640, 686, 756, 756, 2644, 2583, 2633, 2575, 2626, 1687, 1768, 1783, 1687, 1761, 1691, 1771, 1712, 1720, 1782, 1694, 1716, 1693, 1727, 1687, 1685, 1782, 1727, 1719, 1720, 1725, 1716, 1718, 1719, 1724, 1722, 1694, 1674, 1678, 1760, 1772, 1706, 1688, 1761, 1667, 1719, 1682, 1682, 1672, 1685, 1712, 1688, 1687, 1696, 1708, 1775, 1707, 1761, 1665, 1782, 1714, 1674, 1778, 1676, 1681, 1708, 1722, 1717, 1713, 1695, 1725, 1691, 1694, 1782, 1713, 1768, 1769, 1708, 1726, 1684, 1724, 1673, 1667, 1782, 1678, 1712, 1674, 1692, 1704, 1677, 1693, 1677, 1676, 1725, 1667, 1708, 1682, 1778, 1718, 1699, 1760, 1775, 1708, 1678, 1682, 1665, 1672, 1768, 1715, 1774, 1717, 1697, 1725, 1770, 1761, 1714, 1681, 1710, 1665, 1676, 1764, 2480, 2511, 2512, 2480, 2502, 2492, 2508, 2455, 2463, 2513, 2489, 2451, 2490, 2456, 2480, 2482, 2513, 2456, 2448, 2463, 2458, 2451, 2449, 2448, 2459, 2461, 2489, 2477, 2473, 2503, 2507, 2445, 2495, 2502, 2468, 2448, 2485, 2485, 2479, 2482, 2455, 2495, 2480, 2439, 2443, 2504, 2444, 2502, 2470, 2513, 2453, 2477, 2517, 2475, 2486, 2443, 2461, 2450, 2454, 2488, 2458, 2492, 2489, 2513, 2454, 2511, 2510, 2443, 2457, 2483, 2459, 2478, 2468, 2513, 2473, 2455, 2477, 2491, 2447, 2474, 2490, 2474, 2475, 2458, 2468, 2443, 2485, 2517, 2449, 2436, 2503, 2504, 2443, 2473, 
    2485, 2470, 2479, 2511, 2452, 2505, 2450, 2438, 2458, 2509, 2502, 2453, 2486, 2441, 2470, 2475, 2499, 545, 618, 619, 634, 623, 615, 610, 545, 1974, 2031, 2032, 1974, 2031, 264, 260, 281, 324, 256, 260, 270, 306, 282, 283, 266, 323, 340, 266, 262, 287, 268, 283, 326, 308, 325, 329, 256, 260, 270, 306, 282, 283, 266, 323, 340, 266, 262, 287, 268, 283, 326, 308, 1923, 1922, 1939, 2458, 2496, 2517, 2515, 2023, 2024, 2023, 1586, 1656, 1657, 1640, 1661, 1653, 1648, 1585, 1646, 1653, 1659, 1652, 1640, 1603, 1603, 1640, 1653, 1640, 1648, 1657, 1596, 1570, 1596, 1656, 1653, 1642, 2429, 2359, 2358, 2343, 2354, 2362, 2367, 2430, 2337, 2362, 2356, 2363, 2343, 2316, 2316, 2359, 2358, 2336, 2352, 2419, 2339, 960, 911, 966, 974, 981, 974, 908, 962, 969, 960, 977, 981, 964, 979, 1018, 981, 968, 981, 973, 964, 1020, 1018, 969, 979, 964, 967, 1023, 924, 910, 980, 978, 964, 979, 910, 977, 960, 966, 964, 1022, 965, 968, 979, 964, 962, 981, 926, 1020, 2299, 2273, 2294, 2293, 1785, 1764, 1785, 1761, 1768, 25261, 25406, 2835, 28222, 28589, 2743, -32222, 32641, 22588, -25785, 2089, 31680, 22763, -28900, 25663, 1242, 1203, 1214, 3188, 3193, 3184, 3173, 2627, 1390, 2072, 2071, 2066, 2058, 2075, 2060, 1993, 1998, 2011, 1998, 2015, 2451, 2436, 2438, 2440, 2446, 2447, 979, 707, 700, 675, 707, 693, 719, 703, 740, 748, 674, 714, 736, 713, 747, 707, 705, 674, 747, 739, 748, 745, 736, 738, 739, 744, 750, 714, 734, 730, 692, 696, 766, 716, 693, 727, 739, 710, 710, 732, 705, 740, 716, 707, 756, 760, 699, 767, 693, 725, 674, 742, 734, 678, 728, 709, 760, 750, 737, 741, 715, 745, 719, 714, 674, 741, 700, 701, 760, 746, 704, 744, 733, 727, 674, 730, 740, 734, 712, 764, 729, 713, 729, 728, 745, 727, 760, 710, 678, 738, 759, 692, 699, 760, 730, 710, 725, 732, 700, 743, 698, 737, 757, 745, 702, 693, 742, 709, 762, 725, 728, 688, 1811, 1812, 1807, 2780, 2779, 2752, 2795, 2775, 2778, 1402, 1389, 1387, 1389, 1382, 1404, 2278, 2237, 2214, 2221, 2216, 2224, 1916, 1830, 1853, 1846, 1843, 1835, 1906, 1916, 1850, 1853, 1830, 1919, 1825, 1847, 1843, 1824, 1841, 1850, 1805, 1805, 1841, 1853, 1852, 1830, 1847, 1852, 1830, 1906, 1900, 1906, 1843, 1801, 1850, 1824, 1847, 1844, 1804, 1903, 1917, 1846, 1847, 1830, 1843, 1851, 1854, 1917, 1807, 1979, 1953, 1974, 1973, 563, 629, 626, 617, 560, 622, 632, 636, 623, 638, 629, 560, 628, 617, 632, 624, 578, 578, 630, 632, 612, 618, 626, 623, 633, 1151, 1139, 1134, 1075, 1143, 1139, 1145, 1074, 1086, 1143, 1139, 1145, 788, 789, 772, 2634, 2626, 1023, 953, 958, 933, 1020, 930, 948, 944, 931, 946, 953, 1020, 952, 933, 948, 956, 910, 910, 931, 952, 950, 953, 933, 1863, 1801, 1816, 1793, 1863, 1801, 1797, 1816, 1847, 1817, 1821, 1805, 1818, 1809, 1847, 1803, 1801, 1818, 1820, 1799, 1799, 1798, 1847, 1796, 1793, 1819, 1820, 1879, 1820, 1809, 1816, 1805, 1877, 1888, 1889, 1907, 1816, 1805, 2052, 2128, 2119, 2117, 2123, 2125, 2124, 2079, 2669, 2605, 2594, 2599, 2623, 2606, 2617, 2678, 2175, 2089, 2104, 2110, 2108, 2148, 1143, 1085, 1080, 1084, 1080, 1061, 1132, 1122, 1127, 1143, 1085, 1072, 1087, 1078, 1060, 1072, 1078, 1076, 1132, 1074, 1087, 1115, 1094, 1111, 1119, 1089, 1099, 1097, 1114, 1116, 1095, 1095, 1094, 1143, 1089, 1100, 1292, 1283, 1295, 1287, 1111, 1100, 1107, 1098, 1088, 1148, 1098, 1102, 1092, 399, 403, 403, 407, 404, 477, 456, 456, 404, 403, 390, 403, 398, 388, 458, 390, 457, 415, 384, 388, 390, 405, 403, 392, 392, 393, 457, 388, 392, 394, 456, 388, 392, 401, 386, 405, 456, 530, 518, 519, 539, 540, 513, 1282, 1301, 1303, 1305, 1311, 1310, 1327, 1310, 1297, 1309, 1301, 650, 647, 654, 667, 673, 656, 671, 659, 667, 653, 2799, 2788, 2809, 2805, 2856, 2892, 2901, 2862, 2821, 2842, 2839, 2894, 2907, 2856, 2861, 2901, 2862, 2904, 2906, 1140, 1035, 1044, 1140, 1026, 1144, 1032, 1107, 1115, 1045, 1149, 1111, 1150, 1116, 1140, 1142, 1045, 1116, 1108, 1115, 1118, 1111, 1109, 1108, 1119, 1113, 1149, 1129, 1133, 1027, 1039, 1097, 1147, 1026, 1120, 1108, 1137, 1137, 1131, 1142, 1107, 1147, 1140, 1091, 1103, 1036, 1096, 1026, 1122, 1045, 1105, 1129, 1041, 1135, 1138, 1103, 1113, 1110, 1106, 1148, 1118, 1144, 1149, 1045, 1106, 1035, 1034, 1103, 1117, 1143, 1119, 1130, 1120, 1045, 1133, 1107, 1129, 1151, 1099, 1134, 1150, 1134, 1135, 1118, 1120, 1103, 1137, 1041, 1109, 1088, 1027, 1036, 1103, 1133, 1137, 1122, 1131, 1035, 1104, 1037, 1110, 1090, 1118, 1033, 1026, 1105, 1138, 1101, 1122, 1135, 1031, 2162, 699, 669, 651, 668, 707, 687, 649, 651, 640, 666, 2119, 2149, 2160, 2147, 2150, 2150, 2155, 2085, 2111, 2084, 2106, 2090, 2082, 2118, 2147, 2148, 2175, 2162, 2097, 2090, 2123, 2148, 2158, 2168, 2149, 2147, 2158, 2090, 2107, 2106, 2097, 2090, 2137, 2119, 2087, 2125, 2099, 2109, 2105, 2124, 2083, 2090, 2123, 2170, 2170, 2150, 2159, 2141, 2159, 2152, 2113, 2147, 2174, 2085, 2111, 2105, 2109, 2084, 2105, 2108, 2090, 2082, 2113, 2114, 2142, 2119, 2118, 2086, 2090, 2150, 2147, 2145, 2159, 2090, 2125, 2159, 2153, 2145, 2149, 2083, 2090, 2121, 2146, 2168, 2149, 2151, 2159, 2085, 2107, 2104, 2106, 2084, 2106, 2084, 2106, 2084, 2106, 2090, 2119, 2149, 2152, 2147, 2150, 2159, 2090, 2137, 2155, 2156, 2155, 2168, 2147, 2085, 2111, 2105, 2109, 2084, 2105, 2108, 1692, 1707, 1704, 1707, 1724, 1707, 1724, 1106, 1069, 1074, 1107, 1128, 1103, 1137, 1124, 1103, 1110, 1092, 1103, 1130, 1137, 1105, 1147, 1142, 1113, 1119, 1068, 1112, 1102, 1129, 1125, 1136, 1101, 1109, 1109, 1144, 1112, 1129, 1134, 1149, 1137, 1132, 1068, 1100, 1138, 1107, 1141, 1093, 1132, 1149, 1138, 1109, 1079, 1138, 1125, 1067, 1144, 1111, 1112, 1079, 1145, 1132, 1130, 1061, 1126, 1117, 1106, 1104, 1067, 1131, 1131, 1118, 1061, 1066, 1113, 1117, 1151, 1135, 1093, 1149, 1117, 1105, 1108, 1134, 1102, 1132, 1137, 1146, 1126, 1119, 1096, 1129, 1068, 1064, 1068, 1138, 1075, 
    1068, 1147, 1104, 1124, 1133, 1109, 1113, 1144, 1107, 1140, 1071, 1094, 1065, 1117, 1134, 1109, 1132, 1067, 1131, 1131, 1057, 2192, 2878, 2913, 2941, 2928, 2920, 2941, 2936, 2914, 2917, 2879, 2940, 2850, 2916, 2857, 1912, 712, 655, 648, 642, 643, 670, 715, 654, 649, 658, 2088, 2159, 2152, 2146, 2147, 2174, 2091, 2158, 2153, 2162, 2091, 2159, 2162, 2147, 2155, 731, 660, 718, 723, 718, 726, 735, 737, 722, 712, 735, 732, 740, 647, 661, 734, 735, 718, 731, 723, 726, 661, 743, 1881, 1859, 1876, 1879, 2344, 2414, 2357, 1486, 1409, 1484, 1472, 1497, 1482, 1501, 1423, 1486, 1474, 1503, 1410, 1478, 1474, 1480, 1411, 1423, 1486, 1409, 1484, 1472, 1497, 1482, 1501, 1423, 1478, 1474, 1480, 1409, 1408, 1425, 1525, 1466, 1454, 1455, 1459, 1460, 1449, 3105, 3166, 3137, 3129, 3107, 3115, 3112, 3081, 3165, 3111, 3161, 3083, 3127, 3111, 3127, 3111, 3100, 3166, 3109, 3075, 3140, 3113, 3077, 3105, 3073, 3082, 3100, 3167, 3163, 3134, 3109, 3099, 3114, 3135, 3084, 3130, 3133, 3110, 3161, 3164, 3099, 3111, 3128, 3103, 3115, 3125, 3105, 3086, 3158, 3113, 3078, 3084, 3101, 3099, 3080, 3163, 3085, 3093, 3125, 3159, 3140, 3125, 3158, 3130, 3167, 3127, 3081, 3129, 3117, 3079, 3080, 3115, 3159, 3116, 3113, 3166, 3167, 3134, 3165, 3086, 3158, 3101, 3125, 3093, 3094, 3163, 3164, 3113, 3116, 3102, 3097, 3079, 3097, 3135, 3166, 3115, 3085, 3159, 3101, 3077, 3129, 3096, 3084, 3102, 3158, 3158, 3110, 3073, 3075, 3167, 3154, 1800, 1821, 1821, 680, 759, 747, 742, 766, 738, 757, 681, 751, 755, 746, 2556, 2547, 2535, 2548, 2552, 2544, 2510, 2534, 2535, 2550, 2495, 2472, 2487, 956, 963, 965, 1005, 1004, 1021, 948, 931, 1000, 1015, 1018, 931, 963, 2820, 2821, 2836, 2271, 2269, 2248, 2265, 2267, 2259, 2254, 2245, 2303, 2259, 2258, 2248, 2265, 2258, 2248, 2638, 2639, 2654, 2635, 2627, 2630, 2665, 2629, 2628, 2654, 2639, 2628, 2654, 2405, 2402, 2400, 2408, 2382, 2402, 2403, 2425, 2408, 2403, 2425, 3316, 3315, 3313, 3321, 3274, 3317, 3320, 3321, 3315, 3295, 3315, 3314, 3304, 3321, 3314, 3304, 586, 598, 603, 579, 607, 584, 633, 597, 596, 590, 607, 596, 590, 1182, 1160, 1164, 1183, 1166, 1157, 1198, 1154, 1155, 1177, 1160, 1155, 1177, 1601, 1623, 1619, 1600, 1617, 1626, 1649, 1629, 1628, 1606, 1623, 1628, 1606};
    public static final Pattern a = Pattern.compile("[?&]vid=([^&]+)", 2);

    /* JADX INFO: renamed from: com.github.catvod.spider.XgAnime$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
    }

    class Page {
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        String strM325;
        String strTrim;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("hot", "热门动画", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("hot_cn", "热门国产动画", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("recent", "最近更新", null));
        String strA = a(FishCrypto.v("N1.N8B2ia/GmDfNL/fnadmonecGSW95sA8ZnKKQLiANyu6r8X/kS+UHuclhFdBG/h10ugMePZ/WiSEqTDTUdZuK+oz96uWKXQ1j7lxd38kHwXU=").concat("/classify"));
        ArrayList arrayList2 = new ArrayList();
        for (k kVar : X1.L(strA, "").Q(".filter")) {
            String strH = h(kVar.R(".filter-head .h2"));
            if ("地区".equals(strH)) {
                strM325 = "region";
            } else if ("状态".equals(strH)) {
                strM325 = "state";
            } else if ("首字母".equals(strH)) {
                strM325 = "filter";
            } else {
                strM325 = "类型".equals(strH) ? "type" : "";
            }
            if (!strM325.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (k kVar2 : kVar.Q(".filter-item a[href]")) {
                    String strC = kVar2.c("href");
                    int iIndexOf = strC.indexOf(63);
                    if (iIndexOf < 0) {
                        strTrim = "";
                        break;
                    }
                    String[] strArrSplit = strC.substring(iIndexOf + 1).split("&");
                    int length = strArrSplit.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            strTrim = "";
                            break;
                        }
                        String[] strArrSplit2 = strArrSplit[i].split("=", 2);
                        if (strArrSplit2.length == 2 && strM325.equals(strArrSplit2[0])) {
                            strTrim = URLDecoder.decode(strArrSplit2[1], "UTF-8").trim();
                            break;
                        }
                        i++;
                    }
                    String strTrim2 = kVar2.T().trim();
                    if (!strTrim.isEmpty() && !strTrim2.isEmpty() && linkedHashSet.add(strTrim)) {
                        arrayList3.add(new com.github.catvod.spider.merge.p001b.c(strTrim2, strTrim));
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList2.add(new com.github.catvod.spider.merge.p001b.d(strM325, strH, arrayList3));
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((com.github.catvod.spider.merge.p001b.b) it.next()).a(), arrayList2);
        }
        return com.github.catvod.spider.merge.p001b.g.v(arrayList, linkedHashMap);
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(a(FishCrypto.v("N1.N8B2ia/GmDfNL/fnadmonecGSW95sA8ZnKKQLiANyu6r8X/kS+UHuclhFdBG/h10ugMePZ/WiSEqTDTUdZuK+oz96uWKXQ1j7lxd38kHwXU=").concat("/")), "");
        ArrayList arrayListF = f(gVarL, 0);
        ArrayList<com.github.catvod.spider.merge.p001b.k> arrayListF2 = f(gVarL, 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((com.github.catvod.spider.merge.p001b.k) it.next()).b());
        }
        for (com.github.catvod.spider.merge.p001b.k kVar : arrayListF2) {
            if (linkedHashSet.add(kVar.b())) {
                arrayListF.add(kVar);
            }
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayListF);
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(a(FishCrypto.v("N1.N8B2ia/GmDfNL/fnadmonecGSW95sA8ZnKKQLiANyu6r8X/kS+UHuclhFdBG/h10ugMePZ/WiSEqTDTUdZuK+oz96uWKXQ1j7lxd38kHwXU=") + "/search?q=" + URLEncoder.encode(str, "UTF-8")), "");
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : gVarL.Q("a.topic-list-item[href^=/detail/]")) {
            String strTrim = kVar.c("href").substring(8).trim();
            String strH = h(kVar.R(".h3"));
            if (!strTrim.isEmpty() && !strH.isEmpty() && linkedHashSet.add(strTrim)) {
                k kVarR = kVar.R("amp-img[src*=cover/], img[src*=cover/]");
                String strTrim2 = kVarR == null ? "" : kVarR.c("src").trim();
                String strH2 = h(kVar.R(".topic-list-item--author"));
                ArrayList arrayListC = kVar.Q(".tag").c();
                String strC = c("/", arrayListC.subList(0, Math.min(arrayListC.size(), 2)));
                if (strH2.isEmpty()) {
                    strH2 = strC;
                } else if (!strC.isEmpty()) {
                    strH2 = com.github.catvod.spider.merge.D.b.C(strH2, " ", strC);
                }
                arrayList.add(new com.github.catvod.spider.merge.p001b.k(strTrim, strH, strTrim2, strH2));
            }
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        AbstractC0280n1.u(str, str2);
        String strM422 = "http";
        boolean zStartsWith = str2.startsWith(strM422);
        String strM54 = "N1.VLDGf2H6dXHXHs1Jl+FjNnes04QJtEPcURI63tHWpDZNa9Ficrtg4bzZ8+Z9U0XfVBhgD8CF10Q2a9rZzy43FCqvhvP1Db8rjVwcq99Inl0=";
        String strM503 = "/";
        String strM21 = "N1.lVvRS6KvY83Zp20rS1itRVoMsKux3e9UrDn3Un+a7BQSMDcoI5x5kX5NJdVEAzk04JnwAqr5JlRmo6Ia87DeIg==";
        if (zStartsWith && str2.contains(".m3u8")) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(FishCrypto.w(strM21, str2));
            gVar.h(b(FishCrypto.v(strM54).concat(strM503)));
            gVar.k();
            return gVar.r();
        }
        boolean zStartsWith2 = str2.startsWith(strM422);
        String strM511 = "N1.N8B2ia/GmDfNL/fnadmonecGSW95sA8ZnKKQLiANyu6r8X/kS+UHuclhFdBG/h10ugMePZ/WiSEqTDTUdZuK+oz96uWKXQ1j7lxd38kHwXU=";
        String strW = zStartsWith2 ? FishCrypto.w(strM21, str2) : FishCrypto.v(strM511).concat(str2);
        String strG = g(a(strW));
        if (strG.isEmpty()) {
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.p();
            gVar2.C(FishCrypto.w(strM21, strW));
            gVar2.h(b(FishCrypto.v(strM511).concat(strM503)));
            return gVar2.r();
        }
        com.github.catvod.spider.merge.p001b.g gVar3 = new com.github.catvod.spider.merge.p001b.g();
        gVar3.C(d(strG));
        gVar3.h(b(FishCrypto.v(strM54).concat(strM503)));
        gVar3.k();
        return gVar3.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        if (list == null || list.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d("缺少详情 ID");
        }
        String str = list.get(0);
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(a(FishCrypto.v("N1.N8B2ia/GmDfNL/fnadmonecGSW95sA8ZnKKQLiANyu6r8X/kS+UHuclhFdBG/h10ugMePZ/WiSEqTDTUdZuK+oz96uWKXQ1j7lxd38kHwXU=") + "/detail/" + str), "");
        com.github.catvod.spider.merge.p001b.k kVarA = AbstractC0449a.a(str);
        kVarA.o(h(gVarL.R("h1.h1")));
        k kVarR = gVarL.R("amp-img[src*=cover/], img[src*=cover/]");
        kVarA.p(kVarR != null ? kVarR.c("src").trim() : "");
        ArrayList arrayListC = gVarL.Q(".tag").c();
        kVarA.i(c(" / ", arrayListC.subList(0, Math.min(arrayListC.size(), Integer.MAX_VALUE))));
        String strH = h(gVarL.R(".detail-right__title > div"));
        kVarA.s(strH);
        kVarA.j(strH);
        kVarA.l(h(gVarL.R(".detail-right__desc p")));
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : gVarL.Q("a.goto-chapter[title][href^=/user/page_direct?]")) {
            String strC = kVar.c("href");
            if (!strC.isEmpty() && linkedHashSet.add(strC)) {
                String strTrim = kVar.c("title").replace('#', '_').replace('$', '_').trim();
                StringBuilder sb = new StringBuilder();
                if (strTrim.isEmpty()) {
                    strTrim = "播放";
                }
                sb.append(strTrim);
                sb.append("$");
                sb.append(strC);
                arrayList.add(sb.toString());
            }
        }
        if (arrayList.isEmpty()) {
            String strG = g(gVarL.K());
            if (!strG.isEmpty()) {
                arrayList.add("播放$" + d(strG));
            }
        }
        kVarA.q("西瓜卡通");
        kVarA.r(c("#", arrayList));
        N1.d(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int iMax;
        ArrayList arrayList;
        try {
            iMax = Math.max(Integer.parseInt(str2), 1);
        } catch (Exception unused) {
            iMax = 1;
        }
        String strM360 = "type";
        String strE = e(strM360, map);
        String strM36 = "*";
        boolean zEquals = strM36.equals(strE);
        String strM499 = " ";
        String strM503 = "filter";
        String strM467 = "state";
        String strM454 = "region";
        String strM75 = "/";
        String strM511 = "N1.N8B2ia/GmDfNL/fnadmonecGSW95sA8ZnKKQLiANyu6r8X/kS+UHuclhFdBG/h10ugMePZ/WiSEqTDTUdZuK+oz96uWKXQ1j7lxd38kHwXU=";
        if (zEquals && strM36.equals(e(strM454, map)) && strM36.equals(e(strM467, map)) && strM36.equals(e(strM503, map))) {
            if ("hot".equals(str)) {
                arrayList = f(X1.L(a(FishCrypto.v(strM511).concat(strM75)), ""), 0);
            } else if ("hot_cn".equals(str)) {
                arrayList = f(X1.L(a(FishCrypto.v(strM511).concat(strM75)), ""), 1);
            } else if ("recent".equals(str)) {
                String strA = a(FishCrypto.v(strM511).concat("/today"));
                ArrayList arrayList2 = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (k kVar : X1.L(strA, "").Q(".today .hot-search__content > a[href^=/detail/]")) {
                    String strTrim = kVar.c("href").substring(8).trim();
                    k kVarR = kVar.R(".hot-search-item__keyword");
                    String strTrim2 = kVarR == null ? "" : kVarR.N().trim();
                    if (!strTrim.isEmpty() && !strTrim2.isEmpty() && linkedHashSet.add(strTrim)) {
                        k kVarR2 = kVar.R("amp-img, img");
                        String strTrim3 = kVarR2 == null ? "" : kVarR2.c("src").trim();
                        String strH = h(kVar.R("em"));
                        String strH2 = h(kVar.R(".hot-search-item__right"));
                        if (strH.isEmpty()) {
                            strH = strH2;
                        } else if (!strH2.isEmpty()) {
                            strH = com.github.catvod.spider.merge.D.b.C(strH, strM499, strH2);
                        }
                        arrayList2.add(new com.github.catvod.spider.merge.p001b.k(strTrim, strTrim2, strTrim3, strH));
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = new ArrayList();
            }
            return AbstractC0449a.c(1, 1, arrayList.size(), arrayList.size(), arrayList);
        }
        String strE2 = e(strM360, map);
        String strE3 = e(strM454, map);
        String strE4 = e(strM467, map);
        String strE5 = e(strM503, map);
        StringBuilder sb = new StringBuilder();
        sb.append(FishCrypto.v(strM511));
        sb.append("/api/amp_query_cartoon_list?type=");
        String strM76 = "UTF-8";
        sb.append(URLEncoder.encode(strE2, strM76));
        sb.append("&region=");
        sb.append(URLEncoder.encode(strE3, strM76));
        String strM529 = "&filter=";
        sb.append(strM529);
        sb.append(URLEncoder.encode(strE4, strM76));
        sb.append(strM529);
        sb.append(URLEncoder.encode(strE5, strM76));
        sb.append("&page=");
        sb.append(iMax);
        sb.append("&limit=36&language=cn");
        JSONObject jSONObject = new JSONObject(a(sb.toString()));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        ArrayList arrayList3 = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("cartoon_id");
                    String strOptString2 = jSONObjectOptJSONObject.optString("name");
                    if (!strOptString.isEmpty() && !strOptString2.isEmpty()) {
                        String strOptString3 = jSONObjectOptJSONObject.optString("topic_img");
                        if (!strOptString3.isEmpty()) {
                            strOptString3 = "https://static-a.xgcartoon.com/cover/".concat(strOptString3);
                        }
                        String strOptString4 = jSONObjectOptJSONObject.optString("author");
                        if (strOptString4.isEmpty()) {
                            strOptString4 = jSONObjectOptJSONObject.optString("region_name");
                        }
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("type_names");
                        ArrayList arrayList4 = new ArrayList();
                        if (jSONArrayOptJSONArray2 != null) {
                            for (int i2 = 0; i2 < Math.min(jSONArrayOptJSONArray2.length(), 2); i2++) {
                                arrayList4.add(jSONArrayOptJSONArray2.optString(i2));
                            }
                        }
                        String strC = c(strM75, arrayList4);
                        if (strOptString4.isEmpty()) {
                            strOptString4 = strC;
                        } else if (!strC.isEmpty()) {
                            strOptString4 = com.github.catvod.spider.merge.D.b.C(strOptString4, strM499, strC);
                        }
                        arrayList3.add(new com.github.catvod.spider.merge.p001b.k(strOptString, strOptString2, strOptString3, strOptString4));
                    }
                }
            }
        }
        Object objOpt = jSONObject.opt("next");
        boolean z2 = (objOpt == null || objOpt == JSONObject.NULL || String.valueOf(objOpt).isEmpty()) ? false : true;
        return AbstractC0449a.c(iMax, z2 ? iMax + 1 : iMax, 36, z2 ? Integer.MAX_VALUE : ((iMax - 1) * 36) + arrayList3.size(), arrayList3);
    }

    public static String a(String str) {
        return X1.X(str, null, b(FishCrypto.v("N1.N8B2ia/GmDfNL/fnadmonecGSW95sA8ZnKKQLiANyu6r8X/kS+UHuclhFdBG/h10ugMePZ/WiSEqTDTUdZuK+oz96uWKXQ1j7lxd38kHwXU=").concat("/")));
    }

    public static HashMap b(String str) {
        return com.github.catvod.spider.merge.D.b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; SM-G973F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", str);
    }

    public static String c(String str, List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 != null && !str2.trim().isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(str);
                }
                sb.append(str2.trim());
            }
        }
        return sb.toString();
    }

    public static String d(String str) {
        return FishCrypto.v("N1.OtSmxSJXSvmMgjEC0DRuylQIIdDuramp0PnOiYpanI+ny7dKD+epv9zANL7wwB96EAcsYaAMHrRpmfzCTu040n/0gLxqIEdOh3Z5ArIp7ww=") + "/" + str + "/playlist.m3u8";
    }

    public static String e(String str, HashMap map) {
        String str2 = map == null ? "" : (String) map.get(str);
        return (str2 == null || str2.isEmpty()) ? "*" : str2;
    }

    public static ArrayList f(com.github.catvod.spider.merge.f0.g gVar, int i) {
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.h0.d dVarQ = gVar.Q(".index-hot");
        if (i >= 0 && i < dVarQ.size()) {
            for (k kVar : ((k) dVarQ.get(i)).Q(".index-hot-item")) {
                k kVarR = kVar.R("a.title[href^=/detail/]");
                if (kVarR != null) {
                    String strTrim = kVarR.c("href").substring(8).trim();
                    String strH = h(kVarR.R(".h3"));
                    if (!strTrim.isEmpty() && !strH.isEmpty()) {
                        k kVarR2 = kVar.R("a.cover amp-img, a.cover img");
                        arrayList.add(new com.github.catvod.spider.merge.p001b.k(strTrim, strH, kVarR2 == null ? "" : kVarR2.c("src").trim(), h(kVar.R(".author"))));
                    }
                }
            }
        }
        return arrayList;
    }

    public static String g(String str) {
        String strV = FishCrypto.v("N1.VLDGf2H6dXHXHs1Jl+FjNnes04QJtEPcURI63tHWpDZNa9Ficrtg4bzZ8+Z9U0XfVBhgD8CF10Q2a9rZzy43FCqvhvP1Db8rjVwcq99Inl0=");
        int iIndexOf = strV.indexOf("://");
        if (iIndexOf < 0) {
            return "";
        }
        String str2 = strV.substring(iIndexOf + 3) + "/player.htm";
        k kVarR = X1.L(str, "").R("iframe[src*=\"" + str2 + "\"][src*=vid=]");
        if (kVarR == null) {
            return "";
        }
        Matcher matcher = a.matcher(kVarR.c("src"));
        return matcher.find() ? matcher.group(1) : "";
    }

    public static String h(k kVar) {
        return kVar == null ? "" : kVar.T().trim();
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

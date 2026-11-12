package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p000a.N;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class SaoHuo extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f85short = {1492, 1416, 1494, 1494, 1494, 1494, 1494, 1494, 1494, 1494, 1494, 1494, 1493, 1427, 1423, 1430, 1431, 1476, 1420, 1439, 1478, 1453, 1452, 1470, 1493, 1472, 3135, 2917, 1471, 1469, 453, 29511, 22787, 29887, -30644, 21485, 24235, 18161, 23089, 23012, 25703, 2004, 1933, 1950, 1933, 1941, 2036, 2004, 1933, 1988, 1994, 2006, 1933, 1941, 1933, 1996, 1998, 2011, 1994, 2022, 1995, 1933, 1923, 1933, 1985, 1998, 1986, 1994, 1933, 1941, 1933, 31700, 20516, 1933, 1923, 1933, 2009, 1998, 1987, 2010, 1994, 1933, 1941, 2036, 2004, 1933, 1985, 1933, 1941, 1933, 22215, -26809, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1950, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 21043, 21960, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1945, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 30110, 26474, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1944, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 26623, 26553, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1943, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 21767, 18675, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1942, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 32382, 22996, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1950, 1951, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 26039, 18726, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1950, 1950, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 29952, 30917, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1950, 1949, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 21767, 29332, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1950, 1948, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 24296, 22996, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1950, 1947, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 21960, 26474, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1950, 1946, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 22077, -28218, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1950, 1945, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 26371, 29246, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1950, 1944, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 26469, 26421, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1950, 1943, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 22233, 18809, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1949, 1951, 1933, 2002, 2034, 2002, 2034, 1923, 1933, 1949, 1933, 1941, 2036, 2004, 1933, 1988, 1994, 2006, 1933, 1941, 1933, 1996, 1998, 2011, 1994, 2022, 1995, 1933, 1923, 1933, 1985, 1998, 1986, 1994, 1933, 1941, 1933, 31700, 20516, 1933, 1923, 1933, 2009, 1998, 1987, 2010, 1994, 1933, 1941, 2036, 2004, 1933, 1985, 1933, 1941, 1933, 22215, -26809, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1949, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 20818, 18696, 21960, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1949, 1951, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 2043, 2041, 2029, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1949, 1950, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, -28602, 21960, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1949, 1949, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 30753, 21960, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1949, 1948, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 25162, 21960, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1949, 1947, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, -31394, 21960, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1949, 1946, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 21599, 21960, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1949, 1945, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 22233, 18809, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1949, 1944, 1933, 2002, 2034, 2002, 2034, 1923, 1933, 1948, 1933, 1941, 2036, 2004, 1933, 1988, 1994, 2006, 1933, 1941, 1933, 1996, 1998, 2011, 1994, 2022, 1995, 1933, 1923, 1933, 1985, 1998, 1986, 1994, 1933, 1941, 1933, 31700, 20516, 1933, 1923, 1933, 2009, 1998, 1987, 2010, 1994, 1933, 1941, 2036, 2004, 1933, 1985, 1933, 1941, 1933, 22215, -26809, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1947, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 25521, 31934, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1948, 1943, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 26596, 30110, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1948, 1942, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 30530, -28689, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1947, 1951, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 28563, 25144, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1947, 1950, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 30753, 23486, 24284, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1947, 1949, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, -25349, 27514, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1947, 1948, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 24725, 26039, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1947, 1947, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 28558, 20802, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1947, 1946, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 18717, 23807, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1947, 1945, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 32074, -29582, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1947, 1944, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 22077, -28218, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1947, 1943, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 28848, 18709, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1947, 1942, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 2019, 2016, 2019, 2022, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1946, 1951, 1933, 2002, 1923, 2004, 1933, 1985, 1933, 1941, 1933, 22233, 18809, 1933, 1923, 1933, 2009, 1933, 1941, 1933, 1946, 1950, 1933, 2002, 2034, 2002, 2034, 2002, 1017, 1014, 994, 1009, 1021, 1013, 971, 995, 994, 1011, 973, 564, 565, 548, 1993, 1974, 1961, 1994, 2016, 1975, 2007, 1982, 2015, 2016, 1971, 2004, 1975, 2001, 2028, 2002, 2000, 1990, 1988, 2035, 1973, 1968, 2013, 2006, 1995, 2047, 1990, 2032, 2028, 2017, 2022, 
    2013, 2003, 1998, 1972, 1986, 2004, 2021, 2019, 2016, 1960, 1972, 2003, 2030, 1993, 1998, 2014, 2039, 1994, 1986, 1974, 2037, 2006, 1986, 1960, 1974, 2034, 2027, 2004, 2016, 1984, 1972, 2035, 2030, 2029, 2021, 2022, 2020, 2020, 2013, 2024, 2020, 2003, 1973, 2028, 1970, 2006, 2026, 2038, 2046, 2022, 2014, 2005, 2045, 2039, 2024, 1974, 2007, 1990, 1978, 1978, 3000, 3041, 3068, 3056, 3070, 2982, 3007, 2996, 3000, 3056, 3000, 3042, 3068, 3056, 3070, 2996, 2997, 2980, 2993, 3001, 3004, 3069, 2980, 3001, 2980, 3004, 2997, 3068, 3056, 3070, 2980, 3001, 2980, 3004, 2997, 2533, 2541, 2556, 2537, 2515, 2552, 2554, 2535, 2552, 2541, 2554, 2556, 2545, 2485, 2535, 2543, 2482, 2556, 2529, 2556, 2532, 2541, 2517, 2906, 2902, 2903, 2893, 2908, 2903, 2893, 2904, 2905, 2888, 3274, 3279, 3290, 3279, 3203, 3265, 3292, 3271, 3273, 3271, 3264, 3279, 3266, 796, 793, 780, 793, 853, 779, 778, 795, 2582, 2636, 2640, 2637, 2645, 2650, 2584, 2641, 2645, 2655, 2580, 2584, 2582, 2651, 2647, 2638, 2653, 2634, 2584, 2641, 2645, 2655, 2580, 2584, 2582, 2652, 2653, 2636, 2649, 2641, 2644, 2581, 2632, 2641, 2651, 2584, 2641, 2645, 2655, 2580, 2584, 2641, 2645, 2655, 2582, 2644, 2649, 2626, 2625, 29675, 18080, -2191, 2506, 2452, 2506, 2533, 2510, 2498, 2510, 2454, 2458, 2452, 2506, 2533, 2510, 2498, 2510, 2454, 2458, 2452, 2508, 2517, 2526, 2533, 2521, 2517, 2516, 2510, 2527, 2516, 2510, 2454, 2458, 2452, 2521, 2517, 2516, 2510, 2527, 2516, 2510, 2454, 2458, 2452, 2526, 2527, 2510, 2523, 2515, 2518, 2455, 2521, 2517, 2516, 2510, 2527, 2516, 2510, 3018, 2957, 2954, 2946, 2955, 3016, 3012, 3018, 2962, 2955, 2944, 3003, 2957, 2954, 2946, 2955, 3016, 3012, 3018, 2944, 2945, 2960, 2949, 2957, 2952, 3017, 2957, 2954, 2946, 2955, 832, 847, 832, 22684, 27764, 858, 796, 832, 847, 832, 19803, 27764, 858, 1860, 1815, 1803, 1798, 1822, 1848, 1803, 1806, 1801, 1804, 1863, 1803, 1806, 1639, 1593, 1573, 1576, 1584, 1558, 1583, 1595, 1574, 1572, 1641, 1596, 1573, 1639, 1583, 1595, 1574, 1572, 1558, 1573, 1568, 1594, 1597, 1641, 1573, 1568, 25412, 25303, 2824, 2866, 2817, 2843, 2828, 2831, 2868, 893, 710, 732, 715, 712, 1831, 1281, 1281, 1281, 2681, 2683, 2670, 2687, 2643, 2686, 1279, 1212, 1209, 1187, 1188, 1279, 421, 1929, 1999, 2003, 1994, 1995, 1369, 1349, 1349, 1345, 1124, 1124, 1543, 1563, 1563, 1567, 1564, 1621, 778, 1314, 1373, 1346, 1313, 1291, 1372, 1340, 1365, 1332, 1291, 1368, 1343, 1372, 1338, 1287, 1337, 1339, 1325, 1327, 1304, 1374, 1371, 1334, 1341, 1312, 1300, 1325, 1307, 1287, 1290, 1293, 1334, 1336, 1317, 1375, 1321, 1343, 1294, 1288, 1291, 1347, 1375, 1336, 1285, 1314, 1317, 1333, 1308, 1313, 1321, 1373, 1310, 1341, 1321, 1347, 1373, 1305, 1280, 1343, 1291, 1323, 1375, 1304, 1285, 1286, 1294, 1293, 1295, 1295, 1334, 1283, 1295, 1336, 1374, 1287, 1369, 1341, 1281, 1309, 1301, 1293, 1333, 1342, 1302, 1308, 1283, 1373, 1340, 1325, 1361, 1361, 1471, 1449, 1464, 1505, 1455, 1443, 1443, 1447, 1445, 1449, 731, 749, 764, 677, 715, 743, 743, 739, 737, 749, 1739, 1737, 1756, 1741, 1743, 1735, 1754, 1745, 1771, 1735, 1734, 1756, 1741, 1734, 1756, 1345, 1383, 1393, 1382, 1337, 1365, 1395, 1393, 1402, 1376, 656, 690, 679, 692, 689, 689, 700, 754, 744, 755, 749, 765, 757, 657, 692, 691, 680, 677, 742, 765, 668, 691, 697, 687, 690, 692, 697, 765, 740, 742, 765, 668, 657, 659, 752, 668, 657, 749, 749, 765, 671, 680, 692, 689, 697, 754, 653, 652, 750, 671, 755, 748, 740, 749, 741, 749, 748, 755, 749, 744, 751, 741, 748, 745, 749, 747, 742, 765, 682, 683, 756, 765, 668, 685, 685, 689, 696, 650, 696, 703, 662, 692, 681, 754, 744, 750, 746, 755, 750, 747, 765, 757, 662, 661, 649, 656, 657, 753, 765, 689, 692, 694, 696, 765, 666, 696, 702, 694, 690, 756, 765, 651, 696, 687, 686, 692, 690, 691, 754, 745, 755, 749, 765, 670, 693, 687, 690, 688, 696, 754, 740, 748, 755, 749, 755, 745, 745, 746, 751, 755, 748, 748, 745, 765, 654, 700, 699, 700, 687, 692, 754, 744, 750, 746, 755, 750, 747, 1367, 1365, 1365, 1363, 1350, 1346, 1307, 1370, 1367, 1368, 1361, 1347, 1367, 1361, 1363, 2401, 2419, 2358, 2392, 2389, 2359, 2401, 2419, 2336, 2410, 2342, 2347, 2357, 2338, 2359, 2430, 2421, 2358, 2382, 2376, 2336, 2410, 2342, 2347, 2357, 2339, 2359, 2430, 2421, 2336, 2410, 2342, 2347, 2357, 2348, 370, 1281, 1334, 1333, 1334, 1313, 1334, 1313, 1754, 1782, 1782, 1778, 1776, 1788, 1990, 1991, 2006, 1987, 1995, 1998, 2017, 1997, 1996, 2006, 1991, 1996, 2006, 2334, 2374, 2415, 2396, 2393, 2371, 2372, 2320, 2396, 2393, 2332, 2320, 2334, 2374, 2396, 2393, 2371, 2372, 2320, 2396, 2393, 2332, 2320, 2373, 2396, 2334, 2387, 2396, 2389, 2385, 2370, 2390, 2393, 2376, 2320, 2396, 2393, 2332, 2320, 2396, 2393, 2314, 2392, 2385, 2371, 2328, 2385, 2411, 2372, 2393, 2372, 2396, 2389, 2413, 2329, 2314, 2392, 2385, 2371, 2328, 2393, 2397, 2391, 2329, 1533, 1479, 1524, 1518, 1529, 1530, 1473, 3320, 3298, 3317, 3318, 2640, 2666, 2629, 2648, 2629, 2653, 2644, 2668, 690, 687, 690, 682, 675, 1938, 1960, 1927, 1946, 1927, 1951, 1942, 1966, 2015, 2003, 1947, 1984, 2003, 1938, 2015, 2003, 1947, 1991, 2003, 1938, 2015, 2003, 2013, 1927, 1946, 1927, 1951, 1942, 2003, 1938, 2015, 2003, 1938, 1960, 1947, 1921, 1942, 1941, 1966, 2294, 2291, 2278, 2291, 2239, 2301, 2272, 2299, 2293, 2299, 2300, 2291, 2302, 1532, 1529, 1516, 1529, 1461, 1515, 1514, 1531, 1127, 1126, 1143, 1588, 1584, 1594, 2327, 2385, 2397, 2381, 2392, 2398, 2325, 2329, 2327, 2391, 2390, 2381, 2396, 2325, 2329, 2327, 2377, 2384, 2394, 2324, 2381, 2396, 2369, 2381, 2325, 2329, 2327, 2379, 2396, 2388, 2392, 2379, 2386, 2378, 2325, 2329, 2378, 2377, 2392, 2391, 676, 675, 673, 681, 655, 675, 674, 696, 681, 674, 696, 2736, 2767, 2768, 2743, 2767, 2712, 2736, 2719, 2708, 2735, 2744, 2738, 2738, 2708, 2692, 2773, 2760, 2727, 2740, 2737, 2716, 2730, 2743, 2764, 2697, 2741, 2699, 2704, 2724, 2766, 2763, 2732, 2745, 2703, 2760, 2744, 2735, 
    2727, 2709, 2729, 2733, 2735, 2732, 2743, 2692, 2741, 2741, 2699, 2763, 2773, 2724, 2749, 2746, 2697, 2704, 2700, 2704, 2729, 2724, 2702, 2765, 2769, 2740, 2700, 2727, 2703, 2732, 2741, 2735, 2719, 2767, 2744, 2712, 2740, 2707, 2741, 2742, 2706, 2695, 2697, 2726, 2708, 2735, 2739, 2751, 2741, 2773, 2738, 2746, 2765, 2736, 2733, 2724, 2763, 2694, 2748, 2704, 2761, 2767, 2738, 2702, 2748, 2724, 2697, 2743, 2716, 2698, 2715, 2705, 2739, 2755, 2565, 2585, 2585, 2589, 2287, 2293, 2280, 2297, 1447, 3067, 3037, 3019, 3036, 2947, 3055, 3017, 3019, 3008, 3034, 2271, 2301, 2280, 2299, 2302, 2302, 2291, 2237, 2215, 2236, 2210, 2226, 2234, 2245, 2299, 2300, 2294, 2301, 2277, 2273, 2226, 2268, 2246, 2226, 2211, 2210, 2236, 2210, 2217, 2226, 2245, 2299, 2300, 2212, 2214, 2217, 2226, 2282, 2212, 2214, 2235, 2226, 2259, 2274, 2274, 2302, 2295, 2245, 2295, 2288, 2265, 2299, 2278, 2237, 2215, 2209, 2213, 2236, 2209, 2212, 2226, 2234, 2265, 2266, 2246, 2271, 2270, 2238, 2226, 2302, 2299, 2297, 2295, 2226, 2261, 2295, 2289, 2297, 2301, 2235, 2226, 2257, 2298, 2272, 2301, 2303, 2295, 2237, 2211, 2211, 2213, 2236, 2210, 2236, 2210, 2236, 2210, 2226, 2241, 2291, 2292, 2291, 2272, 2299, 2237, 2215, 2209, 2213, 2236, 2209, 2212, 2668, 2579, 2572, 2683, 2674, 2676, 2573, 2667, 2579, 2637, 2579, 2669, 2672, 2667, 2580, 2586, 2587, 2577, 2632, 2583, 2630, 2674, 2647, 2582, 2645, 2646, 2580, 2632, 2628, 2582, 2669, 2667, 2641, 2661, 2650, 2627, 2669, 2637, 2641, 2667, 2671, 2633, 2569, 2683, 2657, 2661, 2581, 2581, 2641, 2629, 2680, 2641, 2627, 2657, 2582, 2678, 2569, 2635, 2677, 2628, 2630, 2587, 2669, 2650, 2580, 2627, 2643, 2578, 2637, 2635, 2677, 2648, 2637, 2631, 2637, 2583, 2624, 2673, 2663, 2668, 2656, 2646, 2677, 2665, 2679, 2676, 2682, 2631, 2642, 2581, 2642, 2670, 2674, 2581, 2630, 2673, 2645, 2651, 2645, 2583, 2638, 2650, 2637, 2679, 2668, 2647, 2624, 2578, 2674, 2625, 2591, 1389, 1298, 1293, 1390, 1348, 1299, 1395, 1306, 1403, 1348, 1303, 1392, 1299, 1397, 1352, 1398, 1396, 1378, 1376, 1367, 1297, 1300, 1401, 1394, 1391, 1371, 1378, 1364, 1352, 1349, 1346, 1401, 1399, 1386, 1296, 1382, 1392, 1345, 1351, 1348, 1292, 1296, 1399, 1354, 1389, 1386, 1402, 1363, 1390, 1382, 1298, 1361, 1394, 1382, 1292, 1298, 1366, 1359, 1392, 1348, 1380, 1296, 1367, 1354, 1353, 1345, 1346, 1344, 1344, 1401, 1356, 1344, 1399, 1297, 1352, 1302, 1394, 1358, 1362, 1370, 1346, 1402, 1393, 1369, 1363, 1356, 1298, 1395, 1378, 1310, 1310, 2311, 2378, 2374, 2375, 2397, 2380, 2375, 2397, 2308, 2397, 2374, 2393, 2313, 2376, 2418, 2369, 2395, 2380, 2383, 2420, 2309, 2313, 2376, 2418, 2369, 2395, 2380, 2383, 2420, 562, 552, 575, 572, 1398, 1386, 1383, 1407, 1379, 1396, 1349, 1385, 1384, 1394, 1379, 1384, 1394, 2830, 2840, 2844, 2831, 2846, 2837, 2878, 2834, 2835, 2825, 2840, 2835, 2825};
    public String a = "";
    public String b = "";

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList = e(X1.L(c(this.a + "/s----------.html?wd=" + URLEncoder.encode(str, "UTF-8")), ""));
        } catch (Exception unused) {
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("1", "2", "20", "4");
        List listAsList2 = Arrays.asList("电影", "电视剧", "国产剧", "动漫");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new com.github.catvod.spider.merge.p001b.b((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        ArrayList arrayListE = e(X1.L(c(this.a), ""));
        if (arrayListE.size() > 6) {
            arrayListE = new ArrayList(arrayListE.subList(0, 6));
        }
        return com.github.catvod.spider.merge.p001b.g.w(arrayList, arrayListE, new JSONObject("{\"1\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"1\"},{\"n\":\"喜剧\",\"v\":\"6\"},{\"n\":\"爱情\",\"v\":\"7\"},{\"n\":\"恐怖\",\"v\":\"8\"},{\"n\":\"动作\",\"v\":\"9\"},{\"n\":\"科幻\",\"v\":\"10\"},{\"n\":\"战争\",\"v\":\"11\"},{\"n\":\"犯罪\",\"v\":\"12\"},{\"n\":\"动画\",\"v\":\"13\"},{\"n\":\"奇幻\",\"v\":\"14\"},{\"n\":\"剧情\",\"v\":\"15\"},{\"n\":\"冒险\",\"v\":\"16\"},{\"n\":\"悬疑\",\"v\":\"17\"},{\"n\":\"惊悚\",\"v\":\"18\"},{\"n\":\"其他\",\"v\":\"20\"}]}],\"2\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"2\"},{\"n\":\"国产剧\",\"v\":\"20\"},{\"n\":\"TVB\",\"v\":\"21\"},{\"n\":\"韩剧\",\"v\":\"22\"},{\"n\":\"美剧\",\"v\":\"23\"},{\"n\":\"日剧\",\"v\":\"24\"},{\"n\":\"英剧\",\"v\":\"25\"},{\"n\":\"台剧\",\"v\":\"26\"},{\"n\":\"其他\",\"v\":\"27\"}]}],\"3\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"4\"},{\"n\":\"搞笑\",\"v\":\"38\"},{\"n\":\"恋爱\",\"v\":\"39\"},{\"n\":\"热血\",\"v\":\"40\"},{\"n\":\"格斗\",\"v\":\"41\"},{\"n\":\"美少女\",\"v\":\"42\"},{\"n\":\"魔法\",\"v\":\"43\"},{\"n\":\"机战\",\"v\":\"44\"},{\"n\":\"校园\",\"v\":\"45\"},{\"n\":\"亲子\",\"v\":\"46\"},{\"n\":\"童话\",\"v\":\"47\"},{\"n\":\"冒险\",\"v\":\"48\"},{\"n\":\"真人\",\"v\":\"49\"},{\"n\":\"LOLI\",\"v\":\"50\"},{\"n\":\"其他\",\"v\":\"51\"}]}]}"));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strI = AbstractC0280n1.i(str, str2, null, null);
        String strB = b(X1.L(c(this.a + str2), ""), "iframe[src]", "src");
        boolean zIsEmpty = TextUtils.isEmpty(strB);
        String strM529 = "N1.Mg0P9Xg4S0VkUWACt27ZQLxAwkfaZTI3ESbdg/3TiNIYpME1rQE/1ulSgG3tijbaccZocT2k5QmqyaYRzpo1PA==";
        if (!zIsEmpty) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.q(1);
            gVar.C(FishCrypto.u(strM529, a(strB)));
            gVar.h(d());
            gVar.b(strI);
            return gVar.r();
        }
        com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
        gVar2.q(1);
        gVar2.C(FishCrypto.u(strM529, this.a + str2));
        gVar2.b(strI);
        return gVar2.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(c(a(str)), "");
        k kVarA = AbstractC0449a.a(str);
        String strG = g(gVarL, "h1, .vodh h2, .detail-title, .title");
        if (TextUtils.isEmpty(strG)) {
            strG = b(gVarL, "meta[property=og:title]", "content");
        }
        String strF = f(gVarL, ".thumb img, .cover img, .detail-pic img, img.lazy", "data-original", "data-src", "src");
        String str2 = "简介：" + g(gVarL, "p.p_txt, .p_txt, .vod_content, .content, .detail-content");
        String strG2 = g(gVarL, ".info, .vod_info, .detail-info");
        kVarA.o(strG);
        kVarA.p(a(strF));
        kVarA.l(str2);
        if (!TextUtils.isEmpty(strG2)) {
            String[] strArrSplit = strG2.split(" / 导演:| / 主演:");
            if (strArrSplit.length > 0) {
                kVarA.i(strArrSplit[0].trim());
            }
            if (strArrSplit.length > 1) {
                kVarA.m(strArrSplit[1].trim());
            }
            if (strArrSplit.length > 2) {
                kVarA.j(strArrSplit[2].trim());
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q("#play_link li");
        com.github.catvod.spider.merge.h0.d dVarQ2 = gVarL.Q(".play_from ul.from_list li");
        for (int i = 0; i < dVarQ.size(); i++) {
            String strTrim = i < dVarQ2.size() ? ((com.github.catvod.spider.merge.f0.k) dVarQ2.get(i)).T().trim() : "播放" + (i + 1);
            ArrayList arrayList = new ArrayList();
            com.github.catvod.spider.merge.h0.d dVarQ3 = ((com.github.catvod.spider.merge.f0.k) dVarQ.get(i)).Q("a[href]");
            for (int size = dVarQ3.size() - 1; size >= 0; size += -1) {
                com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) dVarQ3.get(size);
                arrayList.add(kVar.T().trim() + "$" + kVar.c("href").trim());
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put(strTrim, TextUtils.join("#", arrayList));
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        String strM382 = "$$$";
        kVarA.q(TextUtils.join(strM382, setKeySet));
        kVarA.r(TextUtils.join(strM382, linkedHashMap.values()));
        AbstractC0280n1.p(strG);
        AbstractC0280n1.q(kVarA.e());
        FishCrypto.c(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = str;
        String str4 = map == null ? "" : map.get("cateId");
        if (!TextUtils.isEmpty(str4)) {
            str3 = str4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("/list/" + str3 + "-" + str2 + ".html");
        ArrayList arrayListE = e(X1.L(c(sb.toString()), ""));
        int i = Integer.parseInt(str2);
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayListE);
        int i2 = i + 1;
        gVarC.o(i, i2, arrayListE.size(), Math.max(arrayListE.size(), 1) * i2);
        return gVarC.r();
    }

    public static String b(com.github.catvod.spider.merge.f0.k kVar, String str, String str2) {
        com.github.catvod.spider.merge.f0.k kVarR = kVar.R(str);
        return kVarR == null ? "" : kVarR.c(str2).trim();
    }

    public static String f(com.github.catvod.spider.merge.f0.k kVar, String str, String... strArr) {
        com.github.catvod.spider.merge.f0.k kVarR = kVar.R(str);
        if (kVarR == null) {
            return "";
        }
        for (String str2 : strArr) {
            String strTrim = kVarR.c(str2).trim();
            if (!TextUtils.isEmpty(strTrim)) {
                return strTrim;
            }
        }
        return "";
    }

    public static String g(com.github.catvod.spider.merge.f0.k kVar, String str) {
        com.github.catvod.spider.merge.f0.k kVarR = kVar.R(str);
        return kVarR == null ? "" : kVarR.T().trim();
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith("http")) {
            return str;
        }
        if (str.startsWith("//")) {
            return "https:".concat(str);
        }
        String strM186 = "/";
        return str.startsWith(strM186) ? com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.a, str) : com.github.catvod.spider.merge.D.b.n(new StringBuilder(), this.a, strM186, str);
    }

    public final String c(String str) {
        String strM42 = "N1.Mg0P9Xg4S0VkUWACt27ZQLxAwkfaZTI3ESbdg/3TiNIYpME1rQE/1ulSgG3tijbaccZocT2k5QmqyaYRzpo1PA==";
        try {
            try {
                N nZ = X1.z(FishCrypto.u(strM42, str), null, d());
                Map map = (Map) nZ.c;
                List list = (List) map.get("set-cookie");
                if (list == null) {
                    list = (List) map.get("Set-Cookie");
                }
                if (list != null && !list.isEmpty()) {
                    this.b = (String) list.get(0);
                }
                return nZ.a();
            } catch (Exception unused) {
                return X1.X(FishCrypto.u(strM42, str), null, d());
            }
        } catch (Exception unused2) {
            return "";
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

    public final HashMap d() {
        HashMap mapT = com.github.catvod.spider.merge.D.b.t("User-Agent", "Mozilla/5.0 (Linux; Android 9; ALN-AL00 Build/PQ3B.190801.05281406; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/91.0.4472.114 Safari/537.36", "accept-language", "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7");
        mapT.put("Referer", this.a + "/");
        if (!TextUtils.isEmpty(this.b)) {
            mapT.put("Cookie", this.b);
        }
        return mapT;
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

    public final ArrayList e(com.github.catvod.spider.merge.f0.g gVar) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (com.github.catvod.spider.merge.f0.k kVar : gVar.Q(".v_list li, .vlist li, ul.clearfix li, li:has(a[title]):has(img)")) {
            String strB = b(kVar, "a[href]", "href");
            String strB2 = b(kVar, "a[title]", "title");
            if (TextUtils.isEmpty(strB2)) {
                strB2 = g(kVar, "a[title], h3 a, h4 a, .title a, a[href]");
            }
            if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(strB2)) {
                String strA = a(strB);
                if (linkedHashSet.add(strA)) {
                    String strF = f(kVar, "img", "data-original", "data-src", "src");
                    arrayList.add(new k(strA, strB2, a(strF), g(kVar, ".hdtag, .note, .pic-text, .remarks, span")));
                }
            }
        }
        return arrayList;
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

    /* JADX WARN: Code duplicated, block: B:4:0x0039  */
    public void init(Context context, String str) {
        String strTrim;
        super.init(context, str);
        this.a = FishCrypto.v("N1.I1fNajQFLLjz+6YJObTI2wKunZ05RGq6FQYkWSQRIzKKu5+ZCDwnrnWZp3/JrYqRKQa1FfJmKHlywXjQMAK+LD3NSZ5xBn71LpBZwIbteoM=");
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strM558 = "http";
        String strG = "";
        if (zIsEmpty) {
            strTrim = "";
        } else {
            strTrim = str.trim();
            if (!strTrim.startsWith(strM558)) {
                try {
                    strTrim = new JSONObject(strTrim).optString("site");
                    if (TextUtils.isEmpty(strTrim)) {
                        strTrim = "";
                    }
                } catch (Exception unused) {
                }
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(strTrim);
        String strM322 = "/";
        if (!zIsEmpty2) {
            while (strTrim.endsWith(strM322)) {
                strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
            }
            this.a = strTrim;
            return;
        }
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        try {
            Iterator<E> it = X1.L(X1.X(FishCrypto.u("N1.Mg0P9Xg4S0VkUWACt27ZQLxAwkfaZTI3ESbdg/3TiNIYpME1rQE/1ulSgG3tijbaccZocT2k5QmqyaYRzpo1PA==", FishCrypto.v("N1.YPV/I1o1ORI6893j5dPu4wt6jf4OIsGxaOosIMk+YCG77sgZsaC4T+iWfd9Ox6aq0oiWzoeo5bSENBtWKUVXep7pLP7dSwyw5lxoUNub0Pc=")), null, mapS), "").Q(".content-top a[href], a[href]").iterator();
            while (it.hasNext()) {
                String strTrim2 = ((com.github.catvod.spider.merge.f0.k) it.next()).c("href").trim();
                if (strTrim2.startsWith(strM558)) {
                    strG = strTrim2;
                    break;
                }
            }
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        while (strG.endsWith(strM322)) {
            strG = com.github.catvod.spider.merge.D.b.g(strG, 1, 0);
        }
        this.a = strG;
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

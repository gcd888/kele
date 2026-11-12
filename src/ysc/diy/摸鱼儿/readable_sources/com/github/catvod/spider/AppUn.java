package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0294s1;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.H0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.P;
import com.github.catvod.spider.merge.A.X0;
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
import com.github.catvod.spider.merge.p017u.RunnableC0450b;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.RunnableC0543o;
import com.github.catvod.spider.merge.p022z.RunnableC0582w;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class AppUn extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f13short = {920, -30339, 32173, 538, 523, 523, 526, 533, 548, 520, 542, 527, 527, 530, 533, 540, 520, 290, 303, 294, 307, 265, 319, 306, 795, 793, 780, 797, 799, 791, 778, 785, 797, 779, 2615, 2610, 2599, 2610, 1473, 1484, 1477, 1488, 1514, 1499, 1492, 1496, 1488, 2559, 2544, 2549, 2541, 2556, 2539, 2538, 2864, 2871, 2869, 2877, 2843, 2871, 2870, 2860, 2877, 2870, 2860, 3201, 3212, 3314, 1500, 1499, 1497, 1489, 1960, 1965, 1976, 1965, 725, 726, 729, 729, 722, 709, 708, 26274, 30707, 24285, 424, 319, 424, 21432, -30154, 32486, 23044, 25496, 28000, 20484, 2392, 2511, 2392, -25050, 18018, 23840, 2368, 2519, 2368, 2358, 2345, 2352, 370, 485, 370, 260, 283, 258, 23712, -29035, 26189, 556, 573, 573, 568, 547, 530, 574, 552, 569, 569, 548, 547, 554, 574, -29226, 30982, 18534, -29874, 21919, 2725, 2740, 2740, 2737, 2730, 2715, 2743, 2721, 2736, 2736, 2733, 2730, 2723, 2743, 534, 539, 2379, 2372, 2376, 2368, 656, 659, 668, 668, 663, 640, 685, 647, 640, 670, 2762, 2783, 2777, 2765, 2774, 2769, 2771, 2779, 2792, 2775, 2778, 2779, 2769, 2813, 2769, 2768, 2762, 2779, 2768, 2762, 933, 939, 951, 953, 929, 956, 938, 442, 427, 429, 431, 2380, 2377, 2381, 2377, 2388, 2109, 2091, 2095, 2108, 2093, 2086, 2461, 2456, 2445, 2456, 2515, 2518, 2508, 2507, 1761, 1783, 1779, 1760, 1777, 1786, 1745, 1789, 1788, 1766, 1783, 1788, 1766, 2855, 2870, 2853, 2852, 2866, 2867, 2824, 2850, 2853, 2875, 498, 498, 498, 2641, 2606, 2609, 2684, 2645, 2598, 2599, 2643, 2598, 2603, 2667, 2631, 2600, 2636, 2654, 2606, 2677, 2601, 2662, 2604, 2679, 2644, 2637, 2666, 2662, 2676, 2606, 2676, 2670, 2606, 2603, 2635, 2639, 2633, 2652, 2629, 2643, 2629, 2601, 2612, 2663, 2632, 2604, 2632, 2606, 2608, 2647, 2631, 2663, 2638, 2654, 2631, 2678, 2653, 2603, 2664, 2604, 2643, 2652, 2686, 2646, 2650, 2634, 2635, 2598, 2601, 2645, 2670, 2661, 2654, 2599, 2605, 2653, 2651, 2651, 2684, 2608, 2680, 2603, 2612, 2638, 2664, 2680, 2604, 2598, 2683, 2612, 2603, 2629, 2673, 2666, 2599, 2633, 2686, 2645, 2631, 2629, 2644, 2673, 2650, 2673, 2649, 2635, 2664, 2643, 2606, 2632, 2672, 2664, 2652, 2599, 2661, 2667, 2607, 2650, 2679, 2635, 2686, 2669, 2645, 2664, 2651, 2672, 2606, 2605, 2685, 2676, 2629, 2686, 2647, 2640, 2662, 2630, 2641, 2670, 2640, 2685, 2678, 2677, 2676, 2634, 2671, 2662, 2685, 2649, 2662, 2654, 2608, 2640, 2662, 2652, 2668, 2653, 2663, 2637, 2686, 2685, 2604, 2598, 2642, 2599, 2686, 2651, 2685, 2603, 2678, 2642, 2652, 2666, 2638, 2669, 2633, 2641, 2686, 2605, 2664, 2662, 2599, 2644, 2637, 2648, 2646, 2635, 2682, 2652, 2669, 2675, 2683, 2662, 2604, 2599, 2638, 2680, 2682, 2667, 2685, 2650, 2647, 2652, 2642, 2634, 2661, 2678, 2670, 2644, 2645, 2602, 2612, 2676, 2671, 2632, 2640, 2667, 2653, 2606, 2639, 2680, 2594, 2594, 2715, 2749, 2731, 2748, 2787, 2703, 2729, 2731, 2720, 2746, 797, 831, 810, 825, 828, 828, 817, 895, 869, 894, 864, 880, 888, 775, 825, 830, 820, 831, 807, 803, 880, 798, 772, 880, 865, 864, 894, 864, 875, 880, 775, 825, 830, 870, 868, 875, 880, 808, 870, 868, 889, 880, 785, 800, 800, 828, 821, 775, 821, 818, 795, 825, 804, 895, 869, 867, 871, 894, 867, 870, 880, 888, 795, 792, 772, 797, 796, 892, 880, 828, 825, 827, 821, 880, 791, 821, 819, 827, 831, 889, 880, 787, 824, 802, 831, 829, 821, 895, 865, 866, 866, 894, 864, 894, 864, 894, 864, 880, 771, 817, 822, 817, 802, 825, 895, 869, 867, 871, 894, 867, 870, 1475, 1476, 1498, 912, 897, 914, 915, 901, 769, 797, 775, 768, 785, 791, 813, 785, 797, 790, 791, 915, 918, 899, 918, 1380, 1397, 1382, 1383, 1393, 1392, 563, 574, 570, 575, 574, 553, 552, 730, 717, 716, 705, 730, 717, 715, 732, 759, 728, 730, 711, 714, 717, 1049, 1126, 1145, 1144, 1062, 1135, 1050, 1055, 1083, 1148, 1031, 1084, 1134, 1072, 1069, 1026, 1123, 1080, 1125, 1120, 1127, 1062, 1053, 1121, 1125, 1025, 1055, 1024, 1074, 1049, 1060, 1044, 1075, 1061, 1122, 1058, 1052, 1030, 1049, 1052, 1051, 1043, 1060, 1053, 1053, 1076, 1052, 1026, 1126, 1026, 1026, 1030, 1054, 1024, 1127, 1031, 1042, 1041, 1059, 1031, 1029, 1135, 1041, 1049, 1029, 1054, 1062, 1076, 1082, 1056, 1058, 1073, 1037, 1126, 1121, 1041, 1024, 1148, 1120, 1061, 1027, 1058, 1058, 1053, 1054, 1060, 1038, 1026, 1046, 1130, 1130, 1497, 1492, 1488, 1493, 1492, 1475, 484, 481, 494, 493, 481, 491, 501, 2431, 2403, 2414, 2422, 2410, 2429, 2380, 2400, 2401, 2427, 2410, 2401, 2427, 2405, 2405, 2405, 3317, 3314, 3308, 967, 982, 982, 979, 968, 1017, 981, 963, 978, 978, 975, 968, 961, 981, 3088, 3073, 3073, 3076, 3103, 3118, 3074, 3077, 3088, 3077, 3076, 3074, 2743, 2726, 2726, 2723, 2744, 2697, 2750, 2739, 2746, 2726, 1771, 1770, 1787, 1774, 1766, 1763, 3011, 3022, 1593, 1596, 1577, 1596, 1003, 1010, 1017, 962, 1011, 1020, 1008, 1016, 1586, 1590, 1594, 1596, 1598, 1540, 1582, 1577, 1591, 1343, 1318, 1325, 1302, 1328, 1324, 1320, 1339, 2681, 2656, 2667, 2640, 2670, 2685, 2666, 2670, 727, 718, 709, 766, 723, 708, 716, 704, 723, 714, 722, 778, 787, 792, 803, 797, 799, 776, 787, 782, 2776, 2753, 2762, 2801, 2762, 2759, 2780, 2763, 2765, 2778, 2753, 2780, 960, 985, 978, 1001, 980, 986, 963, 964, 980, 646, 671, 660, 687, 659, 668, 657, 643, 643, 2500, 2520, 2517, 2509, 2539, 2503, 2523, 2497, 2502, 2519, 2513, 2503, 1899, 1918, 1895, 1917, 1889, 1898, 1899, 1917, 3250, 3246, 3252, 3251, 3234, 3236, 3230, 3234, 3246, 3237, 3236, 3278, 3265, 3277, 3269, 1497, 1227, 1227, 1227, 2768, 2764, 2774, 2769, 2752, 2758, 2812, 2765, 2754, 2766, 2758, 327, 2448, 2449, 2432, 2453, 2461, 2456, 2487, 2459, 2458, 2432, 2449, 2458, 2432, 3285, 3268, 3268, 3265, 3290, 3307, 3292, 3281, 3288, 3268, 23019, 21749, 31841, 26664, 1363, 1346, 1346, 1351, 1372, 1389, 1345, 1350, 1363, 1350, 1351, 1345, 2940, 2925, 2925, 2920, 2931, 2882, 2926, 2936, 2921, 2921, 2932, 2931, 2938, 2926, 1204, 1192, 1189, 1213, 1162, 1189, 1193, 1185, 20851, 31482, 
    21460, 2384, 2503, 2384, -32050, 30238, 18302, -31658, 23175, -32366, 24387, 30485, 30898, 19053, 28730, 23356, 22459, 22816, 25104, 27090, 21686, 26551, 23251, 17745, 28658, 28257, 28166, 29012, -30165, 21754, 31916, 29451, 18691, 18546, 29221, 22819, 21924, 3148, 3165, 3165, 3160, 3139, 3186, 3166, 3144, 3161, 3161, 3140, 3139, 3146, 3166, -29878, 21915, 32205, 29290, 3295, 3278, 3278, 3275, 3280, 3297, 3277, 3274, 3295, 3274, 3275, 3277, 2851, 2866, 2866, 2871, 2860, 2845, 2865, 2870, 2851, 2870, 2871, 2865, 793, 28625, 21173, 22453, 26516, 26119, 24747, -27104, -30515, 25911, 19508, 30307, 23909, 20962, 1884, 1869, 1869, 1864, 1875, 1890, 1877, 1880, 1873, 1869, 834, 851, 851, 854, 845, 892, 843, 838, 847, 851, 2252, 2241, 2248, 2269, 1181, 1164, 1162, 1160, 1448, 1453, 1449, 1453, 1456, 2064, 2061, 2049, 2064, 2075, 2065, 2010, 2008, 1997, 2012, 2014, 2006, 1995, 1984, 1839, 1834, 1855, 1834, 2568, 2573, 2583, 2576, 1684, 1686, 1667, 1682, 1680, 1688, 1669, 1678, 1716, 1688, 1689, 1667, 1682, 1689, 1667, 2212, 2220, 2237, 2209, 2214, 2221, 1415, 1413, 1428, 703, 696, 678, 572, 561, 565, 560, 561, 550, 551, 1843, 1854, 1845, 1832, 1806, 1843, 1895, 1893, 3020, 3009, 3013, 3008, 879, 867, 866, 888, 873, 866, 888, 801, 888, 885, 892, 873, 2711, 2747, 2746, 2720, 2737, 2746, 2720, 2809, 2688, 2733, 2724, 2737, 3000, 2996, 392, 413, 398, 411, 409, 392, 476, 393, 398, 400, 476, 401, 405, 399, 399, 405, 402, 411, 772, 441, 2744, 2703, 2700, 2703, 2712, 2703, 2712, 2468, 2481, 2481, 1602, 2233, 2229, 2238, 2239, 1487, 1475, 1480, 1481, 500, 508, 490, 490, 504, 510, 508, 1221, 1243, 1231, 938, 947, 952, 899, 949, 952, 1521, 1512, 1507, 1496, 1513, 1510, 1514, 1506, 2548, 2544, 2556, 2554, 2552, 2498, 2536, 2543, 2545, 1070, 1079, 1084, 1031, 1066, 1085, 1077, 1081, 1066, 1075, 1067, 1391, 1402, 1400, 1330, 28524, 661, 23452, 29282, 23372, 20503, -30802, 22479, -28234, 18930, 21168, 2146, 2146, 2146, 2146, 2102, 2134, 2134, 2102, 2175, 2175, 2107, 2131, 2131, 2081, 2166, 2166, 26306, 25731, -32712, 491, 22366, -31381, 28083, 2700, 2692, 1281, 22305, 31912, 21894, 26306, 30611, 24253, -30350, 22435, 30434, 25685, 23412, 24644, 28949, 22587, -26151, 28068, 25852, 22936, 28068, -31438, 23523, 27237, 22273, 25405, -29781, 21882, 26288, 26403, 23839, 23589, 26603, 20978, -27696, 23312, 26320, 19777, -28479, -32372, 24131, -29785, 22757, 31798, 21784, -27924, -30476, 23666, 20844, -29177, 20694, -27721, 26570, 29697, 23855, 24456, 19879, 22818, -28836, 20877, 27420, -27779, -30657, 22254, 22358, -27886, 25178, 25164, -30640, 22145, 20986, 19052, -29013, 23314, 22028, 32408, 27345, 1624, 1743, 1624, -29858, 21903, 32217, 29310, 25417, 29607, 30234, 25773, 26298, 32525, 28842, -30326, 22363, 27873, 28018, 22350, 22132, 28090, -2240, -31813, 23164, 10320, -31758, 30498, 17986, -31382, 23483, 2156, 10718, 2156, -31382, 23483, 29677, 31818, 10321, -26239, 28156, 25764, 22976, -31382, 23483, -2240, 23459, -26239, 20801, 25764, 22976, 32440, 23164, 26670, 20801, 27873, 28018, 23405, 22131, 32487, 27310, 1296, 1415, 1296, 27096, 21692, -24644, -28943, 25537, 31147, -25818, -30101, 27677, 27659, -28227, -32528, 31121, -31390, 30283, 28428, -28684, 26454, 25127, 32754, 26293, -31155, -25979, 26725, -28672, -32435, 28469, 21891, 22321, 23087, 29371, 26354, 22493, 31828, 21882, 2575, 2712, 2575, 2662, 2667, 2581, 24521, 29760, 23918, 938, 829, 938, -27436, 19600, 22482, 331, 476, 331, 317, 290, 315, 26210, 25635, 2520, 2383, 2520, 2478, 2481, 2472, 21514, -31169, 28391, 22410, 17829, 20768, -30882, 22927, -2700, 22114, 27986, 31747, 21805, 27984, 26258, 23542, -2698, -32371, 23346, 26258, 23542, -30884, 22925, 2770, 2768, 2759, 2778, 2780, 2781, 3187, 3175, 3174, 3194, 3191, 3196, 3174, 3195, 3185, 3187, 3174, 3195, 3197, 3196, 3122, 3188, 3187, 3195, 3198, 3191, 3190, 1997, 1992, 2013, 1992, 587, 588, 601, 588, 589, 587, 1868, 1867, 1859, 1862, 1871, 1870, 862, 863, 852, 851, 863, 862, 3235, 3255, 3254, 3242, 3239, 3244, 3254, 3243, 3233, 3235, 3254, 3239, 3238, 2892, 2890, 2908, 2891, 832, 845, 2452, 2443, 2450, 2493, 2439, 2458, 2450, 2443, 2448, 2439, 2449, 2493, 2435, 2454, 1648, 1023, 609, 2521, 2935, 2935, 2935, 2935, 2851, 2883, 2883, 2851, 2922, 2922, 2862, 2886, 2886, 2868, 2915, 2915, 2868, 2941, 2941, 632, 639, 615, 632, 613, 628, 590, 626, 638, 629, 628, 2994, 2992, 2981, 2996, 2998, 3006, 2979, 2984, 2962, 3006, 3007, 2981, 2996, 3007, 2981, 2690, 2701, 2689, 2697, 2441, 2451, 2446, 2463, 2469, 2452, 2459, 2455, 2463, 842, 854, 859, 835, 852, 859, 855, 863, 593, 600, 602, 604, 606, 580, 610, 590, 606, 594, 589, 600, 819, 818, 803, 822, 830, 827, 788, 824, 825, 803, 818, 825, 803, 1318, 1335, 1335, 1330, 1321, 1304, 1316, 1333, 1314, 1315, 1304, 1260, 1264, 1264, 1268, 1214, 1195, 1195, 3240, 3257, 3257, 3260, 3239, 3222, 1817, 1813, 1799, 1792, 1809, 1798, 1835, 1821, 1817, 1813, 1811, 1809, 3141, 3161, 3140, 3164, 3155, 3182, 3160, 3164, 3152, 3158, 3156, 1961, 543, 576, 578, 607, 584, 585, 527, 596, 607, 525, 595, 607, 606, 598, 601, 599, 534, 593, 595, 580, 601, 607, 606, 525, 595, 593, 576, 580, 595, 600, 593, 534, 579, 601, 596, 525, 1836, 27620, 22144, -25216, -29491, 32354, -32111, 29112, -32608, 32383, 26908, 27757, 26940, 29526, 30697, 29497, 20699, 26951, 28316, -31685, -28197, -32618, 17042, 29418, 29727, 23963, 22439, 16932, 30308, 2915, 2926, 27177, 22349, 25809, 21598, -1587, 23347, -30933, 21609, 28858, 22932, 1181, 1182, 1228, 1167, 1165, 1180, 1176, 1167, 1156, 1165, 1228, 1176, 1157, 1153, 1161, 1155, 1177, 1176, 24922, 20806, 18581, 29296, 22448, 24433, 18523, -1670, -29311, 31867, 21112, -26693, -29277, 2086, 2081, 2083, 2091, 2061, 2081, 2080, 2106, 2091, 2080, 2106, 1835, 1836, 1838, 1830, 1813, 1834, 1831, 1830, 1836, 1792, 1836, 1837, 1847, 1830, 1837, 1847, 1920, 1929, 1926, 1932, 1947, 1920, 1929, 1923, 1933, 1748, 1757, 1746, 1752, 1743, 1748, 1757, 1751, 1753, 1692, 1754, 1757, 1749, 1744, 1753, 1752, 2156, 1454, 1458, 1458, 1462, 841, 888, 888, 861, 870, 808, 877, 880, 892, 808, 876, 877, 875, 890, 881, 888, 892, 808, 878, 873, 865, 868, 877, 876, 877, 885, 877, 2990, 1940, 1928, 1925, 1949, 1930, 1925, 1929, 1921, 1884, 1901, 1901, 1864, 1907, 
    1853, 1912, 1907, 1918, 1903, 1892, 1901, 1897, 1912, 1913, 1853, 1912, 1893, 1897, 1853, 1903, 1912, 1900, 1896, 1908, 1903, 1912, 1902, 1853, 1901, 1909, 1901, 1853, 1916, 1907, 1913, 1853, 1901, 1905, 1916, 1892, 1907, 1916, 1904, 1912, 3030, 3025, 3030, 3019, 3052, 3034, 3020, 3020, 3030, 3024, 3025, 1070, 1055, 1055, 1082, 1025, 1103, 1034, 1047, 1051, 1103, 1053, 1034, 1054, 1050, 1030, 1053, 1034, 1052, 1103, 1055, 1031, 1055, 1103, 1038, 1025, 1035, 1103, 1055, 1027, 1038, 1046, 1025, 1038, 1026, 1034, 738, 741, 738, 767, 2553, 2555, 2540, 2545, 2551, 2550, 2069, 2071, 2048, 2069, 2052, 2071, 2048, 3028, 3022, 3027, 3010, 453, 469, 467, 472, 467, 1393, 1376, 1395, 1376, 1388, 1394, 2094, 2081, 2084, 2088, 2083, 2105, 2066, 2105, 2084, 2080, 2088, 2066, 2080, 2110, 1777, 1776, 1763, 1788, 1782, 1776, 1738, 1788, 1777, 1498, 1501, 1480, 1501, 1484, 757, 765, 748, 761, 1539, 1540, 1553, 1540, 1557, 2565, 2562, 2583, 2562, 2579, 424, 447, 427, 431, 447, 425, 430, 1218, 1216, 1239, 1226, 1228, 1229, 2557, 2545, 2544, 2541, 2539, 2547, 2555, 2223, 2229, 2216, 2233, 2018, 2034, 2036, 2047, 2036, 1566, 1539, 1545, 1537, 1551, 1566, 1255, 1274, 1264, 1272, 1270, 1255, 551, 570, 560, 568, 566, 551, 1042, 1045, 1024, 1045, 1044, 1042, 2020, 2025, 2029, 2024, 2025, 2046, 2047, 1811, 1822, 1813, 1800, 1443, 1451, 1466, 1455, 1164, 1163, 1182, 1163, 1178, 970, 973, 984, 973, 988, 2699, 2688, 2717, 2705, 736, 737, 744, 741, 765, 731, 745, 759, 3077, 3090, 3076, 3074, 3099, 3075, 2724, 2726, 2737, 2724, 2741, 2726, 2737, 2804, 2726, 2737, 2725, 2721, 2737, 2727, 2720, 2804, 2745, 2749, 2727, 2727, 2749, 2746, 2739, 2734, 2750, 2725, 2728, 2731, 2729, 2796, 2750, 2729, 2749, 2745, 2729, 2751, 2744, 2796, 2729, 2740, 2735, 2729, 2729, 2728, 2729, 2728, 2796, 2804, 2796, 2750, 2723, 2745, 2722, 2728, 2751, 3020, 3017, 3022, 3020, 3027, 3023, 3033, 1512, 1535, 1533, 1523, 1513, 1518, 1535, 1512, 3087, 3085, 3100, 3096, 3087, 3076, 3085, 2314, 2319, 2330, 2319, 3108, 3113, 2132, 2134, 2119, 2115, 2132, 2143, 2134, 2071, 2131, 2134, 2115, 2134, 2071, 2138, 2142, 2116, 2116, 2142, 2137, 2128, 3094, 3092, 3077, 3073, 3094, 3101, 3092, 3157, 3091, 3092, 3100, 3097, 3088, 3089, 924, 2917, 789, 790, 791, 784, 785, 786, 787, 796, 797, 798, 799, 792, 793, 794, 795, 772, 773, 774, 775, 768, 769, 770, 771, 780, 781, 782, 821, 822, 823, 816, 817, 818, 819, 828, 829, 830, 831, 824, 825, 826, 827, 804, 805, 806, 807, 800, 801, 802, 803, 812, 813, 814, 836, 837, 838, 839, 832, 833, 834, 835, 844, 845, 3285, 3290, 3286, 3294, 1366, 1351, 1365, 1365, 1361, 1353, 1364, 1346, 574, 559, 573, 573, 569, 545, 572, 554, 529, 557, 545, 544, 552, 551, 572, 547, 559, 570, 551, 545, 544, 2401, 2403, 2418, 2422, 2401, 2410, 2403, 2397, 2411, 2406, 1369, 1371, 1354, 1358, 1369, 1362, 1371, 1381, 1371, 1364, 1373, 1366, 1375, 2489, 2359, 708, 710, 727, 723, 708, 719, 710, 760, 723, 725, 710, 708, 716, 2839, 2832, 2824, 2839, 2826, 2843, 2849, 2845, 2833, 2842, 2843, 258, 277, 279, 281, 259, 260, 277, 258, 2026, 1228, 1245, 1245, 1240, 1219, 1266, 1220, 1219, 1243, 1220, 1241, 1224, 1266, 2298, 2278, 2283, 2291, 2287, 2296, 2249, 2277, 2276, 2302, 2287, 2276, 2302, 1023, 753, 715, 647, 716, 666, 647, 659, 759, 721, 667, 668, 727, 1907, 1897, 1880, 1880, 1917, 1862, 1909, 1907, 1850, 1852, 1385, 1300, 1768, 1778, 3134, 3112, 3116, 3135, 3118, 3109, 3086, 3106, 3107, 3129, 3112, 3107, 3129, 2674, 2660, 2656, 2675, 2658, 2665, 2626, 2670, 2671, 2677, 2660, 2671, 2677, 2189, 3063, 3021, 2945, 3018, 2972, 2945, 2965, 3057, 3031, 2973, 2970, 3025, 281, 2325, 2326, 2334, 2320, 2327, 2414, 2401, 2413, 2405, 1171, 1696, 1713, 1699, 1699, 1703, 1727, 1698, 1716, 423, 2725, 2726, 2734, 2720, 2727, 2385, 2368, 2391, 2390, 2413, 2393, 2391, 2379, 2096, 2103, 2095, 2096, 2093, 2108, 2054, 2098, 2108, 2080, 1386, 1301, 1290, 1308, 1389, 1388, 1395, 1358, 1385, 1301, 1308, 1349, 1392, 1399, 1349, 1384, 1353, 1404, 1396, 1361, 1374, 1296, 1365, 1362, 1381, 1351, 1346, 1385, 1396, 1367, 1358, 1394, 1301, 1362, 1390, 1384, 1297, 1357, 1379, 1372, 1378, 1367, 1373, 1388, 1366, 1384, 1303, 1394, 1373, 1362, 1381, 1301, 1378, 1298, 1353, 1358, 1382, 1387, 1404, 1299, 1344, 1397, 1355, 1296, 1404, 1387, 1309, 1295, 1367, 1309, 1366, 1347, 1349, 1308, 1388, 1355, 1382, 1373, 1385, 1346, 1363, 1301, 1346, 1367, 1362, 1394, 1356, 1360, 1397, 1305, 1305, 711, 696, 679, 761, 715, 732, 760, 749, 767, 751, 749, 739, 712, 717, 735, 735, 706, 703, 729, 721, 717, 709, 732, 743, 743, 741, 734, 760, 699, 696, 706, 753, 740, 733, 706, 699, 749, 762, 766, 715, 697, 678, 715, 701, 703, 700, 715, 700, 744, 762, 761, 704, 711, 701, 750, 761, 753, 707, 719, 723, 697, 760, 766, 743, 696, 760, 712, 696, 731, 755, 750, 716, 714, 744, 763, 746, 719, 707, 755, 704, 761, 712, 720, 755, 710, 765, 729, 723, 705, 747, 762, 751, 715, 731, 704, 701, 744, 748, 717, 701, 705, 678, 734, 696, 729, 701, 717, 674, 748, 709, 746, 729, 719, 699, 674, 743, 674, 746, 716, 744, 753, 708, 747, 755, 751, 761, 709, 766, 700, 723, 746, 718, 734, 740, 753, 730, 689, 706, 696, 743, 728, 699, 733, 718, 718, 728, 704, 733, 742, 753, 738, 710, 712, 692, 692, 1556, 1643, 1652, 1556, 1559, 1589, 1570, 1576, 1649, 1642, 1557, 1557, 1640, 1544, 1577, 1584, 1566, 1586, 1598, 1536, 1647, 1653, 1647, 1554, 1546, 1595, 1599, 1547, 1634, 1561, 1565, 1584, 1642, 1649, 1561, 1557, 1561, 1599, 1588, 1590, 1642, 1578, 1570, 1566, 1560, 1646, 1538, 1545, 1634, 1558, 1552, 1646, 1644, 1643, 1587, 1641, 1644, 1647, 1566, 1590, 1644, 1635, 1587, 1640, 1580, 1563, 1561, 1649, 1553, 1581, 1554, 1584, 1568, 1640, 1635, 1591, 1595, 1551, 1558, 1552, 1551, 1597, 1536, 1557, 1591, 1552, 1544, 1634, 1585, 1563, 1539, 
    1559, 1599, 1589, 1545, 1548, 1589, 1555, 1593, 1568, 1577, 1647, 1586, 1585, 1564, 1581, 1649, 1642, 1567, 1593, 1639, 714, 693, 682, 721, 693, 748, 705, 737, 734, 714, 734, 750, 724, 690, 743, 688, 711, 758, 713, 693, 713, 687, 718, 746, 747, 752, 742, 693, 755, 752, 754, 694, 695, 736, 758, 723, 712, 711, 734, 752, 704, 755, 765, 694, 688, 765, 733, 765, 705, 700, 749, 691, 691, 690, 739, 755, 709, 753, 745, 746, 727, 707, 683, 700, 738, 721, 722, 717, 720, 694, 755, 733, 751, 691, 710, 745, 751, 718, 759, 745, 722, 734, 700, 764, 733, 766, 754, 737, 737, 756, 718, 726, 700, 710, 752, 707, 766, 750, 752, 705, 741, 736, 754, 694, 718, 705, 691, 691, 765, 713, 697, 2394, 2392, 2382, 2370, 2385, 2370, 2388, 2396, 2398, 2393, 2384, 681, 685, 2888, 2893, 2904, 2893, 632, 585, 585, 620, 599, 537, 585, 593, 585, 537, 605, 600, 589, 600, 537, 596, 592, 586, 586, 592, 599, 606, 2354, 2341, 2341, 2360, 2341, 705, 752, 752, 725, 750, 672, 752, 744, 752, 672, 742, 737, 745, 748, 741, 740, 829, 780, 780, 809, 786, 860, 782, 793, 783, 780, 787, 786, 783, 793, 860, 792, 793, 799, 782, 773, 780, 776, 860, 794, 797, 789, 784, 793, 792, 2474, 2459, 2459, 2494, 2437, 2507, 2457, 2446, 2456, 2459, 2436, 2437, 2456, 2446, 2507, 2446, 2437, 2461, 2446, 2439, 2436, 2459, 2446, 2507, 2434, 2456, 2507, 2434, 2437, 2461, 2442, 2439, 2434, 2447, 2744, 2697, 2697, 2732, 2711, 2777, 2697, 2705, 2697, 2777, 2699, 2716, 2701, 2700, 2699, 2711, 2716, 2717, 2777, 2716, 2708, 2697, 2701, 2688, 2777, 2699, 2716, 2698, 2697, 2710, 2711, 2698, 2716, 1696, 1681, 1681, 1716, 1679, 1729, 1683, 1668, 1680, 1684, 1668, 1682, 1685, 1729, 1668, 1679, 1666, 1683, 1688, 1681, 1685, 1729, 1671, 1664, 1672, 1677, 1668, 1669, 1301, 1316, 1316, 1281, 1338, 1396, 1316, 1340, 1316, 1396, 1341, 1319, 1396, 1338, 1339, 1312, 1396, 1335, 1339, 1338, 1330, 1341, 1331, 1313, 1318, 1329, 1328};
    public boolean f;
    public boolean g;
    public long i;
    public long j;
    public boolean k;
    public String a = "";
    public String b = "";
    public String c = "";
    public volatile String d = "";
    public Object e = JSONObject.NULL;
    public String h = "";
    public final AtomicBoolean l = new AtomicBoolean(false);

    final class TargetReply {
        public final int a;
        public final JSONObject b;
        public final String c;

        public TargetReply(int i, String str, JSONObject jSONObject) {
            this.a = i;
            this.b = jSONObject;
            this.c = str;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        String strM102 = "设置";
        String strM499 = "appun_settings";
        String strM539 = "type_id";
        try {
            JSONArray jSONArrayOptJSONArray = b("categories", new JSONObject(), false).optJSONArray("data");
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString(strM539))) {
                        String strOptString = jSONObjectOptJSONObject.optString(strM539);
                        arrayList.add(new com.github.catvod.spider.merge.p001b.b(strOptString, jSONObjectOptJSONObject.optString("type_name"), null));
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("filters");
                        if (z && jSONObjectOptJSONObject2 != null) {
                            linkedHashMap.put(strOptString, w(jSONObjectOptJSONObject2));
                        }
                    }
                }
            }
            arrayList.add(new com.github.catvod.spider.merge.p001b.b(strM499, strM102, null));
            return com.github.catvod.spider.merge.p001b.g.v(arrayList, linkedHashMap);
        } catch (Exception e) {
            s("homeContent", e);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new com.github.catvod.spider.merge.p001b.b(strM499, strM102, null));
            return com.github.catvod.spider.merge.p001b.g.v(arrayList2, new LinkedHashMap());
        }
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        return AbstractC0309x1.j(str);
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        String strM486 = "ID:";
        try {
            JSONObject jSONObjectOptJSONObject = b("home", new JSONObject(), false).optJSONObject("data");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray("banners");
            ArrayList arrayList = new ArrayList();
            String strM408 = this.g ? strM486 + this.h : "未登录 · 到设置完成注册";
            if (this.g) {
                StringBuilder sb = new StringBuilder();
                sb.append(strM408);
                long j = this.i;
                sb.append(j <= 0 ? " · 非会员" : j > System.currentTimeMillis() / 1000 ? " · VIP" : " · VIP已过期");
                strM408 = sb.toString();
            }
            arrayList.add(new k("appun_settings", "设置与账号", AbstractC0302v0.z1(), strM408, "appun_settings"));
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2 != null) {
                        arrayList.add(new k(jSONObjectOptJSONObject2.optString("id"), jSONObjectOptJSONObject2.optString("name"), jSONObjectOptJSONObject2.optString("banner_url"), jSONObjectOptJSONObject2.optString("tags")));
                    }
                }
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        } catch (Exception e) {
            s("homeVideoContent", e);
            return "";
        }
    }

    private /* synthetic */ boolean $host$53940b53855fde82() {
        return true;
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int iMax;
        String str3 = str;
        try {
            JSONObject jSONObject = new JSONObject();
            String strM467 = "keyword";
            if (str3 == null) {
                str3 = "";
            }
            JSONObject jSONObjectPut = jSONObject.put(strM467, str3);
            String strM554 = "page";
            try {
                iMax = Math.max(1, Integer.parseInt(str2));
            } catch (Exception unused) {
                iMax = 1;
            }
            JSONObject jSONObjectOptJSONObject = b("search", jSONObjectPut.put(strM554, iMax).put("limit", 20), true).optJSONObject("data");
            return com.github.catvod.spider.merge.p001b.g.y(x(jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray("list")));
        } catch (Exception e) {
            s("searchContent", e);
            return "";
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strM422 = "parsed_url";
        try {
            String strI = AbstractC0280n1.i(str, str2, null, null);
            String[] strArrSplit = str2.split("@@@", 2);
            String strOptString = strArrSplit[0];
            HashMap map = new HashMap();
            String strV = FishCrypto.v("N1.cJ98L94tX7SA1j6y3hKRuyk1kq14TPVCZLZ6+xW3W1/HXxQAXiB4w3LCaIEUT96JqzA82BDDc/g4+Qwg39d+4Znu8VaJXZKnEnFTwL1WowC8zt0EhTarJwDo12bkZaHOyYNqObijkUpybFyA/OyCsBxRab39M8aDb4iMCuQrVNa2wy8KRGITeCrldy38QgetbEHCMUziqKJ5+kpWOtB1Pg==");
            String strM223 = "User-Agent";
            if (TextUtils.isEmpty(strV)) {
                strV = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36";
            }
            map.put(strM223, strV);
            boolean zJ = AbstractC0309x1.j(strOptString);
            String strM219 = "url";
            String strM459 = "parse";
            if (!zJ) {
                JSONObject jSONObjectB = b(strM459, new JSONObject().put(strM219, strOptString).put("source_code", strArrSplit.length > 1 ? strArrSplit[1] : ""), true);
                if (p(jSONObjectB)) {
                    D();
                    return "";
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("data");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("parsed") && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString(strM422))) {
                    strOptString = jSONObjectOptJSONObject.optString(strM422);
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("headers");
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObjectOptJSONObject2.optString(next));
                        }
                    }
                    if (jSONObjectOptJSONObject.optBoolean("redirect_probe")) {
                        strOptString = m(strOptString, map);
                    }
                }
                D();
                return "";
            }
            JSONObject jSONObjectPut = new JSONObject().put(strM459, 0).put(strM219, FishCrypto.w("N1./q8MHl+Pk9gzU4o270qJ62VHWeNsCdr5uKQNKLDsJJcKU1UUQIW0PEFtPR8FNRIqcmwufZ16FW+7rTuuJIsYUA==", strOptString)).put("header", new JSONObject(map));
            if (strI != null) {
                jSONObjectPut.put("danmaku", strI);
            }
            return jSONObjectPut.toString();
        } catch (Exception e) {
            s("playerContent", e);
            D();
            return "";
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArray;
        String strM567 = "$$$";
        String strM292 = "url";
        if (list != null && !list.isEmpty()) {
            String str = list.get(0);
            if (!"appun_settings".equals(str) && !"appun_status".equals(str) && !"appun_help".equals(str)) {
                try {
                    JSONObject jSONObjectB = b("detail", new JSONObject().put("id", str), true);
                    if (p(jSONObjectB)) {
                        D();
                        return "";
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        D();
                        return "";
                    }
                    k kVar = new k();
                    kVar.n(str);
                    kVar.o(jSONObjectOptJSONObject.optString("vod_name"));
                    kVar.p(jSONObjectOptJSONObject.optString("image_url"));
                    kVar.u(jSONObjectOptJSONObject.optString("vod_year"));
                    kVar.k(jSONObjectOptJSONObject.optString("vod_area"));
                    kVar.s(jSONObjectOptJSONObject.optString("vod_remarks"));
                    kVar.j(jSONObjectOptJSONObject.optString("vod_actor"));
                    kVar.m(jSONObjectOptJSONObject.optString("vod_director"));
                    kVar.l(jSONObjectOptJSONObject.optString("vod_blurb"));
                    kVar.i(jSONObjectOptJSONObject.optString("vod_class"));
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("play_sources");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i = 0;
                        while (i < jSONArrayOptJSONArray2.length()) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i);
                            if (jSONObjectOptJSONObject2 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("episodes")) == null) {
                                jSONArray = jSONArrayOptJSONArray2;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                String strOptString = jSONObjectOptJSONObject2.optString("source_code");
                                int i2 = 0;
                                while (i2 < jSONArrayOptJSONArray.length()) {
                                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i2);
                                    if (jSONObjectOptJSONObject3 != null && !TextUtils.isEmpty(jSONObjectOptJSONObject3.optString(strM292))) {
                                        arrayList3.add(jSONObjectOptJSONObject3.optString("name") + "$" + jSONObjectOptJSONObject3.optString(strM292) + "@@@" + strOptString);
                                    }
                                    i2++;
                                    jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                                }
                                jSONArray = jSONArrayOptJSONArray2;
                                if (!arrayList3.isEmpty()) {
                                    arrayList.add(C0294s1.b(jSONObjectOptJSONObject2.optString("source_name")));
                                    arrayList2.add(TextUtils.join("#", arrayList3));
                                }
                            }
                            i++;
                            jSONArrayOptJSONArray2 = jSONArray;
                        }
                        if (arrayList2.isEmpty()) {
                            D();
                            return com.github.catvod.spider.merge.p001b.g.s(kVar);
                        }
                        C0294s1.e(arrayList, arrayList2);
                        C0294s1.c(F(), arrayList);
                        kVar.q(TextUtils.join(strM567, arrayList));
                        kVar.r(TextUtils.join(strM567, arrayList2));
                        boolean z = FishCrypto.a;
                        N1.d(kVar);
                        AbstractC0280n1.p(kVar.c());
                        AbstractC0280n1.q(kVar.e());
                        return com.github.catvod.spider.merge.p001b.g.s(kVar);
                    }
                    D();
                    return com.github.catvod.spider.merge.p001b.g.s(kVar);
                } catch (Exception e) {
                    s("detailContent", e);
                    D();
                    return "";
                }
            }
            AbstractC0302v0.g0(str, new i(2, this));
        }
        return "";
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        String strM463 = "appun_help";
        str.getClass();
        String strM169 = "当前站源";
        byte b = -1;
        switch (str.hashCode()) {
            case -1424960952:
                if (str.equals("appun_settings")) {
                    b = 0;
                }
                break;
            case -1060820137:
                if (str.equals("appun_status")) {
                    b = 1;
                }
                break;
            case -828260378:
                if (str.equals(strM463)) {
                    b = 2;
                }
                break;
        }
        switch (b) {
            case 0:
                String strF = F();
                String strA = a(n());
                RunnableC0450b runnableC0450b = new RunnableC0450b(this, 6);
                RunnableC0450b runnableC0450b2 = new RunnableC0450b(this, 7);
                P1.K0(P1.E1(strF, strM169) + " · 设置与账号", "账号管理与使用帮助", new String[]{"账号管理", "使用帮助"}, new String[]{P1.E1(strA, "尚未注册"), "注册与播放教程"}, new int[]{(strA == null || !strA.startsWith("已登录")) ? AbstractC0583w0.f : AbstractC0583w0.d, AbstractC0583w0.c}, new Runnable[]{runnableC0450b, runnableC0450b2});
                break;
            case 1:
                C();
                break;
            case 2:
                String strF2 = F();
                HashMap map = new HashMap();
                if (!TextUtils.isEmpty(strF2)) {
                    strM169 = strF2;
                }
                map.put("playName", strM169);
                P1.X0(strM463, map);
                break;
        }
        return "";
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = str;
        int iMax = 1;
        if ("appun_settings".equals(str3)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new k("appun_status", "账号管理", AbstractC0302v0.a(), a(n()), "appun_status"));
            arrayList.add(new k("appun_help", "使用帮助", AbstractC0302v0.a0(), F() + " 注册和播放排错说明", "appun_help"));
            return AbstractC0449a.c(1, 1, arrayList.size(), arrayList.size(), arrayList);
        }
        try {
            iMax = Math.max(1, Integer.parseInt(str2));
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            String strM31 = "type";
            if (str3 == null) {
                str3 = "";
            }
            JSONObject jSONObjectOptJSONObject = b("category", jSONObject2.put(strM31, str3).put("page", iMax).put("limit", 20).put("extend", jSONObject), false).optJSONObject("data");
            ArrayList arrayListX = x(jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray("list"));
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.o(iMax, 500, 20, 9999);
            gVar.F(arrayListX);
            return gVar.r();
        } catch (Exception e) {
            s("categoryContent", e);
            return "";
        }
    }

    public static TargetReply A(JSONObject jSONObject) throws IOException {
        String strM382 = "method";
        String strM368 = "GET";
        String upperCase = jSONObject.optString(strM382, strM368).trim().toUpperCase(Locale.US);
        String strTrim = jSONObject.optString("url", "").trim();
        if (TextUtils.isEmpty(strTrim)) {
            throw new IOException("target url missing");
        }
        Request.Builder builderU = com.github.catvod.spider.merge.D.b.u(strTrim);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObjectOptJSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOptString)) {
                    builderU.header(next, strOptString);
                }
            }
        }
        byte[] bArrDecode = Base64.decode(jSONObject.optString("body_b64", ""), 0);
        MediaType mediaTypeCreate = null;
        if (!strM368.equals(upperCase) && !"HEAD".equals(upperCase)) {
            String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("Content-Type", jSONObjectOptJSONObject.optString("content-type", "")) : "";
            mediaTypeCreate = RequestBody.create(TextUtils.isEmpty(strOptString2) ? null : MediaType.parse(strOptString2), bArrDecode);
        }
        builderU.method(upperCase, mediaTypeCreate);
        Response responseI = X1.I(builderU.build());
        try {
            ResponseBody responseBodyBody = responseI.body();
            byte[] bArrBytes = responseBodyBody == null ? new byte[0] : responseBodyBody.bytes();
            JSONObject jSONObject2 = new JSONObject();
            for (String str : responseI.headers().names()) {
                jSONObject2.put(str, TextUtils.join(", ", responseI.headers().values(str)));
            }
            TargetReply targetReply = new TargetReply(responseI.code(), Base64.encodeToString(bArrBytes, 2), jSONObject2);
            responseI.close();
            return targetReply;
        } catch (Throwable th) {
            if (responseI != null) {
                try {
                    responseI.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void f(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            boolean z = FishCrypto.a;
            if (TextUtils.isEmpty(C0297t1.h(str2))) {
                String strH = C0297t1.h(str);
                if (TextUtils.isEmpty(strH)) {
                    return;
                }
                C0297t1.j(str2, strH);
            }
        } catch (Exception unused) {
        }
    }

    public static String m(String str, HashMap map) {
        if (TextUtils.isEmpty(str) || !str.contains("?") || !str.contains("=")) {
            return str;
        }
        try {
            URL url = new URL(str);
            HashMap map2 = new HashMap(map);
            map2.put("Referer", url.getProtocol() + "://" + url.getHost() + "/");
            String strE = X1.E(str, map2);
            return TextUtils.isEmpty(strE) ? str : new URL(url, strE).toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean p(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        int iOptInt = jSONObject.optInt("code", 0);
        return iOptInt == 401 || iOptInt == 403 || iOptInt == 4011;
    }

    public static boolean q(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.optInt("code", -1) == 0;
    }

    public static String u(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return str;
        }
        String strOptString = jSONObject.optString("msg", jSONObject.optString("message", ""));
        return TextUtils.isEmpty(strOptString) ? str : strOptString;
    }

    public static ArrayList w(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() >= 2) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strOptString, strOptString));
                }
                arrayList.add(new com.github.catvod.spider.merge.p001b.d(next, next, arrayList2));
            }
        }
        return arrayList;
    }

    public static ArrayList x(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(new k(jSONObjectOptJSONObject.optString("vod_id"), jSONObjectOptJSONObject.optString("vod_name"), jSONObjectOptJSONObject.optString("image_url"), jSONObjectOptJSONObject.optString("vod_remarks")));
            }
        }
        return arrayList;
    }

    public static String z() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        StringBuilder sb = new StringBuilder(16);
        for (int i = 0; i < 8; i++) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(bArr[i] & 255)));
        }
        return sb.toString();
    }

    public final synchronized void B() {
        this.e = JSONObject.NULL;
        this.f = false;
        this.g = false;
        this.h = "";
        this.i = 0L;
    }

    public final void C() {
        String strB;
        boolean zN = n();
        String strF = F();
        String strA = a(zN);
        String strM210 = "无";
        if (zN) {
            try {
                String strG = g();
                boolean z = FishCrypto.a;
                strM210 = new JSONObject(C0297t1.h(strG)).optString("u", strM210);
            } catch (Exception unused) {
            }
        }
        boolean z2 = this.g;
        String strM402 = "待登录后获取";
        if (!z2) {
            strB = strM402;
        } else if (this.i <= 0) {
            strB = "非会员";
        } else {
            String str = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US).format(new Date(this.i * 1000));
            strB = this.i > System.currentTimeMillis() / 1000 ? com.github.catvod.spider.merge.D.b.B("有效至 ", str) : com.github.catvod.spider.merge.D.b.j("已过期 (", str, ")");
        }
        boolean z3 = this.g;
        String strM499 = z3 ? "已登录" : "未登录";
        if (z3 && !TextUtils.isEmpty(this.h)) {
            strM402 = this.h;
        }
        String[] strArr = {strM499, strM210, strM402, strB};
        boolean z4 = this.g;
        RunnableC0450b runnableC0450b = new RunnableC0450b(this, 0);
        RunnableC0450b runnableC0450b2 = (!zN || z4) ? null : new RunnableC0450b(this, 4);
        RunnableC0450b runnableC0450b3 = zN ? new RunnableC0450b(this, 5) : null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList.add("账号状态");
        arrayList2.add(P1.E1(strA, "尚未登录"));
        arrayList3.add(Integer.valueOf(z4 ? AbstractC0583w0.d : AbstractC0583w0.f));
        arrayList4.add(new RunnableC0582w(strF, strArr, z4));
        arrayList.add(zN ? "重新注册新账号" : "注册新账号");
        arrayList2.add(zN ? "播放异常时可重复操作" : "验证后自动登录");
        arrayList3.add(Integer.valueOf(zN ? AbstractC0583w0.f : AbstractC0583w0.d));
        arrayList4.add(runnableC0450b);
        if (zN && !z4 && runnableC0450b2 != null) {
            arrayList.add("重试当前账号");
            arrayList2.add("重新登录已保存账号");
            arrayList3.add(Integer.valueOf(AbstractC0583w0.c));
            arrayList4.add(runnableC0450b2);
        }
        if (zN && runnableC0450b3 != null) {
            arrayList.add("清除账号");
            arrayList2.add("删除本机账号和会话");
            arrayList3.add(Integer.valueOf(AbstractC0583w0.e));
            arrayList4.add(runnableC0450b3);
        }
        String str2 = P1.E1(strF, "当前站源") + " · 账号管理";
        String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
        String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
        int[] iArr = new int[arrayList3.size()];
        for (int i = 0; i < arrayList3.size(); i++) {
            iArr[i] = ((Integer) arrayList3.get(i)).intValue();
        }
        P1.K0(str2, "查看状态或管理账号", strArr2, strArr3, iArr, (Runnable[]) arrayList4.toArray(new Runnable[0]));
    }

    public final void D() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.j < 10000) {
            return;
        }
        this.j = jCurrentTimeMillis;
        X0.a("播放异常时，请到“设置与账号 → 账号管理”重新注册账号，可重复注册直到恢复播放");
    }

    public final void E() {
        P1.K0(P1.E1(F(), "当前站源") + " · 注册验证", "选择验证方式", new String[]{"扫码验证", "本机验证"}, new String[]{"电视端推荐", "手机端推荐"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, new Runnable[]{new RunnableC0450b(this, 11), new RunnableC0450b(this, 1)});
    }

    public final String F() {
        return TextUtils.isEmpty(this.d) ? "当前站源" : this.d;
    }

    public final String a(boolean z) {
        String strM554;
        String strM516;
        if (!this.g) {
            return z ? "已保存账号，尚未登录" : "未注册，请先注册账号";
        }
        if (TextUtils.isEmpty(this.h)) {
            strM554 = "已登录";
        } else {
            strM554 = "已登录 · ID:" + this.h;
        }
        StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strM554);
        long j = this.i;
        if (j <= 0) {
            strM516 = " · 非会员";
        } else {
            strM516 = j > System.currentTimeMillis() / 1000 ? " · VIP有效" : " · VIP已过期";
        }
        sbO.append(strM516);
        return sbO.toString();
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

    public final JSONObject b(String str, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        try {
            i();
            JSONObject jSONObjectJ = j(str, jSONObject2 == null ? new JSONObject() : jSONObject2);
            if (z && p(jSONObjectJ)) {
                this.g = false;
                this.h = "";
                this.i = 0L;
                t();
                if (!this.g) {
                    return jSONObjectJ;
                }
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                return j(str, jSONObject2);
            }
            return jSONObjectJ;
        } catch (Exception e) {
            s(str, e);
            return new JSONObject();
        }
    }

    public final void c(JSONObject jSONObject) throws IOException {
        boolean zQ = q(jSONObject);
        String strM219 = "authentication failed";
        if (!zQ) {
            throw new IOException(u(strM219, jSONObject));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = jSONObject;
        }
        String strM54 = "status";
        String strOptString = jSONObjectOptJSONObject.optString(strM54, jSONObject.optString(strM54, ""));
        if (!"failed".equalsIgnoreCase(strOptString) && !"denied".equalsIgnoreCase(strOptString)) {
            String strM105 = "authenticated";
            if (!jSONObjectOptJSONObject.has(strM105) || jSONObjectOptJSONObject.optBoolean(strM105)) {
                String strM503 = "user";
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strM503);
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = jSONObject.optJSONObject(strM503);
                }
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject2;
                }
                this.h = jSONObjectOptJSONObject.optString("id", "");
                String strOptString2 = jSONObjectOptJSONObject.optString("vip_expires_at", "");
                long time = 0;
                if (!TextUtils.isEmpty(strOptString2)) {
                    try {
                        String strReplace = strOptString2.replace("T", " ").replace("Z", "");
                        if (strReplace.contains(".")) {
                            strReplace = strReplace.substring(0, strReplace.indexOf(46));
                        }
                        time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).parse(strReplace).getTime() / 1000;
                    } catch (Exception unused) {
                    }
                }
                this.i = time;
                String strOptString3 = jSONObjectOptJSONObject.optString("invite_code", "");
                if (!TextUtils.isEmpty(strOptString3)) {
                    String strO = o();
                    boolean z = FishCrypto.a;
                    C0297t1.j(strO, strOptString3);
                }
                this.g = true;
                return;
            }
        }
        throw new IOException(u(strM219, jSONObject));
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

    public final void d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strTrim = jSONObject.optString("playname", jSONObject.optString("site_name", jSONObject.optString("name", ""))).trim();
        if (!TextUtils.isEmpty(strTrim)) {
            this.d = strTrim;
        }
        if (this.k) {
            return;
        }
        Object objOpt = jSONObject.opt("legacy_scope");
        if (objOpt instanceof JSONObject) {
            v((JSONObject) objOpt);
        } else {
            if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
                return;
            }
            try {
                v(new JSONObject((String) objOpt));
            } catch (Exception unused) {
            }
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

    public final synchronized void e(boolean z) {
        B();
        try {
            String strG = g();
            boolean z2 = FishCrypto.a;
            C0297t1.b(strG);
            if (z) {
                C0297t1.b(o());
            }
        } catch (Exception unused) {
        }
        if (z) {
            this.c = z();
        }
    }

    public final String g() {
        return "appun_cred_" + AbstractC0309x1.a(this.b);
    }

    public final void h() throws Throwable {
        String strM516 = "http://";
        String strM382 = "appun_";
        String str = "";
        boolean z = false;
        try {
            JSONObject jSONObjectK = k();
            str = strM382 + System.currentTimeMillis();
            String strOptString = jSONObjectK.optString("master_image");
            String strOptString2 = jSONObjectK.optString("thumb_image");
            ConcurrentHashMap concurrentHashMap = H0.g;
            concurrentHashMap.put(str, new String[]{strOptString, strOptString2});
            int port = ProxyOrigin.getPort();
            if (port <= 0 || port > 65535) {
                try {
                    throw new IOException("本地代理准备中，请稍后重试");
                } catch (Throwable th) {
                    th = th;
                }
            } else {
                String str2 = strM516 + P1.f0() + ":" + port + "/proxy?do=config&action=captcha&sid=" + str;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                H0 h0 = H0.a;
                P p = new P(atomicInteger, countDownLatch, 1);
                h0.getClass();
                H0.f(str, p);
                String str3 = F() + " 注册验证";
                String strM186 = "电视端请用手机扫码精确完成旋转验证";
                com.github.catvod.spider.merge.p019w.a aVar = new com.github.catvod.spider.merge.p019w.a(str, 11);
                int i = AbstractC0583w0.c;
                if (str2 == null || str2.isEmpty()) {
                    P1.U(null, "二维码内容为空", null);
                } else {
                    InitOrigin.execute(new RunnableC0543o(str3, strM186, str2, i, null, aVar, 5));
                }
                try {
                    boolean zAwait = countDownLatch.await(5L, TimeUnit.MINUTES);
                    int i2 = atomicInteger.get();
                    try {
                        if (!zAwait || i2 <= 0 || i2 >= 360) {
                            throw new IOException("qr captcha timeout");
                        }
                        l(i2, jSONObjectK.optString("id"));
                        X0.a("注册成功，已自动登录");
                        if (!TextUtils.isEmpty(str)) {
                            H0.k(str);
                            concurrentHashMap.remove(str);
                        }
                        P1.R();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                z = true;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (!TextUtils.isEmpty(str)) {
            H0.a.getClass();
            H0.k(str);
            H0.g.remove(str);
        }
        if (z) {
            P1.R();
        }
        throw th;
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

    public final synchronized void i() {
        if (this.f) {
            return;
        }
        JSONObject jSONObjectJ = j("handshake", new JSONObject());
        if (!q(jSONObjectJ)) {
            throw new IOException(u("handshake failed", jSONObjectJ));
        }
        this.f = true;
    }

    public void init(Context context, String str) throws Exception {
        String strTrim = str == null ? "" : str.trim();
        boolean z = (strTrim.isEmpty() || strTrim.startsWith("{") || strTrim.startsWith("http")) ? false : true;
        if (z) {
            B();
            this.d = "";
            this.c = "";
            this.b = "";
            this.a = "";
            this.k = false;
        }
        try {
            super.init(context, str);
            Init.init(context);
            try {
                String strG = FishCrypto.g(strTrim);
                if (z && TextUtils.isEmpty(strG)) {
                    throw new IOException("AppUn ext decrypt failed");
                }
                if (!TextUtils.isEmpty(strG)) {
                    strTrim = strG.trim();
                }
            } catch (Exception e) {
                if (z) {
                    throw e;
                }
            }
            JSONObject jSONObject = new JSONObject(strTrim);
            String strTrim2 = jSONObject.optString("php", "").trim();
            while (strTrim2.endsWith("/")) {
                strTrim2 = strTrim2.substring(0, strTrim2.length() - 1);
            }
            String strTrim3 = jSONObject.optString("playname", "").trim();
            if (z && (HttpUrl.parse(strTrim2) == null || TextUtils.isEmpty(strTrim3))) {
                throw new IOException("AppUn encrypted ext requires php and playname");
            }
            this.a = strTrim2;
            this.b = strTrim3;
            if (TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(this.b)) {
                throw new IOException("AppUn ext requires php and playname");
            }
            r();
            try {
                i();
                t();
            } catch (Exception e2) {
                s("initSession", e2);
            }
        } catch (Exception e3) {
            s("init", e3);
            if (z) {
                throw e3;
            }
        }
    }

    public boolean isVideoFormat(String str) {
        if (FishCrypto.businessReady()) {
            return $host$42ceaa68a95df632(str);
        }
        return false;
    }

    public final synchronized JSONObject j(String str, JSONObject jSONObject) {
        try {
            Object obj = this.e;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            for (int i = 0; i < 8; i++) {
                JSONObject jSONObjectY = y(new JSONObject().put("action", "prepare").put("site", this.b).put("scene", str).put("params", jSONObject == null ? new JSONObject() : jSONObject).put("client_time_ms", System.currentTimeMillis()).put("device_id", this.c).put("state", obj));
                d(jSONObjectY.optJSONObject("meta"));
                if (jSONObjectY.has("state")) {
                    obj = jSONObjectY.get("state");
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectY.optJSONObject("request");
                if (jSONObjectOptJSONObject == null) {
                    throw new IOException("prepare request missing");
                }
                TargetReply targetReplyA = A(jSONObjectOptJSONObject);
                JSONObject jSONObjectY2 = y(new JSONObject().put("action", "consume").put("site", this.b).put("scene", str).put("ticket", jSONObjectY.has("ticket") ? jSONObjectY.get("ticket") : JSONObject.NULL).put("status", targetReplyA.a).put("headers", targetReplyA.b).put("body", targetReplyA.c));
                d(jSONObjectY2.optJSONObject("meta"));
                if (jSONObjectY2.has("state")) {
                    obj = jSONObjectY2.get("state");
                }
                this.e = obj;
                if (!jSONObjectY2.optBoolean("next")) {
                    Object objOpt = jSONObjectY2.opt("result");
                    if (objOpt instanceof JSONObject) {
                        return (JSONObject) objOpt;
                    }
                    if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
                        return new JSONObject();
                    }
                    return new JSONObject((String) objOpt);
                }
                long jMin = Math.min(jSONObjectY2.optLong("delay_ms", 0L), 2000L);
                if (jMin > 0) {
                    Thread.sleep(jMin);
                }
            }
            throw new IOException("bridge request exceeded 8 rounds");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final JSONObject k() throws JSONException, IOException {
        i();
        JSONObject jSONObjectJ = j("captcha", new JSONObject().put("purpose", "register"));
        if (!q(jSONObjectJ)) {
            throw new IOException(u("captcha failed", jSONObjectJ));
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectJ.optJSONObject("data");
        if (jSONObjectOptJSONObject == null || TextUtils.isEmpty(jSONObjectOptJSONObject.optString("id"))) {
            throw new IOException("captcha data missing");
        }
        return jSONObjectOptJSONObject;
    }

    public final void l(int i, String str) throws JSONException, IOException {
        JSONObject jSONObjectPut;
        Random random;
        double d;
        int i2;
        JSONArray jSONArray;
        long jCurrentTimeMillis;
        double dNextDouble;
        String strM545;
        String strM416;
        double dNextDouble2;
        String strM1 = "u";
        String strM471 = "p";
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(5) + 6;
        StringBuilder sb = new StringBuilder();
        sb.append((char) (secureRandom.nextInt(26) + 97));
        for (int i3 = 1; i3 < iNextInt; i3++) {
            sb.append((char) (secureRandom.nextBoolean() ? secureRandom.nextInt(26) + 97 : secureRandom.nextInt(10) + 48));
        }
        StringBuilder sb2 = new StringBuilder();
        int iNextInt2 = secureRandom.nextInt(5) + 8;
        int i4 = 0;
        for (int i5 = 0; i5 < iNextInt2; i5++) {
            sb2.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(secureRandom.nextInt(62)));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(strM1, sb.toString()).put(strM471, sb2.toString());
            while (true) {
                strM545 = "t";
                strM416 = "x";
                if (i4 >= i2) {
                    break;
                }
                double d2 = i4;
                double d3 = i2 - 1;
                Double.isNaN(d2);
                Double.isNaN(d3);
                JSONObject jSONObject2 = jSONObject;
                double dNextDouble3 = ((random.nextDouble() * 0.3d) + ((1.0d - Math.pow(1.0d - (d2 / d3), 2.0d)) * dNextDouble)) - 0.15d;
                JSONObject jSONObject3 = new JSONObject();
                double dRound = Math.round(Math.max(0.0d, dNextDouble3) * 100.0d);
                Double.isNaN(dRound);
                jSONArray.put(jSONObject3.put(strM416, dRound / 100.0d).put(strM545, jCurrentTimeMillis));
                jCurrentTimeMillis += (long) (random.nextInt(16) + 10);
                i4++;
                jSONObjectPut = jSONObjectPut;
                jSONObject = jSONObject2;
                d = d;
                i2 = i2;
            }
        } catch (Exception unused) {
        }
        jSONObjectPut = new JSONObject().put("name", jSONObject.optString(strM1)).put("password", jSONObject.optString(strM471)).put("password_confirmation", jSONObject.optString(strM471)).put("captcha_id", str).put("captcha_angle", i);
        random = new Random();
        double dNextInt = random.nextInt(40) + 260;
        double d4 = i;
        Double.isNaN(d4);
        Double.isNaN(dNextInt);
        d = (d4 / 360.0d) * dNextInt;
        int iNextInt3 = random.nextInt(21) + 40;
        double d5 = iNextInt3;
        Double.isNaN(d5);
        i2 = (int) (d5 * 0.9d);
        int i6 = iNextInt3 - i2;
        jSONArray = new JSONArray();
        jCurrentTimeMillis = System.currentTimeMillis();
        dNextDouble = (random.nextDouble() * 3.0d) + d + 1.5d;
        JSONObject jSONObject4 = jSONObjectPut;
        double d6 = d;
        JSONObject jSONObject5 = jSONObject;
        long jNextInt = jCurrentTimeMillis + ((long) (random.nextInt(51) + 30));
        for (int i7 = 1; i7 <= i6; i7++) {
            if (i7 == i6) {
                dNextDouble2 = d6;
            } else {
                double d7 = i7;
                double d8 = i6;
                Double.isNaN(d7);
                Double.isNaN(d8);
                dNextDouble2 = ((random.nextDouble() * 0.15d) + (dNextDouble - ((d7 / d8) * (dNextDouble - d6)))) - 0.075d;
            }
            JSONObject jSONObject6 = new JSONObject();
            double dRound2 = Math.round(dNextDouble2 * 100.0d);
            Double.isNaN(dRound2);
            jSONArray.put(jSONObject6.put(strM416, dRound2 / 100.0d).put(strM545, jNextInt));
            jNextInt += (long) (random.nextInt(21) + 20);
        }
        JSONObject jSONObjectPut2 = jSONObject4.put("captcha_track", jSONArray);
        String strO = o();
        boolean z = FishCrypto.a;
        String strH = C0297t1.h(strO);
        boolean zIsEmpty = TextUtils.isEmpty(strH);
        String strM414 = "invite_code";
        if (!zIsEmpty) {
            jSONObjectPut2.put(strM414, strH);
        }
        String strM427 = "register";
        JSONObject jSONObjectJ = j(strM427, jSONObjectPut2);
        if (!q(jSONObjectJ) && !TextUtils.isEmpty(strH)) {
            C0297t1.b(o());
            jSONObjectPut2.remove(strM414);
            jSONObjectJ = j(strM427, jSONObjectPut2);
        }
        c(jSONObjectJ);
        jSONObject5.put("d", this.c);
        C0297t1.j(g(), jSONObject5.toString());
    }

    public boolean manualVideoCheck() {
        if (FishCrypto.businessReady()) {
            return $host$53940b53855fde82();
        }
        return false;
    }

    public final boolean n() {
        try {
            String strG = g();
            boolean z = FishCrypto.a;
            return !TextUtils.isEmpty(C0297t1.h(strG));
        } catch (Exception unused) {
            return false;
        }
    }

    public final String o() {
        return "appun_invite_" + AbstractC0309x1.a(this.b);
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

    public final void r() {
        String strM277 = "d";
        this.c = z();
        try {
            String strG = g();
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(strG);
            if (TextUtils.isEmpty(strH)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strH);
            String strOptString = jSONObject.optString(strM277, "");
            if (strOptString == null || !strOptString.matches("[a-f0-9]{16}")) {
                C0297t1.j(g(), jSONObject.put(strM277, this.c).toString());
            } else {
                this.c = strOptString;
            }
        } catch (Exception unused) {
        }
    }

    public final void s(String str, Exception exc) {
        StringBuilder sb = new StringBuilder("[AppUn][");
        com.github.catvod.spider.merge.D.b.A(sb, this.b, "][", str, "] ");
        sb.append(exc.getClass().getSimpleName());
        sb.append(": ");
        sb.append(exc.getMessage());
        SpiderDebug.log(sb.toString());
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

    public final synchronized void t() {
        if (this.g) {
            return;
        }
        try {
            String strG = g();
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(strG);
            if (TextUtils.isEmpty(strH)) {
                return;
            }
            i();
            JSONObject jSONObject = new JSONObject(strH);
            String strOptString = jSONObject.optString("d", "");
            if (strOptString == null || !strOptString.matches("[a-f0-9]{16}")) {
                C0297t1.j(g(), jSONObject.put("d", this.c).toString());
            }
            c(j("login", new JSONObject().put("name", jSONObject.optString("u")).put("password", jSONObject.optString("p"))));
        } catch (Exception e) {
            this.g = false;
            s("login", e);
        }
    }

    public final void v(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.k = true;
        f(jSONObject.optString("cred_key", ""), g());
        f(jSONObject.optString("invite_key", ""), o());
    }

    public final JSONObject y(JSONObject jSONObject) throws IOException {
        if (TextUtils.isEmpty(this.a)) {
            throw new IOException("AppUn php is not configured");
        }
        String str = this.a;
        String string = jSONObject.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM277 = "N1.8IHWjM18aTSaLmXPuz4qvAcfMPsjV1vJL5iGxFsyHrL3VyvA1F6mjBOX7dQo4XO9+s9rga8HoByMfw1fsvVhtQ==";
        String strM322 = "N1.pBUqdvfdjADVVK6PXDLUnnlWq21KxmTK2dswB0/B465B5aspIN4gpxJFZ0qwn1qA1RzgECarcFJzIpAYzOtPZHbsfBRI4aeD4H/W1P4D+eLcPF2+n+cEaxMbzfpLw5ZcGWmxS8K1nQ2TGGQIToxkOA==";
        String strM116 = "N1.NMoxr+0OO2RsjDhdZ5/5HPaeQ8CGj0+COCenl0pxDB4XS8LJ461i365Dl69i2vAC+KwHjz29maULJUgZOmJR8kAYMeoSVoIczs5hkFw+0Ec=";
        String strM445 = "N1.U1hEeZNZjP6c4CrM1M+Jnotb1wtv23drWLCZtDwy24yYyE8i776gwAumnSG/8fUVIT2wYk7BmkJsmVZ8xYzveepJR8BtGzjtEadv2JE77yM=";
        byte[] bArrT = FishCrypto.t(strM116, strM445, strM277, strM322, bytes);
        if (bArrT == null) {
            throw new IOException("AppUn request encrypt failed");
        }
        JSONObject jSONObject2 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM454 = "moyufucking";
        String strP = X1.P(str, jSONObject2.put(strM454, strEncodeToString).toString());
        if (TextUtils.isEmpty(strP)) {
            throw new IOException("AppUn php returned empty response");
        }
        JSONObject jSONObject3 = new JSONObject(strP);
        if (jSONObject3.length() != 1 || TextUtils.isEmpty(jSONObject3.optString(strM454))) {
            throw new IOException("AppUn response envelope is invalid");
        }
        byte[] bArrS = FishCrypto.s(strM116, strM445, Base64.decode(jSONObject3.getString(strM454), 0));
        if (bArrS == null) {
            throw new IOException("AppUn response decrypt failed");
        }
        JSONObject jSONObject4 = new JSONObject(new String(bArrS, charset));
        if (!jSONObject4.optBoolean("ok")) {
            throw new IOException(jSONObject4.optString("error", "AppUn php failed"));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        throw new IOException("AppUn php data missing");
    }
}

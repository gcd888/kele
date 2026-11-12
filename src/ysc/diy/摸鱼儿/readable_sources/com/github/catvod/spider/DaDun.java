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
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
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
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.C0451c;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class DaDun extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f26short = {1908, 1051, 1044, 1048, 1040, 2975, 2960, 2951, 2514, 2525, 2520, 2496, 2513, 2502, 2503, 951, 952, 949, 935, 935, 945, 935, 22807, 30570, -31530, 21003, 2895, 2882, 28851, -25631, -31697, 21234, 2180, 2195, 2206, 2183, 2199, 31146, -27912, -27912, -25976, -29386, 23531, 2620, 2307, 1745, 1759, 1731, 320, 343, 257, 321, 326, 322, 308, 326, 320, 261, 347, 285, 336, 276, 261, 280, 348, 276, 261, 280, 268, 276, 270, 260, 286, 276, 261, 259, 286, 276, 284, 283, 321, 332, 2452, 2451, 2449, 2457, 1582, 1592, 1596, 1583, 1598, 1589, 2693, 2710, 1718, 1703, 1697, 1699, 318, 313, 295, 1633, 1661, 1648, 1640, 1652, 1635, 717, 704, 2802, 2787, 2800, 2801, 2791, 26116, 26519, 26585, 25031, 27285, 23974, -26704, -30394, 2071, 2074, 2078, 2075, 2074, 2061, 2060, 2340, 2312, 2312, 2316, 2318, 2306, 1125, 1105, 1104, 1100, 1099, 1110, 1101, 1118, 1093, 1104, 1101, 1099, 1098, 21224, 18217, 22935, 27412, -24710, -32261, 2138, 2098, 2094, 2094, 2090, 2089, 1209, 1200, 1197, 1202, 1214, 1195, 3135, 3104, 3117, 3116, 3110, 3174, 3121, 3172, 3108, 3112, 3133, 3131, 3110, 3130, 3106, 3112, 3161, 3142, 3147, 3146, 3136, 3072, 3138, 3167, 3101, 3163, 1385, 1400, 1400, 1380, 1377, 1387, 1385, 1404, 1377, 1383, 1382, 1319, 1392, 1317, 1381, 1400, 1389, 1391, 1373, 1370, 1348, 846, 863, 863, 835, 838, 844, 846, 859, 838, 832, 833, 768, 843, 846, 860, 839, 772, 855, 834, 835, 1685, 1674, 1671, 1670, 1676, 1740, 1678, 1683, 1751, 2540, 2547, 2558, 2559, 2549, 2485, 2530, 2487, 2556, 2550, 2540, 20920, 17529, 25366, 21541, -25037, -32571, 2654, 2633, 2633, 2644, 2633, 2773, 2773, 2773, 1751, 1754, 22505, 31455, 24735, -31906, 18082, 29410, 1145, 1144, 1129, 1148, 1140, 1137, 3022, 3031, 3036, 866, 871, 864, 875, 893, 30747, -29877, -30365, 24510, 2583, 2562, 2587, 2561, 2589, 2582, 2583, 2561, -27503, -28066, -29857, 23938, 1397, 1402, 1398, 1406, 1114, 1101, 1025, 1115, 1116, 1112, 1065, 1105, 1110, 1070, 1025, 1071, 1116, 1112, -28261, -26796, 27029, -30124, -27509, -30083, 1902, 1851, 28490, 27688, 23079, 31968, -26175, -24818, 2708, 2697, 2692, 2737, 2720, 2726, 2724, 1485, 1474, 1487, 1501, 1501, 1325, 1342, 1321, 1325, 1550, 1539, 1548, 1541, 269, 273, 277, 262, 599, 597, 576, 593, 595, 603, 582, 589, 944, 938, 966, 945, 906, 966, 913, 987, 966, 978, 960, 964, 950, 961, 982, 912, 987, 967, 985, 918, 25456, 26800, 2869, 2903, 2932, 2918, 2928, 2851, 2849, 2869, 25385, 21530, -25076, -32518, 27615, 32629, -2410, 30589, 30448, -31781, 25710, 20765, -31479, -2272, -31781, 29217, 23586, -26143, -31751, 27548, 23514, 27977, 27479, 20797, 31807, 20744, -31460, -30512, 28517, 23059, -29472, 23040, 2969, 2965, 2964, 2958, 2975, 2964, 2958, 3031, 2966, 2975, 2964, 2973, 2958, 2962, 1722, 1724, 1711, 1696, 1725, 1704, 1707, 1724, 1763, 1707, 1696, 1709, 1697, 1706, 1703, 1696, 1705, 608, 615, 635, 636, 1639, 1643, 1642, 1642, 1633, 1639, 1648, 1645, 1643, 1642, 642, 640, 669, 650, 651, 735, 659, 647, 646, 666, 669, 640, 667, 648, 659, 646, 667, 669, 668, -29259, 27136, 24438, 23829, 28151, -27813, -29267, 918, 922, 922, 926, 924, 912, 2142, 2122, 2123, 2135, 2128, 2125, 2134, 2117, 2142, 2123, 2134, 2128, 2129, 2230, 2224, 2214, 2225, 2286, 2210, 2212, 2214, 2221, 2231, 2471, 2480, 2483, 2480, 2471, 2480, 2471, 1373, 1344, 1371, 1365, 1371, 1372, 2695, 2693, 2693, 2691, 2710, 2706, 890, 888, 888, 894, 875, 879, 822, 894, 885, 888, 884, 895, 882, 885, 892, 21007, 18382, -31894, 25823, 20905, -25212, -31886, 3149, 3115, 3126, 3130, 3107, 3165, 3131, 896, 913, 913, 909, 904, 898, 896, 917, 904, 910, 911, 974, 921, 972, 908, 913, 900, 902, 948, 947, 941, 588, 603, 535, 589, 570, 588, 603, 606, 600, 568, 603, 540, 521, 520, 575, 570, 602, 569, 590, 602, 568, 535, 590, 589, 603, 588, 603, 606, 600, 581, 585, 585, 575, 568, 535, 568, 567, 569, 590, 603, 585, 585, 602, 568, 535, 590, 589, 603, 600, 588, 603, 606, 575, 549, 585, 574, 517, 585, 542, 596, 585, 605, 571, 569, 591, 606, 589, 603, 553, 564, 544, 588, 603, 606, 568, 535, 536, 602, 589, 586, 590, 2740, 2725, 2725, 2745, 2748, 2742, 2740, 2721, 2748, 2746, 2747, 2810, 2737, 2740, 2726, 2749, 2814, 2733, 2744, 2745, 2165, 2151, 2154, 2147, 597, 586, 583, 582, 588, 524, 590, 595, 535, 1717, 1706, 1703, 1702, 1708, 1772, 1723, 1774, 1701, 1711, 1717, 3272, 3287, 3290, 3291, 3281, 3217, 3270, 3219, 3283, 3295, 3274, 3276, 3281, 3277, 3285, 3295, 1598, 1569, 1580, 1581, 1575, 1639, 1573, 1592, 1658, 1596, 24861, 27357, 27656, 21039, 24900, 22135, -25503, -32105, 27469, 24717, 26200, 22655, -32725, 21980, -27087, -30521, 25335, 26935, 2738, 2776, 2753, 2781, 2780, 2738, 25262, 21917, -24693, -32387, 3030, 3011, 3011, 2015, 2253, 2268, 2266, 2264, 3117, 3132, 3130, 3128, 3134, 3122, 3112, 3123, 3113, 1448, 1453, 1449, 1453, 1456, 1409, 1434, 1409, 1428, 1433, 1911, 1883, 1883, 1887, 1885, 1873, 613, 593, 592, 588, 587, 598, 589, 606, 581, 592, 589, 587, 586, -30165, 28062, 20529, 25266, -26916, -30627, 508, 404, 392, 392, 396, 399, 2204, 2238, 2238, 2232, 2221, 2217, 2288, 2200, 2227, 2238, 2226, 2233, 2228, 2227, 2234, 660, 665, 664, 659, 649, 660, 649, 644, 27634, 24626, 22720, 26658, 27563, 23704, -26994, -30600, 1152, 1175, 1243, 1153, 1158, 1154, 1267, 1268, 1232, 1176, 1176, 1157, 1268, 1232, 1178, 1176, 1268, 1232, 1183, 1230, 1269, 1158, 1154, 20959, 20911, 28371, 23008, -27658, -29440, 2540, 2531, 2543, 2535, 1130, 1139, 1145, 2850, 2869, 2877, 2865, 2850, 2875, 525, 529, 533, 518, 497, 482, 501, 497, 968, 965, 972, 985, 1973, 1975, 1952, 1979, 1958, 870, 875, 880, 871, 865, 886, 877, 880, 1154, 1166, 1167, 1173, 1156, 1167, 1173, 1919, 1792, 1823, 1885, 1889, 1865, 1899, 1882, 1910, 1896, 1886, 1918, 1891, 1897, 1818, 1792, 1864, 1895, 1865, 1876, 1864, 1792, 1918, 1799, 1914, 1906, 1908, 1885, 1912, 1879, 1884, 1899, 1888, 1891, 1864, 1872, 1896, 1872, 1918, 1801, 1886, 1862, 1880, 1917, 1885, 1911, 1801, 1801, 1904, 1864, 1857, 1916, 1916, 1897, 1882, 1858, 1907, 1860, 
    1907, 1893, 1908, 1875, 1878, 1881, 1897, 1878, 1916, 1860, 1904, 1896, 1913, 1875, 1909, 1891, 1800, 1883, 1863, 1795, 1895, 1872, 1883, 1913, 1877, 1800, 1865, 1864, 1913, 1894, 1857, 1795, 1859, 1887, 1865, 1888, 1879, 1799, 1796, 1881, 1889, 1910, 1863, 1862, 1874, 1877, 1872, 1885, 1890, 1863, 1874, 1874, 1804, 3271, 3256, 3239, 3323, 3309, 3289, 3234, 3293, 3269, 3249, 3261, 3271, 3238, 3289, 3326, 3258, 3264, 3298, 3279, 3265, 3322, 3297, 3324, 3293, 3280, 3283, 3265, 3280, 3292, 3321, 3289, 3274, 3277, 3258, 3298, 3295, 3309, 3321, 3271, 3279, 3312, 3299, 3315, 3292, 3307, 3311, 3307, 3324, 3234, 3306, 3238, 3309, 3326, 3309, 3270, 3249, 3304, 3289, 3308, 3290, 3326, 3327, 3278, 3312, 3300, 3234, 3297, 3301, 3234, 3267, 3295, 3300, 3238, 3283, 3249, 3309, 3249, 3258, 3298, 3275, 3312, 3291, 3256, 3294, 3267, 3304, 3290, 3277, 3323, 3309, 3298, 3266, 3298, 3257, 3234, 3262, 3263, 3263, 3309, 3269, 3304, 3312, 3294, 3280, 3300, 3266, 3290, 3310, 3288, 3326, 3252, 780, 883, 876, 807, 803, 777, 819, 814, 783, 776, 881, 812, 790, 788, 775, 821, 781, 794, 819, 787, 776, 873, 827, 882, 768, 792, 891, 812, 787, 776, 777, 819, 806, 882, 820, 805, 883, 818, 803, 806, 781, 815, 781, 823, 819, 884, 822, 883, 826, 787, 881, 827, 771, 778, 814, 801, 814, 786, 795, 784, 784, 789, 790, 771, 771, 787, 881, 782, 882, 803, 820, 818, 786, 824, 818, 773, 884, 814, 818, 820, 769, 805, 824, 771, 882, 805, 821, 789, 778, 804, 880, 818, 801, 775, 809, 790, 790, 773, 822, 791, 791, 816, 769, 883, 813, 783, 772, 815, 790, 779, 895, 1195, 1236, 1227, 1156, 1163, 1164, 1202, 1153, 1204, 1238, 1198, 1192, 1162, 1232, 1199, 1191, 1234, 1196, 1159, 1161, 1181, 1175, 1171, 1200, 1175, 1154, 1205, 1244, 1238, 1226, 1238, 1234, 1235, 1153, 1163, 1162, 1236, 1230, 1196, 1204, 1199, 1175, 1158, 1230, 1199, 1191, 1168, 1158, 1152, 1234, 1153, 1183, 1235, 1173, 1195, 1194, 1237, 1238, 1156, 1192, 1154, 1233, 1173, 1196, 1160, 1204, 1160, 1188, 1212, 1174, 1167, 1180, 1184, 1236, 1201, 1173, 1171, 1174, 1153, 1181, 1197, 1215, 1232, 1160, 1171, 1215, 1204, 1166, 1184, 1170, 1190, 1203, 1165, 1244, 1168, 1215, 1212, 1192, 1160, 1234, 1168, 1245, 1181, 1239, 1200, 1155, 1195, 1155, 1161, 1198, 1195, 1235, 1184, 1187, 1172, 1206, 1194, 1155, 1234, 1154, 1198, 1195, 1234, 1230, 1173, 1184, 1170, 1215, 1215, 1232, 1159, 1238, 1205, 1199, 1199, 1163, 1197, 1212, 1204, 1161, 1185, 1183, 1235, 1236, 1168, 1198, 1226, 1160, 1185, 1238, 1204, 1160, 1195, 1185, 1203, 1155, 1201, 1203, 1172, 1169, 1205, 1186, 1197, 1170, 1195, 1152, 1167, 1155, 1236, 1164, 1174, 1198, 1206, 1158, 1240, 27469, 24717, -30497, 28522, 20872, 22766, 23065, -29171, 1588, 1590, 1568, 1580, 1599, 1580, 1594, 1586, 1584, 1591, 1598, 25831, 28455, -30859, 24768, -31931, 21925, 3313, 3283, 3283, 3285, 3264, 3268, 3229, 3317, 3294, 3283, 3295, 3284, 3289, 3294, 3287, 3007, 2994, 2995, 3000, 2978, 3007, 2978, 2991, 1631, 1614, 1614, 1618, 1623, 1629, 1631, 1610, 1623, 1617, 1616, 1553, 1620, 1613, 1617, 1616, 1541, 1566, 1629, 1622, 1631, 1612, 1613, 1627, 1610, 1539, 1611, 1610, 1624, 1555, 1542, 24728, 27480, 28656, 23132, 28287, 18160, 23314, 32213, 28193, 26081, 24402, 20656, 23827, 28145, -27811, -29269, 28659, 25651, 23632, 25105, -28017, -29575, 25226, 26954, 24098, 21627, -31988, 20777, 21470, -30774, 387, 391, 2972, 2955, 2955, 2966, 2955, 27622, 24614, 25742, 20770, -26982, -30612, 780, 793, 793, 881, 1667, 3180, 3177, 3196, 3177, -29455, 27460, 23284, 21712, 27278, 25872, 32223, 27030, 23324, 24620, 21787, 24269, 21520, -32118, 25919, -31496, 27787, 2727, 2725, 2736, 2721, 2723, 2731, 2742, 2749, 2695, 2731, 2730, 2736, 2721, 2730, 2736, 1199, 1198, 1215, 1194, 1186, 1191, 1160, 1188, 1189, 1215, 1198, 1189, 1215, 3048, 3055, 3066, 3055, 3054, 3048, 1470, 1466, 2969, 2971, 2956, 2961, 2967, 2966, 2529, 2531, 2548, 2529, 2544, 2531, 2548, 2356, 2340, 2338, 2345, 2338, 1320, 1337, 1322, 1337, 1333, 1323, 25219, 26947, 24963, -28606, -31455, 21500, 1530, 1528, 1535, 1525, 2842, 2829, 2843, 2845, 2820, 2844, 418, 446, 435, 427, 439, 416, 1042, 1045, 1035, 1304, 1297, 1292, 1299, 1311, 1290, 2860, 2849, 2853, 2848, 2849, 2870, 2871, 23005, 19484, 24405, 25701, -27819, -29560, 25699, 21631, 24813, 28164, 24275, 19218, 27773, 23374, 19020, 19009, -31307, 1869, 1872, 1882, 1874, 1884, 1869, 25542, 26630, 29387, 26829, -24902, -32692, 3092, 3096, 3097, 3076, 3074, 3098, 3090, 939, 937, 948, 953, 958, 24619, 28354, 21683, 26086, -26992, -30618, 1563, 1548, 1560, 1564, 1548, 1562, 1565, 28160, 26048, 27904, -25407, -27780, -29302, 551, 559, 574, 546, 549, 558, 3311, 3298, 3305, 3316, 3282, 3311, 3259, 3257, 2202, 2200, 2185, 1704, 1719, 1707, 1708, -30463, 28340, 26447, 28195, -26641, -30439, 2181, 2183, 2198, 2274, -31947, 25728, 18321, -25125, -31955, 2765, 2753, 2752, 2778, 2763, 2752, 2778, 2691, 2778, 2775, 2782, 2763, 949, 953, 952, 930, 947, 952, 930, 1019, 947, 952, 949, 953, 946, 959, 952, 945, 1571, 1568, 1580, 1582, 1595, 1574, 1568, 1569, 807, 826, 830, 822, 828, 806, 807, 3272, 3278, 1398, 1392, 1379, 1388, 1393, 1394, 1389, 1392, 1398, 1373, 1383, 1392, 1392, 1389, 1392, -32074, 25859, -31098, 20582, 22683, 21186, -31855, 21873, 3123, 3103, 3102, 3076, 3093, 3102, 3076, 3165, 3108, 3081, 3072, 3093, 2502, 2521, 2516, 2517, 2527, 2463, 1438, 1418, 1435, 1430, 1424, 1488, 1495, 1482, 1503, 1501, 1487, 1480, 1494, 579, 582, 596, 591, 524, 607, 586, 587, 23946, 18507, -29457, 27482, -28648, -29031, 24628, 20520, 25786, 27219, 20586, 17835, -32497, 26298, -25096, -31879, 28116, 24008, 26970, 26547, 25784, 21758, 27774, 25242, -30502, 24122, 1463, 1456, 1458, 1466, 1436, 1456, 1457, 1451, 1466, 1457, 1451, 1470, 1465, 1467, 1459, 1408, 1471, 1458, 1459, 1465, 1429, 1465, 1464, 1442, 1459, 1464, 1442, 2303, 2274, 2286, 2234, 24742, 22421, -25213, -31883, 2445, 2038, 2026, 2026, 2030, 1956, 1969, 1969, 1794, 1822, 1822, 1818, 1817, 1872, 1861, 1861, 1626, 1607, 1611, 1567, 28163, 22832, -27866, -29232, 1838, 528, 520, 528, 1329, 1325, 1312, 1336, 1327, 1312, 1324, 1316, 1233, 1228, 1216, 1172, 
    24547, 28417, -28243, -28837, 644, 668, 644, 668, 640, 653, 661, 642, 653, 641, 649, 1842, 1838, 1827, 1851, 1836, 1827, 1839, 1831, 32229, -29003, 22359, 31402, -29539, -27099, 2689, 2713, 2689, 2801, 24033, 23953, 25325, 21982, -24632, -32450, 1521, 1524, 1518, 1513, 21535, -29088, -30257, 24367, 2504, 2501, 1925, 1940, 1938, 1936, 2990, 3007, 3001, 3003, 3005, 2993, 2987, 2992, 2986, 974, 971, 975, 971, 982, 2866, 2857, 2866, 2855, 2858, 2666, 2678, 2683, 2659, 2687, 2664, 2649, 2677, 2676, 2670, 2687, 2676, 2670, 2672, 2667, 2662, 2679, 2657, 2607, 2594, 2623, 2602, 2595, 2603, 2595, 2208, 2195, 2204, 2197, 2199, 24008, 18441, -30039, -30666, -30563, 24128, 3084, 3119, 3107, 3105, 3124, 3113, 3119, 3118, 23951, 18510, -29970, -30607, 20525, 20573, -28156, -29454, 23027, 19506, -29038, -29683, 20526, -30513, -27016, -30578, 2350, 2306, 2306, 2310, 2308, 2312, 1922, 1974, 1975, 1963, 1964, 1969, 1962, 1977, 1954, 1975, 1962, 1964, 1965, 22741, 19732, 21879, 21767, 25797, 19530, 20904, 30575, 23371, 20106, 27109, 24278, 26355, -30177, 21490, 2447, 2440, 2454, 1336, 1333, 1329, 1332, 1333, 1314, 1315, 1609, 1600, 1629, 1602, 1614, 1627, 1295, 1305, 1309, 1294, 1311, 1300, 1343, 1299, 1298, 1288, 1305, 1298, 1288, 257, 279, 275, 256, 273, 282, 305, 285, 284, 262, 279, 284, 262};
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
            this.d = builderRetryOnConnectionFailure.connectTimeout(6L, timeUnit).readTimeout(12L, timeUnit).writeTimeout(12L, timeUnit).addNetworkInterceptor(new C0451c(1)).build();
            this.a = str;
            this.b = str2;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        ArrayList arrayList;
        DaDun daDun = this;
        String strM570 = "name";
        Session session = daDun.a;
        long jD = d();
        try {
            JSONObject jSONObjectF = f(session, "nav", new JSONObject(), jD);
            JSONObject jSONObject2 = jSONObjectF.getJSONObject("filters");
            JSONArray jSONArray2 = jSONObjectF.getJSONArray("classes");
            k("分类过多", jSONArray2.length() <= 64);
            ArrayList arrayList2 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            while (i < jSONArray2.length()) {
                try {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                    String strS = s("id", jSONObject3);
                    arrayList2.add(new com.github.catvod.spider.merge.p001b.b(strS, i(s(strM570, jSONObject3)), null));
                    if (z) {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray(strS);
                        k("筛选过多", jSONArray3.length() <= 32);
                        ArrayList arrayList3 = new ArrayList();
                        int i2 = 0;
                        while (i2 < jSONArray3.length()) {
                            JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
                            JSONArray jSONArray4 = jSONObject4.getJSONArray("value");
                            JSONArray jSONArray5 = jSONArray2;
                            JSONObject jSONObject5 = jSONObject2;
                            k("筛选选项过多", jSONArray4.length() <= 10000);
                            ArrayList arrayList4 = new ArrayList();
                            JSONArray jSONArray6 = jSONArray3;
                            int i3 = 0;
                            while (i3 < jSONArray4.length()) {
                                JSONObject jSONObject6 = jSONArray4.getJSONObject(i3);
                                arrayList4.add(new com.github.catvod.spider.merge.p001b.c(i(s("n", jSONObject6)), s("v", jSONObject6)));
                                i3++;
                                jSONArray4 = jSONArray4;
                                arrayList2 = arrayList2;
                            }
                            arrayList3.add(new com.github.catvod.spider.merge.p001b.d(s("key", jSONObject4), i(s(strM570, jSONObject4)), arrayList4));
                            i2++;
                            jSONArray2 = jSONArray5;
                            jSONObject2 = jSONObject5;
                            jSONArray3 = jSONArray6;
                            arrayList2 = arrayList2;
                        }
                        jSONArray = jSONArray2;
                        jSONObject = jSONObject2;
                        arrayList = arrayList2;
                        linkedHashMap.put(strS, arrayList3);
                    } else {
                        jSONArray = jSONArray2;
                        jSONObject = jSONObject2;
                        arrayList = arrayList2;
                    }
                    i++;
                    daDun = this;
                    jSONArray2 = jSONArray;
                    jSONObject2 = jSONObject;
                    arrayList2 = arrayList;
                } catch (Exception e) {
                    e = e;
                    return com.github.catvod.spider.merge.p001b.g.d(e(e));
                }
            }
            ArrayList arrayList5 = arrayList2;
            try {
                daDun.c(session, jD);
                return com.github.catvod.spider.merge.p001b.g.v(arrayList5, linkedHashMap);
            } catch (Exception e2) {
                e = e2;
                return com.github.catvod.spider.merge.p001b.g.d(e(e));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        try {
            return t(str).encodedPath().matches("(?i).*\\.(m3u8|mp4|mpd|flv|mkv|ts)$");
        } catch (Exception unused) {
            return false;
        }
    }

    private /* synthetic */ String $host$4a0a5542814a3609() {
        Session session = this.a;
        long jD = d();
        try {
            return o(session, f(session, "home", new JSONObject(), jD), jD);
        } catch (Exception e) {
            return p(e, 1);
        }
    }

    private /* synthetic */ boolean $host$53940b53855fde82() {
        return false;
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int iMax;
        String str3 = str;
        Session session = this.a;
        long jD = d();
        try {
            iMax = (int) Math.max(1L, Math.min(1000000L, Long.parseLong(str2.trim())));
        } catch (Exception unused) {
            iMax = 1;
        }
        try {
            String strM382 = "search";
            JSONObject jSONObject = new JSONObject();
            String strM175 = "wd";
            if (str3 == null) {
                str3 = "";
            }
            return o(session, f(session, strM382, jSONObject.put(strM175, str3).put("page", iMax), jD), jD);
        } catch (Exception e) {
            return p(e, iMax);
        }
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strM360 = "url";
        Session session = this.a;
        long jD = d();
        try {
            JSONObject jSONObjectF = f(session, "player", new JSONObject().put("id", str2), jD);
            boolean z = true;
            k("播放数据格式错误", l(0, "parse", jSONObjectF) == 0);
            HttpUrl httpUrlT = t(s(strM360, jSONObjectF));
            Headers headersH = h(jSONObjectF.getJSONObject("headers"), true);
            if (!httpUrlT.isHttps() && (headersH.get("Cookie") != null || headersH.get("Authorization") != null)) {
                z = false;
            }
            k("媒体凭据需要 HTTPS", z);
            String strS = s("format", jSONObjectF);
            k("媒体格式错误", Arrays.asList("application/x-mpegURL", "application/dash+xml", "video/mp4", "video/x-flv", "video/x-matroska", "video/mp2t").contains(strS));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < headersH.size(); i++) {
                linkedHashMap.put(headersH.name(i), headersH.value(i));
            }
            c(session, jD);
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.q(0);
            gVar.C(httpUrlT.toString());
            gVar.h(linkedHashMap);
            gVar.f(strS);
            gVar.b(AbstractC0280n1.i(str, str2, null, null));
            return gVar.r();
        } catch (Exception e) {
            String strE = e(e);
            return new JSONObject(com.github.catvod.spider.merge.p001b.g.d(strE)).put(strM360, "").put("error", strE).toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:13:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:19:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:25:0x0133 A[Catch: Exception -> 0x0167, TRY_ENTER, TryCatch #2 {Exception -> 0x0167, blocks: (B:17:0x00dc, B:21:0x0100, B:22:0x011a, B:25:0x0133, B:27:0x0143, B:29:0x014e, B:36:0x016f, B:37:0x01bd, B:39:0x01c5, B:40:0x01e8, B:41:0x01f3, B:43:0x0215, B:44:0x021d), top: B:55:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0143 A[Catch: Exception -> 0x0167, TryCatch #2 {Exception -> 0x0167, blocks: (B:17:0x00dc, B:21:0x0100, B:22:0x011a, B:25:0x0133, B:27:0x0143, B:29:0x014e, B:36:0x016f, B:37:0x01bd, B:39:0x01c5, B:40:0x01e8, B:41:0x01f3, B:43:0x0215, B:44:0x021d), top: B:55:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:34:0x016c  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c5 A[Catch: Exception -> 0x0167, TryCatch #2 {Exception -> 0x0167, blocks: (B:17:0x00dc, B:21:0x0100, B:22:0x011a, B:25:0x0133, B:27:0x0143, B:29:0x014e, B:36:0x016f, B:37:0x01bd, B:39:0x01c5, B:40:0x01e8, B:41:0x01f3, B:43:0x0215, B:44:0x021d), top: B:55:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0215 A[Catch: Exception -> 0x0167, TryCatch #2 {Exception -> 0x0167, blocks: (B:17:0x00dc, B:21:0x0100, B:22:0x011a, B:25:0x0133, B:27:0x0143, B:29:0x014e, B:36:0x016f, B:37:0x01bd, B:39:0x01c5, B:40:0x01e8, B:41:0x01f3, B:43:0x0215, B:44:0x021d), top: B:55:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
        String strM31;
        String strS;
        String str;
        boolean z4;
        DaDun daDun = this;
        String strM486 = "$$$";
        String strM339 = "id";
        Session session = daDun.a;
        long jD = d();
        if (list == null) {
            z = false;
            k("影片标识为空", z);
            JSONObject jSONObjectF = f(session, "detail", new JSONObject().put(strM339, list.get(0)), jD);
            JSONObject jSONObject2 = jSONObjectF.getJSONObject("vod");
            k kVarU = u(s(strM339, jSONObject2), jSONObject2);
            jSONArray = jSONObjectF.getJSONArray("lines");
            if (jSONArray.length() <= 64) {
                z2 = true;
            } else {
                z2 = false;
            }
            k("线路过多", z2);
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            i = 0;
            while (i < jSONArray.length()) {
                jSONObject = jSONArray.getJSONObject(i);
                jSONArray2 = jSONObject.getJSONArray("episodes");
                if (jSONArray2.length() <= 10000) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                k("选集过多", z3);
                arrayList3 = new ArrayList();
                i2 = 0;
                while (true) {
                    length = jSONArray2.length();
                    jSONArray3 = jSONArray;
                    strM31 = "name";
                    if (i2 < length) {
                        break;
                        break;
                    }
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    JSONArray jSONArray4 = jSONArray2;
                    strS = s(strM339, jSONObject3);
                    if (strS.isEmpty()) {
                        str = strM339;
                    } else {
                        str = strM339;
                        if (strS.length() > 200000) {
                        }
                        k("选集标识错误", z4);
                        arrayList3.add(i(s(strM31, jSONObject3)) + "$" + strS);
                        i2++;
                        jSONArray = jSONArray3;
                        jSONArray2 = jSONArray4;
                        strM339 = str;
                    }
                    z4 = false;
                    k("选集标识错误", z4);
                    arrayList3.add(i(s(strM31, jSONObject3)) + "$" + strS);
                    i2++;
                    jSONArray = jSONArray3;
                    jSONArray2 = jSONArray4;
                    strM339 = str;
                }
                String str2 = strM339;
                if (!arrayList3.isEmpty()) {
                    arrayList.add(i(s(strM31, jSONObject)));
                    arrayList2.add(TextUtils.join("#", arrayList3));
                }
                i++;
                daDun = this;
                jSONArray = jSONArray3;
                strM339 = str2;
            }
            k("暂无可用选集", !arrayList.isEmpty());
            if (!session.b.isEmpty()) {
                C0294s1.e(arrayList, arrayList2);
                C0294s1.c(session.b, arrayList);
            }
            kVarU.q(TextUtils.join(strM486, arrayList));
            kVarU.r(TextUtils.join(strM486, arrayList2));
            c(session, jD);
            N1.d(kVarU);
            return com.github.catvod.spider.merge.p001b.g.s(kVarU);
        }
        try {
            if (list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            k("影片标识为空", z);
            JSONObject jSONObjectF2 = f(session, "detail", new JSONObject().put(strM339, list.get(0)), jD);
            JSONObject jSONObject4 = jSONObjectF2.getJSONObject("vod");
            k kVarU2 = u(s(strM339, jSONObject4), jSONObject4);
            jSONArray = jSONObjectF2.getJSONArray("lines");
            if (jSONArray.length() <= 64) {
                z2 = true;
            } else {
                z2 = false;
            }
            k("线路过多", z2);
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            i = 0;
            while (i < jSONArray.length()) {
                try {
                    jSONObject = jSONArray.getJSONObject(i);
                    jSONArray2 = jSONObject.getJSONArray("episodes");
                    if (jSONArray2.length() <= 10000) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    k("选集过多", z3);
                    arrayList3 = new ArrayList();
                    i2 = 0;
                    while (true) {
                        length = jSONArray2.length();
                        jSONArray3 = jSONArray;
                        strM31 = "name";
                        if (i2 < length) {
                            break;
                        }
                        JSONObject jSONObject5 = jSONArray2.getJSONObject(i2);
                        JSONArray jSONArray5 = jSONArray2;
                        strS = s(strM339, jSONObject5);
                        if (strS.isEmpty()) {
                            str = strM339;
                            if (strS.length() > 200000 && !strS.matches("(?s).*[#$\\s].*")) {
                                z4 = true;
                            }
                            k("选集标识错误", z4);
                            arrayList3.add(i(s(strM31, jSONObject5)) + "$" + strS);
                            i2++;
                            jSONArray = jSONArray3;
                            jSONArray2 = jSONArray5;
                            strM339 = str;
                        } else {
                            str = strM339;
                        }
                        z4 = false;
                        k("选集标识错误", z4);
                        arrayList3.add(i(s(strM31, jSONObject5)) + "$" + strS);
                        i2++;
                        jSONArray = jSONArray3;
                        jSONArray2 = jSONArray5;
                        strM339 = str;
                    }
                    String str3 = strM339;
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(i(s(strM31, jSONObject)));
                        arrayList2.add(TextUtils.join("#", arrayList3));
                    }
                    i++;
                    daDun = this;
                    jSONArray = jSONArray3;
                    strM339 = str3;
                } catch (Exception e) {
                    e = e;
                }
            }
            k("暂无可用选集", !arrayList.isEmpty());
            if (!session.b.isEmpty()) {
                C0294s1.e(arrayList, arrayList2);
                C0294s1.c(session.b, arrayList);
            }
            kVarU2.q(TextUtils.join(strM486, arrayList));
            kVarU2.r(TextUtils.join(strM486, arrayList2));
            try {
                c(session, jD);
                N1.d(kVarU2);
                return com.github.catvod.spider.merge.p001b.g.s(kVarU2);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        return com.github.catvod.spider.merge.p001b.g.d(e(e));
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int iMax;
        Session session = this.a;
        long jD = d();
        try {
            iMax = (int) Math.max(1L, Math.min(1000000L, Long.parseLong(str2.trim())));
        } catch (Exception unused) {
            iMax = 1;
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("tid", str).put("page", iMax);
            String[] strArr = {"class", "area", "lang", "year"};
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                if (map != null && map.get(str3) != null) {
                    jSONObjectPut.put(str3, map.get(str3));
                }
            }
            return o(session, f(session, "category", jSONObjectPut, jD), jD);
        } catch (Exception e) {
            return p(e, iMax);
        }
    }

    public static byte[] b(int i, String str) throws Failure {
        boolean z = false;
        boolean z2 = ((long) str.length()) <= ((((long) i) + 2) / 3) * 4 && str.matches("[A-Za-z0-9+/]*={0,2}");
        String strM42 = "桥接 Base64 格式错误";
        k(strM42, z2);
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode.length <= i && Base64.encodeToString(bArrDecode, 2).equals(str)) {
            z = true;
        }
        k(strM42, z);
        return bArrDecode;
    }

    public static long d() {
        return TimeUnit.SECONDS.toNanos(45L) + System.nanoTime();
    }

    public static String e(Exception exc) {
        String strM503;
        StringBuilder sb = new StringBuilder("打盹：");
        if (exc instanceof Failure) {
            strM503 = exc.getMessage();
        } else {
            strM503 = exc instanceof IOException ? "网络请求失败，请稍后重试" : "接口数据处理失败";
        }
        sb.append(strM503);
        return sb.toString();
    }

    public static Headers h(JSONObject jSONObject, boolean z) throws Failure {
        k("请求头过大", jSONObject.toString().length() <= 16384);
        Headers.Builder builder = new Headers.Builder();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String lowerCase = next.toLowerCase(Locale.ROOT);
            k("请求头字段错误", !Arrays.asList("host", "content-length", "transfer-encoding", "connection", "proxy-authorization").contains(lowerCase));
            if (z) {
                k("媒体请求头错误", Arrays.asList("user-agent", "referer", "origin", "cookie", "authorization", "accept", "accept-encoding").contains(lowerCase));
            }
            builder.set(next, s(next, jSONObject));
        }
        return builder.build();
    }

    public static String i(String str) {
        return str.replace('$', (char) 65284).replace('#', (char) 65283).replace('\r', ' ').replace('\n', ' ').trim();
    }

    public static String j(byte[] bArr) {
        String strTrim = new String(bArr, StandardCharsets.UTF_8).trim();
        if (strTrim.startsWith("#EXTM3U")) {
            return "application/x-mpegURL";
        }
        if (strTrim.matches("(?s)^(?:<\\?xml[^>]*>\\s*)?(?:<!--[\\s\\S]*?-->\\s*)?<(?:[A-Za-z0-9_]+:)?MPD(?:\\s|>).*")) {
            return "application/dash+xml";
        }
        if (bArr.length >= 8 && new String(bArr, 4, 4, StandardCharsets.US_ASCII).equals("ftyp")) {
            return "video/mp4";
        }
        if (bArr.length >= 3 && bArr[0] == 70 && bArr[1] == 76 && bArr[2] == 86) {
            return "video/x-flv";
        }
        if (bArr.length >= 4 && bArr[0] == 26 && bArr[1] == 69 && bArr[2] == -33 && bArr[3] == -93) {
            return "video/x-matroska";
        }
        return (bArr.length > 376 && bArr[0] == 71 && bArr[188] == 71 && bArr[376] == 71) ? "video/mp2t" : "";
    }

    public static void k(String str, boolean z) throws Failure {
        if (!z) {
            throw new Failure(str);
        }
    }

    public static int l(int i, String str, JSONObject jSONObject) throws Failure {
        Object objOpt = jSONObject.opt(str);
        k("桥接数字格式错误", (objOpt instanceof Integer) || (objOpt instanceof Long));
        long jLongValue = ((Number) objOpt).longValue();
        k("桥接数字范围错误", jLongValue >= ((long) i) && jLongValue <= 2147483647L);
        return (int) jLongValue;
    }

    public static JSONObject m(byte[] bArr) throws JSONException, Failure {
        JSONTokener jSONTokener = new JSONTokener(StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString());
        Object objNextValue = jSONTokener.nextValue();
        k("桥接 JSON 格式错误", (objNextValue instanceof JSONObject) && jSONTokener.nextClean() == 0);
        return (JSONObject) objNextValue;
    }

    public static String n(HttpUrl httpUrl) {
        return httpUrl.scheme() + "://" + httpUrl.host() + ":" + httpUrl.port();
    }

    public static String p(Exception exc, int i) {
        return new JSONObject(com.github.catvod.spider.merge.p001b.g.d(e(exc))).put("page", i).put("pagecount", i).put("limit", 24).put("total", 0).toString();
    }

    public static Request.Builder r(HttpUrl httpUrl, Headers headers) throws Failure {
        k("请求凭据需要 HTTPS", httpUrl.isHttps() || (headers.get("Cookie") == null && headers.get("Authorization") == null));
        Request.Builder builderTag = new Request.Builder().url(httpUrl).headers(headers).tag(Headers.class, headers);
        String strM249 = "Accept-Encoding";
        if (headers.get(strM249) == null) {
            builderTag.header(strM249, "identity");
        }
        return builderTag;
    }

    public static String s(String str, JSONObject jSONObject) throws Failure {
        Object objOpt = jSONObject.opt(str);
        k("桥接字段格式错误", objOpt instanceof String);
        return (String) objOpt;
    }

    public static HttpUrl t(String str) throws Failure {
        boolean z = false;
        boolean z2 = (str == null || str.length() > 32768 || str.matches("(?s).*[\\x00-\\x20\\x7f].*")) ? false : true;
        String strM459 = "地址格式错误";
        k(strM459, z2);
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl != null && httpUrl.username().isEmpty() && httpUrl.password().isEmpty()) {
            z = true;
        }
        k(strM459, z);
        return httpUrl;
    }

    public static k u(String str, JSONObject jSONObject) {
        k kVar = new k(str, i(s("name", jSONObject)), s("pic", jSONObject), i(s("remark", jSONObject)));
        kVar.u(jSONObject.optString("year"));
        kVar.k(jSONObject.optString("area"));
        kVar.i(jSONObject.optString("type"));
        kVar.j(jSONObject.optString("actor"));
        kVar.m(jSONObject.optString("director"));
        kVar.l(jSONObject.optString("content"));
        return kVar;
    }

    public final JSONObject a(Session session, JSONObject jSONObject, long j) throws JSONException, Failure {
        c(session, j);
        String string = jSONObject.toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        String strM473 = "N1.lPxZkGYoORX+1yVxey1O6KCElIfmZQRyaYaO8owiLlF88AypMMXksBuBTEbghXgMuAYHbDR9jv2VajHd9xyHWp2rnxQf65hPGvwcdalSvcc=";
        String strM116 = "N1.rdP+TL84N/Pw3IkFHshuTYZHYUpPCD3kVdpNFyjzUbfbu+c/dwdO8aPeSwvGym+hl+JVm/Z8d83kByR1WJaSDrdkKk0+766dLayWYmKSgQw=";
        byte[] bArrT = FishCrypto.t(strM473, strM116, "N1.eaKqlMJ3nTVEwOXqQJ+y0BZ9nQJKqd0vg1padOmOuq6t1xQ3yAHlclPYRRWTAAQ3L0avpPzpG6lpvCgzA0gwWHf2pcEkTTGtUUrC1oMFmTI=", "N1.aniWdQ3KMo5JB7IblxrvUrgP93/376dno1+IQJrc+JBuce7dz6pNO03aMg4pImQmAYsjyE1TpvsdxHZ5mvZQkEwCVh9uZYMm7u8x2UfNflKN6EFqSOf7gKN7+pEwZZ5b3PJJnHYQlDz61uK/mD3QmNDVfTVqtPGHwNejf1isKSc=", bytes);
        k("桥接请求加密失败", bArrT != null && bArrT.length > 0);
        JSONObject jSONObject2 = new JSONObject();
        String strEncodeToString = Base64.encodeToString(bArrT, 2);
        String strM339 = "moyufucking";
        byte[] bytes2 = jSONObject2.put(strM339, strEncodeToString).toString().getBytes(charset);
        k("桥接请求过大", bytes2.length <= 10485760);
        Reply replyG = g(session, new Request.Builder().url(session.a).header("Accept-Encoding", "identity").post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), bytes2)).build(), j, 10485760, false);
        c(session, j);
        k("桥接服务暂不可用", replyG.a == 200);
        JSONObject jSONObjectM = m(replyG.c);
        k("桥接外围字段错误", jSONObjectM.length() == 1);
        byte[] bArrB = b(10485760, s(strM339, jSONObjectM));
        k("桥接密文错误", bArrB.length > 0 && bArrB.length % 16 == 0);
        byte[] bArrS = FishCrypto.s(strM473, strM116, bArrB);
        k("桥接响应解密失败", bArrS != null && bArrS.length > 0 && bArrS.length <= 10485760);
        JSONObject jSONObjectM2 = m(bArrS);
        if (Boolean.TRUE.equals(jSONObjectM2.opt("ok"))) {
            return jSONObjectM2.getJSONObject("data");
        }
        String strM567 = "error";
        String strM477 = "桥接服务错误";
        String strOptString = jSONObjectM2.optString(strM567, strM477);
        k(strM477, (strOptString.length() > 160 || strOptString.contains("://") || strOptString.contains("\n") || strOptString.contains("\r")) ? false : true);
        throw new Failure(strOptString);
    }

    public final long c(Session session, long j) throws Failure {
        k("请求已取消或站源尚未初始化", (session == null || session != this.a || session.e || Thread.currentThread().isInterrupted()) ? false : true);
        long jNanoTime = j - System.nanoTime();
        k("请求超时", jNanoTime > 0);
        return jNanoTime;
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
            } catch (Throwable th) {
                throw th;
            }
        }
        session.d.connectionPool().evictAll();
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

    /* JADX WARN: Code duplicated, block: B:111:0x046f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x026a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0312  */
    /* JADX WARN: Code duplicated, block: B:52:0x0335  */
    /* JADX WARN: Code duplicated, block: B:55:0x0355  */
    /* JADX WARN: Code duplicated, block: B:63:0x03c4 A[Catch: IOException -> 0x03f1, TryCatch #3 {IOException -> 0x03f1, blocks: (B:60:0x037e, B:63:0x03c4, B:65:0x03cc), top: B:101:0x037e }] */
    /* JADX WARN: Code duplicated, block: B:65:0x03cc A[Catch: IOException -> 0x03f1, TRY_LEAVE, TryCatch #3 {IOException -> 0x03f1, blocks: (B:60:0x037e, B:63:0x03c4, B:65:0x03cc), top: B:101:0x037e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x040d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0423  */
    /* JADX WARN: Code duplicated, block: B:85:0x0435  */
    public final JSONObject f(Session session, String str, JSONObject jSONObject, long j) throws JSONException, IOException {
        int i;
        JSONObject jSONObjectPut;
        String strM422;
        JSONObject jSONObject2;
        String strS;
        byte[] bArrB;
        String strM473;
        boolean zEquals;
        String strM102;
        boolean z;
        boolean z2;
        Request.Builder builderR;
        DaDun daDun;
        JSONObject jSONObject3;
        String str2;
        String str3;
        String str4;
        String str5;
        String strM499;
        JSONObject jSONObject4;
        Headers headers;
        JSONObject jSONObject5;
        String[] strArr;
        int i2;
        String str6;
        Object obj;
        JSONObject jSONObject6;
        String str7;
        boolean z3;
        JSONObject jSONObjectQ;
        DaDun daDun2;
        JSONObject jSONObjectPut2;
        DaDun daDun3 = this;
        String str8 = str;
        String strM292 = "status";
        String strM116 = "ok";
        daDun3.c(session, j);
        JSONObject jSONObject7 = new JSONObject();
        String strM36 = "action";
        JSONObject jSONObjectA = daDun3.a(session, jSONObject7.put(strM36, "prepare").put("scene", str8).put("params", jSONObject), j);
        JSONObject jSONObject8 = null;
        int i3 = 0;
        while (true) {
            String strM567 = "桥接步骤过多";
            if (i3 > 24) {
                throw new Failure(strM567);
            }
            daDun3.c(session, j);
            String strS2 = s("kind", jSONObjectA);
            String strM545 = "result";
            boolean zEquals2 = strS2.equals(strM545);
            String strM529 = "player";
            String strM445 = "url";
            String str9 = strM292;
            String strM477 = "format";
            String strM117 = "headers";
            if (zEquals2) {
                JSONObject jSONObject9 = jSONObjectA.getJSONObject(strM545);
                if (str8.equals(strM529)) {
                    k("媒体尚未通过本地探测", jSONObject8 != null);
                    k("媒体格式不一致", s(strM477, jSONObject9).equals(jSONObject8.getString(strM477)));
                    jSONObject9.put(strM445, jSONObject8.getString(strM445)).put(strM117, jSONObject8.getJSONObject(strM117));
                }
                return jSONObject9;
            }
            k(strM567, i3 < 24);
            String strM474 = "ticket";
            String strS3 = s(strM474, jSONObjectA);
            if (strS3.isEmpty()) {
                i = i3;
            } else {
                i = i3;
                boolean z4 = strS3.length() <= 400000;
                k("桥接票据错误", z4);
                jSONObjectPut = new JSONObject().put(strM36, "consume").put(strM474, strS3);
                strM422 = "probe";
                if (strS2.equals(strM422)) {
                    k("探测场景错误", str8.equals(strM529));
                    try {
                        HttpUrl httpUrlT = t(s(strM445, jSONObjectA));
                        Headers headersH = h(jSONObjectA.getJSONObject(strM117), true);
                        obj = "";
                        jSONObject6 = jSONObjectPut;
                        str7 = strM422;
                        z3 = false;
                        try {
                            jSONObjectQ = q(session, httpUrlT, headersH, j);
                            try {
                                jSONObjectPut2 = new JSONObject().put(strM116, true).put(strM477, jSONObjectQ.getString(strM477));
                                daDun2 = this;
                            } catch (Exception unused) {
                                daDun2 = this;
                                daDun2.c(session, j);
                                jSONObjectPut2 = new JSONObject().put(strM116, z3).put(strM477, obj);
                            }
                        } catch (Exception unused2) {
                            jSONObjectQ = null;
                            daDun2 = this;
                            daDun2.c(session, j);
                            jSONObjectPut2 = new JSONObject().put(strM116, z3).put(strM477, obj);
                            jSONObject2 = jSONObject6;
                            jSONObject2.put(str7, jSONObjectPut2);
                            jSONObject4 = jSONObjectQ;
                            daDun = daDun2;
                            str2 = strM116;
                            str4 = str9;
                            daDun.c(session, j);
                            JSONObject jSONObjectA2 = daDun.a(session, jSONObject2, j);
                            i3 = i + 1;
                            jSONObject8 = jSONObject4;
                            strM292 = str4;
                            jSONObjectA = jSONObjectA2;
                            daDun3 = daDun;
                            strM116 = str2;
                            str8 = str;
                        }
                    } catch (Exception unused3) {
                        obj = "";
                        jSONObject6 = jSONObjectPut;
                        str7 = strM422;
                        z3 = false;
                    }
                    jSONObject2 = jSONObject6;
                    jSONObject2.put(str7, jSONObjectPut2);
                    jSONObject4 = jSONObjectQ;
                    daDun = daDun2;
                    str2 = strM116;
                    str4 = str9;
                } else {
                    jSONObject2 = jSONObjectPut;
                    k("桥接步骤错误", strS2.equals("request"));
                    HttpUrl httpUrlT2 = t(s(strM445, jSONObjectA));
                    Headers headersH2 = h(jSONObjectA.getJSONObject(strM117), false);
                    strS = s("method", jSONObjectA);
                    String strM293 = "body_b64";
                    bArrB = b(4194304, s(strM293, jSONObjectA));
                    strM473 = "GET";
                    zEquals = strS.equals(strM473);
                    strM102 = "POST";
                    if (!zEquals || strS.equals(strM102)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    k("请求方法错误", z);
                    if (strS.equals(strM473) || bArrB.length == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    k("GET 请求体错误", z2);
                    builderR = r(httpUrlT2, headersH2);
                    if (strS.equals(strM102)) {
                        builderR.post(RequestBody.create((MediaType) null, bArrB));
                    }
                    try {
                        daDun = this;
                        jSONObject3 = null;
                        str2 = strM116;
                        str3 = strM293;
                        try {
                            Reply replyG = g(session, builderR.build(), j, 4194304, false);
                            str4 = str9;
                            try {
                                JSONObject jSONObjectPut3 = jSONObject2.put(str4, replyG.a);
                                headers = replyG.b;
                                jSONObject5 = new JSONObject();
                                strArr = new String[]{"location", "content-type", "content-encoding"};
                                i2 = 0;
                                while (i2 < 3) {
                                    str6 = strArr[i2];
                                    if (headers.get(str6) != null) {
                                        jSONObject5.put(str6, headers.get(str6));
                                    }
                                    i2++;
                                    strArr = strArr;
                                }
                                str5 = strM117;
                                try {
                                    jSONObjectPut3.put(str5, jSONObject5).put(str3, Base64.encodeToString(replyG.c, 2));
                                } catch (IOException e) {
                                    e = e;
                                    daDun.c(session, j);
                                    if (!(e instanceof Failure)) {
                                        throw e;
                                    }
                                    JSONObject jSONObjectPut4 = jSONObject2.put(str4, 0).put(str5, new JSONObject()).put(str3, "");
                                    if (e instanceof SocketTimeoutException) {
                                        strM499 = "timeout";
                                    } else {
                                        strM499 = "io";
                                    }
                                    jSONObjectPut4.put("transport_error", strM499);
                                }
                            } catch (IOException e2) {
                                e = e2;
                                str5 = strM117;
                                daDun.c(session, j);
                                if (!(e instanceof Failure)) {
                                    throw e;
                                }
                                JSONObject jSONObjectPut5 = jSONObject2.put(str4, 0).put(str5, new JSONObject()).put(str3, "");
                                if (e instanceof SocketTimeoutException) {
                                    strM499 = "timeout";
                                } else {
                                    strM499 = "io";
                                }
                                jSONObjectPut5.put("transport_error", strM499);
                                jSONObject4 = jSONObject3;
                                daDun.c(session, j);
                                JSONObject jSONObjectA3 = daDun.a(session, jSONObject2, j);
                                i3 = i + 1;
                                jSONObject8 = jSONObject4;
                                strM292 = str4;
                                jSONObjectA = jSONObjectA3;
                                daDun3 = daDun;
                                strM116 = str2;
                                str8 = str;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            str4 = str9;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        daDun = this;
                        jSONObject3 = null;
                        str2 = strM116;
                        str3 = r7;
                        str4 = str9;
                        str5 = strM117;
                    }
                    jSONObject4 = jSONObject3;
                }
                daDun.c(session, j);
                JSONObject jSONObjectA4 = daDun.a(session, jSONObject2, j);
                i3 = i + 1;
                jSONObject8 = jSONObject4;
                strM292 = str4;
                jSONObjectA = jSONObjectA4;
                daDun3 = daDun;
                strM116 = str2;
                str8 = str;
            }
            k("桥接票据错误", z4);
            jSONObjectPut = new JSONObject().put(strM36, "consume").put(strM474, strS3);
            strM422 = "probe";
            if (strS2.equals(strM422)) {
                k("探测场景错误", str8.equals(strM529));
                HttpUrl httpUrlT3 = t(s(strM445, jSONObjectA));
                Headers headersH3 = h(jSONObjectA.getJSONObject(strM117), true);
                obj = "";
                jSONObject6 = jSONObjectPut;
                str7 = strM422;
                z3 = false;
                jSONObjectQ = q(session, httpUrlT3, headersH3, j);
                jSONObjectPut2 = new JSONObject().put(strM116, true).put(strM477, jSONObjectQ.getString(strM477));
                daDun2 = this;
                jSONObject2 = jSONObject6;
                jSONObject2.put(str7, jSONObjectPut2);
                jSONObject4 = jSONObjectQ;
                daDun = daDun2;
                str2 = strM116;
                str4 = str9;
            } else {
                jSONObject2 = jSONObjectPut;
                k("桥接步骤错误", strS2.equals("request"));
                HttpUrl httpUrlT4 = t(s(strM445, jSONObjectA));
                Headers headersH4 = h(jSONObjectA.getJSONObject(strM117), false);
                strS = s("method", jSONObjectA);
                String strM294 = "body_b64";
                bArrB = b(4194304, s(strM294, jSONObjectA));
                strM473 = "GET";
                zEquals = strS.equals(strM473);
                strM102 = "POST";
                if (zEquals) {
                    z = true;
                } else {
                    z = true;
                }
                k("请求方法错误", z);
                if (strS.equals(strM473)) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                k("GET 请求体错误", z2);
                builderR = r(httpUrlT4, headersH4);
                if (strS.equals(strM102)) {
                    builderR.post(RequestBody.create((MediaType) null, bArrB));
                }
                daDun = this;
                jSONObject3 = null;
                str2 = strM116;
                str3 = strM294;
                Reply replyG2 = g(session, builderR.build(), j, 4194304, false);
                str4 = str9;
                JSONObject jSONObjectPut6 = jSONObject2.put(str4, replyG2.a);
                headers = replyG2.b;
                jSONObject5 = new JSONObject();
                strArr = new String[]{"location", "content-type", "content-encoding"};
                i2 = 0;
                while (i2 < 3) {
                    str6 = strArr[i2];
                    if (headers.get(str6) != null) {
                        jSONObject5.put(str6, headers.get(str6));
                    }
                    i2++;
                    strArr = strArr;
                }
                str5 = strM117;
                jSONObjectPut6.put(str5, jSONObject5).put(str3, Base64.encodeToString(replyG2.c, 2));
                jSONObject4 = jSONObject3;
            }
            daDun.c(session, j);
            JSONObject jSONObjectA5 = daDun.a(session, jSONObject2, j);
            i3 = i + 1;
            jSONObject8 = jSONObject4;
            strM292 = str4;
            jSONObjectA = jSONObjectA5;
            daDun3 = daDun;
            strM116 = str2;
            str8 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    public final Reply g(Session session, Request request, long j, int i, boolean z) throws Failure {
        boolean z2;
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
        k("请求过大", z2);
        OkHttpClient.Builder builderCallTimeout = session.d.newBuilder().callTimeout(c(session, j), TimeUnit.NANOSECONDS);
        if (request.tag(Headers.class) != null) {
            builderCallTimeout.dns(new C0359j(5));
        }
        Call callNewCall = builderCallTimeout.build().newCall(request);
        synchronized (session) {
            c(session, j);
            session.c.add(callNewCall);
        }
        try {
            Response responseExecute = callNewCall.execute();
            try {
                k("响应过大", responseExecute.headers().byteCount() <= 65536 && (z || responseExecute.body() == null || responseExecute.body().contentLength() <= ((long) i)));
                Buffer buffer = new Buffer();
                long j2 = i;
                if (!z) {
                    j2++;
                }
                boolean z3 = (z || request.tag(Headers.class) == null) ? false : true;
                String lowerCase = responseExecute.header("Content-Type", "").toLowerCase(Locale.ROOT);
                k("媒体请求需要本地探测", (z3 && (lowerCase.startsWith("video/") || lowerCase.startsWith("audio/") || lowerCase.contains("mpegurl") || lowerCase.contains("dash+xml"))) ? false : true);
                while (responseExecute.body() != null && buffer.size() < j2) {
                    c(session, j);
                    long j3 = responseExecute.body().source().read(buffer, Math.min(8192L, j2 - buffer.size()));
                    if (z3 && buffer.size() > 0 && (buffer.size() >= 8192 || j3 < 0)) {
                        k("媒体请求需要本地探测", j(buffer.clone().readByteArray(Math.min(8192L, buffer.size()))).isEmpty());
                        z3 = false;
                    }
                    if (j3 < 0) {
                        break;
                    }
                    j2 = j2;
                }
                k("接口正文过大", z || buffer.size() <= ((long) i));
                c(session, j);
                Reply reply = new Reply(responseExecute.code(), responseExecute.headers(), buffer.readByteArray());
                responseExecute.close();
                synchronized (session) {
                    session.c.remove(callNewCall);
                }
                return reply;
            } catch (Throwable th) {
                if (responseExecute == null) {
                    throw th;
                }
                try {
                    responseExecute.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            synchronized (session) {
                session.c.remove(callNewCall);
                throw th3;
            }
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

    public void init(Context context) {
        init(context, "");
    }

    public synchronized void init(Context context, String str) {
        try {
            destroy();
            String strTrim = str == null ? "" : str.trim();
            k("ext 格式错误", !strTrim.isEmpty() && strTrim.length() <= 65536);
            if (!strTrim.startsWith("{")) {
                if (!strTrim.regionMatches(true, 0, "http://", 0, 7)) {
                    if (!strTrim.regionMatches(true, 0, "https://", 0, 8)) {
                        strTrim = FishCrypto.g(strTrim);
                    }
                }
            }
            k("ext 格式错误", strTrim.length() <= 65536);
            String strTrim2 = strTrim.trim();
            String strI = "";
            if (strTrim2.startsWith("{")) {
                JSONObject jSONObjectM = m(strTrim2.getBytes(StandardCharsets.UTF_8));
                Iterator<String> itKeys = jSONObjectM.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    k("ext 字段错误", next.equals("php") || next.equals("playname"));
                }
                String strTrim3 = s("php", jSONObjectM).trim();
                strI = jSONObjectM.has("playname") ? i(s("playname", jSONObjectM)) : "";
                k("线路名称过长", strI.length() <= 128);
                strTrim2 = strTrim3;
            }
            HttpUrl httpUrlT = t(strTrim2);
            k("PHP 地址格式错误", httpUrlT.fragment() == null);
            this.a = new Session(httpUrlT.toString(), strI);
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

    public final String o(Session session, JSONObject jSONObject, long j) throws JSONException, Failure {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("list");
        k("列表过大", jSONArray.length() <= 10000);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(u(s("id", jSONObject2), jSONObject2));
        }
        c(session, j);
        JSONObject jSONObject3 = new JSONObject(com.github.catvod.spider.merge.p001b.g.y(arrayList));
        String strM105 = "page";
        JSONObject jSONObjectPut = jSONObject3.put(strM105, l(1, strM105, jSONObject));
        String strM177 = "pagecount";
        JSONObject jSONObjectPut2 = jSONObjectPut.put(strM177, l(1, strM177, jSONObject));
        String strM42 = "limit";
        JSONObject jSONObjectPut3 = jSONObjectPut2.put(strM42, l(1, strM42, jSONObject));
        String strM360 = "total";
        return jSONObjectPut3.put(strM360, l(0, strM360, jSONObject)).toString();
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

    public final JSONObject q(Session session, HttpUrl httpUrl, Headers headers, long j) throws JSONException, Failure {
        Headers.Builder builderNewBuilder = headers.newBuilder();
        String strM386 = "bytes=0-8191";
        String strM126 = "Range";
        Request requestBuild = r(httpUrl, builderNewBuilder.set(strM126, strM386).build()).build();
        int i = 0;
        while (true) {
            String strM186 = "媒体跳转过多";
            if (i > 3) {
                throw new Failure(strM186);
            }
            c(session, j);
            Reply replyG = g(session, requestBuild, j, 8192, true);
            List listAsList = Arrays.asList(301, 302, 303, 307, 308);
            int i2 = replyG.a;
            if (!listAsList.contains(Integer.valueOf(i2))) {
                k("媒体地址暂不可用", i2 == 200 || i2 == 206);
                String strJ = j(replyG.c);
                k("媒体格式未识别", !strJ.isEmpty());
                Headers headersBuild = requestBuild.headers().newBuilder().removeAll(strM126).build();
                JSONObject jSONObject = new JSONObject();
                for (int i3 = 0; i3 < headersBuild.size(); i3++) {
                    jSONObject.put(headersBuild.name(i3), headersBuild.value(i3));
                }
                return new JSONObject().put("url", requestBuild.url().toString()).put("headers", jSONObject).put("format", strJ);
            }
            k(strM186, i < 3);
            String str = replyG.b.get("Location");
            HttpUrl httpUrlResolve = str == null ? null : requestBuild.url().resolve(str);
            k("媒体跳转地址错误", httpUrlResolve != null);
            t(httpUrlResolve.toString());
            k("媒体跳转协议错误", !requestBuild.url().isHttps() || httpUrlResolve.isHttps());
            Headers.Builder builderNewBuilder2 = requestBuild.headers().newBuilder();
            if (!n(httpUrlResolve).equals(n(requestBuild.url()))) {
                builderNewBuilder2.removeAll("Cookie").removeAll("Authorization");
            }
            requestBuild = r(httpUrlResolve, builderNewBuilder2.build()).build();
            i++;
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

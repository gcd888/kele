package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
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
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Duboku extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f29short = {2733, 1648, 1650, 2638, 2636, 1416, 2770, 2960, 1802, 2839, 2836, 3175, 3171, 3147, 3150, 26910, 21846, -28292, 21853, 32563, 21879, 28860, -29617, 22510, 30438, -30112, 20693, 27990, 31654, 24108, 25105, -28643, 21907, 20790, 28214, 20641, 2765, 2698, 2701, 2703, 2695, 3142, 3199, 3188, 3164, 3193, 3171, 3172, 638, 551, 622, 608, 636, 551, 575, 551, 614, 617, 612, 630, 630, 551, 553, 551, 619, 612, 616, 608, 551, 575, 551, 32382, 21902, 551, 553, 551, 627, 612, 617, 624, 608, 551, 575, 606, 638, 551, 619, 551, 575, 551, 22425, 20578, 551, 553, 551, 627, 551, 575, 551, 22425, 20578, 551, 632, 553, 638, 551, 619, 551, 575, 551, 28724, 25280, 551, 553, 551, 627, 551, 575, 551, 28724, 25280, 551, 632, 553, 638, 551, 619, 551, 575, 551, 25173, 25107, 551, 553, 551, 627, 551, 575, 551, 25173, 25107, 551, 632, 553, 638, 551, 619, 551, 575, 551, 20653, 19801, 551, 553, 551, 627, 551, 575, 551, 20653, 19801, 551, 632, 553, 638, 551, 619, 551, 575, 551, 31700, 23678, 551, 553, 551, 627, 551, 575, 551, 31700, 23678, 551, 632, 553, 638, 551, 619, 551, 575, 551, 20578, 25280, 551, 553, 551, 627, 551, 575, 551, 20578, 25280, 551, 632, 553, 638, 551, 619, 551, 575, 551, 25257, 30612, 551, 553, 551, 627, 551, 575, 551, 25257, 30612, 551, 632, 553, 638, 551, 619, 551, 575, 551, 25295, 25247, 551, 553, 551, 627, 551, 575, 551, 25295, 25247, 551, 632, 553, 638, 551, 619, 551, 575, 551, 20961, -30016, 551, 553, 551, 627, 551, 575, 551, 20961, -30016, 551, 632, 600, 632, 1003, 946, 1019, 1013, 1001, 946, 938, 946, 1009, 994, 1013, 1009, 946, 956, 946, 1022, 1009, 1021, 1013, 946, 938, 946, 21664, 20650, 946, 956, 946, 998, 1009, 1020, 997, 1013, 946, 938, 971, 1003, 946, 1022, 946, 938, 946, 23223, -27178, 946, 956, 946, 998, 946, 938, 946, 23223, -27178, 946, 1005, 956, 1003, 946, 1022, 946, 938, 946, -26103, 28095, 946, 956, 946, 998, 946, 938, 946, -26103, 28095, 946, 1005, 956, 1003, 946, 1022, 946, 938, 946, 20576, 28142, 946, 956, 946, 998, 946, 938, 946, 20576, 28142, 946, 1005, 956, 1003, 946, 1022, 946, 938, 946, -27527, 21869, 946, 956, 946, 998, 946, 938, 946, -27527, 21869, 946, 1005, 956, 1003, 946, 1022, 946, 938, 946, 26229, 25788, 946, 956, 946, 998, 946, 938, 946, 26229, 25788, 946, 1005, 956, 1003, 946, 1022, 946, 938, 946, 28512, 21869, 946, 956, 946, 998, 946, 938, 946, 28512, 21869, 946, 1005, 973, 1005, 1173, 1228, 1157, 1163, 1175, 1228, 1236, 1228, 1175, 1163, 1167, 1180, 1228, 1218, 1228, 1152, 1167, 1155, 1163, 1228, 1236, 1228, 23194, 18963, 1228, 1218, 1228, 1176, 1167, 1154, 1179, 1163, 1228, 1236, 1205, 1173, 1228, 1152, 1228, 1236, 1228, 1244, 1246, 1244, 1243, 1228, 1218, 1228, 1176, 1228, 1236, 1228, 1244, 1246, 1244, 1243, 1228, 1171, 1218, 1173, 1228, 1152, 1228, 1236, 1228, 1244, 1246, 1244, 1242, 1228, 1218, 1228, 1176, 1228, 1236, 1228, 1244, 1246, 1244, 1242, 1228, 1171, 1218, 1173, 1228, 1152, 1228, 1236, 1228, 1244, 1246, 1244, 1245, 1228, 1218, 1228, 1176, 1228, 1236, 1228, 1244, 1246, 1244, 1245, 1228, 1171, 1218, 1173, 1228, 1152, 1228, 1236, 1228, 1244, 1246, 1244, 1244, 1228, 1218, 1228, 1176, 1228, 1236, 1228, 1244, 1246, 1244, 1244, 1228, 1171, 1218, 1173, 1228, 1152, 1228, 1236, 1228, 1244, 1246, 1244, 1247, 1228, 1218, 1228, 1176, 1228, 1236, 1228, 1244, 1246, 1244, 1247, 1228, 1171, 1218, 1173, 1228, 1152, 1228, 1236, 1228, 1244, 1246, 1244, 1246, 1228, 1218, 1228, 1176, 1228, 1236, 1228, 1244, 1246, 1244, 1246, 1228, 1171, 1203, 1171, 949, 1004, 933, 939, 951, 1004, 1012, 1004, 930, 943, 928, 937, 1004, 994, 1004, 928, 943, 931, 939, 1004, 1012, 1004, -30685, -30258, 1004, 994, 1004, 952, 943, 930, 955, 939, 1004, 1012, 917, 949, 1004, 928, 1004, 1012, 1004, 21811, -30685, 1004, 994, 1004, 952, 1004, 1012, 1004, 21811, -30685, 1004, 947, 994, 949, 1004, 928, 1004, 1012, 1004, 32618, -30685, 1004, 994, 1004, 952, 1004, 1012, 1004, 32618, -30685, 1004, 947, 994, 949, 1004, 928, 1004, 1012, 1004, -27609, -30685, 1004, 994, 1004, 952, 1004, 1012, 1004, -27609, -30685, 1004, 947, 994, 949, 1004, 928, 1004, 1012, 1004, -32449, -30685, 1004, 994, 1004, 952, 1004, 1012, 1004, -32449, -30685, 1004, 947, 994, 949, 1004, 928, 1004, 1012, 1004, 26155, -30685, 1004, 994, 1004, 952, 1004, 1012, 1004, 26155, -30685, 1004, 947, 915, 947, 1760, 1721, 1776, 1790, 1762, 1721, 1697, 1721, 1785, 1762, 1721, 1719, 1721, 1781, 1786, 1782, 1790, 1721, 1697, 1721, 25865, 22548, 1721, 1719, 1721, 1773, 1786, 1783, 1774, 1790, 1721, 1697, 1728, 1760, 1721, 1781, 1721, 1697, 1721, 25453, -27793, 1721, 1719, 1721, 1773, 1721, 1697, 1721, 1721, 1766, 1719, 1760, 1721, 1781, 1721, 1697, 1721, 18465, 27279, 1721, 1719, 1721, 1773, 1721, 1697, 1721, 18465, 27279, 1721, 1766, 1719, 1760, 1721, 1781, 1721, 1697, 1721, -29345, 21661, 1721, 1719, 1721, 1773, 1721, 1697, 1721, -29345, 21661, 1721, 1766, 1734, 1766, 1333, 1645, 1820, 2068, 2148, 2150, 636, 633, 1507, 1511, 768, 770, 1106, 1105, 843, 875, 2831, 2830, 2851, 3001, 2975, 2953, 2974, 3009, 2989, 2955, 2953, 2946, 2968, 1222, 1252, 1265, 1250, 1255, 1255, 1258, 1188, 1214, 1189, 1211, 1195, 1187, 1244, 1250, 1253, 1263, 1252, 1276, 1272, 1195, 1221, 1247, 1195, 1210, 1211, 1189, 1211, 1200, 1195, 1244, 1250, 1253, 1213, 1215, 1200, 1195, 1267, 1213, 1215, 1186, 1195, 1226, 1275, 1275, 1255, 1262, 1244, 1262, 1257, 1216, 1250, 1279, 1188, 1214, 1208, 1212, 1189, 1208, 1213, 1195, 1187, 1216, 1219, 1247, 1222, 1223, 1191, 1195, 1255, 1250, 1248, 1262, 1195, 1228, 1262, 1256, 1248, 1252, 1186, 1195, 1224, 1251, 1273, 1252, 1254, 1262, 1188, 1210, 1210, 1203, 1189, 1211, 1189, 1211, 1189, 1211, 1195, 1240, 1258, 1261, 1258, 1273, 1250, 1188, 1214, 1208, 1212, 1189, 1208, 1213, 502, 491, 496, 510, 496, 503, 2035, 2031, 2031, 2027, 2024, 1953, 1972, 1972, 2028, 1973, 2047, 2030, 2041, 2036, 2032, 2030, 1973, 2034, 2036, 3189, 3170, 3169, 3170, 3189, 3170, 
    3189, 2832, 2828, 2828, 2824, 2827, 2882, 2903, 2903, 2831, 2902, 2844, 2829, 2842, 2839, 2835, 2829, 2902, 2833, 2839, 2903, 3067, 3000, 3046, 2976, 3053, 2491, 2530, 2555, 2544, 2535, 2545, 2549, 2534, 2551, 2556, 885, 804, 823, 878, 919, 918, 900, 1007, 1018, 903, 936, 932, 940, 2225, 2187, 2220, 2177, 1001, 990, 983, 990, 986, 968, 990, 994, 990, 986, 969, 1559, 1590, 1568, 1584, 1569, 1594, 1571, 1575, 1594, 1596, 1597, 1141, 1111, 1088, 1115, 1094, 2748, 2705, 2698, 2717, 2715, 2700, 2711, 2698, 2434, 2494, 2483, 2475, 2494, 2491, 2465, 2470, 506, 463, 470, 460, 464, 475, 474, 497, 478, 466, 474, 3140, 1860, 1883, 1910, 288, 29890, 25219, 22717, 2675, 1599, 1597, 1576, 1593, 1557, 1592, 2336, 2355, 2340, 2336, 2211, 2239, 2235, 2216, 1564, 1543, 389, 394, 391, 405, 405, 3281, 3292, 3283, 3290, 976, 905, 912, 923, 908, 919, 912, 904, 976, 392, 544, 544, 544, 544, 1450, 1450, 1450, 2484, 2445, 2438, 2478, 2443, 2449, 2454, 2208, 2447, 804, 770, 788, 771, 860, 816, 790, 788, 799, 773, 1256, 1226, 1247, 1228, 1225, 1225, 1220, 1162, 1168, 1163, 1173, 1157, 1165, 1266, 1228, 1227, 1217, 1226, 1234, 1238, 1157, 1259, 1265, 1157, 1172, 1173, 1163, 1173, 1182, 1157, 1266, 1228, 1227, 1171, 1169, 1182, 1157, 1245, 1171, 1169, 1164, 1922, 1966, 1967, 1967, 1956, 1954, 1973, 1960, 1966, 1967, 2876, 2834, 2834, 2823, 2906, 2870, 2843, 2846, 2817, 2834, 1181, 1194, 1193, 1194, 1213, 1194, 1213, 3119, 3123, 3123, 3127, 3124, 3197, 3176, 3176, 3120, 3120, 3120, 3177, 3107, 3122, 3109, 3112, 3116, 3122, 3177, 3123, 3121, 3176, 1691, 1686, 1723, 1406, 1348, 1379, 1358, 1295, 1338, 1340, 2381, 2430, 2411, 2422, 2417, 2424, 23100, 2215, 2184, 2180, 2188, 1571, 1570, 1569, 1568, 1575, 1574, 1573, 1572, 1579, 1578, 1650, 1649, 1648, 1655, 1654, 1653, 1652, 1659, 1658, 1657, 1656, 1663, 1662, 1661, 1660, 1635, 1634, 1633, 1632, 1639, 1638, 1637, 1636, 1643, 1642, 1641, 1618, 1617, 1616, 1623, 1622, 1621, 1620, 1627, 1626, 1625, 1624, 1631, 1630, 1629, 1628, 1603, 1602, 1601, 1600, 1607, 1606, 1605, 1604, 1611, 1610, 1609, 851, 850, 849, 827, 826, 825, 824, 831, 830, 829, 828, 819, 818, 874, 873, 872, 879, 878, 877, 876, 867, 866, 865, 864, 871, 870, 869, 868, 891, 890, 889, 888, 895, 894, 893, 892, 883, 882, 881, 842, 841, 840, 847, 846, 845, 844, 835, 834, 833, 832, 839, 838, 837, 836, 859, 858, 857, 856, 863, 862, 861, 860, 1510, 2637, 608, 543, 512, 616, 604, 578, 636, 617, 534, 596, 611, 598, 579, 639, 633, 638, 582, 621, 619, 617, 582, 598, 513, 637, 539, 618, 517, 633, 609, 581, 604, 538, 537, 632, 581, 534, 619, 581, 541, 607, 638, 599, 587, 576, 639, 584, 615, 585, 617, 604, 579, 602, 539, 631, 617, 612, 613, 614, 591, 580, 601, 605, 601, 579, 611, 605, 543, 577, 541, 630, 600, 536, 621, 621, 598, 604, 577, 589, 634, 582, 513, 589, 623, 599, 636, 539, 609, 603, 623, 531, 531, 329, 284, 284, 262, 267, 338, 1317, 1399, 1388, 1384, 1382, 1389, 1342, 1384, 1386, 1407, 1390, 1388, 1380, 1401, 1394, 1352, 1380, 1381, 1407, 1390, 1381, 1407, 991, 990, 975, 986, 978, 983, 1016, 980, 981, 975, 990, 981, 975, 1741, 1738, 1736, 1728, 1766, 1738, 1739, 1745, 1728, 1739, 1745, 1501, 1442, 1469, 1525, 1488, 1532, 1494, 1475, 1511, 1511, 1515, 1482, 1506, 1472, 1441, 1474, 1527, 1441, 1522, 1503, 1502, 1472, 1450, 1500, 1521, 1444, 1506, 1506, 1488, 1451, 1443, 1442, 1514, 1513, 1527, 1488, 1447, 1473, 1528, 1477, 1443, 1444, 1488, 1533, 1525, 1511, 1531, 1506, 1445, 1502, 1474, 1509, 1499, 1444, 1499, 1505, 1515, 1483, 1442, 1441, 1515, 1514, 1440, 1525, 1442, 1475, 1495, 1489, 1446, 1534, 1442, 1497, 1493, 1495, 1451, 1499, 1514, 1468, 1472, 1481, 1477, 1535, 1488, 1479, 1524, 1443, 1445, 1477, 1527, 1504, 1508, 1526, 1503, 1472, 1530, 1502, 1474, 1530, 1450, 1478, 1481, 1511, 1533, 1505, 1501, 1534, 1494, 1493, 1442, 1447, 1454, 1201, 1197, 1197, 1193, 2819, 2834, 2827, 3017, 3027, 3022, 3039, 1706, 429, 433, 444, 420, 440, 431, 414, 434, 435, 425, 440, 435, 425, 440, 430, 426, 441, 424, 419, 392, 420, 421, 447, 430, 421, 447, 1517, 1531, 1535, 1516, 1533, 1526, 1501, 1521, 1520, 1514, 1531, 1520, 1514, 1143, 1121, 1125, 1142, 1127, 1132, 1095, 1131, 1130, 1136, 1121, 1130, 1136};
    public String a = "";

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, C0133.m529(f29short, 0, 1, 2716));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {C0076.m301(f29short, 5, 1, 1465), C0014.m54(f29short, 6, 1, 2784), C0109.m432(f29short, 7, 1, 2979), C0019.m75(f29short, 8, 1, 1854), C0106.m422(f29short, 9, 2, 2853), C0106.m422(f29short, 1, 2, 1602), C0028.m108(f29short, 3, 2, 2687), C0011.m42(f29short, 11, 2, 3158), C0140.m558(f29short, 13, 2, 3194)};
        String[] strArr2 = {C0030.m116(f29short, 19, 2, 2566), C0107.m427(f29short, 21, 3, 1417), C0092.m365(f29short, 24, 2, 2074), C0115.m459(f29short, 26, 2, 637), C0128.m511(f29short, 28, 2, 3147), C0053.m210(f29short, 15, 2, 1841), C0097.m386(f29short, 17, 2, 1850), C0009.m33(f29short, 30, 3, 2036), C0056.m223(f29short, 33, 3, 710)};
        for (int i = 0; i < 9; i++) {
            arrayList.add(new com.github.catvod.spider.merge.p001b.b(strArr[i], strArr2[i], null));
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArray = new JSONArray(X1.X(this.a + C0092.m365(f29short, 36, 5, 2786) + e(), null, b()));
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList2.addAll(c(jSONArray.optJSONObject(i2) == null ? null : jSONArray.optJSONObject(i2).optJSONArray(C0118.m471(f29short, 41, 7, 3088))));
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(new JSONObject(C0006.m21(f29short, 48, 217, 517)));
        jSONArray2.put(new JSONObject(C0073.m288(f29short, 265, 156, 912)));
        jSONArray2.put(new JSONObject(C0107.m427(f29short, 421, 180, 1262)));
        jSONArray2.put(new JSONObject(C0095.m379(f29short, 601, 136, 974)));
        jSONArray2.put(new JSONObject(C0117.m467(f29short, 737, 92, 1691)));
        String[] strArr3 = {C0003.m10(f29short, 831, 1, 1837), C0053.m210(f29short, 832, 1, 2086), C0089.m355(f29short, 833, 2, 2133), C0047.m186(f29short, 835, 2, 589), C0059.m234(f29short, 837, 2, 1490), C0019.m75(f29short, 839, 2, 818), C0082.m325(f29short, 841, 2, 1120), C0073.m288(f29short, 829, 1, 1286), C0143.m570(f29short, 830, 1, 1625)};
        for (int i3 = 0; i3 < 9; i3++) {
            jSONObject.put(strArr3[i3], jSONArray2);
        }
        return com.github.catvod.spider.merge.p001b.g.w(arrayList, arrayList2, jSONObject);
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String str3 = str2;
        String strI = AbstractC0280n1.i(str, str3, null, null);
        String[] strArrSplit = str3.split(C0072.m285(f29short, 843, 2, 791), -1);
        if (strArrSplit.length > 0) {
            str3 = strArrSplit[0];
        }
        String strA = a(new JSONObject(X1.X(this.a + str3 + e(), null, b())).optString(C0043.m169(f29short, 845, 3, 2887)));
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(strA);
        HashMap mapT = com.github.catvod.spider.merge.D.b.t(C0028.m108(f29short, 848, 10, 3052), C0085.m339(f29short, 858, 111, 1163), C0073.m288(f29short, 969, 6, 409), C0032.m126(f29short, 975, 19, 1947));
        mapT.put(C0137.m545(f29short, 994, 7, 3079), C0089.m355(f29short, 1001, 20, 2936));
        gVar.h(mapT);
        gVar.b(strI);
        if (strA.contains(C0122.m486(f29short, 1021, 5, 3029))) {
            gVar.k();
        }
        return gVar.r();
    }

    private /* synthetic */ String $host$65c98ef5fb2c1de8(String str, String str2) {
        return com.github.catvod.spider.merge.p001b.g.y(c(new JSONArray(X1.X(this.a + C0009.m33(f29short, 1026, 10, 2452) + e() + C0112.m445(f29short, 1036, 4, 851) + URLEncoder.encode(str, C0032.m126(f29short, 1040, 5, 962)), null, b()))));
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        JSONObject jSONObject = new JSONObject(X1.X(this.a + str + e(), null, b()));
        k kVarA = AbstractC0449a.a(str);
        String strOptString = jSONObject.optString(C0119.m473(f29short, 1045, 4, 969));
        kVarA.o(strOptString);
        kVarA.p(a(jSONObject.optString(C0142.m567(f29short, 1049, 4, 2277))));
        kVarA.u(jSONObject.optString(C0030.m116(f29short, 1053, 11, 955)));
        kVarA.l(jSONObject.optString(C0118.m471(f29short, 1064, 11, 1619)));
        String strM105 = C0027.m105(f29short, 1075, 5, 1076);
        kVarA.j(jSONObject.optJSONArray(strM105) == null ? "" : jSONObject.optJSONArray(strM105).toString());
        kVarA.m(jSONObject.optString(C0045.m177(f29short, 1080, 8, 2808)));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C0044.m175(f29short, 1088, 8, 2514));
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString2 = jSONObjectOptJSONObject.optString(C0104.m414(f29short, 1096, 11, 447));
                    StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strOptString2, C0095.m379(f29short, 1107, 1, 3168));
                    sbP.append(a(jSONObjectOptJSONObject.optString(C0082.m325(f29short, 1108, 3, 1810))));
                    String strM219 = C0055.m219(f29short, 1111, 1, 348);
                    sbP.append(strM219);
                    sbP.append(strOptString2);
                    sbP.append(strM219);
                    sbP.append(strOptString);
                    arrayList.add(sbP.toString());
                }
            }
        }
        kVarA.q(C0010.m36(f29short, 1112, 3, 1582));
        kVarA.r(TextUtils.join(C0070.m277(f29short, 1115, 1, 2640), arrayList));
        AbstractC0280n1.p(strOptString);
        AbstractC0280n1.q(kVarA.e());
        FishCrypto.c(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = str;
        if (map != null) {
            String strM408 = C0103.m408(f29short, 1116, 6, 1628);
            if (map.get(strM408) != null) {
                str7 = map.get(strM408);
            }
        }
        String str8 = "";
        if (map != null) {
            String strM511 = C0128.m511(f29short, 1122, 4, 2369);
            if (map.get(strM511) == null) {
                str3 = "";
            } else {
                str3 = map.get(strM511);
            }
        } else {
            str3 = "";
        }
        if (map != null) {
            String strM234 = C0059.m234(f29short, 1126, 4, 2266);
            if (map.get(strM234) == null) {
                str4 = "";
            } else {
                str4 = map.get(strM234);
            }
        } else {
            str4 = "";
        }
        if (map != null) {
            String strM177 = C0045.m177(f29short, 1130, 2, 1662);
            if (map.get(strM177) == null) {
                str5 = "";
            } else {
                str5 = map.get(strM177);
            }
        } else {
            str5 = "";
        }
        if (map != null) {
            String strM21 = C0006.m21(f29short, 1132, 5, 486);
            if (map.get(strM21) == null) {
                str6 = "";
            } else {
                str6 = map.get(strM21);
            }
        } else {
            str6 = "";
        }
        if (map != null) {
            String strM182 = C0046.m182(f29short, 1137, 4, 3261);
            if (map.get(strM182) != null) {
                str8 = map.get(strM182);
            }
        }
        String strM108 = C0028.m108(f29short, 1141, 9, 1023);
        String strM65 = C0017.m65(f29short, 1150, 1, 421);
        StringBuilder sbR = com.github.catvod.spider.merge.D.b.r(strM108, str7, strM65, str3, strM65);
        com.github.catvod.spider.merge.D.b.A(sbR, str5, strM65, str6, strM65);
        com.github.catvod.spider.merge.D.b.A(sbR, str8, C0073.m288(f29short, 1151, 4, 525), str2, C0011.m42(f29short, 1155, 3, 1415));
        sbR.append(str4);
        ArrayList arrayListC = c(new JSONObject(X1.X(this.a + sbR.toString() + e(), null, b())).optJSONArray(C0091.m360(f29short, 1158, 7, 2530)));
        int i = Integer.parseInt(str2);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.F(arrayListC);
        gVar.o(i, 44739242, 48, Integer.MAX_VALUE);
        return gVar.r();
    }

    public static String a(String str) {
        try {
            String strReplace = str.replace(C0011.m42(f29short, 1165, 1, 2190), C0001.m1(f29short, 1166, 1, 2482));
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < strReplace.length()) {
                int i2 = i + 10;
                sb.append((CharSequence) new StringBuilder(strReplace.substring(i, Math.min(i2, strReplace.length()))).reverse());
                i = i2;
            }
            return new String(Base64.decode(sb.toString(), 0), StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return "";
        }
    }

    public static HashMap b() {
        HashMap mapT = com.github.catvod.spider.merge.D.b.t(C0130.m516(f29short, 1167, 10, 881), C0017.m65(f29short, 1177, 41, 1189), C0018.m70(f29short, 1218, 10, 1985), C0091.m360(f29short, 1228, 10, 2935));
        mapT.put(C0081.m322(f29short, 1238, 7, 1231), C0043.m169(f29short, 1245, 22, 3143));
        return mapT;
    }

    public static ArrayList c(JSONArray jSONArray) {
        String strOptString;
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strA = a(jSONObjectOptJSONObject.optString(C0006.m21(f29short, 1267, 3, 1759)));
                String strA2 = a(jSONObjectOptJSONObject.optString(C0092.m365(f29short, 1270, 4, 1322)));
                String strM463 = C0116.m463(f29short, 1274, 3, 1371);
                if (jSONObjectOptJSONObject.has(strM463)) {
                    strOptString = jSONObjectOptJSONObject.optString(strM463);
                } else {
                    String strM234 = C0059.m234(f29short, 1277, 6, 2335);
                    strOptString = jSONObjectOptJSONObject.has(strM234) ? jSONObjectOptJSONObject.optDouble(strM234) + C0128.m511(f29short, 1283, 1, 2106) : "";
                }
                arrayList.add(new k(strA, jSONObjectOptJSONObject.optString(C0017.m65(f29short, 1284, 4, 2281)), strA2, strOptString));
            }
        }
        return arrayList;
    }

    public static String d(int i, long j, int i2) {
        String string;
        Random random = new Random((System.currentTimeMillis() / 1000) + j);
        if (i2 == 33) {
            string = C0050.m199(f29short, 1288, 62, 1555);
        } else if (i2 == 88) {
            string = C0116.m463(f29short, 1350, 62, 779);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i3 = i2; i3 < i2 + 62; i3++) {
                sb.append((char) i3);
            }
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < i; i4++) {
            sb2.append(string.charAt(random.nextInt(string.length())));
        }
        return sb2.toString();
    }

    public static String e() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        int iNextInt = new Random(jCurrentTimeMillis).nextInt(800000000) % 800000001;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String str = (100000000 + iNextInt) + String.valueOf(900000000 - iNextInt);
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(str.length(), strValueOf.length());
        for (int i = 0; i < iMin; i++) {
            sb.append(str.charAt(i));
            sb.append(strValueOf.charAt(i));
        }
        if (str.length() > iMin) {
            sb.append(str.substring(iMin));
        }
        if (strValueOf.length() > iMin) {
            sb.append(strValueOf.substring(iMin));
        }
        return FishCrypto.v(C0085.m339(f29short, 1414, 91, 558)) + d(60, 60 + jCurrentTimeMillis, 33) + C0093.m368(f29short, 1505, 6, 367) + Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 2).replace(C0114.m454(f29short, 1412, 1, 1499), C0001.m1(f29short, 1413, 1, 2659)) + C0095.m379(f29short, 1511, 7, 1283) + d(38, jCurrentTimeMillis + 38, 88);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0011.m42(f29short, 1518, 15, 1291));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0046.m182(f29short, 1533, 13, 955));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0053.m210(f29short, 1546, 11, 1701));
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
        this.a = FishCrypto.v(C0076.m301(f29short, 1557, 111, 1427));
        String strG = "";
        if (!TextUtils.isEmpty(str)) {
            String strTrim = str.trim();
            if (!strTrim.startsWith(C0106.m422(f29short, 1668, 4, 1241))) {
                try {
                    JSONObject jSONObject = new JSONObject(strTrim);
                    strTrim = jSONObject.optString(C0092.m365(f29short, 1672, 3, 2914));
                    if (TextUtils.isEmpty(strTrim)) {
                        strTrim = jSONObject.optString(C0011.m42(f29short, 1675, 4, 3002));
                    }
                } catch (Exception unused) {
                }
            }
            strG = strTrim;
        }
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        while (strG.endsWith(C0104.m414(f29short, 1679, 1, 1669))) {
            strG = com.github.catvod.spider.merge.D.b.g(strG, 1, 0);
        }
        this.a = strG;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0049.m193(f29short, 1680, 13, 477));
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

    public String searchContent(String str, String str2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0044.m175(f29short, 1693, 13, 459));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$65c98ef5fb2c1de8 = $host$65c98ef5fb2c1de8(str, str2);
            FishCrypto.endHostEntry(null);
            return str$host$65c98ef5fb2c1de8;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public String searchContent(String str, boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0101.m402(f29short, 1706, 13, 1438));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0049.m193(f29short, 1719, 13, 1028));
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

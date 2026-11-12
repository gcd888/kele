package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.AbstractC0260h;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.C0342a0;
import com.github.catvod.spider.merge.p000a.C0349e;
import com.github.catvod.spider.merge.p000a.C0353g;
import com.github.catvod.spider.merge.p000a.C0357i;
import com.github.catvod.spider.merge.p000a.C0364l0;
import com.github.catvod.spider.merge.p000a.C0376s;
import com.github.catvod.spider.merge.p000a.C0377s0;
import com.github.catvod.spider.merge.p000a.CallableC0363l;
import com.github.catvod.spider.merge.p000a.Q0;
import com.github.catvod.spider.merge.p000a.Y;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p000a.l1;
import com.github.catvod.spider.merge.p000a.t1;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.utils.C0143;
import com.google.gson.JsonObject;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Cloud extends Spider {
    public static String p = "";
    public static long q;
    public Quark a = null;
    public Ali b = null;
    public UC c = null;
    public TianYi d = null;
    public YiDongYun e = null;
    public BaiDuPan f = null;
    public Pan123 g = null;
    public XunleiPan h = null;
    public Pan115 i = null;
    public GuangYa j = null;
    public final Object k = new Object();
    public String l = "";
    public ArrayList m = new ArrayList();
    public long n = 0;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f24short = {455, 479, 496, 499, 489, 504, 449, 444, 495, 503, 501, 492, 444, 504, 489, 492, 496, 501, 511, 509, 488, 505, 444, 509, 489, 488, 500, 444, 492, 494, 499, 497, 492, 488, 422, 444, 2249, 2264, 2263, 2184, 2187, 2186, 2278, 2252, 2263, 2261, 2256, 2260, 2256, 2253, 2268, 2269, 1533, 1533, 1529, 1427, 1464, 1443, 1427, 1533, 1534, 1535, 2475, 2475, 2479, 2501, 2542, 2549, 2501, 2555, 2550, 2547, 750, 764, 744, 743, 750, 752, 744, 726, 765, 742, 726, 696, 699, 698, 678, 674, 694, 677, 700, 2621, 2603, 3032, 3013, 3021, 3010, 3029, 3013, 479, 466, 471, 1118, 1117, 1109, 1112, 1097, 961, 976, 991, 896, 899, 898, 1248, 1266, 1254, 1257, 1248, 1278, 1254, 643, 654, 661, 663, 670, 658, 2811, 2811, 2815, -32143, 22734, 21002, 27542, 30423, 32606, 27150, 28357, 1358, 1357, 1349, 1352, 1369, 920, 920, 924, 1014, 989, 966, 1014, 920, 923, 922, 687, 728, 687, 728, 3236, 3236, 3232, 30023, 17333, 24407, 27109, 26997, 27101, 1867, 1872, 1881, 1801, 1518, 1518, 1514, 31757, 19199, 1518, 1517, 1516, 23790, -30470, 1509, 1535, 1496, 1496, 1500, 1462, 1437, 1414, 1462, 1416, 1413, 1408, 3174, 3089, 3174, 3089, 1372, 1358, 1370, 1365, 1372, 1346, 1370, 1380, 1359, 1364, 1380, 1290, 1289, 1288, 2372, 2355, 2372, 2355, 2813, 2790, 2799, 2812, 2795, 852, 853, 839, 812, 825, 20705, -24699, 21422, 20227, 26242, 25208, 20019, 485, 492, 413, -348, 25672, 28029, 20709, 30675, 24317, 30842, 20104, 1419, 1410, 1491, 22876, -27080, 29127, 18229, 23511, 28005, 28149, 27997, 21242, -25186, 31329, 19603, 898, 897, 896, 23170, -29034, 905, 915, 731, 735, 715, 728, 705, 856, 815, 856, 815, 1556, 1538, 2509, 2490, 2509, 2490, 286, 259, 267, 260, 275, 259, 2685, 2570, 2685, 2570, 1628, 1612, 1601, 1610, 1611, 1602, 850, 805, 850, 805, 1025, 1036, 1033, 1244, 1195, 1668, 1685, 1690, 1733, 1734, 1735, 1784, 1770, 1790, 1777, 1784, 1766, 1790, 3059, 3070, 3045, 3047, 3054, 3042, 1678, 1785, 1678, 1785, 2659, 2659, 2663, 1517, 1434, 1517, 1434, 2032, 2414, 2411, 2404, 2407, 2411, 2401, 2431, 2824, 2857, 2918, 2855, 2864, 2855, 2863, 2858, 2855, 2852, 2858, 2851, 2918, 2853, 2858, 2857, 2867, 2850, 2918, 2869, 2857, 2867, 2868, 2853, 2851, 19289, 24699, 26197, 29648, 31237, 29580, 31023, 21215, 2491, 2474, 2469, 2533, 2490, 2494, 2474, 2489, 2464, 2533, 2472, 2469, 2532, 2488, 2532, 2350, 2360, 2339, 2364, 2351, 2404, 2367, 2345, 2404, 2345, 2340, 2405, 2361, 2405, 2264, 2261, 2256, 2240, 2252, 2263, 2269, 2251, 2256, 2255, 2268, 2199, 2266, 2262, 2260, 2198, 2250, 2198, 532, 537, 540, 517, 532, 539, 603, 534, 538, 536, 602, 518, 602, 3199, 3187, 3176, 3112, 3127, 3125, 3135, 1637, 1639, 1647, 1663, 1651, 1640, 1576, 1591, 1589, 1599, 1576, 1637, 1641, 1643, 2182, 2199, 2200, 2264, 2196, 2199, 2207, 2194, 2179, 2264, 2197, 2201, 2203, 31842, 21690, 30029, 31940, 17425, 23027, 32564, 2927, 2941, 2921, 2918, 2927, 2929, 2921, 2936, 2921, 2918, 2854, 2923, 2919, 2917, 2855, 2939, 2855, 3290, 3285, 3286, 3276, 3293, 3223, 3208, 3201, 3200, 3223, 3290, 3287, 3222, 1000, 1017, 1014, 950, 992, 1005, 1014, 1012, 1021, 1009, 950, 1019, 1015, 1013, 951, 1003, 951, 365, 365, 361, 370, 319, 307, 305, 371, 303, 371, 649, 649, 653, 731, 732, 726, 662, 731, 727, 725, 663, 715, 663, 953, 954, 955, 1016, 1001, 998, 934, 1003, 999, 997, 2078, 2077, 2076, 2143, 2126, 2113, 2049, 2124, 2113, 668, 647, 654, 669, 650, 705, 734, 733, 732, 671, 654, 641, 705, 652, 641, 1156, 1159, 1158, 1155, 1165, 1153, 1179, 1238, 1242, 1240, 749, 750, 751, 740, 746, 745, 754, 703, 691, 689, 1746, 1745, 1744, 1754, 1746, 1745, 1741, 1664, 1676, 1678, 532, 535, 534, 528, 540, 535, 523, 582, 586, 584, 1650, 1650, 1650, 3113, 3113, 3117, 2489, 2484, 2479, 2477, 2468, 2472, 811, 825, 813, 802, 811, 821, 813, 1092, 1109, 1114, 1029, 1030, 1031, 3167, 3164, 3156, 3161, 3144, 1511, 1527, 1530, 1521, 1520, 1529, 912, 909, 901, 906, 925, 909, 2679, 2682, 2687, 1412, 1408, 1428, 1415, 1438, 1217, 1239, 540, 522, 529, 526, 541, 598, 525, 539, 598, 539, 534, 599, 523, 599, 608, 625, 638, 574, 609, 613, 625, 610, 635, 574, 627, 638, 575, 611, 575, 2712, 2709, 2704, 2688, 2700, 2711, 2717, 2699, 2704, 2703, 2716, 2775, 2714, 2710, 2708, 2774, 2698, 2774, 1023, 1010, 1015, 1006, 1023, 1008, 944, 1021, 1009, 1011, 945, 1005, 945, 2656, 2671, 2668, 2678, 2663, 2605, 2610, 2619, 2618, 2605, 2656, 2669, 2604, 1318, 1322, 1329, 1393, 1390, 1388, 1382, 1483, 1481, 1473, 1489, 1501, 1478, 1414, 1433, 1435, 1425, 1414, 1483, 1479, 1477, 3047, 3062, 3065, 3001, 3061, 3062, 3070, 3059, 3042, 3001, 3060, 3064, 3066, 1976, 1962, 1982, 1969, 1976, 1958, 1982, 1967, 1982, 1969, 2033, 1980, 1968, 1970, 2032, 1964, 2032, 2236, 2221, 2210, 2274, 2228, 2233, 2210, 2208, 2217, 2213, 2274, 2223, 2211, 2209, 2275, 2239, 2275, 583, 583, 579, 600, 533, 537, 539, 601, 517, 601, 2010, 2010, 2014, 1928, 1935, 1925, 1989, 1928, 1924, 1926, 1988, 1944, 1988, 2383, 2359, 2383, 2359, 2383, 2359, 1955, 2011, 1955, 2011, 1955, 2011, 714, 715, 730, 719, 711, 706, 749, 705, 704, 730, 715, 704, 730, 2831, 2834, 2842, 2837, 2818, 2834, 2840, 2836, 2836, 2832, 2834, 2846, 3327, 3300, 3296, 3310, 3301, 968, 990, 990, 978, 978, 982, 980, 984, 2489, 2485, 2485, 2481, 2483, 2495, 1894, 1914, 1911, 1903, 1907, 1892, 1877, 1913, 1912, 1890, 1907, 1912, 1890};
    public static final Object o = new Object();

    class CloudTask {
        public final String a;
        public final int b;
        public final Callable c;

        public CloudTask(String str, int i, Callable callable) {
            this.a = str;
            this.b = i;
            this.c = callable;
        }
    }

    class PlayGroup {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final int e;

        public PlayGroup(String str, String str2, String str3, String str4, int i) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:6:0x0040  */
    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws Throwable {
        boolean z;
        String strH0;
        String strDecode;
        long j;
        boolean zO;
        String strM499 = C0125.m499(f24short, 0, 36, 412);
        String strL1 = AbstractC0302v0.L1(str);
        String strZ0 = AbstractC0302v0.Z0(str);
        if (TextUtils.isEmpty(strZ0)) {
            z = false;
        } else {
            if (C0119.m473(f24short, 36, 16, 2233).equals(strL1)) {
                zO = true;
            } else if (C0143.m570(f24short, 52, 10, 1484).equals(strL1)) {
                zO = C0377s0.u.s();
            } else if (C0030.m116(f24short, 62, 10, 2458).equals(strL1)) {
                zO = C0349e.j().A();
            } else if (C0105.m416(f24short, 72, 14, 649).equals(strL1)) {
                zO = C0377s0.u.s();
            } else if (C0090.m358(f24short, 86, 5, 727).equals(strZ0)) {
                zO = A0.s().P();
            } else if (C0028.m108(f24short, 91, 2, 2632).equals(strZ0)) {
                Z0.t().getClass();
                zO = Z0.N();
            } else if (C0143.m570(f24short, 93, 6, 2988).equals(strZ0)) {
                zO = Q0.f().s();
            } else if (C0135.m539(f24short, 99, 3, 446).equals(strZ0)) {
                zO = C0349e.j().A();
            } else if (C0103.m408(f24short, 102, 5, 1084).equals(strZ0)) {
                C0353g.a().getClass();
                zO = C0357i.i();
            } else if (C0118.m471(f24short, 107, 6, 945).equals(strZ0)) {
                zO = C0377s0.u.u();
            } else if (C0089.m355(f24short, 113, 7, 1159).equals(strZ0)) {
                zO = C0342a0.x.G();
            } else if (C0092.m365(f24short, 120, 6, 763).equals(strZ0)) {
                zO = l1.I().Z();
            } else if (C0074.m292(f24short, 126, 3, 2762).equals(strZ0)) {
                zO = C0364l0.O(C0364l0.C().a);
            } else {
                zO = true;
            }
            if (zO) {
                z = false;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (o) {
                    try {
                        if (!strZ0.equals(p) || jCurrentTimeMillis - q >= 30000) {
                            p = strZ0;
                            q = jCurrentTimeMillis;
                            z = false;
                        } else {
                            SpiderDebug.log(strM499.concat(strZ0));
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (z) {
            return com.github.catvod.spider.merge.p001b.g.d(C0076.m301(f24short, 129, 8, 2438));
        }
        String strL2 = AbstractC0302v0.L1(str);
        String strZ1 = AbstractC0302v0.Z0(str);
        boolean zEquals = C0006.m21(f24short, 137, 5, 1324).equals(strZ1);
        String strI = AbstractC0280n1.i(str, str2, null, null);
        if (C0028.m108(f24short, 142, 10, 937).equals(strL2)) {
            C0364l0 c0364l0C = C0364l0.C();
            String[] strArrSplit = str2.split(C0082.m325(f24short, 152, 4, 755));
            c0364l0C.getClass();
            try {
                if (strArrSplit.length < 6) {
                    strH0 = com.github.catvod.spider.merge.p001b.g.d(C0009.m33(f24short, 156, 9, 3221));
                } else {
                    String str3 = strArrSplit[3];
                    String str4 = strArrSplit[4];
                    try {
                        j = Long.parseLong(strArrSplit[5]);
                    } catch (Exception unused) {
                        j = 0;
                    }
                    String strP = C0377s0.u.P(j, C0017.m65(f24short, 165, 4, 1848), str4, str3);
                    com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                    gVar.C(strP);
                    gVar.n();
                    gVar.B(c0364l0C.K(strArrSplit));
                    strH0 = gVar.r();
                }
            } catch (Exception e) {
                strH0 = com.github.catvod.spider.merge.p001b.g.d(C0011.m42(f24short, 169, 12, 1503) + e.getMessage());
            }
        } else if (C0087.m346(f24short, 181, 10, 1513).equals(strL2)) {
            strH0 = C0364l0.C().i0(str2.split(C0115.m459(f24short, 191, 4, 3130)));
        } else if (C0043.m169(f24short, 195, 14, 1339).equals(strL2)) {
            C0342a0.x.getClass();
            try {
                String[] strArrSplit2 = str2 == null ? new String[0] : str2.split(C0076.m301(f24short, 209, 4, 2328));
                if (strArrSplit2.length < 2 || !C0142.m567(f24short, 213, 5, 2702).equals(strArrSplit2[0])) {
                    strH0 = com.github.catvod.spider.merge.p001b.g.d(C0089.m355(f24short, 244, 8, 2069));
                } else {
                    String str5 = strArrSplit2[1];
                    String strM516 = C0130.m516(f24short, 218, 5, 769);
                    try {
                        try {
                            strDecode = new String(Base64.decode(str5, 10), strM516);
                        } catch (Exception unused2) {
                            strDecode = "";
                        }
                    } catch (Exception unused3) {
                        strDecode = URLDecoder.decode(str5, strM516);
                    }
                    Y yA = Y.a(new JSONObject(strDecode));
                    String str6 = yA.e;
                    if (TextUtils.isEmpty(str6)) {
                        strH0 = com.github.catvod.spider.merge.p001b.g.d(C0011.m42(f24short, 223, 18, 424));
                    } else {
                        String strP2 = C0377s0.u.P(yA.g, C0130.m516(f24short, 241, 3, 1510), str6, yA.d);
                        com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
                        gVar2.C(strP2);
                        gVar2.n();
                        strH0 = gVar2.r();
                    }
                }
            } catch (Exception e2) {
                strH0 = com.github.catvod.spider.merge.p001b.g.d(C0112.m445(f24short, 252, 11, 947) + e2.getMessage());
            }
        } else if (C0050.m199(f24short, 263, 5, 682).equals(strZ1)) {
            strH0 = A0.s().b0(str, str2.split(C0028.m108(f24short, 268, 4, 772)));
        } else if (C0019.m75(f24short, 272, 2, 1633).equals(strZ1)) {
            strH0 = Z0.t().g0(str, str2.split(C0122.m486(f24short, 274, 4, 2449)));
        } else if (C0063.m249(f24short, 278, 6, 362).equals(strZ1)) {
            strH0 = Q0.f().y(str2.split(C0010.m36(f24short, 284, 4, 2593)));
        } else if (C0098.m390(f24short, 288, 6, 1573).equals(strZ1)) {
            t1 t1VarU = t1.u();
            String[] strArrSplit3 = str2.split(C0101.m402(f24short, 294, 4, 782));
            t1VarU.getClass();
            strH0 = t1.N(str, strArrSplit3);
        } else if (C0010.m36(f24short, 298, 3, 1120).equals(strZ1)) {
            strH0 = C0349e.j().L(str, str2.split(C0050.m199(f24short, 301, 2, 1152)));
        } else if (zEquals) {
            strH0 = C0376s.a.G(I0.c(AbstractC0309x1.b(str2)), str);
        } else if (C0125.m499(f24short, 303, 6, 1780).equals(strZ1)) {
            strH0 = C0377s0.u.M(str2, str);
        } else if (C0001.m1(f24short, 309, 7, 1695).equals(strZ1)) {
            strH0 = C0342a0.x.W(str2, str);
        } else if (C0107.m427(f24short, 316, 6, 2955).equals(strZ1)) {
            strH0 = l1.I().q0(str, str2.split(C0130.m516(f24short, 322, 4, 1746)));
        } else {
            if (!C0076.m301(f24short, 326, 3, 2642).equals(strZ1)) {
                return str;
            }
            strH0 = C0364l0.C().h0(str2.split(C0082.m325(f24short, 329, 4, 1457)));
        }
        if (strI == null || strH0 == null || !strH0.startsWith(C0128.m511(f24short, 333, 1, 1931))) {
            return strH0;
        }
        try {
            JSONObject jSONObject = new JSONObject(strH0);
            jSONObject.put(C0059.m234(f24short, 334, 7, 2314), strI);
            return jSONObject.toString();
        } catch (Exception unused4) {
            return strH0;
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        ArrayList arrayListG = g(list);
        if (arrayListG.size() > 1) {
            ArrayList arrayListC = c(arrayListG);
            if (arrayListC.isEmpty()) {
                return com.github.catvod.spider.merge.p001b.g.d(C0128.m511(f24short, 341, 25, 2886));
            }
            k kVar = new k();
            kVar.n("");
            kVar.l("");
            kVar.p("");
            kVar.o("");
            kVar.q(e(arrayListC, true));
            kVar.r(e(arrayListC, false));
            return f(kVar);
        }
        boolean zIsEmpty = arrayListG.isEmpty();
        String strM360 = C0091.m360(f24short, 366, 8, 1364);
        if (zIsEmpty || TextUtils.isEmpty((CharSequence) arrayListG.get(0))) {
            return com.github.catvod.spider.merge.p001b.g.d(strM360);
        }
        String strS = C0342a0.S((String) arrayListG.get(0));
        arrayListG.set(0, strS);
        if (strS.contains(C0115.m459(f24short, 374, 15, 2507))) {
            if (this.a == null) {
                this.a = new Quark();
                A0.s().m0("");
            }
            A0 a0S = A0.s();
            A0.s().getClass();
            return f(a0S.O(A0.I(strS)));
        }
        if (strS.contains(C0089.m355(f24short, 389, 14, 2378))) {
            if (this.c == null) {
                this.c = new UC();
                Z0.t().q0("");
            }
            Z0 z0T = Z0.t();
            Z0.t().getClass();
            return f(z0T.M(Z0.D(strS)));
        }
        if (strS.contains(C0117.m467(f24short, 403, 18, 2233)) || strS.contains(C0117.m467(f24short, 421, 13, 629))) {
            if (this.b == null) {
                this.b = new Ali();
                C0349e.j().j = "";
            }
            Matcher matcher = Ali.a.matcher(strS);
            return matcher.find() ? f(Ali.a(matcher, strS)) : "";
        }
        String lowerCase = strS.toLowerCase();
        if (lowerCase.contains(C0142.m567(f24short, 434, 7, 3078)) || lowerCase.contains(C0098.m390(f24short, 441, 14, 1542))) {
            if (this.e == null) {
                this.e = new YiDongYun();
            }
            return f(YiDongYun.a(arrayListG));
        }
        if (strS.contains(C0125.m499(f24short, 455, 13, 2294))) {
            if (this.f == null) {
                try {
                    this.f = new BaiDuPan();
                    C0376s.a.getClass();
                } catch (Throwable unused) {
                }
            }
            if (this.f == null) {
                return com.github.catvod.spider.merge.p001b.g.d(C0021.m83(f24short, 468, 7, 2588));
            }
            C0376s.a.getClass();
            return f(C0376s.x(com.github.catvod.spider.merge.G.g.b(strS)));
        }
        if (d(strS)) {
            if (this.g == null) {
                this.g = new Pan123();
            }
            C0377s0 c0377s0 = C0377s0.u;
            c0377s0.getClass();
            return f(c0377s0.r(C0377s0.H(strS)));
        }
        if (C0342a0.S(strS).toLowerCase().contains(C0126.m503(f24short, 475, 17, 2824))) {
            if (this.j == null) {
                this.j = new GuangYa();
            }
            C0342a0 c0342a0 = C0342a0.x;
            c0342a0.getClass();
            return f(c0342a0.D(C0342a0.U(strS)));
        }
        if (strS.contains(C0063.m249(f24short, 492, 13, 3257))) {
            if (this.d == null) {
                this.d = new TianYi();
                Q0.f().C("");
            }
            Q0 q0F = Q0.f();
            Q0.f().getClass();
            return f(q0F.r(Q0.m(strS)));
        }
        if (strS.contains(C0143.m570(f24short, 505, 17, 920))) {
            if (this.h == null) {
                this.h = new XunleiPan();
                l1.I().getClass();
            }
            l1 l1VarI = l1.I();
            l1.I().getClass();
            return f(l1VarI.V(l1.S(strS)));
        }
        String lowerCase2 = strS.toLowerCase();
        if (!lowerCase2.contains(C0011.m42(f24short, 522, 10, 348)) && !lowerCase2.contains(C0046.m182(f24short, 532, 13, 696))) {
            return com.github.catvod.spider.merge.p001b.g.d(strM360);
        }
        if (this.i == null) {
            this.i = new Pan115();
        }
        C0364l0 c0364l0C = C0364l0.C();
        C0364l0.C().getClass();
        return f(c0364l0C.N(C0364l0.J(strS)));
    }

    public static boolean d(String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase.contains(C0087.m346(f24short, 545, 10, 904)) || lowerCase.contains(C0101.m402(f24short, 555, 9, 2095)) || lowerCase.contains(C0009.m33(f24short, 564, 15, 751)) || lowerCase.contains(C0021.m83(f24short, 579, 10, 1205)) || lowerCase.contains(C0114.m454(f24short, 589, 10, 732)) || lowerCase.contains(C0082.m325(f24short, 599, 10, 1763)) || lowerCase.contains(C0006.m21(f24short, 609, 10, 549));
    }

    public static String e(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PlayGroup playGroup = (PlayGroup) it.next();
            arrayList2.add(z ? playGroup.c : playGroup.d);
        }
        return TextUtils.join(C0045.m177(f24short, 619, 3, 1622), arrayList2);
    }

    public static String f(k kVar) {
        k kVarF = AbstractC0302v0.f(kVar);
        if (kVarF != null) {
            String strC = kVarF.c();
            String strE = kVarF.e();
            if (!TextUtils.isEmpty(strC)) {
                AbstractC0280n1.p(strC);
            }
            if (!TextUtils.isEmpty(strE)) {
                AbstractC0280n1.q(strE);
            }
        }
        return com.github.catvod.spider.merge.p001b.g.s(kVarF);
    }

    public static ArrayList g(List list) {
        if (list == null) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((String) list.get(i));
        }
        return arrayList;
    }

    public final String a(List list) {
        try {
            return e(c(list), true);
        } catch (Exception unused) {
            return "";
        }
    }

    public final String b(List list) {
        try {
            return e(c(list), false);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:183:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:219:0x03ad A[SYNTHETIC] */
    public final ArrayList c(List list) {
        String strM186;
        String strM116;
        String strM471;
        String strM355;
        String strM33;
        String strM529;
        String strM386;
        String strM379;
        String strM10;
        String str;
        String strM3710;
        String strDetailContentVodPlayFrom;
        ArrayList arrayList;
        CloudTask cloudTask;
        ArrayList arrayListG = g(list);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayListG.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append('\n');
        }
        sb.append('|');
        for (int i : (int[]) C0299u0.U.clone()) {
            sb.append(i);
            sb.append(',');
        }
        sb.append('|');
        for (int i2 : C0299u0.a0) {
            sb.append(i2);
            sb.append(',');
        }
        sb.append('|');
        boolean[] zArr = C0299u0.b0;
        int i3 = 0;
        while (true) {
            char c = '0';
            if (i3 >= zArr.length) {
                break;
            }
            if (zArr[i3]) {
                c = '1';
            }
            sb.append(c);
            i3++;
        }
        sb.append('|');
        for (boolean z : C0299u0.V) {
            sb.append(z ? '1' : '0');
        }
        String string = sb.toString();
        synchronized (this.k) {
            try {
                if (string.equals(this.l) && System.currentTimeMillis() - this.n < 5000) {
                    return new ArrayList(this.m);
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i4 = 0;
                while (true) {
                    int size = arrayListG.size();
                    strM186 = C0047.m186(f24short, 622, 3, 3096);
                    strM116 = C0030.m116(f24short, 625, 6, 2497);
                    strM471 = C0118.m471(f24short, 631, 7, 844);
                    strM355 = C0089.m355(f24short, 638, 6, 1076);
                    strM33 = C0009.m33(f24short, 644, 5, 3133);
                    strM529 = C0133.m529(f24short, 649, 6, 1438);
                    strM386 = C0097.m386(f24short, 655, 6, 996);
                    strM379 = C0095.m379(f24short, 661, 3, 2582);
                    strM10 = C0003.m10(f24short, 664, 5, 1525);
                    str = string;
                    strM3710 = C0095.m379(f24short, 669, 2, 1204);
                    if (i4 >= size) {
                        break;
                    }
                    String str2 = (String) arrayListG.get(i4);
                    i4++;
                    if (TextUtils.isEmpty(str2)) {
                        arrayList = arrayListG;
                    } else {
                        arrayList = arrayListG;
                        if (str2.contains(C0001.m1(f24short, 671, 14, 632)) && this.c != null && C0299u0.e0(strM3710)) {
                            cloudTask = new CloudTask(strM3710, i4, new CallableC0363l(str2, 1));
                        } else if (str2.contains(C0082.m325(f24short, 685, 15, 528)) && this.a != null && C0299u0.e0(strM10)) {
                            cloudTask = new CloudTask(strM10, i4, new CallableC0363l(str2, 2));
                        } else if ((str2.contains(C0105.m416(f24short, 700, 18, 2809)) || str2.contains(C0045.m177(f24short, 718, 13, 926))) && this.b != null && C0299u0.e0(strM379) && C0349e.j().A()) {
                            cloudTask = new CloudTask(strM379, i4, new CallableC0363l(str2, 3));
                        } else if (str2.contains(C0101.m402(f24short, 731, 13, 2563)) && this.d != null && C0299u0.e0(strM386)) {
                            cloudTask = new CloudTask(strM386, i4, new CallableC0363l(str2, 4));
                        } else {
                            String lowerCase = str2.toLowerCase();
                            if ((lowerCase.contains(C0118.m471(f24short, 744, 7, 1375)) || lowerCase.contains(C0087.m346(f24short, 751, 14, 1448))) && this.e != null && C0299u0.e0(strM529)) {
                                cloudTask = new CloudTask(strM529, i4, new CallableC0363l(str2, 5));
                            } else if (str2.contains(C0021.m83(f24short, 765, 13, 2967)) && this.f != null && C0299u0.e0(strM33)) {
                                cloudTask = new CloudTask(strM33, i4, new CallableC0363l(str2, 6));
                            } else if (d(str2) && this.g != null && C0299u0.e0(strM355)) {
                                cloudTask = new CloudTask(strM355, i4, new CallableC0363l(str2, 7));
                            } else if (C0342a0.S(str2).toLowerCase().contains(C0128.m511(f24short, 778, 17, 2015)) && this.j != null && C0299u0.e0(strM471)) {
                                cloudTask = new CloudTask(strM471, i4, new CallableC0363l(str2, 8));
                            } else if (str2.contains(C0049.m193(f24short, 795, 17, 2252)) && this.h != null && C0299u0.e0(strM116)) {
                                cloudTask = new CloudTask(strM116, i4, new CallableC0363l(str2, 9));
                            } else {
                                String lowerCase2 = str2.toLowerCase();
                                if ((lowerCase2.contains(C0072.m285(f24short, 812, 10, 630)) || lowerCase2.contains(C0103.m408(f24short, 822, 13, 2027))) && this.i != null && C0299u0.e0(strM186)) {
                                    cloudTask = new CloudTask(strM186, i4, new CallableC0363l(str2, 10));
                                }
                            }
                        }
                        if (cloudTask == null) {
                            arrayList2.add(cloudTask);
                            arrayList3.add(cloudTask.c);
                        }
                        string = str;
                        arrayListG = arrayList;
                    }
                    cloudTask = null;
                    if (cloudTask == null) {
                        arrayList2.add(cloudTask);
                        arrayList3.add(cloudTask.c);
                    }
                    string = str;
                    arrayListG = arrayList;
                }
                ArrayList arrayListA = AbstractC0260h.a(arrayList3, 30);
                ArrayList arrayList4 = new ArrayList();
                int i5 = 0;
                while (i5 < arrayList2.size() && i5 < arrayListA.size()) {
                    CloudTask cloudTask2 = (CloudTask) arrayList2.get(i5);
                    ArrayList arrayList5 = arrayListA;
                    String str3 = (String) arrayListA.get(i5);
                    if (TextUtils.isEmpty(str3)) {
                        strM10 = strM10;
                    } else {
                        String[] strArrSplit = TextUtils.isEmpty(str3) ? new String[0] : str3.split(C0137.m545(f24short, 835, 6, 2323), -1);
                        String str4 = cloudTask2.a;
                        boolean zEquals = strM3710.equals(str4);
                        int i6 = cloudTask2.b;
                        if (zEquals) {
                            strDetailContentVodPlayFrom = UC.detailContentVodPlayFrom(i6);
                        } else if (strM10.equals(str4)) {
                            strDetailContentVodPlayFrom = Quark.detailContentVodPlayFrom(i6);
                        } else if (strM379.equals(str4)) {
                            strDetailContentVodPlayFrom = Ali.detailContentVodPlayFrom(i6);
                        } else if (strM386.equals(str4)) {
                            strDetailContentVodPlayFrom = TianYi.detailContentVodPlayFrom(i6);
                        } else if (strM529.equals(str4)) {
                            strDetailContentVodPlayFrom = YiDongYun.detailContentVodPlayFrom(i6);
                        } else if (strM33.equals(str4)) {
                            strDetailContentVodPlayFrom = BaiDuPan.detailContentVodPlayFrom(i6);
                        } else if (strM355.equals(str4)) {
                            strDetailContentVodPlayFrom = Pan123.detailContentVodPlayFrom(i6);
                        } else if (strM471.equals(str4)) {
                            strDetailContentVodPlayFrom = GuangYa.detailContentVodPlayFrom(i6);
                        } else if (strM116.equals(str4)) {
                            strDetailContentVodPlayFrom = XunleiPan.detailContentVodPlayFrom(i6);
                        } else {
                            strDetailContentVodPlayFrom = strM186.equals(str4) ? Pan115.detailContentVodPlayFrom(i6) : "";
                        }
                        String[] strArrSplit2 = TextUtils.isEmpty(strDetailContentVodPlayFrom) ? new String[0] : strDetailContentVodPlayFrom.split(C0125.m499(f24short, 841, 6, 2047), -1);
                        int iMin = Math.min(strArrSplit2.length, strArrSplit.length);
                        int i7 = 0;
                        while (i7 < iMin) {
                            if (!TextUtils.isEmpty(strArrSplit2[i7]) && !TextUtils.isEmpty(strArrSplit[i7])) {
                                String strL1 = AbstractC0302v0.L1(strArrSplit2[i7]);
                                if (TextUtils.isEmpty(strL1) || C0299u0.g0(strL1)) {
                                    arrayList4.add(new PlayGroup(cloudTask2.a, strL1, strArrSplit2[i7], strArrSplit[i7], (i6 * 100) + i7));
                                }
                            }
                            i7++;
                            iMin = iMin;
                            strArrSplit = strArrSplit;
                        }
                    }
                    i5++;
                    arrayListA = arrayList5;
                    arrayList2 = arrayList2;
                    strM3710 = strM3710;
                    strM10 = strM10;
                }
                Collections.sort(arrayList4, new Comparator<PlayGroup>() { // from class: com.github.catvod.spider.Cloud.1
                    @Override // java.util.Comparator
                    public int compare(PlayGroup playGroup, PlayGroup playGroup2) {
                        return AbstractC0302v0.w(playGroup.a, playGroup.b, playGroup2.a, playGroup2.b, playGroup.e, playGroup2.e);
                    }
                });
                synchronized (this.k) {
                    this.l = str;
                    this.m = new ArrayList(arrayList4);
                    this.n = System.currentTimeMillis();
                }
                return arrayList4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0139.m554(f24short, 847, 13, 686));
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

    public void init(Context context, String str) {
        String strM445 = C0112.m445(f24short, 860, 12, 2939);
        String strM529 = C0133.m529(f24short, 872, 5, 3211);
        String strM486 = C0122.m486(f24short, 877, 8, 957);
        String strM36 = C0010.m36(f24short, 885, 6, 2522);
        Init.init(context);
        JsonObject jsonObjectC = I0.c(str);
        try {
            this.a = new Quark();
            A0.s().m0(jsonObjectC.has(strM36) ? jsonObjectC.get(strM36).getAsString() : "");
        } catch (Throwable unused) {
        }
        try {
            this.c = new UC();
            Z0.t().q0(jsonObjectC.has(strM486) ? jsonObjectC.get(strM486).getAsString() : "");
        } catch (Throwable unused2) {
        }
        try {
            this.b = new Ali();
            C0349e.j().j = jsonObjectC.has(strM529) ? jsonObjectC.get(strM529).getAsString() : "";
        } catch (Throwable unused3) {
        }
        try {
            this.d = new TianYi();
            Q0.f().C(jsonObjectC.has(strM445) ? jsonObjectC.get(strM445).getAsString() : "");
        } catch (Throwable unused4) {
        }
        try {
            this.e = new YiDongYun();
        } catch (Throwable unused5) {
        }
        try {
            this.f = new BaiDuPan();
            C0376s.a.getClass();
        } catch (Throwable unused6) {
        }
        try {
            this.g = new Pan123();
        } catch (Throwable unused7) {
        }
        try {
            this.h = new XunleiPan();
            l1.I().getClass();
        } catch (Throwable unused8) {
        }
        try {
            this.i = new Pan115();
        } catch (Throwable unused9) {
        }
        try {
            this.j = new GuangYa();
        } catch (Throwable unused10) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0003.m10(f24short, 891, 13, 1814));
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

package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class DianYingYunJi extends Cloud {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f28short = {798, 1295, 1299, 1299, 1303, 1300, 1373, 1352, 1352, 1283, 1310, 1310, 1293, 1297, 1353, 1284, 1288, 1290, 1352, 1284, 1286, 1299, 1282, 1280, 1288, 1301, 1310, 1352, 1283, 1294, 1286, 1289, 1310, 1294, 1289, 1280, 29089, 23525, 1391, 1395, 1395, 1399, 1396, 1341, 1320, 1320, 1379, 1406, 1406, 1389, 1393, 1321, 1380, 1384, 1386, 1320, 1380, 1382, 1395, 1378, 1376, 1384, 1397, 1406, 1320, 1314, 1378, 1330, 1314, 1343, 1342, 1314, 1382, 1328, 1314, 1378, 1342, 1314, 1342, 1381, 1314, 1343, 1329, 21391, -26834, 908, 912, 912, 916, 919, 990, 971, 971, 896, 925, 925, 910, 914, 970, 903, 907, 905, 971, 903, 901, 912, 897, 899, 907, 918, 925, 971, 961, 897, 979, 961, 989, 898, 961, 901, 896, 961, 897, 977, 961, 988, 989, 961, 901, 979, 29060, 21518, 2943, 2915, 2915, 2919, 2916, 2861, 2872, 2872, 2931, 2926, 2926, 2941, 2913, 2873, 2932, 2936, 2938, 2872, 2932, 2934, 2915, 2930, 2928, 2936, 2917, 2926, 2872, 2931, 2936, 2937, 2928, 2938, 2934, 2937, 21669, 26918, 1506, 1534, 1534, 1530, 1529, 1456, 1445, 1445, 1518, 1523, 1523, 1504, 1532, 1444, 1513, 1509, 1511, 1445, 1513, 1515, 1534, 1519, 1517, 1509, 1528, 1523, 1445, 1520, 1509, 1508, 1517, 1523, 1507, 31059, -31275, 2814, 2786, 2786, 2790, 2789, 2732, 2745, 2745, 2802, 2799, 2799, 2812, 2784, 2744, 2805, 2809, 2811, 2745, 2805, 2807, 2786, 2803, 2801, 2809, 2788, 2799, 2745, 2739, 2803, 2734, 2739, 2807, 2800, 2739, 2804, 2804, 2739, 2803, 2721, 2739, 2734, 2735, 2739, 2807, 2735, -29292, 29702, 1813, 1801, 1801, 1805, 1806, 1863, 1874, 1874, 1817, 1796, 1796, 1815, 1803, 1875, 1822, 1810, 1808, 1874, 1822, 1820, 1801, 1816, 1818, 1810, 1807, 1796, 1874, 1880, 1816, 1860, 1880, 1860, 1819, 1880, 1823, 1870, 1880, 1816, 1860, 1880, 1820, 1871, 1880, 1860, 1868, -27408, -25710, 1260, 1264, 1264, 1268, 1271, 1214, 1195, 1195, 1248, 1277, 1277, 1262, 1266, 1194, 1255, 1259, 1257, 1195, 1255, 1253, 1264, 1249, 1251, 1259, 1270, 1277, 1195, 1276, 1265, 1249, 1276, 1261, 22558, 19736, 2341, 2361, 2361, 2365, 2366, 2423, 2402, 2402, 2345, 2356, 2356, 2343, 2363, 2403, 2350, 2338, 2336, 3005, 3044, 983, 964, 962, 991, 981, 986, 979, 918, 991, 987, 977, 1703, 1702, 1719, 1322, 1327, 1338, 1327, 1379, 1341, 1340, 1325, 2467, 2480, 2486, 2475, 2465, 2478, 2471, 21317, 26541, 2274, -2141, 2179, 2277, 2250, 2276, 2194, 2193, 2199, 2195, 2182, 2192, 2193, 2182, 2179, 2277, 2250, 2194, 30639, 23262, 2245, 2277, 2250, 2194, 18050, 26541, 2245, 2277, 2250, 2194, 29890, 24370, 2245, 2205, 2192, 20340, 28251, 276, -427, 373, 275, 316, 274, 356, 359, 353, 357, 368, 358, 359, 368, 373, 275, 316, 356, 32052, 22212, 307, 275, 316, 356, 21369, 29448, 307, 363, 358, 572, 555, 558, 20514, 28755, 21737, 22946, 571, 21796, 20782, 616, 21796, 20782, 573, 591, -754, 558, 584, 615, 585, 575, 572, 570, 574, 555, 573, 572, 555, 558, 584, 615, 575, -30215, -30700, 616, 560, 573, 1324, 1339, 1342, -25454, 25001, 1400, 19214, 25380, 24801, 25115, 1325, 1375, -1506, 1342, 1368, 1399, 1369, 1327, 1324, 1322, 1326, 1339, 1325, 1324, 1339, 1342, 1368, 1399, 1327, 30531, -28549, 1400, 1368, 1324, 1400, 1312, 1325, 21614, 26316, 32137, 18626, 1569, 1575, 1571, 1568, 472, 482, 465, 459, 476, 479, 403, 388, 414, 406, 474, 472, 461, 476, 478, 470, 459, 448, 406, 414, 484, 1588, 1575, 1569, 1596, 1590, 1593, 1584, 1653, 1588, 1550, 1597, 1575, 1584, 1587, 1544, 1162, 1168, 1159, 1156, 2475, 2490, 2485, 2549, 2474, 2478, 2490, 2473, 2480, 2549, 2488, 2485, 1750, 1686, 1674, 1674, 1678, 1677, 1732, 1698, 1745, 1698, 1745, 1678, 1695, 1680, 1698, 1744, 1679, 1675, 1695, 1676, 1685, 1698, 1744, 1693, 1680, 1698, 1745, 1677, 1698, 1745, 1701, 1696, 1756, 1699, 1749, 1751, 2382, 2371, 2374, 2390, 2394, 2369, 2379, 2397, 2374, 2393, 2378, 2305, 2380, 2368, 2370, 2413, 2400, 2405, 2428, 2413, 2402, 2338, 2415, 2403, 2401, 1603, 1621, 1614, 1617, 1602, 1545, 1618, 1604, 1545, 1604, 1609, 999, 1014, 1017, 953, 1013, 1014, 1022, 1011, 994, 953, 1012, 1016, 1018, 1189, 1204, 1211, 1275, 1197, 1184, 1211, 1209, 1200, 1212, 1275, 1206, 1210, 1208, 2887, 2884, 2885, 2822, 2839, 2840, 2904, 2837, 2841, 2843, 2909, 2910, 2911, 2844, 2829, 2818, 2882, 2831, 2818, 1940, 1935, 1926, 1941, 1922, 1993, 2006, 2005, 2004, 1943, 1926, 1929, 1993, 1924, 1929, 700, 703, 702, 699, 693, 697, 675, 750, 738, 736, 3148, 3151, 3150, 3141, 3147, 3144, 3155, 3102, 3090, 3088, 2352, 2355, 2354, 2360, 2352, 2355, 2351, 2402, 2414, 2412, 2368, 2371, 2370, 2372, 2376, 2371, 2399, 2322, 2334, 2332, 1237, 1237, 1233, 1226, 1159, 1163, 1161, 1227, 1175, 1227, 945, 945, 949, 995, 996, 1006, 942, 995, 1007, 1005, 943, 1011, 943, 2093, 2907, 2820, 2837, 2835, 2833, 2907, 488, 462, 472, 463, 400, 508, 474, 472, 467, 457, 2017, 1987, 2006, 1989, 1984, 1984, 1997, 1923, 1945, 1922, 1948, 1932, 1924, 2043, 1989, 1986, 1992, 1987, 2011, 2015, 1932, 2018, 2040, 1932, 1949, 1948, 1922, 1948, 1943, 1932, 2043, 1989, 1986, 1946, 1944, 1943, 1932, 2004, 1946, 1944, 1925, 1932, 2029, 2012, 2012, 1984, 1993, 2043, 1993, 1998, 2023, 1989, 2008, 1923, 1945, 1951, 1947, 1922, 1951, 1946, 1932, 1924, 2023, 2020, 2040, 2017, 2016, 1920, 1932, 1984, 1989, 1991, 1993, 1932, 2027, 1993, 1999, 1991, 1987, 1925, 1932, 2031, 1988, 2014, 1987, 1985, 1993, 1923, 1949, 1950, 1950, 1922, 1948, 1922, 1948, 1922, 1948, 1932, 2047, 1997, 1994, 1997, 2014, 1989, 1923, 1945, 1951, 1947, 1922, 1951, 1946, 1324, 1307, 1304, 1307, 1292, 1307, 1292, 665, 645, 645, 641, 642, 715, 734, 734, 661, 648, 648, 667, 647, 735, 658, 670, 668, 1813, 1798, 1792, 1821, 1815, 1816, 1809, 2583, 2637, 2655, 2590, 2314, 2320, 2311, 2308, 664, 674, 669, 664, 653, 664, 724, 667, 670, 676, 1936, 1941, 1920, 1941, 2009, 1942, 1939, 775, 771, 777, 1433, 1432, 1417, 1423, 1418, 1439, 1418, 1478, 1432, 1433, 1416, 402, 398, 398, 394, 1396, 1384, 1384, 1388, 1391, 1318, 1331, 1331, 1400, 1381, 1381, 1398, 1386, 1330, 1407, 1395, 1393, 1251, 1241, 1258, 1264, 
    1255, 1252, 1192, 1215, 1189, 1197, 1249, 1251, 1270, 1255, 1253, 1261, 1264, 1275, 1197, 1189, 1247, 2645, 2632, 2636, 2628, 2990, 2991, 3005, 3030, 3011, 1308, 1280, 1280, 1284, 1287, 1358, 1371, 1371, 1296, 1293, 1293, 1310, 1282, 1370, 1303, 1307, 1305, 1371, 1284, 1301, 1299, 1297, 1371, 580, 600, 600, 604, 607, 534, 515, 515, 584, 597, 597, 582, 602, 514, 591, 579, 577, 515, 531, 607, 529, 3252, 3089, 3073, 3149, 3075, 2818, 2816, 2837, 2820, 2822, 2830, 2835, 2840, 2850, 2830, 2831, 2837, 2820, 2831, 2837, 2522, 2523, 2506, 2527, 2519, 2514, 2557, 2513, 2512, 2506, 2523, 2512, 2506, 2923, 2924, 2926, 2918, 2880, 2924, 2925, 2935, 2918, 2925, 2935, 988, 970, 974, 989, 972, 967, 1004, 960, 961, 987, 970, 961, 987, 897, 919, 915, 896, 913, 922, 945, 925, 924, 902, 919, 924, 902};

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return k(str, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("https://dyyjv.com/category/dianying", "电影", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("https://dyyjv.com/category/%e5%89%a7%e9%9b%86", "剧集", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("https://dyyjv.com/category/%e7%9f%ad%e5%89%a7", "短剧", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("https://dyyjv.com/category/dongman", "动漫", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("https://dyyjv.com/category/zongyi", "综艺", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("https://dyyjv.com/category/%e8%af%bb%e7%89%a9", "读物", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("https://dyyjv.com/category/%e9%9f%b3%e9%a2%91", "音频", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("https://dyyjv.com/category/xuexi", "学习", null));
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, j(X1.L(X1.X("https://dyyjv.com", null, h()), "")));
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return k(str, str2);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(str, null, h()), "");
        k kVarA = AbstractC0449a.a(str);
        com.github.catvod.spider.merge.f0.k kVarR = gVarL.R("h1");
        kVarA.o(kVarR != null ? kVarR.T() : "");
        com.github.catvod.spider.merge.f0.k kVarR2 = gVarL.R("article img");
        if (kVarR2 != null) {
            String strC = kVarR2.c("src");
            if (strC.isEmpty()) {
                strC = kVarR2.c("data-src");
            }
            kVarA.p(strC);
        }
        com.github.catvod.spider.merge.f0.k kVarR3 = gVarL.R("article");
        String strT = kVarR3 != null ? kVarR3.T() : "";
        kVarA.m(i(strT, Pattern.compile("导演[：:\\s]+(.*?)(?:\\s+编剧|\\s+主演|\\s+类型|$)")));
        kVarA.j(i(strT, Pattern.compile("主演[：:\\s]+(.*?)(?:\\s+类型|\\s+制片|$)")));
        kVarA.k(i(strT, Pattern.compile("(?:制片国家/地区|地区)[：:\\s]+(.*?)(?:\\s+语言|$)")));
        kVarA.u(i(strT, Pattern.compile("(?:首播|上映日期)[：:\\s]+(.*?)(?:\\s+片长|\\(|$)")));
        String strI = i(strT, Pattern.compile("剧情简介(.*)"));
        if (strI.length() > 500) {
            strI = strI.substring(0, 500);
        }
        kVarA.l(strI);
        com.github.catvod.spider.merge.f0.k kVarR4 = gVarL.R("a[href*='/category/']");
        kVarA.i(kVarR4 != null ? kVarR4.T() : "");
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = gVarL.Q("article a[href]").iterator();
        while (it.hasNext()) {
            String strC2 = ((com.github.catvod.spider.merge.f0.k) it.next()).c("href");
            if (strC2.contains("pan.quark.cn") || strC2.matches("(https:\\/\\/pan\\.quark\\.cn\\/s\\/[^\"]+)")) {
                if (!arrayList.contains(strC2)) {
                    arrayList.add(strC2);
                }
            } else if (strC2.contains("aliyundrive.com") || strC2.contains("alipan.com")) {
                if (!arrayList.contains(strC2)) {
                    arrayList.add(strC2);
                }
            } else if (strC2.contains("drive.uc.cn")) {
                if (!arrayList.contains(strC2)) {
                    arrayList.add(strC2);
                }
            } else if (strC2.contains("pan.baidu.com")) {
                if (!arrayList.contains(strC2)) {
                    arrayList.add(strC2);
                }
            } else if (!strC2.contains("pan.xunlei.com")) {
                String lowerCase = strC2.toLowerCase();
                if (lowerCase.contains("123pan.com") || lowerCase.contains("123pan.cn") || lowerCase.contains("share.123pan.cn") || lowerCase.contains("123684.com") || lowerCase.contains("123865.com") || lowerCase.contains("123912.com") || lowerCase.contains("123592.com")) {
                    if (!arrayList.contains(strC2)) {
                        arrayList.add(strC2);
                    }
                } else if (strC2.contains("115.com/s/") || strC2.contains("115cdn.com/s/")) {
                    if (!arrayList.contains(strC2)) {
                        arrayList.add(strC2);
                    }
                }
            } else if (!arrayList.contains(strC2)) {
                arrayList.add(strC2);
            }
        }
        String strB = b(arrayList);
        kVarA.r(strB);
        kVarA.q(a(arrayList));
        if (kVarR != null) {
            AbstractC0280n1.p(kVarR.T());
        }
        AbstractC0280n1.q(strB);
        boolean z = FishCrypto.a;
        N1.d(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String strC = str;
        if (!"1".equals(str2)) {
            strC = com.github.catvod.spider.merge.D.b.C(strC, "/page/", str2);
        }
        ArrayList arrayListJ = j(X1.L(X1.X(strC, null, h()), ""));
        int i = (Integer.parseInt(str2) + 1) * 20;
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayListJ);
        gVarC.o(Integer.parseInt(str2), Integer.parseInt(str2) + 1, 20, i);
        return gVarC.r();
    }

    public static HashMap h() {
        return com.github.catvod.spider.merge.D.b.t("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36", "Referer", "https://dyyjv.com");
    }

    public static String i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String strTrim = matcher.group(1).trim();
        return strTrim.length() > 200 ? strTrim.substring(0, 200) : strTrim;
    }

    public static ArrayList j(com.github.catvod.spider.merge.f0.g gVar) {
        com.github.catvod.spider.merge.f0.k kVarR;
        ArrayList arrayList = new ArrayList();
        for (com.github.catvod.spider.merge.f0.k kVar : gVar.Q("article")) {
            try {
                com.github.catvod.spider.merge.f0.k kVarR2 = kVar.R("h2 a");
                if (kVarR2 != null) {
                    String strC = kVarR2.c("href");
                    String strT = kVarR2.T();
                    if (!strC.isEmpty() && !strT.isEmpty()) {
                        com.github.catvod.spider.merge.f0.k kVarR3 = kVar.R("a[data-bg]");
                        String strC2 = kVarR3 != null ? kVarR3.c("data-bg") : "";
                        if (strC2.isEmpty() && (kVarR = kVar.R("img")) != null) {
                            strC2 = kVarR.c("src");
                            if (strC2.isEmpty()) {
                                strC2 = kVarR.c("data-src");
                            }
                        }
                        if (!strC2.isEmpty() && !strC2.startsWith("http")) {
                            strC2 = "https://dyyjv.com" + strC2;
                        }
                        com.github.catvod.spider.merge.f0.k kVarR4 = kVar.R("a[href*='/category/']");
                        String strT2 = kVarR4 != null ? kVarR4.T() : "";
                        com.github.catvod.spider.merge.f0.k kVarR5 = kVar.R("time");
                        if (kVarR5 != null && strT2.isEmpty()) {
                            strT2 = kVarR5.T();
                        }
                        arrayList.add(new k(strC, strT, strC2, strT2));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static String k(String str, String str2) {
        String strM1 = "UTF-8";
        String strM31 = "https://dyyjv.com/page/";
        try {
            String str3 = "https://dyyjv.com/?s=" + URLEncoder.encode(str, strM1);
            if (!"1".equals(str2)) {
                str3 = strM31 + str2 + "/?s=" + URLEncoder.encode(str, strM1);
            }
            return com.github.catvod.spider.merge.p001b.g.y(j(X1.L(X1.X(str3, null, h()), "")));
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.D.b.d();
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

    @Override // com.github.catvod.spider.Cloud
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

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        super.init(context, str);
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

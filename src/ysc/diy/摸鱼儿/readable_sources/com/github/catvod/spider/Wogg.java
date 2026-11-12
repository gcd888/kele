package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0260h;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0257g;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p014q.C0112;
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
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Wogg extends Cloud {
    public C0257g r;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f106short = {425, 1009, 946, 944, 955, 938, 947, 954, 1010, 950, 939, 954, 946, 2348, 2707, 2763, 2772, 2777, 2776, 2770, 2704, 2772, 2771, 2779, 2770, 2704, 2773, 2776, 2780, 2777, 2776, 2767, 2717, 2691, 2717, 2707, 2765, 2780, 2778, 2776, 2704, 2761, 2772, 2761, 2769, 2776, 381, 318, 316, 311, 294, 319, 310, 382, 314, 295, 310, 318, 382, 291, 314, 304, 371, 314, 318, 308, 1412, 1500, 1475, 1486, 1487, 1477, 1415, 1475, 1476, 1484, 1477, 1415, 1474, 1487, 1483, 1486, 1487, 1496, 1418, 1483, 1412, 1502, 1483, 1485, 1415, 1478, 1475, 1476, 1473, 902, 899, 918, 899, 975, 913, 912, 897, 2686, 2598, 2617, 2612, 2613, 2623, 2685, 2617, 2622, 2614, 2623, 2685, 2616, 2613, 2609, 2612, 2613, 2594, 2672, 2612, 2617, 2598, 2686, 2596, 2609, 2615, 2685, 2620, 2617, 2622, 2619, 2672, 2609, 1657, 1682, 1745, 1747, 1752, 1737, 1744, 1753, 1681, 1742, 1747, 1739, 1681, 1736, 1753, 1732, 1736, 2494, 2528, 2493, 2495, 2468, 2468, 2449, 2479, 21226, 26114, 16997, 25418, 22326, 18337, 20539, 26068, 628, 630, 611, 626, 606, 627, 1060, 1079, 1056, 1060, 1618, 1614, 1610, 1625, 644, 671, 1280, 1295, 1282, 1296, 1296, 3265, 3288, 3283, 3268, 3295, 3288, 3264, 3224, 2131, 1378, 1378, 1378, 1378, 1378, 1107, 1107, 1107, 2411, 2349, 2353, 2344, 2345, 338, 273, 275, 280, 265, 272, 281, 337, 277, 264, 281, 273, 889, 1570, 1992, 1992, 1064, 2781, 1391, 665, -28085, 19432, 29423, 22373, -31904, 24050, -29859, -29870, 29238, 20969, 29866, 24302, 31643, 22596, 23125, -24844, 23461, 26150, 30815, -31527, 2608, 2664, 2679, 2682, 2683, 2673, 2611, 2679, 2672, 2680, 2673, 2611, 2679, 2666, 2683, 2675, 1831, 3099, 3164, 3166, 3147, 3162, 3160, 3152, 3149, 3142, 3196, 3152, 3153, 3147, 3162, 3153, 3147, 3134, 3135, 3118, 3131, 3123, 3126, 3097, 3125, 3124, 3118, 3135, 3124, 3118, 502, 490, 490, 494, 1761, 1770, 1776, 1767, 1764, 1771, 1710, 1702, 1675, 1679, 1674, 1675, 1692, 1693, 1747, 1969, 1943, 1921, 1942, 1993, 1957, 1923, 1921, 1930, 1936, 992, 962, 983, 964, 961, 961, 972, 898, 920, 899, 925, 909, 901, 993, 964, 963, 984, 981, 918, 909, 1004, 963, 969, 991, 962, 964, 969, 909, 924, 926, 918, 909, 1019, 927, 925, 921, 916, 1004, 909, 1007, 984, 964, 961, 969, 898, 1017, 1021, 924, 1004, 899, 927, 927, 925, 923, 927, 921, 899, 925, 924, 921, 918, 909, 986, 987, 900, 909, 1004, 989, 989, 961, 968, 1018, 968, 975, 998, 964, 985, 898, 920, 926, 922, 899, 926, 923, 909, 901, 998, 997, 1017, 992, 993, 897, 909, 961, 964, 966, 968, 909, 1002, 968, 974, 966, 962, 900, 909, 1019, 968, 991, 990, 964, 962, 963, 898, 921, 899, 925, 909, 1006, 965, 991, 962, 960, 968, 898, 924, 924, 923, 899, 925, 899, 925, 899, 925, 909, 992, 962, 975, 964, 961, 968, 909, 1022, 972, 971, 972, 991, 964, 898, 920, 926, 922, 899, 926, 923, 2940, 2891, 2888, 2891, 2908, 2891, 2908, 2181, 2201, 2201, 2205, 2206, 2263, 2242, 2242, 2202, 2202, 2202, 2243, 2185, 2178, 2200, 2191, 2188, 2179, 2243, 2190, 2178, 2176, 3231, 3131, 3132, 3134, 3126, 3088, 3132, 3133, 3111, 3126, 3133, 3111, 2054, 2080, 2102, 2081, 2174, 2066, 2100, 2102, 2109, 2087, 2150, 2116, 2129, 2114, 2119, 2119, 2122, 2052, 2078, 2053, 2075, 2059, 2051, 2172, 2114, 2117, 2127, 2116, 2140, 2136, 2059, 2149, 2175, 2059, 2074, 2075, 2053, 2075, 2064, 2059, 2172, 2114, 2117, 2077, 2079, 2064, 2059, 2131, 2077, 2079, 2050, 2059, 2154, 2139, 2139, 2119, 2126, 2172, 2126, 2121, 2144, 2114, 2143, 2052, 2078, 2072, 2076, 2053, 2072, 2077, 2059, 2051, 2144, 2147, 2175, 2150, 2151, 2055, 2059, 2119, 2114, 2112, 2126, 2059, 2156, 2126, 2120, 2112, 2116, 2050, 2059, 2152, 2115, 2137, 2116, 2118, 2126, 2052, 2074, 2073, 2073, 2053, 2075, 2053, 2075, 2053, 2075, 2059, 2168, 2122, 2125, 2122, 2137, 2114, 2052, 2078, 2072, 2076, 2053, 2072, 2077, 1651, 1604, 1607, 1604, 1619, 1604, 1619, 825, 803, 830, 815, 2596, 2620, 2612, 2612, 2572, 2592, 2618, 2599, 2614, 2572, 2598, 2593, 2623, 614, 634, 634, 638, 637, 564, 545, 545, 633, 609, 617, 617, 544, 630, 630, 609, 609, 609, 544, 621, 616, 2440, 2507, 2505, 2498, 2515, 2506, 2499, 2443, 2511, 2514, 2499, 2507, 2443, 2514, 2511, 2514, 2506, 2499, 2500, 2505, 2526, 2438, 2456, 2503, 1436, 1414, 1425, 1426, 1029, 1048, 1029, 1053, 1044, -32007, 23659, 827, 888, 890, 881, 864, 889, 880, 824, 892, 865, 880, 888, 824, 869, 892, 886, 821, 892, 888, 882, 2128, 2133, 2112, 2133, 2073, 2119, 2118, 2135, 2110, 2173, 2175, 2164, 2149, 2172, 2165, 2109, 2169, 2148, 2165, 2173, 2109, 2148, 2165, 2152, 2148, 2456, 2463, 2453, 2452, 2441, 2527, 2433, 2457, 2433, 2526, 2439, 2462, 2453, 2434, 2452, 2448, 2435, 2450, 2457, 2526, 1743, 1743, 1743, 1743, 1743, 1743, 1743, 1743, 1743, 1743, 850, 850, 850, 849, 791, 779, 786, 787, 2693, 2758, 2756, 2767, 2782, 2759, 2766, 2694, 2776, 2766, 2762, 2777, 2760, 2755, 2694, 2754, 2783, 2766, 2758, 2783, 2695, 2712, 2709, 2708, 2718, 2780, 2690, 2708, 2691, 2712, 2704, 2717, 2850, 2872, 2863, 2860, 1508, 1529, 1508, 1532, 1525, 1152, 1219, 1217, 1226, 1243, 1218, 1227, 1155, 1223, 1242, 1227, 1219, 1155, 1246, 1223, 1229, 1166, 1168, 1166, 1223, 1219, 1225, 392, 397, 408, 397, 449, 415, 414, 399, 1721, 1761, 1790, 1779, 1778, 1784, 1722, 1790, 1785, 1777, 1784, 1722, 1791, 1778, 1782, 1779, 1778, 1765, 1719, 1782, 1721, 1761, 1790, 1779, 1778, 1784, 1722, 1764, 1778, 1765, 1790, 1782, 1787, 2453, 2435, 2439, 2452, 2437, 2446, 2469, 2441, 2440, 2450, 2435, 2440, 2450, 268, 282, 286, 269, 284, 279, 316, 272, 273, 267, 282, 273, 267};
    public static final String[] s = {"44", "1", "2", "3", "4", "5", "6"};
    public static final String[] t = {"臻彩视觉", "玩偶电影", "玩偶剧集", "动漫", "综艺", "音乐", "短剧"};

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return l(str, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= 7) {
                break;
            }
            arrayList.add(new com.github.catvod.spider.merge.p001b.b(s[i], t[i], null));
            i++;
        }
        com.github.catvod.spider.merge.h0.d dVarQ = X1.L(this.r.a("", i()), "").Q(".module-item");
        return com.github.catvod.spider.merge.p001b.g.u(arrayList, k(new com.github.catvod.spider.merge.h0.d(dVarQ.subList(0, Math.min(dVarQ.size(), 12)))), z ? I0.c("{\"1\": [{\"key\": \"class\", \"name\": \"剧情\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"喜剧\", \"v\": \"喜剧\"}, {\"n\": \"爱情\", \"v\": \"爱情\"}, {\"n\": \"恐怖\", \"v\": \"恐怖\"}, {\"n\": \"动作\", \"v\": \"动作\"}, {\"n\": \"科幻\", \"v\": \"科幻\"}, {\"n\": \"剧情\", \"v\": \"剧情\"}, {\"n\": \"战争\", \"v\": \"战争\"}, {\"n\": \"警匪\", \"v\": \"警匪\"}, {\"n\": \"犯罪\", \"v\": \"犯罪\"}, {\"n\": \"古装\", \"v\": \"古装\"}, {\"n\": \"奇幻\", \"v\": \"奇幻\"}, {\"n\": \"武侠\", \"v\": \"武侠\"}, {\"n\": \"冒险\", \"v\": \"冒险\"}, {\"n\": \"枪战\", \"v\": \"枪战\"}, {\"n\": \"悬疑\", \"v\": \"悬疑\"}, {\"n\": \"惊悚\", \"v\": \"惊悚\"}, {\"n\": \"历史\", \"v\": \"历史\"}]}, {\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"中国大陆\", \"v\": \"中国大陆\"}, {\"n\": \"中国香港\", \"v\": \"中国香港\"}, {\"n\": \"中国台湾\", \"v\": \"中国台湾\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"日本\", \"v\": \"日本\"}]}, {\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2026\", \"v\": \"2026\"}, {\"n\": \"2025\", \"v\": \"2025\"}, {\"n\": \"2024\", \"v\": \"2024\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}, {\"n\": \"2009\", \"v\": \"2009\"}, {\"n\": \"2008\", \"v\": \"2008\"}, {\"n\": \"2007\", \"v\": \"2007\"}, {\"n\": \"2006\", \"v\": \"2006\"}, {\"n\": \"2005\", \"v\": \"2005\"}, {\"n\": \"2004\", \"v\": \"2004\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"时间\", \"v\": \"time\"}, {\"n\": \"人气\", \"v\": \"hits\"}, {\"n\": \"评分\", \"v\": \"score\"}]}], \"2\": [{\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"中国大陆\", \"v\": \"中国大陆\"}, {\"n\": \"中国香港\", \"v\": \"中国香港\"}, {\"n\": \"中国台湾\", \"v\": \"中国台湾\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"日本\", \"v\": \"日本\"}]}, {\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2026\", \"v\": \"2026\"}, {\"n\": \"2025\", \"v\": \"2025\"}, {\"n\": \"2024\", \"v\": \"2024\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}, {\"n\": \"2009\", \"v\": \"2009\"}, {\"n\": \"2008\", \"v\": \"2008\"}, {\"n\": \"2007\", \"v\": \"2007\"}, {\"n\": \"2006\", \"v\": \"2006\"}, {\"n\": \"2005\", \"v\": \"2005\"}, {\"n\": \"2004\", \"v\": \"2004\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"时间\", \"v\": \"time\"}, {\"n\": \"人气\", \"v\": \"hits\"}, {\"n\": \"评分\", \"v\": \"score\"}]}], \"3\": [{\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"中国大陆\", \"v\": \"中国大陆\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"美国\", \"v\": \"美国\"}]}, {\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2026\", \"v\": \"2026\"}, {\"n\": \"2025\", \"v\": \"2025\"}, {\"n\": \"2024\", \"v\": \"2024\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}, {\"n\": \"2009\", \"v\": \"2009\"}, {\"n\": \"2008\", \"v\": \"2008\"}, {\"n\": \"2007\", \"v\": \"2007\"}, {\"n\": \"2006\", \"v\": \"2006\"}, {\"n\": \"2005\", \"v\": \"2005\"}, {\"n\": \"2004\", \"v\": \"2004\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"时间\", \"v\": \"time\"}, {\"n\": \"人气\", \"v\": \"hits\"}, {\"n\": \"评分\", \"v\": \"score\"}]}], \"44\": [{\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"中国大陆\", \"v\": \"中国大陆\"}, {\"n\": \"中国香港\", \"v\": \"中国香港\"}, {\"n\": \"中国台湾\", \"v\": \"中国台湾\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"法国\", \"v\": \"法国\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}]}, {\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2026\", \"v\": \"2026\"}, {\"n\": \"2025\", \"v\": \"2025\"}, {\"n\": \"2024\", \"v\": \"2024\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}, {\"n\": \"2009\", \"v\": \"2009\"}, {\"n\": \"2008\", \"v\": \"2008\"}, {\"n\": \"2007\", \"v\": \"2007\"}, {\"n\": \"2006\", \"v\": \"2006\"}, {\"n\": \"2005\", \"v\": \"2005\"}, {\"n\": \"2004\", \"v\": \"2004\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"时间\", \"v\": \"time\"}, {\"n\": \"人气\", \"v\": \"hits\"}, {\"n\": \"评分\", \"v\": \"score\"}]}], \"4\": [{\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"中国大陆\", \"v\": \"中国大陆\"}, {\"n\": \"中国香港\", \"v\": \"中国香港\"}, {\"n\": \"中国台湾\", \"v\": \"中国台湾\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"法国\", \"v\": \"法国\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}]}, {\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2026\", \"v\": \"2026\"}, {\"n\": \"2025\", \"v\": \"2025\"}, {\"n\": \"2024\", \"v\": \"2024\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}, {\"n\": \"2009\", \"v\": \"2009\"}, {\"n\": \"2008\", \"v\": \"2008\"}, {\"n\": \"2007\", \"v\": \"2007\"}, {\"n\": \"2006\", \"v\": \"2006\"}, {\"n\": \"2005\", \"v\": \"2005\"}, {\"n\": \"2004\", \"v\": \"2004\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"时间\", \"v\": \"time\"}, {\"n\": \"人气\", \"v\": \"hits\"}, {\"n\": \"评分\", \"v\": \"score\"}]}], \"6\": [{\"key\": \"year\", \"name\": \"年份\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2026\", \"v\": \"2026\"}, {\"n\": \"2025\", \"v\": \"2025\"}, {\"n\": \"2024\", \"v\": \"2024\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2018\", \"v\": \"2018\"}, {\"n\": \"2017\", \"v\": \"2017\"}, {\"n\": \"2016\", \"v\": \"2016\"}, {\"n\": \"2015\", \"v\": \"2015\"}, {\"n\": \"2014\", \"v\": \"2014\"}, {\"n\": \"2013\", \"v\": \"2013\"}, {\"n\": \"2012\", \"v\": \"2012\"}, {\"n\": \"2011\", \"v\": \"2011\"}, {\"n\": \"2010\", \"v\": \"2010\"}]}, {\"key\": \"by\", \"name\": \"排序\", \"value\": [{\"n\": \"时间\", \"v\": \"time\"}, {\"n\": \"人气\", \"v\": \"hits\"}, {\"n\": \"评分\", \"v\": \"score\"}]}]}") : null);
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return l(str, str2);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(this.r.a(str.startsWith("/") ? str.substring(1) : str, i()), "");
        k kVarA = AbstractC0449a.a(str);
        com.github.catvod.spider.merge.f0.k kVarR = gVarL.R(".video-info-header > .page-title");
        com.github.catvod.spider.merge.f0.k kVarR2 = gVarL.R(".module-item-pic img");
        com.github.catvod.spider.merge.f0.k kVarE = gVarL.Q(".video-info-header a.tag-link").e();
        kVarA.o(kVarR != null ? kVarR.T() : "");
        kVarA.p(h(kVarR2 != null ? kVarR2.c("data-src") : ""));
        if (kVarE != null) {
            kVarA.k(kVarE.T());
        }
        kVarA.i(TextUtils.join(",", gVarL.Q(".video-info-header div.tag-link a").c()));
        ArrayList arrayListB = gVarL.Q(".module-row-text").b();
        for (int i = 0; i < arrayListB.size(); i++) {
            arrayListB.set(i, ((String) arrayListB.get(i)).trim());
        }
        String strB = b(arrayListB);
        kVarA.r(strB);
        kVarA.q(a(arrayListB));
        AbstractC0280n1.p(kVarR != null ? kVarR.T() : "");
        AbstractC0280n1.q(strB);
        kVarA.l(gVarL.Q("p.sqjj_a").g());
        kVarA.m(j(gVarL, "导演"));
        kVarA.j(j(gVarL, "主演"));
        kVarA.u(j(gVarL, "年代"));
        kVarA.s(j(gVarL, "备注"));
        boolean z = FishCrypto.a;
        N1.d(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = str;
        if (map != null) {
            String strM36 = "cateId";
            if (map.get(strM36) != null) {
                str7 = map.get(strM36);
            }
            String strM102 = "area";
            str4 = map.get(strM102) != null ? map.get(strM102) : "";
            String strM182 = "year";
            str5 = map.get(strM182) != null ? map.get(strM182) : "";
            String strM249 = "by";
            str6 = map.get(strM249) != null ? map.get(strM249) : "";
            String strM177 = "class";
            str3 = map.get(strM177) != null ? map.get(strM177) : "";
        } else {
            str3 = "";
            str4 = str3;
            str5 = str4;
            str6 = str5;
        }
        String strM175 = "vodshow/";
        String strM382 = "-";
        StringBuilder sbR = com.github.catvod.spider.merge.D.b.r(strM175, str7, strM382, str4, strM382);
        com.github.catvod.spider.merge.D.b.A(sbR, str6, strM382, str3, "-----");
        sbR.append(str2);
        sbR.append("---");
        sbR.append(str5);
        sbR.append(".html");
        return com.github.catvod.spider.merge.p001b.g.y(k(X1.L(this.r.a(sbR.toString(), i()), "").Q(".module-item")));
    }

    public static String j(com.github.catvod.spider.merge.f0.g gVar, String str) {
        for (com.github.catvod.spider.merge.f0.k kVar : gVar.Q(".video-info-item")) {
            com.github.catvod.spider.merge.f0.k kVarP = kVar.P();
            if (kVarP != null && kVarP.T().contains(str)) {
                return TextUtils.join(",", kVar.Q("a").c());
            }
        }
        return "";
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

    public final String h(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf("http");
        if (iLastIndexOf < 0) {
            String strM473 = "/";
            if (!str.startsWith(strM473)) {
                return str;
            }
            String strB = this.r.b();
            if (strB.endsWith(strM473)) {
                strB = com.github.catvod.spider.merge.D.b.g(strB, 1, 0);
            }
            return com.github.catvod.spider.merge.D.b.i(strB, str);
        }
        String strSubstring = str.substring(iLastIndexOf);
        if (!strSubstring.contains("douban")) {
            return strSubstring;
        }
        try {
            StringBuilder sb = new StringBuilder(strSubstring);
            sb.append("@Headers=");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; V2049A Build/TP1A.220624.014; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/116.0.0.0 Mobile Safari/537.36");
            jSONObject.put("Referer", "https://www.douban.com");
            sb.append(jSONObject.toString());
            return sb.toString();
        } catch (Exception unused) {
            return strSubstring;
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

    public final HashMap i() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
        mapS.put("Referer", this.r.b());
        return mapS;
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        JsonObject jsonObjectC = I0.c(str);
        String strM83 = "site";
        boolean zHas = jsonObjectC.has(strM83);
        String strM529 = "wogg_site_url";
        if (zHas && jsonObjectC.get(strM83).isJsonArray()) {
            JsonArray asJsonArray = jsonObjectC.getAsJsonArray(strM83);
            ArrayList arrayList = new ArrayList();
            Iterator it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(((JsonElement) it.next()).getAsString());
            }
            this.r = AbstractC0260h.b(strM529, arrayList, true);
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("https://wogg.xxooo.cf");
            this.r = AbstractC0260h.b(strM529, arrayList2, true);
        }
        super.init(context, str);
    }

    public final ArrayList k(com.github.catvod.spider.merge.h0.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = dVar.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) it.next();
            try {
                com.github.catvod.spider.merge.h0.d dVarQ = kVar.Q(".module-item-titlebox >a");
                String strA = dVarQ.a("href");
                String strA2 = dVarQ.a("title");
                if (!"臻彩".equals(strA2)) {
                    String strH = h(kVar.Q(".module-item-pic img").a("data-src"));
                    String strG = kVar.Q(".module-item-text").g();
                    if (!strA.isEmpty() && !strA2.isEmpty()) {
                        arrayList.add(new k(strA, strA2, strH, strG));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public final String l(String str, String str2) {
        com.github.catvod.spider.merge.h0.d<com.github.catvod.spider.merge.f0.k> dVarQ = X1.L(this.r.a("index.php/vodsearch/" + URLEncoder.encode(str) + "----------" + str2 + "---.html", i()), "").Q(".module-search-item");
        ArrayList arrayList = new ArrayList();
        for (com.github.catvod.spider.merge.f0.k kVar : dVarQ) {
            String strM42 = ".video-serial";
            String strA = kVar.Q(strM42).a("href");
            String strA2 = kVar.Q(strM42).a("title");
            String strH = h(kVar.Q(".module-item-pic > img").a("data-src"));
            com.github.catvod.spider.merge.h0.d dVarQ2 = kVar.Q(".video-info-header a.video-serial");
            arrayList.add(new k(strA, strA2, strH, !dVarQ2.isEmpty() ? dVarQ2.d().T() : ""));
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
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

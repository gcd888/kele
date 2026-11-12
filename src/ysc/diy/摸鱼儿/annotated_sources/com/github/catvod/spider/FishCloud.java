package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0260h;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0257g;
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
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.h0.n;
import com.github.catvod.spider.merge.h0.p;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class FishCloud extends Cloud {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f32short = {495, 2329, 2304, 2370, 2315, 2334, 2309, 2312, 2369, 2309, 2328, 2313, 2305, 2335, 2380, 2386, 2380, 2304, 2309, 2380, 2386, 2380, 2317, 3309, 3245, 3234, 3253, 3233, 3234, 3249, 3310, 3242, 3255, 3238, 3246, 3248, 3299, 3325, 3299, 3247, 3242, 3299, 3325, 3299, 3234, 3224, 3243, 3249, 3238, 3237, 3229, 3326, 3308, 3242, 3245, 3239, 3238, 3259, 3309, 3251, 3243, 3251, 3308, 3253, 3244, 3239, 3308, 3255, 3258, 3251, 3238, 3308, 3242, 3239, 3308, 3230, 2743, 2733, 2746, 2745, 1697, 1767, 1760, 1770, 1771, 1782, 1696, 1790, 1766, 1790, 1697, 1784, 1761, 1770, 2172, 2148, 2059, 1308, 1281, 1308, 1284, 1293, 2627, 2560, 2562, 2569, 2584, 2561, 2568, 2624, 2564, 2585, 2568, 2560, 2076, 2079, 1422, 1552, 1268, 1274, 1254, 2984, 2986, 3007, 2990, 2946, 2991, 3117, 3189, 3178, 3175, 3174, 3180, 3118, 3178, 3181, 3173, 3180, 3118, 3179, 3174, 3170, 3175, 3174, 3185, 3107, 3133, 3107, 3117, 3187, 3170, 3172, 3174, 3118, 3191, 3178, 3191, 3183, 3174, 915, 971, 980, 985, 984, 978, 912, 980, 979, 987, 978, 912, 981, 984, 988, 985, 984, 975, 925, 988, 915, 969, 988, 986, 912, 977, 980, 979, 982, 1106, 1034, 1045, 1048, 1049, 1043, 1105, 1045, 1042, 1050, 1043, 1105, 1044, 1049, 1053, 1048, 1049, 1038, 1116, 1048, 1045, 1034, 1106, 1032, 1053, 1051, 1105, 1040, 1045, 1042, 1047, 1116, 1053, 576, 21363, 26268, 18030, 26433, 24237, 27205, 2950, 1309, 1374, 1372, 1367, 1350, 1375, 1366, 1310, 1370, 1373, 1365, 1372, 1310, 1371, 1366, 1362, 1367, 1370, 1373, 1364, 1299, 1371, 1282, 1563, 1624, 1626, 1617, 1600, 1625, 1616, 1560, 1628, 1627, 1619, 1626, 1560, 1601, 1620, 1618, 1557, 1620, 1646, 1629, 1607, 1616, 1619, 1567, 1544, 1562, 1612, 1616, 1620, 1607, 1562, 1640, 3002, 3065, 3067, 3056, 3041, 3064, 3057, 3001, 3069, 3066, 3058, 3067, 3001, 3040, 3061, 3059, 2996, 3061, 3023, 3068, 3046, 3057, 3058, 3006, 2985, 3003, 3061, 3046, 3057, 3061, 3003, 3017, 563, 624, 626, 633, 616, 625, 632, 560, 628, 627, 635, 626, 560, 617, 636, 634, 573, 636, 582, 629, 623, 632, 635, 567, 544, 562, 638, 625, 636, 622, 622, 562, 576, 517, 582, 580, 591, 606, 583, 590, 518, 578, 581, 589, 580, 518, 578, 581, 607, 601, 580, 591, 606, 584, 607, 578, 580, 581, 518, 584, 580, 581, 607, 590, 581, 607, 2749, 2814, 2812, 2807, 2790, 2815, 2806, 2750, 2810, 2813, 2805, 2812, 2750, 2810, 2791, 2806, 2814, 3025, 2962, 2960, 2971, 2954, 2963, 2970, 3026, 2966, 2961, 2969, 2960, 3026, 2966, 2955, 2970, 2962, 3026, 2955, 2966, 2955, 2963, 2970, 1091, 1024, 1026, 1033, 1048, 1025, 1032, 1088, 1028, 1027, 1035, 1026, 1088, 1028, 1049, 1032, 1024, 1088, 1038, 1026, 1027, 1049, 1032, 1027, 1049, 2941, 2878, 2876, 2871, 2854, 2879, 2870, 2942, 2849, 2876, 2852, 2942, 2855, 2870, 2859, 2855, 1586, 1656, 1651, 1643, 1650, 1585, 1663, 1661, 1646, 1656, 1585, 1663, 1651, 1644, 1637, 1607, 1656, 1661, 1640, 1661, 1585, 1663, 1648, 1653, 1644, 1662, 1651, 1661, 1646, 1656, 1585, 1640, 1657, 1636, 1640, 1601, 550, 638, 609, 620, 621, 615, 549, 609, 614, 622, 615, 549, 609, 636, 621, 613, 24487, 20272, 21291, 24969, 1000, 949, 951, 940, 940, 921, 935, 998, 26251, -28982, -27819, 20923, 992, 2169, 2171, 2158, 2175, 2131, 2174, 3084, 3103, 3080, 3084, 1965, 2019, 2032, 2023, 2019, 1965, 2823, 2844, 634, 567, 556, 634, 1626, 1606, 1602, 1617, 1514, 1468, 1440, 1444, 1463, 1514, 2866, 2877, 2864, 2850, 2850, 1644, 1568, 1583, 1570, 1584, 1584, 1644, 866, 879, 864, 873, 928, 995, 1006, 993, 1000, 928, 765, 699, 700, 694, 695, 682, 764, 674, 698, 674, 765, 676, 701, 694, 765, 673, 698, 701, 677, 765, 699, 694, 765, 2390, 2313, 2328, 2334, 2332, 2390, 1309, 1371, 1351, 1374, 1375, 1058, 1121, 1123, 1128, 1145, 1120, 1129, 1057, 1125, 1144, 1129, 1121, 3065, 3067, 3054, 3071, 3069, 3061, 3048, 3043, 3033, 3061, 3060, 3054, 3071, 3060, 3054, 1456, 1457, 1440, 1461, 1469, 1464, 1431, 1467, 1466, 1440, 1457, 1466, 1440, 1466, 1436, 1418, 1437, 1474, 1454, 1416, 1418, 1409, 1435, 1696, 1666, 1687, 1668, 1665, 1665, 1676, 1730, 1752, 1731, 1757, 1741, 1733, 1722, 1668, 1667, 1673, 1666, 1690, 1694, 1741, 1699, 1721, 1741, 1756, 1757, 1731, 1757, 1750, 1741, 1722, 1668, 1667, 1755, 1753, 1750, 1741, 1685, 1755, 1753, 1732, 1741, 1708, 1693, 1693, 1665, 1672, 1722, 1672, 1679, 1702, 1668, 1689, 1730, 1752, 1758, 1754, 1731, 1758, 1755, 1741, 1733, 1702, 1701, 1721, 1696, 1697, 1729, 1741, 1665, 1668, 1670, 1672, 1741, 1706, 1672, 1678, 1670, 1666, 1732, 1741, 1710, 1669, 1695, 1666, 1664, 1672, 1730, 1756, 1759, 1759, 1731, 1757, 1731, 1757, 1731, 1757, 1741, 1726, 1676, 1675, 1676, 1695, 1668, 1730, 1752, 1758, 1754, 1731, 1758, 1755, 1931, 1521, 1478, 1477, 1478, 1489, 1478, 1489, 967, 960, 962, 970, 1004, 960, 961, 987, 970, 961, 987, 3326, 3326, 3326, 3239, 3297, 3299, 3315, 3297, 3308, 3303, 3306, 3304, 3296, 3239, 3325, 3302, 3321, 792, 794, 778, 792, 789, 798, 787, 785, 793, 862, 772, 799, 768, 1654, 1654, 1654, 1583, 1641, 1652, 1632, 1647, 1643, 1652, 1632, 1647, 1654, 1649, 1583, 1650, 1641, 1646, 1649, 1361, 1356, 1368, 1367, 1363, 1356, 1368, 1367, 1358, 1353, 1303, 1354, 1361, 1366, 1353, 564, 571, 545, 570, 561, 574, 573, 551, 566, 525, 545, 571, 550, 567, 525, 551, 544, 574, 1516, 1526, 1515, 1530, 3048, 2987, 2985, 2978, 2995, 2986, 2979, 3051, 2991, 2994, 2979, 2987, 3051, 2998, 2991, 2981, 3046, 2991, 2987, 2977, 3150, 3147, 3166, 3147, 3079, 3161, 3160, 3145, 593, 596, 577, 596, 536, 602, 583, 604, 594, 604, 603, 596, 601, 2330, 2331, 2314, 2167, 807, 868, 870, 877, 892, 869, 876, 804, 864, 893, 876, 868, 804, 893, 864, 893, 869, 876, 875, 870, 881, 809, 823, 809, 872, 908, 963, 896, 898, 905, 920, 897, 904, 960, 925, 898, 926, 921, 904, 927, 960, 900, 921, 904, 896, 3301, 3238, 3236, 3247, 3262, 3239, 3246, 3302, 3240, 3242, 3257, 3247, 3302, 3234, 3263, 3246, 3238, 3302, 3263, 3234, 3263, 3239, 3246, 3307, 
    3242, 575, 549, 562, 561, 431, 434, 431, 439, 446, 608, 547, 545, 554, 571, 546, 555, 611, 551, 570, 555, 547, 611, 570, 555, 566, 570, 320, 259, 257, 266, 283, 258, 267, 323, 263, 282, 267, 259, 323, 256, 257, 282, 267, 2207, 2247, 2264, 2261, 2260, 2270, 2204, 2264, 2271, 2263, 2270, 2204, 2265, 2260, 2256, 2261, 2260, 2243, 2193, 2256, 2670, 2687, 2681, 2683, 2609, 1543, 1601, 1606, 1612, 1613, 1616, 1542, 1624, 1600, 1624, 1543, 1630, 1607, 1612, 1543, 1627, 1613, 1609, 1626, 1611, 1600, 1543, 329, 819, 800, 875, 758, 759, 741, 654, 667, 1939, 2005, 1993, 2000, 2001, 2971, 3032, 3034, 3025, 3008, 3033, 3024, 2968, 3014, 3024, 3028, 3015, 3030, 3037, 2968, 3036, 3009, 3024, 3032, 330, 265, 267, 256, 273, 264, 257, 329, 263, 261, 278, 256, 329, 269, 272, 257, 265, 860, 838, 849, 850, 2978, 3007, 2978, 3002, 2995, 2997, 3053, 3058, 3071, 3070, 3060, 2998, 3058, 3061, 3069, 3060, 2998, 3059, 3070, 3066, 3071, 3070, 3049, 3003, 3066, 2997, 3053, 3058, 3071, 3070, 3060, 2998, 3048, 3070, 3049, 3058, 3066, 3063, 2002, 1988, 1984, 2003, 1986, 1993, 2018, 1998, 1999, 2005, 1988, 1999, 2005, 2573, 2587, 2591, 2572, 2589, 2582, 2621, 2577, 2576, 2570, 2587, 2576, 2570};
    public C0257g r;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return l(str, C0050.m199(f32short, 0, 1, 478));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(this.r.a("", h()), "");
        com.github.catvod.spider.merge.h0.d<k> dVarQ = gVarL.Q(C0030.m116(f32short, 1, 22, 2412));
        if (dVarQ.isEmpty()) {
            dVarQ = gVarL.Q(C0030.m116(f32short, 23, 53, 3267));
        }
        for (k kVar : dVarQ) {
            String strC = kVar.c(C0081.m322(f32short, 76, 4, 2783));
            if (strC.startsWith(C0021.m83(f32short, 80, 14, 1678))) {
                String strReplaceAll = strC.replaceAll(C0050.m199(f32short, 94, 3, 2080), "");
                String strC2 = kVar.c(C0074.m292(f32short, 97, 5, 1384));
                if (!strReplaceAll.isEmpty()) {
                    arrayList.add(new com.github.catvod.spider.merge.p001b.b(strReplaceAll, strC2, null));
                    if (arrayList.size() >= 7) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        ArrayList arrayListK = k(gVarL.Q(C0018.m70(f32short, 102, 12, 2669)));
        JSONObject jSONObject = new JSONObject("{\"1\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"1\"},{\"n\":\"科幻片\",\"v\":\"6\"},{\"n\":\"爱情片\",\"v\":\"7\"},{\"n\":\"战争片\",\"v\":\"8\"},{\"n\":\"恐怖片\",\"v\":\"9\"},{\"n\":\"高码片\",\"v\":\"10\"},{\"n\":\"动画片\",\"v\":\"11\"},{\"n\":\"动作片\",\"v\":\"12\"}]},{\"key\":\"class\",\"name\":\"剧情\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"2\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"2\"},{\"n\":\"国产剧\",\"v\":\"13\"},{\"n\":\"日韩剧\",\"v\":\"14\"},{\"n\":\"欧美剧\",\"v\":\"15\"},{\"n\":\"港台剧\",\"v\":\"16\"}]},{\"key\":\"class\",\"name\":\"剧情\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"3\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"3\"},{\"n\":\"日韩\",\"v\":\"22\"},{\"n\":\"国产\",\"v\":\"20\"},{\"n\":\"欧美\",\"v\":\"21\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"4\":[{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"5\":[{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"26\":[{\"key\":\"cateId\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"26\"},{\"n\":\"高分电影\",\"v\":\"29\"},{\"n\":\"高分剧集\",\"v\":\"27\"},{\"n\":\"高分外剧\",\"v\":\"30\"},{\"n\":\"国漫之光\",\"v\":\"28\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"by\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}]}");
        if (i()) {
            JSONObject jSONObject2 = new JSONObject();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String strA = ((com.github.catvod.spider.merge.p001b.b) it.next()).a();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C0092.m365(f32short, 114, 2, 2094).equals(strA) ? C0059.m234(f32short, 116, 1, 1466) : strA);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = jSONObject.getJSONArray(C0104.m414(f32short, 117, 1, 1573));
                }
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                    if (!C0137.m545(f32short, 121, 6, 3019).equals(jSONObject3.getString(C0072.m285(f32short, 118, 3, 1183)))) {
                        jSONArray.put(jSONObject3);
                    }
                }
                jSONObject2.put(strA, jSONArray);
            }
            jSONObject = jSONObject2;
        }
        return com.github.catvod.spider.merge.p001b.g.w(arrayList, arrayListK, jSONObject);
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return l(str, str2);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        k kVarR;
        String str = list.get(0);
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(this.r.a(str, h()), "");
        com.github.catvod.spider.merge.p001b.k kVarA = AbstractC0449a.a(str);
        kVarA.o(gVarL.Q(C0105.m416(f32short, 127, 32, 3075)).g());
        kVarA.p(j(gVarL));
        k kVarE = gVarL.Q(C0137.m545(f32short, 159, 29, 957)).e();
        if (kVarE != null) {
            kVarA.k(kVarE.T());
        }
        ArrayList arrayListC = gVarL.Q(C0119.m473(f32short, 188, 33, 1148)).c();
        String strM432 = C0109.m432(f32short, 221, 1, 620);
        kVarA.i(TextUtils.join(strM432, arrayListC));
        boolean zIsEmpty = kVarA.c().isEmpty();
        String strM503 = C0126.m503(f32short, 222, 2, 2676);
        String strM570 = C0143.m570(f32short, 224, 2, 2133);
        String strM454 = C0114.m454(f32short, 226, 2, 1361);
        String strM567 = C0142.m567(f32short, 228, 1, 3047);
        if (zIsEmpty) {
            kVarA.o(gVarL.Q(C0087.m346(f32short, 229, 23, 1331)).g());
            kVarA.u(gVarL.Q(C0120.m477(f32short, 252, 32, 1589)).g());
            kVarA.k(gVarL.Q(C0009.m33(f32short, 284, 32, 2964)).g());
            kVarA.i(TextUtils.join(strM432, gVarL.Q(C0076.m301(f32short, 316, 33, 541)).c()));
            kVarA.l(gVarL.Q(C0044.m175(f32short, 349, 33, 555)).g());
            for (k kVar : gVarL.Q(C0135.m539(f32short, 382, 17, 2707))) {
                String strG = kVar.Q(C0010.m36(f32short, 399, 23, 3071)).g();
                com.github.catvod.spider.merge.h0.d dVarQ = kVar.Q(C0085.m339(f32short, 422, 25, 1133));
                if (strG.contains(strM454)) {
                    kVarA.m(TextUtils.join(strM432, dVarQ.f(strM567).c()));
                } else if (strG.contains(strM570)) {
                    kVarA.j(TextUtils.join(strM432, dVarQ.f(strM567).c()));
                } else if (strG.contains(strM503)) {
                    kVarA.s(dVarQ.g());
                }
            }
        }
        ArrayList arrayListB = gVarL.Q(C0118.m471(f32short, 447, 16, 2899)).b();
        if (arrayListB.isEmpty()) {
            arrayListB = gVarL.Q(C0049.m193(f32short, 463, 36, 1564)).b();
        }
        for (int i = 0; i < arrayListB.size(); i++) {
            arrayListB.set(i, ((String) arrayListB.get(i)).trim());
        }
        String strB = b(arrayListB);
        kVarA.r(strB);
        kVarA.q(a(arrayListB));
        AbstractC0280n1.p(kVarA.c());
        AbstractC0280n1.q(strB);
        for (k kVar2 : gVarL.Q(C0112.m445(f32short, 499, 16, 520))) {
            k kVarP = kVar2.P();
            if (kVarP != null) {
                String strT = kVarP.T();
                if (strT.contains(strM454)) {
                    kVarA.m(TextUtils.join(strM432, kVar2.Q(strM567).c()));
                } else if (strT.contains(strM570)) {
                    kVarA.j(TextUtils.join(strM432, kVar2.Q(strM567).c()));
                } else if (strT.contains(C0128.m511(f32short, 515, 2, 467))) {
                    k kVarR2 = kVar2.R(strM567);
                    if (kVarR2 != null) {
                        kVarA.u(kVarR2.T().trim());
                    }
                } else if (strT.contains(strM503)) {
                    kVarA.s(kVar2.T().trim());
                } else if (strT.contains(C0104.m414(f32short, 517, 2, 332)) && (kVarR = kVar2.R(C0109.m432(f32short, 519, 7, 966))) != null) {
                    kVarA.l(kVarR.T().replace(C0026.m102(f32short, 526, 6, 957), "").trim());
                }
            }
        }
        boolean z = FishCrypto.a;
        N1.d(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = str;
        if (map != null) {
            String strM301 = C0076.m301(f32short, 532, 6, 2074);
            if (map.containsKey(strM301)) {
                str8 = map.get(strM301);
            }
            String strM545 = C0137.m545(f32short, 538, 4, 3181);
            if (map.containsKey(strM545)) {
                str4 = C0074.m292(f32short, 542, 6, 1922) + map.get(strM545);
            } else {
                str4 = "";
            }
            String strM277 = C0070.m277(f32short, 548, 2, 2917);
            if (map.containsKey(strM277)) {
                str5 = C0103.m408(f32short, 550, 4, 597) + map.get(strM277);
            } else {
                str5 = "";
            }
            String strM42 = C0011.m42(f32short, 554, 4, 1571);
            if (map.containsKey(strM42)) {
                str6 = C0082.m325(f32short, 558, 6, 1477) + map.get(strM42);
            } else {
                str6 = "";
            }
            String strM43 = C0011.m42(f32short, 564, 5, 2897);
            if (map.containsKey(strM43)) {
                str7 = C0128.m511(f32short, 569, 7, 1603) + map.get(strM43);
            } else {
                str7 = "";
            }
            String strM199 = C0050.m199(f32short, 576, 4, 782);
            if (map.containsKey(strM199)) {
                str3 = C0063.m249(f32short, 580, 6, 911) + map.get(strM199);
            } else {
                str3 = "";
            }
        } else {
            str3 = "";
            str4 = str3;
            str5 = str4;
            str6 = str5;
            str7 = str6;
        }
        StringBuilder sbR = com.github.catvod.spider.merge.D.b.r(C0135.m539(f32short, 586, 23, 722), str8, C0126.m503(f32short, 609, 6, 2425), str2, str7);
        com.github.catvod.spider.merge.D.b.A(sbR, str4, str3, str6, str5);
        sbR.append(C0098.m390(f32short, 615, 5, 1331));
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(k(X1.L(this.r.a(sbR.toString(), h()), "").Q(C0122.m486(f32short, 620, 12, 1036))));
        gVarC.o(Integer.parseInt(str2), Integer.MAX_VALUE, 36, Integer.MAX_VALUE);
        return gVarC.r();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0142.m567(f32short, 632, 15, 2970));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0117.m467(f32short, 647, 13, 1492));
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

    public final HashMap h() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(C0120.m477(f32short, 660, 10, 1519), C0093.m368(f32short, 670, 111, 1773));
        if (this.r != null) {
            mapS.put(C0008.m31(f32short, 782, 7, 1443), this.r.b() + C0122.m486(f32short, 781, 1, 1956));
        }
        return mapS;
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0116.m463(f32short, 789, 11, 943));
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

    public final boolean i() {
        String host = Uri.parse(this.r.b()).getHost();
        return C0087.m346(f32short, 800, 17, 3209).equals(host) || C0028.m108(f32short, 817, 13, 880).equals(host) || C0122.m486(f32short, 830, 19, 1537).equals(host) || C0103.m408(f32short, 849, 15, 1337).equals(host);
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        String strM486 = C0122.m486(f32short, 864, 18, 594);
        super.init(context, str);
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(C0142.m567(f32short, 882, 4, 1439));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String strTrim = jSONArray.getString(i).trim();
                if (!strTrim.isEmpty()) {
                    arrayList.add(strTrim);
                }
            }
            this.r = AbstractC0260h.b(strM486, arrayList, false);
        } catch (Exception e) {
            this.r = AbstractC0260h.b(strM486, new ArrayList(), false);
            e.printStackTrace();
        }
    }

    public final String j(k kVar) {
        C0257g c0257g;
        com.github.catvod.spider.merge.h0.d dVarQ = kVar.Q(C0017.m65(f32short, 886, 20, 3014));
        String strA = dVarQ.a(C0032.m126(f32short, 906, 8, 3114));
        if (strA.isEmpty()) {
            strA = dVarQ.a(C0120.m477(f32short, 914, 13, 565));
        }
        if (strA.isEmpty()) {
            strA = dVarQ.a(C0049.m193(f32short, 927, 3, 2409));
        }
        if (strA != null) {
            String strM126 = C0032.m126(f32short, 930, 1, 2136);
            if (strA.startsWith(strM126) && (c0257g = this.r) != null) {
                String strB = c0257g.b();
                if (strB.endsWith(strM126)) {
                    strB = com.github.catvod.spider.merge.D.b.g(strB, 1, 0);
                }
                return com.github.catvod.spider.merge.D.b.i(strB, strA);
            }
        }
        if (strA == null) {
            strA = "";
        }
        return strA;
    }

    public final ArrayList k(com.github.catvod.spider.merge.h0.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = dVar.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            k kVarR = kVar.R(C0118.m471(f32short, 931, 25, 777));
            if (kVarR == null) {
                n nVarJ = p.j(C0018.m70(f32short, 956, 20, 1005));
                com.github.catvod.spider.merge.f0.p pVar = kVar;
                while (true) {
                    com.github.catvod.spider.merge.f0.p pVar2 = pVar.a;
                    if (pVar2 == null) {
                        break;
                    }
                    pVar = pVar2;
                }
                if (nVarJ.a((k) pVar, kVar)) {
                    kVarR = kVar;
                }
            }
            if (kVarR == null) {
                kVarR = kVar.R(C0120.m477(f32short, 976, 25, 3275));
            }
            if (kVarR != null) {
                String strC = kVarR.c(C0087.m346(f32short, 1001, 4, 599));
                String strC2 = kVarR.c(C0014.m54(f32short, 1005, 5, 475));
                if (strC2.isEmpty()) {
                    strC2 = kVarR.T();
                }
                String strJ = j(kVar);
                String strG = kVar.Q(C0006.m21(f32short, 1010, 17, 590)).g();
                if (strG.isEmpty()) {
                    strG = kVar.Q(C0130.m516(f32short, 1027, 17, 366)).g();
                }
                if (!strC.isEmpty()) {
                    arrayList.add(new com.github.catvod.spider.merge.p001b.k(strC, strC2, strJ, strG));
                }
            }
        }
        return arrayList;
    }

    public final String l(String str, String str2) {
        String strM567 = C0142.m567(f32short, 1044, 20, 2225);
        String strM277 = C0070.m277(f32short, 1064, 5, 2590);
        try {
            StringBuilder sb = new StringBuilder(C0044.m175(f32short, 1069, 22, 1576));
            sb.append(i() ? strM277 + str2 + C0122.m486(f32short, 1091, 1, 358) : "");
            sb.append(C0087.m346(f32short, 1092, 3, 836));
            sb.append(URLEncoder.encode(str, C0026.m102(f32short, 1095, 5, 675)));
            sb.append(C0082.m325(f32short, 1100, 5, 1981));
            com.github.catvod.spider.merge.f0.g gVarL = X1.L(this.r.a(sb.toString(), h()), "");
            com.github.catvod.spider.merge.h0.d<k> dVarQ = gVarL.Q(C0122.m486(f32short, 1105, 19, 2997));
            if (dVarQ.isEmpty()) {
                return com.github.catvod.spider.merge.p001b.g.y(k(gVarL.Q(C0028.m108(f32short, 1124, 17, 356))));
            }
            ArrayList arrayList = new ArrayList();
            for (k kVar : dVarQ) {
                String strA = kVar.Q(strM567).a(C0122.m486(f32short, 1141, 4, 820));
                String strA2 = kVar.Q(strM567).a(C0006.m21(f32short, 1145, 5, 3030));
                String strJ = j(kVar);
                String strG = kVar.Q(C0119.m473(f32short, 1150, 33, 2971)).g();
                if (!strA.isEmpty()) {
                    arrayList.add(new com.github.catvod.spider.merge.p001b.k(strA, strA2, strJ, strG));
                }
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        } catch (Exception unused) {
            return com.github.catvod.spider.merge.D.b.d();
        }
    }

    public String searchContent(String str, boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0085.m339(f32short, 1183, 13, 1953));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0073.m288(f32short, 1196, 13, 2686));
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

package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
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
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
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
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
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
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class TingYou extends Spider {
    public HttpUrl b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f96short = {434, 755, 741, 739, 756, 745, 751, 750, 889, 884, 865, 880, 870, 865, 1157, 1172, 1170, 1168, 3199, 2646, 2629, 2634, 2639, 2812, 2785, 2800, 2808, 2790, 1839, 1825, 1853, 1843, 1835, 1846, 1824, 872, 889, 895, 893, 2909, 2891, 2895, 2908, 2893, 2886, 2693, 2706, 2692, 2690, 2715, 2691, 2692, 2360, 2341, 2356, 2364, 2338, 392, 385, 403, 447, 397, 399, 402, 389, 2758, 2790, 3308, 3297, 3311, 3320, 3296, 3282, 3300, 3305, 2617, 2610, 2619, 2602, 2606, 2623, 2600, 2565, 2611, 2622, 2594, 3052, 3056, 3069, 3045, 3173, 3193, 3188, 3180, 3146, 3168, 3175, 3193, 23597, 23498, 27820, 27967, 24369, 24385, 28129, 27977, 24744, 24891, 22471, 24949, 25061, 24909, 1197, 1184, 1198, 1209, 1185, 1251, 3174, 3185, 3174, 3182, 3179, 3174, 3173, 3179, 3170, 16930, -31840, 20931, 16954, 27527, 931, 942, 1381, 1384, 1382, 1393, 1385, 1371, 1389, 1376, 1609, 1602, 1611, 1626, 1630, 1615, 1624, 1625, 1541, 1842, 1845, 1839, 1833, 1844, 1860, 1870, 1881, 1880, 1863, 1860, 1886, 1860, 482, 483, 501, 485, 500, 495, 502, 498, 495, 489, 488, 2301, 2284, 2277, 2277, 2284, 2299, 787, 775, 774, 794, 797, 768, 23601, 23510, 2139, 2128, 2121, 2114, 2123, 2138, 2142, 2127, 2136, 2137, 2230, 673, 678, 684, 685, 688, 1001, 1012, 1001, 1009, 1016, 30931, -27316, -2515, -836, 1039, 2314, 20780, 22219, 19219, -30063, 24688, 26222, 24800, 24648, 1110, 1531, 1529, 1516, 1533, 1535, 1527, 1514, 1505, 1423, 1410, 1419, 1438, 2810, 2790, 2811, 2813, 1723, 1719, 1717, 1704, 1706, 1725, 1712, 1725, 1718, 1707, 1713, 1710, 1725, 2166, 2151, 2145, 2147, 1180, 1177, 1164, 1177, 1636, 1657, 1640, 1632, 1662, 1047, 1030, 1024, 1026, 3152, 3137, 3143, 3141, 3155, 3247, 3242, 2403, 1684, 1686, 2398, 2398, 1637, 1645, 572, 575, 3176, 3181, 1369, 1375, 1968, 1972, 691, 1365, 1362, 1769, 1768, 2852, 2861, 22730, 25112, 21714, -29095, 19451, 30534, 23225, 23941, 23225, 26749, 19643, 24340, -30481, -30715, 25280, -28129, 19922, 32500, 20732, 21507, 23757, 27119, 27049, 26997, 26917, 22364, 23550, 22914, 28380, 22752, 22676, 23293, 17901, 32120, 20656, -32588, 23645, 24195, 17204, 24415, -29246, 28540, 20613, 28146, 21267, 19342, 30557, 31646, 24234, 17056, -31966, 3219, 3322, 3319, 3219, 26963, 27131, 3005, 3030, 3019, 3039, 3003, 3021, 478, 467, 2648, 2645, 2651, 2636, 2644, 2662, 2640, 2653, 22515, 20500, 22290, 23883, 31973, 24526, 20936, -29769, 22664, 26730, 3254, 3239, 3233, 3235, 964, 981, 979, 977, 983, 987, 961, 986, 960, 3150, 3147, 3151, 3147, 3158, 707, 728, 707, 726, 731, 863, 836, 861, 861, 2179, 2190, 2585, 2580, 2586, 2573, 2581, 2599, 2577, 2588, 2696, 2709, 2696, 2704, 2713, 1394, 1405, 1393, 1401, 2979, 2991, 2998, 2981, 2994, 2975, 2997, 2994, 2988, 1470, 1458, 1451, 1464, 1455, 1148, 1133, 1124, 1124, 1133, 1146, 686, 698, 699, 679, 672, 701, 1684, 1689, 1680, 1669, 1760, 1762, 1783, 23709, 23418, 22996, 23378, -30875, 24175, 2193, 2297, 2277, 2277, 2273, 2193, 916, 983, 978, 968, 975, 990, 981, 978, 981, 988, 490, 417, 508, 484, 428, 423, 445, 443, 432, 484, 429, 424, 445, 424, 302, 319, 294, 312, 315, 297, 319, 271, 264, 278, 2021, 2041, 2041, 2045, 2046, 1975, 1954, 1954, 2935, 2923, 2923, 2927, 2924, 3007, 3042, 3064, 3003, 3006, 2980, 2979, 2994, 3001, 3006, 3001, 2992, 3064, 2644, 2678, 2678, 2672, 2661, 2657, 882, 867, 867, 895, 890, 880, 882, 871, 890, 892, 893, 828, 889, 864, 892, 893, 2581, 2600, 2611, 2621, 2611, 2612, 2514, 2089, 2093, 2082, 1677, 1752, 1689, 1692, 1670, 1665, 1680, 1691, 1692, 1691, 1682, 1752, 1670, 1680, 1670, 1670, 1692, 1690, 1691, 771, 854, 791, 786, 776, 783, 798, 789, 786, 789, 796, 854, 783, 786, 790, 798, 769, 788, 789, 798, 2654, 2639, 2639, 2643, 2646, 2652, 2654, 2635, 2646, 2640, 2641, 2576, 2645, 2636, 2640, 2641, 2564, 2591, 2652, 2647, 2654, 2637, 2636, 2650, 2635, 2562, 2634, 2635, 2649, 2578, 2567, 21494, 21521, 25727, 21561, 2042, 2531, -31209, 24349, 2531, 2443, 2455, 2455, 2451, 2531, 23711, 23416, 2195, 2290, 2275, 2298, 2195, -26114, 30685, 27987, 28155, 24443, 22684, 23090, 22708, 29805, 22342, 2935, 2838, 2823, 2846, 2935, -26086, 29753, 763, 761, 748, 765, 767, 759, 746, 737, 731, 759, 758, 748, 765, 758, 748, 1110, 1111, 1094, 1107, 1115, 1118, 1137, 1117, 1116, 1094, 1111, 1116, 1094, 428, 394, 412, 395, 468, 440, 414, 412, 407, 397, 711, 741, 752, 739, 742, 742, 747, 677, 703, 676, 698, 682, 674, 733, 739, 740, 750, 741, 765, 761, 682, 708, 734, 682, 699, 698, 676, 698, 689, 682, 733, 739, 740, 700, 702, 689, 682, 754, 700, 702, 675, 682, 715, 762, 762, 742, 751, 733, 751, 744, 705, 739, 766, 677, 703, 697, 701, 676, 697, 700, 1677, 624, 583, 580, 583, 592, 583, 592, 2370, 2373, 2375, 2383, 2409, 2373, 2372, 2398, 2383, 2372, 2398, 1737, 1718, 1705, 1775, 1771, 1790, 1769, 1750, 1762, 1738, 1729, 1748, 1727, 1768, 1782, 1761, 1715, 1740, 1762, 1733, 1726, 1783, 1726, 1746, 1739, 1731, 1766, 1729, 1760, 1750, 1772, 1737, 1772, 1727, 1758, 1762, 1773, 1774, 1732, 1740, 1749, 1790, 1746, 1726, 1770, 1765, 1715, 1746, 1775, 1789, 1759, 1737, 1717, 1774, 1761, 1743, 1770, 1730, 1731, 1742, 1758, 1715, 1739, 1744, 1715, 1747, 1762, 1791, 1728, 1733, 1734, 1717, 1780, 1772, 1741, 1736, 1764, 1774, 1773, 1742, 1789, 1790, 1769, 1736, 1780, 1743, 1780, 1745, 1708, 1738, 1762, 1771, 1748, 1718, 1748, 1761, 1766, 1781, 1757, 1772, 1715, 1769, 1719, 1728, 1774, 1790, 1737, 1768, 1745, 1764, 1722, 520, 541, 541, 2944, 2972, 2972, 2968, 2971, 3026, 3015, 3015, 3003, 3007, 2992, 24533, 22578, 23196, 22554, 23753, 23737, 28185, 28337, 909, 913, 924, 900, 920, 911, 958, 914, 915, 905, 920, 915, 905, 1007, 1017, 1021, 1006, 1023, 1012, 991, 1011, 1010, 1000, 1017, 1010, 1000, 1502, 1480, 1484, 1503, 1486, 1477, 1518, 1474, 1475, 1497, 1480, 1475, 1497};
    public static final List d = Arrays.asList("46", "11", "19", "21", "14", "17", "15", "9", "16", "10", "18", "36", "1");
    public static final List e = Arrays.asList("玄幻奇幻", "武侠小说", "言情通俗", "相声小品", "恐怖惊悚", "官场商战", "历史军事", "百家讲坛", "刑侦反腐", "有声文学", "人物纪实", "广播剧", "评书");
    public String a = "";
    public final String c = UUID.randomUUID().toString();

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            List list = d;
            if (i >= list.size()) {
                return com.github.catvod.spider.merge.p001b.g.z(arrayList, b(d(c("rank", null, "section", "latest", "page", "1"), "items")));
            }
            arrayList.add(new com.github.catvod.spider.merge.p001b.b((String) list.get(i), (String) e.get(i), null));
            i++;
        }
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int iMax = 1;
        try {
            if (!TextUtils.isEmpty(str2)) {
                iMax = Math.max(1, Integer.parseInt(str2));
            }
        } catch (NumberFormatException unused) {
        }
        JSONObject jSONObjectC = c("search", new JSONObject().put("keyword", str).put("page", iMax), new String[0]);
        return f(jSONObjectC, d(jSONObjectC, "results", "items"), iMax, jSONObjectC.optBoolean("has_more") ? iMax + 1 : iMax, 10);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws IOException {
        String[] strArrSplit = str2 == null ? new String[0] : str2.split("\\|", -1);
        try {
            if (strArrSplit.length != 2) {
                throw new NumberFormatException();
            }
            String strA = a(strArrSplit[0]);
            int i = Integer.parseInt(strArrSplit[1]);
            if (i < 0) {
                throw new NumberFormatException();
            }
            HttpUrl httpUrl = HttpUrl.parse(c("play", new JSONObject().put("album_id", strA).put("chapter_idx", i), new String[0]).optString("play_url"));
            if (httpUrl == null) {
                throw new IOException("听友播放地址无效");
            }
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.C(httpUrl.toString());
            gVar.h(e());
            return gVar.r();
        } catch (IllegalArgumentException unused) {
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.C("");
            gVar2.l("播放参数无效");
            return gVar2.r();
        }
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        int iOptInt;
        int i = 0;
        String strA = a(list.get(0));
        JSONObject jSONObjectC = c(com.github.catvod.spider.merge.D.b.B("album/", strA), null, new String[0]);
        if (!jSONObjectC.optBoolean("available", true)) {
            return com.github.catvod.spider.merge.p001b.g.d("专辑已下架");
        }
        if (TextUtils.isEmpty(g(jSONObjectC, "id", "album_id"))) {
            throw new IOException("听友专辑数据无效");
        }
        JSONObject jSONObjectC2 = c(com.github.catvod.spider.merge.D.b.B("chapters/", strA), null, new String[0]);
        k kVarH = h(jSONObjectC);
        kVarH.n(strA);
        kVarH.l(g(jSONObjectC, "synopsis", "description", "intro"));
        kVarH.j(g(jSONObjectC, "teller"));
        kVarH.m(g(jSONObjectC, "author"));
        kVarH.q("听友FM");
        JSONArray jSONArrayD = d(jSONObjectC2, "chapters");
        TreeMap treeMap = new TreeMap();
        while (true) {
            int length = jSONArrayD.length();
            String strM511 = "#";
            if (i >= length) {
                kVarH.r(TextUtils.join(strM511, treeMap.values()));
                FishCrypto.c(kVarH);
                return com.github.catvod.spider.merge.p001b.g.s(kVarH);
            }
            JSONObject jSONObjectOptJSONObject = jSONArrayD.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("index", -1)) >= 0 && !treeMap.containsKey(Integer.valueOf(iOptInt))) {
                String strG = g(jSONObjectOptJSONObject, "title");
                if (TextUtils.isEmpty(strG)) {
                    strG = com.github.catvod.spider.merge.D.b.h("第", iOptInt, "集");
                }
                Integer numValueOf = Integer.valueOf(iOptInt);
                StringBuilder sb = new StringBuilder();
                String strReplace = strG.replace(strM511, "＃");
                String strM539 = "＄";
                String strM339 = "$";
                sb.append(strReplace.replace(strM339, strM539));
                sb.append(strM339);
                sb.append(strA);
                sb.append("|");
                sb.append(iOptInt);
                treeMap.put(numValueOf, sb.toString());
            }
            i++;
        }
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int iMax = 1;
        try {
            if (!TextUtils.isEmpty(str2)) {
                iMax = Math.max(1, Integer.parseInt(str2));
            }
        } catch (NumberFormatException unused) {
        }
        boolean zEquals = "1".equals(str);
        String strM355 = "category";
        JSONObject jSONObjectC = c(strM355, null, zEquals ? strM355 : "type", a(str), "sort", "comprehensive", "page", String.valueOf(iMax));
        return f(jSONObjectC, d(jSONObjectC, "data", "items"), jSONObjectC.optInt("page", iMax), jSONObjectC.optInt("pages", iMax), 20);
    }

    public static String a(String str) {
        String strM499 = "专辑 ID 无效";
        if (str == null || !str.matches("[0-9]+")) {
            throw new IllegalArgumentException(strM499);
        }
        long j = Long.parseLong(str);
        if (j > 0) {
            return String.valueOf(j);
        }
        throw new IllegalArgumentException(strM499);
    }

    public static ArrayList b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(g(jSONObjectOptJSONObject, "id", "album_id"))) {
                arrayList.add(h(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static JSONArray d(JSONObject jSONObject, String... strArr) throws IOException {
        for (String str : strArr) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray != null) {
                return jSONArrayOptJSONArray;
            }
        }
        throw new IOException("听友响应缺少列表字段");
    }

    public static String f(JSONObject jSONObject, JSONArray jSONArray, int i, int i2, int i3) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject(com.github.catvod.spider.merge.p001b.g.y(b(jSONArray))).put("page", Math.max(1, i)).put("pagecount", Math.max(Math.max(1, i), i2)).put("limit", i3);
        String strM1 = "total";
        if (jSONObject.has(strM1)) {
            jSONObjectPut.put(strM1, Math.max(0L, jSONObject.optLong(strM1)));
        }
        return jSONObjectPut.toString();
    }

    public static String g(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            String strOptString = jSONObject.optString(str);
            if (!TextUtils.isEmpty(strOptString) && !"null".equals(strOptString)) {
                return strOptString;
            }
        }
        return "";
    }

    public static k h(JSONObject jSONObject) {
        k kVar = new k();
        kVar.n(g(jSONObject, "id", "album_id"));
        kVar.o(g(jSONObject, "title", "name"));
        kVar.p(g(jSONObject, "cover_url", "cover"));
        String strM486 = "teller";
        String strM186 = "author";
        String strM70 = "type";
        kVar.s(g(jSONObject, strM486, strM186, strM70));
        kVar.i(g(jSONObject, strM70, "cat"));
        return kVar;
    }

    public final JSONObject c(String str, JSONObject jSONObject, String... strArr) {
        HttpUrl httpUrl;
        String strM10 = "听友入口返回 HTTP ";
        synchronized (this) {
            httpUrl = this.b;
            if (httpUrl == null) {
                Response responseI = X1.I(new Request.Builder().url(this.a + "/listening").headers(Headers.of(e())).build());
                try {
                    if (!responseI.isSuccessful() || responseI.body() == null) {
                        throw new IOException(strM10 + responseI.code());
                    }
                    com.github.catvod.spider.merge.f0.k kVarR = X1.L(responseI.body().string(), "").R("#h5-entry-data");
                    if (kVarR == null) {
                        throw new IOException("听友入口缺少 API 配置");
                    }
                    JSONObject jSONObjectOptJSONObject = new JSONObject(kVarR.F()).optJSONObject("api");
                    HttpUrl httpUrl2 = jSONObjectOptJSONObject == null ? null : HttpUrl.parse(jSONObjectOptJSONObject.optString("baseURL"));
                    if (httpUrl2 == null || !httpUrl2.username().isEmpty() || !httpUrl2.password().isEmpty() || httpUrl2.query() != null || httpUrl2.fragment() != null || (this.a.startsWith("https://") && !"https".equals(httpUrl2.scheme()))) {
                        throw new IOException("听友 API 配置无效");
                    }
                    this.b = httpUrl2;
                    responseI.close();
                    httpUrl = httpUrl2;
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
        }
        HttpUrl.Builder builderAddPathSegments = httpUrl.newBuilder().addPathSegments("h5/listening/" + str);
        for (int i = 0; i < strArr.length; i += 2) {
            builderAddPathSegments.addQueryParameter(strArr[i], strArr[i + 1]);
        }
        HashMap mapE = e();
        mapE.put("Accept", "application/json");
        mapE.put("Origin", HttpUrl.parse(this.a).resolve("/").toString().replaceAll("/+$", ""));
        mapE.put("x-listening-session", this.c);
        mapE.put("x-listening-timezone", TimeZone.getDefault().getID());
        Request.Builder builderHeaders = new Request.Builder().url(builderAddPathSegments.build()).headers(Headers.of(mapE));
        if (jSONObject != null) {
            builderHeaders.post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jSONObject.toString()));
        }
        Response responseI2 = X1.I(builderHeaders.build());
        try {
            if (responseI2.isSuccessful() && responseI2.body() != null) {
                JSONObject jSONObject2 = new JSONObject(responseI2.body().string());
                responseI2.close();
                return jSONObject2;
            }
            throw new IOException("听友接口 " + str + " 返回 HTTP " + responseI2.code());
        } catch (Throwable th3) {
            if (responseI2 != null) {
                try {
                    responseI2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
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
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
        mapS.put("Referer", this.a + "/");
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

    public void init(Context context, String str) throws IOException {
        Init.init(context);
        String strV = TextUtils.isEmpty(str) ? FishCrypto.v("N1.hlynQeMFS8oqf4KeB9p9ULDaFgQkNk8YejiCKRyU9mb4UhzXN2ifHmEDIY4LW4TexGBA2skJOcijIzynOsHsV+MelS1SfarZk4n0GiyNoVc=") : str.trim();
        if (!strV.contains("://")) {
            strV = "https://".concat(strV);
        }
        HttpUrl httpUrl = HttpUrl.parse(strV);
        if (httpUrl == null || !httpUrl.username().isEmpty() || !httpUrl.password().isEmpty() || httpUrl.query() != null || httpUrl.fragment() != null) {
            throw new IOException("听友入口地址无效");
        }
        this.a = httpUrl.toString().replaceAll("/+$", "");
        this.b = null;
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

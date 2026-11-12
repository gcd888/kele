package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0286p1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p000a.N;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class UC extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f101short = {554, 605, 554, 605, 2021, 2035, 1999, 2047, 2018, 2041, 2039, 2041, 2046, 2033, 2044, 614, 624, 588, 614, 637, 639, 634, 638, 634, 615, 630, 631, 27950, 1156, 1170, 1198, 1154, 1180, 1168, 1155, 1157, 1064, 1064, 1064, 2346, 2343, 2350, 2363, 1509, 1530, 1527, 1526, 1532, 410, 413, 387, 958, 947, 951, 946, 947, 932, 2126, 2168, 2174, 2096, 2139, 2168, 2153, 2174, 2165, 2096, 2126, 2164, 2153, 2168, 2878, 2840, 2830, 2841, 2886, 2858, 2828, 2830, 2821, 2847, 1040, 1059, 1068, 1061, 1063, 885, 855, 855, 849, 836, 832, 285, 319, 319, 313, 300, 296, 369, 281, 306, 319, 307, 312, 309, 306, 315, 1037, 1071, 1071, 1065, 1084, 1080, 1121, 1024, 1069, 1058, 1067, 1081, 1069, 1067, 1065, 2416, 2396, 2396, 2392, 2394, 2390, 3020, 3057, 3050, 3044, 3050, 3053, 1861, 1906, 1905, 1906, 1893, 1906, 1893, 1608, 1662, 1656, 1590, 1624, 1651, 1590, 1614, 1658, 2692, 2738, 2740, 2810, 2708, 2751, 2810, 2690, 2742, 2810, 2714, 2744, 2741, 2750, 2747, 2738, 2927, 2905, 2911, 2833, 2943, 2900, 2833, 2921, 2909, 2833, 2924, 2896, 2909, 2888, 2906, 2899, 2894, 2897, 2632, 2686, 2680, 2614, 2653, 2686, 2671, 2680, 2675, 2614, 2655, 2686, 2664, 2671, 1184, 1174, 1168, 1246, 1205, 1174, 1159, 1168, 1179, 1246, 1214, 1180, 1175, 1174, 2892, 2834, 2900, 2841, 401, 391, 2573, 2587, 2599, 2574, 2577, 2568, 1790, 402, 2690, 2776, 2783, 24890, 20774, 25275, 25384, 18677, 29200, 28021, 20798, 22480, 24337, -1766, -29215, 31771, 21016, -26661, -29245, 2941, 2924, 2929, 2941, 2854, 2937, 2917, 2920, 2912, 2919, 1873, 1917, 1916, 1894, 1911, 1916, 1894, 1855, 1862, 1899, 1890, 1911, 2718, 2703, 2703, 2707, 2710, 2716, 2718, 2699, 2710, 2704, 2705, 2768, 2697, 2705, 2715, 2769, 2718, 2703, 2703, 2707, 2714, 2769, 2706, 2703, 2714, 2712, 2698, 2701, 2707, 2785, 2708, 2797, 2769, 2763, 2780, 2776, 2781, 2708, 2807, 2764, 2772, 3108, 3123, 3120, 3108, 3123, 3109, 3134, 2359, 2361, 2341, 1379, 1396, 1396, 1385, 1396, 2585, 2575, 2668, 2592, 2595, 2603, 2597, 2594, 2668, 2622, 2601, 2621, 2617, 2597, 2622, 2601, 2600, 640, 663, 660, 640, 663, 641, 666, 722, 660, 659, 667, 670, 663, 662, 726, 731, 735, 730, 731, 716, 717, 1541, 1554, 1553, 1541, 1554, 1540, 1567, 1623, 1540, 1560, 1538, 1541, 1556, 1554, 1623, 1561, 1560, 1539, 1623, 1553, 1560, 1538, 1561, 1555, 781, 822, 819, 822, 823, 815, 822, 888, 813, 827, 888, 808, 810, 823, 800, 801, 888, 812, 801, 808, 829, 866, 888, 1725, 1724, 1710, 1733, 1744, 2989, 3004, 2977, 2989, 3062, 2985, 2997, 3000, 2992, 2999, 3042, 3065, 3002, 2993, 3000, 2987, 2986, 3004, 2989, 3044, 2988, 2989, 3007, 3060, 3041, 619, 618, 635, 622, 614, 611, 588, 608, 609, 635, 618, 609, 635, 634, 614, 619, 627, 623, 632, 585, 613, 612, 638, 623, 612, 638};

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        return Z0.t().g0(str, str2.split("\\+\\+"));
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        Z0 z0T = Z0.t();
        String str = (String) arrayList.get(0);
        z0T.getClass();
        return com.github.catvod.spider.merge.p001b.g.s(Z0.t().M(Z0.D(str)));
    }

    public static String detailContentVodPlayFrom(int i) {
        String strM249;
        ArrayList arrayList = new ArrayList();
        String strM102 = "uc_original";
        String strG1 = AbstractC0302v0.g1(strM102, i, "");
        String strM103 = "uc_unlimited";
        String strG2 = AbstractC0302v0.g1(strM103, i, "");
        ArrayList arrayList2 = new ArrayList();
        Z0.t().getClass();
        Iterator it = Collections.singletonList("智").iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strM249 = "uc_smart";
            if (!zHasNext) {
                break;
            }
            arrayList2.add(AbstractC0302v0.g1(strM249, i, (String) it.next()));
        }
        if (C0299u0.g0(strM102)) {
            arrayList.add(strG1);
        }
        if (C0299u0.g0(strM103)) {
            arrayList.add(strG2);
        }
        if (C0299u0.g0(strM249)) {
            arrayList.addAll(arrayList2);
        }
        return AbstractC0302v0.T0(TextUtils.join("$$$", arrayList));
    }

    public static String detailContentVodPlayUrl(String str) throws Throwable {
        Z0.t().getClass();
        try {
            k kVarM = Z0.t().M(Z0.D(str));
            String strE = kVarM != null ? kVarM.e() : null;
            return strE != null ? strE : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static Object[] localProxy(Map<String, String> map) throws Throwable {
        String str = map.get("type");
        boolean zEquals = "video".equals(str);
        String strM386 = "url";
        if (!zEquals) {
            if (!"refresh".equals(str)) {
                return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream(com.github.catvod.spider.merge.D.b.B("Unknown uc proxy type: ", str).getBytes("UTF-8"))};
            }
            Z0 z0T = Z0.t();
            String[] strArr = (String[]) z0T.n.get(map.get("key"));
            String strM463 = "error";
            if (strArr == null || strArr.length != 3) {
                return Z0.b0(404, Collections.singletonMap(strM463, "refresh source not found"));
            }
            if (!Z0.N()) {
                return Z0.b0(401, Collections.singletonMap(strM463, "UC login required"));
            }
            String strE = z0T.E(strArr[0], "", strArr[1], "", strArr[2], true);
            if (TextUtils.isEmpty(strE)) {
                return Z0.b0(502, Collections.singletonMap(strM463, "refresh failed"));
            }
            HashMap mapS = com.github.catvod.spider.merge.D.b.s(strM386, strE);
            mapS.put("headers", Z0.F(strE));
            return Z0.b0(200, mapS);
        }
        Z0 z0T2 = Z0.t();
        z0T2.getClass();
        String strB = AbstractC0309x1.b(map.get(strM386));
        Map map2 = (Map) new Gson().fromJson(AbstractC0309x1.b(map.get("header")), Map.class);
        if (map2 == null) {
            map2 = new HashMap();
        }
        List listAsList = Arrays.asList("Range", "Accept", "Accept-Encoding", "Accept-Language", "Cookie", "Origin", "Referer", "Sec-Ch-Ua", "Sec-Ch-Ua-Mobile", "Sec-Ch-Ua-Platform", "Sec-Fetch-Dest", "Sec-Fetch-Mode", "Sec-Fetch-Site", "User-Agent");
        for (String str2 : map.keySet()) {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).toLowerCase().equals(str2.toLowerCase())) {
                    map2.put(str2, map.get(str2));
                }
            }
        }
        boolean zContains = AbstractC0309x1.g(strB).contains("m3u8");
        String strM539 = "uc";
        String strM558 = "uc_vip";
        if (!zContains) {
            map2.put("X-Thread-Num", String.valueOf(Z0.X(z0T2.c) ? C0299u0.F(strM558) : C0299u0.F(strM539)));
            return C0286p1.b(strB, map2);
        }
        N nZ = X1.z(strB, new HashMap(), map2);
        String strA = nZ.a();
        String strM368 = "\n";
        String[] strArrSplit = strA.split(strM368);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String strM427 = "/";
        sb.append(strB.substring(0, strB.lastIndexOf(strM427)));
        sb.append(strM427);
        String string = sb.toString();
        for (String strX0 : strArrSplit) {
            if (strX0.contains(".ts")) {
                String strI = com.github.catvod.spider.merge.D.b.i(string, strX0);
                String str3 = Z0.X(z0T2.c) ? strM558 : strM539;
                strX0 = C0299u0.x0(strI, map2, C0299u0.F(str3), str3, null);
                if (TextUtils.isEmpty(strX0)) {
                    return new Object[]{503, "text/plain", new ByteArrayInputStream("本地播放代理正在准备，请稍后重试".getBytes(StandardCharsets.UTF_8))};
                }
            }
            arrayList.add(strX0);
        }
        String strJoin = TextUtils.join(strM368, arrayList);
        Map map3 = (Map) nZ.c;
        List list = (List) map3.get("Content-Type");
        String strM511 = (list == null || list.isEmpty()) ? "application/vnd.apple.mpegurl" : (String) list.get(0);
        HashMap map4 = new HashMap();
        for (String str4 : map3.keySet()) {
            List list2 = (List) map3.get(str4);
            if (list2 != null && !list2.isEmpty()) {
                map4.put(str4, (String) list2.get(0));
            }
        }
        return new Object[]{Integer.valueOf(nZ.a), strM511, new ByteArrayInputStream(strJoin.getBytes(Charset.defaultCharset())), map4};
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

    public void init(Context context, String str) {
        Init.init(context);
        Z0.t().q0(str);
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
}

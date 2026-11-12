package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0286p1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.N;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.utils.C0143;
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
public class Quark extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f84short = {2141, 2090, 2141, 2090, 2439, 2435, 2455, 2436, 2461, 2473, 2457, 2436, 2463, 2449, 2463, 2456, 2455, 2458, 644, 640, 660, 647, 670, 682, 640, 667, 665, 668, 664, 668, 641, 656, 657, 28149, 2495, 2491, 2479, 2492, 2469, 2449, 2493, 2467, 2479, 2492, 2490, 1450, 1450, 1450, 1209, 1204, 1213, 1192, 2573, 2578, 2591, 2590, 2580, 1305, 1304, 1290, 1377, 1396, 422, 417, 447, 3007, 2994, 2998, 2995, 2994, 2981, 2733, 2715, 2717, 2771, 2744, 2715, 2698, 2717, 2710, 2771, 2733, 2711, 2698, 2715, 1488, 1526, 1504, 1527, 1448, 1476, 1506, 1504, 1515, 1521, 1217, 1266, 1277, 1268, 1270, 2774, 2804, 2804, 2802, 2791, 2787, 3209, 3243, 3243, 3245, 3256, 3260, 3301, 3213, 3238, 3243, 3239, 3244, 3233, 3238, 3247, 1515, 1481, 1481, 1487, 1498, 1502, 1415, 1510, 1483, 1476, 1485, 1503, 1483, 1485, 1487, 3147, 3175, 3175, 3171, 3169, 3181, 1190, 1179, 1152, 1166, 1152, 1159, 3173, 3154, 3153, 3154, 3141, 3154, 3141, 2182, 2224, 2230, 2296, 2198, 2237, 2296, 2176, 2228, 430, 408, 414, 464, 446, 405, 464, 424, 412, 464, 432, 402, 415, 404, 401, 408, 3033, 3055, 3049, 2983, 3017, 3042, 2983, 3039, 3051, 2983, 3034, 3046, 3051, 3070, 3052, 3045, 3064, 3047, 1226, 1276, 1274, 1204, 1247, 1276, 1261, 1274, 1265, 1204, 1245, 1276, 1258, 1261, 2435, 2485, 2483, 2557, 2454, 2485, 2468, 2483, 2488, 2557, 2461, 2495, 2484, 2485, 704, 670, 728, 661, 544, 548, 560, 547, 570, 476, 472, 460, 479, 454, 498, 475, 452, 477, 1519, 3261, 2212, 2302, 2297, 25405, 21281, 24764, 24879, 19186, 28695, 28530, 21305, 21975, 23830, -1251, -28698, 32284, 20511, -27172, -28732, 1814, 1799, 1818, 1814, 1869, 1810, 1806, 1795, 1803, 1804, 2476, 2432, 2433, 2459, 2442, 2433, 2459, 2498, 2491, 2454, 2463, 2442, 1510, 1527, 1527, 1515, 1518, 1508, 1510, 1523, 1518, 1512, 1513, 1448, 1521, 1513, 1507, 1449, 1510, 1527, 1527, 1515, 1506, 1449, 1514, 1527, 1506, 1504, 1522, 1525, 1515, 2211, 2262, 2223, 2195, 2185, 2206, 2202, 2207, 2262, 2229, 2190, 2198, 1664, 1723, 1726, 1723, 1722, 1698, 1723, 1781, 1700, 1696, 1716, 1703, 1726, 1781, 1701, 1703, 1722, 1709, 1708, 1781, 1697, 1708, 1701, 1712, 1775, 1781, 1860, 1877, 1864, 1860, 1823, 1856, 1884, 1873, 1881, 1886, 1803, 1808, 1875, 1880, 1873, 1858, 1859, 1877, 1860, 1805, 1861, 1860, 1878, 1821, 1800, 3297, 3296, 3313, 3300, 3308, 3305, 3270, 3306, 3307, 3313, 3296, 3307, 3313, 2942, 2914, 2927, 2935, 2923, 2940, 2893, 2913, 2912, 2938, 2923, 2912, 2938};

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        return A0.s().b0(str, str2.split("\\+\\+"));
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        A0 a0S = A0.s();
        String str = (String) arrayList.get(0);
        a0S.getClass();
        return com.github.catvod.spider.merge.p001b.g.s(A0.s().O(A0.I(str)));
    }

    public static String detailContentVodPlayFrom(int i) {
        String strM459;
        ArrayList arrayList = new ArrayList();
        String strM193 = "quark_original";
        String strG1 = AbstractC0302v0.g1(strM193, i, "");
        String strM186 = "quark_unlimited";
        String strG2 = AbstractC0302v0.g1(strM186, i, "");
        ArrayList arrayList2 = new ArrayList();
        A0.s().getClass();
        Iterator it = Collections.singletonList("智").iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strM459 = "quark_smart";
            if (!zHasNext) {
                break;
            }
            arrayList2.add(AbstractC0302v0.g1(strM459, i, (String) it.next()));
        }
        if (C0299u0.g0(strM193)) {
            arrayList.add(strG1);
        }
        if (C0299u0.g0(strM186)) {
            arrayList.add(strG2);
        }
        if (C0299u0.g0(strM459)) {
            arrayList.addAll(arrayList2);
        }
        return AbstractC0302v0.T0(TextUtils.join("$$$", arrayList));
    }

    public static String detailContentVodPlayUrl(String str) throws Throwable {
        A0.s().getClass();
        try {
            k kVarO = A0.s().O(A0.I(str));
            String strE = kVarO != null ? kVarO.e() : null;
            return strE != null ? strE : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static Object[] localProxy(Map<String, String> map) throws Throwable {
        String str = map.get("type");
        boolean zEquals = "video".equals(str);
        String strM249 = "UTF-8";
        if (!zEquals) {
            return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream(com.github.catvod.spider.merge.D.b.B("Unknown quark proxy type: ", str).getBytes(strM249))};
        }
        A0.s().getClass();
        String strB = AbstractC0309x1.b(map.get("url"));
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
        String strM463 = "quark";
        String strM42 = "quark_vip";
        if (!zContains) {
            map2.put("X-Thread-Num", String.valueOf(com.github.catvod.spider.merge.p009k.a.e().d().c() ? C0299u0.F(strM42) : C0299u0.F(strM463)));
            return C0286p1.b(strB, map2);
        }
        N nZ = X1.z(strB, new HashMap(), map2);
        String strA = nZ.a();
        String strM116 = "\n";
        String[] strArrSplit = strA.split(strM116);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String strM322 = "/";
        sb.append(strB.substring(0, strB.lastIndexOf(strM322)));
        sb.append(strM322);
        String string = sb.toString();
        for (String strX0 : strArrSplit) {
            if (strX0.contains(".ts")) {
                String strI = com.github.catvod.spider.merge.D.b.i(string, strX0);
                String str3 = com.github.catvod.spider.merge.p009k.a.e().d().c() ? strM42 : strM463;
                strX0 = C0299u0.x0(strI, map2, C0299u0.F(str3), str3, null);
                if (TextUtils.isEmpty(strX0)) {
                    return new Object[]{503, "text/plain", new ByteArrayInputStream("本地播放代理正在准备，请稍后重试".getBytes(StandardCharsets.UTF_8))};
                }
            }
            arrayList.add(strX0);
        }
        String strJoin = TextUtils.join(strM116, arrayList);
        Map map3 = (Map) nZ.c;
        List list = (List) map3.get("Content-Type");
        String strM75 = (list == null || list.isEmpty()) ? "application/vnd.apple.mpegurl" : (String) list.get(0);
        HashMap map4 = new HashMap();
        for (String str4 : map3.keySet()) {
            List list2 = (List) map3.get(str4);
            if (list2 != null && !list2.isEmpty()) {
                map4.put(str4, (String) list2.get(0));
            }
        }
        return new Object[]{Integer.valueOf(nZ.a), strM75, new ByteArrayInputStream(strJoin.getBytes(Charset.forName(strM249))), map4};
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

    public void init(Context context, String str) throws Throwable {
        Init.init(context);
        A0.s().m0(str);
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

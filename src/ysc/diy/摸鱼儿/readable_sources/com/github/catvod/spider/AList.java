package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0008;
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
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.h;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class AList extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f1short = {2112, -27960, -32523, 24455, 29115, 1517, 1506, 1518, 1510, 23196, 24500, 2745, 2723, 2736, 2735, 20069, 25778, 26569, -27624, 511, 506, 495, 510, 1786, 1783, 1790, 1771, 26514, 23183, -25506, 21387, 10470, 1010, 992, 1008, 12243, 637, 636, 618, 634, 2248, 2261, 2243, 2242, 2261, 25694, 22851, 25205, 22723, 473, 473, 473, 636, 636, 632, 611, 558, 546, 544, 2311, 2337, 2359, 2336, 2431, 2323, 2357, 2359, 2364, 2342, 1687, 1717, 1696, 1715, 1718, 1718, 1723, 1781, 1775, 1780, 1770, 1786, 1778, 1677, 1715, 1716, 1726, 1717, 1709, 1705, 1786, 1684, 1678, 1786, 1771, 1770, 1780, 1770, 1761, 1786, 1677, 1715, 1716, 1772, 1774, 1761, 1786, 1698, 1772, 1774, 1779, 1786, 1691, 1706, 1706, 1718, 1727, 1677, 1727, 1720, 1681, 1715, 1710, 1781, 1775, 1769, 1773, 1780, 1769, 1772, 1786, 1778, 1681, 1682, 1678, 1687, 1686, 1782, 1786, 1718, 1715, 1713, 1727, 1786, 1693, 1727, 1721, 1713, 1717, 1779, 1786, 1689, 1714, 1704, 1717, 1719, 1727, 1781, 1771, 1768, 1768, 1780, 1770, 1780, 1770, 1780, 1770, 1786, 1673, 1723, 1724, 1723, 1704, 1715, 1781, 1775, 1769, 1773, 1780, 1769, 1772, 1711, 1708, 1700, 1705, 1720, 1725, 1710, 1726, 1763, 1710, 1698, 1696, 2345, 2360, 2359, 2423, 2363, 2360, 2352, 2365, 2348, 2423, 2362, 2358, 2356, 788, 788, 788, 1325, 778, 773, 777, 769, 1176, 1162, 1178, 2713, 2851, 2851, 2851, 2888, 2888, 2888, 1831, 904, 901, 908, 921, 1012, 1001, 1023, 1022, 1001, 918, 932, 948, 930, 933, 1009, 932, 930, 948, 931, 1009, 952, 930, 1009, 949, 952, 930, 944, 947, 957, 948, 949, 2731, 2733, 2747, 2732, 2736, 2751, 2739, 2747, 1809, 1792, 1810, 1810, 1814, 1806, 1811, 1797, 2695, 2761, 2776, 2753, 2695, 2761, 2781, 2780, 2752, 2695, 2756, 2759, 2767, 2753, 2758, 1180, 1177, 1164, 1177, 735, 708, 704, 718, 709, 412, 384, 384, 388, 1229, 1020, 1005, 1016, 996, 289, 304, 290, 290, 294, 318, 291, 309, 535, 601, 584, 593, 535, 606, 587, 535, 607, 605, 588, 2999, 3065, 3048, 3057, 2999, 3048, 3053, 3066, 3060, 3057, 3067, 2999, 3048, 3065, 3052, 3056, 1097, 1100, 1113, 1100, 1609, 1606, 1603, 1610, 1628, 2498, 2496, 2517, 2500, 2502, 2510, 2515, 2520, 2530, 2510, 2511, 2517, 2500, 2511, 2517, 1281, 1967, 1982, 1963, 1975, 3151, 3166, 3148, 3148, 3144, 3152, 3149, 3163, 1310, 1360, 1345, 1368, 1310, 1367, 1346, 1310, 1373, 1368, 1346, 1349, 1002, 932, 949, 940, 1002, 949, 944, 935, 937, 940, 934, 1002, 949, 932, 945, 941, 1888, 1893, 1904, 1893, 1951, 1939, 1938, 1928, 1945, 1938, 1928, 2209, 2222, 2219, 2210, 2228, 1937, 1936, 1921, 1940, 1948, 1945, 1974, 1946, 1947, 1921, 1936, 1947, 1921, 1933, 1930, 1928, 1920, 1958, 1930, 1931, 1937, 1920, 1931, 1937, 1542, 1562, 1559, 1551, 1555, 1540, 1589, 1561, 1560, 1538, 1555, 1560, 1538, 2326, 2304, 2308, 2327, 2310, 2317, 2342, 2314, 2315, 2321, 2304, 2315, 2321};
    public List a;
    public String b;
    public String c;

    class Job implements Callable<List<k>> {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f2short = {1846, 1912, 1897, 1904, 1846, 1919, 1898, 1846, 1898, 1916, 1912, 1899, 1914, 1905, 1515, 1445, 1460, 1453, 1515, 1460, 1457, 1446, 1448, 1453, 1447, 1515, 1463, 1441, 1445, 1462, 1447, 1452, 1377, 1380, 1393, 1380, 1541, 1545, 1544, 1554, 1539, 1544, 1554, 401, 461, 475, 479, 460, 477, 470, 385, 476, 465, 454, 387, 3106, 3185, 3190, 3176, 3129, 3106, 3184, 3197, 3188, 3169, 3129, 3186, 3181, 3168, 3169, 3179, 1333, 1324, 1376, 1406, 1376, 1313, 3019, 496};
        public final com.github.catvod.spider.merge.p004e.a a;
        public final String b;

        public Job(com.github.catvod.spider.merge.p004e.a aVar, String str) {
            this.a = aVar;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<com.github.catvod.spider.merge.b.k>] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
        @Override // java.util.concurrent.Callable
        public List<k> call() {
            ?? EmptyList;
            String str = this.b;
            com.github.catvod.spider.merge.p004e.a aVar = this.a;
            AList aList = AList.this;
            try {
                EmptyList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                sb.append(aVar.e());
                sb.append(aVar.k() ? "/api/fs/search" : "/api/public/search");
                String string = sb.toString();
                String strL = aVar.l(str);
                aList.getClass();
                String strE = AList.e(aVar, string, strL, true);
                boolean zK = aVar.k();
                String strM339 = "data";
                for (com.github.catvod.spider.merge.p004e.c cVar : com.github.catvod.spider.merge.p004e.c.a(zK ? new JSONObject(strE).getJSONObject(strM339).getJSONArray("content").toString() : new JSONObject(strE).getJSONArray(strM339).toString())) {
                    if (!cVar.i(aVar.k())) {
                        EmptyList.add(cVar.f(aVar, aList.b));
                    }
                }
            } catch (Exception unused) {
                EmptyList = Collections.emptyList();
            }
            if (EmptyList.size() <= 0) {
                EmptyList = new ArrayList();
                Iterator it = X1.L(X1.X(aVar.e() + "/search?box=" + str + "&url=&type=video", null, null), "").Q("ul > a").iterator();
                while (it.hasNext()) {
                    String[] strArrSplit = ((com.github.catvod.spider.merge.f0.k) it.next()).T().split("#");
                    String str2 = strArrSplit[0];
                    String strM105 = "/";
                    if (str2.contains(strM105)) {
                        int iLastIndexOf = strArrSplit[0].lastIndexOf(strM105);
                        boolean zI = AbstractC0309x1.i(strArrSplit[0]);
                        com.github.catvod.spider.merge.p004e.c cVar2 = new com.github.catvod.spider.merge.p004e.c();
                        cVar2.o(!zI ? 1 : 0);
                        cVar2.n(strArrSplit.length > 3 ? strArrSplit[4] : "");
                        cVar2.m(strM105 + strArrSplit[0].substring(0, iLastIndexOf));
                        cVar2.l(strArrSplit[0].substring(iLastIndexOf + 1));
                        EmptyList.add(cVar2.f(aVar, aList.b));
                    }
                }
            }
            return EmptyList;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        try {
            for (com.github.catvod.spider.merge.p004e.a aVar : this.a) {
                if (aVar.m().booleanValue()) {
                    aVar.a();
                    arrayList2.add(new Job(aVar, str));
                }
            }
            Iterator it = executorServiceNewCachedThreadPool.invokeAll(arrayList2, 15L, TimeUnit.SECONDS).iterator();
            while (it.hasNext()) {
                arrayList.addAll((Collection) ((Future) it.next()).get());
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        } finally {
            executorServiceNewCachedThreadPool.shutdownNow();
        }
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        a();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (com.github.catvod.spider.merge.p004e.a aVar : this.a) {
            if (!aVar.j().booleanValue()) {
                arrayList.add(new com.github.catvod.spider.merge.p001b.b(aVar.g(), aVar.g(), "1"));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strA = ((com.github.catvod.spider.merge.p001b.b) it.next()).a();
            ArrayList arrayList2 = new ArrayList();
            String strM339 = "預設";
            arrayList2.add(new com.github.catvod.spider.merge.p001b.d("type", "排序類型", Arrays.asList(new com.github.catvod.spider.merge.p001b.c(strM339, ""), new com.github.catvod.spider.merge.p001b.c("名稱", "name"), new com.github.catvod.spider.merge.p001b.c("大小", "size"), new com.github.catvod.spider.merge.p001b.c("修改時間", "date"))));
            arrayList2.add(new com.github.catvod.spider.merge.p001b.d("order", "排序方式", Arrays.asList(new com.github.catvod.spider.merge.p001b.c(strM339, ""), new com.github.catvod.spider.merge.p001b.c("⬆", "asc"), new com.github.catvod.spider.merge.p001b.c("⬇", "desc"))));
            linkedHashMap.put(strA, arrayList2);
        }
        return com.github.catvod.spider.merge.p001b.g.v(arrayList, linkedHashMap);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        HashMap map;
        AbstractC0280n1.u(str, str2);
        String[] strArrSplit = str2.split("~~~");
        String strE = b(strArrSplit[0]).e();
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(strE);
        try {
            Uri uri = Uri.parse(strE);
            map = new HashMap();
            boolean zContains = uri.getHost().contains("115.com");
            String strM432 = "User-Agent";
            if (zContains) {
                map.put(strM432, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
            } else if (uri.getHost().contains("baidupcs.com")) {
                map.put(strM432, "pan.baidu.com");
            }
        } catch (Exception unused) {
            map = new HashMap();
        }
        gVar.h(map);
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            String strM234 = "@@@";
            if (str3.contains(strM234)) {
                String[] strArrSplit2 = str3.split(strM234);
                String str4 = strArrSplit2[0];
                String str5 = strArrSplit2[1];
                String strE2 = b(strArrSplit2[2]).e();
                h hVar = new h();
                hVar.c(str4);
                hVar.a(str5);
                hVar.d(strE2);
                arrayList.add(hVar);
            }
        }
        gVar.B(arrayList);
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        a();
        String str = list.get(0);
        String strM539 = "/";
        String strSubstring = str.contains(strM539) ? str.substring(0, str.indexOf(strM539)) : str;
        String strSubstring2 = str.substring(0, str.lastIndexOf(strM539));
        String strSubstring3 = strSubstring2.substring(strSubstring2.lastIndexOf(strM539) + 1);
        com.github.catvod.spider.merge.p004e.a aVarC = c(strSubstring);
        List<com.github.catvod.spider.merge.p004e.c> listD = d(strSubstring2, false);
        Collections.sort(listD, new com.github.catvod.spider.merge.p004e.f("name", 0, "asc"));
        k kVar = new k();
        kVar.q(strSubstring);
        kVar.n(str);
        kVar.o(strSubstring3);
        kVar.p(this.b);
        ArrayList arrayList = new ArrayList();
        for (com.github.catvod.spider.merge.p004e.c cVar : listD) {
            if (cVar.k(aVarC.k())) {
                StringBuilder sb = new StringBuilder();
                sb.append(cVar.c());
                sb.append("$");
                sb.append(cVar.h(strSubstring2));
                StringBuilder sb2 = new StringBuilder();
                for (com.github.catvod.spider.merge.p004e.c cVar2 : listD) {
                    if (AbstractC0309x1.d.contains(AbstractC0309x1.g(cVar2.c()))) {
                        sb2.append("~~~");
                        sb2.append(cVar2.c());
                        String strM314 = "@@@";
                        sb2.append(strM314);
                        sb2.append(AbstractC0309x1.g(cVar2.c()));
                        sb2.append(strM314);
                        sb2.append(cVar2.h(strSubstring2));
                    }
                }
                sb.append(sb2.toString());
                arrayList.add(sb.toString());
            }
        }
        kVar.r(TextUtils.join("#", arrayList));
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        a();
        String strM70 = "type";
        String str3 = map.containsKey(strM70) ? map.get(strM70) : "";
        String strM414 = "order";
        String str4 = map.containsKey(strM414) ? map.get(strM414) : "";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (com.github.catvod.spider.merge.p004e.c cVar : d(str, true)) {
            if (cVar.j()) {
                arrayList.add(cVar);
            } else {
                arrayList2.add(cVar);
            }
        }
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            Collections.sort(arrayList, new com.github.catvod.spider.merge.p004e.f(str3, 0, str4));
            Collections.sort(arrayList2, new com.github.catvod.spider.merge.p004e.f(str3, 0, str4));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((com.github.catvod.spider.merge.p004e.c) it.next()).g(str, this.b));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((com.github.catvod.spider.merge.p004e.c) it2.next()).g(str, this.b));
        }
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.F(arrayList3);
        gVar.o(1, 1, 0, 1);
        return gVar.r();
    }

    public static String e(com.github.catvod.spider.merge.p004e.a aVar, String str, String str2, boolean z) {
        String strA = X1.M(str, str2, aVar.d()).a();
        SpiderDebug.log(strA);
        if (z && strA.contains("Guest user is disabled")) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("username", aVar.f().b());
                jSONObject.put("password", aVar.f().a());
                aVar.n(new JSONObject(X1.P(aVar.e() + "/api/auth/login", jSONObject.toString())).getJSONObject("data").getString("token"));
                return e(aVar, str, str2, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return strA;
    }

    public final void a() {
        List list = this.a;
        if (list == null || list.isEmpty()) {
            if (this.c.startsWith("http")) {
                this.c = X1.X(this.c, null, null);
            }
            com.github.catvod.spider.merge.p004e.a aVar = (com.github.catvod.spider.merge.p004e.a) new Gson().fromJson(this.c, com.github.catvod.spider.merge.p004e.a.class);
            this.a = aVar.c();
            this.b = aVar.i();
        }
    }

    public final com.github.catvod.spider.merge.p004e.c b(String str) {
        String strM75 = "/";
        try {
            String strSubstring = str.contains(strM75) ? str.substring(0, str.indexOf(strM75)) : str;
            String strSubstring2 = str.contains(strM75) ? str.substring(str.indexOf(strM75)) : "";
            com.github.catvod.spider.merge.p004e.a aVarC = c(strSubstring);
            if (!strSubstring2.startsWith(aVarC.h())) {
                strSubstring2 = aVarC.h() + strSubstring2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", strSubstring2);
            jSONObject.put("password", aVarC.b(strSubstring2));
            StringBuilder sb = new StringBuilder();
            sb.append(aVarC.e());
            sb.append(aVarC.k() ? "/api/fs/get" : "/api/public/path");
            String strE = e(aVarC, sb.toString(), jSONObject.toString(), true);
            boolean zK = aVarC.k();
            String strM382 = "data";
            return (com.github.catvod.spider.merge.p004e.c) new Gson().fromJson(zK ? new JSONObject(strE).getJSONObject(strM382).toString() : new JSONObject(strE).getJSONObject(strM382).getJSONArray("files").getJSONObject(0).toString(), com.github.catvod.spider.merge.p004e.c.class);
        } catch (Exception unused) {
            return new com.github.catvod.spider.merge.p004e.c();
        }
    }

    public final com.github.catvod.spider.merge.p004e.a c(String str) {
        List list = this.a;
        com.github.catvod.spider.merge.p004e.a aVar = (com.github.catvod.spider.merge.p004e.a) list.get(list.indexOf(new com.github.catvod.spider.merge.p004e.a(str)));
        aVar.a();
        return aVar;
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

    public final List d(String str, boolean z) {
        String strM477 = "/";
        try {
            String strSubstring = str.contains(strM477) ? str.substring(0, str.indexOf(strM477)) : str;
            String strSubstring2 = str.contains(strM477) ? str.substring(str.indexOf(strM477)) : "";
            com.github.catvod.spider.merge.p004e.a aVarC = c(strSubstring);
            if (!strSubstring2.startsWith(aVarC.h())) {
                strSubstring2 = aVarC.h() + strSubstring2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", strSubstring2);
            jSONObject.put("password", aVarC.b(strSubstring2));
            StringBuilder sb = new StringBuilder();
            sb.append(aVarC.e());
            sb.append(aVarC.k() ? "/api/fs/list" : "/api/public/path");
            String strE = e(aVarC, sb.toString(), jSONObject.toString(), true);
            boolean zK = aVarC.k();
            String strM126 = "data";
            List listA = com.github.catvod.spider.merge.p004e.c.a(zK ? new JSONObject(strE).getJSONObject(strM126).getJSONArray("content").toString() : new JSONObject(strE).getJSONObject(strM126).getJSONArray("files").toString());
            Iterator it = listA.iterator();
            if (z) {
                while (it.hasNext()) {
                    if (((com.github.catvod.spider.merge.p004e.c) it.next()).i(aVarC.k())) {
                        it.remove();
                    }
                }
            }
            return listA;
        } catch (Exception unused) {
            return Collections.emptyList();
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

    public void init(Context context, String str) {
        Init.init(context);
        try {
            this.c = str;
            a();
        } catch (Exception unused) {
        }
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
}

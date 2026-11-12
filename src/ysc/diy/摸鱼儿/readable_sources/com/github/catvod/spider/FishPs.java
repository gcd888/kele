package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0244b1;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0241a1;
import com.github.catvod.spider.merge.A.C0261h0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.l;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.c1;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.h;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class FishPs extends Cloud {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f46short = {2008, 8469, 1964, 25588, -25616, 29012, 25488, -29646, 30946, -1916, 24736, 26908, 24995, 31011, 25488, 31406, -1915, 1384, 1406, 1391, 1391, 1394, 1397, 1404, 2631, 2263, 2201, 2184, 2193, 2263, 2187, 2205, 2201, 2186, 2203, 2192, 2247, 2195, 2191, 2245, 1331, 1330, 1312, 1355, 1374, 1656, 1580, 1595, 1581, 1635, 1587, 1595, 1580, 1593, 1595, 404, 401, 388, 401, 2088, 2080, 2103, 2082, 2080, 2081, 2074, 2087, 2108, 2074, 2097, 2108, 2101, 2080, 2874, 2877, 2851, 3128, 3127, 3122, 3114, 3131, 3116, 503, 490, 508, 509, 490, 2769, 2781, 2756, 816, 810, 823, 806, 2813, 2810, 2812, 2799, 2810, 2795, 2793, 2807, 2448, 2459, 2450, 2461, 2461, 2454, 2463, 2432, 1737, 1758, 1736, 1758, 1743, 2633, 2638, 2627, 2636, 2645, 2628, 2629, 2624, 2653, 2630, 2633, 2640, 2625, 2624, 3309, 3296, 3322, 3321, 3301, 3304, 3312, 1359, 1348, 1353, 1359, 1351, 1635, 1645, 1649, 1663, 1639, 1658, 1644, 1659, 1680, 1693, 1684, 1672, 28711, 25315, 32318, 21604, 32203, 22417, 23323, 25932, 22412, 18552, 18658, -30316, -1563, -30414, 22412, -29425, 26156, 25375, 18931, 25913, 32723, 25913, 18509, 22687, 32160, 22892, -1550, 25027, 23909, 25849, 25375, 24683, 18660, 24791, 32723, 21878, 29650, 14059, 27855, -25944, 29835, 17780, 17902, -31592, 28179, 17464, 26852, 22650, 29476, 22910, -24805, -31222, 15335, 31607, 20781, 19751, 19901, -29493, 25908, 19899, 20569, 30366, -838, -30655, 25683, 29885, 23695, 31009, 24678, 31372, 13236, 629, 562, 574, 547, 616, 806, 2285, 2299, 2282, 2282, 2295, 2288, 2297, 3318, 1773, 1762, 1784, 1763, 1787, 1784, 1739, 1739, 2513, 2513, 1038, 1033, 1047, 2460, 2516, 2523, 2497, 2522, 2498, 2497, 2541, 2513, 2525, 2524, 2516, 2523, 2517, 1633, 1635, 1652, 1641, 1647, 1646, 2300, 2302, 2283, 2298, 2296, 2288, 2285, 2278, 2268, 2288, 2289, 2283, 2298, 2289, 2283, 1849, 1848, 1833, 1852, 1844, 1841, 1822, 1842, 1843, 1833, 1848, 1843, 1833, 657, 662, 660, 668, 698, 662, 663, 653, 668, 663, 653, 2396, 2368, 2381, 2389, 2377, 2398, 2415, 2371, 2370, 2392, 2377, 2370, 2392, 1343, 1321, 1325, 1342, 1327, 1316, 1295, 1315, 1314, 1336, 1321, 1314, 1336, 789, 771, 775, 788, 773, 782, 805, 777, 776, 786, 771, 776, 786};
    public final com.github.catvod.spider.merge.p020x.b r;
    public final C0261h0 s;
    public final h t;
    public C0261h0 u;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.D.b.z("setting", "⚙ 摸鱼盘搜设置（本源是纯搜索）", null, arrayList);
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, com.github.catvod.spider.merge.m0.a.a(this.r));
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        h hVar;
        List list;
        List list2;
        ArrayList arrayList;
        C0261h0 c0261h0;
        int[] iArr;
        com.github.catvod.spider.merge.p020x.b bVar;
        Object obj;
        int i;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        h hVar2 = this.t;
        hVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        if (!"1".equals(str2)) {
            return com.github.catvod.spider.merge.p001b.g.y(arrayList2);
        }
        Object obj2 = new Object();
        com.github.catvod.spider.merge.p020x.b bVar2 = hVar2.a;
        int[] iArr2 = {bVar2.t};
        com.github.catvod.spider.merge.p020x.g gVar = new com.github.catvod.spider.merge.p020x.g(hVar2, iArr2, obj2);
        C0261h0 c0261h1 = this.s;
        com.github.catvod.spider.merge.p020x.b bVar3 = (com.github.catvod.spider.merge.p020x.b) c0261h1.b;
        ArrayList arrayListF = bVar3.f();
        JSONObject jSONObject3 = null;
        if (arrayListF.isEmpty()) {
            c0261h0 = c0261h1;
            iArr = iArr2;
            bVar = bVar2;
            hVar = hVar2;
            obj = obj2;
        } else {
            int size = arrayListF.size();
            ArrayList arrayList3 = (ArrayList) c0261h1.c;
            if (size == 1) {
                String str3 = (String) arrayListF.get(0);
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(X1.X(str3 + "/api/search?kw=" + URLEncoder.encode(str, "UTF-8") + "&res=merge" + bVar3.b() + bVar3.c(), null, com.github.catvod.spider.merge.p020x.b.i(str3))).optJSONObject("data");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("merged_by_type") : null;
                    if (jSONObjectOptJSONObject2 == null || jSONObjectOptJSONObject2.length() <= 0) {
                        arrayList3.clear();
                    } else {
                        arrayList3.clear();
                        arrayList3.add(str3);
                        try {
                            hVar2.c(AbstractC0244b1.i(jSONObjectOptJSONObject2, new C0241a1(bVar2.f, bVar2.g, bVar2.h, bVar2.n)), iArr2, obj2);
                        } catch (Exception unused) {
                        }
                        jSONObject3 = jSONObjectOptJSONObject2;
                    }
                } catch (Exception unused2) {
                }
                c0261h0 = c0261h1;
                iArr = iArr2;
                bVar = bVar2;
                hVar = hVar2;
                obj = obj2;
            } else {
                List listSynchronizedList = Collections.synchronizedList(new ArrayList());
                List listSynchronizedList2 = Collections.synchronizedList(new ArrayList());
                CountDownLatch countDownLatch = new CountDownLatch(arrayListF.size());
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                hVar = hVar2;
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(arrayListF.size());
                try {
                    try {
                        String strC = bVar3.c();
                        String strB = bVar3.b();
                        Iterator it = arrayListF.iterator();
                        while (it.hasNext()) {
                            list = listSynchronizedList;
                            CountDownLatch countDownLatch3 = countDownLatch2;
                            obj = obj2;
                            list2 = listSynchronizedList2;
                            arrayList = arrayList3;
                            i = 1;
                            jSONObject = null;
                            c0261h0 = c0261h1;
                            com.github.catvod.spider.merge.p020x.g gVar2 = gVar;
                            iArr = iArr2;
                            bVar = bVar2;
                            try {
                                executorServiceNewFixedThreadPool.submit(new c1(c0261h1, (String) it.next(), str, strB, strC, list, list2, gVar, countDownLatch3, countDownLatch));
                                countDownLatch2 = countDownLatch3;
                                obj2 = obj;
                                listSynchronizedList = list;
                                listSynchronizedList2 = list2;
                                arrayList3 = arrayList;
                                c0261h1 = c0261h0;
                                gVar = gVar2;
                                iArr2 = iArr;
                                bVar2 = bVar;
                            } catch (Exception unused3) {
                            }
                        }
                        list = listSynchronizedList;
                        list2 = listSynchronizedList2;
                        arrayList = arrayList3;
                        c0261h0 = c0261h1;
                        iArr = iArr2;
                        bVar = bVar2;
                        obj = obj2;
                        i = 1;
                        jSONObject = null;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        if (countDownLatch2.await(6000L, timeUnit)) {
                            countDownLatch.await(3500L, timeUnit);
                        } else {
                            countDownLatch.await(1000L, timeUnit);
                        }
                    } catch (Throwable th) {
                        executorServiceNewFixedThreadPool.shutdownNow();
                        throw th;
                    }
                } catch (Exception unused4) {
                    list = listSynchronizedList;
                    list2 = listSynchronizedList2;
                    arrayList = arrayList3;
                    c0261h0 = c0261h1;
                    iArr = iArr2;
                    bVar = bVar2;
                    obj = obj2;
                    i = 1;
                    jSONObject = null;
                }
                executorServiceNewFixedThreadPool.shutdownNow();
                arrayList.clear();
                arrayList.addAll(list2);
                if (list.isEmpty()) {
                    jSONObject3 = jSONObject;
                } else if (list.size() == i) {
                    jSONObject3 = (JSONObject) list.get(0);
                } else {
                    List<JSONObject> list3 = list;
                    try {
                        jSONObject2 = new JSONObject();
                        HashMap map = new HashMap();
                        for (JSONObject jSONObject4 : list3) {
                            Iterator<String> itKeys = jSONObject4.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                JSONArray jSONArrayOptJSONArray = jSONObject4.optJSONArray(next);
                                if (jSONArrayOptJSONArray != null) {
                                    if (!map.containsKey(next)) {
                                        map.put(next, new HashSet());
                                    }
                                    Set set = (Set) map.get(next);
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(next);
                                    if (jSONArrayOptJSONArray2 == null) {
                                        jSONArrayOptJSONArray2 = new JSONArray();
                                        jSONObject2.put(next, jSONArrayOptJSONArray2);
                                    }
                                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i2);
                                        if (jSONObjectOptJSONObject3 != null) {
                                            String strOptString = jSONObjectOptJSONObject3.optString("url", "");
                                            if (!strOptString.isEmpty() && !set.contains(strOptString)) {
                                                set.add(strOptString);
                                                jSONArrayOptJSONArray2.put(jSONObjectOptJSONObject3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception unused5) {
                        jSONObject2 = (JSONObject) list3.get(0);
                    }
                    jSONObject3 = jSONObject2;
                }
            }
        }
        if (jSONObject3 == null) {
            return com.github.catvod.spider.merge.p001b.g.y(arrayList2);
        }
        try {
            com.github.catvod.spider.merge.p020x.b bVar4 = bVar;
            LinkedHashMap linkedHashMapI = AbstractC0244b1.i(jSONObject3, new C0241a1(bVar4.f, bVar4.g, bVar4.h, bVar4.n));
            String strG = c0261h0.g();
            h hVar3 = hVar;
            hVar3.c(linkedHashMapI, iArr, obj);
            if (bVar4.o) {
                hVar3.a(str, linkedHashMapI, strG, arrayList2);
            } else {
                hVar3.b(linkedHashMapI, strG, arrayList2);
            }
        } catch (Exception unused6) {
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList2);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        AbstractC0280n1.u(str, str2);
        String strX = AbstractC0302v0.X(str, str2);
        return strX != null ? strX : super.playerContent(str, str2, list);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strJ1;
        String strM473;
        String str = list.get(0);
        String strTrim = "";
        if ("filter".equals(str) || "order".equals(str) || "max".equals(str) || "site".equals(str) || "strategy".equals(str) || "channels".equals(str) || "reset".equals(str) || "include".equals(str) || "exclude".equals(str) || "display".equals(str) || "check".equals(str) || "keywords".equals(str) || "help".equals(str)) {
            AbstractC0302v0.g0(str, new i(8, this));
            return "";
        }
        String[] strArrK = l.k(str);
        String strG = l.g(strArrK);
        if (!AbstractC0302v0.r0(strG)) {
            String strL = l.l(strArrK, 2);
            String strG2 = l.g(strArrK);
            String strL2 = l.l(strArrK, 4);
            Pattern pattern = com.github.catvod.spider.merge.p020x.f.a;
            com.github.catvod.spider.merge.p020x.b bVar = this.r;
            if (bVar.p != 0) {
                String strC = com.github.catvod.spider.merge.p020x.f.C(strL);
                strTrim = strG2 != null ? strG2.replace("&amp;", "&").trim() : "";
                if (!TextUtils.isEmpty(strC) && !TextUtils.isEmpty(strTrim) && com.github.catvod.spider.merge.p020x.f.v(strTrim)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new com.github.catvod.spider.merge.p020x.d(strL, strTrim, strL2));
                    com.github.catvod.spider.merge.p020x.f.B(arrayList, bVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(strG);
            String strDetailContent = super.detailContent(arrayList2);
            return l.j(strDetailContent) ? l.i(str, strArrK) : l.c(strDetailContent, strArrK);
        }
        String strL3 = l.l(strArrK, 1);
        if (TextUtils.isEmpty(strL3)) {
            strL3 = "盘搜磁力";
        }
        boolean zJ0 = AbstractC0302v0.j0();
        boolean zC1 = AbstractC0302v0.C1();
        if (zJ0) {
            strJ1 = AbstractC0302v0.j1(strL3, strG);
        } else {
            strJ1 = zC1 ? strG : "";
        }
        if (zJ0) {
            strTrim = AbstractC0302v0.h1(strG);
        } else if (zC1) {
            strTrim = "磁力";
        }
        if (!zJ0 && AbstractC0302v0.Y()) {
            AbstractC0302v0.D1();
        }
        k kVar = new k();
        kVar.n(str);
        kVar.o(strL3);
        kVar.q(strTrim);
        kVar.r(strJ1);
        if (AbstractC0302v0.j0()) {
            strM473 = "已接入云下载，进入详情时会提示提交并等待；未完成时暂不显示原画。";
        } else {
            strM473 = zC1 ? "未配置云下载时保持原磁力链路。" : "磁力云下载暂不可用，请查看弹窗提示。";
        }
        l.b(kVar, strArrK, strM473);
        AbstractC0280n1.p(strL3);
        AbstractC0280n1.q(strJ1);
        boolean z = FishCrypto.a;
        N1.d(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        if (this.u == null) {
            this.u = new C0261h0(this.r, 7);
        }
        this.u.i(str);
        return "";
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        boolean zEquals = "setting".equals(str);
        String strM414 = "1";
        if (zEquals && strM414.equals(str2)) {
            return com.github.catvod.spider.merge.p001b.g.y(com.github.catvod.spider.merge.m0.a.a(this.r));
        }
        h hVar = this.t;
        hVar.getClass();
        if (str.startsWith("fishps@@") && strM414.equals(str2)) {
            ArrayList arrayList = new ArrayList();
            List list = (List) h.b.get(str);
            if (list != null) {
                String[] strArrSplit = str.split("@@");
                String str3 = strArrSplit.length > 2 ? strArrSplit[2] : "";
                ArrayList<JSONObject> arrayListF = hVar.f(list);
                Pattern pattern = com.github.catvod.spider.merge.p020x.f.a;
                if (arrayListF.size() >= 2) {
                    Collections.sort(arrayListF, new com.github.catvod.spider.merge.U.a(2));
                }
                com.github.catvod.spider.merge.p020x.b bVar = hVar.a;
                int i = bVar.n;
                int iE = h.e(arrayListF);
                if (i > 0) {
                    iE = Math.min(iE, i);
                }
                int i2 = 0;
                for (JSONObject jSONObject : arrayListF) {
                    if (i > 0 && i2 >= i) {
                        break;
                    }
                    if (!jSONObject.optString("url", "").isEmpty()) {
                        k kVarF = l.f(str3, com.github.catvod.spider.merge.p020x.b.l(str3), "", jSONObject);
                        com.github.catvod.spider.merge.p020x.f.m(kVarF, jSONObject, bVar);
                        i2++;
                        h.d(kVarF, i2, iE);
                        arrayList.add(kVarF);
                    }
                }
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        }
        return com.github.catvod.spider.merge.D.b.d();
    }

    public FishPs() {
        com.github.catvod.spider.merge.p020x.b bVar = new com.github.catvod.spider.merge.p020x.b(".fishps_config");
        this.r = bVar;
        this.s = new C0261h0(bVar, 8);
        this.t = new h(bVar);
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "action");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$b5d914d976e0069f = $host$b5d914d976e0069f(str);
            FishCrypto.endHostEntry(null);
            return str$host$b5d914d976e0069f;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
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
        com.github.catvod.spider.merge.p020x.b bVar = this.r;
        bVar.o();
        bVar.a("", str);
        this.u = new C0261h0(bVar, 7);
    }

    @Override // com.github.catvod.spider.Cloud
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

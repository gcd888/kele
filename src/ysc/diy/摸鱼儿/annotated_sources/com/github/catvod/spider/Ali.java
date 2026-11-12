package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.p000a.C0349e;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p003d.n;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Ali extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f5short = {894, 777, 2614, 2665, 2665, 2665, 2626, 2608, 2615, 2593, 2614, 2687, 2674, 2679, 2663, 2667, 2672, 2682, 2668, 2679, 2664, 2683, 2626, 2608, 2685, 2673, 2675, 2658, 2687, 2674, 2679, 2670, 2687, 2672, 2626, 2608, 2685, 2673, 2675, 2615, 2609, 2669, 2609, 2614, 2629, 2624, 2609, 2627, 2613, 2615, 2614, 2609, 2680, 2673, 2674, 2682, 2683, 2668, 2609, 2614, 2629, 2624, 2609, 2627, 2613, 2615, 2615, 2593, 1563, 1536, 1545, 1562, 1549, 1591, 1537, 1548, 3111, 3106, 3124, 3119, 3120, 3107, 3177, 3120, 3189, 3177, 3125, 3118, 3111, 3124, 3107, 3097, 3114, 3119, 3112, 3117, 3177, 3105, 3107, 3122, 3097, 3125, 3118, 3111, 3124, 3107, 3097, 3108, 3135, 3097, 3111, 3112, 3113, 3112, 3135, 3115, 3113, 3123, 3125, 1354, 1351, 1346, 1396, 1348, 1369, 1346, 1356, 1346, 1349, 1354, 1351, 1425, 1436, 1433, 1455, 1411, 1437, 1425, 1410, 1412, 3172, 2082, 958, 958, 958, 2875, 2269, 2269, 2269, 745, 740, 737, 2134, 2139, 2142, 2152, 2136, 2117, 2142, 2128, 2142, 2137, 2134, 2139, 1445, 1448, 1453, 1435, 1463, 1449, 1445, 1462, 1456, 848, 848, 848, -25987, -25202, -28683, 24468, 26863, 27004, 23410, 23298, 23992, -26277, 3192, 1704, 1701, 1708, 1721, 1076, 1067, 1062, 1063, 1069, 681, 687, 696, 1933, 1974, 1971, 1974, 1975, 1967, 1974, 2040, 1977, 1972, 1969, 2040, 1960, 1962, 1975, 1952, 1953, 2040, 1964, 1953, 1960, 1981, 2018, 2040, 3064, 3065, 3051, 2944, 2965, 2230, 2215, 2234, 2230, 2285, 2226, 2222, 2211, 2219, 2220, 2297, 2274, 2209, 2218, 2211, 2224, 2225, 2215, 2230, 2303, 2231, 2230, 2212, 2287, 2298, 391, 390, 407, 386, 394, 399, 416, 396, 397, 407, 390, 397, 407, 1424, 1420, 1409, 1433, 1413, 1426, 1443, 1423, 1422, 1428, 1413, 1422, 1428};
    public static final Pattern a = Pattern.compile(C0118.m471(f5short, 2, 66, 2590));

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        return C0349e.j().L(str, str2.split(C0128.m511(f5short, 0, 2, 802)));
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        String strTrim = ((String) arrayList.get(0)).trim();
        Matcher matcher = a.matcher(strTrim);
        return matcher.find() ? com.github.catvod.spider.merge.p001b.g.s(a(matcher, strTrim)) : "";
    }

    public static k a(Matcher matcher, String str) throws Throwable {
        String strGroup = matcher.group(3);
        String strGroup2 = matcher.groupCount() >= 5 ? matcher.group(5) : "";
        C0349e c0349eJ = C0349e.j();
        if (!c0349eJ.A()) {
            c0349eJ.B();
        }
        c0349eJ.S(strGroup);
        n nVar = c0349eJ.k;
        if (nVar == null || nVar.e().isEmpty()) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(C0103.m408(f5short, 68, 8, 1640), strGroup);
        n nVar2 = (n) new Gson().fromJson(C0349e.M(jsonObject, C0122.m486(f5short, 76, 43, 3142)), n.class);
        ArrayList<com.github.catvod.spider.merge.p003d.g> arrayList = new ArrayList();
        ArrayList<com.github.catvod.spider.merge.p003d.g> arrayList2 = new ArrayList();
        com.github.catvod.spider.merge.p003d.g gVar = new com.github.catvod.spider.merge.p003d.g(C0349e.u(strGroup2, nVar2));
        int i = C0349e.n;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i);
        try {
            c0349eJ.G(strGroup, gVar, Collections.synchronizedList(arrayList), Collections.synchronizedList(arrayList2), executorServiceNewFixedThreadPool, new Semaphore(i));
            executorServiceNewFixedThreadPool.shutdownNow();
            Collections.sort(arrayList, new com.github.catvod.spider.merge.p021y.d(2, c0349eJ));
            Collections.sort(arrayList2, new com.github.catvod.spider.merge.p021y.d(2, c0349eJ));
            ArrayList arrayList3 = new ArrayList();
            String strM182 = C0046.m182(f5short, 119, 12, 1323);
            if (C0299u0.g0(strM182)) {
                arrayList3.add(AbstractC0302v0.f1(strM182));
            }
            String strM54 = C0014.m54(f5short, 131, 9, 1520);
            if (C0299u0.g0(strM54)) {
                arrayList3.add(AbstractC0302v0.f1(strM54));
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (com.github.catvod.spider.merge.p003d.g gVar2 : arrayList) {
                StringBuilder sb = new StringBuilder();
                sb.append(gVar2.b());
                sb.append(C0119.m473(f5short, 140, 1, 3136));
                sb.append(strGroup);
                String strM511 = C0128.m511(f5short, 141, 1, 2057);
                sb.append(strM511);
                sb.append(gVar2.d());
                String strF = gVar2.f();
                ArrayList<com.github.catvod.spider.merge.p003d.g> arrayList6 = new ArrayList();
                String lowerCase = AbstractC0309x1.l(strF).toLowerCase();
                for (com.github.catvod.spider.merge.p003d.g gVar3 : arrayList2) {
                    String lowerCase2 = AbstractC0309x1.l(gVar3.f()).toLowerCase();
                    if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                        arrayList6.add(gVar3);
                    }
                }
                if (arrayList6.isEmpty()) {
                    arrayList6.addAll(arrayList2);
                }
                StringBuilder sb2 = new StringBuilder();
                for (com.github.catvod.spider.merge.p003d.g gVar4 : arrayList6) {
                    sb2.append(strM511);
                    sb2.append(AbstractC0309x1.l(gVar4.f()));
                    String strM414 = C0104.m414(f5short, 142, 3, 1022);
                    sb2.append(strM414);
                    sb2.append(gVar4.c());
                    sb2.append(strM414);
                    sb2.append(gVar4.d());
                }
                sb.append(sb2.toString());
                arrayList4.add(sb.toString());
            }
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                arrayList5.add(TextUtils.join(C0008.m31(f5short, 145, 1, 2840), arrayList4));
            }
            k kVar = new k();
            kVar.n(str);
            kVar.l(str);
            kVar.p(nVar2.b());
            kVar.o(nVar2.d());
            String strM33 = C0009.m33(f5short, 146, 3, 2297);
            kVar.r(TextUtils.join(strM33, arrayList5));
            kVar.q(TextUtils.join(strM33, arrayList3));
            kVar.i(AbstractC0302v0.Y0(C0140.m558(f5short, 149, 3, 648)));
            return AbstractC0302v0.f(kVar);
        } catch (Throwable th) {
            executorServiceNewFixedThreadPool.shutdownNow();
            throw th;
        }
    }

    public static String detailContentVodPlayFrom(int i) {
        ArrayList arrayList = new ArrayList();
        String strM285 = C0072.m285(f5short, 152, 12, 2103);
        if (C0299u0.g0(strM285)) {
            arrayList.add(AbstractC0302v0.g1(strM285, i, ""));
        }
        String strM31 = C0008.m31(f5short, 164, 9, 1476);
        if (C0299u0.g0(strM31)) {
            arrayList.add(AbstractC0302v0.g1(strM31, i, ""));
        }
        return AbstractC0302v0.T0(TextUtils.join(C0120.m477(f5short, 173, 3, 884), arrayList));
    }

    public static String detailContentVodPlayUrl(String str) throws Throwable {
        Matcher matcher = a.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        try {
            k kVarA = a(matcher, str);
            return (kVarA == null || kVarA.e() == null) ? "" : kVarA.e();
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0089.m355(f5short, 176, 11, 3138)));
            return "";
        }
    }

    public static Object[] localProxy(Map<String, String> map) {
        String str = map.get(C0018.m70(f5short, 187, 4, 1756));
        if (C0050.m199(f5short, 191, 5, 1090).equals(str)) {
            return C0349e.j().O(map);
        }
        return C0104.m414(f5short, 196, 3, 730).equals(str) ? C0349e.j().N(map) : new Object[]{400, C0106.m422(f5short, 228, 25, 2242), new ByteArrayInputStream(com.github.catvod.spider.merge.D.b.B(C0018.m70(f5short, 199, 24, 2008), str).getBytes(C0045.m177(f5short, 223, 5, 2989)))};
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0089.m355(f5short, 253, 13, 483));
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
        C0349e.j().j = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0072.m285(f5short, 266, 13, 1504));
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

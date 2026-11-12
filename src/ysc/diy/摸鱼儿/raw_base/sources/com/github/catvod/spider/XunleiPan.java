package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0286p1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.l1;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class XunleiPan extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f116short = {294, 337, 294, 337, 2153, 2148, 2175, 2173, 2164, 2168, 2126, 2146, 2172, 2160, 2147, 2149, 2558, 2547, 2536, 2538, 2531, 2543, 2521, 2537, 2548, 2543, 2529, 2543, 2536, 2535, 2538, 2948, 2948, 2948, 948, 972, 948, 972, 948, 972, 1228, 1217, 1242, 1240, 1233, 1245, 1259, 1223, 1241, 1237, 1222, 1216, 2469, 2472, 2483, 2481, 2488, 2484, 2434, 2482, 2479, 2484, 2490, 2484, 2483, 2492, 2481, 3136, 3136, 3136, 314, 311, 318, 299, 676, 699, 694, 695, 701, 496, 503, 489, 750, 739, 743, 738, 739, 756, 1983, 1939, 1939, 1943, 1941, 1945, 1674, 1719, 1708, 1698, 1708, 1707, 1543, 1588, 1595, 1586, 1584, 2172, 2142, 2142, 2136, 2125, 2121, 791, 821, 821, 819, 806, 802, 891, 787, 824, 821, 825, 818, 831, 824, 817, 975, 1005, 1005, 1003, 1022, 1018, 931, 962, 1007, 992, 1001, 1019, 1007, 1001, 1003, 1012, 963, 960, 963, 980, 963, 980, 857, 895, 873, 894, 801, 845, 875, 873, 866, 888, 1147, 1142, 1133, 1135, 1126, 1130, 1113, 1068, 1109, 1129, 1139, 1124, 1120, 1125, 1068, 1103, 1140, 1132, 1242, 1249, 1252, 1249, 1248, 1272, 1249, 1199, 1271, 1274, 1249, 1251, 1258, 1254, 1199, 1279, 1277, 1248, 1271, 1270, 1199, 1275, 1270, 1279, 1258, 1205, 1199, 1417, 1416, 1434, 1521, 1508, 2646, 2631, 2650, 2646, 2573, 2642, 2638, 2627, 2635, 2636, 2585, 2562, 2625, 2634, 2627, 2640, 2641, 2631, 2646, 2591, 2647, 2646, 2628, 2575, 2586, 2637, 2636, 2653, 2632, 2624, 2629, 2666, 2630, 2631, 2653, 2636, 2631, 2653, 3078, 3098, 3095, 3087, 3091, 3076, 3125, 3097, 3096, 3074, 3091, 3096, 3074};

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        return l1.I().q0(str, str2.split(C0125.m499(f116short, 0, 4, 378)));
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        l1 l1VarI = l1.I();
        String str = (String) arrayList.get(0);
        l1VarI.getClass();
        return com.github.catvod.spider.merge.p001b.g.s(l1.I().V(l1.S(str)));
    }

    public static String detailContentVodPlayFrom(int i) {
        l1.I().getClass();
        ArrayList arrayList = new ArrayList();
        String strM193 = C0049.m193(f116short, 4, 12, 2065);
        boolean zG0 = C0299u0.g0(strM193);
        String strM65 = C0017.m65(f116short, 16, 15, 2438);
        boolean zG1 = C0299u0.g0(strM65);
        if (zG0) {
            arrayList.add(AbstractC0302v0.g1(strM193, i, ""));
        }
        if (zG1) {
            arrayList.add(AbstractC0302v0.g1(strM65, i, ""));
        }
        return AbstractC0302v0.T0(TextUtils.join(C0082.m325(f116short, 31, 3, 2976), arrayList));
    }

    public static String detailContentVodPlayUrl(String str) throws Throwable {
        l1 l1VarI = l1.I();
        l1VarI.getClass();
        String strM301 = C0076.m301(f116short, 34, 6, 1000);
        String strM65 = C0017.m65(f116short, 40, 12, 1204);
        boolean zG0 = C0299u0.g0(strM65);
        String strM463 = C0116.m463(f116short, 52, 15, 2525);
        boolean zG1 = C0299u0.g0(strM463);
        ArrayList arrayList = new ArrayList();
        try {
            k kVarV = l1VarI.V(l1.S(str));
            if (kVarV != null && kVarV.e() != null) {
                String[] strArrSplit = kVarV.d().split(strM301);
                String[] strArrSplit2 = kVarV.e().split(strM301);
                for (int i = 0; i < strArrSplit.length && i < strArrSplit2.length; i++) {
                    String strL1 = AbstractC0302v0.L1(strArrSplit[i]);
                    if (strM65.equals(strL1) && zG0) {
                        arrayList.add(strArrSplit2[i]);
                    } else if (strM463.equals(strL1) && zG1) {
                        arrayList.add(strArrSplit2[i]);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return TextUtils.join(C0105.m416(f116short, 67, 3, 3172), arrayList);
    }

    public static Object[] localProxy(Map<String, String> map) {
        Map map2;
        String str = map.get(C0053.m210(f116short, 70, 4, 334));
        if (!C0030.m116(f116short, 74, 5, 722).equals(str)) {
            return new Object[]{400, C0008.m31(f116short, 208, 25, 2594), new ByteArrayInputStream(com.github.catvod.spider.merge.D.b.B(C0047.m186(f116short, 176, 27, 1167), str).getBytes(C0074.m292(f116short, 203, 5, 1500)))};
        }
        l1.I().getClass();
        String strB = AbstractC0309x1.b(map.get(C0009.m33(f116short, 79, 3, 389)));
        new HashMap();
        try {
            map2 = (Map) new Gson().fromJson(AbstractC0309x1.b(map.get(C0106.m422(f116short, 82, 6, 646))), Map.class);
            if (map2 == null) {
                map2 = new HashMap();
            }
        } catch (Exception unused) {
            map2 = new HashMap();
        }
        List listAsList = Arrays.asList(C0059.m234(f116short, 100, 5, 1621), C0076.m301(f116short, 105, 6, 2109), C0092.m365(f116short, 111, 15, 854), C0046.m182(f116short, 126, 15, 910), C0096.m382(f116short, 88, 6, 2044), C0056.m223(f116short, 94, 6, 1733), C0055.m219(f116short, 141, 7, 934), C0085.m339(f116short, 148, 10, 780));
        for (String str2 : map.keySet()) {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).toLowerCase().equals(str2.toLowerCase())) {
                    map2.put(str2, map.get(str2));
                }
            }
        }
        map2.put(C0047.m186(f116short, 164, 12, 1025), String.valueOf(C0299u0.F(C0098.m390(f116short, 158, 6, 1027))));
        return C0286p1.b(strB, map2);
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0118.m471(f116short, 233, 13, 2601));
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
        l1 l1VarI = l1.I();
        l1VarI.getClass();
        if (str == null || str.isEmpty()) {
            return;
        }
        l1VarI.E0(str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0092.m365(f116short, 246, 13, 3190));
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

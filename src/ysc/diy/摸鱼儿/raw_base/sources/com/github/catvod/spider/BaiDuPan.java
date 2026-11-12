package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.G.n;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.p000a.C0376s;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0128;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class BaiDuPan extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f15short = {3039, 3036, 3028, 3033, 3016, 3042, 3026, 3023, 3028, 3034, 3028, 3027, 3036, 3025, 2137, 2138, 2130, 2143, 2126, 2148, 2126, 2133, 2135, 2130, 2134, 2130, 2127, 2142, 2143, 2741, 2741, 2741, 2256, 2251, 2242, 2257, 2246, 2294, 2257, 2255, 1542, 1547, 1538, 1559, 2181, 2202, 2199, 2198, 2204, 1298, 1299, 1282, 1303, 1311, 1306, 1333, 1305, 1304, 1282, 1299, 1304, 1282, 1600, 1629, 1617, 1600, 1611, 1601, 806, 826, 823, 815, 819, 804, 789, 825, 824, 802, 819, 824, 802};

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        return C0376s.a.G(I0.c(AbstractC0309x1.b(str2)), str);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        C0376s.a.getClass();
        return com.github.catvod.spider.merge.p001b.g.s(C0376s.x(arrayList));
    }

    public static String detailContentVodPlayFrom(int i) {
        ArrayList arrayList = new ArrayList();
        String strM511 = C0128.m511(f15short, 0, 14, 3005);
        boolean zG0 = C0299u0.g0(strM511);
        String strM31 = C0008.m31(f15short, 14, 15, 2107);
        boolean zG1 = C0299u0.g0(strM31);
        if (zG0 && zG1 && C0299u0.C(strM31) < C0299u0.C(strM511)) {
            arrayList.add(AbstractC0302v0.g1(strM31, i, ""));
            arrayList.add(AbstractC0302v0.g1(strM511, i, ""));
        } else {
            if (zG0) {
                arrayList.add(AbstractC0302v0.g1(strM511, i, ""));
            }
            if (zG1) {
                arrayList.add(AbstractC0302v0.g1(strM31, i, ""));
            }
        }
        return AbstractC0302v0.T0(TextUtils.join(C0076.m301(f15short, 29, 3, 2705), arrayList));
    }

    public static String detailContentVodPlayUrl(String str) {
        try {
            C0376s.a.getClass();
            com.github.catvod.spider.merge.L.a.d(str, C0014.m54(f15short, 32, 8, 2211));
            String strE = C0376s.x(com.github.catvod.spider.merge.G.g.b(str)).e();
            return strE != null ? strE : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static Object[] localProxy(Map<String, String> map) {
        if (!C0122.m486(f15short, 44, 5, 2291).equals(map.get(C0097.m386(f15short, 40, 4, 1650)))) {
            return new Object[0];
        }
        C0376s.a.getClass();
        return n.a.toArray(new Object[0]);
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0006.m21(f15short, 49, 13, 1398));
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
        C0376s.a.getClass();
        com.github.catvod.spider.merge.L.a.d(str, C0050.m199(f15short, 62, 6, 1573));
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0043.m169(f15short, 68, 13, 854));
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

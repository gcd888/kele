package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.C0377s0;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.q0.C0115;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Pan123 extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f75short = {295, 310, 313, 358, 357, 356, 264, 312, 293, 318, 304, 318, 313, 310, 315, 1729, 1744, 1759, 1664, 1667, 1666, 1774, 1732, 1759, 1757, 1752, 1756, 1752, 1733, 1748, 1749, 2788, 2788, 2788, 846, 847, 862, 843, 835, 838, 873, 837, 836, 862, 847, 836, 862, 2636, 2640, 2653, 2629, 2649, 2638, 2687, 2643, 2642, 2632, 2649, 2642, 2632};

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        return C0377s0.u.M(str2, str);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        C0377s0 c0377s0 = C0377s0.u;
        String str = (String) arrayList.get(0);
        c0377s0.getClass();
        return com.github.catvod.spider.merge.p001b.g.s(c0377s0.r(C0377s0.H(str)));
    }

    public static String detailContentVodPlayFrom(int i) {
        C0377s0.u.getClass();
        ArrayList arrayList = new ArrayList();
        String strM459 = C0115.m459(f75short, 0, 15, 343);
        if (C0299u0.g0(strM459)) {
            arrayList.add(AbstractC0302v0.g1(strM459, i, ""));
        }
        String strM567 = C0142.m567(f75short, 15, 16, 1713);
        if (C0299u0.g0(strM567)) {
            arrayList.add(AbstractC0302v0.g1(strM567, i, ""));
        }
        return AbstractC0302v0.T0(TextUtils.join(C0056.m223(f75short, 31, 3, 2752), arrayList));
    }

    public static String detailContentVodPlayUrl(String str) throws Throwable {
        try {
            C0377s0 c0377s0 = C0377s0.u;
            c0377s0.getClass();
            k kVarR = c0377s0.r(C0377s0.H(str));
            return (kVarR == null || kVarR.e() == null) ? "" : kVarR.e();
        } catch (Exception unused) {
            return "";
        }
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0074.m292(f75short, 34, 13, 810));
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
        com.github.catvod.spider.merge.Y.c.d(str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0087.m346(f75short, 47, 13, 2620));
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

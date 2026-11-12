package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.p000a.C0342a0;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class GuangYa extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f47short = {3300, 3318, 3298, 3309, 3300, 3322, 3298, 3292, 3308, 3313, 3306, 3300, 3306, 3309, 3298, 3311, 1597, 1583, 1595, 1588, 1597, 1571, 1595, 1541, 1583, 1588, 1590, 1587, 1591, 1587, 1582, 1599, 1598, 1230, 1244, 1224, 1223, 1230, 1232, 1224, 1270, 1245, 1222, 1270, 1176, 1179, 1178, 1246, 1246, 1246, 1083, 1082, 1067, 1086, 1078, 1075, 1052, 1072, 1073, 1067, 1082, 1073, 1067, 882, 878, 867, 891, 871, 880, 833, 877, 876, 886, 871, 876, 886};

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        return C0342a0.x.W(str2, str);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        int size = list == null ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        if (arrayList.isEmpty()) {
            return AbstractC0449a.b();
        }
        C0342a0 c0342a0 = C0342a0.x;
        String str = (String) arrayList.get(0);
        c0342a0.getClass();
        return com.github.catvod.spider.merge.p001b.g.s(c0342a0.D(C0342a0.U(str)));
    }

    public static String detailContentVodPlayFrom(int i) {
        C0342a0.x.getClass();
        ArrayList arrayList = new ArrayList();
        String strM105 = "guangya_original";
        if (C0299u0.g0(strM105)) {
            arrayList.add(AbstractC0302v0.g1(strM105, i, ""));
        }
        String strM175 = "guangya_unlimited";
        if (C0299u0.g0(strM175)) {
            arrayList.add(AbstractC0302v0.g1(strM175, i, ""));
        }
        String strM102 = "guangya_to_123";
        if (C0299u0.g0(strM102)) {
            arrayList.add(AbstractC0302v0.g1(strM102, i, ""));
        }
        return AbstractC0302v0.T0(TextUtils.join("$$$", arrayList));
    }

    public static String detailContentVodPlayUrl(String str) throws Throwable {
        try {
            C0342a0 c0342a0 = C0342a0.x;
            c0342a0.getClass();
            k kVarD = c0342a0.D(C0342a0.U(str));
            return (kVarD == null || kVarD.e() == null) ? "" : kVarD.e();
        } catch (Exception unused) {
            return "";
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

    public void init(Context context, String str) {
        Init.init(context);
        if (com.github.catvod.spider.merge.Y.c.d(str)) {
            C0342a0.x.l0(str);
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
}

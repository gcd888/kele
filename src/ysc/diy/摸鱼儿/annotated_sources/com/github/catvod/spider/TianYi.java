package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.p000a.Q0;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class TianYi extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f93short = {290, 341, 290, 341, 3272, 3285, 3293, 3282, 3269, 3285, 3299, 3283, 3278, 3285, 3291, 3285, 3282, 3293, 3280, 22173, 28729, 1647, 1647, 1647, 23823, 31706, -30831, 22512, 24715, 24856, 21270, 21350, 21980, -28353, 1052, 2917, 2916, 2933, 2912, 2920, 2925, 2882, 2926, 2927, 2933, 2916, 2927, 2933, 1076, 1064, 1061, 1085, 1057, 1078, 1031, 1067, 1066, 1072, 1057, 1066, 1072};

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        return Q0.f().y(str2.split(C0074.m292(f93short, 0, 4, 382)));
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        Q0 q0F = Q0.f();
        String str = (String) arrayList.get(0);
        q0F.getClass();
        return com.github.catvod.spider.merge.p001b.g.s(Q0.f().r(Q0.m(str)));
    }

    public static String detailContentVodPlayFrom(int i) {
        ArrayList arrayList = new ArrayList();
        String strM473 = C0119.m473(f93short, 4, 15, 3260);
        if (TextUtils.isEmpty(strM473) || C0299u0.g0(strM473)) {
            Q0.f().getClass();
            arrayList.add(AbstractC0302v0.g1(strM473, i, new String[]{C0097.m386(f93short, 19, 2, 1282)}[0]));
        }
        return AbstractC0302v0.T0(TextUtils.join(C0118.m471(f93short, 21, 3, 1611), arrayList));
    }

    public static String detailContentVodPlayUrl(String str) throws Throwable {
        Q0.f().getClass();
        try {
            k kVarR = Q0.f().r(Q0.m(str));
            return (kVarR == null || kVarR.e() == null) ? "" : kVarR.e();
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0009.m33(f93short, 24, 11, 1062)));
            return "";
        }
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0097.m386(f93short, 35, 13, 2817));
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
        Q0.f().C(str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0133.m529(f93short, 48, 13, 1092));
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

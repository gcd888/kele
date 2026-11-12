package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.p000a.C0364l0;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0096;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Pan115 extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f74short = {1952, 2007, 1952, 2007, 2881, 2881, 2885, 2863, 2847, 2818, 2841, 2839, 2841, 2846, 2833, 2844, 1239, 1239, 1235, 1209, 1170, 1161, 1209, 1239, 1236, 1237, 2247, 2247, 2243, 2217, 2178, 2201, 2217, 2199, 2202, 2207, 2028, 2028, 2028, 2622, 2622, 2618, 2640, 2656, 2685, 2662, 2664, 2662, 2657, 2670, 2659, 2357, 2357, 2353, 2395, 2416, 2411, 2395, 2357, 2358, 2359, 1026, 1026, 1030, 1132, 1095, 1116, 1132, 1106, 1119, 1114, 1688, 1689, 1672, 1693, 1685, 1680, 1727, 1683, 1682, 1672, 1689, 1682, 1672, 1142, 1130, 1127, 1151, 1123, 1140, 1093, 1129, 1128, 1138, 1123, 1128, 1138};

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        return C0364l0.C().h0(str2.split(C0082.m325(f74short, 0, 4, 2044)));
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        C0364l0 c0364l0C = C0364l0.C();
        String str = list.get(0);
        c0364l0C.getClass();
        return com.github.catvod.spider.merge.p001b.g.s(C0364l0.C().N(C0364l0.J(str)));
    }

    public static String detailContentVodPlayFrom(int i) {
        C0364l0.C().getClass();
        ArrayList arrayList = new ArrayList();
        String strM186 = C0047.m186(f74short, 4, 12, 2928);
        if (C0299u0.g0(strM186)) {
            arrayList.add(AbstractC0302v0.g1(strM186, i, ""));
        }
        String strM355 = C0089.m355(f74short, 16, 10, 1254);
        if (C0299u0.g0(strM355)) {
            arrayList.add(AbstractC0302v0.g1(strM355, i, ""));
        }
        String strM382 = C0096.m382(f74short, 26, 10, 2294);
        if (C0299u0.g0(strM382)) {
            arrayList.add(AbstractC0302v0.g1(strM382, i, ""));
        }
        return AbstractC0302v0.T0(TextUtils.join(C0009.m33(f74short, 36, 3, 1992), arrayList));
    }

    public static String detailContentVodPlayUrl(String str) {
        k kVarN;
        C0364l0 c0364l0C = C0364l0.C();
        c0364l0C.getClass();
        return ((C0299u0.g0(C0047.m186(f74short, 39, 12, 2575)) || C0299u0.g0(C0055.m219(f74short, 51, 10, 2308)) || C0299u0.g0(C0093.m368(f74short, 61, 10, 1075))) && (kVarN = c0364l0C.N(C0364l0.J(str))) != null) ? kVarN.e() : "";
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0085.m339(f74short, 71, 13, 1788));
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
        if (str == null || str.isEmpty()) {
            return;
        }
        C0364l0.C().w0(str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0003.m10(f74short, 84, 13, 1030));
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

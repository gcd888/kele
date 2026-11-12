package com.github.catvod.spider;

import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.q0.C0114;
import java.security.SecureRandom;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class d implements KanJu.EpisodePageFetcher {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f123short = {2628, 2563, 701, 703, 682, 703, 690, 689, 697, 823, 802, 827, 801, 829, 822, 823, 801, 2416, 2421, 2417, 2421, 2408, 1211, 1202, 1202, 1191, 1201, 1184};
    public final /* synthetic */ KanJu a;
    public final /* synthetic */ String b;

    public /* synthetic */ d(KanJu kanJu, String str) {
        this.a = kanJu;
        this.b = str;
    }

    @Override // com.github.catvod.spider.KanJu.EpisodePageFetcher
    public final String fetch(int i) {
        SecureRandom secureRandom = KanJu.e;
        KanJu kanJu = this.a;
        HttpUrl.Builder builderAddPathSegment = KanJu.a(kanJu.D().a).addPathSegment("v1").addPathSegment("catalog");
        String str = this.b;
        if (str == null) {
            str = "";
        }
        return kanJu.R(builderAddPathSegment.addPathSegment(str).addPathSegment("episodes").addQueryParameter("limit", String.valueOf(200)).addQueryParameter("offset", String.valueOf(Math.max(0, i))).build());
    }
}

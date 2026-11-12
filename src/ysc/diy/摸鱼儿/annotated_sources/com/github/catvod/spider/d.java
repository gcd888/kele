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
        HttpUrl.Builder builderAddPathSegment = KanJu.a(kanJu.D().a).addPathSegment(C0117.m467(f123short, 0, 2, 2610)).addPathSegment(C0019.m75(f123short, 2, 7, 734));
        String str = this.b;
        if (str == null) {
            str = "";
        }
        return kanJu.R(builderAddPathSegment.addPathSegment(str).addPathSegment(C0101.m402(f123short, 9, 8, 850)).addQueryParameter(C0045.m177(f123short, 17, 5, 2332), String.valueOf(200)).addQueryParameter(C0114.m454(f123short, 22, 6, 1236), String.valueOf(Math.max(0, i))).build());
    }
}

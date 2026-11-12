package com.github.catvod.spider.merge.A;

import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class R0 implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject jSONObject2 = (JSONObject) obj2;
                int iH0 = AbstractC0302v0.H0(AbstractC0302v0.I1(jSONObject), AbstractC0302v0.I1(jSONObject2));
                if (iH0 != 0) {
                    return iH0;
                }
                int iH1 = AbstractC0302v0.H0(AbstractC0302v0.P(jSONObject), AbstractC0302v0.P(jSONObject2));
                if (iH1 != 0) {
                    return iH1;
                }
                int iCompareToIgnoreCase = AbstractC0302v0.N(AbstractC0302v0.P(jSONObject)).compareToIgnoreCase(AbstractC0302v0.N(AbstractC0302v0.P(jSONObject2)));
                if (iCompareToIgnoreCase != 0) {
                    return iCompareToIgnoreCase;
                }
                int iCompare = Long.compare(AbstractC0302v0.Q(jSONObject2), AbstractC0302v0.Q(jSONObject));
                return iCompare != 0 ? iCompare : AbstractC0302v0.T(jSONObject, "fid", "fileId", "fileID", "file_id", "id", "fs_id").compareToIgnoreCase(AbstractC0302v0.T(jSONObject2, "fid", "fileId", "fileID", "file_id", "id", "fs_id"));
            case 1:
                C0250d1 c0250d1 = (C0250d1) obj;
                C0250d1 c0250d2 = (C0250d1) obj2;
                return AbstractC0302v0.w(c0250d1.a, c0250d1.b, c0250d2.a, c0250d2.b, c0250d1.e, c0250d2.e);
            case 2:
                C0250d1 c0250d3 = (C0250d1) obj;
                C0250d1 c0250d4 = (C0250d1) obj2;
                return AbstractC0302v0.w(c0250d3.a, c0250d3.b, c0250d4.a, c0250d4.b, c0250d3.e, c0250d4.e);
            default:
                JSONObject jSONObject3 = (JSONObject) obj;
                JSONObject jSONObject4 = (JSONObject) obj2;
                int iCompare2 = Long.compare(AbstractC0302v0.r1(jSONObject4), AbstractC0302v0.r1(jSONObject3));
                return iCompare2 != 0 ? iCompare2 : AbstractC0302v0.l(jSONObject4).compareTo(AbstractC0302v0.l(jSONObject3));
        }
    }
}

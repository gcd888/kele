package com.github.catvod.spider.merge.A;

import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class Z0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        JSONObject jSONObject = (JSONObject) obj;
        JSONObject jSONObject2 = (JSONObject) obj2;
        int iA = AbstractC0244b1.a(jSONObject2) - AbstractC0244b1.a(jSONObject);
        if (iA != 0) {
            return iA;
        }
        int iCompare = Long.compare(AbstractC0244b1.b(jSONObject2), AbstractC0244b1.b(jSONObject));
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Double.compare(AbstractC0244b1.c(AbstractC0244b1.m(jSONObject2)), AbstractC0244b1.c(AbstractC0244b1.m(jSONObject)));
        return iCompare2 != 0 ? iCompare2 : AbstractC0244b1.n(160, jSONObject).compareTo(AbstractC0244b1.n(160, jSONObject2));
    }
}

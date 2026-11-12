package com.github.catvod.spider.merge.p017u;

import android.graphics.Rect;
import android.view.View;
import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.merge.p022z.O1;
import com.github.catvod.spider.merge.p022z.P1;
import java.util.Comparator;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class L implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return PianDan.r((JSONObject) obj).compareTo(PianDan.r((JSONObject) obj2));
            case 1:
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject jSONObject2 = (JSONObject) obj2;
                HashMap map = PianDan.c;
                int iCompare = Long.compare(jSONObject.optLong("airedAt", Long.MAX_VALUE), jSONObject2.optLong("airedAt", Long.MAX_VALUE));
                return iCompare != 0 ? iCompare : jSONObject.optString("name").compareToIgnoreCase(jSONObject2.optString("name"));
            case 2:
                View view = (View) obj2;
                Rect rect = new Rect();
                int i = ((View) obj).getGlobalVisibleRect(rect) ? rect.left : Integer.MAX_VALUE;
                Rect rect2 = new Rect();
                return i - (view.getGlobalVisibleRect(rect2) ? rect2.left : Integer.MAX_VALUE);
            case 3:
                return ((O1) obj).b.optString("name").compareTo(((O1) obj2).b.optString("name"));
            default:
                return P1.Y((JSONObject) obj).compareTo(P1.Y((JSONObject) obj2));
        }
    }
}

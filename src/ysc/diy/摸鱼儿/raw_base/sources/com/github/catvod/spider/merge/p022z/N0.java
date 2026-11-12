package com.github.catvod.spider.merge.p022z;

import android.view.View;
import com.github.catvod.spider.merge.A.X1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class N0 implements View.OnClickListener {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ X1 c;

    public N0(X1 x1, ArrayList arrayList, int i) {
        this.c = x1;
        this.a = arrayList;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List list = this.a;
        int i = this.b;
        JSONObject jSONObject = (JSONObject) list.get(i);
        X1 x1 = this.c;
        x1.getClass();
        X1.l(x1, X1.B(i, jSONObject));
    }
}

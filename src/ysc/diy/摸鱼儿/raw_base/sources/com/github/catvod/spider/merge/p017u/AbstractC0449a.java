package com.github.catvod.spider.merge.p017u;

import android.widget.EditText;
import com.github.catvod.spider.merge.p001b.g;
import com.github.catvod.spider.merge.p001b.k;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract /* synthetic */ class AbstractC0449a {
    public static k a(String str) {
        k kVar = new k();
        kVar.n(str);
        return kVar;
    }

    public static String b() {
        return g.s(new k());
    }

    public static String c(int i, int i2, int i3, int i4, ArrayList arrayList) {
        g gVar = new g();
        gVar.o(i, i2, i3, i4);
        gVar.F(arrayList);
        return gVar.r();
    }

    public static String d(long j, String str) {
        return str + j;
    }

    public static String e(EditText editText) {
        return editText.getText().toString().trim();
    }
}

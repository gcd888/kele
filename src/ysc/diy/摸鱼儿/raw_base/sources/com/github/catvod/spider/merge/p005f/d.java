package com.github.catvod.spider.merge.p005f;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p022z.G;
import com.github.catvod.spider.merge.p022z.H;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class d implements H, G {
    public final /* synthetic */ f a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ d(f fVar, Runnable runnable) {
        this.a = fVar;
        this.b = runnable;
    }

    @Override // com.github.catvod.spider.merge.p022z.H
    public void a(ArrayList arrayList) {
        String str;
        f fVar = this.a;
        ArrayList arrayList2 = fVar.b;
        arrayList2.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String[] strArr = f.d;
            int i = 0;
            while (true) {
                if (i >= 6) {
                    str = "";
                    break;
                }
                str = strArr[i];
                if (f.w(str).equals(str2) || str.equals(str2)) {
                    break;
                } else {
                    i++;
                }
            }
            if (!TextUtils.isEmpty(str) && !arrayList2.contains(str)) {
                arrayList2.add(str);
            }
        }
        if (arrayList2.isEmpty()) {
            fVar.A();
        }
        fVar.c.clear();
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        X0.a("个人中心排序已保存，刷新生效");
    }

    @Override // com.github.catvod.spider.merge.p022z.G
    public void b(ArrayList arrayList) {
        f fVar = this.a;
        ArrayList arrayList2 = fVar.b;
        arrayList2.clear();
        String[] strArr = f.d;
        for (int i = 0; i < 6; i++) {
            String str = strArr[i];
            if (!arrayList.contains(f.w(str))) {
                arrayList2.add(str);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add("bili_history");
        }
        fVar.c.clear();
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        X0.a("个人中心显示已保存，刷新生效");
    }
}

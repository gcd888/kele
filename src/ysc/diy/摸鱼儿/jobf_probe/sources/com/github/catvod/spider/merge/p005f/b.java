package com.github.catvod.spider.merge.p005f;

import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p017u.RunnableC0453e;
import com.github.catvod.spider.merge.p022z.G;
import com.github.catvod.spider.merge.p022z.H;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class b implements G, H {
    public final /* synthetic */ c a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ b(c cVar, RunnableC0453e runnableC0453e) {
        this.a = cVar;
        this.b = runnableC0453e;
    }

    @Override // com.github.catvod.spider.merge.p022z.H
    public void a(ArrayList arrayList) {
        ArrayList arrayList2 = this.a.d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        X0.a("排序已保存，刷新生效");
    }

    @Override // com.github.catvod.spider.merge.p022z.G
    public void b(ArrayList arrayList) {
        ArrayList arrayList2 = this.a.d;
        arrayList2.removeAll(arrayList);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(Arrays.asList(c.e));
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        X0.a("已删除" + arrayList.size() + "个，刷新生效");
    }

    public void c(String str) {
        c cVar = this.a;
        cVar.getClass();
        if (str == null || str.isEmpty()) {
            return;
        }
        ArrayList arrayList = cVar.d;
        if (arrayList.contains(str)) {
            X0.a("分类已存在");
            return;
        }
        arrayList.add(str);
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        X0.a("已添加: " + str + "，刷新生效");
    }
}

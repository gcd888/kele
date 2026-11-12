package com.github.catvod.spider.merge.p005f;

import com.github.catvod.spider.merge.A.X0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ a(c cVar, Runnable runnable, int i) {
        this.a = i;
        this.b = cVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b;
                cVar.c = !cVar.c;
                Runnable runnable = this.c;
                if (runnable != null) {
                    runnable.run();
                }
                X0.a("播放历史同步".concat(cVar.c ? "已开启" : "已关闭"));
                break;
            case 1:
                c cVar2 = this.b;
                cVar2.b = !cVar2.b;
                Runnable runnable2 = this.c;
                if (runnable2 != null) {
                    runnable2.run();
                }
                StringBuilder sb = new StringBuilder("渣机模式");
                sb.append(cVar2.b ? "已开启" : "已关闭");
                sb.append("，请刷新页面");
                X0.a(sb.toString());
                break;
            default:
                ArrayList arrayList = this.b.d;
                arrayList.clear();
                arrayList.addAll(Arrays.asList(c.e));
                Runnable runnable3 = this.c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                X0.a("已恢复默认分类，刷新生效");
                break;
        }
    }
}

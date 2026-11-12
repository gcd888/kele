package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.X0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0483c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0239a b;

    public /* synthetic */ RunnableC0483c(C0239a c0239a, int i) {
        this.a = i;
        this.b = c0239a;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.a) {
            case 0:
                this.b.getClass();
                C0297t1.j("alllive_history.json", "[]");
                X0.a("已清除观看历史");
                break;
            default:
                this.b.getClass();
                C0297t1.j("alllive_history.json", "[]");
                X0.a("已清除观看历史");
                break;
        }
    }
}

package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.InitOrigin;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class O1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2 b;

    public /* synthetic */ O1(a2 a2Var, int i) {
        this.a = i;
        this.b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                a2 a2Var = this.b;
                a2Var.getClass();
                InitOrigin.run(new V1(a2Var, true, false, null));
                break;
            case 2:
                this.b.b();
                break;
            default:
                a2 a2Var2 = this.b;
                a2Var2.getClass();
                boolean z = false;
                InitOrigin.run(new V1(a2Var2, z, z, null));
                break;
        }
    }
}

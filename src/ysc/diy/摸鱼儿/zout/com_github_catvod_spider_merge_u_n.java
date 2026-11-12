package com.github.catvod.spider.merge.p017u;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p022z.K0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0462n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ X1 b;

    public /* synthetic */ RunnableC0462n(X1 x1, int i) {
        this.a = i;
        this.b = x1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                X1 x1 = this.b;
                x1.getClass();
                InitOrigin.run(new K0(x1, 1));
                break;
            case 1:
                X1 x2 = this.b;
                x2.getClass();
                InitOrigin.run(new K0(x2, 2));
                break;
            case 2:
                X1 x3 = this.b;
                x3.getClass();
                InitOrigin.run(new K0(x3, 3));
                break;
            case 3:
                X1 x4 = this.b;
                x4.getClass();
                InitOrigin.run(new K0(x4, 0));
                break;
            case 4:
                X1 x5 = this.b;
                x5.getClass();
                try {
                    x5.p(true);
                } catch (Exception e) {
                    b.x(e, new StringBuilder("显示失败: "));
                    return;
                }
                break;
            case 5:
                X1 x6 = this.b;
                x6.getClass();
                try {
                    x6.p(false);
                } catch (Exception e2) {
                    b.x(e2, new StringBuilder("显示失败: "));
                    return;
                }
                break;
            default:
                X1 x7 = this.b;
                x7.getClass();
                try {
                    x7.o();
                } catch (Exception e3) {
                    b.x(e3, new StringBuilder("显示失败: "));
                }
                break;
        }
    }
}

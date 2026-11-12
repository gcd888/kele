package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class K0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ X1 b;

    public /* synthetic */ K0(X1 x1, int i) {
        this.a = i;
        this.b = x1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    X1.h(this.b);
                } catch (Exception e) {
                    b.x(e, new StringBuilder("显示内容范围失败: "));
                    return;
                }
                break;
            case 1:
                try {
                    X1.i(this.b);
                } catch (Exception e2) {
                    b.x(e2, new StringBuilder("显示媒体库刷新失败: "));
                }
                break;
            case 2:
                try {
                    X1.j(this.b);
                } catch (Exception e3) {
                    b.x(e3, new StringBuilder("显示缓存清理失败: "));
                    return;
                }
                break;
            default:
                try {
                    X1.k(this.b);
                } catch (Exception e4) {
                    b.x(e4, new StringBuilder("显示我的Emby设置失败: "));
                    return;
                }
                break;
        }
    }
}

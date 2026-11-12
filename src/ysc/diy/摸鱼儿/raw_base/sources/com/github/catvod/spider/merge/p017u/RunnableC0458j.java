package com.github.catvod.spider.merge.p017u;

import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p000a.C0349e;
import com.github.catvod.spider.merge.p000a.C0353g;
import com.github.catvod.spider.merge.p022z.P1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0458j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FishConfig b;

    public /* synthetic */ RunnableC0458j(FishConfig fishConfig, int i) {
        this.a = i;
        this.b = fishConfig;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.a) {
            case 0:
                FishConfig fishConfig = this.b;
                fishConfig.getClass();
                P1.T0("百度网盘", new RunnableC0458j(fishConfig, 3));
                break;
            case 1:
                FishConfig fishConfig2 = this.b;
                fishConfig2.getClass();
                P1.T0("阿里云盘", new RunnableC0458j(fishConfig2, 2));
                break;
            case 2:
                this.b.getClass();
                try {
                    C0349e.j().e();
                    FishConfig.refreshStatus("ali");
                    X0.a("阿里账号已清除");
                } catch (Exception e) {
                    b.x(e, new StringBuilder("清除失败: "));
                    return;
                }
                break;
            default:
                this.b.getClass();
                try {
                    C0353g.a().b();
                    FishConfig.refreshStatus("baidu");
                    X0.a("百度账号已清除");
                } catch (Exception e2) {
                    b.x(e2, new StringBuilder("清除失败: "));
                }
                break;
        }
    }
}

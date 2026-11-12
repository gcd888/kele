package com.github.catvod.spider.merge.p017u;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.E0;
import com.github.catvod.spider.merge.p022z.InterfaceC0522j3;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class P implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ X1 b;

    public /* synthetic */ P(X1 x1, int i) {
        this.a = i;
        this.b = x1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                X1 x1 = this.b;
                x1.getClass();
                int i = AbstractC0583w0.c;
                InitOrigin.run(new E0("手动推送", "粘贴网盘、直播分享、磁力或视频直链", "链接地址", "https://yun.139.com/shareweb/#/w/i/xxx", "支持夸克、阿里、UC、移动网盘、虎牙/斗鱼/抖音/快手/哔哩直播分享、磁力链接和视频直链；添加后到「推送历史」点击播放。", String.valueOf(System.currentTimeMillis()), new i(23, x1), "url", "添加到历史", i));
                break;
            default:
                ((InterfaceC0522j3) this.b.b).clearHistory();
                X0.a("已清除历史");
                break;
        }
    }
}

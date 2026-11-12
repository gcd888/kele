package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p000a.RunnableC0383v0;
import com.github.catvod.spider.merge.p006g.a;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class Y implements InterfaceC0577v, InterfaceC0578v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ Y(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0577v
    public void e(String str, String str2, String str3) {
        a aVar = this.b;
        boolean z = (str.equals(aVar.b()) && str2.equals(aVar.c()) && str3.equals(aVar.d())) ? false : true;
        aVar.q(str);
        aVar.r(str2);
        aVar.t(str3);
        InitOrigin.execute(new RunnableC0383v0(2, z));
        X0.a("弹幕AI模型配置已保存");
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0578v0
    public void g(int i, boolean z) {
        switch (this.a) {
            case 1:
                this.b.u(z);
                X0.a("自动推送: ".concat(z ? "开启" : "关闭"));
                break;
            case 2:
                this.b.C(z);
                X0.a("失败弹窗: ".concat(z ? "开启（需开启自动推送）" : "关闭"));
                break;
            case 3:
                this.b.B(z);
                X0.a("随机位置: ".concat(z ? "开启" : "关闭"));
                break;
            default:
                this.b.A(z);
                X0.a("随机颜色: ".concat(z ? "开启" : "关闭"));
                break;
        }
    }
}

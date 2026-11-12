package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.Gying;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.PanWebShare123;
import com.github.catvod.spider.PanWebShareGuangYa;
import com.github.catvod.spider.merge.A.C0265i1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.C0349e;
import com.github.catvod.spider.merge.p000a.C0353g;
import com.github.catvod.spider.merge.p000a.C0357i;
import com.github.catvod.spider.merge.p000a.C0364l0;
import com.github.catvod.spider.merge.p000a.C0377s0;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p002c.a;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class M2 implements Z2, InterfaceC0549p0 {
    public final /* synthetic */ int a;

    @Override // com.github.catvod.spider.merge.p022z.Z2
    public void a(String str) throws Throwable {
        switch (this.a) {
            case 0:
                try {
                    Z0.t().q0(str);
                    X0.a("UC Cookie已保存");
                } catch (Exception e) {
                    b.x(e, new StringBuilder("保存失败: "));
                    return;
                }
                break;
            case 1:
                try {
                    if (str.startsWith("http")) {
                        str = X1.X(str, null, null);
                    }
                    C0349e.j().V(str);
                    X0.a("阿里云盘Token已保存");
                } catch (Exception e2) {
                    b.x(e2, new StringBuilder("保存失败: "));
                    return;
                }
                break;
            case 2:
                PanWebShare123.saveCookie(str);
                FishConfig.refreshStatus("pan123");
                X0.a("123社区Cookie已保存");
                break;
            case 3:
                Gying.saveCookie(str);
                X0.a("观影Cookie已保存");
                break;
            case 4:
            default:
                try {
                    A0.s().m0(str);
                    X0.a("夸克Cookie已保存");
                } catch (Exception e3) {
                    b.x(e3, new StringBuilder("保存失败: "));
                    return;
                }
                break;
            case 5:
                PanWebShareGuangYa.saveCookie(str);
                FishConfig.refreshStatus("guangya");
                X0.a("光鸭社区Cookie已保存");
                break;
            case 6:
                try {
                    C0364l0.C().w0(str);
                    X0.a("115 Cookie已保存");
                } catch (Exception e4) {
                    b.x(e4, new StringBuilder("保存失败: "));
                    return;
                }
                break;
            case 7:
                boolean zT = C0377s0.u.t(str);
                if (zT) {
                    C0299u0.r("pan123");
                    FishConfig.refreshStatus("pan123");
                }
                X0.a(zT ? "123 Open授权已保存" : "Open Token无效");
                break;
            case 8:
                if (!str.contains("BDUSS")) {
                    X0.a("请输入包含BDUSS的有效Cookie");
                } else {
                    C0357i c0357iA = C0353g.a();
                    c0357iA.getClass();
                    c0357iA.b = str;
                    a.a().c(new com.github.catvod.spider.merge.p015s.b(str));
                    C0299u0.r("baidu");
                    C0265i1.C();
                    X0.a("百度Cookie已保存");
                }
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0549p0
    public void b(String str, String str2) throws Throwable {
        switch (this.a) {
            case 4:
                InitOrigin.execute(new O2(str, 0, str2));
                break;
            case 9:
                X0.a("正在登录厂长影视...");
                InitOrigin.execute(new O2(str, 2, str2));
                break;
            default:
                InitOrigin.execute(new O2(str, 3, str2));
                break;
        }
    }
}

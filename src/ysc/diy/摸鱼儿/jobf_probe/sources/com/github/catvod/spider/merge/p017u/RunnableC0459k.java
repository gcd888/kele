package com.github.catvod.spider.merge.p017u;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.U0;
import com.github.catvod.spider.merge.A.k2;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
import com.github.catvod.spider.merge.p000a.RunnableC0383v0;
import com.github.catvod.spider.merge.p006g.a;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.B3;
import com.github.catvod.spider.merge.p022z.C0512h3;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.RunnableC0482b3;
import com.github.catvod.spider.merge.p022z.S2;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0459k implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ RunnableC0459k(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 16;
        int i2 = 22;
        int i3 = 21;
        int i4 = 4;
        int i5 = 0;
        switch (this.a) {
            case 0:
                P1.T0("夸克网盘", new RunnableC0460l(18));
                break;
            case 1:
                C0512h3[] c0512h3Arr = {null};
                InitOrigin.run(new RunnableC0482b3(c0512h3Arr, 3));
                InitOrigin.execute(new RunnableC0482b3(c0512h3Arr, i4));
                break;
            case 2:
                P1.b1();
                break;
            case 3:
                P1.a1();
                break;
            case 4:
                AbstractC0302v0.E1("guangya");
                break;
            case 5:
                P1.T0("光鸭网盘", new RunnableC0460l(15));
                break;
            case 6:
                InitOrigin.run(new B3(i3));
                break;
            case 7:
                InitOrigin.execute(new B3(i2));
                break;
            case 8:
                P1.T0("天翼云盘", new RunnableC0460l(17));
                break;
            case 9:
                String[] strArr = {"代理设置", "代理版本", "下载线程"};
                String strConcat = C0299u0.Z() ? (C0299u0.g1() ? "SO代理" : "Go代理").concat(" · 检测中...") : "Java代理";
                StringBuilder sb = new StringBuilder("目标: ");
                sb.append("dev".equals(C0299u0.F) ? "开发版" : "稳定版");
                sb.append(" · ");
                sb.append(C0299u0.g1() ? "SO模式" : "进程模式");
                String string = sb.toString();
                int i6 = 0;
                for (String str : C0299u0.N) {
                    if (C0299u0.F(str) > 128) {
                        i6++;
                    }
                }
                P1.L0("性能加速", "代理模式和下载线程集中调整", strArr, new String[]{strConcat, string, i6 > 0 ? i6 + "项偏高" : "常规"}, new int[]{AbstractC0583w0.c, AbstractC0583w0.f, AbstractC0583w0.d}, new Runnable[]{new RunnableC0459k(15), new RunnableC0459k(i), new RunnableC0459k(17)}, null, true);
                break;
            case 10:
                P1.K0("播放策略", "管理网盘开关和播放源策略", new String[]{"启用网盘", "播放源排序", "启用播放源"}, new String[]{P1.g0(), "调整播放源优先级", C0299u0.D()}, new int[]{-15610385, AbstractC0583w0.c, AbstractC0583w0.d}, new Runnable[]{new RunnableC0459k(18), new RunnableC0459k(i3), new RunnableC0459k(i2)});
                break;
            case 11:
                P1.q1();
                break;
            case 12:
                C0512h3[] c0512h3Arr2 = {null};
                InitOrigin.run(new RunnableC0482b3(c0512h3Arr2, i5));
                InitOrigin.execute(new RunnableC0482b3(c0512h3Arr2, 10));
                break;
            case 13:
                P1.f1("设置管理", "管理设置中心的开关和排序", "fish_config_menu", U0.e, U0.g, "5");
                break;
            case 14:
                InitOrigin.run(new S2(6));
                break;
            case 15:
                InitOrigin.run(new B3(15));
                break;
            case 16:
                InitOrigin.run(new RunnableC0383v0(14, "dev".equals(C0299u0.F)));
                break;
            case 17:
                P1.u1(C0299u0.N, C0299u0.O, C0299u0.P, "下载线程", "点击配置各网盘的下载线程数");
                break;
            case 18:
                InitOrigin.run(new RunnableC0341a(15, (boolean[]) C0299u0.V.clone()));
                break;
            case 19:
                P1.X0("tianyi_help", null);
                break;
            case 20:
                P1.K0("磁力管理", "管理磁力云下载和自动清理", new String[]{"迅雷磁力", "115磁力", "光鸭磁力", "自动清理", "使用帮助"}, new String[]{AbstractC0302v0.Q1("xunlei"), AbstractC0302v0.Q1("115"), AbstractC0302v0.Q1("guangya"), AbstractC0302v0.c1("115") + ":" + AbstractC0302v0.q("115") + " " + AbstractC0302v0.c1("guangya") + ":" + AbstractC0302v0.q("guangya") + " " + AbstractC0302v0.c1("xunlei") + ":" + AbstractC0302v0.q("xunlei"), "详情页弹窗、等待逻辑和清理说明"}, new int[]{-14059009, -16735786, -16728155, AbstractC0583w0.e, AbstractC0583w0.f}, new Runnable[]{new B3(i), new B3(17), new B3(18), new B3(19), new B3(20)});
                break;
            case 21:
                P1.o1();
                break;
            case 22:
                P1.n1();
                break;
            case 23:
                P1.K0("播放源管理", "调整播放源顺序和启用状态", new String[]{"播放源排序", "启用播放源"}, new String[]{"调整播放源优先级", C0299u0.D()}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d}, new Runnable[]{new RunnableC0459k(i3), new RunnableC0459k(i2)});
                break;
            case 24:
                P1.w1();
                break;
            case 25:
                P1.U0();
                break;
            case 26:
                InitOrigin.run(new RunnableC0383v0(11, k2.q()));
                break;
            case 27:
                P1.X0("usage_help", null);
                break;
            case 28:
                InitOrigin.run(new S2(7));
                break;
            default:
                InitOrigin.run(new RunnableC0383v0(i4, a.a().k()));
                break;
        }
    }
}

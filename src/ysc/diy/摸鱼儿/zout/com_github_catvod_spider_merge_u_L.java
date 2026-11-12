package com.github.catvod.spider.merge.p017u;

import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.Gying;
import com.github.catvod.spider.HonHon;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.j.a;
import com.github.catvod.spider.merge.j.b;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.C0342a0;
import com.github.catvod.spider.merge.p000a.C0364l0;
import com.github.catvod.spider.merge.p000a.C0377s0;
import com.github.catvod.spider.merge.p000a.L0;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p000a.l1;
import com.github.catvod.spider.merge.p000a.t1;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0512h3;
import com.github.catvod.spider.merge.p022z.M2;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.P2;
import com.github.catvod.spider.merge.p022z.RunnableC0482b3;
import com.github.catvod.spider.merge.p022z.RunnableC0543o;
import com.github.catvod.spider.merge.p022z.S;
import com.github.catvod.spider.merge.p022z.W;
import com.github.catvod.spider.merge.p022z.Y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0460l implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ RunnableC0460l(int i) {
        this.a = i;
    }

    private final void a() throws Throwable {
        C0377s0 c0377s0 = C0377s0.u;
        c0377s0.r = "";
        c0377s0.b = "";
        c0377s0.c = "";
        c0377s0.d = "";
        c0377s0.e = 0L;
        synchronized (c0377s0) {
            c0377s0.n.incrementAndGet();
            c0377s0.i = "";
            c0377s0.j = "";
            c0377s0.o = "";
            c0377s0.p = "";
            c0377s0.q = "";
            c0377s0.m = "";
            c0377s0.k = "";
            c0377s0.l = "";
            C0297t1.j("pan123_open", "");
        }
        c0377s0.a.clear();
        a.b().e(new b());
        a.d();
        FishConfig.refreshStatus("pan123");
        X0.a("123账号已清除");
    }

    private final void b() {
        String str = InitOrigin.e;
        try {
            if (Thread.currentThread().isInterrupted()) {
                InitOrigin.onSoLoadFailed("business recovery cancelled");
                synchronized (InitOrigin.m) {
                    InitOrigin.s = false;
                }
                return;
            }
            InitOrigin.initSafe(InitOrigin.context());
            if (!Thread.currentThread().isInterrupted() && FishCrypto.a) {
                InitOrigin.requestBusinessRecovery();
            }
            synchronized (InitOrigin.m) {
                InitOrigin.s = false;
            }
        } catch (Throwable th) {
            synchronized (InitOrigin.m) {
                InitOrigin.s = false;
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 3;
        int i2 = 2;
        int i3 = 14;
        int i4 = 0;
        int i5 = 1;
        switch (this.a) {
            case 0:
                C0512h3[] c0512h3Arr = {null};
                InitOrigin.run(new RunnableC0482b3(c0512h3Arr, i5));
                InitOrigin.execute(new RunnableC0482b3(c0512h3Arr, i2));
                return;
            case 1:
                InitOrigin.run(new S(i));
                return;
            case 2:
                InitOrigin.run(new S(i2));
                return;
            case 3:
                InitOrigin.run(new S(i4));
                return;
            case 4:
                com.github.catvod.spider.merge.p006g.a aVarA = com.github.catvod.spider.merge.p006g.a.a();
                String strB = aVarA.b();
                String strE = aVarA.e();
                String strF = aVarA.f();
                int i6 = AbstractC0583w0.c;
                P1.K0("弹幕AI模型", "仅在片名、平台和集数难以识别时辅助匹配", new String[]{"模型配置", "调用规则"}, new String[]{strB.isEmpty() ? "未完成 · 填写接口、密钥和模型" : com.github.catvod.spider.merge.D.b.B("已配置 · ", strF), aVarA.i() ? "已启用，仅识别失败时调用" : "当前已关闭"}, new int[]{i6, AbstractC0583w0.d}, new Runnable[]{new RunnableC0543o(strB, strE, strF, i6, new Y(aVarA, i4)), new W(aVarA, i5)});
                return;
            case 5:
                InitOrigin.run(new com.github.catvod.spider.merge.p019w.a("ai_test_" + System.currentTimeMillis(), 4));
                return;
            case 6:
                FishConfig.b("uc", "UC线程设置", "选择普通或会员下载线程");
                return;
            case 7:
                P1.X0("ai_help", null);
                return;
            case 8:
                P1.X0("match_mode", null);
                return;
            case 9:
                P1.X0("danmu_help", null);
                return;
            case 10:
                InitOrigin.run(new S(29));
                return;
            case 11:
                P1.B1();
                return;
            case 12:
                P1.T0("UC网盘", new RunnableC0460l(i3));
                return;
            case 13:
                C0512h3[] c0512h3Arr2 = {null};
                InitOrigin.run(new RunnableC0482b3(c0512h3Arr2, 18));
                InitOrigin.execute(new RunnableC0482b3(c0512h3Arr2, 19));
                return;
            case 14:
                Z0.t().g();
                FishConfig.refreshStatus("uc");
                return;
            case 15:
                C0342a0.x.h();
                FishConfig.refreshStatus("guangya");
                X0.a("光鸭账号已清除");
                return;
            case 16:
                l1 l1VarI = l1.I();
                l1VarI.G0();
                l1VarI.a.a();
                l1VarI.a = com.github.catvod.spider.merge.r.a.c();
                l1VarI.s();
                synchronized (l1VarI.b) {
                    l1VarI.e.clear();
                    l1VarI.f = null;
                    break;
                }
                FishConfig.refreshStatus("xunlei");
                X0.a("迅雷账号已清除");
                return;
            case 17:
                L0.q().h();
                FishConfig.refreshStatus("tianyi");
                return;
            case 18:
                A0.s().g();
                FishConfig.refreshStatus("quark");
                return;
            case 19:
                P1.T0("移动云盘", new RunnableC0460l(21));
                return;
            case 20:
                a();
                return;
            case 21:
                t1.u().c();
                FishConfig.refreshStatus("yidong");
                X0.a("移动云盘账号已清除");
                return;
            case 22:
                C0364l0 c0364l0C = C0364l0.C();
                c0364l0C.h();
                c0364l0C.f = true;
                c0364l0C.e = false;
                FishConfig.refreshStatus("115");
                X0.a("115账号已清除");
                return;
            case 23:
                C0512h3[] c0512h3Arr3 = {null};
                InitOrigin.run(new RunnableC0482b3(c0512h3Arr3, i3));
                InitOrigin.execute(new RunnableC0482b3(c0512h3Arr3, 15));
                return;
            case 24:
                P1.Q0();
                return;
            case 25:
                P1.X0("fishdrive_help", null);
                return;
            case 26:
                P1.e1("观影GYING", -14575885, "Cookie", "登录" + Gying.getCurrentSiteUrl() + "后复制Cookie", Gying.getSavedCookie(), new M2(i), "清除", new P2(i3), Gying.getCurrentSiteUrl());
                return;
            case 27:
                String[] strArr = HonHon.h;
                boolean z = FishCrypto.a;
                C0297t1.j(".honhon_search_history", "");
                X0.a("搜索历史已清除");
                return;
            case 28:
                b();
                return;
            default:
                InitOrigin.l();
                return;
        }
    }
}

package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.github.catvod.spider.CZ;
import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.PanWebShareGuangYa;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.A.k2;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.p000a.A;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.C0353g;
import com.github.catvod.spider.merge.p000a.C0357i;
import com.github.catvod.spider.merge.p000a.C0359j;
import com.github.catvod.spider.merge.p000a.C0364l0;
import com.github.catvod.spider.merge.p000a.C0377s0;
import com.github.catvod.spider.merge.p000a.L0;
import com.github.catvod.spider.merge.p000a.N;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
import com.github.catvod.spider.merge.p000a.RunnableC0351f;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p000a.a1;
import com.github.catvod.spider.merge.p000a.b1;
import com.github.catvod.spider.merge.p000a.l1;
import com.github.catvod.spider.merge.p000a.t1;
import com.github.catvod.spider.merge.p005f.p;
import com.github.catvod.spider.merge.p017u.RunnableC0452d;
import com.github.catvod.spider.merge.p017u.V;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0181;
import moyu.fucking.C0195;
import moyu.fucking.C0212;
import moyu.fucking.C0219;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class S2 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ S2(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 3;
        int i2 = 28;
        int i3 = 26;
        int i4 = 23;
        int i5 = 29;
        int i6 = 19;
        Object obj = null;
        int i7 = 18;
        int i8 = 2;
        final int i9 = 0;
        final int i10 = 1;
        switch (this.a) {
            case 0:
                P1.i1();
                return;
            case 1:
                InitOrigin.execute(new P2(i7));
                return;
            case 2:
                InitOrigin.execute(new S2(i2));
                return;
            case 3:
                P1.e1(AbstractC0302v0.Y0("xunlei"), AbstractC0302v0.X0("xunlei"), "Token", null, null, new C0359j(i4), null, null, null);
                return;
            case 4:
                l1 l1VarI = l1.I();
                l1VarI.g = true;
                l1VarI.G0();
                return;
            case 5:
                PanWebShareGuangYa.clearCookie();
                FishConfig.refreshStatus("guangya");
                X0.a("光鸭社区Cookie已清除");
                return;
            case 6:
                try {
                    Activity activityD0 = P1.D0();
                    if (activityD0 == null) {
                        return;
                    }
                    int iQ = AbstractC0583w0.Q(8, activityD0);
                    int[] iArr = {k2.q()};
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activityD0);
                    linearLayoutK.addView(AbstractC0583w0.p(activityD0, "备份方式", "选择云端备份使用的位置"), AbstractC0583w0.c0(iQ));
                    String[] strArr = {"WebDAV", "夸克"};
                    StringBuilder sb = new StringBuilder();
                    sb.append(k2.m(false) ? "已配置" : "未配置");
                    sb.append(" · 历史同步");
                    sb.append(k2.p(false) ? "开" : "关");
                    String string = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(k2.m(true) ? "已登录" : "未登录");
                    sb2.append(" · 历史同步");
                    sb2.append(k2.p(true) ? "开" : "关");
                    linearLayoutK.addView(AbstractC0583w0.E(activityD0, strArr, new String[]{string, sb2.toString()}, new int[]{AbstractC0583w0.c, -38091}, iArr, "两种方式互斥，云端备份只展示当前选择的方式"));
                    AbstractC0583w0.j0(new AlertDialog.Builder(activityD0).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new V(iArr, i)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    return;
                } catch (Exception e) {
                    b.x(e, new StringBuilder("切换失败: "));
                    return;
                }
            case 7:
                try {
                    Activity activityD1 = P1.D0();
                    if (activityD1 == null) {
                        return;
                    }
                    int i11 = AbstractC0583w0.e;
                    int i12 = AbstractC0583w0.a;
                    AbstractC0583w0.j0(AbstractC0583w0.r(activityD1, "危险操作", "永久删除账号与应用配置", i11, new String[][]{new String[]{"网盘账号", "所有网盘登录信息"}, new String[]{"WebDAV", "共享连接会清除"}, new String[]{"播放历史", "记录和同步设置会保留"}}, new int[]{i11, i11, AbstractC0583w0.d}, new String[]{"清除全部", "取消"}, new Runnable[]{new S(17), null}));
                    return;
                } catch (Exception unused) {
                    X0.a("显示失败");
                    return;
                }
            case 8:
                InitOrigin.run(new X2(i9, obj));
                return;
            case 9:
                InitOrigin.run(new I2("username,账号,输入厂长影视账号|password,密码,输入密码,pwd", "厂长影视", false, -5018830, String.valueOf(System.currentTimeMillis()), "", new M2(9), new RunnableC0452d(5)));
                return;
            case 10:
                P1.e1("厂长影视", -5018830, "Cookie", "登录" + CZ.getCurrentSiteUrl() + "后复制Cookie", CZ.getSavedCookie(), new C0359j(i2), "清除账号", new S(16), CZ.getCurrentSiteUrl() + "/");
                return;
            case 11:
                InitOrigin.execute(new S(i7));
                return;
            case 12:
                C0357i c0357iA = C0353g.a();
                c0357iA.d = true;
                ScheduledExecutorService scheduledExecutorService = c0357iA.a;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            case 13:
                F f = new F();
                try {
                    p pVarO = A.j().o();
                    f.a = pVarO.r();
                    f.b = pVarO.n();
                    f.c = pVarO.s();
                    f.d = pVarO.f();
                    f.e = pVarO.e().a();
                    f.f = pVarO.g();
                    f.g = pVarO.p();
                    f.h = pVarO.o();
                    f.i = A.j().a;
                    InitOrigin.run(new RunnableC0341a(11, f));
                    return;
                } catch (Exception unused2) {
                    InitOrigin.run(new S2(i5));
                    return;
                }
            case 14:
                L0 l0Q = L0.q();
                l0Q.f = true;
                ScheduledExecutorService scheduledExecutorService2 = l0Q.a;
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdownNow();
                    return;
                }
                return;
            case 15:
                C0364l0.C().I();
                return;
            case 16:
                C0364l0 c0364l0C = C0364l0.C();
                c0364l0C.f = true;
                c0364l0C.e = false;
                synchronized (c0364l0C.j) {
                    c0364l0C.j.notifyAll();
                    break;
                }
                return;
            case 17:
                InitOrigin.execute(new S2(i3));
                return;
            case 18:
                InitOrigin.run(new I2("phone,手机号,手机号|password,密码,密码,pwd", AbstractC0302v0.Y0("yidong"), false, AbstractC0302v0.X0("yidong"), String.valueOf(System.currentTimeMillis()), "", new M2(10), new U2(i10)));
                return;
            case 19:
                String strY0 = AbstractC0302v0.Y0("yidong");
                int iX0 = AbstractC0302v0.X0("yidong");
                t1.u().getClass();
                P1.e1(strY0, iX0, "Authorization", "粘贴 Basic xxx、Cookie 或网页登录 Storage JSON", t1.k(), new C0359j(i3), null, null, "https://yun.139.com/w/#/login");
                return;
            case 20:
                try {
                    b1 b1Var = Z0.t().E;
                    b1Var.i();
                    InitOrigin.run(new a1(b1Var, i8));
                    return;
                } catch (Exception unused3) {
                    X0.a("授权失败，请重试");
                    return;
                }
            case 21:
                A0.s().n0(true);
                return;
            case 22:
                InitOrigin.execute(new S(i6));
                return;
            case 23:
                InitOrigin.execute(new S(i4));
                return;
            case 24:
                P1.e1("哔哩哔哩", -298343, "Cookie", "粘贴B站Cookie(需含SESSDATA)", A.j().a, new C0359j(i5), "扫码登录", new S(24), null);
                return;
            case 25:
                P1.F("Open Token", C0377s0.u.f());
                return;
            case 26:
                t1.u().getClass();
                t1.C();
                return;
            case 27:
                A0.s().n0(false);
                return;
            case 28:
                final l1 l1VarI2 = l1.I();
                l1VarI2.getClass();
                try {
                    l1VarI2.g = false;
                    l1VarI2.G0();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("client_id", "XW-G4v1H72tgfJym");
                    jSONObject.put("scope", "");
                    HashMap map = new HashMap();
                    map.put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.31.0.9726 netWorkType/5G appid/40 deviceName/Xiaomi_M2004j7ac deviceModel/M2004J7AC OSVersion/12 protocolVersion/301 platformVersion/10 sdkVersion/512000 Oauth2Client/0.9 (Linux 4_14_186-perf-gddfs8vbb238b) (JAVA 0)");
                    map.put("Content-Type", "application/json");
                    N nM = X1.M("https://xluser-ssl.xunlei.com/v1/auth/device/code", jSONObject.toString(), map);
                    if (nM.a == 200 && !TextUtils.isEmpty(nM.a())) {
                        JSONObject jSONObject2 = new JSONObject(nM.a());
                        l1VarI2.h = jSONObject2.optString("device_code", "");
                        String strOptString = jSONObject2.optString("verification_uri_complete", "");
                        if (TextUtils.isEmpty(strOptString)) {
                            strOptString = jSONObject2.optString("short_uri_complete", "");
                        }
                        if (!TextUtils.isEmpty(l1VarI2.h) && !TextUtils.isEmpty(strOptString)) {
                            l1VarI2.j = Math.max(2, jSONObject2.optInt("interval", 2));
                            l1VarI2.i = (jSONObject2.optLong("expires_in", 120L) * 1000) + System.currentTimeMillis();
                            P1.l1(AbstractC0302v0.X0("xunlei"), new Runnable(l1VarI2, i9) { // from class: com.github.catvod.spider.merge.a.d1

                                /* JADX INFO: renamed from: short, reason: not valid java name */
                                private static final short[] f233short = {826, 825, 788, 783, 781, 772, 776, 828, 833, 816, 819, 833, 785, 782, 781, 781, 833, 775, 768, 776, 781, 772, 773, 859, 833};
                                public final int a;
                                public final l1 b;

                                {
                                    this.a = i9;
                                    this.b = l1VarI2;
                                    int iIntValue = ((Integer) C0181.n(6638, null, new Object[0])).intValue();
                                    int i13 = 1616;
                                    while (true) {
                                        i13 ^= 1633;
                                        switch (i13) {
                                            case 14:
                                                break;
                                            case 49:
                                                if (iIntValue <= 0) {
                                                    i13 = 1709;
                                                }
                                                break;
                                            case 204:
                                                C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0152.n(9835, null, new Object[]{(String) C0212.n(22932)})})});
                                                return;
                                            case 239:
                                                return;
                                            default:
                                                continue;
                                        }
                                        i13 = 1678;
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    switch (((Integer) C0212.n(92557, this)).intValue()) {
                                        case 0:
                                            l1 l1Var = (l1) C0212.n(71294, this);
                                            l1Var.g = true;
                                            C0212.n(73250, l1Var, new Object[0]);
                                            break;
                                        default:
                                            l1 l1Var2 = (l1) C0212.n(71294, this);
                                            try {
                                                C0212.n(17591, l1Var2, new Object[0]);
                                                int i13 = 1616;
                                                while (true) {
                                                    i13 ^= 1633;
                                                    switch (i13) {
                                                        case 14:
                                                            break;
                                                        case 49:
                                                            i13 = 1647;
                                                            break;
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                C0219.n(8575, null, new Object[]{e2, new StringBuilder((String) C0149.n(60368, null, new Object[]{(short[]) C0212.n(99841), 0, Integer.valueOf(C0042.f198 ^ 34), 865}))});
                                            }
                                            break;
                                    }
                                }
                            }, AbstractC0302v0.Y0("xunlei"), strOptString);
                            l1VarI2.G0();
                            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                            l1VarI2.k = scheduledExecutorServiceNewScheduledThreadPool;
                            scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new Runnable(l1VarI2, i10) { // from class: com.github.catvod.spider.merge.a.d1

                                /* JADX INFO: renamed from: short, reason: not valid java name */
                                private static final short[] f233short = {826, 825, 788, 783, 781, 772, 776, 828, 833, 816, 819, 833, 785, 782, 781, 781, 833, 775, 768, 776, 781, 772, 773, 859, 833};
                                public final int a;
                                public final l1 b;

                                {
                                    this.a = i10;
                                    this.b = l1VarI2;
                                    int iIntValue = ((Integer) C0181.n(6638, null, new Object[0])).intValue();
                                    int i13 = 1616;
                                    while (true) {
                                        i13 ^= 1633;
                                        switch (i13) {
                                            case 14:
                                                break;
                                            case 49:
                                                if (iIntValue <= 0) {
                                                    i13 = 1709;
                                                }
                                                break;
                                            case 204:
                                                C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0152.n(9835, null, new Object[]{(String) C0212.n(22932)})})});
                                                return;
                                            case 239:
                                                return;
                                            default:
                                                continue;
                                        }
                                        i13 = 1678;
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    switch (((Integer) C0212.n(92557, this)).intValue()) {
                                        case 0:
                                            l1 l1Var = (l1) C0212.n(71294, this);
                                            l1Var.g = true;
                                            C0212.n(73250, l1Var, new Object[0]);
                                            break;
                                        default:
                                            l1 l1Var2 = (l1) C0212.n(71294, this);
                                            try {
                                                C0212.n(17591, l1Var2, new Object[0]);
                                                int i13 = 1616;
                                                while (true) {
                                                    i13 ^= 1633;
                                                    switch (i13) {
                                                        case 14:
                                                            break;
                                                        case 49:
                                                            i13 = 1647;
                                                            break;
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                C0219.n(8575, null, new Object[]{e2, new StringBuilder((String) C0149.n(60368, null, new Object[]{(short[]) C0212.n(99841), 0, Integer.valueOf(C0042.f198 ^ 34), 865}))});
                                            }
                                            break;
                                    }
                                }
                            }, l1VarI2.j, l1VarI2.j, TimeUnit.SECONDS);
                            return;
                        }
                        InitOrigin.run(new RunnableC0351f(i6));
                        return;
                    }
                    InitOrigin.run(new RunnableC0351f(i7));
                    return;
                } catch (Exception unused4) {
                    InitOrigin.run(new RunnableC0351f(20));
                    return;
                }
            default:
                X0.a("B站登录状态检测失败，请稍后重试");
                return;
        }
    }
}

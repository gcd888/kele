package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.github.catvod.spider.CZ;
import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.RunnableC0315z1;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.A.j2;
import com.github.catvod.spider.merge.A.k2;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.T.j0;
import com.github.catvod.spider.merge.p000a.A;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.C0349e;
import com.github.catvod.spider.merge.p000a.C0353g;
import com.github.catvod.spider.merge.p000a.C0359j;
import com.github.catvod.spider.merge.p000a.C0377s0;
import com.github.catvod.spider.merge.p000a.I;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
import com.github.catvod.spider.merge.p000a.RunnableC0346c0;
import com.github.catvod.spider.merge.p000a.RunnableC0351f;
import com.github.catvod.spider.merge.p000a.RunnableC0361k;
import com.github.catvod.spider.merge.p000a.RunnableC0383v0;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p003d.d;
import com.github.catvod.spider.merge.p006g.a;
import com.github.catvod.spider.merge.p017u.C;
import com.github.catvod.spider.merge.p017u.DialogInterfaceOnClickListenerC0454f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class S implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ S(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x027e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strOptString;
        int i = 5;
        int i2 = 20;
        int i3 = 10;
        int i4 = 3;
        final int i5 = 2;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        boolean z2 = true;
        char c = 1;
        char c2 = 1;
        switch (this.a) {
            case 0:
                try {
                    Activity activityD0 = P1.d0();
                    if (activityD0 == null) {
                        return;
                    }
                    int i6 = AbstractC0583w0.e;
                    int i7 = AbstractC0583w0.a;
                    AbstractC0583w0.j0(AbstractC0583w0.r(activityD0, "恢复默认", "重置弹幕配置", i6, new String[][]{new String[]{"基础设置", "端口、启动和推送策略恢复默认"}, new String[]{"弹幕源", "平台开关和颜色恢复默认"}, new String[]{"AI匹配", "AI配置会清空并关闭"}}, new int[]{AbstractC0583w0.c, AbstractC0583w0.f, i6}, new String[]{"确认恢复", "取消"}, new Runnable[]{new S(4), null}));
                    return;
                } catch (Exception e) {
                    b.x(e, new StringBuilder("操作失败: "));
                    return;
                }
            case 1:
                I.p().E();
                I.p().B();
                String str = AbstractC0280n1.a;
                a.a().getClass();
                a.h();
                AbstractC0280n1.j(true);
                return;
            case 2:
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null) {
                        return;
                    }
                    final a aVarA = a.a();
                    final List listG = aVarA.g();
                    final ArrayList arrayList = listG != null ? new ArrayList(listG) : new ArrayList();
                    int iQ = AbstractC0583w0.Q(8, activity);
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                    linearLayoutK.addView(AbstractC0583w0.q(activity, "弹幕源开关", "选择参与搜索的平台", AbstractC0583w0.c), AbstractC0583w0.c0(iQ));
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                    j0 j0Var = com.github.catvod.spider.merge.p006g.b.h;
                    String[] strArr = {"BL", "QY", "TX", "YK", "MG", "HJ", "RR", "XG", "LS", "MDD"};
                    int i8 = 0;
                    while (i8 < 10) {
                        String str2 = strArr[i8];
                        String str3 = (String) com.github.catvod.spider.merge.p006g.b.i.get(str2);
                        if (str3 == null) {
                            str3 = "#2196F3";
                        }
                        AbstractC0583w0.m(linearLayoutY, str2, null, Color.parseColor(str3), arrayList.contains(str2), i8, i8 > 0, null, null, new C(arrayList, str2));
                        i8++;
                    }
                    linearLayoutK.addView(linearLayoutY);
                    final AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("确定", (DialogInterface.OnClickListener) null).create();
                    alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.github.catvod.spider.merge.z.X
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            AlertDialog alertDialog = alertDialogCreate;
                            alertDialog.getButton(-1).setOnClickListener(new M(arrayList, listG, aVarA, alertDialog, 1));
                        }
                    });
                    alertDialogCreate.show();
                    AbstractC0583w0.l0(alertDialogCreate, 0.0f);
                    return;
                } catch (Exception e2) {
                    b.x(e2, new StringBuilder("操作失败: "));
                    return;
                }
            case 3:
                try {
                    Activity activityD1 = P1.d0();
                    if (activityD1 == null) {
                        return;
                    }
                    a aVarA2 = a.a();
                    boolean zJ = aVarA2.j();
                    boolean zN = aVarA2.n();
                    boolean zM = aVarA2.m();
                    int iQ2 = AbstractC0583w0.Q(8, activityD1);
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activityD1);
                    linearLayoutK2.addView(AbstractC0583w0.q(activityD1, "功能配置", aVarA2.k() ? "即时保存；样式改动点底部按钮刷新" : "总开关已关闭，设置仍可保存", AbstractC0583w0.c), AbstractC0583w0.c0(iQ2));
                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activityD1);
                    P1.j(linearLayoutY2, aVarA2);
                    linearLayoutK2.addView(linearLayoutY2);
                    AbstractC0583w0.j0(new AlertDialog.Builder(activityD1).setView(AbstractC0583w0.q0(linearLayoutK2)).setPositiveButton("关闭", new V(aVarA2, zJ, zN, zM, 1)).create());
                    return;
                } catch (Exception e3) {
                    b.x(e3, new StringBuilder("显示失败: "));
                    return;
                }
            case 4:
                a aVarA3 = a.a();
                aVarA3.z();
                aVarA3.x(true);
                aVarA3.v();
                aVarA3.u(true);
                aVarA3.C(false);
                aVarA3.B(true);
                aVarA3.A(false);
                aVarA3.y(Arrays.asList("BL", "QY", "TX", "YK", "MG", "HJ", "RR", "XG", "LS", "MDD"));
                aVarA3.w(Arrays.asList("#FF0000", "#00FF00", "#0000FF", "#FFFF00", "#FF00FF", "#00FFFF", "#FFA500"));
                aVarA3.s(false);
                aVarA3.q("");
                aVarA3.r("https://api.deepseek.com");
                aVarA3.t("deepseek-chat");
                InitOrigin.execute(new S(c2 == true ? 1 : 0));
                X0.a("弹幕配置已重置(含AI)");
                return;
            case 5:
                InitOrigin.run(new RunnableC0383v0(i, objArr2 == true ? 1 : 0));
                return;
            case 6:
                InitOrigin.run(new RunnableC0383v0(i, z2));
                return;
            case 7:
                P1.V("帮助内容加载失败");
                return;
            case 8:
                P1.V("帮助内容解析失败");
                return;
            case 9:
                P1.I0(0);
                return;
            case 10:
                C0349e c0349eJ = C0349e.j();
                c0349eJ.getClass();
                String strX = X1.X("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null, null);
                InitOrigin.run(new RunnableC0361k(c0349eJ, strX, d.g(strX).c().d()));
                return;
            case 11:
                A0 a0S = A0.s();
                a0S.s = true;
                ScheduledExecutorService scheduledExecutorService = a0S.r;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            case 12:
                P1.F("授权Token", Z0.t().E.d());
                return;
            case 13:
                C0377s0 c0377s0 = C0377s0.u;
                c0377s0.getClass();
                try {
                    JSONObject jSONObjectA0 = C0377s0.a0();
                    strOptString = jSONObjectA0.optString("session_id");
                    try {
                        try {
                            String strOptString2 = jSONObjectA0.optString("oauth_url");
                            c0377s0.r = strOptString;
                            P1.l1(AbstractC0302v0.X0("pan123"), new RunnableC0341a(i5, c0377s0), "123 Open授权", strOptString2);
                            if (c0377s0.b(strOptString)) {
                                P1.R();
                                C0299u0.r("pan123");
                                FishConfig.refreshStatus("pan123");
                                InitOrigin.run(new RunnableC0351f(6));
                                if (!strOptString.equals(c0377s0.r)) {
                                    return;
                                }
                            } else if (!strOptString.equals(c0377s0.r)) {
                                return;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            if (TextUtils.isEmpty(strOptString) || strOptString.equals(c0377s0.r)) {
                                InitOrigin.run(new RunnableC0346c0(e, 1));
                            }
                            if (!strOptString.equals(c0377s0.r)) {
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (strOptString.equals(c0377s0.r)) {
                            c0377s0.r = "";
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    strOptString = "";
                } catch (Throwable th2) {
                    th = th2;
                    strOptString = "";
                    if (strOptString.equals(c0377s0.r)) {
                        c0377s0.r = "";
                    }
                    throw th;
                }
                c0377s0.r = "";
                return;
            case 14:
                P1.i1();
                return;
            case 15:
                Z0.t().s0(true);
                return;
            case 16:
                CZ.clearLogin();
                X0.a("厂长登录信息已清除");
                return;
            case 17:
                InitOrigin.run(new S(i2));
                return;
            case 18:
                try {
                    C0353g.a().j();
                    return;
                } catch (Exception e6) {
                    b.x(e6, new StringBuilder("获取二维码失败: "));
                    return;
                }
            case 19:
                A.j().B(true);
                return;
            case 20:
                try {
                    Activity activityD2 = P1.D0();
                    if (activityD2 == null) {
                        return;
                    }
                    int i9 = AbstractC0583w0.e;
                    int i10 = AbstractC0583w0.a;
                    AbstractC0583w0.j0(AbstractC0583w0.r(activityD2, "最后确认", "此操作不可恢复", i9, new String[][]{new String[]{"账号与设置", "登录信息和应用配置会删除"}, new String[]{"WebDAV", "共享连接会清除"}, new String[]{"继续保留", "播放历史、AI依据和同步开关"}}, new int[]{i9, AbstractC0583w0.f, AbstractC0583w0.d}, new String[]{"确认清除", "取消"}, new Runnable[]{new S(27), null}));
                    return;
                } catch (Exception unused) {
                    X0.a("显示失败");
                    return;
                }
            case 21:
                Z0.t().s0(false);
                return;
            case 22:
                k2.c.incrementAndGet();
                if (!k2.l()) {
                    InitOrigin.execute(new RunnableC0315z1(i2));
                    return;
                }
                j2 j2VarC = k2.c();
                if (j2VarC == null) {
                    return;
                }
                synchronized (k2.b) {
                    k2.g = true;
                    k2.h = j2VarC.d;
                    break;
                }
                k2.B(true, true);
                return;
            case 23:
                A.j().B(false);
                return;
            case 24:
                InitOrigin.execute(new P2(objArr3 == true ? 1 : 0));
                return;
            case 25:
                InitOrigin.run(new RunnableC0383v0(11, objArr4 == true ? 1 : 0));
                return;
            case 26:
                Z0 z0T = Z0.t();
                z0T.e = true;
                ScheduledExecutorService scheduledExecutorService2 = z0T.D;
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdownNow();
                    return;
                }
                return;
            case 27:
                InitOrigin.execute(new P2(i4));
                return;
            case 28:
                InitOrigin.run(new RunnableC0383v0(12, z));
                return;
            default:
                try {
                    Activity activityD3 = P1.D0();
                    if (activityD3 == null) {
                        return;
                    }
                    int iQ3 = AbstractC0583w0.Q(8, activityD3);
                    boolean zG = Z0.t().E.g();
                    LinearLayout linearLayoutK3 = AbstractC0583w0.K(activityD3);
                    final AlertDialog[] alertDialogArr = new AlertDialog[1];
                    View viewO = AbstractC0583w0.O(activityD3, "UC智能画质授权", "选择APP跳转或二维码授权", zG ? "已授权" : "未授权", zG ? AbstractC0583w0.d : -39424);
                    viewO.setLayoutParams(AbstractC0583w0.c0(iQ3));
                    linearLayoutK3.addView(viewO);
                    LinearLayout linearLayoutY3 = AbstractC0583w0.y(activityD3);
                    linearLayoutY3.setDescendantFocusability(262144);
                    LinearLayout linearLayoutD = AbstractC0583w0.d(linearLayoutY3, "APP跳转授权", "已安装UC网盘时使用", -39424, false);
                    final Object[] objArr5 = objArr == true ? 1 : 0;
                    linearLayoutD.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.Q2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (objArr5) {
                                case 0:
                                    AlertDialog alertDialog = alertDialogArr[0];
                                    if (alertDialog != null) {
                                        alertDialog.dismiss();
                                    }
                                    InitOrigin.execute(new S2(20));
                                    break;
                                case 1:
                                    AlertDialog alertDialog2 = alertDialogArr[0];
                                    if (alertDialog2 != null) {
                                        alertDialog2.dismiss();
                                    }
                                    InitOrigin.execute(new U2(0));
                                    break;
                                default:
                                    AlertDialog alertDialog3 = alertDialogArr[0];
                                    if (alertDialog3 != null) {
                                        alertDialog3.dismiss();
                                    }
                                    P1.e1("UC智能画质授权", -39424, "授权Token", "粘贴复制的授权Token JSON", Z0.t().E.d(), new C0359j(25), "复制授权Token", new S(12), null);
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayoutD2 = AbstractC0583w0.d(linearLayoutY3, "二维码授权", "无APP或跨设备扫码", AbstractC0583w0.d, true);
                    final char c3 = c == true ? 1 : 0;
                    linearLayoutD2.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.Q2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (c3) {
                                case 0:
                                    AlertDialog alertDialog = alertDialogArr[0];
                                    if (alertDialog != null) {
                                        alertDialog.dismiss();
                                    }
                                    InitOrigin.execute(new S2(20));
                                    break;
                                case 1:
                                    AlertDialog alertDialog2 = alertDialogArr[0];
                                    if (alertDialog2 != null) {
                                        alertDialog2.dismiss();
                                    }
                                    InitOrigin.execute(new U2(0));
                                    break;
                                default:
                                    AlertDialog alertDialog3 = alertDialogArr[0];
                                    if (alertDialog3 != null) {
                                        alertDialog3.dismiss();
                                    }
                                    P1.e1("UC智能画质授权", -39424, "授权Token", "粘贴复制的授权Token JSON", Z0.t().E.d(), new C0359j(25), "复制授权Token", new S(12), null);
                                    break;
                            }
                        }
                    });
                    AbstractC0583w0.d(linearLayoutY3, "手动输入", "粘贴或扫码填入授权Token", -39424, true).setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.Q2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i5) {
                                case 0:
                                    AlertDialog alertDialog = alertDialogArr[0];
                                    if (alertDialog != null) {
                                        alertDialog.dismiss();
                                    }
                                    InitOrigin.execute(new S2(20));
                                    break;
                                case 1:
                                    AlertDialog alertDialog2 = alertDialogArr[0];
                                    if (alertDialog2 != null) {
                                        alertDialog2.dismiss();
                                    }
                                    InitOrigin.execute(new U2(0));
                                    break;
                                default:
                                    AlertDialog alertDialog3 = alertDialogArr[0];
                                    if (alertDialog3 != null) {
                                        alertDialog3.dismiss();
                                    }
                                    P1.e1("UC智能画质授权", -39424, "授权Token", "粘贴复制的授权Token JSON", Z0.t().E.d(), new C0359j(25), "复制授权Token", new S(12), null);
                                    break;
                            }
                        }
                    });
                    if (zG) {
                        AbstractC0583w0.d(linearLayoutY3, "复制授权", "复制当前授权Token", -39424, true).setOnClickListener(new N2(i5));
                    }
                    linearLayoutK3.addView(linearLayoutY3);
                    AlertDialog.Builder onCancelListener = new AlertDialog.Builder(activityD3).setView(AbstractC0583w0.q0(linearLayoutK3)).setNegativeButton("取消", new DialogInterfaceOnClickListenerC0454f(9)).setOnCancelListener(new H2(i4));
                    onCancelListener.setNeutralButton("禁用", new DialogInterfaceOnClickListenerC0454f(i3));
                    AlertDialog alertDialogCreate2 = onCancelListener.create();
                    alertDialogArr[0] = alertDialogCreate2;
                    alertDialogCreate2.show();
                    AbstractC0583w0.l0(alertDialogArr[0], 0.0f);
                    return;
                } catch (Exception e7) {
                    b.x(e7, new StringBuilder("显示失败: "));
                    return;
                }
        }
    }
}

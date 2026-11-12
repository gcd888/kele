package com.github.catvod.spider.merge.p017u;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.LinearLayout;
import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p000a.A;
import com.github.catvod.spider.merge.p000a.l1;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0512h3;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.RunnableC0482b3;
import com.github.catvod.spider.merge.p022z.S2;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0452d implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ RunnableC0452d(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 2;
        int i2 = 13;
        int i3 = 12;
        int i4 = 16;
        int i5 = 0;
        int i6 = 1;
        switch (this.a) {
            case 0:
                InitOrigin.execute(new S2(i2));
                break;
            case 1:
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity != null && !activity.isFinishing()) {
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                        int i7 = AbstractC0583w0.c;
                        linearLayoutK.addView(AbstractC0583w0.q(activity, "B站未登录", "登录后享受更多功能", i7), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                        AbstractC0583w0.k(linearLayoutY, "高清画质", "登录后可观看1080P+清晰度", i7);
                        AbstractC0583w0.k(linearLayoutY, "弹幕增强", "所有视频源的弹幕量大幅提升", AbstractC0583w0.d);
                        linearLayoutK.addView(linearLayoutY, AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.p0(linearLayoutK)).setCancelable(true).setPositiveButton("去登录", new DialogInterfaceOnClickListenerC0454f(i5)).setNegativeButton("不再提醒", new DialogInterfaceOnClickListenerC0454f(i6)).create());
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                A.j().c();
                X0.a("已退出登录");
                break;
            case 3:
                InitOrigin.run(new B(new RunnableC0452d(i), i));
                break;
            case 4:
                P1.X0("bili_help", null);
                break;
            case 5:
                P1.R0();
                break;
            case 6:
                P1.X0("fanshu_help", null);
                break;
            case 7:
                C0512h3[] c0512h3Arr = {null};
                InitOrigin.run(new RunnableC0482b3(c0512h3Arr, i3));
                InitOrigin.execute(new RunnableC0482b3(c0512h3Arr, i2));
                break;
            case 8:
                FishConfig.b("baidu", "百度线程设置", "调整百度网盘下载线程");
                break;
            case 9:
                P1.p1();
                break;
            case 10:
                C0512h3[] c0512h3Arr2 = {null};
                InitOrigin.run(new RunnableC0482b3(c0512h3Arr2, 7));
                InitOrigin.execute(new RunnableC0482b3(c0512h3Arr2, 8));
                break;
            case 11:
                P1.P0();
                break;
            case 12:
                FishConfig.b("ali", "阿里线程设置", "调整阿里云盘下载线程");
                break;
            case 13:
                P1.A1();
                break;
            case 14:
                l1.I().getClass();
                P1.z1();
                break;
            case 15:
                FishConfig.b("xunlei", "迅雷线程设置", "调整迅雷网盘下载线程");
                break;
            case 16:
                P1.v1();
                break;
            case 17:
                AbstractC0302v0.E1("xunlei");
                break;
            case 18:
                P1.T0("迅雷网盘", new RunnableC0460l(i4));
                break;
            case 19:
                FishConfig.b("quark", "夸克线程设置", "选择普通或会员下载线程");
                break;
            case 20:
                C0512h3[] c0512h3Arr3 = {null};
                InitOrigin.run(new RunnableC0482b3(c0512h3Arr3, 9));
                InitOrigin.execute(new RunnableC0482b3(c0512h3Arr3, 11));
                break;
            case 21:
                P1.g1();
                break;
            case 22:
                AbstractC0302v0.E1("115");
                break;
            case 23:
                P1.X0("magnet_cloud_help", null);
                break;
            case 24:
                P1.T0("115网盘", new RunnableC0460l(22));
                break;
            case 25:
                C0512h3[] c0512h3Arr4 = {null};
                InitOrigin.run(new RunnableC0482b3(c0512h3Arr4, i4));
                InitOrigin.execute(new RunnableC0482b3(c0512h3Arr4, 17));
                break;
            case 26:
                P1.h1();
                break;
            case 27:
                FishConfig.b("tianyi", "天翼线程设置", "调整天翼云盘下载线程");
                break;
            case 28:
                FishConfig.b("pan123", "123线程设置", "调整123网盘下载线程");
                break;
            default:
                P1.T0("123网盘", new RunnableC0460l(20));
                break;
        }
    }
}

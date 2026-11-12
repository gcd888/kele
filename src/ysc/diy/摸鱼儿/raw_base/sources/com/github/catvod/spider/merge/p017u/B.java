package com.github.catvod.spider.merge.p017u;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnCancelListenerC0558r0;
import com.github.catvod.spider.merge.p022z.E;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.R2;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class B implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ B(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                ThreadLocal threadLocal = InitOrigin.z;
                threadLocal.set(Boolean.TRUE);
                try {
                    new B(runnable, i2).run();
                    return;
                } finally {
                    threadLocal.remove();
                }
            case 1:
                Runnable runnable2 = this.b;
                String str = InitOrigin.e;
                try {
                    runnable2.run();
                    return;
                } catch (Throwable th) {
                    InitOrigin.i(th);
                    return;
                }
            case 2:
                Runnable runnable3 = this.b;
                try {
                    Activity activity = InitOrigin.getActivity();
                    if ((activity instanceof Activity) && activity.isFinishing()) {
                        return;
                    }
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                    int i3 = AbstractC0583w0.e;
                    linearLayoutK.addView(AbstractC0583w0.q(activity, "退出登录", "确定要退出当前B站账号吗？", i3), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                    AbstractC0583w0.k(linearLayoutY, "画质降级", "退出后将无法观看1080P+清晰度", i3);
                    AbstractC0583w0.k(linearLayoutY, "弹幕减少", "所有视频源的弹幕量将大幅降低", AbstractC0583w0.f);
                    linearLayoutK.addView(linearLayoutY, AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
                    AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.p0(linearLayoutK)).setCancelable(true).setPositiveButton("确定退出", new E((RunnableC0452d) runnable3, 0)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    return;
                } catch (Exception unused) {
                    X0.a("操作失败");
                    return;
                }
            case 3:
                Runnable runnable4 = this.b;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        int i4 = AbstractC0583w0.a;
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity2, "恢复默认分类", "重置B站搜索分类", AbstractC0583w0.e, new String[][]{new String[]{"分类列表", "恢复电影、电视剧、动漫、综艺、纪录片"}, new String[]{"自定义分类", "当前自定义分类会被默认列表替换"}}, new int[]{-16735786, AbstractC0583w0.f}, new String[]{"确认恢复", "取消"}, new Runnable[]{runnable4, null}));
                    }
                    return;
                } catch (Exception unused2) {
                    X0.a("操作失败");
                    return;
                }
            case 4:
                Runnable runnable5 = this.b;
                try {
                    Activity activity3 = InitOrigin.getActivity();
                    if (activity3 == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity3, "个人中心重置", "恢复默认模块", AbstractC0583w0.e, new String[][]{new String[]{"模块显示", "历史、稍后、收藏、关注投稿等恢复默认"}, new String[]{"模块排序", "个人中心显示顺序恢复默认"}}, new int[]{-363880, AbstractC0583w0.i}, new String[]{"确认恢复", "取消"}, new Runnable[]{runnable5, null}));
                    }
                    return;
                } catch (Exception unused3) {
                    X0.a("操作失败");
                    return;
                }
            case 5:
                Activity activityD0 = P1.D0();
                if (activityD0 == null) {
                    return;
                }
                String str2 = "webdav_import_" + System.currentTimeMillis();
                LinearLayout linearLayoutK2 = AbstractC0583w0.K(activityD0);
                AbstractC0583w0.g(linearLayoutK2, "分享配置");
                EditText editTextF = AbstractC0583w0.f(linearLayoutK2, "粘贴 moyu_webdav: 开头的配置", "", false);
                editTextF.setSingleLine(false);
                editTextF.setMinLines(3);
                editTextF.setMaxLines(4);
                AbstractC0583w0.l(linearLayoutK2, "可粘贴配置，也可扫码输入");
                AlertDialog[] alertDialogArr = new AlertDialog[1];
                W w = new W(editTextF, str2, alertDialogArr, 11);
                AlertDialog.Builder neutralButton = new AlertDialog.Builder(activityD0).setTitle("快捷配置").setView(linearLayoutK2).setPositiveButton("导入", (DialogInterface.OnClickListener) null).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null);
                Runnable runnable6 = this.b;
                AlertDialog alertDialogCreate = neutralButton.setNegativeButton(runnable6 != null ? "返回" : "取消", new R2(str2, runnable6, i)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0558r0(str2, runnable6, i2)).create();
                alertDialogArr[0] = alertDialogCreate;
                AbstractC0583w0.j0(alertDialogCreate);
                alertDialogArr[0].getButton(-1).setOnClickListener(new ViewOnClickListenerC0470w(w, 7));
                P1.x(alertDialogArr[0].getButton(-3), "快捷配置", str2, "config", "分享配置", "粘贴 moyu_webdav: 开头的配置", -11896091, editTextF, w);
                return;
            case 6:
                InitOrigin.execute(this.b);
                return;
            case 7:
                InitOrigin.execute(this.b);
                return;
            case 8:
                Runnable runnable7 = this.b;
                if (runnable7 == null || P1.t != runnable7) {
                    return;
                }
                P1.R();
                return;
            case 9:
                Runnable runnable8 = this.b;
                try {
                    Activity activity4 = InitOrigin.getActivity();
                    if (activity4 == null) {
                        return;
                    }
                    int i5 = AbstractC0583w0.a;
                    AbstractC0583w0.j0(AbstractC0583w0.r(activity4, "清空随机历史", "将删除最近记录的随机壁纸，清空后无法恢复。", AbstractC0583w0.f, null, null, new String[]{"确认清空", "取消"}, new Runnable[]{runnable8, null}));
                    return;
                } catch (Exception e) {
                    b.D(e, new StringBuilder("[WallpaperDialog] showClearHistoryConfirm error: "));
                    return;
                }
            default:
                try {
                    Activity activity5 = InitOrigin.getActivity();
                    if (activity5 == null) {
                        X0.a("无法获取Activity");
                        return;
                    }
                    int iQ = AbstractC0583w0.Q(8, activity5);
                    LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity5);
                    linearLayoutK3.addView(AbstractC0583w0.q(activity5, "确认恢复", "此操作不可撤销", -9673729), AbstractC0583w0.c0(iQ));
                    LinearLayout linearLayoutZ = AbstractC0583w0.z(activity5, -1052932, 12);
                    AbstractC0583w0.k(linearLayoutZ, "覆盖", "恢复将覆盖当前所有配置数据", -9673729);
                    AbstractC0583w0.k(linearLayoutZ, "确认", "请确保云端备份是最新的", -9673729);
                    linearLayoutK3.addView(linearLayoutZ);
                    AbstractC0583w0.j0(new AlertDialog.Builder(activity5).setView(linearLayoutK3).setPositiveButton("确定恢复", new E(this.b, 12)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).setCancelable(true).create());
                    return;
                } catch (Exception unused4) {
                    X0.a("无法获取Activity");
                    return;
                }
        }
    }
}

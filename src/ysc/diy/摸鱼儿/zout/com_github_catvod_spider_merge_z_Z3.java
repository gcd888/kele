package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p010l.a;
import com.github.catvod.spider.merge.p017u.DialogInterfaceOnClickListenerC0454f;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0601z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ RunnableC0601z3(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        final int i = 2;
        final a aVar = this.b;
        final int i2 = 1;
        final int i3 = 0;
        switch (this.a) {
            case 0:
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        int iQ = AbstractC0583w0.Q(8, activity);
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                        linearLayoutK.addView(AbstractC0583w0.q(activity, "智能海报墙", "选择数据来源策略", -16732991), AbstractC0583w0.c0(iQ));
                        if (aVar.a != 1) {
                            i3 = 1;
                        }
                        final int[] iArr = {i3};
                        linearLayoutK.addView(AbstractC0583w0.E(activity, new String[]{"TMDB", "豆瓣"}, new String[]{"始终使用TMDB数据", "始终使用豆瓣数据"}, new int[]{-16732991, AbstractC0583w0.f}, iArr, "按选择展示，不按Token自动切换。"));
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.F3
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) throws Throwable {
                                switch (i2) {
                                    case 0:
                                        int i5 = iArr[0] == 1 ? 1 : 0;
                                        a aVar2 = aVar;
                                        aVar2.j = i5;
                                        aVar2.k();
                                        aVar2.q();
                                        X0.a("展示样式已保存");
                                        break;
                                    default:
                                        int i6 = iArr[0] == 0 ? 1 : 2;
                                        a aVar3 = aVar;
                                        aVar3.a = i6;
                                        aVar3.k();
                                        aVar3.q();
                                        X0.a("海报墙模式已保存");
                                        break;
                                }
                            }
                        }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    }
                } catch (Exception e) {
                    b.x(e, new StringBuilder("操作失败: "));
                    return;
                }
                break;
            case 1:
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                        linearLayoutK2.addView(AbstractC0583w0.q(activity2, "展示样式", "海报墙与日历卡片比例", -16732991), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activity2)));
                        if (aVar.j != 1) {
                            i2 = 0;
                        }
                        final int[] iArr2 = {i2};
                        linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"竖版海报", "宽图卡片"}, new String[]{"片库、榜单更紧凑", "日历、追更更清楚"}, new int[]{-16732991, AbstractC0583w0.f}, iArr2, null));
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(AbstractC0583w0.q0(linearLayoutK2)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.F3
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) throws Throwable {
                                switch (i3) {
                                    case 0:
                                        int i5 = iArr2[0] == 1 ? 1 : 0;
                                        a aVar2 = aVar;
                                        aVar2.j = i5;
                                        aVar2.k();
                                        aVar2.q();
                                        X0.a("展示样式已保存");
                                        break;
                                    default:
                                        int i6 = iArr2[0] == 0 ? 1 : 2;
                                        a aVar3 = aVar;
                                        aVar3.a = i6;
                                        aVar3.k();
                                        aVar3.q();
                                        X0.a("海报墙模式已保存");
                                        break;
                                }
                            }
                        }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    }
                } catch (Exception e2) {
                    b.x(e2, new StringBuilder("操作失败: "));
                    return;
                }
                break;
            case 2:
                try {
                    Activity activity3 = InitOrigin.getActivity();
                    if (activity3 == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        int iQ2 = AbstractC0583w0.Q(8, activity3);
                        LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                        linearLayoutK3.addView(AbstractC0583w0.q(activity3, "海报墙体验", "日历和图片比例", -16732991), AbstractC0583w0.c0(iQ2));
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity3);
                        AbstractC0583w0.c(AbstractC0583w0.g, linearLayoutY, "追更日历天数");
                        EditText editTextF = AbstractC0583w0.f(linearLayoutY, "1-31", String.valueOf(aVar.i), false);
                        editTextF.setInputType(2);
                        linearLayoutK3.addView(linearLayoutY, AbstractC0583w0.c0(iQ2));
                        if (aVar.j != 1) {
                            i2 = 0;
                        }
                        int[] iArr3 = {i2};
                        linearLayoutK3.addView(AbstractC0583w0.E(activity3, new String[]{"竖版海报", "宽图卡片"}, new String[]{"更像传统海报墙", "更像追剧日历横幅"}, new int[]{-16732991, AbstractC0583w0.f}, iArr3, null), AbstractC0583w0.c0(iQ2));
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity3).setView(AbstractC0583w0.q0(linearLayoutK3)).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0503g(aVar, editTextF, iArr3, 13)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    }
                } catch (Exception e3) {
                    b.x(e3, new StringBuilder("操作失败: "));
                    return;
                }
                break;
            case 3:
                try {
                    Activity activity4 = InitOrigin.getActivity();
                    if (activity4 != null) {
                        final boolean[] zArr = {aVar.m, aVar.n};
                        LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity4);
                        linearLayoutK4.addView(AbstractC0583w0.q(activity4, "AI推荐依据", "本机采集，用于生成更符合偏好的推荐与画像", -16732991), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activity4)));
                        LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity4);
                        AbstractC0583w0.m(linearLayoutY2, "记录搜索", "记录搜索词，用于判断内容偏好", AbstractC0583w0.d, zArr[0], 0, false, null, zArr, null);
                        AbstractC0583w0.m(linearLayoutY2, "记录播放", "记录片名和集数，用于推荐相似内容", AbstractC0583w0.f, zArr[1], 1, false, null, zArr, null);
                        AbstractC0583w0.l(linearLayoutY2, "这些记录不参与播放历史同步，会随加密配置备份迁移");
                        linearLayoutK4.addView(linearLayoutY2);
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity4).setView(AbstractC0583w0.q0(linearLayoutK4)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.H3
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) throws Throwable {
                                switch (i) {
                                    case 0:
                                        boolean[] zArr2 = zArr;
                                        boolean z = zArr2[0];
                                        a aVar2 = aVar;
                                        aVar2.l = z;
                                        aVar2.q();
                                        X0.a("追更启动提醒已".concat(zArr2[0] ? "开启" : "关闭"));
                                        break;
                                    case 1:
                                        boolean z2 = zArr[0];
                                        a aVar3 = aVar;
                                        aVar3.p = z2;
                                        aVar3.q();
                                        X0.a("分类展示已保存");
                                        break;
                                    default:
                                        boolean[] zArr3 = zArr;
                                        boolean z3 = zArr3[0];
                                        a aVar4 = aVar;
                                        aVar4.m = z3;
                                        aVar4.n = zArr3[1];
                                        aVar4.r();
                                        X0.a("AI推荐依据已保存");
                                        break;
                                }
                            }
                        }).setNeutralButton("清除记录", new DialogInterfaceOnClickListenerC0454f(12)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                        break;
                    }
                } catch (Exception unused) {
                    X0.a("无法打开AI推荐依据设置");
                    return;
                }
                break;
            case 4:
                try {
                    Activity activity5 = InitOrigin.getActivity();
                    if (activity5 != null) {
                        int iQ3 = AbstractC0583w0.Q(8, activity5);
                        final boolean[] zArr2 = {aVar.l};
                        LinearLayout linearLayoutK5 = AbstractC0583w0.K(activity5);
                        linearLayoutK5.addView(AbstractC0583w0.q(activity5, "更新提醒", "爬虫启动时检查当天追更", -16732991), AbstractC0583w0.c0(iQ3));
                        LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity5);
                        AbstractC0583w0.m(linearLayoutY3, "启动时提醒", "当天有更新才显示，并按播出时间排序", AbstractC0583w0.f, zArr2[0], 0, false, null, zArr2, null);
                        linearLayoutK5.addView(linearLayoutY3);
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity5).setView(linearLayoutK5).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.H3
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) throws Throwable {
                                switch (i3) {
                                    case 0:
                                        boolean[] zArr3 = zArr2;
                                        boolean z = zArr3[0];
                                        a aVar2 = aVar;
                                        aVar2.l = z;
                                        aVar2.q();
                                        X0.a("追更启动提醒已".concat(zArr3[0] ? "开启" : "关闭"));
                                        break;
                                    case 1:
                                        boolean z2 = zArr2[0];
                                        a aVar3 = aVar;
                                        aVar3.p = z2;
                                        aVar3.q();
                                        X0.a("分类展示已保存");
                                        break;
                                    default:
                                        boolean[] zArr4 = zArr2;
                                        boolean z3 = zArr4[0];
                                        a aVar4 = aVar;
                                        aVar4.m = z3;
                                        aVar4.n = zArr4[1];
                                        aVar4.r();
                                        X0.a("AI推荐依据已保存");
                                        break;
                                }
                            }
                        }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    }
                } catch (Exception e4) {
                    b.x(e4, new StringBuilder("打开更新提醒设置失败: "));
                    return;
                }
                break;
            case 5:
                try {
                    Activity activity6 = InitOrigin.getActivity();
                    if (activity6 != null) {
                        boolean[] zArr3 = {aVar.o};
                        boolean z = zArr3[0];
                        LinearLayout linearLayoutK6 = AbstractC0583w0.K(activity6);
                        linearLayoutK6.addView(AbstractC0583w0.q(activity6, "AI推荐开关", "开启后允许生成推荐；首页分类是否显示可单独设置", -16732991), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activity6)));
                        LinearLayout linearLayoutY4 = AbstractC0583w0.y(activity6);
                        AbstractC0583w0.m(linearLayoutY4, "启用AI推荐", "默认关闭；无模型配置或记录时不会调用", -16732991, zArr3[0], 0, false, null, zArr3, null);
                        linearLayoutK6.addView(linearLayoutY4);
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity6).setView(AbstractC0583w0.q0(linearLayoutK6)).setPositiveButton("保存", new K2(aVar, zArr3, z)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                        break;
                    }
                } catch (Exception unused2) {
                    X0.a("无法打开AI推荐设置");
                }
                break;
            default:
                try {
                    Activity activity7 = InitOrigin.getActivity();
                    if (activity7 != null) {
                        final boolean[] zArr4 = {aVar.p};
                        LinearLayout linearLayoutK7 = AbstractC0583w0.K(activity7);
                        linearLayoutK7.addView(AbstractC0583w0.q(activity7, "分类展示", "只控制首页分类显示，不会删除记录或关闭模型配置", -16732991), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activity7)));
                        LinearLayout linearLayoutY5 = AbstractC0583w0.y(activity7);
                        AbstractC0583w0.m(linearLayoutY5, "AI推荐", "隐藏后不显示AI推荐分类", -16732991, zArr4[0], 0, false, null, zArr4, null);
                        linearLayoutK7.addView(linearLayoutY5);
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity7).setView(AbstractC0583w0.q0(linearLayoutK7)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.H3
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) throws Throwable {
                                switch (i2) {
                                    case 0:
                                        boolean[] zArr5 = zArr4;
                                        boolean z2 = zArr5[0];
                                        a aVar2 = aVar;
                                        aVar2.l = z2;
                                        aVar2.q();
                                        X0.a("追更启动提醒已".concat(zArr5[0] ? "开启" : "关闭"));
                                        break;
                                    case 1:
                                        boolean z3 = zArr4[0];
                                        a aVar3 = aVar;
                                        aVar3.p = z3;
                                        aVar3.q();
                                        X0.a("分类展示已保存");
                                        break;
                                    default:
                                        boolean[] zArr6 = zArr4;
                                        boolean z4 = zArr6[0];
                                        a aVar4 = aVar;
                                        aVar4.m = z4;
                                        aVar4.n = zArr6[1];
                                        aVar4.r();
                                        X0.a("AI推荐依据已保存");
                                        break;
                                }
                            }
                        }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    }
                } catch (Exception unused3) {
                    X0.a("无法打开分类展示设置");
                    return;
                }
                break;
        }
    }
}

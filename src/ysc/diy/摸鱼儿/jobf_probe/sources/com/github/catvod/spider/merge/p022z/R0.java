package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0253e1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.EnumC0296t0;
import com.github.catvod.spider.merge.A.P0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p010l.a;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class R0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ R0(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        String str;
        boolean z = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                C0559r1 c0559r1 = (C0559r1) obj;
                c0559r1.getClass();
                try {
                    c0559r1.j(z);
                } catch (Exception e) {
                    b.D(e, new StringBuilder("[FishDriveDialog] showServerSelectDialog: "));
                    return;
                }
                break;
            case 1:
                K1 k1 = (K1) obj;
                k1.getClass();
                try {
                    Activity activity = InitOrigin.getActivity();
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                    linearLayoutK.addView(AbstractC0583w0.p(activity, "搜索展示", "选择搜索结果的展示方式"), layoutParams);
                    int[] iArr = {1 ^ (z ? 1 : 0)};
                    linearLayoutK.addView(AbstractC0583w0.E(activity, new String[]{"文件夹(按网盘分组)", "列表(直接展示)"}, new String[]{"搜索结果按网盘归类分组", "直接展示所有文件"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, iArr, null));
                    AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayoutK).setPositiveButton("确定", new P0(k1, iArr, 9)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                } catch (Exception e2) {
                    b.D(e2, new StringBuilder("[FishPsDialog] showDisplayDialog: "));
                    return;
                }
                break;
            case 2:
                a aVar = (a) obj;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                        linearLayoutK2.addView(AbstractC0583w0.q(activity2, "追更展示", "控制首页显示和展示方式", -16732991), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activity2)));
                        boolean[] zArr = {PianDan.isFollowHomeEnabled(z)};
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity2);
                        AbstractC0583w0.m(linearLayoutY, "首页显示", "关闭后隐藏“我的追更”一级菜单", -16732991, zArr[0], 0, false, null, zArr, null);
                        linearLayoutK2.addView(linearLayoutY, AbstractC0583w0.c0(AbstractC0583w0.Q(8, activity2)));
                        int[] iArr2 = {aVar.k == 1 ? 1 : 0};
                        linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"列表展示", "海报展示"}, new String[]{"固定使用列表", "跟随海报样式的竖版或宽图设置"}, new int[]{-16732991, AbstractC0583w0.f}, iArr2, null));
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(AbstractC0583w0.q0(linearLayoutK2)).setPositiveButton("保存", new C1(z, zArr, aVar, iArr2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    }
                } catch (Exception e3) {
                    b.x(e3, new StringBuilder("操作失败: "));
                    return;
                }
                break;
            case 3:
                try {
                    Activity activity3 = InitOrigin.getActivity();
                    int iQ = AbstractC0583w0.Q(8, activity3);
                    int[] iArr3 = {AbstractC0583w0.d, AbstractC0583w0.c, -15610385, AbstractC0583w0.f, AbstractC0583w0.e};
                    String str2 = z ? "无限播放源" : "常规播放源";
                    String str3 = z ? "支持转存时优先，失败后无限兜底" : "原画、智能与秒传线路";
                    LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                    linearLayoutK3.addView(AbstractC0583w0.p(activity3, str2, str3), AbstractC0583w0.c0(iQ));
                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity3);
                    LinearLayout linearLayout = new LinearLayout(activity3);
                    linearLayout.setOrientation(1);
                    linearLayout.setDescendantFocusability(262144);
                    int i2 = 0;
                    boolean z2 = true;
                    while (true) {
                        String[] strArr = C0299u0.X;
                        boolean[] zArr2 = (boolean[]) obj;
                        if (i2 >= strArr.length) {
                            linearLayoutY2.addView(AbstractC0583w0.J(activity3, linearLayout, 280));
                            AbstractC0583w0.l(linearLayoutY2, "关闭的播放源将不会出现在播放列表");
                            linearLayoutK3.addView(linearLayoutY2);
                            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity3).setView(linearLayoutK3).setPositiveButton("确定", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                            AbstractC0583w0.j0(alertDialogCreate);
                            alertDialogCreate.getButton(-1).setOnClickListener(new K(zArr2, str2, alertDialogCreate));
                        } else {
                            C0253e1 c0253e1J1 = AbstractC0302v0.J1(C0299u0.W[i2]);
                            if ((c0253e1J1 != null && "unlimited".equals(c0253e1J1.c)) != z) {
                                i = i2;
                            } else {
                                i = i2;
                                AbstractC0583w0.m(linearLayout, strArr[i2], C0299u0.Y[i2], iArr3[i2 % 5], zArr2[i2], i, !z2, null, zArr2, null);
                                z2 = false;
                            }
                            i2 = i + 1;
                        }
                    }
                } catch (Exception e4) {
                    b.x(e4, new StringBuilder("设置失败: "));
                    return;
                }
                break;
            default:
                EnumC0296t0 enumC0296t0B1 = C0299u0.b1((String) obj);
                if (enumC0296t0B1 == EnumC0296t0.a) {
                    str = z ? "切换成功已生效" : "当前处于GO模式，切换成功已生效";
                } else if (enumC0296t0B1 == EnumC0296t0.b) {
                    str = "当前处于SO模式，请重启应用生效";
                } else if (enumC0296t0B1 == EnumC0296t0.c) {
                    str = "版本已保存，暂未生效";
                } else if (enumC0296t0B1 == EnumC0296t0.d) {
                    str = "切换失败，已恢复原版本";
                } else {
                    str = enumC0296t0B1 == EnumC0296t0.e ? "切换失败，请重启应用恢复" : "切换失败，请稍后重试";
                }
                InitOrigin.run(new com.github.catvod.spider.merge.p019w.a(str, 20));
                break;
        }
    }

    public /* synthetic */ R0(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}

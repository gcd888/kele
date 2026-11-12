package com.github.catvod.spider.merge.p017u;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
import com.github.catvod.spider.merge.p005f.a;
import com.github.catvod.spider.merge.p005f.b;
import com.github.catvod.spider.merge.p005f.c;
import com.github.catvod.spider.merge.p005f.f;
import com.github.catvod.spider.merge.p005f.h;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.P2;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0453e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bili b;

    public /* synthetic */ RunnableC0453e(Bili bili, int i) {
        this.a = i;
        this.b = bili;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 10;
        int i2 = 3;
        int i3 = 4;
        int i4 = 2;
        final int i5 = 0;
        final int i6 = 1;
        int i7 = 6;
        switch (this.a) {
            case 0:
                Bili bili = this.b;
                bili.getClass();
                RunnableC0453e runnableC0453e = new RunnableC0453e(bili, i7);
                c cVar = bili.j;
                InitOrigin.run(new M(cVar.a, new b(cVar, runnableC0453e), i6));
                break;
            case 1:
                String[] strArr = {"渣机模式", "播放历史同步"};
                Bili bili2 = this.b;
                c cVar2 = bili2.j;
                P1.K0("播放设置", "管理B站播放体验", strArr, new String[]{(cVar2.b ? "已开启" : "已关闭").concat(" · 过滤HDR/真彩/杜比"), (cVar2.c ? "已开启" : "已关闭").concat(" · 播放时记录到B站历史")}, new int[]{AbstractC0583w0.d, -298343}, new Runnable[]{new RunnableC0453e(bili2, i), new RunnableC0453e(bili2, 11)});
                break;
            case 2:
                Bili bili3 = this.b;
                bili3.getClass();
                RunnableC0453e runnableC0453e2 = new RunnableC0453e(bili3, i7);
                c cVar3 = bili3.j;
                final boolean z = cVar3.b;
                final a aVar = new a(cVar3, runnableC0453e2, i6);
                InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.z.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable = aVar;
                        final int i8 = 0;
                        final int i9 = 1;
                        switch (i5) {
                            case 0:
                                try {
                                    Activity activity = InitOrigin.getActivity();
                                    int iQ = AbstractC0583w0.Q(8, activity);
                                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                    final boolean z2 = z;
                                    LinearLayout linearLayoutO = AbstractC0583w0.O(activity, "渣机模式", z2 ? "过滤HDR/杜比/4K" : "显示全部画质", z2 ? "已开启" : "已关闭", z2 ? AbstractC0583w0.d : AbstractC0583w0.h);
                                    linearLayoutO.setLayoutParams(AbstractC0583w0.c0(iQ));
                                    linearLayoutK.addView(linearLayoutO);
                                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                    final boolean[] zArr = {z2};
                                    AbstractC0583w0.m(linearLayoutY, "渣机模式开关", "过滤高码率画质 保护低端设备", AbstractC0583w0.d, z2, 0, false, null, zArr, null);
                                    linearLayoutY.setLayoutParams(AbstractC0583w0.c0(iQ));
                                    linearLayoutK.addView(linearLayoutY);
                                    AbstractC0583w0.l(linearLayoutK, "开启后将过滤HDR/杜比视界/4K等高码率画质");
                                    final a aVar2 = (a) runnable;
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.y
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            Runnable runnable2;
                                            Runnable runnable3;
                                            switch (i9) {
                                                case 0:
                                                    if (zArr[0] != z2 && (runnable2 = aVar2) != null) {
                                                        runnable2.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (zArr[0] != z2 && (runnable3 = aVar2) != null) {
                                                        runnable3.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                } catch (Exception unused) {
                                    X0.a("操作失败");
                                    return;
                                }
                                break;
                            default:
                                try {
                                    Activity activity2 = InitOrigin.getActivity();
                                    int iQ2 = AbstractC0583w0.Q(8, activity2);
                                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                    final boolean z3 = z;
                                    LinearLayout linearLayoutO2 = AbstractC0583w0.O(activity2, "播放历史同步", z3 ? "播放时会记录到B站历史" : "只在本地播放，不记录到B站", z3 ? "已开启" : "已关闭", z3 ? AbstractC0583w0.f : AbstractC0583w0.h);
                                    linearLayoutO2.setLayoutParams(AbstractC0583w0.c0(iQ2));
                                    linearLayoutK2.addView(linearLayoutO2);
                                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity2);
                                    final boolean[] zArr2 = {z3};
                                    AbstractC0583w0.m(linearLayoutY2, "同步播放历史", "登录后可用，播放时自动记到B站历史", AbstractC0583w0.f, z3, 0, false, null, zArr2, null);
                                    linearLayoutY2.setLayoutParams(AbstractC0583w0.c0(iQ2));
                                    linearLayoutK2.addView(linearLayoutY2);
                                    AbstractC0583w0.l(linearLayoutK2, "开启后，你在这里看的B站视频也会出现在B站账号的观看历史里");
                                    final a aVar3 = (a) runnable;
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(AbstractC0583w0.q0(linearLayoutK2)).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.y
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            Runnable runnable2;
                                            Runnable runnable3;
                                            switch (i8) {
                                                case 0:
                                                    if (zArr2[0] != z3 && (runnable2 = aVar3) != null) {
                                                        runnable2.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (zArr2[0] != z3 && (runnable3 = aVar3) != null) {
                                                        runnable3.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                } catch (Exception unused2) {
                                    X0.a("操作失败");
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                Bili bili4 = this.b;
                bili4.getClass();
                RunnableC0453e runnableC0453e3 = new RunnableC0453e(bili4, i7);
                c cVar4 = bili4.j;
                final boolean z2 = cVar4.c;
                final a aVar2 = new a(cVar4, runnableC0453e3, i5);
                InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.z.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable = aVar2;
                        final int i8 = 0;
                        final int i9 = 1;
                        switch (i6) {
                            case 0:
                                try {
                                    Activity activity = InitOrigin.getActivity();
                                    int iQ = AbstractC0583w0.Q(8, activity);
                                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                    final boolean z3 = z2;
                                    LinearLayout linearLayoutO = AbstractC0583w0.O(activity, "渣机模式", z3 ? "过滤HDR/杜比/4K" : "显示全部画质", z3 ? "已开启" : "已关闭", z3 ? AbstractC0583w0.d : AbstractC0583w0.h);
                                    linearLayoutO.setLayoutParams(AbstractC0583w0.c0(iQ));
                                    linearLayoutK.addView(linearLayoutO);
                                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                    final boolean[] zArr = {z3};
                                    AbstractC0583w0.m(linearLayoutY, "渣机模式开关", "过滤高码率画质 保护低端设备", AbstractC0583w0.d, z3, 0, false, null, zArr, null);
                                    linearLayoutY.setLayoutParams(AbstractC0583w0.c0(iQ));
                                    linearLayoutK.addView(linearLayoutY);
                                    AbstractC0583w0.l(linearLayoutK, "开启后将过滤HDR/杜比视界/4K等高码率画质");
                                    final Runnable aVar3 = (a) runnable;
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.y
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            Runnable runnable2;
                                            Runnable runnable3;
                                            switch (i9) {
                                                case 0:
                                                    if (zArr[0] != z3 && (runnable2 = aVar3) != null) {
                                                        runnable2.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (zArr[0] != z3 && (runnable3 = aVar3) != null) {
                                                        runnable3.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                } catch (Exception unused) {
                                    X0.a("操作失败");
                                    return;
                                }
                                break;
                            default:
                                try {
                                    Activity activity2 = InitOrigin.getActivity();
                                    int iQ2 = AbstractC0583w0.Q(8, activity2);
                                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                    final boolean z4 = z2;
                                    LinearLayout linearLayoutO2 = AbstractC0583w0.O(activity2, "播放历史同步", z4 ? "播放时会记录到B站历史" : "只在本地播放，不记录到B站", z4 ? "已开启" : "已关闭", z4 ? AbstractC0583w0.f : AbstractC0583w0.h);
                                    linearLayoutO2.setLayoutParams(AbstractC0583w0.c0(iQ2));
                                    linearLayoutK2.addView(linearLayoutO2);
                                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity2);
                                    final boolean[] zArr2 = {z4};
                                    AbstractC0583w0.m(linearLayoutY2, "同步播放历史", "登录后可用，播放时自动记到B站历史", AbstractC0583w0.f, z4, 0, false, null, zArr2, null);
                                    linearLayoutY2.setLayoutParams(AbstractC0583w0.c0(iQ2));
                                    linearLayoutK2.addView(linearLayoutY2);
                                    AbstractC0583w0.l(linearLayoutK2, "开启后，你在这里看的B站视频也会出现在B站账号的观看历史里");
                                    final Runnable aVar4 = (a) runnable;
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(AbstractC0583w0.q0(linearLayoutK2)).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.y
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            Runnable runnable2;
                                            Runnable runnable3;
                                            switch (i8) {
                                                case 0:
                                                    if (zArr2[0] != z4 && (runnable2 = aVar4) != null) {
                                                        runnable2.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (zArr2[0] != z4 && (runnable3 = aVar4) != null) {
                                                        runnable3.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                } catch (Exception unused2) {
                                    X0.a("操作失败");
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                Bili bili5 = this.b;
                bili5.getClass();
                RunnableC0453e runnableC0453e4 = new RunnableC0453e(bili5, i7);
                c cVar5 = bili5.j;
                cVar5.getClass();
                InitOrigin.run(new RunnableC0341a(i, new h(cVar5, runnableC0453e4)));
                break;
            case 5:
                Bili bili6 = this.b;
                f fVar = bili6.k;
                P1.K0("个人中心管理", "管理个人中心模块显示和顺序", new String[]{"显示管理", "排序管理", "恢复默认"}, new String[]{fVar.E(), fVar.E(), "恢复默认模块"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.f, AbstractC0583w0.e}, new Runnable[]{new RunnableC0453e(bili6, 7), new RunnableC0453e(bili6, 8), new RunnableC0453e(bili6, 9)});
                break;
            case 6:
                Bili bili7 = this.b;
                bili7.getClass();
                try {
                    boolean z3 = FishCrypto.a;
                    String strH = C0297t1.h(".bilibili_cookie");
                    JsonObject jsonObjectC = !strH.isEmpty() ? I0.c(strH) : new JsonObject();
                    bili7.j.a(jsonObjectC);
                    f fVar2 = bili7.k;
                    fVar2.getClass();
                    JsonArray jsonArray = new JsonArray();
                    for (String str : fVar2.b) {
                        if (f.u(str)) {
                            jsonArray.add(str);
                        }
                    }
                    jsonObjectC.add("personalModules", jsonArray);
                    C0297t1.j(".bilibili_cookie", jsonObjectC.toString());
                } catch (Exception unused) {
                    return;
                }
                break;
            case 7:
                Bili bili8 = this.b;
                bili8.getClass();
                bili8.k.C(new RunnableC0453e(bili8, i7));
                break;
            case 8:
                Bili bili9 = this.b;
                bili9.getClass();
                bili9.k.B(new RunnableC0453e(bili9, i7));
                break;
            case 9:
                Bili bili10 = this.b;
                bili10.getClass();
                InitOrigin.run(new B(new RunnableC0453e(bili10, 15), i3));
                break;
            case 10:
                Bili bili11 = this.b;
                bili11.getClass();
                RunnableC0453e runnableC0453e5 = new RunnableC0453e(bili11, i7);
                c cVar6 = bili11.j;
                final boolean z4 = cVar6.b;
                final a aVar3 = new a(cVar6, runnableC0453e5, i6);
                InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.z.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable = aVar3;
                        final int i8 = 0;
                        final int i9 = 1;
                        switch (i5) {
                            case 0:
                                try {
                                    Activity activity = InitOrigin.getActivity();
                                    int iQ = AbstractC0583w0.Q(8, activity);
                                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                    final boolean z5 = z4;
                                    LinearLayout linearLayoutO = AbstractC0583w0.O(activity, "渣机模式", z5 ? "过滤HDR/杜比/4K" : "显示全部画质", z5 ? "已开启" : "已关闭", z5 ? AbstractC0583w0.d : AbstractC0583w0.h);
                                    linearLayoutO.setLayoutParams(AbstractC0583w0.c0(iQ));
                                    linearLayoutK.addView(linearLayoutO);
                                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                    final boolean[] zArr = {z5};
                                    AbstractC0583w0.m(linearLayoutY, "渣机模式开关", "过滤高码率画质 保护低端设备", AbstractC0583w0.d, z5, 0, false, null, zArr, null);
                                    linearLayoutY.setLayoutParams(AbstractC0583w0.c0(iQ));
                                    linearLayoutK.addView(linearLayoutY);
                                    AbstractC0583w0.l(linearLayoutK, "开启后将过滤HDR/杜比视界/4K等高码率画质");
                                    final Runnable aVar4 = (a) runnable;
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.y
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            Runnable runnable2;
                                            Runnable runnable3;
                                            switch (i9) {
                                                case 0:
                                                    if (zArr[0] != z5 && (runnable2 = aVar4) != null) {
                                                        runnable2.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (zArr[0] != z5 && (runnable3 = aVar4) != null) {
                                                        runnable3.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                } catch (Exception unused2) {
                                    X0.a("操作失败");
                                    return;
                                }
                                break;
                            default:
                                try {
                                    Activity activity2 = InitOrigin.getActivity();
                                    int iQ2 = AbstractC0583w0.Q(8, activity2);
                                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                    final boolean z6 = z4;
                                    LinearLayout linearLayoutO2 = AbstractC0583w0.O(activity2, "播放历史同步", z6 ? "播放时会记录到B站历史" : "只在本地播放，不记录到B站", z6 ? "已开启" : "已关闭", z6 ? AbstractC0583w0.f : AbstractC0583w0.h);
                                    linearLayoutO2.setLayoutParams(AbstractC0583w0.c0(iQ2));
                                    linearLayoutK2.addView(linearLayoutO2);
                                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity2);
                                    final boolean[] zArr2 = {z6};
                                    AbstractC0583w0.m(linearLayoutY2, "同步播放历史", "登录后可用，播放时自动记到B站历史", AbstractC0583w0.f, z6, 0, false, null, zArr2, null);
                                    linearLayoutY2.setLayoutParams(AbstractC0583w0.c0(iQ2));
                                    linearLayoutK2.addView(linearLayoutY2);
                                    AbstractC0583w0.l(linearLayoutK2, "开启后，你在这里看的B站视频也会出现在B站账号的观看历史里");
                                    final Runnable aVar5 = (a) runnable;
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(AbstractC0583w0.q0(linearLayoutK2)).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.y
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            Runnable runnable2;
                                            Runnable runnable3;
                                            switch (i8) {
                                                case 0:
                                                    if (zArr2[0] != z6 && (runnable2 = aVar5) != null) {
                                                        runnable2.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (zArr2[0] != z6 && (runnable3 = aVar5) != null) {
                                                        runnable3.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                } catch (Exception unused3) {
                                    X0.a("操作失败");
                                }
                                break;
                        }
                    }
                });
                break;
            case 11:
                Bili bili12 = this.b;
                bili12.getClass();
                RunnableC0453e runnableC0453e6 = new RunnableC0453e(bili12, i7);
                c cVar7 = bili12.j;
                final boolean z5 = cVar7.c;
                final a aVar4 = new a(cVar7, runnableC0453e6, i5);
                InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.z.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable = aVar4;
                        final int i8 = 0;
                        final int i9 = 1;
                        switch (i6) {
                            case 0:
                                try {
                                    Activity activity = InitOrigin.getActivity();
                                    int iQ = AbstractC0583w0.Q(8, activity);
                                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                    final boolean z6 = z5;
                                    LinearLayout linearLayoutO = AbstractC0583w0.O(activity, "渣机模式", z6 ? "过滤HDR/杜比/4K" : "显示全部画质", z6 ? "已开启" : "已关闭", z6 ? AbstractC0583w0.d : AbstractC0583w0.h);
                                    linearLayoutO.setLayoutParams(AbstractC0583w0.c0(iQ));
                                    linearLayoutK.addView(linearLayoutO);
                                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                    final boolean[] zArr = {z6};
                                    AbstractC0583w0.m(linearLayoutY, "渣机模式开关", "过滤高码率画质 保护低端设备", AbstractC0583w0.d, z6, 0, false, null, zArr, null);
                                    linearLayoutY.setLayoutParams(AbstractC0583w0.c0(iQ));
                                    linearLayoutK.addView(linearLayoutY);
                                    AbstractC0583w0.l(linearLayoutK, "开启后将过滤HDR/杜比视界/4K等高码率画质");
                                    final Runnable aVar5 = (a) runnable;
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.y
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            Runnable runnable2;
                                            Runnable runnable3;
                                            switch (i9) {
                                                case 0:
                                                    if (zArr[0] != z6 && (runnable2 = aVar5) != null) {
                                                        runnable2.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (zArr[0] != z6 && (runnable3 = aVar5) != null) {
                                                        runnable3.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                } catch (Exception unused2) {
                                    X0.a("操作失败");
                                    return;
                                }
                                break;
                            default:
                                try {
                                    Activity activity2 = InitOrigin.getActivity();
                                    int iQ2 = AbstractC0583w0.Q(8, activity2);
                                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                    final boolean z7 = z5;
                                    LinearLayout linearLayoutO2 = AbstractC0583w0.O(activity2, "播放历史同步", z7 ? "播放时会记录到B站历史" : "只在本地播放，不记录到B站", z7 ? "已开启" : "已关闭", z7 ? AbstractC0583w0.f : AbstractC0583w0.h);
                                    linearLayoutO2.setLayoutParams(AbstractC0583w0.c0(iQ2));
                                    linearLayoutK2.addView(linearLayoutO2);
                                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity2);
                                    final boolean[] zArr2 = {z7};
                                    AbstractC0583w0.m(linearLayoutY2, "同步播放历史", "登录后可用，播放时自动记到B站历史", AbstractC0583w0.f, z7, 0, false, null, zArr2, null);
                                    linearLayoutY2.setLayoutParams(AbstractC0583w0.c0(iQ2));
                                    linearLayoutK2.addView(linearLayoutY2);
                                    AbstractC0583w0.l(linearLayoutK2, "开启后，你在这里看的B站视频也会出现在B站账号的观看历史里");
                                    final Runnable aVar6 = (a) runnable;
                                    AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(AbstractC0583w0.q0(linearLayoutK2)).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.y
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i10) {
                                            Runnable runnable2;
                                            Runnable runnable3;
                                            switch (i8) {
                                                case 0:
                                                    if (zArr2[0] != z7 && (runnable2 = aVar6) != null) {
                                                        runnable2.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (zArr2[0] != z7 && (runnable3 = aVar6) != null) {
                                                        runnable3.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                                } catch (Exception unused3) {
                                    X0.a("操作失败");
                                }
                                break;
                        }
                    }
                });
                break;
            case 12:
                Bili bili13 = this.b;
                bili13.getClass();
                RunnableC0453e runnableC0453e7 = new RunnableC0453e(bili13, i7);
                c cVar8 = bili13.j;
                cVar8.getClass();
                InitOrigin.run(new B(new a(cVar8, runnableC0453e7, i4), i2));
                break;
            case 13:
                Bili bili14 = this.b;
                bili14.getClass();
                InitOrigin.run(new B(new RunnableC0453e(bili14, 16), i3));
                break;
            case 14:
                Bili bili15 = this.b;
                bili15.getClass();
                bili15.k.z(new RunnableC0453e(bili15, i7));
                break;
            case 15:
                Bili bili16 = this.b;
                bili16.getClass();
                bili16.k.z(new RunnableC0453e(bili16, i7));
                break;
            case 16:
                Bili bili17 = this.b;
                bili17.getClass();
                bili17.k.z(new RunnableC0453e(bili17, i7));
                break;
            case 17:
                Bili bili18 = this.b;
                bili18.getClass();
                P1.K0("重置设置", "选择要恢复默认的B站设置", new String[]{"分类恢复默认", "个人中心恢复默认"}, new String[]{"重置B站搜索分类", "恢复默认模块和排序"}, new int[]{AbstractC0583w0.f, AbstractC0583w0.e}, new Runnable[]{new RunnableC0453e(bili18, 12), new RunnableC0453e(bili18, 13)});
                break;
            case 18:
                Bili bili19 = this.b;
                bili19.getClass();
                bili19.k.C(new RunnableC0453e(bili19, i7));
                break;
            case 19:
                Bili bili20 = this.b;
                bili20.getClass();
                bili20.k.B(new RunnableC0453e(bili20, i7));
                break;
            case 20:
                Bili bili21 = this.b;
                bili21.getClass();
                InitOrigin.run(new B(new RunnableC0453e(bili21, 14), i3));
                break;
            default:
                this.b.getClass();
                InitOrigin.execute(new P2(18));
                break;
        }
    }
}

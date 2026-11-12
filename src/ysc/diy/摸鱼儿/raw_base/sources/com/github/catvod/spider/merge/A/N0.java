package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0559r1;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0562s;
import com.github.catvod.spider.merge.p022z.Z2;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class N0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ N0(int i, String str, String str2, String str3) {
        this.b = str;
        this.d = str2;
        this.e = str3;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zOptBoolean;
        boolean zOptBoolean2;
        String str = "取消";
        String str2 = "确定";
        int i = this.c;
        Object obj = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (this.a) {
            case 0:
                String str3 = (String) obj;
                final String str4 = (String) obj2;
                int i2 = this.c;
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        final String str5 = (String) obj3;
                        if (AbstractC0302v0.s1(str3)) {
                            try {
                                String strH = C0297t1.h(str4);
                                zOptBoolean = !TextUtils.isEmpty(strH) ? new JSONObject(strH).optBoolean("takeover", true) : true;
                                break;
                            } catch (Exception unused) {
                            }
                            try {
                                String strH2 = C0297t1.h(str4);
                                zOptBoolean2 = !TextUtils.isEmpty(strH2) ? new JSONObject(strH2).optBoolean("cleanup", false) : false;
                                break;
                            } catch (Exception unused2) {
                            }
                            final boolean[] zArr = {zOptBoolean, zOptBoolean2};
                            int iQ = AbstractC0583w0.Q(8, activity);
                            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                            linearLayoutK.addView(AbstractC0583w0.p(activity, str5 + "磁力云下载接管", "开启后，已登录" + str5 + "时磁力会交给" + str5 + "云下载处理"), AbstractC0583w0.c0(iQ));
                            LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                            LinearLayout linearLayout = new LinearLayout(activity);
                            linearLayout.setOrientation(1);
                            linearLayout.setDescendantFocusability(262144);
                            AbstractC0583w0.m(linearLayout, "接管磁力播放入口", "关闭后该云盘不处理磁力任务", i2, zArr[0], 0, false, null, zArr, null);
                            AbstractC0583w0.m(linearLayout, "自动清理上一次任务文件夹", "提交新任务前删除" + str5 + "上一次磁力目录", AbstractC0583w0.e, zArr[1], 1, true, null, zArr, null);
                            linearLayoutY.addView(linearLayout);
                            AbstractC0583w0.l(linearLayoutY, "后台关闭时，本地开关不会生效。");
                            linearLayoutK.addView(linearLayoutY);
                            AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.A.O0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    boolean[] zArr2 = zArr;
                                    boolean z = zArr2[0];
                                    String str6 = str4;
                                    AbstractC0302v0.y1(str6, "takeover", z);
                                    AbstractC0302v0.y1(str6, "cleanup", zArr2[1]);
                                    boolean z2 = zArr2[0];
                                    X0.a(com.github.catvod.spider.merge.D.b.j(z2 ? "已开启" : "已关闭", str5, "磁力接管"));
                                }
                            }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                        } else {
                            X0.a(AbstractC0302v0.t1(str3, str5 + "云下载已被后台关闭"));
                        }
                    }
                } catch (Exception e) {
                    com.github.catvod.spider.merge.D.b.x(e, new StringBuilder("配置失败: "));
                    return;
                }
                break;
            case 1:
                String str6 = (String) obj;
                String str7 = (String) obj3;
                C0559r1 c0559r1 = (C0559r1) obj2;
                c0559r1.getClass();
                try {
                    c0559r1.i(str6, i, str7);
                } catch (Exception e2) {
                    com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder("[FishDriveDialog] showAddEditDialog: "));
                    return;
                }
                break;
            case 2:
                final String[] strArr = (String[]) obj3;
                int[] iArr = (int[]) obj2;
                com.github.catvod.spider.merge.p022z.K1 k1 = (com.github.catvod.spider.merge.p022z.K1) obj;
                k1.getClass();
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity2);
                    linearLayoutK2.addView(AbstractC0583w0.p(activity2, "显示数量", "设置每种网盘最多展示多少条搜索结果"), layoutParams);
                    final int[] iArr2 = {i};
                    LinearLayout linearLayout2 = new LinearLayout(activity2);
                    linearLayout2.setOrientation(1);
                    final TextView[] textViewArr = new TextView[strArr.length];
                    final TextView[] textViewArr2 = new TextView[6];
                    int i3 = 0;
                    for (int i4 = 6; i3 < i4; i4 = 6) {
                        int i5 = i3 == i ? 1 : 0;
                        int[] iArr3 = com.github.catvod.spider.merge.p022z.K1.f;
                        int i6 = iArr3[i3 % iArr3.length];
                        LinearLayout linearLayoutG = com.github.catvod.spider.merge.p022z.K1.g(activity2, i6);
                        int i7 = i3 + 1;
                        int i8 = i;
                        linearLayoutG.addView(com.github.catvod.spider.merge.p022z.K1.f(activity2, String.valueOf(i7), i6));
                        TextView textView = new TextView(activity2);
                        textView.setText(strArr[i3]);
                        textView.setTextSize(14.0f);
                        textView.setTextColor(i5 != 0 ? AbstractC0583w0.c : AbstractC0583w0.g);
                        textView.setTypeface(null, i5);
                        textViewArr2[i3] = textView;
                        String str8 = str;
                        String str9 = str2;
                        int[] iArr4 = iArr;
                        linearLayoutG.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
                        TextView textView2 = new TextView(activity2);
                        textView2.setTextSize(18.0f);
                        textView2.setText(i5 != 0 ? "●" : "○");
                        textView2.setTextColor(i5 != 0 ? AbstractC0583w0.c : AbstractC0583w0.i);
                        textViewArr[i3] = textView2;
                        linearLayoutG.addView(textView2);
                        if (i3 > 0) {
                            linearLayout2.addView(AbstractC0583w0.C(activity2));
                        }
                        linearLayout2.addView(linearLayoutG);
                        final int i9 = i3;
                        linearLayoutG.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.x1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int[] iArr5 = iArr2;
                                int i10 = i9;
                                iArr5[0] = i10;
                                int i11 = 0;
                                while (i11 < strArr.length) {
                                    int i12 = i11 == i10 ? 1 : 0;
                                    TextView[] textViewArr3 = textViewArr2;
                                    textViewArr3[i11].setTextColor(i12 != 0 ? AbstractC0583w0.c : AbstractC0583w0.g);
                                    textViewArr3[i11].setTypeface(null, i12);
                                    TextView[] textViewArr4 = textViewArr;
                                    textViewArr4[i11].setText(i12 != 0 ? "●" : "○");
                                    textViewArr4[i11].setTextColor(i12 != 0 ? AbstractC0583w0.c : AbstractC0583w0.i);
                                    i11++;
                                }
                            }
                        });
                        iArr = iArr4;
                        i3 = i7;
                        i = i8;
                        str = str8;
                        str2 = str9;
                    }
                    linearLayoutK2.addView(AbstractC0583w0.s(activity2, linearLayout2));
                    AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayoutK2).setPositiveButton(str2, new DialogInterfaceOnClickListenerC0562s(k1, iArr, iArr2, strArr, 3)).setNegativeButton(str, (DialogInterface.OnClickListener) null).create());
                } catch (Exception e3) {
                    com.github.catvod.spider.merge.D.b.D(e3, new StringBuilder("[FishPsDialog] showMaxDialog: "));
                    return;
                }
                break;
            default:
                com.github.catvod.spider.merge.p022z.P1.e1((String) obj, this.c, (String) obj3, null, null, (Z2) obj2, null, null, null);
                break;
        }
    }

    public /* synthetic */ N0(C0559r1 c0559r1, String str, int i, String str2) {
        this.e = c0559r1;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ N0(com.github.catvod.spider.merge.p022z.K1 k1, int i, String[] strArr, int[] iArr) {
        this.b = k1;
        this.c = i;
        this.d = strArr;
        this.e = iArr;
    }

    public /* synthetic */ N0(String str, int i, boolean z, boolean z2, String str2, Runnable runnable, Runnable runnable2, Z2 z3, Runnable runnable3, String str3) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = z3;
    }
}

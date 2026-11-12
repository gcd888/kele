package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p017u.DialogInterfaceOnClickListenerC0454f;
import com.github.catvod.spider.merge.p017u.RunnableC0452d;
import com.github.catvod.spider.merge.p017u.RunnableC0459k;
import com.github.catvod.spider.merge.p017u.RunnableC0460l;
import com.github.catvod.spider.merge.p019w.a;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class M3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;

    public /* synthetic */ M3(String[] strArr, int i) {
        this.a = i;
        this.b = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = this.b;
        int i = 13;
        int i2 = 10;
        int i3 = 7;
        int i4 = 1;
        int i5 = 0;
        switch (this.a) {
            case 0:
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity != null) {
                        String[] strArr2 = {"夸克网盘", "UC网盘", "天翼云盘", "移动云盘", "百度网盘", "迅雷网盘", "123网盘", "115网盘", "阿里云盘", "光鸭网盘", "哔哩哔哩"};
                        String[] strArr3 = {P1.C1(strArr, 0), P1.C1(strArr, 1), P1.C1(strArr, 2), P1.C1(strArr, 3), P1.C1(strArr, 4), P1.C1(strArr, 5), P1.C1(strArr, 6), P1.C1(strArr, 7), P1.C1(strArr, 8), P1.C1(strArr, 9), P1.C1(strArr, 10)};
                        int[] iArr = {AbstractC0583w0.d, AbstractC0583w0.f, -16728876, -13730510, AbstractC0583w0.c, -14059009, -1499549, -16735786, -38400, -16728155, -298343};
                        Runnable[] runnableArr = {new RunnableC0452d(i3), new RunnableC0459k(12), new RunnableC0460l(i), new RunnableC0460l(i5), new RunnableC0460l(23), new RunnableC0452d(i), new RunnableC0452d(25), new RunnableC0452d(20), new RunnableC0452d(i2), new RunnableC0459k(i4), new RunnableC0452d(i5)};
                        int iQ = AbstractC0583w0.Q(8, activity);
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                        linearLayoutK.addView(AbstractC0583w0.p(activity, "账号总览", "当前账号状态"), AbstractC0583w0.c0(iQ));
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                        LinearLayout linearLayout = new LinearLayout(activity);
                        linearLayout.setOrientation(1);
                        linearLayout.setDescendantFocusability(262144);
                        AlertDialog[] alertDialogArr = new AlertDialog[1];
                        int i6 = 0;
                        while (i6 < 11) {
                            AbstractC0583w0.d(linearLayout, strArr2[i6], strArr3[i6], iArr[i6], i6 > 0).setOnClickListener(new V2(alertDialogArr, runnableArr, i6, 1));
                            i6++;
                        }
                        linearLayoutY.addView(AbstractC0583w0.J(activity, linearLayout, 320));
                        linearLayoutK.addView(linearLayoutY);
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("刷新状态", new DialogInterfaceOnClickListenerC0454f(13)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).create();
                        alertDialogArr[0] = alertDialogCreate;
                        AbstractC0583w0.j0(alertDialogCreate);
                    } else {
                        X0.a("请在应用界面中操作");
                    }
                } catch (Exception e) {
                    b.x(e, new StringBuilder("显示失败: "));
                    return;
                }
                break;
            default:
                String str = strArr[0];
                String str2 = strArr[2];
                if (!TextUtils.isEmpty(str)) {
                    X0.a("开始下载...");
                    InitOrigin.execute(new a(str, 21));
                } else {
                    X0.a("图片地址为空");
                }
                break;
        }
    }
}

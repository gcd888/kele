package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.E0;
import com.github.catvod.spider.merge.A.H0;
import com.github.catvod.spider.merge.A.P;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p017u.RunnableC0466s;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class I2 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ InterfaceC0549p0 g;
    public final /* synthetic */ Runnable h;

    public /* synthetic */ I2(String str, String str2, boolean z, int i, String str3, String str4, InterfaceC0549p0 interfaceC0549p0, Runnable runnable) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = interfaceC0549p0;
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Runnable runnable;
        String str;
        LinearLayout linearLayout;
        Button button;
        String str2 = this.b;
        final InterfaceC0549p0 interfaceC0549p0 = this.g;
        Runnable runnable2 = this.h;
        try {
            Activity activityD0 = P1.D0();
            if (activityD0 == null) {
                return;
            }
            int iQ = AbstractC0583w0.Q(8, activityD0);
            String str3 = this.a;
            String str4 = (str3 == null || !str3.startsWith("username,")) ? "手机号" : "账号";
            LinearLayout linearLayoutK = AbstractC0583w0.K(activityD0);
            linearLayoutK.addView(AbstractC0583w0.p(activityD0, str2, str4.concat(" + 密码登录")), AbstractC0583w0.c0(iQ));
            LinearLayout linearLayoutY = AbstractC0583w0.y(activityD0);
            boolean z = this.c;
            int i = this.d;
            String str5 = this.e;
            if (z) {
                linearLayout = linearLayoutY;
                runnable = runnable2;
                str = str5;
            } else {
                try {
                    TextView textViewX = AbstractC0583w0.x(activityD0, "扫码输入", i);
                    textViewX.setGravity(17);
                    textViewX.setFocusable(true);
                    AbstractC0583w0.n(textViewX, i);
                    runnable = runnable2;
                    str = str5;
                    linearLayout = linearLayoutY;
                    try {
                        textViewX.setOnClickListener(new L(i, 1, str2, str, str3));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.bottomMargin = iQ;
                        linearLayout.addView(textViewX, layoutParams);
                        linearLayout.addView(AbstractC0583w0.C(activityD0));
                    } catch (Exception e) {
                        e = e;
                        runnable2 = runnable;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            AbstractC0583w0.g(linearLayout, str4);
            String str6 = this.f;
            if (str6 == null) {
                str6 = "";
            }
            final EditText editTextE = AbstractC0583w0.e(linearLayout, str4, str6, false);
            AbstractC0583w0.g(linearLayout, "密码");
            final EditText editTextE2 = AbstractC0583w0.e(linearLayout, "密码", "", false);
            editTextE2.setInputType(129);
            linearLayoutK.addView(linearLayout);
            H0 h0 = H0.a;
            P p = new P(editTextE, (Object) editTextE2, 2);
            h0.getClass();
            final String str7 = str;
            H0.f(str7, p);
            final AlertDialog[] alertDialogArr = new AlertDialog[1];
            E0 e0 = new E0() { // from class: com.github.catvod.spider.merge.z.L2
                @Override // com.github.catvod.spider.merge.A.E0
                public final void a() {
                    InitOrigin.run(new RunnableC0466s(alertDialogArr, editTextE, editTextE2, str7, interfaceC0549p0));
                }
            };
            if (str7 != null) {
                H0.d.put(str7, e0);
            }
            runnable2 = runnable;
            RunnableC0593y0 runnableC0593y0 = new RunnableC0593y0(str7, runnable2, 2);
            AlertDialog.Builder onCancelListener = new AlertDialog.Builder(activityD0).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("登录", (DialogInterface.OnClickListener) null).setNegativeButton("取消", new E(runnableC0593y0, 7)).setOnCancelListener(new C0(runnableC0593y0, 1));
            if (z != 0) {
                onCancelListener.setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogArr[0] = alertDialogCreate;
            alertDialogCreate.show();
            AbstractC0583w0.l0(alertDialogArr[0], 0.0f);
            Button button2 = alertDialogArr[0].getButton(-1);
            if (button2 != null) {
                button2.setOnClickListener(new U0(editTextE, editTextE2, str4, str7, alertDialogArr, interfaceC0549p0));
            }
            if (!z || (button = alertDialogArr[0].getButton(-3)) == null) {
                return;
            }
            button.setOnClickListener(new L(i, 2, str2, str7, str3));
            return;
        } catch (Exception e3) {
            e = e3;
        }
        if (runnable2 != null) {
            runnable2.run();
        }
        b.x(e, new StringBuilder("显示失败: "));
    }
}

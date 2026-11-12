package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p017u.RunnableC0466s;
import com.github.catvod.spider.merge.p017u.ViewOnClickListenerC0470w;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class E0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e = true;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ I0 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ int k;

    public /* synthetic */ E0(String str, String str2, String str3, String str4, String str5, String str6, I0 i0, String str7, String str8, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.f = str5;
        this.g = str6;
        this.h = i0;
        this.i = str7;
        this.j = str8;
        this.k = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        boolean z = this.e;
        String str5 = this.f;
        String str6 = this.g;
        I0 i0 = this.h;
        String str7 = this.i;
        String str8 = this.j;
        int i = this.k;
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            try {
                LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                linearLayoutK.addView(AbstractC0583w0.p(activity, str, str2), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
                LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                AbstractC0583w0.g(linearLayoutY, str3);
                EditText editTextF = AbstractC0583w0.f(linearLayoutY, str4, "", z);
                if (!TextUtils.isEmpty(str5)) {
                    AbstractC0583w0.l(linearLayoutY, str5);
                }
                linearLayoutK.addView(linearLayoutY);
                AlertDialog[] alertDialogArr = new AlertDialog[1];
                RunnableC0466s runnableC0466s = new RunnableC0466s(alertDialogArr, str6, editTextF, str3, i0);
                P1.v(str6, str7, editTextF, runnableC0466s);
                AlertDialog.Builder view = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK));
                if (TextUtils.isEmpty(str8)) {
                    str8 = "确定";
                }
                AlertDialog alertDialogCreate = view.setPositiveButton(str8, (DialogInterface.OnClickListener) null).setNegativeButton("取消", new D1(str6, 2)).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setOnCancelListener(new O(str6, 2)).create();
                alertDialogArr[0] = alertDialogCreate;
                AbstractC0583w0.j0(alertDialogCreate);
                alertDialogArr[0].getButton(-1).setOnClickListener(new ViewOnClickListenerC0470w(runnableC0466s, 4));
                alertDialogArr[0].getButton(-3).setOnClickListener(new ViewOnClickListenerC0598z0(str, str6, str7, str3, str4, i, 0));
            } catch (Exception e) {
                b.D(e, new StringBuilder("[DownloadDialog] showSingleInput error: "));
            }
        } catch (Exception unused) {
        }
    }
}

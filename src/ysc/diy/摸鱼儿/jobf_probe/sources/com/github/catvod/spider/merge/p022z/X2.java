package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p000a.L0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class X2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ X2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    Activity activityD0 = P1.D0();
                    if (activityD0 != null) {
                        int iQ = AbstractC0583w0.Q(8, activityD0);
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activityD0);
                        LinearLayout linearLayoutO = AbstractC0583w0.O(activityD0, AbstractC0302v0.Y0("tianyi"), "输入手机号接收短信验证码", "短信登录", -29696);
                        linearLayoutO.setLayoutParams(AbstractC0583w0.c0(iQ));
                        linearLayoutK.addView(linearLayoutO);
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activityD0);
                        AbstractC0583w0.g(linearLayoutY, "手机号");
                        EditText editTextE = AbstractC0583w0.e(linearLayoutY, "输入" + AbstractC0302v0.Y0("tianyi") + "手机号", "", false);
                        editTextE.setInputType(3);
                        String str = (String) this.b;
                        if (str != null && !str.isEmpty()) {
                            editTextE.setText(str);
                        }
                        linearLayoutK.addView(linearLayoutY);
                        AlertDialog[] alertDialogArr = {null};
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(activityD0).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("发送验证码", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                        alertDialogArr[0] = alertDialogCreate;
                        alertDialogCreate.show();
                        Button button = alertDialogArr[0].getButton(-1);
                        if (button != null) {
                            button.setOnClickListener(new L0(editTextE, button, alertDialogArr));
                        }
                        AbstractC0583w0.l0(alertDialogArr[0], 0.0f);
                    }
                } catch (Exception e) {
                    b.x(e, new StringBuilder("显示短信登录弹窗失败: "));
                    return;
                }
                break;
            case 1:
                InitOrigin.run(new Y2(L0.q().a0((String) ((W2) ((O0) this.b).b).c), 1));
                break;
            case 2:
                C0586w3 c0586w3 = (C0586w3) this.b;
                if (!c0586w3.d.get()) {
                    if (!AbstractC0583w0.X(c0586w3.g)) {
                        c0586w3.j.run();
                    } else {
                        c0586w3.e.postDelayed(this, 500L);
                    }
                    break;
                }
                break;
            default:
                Z3 z3 = (Z3) this.b;
                if (!z3.j.get()) {
                    if (!AbstractC0583w0.X(z3.o)) {
                        Z3.a(z3, 3, "");
                    } else {
                        z3.n.postDelayed(this, 250L);
                    }
                    break;
                }
                break;
        }
    }
}

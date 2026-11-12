package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p000a.I0;
import com.github.catvod.spider.merge.p000a.L0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class W2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ W2(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                I0 i0 = (I0) this.b;
                int i = i0.a;
                W2 w2 = (W2) this.c;
                if (i != 3) {
                    ((Button) ((L0) w2.c).d).setEnabled(true);
                    ((Button) ((L0) w2.c).d).setText("发送验证码");
                    X0.a("发送失败: " + i0.b);
                } else {
                    ((AlertDialog[]) ((L0) w2.c).b)[0].dismiss();
                    InitOrigin.run(new W2((String) w2.b, i0, 3));
                }
                break;
            case 1:
                InitOrigin.run(new W2(this, L0.q().a0((String) this.b), 0));
                break;
            case 2:
                InitOrigin.run(new Y2(L0.q().K((I0) ((W2) ((L0) this.c).b).b, (String) this.b), 0));
                break;
            default:
                try {
                    Activity activityD0 = P1.D0();
                    if (activityD0 != null) {
                        int iQ = AbstractC0583w0.Q(8, activityD0);
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activityD0);
                        String strY0 = AbstractC0302v0.Y0("tianyi");
                        StringBuilder sb = new StringBuilder("验证码已发送至 ");
                        String str = (String) this.c;
                        if (str != null && str.length() >= 7) {
                            str = str.substring(0, 3) + "****" + str.substring(str.length() - 4);
                        }
                        sb.append(str);
                        LinearLayout linearLayoutO = AbstractC0583w0.O(activityD0, strY0, sb.toString(), "短信登录", -29696);
                        linearLayoutO.setLayoutParams(AbstractC0583w0.c0(iQ));
                        linearLayoutK.addView(linearLayoutO);
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activityD0);
                        AbstractC0583w0.g(linearLayoutY, "短信验证码");
                        EditText editTextE = AbstractC0583w0.e(linearLayoutY, "输入收到的短信验证码", "", false);
                        editTextE.setInputType(2);
                        linearLayoutK.addView(linearLayoutY);
                        AlertDialog[] alertDialogArr = {null};
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(activityD0).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("登录", (DialogInterface.OnClickListener) null).setNeutralButton("重新发送", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                        alertDialogArr[0] = alertDialogCreate;
                        alertDialogCreate.show();
                        Button button = alertDialogArr[0].getButton(-1);
                        Button button2 = alertDialogArr[0].getButton(-3);
                        if (button != null) {
                            button.setOnClickListener(new L0(this, editTextE, alertDialogArr, 3));
                        }
                        if (button2 != null) {
                            button2.setOnClickListener(new O0(1, this));
                        }
                        AbstractC0583w0.l0(alertDialogArr[0], 0.0f);
                    }
                } catch (Exception e) {
                    b.x(e, new StringBuilder("显示验证码弹窗失败: "));
                }
                break;
        }
    }
}

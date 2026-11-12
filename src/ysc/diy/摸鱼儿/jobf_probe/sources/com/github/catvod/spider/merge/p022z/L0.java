package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class L0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ L0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((P0) ((X1) this.b).b).setEmbyPersonalStates((boolean[]) this.c);
                X0.a("内容入口已保存");
                ((AlertDialog) this.d).dismiss();
                break;
            case 1:
                List list = (List) this.c;
                if (list.isEmpty()) {
                    X0.a("暂无Emby服务器");
                } else {
                    int i = 0;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        JSONObject jSONObject = (JSONObject) list.get(i2);
                        X1 x1 = (X1) this.b;
                        x1.getClass();
                        String strB = X1.B(i2, jSONObject);
                        if (!((Set) this.d).contains(strB)) {
                            X1.l(x1, strB);
                            i++;
                        }
                    }
                    X0.a(i > 0 ? "已发起全部刷新" : "没有已启用的Emby服务器");
                }
                break;
            case 2:
                String strE = AbstractC0449a.e((EditText) this.c);
                if (strE.isEmpty()) {
                    X0.a("请输入手机号");
                } else {
                    Button button = (Button) this.d;
                    button.setEnabled(false);
                    button.setText("发送中...");
                    InitOrigin.execute(new W2(this, strE, 1));
                }
                break;
            default:
                String strE2 = AbstractC0449a.e((EditText) this.c);
                if (strE2.isEmpty()) {
                    X0.a("请输入验证码");
                } else {
                    X0.a("正在登录...");
                    ((AlertDialog[]) this.d)[0].dismiss();
                    InitOrigin.execute(new W2(this, strE2, 2));
                }
                break;
        }
    }

    public L0(EditText editText, Button button, AlertDialog[] alertDialogArr) {
        this.a = 2;
        this.c = editText;
        this.d = button;
        this.b = alertDialogArr;
    }
}

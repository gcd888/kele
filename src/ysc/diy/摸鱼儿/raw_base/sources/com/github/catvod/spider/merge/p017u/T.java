package com.github.catvod.spider.merge.p017u;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Wallpaper;
import com.github.catvod.spider.merge.A.P0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0562s;
import com.github.catvod.spider.merge.p022z.E;
import com.github.catvod.spider.merge.p022z.I3;
import com.github.catvod.spider.merge.p022z.InterfaceC0577v;
import com.github.catvod.spider.merge.p022z.N3;
import com.github.catvod.spider.merge.p022z.O2;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.RunnableC0567t;
import com.github.catvod.spider.merge.p022z.e4;
import com.github.catvod.spider.merge.p022z.h4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class T implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ T(String str, int i, String str2, String str3, String str4, String str5, InterfaceC0577v interfaceC0577v) {
        this.a = 1;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = interfaceC0577v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        String str = this.d;
        String str2 = this.b;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        char c = 1;
        switch (this.a) {
            case 0:
                HashMap map = Wallpaper.a;
                ArrayList arrayList = (ArrayList) ((List) obj);
                Handler handler = h4.a;
                String str3 = this.d;
                String str4 = (String) obj4;
                String str5 = str3.isEmpty() ? str4 : str3;
                if (str5 == null || str5.isEmpty()) {
                    InitOrigin.run(new e4(5));
                } else {
                    InitOrigin.execute(new I3(str5, this.b, str4, (String) obj3, (String) obj2, this.c, arrayList, str3, 1));
                }
                break;
            case 1:
                try {
                    activity = InitOrigin.getActivity();
                } catch (Exception unused) {
                    activity = null;
                }
                if (activity != null) {
                    int iQ = AbstractC0583w0.Q(8, activity);
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                    String strM = b.m(new StringBuilder(), str2, "配置");
                    final int i = this.c;
                    linearLayoutK.addView(AbstractC0583w0.q(activity, strM, "接口、模型选择与连接验证", i), AbstractC0583w0.c0(iQ));
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                    int i2 = AbstractC0583w0.g;
                    AbstractC0583w0.c(i2, linearLayoutY, "API Key");
                    final EditText editTextF = AbstractC0583w0.f(linearLayoutY, "输入 API Key (sk-xxx)", str, false);
                    editTextF.setInputType(129);
                    AbstractC0583w0.c(i2, linearLayoutY, "BaseURL");
                    final EditText editTextF2 = AbstractC0583w0.f(linearLayoutY, "https://api.deepseek.com", (String) obj4, false);
                    AbstractC0583w0.c(i2, linearLayoutY, "Model");
                    final EditText editTextF3 = AbstractC0583w0.f(linearLayoutY, "deepseek-chat", (String) obj3, false);
                    linearLayoutK.addView(linearLayoutY, AbstractC0583w0.c0(iQ));
                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity);
                    final int i3 = 0;
                    AbstractC0583w0.d(linearLayoutY2, "获取模型列表", "使用当前填写的接口", AbstractC0583w0.d, false).setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.r
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i3) {
                                case 0:
                                    String strE = AbstractC0449a.e(editTextF);
                                    String strE2 = AbstractC0449a.e(editTextF2);
                                    EditText editText = editTextF3;
                                    String strE3 = AbstractC0449a.e(editText);
                                    C0572u c0572u = new C0572u(editText, 0);
                                    if (!strE2.isEmpty()) {
                                        view.setEnabled(false);
                                        X0.a("正在获取模型列表...");
                                        InitOrigin.execute(new RunnableC0543o(strE, strE2, view, strE3, i, c0572u));
                                    } else {
                                        X0.a("请先完成接口配置");
                                    }
                                    break;
                                default:
                                    String strE4 = AbstractC0449a.e(editTextF);
                                    String strE5 = AbstractC0449a.e(editTextF2);
                                    String strTrim = editTextF3.getText().toString().trim();
                                    view.setEnabled(false);
                                    X0.a("正在测试模型...");
                                    InitOrigin.execute(new RunnableC0553q(strE4, strE5, strTrim, view, i));
                                    break;
                            }
                        }
                    });
                    final int i4 = 1;
                    AbstractC0583w0.d(linearLayoutY2, "连接测试", "验证当前填写的完整配置", AbstractC0583w0.f, true).setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.r
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    String strE = AbstractC0449a.e(editTextF);
                                    String strE2 = AbstractC0449a.e(editTextF2);
                                    EditText editText = editTextF3;
                                    String strE3 = AbstractC0449a.e(editText);
                                    C0572u c0572u = new C0572u(editText, 0);
                                    if (!strE2.isEmpty()) {
                                        view.setEnabled(false);
                                        X0.a("正在获取模型列表...");
                                        InitOrigin.execute(new RunnableC0543o(strE, strE2, view, strE3, i, c0572u));
                                    } else {
                                        X0.a("请先完成接口配置");
                                    }
                                    break;
                                default:
                                    String strE4 = AbstractC0449a.e(editTextF);
                                    String strE5 = AbstractC0449a.e(editTextF2);
                                    String strTrim = editTextF3.getText().toString().trim();
                                    view.setEnabled(false);
                                    X0.a("正在测试模型...");
                                    InitOrigin.execute(new RunnableC0553q(strE4, strE5, strTrim, view, i));
                                    break;
                            }
                        }
                    });
                    linearLayoutK.addView(linearLayoutY2);
                    String str6 = (String) obj2;
                    P1.w(str6, new String[]{"api_key", "base_url", "model"}, new EditText[]{editTextF, editTextF2, editTextF3}, null);
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0562s((InterfaceC0577v) obj, editTextF, editTextF2, editTextF3, 0)).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterfaceOnDismissListenerC0472y(str6, 2)).create();
                    RunnableC0567t runnableC0567t = new RunnableC0567t(str2, i, 0, str6);
                    AbstractC0583w0.j0(alertDialogCreate);
                    Button button = alertDialogCreate.getButton(-3);
                    if (button != null) {
                        button.setOnClickListener(new ViewOnClickListenerC0470w(runnableC0567t, 1));
                    }
                    break;
                }
                break;
            default:
                String[][] strArr = (String[][]) obj4;
                int[] iArr = (int[]) obj3;
                Runnable runnable = (Runnable) obj2;
                N3 n3 = (N3) obj;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    int iQ2 = AbstractC0583w0.Q(8, activity2);
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                    linearLayoutK2.addView(AbstractC0583w0.p(activity2, str2, str), AbstractC0583w0.c0(iQ2));
                    int length = strArr.length;
                    String[] strArr2 = new String[length];
                    String[] strArr3 = new String[length];
                    int[] iArr2 = new int[length];
                    int[] iArr3 = {0};
                    int i5 = 0;
                    while (i5 < length) {
                        strArr2[i5] = strArr[i5][0];
                        strArr3[i5] = strArr[i5][c];
                        iArr2[i5] = Color.parseColor(strArr[i5][2]);
                        int i6 = length;
                        if (iArr[i5] == this.c) {
                            iArr3[0] = i5;
                        }
                        i5++;
                        length = i6;
                        c = 1;
                    }
                    linearLayoutK2.addView(AbstractC0583w0.J(activity2, AbstractC0583w0.E(activity2, strArr2, strArr3, iArr2, iArr3, null), 280));
                    AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(linearLayoutK2).setNeutralButton("重置默认", new E((O2) runnable, 11)).setPositiveButton("确定", new P0(iArr3, n3, 14)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                } catch (Exception e) {
                    b.x(e, new StringBuilder("设置失败: "));
                }
                break;
        }
    }

    public /* synthetic */ T(String str, String str2, String str3, String str4, String str5, int i, ArrayList arrayList) {
        this.a = 0;
        this.b = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.c = i;
        this.h = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ T(String str, String[][] strArr, int[] iArr, int i, O2 o2, N3 n3) {
        this.a = 2;
        this.b = str;
        this.d = "线程越高速度越快，但可能不稳定";
        this.e = strArr;
        this.f = iArr;
        this.c = i;
        this.g = o2;
        this.h = n3;
    }
}

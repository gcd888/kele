package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p017u.E;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class K implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ K(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        switch (this.a) {
            case 0:
                P1.H1((String) this.b);
                ((AlertDialog) this.c).dismiss();
                ((Runnable) this.d).run();
                break;
            case 1:
                H0 h0 = (H0) this.b;
                TextView textView = (TextView) this.c;
                TextView textView2 = (TextView) this.d;
                h0.a = !h0.a;
                textView.setText(h0.a ? "继续" : "暂停");
                if (textView2 != null) {
                    textView2.setText(h0.a ? "已暂停" : "恢复中");
                }
                break;
            case 2:
                P1.J0("添加" + ((String) this.b), "扫码在手机上输入分享链接", (String) this.c, (String) this.d, AbstractC0583w0.c);
                break;
            case 3:
                K1 k1 = (K1) this.c;
                k1.getClass();
                AlertDialog alertDialog = ((AlertDialog[]) this.d)[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                String str = (String) this.b;
                if (!TextUtils.isEmpty(str)) {
                    X0.a("读取频道模板中...");
                    InitOrigin.execute(new RunnableC0584w1(k1, str, 2));
                    break;
                }
                break;
            case 4:
                Set set = (Set) this.c;
                String str2 = (String) this.b;
                if (set.contains(str2)) {
                    set.remove(str2);
                } else {
                    set.add(str2);
                }
                ((Runnable) this.d).run();
                break;
            case 5:
                List listEmptyList = (List) this.d;
                if (listEmptyList == null) {
                    listEmptyList = Collections.emptyList();
                }
                Context context = (Context) this.c;
                int iQ = AbstractC0583w0.Q(8, context);
                LinearLayout linearLayoutK = AbstractC0583w0.K(context);
                linearLayoutK.addView(AbstractC0583w0.q(context, P1.T((String) this.b), listEmptyList.size() + " 部追更", -16732991), AbstractC0583w0.c0(iQ));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout linearLayout2 = null;
                for (int i = 0; i < listEmptyList.size(); i++) {
                    LinearLayout linearLayoutI = P1.I((Activity) context, (O1) listEmptyList.get(i));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    if (i > 0) {
                        layoutParams.topMargin = iQ;
                    }
                    linearLayout.addView(linearLayoutI, layoutParams);
                    if (linearLayout2 == null) {
                        linearLayout2 = linearLayoutI;
                    }
                }
                ScrollView scrollViewJ = AbstractC0583w0.J((Activity) context, linearLayout, 320);
                linearLayoutK.addView(scrollViewJ);
                AbstractC0583w0.o(scrollViewJ, linearLayout);
                AbstractC0583w0.j0(new AlertDialog.Builder(context).setView(linearLayoutK).setPositiveButton("关闭", (DialogInterface.OnClickListener) null).create());
                if (linearLayout2 != null) {
                    linearLayout2.post(new RunnableC0494e0(linearLayout2, 2));
                }
                break;
            case 6:
                boolean[] zArr = (boolean[]) this.b;
                int length = zArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = true;
                    } else if (zArr[i2]) {
                        i2++;
                    } else {
                        z = false;
                    }
                }
                for (int i3 = 0; i3 < ((String[][]) this.c).length; i3++) {
                    zArr[i3] = !z;
                }
                ((Runnable[]) this.d)[0].run();
                break;
            case 7:
                AlertDialog alertDialog2 = ((AlertDialog[]) this.c)[0];
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                E e = (E) this.d;
                if (e != null) {
                    e.a((String) this.b);
                }
                break;
            case 8:
                Context context2 = (Context) this.c;
                String str3 = (String) this.b;
                String str4 = (String) this.d;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) context2.getSystemService("clipboard");
                    if (clipboardManager != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(str3, str4));
                        X0.a(str3 + "已复制到剪贴板");
                    }
                } catch (Exception unused) {
                    X0.a("复制失败");
                    return;
                }
                break;
            case 9:
                AlertDialog alertDialog3 = ((AlertDialog[]) this.b)[0];
                if (alertDialog3 != null) {
                    alertDialog3.dismiss();
                }
                ((M2) this.c).getClass();
                String[] strArr = (String[]) this.d;
                P1.t1(strArr[4], strArr[5]);
                break;
            case 10:
                boolean[] zArr2 = (boolean[]) this.d;
                int i4 = 0;
                for (boolean z2 : zArr2) {
                    if (z2) {
                        i4++;
                    }
                }
                if (i4 == 0) {
                    X0.a("至少启用一种播放源");
                } else {
                    if (zArr2.length == C0299u0.b0.length) {
                        C0299u0.b0 = zArr2;
                        C0299u0.N0();
                    }
                    X0.a(((String) this.b) + "设置已保存");
                    ((AlertDialog) this.c).dismiss();
                }
                break;
            default:
                h4.j((Application) ((Context) this.b), "设为壁纸", "下次随机将固定显示该壁纸\n\n[ 重要提示 ]\n设置后需要到播放器的壁纸设置中\n点击「刷新」按钮使壁纸生效", "确认设置", new W3((String[]) this.c, (Dialog) this.d, 2));
                break;
        }
    }

    public /* synthetic */ K(Object obj, Object obj2, String str, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = str;
    }

    public /* synthetic */ K(Object obj, String str, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = str;
        this.d = obj2;
    }

    public /* synthetic */ K(AlertDialog[] alertDialogArr, M2 m2, int i, String[] strArr) {
        this.a = 9;
        this.b = alertDialogArr;
        this.c = m2;
        this.d = strArr;
    }

    public /* synthetic */ K(boolean[] zArr, String str, AlertDialog alertDialog) {
        this.a = 10;
        this.d = zArr;
        this.b = str;
        this.c = alertDialog;
    }
}

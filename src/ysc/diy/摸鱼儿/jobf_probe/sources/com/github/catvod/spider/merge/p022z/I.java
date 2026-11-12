package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.B;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.ViewOnClickListenerC0470w;
import com.github.catvod.spider.merge.p017u.W;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class I implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ I(String str, String str2, int i, String str3, String str4, Runnable runnable, String str5, String str6, String str7, Q q) {
        this.a = 0;
        this.c = str;
        this.d = str2;
        this.b = i;
        this.e = str3;
        this.f = str4;
        this.j = runnable;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.k = q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean, int] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Activity activity;
        ?? r3;
        boolean z;
        Runnable runnable;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        String strConcat;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.k;
        Object obj7 = this.j;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (this.a) {
            case 0:
                String str2 = (String) obj9;
                final String str3 = (String) obj8;
                int i = this.b;
                final String str4 = (String) obj;
                final Q q = (Q) obj6;
                try {
                    try {
                        Activity activity2 = InitOrigin.getActivity();
                        if (activity2 == null) {
                            X0.a("请先打开主界面");
                            activity = null;
                        } else {
                            activity = activity2;
                        }
                    } catch (Exception unused) {
                        X0.a("请先打开主界面");
                    }
                    if (activity == null) {
                        break;
                    } else {
                        int iQ = AbstractC0583w0.Q(8, activity);
                        AlertDialog[] alertDialogArr = new AlertDialog[1];
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                        LinearLayout linearLayoutO = AbstractC0583w0.O(activity, str2, "手动输入" + str3, str3, i);
                        linearLayoutO.setLayoutParams(AbstractC0583w0.c0(iQ));
                        linearLayoutK.addView(linearLayoutO);
                        String str5 = (String) obj5;
                        boolean z2 = (!"Cookie".equalsIgnoreCase(str3) || str5 == null || str5.trim().isEmpty()) ? false : true;
                        String str6 = (String) obj4;
                        Runnable runnable2 = (Runnable) obj7;
                        boolean z3 = (str6 == null || runnable2 == null) ? false : true;
                        boolean z4 = z3 && str6.contains("清除");
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                        AbstractC0583w0.g(linearLayoutY, str3);
                        String str7 = (String) obj3;
                        if (str7 == null || str7.isEmpty()) {
                            str7 = "粘贴" + str2 + " " + str3;
                        }
                        String str8 = (String) obj2;
                        if (str8 == null) {
                            str8 = "";
                        }
                        boolean zIsEmpty = str8.trim().isEmpty();
                        boolean z5 = !zIsEmpty;
                        final String[] strArr = {str8};
                        final boolean[] zArr = {zIsEmpty};
                        final String[] strArr2 = {P1.q0(str8)};
                        if (z5) {
                            str8 = strArr2[0];
                        }
                        String lowerCase = str3.toLowerCase(Locale.ROOT);
                        boolean z6 = z3;
                        if (lowerCase.contains("cookie") || lowerCase.contains("token") || lowerCase.contains("authorization")) {
                            r3 = 1;
                            z = true;
                        } else {
                            r3 = 1;
                            z = false;
                        }
                        final EditText editTextE = AbstractC0583w0.e(linearLayoutY, str7, str8, !z);
                        if (z) {
                            editTextE.setSingleLine(r3);
                            editTextE.setMinLines(r3);
                            editTextE.setMaxLines(r3);
                            editTextE.setEllipsize(TextUtils.TruncateAt.END);
                            editTextE.setGravity(8388627);
                        } else {
                            editTextE.setMinLines(4);
                            editTextE.setMaxLines(4);
                            editTextE.setGravity(8388659);
                            editTextE.setVerticalScrollBarEnabled(true);
                        }
                        if (z5) {
                            editTextE.setFocusable(false);
                            editTextE.setFocusableInTouchMode(false);
                            editTextE.setCursorVisible(false);
                            editTextE.setLongClickable(false);
                        }
                        linearLayoutK.addView(linearLayoutY, AbstractC0583w0.c0(iQ));
                        LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity);
                        AbstractC0583w0.d(linearLayoutY2, "扫码输入", "用手机填写".concat(str3), i, false).setOnClickListener(new L(i, 0, str2, str3, str4));
                        String strConcat2 = "显示/隐藏".concat(str3);
                        int i2 = AbstractC0583w0.c;
                        AbstractC0583w0.d(linearLayoutY2, strConcat2, "切换当前内容可见性", i2, true).setOnClickListener(new M(editTextE, str3, strArr, zArr, strArr2));
                        if (z2) {
                            AbstractC0583w0.d(linearLayoutY2, "打开网站", str5, i, true).setOnClickListener(new N(activity, str5, 0));
                            AbstractC0583w0.d(linearLayoutY2, "获取Cookie教程", "查看获取方式", i2, true).setOnClickListener(new B(str2, str5, 1));
                        }
                        if (!z6 || z4) {
                            runnable = runnable2;
                            str = str6;
                        } else {
                            if (str6 == null) {
                                charSequence2 = "复制";
                                strConcat = "";
                                charSequence = "清除";
                                str = str6;
                            } else {
                                charSequence = "清除";
                                str = str6;
                                if (str.contains(charSequence)) {
                                    strConcat = "清除当前".concat(str3);
                                    charSequence2 = "复制";
                                } else {
                                    charSequence2 = "复制";
                                    strConcat = str.contains(charSequence2) ? "复制当前".concat(str3) : "执行操作";
                                }
                            }
                            if (str != null) {
                                if (str.contains(charSequence)) {
                                    i = AbstractC0583w0.e;
                                } else if (str.contains(charSequence2)) {
                                    i = i2;
                                }
                            }
                            LinearLayout linearLayoutD = AbstractC0583w0.d(linearLayoutY2, str, strConcat, i, true);
                            runnable = runnable2;
                            linearLayoutD.setOnClickListener(new ViewOnClickListenerC0470w(runnable, 2));
                        }
                        linearLayoutK.addView(linearLayoutY2);
                        P1.v(str4, "value", editTextE, new RunnableC0508h(alertDialogArr, str3, editTextE, zArr, strArr, strArr2, q, str4));
                        AlertDialog.Builder onCancelListener = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).setPositiveButton("保存", (DialogInterface.OnClickListener) null).setOnCancelListener(new O(str4, 0));
                        if (z4) {
                            onCancelListener.setNeutralButton(str, (DialogInterface.OnClickListener) null);
                        }
                        AlertDialog alertDialogCreate = onCancelListener.create();
                        int i3 = 0;
                        alertDialogArr[0] = alertDialogCreate;
                        alertDialogCreate.show();
                        AbstractC0583w0.l0(alertDialogArr[0], 0.0f);
                        final AlertDialog alertDialog = alertDialogArr[0];
                        Runnable runnable3 = z4 ? runnable : null;
                        Button button = alertDialog.getButton(-2);
                        if (button != null) {
                            button.setOnClickListener(new P(str4, alertDialog, i3));
                        }
                        Button button2 = alertDialog.getButton(-1);
                        if (button2 != null) {
                            button2.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.J
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    boolean z7 = zArr[0];
                                    String str9 = strArr[0];
                                    String str10 = strArr2[0];
                                    String strE = AbstractC0449a.e(editTextE);
                                    if (!z7 && strE.equals(str10)) {
                                        strE = str9 == null ? "" : str9.trim();
                                    }
                                    String str11 = str3;
                                    if ("Cookie".equalsIgnoreCase(str11)) {
                                        strE = P1.u0(strE);
                                    }
                                    if (strE.isEmpty()) {
                                        X0.a("请输入".concat(str11));
                                        return;
                                    }
                                    P1.H1(str4);
                                    AlertDialog alertDialog2 = alertDialog;
                                    if (alertDialog2 != null) {
                                        alertDialog2.dismiss();
                                    }
                                    InitOrigin.execute(new RunnableC0242b(q, strE, 17));
                                }
                            });
                        }
                        Button button3 = alertDialog.getButton(-3);
                        if (button3 != null && runnable3 != null) {
                            button3.setOnClickListener(new K(str4, alertDialog, runnable3, 0));
                            break;
                        }
                    }
                } catch (Exception e) {
                    b.x(e, new StringBuilder("显示失败: "));
                    return;
                }
                break;
            case 1:
                List list = (List) obj9;
                int iMax = Math.max(1, (list.size() + 4) / 5);
                int[] iArr = (int[]) obj8;
                int i4 = iMax - 1;
                iArr[0] = Math.max(0, Math.min(iArr[0], i4));
                StringBuilder sb = new StringBuilder();
                sb.append(iArr[0] + 1);
                sb.append(" / ");
                sb.append(iMax);
                String str9 = " · ";
                sb.append(" · ");
                sb.append(list.size());
                sb.append(" 个更新日");
                ((TextView) obj5).setText(sb.toString());
                LinearLayout linearLayout = (LinearLayout) obj4;
                linearLayout.removeAllViews();
                View[] viewArr = (View[]) obj3;
                viewArr[0] = null;
                Context context = (Context) obj2;
                if (list.isEmpty()) {
                    linearLayout.addView(AbstractC0583w0.D((Activity) context, b.l(new StringBuilder("未来 "), this.b, " 天暂无追更排期")));
                } else {
                    int i5 = iArr[0] * 5;
                    int iMin = Math.min(list.size(), i5 + 5);
                    while (i5 < iMin) {
                        String str10 = (String) list.get(i5);
                        List list2 = (List) ((Map) obj).get(list.get(i5));
                        int i6 = iMin;
                        int iQ2 = AbstractC0583w0.Q(4, context);
                        Object obj10 = obj;
                        int iQ3 = AbstractC0583w0.Q(8, context);
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.setOrientation(1);
                        TextView textView = new TextView(context);
                        int i7 = i4;
                        textView.setText(P1.T(str10) + str9 + list2.size() + " 部");
                        textView.setTextSize(14.0f);
                        textView.setTextColor(AbstractC0583w0.g);
                        textView.setTypeface(null, 1);
                        textView.setPadding(iQ2, iQ2, iQ2, iQ3);
                        linearLayout2.addView(textView);
                        int i8 = 0;
                        while (i8 < list2.size()) {
                            LinearLayout linearLayoutI = P1.I((Activity) context, (O1) list2.get(i8));
                            String str11 = str9;
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            if (i8 > 0) {
                                layoutParams.topMargin = iQ3;
                            }
                            linearLayout2.addView(linearLayoutI, layoutParams);
                            if (viewArr[0] == null) {
                                viewArr[0] = linearLayoutI;
                            }
                            i8++;
                            str9 = str11;
                        }
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.bottomMargin = iQ3;
                        linearLayout.addView(linearLayout2, layoutParams2);
                        i5++;
                        iMin = i6;
                        obj = obj10;
                        i4 = i7;
                        str9 = str9;
                    }
                }
                int i9 = i4;
                ScrollView scrollView = (ScrollView) obj7;
                scrollView.scrollTo(0, 0);
                AlertDialog alertDialog2 = (AlertDialog) obj6;
                AbstractC0583w0.n0(alertDialog2.getButton(-3), list.size() > 5, iArr[0] > 0);
                AbstractC0583w0.n0(alertDialog2.getButton(-2), list.size() > 5, iArr[0] < i9);
                AbstractC0583w0.o(scrollView, linearLayout);
                AbstractC0583w0.f0(alertDialog2);
                View view = viewArr[0];
                if (view != null) {
                    view.post(new RunnableC0494e0(view, 3));
                }
                break;
            default:
                String str12 = (String) obj9;
                final String str13 = (String) obj8;
                final String str14 = str12.isEmpty() ? str13 : str12;
                final Bitmap bitmapE = h4.e(str14);
                Handler handler = h4.a;
                final LinearLayout linearLayout3 = (LinearLayout) obj7;
                final LinearLayout linearLayout4 = (LinearLayout) obj6;
                final ProgressBar progressBar = (ProgressBar) obj5;
                final int[] iArr2 = (int[]) obj4;
                final int i10 = this.b;
                final String[] strArr3 = (String[]) obj3;
                final String[] strArr4 = (String[]) obj2;
                final ImageView imageView = (ImageView) obj;
                handler.post(new Runnable() { // from class: com.github.catvod.spider.merge.z.c4
                    @Override // java.lang.Runnable
                    public final void run() {
                        progressBar.setVisibility(8);
                        Bitmap bitmap = bitmapE;
                        if (bitmap == null) {
                            X0.a("图片加载失败");
                            return;
                        }
                        iArr2[0] = i10;
                        String[] strArr5 = strArr3;
                        strArr5[0] = str14;
                        strArr5[1] = str13;
                        String[] strArr6 = strArr4;
                        strArr5[2] = strArr6.length > 2 ? strArr6[2] : "壁纸";
                        strArr5[3] = strArr6.length > 3 ? strArr6[3] : "";
                        strArr5[4] = strArr6.length > 4 ? strArr6[4] : "";
                        ImageView imageView2 = imageView;
                        imageView2.setImageBitmap(bitmap);
                        imageView2.post(new W(imageView2, linearLayout3, linearLayout4, 18));
                    }
                });
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ I(String str, String str2, ProgressBar progressBar, int[] iArr, int i, String[] strArr, String[] strArr2, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.a = 2;
        this.c = str;
        this.d = str2;
        this.e = progressBar;
        this.f = iArr;
        this.b = i;
        this.g = strArr;
        this.h = strArr2;
        this.i = imageView;
        this.j = linearLayout;
        this.k = linearLayout2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ I(ArrayList arrayList, int[] iArr, TextView textView, LinearLayout linearLayout, View[] viewArr, Activity activity, TreeMap treeMap, ScrollView scrollView, AlertDialog alertDialog) {
        this.a = 1;
        this.c = arrayList;
        this.d = iArr;
        this.e = textView;
        this.f = linearLayout;
        this.g = viewArr;
        this.h = activity;
        this.b = 31;
        this.i = treeMap;
        this.j = scrollView;
        this.k = alertDialog;
    }
}

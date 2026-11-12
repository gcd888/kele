package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class S3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Z3 b;

    public /* synthetic */ S3(Z3 z3, int i) {
        this.a = i;
        this.b = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16, types: [android.view.View$OnClickListener, com.github.catvod.spider.merge.z.T3, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        final int i = 0;
        final int i2 = 1;
        switch (this.a) {
            case 0:
                final Z3 z3 = this.b;
                z3.k.set(true);
                if (z3.j.get()) {
                    z3.b();
                } else {
                    try {
                        Activity activity = InitOrigin.getActivity();
                        if (!AbstractC0583w0.X(activity)) {
                            Z3.a(z3, 3, "");
                        } else {
                            z3.o = activity;
                            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                            final boolean z = z3.d == 2;
                            String str = z ? "计算结果" : "验证码";
                            String str2 = z ? "请输入计算结果" : "请输入4位数字";
                            String str3 = z ? "请计算图片中的算式并输入结果，或点击下方“扫码输入”" : "请输入图片中的4位数字，或点击下方“扫码输入”";
                            String str4 = z ? "填写计算结果并确认" : "填写4位数字并确认";
                            linearLayoutK.addView(AbstractC0583w0.p(activity, "验证码", str3), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activity)));
                            LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                            linearLayoutY.setGravity(17);
                            int iMin = Math.min(AbstractC0583w0.Q(280, activity), Math.max(AbstractC0583w0.Q(180, activity), activity.getResources().getDisplayMetrics().widthPixels - AbstractC0583w0.Q(120, activity)));
                            int iMax = Math.max(AbstractC0583w0.Q(64, activity), Math.round(iMin / z3.c));
                            if (z3.a != null) {
                                ImageView imageView = new ImageView(activity);
                                imageView.setImageBitmap(z3.a);
                                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                imageView.setAdjustViewBounds(true);
                                z3.h.set(imageView);
                                linearLayoutY.addView(imageView, new LinearLayout.LayoutParams(iMin, iMax));
                            } else {
                                WebView webView = new WebView(activity);
                                WebSettings settings = webView.getSettings();
                                settings.setJavaScriptEnabled(false);
                                settings.setBlockNetworkLoads(true);
                                settings.setAllowFileAccess(false);
                                settings.setAllowContentAccess(false);
                                webView.setBackgroundColor(-1);
                                webView.setFocusable(false);
                                webView.setFocusableInTouchMode(false);
                                webView.loadDataWithBaseURL(null, z3.b, "image/svg+xml", "UTF-8", null);
                                z3.i.set(webView);
                                linearLayoutY.addView(webView, new LinearLayout.LayoutParams(iMin, iMax));
                            }
                            TextView textViewF = AbstractC0583w0.F(activity, "换一张", AbstractC0583w0.i, -1);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.topMargin = AbstractC0583w0.Q(6, activity);
                            linearLayoutY.addView(textViewF, layoutParams);
                            linearLayoutK.addView(linearLayoutY, AbstractC0583w0.c0(AbstractC0583w0.Q(10, activity)));
                            LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity);
                            AbstractC0583w0.g(linearLayoutY2, str);
                            final EditText editTextF = AbstractC0583w0.f(linearLayoutY2, str2, "", false);
                            editTextF.setInputType(z ? 4098 : 2);
                            editTextF.setFilters(new InputFilter[]{new InputFilter.LengthFilter(z ? 9 : 4)});
                            editTextF.setGravity(17);
                            editTextF.setTextSize(22.0f);
                            editTextF.setImeOptions(6);
                            linearLayoutK.addView(linearLayoutY2);
                            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("确认", (DialogInterface.OnClickListener) null).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).setCancelable(true).create();
                            alertDialogCreate.setCanceledOnTouchOutside(false);
                            z3.g.set(alertDialogCreate);
                            alertDialogCreate.setOnCancelListener(new DialogInterfaceOnCancelListenerC0581v3(i2, z3));
                            alertDialogCreate.setOnDismissListener(new Y1(5, z3));
                            alertDialogCreate.show();
                            AbstractC0583w0.l0(alertDialogCreate, 0.0f);
                            Button button = alertDialogCreate.getButton(-1);
                            Button button2 = alertDialogCreate.getButton(-3);
                            Button button3 = alertDialogCreate.getButton(-2);
                            final ?? r14 = new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.T3
                                /* JADX WARN: Code duplicated, block: B:38:0x006f  */
                                /* JADX WARN: Code duplicated, block: B:39:0x0072  */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    String str5;
                                    EditText editText = editTextF;
                                    String strE = AbstractC0449a.e(editText);
                                    Z3 z4 = z3;
                                    int i3 = 0;
                                    if (z4.d != 2) {
                                        if (strE != null && strE.length() == 4) {
                                            while (true) {
                                                if (i3 >= strE.length()) {
                                                    Z3.a(z4, 1, strE);
                                                    return;
                                                }
                                                char cCharAt = strE.charAt(i3);
                                                if (cCharAt < '0' || cCharAt > '9') {
                                                    break;
                                                } else {
                                                    i3++;
                                                }
                                            }
                                        }
                                        if (z) {
                                            str5 = "请输入计算结果";
                                        } else {
                                            str5 = "请输入4位数字验证码";
                                        }
                                        X0.a(str5);
                                        editText.requestFocus();
                                        editText.selectAll();
                                    }
                                    if (strE != null) {
                                        String strTrim = strE.trim();
                                        if (!strTrim.isEmpty() && strTrim.length() <= 9) {
                                            i3 = strTrim.charAt(0) == '-' ? 1 : 0;
                                            if (i3 != strTrim.length()) {
                                                while (true) {
                                                    if (i3 >= strTrim.length()) {
                                                        Z3.a(z4, 1, strE);
                                                        return;
                                                    }
                                                    char cCharAt2 = strTrim.charAt(i3);
                                                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                                                        break;
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (z) {
                                        str5 = "请输入计算结果";
                                    } else {
                                        str5 = "请输入4位数字验证码";
                                    }
                                    X0.a(str5);
                                    editText.requestFocus();
                                    editText.selectAll();
                                }
                            };
                            if (button != 0) {
                                button.setOnClickListener(r14);
                            }
                            textViewF.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.U3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i) {
                                        case 0:
                                            Z3.a(z3, 2, "");
                                            break;
                                        default:
                                            Z3.a(z3, 3, "");
                                            break;
                                    }
                                }
                            });
                            if (button3 != null) {
                                button3.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.U3
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i2) {
                                            case 0:
                                                Z3.a(z3, 2, "");
                                                break;
                                            default:
                                                Z3.a(z3, 3, "");
                                                break;
                                        }
                                    }
                                });
                            }
                            editTextF.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.github.catvod.spider.merge.z.V3
                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                                    if (i3 != 6) {
                                        return false;
                                    }
                                    r14.onClick(editTextF);
                                    return true;
                                }
                            });
                            z3.p = "fanshu_captcha_" + System.nanoTime();
                            P1.x(button2, str, z3.p, "value", str, str4, AbstractC0583w0.c, editTextF, new W3(r14, editTextF, i));
                            z3.n.postDelayed(z3.q, 250L);
                            AbstractC0583w0.f0(alertDialogCreate);
                            editTextF.requestFocus();
                        }
                    } catch (Throwable unused) {
                        Z3.a(z3, 3, "");
                        return;
                    }
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}

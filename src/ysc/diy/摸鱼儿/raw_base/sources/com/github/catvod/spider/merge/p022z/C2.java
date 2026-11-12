package com.github.catvod.spider.merge.p022z;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.B;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.S.a;
import com.github.catvod.spider.merge.p017u.ViewOnClickListenerC0467t;
import com.github.catvod.spider.merge.p017u.z;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class C2 {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final WeakHashMap b = new WeakHashMap();

    public static LinearLayout.LayoutParams a(Context context, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(AbstractC0583w0.Q(4, context), 0, 0, 0);
        if (z) {
            layoutParams.leftMargin = AbstractC0583w0.Q(8, context);
        }
        return layoutParams;
    }

    public static int b(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static void c(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setDimAmount(0.72f);
        window.addFlags(2);
        window.setWindowAnimations(0);
        window.setLayout(-1, -1);
    }

    public static GradientDrawable d(Context context, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-526086);
        gradientDrawable.setStroke(AbstractC0583w0.Q(z ? 2 : 1, context), z ? AbstractC0583w0.c : AbstractC0583w0.j);
        gradientDrawable.setCornerRadius(AbstractC0583w0.Q(10, context));
        return gradientDrawable;
    }

    public static TextView e(Context context) {
        TextView textView = new TextView(context);
        textView.setTextColor(AbstractC0583w0.i);
        textView.setTextSize(12.0f);
        textView.setGravity(21);
        textView.setSingleLine(true);
        textView.setPadding(AbstractC0583w0.Q(10, context), 0, 0, 0);
        return textView;
    }

    public static TextView f(Context context, String str, final boolean z) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(-1);
        textView.setTextSize(str.length() > 1 ? 13.0f : 18.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setMinHeight(AbstractC0583w0.Q(z ? 40 : 36, context));
        textView.setMinWidth(AbstractC0583w0.Q(str.length() > 1 ? 54 : 36, context));
        textView.setPadding(AbstractC0583w0.Q(str.length() > 1 ? 12 : 0, context), 0, AbstractC0583w0.Q(str.length() <= 1 ? 0 : 12, context), 0);
        textView.setClickable(true);
        textView.setFocusable(z);
        textView.setFocusableInTouchMode(z);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(452984831);
        gradientDrawable.setCornerRadius(AbstractC0583w0.Q(18, context));
        gradientDrawable.setStroke(AbstractC0583w0.Q(1, context), 587202559);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(872415231);
        gradientDrawable2.setCornerRadius(AbstractC0583w0.Q(18, context));
        gradientDrawable2.setStroke(AbstractC0583w0.Q(1, context), -1275068417);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(1157627903);
        gradientDrawable3.setCornerRadius(AbstractC0583w0.Q(18, context));
        gradientDrawable3.setStroke(AbstractC0583w0.Q(1, context), -1);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable3);
        stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        textView.setBackground(stateListDrawable);
        textView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.github.catvod.spider.merge.z.q2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                if (z) {
                    view.animate().scaleX(z2 ? 1.05f : 1.0f).scaleY(z2 ? 1.05f : 1.0f).setDuration(120L).start();
                }
            }
        });
        return textView;
    }

    public static ScrollView g(Context context, LinearLayout linearLayout) {
        ScrollView scrollView = new ScrollView(context);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        scrollView.setFillViewport(true);
        scrollView.setFocusable(false);
        scrollView.setFocusableInTouchMode(false);
        scrollView.setDescendantFocusability(262144);
        linearLayout.setDescendantFocusability(262144);
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        AbstractC0583w0.o(scrollView, linearLayout);
        return scrollView;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:33:0x0071, B:35:0x0076), top: B:50:0x0071 }] */
    public static byte[] h(String str) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(12000);
                httpURLConnection.setReadTimeout(20000);
                httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
                if (httpURLConnection.getResponseCode() != 200) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused) {
                    }
                    return null;
                }
                if (httpURLConnection.getContentLength() > 8388608) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused2) {
                    }
                    return null;
                }
                inputStream = httpURLConnection.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            try {
                                inputStream.close();
                                httpURLConnection.disconnect();
                            } catch (Throwable unused3) {
                            }
                            return byteArray;
                        }
                        if (byteArrayOutputStream.size() + i > 8388608) {
                            try {
                                inputStream.close();
                                httpURLConnection.disconnect();
                            } catch (Throwable unused4) {
                            }
                            return null;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable unused5) {
                }
            } catch (Throwable unused6) {
                inputStream = null;
            }
        } catch (Throwable unused7) {
            httpURLConnection = null;
            inputStream = null;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused8) {
            }
        } else if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return null;
    }

    public static void i(View view) {
        if (view == null || view.getId() != -1) {
            return;
        }
        view.setId(View.generateViewId());
    }

    public static void j(TextView textView) {
        textView.setClickable(true);
        textView.setOnKeyListener(new ViewOnKeyListenerC0511h2(0));
    }

    public static LinearLayout.LayoutParams k(Context context, boolean z, boolean z2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0583w0.Q(z ? 54 : 36, context), AbstractC0583w0.Q(z2 ? 40 : 36, context));
        layoutParams.setMargins(AbstractC0583w0.Q(2, context), 0, AbstractC0583w0.Q(2, context), 0);
        return layoutParams;
    }

    public static AlertDialog l(final Activity activity, final a aVar, final InterfaceC0600z2 interfaceC0600z2) {
        final int i = 0;
        if (AbstractC0583w0.h0(activity)) {
            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
            linearLayoutK.setPadding(AbstractC0583w0.Q(16, activity), AbstractC0583w0.Q(16, activity), AbstractC0583w0.Q(16, activity), AbstractC0583w0.Q(14, activity));
            TextView textViewE = e(activity);
            LinearLayout linearLayoutQ = AbstractC0583w0.q(activity, (String) aVar.c, "", aVar.a);
            linearLayoutQ.addView(textViewE, new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayoutK.addView(linearLayoutQ, AbstractC0583w0.c0(AbstractC0583w0.Q(10, activity)));
            LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
            linearLayoutY.setPadding(AbstractC0583w0.Q(14, activity), AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(14, activity), AbstractC0583w0.Q(12, activity));
            ScrollView scrollViewG = g(activity, linearLayoutY);
            scrollViewG.setFillViewport(true);
            scrollViewG.setFocusable(true);
            scrollViewG.setFocusableInTouchMode(true);
            LinearLayout.LayoutParams layoutParamsC0 = AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity));
            layoutParamsC0.height = n(activity);
            linearLayoutK.addView(scrollViewG, layoutParamsC0);
            final int[] iArr = {0};
            final boolean[] zArr = {false};
            AlertDialog.Builder view = new AlertDialog.Builder(activity).setView(linearLayoutK);
            ArrayList arrayList = (ArrayList) aVar.e;
            AlertDialog.Builder cancelable = view.setPositiveButton(arrayList.size() <= 1 ? (String) aVar.d : "下一页", (DialogInterface.OnClickListener) null).setCancelable(false);
            if (arrayList.size() > 1) {
                cancelable.setNegativeButton("上一页", (DialogInterface.OnClickListener) null);
            }
            final AlertDialog alertDialogCreate = cancelable.create();
            alertDialogCreate.setCanceledOnTouchOutside(false);
            final RunnableC0473a runnableC0473a = new RunnableC0473a(activity, aVar, iArr, linearLayoutY, alertDialogCreate, textViewE, scrollViewG, 3);
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.github.catvod.spider.merge.z.r2
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    final InterfaceC0600z2 interfaceC0600z3 = interfaceC0600z2;
                    interfaceC0600z3.b();
                    final AlertDialog alertDialog = alertDialogCreate;
                    Button button = alertDialog.getButton(-2);
                    final Button button2 = alertDialog.getButton(-1);
                    final int[] iArr2 = iArr;
                    Runnable runnable = runnableC0473a;
                    if (button != null) {
                        button.setOnClickListener(new M(iArr2, (RunnableC0473a) runnable, button, alertDialog, 6));
                    }
                    if (button2 != null) {
                        final boolean[] zArr2 = zArr;
                        final RunnableC0473a runnableC0473a2 = (RunnableC0473a) runnable;
                        final a aVar2 = aVar;
                        button2.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.g2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int[] iArr3 = iArr2;
                                if (iArr3[0] < ((ArrayList) aVar2.e).size() - 1) {
                                    iArr3[0] = iArr3[0] + 1;
                                    runnableC0473a2.run();
                                    AbstractC0583w0.g0(button2);
                                } else {
                                    AlertDialog alertDialog2 = alertDialog;
                                    try {
                                        zArr2[0] = interfaceC0600z3.a();
                                    } catch (Throwable unused) {
                                    }
                                    alertDialog2.dismiss();
                                }
                            }
                        });
                    }
                    runnable.run();
                    AbstractC0583w0.g0(button2);
                }
            });
            final int i2 = 1;
            alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.z.d2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i2) {
                        case 0:
                            Dialog dialog = (Dialog) C2.b.remove(alertDialogCreate);
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            interfaceC0600z2.e(zArr[0]);
                            break;
                        default:
                            Dialog dialog2 = (Dialog) C2.b.remove(alertDialogCreate);
                            if (dialog2 != null) {
                                dialog2.dismiss();
                            }
                            interfaceC0600z2.e(zArr[0]);
                            break;
                    }
                }
            });
            alertDialogCreate.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.github.catvod.spider.merge.z.s2
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                    Button button;
                    int i4 = AbstractC0583w0.a;
                    if (!(keyEvent != null && keyEvent.getAction() == 0)) {
                        return false;
                    }
                    AlertDialog alertDialog = alertDialogCreate;
                    Button button2 = alertDialog.getButton(-2);
                    Button button3 = alertDialog.getButton(-1);
                    if (AbstractC0583w0.W(i3)) {
                        if (AbstractC0583w0.Z(button2) && button2.hasFocus()) {
                            button = button2;
                        } else {
                            button = (AbstractC0583w0.Z(button3) && button3.hasFocus()) ? button3 : null;
                        }
                        if (button == null) {
                            if (AbstractC0583w0.Z(button3)) {
                                button2 = button3;
                            }
                            button = button2;
                        }
                        if (!AbstractC0583w0.Z(button)) {
                            return false;
                        }
                        button.performClick();
                    } else if (i3 == 21 && AbstractC0583w0.Z(button2)) {
                        AbstractC0583w0.g0(button2);
                    } else {
                        if ((i3 != 22 && i3 != 20) || !AbstractC0583w0.Z(button3)) {
                            return false;
                        }
                        AbstractC0583w0.g0(button3);
                    }
                    return true;
                }
            });
            alertDialogCreate.show();
            AbstractC0583w0.l0(alertDialogCreate, 0.0f);
            linearLayoutK.post(new RunnableC0242b(runnableC0473a, alertDialogCreate, 25));
            return alertDialogCreate;
        }
        LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity);
        linearLayoutK2.setPadding(AbstractC0583w0.Q(16, activity), AbstractC0583w0.Q(16, activity), AbstractC0583w0.Q(16, activity), AbstractC0583w0.Q(14, activity));
        final TextView textViewE2 = e(activity);
        LinearLayout linearLayoutQ2 = AbstractC0583w0.q(activity, (String) aVar.c, "", aVar.a);
        linearLayoutQ2.addView(textViewE2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayoutK2.addView(linearLayoutQ2, AbstractC0583w0.c0(AbstractC0583w0.Q(10, activity)));
        final LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity);
        linearLayoutY2.setPadding(AbstractC0583w0.Q(14, activity), AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(14, activity), AbstractC0583w0.Q(12, activity));
        final ScrollView scrollViewG2 = g(activity, linearLayoutY2);
        scrollViewG2.setFillViewport(true);
        LinearLayout.LayoutParams layoutParamsC1 = AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity));
        layoutParamsC1.height = n(activity);
        linearLayoutK2.addView(scrollViewG2, layoutParamsC1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        final TextView textView = new TextView(activity);
        textView.setTextSize(12.0f);
        textView.setTextColor(AbstractC0583w0.i);
        textView.setGravity(16);
        textView.setSingleLine(true);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(21);
        int i3 = AbstractC0583w0.j;
        int i4 = AbstractC0583w0.h;
        final TextView textViewF = AbstractC0583w0.F(activity, "上一页", i3, i4);
        final TextView textViewF2 = AbstractC0583w0.F(activity, "下一页", i3, i4);
        final TextView textViewF3 = AbstractC0583w0.F(activity, (String) aVar.d, aVar.b, -1);
        q(activity, textViewF, false);
        q(activity, textViewF2, false);
        q(activity, textViewF3, true);
        j(textViewF);
        j(textViewF2);
        j(textViewF3);
        linearLayout2.addView(textViewF, a(activity, false));
        linearLayout2.addView(textViewF2, a(activity, false));
        linearLayout2.addView(textViewF3, a(activity, true));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
        linearLayoutK2.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        final int[] iArr2 = {0};
        final boolean[] zArr2 = {false};
        final AlertDialog alertDialogCreate2 = new AlertDialog.Builder(activity).setView(linearLayoutK2).setCancelable(false).create();
        alertDialogCreate2.setCanceledOnTouchOutside(false);
        Runnable runnable = new Runnable() { // from class: com.github.catvod.spider.merge.z.t2
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                a aVar2 = aVar;
                ArrayList arrayList2 = (ArrayList) aVar2.e;
                int[] iArr3 = iArr2;
                C2.m(activity, (C0590x2) arrayList2.get(iArr3[0]), linearLayoutY2, alertDialogCreate2);
                int size = ((ArrayList) aVar2.e).size();
                boolean z = true;
                boolean z2 = size > 1;
                boolean z3 = iArr3[0] == size + (-1);
                String string = "";
                if (z2) {
                    str = (iArr3[0] + 1) + " / " + size;
                } else {
                    str = "";
                }
                TextView textView2 = textViewE2;
                textView2.setText(str);
                textView2.setVisibility(z2 ? 0 : 8);
                if (z2) {
                    int i5 = iArr3[0];
                    StringBuilder sb = new StringBuilder();
                    int i6 = 0;
                    while (i6 < size) {
                        if (i6 > 0) {
                            sb.append(' ');
                        }
                        sb.append(i6 == i5 ? (char) 9679 : (char) 9675);
                        i6++;
                    }
                    string = sb.toString();
                }
                TextView textView3 = textView;
                textView3.setText(string);
                textView3.setVisibility(z2 ? 0 : 4);
                int i7 = z2 ? 0 : 8;
                TextView textView4 = textViewF;
                textView4.setVisibility(i7);
                int i8 = (!z2 || z3) ? 8 : 0;
                TextView textView5 = textViewF2;
                textView5.setVisibility(i8);
                int i9 = (!z2 || z3) ? 0 : 8;
                TextView textView6 = textViewF3;
                textView6.setVisibility(i9);
                C2.o(textView4, z2, iArr3[0] > 0);
                C2.o(textView5, z2 && !z3, z2 && !z3);
                boolean z4 = !z2 || z3;
                if (z2 && !z3) {
                    z = false;
                }
                C2.o(textView6, z4, z);
                scrollViewG2.scrollTo(0, 0);
            }
        };
        textViewF.setOnClickListener(new M(iArr2, runnable, textViewF, textViewF2, 7));
        textViewF2.setOnClickListener(new ViewOnClickListenerC0467t(iArr2, aVar, runnable, textViewF3, textViewF2, 4));
        textViewF3.setOnClickListener(new ViewOnClickListenerC0467t(iArr2, aVar, alertDialogCreate2, interfaceC0600z2, zArr2));
        alertDialogCreate2.setOnShowListener(new A1(interfaceC0600z2, runnable, aVar, textViewF2, textViewF3, 1));
        alertDialogCreate2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.z.d2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                switch (i) {
                    case 0:
                        Dialog dialog = (Dialog) C2.b.remove(alertDialogCreate2);
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        interfaceC0600z2.e(zArr2[0]);
                        break;
                    default:
                        Dialog dialog2 = (Dialog) C2.b.remove(alertDialogCreate2);
                        if (dialog2 != null) {
                            dialog2.dismiss();
                        }
                        interfaceC0600z2.e(zArr2[0]);
                        break;
                }
            }
        });
        alertDialogCreate2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.github.catvod.spider.merge.z.e2
            /* JADX WARN: Code duplicated, block: B:53:0x0085  */
            /* JADX WARN: Code duplicated, block: B:55:0x0089  */
            /* JADX WARN: Code duplicated, block: B:57:0x008f  */
            /* JADX WARN: Code duplicated, block: B:60:0x0096  */
            /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
                int i6 = AbstractC0583w0.a;
                if (!(keyEvent != null && keyEvent.getAction() == 0)) {
                    return false;
                }
                boolean zW = AbstractC0583w0.W(i5);
                TextView textView2 = textViewF;
                TextView textView3 = textViewF2;
                TextView textView4 = textViewF3;
                if (zW) {
                    if (!AbstractC0583w0.Z(textView2) || !textView2.hasFocus()) {
                        if (AbstractC0583w0.Z(textView3) && textView3.hasFocus()) {
                            textView2 = textView3;
                        } else {
                            textView2 = (AbstractC0583w0.Z(textView4) && textView4.hasFocus()) ? textView4 : null;
                        }
                    }
                    if (textView2 == null) {
                        if (!AbstractC0583w0.Z(textView3)) {
                            textView3 = textView4;
                        }
                        textView2 = textView3;
                    }
                    if (!AbstractC0583w0.Z(textView2)) {
                        return false;
                    }
                    textView2.performClick();
                } else if (i5 == 21 && AbstractC0583w0.Z(textView2)) {
                    AbstractC0583w0.g0(textView2);
                } else if (i5 == 22) {
                    TextView textView5 = AbstractC0583w0.Z(textView3) ? textView3 : textView4;
                    if (AbstractC0583w0.Z(textView5)) {
                        AbstractC0583w0.g0(textView5);
                    } else {
                        if (i5 == 20) {
                            return false;
                        }
                        if (AbstractC0583w0.Z(textView4)) {
                            textView3 = textView4;
                        }
                        if (AbstractC0583w0.Z(textView3)) {
                            return false;
                        }
                        AbstractC0583w0.g0(textView3);
                    }
                } else {
                    if (i5 == 20) {
                        return false;
                    }
                    if (AbstractC0583w0.Z(textView4)) {
                        textView3 = textView4;
                    }
                    if (AbstractC0583w0.Z(textView3)) {
                        return false;
                    }
                    AbstractC0583w0.g0(textView3);
                }
                return true;
            }
        });
        alertDialogCreate2.show();
        AbstractC0583w0.l0(alertDialogCreate2, 0.0f);
        return alertDialogCreate2;
    }

    public static void m(Context context, C0590x2 c0590x2, LinearLayout linearLayout, final AlertDialog alertDialog) {
        int iB;
        C0595y2 c0595y2;
        int iQ;
        linearLayout.removeAllViews();
        int i = 0;
        int i2 = 0;
        int length = 0;
        int i3 = 0;
        for (C0585w2 c0585w2 : c0590x2.a) {
            if (c0585w2 != null) {
                int i4 = c0585w2.a;
                if (i4 == 1) {
                    i++;
                } else if (i4 == 0) {
                    i3++;
                    String str = c0585w2.b;
                    length += str == null ? 0 : str.length();
                } else if (i4 == 2) {
                    i2++;
                }
            }
        }
        int iMax = Math.max(AbstractC0583w0.Q(128, context), n(context) - AbstractC0583w0.Q(28, context));
        if (i <= 0) {
            c0595y2 = new C0595y2(0, 0, 0);
        } else {
            int iQ2 = (AbstractC0583w0.Q(14, context) * i2) + (AbstractC0583w0.Q(10, context) * Math.max(0, i - 1));
            if (length > 0) {
                if (length <= 0) {
                    iQ = 0;
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float fMax = displayMetrics.widthPixels / Math.max(1.0f, displayMetrics.density);
                    int i5 = fMax >= 600.0f ? 42 : fMax >= 420.0f ? 34 : 26;
                    iQ = (AbstractC0583w0.Q(8, context) * i3) + (AbstractC0583w0.Q(22, context) * (Math.max(0, i3 - 1) + Math.max(1, ((length + i5) - 1) / i5)));
                }
                int i6 = (int) (iMax * (i == 1 ? 0.48f : 0.4f));
                int iQ3 = AbstractC0583w0.Q(i3 > 1 ? 72 : 52, context);
                iB = b(iQ, iQ3, Math.max(iQ3, Math.max(AbstractC0583w0.Q(52, context), i6)));
            } else {
                iB = 0;
            }
            boolean z = length == 0 && i2 == 0;
            int i7 = z ? iMax - iQ2 : (iMax - iB) - iQ2;
            int iQ4 = AbstractC0583w0.Q(i >= 3 ? 88 : z ? 116 : 104, context);
            if (!z) {
                iMax = (int) (iMax * (length > 320 ? 0.46f : 0.66f));
            }
            int iB2 = b(i7 / Math.max(1, i), iQ4, Math.max(iQ4, Math.max(iQ4, iMax)));
            c0595y2 = new C0595y2(Math.min(iB2, AbstractC0583w0.Q(z ? 120 : 96, context)), iB2, iB2);
        }
        ArrayList arrayList = c0590x2.a;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            C0585w2 c0585w3 = (C0585w2) arrayList.get(i8);
            int i9 = c0585w3.a;
            if (i9 == 1) {
                if (!TextUtils.isEmpty(c0585w3.c)) {
                    boolean zH0 = AbstractC0583w0.h0(context);
                    final ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView.setAdjustViewBounds(false);
                    imageView.setBackground(d(context, false));
                    imageView.setFocusable(zH0);
                    imageView.setFocusableInTouchMode(zH0);
                    imageView.setClickable(true);
                    if (zH0) {
                        imageView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0501f2(imageView, context, 0));
                    }
                    imageView.setVisibility(8);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, c0595y2.c);
                    layoutParams.setMargins(0, 0, 0, AbstractC0583w0.Q(10, context));
                    linearLayout.addView(imageView, layoutParams);
                    final String str2 = c0585w3.c;
                    final String str3 = c0585w3.d;
                    final int i10 = c0595y2.a;
                    final int i11 = c0595y2.b;
                    InitOrigin.execute(new Runnable() { // from class: com.github.catvod.spider.merge.z.i2
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str4 = str2;
                            String str5 = str3;
                            Bitmap bitmapDecodeByteArray = null;
                            try {
                                byte[] bArrH = C2.h(str4);
                                if (bArrH != null && bArrH.length != 0 && (TextUtils.isEmpty(str5) || str5.equalsIgnoreCase(C2.p(bArrH)))) {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    int i12 = 1;
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeByteArray(bArrH, 0, bArrH.length, options);
                                    int i13 = options.outWidth;
                                    int i14 = options.outHeight;
                                    if (i13 > 0 && i14 > 0) {
                                        while (true) {
                                            if (i13 / i12 <= 1400 && i14 / i12 <= 1400) {
                                                break;
                                            }
                                            i12 *= 2;
                                        }
                                        while (((long) (i13 / i12)) * ((long) (i14 / i12)) > 8000000) {
                                            i12 *= 2;
                                        }
                                    }
                                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                                    options2.inSampleSize = i12;
                                    options2.inPreferredConfig = Bitmap.Config.RGB_565;
                                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrH, 0, bArrH.length, options2);
                                }
                            } catch (OutOfMemoryError unused) {
                                System.gc();
                            } catch (Throwable unused2) {
                            }
                            final Bitmap bitmap = bitmapDecodeByteArray;
                            Handler handler = C2.a;
                            final AlertDialog alertDialog2 = alertDialog;
                            final ImageView imageView2 = imageView;
                            final int i15 = i10;
                            final int i16 = i11;
                            handler.post(new Runnable() { // from class: com.github.catvod.spider.merge.z.j2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Bitmap bitmap2 = bitmap;
                                    if (bitmap2 != null) {
                                        AlertDialog alertDialog3 = alertDialog2;
                                        if (alertDialog3.isShowing()) {
                                            ImageView imageView3 = imageView2;
                                            imageView3.animate().cancel();
                                            imageView3.setScaleX(0.985f);
                                            imageView3.setScaleY(0.985f);
                                            imageView3.setImageBitmap(bitmap2);
                                            if (bitmap2.getWidth() > 0 && bitmap2.getHeight() > 0) {
                                                imageView3.post(new RunnableC0479b0(imageView3, bitmap2, i15, i16));
                                            }
                                            imageView3.setOnClickListener(new B(bitmap2, alertDialog3, 4));
                                            imageView3.setOnKeyListener(new ViewOnKeyListenerC0511h2(1));
                                            imageView3.setVisibility(0);
                                            imageView3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(220L).setInterpolator(new DecelerateInterpolator(1.8f)).start();
                                        }
                                    }
                                }
                            });
                        }
                    });
                }
            } else if (i9 == 2) {
                View view = new View(context);
                view.setBackgroundColor(AbstractC0583w0.j);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, Math.max(1, AbstractC0583w0.Q(1, context)));
                layoutParams2.setMargins(AbstractC0583w0.Q(8, context), AbstractC0583w0.Q(4, context), AbstractC0583w0.Q(8, context), AbstractC0583w0.Q(12, context));
                linearLayout.addView(view, layoutParams2);
            } else {
                String str4 = c0585w3.b;
                if (!TextUtils.isEmpty(str4)) {
                    TextView textView = new TextView(context);
                    textView.setText(str4);
                    textView.setTextSize(14.0f);
                    textView.setTextColor(AbstractC0583w0.g);
                    textView.setLineSpacing(AbstractC0583w0.Q(4, context), 1.0f);
                    textView.setGravity(8388611);
                    textView.post(new z(textView, 1));
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.setMargins(0, 0, 0, AbstractC0583w0.Q(10, context));
                    linearLayout.addView(textView, layoutParams3);
                }
            }
        }
    }

    public static int n(Context context) {
        int i = context.getResources().getDisplayMetrics().heightPixels;
        int iQ = AbstractC0583w0.Q(180, context);
        float f = i;
        return b((int) (f * 0.36f), iQ, Math.max(iQ, (int) (0.46f * f)));
    }

    public static void o(TextView textView, boolean z, boolean z2) {
        textView.setVisibility(z ? 0 : 8);
        textView.setEnabled(z2);
        textView.setFocusable(z && z2);
        textView.setFocusableInTouchMode(false);
        textView.setAlpha(z2 ? 1.0f : 0.45f);
    }

    public static String p(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        char[] cArr = new char[bArrDigest.length * 2];
        char[] charArray = "0123456789abcdef".toCharArray();
        for (int i = 0; i < bArrDigest.length; i++) {
            byte b2 = bArrDigest[i];
            int i2 = i * 2;
            cArr[i2] = charArray[(b2 & 255) >>> 4];
            cArr[i2 + 1] = charArray[b2 & 15];
        }
        return new String(cArr);
    }

    public static void q(Context context, TextView textView, boolean z) {
        textView.setTextSize(13.0f);
        int iQ = AbstractC0583w0.Q(z ? 22 : 16, context);
        textView.setPadding(iQ, AbstractC0583w0.Q(10, context), iQ, AbstractC0583w0.Q(10, context));
        textView.setMinHeight(AbstractC0583w0.Q(40, context));
        textView.setMinWidth(AbstractC0583w0.Q(z ? 126 : 82, context));
    }
}

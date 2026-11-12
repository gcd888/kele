package com.github.catvod.spider.merge.A;

import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.ProxyOrigin;
import com.github.catvod.spider.Wallpaper;
import com.github.catvod.spider.merge.p000a.C0359j;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.B2;
import com.github.catvod.spider.merge.p022z.C0477a3;
import com.github.catvod.spider.merge.p022z.C0559r1;
import com.github.catvod.spider.merge.p022z.C0586w3;
import com.github.catvod.spider.merge.p022z.C2;
import com.github.catvod.spider.merge.p022z.InterfaceC0545o1;
import com.github.catvod.spider.merge.p022z.K3;
import com.github.catvod.spider.merge.p022z.M3;
import com.github.catvod.spider.merge.p022z.O2;
import com.github.catvod.spider.merge.p022z.RunnableC0543o;
import com.github.catvod.spider.merge.p022z.ViewOnClickListenerC0531l2;
import com.github.catvod.spider.merge.p022z.h4;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class B implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ B(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int iRound;
        int i2;
        View childAt;
        View childAt2;
        int i3 = 4;
        final int i4 = 0;
        int i5 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                InputMethodManager inputMethodManager = (InputMethodManager) ((C0252e0) obj).a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput((EditText) obj2, 1);
                    return;
                }
                return;
            case 1:
                com.github.catvod.spider.merge.p022z.P1.V0((String) obj, (String) obj2);
                return;
            case 2:
                ((InterfaceC0545o1) ((C0559r1) obj).a).testConnection((JSONObject) obj2, new C0359j(22));
                return;
            case 3:
                int[] iArr = (int[]) obj;
                int i6 = iArr[0];
                if (i6 <= 0) {
                    return;
                }
                iArr[0] = i6 - 1;
                ((Runnable) obj2).run();
                return;
            case 4:
                final Context context = view.getContext();
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    final AlertDialog alertDialog = (AlertDialog) obj2;
                    if (alertDialog.isShowing()) {
                        Dialog dialog = (Dialog) C2.b.remove(alertDialog);
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        final boolean zH0 = AbstractC0583w0.h0(context);
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.setBackgroundColor(0);
                        frameLayout.setClipChildren(false);
                        frameLayout.setClipToPadding(false);
                        final FrameLayout frameLayout2 = new FrameLayout(context);
                        frameLayout2.setClipChildren(true);
                        frameLayout2.setClipToPadding(true);
                        frameLayout2.setAlpha(0.0f);
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        int iQ = AbstractC0583w0.Q(180, context);
                        int iQ2 = AbstractC0583w0.Q(zH0 ? 64 : 20, context);
                        int iQ3 = AbstractC0583w0.Q(zH0 ? 54 : 70, context);
                        int iMax = Math.max(iQ, displayMetrics.widthPixels - (iQ2 * 2));
                        int iMax2 = Math.max(iQ, displayMetrics.heightPixels - (iQ3 * 2));
                        int iMin = Math.min(iMax, (int) (displayMetrics.widthPixels * (zH0 ? 0.78f : 0.84f)));
                        int iMin2 = Math.min(iMax2, (int) (displayMetrics.heightPixels * (zH0 ? 0.72f : 0.68f)));
                        float width = (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) ? 1.0f : bitmap.getWidth() / bitmap.getHeight();
                        int iRound2 = Math.round(iMin / width);
                        if (iRound2 > iMin2) {
                            iRound = Math.round(iMin2 * width);
                            i = iMin2;
                        } else {
                            i = iRound2;
                            iRound = iMin;
                        }
                        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(C2.b(iRound, iQ, iMin), C2.b(i, iQ, iMin2), 17));
                        final B2 b2 = new B2(context);
                        b2.d = bitmap;
                        b2.setImageBitmap(bitmap);
                        b2.e = 1.0f;
                        b2.f = 0.0f;
                        b2.g = 0.0f;
                        b2.post(new RunnableC0341a(14, b2));
                        b2.setPadding(AbstractC0583w0.Q(6, context), AbstractC0583w0.Q(6, context), AbstractC0583w0.Q(6, context), AbstractC0583w0.Q(6, context));
                        b2.setFocusable(zH0);
                        b2.setFocusableInTouchMode(zH0);
                        b2.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.k2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i4) {
                                    case 0:
                                        b2.e(1.25f);
                                        break;
                                    case 1:
                                        b2.e(0.8f);
                                        break;
                                    case 2:
                                        B2 b3 = b2;
                                        b3.e = 1.0f;
                                        b3.f = 0.0f;
                                        b3.g = 0.0f;
                                        b3.a();
                                        break;
                                    default:
                                        b2.e(1.25f);
                                        break;
                                }
                            }
                        });
                        frameLayout2.addView(b2, new FrameLayout.LayoutParams(-1, -1));
                        final LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setGravity(17);
                        linearLayout.setPadding(AbstractC0583w0.Q(5, context), AbstractC0583w0.Q(5, context), AbstractC0583w0.Q(5, context), AbstractC0583w0.Q(5, context));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setColor(1711276032);
                        gradientDrawable.setCornerRadius(AbstractC0583w0.Q(22, context));
                        gradientDrawable.setStroke(AbstractC0583w0.Q(1, context), 1442840575);
                        linearLayout.setBackground(gradientDrawable);
                        if (Build.VERSION.SDK_INT >= 21) {
                            linearLayout.setElevation(AbstractC0583w0.Q(10, context));
                        }
                        final TextView textViewF = C2.f(context, "-", zH0);
                        final TextView textViewF2 = C2.f(context, "重置", zH0);
                        final TextView textViewF3 = C2.f(context, "+", zH0);
                        final TextView textViewF4 = C2.f(context, "关闭", zH0);
                        C2.j(textViewF);
                        C2.j(textViewF2);
                        C2.j(textViewF3);
                        C2.j(textViewF4);
                        linearLayout.addView(textViewF, C2.k(context, false, zH0));
                        linearLayout.addView(textViewF2, C2.k(context, true, zH0));
                        linearLayout.addView(textViewF3, C2.k(context, false, zH0));
                        linearLayout.addView(textViewF4, C2.k(context, true, zH0));
                        if (zH0) {
                            C2.i(textViewF);
                            C2.i(textViewF2);
                            C2.i(textViewF3);
                            C2.i(textViewF4);
                            C2.i(b2);
                            textViewF.setNextFocusLeftId(textViewF4.getId());
                            textViewF.setNextFocusRightId(textViewF2.getId());
                            textViewF2.setNextFocusLeftId(textViewF.getId());
                            textViewF2.setNextFocusRightId(textViewF3.getId());
                            textViewF3.setNextFocusLeftId(textViewF2.getId());
                            textViewF3.setNextFocusRightId(textViewF4.getId());
                            textViewF4.setNextFocusLeftId(textViewF3.getId());
                            textViewF4.setNextFocusRightId(textViewF.getId());
                            textViewF.setNextFocusUpId(b2.getId());
                            textViewF2.setNextFocusUpId(b2.getId());
                            textViewF3.setNextFocusUpId(b2.getId());
                            textViewF4.setNextFocusUpId(b2.getId());
                            textViewF.setNextFocusDownId(textViewF4.getId());
                            textViewF2.setNextFocusDownId(textViewF4.getId());
                            textViewF3.setNextFocusDownId(textViewF4.getId());
                            textViewF4.setNextFocusDownId(textViewF4.getId());
                            b2.setNextFocusLeftId(textViewF4.getId());
                            b2.setNextFocusRightId(textViewF4.getId());
                            b2.setNextFocusUpId(textViewF4.getId());
                            b2.setNextFocusDownId(textViewF4.getId());
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 81);
                        layoutParams.setMargins(AbstractC0583w0.Q(10, context), 0, AbstractC0583w0.Q(10, context), AbstractC0583w0.Q(10, context));
                        frameLayout2.addView(linearLayout, layoutParams);
                        final float[] fArr = new float[2];
                        final int[] iArr2 = new int[2];
                        final boolean[] zArr = {false};
                        final int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                        linearLayout.setClickable(true);
                        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.github.catvod.spider.merge.z.p2
                            /* JADX WARN: Code duplicated, block: B:18:0x0074  */
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                LinearLayout linearLayout2 = linearLayout;
                                if (!(linearLayout2.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                                    return false;
                                }
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout2.getLayoutParams();
                                int action = motionEvent.getAction();
                                float[] fArr2 = fArr;
                                int[] iArr3 = iArr2;
                                boolean[] zArr2 = zArr;
                                if (action == 0) {
                                    fArr2[0] = motionEvent.getRawX();
                                    fArr2[1] = motionEvent.getRawY();
                                    iArr3[0] = linearLayout2.getLeft();
                                    iArr3[1] = linearLayout2.getTop();
                                    zArr2[0] = false;
                                    linearLayout2.getParent().requestDisallowInterceptTouchEvent(true);
                                } else if (motionEvent.getAction() == 2) {
                                    int iRound3 = Math.round(motionEvent.getRawX() - fArr2[0]);
                                    int iRound4 = Math.round(motionEvent.getRawY() - fArr2[1]);
                                    if (zArr2[0]) {
                                        zArr2[0] = true;
                                        layoutParams2.gravity = 51;
                                        int i7 = iArr3[0] + iRound3;
                                        Context context2 = context;
                                        int iQ4 = AbstractC0583w0.Q(6, context2);
                                        int iQ5 = AbstractC0583w0.Q(6, context2);
                                        FrameLayout frameLayout3 = frameLayout2;
                                        layoutParams2.leftMargin = C2.b(i7, iQ4, Math.max(iQ5, (frameLayout3.getWidth() - linearLayout2.getWidth()) - AbstractC0583w0.Q(6, context2)));
                                        layoutParams2.topMargin = C2.b(iArr3[1] + iRound4, AbstractC0583w0.Q(6, context2), Math.max(AbstractC0583w0.Q(6, context2), (frameLayout3.getHeight() - linearLayout2.getHeight()) - AbstractC0583w0.Q(6, context2)));
                                        layoutParams2.rightMargin = 0;
                                        layoutParams2.bottomMargin = 0;
                                        linearLayout2.setLayoutParams(layoutParams2);
                                    } else {
                                        int iAbs = Math.abs(iRound3);
                                        int i8 = scaledTouchSlop;
                                        if (iAbs >= i8 || Math.abs(iRound4) >= i8) {
                                            zArr2[0] = true;
                                            layoutParams2.gravity = 51;
                                            int i9 = iArr3[0] + iRound3;
                                            Context context3 = context;
                                            int iQ6 = AbstractC0583w0.Q(6, context3);
                                            int iQ7 = AbstractC0583w0.Q(6, context3);
                                            FrameLayout frameLayout4 = frameLayout2;
                                            layoutParams2.leftMargin = C2.b(i9, iQ6, Math.max(iQ7, (frameLayout4.getWidth() - linearLayout2.getWidth()) - AbstractC0583w0.Q(6, context3)));
                                            layoutParams2.topMargin = C2.b(iArr3[1] + iRound4, AbstractC0583w0.Q(6, context3), Math.max(AbstractC0583w0.Q(6, context3), (frameLayout4.getHeight() - linearLayout2.getHeight()) - AbstractC0583w0.Q(6, context3)));
                                            layoutParams2.rightMargin = 0;
                                            layoutParams2.bottomMargin = 0;
                                            linearLayout2.setLayoutParams(layoutParams2);
                                        }
                                    }
                                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                                    linearLayout2.getParent().requestDisallowInterceptTouchEvent(false);
                                    boolean z = zArr2[0];
                                    zArr2[0] = false;
                                    if (!z && view2 != linearLayout2) {
                                        view2.performClick();
                                    }
                                }
                                return true;
                            }
                        };
                        linearLayout.setOnTouchListener(onTouchListener);
                        for (int i7 = 0; i7 < linearLayout.getChildCount(); i7++) {
                            linearLayout.getChildAt(i7).setOnTouchListener(onTouchListener);
                        }
                        final int i8 = 1;
                        final Dialog dialog2 = new Dialog(context);
                        dialog2.requestWindowFeature(1);
                        dialog2.setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                        C2.c(dialog2);
                        dialog2.setCancelable(true);
                        dialog2.setCanceledOnTouchOutside(true);
                        textViewF.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.k2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i8) {
                                    case 0:
                                        b2.e(1.25f);
                                        break;
                                    case 1:
                                        b2.e(0.8f);
                                        break;
                                    case 2:
                                        B2 b3 = b2;
                                        b3.e = 1.0f;
                                        b3.f = 0.0f;
                                        b3.g = 0.0f;
                                        b3.a();
                                        break;
                                    default:
                                        b2.e(1.25f);
                                        break;
                                }
                            }
                        });
                        final int i9 = 2;
                        textViewF2.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.k2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i9) {
                                    case 0:
                                        b2.e(1.25f);
                                        break;
                                    case 1:
                                        b2.e(0.8f);
                                        break;
                                    case 2:
                                        B2 b3 = b2;
                                        b3.e = 1.0f;
                                        b3.f = 0.0f;
                                        b3.g = 0.0f;
                                        b3.a();
                                        break;
                                    default:
                                        b2.e(1.25f);
                                        break;
                                }
                            }
                        });
                        final int i10 = 3;
                        textViewF3.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.k2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i10) {
                                    case 0:
                                        b2.e(1.25f);
                                        break;
                                    case 1:
                                        b2.e(0.8f);
                                        break;
                                    case 2:
                                        B2 b3 = b2;
                                        b3.e = 1.0f;
                                        b3.f = 0.0f;
                                        b3.g = 0.0f;
                                        b3.a();
                                        break;
                                    default:
                                        b2.e(1.25f);
                                        break;
                                }
                            }
                        });
                        textViewF4.setOnClickListener(new ViewOnClickListenerC0531l2(dialog2, 0));
                        dialog2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.github.catvod.spider.merge.z.m2
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                final FrameLayout frameLayout3;
                                C2.c(dialog2);
                                int i11 = AbstractC0583w0.a;
                                Context context2 = context;
                                if (context2 != null && (frameLayout3 = frameLayout2) != null) {
                                    frameLayout3.setAlpha(0.0f);
                                    final float fQ = AbstractC0583w0.Q(12, context2);
                                    frameLayout3.post(new Runnable() { // from class: com.github.catvod.spider.merge.z.j0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            View view2 = frameLayout3;
                                            float f = fQ;
                                            try {
                                                view2.setScaleX(0.96f);
                                                view2.setScaleY(0.96f);
                                                view2.setTranslationY(f);
                                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                                valueAnimatorOfFloat.setDuration(220L);
                                                valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
                                                valueAnimatorOfFloat.addUpdateListener(new C0504g0((FrameLayout) view2, f, 1));
                                                valueAnimatorOfFloat.addListener(new C0539n0(1, (FrameLayout) view2));
                                                valueAnimatorOfFloat.start();
                                            } catch (Exception unused) {
                                                view2.setAlpha(1.0f);
                                                view2.setScaleX(1.0f);
                                                view2.setScaleY(1.0f);
                                                view2.setTranslationY(0.0f);
                                            }
                                        }
                                    });
                                }
                                if (zH0) {
                                    AbstractC0583w0.g0(textViewF4);
                                }
                            }
                        });
                        dialog2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.github.catvod.spider.merge.z.n2
                            /* JADX WARN: Code duplicated, block: B:51:0x00ac A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
                            /* JADX WARN: Code duplicated, block: B:53:0x00b2 A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
                            /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
                            /* JADX WARN: Code duplicated, block: B:57:0x00bc A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:58:0x00be A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
                            /* JADX WARN: Code duplicated, block: B:60:0x00c2  */
                            /* JADX WARN: Code duplicated, block: B:62:0x00c5 A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
                            /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
                            /* JADX WARN: Code duplicated, block: B:66:0x00ce A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:67:0x00d0 A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
                            /* JADX WARN: Code duplicated, block: B:69:0x00d4 A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:70:0x00d6  */
                            /* JADX WARN: Code duplicated, block: B:71:0x00d8 A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:72:0x00da  */
                            /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
                            /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
                            /* JADX WARN: Code duplicated, block: B:89:0x0108  */
                            @Override // android.content.DialogInterface.OnKeyListener
                            public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                                TextView textView;
                                boolean z;
                                boolean zD;
                                int i12 = AbstractC0583w0.a;
                                if (!(keyEvent != null && keyEvent.getAction() == 0)) {
                                    return false;
                                }
                                boolean z2 = zH0;
                                B2 b3 = b2;
                                if (z2) {
                                    TextView textView2 = textViewF;
                                    boolean zHasFocus = textView2.hasFocus();
                                    TextView textView3 = textViewF2;
                                    TextView textView4 = textViewF3;
                                    TextView textView5 = textViewF4;
                                    if (zHasFocus) {
                                        textView = textView2;
                                    } else if (textView3.hasFocus()) {
                                        textView = textView3;
                                    } else if (textView4.hasFocus()) {
                                        textView = textView4;
                                    } else {
                                        textView = textView5.hasFocus() ? textView5 : null;
                                    }
                                    if (!AbstractC0583w0.W(i11) || textView == null) {
                                        if (b3.hasFocus()) {
                                            if (AbstractC0583w0.W(i11)) {
                                                b3.e(1.25f);
                                            } else if (i11 == 21 || i11 == 22 || i11 == 19 || i11 == 20) {
                                                int iMax3 = Math.max(24, AbstractC0583w0.Q(44, b3.getContext()));
                                                if (i11 == 21) {
                                                    zD = b3.d(iMax3, 0.0f);
                                                } else if (i11 == 22) {
                                                    zD = b3.d(-iMax3, 0.0f);
                                                } else if (i11 == 19) {
                                                    zD = b3.d(0.0f, iMax3);
                                                } else {
                                                    zD = i11 == 20 ? b3.d(0.0f, -iMax3) : false;
                                                }
                                                if (!zD) {
                                                    AbstractC0583w0.g0(textView5);
                                                }
                                            } else if (i11 == 19) {
                                                AbstractC0583w0.g0(b3);
                                            } else if (i11 == 20) {
                                                AbstractC0583w0.g0(textView5);
                                            } else {
                                                if (textView != null) {
                                                    if (i11 == 21) {
                                                        if (textView == textView2) {
                                                            textView2 = textView5;
                                                        } else if (textView != textView3) {
                                                            if (textView == textView4) {
                                                                textView2 = textView3;
                                                            } else {
                                                                textView2 = textView4;
                                                            }
                                                        }
                                                        AbstractC0583w0.g0(textView2);
                                                    } else if (i11 == 22) {
                                                        if (textView == textView2) {
                                                            textView2 = textView3;
                                                        } else if (textView == textView3) {
                                                            textView2 = textView4;
                                                        } else if (textView == textView4) {
                                                            textView2 = textView5;
                                                        }
                                                        AbstractC0583w0.g0(textView2);
                                                    }
                                                }
                                                z = false;
                                            }
                                        } else if (i11 == 19) {
                                            AbstractC0583w0.g0(b3);
                                        } else if (i11 == 20) {
                                            AbstractC0583w0.g0(textView5);
                                        } else {
                                            if (textView != null) {
                                                if (i11 == 21) {
                                                    if (textView == textView2) {
                                                        textView2 = textView5;
                                                    } else if (textView != textView3) {
                                                        if (textView == textView4) {
                                                            textView2 = textView3;
                                                        } else {
                                                            textView2 = textView4;
                                                        }
                                                    }
                                                    AbstractC0583w0.g0(textView2);
                                                } else if (i11 == 22) {
                                                    if (textView == textView2) {
                                                        textView2 = textView3;
                                                    } else if (textView == textView3) {
                                                        textView2 = textView4;
                                                    } else if (textView == textView4) {
                                                        textView2 = textView5;
                                                    }
                                                    AbstractC0583w0.g0(textView2);
                                                }
                                            }
                                            z = false;
                                        }
                                        if (!z) {
                                            if (i11 != 81 || i11 == 70) {
                                                b3.e(1.25f);
                                            } else if (i11 == 69) {
                                                b3.e(0.8f);
                                            } else {
                                                if (!AbstractC0583w0.W(i11) || !b3.hasFocus()) {
                                                    return false;
                                                }
                                                b3.e(1.25f);
                                            }
                                        }
                                    } else {
                                        textView.performClick();
                                    }
                                    z = true;
                                    if (!z) {
                                        if (i11 != 81) {
                                            b3.e(1.25f);
                                        } else {
                                            b3.e(1.25f);
                                        }
                                    }
                                } else if (i11 != 81) {
                                    b3.e(1.25f);
                                } else {
                                    b3.e(1.25f);
                                }
                                return true;
                            }
                        });
                        dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.z.o2
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                WeakHashMap weakHashMap = C2.b;
                                AlertDialog alertDialog2 = alertDialog;
                                if (weakHashMap.get(alertDialog2) == dialog2) {
                                    weakHashMap.remove(alertDialog2);
                                }
                            }
                        });
                        WeakHashMap weakHashMap = C2.b;
                        weakHashMap.put(alertDialog, dialog2);
                        try {
                            dialog2.show();
                            return;
                        } catch (RuntimeException e) {
                            weakHashMap.remove(alertDialog);
                            throw e;
                        }
                    }
                    return;
                }
                return;
            case 5:
                AlertDialog alertDialog2 = ((AlertDialog[]) obj)[0];
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                Runnable runnable = ((C0477a3) obj2).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                C0586w3 c0586w3 = (C0586w3) obj;
                c0586w3.getClass();
                int port = ProxyOrigin.getPort();
                if (port <= 0 || port > 65535) {
                    X0.a("本地代理准备中，请稍后重试");
                    return;
                }
                InitOrigin.execute(new RunnableC0543o((String) obj2, "用手机拖动滑块后确认", "http://" + com.github.catvod.spider.merge.p022z.P1.f0() + ":" + port + "/proxy?do=config&action=slider&sid=" + c0586w3.b, AbstractC0583w0.c, c0586w3.j, new com.github.catvod.spider.merge.p019w.b(i5, c0586w3), 6));
                return;
            case 7:
                String strH = ((K3) obj).h();
                String strTrim = strH == null ? "" : strH.trim();
                String strH2 = ((K3) obj2).h();
                String strTrim2 = strH2 != null ? strH2.trim() : "";
                if (strTrim.isEmpty() || strTrim2.isEmpty()) {
                    X0.a("请先填写 TMDB Token 和 API BaseURL");
                    return;
                } else {
                    X0.a("正在测试 TMDB 连接...");
                    InitOrigin.execute(new O2(strTrim, i3, strTrim2));
                    return;
                }
            case 8:
                Wallpaper.removeFavorite((String) obj);
                LinearLayout linearLayout2 = (LinearLayout) obj2;
                if (linearLayout2 != null && (linearLayout2.getParent() instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) linearLayout2.getParent();
                    int iIndexOfChild = viewGroup.indexOfChild(linearLayout2);
                    viewGroup.removeView(linearLayout2);
                    if (iIndexOfChild < viewGroup.getChildCount() && (childAt2 = viewGroup.getChildAt(iIndexOfChild)) != null && "divider".equals(childAt2.getTag())) {
                        viewGroup.removeViewAt(iIndexOfChild);
                    } else if (iIndexOfChild > 0 && (i2 = iIndexOfChild - 1) < viewGroup.getChildCount() && (childAt = viewGroup.getChildAt(i2)) != null && "divider".equals(childAt.getTag())) {
                        viewGroup.removeViewAt(i2);
                    }
                } else if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                X0.a("已删除");
                return;
            case 9:
                String[] strArr = (String[]) obj;
                String str = strArr[0];
                LinearLayout linearLayout3 = (LinearLayout) obj2;
                if (Wallpaper.isFavorited(str)) {
                    Wallpaper.removeFavorite(str);
                    h4.k(5, linearLayout3, "收藏");
                    X0.a("已取消收藏");
                    return;
                } else {
                    Wallpaper.saveFavorite(str, strArr[1], strArr[2], strArr[3], strArr[4]);
                    h4.k(6, linearLayout3, "已收藏");
                    X0.a("已加入收藏");
                    return;
                }
            default:
                h4.j((Application) ((Context) obj), "保存图片", "图片将保存到手机相册的 Pictures 目录\n保存后可在相册应用中查看、编辑或分享", "保存到相册", new M3((String[]) obj2, i5));
                return;
        }
    }
}

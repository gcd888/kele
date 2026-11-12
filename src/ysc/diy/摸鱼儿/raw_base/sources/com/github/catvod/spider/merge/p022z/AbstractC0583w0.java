package com.github.catvod.spider.merge.p022z;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.spider.merge.A.ViewOnFocusChangeListenerC0310y;
import com.github.catvod.spider.merge.A.ViewOnKeyListenerC0307x;
import com.github.catvod.spider.merge.S.a;
import com.github.catvod.spider.merge.p017u.L;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0583w0 {
    public static final int a = Color.parseColor("#F5F5F5");
    public static final int b = Color.parseColor("#FFFFFF");
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int[] s;

    static {
        int color = Color.parseColor("#2196F3");
        c = color;
        int color2 = Color.parseColor("#4CAF50");
        d = color2;
        int color3 = Color.parseColor("#F44336");
        e = color3;
        int color4 = Color.parseColor("#FF9800");
        f = color4;
        g = Color.parseColor("#333333");
        int color5 = Color.parseColor("#666666");
        h = color5;
        i = Color.parseColor("#999999");
        j = Color.parseColor("#EEEEEE");
        int color6 = Color.parseColor("#E3F2FD");
        k = color6;
        l = Color.parseColor("#BBBBBB");
        m = color6;
        n = Color.parseColor("#1976D2");
        o = color;
        p = color;
        q = color5;
        r = color4;
        s = new int[]{color2, color, -16728876, color4, color3};
    }

    public static TextView A(Activity activity, String str, int i2) {
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(10.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(Q(6, activity), Q(2, activity), Q(6, activity), Q(2, activity));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(Q(4, activity));
        gradientDrawable.setColor(i2);
        textView.setBackground(gradientDrawable);
        return textView;
    }

    public static ColorStateList B(int i2) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{R.attr.state_pressed}, new int[]{R.attr.state_focused}, new int[0]}, new int[]{i, -1, o, i2});
    }

    public static View C(Context context) {
        View view = new View(context);
        view.setBackgroundColor(j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, Q(1, context));
        layoutParams.setMargins(0, Q(4, context), 0, Q(4, context));
        view.setLayoutParams(layoutParams);
        return view;
    }

    public static TextView D(Activity activity, String str) {
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setTextColor(i);
        textView.setGravity(17);
        textView.setPadding(0, Q(40, activity), 0, Q(40, activity));
        return textView;
    }

    public static LinearLayout E(ContextWrapper contextWrapper, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, String str) {
        LinearLayout linearLayoutY = y(contextWrapper);
        linearLayoutY.setDescendantFocusability(262144);
        int length = strArr.length;
        boolean[] zArr = new boolean[length];
        View[] viewArr = new View[length];
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= length) {
                break;
            }
            if (i2 != iArr2[0]) {
                z = false;
            }
            zArr[i2] = z;
            i2++;
        }
        LinearLayout linearLayout = new LinearLayout(contextWrapper);
        linearLayout.setOrientation(1);
        linearLayout.setDescendantFocusability(262144);
        int i3 = 0;
        while (i3 < length) {
            View[] viewArr2 = viewArr;
            boolean[] zArr2 = zArr;
            m(linearLayout, strArr[i3], strArr2[i3], iArr[i3], zArr[i3], i3, i3 > 0, viewArr2, zArr2, new a(iArr2, i3, length, zArr, viewArr));
            i3++;
            linearLayout = linearLayout;
            viewArr = viewArr2;
            zArr = zArr2;
        }
        linearLayoutY.addView(linearLayout);
        if (str != null && !str.isEmpty()) {
            l(linearLayoutY, str);
        }
        return linearLayoutY;
    }

    public static TextView F(Context context, String str, int i2, int i3) {
        boolean zH0 = h0(context);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setTextColor(zH0 ? B(i3) : ColorStateList.valueOf(i3));
        textView.setGravity(17);
        textView.setPadding(Q(28, context), Q(10, context), Q(28, context), Q(10, context));
        textView.setFocusable(zH0);
        textView.setFocusableInTouchMode(zH0);
        textView.setClickable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(Q(8, context));
        gradientDrawable.setColor(i2);
        if (!zH0) {
            textView.setBackground(gradientDrawable);
            return textView;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(Q(8, context));
        gradientDrawable2.setColor(m);
        int iQ = Q(1, context);
        int i4 = o;
        gradientDrawable2.setStroke(iQ, i4);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(Q(8, context));
        gradientDrawable3.setColor(n);
        gradientDrawable3.setStroke(Q(2, context), i4);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable3);
        stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        textView.setBackground(stateListDrawable);
        return textView;
    }

    public static StateListDrawable G(Context context, int i2, int i3, int i4, int i5, int i6) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(Q(i4, context));
        gradientDrawable.setColor(i2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(Q(i4, context));
        gradientDrawable2.setColor(i3);
        gradientDrawable2.setStroke(Q(i5, context), i6);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public static LinearLayout H(ContextWrapper contextWrapper, String str, String str2, int i2) {
        LinearLayout linearLayout = new LinearLayout(contextWrapper);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(Q(14, contextWrapper), Q(12, contextWrapper), Q(14, contextWrapper), Q(12, contextWrapper));
        linearLayout.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(Q(12, contextWrapper));
        gradientDrawable.setColor(i2);
        linearLayout.setBackground(gradientDrawable);
        TextView textView = new TextView(contextWrapper);
        textView.setText(str);
        textView.setTextSize(16.0f);
        textView.setTextColor(-1);
        textView.getPaint().setFakeBoldText(true);
        textView.setGravity(17);
        linearLayout.addView(textView);
        if (str2 != null && !str2.isEmpty()) {
            TextView textView2 = new TextView(contextWrapper);
            textView2.setText(str2);
            textView2.setTextSize(12.0f);
            textView2.setTextColor(-855638017);
            textView2.setGravity(17);
            textView2.setPadding(0, Q(4, contextWrapper), 0, 0);
            linearLayout.addView(textView2);
        }
        return linearLayout;
    }

    public static LinearLayout I(Activity activity, String str, String str2, int i2, String str3, View.OnClickListener onClickListener) {
        int iQ = Q(8, activity);
        int iQ2 = Q(12, activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(iQ2, iQ2, iQ2, iQ2);
        linearLayout.setGravity(16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iQ2);
        gradientDrawable.setColor(b);
        linearLayout.setBackground(gradientDrawable);
        View view = new View(activity);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(i2);
        view.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iQ, iQ);
        layoutParams.rightMargin = iQ2;
        view.setLayoutParams(layoutParams);
        linearLayout.addView(view);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setTextColor(g);
        textView.getPaint().setFakeBoldText(true);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setText(str2);
        textView2.setTextSize(11.0f);
        textView2.setTextColor(h);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        View viewF = F(activity, str3, i2, -1);
        viewF.setOnClickListener(onClickListener);
        linearLayout.addView(viewF);
        return linearLayout;
    }

    public static ScrollView J(Activity activity, LinearLayout linearLayout, int i2) {
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        scrollView.setFillViewport(true);
        scrollView.setFocusable(false);
        scrollView.setFocusableInTouchMode(false);
        scrollView.setDescendantFocusability(262144);
        linearLayout.setDescendantFocusability(262144);
        scrollView.addView(linearLayout);
        o(scrollView, linearLayout);
        scrollView.post(new A(scrollView, Math.min(Q(i2, activity), T(activity)), 2));
        return scrollView;
    }

    public static LinearLayout K(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(a);
        gradientDrawable.setCornerRadius(Q(16, context));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setPadding(Q(14, context), Q(12, context), Q(14, context), Q(8, context));
        return linearLayout;
    }

    public static GradientDrawable L(Context context, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(Q(i3, context));
        return gradientDrawable;
    }

    public static EditText M(Activity activity, String str) {
        EditText editText = new EditText(activity);
        editText.setHint(str);
        editText.setTextSize(14.0f);
        editText.setTextColor(g);
        editText.setHintTextColor(l);
        editText.setSingleLine(true);
        editText.setFocusable(true);
        editText.setPadding(Q(12, activity), Q(10, activity), Q(12, activity), Q(10, activity));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(Q(8, activity));
        gradientDrawable.setColor(b);
        gradientDrawable.setStroke(Q(1, activity), j);
        editText.setBackground(gradientDrawable);
        return editText;
    }

    public static TextView N(Context context, String str, int i2, int i3, int i4, int i5) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(12.0f);
        textView.setTextColor(i2);
        textView.setPadding(i4, i5, i4, i5);
        textView.setFocusable(true);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(i3);
        gradientDrawable.setColor(-1182985);
        textView.setBackground(gradientDrawable);
        textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0499f0(i3, i2, 3));
        return textView;
    }

    public static LinearLayout O(ContextWrapper contextWrapper, String str, String str2, String str3, int i2) {
        int iQ = Q(4, contextWrapper);
        int iQ2 = Q(12, contextWrapper);
        LinearLayout linearLayoutY = y(contextWrapper);
        linearLayoutY.setOrientation(0);
        linearLayoutY.setGravity(16);
        LinearLayout linearLayout = new LinearLayout(contextWrapper);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(contextWrapper);
        textView.setText(str);
        textView.setTextSize(17.0f);
        textView.setTextColor(g);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(contextWrapper);
        textView2.setText(str2);
        textView2.setTextSize(12.0f);
        textView2.setTextColor(i2);
        textView2.setPadding(0, iQ, 0, 0);
        linearLayout.addView(textView2);
        linearLayoutY.addView(linearLayout);
        TextView textView3 = new TextView(contextWrapper);
        textView3.setText(str3);
        textView3.setTextSize(11.0f);
        textView3.setTextColor(-1);
        textView3.setPadding(iQ2, iQ, iQ2, iQ);
        textView3.setBackground(L(contextWrapper, i2, 12));
        linearLayoutY.addView(textView3);
        return linearLayoutY;
    }

    public static Bitmap P(String str) {
        int i2;
        if (str != null && str.contains(",")) {
            str = str.substring(str.indexOf(",") + 1);
        }
        if (str != null && !str.isEmpty()) {
            try {
                byte[] bArrDecode = Base64.decode(str, 0);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                int i3 = options.outWidth;
                if (i3 > 0 && (i2 = options.outHeight) > 0 && Math.max(i3, i2) <= 4096) {
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = 1;
                    while (true) {
                        int iMax = Math.max(options.outWidth, options.outHeight);
                        int i4 = options.inSampleSize;
                        if (iMax / i4 <= 1024) {
                            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        }
                        options.inSampleSize = i4 * 2;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static int Q(int i2, Context context) {
        return (int) (i2 * context.getResources().getDisplayMetrics().density);
    }

    public static void R(View view) {
        if (view == null || view.getId() != -1) {
            return;
        }
        view.setId(View.generateViewId());
    }

    public static boolean S(View view) {
        boolean z = !Boolean.TRUE.equals(view.getTag());
        view.setTag(Boolean.valueOf(z));
        view.invalidate();
        return z;
    }

    public static int T(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean zY = Y(context);
        float f2 = zY ? 0.82f : 0.74f;
        int i2 = displayMetrics.heightPixels;
        return Math.max(Q(180, context), Math.min((int) (i2 * f2), i2 - Q(zY ? 96 : 120, context)));
    }

    public static int U(View view) {
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            return rect.bottom;
        }
        return Integer.MIN_VALUE;
    }

    public static void V(ArrayList arrayList) {
        if (arrayList.size() < 2) {
            return;
        }
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int i3 = i2 + 1;
            ((View) arrayList.get(i2)).setOnKeyListener(new ViewOnKeyListenerC0307x((View) arrayList.get((arrayList.size() + (i2 - 1)) % arrayList.size()), (View) arrayList.get(i3 % arrayList.size()), 4));
            i2 = i3;
        }
    }

    public static boolean W(int i2) {
        return i2 == 23 || i2 == 66;
    }

    public static boolean X(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        return !activity.isDestroyed();
    }

    public static boolean Y(Context context) {
        if (context == null) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return context.getResources().getConfiguration().orientation == 2 || displayMetrics.widthPixels > displayMetrics.heightPixels;
    }

    public static boolean Z(View view) {
        return view != null && view.getVisibility() == 0 && view.isShown() && view.isEnabled();
    }

    public static int a(int i2) {
        int[] iArr = s;
        return iArr[i2 % iArr.length];
    }

    public static boolean a0(View view) {
        return view.getVisibility() == 0 && view.isShown() && view.isFocusable() && view.getGlobalVisibleRect(new Rect());
    }

    public static void b(ArrayList arrayList, Button button) {
        if (Z(button) && button.isFocusable()) {
            R(button);
            arrayList.add(button);
        }
    }

    public static void b0(ArrayList arrayList) {
        if (arrayList.size() < 2) {
            return;
        }
        int i2 = 0;
        while (i2 < arrayList.size()) {
            View view = (View) arrayList.get(i2);
            R(view);
            View view2 = (View) arrayList.get((arrayList.size() + (i2 - 1)) % arrayList.size());
            i2++;
            View view3 = (View) arrayList.get(i2 % arrayList.size());
            R(view2);
            R(view3);
            view.setNextFocusLeftId(view2.getId());
            view.setNextFocusRightId(view3.getId());
        }
    }

    public static TextView c(int i2, LinearLayout linearLayout, String str) {
        Context context = linearLayout.getContext();
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setTextColor(i2);
        textView.getPaint().setFakeBoldText(true);
        textView.setPadding(0, 0, 0, Q(8, context));
        linearLayout.addView(textView);
        return textView;
    }

    public static LinearLayout.LayoutParams c0(int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, i2);
        return layoutParams;
    }

    public static LinearLayout d(LinearLayout linearLayout, String str, String str2, int i2, boolean z) {
        Context context = linearLayout.getContext();
        int iQ = Q(8, context);
        int iQ2 = Q(12, context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(iQ2, iQ2, iQ2, iQ2);
        linearLayout2.setGravity(16);
        linearLayout2.setFocusable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iQ);
        gradientDrawable.setColor(a);
        linearLayout2.setBackground(gradientDrawable);
        if (z) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = iQ;
            linearLayout2.setLayoutParams(layoutParams);
        }
        View view = new View(context);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(i2);
        view.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iQ, iQ);
        layoutParams2.rightMargin = iQ2;
        view.setLayoutParams(layoutParams2);
        linearLayout2.addView(view);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setTextColor(g);
        textView.setTypeface(null, 1);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText("  " + str2);
        textView2.setTextSize(11.0f);
        textView2.setTextColor(h);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setText("›");
        textView3.setTextSize(18.0f);
        textView3.setTextColor(j);
        linearLayout2.addView(textView3);
        linearLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0499f0(iQ, i2, 0));
        linearLayout.addView(linearLayout2);
        return linearLayout2;
    }

    public static View d0(View view, ArrayList arrayList) {
        View view2 = (View) arrayList.get(0);
        int iT = t(view);
        int iAbs = Math.abs(t(view2) - iT);
        R(view2);
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            View view3 = (View) arrayList.get(i2);
            R(view3);
            int iAbs2 = Math.abs(t(view3) - iT);
            if (iAbs2 < iAbs) {
                view2 = view3;
                iAbs = iAbs2;
            }
        }
        return view2;
    }

    public static EditText e(LinearLayout linearLayout, String str, String str2, boolean z) {
        Context context = linearLayout.getContext();
        EditText editText = new EditText(context);
        editText.setHint(str);
        editText.setHintTextColor(l);
        editText.setText(str2);
        editText.setTextSize(14.0f);
        editText.setTextColor(g);
        editText.setPadding(Q(12, context), Q(10, context), Q(12, context), Q(10, context));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(b);
        gradientDrawable.setCornerRadius(Q(8, context));
        gradientDrawable.setStroke(Q(1, context), j);
        editText.setBackground(gradientDrawable);
        if (z) {
            editText.setSingleLine(false);
            editText.setMinLines(2);
            editText.setMaxLines(4);
        } else {
            editText.setSingleLine(true);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, Q(12, context));
        linearLayout.addView(editText, layoutParams);
        return editText;
    }

    public static void e0(final Dialog dialog, int i2, int i3) {
        Window window;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Context context = dialog.getContext();
        try {
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            final View childAt = viewGroup.getChildAt(0);
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(i2);
            gradientDrawable.setCornerRadius(Q(Math.max(0, i3), context));
            childAt.setBackground(gradientDrawable);
            childAt.setAlpha(0.0f);
            final float fQ = Q(12, context);
            childAt.post(new Runnable() { // from class: com.github.catvod.spider.merge.z.m0
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = 0;
                    Dialog dialog2 = dialog;
                    View view = childAt;
                    float f2 = fQ;
                    try {
                        if (dialog2.isShowing()) {
                            view.setScaleX(0.96f);
                            view.setScaleY(0.96f);
                            view.setTranslationY(f2);
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(220L);
                            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
                            valueAnimatorOfFloat.addUpdateListener(new C0504g0(view, f2, 0));
                            valueAnimatorOfFloat.addListener(new C0539n0(i4, view));
                            valueAnimatorOfFloat.start();
                        } else {
                            view.setAlpha(1.0f);
                        }
                    } catch (Exception unused) {
                        view.setAlpha(1.0f);
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setTranslationY(0.0f);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public static EditText f(LinearLayout linearLayout, String str, String str2, boolean z) {
        EditText editTextE = e(linearLayout, str, str2, z);
        Context context = linearLayout.getContext();
        editTextE.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0310y(Q(8, context), context));
        return editTextE;
    }

    public static void f0(Dialog dialog) {
        Window window;
        if (h0(dialog != null ? dialog.getContext() : null) && (dialog instanceof AlertDialog) && (window = dialog.getWindow()) != null) {
            window.getDecorView().post(new RunnableC0514i0(dialog, 0));
        }
    }

    public static void g(LinearLayout linearLayout, String str) {
        Context context = linearLayout.getContext();
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(12.0f);
        textView.setTextColor(h);
        textView.setPadding(Q(4, context), 0, 0, Q(6, context));
        linearLayout.addView(textView);
    }

    public static void g0(View view) {
        if (view != null && view.getVisibility() == 0 && view.isEnabled()) {
            view.post(new RunnableC0494e0(view, 1));
        }
    }

    public static void h(LinearLayout linearLayout, String str) {
        Context context = linearLayout.getContext();
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(13.0f);
        textView.setTextColor(g);
        textView.setTypeface(null, 1);
        textView.setPadding(Q(2, context), Q(6, context), 0, Q(4, context));
        linearLayout.addView(textView);
    }

    public static boolean h0(Context context) {
        try {
            if ((context.getResources().getConfiguration().uiMode & 15) == 4) {
                return true;
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            if (packageManager.hasSystemFeature("android.software.leanback") || packageManager.hasSystemFeature("android.hardware.type.television")) {
                return true;
            }
            return !packageManager.hasSystemFeature("android.hardware.touchscreen");
        } catch (Exception unused) {
            return false;
        }
    }

    public static void i(LinearLayout linearLayout, String str, int i2, int i3, int i4, boolean z, InterfaceC0573u0 interfaceC0573u0) {
        ViewGroup viewGroup;
        int i5;
        Context context = linearLayout.getContext();
        int iQ = Q(6, context);
        int iQ2 = Q(8, context);
        int iQ3 = Q(12, context);
        int iQ4 = Q(14, context);
        int iQ5 = Q(6, context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(iQ3, iQ3, iQ3, iQ3);
        linearLayout2.setGravity(16);
        linearLayout2.setFocusable(true);
        linearLayout2.setDescendantFocusability(262144);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iQ2);
        gradientDrawable.setColor(a);
        linearLayout2.setBackground(gradientDrawable);
        if (z) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = iQ;
            linearLayout2.setLayoutParams(layoutParams);
        }
        TextView textView = new TextView(context);
        textView.setText(String.valueOf(i2 + 1));
        textView.setTextSize(11.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setMinWidth(Q(22, context));
        textView.setPadding(iQ, Q(3, context), iQ, Q(3, context));
        textView.setBackground(L(context, i4, 11));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.rightMargin = iQ3;
        textView.setLayoutParams(layoutParams2);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText(str);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(g);
        textView2.setTypeface(null, 1);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(textView2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        if (i2 > 0) {
            viewGroup = linearLayout3;
            i5 = -2;
            TextView textViewN = N(context, "▲", c, iQ4, iQ3, iQ5);
            textViewN.setOnClickListener(new ViewOnClickListenerC0509h0(interfaceC0573u0, i2, 0));
            viewGroup.addView(textViewN);
        } else {
            viewGroup = linearLayout3;
            i5 = -2;
        }
        if (i2 < i3 - 1) {
            View viewN = N(context, "▼", f, iQ4, iQ3, iQ5);
            if (i2 > 0) {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i5, i5);
                layoutParams3.leftMargin = iQ;
                viewN.setLayoutParams(layoutParams3);
            }
            viewN.setOnClickListener(new ViewOnClickListenerC0509h0(interfaceC0573u0, i2, 1));
            viewGroup.addView(viewN);
        }
        linearLayout2.addView(viewGroup);
        linearLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0499f0(iQ2, i4, 2));
        linearLayout.addView(linearLayout2);
    }

    public static C0568t0 i0(Activity activity, String str, String str2, int i2) {
        int iQ = Q(8, activity);
        int iQ2 = Q(12, activity);
        LinearLayout linearLayoutK = K(activity);
        linearLayoutK.addView(q(activity, str, str2, i2), c0(iQ));
        LinearLayout linearLayoutY = y(activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = iQ2;
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(activity);
        textView.setText("处理中...");
        textView.setTextSize(13.0f);
        textView.setTextColor(h);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setText("0%");
        textView2.setTextSize(15.0f);
        textView2.setTextColor(i2);
        textView2.setTypeface(null, 1);
        linearLayout.addView(textView2);
        linearLayoutY.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setBackground(L(activity, -1513240, 8));
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, iQ));
        View view = new View(activity);
        view.setBackground(L(activity, i2, 8));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
        view.setLayoutParams(layoutParams2);
        linearLayout2.addView(view);
        linearLayoutY.addView(linearLayout2);
        linearLayoutK.addView(linearLayoutY);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setCancelable(false).create();
        j0(alertDialogCreate);
        return new C0568t0(alertDialogCreate, linearLayout2, view, layoutParams2, textView, textView2);
    }

    public static void j(LinearLayout linearLayout, String str, String str2, int i2) {
        Context context = linearLayout.getContext();
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(0, Q(4, context), 0, Q(4, context));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(13.0f);
        textView.setTextColor(h);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(context);
        textView2.setText(str2);
        textView2.setTextSize(13.0f);
        textView2.setTextColor(i2);
        textView2.setGravity(8388613);
        linearLayout2.addView(textView);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
    }

    public static void j0(Dialog dialog) {
        k0(dialog, 0.0f);
    }

    public static void k(LinearLayout linearLayout, String str, String str2, int i2) {
        Context context = linearLayout.getContext();
        int iQ = Q(6, context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(Q(2, context), iQ, 0, iQ);
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        view.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iQ, iQ);
        layoutParams.rightMargin = Q(10, context);
        layoutParams.topMargin = Q(6, context);
        view.setLayoutParams(layoutParams);
        linearLayout2.addView(view);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(13.0f);
        textView.setTextColor(g);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.rightMargin = Q(8, context);
        textView.setLayoutParams(layoutParams2);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText(str2);
        textView2.setTextSize(13.0f);
        textView2.setTextColor(h);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
    }

    public static void k0(Dialog dialog, float f2) {
        dialog.show();
        l0(dialog, f2);
    }

    public static void l(LinearLayout linearLayout, String str) {
        Context context = linearLayout.getContext();
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(10.0f);
        textView.setTextColor(h);
        textView.setGravity(17);
        textView.setPadding(0, Q(12, context), 0, 0);
        linearLayout.addView(textView);
    }

    public static void l0(Dialog dialog, float f2) {
        float f3;
        int i2;
        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }
        Context context = dialog.getContext();
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setWindowAnimations(0);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        boolean zY = Y(context);
        float fMin = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) / displayMetrics.density;
        if (fMin >= 600.0f) {
            f3 = zY ? 0.64f : 0.7f;
        } else {
            f3 = zY ? 0.74f : 0.9f;
        }
        if (fMin >= 600.0f) {
            i2 = zY ? 760 : 560;
        } else {
            i2 = zY ? 640 : 520;
        }
        window.setLayout(fMin >= 600.0f ? Math.min((int) (i3 * f3), Q(i2, context)) : Math.min((int) (i3 * f3), i3 - Q(24, context)), f2 > 0.0f ? (int) (i4 * f2) : -2);
        if (dialog instanceof AlertDialog) {
            AlertDialog alertDialog = (AlertDialog) dialog;
            boolean zH0 = h0(context);
            try {
                m0(alertDialog.getButton(-1), p, zH0);
                m0(alertDialog.getButton(-2), q, zH0);
                m0(alertDialog.getButton(-3), r, zH0);
            } catch (Exception unused) {
            }
            if (zH0) {
                window.getDecorView().post(new T(alertDialog, 1));
            }
        }
        e0(dialog, a, 16);
    }

    public static void m(LinearLayout linearLayout, String str, String str2, int i2, boolean z, int i3, boolean z2, View[] viewArr, boolean[] zArr, InterfaceC0578v0 interfaceC0578v0) {
        Context context = linearLayout.getContext();
        int iQ = Q(6, context);
        int iQ2 = Q(8, context);
        int iQ3 = Q(12, context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(iQ3, iQ3, iQ3, iQ3);
        linearLayout2.setGravity(16);
        linearLayout2.setFocusable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iQ2);
        gradientDrawable.setColor(a);
        linearLayout2.setBackground(gradientDrawable);
        if (z2) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = iQ;
            linearLayout2.setLayoutParams(layoutParams);
        }
        View view = new View(context);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(i2);
        view.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iQ2, iQ2);
        layoutParams2.rightMargin = iQ3;
        view.setLayoutParams(layoutParams2);
        linearLayout2.addView(view);
        int i4 = g;
        if (str2 == null || str2.isEmpty()) {
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextSize(14.0f);
            textView.setTextColor(i4);
            textView.setTypeface(null, 1);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout2.addView(textView);
        } else {
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(1);
            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView2 = new TextView(context);
            textView2.setText(str);
            textView2.setTextSize(14.0f);
            textView2.setTextColor(i4);
            textView2.setTypeface(null, 1);
            linearLayout3.addView(textView2);
            TextView textView3 = new TextView(context);
            textView3.setText(str2);
            textView3.setTextSize(11.0f);
            textView3.setTextColor(h);
            linearLayout3.addView(textView3);
            linearLayout2.addView(linearLayout3);
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        C0544o0 c0544o0 = new C0544o0(context, f2, (int) (10.0f * f2), (int) (44.0f * f2), (int) (24.0f * f2));
        c0544o0.setTag(Boolean.valueOf(z));
        c0544o0.setLayerType(1, null);
        if (viewArr != null && i3 < viewArr.length) {
            viewArr[i3] = c0544o0;
        }
        linearLayout2.addView(c0544o0);
        linearLayout2.setOnClickListener(new ViewOnClickListenerC0524k0(c0544o0, zArr, i3, interfaceC0578v0));
        linearLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0499f0(iQ2, i2, 4));
        linearLayout.addView(linearLayout2);
    }

    public static void m0(Button button, int i2, boolean z) {
        if (button == null) {
            return;
        }
        Context context = button.getContext();
        button.setTextColor(z ? B(i2) : ColorStateList.valueOf(i2));
        button.setFocusable(z);
        button.setFocusableInTouchMode(z);
        button.setClickable(true);
        button.setMinHeight(Q(48, context));
        button.setMinWidth(Q(72, context));
        button.setPadding(Q(18, context), Q(8, context), Q(18, context), Q(8, context));
        R(button);
        if (!z) {
            button.setScaleX(1.0f);
            button.setScaleY(1.0f);
            button.setTypeface(Typeface.DEFAULT, 0);
            button.setOnFocusChangeListener(null);
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(Q(8, context));
        gradientDrawable.setColor(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(Q(8, context));
        gradientDrawable2.setColor(m);
        int iQ = Q(1, context);
        int i3 = o;
        gradientDrawable2.setStroke(iQ, i3);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(Q(8, context));
        gradientDrawable3.setColor(n);
        gradientDrawable3.setStroke(Q(3, context), i3);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable3);
        stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        button.setBackground(stateListDrawable);
        if (Build.VERSION.SDK_INT >= 21) {
            button.setBackgroundTintList(null);
        }
        button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0489d0(button, 0));
    }

    public static void n(View view, int i2) {
        int iQ = Q(8, view.getContext());
        view.setFocusable(true);
        view.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0499f0(iQ, i2, 1));
    }

    public static void n0(Button button, boolean z, boolean z2) {
        if (button == null) {
            return;
        }
        button.setVisibility(z ? 0 : 8);
        button.setEnabled(z2);
        button.setAlpha(z2 ? 1.0f : 0.4f);
    }

    public static void o(ScrollView scrollView, View view) {
        if (scrollView == null || view == null || !h0(scrollView.getContext())) {
            return;
        }
        scrollView.post(new RunnableC0494e0(view, 0));
    }

    public static void o0(AlertDialog alertDialog) {
        try {
            ArrayList<View> arrayList = new ArrayList();
            b(arrayList, alertDialog.getButton(-2));
            b(arrayList, alertDialog.getButton(-3));
            b(arrayList, alertDialog.getButton(-1));
            if (arrayList.isEmpty()) {
                return;
            }
            Collections.sort(arrayList, new L(2));
            b0(arrayList);
            V(arrayList);
            View view = null;
            ViewGroup viewGroup = alertDialog.getWindow() != null ? (ViewGroup) alertDialog.getWindow().getDecorView() : null;
            if (viewGroup == null) {
                return;
            }
            View button = alertDialog.getButton(-1);
            if (!arrayList.contains(button)) {
                button = arrayList.isEmpty() ? null : (View) arrayList.get(arrayList.size() - 1);
            }
            if (button == null) {
                return;
            }
            R(button);
            ArrayList<View> arrayList2 = new ArrayList<>();
            ArrayList<View> arrayList3 = new ArrayList();
            viewGroup.addFocusables(arrayList2, 130);
            for (View view2 : arrayList2) {
                if (view2 != null && !arrayList.contains(view2) && a0(view2)) {
                    arrayList3.add(view2);
                }
            }
            int i2 = Integer.MIN_VALUE;
            for (View view3 : arrayList3) {
                int iU = U(view3);
                if (iU > i2) {
                    view = view3;
                    i2 = iU;
                }
            }
            if (view != null) {
                R(view);
                for (View view4 : arrayList) {
                    R(view4);
                    view4.setNextFocusUpId(view.getId());
                }
            }
            Context context = alertDialog.getContext();
            ArrayList<View> arrayList4 = new ArrayList();
            Iterator it = arrayList3.iterator();
            int i3 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int iU2 = U((View) it.next());
                if (iU2 > i3) {
                    i3 = iU2;
                }
            }
            if (i3 != Integer.MIN_VALUE) {
                int iQ = Q(80, context);
                for (View view5 : arrayList3) {
                    if (i3 - U(view5) <= iQ) {
                        arrayList4.add(view5);
                    }
                }
            }
            for (View view6 : arrayList4) {
                R(view6);
                view6.setNextFocusDownId(button.getId());
                view6.setOnKeyListener(new ViewOnKeyListenerC0307x(arrayList, button, 3));
            }
            if (arrayList3.isEmpty() && viewGroup.findFocus() == null) {
                button.requestFocus();
            }
        } catch (Exception unused) {
        }
    }

    public static LinearLayout p(Context context, String str, String str2) {
        LinearLayout linearLayoutY = y(context);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(g);
        textView.setTypeface(null, 1);
        linearLayoutY.addView(textView);
        if (str2 != null && !str2.isEmpty()) {
            TextView textView2 = new TextView(context);
            textView2.setText(str2);
            textView2.setTextSize(11.0f);
            textView2.setTextColor(h);
            textView2.setPadding(0, Q(2, context), 0, 0);
            textView2.setLineSpacing(Q(1, context), 1.0f);
            linearLayoutY.addView(textView2);
        }
        return linearLayoutY;
    }

    public static ScrollView p0(LinearLayout linearLayout) {
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        scrollView.setFocusable(false);
        scrollView.setFocusableInTouchMode(false);
        scrollView.setDescendantFocusability(262144);
        linearLayout.setDescendantFocusability(262144);
        scrollView.addView(linearLayout);
        o(scrollView, linearLayout);
        return scrollView;
    }

    public static LinearLayout q(Context context, String str, String str2, int i2) {
        int iQ = Q(6, context);
        int iQ2 = Q(10, context);
        int iQ3 = Q(12, context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(0, iQ2, iQ3, iQ2);
        linearLayout.setGravity(16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f2 = iQ;
        gradientDrawable.setCornerRadius(f2);
        gradientDrawable.setColor(-460294);
        linearLayout.setBackground(gradientDrawable);
        View view = new View(context);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f2);
        gradientDrawable2.setColor(i2);
        view.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Q(4, context), Q(28, context));
        layoutParams.leftMargin = iQ3;
        layoutParams.rightMargin = iQ2;
        linearLayout.addView(view, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(g);
        textView.getPaint().setFakeBoldText(true);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText(str2);
        textView2.setTextSize(11.0f);
        textView2.setTextColor(i);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    public static C0533m q0(LinearLayout linearLayout) {
        Context context = linearLayout.getContext();
        C0533m c0533m = new C0533m(context, T(context), 1);
        c0533m.setFocusable(false);
        c0533m.setFocusableInTouchMode(false);
        c0533m.setDescendantFocusability(262144);
        c0533m.setFillViewport(false);
        c0533m.setVerticalScrollBarEnabled(true);
        c0533m.setOverScrollMode(1);
        linearLayout.setDescendantFocusability(262144);
        c0533m.addView(linearLayout);
        o(c0533m, linearLayout);
        return c0533m;
    }

    public static AlertDialog r(Context context, String str, String str2, int i2, String[][] strArr, int[] iArr, String[] strArr2, final Runnable[] runnableArr) {
        int iQ = Q(16, context);
        int iQ2 = Q(20, context);
        LinearLayout linearLayoutK = K(context);
        linearLayoutK.setPadding(iQ, iQ2, iQ, iQ2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setDescendantFocusability(262144);
        linearLayout.addView(q(context, str, str2, i2), c0(iQ));
        if (strArr != null && strArr.length > 0) {
            LinearLayout linearLayoutY = y(context);
            linearLayoutY.setPadding(iQ, Q(14, context), iQ, Q(14, context));
            int i3 = 0;
            while (i3 < strArr.length) {
                int i4 = (iArr == null || i3 >= iArr.length) ? i2 : iArr[i3];
                String[] strArr3 = strArr[i3];
                k(linearLayoutY, strArr3[0], strArr3[1], i4);
                i3++;
            }
            linearLayout.addView(linearLayoutY);
        }
        linearLayoutK.addView(q0(linearLayout), new LinearLayout.LayoutParams(-1, -2));
        AlertDialog.Builder cancelable = new AlertDialog.Builder(context).setView(linearLayoutK).setCancelable(true);
        if (strArr2.length > 0) {
            final int i5 = 0;
            cancelable.setPositiveButton(strArr2[0], new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.l0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    Runnable runnable;
                    Runnable runnable2;
                    Runnable runnable3;
                    switch (i5) {
                        case 0:
                            Runnable[] runnableArr2 = runnableArr;
                            if (runnableArr2 != null && runnableArr2.length > 0 && (runnable = runnableArr2[0]) != null) {
                                runnable.run();
                                break;
                            }
                            break;
                        case 1:
                            Runnable[] runnableArr3 = runnableArr;
                            if (runnableArr3 != null && 1 < runnableArr3.length && (runnable2 = runnableArr3[1]) != null) {
                                runnable2.run();
                                break;
                            }
                            break;
                        default:
                            Runnable[] runnableArr4 = runnableArr;
                            if (runnableArr4 != null && 2 < runnableArr4.length && (runnable3 = runnableArr4[2]) != null) {
                                runnable3.run();
                                break;
                            }
                            break;
                    }
                }
            });
            if (strArr2.length > 1) {
                final int i6 = 1;
                cancelable.setNegativeButton(strArr2[1], new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.l0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) {
                        Runnable runnable;
                        Runnable runnable2;
                        Runnable runnable3;
                        switch (i6) {
                            case 0:
                                Runnable[] runnableArr2 = runnableArr;
                                if (runnableArr2 != null && runnableArr2.length > 0 && (runnable = runnableArr2[0]) != null) {
                                    runnable.run();
                                    break;
                                }
                                break;
                            case 1:
                                Runnable[] runnableArr3 = runnableArr;
                                if (runnableArr3 != null && 1 < runnableArr3.length && (runnable2 = runnableArr3[1]) != null) {
                                    runnable2.run();
                                    break;
                                }
                                break;
                            default:
                                Runnable[] runnableArr4 = runnableArr;
                                if (runnableArr4 != null && 2 < runnableArr4.length && (runnable3 = runnableArr4[2]) != null) {
                                    runnable3.run();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            if (strArr2.length > 2) {
                final int i7 = 2;
                cancelable.setNeutralButton(strArr2[2], new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.l0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        Runnable runnable;
                        Runnable runnable2;
                        Runnable runnable3;
                        switch (i7) {
                            case 0:
                                Runnable[] runnableArr2 = runnableArr;
                                if (runnableArr2 != null && runnableArr2.length > 0 && (runnable = runnableArr2[0]) != null) {
                                    runnable.run();
                                    break;
                                }
                                break;
                            case 1:
                                Runnable[] runnableArr3 = runnableArr;
                                if (runnableArr3 != null && 1 < runnableArr3.length && (runnable2 = runnableArr3[1]) != null) {
                                    runnable2.run();
                                    break;
                                }
                                break;
                            default:
                                Runnable[] runnableArr4 = runnableArr;
                                if (runnableArr4 != null && 2 < runnableArr4.length && (runnable3 = runnableArr4[2]) != null) {
                                    runnable3.run();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        return cancelable.create();
    }

    public static LinearLayout s(ContextWrapper contextWrapper, LinearLayout linearLayout) {
        LinearLayout linearLayoutY = y(contextWrapper);
        linearLayoutY.setPadding(Q(12, contextWrapper), Q(12, contextWrapper), Q(12, contextWrapper), Q(12, contextWrapper));
        ScrollView scrollView = new ScrollView(contextWrapper);
        scrollView.setFillViewport(true);
        scrollView.setDescendantFocusability(262144);
        linearLayout.setDescendantFocusability(262144);
        scrollView.addView(linearLayout);
        o(scrollView, linearLayout);
        linearLayoutY.addView(scrollView);
        scrollView.post(new A(scrollView, (int) (contextWrapper.getResources().getDisplayMetrics().density * 280.0f), 1));
        return linearLayoutY;
    }

    public static int t(View view) {
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            return rect.centerX();
        }
        return (view.getWidth() / 2) + view.getLeft();
    }

    public static void u(View view, ArrayList arrayList) {
        if (view != null && view.getVisibility() == 0 && view.isShown() && view.isEnabled() && view.isFocusable()) {
            R(view);
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                u(viewGroup.getChildAt(i2), arrayList);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    public static void v(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList2 = new ArrayList();
            u(view, arrayList2);
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(arrayList2);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (!(viewGroup instanceof LinearLayout) || ((LinearLayout) viewGroup).getOrientation() != 1) {
            ArrayList arrayList3 = new ArrayList();
            u(view, arrayList3);
            if (arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(arrayList3);
            return;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            ArrayList arrayList4 = new ArrayList();
            u(childAt, arrayList4);
            if (!arrayList4.isEmpty()) {
                if (childAt.isFocusable() || !(childAt instanceof ViewGroup)) {
                    arrayList.add(arrayList4);
                    break;
                }
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                if (!(viewGroup2 instanceof LinearLayout) || ((LinearLayout) viewGroup2).getOrientation() != 1) {
                    arrayList.add(arrayList4);
                    break;
                    break;
                }
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= viewGroup2.getChildCount()) {
                        arrayList.add(arrayList4);
                        break;
                        break;
                    }
                    View childAt2 = viewGroup2.getChildAt(i3);
                    ArrayList arrayList5 = new ArrayList();
                    u(childAt2, arrayList5);
                    if (!arrayList5.isEmpty() && (i4 = i4 + 1) > 1) {
                        v(childAt, arrayList);
                        break;
                    }
                    i3++;
                }
            }
        }
    }

    public static LinearLayout w(Activity activity, String str, String str2, int i2) {
        int iQ = Q(8, activity);
        int iQ2 = Q(12, activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(iQ2, iQ2, iQ2, iQ2);
        linearLayout.setGravity(17);
        linearLayout.setFocusable(true);
        linearLayout.setClickable(true);
        float f2 = 32 / 255.0f;
        float f3 = (1.0f - f2) * 255.0f;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f4 = iQ;
        gradientDrawable.setCornerRadius(f4);
        gradientDrawable.setColor((((int) ((((i2 >> 8) & 255) * f2) + f3)) << 8) | (((int) ((((i2 >> 16) & 255) * f2) + f3)) << 16) | (-16777216) | ((int) (((i2 & 255) * f2) + f3)));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f4);
        gradientDrawable2.setColor(k);
        gradientDrawable2.setStroke(Q(2, activity), i2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        linearLayout.setBackground(stateListDrawable);
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(i2);
        textView.getPaint().setFakeBoldText(true);
        textView.setGravity(17);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setText(str2);
        textView2.setTextSize(11.0f);
        textView2.setTextColor(h);
        textView2.setGravity(17);
        textView2.setPadding(0, Q(4, activity), 0, 0);
        linearLayout.addView(textView2);
        return linearLayout;
    }

    public static TextView x(Context context, String str, int i2) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(Q(16, context), Q(10, context), Q(16, context), Q(10, context));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(Q(8, context));
        textView.setBackground(gradientDrawable);
        return textView;
    }

    public static LinearLayout y(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(b);
        gradientDrawable.setCornerRadius(Q(12, context));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setPadding(Q(14, context), Q(10, context), Q(14, context), Q(10, context));
        return linearLayout;
    }

    public static LinearLayout z(Context context, int i2, int i3) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(Q(i3, context));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setPadding(Q(14, context), Q(10, context), Q(14, context), Q(10, context));
        return linearLayout;
    }
}

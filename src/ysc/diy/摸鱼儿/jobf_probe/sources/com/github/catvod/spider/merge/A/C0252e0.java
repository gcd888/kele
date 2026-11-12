package com.github.catvod.spider.merge.A;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.ViewOnClickListenerC0509h0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0252e0 {
    public static LinkedHashMap Z;
    public float A;
    public int B;
    public int C;
    public int D;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public String V;
    public final Activity a;
    public final C0274l1 b;
    public final boolean c;
    public String d;
    public Dialog e;
    public FrameLayout f;
    public LinearLayout g;
    public ProgressBar h;
    public ValueAnimator j;
    public HorizontalScrollView k;
    public LinearLayout l;
    public View m;
    public ProgressBar n;
    public FrameLayout r;
    public LinkedHashMap t;
    public EditText u;
    public LinearLayout v;
    public TextView w;
    public static WeakReference W = new WeakReference(null);
    public static long X = Long.MIN_VALUE;
    public static String Y = "";
    public static final HashMap a0 = new HashMap();
    public static int b0 = 0;
    public static int c0 = 0;
    public static com.github.catvod.spider.merge.p006g.b d0 = null;
    public static final int e0 = Color.parseColor("#2196F3");
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public int q = 0;
    public final ArrayList s = new ArrayList();
    public boolean x = false;
    public volatile boolean y = false;
    public volatile boolean z = false;
    public boolean E = false;

    public C0252e0(Activity activity, String str, C0274l1 c0274l1) {
        this.a = activity;
        this.d = str;
        boolean z = c0274l1 != null;
        this.c = z;
        this.b = z ? c0274l1 : AbstractC0280n1.d();
    }

    public static void B(Activity activity, String str) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        try {
            new C0252e0(activity, str, null).C();
        } catch (Exception e) {
            SpiderDebug.log("[弹幕搜索] 创建对话框异常: " + e.getMessage());
            X0.a("弹幕搜索失败");
        }
    }

    public static void a(C0252e0 c0252e0) {
        c0252e0.s.clear();
        c0252e0.r.removeAllViews();
        HorizontalScrollView horizontalScrollView = c0252e0.k;
        if (horizontalScrollView != null) {
            horizontalScrollView.setVisibility(8);
        }
        Activity activity = c0252e0.a;
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int iM = c0252e0.m(24);
        int iM2 = c0252e0.m(40);
        linearLayout.setPadding(iM, iM2, iM, iM2);
        TextView textView = new TextView(activity);
        textView.setText("~");
        textView.setTextSize(36.0f);
        textView.setTextColor(Color.parseColor(c0252e0.F ? "#333333" : "#DDDDDD"));
        textView.setGravity(17);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setText("未找到弹幕");
        textView2.setTextSize(15.0f);
        textView2.setTextColor(c0252e0.R);
        textView2.setGravity(17);
        textView2.setPadding(0, c0252e0.J, 0, 0);
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(activity);
        textView3.setText("试试修改关键词，或长按搜索按钮远程输入");
        textView3.setTextSize(12.0f);
        textView3.setTextColor(Color.parseColor(c0252e0.F ? "#555555" : "#BBBBBB"));
        textView3.setGravity(17);
        textView3.setPadding(0, c0252e0.I, 0, 0);
        linearLayout.addView(textView3);
        scrollView.addView(linearLayout);
        c0252e0.r.addView(scrollView);
        c0252e0.r.setVisibility(0);
        c0252e0.w();
    }

    public static View o(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                View viewO = o((ViewGroup) childAt);
                if (viewO != null) {
                    return viewO;
                }
                if (childAt.isFocusable()) {
                    return childAt;
                }
            } else if (childAt.isFocusable()) {
                return childAt;
            }
        }
        return null;
    }

    public static void q(LinearLayout linearLayout) {
        if (linearLayout.getChildCount() == 0) {
            return;
        }
        View childAt = linearLayout.getChildAt(0);
        if (childAt instanceof LinearLayout) {
            LinearLayout linearLayout2 = (LinearLayout) childAt;
            if (linearLayout2.getChildCount() > 0) {
                linearLayout2.getChildAt(0).requestFocus();
            }
        }
    }

    public final void A(int i) {
        if (i != this.q && i >= 0) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                return;
            }
            int i2 = this.q;
            if (i2 >= 0 && i2 < arrayList.size()) {
                ((C0249d0) arrayList.get(this.q)).a.setVisibility(8);
            }
            this.q = i;
            c0 = i;
            ((C0249d0) arrayList.get(i)).a.setVisibility(0);
            F();
            E(i);
            z(i);
        }
    }

    public final void C() {
        String str;
        Dialog dialog;
        Activity activity = this.a;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        C0274l1 c0274l1 = this.b;
        boolean z = this.c;
        if (!z || c0274l1.a()) {
            try {
                C0252e0 c0252e0 = (C0252e0) W.get();
                if (c0252e0 != null && c0252e0 != this && (dialog = c0252e0.e) != null && dialog.isShowing()) {
                    if (z) {
                        return;
                    }
                    if (c0252e0.a == activity && c0252e0.b.a()) {
                        return;
                    } else {
                        c0252e0.l();
                    }
                }
                if (!h()) {
                    l();
                    return;
                }
                W = new WeakReference(this);
                X = c0274l1.d;
                this.h.setVisibility(8);
                TextView textView = this.w;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                LinkedHashMap linkedHashMap = Z;
                if (linkedHashMap != null && !linkedHashMap.isEmpty() && (str = Y) != null && str.equals(this.d)) {
                    y();
                }
                if (z) {
                    this.w.setText("本集暂未取得弹幕，可修改片名后手动搜索");
                    this.w.setVisibility(0);
                    w();
                } else {
                    EditText editText = this.u;
                    if (editText == null) {
                        return;
                    }
                    editText.post(new RunnableC0242b(this, editText, 1));
                }
            } catch (Exception e) {
                SpiderDebug.log("[弹幕搜索] 创建对话框失败: " + e.getMessage());
                X0.a("创建对话框失败");
            }
        }
    }

    public final void D(final com.github.catvod.spider.merge.p006g.b bVar, final boolean z) {
        final C0249d0 c0249d0R = r();
        if (c0249d0R == null) {
            return;
        }
        c0249d0R.c = 1;
        c0249d0R.d = bVar;
        c0249d0R.e = false;
        b0 = 1;
        d0 = bVar;
        c0 = this.q;
        final LinearLayout linearLayout = c0249d0R.b;
        linearLayout.removeAllViews();
        Activity activity = this.a;
        final LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, this.G ? this.J : this.L);
        linearLayout3.setLayoutParams(layoutParams);
        final LinearLayout linearLayout4 = new LinearLayout(activity);
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        int color = Color.parseColor(this.F ? "#2A2A2E" : "#F0EDF5");
        int i = this.L;
        int i2 = this.K;
        linearLayout4.setPadding(i, i2, i, i2);
        linearLayout4.setFocusable(true);
        linearLayout4.setBackground(g(color));
        final TextView textView = new TextView(activity);
        textView.setText("<");
        textView.setTextSize(16.0f);
        final int color2 = Color.parseColor(this.F ? "#AAAAAA" : "#888888");
        textView.setTextColor(color2);
        textView.setPadding(0, 0, this.J, 0);
        linearLayout4.addView(textView);
        final TextView textView2 = new TextView(activity);
        textView2.setText(bVar.e());
        textView2.setTextSize(14.0f);
        final int color3 = Color.parseColor(this.F ? "#EEEEEE" : "#333333");
        textView2.setTextColor(color3);
        textView2.getPaint().setFakeBoldText(true);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout4.addView(textView2);
        final TextView textView3 = new TextView(activity);
        textView3.setTextSize(11.0f);
        final int color4 = Color.parseColor(this.F ? "#666666" : "#AAAAAA");
        textView3.setTextColor(color4);
        textView3.setPadding(this.J, 0, 0, 0);
        linearLayout4.addView(textView3);
        linearLayout4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.github.catvod.spider.merge.A.Y
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                textView.setTextColor(z2 ? -1 : color2);
                textView2.setTextColor(z2 ? -1 : color3);
                textView3.setTextColor(z2 ? -855638017 : color4);
            }
        });
        linearLayout4.setOnClickListener(new F(this, 1));
        linearLayout4.setOnKeyListener(new ViewOnKeyListenerC0307x(this, linearLayout2, 0));
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.addView(linearLayout4);
        final TextView textView4 = new TextView(activity);
        textView4.setText("↓");
        textView4.setTextSize(14.0f);
        textView4.setGravity(17);
        textView4.setFocusable(true);
        textView4.setClickable(true);
        int i3 = this.K;
        int i4 = this.J;
        textView4.setPadding(i3, i4, i3, i4);
        int color5 = Color.parseColor(this.F ? "#AAAAAA" : "#888888");
        textView4.setTextColor(color5);
        textView4.setBackground(g(color));
        textView4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0310y(textView4, color5, 0));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(this.J, 0, 0, 0);
        textView4.setLayoutParams(layoutParams2);
        textView4.setVisibility(8);
        linearLayout3.addView(textView4);
        linearLayout.addView(linearLayout3);
        if (z && !linearLayout4.isInTouchMode()) {
            linearLayout4.post(new D1(1, linearLayout4));
        }
        linearLayout.addView(linearLayout2);
        View progressBar = new ProgressBar(activity);
        int i5 = this.P;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i5, i5);
        layoutParams3.gravity = 17;
        int i6 = this.N;
        layoutParams3.setMargins(0, i6, 0, i6);
        progressBar.setLayoutParams(layoutParams3);
        linearLayout2.addView(progressBar);
        final String str = bVar.f() + ":" + bVar.d();
        InitOrigin.execute(new Runnable() { // from class: com.github.catvod.spider.merge.A.z
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                ArrayList arrayList;
                com.github.catvod.spider.merge.p006g.b bVar2 = bVar;
                final C0252e0 c0252e0 = this.a;
                c0252e0.getClass();
                HashMap map = C0252e0.a0;
                String str2 = str;
                List list = (List) map.get(str2);
                if (list != null) {
                    arrayList = new ArrayList(list);
                } else {
                    try {
                        com.github.catvod.spider.merge.p000a.I iP = com.github.catvod.spider.merge.p000a.I.p();
                        String strE = bVar2.e();
                        String strD = bVar2.d();
                        String strF = bVar2.f();
                        iP.getClass();
                        arrayList = com.github.catvod.spider.merge.p000a.I.r(strE, strD, strF);
                    } catch (Exception e) {
                        com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[弹幕搜索] 获取集数失败: "));
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (!arrayList.isEmpty()) {
                        map.put(str2, new ArrayList(arrayList));
                    }
                }
                final ArrayList arrayList2 = arrayList;
                Handler handler = c0252e0.i;
                final LinearLayout linearLayout5 = linearLayout;
                final TextView textView5 = textView4;
                final LinearLayout linearLayout6 = linearLayout2;
                final TextView textView6 = textView3;
                final boolean z2 = z;
                final LinearLayout linearLayout7 = linearLayout4;
                final C0249d0 c0249d0 = c0249d0R;
                handler.post(new Runnable() { // from class: com.github.catvod.spider.merge.A.O
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        final C0252e0 c0252e1 = c0252e0;
                        final LinearLayout linearLayout8 = linearLayout6;
                        final TextView textView7 = textView6;
                        List list2 = arrayList2;
                        boolean z3 = z2;
                        LinearLayout linearLayout9 = linearLayout7;
                        final C0249d0 c0249d1 = c0249d0;
                        final LinearLayout linearLayout10 = linearLayout5;
                        final TextView textView8 = textView5;
                        if (c0252e1.y) {
                            return;
                        }
                        linearLayout8.removeAllViews();
                        textView7.setText(list2.size() + " 集");
                        if (!list2.isEmpty()) {
                            if (list2.size() > 1) {
                                textView8.setVisibility(0);
                            }
                            final ArrayList arrayList3 = (ArrayList) list2;
                            c0252e1.e(linearLayout8, arrayList3, z3);
                            AbstractC0583w0.o(c0249d1.a, linearLayout10);
                            final int size = list2.size();
                            textView8.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.A.T
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C0252e0 c0252e2 = c0252e1;
                                    c0252e2.getClass();
                                    C0249d0 c0249d2 = c0249d1;
                                    boolean z4 = !c0249d2.e;
                                    c0249d2.e = z4;
                                    textView8.setText(z4 ? "↑" : "↓");
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(size);
                                    sb.append(" 集");
                                    sb.append(c0249d2.e ? " (倒序)" : "");
                                    textView7.setText(sb.toString());
                                    List list3 = arrayList3;
                                    Collections.reverse(list3);
                                    c0252e2.e(linearLayout8, (ArrayList) list3, true);
                                    AbstractC0583w0.o(c0249d2.a, linearLayout10);
                                }
                            });
                            textView8.setOnKeyListener(new View.OnKeyListener() { // from class: com.github.catvod.spider.merge.A.U
                                @Override // android.view.View.OnKeyListener
                                public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
                                    C0252e0 c0252e2 = c0252e1;
                                    c0252e2.getClass();
                                    if (keyEvent.getAction() != 0) {
                                        return false;
                                    }
                                    if (i7 == 23 || i7 == 66) {
                                        textView8.performClick();
                                    } else if (i7 == 19) {
                                        HorizontalScrollView horizontalScrollView = c0252e2.k;
                                        if (horizontalScrollView == null || horizontalScrollView.getVisibility() != 0 || c0252e2.q >= c0252e2.o.size()) {
                                            c0252e2.w();
                                        } else {
                                            c0252e2.x(c0252e2.q);
                                        }
                                    } else {
                                        if (i7 != 20) {
                                            return false;
                                        }
                                        C0252e0.q(linearLayout8);
                                    }
                                    return true;
                                }
                            });
                            return;
                        }
                        TextView textView9 = new TextView(c0252e1.a);
                        textView9.setText("暂无剧集");
                        textView9.setTextColor(Color.parseColor("#999999"));
                        textView9.setGravity(17);
                        textView9.setPadding(0, c0252e1.N, 0, 0);
                        linearLayout8.addView(textView9);
                        if (z3 && !linearLayout9.isInTouchMode()) {
                            linearLayout9.requestFocus();
                        }
                        AbstractC0583w0.o(c0249d1.a, linearLayout10);
                    }
                });
            }
        });
    }

    public final void E(int i) {
        ArrayList arrayList = this.o;
        if (i >= arrayList.size()) {
            return;
        }
        TextView textView = (TextView) arrayList.get(i);
        this.m.setVisibility(0);
        this.m.setBackgroundColor(Color.parseColor(s(i)));
        final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.m.getLayoutParams();
        final int iMeasureText = (int) textView.getPaint().measureText(textView.getText().toString());
        final int width = ((textView.getWidth() - iMeasureText) / 2) + textView.getLeft();
        if (layoutParams.width <= 0) {
            layoutParams.width = iMeasureText;
            layoutParams.leftMargin = width;
            this.m.setLayoutParams(layoutParams);
            return;
        }
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int i2 = layoutParams.width;
        final int i3 = layoutParams.leftMargin;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.j.setInterpolator(new DecelerateInterpolator());
        this.j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.github.catvod.spider.merge.A.K
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C0252e0 c0252e0 = this.a;
                c0252e0.getClass();
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                int i4 = iMeasureText;
                int i5 = i2;
                int i6 = i5 + ((int) ((i4 - i5) * animatedFraction));
                LinearLayout.LayoutParams layoutParams2 = layoutParams;
                layoutParams2.width = i6;
                int i7 = width;
                int i8 = i3;
                layoutParams2.leftMargin = i8 + ((int) ((i7 - i8) * animatedFraction));
                c0252e0.m.setLayoutParams(layoutParams2);
            }
        });
        this.j.start();
    }

    public final void F() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.o;
            if (i >= arrayList.size()) {
                return;
            }
            ((TextView) arrayList.get(i)).setTextColor(Color.parseColor(i == this.q ? s(i) : "#999999"));
            i++;
        }
    }

    public final void b(final int i, String str) {
        String strA = com.github.catvod.spider.merge.p006g.b.a(str);
        List list = (List) this.t.get(str);
        int size = list != null ? list.size() : 0;
        if (size > 0) {
            strA = strA + " (" + size + ")";
        }
        TextView textView = new TextView(this.a);
        textView.setText(strA);
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.parseColor(i == this.q ? s(i) : "#999999"));
        int i2 = this.L;
        textView.setPadding(i2, this.J, i2, this.I);
        textView.setGravity(17);
        textView.setFocusable(true);
        textView.setClickable(true);
        textView.setBackgroundColor(0);
        textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0310y(this, i, 1));
        textView.setOnKeyListener(new View.OnKeyListener() { // from class: com.github.catvod.spider.merge.A.A
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                C0252e0 c0252e0 = this.a;
                c0252e0.getClass();
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int i4 = i;
                if (i3 == 23 || i3 == 66 || i3 == 20) {
                    c0252e0.A(i4);
                    if (!c0252e0.p(c0252e0.q)) {
                        c0252e0.x(i4);
                    }
                } else if (i3 == 19) {
                    c0252e0.w();
                } else if ((i3 != 21 || i4 != 0) && (i3 != 22 || i4 != c0252e0.o.size() - 1)) {
                    return false;
                }
                return true;
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, this.M, 0);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new ViewOnClickListenerC0509h0(this, i, 2));
        int iIndexOfChild = this.l.indexOfChild(this.n);
        if (iIndexOfChild >= 0) {
            this.l.addView(textView, iIndexOfChild);
        } else {
            this.l.addView(textView);
        }
        this.o.add(textView);
        if (this.z) {
            textView.setAlpha(0.0f);
            textView.animate().alpha(1.0f).setDuration(200L).start();
        }
    }

    public final C0274l1 c() {
        synchronized (AbstractC0280n1.class) {
            if (this.c && !this.b.a()) {
                k();
                X0.a("播放已切换或已重新选源，请重新打开弹幕搜索");
                return null;
            }
            return AbstractC0280n1.a();
        }
    }

    public final boolean d(int i, boolean z) {
        boolean z2;
        View viewFocusSearch;
        Dialog dialog = this.e;
        View currentFocus = dialog != null ? dialog.getCurrentFocus() : null;
        if (currentFocus == null) {
            w();
            return true;
        }
        LinearLayout linearLayout = this.g;
        if (linearLayout == null) {
            z2 = false;
            break;
        }
        View view = currentFocus;
        while (true) {
            if (view != null) {
                if (view == linearLayout) {
                    z2 = true;
                    break;
                }
                if (view.getParent() instanceof View) {
                    view = (View) view.getParent();
                }
            }
            z2 = false;
            break;
        }
        if (!z2) {
            return false;
        }
        if ((!z || currentFocus != this.u) && (viewFocusSearch = currentFocus.focusSearch(i)) != null) {
            LinearLayout linearLayout2 = this.g;
            if (linearLayout2 == null) {
                return true;
            }
            for (viewFocusSearch = currentFocus.focusSearch(i); viewFocusSearch != null; viewFocusSearch = (View) viewFocusSearch.getParent()) {
                if (viewFocusSearch != linearLayout2) {
                    if (!(viewFocusSearch.getParent() instanceof View)) {
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x014e A[PHI: r18
  0x014e: PHI (r18v2 java.lang.String) = (r18v1 java.lang.String), (r18v1 java.lang.String), (r18v3 java.lang.String) binds: [B:63:0x0124, B:65:0x012a, B:69:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void e(LinearLayout linearLayout, ArrayList arrayList, boolean z) {
        String string;
        com.github.catvod.spider.merge.p006g.b bVar;
        linearLayout.removeAllViews();
        int i = this.L * 2;
        int i2 = this.J;
        C0249d0 c0249d0R = r();
        int i3 = 0;
        int width = c0249d0R != null ? c0249d0R.a.getWidth() : 0;
        if (width <= 0 && c0249d0R != null) {
            width = c0249d0R.b.getWidth();
        }
        int i4 = width - i;
        String strE = (c0249d0R == null || (bVar = c0249d0R.d) == null) ? null : bVar.e();
        Activity activity = this.a;
        TextView textView = new TextView(activity);
        textView.setTextSize(14.0f);
        Iterator it = arrayList.iterator();
        float fMax = 0.0f;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.github.catvod.spider.merge.p006g.b bVar2 = (com.github.catvod.spider.merge.p006g.b) it.next();
            String strC = bVar2.c();
            if (strC == null || strC.isEmpty()) {
                strC = bVar2.e();
            }
            String str = strC != null ? strC : "";
            if (strE != null && !str.isEmpty() && str.startsWith(strE)) {
                String strTrim = str.substring(strE.length()).trim();
                if (!strTrim.isEmpty()) {
                    str = strTrim;
                }
            }
            fMax = Math.max(fMax, textView.getPaint().measureText(str) + (this.J * 2));
        }
        int iMax = Math.max(1, (i4 + i2) / (Math.max(((int) fMax) + this.M, m(60)) + i2));
        int i5 = iMax - 1;
        int i6 = (i4 - (i2 * i5)) / iMax;
        TextView textView2 = null;
        LinearLayout linearLayout2 = null;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            int i8 = i7 % iMax;
            if (i8 == 0) {
                linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(i3);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(i3, i3, i3, this.G ? this.K : this.N);
                linearLayout2.setLayoutParams(layoutParams);
                linearLayout2.setGravity(8388611);
                linearLayout.addView(linearLayout2);
            }
            final com.github.catvod.spider.merge.p006g.b bVar3 = (com.github.catvod.spider.merge.p006g.b) arrayList.get(i7);
            boolean z2 = i8 < i5;
            TextView textView3 = new TextView(activity);
            String strC2 = bVar3.c();
            if (strC2 == null || strC2.isEmpty()) {
                strC2 = bVar3.e();
            }
            String strTrim2 = strC2 == null ? "" : strC2;
            C0249d0 c0249d0R2 = r();
            final com.github.catvod.spider.merge.p006g.b bVar4 = c0249d0R2 != null ? c0249d0R2.d : null;
            if (bVar4 == null || strTrim2.isEmpty()) {
                string = strTrim2;
            } else {
                string = strTrim2;
                if (string.startsWith(bVar4.e())) {
                    strTrim2 = string.substring(bVar4.e().length()).trim();
                    if (!strTrim2.isEmpty()) {
                        string = strTrim2;
                    }
                }
            }
            if (bVar3.b() > 0) {
                StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(string, " (");
                sbP.append(bVar3.b());
                sbP.append(")");
                string = sbP.toString();
            }
            textView3.setText(string);
            textView3.setTextSize(14.0f);
            textView3.setTextColor(this.Q);
            textView3.setGravity(17);
            int i9 = this.J;
            textView3.setPadding(i9, i9, i9, i9);
            textView3.setSingleLine(true);
            textView3.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView3.setMarqueeRepeatLimit(-1);
            textView3.setFocusable(true);
            textView3.setClickable(true);
            textView3.setBackground(i());
            textView3.setOnFocusChangeListener(new L(this, 1));
            textView3.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.A.W
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0252e0 c0252e0 = this.a;
                    com.github.catvod.spider.merge.p006g.b bVar5 = bVar4;
                    com.github.catvod.spider.merge.p006g.b bVar6 = bVar3;
                    if (bVar5 != null) {
                        c0252e0.getClass();
                        if (bVar6.g == null) {
                            bVar6.g = bVar5.d();
                        }
                    }
                    C0274l1 c0274l1C = c0252e0.c();
                    if (c0274l1C == null) {
                        return;
                    }
                    c0252e0.k();
                    InitOrigin.execute(new S(bVar6, c0274l1C, 1));
                }
            });
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i6, -2);
            i3 = 0;
            layoutParams2.setMargins(0, 0, z2 ? this.J : 0, 0);
            textView3.setLayoutParams(layoutParams2);
            textView3.setOnKeyListener(new ViewOnKeyListenerC0278n(1, this));
            linearLayout2.addView(textView3);
            if (i7 == 0) {
                textView2 = textView3;
            }
        }
        if (!z || textView2 == null || textView2.isInTouchMode()) {
            return;
        }
        textView2.post(new D1(2, textView2));
    }

    public final TextView f(final com.github.catvod.spider.merge.p006g.b bVar, final boolean z, boolean z2) {
        TextView textView = new TextView(this.a);
        boolean z3 = (bVar.h() == null || bVar.h().isEmpty()) ? false : true;
        String strE = bVar.e();
        if (!z3) {
            strE = com.github.catvod.spider.merge.D.b.i(strE, " →");
        }
        textView.setText(strE);
        textView.setTextSize(14.0f);
        textView.setTextColor(this.Q);
        textView.setGravity(17);
        int i = this.J;
        textView.setPadding(i, i, i, i);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setMarqueeRepeatLimit(-1);
        textView.setFocusable(true);
        textView.setClickable(true);
        textView.setBackground(i());
        textView.setOnFocusChangeListener(new L(this, 0));
        if (z) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.setMargins(0, 0, z2 ? this.J : 0, this.G ? this.K : this.N);
            textView.setLayoutParams(layoutParams);
        } else {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, 0, 0, this.G ? this.K : this.N);
            textView.setLayoutParams(layoutParams2);
        }
        textView.setOnKeyListener(new View.OnKeyListener() { // from class: com.github.catvod.spider.merge.A.M
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                C0249d0 c0249d0R;
                ViewGroup viewGroup;
                int iIndexOfChild;
                ViewGroup viewGroup2;
                C0252e0 c0252e0 = this.a;
                c0252e0.getClass();
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                if (i2 == 23 || i2 == 66) {
                    view.performClick();
                } else {
                    boolean z4 = z;
                    if (i2 == 21) {
                        if (z4 && (viewGroup2 = (ViewGroup) view.getParent()) != null && viewGroup2.indexOfChild(view) > 0) {
                            return false;
                        }
                        int i3 = c0252e0.q;
                        if (i3 > 0) {
                            c0252e0.A(i3 - 1);
                            if (!c0252e0.p(c0252e0.q)) {
                                c0252e0.x(c0252e0.q);
                            }
                        }
                    } else if (i2 == 22) {
                        if (z4 && (viewGroup = (ViewGroup) view.getParent()) != null && (iIndexOfChild = viewGroup.indexOfChild(view) + 1) < viewGroup.getChildCount() && viewGroup.getChildAt(iIndexOfChild).isFocusable()) {
                            return false;
                        }
                        if (c0252e0.q < c0252e0.p.size() - 1) {
                            c0252e0.A(c0252e0.q + 1);
                            if (!c0252e0.p(c0252e0.q)) {
                                c0252e0.x(c0252e0.q);
                            }
                        }
                    } else {
                        if (i2 != 19 || (c0249d0R = c0252e0.r()) == null) {
                            return false;
                        }
                        if (z4) {
                            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                            if (viewGroup3 == null || c0249d0R.b.indexOfChild(viewGroup3) != 0) {
                                return false;
                            }
                        } else if (c0249d0R.b.indexOfChild(view) != 0) {
                            return false;
                        }
                        if (c0252e0.q >= c0252e0.o.size()) {
                            return false;
                        }
                        c0252e0.x(c0252e0.q);
                    }
                }
                return true;
            }
        });
        if (z3) {
            final int i2 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.catvod.spider.merge.A.N
                public final /* synthetic */ C0252e0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            C0252e0 c0252e0 = this.b;
                            C0274l1 c0274l1C = c0252e0.c();
                            if (c0274l1C != null) {
                                c0252e0.k();
                                InitOrigin.execute(new S(bVar, c0274l1C, 0));
                                break;
                            }
                            break;
                        default:
                            this.b.D(bVar, true);
                            break;
                    }
                }
            });
        } else {
            final int i3 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.github.catvod.spider.merge.A.N
                public final /* synthetic */ C0252e0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            C0252e0 c0252e0 = this.b;
                            C0274l1 c0274l1C = c0252e0.c();
                            if (c0274l1C != null) {
                                c0252e0.k();
                                InitOrigin.execute(new S(bVar, c0274l1C, 0));
                                break;
                            }
                            break;
                        default:
                            this.b.D(bVar, true);
                            break;
                    }
                }
            });
        }
        return textView;
    }

    public final StateListDrawable g(int i) {
        int iM = m(10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = iM;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(e0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable2);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    public final boolean h() {
        boolean z;
        int i;
        int i2;
        int i3 = 0;
        Activity activity = this.a;
        if (activity == null) {
            z = false;
        } else {
            try {
                if ((activity.getResources().getConfiguration().uiMode & 48) == 32) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Exception unused) {
            }
        }
        this.F = z;
        this.H = m(1);
        this.I = m(4);
        this.J = m(8);
        this.K = m(10);
        this.L = m(12);
        this.M = m(16);
        this.N = m(20);
        this.O = m(28);
        this.P = m(32);
        this.Q = Color.parseColor(this.F ? "#FFFFFF" : "#000000");
        this.R = Color.parseColor(this.F ? "#888888" : "#999999");
        this.S = Color.parseColor(this.F ? "#CCCCCC" : "#000000");
        this.T = Color.parseColor(this.F ? "#333333" : "#EEEEEE");
        this.U = Color.parseColor(this.F ? "#1D1B21" : "#F9F2FC");
        this.e = new Dialog(this.a, R.style.Theme.Translucent.NoTitleBar);
        int i4 = this.a.getResources().getDisplayMetrics().widthPixels;
        int i5 = this.a.getResources().getDisplayMetrics().heightPixels;
        this.G = i4 > i5;
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.f = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f.setBackgroundColor(0);
        this.f.setFocusable(false);
        this.f.setClickable(false);
        this.f.setOnTouchListener(new J(1, this));
        LinearLayout linearLayout = new LinearLayout(this.a);
        this.g = linearLayout;
        linearLayout.setOrientation(1);
        this.g.setDescendantFocusability(262144);
        this.g.setOnTouchListener(new View.OnTouchListener() { // from class: com.github.catvod.spider.merge.A.V
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                WeakReference weakReference = C0252e0.W;
                return true;
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.U);
        float f = this.G ? this.N : this.P;
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        this.g.setBackground(gradientDrawable);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 21) {
            this.g.setElevation(this.J);
        }
        if (this.G) {
            i2 = (int) (i4 * 0.7f);
            i = (int) (i5 * 0.6f);
        } else {
            i = (int) (i5 * 0.5f);
            i2 = -1;
        }
        this.C = m(200);
        this.D = i5;
        this.g.setLayoutParams(new FrameLayout.LayoutParams(i2, i, (this.G ? 1 : 0) | 80));
        View view = new View(this.a);
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
        view.setLayoutParams(new LinearLayout.LayoutParams(1, 1));
        this.g.addView(view);
        Activity activity2 = this.a;
        LinearLayout linearLayout2 = new LinearLayout(activity2);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        boolean z2 = this.G;
        linearLayout2.setPadding(0, z2 ? this.J : this.M, 0, z2 ? this.I : this.J);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View view2 = new View(activity2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.I);
        gradientDrawable2.setColor(Color.parseColor(this.F ? "#555555" : "#CCCCCC"));
        view2.setBackground(gradientDrawable2);
        view2.setLayoutParams(new LinearLayout.LayoutParams(m(40), this.I));
        linearLayout2.addView(view2);
        linearLayout2.setOnTouchListener(new J(0, this));
        this.g.addView(linearLayout2);
        Activity activity3 = this.a;
        LinearLayout linearLayout3 = new LinearLayout(activity3);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i7 = this.M;
        boolean z3 = this.G;
        layoutParams.setMargins(i7, z3 ? this.H : this.I, i7, z3 ? this.I : this.J);
        linearLayout3.setLayoutParams(layoutParams);
        final LinearLayout linearLayout4 = new LinearLayout(activity3);
        linearLayout4.setOrientation(0);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(this.O);
        gradientDrawable3.setColor(0);
        gradientDrawable3.setStroke(this.H, this.F ? -1 : -16777216);
        linearLayout4.setBackground(gradientDrawable3);
        int i8 = this.L;
        boolean z4 = this.G;
        linearLayout4.setPadding(i8, z4 ? this.J : i8, i8, z4 ? this.J : i8);
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout4.setFocusable(false);
        EditText editText = new EditText(activity3);
        this.u = editText;
        editText.setBackground(null);
        editText.setText(this.d);
        editText.setHint("关键字...");
        editText.setTextSize(14.0f);
        editText.setGravity(17);
        editText.setTextColor(this.Q);
        editText.setHintTextColor(Color.parseColor("#888888"));
        editText.setPadding(0, 0, 0, 0);
        editText.setSingleLine(true);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setImeOptions(3);
        editText.setInputType(1);
        if (i6 >= 21) {
            editText.setShowSoftInputOnFocus(false);
        }
        editText.setOnClickListener(new B(this, editText, i3));
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.github.catvod.spider.merge.A.C
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
                C0252e0 c0252e0 = this.a;
                c0252e0.getClass();
                if (i9 != 3 && i9 != 6) {
                    return false;
                }
                c0252e0.v();
                return true;
            }
        });
        editText.setOnKeyListener(new ViewOnKeyListenerC0307x(this, editText, 1));
        final int i9 = this.F ? -1 : -16777216;
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.github.catvod.spider.merge.A.D
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z5) {
                C0252e0 c0252e0 = this.a;
                c0252e0.getClass();
                if (view3.isInTouchMode()) {
                    return;
                }
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setCornerRadius(c0252e0.O);
                gradientDrawable4.setColor(0);
                gradientDrawable4.setStroke(z5 ? c0252e0.m(2) : c0252e0.H, z5 ? C0252e0.e0 : i9);
                linearLayout4.setBackground(gradientDrawable4);
            }
        });
        linearLayout4.addView(editText);
        LinearLayout linearLayout5 = new LinearLayout(activity3);
        linearLayout5.setOrientation(1);
        linearLayout5.setGravity(17);
        linearLayout5.setPadding(this.M, m(6), this.M, this.I);
        final TextView textView = new TextView(activity3);
        textView.setText("搜索");
        textView.setTextSize(14.0f);
        textView.setTextColor(this.Q);
        textView.setGravity(17);
        linearLayout5.addView(textView);
        final int color = Color.parseColor(this.F ? "#777777" : "#AAAAAA");
        final TextView textView2 = new TextView(activity3);
        textView2.setText("长按远程");
        textView2.setTextSize(9.0f);
        textView2.setTextColor(color);
        textView2.setGravity(17);
        textView2.setPadding(0, this.H, 0, 0);
        linearLayout5.addView(textView2);
        linearLayout5.setBackground(i());
        linearLayout5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.github.catvod.spider.merge.A.E
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z5) {
                C0252e0 c0252e0 = this.a;
                c0252e0.getClass();
                view3.setSelected(z5);
                textView.setTextColor(z5 ? -1 : c0252e0.Q);
                textView2.setTextColor(z5 ? -1426063361 : color);
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(this.K, 0, 0, 0);
        linearLayout5.setLayoutParams(layoutParams2);
        linearLayout5.setFocusable(true);
        linearLayout5.setClickable(true);
        this.v = linearLayout5;
        linearLayout5.setOnClickListener(new F(this, 0));
        linearLayout5.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.github.catvod.spider.merge.A.G
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) throws Throwable {
                final C0252e0 c0252e0 = this.a;
                EditText editText2 = c0252e0.u;
                String strValueOf = String.valueOf(System.currentTimeMillis());
                c0252e0.V = strValueOf;
                H0 h0 = H0.a;
                P p = new P(c0252e0, editText2, 0);
                h0.getClass();
                H0.f(strValueOf, p);
                String str = c0252e0.V;
                E0 e1 = new E0() { // from class: com.github.catvod.spider.merge.A.Q
                    @Override // com.github.catvod.spider.merge.A.E0
                    public final void a() {
                        C0252e0 c0252e1 = c0252e0;
                        c0252e1.i.post(new H(c0252e1, 5));
                    }
                };
                if (str != null) {
                    H0.d.put(str, e1);
                }
                com.github.catvod.spider.merge.p022z.P1.r1(Color.parseColor("#6366F1"), "弹幕搜索", c0252e0.V, "keyword", "关键词", "输入搜索关键词");
                return true;
            }
        });
        linearLayout5.setOnKeyListener(new ViewOnKeyListenerC0307x(this, new boolean[]{false}, 2));
        linearLayout3.addView(linearLayout4);
        linearLayout3.addView(linearLayout5);
        this.g.addView(linearLayout3);
        View view3 = new View(activity3);
        view3.setBackgroundColor(this.T);
        view3.setLayoutParams(new LinearLayout.LayoutParams(-1, this.H));
        this.g.addView(view3);
        Activity activity4 = this.a;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(activity4);
        this.k = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.k.setFocusable(false);
        this.k.setFocusableInTouchMode(false);
        this.k.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout6 = new LinearLayout(activity4);
        linearLayout6.setOrientation(1);
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        LinearLayout linearLayout7 = new LinearLayout(activity4);
        this.l = linearLayout7;
        linearLayout7.setOrientation(0);
        this.l.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        LinearLayout linearLayout8 = this.l;
        int i10 = this.M;
        linearLayout8.setPadding(i10, 0, i10, this.G ? this.I : this.J);
        this.n = new ProgressBar(activity4);
        int i11 = this.M;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i11, i11);
        layoutParams3.gravity = 16;
        layoutParams3.setMargins(0, 0, this.L, 0);
        this.n.setLayoutParams(layoutParams3);
        this.n.setVisibility(8);
        this.l.addView(this.n);
        View view4 = new View(activity4);
        this.m = view4;
        view4.setBackgroundColor(e0);
        this.m.setLayoutParams(new LinearLayout.LayoutParams(0, m(2)));
        this.m.setVisibility(4);
        linearLayout6.addView(this.l);
        linearLayout6.addView(this.m);
        this.k.addView(linearLayout6);
        this.g.addView(this.k);
        View view5 = new View(activity4);
        view5.setBackgroundColor(this.T);
        view5.setLayoutParams(new LinearLayout.LayoutParams(-1, this.H));
        this.g.addView(view5);
        FrameLayout frameLayout2 = new FrameLayout(this.a);
        this.r = frameLayout2;
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.g.addView(this.r);
        this.h = new ProgressBar(this.a);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(m(40), m(40));
        layoutParams4.gravity = 17;
        int i12 = this.N;
        layoutParams4.setMargins(0, i12, 0, i12);
        this.h.setLayoutParams(layoutParams4);
        this.g.addView(this.h);
        TextView textView3 = new TextView(this.a);
        this.w = textView3;
        textView3.setText("搜索中...");
        this.w.setTextSize(13.0f);
        this.w.setTextColor(this.R);
        this.w.setGravity(17);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(0, this.I, 0, 0);
        this.w.setLayoutParams(layoutParams5);
        this.g.addView(this.w);
        this.f.addView(this.g);
        this.g.setTranslationY(i5);
        this.e.setContentView(this.f);
        Window window = this.e.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setWindowAnimations(0);
            window.setBackgroundDrawableResource(R.color.transparent);
            window.clearFlags(2);
            window.setDimAmount(0.0f);
            window.setSoftInputMode((this.c ? 3 : 0) | 32);
            window.getDecorView().setSystemUiVisibility(this.a.getWindow().getDecorView().getSystemUiVisibility() | 256);
        }
        if (this.c) {
            synchronized (AbstractC0280n1.class) {
                try {
                    if (this.b.a() && C0304w.x().A() == this.a && com.github.catvod.spider.merge.p000a.I.p().g(this.b)) {
                        this.e.show();
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.e.show();
        this.e.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.github.catvod.spider.merge.A.X
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i13, KeyEvent keyEvent) {
                C0252e0 c0252e0 = this.a;
                c0252e0.getClass();
                if (i13 == 4 && keyEvent.getAction() == 1) {
                    C0249d0 c0249d0R = c0252e0.r();
                    if (c0249d0R == null || c0249d0R.c != 1) {
                        c0252e0.k();
                        return true;
                    }
                    c0252e0.t();
                    return true;
                }
                if (keyEvent.getAction() == 0) {
                    if (i13 == 19) {
                        return c0252e0.d(33, false);
                    }
                    if (i13 == 20) {
                        return c0252e0.d(130, false);
                    }
                    if (i13 == 21) {
                        return c0252e0.d(17, true);
                    }
                    if (i13 == 22) {
                        return c0252e0.d(66, true);
                    }
                }
                return false;
            }
        });
        this.E = true;
        this.g.post(new H(this, 6));
        return true;
    }

    public final StateListDrawable i() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.O);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(this.H, this.S);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.O);
        gradientDrawable2.setColor(e0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable2);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public final C0249d0 j() {
        final C0249d0 c0249d0 = new C0249d0();
        Activity activity = this.a;
        ScrollView scrollView = new ScrollView(activity);
        c0249d0.a = scrollView;
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c0249d0.a.setVerticalScrollBarEnabled(true);
        c0249d0.a.setDescendantFocusability(262144);
        c0249d0.a.setFocusable(false);
        c0249d0.a.setFocusableInTouchMode(false);
        LinearLayout linearLayout = new LinearLayout(activity);
        c0249d0.b = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = c0249d0.b;
        int i = this.L;
        boolean z = this.G;
        linearLayout2.setPadding(i, z ? this.J : i, i, z ? this.J : i);
        c0249d0.b.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        c0249d0.a.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: com.github.catvod.spider.merge.A.I
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                C0249d0 c0249d1;
                ScrollView scrollView2;
                C0252e0 c0252e0 = this.a;
                c0252e0.getClass();
                if (view2 == null || (scrollView2 = (c0249d1 = c0249d0).a) == null) {
                    return;
                }
                for (View view3 = view2; view3 != null; view3 = (View) view3.getParent()) {
                    if (view3 == scrollView2) {
                        view2.post(new r(c0252e0, c0249d1, view2, 4));
                        return;
                    } else {
                        if (!(view3.getParent() instanceof View)) {
                            return;
                        }
                    }
                }
            }
        });
        c0249d0.a.setOnTouchListener(new J(2, new GestureDetector(activity, new Z(this))));
        c0249d0.a.addView(c0249d0.b);
        c0249d0.a.setVisibility(8);
        this.r.addView(c0249d0.a);
        return c0249d0;
    }

    public final void k() {
        Dialog dialog;
        LinearLayout linearLayout;
        if (this.x || (dialog = this.e) == null || !dialog.isShowing()) {
            return;
        }
        this.x = true;
        if (this.E && (linearLayout = this.g) != null) {
            linearLayout.animate().cancel();
            this.E = false;
        }
        Activity activity = this.a;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            l();
            return;
        }
        LinearLayout linearLayout2 = this.g;
        if (linearLayout2 == null) {
            l();
            return;
        }
        try {
            linearLayout2.animate().translationY(this.g.getHeight()).setDuration(300L).setInterpolator(new AccelerateInterpolator()).withEndAction(new H(this, 0)).start();
        } catch (Exception e) {
            SpiderDebug.log("[弹幕搜索] 关闭动画异常: " + e.getMessage());
            l();
        }
    }

    public final void l() {
        if (W.get() == this) {
            W.clear();
        }
        this.y = true;
        this.z = false;
        this.i.removeCallbacksAndMessages(null);
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.j = null;
        }
        try {
            Dialog dialog = this.e;
            if (dialog != null && dialog.isShowing()) {
                this.e.dismiss();
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[弹幕搜索] 关闭对话框异常: "));
        }
        this.e = null;
        this.g = null;
        this.f = null;
        this.r = null;
        this.u = null;
        this.v = null;
        this.l = null;
        this.k = null;
        this.m = null;
        this.o.clear();
        String str = this.V;
        if (str != null) {
            H0.a.getClass();
            H0.k(str);
            this.V = null;
        }
    }

    public final int m(int i) {
        Activity activity = this.a;
        if (activity == null) {
            return i;
        }
        try {
            return (int) (i * activity.getResources().getDisplayMetrics().density);
        } catch (Exception unused) {
            return i;
        }
    }

    public final void n(int i, C0249d0 c0249d0) {
        int iMax;
        LinearLayout linearLayout = c0249d0.b;
        View viewFindFocus = linearLayout.findFocus();
        if (viewFindFocus != null) {
            viewFindFocus.clearFocus();
        }
        linearLayout.removeAllViews();
        c0249d0.c = 0;
        LinearLayout linearLayout2 = null;
        c0249d0.d = null;
        c0249d0.e = false;
        ArrayList arrayList = this.p;
        if (i >= arrayList.size()) {
            return;
        }
        List<com.github.catvod.spider.merge.p006g.b> list = (List) this.t.get((String) arrayList.get(i));
        Activity activity = this.a;
        if (list == null || list.isEmpty()) {
            TextView textView = new TextView(activity);
            textView.setText("未找到弹幕");
            textView.setTextSize(14.0f);
            textView.setTextColor(Color.parseColor("#999999"));
            textView.setGravity(17);
            textView.setPadding(0, m(40), 0, m(40));
            linearLayout.addView(textView);
            AbstractC0583w0.o(c0249d0.a, linearLayout);
            return;
        }
        s(i);
        int i2 = this.L * 2;
        int i3 = this.J;
        int width = c0249d0.a.getWidth();
        if (width <= 0) {
            width = c0249d0.b.getWidth();
        }
        int i4 = width - i2;
        if (i4 <= 0 || list.size() <= 1) {
            iMax = 1;
        } else {
            TextView textView2 = new TextView(activity);
            textView2.setTextSize(14.0f);
            float fMax = 0.0f;
            for (com.github.catvod.spider.merge.p006g.b bVar : list) {
                String strE = bVar.e();
                if (bVar.h() == null || bVar.h().isEmpty()) {
                    strE = com.github.catvod.spider.merge.D.b.i(strE, " →");
                }
                fMax = Math.max(fMax, textView2.getPaint().measureText(strE) + (this.J * 2));
            }
            iMax = Math.max(1, (i4 + i3) / (Math.max(((int) fMax) + this.M, m(120)) + i3));
        }
        if (iMax > 1) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                int i6 = i5 % iMax;
                if (i6 == 0) {
                    linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    linearLayout.addView(linearLayout2);
                }
                linearLayout2.addView(f((com.github.catvod.spider.merge.p006g.b) list.get(i5), true, i6 < iMax + (-1)));
            }
            int size = list.size() % iMax;
            if (size > 0 && linearLayout2 != null) {
                int i7 = 0;
                while (true) {
                    int i8 = iMax - size;
                    if (i7 >= i8) {
                        break;
                    }
                    View view = new View(activity);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0, 1.0f);
                    layoutParams.setMargins(0, 0, i7 < i8 + (-1) ? this.J : 0, 0);
                    view.setLayoutParams(layoutParams);
                    linearLayout2.addView(view);
                    i7++;
                }
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linearLayout.addView(f((com.github.catvod.spider.merge.p006g.b) it.next(), false, false));
            }
        }
        AbstractC0583w0.o(c0249d0.a, linearLayout);
    }

    public final boolean p(int i) {
        LinearLayout linearLayout;
        View viewO;
        if (i >= 0) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size() || (linearLayout = ((C0249d0) arrayList.get(i)).b) == null || linearLayout.getChildCount() == 0 || linearLayout.isInTouchMode()) {
                return false;
            }
            for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
                View childAt = linearLayout.getChildAt(i2);
                if ((childAt instanceof TextView) && childAt.isFocusable()) {
                    childAt.requestFocus();
                    return true;
                }
                if ((childAt instanceof LinearLayout) && (viewO = o((LinearLayout) childAt)) != null) {
                    viewO.requestFocus();
                    return true;
                }
            }
        }
        return false;
    }

    public final C0249d0 r() {
        int i = this.q;
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.s;
        if (i < arrayList.size()) {
            return (C0249d0) arrayList.get(this.q);
        }
        return null;
    }

    public final String s(int i) {
        if (i < 0) {
            return "#2196F3";
        }
        ArrayList arrayList = this.p;
        if (i >= arrayList.size()) {
            return "#2196F3";
        }
        String str = (String) com.github.catvod.spider.merge.p006g.b.i.get(com.github.catvod.spider.merge.p006g.b.a((String) arrayList.get(i)));
        return str != null ? str : "#2196F3";
    }

    public final void t() {
        C0249d0 c0249d0R = r();
        if (c0249d0R == null || c0249d0R.c != 1) {
            return;
        }
        b0 = 0;
        d0 = null;
        n(this.q, c0249d0R);
        c0249d0R.a.scrollTo(0, 0);
        if (p(this.q)) {
            return;
        }
        x(this.q);
    }

    public final boolean u() {
        ArrayList arrayList = this.o;
        if (!arrayList.isEmpty() && this.k.getVisibility() == 0 && this.q < arrayList.size()) {
            return x(this.q);
        }
        C0249d0 c0249d0R = r();
        if (c0249d0R == null || c0249d0R.b.getChildCount() <= 0) {
            return false;
        }
        return p(this.q);
    }

    public final void v() {
        int i = 3;
        if (this.u == null || this.z) {
            return;
        }
        String strE = AbstractC0449a.e(this.u);
        if (strE.isEmpty()) {
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.u.getWindowToken(), 0);
            }
        } catch (Exception unused) {
        }
        this.d = strE;
        this.z = true;
        this.h.setVisibility(0);
        TextView textView = this.w;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (this.k.getVisibility() == 0) {
            this.k.animate().alpha(0.0f).setDuration(150L).withEndAction(new H(this, 3)).start();
            this.r.animate().alpha(0.0f).setDuration(150L).withEndAction(new H(this, 4)).start();
        } else {
            this.k.setVisibility(8);
            this.r.setVisibility(8);
        }
        this.t = new LinkedHashMap();
        this.p.clear();
        this.l.removeAllViews();
        this.l.addView(this.n);
        this.n.setVisibility(8);
        this.o.clear();
        this.s.clear();
        this.r.removeAllViews();
        this.q = 0;
        w();
        InitOrigin.execute(new r(this, strE, new boolean[]{true}, i));
    }

    public final void w() {
        LinearLayout linearLayout = this.v;
        if (linearLayout == null || linearLayout.isInTouchMode()) {
            return;
        }
        linearLayout.post(new RunnableC0242b(this, linearLayout, 2));
    }

    public final boolean x(int i) {
        TextView textView;
        if (i >= 0) {
            ArrayList arrayList = this.o;
            if (i < arrayList.size() && (textView = (TextView) arrayList.get(i)) != null && !textView.isInTouchMode()) {
                textView.requestFocus();
                return true;
            }
        }
        return false;
    }

    public final void y() {
        com.github.catvod.spider.merge.p006g.b bVar;
        this.t = Z;
        ArrayList arrayList = this.p;
        arrayList.clear();
        arrayList.addAll(this.t.keySet());
        this.l.removeAllViews();
        ArrayList arrayList2 = this.o;
        arrayList2.clear();
        ArrayList arrayList3 = this.s;
        arrayList3.clear();
        this.r.removeAllViews();
        int iMin = Math.min(c0, arrayList.size() - 1);
        this.q = iMin;
        if (iMin < 0) {
            this.q = 0;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            b(i, (String) arrayList.get(i));
            C0249d0 c0249d0J = j();
            arrayList3.add(c0249d0J);
            n(i, c0249d0J);
        }
        this.k.setVisibility(0);
        this.r.setVisibility(0);
        if (this.q < arrayList3.size()) {
            ((C0249d0) arrayList3.get(this.q)).a.setVisibility(0);
        }
        F();
        if (this.q < arrayList2.size()) {
            ((TextView) arrayList2.get(this.q)).post(new H(this, 7));
        }
        z(this.q);
        if (b0 != 1 || (bVar = d0) == null) {
            return;
        }
        D(bVar, false);
    }

    public final void z(int i) {
        ArrayList arrayList = this.o;
        if (i >= arrayList.size()) {
            return;
        }
        TextView textView = (TextView) arrayList.get(i);
        this.k.smoothScrollTo(Math.max(0, textView.getLeft() - ((this.k.getWidth() - textView.getWidth()) / 2)), 0);
    }
}

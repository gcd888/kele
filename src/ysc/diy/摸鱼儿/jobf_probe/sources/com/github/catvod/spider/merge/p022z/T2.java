package com.github.catvod.spider.merge.p022z;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.A.B;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class T2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ List g;
    public final /* synthetic */ Object h;

    public /* synthetic */ T2(int i, Runnable runnable, String str, String str2, String str3, ArrayList arrayList, boolean z) {
        this.a = 0;
        this.b = str;
        this.c = str2;
        this.e = z;
        this.d = i;
        this.g = arrayList;
        this.h = runnable;
        this.f = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                String str2 = this.b;
                String str3 = this.c;
                Runnable runnable = (Runnable) this.h;
                try {
                    Activity activityD0 = P1.D0();
                    if (activityD0 != null) {
                        int iQ = AbstractC0583w0.Q(8, activityD0);
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activityD0);
                        AlertDialog[] alertDialogArr = new AlertDialog[1];
                        boolean z = this.e;
                        LinearLayout linearLayoutO = AbstractC0583w0.O(activityD0, str2, str3, z ? "已登录" : "未登录", z ? AbstractC0583w0.d : this.d);
                        linearLayoutO.setLayoutParams(AbstractC0583w0.c0(iQ));
                        linearLayoutK.addView(linearLayoutO);
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activityD0);
                        linearLayoutY.setDescendantFocusability(262144);
                        List list = this.g;
                        if (list != null) {
                            int i = 0;
                            while (i < list.size()) {
                                C0477a3 c0477a3 = (C0477a3) list.get(i);
                                if (c0477a3 != null) {
                                    AbstractC0583w0.d(linearLayoutY, c0477a3.a, c0477a3.b, c0477a3.c, i > 0).setOnClickListener(new B(alertDialogArr, c0477a3, 5));
                                }
                                i++;
                            }
                        }
                        linearLayoutK.addView(linearLayoutY);
                        AlertDialog.Builder onCancelListener = new AlertDialog.Builder(activityD0).setView(AbstractC0583w0.q0(linearLayoutK)).setNegativeButton("取消", new E(runnable, 8)).setOnCancelListener(new C0(runnable, 2));
                        String str4 = this.f;
                        if (str4 != null) {
                            onCancelListener.setNeutralButton("禁用", new R2(str4, runnable, 1));
                        }
                        AlertDialog alertDialogCreate = onCancelListener.create();
                        AbstractC0583w0.k0(alertDialogCreate, 0.0f);
                        alertDialogArr[0] = alertDialogCreate;
                    }
                } catch (Exception e) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    b.x(e, new StringBuilder("显示失败: "));
                    return;
                }
                break;
            case 1:
                String str5 = this.b;
                int i2 = this.d;
                boolean z2 = this.e;
                String str6 = this.f;
                String str7 = (String) this.h;
                try {
                    Activity activityD1 = P1.D0();
                    if (activityD1 != null) {
                        C0502f3 c0502f3 = new C0502f3(activityD1);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str5);
                        String str8 = this.c;
                        sb.append((str8 == null || str8.isEmpty()) ? "" : " · ".concat(str8));
                        c0502f3.b = sb.toString();
                        c0502f3.d = i2;
                        c0502f3.e = z2;
                        c0502f3.c = str6;
                        c0502f3.f = str7;
                        List<C0517i3> list2 = this.g;
                        if (list2 != null) {
                            for (C0517i3 c0517i3 : list2) {
                                if (c0517i3 != null && (str = c0517i3.a) != null && !str.isEmpty()) {
                                    c0502f3.i.add(c0517i3);
                                }
                            }
                        }
                        c0502f3.a();
                    }
                } catch (Exception unused) {
                    X0.a("显示账号详情失败");
                    return;
                }
                break;
            default:
                final C0512h3 c0512h3 = (C0512h3) this.h;
                LinearLayout linearLayout = c0512h3.g;
                linearLayout.removeAllViews();
                Context context = c0512h3.b;
                int iQ2 = AbstractC0583w0.Q(4, context);
                int iQ3 = AbstractC0583w0.Q(8, context);
                int iQ4 = AbstractC0583w0.Q(10, context);
                int iQ5 = AbstractC0583w0.Q(12, context);
                if (this.e) {
                    List list3 = this.g;
                    if (list3 != null && !list3.isEmpty()) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.bottomMargin = iQ4;
                        linearLayout.addView(P1.b(context, list3, iQ2, iQ3, iQ5), layoutParams);
                        String str9 = this.c;
                        if (str9 != null && !str9.isEmpty()) {
                            String str10 = this.f;
                            if (str10 == null) {
                                str10 = "Cookie";
                            }
                            linearLayout.addView(P1.c(c0512h3.b, c0512h3.c, str9, str10, iQ2, iQ3));
                        }
                    }
                } else {
                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(context);
                    linearLayoutY2.setGravity(17);
                    TextView textView = new TextView(context);
                    textView.setText("未登录");
                    textView.setTextSize(15.0f);
                    textView.setTextColor(AbstractC0583w0.e);
                    textView.getPaint().setFakeBoldText(true);
                    textView.setGravity(17);
                    linearLayoutY2.addView(textView);
                    String str11 = this.b;
                    if (str11 != null && !str11.isEmpty()) {
                        TextView textView2 = new TextView(context);
                        textView2.setText(str11);
                        textView2.setTextSize(12.0f);
                        textView2.setTextColor(AbstractC0583w0.i);
                        textView2.setGravity(17);
                        textView2.setPadding(0, iQ2, 0, 0);
                        linearLayoutY2.addView(textView2);
                    }
                    linearLayout.addView(linearLayoutY2);
                }
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = linearLayout.getMeasuredHeight();
                int i3 = this.d;
                if (i3 <= 0 || measuredHeight == i3) {
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                    AbstractC0583w0.o(c0512h3.e, c0512h3.f);
                    AbstractC0583w0.f0(c0512h3.a);
                } else {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i3, measuredHeight);
                    valueAnimatorOfInt.setDuration(200L);
                    valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.github.catvod.spider.merge.z.g3
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout linearLayout2 = c0512h3.g;
                            ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
                            layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            linearLayout2.setLayoutParams(layoutParams2);
                        }
                    });
                    valueAnimatorOfInt.addListener(new C0539n0(2, c0512h3));
                    valueAnimatorOfInt.start();
                }
                break;
        }
    }

    public /* synthetic */ T2(C0512h3 c0512h3, boolean z, String str, List list, String str2, String str3, int i) {
        this.a = 2;
        this.h = c0512h3;
        this.e = z;
        this.b = str;
        this.g = list;
        this.c = str2;
        this.f = str3;
        this.d = i;
    }

    public /* synthetic */ T2(String str, String str2, ArrayList arrayList) {
        this.a = 1;
        this.b = "蜗牛账号信息";
        this.c = str;
        this.d = -16735786;
        this.e = true;
        this.f = str2;
        this.h = "请先登录账号";
        this.g = arrayList;
    }
}

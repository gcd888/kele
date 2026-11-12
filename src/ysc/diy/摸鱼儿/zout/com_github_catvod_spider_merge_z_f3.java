package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0502f3 {
    public final Context a;
    public String b;
    public String c;
    public int d = AbstractC0583w0.c;
    public boolean e = false;
    public String f = "请先登录账号";
    public String g = null;
    public String h = "Cookie";
    public final ArrayList i = new ArrayList();

    public C0502f3(Activity activity) {
        this.a = activity;
    }

    public final C0512h3 a() {
        String str;
        Context context = this.a;
        int iQ = AbstractC0583w0.Q(4, context);
        int iQ2 = AbstractC0583w0.Q(8, context);
        int iQ3 = AbstractC0583w0.Q(10, context);
        int iQ4 = AbstractC0583w0.Q(12, context);
        LinearLayout linearLayoutK = AbstractC0583w0.K(context);
        if (this.e) {
            str = this.c;
            if (str == null) {
                str = "已登录";
            }
        } else {
            str = "未登录";
        }
        TextView[] textViewArr = {null};
        String str2 = this.b;
        int i = this.d;
        int iQ5 = AbstractC0583w0.Q(4, context);
        int iQ6 = AbstractC0583w0.Q(10, context);
        int iQ7 = AbstractC0583w0.Q(12, context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(iQ7, iQ6, iQ7, iQ6);
        linearLayout.setGravity(16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AbstractC0583w0.Q(10, context));
        gradientDrawable.setColor(AbstractC0583w0.b);
        linearLayout.setBackground(gradientDrawable);
        View view = new View(context);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(iQ5);
        gradientDrawable2.setColor(i);
        view.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iQ5, AbstractC0583w0.Q(32, context));
        layoutParams.rightMargin = iQ7;
        view.setLayoutParams(layoutParams);
        linearLayout.addView(view);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(context);
        textView.setText(str2);
        textView.setTextSize(16.0f);
        textView.setTextColor(AbstractC0583w0.g);
        textView.getPaint().setFakeBoldText(true);
        linearLayout2.addView(textView);
        if (!str.isEmpty()) {
            TextView textView2 = new TextView(context);
            textView2.setText(str);
            textView2.setTextSize(12.0f);
            textView2.setTextColor(AbstractC0583w0.i);
            textView2.setPadding(0, iQ5, 0, 0);
            linearLayout2.addView(textView2);
            textViewArr[0] = textView2;
        }
        linearLayout.addView(linearLayout2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = iQ2;
        linearLayoutK.addView(linearLayout, layoutParams2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        if (this.e) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                LinearLayout linearLayoutY = AbstractC0583w0.y(context);
                linearLayoutY.setGravity(17);
                TextView textView3 = new TextView(context);
                textView3.setText("正在获取账号信息...");
                textView3.setTextSize(13.0f);
                textView3.setTextColor(AbstractC0583w0.i);
                textView3.setGravity(17);
                textView3.setPadding(0, iQ2, 0, iQ2);
                linearLayoutY.addView(textView3);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.bottomMargin = iQ3;
                linearLayout3.addView(linearLayoutY, layoutParams3);
            } else {
                View viewB = P1.b(this.a, arrayList, iQ, iQ2, iQ4);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.bottomMargin = iQ3;
                linearLayout3.addView(viewB, layoutParams4);
                String str3 = this.g;
                if (str3 != null && !str3.isEmpty()) {
                    linearLayout3.addView(P1.c(this.a, this.d, this.g, this.h, iQ, iQ2));
                }
            }
        } else {
            LinearLayout linearLayoutY2 = AbstractC0583w0.y(context);
            linearLayoutY2.setGravity(17);
            TextView textView4 = new TextView(context);
            textView4.setText("未登录");
            textView4.setTextSize(15.0f);
            textView4.setTextColor(AbstractC0583w0.e);
            textView4.getPaint().setFakeBoldText(true);
            textView4.setGravity(17);
            linearLayoutY2.addView(textView4);
            TextView textView5 = new TextView(context);
            textView5.setText(this.f);
            textView5.setTextSize(12.0f);
            textView5.setTextColor(AbstractC0583w0.i);
            textView5.setGravity(17);
            textView5.setPadding(0, iQ, 0, 0);
            linearLayoutY2.addView(textView5);
            linearLayout3.addView(linearLayoutY2);
        }
        linearLayoutK.addView(linearLayout3);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setFocusable(false);
        scrollView.setFocusableInTouchMode(false);
        scrollView.setDescendantFocusability(262144);
        linearLayoutK.setDescendantFocusability(262144);
        scrollView.setVerticalScrollBarEnabled(true);
        scrollView.addView(linearLayoutK);
        AbstractC0583w0.o(scrollView, linearLayoutK);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setView(scrollView).setPositiveButton("确定", (DialogInterface.OnClickListener) null).create();
        AbstractC0583w0.j0(alertDialogCreate);
        return new C0512h3(alertDialogCreate, this.a, this.d, textViewArr[0], scrollView, linearLayoutK, linearLayout3);
    }
}

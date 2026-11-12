package com.github.catvod.spider.merge.p022z;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class S1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ S1(Bitmap bitmap, String str, String str2, String str3, String str4, String str5, int i, ArrayList arrayList, String str6) {
        this.c = bitmap;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.b = i;
        this.i = arrayList;
        this.j = str6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        int[] iArr;
        Object obj3;
        Object obj4 = this.j;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.d;
        Object obj8 = this.e;
        Object obj9 = this.i;
        Object obj10 = this.f;
        Object obj11 = this.c;
        int i = 1;
        switch (this.a) {
            case 0:
                int[] iArr2 = (int[]) obj7;
                char c = 0;
                T1 t1 = (T1) ((ArrayList) ((C0523k) obj11).c).get(iArr2[0]);
                LinearLayout linearLayout = (LinearLayout) obj10;
                linearLayout.removeAllViews();
                if (!TextUtils.isEmpty(t1.a)) {
                    AbstractC0583w0.h(linearLayout, t1.a);
                }
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = t1.b;
                    if (i2 >= arrayList.size()) {
                        Object obj12 = obj4;
                        Object obj13 = obj5;
                        Object obj14 = obj6;
                        int[] iArr3 = iArr2;
                        Object obj15 = obj9;
                        int i3 = this.b;
                        TextView textView = (TextView) obj13;
                        textView.setText(i3 > 1 ? (iArr3[0] + 1) + " / " + i3 : "");
                        textView.setVisibility(i3 > 1 ? 0 : 8);
                        AlertDialog alertDialog = (AlertDialog) obj15;
                        P1.d(alertDialog.getButton(-3), i3 > 1, iArr3[0] > 0);
                        P1.d(alertDialog.getButton(-2), i3 > 1, iArr3[0] < i3 - 1);
                        ScrollView scrollView = (ScrollView) obj12;
                        scrollView.scrollTo(0, 0);
                        AbstractC0583w0.o(scrollView, (LinearLayout) obj14);
                        AbstractC0583w0.f0(alertDialog);
                        View button = alertDialog.getButton(-1);
                        if (AbstractC0583w0.h0(linearLayout.getContext())) {
                            ArrayList<View> focusables = linearLayout.getFocusables(130);
                            if (!focusables.isEmpty()) {
                                button = focusables.get(0);
                            }
                            AbstractC0583w0.g0(button);
                            break;
                        }
                    } else {
                        Object[] objArr = (Object[]) arrayList.get(i2);
                        if (((Integer) objArr[c]).intValue() == i) {
                            int i4 = i2;
                            while (i4 < arrayList.size() && ((Integer) ((Object[]) arrayList.get(i4))[c]).intValue() == i) {
                                i4 += i;
                            }
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(AbstractC0583w0.b);
                            Context context = (Context) obj8;
                            gradientDrawable.setCornerRadius(AbstractC0583w0.Q(8, context));
                            gradientDrawable.setStroke(AbstractC0583w0.Q(i, context), AbstractC0583w0.j);
                            LinearLayout linearLayout2 = new LinearLayout(context);
                            linearLayout2.setOrientation(1);
                            linearLayout2.setBackground(gradientDrawable);
                            linearLayout2.setPadding(AbstractC0583w0.Q(1, context), AbstractC0583w0.Q(1, context), AbstractC0583w0.Q(1, context), AbstractC0583w0.Q(1, context));
                            boolean zH0 = AbstractC0583w0.h0(context);
                            int i5 = i2;
                            while (i5 < i4) {
                                if (i5 > i2) {
                                    View view = new View(context);
                                    view.setBackgroundColor(AbstractC0583w0.j);
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC0583w0.Q(1, context));
                                    layoutParams.setMargins(AbstractC0583w0.Q(12, context), 0, AbstractC0583w0.Q(12, context), 0);
                                    linearLayout2.addView(view, layoutParams);
                                }
                                Object[] objArr2 = (Object[]) arrayList.get(i5);
                                TextView textView2 = new TextView(context);
                                textView2.setText((String) objArr2[1]);
                                textView2.setTextSize(zH0 ? 14.0f : 13.0f);
                                int i6 = AbstractC0583w0.c;
                                textView2.setTextColor(i6);
                                textView2.setGravity(17);
                                textView2.setMinimumHeight(AbstractC0583w0.Q(44, context));
                                textView2.setPadding(AbstractC0583w0.Q(12, context), AbstractC0583w0.Q(6, context), AbstractC0583w0.Q(12, context), AbstractC0583w0.Q(6, context));
                                textView2.setClickable(true);
                                textView2.setFocusable(zH0);
                                textView2.setFocusableInTouchMode(zH0);
                                textView2.setBackground(AbstractC0583w0.G(context, 0, AbstractC0583w0.k, 6, 0, i6));
                                textView2.setOnClickListener(new N((Activity) context, (String) objArr2[2], 1));
                                linearLayout2.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
                                i5++;
                                arrayList = arrayList;
                                obj4 = obj4;
                                obj9 = obj9;
                                obj5 = obj5;
                                iArr2 = iArr2;
                            }
                            obj = obj4;
                            obj2 = obj5;
                            iArr = iArr2;
                            obj3 = obj9;
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams2.setMargins(0, AbstractC0583w0.Q(6, context), 0, AbstractC0583w0.Q(2, context));
                            linearLayout.addView(linearLayout2, layoutParams2);
                            i2 = i4 - 1;
                        } else {
                            obj = obj4;
                            obj2 = obj5;
                            iArr = iArr2;
                            obj3 = obj9;
                            String str = (String) objArr[1];
                            String str2 = (String) objArr[2];
                            boolean z = i2 > 0;
                            int i7 = AbstractC0583w0.a;
                            Context context2 = linearLayout.getContext();
                            int iQ = AbstractC0583w0.Q(4, context2);
                            int iQ2 = AbstractC0583w0.Q(6, context2);
                            boolean zH1 = AbstractC0583w0.h0(context2);
                            if (z) {
                                linearLayout.addView(AbstractC0583w0.C(context2));
                            }
                            LinearLayout linearLayout3 = new LinearLayout(context2);
                            linearLayout3.setOrientation(1);
                            int iQ3 = zH1 ? AbstractC0583w0.Q(8, context2) : AbstractC0583w0.Q(2, context2);
                            linearLayout3.setPadding(iQ3, iQ2, iQ3, iQ2);
                            linearLayout3.setFocusable(zH1);
                            linearLayout3.setFocusableInTouchMode(zH1);
                            if (zH1) {
                                GradientDrawable gradientDrawable2 = new GradientDrawable();
                                gradientDrawable2.setCornerRadius(AbstractC0583w0.Q(8, context2));
                                gradientDrawable2.setColor(AbstractC0583w0.b);
                                GradientDrawable gradientDrawable3 = new GradientDrawable();
                                gradientDrawable3.setCornerRadius(AbstractC0583w0.Q(8, context2));
                                gradientDrawable3.setColor(AbstractC0583w0.k);
                                gradientDrawable3.setStroke(AbstractC0583w0.Q(2, context2), AbstractC0583w0.c);
                                StateListDrawable stateListDrawable = new StateListDrawable();
                                stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable3);
                                stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable3);
                                stateListDrawable.addState(new int[0], gradientDrawable2);
                                linearLayout3.setBackground(stateListDrawable);
                            }
                            TextView textView3 = new TextView(context2);
                            textView3.setText(str);
                            textView3.setTextSize(zH1 ? 16.0f : 13.0f);
                            textView3.setTextColor(AbstractC0583w0.g);
                            textView3.setTypeface(null, 1);
                            linearLayout3.addView(textView3);
                            TextView textView4 = new TextView(context2);
                            textView4.setText(str2);
                            textView4.setTextSize(zH1 ? 15.0f : 12.0f);
                            textView4.setTextColor(AbstractC0583w0.h);
                            textView4.setPadding(0, iQ, 0, 0);
                            textView4.setLineSpacing(AbstractC0583w0.Q(2, context2), 1.0f);
                            linearLayout3.addView(textView4);
                            linearLayout.addView(linearLayout3);
                        }
                        i2++;
                        obj8 = obj8;
                        t1 = t1;
                        obj6 = obj6;
                        obj4 = obj;
                        obj9 = obj3;
                        obj5 = obj2;
                        iArr2 = iArr;
                        i = 1;
                        c = 0;
                    }
                }
                break;
            default:
                Bitmap bitmap = (Bitmap) obj11;
                String str3 = (String) obj10;
                if (bitmap == null) {
                    SpiderDebug.log("[WallpaperDialog] 图片加载失败 largeUrl=" + ((String) obj4) + " thumbUrl=" + str3);
                    InitOrigin.run(new e4(5));
                } else {
                    InitOrigin.run(new I3(bitmap, (String) obj8, str3, (String) obj7, (String) obj6, (String) obj5, (ArrayList) ((List) obj9), this.b));
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ S1(C0523k c0523k, int[] iArr, Activity activity, LinearLayout linearLayout, TextView textView, int i, AlertDialog alertDialog, C0533m c0533m, LinearLayout linearLayout2) {
        this.c = c0523k;
        this.d = iArr;
        this.e = activity;
        this.f = linearLayout;
        this.h = textView;
        this.b = i;
        this.i = alertDialog;
        this.j = c0533m;
        this.g = linearLayout2;
    }
}

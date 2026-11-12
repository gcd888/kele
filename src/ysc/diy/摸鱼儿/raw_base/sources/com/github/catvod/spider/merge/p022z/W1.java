package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.p017u.E;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class W1 {
    public static final int[] a = {AbstractC0583w0.d, AbstractC0583w0.c, -15610385, AbstractC0583w0.f, AbstractC0583w0.e};

    public static void a(LinearLayout linearLayout, Activity activity, String str, boolean z, int i, Map map, Map map2, AlertDialog[] alertDialogArr, E e) {
        int[] iArr = a;
        int i2 = iArr[i % iArr.length];
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(12, activity));
        linearLayout2.setClickable(true);
        AbstractC0583w0.n(linearLayout2, i2);
        TextView textView = new TextView(activity);
        textView.setText(String.valueOf(i + 1));
        textView.setTextSize(11.0f);
        textView.setTextColor(-1);
        textView.setTypeface(null, 1);
        textView.setGravity(17);
        textView.setMinWidth(AbstractC0583w0.Q(22, activity));
        textView.setPadding(AbstractC0583w0.Q(5, activity), AbstractC0583w0.Q(3, activity), AbstractC0583w0.Q(5, activity), AbstractC0583w0.Q(3, activity));
        textView.setBackground(AbstractC0583w0.L(activity, i2, 11));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = AbstractC0583w0.Q(12, activity);
        textView.setLayoutParams(layoutParams);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setText(str.replace("https://", "").replace("http://", ""));
        textView2.setTextSize(13.0f);
        textView2.setTextColor(z ? AbstractC0583w0.c : AbstractC0583w0.g);
        textView2.setTypeface(null, z ? 1 : 0);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout2.addView(textView2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView3 = new TextView(activity);
        textView3.setTextSize(12.0f);
        textView3.setPadding(AbstractC0583w0.Q(8, activity), 0, AbstractC0583w0.Q(8, activity), 0);
        textView3.setVisibility(8);
        Long l = (Long) map.get(str);
        if (l != null) {
            b(textView3, l.longValue());
            textView3.setVisibility(0);
        }
        linearLayout2.addView(textView3);
        map2.put(str, textView3);
        if (z) {
            TextView textView4 = new TextView(activity);
            textView4.setText("当前");
            textView4.setTextSize(11.0f);
            textView4.setTextColor(-1);
            textView4.setPadding(AbstractC0583w0.Q(6, activity), AbstractC0583w0.Q(2, activity), AbstractC0583w0.Q(6, activity), AbstractC0583w0.Q(2, activity));
            textView4.setBackground(AbstractC0583w0.L(activity, AbstractC0583w0.c, 4));
            linearLayout2.addView(textView4);
        }
        linearLayout.addView(linearLayout2);
        linearLayout2.setOnClickListener(new K((Object) alertDialogArr, (Object) e, str, 7));
    }

    public static void b(TextView textView, long j) {
        String str;
        int i;
        if (j < 0) {
            i = AbstractC0583w0.e;
            str = "超时";
        } else if (j < 300) {
            str = j + "ms";
            i = AbstractC0583w0.d;
        } else if (j < 800) {
            str = j + "ms";
            i = AbstractC0583w0.f;
        } else {
            str = j + "ms";
            i = AbstractC0583w0.e;
        }
        textView.setText(str);
        textView.setTextColor(i);
    }
}

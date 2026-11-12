package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0512h3 {
    public final AlertDialog a;
    public final Context b;
    public final int c;
    public final TextView d;
    public final ScrollView e;
    public final LinearLayout f;
    public final LinearLayout g;

    public C0512h3(AlertDialog alertDialog, Context context, int i, TextView textView, ScrollView scrollView, LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.a = alertDialog;
        this.b = context;
        this.c = i;
        this.d = textView;
        this.e = scrollView;
        this.f = linearLayout;
        this.g = linearLayout2;
    }

    public final void a() {
        AlertDialog alertDialog = this.a;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        alertDialog.dismiss();
    }

    public final void b(boolean z, String str, String str2, List list, String str3, String str4) {
        AlertDialog alertDialog = this.a;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        TextView textView = this.d;
        if (textView != null) {
            if (!z) {
                str = "未登录";
            } else if (str == null) {
                str = "已登录";
            }
            textView.setText(str);
        }
        LinearLayout linearLayout = this.g;
        if (linearLayout == null) {
            return;
        }
        linearLayout.animate().alpha(0.0f).setDuration(100L).withEndAction(new T2(this, z, str2, list, str3, str4, linearLayout.getHeight())).start();
    }
}

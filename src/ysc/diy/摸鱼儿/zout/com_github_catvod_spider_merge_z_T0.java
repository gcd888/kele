package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.p018v.f;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0568t0 {
    public final AlertDialog a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final LinearLayout c;
    public final View d;
    public final LinearLayout.LayoutParams e;
    public final TextView f;
    public final TextView g;
    public volatile boolean h;
    public int i;

    public C0568t0(AlertDialog alertDialog, LinearLayout linearLayout, View view, LinearLayout.LayoutParams layoutParams, TextView textView, TextView textView2) {
        this.a = alertDialog;
        this.c = linearLayout;
        this.d = view;
        this.e = layoutParams;
        this.f = textView;
        this.g = textView2;
    }

    public final void a(int i, String str) {
        if (this.h) {
            return;
        }
        this.i = Math.max(0, Math.min(100, i));
        int width = this.c.getWidth();
        if (width <= 0) {
            width = AbstractC0583w0.Q(240, this.a.getContext());
        }
        LinearLayout.LayoutParams layoutParams = this.e;
        layoutParams.width = (int) ((width * this.i) / 100.0f);
        this.d.setLayoutParams(layoutParams);
        this.g.setText(this.i + "%");
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f.setText(str);
    }

    public final void b(Runnable runnable) {
        if (this.h) {
            return;
        }
        this.h = true;
        try {
            this.a.dismiss();
        } catch (Exception unused) {
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i, String str) {
        this.b.post(new f(this, i, str, 2));
    }
}

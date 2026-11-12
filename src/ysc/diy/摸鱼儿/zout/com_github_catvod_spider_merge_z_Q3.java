package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.p017u.W;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class Q3 implements Runnable, View.OnAttachStateChangeListener {
    public final Handler a = new Handler(Looper.getMainLooper());
    public volatile boolean b;
    public final /* synthetic */ AlertDialog c;
    public final /* synthetic */ View d;
    public final /* synthetic */ R3 e;

    public Q3(AlertDialog alertDialog, View view, R3 r3) {
        this.c = alertDialog;
        this.d = view;
        this.e = r3;
    }

    public final boolean a() {
        if (this.c.isShowing()) {
            View view = this.d;
            if (view.getVisibility() == 0 && (!view.isAttachedToWindow() || view.isShown())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b = true;
        this.a.removeCallbacks(this);
        this.d.removeOnAttachStateChangeListener(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b || !this.c.isShowing()) {
            return;
        }
        if (a()) {
            InitOrigin.execute(new W(this, this.c, this.e, 17));
        } else {
            this.a.postDelayed(this, 2000L);
        }
    }
}

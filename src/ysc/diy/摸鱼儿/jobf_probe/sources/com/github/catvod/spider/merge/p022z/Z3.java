package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.widget.ImageView;
import com.github.catvod.spider.InitOrigin;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class Z3 {
    public final Bitmap a;
    public final String b;
    public final float c;
    public final int d;
    public Activity o;
    public volatile String p;
    public final CountDownLatch e = new CountDownLatch(1);
    public final AtomicReference f = new AtomicReference(new Y3(3, ""));
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final Handler n = new Handler(Looper.getMainLooper());
    public final X2 q = new X2(3, this);

    public Z3(Bitmap bitmap, String str) {
        float fMax;
        this.a = bitmap;
        this.b = str;
        if (bitmap == null) {
            fMax = 2.857143f;
            if (!str.isEmpty()) {
                String strSubstring = str.substring(0, Math.min(str.length(), 512));
                try {
                    float f = Float.parseFloat(strSubstring.replaceFirst("(?is).*?\\bwidth=[\"']([0-9.]+)[\"'].*", "$1")) / Float.parseFloat(strSubstring.replaceFirst("(?is).*?\\bheight=[\"']([0-9.]+)[\"'].*", "$1"));
                    if (f >= 0.5f && f <= 8.0f) {
                        fMax = f;
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            fMax = Math.max(1, bitmap.getWidth()) / Math.max(1, bitmap.getHeight());
        }
        this.c = fMax;
        this.d = 2;
    }

    public static void a(Z3 z3, int i, String str) {
        Bitmap bitmap;
        if (z3.j.compareAndSet(false, true)) {
            z3.f.set(new Y3(i, str));
            z3.e.countDown();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z3.b();
            return;
        }
        if (!z3.k.get() && z3.m.compareAndSet(false, true) && (bitmap = z3.a) != null) {
            try {
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            } catch (Throwable unused) {
            }
        }
        InitOrigin.run(new S3(z3, 1));
    }

    public final void b() {
        Bitmap bitmap;
        if (this.l.compareAndSet(false, true)) {
            this.n.removeCallbacks(this.q);
            P1.H1(this.p);
            this.p = null;
            ImageView imageView = (ImageView) this.h.getAndSet(null);
            if (imageView != null) {
                imageView.setImageDrawable(null);
            }
            WebView webView = (WebView) this.i.getAndSet(null);
            if (webView != null) {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            }
            AlertDialog alertDialog = (AlertDialog) this.g.getAndSet(null);
            if (alertDialog != null) {
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                try {
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                } catch (Throwable unused) {
                }
            }
            this.o = null;
            if (this.m.compareAndSet(false, true) && (bitmap = this.a) != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    bitmap.recycle();
                } catch (Throwable unused2) {
                }
            }
        }
    }
}

package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import moyu.fucking.C0152;
import moyu.fucking.C0157;
import moyu.fucking.C0176;
import moyu.fucking.C0179;
import moyu.fucking.C0186;
import moyu.fucking.C0195;
import moyu.fucking.C0209;
import moyu.fucking.C0224;
import moyu.fucking.C0233;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC0292s implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ImageView a;
    public final Activity b;
    public final C0304w c;

    public ViewTreeObserverOnGlobalLayoutListenerC0292s(C0304w c0304w, ImageView imageView, Activity activity) throws Throwable {
        this.c = c0304w;
        this.a = imageView;
        this.b = activity;
        int iIntValue = ((Integer) C0224.n(95865, null, new Object[0])).intValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iIntValue >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Float) C0157.n(17336, null, new Object[]{(String) C0179.n(10540, null, new Object[]{(String) C0233.n(35595)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws Throwable {
        ImageView imageView = (ImageView) C0233.n(52579, this);
        C0233.n(82042, (ViewTreeObserver) C0186.n(99383, imageView, new Object[0]), new Object[]{this});
        C0304w c0304w = (C0304w) C0176.n(97061, this);
        c0304w.o = null;
        c0304w.p = new WeakReference(null);
        C0152.n(52927, null, new Object[]{new r(this, (Activity) C0233.n(62383, this), imageView, 0)});
        int iIntValue = ((Integer) C0233.n(87817, null, new Object[0])).intValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iIntValue >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0152.n(66570, null, new Object[]{(String) C0209.n(85715, null, new Object[]{(String) C0233.n(58205)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }
}

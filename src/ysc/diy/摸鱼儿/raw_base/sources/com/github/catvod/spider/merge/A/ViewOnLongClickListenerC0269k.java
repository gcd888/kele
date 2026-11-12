package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.view.View;
import java.io.PrintStream;
import moyu.fucking.C0151;
import moyu.fucking.C0152;
import moyu.fucking.C0182;
import moyu.fucking.C0195;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC0269k implements View.OnLongClickListener {
    public final int a;
    public final C0304w b;
    public final Activity c;

    public /* synthetic */ ViewOnLongClickListenerC0269k(C0304w c0304w, Activity activity, int i) throws Throwable {
        this.a = i;
        this.b = c0304w;
        this.c = activity;
        int iIntValue = ((Integer) C0195.n(18512, null, new Object[0])).intValue();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (iIntValue <= 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0182.n(56258, null, new Object[]{(String) C0152.n(72253, null, new Object[]{(String) C0151.n(4338)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Throwable {
        switch (((Integer) C0151.n(94708, this)).intValue()) {
            case 0:
                Activity activity = (Activity) C0151.n(80284, this);
                C0151.n(87775, null, new Object[]{activity});
                C0151.n(14884, null, new Object[]{activity});
                return true;
            case 1:
                Activity activity2 = (Activity) C0151.n(80284, this);
                C0151.n(87775, null, new Object[]{activity2});
                C0151.n(14884, null, new Object[]{activity2});
                return true;
            case 2:
                Activity activity3 = (Activity) C0151.n(80284, this);
                C0151.n(87775, null, new Object[]{activity3});
                C0151.n(14884, null, new Object[]{activity3});
                return true;
            default:
                Activity activity4 = (Activity) C0151.n(80284, this);
                C0151.n(87775, null, new Object[]{activity4});
                C0151.n(14884, null, new Object[]{activity4});
                return true;
        }
    }
}

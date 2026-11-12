package com.github.catvod.spider.merge.p022z;

import android.view.ScaleGestureDetector;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class A2 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ B2 a;

    public A2(B2 b2) {
        this.a = b2;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        B2 b2 = this.a;
        b2.e(scaleFactor);
        b2.l = true;
        return true;
    }
}

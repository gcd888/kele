package com.github.catvod.spider.merge.A;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class Z extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C0252e0 a;

    public Z(C0252e0 c0252e0) {
        this.a = c0252e0;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent != null && motionEvent2 != null) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) > Math.abs(motionEvent2.getY() - motionEvent.getY())) {
                float fAbs = Math.abs(x);
                C0252e0 c0252e0 = this.a;
                if (fAbs > c0252e0.m(50) && Math.abs(f) > 100.0f) {
                    if (x > 0.0f) {
                        int i = c0252e0.q;
                        if (i > 0) {
                            c0252e0.A(i - 1);
                        }
                    } else if (c0252e0.q < c0252e0.p.size() - 1) {
                        c0252e0.A(c0252e0.q + 1);
                    }
                    return true;
                }
            }
        }
        return false;
    }
}

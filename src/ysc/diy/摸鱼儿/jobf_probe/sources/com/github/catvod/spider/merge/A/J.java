package com.github.catvod.spider.merge.A;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class J implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ J(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                C0252e0 c0252e0 = (C0252e0) this.b;
                if (c0252e0.E) {
                    return false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    c0252e0.A = motionEvent.getRawY();
                    c0252e0.B = c0252e0.g.getHeight();
                } else if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int iMax = Math.max(c0252e0.C, Math.min(c0252e0.D, (int) (c0252e0.B + (c0252e0.A - motionEvent.getRawY()))));
                        ViewGroup.LayoutParams layoutParams = c0252e0.g.getLayoutParams();
                        layoutParams.height = iMax;
                        c0252e0.g.setLayoutParams(layoutParams);
                    } else if (actionMasked != 3) {
                        return false;
                    }
                }
                return true;
            case 1:
                C0252e0 c0252e1 = (C0252e0) this.b;
                c0252e1.getClass();
                if (motionEvent.getAction() == 1) {
                    c0252e1.k();
                }
                return true;
            default:
                ((GestureDetector) this.b).onTouchEvent(motionEvent);
                return false;
        }
    }
}

package com.github.catvod.spider.merge.p022z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0539n0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0539n0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                break;
            case 1:
                View view2 = (View) this.b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationY(0.0f);
                break;
            default:
                C0512h3 c0512h3 = (C0512h3) this.b;
                ViewGroup.LayoutParams layoutParams = c0512h3.g.getLayoutParams();
                layoutParams.height = -2;
                LinearLayout linearLayout = c0512h3.g;
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setAlpha(0.0f);
                linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                AbstractC0583w0.o(c0512h3.e, c0512h3.f);
                AbstractC0583w0.f0(c0512h3.a);
                break;
        }
    }
}

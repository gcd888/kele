package com.github.catvod.spider.merge.p022z;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class C0504g0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;

    public /* synthetic */ C0504g0(View view, float f, int i) {
        this.a = i;
        this.b = view;
        this.c = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fMin = Math.min(1.0f, 1.5f * fFloatValue);
                View view = this.b;
                view.setAlpha(fMin);
                float f = (0.04f * fFloatValue) + 0.96f;
                view.setScaleX(f);
                view.setScaleY(f);
                view.setTranslationY((1.0f - fFloatValue) * this.c);
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fMin2 = Math.min(1.0f, 1.5f * fFloatValue2);
                View view2 = this.b;
                view2.setAlpha(fMin2);
                float f2 = (0.04f * fFloatValue2) + 0.96f;
                view2.setScaleX(f2);
                view2.setScaleY(f2);
                view2.setTranslationY((1.0f - fFloatValue2) * this.c);
                break;
        }
    }
}

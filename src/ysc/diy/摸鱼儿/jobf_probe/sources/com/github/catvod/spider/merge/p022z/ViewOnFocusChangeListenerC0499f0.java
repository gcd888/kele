package com.github.catvod.spider.merge.p022z;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0499f0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ViewOnFocusChangeListenerC0499f0(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(this.b);
                if (z) {
                    gradientDrawable.setColor(AbstractC0583w0.k);
                    gradientDrawable.setStroke(2, this.c);
                    view.setScaleX(1.02f);
                    view.setScaleY(1.02f);
                } else {
                    gradientDrawable.setColor(AbstractC0583w0.a);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setBackground(gradientDrawable);
                break;
            case 1:
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(this.b);
                if (z) {
                    gradientDrawable2.setColor(AbstractC0583w0.k);
                    gradientDrawable2.setStroke(2, this.c);
                    view.setScaleX(1.02f);
                    view.setScaleY(1.02f);
                } else {
                    gradientDrawable2.setColor(AbstractC0583w0.b);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setBackground(gradientDrawable2);
                break;
            case 2:
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(this.b);
                if (z) {
                    gradientDrawable3.setColor(-1823);
                    gradientDrawable3.setStroke(2, this.c);
                    view.setScaleX(1.02f);
                    view.setScaleY(1.02f);
                } else {
                    gradientDrawable3.setColor(AbstractC0583w0.a);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setBackground(gradientDrawable3);
                break;
            case 3:
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setCornerRadius(this.b);
                int i = this.c;
                if (z) {
                    gradientDrawable4.setColor(i);
                    ((TextView) view).setTextColor(-1);
                    view.setScaleX(1.08f);
                    view.setScaleY(1.08f);
                } else {
                    gradientDrawable4.setColor(-1182985);
                    ((TextView) view).setTextColor(i);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setBackground(gradientDrawable4);
                break;
            case 4:
                GradientDrawable gradientDrawable5 = new GradientDrawable();
                gradientDrawable5.setCornerRadius(this.b);
                if (z) {
                    gradientDrawable5.setColor(-1823);
                    gradientDrawable5.setStroke(2, this.c);
                    view.setScaleX(1.02f);
                    view.setScaleY(1.02f);
                } else {
                    gradientDrawable5.setColor(AbstractC0583w0.a);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setBackground(gradientDrawable5);
                break;
            default:
                GradientDrawable gradientDrawable6 = new GradientDrawable();
                gradientDrawable6.setCornerRadius(this.b);
                gradientDrawable6.setColor(this.c);
                if (z) {
                    gradientDrawable6.setStroke(2, -1);
                    view.setScaleX(1.05f);
                    view.setScaleY(1.05f);
                } else {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setBackground(gradientDrawable6);
                break;
        }
    }
}

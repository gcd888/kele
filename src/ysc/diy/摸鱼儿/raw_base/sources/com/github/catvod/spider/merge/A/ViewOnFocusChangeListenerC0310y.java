package com.github.catvod.spider.merge.A;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0310y implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ViewOnFocusChangeListenerC0310y(int i, Context context) {
        this.a = 2;
        this.b = i;
        this.c = context;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                ((TextView) this.c).setTextColor(z ? -1 : this.b);
                break;
            case 1:
                C0252e0 c0252e0 = (C0252e0) this.c;
                if (!z) {
                    c0252e0.getClass();
                    view.post(new H(c0252e0, 2));
                } else {
                    int i = this.b;
                    c0252e0.A(i);
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList = c0252e0.o;
                        if (i2 >= arrayList.size()) {
                            c0252e0.E(i);
                        } else {
                            ((TextView) arrayList.get(i2)).setTextColor(Color.parseColor(i2 == i ? c0252e0.s(i) : "#999999"));
                            i2++;
                        }
                    }
                }
                break;
            default:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(this.b);
                Context context = (Context) this.c;
                if (z) {
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setStroke(AbstractC0583w0.Q(2, context), AbstractC0583w0.c);
                } else {
                    gradientDrawable.setColor(AbstractC0583w0.b);
                    gradientDrawable.setStroke(AbstractC0583w0.Q(1, context), AbstractC0583w0.j);
                }
                view.setBackground(gradientDrawable);
                break;
        }
    }

    public /* synthetic */ ViewOnFocusChangeListenerC0310y(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}

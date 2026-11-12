package com.github.catvod.spider.merge.p022z;

import android.graphics.drawable.GradientDrawable;
import com.github.catvod.spider.InitOrigin;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class G1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ K1 b;
    public final /* synthetic */ GradientDrawable c;

    public /* synthetic */ G1(K1 k1, GradientDrawable gradientDrawable, int i) {
        this.a = i;
        this.b = k1;
        this.c = gradientDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                K1 k1 = this.b;
                k1.getClass();
                InitOrigin.run(new G1(k1, this.c, 1));
                break;
            default:
                K1 k2 = this.b;
                k2.e.setText("重新测速");
                k2.e.setEnabled(true);
                int i = AbstractC0583w0.d;
                GradientDrawable gradientDrawable = this.c;
                gradientDrawable.setColor(i);
                k2.e.setBackground(gradientDrawable);
                break;
        }
    }
}

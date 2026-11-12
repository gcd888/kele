package com.github.catvod.spider.merge.A;

import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class H implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0252e0 b;

    public /* synthetic */ H(C0252e0 c0252e0, int i) {
        this.a = i;
        this.b = c0252e0;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.a) {
            case 0:
                this.b.l();
                break;
            case 1:
                this.b.E = false;
                break;
            case 2:
                C0252e0 c0252e0 = this.b;
                Iterator it = c0252e0.o.iterator();
                while (it.hasNext()) {
                    if (((TextView) it.next()).isFocused()) {
                        break;
                    }
                }
                c0252e0.F();
                c0252e0.E(c0252e0.q);
                break;
            case 3:
                this.b.k.setVisibility(8);
                break;
            case 4:
                this.b.r.setVisibility(8);
                break;
            case 5:
                C0252e0 c0252e1 = this.b;
                String str = c0252e1.V;
                if (str != null) {
                    H0.a.getClass();
                    H0.k(str);
                    c0252e1.V = null;
                }
                com.github.catvod.spider.merge.p022z.P1.R();
                X0.a("已收到远程输入");
                c0252e1.v();
                break;
            case 6:
                C0252e0 c0252e2 = this.b;
                LinearLayout linearLayout = c0252e2.g;
                linearLayout.setTranslationY(linearLayout.getHeight());
                c0252e2.g.animate().translationY(0.0f).setDuration(350L).setInterpolator(new DecelerateInterpolator()).withEndAction(new H(c0252e2, 1)).start();
                break;
            default:
                C0252e0 c0252e3 = this.b;
                c0252e3.E(c0252e3.q);
                break;
        }
    }
}

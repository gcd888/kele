package com.github.catvod.spider.merge.p022z;

import android.app.Dialog;
import android.content.DialogInterface;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class Y1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Y1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                break;
            case 1:
                if (P1.s == ((Dialog) this.b)) {
                    P1.s = null;
                    P1.t = null;
                }
                break;
            case 2:
                ((CountDownLatch) this.b).countDown();
                break;
            case 3:
                ((C0586w3) this.b).j.run();
                break;
            case 4:
                Q3 q3 = (Q3) this.b;
                q3.b = true;
                q3.a.removeCallbacks(q3);
                q3.d.removeOnAttachStateChangeListener(q3);
                break;
            default:
                Z3.a((Z3) this.b, 3, "");
                break;
        }
    }
}

package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import com.github.catvod.spider.merge.A.T1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0554q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0568t0 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ RunnableC0554q0(C0568t0 c0568t0) {
        this.a = 0;
        this.b = c0568t0;
        this.c = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            case 1:
                C0568t0 c0568t0 = this.b;
                AlertDialog alertDialog = c0568t0.a;
                alertDialog.setCancelable(true);
                alertDialog.setCanceledOnTouchOutside(false);
                alertDialog.setOnCancelListener(new DialogInterfaceOnCancelListenerC0558r0(c0568t0, (T1) this.c, 0));
                break;
            case 2:
                C0568t0 c0568t1 = this.b;
                c0568t1.a(100, "完成");
                c0568t1.b.postDelayed(new RunnableC0554q0(c0568t1, this.c, 3), 180L);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }

    public /* synthetic */ RunnableC0554q0(C0568t0 c0568t0, Runnable runnable, int i) {
        this.a = i;
        this.b = c0568t0;
        this.c = runnable;
    }
}

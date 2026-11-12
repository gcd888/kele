package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC0558r0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0558r0(Object obj, Runnable runnable, int i) {
        this.a = i;
        this.c = obj;
        this.b = runnable;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                C0568t0 c0568t0 = (C0568t0) this.c;
                Runnable runnable = this.b;
                c0568t0.h = true;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                P1.H1((String) this.c);
                Runnable runnable2 = this.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
        }
    }
}

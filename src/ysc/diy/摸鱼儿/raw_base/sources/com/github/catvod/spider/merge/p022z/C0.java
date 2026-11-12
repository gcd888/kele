package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class C0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ C0(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.run();
                break;
            case 1:
                this.b.run();
                break;
            case 2:
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                Runnable runnable2 = this.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
        }
    }
}

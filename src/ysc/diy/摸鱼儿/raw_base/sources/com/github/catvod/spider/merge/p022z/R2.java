package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class R2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ R2(String str, Runnable runnable, int i) {
        this.a = i;
        this.b = str;
        this.c = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                P1.H1(this.b);
                Runnable runnable = this.c;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                P1.Q(this.b);
                Runnable runnable2 = this.c;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
        }
    }
}

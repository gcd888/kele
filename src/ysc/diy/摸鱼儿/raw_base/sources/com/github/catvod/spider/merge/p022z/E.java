package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class E implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ E(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 1:
                Runnable runnable2 = this.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
            case 2:
                Runnable runnable3 = this.b;
                if (runnable3 != null) {
                    runnable3.run();
                }
                break;
            case 3:
                Runnable runnable4 = this.b;
                if (runnable4 != null) {
                    runnable4.run();
                }
                break;
            case 4:
                this.b.run();
                break;
            case 5:
                Runnable runnable5 = this.b;
                if (runnable5 != null) {
                    runnable5.run();
                }
                break;
            case 6:
                Runnable runnable6 = this.b;
                if (runnable6 != null) {
                    runnable6.run();
                }
                break;
            case 7:
                this.b.run();
                break;
            case 8:
                Runnable runnable7 = this.b;
                if (runnable7 != null) {
                    runnable7.run();
                }
                break;
            case 9:
                this.b.run();
                break;
            case 10:
                this.b.run();
                break;
            case 11:
                this.b.run();
                break;
            default:
                Runnable runnable8 = this.b;
                if (runnable8 != null) {
                    runnable8.run();
                }
                break;
        }
    }
}

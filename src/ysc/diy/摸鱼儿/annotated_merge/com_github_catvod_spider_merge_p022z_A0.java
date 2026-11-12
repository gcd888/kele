package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.view.View;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class A0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog[] b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ A0(AlertDialog[] alertDialogArr, Runnable runnable, int i) {
        this.a = i;
        this.b = alertDialogArr;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                AlertDialog alertDialog = this.b[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                Runnable runnable = this.c;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 1:
                AlertDialog alertDialog2 = this.b[0];
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                Runnable runnable2 = this.c;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
            case 2:
                AlertDialog alertDialog3 = this.b[0];
                if (alertDialog3 != null) {
                    alertDialog3.dismiss();
                }
                Runnable runnable3 = this.c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                break;
            default:
                try {
                    AlertDialog alertDialog4 = this.b[0];
                    if (alertDialog4 != null) {
                        alertDialog4.dismiss();
                    }
                    break;
                } catch (Exception unused) {
                }
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                break;
        }
    }
}

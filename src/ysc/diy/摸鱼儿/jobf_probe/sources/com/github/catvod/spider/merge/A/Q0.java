package com.github.catvod.spider.merge.A;

import android.app.AlertDialog;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class Q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog[] b;

    public /* synthetic */ Q0(AlertDialog[] alertDialogArr, int i) {
        this.a = i;
        this.b = alertDialogArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AlertDialog[] alertDialogArr = this.b;
                try {
                    AlertDialog alertDialog = alertDialogArr[0];
                    if (alertDialog != null && alertDialog.isShowing()) {
                        alertDialogArr[0].dismiss();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                AlertDialog[] alertDialogArr2 = this.b;
                try {
                    AlertDialog alertDialog2 = alertDialogArr2[0];
                    if (alertDialog2 != null && alertDialog2.isShowing()) {
                        alertDialogArr2[0].dismiss();
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}

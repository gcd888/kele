package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.view.View;
import com.github.catvod.spider.merge.D.b;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class V2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog[] b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ V2(AlertDialog[] alertDialogArr, Runnable[] runnableArr, int i, int i2) {
        this.a = i2;
        this.b = alertDialogArr;
        this.c = runnableArr;
        this.d = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                AlertDialog alertDialog = this.b[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                this.c[this.d].run();
                break;
            case 1:
                AlertDialog[] alertDialogArr = this.b;
                Runnable[] runnableArr = this.c;
                int i = this.d;
                try {
                    AlertDialog alertDialog2 = alertDialogArr[0];
                    if (alertDialog2 != null) {
                        alertDialog2.dismiss();
                    }
                    break;
                } catch (Exception unused) {
                }
                try {
                    runnableArr[i].run();
                } catch (Exception e) {
                    b.x(e, new StringBuilder("打开失败: "));
                    return;
                }
                break;
            default:
                try {
                    AlertDialog alertDialog3 = this.b[0];
                    if (alertDialog3 != null) {
                        alertDialog3.dismiss();
                    }
                    break;
                } catch (Exception unused2) {
                }
                Runnable[] runnableArr2 = this.c;
                if (runnableArr2 != null) {
                    try {
                        int length = runnableArr2.length;
                        int i2 = this.d;
                        if (i2 < length && (runnable = runnableArr2[i2]) != null) {
                            runnable.run();
                            break;
                        }
                    } catch (Exception e2) {
                        b.x(e2, new StringBuilder("打开失败: "));
                    }
                }
                break;
        }
    }
}

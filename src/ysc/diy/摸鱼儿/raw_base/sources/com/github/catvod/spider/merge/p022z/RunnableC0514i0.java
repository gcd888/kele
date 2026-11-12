package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.app.Dialog;
import com.github.catvod.spider.merge.A.X0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0514i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Dialog b;

    public /* synthetic */ RunnableC0514i0(Dialog dialog, int i) {
        this.a = i;
        this.b = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AbstractC0583w0.o0((AlertDialog) this.b);
                break;
            case 1:
                this.b.dismiss();
                X0.a("已取消下载");
                break;
            case 2:
                Dialog dialog = this.b;
                try {
                    if (dialog.isShowing()) {
                        dialog.dismiss();
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                Dialog dialog2 = this.b;
                if (dialog2 != null) {
                    try {
                        if (dialog2.isShowing()) {
                            dialog2.dismiss();
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
        }
    }
}

package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.k2;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class T implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlertDialog b;

    public /* synthetic */ T(AlertDialog alertDialog, int i) {
        this.a = i;
        this.b = alertDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AlertDialog alertDialog = this.b;
                if (alertDialog.isShowing()) {
                    alertDialog.getButton(-1).performClick();
                }
                break;
            case 1:
                AbstractC0583w0.o0(this.b);
                break;
            default:
                AlertDialog alertDialog2 = this.b;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                k2.c.incrementAndGet();
                if (!k2.l()) {
                    X0.a(k2.q() ? "请先登录夸克" : "请先配置WebDAV");
                } else {
                    X0.a("正在通过" + k2.i(k2.q()) + "同步播放历史");
                    k2.B(true, true);
                }
                break;
        }
    }
}

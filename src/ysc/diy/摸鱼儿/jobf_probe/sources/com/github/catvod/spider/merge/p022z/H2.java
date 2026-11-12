package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.p000a.Z0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class H2 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;

    public /* synthetic */ H2(int i) {
        this.a = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                P1.U0();
                break;
            case 1:
                P1.U0();
                break;
            case 2:
                P1.U0();
                break;
            default:
                Z0.t().i = true;
                break;
        }
    }
}

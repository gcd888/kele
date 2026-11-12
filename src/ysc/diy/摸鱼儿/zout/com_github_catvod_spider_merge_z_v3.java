package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC0581v3 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0581v3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((C0586w3) this.b).j.run();
                break;
            default:
                Z3.a((Z3) this.b, 3, "");
                break;
        }
    }
}

package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.A.X0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class DialogInterfaceOnClickListenerC0535m1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ RunnableC0540n1 a;

    public DialogInterfaceOnClickListenerC0535m1(RunnableC0540n1 runnableC0540n1) {
        this.a = runnableC0540n1;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        RunnableC0540n1 runnableC0540n1 = this.a;
        ((InterfaceC0545o1) runnableC0540n1.c.a).removeDrive(runnableC0540n1.b);
        X0.a("已删除: " + runnableC0540n1.a);
        runnableC0540n1.c.t(true);
    }
}

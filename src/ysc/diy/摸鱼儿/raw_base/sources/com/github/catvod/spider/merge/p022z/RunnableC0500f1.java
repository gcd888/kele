package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.merge.A.X1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class RunnableC0500f1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ X1 c;

    public RunnableC0500f1(X1 x1, String str, boolean z) {
        this.c = x1;
        this.a = str;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        X1 x1 = this.c;
        ((ViewOnClickListenerC0505g1) x1.b).e.setEnabled(true);
        ((ViewOnClickListenerC0505g1) x1.b).d.setText(this.a);
        ((ViewOnClickListenerC0505g1) x1.b).d.setTextColor(this.b ? AbstractC0583w0.d : AbstractC0583w0.e);
    }
}

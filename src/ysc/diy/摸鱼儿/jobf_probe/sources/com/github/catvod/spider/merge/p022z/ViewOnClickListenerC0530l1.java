package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.view.View;
import com.github.catvod.spider.merge.A.H0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class ViewOnClickListenerC0530l1 implements View.OnClickListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ AlertDialog b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ C0559r1 d;

    public ViewOnClickListenerC0530l1(C0559r1 c0559r1, String str, AlertDialog alertDialog, boolean z) {
        this.d = c0559r1;
        this.a = str;
        this.b = alertDialog;
        this.c = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        H0.a.getClass();
        H0.k(this.a);
        this.b.dismiss();
        if (this.c) {
            this.d.t(false);
        }
    }
}

package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.view.View;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class P implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AlertDialog c;

    public /* synthetic */ P(String str, AlertDialog alertDialog, int i) {
        this.a = i;
        this.b = str;
        this.c = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                P1.H1(this.b);
                this.c.dismiss();
                break;
            default:
                P1.H1(this.b);
                this.c.dismiss();
                break;
        }
    }
}

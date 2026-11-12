package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class O implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ O(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                P1.H1(this.b);
                break;
            case 1:
                P1.H1(this.b);
                break;
            default:
                P1.H1(this.b);
                break;
        }
    }
}

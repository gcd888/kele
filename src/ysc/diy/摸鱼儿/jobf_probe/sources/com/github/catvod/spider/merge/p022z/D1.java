package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;
import com.github.catvod.spider.InitOrigin;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class D1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ D1(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                P1.H1(this.b);
                break;
            case 1:
                InitOrigin.run(new X2(0, this.b));
                break;
            default:
                P1.H1(this.b);
                break;
        }
    }
}

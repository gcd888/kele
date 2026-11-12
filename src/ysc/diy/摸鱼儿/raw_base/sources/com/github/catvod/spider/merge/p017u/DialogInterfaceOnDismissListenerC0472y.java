package com.github.catvod.spider.merge.p017u;

import android.content.DialogInterface;
import com.github.catvod.spider.HonHon;
import com.github.catvod.spider.merge.p022z.P1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC0472y implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0472y(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str = this.b;
        switch (this.a) {
            case 0:
                String[] strArr = HonHon.h;
                P1.H1(str);
                break;
            case 1:
                P1.H1(str);
                break;
            case 2:
                P1.H1(str);
                break;
            case 3:
                P1.H1(str);
                break;
            case 4:
                P1.H1(str);
                break;
            default:
                P1.H1(str);
                break;
        }
    }
}

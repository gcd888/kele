package com.github.catvod.spider.merge.p022z;

import android.view.View;
import com.github.catvod.spider.merge.A.C0252e0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0509h0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ ViewOnClickListenerC0509h0(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                InterfaceC0573u0 interfaceC0573u0 = (InterfaceC0573u0) this.b;
                if (interfaceC0573u0 != null) {
                    int i = this.c;
                    interfaceC0573u0.c(i, i - 1);
                }
                break;
            case 1:
                InterfaceC0573u0 interfaceC0573u1 = (InterfaceC0573u0) this.b;
                if (interfaceC0573u1 != null) {
                    int i2 = this.c;
                    interfaceC0573u1.c(i2, i2 + 1);
                }
                break;
            default:
                ((C0252e0) this.b).A(this.c);
                break;
        }
    }
}

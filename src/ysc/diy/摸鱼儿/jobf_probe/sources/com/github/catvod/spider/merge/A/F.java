package com.github.catvod.spider.merge.A;

import android.view.View;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class F implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0252e0 b;

    public /* synthetic */ F(C0252e0 c0252e0, int i) {
        this.a = i;
        this.b = c0252e0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.v();
                break;
            default:
                this.b.t();
                break;
        }
    }
}

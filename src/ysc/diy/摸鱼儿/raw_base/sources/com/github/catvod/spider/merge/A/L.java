package com.github.catvod.spider.merge.A;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class L implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0252e0 b;

    public /* synthetic */ L(C0252e0 c0252e0, int i) {
        this.a = i;
        this.b = c0252e0;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                C0252e0 c0252e0 = this.b;
                c0252e0.getClass();
                ((TextView) view).setTextColor(z ? -1 : c0252e0.Q);
                view.setSelected(z);
                break;
            default:
                C0252e0 c0252e1 = this.b;
                c0252e1.getClass();
                ((TextView) view).setTextColor(z ? -1 : c0252e1.Q);
                view.setSelected(z);
                break;
        }
    }
}

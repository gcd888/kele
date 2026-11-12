package com.github.catvod.spider.merge.p022z;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnKeyListenerC0511h2 implements View.OnKeyListener {
    public final /* synthetic */ int a;

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                if (i != 23 && i != 66) {
                    return false;
                }
                view.performClick();
                return true;
            default:
                int i2 = AbstractC0583w0.a;
                if (keyEvent == null || keyEvent.getAction() != 0 || !AbstractC0583w0.W(i)) {
                    return false;
                }
                view.performClick();
                return true;
        }
    }
}

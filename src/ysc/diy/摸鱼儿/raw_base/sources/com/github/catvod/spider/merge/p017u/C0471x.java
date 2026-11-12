package com.github.catvod.spider.merge.p017u;

import android.view.KeyEvent;
import android.widget.TextView;
import com.github.catvod.spider.HonHon;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class C0471x implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ C0471x(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Runnable runnable = this.b;
        switch (this.a) {
            case 0:
                String[] strArr = HonHon.h;
                if (i != 3) {
                    return false;
                }
                runnable.run();
                return true;
            default:
                if (i != 3) {
                    return false;
                }
                runnable.run();
                return true;
        }
    }
}

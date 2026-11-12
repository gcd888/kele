package com.github.catvod.spider.merge.p017u;

import android.widget.TextView;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ z(TextView textView, int i) {
        this.a = i;
        this.b = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestFocus();
                break;
            default:
                TextView textView = this.b;
                try {
                    int i = 1;
                    if (textView.getLineCount() > 1) {
                        i = 8388611;
                    }
                    textView.setGravity(i);
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }
}

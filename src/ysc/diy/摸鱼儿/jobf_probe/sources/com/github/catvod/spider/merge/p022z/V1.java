package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class V1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ Context c;

    public /* synthetic */ V1(TextView textView, Activity activity, int i) {
        this.a = i;
        this.b = textView;
        this.c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                InitOrigin.run(new V1(this.b, (Activity) this.c, 1));
                break;
            default:
                TextView textView = this.b;
                textView.setText("重新测速");
                textView.setEnabled(true);
                textView.setBackground(AbstractC0583w0.L(this.c, AbstractC0583w0.d, 8));
                break;
        }
    }
}

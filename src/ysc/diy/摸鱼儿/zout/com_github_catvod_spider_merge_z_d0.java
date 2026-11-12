package com.github.catvod.spider.merge.p022z;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0489d0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ ViewOnFocusChangeListenerC0489d0(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                view.setScaleX(z ? 1.02f : 1.0f);
                view.setScaleY(z ? 1.02f : 1.0f);
                ((Button) this.b).setTypeface(Typeface.DEFAULT, 0);
                break;
            default:
                C0566s3 c0566s3 = (C0566s3) this.b;
                if (z) {
                    c0566s3.getClass();
                } else if (c0566s3.j) {
                    c0566s3.e();
                }
                break;
        }
    }
}

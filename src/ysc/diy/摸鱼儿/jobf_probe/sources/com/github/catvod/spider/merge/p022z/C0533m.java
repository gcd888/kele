package com.github.catvod.spider.merge.p022z;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0533m extends ScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0533m(Context context, int i, int i2) {
        super(context);
        this.a = i2;
        this.b = i;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.b, Integer.MIN_VALUE));
                break;
            default:
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int iMin = this.b;
                if (mode != 0) {
                    iMin = Math.min(iMin, size);
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE));
                break;
        }
    }
}

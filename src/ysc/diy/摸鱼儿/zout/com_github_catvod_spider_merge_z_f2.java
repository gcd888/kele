package com.github.catvod.spider.merge.p022z;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0501f2 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ViewOnFocusChangeListenerC0501f2(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                ((ImageView) this.b).setBackground(C2.d((Context) this.c, z));
                break;
            default:
                view.setBackground((GradientDrawable) (z ? this.b : this.c));
                break;
        }
    }
}

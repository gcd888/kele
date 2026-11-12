package com.github.catvod.spider.merge.p022z;

import android.R;
import android.app.Application;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import android.widget.TextView;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0547o3 extends TextView {
    public final Scroller a;
    public int b;

    public C0547o3(Application application) {
        super(application, null, R.attr.textViewStyle);
        setSingleLine();
        setEllipsize(null);
        setHorizontallyScrolling(true);
        Scroller scroller = new Scroller(getContext(), new LinearInterpolator());
        this.a = scroller;
        setScroller(scroller);
    }

    @Override // android.widget.TextView, android.view.View
    public final void computeScroll() {
        super.computeScroll();
        Scroller scroller = this.a;
        if (scroller == null || !scroller.isFinished()) {
            return;
        }
        if (scroller != null) {
            scroller.abortAnimation();
        }
        setVisibility(8);
    }
}

package com.github.catvod.spider.merge.p022z;

import android.widget.SeekBar;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0561r3 implements SeekBar.OnSeekBarChangeListener {
    public int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ C0566s3 c;

    public C0561r3(C0566s3 c0566s3, RunnableC0552p3 runnableC0552p3) {
        this.c = c0566s3;
        this.b = runnableC0552p3;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C0566s3 c0566s3 = this.c;
        c0566s3.d(i);
        if (z) {
            boolean z2 = !c0566s3.j;
            if (z2) {
                c0566s3.b(this.a);
            }
            c0566s3.f(i, false);
            if (z2) {
                c0566s3.e();
            }
        } else {
            c0566s3.g.clear();
            c0566s3.k = -1L;
            c0566s3.j = false;
            this.b.run();
        }
        this.a = i;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.c.b(seekBar.getProgress());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.c.e();
    }
}

package com.github.catvod.spider.merge.p022z;

import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0537m3 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ ImageView b;

    public C0537m3(TextView textView, ImageView imageView) {
        this.a = textView;
        this.b = imageView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.a.setText(i + "°");
        this.b.setRotation((float) i);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}

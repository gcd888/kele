package com.github.catvod.spider.merge.p022z;

import android.widget.ScrollView;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class A implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScrollView b;
    public final /* synthetic */ int c;

    public /* synthetic */ A(ScrollView scrollView, int i, int i2) {
        this.a = i2;
        this.b = scrollView;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ScrollView scrollView = this.b;
                try {
                    int height = scrollView.getHeight();
                    int i = this.c;
                    if (height > i) {
                        scrollView.getLayoutParams().height = i;
                        scrollView.requestLayout();
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                ScrollView scrollView2 = this.b;
                try {
                    int height2 = scrollView2.getHeight();
                    int i2 = this.c;
                    if (height2 > i2) {
                        scrollView2.getLayoutParams().height = i2;
                        scrollView2.requestLayout();
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 2:
                ScrollView scrollView3 = this.b;
                try {
                    int height3 = scrollView3.getHeight();
                    int i3 = this.c;
                    if (height3 > i3) {
                        scrollView3.getLayoutParams().height = i3;
                        scrollView3.requestLayout();
                    }
                } catch (Exception unused3) {
                    return;
                }
                break;
            default:
                ScrollView scrollView4 = this.b;
                try {
                    int height4 = scrollView4.getHeight();
                    int i4 = this.c;
                    if (height4 > i4) {
                        scrollView4.getLayoutParams().height = i4;
                        scrollView4.requestLayout();
                    }
                } catch (Exception unused4) {
                    return;
                }
                break;
        }
    }
}

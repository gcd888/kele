package com.github.catvod.spider.merge.p022z;

import android.view.View;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class N1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ Runnable[] c;

    public /* synthetic */ N1(int[] iArr, Runnable[] runnableArr, int i) {
        this.a = i;
        this.b = iArr;
        this.c = runnableArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int[] iArr = this.b;
                int i = iArr[0];
                if (i > 0) {
                    iArr[0] = i - 1;
                    this.c[0].run();
                }
                break;
            case 1:
                int[] iArr2 = this.b;
                iArr2[0] = iArr2[0] + 1;
                this.c[0].run();
                break;
            case 2:
                int[] iArr3 = this.b;
                int i2 = iArr3[0];
                if (i2 > 0) {
                    iArr3[0] = i2 - 1;
                    this.c[0].run();
                    break;
                }
                break;
            default:
                int[] iArr4 = this.b;
                iArr4[0] = iArr4[0] + 1;
                this.c[0].run();
                break;
        }
    }
}

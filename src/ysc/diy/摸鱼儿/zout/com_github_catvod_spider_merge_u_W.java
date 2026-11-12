package com.github.catvod.spider.merge.p017u;

import android.view.View;
import com.github.catvod.spider.HonHon;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0470w implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ ViewOnClickListenerC0470w(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable = this.b;
        switch (this.a) {
            case 0:
                String[] strArr = HonHon.h;
                runnable.run();
                break;
            case 1:
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 4:
                runnable.run();
                break;
            case 5:
                runnable.run();
                break;
            case 6:
                runnable.run();
                break;
            case 7:
                runnable.run();
                break;
            case 8:
                runnable.run();
                break;
            case 9:
                runnable.run();
                break;
            case 10:
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 11:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}

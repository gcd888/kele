package com.github.catvod.spider.merge.p022z;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnKeyListenerC0497e3 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnKeyListenerC0497e3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (keyEvent.getAction() != 0 || (i != 23 && i != 66)) {
                    return false;
                }
                ((View.OnClickListener) this.b).onClick(view);
                return true;
            default:
                C0566s3 c0566s3 = (C0566s3) this.b;
                c0566s3.getClass();
                if (i != 21 && i != 22) {
                    return false;
                }
                if (keyEvent.getAction() == 0) {
                    c0566s3.b(c0566s3.b.getProgress());
                    return false;
                }
                if (keyEvent.getAction() != 1) {
                    return false;
                }
                c0566s3.e();
                return false;
        }
    }
}

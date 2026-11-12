package com.github.catvod.spider.merge.p022z;

import android.app.Dialog;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.Wallpaper;
import com.github.catvod.spider.merge.A.X0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0531l2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ViewOnClickListenerC0531l2(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((Dialog) this.b).dismiss();
                break;
            case 1:
                ((Dialog) this.b).dismiss();
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) this.b;
                if (Wallpaper.hasSelected()) {
                    Wallpaper.clearSelected();
                    X0.a("已清除壁纸");
                    try {
                        LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(0);
                        if (linearLayout2 != null && linearLayout2.getChildCount() > 1) {
                            ((TextView) linearLayout2.getChildAt(1)).setText("未设置");
                            ((TextView) linearLayout2.getChildAt(1)).setTextColor(AbstractC0583w0.i);
                            break;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}

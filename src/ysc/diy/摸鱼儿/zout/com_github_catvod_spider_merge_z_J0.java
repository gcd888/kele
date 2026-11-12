package com.github.catvod.spider.merge.p022z;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class J0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public J0(LinearLayout linearLayout, TextView textView) {
        this.b = linearLayout;
        this.c = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                X1 x1 = (X1) this.c;
                x1.getClass();
                try {
                    ((P0) x1.b).clearEmbyCache(str, true, true);
                    X0.a("已发起清理: " + str);
                } catch (Exception e) {
                    b.x(e, new StringBuilder("清理失败: "));
                    return;
                }
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) this.b;
                boolean z = linearLayout.getVisibility() == 8;
                linearLayout.setVisibility(z ? 0 : 8);
                ((TextView) this.c).setText(z ? "[ - ] 兼容设置 (可选)" : "[ + ] 兼容设置 (可选)");
                break;
        }
    }

    public J0(X1 x1, String str) {
        this.c = x1;
        this.b = str;
    }
}

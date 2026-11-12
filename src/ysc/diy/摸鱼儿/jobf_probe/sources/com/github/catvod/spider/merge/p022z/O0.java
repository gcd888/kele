package com.github.catvod.spider.merge.p022z;

import android.view.View;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class O0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ O0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                X1 x1 = (X1) this.b;
                x1.getClass();
                try {
                    ((P0) x1.b).clearAllEmbyCache();
                    X0.a("已发起全部清理");
                } catch (Exception e) {
                    b.x(e, new StringBuilder("清理失败: "));
                    return;
                }
                break;
            default:
                X0.a("正在重新发送...");
                InitOrigin.execute(new X2(1, this));
                break;
        }
    }
}

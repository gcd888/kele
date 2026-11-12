package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.P0;
import com.github.catvod.spider.merge.p006g.a;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class W implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ W(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.b;
        int i = 0;
        switch (this.a) {
            case 0:
                Activity activityD0 = P1.d0();
                if (activityD0 != null) {
                    boolean[] zArr = {aVar.i()};
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activityD0);
                    int i2 = AbstractC0583w0.c;
                    linearLayoutK.addView(AbstractC0583w0.q(activityD0, "调用规则", "仅在常规规则无法识别时调用模型", i2), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activityD0)));
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activityD0);
                    AbstractC0583w0.m(linearLayoutY, "启用弹幕AI匹配", "常规规则无法识别时才调用", AbstractC0583w0.d, zArr[0], 0, false, null, zArr, null);
                    AbstractC0583w0.k(linearLayoutY, "数据", "发送待匹配片名、集数和候选摘要", i2);
                    linearLayoutK.addView(linearLayoutY);
                    AbstractC0583w0.j0(new AlertDialog.Builder(activityD0).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new P0(zArr, aVar)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    break;
                }
                break;
            default:
                InitOrigin.run(new W(aVar, i));
                break;
        }
    }
}

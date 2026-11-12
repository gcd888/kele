package com.github.catvod.spider.merge.p022z;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.util.Base64;
import android.view.View;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.A.Y1;
import com.github.catvod.spider.merge.A.Z1;
import com.github.catvod.spider.merge.A.a2;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p017u.W;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class N2 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ N2(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Pattern pattern = a2.h;
                Z1.a.getClass();
                Y1 y1D = a2.d();
                if (y1D == null || !y1D.a()) {
                    X0.a("请先配置WebDAV");
                } else {
                    try {
                        String strEncodeToString = Base64.encodeToString((y1D.a + "|" + y1D.b + "|" + y1D.c).getBytes("UTF-8"), 2);
                        StringBuilder sb = new StringBuilder("moyu_webdav:");
                        sb.append(strEncodeToString);
                        ((ClipboardManager) InitOrigin.context().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("WebDAV配置", sb.toString()));
                        X0.a("配置已复制，可分享给新设备");
                    } catch (Exception e) {
                        b.x(e, new StringBuilder("分享失败: "));
                        return;
                    }
                }
                break;
            case 1:
                Pattern pattern2 = a2.h;
                a2 a2Var = Z1.a;
                S s = new S(28);
                X1 x1 = a2Var.d;
                x1.getClass();
                InitOrigin.run(new W(x1, String.valueOf(System.currentTimeMillis()), s, 19));
                break;
            default:
                P1.F("授权Token", Z0.t().E.d());
                break;
        }
    }
}

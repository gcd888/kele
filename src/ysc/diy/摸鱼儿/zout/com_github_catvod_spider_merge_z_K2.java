package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.k2;
import com.github.catvod.spider.merge.p010l.a;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class K2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ K2(a aVar, boolean[] zArr, boolean z) {
        this.d = aVar;
        this.b = zArr;
        this.c = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                boolean z = zArr[0];
                boolean z2 = this.c;
                if (z && !k2.m(z2)) {
                    k2.z(z2, false);
                    X0.a(z2 ? "请先登录夸克" : "请先完成WebDAV快捷配置");
                } else {
                    boolean z3 = zArr[0];
                    String str = (String) this.d;
                    if (!z3) {
                        k2.z(z2, false);
                        X0.a(str + "播放历史自动同步已关闭");
                    } else {
                        k2.z(z2, true);
                        X0.a(str + "播放历史自动同步已开启");
                    }
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                boolean z4 = zArr2[0];
                a aVar = (a) this.d;
                aVar.o = z4;
                aVar.q();
                if (zArr2[0] && !this.c) {
                    P1.z0();
                }
                if (zArr2[0] && !aVar.f()) {
                    X0.a("AI推荐已开启，请继续配置推荐模型");
                } else {
                    X0.a("AI推荐已".concat(zArr2[0] ? "开启" : "关闭"));
                }
                break;
        }
    }

    public /* synthetic */ K2(boolean[] zArr, boolean z, String str) {
        this.b = zArr;
        this.c = z;
        this.d = str;
    }
}

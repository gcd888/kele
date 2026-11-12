package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p000a.I0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class Y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ I0 b;

    public /* synthetic */ Y2(I0 i0, int i) {
        this.a = i;
        this.b = i0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                I0 i0 = this.b;
                if (i0.a == 0) {
                    str = "天翼云盘登录成功";
                } else {
                    str = "登录失败: " + i0.b;
                }
                X0.a(str);
                break;
            default:
                I0 i1 = this.b;
                if (i1.a == 3) {
                    str2 = "验证码已重新发送";
                } else {
                    str2 = "重新发送失败: " + i1.b;
                }
                X0.a(str2);
                break;
        }
    }
}

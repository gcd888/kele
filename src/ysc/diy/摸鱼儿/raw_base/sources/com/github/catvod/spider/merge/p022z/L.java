package com.github.catvod.spider.merge.p022z;

import android.view.View;
import com.github.catvod.spider.merge.D.b;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class L implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ L(int i, int i2, String str, String str2, String str3) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("扫码在手机上输入");
                String str = this.c;
                sb.append(str);
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder("value,");
                String str2 = this.b;
                P1.J0(str2, string, this.d, b.n(sb2, str2, ",", str), this.e);
                break;
            case 1:
                P1.J0(this.b, "手机扫码填写", this.c, this.d, this.e);
                break;
            default:
                P1.J0(this.b, "手机扫码填写账号和密码", this.c, this.d, this.e);
                break;
        }
    }
}

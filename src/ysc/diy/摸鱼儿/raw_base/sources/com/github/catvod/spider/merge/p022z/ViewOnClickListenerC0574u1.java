package com.github.catvod.spider.merge.p022z;

import android.view.View;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0574u1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ ViewOnClickListenerC0574u1(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                P1.J0("关键词设置", "扫码在手机上填写包含词和屏蔽词", this.b, "include,包含关键词,高码,HDR,蓝光|exclude,屏蔽词,枪版,预告,花絮", this.c);
                break;
            default:
                P1.J0("添加接口", "扫码在手机上填写名称和地址", this.b, "name,接口名称,我的接口|url,接口地址,https://example.com", this.c);
                break;
        }
    }
}

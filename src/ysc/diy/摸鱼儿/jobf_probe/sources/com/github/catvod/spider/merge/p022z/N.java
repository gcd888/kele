package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.github.catvod.spider.merge.A.X0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class N implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    public /* synthetic */ N(Activity activity, String str, int i) {
        this.a = i;
        this.b = activity;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        switch (this.a) {
            case 0:
                Context context = this.b;
                if (context != null && (str = this.c) != null && !str.trim().isEmpty()) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str.trim()));
                        intent.addFlags(268435456);
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        X0.a("无法打开浏览器");
                        return;
                    }
                    break;
                }
                break;
            default:
                Context context2 = this.b;
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(this.c));
                    intent2.addFlags(268435456);
                    context2.startActivity(intent2);
                } catch (Exception unused2) {
                    X0.a("无法打开浏览器");
                }
                break;
        }
    }
}

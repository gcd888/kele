package com.github.catvod.spider.merge.p022z;

import android.view.View;
import com.github.catvod.spider.merge.D.b;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class ViewOnClickListenerC0495e1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0559r1 b;

    public ViewOnClickListenerC0495e1(C0559r1 c0559r1, int i) {
        this.b = c0559r1;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2;
        C0559r1 c0559r1 = this.b;
        int i2 = this.a;
        JSONObject jSONObjectL = c0559r1.l(i2);
        if (jSONObjectL == null) {
            return;
        }
        P1.K0(b.i(jSONObjectL.optString("name", "Emby"), " - 登录与安全"), "按功能分开设置", new String[]{"登录状态", "HTTPS 连接", "客户端身份"}, new String[]{((InterfaceC0545o1) c0559r1.a).getEmbyAuthStatus(jSONObjectL), jSONObjectL.optBoolean("embyInsecureTls", false) ? "允许自签名证书" : "严格校验证书", C0559r1.k(jSONObjectL)}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c, AbstractC0583w0.f}, new Runnable[]{new T0(c0559r1, i2, i), new T0(c0559r1, i2, 4), new T0(c0559r1, i2, 5)});
    }
}

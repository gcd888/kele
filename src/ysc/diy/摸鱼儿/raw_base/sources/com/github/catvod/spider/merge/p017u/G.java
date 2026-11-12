package com.github.catvod.spider.merge.p017u;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Libvio;
import com.github.catvod.spider.merge.A.InterfaceC0245c;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.Q;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class G implements InterfaceC0245c, Q {
    public final /* synthetic */ Libvio a;

    public /* synthetic */ G(Libvio libvio) {
        this.a = libvio;
    }

    @Override // com.github.catvod.spider.merge.p022z.Q
    public void a(String str) {
        Libvio libvio = this.a;
        String str2 = Libvio.A;
        libvio.getClass();
        String strU0 = P1.u0(str);
        if (!Libvio.A(strU0)) {
            X0.a("Cookie格式无效");
            return;
        }
        Libvio.saveCookie(strU0);
        synchronized (libvio.s) {
            libvio.w = strU0;
        }
        libvio.y = 0;
        libvio.z = "";
        libvio.T();
        X0.a("Cookie已保存，正在验证");
        InitOrigin.execute(new H(libvio, 3));
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0245c
    public String dispatch(String str) {
        return this.a.action(str);
    }
}

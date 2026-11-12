package com.github.catvod.spider.merge.p017u;

import android.text.TextUtils;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Libvio;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p022z.I;
import com.github.catvod.spider.merge.p022z.P1;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class H implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Libvio b;

    public /* synthetic */ H(Libvio libvio, int i) {
        this.a = i;
        this.b = libvio;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2;
        switch (this.a) {
            case 0:
                Libvio libvio = this.b;
                String str = Libvio.A;
                libvio.getClass();
                String savedCookie = Libvio.getSavedCookie();
                if (TextUtils.isEmpty(savedCookie)) {
                    savedCookie = libvio.w;
                }
                G g = new G(libvio);
                H h = new H(libvio, i);
                InitOrigin.run(new I("立播影视", "Cookie", -14575885, libvio.r().concat("/"), "清除Cookie", h, "在浏览器打开站点并完成验证后复制Cookie", savedCookie, String.valueOf(System.currentTimeMillis()), g));
                return;
            case 1:
                String str2 = Libvio.A;
                P1.V0("立播影视", this.b.r().concat("/"));
                return;
            case 2:
                Libvio libvio2 = this.b;
                String str3 = Libvio.A;
                libvio2.getClass();
                Libvio.clearCookie();
                synchronized (libvio2.s) {
                    libvio2.w = "";
                    libvio2.r.a();
                    break;
                }
                libvio2.x = "";
                libvio2.y = 0;
                libvio2.z = "";
                X0.a("Libvio Cookie已清除");
                return;
            default:
                Libvio libvio3 = this.b;
                String str4 = Libvio.A;
                libvio3.getClass();
                try {
                    String strT = libvio3.t("", libvio3.y());
                    if (TextUtils.isEmpty(strT) || libvio3.y != 2 || libvio3.J(strT)) {
                        libvio3.y = 1;
                        libvio3.z = "Cookie未通过站点验证";
                        X0.a("Cookie未通过站点验证，请重新复制");
                    } else {
                        X0.a("浏览器验证成功，请重新加载首页");
                    }
                    return;
                } catch (Exception unused) {
                    libvio3.y = 1;
                    libvio3.z = "Cookie验证请求失败";
                    X0.a("Cookie验证请求失败");
                    return;
                }
        }
    }
}

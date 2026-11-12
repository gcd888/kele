package com.github.catvod.spider.merge.p017u;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.N0;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0559r1;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.RunnableC0480b1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0463o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0559r1 b;

    public /* synthetic */ RunnableC0463o(C0559r1 c0559r1, int i) {
        this.a = i;
        this.b = c0559r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0559r1 c0559r1 = this.b;
        switch (this.a) {
            case 0:
                c0559r1.getClass();
                P1.K0("添加服务器", "选择类型", new String[]{"WebDAV", "Emby"}, new String[]{"文件服务器", "媒体服务器"}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d}, new Runnable[]{new RunnableC0463o(c0559r1, 8), new RunnableC0463o(c0559r1, 9)});
                break;
            case 1:
                c0559r1.t(false);
                break;
            case 2:
                c0559r1.t(true);
                break;
            case 3:
                c0559r1.getClass();
                InitOrigin.run(new RunnableC0480b1(c0559r1, 1));
                break;
            case 4:
                c0559r1.getClass();
                InitOrigin.run(new RunnableC0480b1(c0559r1, 3));
                break;
            case 5:
                c0559r1.getClass();
                InitOrigin.run(new RunnableC0480b1(c0559r1, 2));
                break;
            case 6:
                c0559r1.getClass();
                InitOrigin.run(new RunnableC0480b1(c0559r1, 4));
                break;
            case 7:
                c0559r1.getClass();
                InitOrigin.run(new RunnableC0480b1(c0559r1, 0));
                break;
            case 8:
                c0559r1.getClass();
                InitOrigin.run(new N0(c0559r1, "webdav", -1, String.valueOf(System.currentTimeMillis())));
                break;
            default:
                c0559r1.getClass();
                InitOrigin.run(new N0(c0559r1, "emby", -1, String.valueOf(System.currentTimeMillis())));
                break;
        }
    }
}

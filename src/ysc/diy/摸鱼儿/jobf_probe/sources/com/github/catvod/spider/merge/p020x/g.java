package com.github.catvod.spider.merge.p020x;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.p017u.RunnableC0466s;
import com.github.catvod.spider.merge.p022z.C0538n;
import com.github.catvod.spider.merge.p022z.I0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class g implements I0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // com.github.catvod.spider.merge.p022z.I0
    public void c(String str) {
        C0538n c0538n = (C0538n) this.a;
        c0538n.getClass();
        C0239a c0239aE = C0239a.e();
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            X0.a("请先输入直播分享链接");
        } else {
            X0.a("正在解析直播链接");
            InitOrigin.execute(new RunnableC0466s(c0538n, (i) this.b, strTrim, c0239aE, (Runnable) this.c, 3));
        }
    }
}

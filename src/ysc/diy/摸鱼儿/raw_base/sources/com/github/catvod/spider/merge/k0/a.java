package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.d;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a {
    public d a;
    public boolean b = false;
    public a c;

    public a(d dVar) {
        d dVar2 = new d();
        this.a = dVar2;
        dVar2.addAll(dVar);
    }

    public final k a() {
        if (this.a.size() == 1) {
            return this.a.d();
        }
        throw new com.github.catvod.spider.merge.c0.a("current context is more than one el,total = " + this.a.size());
    }

    public a(k kVar) {
        d dVar = new d();
        this.a = dVar;
        dVar.add(kVar);
    }
}

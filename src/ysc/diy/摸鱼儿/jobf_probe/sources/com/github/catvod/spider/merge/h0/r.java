package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.A.C0246c0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class r extends t {
    public final C0246c0 b;

    public r(n nVar) {
        this.a = nVar;
        this.b = new C0246c0(nVar);
    }

    @Override // com.github.catvod.spider.merge.h0.n
    public final boolean a(com.github.catvod.spider.merge.f0.k kVar, com.github.catvod.spider.merge.f0.k kVar2) {
        for (int i = 0; i < kVar2.f.size(); i++) {
            com.github.catvod.spider.merge.f0.p pVar = (com.github.catvod.spider.merge.f0.p) kVar2.k().get(i);
            if ((pVar instanceof com.github.catvod.spider.merge.f0.k) && this.b.e(kVar2, (com.github.catvod.spider.merge.f0.k) pVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.a);
    }
}

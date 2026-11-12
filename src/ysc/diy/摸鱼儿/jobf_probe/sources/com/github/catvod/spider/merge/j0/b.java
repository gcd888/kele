package com.github.catvod.spider.merge.j0;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class b extends com.github.catvod.spider.merge.S.o {
    public b(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (!"..".equals(getText())) {
            return new com.github.catvod.spider.merge.k0.b(cVar.a().a);
        }
        HashSet hashSet = new HashSet();
        com.github.catvod.spider.merge.h0.d dVar = new com.github.catvod.spider.merge.h0.d();
        Iterator<E> it = cVar.a().a.iterator();
        while (it.hasNext()) {
            hashSet.add((com.github.catvod.spider.merge.f0.k) ((com.github.catvod.spider.merge.f0.k) it.next()).a);
        }
        dVar.addAll(hashSet);
        return new com.github.catvod.spider.merge.k0.b(dVar);
    }
}

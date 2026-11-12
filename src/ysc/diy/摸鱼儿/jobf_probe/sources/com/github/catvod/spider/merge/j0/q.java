package com.github.catvod.spider.merge.j0;

import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class q extends com.github.catvod.spider.merge.S.o {
    public q(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        List listF = f(e.class);
        if (listF.size() <= 1) {
            return (com.github.catvod.spider.merge.k0.b) cVar.c((com.github.catvod.spider.merge.W.b) listF.get(0));
        }
        Boolean boolA = ((com.github.catvod.spider.merge.k0.b) cVar.c((com.github.catvod.spider.merge.W.b) listF.get(0))).a();
        for (int i = 1; i < listF.size(); i++) {
            boolA = Boolean.valueOf(boolA.booleanValue() | ((com.github.catvod.spider.merge.k0.b) cVar.c((com.github.catvod.spider.merge.W.b) listF.get(i))).a().booleanValue());
        }
        return new com.github.catvod.spider.merge.k0.b(boolA);
    }
}

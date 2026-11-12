package com.github.catvod.spider.merge.j0;

import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class e extends com.github.catvod.spider.merge.S.o {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.github.catvod.spider.merge.S.o oVar, int i, int i2) {
        super(i, oVar);
        this.e = i2;
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        switch (this.e) {
            case 0:
                if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
                    return cVar.d(this);
                }
                cVar.getClass();
                List listF = f(g.class);
                if (listF.size() <= 1) {
                    return (com.github.catvod.spider.merge.k0.b) cVar.c((com.github.catvod.spider.merge.W.b) listF.get(0));
                }
                Boolean boolA = ((com.github.catvod.spider.merge.k0.b) cVar.c((com.github.catvod.spider.merge.W.b) listF.get(0))).a();
                for (int i = 1; i < listF.size(); i++) {
                    boolA = Boolean.valueOf(boolA.booleanValue() & ((com.github.catvod.spider.merge.k0.b) cVar.c((com.github.catvod.spider.merge.W.b) listF.get(i))).a().booleanValue());
                }
                return new com.github.catvod.spider.merge.k0.b(boolA);
            default:
                return cVar instanceof com.github.catvod.spider.merge.k0.c ? cVar.d(this) : cVar.d(this);
        }
    }
}

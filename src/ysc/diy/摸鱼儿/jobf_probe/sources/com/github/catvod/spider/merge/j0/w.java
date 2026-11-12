package com.github.catvod.spider.merge.j0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class w extends com.github.catvod.spider.merge.S.o {
    public w(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        com.github.catvod.spider.merge.k0.b bVar = null;
        for (int i = 0; i < d(); i++) {
            com.github.catvod.spider.merge.W.b bVarC = c(i);
            if (bVarC instanceof x) {
                bVar = (com.github.catvod.spider.merge.k0.b) cVar.c(bVarC);
                Object obj = bVar.a;
                if (obj instanceof com.github.catvod.spider.merge.h0.d) {
                    cVar.b((com.github.catvod.spider.merge.h0.d) obj);
                }
            } else if ("//".equals(bVarC.getText())) {
                cVar.a().b = true;
            } else {
                cVar.a().b = false;
            }
        }
        return bVar;
    }
}

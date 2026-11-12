package com.github.catvod.spider.merge.j0;

import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class d extends com.github.catvod.spider.merge.S.o {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.github.catvod.spider.merge.S.o oVar, int i, int i2) {
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
                List listF = f(m.class);
                if (listF.size() == 1) {
                    return (com.github.catvod.spider.merge.k0.b) cVar.c((com.github.catvod.spider.merge.W.b) listF.get(0));
                }
                Double dC = ((com.github.catvod.spider.merge.k0.b) cVar.c((com.github.catvod.spider.merge.W.b) listF.get(0))).c();
                String text = null;
                for (int i = 1; i < d(); i++) {
                    com.github.catvod.spider.merge.W.b bVarC = c(i);
                    if (bVarC instanceof m) {
                        com.github.catvod.spider.merge.k0.b bVar = (com.github.catvod.spider.merge.k0.b) cVar.c(bVarC);
                        if ("+".equals(text)) {
                            dC = Double.valueOf(bVar.c().doubleValue() + dC.doubleValue());
                        } else {
                            if (!"-".equals(text)) {
                                throw new com.github.catvod.spider.merge.c0.a("syntax error, " + getText());
                            }
                            dC = Double.valueOf(dC.doubleValue() - bVar.c().doubleValue());
                        }
                    } else {
                        text = bVarC.getText();
                    }
                }
                return new com.github.catvod.spider.merge.k0.b(dC);
            default:
                if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
                    return cVar.d(this);
                }
                cVar.getClass();
                return (com.github.catvod.spider.merge.k0.b) ((h) e(h.class)).a(cVar);
        }
    }
}

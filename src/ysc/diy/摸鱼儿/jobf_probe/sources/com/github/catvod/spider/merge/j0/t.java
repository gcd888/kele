package com.github.catvod.spider.merge.j0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class t extends com.github.catvod.spider.merge.S.o {
    public t(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        com.github.catvod.spider.merge.k0.b bVar;
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (((h) e(h.class)) != null && !((h) e(h.class)).h()) {
            return (com.github.catvod.spider.merge.k0.b) ((h) e(h.class)).a(cVar);
        }
        if (((j) e(j.class)) != null && !((j) e(j.class)).h()) {
            return (com.github.catvod.spider.merge.k0.b) ((j) e(j.class)).a(cVar);
        }
        if (g(39) != null) {
            bVar = new com.github.catvod.spider.merge.k0.b(g(39).getText());
            bVar.g();
        } else {
            if (g(6) == null) {
                throw new com.github.catvod.spider.merge.c0.a("not support variableReference:" + getText());
            }
            String text = g(6).getText();
            bVar = new com.github.catvod.spider.merge.k0.b(text == null ? null : Double.valueOf(text));
        }
        return bVar;
    }
}

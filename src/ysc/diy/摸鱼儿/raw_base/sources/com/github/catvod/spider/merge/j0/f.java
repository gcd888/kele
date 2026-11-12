package com.github.catvod.spider.merge.j0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class f extends com.github.catvod.spider.merge.S.o {
    public f(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (g(7) != null) {
            String text = g(7).getText();
            com.github.catvod.spider.merge.D.b.y(com.github.catvod.spider.merge.p0.a.a.get(text));
            throw new com.github.catvod.spider.merge.c0.a(com.github.catvod.spider.merge.D.b.B("not support axis: ", text));
        }
        if (!"@".equals(getText())) {
            return null;
        }
        com.github.catvod.spider.merge.k0.b bVar = new com.github.catvod.spider.merge.k0.b(null);
        bVar.b = true;
        return bVar;
    }
}

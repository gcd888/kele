package com.github.catvod.spider.merge.j0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class p extends com.github.catvod.spider.merge.S.o {
    public p(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (((o) e(o.class)) != null) {
            return (com.github.catvod.spider.merge.k0.b) ((o) e(o.class)).a(cVar);
        }
        if (g(5) == null) {
            return null;
        }
        String text = g(5).getText();
        com.github.catvod.spider.merge.D.b.y(com.github.catvod.spider.merge.p0.a.b.get(text));
        throw new com.github.catvod.spider.merge.c0.a(com.github.catvod.spider.merge.D.b.B("not support nodeTest: ", text));
    }
}

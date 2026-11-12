package com.github.catvod.spider.merge.j0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class o extends com.github.catvod.spider.merge.S.o {
    public o(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if ("*".equals(getText())) {
            com.github.catvod.spider.merge.k0.b bVar = new com.github.catvod.spider.merge.k0.b("*");
            bVar.g();
            return bVar;
        }
        if (((u) e(u.class)) != null && !((u) e(u.class)).h()) {
            return (com.github.catvod.spider.merge.k0.b) ((u) e(u.class)).a(cVar);
        }
        if (((n) e(n.class)) == null || ((n) e(n.class)).h()) {
            return null;
        }
        return (com.github.catvod.spider.merge.k0.b) ((n) e(n.class)).a(cVar);
    }
}

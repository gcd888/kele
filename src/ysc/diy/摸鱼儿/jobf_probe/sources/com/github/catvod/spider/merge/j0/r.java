package com.github.catvod.spider.merge.j0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class r extends com.github.catvod.spider.merge.S.o {
    public com.github.catvod.spider.merge.S.c e;

    public r(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (((l) e(l.class)) != null && !((l) e(l.class)).h()) {
            return (com.github.catvod.spider.merge.k0.b) ((l) e(l.class)).a(cVar);
        }
        com.github.catvod.spider.merge.S.c cVar2 = this.e;
        if (cVar2 == null) {
            return (com.github.catvod.spider.merge.k0.b) ((i) e(i.class)).a(cVar);
        }
        if ("//".equals(cVar2.a())) {
            cVar.a().b = true;
        }
        return (com.github.catvod.spider.merge.k0.b) ((w) e(w.class)).a(cVar);
    }
}

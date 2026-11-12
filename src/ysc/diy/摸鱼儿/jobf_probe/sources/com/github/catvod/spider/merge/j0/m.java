package com.github.catvod.spider.merge.j0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class m extends com.github.catvod.spider.merge.S.o {
    public com.github.catvod.spider.merge.S.c e;

    public m(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (((m) e(m.class)) == null || ((m) e(m.class)).h()) {
            return (com.github.catvod.spider.merge.k0.b) ((y) e(y.class)).a(cVar);
        }
        com.github.catvod.spider.merge.k0.b bVar = (com.github.catvod.spider.merge.k0.b) ((y) e(y.class)).a(cVar);
        com.github.catvod.spider.merge.k0.b bVar2 = (com.github.catvod.spider.merge.k0.b) ((m) e(m.class)).a(cVar);
        switch (this.e.a) {
            case 17:
                return new com.github.catvod.spider.merge.k0.b(Double.valueOf(bVar2.c().doubleValue() * bVar.c().doubleValue()));
            case 18:
                return new com.github.catvod.spider.merge.k0.b(Double.valueOf(bVar.c().doubleValue() / bVar2.c().doubleValue()));
            case 19:
                return new com.github.catvod.spider.merge.k0.b(Double.valueOf(bVar.c().doubleValue() % bVar2.c().doubleValue()));
            default:
                throw new com.github.catvod.spider.merge.c0.a("syntax error, " + getText());
        }
    }
}

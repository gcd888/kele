package com.github.catvod.spider.merge.j0;

import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class v extends com.github.catvod.spider.merge.S.o {
    public com.github.catvod.spider.merge.S.c e;

    public v(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        com.github.catvod.spider.merge.k0.b bVar;
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        List listF = f(d.class);
        if (listF.size() == 1) {
            return (com.github.catvod.spider.merge.k0.b) cVar.c((com.github.catvod.spider.merge.W.b) listF.get(0));
        }
        if (listF.size() != 2) {
            throw new com.github.catvod.spider.merge.c0.a("error equalityExpr near:" + getText());
        }
        com.github.catvod.spider.merge.k0.b bVar2 = (com.github.catvod.spider.merge.k0.b) cVar.c((com.github.catvod.spider.merge.W.b) listF.get(0));
        com.github.catvod.spider.merge.k0.b bVar3 = (com.github.catvod.spider.merge.k0.b) cVar.c((com.github.catvod.spider.merge.W.b) listF.get(1));
        switch (this.e.a) {
            case 24:
                bVar = new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(bVar2.compareTo(bVar3) < 0));
                break;
            case 25:
                bVar = new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(bVar2.compareTo(bVar3) > 0));
                break;
            case 26:
                bVar = new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(bVar2.compareTo(bVar3) <= 0));
                break;
            case 27:
                bVar = new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(bVar2.compareTo(bVar3) >= 0));
                break;
            case 28:
            case 29:
            default:
                throw new com.github.catvod.spider.merge.c0.a("unknown operator" + this.e.a());
            case 30:
                bVar = new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(bVar2.e().startsWith(bVar3.e())));
                break;
            case 31:
                bVar = new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(bVar2.e().endsWith(bVar3.e())));
                break;
            case 32:
                bVar = new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(bVar2.e().contains(bVar3.e())));
                break;
            case 33:
                bVar = new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(bVar2.e().matches(bVar3.e())));
                break;
            case 34:
                bVar = new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(!bVar2.e().matches(bVar3.e())));
                break;
        }
        return bVar;
    }
}

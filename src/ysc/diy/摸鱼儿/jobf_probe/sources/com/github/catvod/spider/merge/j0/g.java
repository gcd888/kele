package com.github.catvod.spider.merge.j0;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class g extends com.github.catvod.spider.merge.S.o {
    public com.github.catvod.spider.merge.S.c e;

    public g(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        com.github.catvod.spider.merge.k0.b bVar;
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        List listF = f(v.class);
        if (listF.size() == 1) {
            return (com.github.catvod.spider.merge.k0.b) ((com.github.catvod.spider.merge.W.b) listF.get(0)).a(cVar);
        }
        if (listF.size() != 2) {
            throw new com.github.catvod.spider.merge.c0.a("error equalityExpr near:" + getText());
        }
        com.github.catvod.spider.merge.k0.b bVar2 = (com.github.catvod.spider.merge.k0.b) ((com.github.catvod.spider.merge.W.b) listF.get(0)).a(cVar);
        com.github.catvod.spider.merge.k0.b bVar3 = (com.github.catvod.spider.merge.k0.b) ((com.github.catvod.spider.merge.W.b) listF.get(1)).a(cVar);
        Class<?> cls = Object.class;
        if ("=".equals(this.e.a())) {
            Object obj = bVar2.a;
            Class<?> cls2 = obj == null ? cls : obj.getClass();
            Object obj2 = bVar3.a;
            bVar = cls2.equals(obj2 != null ? obj2.getClass() : Object.class) ? new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(bVar2.equals(bVar3))) : new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(Objects.equals(bVar2.e(), bVar3.e())));
        } else {
            Object obj3 = bVar2.a;
            Class<?> cls3 = obj3 == null ? cls : obj3.getClass();
            Object obj4 = bVar3.a;
            bVar = cls3.equals(obj4 != null ? obj4.getClass() : Object.class) ? new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(!bVar2.equals(bVar3))) : new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(!Objects.equals(bVar2.e(), bVar3.e())));
        }
        return bVar;
    }
}

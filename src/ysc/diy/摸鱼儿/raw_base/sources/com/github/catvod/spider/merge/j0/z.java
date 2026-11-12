package com.github.catvod.spider.merge.j0;

import java.util.LinkedList;
import java.util.Stack;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class z extends com.github.catvod.spider.merge.S.o {
    public com.github.catvod.spider.merge.S.c e;

    public z(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (((r) e(r.class)) == null && !((r) e(r.class)).h()) {
            return (com.github.catvod.spider.merge.k0.b) ((z) e(z.class)).a(cVar);
        }
        com.github.catvod.spider.merge.k0.b bVar = (com.github.catvod.spider.merge.k0.b) ((r) e(r.class)).a(cVar);
        if (this.e != null) {
            Stack stack = cVar.a;
            com.github.catvod.spider.merge.k0.a aVar = cVar.a().c;
            com.github.catvod.spider.merge.k0.a aVar2 = new com.github.catvod.spider.merge.k0.a(aVar.a);
            aVar2.c = aVar;
            stack.push(aVar2);
            com.github.catvod.spider.merge.k0.b bVar2 = (com.github.catvod.spider.merge.k0.b) ((z) e(z.class)).a(cVar);
            stack.pop();
            Object obj = bVar.a;
            if (obj instanceof com.github.catvod.spider.merge.h0.d) {
                Object obj2 = bVar2.a;
                if (obj2 instanceof com.github.catvod.spider.merge.h0.d) {
                    ((com.github.catvod.spider.merge.h0.d) obj).addAll((com.github.catvod.spider.merge.h0.d) obj2);
                } else {
                    com.github.catvod.spider.merge.f0.k kVar = new com.github.catvod.spider.merge.f0.k();
                    String strE = bVar2.e();
                    com.github.catvod.spider.merge.G.g.e(strE);
                    kVar.z(new com.github.catvod.spider.merge.f0.r(strE));
                    ((com.github.catvod.spider.merge.h0.d) bVar.a).add(kVar);
                }
            } else if (obj instanceof String) {
                if (bVar2.a instanceof com.github.catvod.spider.merge.h0.d) {
                    com.github.catvod.spider.merge.f0.k kVar2 = new com.github.catvod.spider.merge.f0.k();
                    String strE2 = bVar.e();
                    com.github.catvod.spider.merge.G.g.e(strE2);
                    kVar2.z(new com.github.catvod.spider.merge.f0.r(strE2));
                    ((com.github.catvod.spider.merge.h0.d) bVar2.a).add(kVar2);
                    return bVar2;
                }
                bVar = new com.github.catvod.spider.merge.k0.b(bVar.e() + bVar2.e());
            } else if (obj instanceof Boolean) {
                Object obj3 = bVar2.a;
                if (obj3 instanceof Boolean) {
                    bVar = new com.github.catvod.spider.merge.k0.b(Boolean.valueOf(bVar2.a().booleanValue() | bVar.a().booleanValue()));
                } else {
                    if (obj3 instanceof com.github.catvod.spider.merge.h0.d) {
                        com.github.catvod.spider.merge.f0.k kVar3 = new com.github.catvod.spider.merge.f0.k();
                        String strE3 = bVar.e();
                        com.github.catvod.spider.merge.G.g.e(strE3);
                        kVar3.z(new com.github.catvod.spider.merge.f0.r(strE3));
                        ((com.github.catvod.spider.merge.h0.d) bVar2.a).add(kVar3);
                        return bVar2;
                    }
                    if (!(obj3 instanceof String)) {
                        throw new com.github.catvod.spider.merge.c0.a("can not merge val1=" + bVar.a() + ",val2=" + bVar2.e());
                    }
                    bVar = new com.github.catvod.spider.merge.k0.b(bVar.a() + bVar2.e());
                }
            } else if (obj instanceof Number) {
                Object obj4 = bVar2.a;
                if (!(obj4 instanceof String)) {
                    if (!(obj4 instanceof com.github.catvod.spider.merge.h0.d)) {
                        throw new com.github.catvod.spider.merge.c0.a("can not merge val1=" + bVar.c() + ",val2=" + bVar2.e());
                    }
                    com.github.catvod.spider.merge.f0.k kVar4 = new com.github.catvod.spider.merge.f0.k();
                    String strE4 = bVar.e();
                    com.github.catvod.spider.merge.G.g.e(strE4);
                    kVar4.z(new com.github.catvod.spider.merge.f0.r(strE4));
                    ((com.github.catvod.spider.merge.h0.d) bVar2.a).add(kVar4);
                    return bVar2;
                }
                bVar = new com.github.catvod.spider.merge.k0.b(bVar.c() + bVar2.e());
            } else {
                LinkedList linkedList = new LinkedList();
                if (com.github.catvod.spider.merge.Y.c.e(bVar.e())) {
                    linkedList.add(bVar.e());
                }
                if (com.github.catvod.spider.merge.Y.c.e(bVar2.e())) {
                    linkedList.add(bVar2.e());
                }
                bVar = new com.github.catvod.spider.merge.k0.b(com.github.catvod.spider.merge.Y.c.f(linkedList, ","));
            }
        }
        return bVar;
    }
}

package com.github.catvod.spider.merge.j0;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class x extends com.github.catvod.spider.merge.S.o {
    public x(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x021f A[LOOP:6: B:89:0x0219->B:91:0x021f, LOOP_END] */
    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        boolean z;
        com.github.catvod.spider.merge.k0.b bVar;
        Iterator it;
        com.github.catvod.spider.merge.k0.b bVar2;
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (((b) e(b.class)) != null && !((b) e(b.class)).h()) {
            return (com.github.catvod.spider.merge.k0.b) ((b) e(b.class)).a(cVar);
        }
        boolean z2 = false;
        if (((f) e(f.class)) == null || ((f) e(f.class)).h() || (bVar2 = (com.github.catvod.spider.merge.k0.b) ((f) e(f.class)).a(cVar)) == null) {
            z = false;
        } else {
            Object obj = bVar2.a;
            if (obj instanceof com.github.catvod.spider.merge.h0.d) {
                cVar.b((com.github.catvod.spider.merge.h0.d) obj);
            } else if (bVar2.b) {
                z = true;
                z2 = true;
            }
            z = true;
        }
        if (((p) e(p.class)) == null || ((p) e(p.class)).h()) {
            if (f(s.class) != null && f(s.class).size() > 0) {
                it = f(s.class).iterator();
                while (it.hasNext()) {
                    cVar.b((com.github.catvod.spider.merge.h0.d) ((com.github.catvod.spider.merge.k0.b) ((s) it.next()).a(cVar)).a);
                }
            }
            bVar = new com.github.catvod.spider.merge.k0.b(cVar.a().a);
        } else {
            com.github.catvod.spider.merge.k0.b bVar3 = (com.github.catvod.spider.merge.k0.b) ((p) e(p.class)).a(cVar);
            if (z2) {
                com.github.catvod.spider.merge.h0.d dVar = cVar.a().a;
                String strE = bVar3.e();
                if (cVar.a().b) {
                    if (dVar.size() == 1) {
                        com.github.catvod.spider.merge.h0.d dVarQ = cVar.a().a().Q("[" + strE + "]");
                        LinkedList linkedList = new LinkedList();
                        Iterator<E> it2 = dVarQ.iterator();
                        while (it2.hasNext()) {
                            linkedList.add(((com.github.catvod.spider.merge.f0.k) it2.next()).c(strE));
                        }
                        return new com.github.catvod.spider.merge.k0.b(linkedList);
                    }
                    com.github.catvod.spider.merge.h0.d dVar2 = new com.github.catvod.spider.merge.h0.d();
                    Iterator<E> it3 = dVar.iterator();
                    while (it3.hasNext()) {
                        dVar2.addAll(((com.github.catvod.spider.merge.f0.k) it3.next()).Q("[" + strE + "]"));
                    }
                    LinkedList linkedList2 = new LinkedList();
                    Iterator<E> it4 = dVar2.iterator();
                    while (it4.hasNext()) {
                        linkedList2.add(((com.github.catvod.spider.merge.f0.k) it4.next()).c(strE));
                    }
                    return new com.github.catvod.spider.merge.k0.b(linkedList2);
                }
                if (dVar.size() == 1) {
                    bVar = new com.github.catvod.spider.merge.k0.b(cVar.a().a().c(strE));
                } else {
                    LinkedList linkedList3 = new LinkedList();
                    Iterator<E> it5 = dVar.iterator();
                    while (it5.hasNext()) {
                        linkedList3.add(((com.github.catvod.spider.merge.f0.k) it5.next()).c(strE));
                    }
                    bVar = new com.github.catvod.spider.merge.k0.b(linkedList3);
                }
            } else {
                if (bVar3.c) {
                    String strE2 = bVar3.e();
                    com.github.catvod.spider.merge.h0.d dVar3 = cVar.a().a;
                    if (cVar.a().b) {
                        cVar.b(dVar3.f(strE2));
                    } else {
                        com.github.catvod.spider.merge.h0.d dVar4 = new com.github.catvod.spider.merge.h0.d();
                        for (com.github.catvod.spider.merge.f0.k kVar : cVar.a().a) {
                            if (!z) {
                                for (com.github.catvod.spider.merge.f0.k kVar2 : kVar.D()) {
                                    if (kVar2.p().equals(strE2) || "*".equals(strE2)) {
                                        dVar4.add(kVar2);
                                    }
                                }
                            } else if (kVar.p().equals(strE2) || "*".equals(strE2)) {
                                dVar4.add(kVar);
                            }
                        }
                        cVar.b(dVar4);
                    }
                } else {
                    Object obj2 = bVar3.a;
                    if (!(obj2 instanceof com.github.catvod.spider.merge.h0.d)) {
                        return bVar3;
                    }
                    cVar.b((com.github.catvod.spider.merge.h0.d) obj2);
                }
                if (f(s.class) != null) {
                    it = f(s.class).iterator();
                    while (it.hasNext()) {
                        cVar.b((com.github.catvod.spider.merge.h0.d) ((com.github.catvod.spider.merge.k0.b) ((s) it.next()).a(cVar)).a);
                    }
                }
                bVar = new com.github.catvod.spider.merge.k0.b(cVar.a().a);
            }
        }
        return bVar;
    }
}

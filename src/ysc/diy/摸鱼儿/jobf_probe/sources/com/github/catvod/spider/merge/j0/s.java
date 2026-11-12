package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.A.C0246c0;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class s extends com.github.catvod.spider.merge.S.o {
    public s(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        long j;
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        com.github.catvod.spider.merge.h0.d dVar = new com.github.catvod.spider.merge.h0.d();
        for (com.github.catvod.spider.merge.f0.k kVar : cVar.a().a) {
            Stack stack = cVar.a;
            com.github.catvod.spider.merge.k0.a aVar = new com.github.catvod.spider.merge.k0.a(kVar);
            aVar.c = cVar.a();
            stack.push(aVar);
            com.github.catvod.spider.merge.k0.b bVar = (com.github.catvod.spider.merge.k0.b) ((h) e(h.class)).a(cVar);
            stack.pop();
            Object obj = bVar.a;
            if (obj instanceof Number) {
                long jLongValue = bVar.d().longValue();
                long j2 = 0;
                if (jLongValue < 0) {
                    if (Objects.equals(kVar.d.a, "JX_TEXT")) {
                        String strC = kVar.c("EL_SAME_TAG_ALL_NUM");
                        j = ((long) (com.github.catvod.spider.merge.Y.c.b(strC) ? -1 : Integer.parseInt(strC))) + jLongValue + 1;
                        jLongValue = 1;
                    } else {
                        com.github.catvod.spider.merge.k0.a aVarA = cVar.a();
                        com.github.catvod.spider.merge.h0.d dVar2 = new com.github.catvod.spider.merge.h0.d();
                        com.github.catvod.spider.merge.f0.k kVar2 = (com.github.catvod.spider.merge.f0.k) kVar.a;
                        String str = kVar.d.a;
                        kVar2.getClass();
                        com.github.catvod.spider.merge.G.g.c(str);
                        com.github.catvod.spider.merge.h0.f fVar = new com.github.catvod.spider.merge.h0.f(com.github.catvod.spider.merge.l0.i.b(str), 9, false);
                        com.github.catvod.spider.merge.h0.d<com.github.catvod.spider.merge.f0.k> dVar3 = new com.github.catvod.spider.merge.h0.d();
                        com.github.catvod.spider.merge.l0.k.a(new C0246c0(kVar2, dVar3, fVar), kVar2);
                        for (com.github.catvod.spider.merge.f0.k kVar3 : dVar3) {
                            if (aVarA.a.contains(kVar3)) {
                                dVar2.add(kVar3);
                            }
                        }
                        long size = ((long) dVar2.size()) + jLongValue;
                        jLongValue = 1;
                        j = size + 1;
                        j2 = 0;
                    }
                    if (j >= j2) {
                        jLongValue = j;
                    }
                }
                if (Objects.equals(kVar.d.a, "JX_TEXT")) {
                    String strC2 = kVar.c("EL_SAME_TAG_INDEX");
                    if (jLongValue == (com.github.catvod.spider.merge.Y.c.b(strC2) ? -1 : Integer.parseInt(strC2))) {
                        dVar.add(kVar);
                    }
                } else {
                    com.github.catvod.spider.merge.k0.a aVarA2 = cVar.a();
                    int i = 1;
                    for (com.github.catvod.spider.merge.f0.k kVar4 : ((com.github.catvod.spider.merge.f0.k) kVar.a).D()) {
                        if (kVar.d.a.equals(kVar4.d.a) && aVarA2.a.contains(kVar4)) {
                            if (kVar.equals(kVar4)) {
                                break;
                            }
                            i++;
                        }
                    }
                    if (jLongValue == i) {
                        dVar.add(kVar);
                    }
                }
            } else if (obj instanceof Boolean) {
                if (bVar.a().booleanValue()) {
                    dVar.add(kVar);
                }
            } else if (obj instanceof String) {
                if (com.github.catvod.spider.merge.Y.c.e(bVar.e())) {
                    dVar.add(kVar);
                }
            } else if (!(obj instanceof com.github.catvod.spider.merge.h0.d)) {
                if (!(obj instanceof List)) {
                    throw new com.github.catvod.spider.merge.c0.a("unknown expr val:" + bVar);
                }
                if (((List) obj).size() > 0) {
                    dVar.add(kVar);
                }
            } else if (((com.github.catvod.spider.merge.h0.d) obj).size() > 0) {
                dVar.add(kVar);
            }
        }
        return new com.github.catvod.spider.merge.k0.b(dVar);
    }
}

package com.github.catvod.spider.merge.j0;

import java.util.LinkedList;
import java.util.Stack;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class j extends com.github.catvod.spider.merge.S.o {
    public j(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        LinkedList linkedList = new LinkedList();
        com.github.catvod.spider.merge.k0.b bVar = (com.github.catvod.spider.merge.k0.b) ((k) e(k.class)).a(cVar);
        for (h hVar : f(h.class)) {
            Stack stack = cVar.a;
            com.github.catvod.spider.merge.k0.a aVarA = cVar.a();
            com.github.catvod.spider.merge.k0.a aVar = new com.github.catvod.spider.merge.k0.a(aVarA.a);
            aVar.c = aVarA;
            stack.push(aVar);
            linkedList.add(hVar.a(cVar));
            stack.pop();
        }
        String strE = bVar.e();
        com.github.catvod.spider.merge.D.b.y(com.github.catvod.spider.merge.p0.a.c.get(strE));
        throw new com.github.catvod.spider.merge.c0.a(com.github.catvod.spider.merge.D.b.B("not support function: ", strE));
    }
}

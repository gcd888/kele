package com.github.catvod.spider.merge.j0;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class u extends com.github.catvod.spider.merge.S.o {
    public u(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        List listF = f(n.class);
        if (listF == null) {
            return null;
        }
        if (listF.size() <= 1) {
            return (com.github.catvod.spider.merge.k0.b) cVar.c((com.github.catvod.spider.merge.W.b) listF.get(0));
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.k0.b bVar = (com.github.catvod.spider.merge.k0.b) cVar.c((n) it.next());
            if (bVar != null) {
                linkedList.add(bVar.e());
            }
        }
        return new com.github.catvod.spider.merge.k0.b(com.github.catvod.spider.merge.Y.c.f(linkedList, ":"));
    }
}

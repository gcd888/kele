package com.github.catvod.spider.merge.j0;

import java.util.Objects;
import java.util.Stack;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class c extends com.github.catvod.spider.merge.S.o {
    public com.github.catvod.spider.merge.S.c e;

    public c(int i, com.github.catvod.spider.merge.S.o oVar) {
        super(i, oVar);
    }

    @Override // com.github.catvod.spider.merge.S.o, com.github.catvod.spider.merge.W.b
    public final Object a(com.github.catvod.spider.merge.k0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.k0.c)) {
            return cVar.d(this);
        }
        Stack stack = cVar.a;
        com.github.catvod.spider.merge.k0.a aVar = new com.github.catvod.spider.merge.k0.a(cVar.b.a);
        aVar.c = cVar.a();
        stack.push(aVar);
        if (Objects.equals(this.e.a(), "//")) {
            cVar.a().b = true;
        }
        com.github.catvod.spider.merge.k0.b bVar = (com.github.catvod.spider.merge.k0.b) ((w) e(w.class)).a(cVar);
        stack.pop();
        return bVar;
    }
}

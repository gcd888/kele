package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.S.o;
import com.github.catvod.spider.merge.h0.d;
import java.util.Stack;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class c {
    public final Stack a;
    public final a b;

    public c(d dVar) {
        com.github.catvod.spider.merge.q0.b.d(c.class);
        Stack stack = new Stack();
        this.a = stack;
        a aVar = new a(dVar);
        this.b = aVar;
        a aVar2 = new a(dVar);
        aVar2.c = aVar;
        stack.push(aVar2);
    }

    public final a a() {
        return (a) this.a.peek();
    }

    public final void b(d dVar) {
        ((a) this.a.peek()).a = dVar;
    }

    public final Object c(com.github.catvod.spider.merge.W.b bVar) {
        return bVar.a(this);
    }

    public final Object d(o oVar) {
        int iD = oVar.d();
        Object objA = null;
        for (int i = 0; i < iD; i++) {
            objA = oVar.c(i).a(this);
        }
        return objA;
    }
}

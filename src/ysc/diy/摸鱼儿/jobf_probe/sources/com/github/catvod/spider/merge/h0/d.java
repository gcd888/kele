package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.A.C0246c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class d extends ArrayList {
    public d() {
    }

    public final String a(String str) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) it.next();
            if (kVar.l(str)) {
                return kVar.c(str);
            }
        }
        return "";
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) it.next();
            if (kVar.l("data-clipboard-text")) {
                arrayList.add(kVar.c("data-clipboard-text"));
            }
        }
        return arrayList;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) it.next();
            if (kVar.J()) {
                arrayList.add(kVar.T());
            }
        }
        return arrayList;
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        d dVar = new d(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            dVar.add(((com.github.catvod.spider.merge.f0.k) it.next()).clone());
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.github.catvod.spider.merge.f0.k d() {
        if (isEmpty()) {
            return null;
        }
        return (com.github.catvod.spider.merge.f0.k) get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.github.catvod.spider.merge.f0.k e() {
        if (isEmpty()) {
            return null;
        }
        return (com.github.catvod.spider.merge.f0.k) get(size() - 1);
    }

    public final d f(String str) {
        com.github.catvod.spider.merge.G.g.c(str);
        n nVarJ = p.j(str);
        d dVar = new d();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) it.next();
            com.github.catvod.spider.merge.G.g.e(nVarJ);
            com.github.catvod.spider.merge.G.g.e(kVar);
            d<com.github.catvod.spider.merge.f0.k> dVar2 = new d();
            com.github.catvod.spider.merge.l0.k.a(new C0246c0(kVar, dVar2, nVarJ), kVar);
            for (com.github.catvod.spider.merge.f0.k kVar2 : dVar2) {
                if (identityHashMap.put(kVar2, Boolean.TRUE) == null) {
                    dVar.add(kVar2);
                }
            }
        }
        return dVar;
    }

    public final String g() {
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) it.next();
            if (sbB.length() != 0) {
                sbB.append(" ");
            }
            sbB.append(kVar.T());
        }
        return com.github.catvod.spider.merge.e0.b.g(sbB);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) it.next();
            if (sbB.length() != 0) {
                sbB.append("\n");
            }
            sbB.append(kVar.q());
        }
        return com.github.catvod.spider.merge.e0.b.g(sbB);
    }

    public d(int i) {
        super(i);
    }

    public d(List list) {
        super(list);
    }

    public d(com.github.catvod.spider.merge.f0.k... kVarArr) {
        super(Arrays.asList(kVarArr));
    }
}

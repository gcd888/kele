package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.g0.D;
import com.github.catvod.spider.merge.g0.E;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class e extends n {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.h0.n
    public final boolean a(com.github.catvod.spider.merge.f0.k kVar, com.github.catvod.spider.merge.f0.k kVar2) {
        d dVar;
        switch (this.a) {
            case 0:
                return true;
            case 1:
                for (com.github.catvod.spider.merge.f0.p pVar : kVar2.g()) {
                    if (!(pVar instanceof com.github.catvod.spider.merge.f0.d) && !(pVar instanceof com.github.catvod.spider.merge.f0.h)) {
                        return false;
                    }
                }
                return true;
            case 2:
                com.github.catvod.spider.merge.f0.k kVar3 = (com.github.catvod.spider.merge.f0.k) kVar2.a;
                return (kVar3 == null || (kVar3 instanceof com.github.catvod.spider.merge.f0.g) || kVar2.H() != 0) ? false : true;
            case 3:
                com.github.catvod.spider.merge.f0.k kVar4 = (com.github.catvod.spider.merge.f0.k) kVar2.a;
                return (kVar4 == null || (kVar4 instanceof com.github.catvod.spider.merge.f0.g) || kVar2.H() != kVar4.D().size() - 1) ? false : true;
            case 4:
                com.github.catvod.spider.merge.f0.p pVar2 = kVar2.a;
                com.github.catvod.spider.merge.f0.k kVar5 = (com.github.catvod.spider.merge.f0.k) pVar2;
                if (kVar5 == null || (kVar5 instanceof com.github.catvod.spider.merge.f0.g)) {
                    return false;
                }
                if (pVar2 == null) {
                    dVar = new d(0);
                } else {
                    List<com.github.catvod.spider.merge.f0.k> listC = ((com.github.catvod.spider.merge.f0.k) pVar2).C();
                    d dVar2 = new d(listC.size() - 1);
                    for (com.github.catvod.spider.merge.f0.k kVar6 : listC) {
                        if (kVar6 != kVar2) {
                            dVar2.add(kVar6);
                        }
                    }
                    dVar = dVar2;
                }
                return dVar.isEmpty();
            case 5:
                com.github.catvod.spider.merge.f0.k kVar7 = (com.github.catvod.spider.merge.f0.k) kVar2.a;
                if (kVar7 == null || (kVar7 instanceof com.github.catvod.spider.merge.f0.g)) {
                    return false;
                }
                Iterator<E> it = kVar7.D().iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((com.github.catvod.spider.merge.f0.k) it.next()).d.equals(kVar2.d)) {
                        i++;
                    }
                }
                return i == 1;
            case 6:
                if (kVar instanceof com.github.catvod.spider.merge.f0.g) {
                    kVar = (com.github.catvod.spider.merge.f0.k) kVar.C().get(0);
                }
                return kVar2 == kVar;
            case 7:
                if (kVar2 instanceof com.github.catvod.spider.merge.f0.q) {
                    return true;
                }
                kVar2.getClass();
                ArrayList arrayList = new ArrayList();
                for (com.github.catvod.spider.merge.f0.p pVar3 : kVar2.f) {
                    if (pVar3 instanceof com.github.catvod.spider.merge.f0.r) {
                        arrayList.add((com.github.catvod.spider.merge.f0.r) pVar3);
                    }
                }
                Iterator it2 = Collections.unmodifiableList(arrayList).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        return false;
                    }
                    com.github.catvod.spider.merge.f0.r rVar = (com.github.catvod.spider.merge.f0.r) it2.next();
                    com.github.catvod.spider.merge.f0.q qVar = new com.github.catvod.spider.merge.f0.q(E.a(kVar2.d.a, D.d), kVar2.e(), kVar2.d());
                    rVar.getClass();
                    com.github.catvod.spider.merge.G.g.e(rVar.a);
                    com.github.catvod.spider.merge.f0.p pVar4 = rVar.a;
                    pVar4.getClass();
                    com.github.catvod.spider.merge.G.g.a(rVar.a == pVar4);
                    com.github.catvod.spider.merge.f0.p pVar5 = qVar.a;
                    if (pVar5 != null) {
                        pVar5.x(qVar);
                    }
                    int i2 = rVar.b;
                    pVar4.k().set(i2, qVar);
                    qVar.a = pVar4;
                    qVar.b = i2;
                    rVar.a = null;
                    qVar.z(rVar);
                }
                break;
            default:
                return kVar == kVar2;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "*";
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return super.toString();
        }
    }
}

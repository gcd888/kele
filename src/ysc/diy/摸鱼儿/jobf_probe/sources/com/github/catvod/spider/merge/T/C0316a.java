package com.github.catvod.spider.merge.T;

import com.github.catvod.spider.merge.A.X1;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0316a {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public U[] c;
    public V[] d;
    public final int e;
    public final int f;
    public int[] g;
    public InterfaceC0338x[] h;
    public final ArrayList i;

    public C0316a(int i, int i2) {
        new LinkedHashMap();
        this.i = new ArrayList();
        this.e = i;
        this.f = i2;
    }

    public final r a(int i) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (r) arrayList.get(i);
    }

    public final com.github.catvod.spider.merge.V.f b(int i, com.github.catvod.spider.merge.S.o oVar) {
        if (i >= 0) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                com.github.catvod.spider.merge.V.f fVarC = c((AbstractC0324i) arrayList.get(i));
                if (!fVarC.d(-2)) {
                    return fVarC;
                }
                com.github.catvod.spider.merge.V.f fVar = new com.github.catvod.spider.merge.V.f(new int[0]);
                fVar.c(fVarC);
                fVar.f();
                while (oVar != null) {
                    int i2 = oVar.b;
                    if (i2 < 0 || !fVarC.d(-2)) {
                        break;
                    }
                    fVarC = c(((W) ((AbstractC0324i) arrayList.get(i2)).c(0)).c);
                    fVar.c(fVarC);
                    fVar.f();
                    oVar = oVar.a;
                }
                if (fVarC.d(-2)) {
                    fVar.a(-1);
                }
                return fVar;
            }
        }
        throw new IllegalArgumentException("Invalid state number.");
    }

    public final com.github.catvod.spider.merge.V.f c(AbstractC0324i abstractC0324i) {
        com.github.catvod.spider.merge.V.f fVar = abstractC0324i.f;
        if (fVar != null) {
            return fVar;
        }
        com.github.catvod.spider.merge.V.f fVarD = d(abstractC0324i, null);
        abstractC0324i.f = fVarD;
        fVarD.b = true;
        return fVarD;
    }

    public final com.github.catvod.spider.merge.V.f d(AbstractC0324i abstractC0324i, com.github.catvod.spider.merge.S.o oVar) {
        X1 x1 = new X1(1, this);
        com.github.catvod.spider.merge.V.f fVar = new com.github.catvod.spider.merge.V.f(new int[0]);
        x1.g(abstractC0324i, oVar != null ? P.a(abstractC0324i.a, oVar) : null, fVar, new HashSet(), new BitSet());
        return fVar;
    }
}

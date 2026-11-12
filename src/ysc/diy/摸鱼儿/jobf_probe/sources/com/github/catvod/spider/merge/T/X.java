package com.github.catvod.spider.merge.T;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class X extends Z {
    public final c0[] b;

    public X(c0 c0Var, c0 c0Var2) {
        HashSet hashSet = new HashSet();
        if (c0Var instanceof X) {
            hashSet.addAll(Arrays.asList(((X) c0Var).b));
        } else {
            hashSet.add(c0Var);
        }
        if (c0Var2 instanceof X) {
            hashSet.addAll(Arrays.asList(((X) c0Var2).b));
        } else {
            hashSet.add(c0Var2);
        }
        List listA = c0.a(hashSet);
        if (!listA.isEmpty()) {
            hashSet.add((a0) Collections.min(listA));
        }
        this.b = (c0[]) hashSet.toArray(new c0[hashSet.size()]);
    }

    @Override // com.github.catvod.spider.merge.T.c0
    public final boolean c(com.github.catvod.spider.merge.S.r rVar, com.github.catvod.spider.merge.S.o oVar) {
        for (c0 c0Var : this.b) {
            if (!c0Var.c(rVar, oVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.T.c0
    public final c0 d(com.github.catvod.spider.merge.S.r rVar, com.github.catvod.spider.merge.S.o oVar) {
        ArrayList arrayList = new ArrayList();
        c0[] c0VarArr = this.b;
        int length = c0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            b0 b0Var = c0.a;
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return b0Var;
                }
                c0 c0VarB = (c0) arrayList.get(0);
                for (int i3 = 1; i3 < arrayList.size(); i3++) {
                    c0VarB = c0.b(c0VarB, (c0) arrayList.get(i3));
                }
                return c0VarB;
            }
            c0 c0Var = c0VarArr[i];
            c0 c0VarD = c0Var.d(rVar, oVar);
            i2 |= c0VarD == c0Var ? 0 : 1;
            if (c0VarD == null) {
                return null;
            }
            if (c0VarD != b0Var) {
                arrayList.add(c0VarD);
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof X) {
            return Arrays.equals(this.b, ((X) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = X.class.hashCode();
        c0[] c0VarArr = this.b;
        for (c0 c0Var : c0VarArr) {
            iHashCode = com.github.catvod.spider.merge.l0.e.c(iHashCode, c0Var);
        }
        return com.github.catvod.spider.merge.l0.e.a(iHashCode, c0VarArr.length);
    }

    public final String toString() {
        return com.github.catvod.spider.merge.l0.f.a(Arrays.asList(this.b).iterator(), "&&");
    }
}

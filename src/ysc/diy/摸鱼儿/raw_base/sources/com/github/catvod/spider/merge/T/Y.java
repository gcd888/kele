package com.github.catvod.spider.merge.T;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class Y extends Z {
    public final c0[] b;

    public Y(c0 c0Var, c0 c0Var2) {
        HashSet hashSet = new HashSet();
        if (c0Var instanceof Y) {
            hashSet.addAll(Arrays.asList(((Y) c0Var).b));
        } else {
            hashSet.add(c0Var);
        }
        if (c0Var2 instanceof Y) {
            hashSet.addAll(Arrays.asList(((Y) c0Var2).b));
        } else {
            hashSet.add(c0Var2);
        }
        List listA = c0.a(hashSet);
        if (!listA.isEmpty()) {
            hashSet.add((a0) Collections.max(listA));
        }
        this.b = (c0[]) hashSet.toArray(new c0[hashSet.size()]);
    }

    @Override // com.github.catvod.spider.merge.T.c0
    public final boolean c(com.github.catvod.spider.merge.S.r rVar, com.github.catvod.spider.merge.S.o oVar) {
        for (c0 c0Var : this.b) {
            if (c0Var.c(rVar, oVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.T.c0
    public final c0 d(com.github.catvod.spider.merge.S.r rVar, com.github.catvod.spider.merge.S.o oVar) {
        ArrayList arrayList = new ArrayList();
        c0[] c0VarArr = this.b;
        int length = c0VarArr.length;
        int i = 0;
        boolean z = false;
        while (true) {
            b0 b0Var = c0.a;
            if (i >= length) {
                if (!z) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                c0 c0Var = (c0) arrayList.get(0);
                for (int i2 = 1; i2 < arrayList.size(); i2++) {
                    c0 c0Var2 = (c0) arrayList.get(i2);
                    if (c0Var == null) {
                        c0Var = c0Var2;
                    } else if (c0Var2 != null) {
                        if (c0Var == b0Var || c0Var2 == b0Var) {
                            c0Var = b0Var;
                        } else {
                            Y y = new Y(c0Var, c0Var2);
                            c0[] c0VarArr2 = y.b;
                            c0Var = c0VarArr2.length == 1 ? c0VarArr2[0] : y;
                        }
                    }
                }
                return c0Var;
            }
            c0 c0Var3 = c0VarArr[i];
            c0 c0VarD = c0Var3.d(rVar, oVar);
            z |= c0VarD != c0Var3;
            if (c0VarD == b0Var) {
                return b0Var;
            }
            if (c0VarD != null) {
                arrayList.add(c0VarD);
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y) {
            return Arrays.equals(this.b, ((Y) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Y.class.hashCode();
        c0[] c0VarArr = this.b;
        for (c0 c0Var : c0VarArr) {
            iHashCode = com.github.catvod.spider.merge.l0.e.c(iHashCode, c0Var);
        }
        return com.github.catvod.spider.merge.l0.e.a(iHashCode, c0VarArr.length);
    }

    public final String toString() {
        return com.github.catvod.spider.merge.l0.f.a(Arrays.asList(this.b).iterator(), "||");
    }
}

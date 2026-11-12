package com.github.catvod.spider.merge.T;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class c0 {
    public static final b0 a = new b0();

    public static List a(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (c0Var instanceof a0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((a0) c0Var);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public static c0 b(c0 c0Var, c0 c0Var2) {
        b0 b0Var;
        if (c0Var == null || c0Var == (b0Var = a)) {
            return c0Var2;
        }
        if (c0Var2 == null || c0Var2 == b0Var) {
            return c0Var;
        }
        X x = new X(c0Var, c0Var2);
        c0[] c0VarArr = x.b;
        return c0VarArr.length == 1 ? c0VarArr[0] : x;
    }

    public abstract boolean c(com.github.catvod.spider.merge.S.r rVar, com.github.catvod.spider.merge.S.o oVar);

    public c0 d(com.github.catvod.spider.merge.S.r rVar, com.github.catvod.spider.merge.S.o oVar) {
        return this;
    }
}

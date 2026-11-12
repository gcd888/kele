package com.github.catvod.spider.merge.T;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class k0 {
    public final AbstractC0324i a;

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));
        Collections.unmodifiableMap(new j0(0));
    }

    public k0(AbstractC0324i abstractC0324i) {
        if (abstractC0324i == null) {
            throw new NullPointerException("target cannot be null.");
        }
        this.a = abstractC0324i;
    }

    public abstract int a();

    public boolean b() {
        return this instanceof C0326k;
    }

    public com.github.catvod.spider.merge.V.f c() {
        return null;
    }

    public abstract boolean d(int i, int i2);
}

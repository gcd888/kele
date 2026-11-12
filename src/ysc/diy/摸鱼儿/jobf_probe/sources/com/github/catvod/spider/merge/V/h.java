package com.github.catvod.spider.merge.V;

import java.io.Serializable;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class h implements Serializable {
    public final Object a;
    public final Object b;

    public h(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        Object obj2 = hVar.a;
        Object obj3 = this.a;
        if (obj3 == null) {
            zEquals = obj2 == null;
        } else {
            zEquals = obj3.equals(obj2);
        }
        if (zEquals) {
            Object obj4 = this.b;
            Object obj5 = hVar.b;
            if (obj4 == null) {
                zEquals2 = obj5 == null;
            } else {
                zEquals2 = obj4.equals(obj5);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.c(com.github.catvod.spider.merge.l0.e.c(0, this.a), this.b), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}

package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.d;
import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a {
    public final Object a;

    public a(Object obj) {
        this.a = obj;
    }

    public final String a() {
        Object obj = this.a;
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof k)) {
            return String.valueOf(obj);
        }
        k kVar = (k) obj;
        return Objects.equals(kVar.d.a, "JX_TEXT") ? kVar.N() : kVar.q();
    }

    public final a b(String str) {
        LinkedList linkedListU;
        Object obj = this.a;
        if (obj instanceof k) {
            linkedListU = new X1(5, new d((k) obj)).U(str);
        } else {
            linkedListU = null;
        }
        if (linkedListU == null || linkedListU.size() <= 0) {
            return null;
        }
        return (a) linkedListU.get(0);
    }

    public final String toString() {
        return a();
    }
}

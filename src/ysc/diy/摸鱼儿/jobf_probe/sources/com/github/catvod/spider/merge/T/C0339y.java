package com.github.catvod.spider.merge.T;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0339y {
    public final InterfaceC0338x[] a;
    public final int b;

    public C0339y(InterfaceC0338x[] interfaceC0338xArr) {
        this.a = interfaceC0338xArr;
        int iC = 0;
        for (InterfaceC0338x interfaceC0338x : interfaceC0338xArr) {
            iC = com.github.catvod.spider.merge.l0.e.c(iC, interfaceC0338x);
        }
        this.b = com.github.catvod.spider.merge.l0.e.a(iC, interfaceC0338xArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0339y)) {
            return false;
        }
        C0339y c0339y = (C0339y) obj;
        return this.b == c0339y.b && Arrays.equals(this.a, c0339y.a);
    }

    public final int hashCode() {
        return this.b;
    }
}

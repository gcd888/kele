package com.github.catvod.spider.merge.V;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class e {
    public static final e[] c = new e[1001];
    public int a;
    public int b;

    public e(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static e a(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new e(i, i2);
        }
        e[] eVarArr = c;
        if (eVarArr[i] == null) {
            eVarArr[i] = new e(i, i);
        }
        return eVarArr[i];
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    public final int hashCode() {
        return ((713 + this.a) * 31) + this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}

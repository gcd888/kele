package com.github.catvod.spider.merge.f0;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class b implements Iterable, Cloneable {
    public int a = 0;
    public String[] b = new String[3];
    public Object[] c = new Object[3];

    public static boolean i(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    public final void a(Object obj, String str) {
        b(this.a + 1);
        String[] strArr = this.b;
        int i = this.a;
        strArr[i] = str;
        this.c[i] = obj;
        this.a = i + 1;
    }

    public final void b(int i) {
        com.github.catvod.spider.merge.G.g.a(i >= this.a);
        String[] strArr = this.b;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.a * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.b = (String[]) Arrays.copyOf(strArr, i);
        this.c = Arrays.copyOf(this.c, i);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.a = this.a;
            bVar.b = (String[]) Arrays.copyOf(this.b, this.a);
            bVar.c = Arrays.copyOf(this.c, this.a);
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final String d(String str) {
        Object obj;
        int iG = g(str);
        return (iG == -1 || (obj = this.c[iG]) == null) ? "" : (String) obj;
    }

    public final String e(String str) {
        Object obj;
        int iH = h(str);
        return (iH == -1 || (obj = this.c[iH]) == null) ? "" : (String) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a != bVar.a) {
            return false;
        }
        for (int i = 0; i < this.a; i++) {
            int iG = bVar.g(this.b[i]);
            if (iG == -1) {
                return false;
            }
            Object obj2 = this.c[i];
            Object obj3 = bVar.c[iG];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public final void f(Appendable appendable, f fVar) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (!i(this.b[i2])) {
                String strA = a.a(fVar.h, this.b[i2]);
                if (strA != null) {
                    a.b(strA, (String) this.c[i2], appendable.append(' '), fVar);
                }
            }
        }
    }

    public final int g(String str) {
        com.github.catvod.spider.merge.G.g.e(str);
        for (int i = 0; i < this.a; i++) {
            if (str.equals(this.b[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int h(String str) {
        com.github.catvod.spider.merge.G.g.e(str);
        for (int i = 0; i < this.a; i++) {
            if (str.equalsIgnoreCase(this.b[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + (((this.a * 31) + Arrays.hashCode(this.b)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new com.github.catvod.spider.merge.G.b(this);
    }

    public final void j(a aVar) {
        String str = aVar.b;
        if (str == null) {
            str = "";
        }
        k(aVar.a, str);
        aVar.c = this;
    }

    public final void k(String str, String str2) {
        com.github.catvod.spider.merge.G.g.e(str);
        int iG = g(str);
        if (iG != -1) {
            this.c[iG] = str2;
        } else {
            a(str2, str);
        }
    }

    public final void l(int i) {
        int i2 = this.a;
        if (i >= i2) {
            throw new com.github.catvod.spider.merge.d0.b("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = this.b;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            Object[] objArr = this.c;
            System.arraycopy(objArr, i4, objArr, i, i3);
        }
        int i5 = this.a - 1;
        this.a = i5;
        this.b[i5] = null;
        this.c[i5] = null;
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        try {
            f(sbB, new g("").j);
            return com.github.catvod.spider.merge.e0.b.g(sbB);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.c0.a(e);
        }
    }
}

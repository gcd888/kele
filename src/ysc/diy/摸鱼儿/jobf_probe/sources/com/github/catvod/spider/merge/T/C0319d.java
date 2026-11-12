package com.github.catvod.spider.merge.T;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0319d implements Set {
    public final com.github.catvod.spider.merge.l0.d a;
    public Object[][] b;
    public int c;
    public int d;
    public final int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0319d(int i) {
        this(C0318c.a);
        switch (i) {
            case 1:
                this(com.github.catvod.spider.merge.V.g.a);
                break;
            default:
                break;
        }
    }

    public final boolean a(C0317b c0317b) {
        if (c0317b == null) {
            return false;
        }
        Object[] objArr = this.b[b(c0317b)];
        Object obj = null;
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    break;
                }
                if (this.a.a(obj2, c0317b)) {
                    obj = obj2;
                    break;
                }
            }
        }
        return obj != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return c(obj) == obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (c(obj) != obj) {
                z = true;
            }
        }
        return z;
    }

    public final int b(Object obj) {
        return this.a.b(obj) & (this.b.length - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(Object obj) {
        Object[] objArrCopyOf;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        if (i > i2) {
            Object[][] objArr = this.b;
            int length = objArr.length * 2;
            Object[][] objArr2 = new C0317b[length][];
            int[] iArr = new int[length];
            this.b = objArr2;
            double d = length;
            Double.isNaN(d);
            this.d = (int) (d * 0.75d);
            for (Object[] objArr3 : objArr) {
                if (objArr3 != null) {
                    for (Object obj2 : objArr3) {
                        if (obj2 == null) {
                            break;
                        }
                        int iB = b(obj2);
                        int i4 = iArr[iB];
                        if (i4 == 0) {
                            objArrCopyOf = new C0317b[i3];
                            objArr2[iB] = objArrCopyOf;
                        } else {
                            objArrCopyOf = objArr2[iB];
                            if (i4 == objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length * 2);
                                objArr2[iB] = objArrCopyOf;
                            }
                        }
                        objArrCopyOf[i4] = obj2;
                        iArr[iB] = iArr[iB] + 1;
                    }
                }
            }
        }
        int iB2 = b(obj);
        Object[][] objArr4 = this.b;
        Object[] objArr5 = objArr4[iB2];
        if (objArr5 == null) {
            Object[] objArr6 = new C0317b[i3];
            objArr6[0] = obj;
            objArr4[iB2] = objArr6;
            this.c++;
            return obj;
        }
        for (int i5 = 0; i5 < objArr5.length; i5++) {
            Object obj3 = objArr5[i5];
            if (obj3 == null) {
                objArr5[i5] = obj;
                this.c++;
                return obj;
            }
            if (this.a.a(obj3, obj)) {
                return obj3;
            }
        }
        int length2 = objArr5.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr5, objArr5.length * 2);
        this.b[iB2] = objArrCopyOf2;
        objArrCopyOf2[length2] = obj;
        this.c++;
        return obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b = new C0317b[16][];
        this.c = 0;
        this.d = (int) Math.floor(12.0d);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return a(!(obj instanceof C0317b) ? null : (C0317b) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (!(collection instanceof C0319d)) {
            for (Object obj : collection) {
                if (!a(!(obj instanceof C0317b) ? null : (C0317b) obj)) {
                    return false;
                }
            }
            return true;
        }
        for (Object[] objArr : ((C0319d) collection).b) {
            if (objArr != null) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        break;
                    }
                    if (!a(!(obj2 instanceof C0317b) ? null : (C0317b) obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean d(C0317b c0317b) {
        Object obj;
        if (c0317b == null) {
            return false;
        }
        Object[] objArr = this.b[b(c0317b)];
        if (objArr == null) {
            return false;
        }
        for (int i = 0; i < objArr.length && (obj = objArr[i]) != null; i++) {
            if (this.a.a(obj, c0317b)) {
                System.arraycopy(objArr, i + 1, objArr, i, (objArr.length - i) - 1);
                objArr[objArr.length - 1] = null;
                this.c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0319d)) {
            return false;
        }
        C0319d c0319d = (C0319d) obj;
        if (c0319d.c != this.c) {
            return false;
        }
        return containsAll(c0319d);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iB = 0;
        for (Object[] objArr : this.b) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    iB = com.github.catvod.spider.merge.l0.e.b(iB, this.a.b(obj));
                }
            }
        }
        return com.github.catvod.spider.merge.l0.e.a(iB, this.c);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new com.github.catvod.spider.merge.V.a(this, toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return d(!(obj instanceof C0317b) ? null : (C0317b) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zD = false;
        for (Object obj : collection) {
            zD |= d(!(obj instanceof C0317b) ? null : (C0317b) obj);
        }
        return zD;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Object obj;
        int i = 0;
        for (Object[] objArr : this.b) {
            if (objArr != null) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < objArr.length && (obj = objArr[i2]) != null) {
                    if (collection.contains(obj)) {
                        if (i2 != i3) {
                            objArr[i3] = objArr[i2];
                        }
                        i3++;
                        i++;
                    }
                    i2++;
                }
                i += i3;
                while (i3 < i2) {
                    objArr[i3] = null;
                    i3++;
                }
            }
        }
        boolean z = i != this.c;
        this.c = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0317b[] c0317bArr = new C0317b[this.c];
        int i = 0;
        for (Object[] objArr : this.b) {
            if (objArr != null) {
                int length = objArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        break;
                    }
                    c0317bArr[i] = obj;
                    i2++;
                    i++;
                }
            }
        }
        return c0317bArr;
    }

    public final String toString() {
        if (this.c == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (Object[] objArr : this.b) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(obj.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0319d(com.github.catvod.spider.merge.l0.d dVar) {
        this.c = 0;
        this.d = (int) Math.floor(12.0d);
        this.a = dVar;
        this.b = new C0317b[16][];
        this.e = 2;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = 0;
        for (Object[] objArr2 : this.b) {
            if (objArr2 != null) {
                int length2 = objArr2.length;
                int i3 = 0;
                while (i3 < length2) {
                    Object obj = objArr2[i3];
                    if (obj == null) {
                        break;
                    }
                    objArr[i2] = obj;
                    i3++;
                    i2++;
                }
            }
        }
        return objArr;
    }
}

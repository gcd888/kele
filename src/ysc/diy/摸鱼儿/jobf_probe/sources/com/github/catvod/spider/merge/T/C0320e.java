package com.github.catvod.spider.merge.T;

import com.github.catvod.spider.merge.A.X1;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class C0320e implements Set {
    public int d;
    public BitSet e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public boolean a = false;
    public final ArrayList c = new ArrayList(7);
    public int i = -1;
    public C0319d b = new C0319d(0);

    public C0320e(boolean z) {
        this.h = z;
    }

    public final void a(C0317b c0317b, X1 x1) {
        if (this.a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (c0317b.e != c0.a) {
            this.f = true;
        }
        if ((c0317b.d & (-1073741825)) > 0) {
            this.g = true;
        }
        C0317b c0317b2 = (C0317b) this.b.c(c0317b);
        if (c0317b2 == c0317b) {
            this.i = -1;
            this.c.add(c0317b);
            return;
        }
        P pG = P.g(c0317b2.c, c0317b.c, !this.h, x1);
        c0317b2.d = Math.max(c0317b2.d, c0317b.d);
        if (c0317b.b()) {
            c0317b2.d |= 1073741824;
        }
        c0317b2.c = pG;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        a((C0317b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a((C0317b) it.next(), null);
        }
        return false;
    }

    public final void b(AbstractC0323h abstractC0323h) {
        if (this.a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (this.b.isEmpty()) {
            return;
        }
        for (C0317b c0317b : this.c) {
            P pB = c0317b.c;
            Q q = abstractC0323h.b;
            if (q != null) {
                synchronized (q) {
                    pB = P.b(pB, abstractC0323h.b, new IdentityHashMap());
                }
            }
            c0317b.c = pB;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.a) {
            throw new IllegalStateException("This set is readonly");
        }
        this.c.clear();
        this.i = -1;
        this.b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        C0319d c0319d = this.b;
        if (c0319d != null) {
            return c0319d.contains(obj);
        }
        throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0320e)) {
            return false;
        }
        C0320e c0320e = (C0320e) obj;
        ArrayList arrayList = this.c;
        return arrayList != null && arrayList.equals(c0320e.c) && this.h == c0320e.h && this.d == c0320e.d && this.e == c0320e.e && this.f == c0320e.f && this.g == c0320e.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        boolean z = this.a;
        ArrayList arrayList = this.c;
        if (!z) {
            return arrayList.hashCode();
        }
        if (this.i == -1) {
            this.i = arrayList.hashCode();
        }
        return this.i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.c.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return (C0317b[]) this.b.toArray();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.toString());
        if (this.f) {
            sb.append(",hasSemanticContext=");
            sb.append(this.f);
        }
        if (this.d != 0) {
            sb.append(",uniqueAlt=");
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append(",conflictingAlts=");
            sb.append(this.e);
        }
        if (this.g) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.b.toArray(objArr);
    }
}

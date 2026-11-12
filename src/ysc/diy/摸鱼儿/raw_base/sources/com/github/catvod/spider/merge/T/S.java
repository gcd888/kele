package com.github.catvod.spider.merge.T;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class S implements Map {
    public int b = 0;
    public int c = 12;
    public LinkedList[] a = new LinkedList[8];

    @Override // java.util.Map
    public final void clear() {
        this.a = new LinkedList[16];
        this.b = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        boolean z;
        if (obj == null) {
            return null;
        }
        C0317b c0317b = (C0317b) obj;
        int iA = com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.c(com.github.catvod.spider.merge.l0.e.b(7, c0317b.a.b), c0317b.c), 2);
        LinkedList[] linkedListArr = this.a;
        LinkedList<com.github.catvod.spider.merge.V.b> linkedList = linkedListArr[iA & (linkedListArr.length - 1)];
        if (linkedList == null) {
            return null;
        }
        for (com.github.catvod.spider.merge.V.b bVar : linkedList) {
            C0317b c0317b2 = (C0317b) bVar.a;
            C0317b c0317b3 = (C0317b) obj;
            if (c0317b2 == c0317b3) {
                z = true;
            } else {
                z = false;
                if (c0317b2 != null && c0317b2.a.b == c0317b3.a.b && c0317b2.c.equals(c0317b3.c)) {
                    z = true;
                }
            }
            if (z) {
                return bVar.b;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        com.github.catvod.spider.merge.V.b bVar;
        int iB = 0;
        for (LinkedList linkedList : this.a) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (bVar = (com.github.catvod.spider.merge.V.b) it.next()) != null) {
                    C0317b c0317b = (C0317b) bVar.a;
                    iB = com.github.catvod.spider.merge.l0.e.b(iB, com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.c(com.github.catvod.spider.merge.l0.e.b(7, c0317b.a.b), c0317b.c), 2));
                }
            }
        }
        return com.github.catvod.spider.merge.l0.e.a(iB, this.b);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        com.github.catvod.spider.merge.V.b bVar;
        if (obj == null) {
            return null;
        }
        int i = this.b;
        if (i > this.c) {
            LinkedList[] linkedListArr = this.a;
            int length = linkedListArr.length * 2;
            this.a = new LinkedList[length];
            double d = length;
            Double.isNaN(d);
            this.c = (int) (d * 0.75d);
            for (LinkedList linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext() && (bVar = (com.github.catvod.spider.merge.V.b) it.next()) != null) {
                        put(bVar.a, bVar.b);
                    }
                }
            }
            this.b = i;
        }
        C0317b c0317b = (C0317b) obj;
        int iA = com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.c(com.github.catvod.spider.merge.l0.e.b(7, c0317b.a.b), c0317b.c), 2);
        LinkedList[] linkedListArr2 = this.a;
        int length2 = iA & (linkedListArr2.length - 1);
        LinkedList<com.github.catvod.spider.merge.V.b> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList();
            linkedListArr2[length2] = linkedList2;
        }
        for (com.github.catvod.spider.merge.V.b bVar2 : linkedList2) {
            C0317b c0317b2 = (C0317b) bVar2.a;
            C0317b c0317b3 = (C0317b) obj;
            if (c0317b2 == c0317b3 || (c0317b2 != null && c0317b2.a.b == c0317b3.a.b && c0317b2.c.equals(c0317b3.c))) {
                Object obj3 = bVar2.b;
                bVar2.b = obj2;
                this.b++;
                return obj3;
            }
        }
        linkedList2.add(new com.github.catvod.spider.merge.V.b(obj, obj2));
        this.b++;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.b;
    }

    public final String toString() {
        com.github.catvod.spider.merge.V.b bVar;
        if (this.b == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (LinkedList linkedList : this.a) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (bVar = (com.github.catvod.spider.merge.V.b) it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(bVar.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ArrayList arrayList = new ArrayList(this.b);
        for (LinkedList linkedList : this.a) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.github.catvod.spider.merge.V.b) it.next()).b);
                }
            }
        }
        return arrayList;
    }
}

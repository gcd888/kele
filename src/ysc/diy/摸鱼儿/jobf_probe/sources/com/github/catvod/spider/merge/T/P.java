package com.github.catvod.spider.merge.T;

import com.github.catvod.spider.merge.A.X1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class P {
    public static final C0333s b = new C0333s();
    public final int a;

    public P(int i) {
        this.a = i;
    }

    public static e0 a(C0316a c0316a, com.github.catvod.spider.merge.S.o oVar) {
        com.github.catvod.spider.merge.S.o oVar2 = com.github.catvod.spider.merge.S.o.d;
        if (oVar == null) {
            oVar = oVar2;
        }
        com.github.catvod.spider.merge.S.o oVar3 = oVar.a;
        return (oVar3 == null || oVar == oVar2) ? b : e0.i(a(c0316a, oVar3), ((W) ((AbstractC0324i) c0316a.a.get(oVar.b)).c(0)).c.b);
    }

    public static P b(P p, Q q, IdentityHashMap identityHashMap) {
        if (p.f()) {
            return p;
        }
        P p2 = (P) identityHashMap.get(p);
        if (p2 != null) {
            return p2;
        }
        P p3 = (P) q.a.get(p);
        if (p3 != null) {
            identityHashMap.put(p, p3);
            return p3;
        }
        P[] pArr = new P[p.h()];
        boolean z = false;
        for (int i = 0; i < pArr.length; i++) {
            P pB = b(p.c(i), q, identityHashMap);
            if (z || pB != p.c(i)) {
                if (!z) {
                    pArr = new P[p.h()];
                    for (int i2 = 0; i2 < p.h(); i2++) {
                        pArr[i2] = p.c(i2);
                    }
                    z = true;
                }
                pArr[i] = pB;
            }
        }
        C0333s c0333s = b;
        HashMap map = q.a;
        if (!z) {
            if (p != c0333s && ((P) map.get(p)) == null) {
                map.put(p, p);
            }
            identityHashMap.put(p, p);
            return p;
        }
        P pI = pArr.length == 0 ? c0333s : pArr.length == 1 ? e0.i(pArr[0], p.d(0)) : new C0327l(pArr, ((C0327l) p).d);
        if (pI != c0333s && ((P) map.get(pI)) == null) {
            map.put(pI, pI);
        }
        identityHashMap.put(pI, pI);
        identityHashMap.put(p, pI);
        return pI;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    public static P g(P p, P p2, boolean z, X1 x1) {
        P[] pArr;
        P[] pArr2;
        int[] iArr;
        int i;
        int i2;
        P c0327l;
        P c0327l2;
        P p3;
        P c0327l3 = p;
        P c0327l4 = p2;
        if (c0327l3 == c0327l4 || p.equals(p2)) {
            return c0327l3;
        }
        boolean z2 = c0327l3 instanceof e0;
        if (z2 && (c0327l4 instanceof e0)) {
            e0 e0Var = (e0) c0327l3;
            e0 e0Var2 = (e0) c0327l4;
            if (x1 != null && ((p3 = (P) x1.A(e0Var, e0Var2)) != null || (p3 = (P) x1.A(e0Var2, e0Var)) != null)) {
                return p3;
            }
            P p4 = e0Var.c;
            int i3 = e0Var.d;
            P p5 = null;
            P c0327l5 = b;
            if (z) {
                if (e0Var != c0327l5 && e0Var2 != c0327l5) {
                    c0327l5 = null;
                }
            } else if (e0Var != c0327l5 || e0Var2 != c0327l5) {
                if (e0Var == c0327l5) {
                    c0327l5 = new C0327l(new P[]{e0Var2.c, null}, new int[]{e0Var2.d, Integer.MAX_VALUE});
                } else if (e0Var2 == c0327l5) {
                    c0327l5 = new C0327l(new P[]{p4, null}, new int[]{i3, Integer.MAX_VALUE});
                } else {
                    c0327l5 = null;
                }
            }
            if (c0327l5 != null) {
                if (x1 != null) {
                    x1.Q(e0Var, e0Var2, c0327l5);
                }
                return c0327l5;
            }
            int i4 = e0Var2.d;
            P p6 = e0Var2.c;
            if (i3 == i4) {
                P pG = g(p4, p6, z, x1);
                if (pG == p4) {
                    return e0Var;
                }
                if (pG == p6) {
                    return e0Var2;
                }
                c0327l2 = e0.i(pG, i3);
                if (x1 != null) {
                    x1.Q(e0Var, e0Var2, c0327l2);
                }
            } else {
                if (e0Var == e0Var2 || (p4 != null && p4.equals(p6))) {
                    p5 = p4;
                }
                int i5 = e0Var2.d;
                if (p5 != null) {
                    int[] iArr2 = {i3, i5};
                    if (i3 > i5) {
                        iArr2[0] = i5;
                        iArr2[1] = i3;
                    }
                    P c0327l6 = new C0327l(new P[]{p5, p5}, iArr2);
                    if (x1 != null) {
                        x1.Q(e0Var, e0Var2, c0327l6);
                    }
                    return c0327l6;
                }
                int[] iArr3 = {i3, i5};
                P[] pArr3 = {p4, p6};
                if (i3 > i5) {
                    iArr3[0] = i5;
                    iArr3[1] = i3;
                    pArr3 = new P[]{p6, p4};
                }
                c0327l2 = new C0327l(pArr3, iArr3);
                if (x1 != null) {
                    x1.Q(e0Var, e0Var2, c0327l2);
                }
            }
            return c0327l2;
        }
        if (z) {
            if (c0327l3 instanceof C0333s) {
                return c0327l3;
            }
            if (c0327l4 instanceof C0333s) {
                return c0327l4;
            }
        }
        if (z2) {
            c0327l3 = new C0327l((e0) c0327l3);
        }
        if (c0327l4 instanceof e0) {
            c0327l4 = new C0327l((e0) c0327l4);
        }
        C0327l c0327l7 = (C0327l) c0327l3;
        C0327l c0327l8 = (C0327l) c0327l4;
        if (x1 == null || ((c0327l = (P) x1.A(c0327l7, c0327l8)) == null && (c0327l = (P) x1.A(c0327l8, c0327l7)) == null)) {
            int[] iArr4 = c0327l7.d;
            int length = iArr4.length;
            int[] iArr5 = c0327l8.d;
            int[] iArrCopyOf = new int[length + iArr5.length];
            int length2 = iArr4.length + iArr5.length;
            P[] pArr4 = new P[length2];
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int length3 = iArr4.length;
                pArr = c0327l7.c;
                pArr2 = c0327l8.c;
                iArr = c0327l8.d;
                if (i6 >= length3 || i7 >= iArr.length) {
                    break;
                }
                P p7 = pArr[i6];
                P p8 = pArr2[i7];
                int i9 = iArr4[i6];
                int i10 = iArr[i7];
                if (i9 == i10) {
                    boolean z3 = i9 == Integer.MAX_VALUE && p7 == null && p8 == null;
                    boolean z4 = (p7 == null || p8 == null || !p7.equals(p8)) ? false : true;
                    if (z3 || z4) {
                        pArr4[i8] = p7;
                        iArrCopyOf[i8] = i9;
                    } else {
                        pArr4[i8] = g(p7, p8, z, x1);
                        iArrCopyOf[i8] = i9;
                    }
                    i6++;
                } else {
                    if (i9 < i10) {
                        pArr4[i8] = p7;
                        iArrCopyOf[i8] = i9;
                        i6++;
                    } else {
                        pArr4[i8] = p8;
                        iArrCopyOf[i8] = i10;
                    }
                    i8++;
                }
                i7++;
                i8++;
            }
            if (i6 < iArr4.length) {
                while (i6 < iArr4.length) {
                    pArr4[i8] = pArr[i6];
                    iArrCopyOf[i8] = iArr4[i6];
                    i8++;
                    i6++;
                }
                i = 1;
            } else {
                i = 1;
                while (i7 < iArr.length) {
                    pArr4[i8] = pArr2[i7];
                    iArrCopyOf[i8] = iArr[i7];
                    i8++;
                    i7++;
                }
            }
            if (i8 >= length2) {
                i2 = 0;
            } else {
                if (i8 == i) {
                    P pI = e0.i(pArr4[0], iArrCopyOf[0]);
                    if (x1 != null) {
                        x1.Q(c0327l7, c0327l8, pI);
                    }
                    return pI;
                }
                i2 = 0;
                pArr4 = (P[]) Arrays.copyOf(pArr4, i8);
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i8);
            }
            c0327l = new C0327l(pArr4, iArrCopyOf);
            if (c0327l.equals(c0327l7)) {
                if (x1 == null) {
                    return c0327l7;
                }
                x1.Q(c0327l7, c0327l8, c0327l7);
                return c0327l7;
            }
            if (c0327l.equals(c0327l8)) {
                if (x1 != null) {
                    x1.Q(c0327l7, c0327l8, c0327l8);
                }
                return c0327l8;
            }
            HashMap map = new HashMap();
            for (P p9 : pArr4) {
                if (!map.containsKey(p9)) {
                    map.put(p9, p9);
                }
            }
            while (i2 < pArr4.length) {
                pArr4[i2] = (P) map.get(pArr4[i2]);
                i2++;
            }
            if (x1 != null) {
                x1.Q(c0327l7, c0327l8, c0327l);
            }
        }
        return c0327l;
    }

    public abstract P c(int i);

    public abstract int d(int i);

    public final boolean e() {
        return d(h() - 1) == Integer.MAX_VALUE;
    }

    public abstract boolean equals(Object obj);

    public boolean f() {
        return this == b;
    }

    public abstract int h();

    public final int hashCode() {
        return this.a;
    }
}

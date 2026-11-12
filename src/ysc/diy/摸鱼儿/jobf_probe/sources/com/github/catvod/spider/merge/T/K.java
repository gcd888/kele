package com.github.catvod.spider.merge.T;

import com.github.catvod.spider.merge.A.X1;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class K extends AbstractC0323h {
    public static final boolean k;
    public final com.github.catvod.spider.merge.S.n d;
    public final com.github.catvod.spider.merge.U.b[] e;
    public X1 f;
    public com.github.catvod.spider.merge.S.e g;
    public int h;
    public com.github.catvod.spider.merge.S.o i;
    public com.github.catvod.spider.merge.U.b j;

    static {
        String str;
        try {
            str = System.getenv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT");
        } catch (SecurityException unused) {
            str = null;
        }
        k = Boolean.parseBoolean(str);
    }

    public K(com.github.catvod.spider.merge.S.n nVar, C0316a c0316a, com.github.catvod.spider.merge.U.b[] bVarArr, Q q) {
        super(c0316a, q);
        this.d = nVar;
        this.e = bVarArr;
    }

    public static int l(C0320e c0320e) {
        com.github.catvod.spider.merge.V.f fVar = new com.github.catvod.spider.merge.V.f(new int[0]);
        for (C0317b c0317b : c0320e.c) {
            if ((c0317b.d & (-1073741825)) > 0 || ((c0317b.a instanceof V) && c0317b.c.e())) {
                fVar.a(c0317b.b);
            }
        }
        if (fVar.g() == 0) {
            return 0;
        }
        if (fVar.e()) {
            throw new RuntimeException("set is empty");
        }
        return ((com.github.catvod.spider.merge.V.e) fVar.a.get(0)).a;
    }

    public static int n(C0320e c0320e) {
        int i = 0;
        for (C0317b c0317b : c0320e.c) {
            if (i == 0) {
                i = c0317b.b;
            } else if (c0317b.b != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.T.AbstractC0323h
    public final void a() {
    }

    public final int b(int i, com.github.catvod.spider.merge.S.e eVar, com.github.catvod.spider.merge.S.o oVar) {
        com.github.catvod.spider.merge.U.d dVarD;
        int i2;
        this.g = eVar;
        int i3 = eVar.a;
        this.h = i3;
        this.i = oVar;
        com.github.catvod.spider.merge.U.b bVar = this.e[i];
        this.j = bVar;
        try {
            boolean z = bVar.e;
            int i4 = -1;
            if (z) {
                com.github.catvod.spider.merge.V.d dVar = this.d.f;
                int i5 = dVar.b;
                if (i5 == 0) {
                    i2 = -1;
                } else {
                    int i6 = i5 - 1;
                    if (i6 < 0 || i6 >= i5) {
                        throw new IndexOutOfBoundsException();
                    }
                    i2 = dVar.a[i6];
                }
                if (!z) {
                    throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
                }
                dVarD = (i2 < 0 || i2 >= bVar.b.c.length) ? null : bVar.b.c[i2];
            } else {
                dVarD = bVar.b;
            }
            if (dVarD == null) {
                com.github.catvod.spider.merge.S.o oVar2 = com.github.catvod.spider.merge.S.o.d;
                if (oVar == null) {
                    oVar = oVar2;
                }
                C0320e c0320eI = i(bVar.d, oVar2, false);
                if (bVar.e) {
                    bVar.b.b = c0320eI;
                    dVarD = d(bVar, new com.github.catvod.spider.merge.U.d(e(c0320eI)));
                    com.github.catvod.spider.merge.V.d dVar2 = this.d.f;
                    int i7 = dVar2.b;
                    if (i7 != 0) {
                        int i8 = i7 - 1;
                        if (i8 < 0 || i8 >= i7) {
                            throw new IndexOutOfBoundsException();
                        }
                        i4 = dVar2.a[i8];
                    }
                    bVar.a(i4, dVarD);
                } else {
                    dVarD = d(bVar, new com.github.catvod.spider.merge.U.d(c0320eI));
                    bVar.b = dVarD;
                }
            }
            int iK = k(bVar, dVarD, eVar, i3, oVar);
            this.f = null;
            this.j = null;
            eVar.i(i3);
            return iK;
        } catch (Throwable th) {
            this.f = null;
            this.j = null;
            eVar.i(i3);
            throw th;
        }
    }

    public final com.github.catvod.spider.merge.U.d c(com.github.catvod.spider.merge.U.b bVar, com.github.catvod.spider.merge.U.d dVar, int i, com.github.catvod.spider.merge.U.d dVar2) {
        if (dVar2 == null) {
            return null;
        }
        com.github.catvod.spider.merge.U.d dVarD = d(bVar, dVar2);
        if (i < -1 || i > this.a.f) {
            return dVarD;
        }
        synchronized (dVar) {
            try {
                if (dVar.c == null) {
                    dVar.c = new com.github.catvod.spider.merge.U.d[this.a.f + 2];
                }
                dVar.c[i + 1] = dVarD;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarD;
    }

    public final com.github.catvod.spider.merge.U.d d(com.github.catvod.spider.merge.U.b bVar, com.github.catvod.spider.merge.U.d dVar) {
        if (dVar == AbstractC0323h.c) {
            return dVar;
        }
        synchronized (bVar.a) {
            try {
                com.github.catvod.spider.merge.U.d dVar2 = (com.github.catvod.spider.merge.U.d) bVar.a.get(dVar);
                if (dVar2 != null) {
                    return dVar2;
                }
                dVar.a = bVar.a.size();
                C0320e c0320e = dVar.b;
                if (!c0320e.a) {
                    c0320e.b(this);
                    C0320e c0320e2 = dVar.b;
                    c0320e2.a = true;
                    c0320e2.b = null;
                }
                bVar.a.put(dVar, dVar);
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0320e e(C0320e c0320e) {
        P p;
        HashMap map = new HashMap();
        C0320e c0320e2 = new C0320e(c0320e.h);
        ArrayList<C0317b> arrayList = c0320e.c;
        for (C0317b c0317b : arrayList) {
            if (c0317b.b == 1) {
                com.github.catvod.spider.merge.S.o oVar = this.i;
                c0 c0Var = c0317b.e;
                c0 c0VarD = c0Var.d(this.d, oVar);
                if (c0VarD != null) {
                    AbstractC0324i abstractC0324i = c0317b.a;
                    map.put(Integer.valueOf(abstractC0324i.b), c0317b.c);
                    if (c0VarD != c0Var) {
                        c0320e2.a(new C0317b(c0317b, abstractC0324i, c0317b.c, c0VarD), this.f);
                    } else {
                        c0320e2.a(c0317b, this.f);
                    }
                }
            }
        }
        for (C0317b c0317b2 : arrayList) {
            if (c0317b2.b != 1 && (c0317b2.b() || (p = (P) map.get(Integer.valueOf(c0317b2.a.b))) == null || !p.equals(c0317b2.c))) {
                c0320e2.a(c0317b2, this.f);
            }
        }
        return c0320e2;
    }

    public final void f(C0317b c0317b, C0320e c0320e, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        if (c0317b.a instanceof V) {
            if (!c0317b.c.f()) {
                for (int i2 = 0; i2 < c0317b.c.h(); i2++) {
                    int iD = c0317b.c.d(i2);
                    c0 c0Var = c0317b.e;
                    if (iD != Integer.MAX_VALUE) {
                        C0317b c0317b2 = new C0317b((AbstractC0324i) this.a.a.get(c0317b.c.d(i2)), c0317b.b, c0317b.c.c(i2), c0Var);
                        c0317b2.d = c0317b.d;
                        f(c0317b2, c0320e, hashSet, z, z2, i - 1, z3);
                    } else if (z2) {
                        c0320e.a(new C0317b(c0317b, c0317b.a, P.b, c0Var), this.f);
                    } else {
                        g(c0317b, c0320e, hashSet, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c0320e.a(c0317b, this.f);
                return;
            }
        }
        g(c0317b, c0320e, hashSet, z, z2, i, z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:107:0x0209  */
    /* JADX WARN: Code duplicated, block: B:109:0x020f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:67:0x0117  */
    /* JADX WARN: Code duplicated, block: B:76:0x0159  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:79:0x017b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0198  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01df  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e3  */
    public final void g(C0317b c0317b, C0320e c0320e, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        k0 k0VarC;
        boolean z4;
        boolean z5;
        int iA;
        c0 c0Var;
        N n;
        C0317b c0317b2;
        int i2;
        int i3;
        com.github.catvod.spider.merge.U.b bVar;
        C0317b c0317b3;
        O o;
        boolean z6;
        AbstractC0324i abstractC0324i = c0317b.a;
        if (!abstractC0324i.d) {
            c0320e.a(c0317b, this.f);
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < abstractC0324i.e.size()) {
            AbstractC0324i abstractC0324i2 = c0317b.a;
            if (i5 != 0 || k || abstractC0324i2.b() != 10 || !((g0) abstractC0324i2).j || c0317b.c.f() || c0317b.c.e()) {
                k0VarC = abstractC0324i.c(i5);
                if ((k0VarC instanceof C0326k) && z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iA = k0VarC.a();
                c0Var = c0317b.e;
                com.github.catvod.spider.merge.S.n nVar = this.d;
                if (iA != 10) {
                    switch (iA) {
                        case 1:
                            c0317b3 = new C0317b(c0317b, k0VarC.a, c0317b.c, c0Var);
                            c0317b2 = c0317b3;
                            break;
                        case 2:
                        case 5:
                        case 7:
                            if (!z3 && k0VarC.d(-1, 1)) {
                                c0317b3 = new C0317b(c0317b, k0VarC.a, c0317b.c, c0Var);
                                c0317b2 = c0317b3;
                            } else {
                                c0317b2 = null;
                            }
                            break;
                        case 3:
                            W w = (W) k0VarC;
                            c0317b2 = new C0317b(c0317b, w.a, e0.i(c0317b.c, w.c.b), c0Var);
                            break;
                        case 4:
                            o = (O) k0VarC;
                            if (z4 || ((z6 = o.d) && !(z6 && z5))) {
                                c0317b3 = new C0317b(c0317b, o.a, c0317b.c, c0Var);
                            } else if (z2) {
                                com.github.catvod.spider.merge.S.e eVar = this.g;
                                int i6 = eVar.a;
                                eVar.i(this.h);
                                nVar.getClass();
                                this.g.i(i6);
                                c0317b3 = new C0317b(c0317b, o.a, c0317b.c, c0Var);
                            } else {
                                c0317b3 = new C0317b(c0317b, o.a, c0317b.c, c0.b(c0Var, new b0(o.b, o.c, z6)));
                            }
                            c0317b2 = c0317b3;
                            break;
                        case 6:
                            c0317b2 = new C0317b(c0317b, ((C0326k) k0VarC).a, c0317b.c, c0Var);
                            break;
                        default:
                            c0317b2 = null;
                            break;
                    }
                } else {
                    n = (N) k0VarC;
                    if (z4 || !z5) {
                        c0317b2 = new C0317b(c0317b, n.a, c0317b.c, c0Var);
                    } else {
                        int i7 = n.b;
                        if (z2) {
                            com.github.catvod.spider.merge.S.e eVar2 = this.g;
                            int i8 = eVar2.a;
                            eVar2.i(this.h);
                            boolean zB = nVar.b(i7);
                            this.g.i(i8);
                            if (zB) {
                                c0317b2 = new C0317b(c0317b, n.a, c0317b.c, c0Var);
                            } else {
                                c0317b2 = null;
                            }
                        } else {
                            c0317b2 = new C0317b(c0317b, n.a, c0317b.c, c0.b(c0Var, new a0(i7)));
                        }
                    }
                }
                if (c0317b2 == null) {
                    if (abstractC0324i2 instanceof V) {
                        bVar = this.j;
                        if (bVar != null && bVar.e) {
                            if (((C0334t) k0VarC).b == bVar.d.c) {
                                c0317b2.d |= 1073741824;
                            }
                        }
                        c0317b2.d++;
                        if (!hashSet.add(c0317b2)) {
                            c0320e.g = true;
                            i3 = i - 1;
                            i2 = i3;
                            f(c0317b2, c0320e, hashSet, z4, z2, i2, z3);
                        }
                    } else if (!k0VarC.b() || hashSet.add(c0317b2)) {
                        if ((k0VarC instanceof W) || i < 0) {
                            i2 = i;
                        } else {
                            i3 = i + 1;
                            i2 = i3;
                        }
                        f(c0317b2, c0320e, hashSet, z4, z2, i2, z3);
                    }
                }
            } else {
                int iH = c0317b.c.h();
                int i9 = 0;
                while (true) {
                    C0316a c0316a = this.a;
                    if (i9 >= iH) {
                        C0331p c0331p = (C0331p) c0316a.a.get(((AbstractC0332q) abstractC0324i2.c(i4).a).i.b);
                        int i10 = 0;
                        while (true) {
                            if (i10 < iH) {
                                AbstractC0324i abstractC0324i3 = (AbstractC0324i) c0316a.a.get(c0317b.c.d(i10));
                                if (abstractC0324i3.e.size() == 1 && abstractC0324i3.c(i4).b()) {
                                    AbstractC0324i abstractC0324i4 = abstractC0324i3.c(i4).a;
                                    if ((abstractC0324i3.b() == 8 && abstractC0324i4 == abstractC0324i2) || abstractC0324i3 == c0331p || abstractC0324i4 == c0331p) {
                                        i4 = 0;
                                    } else if (abstractC0324i4.b() == 8 && abstractC0324i4.e.size() == 1) {
                                        i4 = 0;
                                        if (!abstractC0324i4.c(0).b() || abstractC0324i4.c(0).a != abstractC0324i2) {
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                    } else if (((AbstractC0324i) c0316a.a.get(c0317b.c.d(i9))).c == abstractC0324i2.c) {
                        i9++;
                    }
                    k0VarC = abstractC0324i.c(i5);
                    if (k0VarC instanceof C0326k) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iA = k0VarC.a();
                    c0Var = c0317b.e;
                    com.github.catvod.spider.merge.S.n nVar2 = this.d;
                    if (iA != 10) {
                        switch (iA) {
                            case 1:
                                c0317b3 = new C0317b(c0317b, k0VarC.a, c0317b.c, c0Var);
                                c0317b2 = c0317b3;
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (!z3) {
                                }
                                c0317b2 = null;
                                break;
                            case 3:
                                W w2 = (W) k0VarC;
                                c0317b2 = new C0317b(c0317b, w2.a, e0.i(c0317b.c, w2.c.b), c0Var);
                                break;
                            case 4:
                                o = (O) k0VarC;
                                if (z4) {
                                    c0317b3 = new C0317b(c0317b, o.a, c0317b.c, c0Var);
                                } else {
                                    c0317b3 = new C0317b(c0317b, o.a, c0317b.c, c0Var);
                                }
                                c0317b2 = c0317b3;
                                break;
                            case 6:
                                c0317b2 = new C0317b(c0317b, ((C0326k) k0VarC).a, c0317b.c, c0Var);
                                break;
                            default:
                                c0317b2 = null;
                                break;
                        }
                    } else {
                        n = (N) k0VarC;
                        if (z4) {
                            c0317b2 = new C0317b(c0317b, n.a, c0317b.c, c0Var);
                        } else {
                            c0317b2 = new C0317b(c0317b, n.a, c0317b.c, c0Var);
                        }
                    }
                    if (c0317b2 == null) {
                        if (abstractC0324i2 instanceof V) {
                            bVar = this.j;
                            if (bVar != null) {
                                if (((C0334t) k0VarC).b == bVar.d.c) {
                                    c0317b2.d |= 1073741824;
                                }
                            }
                            c0317b2.d++;
                            if (!hashSet.add(c0317b2)) {
                                c0320e.g = true;
                                i3 = i - 1;
                                i2 = i3;
                                f(c0317b2, c0320e, hashSet, z4, z2, i2, z3);
                            }
                        } else {
                            if (!k0VarC.b()) {
                            }
                            if (k0VarC instanceof W) {
                            }
                            i2 = i;
                            f(c0317b2, c0320e, hashSet, z4, z2, i2, z3);
                        }
                    }
                }
            }
            i5++;
            i4 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0167 A[LOOP:6: B:77:0x0161->B:79:0x0167, LOOP_END] */
    public final C0320e h(C0320e c0320e, int i, boolean z) {
        C0316a c0316a;
        int i2;
        Iterator it;
        if (this.f == null) {
            this.f = new X1(2);
        }
        C0320e c0320e2 = new C0320e(z);
        Iterator it2 = c0320e.c.iterator();
        ArrayList arrayList = null;
        while (true) {
            boolean zHasNext = it2.hasNext();
            c0316a = this.a;
            if (!zHasNext) {
                break;
            }
            C0317b c0317b = (C0317b) it2.next();
            AbstractC0324i abstractC0324i = c0317b.a;
            if (!(abstractC0324i instanceof V)) {
                int size = abstractC0324i.e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    k0 k0VarC = c0317b.a.c(i3);
                    AbstractC0324i abstractC0324i2 = k0VarC.d(i, c0316a.f) ? k0VarC.a : null;
                    if (abstractC0324i2 != null) {
                        c0320e2.a(new C0317b(c0317b, abstractC0324i2, c0317b.c, c0317b.e), this.f);
                    }
                }
            } else if (z || i == -1) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0317b);
            }
        }
        ArrayList arrayList2 = c0320e2.c;
        C0320e c0320e3 = (arrayList != null || i == -1 || (arrayList2.size() != 1 && n(c0320e2) == 0)) ? null : c0320e2;
        if (c0320e3 == null) {
            C0320e c0320e4 = new C0320e(z);
            HashSet hashSet = new HashSet();
            boolean z2 = i == -1;
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                f((C0317b) it3.next(), c0320e4, hashSet, false, z, 0, z2);
                c0320e4 = c0320e4;
            }
            i2 = -1;
            c0320e3 = c0320e4;
        } else {
            i2 = -1;
        }
        if (i == i2) {
            boolean z3 = c0320e3 == c0320e2;
            ArrayList<C0317b> arrayList3 = c0320e3.c;
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                if (!(((C0317b) it4.next()).a instanceof V)) {
                    C0320e c0320e5 = new C0320e(c0320e3.h);
                    for (C0317b c0317b2 : arrayList3) {
                        AbstractC0324i abstractC0324i3 = c0317b2.a;
                        if (abstractC0324i3 instanceof V) {
                            c0320e5.a(c0317b2, this.f);
                        } else if (z3 && abstractC0324i3.d && c0316a.c(abstractC0324i3).d(-2)) {
                            c0320e5.a(new C0317b(c0317b2, c0316a.d[c0317b2.a.c], c0317b2.c, c0317b2.e), this.f);
                        }
                    }
                    c0320e3 = c0320e5;
                    break;
                }
            }
        }
        ArrayList arrayList4 = c0320e3.c;
        if (arrayList != null) {
            if (z) {
                Iterator it5 = arrayList4.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            c0320e3.a((C0317b) it.next(), this.f);
                        }
                    } else if (((C0317b) it5.next()).a instanceof V) {
                    }
                }
            } else {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    c0320e3.a((C0317b) it.next(), this.f);
                }
            }
        }
        if (arrayList4.isEmpty()) {
            return null;
        }
        return c0320e3;
    }

    public final C0320e i(AbstractC0324i abstractC0324i, com.github.catvod.spider.merge.S.o oVar, boolean z) {
        e0 e0VarA = P.a(this.a, oVar);
        C0320e c0320e = new C0320e(z);
        int i = 0;
        while (i < abstractC0324i.e.size()) {
            int i2 = i + 1;
            f(new C0317b(abstractC0324i.c(i).a, i2, e0VarA), c0320e, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c0320e;
    }

    public final BitSet j(com.github.catvod.spider.merge.U.c[] cVarArr, com.github.catvod.spider.merge.S.o oVar) {
        BitSet bitSet = new BitSet();
        for (com.github.catvod.spider.merge.U.c cVar : cVarArr) {
            c0 c0Var = cVar.a;
            b0 b0Var = c0.a;
            int i = cVar.b;
            if (c0Var == b0Var) {
                bitSet.set(i);
            } else if (c0Var.c(this.d, oVar)) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int k(com.github.catvod.spider.merge.U.b r19, com.github.catvod.spider.merge.U.d r20, com.github.catvod.spider.merge.S.e r21, int r22, com.github.catvod.spider.merge.S.o r23) {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.T.K.k(com.github.catvod.spider.merge.U.b, com.github.catvod.spider.merge.U.d, com.github.catvod.spider.merge.S.e, int, com.github.catvod.spider.merge.S.o):int");
    }

    public final int m(C0320e c0320e, com.github.catvod.spider.merge.S.o oVar) {
        int iL;
        C0320e c0320e2 = new C0320e(c0320e.h);
        C0320e c0320e3 = new C0320e(c0320e.h);
        for (C0317b c0317b : c0320e.c) {
            c0 c0Var = c0317b.e;
            if (c0Var == c0.a) {
                c0320e2.a(c0317b, null);
            } else if (c0Var.c(this.d, oVar)) {
                c0320e2.a(c0317b, null);
            } else {
                c0320e3.a(c0317b, null);
            }
        }
        int iL2 = l(c0320e2);
        if (iL2 != 0) {
            return iL2;
        }
        if (c0320e3.c.size() <= 0 || (iL = l(c0320e3)) == 0) {
            return 0;
        }
        return iL;
    }

    public final com.github.catvod.spider.merge.S.l o(int i, com.github.catvod.spider.merge.S.e eVar, com.github.catvod.spider.merge.S.o oVar) {
        ArrayList arrayList = (ArrayList) eVar.d;
        if (i >= 0 && i < arrayList.size()) {
            return new com.github.catvod.spider.merge.S.l(this.d, eVar, (com.github.catvod.spider.merge.S.c) arrayList.get(i), eVar.b(1), oVar);
        }
        throw new IndexOutOfBoundsException("token index " + i + " out of range 0.." + (arrayList.size() - 1));
    }
}

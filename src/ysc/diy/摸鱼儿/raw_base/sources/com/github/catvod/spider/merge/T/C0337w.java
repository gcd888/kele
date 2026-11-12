package com.github.catvod.spider.merge.T;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0337w extends AbstractC0323h {
    public final com.github.catvod.spider.merge.S.j d;
    public int e;
    public int f;
    public int g;
    public final com.github.catvod.spider.merge.U.b[] h;
    public int i;
    public final C0336v j;

    public C0337w(com.github.catvod.spider.merge.S.j jVar, C0316a c0316a, com.github.catvod.spider.merge.U.b[] bVarArr, Q q) {
        super(c0316a, q);
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
        this.j = new C0336v();
        this.h = bVarArr;
        this.d = jVar;
    }

    public static void b(com.github.catvod.spider.merge.U.d dVar, int i, com.github.catvod.spider.merge.U.d dVar2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (dVar) {
            try {
                if (dVar.c == null) {
                    dVar.c = new com.github.catvod.spider.merge.U.d[128];
                }
                dVar.c[i] = dVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.T.AbstractC0323h
    public final void a() {
        C0336v c0336v = this.j;
        c0336v.a = -1;
        c0336v.b = 0;
        c0336v.c = -1;
        c0336v.d = null;
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
    }

    public final com.github.catvod.spider.merge.U.d c(J j) {
        C0317b c0317b;
        com.github.catvod.spider.merge.U.d dVar = new com.github.catvod.spider.merge.U.d(j);
        Iterator it = j.c.iterator();
        do {
            if (!it.hasNext()) {
                c0317b = null;
                break;
            }
            c0317b = (C0317b) it.next();
        } while (!(c0317b.a instanceof V));
        if (c0317b != null) {
            dVar.d = true;
            dVar.f = ((C0335u) c0317b).f;
            dVar.e = this.a.g[c0317b.a.c];
        }
        com.github.catvod.spider.merge.U.b bVar = this.h[this.i];
        synchronized (bVar.a) {
            try {
                com.github.catvod.spider.merge.U.d dVar2 = (com.github.catvod.spider.merge.U.d) bVar.a.get(dVar);
                if (dVar2 != null) {
                    return dVar2;
                }
                dVar.a = bVar.a.size();
                j.a = true;
                j.b = null;
                dVar.b = j;
                bVar.a.put(dVar, dVar);
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0159  */
    /* JADX WARN: Code duplicated, block: B:77:0x016b  */
    public final boolean d(com.github.catvod.spider.merge.S.b bVar, C0335u c0335u, J j, boolean z, boolean z2, boolean z3) {
        C0335u c0335u2;
        C0335u c0335u3;
        C0339y c0339y;
        boolean z4;
        AbstractC0324i abstractC0324i = c0335u.a;
        boolean z5 = abstractC0324i instanceof V;
        C0316a c0316a = this.a;
        if (z5) {
            P p = c0335u.c;
            if (p == null || p.e()) {
                P p2 = c0335u.c;
                if (p2 == null || p2.f()) {
                    j.a(c0335u, null);
                    return true;
                }
                j.a(new C0335u(c0335u, abstractC0324i, P.b), null);
                z4 = true;
            } else {
                z4 = z;
            }
            P p3 = c0335u.c;
            if (p3 == null || p3.f()) {
                return z4;
            }
            boolean zD = z4;
            for (int i = 0; i < c0335u.c.h(); i++) {
                if (c0335u.c.d(i) != Integer.MAX_VALUE) {
                    zD = d(bVar, new C0335u(c0335u, (AbstractC0324i) c0316a.a.get(c0335u.c.d(i)), c0335u.c.c(i)), j, zD, z2, z3);
                }
            }
            return zD;
        }
        if (!abstractC0324i.d && (!z || !c0335u.g)) {
            j.a(c0335u, null);
        }
        boolean zD2 = z;
        for (int i2 = 0; i2 < abstractC0324i.e.size(); i2++) {
            k0 k0VarC = abstractC0324i.c(i2);
            int iA = k0VarC.a();
            if (iA == 10) {
                throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
            }
            switch (iA) {
                case 1:
                    c0335u3 = new C0335u(c0335u, k0VarC.a);
                    c0335u2 = c0335u3;
                    if (c0335u2 != null) {
                        zD2 = d(bVar, c0335u2, j, zD2, z2, z3);
                    }
                    break;
                case 2:
                case 5:
                case 7:
                    if (z3 && k0VarC.d(-1, 1114111)) {
                        c0335u3 = new C0335u(c0335u, k0VarC.a);
                        c0335u2 = c0335u3;
                    } else {
                        c0335u2 = null;
                    }
                    if (c0335u2 != null) {
                        zD2 = d(bVar, c0335u2, j, zD2, z2, z3);
                    }
                    break;
                case 3:
                    c0335u2 = new C0335u(c0335u, k0VarC.a, e0.i(c0335u.c, ((W) k0VarC).c.b));
                    if (c0335u2 != null) {
                        zD2 = d(bVar, c0335u2, j, zD2, z2, z3);
                    }
                    break;
                case 4:
                    j.f = true;
                    if (this.d != null && z2) {
                        int i3 = this.g;
                        int i4 = this.f;
                        int i5 = bVar.b;
                        try {
                            e(bVar);
                            this.g = i3;
                            this.f = i4;
                            bVar.b = i5;
                        } catch (Throwable th) {
                            this.g = i3;
                            this.f = i4;
                            bVar.b = i5;
                            throw th;
                        }
                    }
                    c0335u3 = new C0335u(c0335u, k0VarC.a);
                    c0335u2 = c0335u3;
                    if (c0335u2 != null) {
                        zD2 = d(bVar, c0335u2, j, zD2, z2, z3);
                    }
                    break;
                case 6:
                    P p4 = c0335u.c;
                    if (p4 == null || p4.e()) {
                        InterfaceC0338x interfaceC0338x = c0316a.h[((C0326k) k0VarC).c];
                        C0339y c0339y2 = c0335u.f;
                        if (c0339y2 == null) {
                            c0339y = new C0339y(new InterfaceC0338x[]{interfaceC0338x});
                        } else {
                            InterfaceC0338x[] interfaceC0338xArr = c0339y2.a;
                            InterfaceC0338x[] interfaceC0338xArr2 = (InterfaceC0338x[]) Arrays.copyOf(interfaceC0338xArr, interfaceC0338xArr.length + 1);
                            interfaceC0338xArr2[interfaceC0338xArr2.length - 1] = interfaceC0338x;
                            c0339y = new C0339y(interfaceC0338xArr2);
                        }
                        c0335u3 = new C0335u(c0335u, k0VarC.a, c0339y);
                    } else {
                        c0335u3 = new C0335u(c0335u, k0VarC.a);
                    }
                    c0335u2 = c0335u3;
                    if (c0335u2 != null) {
                        zD2 = d(bVar, c0335u2, j, zD2, z2, z3);
                    }
                    break;
                default:
                    c0335u2 = null;
                    if (c0335u2 != null) {
                        zD2 = d(bVar, c0335u2, j, zD2, z2, z3);
                    }
                    break;
            }
        }
        return zD2;
    }

    public final void e(com.github.catvod.spider.merge.S.b bVar) {
        if (bVar.a(1) == 10) {
            this.f++;
            this.g = 0;
        } else {
            this.g++;
        }
        int i = bVar.b;
        if (bVar.a - i == 0) {
            throw new IllegalStateException("cannot consume EOF");
        }
        bVar.b = i + 1;
    }

    public final int f(com.github.catvod.spider.merge.S.b bVar, com.github.catvod.spider.merge.U.d dVar) throws Throwable {
        int i;
        boolean z;
        com.github.catvod.spider.merge.U.d dVarC;
        J j;
        int i2;
        int i3;
        AbstractC0324i abstractC0324i;
        C0317b c0317b;
        int i4;
        int i5;
        AbstractC0324i abstractC0324i2;
        C0317b c0317b2;
        com.github.catvod.spider.merge.U.d dVar2 = dVar;
        boolean z2 = dVar2.d;
        C0336v c0336v = this.j;
        if (z2) {
            c0336v.a = bVar.b;
            c0336v.b = this.f;
            c0336v.c = this.g;
            c0336v.d = dVar2;
        }
        int iA = bVar.a(1);
        while (true) {
            com.github.catvod.spider.merge.U.d[] dVarArr = dVar2.c;
            com.github.catvod.spider.merge.U.d dVar3 = (dVarArr == null || iA < 0 || iA > 127) ? null : dVarArr[iA];
            com.github.catvod.spider.merge.U.d dVar4 = AbstractC0323h.c;
            if (dVar3 == null) {
                J j2 = new J();
                int i6 = 0;
                for (C0317b c0317b3 : dVar2.b.c) {
                    boolean z3 = c0317b3.b == i6;
                    if (!z3 || !((C0335u) c0317b3).g) {
                        AbstractC0324i abstractC0324i3 = c0317b3.a;
                        int size = abstractC0324i3.e.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size) {
                                j = j2;
                                break;
                            }
                            k0 k0VarC = abstractC0324i3.c(i7);
                            AbstractC0324i abstractC0324i4 = k0VarC.d(iA, 1114111) ? k0VarC.a : null;
                            if (abstractC0324i4 != null) {
                                C0335u c0335u = (C0335u) c0317b3;
                                C0339y c0339y = c0335u.f;
                                if (c0339y != null) {
                                    i4 = i7;
                                    int i8 = bVar.b - this.e;
                                    i5 = size;
                                    abstractC0324i2 = abstractC0324i3;
                                    int i9 = 0;
                                    InterfaceC0338x[] interfaceC0338xArr = null;
                                    while (true) {
                                        InterfaceC0338x[] interfaceC0338xArr2 = c0339y.a;
                                        c0317b2 = c0317b3;
                                        if (i9 >= interfaceC0338xArr2.length) {
                                            break;
                                        }
                                        if (interfaceC0338xArr2[i9].a() && !(interfaceC0338xArr2[i9] instanceof C)) {
                                            if (interfaceC0338xArr == null) {
                                                interfaceC0338xArr = (InterfaceC0338x[]) interfaceC0338xArr2.clone();
                                            }
                                            interfaceC0338xArr[i9] = new C(i8, interfaceC0338xArr2[i9]);
                                        }
                                        i9++;
                                        c0317b3 = c0317b2;
                                    }
                                    if (interfaceC0338xArr != null) {
                                        c0339y = new C0339y(interfaceC0338xArr);
                                    }
                                } else {
                                    i4 = i7;
                                    i5 = size;
                                    abstractC0324i2 = abstractC0324i3;
                                    c0317b2 = c0317b3;
                                }
                                boolean z4 = iA == -1;
                                C0335u c0335u2 = new C0335u(c0335u, abstractC0324i4, c0339y);
                                i2 = i4;
                                abstractC0324i = abstractC0324i2;
                                C0317b c0317b4 = c0317b2;
                                i3 = i5;
                                j = j2;
                                if (d(bVar, c0335u2, j2, z3, true, z4)) {
                                    i6 = c0317b4.b;
                                    break;
                                }
                                c0317b = c0317b4;
                            } else {
                                i2 = i7;
                                i3 = size;
                                abstractC0324i = abstractC0324i3;
                                c0317b = c0317b3;
                                j = j2;
                            }
                            c0317b3 = c0317b;
                            i7 = i2 + 1;
                            j2 = j;
                            abstractC0324i3 = abstractC0324i;
                            i6 = i6;
                            size = i3;
                        }
                        j2 = j;
                    }
                }
                J j3 = j2;
                i = -1;
                if (j3.c.isEmpty()) {
                    if (!j3.f) {
                        b(dVar2, iA, dVar4);
                    }
                    dVarC = dVar4;
                } else {
                    boolean z5 = j3.f;
                    j3.f = false;
                    dVarC = c(j3);
                    if (!z5) {
                        b(dVar2, iA, dVarC);
                    }
                }
                dVar2 = dVarC;
            } else {
                i = -1;
                dVar2 = dVar3;
            }
            if (dVar2 == dVar4) {
                break;
            }
            if (iA != i) {
                e(bVar);
            }
            if (dVar2.d) {
                c0336v.a = bVar.b;
                c0336v.b = this.f;
                c0336v.c = this.g;
                c0336v.d = dVar2;
                if (iA == i) {
                    break;
                }
            }
            iA = bVar.a(1);
        }
        com.github.catvod.spider.merge.U.d dVar5 = c0336v.d;
        com.github.catvod.spider.merge.S.j jVar = this.d;
        if (dVar5 == null) {
            if (iA == i && bVar.b == this.e) {
                return -1;
            }
            throw new com.github.catvod.spider.merge.S.k(jVar, bVar, this.e);
        }
        C0339y c0339y2 = dVar5.f;
        int i10 = this.e;
        int i11 = c0336v.a;
        int i12 = c0336v.b;
        int i13 = c0336v.c;
        bVar.b = i11;
        this.f = i12;
        this.g = i13;
        if (c0339y2 != null && jVar != null) {
            try {
                InterfaceC0338x[] interfaceC0338xArr3 = c0339y2.a;
                int length = interfaceC0338xArr3.length;
                boolean z6 = false;
                for (int i14 = 0; i14 < length; i14++) {
                    try {
                        InterfaceC0338x interfaceC0338x = interfaceC0338xArr3[i14];
                        if (interfaceC0338x instanceof C) {
                            int i15 = ((C) interfaceC0338x).a + i10;
                            bVar.b = i15;
                            interfaceC0338x = ((C) interfaceC0338x).b;
                            z6 = i15 != i11;
                        } else if (interfaceC0338x.a()) {
                            bVar.b = i11;
                        }
                        interfaceC0338x.b(jVar);
                    } catch (Throwable th) {
                        th = th;
                        z = z6;
                        if (z) {
                            bVar.b = i11;
                        }
                        throw th;
                    }
                }
                if (z6) {
                    bVar.b = i11;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        }
        return c0336v.d.e;
    }

    public final int g(com.github.catvod.spider.merge.S.b bVar, int i) {
        this.i = i;
        bVar.getClass();
        this.e = bVar.b;
        C0336v c0336v = this.j;
        c0336v.a = -1;
        c0336v.b = 0;
        c0336v.c = -1;
        c0336v.d = null;
        com.github.catvod.spider.merge.U.b bVar2 = this.h[i];
        return bVar2.b == null ? h(bVar) : f(bVar, bVar2.b);
    }

    public final int h(com.github.catvod.spider.merge.S.b bVar) {
        AbstractC0324i abstractC0324i = (AbstractC0324i) this.a.i.get(this.i);
        C0333s c0333s = P.b;
        J j = new J();
        int i = 0;
        while (i < abstractC0324i.e.size()) {
            int i2 = i + 1;
            d(bVar, new C0335u(abstractC0324i.c(i).a, i2, c0333s), j, false, false, false);
            i = i2;
        }
        boolean z = j.f;
        j.f = false;
        com.github.catvod.spider.merge.U.d dVarC = c(j);
        if (!z) {
            this.h[this.i].b = dVarC;
        }
        return f(bVar, dVarC);
    }
}

package com.github.catvod.spider.merge.T;

import com.github.catvod.spider.merge.p022z.X3;
import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0322g {
    public static final UUID a;
    public static final UUID b;
    public static final UUID c;
    public static final ArrayList d;
    public static final UUID e;

    static {
        UUID uuidFromString = UUID.fromString("33761B2D-78BB-4A43-8B0B-4F5BEE8AACF3");
        UUID uuidFromString2 = UUID.fromString("1DA0C57D-6C06-438A-9B27-10BCB3CE0F61");
        a = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString("AADB8D7E-AEEF-4415-AD2B-8204D6CF042E");
        b = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString("59627784-3BE5-417A-B9EB-8131A7286089");
        c = uuidFromString4;
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        arrayList.add(uuidFromString);
        arrayList.add(uuidFromString2);
        arrayList.add(uuidFromString3);
        arrayList.add(uuidFromString4);
        e = uuidFromString4;
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    public static int c(char[] cArr, int i, ArrayList arrayList, C0321f c0321f) {
        int i2 = i + 1;
        char c2 = cArr[i];
        for (int i3 = 0; i3 < c2; i3++) {
            char c3 = cArr[i2];
            int i4 = i2 + 1;
            com.github.catvod.spider.merge.V.f fVar = new com.github.catvod.spider.merge.V.f(new int[0]);
            arrayList.add(fVar);
            i2 += 2;
            if (cArr[i4] != 0) {
                fVar.a(-1);
            }
            int i5 = 0;
            while (i5 < c3) {
                int iA = c0321f.a(cArr, i2);
                int iB = c0321f.b() + i2;
                int iA2 = c0321f.a(cArr, iB);
                int iB2 = iB + c0321f.b();
                fVar.b(iA, iA2);
                i5++;
                i2 = iB2;
            }
        }
        return i2;
    }

    public static boolean d(UUID uuid, UUID uuid2) {
        ArrayList arrayList = d;
        int iIndexOf = arrayList.indexOf(uuid);
        return iIndexOf >= 0 && arrayList.indexOf(uuid2) >= iIndexOf;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x011a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0131  */
    /* JADX WARN: Code duplicated, block: B:42:0x0136  */
    /* JADX WARN: Code duplicated, block: B:44:0x014c  */
    public final C0316a b(char[] cArr) {
        int i;
        InterfaceC0338x a2;
        k0 c0334t;
        int i2;
        int i3;
        char c2;
        AbstractC0324i abstractC0324i;
        AbstractC0324i c0330o;
        int i4;
        char[] cArr2 = (char[]) cArr.clone();
        int i5 = 1;
        for (int i6 = 1; i6 < cArr2.length; i6++) {
            cArr2[i6] = (char) (cArr2[i6] - 2);
        }
        char c3 = cArr2[0];
        if (c3 != 3) {
            throw new UnsupportedOperationException(new InvalidClassException(C0316a.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with version %d (expected %d).", Integer.valueOf(c3), 3)));
        }
        UUID uuid = new UUID((4294967295L & ((long) (cArr2[5] | (cArr2[6] << 16)))) | (((long) (cArr2[7] | (cArr2[8] << 16))) << 32), (((long) (cArr2[1] | (cArr2[2] << 16))) & 4294967295L) | (((long) (cArr2[3] | (cArr2[4] << 16))) << 32));
        if (!d.contains(uuid)) {
            Locale.getDefault();
            throw new UnsupportedOperationException(new InvalidClassException(C0316a.class.getName(), "Could not deserialize ATN with UUID " + uuid + " (expected " + e + " or a legacy UUID)."));
        }
        boolean zD = d(a, uuid);
        UUID uuid2 = b;
        boolean zD2 = d(uuid2, uuid);
        int[] iArr = new int[2];
        System.arraycopy(X3.a, 0, iArr, 0, 2);
        C0316a c0316a = new C0316a(iArr[cArr2[9]], cArr2[10]);
        ArrayList<com.github.catvod.spider.merge.V.h> arrayList = new ArrayList();
        ArrayList<com.github.catvod.spider.merge.V.h> arrayList2 = new ArrayList();
        char c4 = cArr2[11];
        int i7 = 0;
        int i8 = 12;
        while (true) {
            ArrayList<AbstractC0324i> arrayList3 = c0316a.a;
            if (i7 >= c4) {
                for (com.github.catvod.spider.merge.V.h hVar : arrayList) {
                    ((H) hVar.a).g = (AbstractC0324i) arrayList3.get(((Integer) hVar.b).intValue());
                }
                for (com.github.catvod.spider.merge.V.h hVar2 : arrayList2) {
                    ((AbstractC0332q) hVar2.a).i = (C0331p) arrayList3.get(((Integer) hVar2.b).intValue());
                }
                int i9 = 1;
                int i10 = i8 + 1;
                char c5 = cArr2[i8];
                int i11 = 0;
                while (i11 < c5) {
                    ((r) arrayList3.get(cArr2[i10])).h = true;
                    i11++;
                    i10++;
                }
                if (zD) {
                    char c6 = cArr2[i10];
                    i10++;
                    int i12 = 0;
                    while (i12 < c6) {
                        ((U) arrayList3.get(cArr2[i10])).h = true;
                        i12++;
                        i10++;
                    }
                }
                int i13 = i10 + 1;
                char c7 = cArr2[i10];
                int i14 = c0316a.e;
                if (i14 == 1) {
                    c0316a.g = new int[c7];
                }
                c0316a.c = new U[c7];
                for (int i15 = 0; i15 < c7; i15 += i9) {
                    int i16 = i13 + 1;
                    c0316a.c[i15] = (U) arrayList3.get(cArr2[i13]);
                    if (i14 == i9) {
                        int i17 = i13 + 2;
                        char c8 = cArr2[i16];
                        if (c8 == 65535) {
                            i2 = c8;
                            i2 = -1;
                        }
                        i2 = c8;
                        c0316a.g[i15] = i2;
                        if (d(uuid2, uuid)) {
                            i13 = i17;
                        } else {
                            i13 += 3;
                            char c9 = cArr2[i17];
                        }
                        i9 = 1;
                    } else {
                        i13 = i16;
                    }
                }
                c0316a.d = new V[c7];
                for (AbstractC0324i abstractC0324i2 : arrayList3) {
                    if (abstractC0324i2 instanceof V) {
                        V v = (V) abstractC0324i2;
                        V[] vArr = c0316a.d;
                        int i18 = abstractC0324i2.c;
                        vArr[i18] = v;
                        c0316a.c[i18].g = v;
                    }
                }
                int i19 = i13 + 1;
                char c10 = cArr2[i13];
                int i20 = 0;
                while (i20 < c10) {
                    c0316a.i.add((i0) arrayList3.get(cArr2[i19]));
                    i20++;
                    i19++;
                }
                ArrayList arrayList4 = new ArrayList();
                int iC = c(cArr2, i19, arrayList4, new C0321f(0));
                if (d(c, uuid)) {
                    iC = c(cArr2, iC, arrayList4, new C0321f(1));
                }
                int i21 = iC + 1;
                char c11 = cArr2[iC];
                for (int i22 = 0; i22 < c11; i22++) {
                    char c12 = cArr2[i21];
                    char c13 = cArr2[i21 + 1];
                    char c14 = cArr2[i21 + 2];
                    char c15 = cArr2[i21 + 3];
                    char c16 = cArr2[i21 + 4];
                    char c17 = cArr2[i21 + 5];
                    AbstractC0324i abstractC0324i3 = (AbstractC0324i) arrayList3.get(c13);
                    switch (c14) {
                        case 1:
                            c0334t = new C0334t(abstractC0324i3, -1);
                            continue;
                            ((AbstractC0324i) arrayList3.get(c12)).a(c0334t);
                            i21 += 6;
                            break;
                        case 2:
                            if (c17 != 0) {
                                c0334t = new T(abstractC0324i3, -1, c16);
                                continue;
                            } else {
                                c0334t = new T(abstractC0324i3, c15, c16);
                            }
                            ((AbstractC0324i) arrayList3.get(c12)).a(c0334t);
                            i21 += 6;
                            break;
                        case 3:
                            c0334t = new W((U) arrayList3.get(c15), c17, abstractC0324i3);
                            break;
                        case 4:
                            c0334t = new O(abstractC0324i3, c15, c16, c17 != 0);
                            break;
                        case 5:
                            c0334t = c17 != 0 ? new C0328m(abstractC0324i3, -1) : new C0328m(abstractC0324i3, c15);
                            break;
                        case 6:
                            c0334t = new C0326k(abstractC0324i3, c15, c16);
                            break;
                        case 7:
                            c0334t = new d0(abstractC0324i3, (com.github.catvod.spider.merge.V.f) arrayList4.get(c15));
                            break;
                        case '\b':
                            c0334t = new I(abstractC0324i3, (com.github.catvod.spider.merge.V.f) arrayList4.get(c15));
                            break;
                        case '\t':
                            c0334t = new l0(abstractC0324i3);
                            break;
                        case '\n':
                            c0334t = new N(abstractC0324i3, c15);
                            break;
                        default:
                            throw new IllegalArgumentException("The specified transition type is not valid.");
                    }
                    ((AbstractC0324i) arrayList3.get(c12)).a(c0334t);
                    i21 += 6;
                }
                for (AbstractC0324i abstractC0324i4 : arrayList3) {
                    for (int i23 = 0; i23 < abstractC0324i4.e.size(); i23++) {
                        k0 k0VarC = abstractC0324i4.c(i23);
                        if (k0VarC instanceof W) {
                            W w = (W) k0VarC;
                            U[] uArr = c0316a.c;
                            int i24 = w.a.c;
                            if (!uArr[i24].h || w.b != 0) {
                                i24 = -1;
                            }
                            c0316a.d[w.a.c].a(new C0334t(w.c, i24));
                        }
                    }
                }
                for (AbstractC0324i abstractC0324i5 : arrayList3) {
                    if (abstractC0324i5 instanceof AbstractC0332q) {
                        AbstractC0332q abstractC0332q = (AbstractC0332q) abstractC0324i5;
                        C0331p c0331p = abstractC0332q.i;
                        if (c0331p == null) {
                            throw new IllegalStateException();
                        }
                        if (c0331p.g != null) {
                            throw new IllegalStateException();
                        }
                        c0331p.g = abstractC0332q;
                    }
                    if (abstractC0324i5 instanceof M) {
                        M m = (M) abstractC0324i5;
                        for (int i25 = 0; i25 < m.e.size(); i25++) {
                            AbstractC0324i abstractC0324i6 = m.c(i25).a;
                            if (abstractC0324i6 instanceof L) {
                                ((L) abstractC0324i6).j = m;
                            }
                        }
                    } else if (abstractC0324i5 instanceof h0) {
                        h0 h0Var = (h0) abstractC0324i5;
                        for (int i26 = 0; i26 < h0Var.e.size(); i26++) {
                            AbstractC0324i abstractC0324i7 = h0Var.c(i26).a;
                            if (abstractC0324i7 instanceof g0) {
                                ((g0) abstractC0324i7).i = h0Var;
                            }
                        }
                    }
                }
                int i27 = i21 + 1;
                char c18 = cArr2[i21];
                int i28 = 1;
                while (i28 <= c18) {
                    int i29 = i27 + 1;
                    r rVar = (r) arrayList3.get(cArr2[i27]);
                    c0316a.b.add(rVar);
                    rVar.g = i28 - 1;
                    i28++;
                    i27 = i29;
                }
                if (i14 == 1) {
                    if (zD2) {
                        int i30 = i27 + 1;
                        c0316a.h = new InterfaceC0338x[cArr2[i27]];
                        for (int i31 = 0; i31 < c0316a.h.length; i31++) {
                            EnumC0340z enumC0340z = EnumC0340z.values()[cArr2[i30]];
                            int i32 = i30 + 2;
                            char c19 = cArr2[i30 + 1];
                            if (c19 == 65535) {
                                i = c19;
                                i = -1;
                            }
                            i = c19;
                            i30 += 3;
                            char c20 = cArr2[i32];
                            int i33 = c20;
                            if (c20 == 65535) {
                                i33 = -1;
                            }
                            switch (enumC0340z) {
                                case CHANNEL:
                                    a2 = new A(i);
                                    break;
                                case CUSTOM:
                                    a2 = new B(i, i33);
                                    break;
                                case MODE:
                                    a2 = new D(i);
                                    break;
                                case MORE:
                                    a2 = E.b;
                                    break;
                                case POP_MODE:
                                    a2 = E.c;
                                    break;
                                case PUSH_MODE:
                                    a2 = new F(i);
                                    break;
                                case SKIP:
                                    a2 = E.d;
                                    break;
                                case TYPE:
                                    a2 = new G(i);
                                    break;
                                default:
                                    throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified lexer action type %d is not valid.", enumC0340z));
                            }
                            c0316a.h[i31] = a2;
                        }
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        for (AbstractC0324i abstractC0324i8 : arrayList3) {
                            for (int i34 = 0; i34 < abstractC0324i8.e.size(); i34++) {
                                k0 k0VarC2 = abstractC0324i8.c(i34);
                                if (k0VarC2 instanceof C0326k) {
                                    C0326k c0326k = (C0326k) k0VarC2;
                                    int i35 = c0326k.b;
                                    B b2 = new B(i35, c0326k.c);
                                    abstractC0324i8.e.set(i34, new C0326k(k0VarC2.a, i35, arrayList5.size()));
                                    arrayList5.add(b2);
                                }
                            }
                        }
                        c0316a.h = (InterfaceC0338x[]) arrayList5.toArray(new InterfaceC0338x[arrayList5.size()]);
                    }
                }
                for (AbstractC0324i abstractC0324i9 : arrayList3) {
                    if ((abstractC0324i9 instanceof g0) && c0316a.c[abstractC0324i9.c].h) {
                        AbstractC0324i abstractC0324i10 = abstractC0324i9.c(abstractC0324i9.e.size() - 1).a;
                        if ((abstractC0324i10 instanceof H) && abstractC0324i10.d && (abstractC0324i10.c(0).a instanceof V)) {
                            ((g0) abstractC0324i9).j = true;
                        }
                    }
                }
                for (AbstractC0324i abstractC0324i11 : arrayList3) {
                    if (abstractC0324i11 != null) {
                        boolean z = abstractC0324i11.d;
                        ArrayList arrayList6 = abstractC0324i11.e;
                        a(z || arrayList6.size() <= 1);
                        if (abstractC0324i11 instanceof L) {
                            a(((L) abstractC0324i11).j != null);
                        }
                        if (abstractC0324i11 instanceof g0) {
                            g0 g0Var = (g0) abstractC0324i11;
                            a(g0Var.i != null);
                            a(g0Var.e.size() == 2);
                            if (g0Var.c(0).a instanceof f0) {
                                a(g0Var.c(1).a instanceof H);
                                a(!g0Var.h);
                            } else {
                                if (!(g0Var.c(0).a instanceof H)) {
                                    throw new IllegalStateException();
                                }
                                a(g0Var.c(1).a instanceof f0);
                                a(g0Var.h);
                            }
                        }
                        if (abstractC0324i11 instanceof h0) {
                            a(arrayList6.size() == 1);
                            a(abstractC0324i11.c(0).a instanceof g0);
                        }
                        if (abstractC0324i11 instanceof H) {
                            a(((H) abstractC0324i11).g != null);
                        }
                        if (abstractC0324i11 instanceof U) {
                            a(((U) abstractC0324i11).g != null);
                        }
                        if (abstractC0324i11 instanceof AbstractC0332q) {
                            a(((AbstractC0332q) abstractC0324i11).i != null);
                        }
                        if (abstractC0324i11 instanceof C0331p) {
                            a(((C0331p) abstractC0324i11).g != null);
                        }
                        if (abstractC0324i11 instanceof r) {
                            r rVar2 = (r) abstractC0324i11;
                            a(rVar2.e.size() <= 1 || rVar2.g >= 0);
                        } else {
                            a(arrayList6.size() <= 1 || (abstractC0324i11 instanceof V));
                        }
                    }
                }
                return c0316a;
            }
            int i36 = i8 + 1;
            char c21 = cArr2[i8];
            if (c21 == 0) {
                arrayList3.add(null);
                i8 = i36;
            } else {
                int i37 = i8 + 2;
                char c22 = cArr2[i36];
                if (c22 == 65535) {
                    i3 = c22;
                    i3 = -1;
                }
                switch (c21) {
                    case 0:
                        c2 = '\f';
                        abstractC0324i = null;
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    case 1:
                        c0330o = new C0330o();
                        c0330o.c = i3;
                        abstractC0324i = c0330o;
                        c2 = '\f';
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    case 2:
                        c0330o = new U();
                        c0330o.c = i3;
                        abstractC0324i = c0330o;
                        c2 = '\f';
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    case 3:
                        c0330o = new C0329n();
                        c0330o.c = i3;
                        abstractC0324i = c0330o;
                        c2 = '\f';
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    case 4:
                        c0330o = new L();
                        c0330o.c = i3;
                        abstractC0324i = c0330o;
                        c2 = '\f';
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    case 5:
                        c0330o = new f0();
                        c0330o.c = i3;
                        abstractC0324i = c0330o;
                        c2 = '\f';
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    case 6:
                        c0330o = new i0();
                        c0330o.c = i3;
                        abstractC0324i = c0330o;
                        c2 = '\f';
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    case 7:
                        c0330o = new V();
                        c0330o.c = i3;
                        abstractC0324i = c0330o;
                        c2 = '\f';
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    case '\b':
                        c0330o = new C0331p();
                        c0330o.c = i3;
                        abstractC0324i = c0330o;
                        c2 = '\f';
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    case '\t':
                        c0330o = new h0();
                        c0330o.c = i3;
                        abstractC0324i = c0330o;
                        c2 = '\f';
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    case '\n':
                        c0330o = new g0();
                        c0330o.c = i3;
                        abstractC0324i = c0330o;
                        c2 = '\f';
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    case 11:
                        c0330o = new M();
                        c0330o.c = i3;
                        abstractC0324i = c0330o;
                        c2 = '\f';
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    case '\f':
                        c0330o = new H();
                        c0330o.c = i3;
                        abstractC0324i = c0330o;
                        c2 = '\f';
                        if (c21 != c2) {
                            if (abstractC0324i instanceof AbstractC0332q) {
                                i4 = i8 + 3;
                                arrayList2.add(new com.github.catvod.spider.merge.V.h((AbstractC0332q) abstractC0324i, Integer.valueOf(cArr2[i37])));
                            }
                            if (abstractC0324i != null) {
                                abstractC0324i.a = c0316a;
                                abstractC0324i.b = arrayList3.size();
                            }
                            arrayList3.add(abstractC0324i);
                            i8 = i37;
                        } else {
                            i4 = i8 + 3;
                            arrayList.add(new com.github.catvod.spider.merge.V.h((H) abstractC0324i, Integer.valueOf(cArr2[i37])));
                        }
                        i37 = i4;
                        if (abstractC0324i != null) {
                            abstractC0324i.a = c0316a;
                            abstractC0324i.b = arrayList3.size();
                        }
                        arrayList3.add(abstractC0324i);
                        i8 = i37;
                        break;
                    default:
                        Locale locale = Locale.getDefault();
                        Object[] objArr = new Object[i5];
                        objArr[0] = Integer.valueOf(c21);
                        throw new IllegalArgumentException(String.format(locale, "The specified state type %d is not valid.", objArr));
                }
            }
            i7++;
            i5 = 1;
        }
    }
}

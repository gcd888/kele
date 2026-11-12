package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.p022z.X3;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0442x extends B {
    public C0442x() {
        super("InBody", 6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:186:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:188:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:190:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:192:0x0304  */
    /* JADX WARN: Code duplicated, block: B:197:0x0322  */
    /* JADX WARN: Code duplicated, block: B:199:0x032c  */
    /* JADX WARN: Code duplicated, block: B:200:0x032e  */
    /* JADX WARN: Code duplicated, block: B:209:0x0345  */
    /* JADX WARN: Code duplicated, block: B:214:0x0362  */
    /* JADX WARN: Code duplicated, block: B:222:0x038f  */
    /* JADX WARN: Code duplicated, block: B:223:0x0391  */
    /* JADX WARN: Code duplicated, block: B:313:0x0541  */
    /* JADX WARN: Code duplicated, block: B:707:0x0bf7  */
    /* JADX WARN: Code duplicated, block: B:736:0x0c8b  */
    /* JADX WARN: Code duplicated, block: B:814:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:0x0358 A[SYNTHETIC] */
    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        String[] strArr;
        com.github.catvod.spider.merge.f0.k kVarL;
        com.github.catvod.spider.merge.f0.n nVar;
        com.github.catvod.spider.merge.f0.b bVar;
        String str;
        byte b;
        String[] strArr2;
        com.github.catvod.spider.merge.f0.k kVar;
        com.github.catvod.spider.merge.f0.k kVar2;
        com.github.catvod.spider.merge.f0.b bVarD;
        com.github.catvod.spider.merge.f0.b bVarD2;
        int i;
        int iLastIndexOf;
        boolean z;
        boolean z2;
        int i2;
        com.github.catvod.spider.merge.f0.a aVar;
        Object obj;
        int iA = X3.a(n.a);
        if (iA == 0) {
            c0399b.h(this);
            return false;
        }
        B b2 = B.d;
        String[] strArr3 = A.i;
        String[] strArr4 = A.l;
        String[] strArr5 = C0399b.G;
        if (iA != 1) {
            if (iA != 2) {
                if (iA == 3) {
                    c0399b.u((H) n);
                    return true;
                }
                if (iA != 4) {
                    if (iA != 5 || c0399b.s.size() <= 0) {
                        return true;
                    }
                    C0417k c0417k = B.r;
                    c0399b.g = n;
                    return c0417k.c(n, c0399b);
                }
                G g = (G) n;
                if (g.b.equals(B.x)) {
                    c0399b.h(this);
                    return false;
                }
                if (c0399b.v && B.a(g)) {
                    c0399b.J();
                    c0399b.t(g);
                    return true;
                }
                c0399b.J();
                c0399b.t(g);
                c0399b.v = false;
                return true;
            }
            K k = (K) n;
            String str2 = k.c;
            str2.getClass();
            String[] strArr6 = C0399b.z;
            switch (str2.hashCode()) {
                case -1321546630:
                    str = "template";
                    b = str2.equals(str) ? (byte) 0 : (byte) -1;
                    break;
                case 112:
                    if (str2.equals("p")) {
                        str = "template";
                        b = 1;
                    } else {
                        str = "template";
                    }
                    break;
                case 3152:
                    if (str2.equals("br")) {
                        str = "template";
                        b = 2;
                    } else {
                        str = "template";
                    }
                    break;
                case 3200:
                    if (str2.equals("dd")) {
                        str = "template";
                        b = 3;
                    } else {
                        str = "template";
                    }
                    break;
                case 3216:
                    if (str2.equals("dt")) {
                        str = "template";
                        b = 4;
                    } else {
                        str = "template";
                    }
                    break;
                case 3273:
                    if (str2.equals("h1")) {
                        str = "template";
                        b = 5;
                    } else {
                        str = "template";
                    }
                    break;
                case 3274:
                    if (str2.equals("h2")) {
                        str = "template";
                        b = 6;
                    } else {
                        str = "template";
                    }
                    break;
                case 3275:
                    if (str2.equals("h3")) {
                        str = "template";
                        b = 7;
                    } else {
                        str = "template";
                    }
                    break;
                case 3276:
                    if (str2.equals("h4")) {
                        str = "template";
                        b = 8;
                    } else {
                        str = "template";
                    }
                    break;
                case 3277:
                    if (str2.equals("h5")) {
                        str = "template";
                        b = 9;
                    } else {
                        str = "template";
                    }
                    break;
                case 3278:
                    if (str2.equals("h6")) {
                        str = "template";
                        b = 10;
                    } else {
                        str = "template";
                    }
                    break;
                case 3453:
                    if (str2.equals("li")) {
                        str = "template";
                        b = 11;
                    } else {
                        str = "template";
                    }
                    break;
                case 3029410:
                    if (str2.equals("body")) {
                        str = "template";
                        b = 12;
                    } else {
                        str = "template";
                    }
                    break;
                case 3148996:
                    if (str2.equals("form")) {
                        str = "template";
                        b = 13;
                    } else {
                        str = "template";
                    }
                    break;
                case 3213227:
                    if (str2.equals("html")) {
                        str = "template";
                        b = 14;
                    } else {
                        str = "template";
                    }
                    break;
                case 3536714:
                    if (str2.equals("span")) {
                        str = "template";
                        b = 15;
                    } else {
                        str = "template";
                    }
                    break;
                case 1869063452:
                    if (str2.equals("sarcasm")) {
                        str = "template";
                        b = 16;
                    } else {
                        str = "template";
                    }
                    break;
                default:
                    str = "template";
                    break;
            }
            switch (b) {
                case 0:
                    c0399b.F(n, b2);
                    return true;
                case 1:
                    if (!c0399b.m(str2)) {
                        c0399b.h(this);
                        c0399b.H(str2);
                        return c0399b.E(k);
                    }
                    c0399b.i(str2);
                    if (!c0399b.g(str2)) {
                        c0399b.h(this);
                    }
                    c0399b.C(str2);
                    return true;
                case 2:
                    c0399b.h(this);
                    c0399b.H("br");
                    return false;
                case 3:
                case 4:
                    if (!c0399b.n(str2)) {
                        c0399b.h(this);
                        return false;
                    }
                    c0399b.i(str2);
                    if (!c0399b.g(str2)) {
                        c0399b.h(this);
                    }
                    c0399b.C(str2);
                    return true;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    if (!c0399b.p(strArr3, strArr6, null)) {
                        c0399b.h(this);
                        return false;
                    }
                    c0399b.i(str2);
                    if (!c0399b.g(str2)) {
                        c0399b.h(this);
                    }
                    for (int size = c0399b.e.size() - 1; size >= 0; size--) {
                        com.github.catvod.spider.merge.f0.k kVar3 = (com.github.catvod.spider.merge.f0.k) c0399b.e.get(size);
                        c0399b.e.remove(size);
                        if (com.github.catvod.spider.merge.e0.b.c(kVar3.d.b, strArr3)) {
                            return true;
                        }
                    }
                    return true;
                case 11:
                    String[] strArr7 = C0399b.A;
                    String[] strArr8 = c0399b.y;
                    strArr8[0] = str2;
                    if (!c0399b.p(strArr8, strArr6, strArr7)) {
                        c0399b.h(this);
                        return false;
                    }
                    c0399b.i(str2);
                    if (!c0399b.g(str2)) {
                        c0399b.h(this);
                    }
                    c0399b.C(str2);
                    return true;
                case 12:
                    if (!c0399b.n("body")) {
                        c0399b.h(this);
                        return false;
                    }
                    d(n, c0399b);
                    c0399b.l = B.s;
                    return true;
                case 13:
                    if (c0399b.z(str)) {
                        if (!c0399b.n(str2)) {
                            c0399b.h(this);
                            return false;
                        }
                        c0399b.j(false);
                        if (!c0399b.g(str2)) {
                            c0399b.h(this);
                        }
                        c0399b.C(str2);
                        return true;
                    }
                    com.github.catvod.spider.merge.f0.k kVar4 = c0399b.p;
                    c0399b.p = null;
                    if (kVar4 == null || !c0399b.n(str2)) {
                        c0399b.h(this);
                        return false;
                    }
                    c0399b.j(false);
                    if (!c0399b.g(str2)) {
                        c0399b.h(this);
                    }
                    c0399b.L(kVar4);
                    return true;
                case 14:
                    if (c0399b.G("body")) {
                        return c0399b.E(k);
                    }
                    return true;
                case 15:
                case 16:
                    return d(n, c0399b);
                default:
                    if (!com.github.catvod.spider.merge.e0.b.c(str2, A.q)) {
                        if (com.github.catvod.spider.merge.e0.b.c(str2, A.p)) {
                            if (!c0399b.n(str2)) {
                                c0399b.h(this);
                                return false;
                            }
                            c0399b.j(false);
                            if (!c0399b.g(str2)) {
                                c0399b.h(this);
                            }
                            c0399b.C(str2);
                            return true;
                        }
                        if (!com.github.catvod.spider.merge.e0.b.c(str2, strArr4)) {
                            return d(n, c0399b);
                        }
                        if (!c0399b.n("name")) {
                            if (!c0399b.n(str2)) {
                                c0399b.h(this);
                                return false;
                            }
                            c0399b.j(false);
                            if (!c0399b.g(str2)) {
                                c0399b.h(this);
                            }
                            c0399b.C(str2);
                            c0399b.c();
                        }
                        return true;
                    }
                    String str3 = k.c;
                    ArrayList arrayList = c0399b.e;
                    int i3 = 0;
                    while (i3 < 8) {
                        com.github.catvod.spider.merge.f0.k kVarK = c0399b.k(str3);
                        if (kVarK == null) {
                            return d(n, c0399b);
                        }
                        if (C0399b.A(c0399b.e, kVarK)) {
                            E e = kVarK.d;
                            if (!c0399b.n(e.b)) {
                                c0399b.h(this);
                                return false;
                            }
                            if (c0399b.f() != kVarK) {
                                c0399b.h(this);
                            }
                            int size2 = arrayList.size();
                            boolean z3 = false;
                            int i4 = -1;
                            int i5 = 1;
                            com.github.catvod.spider.merge.f0.k kVar5 = null;
                            while (true) {
                                if (i5 >= size2 || i5 >= 64) {
                                    strArr2 = strArr5;
                                    kVar = null;
                                } else {
                                    kVar = (com.github.catvod.spider.merge.f0.k) arrayList.get(i5);
                                    if (kVar == kVarK) {
                                        com.github.catvod.spider.merge.f0.k kVar6 = (com.github.catvod.spider.merge.f0.k) arrayList.get(i5 - 1);
                                        i4 = 0;
                                        while (true) {
                                            if (i4 >= c0399b.r.size()) {
                                                i4 = -1;
                                            } else if (kVar != c0399b.r.get(i4)) {
                                                i4++;
                                            }
                                        }
                                        kVar5 = kVar6;
                                        strArr2 = strArr5;
                                        z3 = true;
                                    } else if (z3) {
                                        strArr2 = strArr5;
                                        if (com.github.catvod.spider.merge.e0.b.c(kVar.d.b, strArr2)) {
                                        }
                                    } else {
                                        strArr2 = strArr5;
                                    }
                                    i5++;
                                    strArr5 = strArr2;
                                }
                            }
                            if (kVar == null) {
                                c0399b.C(e.b);
                                c0399b.K(kVarK);
                            } else {
                                com.github.catvod.spider.merge.f0.k kVarA = kVar;
                                com.github.catvod.spider.merge.f0.k kVar7 = kVarA;
                                int i6 = 0;
                                try {
                                    while (i6 < 3) {
                                        if (C0399b.A(c0399b.e, kVarA)) {
                                            kVarA = c0399b.a(kVarA);
                                        }
                                        if (!C0399b.A(c0399b.r, kVarA)) {
                                            c0399b.L(kVarA);
                                            kVar7 = kVar7;
                                        } else if (kVarA == kVarK) {
                                            String str4 = str3;
                                            ArrayList arrayList2 = arrayList;
                                            if (kVar5 != null) {
                                                if (com.github.catvod.spider.merge.e0.b.c(kVar5.d.b, A.r)) {
                                                    if (((com.github.catvod.spider.merge.f0.k) kVar7.a) != null) {
                                                        kVar7.w();
                                                    }
                                                    c0399b.x(kVar7);
                                                } else {
                                                    if (((com.github.catvod.spider.merge.f0.k) kVar7.a) != null) {
                                                        kVar7.w();
                                                    }
                                                    kVar5.z(kVar7);
                                                }
                                            }
                                            kVar2 = new com.github.catvod.spider.merge.f0.k(e, c0399b.f, null);
                                            bVarD = kVar2.d();
                                            bVarD2 = kVarK.d();
                                            bVarD.getClass();
                                            i = bVarD2.a;
                                            if (i != 0) {
                                                bVarD.b(bVarD.a + i);
                                                if (bVarD.a != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                i2 = 0;
                                                while (true) {
                                                    if (i2 >= bVarD2.a && com.github.catvod.spider.merge.f0.b.i(bVarD2.b[i2])) {
                                                        i2++;
                                                    } else if (i2 < bVarD2.a) {
                                                        aVar = new com.github.catvod.spider.merge.f0.a(bVarD2.b[i2], (String) bVarD2.c[i2], bVarD2);
                                                        i2++;
                                                        if (z2) {
                                                            bVarD.j(aVar);
                                                        } else {
                                                            String str5 = aVar.a;
                                                            obj = aVar.b;
                                                            if (obj == null) {
                                                                obj = "";
                                                            }
                                                            bVarD.a(obj, str5);
                                                        }
                                                    }
                                                }
                                            }
                                            kVar2.M(kVar.g());
                                            kVar.z(kVar2);
                                            c0399b.K(kVarK);
                                            c0399b.b(kVar2);
                                            c0399b.r.add(i4, kVar2);
                                            c0399b.L(kVarK);
                                            iLastIndexOf = c0399b.e.lastIndexOf(kVar);
                                            if (iLastIndexOf != -1) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            com.github.catvod.spider.merge.G.g.a(z);
                                            c0399b.e.add(iLastIndexOf + 1, kVar2);
                                            i3++;
                                            strArr5 = strArr2;
                                            str3 = str4;
                                            arrayList = arrayList2;
                                        } else {
                                            com.github.catvod.spider.merge.f0.k kVar8 = new com.github.catvod.spider.merge.f0.k(c0399b.O(kVarA.p(), D.d), c0399b.f, null);
                                            ArrayList arrayList3 = c0399b.r;
                                            int iLastIndexOf2 = arrayList3.lastIndexOf(kVarA);
                                            com.github.catvod.spider.merge.G.g.a(iLastIndexOf2 != -1);
                                            arrayList3.set(iLastIndexOf2, kVar8);
                                            ArrayList arrayList4 = c0399b.e;
                                            int iLastIndexOf3 = arrayList4.lastIndexOf(kVarA);
                                            com.github.catvod.spider.merge.G.g.a(iLastIndexOf3 != -1);
                                            arrayList4.set(iLastIndexOf3, kVar8);
                                            if (kVar7 == kVar) {
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 >= c0399b.r.size()) {
                                                        i7 = -1;
                                                    } else if (kVar8 != c0399b.r.get(i7)) {
                                                        i7++;
                                                    }
                                                }
                                                i4 = i7 + 1;
                                            }
                                            if (((com.github.catvod.spider.merge.f0.k) kVar7.a) != null) {
                                                kVar7.w();
                                            }
                                            kVar8.z(kVar7);
                                            kVarA = kVar8;
                                            kVar7 = kVarA;
                                        }
                                        i6++;
                                        str3 = str3;
                                        arrayList = arrayList;
                                    }
                                    c0399b.r.add(i4, kVar2);
                                } catch (IndexOutOfBoundsException unused) {
                                    c0399b.r.add(kVar2);
                                }
                                String str6 = str3;
                                ArrayList arrayList5 = arrayList;
                                if (kVar5 != null) {
                                    if (com.github.catvod.spider.merge.e0.b.c(kVar5.d.b, A.r)) {
                                        if (((com.github.catvod.spider.merge.f0.k) kVar7.a) != null) {
                                            kVar7.w();
                                        }
                                        c0399b.x(kVar7);
                                    } else {
                                        if (((com.github.catvod.spider.merge.f0.k) kVar7.a) != null) {
                                            kVar7.w();
                                        }
                                        kVar5.z(kVar7);
                                    }
                                }
                                kVar2 = new com.github.catvod.spider.merge.f0.k(e, c0399b.f, null);
                                bVarD = kVar2.d();
                                bVarD2 = kVarK.d();
                                bVarD.getClass();
                                i = bVarD2.a;
                                if (i != 0) {
                                    bVarD.b(bVarD.a + i);
                                    if (bVarD.a != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    i2 = 0;
                                    while (true) {
                                        if (i2 >= bVarD2.a) {
                                        }
                                        if (i2 < bVarD2.a) {
                                            aVar = new com.github.catvod.spider.merge.f0.a(bVarD2.b[i2], (String) bVarD2.c[i2], bVarD2);
                                            i2++;
                                            if (z2) {
                                                bVarD.j(aVar);
                                            } else {
                                                String str7 = aVar.a;
                                                obj = aVar.b;
                                                if (obj == null) {
                                                    obj = "";
                                                }
                                                bVarD.a(obj, str7);
                                            }
                                        }
                                    }
                                }
                                kVar2.M(kVar.g());
                                kVar.z(kVar2);
                                c0399b.K(kVarK);
                                c0399b.b(kVar2);
                                c0399b.L(kVarK);
                                iLastIndexOf = c0399b.e.lastIndexOf(kVar);
                                if (iLastIndexOf != -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                com.github.catvod.spider.merge.G.g.a(z);
                                c0399b.e.add(iLastIndexOf + 1, kVar2);
                                i3++;
                                strArr5 = strArr2;
                                str3 = str6;
                                arrayList = arrayList5;
                            }
                            break;
                        } else {
                            c0399b.h(this);
                            c0399b.K(kVarK);
                        }
                        return true;
                    }
                    return true;
            }
        }
        String[] strArr9 = strArr5;
        L l = (L) n;
        String str8 = l.c;
        str8.getClass();
        String[] strArr10 = A.j;
        C0446z c0446z = B.i;
        switch (str8) {
            case "frameset":
                c0399b.h(this);
                ArrayList arrayList6 = c0399b.e;
                if (arrayList6.size() != 1 && ((arrayList6.size() <= 2 || ((com.github.catvod.spider.merge.f0.k) arrayList6.get(1)).d.b.equals("body")) && c0399b.v)) {
                    com.github.catvod.spider.merge.f0.k kVar9 = (com.github.catvod.spider.merge.f0.k) arrayList6.get(1);
                    if (((com.github.catvod.spider.merge.f0.k) kVar9.a) != null) {
                        kVar9.w();
                    }
                    while (arrayList6.size() > 1) {
                        arrayList6.remove(arrayList6.size() - 1);
                    }
                    c0399b.s(l);
                    c0399b.l = B.t;
                    return true;
                }
                return false;
            case "button":
                if (c0399b.m("button")) {
                    c0399b.h(this);
                    c0399b.G("button");
                    c0399b.E(l);
                } else {
                    c0399b.J();
                    c0399b.s(l);
                    c0399b.v = false;
                }
                return true;
            case "iframe":
                c0399b.v = false;
                B.b(l, c0399b);
                return true;
            case "keygen":
            case "br":
            case "img":
            case "wbr":
            case "area":
            case "embed":
                c0399b.J();
                c0399b.v(l);
                c0399b.v = false;
                return true;
            case "option":
            case "optgroup":
                if (c0399b.g("option")) {
                    c0399b.G("option");
                }
                c0399b.J();
                c0399b.s(l);
                return true;
            case "textarea":
                c0399b.s(l);
                if (!l.k) {
                    c0399b.c.o(g1.c);
                    c0399b.m = c0399b.l;
                    c0399b.v = false;
                    c0399b.l = B.h;
                }
                return true;
            case "select":
                c0399b.J();
                c0399b.s(l);
                c0399b.v = false;
                if (!l.k) {
                    B b3 = c0399b.l;
                    if (b3.equals(c0446z) || b3.equals(B.k) || b3.equals(B.m) || b3.equals(B.n) || b3.equals(B.o)) {
                        c0399b.l = B.q;
                    } else {
                        c0399b.l = B.p;
                    }
                }
                return true;
            case "strike":
            case "strong":
            case "b":
            case "i":
            case "s":
            case "u":
            case "em":
            case "tt":
            case "big":
            case "code":
            case "font":
            case "small":
                c0399b.J();
                com.github.catvod.spider.merge.f0.k kVarS = c0399b.s(l);
                c0399b.b(kVarS);
                c0399b.r.add(kVarS);
                return true;
            case "a":
                if (c0399b.k("a") != null) {
                    c0399b.h(this);
                    c0399b.G("a");
                    com.github.catvod.spider.merge.f0.k kVarL2 = c0399b.l("a");
                    if (kVarL2 != null) {
                        c0399b.K(kVarL2);
                        c0399b.L(kVarL2);
                    }
                }
                c0399b.J();
                com.github.catvod.spider.merge.f0.k kVarS2 = c0399b.s(l);
                c0399b.b(kVarS2);
                c0399b.r.add(kVarS2);
                return true;
            case "dd":
            case "dt":
                c0399b.v = false;
                ArrayList arrayList7 = c0399b.e;
                int size3 = arrayList7.size();
                int i8 = size3 - 1;
                int i9 = i8 >= 24 ? size3 - 25 : 0;
                while (i8 >= i9) {
                    com.github.catvod.spider.merge.f0.k kVar10 = (com.github.catvod.spider.merge.f0.k) arrayList7.get(i8);
                    boolean zC = com.github.catvod.spider.merge.e0.b.c(kVar10.d.b, A.k);
                    E e2 = kVar10.d;
                    if (zC) {
                        c0399b.G(e2.b);
                    } else if (!com.github.catvod.spider.merge.e0.b.c(e2.b, strArr9) || com.github.catvod.spider.merge.e0.b.c(e2.b, strArr10)) {
                        i8--;
                    }
                    if (c0399b.m("p")) {
                        c0399b.G("p");
                    }
                    c0399b.s(l);
                    return true;
                }
                if (c0399b.m("p")) {
                    c0399b.G("p");
                }
                c0399b.s(l);
                return true;
            case "h1":
            case "h2":
            case "h3":
            case "h4":
            case "h5":
            case "h6":
                if (c0399b.m("p")) {
                    c0399b.G("p");
                }
                if (com.github.catvod.spider.merge.e0.b.c(c0399b.f().d.b, strArr3)) {
                    c0399b.h(this);
                    c0399b.B();
                }
                c0399b.s(l);
                return true;
            case "hr":
                if (c0399b.m("p")) {
                    c0399b.G("p");
                }
                c0399b.v(l);
                c0399b.v = false;
                return true;
            case "li":
                c0399b.v = false;
                ArrayList arrayList8 = c0399b.e;
                int size4 = arrayList8.size() - 1;
                while (size4 > 0) {
                    com.github.catvod.spider.merge.f0.k kVar11 = (com.github.catvod.spider.merge.f0.k) arrayList8.get(size4);
                    if (kVar11.d.b.equals("li")) {
                        c0399b.G("li");
                    } else {
                        E e3 = kVar11.d;
                        String[] strArr11 = strArr9;
                        if (com.github.catvod.spider.merge.e0.b.c(e3.b, strArr11)) {
                            strArr = strArr10;
                            if (!com.github.catvod.spider.merge.e0.b.c(e3.b, strArr)) {
                            }
                        } else {
                            strArr = strArr10;
                        }
                        size4--;
                        strArr10 = strArr;
                        strArr9 = strArr11;
                    }
                    if (c0399b.m("p")) {
                        c0399b.G("p");
                    }
                    c0399b.s(l);
                    return true;
                }
                if (c0399b.m("p")) {
                    c0399b.G("p");
                }
                c0399b.s(l);
                return true;
            case "rp":
            case "rt":
                if (c0399b.n("ruby")) {
                    c0399b.j(false);
                    if (!c0399b.g("ruby")) {
                        c0399b.h(this);
                        for (int size5 = c0399b.e.size() - 1; size5 >= 0 && !((com.github.catvod.spider.merge.f0.k) c0399b.e.get(size5)).d.b.equals("ruby"); size5--) {
                            c0399b.e.remove(size5);
                        }
                    }
                    c0399b.s(l);
                }
                return true;
            case "pre":
            case "listing":
                if (c0399b.m("p")) {
                    c0399b.G("p");
                }
                c0399b.s(l);
                c0399b.b.p("\n");
                c0399b.v = false;
                return true;
            case "svg":
                c0399b.J();
                c0399b.s(l);
                return true;
            case "xmp":
                if (c0399b.m("p")) {
                    c0399b.G("p");
                }
                c0399b.J();
                c0399b.v = false;
                B.b(l, c0399b);
                return true;
            case "body":
                c0399b.h(this);
                ArrayList arrayList9 = c0399b.e;
                if (arrayList9.size() != 1 && ((arrayList9.size() <= 2 || ((com.github.catvod.spider.merge.f0.k) arrayList9.get(1)).d.b.equals("body")) && !c0399b.z("template"))) {
                    c0399b.v = false;
                    if (l.l() && (kVarL = c0399b.l("body")) != null) {
                        com.github.catvod.spider.merge.f0.b bVar2 = l.l;
                        bVar2.getClass();
                        int i10 = 0;
                        while (true) {
                            if (i10 < bVar2.a && com.github.catvod.spider.merge.f0.b.i(bVar2.b[i10])) {
                                i10++;
                            } else if (i10 < bVar2.a) {
                                com.github.catvod.spider.merge.f0.a aVar2 = new com.github.catvod.spider.merge.f0.a(bVar2.b[i10], (String) bVar2.c[i10], bVar2);
                                i10++;
                                if (!kVarL.l(aVar2.a)) {
                                    kVarL.d().j(aVar2);
                                }
                            }
                        }
                    }
                    return true;
                }
                return false;
            case "form":
                if (c0399b.p != null && !c0399b.z("template")) {
                    c0399b.h(this);
                    return false;
                }
                if (c0399b.m("p")) {
                    c0399b.i("p");
                    if (!"p".equals(c0399b.f().d.b)) {
                        c0399b.h(c0399b.l);
                    }
                    c0399b.C("p");
                }
                c0399b.w(l, true, true);
                return true;
            case "html":
                c0399b.h(this);
                if (!c0399b.z("template")) {
                    if (c0399b.e.size() > 0) {
                        com.github.catvod.spider.merge.f0.k kVar12 = (com.github.catvod.spider.merge.f0.k) c0399b.e.get(0);
                        if (l.l()) {
                            com.github.catvod.spider.merge.f0.b bVar3 = l.l;
                            bVar3.getClass();
                            int i11 = 0;
                            while (true) {
                                if (i11 < bVar3.a && com.github.catvod.spider.merge.f0.b.i(bVar3.b[i11])) {
                                    i11++;
                                } else if (i11 < bVar3.a) {
                                    com.github.catvod.spider.merge.f0.a aVar3 = new com.github.catvod.spider.merge.f0.a(bVar3.b[i11], (String) bVar3.c[i11], bVar3);
                                    i11++;
                                    if (!kVar12.l(aVar3.a)) {
                                        kVar12.d().j(aVar3);
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
                return false;
            case "math":
                c0399b.J();
                c0399b.s(l);
                return true;
            case "nobr":
                c0399b.J();
                if (c0399b.n("nobr")) {
                    c0399b.h(this);
                    c0399b.G("nobr");
                    c0399b.J();
                }
                com.github.catvod.spider.merge.f0.k kVarS3 = c0399b.s(l);
                c0399b.b(kVarS3);
                c0399b.r.add(kVarS3);
                return true;
            case "span":
                c0399b.J();
                c0399b.s(l);
                return true;
            case "image":
                if (c0399b.l("svg") == null) {
                    l.n("img");
                    return c0399b.E(l);
                }
                c0399b.s(l);
                return true;
            case "input":
                c0399b.J();
                if (!c0399b.v(l).c("type").equalsIgnoreCase("hidden")) {
                    c0399b.v = false;
                }
                return true;
            case "table":
                if (c0399b.d.l != 2 && c0399b.m("p")) {
                    c0399b.G("p");
                }
                c0399b.s(l);
                c0399b.v = false;
                c0399b.l = c0446z;
                return true;
            case "plaintext":
                if (c0399b.m("p")) {
                    c0399b.G("p");
                }
                c0399b.s(l);
                c0399b.c.o(g1.g);
                return true;
            case "isindex":
                c0399b.h(this);
                if (c0399b.p == null) {
                    c0399b.H("form");
                    com.github.catvod.spider.merge.f0.b bVar4 = l.l;
                    if (bVar4 != null && bVar4.g("action") != -1 && (nVar = c0399b.p) != null && (bVar = l.l) != null && bVar.g("action") != -1) {
                        nVar.d().k("action", l.l.d("action"));
                    }
                    c0399b.H("hr");
                    c0399b.H("label");
                    com.github.catvod.spider.merge.f0.b bVar5 = l.l;
                    String strD = (bVar5 == null || bVar5.g("prompt") == -1) ? "This is a searchable index. Enter search keywords: " : l.l.d("prompt");
                    G g2 = new G();
                    g2.b = strD;
                    c0399b.E(g2);
                    com.github.catvod.spider.merge.f0.b bVar6 = new com.github.catvod.spider.merge.f0.b();
                    if (l.l()) {
                        com.github.catvod.spider.merge.f0.b bVar7 = l.l;
                        bVar7.getClass();
                        int i12 = 0;
                        while (true) {
                            if (i12 < bVar7.a && com.github.catvod.spider.merge.f0.b.i(bVar7.b[i12])) {
                                i12++;
                            } else if (i12 < bVar7.a) {
                                com.github.catvod.spider.merge.f0.a aVar4 = new com.github.catvod.spider.merge.f0.a(bVar7.b[i12], (String) bVar7.c[i12], bVar7);
                                i12++;
                                if (!com.github.catvod.spider.merge.e0.b.c(aVar4.a, A.n)) {
                                    bVar6.j(aVar4);
                                }
                            }
                        }
                    }
                    bVar6.k("name", "isindex");
                    N n2 = c0399b.g;
                    L l2 = c0399b.j;
                    if (n2 == l2) {
                        L l3 = new L();
                        l3.b = "input";
                        l3.l = bVar6;
                        l3.c = com.github.catvod.spider.merge.l0.i.a("input");
                        c0399b.E(l3);
                    } else {
                        l2.f();
                        l2.b = "input";
                        l2.l = bVar6;
                        l2.c = com.github.catvod.spider.merge.l0.i.a("input");
                        c0399b.E(l2);
                    }
                    c0399b.G("label");
                    c0399b.H("hr");
                    c0399b.G("form");
                    return true;
                }
                return false;
            case "noembed":
                B.b(l, c0399b);
                return true;
            default:
                if (!E.j.containsKey(str8)) {
                    c0399b.s(l);
                } else if (com.github.catvod.spider.merge.e0.b.c(str8, A.h)) {
                    if (c0399b.m("p")) {
                        c0399b.G("p");
                    }
                    c0399b.s(l);
                } else {
                    if (com.github.catvod.spider.merge.e0.b.c(str8, A.g)) {
                        c0399b.g = n;
                        return b2.c(n, c0399b);
                    }
                    if (!com.github.catvod.spider.merge.e0.b.c(str8, strArr4)) {
                        if (com.github.catvod.spider.merge.e0.b.c(str8, A.m)) {
                            c0399b.v(l);
                        } else {
                            if (com.github.catvod.spider.merge.e0.b.c(str8, A.o)) {
                                c0399b.h(this);
                                return false;
                            }
                            c0399b.J();
                            c0399b.s(l);
                        }
                        return true;
                    }
                    c0399b.J();
                    c0399b.s(l);
                    c0399b.r.add(null);
                    c0399b.v = false;
                }
                return true;
        }
    }

    public final boolean d(N n, C0399b c0399b) {
        n.getClass();
        String str = ((K) n).c;
        ArrayList arrayList = c0399b.e;
        if (c0399b.l(str) == null) {
            c0399b.h(this);
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) arrayList.get(size);
            if (kVar.d.b.equals(str)) {
                c0399b.i(str);
                if (!c0399b.g(str)) {
                    c0399b.h(this);
                }
                c0399b.C(str);
                break;
            }
            if (com.github.catvod.spider.merge.e0.b.c(kVar.d.b, C0399b.G)) {
                c0399b.h(this);
                return false;
            }
        }
        return true;
    }
}

package com.github.catvod.spider.merge.f0;

import com.github.catvod.spider.merge.A.C0246c0;
import com.github.catvod.spider.merge.A.C0261h0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.g0.D;
import com.github.catvod.spider.merge.g0.E;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class k extends p {
    public static final List h = Collections.emptyList();
    public static final String i;
    public final E d;
    public WeakReference e;
    public List f;
    public b g;

    static {
        Pattern.compile("\\s+");
        i = "/".concat("baseUri");
    }

    public k(E e, String str, b bVar) {
        com.github.catvod.spider.merge.G.g.e(e);
        this.f = p.c;
        this.g = bVar;
        this.d = e;
        if (str != null) {
            G(str);
        }
    }

    public static void B(p pVar, StringBuilder sb) {
        if (pVar instanceof r) {
            sb.append(((r) pVar).A());
        } else if ((pVar instanceof k) && ((k) pVar).d.b.equals("br")) {
            sb.append("\n");
        }
    }

    public static int L(k kVar, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == kVar) {
                return i2;
            }
        }
        return 0;
    }

    public static boolean O(p pVar) {
        if (pVar instanceof k) {
            k kVar = (k) pVar;
            int i2 = 0;
            while (!kVar.d.g) {
                kVar = (k) kVar.a;
                i2++;
                if (i2 >= 6 || kVar == null) {
                }
            }
            return true;
        }
        return false;
    }

    public final k A(String str) {
        com.github.catvod.spider.merge.l0.j.a(this);
        k kVar = new k(E.a(str, D.c), e(), null);
        z(kVar);
        return kVar;
    }

    public final List C() {
        List list;
        if (this.f.size() == 0) {
            return h;
        }
        WeakReference weakReference = this.e;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.f.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            p pVar = (p) this.f.get(i2);
            if (pVar instanceof k) {
                arrayList.add((k) pVar);
            }
        }
        this.e = new WeakReference(arrayList);
        return arrayList;
    }

    public final com.github.catvod.spider.merge.h0.d D() {
        return new com.github.catvod.spider.merge.h0.d(C());
    }

    @Override // com.github.catvod.spider.merge.f0.p
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public k h() {
        return (k) super.h();
    }

    public final String F() {
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        for (p pVar : this.f) {
            if (pVar instanceof e) {
                sbB.append(((e) pVar).A());
            } else if (pVar instanceof d) {
                sbB.append(((d) pVar).A());
            } else if (pVar instanceof k) {
                sbB.append(((k) pVar).F());
            } else if (pVar instanceof c) {
                sbB.append(((c) pVar).A());
            }
        }
        return com.github.catvod.spider.merge.e0.b.g(sbB);
    }

    public final void G(String str) {
        d().k(i, str);
    }

    public final int H() {
        p pVar = this.a;
        if (((k) pVar) == null) {
            return 0;
        }
        return L(this, ((k) pVar).C());
    }

    public final boolean I(String str) {
        b bVar = this.g;
        if (bVar == null) {
            return false;
        }
        String strE = bVar.e("class");
        int length = strE.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strE);
            }
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Character.isWhitespace(strE.charAt(i3))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i3 - i2 == length2 && strE.regionMatches(true, i2, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i2 = i3;
                    z = true;
                }
            }
            if (z && length - i2 == length2) {
                return strE.regionMatches(true, i2, str, 0, length2);
            }
        }
        return false;
    }

    public final boolean J() {
        for (p pVar : this.f) {
            if (pVar instanceof r) {
                if (!com.github.catvod.spider.merge.e0.b.d(((r) pVar).A())) {
                    return true;
                }
            } else if ((pVar instanceof k) && ((k) pVar).J()) {
                return true;
            }
        }
        return false;
    }

    public final String K() {
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            p pVar = (p) this.f.get(i2);
            g gVarT = pVar.t();
            if (gVarT == null) {
                gVarT = new g("");
            }
            com.github.catvod.spider.merge.l0.k.a(new C0261h0(sbB, gVarT.j), pVar);
        }
        String strG = com.github.catvod.spider.merge.e0.b.g(sbB);
        g gVarT2 = t();
        if (gVarT2 == null) {
            gVarT2 = new g("");
        }
        return gVarT2.j.e ? strG.trim() : strG;
    }

    public final void M(List list) {
        if (list == null) {
            throw new com.github.catvod.spider.merge.d0.b("Children collection to be inserted must not be null.");
        }
        int size = this.f.size();
        if (!(size >= 0)) {
            throw new com.github.catvod.spider.merge.d0.b("Insert position out of bounds.");
        }
        b(size, (p[]) new ArrayList(list).toArray(new p[0]));
    }

    public final String N() {
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            p pVar = (p) this.f.get(i2);
            if (pVar instanceof r) {
                r rVar = (r) pVar;
                String strA = rVar.A();
                if (O(rVar.a) || (rVar instanceof c)) {
                    sbB.append(strA);
                } else {
                    com.github.catvod.spider.merge.e0.b.a(sbB, strA, r.D(sbB));
                }
            } else if ((pVar instanceof k) && ((k) pVar).d.b.equals("br") && !r.D(sbB)) {
                sbB.append(" ");
            }
        }
        return com.github.catvod.spider.merge.e0.b.g(sbB).trim();
    }

    public final k P() {
        List listC;
        int iL;
        p pVar = this.a;
        if (pVar != null && (iL = L(this, (listC = ((k) pVar).C()))) > 0) {
            return (k) listC.get(iL - 1);
        }
        return null;
    }

    public final com.github.catvod.spider.merge.h0.d Q(String str) {
        com.github.catvod.spider.merge.G.g.c(str);
        com.github.catvod.spider.merge.h0.n nVarJ = com.github.catvod.spider.merge.h0.p.j(str);
        com.github.catvod.spider.merge.G.g.e(nVarJ);
        com.github.catvod.spider.merge.h0.d dVar = new com.github.catvod.spider.merge.h0.d();
        com.github.catvod.spider.merge.l0.k.a(new C0246c0(this, dVar, nVarJ), this);
        return dVar;
    }

    public final k R(String str) {
        com.github.catvod.spider.merge.G.g.c(str);
        return new C0246c0(com.github.catvod.spider.merge.h0.p.j(str)).e(this, this);
    }

    public final boolean S(f fVar) {
        k kVar;
        if (fVar.e) {
            E e = this.d;
            if (e.d || ((kVar = (k) this.a) != null && kVar.d.d)) {
                if (!(!e.c)) {
                    return true;
                }
                p pVar = this.a;
                k kVar2 = (k) pVar;
                if (kVar2 != null && !kVar2.d.c) {
                    return true;
                }
                p pVar2 = null;
                if (pVar != null && this.b > 0) {
                    pVar2 = (p) pVar.k().get(this.b - 1);
                }
                if (pVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String T() {
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        com.github.catvod.spider.merge.l0.k.a(new X1(3, sbB), this);
        return com.github.catvod.spider.merge.e0.b.g(sbB).trim();
    }

    public final String U() {
        return this.d.b.equals("textarea") ? T() : c("value");
    }

    public final String V() {
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            B((p) this.f.get(i2), sbB);
        }
        return com.github.catvod.spider.merge.e0.b.g(sbB);
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final b d() {
        if (this.g == null) {
            this.g = new b();
        }
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final String e() {
        for (k kVar = this; kVar != null; kVar = (k) kVar.a) {
            b bVar = kVar.g;
            if (bVar != null) {
                String str = i;
                if (bVar.g(str) != -1) {
                    return kVar.g.d(str);
                }
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final int f() {
        return this.f.size();
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final p i(p pVar) {
        k kVar = (k) super.i(pVar);
        b bVar = this.g;
        kVar.g = bVar != null ? bVar.clone() : null;
        j jVar = new j(kVar, this.f.size());
        kVar.f = jVar;
        jVar.addAll(this.f);
        return kVar;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final p j() {
        this.f.clear();
        return this;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final List k() {
        if (this.f == p.c) {
            this.f = new j(this, 4);
        }
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final boolean m() {
        return this.g != null;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public String p() {
        return this.d.a;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public void r(Appendable appendable, int i2, f fVar) throws IOException {
        if (S(fVar) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            p.n(appendable, i2, fVar);
        }
        Appendable appendableAppend = appendable.append('<');
        E e = this.d;
        appendableAppend.append(e.a);
        b bVar = this.g;
        if (bVar != null) {
            bVar.f(appendable, fVar);
        }
        if (this.f.isEmpty()) {
            boolean z = e.e;
            if (z || e.f) {
                if (fVar.h == 1 && z) {
                    appendable.append('>');
                    return;
                } else {
                    appendable.append(" />");
                    return;
                }
            }
        }
        appendable.append('>');
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public void s(Appendable appendable, int i2, f fVar) throws IOException {
        boolean zIsEmpty = this.f.isEmpty();
        E e = this.d;
        if (zIsEmpty && (e.e || e.f)) {
            return;
        }
        if (fVar.e && !this.f.isEmpty() && e.d) {
            p.n(appendable, i2, fVar);
        }
        appendable.append("</").append(e.a).append('>');
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final p u() {
        return (k) this.a;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final p y() {
        p pVar = this;
        while (true) {
            p pVar2 = pVar.a;
            if (pVar2 == null) {
                return (k) pVar;
            }
            pVar = pVar2;
        }
    }

    public final void z(p pVar) {
        com.github.catvod.spider.merge.G.g.e(pVar);
        p pVar2 = pVar.a;
        if (pVar2 != null) {
            pVar2.x(pVar);
        }
        pVar.a = this;
        k();
        this.f.add(pVar);
        pVar.b = this.f.size() - 1;
    }

    public k() {
        this(E.a("V", D.d), "", null);
    }
}

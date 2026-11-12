package com.github.catvod.spider.merge.f0;

import com.github.catvod.spider.merge.A.C0261h0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class p implements Cloneable {
    public static final List c = Collections.emptyList();
    public p a;
    public int b;

    public static void n(Appendable appendable, int i, f fVar) {
        String strValueOf;
        Appendable appendableAppend = appendable.append('\n');
        int iMin = i * fVar.f;
        String[] strArr = com.github.catvod.spider.merge.e0.b.a;
        if (!(iMin >= 0)) {
            throw new com.github.catvod.spider.merge.d0.b("width must be >= 0");
        }
        int i2 = fVar.g;
        com.github.catvod.spider.merge.G.g.a(i2 >= -1);
        if (i2 != -1) {
            iMin = Math.min(iMin, i2);
        }
        if (iMin < 21) {
            strValueOf = com.github.catvod.spider.merge.e0.b.a[iMin];
        } else {
            char[] cArr = new char[iMin];
            for (int i3 = 0; i3 < iMin; i3++) {
                cArr[i3] = ' ';
            }
            strValueOf = String.valueOf(cArr);
        }
        appendableAppend.append(strValueOf);
    }

    public String a(String str) {
        com.github.catvod.spider.merge.G.g.c(str);
        if (!m() || d().h(str) == -1) {
            return "";
        }
        String strE = e();
        String strE2 = d().e(str);
        Pattern pattern = com.github.catvod.spider.merge.e0.b.d;
        String strReplaceAll = pattern.matcher(strE).replaceAll("");
        String strReplaceAll2 = pattern.matcher(strE2).replaceAll("");
        try {
            try {
                strReplaceAll2 = com.github.catvod.spider.merge.e0.b.h(new URL(strReplaceAll), strReplaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                strReplaceAll2 = new URL(strReplaceAll2).toExternalForm();
            }
            return strReplaceAll2;
        } catch (MalformedURLException unused2) {
            return com.github.catvod.spider.merge.e0.b.c.matcher(strReplaceAll2).find() ? strReplaceAll2 : "";
        }
    }

    public final void b(int i, p... pVarArr) {
        com.github.catvod.spider.merge.G.g.e(pVarArr);
        if (pVarArr.length == 0) {
            return;
        }
        List listK = k();
        p pVarU = pVarArr[0].u();
        if (pVarU != null && pVarU.f() == pVarArr.length) {
            List listK2 = pVarU.k();
            int length = pVarArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    boolean z = f() == 0;
                    pVarU.j();
                    listK.addAll(i, Arrays.asList(pVarArr));
                    int length2 = pVarArr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        pVarArr[i3].a = this;
                        length2 = i3;
                    }
                    if (z && pVarArr[0].b == 0) {
                        return;
                    }
                    v(i);
                    return;
                }
                if (pVarArr[i2] != listK2.get(i2)) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        for (p pVar : pVarArr) {
            if (pVar == null) {
                throw new com.github.catvod.spider.merge.d0.b("Array must not contain any null objects");
            }
        }
        for (p pVar2 : pVarArr) {
            pVar2.getClass();
            p pVar3 = pVar2.a;
            if (pVar3 != null) {
                pVar3.x(pVar2);
            }
            pVar2.a = this;
        }
        listK.addAll(i, Arrays.asList(pVarArr));
        v(i);
    }

    public String c(String str) {
        com.github.catvod.spider.merge.G.g.e(str);
        if (!m()) {
            return "";
        }
        String strE = d().e(str);
        if (strE.length() > 0) {
            return strE;
        }
        return str.startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public abstract b d();

    public abstract String e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract int f();

    public final List g() {
        if (f() == 0) {
            return c;
        }
        List listK = k();
        ArrayList arrayList = new ArrayList(listK.size());
        arrayList.addAll(listK);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    public p h() {
        p pVarI = i(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(pVarI);
        while (!linkedList.isEmpty()) {
            p pVar = (p) linkedList.remove();
            int iF = pVar.f();
            for (int i = 0; i < iF; i++) {
                List listK = pVar.k();
                p pVarI2 = ((p) listK.get(i)).i(pVar);
                listK.set(i, pVarI2);
                linkedList.add(pVarI2);
            }
        }
        return pVarI;
    }

    public p i(p pVar) {
        g gVarT;
        try {
            p pVar2 = (p) super.clone();
            pVar2.a = pVar;
            pVar2.b = pVar == null ? 0 : this.b;
            if (pVar == null && !(this instanceof g) && (gVarT = t()) != null) {
                g gVar = new g(gVarT.e());
                b bVar = gVarT.g;
                if (bVar != null) {
                    gVar.g = bVar.clone();
                }
                gVar.j = gVarT.j.clone();
                pVar2.a = gVar;
                gVar.k().add(pVar2);
            }
            return pVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract p j();

    public abstract List k();

    public final boolean l(String str) {
        com.github.catvod.spider.merge.G.g.e(str);
        if (!m()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (d().h(strSubstring) != -1 && !a(strSubstring).isEmpty()) {
                return true;
            }
        }
        return d().h(str) != -1;
    }

    public abstract boolean m();

    public final p o() {
        p pVar = this.a;
        if (pVar == null) {
            return null;
        }
        List listK = pVar.k();
        int i = this.b + 1;
        if (listK.size() > i) {
            return (p) listK.get(i);
        }
        return null;
    }

    public abstract String p();

    public String q() {
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        g gVarT = t();
        if (gVarT == null) {
            gVarT = new g("");
        }
        com.github.catvod.spider.merge.l0.k.a(new C0261h0(sbB, gVarT.j), this);
        return com.github.catvod.spider.merge.e0.b.g(sbB);
    }

    public abstract void r(Appendable appendable, int i, f fVar);

    public abstract void s(Appendable appendable, int i, f fVar);

    public final g t() {
        p pVarY = y();
        if (pVarY instanceof g) {
            return (g) pVarY;
        }
        return null;
    }

    public String toString() {
        return q();
    }

    public p u() {
        return this.a;
    }

    public final void v(int i) {
        int iF = f();
        if (iF == 0) {
            return;
        }
        List listK = k();
        while (i < iF) {
            ((p) listK.get(i)).b = i;
            i++;
        }
    }

    public final void w() {
        com.github.catvod.spider.merge.G.g.e(this.a);
        this.a.x(this);
    }

    public void x(p pVar) {
        com.github.catvod.spider.merge.G.g.a(pVar.a == this);
        int i = pVar.b;
        k().remove(i);
        v(i);
        pVar.a = null;
    }

    public p y() {
        p pVar = this;
        while (true) {
            p pVar2 = pVar.a;
            if (pVar2 == null) {
                return pVar;
            }
            pVar = pVar2;
        }
    }
}

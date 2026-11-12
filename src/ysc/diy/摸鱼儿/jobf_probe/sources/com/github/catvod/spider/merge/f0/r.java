package com.github.catvod.spider.merge.f0;

import java.io.IOException;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class r extends o {
    public r(String str) {
        this.d = str;
    }

    public static boolean D(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // com.github.catvod.spider.merge.f0.p
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public r h() {
        return (r) super.h();
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public String p() {
        return "#text";
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public void r(Appendable appendable, int i, f fVar) throws IOException {
        boolean z;
        boolean z2;
        boolean z3 = fVar.e;
        p pVar = this.a;
        k kVar = pVar instanceof k ? (k) pVar : null;
        boolean z4 = z3 && !k.O(pVar);
        if (z4) {
            boolean z5 = (this.b == 0 && kVar != null && kVar.d.c) || (this.a instanceof g);
            boolean z6 = o() == null && kVar != null && kVar.d.c;
            p pVarO = o();
            if ((((pVarO instanceof k) && ((k) pVarO).S(fVar)) || ((pVarO instanceof r) && com.github.catvod.spider.merge.e0.b.d(((r) pVarO).A()))) && com.github.catvod.spider.merge.e0.b.d(A())) {
                return;
            }
            if (this.b == 0 && kVar != null && kVar.d.d && !com.github.catvod.spider.merge.e0.b.d(A())) {
                p.n(appendable, i, fVar);
            }
            z = z5;
            z2 = z6;
        } else {
            z = false;
            z2 = false;
        }
        m.b(appendable, A(), fVar, false, z4, z, z2);
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public void s(Appendable appendable, int i, f fVar) {
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final String toString() {
        return q();
    }
}

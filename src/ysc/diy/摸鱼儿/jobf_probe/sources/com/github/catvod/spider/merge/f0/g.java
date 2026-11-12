package com.github.catvod.spider.merge.f0;

import com.github.catvod.spider.merge.A.C0246c0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.g0.C0399b;
import com.github.catvod.spider.merge.g0.D;
import com.github.catvod.spider.merge.g0.E;
import java.util.Iterator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class g extends k {
    public static final com.github.catvod.spider.merge.h0.f m = new com.github.catvod.spider.merge.h0.f("title", 9, false);
    public f j;
    public X1 k;
    public int l;

    public g(String str) {
        super(E.a("#root", D.c), str, null);
        this.j = new f();
        this.l = 1;
        this.k = new X1(new C0399b());
    }

    @Override // com.github.catvod.spider.merge.f0.k
    /* JADX INFO: renamed from: E */
    public final k clone() {
        g gVar = (g) super.clone();
        gVar.j = this.j.clone();
        return gVar;
    }

    public final k W() {
        k kVarX = X();
        for (k kVar : kVarX.C()) {
            if ("body".equals(kVar.d.b) || "frameset".equals(kVar.d.b)) {
                return kVar;
            }
        }
        return kVarX.A("body");
    }

    public final k X() {
        for (k kVar : C()) {
            if (kVar.d.b.equals("html")) {
                return kVar;
            }
        }
        return A("html");
    }

    public final String Y() {
        k kVar;
        k kVarX = X();
        Iterator it = kVarX.C().iterator();
        do {
            if (!it.hasNext()) {
                com.github.catvod.spider.merge.l0.j.a(kVarX);
                kVar = new k(E.a("head", D.c), kVarX.e(), null);
                kVarX.b(0, kVar);
                break;
            }
            kVar = (k) it.next();
        } while (!kVar.d.b.equals("head"));
        k kVarE = new C0246c0(m).e(kVar, kVar);
        if (kVarE == null) {
            return "";
        }
        String strT = kVarE.T();
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        com.github.catvod.spider.merge.e0.b.a(sbB, strT, false);
        return com.github.catvod.spider.merge.e0.b.g(sbB).trim();
    }

    @Override // com.github.catvod.spider.merge.f0.k, com.github.catvod.spider.merge.f0.p
    /* JADX INFO: renamed from: clone */
    public final Object h() {
        g gVar = (g) super.clone();
        gVar.j = this.j.clone();
        return gVar;
    }

    @Override // com.github.catvod.spider.merge.f0.k, com.github.catvod.spider.merge.f0.p
    public final p h() {
        g gVar = (g) super.clone();
        gVar.j = this.j.clone();
        return gVar;
    }

    @Override // com.github.catvod.spider.merge.f0.k, com.github.catvod.spider.merge.f0.p
    public final String p() {
        return "#document";
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final String q() {
        return K();
    }
}

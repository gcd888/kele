package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.T.AbstractC0324i;
import com.github.catvod.spider.merge.T.C0316a;
import com.github.catvod.spider.merge.T.K;
import com.github.catvod.spider.merge.T.W;
import com.github.catvod.spider.merge.j0.A;
import java.util.ArrayList;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class g {
    public boolean a = false;
    public int b = -1;
    public com.github.catvod.spider.merge.V.f c;
    public o d;
    public int e;

    public static void a(n nVar, com.github.catvod.spider.merge.V.f fVar) {
        int iA = nVar.e.a(1);
        while (iA != -1 && !fVar.d(iA)) {
            nVar.c();
            iA = nVar.e.a(1);
        }
    }

    public static String c(String str) {
        return com.github.catvod.spider.merge.D.b.j("'", str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t"), "'");
    }

    public static com.github.catvod.spider.merge.V.f d(n nVar) {
        C0316a c0316a = ((K) nVar.b).a;
        com.github.catvod.spider.merge.V.f fVar = new com.github.catvod.spider.merge.V.f(new int[0]);
        for (o oVar = nVar.g; oVar != null; oVar = oVar.a) {
            int i = oVar.b;
            if (i < 0) {
                break;
            }
            fVar.c(c0316a.c(((W) ((AbstractC0324i) c0316a.a.get(i)).c(0)).c));
        }
        fVar.f();
        return fVar;
    }

    public static String e(c cVar) {
        if (cVar == null) {
            return "<no token>";
        }
        String strA = cVar.a();
        if (strA == null) {
            int i = cVar.a;
            strA = i == -1 ? "<EOF>" : com.github.catvod.spider.merge.D.b.h("<", i, ">");
        }
        return c(strA);
    }

    public final void b() {
        this.a = false;
        this.c = null;
        this.b = -1;
    }

    public void f(n nVar, p pVar) {
        com.github.catvod.spider.merge.V.f fVar;
        if (this.b == nVar.e.a && (fVar = this.c) != null && fVar.d(nVar.c)) {
            nVar.c();
        }
        this.b = nVar.e.a;
        if (this.c == null) {
            this.c = new com.github.catvod.spider.merge.V.f(new int[0]);
        }
        this.c.a(nVar.c);
        a(nVar, d(nVar));
    }

    public c g(n nVar) {
        String str;
        c cVarJ = j(nVar);
        if (cVarJ != null) {
            nVar.c();
            return cVarJ;
        }
        int i = 0;
        if (!((K) nVar.b).a.d(((AbstractC0324i) ((K) nVar.b).a.a.get(nVar.c)).c(0).a, nVar.g).d(nVar.e.a(1))) {
            if (this.d == null) {
                throw new h(nVar);
            }
            throw new h(nVar, this.e, this.d);
        }
        if (!this.a) {
            this.a = true;
            c cVarG = nVar.g();
            nVar.j(cVarG, "missing " + nVar.h().h(A.m) + " at " + e(cVarG), null);
        }
        c cVarG2 = nVar.g();
        com.github.catvod.spider.merge.V.f fVarH = nVar.h();
        if (!fVarH.e()) {
            if (fVarH.e()) {
                throw new RuntimeException("set is empty");
            }
            i = ((com.github.catvod.spider.merge.V.e) fVarH.a.get(0)).a;
        }
        if (i == -1) {
            str = "<missing EOF>";
        } else {
            str = "<missing " + A.m.a(i) + ">";
        }
        String str2 = str;
        c cVarB = nVar.e.b(-1);
        if (cVarG2.a == -1 && cVarB != null) {
            cVarG2 = cVarB;
        }
        d dVar = ((j) ((s) nVar.e.c)).f;
        Object obj = cVarG2.e.a;
        com.github.catvod.spider.merge.V.h hVar = new com.github.catvod.spider.merge.V.h((s) obj, ((j) ((s) obj)).d);
        int i2 = cVarG2.b;
        int i3 = cVarG2.c;
        dVar.getClass();
        c cVar = new c(hVar, i, 0, -1, -1);
        cVar.b = i2;
        cVar.c = i3;
        if (str2 != null) {
            cVar.f = str2;
        }
        return cVar;
    }

    public final void h(n nVar, p pVar) {
        String str;
        if (this.a) {
            return;
        }
        this.a = true;
        if (!(pVar instanceof l)) {
            if (!(pVar instanceof h)) {
                System.err.println("unknown recognition error type: ".concat(pVar.getClass().getName()));
                nVar.j(pVar.d, pVar.getMessage(), pVar);
                return;
            }
            p pVar2 = (h) pVar;
            StringBuilder sb = new StringBuilder("mismatched input ");
            sb.append(e(pVar2.d));
            sb.append(" expecting ");
            r rVar = pVar2.a;
            com.github.catvod.spider.merge.V.f fVarB = rVar != null ? rVar.a().b(pVar2.e, pVar2.b) : null;
            ((A) nVar).getClass();
            sb.append(fVarB.h(A.m));
            nVar.j(pVar2.d, sb.toString(), pVar2);
            return;
        }
        l lVar = (l) pVar;
        e eVar = nVar.e;
        if (eVar != null) {
            c cVar = lVar.f;
            if (cVar.a == -1) {
                str = "<EOF>";
            } else {
                c cVar2 = lVar.d;
                String string = "";
                if (cVar != null && cVar2 != null) {
                    com.github.catvod.spider.merge.V.e eVarA = com.github.catvod.spider.merge.V.e.a(cVar.g, cVar2.g);
                    int i = eVarA.a;
                    int size = eVarA.b;
                    if (i >= 0 && size >= 0) {
                        if (eVar.a == -1) {
                            eVar.j(0);
                            eVar.a = eVar.e(0);
                        }
                        while (eVar.d(1000) >= 1000) {
                        }
                        ArrayList arrayList = (ArrayList) eVar.d;
                        if (size >= arrayList.size()) {
                            size = arrayList.size() - 1;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        while (i <= size) {
                            c cVar3 = (c) arrayList.get(i);
                            if (cVar3.a == -1) {
                                break;
                            }
                            sb2.append(cVar3.a());
                            i++;
                        }
                        string = sb2.toString();
                    }
                }
                str = string;
            }
        } else {
            str = "<unknown input>";
        }
        nVar.j(lVar.d, "no viable alternative at input " + c(str), lVar);
    }

    public final void i(n nVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        c cVarG = nVar.g();
        String strE = e(cVarG);
        com.github.catvod.spider.merge.V.f fVarH = nVar.h();
        StringBuilder sbQ = com.github.catvod.spider.merge.D.b.q("extraneous input ", strE, " expecting ");
        sbQ.append(fVarH.h(A.m));
        nVar.j(cVarG, sbQ.toString(), null);
    }

    public final c j(n nVar) {
        if (!nVar.h().d(nVar.e.a(2))) {
            return null;
        }
        i(nVar);
        nVar.c();
        c cVarG = nVar.g();
        b();
        return cVarG;
    }

    public final void k(n nVar) {
        AbstractC0324i abstractC0324i = (AbstractC0324i) ((K) nVar.b).a.a.get(nVar.c);
        if (this.a) {
            return;
        }
        int iA = nVar.e.a(1);
        com.github.catvod.spider.merge.V.f fVarC = A.o.c(abstractC0324i);
        if (fVarC.d(iA)) {
            this.d = null;
            this.e = -1;
            return;
        }
        if (fVarC.d(-2)) {
            if (this.d == null) {
                this.d = nVar.g;
                this.e = nVar.c;
                return;
            }
            return;
        }
        int iB = abstractC0324i.b();
        if (iB != 3 && iB != 4 && iB != 5) {
            switch (iB) {
                case 9:
                case 11:
                    i(nVar);
                    com.github.catvod.spider.merge.V.f fVarH = nVar.h();
                    com.github.catvod.spider.merge.V.f fVarD = d(nVar);
                    com.github.catvod.spider.merge.V.f fVar = new com.github.catvod.spider.merge.V.f(new int[0]);
                    fVar.c(fVarH);
                    fVar.c(fVarD);
                    a(nVar, fVar);
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (j(nVar) == null) {
            throw new h(nVar);
        }
    }
}

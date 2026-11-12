package com.github.catvod.spider.merge.h0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class f extends n {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ f(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }

    @Override // com.github.catvod.spider.merge.h0.n
    public final boolean a(com.github.catvod.spider.merge.f0.k kVar, com.github.catvod.spider.merge.f0.k kVar2) {
        switch (this.a) {
            case 0:
                return kVar2.l(this.b);
            case 1:
                com.github.catvod.spider.merge.f0.b bVarD = kVar2.d();
                bVarD.getClass();
                ArrayList arrayList = new ArrayList(bVarD.a);
                for (int i = 0; i < bVarD.a; i++) {
                    if (!com.github.catvod.spider.merge.f0.b.i(bVarD.b[i])) {
                        arrayList.add(new com.github.catvod.spider.merge.f0.a(bVarD.b[i], (String) bVarD.c[i], bVarD));
                    }
                }
                Iterator it = Collections.unmodifiableList(arrayList).iterator();
                while (it.hasNext()) {
                    if (com.github.catvod.spider.merge.l0.i.a(((com.github.catvod.spider.merge.f0.a) it.next()).a).startsWith(this.b)) {
                        return true;
                    }
                }
                return false;
            case 2:
                return kVar2.I(this.b);
            case 3:
                return com.github.catvod.spider.merge.l0.i.a(kVar2.F()).contains(this.b);
            case 4:
                return com.github.catvod.spider.merge.l0.i.a(kVar2.N()).contains(this.b);
            case 5:
                return com.github.catvod.spider.merge.l0.i.a(kVar2.T()).contains(this.b);
            case 6:
                return kVar2.V().contains(this.b);
            case 7:
                kVar2.getClass();
                StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
                com.github.catvod.spider.merge.l0.k.a(new com.github.catvod.spider.merge.f0.i(0, sbB), kVar2);
                return com.github.catvod.spider.merge.e0.b.g(sbB).contains(this.b);
            case 8:
                com.github.catvod.spider.merge.f0.b bVar = kVar2.g;
                return this.b.equals(bVar != null ? bVar.e("id") : "");
            case 9:
                return kVar2.d.b.equals(this.b);
            default:
                return kVar2.d.b.endsWith(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return com.github.catvod.spider.merge.D.b.m(new StringBuilder("["), this.b, "]");
            case 1:
                return com.github.catvod.spider.merge.D.b.m(new StringBuilder("[^"), this.b, "]");
            case 2:
                return "." + this.b;
            case 3:
                return com.github.catvod.spider.merge.D.b.m(new StringBuilder(":containsData("), this.b, ")");
            case 4:
                return com.github.catvod.spider.merge.D.b.m(new StringBuilder(":containsOwn("), this.b, ")");
            case 5:
                return com.github.catvod.spider.merge.D.b.m(new StringBuilder(":contains("), this.b, ")");
            case 6:
                return com.github.catvod.spider.merge.D.b.m(new StringBuilder(":containsWholeOwnText("), this.b, ")");
            case 7:
                return com.github.catvod.spider.merge.D.b.m(new StringBuilder(":containsWholeText("), this.b, ")");
            case 8:
                return "#" + this.b;
            case 9:
                return this.b;
            default:
                return this.b;
        }
    }

    public f(String str, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = com.github.catvod.spider.merge.l0.i.a(str);
                break;
            case 4:
                StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
                com.github.catvod.spider.merge.e0.b.a(sbB, str, false);
                this.b = com.github.catvod.spider.merge.l0.i.a(com.github.catvod.spider.merge.e0.b.g(sbB));
                break;
            case 5:
                StringBuilder sbB2 = com.github.catvod.spider.merge.e0.b.b();
                com.github.catvod.spider.merge.e0.b.a(sbB2, str, false);
                this.b = com.github.catvod.spider.merge.l0.i.a(com.github.catvod.spider.merge.e0.b.g(sbB2));
                break;
            default:
                com.github.catvod.spider.merge.G.g.c(str);
                this.b = com.github.catvod.spider.merge.l0.i.a(str);
                break;
        }
    }
}

package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.f0.p;
import com.github.catvod.spider.merge.h0.o;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class k {
    public static void a(o oVar, p pVar) {
        com.github.catvod.spider.merge.G.g.e(pVar);
        p pVarO = pVar;
        int i = 0;
        while (pVarO != null) {
            p pVar2 = pVarO.a;
            int iF = pVar2 != null ? pVar2.f() : 0;
            p pVarO2 = pVarO.o();
            oVar.d(pVarO, i);
            if (pVar2 != null && pVarO.a == null) {
                if (iF == pVar2.f()) {
                    pVarO = (p) pVar2.k().get(pVarO.b);
                } else if (pVarO2 == null) {
                    i--;
                    pVarO = pVar2;
                } else {
                    pVarO = pVarO2;
                }
            }
            if (pVarO.f() > 0) {
                pVarO = (p) pVarO.k().get(0);
                i++;
            } else {
                while (pVarO.o() == null && i > 0) {
                    oVar.f(pVarO, i);
                    pVarO = pVarO.a;
                    i--;
                }
                oVar.f(pVarO, i);
                if (pVarO == pVar) {
                    return;
                } else {
                    pVarO = pVarO.o();
                }
            }
        }
    }
}

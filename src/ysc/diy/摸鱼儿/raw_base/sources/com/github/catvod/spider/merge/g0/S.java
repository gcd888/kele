package com.github.catvod.spider.merge.g0;

import java.util.Locale;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum S extends g1 {
    public S() {
        super("RcdataLessthanSign", 10);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        Locale locale;
        int iV;
        if (c0397a.r('/')) {
            p.d();
            p.o(g1.l);
            p.a.a();
            return;
        }
        if (c0397a.t() && p.o != null) {
            if (p.p == null) {
                p.p = "</" + p.o;
            }
            String str = p.p;
            boolean z = true;
            if (str.equals(c0397a.l)) {
                int i = c0397a.m;
                if (i == -1) {
                    z = false;
                } else if (i < c0397a.e) {
                    c0397a.l = str;
                    locale = Locale.ENGLISH;
                    iV = c0397a.v(str.toLowerCase(locale));
                    if (iV > -1) {
                        c0397a.m = c0397a.e + iV;
                    } else {
                        int iV2 = c0397a.v(str.toUpperCase(locale));
                        if (iV2 > -1) {
                        }
                        c0397a.m = z ? c0397a.e + iV2 : -1;
                    }
                }
            } else {
                c0397a.l = str;
                locale = Locale.ENGLISH;
                iV = c0397a.v(str.toLowerCase(locale));
                if (iV > -1) {
                    c0397a.m = c0397a.e + iV;
                } else {
                    int iV3 = c0397a.v(str.toUpperCase(locale));
                    z = iV3 > -1;
                    c0397a.m = z ? c0397a.e + iV3 : -1;
                }
            }
            if (!z) {
                M mC = p.c(false);
                mC.n(p.o);
                p.k = mC;
                p.k();
                p.o(g1.h);
                return;
            }
        }
        p.g("<");
        p.o(g1.c);
    }
}

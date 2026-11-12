package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum b1 extends g1 {
    public b1() {
        super("CdataSection", 66);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        String strC;
        int iV = c0397a.v("]]>");
        if (iV != -1) {
            strC = C0397a.c(c0397a.a, c0397a.h, c0397a.e, iV);
            c0397a.e += iV;
        } else {
            int i = c0397a.c;
            int i2 = c0397a.e;
            if (i - i2 < 3) {
                c0397a.b();
                char[] cArr = c0397a.a;
                String[] strArr = c0397a.h;
                int i3 = c0397a.e;
                strC = C0397a.c(cArr, strArr, i3, c0397a.c - i3);
                c0397a.e = c0397a.c;
            } else {
                int i4 = i - 2;
                strC = C0397a.c(c0397a.a, c0397a.h, i2, i4 - i2);
                c0397a.e = i4;
            }
        }
        p.h.append(strC);
        if (c0397a.p("]]>") || c0397a.n()) {
            p.f(new F(p.h.toString()));
            p.o(g1.a);
        }
    }
}

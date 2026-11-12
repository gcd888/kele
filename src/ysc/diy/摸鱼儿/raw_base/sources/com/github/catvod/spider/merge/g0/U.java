package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum U extends g1 {
    public U() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(P p, C0397a c0397a) {
        p.g("</");
        p.h(p.h);
        c0397a.z();
        p.o(g1.c);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        if (c0397a.t()) {
            String strH = c0397a.h();
            p.k.k(strH);
            p.h.append(strH);
            return;
        }
        char cE = c0397a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            if (p.n()) {
                p.o(g1.H);
                return;
            } else {
                e(p, c0397a);
                return;
            }
        }
        if (cE == '/') {
            if (p.n()) {
                p.o(g1.P);
                return;
            } else {
                e(p, c0397a);
                return;
            }
        }
        if (cE != '>') {
            e(p, c0397a);
        } else if (!p.n()) {
            e(p, c0397a);
        } else {
            p.k();
            p.o(g1.a);
        }
    }
}

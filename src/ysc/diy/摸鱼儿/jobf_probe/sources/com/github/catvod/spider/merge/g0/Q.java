package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum Q extends g1 {
    public Q() {
        super("TagName", 9);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        char c;
        c0397a.b();
        int i = c0397a.e;
        int i2 = c0397a.c;
        char[] cArr = c0397a.a;
        int i3 = i;
        while (i3 < i2 && (c = cArr[i3]) != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ' && c != '/' && c != '<' && c != '>') {
            i3++;
        }
        c0397a.e = i3;
        p.k.k(i3 > i ? C0397a.c(c0397a.a, c0397a.h, i, i3 - i) : "");
        char cE = c0397a.e();
        if (cE == 0) {
            p.k.k(g1.r0);
            return;
        }
        if (cE != ' ') {
            if (cE == '/') {
                p.o(g1.P);
                return;
            }
            C0400b0 c0400b0 = g1.a;
            if (cE == '<') {
                c0397a.z();
                p.m(this);
            } else if (cE != '>') {
                if (cE == 65535) {
                    p.l(this);
                    p.o(c0400b0);
                    return;
                } else if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                    M m = p.k;
                    m.getClass();
                    m.k(String.valueOf(cE));
                    return;
                }
            }
            p.k();
            p.o(c0400b0);
            return;
        }
        p.o(g1.H);
    }
}

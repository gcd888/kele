package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0433s0 extends g1 {
    public C0433s0() {
        super("AttributeName", 34);
    }

    @Override // com.github.catvod.spider.merge.g0.g1
    public final void d(P p, C0397a c0397a) {
        String strK = c0397a.k(g1.p0);
        M m = p.k;
        m.getClass();
        String strReplace = strK.replace((char) 0, (char) 65533);
        m.f = true;
        String str = m.e;
        StringBuilder sb = m.d;
        if (str != null) {
            sb.append(str);
            m.e = null;
        }
        if (sb.length() == 0) {
            m.e = strReplace;
        } else {
            sb.append(strReplace);
        }
        char cE = c0397a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            p.o(g1.J);
            return;
        }
        if (cE != '\"' && cE != '\'') {
            if (cE == '/') {
                p.o(g1.P);
                return;
            }
            C0400b0 c0400b0 = g1.a;
            if (cE == 65535) {
                p.l(this);
                p.o(c0400b0);
                return;
            }
            switch (cE) {
                case '<':
                    break;
                case '=':
                    p.o(g1.K);
                    break;
                case '>':
                    p.k();
                    p.o(c0400b0);
                    break;
                default:
                    M m2 = p.k;
                    m2.f = true;
                    String str2 = m2.e;
                    StringBuilder sb2 = m2.d;
                    if (str2 != null) {
                        sb2.append(str2);
                        m2.e = null;
                    }
                    sb2.append(cE);
                    break;
            }
            return;
        }
        p.m(this);
        M m3 = p.k;
        m3.f = true;
        String str3 = m3.e;
        StringBuilder sb3 = m3.d;
        if (str3 != null) {
            sb3.append(str3);
            m3.e = null;
        }
        sb3.append(cE);
    }
}

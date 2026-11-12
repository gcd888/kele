package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.p022z.X3;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0405e extends B {
    public C0405e() {
        super("InColumnGroup", 11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (B.a(n)) {
            c0399b.t((G) n);
            return true;
        }
        int iA = X3.a(n.a);
        if (iA != 0) {
            C0436u c0436u = B.d;
            if (iA == 1) {
                L l = (L) n;
                String str = l.c;
                str.getClass();
                switch (str) {
                    case "template":
                        c0399b.F(n, c0436u);
                        break;
                    case "col":
                        c0399b.v(l);
                        break;
                    case "html":
                        C0442x c0442x = B.g;
                        c0399b.g = n;
                        return c0442x.c(n, c0399b);
                    default:
                        return d(n, c0399b);
                }
            } else if (iA == 2) {
                String str2 = ((K) n).c;
                str2.getClass();
                if (str2.equals("template")) {
                    c0399b.F(n, c0436u);
                } else {
                    if (!str2.equals("colgroup")) {
                        return d(n, c0399b);
                    }
                    if (!c0399b.g(str2)) {
                        c0399b.h(this);
                        return false;
                    }
                    c0399b.B();
                    c0399b.l = B.i;
                }
            } else {
                if (iA != 3) {
                    if (iA != 5) {
                        return d(n, c0399b);
                    }
                    if (c0399b.g("html")) {
                        return true;
                    }
                    return d(n, c0399b);
                }
                c0399b.u((H) n);
            }
        } else {
            c0399b.h(this);
        }
        return true;
    }

    public final boolean d(N n, C0399b c0399b) {
        if (!c0399b.g("colgroup")) {
            c0399b.h(this);
            return false;
        }
        c0399b.B();
        c0399b.l = B.i;
        c0399b.E(n);
        return true;
    }
}

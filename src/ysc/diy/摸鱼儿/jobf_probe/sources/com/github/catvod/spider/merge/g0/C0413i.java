package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.p022z.X3;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0413i extends B {
    public C0413i() {
        super("InSelect", 15);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        byte b = 3;
        int iA = X3.a(n.a);
        if (iA == 0) {
            c0399b.h(this);
            return false;
        }
        C0436u c0436u = B.d;
        if (iA == 1) {
            L l = (L) n;
            String str = l.c;
            if (str.equals("html")) {
                C0442x c0442x = B.g;
                c0399b.g = l;
                return c0442x.c(l, c0399b);
            }
            if (str.equals("option")) {
                if (c0399b.g("option")) {
                    c0399b.G("option");
                }
                c0399b.s(l);
            } else {
                if (!str.equals("optgroup")) {
                    if (str.equals("select")) {
                        c0399b.h(this);
                        return c0399b.G("select");
                    }
                    if (com.github.catvod.spider.merge.e0.b.c(str, A.F)) {
                        c0399b.h(this);
                        if (!c0399b.o("select")) {
                            return false;
                        }
                        c0399b.G("select");
                        return c0399b.E(l);
                    }
                    if (str.equals("script") || str.equals("template")) {
                        c0399b.g = n;
                        return c0436u.c(n, c0399b);
                    }
                    c0399b.h(this);
                    return false;
                }
                if (c0399b.g("option")) {
                    c0399b.G("option");
                }
                if (c0399b.g("optgroup")) {
                    c0399b.G("optgroup");
                }
                c0399b.s(l);
            }
        } else if (iA == 2) {
            String str2 = ((K) n).c;
            str2.getClass();
            switch (str2.hashCode()) {
                case -1321546630:
                    if (!str2.equals("template")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -1010136971:
                    if (!str2.equals("option")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -906021636:
                    if (!str2.equals("select")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -80773204:
                    if (!str2.equals("optgroup")) {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    c0399b.g = n;
                    return c0436u.c(n, c0399b);
                case 1:
                    if (!c0399b.g("option")) {
                        c0399b.h(this);
                    } else {
                        c0399b.B();
                    }
                    break;
                case 2:
                    if (!c0399b.o(str2)) {
                        c0399b.h(this);
                        return false;
                    }
                    c0399b.C(str2);
                    c0399b.M();
                    break;
                    break;
                case 3:
                    if (c0399b.g("option") && c0399b.a(c0399b.f()) != null && c0399b.a(c0399b.f()).d.b.equals("optgroup")) {
                        c0399b.G("option");
                    }
                    if (!c0399b.g("optgroup")) {
                        c0399b.h(this);
                    } else {
                        c0399b.B();
                    }
                    break;
                default:
                    c0399b.h(this);
                    return false;
            }
        } else if (iA == 3) {
            c0399b.u((H) n);
        } else if (iA == 4) {
            G g = (G) n;
            if (g.b.equals(B.x)) {
                c0399b.h(this);
                return false;
            }
            c0399b.t(g);
        } else {
            if (iA != 5) {
                c0399b.h(this);
                return false;
            }
            if (!c0399b.g("html")) {
                c0399b.h(this);
            }
        }
        return true;
    }
}

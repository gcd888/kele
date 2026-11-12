package com.github.catvod.spider.merge.g0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final enum C0423n extends B {
    public C0423n() {
        super("InFrameset", 19);
    }

    @Override // com.github.catvod.spider.merge.g0.B
    public final boolean c(N n, C0399b c0399b) {
        if (B.a(n)) {
            c0399b.t((G) n);
        } else if (n.a()) {
            c0399b.u((H) n);
        } else {
            if (n.b()) {
                c0399b.h(this);
                return false;
            }
            if (n.e()) {
                L l = (L) n;
                String str = l.c;
                str.getClass();
                switch (str) {
                    case "frameset":
                        c0399b.s(l);
                        break;
                    case "html":
                        C0442x c0442x = B.g;
                        c0399b.g = l;
                        return c0442x.c(l, c0399b);
                    case "frame":
                        c0399b.v(l);
                        break;
                    case "noframes":
                        C0436u c0436u = B.d;
                        c0399b.g = l;
                        return c0436u.c(l, c0399b);
                    default:
                        c0399b.h(this);
                        return false;
                }
            } else if (n.d() && ((K) n).c.equals("frameset")) {
                if (c0399b.g("html")) {
                    c0399b.h(this);
                    return false;
                }
                c0399b.B();
                if (!c0399b.x && !c0399b.g("frameset")) {
                    c0399b.l = B.u;
                }
            } else {
                if (!n.c()) {
                    c0399b.h(this);
                    return false;
                }
                if (!c0399b.g("html")) {
                    c0399b.h(this);
                }
            }
        }
        return true;
    }
}

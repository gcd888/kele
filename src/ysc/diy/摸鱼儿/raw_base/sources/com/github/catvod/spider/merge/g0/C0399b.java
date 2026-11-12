package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.A.X1;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.g0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0399b {
    public X1 a;
    public C0397a b;
    public P c;
    public com.github.catvod.spider.merge.f0.g d;
    public ArrayList e;
    public String f;
    public N g;
    public D h;
    public HashMap i;
    public B l;
    public B m;
    public boolean n;
    public com.github.catvod.spider.merge.f0.k o;
    public com.github.catvod.spider.merge.f0.n p;
    public com.github.catvod.spider.merge.f0.k q;
    public ArrayList r;
    public ArrayList s;
    public ArrayList t;
    public K u;
    public boolean v;
    public boolean w;
    public boolean x;
    public static final String[] z = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    public static final String[] A = {"ol", "ul"};
    public static final String[] B = {"button"};
    public static final String[] C = {"html", "table"};
    public static final String[] D = {"optgroup", "option"};
    public static final String[] E = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    public static final String[] F = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] G = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    public final L j = new L();
    public final K k = new K();
    public final String[] y = {null};

    public static boolean A(ArrayList arrayList, com.github.catvod.spider.merge.f0.k kVar) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (((com.github.catvod.spider.merge.f0.k) arrayList.get(i)) == kVar) {
                return true;
            }
            i--;
        }
        return false;
    }

    public final void B() {
    }

    public final void C(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) this.e.get(size);
            this.e.remove(size);
            if (kVar.d.b.equals(str)) {
                boolean z2 = this.g instanceof K;
                return;
            }
        }
    }

    public final void D() {
        if (this.s.size() > 0) {
            ArrayList arrayList = this.s;
        }
    }

    public final boolean E(N n) {
        this.g = n;
        return this.l.c(n, this);
    }

    public final boolean F(N n, B b) {
        this.g = n;
        return b.c(n, this);
    }

    public final boolean G(String str) {
        N n = this.g;
        K k = this.k;
        if (n == k) {
            K k2 = new K();
            k2.n(str);
            return E(k2);
        }
        k.f();
        k.n(str);
        return E(k);
    }

    public final void H(String str) {
        N n = this.g;
        L l = this.j;
        if (n == l) {
            L l2 = new L();
            l2.n(str);
            E(l2);
        } else {
            l.f();
            l.n(str);
            E(l);
        }
    }

    public final void I(B b) {
        this.s.add(b);
    }

    public final void J() {
        com.github.catvod.spider.merge.f0.k kVar;
        if (this.e.size() > 256) {
            return;
        }
        boolean z2 = true;
        if (this.r.size() > 0) {
            ArrayList arrayList = this.r;
            kVar = (com.github.catvod.spider.merge.f0.k) arrayList.get(arrayList.size() - 1);
        } else {
            kVar = null;
        }
        if (kVar == null || A(this.e, kVar)) {
            return;
        }
        int size = this.r.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            kVar = (com.github.catvod.spider.merge.f0.k) this.r.get(i3);
            if (kVar == null || A(this.e, kVar)) {
                z2 = false;
                break;
            }
        }
        while (true) {
            if (!z2) {
                i3++;
                kVar = (com.github.catvod.spider.merge.f0.k) this.r.get(i3);
            }
            com.github.catvod.spider.merge.G.g.e(kVar);
            com.github.catvod.spider.merge.f0.k kVar2 = new com.github.catvod.spider.merge.f0.k(O(kVar.d.b, this.h), null, kVar.d().clone());
            y(kVar2);
            this.e.add(kVar2);
            this.r.set(i3, kVar2);
            if (i3 == i2) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    public final void K(com.github.catvod.spider.merge.f0.k kVar) {
        for (int size = this.r.size() - 1; size >= 0; size--) {
            if (((com.github.catvod.spider.merge.f0.k) this.r.get(size)) == kVar) {
                this.r.remove(size);
                return;
            }
        }
    }

    public final void L(com.github.catvod.spider.merge.f0.k kVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((com.github.catvod.spider.merge.f0.k) this.e.get(size)) == kVar) {
                this.e.remove(size);
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0143 A[LOOP:0: B:10:0x0022->B:101:0x0143, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0158  */
    /* JADX WARN: Code duplicated, block: B:107:0x0166  */
    /* JADX WARN: Code duplicated, block: B:109:0x0169  */
    /* JADX WARN: Code duplicated, block: B:110:0x016c  */
    /* JADX WARN: Code duplicated, block: B:116:0x017d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x011c  */
    /* JADX WARN: Code duplicated, block: B:91:0x011f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x013c A[DONT_INVERT] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean M() {
        byte b;
        B b2;
        B b3;
        int size = this.e.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        B b4 = this.l;
        if (this.e.size() == 0) {
            this.l = B.g;
        }
        boolean z2 = false;
        while (i >= i2) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) this.e.get(i);
            if (i == i2) {
                if (this.x) {
                    kVar = this.q;
                }
                z2 = true;
            }
            String str = kVar != null ? kVar.d.b : "";
            str.getClass();
            switch (str.hashCode()) {
                case -1644953643:
                    if (str.equals("frameset")) {
                        b = 0;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList = this.s;
                                b2 = (B) arrayList.get(arrayList.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case -1321546630:
                    if (str.equals("template")) {
                        b = 1;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList2 = this.s;
                                b2 = (B) arrayList2.get(arrayList2.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case -906021636:
                    if (str.equals("select")) {
                        b = 2;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList3 = this.s;
                                b2 = (B) arrayList3.get(arrayList3.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case -636197633:
                    if (str.equals("colgroup")) {
                        b = 3;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList4 = this.s;
                                b2 = (B) arrayList4.get(arrayList4.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case 3696:
                    if (str.equals("td")) {
                        b = 4;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList5 = this.s;
                                b2 = (B) arrayList5.get(arrayList5.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case 3700:
                    if (str.equals("th")) {
                        b = 5;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList6 = this.s;
                                b2 = (B) arrayList6.get(arrayList6.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case 3710:
                    if (str.equals("tr")) {
                        b = 6;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList7 = this.s;
                                b2 = (B) arrayList7.get(arrayList7.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case 3029410:
                    if (str.equals("body")) {
                        b = 7;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList8 = this.s;
                                b2 = (B) arrayList8.get(arrayList8.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case 3198432:
                    if (str.equals("head")) {
                        b = 8;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList9 = this.s;
                                b2 = (B) arrayList9.get(arrayList9.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case 3213227:
                    if (str.equals("html")) {
                        b = 9;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList10 = this.s;
                                b2 = (B) arrayList10.get(arrayList10.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case 110115790:
                    if (str.equals("table")) {
                        b = 10;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList11 = this.s;
                                b2 = (B) arrayList11.get(arrayList11.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case 110157846:
                    if (str.equals("tbody")) {
                        b = 11;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList12 = this.s;
                                b2 = (B) arrayList12.get(arrayList12.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case 110277346:
                    if (str.equals("tfoot")) {
                        b = 12;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList13 = this.s;
                                b2 = (B) arrayList13.get(arrayList13.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case 110326868:
                    if (str.equals("thead")) {
                        b = 13;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList14 = this.s;
                                b2 = (B) arrayList14.get(arrayList14.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
                case 552573414:
                    if (str.equals("caption")) {
                        b = 14;
                    }
                    switch (b) {
                        case 0:
                            this.l = B.t;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 1:
                            if (this.s.size() > 0) {
                                ArrayList arrayList15 = this.s;
                                b2 = (B) arrayList15.get(arrayList15.size() - 1);
                            } else {
                                b2 = null;
                            }
                            if (b2 != null) {
                                throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                            }
                            this.l = b2;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 2:
                            this.l = B.p;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 3:
                            this.l = B.l;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 4:
                        case 5:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.o;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 6:
                            this.l = B.n;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 7:
                            this.l = B.g;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 8:
                            if (!z2) {
                                if (z2) {
                                    i--;
                                } else {
                                    this.l = B.g;
                                }
                                break;
                            } else {
                                this.l = B.d;
                            }
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 9:
                            if (this.o == null) {
                                b3 = B.c;
                            } else {
                                b3 = B.f;
                            }
                            this.l = b3;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 10:
                            this.l = B.i;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 11:
                        case 12:
                        case 13:
                            this.l = B.m;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        case 14:
                            this.l = B.k;
                            if (this.l != b4) {
                                return true;
                            }
                            return false;
                        default:
                            if (z2) {
                                this.l = B.g;
                                if (this.l != b4) {
                                    return true;
                                }
                                return false;
                            }
                            i--;
                            break;
                    }
                    break;
            }
            b = -1;
            switch (b) {
                case 0:
                    this.l = B.t;
                    if (this.l != b4) {
                        return true;
                    }
                    return false;
                case 1:
                    if (this.s.size() > 0) {
                        ArrayList arrayList16 = this.s;
                        b2 = (B) arrayList16.get(arrayList16.size() - 1);
                    } else {
                        b2 = null;
                    }
                    if (b2 != null) {
                        throw new com.github.catvod.spider.merge.d0.b("Bug: no template insertion mode on stack!");
                    }
                    this.l = b2;
                    if (this.l != b4) {
                        return true;
                    }
                    return false;
                case 2:
                    this.l = B.p;
                    if (this.l != b4) {
                        return true;
                    }
                    return false;
                case 3:
                    this.l = B.l;
                    if (this.l != b4) {
                        return true;
                    }
                    return false;
                case 4:
                case 5:
                    if (!z2) {
                        if (z2) {
                            i--;
                        } else {
                            this.l = B.g;
                        }
                        break;
                    } else {
                        this.l = B.o;
                    }
                    if (this.l != b4) {
                        return true;
                    }
                    return false;
                case 6:
                    this.l = B.n;
                    if (this.l != b4) {
                        return true;
                    }
                    return false;
                case 7:
                    this.l = B.g;
                    if (this.l != b4) {
                        return true;
                    }
                    return false;
                case 8:
                    if (!z2) {
                        if (z2) {
                            i--;
                        } else {
                            this.l = B.g;
                        }
                        break;
                    } else {
                        this.l = B.d;
                    }
                    if (this.l != b4) {
                        return true;
                    }
                    return false;
                case 9:
                    if (this.o == null) {
                        b3 = B.c;
                    } else {
                        b3 = B.f;
                    }
                    this.l = b3;
                    if (this.l != b4) {
                        return true;
                    }
                    return false;
                case 10:
                    this.l = B.i;
                    if (this.l != b4) {
                        return true;
                    }
                    return false;
                case 11:
                case 12:
                case 13:
                    this.l = B.m;
                    if (this.l != b4) {
                        return true;
                    }
                    return false;
                case 14:
                    this.l = B.k;
                    if (this.l != b4) {
                        return true;
                    }
                    return false;
                default:
                    if (z2) {
                        this.l = B.g;
                        if (this.l != b4) {
                            return true;
                        }
                        return false;
                    }
                    i--;
                    break;
            }
        }
        if (this.l != b4) {
            return true;
        }
        return false;
    }

    public final void N() {
        N n;
        P p = this.c;
        while (true) {
            if (p.e) {
                StringBuilder sb = p.g;
                int length = sb.length();
                G g = p.l;
                if (length != 0) {
                    String string = sb.toString();
                    sb.delete(0, sb.length());
                    g.b = string;
                    p.f = null;
                    n = g;
                } else {
                    String str = p.f;
                    if (str != null) {
                        g.b = str;
                        p.f = null;
                        n = g;
                    } else {
                        p.e = false;
                        n = p.d;
                    }
                }
                E(n);
                n.f();
                if (n.a == 6) {
                    return;
                }
            } else {
                p.c.d(p, p.a);
            }
        }
    }

    public final E O(String str, D d) {
        E e = (E) this.i.get(str);
        if (e != null) {
            return e;
        }
        E eA = E.a(str, d);
        this.i.put(str, eA);
        return eA;
    }

    public final com.github.catvod.spider.merge.f0.k a(com.github.catvod.spider.merge.f0.k kVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((com.github.catvod.spider.merge.f0.k) this.e.get(size)) == kVar) {
                return (com.github.catvod.spider.merge.f0.k) this.e.get(size - 1);
            }
        }
        return null;
    }

    public final void b(com.github.catvod.spider.merge.f0.k kVar) {
        int size = this.r.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            com.github.catvod.spider.merge.f0.k kVar2 = (com.github.catvod.spider.merge.f0.k) this.r.get(i3);
            if (kVar2 == null) {
                return;
            }
            if (kVar.d.b.equals(kVar2.d.b) && kVar.d().equals(kVar2.d())) {
                i2++;
            }
            if (i2 == 3) {
                this.r.remove(i3);
                return;
            }
        }
    }

    public final void c() {
        while (!this.r.isEmpty()) {
            int size = this.r.size();
            if ((size > 0 ? (com.github.catvod.spider.merge.f0.k) this.r.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final void d(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) this.e.get(size);
            String str = kVar.d.b;
            String[] strArr2 = com.github.catvod.spider.merge.e0.b.a;
            for (String str2 : strArr) {
                if (str2.equals(str)) {
                    return;
                }
            }
            if (kVar.d.b.equals("html")) {
                return;
            }
            this.e.remove(size);
        }
    }

    public final void e() {
        d("table", "template");
    }

    public final com.github.catvod.spider.merge.f0.k f() {
        int size = this.e.size();
        return size > 0 ? (com.github.catvod.spider.merge.f0.k) this.e.get(size - 1) : this.d;
    }

    public final boolean g(String str) {
        com.github.catvod.spider.merge.f0.k kVarF;
        return (this.e.size() == 0 || (kVarF = f()) == null || !kVarF.d.b.equals(str)) ? false : true;
    }

    public final void h(B b) {
        if (((C) this.a.b).a()) {
            ((C) this.a.b).add(new com.github.catvod.spider.merge.A.S0(this.b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.g.getClass().getSimpleName(), this.g, b}));
        }
    }

    public final void i(String str) {
        while (com.github.catvod.spider.merge.e0.b.c(f().d.b, E)) {
            if (str != null && g(str)) {
                return;
            } else {
                B();
            }
        }
    }

    public final void j(boolean z2) {
        String[] strArr = z2 ? F : E;
        while (com.github.catvod.spider.merge.e0.b.c(f().d.b, strArr)) {
            B();
        }
    }

    public final com.github.catvod.spider.merge.f0.k k(String str) {
        for (int size = this.r.size() - 1; size >= 0; size--) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) this.r.get(size);
            if (kVar == null) {
                return null;
            }
            if (kVar.d.b.equals(str)) {
                return kVar;
            }
        }
        return null;
    }

    public final com.github.catvod.spider.merge.f0.k l(String str) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) this.e.get(i);
            if (kVar.d.b.equals(str)) {
                return kVar;
            }
            i--;
        }
        return null;
    }

    public final boolean m(String str) {
        String[] strArr = B;
        String[] strArr2 = z;
        String[] strArr3 = this.y;
        strArr3[0] = str;
        return p(strArr3, strArr2, strArr);
    }

    public final boolean n(String str) {
        String[] strArr = z;
        String[] strArr2 = this.y;
        strArr2[0] = str;
        return p(strArr2, strArr, null);
    }

    public final boolean o(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String str2 = ((com.github.catvod.spider.merge.f0.k) this.e.get(size)).d.b;
            if (str2.equals(str)) {
                return true;
            }
            if (!com.github.catvod.spider.merge.e0.b.c(str2, D)) {
                return false;
            }
        }
        throw new com.github.catvod.spider.merge.d0.b("Should not be reachable");
    }

    public final boolean p(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            String str = ((com.github.catvod.spider.merge.f0.k) this.e.get(i)).d.b;
            if (com.github.catvod.spider.merge.e0.b.c(str, strArr)) {
                return true;
            }
            if (com.github.catvod.spider.merge.e0.b.c(str, strArr2)) {
                return false;
            }
            if (strArr3 != null && com.github.catvod.spider.merge.e0.b.c(str, strArr3)) {
                return false;
            }
            i--;
        }
        return false;
    }

    public final boolean q(String str) {
        String[] strArr = C;
        String[] strArr2 = this.y;
        strArr2[0] = str;
        return p(strArr2, strArr, null);
    }

    public final void r(StringReader stringReader, String str, X1 x1) {
        if (str == null) {
            throw new com.github.catvod.spider.merge.d0.b("The parameter 'baseUri' must not be null.");
        }
        com.github.catvod.spider.merge.f0.g gVar = new com.github.catvod.spider.merge.f0.g(str);
        this.d = gVar;
        gVar.k = x1;
        this.a = x1;
        this.h = D.c;
        C0397a c0397a = new C0397a(stringReader, 32768);
        this.b = c0397a;
        C c = (C) x1.b;
        boolean z2 = c.a > 0;
        if (z2 && c0397a.i == null) {
            c0397a.i = new ArrayList(409);
            c0397a.y();
        } else if (!z2) {
            c0397a.i = null;
        }
        this.g = null;
        this.c = new P(this.b, c);
        this.e = new ArrayList(32);
        this.i = new HashMap();
        this.f = str;
        this.l = B.a;
        this.m = null;
        this.n = false;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new K();
        this.v = true;
        this.w = false;
        this.x = false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    public final com.github.catvod.spider.merge.f0.k s(L l) {
        com.github.catvod.spider.merge.f0.b bVar;
        int i;
        int i2;
        String str;
        if (l.l() && (i = (bVar = l.l).a) != 0) {
            D d = this.h;
            if (i == 0) {
                i2 = 0;
            } else {
                boolean z2 = d.b;
                int i3 = 0;
                i2 = 0;
                while (i3 < bVar.b.length) {
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        String[] strArr = bVar.b;
                        if (i5 >= strArr.length || (str = strArr[i5]) == null) {
                            break;
                        }
                        if (z2 && strArr[i3].equals(str)) {
                            i2++;
                            bVar.l(i5);
                            i5--;
                        } else if (!z2) {
                            String[] strArr2 = bVar.b;
                            if (strArr2[i3].equalsIgnoreCase(strArr2[i5])) {
                                i2++;
                                bVar.l(i5);
                                i5--;
                            }
                        }
                        i5++;
                    }
                    i3 = i4;
                }
            }
            if (i2 > 0) {
                Object[] objArr = {l.c};
                C c = (C) this.a.b;
                if (c.a()) {
                    c.add(new com.github.catvod.spider.merge.A.S0(this.b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
                }
            }
        }
        if (!l.k) {
            E eO = O(l.m(), this.h);
            D d2 = this.h;
            com.github.catvod.spider.merge.f0.b bVar2 = l.l;
            d2.a(bVar2);
            com.github.catvod.spider.merge.f0.k kVar = new com.github.catvod.spider.merge.f0.k(eO, null, bVar2);
            y(kVar);
            this.e.add(kVar);
            return kVar;
        }
        com.github.catvod.spider.merge.f0.k kVarV = v(l);
        this.e.add(kVarV);
        this.c.o(g1.a);
        P p = this.c;
        K k = this.u;
        k.f();
        k.n(kVarV.d.a);
        p.f(k);
        return kVarV;
    }

    public final void t(G g) {
        com.github.catvod.spider.merge.f0.p eVar;
        com.github.catvod.spider.merge.f0.k kVarF = f();
        String str = kVarF.d.b;
        String str2 = g.b;
        if (g instanceof F) {
            eVar = new com.github.catvod.spider.merge.f0.c(str2);
        } else {
            eVar = (str.equals("script") || str.equals("style")) ? new com.github.catvod.spider.merge.f0.e(str2) : new com.github.catvod.spider.merge.f0.r(str2);
        }
        kVarF.z(eVar);
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.g + ", state=" + this.l + ", currentElement=" + f() + '}';
    }

    public final void u(H h) {
        String string = h.c;
        if (string == null) {
            string = h.b.toString();
        }
        y(new com.github.catvod.spider.merge.f0.d(string));
    }

    public final com.github.catvod.spider.merge.f0.k v(L l) {
        E eO = O(l.m(), this.h);
        D d = this.h;
        com.github.catvod.spider.merge.f0.b bVar = l.l;
        d.a(bVar);
        com.github.catvod.spider.merge.f0.k kVar = new com.github.catvod.spider.merge.f0.k(eO, null, bVar);
        y(kVar);
        if (l.k) {
            if (!E.j.containsKey(eO.a)) {
                eO.f = true;
            } else if (!eO.e) {
                P p = this.c;
                Object[] objArr = {eO.b};
                C c = p.b;
                if (c.a()) {
                    c.add(new com.github.catvod.spider.merge.A.S0(p.a, "Tag [%s] cannot be self closing; not a void tag", objArr));
                }
            }
        }
        return kVar;
    }

    public final void w(L l, boolean z2, boolean z3) {
        E eO = O(l.m(), this.h);
        D d = this.h;
        com.github.catvod.spider.merge.f0.b bVar = l.l;
        d.a(bVar);
        com.github.catvod.spider.merge.f0.n nVar = new com.github.catvod.spider.merge.f0.n(eO, bVar);
        if (!z3 || !z("template")) {
            this.p = nVar;
        }
        y(nVar);
        if (z2) {
            this.e.add(nVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    public final void x(com.github.catvod.spider.merge.f0.p pVar) {
        com.github.catvod.spider.merge.f0.k kVarA;
        boolean z2;
        com.github.catvod.spider.merge.f0.k kVarL = l("table");
        if (kVarL != null) {
            kVarA = (com.github.catvod.spider.merge.f0.k) kVarL.a;
            if (kVarA != null) {
                z2 = true;
            } else {
                kVarA = a(kVarL);
            }
            if (z2) {
                kVarA.z(pVar);
                return;
            }
            com.github.catvod.spider.merge.G.g.e(kVarL);
            com.github.catvod.spider.merge.G.g.e(kVarL.a);
            kVarL.a.b(kVarL.b, pVar);
        }
        kVarA = (com.github.catvod.spider.merge.f0.k) this.e.get(0);
        z2 = false;
        if (z2) {
            kVarA.z(pVar);
            return;
        }
        com.github.catvod.spider.merge.G.g.e(kVarL);
        com.github.catvod.spider.merge.G.g.e(kVarL.a);
        kVarL.a.b(kVarL.b, pVar);
    }

    public final void y(com.github.catvod.spider.merge.f0.p pVar) {
        com.github.catvod.spider.merge.f0.n nVar;
        if (this.e.isEmpty()) {
            this.d.z(pVar);
        } else if (this.w && com.github.catvod.spider.merge.e0.b.c(f().d.b, A.A)) {
            x(pVar);
        } else {
            f().z(pVar);
        }
        if (pVar instanceof com.github.catvod.spider.merge.f0.k) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) pVar;
            if (!kVar.d.h || (nVar = this.p) == null) {
                return;
            }
            nVar.j.add(kVar);
        }
    }

    public final boolean z(String str) {
        return l(str) != null;
    }
}

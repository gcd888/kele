package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.g0.O;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class p {
    public static final String[] d = {",", ">", "+", "~", " "};
    public static final String[] e = {"=", "!=", "^=", "$=", "*=", "~="};
    public static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    public static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    public final O a;
    public final String b;
    public final ArrayList c = new ArrayList();

    public p(String str) {
        com.github.catvod.spider.merge.G.g.c(str);
        String strTrim = str.trim();
        this.b = strTrim;
        this.a = new O(strTrim);
    }

    public static n j(String str) {
        try {
            return new p(str).i();
        } catch (IllegalArgumentException e2) {
            throw new q(e2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0110  */
    /* JADX WARN: Code duplicated, block: B:50:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    public final void a(char c) {
        n aVar;
        Object obj;
        boolean z;
        a aVar2;
        c cVar;
        O o = this.a;
        o.f();
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        while (!o.g()) {
            if (o.i("(")) {
                sbB.append("(");
                sbB.append(o.a('(', ')'));
                sbB.append(")");
            } else if (o.i("[")) {
                sbB.append("[");
                sbB.append(o.a('[', ']'));
                sbB.append("]");
            } else if (!o.j(d)) {
                sbB.append(o.c());
            } else if (sbB.length() > 0) {
                break;
            } else {
                o.c();
            }
        }
        n nVarJ = j(com.github.catvod.spider.merge.e0.b.g(sbB));
        ArrayList arrayList = this.c;
        if (arrayList.size() == 1) {
            aVar = (n) arrayList.get(0);
            if ((aVar instanceof b) && c != ',') {
                b bVar = (b) aVar;
                int i = bVar.b;
                n nVar = i > 0 ? (n) bVar.a.get(i - 1) : null;
                z = true;
                n nVar2 = nVar;
                obj = aVar;
                aVar = nVar2;
            }
            arrayList.clear();
            if (c != ' ') {
                aVar2 = new a(new s(aVar, 3), nVarJ);
            } else if (c != '>') {
                aVar2 = new a(new s(aVar, 0), nVarJ);
            } else {
                if (c != '~') {
                    if (c != '+') {
                        aVar2 = new a(new s(aVar, 1), nVarJ);
                    } else {
                        if (c == ',') {
                            throw new q("Unknown combinator '%s'", Character.valueOf(c));
                        }
                        if (aVar instanceof b) {
                            cVar = (b) aVar;
                        } else {
                            b bVar2 = new b();
                            ArrayList arrayList2 = bVar2.a;
                            arrayList2.add(aVar);
                            bVar2.b = arrayList2.size();
                            cVar = bVar2;
                        }
                        ArrayList arrayList3 = cVar.a;
                        arrayList3.add(nVarJ);
                        cVar.b = arrayList3.size();
                    }
                    if (z) {
                        b bVar3 = (b) obj;
                        bVar3.a.set(bVar3.b - 1, cVar);
                    } else {
                        obj = cVar;
                    }
                    arrayList.add(obj);
                }
                aVar2 = new a(new s(aVar, 4), nVarJ);
            }
            cVar = aVar2;
            if (z) {
                b bVar4 = (b) obj;
                bVar4.a.set(bVar4.b - 1, cVar);
            } else {
                obj = cVar;
            }
            arrayList.add(obj);
        }
        aVar = new a(arrayList);
        obj = aVar;
        z = false;
        arrayList.clear();
        if (c != ' ') {
            aVar2 = new a(new s(aVar, 3), nVarJ);
        } else if (c != '>') {
            aVar2 = new a(new s(aVar, 0), nVarJ);
        } else {
            if (c != '~') {
                if (c != '+') {
                    aVar2 = new a(new s(aVar, 1), nVarJ);
                } else {
                    if (c == ',') {
                        throw new q("Unknown combinator '%s'", Character.valueOf(c));
                    }
                    if (aVar instanceof b) {
                        cVar = (b) aVar;
                    } else {
                        b bVar5 = new b();
                        ArrayList arrayList4 = bVar5.a;
                        arrayList4.add(aVar);
                        bVar5.b = arrayList4.size();
                        cVar = bVar5;
                    }
                    ArrayList arrayList5 = cVar.a;
                    arrayList5.add(nVarJ);
                    cVar.b = arrayList5.size();
                }
                if (z) {
                    b bVar6 = (b) obj;
                    bVar6.a.set(bVar6.b - 1, cVar);
                } else {
                    obj = cVar;
                }
                arrayList.add(obj);
            }
            aVar2 = new a(new s(aVar, 4), nVarJ);
        }
        cVar = aVar2;
        if (z) {
            b bVar7 = (b) obj;
            bVar7.a.set(bVar7.b - 1, cVar);
        } else {
            obj = cVar;
        }
        arrayList.add(obj);
    }

    public final int b() {
        boolean z = true;
        String strTrim = this.a.b().trim();
        String[] strArr = com.github.catvod.spider.merge.e0.b.a;
        if (strTrim == null || strTrim.length() == 0) {
            z = false;
            break;
        }
        int length = strTrim.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(strTrim.codePointAt(i))) {
                z = false;
                break;
            }
        }
        if (z) {
            return Integer.parseInt(strTrim);
        }
        throw new com.github.catvod.spider.merge.d0.b("Index must be numeric");
    }

    public final void c(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        O o = this.a;
        o.d(str);
        String strM = O.m(o.a('(', ')'));
        com.github.catvod.spider.merge.G.g.d(strM, str.concat("(text) query must not be empty"));
        this.c.add(z ? new f(strM, 4) : new f(strM, 5));
    }

    public final void d(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        O o = this.a;
        o.d(str);
        String strM = O.m(o.a('(', ')'));
        com.github.catvod.spider.merge.G.g.d(strM, str.concat("(text) query must not be empty"));
        this.c.add(z ? new f(strM, 6, false) : new f(strM, 7, false));
    }

    public final void e(boolean z, boolean z2) {
        int i;
        int i2;
        String strB = com.github.catvod.spider.merge.l0.i.b(this.a.b());
        Matcher matcher = f.matcher(strB);
        Matcher matcher2 = g.matcher(strB);
        if ("odd".equals(strB)) {
            i2 = 2;
            i = 1;
        } else {
            if ("even".equals(strB)) {
                i2 = 2;
            } else if (matcher.matches()) {
                i2 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                if (matcher.group(4) != null) {
                    i = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                }
            } else {
                if (!matcher2.matches()) {
                    throw new q("Could not parse nth-index '%s': unexpected format", strB);
                }
                i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i2 = 0;
            }
            i = 0;
        }
        ArrayList arrayList = this.c;
        if (z2) {
            if (z) {
                arrayList.add(new l(i2, i, 2));
                return;
            } else {
                arrayList.add(new l(i2, i, 3));
                return;
            }
        }
        if (z) {
            arrayList.add(new l(i2, i, 1));
        } else {
            arrayList.add(new l(i2, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        int i = 9;
        int i2 = 4;
        int i3 = 3;
        int i4 = 1;
        int i5 = 2;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        O o = this.a;
        boolean zH = o.h("#");
        ArrayList arrayList = this.c;
        if (zH) {
            String strE = o.e();
            com.github.catvod.spider.merge.G.g.c(strE);
            arrayList.add(new f(strE, 8, z));
            return;
        }
        if (o.h(".")) {
            String strE2 = o.e();
            com.github.catvod.spider.merge.G.g.c(strE2);
            arrayList.add(new f(strE2.trim(), i5, objArr10 == true ? 1 : 0));
            return;
        }
        if (o.k() || o.i("*|")) {
            int i6 = o.c;
            while (!o.g() && (o.k() || o.j("*|", "|", "_", "-"))) {
                o.c++;
            }
            String strB = com.github.catvod.spider.merge.l0.i.b(o.b.substring(i6, o.c));
            com.github.catvod.spider.merge.G.g.c(strB);
            if (strB.startsWith("*|")) {
                arrayList.add(new b(new f(strB.substring(2), i, objArr3 == true ? 1 : 0), new f(strB.replace("*|", ":"), 10, objArr2 == true ? 1 : 0)));
                return;
            }
            if (strB.contains("|")) {
                strB = strB.replace("|", ":");
            }
            arrayList.add(new f(strB, i, objArr == true ? 1 : 0));
            return;
        }
        boolean zI = o.i("[");
        String str = this.b;
        if (zI) {
            O o2 = new O(o.a('[', ']'));
            String[] strArr = e;
            int i7 = o2.c;
            while (!o2.g() && !o2.j(strArr)) {
                o2.c++;
            }
            String strSubstring = o2.b.substring(i7, o2.c);
            com.github.catvod.spider.merge.G.g.c(strSubstring);
            o2.f();
            if (o2.g()) {
                if (strSubstring.startsWith("^")) {
                    arrayList.add(new f(strSubstring.substring(1), 1));
                    return;
                } else {
                    arrayList.add(new f(strSubstring, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0));
                    return;
                }
            }
            if (o2.h("=")) {
                arrayList.add(new g(strSubstring, (int) (objArr7 == true ? 1 : 0), o2.l()));
                return;
            }
            if (o2.h("!=")) {
                arrayList.add(new g(strSubstring, i3, o2.l()));
                return;
            }
            if (o2.h("^=")) {
                arrayList.add(new g(strSubstring, i2, o2.l(), objArr6 == true ? 1 : 0));
                return;
            }
            if (o2.h("$=")) {
                arrayList.add(new g(strSubstring, i5, o2.l(), objArr5 == true ? 1 : 0));
                return;
            } else if (o2.h("*=")) {
                arrayList.add(new g(strSubstring, i4, o2.l()));
                return;
            } else {
                if (!o2.h("~=")) {
                    throw new q("Could not parse attribute query '%s': unexpected token at '%s'", str, o2.l());
                }
                arrayList.add(new h(strSubstring, Pattern.compile(o2.l())));
                return;
            }
        }
        if (o.h("*")) {
            arrayList.add(new e(objArr4 == true ? 1 : 0));
            return;
        }
        if (o.h(":lt(")) {
            arrayList.add(new i(b(), 2));
            return;
        }
        if (o.h(":gt(")) {
            arrayList.add(new i(b(), 1));
            return;
        }
        if (o.h(":eq(")) {
            arrayList.add(new i(b(), 0));
            return;
        }
        if (o.i(":has(")) {
            o.d(":has");
            String strA = o.a('(', ')');
            com.github.catvod.spider.merge.G.g.d(strA, ":has(selector) sub-select must not be empty");
            arrayList.add(new r(j(strA)));
            return;
        }
        if (o.i(":contains(")) {
            c(false);
            return;
        }
        if (o.i(":containsOwn(")) {
            c(true);
            return;
        }
        if (o.i(":containsWholeText(")) {
            d(false);
            return;
        }
        if (o.i(":containsWholeOwnText(")) {
            d(true);
            return;
        }
        if (o.i(":containsData(")) {
            o.d(":containsData");
            String strM = O.m(o.a('(', ')'));
            com.github.catvod.spider.merge.G.g.d(strM, ":containsData(text) query must not be empty");
            arrayList.add(new f(strM, 3));
            return;
        }
        if (o.i(":matches(")) {
            g(false);
            return;
        }
        if (o.i(":matchesOwn(")) {
            g(true);
            return;
        }
        if (o.i(":matchesWholeText(")) {
            h(false);
            return;
        }
        if (o.i(":matchesWholeOwnText(")) {
            h(true);
            return;
        }
        if (o.i(":not(")) {
            o.d(":not");
            String strA2 = o.a('(', ')');
            com.github.catvod.spider.merge.G.g.d(strA2, ":not(selector) subselect must not be empty");
            arrayList.add(new s(j(strA2), 2));
            return;
        }
        if (o.h(":nth-child(")) {
            e(false, false);
            return;
        }
        if (o.h(":nth-last-child(")) {
            e(true, false);
            return;
        }
        if (o.h(":nth-of-type(")) {
            e(false, true);
            return;
        }
        if (o.h(":nth-last-of-type(")) {
            e(true, true);
            return;
        }
        if (o.h(":first-child")) {
            arrayList.add(new e(i5));
            return;
        }
        if (o.h(":last-child")) {
            arrayList.add(new e(i3));
            return;
        }
        if (o.h(":first-of-type")) {
            arrayList.add(new j());
            return;
        }
        if (o.h(":last-of-type")) {
            arrayList.add(new k());
            return;
        }
        if (o.h(":only-child")) {
            arrayList.add(new e(i2));
            return;
        }
        if (o.h(":only-of-type")) {
            arrayList.add(new e(5));
            return;
        }
        if (o.h(":empty")) {
            arrayList.add(new e(i4));
        } else if (o.h(":root")) {
            arrayList.add(new e(6));
        } else {
            if (!o.h(":matchText")) {
                throw new q("Could not parse query '%s': unexpected token at '%s'", str, o.l());
            }
            arrayList.add(new e(7));
        }
    }

    public final void g(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        O o = this.a;
        o.d(str);
        String strA = o.a('(', ')');
        com.github.catvod.spider.merge.G.g.d(strA, str.concat("(regex) query must not be empty"));
        this.c.add(z ? new m(Pattern.compile(strA), 1) : new m(Pattern.compile(strA), 0));
    }

    public final void h(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        O o = this.a;
        o.d(str);
        String strA = o.a('(', ')');
        com.github.catvod.spider.merge.G.g.d(strA, str.concat("(regex) query must not be empty"));
        this.c.add(z ? new m(Pattern.compile(strA), 2) : new m(Pattern.compile(strA), 3));
    }

    public final n i() {
        O o = this.a;
        o.f();
        String[] strArr = d;
        boolean zJ = o.j(strArr);
        ArrayList arrayList = this.c;
        if (zJ) {
            arrayList.add(new e(8));
            a(o.c());
        } else {
            f();
        }
        while (!o.g()) {
            boolean zF = o.f();
            if (o.j(strArr)) {
                a(o.c());
            } else if (zF) {
                a(' ');
            } else {
                f();
            }
        }
        return arrayList.size() == 1 ? (n) arrayList.get(0) : new a(arrayList);
    }

    public final String toString() {
        return this.b;
    }
}

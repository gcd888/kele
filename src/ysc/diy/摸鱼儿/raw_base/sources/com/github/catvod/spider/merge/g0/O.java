package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class O {
    public final /* synthetic */ int a;
    public final String b;
    public int c;

    public O(String str) {
        this.a = 0;
        this.c = 0;
        com.github.catvod.spider.merge.G.g.e(str);
        this.b = str;
    }

    public static String m(String str) {
        StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                sbB.append(c2);
            } else if (c == '\\') {
                sbB.append(c2);
            }
            i++;
            c = c2;
        }
        return com.github.catvod.spider.merge.e0.b.g(sbB);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0071 A[LOOP:0: B:3:0x0009->B:45:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0055 A[EDGE_INSN: B:47:0x0055->B:38:0x0055 BREAK  A[LOOP:0: B:3:0x0009->B:45:0x0071], SYNTHETIC] */
    public String a(char c, char c2) {
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        boolean z3 = false;
        while (!g()) {
            char c4 = c();
            if (c3 != '\\') {
                if (c4 == '\'' && c4 != c && !z) {
                    z2 = !z2;
                } else if (c4 == '\"' && c4 != c && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (c4 == c) {
                        i3++;
                        if (i == -1) {
                            i = this.c;
                        }
                    } else if (c4 == c2) {
                        i3--;
                    }
                }
                if (i3 <= 0) {
                    break;
                }
                c3 = c4;
            } else if (c4 == 'Q') {
                z3 = true;
            } else if (c4 == 'E') {
                z3 = false;
            }
            if (i3 > 0 && c3 != 0) {
                i2 = this.c;
            }
            if (i3 <= 0) {
                break;
                break;
            }
            c3 = c4;
        }
        String strSubstring = i2 >= 0 ? this.b.substring(i, i2) : "";
        if (i3 <= 0) {
            return strSubstring;
        }
        throw new com.github.catvod.spider.merge.d0.b(com.github.catvod.spider.merge.D.b.j("Did not find balanced marker at '", strSubstring, "'"));
    }

    public String b() {
        String strL;
        int i = this.c;
        String str = this.b;
        int iIndexOf = str.indexOf(")", i);
        if (iIndexOf != -1) {
            strL = str.substring(this.c, iIndexOf);
            this.c = strL.length() + this.c;
        } else {
            strL = l();
        }
        h(")");
        return strL;
    }

    public char c() {
        int i = this.c;
        this.c = i + 1;
        return this.b.charAt(i);
    }

    public void d(String str) {
        if (!i(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.b.length();
        int i = this.c;
        if (length > length2 - i) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.c = i + length;
    }

    public String e() {
        String str;
        int i = this.c;
        loop0: while (true) {
            boolean zG = g();
            str = this.b;
            if (zG) {
                break;
            }
            if (!k()) {
                char[] cArr = {'-', '_'};
                if (!g()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            break loop0;
                        }
                        if (str.charAt(this.c) == cArr[i2]) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    break;
                }
            }
            this.c++;
        }
        return str.substring(i, this.c);
    }

    public boolean f() {
        boolean z = false;
        while (!g() && com.github.catvod.spider.merge.e0.b.e(this.b.charAt(this.c))) {
            this.c++;
            z = true;
        }
        return z;
    }

    public boolean g() {
        return this.b.length() - this.c == 0;
    }

    public boolean h(String str) {
        if (!i(str)) {
            return false;
        }
        this.c = str.length() + this.c;
        return true;
    }

    public boolean i(String str) {
        return this.b.regionMatches(true, this.c, str, 0, str.length());
    }

    public boolean j(String... strArr) {
        for (String str : strArr) {
            if (i(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        return !g() && Character.isLetterOrDigit(this.b.charAt(this.c));
    }

    public String l() {
        int i = this.c;
        String str = this.b;
        String strSubstring = str.substring(i);
        this.c = str.length();
        return strSubstring;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b.substring(this.c);
            default:
                return super.toString();
        }
    }

    public O(String str, int i) {
        this.a = 1;
        this.b = str;
        this.c = i;
    }
}

package com.github.catvod.spider.merge.b0;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.ListIterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class n implements Serializable {
    public static final Locale g = new Locale("ja", "JP", "JP");
    public static final Comparator h = Comparator.reverseOrder();
    public static final ConcurrentMap[] i = new ConcurrentMap[17];
    public static final C0395d j = new C0395d(0);
    public static final C0395d k = new C0395d(1);
    public static final h l = new h(1);
    public static final h m = new h(3);
    public static final h n = new h(4);
    public static final h o = new h(6);
    public static final h p = new h(5);
    public static final C0395d q = new C0395d(2);
    public static final h r = new h(8);
    public static final h s = new h(11);
    public static final C0395d t = new C0395d(3);
    public static final C0395d u = new C0395d(4);
    public static final h v = new h(10);
    public static final h w = new h(12);
    public static final h x = new h(13);
    public static final h y = new h(14);
    public final String a;
    public final TimeZone b;
    public final Locale c;
    public final int d;
    public final int e;
    public final transient ArrayList f;

    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x0143  */
    /* JADX WARN: Code duplicated, block: B:90:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0160 A[SYNTHETIC] */
    public n(String str, TimeZone timeZone, Locale locale) {
        int i2;
        k kVar;
        int i3;
        j jVarA;
        this.a = str;
        this.b = timeZone;
        Locale localeA = com.github.catvod.spider.merge.Y.b.a(locale);
        this.c = localeA;
        Calendar calendar = Calendar.getInstance(timeZone, localeA);
        if (localeA.equals(g)) {
            i2 = 0;
        } else {
            calendar.setTime(new Date());
            i2 = calendar.get(1) - 80;
        }
        int i4 = (i2 / 100) * 100;
        this.d = i4;
        this.e = i2 - i4;
        this.f = new ArrayList();
        int i5 = 0;
        while (true) {
            String str2 = this.a;
            if (i5 >= str2.length()) {
                kVar = null;
            } else {
                char cCharAt = str2.charAt(i5);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    StringBuilder sb = new StringBuilder();
                    boolean z = false;
                    while (i5 < str2.length()) {
                        char cCharAt2 = str2.charAt(i5);
                        if (!z && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                            if (!z) {
                                throw new IllegalArgumentException("Unterminated quote");
                            }
                            String string = sb.toString();
                            kVar = new k(new f(string), string.length());
                        } else if (cCharAt2 != '\'' || ((i5 = i5 + 1) != str2.length() && str2.charAt(i5) == '\'')) {
                            i5++;
                            sb.append(cCharAt2);
                        } else {
                            z = !z;
                        }
                    }
                    if (!z) {
                        throw new IllegalArgumentException("Unterminated quote");
                    }
                    String string2 = sb.toString();
                    kVar = new k(new f(string2), string2.length());
                } else {
                    int i6 = i5;
                    do {
                        i6++;
                        if (i6 < str2.length()) {
                        }
                        i3 = i6 - i5;
                        if (cCharAt == 'y') {
                            if (i3 > 2) {
                                jVarA = l;
                            } else {
                                jVarA = j;
                            }
                        } else if (cCharAt != 'z') {
                            switch (cCharAt) {
                                case 'D':
                                    jVarA = o;
                                    break;
                                case 'E':
                                    jVarA = a(7, calendar);
                                    break;
                                case 'F':
                                    jVarA = r;
                                    break;
                                case 'G':
                                    jVarA = a(0, calendar);
                                    break;
                                case 'H':
                                    jVarA = s;
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'K':
                                            jVarA = v;
                                            break;
                                        case 'M':
                                            if (i3 >= 3) {
                                                jVarA = k;
                                            } else {
                                                jVarA = a(2, calendar);
                                            }
                                            break;
                                        case 'S':
                                            jVarA = y;
                                            break;
                                        case 'a':
                                            jVarA = a(9, calendar);
                                            break;
                                        case 'd':
                                            jVarA = p;
                                            break;
                                        case 'h':
                                            jVarA = u;
                                            break;
                                        case 'k':
                                            jVarA = t;
                                            break;
                                        case 'm':
                                            jVarA = w;
                                            break;
                                        case 's':
                                            jVarA = x;
                                            break;
                                        case 'u':
                                            jVarA = q;
                                            break;
                                        case 'w':
                                            jVarA = m;
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 'W':
                                                    jVarA = n;
                                                    break;
                                                case 'X':
                                                    if (i3 != 1) {
                                                        jVarA = g.b;
                                                    } else if (i3 != 2) {
                                                        jVarA = g.c;
                                                    } else {
                                                        if (i3 == 3) {
                                                            g gVar = g.b;
                                                            throw new IllegalArgumentException("invalid number of X");
                                                        }
                                                        jVarA = g.d;
                                                    }
                                                    break;
                                                case 'Y':
                                                    if (i3 > 2) {
                                                        jVarA = j;
                                                    } else {
                                                        jVarA = l;
                                                    }
                                                    break;
                                                case 'Z':
                                                    if (i3 == 2) {
                                                        jVarA = a(15, calendar);
                                                    } else {
                                                        jVarA = g.d;
                                                    }
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException("Format '" + cCharAt + "' not supported");
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            jVarA = a(15, calendar);
                        }
                        kVar = new k(jVarA, i3);
                        i5 = i6;
                    } while (str2.charAt(i6) == cCharAt);
                    i3 = i6 - i5;
                    if (cCharAt == 'y') {
                        if (i3 > 2) {
                            jVarA = l;
                        } else {
                            jVarA = j;
                        }
                    } else if (cCharAt != 'z') {
                        switch (cCharAt) {
                            case 'D':
                                jVarA = o;
                                break;
                            case 'E':
                                jVarA = a(7, calendar);
                                break;
                            case 'F':
                                jVarA = r;
                                break;
                            case 'G':
                                jVarA = a(0, calendar);
                                break;
                            case 'H':
                                jVarA = s;
                                break;
                            default:
                                switch (cCharAt) {
                                    case 'K':
                                        jVarA = v;
                                        break;
                                    case 'M':
                                        if (i3 >= 3) {
                                            jVarA = k;
                                        } else {
                                            jVarA = a(2, calendar);
                                        }
                                        break;
                                    case 'S':
                                        jVarA = y;
                                        break;
                                    case 'a':
                                        jVarA = a(9, calendar);
                                        break;
                                    case 'd':
                                        jVarA = p;
                                        break;
                                    case 'h':
                                        jVarA = u;
                                        break;
                                    case 'k':
                                        jVarA = t;
                                        break;
                                    case 'm':
                                        jVarA = w;
                                        break;
                                    case 's':
                                        jVarA = x;
                                        break;
                                    case 'u':
                                        jVarA = q;
                                        break;
                                    case 'w':
                                        jVarA = m;
                                        break;
                                    default:
                                        switch (cCharAt) {
                                            case 'W':
                                                jVarA = n;
                                                break;
                                            case 'X':
                                                if (i3 != 1) {
                                                    jVarA = g.b;
                                                } else if (i3 != 2) {
                                                    jVarA = g.c;
                                                } else {
                                                    if (i3 == 3) {
                                                        g gVar2 = g.b;
                                                        throw new IllegalArgumentException("invalid number of X");
                                                    }
                                                    jVarA = g.d;
                                                }
                                                break;
                                            case 'Y':
                                                if (i3 > 2) {
                                                    jVarA = j;
                                                } else {
                                                    jVarA = l;
                                                }
                                                break;
                                            case 'Z':
                                                if (i3 == 2) {
                                                    jVarA = a(15, calendar);
                                                } else {
                                                    jVarA = g.d;
                                                }
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Format '" + cCharAt + "' not supported");
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        jVarA = a(15, calendar);
                    }
                    kVar = new k(jVarA, i3);
                    i5 = i6;
                }
            }
            if (kVar == null) {
                return;
            } else {
                this.f.add(kVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    public static void c(StringBuilder sb, String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '$' && cCharAt != '.' && cCharAt != '?' && cCharAt != '^' && cCharAt != '[' && cCharAt != '\\' && cCharAt != '{' && cCharAt != '|') {
                switch (cCharAt) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        sb.append('\\');
                        break;
                }
            } else {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.append('?');
        }
    }

    public final j a(int i2, Calendar calendar) {
        ConcurrentMap concurrentMap;
        ConcurrentMap[] concurrentMapArr = i;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i2] == null) {
                    concurrentMapArr[i2] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i2];
            } catch (Throwable th) {
                throw th;
            }
        }
        j mVar = (j) concurrentMap.get(this.c);
        if (mVar == null) {
            mVar = i2 == 15 ? new m(this.c) : new C0396e(i2, calendar, this.c);
            j jVar = (j) concurrentMap.putIfAbsent(this.c, mVar);
            if (jVar != null) {
                return jVar;
            }
        }
        return mVar;
    }

    public final Date b(String str, ParsePosition parsePosition) {
        int i2;
        Calendar calendar = Calendar.getInstance(this.b, this.c);
        calendar.clear();
        ListIterator listIterator = this.f.listIterator();
        while (listIterator.hasNext()) {
            k kVar = (k) listIterator.next();
            if (kVar.a.a() && listIterator.hasNext()) {
                j jVar = ((k) listIterator.next()).a;
                listIterator.previous();
                i2 = jVar.a() ? kVar.b : 0;
            } else {
                i2 = 0;
            }
            if (!kVar.a.b(this, calendar, str, parsePosition, i2)) {
                return null;
            }
        }
        return calendar.getTime();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a.equals(nVar.a) && this.b.equals(nVar.b) && this.c.equals(nVar.c);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 13) + this.b.hashCode()) * 13) + this.a.hashCode();
    }

    public final String toString() {
        return "FastDateParser[" + this.a + ", " + this.c + ", " + this.b.getID() + "]";
    }
}

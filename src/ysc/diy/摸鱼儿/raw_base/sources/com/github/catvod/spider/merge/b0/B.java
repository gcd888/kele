package com.github.catvod.spider.merge.b0;

import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class B implements Serializable {
    public static final t[] f = new t[0];
    public static final ConcurrentHashMap g = new ConcurrentHashMap(7);
    public final String a;
    public final TimeZone b;
    public final Locale c;
    public final transient t[] d;
    public final transient int e;

    /* JADX WARN: Code duplicated, block: B:100:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:111:0x0206  */
    /* JADX WARN: Code duplicated, block: B:113:0x020a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0217  */
    /* JADX WARN: Code duplicated, block: B:121:0x023f A[LOOP:2: B:119:0x023b->B:121:0x023f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00df  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x011a  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0130  */
    /* JADX WARN: Code duplicated, block: B:75:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0141  */
    /* JADX WARN: Code duplicated, block: B:78:0x0148  */
    /* JADX WARN: Code duplicated, block: B:80:0x014c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0150  */
    /* JADX WARN: Code duplicated, block: B:84:0x0157  */
    /* JADX WARN: Code duplicated, block: B:85:0x015d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0162  */
    /* JADX WARN: Code duplicated, block: B:87:0x016e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0175  */
    /* JADX WARN: Code duplicated, block: B:89:0x017c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0188  */
    /* JADX WARN: Code duplicated, block: B:91:0x0196  */
    /* JADX WARN: Code duplicated, block: B:92:0x019d  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.github.catvod.spider.merge.b0.r] */
    /* JADX WARN: Type inference failed for: r15v9 */
    public B(String str, TimeZone timeZone, Locale locale) {
        int length;
        int iC;
        int i;
        int i2;
        String string;
        int i3;
        int length2;
        char cCharAt;
        Object objD;
        ?? pVar;
        TimeZone timeZone2;
        String strSubstring;
        Object pVar2;
        String[] strArr;
        q qVar;
        String str2 = str;
        this.a = str2;
        this.b = timeZone;
        Locale localeA = com.github.catvod.spider.merge.Y.b.a(locale);
        this.c = localeA;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(localeA);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length3 = str.length();
        int[] iArr = new int[1];
        char c = 0;
        int i4 = 0;
        while (i4 < length3) {
            iArr[c] = i4;
            StringBuilder sb = new StringBuilder();
            int i5 = iArr[c];
            int length4 = str.length();
            char cCharAt2 = str2.charAt(i5);
            String[] strArr2 = weekdays;
            String[] strArr3 = shortWeekdays;
            if ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < 'a' || cCharAt2 > 'z')) {
                char c2 = '\'';
                sb.append('\'');
                boolean z = false;
                while (true) {
                    if (i5 < length4) {
                        char cCharAt3 = str2.charAt(i5);
                        if (cCharAt3 == c2) {
                            int i6 = i5 + 1;
                            i = length3;
                            if (i6 >= length4 || str2.charAt(i6) != '\'') {
                                z = !z;
                            } else {
                                sb.append(cCharAt3);
                                i5 = i6;
                            }
                            i2 = 1;
                        } else {
                            i = length3;
                            if (z || ((cCharAt3 < 'A' || cCharAt3 > 'Z') && (cCharAt3 < 'a' || cCharAt3 > 'z'))) {
                                sb.append(cCharAt3);
                                i2 = 1;
                            } else {
                                i5--;
                            }
                        }
                        i5 += i2;
                        str2 = str;
                        length3 = i;
                        c2 = '\'';
                    }
                    iArr[0] = i5;
                    string = sb.toString();
                    i3 = iArr[0];
                    length2 = string.length();
                    if (length2 == 0) {
                        t[] tVarArr = (t[]) arrayList.toArray(f);
                        this.d = tVarArr;
                        length = tVarArr.length;
                        iC = 0;
                        while (true) {
                            length--;
                            if (length < 0) {
                                this.e = iC;
                                return;
                            }
                            iC += this.d[length].c();
                        }
                    } else {
                        cCharAt = string.charAt(0);
                        if (cCharAt == 'y') {
                            if (length2 == 2) {
                                objD = z.c;
                            } else {
                                objD = d(1, Math.max(length2, 4));
                            }
                            pVar = objD;
                            if (cCharAt == 'Y') {
                                pVar = new p(pVar, 3);
                                continue;
                                continue;
                            }
                        } else if (cCharAt != 'z') {
                            switch (cCharAt) {
                                case '\'':
                                    strSubstring = string.substring(1);
                                    if (strSubstring.length() == 1) {
                                        pVar = new u(strSubstring);
                                    } else {
                                        pVar = new o(strSubstring.charAt(0));
                                    }
                                    break;
                                case 'K':
                                    pVar2 = d(10, length2);
                                    pVar = pVar2;
                                    break;
                                case 'M':
                                    if (length2 >= 4) {
                                        pVar2 = new v(months, 2);
                                    } else if (length2 == 3) {
                                        pVar2 = new v(shortMonths, 2);
                                    } else if (length2 == 2) {
                                        pVar2 = z.b;
                                    } else {
                                        pVar2 = z.d;
                                    }
                                    pVar = pVar2;
                                    break;
                                case 'S':
                                    pVar2 = d(14, length2);
                                    pVar = pVar2;
                                    break;
                                case 'a':
                                    pVar2 = new v(amPmStrings, 9);
                                    pVar = pVar2;
                                    break;
                                case 'd':
                                    pVar2 = d(5, length2);
                                    pVar = pVar2;
                                    break;
                                case 'h':
                                    pVar2 = new p(d(10, length2), 1);
                                    pVar = pVar2;
                                    break;
                                case 'k':
                                    pVar2 = new p(d(11, length2), 2);
                                    pVar = pVar2;
                                    break;
                                case 'm':
                                    pVar2 = d(12, length2);
                                    pVar = pVar2;
                                    break;
                                case 's':
                                    pVar2 = d(13, length2);
                                    pVar = pVar2;
                                    break;
                                case 'u':
                                    pVar2 = new p(d(7, length2), 0);
                                    pVar = pVar2;
                                    break;
                                case 'w':
                                    pVar2 = d(3, length2);
                                    pVar = pVar2;
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'D':
                                            pVar2 = d(6, length2);
                                            pVar = pVar2;
                                            break;
                                        case 'E':
                                            if (length2 < 4) {
                                                strArr = strArr3;
                                            } else {
                                                strArr = strArr2;
                                            }
                                            pVar2 = new v(strArr, 7);
                                            pVar = pVar2;
                                            break;
                                        case 'F':
                                            pVar2 = d(8, length2);
                                            pVar = pVar2;
                                            break;
                                        case 'G':
                                            pVar2 = new v(eras, 0);
                                            pVar = pVar2;
                                            break;
                                        case 'H':
                                            pVar2 = d(11, length2);
                                            pVar = pVar2;
                                            break;
                                        default:
                                            qVar = q.d;
                                            switch (cCharAt) {
                                                case 'W':
                                                    pVar2 = d(4, length2);
                                                    break;
                                                case 'X':
                                                    pVar2 = qVar;
                                                    if (length2 != 1) {
                                                        pVar2 = q.b;
                                                    } else if (length2 != 2) {
                                                        pVar2 = q.c;
                                                    } else if (length2 != 3) {
                                                        throw new IllegalArgumentException("invalid number of X");
                                                    }
                                                    break;
                                                case 'Y':
                                                    if (length2 == 2) {
                                                        objD = z.c;
                                                    } else {
                                                        objD = d(1, Math.max(length2, 4));
                                                    }
                                                    pVar = objD;
                                                    if (cCharAt == 'Y') {
                                                        pVar = new p(pVar, 3);
                                                        continue;
                                                        continue;
                                                    }
                                                    break;
                                                case 'Z':
                                                    pVar2 = qVar;
                                                    if (length2 == 1) {
                                                        pVar2 = y.c;
                                                    } else if (length2 != 2) {
                                                        pVar2 = y.b;
                                                    }
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException("Illegal pattern component: ".concat(string));
                                            }
                                            pVar = pVar2;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            timeZone2 = this.b;
                            if (length2 >= 4) {
                                pVar = new x(timeZone2, localeA, 1);
                            } else {
                                pVar = new x(timeZone2, localeA, 0);
                            }
                        }
                        arrayList.add(pVar);
                        i4 = i3 + 1;
                        str2 = str;
                        weekdays = strArr2;
                        shortWeekdays = strArr3;
                        length3 = i;
                        c = 0;
                    }
                }
            } else {
                sb.append(cCharAt2);
                while (true) {
                    int i7 = i5 + 1;
                    if (i7 < length4 && str2.charAt(i7) == cCharAt2) {
                        sb.append(cCharAt2);
                        i5 = i7;
                    }
                }
            }
            i = length3;
            iArr[0] = i5;
            string = sb.toString();
            i3 = iArr[0];
            length2 = string.length();
            if (length2 == 0) {
                t[] tVarArr2 = (t[]) arrayList.toArray(f);
                this.d = tVarArr2;
                length = tVarArr2.length;
                iC = 0;
                while (true) {
                    length--;
                    if (length < 0) {
                        this.e = iC;
                        return;
                    }
                    iC += this.d[length].c();
                }
            } else {
                cCharAt = string.charAt(0);
                if (cCharAt == 'y') {
                    if (length2 == 2) {
                        objD = z.c;
                    } else {
                        objD = d(1, Math.max(length2, 4));
                    }
                    pVar = objD;
                    if (cCharAt == 'Y') {
                        pVar = new p(pVar, 3);
                        continue;
                        continue;
                    }
                } else if (cCharAt != 'z') {
                    switch (cCharAt) {
                        case '\'':
                            strSubstring = string.substring(1);
                            if (strSubstring.length() == 1) {
                                pVar = new u(strSubstring);
                            } else {
                                pVar = new o(strSubstring.charAt(0));
                            }
                            break;
                        case 'K':
                            pVar2 = d(10, length2);
                            pVar = pVar2;
                            break;
                        case 'M':
                            if (length2 >= 4) {
                                pVar2 = new v(months, 2);
                            } else if (length2 == 3) {
                                pVar2 = new v(shortMonths, 2);
                            } else if (length2 == 2) {
                                pVar2 = z.b;
                            } else {
                                pVar2 = z.d;
                            }
                            pVar = pVar2;
                            break;
                        case 'S':
                            pVar2 = d(14, length2);
                            pVar = pVar2;
                            break;
                        case 'a':
                            pVar2 = new v(amPmStrings, 9);
                            pVar = pVar2;
                            break;
                        case 'd':
                            pVar2 = d(5, length2);
                            pVar = pVar2;
                            break;
                        case 'h':
                            pVar2 = new p(d(10, length2), 1);
                            pVar = pVar2;
                            break;
                        case 'k':
                            pVar2 = new p(d(11, length2), 2);
                            pVar = pVar2;
                            break;
                        case 'm':
                            pVar2 = d(12, length2);
                            pVar = pVar2;
                            break;
                        case 's':
                            pVar2 = d(13, length2);
                            pVar = pVar2;
                            break;
                        case 'u':
                            pVar2 = new p(d(7, length2), 0);
                            pVar = pVar2;
                            break;
                        case 'w':
                            pVar2 = d(3, length2);
                            pVar = pVar2;
                            break;
                        default:
                            switch (cCharAt) {
                                case 'D':
                                    pVar2 = d(6, length2);
                                    pVar = pVar2;
                                    break;
                                case 'E':
                                    if (length2 < 4) {
                                        strArr = strArr3;
                                    } else {
                                        strArr = strArr2;
                                    }
                                    pVar2 = new v(strArr, 7);
                                    pVar = pVar2;
                                    break;
                                case 'F':
                                    pVar2 = d(8, length2);
                                    pVar = pVar2;
                                    break;
                                case 'G':
                                    pVar2 = new v(eras, 0);
                                    pVar = pVar2;
                                    break;
                                case 'H':
                                    pVar2 = d(11, length2);
                                    pVar = pVar2;
                                    break;
                                default:
                                    qVar = q.d;
                                    switch (cCharAt) {
                                        case 'W':
                                            pVar2 = d(4, length2);
                                            break;
                                        case 'X':
                                            pVar2 = qVar;
                                            if (length2 != 1) {
                                                pVar2 = q.b;
                                            } else if (length2 != 2) {
                                                pVar2 = q.c;
                                            } else if (length2 != 3) {
                                                throw new IllegalArgumentException("invalid number of X");
                                            }
                                            break;
                                        case 'Y':
                                            if (length2 == 2) {
                                                objD = z.c;
                                            } else {
                                                objD = d(1, Math.max(length2, 4));
                                            }
                                            pVar = objD;
                                            if (cCharAt == 'Y') {
                                                pVar = new p(pVar, 3);
                                                continue;
                                                continue;
                                            }
                                            break;
                                        case 'Z':
                                            pVar2 = qVar;
                                            if (length2 == 1) {
                                                pVar2 = y.c;
                                            } else if (length2 != 2) {
                                                pVar2 = y.b;
                                            }
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Illegal pattern component: ".concat(string));
                                    }
                                    pVar = pVar2;
                                    break;
                            }
                            break;
                    }
                } else {
                    timeZone2 = this.b;
                    if (length2 >= 4) {
                        pVar = new x(timeZone2, localeA, 1);
                    } else {
                        pVar = new x(timeZone2, localeA, 0);
                    }
                }
                arrayList.add(pVar);
                i4 = i3 + 1;
                str2 = str;
                weekdays = strArr2;
                shortWeekdays = strArr3;
                length3 = i;
                c = 0;
            }
        }
        t[] tVarArr3 = (t[]) arrayList.toArray(f);
        this.d = tVarArr3;
        length = tVarArr3.length;
        iC = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.e = iC;
                return;
            }
            iC += this.d[length].c();
        }
    }

    public static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static void b(StringBuilder sb, int i, int i2) {
        int i3;
        if (i < 10000) {
            if (i >= 1000) {
                i3 = 4;
            } else if (i < 100) {
                i3 = i < 10 ? 1 : 2;
            } else {
                i3 = 3;
            }
            for (int i4 = i2 - i3; i4 > 0; i4--) {
                sb.append('0');
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return;
                        }
                        sb.append((char) ((i / 1000) + 48));
                        i %= 1000;
                    }
                    if (i >= 100) {
                        sb.append((char) ((i / 100) + 48));
                        i %= 100;
                    } else {
                        sb.append('0');
                    }
                }
                if (i >= 10) {
                    sb.append((char) ((i / 10) + 48));
                    i %= 10;
                } else {
                    sb.append('0');
                }
            }
            sb.append((char) (i + 48));
            return;
        }
        char[] cArr = new char[10];
        int i5 = 0;
        while (i != 0) {
            cArr[i5] = (char) ((i % 10) + 48);
            i /= 10;
            i5++;
        }
        while (i5 < i2) {
            sb.append('0');
            i2--;
        }
        while (true) {
            i5--;
            if (i5 < 0) {
                return;
            } else {
                sb.append(cArr[i5]);
            }
        }
    }

    public static String c(TimeZone timeZone, boolean z, int i, Locale locale) {
        w wVar = new w(timeZone, z, i, locale);
        ConcurrentHashMap concurrentHashMap = g;
        String str = (String) concurrentHashMap.get(wVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i, locale);
        String str2 = (String) concurrentHashMap.putIfAbsent(wVar, displayName);
        return str2 != null ? str2 : displayName;
    }

    public static r d(int i, int i2) {
        if (i2 != 1) {
            return i2 != 2 ? new s(i, i2) : new A(i, 0);
        }
        return new A(i, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b = (B) obj;
        return this.a.equals(b.a) && this.b.equals(b.b) && this.c.equals(b.c);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 13) + this.b.hashCode()) * 13) + this.a.hashCode();
    }

    public final String toString() {
        return "FastDatePrinter[" + this.a + "," + this.c + "," + this.b.getID() + "]";
    }
}

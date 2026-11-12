package com.github.catvod.spider.merge.O;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class l extends j {
    public static boolean a(CharSequence charSequence, String str) {
        com.github.catvod.spider.merge.L.a.d(charSequence, "<this>");
        return e(charSequence, str, 0, false, 2) >= 0;
    }

    public static final int b(CharSequence charSequence) {
        com.github.catvod.spider.merge.L.a.d(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int c(CharSequence charSequence, String str, int i, boolean z) {
        com.github.catvod.spider.merge.L.a.d(charSequence, "<this>");
        com.github.catvod.spider.merge.L.a.d(str, "string");
        return (z || !(charSequence instanceof String)) ? d(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int d(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        com.github.catvod.spider.merge.M.a aVar;
        if (z2) {
            int iB = b(charSequence);
            if (i > iB) {
                i = iB;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            aVar = new com.github.catvod.spider.merge.M.a(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            aVar = new com.github.catvod.spider.merge.M.c(i, i2);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = aVar.c;
        int i4 = aVar.b;
        int i5 = aVar.a;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (!i((String) charSequence2, (String) charSequence, i5, ((String) charSequence2).length(), z)) {
                    if (i5 != i4) {
                        i5 += i3;
                    }
                }
                return i5;
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!j(charSequence2, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static /* synthetic */ int e(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c(charSequence, str, i, z);
    }

    public static int f(String str, char c, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        com.github.catvod.spider.merge.L.a.d(str, "<this>");
        if (!z) {
            return str.indexOf(c, 0);
        }
        char[] cArr = {c};
        if (!z) {
            return str.indexOf(cArr[0], 0);
        }
        int iB = b(str);
        if (iB >= 0) {
            int i2 = 0;
            while (!com.github.catvod.spider.merge.l0.b.a(cArr[0], str.charAt(i2), z)) {
                if (i2 != iB) {
                    i2++;
                }
            }
            return i2;
        }
        return -1;
    }

    public static boolean g(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static int h(CharSequence charSequence, String str, int i) {
        int iB = (i & 2) != 0 ? b(charSequence) : 0;
        com.github.catvod.spider.merge.L.a.d(str, "string");
        return !(charSequence instanceof String) ? d(charSequence, str, iB, 0, false, true) : ((String) charSequence).lastIndexOf(str, iB);
    }

    public static final boolean i(String str, String str2, int i, int i2, boolean z) {
        com.github.catvod.spider.merge.L.a.d(str, "<this>");
        com.github.catvod.spider.merge.L.a.d(str2, "other");
        return !z ? str.regionMatches(0, str2, i, i2) : str.regionMatches(z, 0, str2, i, i2);
    }

    public static final boolean j(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        com.github.catvod.spider.merge.L.a.d(charSequence, "<this>");
        com.github.catvod.spider.merge.L.a.d(charSequence2, "other");
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!com.github.catvod.spider.merge.l0.b.a(charSequence.charAt(i3), charSequence2.charAt(i + i3), z)) {
                return false;
            }
        }
        return true;
    }

    public static String k(String str, char c) {
        com.github.catvod.spider.merge.L.a.d(str, "<this>");
        String strReplace = str.replace(c, ' ');
        com.github.catvod.spider.merge.L.a.c(strReplace, "replace(...)");
        return strReplace;
    }

    public static String l(String str, String str2, String str3) {
        com.github.catvod.spider.merge.L.a.d(str, "<this>");
        int iC = c(str, str2, 0, false);
        if (iC < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iC);
            sb.append(str3);
            i2 = iC + length;
            if (iC >= str.length()) {
                break;
            }
            iC = c(str, str2, iC + i, false);
        } while (iC > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        com.github.catvod.spider.merge.L.a.c(string, "toString(...)");
        return string;
    }

    public static final void m(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(com.github.catvod.spider.merge.D.b.e(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static List n(CharSequence charSequence, String[] strArr) {
        com.github.catvod.spider.merge.L.a.d(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                m(0);
                int iC = c(charSequence, str, 0, false);
                if (iC == -1) {
                    return com.github.catvod.spider.merge.G.g.b(charSequence.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                int length = 0;
                do {
                    arrayList.add(charSequence.subSequence(length, iC).toString());
                    length = str.length() + iC;
                    iC = c(charSequence, str, length, false);
                } while (iC != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        m(0);
        List listAsList = Arrays.asList(strArr);
        com.github.catvod.spider.merge.L.a.c(listAsList, "asList(...)");
        c cVar = new c(charSequence, 0, 0, new k(listAsList, false));
        ArrayList arrayList2 = new ArrayList(com.github.catvod.spider.merge.G.h.f(new com.github.catvod.spider.merge.N.a(cVar)));
        Iterator itA = cVar.a();
        while (itA.hasNext()) {
            com.github.catvod.spider.merge.M.c cVar2 = (com.github.catvod.spider.merge.M.c) itA.next();
            com.github.catvod.spider.merge.L.a.d(cVar2, "range");
            arrayList2.add(charSequence.subSequence(cVar2.a, cVar2.b + 1).toString());
        }
        return arrayList2;
    }

    public static String o(String str, String str2, String str3) {
        com.github.catvod.spider.merge.L.a.d(str, "<this>");
        com.github.catvod.spider.merge.L.a.d(str3, "missingDelimiterValue");
        int iE = e(str, str2, 0, false, 6);
        if (iE == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iE, str.length());
        com.github.catvod.spider.merge.L.a.c(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String p(String str, String str2) {
        int iE = e(str, str2, 0, false, 6);
        if (iE == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iE);
        com.github.catvod.spider.merge.L.a.c(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String q(String str, String str2) {
        com.github.catvod.spider.merge.L.a.d(str, "<this>");
        com.github.catvod.spider.merge.L.a.d(str2, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(47, b(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iLastIndexOf);
        com.github.catvod.spider.merge.L.a.c(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String r(String str, String str2) {
        int iH = h(str, str2, 6);
        if (iH == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iH);
        com.github.catvod.spider.merge.L.a.c(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence s(CharSequence charSequence) {
        com.github.catvod.spider.merge.L.a.d(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = charSequence.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String t(String str, char... cArr) {
        com.github.catvod.spider.merge.L.a.d(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z ? i : length);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            boolean z2 = i2 >= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }
}

package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.G.g;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class b {
    public static final String[] a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    public static final Pattern b = Pattern.compile("^/((\\.{1,2}/)+)");
    public static final Pattern c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
    public static final Pattern d = Pattern.compile("[\\x00-\\x1f]*");
    public static final a e = new a();

    public static void a(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13 || iCodePointAt == 160) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (iCodePointAt != 8203 && iCodePointAt != 173) {
                sb.appendCodePoint(iCodePointAt);
                z2 = true;
                z3 = false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public static StringBuilder b() {
        Stack stack = (Stack) e.get();
        return stack.empty() ? new StringBuilder(8192) : (StringBuilder) stack.pop();
    }

    public static boolean c(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean d(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!e(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean e(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    public static String f(String str, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        StringBuilder sbB = b();
        g.e(sbB);
        sbB.append((Object) string);
        while (it.hasNext()) {
            Object next = it.next();
            sbB.append(str);
            sbB.append(next);
        }
        return g(sbB);
    }

    public static String g(StringBuilder sb) {
        g.e(sb);
        String string = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack stack = (Stack) e.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }

    public static URL h(URL url, String str) {
        String strReplaceAll = d.matcher(str).replaceAll("");
        if (strReplaceAll.startsWith("?")) {
            strReplaceAll = url.getPath() + strReplaceAll;
        }
        URL url2 = new URL(url, strReplaceAll);
        String strReplaceFirst = b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strReplaceFirst, "#");
            sbP.append(url2.getRef());
            strReplaceFirst = sbP.toString();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }
}

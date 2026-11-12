package com.github.catvod.spider.merge.Y;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class c {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static boolean a(CharSequence... charSequenceArr) {
        if (Array.getLength(charSequenceArr) == 0) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (e(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean d(CharSequence... charSequenceArr) {
        boolean z = false;
        if (!(Array.getLength(charSequenceArr) == 0)) {
            for (CharSequence charSequence : charSequenceArr) {
                if (b(charSequence)) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    public static boolean e(CharSequence charSequence) {
        return !b(charSequence);
    }

    public static String f(Iterable iterable, String str) {
        Iterator it;
        if (iterable == null || (it = iterable.iterator()) == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            sb.append(str);
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public static String g(String str, String str2) {
        return (c(str) || c(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }
}

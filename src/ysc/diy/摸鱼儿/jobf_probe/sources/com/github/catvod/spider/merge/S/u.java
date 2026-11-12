package com.github.catvod.spider.merge.S;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class u implements t {
    public static final String[] d;
    public static final u e;
    public final String[] a;
    public final String[] b;
    public final String[] c;

    static {
        String[] strArr = new String[0];
        d = strArr;
        e = new u(strArr, strArr, strArr);
    }

    public u(String[] strArr, String[] strArr2, String[] strArr3) {
        String[] strArr4 = d;
        this.a = strArr;
        this.b = strArr2;
        strArr3 = strArr3 == null ? strArr4 : strArr3;
        this.c = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final String a(int i) {
        String str;
        String str2;
        if (i >= 0) {
            String[] strArr = this.c;
            if (i < strArr.length && (str2 = strArr[i]) != null) {
                return str2;
            }
        }
        if (i >= 0) {
            String[] strArr2 = this.a;
            if (i < strArr2.length) {
                str = strArr2[i];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        String strB = b(i);
        return strB != null ? strB : Integer.toString(i);
    }

    public final String b(int i) {
        if (i >= 0) {
            String[] strArr = this.b;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        if (i == -1) {
            return "EOF";
        }
        return null;
    }
}

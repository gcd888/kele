package com.github.catvod.spider.merge.f0;

import com.github.catvod.spider.merge.p022z.X3;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class m {
    public static final char[] a = {',', ';'};
    public static final HashMap b = new HashMap();

    static {
        l lVar = l.xhtml;
        Charset charset = com.github.catvod.spider.merge.d0.a.a;
        new ThreadLocal();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public static void a(Appendable appendable, l lVar, int i) throws IOException {
        String str;
        int iBinarySearch = Arrays.binarySearch(lVar.c, i);
        if (iBinarySearch >= 0) {
            String[] strArr = lVar.d;
            if (iBinarySearch < strArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (lVar.c[i2] == i) {
                    str = strArr[i2];
                } else {
                    str = strArr[iBinarySearch];
                }
            } else {
                str = strArr[iBinarySearch];
            }
        } else {
            str = "";
        }
        if ("".equals(str)) {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        } else {
            appendable.append('&').append(str).append(';');
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    public static void b(Appendable appendable, String str, f fVar, boolean z, boolean z2, boolean z3, boolean z4) throws IOException {
        String str2;
        char c;
        l lVar = fVar.a;
        CharsetEncoder charsetEncoderB = (CharsetEncoder) fVar.c.get();
        if (charsetEncoderB == null) {
            charsetEncoderB = fVar.b();
        }
        int i = fVar.d;
        int length = str.length();
        int iCharCount = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            boolean zCanEncode = true;
            if (z2) {
                if (!com.github.catvod.spider.merge.e0.b.e(iCodePointAt)) {
                    if (z5) {
                        appendable.append(' ');
                        z5 = false;
                    }
                    z6 = true;
                    z7 = false;
                    if (iCodePointAt < 65536) {
                        c = (char) iCodePointAt;
                        if (c != '\t') {
                            appendable.append(c);
                        } else {
                            appendable.append(c);
                        }
                    } else {
                        str2 = new String(Character.toChars(iCodePointAt));
                        if (charsetEncoderB.canEncode(str2)) {
                            appendable.append(str2);
                        } else {
                            a(appendable, lVar, iCodePointAt);
                        }
                    }
                } else if ((!z3 || z6) && !z7) {
                    if (z4) {
                        z5 = true;
                    } else {
                        appendable.append(' ');
                        z7 = true;
                    }
                }
            } else if (iCodePointAt < 65536) {
                c = (char) iCodePointAt;
                if (c != '\t' || c == '\n' || c == '\r') {
                    appendable.append(c);
                } else if (c != '\"') {
                    if (c == '&') {
                        appendable.append("&amp;");
                    } else if (c != '<') {
                        if (c != '>') {
                            if (c != 160) {
                                if (c < ' ') {
                                    a(appendable, lVar, iCodePointAt);
                                } else {
                                    int iA = X3.a(i);
                                    if (iA != 0) {
                                        if (iA != 1) {
                                            zCanEncode = charsetEncoderB.canEncode(c);
                                        }
                                    } else if (c >= 128) {
                                        zCanEncode = false;
                                    }
                                    if (zCanEncode) {
                                        appendable.append(c);
                                    } else {
                                        a(appendable, lVar, iCodePointAt);
                                    }
                                }
                            } else if (lVar != l.xhtml) {
                                appendable.append("&nbsp;");
                            } else {
                                appendable.append("&#xa0;");
                            }
                        } else if (z) {
                            appendable.append(c);
                        } else {
                            appendable.append("&gt;");
                        }
                    } else if (!z || lVar == l.xhtml || fVar.h == 2) {
                        appendable.append("&lt;");
                    } else {
                        appendable.append(c);
                    }
                } else if (z) {
                    appendable.append("&quot;");
                } else {
                    appendable.append(c);
                }
            } else {
                str2 = new String(Character.toChars(iCodePointAt));
                if (charsetEncoderB.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    a(appendable, lVar, iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}

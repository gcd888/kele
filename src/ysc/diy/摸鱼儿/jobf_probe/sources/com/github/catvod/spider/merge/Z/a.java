package com.github.catvod.spider.merge.Z;

import com.github.catvod.spider.merge.Y.c;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a {
    public static volatile b d = b.p;
    public final StringBuffer a;
    public final Object b;
    public final b c;

    public a(Object obj) {
        b bVar = d;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.a = stringBuffer;
        this.c = bVar;
        this.b = obj;
        if (obj == null) {
            bVar.getClass();
            return;
        }
        if (bVar.b) {
            b.i(obj);
            stringBuffer.append(obj.getClass().getName());
        }
        if (bVar.c) {
            b.i(obj);
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        stringBuffer.append(bVar.d);
        if (bVar.g) {
            stringBuffer.append(bVar.h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        boolean zRegionMatches = true;
        b bVar = this.c;
        StringBuffer stringBuffer = this.a;
        Object obj = this.b;
        if (obj == null) {
            stringBuffer.append(bVar.k);
        } else {
            String str = bVar.h;
            int i = c.a;
            boolean z = false;
            if (stringBuffer == 0 || str == null) {
                if (stringBuffer != str) {
                    zRegionMatches = false;
                    break;
                }
                z = zRegionMatches;
            } else if (str.length() <= stringBuffer.length()) {
                int length = stringBuffer.length() - str.length();
                int length2 = str.length();
                int i2 = 0;
                if (!(stringBuffer instanceof String) || !(str instanceof String)) {
                    int length3 = stringBuffer.length() - length;
                    int length4 = str.length();
                    if (length >= 0 && length2 >= 0 && length3 >= length2 && length4 >= length2) {
                        while (true) {
                            int i3 = length2 - 1;
                            if (length2 <= 0) {
                                break;
                            }
                            int i4 = length + 1;
                            int i5 = i2 + 1;
                            if (stringBuffer.charAt(length) != str.charAt(i2)) {
                                zRegionMatches = false;
                                break;
                            }
                            length = i4;
                            i2 = i5;
                            length2 = i3;
                        }
                    } else {
                        zRegionMatches = false;
                        break;
                    }
                } else {
                    zRegionMatches = ((String) stringBuffer).regionMatches(false, length, str, 0, length2);
                }
                z = zRegionMatches;
            }
            if (z) {
                stringBuffer.setLength(stringBuffer.length() - bVar.h.length());
            }
            stringBuffer.append(bVar.e);
            b.j(obj);
        }
        return stringBuffer.toString();
    }
}

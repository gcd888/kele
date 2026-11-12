package com.github.catvod.spider.merge.X;

import java.util.Arrays;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class c {
    public static final byte[] e = {13, 10};
    public final byte a;
    public final int b;
    public final int c;
    public final int d;

    public c(int i, int i2) {
        this.b = (i <= 0 || i2 <= 0) ? 0 : (i / 4) * 4;
        this.c = i2;
        this.a = (byte) 61;
        this.d = 2;
    }

    public static byte[] a(int i, b bVar) {
        byte[] bArr = bVar.b;
        if (bArr == null) {
            bVar.b = new byte[Math.max(i, 8192)];
            bVar.c = 0;
            bVar.d = 0;
        } else {
            int i2 = bVar.c + i;
            if (i2 - bArr.length > 0) {
                int length = bArr.length * 2;
                if (Integer.compare(length ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0) {
                    length = i2;
                }
                if (Integer.compare(Integer.MIN_VALUE ^ length, -9) > 0) {
                    if (i2 < 0) {
                        throw new OutOfMemoryError("Unable to allocate array size: " + (((long) i2) & 4294967295L));
                    }
                    length = Math.max(i2, 2147483639);
                }
                byte[] bArrCopyOf = Arrays.copyOf(bVar.b, length);
                bVar.b = bArrCopyOf;
                return bArrCopyOf;
            }
        }
        return bVar.b;
    }

    public static void b(byte[] bArr, int i, b bVar) {
        int i2 = bVar.c;
        int i3 = bVar.d;
        if (i2 > i3) {
            int iMin = Math.min(i2 > i3 ? i2 - i3 : 0, i);
            System.arraycopy(bVar.b, bVar.d, bArr, 0, iMin);
            int i4 = bVar.d + iMin;
            bVar.d = i4;
            if (bVar.c > i4) {
                return;
            }
            bVar.d = 0;
            bVar.c = 0;
        }
    }
}

package com.github.catvod.spider.merge.X;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a extends c {
    public static final byte[] j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] k = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, byte[] bArr) {
        super(i, bArr.length);
        byte[] bArr2 = j;
        if (bArr2.length != 64) {
            throw new IllegalArgumentException("encodeTable must have exactly 64 entries.");
        }
        this.g = k;
        this.f = bArr2;
        byte[] bArr3 = (byte[]) bArr.clone();
        for (byte b : bArr3) {
            if (this.a != b) {
                if (b >= 0) {
                    byte[] bArr4 = this.g;
                    if (b >= bArr4.length || bArr4[b] == -1) {
                    }
                }
            }
            throw new IllegalArgumentException(com.github.catvod.spider.merge.D.b.j("lineSeparator must not contain base64 characters: [", new String(bArr3, StandardCharsets.UTF_8), "]"));
        }
        if (i > 0) {
            this.i = bArr3.length + 4;
            this.h = bArr3;
        } else {
            this.i = 4;
            this.h = null;
        }
    }

    public static String e(byte[] bArr) {
        if (bArr.length != 0) {
            a aVar = new a(0, c.e);
            long length = ((long) ((bArr.length + 2) / 3)) * ((long) 4);
            int i = aVar.b;
            if (i > 0) {
                long j2 = i;
                length += (((length + j2) - 1) / j2) * ((long) aVar.c);
            }
            if (length > Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + length + ") than the specified maximum size of 2147483647");
            }
            if (bArr.length != 0) {
                int length2 = bArr.length;
                if (bArr.length != 0) {
                    b bVar = new b();
                    aVar.d(bArr, length2, bVar);
                    aVar.d(bArr, -1, bVar);
                    int i2 = bVar.c - bVar.d;
                    byte[] bArr2 = new byte[i2];
                    c.b(bArr2, i2, bVar);
                    bArr = bArr2;
                }
            }
        }
        return new String(bArr, StandardCharsets.US_ASCII);
    }

    public final void c(byte[] bArr, int i, b bVar) {
        byte b;
        if (bVar.e) {
            return;
        }
        if (i < 0) {
            bVar.e = true;
        }
        int i2 = this.i - 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            byte[] bArrA = c.a(i2, bVar);
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 == this.a) {
                bVar.e = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = this.g;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i6 = (bVar.g + 1) % 4;
                    bVar.g = i6;
                    int i7 = (bVar.a << 6) + b;
                    bVar.a = i7;
                    if (i6 == 0) {
                        int i8 = bVar.c;
                        bArrA[i8] = (byte) ((i7 >> 16) & 255);
                        bArrA[i8 + 1] = (byte) ((i7 >> 8) & 255);
                        bVar.c = i8 + 3;
                        bArrA[i8 + 2] = (byte) (i7 & 255);
                    }
                }
            }
            i3++;
            i4 = i5;
        }
        if (!bVar.e || bVar.g == 0) {
            return;
        }
        byte[] bArrA2 = c.a(i2, bVar);
        int i9 = bVar.g;
        int i10 = this.d;
        if (i9 == 1) {
            if (i10 == 1) {
                throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
            }
            return;
        }
        if (i9 == 2) {
            if (i10 == 1 && (bVar.a & 15) != 0) {
                throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
            }
            int i11 = bVar.a >> 4;
            bVar.a = i11;
            int i12 = bVar.c;
            bVar.c = i12 + 1;
            bArrA2[i12] = (byte) (i11 & 255);
            return;
        }
        if (i9 != 3) {
            throw new IllegalStateException("Impossible modulus " + bVar.g);
        }
        if (i10 == 1 && (bVar.a & 3) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
        int i13 = bVar.a;
        int i14 = i13 >> 2;
        bVar.a = i14;
        int i15 = bVar.c;
        bArrA2[i15] = (byte) ((i13 >> 10) & 255);
        bVar.c = i15 + 2;
        bArrA2[i15 + 1] = (byte) (i14 & 255);
    }

    public final void d(byte[] bArr, int i, b bVar) {
        if (bVar.e) {
            return;
        }
        int i2 = this.i;
        byte[] bArr2 = this.f;
        int i3 = this.b;
        byte[] bArr3 = this.h;
        if (i >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i) {
                byte[] bArrA = c.a(i2, bVar);
                int i6 = (bVar.g + 1) % 3;
                bVar.g = i6;
                int i7 = i5 + 1;
                int i8 = bArr[i5];
                if (i8 < 0) {
                    i8 += 256;
                }
                int i9 = (bVar.a << 8) + i8;
                bVar.a = i9;
                if (i6 == 0) {
                    int i10 = bVar.c;
                    bArrA[i10] = bArr2[(i9 >> 18) & 63];
                    bArrA[i10 + 1] = bArr2[(i9 >> 12) & 63];
                    int i11 = i10 + 3;
                    bArrA[i10 + 2] = bArr2[(i9 >> 6) & 63];
                    int i12 = i10 + 4;
                    bVar.c = i12;
                    bArrA[i11] = bArr2[i9 & 63];
                    int i13 = bVar.f + 4;
                    bVar.f = i13;
                    if (i3 > 0 && i3 <= i13) {
                        System.arraycopy(bArr3, 0, bArrA, i12, bArr3.length);
                        bVar.c += bArr3.length;
                        bVar.f = 0;
                    }
                }
                i4++;
                i5 = i7;
            }
            return;
        }
        bVar.e = true;
        if (bVar.g == 0 && i3 == 0) {
            return;
        }
        byte[] bArrA2 = c.a(i2, bVar);
        int i14 = bVar.c;
        int i15 = bVar.g;
        if (i15 != 0) {
            byte[] bArr4 = j;
            byte b = this.a;
            if (i15 == 1) {
                int i16 = bVar.a;
                bArrA2[i14] = bArr2[(i16 >> 2) & 63];
                int i17 = i14 + 2;
                bVar.c = i17;
                bArrA2[i14 + 1] = bArr2[(i16 << 4) & 63];
                if (bArr2 == bArr4) {
                    bArrA2[i17] = b;
                    bVar.c = i14 + 4;
                    bArrA2[i14 + 3] = b;
                }
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("Impossible modulus " + bVar.g);
                }
                int i18 = bVar.a;
                bArrA2[i14] = bArr2[(i18 >> 10) & 63];
                bArrA2[i14 + 1] = bArr2[(i18 >> 4) & 63];
                int i19 = i14 + 3;
                bVar.c = i19;
                bArrA2[i14 + 2] = bArr2[(i18 << 2) & 63];
                if (bArr2 == bArr4) {
                    bVar.c = i14 + 4;
                    bArrA2[i19] = b;
                }
            }
        }
        int i20 = bVar.f;
        int i21 = bVar.c;
        int i22 = (i21 - i14) + i20;
        bVar.f = i22;
        if (i3 <= 0 || i22 <= 0) {
            return;
        }
        System.arraycopy(bArr3, 0, bArrA2, i21, bArr3.length);
        bVar.c += bArr3.length;
    }
}

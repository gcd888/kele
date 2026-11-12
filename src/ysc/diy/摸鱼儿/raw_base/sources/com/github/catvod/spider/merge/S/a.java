package com.github.catvod.spider.merge.S;

import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0585w2;
import com.github.catvod.spider.merge.p022z.C0590x2;
import com.github.catvod.spider.merge.p022z.C2;
import com.github.catvod.spider.merge.p022z.InterfaceC0578v0;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a implements InterfaceC0578v0 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public a(String str, String str2, String str3, String str4, ArrayList arrayList) {
        int color;
        ArrayList arrayList2;
        int i;
        Handler handler = C2.a;
        this.c = (str == null || str.length() == 0) ? "公告" : str;
        this.d = (str2 == null || str2.length() == 0) ? "我已知晓" : str2;
        int color2 = AbstractC0583w0.c;
        try {
            color = (TextUtils.isEmpty(str3) || !str3.matches("^#[0-9a-fA-F]{6}$")) ? color2 : Color.parseColor(str3);
        } catch (Throwable unused) {
        }
        this.a = color;
        try {
            if (!TextUtils.isEmpty(str4) && str4.matches("^#[0-9a-fA-F]{6}$")) {
                color2 = Color.parseColor(str4);
            }
        } catch (Throwable unused2) {
        }
        this.b = color2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0590x2 c0590x2 = (C0590x2) it.next();
            if (c0590x2 != null) {
                ArrayList arrayList4 = c0590x2.a;
                if (!arrayList4.isEmpty()) {
                    C0590x2 c0590x3 = new C0590x2();
                    Iterator it2 = arrayList4.iterator();
                    while (true) {
                        boolean zHasNext = it2.hasNext();
                        arrayList2 = c0590x3.a;
                        if (!zHasNext) {
                            break;
                        }
                        C0585w2 c0585w2 = (C0585w2) it2.next();
                        if (c0585w2 != null && ((i = c0585w2.a) != 0 || !TextUtils.isEmpty(c0585w2.b))) {
                            if (i != 1 || !TextUtils.isEmpty(c0585w2.c)) {
                                arrayList2.add(c0585w2);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList3.add(c0590x3);
                    }
                }
            }
        }
        if (arrayList3.isEmpty()) {
            C0590x2 c0590x4 = new C0590x2();
            c0590x4.a.add(new C0585w2(0, "公告", "", ""));
            arrayList3.add(c0590x4);
        }
        this.e = arrayList3;
    }

    public static int c(int i) {
        return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public void a(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        char[] cArrArray2 = ((CharBuffer) this.d).array();
        int iPosition2 = ((CharBuffer) this.d).position() + ((CharBuffer) this.d).arrayOffset();
        while (iPosition < iLimit) {
            char c = cArrArray[iPosition];
            if (Character.isHighSurrogate(c)) {
                charBuffer.position(iPosition - charBuffer.arrayOffset());
                CharBuffer charBuffer2 = (CharBuffer) this.d;
                charBuffer2.position(iPosition2 - charBuffer2.arrayOffset());
                int iRemaining = charBuffer.remaining();
                ((CharBuffer) this.d).flip();
                IntBuffer intBufferAllocate = IntBuffer.allocate(Math.max(((CharBuffer) this.d).remaining() + iRemaining, ((CharBuffer) this.d).capacity() / 2));
                while (((CharBuffer) this.d).hasRemaining()) {
                    intBufferAllocate.put(((CharBuffer) this.d).get() & 65535);
                }
                this.a = 3;
                this.d = null;
                this.e = intBufferAllocate;
                b(charBuffer);
                return;
            }
            cArrArray2[iPosition2] = c;
            iPosition++;
            iPosition2++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        CharBuffer charBuffer3 = (CharBuffer) this.d;
        charBuffer3.position(iPosition2 - charBuffer3.arrayOffset());
    }

    public void b(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        int[] iArrArray = ((IntBuffer) this.e).array();
        int iPosition2 = ((IntBuffer) this.e).position() + ((IntBuffer) this.e).arrayOffset();
        while (iPosition < iLimit) {
            char c = cArrArray[iPosition];
            iPosition++;
            if (this.b != -1) {
                if (Character.isLowSurrogate(c)) {
                    iArrArray[iPosition2] = Character.toCodePoint((char) this.b, c);
                    iPosition2++;
                    this.b = -1;
                } else {
                    iArrArray[iPosition2] = this.b;
                    int i = iPosition2 + 1;
                    if (Character.isHighSurrogate(c)) {
                        this.b = c & 65535;
                        iPosition2 = i;
                    } else {
                        iArrArray[i] = 65535 & c;
                        iPosition2 += 2;
                        this.b = -1;
                    }
                }
            } else if (Character.isHighSurrogate(c)) {
                this.b = c & 65535;
            } else {
                iArrArray[iPosition2] = c & 65535;
                iPosition2++;
            }
        }
        int i2 = this.b;
        if (i2 != -1) {
            iArrArray[iPosition2] = i2 & 65535;
            iPosition2++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        IntBuffer intBuffer = (IntBuffer) this.e;
        intBuffer.position(iPosition2 - intBuffer.arrayOffset());
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0578v0
    public void g(int i, boolean z) {
        View[] viewArr = (View[]) this.e;
        boolean[] zArr = (boolean[]) this.d;
        int i2 = this.a;
        if (!z) {
            zArr[i2] = true;
            AbstractC0583w0.S(viewArr[i2]);
            return;
        }
        ((int[]) this.c)[0] = i2;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (i3 != i2 && zArr[i3]) {
                zArr[i3] = false;
                AbstractC0583w0.S(viewArr[i3]);
            }
        }
    }

    public a(int i) {
        this.a = 1;
        this.c = ByteBuffer.allocate(i);
        this.d = null;
        this.e = null;
        this.b = -1;
    }

    public a(int[] iArr, int i, int i2, boolean[] zArr, View[] viewArr) {
        this.c = iArr;
        this.a = i;
        this.b = i2;
        this.d = zArr;
        this.e = viewArr;
    }
}

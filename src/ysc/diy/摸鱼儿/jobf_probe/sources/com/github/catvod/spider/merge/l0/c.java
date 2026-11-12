package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.A.C0241a1;
import com.github.catvod.spider.merge.p022z.X3;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class c {
    public static com.github.catvod.spider.merge.S.b a(String str) {
        com.github.catvod.spider.merge.S.a aVar = new com.github.catvod.spider.merge.S.a(str.length());
        CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
        charBufferAllocate.put(str);
        charBufferAllocate.flip();
        int iRemaining = charBufferAllocate.remaining();
        int iA = X3.a(aVar.a);
        if (iA != 0) {
            if (iA != 1) {
                if (iA == 2 && ((IntBuffer) aVar.e).remaining() < iRemaining) {
                    IntBuffer intBufferAllocate = IntBuffer.allocate(com.github.catvod.spider.merge.S.a.c(((IntBuffer) aVar.e).capacity() + iRemaining));
                    ((IntBuffer) aVar.e).flip();
                    intBufferAllocate.put((IntBuffer) aVar.e);
                    aVar.e = intBufferAllocate;
                }
            } else if (((CharBuffer) aVar.d).remaining() < iRemaining) {
                CharBuffer charBufferAllocate2 = CharBuffer.allocate(com.github.catvod.spider.merge.S.a.c(((CharBuffer) aVar.d).capacity() + iRemaining));
                ((CharBuffer) aVar.d).flip();
                charBufferAllocate2.put((CharBuffer) aVar.d);
                aVar.d = charBufferAllocate2;
            }
        } else if (((ByteBuffer) aVar.c).remaining() < iRemaining) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(com.github.catvod.spider.merge.S.a.c(((ByteBuffer) aVar.c).capacity() + iRemaining));
            ((ByteBuffer) aVar.c).flip();
            byteBufferAllocate.put((ByteBuffer) aVar.c);
            aVar.c = byteBufferAllocate;
        }
        if (!charBufferAllocate.hasArray()) {
            throw new UnsupportedOperationException("TODO");
        }
        int iA2 = X3.a(aVar.a);
        if (iA2 == 0) {
            char[] cArrArray = charBufferAllocate.array();
            int iPosition = charBufferAllocate.position() + charBufferAllocate.arrayOffset();
            int iLimit = charBufferAllocate.limit() + charBufferAllocate.arrayOffset();
            byte[] bArrArray = ((ByteBuffer) aVar.c).array();
            int iPosition2 = ((ByteBuffer) aVar.c).position() + ((ByteBuffer) aVar.c).arrayOffset();
            while (true) {
                if (iPosition < iLimit) {
                    char c = cArrArray[iPosition];
                    if (c > 255) {
                        charBufferAllocate.position(iPosition - charBufferAllocate.arrayOffset());
                        ByteBuffer byteBuffer = (ByteBuffer) aVar.c;
                        byteBuffer.position(iPosition2 - byteBuffer.arrayOffset());
                        if (!Character.isHighSurrogate(c)) {
                            int iRemaining2 = charBufferAllocate.remaining();
                            ((ByteBuffer) aVar.c).flip();
                            CharBuffer charBufferAllocate3 = CharBuffer.allocate(Math.max(((ByteBuffer) aVar.c).remaining() + iRemaining2, ((ByteBuffer) aVar.c).capacity() / 2));
                            while (((ByteBuffer) aVar.c).hasRemaining()) {
                                charBufferAllocate3.put((char) (((ByteBuffer) aVar.c).get() & 255));
                            }
                            aVar.a = 2;
                            aVar.c = null;
                            aVar.d = charBufferAllocate3;
                            aVar.a(charBufferAllocate);
                            break;
                        }
                        int iRemaining3 = charBufferAllocate.remaining();
                        ((ByteBuffer) aVar.c).flip();
                        IntBuffer intBufferAllocate2 = IntBuffer.allocate(Math.max(((ByteBuffer) aVar.c).remaining() + iRemaining3, ((ByteBuffer) aVar.c).capacity() / 4));
                        while (((ByteBuffer) aVar.c).hasRemaining()) {
                            intBufferAllocate2.put(((ByteBuffer) aVar.c).get() & 255);
                        }
                        aVar.a = 3;
                        aVar.c = null;
                        aVar.e = intBufferAllocate2;
                        aVar.b(charBufferAllocate);
                        break;
                    }
                    bArrArray[iPosition2] = (byte) (c & 255);
                    iPosition++;
                    iPosition2++;
                } else {
                    charBufferAllocate.position(iPosition - charBufferAllocate.arrayOffset());
                    ByteBuffer byteBuffer2 = (ByteBuffer) aVar.c;
                    byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
                    break;
                }
            }
        } else if (iA2 == 1) {
            aVar.a(charBufferAllocate);
        } else if (iA2 == 2) {
            aVar.b(charBufferAllocate);
        }
        int iA3 = X3.a(aVar.a);
        if (iA3 == 0) {
            ((ByteBuffer) aVar.c).flip();
        } else if (iA3 == 1) {
            ((CharBuffer) aVar.d).flip();
        } else if (iA3 == 2) {
            ((IntBuffer) aVar.e).flip();
        }
        int i = aVar.a;
        ByteBuffer byteBuffer3 = (ByteBuffer) aVar.c;
        CharBuffer charBuffer = (CharBuffer) aVar.d;
        IntBuffer intBuffer = (IntBuffer) aVar.e;
        C0241a1 c0241a1 = new C0241a1(i, byteBuffer3, charBuffer, intBuffer);
        int iA4 = X3.a(i);
        if (iA4 == 0) {
            int iB = c0241a1.b();
            int iC = c0241a1.c();
            byte[] bArrArray2 = byteBuffer3.array();
            c0241a1.a();
            return new com.github.catvod.spider.merge.S.b(iB, iC, bArrArray2, 2);
        }
        if (iA4 == 1) {
            int iB2 = c0241a1.b();
            int iC2 = c0241a1.c();
            char[] cArrArray2 = charBuffer.array();
            c0241a1.a();
            return new com.github.catvod.spider.merge.S.b(iB2, iC2, cArrArray2, 0);
        }
        if (iA4 != 2) {
            throw new UnsupportedOperationException("Not reached");
        }
        int iB3 = c0241a1.b();
        int iC3 = c0241a1.c();
        int[] iArrArray = intBuffer.array();
        c0241a1.a();
        return new com.github.catvod.spider.merge.S.b(iB3, iC3, iArrArray, 1);
    }
}

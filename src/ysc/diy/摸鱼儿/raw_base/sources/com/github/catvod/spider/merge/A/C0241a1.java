package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.p022z.X3;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0241a1 {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public C0241a1(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.a = i;
        this.b = byteBuffer;
        this.c = charBuffer;
        this.d = intBuffer;
    }

    public int a() {
        int iA = X3.a(this.a);
        if (iA == 0) {
            return ((ByteBuffer) this.b).arrayOffset();
        }
        if (iA == 1) {
            return ((CharBuffer) this.c).arrayOffset();
        }
        if (iA == 2) {
            return ((IntBuffer) this.d).arrayOffset();
        }
        throw new UnsupportedOperationException("Not reached");
    }

    public int b() {
        int iA = X3.a(this.a);
        if (iA == 0) {
            return ((ByteBuffer) this.b).position();
        }
        if (iA == 1) {
            return ((CharBuffer) this.c).position();
        }
        if (iA == 2) {
            return ((IntBuffer) this.d).position();
        }
        throw new UnsupportedOperationException("Not reached");
    }

    public int c() {
        int iA = X3.a(this.a);
        if (iA == 0) {
            return ((ByteBuffer) this.b).remaining();
        }
        if (iA == 1) {
            return ((CharBuffer) this.c).remaining();
        }
        if (iA == 2) {
            return ((IntBuffer) this.d).remaining();
        }
        throw new UnsupportedOperationException("Not reached");
    }

    public C0241a1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        Pattern pattern = AbstractC0244b1.a;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = AbstractC0244b1.e(arrayList).iterator();
        while (it.hasNext()) {
            String strL = AbstractC0244b1.l((String) it.next());
            if (!AbstractC0244b1.j(strL) && !arrayList4.contains(strL)) {
                arrayList4.add(strL);
            }
        }
        this.b = arrayList4;
        this.c = AbstractC0244b1.e(arrayList2);
        this.d = AbstractC0244b1.e(arrayList3);
        this.a = i <= 0 ? Integer.MAX_VALUE : i;
    }

    public C0241a1(int i, String str, String str2, String str3) {
        this.b = com.github.catvod.spider.merge.p000a.T.f(str);
        this.c = com.github.catvod.spider.merge.p000a.T.f(str2);
        this.a = Math.max(0, i);
        this.d = com.github.catvod.spider.merge.p000a.T.f(str3);
    }
}

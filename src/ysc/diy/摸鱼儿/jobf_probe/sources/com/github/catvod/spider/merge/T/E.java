package com.github.catvod.spider.merge.T;

import java.util.EmptyStackException;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class E implements InterfaceC0338x {
    public static final E b = new E(0);
    public static final E c = new E(1);
    public static final E d = new E(2);
    public final /* synthetic */ int a;

    public /* synthetic */ E(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.T.InterfaceC0338x
    public final boolean a() {
        switch (this.a) {
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.T.InterfaceC0338x
    public final void b(com.github.catvod.spider.merge.S.j jVar) {
        switch (this.a) {
            case 0:
                jVar.m = -2;
                return;
            case 1:
                com.github.catvod.spider.merge.V.d dVar = jVar.n;
                int i = dVar.b;
                if (i == 0) {
                    throw new EmptyStackException();
                }
                int i2 = i - 1;
                if (i2 < 0 || i2 >= i) {
                    throw new IndexOutOfBoundsException();
                }
                int[] iArr = dVar.a;
                int i3 = iArr[i2];
                System.arraycopy(iArr, i, iArr, i2, (i - i2) - 1);
                int[] iArr2 = dVar.a;
                int i4 = dVar.b - 1;
                iArr2[i4] = 0;
                dVar.b = i4;
                jVar.o = i3;
                return;
            default:
                jVar.m = -3;
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return obj == this;
            case 1:
                return obj == this;
            default:
                return obj == this;
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.b(0, 3), 1);
            case 1:
                return com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.b(0, 4), 1);
            default:
                return com.github.catvod.spider.merge.l0.e.a(com.github.catvod.spider.merge.l0.e.b(0, 6), 1);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "more";
            case 1:
                return "popMode";
            default:
                return "skip";
        }
    }
}

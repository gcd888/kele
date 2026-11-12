package com.github.catvod.spider.merge.V;

import com.github.catvod.spider.merge.T.C0319d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a implements Iterator {
    public final Object[] a;
    public int b = 0;
    public boolean c = true;
    public final /* synthetic */ C0319d d;

    public a(C0319d c0319d, Object[] objArr) {
        this.d = c0319d;
        this.a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c = false;
        int i = this.b;
        this.b = i + 1;
        return this.a[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            throw new IllegalStateException();
        }
        this.d.remove(this.a[this.b - 1]);
        this.c = true;
    }
}

package com.github.catvod.spider.merge.G;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class c extends b implements ListIterator {
    public final /* synthetic */ e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i) {
        super(eVar);
        this.d = eVar;
        int iA = eVar.a();
        if (i >= 0 && i <= iA) {
            this.b = i;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + iA);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

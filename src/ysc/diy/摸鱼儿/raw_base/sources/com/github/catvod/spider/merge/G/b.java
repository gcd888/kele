package com.github.catvod.spider.merge.G;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class b implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Iterable c;

    public b(e eVar) {
        this.a = 0;
        this.c = eVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.github.catvod.spider.merge.f0.b bVar;
        switch (this.a) {
            case 0:
                return this.b < ((e) this.c).a();
        }
        while (true) {
            int i = this.b;
            bVar = (com.github.catvod.spider.merge.f0.b) this.c;
            if (i < bVar.a && com.github.catvod.spider.merge.f0.b.i(bVar.b[i])) {
                this.b++;
            }
        }
        return this.b < bVar.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.b;
                this.b = i + 1;
                return ((e) this.c).get(i);
            default:
                com.github.catvod.spider.merge.f0.b bVar = (com.github.catvod.spider.merge.f0.b) this.c;
                String[] strArr = bVar.b;
                int i2 = this.b;
                com.github.catvod.spider.merge.f0.a aVar = new com.github.catvod.spider.merge.f0.a(strArr[i2], (String) bVar.c[i2], bVar);
                this.b++;
                return aVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i = this.b - 1;
                this.b = i;
                ((com.github.catvod.spider.merge.f0.b) this.c).l(i);
                return;
        }
    }

    public b(com.github.catvod.spider.merge.f0.b bVar) {
        this.a = 1;
        this.c = bVar;
        this.b = 0;
    }
}
